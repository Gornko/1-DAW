use nba;
select * from equipos;
select * from est_equipos;
select * from estadisticas;
select * from jugadores;
select * from partidos;



-- 1)
select avg(puntos_visitante) as media_puntos from partidos where equipo_local like "Celtics" and temporada in('98/99','99/00','00/01','01/02','02/03','03/04');

-- 2)
with media_puntos as
(select puntos_local as puntos from partidos where equipo_local like "Pistons" and temporada in('98/99','99/00','00/01','01/02','02/03','03/04')
union
select puntos_visitante as puntos from partidos where equipo_visitante like "Pistons" and temporada in('98/99','99/00','00/01','01/02','02/03','03/04'))
select avg(puntos) as mediaTotal from media_puntos;

-- 3)
select temporada, count(*) as NumPartidos from partidos group by temporada;

-- 4)
with tabla_v as 
(select codigo as victorias from partidos where equipo_local like "Lakers"and puntos_local>puntos_visitante and temporada like "00/01"
union
select codigo as victorias from partidos where equipo_visitante like "Lakers"and puntos_visitante>puntos_local and temporada like "00/01"),
tabla_d as (select codigo as derrotas from partidos where equipo_local like "Lakers"and puntos_local<puntos_visitante and temporada like "00/01"
union
select codigo as derrotas from partidos where equipo_visitante like "Lakers"and puntos_visitante<puntos_local and temporada like "00/01")
select 
(select COUNT(*) FROM tabla_v) AS Victorias,
(select COUNT(*) FROM tabla_d) AS Derrotas,
CONCAT(CAST((SELECT COUNT(*) FROM tabla_v) AS CHAR), '/', CAST((SELECT COUNT(*) FROM tabla_d) AS CHAR)) AS Ratio;

-- 5)??

-- 6)
select * , SUBSTRING_INDEX(Altura, '-', 1) * 30.48 + SUBSTRING_INDEX(Altura, '-', -1) * 2.54 AS altura_cm from jugadores;

-- 7)
select Nombre, SUBSTRING_INDEX(Altura, '-', 1) * 30.48 + SUBSTRING_INDEX(Altura, '-', -1) * 2.54 AS altura_cm, Rebotes_por_partido as nºDeRebotes from jugadores
inner join estadisticas on jugadores.codigo=estadisticas.jugador
order by Rebotes_por_partido desc limit 10;

-- 8)
select * from jugadores where Altura in((select max(Altura) from jugadores), (select min(Altura) from jugadores));

-- 9)
select (sum(puntos_local)+sum(puntos_visitante))/count(*) as MediaAnotacionesPorPartido  from partidos where equipo_local like "Lakers" and equipo_visitante like "Celtics";

-- 10)
-- en pies y pulgadas
select round(avg(Altura),1), Posicion from jugadores group by Posicion;
-- en cm
select round(avg(SUBSTRING_INDEX(Altura, '-', 1) * 30.48 + SUBSTRING_INDEX(Altura, '-', -1) * 2.54),0) as AlturaMedia, Posicion from jugadores group by Posicion;




