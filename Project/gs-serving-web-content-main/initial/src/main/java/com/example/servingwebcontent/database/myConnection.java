package com.example.servingwebcontent.database;

import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Value;

@Controller
public class myConnection {
    @Value("${app.database.url}")
    private String urlString;
    @Value("${app.database.driver}")
    private String appDriver;
    @Value("${app.database.user}")
    private String appUser;
    @Value("${app.database.password}")
    private String appPassword;

    Connection conn = null;
    public Statement myConn() {
        try {
            System.out.println("This is my connection class");

            Class.forName(appDriver);
                conn = DriverManager.getConnection(urlString, appUser, appPassword);
                Statement sta = conn.createStatement();
                return sta;
        }
        catch(Exception e) {
            System.out.println("Error occurred: " + e.getMessage());
            e.printStackTrace();
            return null;
        }
        
    }
}