/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

/**
 *
 * @author Hydron
 */
public class Settings {
    
    private static int fineAmount = 200; // Default fine amount
    private static int borrowingDays = 7; // Default borrowing days

    public static int getFineAmount() {
        return fineAmount;
    }

    public static void setFineAmount(int fineAmount) {
        Settings.fineAmount = fineAmount;
    }

    public static int getBorrowingDays() {
        return borrowingDays;
    }

    public static void setBorrowingDays(int borrowingDays) {
        Settings.borrowingDays = borrowingDays;
    }
}
