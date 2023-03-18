
package project;

import java.sql.*;
import java.text.*;
import java.util.Date;
import java.util.Calendar;
import javax.swing.*;

public class Return extends javax.swing.JFrame {

    public Return() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bkid = new javax.swing.JTextField();
        borid = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel1.setText("Book ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 80, 35));

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel2.setText("Borrower ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        bkid.setFont(new java.awt.Font("Lucida Fax", 0, 18)); // NOI18N
        bkid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkidActionPerformed(evt);
            }
        });
        jPanel1.add(bkid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 180, 40));

        borid.setFont(new java.awt.Font("Courier New", 0, 18)); // NOI18N
        borid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boridActionPerformed(evt);
            }
        });
        jPanel1.add(borid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 180, 40));

        jButton1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Book38.png"))); // NOI18N
        jButton1.setText("Return Book");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, -1, -1));

        jButton2.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, 133, -1));

        jButton3.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Book23.png"))); // NOI18N
        jButton3.setText("Renew");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bg.jpeg"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        //return button action
        if(bkid.getText().equals("")||borid.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please fill all fields !!","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try
            {
                //extracting the enter data by user
                String BKID = bkid.getText();
                String BORID = borid.getText();
                String ret_date = "";
                //taking the current date
                String DATE_FORMAT = "yyyy-MM-dd";//format of date
                Date currentDate = new Date();//current date
                //establishing the connection
                Connection con = connect.dbconnection();
                Statement st = con.createStatement();
                Statement st1 = con.createStatement();
                Statement st2 = con.createStatement();
                //checking the return date
                String s1 = "select RET_DATE from issued_books where BK_ID ='"+BKID+"' and BOR_ID = '"+BORID+"'";
                //changing the issued_books table
                String sql = "delete from issued_books where BK_ID='"+BKID+"' and BOR_ID ='"+BORID+"'";
                //changing the books table by decrementing the quantity
                String s = "update books set BK_QTY = BK_QTY + 1 where BK_ID='"+BKID+"'";
                
                ResultSet rs = st2.executeQuery(s1);
                if(rs.next())
                {
                     ret_date = rs.getString("RET_DATE");
                }
                Date date1 = new SimpleDateFormat(DATE_FORMAT).parse(ret_date);
          
                if(currentDate.after(date1))
                {
                  //showing fine msg for returning book late
                  JOptionPane.showMessageDialog(this,"Late in Returning Book, Pay fine of RS 200","Warning",JOptionPane.WARNING_MESSAGE);
                  st.executeUpdate(sql);
                  st1.executeUpdate(s);
                  //showing returned successful msg
                  JOptionPane.showMessageDialog(this,"Book Returned Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                 //clearing text field
                  bkid.setText("");
                  borid.setText("");
                }
                else
                {
                //deleting record from issued_books and incrementing book quantity
                st.executeUpdate(sql);
                st1.executeUpdate(s);
                //showing success message
                JOptionPane.showMessageDialog(this,"Book Returned Successfully","Success",JOptionPane.INFORMATION_MESSAGE);
                //Clearing the text field
                bkid.setText("");
                borid.setText("");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"Database Connection Failed","ERROR",JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        //close button action on  click
        //JOptionPane.showMessageDialog(this, "Sure to Leave ?","Warning",JOptionPane.WARNING_MESSAGE);
        this.setVisible(false);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        //renew button action
        if(bkid.getText().equals("")||borid.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please fill all fields !!","Error",JOptionPane.WARNING_MESSAGE);
        }
        else
        {
          String bk_id = bkid.getText();
          String bor_id = borid.getText();
          try
          {
             Connection con = connect.dbconnection();
             Statement st = con.createStatement();
               //taking the current date
               String DATE_FORMAT = "yyyy-MM-dd";//format of date
               DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT);//formater class object
               Date currentDate = new Date();//current date
               //adding 7 days to current date using calender class
               Calendar c = Calendar.getInstance();
               c.setTime(currentDate);
               c.add(Calendar.DATE,7);
               String ret_date = dateFormat.format(c.getTime());
               
               //query to update return date
               String sql = "update issued_books set RET_DATE = '"+ret_date+"' where BK_ID = '"+bk_id+"' and BOR_ID = '"+bor_id+"'";
               st.executeUpdate(sql);
               JOptionPane.showMessageDialog(this,"Book Renewed Successfully !","Success",JOptionPane.INFORMATION_MESSAGE);
               bkid.setText("");
               borid.setText("");
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(this,"Database Connection Failed","ERROR",JOptionPane.ERROR_MESSAGE);
              System.out.println(e);   
          }
        }
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
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Return.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Return j1 = new Return();
                ImageIcon img = new ImageIcon("C:\\Users\\DELL\\Downloads\\book18.png");
                j1.setIconImage(img.getImage());
                j1.setTitle("Return Book");
                j1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bkid;
    private javax.swing.JTextField borid;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
