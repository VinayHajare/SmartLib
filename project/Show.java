package project;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Show extends javax.swing.JFrame {

    public Show() {
        initComponents();
    }

    //download list of available books in the pdf format
    public void available_download()
    {
     try
     {
     String path = "";
     JFileChooser j = new JFileChooser();
     j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
     int x = j.showSaveDialog(this);
     if(x==JFileChooser.APPROVE_OPTION)
     {
         path = j.getSelectedFile().getPath();
     }
      Document doc = new Document();
        
            PdfWriter.getInstance(doc,new FileOutputStream(path+"/Available Books.pdf"));
            doc.open();
            PdfPTable tbl = new PdfPTable(6);
            //adding table header
            tbl.addCell("Book Id");
            tbl.addCell("Name ");
            tbl.addCell("Author");
            tbl.addCell("Publication");
            tbl.addCell("Price");
            tbl.addCell("Quantity");
            
            for(int i=0;i<t1.getRowCount();i++)
            {
               // extracting data from jtable
                String id = t1.getValueAt(i,0).toString();
                String name = t1.getValueAt(i,1).toString();
                String author = t1.getValueAt(i,2).toString();
                String publication = t1.getValueAt(i,3).toString();
                String price = t1.getValueAt(i,4).toString();
                String quantity = t1.getValueAt(i,5).toString();
                //adding data to pdf 
                tbl.addCell(id);
                tbl.addCell(name);
                tbl.addCell(author);
                tbl.addCell(publication);
                tbl.addCell(price);
                tbl.addCell(quantity);
            }
            doc.add(tbl);
            
        doc.close();
        JOptionPane.showMessageDialog(this,"File downloaded !!","Success",JOptionPane.INFORMATION_MESSAGE);
         }
        catch(FileNotFoundException | DocumentException ex)
        {
                System.out.println(ex);
        }
     }
    
    public void issued_download()
    {
     try{ 
         String path = "";
         JFileChooser j = new JFileChooser();
         j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
         int x = j.showSaveDialog(this);
         if(x==JFileChooser.APPROVE_OPTION)
           {
             path = j.getSelectedFile().getPath();
           }
            Document doc = new Document();
        
            PdfWriter.getInstance(doc,new FileOutputStream(path+"/Issued Books.pdf"));
            doc.open();
            PdfPTable tbl = new PdfPTable(7);
            //adding table header
            tbl.addCell("Book Id");
            tbl.addCell("Book Name");
            tbl.addCell("Borrower Id");
            tbl.addCell("Borrower Name");
            tbl.addCell("Borrower Contact");
            tbl.addCell("Issued Date");
            tbl.addCell("Returned Date");
            
            for(int i=0;i<t2.getRowCount();i++)
            {
               // extracting data from jtable
                String bkid = t2.getValueAt(i,0).toString();
                String bkname = t2.getValueAt(i,1).toString();
                String borid = t2.getValueAt(i,2).toString();
                String borname = t2.getValueAt(i,3).toString();
                String borcontact = t2.getValueAt(i,4).toString();
                String issued_date = t2.getValueAt(i,5).toString();
                String returned_date = t2.getValueAt(i,6).toString();
                //adding data to pdf 
                tbl.addCell(bkid);
                tbl.addCell(bkname);
                tbl.addCell(borid);
                tbl.addCell(borname);
                tbl.addCell(borcontact);
                tbl.addCell(issued_date);
                tbl.addCell(returned_date);
            }
            doc.add(tbl); 
            doc.close();
            JOptionPane.showMessageDialog(this,"File downloaded !!","Success",JOptionPane.INFORMATION_MESSAGE); 
         }
        catch(FileNotFoundException | DocumentException e)
        {
         System.out.println(e);
        }
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        t1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);

        jTabbedPane1.setBackground(new java.awt.Color(255, 0, 0));
        jTabbedPane1.setFont(new java.awt.Font("Magneto", 0, 18)); // NOI18N

        t1.setFont(new java.awt.Font("Bookman Old Style", 0, 14)); // NOI18N
        t1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NAME", "AUTHOR", "PUBLICATION", "PRICE", "QUANTITY"
            }
        ));
        jScrollPane1.setViewportView(t1);

        jButton2.setBackground(new java.awt.Color(255, 255, 0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Download");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 0));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setText("Show");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Book22.png"))); // NOI18N
        jButton5.setText("Close");
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addComponent(jButton2)
                .addGap(90, 90, 90)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 216, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 546, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Available Books", jPanel2);

        t2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Book ID", "Book Name", "Borrower ID", "Borrower Name", "Borrower Contact", "Issue Date", "Return Date"
            }
        ));
        jScrollPane2.setViewportView(t2);

        jButton1.setBackground(new java.awt.Color(255, 255, 0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("Download");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton4.setText("Show");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Book22.png"))); // NOI18N
        jButton6.setText("Close");
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jButton1)
                .addGap(122, 122, 122)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 166, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4)
                    .addComponent(jButton6))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Issued Books", jPanel3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
            available_download();
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Show button - issued books
        try
        {
            DefaultTableModel tbl = (DefaultTableModel) t2.getModel();
            tbl.setNumRows(0);
            Connection con = connect.dbconnection();
            Statement st = con.createStatement();
            String sql = "select * from issued_books";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                String BKID = rs.getString("BK_ID");
                String BKNAME = rs.getString("BK_NAME");
                String BORID = rs.getString("BOR_ID");
                String BORNAME = rs.getString("BOR_NAME");
                String BORCONTACT = rs.getString("BOR_CONTACT");
                String ISSDATE = rs.getString("ISS_DATE");
                String RETDATE = rs.getString("RET_DATE");
                
                String data[] = {BKID,BKNAME,BORID,BORNAME,BORCONTACT,ISSDATE,RETDATE};
                tbl.addRow(data);
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);  
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        //show button - avialable books
        try
        {
            DefaultTableModel tbl = (DefaultTableModel) t1.getModel();
            tbl.setNumRows(0);
            Connection con = connect.dbconnection();
            Statement st = con.createStatement();
            String sql = "select * from books";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next())
            {
                String BKID = rs.getString("BK_ID");
                String BKNAME = rs.getString("BK_NAME");
                String PUB = rs.getString("BK_PUB");
                String PRICE = rs.getString("BK_PRICE");
                String QUANTITY = rs.getString("BK_QTY");
                String AUTHOR = rs.getString("BK_AUTOR");
                
                String data[] = {BKID,BKNAME,AUTHOR,PUB,PRICE,QUANTITY};
                tbl.addRow(data);
            }
            
        }
        catch(Exception e)
        {
            System.out.println(e);  
        }
    }

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        //CLOSE
        //JOptionPane.showMessageDialog(this,"Sure to close ?", "Warning",JOptionPane.WARNING_MESSAGE);
        this.setVisible(false);
    }

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        //CLOSE
        //JOptionPane.showMessageDialog(this,"Sure to close ?", "Warning",JOptionPane.WARNING_MESSAGE);
        this.setVisible(false);
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

            //download issued books list
            issued_download();
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
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Show.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Show j1 = new Show();
                ImageIcon img = new ImageIcon("/Images/book16.png");
                j1.setIconImage(img.getImage());
                j1.setTitle("Show Books");
                j1.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable t1;
    private javax.swing.JTable t2;
    // End of variables declaration//GEN-END:variables
}
