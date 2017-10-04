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
public class AnalisadorSemantico2 extends T1BaseVisitor {

    PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
    SaidaParser sp;

    String lastDeclaredType;
    String lastAttributionType;
    String lastParentId;
    int lastCommand = 0;

    public AnalisadorSemantico2(SaidaParser sp) {
        this.sp = sp;
    }

    @Override
    public Object visitPrograma(T1Parser.ProgramaContext ctx) {
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
        Object ret = super.visitPrograma(ctx);
        pilhaDeTabelas.desempilhar();
        return ret;
    }

    @Override
    public Object visitVariavel(T1Parser.VariavelContext ctx) {
        String nomeVar = ctx.IDENT().getText();
        String tipoVar = ctx.tipo().getText();
        this.lastDeclaredType = tipoVar;
        int line = ctx.IDENT().getSymbol().getLine();

        if (!isValidType(tipoVar)) {
            sp.println("Linha " + line + ": tipo " + tipoVar + " nao declarado");
        }

        addVariable(nomeVar, tipoVar, line);
        return super.visitVariavel(ctx);
    }

    @Override
    public Object visitMais_var(T1Parser.Mais_varContext ctx) {
        for(TerminalNode c : ctx.IDENT()) {
            if (!ctx.IDENT().isEmpty()) {
                String nomeVar = c.getText();
                String tipoVar = this.lastDeclaredType;
                int line = c.getSymbol().getLine();

                addVariable(nomeVar, tipoVar, line);
            }
        }
        return super.visitMais_var(ctx);
    }

    private void addVariable(String nomeVar, String tipoVar, int line) {
        if (!pilhaDeTabelas.existeSimbolo(nomeVar)) {
            pilhaDeTabelas.topo().adicionarSimbolo(nomeVar, tipoVar);
        } else {
            sp.println("Linha " + line + ": identificador " + nomeVar + " ja declarado anteriormente");
        }
    }

    private boolean isValidType(String type) {
        return type.equals("literal") || type.equals("inteiro")
                || type.equals("real") || type.equals("logico");
    }

    @Override
    public Object visitCmd(T1Parser.CmdContext ctx) {
        this.lastCommand = ctx.comando;
        return super.visitCmd(ctx);
    }

    @Override
    public Object visitIdentificador(T1Parser.IdentificadorContext ctx) {
        String nomeVar = ctx.getText();
        if (!pilhaDeTabelas.existeSimbolo(nomeVar)) {
            sp.println("Linha " + ctx.start.getLine() + ": identificador " + nomeVar + " nao declarado");
        }
        return super.visitIdentificador(ctx);
    }

    @Override
    public Object visitExpressao(T1Parser.ExpressaoContext ctx) {
        if (ctx.getText().equals("verdadeiro") || ctx.getText().equals("falso")) {
            sp.println("Linha " + ctx.start.getLine() + ": atribuicao nao compativel para " + this.lastParentId);
        }
        return super.visitExpressao(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitChamada_atribuicao(T1Parser.Chamada_atribuicaoContext ctx) {
        T1Parser.CmdContext parent = (T1Parser.CmdContext) ctx.parent;
        String parentId = parent.IDENT().getText();
        int line = parent.start.getLine();
        
        checkIfExists(parentId, line);
        
        this.lastAttributionType = getTypeOf(parentId);
        this.lastParentId = parentId;
        
        return super.visitChamada_atribuicao(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object visitOutros_termos(T1Parser.Outros_termosContext ctx) {
        return super.visitOutros_termos(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public Object visitTermo(T1Parser.TermoContext ctx) {
        String termo = ctx.getText();
        int line = ctx.start.getLine();
        
        if (checkIfExists(termo, line)) {
            String type = getTypeOf(termo);
            if (isAttribution() && this.lastAttributionType != null 
                    && !isArithmetic(termo) && !type.equals(this.lastAttributionType)) {
                sp.println("Linha " + line + ": atribuicao nao compativel para " + this.lastParentId);
            }
        }
        
        return super.visitTermo(ctx);
    }
    
    private boolean isAttribution() {
        return (this.lastCommand == 8 || this.lastCommand == 9);
    }
    
    private boolean checkIfExists(String termo, int line) {
        if (isVariable(termo) && !pilhaDeTabelas.existeSimbolo(termo)) {
            sp.println("Linha " + line + ": identificador " + termo + " nao declarado");
            return false;
        }
        
        return true;
    }
    
    private String getTypeOf(String termo) {
        if (termo.equals("\"falso\"") || termo.equals("\"verdadeiro\"")) {
            return "logico";
        }
        
        if (termo.equals("falso") || termo.equals("verdadeiro")) {
            return "erm";
        }
        
        if (termo.matches("\"[^\"]*\"")) {
            return "literal";
        }
        
        if (termo.matches("^([+-]?[1-9]\\d*|0)$")) {
            return "real";
        }
        
        String type = pilhaDeTabelas.getTipo(termo);
        
        if (type != null && type.equals("inteiro")) {
            return "real";
        }
        
        return type;
    }
    
    private boolean isArithmetic(String valor) {
        return !(valor.indexOf('*') == -1 && valor.indexOf('/') == -1 
                && valor.indexOf('+') == -1 && valor.indexOf('-') == -1
                && valor.indexOf('<') == -1 && valor.indexOf('>') == -1
                && valor.indexOf('(') == -1 && valor.indexOf(')') == -1);
    }
    
    private boolean isVariable(String text) {
        return text.matches("^[a-zA-Z_$][a-zA-Z_$0-9]*$");
    }

    @Override
    public Object visitFator(T1Parser.FatorContext ctx) {
        //System.out.println(ctx.getText());
        return super.visitFator(ctx); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    

    
}
