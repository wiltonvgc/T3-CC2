package main;


import java.util.List;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;

import gramatica.*;
import gramatica.LGraphParser.InicioContext;
import gramatica.LGraphParser.ProgramaContext;
import tabelaDeSimbolos.PilhaDeTabelas;
import tabelaDeSimbolos.TabelaDeSimbolos;
public class Principal {
	
	private static boolean erroSem=false,erroSint=false;
	
	public static void setErroSem(){
		erroSem = true;
	}
	public static void setErroSint(){
		erroSint = true;
	}
	
	public static void main(String [] args) throws IOException{
		String path = "/home/wilton/Projetos-Eclipse/T3-CC2-V1/src/teste/teste1";
		String out = "/home/wilton/Projetos-Eclipse/T3-CC2-V1/src/teste/SaidaSintatico/teste1.txt";
		String outGerador = "/home/wilton/Projetos-Eclipse/T3-CC2-V1/src/teste/SaidaGerador/saida1.py";
		
		/* Saida para erro Lexico ou Sintatico */
		SaidaParser sp = new SaidaParser();
		
		
		/* Lexico */
		 FileInputStream fis = new FileInputStream(path);
        ANTLRInputStream ais = new ANTLRInputStream(fis); 
        LGraphLexer lex = new LGraphLexer(ais);
        MeuErroLexico l = new MeuErroLexico(sp);
        lex.addErrorListener(l);
       
        /* Cria tabela de Simbolos */
        TabelaDeSimbolos tab = new TabelaDeSimbolos("global");
        PilhaDeTabelas pilha = new PilhaDeTabelas();
        
		/* Sintatico */
        CommonTokenStream tokens = new CommonTokenStream(lex); 
        
        LGraphParser parser = new LGraphParser(tokens); 
        MeuErroSintatico s = new MeuErroSintatico(sp);
        parser.addErrorListener(s);
        
        	
       /* Semantico */
       InicioContext arvore = parser.inicio();
        
        AnalisadorSemantico sem = new AnalisadorSemantico(tab,sp,pilha);
        sem.visitInicio(arvore);
        
       /* Geracao de codigo para Python */
        /* Se nao ocorreu erro Semantico e Sintatico e Lexico*/
        if(!erroSint && !erroSem){
        	//geracao de codigo 
        	SaidaGerador sg = new SaidaGerador();
        	
        	GeradorDeCodigo gdc = new GeradorDeCodigo(sg,pilha);
        	gdc.visitInicio(arvore);
        	  
            PrintWriter pw = new PrintWriter(outGerador);
     		  pw.println(sg.toString());
     		  pw.close();
     		  
     		 Runtime run = Runtime.getRuntime();
     		 run.exec("python " + outGerador);
        	
        }
        else{
        	/* Escrita arquivo erro Lexico ou Sintatico */
            PrintWriter pw = new PrintWriter(out);
     		  pw.println(sp.toString());
     		  pw.close();
        }
        
        
        
     	
		
	}
}
