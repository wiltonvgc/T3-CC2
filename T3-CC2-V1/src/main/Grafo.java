package main;

import java.util.ArrayList;

public class Grafo {

	String nome;
	ArrayList<String> atributos;
	ArrayList<String> tipos_atributos;
	
	public Grafo(String nome){
		this.atributos = new ArrayList<String>();
		this.tipos_atributos = new ArrayList<String>();
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void addAtributos(ArrayList<String> ats){
		this.atributos = ats;
	}
	
	public void addTiposAtributos(ArrayList<String> tipos){
		this.tipos_atributos = tipos;
	}
	
	public ArrayList<String> getAtributos(){
		return this.atributos;
	}
	
	public ArrayList<String> getTiposAtributos(){
		return this.tipos_atributos;
	}
	
}
