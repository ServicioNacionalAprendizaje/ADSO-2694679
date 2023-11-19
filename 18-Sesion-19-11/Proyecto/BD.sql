-- Datos para heredar a la ficha 79. 
-- Prácticar
-- BD: u342060465_tienda_2694679
-- USER: u342060465_tienda_2694679
-- PWD: tlrQZQ6+n
-- SERVER: 149.100.155.52
-- PORT: 3306



-- DDL

-- Eliminar base de datos 
DROP  DATABASE  IF EXISTS tienda_79;

-- Crear base de datos 
CREATE DATABASE  tienda_79;

-- Usar base de datos 
USE tienda_79;

-- Crear entidades de la base de datos 
create TABLE producto (
	id bigint PRIMARY key not null auto_increment,
	codigo VARCHAR(30) not null, 
	nombre VARCHAR(40)not null,
	precio DOUBLE not null,
	cantidad bigint not null,
	state bit NOT NULL DEFAULT 1,
	deleted_at DATETIME,	
	updated_at DATETIME,
	created_at DATETIME
);

create TABLE cliente (
	id bigint PRIMARY KEY NOT NULL auto_increment,
	nombre VARCHAR(50) NOT NULL, 
	correo VARCHAR(100) NOT NULL, 
	telefono VARCHAR(15) NOT NULL,
	direccion VARCHAR(100) NOT NULL,
	state bit NOT NULL DEFAULT 1,
	deleted_at DATETIME,	
	updated_at DATETIME,
	created_at DATETIME
);
create TABLE factura(
	id bigint PRIMARY KEY NOT NULL auto_increment,
	codigo VARCHAR (30) NOT null,
	fecha DATETime NOT null ,
	valor_total DOUBLE Not null,
	cliente_id bigint,
	state bit NOT NULL DEFAULT 1,
	deleted_at DATETIME,	
	updated_at DATETIME,
	created_at DATETIME,
	FOREIGN key (cliente_id) REFERENCES cliente(id)
);
	create TABLE factura_detalle(
	id bigint PRIMARY KEY NOT NULL  auto_increment,
	cantidad INT NOT NULL,
	valor_pagar DOUBLE NOT NULL,
	producto_id bigint NOT NULL,
	factura_id bigint NOT NULL,
	state bit NOT NULL DEFAULT 1,
	deleted_at DATETIME,	
	updated_at DATETIME,
	created_at DATETIME,
	FOREIGN key (factura_id) REFERENCES factura(id),
	FOREIGN key (producto_id) REFERENCES producto(id)

);


-- Estamento SQL DML
INSERT INTO producto(
	codigo, 
	nombre,
	precio,
	cantidad,
	created_at
)VALUES(
	'26C',
	'Chocolatina',
	2300,
	98,
	now()
);

-- Insetar datos masivos
INSERT INTO producto(
	codigo, 
	nombre,
	precio,
	cantidad,
	created_at
)VALUES
('27C','Chocolatina',2300,98,now()),
('28C','Mani',220,50, now()),
('29C','Arroz',4200,100, now());


-- Actualizar el registro [id]
UPDATE producto
SET
	codigo="mgt23",
	nombre="pan",
	precio=2000,
	cantidad=56,
	updated_at = now()
WHERE
	id=1;

-- Elimianr el registro [id] - físico
DELETE FROM producto
WHERE 
	id=2;
	
-- Elimianado lógico
UPDATE producto SET deleted_at=now() WHERE id = 1;
	
-- Consultar todos los registros físcos
SELECT 
	id,
	codigo,
	nombre,
	precio,
	cantidad,
	state,
	created_at,
	updated_at,
	deleted_at
FROM  
	producto;
	
-- Consultar todos los registro lógicos
SELECT 
	id,
	codigo,
	nombre,
	precio,
	cantidad,
	state,
	created_at,
	updated_at,
	deleted_at
FROM  
	producto
WHERE deleted_at is null;