-- DDL => Lenguaje de definición de datos

-- Base de datos relacional
create database ejercicio; 

-- Usar base de datos 
use ejercicio;

-- Crear entidades 
create table personas(
	id int primary key auto_increment,
	tipo_documento VARCHAR(20) not NULL,
	documento VARCHAR(12) not null,
	nombre varchar(50) not null,
	apellido varchar(50) not null
);

create table materias(
	id int primary key auto_increment,
	codigo VARCHAR(20) not NULL,
	descripcion VARCHAR(50) not null,
	credito TINYINT,
	estado bit not null DEFAULT 1
);

ALTER TABLE `ejercicio`.`personas` 
ADD COLUMN `estado` BIT NOT NULL DEFAULT 1 AFTER `apellido`;

-- DML => Lenguaje de manipulación de datos 

-- Insertar
insert into personas(
	tipo_documento,
	documento,
	nombre,
	apellido
)VALUES(
	'CC',
	'7598437543',
	'Pedro Pablo',
	'Gutierrez'
);


insert into personas(tipo_documento, documento,	nombre,	apellido)VALUES
('CC','7598437543','Ana','Rodriguéz'),
('TI','2423532','Jesús Ariel','Bonilla'),
('P','3543543','José','Martinéz'),
('CC','5435435435','Harold','Ordoñez');


-- Actualizar
update personas set 
	tipo_documento = 'CE'
	, documento = '2020212312'
	,nombre = 'Ana María'
	,apellido = 'Rodriguéz Zambrano'
    ,telefono = '343254'
where  id = 2;

-- Consultar
select * from personas;