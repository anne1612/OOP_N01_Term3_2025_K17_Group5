package com.example.servingwebcontent.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
//import java.util.List;

import com.example.servingwebcontent.model.UserList;
import com.example.servingwebcontent.model.User;
import com.mysql.cj.jdbc.result.ResultSetMetaData;


public class userAiven {

    ArrayList<User> items = new ArrayList<User>(); 
    //User user = new User();

    /**
     * @return
     */
    public ArrayList<User> userAivenList() {
      
        Connection conn = null;
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://avnadmin:AVNS_PYuUDx9qsw8CL6Op5Ip@mysql-2fdea058-project-shopbee.l.aivencloud.com:15443/defaultdb?ssl-mode=REQUIRED",
                    "avnadmin", "AVNS_PYuUDx9qsw8CL6Op5Ip");
            Statement sta = conn.createStatement();

            ResultSet setdata = sta.executeQuery("select * from Users");
            int index =0;
            int columnCount = setdata.getMetaData().getColumnCount();
             System.out.println("column #"+columnCount);
   
          

            while (setdata.next()) {
                User user = new User();
              
                String userID = setdata.getString("userID");
           
                String username = setdata.getString("name");
          
                String address = setdata.getString("address");
                System.out.println("USER AIVEN TEST:");
                System.out.println(userID + " " + username + " " + address);

                user.setUserId(userID);
                user.setUserName(username);
                user.setAddress(address);

                System.out.println("Get username in user Aiven");
                System.out.println(user.getName());
                System.out.println(index);
                

        
            items.add(user);
       }

            setdata.close();
            sta.close();
            conn.close();
           
        } 
        catch (Exception e) {
            System.out.println("Error in database connecion");
            System.out.println(e);
            e.printStackTrace();
        }

        
        return items;

    }
    
}

