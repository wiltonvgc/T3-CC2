package main;


import java.util.List;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Token;
import org.omg.SendingContext.RunTime;

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
		
		/* Cria pasta para conter arquivos gerados pela compilacao */
	    
		
        File f = new File("LGraph");
       
        /* Apagar arquivos do diretorio caso ele ja exista para nova compilacao */
        if(f.exists()){
        	if(f.isDirectory()){
        		File[] files = f.listFiles();
        		for(File arq : files){
        			arq.delete();
        		}
        	}
        }
        
        f.mkdir();
        String out = f.getCanonicalPath()+"/erro.txt";
        String outGerador = f.getCanonicalPath()+"/geradoPython.py";
	
		
        
		//String path = "/home/wilton/Projetos-Eclipse/T3-CC2-V1/src/teste/teste6.lgraph";
		//String out = "/home/wilton/Projetos-Eclipse/T3-CC2-V1/src/teste/SaidaSintatico/teste1.txt";
		//String outGerador = "/home/wilton/Projetos-Eclipse/T3-CC2-V1/src/teste/SaidaGerador/saida1.py";
		
        String path = args[0];
        
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
        	
        	GeradorDeCodigo gdc = new GeradorDeCodigo(sg,pilha,f.getCanonicalPath());
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
