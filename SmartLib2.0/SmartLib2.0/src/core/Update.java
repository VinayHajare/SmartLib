package core;

import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import util.InputValidator;
import util.LoggerUtil;
/**
 *
 * @author Hydron
 */
public class Update extends javax.swing.JFrame {

    
    public Update() {
        initComponents();
       //setting label to invisible
        name.setVisible(false);
        author.setVisible(false);
        pub.setVisible(false);
        price.setVisible(false);
        qty.setVisible(false);
        //setting textfield to invisible
        bkname.setVisible(false);
        bkauthor.setVisible(false);
        bkprice.setVisible(false);
        bkpub.setVisible(false);
        bkqty.setVisible(false);
        
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
        name = new javax.swing.JLabel();
        bkname = new javax.swing.JTextField();
        author = new javax.swing.JLabel();
        bkauthor = new javax.swing.JTextField();
        pub = new javax.swing.JLabel();
        bkpub = new javax.swing.JTextField();
        price = new javax.swing.JLabel();
        bkprice = new javax.swing.JTextField();
        qty = new javax.swing.JLabel();
        bkqty = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Book ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 70, 22));

        bkid.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 14)); // NOI18N
        bkid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bkidKeyTyped(evt);
            }
        });
        jPanel1.add(bkid, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, 199, 34));

        jButton1.setFont(new java.awt.Font("Copperplate Gothic Bold", 0, 16)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Fetch");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 30, 90, 30));

        name.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        name.setText("Book Name");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, 29));

        bkname.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        bkname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bknameKeyTyped(evt);
            }
        });
        jPanel1.add(bkname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 199, 32));

        author.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        author.setText("Author");
        jPanel1.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 102, 29));

        bkauthor.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        bkauthor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bkauthorKeyTyped(evt);
            }
        });
        jPanel1.add(bkauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 199, 32));

        pub.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        pub.setText("Publication");
        jPanel1.add(pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 250, 102, 29));

        bkpub.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        jPanel1.add(bkpub, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 199, 32));

        price.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        price.setText("Price");
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 310, 102, 29));

        bkprice.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        bkprice.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bkpriceKeyTyped(evt);
            }
        });
        jPanel1.add(bkprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 199, 32));

        qty.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        qty.setText("Quantity");
        jPanel1.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 370, 102, 29));

        bkqty.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        bkqty.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                bkqtyKeyTyped(evt);
            }
        });
        jPanel1.add(bkqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, 199, 32));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 430, 133, -1));

        jButton3.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/renew-btn.png"))); // NOI18N
        jButton3.setText("Update");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 140, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/update-bg.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 670, 530));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 660, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //close button action on  click
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if (isInputValid()) {
            String id = bkid.getText().trim();
            String name = bkname.getText().trim();
            String author = bkauthor.getText().trim();
            String pub = bkpub.getText().trim();
            String price = bkprice.getText().trim();
            String qty = bkqty.getText().trim();

            String SQL_UPDATE_BOOK = "UPDATE books SET BK_NAME = ?, BK_AUTOR = ?, BK_PUB = ?, BK_PRICE = ?, BK_QTY = ? WHERE BK_ID = ?";

            try (Connection con = Connect.dbconnection(); PreparedStatement ps = con.prepareStatement(SQL_UPDATE_BOOK)) {

                ps.setString(1, name);
                ps.setString(2, author);
                ps.setString(3, pub);
                ps.setString(4, price);
                ps.setString(5, qty);
                ps.setString(6, id);

                int rowsUpdated = ps.executeUpdate();

                if (rowsUpdated > 0) {
                    JOptionPane.showMessageDialog(this, "Book updated Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Failed to update book", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Database Operation Failed !!!", "Database ERROR", JOptionPane.ERROR_MESSAGE);
                LoggerUtil.logError("Database operation failed", ex);
            } catch (ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "Database driver not found!!!", "Database Driver ERROR", JOptionPane.ERROR_MESSAGE);
                LoggerUtil.logError("Database driver not found", ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // Fetch button action
        String bookId = bkid.getText().trim();

        if (bookId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a book id!", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        String SQL_SELECT_BOOK = "SELECT * FROM books WHERE BK_ID = ?";

        try (Connection con = Connect.dbconnection(); PreparedStatement ps = con.prepareStatement(SQL_SELECT_BOOK)) {

            ps.setString(1, bookId);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                // Extract data from result set
                String Name = rs.getString("BK_NAME");
                String Author = rs.getString("BK_AUTOR");
                String Pub = rs.getString("BK_PUB");
                String Price = rs.getString("BK_PRICE");
                String Qty = rs.getString("BK_QTY");

                // Set data to corresponding fields
                bkname.setText(Name);
                bkauthor.setText(Author);
                bkpub.setText(Pub);
                bkprice.setText(Price);
                bkqty.setText(Qty);

                // Make labels and text fields visible
                name.setVisible(true);
                author.setVisible(true);
                pub.setVisible(true);
                price.setVisible(true);
                qty.setVisible(true);
                bkname.setVisible(true);
                bkauthor.setVisible(true);
                bkprice.setVisible(true);
                bkpub.setVisible(true);
                bkqty.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Book ID doesn`t exist !!!", "Error", JOptionPane.ERROR_MESSAGE);
                clearBookFields();
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database Operation Failed !!!", "Database ERROR", JOptionPane.ERROR_MESSAGE);
            LoggerUtil.logError("Database operation failed", ex);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Database driver not found!!!", "Database Driver ERROR", JOptionPane.ERROR_MESSAGE);
            LoggerUtil.logError("Database driver not found", ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void bkidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bkidKeyTyped
        // check the book id
        InputValidator.validateNumericInput(evt, rootPane, "Only numbers are allowed for Book ID!!!");
    }//GEN-LAST:event_bkidKeyTyped

    private void bknameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bknameKeyTyped
        // check the book name
        InputValidator.validateCharacterInput(evt, rootPane, "Only Alphabets are allowed for Book Name !!1");
    }//GEN-LAST:event_bknameKeyTyped

    private void bkauthorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bkauthorKeyTyped
        // check the book name
        InputValidator.validateCharacterInput(evt, rootPane, "Only Alphabets are allowed for Autor Name !!!");
    }//GEN-LAST:event_bkauthorKeyTyped

    private void bkpriceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bkpriceKeyTyped
        // Check the price
        InputValidator.validateCharacterInput(evt, rootPane, "Only Number are allowed for Book Price !!!");
    }//GEN-LAST:event_bkpriceKeyTyped

    private void bkqtyKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_bkqtyKeyTyped
        // Check the qunatity
        InputValidator.validateNumericInput(evt, rootPane, "Only Number are allowed for Book Quantity !!!");
    }//GEN-LAST:event_bkqtyKeyTyped

    private void clearBookFields() {
        // Clear all text fields and hide labels
        bkname.setText("");
        bkauthor.setText("");
        bkpub.setText("");
        bkprice.setText("");
        bkqty.setText("");
        name.setVisible(false);
        author.setVisible(false);
        pub.setVisible(false);
        price.setVisible(false);
        qty.setVisible(false);
    }   
    
    // Utility Method to validate input
    private boolean isInputValid() {
        if (bkid.getText().isEmpty() || bkname.getText().isEmpty() || bkauthor.getText().isEmpty() || bkpub.getText().isEmpty() || bkprice.getText().isEmpty() || bkqty.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill all the details !!", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        try {
            if (Integer.parseInt(bkid.getText()) < 1) {
                JOptionPane.showMessageDialog(this, "Invalid Book Id", "Error", JOptionPane.WARNING_MESSAGE);
                return false;
            }
            Double.valueOf(bkprice.getText());
            Integer.valueOf(bkqty.getText());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid number format for price or quantity", "Error", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
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
                
                Update j = new Update();
                ImageIcon img = new ImageIcon(getClass().getResource("/assets/update-book-icon.png"));
                j.setIconImage(img.getImage());
                j.setTitle("Update Book");
                j.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel author;
    private javax.swing.JTextField bkauthor;
    private javax.swing.JTextField bkid;
    private javax.swing.JTextField bkname;
    private javax.swing.JTextField bkprice;
    private javax.swing.JTextField bkpub;
    private javax.swing.JTextField bkqty;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel price;
    private javax.swing.JLabel pub;
    private javax.swing.JLabel qty;
    // End of variables declaration//GEN-END:variables
}