-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: localhost    Database: inventorymanagment
-- ------------------------------------------------------
-- Server version	8.0.22

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
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventory` (
  `Item_Id` int NOT NULL,
  `Item_Name` varchar(45) NOT NULL,
  `Item_Selling_Price` int NOT NULL,
  `Product_Selling_Quantity` int NOT NULL,
  `Discount_%` int NOT NULL,
  `Sale` varchar(45) DEFAULT NULL,
  `Buyer_Gender` varchar(45) NOT NULL,
  PRIMARY KEY (`Item_Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` VALUES (45,'jacket',400,43,4,'ON SALE','Female'),(99,'CHOCOLATE',50,25,2,'ON SALE','Male'),(100,'chips',20,50,0,'ON SALE','Female'),(121,'jam',60,35,20,'NOT ON SALE','Male'),(125,'bat',650,3,0,'ON SALE','Female'),(135,'EGG',10,100,10,'NOT ON SALE','Female'),(140,'BOOK',80,40,2,'ON SALE','Female'),(150,'Pickle',100,50,10,'NOT ON SALE','Male'),(178,'TOY',50,100,2,'ON SALE','Female'),(200,'Dress',800,50,10,'ON SALE','Male'),(250,'BOTTLE',400,50,2,'ON SALE','Female'),(290,'Pen',15,30,2,'ON SALE','Female'),(300,'PAN',350,30,2,'ON SALE','Female'),(320,'OIL',200,30,2,'ON SALE','Female'),(350,'CHIPS',20,50,2,'ON SALE','Male'),(400,'chips',20,40,2,'ON SALE','Female'),(450,'chips',10,30,2,'ON SALE','Female'),(500,'soap',45,40,2,'ON SALE','Female'),(600,'chips',20,40,2,'ON SALE','Female');
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-08-05 21:46:01
