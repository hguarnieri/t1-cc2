grammar t1;

IDENT
    : ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '0'..'9' | '_')*
    ;

CADEIA
    : '"' ~('\n' | '\r' | '"')* '"'
    ;

NUM_INT
    : ('0'..'9')+
    ;

NUM_REAL
    : ('0'..'9')+ '.' ('0'..'9')+
    // | '.' ('0'..'9')+
    ;

COMENTARIO
    : '{' ~('\n' | '\r' | '}')* '}' {skip();}
    ;

WS
    : (' ' | '\t' | '\r' | '\n') {skip();}
    ;



programa
    : declaracoes 'algoritmo' corpo 'fim_algoritmo'
    ;

declaracoes
    : decl_local_global*
    ;

decl_local_global
    : declaracao_local
    | declaracao_global
    ;




declaracao_local :'declare' variavel
| 'constante' IDENT ':' tipo_basico '=' valor_constante
| 'tipo' IDENT ':' tipo;

variavel
    : IDENT dimensao mais_var ':' tipo 
    ;

mais_var
    : ',' IDENT dimensao mais_var | 
    ;

identificador
    : ponteiros_opcionais IDENT dimensao outros_ident
    ;

ponteiros_opcionais 
    : ponteiros_opcionais | 
    ;

outros_ident
    : '.' identificador | 
    ;

dimensao
    : '[' exp_aritmetica ']' dimensao' | 
    ;

tipo
    : registro | tipo_estendido
    ;

mais_ident
    : ',' identificador mais_ident | ;

mais_variaveis
    : variavel mais_variaveis | 
    ;    

tipo_basico
    : 'literal' | 'inteiro' | 'real' | 'logico'
    ;

tipo_basico_ident
    : tipo_basico | IDENT
    ;

<tipo_estendido>
::= <ponteiros_opcionais> <tipo_basico_ident>





corpo : 'ble';

declaracao_global : 'bla';

variavel: 'variavel';

tipo_basico: 'basic';

valor_constante: 'const';

tipo: 'oi';
