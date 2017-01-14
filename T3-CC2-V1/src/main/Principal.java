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
import tabelaDeSimbolos.TabelaDeSimbolos;
public class Principal {

	
	public static void main(String [] args) throws IOException{
		String path = "/home/wilton/Projetos-Eclipse/T3-CC2-V1/src/teste/teste1";
		String out = "/home/wilton/Projetos-Eclipse/T3-CC2-V1/src/teste/SaidaSintatico/teste1.txt";
		
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
        
        
		/* Sintatico */
        CommonTokenStream tokens = new CommonTokenStream(lex); 
        
        LGraphParser parser = new LGraphParser(tokens); 
        MeuErroSintatico s = new MeuErroSintatico(sp);
        parser.addErrorListener(s);
        
        
    
        
        /* Semantico */
        InicioContext arvore = parser.inicio();
        
        AnalisadorSemantico sem = new AnalisadorSemantico(tab,sp);
        sem.visitInicio(arvore);
        
        
        
        /* Escrita arquivo erro Lexico ou Sintatico */
        PrintWriter pw = new PrintWriter(out);
 		  pw.println(sp.toString());
 		  pw.close();
		
		
	}
}
