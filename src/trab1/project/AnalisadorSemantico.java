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
    String ultimoTipo = "";

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
        } else {
            sp.println("Linha " + ctx.variavel().IDENT().getSymbol().getLine() + ": identificador " + nomeVar + " ja declarado anteriormente");
        }
        
        if (ctx.variavel().mais_var() != null) {
            ultimoTipo = tipoVar;
            super.visitMais_var(ctx.variavel().mais_var());
        }
        
        return super.visitDeclaracao_local(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMais_var(T1Parser.Mais_varContext ctx) {
        //System.out.println("Mais var");
         // Se tiver mais variáveis, faz o mesmo procedimento de cima
        for(TerminalNode s : ctx.IDENT()) {
            String nomeVar = s.getText();
            if (!pilhaDeTabelas.topo().existeSimbolo(nomeVar)){
                pilhaDeTabelas.topo().adicionarSimbolo(nomeVar, ultimoTipo);
            } else {
                sp.println("Linha " + s.getSymbol().getLine() + ": identificador " + nomeVar + " ja declarado anteriormente");
            }
        }
        return super.visitMais_var(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitDecl_local_global(T1Parser.Decl_local_globalContext ctx) {
        return super.visitDecl_local_global(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitCmd(T1Parser.CmdContext ctx) {
        //System.out.println("visit CMD!");
//        if (ctx.expressao() != null) {
//            System.out.println(ctx.mais_expressao().getText());
//        }
        
        // Se não encontrou a variável, exibe erro
        if (ctx.identificador() != null) {
            String nomeVar = ctx.identificador().getText();
            if (!pilhaDeTabelas.topo().existeSimbolo(nomeVar)){
                sp.println("Linha " + ctx.identificador().IDENT().getSymbol().getLine() + ": identificador " + nomeVar + " nao declarado");
            }
        }
        
        return super.visitCmd(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMais_ident(T1Parser.Mais_identContext ctx) {
        if (ctx != null) {
            for (T1Parser.IdentificadorContext identificador : ctx.identificador()) {
                String nomeVar = identificador.getText();
                if (!pilhaDeTabelas.topo().existeSimbolo(nomeVar)){
                    sp.println("Linha " + identificador.IDENT().getSymbol().getLine() + ": identificador " + nomeVar + " nao declarado");
                }
            }
        }
        return super.visitMais_ident(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMais_expressao(T1Parser.Mais_expressaoContext ctx) {
//        System.out.println("mais expressao");
//        System.out.println(ctx.getText());
//        for(T1Parser.ExpressaoContext s : ctx.expressao()) {
//            System.out.println(s.);
//        }
        return super.visitMais_expressao(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExpressao(T1Parser.ExpressaoContext ctx) {
        //System.out.println("expressao");
        //System.out.println(ctx.children.get(0).getText());
        //System.out.println(ctx.getText());
        return super.visitExpressao(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExp_aritmetica(T1Parser.Exp_aritmeticaContext ctx) {
        //System.out.println("expressao ARITMETICA");
        //System.out.println(ctx.getText());
        return super.visitExp_aritmetica(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOutros_termos(T1Parser.Outros_termosContext ctx) {
        //System.out.println("Outros termos **********");
        //System.out.println(ctx.getText());
        return super.visitOutros_termos(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFator(T1Parser.FatorContext ctx) {
        //System.out.println("FATOR ******");
        if (ctx.getText().matches("^[a-zA-Z_$][a-zA-Z_$0-9]*$")) { // Apenas variáveis
            String nomeVar = ctx.getText();
            if (!pilhaDeTabelas.topo().existeSimbolo(nomeVar)){
                sp.println("Linha " + ctx.start.getLine() + ": identificador " + nomeVar + " nao declarado");
            }
        }
        return super.visitFator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_adicao(T1Parser.Op_adicaoContext ctx) {
        //System.out.println("adicao!!!!!");
        //System.out.println(ctx.getText());
        return super.visitOp_adicao(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_multiplicacao(T1Parser.Op_multiplicacaoContext ctx) {
        //System.out.println();
        return super.visitOp_multiplicacao(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
