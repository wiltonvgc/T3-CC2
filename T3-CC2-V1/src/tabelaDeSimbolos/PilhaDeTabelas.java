/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tabelaDeSimbolos;

import java.util.LinkedList;
import java.util.List;


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
    
    public String getTipo(String nome){
    	EntradaTabelaDeSimbolos e = null;
    	for(TabelaDeSimbolos ts : pilha){
    		if(ts.getEntrada(nome)!=null){
    			e = ts.getEntrada(nome);
    			break;
    		}
    	
    	}
    	
    	String retorno;
    	if(e==null){
    		retorno = "null";
    	}
    	else{
    		retorno = e.getTipo();
    	}
    	return retorno;
    	
    }

    public void desempilhar() {
        TabelaDeSimbolos ret = pilha.pop();
        Saida.println(ret.toString());
    }

    public List getTodasTabelas() {
        return pilha;
    }
    
    public String getNomeEscopoAtual(){
    	TabelaDeSimbolos atual = this.topo();
    	return atual.getNome();
    	
    }
  
    }

