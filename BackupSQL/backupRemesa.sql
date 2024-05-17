CREATE DATABASE  IF NOT EXISTS `remesa` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `remesa`;
-- MySQL dump 10.13  Distrib 8.0.36, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: remesa
-- ------------------------------------------------------
-- Server version	8.0.36

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
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id` int NOT NULL AUTO_INCREMENT,
  `nombre` varchar(30) DEFAULT NULL,
  `apellido` varchar(30) DEFAULT NULL,
  `cedula` varchar(11) DEFAULT NULL,
  `direccion` varchar(30) DEFAULT NULL,
  `pais` varchar(30) DEFAULT NULL,
  `usuario` varchar(30) DEFAULT NULL,
  `contra` varchar(50) DEFAULT NULL,
  `rol` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1009 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (1,'Ander','Cas','12312','Sabana','Mexico','Test','12345',''),(2,'PrNombre','PrApellido','40242423','Sabana','Seleccione...','txt User','123',''),(1000,'prueba','Test','402321232','C/Hola Mundo #2','Seleccione...','asdasd','12345','A'),(1001,'','','','','Seleccione...','','123',''),(1002,'Hola','Mundo','2312','C/man','Republica Dominicana','User','123','U'),(1003,'PruebaClase','TestClase','001000000','C/Test','Republica Dominicana','Clase1','12345','A'),(1004,'Pedro','Martes','001458','C/paraiso','Estados Unidos','Prueba','001','U'),(1005,'Test','Insert','005','C/Josefa','Estados Unidos','Guest','2020','I'),(1006,'ANDERSON','CASTILLO','000104','C/Prueba','Republica Dominicana','Ander20','12345','U'),(1007,'PRUEBA','ENCRIPTACION','0001','C/maria','Seleccione...','T1','12345','U'),(1008,'Juana','Mendez','405','C - Manzanillo','Alemania','Ross','ca4b33532855080dfa79cf8a925d146d','U');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `envioremesa`
--

DROP TABLE IF EXISTS `envioremesa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `envioremesa` (
  `id_envio` int NOT NULL AUTO_INCREMENT,
  `nombreRemitente` varchar(30) DEFAULT NULL,
  `apellidoRemitente` varchar(30) DEFAULT NULL,
  `cedulaRemitente` varchar(15) DEFAULT NULL,
  `monto` float(10,2) DEFAULT NULL,
  `moneda` varchar(5) DEFAULT NULL,
  `nombreDestinatario` varchar(30) DEFAULT NULL,
  `apellidoDestinatario` varchar(30) DEFAULT NULL,
  `cedulaDestinatario` varchar(30) DEFAULT NULL,
  `EstatusID` int DEFAULT NULL,
  PRIMARY KEY (`id_envio`)
) ENGINE=InnoDB AUTO_INCREMENT=34 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `envioremesa`
--

