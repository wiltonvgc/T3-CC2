/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelaDeSimbolos;

import java.util.ArrayList;
import java.util.List;

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
    
    public void adicionarSimbolos(List<String> nomes, String tipo) {
        for(String s:nomes) {
            simbolos.add(new EntradaTabelaDeSimbolos(s, tipo));
        }
    }
    
    public ArrayList<String> getSimbolos(){
    	ArrayList<String> nomes = new ArrayList<String>();
    	for(EntradaTabelaDeSimbolos etds : simbolos){
    		nomes.add(etds.getNome());
    	}
    	return nomes;
    }
    
    public String getNome(){
    	return this.escopo;
    	
    }
    
    public boolean existeSimbolo(String nome) {
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                return true;
            }
        }
        return false;
    }
    public EntradaTabelaDeSimbolos getEntrada(String nome) {
    	EntradaTabelaDeSimbolos td = null;
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            if(etds.getNome().equals(nome)) {
                td = etds;
            }
        }
        return td;
    }
   
    @Override
    public String toString() {
        String ret = "Escopo: "+escopo;
        for(EntradaTabelaDeSimbolos etds:simbolos) {
            ret += "\n   "+etds;
        }
        return ret;
    }
}
