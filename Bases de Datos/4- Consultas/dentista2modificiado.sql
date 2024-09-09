-- MySQL dump 10.13  Distrib 8.0.34, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: dentista2
-- ------------------------------------------------------
-- Server version	8.0.34
/*drop database dentista*/
CREATE DATABASE dentista;
use dentista;

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
-- Table structure for table `asegurado`
--

DROP TABLE IF EXISTS `asegurado`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `asegurado` (
  `codaseg` int NOT NULL,
  `codpac` int DEFAULT NULL,
  `cods` int DEFAULT NULL,
  `poliza` float(8,2) DEFAULT NULL,
  `pac_fnac` date DEFAULT NULL,
  PRIMARY KEY (`codaseg`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `asegurado`
--

LOCK TABLES `asegurado` WRITE;
/*!40000 ALTER TABLE `asegurado` DISABLE KEYS */;
/*!40000 ALTER TABLE `asegurado` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contador_visitas`
--

DROP TABLE IF EXISTS `contador_visitas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contador_visitas` (
  `paciente` int NOT NULL,
  `contvisitas` int NOT NULL,
  PRIMARY KEY (`paciente`),
  CONSTRAINT `contador_visitas_ibfk_1` FOREIGN KEY (`paciente`) REFERENCES `paciente` (`codpac`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contador_visitas`
--

LOCK TABLES `contador_visitas` WRITE;
/*!40000 ALTER TABLE `contador_visitas` DISABLE KEYS */;
INSERT INTO `contador_visitas` VALUES (1,5),(2,3),(3,2),(4,1),(5,1);
/*!40000 ALTER TABLE `contador_visitas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `edades_distintas`
--

DROP TABLE IF EXISTS `edades_distintas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `edades_distintas` (
  `edad` smallint NOT NULL,
  PRIMARY KEY (`edad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `edades_distintas`
--

LOCK TABLES `edades_distintas` WRITE;
/*!40000 ALTER TABLE `edades_distintas` DISABLE KEYS */;
INSERT INTO `edades_distintas` VALUES (24),(27),(28),(32),(42);
/*!40000 ALTER TABLE `edades_distintas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `hombres`
--

DROP TABLE IF EXISTS `hombres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `hombres` (
  `codpac` int NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `ape1` varchar(45) DEFAULT NULL,
  `ape2` varchar(45) DEFAULT NULL,
  `edad` int DEFAULT NULL,
  `tel` varchar(9) DEFAULT NULL,
  PRIMARY KEY (`codpac`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `hombres`
--

LOCK TABLES `hombres` WRITE;
/*!40000 ALTER TABLE `hombres` DISABLE KEYS */;
INSERT INTO `hombres` VALUES (1,'José','Martínez','Gómez',42,'961223344'),(3,'Fernando','Ruíz','Muñoz',32,'963445566'),(5,'Paco','Santillana','Meniz',24,'965667788');
/*!40000 ALTER TABLE `hombres` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mujeres`
--

DROP TABLE IF EXISTS `mujeres`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `mujeres` (
  `codpac` int NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `ape1` varchar(45) DEFAULT NULL,
  `ape2` varchar(45) DEFAULT NULL,
  `edad` int DEFAULT NULL,
  `tel` varchar(9) DEFAULT NULL,
  PRIMARY KEY (`codpac`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mujeres`
--

LOCK TABLES `mujeres` WRITE;
/*!40000 ALTER TABLE `mujeres` DISABLE KEYS */;
INSERT INTO `mujeres` VALUES (2,'Carmen','García','Solís',27,'962334455'),(4,'Nelly','Pérez','Campos',28,'964556677');
/*!40000 ALTER TABLE `mujeres` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `paciente`
--

DROP TABLE IF EXISTS `paciente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `paciente` (
  `codpac` int NOT NULL,
  `nom` varchar(45) DEFAULT NULL,
  `ape_1` varchar(45) DEFAULT NULL,
  `ape_2` varchar(45) DEFAULT NULL,
  `f_nac` date DEFAULT NULL,
  `edad` smallint DEFAULT NULL,
  `sexo` enum('V','M') DEFAULT NULL,
  `tel` varchar(9) DEFAULT NULL,
  PRIMARY KEY (`codpac`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `paciente`
--

LOCK TABLES `paciente` WRITE;
/*!40000 ALTER TABLE `paciente` DISABLE KEYS */;
INSERT INTO `paciente` VALUES (1,'José','Martínez','Gómez','1980-02-12',42,'V','961223344'),(2,'Paco','García','Solís','1995-01-01',27,'M','962334455'),(3,'Fernando','Ruíz','Muñoz','1990-04-05',32,'V','963445566'),(4,'Nelly','Pérez','Campos','1994-10-18',28,'M','964556677'),(5,'Paco','Santillana','Meniz','1998-09-25',24,'V','965667788'),(6,'Manuela','Sabina','Ortiz','2001-03-03',21,'M','956366936');
/*!40000 ALTER TABLE `paciente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seguro`
--

DROP TABLE IF EXISTS `seguro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `seguro` (
  `cods` int NOT NULL,
  `nomseg` varchar(100) DEFAULT NULL,
  `tipo` enum('N','I','P') DEFAULT NULL,
  PRIMARY KEY (`cods`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seguro`
--

LOCK TABLES `seguro` WRITE;
/*!40000 ALTER TABLE `seguro` DISABLE KEYS */;
/*!40000 ALTER TABLE `seguro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tratamiento`
--

DROP TABLE IF EXISTS `tratamiento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tratamiento` (
  `siglas` varchar(4) DEFAULT NULL,
  `coment` varchar(256) DEFAULT NULL,
  `nom_trat` varchar(20) DEFAULT NULL,
  `precio` float(9,3) DEFAULT NULL,
  `etapas` int DEFAULT NULL,
  `ntratamiento` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ntratamiento`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tratamiento`
--

LOCK TABLES `tratamiento` WRITE;
/*!40000 ALTER TABLE `tratamiento` DISABLE KEYS */;
INSERT INTO `tratamiento` VALUES ('ABV','Absorción de Venas','Absorción',999.290,5,1),('VAC','Vaciado sanguíneo','Vaciado',169.290,3,2),('FIC','Fístula con Tratamiento','Fístula',349.290,2,3),('VOR','Variado de Ortos','Variado',49.290,8,4),('SEN','Senilidad grave','Senil',29.290,1,5),('RX','Radiografía','Radio',149.290,8,6),('ORTO','Ortopedia','Orto',229.290,1,7),('ERN','Examen Rectal Natural','Examen',8169.290,3,8);
/*!40000 ALTER TABLE `tratamiento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visitas`
--

DROP TABLE IF EXISTS `visitas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `visitas` (
  `nvisita` int NOT NULL,
  `paciente` int NOT NULL,
  `fecha` date DEFAULT NULL,
  `ntratamiento` int DEFAULT NULL,
  `observaciones` varchar(512) DEFAULT NULL,
  PRIMARY KEY (`nvisita`,`paciente`),
  KEY `paciente` (`paciente`),
  KEY `visita_tfk_2_idx` (`ntratamiento`),
  CONSTRAINT `visita_tfk_2` FOREIGN KEY (`ntratamiento`) REFERENCES `tratamiento` (`ntratamiento`),
  CONSTRAINT `visitas_ibfk_1` FOREIGN KEY (`paciente`) REFERENCES `paciente` (`codpac`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visitas`
--

LOCK TABLES `visitas` WRITE;
/*!40000 ALTER TABLE `visitas` DISABLE KEYS */;
INSERT INTO `visitas` VALUES (1,1,'2020-01-15',4,'Nada que destacar'),(1,2,'2020-06-18',3,'Un personaje muy extraño'),(1,3,'2021-02-20',5,'No le queda nada'),(1,4,'2020-01-08',1,'Es muy pesado'),(1,5,'2020-02-22',1,'Es nuestra primera vez'),(2,1,'2020-01-15',1,'En muy buena forma'),(2,2,'2021-02-22',2,'Ha engordado'),(2,3,'2022-02-01',1,NULL),(3,1,'2020-01-11',3,'Tiene algo raro'),(3,2,'2021-08-10',1,'Tiene depresión'),(4,1,'2021-01-20',2,'Este viene mucho'),(5,1,'2021-10-01',2,'Le he pedido que no vuelva'),(6,1,'2023-12-13',NULL,'Al final ha vuelto!!!!');
/*!40000 ALTER TABLE `visitas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-12-14 16:40:19
