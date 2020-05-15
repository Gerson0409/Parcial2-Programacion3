CREATE DATABASE IF NOT EXISTS `parcial4` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `parcial4`;


DROP TABLE IF EXISTS `consultas`;

CREATE TABLE `consultas` (
`id` int NOT NULL AUTO_INCREMENT,
`Nombre` varchar(50) DEFAULT NULL,
`Apellido` varchar(50) DEFAULT NULL,
PRIMARY KEY (`id`)
);


/*!40101 SET @saved_cs_client = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
`id` int NOT NULL AUTO_INCREMENT,
`Nombre` varchar(50) DEFAULT NULL,
`Contrasenia` varchar(50) DEFAULT NULL,
PRIMARY KEY (`id`)
);

insert into `usuario` values(1, "Gerson", "12345");
insert into `usuario` values(2, "antonio", "1911");
insert into `consultas` values (1, "Gerson", "Alas");

select * from usuario;
select * from consultas;