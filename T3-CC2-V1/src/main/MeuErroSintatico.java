package main;

import java.text.ParseException;
import java.util.BitSet;
import org.antlr.v4.runtime.misc.ParseCancellationException;


import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.Recognizer;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.atn.ATNConfigSet;
import org.antlr.v4.runtime.dfa.DFA;

import gramatica.LGraphLexer;

public class MeuErroSintatico implements ANTLRErrorListener {

	SaidaParser sp;
	static boolean existeErro = false;
	
	public MeuErroSintatico(){
		//
	}
	public MeuErroSintatico(SaidaParser sp) {
		this.sp = sp;
	}
	
	public static boolean setExisteErro(){
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
	public void syntaxError(Recognizer<?, ?> arg0, Object o, int linha, int coluna, String arg4,
			RecognitionException arg5) {
		Token tk = (Token)o;
		
		

		
		
		/* Coloca no buffer de escrita apenas o primeiro erro */
		if(!existeErro){
			
			//problema com EOF (não pode ser <EOF>)
			if(tk.getText().equals("<EOF>")){
				//sp.println("Linha "+linha+": erro sintatico proximo a "+"EOF","sintatico");
			}
			else{
				sp.println("Linha "+linha+": erro sintatico proximo a "+tk.getText(),"sintatico");
			}
			existeErro = true;
			
			/* avisa que já ocorreu erro sintatico a classe lexica de erro */
			MeuErroLexico l = new MeuErroLexico();
			l.setExisteErro();
			
		}
		
		
		
	}
}

