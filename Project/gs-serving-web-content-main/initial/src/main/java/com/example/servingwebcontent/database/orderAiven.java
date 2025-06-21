package com.example.servingwebcontent.database;


import java.sql.Connection;
import java.sql.DriverManager;
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

    public orderAiven(){}

    /*
     * to do
     * mapping database data to Model Order
     */

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

            ResultSet setdata = sta.executeQuery("select * from order limit 10");
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

                order.setOrderId(orderID);
                if (sqlDate != null) {
                    order.setOrderDate(sqlDate.toLocalDate());
                }
                order.setStatus(status);
                
                System.out.println("Get Order in order Aiven");
                System.out.println(order.getOrderId());
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

            Statement sta = conn.createStatement();
            String query = "SELECT * FROM `order` WHERE userId = '" + userId + "'";

            ResultSet setdata = sta.executeQuery(query);

            while (setdata.next()) {
                Order order = new Order();
                order.setOrderId(setdata.getString("orderId"));
                order.setUserId(setdata.getString("userId"));

                // productIds từ chuỗi → List<Integer>
                String productIdsStr = setdata.getString("productIds");
                List<Integer> productIds = new ArrayList<>();
                if (productIdsStr != null && !productIdsStr.isEmpty()) {
                    productIds = Arrays.stream(productIdsStr.split(","))
                                    .map(String::trim)
                                    .map(Integer::parseInt)
                                    .toList();
                }
                order.setProductIds(productIds);

                order.setTotalAmount(setdata.getDouble("totalAmount"));
                order.setStatus(setdata.getString("status"));

                Date sqlDate = setdata.getDate("orderDate");
                if (sqlDate != null) {
                    order.setOrderDate(sqlDate.toLocalDate());
                }

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

