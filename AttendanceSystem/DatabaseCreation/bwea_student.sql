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
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `No` int DEFAULT NULL,
  `Refference No` int NOT NULL,
  `Registration No` varchar(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Contact No` int NOT NULL,
  `Branch` text NOT NULL,
  `Course` varchar(80) NOT NULL,
  `Total Fee` int NOT NULL,
  `Discounts` int NOT NULL,
  `Payable` int NOT NULL,
  `Received Payment` int NOT NULL,
  `Refunds` int NOT NULL,
  `Due` int NOT NULL,
  `Action` varchar(20) DEFAULT NULL,
  `Barcode` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`Registration No`),
  UNIQUE KEY `Barcode_UNIQUE` (`Barcode`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (2,39088,'KDTM 192798','MISS.H.R.M.S.SEWMINI DAYARATHNA',712050066,'Kandy','Two Months',23900,0,23900,23900,0,0,NULL,'1234'),(3,39110,'KDTM 192801','MISS.H.M.L.A.K.KUMARI HERATH',716056958,'Kandy','Two Months',23900,0,23900,23900,0,0,NULL,NULL),(4,39123,'KDTM 192803','MISS.J.M.G.RASHODYA JAYAWEERA',769432303,'Kandy','Two Months',23900,0,23900,23900,0,0,NULL,NULL),(5,39493,'KDTM 192805','MR.R.M.Y.RAVINDU  RANAWEERA',777790741,'Kandy','Two Months',23900,0,23900,23900,0,0,NULL,NULL),(1,39086,'KDTM192799','MR.R.M.NAYANAJITH KULARATHNA',768061738,'Kandy','Two Months',23900,0,23900,35900,0,-12000,NULL,'5678');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-10-02 21:53:04
