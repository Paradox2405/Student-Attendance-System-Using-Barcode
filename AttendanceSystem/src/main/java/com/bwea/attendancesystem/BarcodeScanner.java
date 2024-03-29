/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bwea.attendancesystem;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.sql.*;
import java.text.SimpleDateFormat;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author Sunali
 */
public class BarcodeScanner extends javax.swing.JFrame {

    /**
     * Creates new form BarcodeScanner
     */
    public BarcodeScanner() {
        initComponents();
        
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        txt_barcode.requestFocus();
        txt_barcode.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
              barcode(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                barcode(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
             barcode(e);
            }
            public void barcode(DocumentEvent e){
                
                 Runnable doBarcode = new Runnable(){
                     public void run(){
              
                if(e.getDocument().getLength()==13){
                  String barcode =txt_barcode.getText();
                    
                   try{       
                    int bar = Integer.parseInt(barcode);
                    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8111/bwea","root","root");
                    PreparedStatement ps = con.prepareStatement("SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Two Month Diploma in English` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Two Month Advance Certificate - English` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Two Month Certificate - English` WHERE Barcode='"+bar+"'" 
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Three Month Diploma - English` WHERE Barcode='"+bar+"'" 
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `English + IT` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `TOIC` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `IELTS` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Weekend English` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Night - English` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `KIDS` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Foundation in ICT` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Diploma in Information Technology` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Diploma in Software Engineering` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Diploma in Web Designing` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Diploma in Graphic Designing` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Foundation in Arduino Programming` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Diploma in Android Application Development` WHERE Barcode='"+bar+"'");                          
            ResultSet rs=ps.executeQuery();

            if (rs.next() == false) {
                txt_barcode.setText(null);
                notexist();
            }
            else{
                String timeStamp = new SimpleDateFormat("HH.mm").format(new Timestamp(System.currentTimeMillis()));
                String dateStamp = new SimpleDateFormat("yyyy-MM-dd").format(new Timestamp(System.currentTimeMillis()));
                txt_name.setText(rs.getString("Name"));
                txt_course.setText(rs.getString("Course"));
                txt_regno.setText(rs.getString("Registration No"));
                txt_intime.setText(timeStamp);
                txt_datein.setText(dateStamp);
                txt_dues.setText(rs.getString("Due"));
                
                 //JOptionPane.showMessageDialog(null,"You have a Over Due of"+txt_dues.getText());  
            

                try{
                    String Reg = txt_regno.getText();
                    String Name = txt_name.getText();
                    PreparedStatement ps0 = con.prepareStatement("SELECT *"
                            + " FROM attendance WHERE `Registration No` in ('"+Reg+"') and DATE(Datein) = CURDATE()");
                    ResultSet results=ps0.executeQuery();
                    if(results.next()){

                           alreadyin();  
                           clearrows();
        
                    }
                    else{
                        overdue();
                        PreparedStatement ps1 = con.prepareStatement("INSERT INTO attendance (`Registration No`,Name,Datein,Intime)"+" VALUES (?,?,?,?)");

                        ps1.setString(1, Reg);
                        ps1.setString(2, Name);
                        ps1.setString(3, dateStamp);
                        ps1.setString(4, timeStamp);
                        ps1.execute();
                        txt_barcode.setText(null);
                    }
                }
                catch(SQLException x){
                JOptionPane.showMessageDialog(null, x);
                }
            }
           }           
            catch(SQLException x)
            {
            System.out.println(x);
            } 
         
                    
                    
                    
                    
                    
                    
                }
                 }
            };
                 SwingUtilities.invokeLater(doBarcode);
            
            }
        
        });
        
   
        
    }
    
    private static final int TIME_VISIBLE = 3000;
    
    
    
    
    private void overdue(){
        if(!txt_dues.getText().equals("0")){
            
            final Runnable runnable =
         (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.exclamation");
           if (runnable != null) runnable.run();
            
            JOptionPane pane = new JOptionPane("You have a Over Due of  "+txt_dues.getText(), JOptionPane.INFORMATION_MESSAGE);
            JDialog dialog = pane.createDialog(null, "");
            dialog.setModal(false);
            dialog.setVisible(true);
            new Timer(TIME_VISIBLE, new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    dialog.setVisible(false);
                }
            }).start();
            
        } else {
            
        }
        
