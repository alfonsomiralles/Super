-- MySQL dump 10.13  Distrib 8.0.22, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: centrosdb
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
-- Table structure for table `centros_computacion`
--

DROP TABLE IF EXISTS `centros_computacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `centros_computacion` (
  `c_nombre_centro` char(50) NOT NULL,
  `c_capacidad` int NOT NULL DEFAULT '0',
  `c_cola_de_trabajo` int NOT NULL DEFAULT '0',
  `c_usuario` char(10) NOT NULL,
  `c_cant_trabajos_cola` int DEFAULT '0',
  `c_estado` char(30) DEFAULT 'Libre',
  PRIMARY KEY (`c_nombre_centro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `centros_computacion`
--

LOCK TABLES `centros_computacion` WRITE;
/*!40000 ALTER TABLE `centros_computacion` DISABLE KEYS */;
INSERT INTO `centros_computacion` VALUES ('centro1',30000,3,'adminc',0,'Libre'),('centro2',50000,2,'adminc',0,'Libre'),('centro3',20000,1,'adminc',0,'Libre'),('CentroTest',20000,4,'adminc',0,'Libre');
/*!40000 ALTER TABLE `centros_computacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `trabajos_centros`
--

DROP TABLE IF EXISTS `trabajos_centros`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `trabajos_centros` (
  `t_nombre_trabajo` char(30) NOT NULL,
  `t_cant_operaciones` int NOT NULL DEFAULT '0',
  `t_usuario` char(30) NOT NULL,
  `t_centro_asignado` char(30) DEFAULT 'vacio',
  `t_estado` char(30) DEFAULT 'Sin Asignar',
  `t_orden` int NOT NULL AUTO_INCREMENT,
  `t_op_rest` int DEFAULT '0',
  PRIMARY KEY (`t_orden`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `trabajos_centros`
--

LOCK TABLES `trabajos_centros` WRITE;
/*!40000 ALTER TABLE `trabajos_centros` DISABLE KEYS */;
INSERT INTO `trabajos_centros` VALUES ('trabajo1',200000,'admina','vacio','Sin Asignar',1,200000),('trabajo2',300000,'adminu','vacio','Sin Asignar',2,300000),('trabajo3',500000,'adminc','vacio','Sin Asignar',3,500000);
/*!40000 ALTER TABLE `trabajos_centros` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios_db`
--

DROP TABLE IF EXISTS `usuarios_db`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios_db` (
  `u_usuario` char(10) DEFAULT NULL,
  `u_contraseña` char(24) DEFAULT NULL,
  `u_tipo_usuario` char(30) NOT NULL,
  PRIMARY KEY (`u_tipo_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios_db`
--

LOCK TABLES `usuarios_db` WRITE;
/*!40000 ALTER TABLE `usuarios_db` DISABLE KEYS */;
INSERT INTO `usuarios_db` VALUES ('admina','[a, d, m, i, n, a]','Administrador'),('adminc','[a, d, m, i, n, c]','Administrador Centro'),('adminu','[a, d, m, i, n, u]','Usuario');
/*!40000 ALTER TABLE `usuarios_db` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-05-06 18:47:33
