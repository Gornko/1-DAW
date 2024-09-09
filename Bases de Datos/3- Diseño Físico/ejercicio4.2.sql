CREATE DATABASE CAMPEONATO_DE_AJEDREZ
CHARACTER SET Latin1
COLLATE latin1_spanish_ci;

USE CAMPEONATO_DE_AJEDREZ;

CREATE TABLE tipo (
codigo int PRIMARY KEY,
descripcion varchar(30)
);

CREATE TABLE pais (
nombre varchar(30) PRIMARY KEY,
numero_clubs int
);

CREATE TABLE hotel (
nombre varchar(30) PRIMARY KEY,
direccion varchar(45) NOT NULL,
telefono varchar(12) NOT NULL
);

CREATE TABLE participante (
numero_socio int PRIMARY KEY,
nombre varchar(30),
direccion varchar(45),
telefono varchar(12),
tipo int NOT NULL,
nivel varchar(10),
pais varchar(30),
FOREIGN KEY (tipo) REFERENCES tipo (codigo),
FOREIGN KEY (pais) REFERENCES pais (nombre)
);

CREATE TABLE sala (
codigo int PRIMARY KEY,
capacidad int,
nombre_hotel varchar(30) NOT NULL,
FOREIGN KEY (nombre_hotel) REFERENCES hotel (nombre)
);

CREATE TABLE partida (
codigo int PRIMARY KEY,
dia date NOT NULL,
jugador_blanca int NOT NULL,
jugador_negra int NOT NULL,
arbitro int NOT NULL,
numero_sala int NOT NULL,
FOREIGN KEY (jugador_blanca) REFERENCES participante (numero_socio),
FOREIGN KEY (jugador_negra) REFERENCES participante (numero_socio),
FOREIGN KEY (arbitro) REFERENCES participante (numero_socio),
FOREIGN KEY (numero_sala) REFERENCES sala (codigo)
);
CREATE TABLE movimiento (
partida int,
jugada varchar(30),
movimiento varchar(15),
comentarios varchar(140),
PRIMARY KEY (partida, jugada),
FOREIGN KEY (partida) REFERENCES partida (codigo)
);

CREATE TABLE aloja (
numero_participante int,
fecha_entrada date,
fecha_salida date,
nombre_hotel varchar(30),
PRIMARY KEY (numero_participante, fecha_entrada),
FOREIGN KEY (numero_participante) REFERENCES participante (numero_socio),
FOREIGN KEY (nombre_hotel) REFERENCES hotel (nombre)
);

CREATE TABLE medio (
sala int,
medio varchar(30),
PRIMARY KEY (sala, medio),
FOREIGN KEY (sala) REFERENCES sala (codigo)
);

-- DROP DATABASE CAMPEONATO_DE_AJEDREZ;

