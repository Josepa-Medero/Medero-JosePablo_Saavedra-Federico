DROP TABLE IF EXISTS ODONTOLOGO;
CREATE TABLE ODONTOLOGOS (MATRICULA INT NOT NULL, NOMBRE VARCHAR(100) NOT NULL, APELLIDO VARCHAR(100) NOT NULL);

-- para test --

INSERT INTO ODONTOLOGO(MATRICULA, NOMBRE, APELLIDO) VALUES (1234, 'Jose', 'Perez'), (5678, 'Juana', 'Lopez');
