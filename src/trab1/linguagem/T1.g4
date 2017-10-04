grammar T1;

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
    

COMENTARIOERRO
    :   '{' (~('}'|'\n'))* '\n' {throw new ParseCancellationException("Linha "+getLine()+": comentario nao fechado");}
    ;
 

WS
    : (' ' | '\t' | '\r' | '\n') {skip();}
    ;

programa
    : declaracoes 'algoritmo' corpo 'fim_algoritmo'
    ;


declaracoes
    : (decl_local_global)*
    ;

decl_local_global
    : declaracao_local
    | declaracao_global
    ;

declaracao_local
    : 'declare' variavel
    | 'constante' IDENT ':' tipo_basico '=' valor_constante
    | 'tipo' IDENT ':' tipo
    ;

variavel
    : IDENT dimensao mais_var ':' tipo
    ;

mais_var
    : (',' IDENT dimensao)*
    ;

identificador
    : ponteiros_opcionais IDENT dimensao outros_ident
    ;

ponteiros_opcionais
    : ('^')*
    ;

outros_ident
    : ('.' identificador)?
    ;

dimensao
    : ('[' exp_aritmetica ']')*
    ;

tipo
    : registro | tipo_estendido
    ;

mais_ident
    : (',' identificador)*
    ;

mais_variaveis
    : (variavel)*
    ;

tipo_basico
    : 'literal' | 'inteiro' | 'real' | 'logico'
    ;

tipo_basico_ident
    : tipo_basico | IDENT
    ;

tipo_estendido
    : ponteiros_opcionais tipo_basico_ident
    ;

valor_constante
    : CADEIA
    | NUM_INT
    | NUM_REAL
    | 'verdadeiro'
    | 'falso'
    ;

registro
    : 'registro' variavel mais_variaveis 'fim_registro'
    ;

declaracao_global
    : 'procedimento' IDENT '(' parametros_opcional ')' declaracoes_locais comandos 'fim_procedimento'
    | 'funcao' IDENT '(' parametros_opcional ')' ':' tipo_estendido declaracoes_locais comandos 'fim_funcao'
    ;

parametros_opcional
    : (parametro)?
    ;

parametro
    : var_opcional identificador mais_ident ':' tipo_estendido (mais_parametros)*
    ;

var_opcional
    : ('var')?
    ;

mais_parametros
    : (',' parametro)
    ;

declaracoes_locais
    : declaracao_local declaracoes_locais |
    ;

corpo
    : declaracoes_locais comandos
    ;

comandos
    : (cmd)*
    ;

cmd returns [int comando]
    : 'leia' '(' identificador mais_ident ')'
    {
        $comando = 1;
    }
    | 'escreva' '(' expressao mais_expressao ')'
    {
        $comando = 2;
    }
    | 'se' expressao 'entao' comandos senao_opcional 'fim_se'
    {
        $comando = 3;
    }
    | 'caso' exp_aritmetica 'seja' selecao senao_opcional 'fim_caso'
    {
        $comando = 4;
    }
    | 'para' IDENT '<-' exp_aritmetica 'ate' exp_aritmetica 'faca' comandos 'fim_para'
    {
        $comando = 5;
    }
    | 'enquanto' expressao 'faca' comandos 'fim_enquanto'
    {
        $comando = 6;
    }
    | 'faca' comandos 'ate' expressao
    {
        $comando = 7;
    }
    | '^' IDENT outros_ident dimensao '<-' expressao
    {
        $comando = 8;
    }
    | IDENT chamada_atribuicao
    {
        $comando = 9;
    }
    | 'retorne' expressao
    {
        $comando = 10;
    }
    ;

mais_expressao
    : (',' expressao)*
    ;

senao_opcional
    : ('senao' comandos)?
    ;

chamada_atribuicao
    : '(' argumentos_opcional ')'
    | outros_ident dimensao '<-' expressao
    ;

argumentos_opcional
    : (expressao mais_expressao)?
    ;

selecao
    : constantes ':' comandos mais_selecao
    ;

mais_selecao
    : (selecao)?
    ;

constantes
    : numero_intervalo mais_constantes
    ;

mais_constantes
    : (',' constantes)?
    ;

numero_intervalo
    : op_unario NUM_INT intervalo_opcional
    ;

intervalo_opcional
    : ('..' op_unario NUM_INT)?
    ;

op_unario
    : ('-')?
    ;

exp_aritmetica
    : termo outros_termos
    ;

op_multiplicacao
    : '*'
    | '/'
    ;

op_adicao
    : '+'
    | '-'
    ;

termo
    : fator outros_fatores
    ;

outros_termos
    : (op_adicao termo)*
    ;

fator
    : parcela outras_parcelas
    ;

outros_fatores
    : (op_multiplicacao fator)*
    ;

parcela
    : op_unario parcela_unario | parcela_nao_unario
    ;

parcela_unario
    : '^' IDENT outros_ident dimensao
    | IDENT chamada_partes
    | NUM_INT
    | NUM_REAL
    | '(' expressao ')'
    ;

parcela_nao_unario
    : '&' IDENT outros_ident dimensao
    |
    CADEIA
    ;

outras_parcelas
    : ('%' parcela)*
    ;

chamada_partes
    : '(' expressao mais_expressao ')'
    | outros_ident dimensao
    |
    ;

exp_relacional
    : exp_aritmetica op_opcional
    ;

op_opcional
    : (op_relacional exp_aritmetica)?
    ;

op_relacional
    : '='
    | '<>'
    | '>='
    | '<='
    | '>'
    | '<'
    ;

expressao
    : termo_logico outros_termos_logicos
    ;

op_nao
    : 'nao'
    |
    ;

termo_logico
    : fator_logico outros_fatores_logicos
    ;

outros_termos_logicos
    : ('ou' termo_logico)*
    ;

outros_fatores_logicos
    : ('e' fator_logico)*
    ;

fator_logico
    : op_nao parcela_logica
    ;

parcela_logica
    : 'verdadeiro'
    | 'falso'
    | exp_relacional
    ;

ERROR: . { throw new ParseCancellationException("Linha "+getLine()+": "+getText()+" - simbolo nao identificado"); };