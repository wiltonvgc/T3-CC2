package main;

import java.util.ArrayList;

public class Nodes {
	private String nome;
	private ArrayList<String> parametros;
	private ArrayList<String> tipos_parametros;
	
	public Nodes(String n){
		this.nome = n;
		this.parametros = new ArrayList<String>();
		this.tipos_parametros = new ArrayList<String>();
	}
	
	public void addAtributos(ArrayList<String> pars){
		
		for(String par : pars)
			this.parametros.add(par);
		
	}
	
	public void addTiposAtributos(ArrayList<String> tipos){
		for(String t: tipos)
			this.tipos_parametros.add(t);
	}
	
	public ArrayList<String> getTiposAtributos(){
		return this.tipos_parametros;
	}
	
	public ArrayList<String> getAtributos(){
		return this.parametros;
	}
	
	public String getTipoAtributo(String at){
		
		String tipo=null;
		
		for(String s: this.parametros){
			if(s.equals(at)){
				int i = this.parametros.indexOf(s);
				tipo = this.tipos_parametros.get(i);
			}
		}
		
		
		return tipo;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void imprimeAtributos(){
		
		int i = 0;
		for(String at : this.parametros){
			
			String tipo = this.tipos_parametros.get(i);
			i = i +1;
			System.out.println("At: " + at + " Tipo : " + tipo);
			
		}
		
		
		
	}
	
	
}
