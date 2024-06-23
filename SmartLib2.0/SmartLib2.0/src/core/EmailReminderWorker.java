/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core;

import java.time.LocalDate;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.SwingWorker;
import util.LoggerUtil;

/**
 *
 * @author Hydron
 */
class EmailReminderWorker extends SwingWorker<Void, Integer> {
    private final int NUM_THREADS = Runtime.getRuntime().availableProcessors();
    private final ExecutorService emailExecutor = Executors.newFixedThreadPool(NUM_THREADS);

    private Home mainApp;
    private List<Patron> patrons;
    private JProgressBar progressBar;

    public EmailReminderWorker(List<Patron> patrons, JProgressBar progressBar, Home mainApp) {
        this.mainApp = mainApp;
        this.patrons = patrons;
        this.progressBar = progressBar;
    }

    public void setProgressBar(JProgressBar progressBar) {
        this.progressBar = progressBar;
        this.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            @Override
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                if ("progress".equals(evt.getPropertyName())) {
                    int progress = (Integer) evt.getNewValue();
                    progressBar.setValue(progress);
                }
            }
        });
    }

    @Override
    protected Void doInBackground() throws Exception {
        int totalEmails = patrons.stream().mapToInt(p -> AutomatedReminder.getItems(p).size() * 3).sum(); // Total number of emails to be sent
        int sentEmails = 0;
        
        for (Patron patron : patrons) {
            List<Item> items = AutomatedReminder.getItems(patron);
            for (Item item : items) {
                LocalDate dueDate = AutomatedReminder.calculateDueDate(item);
                String to = patron.getEmail();
                String title = item.getTitle();

                // Check if it's time to send the first email (3 days before the due date)
                if (AutomatedReminder.isTimeToSendEmail(dueDate, -3)) {
                    emailExecutor.submit(() -> {
                        AutomatedReminder.sendReminderEmail(to, "First Reminder: Your book is due in 3 Days.", title, dueDate);
                    });
                    sentEmails++;
                }
                // Check if it's time to send the second email (on due date)
                if (AutomatedReminder.isTimeToSendEmail(dueDate, 0)) {
                    emailExecutor.submit(() -> {
                        AutomatedReminder.sendReminderEmail(to, "Second Reminder: Book due today.", title, dueDate);
                    });
                    sentEmails++;
                }
                // Check if it's time to send the third email (3 days after the due date)
                if (AutomatedReminder.isTimeToSendEmail(dueDate, 3)) {
                    emailExecutor.submit(() -> {
                        AutomatedReminder.sendReminderEmail(to, "Last Reminder: Book is overdue.", title, dueDate);
                    });
                    sentEmails++;
                }
                
                int progress = (int) ((double) sentEmails / totalEmails * 100);
                setProgress(progress);
            }
        }
        
        emailExecutor.shutdown();
        try {
            emailExecutor.awaitTermination(2, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            LoggerUtil.logError("Email Executor service interrupted.", e);
        }
        
        return null;
    }

    @Override
    protected void done() {
        mainApp.hideProgressBar();
        JOptionPane.showMessageDialog(mainApp.getContentPane(), "All reminder emails have been sent.", "Success",JOptionPane.INFORMATION_MESSAGE);
    }
}
