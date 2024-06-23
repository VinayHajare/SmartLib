package core;

import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import util.InputValidator;
import util.LoggerUtil;

/**
 *
 * @author Hydron
 */
public class Delete extends javax.swing.JFrame {

    /**
     * Creates new form Delete
     */
    public Delete() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        bkid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Book ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 102, 32));

        bkid.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        bkid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bkidKeyTyped(evt);
            }
        });
        jPanel1.add(bkid, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 201, 32));

        jButton1.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete-btn.png"))); // NOI18N
        jButton1.setText("Delete");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 158, -1));

        jButton2.setFont(new java.awt.Font("Century Schoolbook", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/close-btn.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 133, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete-bg.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 420));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //close button action on  click
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //delete button action
        String bkID = bkid.getText();
        final String SQL = "DELETE FROM books WHERE BK_ID =?";
        Connection con = null;
        PreparedStatement ps = null;
        
        if(bkID.equals("")){
            JOptionPane.showMessageDialog(this,"Please enter the Book Id","Error",JOptionPane.ERROR_MESSAGE);
        }else if(Integer.parseInt(bkID) < 1){
            JOptionPane.showMessageDialog(this, "Invalid Book Id", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            try {                
                con = Connect.dbconnection();
                ps = con.prepareStatement(SQL);
                ResultSet rs;
                try (Statement st = con.createStatement()) {
                    rs = st.executeQuery("SELECT * FROM books WHERE BK_ID = '" + bkID + "'");
                }
                rs.close();
                if (rs.next()) {
                    ps.setString(1, bkID);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Borrower record deleted Successfully !", "Success", JOptionPane.INFORMATION_MESSAGE);
                    bkid.setText("");
                } else {
                    JOptionPane.showMessageDialog(this, "Record of borrower with ID " + bkID + " does not exist !", "ERROR", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (SQLException ex) {
              JOptionPane.showMessageDialog(rootPane, "Database Operation Failed !!!", "Database ERROR", JOptionPane.ERROR_MESSAGE);
              LoggerUtil.logError("Database operation Failed", ex);

            } catch (ClassNotFoundException ex) {
              JOptionPane.showMessageDialog(rootPane, "Database driver not found!!!", "Database Driver ERROR", JOptionPane.ERROR_MESSAGE);
              LoggerUtil.logError("Database driver not found", ex);

            } catch (HeadlessException ex) {
              LoggerUtil.logError("Display system no available", ex);
              
            } finally {
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void bkidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bkidKeyTyped
         // check the borrower id
        InputValidator.validateNumericInput(evt, rootPane, "Only numbers are allowed for Book ID !!!");
    }//GEN-LAST:event_bkidKeyTyped

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
               Delete j1 = new Delete();
               ImageIcon img = new ImageIcon(getClass().getResource("/assets/delete-book-icon.png"));
               j1.setIconImage(img.getImage());
               j1.setTitle("Delete Record");
               j1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bkid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
