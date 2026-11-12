# Student Attendance System Using Barcodes

A Java desktop app (Swing) for taking student attendance with barcode scanners. Every student gets a barcode ID card, and scanning it at the door marks them present. Admins manage students and courses and see daily and monthly attendance charts.

## Features

- Admin login and **add new admins**
- **Add, update and bulk-upload students** from Excel (Apache POI)
- **Generate barcodes** for students and export them as a printable **PDF** (iText 7)
- **Scan barcodes** to mark attendance
- **Check attendance** per student
- Course attendance reports, **daily and monthly**, with charts (JFreeChart)
- **End intake**: close off a student intake

## Tech stack

- **Java** with **Swing / AWT**, built with **Maven**
- **MySQL** with Apache Commons DbUtils
- **iText 7** (PDF and barcodes), **Apache POI** (Excel import), **JFreeChart** (charts), SLF4J

## Project structure

```
AttendanceSystem/
  pom.xml
  src/main/java/com/bwea/attendancesystem/
    Login, HomeScreen, AddNewAdmin
    AddNewStudent, UpdateStudentDetails, UploadExcel
    RegisterBarcodes, Barcodes, BarcodeScanner
    CheckAttendance, CourseAttendanceDaily, CourseAttendanceMonthly
    ChartAttendanceDaily, ChartAttendanceMonthly, EndIntake
```

## Getting started

1. Install [MySQL](https://dev.mysql.com/downloads/installer/) and create a database named `bwea`.
2. The app connects to `jdbc:mysql://localhost:3306/bwea`. Update the URL, user and password in the source to match your MySQL server.
3. Build and run:
   ```bash
   cd AttendanceSystem
   mvn package
   mvn exec:java -Dexec.mainClass=com.bwea.attendancesystem.Login
   ```
   Or open the `AttendanceSystem` folder in IntelliJ IDEA or NetBeans and run `Login`.

A USB barcode scanner works as a keyboard, so no extra drivers are needed.
