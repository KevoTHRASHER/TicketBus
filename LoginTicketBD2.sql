-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema LoginTicket
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema LoginTicket
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `LoginTicket` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci ;
USE `LoginTicket` ;

-- -----------------------------------------------------
-- Table `LoginTicket`.`Boleto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LoginTicket`.`Boleto` (
  `NombreBoleto` VARCHAR(45) NULL DEFAULT NULL,
  `OrigenBoleto` VARCHAR(45) NULL DEFAULT NULL,
  `DestinoBoleto` VARCHAR(45) NULL DEFAULT NULL,
  `AsientoBoleto` INT(11) NULL DEFAULT NULL,
  `HoraBoleto` VARCHAR(45) NULL,
  `FechaBoleto` VARCHAR(45) NULL DEFAULT NULL,
  `ClaseBoleto` VARCHAR(45) NULL DEFAULT NULL,
  `ValorBoleto` INT(11) NULL DEFAULT NULL)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


-- -----------------------------------------------------
-- Table `LoginTicket`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LoginTicket`.`Cliente` (
  `idCliente` INT(11) NOT NULL AUTO_INCREMENT,
  `NombreCliente` VARCHAR(45) NOT NULL,
  `Edad` INT(11) NOT NULL,
  `Telefono` VARCHAR(13) NOT NULL,
  `Email` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


-- -----------------------------------------------------
-- Table `LoginTicket`.`Destino`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LoginTicket`.`Destino` (
  `idDestino` INT(11) NOT NULL AUTO_INCREMENT,
  `CiudadDestino` VARCHAR(45) NOT NULL,
  `EstadoDestino` VARCHAR(45) NOT NULL,
  `AndenDestino` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idDestino`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


-- -----------------------------------------------------
-- Table `LoginTicket`.`Empleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LoginTicket`.`Empleado` (
  `idEmpleado` INT(11) NOT NULL AUTO_INCREMENT,
  `NombreEmpleado` VARCHAR(45) NOT NULL,
  `EmailEmpleado` VARCHAR(45) NOT NULL,
  `ContraseñaEmpleado` TINYBLOB NOT NULL,
  `EdadEmpleado` INT(11) NOT NULL,
  `CargoEmpleado` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idEmpleado`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


-- -----------------------------------------------------
-- Table `LoginTicket`.`Origen`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LoginTicket`.`Origen` (
  `idOrigen` INT(11) NOT NULL AUTO_INCREMENT,
  `CiudadOrigen` VARCHAR(45) NOT NULL,
  `EstadoOrigen` VARCHAR(45) NOT NULL,
  `AndenOrigen` VARCHAR(5) NOT NULL,
  PRIMARY KEY (`idOrigen`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


-- -----------------------------------------------------
-- Table `LoginTicket`.`Intinerario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LoginTicket`.`Intinerario` (
  `idIntinerario` INT(11) NOT NULL AUTO_INCREMENT,
  `HoraIntinerario` TIME NULL DEFAULT NULL,
  `FechaIntinerario` DATE NULL DEFAULT NULL,
  `Origen_idOrigen` INT(11) NOT NULL,
  `Destino_idDestino` INT(11) NOT NULL,
  PRIMARY KEY (`idIntinerario`, `Origen_idOrigen`, `Destino_idDestino`),
  INDEX `fk_Intinerario_Origen1_idx` (`Origen_idOrigen` ASC) VISIBLE,
  INDEX `fk_Intinerario_Destino1_idx` (`Destino_idDestino` ASC) VISIBLE,
  CONSTRAINT `fk_Intinerario_Destino1`
    FOREIGN KEY (`Destino_idDestino`)
    REFERENCES `LoginTicket`.`Destino` (`idDestino`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Intinerario_Origen1`
    FOREIGN KEY (`Origen_idOrigen`)
    REFERENCES `LoginTicket`.`Origen` (`idOrigen`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


-- -----------------------------------------------------
-- Table `LoginTicket`.`Viaje`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LoginTicket`.`Viaje` (
  `idViaje` INT(11) NOT NULL,
  `CapacidadViaje` INT(11) NULL DEFAULT NULL,
  `MarcaAutobusViaje` VARCHAR(45) NULL DEFAULT NULL,
  `NumeroViaje` INT(11) NULL DEFAULT NULL,
  `NombreConductor` VARCHAR(45) NULL DEFAULT NULL,
  `Intinerario_idIntinerario` INT(11) NOT NULL,
  PRIMARY KEY (`Intinerario_idIntinerario`, `idViaje`),
  INDEX `fk_Viaje_Intinerario1_idx` (`Intinerario_idIntinerario` ASC) VISIBLE,
  CONSTRAINT `fk_Viaje_Intinerario1`
    FOREIGN KEY (`Intinerario_idIntinerario`)
    REFERENCES `LoginTicket`.`Intinerario` (`idIntinerario`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_unicode_ci;


-- -----------------------------------------------------
-- Table `LoginTicket`.`LoginEmpleado`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `LoginTicket`.`LoginEmpleado` (
  `idLoginEmpleado` INT(5) NOT NULL AUTO_INCREMENT,
  `EmailEmpleadoLogin` VARCHAR(45) NOT NULL,
  `ContraseñaLoginEmpleado` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idLoginEmpleado`),
  UNIQUE INDEX `idLoginEmpleado_UNIQUE` (`idLoginEmpleado` ASC) VISIBLE)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
