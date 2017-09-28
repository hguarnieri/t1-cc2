/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package trab1.project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class PilhaDeTabelas {

    private LinkedList<TabelaDeSimbolos> pilha;

    public PilhaDeTabelas() {
        pilha = new LinkedList<TabelaDeSimbolos>();
    }

    public void empilhar(TabelaDeSimbolos ts) {
        pilha.push(ts);
    }

    public TabelaDeSimbolos topo() {
        return pilha.peek();
    }

    public boolean existeSimbolo(String nome) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome)) {
                return true;
            }
        }
        return false;
    }
    
    
    public boolean existeSimbolo(String nome, String escopo) {
        for (TabelaDeSimbolos ts : pilha) {
            if (ts.existeSimbolo(nome, escopo)) {
                return true;
            }
        }
        return false;
    }
    
    public ArrayList<String> getSimbolos(String escopo){
        ArrayList<String> resposta = new ArrayList<String>();
        for (TabelaDeSimbolos ts : pilha){
            if(ts.getSimbolos(escopo) != null){
                resposta.addAll(ts.getSimbolos(escopo));
            }
        }
        return resposta;
    }
    
    public ArrayList<String> getSimbolos(){
        ArrayList<String> resposta = new ArrayList<String>();
        for (TabelaDeSimbolos ts : pilha){
            resposta.addAll(ts.getSimbolos());
        }
        return resposta;
    }
    
    public String getTipo(String nome, String escopo){
        for (TabelaDeSimbolos ts: pilha){
            if(ts.getTipo(nome, escopo) != null){
                return ts.getTipo(nome, escopo);
            }
        }
        return null;
    }
    
    public String getTipo(String nome){
        for (TabelaDeSimbolos ts: pilha){
            if(ts.getTipo(nome) != null){
                return ts.getTipo(nome);
            }
        }
        return null;
    }
    
    public void desempilhar() {
        pilha.pop();
    }

    public List getTodasTabelas() {
        return pilha;
    }
}