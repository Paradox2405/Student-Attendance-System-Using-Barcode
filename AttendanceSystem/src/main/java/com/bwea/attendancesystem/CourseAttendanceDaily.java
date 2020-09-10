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
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Sunali
 */
public class CourseAttendanceDaily extends javax.swing.JFrame {

    /**
     * Creates new form CourseAttendance
     */
    public CourseAttendanceDaily() {
        initComponents();
        this.setLocationRelativeTo(null);
        DisplayTableDailyAtt();
    }
    
    private void DisplayTableDailyAtt(){
        
        
        
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
        selectDailyAtt = new java.awt.Choice();
        display_batch_name = new java.awt.Label();
        btn_monthly_attendance = new javax.swing.JButton();
        btn_dailyReport = new javax.swing.JButton();
        btn_generateGraphDaily = new javax.swing.JButton();
        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_DailyAtt = new javax.swing.JTable();
        btn_dailyRefresh = new javax.swing.JButton();

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

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(813, Short.MAX_VALUE)
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
                .addContainerGap(25, Short.MAX_VALUE))
        );

        display_batch_name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        display_batch_name.setText("Daily Attendance");

        btn_monthly_attendance.setText("Monthly");
        btn_monthly_attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_monthly_attendanceMouseClicked(evt);
            }
        });
        btn_monthly_attendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_monthly_attendanceActionPerformed(evt);
            }
        });

        btn_dailyReport.setText("Report");
        btn_dailyReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dailyReportActionPerformed(evt);
            }
        });

        btn_generateGraphDaily.setText("Generate Graph");

        table_DailyAtt.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(table_DailyAtt);

        btn_dailyRefresh.setText("Refresh ");
        btn_dailyRefresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dailyRefreshMouseClicked(evt);
            }
        });
        btn_dailyRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dailyRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_generateGraphDaily)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_dailyReport))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(display_batch_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192)
                        .addComponent(selectDailyAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_dailyRefresh)
                        .addGap(125, 125, 125)
                        .addComponent(btn_monthly_attendance))
                    .addComponent(jScrollPane2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(display_batch_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btn_monthly_attendance)
                                .addComponent(btn_dailyRefresh))
                            .addComponent(selectDailyAtt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dailyReport)
                    .addComponent(btn_generateGraphDaily))
                .addGap(0, 35, Short.MAX_VALUE))
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

    private void btn_monthly_attendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_monthly_attendanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_monthly_attendanceActionPerformed

    private void btn_dailyReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dailyReportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_dailyReportActionPerformed

    private void btn_monthly_attendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_monthly_attendanceMouseClicked
        CourseAttendanceMonthly cam = new CourseAttendanceMonthly();
        cam.setVisible(true);
        cam.pack();
        cam.setLocationRelativeTo(null);
        cam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btn_monthly_attendanceMouseClicked

    private void btn_dailyRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dailyRefreshActionPerformed
        
    }//GEN-LAST:event_btn_dailyRefreshActionPerformed

    private void btn_dailyRefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dailyRefreshMouseClicked
        try{       
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bwea","root","");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM student");   
            ResultSet rs = ps.executeQuery();
            
            table_DailyAtt.setModel(DbUtils.resultSetToTableModel(rs));
        }

        catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,e);
            }
    }//GEN-LAST:event_btn_dailyRefreshMouseClicked

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
            java.util.logging.Logger.getLogger(CourseAttendanceDaily.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseAttendanceDaily.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseAttendanceDaily.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseAttendanceDaily.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CourseAttendanceDaily().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton btn_dailyRefresh;
    private javax.swing.JButton btn_dailyReport;
    private javax.swing.JButton btn_generateGraphDaily;
    private javax.swing.JLabel btn_home;
    private javax.swing.JButton btn_monthly_attendance;
    private java.awt.Label display_batch_name;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private java.awt.Choice selectDailyAtt;
    private javax.swing.JTable table_DailyAtt;
    // End of variables declaration//GEN-END:variables
}
