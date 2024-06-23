/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Hydron
 */

public class InputValidator {

    public static void validateNumericInput(KeyEvent evt, JComponent component, String errorMessage) {
        char keyChar = evt.getKeyChar();
                
        // Allow the backspace and delete button action
        if (keyChar == '\b' || keyChar == '\u007F' || keyChar == '\n') {
            return;
        }

        // Check if the input character is a digit
        if (!Character.isDigit(keyChar)) {
            evt.consume();
            JOptionPane.showMessageDialog(component, errorMessage, "Input Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static void validateCharacterInput(KeyEvent evt, JComponent component, String errorMessage) {
        char keyChar = evt.getKeyChar();

        // Allow the backspace and delete button action
        if (keyChar == '\b' || keyChar == '\u007F') {
            return;
        }

        // Check if the input character is a letter
        if (!Character.isLetter(keyChar)) {
            evt.consume();
            JOptionPane.showMessageDialog(component, errorMessage, "Input Error", JOptionPane.WARNING_MESSAGE);
        }
    }

    public static boolean validateEmail(String email, JComponent component) {
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(component, "Invalid email format!", "Input Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    public static boolean validateMobileNumber(String mobileNumber, JComponent component) {
        // Check if the mobile number is exactly 10 digits
        if (mobileNumber.length() != 10) {
            JOptionPane.showMessageDialog(component, "Invalid mobile number format! Must be 10 digits.", "Input Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        // Check if the mobile number starts with 6, 7, 8, or 9
        char firstChar = mobileNumber.charAt(0);
        if (firstChar != '6' && firstChar != '7' && firstChar != '8' && firstChar != '9') {
            JOptionPane.showMessageDialog(component, "Invalid mobile number format! Must start with 6, 7, 8, or 9.", "Input Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        // Check if the mobile number contains only digits
        String mobileRegex = "\\d{10}";
        Pattern pattern = Pattern.compile(mobileRegex);
        Matcher matcher = pattern.matcher(mobileNumber);
        if (!matcher.matches()) {
            JOptionPane.showMessageDialog(component, "Invalid mobile number format! Must be 10 digits.", "Input Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

}
