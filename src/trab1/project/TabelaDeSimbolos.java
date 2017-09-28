/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trab1.project;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class TabelaDeSimbolos {
    private String escopo;
    private List<EntradaTabelaDeSimbolos> simbolos;
    
    public TabelaDeSimbolos(String escopo) {
        simbolos = new ArrayList<EntradaTabelaDeSimbolos>();
        this.escopo = escopo;
    }
    
    public void adicionarSimbolo(String nome, String tipo) {
        simbolos.add(new EntradaTabelaDeSimbolos(nome,tipo));
    }
    
    //para registro
    public void adicionarSimbolo(String nome, String tipo, TabelaDeSimbolos ts) {
        simbolos.add(new EntradaTabelaDeSimbolos(nome,tipo,ts));
    }
    
    public void adicionarSimbolo(String nome, String tipo, String escopo){
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(escopo)){
                etds.getTs().adicionarSimbolo(nome, tipo);
            }
        }
    }
    
    public void adicionarSimbolos(List<String> nomes, String tipo) {
        for(String s:nomes) {
            simbolos.add(new EntradaTabelaDeSimbolos(s, tipo));
        }
    }
    
    public boolean existeSimbolo(String nome, String escopo) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getTipo().equals("registro")){
                if(etds.getTs().escopo.equals(escopo) && etds.getTs().existeSimbolo(nome)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean existeSimbolo(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)){
                return true;
            }
        }
        return false;
    }
    
    
    public ArrayList<String> getSimbolos(String escopo){
        ArrayList<String> nomes = new ArrayList<String>();
        for(EntradaTabelaDeSimbolos etds:simbolos){
            if(etds.getTs() != null && etds.getNome().equals(escopo)){
                return etds.getTs().getSimbolos();
            }
        }
        return null;
    }
    
    
    public ArrayList<String> getSimbolos(){
        ArrayList<String> nomes = new ArrayList<String>();
        for(EntradaTabelaDeSimbolos etds:simbolos){
            nomes.add(etds.getNome());
        }
        return nomes;
    }
    
    
    public String getTipo(String nomeVar, String escopo) {
        for(EntradaTabelaDeSimbolos etds:simbolos){
            if(etds.getTs() != null && etds.getNome().equals(escopo)){
                return etds.getTs().getTipo(nomeVar);
            }
        }
        return null;
    }
    
    public String getTipo(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos){
            if(etds.getNome().equals(nome)){
                return etds.getTipo();
            }
        }
        return null;
    }
    
    @Override
    public String toString() {
        String ret = "Escopo: "+escopo+"{";
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            ret += "\n   "+etds;
        }
        ret += "}\n";
        return ret;
    }
}