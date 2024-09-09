use nba;
select * from jugadores;
select * from equipos;
select * from partidos;
select * from estadisticas;
-- 1)
select count(*) as num_jugadores from jugadores;

-- 2)
select Nombre from equipos
where conferencia like "East";

-- 3)
select count(codigo) as num_total 
from partidos
where equipo_local ="Raptors" and temporada like "00/01";

-- 4)
select * 
from jugadores
where nombre like "%smi%";

-- 5)
select count(*) as num_total 
from partidos join equipos
on nombre= equipo_local or nombre=equipo_visitante
where ciudad like "Los Angeles" and temporada like "03/04";

-- 6)
select (sum(Peso)/COUNT(*)) as peso_medio 
from jugadores;

-- 7)
select DISTINCT Posicion 
from jugadores; 

-- 8) 
SELECT
    Posicion,
    (SELECT (SUM(Peso) / COUNT(*)) FROM jugadores WHERE Posicion=posiciones.Posicion) AS peso_medio_por_posicion
FROM
    (SELECT DISTINCT Posicion FROM jugadores) AS posiciones;
    
-- 9)
SELECT
    Posicion,
    (SELECT COUNT(*) FROM jugadores WHERE Posicion = posiciones.Posicion) AS numero_jugadores
FROM
    (SELECT DISTINCT Posicion FROM jugadores) AS posiciones;
    
-- 10)
SELECT
	Nombre,
    (SELECT count(*) from jugadores where Nombre=nombres.Nombre) as numero_veces
from
	(SELECT DISTINCT Nombre from jugadores) as nombres
order by numero_veces desc
limit 2;

-- 11)
SELECT count(*) as total_partidos 
from partidos 
where temporada like "01/02";

-- 12)
SELECT count(*) as victorias_local 
from partidos 
where puntos_local>puntos_visitante and temporada like "01/02";

-- 13)
SELECT * from partidos
where equipo_local=(select distinct Nombre_equipo from jugadores where Nombre="Pau Gasol")
OR equipo_visitante=(select distinct Nombre_equipo from jugadores where Nombre="Pau Gasol");

-- 14)

-- 15)

-- 16)


