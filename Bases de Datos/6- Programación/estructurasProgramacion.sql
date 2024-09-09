-- 1) Declaración de Variables y Asignación
-- Ejercicio: Escribir un procedimiento almacenado que calcule el total de ventas de un cliente basado en sus compras registradas en una tabla.

DELIMITER //

CREATE PROCEDURE calcular_total_compras(IN p_cliente_id INT)
BEGIN
    DECLARE total_compras DECIMAL(10,2);  -- Declarar la variable

    -- Asignar el total de compras del cliente a la variable
    SELECT SUM(monto) INTO total_compras
    FROM purchases
    WHERE cliente_id = p_cliente_id;

    -- Mostrar el total de compras
    SELECT total_compras AS 'Total Compras del Cliente';
END //

DELIMITER ;


-- 2 E)structuras de Control: IF y CASE
-- Ejercicio: Crear un procedimiento almacenado que asigne un descuento a un cliente dependiendo de la cantidad total de sus compras.

DELIMITER //

CREATE PROCEDURE asignar_descuento(IN p_cliente_id INT)
BEGIN
    DECLARE total_compras DECIMAL(10,2);
    DECLARE descuento DECIMAL(5,2);

    -- Obtener el total de compras del cliente
    SELECT SUM(monto) INTO total_compras
    FROM purchases
    WHERE cliente_id = p_cliente_id;

    -- Asignar descuento según el total de compras usando IF
    IF total_compras > 1000 THEN
        SET descuento = 0.15;  -- 15% de descuento si compró más de 1000
    ELSEIF total_compras BETWEEN 500 AND 1000 THEN
        SET descuento = 0.10;  -- 10% de descuento si compró entre 500 y 1000
    ELSE
        SET descuento = 0.05;  -- 5% de descuento si compró menos de 500
    END IF;

    -- Mostrar el descuento asignado
    SELECT CONCAT('El descuento asignado es: ', descuento * 100, '%');
END //

DELIMITER ;


-- 3) Estructura de Control: WHILE Loop
-- Ejercicio: Crear un procedimiento almacenado que calcule la suma de los primeros N números naturales utilizando un bucle WHILE.

DELIMITER //

CREATE PROCEDURE calcular_suma_numeros(IN p_n INT)
BEGIN
    DECLARE contador INT DEFAULT 1;
    DECLARE suma INT DEFAULT 0;

    -- Bucle WHILE para sumar los números
    WHILE contador <= p_n DO
        SET suma = suma + contador;  -- Sumar el contador a la suma
        SET contador = contador + 1;  -- Incrementar el contador
    END WHILE;

    -- Mostrar el resultado de la suma
    SELECT suma AS 'Suma de N números';
END //

DELIMITER ;


-- 4) Estructura de Control: CASE dentro de una consulta
-- Ejercicio: Crear una consulta que clasifique los productos según su precio en categorías de "Barato", "Moderado" y "Caro" utilizando la estructura CASE.

SELECT nombre_producto, precio,
    CASE
        WHEN precio < 50 THEN 'Barato'
        WHEN precio BETWEEN 50 AND 200 THEN 'Moderado'
        ELSE 'Caro'
    END AS categoria_precio
FROM products;


-- 5) Procedimiento con Bucles y Condiciones
-- Ejercicio: Crear un procedimiento almacenado que devuelva los primeros N números de la secuencia de Fibonacci.

DELIMITER //

CREATE PROCEDURE generar_fibonacci(IN p_n INT)
BEGIN
    DECLARE a INT DEFAULT 0;
    DECLARE b INT DEFAULT 1;
    DECLARE contador INT DEFAULT 1;
    DECLARE temp INT;

    -- Bucle WHILE para generar la secuencia de Fibonacci
    WHILE contador <= p_n DO
        SELECT a AS 'Número Fibonacci';
        SET temp = a + b;  -- Actualizar la secuencia
        SET a = b;
        SET b = temp;
        SET contador = contador + 1;
    END WHILE;
END //

DELIMITER ;


-- 6) Iterate
-- Ejercicio: Imprimir todos los números del 1 al 10, pero saltando los números pares.

DELIMITER //

CREATE PROCEDURE imprimir_numeros()
BEGIN
    DECLARE contador INT DEFAULT 1;

    mi_bucle: WHILE contador <= 10 DO
        -- Si el número es par, saltar a la siguiente iteración
        IF contador % 2 = 0 THEN
            SET contador = contador + 1;
            ITERATE mi_bucle;  -- Saltar al siguiente ciclo del bucle
        END IF;

        -- Mostrar el número impar
        SELECT contador;

        -- Incrementar el contador
        SET contador = contador + 1;
    END WHILE;
END //

DELIMITER ;
