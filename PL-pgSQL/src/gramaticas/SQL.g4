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
    : valor1=valor_op (COMMA valorN=valor_op)*
    ;

opciones
    : id1=IDENTIFICADOR (COMMA idN=IDENTIFICADOR)*
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
    : CREATE SCHEMA id_create_schema=IDENTIFICADOR SEMICOLON
    ;

use_schema
    : USE SCHEMA id_use_schema=IDENTIFICADOR SEMICOLON
    ;

tipo_dato
    : INTEGER
    | VARCHAR LPAREN tam_varchar=NUMERO RPAREN
    | BOOLEAN
    ;

restriccion_columna
    : (PRIMARY KEY)? (NOT NULL | NULL)?
    ;

columna
    : id_col=IDENTIFICADOR tipo=tipo_dato restriccion=restriccion_columna
    ;

llave_foranea
    : FOREIGN KEY LPAREN id_col_local=IDENTIFICADOR RPAREN
      REFERENCES id_tab_ref=IDENTIFICADOR LPAREN id_col_ref=IDENTIFICADOR RPAREN
    ;

elemento_tabla
    : columna
    | llave_foranea
    ;

lista_elementos
    : elem1=elemento_tabla (COMMA elemN=elemento_tabla)*
    ;

create_table
    : CREATE TABLE id_table=IDENTIFICADOR LPAREN lista_elementos RPAREN SEMICOLON
    ;

alter_add_column
    : ALTER TABLE id_table=IDENTIFICADOR ADD COLUMN columna SEMICOLON
    ;

alter_drop_column
    : ALTER TABLE id_table=IDENTIFICADOR DROP COLUMN id_col=IDENTIFICADOR SEMICOLON
    ;

alter_add_constraint
    : ALTER TABLE id_table=IDENTIFICADOR ADD CONSTRAINT id_constr=IDENTIFICADOR llave_foranea SEMICOLON
    ;

alter_drop_constraint
    : ALTER TABLE id_table=IDENTIFICADOR DROP CONSTRAINT id_constr=IDENTIFICADOR SEMICOLON
    ;

drop_table
    : DROP TABLE id_table=IDENTIFICADOR SEMICOLON
    ;




// - - - - - - - - - - - - - - - - - - - - - - - - - - - - - DML - - - - - - - - - - - - - - - - - - - - - - - - - - - - -
dml_sentence
    : insert_into
    | update_sentence
    | delete_sentence
    | select_sentence
    ;

insert_into
    : INSERT INTO id_table=IDENTIFICADOR LPAREN opciones RPAREN VALUES LPAREN valores RPAREN SEMICOLON
    ;

asignaciones
    : id1=IDENTIFICADOR EQUALS val1=valor_op
      (COMMA idN=IDENTIFICADOR EQUALS valN=valor_op)*
    ;

update_sentence
    : UPDATE id_table=IDENTIFICADOR SET asignaciones
      WHERE id_cond_col=IDENTIFICADOR EQUALS val_cond=valor_op SEMICOLON
    ;

delete_sentence
    : DELETE FROM id_table=IDENTIFICADOR
      WHERE id_cond_col=IDENTIFICADOR EQUALS val_cond=valor_op SEMICOLON
    ;

columna_prefijo
    : (id_tab=IDENTIFICADOR DOT)? id_col=IDENTIFICADOR
    ;

columnas
    : col1=columna_prefijo (COMMA colN=columna_prefijo)*
    ;

join_type
    : JOIN
    | LEFT_JOIN
    ;

join_clause
    : join_type id_tab=IDENTIFICADOR ON col_left=columna_prefijo EQUALS col_right=columna_prefijo
    ;

join_list
    : join_clause*
    ;

select_sentence
    : SELECT columnas FROM id_tab=IDENTIFICADOR
      join_list? (WHERE col_cond=columna_prefijo EQUALS val_cond=valor_op)? SEMICOLON
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
    : id_tab=IDENTIFICADOR
    | ALL_SYM
    ;

create_user
    : CREATE USER id_user=IDENTIFICADOR SEMICOLON
    ;

grant_perm
    : GRANT permiso ON id_schema=IDENTIFICADOR DOT tabla_op TO id_user=IDENTIFICADOR SEMICOLON
    ;

revoke_perm
    : REVOKE permiso ON id_tab=IDENTIFICADOR FROM id_user=IDENTIFICADOR SEMICOLON
    ;
