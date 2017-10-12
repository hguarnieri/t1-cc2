package trab1.project;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.TerminalNode;
import trab1.linguagem.T1BaseListener;
import trab1.linguagem.T1Parser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henrique
 */
public class AnalisadorSemantico3 extends T1BaseListener {
    
    PilhaDeTabelas pilhaDeTabelas = new PilhaDeTabelas();
    List<EntradaTabelaDeSimbolos> tabelaDeSimbolos = new ArrayList();
    SaidaParser sp;
    
    public AnalisadorSemantico3(SaidaParser sp) {
        this.sp = sp;
    }

    @Override
    public void enterPrograma(T1Parser.ProgramaContext ctx) {
        tabelaDeSimbolos.add(new EntradaTabelaDeSimbolos("inteiro", "inteiro"));
        tabelaDeSimbolos.add(new EntradaTabelaDeSimbolos("real", "real"));
        tabelaDeSimbolos.add(new EntradaTabelaDeSimbolos("literal", "literal"));
        tabelaDeSimbolos.add(new EntradaTabelaDeSimbolos("logico", "logico"));
        
        pilhaDeTabelas.empilhar(new TabelaDeSimbolos("global"));
        super.enterPrograma(ctx);
    }

    @Override
    public void exitPrograma(T1Parser.ProgramaContext ctx) {
        pilhaDeTabelas.desempilhar();
        super.exitPrograma(ctx);
    }

    @Override
    public void enterVariavel(T1Parser.VariavelContext ctx) {
        String nomeVar = ctx.IDENT().getText();
        String tipoVar = ctx.tipo().getText();
        int line = ctx.start.getLine();
        
        checkIfTypeExists(tipoVar, line);
        
        addVariable(nomeVar, tipoVar, line);
        
        for (TerminalNode t : ctx.mais_var().IDENT()) {
            String nomeMaisVar = t.getText();
            addVariable(nomeMaisVar, tipoVar, line);
        }
        super.enterVariavel(ctx);
    }

    @Override
    public void enterCmd(T1Parser.CmdContext ctx) {
        int line = ctx.start.getLine();
        if (ctx.comando == 1) {
            String nomeIdent = ctx.identificador().getText();
            
            checkIfExists(nomeIdent, line);
            
            for (T1Parser.IdentificadorContext i : ctx.mais_ident().identificador()) {
                String nomeMaisIdent = i.IDENT().getText();
                checkIfExists(nomeMaisIdent, line);
            }
        } else if (ctx.comando == 2) {
            //System.out.println(ctx.expressao().getText());
            for(T1Parser.ExpressaoContext e : ctx.mais_expressao().expressao()) {
                //System.out.println(e.termo_logico().fator_logico().parcela_logica().exp_relacional().exp_aritmetica().outros_termos().op_adicao());
            }
        }
        super.enterCmd(ctx);
    }

