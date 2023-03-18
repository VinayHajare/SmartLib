package project;

import java.sql.Connection;
import java.sql.DriverManager;

public class connect {
    public static Connection dbconnection() throws Exception
    {
        Connection con;
        Class.forName("com.mysql.jdbc.Driver");
        con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/library","root","system");
        return (con);
        
    }
    
    Connection Connection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
