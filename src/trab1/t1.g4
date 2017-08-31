grammar t1;

IDENT: '"' (~('\\'|'"'))* '"' | '\'' (~('\\'|'\''))* '\'';

programa : declaracoes 'algoritmo' corpo 'fim_algoritmo';
declaracoes : decl_local_global declaracoes | ;
decl_local_global : declaracao_local | declaracao_global ;
declaracao_local :'declare' variavel
| 'constante' IDENT ':' tipo_basico '=' valor_constante
| 'tipo' IDENT ':' tipo;

corpo : 'ble';
declaracao_global : 'bla';
variavel: 'variavel';
tipo_basico: 'basic';
valor_constante: 'const';
tipo: 'oi';
