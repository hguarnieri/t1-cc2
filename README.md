# t1-cc2

Este arquivo tem o intuito de guiar o projeto e deixar todos do grupo atualizados

Problemas
  - Nao estamos conseguindo usar o Corretor no projeto. (ok rodou)
  - Agora percebemos que o compilador nao esta comppilando nada. Erro no projeto na main do analisador sintatico ( TestaAnalisadorSintatico.java ) linha 22 ( argumento de entrada )
  
  

Estagio do projeto
  - Toda a gramatica ja foi digitada e testada no Antlr e no projeto Netbeans.
  - Estamos tentando executar os testes sintaticos seguindo o passo a passo fornecido pelo prof.
  [ https://ava.ead.ufscar.br/mod/resource/view.php?id=380355 ]
  
  
  Codigo para executar o corretorAutomatico linux lucas:
  (argumentos de entrada e saida invertidos ?)
  
  sudo java -jar "/home/lucas/Documents/t1-cc2/corretor/CorretorTrabalho1.jar" "java -jar /home/lucas/Documents/t1-cc2/dist/Trab1.jar" gcc "/home/lucas/Documents/t1-cc2/temp" "/home/lucas/Documents/t1-cc2/casosDeTesteT1/" "407747,407887,407828" tudo


Comandos:

java -jar "/home/lucas/Documents/t1-cc2/corretor/CorretorTrabalho1.jar" "java -jar /home/lucas/Documents/t1-cc2/dist/Trab1.jar" gcc "/home/lucas/Documents/t1-cc2/temp" "/home/lucas/Documents/t1-cc2/casosDeTesteT1/" "408220 203922 233333" sintatico

java -jar antlr-4.7-complete.jar "/home/lucas/Documents/t1-cc2/src/trab1/linguagem/T1.g4" -package trab1.linguagem




