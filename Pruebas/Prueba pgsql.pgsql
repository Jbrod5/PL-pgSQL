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
    BEGIN
    -- Select normal
    SELECT id, nombre FROM usuarios;

    -- Select con join
   SELECT usuarios.id, usuarios.nombre, roles.rol FROM usuarios JOIN roles ON usuarios.rol_id = roles.id;


    -- select con where
    SELECT id, correo FROM usuarios WHERE activo = TRUE;

    -- select con join y where
    SELECT usuarios.id, usuarios.nombre, roles.rol FROM usuarios JOIN roles ON usuarios.rol_id = roles.id WHERE roles.rol = "admin";


    RETURN  animalito; 
    END; 
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






-- algo grande xd
-- Ejemplo completo de prueba para la gramática

-- Procedimiento
CREATE PROCEDURE ejemplo_prueba()
LANGUAGE plpgsql
AS $$
DECLARE
    fecha_actual DATE := NOW();
    fecha_modificada DATE;
    saludo VARCHAR(50);
    numero_aleatorio DECIMAL;
    sub_texto VARCHAR(20);
    numeros INTEGER[] := ARRAY[1,2,3];
    len_texto INTEGER;
    len_array INTEGER;
BEGIN
    -- MODIFICAR FECHA
    fecha_modificada := MODIFY_DATE(fecha_actual, 2, 1, 0);
    RAISE NOTICE "Fecha modificada: %", fecha_modificada;

    -- CONCAT y CAST
    saludo := CONCAT("Hola", " ", "PL/pgSQL!");
    RAISE NOTICE "Saludo concatenado: %", saludo;
    numero_aleatorio := CAST(RANDOM(), DECIMAL);

    -- SUBSTRING
    sub_texto := SUBSTRING(saludo, 6, 7); -- "PL/pgSQL"
    RAISE NOTICE "Subcadena: %", sub_texto;

    -- ARRAY_PUSH
    numeros := ARRAY_PUSH(numeros, 4);
    RAISE NOTICE "Array actualizado: %", numeros;

    -- LEN
    len_texto := LEN(saludo);
    len_array := LEN(numeros);
    RAISE NOTICE "Longitud texto: %, Longitud array: %", len_texto, len_array;

    -- CICLO FOR
    FOR i IN 1..3 LOOP
        RAISE NOTICE "Iteración FOR: %", i;
    END LOOP;

    -- CICLO FOREACH ARRAY
    FOREACH n IN ARRAY numeros LOOP
        RAISE NOTICE "Elemento ARRAY: %", n;
    END LOOP;

    -- IF_SIMPLE
    IF numero_aleatorio > 0.5 THEN
        RAISE NOTICE "Número aleatorio mayor que 0.5: %", numero_aleatorio;
    ELSE
        RAISE NOTICE "Número aleatorio menor o igual que 0.5: %", numero_aleatorio;
    END IF;

    -- CASE_WHEN
    CASE
        WHEN len_texto < 20 THEN
            RAISE NOTICE "Texto corto";
        WHEN len_texto >= 20 THEN
            RAISE NOTICE "Texto largo";
        ELSE
            RAISE NOTICE "Texto desconocido";
    END CASE;

    -- INSERT DML
    INSERT INTO prueba_tabla (id, nombre, fecha)
    VALUES (1, saludo, fecha_modificada);

    -- UPDATE DML
    UPDATE prueba_tabla SET nombre = CONCAT(nombre, " actualizado") WHERE id = 1;

    -- DELETE DML
    DELETE FROM prueba_tabla WHERE id = 1;
END;
$$;























