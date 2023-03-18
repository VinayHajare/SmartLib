package project;

import javax.swing.*;
import java.sql.*;

public class Search extends javax.swing.JFrame {

    public Search() {
        initComponents();
        name.setVisible(false);
        id.setVisible(false);
        bkid.setVisible(false);
        bkname.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        rid = new javax.swing.JRadioButton();
        rname = new javax.swing.JRadioButton();
        id = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        bkname = new javax.swing.JTextField();
        bkid = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        buttonGroup1.add(rid);
        rid.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        rid.setText("Book Id");
        rid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ridMouseClicked(evt);
            }
        });
        rid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ridActionPerformed(evt);
            }
        });
        jPanel1.add(rid, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 34, -1, -1));

        buttonGroup1.add(rname);
        rname.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        rname.setText("Book Name");
        rname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rnameMouseClicked(evt);
            }
        });
        rname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rnameActionPerformed(evt);
            }
        });
        jPanel1.add(rname, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 34, -1, -1));

        id.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        id.setText("Book ID");
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        name.setFont(new java.awt.Font("Microsoft YaHei", 1, 18)); // NOI18N
        name.setText("Book Name");
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, -1, -1));

        bkname.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jPanel1.add(bkname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, 208, 38));

        bkid.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jPanel1.add(bkid, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 208, 40));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 133, -1));

        jButton1.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Book25.png"))); // NOI18N
        jButton1.setText("Search Book");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BK1.jpeg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 660, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        //close button action on  click
        //JOptionPane.showMessageDialog(this, "Sure to Leave ?","Warning",JOptionPane.WARNING_MESSAGE);
        this.setVisible(false);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        //search button action
        if(bkid.getText().equals("") && bkname.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Please fill all fields !!","Error",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            try
            {
                String BKID = null;
                String BKNAME = null;
                //extracting the enter data by user
                if(rid.isSelected())
                {
                   BKID = bkid.getText();
                }
                if(rname.isSelected())
                {
                   BKNAME = bkname.getText();
                }
                Connection con = connect.dbconnection();
                Statement st = con.createStatement();
                String sql = "Select * from books where BK_ID='"+BKID+"' or BK_NAME = '"+BKNAME+"'";
                ResultSet rs = st.executeQuery(sql);
                if(rs.next())
                {
                  int qty = Integer.parseInt(rs.getString("BK_QTY"));
                  if(qty==0)
                  {
                      bkname.setText("");
                      bkid.setText("");
                      JOptionPane.showMessageDialog(this,"Book Avialable with 0 quantity","Warning",JOptionPane.WARNING_MESSAGE);
                  }
                  else
                  { 
                      bkname.setText("");
                      bkid.setText("");  
                      JOptionPane.showMessageDialog(this,"Book Found ! Quantity = "+qty,"Success",JOptionPane.INFORMATION_MESSAGE);
                  }
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"No such book available in library !!","Error",JOptionPane.ERROR_MESSAGE);
                    bkname.setText("");
                    bkid.setText("");
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"Database Connection Failed","ERROR",JOptionPane.ERROR_MESSAGE);
                System.out.println(e);
            }
        }
    }

    private void rnameMouseClicked(java.awt.event.MouseEvent evt) {
        //when selected book name 
        name.setVisible(true);
        bkname.setVisible(true);
        id.setVisible(false);
        bkid.setVisible(false);
    }

    private void ridMouseClicked(java.awt.event.MouseEvent evt) {
        //when selected book id
        id.setVisible(true);
        bkid.setVisible(true);
        name.setVisible(false);
        bkname.setVisible(false);
    }

    private void rnameActionPerformed(java.awt.event.ActionEvent evt) {
        //when selected book name
        name.setVisible(true);
        bkname.setVisible(true);
        id.setVisible(false);
        bkid.setVisible(false);
    }

    private void ridActionPerformed(java.awt.event.ActionEvent evt) {
        //when selected book id
        id.setVisible(true);
        bkid.setVisible(true);
        name.setVisible(false);
        bkname.setVisible(false);
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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Search j1 = new Search();
                ImageIcon img = new ImageIcon("/Images/book14.png");
                j1.setIconImage(img.getImage());
                j1.setTitle("Search Book");
                j1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bkid;
    private javax.swing.JTextField bkname;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JRadioButton rid;
    private javax.swing.JRadioButton rname;
    // End of variables declaration//GEN-END:variables
}
