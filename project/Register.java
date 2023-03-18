package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static project.connect.dbconnection;

public class Register extends javax.swing.JFrame {

    public Register() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        password = new javax.swing.JTextField();
        mobile = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        ulab = new javax.swing.JLabel();
        elab = new javax.swing.JLabel();
        mlab = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 227, 206));
        jPanel1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Engravers MT", 1, 70)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Registration Page");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(420, 80, 1180, 120);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book1.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(60, 40, 1790, 170);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Century Schoolbook", 1, 45)); // NOI18N
        jLabel3.setText("Username     :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(420, 60, 314, 55);

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Century Schoolbook", 1, 45)); // NOI18N
        jLabel4.setText("Password     :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(420, 340, 320, 55);

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Century Schoolbook", 1, 45)); // NOI18N
        jLabel5.setText("Mobile-No    :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(420, 490, 330, 55);

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Century Schoolbook", 1, 45)); // NOI18N
        jLabel6.setText("E-Mail           :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(420, 190, 340, 55);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book2.jpg"))); // NOI18N
        jLabel8.setText("jLabel7");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(260, 20, 120, 120);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book8.jpg"))); // NOI18N
        jPanel2.add(jLabel10);
        jLabel10.setBounds(260, 310, 150, 120);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book9.png"))); // NOI18N
        jLabel11.setText("jLabel7");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(260, 160, 120, 120);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book10.png"))); // NOI18N
        jLabel12.setText("jLabel7");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(260, 470, 120, 120);

        username.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        username.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                usernameKeyTyped(evt);
            }
        });
        jPanel2.add(username);
        username.setBounds(945, 42, 623, 47);

        email.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                emailKeyTyped(evt);
            }
        });
        jPanel2.add(email);
        email.setBounds(945, 192, 623, 55);

        password.setFont(new java.awt.Font("Courier New", 1, 20)); // NOI18N
        password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordActionPerformed(evt);
            }
        });
        password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passwordKeyTyped(evt);
            }
        });
        jPanel2.add(password);
        password.setBounds(945, 341, 623, 57);

        mobile.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        mobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mobileKeyTyped(evt);
            }
        });
        jPanel2.add(mobile);
        mobile.setBounds(945, 496, 623, 52);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book5.jpg"))); // NOI18N
        jButton2.setText("Log In");
        jButton2.setBorderPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(1320, 610, 380, 60);

        ulab.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        ulab.setForeground(new java.awt.Color(255, 0, 0));
        ulab.setText("*");
        jPanel2.add(ulab);
        ulab.setBounds(1573, 57, 205, 17);

        elab.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        elab.setForeground(new java.awt.Color(255, 0, 0));
        elab.setText("*");
        jPanel2.add(elab);
        elab.setBounds(1573, 211, 205, 17);

        mlab.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        mlab.setForeground(new java.awt.Color(255, 0, 0));
        mlab.setText("*");
        jPanel2.add(mlab);
        mlab.setBounds(1573, 514, 205, 17);

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/book5.jpg"))); // NOI18N
        jButton3.setText("Register");
        jButton3.setBorderPainted(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3);
        jButton3.setBounds(840, 610, 380, 60);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(60, 240, 1790, 700);

        jPanel4.setBackground(new java.awt.Color(132, 51, 51));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1790, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(60, 20, 1790, 10);

        jPanel3.setBackground(new java.awt.Color(132, 51, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1790, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(60, 960, 1790, 10);

        jPanel6.setBackground(new java.awt.Color(132, 51, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1790, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6);
        jPanel6.setBounds(60, 220, 1790, 10);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1920, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }

    private void usernameKeyTyped(java.awt.event.KeyEvent evt) {
       
        String user= username.getText();
        String PATTERN = "^[A-Za-z]+$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match = patt.matcher(user);
        if(!match.matches())
        {
            ulab.setText("*Username must contain 2 characters");
        }
        else
        {
            ulab.setText(null);
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        
        Login f2 = new Login();
        f2.show();//displaying Login_Form
        dispose();//close current Register Page after Opening the Login Page
    }

    private void mobileKeyTyped(java.awt.event.KeyEvent evt) {
        String value = mobile.getText();
        int length = value.length();
     
        if(evt.getKeyChar() >= '0' && evt.getKeyChar() <= '9' && length != 10)
        {
            
            if((value.indexOf("7") == 0) || (value.indexOf("8") == 0) || (value.indexOf("9") == 0))
            {
                mlab.setText("Must contain 10 digits");
                //mlab.setText(null);
            }
            else
            {
                mlab.setText("Must start with 7, 8 or 9");
            }
         
        }
        
        else 
        {
            //mobile.setEditable(false);
        }
    }//GEN-LAST:event_mobileKeyTyped

    private void emailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailKeyTyped
        // TODO add your handling code here:
        String emailid;
        emailid = "^[a-zA-Z0-9]{2,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern patt = Pattern.compile(emailid);
        Matcher match = patt.matcher(email.getText());
        if(!match.matches())
        {
            elab.setText("*Email is incorrect");
        }
        else
        {
            elab.setText(null);
        }
    }

    private void passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordActionPerformed
        // TODO add your handling code here:
        String pass = password.getText();
    }//GEN-LAST:event_passwordActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //validating form by checking whether user has fill all data or not 
        if(username.getText().equals("")||mobile.getText().equals("") || password.getText().equals("")||email.getText().equals(""))
        {
        //showing error message
        JOptionPane.showMessageDialog(this, "Error :: Please enter data !!!");
        }
        else
        {
        try
        {
            if(ulab.getText()==null && elab.getText()==null && mlab.getText()== null)
            {
            PreparedStatement pst=null;
            String query = "insert into lib1 values(?,?,?,?)";
            Connection con = connect.dbconnection();
            pst=con.prepareStatement(query);
            pst.setString(1, username.getText());
            pst.setString(2, email.getText());
            pst.setString(4, mobile.getText());
            pst.setString(3, password.getText().toString());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Registered successfully !!","Success",JOptionPane.OK_OPTION);
            //clearing the text fields
            username.setText("");
            mobile.setText("");
            password.setText("");
            email.setText("");
            email.setEditable(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Invalid details entered !");
                //clearing the text fields
                username.setText("");
                mobile.setText("");
                password.setText("");
                email.setText("");
                email.setEditable(true);
            }

        }
        catch (Exception ex)
        {
            JOptionPane.showMessageDialog(this,"Database Connection Failed !","ERROR",JOptionPane.ERROE_MESSAGE);
            System.out.println(ex);
        }
      }
    }

    public static void main(String args[]) throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
 
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               Register j1 = new Register();
                        ImageIcon img = new ImageIcon("/Images/registration.png");
                        j1.setIconImage(img.getImage());
                        j1.setTitle("Register Page");
                        j1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel elab;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel mlab;
    private javax.swing.JTextField mobile;
    private javax.swing.JTextField password;
    private javax.swing.JLabel ulab;
    private javax.swing.JTextField username;
    // End of variables declaration//GEN-END:variables



}