LOCK TABLES `envioremesa` WRITE;
/*!40000 ALTER TABLE `envioremesa` DISABLE KEYS */;
INSERT INTO `envioremesa` VALUES (2,'Ramon','Casilla','402141',250.00,'DOP','Pedro','Receptor','001040',3),(4,'Hola','Mundo','2312',30.00,'DOP','Prueba','Metodo get','0010519',3),(6,'Juana','Mendez','405',20.00,'USD','Juan','Mendez','4040',1),(7,'Juana','Mendez','405',590.00,'USD','Mendez','Gonzalez','004',1),(9,'Juana','Mendez','405',200.00,'USD','Test','PDF','4040',4),(10,'Juana','Mendez','405',500.00,'EURO','PRUEBA','PDF','2491212312',1),(18,'Juana','Mendez','405',5010.00,'USD','PRUEBA','TASA','123123',4),(20,'Juana','Mendez','405',2910.00,'USD','Prueba','Euro','099',3),(21,'Juana','Mendez','405',0.00,'DOP','Prueba','Logo','090',3),(22,'Juana','Mendez','405',50.00,'DOP','Envio','PDF','9090',3),(23,'Juana','Mendez','405',900.00,'DOP','RAMON','JIMENEZ','2930123',4),(24,'Juana','Mendez','405',320.00,'DOP','STATUS','TEST','2423',4),(25,'Juana','Mendez','405',117564.00,'USD','Hola','Mundo','2321',3),(26,'Juana','Mendez','405',10.00,'DOP','Prueba','Send','2109',3),(28,'Juana','Mendez','405',2910.00,'USD','equivalencia','TASA','0010142032',4),(29,'Juana','Mendez','405',1164.00,'USD','Man','Two','12312312',3),(31,'Juana','Mendez','405',5400.00,'EURO','Oliver','Garcia','21321321',3),(32,'Juana','Mendez','405',1164.00,'USD','Kelvin','Casilla','00104940',3),(33,'Juana','Mendez','405',1164.00,'USD','Juan','Medina','0901293',3);
/*!40000 ALTER TABLE `envioremesa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `perfilusuario`
--

DROP TABLE IF EXISTS `perfilusuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `perfilusuario` (
  `id` int DEFAULT NULL,
  `idPerfil` int DEFAULT NULL,
  `Descripcion` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `perfilusuario`
--

LOCK TABLES `perfilusuario` WRITE;
/*!40000 ALTER TABLE `perfilusuario` DISABLE KEYS */;
INSERT INTO `perfilusuario` VALUES (1,1,'Invitado'),(2,2,'Usuario'),(3,3,'Administrador');
/*!40000 ALTER TABLE `perfilusuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `remesastatus`
--

DROP TABLE IF EXISTS `remesastatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `remesastatus` (
  `id` int DEFAULT NULL,
  `numeroEstado` int DEFAULT NULL,
  `descripcion` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `remesastatus`
--

LOCK TABLES `remesastatus` WRITE;
/*!40000 ALTER TABLE `remesastatus` DISABLE KEYS */;
INSERT INTO `remesastatus` VALUES (1,1,'Pendiente'),(2,2,'En Proceso'),(3,3,'Aprobado'),(4,4,'Retirado');
/*!40000 ALTER TABLE `remesastatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rolstatus`
--

DROP TABLE IF EXISTS `rolstatus`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rolstatus` (
  `id` int NOT NULL AUTO_INCREMENT,
  `rolid` int DEFAULT NULL,
  `rolDescripcion` varchar(30) DEFAULT NULL,
  `rolAbreviatura` char(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rolstatus`
--

LOCK TABLES `rolstatus` WRITE;
/*!40000 ALTER TABLE `rolstatus` DISABLE KEYS */;
INSERT INTO `rolstatus` VALUES (1,1,'Administrador','A'),(2,2,'Usuario','U'),(3,3,'Invitado','I');
/*!40000 ALTER TABLE `rolstatus` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tasacambio`
--

DROP TABLE IF EXISTS `tasacambio`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tasacambio` (
  `id` int NOT NULL AUTO_INCREMENT,
  `moneda` varchar(30) DEFAULT NULL,
  `monedaCompra` decimal(10,2) DEFAULT NULL,
  `monedaVenta` decimal(10,2) DEFAULT NULL,
  `abreviatura` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tasacambio`
--

LOCK TABLES `tasacambio` WRITE;
/*!40000 ALTER TABLE `tasacambio` DISABLE KEYS */;
INSERT INTO `tasacambio` VALUES (1,'Dolar',58.20,59.00,'US'),(2,'Euro',60.00,62.50,'E');
/*!40000 ALTER TABLE `tasacambio` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user` varchar(30) DEFAULT NULL,
  `contra` varchar(50) DEFAULT NULL,
  `rol` char(1) DEFAULT NULL,
  `id_Cliente` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (1,'User','123',NULL,NULL),(2,'Ander','123',NULL,NULL),(3,'Test','12345',NULL,NULL),(4,'Prueba','001',NULL,NULL),(5,'Guest','2020','I',NULL),(6,'Ander20','827ccb0eea8a706c4c34a16891f84e7b','U',NULL),(7,'T1','827ccb0eea8a706c4c34a16891f84e7b','U',NULL),(8,'Ross','ca4b33532855080dfa79cf8a925d146d','U',NULL);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'remesa'
--

--
-- Dumping routines for database 'remesa'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-05-17 12:33:22
