/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bwea.attendancesystem;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;




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
            
    }

    private void DisplayTableDailyAtt(){
        try{
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8111/bwea","root","root");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM attendance WHERE YEAR(Datein) = YEAR(CURRENT_DATE()) AND MONTH(Datein) = MONTH(CURRENT_DATE()) AND DATE(Datein) = CURDATE()"); 
            ResultSet rs = ps.executeQuery();
            if(rs==null){
            JOptionPane.showMessageDialog(null,"No Students have checked in yet!");
            }
            while(rs.next()){
               String Reg = rs.getString(2); //test values to run the attendance table
               String Name = rs.getString(3);
               String Date = rs.getString(4);
               String InTime = rs.getString(5);
               
               
           Object [] content = {Reg,Name,Date,InTime};
               DefaultTableModel model = (DefaultTableModel) table_all.getModel();
               model.addRow(content);
            }
            
           
            
         
        } 
        catch(SQLException e)
            {
                    JOptionPane.showMessageDialog(null,"Table Does Not Exist In Database");
                    e.printStackTrace();
            }
    }
    
    private void writeHeaderLine(XSSFSheet sheet) {
 
        Row headerRow = sheet.createRow(0);
 
        Cell headerCell = headerRow.createCell(0);
        headerCell.setCellValue("Registration Number");
 
        headerCell = headerRow.createCell(1);
        headerCell.setCellValue("Name");
 
        headerCell = headerRow.createCell(2);
        headerCell.setCellValue("Date Checked In");
 
        headerCell = headerRow.createCell(3);
        headerCell.setCellValue("Time Checked In");
 
       
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
        display_batch_name = new java.awt.Label();
        btn_monthly_attendance = new javax.swing.JButton();
        btn_dailyReport = new javax.swing.JButton();
        btn_generateGraphDaily = new javax.swing.JButton();
        btn_Refresh = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        table_all = new javax.swing.JTable();
        GraphPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        TopPanel.setBackground(new java.awt.Color(0, 0, 102));

        jLabelClose.setFont(new java.awt.Font("Product Sans", 1, 18)); // NOI18N
        jLabelClose.setForeground(new java.awt.Color(255, 255, 255));
        jLabelClose.setText("X");
        jLabelClose.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCloseMouseClicked(evt);
            }
        });

        jLabelMin.setFont(new java.awt.Font("Product Sans", 1, 24)); // NOI18N
        jLabelMin.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMin.setText("-");
        jLabelMin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinMouseClicked(evt);
            }
        });

        btn_home.setBackground(new java.awt.Color(153, 153, 153));
        btn_home.setFont(new java.awt.Font("Product Sans", 1, 16)); // NOI18N
        btn_home.setForeground(new java.awt.Color(255, 255, 255));
        btn_home.setText("Home");
        btn_home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_homeMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Course Attendance");

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(400, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(270, 270, 270)
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
                .addContainerGap(15, Short.MAX_VALUE))
        );

        display_batch_name.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        display_batch_name.setText("Student Attendance Today");

        btn_monthly_attendance.setBackground(new java.awt.Color(0, 0, 102));
        btn_monthly_attendance.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_monthly_attendance.setForeground(new java.awt.Color(255, 255, 255));
        btn_monthly_attendance.setText("Monthly");
        btn_monthly_attendance.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_monthly_attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_monthly_attendanceMouseClicked(evt);
            }
        });

        btn_dailyReport.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_dailyReport.setText("Print Report");
        btn_dailyReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_dailyReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_dailyReportMouseClicked(evt);
            }
        });

        btn_generateGraphDaily.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_generateGraphDaily.setText("Generate Graph");
        btn_generateGraphDaily.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_generateGraphDaily.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_generateGraphDailyMouseClicked(evt);
            }
        });

        btn_Refresh.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btn_Refresh.setText("Refresh ");
        btn_Refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_Refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_RefreshMouseClicked(evt);
            }
        });
        btn_Refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RefreshActionPerformed(evt);
            }
        });

        table_all.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Registration No", "Name", "Date", "InTime"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(table_all);

        javax.swing.GroupLayout GraphPanelLayout = new javax.swing.GroupLayout(GraphPanel);
        GraphPanel.setLayout(GraphPanelLayout);
        GraphPanelLayout.setHorizontalGroup(
            GraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        GraphPanelLayout.setVerticalGroup(
            GraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(GraphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btn_generateGraphDaily)
                            .addGap(18, 18, 18)
                            .addComponent(btn_dailyReport))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(display_batch_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(496, 496, 496)
                                .addComponent(btn_Refresh)
                                .addGap(18, 18, 18)
                                .addComponent(btn_monthly_attendance))
                            .addComponent(jScrollPane2))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(display_batch_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btn_monthly_attendance)
                        .addComponent(btn_Refresh)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GraphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_dailyReport)
                    .addComponent(btn_generateGraphDaily))
                .addGap(18, 18, 18))
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
        hs.setExtendedState(JFrame.MAXIMIZED_BOTH); 
        hs.setLocationRelativeTo(null);
        hs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btn_homeMouseClicked

    private void btn_monthly_attendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_monthly_attendanceMouseClicked
        CourseAttendanceMonthly cam = new CourseAttendanceMonthly();
        cam.setVisible(true);
        cam.pack();
        cam.setLocationRelativeTo(null);
        cam.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_btn_monthly_attendanceMouseClicked

    private void btn_RefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RefreshActionPerformed
        //Refresh button will show the current data & time attendance. Need to write the code
        DefaultTableModel model=(DefaultTableModel) table_all.getModel();
        while(model.getRowCount()>0){
            model.setRowCount(0);
            }

         DisplayTableDailyAtt();
        
        
       
    }//GEN-LAST:event_btn_RefreshActionPerformed

    private void btn_RefreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_RefreshMouseClicked
             
    }//GEN-LAST:event_btn_RefreshMouseClicked

    private void btn_generateGraphDailyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_generateGraphDailyMouseClicked
        // TODO add your handling code here:
       ChartAttendanceDaily cad = new ChartAttendanceDaily();
        cad.setVisible(true);
        cad.pack();
        cad.setLocationRelativeTo(null);
        cad.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
        
    }//GEN-LAST:event_btn_generateGraphDailyMouseClicked

    private void btn_dailyReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_dailyReportMouseClicked
        // TODO add your handling code here:
         int rowCount = 1;
        try{
             DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy.MM.dd");  
             LocalDateTime now = LocalDateTime.now();  
             
            String excelFilePath = ""+dtf.format(now)+"-AttendanceDaily.xlsx";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:8111/bwea","root","root");
            PreparedStatement ps1 = con.prepareStatement("SELECT * FROM attendance WHERE YEAR(Datein) = YEAR(CURRENT_DATE()) "
                    + "AND MONTH(Datein) = MONTH(CURRENT_DATE()) AND DATE(Datein) = CURDATE()");  
            ResultSet rs1 = ps1.executeQuery();
             XSSFWorkbook workbook = new XSSFWorkbook();
             XSSFSheet sheet = workbook.createSheet("Att");
             
             if(rs1==null){
            JOptionPane.showMessageDialog(null,"No Students have checked in yet!");
            }
            while(rs1.next()){
                writeHeaderLine(sheet);
                    String Regnumber = rs1.getString("Registration No");
                    String Name = rs1.getString("Name");
                    Date d = rs1.getDate("Datein");
                    String datein=d.toString();
                    String Intime = rs1.getString("Intime");
                    
                    Row row = sheet.createRow(rowCount++);
 
                    int columnCount = 0;
                    Cell cell = row.createCell(columnCount++);
                    cell.setCellValue(Regnumber);

                    cell = row.createCell(columnCount++);
                    cell.setCellValue(Name);
 
                    cell = row.createCell(columnCount++);

                    cell.setCellValue(datein);
 
                    cell = row.createCell(columnCount++);
            
                    cell.setCellValue(Intime);
            
            
            }
             FileOutputStream outputStream = new FileOutputStream(excelFilePath);
            workbook.write(outputStream);
            workbook.close();
            JOptionPane.showMessageDialog(null,"successfully Exported Daily Attendance Data!");
           
        }
        catch(SQLException e){
        System.out.println(e);
        } catch (FileNotFoundException ex) {
             Logger.getLogger(CourseAttendanceDaily.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(CourseAttendanceDaily.class.getName()).log(Level.SEVERE, null, ex);
         }
        
    }//GEN-LAST:event_btn_dailyReportMouseClicked

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JPanel GraphPanel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JButton btn_Refresh;
    private javax.swing.JButton btn_dailyReport;
    private javax.swing.JButton btn_generateGraphDaily;
    private javax.swing.JLabel btn_home;
    private javax.swing.JButton btn_monthly_attendance;
    private java.awt.Label display_batch_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelClose;
    private javax.swing.JLabel jLabelMin;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable table_all;
    // End of variables declaration//GEN-END:variables
}
