import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class myConnection {
    Connection conn = null;
    public Statement myConn() {

        System.out.println("This is my connection class");
        // Here you can implement your connection logic
        // For example, connecting to a database or any other service

         Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                    "jdbc:mysql://avnadmin:AVNS_PYuUDx9qsw8CL6Op5Ip@mysql-2fdea058-project-shopbee.l.aivencloud.com:15443/defaultdb?ssl-mode=REQUIRED",
                    "avnadmin", "AVNS_PYuUDx9qsw8CL6Op5Ip");
            Statement sta = conn.createStatement();
            return sta;
    }
}