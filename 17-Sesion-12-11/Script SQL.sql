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
	documento VARCHAR(12) NOT NULL UNIQUE,
	nombre VARCHAR(40) NOT NULL ,
	apellido VARCHAR(40) NOT NULL ,
	correo VARCHAR(40) NULL UNIQUE,
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
	nota DECIMAL(10,2) NULL,
	observacion VARCHAR(200) NOT NULL ,
    id_estudiante INT NOT NULL,
    id_materia INT NOT NULL,
	estado BIT DEFAULT 1,
    FOREIGN KEY (id_estudiante) REFERENCES estudiante(id),
    FOREIGN KEY (id_materia) REFERENCES materia(id),
	UNIQUE (id_estudiante, id_materia)
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

-- Insertar materias
INSERT INTO materia(codigo, nombre,	descripcion, numero_trimestre, estado) VALUES
('101012', 'Algoritmos', 'Documentación y realización de algoritmos', 1, 1),
('101013', 'Requerimientos', 'Documentación del proyecto', 1, 1),
('101013', 'Programación POO', 'Costruir clases', 2, 1),
('101014', 'Diseño WEB', 'Costruir apliaciones WEB', 3, 1);

INSERT INTO  matricula (codigo, nota, observacion, estado, id_materia, id_estudiante) VALUES
('56', 90.5, 'Buena participación', 1, 1, 1),
('89', 85.0, 'Ni bueno ni malo', 1, 2, 2),
('89', 78.3, 'Métale más ganas', 0, 3, 3);

INSERT INTO  matricula (codigo, observacion, estado, id_materia, id_estudiante) VALUES
('ABC123', 'Aprobado', 1,2,1),
('XYZ789', 'Regular', 1,3,2),
('DEF456', 'Bueno', 1,4,4),
('GHI098', 'Suficiente', 1,4,1);

-- Consultas
SELECT * FROM estudiante;
SELECT * FROM materia;
SELECT * FROM matricula;

-- Mostrar que materias tiene matriculadas el estudiante con su respectiva nota, (null o dato)

SELECT 
	CONCAT(e.nombre, e.apellido) as estudiante,
	ma.nombre,
	m.nota
FROM 
	estudiante e
	INNER JOIN matricula m ON e.id = m.id_estudiante
	INNER JOIN materia ma ON m.id_materia = m.id;

-- (1-2) INNER JOIN - (3,4)LEFT JOIN - (5,6)RIGHT JOIN
SELECT 
	CONCAT(e.nombre, ' ', e.apellido) as estudiante,
    ma.nombre as materia,
    m.nota
FROM 
	estudiante e
	INNER JOIN matricula m ON e.id = m.id_estudiante
	INNER JOIN materia ma ON ma.id = m.id_materia
WHERE m.nota IS NOT NULL;


-- Conocer estudiantes sin nota
SELECT 
	CONCAT(e.nombre, ' ', e.apellido) as estudiante,
    ma.nombre as materia,
    m.nota
FROM 
	estudiante e
	INNER JOIN matricula m ON e.id = m.id_estudiante
	INNER JOIN materia ma ON ma.id = m.id_materia
WHERE m.nota IS NULL;
