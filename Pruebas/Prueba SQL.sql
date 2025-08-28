-- - - - - - - - - - - - DDL - - - - - - - - - - - -
-- Crear y usar esquemas
CREATE SCHEMA ventas;
CREATE SCHEMA compras;
USE SCHEMA ventas;

-- Crear tablas

CREATE TABLE clientes (
    id INTEGER PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    activo BOOLEAN NULL,
    FOREIGN KEY (id) REFERENCES clientes(id)
);

CREATE TABLE pedidos (
    pedido_id INTEGER PRIMARY KEY,
    cliente_id INTEGER NOT NULL,
    monto INTEGER NOT NULL,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id)
);


-- modificar tablas

ALTER TABLE clientes ADD COLUMN direccion VARCHAR(200);
ALTER TABLE clientes DROP COLUMN direccion;

ALTER TABLE pedidos ADD CONSTRAINT fk_clientes FOREIGN KEY (cliente_id) REFERENCES clientes(id);
ALTER TABLE pedidos DROP CONSTRAINT fk_clientes;


-- eliminar tabla
DROP TABLE clientes;


-- - - - - - - - - - - - - - - - - - DML - - - - - - - - - - - - - - - - - - -
-- insertar datos
INSERT INTO pedidos (pedido_id, cliente_id, monto) VALUES (1, 101, 500);
INSERT INTO pedidos (pedido_id, cliente_id, monto) VALUES (2, 102, 750);


-- actualizar
UPDATE pedidos SET monto = 600 WHERE pedido_id = 1;


-- borrar
DELETE FROM pedidos WHERE pedido_id = 2;


-- select
SELECT pedido_id, cliente_id, monto FROM pedidos;

-- select con join
SELECT pedidos.pedido_id, pedidos.cliente_id
FROM pedidos
JOIN clientes ON pedidos.cliente_id = clientes.id;

-- select con left join
SELECT pedidos.pedido_id, clientes.nombre
FROM pedidos
LEFT JOIN clientes ON pedidos.cliente_id = clientes.id
WHERE clientes.activo = true;


--  - - - - - - - - - - - - - - - - - - DCL - - - - - - - - - - - - - - - - - - - - - -
-- DCL: Usuarios y permisos
CREATE USER jorge;
CREATE USER ana;

GRANT SELECT ON ventas.pedidos TO jorge;
GRANT INSERT ON compras.* TO ana;

REVOKE SELECT ON pedidos FROM jorge;
