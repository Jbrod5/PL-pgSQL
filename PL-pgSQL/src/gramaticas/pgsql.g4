grammar pgsql;

// ---------------------- PARSER RULES ----------------------

programa
    : (bloque | funcion | procedimiento)* EOF
    ;

// Valores
valor
    : VARCHAR_LITERAL
    | CHAR_LITERAL
    | NUMERO
    | NUMERO_DECIMAL
    | FECHA
    | IDENTIFICADOR
    | booleano
    | func_builtin
    | IDENTIFICADOR DOT IDENTIFICADOR
    ;

valores
    : valor (COMA valor)*
    ;

booleano
    : TRUE
    | FALSE
    ;

// Funciones built-in
func_builtin
    : NOW_FUNC
    | RANDOM_FUNC
    //Funciones que necesitan parametros - - - -
    | CONCAT_FUNC LPAR valores RPAR
    | MODIFY_DATE_FUNC
    | CAST_FUNC
    | SUBSTRING_FUNC
    | ARRAY_PUSH_FUNC
    | LEN_FUNC
    ;


// Expresiones generales
expresion
    : expresion_booleana
    | expresion_aritmetica
    | valor
    ;

// Expresiones booleanas
expresion_booleana
    : LPAR expresion_booleana RPAR              #parenBoolExpr
    | NOT_KW expresion_booleana                 #notExpr
    | expresion_booleana AND_KW expresion_booleana  #andExpr
    | expresion_booleana OR_KW expresion_booleana   #orExpr
    | expresion_aritmetica comparador expresion_aritmetica #compExpr
    | booleano                                  #boolLiteralExpr
    ;

// Comparadores
comparador
    : IGUAL
    | DIFERENTE
    | MAYOR
    | MENOR
    | MAYOR_IGUAL
    | MENOR_IGUAL
    ;

// Expresiones aritméticas
expresion_aritmetica
    : LPAR expresion_aritmetica RPAR        #parenArithExpr
    | expresion_aritmetica ELEVADO expresion_aritmetica  #powExpr
    | expresion_aritmetica POR expresion_aritmetica      #mulExpr
    | expresion_aritmetica DIVIDIDO expresion_aritmetica #divExpr
    | expresion_aritmetica MAS expresion_aritmetica      #addExpr
    | expresion_aritmetica MENOS expresion_aritmetica    #subExpr
    | valor                                  #valorArithExpr
    ;

// Declaraciones
declaracion
    : DECLARE declaraciones
    ;

declaraciones
    : (declaracion_normal | declaracion_array)+
    ;

declaracion_normal
    : IDENTIFICADOR tipo PUNTOCOMA
    | IDENTIFICADOR tipo ASIGNACION expresion PUNTOCOMA
    ;

declaracion_array
    : IDENTIFICADOR tipo_array PUNTOCOMA
    | IDENTIFICADOR tipo_array ASIGNACION ARRAY COR_OPN valores COR_CLS PUNTOCOMA
    ;

tipo
    : tipo_base
    | tipo_array
    ;

tipo_base
    : INTEGER
    | DECIMAL
    | CHAR
    | BOOLEAN
    | DATE
    | VARCHAR LPAR NUMERO RPAR
    ;

tipo_array
    : tipo_base COR_OPN COR_CLS
    ;







// Bloques y control de flujo
bloque
    : declaracion? BEGIN sentencia_en_bloque* END PUNTOCOMA
    ;

sentencia_en_bloque_ciclo
    : sentencia_en_bloque
    | exit_stmt
    | continue_stmt
    ;



//solo los procedimientos pueden hacer transacciones
sentencias_transaccionales
    : insert_stmt
    | update_stmt
    | delete_stmt;
    
sentencia_en_bloque_procedimiento
    : sentencia_en_bloque
    | sentencias_transaccionales;

sentencia_en_bloque_funcion
    : sentencia_en_bloque
    | RETURN valor PUNTOCOMA
    ;
 

sentencia_en_bloque
    : declaracion
    | if_simple
    | if_else
    | case_when

    | ciclo_for
    | ciclo_foreach_array
    | ciclo_foreach_select
    //| exit_stmt
    //| continue_stmt
    | raise_notice
    | raise_warning
    | raise_exception
    | raise_simple
    //| trans_commit
    //| trans_rollback
    
    //| funcion
    //| procedimiento
    
    //| bloque
    | select_stmt PUNTOCOMA
    //Estas funciones son de transaccionalidad que solo van en los procedimientosss
    //| insert_stmt
    //| update_stmt
    //| delete_stmt
    | asignaciones PUNTOCOMA
    
    
    //| RETURN valor PUNTOCOMA
    ;


