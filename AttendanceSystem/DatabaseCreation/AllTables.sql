-- MySQL dump 10.13  Distrib 8.0.21, for Win64 (x86_64)
--
-- Host: localhost    Database: bwea
-- ------------------------------------------------------
-- Server version	8.0.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `Index` int NOT NULL AUTO_INCREMENT,
  `fullname` varchar(45) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(20) NOT NULL,
  PRIMARY KEY (`Index`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
INSERT INTO `admin` VALUES (1,'BWEA Super Admin','superadmin','superadmin1122');
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendance` (
  `Index` int NOT NULL AUTO_INCREMENT,
  `Registration No` varchar(20) DEFAULT NULL,
  `Name` varchar(100) DEFAULT NULL,
  `Datein` date DEFAULT NULL,
  `Intime` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`Index`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendance`
--

LOCK TABLES `attendance` WRITE;
/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diploma in android application development`
--

DROP TABLE IF EXISTS `diploma in android application development`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diploma in android application development` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int DEFAULT NULL,
  `Discounts` int DEFAULT NULL,
  `Payable` int DEFAULT NULL,
  `Received Payment` int DEFAULT NULL,
  `Refunds` int DEFAULT NULL,
  `Due` int DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diploma in android application development`
--

LOCK TABLES `diploma in android application development` WRITE;
/*!40000 ALTER TABLE `diploma in android application development` DISABLE KEYS */;
/*!40000 ALTER TABLE `diploma in android application development` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diploma in graphic designing`
--

DROP TABLE IF EXISTS `diploma in graphic designing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diploma in graphic designing` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int DEFAULT NULL,
  `Discounts` int DEFAULT NULL,
  `Payable` int DEFAULT NULL,
  `Received Payment` int DEFAULT NULL,
  `Refunds` int DEFAULT NULL,
  `Due` int DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diploma in graphic designing`
--

LOCK TABLES `diploma in graphic designing` WRITE;
/*!40000 ALTER TABLE `diploma in graphic designing` DISABLE KEYS */;
/*!40000 ALTER TABLE `diploma in graphic designing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diploma in information technology`
--

DROP TABLE IF EXISTS `diploma in information technology`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diploma in information technology` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int DEFAULT NULL,
  `Discounts` int DEFAULT NULL,
  `Payable` int DEFAULT NULL,
  `Received Payment` int DEFAULT NULL,
  `Refunds` int DEFAULT NULL,
  `Due` int DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diploma in information technology`
--

LOCK TABLES `diploma in information technology` WRITE;
/*!40000 ALTER TABLE `diploma in information technology` DISABLE KEYS */;
/*!40000 ALTER TABLE `diploma in information technology` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diploma in software engineering`
--

DROP TABLE IF EXISTS `diploma in software engineering`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diploma in software engineering` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int DEFAULT NULL,
  `Discounts` int DEFAULT NULL,
  `Payable` int DEFAULT NULL,
  `Received Payment` int DEFAULT NULL,
  `Refunds` int DEFAULT NULL,
  `Due` int DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diploma in software engineering`
--

LOCK TABLES `diploma in software engineering` WRITE;
/*!40000 ALTER TABLE `diploma in software engineering` DISABLE KEYS */;
/*!40000 ALTER TABLE `diploma in software engineering` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `diploma in web designing`
--

DROP TABLE IF EXISTS `diploma in web designing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `diploma in web designing` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int DEFAULT NULL,
  `Discounts` int DEFAULT NULL,
  `Payable` int DEFAULT NULL,
  `Received Payment` int DEFAULT NULL,
  `Refunds` int DEFAULT NULL,
  `Due` int DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `diploma in web designing`
--

LOCK TABLES `diploma in web designing` WRITE;
/*!40000 ALTER TABLE `diploma in web designing` DISABLE KEYS */;
/*!40000 ALTER TABLE `diploma in web designing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `english + it`
--

DROP TABLE IF EXISTS `english + it`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `english + it` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int DEFAULT NULL,
  `Discounts` int DEFAULT NULL,
  `Payable` int DEFAULT NULL,
  `Received Payment` int DEFAULT NULL,
  `Refunds` int DEFAULT NULL,
  `Due` int DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `english + it`
--

LOCK TABLES `english + it` WRITE;
/*!40000 ALTER TABLE `english + it` DISABLE KEYS */;
/*!40000 ALTER TABLE `english + it` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `foundation in arduino programming`
--

DROP TABLE IF EXISTS `foundation in arduino programming`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `foundation in arduino programming` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int DEFAULT NULL,
  `Discounts` int DEFAULT NULL,
  `Payable` int DEFAULT NULL,
  `Received Payment` int DEFAULT NULL,
  `Refunds` int DEFAULT NULL,
  `Due` int DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `foundation in arduino programming`
--

LOCK TABLES `foundation in arduino programming` WRITE;
/*!40000 ALTER TABLE `foundation in arduino programming` DISABLE KEYS */;
/*!40000 ALTER TABLE `foundation in arduino programming` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `foundation in ict`
--

DROP TABLE IF EXISTS `foundation in ict`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `foundation in ict` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int DEFAULT NULL,
  `Discounts` int DEFAULT NULL,
  `Payable` int DEFAULT NULL,
  `Received Payment` int DEFAULT NULL,
  `Refunds` int DEFAULT NULL,
  `Due` int DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `foundation in ict`
--

LOCK TABLES `foundation in ict` WRITE;
/*!40000 ALTER TABLE `foundation in ict` DISABLE KEYS */;
/*!40000 ALTER TABLE `foundation in ict` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ielts`
--

DROP TABLE IF EXISTS `ielts`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `ielts` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int DEFAULT NULL,
  `Discounts` int DEFAULT NULL,
  `Payable` int DEFAULT NULL,
  `Received Payment` int DEFAULT NULL,
  `Refunds` int DEFAULT NULL,
  `Due` int DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ielts`
--

LOCK TABLES `ielts` WRITE;
/*!40000 ALTER TABLE `ielts` DISABLE KEYS */;
/*!40000 ALTER TABLE `ielts` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `kids`
--

DROP TABLE IF EXISTS `kids`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `kids` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int DEFAULT NULL,
  `Discounts` int DEFAULT NULL,
  `Payable` int DEFAULT NULL,
  `Received Payment` int DEFAULT NULL,
  `Refunds` int DEFAULT NULL,
  `Due` int DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `kids`
--

LOCK TABLES `kids` WRITE;
/*!40000 ALTER TABLE `kids` DISABLE KEYS */;
/*!40000 ALTER TABLE `kids` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `night - english`
--

DROP TABLE IF EXISTS `night - english`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `night - english` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int DEFAULT NULL,
  `Discounts` int DEFAULT NULL,
  `Payable` int DEFAULT NULL,
  `Received Payment` int DEFAULT NULL,
  `Refunds` int DEFAULT NULL,
  `Due` int DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `night - english`
--

LOCK TABLES `night - english` WRITE;
/*!40000 ALTER TABLE `night - english` DISABLE KEYS */;
/*!40000 ALTER TABLE `night - english` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `three month diploma - english`
--

DROP TABLE IF EXISTS `three month diploma - english`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `three month diploma - english` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int DEFAULT NULL,
  `Discounts` int DEFAULT NULL,
  `Payable` int DEFAULT NULL,
  `Received Payment` int DEFAULT NULL,
  `Refunds` int DEFAULT NULL,
  `Due` int DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `three month diploma - english`
--

LOCK TABLES `three month diploma - english` WRITE;
/*!40000 ALTER TABLE `three month diploma - english` DISABLE KEYS */;
/*!40000 ALTER TABLE `three month diploma - english` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `toic`
--

DROP TABLE IF EXISTS `toic`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `toic` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int DEFAULT NULL,
  `Discounts` int DEFAULT NULL,
  `Payable` int DEFAULT NULL,
  `Received Payment` int DEFAULT NULL,
  `Refunds` int DEFAULT NULL,
  `Due` int DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `toic`
--

LOCK TABLES `toic` WRITE;
/*!40000 ALTER TABLE `toic` DISABLE KEYS */;
/*!40000 ALTER TABLE `toic` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `two month advance certificate - english`
--

DROP TABLE IF EXISTS `two month advance certificate - english`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `two month advance certificate - english` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int DEFAULT NULL,
  `Discounts` int DEFAULT NULL,
  `Payable` int DEFAULT NULL,
  `Received Payment` int DEFAULT NULL,
  `Refunds` int DEFAULT NULL,
  `Due` int DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `two month advance certificate - english`
--

LOCK TABLES `two month advance certificate - english` WRITE;
/*!40000 ALTER TABLE `two month advance certificate - english` DISABLE KEYS */;
/*!40000 ALTER TABLE `two month advance certificate - english` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `two month certificate - english`
--

DROP TABLE IF EXISTS `two month certificate - english`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `two month certificate - english` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int DEFAULT NULL,
  `Discounts` int DEFAULT NULL,
  `Payable` int DEFAULT NULL,
  `Received Payment` int DEFAULT NULL,
  `Refunds` int DEFAULT NULL,
  `Due` int DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `two month certificate - english`
--

LOCK TABLES `two month certificate - english` WRITE;
/*!40000 ALTER TABLE `two month certificate - english` DISABLE KEYS */;
/*!40000 ALTER TABLE `two month certificate - english` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `two month diploma in english`
--

DROP TABLE IF EXISTS `two month diploma in english`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `two month diploma in english` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int DEFAULT NULL,
  `Discounts` int DEFAULT NULL,
  `Payable` int DEFAULT NULL,
  `Received Payment` int DEFAULT NULL,
  `Refunds` int DEFAULT NULL,
  `Due` int DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `two month diploma in english`
--

LOCK TABLES `two month diploma in english` WRITE;
/*!40000 ALTER TABLE `two month diploma in english` DISABLE KEYS */;
/*!40000 ALTER TABLE `two month diploma in english` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `weekend english`
--

DROP TABLE IF EXISTS `weekend english`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `weekend english` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int DEFAULT NULL,
  `Discounts` int DEFAULT NULL,
  `Payable` int DEFAULT NULL,
  `Received Payment` int DEFAULT NULL,
  `Refunds` int DEFAULT NULL,
  `Due` int DEFAULT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `weekend english`
--

LOCK TABLES `weekend english` WRITE;
/*!40000 ALTER TABLE `weekend english` DISABLE KEYS */;
/*!40000 ALTER TABLE `weekend english` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-12-10  1:43:44
