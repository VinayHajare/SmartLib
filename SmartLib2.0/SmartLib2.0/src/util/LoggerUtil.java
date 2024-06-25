/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.io.IOException;
import java.util.logging.Logger;
import java.util.logging.Level;
import java.util.logging.LogManager;

/**
 *
 * @author Hydron
 */
public class LoggerUtil{
    private final static Logger logger = Logger.getLogger(LoggerUtil.class.getName());
    
    static{
        try{
            LogManager.getLogManager().readConfiguration(LoggerUtil.class.getClassLoader().getResourceAsStream("./resources/logging.properties"));
        }catch(IOException e){
            logger.log(Level.SEVERE, "Failed to initialize the logger configuration", e);
        }
    }
    
    /**
     *
     * @param message
     */
    public static void logInfo(String message){
        logger.log(Level.INFO, message);
    }
    
    /**
     *
     * @param message
     */
    public static void logDebug(String message){
        logger.log(Level.FINE, message);
    }
    
    /**
     *
     * @param message
     */
    public static void logWarning(String message){
        logger.log(Level.WARNING, message);
    }
    
    /**
     *
     * @param message
     * @param throwable
     */
    public static void logError(String message, Throwable throwable){
        logger.log(Level.SEVERE, message, throwable);
    }
}