// - - - - - - - - - - - Control de flujo - - - - - - - - - - -
if_simple
    : IF expresion_booleana THEN sentencia_en_bloque* END_IF PUNTOCOMA
    ;

if_else
    : IF expresion_booleana THEN sentencia_en_bloque* ELSE sentencia_en_bloque* END_IF PUNTOCOMA
    ;

case_when
    : CASE (WHEN expresion_booleana THEN sentencia_en_bloque+)+ (ELSE sentencia_en_bloque+)? END_CASE PUNTOCOMA
    ;

// - - - - - - - -- - - - - - Ciclos - - - - - -  - - - - - -
ciclo_for
    : FOR IDENTIFICADOR IN NUMERO RANGE_DOTS NUMERO LOOP sentencia_en_bloque_ciclo* END_LOOP PUNTOCOMA
    ;

ciclo_foreach_array
    : FOREACH IDENTIFICADOR IN ARRAY IDENTIFICADOR LOOP sentencia_en_bloque_ciclo* END_LOOP PUNTOCOMA
    ;

ciclo_foreach_select
    : FOREACH IDENTIFICADOR IN select_stmt LOOP sentencia_en_bloque_ciclo* END_LOOP PUNTOCOMA
    ;

// - - - - - - - - - - - -  Control - - - - - - -  - - -
exit_stmt
    : EXIT PUNTOCOMA
    ;

continue_stmt
    : CONTINUE PUNTOCOMA
    ;



// - - - - - - - - - - - - RAISE - - - - - - - - - - - -
raise_notice
    : RAISE_NOTICE VARCHAR_LITERAL (COMA valor)* PUNTOCOMA
    ;

raise_warning
    : RAISE_WARNING VARCHAR_LITERAL (COMA valor)* PUNTOCOMA
    ;

raise_exception
    : RAISE_EXCEPTION VARCHAR_LITERAL (COMA valor)* PUNTOCOMA
    ;

raise_simple
    : RAISE PUNTOCOMA
    ;

















// Funciones y procedimientos
funcion
    : CREATE_FUNCTION IDENTIFICADOR LPAR parametros? RPAR RETURNS tipo
      AS DOLLAR_DOLLAR  sentencia_en_bloque_funcion*  DOLLAR_DOLLAR LANGUAGE PLPGSQL PUNTOCOMA
    ;





procedimiento
    : CREATE_PROCEDURE IDENTIFICADOR LPAR parametros? RPAR LANGUAGE PLPGSQL AS DOLLAR_DOLLAR BEGIN sentencia_en_bloque_procedimiento*  END PUNTOCOMA DOLLAR_DOLLAR PUNTOCOMA
    ;

parametros
    : parametro (COMA parametro)*
    ;

parametro
    : IDENTIFICADOR tipo
    ;



















// DML
asignaciones_igual: IDENTIFICADOR IGUAL expresion (COMA IDENTIFICADOR IGUAL expresion)*
    ;

insert_stmt
    : INSERT INTO IDENTIFICADOR LPAR columnas RPAR VALUES LPAR valores RPAR PUNTOCOMA
    ;

update_stmt
    : UPDATE IDENTIFICADOR SET asignaciones_igual WHERE expresion PUNTOCOMA
    ;

delete_stmt
    : DELETE FROM IDENTIFICADOR WHERE expresion PUNTOCOMA
    ;

select_stmt
    : SELECT columnas FROM IDENTIFICADOR join_list? where_clause? 
    ;

columnas
    : columna_prefijo (COMA columna_prefijo)*
    ;

columna_prefijo
    : IDENTIFICADOR? DOT? IDENTIFICADOR
    ;

join_list
    : join_clause+
    ;

join_clause
    : (JOIN | LEFT JOIN) IDENTIFICADOR ON columna_prefijo IGUAL columna_prefijo
    ;

asignaciones
    : IDENTIFICADOR ASIGNACION expresion (COMA IDENTIFICADOR ASIGNACION expresion)*
    ;

where_clause
    : WHERE expresion
    ;

condicion
    : expresion
    ;





// ---------------------- LEXER RULES ----------------------

