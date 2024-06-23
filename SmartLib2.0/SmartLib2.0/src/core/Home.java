/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package core;

import javax.swing.ImageIcon;
import util.LoggerUtil;

/**
 *
 * @author Hydron
 */
public class Home extends javax.swing.JFrame {
    private final String userName;
    /**
     * Creates new form NewHome
     * @param userName
     */
    public Home(String userName) {
        initComponents();
        this.userName = userName;
        this.headerLabel.setText("Welcome "+userName+" ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        headerLabel = new javax.swing.JLabel();
        logoutBtn = new javax.swing.JButton();
        addBkBtn = new javax.swing.JButton();
        updateBkBtn = new javax.swing.JButton();
        deleteBkBtn = new javax.swing.JButton();
        issueBkBtn = new javax.swing.JButton();
        returnBkBtn = new javax.swing.JButton();
        showBkBtn = new javax.swing.JButton();
        searchBkBtn = new javax.swing.JButton();
        addBorBtn = new javax.swing.JButton();
        updateBorBtn = new javax.swing.JButton();
        deleteBorBtn = new javax.swing.JButton();
        showBorBtn = new javax.swing.JButton();
        remindBtn = new javax.swing.JButton();
        reminderProgressBar = new javax.swing.JProgressBar();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SmartLib Home");
        setName("Form"); // NOI18N

        jPanel1.setMinimumSize(new java.awt.Dimension(1570, 776));
        jPanel1.setName("jPanel1"); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        headerLabel.setFont(new java.awt.Font("BankGothic Md BT", 1, 65)); // NOI18N
        headerLabel.setForeground(new java.awt.Color(255, 255, 255));
        headerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        headerLabel.setText("Welcome Vinay");
        headerLabel.setName("headerLabel"); // NOI18N
        jPanel1.add(headerLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 680, 80));

        logoutBtn.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        logoutBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logout-btn.png"))); // NOI18N
        logoutBtn.setText("Log Out");
        logoutBtn.setBorderPainted(false);
        logoutBtn.setName("logoutBtn"); // NOI18N
        logoutBtn.addActionListener(this::logoutBtnActionPerformed);
        jPanel1.add(logoutBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, 220, 80));

