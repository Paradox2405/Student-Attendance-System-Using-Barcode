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
 * @author Acer
 */
public class UpdateStudentDetails extends javax.swing.JFrame {

    /**
     * Creates new form UpdateStudentDetails
     */
    public UpdateStudentDetails() {
        initComponents();
        dropdown();
        this.setLocationRelativeTo(null);
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
    
    public void GoHomeScreen(){
        HomeScreen hs = new HomeScreen();
        hs.setVisible(true);
        hs.setExtendedState(JFrame.MAXIMIZED_BOTH); 
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
        btn_home = new javax.swing.JLabel();
        jLabelClose = new javax.swing.JLabel();
        jLabelMin = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        MainPanel = new javax.swing.JPanel();
        txt_barcode = new javax.swing.JTextField();
        btn_enter = new javax.swing.JButton();
        txt_regno = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_contactno = new javax.swing.JTextField();
        txt_refno = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        btn_editstu1 = new javax.swing.JButton();
        txt_branch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_course = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txt_disc = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_pay = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_recieved = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_refunds = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_dues = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txt_actions = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        selectStudentsDb = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1392, 805));

        TopPanel.setBackground(new java.awt.Color(0, 0, 102));

        btn_home.setBackground(new java.awt.Color(153, 153, 153));
        btn_home.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        btn_home.setForeground(new java.awt.Color(255, 255, 255));
        btn_home.setText("Home");
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
        });

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

        jLabel2.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Update Student Details");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(468, 468, 468)
                .addComponent(btn_home)
                .addGap(18, 18, 18)
                .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TopPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelClose, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_home)
                            .addComponent(jLabelMin, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(TopPanelLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        MainPanel.setBackground(new java.awt.Color(204, 204, 255));

        txt_barcode.setBackground(new java.awt.Color(255, 255, 255));
        txt_barcode.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_barcode.setName(""); // NOI18N

        btn_enter.setBackground(new java.awt.Color(0, 0, 102));
        btn_enter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_enter.setForeground(new java.awt.Color(255, 255, 255));
        btn_enter.setText("Search Barcode");
        btn_enter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_enter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enterActionPerformed(evt);
            }
        });

        txt_contactno.setSelectedTextColor(new java.awt.Color(204, 0, 0));

        jLabel1.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Refference No");

        jLabel3.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Registration No");

        jLabel6.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Contact No");

        jLabel7.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Name");

        btn_cancel.setBackground(new java.awt.Color(255, 255, 255));
        btn_cancel.setFont(new java.awt.Font("Product Sans", 0, 12)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(0, 0, 0));
        btn_cancel.setText("Cancel");
        btn_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_cancelMouseClicked(evt);
            }
        });

        btn_editstu1.setBackground(new java.awt.Color(0, 0, 102));
        btn_editstu1.setFont(new java.awt.Font("Product Sans", 1, 12)); // NOI18N
        btn_editstu1.setForeground(new java.awt.Color(255, 255, 255));
        btn_editstu1.setText("Update");
        btn_editstu1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 102, 255), new java.awt.Color(0, 0, 204), null, null));
        btn_editstu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_editstu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_editstu1MouseClicked(evt);
            }
        });

        txt_branch.setSelectedTextColor(new java.awt.Color(204, 0, 0));

        jLabel8.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Branch");

        txt_course.setSelectedTextColor(new java.awt.Color(204, 0, 0));

        jLabel9.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Course");

        txt_total.setSelectedTextColor(new java.awt.Color(204, 0, 0));

        jLabel10.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Total Fee");

        txt_disc.setSelectedTextColor(new java.awt.Color(204, 0, 0));

        jLabel11.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Discounts");

        txt_pay.setSelectedTextColor(new java.awt.Color(204, 0, 0));

        jLabel12.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Payable");

        txt_recieved.setSelectedTextColor(new java.awt.Color(204, 0, 0));

        jLabel13.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 0));
        jLabel13.setText("Received Payment");

        txt_refunds.setSelectedTextColor(new java.awt.Color(204, 0, 0));

        jLabel14.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Refunds");

        txt_dues.setSelectedTextColor(new java.awt.Color(204, 0, 0));

        jLabel15.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Due");

        txt_actions.setSelectedTextColor(new java.awt.Color(204, 0, 0));

        jLabel16.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Actions");

        selectStudentsDb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectStudentsDb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Course" }));
        selectStudentsDb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(17, 17, 17)
                                .addComponent(txt_refno, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_regno, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txt_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txt_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_course)
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                                        .addComponent(txt_disc, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txt_contactno, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel15))
                                .addGap(23, 23, 23)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_dues, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_actions, javax.swing.GroupLayout.PREFERRED_SIZE, 508, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(MainPanelLayout.createSequentialGroup()
                                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_editstu1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel13))
                                .addGap(18, 18, 18)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_refunds, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_pay)
                                        .addComponent(txt_recieved, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(18, 18, 18)
                        .addComponent(btn_enter))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(507, 507, 507)
                        .addComponent(selectStudentsDb, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(324, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(selectStudentsDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_barcode)
                    .addComponent(btn_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_refno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txt_regno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_contactno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_branch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_course, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(txt_disc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_recieved, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(txt_refunds, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_dues, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(txt_actions, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addGap(34, 34, 34)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_editstu1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(92, 92, 92))
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
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        GoHomeScreen();
    }//GEN-LAST:event_btn_homeMouseClicked

    private void btn_enterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enterActionPerformed
      //Function f = new Function();
      //ResultSet rs;
      //String barcode = txt_barcode.getText();
        if(txt_barcode.getText()!=null){
            try{
                String table = (String)selectStudentsDb.getSelectedItem();
           
              //int bar = Integer.parseInt(barcode);
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8111/bwea","root","root");
                PreparedStatement ps = con.prepareStatement("SELECT * FROM "+table+" WHERE `Barcode` = '" +txt_barcode.getText()+"'");
                ResultSet rs = ps.executeQuery();
            
                if(rs.next()){
                    txt_refno.setText(rs.getString("Refference No")); 
                    txt_regno.setText(rs.getString("Registration No"));
                    txt_name.setText(rs.getString("Name"));
                    txt_contactno.setText(rs.getString("Contact No"));
                    txt_branch.setText(rs.getString("Branch"));
                    txt_course.setText(rs.getString("Course"));
                    txt_total.setText(rs.getString("Total Fee"));
                    txt_disc.setText(rs.getString("Discounts"));
                    txt_pay.setText(rs.getString("Payable"));
                    txt_recieved.setText(rs.getString("Received Payment"));
                    txt_refunds.setText(rs.getString("Refunds"));
                    txt_dues.setText(rs.getString("Due"));
                    txt_actions.setText(rs.getString("Action"));
                }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Barcode Does Not Exist");
                System.out.println(e);
                txt_refno.setText(null); 
                txt_regno.setText(null);
                txt_name.setText(null);
                txt_contactno.setText(null);
                txt_branch.setText(null);
                txt_course.setText(null);
                txt_total.setText(null);
                txt_disc.setText(null);
                txt_pay.setText(null);
                txt_recieved.setText(null);
                txt_refunds.setText(null);
                txt_dues.setText(null);
                txt_actions.setText(null);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"Incorrect Details");
        }
    }//GEN-LAST:event_btn_enterActionPerformed

    private void btn_cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_cancelMouseClicked
        GoHomeScreen();
    }//GEN-LAST:event_btn_cancelMouseClicked

    private void btn_editstu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_editstu1MouseClicked
        if(txt_barcode.getText()==null){
            JOptionPane.showMessageDialog(null,"Nothing has updated to save."); //TRY WHETHER THIS CODE IS WORKING
        }
        else{
            String table = (String)selectStudentsDb.getSelectedItem();
            String stu_refno = txt_refno.getText();
            String stu_regno = txt_regno.getText();
            String stu_name = txt_name.getText();
            String stu_contact = txt_contactno.getText();
            String stu_branch = txt_branch.getText();
            String stu_course = txt_course.getText();
            String stu_fee = txt_total.getText();
            String stu_disc = txt_disc.getText();
            String stu_payment = txt_pay.getText();
            String stu_recieve = txt_recieved.getText();
            String stu_refunds = txt_refunds.getText();
            String stu_dues = txt_dues.getText();
            String stu_actions = txt_actions.getText();
            String stu_barcode = txt_barcode.getText();
        
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8111/bwea","root","root");
                PreparedStatement ps = con.prepareStatement("UPDATE `"+table+"` SET `Refference No`=?,`Registration No`=?,`Name`=?,`Contact No`=?,`Branch`=?,`Course`=?,`Total Fee`=?,`Discounts`=?,`Payable`=?,`Received Payment`=?,`Refunds`=?,`Due`=?,`Action`=? WHERE Barcode="+stu_barcode);

                ps.setInt(1, Integer.parseInt(stu_refno));
                ps.setString(2, stu_regno);
                ps.setString(3, stu_name);
                ps.setInt(4, Integer.parseInt(stu_contact));
                ps.setString(5, stu_branch);
                ps.setString(6, stu_course);
                ps.setInt(7, Integer.parseInt(stu_fee));
                ps.setInt(8, Integer.parseInt(stu_disc));
                ps.setInt(9, Integer.parseInt(stu_payment));
                ps.setInt(10, Integer.parseInt(stu_recieve));
                ps.setInt(11, Integer.parseInt(stu_refunds));
                ps.setInt(12, Integer.parseInt(stu_dues));
                ps.setInt(13, Integer.parseInt(stu_actions));
         
                int saveNew = JOptionPane.showConfirmDialog(this,
                    "Do you want to save new data?", "Confirm", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
            
                if(saveNew == JOptionPane.YES_OPTION){
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null,"Records Updated!");
                    GoHomeScreen();
                }
            } 
            catch (SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_btn_editstu1MouseClicked

    private void jLabelCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabelCloseMouseClicked

    private void jLabelMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabelMinMouseClicked

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
            java.util.logging.Logger.getLogger(UpdateStudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStudentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_editstu1;
    private javax.swing.JButton btn_enter;
    private javax.swing.JLabel btn_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JComboBox<String> selectStudentsDb;
    private javax.swing.JTextField txt_actions;
    private javax.swing.JTextField txt_barcode;
    private javax.swing.JTextField txt_branch;
    private javax.swing.JTextField txt_contactno;
    private javax.swing.JTextField txt_course;
    private javax.swing.JTextField txt_disc;
    private javax.swing.JTextField txt_dues;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_pay;
    private javax.swing.JTextField txt_recieved;
    private javax.swing.JTextField txt_refno;
    private javax.swing.JTextField txt_refunds;
    private javax.swing.JTextField txt_regno;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}

