/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
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
public class Add extends javax.swing.JFrame {

    /**
     * Creates new form Add
     */
    public Add() {
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
        jLabel2 = new javax.swing.JLabel();
        bkname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bkpub = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        bkprice = new javax.swing.JTextField();
        bkquantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        bkauthor = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Book ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 80, 22));

        bkid.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        bkid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bkidKeyTyped(evt);
            }
        });
        jPanel1.add(bkid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 199, 32));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setText("Book Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, 29));

        bkname.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        jPanel1.add(bkname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 199, 32));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setText("Author");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 102, 29));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setText("Publication");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 102, 29));

        bkpub.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        jPanel1.add(bkpub, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 199, 32));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 102, 29));

        bkprice.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        bkprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bkpriceKeyTyped(evt);
            }
        });
        jPanel1.add(bkprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 199, 32));

        bkquantity.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        bkquantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bkquantityKeyTyped(evt);
            }
        });
        jPanel1.add(bkquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 199, 32));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setText("Quantity");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 102, 29));

        jButton1.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add-btn.png"))); // NOI18N
        jButton1.setText("Add");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 460, 102, -1));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 460, 133, -1));

        bkauthor.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        bkauthor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bkauthorKeyTyped(evt);
            }
        });
        jPanel1.add(bkauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 199, 32));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/add-bg.jpeg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -5, 700, 570));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      //add button action
      if (isInputValid()){
          Connection con = null;
          PreparedStatement ps = null;
          
          //storing user data entered into the string
          String Id = bkid.getText();
          String Name = bkname.getText();
          String Author = bkauthor.getText();
          String Pub = bkpub.getText();
          String Price = bkprice.getText();
          String Qty = bkquantity.getText();
          
          // SQL Query
          final String SQL = "INSERT INTO BOOKS(BK_ID, BK_NAME, BK_AUTOR, BK_PUB, BK_PRICE, BK_QTY) values(?,?,?,?,?,?)";
          
          //performing the Database operation
          try {
              con = Connect.dbconnection();
              ps = con.prepareStatement(SQL);
              
              ps.setString(1, Id);
              ps.setString(2, Name);
              ps.setString(3, Author);
              ps.setString(4, Pub);
              ps.setString(5, Price);
              ps.setString(6, Qty);
              ps.executeUpdate();
              
              JOptionPane.showMessageDialog(this, "Book Added successfully !!");
              
              clearFields();
              
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
                if (ps != null){ 
                    ps.close();
                }
                if (con != null){
                    con.close();
                }
            } catch (SQLException e) {
                LoggerUtil.logError("Failed to close database resources", e);
            }
        }
      }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //close button action on  click
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void bkidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bkidKeyTyped
        InputValidator.validateNumericInput(evt, rootPane, "Only numbers are allowed for Book ID !!");
    }//GEN-LAST:event_bkidKeyTyped

    private void bkpriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bkpriceKeyTyped
        // Check for the book price
        InputValidator.validateNumericInput(evt, rootPane, "Only numbers are allowed for Book Price !!");
    }//GEN-LAST:event_bkpriceKeyTyped

    private void bkquantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bkquantityKeyTyped
        // Check for the book quantity
        InputValidator.validateNumericInput(evt, rootPane, "Only numbers are allowed for Book Quantity !!");
    }//GEN-LAST:event_bkquantityKeyTyped

    private void bkauthorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bkauthorKeyTyped
        // check the author name
        InputValidator.validateCharacterInput(evt, rootPane,"Only characters are allowed for Author Name !!");
    }//GEN-LAST:event_bkauthorKeyTyped

    // Utility Method to validate input
    private boolean isInputValid() {
        if (bkid.getText().isEmpty() || bkname.getText().isEmpty() || bkauthor.getText().isEmpty() || bkpub.getText().isEmpty() || bkprice.getText().isEmpty() || bkquantity.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all the details !!", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        try {
            if (Integer.parseInt(bkid.getText()) < 1) {
                JOptionPane.showMessageDialog(this, "Invalid Book Id", "Error", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            Double.valueOf(bkprice.getText());
            Integer.valueOf(bkquantity.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid number format for price or quantity", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private void clearFields() {
        bkid.setText("");
        bkname.setText("");
        bkauthor.setText("");
        bkprice.setText("");
        bkpub.setText("");
        bkquantity.setText("");
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
                Add j1 = new Add();
                ImageIcon img = new ImageIcon(getClass().getResource("/assets/add-book-icon.png"));
                j1.setIconImage(img.getImage());
                j1.setTitle("Add Book");
                j1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bkauthor;
    private javax.swing.JTextField bkid;
    private javax.swing.JTextField bkname;
    private javax.swing.JTextField bkprice;
    private javax.swing.JTextField bkpub;
    private javax.swing.JTextField bkquantity;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
