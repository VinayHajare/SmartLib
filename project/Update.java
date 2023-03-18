package project;
import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

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

    @SuppressWarnings("unchecked")
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

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        jLabel1.setText("Book ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 70, 22));

        bkid.setFont(new java.awt.Font("Swis721 BlkEx BT", 0, 14)); // NOI18N
        bkid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkidActionPerformed(evt);
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
        bkname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bknameActionPerformed(evt);
            }
        });
        jPanel1.add(bkname, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 199, 32));

        author.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        author.setText("Author");
        jPanel1.add(author, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 102, 29));

        bkauthor.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        bkauthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkauthorActionPerformed(evt);
            }
        });
        jPanel1.add(bkauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 199, 32));

        pub.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        pub.setText("Publication");
        jPanel1.add(pub, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 102, 29));

        bkpub.setFont(new java.awt.Font("Centaur", 1, 20)); // NOI18N
        bkpub.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkpubActionPerformed(evt);
            }
        });
        jPanel1.add(bkpub, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 199, 32));

        price.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        price.setText("Price");
        jPanel1.add(price, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 102, 29));

        bkprice.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        bkprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkpriceActionPerformed(evt);
            }
        });
        jPanel1.add(bkprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 300, 199, 32));

        qty.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        qty.setText("Quantity");
        jPanel1.add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 102, 29));

        bkqty.setFont(new java.awt.Font("Castellar", 1, 18)); // NOI18N
        bkqty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkqtyActionPerformed(evt);
            }
        });
        jPanel1.add(bkqty, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 199, 32));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 420, 133, -1));

        jButton3.setFont(new java.awt.Font("Century Schoolbook", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Book23.png"))); // NOI18N
        jButton3.setText("Update");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, 120, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BG7.jpeg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 4, 660, 520));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 660, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        //close button action on  click
        //JOptionPane.showMessageDialog(this,"Sure to Leave ?","Message",JOptionPane.WARNING_MESSAGE);
        this.setVisible(false);
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        //update button action
        try
        {
           //fetching user enter data
           String ID = bkid.getText();
           String NAME = bkname.getText();
           String AUTHOR = bkauthor.getText();
           String PUB = bkpub.getText();
           String PRICE = bkprice.getText();
           String QTY = bkqty.getText();
           //establishing connection
           Connection con = connect.dbconnection();
           Statement st = con.createStatement();
           String sql = "update books set BK_NAME ='"+NAME+"',BK_AUTOR = '"+AUTHOR+"',BK_PUB = '"+PUB+"',BK_PRICE = '"+PRICE+"',BK_QTY= '"+QTY+"' where BK_ID = '"+ID+"'";
           st.executeUpdate(sql);
           JOptionPane.showMessageDialog(this,"Book updated Successfully","Success",JOptionPane.INFORMATION_MESSAGE); 
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this,"Database Connection Failed","ERROR",JOptionPane.ERROR_MESSAGE);
            System.out.println(e);
        }
        
           
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //fetch button action 
        if(bkid.getText().equals(""))
        {
          JOptionPane.showMessageDialog(this,"Please enter book id !","Error ",JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        try
        {
         String Id = bkid.getText();
         Connection con = connect.dbconnection();
         Statement st = con.createStatement();
         String sql = "select * from books where BK_ID ='"+Id+"'";
         ResultSet rs = st.executeQuery(sql);
         if(rs.next())
         {
           //extracting data from result set
           String Name = rs.getString("Bk_NAME");
           String Author = rs.getString("BK_AUTOR");
           String Pub = rs.getString("BK_PUB");
           String Price = rs.getString("BK_PRICE");
           String Qty = rs.getString("BK_QTY");
           //setting data to corresponding field
           bkname.setText(Name);
           bkauthor.setText(Author);
           bkpub.setText(Pub);
           bkprice.setText(Price);
           bkqty.setText(Qty);
           //setting label to visible
           name.setVisible(true);
           author.setVisible(true);
           pub.setVisible(true);
           price.setVisible(true);
           qty.setVisible(true);
           //setting textfield to visible
           bkname.setVisible(true);
           bkauthor.setVisible(true);
           bkprice.setVisible(true);
           bkpub.setVisible(true);
           bkqty.setVisible(true);
         }
         else
         {
             JOptionPane.showMessageDialog(this,"Invalid Book Id","Error",JOptionPane.ERROR_MESSAGE);
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
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                Update j = new Update();
                ImageIcon img = new ImageIcon("/Images/book15.png");
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
