package trab1.project;

import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import trab1.linguagem.T1Lexer;
import trab1.linguagem.T1Parser;

public class TestaAnalisadorSintatico {

    public static void main(String args[]) throws IOException, RecognitionException {
        SaidaParser sp = new SaidaParser();
        // Descomente as linhas abaixo para testar o analisador gerado.
        // Obs: a linha abaixo está configurada para usar como entrada o arquivo lua1.txt
        // Modifique-a para testar os demais exemplos
        try {
          ANTLRInputStream input = new ANTLRInputStream(new FileInputStream(args[0]));
            T1Lexer lexer = new T1Lexer(input);
             CommonTokenStream tokens = new CommonTokenStream(lexer);
             T1Parser parser = new T1Parser(tokens);
             parser.addErrorListener(new T1ErrorListener(sp));
             parser.programa();
        } catch (ParseCancellationException pce) {
            if (pce.getMessage() != null) { 
                  sp.println(pce.getMessage());
            }
        }
        
//         if (!sp.isModificado()) {
//            sp.println("Fim da analise. Sem erros sintaticos.");
//            sp.println("Tabela de simbolos:");
//
//            TabelaDeSimbolos.imprimirTabela(sp);
//            System.out.print(sp);
//         } else {
//            sp.println("Fim da analise. Com erros sintaticos.");
//         }
//         
        
        try (FileWriter fw = new FileWriter(args[1])) {
            fw.write(sp.toString());
            fw.write("Fim da compilacao");
            fw.flush();
            fw.close();
        }
    }
}