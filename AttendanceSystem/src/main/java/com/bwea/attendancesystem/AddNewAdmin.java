/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bwea.attendancesystem;

import javax.swing.*;
import java.sql.*;


/**
 *
 * @author Sunali
 */
public class AddNewAdmin extends javax.swing.JFrame {

    /**
     * Creates new form AddNewAdmin
     */
    public AddNewAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    private void NewAdminSave(){
        HomeScreen hs = new HomeScreen();
        hs.setVisible(true);
        hs.pack();
        hs.setLocationRelativeTo(null);
        hs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
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
        lbl_fullnameNewAdmin = new javax.swing.JLabel();
        lbl_unameNewAdmin = new javax.swing.JLabel();
        lbl_passwordNewAdmin = new javax.swing.JLabel();
        btn_cancelNewAdminForm = new javax.swing.JButton();
        btn_saveNewAdminForm = new javax.swing.JButton();
        txt_fullNameNewAdmin = new javax.swing.JTextField();
        txt_unameNewAdmin = new javax.swing.JTextField();
        txt_passwordNewAdmin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        TopPanel.setBackground(new java.awt.Color(0, 0, 102));

        jLabelClose.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jLabel1.setText("New Admin Personal Data");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(218, 218, 218)
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
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TopPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_home)))
                    .addGroup(TopPanelLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(226, 156, 14));

        lbl_fullnameNewAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_fullnameNewAdmin.setForeground(new java.awt.Color(51, 51, 51));
        lbl_fullnameNewAdmin.setText("Full Name:");

        lbl_unameNewAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_unameNewAdmin.setForeground(new java.awt.Color(51, 51, 51));
        lbl_unameNewAdmin.setText("Username:");

        lbl_passwordNewAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_passwordNewAdmin.setForeground(new java.awt.Color(51, 51, 51));
        lbl_passwordNewAdmin.setText("Password:");

        btn_cancelNewAdminForm.setBackground(new java.awt.Color(204, 0, 0));
        btn_cancelNewAdminForm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_cancelNewAdminForm.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelNewAdminForm.setText("Cancel");
        btn_cancelNewAdminForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelNewAdminFormMouseClicked(evt);
            }
        });

        btn_saveNewAdminForm.setBackground(new java.awt.Color(0, 204, 0));
        btn_saveNewAdminForm.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_saveNewAdminForm.setForeground(new java.awt.Color(255, 255, 255));
        btn_saveNewAdminForm.setText("Save");
        btn_saveNewAdminForm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_saveNewAdminFormMouseClicked(evt);
            }
        });
        btn_saveNewAdminForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveNewAdminFormActionPerformed(evt);
            }
        });

        txt_fullNameNewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_fullNameNewAdminActionPerformed(evt);
            }
        });

        txt_passwordNewAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_passwordNewAdminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lbl_unameNewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_passwordNewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_fullnameNewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_unameNewAdmin)
                            .addComponent(txt_passwordNewAdmin)
                            .addComponent(txt_fullNameNewAdmin)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_cancelNewAdminForm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_saveNewAdminForm)))
                .addGap(167, 167, 167))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_fullNameNewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_fullnameNewAdmin))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_unameNewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_unameNewAdmin))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_passwordNewAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_passwordNewAdmin))
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_saveNewAdminForm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancelNewAdminForm, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(176, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
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

    private void txt_fullNameNewAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_fullNameNewAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_fullNameNewAdminActionPerformed

    private void txt_passwordNewAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_passwordNewAdminActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_passwordNewAdminActionPerformed

    private void btn_saveNewAdminFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_saveNewAdminFormMouseClicked
        String fullname = txt_fullNameNewAdmin.getText();
        String uname = txt_unameNewAdmin.getText();
        String pass = String.valueOf(txt_passwordNewAdmin.getPassword());
        
        if(fullname.equals("")){
            JOptionPane.showMessageDialog(null,"Cannot continue without a name");
        }
        else if(uname.equals("")){
            JOptionPane.showMessageDialog(null,"Please enter your username");
        }
        else if(pass.equals("")){
            JOptionPane.showMessageDialog(null,"Cannot continue without a password");
        }
        else if(checkUsername(uname)){
            JOptionPane.showMessageDialog(null,"Username already exist");
        }
        
        else {
        
        try{       
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8111/bwea","root","");
            PreparedStatement ps = con.prepareStatement("INSERT INTO `admin`(`fullname`, `username`, `password`) VALUES (?,?,?)");   
            ps.setString(1, fullname);
            ps.setString(2, uname);
            ps.setString(3, pass);
            
            int saveNew = JOptionPane.showConfirmDialog(this, "New Admin Added. Do you want to continue?", "Confirm", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
            
            if(saveNew == JOptionPane.YES_OPTION)
            {
                ps.executeUpdate();
                NewAdminSave();
            }
            }
        
        catch(SQLException e)
            {
            JOptionPane.showMessageDialog(null,e);
            JOptionPane.showMessageDialog(null,"Connection Failed.");
            
            }
        }
    }//GEN-LAST:event_btn_saveNewAdminFormMouseClicked

    private void btn_cancelNewAdminFormMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelNewAdminFormMouseClicked
        HomeScreen hs = new HomeScreen();
        hs.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btn_cancelNewAdminFormMouseClicked

    public boolean checkUsername(String uname){
        
        boolean checkUser = false;
        
        try{       
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8111/bwea","root","");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM `admin` WHERE `username` =?");   
            ps.setString(1, uname);
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                checkUser = true;
              }            
            }           
        catch(SQLException e)
            {
            JOptionPane.showMessageDialog(null,e);
            }
        return checkUser;
    }
    
    private void btn_saveNewAdminFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveNewAdminFormActionPerformed
        
    }//GEN-LAST:event_btn_saveNewAdminFormActionPerformed

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
            java.util.logging.Logger.getLogger(AddNewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddNewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddNewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddNewAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton btn_cancelNewAdminForm;
    private javax.swing.JLabel btn_home;
    private javax.swing.JButton btn_saveNewAdminForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_fullnameNewAdmin;
    private javax.swing.JLabel lbl_passwordNewAdmin;
    private javax.swing.JLabel lbl_unameNewAdmin;
    private javax.swing.JTextField txt_fullNameNewAdmin;
    private javax.swing.JPasswordField txt_passwordNewAdmin;
    private javax.swing.JTextField txt_unameNewAdmin;
    // End of variables declaration//GEN-END:variables
}
