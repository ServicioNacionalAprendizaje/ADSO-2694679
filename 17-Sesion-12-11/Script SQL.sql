-- Eliminar base de datos si ya EXISTS
DROP DATABASE IF EXISTS evidencia_conocimiento;

-- Crear base de datos.
CREATE DATABASE evidencia_conocimiento;

-- Usar base de datos 
USE evidencia_conocimiento;

-- Crear entidades de la base de datos
CREATE TABLE estudiante(
	id INT PRIMARY KEY AUTO_INCREMENT,
	tipo_documento VARCHAR(40) NOT NULL ,
	documento VARCHAR(12) NOT NULL ,
	nombre VARCHAR(40) NOT NULL ,
	apellido VARCHAR(40) NOT NULL ,
	correo VARCHAR(40) NULL ,
	direccion VARCHAR(60) NOT NULL ,
	estado BIT DEFAULT 1	
);

CREATE TABLE materia(
	id INT PRIMARY KEY AUTO_INCREMENT,
	codigo VARCHAR(6) NOT NULL ,
	nombre VARCHAR(50) NOT NULL ,
	descripcion VARCHAR(200) NOT NULL ,
	numero_trimestre INT NOT NULL,
	estado BIT DEFAULT 1	
);

CREATE TABLE matricula(
	id INT PRIMARY KEY AUTO_INCREMENT,
	codigo VARCHAR(6) NOT NULL ,
	nota DECIMAL(10,2),
	observacion VARCHAR(200) NOT NULL ,
	estado BIT DEFAULT 1	
);

-- DML 

-- Insertar estudiantes
INSERT INTO estudiante(tipo_documento, documento, nombre, apellido, correo,	direccion,estado)VALUES
('CC','1079','Jesús','González','jesus@','Calle 56',1),
('CC','1080','Carlos','Mendez','carlos@','Calle 14',1),
('CC','1030','María','Gomez','maria@','Calle 29',1),
('CC','1050','Pedro','Perez','pedro@','Calle 45',1),
('CC','1068','Diana','Bonilla','diana@','Calle 19',1),
('CC','1020','Jorge','Suaza','jorge@','Calle 20',1);

