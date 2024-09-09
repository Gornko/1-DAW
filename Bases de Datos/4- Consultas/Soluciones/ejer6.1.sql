use dentista;
-- 1)
select * from paciente;
-- 2)
select * from tratamiento;
-- 3)
select nom, ape_1, ape_2, edad from paciente;
-- 4)
select coment, precio from tratamiento;
-- 5)
select nvisita, ntratamiento from visitas;
-- 6)
select nom, ape_1, ape_2, edad from paciente where edad<60;
-- 7)
select coment, precio from tratamiento where precio>5000;
-- 8)
select nvisita, ntratamiento from visitas where ntratamiento=3;