PUNTOCOMA : ';' ;
ASIGNACION : ':=' ;
COMA       : ',' ;
DOT        : '.' ;
MAS        : '+' ;
MENOS      : '-' ;
POR        : '*' ;
DIVIDIDO   : '/' ;
ELEVADO    : '^' ;
MAYOR      : '>' ;
MENOR      : '<' ;
MAYOR_IGUAL: '>=' ;
MENOR_IGUAL: '<=' ;
IGUAL      : '=' ;
DIFERENTE  : '<>' ;
RANGE_DOTS : '..' ;
COR_OPN    : '[' ;
COR_CLS    : ']' ;
LPAR       : '(' ;
RPAR       : ')' ;
DOLLAR_DOLLAR : '$$' ;

// Palabras clave
ARRAY      : 'ARRAY' ;
DECLARE    : 'DECLARE' ;
INTEGER    : 'INTEGER' ;
DECIMAL    : 'DECIMAL' ;
CHAR       : 'CHAR' ;
BOOLEAN    : 'BOOLEAN' ;
DATE       : 'DATE' ;
VARCHAR    : 'VARCHAR' ;
TRUE       : 'TRUE' ;
FALSE      : 'FALSE' ;
BEGIN      : 'BEGIN' ;
END        : 'END' ;
IF         : 'IF' ;
THEN       : 'THEN' ;
ELSE       : 'ELSE' ;
END_IF     : 'END IF' ;
CASE       : 'CASE' ;
WHEN       : 'WHEN' ;
END_CASE   : 'END CASE' ;
FOR        : 'FOR' ;
IN         : 'IN' ;
LOOP       : 'LOOP' ;
END_LOOP   : 'END LOOP' ;
EXIT       : 'EXIT' ;
CONTINUE   : 'CONTINUE' ;
RAISE      : 'RAISE' ;
RAISE_NOTICE      : 'RAISE NOTICE' ;
RAISE_WARNING     : 'RAISE WARNING' ;
RAISE_EXCEPTION   : 'RAISE EXCEPTION' ;
COMMIT     : 'COMMIT' ;
ROLLBACK   : 'ROLLBACK' ;
CREATE_FUNCTION    : 'CREATE FUNCTION' ;
CREATE_PROCEDURE   : 'CREATE PROCEDURE' ;
RETURNS    : 'RETURNS' ;
AS         : 'AS' ;
LANGUAGE   : 'LANGUAGE' ;
PLPGSQL    : 'plpgsql' ;
FOREACH    : 'FOREACH' ;
RETURN     : 'RETURN' ;
OR_KW      : 'OR' ;
AND_KW     : 'AND' ;
NOT_KW     : 'NOT' ;
INSERT     : 'INSERT' ;
INTO       : 'INTO' ;
VALUES     : 'VALUES' ;
UPDATE     : 'UPDATE' ;
SET        : 'SET' ;
WHERE      : 'WHERE' ;
DELETE     : 'DELETE' ;
FROM       : 'FROM' ;
SELECT     : 'SELECT' ;
JOIN       : 'JOIN' ;
LEFT       : 'LEFT' ;
ON         : 'ON' ;

// Funciones built-in (mejor declararlas como tokens simples, no con regex greedy)
NOW_FUNC        : 'NOW()' ;
RANDOM_FUNC     : 'RANDOM()' ;
CONCAT_FUNC     : 'CONCAT';
MODIFY_DATE_FUNC: 'MODIFY_DATE' ;
CAST_FUNC       : 'CAST' ;
SUBSTRING_FUNC  : 'SUBSTRING' ;
ARRAY_PUSH_FUNC : 'ARRAY_PUSH' ;
LEN_FUNC        : 'LEN' ;

// Literales
IDENTIFICADOR
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;

NUMERO_DECIMAL
    : [0-9]+ DOT [0-9]+
    ;

NUMERO
    : [0-9]+
    ;

CHAR_LITERAL
    : '\'' [a-zA-Z0-9] '\''
    ;

// Ahora VARCHAR_LITERAL en lugar de STRING
VARCHAR_LITERAL
    : '"' (~["\r\n])* '"'
    ;

FECHA
    : [0-9]{4} '-' [0-9]{2} '-' [0-9]{2}
    ;

// Comentarios y espacios
WS
    : [ \t\r\n]+ -> skip
    ;

LINE_COMMENT : '--' ~[\r\n]* -> skip ;
BLOCK_COMMENT: '/*' .*? '*/' -> skip ;
