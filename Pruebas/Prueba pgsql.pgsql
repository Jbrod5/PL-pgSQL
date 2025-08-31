-- Bloque con declare - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - 
DECLARE
    x INTEGER;
    y DECIMAL := 10.5;
    flag BOOLEAN := TRUE;
    letra CHAR := 'A';
    fecha DATE := 2025-08-31;
    texto VARCHAR(50) := "hola mundo";
    arr_int INTEGER[];
    arr_varchar VARCHAR(20)[] := ARRAY["uno", "dos", "tres"];
BEGIN

    -- if simple
    IF x > 3 THEN 
        RAISE NOTICE "Proceso iniciado a las %", NOW();
    END IF; 



    -- if else
    IF x = "algo" THEN 
        RAISE NOTICE "Proceso iniciado a las %", NOW();
    ELSE
        RAISE NOTICE "Proceso finalizado correctamente";
    END IF; 

    -- Case when
    CASE
        WHEN x > 10 THEN
            RAISE NOTICE "x es mayor a 10";
            x := x - 1;
        WHEN x = 10 THEN
            RAISE NOTICE "x es exactamente 10";
        WHEN x < 5 THEN
            RAISE NOTICE "x es menor a 5";
            x := x + 2;
        ELSE
            RAISE NOTICE "x está entre 5 y 9";
            x := 0;
    END CASE;
    


END; 









-- Bloque sin declare - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
BEGIN

    DECLARE
        x INTEGER;

    -- for
    FOR i IN 1..5 LOOP
        RAISE NOTICE "Iteración en FOR con i=%", i;
        x := x + i;
        CONTINUE;
    END LOOP;

    -- foreach array
    FOREACH elem IN ARRAY mi_arreglo LOOP
        RAISE NOTICE "Elemento actual: %", elem;
        suma := suma + elem;
        EXIT;
    END LOOP;

    -- foreach select
    FOREACH fila IN SELECT id FROM usuarios WHERE activo = TRUE LOOP
       RAISE NOTICE "Usuario activo con id=%", fila.id;
    END LOOP;


END; 


-- Funcion - - - - - - - - - -
CREATE FUNCTION mi_funcion (nombre VARCHAR(20), apellido VARCHAR(10)) RETURNS INTEGER
AS $$
    -- Select normal
    SELECT id, nombre FROM usuarios;

    -- Select con join
   SELECT usuarios.id, usuarios.nombre, roles.rol FROM usuarios JOIN roles ON usuarios.rol_id = roles.id;


    -- select con where
    SELECT id, correo FROM usuarios WHERE activo = TRUE;

    -- select con join y where
    SELECT usuarios.id, usuarios.nombre, roles.rol FROM usuarios JOIN roles ON usuarios.rol_id = roles.id WHERE roles.rol = "admin";


    RETURN  animalito; 
$$ LANGUAGE plpgsql; 


-- Procedimiento - - - - - - - - - -
CREATE PROCEDURE registrar_usuario(nombre VARCHAR(50), edad INTEGER)
LANGUAGE plpgsql
AS $$
BEGIN
    -- Inserta un nuevo usuario en la tabla
    INSERT INTO usuarios(nombre, edad) VALUES (nombre, edad);

    INSERT INTO usuarios(id, nombre, edad, activo)
VALUES(2, "Ana", 30, FALSE);



UPDATE usuarios
SET nombre = "Juan Pérez", activo = FALSE
WHERE id = 1;

-- Eliminar un usuario por id
DELETE FROM usuarios
WHERE id = 2;


-- Eliminar todos los usuarios inactivos
DELETE FROM usuarios
WHERE activo = FALSE;

    -- Mensaje de confirmación
    RAISE NOTICE "Usuario % registrado con edad %", nombre, edad;
END;
$$;



















-- ============================
-- Pruebas de gramática PGSQL
-- ============================

-- Declaraciones simples
DECLARE
    x INTEGER;
    y DECIMAL := 10.5;
    flag BOOLEAN := TRUE;
    letra CHAR := 'A';
    fecha DATE := '2025-08-31';
    texto VARCHAR(50) := "hola mundo";
    arr_int INTEGER[];
    arr_varchar VARCHAR(20)[] := ARRAY["uno", "dos", "tres"];

BEGIN
    -- Asignaciones
    x := 5;
    y := y + 2.5;
    flag := NOT FALSE;
    texto := CONCAT("prueba", " concatenada");

    -- IF simple
    IF x > 3 THEN
        RAISE NOTICE "x es mayor a 3";
    END IF;

    -- IF ELSE
    IF flag THEN
        RAISE NOTICE "flag true";
    ELSE
        RAISE NOTICE "flag false";
    END IF;

    -- CASE WHEN
    CASE
        WHEN x = 1 THEN
            RAISE NOTICE "x es uno";
        WHEN x = 5 THEN
            RAISE NOTICE "x es cinco";
        ELSE
            RAISE NOTICE "x es otro valor";
    END CASE;

    -- Ciclo FOR
    FOR i IN 1..5 LOOP
        RAISE NOTICE "iteracion: %", i;
    END LOOP;

    -- FOREACH con array
    FOREACH item IN ARRAY arr_varchar LOOP
        RAISE NOTICE "elemento: %", item;
    END LOOP;

    -- FOREACH con SELECT
    FOREACH fila IN
        SELECT id, nombre FROM usuarios
    LOOP
        RAISE NOTICE "usuario: %", fila;
    END LOOP;

    -- Exit y continue
    FOR i IN 1..10 LOOP
        IF i = 5 THEN
            EXIT;
        END IF;
        IF i % 2 = 0 THEN
            CONTINUE;
        END IF;
    END LOOP;

    -- RAISE variantes
    RAISE NOTICE "Hola %", x;
    RAISE WARNING "Advertencia con valor %", y;
    RAISE EXCEPTION "Excepcion: %", flag;
    RAISE;

    -- Transacciones dentro de bloque
    BEGIN
        INSERT INTO usuarios (id, nombre) VALUES (1, "Ana");
        COMMIT;
    END;

    BEGIN
        UPDATE usuarios SET nombre := "Pedro" WHERE id = 1;
        ROLLBACK;
    END;

    -- DML
    INSERT INTO usuarios (id, nombre) VALUES (2, "Juan");

    UPDATE usuarios
    SET nombre := "Maria", fecha := NOW()
    WHERE id = 2;

    DELETE FROM usuarios WHERE id = 2;

    SELECT u.id, u.nombre, o.orden_id
    FROM usuarios u
    JOIN ordenes o ON u.id = o.usuario_id
    LEFT JOIN pagos p ON o.orden_id = p.orden_id
    WHERE u.nombre = "Ana";

END;

-- ===================================
-- Definición de función y procedimiento
-- ===================================

CREATE FUNCTION sumar(a INTEGER, b INTEGER) RETURNS INTEGER
AS $$
    DECLARE
        resultado INTEGER;
    BEGIN
        resultado := a + b;
        RETURN resultado;
    END;
$$ LANGUAGE plpgsql;

CREATE PROCEDURE insertar_usuario(id INTEGER, nombre VARCHAR(50))
LANGUAGE plpgsql AS $$
    BEGIN
        INSERT INTO usuarios (id, nombre) VALUES (id, nombre);
    END;
$$;

