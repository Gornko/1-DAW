CREATE DATABASE DENTISTA
CHARACTER SET latin1
COLLATE latin1_spanish_ci;

USE DENTISTA;

CREATE TABLE Paciente (
nif varchar(9),
nom varchar(20),
ape1 varchar(20),
ape2 varchar(20)
);

CREATE TABLE Tratamiento (
siglas varchar(4),
coment varchar(256)
);

CREATE TABLE Visitas (
nvisitas int,
paciente varchar(9),
fecha date
);

ALTER TABLE Paciente
ADD COLUMN Fecha_de_nacimiento date,
ADD COLUMN Telefono_de_contacto varchar(15);

ALTER TABLE Tratamiento
ADD COLUMN Nombre_del_tratamiento varchar(60),
ADD COLUMN Precio decimal(9,2) CHECK (precio <=200000.999),
ADD COLUMN etapas int;

ALTER TABLE Visitas
ADD COLUMN Observaciones varchar(512);

ALTER TABLE Paciente
MODIFY COLUMN nif varchar(9) PRIMARY KEY;

ALTER TABLE Visitas
ADD FOREIGN KEY (paciente) REFERENCES paciente (nif);

ALTER TABLE Tratamiento
ADD COLUMN num int auto_increment PRIMARY KEY FIRST;

ALTER TABLE Visitas
ADD COLUMN tratamiento int,
ADD FOREIGN KEY (tratamiento) REFERENCES Tratamiento (num);




-- DROP DATABASE DENTISTA;

