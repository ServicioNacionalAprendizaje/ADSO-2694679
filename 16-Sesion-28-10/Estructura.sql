-- Sistema de ubicación.

create database ubicacion;

use ubicacion;

create table continente(
	id int primary key auto_increment,
	codigo_postal varchar(20) not null,
	descripcion varchar(50) not null
);

create table pais(
	id int primary key auto_increment,
	codigo_postal varchar(20) not null,
	descripcion varchar(50) not null,
	contiente_id int,
	constraint fk_continente_id_pais_continente foreign key (contiente_id) references continente(id)
);

create table estado(
	id int primary key auto_increment,
	codigo_postal varchar(20) not null,
	descripcion varchar(50) not null,
	pais_id int,
	constraint fk_pais_id_estado_pais foreign key (pais_id) references pais(id)
);

create table ciudad(
	id int primary key auto_increment,
	codigo_postal varchar(20) not null,
	descripcion varchar(50) not null,
	estado_id int,
	constraint fk_estado_id_ciudad_estado foreign key (estado_id) references estado(id)
);

-- Nota en equipo de dos a tre aprendices, realizar: 
-- Cada grupo debe informar por el chat e indicar con cual grupo de paises va a trabajar.

-- 1 África - Egipto, Nigeria, Sudáfrica, Marruecos, Kenia
-- 2 América del Norte - Canadá, Estados Unidos, México, Cuba, Guatemala
-- 3 América del Sur - Brasil, Argentina, Colombia, Chile, Perú
-- 4 Asia - China, India, Japón, Corea del Sur, Arabia Saudita
-- 5 Europa - Francia, Alemania, Reino Unido, Italia, España
-- 6 Oceanía - Australia, Nueva Zelanda, Fiji, Papúa Nueva Guinea, Islas Salomón
-- 7 África - Etiopía, Ghana, Costa de Marfil, Tanzania, Angola
-- 8 América del Norte - Honduras, Panamá, El Salvador, Costa Rica, Belice
-- 9 América del Sur - Venezuela, Ecuador, Bolivia, Uruguay, Paraguay
-- 10 Asia - Rusia, Turquía, Vietnam, Malasia, Tailandia
-- 11 Europa - Portugal, Suecia, Países Bajos (Holanda), Bélgica, Suiza
-- 12 Oceanía - Samoa, Tonga, Vanuatu, Micronesia, Palau
-- 13 África - Argelia, Senegal, Uganda, Zambia, Sudán
-- 14 América del Norte - República Dominicana, Trinidad y Tobago, Haití, Bahamas, Barbados
-- 15 Asia - Indonesia, Singapur, Filipinas, Sri Lanka, Nepal

-- Cada equipo debe registrar los continentes, los paises seleccionados, 5 estados y 5 ciudades.


-- MR
-- SQL
-- Backend (Modelo, Vista, Controller). 
-- Saber usar la conexion.