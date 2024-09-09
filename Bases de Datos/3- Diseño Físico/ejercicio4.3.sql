CREATE DATABASE JARDINERIA
CHARACTER SET latin1
COLLATE latin1_spanish_ci;

USE JARDINERIA;

CREATE TABLE oficinas (
CodigoOficina varchar(10) PRIMARY KEY,
Ciudad varchar(30) NOT NULL,
Pais varchar(50) NOT NULL,
Region varchar(50),
CodigoPostal varchar(10) NOT NULL,
Telefono varchar(20) NOT NULL,
LineaDireccion1 varchar(50) NOT NULL,
LineaDireccion2 varchar(50)
);

CREATE TABLE empleados (
CodigoEmpleado int PRIMARY KEY,
Nombre varchar(50) NOT NULL,
Apellido1 varchar(50) NOT NULL,
Apellido2 varchar (50),
Extension varchar(10) NOT NULL,
Email varchar(100) NOT NULL,
CodigoOficina varchar(10) NOT NULL,
CodigoJefe int,
Puesto varchar(50),
FOREIGN KEY (CodigoOficina) REFERENCES oficinas (CodigoOficina),
FOREIGN KEY (CodigoJefe) REFERENCES empleados (CodigoEmpleado)
);

CREATE TABLE clientes (
CodigoCliente int PRIMARY KEY,
NombreCliente varchar(50) NOT NULL,
NombreContacto varchar(30),
ApellidoContacto varchar(30),
Telefono varchar(15) NOT NULL,
Fax varchar(15) NOT NULL,
LineaDireccion1 varchar(50) NOT NULL,
LineaDireccion2 VARCHAR(50),
Ciudad varchar(50) NOT NULL,
Region varchar(50),
Pais varchar(50),
CodigoPostal varchar(10),
CodigoEmpleadoRepVentas int,
LimiteCredito decimal(15,2),
FOREIGN KEY (CodigoEmpleadoRepVentas) REFERENCES empleados (CodigoEmpleado)
);

CREATE TABLE gamasproductos (
Gama varchar(50) PRIMARY KEY,
DescripcionTexto text,
DescripcionHTML text,
Imagen blob
);

CREATE TABLE pagos (
CodigoCliente int,
FormaPago varchar(40) NOT NULL,
IDTransaccion varchar(50),
FechaPago date NOT NULL,
Cantidad decimal(15,2) NOT NULL,
PRIMARY KEY (CodigoCliente, IDTransaccion),
FOREIGN KEY (CodigoCliente) REFERENCES clientes (CodigoCliente)
);

CREATE TABLE pedidos (
CodigoPedido int PRIMARY KEY,
FechaPedido date NOT NULL,
FechaEsperada date NOT NULL,
FechaEntrega date,
Estado varchar(15) NOT NULL,
Comentarios text,
CodigoCliente int NOT NULL,
FOREIGN KEY (CodigoCliente) REFERENCES clientes (CodigoCliente)
);

CREATE TABLE productos (
CodigoProducto varchar(15) PRIMARY KEY,
Nombre varchar(70) NOT NULL,
Gama varchar(50) NOT NULL,
Dimensiones varchar(25),
Proveedor varchar(50),
Descripcion text,
CantidadEnStock smallint NOT NULL,
PrecioVenta decimal(15,2) NOT NULL,
PrecioProveedor decimal(15,2),
FOREIGN KEY (Gama) REFERENCES gamasproductos (Gama)
);

CREATE TABLE detallepedidos (
CodigoPedido int NOT NULL,
CodigoProducto varchar(15),
Cantidad int NOT NULL,
PrecioUnidad decimal(15,2) NOT NULL,
NumeroLinea smallint NOT NULL,
PRIMARY KEY (CodigoPedido, CodigoProducto),
FOREIGN KEY (CodigoPedido) REFERENCES pedidos (CodigoPedido),
FOREIGN KEY (CodigoProducto) REFERENCES productos (CodigoProducto)
);



