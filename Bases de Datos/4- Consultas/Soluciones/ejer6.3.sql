use ventas;
select * from cliente;
select * from pedido order by fecha;
select * from comercial;


-- 1. Consultas sobre una tabla:
-- 1)
select * from pedido order by fecha desc;

-- 2)
select * from pedido order by total desc limit 2;

-- 3)
select DISTINCT id from pedido;

-- 4)
select * from pedido where fecha like "2017%" and total > 500;

-- 5)
select nombre, apellido1, apellido2 from comercial where comisión BETWEEN 0.05 and 0.11;

-- 6)
select max(comisión) from comercial;

-- 7)
select id, nombre, apellido1 from cliente where apellido2 is not null;

-- 8)
select * from cliente where nombre like "A%n" or nombre like "P%" order by nombre asc;

-- 9)
select * from cliente where nombre not like "A%" order by nombre asc;

-- 10)
select DISTINCT * from comercial where nombre like "%o";


-- 2. Consultas multitabla:
-- 11)
select distinct cliente.id, nombre, apellido1, apellido2 from cliente, pedido where cliente.id=pedido.id_cliente;

-- 12)
select * from cliente inner join pedido on pedido.id_cliente = cliente.id order by cliente.nombre;

-- 13)
select * from comercial inner join pedido on comercial.id = pedido.id_comercial order by comercial.nombre;

-- 14)
select * from cliente 
inner join pedido on pedido.id_cliente = cliente.id
inner join comercial  on comercial.id = pedido.id_comercial;

-- 15)
select * from cliente
where id in (select id_cliente from pedido where fecha like "2017%" and total between 300 and 1000);
-- o
select * from cliente c inner join pedido p on c.id=p.id_cliente where fecha like "2017%" and total between 300 and 1000;

-- 16)
select nombre from comercial
where id in (select id_comercial from pedido where id_cliente in (select id from cliente where nombre ="María" and apellido1="Santana" and apellido2="Moreno"));
--
select distinct c.nombre, c.apellido1, c.apellido2 from comercial c
inner join pedido on c.id=pedido.id_comercial
inner join cliente on cliente.id=pedido.id_cliente
where cliente.nombre ="María" and cliente.apellido1="Santana" and cliente.apellido2="Moreno";

-- 17)
select nombre from cliente
where id in (select id_cliente from pedido where id_comercial in (select id from comercial where nombre="Daniel" and apellido1="Sáez" and apellido2="Vega"));
--
select distinct c.nombre, c.apellido1, c.apellido2 from cliente c
inner join pedido on c.id=pedido.id_cliente
inner join comercial on comercial.id=pedido.id_comercial
where comercial.nombre ="Daniel" and comercial.apellido1="Sáez" and comercial.apellido2="Vega";

-- 18)
-- NO?

-- 19)
select c.*, p.*, p.id as id_pedido  from comercial c left join pedido p on c.id=p.id_comercial order by apellido1 asc, apellido2 asc, nombre asc;

-- 20)
select * from cliente where id not in( select id_cliente from pedido);
-- o
select * from cliente left join pedido on pedido.id_cliente=cliente.id where pedido.id is null;

-- 21)
select * from comercial where id not in( select id_comercial from pedido);
-- o
select * from comercial 
left join pedido on comercial.id=pedido.id_comercial 
where pedido.id is null ;

-- 22)
select id, nombre, apellido1, apellido2, 'Cliente' as tipo from cliente where id not in (select id_cliente from pedido)
union all 
select id, nombre, apellido1, apellido2, 'Comercial' as tipo from comercial where id not in (select id_comercial from pedido);

-- 23)
select nombre from cliente where id in(select id_cliente from pedido where fecha like "2016-08-17");
-- o
select nombre from cliente 
inner join pedido on cliente.id=pedido.id_cliente 
where pedido.fecha like "2016-08-17";


-- 3. Consultas resumen
-- 24)
select sum(total) as total from pedido;

-- 25)
select sum(total)/count(id) as media_pedido from pedido;
select avg(total) as media_pedido from pedido;

-- 26)
select COUNT(distinct id_comercial) from pedido;

-- 27)
select count(id) from cliente;

-- 28)
select max(total) from pedido;

-- 29)
select min(total) from pedido;

-- 30)
select ciudad, max(categoría) from cliente GROUP BY ciudad;

-- 31)
select max(total), fecha, id_cliente, cliente.* from pedido 
inner join cliente on id_cliente=cliente.id
group by fecha, id_cliente;

-- 32)
select max(total) as total, fecha, id_cliente, cliente.* from pedido 
inner join cliente on id_cliente=cliente.id
group by fecha, id_cliente
having total>2000;

-- 33)
select id_comercial, nombre, apellido1, apellido2, max(total) as pedidoMaximo from pedido, comercial 
where id_comercial=comercial.id and fecha like "2016-08-17"
GROUP BY id_comercial;

-- 34)NO

-- 35)
select id_cliente, nombre, apellido1, apellido2, count(pedido.id) as totalPedidos from pedido, cliente
where id_cliente=cliente.id and fecha like "2017%"
GROUP BY id_cliente;

-- 36)NO

-- 37)
select year(fecha) as year, max(total) from pedido group by year;

-- 38)
select year(fecha) as year, count(id) from pedido group by year;


-- 4. Subconsultas
-- 4.1 Con operadores de comparación

-- 39)
select * from pedido where id_cliente=(select id from cliente where nombre like "Adela" and apellido1 like "Salas" and apellido2 like "Díaz");

-- 40)
select count(id) from pedido where id_comercial=(select id from comercial where nombre like "Daniel" and apellido1 like "Sáez" and apellido2 like "Vega");

-- 41)
select * from cliente where id=(select id_cliente from pedido where fecha like "2019%" order by total asc limit 1);

-- 42)
select fecha, min(total) from pedido where  id_cliente=(select id from cliente where nombre like "Pepe" and apellido1 like "Ruiz" and apellido2 like "Santana");

-- 43)
select * from cliente inner join pedido on cliente.id=pedido.id_cliente where fecha like "2017%" and total>=(select avg(total) from pedido where fecha like "2017%");

-- 4.3 Subconsultas con IN y NOT IN

-- 44)
select * from cliente where id not in (select id_cliente from pedido);

-- 45)
select * from comercial where id not in (select id_comercial from pedido);

-- 46) NO, REPE
-- 47) NO, REPE

-- 48)
select * from cliente where id=any (select id_cliente from pedido where id_comercial in (1,2,4,5));

-- 49)
select * from pedido where id_comercial not in (2,4,6);

-- 50)
select pedido.*, comercial.nombre from pedido, comercial where pedido.id_comercial=comercial.id and fecha in ("2016-09-10", "2017-10-05", "2016-08-17");




 