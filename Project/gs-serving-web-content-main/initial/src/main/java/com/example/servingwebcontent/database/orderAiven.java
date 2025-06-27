package com.example.servingwebcontent.database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.sql.Date;
import java.time.LocalDate;


import com.example.servingwebcontent.model.UserList;
import com.example.servingwebcontent.model.Order;
import com.example.servingwebcontent.model.User;
import com.mysql.cj.jdbc.result.ResultSetMetaData;


public class orderAiven {

    ArrayList<Order> items = new ArrayList<Order>(); 
  

    /**
     * @return
     */
    public ArrayList<Order> orderAivenList() {
      
        Connection conn = null;
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://avnadmin:AVNS_PYuUDx9qsw8CL6Op5Ip@mysql-2fdea058-project-shopbee.l.aivencloud.com:15443/defaultdb?ssl-mode=REQUIRED",
                    "avnadmin", "AVNS_PYuUDx9qsw8CL6Op5Ip");
            Statement sta = conn.createStatement();

            ResultSet setdata = sta.executeQuery("select * from Orders");
            int index =0;
            int columnCount = setdata.getMetaData().getColumnCount();
             System.out.println("column #"+columnCount);
   
          

            while (setdata.next()) {
                Order order = new Order();
              
                String orderID = setdata.getString("orderID");
                //String orderDate = setdata.getLocalDate("orderDate");
                
                Date sqlDate = setdata.getDate("orderDate");
                
                String status = setdata.getString("status");

                System.out.println("Order AIVEN TEST:");
                System.out.println(orderID + " " + sqlDate + " " + status);

                order.setOrderID(orderID);
               /*  if (sqlDate != null) {
                    order.setOrderDate(sqlDate.toLocalDate());
                }*/
                order.setOrderDate(sqlDate.toLocalDate());
                order.setStatus(status);
                
                System.out.println("Get Order in order Aiven");
                System.out.println(order.getOrderID());
                System.out.println(index);
                

        
            items.add(order);
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
    

    public ArrayList<Order> orderListByUserId(String userId) {
        ArrayList<Order> orders = new ArrayList<>();
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://avnadmin:AVNS_PYuUDx9qsw8CL6Op5Ip@mysql-2fdea058-project-shopbee.l.aivencloud.com:15443/defaultdb?ssl-mode=REQUIRED",
                    "avnadmin", "AVNS_PYuUDx9qsw8CL6Op5Ip");

            String query = "SELECT o.orderID, o.orderDate, o.status FROM Orders" + 
                           "FROM Orders o" +
                           "JOIN UserOrders uo ON o.orderID = uo.orderID" +
                           "JOIN Users u ON uo.userId = u.userId" +
                           "WHERE u.userId = ?"; 

            PreparedStatement sta = conn.prepareStatement(query);
            sta.setString(1, userId);
            ResultSet setdata = sta.executeQuery();

            while (setdata.next()) {
                Order order = new Order();
                order.setOrderID(setdata.getString("orderID"));

                Date sqlDate = setdata.getDate("orderDate");
                if (sqlDate != null) {
                    order.setOrderDate(sqlDate.toLocalDate());
                }
                order.setStatus(setdata.getString("status"));

                orders.add(order);
            }

            setdata.close();
            sta.close();
            conn.close();
        } catch (Exception e) {
            System.out.println("Error in fetching orders by userId");
            e.printStackTrace();
        }

        return orders;
    }

}

