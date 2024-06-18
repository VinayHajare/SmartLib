/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.io.InputStream;
import java.util.Properties;

/**
 *
 * @author Hydron
 */
public class Config {
    private static final Properties properties = new Properties();
    
    static{
        try( InputStream input = Config.class.getClassLoader().getResourceAsStream("config.properties")){
            if( input == null ){
                System.err.println("Sorry, unable to load/find the config.poperties");
            }else{
                properties.load(input);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static final String DB_URL = properties.getProperty("db.url");
    public static final String DB_USERNAME = properties.getProperty("db.username");
    public static final String DB_PASSWORD = properties.getProperty("db.password");
    public static final String EMAIL_FROM = properties.getProperty("email.from");
    public static final String EMAIL_PORT = properties.getProperty("email.port");
    public static final String EMAIL_HOST = properties.getProperty("email.host");
    public static final String EMAIL_USERNAME = properties.getProperty("email.username");
    public static final String EMAIL_PASSWORD = properties.getProperty("email.password");
}
