package com.example.servingwebcontent.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.servingwebcontent.model.User;

import java.lang.System;

@Service 
public class insertToAiven {
    @Autowired
    private myConnection myConnection;

    public void insertToAivenDb(User u) {
        System.out.println(
                String.format("The current shell is: %s.", System.getenv("port")));
        try {
            Connection conn = myConnection.getConnection();

            // random userID
            Random rand = new Random();
            int id = rand.nextInt(1000);
            String userIdVal = "u" + id;
            String ur = u.getName();
            String ad = u.getAddress();

            String reset = "INSERT INTO user(userId, username, address) VALUES(?, ?, ?)";
            try (
                PreparedStatement pst = conn.prepareStatement(reset)) {
                pst.setString(1, userIdVal);
                pst.setString(2, ur);
                pst.setString(3, ad);
                pst.executeUpdate();
                System.out.println("Insert successful: " + userIdVal + ", " + ur + ", " + ad);
            }
            System.out.println("Display data from database: ");

            conn.close();
        } catch (Exception e) {
            System.out.println("Error in database connecion");
            System.out.println(e);
            e.printStackTrace();
        }
    }

}
