/*
Created: 23/06/2019
Modified: 7/07/2019
Model: MySQL 5.7
Database: MySQL 5.7
*/




-- Create tables section -------------------------------------------------

DROP DATABASE IF EXISTS viajero_seguro;
CREATE DATABASE IF NOT EXISTS viajero_seguro;
USE viajero_seguro;


-- Table Usuario

CREATE TABLE `Usuario`
(
  `Id_Usuario` Int NOT NULL AUTO_INCREMENT,
  `Nombre` Varchar(50),
  `Email` Varbinary(80),
  `Nacionalidad` Varchar(20),
  `Imagen` Longblob,
  `Tipo_Usuario` Varchar(20),
  PRIMARY KEY (`Id_Usuario`)
) ENGINE = MyISAM
;

-- Table Pais

CREATE TABLE `Pais`
(
  `Id_Pais` Int NOT NULL AUTO_INCREMENT,
  `Pais` Varchar(20),
  `Cod_Pais` Varchar(20),
  `Idioma` Varchar(20),
  `Moneda` Varchar(20),
  `Requisitos` Longtext,
  `Imagen` Longblob,
  `ruta_imagen` Longtext,
  `Id_Alojamiento` Int,
  `Id_Sitios` Int NOT NULL,
  `Id_Transporte` Int NOT NULL,
  `Id_Capital` Int NOT NULL,
  `Id_Usuario` Int NOT NULL,
  PRIMARY KEY (`Id_Pais`,`Id_Transporte`,`Id_Sitios`,`Id_Usuario`,`Id_Capital`)
) ENGINE = MyISAM
;

-- Table Alojamiento

CREATE TABLE `Alojamiento`
(
  `Id_Alojamiento` Int NOT NULL,
  `Nombre` Varchar(50),
  `Direccion` Varchar(40),
  `Telefono` Int,
  `Email` Varchar(50),
  `Observacion` Longtext
)
;

ALTER TABLE `Alojamiento` ADD PRIMARY KEY (`Id_Alojamiento`)
;

-- Table Sitios

CREATE TABLE `Sitios`
(
  `Id_Sitios` Int NOT NULL,
  `Nombre` Varchar(50),
  `Direccion` Varchar(40),
  `Email` Varchar(50),
  `Observacion` Longtext
)
;

ALTER TABLE `Sitios` ADD PRIMARY KEY (`Id_Sitios`)
;

-- Table Transporte

CREATE TABLE `Transporte`
(
  `Id_Transporte` Int NOT NULL,
  `Nombre` Varchar(50),
  `Direccion` Varchar(40),
  `Telefono` Int,
  `Email` Varchar(50),
  `Observacion` Longtext
)
;

ALTER TABLE `Transporte` ADD PRIMARY KEY (`Id_Transporte`)
;

-- Table Capital

CREATE TABLE `Capital`
(
  `Id_Capital` Int NOT NULL,
  `Nombre` Varchar(50),
  `Cod_Postal` Varchar(20),
  `Latitud` Longtext,
  `Longitud` Longtext,
  `Clima` Varchar(20)
)
;

ALTER TABLE `Capital` ADD PRIMARY KEY (`Id_Capital`)
;

-- Table capital2

CREATE TABLE `capital2`
(
  `Id_Capital` Int NOT NULL,
  `Nombre` Varchar(50),
  `imagen` Longtext,
  `Cod_Postal` Varchar(20),
  `Latitud` Longtext,
  `Longitud` Longtext,
  `Clima` Varchar(20),
  `N_Si` Varchar(20),
  `N_T` Varchar(20),
  `N_Dr` Varchar(50),
  `N_Ob` Longtext,
  `N_Si1` Varchar(20),
  `N_T1` Varchar(20),
  `N_Dr1` Varchar(50),
  `N_Ob1` Longtext,
  `N_Si2` Varchar(20),
  `N_T2` Varchar(20),
  `N_Dr2` Varchar(50),
  `N_Ob2` Longtext,
  `N_Al` Varchar(20),
  `N_Ta` Varchar(20),
  `N_Dra` Varchar(50),
  `N_Oba` Longtext,
  `N_Al1` Varchar(20),
  `N_Ta1` Varchar(20),
  `N_Dra1` Varchar(50),
  `N_Oba1` Longtext,
  `N_Al2` Varchar(20),
  `N_Ta2` Varchar(20),
  `N_Dra2` Varchar(50),
  `N_Oba2` Longtext,
  `N_Tra` Char(50),
  `N_Tao` Longtext,
  `N_Tra1` Varchar(50),
  `N_Tao1` Longtext
)
;

ALTER TABLE `capital2` ADD PRIMARY KEY (`Id_Capital`)
;

-- Table Encuesta

CREATE TABLE `Encuesta`
(
  `Id_Encuesta` Int NOT NULL AUTO_INCREMENT,
  `Comentario` Longtext,
  `Calificacion` Int,
  PRIMARY KEY (`Id_Encuesta`)
)
;

-- Create foreign keys (relationships) section ------------------------------------------------- 


ALTER TABLE `Pais` ADD CONSTRAINT `Relationship4` FOREIGN KEY (`Id_Transporte`) REFERENCES `Transporte` (`Id_Transporte`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Pais` ADD CONSTRAINT `Relationship5` FOREIGN KEY (`Id_Sitios`) REFERENCES `Sitios` (`Id_Sitios`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Pais` ADD CONSTRAINT `Relationship6` FOREIGN KEY (`Id_Usuario`) REFERENCES `Usuario` (`Id_Usuario`) ON DELETE RESTRICT ON UPDATE RESTRICT
;


ALTER TABLE `Pais` ADD CONSTRAINT `Relationship7` FOREIGN KEY (`Id_Capital`) REFERENCES `Capital` (`Id_Capital`) ON DELETE RESTRICT ON UPDATE RESTRICT
;




