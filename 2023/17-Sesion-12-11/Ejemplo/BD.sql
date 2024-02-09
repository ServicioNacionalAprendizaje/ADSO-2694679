-- Crear la base de datos "investigacion"
CREATE DATABASE investigacion;

-- Usar la base de datos "investigacion"
USE investigacion;

-- Creación de la tabla para estudiantes
CREATE TABLE Estudiantes (
    codigo INT PRIMARY KEY,
    documento VARCHAR(20),
    nombres VARCHAR(50),
    apellidos VARCHAR(50)
);

-- Creación de la tabla para materias
CREATE TABLE Materias (
    codigo INT PRIMARY KEY,
    numero_semestre INT,
    materia VARCHAR(100)
);

-- Creación de la tabla para la matrícula de materias
CREATE TABLE Matricula (
    codigo_estudiante INT,
    estudiante VARCHAR(100),
    codigo_materia INT,
    materia VARCHAR(100),
    nota_definitiva FLOAT,
    periodo VARCHAR(10)
);
