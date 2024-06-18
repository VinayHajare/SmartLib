/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package core;

import java.util.*;
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

    public static void remind() {
        // Getting the list of patrons from the database
        List<Patron> patrons = getPatrons();
        for (Patron patron : patrons) {
            List<Item> items = getItems(patron);
            for (Item item : items) {
                LocalDate dueDate = calculateDueDate(item);
                String to = patron.getEmail();
                String title = item.getTitle();

                // Check if it's time to send the first email (3 days before the due date)
                if (isTimeToSendEmail(dueDate, -3)) {
                    sendReminderEmail(to, "First Reminder: Your book is due in 3 Days.", title, dueDate);
                }
                // Check if it's time to send the second email (on due date)
                if (isTimeToSendEmail(dueDate, 0)) {
                    sendReminderEmail(to, "Second Reminder: Book due today.", title, dueDate);
                }
                // Check if it's time to send the third email (3 days after the due date)
                if (isTimeToSendEmail(dueDate, 3)) {
                    sendReminderEmail(to, "Last Reminder: Book is overdue.", title, dueDate);
                }
            }
        }
    }

    // Method to get the list of patrons
    private static List<Patron> getPatrons() {
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
            e.printStackTrace();
        }
        return patrons;
    }

    // Method to get the list of items checked out by the patron
    private static List<Item> getItems(Patron patron) {
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
            e.printStackTrace();
        }
        return items;
    }

    // Method to calculate the due date
    private static LocalDate calculateDueDate(Item item) {
        return LocalDate.parse(item.getDueDate(), DateTimeFormatter.ISO_LOCAL_DATE);
    }

    // Method to check if it is time to send an email or not
    private static boolean isTimeToSendEmail(LocalDate dueDate, int daysBeforeDueDate) {
        LocalDate emailSendDate = dueDate.plusDays(daysBeforeDueDate);
        return !LocalDate.now().isBefore(emailSendDate);
    }

    // Method to send email reminder
    private static void sendReminderEmail(String to, String subject, String title, LocalDate dueDate) {
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
            System.out.println("Reminder mail sent successfully to " + to);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    private static class Patron {
        private final String id;
        private final String email;

        public Patron(String id, String email) {
            this.id = id;
            this.email = email;
        }

        public String getId() {
            return id;
        }

        public String getEmail() {
            return email;
        }
    }

    private static class Item {
        private final String id;
        private final String title;
        private final String dueDate;

        public Item(String id, String title, String dueDate) {
            this.id = id;
            this.title = title;
            this.dueDate = dueDate;
        }

        public String getId() {
            return id;
        }

        public String getTitle() {
            return title;
        }

        public String getDueDate() {
            return dueDate;
        }
    }
}
