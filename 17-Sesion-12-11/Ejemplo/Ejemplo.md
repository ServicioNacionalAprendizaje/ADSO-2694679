## Promt AI

Deseo crear una base de datos en SQL, utilizando el lenguaje de definición de datos (DDL), con entidades para materias, estudiantes y matrícula de materias, basándome en la siguiente información:

- Generar una lista de 100 estudiantes con los campos {código, documento, nombres, apellidos}.
- Crear una lista de 10 materias con {código, número de semestre, materia}, asegurando que estas materias estén en el octavo semestre:
  - Estructuración de Proyectos de Investigación
  - Sistemas Distribuidos
  - Programación Móvil
  - Estructuración de Bases de Datos Relacionales
- Elaborar un listado de matrículas para estas materias durante los periodos 2020A, 2020B, 2021A, 2021B, 2022A, 2022B, 2023A, con los datos {código de estudiante, estudiante, código de materia, materia y nota definitiva de corte entre 0.0 y 5.0}.
  - Estructuración de Proyectos de Investigación
  - Sistemas Distribuidos
  - Programación Móvil
  - Estructuración de Bases de Datos Relacionales

Estos datos serán generados considerando la lista de estudiantes y materias, junto con sus códigos respectivos, con el objetivo de crear la estructura de una base de datos en SQL.

