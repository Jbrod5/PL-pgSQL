grammar pgsql;

// NOTACION EBNF:
// | -> or
// [] -> opcional (cero o una vez)
// {} -> repeticion (cero o más veces)
// () -> agrupacion
// "..."_"..." -> rango de caracteres (como [a-z])
// ; -> final de regla



//- - - - - - - - - - - - - -  Cosas generales - - - - - - - - - - - - - -



// = = = = = = = = = = = = = = = = = = = = = = PARSER = = = = = = = = = = = = = = = = = = = = = =

// Regla de inicio opcional para probar archivos con solo un bloque DECLARE y EOF
script
    : declaracion EOF
    ;

// valor          = string | char_literal | numero | fecha | identificador | booleano;
valor
    : STRING
    | CHAR_LITERAL
    | DECIMAL_LIT
    | INT
    | DATE_LIT
    | IDENT
    | TRUE
    | FALSE
    ;

// valores        = valor {coma valor};
valores
    : valor (COMMA valor)*
    ;

// array literal: ARRAY '[' valores ']'
array_literal
    : ARRAY LBRACK valores RBRACK
    ;


// - - - - - - - - - - - - Declaraciones y tipado - - - - - - - - - - - -

// tipo_base      = integer | decimal | varchar | char | boolean | date ;
tipo_base
    : INTEGER_KW
    | DECIMAL_KW
    | VARCHAR_KW LPAREN INT RPAREN
    | CHAR_KW
    | BOOLEAN_KW
    | DATE_KW
    ;

// tipo_array     = tipo_base cor_opn cor_cls ;   // ARRAY de tipo_base
tipo_array
    : tipo_base LBRACK RBRACK
    ;

// tipo           = tipo_base | tipo_array;
tipo
    : tipo_base
    | tipo_array
    ;

// declaracion_normal = identificador tipo puntocoma
//                    | identificador tipo asignacion valor puntocoma;
declaracion_normal
    : IDENT tipo SEMICOLON
    | IDENT tipo ASSIGN valor SEMICOLON
    ;

// declaracion_array  = identificador tipo_array puntocoma
//                    | identificador tipo_array asignacion array cor_opn valores cor_cls puntocoma;
declaracion_array
    : IDENT tipo_array SEMICOLON
    | IDENT tipo_array ASSIGN array_literal SEMICOLON
    ;

// declaraciones  = (declaracion_normal | declaracion_array)+;
declaraciones
    : (declaracion_normal | declaracion_array)+
    ;

// declaracion    = declare declaraciones;
declaracion
    : DECLARE declaraciones
    ;






// = = = = = = = = = = = = = = = = = = = = = = LEXER = = = = = = = = = = = = = = = = = = = = = =


// Palabras reservadas
DECLARE     : 'DECLARE';
ARRAY       : 'ARRAY';

INTEGER_KW  : 'INTEGER';
DECIMAL_KW  : 'DECIMAL';
VARCHAR_KW  : 'VARCHAR';
CHAR_KW     : 'CHAR';
BOOLEAN_KW  : 'BOOLEAN';
DATE_KW     : 'DATE';

TRUE        : 'TRUE';
FALSE       : 'FALSE';

// Símbolos
ASSIGN      : ':=';
COMMA       : ',';
SEMICOLON   : ';';
LBRACK      : '[';
RBRACK      : ']';
LPAREN      : '(';
RPAREN      : ')';


// Literales
// DECIMAL_LIT antes de INT para evitar tokenización "3" "." "14"
DECIMAL_LIT : '-'? DIGITS '.' DIGITS ;
INT         : '-'? DIGITS ;
DATE_LIT    : DIGIT DIGIT DIGIT DIGIT '-' DIGIT DIGIT '-' DIGIT DIGIT ;

STRING
    : '"' (~["\r\n])* '"'
    ;

// Un solo carácter entre comillas simples
CHAR_LITERAL
    : '\'' ~['\r\n] '\''
    ;

// Identificadores: iniciar con letra o _, luego letras/dígitos/_
IDENT
    : [a-zA-Z_] [a-zA-Z0-9_]*
    ;


// Comentarios y espacios
LINE_COMMENT
    : '--' ~[\r\n]* -> skip
    ;

BLOCK_COMMENT
    : '/*' .*? '*/' -> skip
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

// Fragments
fragment DIGITS : DIGIT+ ;
fragment DIGIT  : [0-9] ;
