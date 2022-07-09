grammar Eql;

sql: statement EOF;

statement
    : SELECT cols FROM index_name (WHERE where_statement)?
    ;

index_name
    : ID                                                        # index
    ;

where_statement
    : ID ASSIGN expr                                            # equal
    | ID LIKE STRING                                            # like
    | ID IN array                                               # in
    | where_statement AND where_statement                       # and
    ;

cols
    : col ( COMMA col )*
    ;

col
    : ID
    ;

array
    : LP expr (COMMA expr)* RP
    ;

expr
    : STRING
    | INTEGER
    | DECIMAL
    | TRUE
    | FALSE
    ;

SELECT: 'SELECT';
FROM: 'FROM';
WHERE: 'WHERE';
ASSIGN: '=';
LP:        '(';
RP:        ')';
AND: 'AND';
LIKE: 'LIKE';
IN: 'IN';
DOT: '.';
COMMA:     ',';

TRUE: 'true';
FALSE: 'false';
INTEGER: [+\-]? ( '0' | [1-9] [0-9]* );
DECIMAL: [+\-]? ( '0' | [1-9] [0-9]* ) (DOT [0-9]+)? ( [eE] [+\-]? [0-9]+ )?;
STRING: '"' ( '\\"' | '\\\\' | ~[\\"] )*? '"';
ID: [_a-zA-Z] [\\._a-zA-Z0-9]*;
WS   : [ \t\n\r]+ -> skip ;
