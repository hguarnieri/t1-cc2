/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trab1.project;

import java.util.List;
/**
 *
 * @author daniel
 */
public class EntradaTabelaDeSimbolos {
    private String nome, tipo;
    private TabelaDeSimbolos ts;
    
    public EntradaTabelaDeSimbolos(String nome, String tipo) {
        this.nome = nome;
        this.tipo = tipo;
        this.ts = null;
    }
    
    // para registros
    public EntradaTabelaDeSimbolos(String nome, String tipo, TabelaDeSimbolos ts) {
        this.nome = nome;
        this.tipo = tipo;
        this.ts = ts;
    }
    
    
    public String getNome() {
        return nome;
    }
    
    public String getTipo() {
        return tipo;
    }

    public TabelaDeSimbolos getTs() {
        return ts;
    }
    
    @Override
    public String toString() {
        if(getTs() != null)
            return nome+"("+tipo+")"+ts.toString();
        return nome+"("+tipo+")";
    }
}