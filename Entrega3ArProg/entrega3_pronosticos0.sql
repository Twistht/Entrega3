-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: entrega3
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `pronosticos`
--

DROP TABLE IF EXISTS `pronosticos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pronosticos` (
  `id_pronosticos` int NOT NULL AUTO_INCREMENT,
  `ronda` int NOT NULL,
  `participante` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `equipo1` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  `gana1` varchar(2) COLLATE utf8mb3_bin DEFAULT NULL,
  `empata` varchar(2) COLLATE utf8mb3_bin DEFAULT NULL,
  `gana2` varchar(2) COLLATE utf8mb3_bin DEFAULT NULL,
  `equipo2` varchar(45) CHARACTER SET utf8mb3 COLLATE utf8mb3_bin DEFAULT NULL,
  PRIMARY KEY (`id_pronosticos`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb3 COLLATE=utf8mb3_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pronosticos`
--

LOCK TABLES `pronosticos` WRITE;
/*!40000 ALTER TABLE `pronosticos` DISABLE KEYS */;
INSERT INTO `pronosticos` VALUES (1,1,'Mariana','Argentina','X',NULL,NULL,'Arabia Saudita'),(2,1,'Mariana','Polonia',NULL,'X',NULL,'Mexico'),(3,1,'Mariana','Argentina','X',NULL,NULL,'Mexico'),(4,1,'Mariana','Arabia Saudita',NULL,NULL,'X','Polonia'),(5,1,'Pedro','Argentina','X',NULL,NULL,'Arabia Saudita'),(6,1,'Pedro','Polonia',NULL,NULL,'X','Mexico'),(7,1,'Pedro','Argentina','X',NULL,NULL,'Mexico'),(8,1,'Pedro','Arabia Saudita',NULL,'X',NULL,'Polonia'),(9,2,'Mariana','Arabia Saudita','X','','','Mexico'),(10,2,'Mariana','Polonia',NULL,NULL,'X','Argentina'),(11,2,'Mariana','Croacia',NULL,'X',NULL,'Belgica'),(12,2,'Mariana','Canada',NULL,NULL,'X','Marruecos'),(13,2,'Pedro','Arabia Saudita',NULL,NULL,'X','Mexico'),(14,2,'Pedro','Polonia',NULL,NULL,'X','Argentina'),(15,2,'Pedro','Croacia',NULL,'X',NULL,'Belgica'),(16,2,'Pedro','Canada',NULL,NULL,'X','Marruecos'),(17,3,'Mariana','Japón','','X',NULL,'España'),(18,3,'Mariana','Costa Rica',NULL,NULL,'X','Alemania'),(19,3,'Mariana','Corea del Sur',NULL,NULL,'X','Portugal'),(20,3,'Mariana','Ghana','X',NULL,NULL,'Uruguay'),(21,3,'Pedro','Japón',NULL,NULL,'X','España'),(22,3,'Pedro','Costa Rica',NULL,NULL,'X','Alemania'),(23,3,'Pedro','Corea del Sur','X',NULL,NULL,'Portugal'),(24,3,'Pedro','Ghana',NULL,'X',NULL,'Uruguay');
/*!40000 ALTER TABLE `pronosticos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-27 18:02:37
