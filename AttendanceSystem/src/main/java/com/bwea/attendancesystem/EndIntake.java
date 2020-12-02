/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bwea.attendancesystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class EndIntake extends javax.swing.JFrame {

    /**
     * Creates new form EndIntake
     */
    public EndIntake() {
        initComponents();
        this.setLocationRelativeTo(null);
        dropdown();
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
        MainPanel = new javax.swing.JPanel();
        selectStudentsDb = new javax.swing.JComboBox<>();
        txt_intake = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btn_dropintake = new javax.swing.JButton();

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
        jLabel1.setText("End Intake");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(98, 98, 98)
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
                .addContainerGap(15, Short.MAX_VALUE))
        );

        MainPanel.setBackground(new java.awt.Color(204, 204, 255));

        selectStudentsDb.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        selectStudentsDb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a Course" }));
        selectStudentsDb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        txt_intake.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Enter Intake Number");

        btn_dropintake.setBackground(new java.awt.Color(194, 6, 6));
        btn_dropintake.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_dropintake.setForeground(new java.awt.Color(255, 255, 255));
        btn_dropintake.setText("End Intake");
        btn_dropintake.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_dropintake.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dropintakeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectStudentsDb, 0, 510, Short.MAX_VALUE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_intake))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_dropintake, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(selectStudentsDb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_intake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(btn_dropintake, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
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

    private void btn_dropintakeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dropintakeMouseClicked
        String course=(String)selectStudentsDb.getSelectedItem();
        String intake = txt_intake.getText();
        int saveNew = JOptionPane.showConfirmDialog(this,
                    "Are you sure?", "Confirm", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
            
        if(saveNew == JOptionPane.YES_OPTION){   
            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8111/bwea","root","root");
                PreparedStatement ps = con.prepareStatement("DELETE FROM `"+course+"` WHERE Action='"+intake+"'");
                ps.execute();
                ResultSet rs=ps.getResultSet();
                    if(rs!=null){ 
                        JOptionPane.showMessageDialog(null,"Intake has been removed!");
                    }
                    else{
                        JOptionPane.showMessageDialog(null,"Invalid Intake Number!");
                    }
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null,"Please select a course!");
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_btn_dropintakeMouseClicked

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
            java.util.logging.Logger.getLogger(EndIntake.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EndIntake.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EndIntake.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EndIntake.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EndIntake().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton btn_dropintake;
    private javax.swing.JLabel btn_home;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JComboBox<String> selectStudentsDb;
    private javax.swing.JTextField txt_intake;
    // End of variables declaration//GEN-END:variables
}
