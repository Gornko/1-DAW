CREATE DATABASE CICLISTA
CHARACTER SET latin1
COLLATE latin1_spanish_ci;

USE CICLISTA;

CREATE TABLE lleva_maillot_etapa (
codigo_maillot int,
num_etapa int,
dorsal int
);

CREATE TABLE maillot (
codigo int,
tipo varchar(30),
premio int,
color varchar(30)
);

CREATE TABLE puerto (
num_puerto varchar(45),
num_etapa varchar(45),
altura int,
categoria varchar(1),
pendiente decimal(3,1)
);

CREATE TABLE etapa (
num_etapa int,
kilometros int,
salida varchar(45),
llegada varchar(45)
);

CREATE TABLE ciclista (
dorsal int,
nombre varchar(60),
edad int
);

CREATE TABLE equipo (
nom_equipo varchar(45) NOT NULL,
director varchar(60) NOT NULL
);

ALTER TABLE ciclista
MODIFY COLUMN dorsal int PRIMARY KEY;

ALTER TABLE equipo
ADD COLUMN codigo int PRIMARY KEY FIRST;

ALTER TABLE etapa
MODIFY COLUMN num_etapa int PRIMARY KEY;

ALTER TABLE puerto
ADD COLUMN cod_puerto int PRIMARY KEY FIRST;

ALTER TABLE puerto
ADD COLUMN etapa int,
ADD FOREIGN KEY (etapa) REFERENCES etapa (num_etapa);

ALTER TABLE maillot
MODIFY COLUMN codigo int PRIMARY KEY;

ALTER TABLE lleva_maillot_etapa
ADD FOREIGN KEY (codigo_maillot) REFERENCES maillot (codigo),
ADD FOREIGN KEY (num_etapa) REFERENCES etapa (num_etapa),
ADD FOREIGN KEY (dorsal) REFERENCES ciclista (dorsal);

ALTER TABLE ciclista
ADD COLUMN equipo int,
ADD FOREIGN KEY (equipo) REFERENCES equipo (codigo);

ALTER TABLE lleva_maillot_etapa
ADD PRIMARY KEY (codigo_maillot, num_etapa, dorsal);

CREATE TABLE categoria (
codigo varchar(1) PRIMARY KEY,
descripcion varchar(100)
);

ALTER TABLE puerto
ADD FOREIGN KEY (categoria) REFERENCES categoria (codigo);






-- DROP DATABASE CICLISTA;