### Sentencias SQL
```sql

-- Eliminar la base de datos "investigacion" si existe
DROP DATABASE IF EXISTS investigacion;

-- Crear la base de datos "investigacion" si no existe
CREATE DATABASE IF NOT EXISTS investigacion;

-- Usar la base de datos "investigacion"
USE investigacion;

-- Creación de la tabla para estudiantes
CREATE TABLE estudiante (
    id INT PRIMARY KEY,
    documento VARCHAR(20),
    nombres VARCHAR(50),
    apellidos VARCHAR(50)
);

-- Creación de la tabla para materias
CREATE TABLE materia (
    id INT PRIMARY KEY,
    numero_semestre INT,
    materia VARCHAR(100)
);

-- Creación de la tabla para la matrícula de materias
CREATE TABLE matricula (
    id INT PRIMARY KEY AUTO_INCREMENT,
    materia_id INT,
    estudiante_id INT,
    nota_definitiva FLOAT,
    periodo VARCHAR(10),
    FOREIGN KEY (materia_id) REFERENCES estudiante(id)
);


-- Generar 1000 registros ficticios para la tabla de estudiantes con nombres aleatorios
INSERT INTO estudiante (id, documento, nombres, apellidos)
SELECT 
    seq AS codigo,
    CONCAT(FLOOR(RAND() * 100000), '123') AS documento,
    (
        SELECT name FROM (
            SELECT 'Juan' AS name UNION
            SELECT 'María' AS name UNION
            SELECT 'Alejandro' AS name UNION
            SELECT 'Isabella' AS name UNION
            SELECT 'Sofía' AS name UNION
            SELECT 'Diego' AS name UNION
            SELECT 'Valentina' AS name UNION
            SELECT 'Carlos' AS name UNION
            SELECT 'Camila' AS name UNION
            SELECT 'Miguel' AS name
        ) AS names ORDER BY RAND() LIMIT 1
    ) AS nombres,
    (
        SELECT surname FROM (
            SELECT 'García' AS surname UNION
            SELECT 'López' AS surname UNION
            SELECT 'Martínez' AS surname UNION
            SELECT 'Rodríguez' AS surname UNION
            SELECT 'Hernández' AS surname UNION
            SELECT 'González' AS surname UNION
            SELECT 'Pérez' AS surname UNION
            SELECT 'Sánchez' AS surname UNION
            SELECT 'Ramírez' AS surname UNION
            SELECT 'Torres' AS surname
        ) AS surnames ORDER BY RAND() LIMIT 1
    ) AS apellidos
FROM (
    SELECT (units.i + tens.i * 10 + hundreds.i * 100) + 1 AS seq
    FROM
        (SELECT 0 AS i UNION ALL SELECT 1 UNION ALL SELECT 2 UNION ALL SELECT 3 UNION ALL SELECT 4 UNION ALL SELECT 5 UNION ALL SELECT 6 UNION ALL SELECT 7 UNION ALL SELECT 8 UNION ALL SELECT 9) AS units,
        (SELECT 0 AS i UNION ALL SELECT 1 UNION ALL SELECT 2 UNION ALL SELECT 3 UNION ALL SELECT 4 UNION ALL SELECT 5 UNION ALL SELECT 6 UNION ALL SELECT 7 UNION ALL SELECT 8 UNION ALL SELECT 9) AS tens,
        (SELECT 0 AS i UNION ALL SELECT 1 UNION ALL SELECT 2 UNION ALL SELECT 3 UNION ALL SELECT 4 UNION ALL SELECT 5 UNION ALL SELECT 6 UNION ALL SELECT 7 UNION ALL SELECT 8 UNION ALL SELECT 9) AS hundreds
    LIMIT 1000
) AS t;



-- Crear las materias individualmente para el octavo semestre
INSERT INTO materia (id, numero_semestre, materia) VALUES
(1, 8, 'Estructuración de Proyectos de Investigación'),
(2, 8, 'Sistemas Distribuidos'),
(3, 8, 'Programación Móvil'),
(4, 8, 'Estructuración de Bases de Datos Relacionales'),
(5, 4, 'Análisis de Algoritmos y Complejidad'),
(6, 4, 'Computación en la Nube'),
(7, 4, 'Diseño de Interfaces de Usuario'),
(8, 4, 'Gestión de Proyectos Tecnológicos'),
(9, 4, 'Programación Orientada a Objetos Avanzada'),
(10, 4, 'Ingeniería de Software Avanzada'),
(11, 9, 'Machine Learning y Minería de Datos'),
(12, 9, 'Ciberseguridad y Ética Informática'),
(13, 9, 'Internet de las Cosas (IoT)'),
(14, 9, 'Robótica Avanzada'),
(15, 9, 'Desarrollo de Videojuegos'),
(16, 10, 'Inteligencia Artificial para la Toma de Decisiones'),
(17, 10, 'Arquitectura de Computadoras Modernas'),
(18, 10, 'Bioinformática y Genómica Computacional'),
(19, 10, 'Computación Gráfica Avanzada'),
(20, 10, 'Computación Gráfica Avanzada');


-- Establecer la matrícula de los estudiantes en las materias 1, 2, 3 y 4 para un solo período
INSERT INTO matricula (materia_id, estudiante_id, nota_definitiva, periodo)
SELECT
    m.id AS materia_id,
    e.id AS estudiante_id,
    ROUND(RAND() * 5, 1) AS nota_definitiva,
    '2020A' AS periodo
FROM materia m
JOIN estudiante e
WHERE m.id IN (1, 2, 3, 4)
ORDER BY RAND()
LIMIT 25;

-- Establecer la matrícula de los estudiantes en las materias 1, 2, 3 y 4 para un solo período
INSERT INTO matricula (materia_id, estudiante_id, nota_definitiva, periodo)
SELECT
    m.id AS materia_id,
    e.id AS estudiante_id,
    ROUND(RAND() * 5, 1) AS nota_definitiva,
    '2020B' AS periodo
FROM materia m
JOIN estudiante e
WHERE m.id IN (1, 2, 3, 4)
ORDER BY RAND()
LIMIT 25;

-- Establecer la matrícula de los estudiantes en las materias 1, 2, 3 y 4 para un solo período
INSERT INTO matricula (materia_id, estudiante_id, nota_definitiva, periodo)
SELECT
    m.id AS materia_id,
    e.id AS estudiante_id,
    ROUND(RAND() * 5, 1) AS nota_definitiva,
    '2021A' AS periodo
FROM materia m
JOIN estudiante e
WHERE m.id IN (1, 2, 3, 4)
ORDER BY RAND()
LIMIT 25;

-- Establecer la matrícula de los estudiantes en las materias 1, 2, 3 y 4 para un solo período
INSERT INTO matricula (materia_id, estudiante_id, nota_definitiva, periodo)
SELECT
    m.id AS materia_id,
    e.id AS estudiante_id,
    ROUND(RAND() * 5, 1) AS nota_definitiva,
    '2021B' AS periodo
FROM materia m
JOIN estudiante e
WHERE m.id IN (1, 2, 3, 4)
ORDER BY RAND()
LIMIT 25;

-- Establecer la matrícula de los estudiantes en las materias 1, 2, 3 y 4 para un solo período
INSERT INTO matricula (materia_id, estudiante_id, nota_definitiva, periodo)
SELECT
    m.id AS materia_id,
    e.id AS estudiante_id,
    ROUND(RAND() * 5, 1) AS nota_definitiva,
    '2022A' AS periodo
FROM materia m
JOIN estudiante e
WHERE m.id IN (1, 2, 3, 4)
ORDER BY RAND()
LIMIT 25;

-- Establecer la matrícula de los estudiantes en las materias 1, 2, 3 y 4 para un solo período
INSERT INTO matricula (materia_id, estudiante_id, nota_definitiva, periodo)
SELECT
    m.id AS materia_id,
    e.id AS estudiante_id,
    ROUND(RAND() * 5, 1) AS nota_definitiva,
    '2022B' AS periodo
FROM materia m
JOIN estudiante e
WHERE m.id IN (1, 2, 3, 4)
ORDER BY RAND()
LIMIT 25;


-- Esta consulta proporciona al usuario final un resumen de los promedios de las notas definitivas de los estudiantes en un conjunto específico de materias (identificadas por sus códigos 1, 2, 3 y 4). El reporte muestra estos promedios organizados por periodo académico, permitiendo así identificar el rendimiento promedio de los estudiantes en cada una de esas materias a lo largo del tiempo. Cada fila en el resultado representa el promedio de las notas de una materia para un periodo académico en particular, brindando una visión general del desempeño a lo largo de distintos periodos para estas asignaturas específicas.

SELECT m.periodo, ROUND(AVG(m.nota_definitiva), 2) AS promedio, mate.materia
FROM matricula m
JOIN materia mate ON m.materia_id = mate.id
WHERE m.materia_id IN (1, 2, 3, 4)
GROUP BY m.periodo, mate.materia;

-- Esta consulta presenta un resumen detallado de los promedios de las notas definitivas de los estudiantes en un conjunto específico de materias, identificadas por sus códigos 1, 2, 3 y 4. A diferencia de la consulta anterior, esta nueva consulta organiza los promedios de notas por materia, mostrando el rendimiento promedio a lo largo de varios periodos académicos ('2020A', '2020B', '2021A', '2021B', '2022A' y '2022B'). Cada fila de los resultados representa una materia específica, con columnas correspondientes a los promedios de notas de los estudiantes en cada periodo académico. Este enfoque proporciona una visión general del rendimiento promedio de los estudiantes para cada materia a lo largo de múltiples periodos, permitiendo identificar tendencias y comparar el desempeño a lo largo del tiempo para las asignaturas seleccionadas.

-- Muestra datos null
SELECT
    m.materia AS Materia,
    ROUND(AVG(CASE WHEN ma.periodo = '2020A' THEN ma.nota_definitiva ELSE NULL END), 2) AS '2020A',
    ROUND(AVG(CASE WHEN ma.periodo = '2020B' THEN ma.nota_definitiva ELSE NULL END), 2) AS '2020B',
    ROUND(AVG(CASE WHEN ma.periodo = '2021A' THEN ma.nota_definitiva ELSE NULL END), 2) AS '2021A',
    ROUND(AVG(CASE WHEN ma.periodo = '2021B' THEN ma.nota_definitiva ELSE NULL END), 2) AS '2021B',
    ROUND(AVG(CASE WHEN ma.periodo = '2022A' THEN ma.nota_definitiva ELSE NULL END), 2) AS '2022A',
    ROUND(AVG(CASE WHEN ma.periodo = '2022B' THEN ma.nota_definitiva ELSE NULL END), 2) AS '2022B'
FROM materia m
LEFT JOIN matricula ma ON m.id = ma.materia_id
GROUP BY m.materia;

-- Datos null se convierte a cero(0)
SELECT
    m.materia AS Materia,
    ROUND(COALESCE(AVG(nota_2020A), 0), 2) AS '2020A',
    ROUND(COALESCE(AVG(nota_2020B), 0), 2) AS '2020B',
    ROUND(COALESCE(AVG(nota_2021A), 0), 2) AS '2021A',
    ROUND(COALESCE(AVG(nota_2021B), 0), 2) AS '2021B',
    ROUND(COALESCE(AVG(nota_2022A), 0), 2) AS '2022A',
    ROUND(COALESCE(AVG(nota_2022B), 0), 2) AS '2022B'
FROM materia m
LEFT JOIN (
    SELECT
        materia_id,
        AVG(CASE WHEN periodo = '2020A' THEN nota_definitiva ELSE NULL END) AS nota_2020A,
        AVG(CASE WHEN periodo = '2020B' THEN nota_definitiva ELSE NULL END) AS nota_2020B,
        AVG(CASE WHEN periodo = '2021A' THEN nota_definitiva ELSE NULL END) AS nota_2021A,
        AVG(CASE WHEN periodo = '2021B' THEN nota_definitiva ELSE NULL END) AS nota_2021B,
        AVG(CASE WHEN periodo = '2022A' THEN nota_definitiva ELSE NULL END) AS nota_2022A,
        AVG(CASE WHEN periodo = '2022B' THEN nota_definitiva ELSE NULL END) AS nota_2022B
    FROM matricula
    GROUP BY materia_id
) ma ON m.id = ma.materia_id
GROUP BY m.materia;


-- Muestra solo un grupo de clases especificas
SELECT
    m.materia AS Materia,
    ROUND(COALESCE(AVG(CASE WHEN ma.periodo = '2020A' THEN ma.nota_definitiva END), 0), 2) AS '2020A',
    ROUND(COALESCE(AVG(CASE WHEN ma.periodo = '2020B' THEN ma.nota_definitiva END), 0), 2) AS '2020B',
    ROUND(COALESCE(AVG(CASE WHEN ma.periodo = '2021A' THEN ma.nota_definitiva END), 0), 2) AS '2021A',
    ROUND(COALESCE(AVG(CASE WHEN ma.periodo = '2021B' THEN ma.nota_definitiva END), 0), 2) AS '2021B',
    ROUND(COALESCE(AVG(CASE WHEN ma.periodo = '2022A' THEN ma.nota_definitiva END), 0), 2) AS '2022A',
    ROUND(COALESCE(AVG(CASE WHEN ma.periodo = '2022B' THEN ma.nota_definitiva END), 0), 2) AS '2022B'
FROM materia m
LEFT JOIN matricula ma ON m.id = ma.materia_id
WHERE m.id IN (1, 2, 3, 4)
GROUP BY m.materia;



-- proporciona un listado de estudiantes con el promedio de notas más alto por período académico. Con la función ROW_NUMBER(), se asigna un número secuencial basado en el promedio de notas, organizado por período académico. El resultado muestra el nombre completo del estudiante, su calificación y el período académico en el que se ubica, todo ordenado por período y calificación descendente. Esto permite identificar a los diez mejores estudiantes por período según su rendimiento académico.

SELECT CONCAT(est.nombres, ' ', est.apellidos) AS nombre_estudiante, mat.nota_definitiva AS Nota, mat.periodo
FROM (
    SELECT 
        e.id AS estudiante_id, 
        e.nombres, 
        e.apellidos,
        ma.nota_definitiva, 
        ma.periodo, 
        ROW_NUMBER() OVER(PARTITION BY ma.periodo ORDER BY ma.nota_definitiva DESC) AS Posicion
    FROM estudiante e
    JOIN matricula ma ON e.id = ma.estudiante_id
) AS mat
JOIN estudiante est ON est.id = mat.estudiante_id
WHERE mat.Posicion <= 10
ORDER BY mat.periodo, mat.nota_definitiva DESC;



-- La consulta te ayuda a calcular el promedio de las notas de los estudiantes en cuatro materias diferentes a lo largo de su tiempo en la universidad. Muestra qué estudiantes tienen los promedios más altos, indicando quiénes se están desempeñando mejor en esas materias en general. Es una buena manera de ver quiénes tienen un buen rendimiento en esas asignaturas en comparación con otros estudiantes.

SELECT CONCAT(est.nombres, ' ', est.apellidos) AS nombre_estudiante, ROUND(AVG(mat.nota_definitiva), 2) AS Promedio_Estudiante
FROM estudiante est
JOIN matricula mat ON est.id = mat.estudiante_id
WHERE mat.materia_id IN (1, 2, 3, 4)
GROUP BY est.id
ORDER BY Promedio_Estudiante DESC;
