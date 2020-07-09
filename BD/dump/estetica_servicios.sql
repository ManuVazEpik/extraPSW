-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: estetica
-- ------------------------------------------------------
-- Server version	5.7.30-log

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
-- Table structure for table `servicios`
--

DROP TABLE IF EXISTS `servicios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `servicios` (
  `id_ser` int(11) NOT NULL AUTO_INCREMENT,
  `servicio` varchar(50) NOT NULL,
  `duracion` time NOT NULL,
  `costo` int(11) NOT NULL,
  PRIMARY KEY (`id_ser`)
) ENGINE=InnoDB AUTO_INCREMENT=42 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `servicios`
--

LOCK TABLES `servicios` WRITE;
/*!40000 ALTER TABLE `servicios` DISABLE KEYS */;
INSERT INTO `servicios` VALUES (1,'Premium Makeup de día','01:00:00',1400),(2,'Premium Makeup con aerógrafo','01:10:00',1650),(3,'Premium Makeup de noche','01:20:00',1750),(4,'Esmalte natural en manos','00:20:00',340),(5,'Esmalte natural en pies','00:20:00',350),(6,'Gel en manos','00:40:00',460),(7,'Gel en pies','00:45:00',480),(8,'Manicure para caballero','00:30:00',500),(9,'Manicure','00:45:00',500),(10,'Pedicure para caballero','01:05:00',520),(11,'Pedicure','01:05:00',520),(12,'Gel en manos con decoración','01:00:00',580),(13,'Manicure gel','00:55:00',580),(14,'Pedicure gel','01:15:00',620),(15,'Gel en manos y pies','01:10:00',650),(16,'Manicure y pedicure para caballero','01:40:00',720),(17,'Manicure y pedicure','02:00:00',720),(18,'Manicure y pedicure gel','02:20:00',880),(19,'Estilizado de extensiones','00:35:00',140),(20,'Aplicación de pestañas','00:20:00',210),(21,'Alaciado con plancha','00:50:00',490),(22,'Moldeado con secadora','00:50:00',490),(23,'Ondas surfer','01:00:00',490),(24,'Ondas vintage','01:00:00',490),(25,'Peinado sencillo','00:45:00',530),(26,'Peinado recogido','01:00:00',640),(27,'Maquillaje de día sin pestañas','00:50:00',800),(28,'Maquillaje de día con pestañas','01:00:00',920),(29,'Alto peinado','01:00:00',930),(30,'Maquillaje de noche sin pestañas','00:50:00',990),(31,'Maquillaje de noche con pestañas','01:00:00',1160),(32,'Estilizado de extensiones','00:35:00',140),(33,'Paquete maquillaje de día y Ondas','02:00:00',1150),(34,'Paquete maquillaje de día y peinado recogido','02:00:00',1350),(35,'Paquete maquillaje de noche y ondas','02:10:00',1380),(36,'Paquete maquillaje de noche y peinado recogido','02:10:00',1600),(37,'Corte individual','00:30:00',490),(38,'Paquete 2 cortes','00:50:00',890),(39,'Paquete 3 cortes','01:10:00',1090),(40,'Paquete 4 cortes','01:30:00',1190),(41,'Tratamiento de hidratación con Olaplex','00:30:00',390);
/*!40000 ALTER TABLE `servicios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-09  2:50:42