    @Override
    public void enterChamada_atribuicao(T1Parser.Chamada_atribuicaoContext ctx) {
        T1Parser.CmdContext parent = (T1Parser.CmdContext) ctx.parent;
        String attributionVar = parent.IDENT().getText();
        String typeOfAttributionVar = getTypeOfSymbol(attributionVar);
        String primeiroTermo = "";
        boolean isValid = true;
        if (ctx.expressao().termo_logico().fator_logico().parcela_logica().type == 1 ||
                ctx.expressao().termo_logico().fator_logico().parcela_logica().type == 2) {
            if (!typeOfAttributionVar.equals("logico")) {
                isValid = false;
            }
        }
        if (ctx.expressao().termo_logico().fator_logico().parcela_logica().exp_relacional() != null) {
            if (ctx.expressao().termo_logico().fator_logico().parcela_logica().exp_relacional().exp_aritmetica().termo().fator().parcela().parcela_unario() != null) {
                if (ctx.expressao().termo_logico().fator_logico().parcela_logica().exp_relacional().exp_aritmetica().termo().fator().parcela().parcela_unario().tipo_parcela == 2) {
                    primeiroTermo = ctx.expressao().termo_logico().fator_logico().parcela_logica().exp_relacional().exp_aritmetica().termo().fator().parcela().parcela_unario().getText();
                    
                    isValid = typeOfAttributionVar.equals(getTypeOfSymbol(primeiroTermo));
                }
            } else if (ctx.expressao().termo_logico().fator_logico().parcela_logica().exp_relacional().exp_aritmetica().termo().fator().parcela().parcela_unario() != null 
                    && ctx.expressao().termo_logico().fator_logico().parcela_logica().exp_relacional().exp_aritmetica().termo().fator().parcela().parcela_unario().tipo_parcela == 3) {
                if (!typeOfAttributionVar.equals("inteiro")) {
                    isValid = false;
                }
            } else {
                //System.out.println(primeiroTermo);
                if (typeOfAttributionVar.equals("literal")) {
                    isValid = true;
                } else {
                    isValid = false;
                }
            }
            
            // atribuição lógica
            if (ctx.expressao().termo_logico().outros_fatores_logicos().fator_logico().size() > 0
                    && typeOfAttributionVar.equals("logico")) {
                isValid = true;
            }

            //System.out.println(primeiroTermo);

            for (T1Parser.TermoContext t: ctx.expressao().termo_logico().fator_logico().parcela_logica().exp_relacional().exp_aritmetica().outros_termos().termo()) {
                //System.out.println(t.getText());
                if (t.fator().parcela().parcela_nao_unario() != null) { // é uma cadeia
                    if (!typeOfAttributionVar.equals("literal")) {
                        isValid = false;
                    }
                }
                if (t.fator().parcela().parcela_unario() != null && t.fator().parcela().parcela_unario().tipo_parcela == 2) {
                    if (!typeOfAttributionVar.equals(getTypeOfSymbol(t.fator().parcela().parcela_unario().getText()))) {
                        isValid = false;
                    }
                }
                if (t.fator().parcela().parcela_unario() != null && t.fator().parcela().parcela_unario().tipo_parcela == 3) {
                    if (!typeOfAttributionVar.equals("inteiro")) {
                        isValid = false;
                    }
                }
            }
            
        }
        
        if (!isValid) {
            sp.println("Linha " + ctx.start.getLine() + ": atribuicao nao compativel para " + attributionVar);
        }
        
        
        super.enterChamada_atribuicao(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    @Override
    public void enterParcela_unario(T1Parser.Parcela_unarioContext ctx) {
        if (ctx.tipo_parcela == 2) { // variáveis
            checkIfExists(ctx.getText(), ctx.start.getLine());
        }
        super.enterParcela_unario(ctx); //To change body of generated methods, choose Tools | Templates.
    }
    
    private void addVariable(String nomeVar, String tipoVar, int line) {
        if (!pilhaDeTabelas.existeSimbolo(nomeVar)) {
            pilhaDeTabelas.topo().adicionarSimbolo(nomeVar, tipoVar);
        } else {
            sp.println("Linha " + line + ": identificador " + nomeVar + " ja declarado anteriormente");
        }
    }
    
    private String getTypeOfSymbol(String nome) {
        return pilhaDeTabelas.getTipo(nome);
    }
    
    private boolean checkIfExists(String termo, int line) {
        if (!pilhaDeTabelas.existeSimbolo(termo)) {
            sp.println("Linha " + line + ": identificador " + termo + " nao declarado");
            return false;
        }
        
        return true;
    }
    
    private boolean checkIfTypeExists(String nome, int line) {
        if (!existSymbol(nome)) {
            sp.println("Linha " + line + ": tipo " + nome + " nao declarado");
            return false;
        }
        
        return true;
    }
    
    public boolean existSymbol(String nome) {
        for (EntradaTabelaDeSimbolos etds : tabelaDeSimbolos) {
            if (etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    
    
    
    
    
    
    
    
    
    
}
