CREATE DATABASE MODELOS
CHARACTER SET Latin1
COLLATE Latin1_spanish_ci;
USE MODELOS;
CREATE TABLE agencia (
cif_ag varchar(9) PRIMARY KEY,
nom_ag varchar(100) NOT NULL,
pais_ag varchar(50),
tel_ag varchar (9)
);
CREATE TABLE modelo (
dni varchar(9) PRIMARY KEY,
nom varchar(60) NOT NULL,
edad tinyint NOT NULL,
direccion varchar(100),
tel varchar(9),
email varchar(100),
cif_ag varchar(9),
FOREIGN KEY (cif_ag) REFERENCES agencia (cif_ag) ON DELETE SET NULL ON UPDATE CASCADE
);
CREATE TABLE compania (
cif_co varchar(9) PRIMARY KEY,
nom_co varchar(60) NOT NULL,
director varchar(60),
tel_co varchar(9)
);
CREATE TABLE anunciar (
dni_modelo varchar(9),
cif_compania varchar(9),
campanya varchar(50),
PRIMARY KEY (dni_modelo, cif_compania),
FOREIGN KEY (dni_modelo) REFERENCES modelo (dni),
FOREIGN KEY (cif_compania) REFERENCES compania (cif_co) 
);


CREATE TABLE fotografo (
dni varchar(9) PRIMARY KEY,
nom varchar(60) NOT NULL,
direcc varchar (100),
tel varchar(9),
mail varchar(100)
);
CREATE TABLE trabaja (
dni_foto varchar(9),
cif_agencia varchar(9),
desde date NOT NULL,
hasta date,
PRIMARY KEY (dni_foto, cif_agencia),
FOREIGN KEY (dni_foto) REFERENCES fotografo (dni) ,
FOREIGN KEY (cif_agencia) REFERENCES agencia (cif_ag) 
);

-- DROP DATABASE MODELOS;


