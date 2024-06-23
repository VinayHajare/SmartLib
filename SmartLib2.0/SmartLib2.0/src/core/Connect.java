/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package core;

import util.Config;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Hydron
 */
public class Connect {
    private final static String DRIVER = "com.mysql.jdbc.Driver";
    
    public static Connection dbconnection() throws ClassNotFoundException, SQLException
    {
        Connection con;
        Class.forName(DRIVER);
        con = DriverManager.getConnection(Config.DB_URL,Config.DB_USERNAME,Config.DB_PASSWORD);
        return (con);
    }
}
