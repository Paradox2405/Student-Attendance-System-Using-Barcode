/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bwea.attendancesystem;

import java.awt.Desktop;
import java.lang.String;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class UploadExcel extends javax.swing.JFrame {

    /**
     * Creates new form UploadExcel
     */
    public UploadExcel() {
        initComponents();
        this.setLocationRelativeTo(null);
        dropdown();
        g.add(btn1);
        g.add(btn2);
    }
    
     private void dropdown(){
        selectStudentsDb.addItem("Two Month Diploma in English");
        selectStudentsDb.addItem("Two Month Advance Certificate - English");
        selectStudentsDb.addItem("Two Month Certificate - English");
        selectStudentsDb.addItem("Three Month Diploma - English");
        selectStudentsDb.addItem("English + IT");
        selectStudentsDb.addItem("TOIC");
        selectStudentsDb.addItem("IELTS");
        selectStudentsDb.addItem("Weekend English");
        selectStudentsDb.addItem("Night - English");
        selectStudentsDb.addItem("KIDS");
        selectStudentsDb.addItem("Foundation in ICT");
        selectStudentsDb.addItem("Diploma in Information Technology");
        selectStudentsDb.addItem("Diploma in Software Engineering");
        selectStudentsDb.addItem("Diploma in Web Designing");
        selectStudentsDb.addItem("Diploma in Graphic Designing");
        selectStudentsDb.addItem("Foundation in Arduino Programming");
        selectStudentsDb.addItem("Diploma in Android Application Development");    
    }
     
    private void openselector() throws IOException{
        JFileChooser fileChooser = new JFileChooser();
        int returnValue = fileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION){
            File selectedFile = fileChooser.getSelectedFile();
            Desktop.getDesktop().open(selectedFile);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        g = new javax.swing.ButtonGroup();
        TopPanel = new javax.swing.JPanel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        btn_home = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        btn_selectexcel = new javax.swing.JButton();
        selectStudentsDb = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        btn1 = new javax.swing.JRadioButton();
        btn2 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setUndecorated(true);

        TopPanel.setBackground(new java.awt.Color(0, 0, 102));

        jLabelClose.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
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
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Upload Excel");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(145, 145, 145)
                .addComponent(btn_home)
                .addGap(18, 18, 18)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
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
                .addContainerGap(23, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(14, 14, 14))
        );

        MainPanel.setBackground(new java.awt.Color(204, 204, 255));

        btn_selectexcel.setBackground(new java.awt.Color(0, 0, 102));
        btn_selectexcel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_selectexcel.setForeground(new java.awt.Color(255, 255, 255));
        btn_selectexcel.setText("Select Excel");
        btn_selectexcel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_selectexcel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_selectexcelMouseClicked(evt);
            }
        });

        selectStudentsDb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectStudentsDb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Course" }));
        selectStudentsDb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Select all columns when updating or adding new courses");

        btn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn1.setText("Add new students to course");
        btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        btn2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn2.setText("Update course payment details");
        btn2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(selectStudentsDb, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                            .addComponent(btn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addContainerGap(179, Short.MAX_VALUE)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                        .addComponent(btn_selectexcel, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249))))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(selectStudentsDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn1)
                .addGap(18, 18, 18)
                .addComponent(btn2)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_selectexcel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
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

    private void btn_selectexcelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_selectexcelMouseClicked
        if(btn1.isSelected()){
            try {
               openselector();
            } 
            catch (IOException ex) {
                Logger.getLogger(UploadExcel.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
        else if (btn2.isSelected()){
            String course=(String)selectStudentsDb.getSelectedItem();
            try{
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8111/bwea","root","root");
                PreparedStatement ps = con.prepareStatement("UPDATE `"+course+"` SET `Discounts`=NULL,"
                    + "`Payable`=NULL,`Received Payment` = NULL,`Refunds`=NULL,`Due`=NULL");
 
                int saveNew = JOptionPane.showConfirmDialog(this,
                    "Do you want to change values?", "Confirm", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
            
                if(saveNew == JOptionPane.YES_OPTION){
                    ps.execute();
                    ResultSet rs=ps.getResultSet();
            
                if(rs==null){
                    openselector();
                }
           
                else{
                    JOptionPane.showMessageDialog(null,"Please select course!");
                }
                }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Please select course!");
                e.printStackTrace();
            } 
            catch (IOException ex){ 
                Logger.getLogger(UploadExcel.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }
        else{
            JOptionPane.showMessageDialog(null,"Please select a button!");
        }
    }//GEN-LAST:event_btn_selectexcelMouseClicked

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
            java.util.logging.Logger.getLogger(UploadExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UploadExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UploadExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UploadExcel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadExcel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JRadioButton btn1;
    private javax.swing.JRadioButton btn2;
    private javax.swing.JLabel btn_home;
    private javax.swing.JButton btn_selectexcel;
    private javax.swing.ButtonGroup g;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JComboBox<String> selectStudentsDb;
    // End of variables declaration//GEN-END:variables
}
