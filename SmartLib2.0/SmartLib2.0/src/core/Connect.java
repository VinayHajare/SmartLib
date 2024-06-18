package core;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import util.Config;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Hydron
 */
public class Connect {
    public static Connection dbconnection() throws Exception
    {
        Connection con;
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection(Config.DB_URL,Config.DB_USERNAME,Config.DB_PASSWORD);
        return (con);
    }
}
