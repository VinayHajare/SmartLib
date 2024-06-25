package util;

import java.io.*;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Settings {
    private static final String SETTINGS_FILE_NAME = "settings.properties";
    private static final String FINE_AMOUNT_KEY = "fineAmount";
    private static final String BORROWING_DAYS_KEY = "borrowingDays";
    private static int fineAmount = 200; // Default fine amount
    private static int borrowingDays = 7; // Default borrowing days

    private static Settings instance = new Settings();

    private Settings() {
        loadSettings();
    }

    public static Settings getInstance() {
        return instance;
    }

    public int getFineAmount() {
        return fineAmount;
    }

    public void setFineAmount(int fineAmount) {
        Settings.fineAmount = fineAmount;
        saveSettings();
    }

    public int getBorrowingDays() {
        return borrowingDays;
    }

    public void setBorrowingDays(int borrowingDays) {
        Settings.borrowingDays = borrowingDays;
        saveSettings();
    }

    private void loadSettings() {
        Properties properties = new Properties();
        // Load from classpath
        try (InputStream input = getClass().getResourceAsStream("/resources/" + SETTINGS_FILE_NAME)) {
            if (input != null) {
                properties.load(input);
                fineAmount = Integer.parseInt(properties.getProperty(FINE_AMOUNT_KEY, String.valueOf(fineAmount)));
                borrowingDays = Integer.parseInt(properties.getProperty(BORROWING_DAYS_KEY, String.valueOf(borrowingDays)));
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Failed to load settings, using default values");
            LoggerUtil.logError("Failed to load settings, using default values", ex);
        }
        // Load from user directory (override if present)
        File userSettingsFile = new File(System.getProperty("user.home"), SETTINGS_FILE_NAME);
        if (userSettingsFile.exists()) {
            try (InputStream input = new FileInputStream(userSettingsFile)) {
                properties.load(input);
                fineAmount = Integer.parseInt(properties.getProperty(FINE_AMOUNT_KEY, String.valueOf(fineAmount)));
                borrowingDays = Integer.parseInt(properties.getProperty(BORROWING_DAYS_KEY, String.valueOf(borrowingDays)));
            } catch (IOException ex) {
                System.err.println("Failed to load user settings, using default values");
                JOptionPane.showMessageDialog(null, "Failed to load user settings, using default values");
                LoggerUtil.logError("Failed to load user settings, using default values", ex);
            }
        }
    }

    private void saveSettings() {
        Properties properties = new Properties();
        properties.setProperty(FINE_AMOUNT_KEY, String.valueOf(fineAmount));
        properties.setProperty(BORROWING_DAYS_KEY, String.valueOf(borrowingDays));
        // Save to user directory
        File userSettingsFile = new File(System.getProperty("user.home"), SETTINGS_FILE_NAME);
        try (OutputStream output = new FileOutputStream(userSettingsFile)) {
            properties.store(output, null);
        } catch (IOException ex) {
            System.err.println();
            JOptionPane.showMessageDialog(null, "Failed to save settings");
            LoggerUtil.logError("Failed to save settings", ex);
        }
    }
}
