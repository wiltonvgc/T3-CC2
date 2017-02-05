package main;

import java.util.ArrayList;

public class SetNodes {

	private String nome;
	private ArrayList<String> ids_nodes;
	private ArrayList<String> atributos_nodes;
	private ArrayList<String> valores_atributos;
	
	public SetNodes(String nome){
		this.ids_nodes = new ArrayList<String>();
		this.atributos_nodes = new ArrayList<String>();
		this.valores_atributos = new ArrayList<String>();
		this.nome = nome;
	}
	
	public void add(String id, String at, String v){
		this.ids_nodes.add(id);
		this.atributos_nodes.add(at);
		this.valores_atributos.add(v);
	}
	
	public String getNome(){
		return this.nome;
	}
	
	
	public ArrayList<String> getIds(){
		return this.ids_nodes;
	}
	

	public ArrayList<String> getAtributos(){
		return this.atributos_nodes;
	}
	

	public ArrayList<String> getValoresAtributos(){
		return this.valores_atributos;
	}
	
	
	
	
}
