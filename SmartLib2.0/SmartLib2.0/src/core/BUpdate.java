/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import util.InputValidator;
import util.LoggerUtil;

/**
 *
 * @author Hydron
 */
public class BUpdate extends javax.swing.JFrame {

    /**
     * Creates new form BUpdate
     */
    public BUpdate() {
        initComponents();
        
        //setting label to invisible
        name.setVisible(false);
        address.setVisible(false);
        email.setVisible(false);
        contact.setVisible(false);
        borrowed.setVisible(false);
        fine.setVisible(false);
        //setting textfield to invisible
        bname.setVisible(false);
        baddress.setVisible(false);
        bemail.setVisible(false);
        bcontact.setVisible(false);
        bborrowed.setVisible(false);
        bfine.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        address = new javax.swing.JLabel();
        contact = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        fine = new javax.swing.JLabel();
        borrowed = new javax.swing.JLabel();
        bid = new javax.swing.JTextField();
        bname = new javax.swing.JTextField();
        baddress = new javax.swing.JTextField();
        bemail = new javax.swing.JTextField();
        bcontact = new javax.swing.JTextField();
        bborrowed = new javax.swing.JTextField();
        bfine = new javax.swing.JTextField();
        Update = new javax.swing.JButton();
        bfetch = new javax.swing.JButton();
        bclose = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        name.setText("Borrower Name");
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 163, -1));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        jLabel2.setText("Borrower Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 134, -1));

        address.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        address.setText("Borrower Address");
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 180, -1, -1));

        contact.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        contact.setText("Borrower Contact");
        getContentPane().add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 193, -1));

        email.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        email.setText("Borrower Email");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 172, -1));

        fine.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        fine.setText("Fine Amount");
        getContentPane().add(fine, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 159, -1));

        borrowed.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 18)); // NOI18N
        borrowed.setText("Book Borrowed");
        getContentPane().add(borrowed, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 167, -1));

        bid.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        bid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bidKeyTyped(evt);
            }
        });
        getContentPane().add(bid, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 203, -1));

        bname.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        bname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bnameKeyTyped(evt);
            }
        });
        getContentPane().add(bname, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 203, -1));

        baddress.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        getContentPane().add(baddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 203, -1));

        bemail.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        getContentPane().add(bemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 203, -1));

        bcontact.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        getContentPane().add(bcontact, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 280, 203, -1));

        bborrowed.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        bborrowed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bborrowedKeyTyped(evt);
            }
        });
        getContentPane().add(bborrowed, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 203, -1));

        bfine.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        bfine.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bfineKeyTyped(evt);
            }
        });
        getContentPane().add(bfine, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, 203, -1));

        Update.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        Update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/renew-btn.png"))); // NOI18N
        Update.setText("Update");
        Update.setBorderPainted(false);
        Update.setContentAreaFilled(false);
        Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 430, 200, -1));

        bfetch.setFont(new java.awt.Font("Copperplate Gothic Bold", 1, 18)); // NOI18N
        bfetch.setForeground(new java.awt.Color(255, 0, 0));
        bfetch.setText("Fetch");
        bfetch.setBorder(null);
        bfetch.setBorderPainted(false);
        bfetch.setContentAreaFilled(false);
        bfetch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfetchActionPerformed(evt);
            }
        });
        getContentPane().add(bfetch, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 20, 135, 57));

        bclose.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        bclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/close-btn.png"))); // NOI18N
        bclose.setText("Close");
        bclose.setBorder(null);
        bclose.setBorderPainted(false);
        bclose.setContentAreaFilled(false);
        bclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bcloseActionPerformed(evt);
            }
        });
        getContentPane().add(bclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 430, 135, 57));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/update-bg.jpeg"))); // NOI18N
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bfetchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bfetchActionPerformed
        // Fetch button action
        String borID = bid.getText();
        final String SQL = "SELECT * FROM borrowers WHERE BOR_ID =?";
        Connection con = null;
        PreparedStatement ps = null;
        
        if(borID.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter the Borrower Id","Error",JOptionPane.ERROR_MESSAGE);
        }else if(Integer.parseInt(borID) < 1){
            JOptionPane.showMessageDialog(this, "Invalid Borrower Id", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                con = Connect.dbconnection();
                ps = con.prepareStatement(SQL);
                ps.setString(1, borID);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    //extracting data from result set
                    String Name = rs.getString("BOR_NAME");
                    String Address = rs.getString("BOR_ADDRESS");
                    String Email = rs.getString("BOR_EMAIL");
                    String Contact = rs.getString("BOR_CONTACT");
                    String Borrowed = rs.getString("BK_BORROWED");
                    String Fine = rs.getString("FINE_AMT");

                    //setting data to corresponding field
                    bname.setText(Name);
                    baddress.setText(Address);
                    bemail.setText(Email);
                    bcontact.setText(Contact);
                    bborrowed.setText(Borrowed);
                    bfine.setText(Fine);

                    //setting label to visible
                    name.setVisible(true);
                    address.setVisible(true);
                    email.setVisible(true);
                    contact.setVisible(true);
                    borrowed.setVisible(true);
                    fine.setVisible(true);
                    //setting textfield to visible
                    bname.setVisible(true);
                    baddress.setVisible(true);
                    bemail.setVisible(true);
                    bcontact.setVisible(true);
                    bborrowed.setVisible(true);
                    bfine.setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(this, "Borrower does not exist!", "Error", JOptionPane.ERROR_MESSAGE);
                    bid.setText("");
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Database Operation Failed !!!", "Database ERROR", JOptionPane.ERROR_MESSAGE);
                LoggerUtil.logError("Database operation failed", ex);

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Database driver not found!!!", "Database Driver ERROR", JOptionPane.ERROR_MESSAGE);
                LoggerUtil.logError("Database driver not found", ex);

            }catch (HeadlessException ex) {
              LoggerUtil.logError("Display system no available", ex);
            }finally {
                try {
                    if (ps != null) {
                        ps.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    LoggerUtil.logError("Failed to close database resources", e);
                }
            }
        }     
    }//GEN-LAST:event_bfetchActionPerformed

    private void bcloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bcloseActionPerformed
        // Close button action
        this.dispose();
    }//GEN-LAST:event_bcloseActionPerformed

    private void UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateActionPerformed
        //update button action
        if (isBorrowerInputValid()) {
            Connection con = null;
            PreparedStatement ps = null;

            // Storing user data entered into the string
            String ID = bid.getText();
            String NAME = bname.getText();
            String ADDRESS = baddress.getText();
            String EMAIL = bemail.getText();
            String CONTACT = bcontact.getText();
            String BOOK_BORROWED = bborrowed.getText();
            String FINE = bfine.getText();

            // SQL Query
            final String SQL = "UPDATE borrowers "
                             + "SET BOR_NAME=?, BOR_ADDRESS=?, BOR_EMAIL=?, BOR_CONTACT=?, BK_BORROWED=?, FINE_AMT=?"
                             + "WHERE BOR_ID=?";

            // Performing the Database operation
            try {
                con = Connect.dbconnection();
                ps = con.prepareStatement(SQL);

                ps.setString(7, ID);
                ps.setString(1, NAME);
                ps.setString(2, ADDRESS);
                ps.setString(3, EMAIL);
                ps.setString(4, CONTACT);
                ps.setString(5, BOOK_BORROWED);
                ps.setString(6, FINE);
                ps.executeUpdate();

                JOptionPane.showMessageDialog(this, "Borrower details updated successfully !!", "Success", JOptionPane.INFORMATION_MESSAGE);

                clearBorrowerFields();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Database Operation Failed !!!", "Database ERROR", JOptionPane.ERROR_MESSAGE);
                LoggerUtil.logError("Database operation failed", ex);

            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Database driver not found!!!", "Database Driver ERROR", JOptionPane.ERROR_MESSAGE);
                LoggerUtil.logError("Database driver not found", ex);

            }catch (HeadlessException ex) {
              LoggerUtil.logError("Display system no available", ex);
            }finally {
                try {
                    if (ps != null) {
                        ps.close();
                    }
                    if (con != null) {
                        con.close();
                    }
                } catch (SQLException e) {
                    LoggerUtil.logError("Failed to close database resources", e);
                }
            }
        }
    }//GEN-LAST:event_UpdateActionPerformed

    private void bidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bidKeyTyped
        // check borrower id
        InputValidator.validateNumericInput(evt, rootPane, "Only numbers are allowed for Borrower ID !!");
    }//GEN-LAST:event_bidKeyTyped

    private void bnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bnameKeyTyped
        // check borrower name
        InputValidator.validateCharacterInput(evt, rootPane, "Only character are allowed for Borrower Name !!");
    }//GEN-LAST:event_bnameKeyTyped

    private void bborrowedKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bborrowedKeyTyped
        // check borrowed book
        InputValidator.validateNumericInput(evt, rootPane, "Only numbers are allowed for Borrowed Books !!");
    }//GEN-LAST:event_bborrowedKeyTyped

    private void bfineKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bfineKeyTyped
        // check fine amount
        InputValidator.validateNumericInput(evt, rootPane, "Only numbers are allowed for Fine Amount!");
    }//GEN-LAST:event_bfineKeyTyped

    private boolean isBorrowerInputValid() {
        if (bid.getText().isEmpty() || bname.getText().isEmpty() || baddress.getText().isEmpty() || bemail.getText().isEmpty() || bcontact.getText().isEmpty() || bborrowed.getText().isEmpty() || bfine.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all the details !!", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        try {
            if (Integer.parseInt(bid.getText()) < 1) {
                JOptionPane.showMessageDialog(this, "Invalid Borrower Id", "Error", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            Double.valueOf(bfine.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid number format for ID or amount", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return !(!InputValidator.validateEmail(bemail.getText(), rootPane) || !InputValidator.validateMobileNumber(bcontact.getText(), rootPane));
    }

    private void clearBorrowerFields() {
        bid.setText("");
        bname.setText("");
        baddress.setText("");
        bemail.setText("");
        bcontact.setText("");
        bborrowed.setText("");
        bfine.setText("");
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                BUpdate j = new BUpdate();
                ImageIcon img = new ImageIcon(getClass().getResource("/assets/edit-borrower-icon.png"));
                j.setIconImage(img.getImage());
                j.setTitle("Update Book");
                j.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Update;
    private javax.swing.JLabel address;
    private javax.swing.JTextField baddress;
    private javax.swing.JTextField bborrowed;
    private javax.swing.JButton bclose;
    private javax.swing.JTextField bcontact;
    private javax.swing.JTextField bemail;
    private javax.swing.JButton bfetch;
    private javax.swing.JTextField bfine;
    private javax.swing.JTextField bid;
    private javax.swing.JTextField bname;
    private javax.swing.JLabel borrowed;
    private javax.swing.JLabel contact;
    private javax.swing.JLabel email;
    private javax.swing.JLabel fine;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel name;
    // End of variables declaration//GEN-END:variables
}