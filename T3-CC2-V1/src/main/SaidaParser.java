package main;

public class SaidaParser {

    StringBuffer conteudo;
    StringBuffer sintaticos;
    StringBuffer semanticos;
    boolean modificadoSemantico;
    boolean modificadoSintatico;
   
    

    public SaidaParser() {
        sintaticos = new StringBuffer();
        semanticos = new StringBuffer();
        modificadoSemantico = false;
        modificadoSintatico = false;
        
    }

    public void println(String texto,String origem) {
    	    
    	if(origem.equals("semantico")){
    		modificadoSemantico = true;
    		semanticos.append(texto);
    		semanticos.append("\n");
    		Principal.setErroSem();
    	}
    	else if(origem.equals("sintatico") || origem.equals("lexico")) { 
    		modificadoSintatico = true;
    		sintaticos.append(texto);
    		sintaticos.append("\n");
    		Principal.setErroSint();
        }
    	
    	else{
    		
    	}
    	
    	//conteudo.append(texto);
		//conteudo.append("\n");
    }
    
    public void print(String texto,String origem) {
        
    	if(origem.equals("semantico")){
    		modificadoSemantico = true;
    		semanticos.append(texto);
    		//Principal.setErroSintSem();
    		
    	}
    	else if(origem.equals("sintatico") || origem.equals("lexico")) { 
    		modificadoSintatico = true;
    		sintaticos.append(texto);
    		//Principal.setErroSintSem();
        }
    	
    	else{
    		
    	}
    	
    
    		//conteudo.append(texto);
       
        
      
    }

    public boolean isModificadoSemantico() {
        return modificadoSemantico;
    }
    
    public boolean isModificadoSintatico(){
    	return modificadoSintatico;
    }
    @Override
    public String toString() {
    	
    	if(sintaticos.length()>0){
    		conteudo = sintaticos;
    		sintaticos.append("Fim da compilacao");
    	}
    	else{
    		conteudo = semanticos;
    		semanticos.append("Fim da compilacao");
    	}
    	
    	return conteudo.toString();
       
    
    }
}