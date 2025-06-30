package com.example.servingwebcontent.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.servingwebcontent.model.UserList;
import com.example.servingwebcontent.model.User;
import com.mysql.cj.jdbc.result.ResultSetMetaData;

@Service
public class userAiven {

    @Autowired
    private myConnection myConnection;

    public ArrayList<User> userAivenList() {
        ArrayList<User> items = new ArrayList<>();
        try (Connection conn = myConnection.getConnection();
             Statement sta = conn.createStatement();
             ResultSet setdata = sta.executeQuery("SELECT * FROM Users")) {

            while (setdata.next()) {
                User user = new User();
                user.setUserId(setdata.getString("userID"));
                user.setName(setdata.getString("name"));
                user.setAddress(setdata.getString("address"));

                items.add(user);
            }

        } catch (Exception e) {
            System.out.println("Error in database connection:");
            e.printStackTrace();
        }

        return items;
    }
}

