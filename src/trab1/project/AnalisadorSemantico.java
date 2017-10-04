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
    String ultimaChamadaAtribuicao = "";
    Tipo ultimoTipoChamadaAtribuicao = null;
    int ultimoComando = 0;
    
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
    public Object visitConstantes(T1Parser.ConstantesContext ctx) {
        //System.out.println("constante");
        return super.visitConstantes(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitValor_constante(T1Parser.Valor_constanteContext ctx) {
        //System.out.println(ctx.parent.getText());
        return super.visitValor_constante(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    private boolean isValidType(String type) {
        if (type.equals("literal") || type.equals("inteiro") 
                || type.equals("real") || type.equals("logico")) {
            return true;
        }
        return false;
    }

    @Override
    public Object visitDeclaracao_local(T1Parser.Declaracao_localContext ctx) {
        
        // Constantes
        if (ctx.IDENT() != null) {
            String nomeVar = ctx.IDENT().getText();
            String tipoVar = ctx.tipo_basico().getText();
            
            if (!isValidType(tipoVar)) {
                sp.println("Linha " + ctx.variavel().IDENT().getSymbol().getLine() + ": tipo " + tipoVar + " nao declarado");
            } 
            
            if (!pilhaDeTabelas.existeSimbolo(nomeVar)){
                pilhaDeTabelas.topo().adicionarSimbolo(nomeVar, tipoVar);
            } else {
                sp.println("Linha " + ctx.variavel().IDENT().getSymbol().getLine() + ": identificador " + nomeVar + " ja declarado anteriormente");
            }          
        }
        
        // Demais variáveis
        if (ctx.variavel() != null) {
            String nomeVar = ctx.variavel().IDENT().toString();
            String tipoVar = ctx.variavel().tipo().getText();
            if (!isValidType(tipoVar)) {
                sp.println("Linha " + ctx.variavel().IDENT().getSymbol().getLine() + ": tipo " + tipoVar + " nao declarado");
            } 
            
            if (!pilhaDeTabelas.existeSimbolo(nomeVar)){
                pilhaDeTabelas.topo().adicionarSimbolo(nomeVar, tipoVar);
            } else {
                sp.println("Linha " + ctx.variavel().IDENT().getSymbol().getLine() + ": identificador " + nomeVar + " ja declarado anteriormente");
            }  

            if (ctx.variavel().mais_var() != null) {
                ultimoTipo = tipoVar;
                super.visitMais_var(ctx.variavel().mais_var());
            }
        }
        
        return super.visitDeclaracao_local(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMais_var(T1Parser.Mais_varContext ctx) {
         // Se tiver mais variáveis, faz o mesmo procedimento de cima
        for(TerminalNode s : ctx.IDENT()) {
            String nomeVar = s.getText();
            if (!pilhaDeTabelas.existeSimbolo(nomeVar)){
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
        ultimoComando = ctx.comando;
        // Se não encontrou a variável, exibe erro
        if (ctx.identificador() != null) {
            String nomeVar = ctx.identificador().getText();
            if (!pilhaDeTabelas.existeSimbolo(nomeVar)){
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
                if (!pilhaDeTabelas.existeSimbolo(nomeVar)){
                    sp.println("Linha " + identificador.IDENT().getSymbol().getLine() + ": identificador " + nomeVar + " nao declarado");
                }
            }
        }
        return super.visitMais_ident(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitMais_expressao(T1Parser.Mais_expressaoContext ctx) {        
        return super.visitMais_expressao(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExpressao(T1Parser.ExpressaoContext ctx) {
        if (ctx.getText().equals("verdadeiro") || ctx.getText().equals("falso")) {
            sp.println("Linha " + ctx.start.getLine() + ": atribuicao nao compativel para " + ultimaChamadaAtribuicao);
        }
        return super.visitExpressao(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitChamada_atribuicao(T1Parser.Chamada_atribuicaoContext ctx) {
        T1Parser.CmdContext context = (T1Parser.CmdContext) ctx.parent;
        
        ultimaChamadaAtribuicao = context.IDENT().getText();
        ultimoTipoChamadaAtribuicao = getTipo(pilhaDeTabelas.getTipo(ultimaChamadaAtribuicao));
        return super.visitChamada_atribuicao(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitExp_aritmetica(T1Parser.Exp_aritmeticaContext ctx) {
        if (ultimoComando == 9 && ultimoTipoChamadaAtribuicao != null) {
            String nomeVar = ctx.termo().getText();
            Tipo tipoValor = getTipo(ctx.termo().getText());
            Tipo tipoVar = getTipo(pilhaDeTabelas.getTipo(nomeVar));
            if (tipoValor == Tipo.VARIAVEL) {
                if (tipoVar != ultimoTipoChamadaAtribuicao) {
                    sp.println("Linha " + ctx.start.getLine() + ": atribuicao nao compativel para " + ultimaChamadaAtribuicao);
                }
            } else {
                if (getTipo(nomeVar) != ultimoTipoChamadaAtribuicao && isNotArithmetic(nomeVar)) {
                    sp.println("Linha " + ctx.start.getLine() + ": atribuicao nao compativel para " + ultimaChamadaAtribuicao);
                }
            }

            for(T1Parser.TermoContext t : ctx.outros_termos().termo()) {
                Tipo tipoTermo = getTipo(t.getText());
                if (tipoTermo == Tipo.VARIAVEL) {
                    Tipo tipoTermoAtual = getTipo(pilhaDeTabelas.getTipo(t.getText()));
                    if (tipoTermoAtual != ultimoTipoChamadaAtribuicao) {
                        sp.println("Linha " + t.start.getLine() + ": atribuicao nao compativel para " + ultimaChamadaAtribuicao);
                    }
                } else {
                    if (tipoTermo != ultimoTipoChamadaAtribuicao && isNotArithmetic(t.getText())) {
                        sp.println("Linha " + t.start.getLine() + ": atribuicao nao compativel para " + ultimaChamadaAtribuicao);
                    }
                }
            }
        }
        return super.visitExp_aritmetica(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    private boolean isNotArithmetic(String valor) {
        return valor.indexOf('*') == -1 && valor.indexOf('/') == -1 
                && valor.indexOf('+') == -1 && valor.indexOf('-') == -1
                && valor.indexOf('<') == -1 && valor.indexOf('>') == -1;
    }
    
    enum Tipo {
        STRING, VARIAVEL, INTEIRO, UNKNOWN, LOGICO
    }
    
    private Tipo getTipo(String valor) {
        if (valor == null) {
            return Tipo.UNKNOWN;
        }
        
        if (valor.equals("literal")) {
            return Tipo.STRING;
        }
        
        if (valor.equals("inteiro")) {
            return Tipo.INTEIRO;
        }
        
        if (valor.equals("real")) {
            return Tipo.INTEIRO;
        }
        
        if (valor.equals("\"falso\"") || valor.equals("\"verdadeiro\"") || valor.equals("logico")) {
            return Tipo.LOGICO;
        }
        
        if (valor.matches("\"[^\"]*\"")) {
            return Tipo.STRING;
        }
        
        if (valor.matches("^([+-]?[1-9]\\d*|0)$")) {
            return Tipo.INTEIRO;
        }
        
        if (valor.matches("^[a-zA-Z_$][a-zA-Z_$0-9]*$")) {
            return Tipo.VARIAVEL;
        }
        
        return Tipo.UNKNOWN;
    }

    @Override
    public Object visitOutros_termos(T1Parser.Outros_termosContext ctx) {
        return super.visitOutros_termos(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitFator(T1Parser.FatorContext ctx) {
        if (ctx.getText().matches("^[a-zA-Z_$][a-zA-Z_$0-9]*$")) { // Apenas variáveis
            String nomeVar = ctx.getText();
            if (!pilhaDeTabelas.existeSimbolo(nomeVar)){
                sp.println("Linha " + ctx.start.getLine() + ": identificador " + nomeVar + " nao declarado");
            }
        }
        return super.visitFator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOp_adicao(T1Parser.Op_adicaoContext ctx) {
        T1Parser.Outros_termosContext outros = (T1Parser.Outros_termosContext) ctx.parent;
        return super.visitOp_adicao(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public Object visitOp_multiplicacao(T1Parser.Op_multiplicacaoContext ctx) {
        return super.visitOp_multiplicacao(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
