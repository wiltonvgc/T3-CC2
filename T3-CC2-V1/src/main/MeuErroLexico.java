package main;

import java.util.BitSet;


import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import main.SaidaParser;
import main.MeuErroSintatico;

public class MeuErroLexico implements ANTLRErrorListener {
	
	SaidaParser sp;
	static boolean existeErro = false;
	
	public MeuErroLexico(){
		//
	}

	public MeuErroLexico(SaidaParser sp){
		this.sp = sp;
	}
	
	public boolean setExisteErro(){
		existeErro = true;
		return true;
	}
	
	@Override
	public void reportAmbiguity(Parser arg0, DFA arg1, int arg2, int arg3, boolean arg4, BitSet arg5,
			ATNConfigSet arg6) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportAttemptingFullContext(Parser arg0, DFA arg1, int arg2, int arg3, BitSet arg4, ATNConfigSet arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void reportContextSensitivity(Parser arg0, DFA arg1, int arg2, int arg3, int arg4, ATNConfigSet arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void syntaxError(Recognizer<?, ?> arg0, Object o, int line, int arg3, String msg,
			RecognitionException arg5) {
		
		
		
		/* pega caracter não encontrado pela lexico */
		
		int x = msg.indexOf("'");
		char c = msg.charAt(x+1);
		
		/* Coloca no buffer de escrita apenas o primeiro erro */
		if(!existeErro){
			
			if(c == '{'){
				sp.println("Linha " + (line+1)+ ": comentario nao fechado","lexico");
			}
			else{
				sp.println("Linha "+line+": " + c + " - simbolo nao identificado","lexico");
				this.existeErro = true;
			}
			existeErro = true; 
			
			/* avisa que já ocorreu erro lexico a classe sintatica de erro*/
			MeuErroSintatico m = new MeuErroSintatico();
			m.setExisteErro();
			
		}
		
		
	}
	

}
