package trab1.project;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import trab1.linguagem.T1Lexer;
import trab1.linguagem.T1Parser;

public class TestaAnalisadorSintatico {

    public static void main(String args[]) throws IOException, RecognitionException {
        SaidaParser out = new SaidaParser();
        // Descomente as linhas abaixo para testar o analisador gerado.
        // Obs: a linha abaixo está configurada para usar como entrada o arquivo lua1.txt
        // Modifique-a para testar os demais exemplos
        ANTLRInputStream input = new ANTLRInputStream(args[0]);
        T1Lexer lexer = new T1Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        T1Parser parser = new T1Parser(tokens);
        parser.addErrorListener(new T1ErrorListener(out));
        parser.programa();
        if (!out.isModificado()) {
            out.println("Fim da analise. Sem erros sintaticos.");
            out.println("Tabela de simbolos:");

            TabelaDeSimbolos.imprimirTabela(out);
        } else {
            out.println("Fim da analise. Com erros sintaticos.");
        }
        //FileWriter fw = new FileWriter(args[1]);
        //fw.write(out.toString());
        //fw.flush();
        //fw.close();
    }
}