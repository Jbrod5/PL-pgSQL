grammar SQL;

// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - LEXER - - - - - - - - - - - - - - - - - - - - - - - - - - - -
// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =

//Palabras reservadas
CREATE      : 'CREATE';
SCHEMA      : 'SCHEMA';
USE         : 'USE';
TABLE       : 'TABLE';
ALTER       : 'ALTER';
ADD         : 'ADD';
COLUMN      : 'COLUMN';
DROP        : 'DROP';
CONSTRAINT  : 'CONSTRAINT';
FOREIGN     : 'FOREIGN';
PRIMARY     : 'PRIMARY';
KEY         : 'KEY';
REFERENCES  : 'REFERENCES';
INTEGER     : 'INTEGER';
VARCHAR     : 'VARCHAR';
BOOLEAN     : 'BOOLEAN';

INSERT      : 'INSERT';
INTO        : 'INTO';
VALUES      : 'VALUES';
UPDATE      : 'UPDATE';
SET         : 'SET';
WHERE       : 'WHERE';
DELETE      : 'DELETE';
FROM        : 'FROM';
SELECT      : 'SELECT';
JOIN        : 'JOIN';
LEFT_JOIN   : 'LEFT JOIN';
ON          : 'ON';

USER        : 'USER';
GRANT       : 'GRANT';
TO          : 'TO';
REVOKE      : 'REVOKE';

NOT         : 'NOT';
NULL        : 'NULL';

//Simbolos
EQUALS      : '=';
DOT         : '.';
COMMA       : ',';
LPAREN      : '(';
RPAREN      : ')';
SEMICOLON   : ';';
ALL_SYM     : '*';

//Valores
TRUE        : 'true';
FALSE       : 'false';

STRING
    : '"' (~["\r\n])* '"'
    ;

IDENTIFICADOR
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

NUMERO
    : [0-9]+
    ;

// Ignorar espacios y saltos de línea
WS
    : [ \t\r\n]+ -> skip
    ;
// Ignorar comentarios
COMENTARIO
    : '--' ~[\r\n]* -> skip
    ;








// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =
// - - - - - - - - - - - - - - - - - - - - - - - - - - - -  PARSER - - - - - - - - - - - - - - - - - - - - - - - - - - - -
// = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = = =


// - - - - - - - - - - - - - - - - - - Inicio - - - - - - - -
sql_script
    : (dcl_sentence | dml_sentence | ddl_sentence)* EOF
    ;





//- - - - - - - - COSAS GENERALES - - - - - - - -

valor_op
    : NUMERO
    | TRUE
    | FALSE
    | STRING
    ;

valores
    : valor_op (COMMA valor_op)*
    ;

opciones
    : IDENTIFICADOR (COMMA IDENTIFICADOR)*
    ;




// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - DDL - - - - - - - - - - - - - - - - - - - - - - - - - - - - -

ddl_sentence
    : create_schema
    | use_schema
    | create_table
    | alter_add_column
    | alter_drop_column
    | drop_table
    | alter_add_constraint
    | alter_drop_constraint
    ;

create_schema
    : CREATE SCHEMA IDENTIFICADOR SEMICOLON
    ;

use_schema
    : USE SCHEMA IDENTIFICADOR SEMICOLON
    ;

tipo_dato
    : INTEGER
    | VARCHAR LPAREN NUMERO RPAREN
    | BOOLEAN
    ;

restriccion_columna
    : (PRIMARY KEY)? (NOT NULL | NULL)?
    ;

columna
    : IDENTIFICADOR tipo_dato restriccion_columna
    ;

llave_foranea
    : FOREIGN KEY LPAREN IDENTIFICADOR RPAREN REFERENCES IDENTIFICADOR LPAREN IDENTIFICADOR RPAREN
    ;

elemento_tabla
    : columna
    | llave_foranea
    ;

lista_elementos
    : elemento_tabla (COMMA elemento_tabla)*
    ;

create_table
    : CREATE TABLE IDENTIFICADOR LPAREN lista_elementos RPAREN SEMICOLON
    ;

alter_add_column
    : ALTER TABLE IDENTIFICADOR ADD COLUMN columna SEMICOLON
    ;

alter_drop_column
    : ALTER TABLE IDENTIFICADOR DROP COLUMN IDENTIFICADOR SEMICOLON
    ;

alter_add_constraint
    : ALTER TABLE IDENTIFICADOR ADD CONSTRAINT IDENTIFICADOR llave_foranea SEMICOLON
    ;

alter_drop_constraint
    : ALTER TABLE IDENTIFICADOR DROP CONSTRAINT IDENTIFICADOR SEMICOLON
    ;

drop_table
    : DROP TABLE IDENTIFICADOR SEMICOLON
    ;




// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - DML - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
dml_sentence
    : insert_into
    | update_sentence
    | delete_sentence
    | select_sentence
    ;

insert_into
    : INSERT INTO IDENTIFICADOR LPAREN opciones RPAREN VALUES LPAREN valores RPAREN SEMICOLON
    ;

asignaciones
    : IDENTIFICADOR EQUALS valor_op (COMMA IDENTIFICADOR EQUALS valor_op)*
    ;

update_sentence
    : UPDATE IDENTIFICADOR SET asignaciones WHERE IDENTIFICADOR EQUALS valor_op SEMICOLON
    ;

delete_sentence
    : DELETE FROM IDENTIFICADOR WHERE IDENTIFICADOR EQUALS valor_op SEMICOLON
    ;

columna_prefijo
    : (IDENTIFICADOR DOT)? IDENTIFICADOR
    ;

columnas
    : columna_prefijo (COMMA columna_prefijo)*
    ;

join_type
    : JOIN
    | LEFT_JOIN
    ;

join_clause
    : join_type IDENTIFICADOR ON columna_prefijo EQUALS columna_prefijo
    ;

join_list
    : join_clause*
    ;

select_sentence
    : SELECT columnas FROM IDENTIFICADOR join_list? (WHERE columna_prefijo EQUALS valor_op)? SEMICOLON
    ;




// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - DCL - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
dcl_sentence
    : create_user
    | grant_perm
    | revoke_perm
    ;

permiso
    : SELECT
    | INSERT
    | UPDATE
    | DELETE
    ;

tabla_op
    : IDENTIFICADOR
    | ALL_SYM
    ;

create_user
    : CREATE USER IDENTIFICADOR SEMICOLON
    ;

grant_perm
    : GRANT permiso ON IDENTIFICADOR DOT tabla_op TO IDENTIFICADOR SEMICOLON
    ;

revoke_perm
    : REVOKE permiso ON IDENTIFICADOR FROM IDENTIFICADOR SEMICOLON
    ;




