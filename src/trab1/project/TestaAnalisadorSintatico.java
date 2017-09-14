package trab1;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;

public class TestaAnalisadorSintatico {

    public static void main(String args[]) throws IOException, RecognitionException {
        SaidaParser out = new SaidaParser();
        // Descomente as linhas abaixo para testar o analisador gerado.
        // Obs: a linha abaixo está configurada para usar como entrada o arquivo lua1.txt
        // Modifique-a para testar os demais exemplos
        ANTLRInputStream input = new ANTLRInputStream(args[0]);
        t1Lexer lexer = new t1Lexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        t1Parser parser = new t1Parser(tokens);
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