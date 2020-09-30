/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bwea.attendancesystem;


import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.*;




/**
 *
 * @author Sunali
 */
public class AddNewStudent extends javax.swing.JFrame {

    /**
     * Creates new form AddNewStudent
     */
    public AddNewStudent() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    private void NewStudentSave(){
        AddNewStudent ads = new AddNewStudent ();
        ads.setVisible(true);
        ads.pack();
        ads.setLocationRelativeTo(null);
        ads.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TopPanel = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        btn_home = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btn_cancelNewStuForm = new javax.swing.JButton();
        btn_saveNewStuForm = new javax.swing.JButton();
        txt_payableNewStudent = new javax.swing.JTextField();
        txt_coursenameNewStudent = new javax.swing.JTextField();
        txt_emailNewStudent = new javax.swing.JTextField();
        txt_addressNewStudent = new javax.swing.JTextField();
        txt_fullNameNewStudent = new javax.swing.JTextField();
        lbl_fullnameNewStudent = new javax.swing.JLabel();
        lbl_addressNewStudent = new javax.swing.JLabel();
        lbl_emailNewStudent = new javax.swing.JLabel();
        lbl_coursenameNewStudent = new javax.swing.JLabel();
        lbl_payableNewStudent = new javax.swing.JLabel();
        btn_uploadexcel = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        TopPanel.setBackground(new java.awt.Color(0, 0, 102));

        jLabelClose.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabelClose.setText("X");
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabelMin.setText("-");
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        btn_home.setBackground(new java.awt.Color(153, 153, 153));
        btn_home.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        btn_home.setForeground(new java.awt.Color(255, 255, 255));
        btn_home.setText("Home");
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("New Student Personal Data");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(388, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(230, 230, 230)
                .addComponent(btn_home)
                .addGap(30, 30, 30)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_home))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );

        jPanel1.setBackground(new java.awt.Color(226, 156, 14));

        btn_cancelNewStuForm.setBackground(new java.awt.Color(204, 0, 0));
        btn_cancelNewStuForm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_cancelNewStuForm.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelNewStuForm.setText("Cancel");
        btn_cancelNewStuForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelNewStuFormMouseClicked(evt);
            }
        });

        btn_saveNewStuForm.setBackground(new java.awt.Color(0, 204, 0));
        btn_saveNewStuForm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_saveNewStuForm.setForeground(new java.awt.Color(255, 255, 255));
        btn_saveNewStuForm.setText("Save");
        btn_saveNewStuForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_saveNewStuFormMouseClicked(evt);
            }
        });

        txt_fullNameNewStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fullNameNewStudentActionPerformed(evt);
            }
        });

        lbl_fullnameNewStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_fullnameNewStudent.setForeground(new java.awt.Color(51, 51, 51));
        lbl_fullnameNewStudent.setText("Full Name:");

        lbl_addressNewStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_addressNewStudent.setForeground(new java.awt.Color(51, 51, 51));
        lbl_addressNewStudent.setText("Address:");

        lbl_emailNewStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_emailNewStudent.setForeground(new java.awt.Color(51, 51, 51));
        lbl_emailNewStudent.setText("Email: ");

        lbl_coursenameNewStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_coursenameNewStudent.setForeground(new java.awt.Color(51, 51, 51));
        lbl_coursenameNewStudent.setText("Course Name:");

        lbl_payableNewStudent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_payableNewStudent.setForeground(new java.awt.Color(51, 51, 51));
        lbl_payableNewStudent.setText("Payable:");

        btn_uploadexcel.setText("Upload Excel File");
        btn_uploadexcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_uploadexcelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(196, 196, 196)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_coursenameNewStudent)
                    .addComponent(lbl_addressNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fullnameNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_emailNewStudent)
                    .addComponent(lbl_payableNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_uploadexcel, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_cancelNewStuForm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_saveNewStuForm))
                    .addComponent(txt_fullNameNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txt_emailNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_addressNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_coursenameNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_payableNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fullnameNewStudent)
                    .addComponent(txt_fullNameNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_addressNewStudent)
                    .addComponent(txt_addressNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_emailNewStudent)
                    .addComponent(txt_emailNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_coursenameNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_coursenameNewStudent))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_payableNewStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_payableNewStudent))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancelNewStuForm)
                    .addComponent(btn_saveNewStuForm)
                    .addComponent(btn_uploadexcel))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);

    }//GEN-LAST:event_jLabelMinMouseClicked

    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        HomeScreen hs = new HomeScreen();
        hs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_homeMouseClicked

    private void txt_fullNameNewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fullNameNewStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fullNameNewStudentActionPerformed

    private void btn_cancelNewStuFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelNewStuFormMouseClicked
        HomeScreen hs = new HomeScreen();
        hs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelNewStuFormMouseClicked

    private void btn_saveNewStuFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveNewStuFormMouseClicked
        String stu_fname = txt_fullNameNewStudent.getText();
        String stu_address = txt_addressNewStudent.getText();
        String stu_email = txt_emailNewStudent.getText();
        String stu_coursename = txt_coursenameNewStudent.getText();
        String stu_payment = txt_payableNewStudent.getText();
        
        if(stu_fname.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter a name of the student.");
        }
        else if(stu_coursename.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the coursename.");
        }
        else if(stu_payment.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter the amount to be paid.");
        }
        else {
        
        try{       
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8111/bwea","root","");
            PreparedStatement ps = con.prepareStatement("INSERT INTO `student`(`fullname`, `address`, `email`, `coursename`, `payment`) VALUES (?,?,?,?,?)");   
            ps.setString(1, stu_fname);
            ps.setString(2, stu_address);
            ps.setString(3, stu_email);
            ps.setString(4, stu_coursename);
            ps.setInt(5, Integer.parseInt(stu_payment));

            int saveNew = JOptionPane.showConfirmDialog(this, "Save new student?", "Confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if(saveNew == JOptionPane.YES_OPTION)
            {
                ps.executeUpdate();
                NewStudentSave();
            }
                    
            }
        
        catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
                JOptionPane.showMessageDialog(null,"Connection failed");
            
            }
        }
    }//GEN-LAST:event_btn_saveNewStuFormMouseClicked

    private void btn_uploadexcelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_uploadexcelMouseClicked
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            System.out.println("Selected file: " + selectedFile.getAbsolutePath());
          
            
 
         try{ 
              int batchSize = 9;
             String excelFilePath = "C:/Users/Acer/LMS.xlsx";
             
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8111/bwea","root","");
             con.setAutoCommit(false);
            PreparedStatement ps = con.prepareStatement("INSERT INTO student (`No`,`Refference No`,`Registration No`,`Name`,`Contact No`,`Branch`,`Course`,`Total Fee`,`Discounts`,`Payable`,`Received Payment`,`Refunds`,`Due`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)"); 
            
             FileInputStream inputStream = new FileInputStream(excelFilePath);
             Workbook workbook = new XSSFWorkbook(inputStream);
              Sheet firstSheet = workbook.getSheetAt(0);
                Iterator<Row> rowIterator = firstSheet.iterator();
            
            int count=0;
            
             
              rowIterator.next(); // skip the header row
              
              while (rowIterator.hasNext()) {
                Row nextRow = rowIterator.next();
                Iterator<Cell> cellIterator = nextRow.cellIterator();
 
                while (cellIterator.hasNext()) {
                    Cell nextCell = cellIterator.next();
 
                    int columnIndex = nextCell.getColumnIndex();
 
                    switch (columnIndex) {
                    case 0:
                        int No = (int)nextCell.getNumericCellValue();
                        ps.setInt(1, No);
                        break;
                    case 1:
                        int Refference_No = (int)nextCell.getNumericCellValue();
                        ps.setInt(2, Refference_No);
                        break;
                    case 2:
                        int Registration_No = (int)nextCell.getNumericCellValue();
                        ps.setInt(3, Registration_No);
                        break;
                    case 3:
                        String Name = nextCell.getStringCellValue();
                        ps.setString(4, Name);
                        break;    
                    case 4:
                        int Contact_No = (int)nextCell.getNumericCellValue();
                        ps.setInt(5, Contact_No);
                        break;
                    case 5:
                        String Branch = nextCell.getStringCellValue();
                        ps.setString(6, Branch);
                        break;
                    case 6:
                        String Course = nextCell.getStringCellValue();
                        ps.setString(7, Course);
                        break;      
                    case 7:
                        int Total_Fee = (int)nextCell.getNumericCellValue();
                        ps.setInt(8, Total_Fee);
                        break;     
                     case 8:
                        int Discounts = (int)nextCell.getNumericCellValue();
                        ps.setInt(9, Discounts);
                        break;    
                    case 9:
                        int Payable = (int)nextCell.getNumericCellValue();
                        ps.setInt(10, Payable);
                        break;     
                    case 10:
                        int Received_Payment = (int)nextCell.getNumericCellValue();
                        ps.setInt(11, Received_Payment);
                        break; 
                    case 11:
                        int Refunds = (int)nextCell.getNumericCellValue();
                        ps.setInt(12, Refunds);
                        break;
                    case 12:
                        int Due = (int)nextCell.getNumericCellValue();
                        ps.setInt(13, Due);
                        break;     
//                    case 13:
//                        String Action = nextCell.getStringCellValue();
//                        ps.setString(14, Action);
//                        break;    
//                    case 14:
//                        String Barcode = nextCell.getStringCellValue();
//                        ps.setString(15, Barcode);
//                         break; 
//                    
                    }
 
                }
                 
                ps.addBatch();
                 
                if (count % batchSize == 0) {
                    ps.executeBatch();
                }              
 
            }
              workbook.close();
              ps.executeBatch();
              con.commit();
              con.close();
              
              
              
            
         }
         catch(SQLException e){
             JOptionPane.showMessageDialog(null,e);
         } catch (IOException ex) {
            Logger.getLogger(AddNewStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }      
    }//GEN-LAST:event_btn_uploadexcelMouseClicked

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
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton btn_cancelNewStuForm;
    private javax.swing.JLabel btn_home;
    private javax.swing.JButton btn_saveNewStuForm;
    private javax.swing.JButton btn_uploadexcel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_addressNewStudent;
    private javax.swing.JLabel lbl_coursenameNewStudent;
    private javax.swing.JLabel lbl_emailNewStudent;
    private javax.swing.JLabel lbl_fullnameNewStudent;
    private javax.swing.JLabel lbl_payableNewStudent;
    private javax.swing.JTextField txt_addressNewStudent;
    private javax.swing.JTextField txt_coursenameNewStudent;
    private javax.swing.JTextField txt_emailNewStudent;
    private javax.swing.JTextField txt_fullNameNewStudent;
    private javax.swing.JTextField txt_payableNewStudent;
    // End of variables declaration//GEN-END:variables
}
