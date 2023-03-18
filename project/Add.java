package project;

import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Add extends javax.swing.JFrame {

    public Add() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
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

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Book ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 50, 80, 22));

        bkid.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        bkid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkidActionPerformed(evt);
            }
        });
        jPanel1.add(bkid, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 199, 32));

        jLabel2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel2.setText("Book Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, 29));

        bkname.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        bkname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bknameActionPerformed(evt);
            }
        });
        jPanel1.add(bkname, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 100, 199, 32));

        jLabel3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel3.setText("Author");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 102, 29));

        jLabel4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel4.setText("Publication");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 102, 29));

        bkpub.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        bkpub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkpubActionPerformed(evt);
            }
        });
        jPanel1.add(bkpub, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 199, 32));

        jLabel5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel5.setText("Price");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 102, 29));

        bkprice.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        bkprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkpriceActionPerformed(evt);
            }
        });
        jPanel1.add(bkprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 310, 199, 32));

        bkquantity.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        bkquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkquantityActionPerformed(evt);
            }
        });
        jPanel1.add(bkquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 199, 32));

        jLabel6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel6.setText("Quantity");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, 102, 29));

        jButton1.setFont(new java.awt.Font("Century Schoolbook", 1, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Book21.png"))); // NOI18N
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
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Book22.png"))); // NOI18N
        jButton2.setText("Close");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 460, 133, -1));

        bkauthor.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        bkauthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkauthorActionPerformed(evt);
            }
        });
        jPanel1.add(bkauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, 199, 32));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BG3.jpeg"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 6, 710, 559));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //add button action
      if(bkid.getText().equals("")||bkname.getText().equals("")||bkauthor.getText().equals("")||bkpub.getText().equals("")||bkprice.getText().equals("")||bkquantity.getText().equals(""))
      {
          JOptionPane.showMessageDialog(this,"Please fill all the details !!","Error",JOptionPane.WARNING_MESSAGE);
      }
      else if(bkid.getText().length() < 1)
      {
        JOptionPane.showMessageDialog(this,"Invalid Book Id","Error",JOptionPane.WARNING_MESSAGE);
      }
      else
      {
          //storing user data entered into the string
          String Id = bkid.getText();
          String Name = bkname.getText();
          String Author = bkauthor.getText();
          String Pub = bkpub.getText();
          String Price = bkprice.getText();
          String Qty = bkquantity.getText();
          //performing the DB connection for inserting into DB
          try
          {
           Connection con = connect.dbconnection();
           Statement st = con.createStatement();
           String sql = "insert into books(BK_ID,BK_NAME,BK_AUTOR,BK_PUB,BK_PRICE,BK_QTY) values('"+Id+"','"+Name+"','"+Author+"','"+Pub+"','"+Price+"','"+Qty+"')";
           st.executeUpdate(sql);
           JOptionPane.showMessageDialog(this,"Book Added successfully !!","Success",JOptionPane.INFORMATION_MESSAGE);
           bkid.setText("");
           bkname.setText("");
           bkauthor.setText("");
           bkprice.setText("");
           bkpub.setText("");
           bkquantity.setText("");
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(this,"Database Connection Failed","ERROR",JOptionPane.ERROR_MESSAGE);
              System.out.println(e.getMessage());
          }
      }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //close button action on  click
        //JOptionPane.showMessageDialog(this, "Sure to Leave ?","Warning",JOptionPane.WARNING_MESSAGE);
        this.setVisible(false);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Add j1 = new Add();
                ImageIcon img = new ImageIcon("/Images/book12.png");
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
