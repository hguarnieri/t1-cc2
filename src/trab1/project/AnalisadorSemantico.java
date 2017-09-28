/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trab1.project;

import org.antlr.v4.runtime.tree.TerminalNode;
import trab1.linguagem.T1BaseVisitor;
import trab1.linguagem.T1Parser;

/**
 *
 * @author Henrique
 */
public class AnalisadorSemantico extends T1BaseVisitor {
    PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
    SaidaParser sp;

    public AnalisadorSemantico(SaidaParser sp) {
        this.sp = sp;
    }
    
    @Override
    public Object visitPrograma(T1Parser.ProgramaContext ctx) {
        // Cria tabela de simbolos global
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
        super.visitPrograma(ctx);
        
        // Destroi tabela de simbolos global
        pilhaDeTabelas.desempilhar();
        return null;
    }

    @Override
    public Object visitDeclaracao_global(T1Parser.Declaracao_globalContext ctx) {
        return super.visitDeclaracao_global(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDeclaracao_local(T1Parser.Declaracao_localContext ctx) {
        // Pega a primeira variável
        String nomeVar = ctx.variavel().IDENT().toString();
        String tipoVar = ctx.variavel().tipo().getText();
        if (!pilhaDeTabelas.topo().existeSimbolo(nomeVar)){
            pilhaDeTabelas.topo().adicionarSimbolo(nomeVar, tipoVar);
        }
        
        // Se tiver mais variáveis, faz o mesmo procedimento de cima
        for(TerminalNode s : ctx.variavel().mais_var().IDENT()) {
            String nomeVar1 = s.getText();
            if (!pilhaDeTabelas.topo().existeSimbolo(nomeVar1)){
                pilhaDeTabelas.topo().adicionarSimbolo(nomeVar1, tipoVar);
            }
        }
        return super.visitDeclaracao_local(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDecl_local_global(T1Parser.Decl_local_globalContext ctx) {
        return super.visitDecl_local_global(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCmd(T1Parser.CmdContext ctx) {
        // Se não encontrou a variável, exibe erro
        if (ctx.identificador() != null) {
            String nomeVar = ctx.identificador().getText();
            if (!pilhaDeTabelas.topo().existeSimbolo(nomeVar)){
                sp.println("Linha "+ctx.identificador().IDENT().getSymbol().getLine()+": identificador "+ nomeVar +" nao declarado");
            }
        }
        return super.visitCmd(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    

}
