package main;

public class SaidaGerador {

    StringBuffer conteudo;
    boolean modificado;

    public SaidaGerador() {
        conteudo = new StringBuffer();
        modificado = false;
    }

    public void println(String texto) {
        if(!modificado) modificado = true;
        conteudo.append(texto);
        conteudo.append("\n");
    }
    
    public boolean isModificado() {
        return modificado;
    }
    
    public void apaga(){
    	conteudo.delete(0, conteudo.length()-1);
    }

    @Override
    public String toString() {
        return conteudo.toString();
    }
}
