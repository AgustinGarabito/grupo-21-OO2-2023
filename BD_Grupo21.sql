CREATE DATABASE  IF NOT EXISTS `grupo21` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `grupo21`;
-- MySQL dump 10.13  Distrib 8.0.32, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: grupo21
-- ------------------------------------------------------
-- Server version	8.0.33-0ubuntu0.22.04.2

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
-- Table structure for table `alumbrado_inteligente`
--

DROP TABLE IF EXISTS `alumbrado_inteligente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alumbrado_inteligente` (
  `id` int NOT NULL,
  `valor_minimo` int NOT NULL,
  `valor_maximo` int NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FKke3x5dide17mdn1f31rl5pfd8` FOREIGN KEY (`id`) REFERENCES `dispositivoiot` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `alumbrado_inteligente`
--

LOCK TABLES `alumbrado_inteligente` WRITE;
/*!40000 ALTER TABLE `alumbrado_inteligente` DISABLE KEYS */;
INSERT INTO `alumbrado_inteligente` VALUES (1,19,51),(2,21,52),(3,18,49),(4,19,51),(5,22,48),(6,20,53);
/*!40000 ALTER TABLE `alumbrado_inteligente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dispositivoiot`
--

DROP TABLE IF EXISTS `dispositivoiot`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dispositivoiot` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `nro_sector` int NOT NULL,
  `deleted` bit(1) NOT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dispositivoiot`
--

LOCK TABLES `dispositivoiot` WRITE;
/*!40000 ALTER TABLE `dispositivoiot` DISABLE KEYS */;
INSERT INTO `dispositivoiot` VALUES (1,'Alumbrado 30',30,_binary '\0','2023-06-16 11:25:53.249360','2023-06-16 11:25:53.249432'),(2,'Alumbrado 58',58,_binary '\0','2023-06-16 11:26:15.508274','2023-06-16 11:26:15.508325'),(3,'Alumbrado 61',61,_binary '\0','2023-06-16 11:26:37.442450','2023-06-16 11:26:37.442484'),(4,'Alumbrado 76',76,_binary '\0','2023-06-16 11:27:04.844092','2023-06-16 11:27:04.844151'),(5,'Alumbrado 87',87,_binary '\0',NULL,'2023-06-16 11:28:56.342209'),(6,'Alumbrado 91',91,_binary '\0',NULL,'2023-06-16 11:29:06.709018');
/*!40000 ALTER TABLE `dispositivoiot` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `evento`
--

DROP TABLE IF EXISTS `evento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `evento` (
  `id` int NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(255) DEFAULT NULL,
  `fecha` date DEFAULT NULL,
  `hora` time DEFAULT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `dispositivoiot_id` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKd1sbsib9kmxetchghmhamnpru` (`dispositivoiot_id`),
  CONSTRAINT `FKd1sbsib9kmxetchghmhamnpru` FOREIGN KEY (`dispositivoiot_id`) REFERENCES `dispositivoiot` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evento`
--

LOCK TABLES `evento` WRITE;
/*!40000 ALTER TABLE `evento` DISABLE KEYS */;
/*!40000 ALTER TABLE `evento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicion`
--

DROP TABLE IF EXISTS `medicion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `fecha` date NOT NULL,
  `hora` time NOT NULL,
  `created_at` datetime(6) DEFAULT NULL,
  `updated_at` datetime(6) DEFAULT NULL,
  `dispositivoiot_id` int NOT NULL,
  PRIMARY KEY (`id`,`dispositivoiot_id`),
  KEY `FK39k2ag90g96u7q6g2jlj9b8du` (`dispositivoiot_id`),
  CONSTRAINT `FK39k2ag90g96u7q6g2jlj9b8du` FOREIGN KEY (`dispositivoiot_id`) REFERENCES `dispositivoiot` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicion`
--

LOCK TABLES `medicion` WRITE;
/*!40000 ALTER TABLE `medicion` DISABLE KEYS */;
INSERT INTO `medicion` VALUES 
(1,'2023-06-05','07:31:00','2023-06-16 00:00:00.000000','2023-06-17 00:00:00.000000',1),
(2,'2023-06-05','20:01:00','2023-06-16 00:00:00.000000','2023-06-16 00:00:00.000000',2),
(3,'2023-06-06','19:00:00','2023-06-16 00:00:00.000000','2023-06-17 00:00:00.000000',3),
(4,'2023-06-06','19:10:00','2023-06-16 00:00:00.000000','2023-06-17 00:00:00.000000',4),
(5,'2023-06-07','18:15:00','2023-06-16 00:00:00.000000','2023-06-07 00:00:00.000000',5),
(6,'2023-06-07','20:05:00','2023-06-16 00:00:00.000000','2023-06-17 00:00:00.000000',6),
(7,'2023-06-07','07:01:00','2023-06-16 00:00:00.000000','2023-06-17 00:00:00.000000',2),
(8,'2023-06-08','08:01:00','2023-06-16 00:00:00.000000','2023-06-16 00:00:00.000000',3),
(9,'2023-06-08','07:42:00','2023-06-16 00:00:00.000000','2023-06-17 00:00:00.000000',4),
(10,'2023-06-08','07:52:00','2023-06-16 00:00:00.000000','2023-06-17 00:00:00.000000',5);
/*!40000 ALTER TABLE `medicion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicion_alumbrado`
--

DROP TABLE IF EXISTS `medicion_alumbrado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `medicion_alumbrado` (
  `id` int NOT NULL,
  `sensor_movimiento` bit(1) NOT NULL,
  `valor_sensor` int NOT NULL,
  PRIMARY KEY (`id`),
  CONSTRAINT `FKj5hs9m3gn4of27sncatmor9d` FOREIGN KEY (`id`) REFERENCES `medicion` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicion_alumbrado`
--

LOCK TABLES `medicion_alumbrado` WRITE;
/*!40000 ALTER TABLE `medicion_alumbrado` DISABLE KEYS */;
INSERT INTO `medicion_alumbrado` VALUES 
(1,_binary '\0',18),
(2,_binary '',53),
(3,_binary '',23),
(4,_binary '',18),
(5,_binary '\0',21),
(6,_binary '',54),
(7,_binary '',20),
(8,_binary '',18),
(9,_binary '\0',18),
(10,_binary '',20);
/*!40000 ALTER TABLE `medicion_alumbrado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` int NOT NULL AUTO_INCREMENT,
  `createdat` datetime(6) DEFAULT NULL,
  `enabled` bit(1) DEFAULT NULL,
  `password` varchar(60) NOT NULL,
  `updatedat` datetime(6) DEFAULT NULL,
  `username` varchar(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_sb8bbouer5wak8vyiiy4pf2bx` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'2023-06-06 00:00:00.000000',_binary '','$2a$10$hWTPIXdjMkOiP2j6DnZVuejh65UtpEWnHkX0vvGEx6T9QPw6vJ9/C','2023-06-06 00:00:00.000000','admin'),(2,'2023-06-05 18:28:09.000000',_binary '','$2a$10$HqqkxKfEC6yl2bL917fy2uoUE8fWdJykH64DEi6h4qZND.u7QnO2u','2023-06-05 18:28:10.000000','auditor');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `createdat` datetime(6) DEFAULT NULL,
  `role` varchar(100) NOT NULL,
  `updatedat` datetime(6) DEFAULT NULL,
  `user_id` int NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UKscfpive7aa0o9savdwmxmnaij` (`role`,`user_id`),
  KEY `FK859n2jvi8ivhui0rl0esws6o` (`user_id`),
  CONSTRAINT `FK859n2jvi8ivhui0rl0esws6o` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (1,'2023-06-05 18:28:09.000000','ROLE_ADMIN','2023-06-05 18:28:10.000000',1),(2,'2023-06-05 18:28:09.000000','ROLE_AUDITOR','2023-06-05 18:28:10.000000',2);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-06-17 14:26:18