        addBkBtn.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        addBkBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add-book-icon.png"))); // NOI18N
        addBkBtn.setText("   Add Book");
        addBkBtn.setBorder(null);
        addBkBtn.setBorderPainted(false);
        addBkBtn.setName("addBkBtn"); // NOI18N
        addBkBtn.addActionListener(this::addBkBtnActionPerformed);
        jPanel1.add(addBkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 92, 260, 80));

        updateBkBtn.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        updateBkBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/update-book-icon.png"))); // NOI18N
        updateBkBtn.setText("Update Book");
        updateBkBtn.setBorder(null);
        updateBkBtn.setBorderPainted(false);
        updateBkBtn.setName("updateBkBtn"); // NOI18N
        updateBkBtn.addActionListener(this::updateBkBtnActionPerformed);
        jPanel1.add(updateBkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 197, 260, 80));

        deleteBkBtn.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        deleteBkBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete-book-icon.png"))); // NOI18N
        deleteBkBtn.setText("Delete Book");
        deleteBkBtn.setBorder(null);
        deleteBkBtn.setBorderPainted(false);
        deleteBkBtn.setName("deleteBkBtn"); // NOI18N
        deleteBkBtn.addActionListener(this::deleteBkBtnActionPerformed);
        jPanel1.add(deleteBkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 292, 260, 80));

        issueBkBtn.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        issueBkBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/issue-book-icon.png"))); // NOI18N
        issueBkBtn.setText("Issue Book");
        issueBkBtn.setBorder(null);
        issueBkBtn.setBorderPainted(false);
        issueBkBtn.setName("issueBkBtn"); // NOI18N
        issueBkBtn.addActionListener(this::issueBkBtnActionPerformed);
        jPanel1.add(issueBkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 387, 262, 80));

        returnBkBtn.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        returnBkBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/return-book-icon.png"))); // NOI18N
        returnBkBtn.setText("Return Book");
        returnBkBtn.setBorder(null);
        returnBkBtn.setBorderPainted(false);
        returnBkBtn.setName("returnBkBtn"); // NOI18N
        returnBkBtn.addActionListener(this::returnBkBtnActionPerformed);
        jPanel1.add(returnBkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 482, 260, 80));

        showBkBtn.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        showBkBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/show-books-icon.png"))); // NOI18N
        showBkBtn.setText("Show Books");
        showBkBtn.setBorder(null);
        showBkBtn.setBorderPainted(false);
        showBkBtn.setName("showBkBtn"); // NOI18N
        showBkBtn.addActionListener(this::showBkBtnActionPerformed);
        jPanel1.add(showBkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 577, 260, 80));

        searchBkBtn.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        searchBkBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/search-book-icon.png"))); // NOI18N
        searchBkBtn.setText("Search Book");
        searchBkBtn.setBorder(null);
        searchBkBtn.setBorderPainted(false);
        searchBkBtn.setName("searchBkBtn"); // NOI18N
        searchBkBtn.addActionListener(this::searchBkBtnActionPerformed);
        jPanel1.add(searchBkBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 672, 260, 80));

        addBorBtn.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        addBorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add-borrower-icon.png"))); // NOI18N
        addBorBtn.setText("   Add Borrower");
        addBorBtn.setBorder(null);
        addBorBtn.setBorderPainted(false);
        addBorBtn.setName("addBorBtn"); // NOI18N
        addBorBtn.addActionListener(this::addBorBtnActionPerformed);
        jPanel1.add(addBorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 110, 310, 70));

        updateBorBtn.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        updateBorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/edit-borrower-icon.png"))); // NOI18N
        updateBorBtn.setText("Update Borrower");
        updateBorBtn.setBorder(null);
        updateBorBtn.setBorderPainted(false);
        updateBorBtn.setName("updateBorBtn"); // NOI18N
        updateBorBtn.addActionListener(this::updateBorBtnActionPerformed);
        jPanel1.add(updateBorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 200, 310, 70));

        deleteBorBtn.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        deleteBorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete-borrower-icon.png"))); // NOI18N
        deleteBorBtn.setText("Delete Borrower");
        deleteBorBtn.setBorder(null);
        deleteBorBtn.setBorderPainted(false);
        deleteBorBtn.setName("deleteBorBtn"); // NOI18N
        deleteBorBtn.addActionListener(this::deleteBorBtnActionPerformed);
        jPanel1.add(deleteBorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 290, 310, 70));

        showBorBtn.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        showBorBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/show-borrower-icon.png"))); // NOI18N
        showBorBtn.setText(" Show Borrowers");
        showBorBtn.setBorder(null);
        showBorBtn.setBorderPainted(false);
        showBorBtn.setName("showBorBtn"); // NOI18N
        showBorBtn.addActionListener(this::showBorBtnActionPerformed);
        jPanel1.add(showBorBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 380, 310, 70));

        remindBtn.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        remindBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/remind-icon.png"))); // NOI18N
        remindBtn.setText("Send Reminders");
        remindBtn.setBorder(null);
        remindBtn.setBorderPainted(false);
        remindBtn.setName("remindBtn"); // NOI18N
        remindBtn.addActionListener(this::remindBtnActionPerformed);
        jPanel1.add(remindBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 470, 310, 70));

        reminderProgressBar.setBackground(new java.awt.Color(255, 255, 255));
        reminderProgressBar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        reminderProgressBar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reminderProgressBar.setIndeterminate(true);
        reminderProgressBar.setName("reminderProgressBar"); // NOI18N
        reminderProgressBar.setStringPainted(true);
        jPanel1.add(reminderProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 760, 200, -1));

        jButton1.setFont(new java.awt.Font("Courier New", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/gear.png"))); // NOI18N
        jButton1.setText("Settings");
        jButton1.setActionCommand("  Settings");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setName("jButton1"); // NOI18N
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1190, 560, 310, 80));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/home-bg.jpg"))); // NOI18N
        jLabel1.setText("null");
        jLabel1.setName("jLabel1"); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1600, 860));

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // Handle Logout action
        LoggerUtil.logInfo(userName+" logged out.");
        Login loginPage = new Login();
        loginPage.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_logoutBtnActionPerformed

    private void addBkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBkBtnActionPerformed
        // Handle Add Book action
        Add addBkPage = new Add();
        addBkPage.setTitle("Add Book");
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/add-book-icon.png"));
        addBkPage.setIconImage(icon.getImage());
        addBkPage.setVisible(true);
    }//GEN-LAST:event_addBkBtnActionPerformed

    private void updateBkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBkBtnActionPerformed
        // Handle update book action
        Update updateBkPage = new Update();
        updateBkPage.setTitle("Update Book");
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/update-book-icon.png"));
        updateBkPage.setIconImage(icon.getImage());
        updateBkPage.setVisible(true);
    }//GEN-LAST:event_updateBkBtnActionPerformed

    private void deleteBkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBkBtnActionPerformed
        // Handle delete book action
        Delete deleteBkPage = new Delete();
        deleteBkPage.setTitle("Delete Book");
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/delete-book-icon.png"));
        deleteBkPage.setIconImage(icon.getImage());
        deleteBkPage.setVisible(true);        
    }//GEN-LAST:event_deleteBkBtnActionPerformed

    private void issueBkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueBkBtnActionPerformed
        // Handle issue book action
        Issue issueBkPage = new Issue();
        issueBkPage.setTitle("Issue Book");
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/issue-book-icon.png"));
        issueBkPage.setIconImage(icon.getImage());
        issueBkPage.setVisible(true);        
    }//GEN-LAST:event_issueBkBtnActionPerformed

    private void returnBkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnBkBtnActionPerformed
        // Handle return book action
        Return returnBkPage = new Return();
        returnBkPage.setTitle("Return Book");
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/return-book-icon.png"));
        returnBkPage.setIconImage(icon.getImage());
        returnBkPage.setVisible(true);
    }//GEN-LAST:event_returnBkBtnActionPerformed

    private void showBkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBkBtnActionPerformed
        // Handle show books action
        Show showBksPage = new Show();
        showBksPage.setTitle("Show Books");
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/show-books-icon.png"));
        showBksPage.setIconImage(icon.getImage());
        showBksPage.setVisible(true);
    }//GEN-LAST:event_showBkBtnActionPerformed

    private void searchBkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBkBtnActionPerformed
       // Handle search book action
        Search searchBkPage = new Search();
        searchBkPage.setTitle("Search Book");
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/search-book-icon.png"));
        searchBkPage.setIconImage(icon.getImage());
        searchBkPage.setVisible(true);
    }//GEN-LAST:event_searchBkBtnActionPerformed

    private void addBorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBorBtnActionPerformed
        // Handle add borrower action
        BAdd addBorPage = new BAdd();
        addBorPage.setTitle("Add Borrower");
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/add-borrower-icon.png"));
        addBorPage.setIconImage(icon.getImage());
        addBorPage.setVisible(true);
    }//GEN-LAST:event_addBorBtnActionPerformed

    private void updateBorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBorBtnActionPerformed
        // Handle update borrower action
        BUpdate updateBorPage = new BUpdate();
        updateBorPage.setTitle("Update Borrower");
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/update-borrower-icon.png"));
        updateBorPage.setIconImage(icon.getImage());
        updateBorPage.setVisible(true);
    }//GEN-LAST:event_updateBorBtnActionPerformed

    private void deleteBorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBorBtnActionPerformed
        // Handle delete borrower action
        BDelete deleteBorPage = new BDelete();
        deleteBorPage.setTitle("Delete Borrower");
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/delete-borrower-icon.png"));
        deleteBorPage.setIconImage(icon.getImage());
        deleteBorPage.setVisible(true);
    }//GEN-LAST:event_deleteBorBtnActionPerformed

    private void showBorBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showBorBtnActionPerformed
        // Handle show borrowers action
        Show borrowersDashboard = new Show(2);
        borrowersDashboard.setTitle("Show Borrowers");
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/show-borrower-icon.png"));
        borrowersDashboard.setIconImage(icon.getImage());
        borrowersDashboard.setVisible(true);
    }//GEN-LAST:event_showBorBtnActionPerformed

    private void remindBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remindBtnActionPerformed
        // Handle send reminders action
        AutomatedReminder.remind(this);
    }//GEN-LAST:event_remindBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // Open the settings dialog
        Setting settingsDialog = new Setting(this, true);
        settingsDialog.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    public void showProgressBar() {
        reminderProgressBar.setVisible(true);
    }

    public void hideProgressBar() {
        reminderProgressBar.setVisible(false);
    }

    public javax.swing.JProgressBar getMainProgressBar() {
        return reminderProgressBar;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            LoggerUtil.logError("Nimbus Look and Feel class not found", ex);
        } catch (InstantiationException ex) {
            LoggerUtil.logError("Unable to instantiate the class ", ex);
        } catch (IllegalAccessException ex) {
            LoggerUtil.logError("Access denied", ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            LoggerUtil.logError("Look and feel not supported by the system", ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Home homePage = new Home(null);
                homePage.setTitle("SmartLib Home");
                ImageIcon icon = new ImageIcon(getClass().getResource("/assets/app-icon.png"));
                homePage.setIconImage(icon.getImage());
                homePage.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBkBtn;
    private javax.swing.JButton addBorBtn;
    private javax.swing.JButton deleteBkBtn;
    private javax.swing.JButton deleteBorBtn;
    private javax.swing.JLabel headerLabel;
    private javax.swing.JButton issueBkBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JButton remindBtn;
    private javax.swing.JProgressBar reminderProgressBar;
    private javax.swing.JButton returnBkBtn;
    private javax.swing.JButton searchBkBtn;
    private javax.swing.JButton showBkBtn;
    private javax.swing.JButton showBorBtn;
    private javax.swing.JButton updateBkBtn;
    private javax.swing.JButton updateBorBtn;
    // End of variables declaration//GEN-END:variables
}
