/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package core;

import util.Config;
import util.LoggerUtil;
import java.util.List;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.mail.*;
import javax.mail.internet.*;
import java.sql.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



/**
 *
 * @author Hydron
 */

public class AutomatedReminder {

    
    public static void remind(java.awt.Frame parent) {
        // Getting the list of patrons from the database
        List<Patron> patrons = getPatrons();
        EmailReminderDialog emailReminderDialog = new EmailReminderDialog(parent, patrons, new Home(null));
        emailReminderDialog.start();
    }

    // Method to get the list of patrons
    public static List<Patron> getPatrons() {
        List<Patron> patrons = new ArrayList<>();
        String sql = "SELECT * FROM BORROWERS";
        try (Connection con = Connect.dbconnection();
             Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(sql)) {
            while (rs.next()) {
                String id = rs.getString("BOR_ID");
                String email = rs.getString("BOR_EMAIL");
                patrons.add(new Patron(id, email));
            }
        } catch (Exception e) {
            LoggerUtil.logError("Database Operation Failed", e);
        }
        return patrons;
    }

    // Method to get the list of items checked out by the patron
    public static List<Item> getItems(Patron patron) {
        List<Item> items = new ArrayList<>();
        String sql = "SELECT * FROM Issued_Books WHERE BOR_ID = ?";
        try (Connection con = Connect.dbconnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, patron.getId());
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    String id = rs.getString("BK_ID");
                    String title = rs.getString("BK_NAME");
                    String dueDate = rs.getString("RET_DATE");
                    items.add(new Item(id, title, dueDate));
                }
            }
        } catch (Exception e) {
            LoggerUtil.logError("Database Operation Failed", e);
        }
        return items;
    }

    // Method to calculate the due date
    public static LocalDate calculateDueDate(Item item) {
        return LocalDate.parse(item.getDueDate(), DateTimeFormatter.ISO_LOCAL_DATE);
    }

    // Method to check if it is time to send an email or not
    public static boolean isTimeToSendEmail(LocalDate dueDate, int daysBeforeDueDate) {
        LocalDate emailSendDate = dueDate.plusDays(daysBeforeDueDate);
        return !LocalDate.now().isBefore(emailSendDate);
    }

    // Method to send email reminder
    public static void sendReminderEmail(String to, String subject, String title, LocalDate dueDate) {
        // Setting the required credentials
        String from = Config.EMAIL_FROM;
        String host = Config.EMAIL_HOST;
        String username = Config.EMAIL_USERNAME;
        String password = Config.EMAIL_PASSWORD;
        String port = Config.EMAIL_PORT;

        // Creating SMTP server properties
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", true);
        properties.put("mail.smtp.starttls.enable", true);
        properties.put("mail.smtp.port", port);
        properties.put("mail.smtp.host", host);

        // Creating a session for sending mail
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {
            // Creating MIME email message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject(subject);
            message.setText("This is a reminder that your book \"" + title + "\" is due on " + dueDate + ". Please submit it as soon as possible.");
            // Sending email
            Transport.send(message);
            LoggerUtil.logDebug("Reminder mail sent successfully to " + to);
        } catch (MessagingException e) {
            LoggerUtil.logError("Unable to send email", e);
        }
    }
}
