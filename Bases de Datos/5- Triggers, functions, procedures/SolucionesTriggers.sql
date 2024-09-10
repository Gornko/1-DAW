use dentista;
select * from contador_visitas;
select * from visitas;

delimiter //

-- 1.1)
CREATE TRIGGER actualizar_edad_paciente
BEFORE INSERT ON paciente
FOR EACH ROW
BEGIN
    DECLARE edad SMALLINT;
    SET edad = TIMESTAMPDIFF(YEAR, new.fecha_nacimiento, CURDATE());
    SET NEW.edad = edad;
END//

-- 1.2)
CREATE TRIGGER hombre_o_mujer
after insert on paciente
FOR EACH ROW
BEGIN
	IF new.sexo='V' then
    insert into hombres (codpac, nom, ape1, ape2, edad, tel)
    values (new.codpac, new.nom, new.ape1, new.ape2, new.edad, new.tel);
    ELSE
    insert into mujeres (codpac, nom, ape1, ape2, edad, tel)
    values (new.codpac, new.nom, new.ape1, new.ape2, new.edad, new.tel);
    end if;
end//

-- 1.3)
CREATE TRIGGER terf
after update on paciente
for each row
begin
	if old.sexo='V' and new.sexo='M' then
    delete from hombres 
    where hombres.codpac=old.codpac;
    insert into mujeres (codpac, nom, ape1, ape2, edad, tel)
    values (new.codpac, new.nom, new.ape1, new.ape2, new.edad, new.tel);
    
    elseif old.sexo='M' and new.sexo='V' then
    delete from mujeres 
    where mujeres.codpac=old.codpac;
    insert into hombres (codpac, nom, ape1, ape2, edad, tel)
    values (new.codpac, new.nom, new.ape1, new.ape2, new.edad, new.tel);
    end if;
end//
    
-- 1.4)
create trigger add_visita 
after insert on visitas
for each row
	update contador_visitas
	set contvisitas=contvisitas+1
    where contador_visitas.paciente=new.paciente
//
    
-- 1.5)
create trigger del_visita 
before delete on visitas
for each row
	update contador_visitas
	set contvisitas=contvisitas-1
    where contador_visitas.paciente=old.paciente
//
delimiter ;