        txt_barcode.setText(null);
        txt_barcode.requestFocus(); 
    }
    
    private void nothingentered(){
    
                JOptionPane pane = new JOptionPane("Nothing has entered to search.", JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = pane.createDialog(null,"");
                dialog.setModal(false);
                dialog.setVisible(true);
                new Timer(TIME_VISIBLE, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dialog.setVisible(false);
                    }
                }).start();
                txt_barcode.requestFocus();
    }
    
    private void notexist(){
    
              final Runnable runnable =
                 (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.exclamation");
                 if (runnable != null) runnable.run();
    
                JOptionPane pane = new JOptionPane("Barcode Does Not Exist", JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = pane.createDialog(null, "");
                dialog.setModal(false);
                dialog.setVisible(true);
                new Timer(TIME_VISIBLE, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dialog.setVisible(false);
                    }
                }).start();
               
                txt_barcode.requestFocus();
    }
    
      private void alreadyin(){
          
                  final Runnable runnable =
                 (Runnable) Toolkit.getDefaultToolkit().getDesktopProperty("win.sound.exclamation");
                 if (runnable != null) runnable.run();
    
                JOptionPane pane = new JOptionPane("You have already checked in!", JOptionPane.INFORMATION_MESSAGE);
                JDialog dialog = pane.createDialog(null, "");
                dialog.setModal(false);
                dialog.setVisible(true);
                new Timer(TIME_VISIBLE, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        dialog.setVisible(false);
                    }
                }).start();
                txt_barcode.requestFocus();
    }
    
    private void clearrows(){
    
                            txt_barcode.setText(null);
                            txt_name.setText(null);
                            txt_course.setText(null);
                            txt_regno.setText(null);
                            txt_intime.setText(null);
                            txt_datein.setText(null);
                            txt_dues.setText(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1_bg = new javax.swing.JPanel();
        jPanel1_topbar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_home = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txt_name = new javax.swing.JLabel();
        txt_regno = new javax.swing.JLabel();
        txt_course = new javax.swing.JLabel();
        txt_intime = new javax.swing.JLabel();
        txt_datein = new javax.swing.JLabel();
        txt_dues = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_barcode = new javax.swing.JTextField();
        btn_enter = new javax.swing.JButton();
        btn_registerbarcodes = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1_bg.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1_topbar.setBackground(new java.awt.Color(13, 37, 91));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Scan Barcode");

        btn_home.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_home.setForeground(new java.awt.Color(255, 255, 255));
        btn_home.setText("Home");
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1_topbarLayout = new javax.swing.GroupLayout(jPanel1_topbar);
        jPanel1_topbar.setLayout(jPanel1_topbarLayout);
        jPanel1_topbarLayout.setHorizontalGroup(
            jPanel1_topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_topbarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(467, 467, 467)
                .addComponent(btn_home)
                .addGap(32, 32, 32))
        );
        jPanel1_topbarLayout.setVerticalGroup(
            jPanel1_topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_topbarLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1_topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_home)
                    .addComponent(jLabel1))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 49, 121));
        jLabel6.setText("NAME");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 49, 121));
        jLabel7.setText("REGISTRATION NO");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 49, 121));
        jLabel8.setText("COURSE");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 49, 121));
        jLabel9.setText("IN TIME");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 49, 121));
        jLabel10.setText("DATE");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 49, 121));
        jLabel11.setText("PAYMENT DUE");

        txt_name.setBackground(new java.awt.Color(255, 255, 255));
        txt_name.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_name.setForeground(new java.awt.Color(0, 0, 0));
        txt_name.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        txt_regno.setBackground(new java.awt.Color(255, 255, 255));
        txt_regno.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_regno.setForeground(new java.awt.Color(0, 0, 0));
        txt_regno.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        txt_course.setBackground(new java.awt.Color(255, 255, 255));
        txt_course.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_course.setForeground(new java.awt.Color(0, 0, 0));
        txt_course.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        txt_intime.setBackground(new java.awt.Color(255, 255, 255));
        txt_intime.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_intime.setForeground(new java.awt.Color(0, 0, 0));
        txt_intime.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        txt_datein.setBackground(new java.awt.Color(255, 255, 255));
        txt_datein.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_datein.setForeground(new java.awt.Color(0, 0, 0));
        txt_datein.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        txt_dues.setBackground(new java.awt.Color(255, 255, 255));
        txt_dues.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_dues.setForeground(new java.awt.Color(0, 0, 0));
        txt_dues.setBorder(javax.swing.BorderFactory.createEtchedBorder(null, new java.awt.Color(204, 204, 204)));

        jPanel1.setBackground(new java.awt.Color(226, 156, 14));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Welcome to");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 49, 121));
        jLabel3.setText("BRITISH WAY");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 49, 121));
        jLabel4.setText("ENGLISH");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 49, 121));
        jLabel5.setText("ACADEMY");

        txt_barcode.setBackground(new java.awt.Color(255, 255, 255));
        txt_barcode.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_barcode.setForeground(new java.awt.Color(0, 0, 0));

        btn_enter.setBackground(new java.awt.Color(0, 49, 121));
        btn_enter.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_enter.setForeground(new java.awt.Color(255, 255, 255));
        btn_enter.setText("Scan");
        btn_enter.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_enter.setMaximumSize(new java.awt.Dimension(125, 22));
        btn_enter.setMinimumSize(new java.awt.Dimension(125, 22));
        btn_enter.setPreferredSize(new java.awt.Dimension(125, 22));
        btn_enter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_enterMouseClicked(evt);
            }
        });

        btn_registerbarcodes.setBackground(new java.awt.Color(255, 255, 255));
        btn_registerbarcodes.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_registerbarcodes.setForeground(new java.awt.Color(0, 0, 0));
        btn_registerbarcodes.setText("Register Barcode");
        btn_registerbarcodes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_registerbarcodes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_registerbarcodesMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btn_registerbarcodes, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btn_enter, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addGap(91, 91, 91)
                .addComponent(txt_barcode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_enter, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(btn_registerbarcodes, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        txt_barcode.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout jPanel1_bgLayout = new javax.swing.GroupLayout(jPanel1_bg);
        jPanel1_bg.setLayout(jPanel1_bgLayout);
        jPanel1_bgLayout.setHorizontalGroup(
            jPanel1_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_topbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1_bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addGroup(jPanel1_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel1_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1_bgLayout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addGroup(jPanel1_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))
                        .addComponent(jLabel7))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_regno, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_course, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_intime, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_datein, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_dues, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1_bgLayout.setVerticalGroup(
            jPanel1_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1_bgLayout.createSequentialGroup()
                .addComponent(jPanel1_topbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1_bgLayout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(jPanel1_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(txt_regno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel8)
                            .addComponent(txt_course, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txt_intime, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel10)
                            .addComponent(txt_datein, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1_bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txt_dues, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1_bgLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1_bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_homeMouseClicked
        HomeScreen hs = new HomeScreen();
        hs.setVisible(true);
        hs.setExtendedState(JFrame.MAXIMIZED_BOTH);
        hs.setLocationRelativeTo(null);
        hs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btn_homeMouseClicked

    private void btn_enterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_enterMouseClicked
        String barcode =txt_barcode.getText();
        
        if(barcode.equals("")){
            nothingentered();
        }
        
        else{

        try{       
            int bar = Integer.parseInt(barcode);
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:8111/bwea","root","root");
            PreparedStatement ps = con.prepareStatement("SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Two Month Diploma in English` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Two Month Advance Certificate - English` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Two Month Certificate - English` WHERE Barcode='"+bar+"'" 
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Three Month Diploma - English` WHERE Barcode='"+bar+"'" 
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `English + IT` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `TOIC` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `IELTS` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Weekend English` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Night - English` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `KIDS` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Foundation in ICT` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Diploma in Information Technology` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Diploma in Software Engineering` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Diploma in Web Designing` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Diploma in Graphic Designing` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Foundation in Arduino Programming` WHERE Barcode='"+bar+"'"
                    + "UNION ALL SELECT `Name`,`Registration No`,`Course`,`Due` FROM `Diploma in Android Application Development` WHERE Barcode='"+bar+"'");                          
            ResultSet rs=ps.executeQuery();

            if (rs.next() == false) {
                txt_barcode.setText(null);
                notexist();
            }
            else{
                String timeStamp = new SimpleDateFormat("HH.mm").format(new Timestamp(System.currentTimeMillis()));
                String dateStamp = new SimpleDateFormat("yyyy-MM-dd").format(new Timestamp(System.currentTimeMillis()));
                txt_name.setText(rs.getString("Name"));
                txt_course.setText(rs.getString("Course"));
                txt_regno.setText(rs.getString("Registration No"));
                txt_intime.setText(timeStamp);
                txt_datein.setText(dateStamp);
                txt_dues.setText(rs.getString("Due"));
                
                 //JOptionPane.showMessageDialog(null,"You have a Over Due of"+txt_dues.getText());  
            

                try{
                    String Reg = txt_regno.getText();
                    String Name = txt_name.getText();
                    PreparedStatement ps0 = con.prepareStatement("SELECT *"
                            + " FROM attendance WHERE `Registration No` in ('"+Reg+"') and DATE(Datein) = CURDATE()");
                    ResultSet results=ps0.executeQuery();
                    if(results.next()){

                           alreadyin();  
                           clearrows();
        
                    }
                    else{
                        overdue();
                        PreparedStatement ps1 = con.prepareStatement("INSERT INTO attendance (`Registration No`,Name,Datein,Intime)"+" VALUES (?,?,?,?)");

                        ps1.setString(1, Reg);
                        ps1.setString(2, Name);
                        ps1.setString(3, dateStamp);
                        ps1.setString(4, timeStamp);
                        ps1.execute();
                        txt_barcode.setText(null);
                    }
                }
                catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
                }
            }
           }           
            catch(SQLException e)
            {
            System.out.println(e);
            } 
        }
    }//GEN-LAST:event_btn_enterMouseClicked

    private void btn_registerbarcodesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_registerbarcodesMouseClicked
        RegisterBarcodes reg=new RegisterBarcodes();
        reg.setVisible(true);
        reg.pack();
        reg.setLocationRelativeTo(null);
        reg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btn_registerbarcodesMouseClicked

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
            java.util.logging.Logger.getLogger(BarcodeScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BarcodeScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BarcodeScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BarcodeScanner.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarcodeScanner().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enter;
    private javax.swing.JLabel btn_home;
    private javax.swing.JButton btn_registerbarcodes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel1_bg;
    private javax.swing.JPanel jPanel1_topbar;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_barcode;
    private javax.swing.JLabel txt_course;
    private javax.swing.JLabel txt_datein;
    private javax.swing.JLabel txt_dues;
    private javax.swing.JLabel txt_intime;
    private javax.swing.JLabel txt_name;
    private javax.swing.JLabel txt_regno;
    // End of variables declaration//GEN-END:variables
}
