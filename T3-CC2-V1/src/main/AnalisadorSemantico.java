package main;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import gramatica.LGraphBaseVisitor;
import gramatica.LGraphParser.Arquivo_grafoContext;
import gramatica.LGraphParser.AtribuicaoContext;
import gramatica.LGraphParser.CmdContext;
import gramatica.LGraphParser.ComandosContext;
import gramatica.LGraphParser.CorpoContext;
import gramatica.LGraphParser.DeclaracoesContext;
import gramatica.LGraphParser.EdgesContext;
import gramatica.LGraphParser.InicioContext;
import gramatica.LGraphParser.MetricaContext;
import gramatica.LGraphParser.NodesContext;
import gramatica.LGraphParser.Objeto_metricaContext;
import gramatica.LGraphParser.Parametros_createContext;
import gramatica.LGraphParser.Parametros_nodesContext;
import gramatica.LGraphParser.Parametros_updateContext;
import gramatica.LGraphParser.ProgramaContext;
import gramatica.LGraphParser.Salvar_opcionalContext;
import gramatica.LGraphParser.TipoContext;
import gramatica.LGraphParser.Tipos_tuplaContext;
import gramatica.LGraphParser.Tipos_tupla_opContext;
import gramatica.LGraphParser.TuplaContext;
import gramatica.LGraphParser.Valor_parametroContext;
import gramatica.LGraphParser.VariavelContext;
import tabelaDeSimbolos.PilhaDeTabelas;
import tabelaDeSimbolos.TabelaDeSimbolos;

public class AnalisadorSemantico extends LGraphBaseVisitor<String> {

	ArrayList<String> varsDecl = new ArrayList<String>(); //aux : guarda variaveis de mesmo tipo declaradas	
	TabelaDeSimbolos tab;//tabela de simbolos global
	PilhaDeTabelas pilhaTabs;
	SaidaParser sp;
	
	public AnalisadorSemantico(TabelaDeSimbolos t,SaidaParser sp,PilhaDeTabelas p){
		this.tab = t;
		this.sp = sp;
		this.pilhaTabs = p;
		this.pilhaTabs.empilhar(this.tab);
	}


	@Override
	public String visitPrograma(ProgramaContext ctx) {
	   
	   /* Declaracao de variaveis */
		if(ctx.corpo()!=null && ctx.corpo().declaracoes()!=null)
			visitDeclaracoes(ctx.corpo().declaracoes());
		
	   /* Comandos */
		visitCorpo(ctx.corpo());
	    
		return null;
	}

	@Override
	public String visitCorpo(CorpoContext ctx) {
		
		/* Comandos */
		if(ctx!=null)
			visitComandos(ctx.comandos());
		
		return null;
	}

	@Override
	public String visitDeclaracoes(DeclaracoesContext ctx) {
		
		String tipo;
		
		/* primeiras variavies declaracadas de mesmo tipo */
		tipo = visitVariavel(ctx.dec1);
		insereVariavelTabela(tipo);
		this.varsDecl.clear();
		
		/* outras (se existirem) variveis de mesmo tipo decalradas */
		for(VariavelContext v : ctx.outrasDecs){
			tipo = visitVariavel(v);
			insereVariavelTabela(tipo);
			this.varsDecl.clear();
		}
		
		
		return null;
	}

	/* Metodo que insere variaveis declaradas na tabela de simbolos */
	public void insereVariavelTabela(String tipo){
		
		/* usa lista auxiliar varsDecl */
		for(String v : varsDecl){
			if(!tab.existeSimbolo(v)){
				tab.adicionarSimbolo(v, tipo);
				
			}else{
				sp.println("Erro: Variavel " + v + " já declarada anteriormente", "semantico");
			}
		}
		
	}
	
	
	@Override
	public String visitVariavel(VariavelContext ctx) {
		
		/* guarda em varsDecl variaveis declaradas de MESMO tipo */
		varsDecl.add(ctx.var1.getText());
		for(Token var : ctx.outrasVars){
			varsDecl.add(var.getText());
		}
		
		/* retorna tipo */
		return ctx.t.getText();
		
	}

	@Override
	public String visitComandos(ComandosContext ctx) {
		
		/* percorre lista de comandos feitos */
		for(CmdContext cmd : ctx.cmds){
			visitCmd(cmd);
		}
		
		
		return null;
	}


	@Override
	public String visitCmd(CmdContext ctx) {
		
		int comando=0; // 1 - leitura, 2 - create, 3 - update, 4 - find, 5 - atribuicao, 6 - plot
		
		/* QUAL COMANDO E */
		List<ParseTree> filhos = ctx.children;
		
	if(filhos!=null){
		for(ParseTree p : filhos){
			if(p.getText().equals("read")){
				comando = 1;
			     break;
			}else if(p.getText().equals("create")){
				comando = 2;
			     break;
			}else if(p.getText().equals("update")){
				comando = 3;
			     break;
			}else if(p.getText().equals("find")){
				comando = 4;
			     break;
			}else if(p.getText().equals("=")){
				comando = 5;
			     break;
			}else if(p.getText().equals("plot")){
				comando = 6;
			}
			
			
		}// FIM QUAL COMANDO E
	
		
		
		/* SEMANTICA : Verifica se variaveis passadas para create, read, update, find sao tipo graph e se foram declaradas */
		
		/* CREATE ou READ */
		if(comando==2 || comando==1){
			String id = filhos.get(3).getText();
			
			/* variavel graph nao declarada */
			if(!this.tab.existeSimbolo(id)){
				sp.println("Erro: variavel " + id + " não declarada", "semantico");
			}
			/* variavel nao e tipo graph */
			else if(!this.pilhaTabs.getTipo(id).equals("graph")){
				sp.println("Erro: variavel " + id + " não é do tipo graph", "semantico");
			}
			
		}/* UPDATE ou PLOT */
		else if(comando==3 || comando==6){
			String id = filhos.get(2).getText();
			
			/* variavel graph nao declarada */
			if(!this.tab.existeSimbolo(id)){
				sp.println("Erro: variavel " + id + " não declarada", "semantico");
			}
			/* variavel nao e tipo graph */
			else if(!this.pilhaTabs.getTipo(id).equals("graph")){
				sp.println("Erro: variavel " + id + " não é do tipo graph", "semantico");
			}
			
		}
		/* FIND */
		else if(comando==4){
			String id = visitObjeto_metrica(ctx.objeto_metrica());
			
			/* variavel graph nao declarada */
			if(!this.tab.existeSimbolo(id)){
				sp.println("Erro: variavel " + id + " não declarada", "semantico");
			}
			/* variavel nao e tipo graph */
			else if(!this.pilhaTabs.getTipo(id).equals("graph")){
				sp.println("Erro: variavel " + id + " não é do tipo graph", "semantico");
			}
			
		}
		
	}
		
		/* FIM VERIFICACAO SEMANTICA DE GRAPH EM COMANDOS */
		
		
		/* SEMANTICA : VERIFICACAO DE DECLARACAO DE VARIAVEIS EM ATRIBUICAO */
		if(comando==5){
			
			String var_atribuicao=null;
			if(ctx.IDENT()!=null)
				var_atribuicao = ctx.IDENT().getText();//variavel que recebe o valor
			
			/* Verifica se var_atribuicao ja foi declarada */
			if(!this.pilhaTabs.existeSimbolo(var_atribuicao)){
				sp.println("Erro: variavel " + var_atribuicao + " não declarada", "semantico");
			}
			
			/* Verifica se variavel atribuida ja foi declarada */
			String var = visitAtribuicao(ctx.atribuicao());
			if(var!=null && var!="int" && var!="real" && var!="edges" && var!="nodes" && var!="string"){
				if(!this.pilhaTabs.existeSimbolo(var)){
					sp.println("Erro: variavel " + var + " não declarada", "semantico");
				}
			}
			
		}//FIM VERIFICAO SEMANTICA DECLARACAODE VARIAVEIS EM ATRBUICAO
		
		/* SEMANTICA : VERIFICACAO DE COMPATIBILIDADE EM ATRIBUICAO */
		if(comando==5){
			
			String var_atribuicao=null;
			
			if(ctx.IDENT()!=null)
				var_atribuicao = ctx.IDENT().getText();//variavel que recebe o valor
			
			String tipo_var_atr = this.pilhaTabs.getTipo(var_atribuicao);
			
			
			
			String t = visitAtribuicao(ctx.atribuicao());
			
			
			if(t=="int"){
				if(!tipo_var_atr.equals(t)){
					sp.println("Erro: incompatibilidade de tipo em atribuicao de " + var_atribuicao, "semantico");
				}
				
			}else if(t=="real"){
				if(!tipo_var_atr.equals("float")){
					sp.println("Erro: incompatibilidade de tipo em atribuicao de " + var_atribuicao, "semantico");
				}
				
			}else if(t=="edges"){
				if(!tipo_var_atr.equals(t)){
					sp.println("Erro: incompatibilidade de tipo em atribuicao de " + var_atribuicao, "semantico");
				}
				
				
			}else if(t=="nodes"){
				if(!tipo_var_atr.equals(t)){
					sp.println("Erro: incompatibilidade de tipo em atribuicao de " + var_atribuicao, "semantico");
				}
				
				
			}else if(t=="string"){
				if(!tipo_var_atr.equals(t)){
					sp.println("Erro: incompatibilidade de tipo em atribuicao de " + var_atribuicao, "semantico");
				}
				
			}else{
				//IDENT
				 t = this.pilhaTabs.getTipo(t);
				if(!tipo_var_atr.equals(t)){
					sp.println("Erro: incompatibilidade de tipo em atribuicao de " + var_atribuicao, "semantico");
				}
				
			}
			
		}	/* FIM DE VERIFICACAO DE COMPATIBILIDADE EM ATRIBUICAO */
		
		/* SEMANTICO : VERIFICAO DE COMPATIBILIDADE DE PARAMETROS EM CREATE */
		if(comando==2){
			visitParametros_create(ctx.parametros_create());
		}
		

		/* SEMANTICO : VERIFICAO DE COMPATIBILIDADE DE PARAMETROS EM UPDATE */
		if(comando==3){
			visitParametros_update(ctx.parametros_update());
		}
		
		
		
		
		
		return null;
	}
	
	@Override
	public String visitParametros_create(Parametros_createContext ctx) {
		
		/* Pega tipo parametro 1 */
		String tipo1 = visitValor_parametro(ctx.v1);
		
		
		/* Pega tipo parametro 2 */
		String tipo2 = visitValor_parametro(ctx.v2);
		
		
		/* Pega tipo parametro 3 */
		String tipo3 = visitValor_parametro(ctx.v3);
		
		if(!tipo1.equals("int") && !tipo1.equals("real") && !tipo1.equals("string")){
			//E IDENT
			tipo1= this.pilhaTabs.getTipo(tipo1);
		}
		
		if(!tipo2.equals("int") && !tipo2.equals("real") && !tipo2.equals("string")){
			//E IDENT
			tipo2= this.pilhaTabs.getTipo(tipo2);
		}
		
		if(!tipo3.equals("int") && !tipo3.equals("real") && !tipo3.equals("string")){
			//E IDENT
			tipo3= this.pilhaTabs.getTipo(tipo3);
		}
		
		/* Verifica compatibilidade entre parametros */
		/* TYPE */
		if(!tipo1.equals("string")){
			sp.println("Erro: incompatibilidade de tipo em parametro type de create","semantico");		
		}
		/* NODES */
		if(!tipo2.equals("nodes")){
			sp.println("Erro: incompatibilidade de tipo em parametro nodes de create","semantico");		
		}
		/* EDGES */
		if(!tipo3.equals("edges")){
			sp.println("Erro: incompatibilidade de tipo em parametro edges de create","semantico");		
		}
		
		/* verifica em TYPE se tipo de grafo e valido */
		ArrayList<String> tipos_grafos = new ArrayList<String>();
		tipos_grafos.add("multi");
		tipos_grafos.add("digraph");
		
		if(ctx.v1.STRING()!=null){
			
			for(String tipo : tipos_grafos){
				if(ctx.v1.STRING().getText().equals("\"" + tipo + "\"")){
					break;
				}
				sp.println("Erro: " + ctx.v1.STRING().getText() + " não é um tipo de grafo válido", "semantico");
				
			}
		}
		
		return null;
	}
	
	@Override
	public String visitParametros_update(Parametros_updateContext ctx) {
		

		/* Pega tipo parametro 1 */
		String tipo1 = visitValor_parametro(ctx.v1);
		
		
		/* Pega tipo parametro 2 */
		String tipo2 = visitValor_parametro(ctx.v2);
		
		if(!tipo1.equals("int") && !tipo1.equals("real") && !tipo1.equals("string")){
			//E IDENT
			tipo1= this.pilhaTabs.getTipo(tipo1);
		}
		
		if(!tipo2.equals("int") && !tipo2.equals("real") && !tipo2.equals("string")){
			//E IDENT
			tipo2= this.pilhaTabs.getTipo(tipo2);
		}
		
		/* Verifica compatibilidade entre parametros */
		/* NODES */
		if(!tipo1.equals("nodes")){
			sp.println("Erro: incompatibilidade de tipo em parametro nodes de update","semantico");		
		}
		/* EDGES */
		if(!tipo2.equals("edges")){
			sp.println("Erro: incompatibilidade de tipo em parametro edges de update","semantico");		
		}
		
		return null;
	}
	
	@Override
	public String visitValor_parametro(Valor_parametroContext ctx) {
		
		String tipo=null;
		
		if(ctx.NUM_INT()!=null)
			tipo = "int";
		else if(ctx.NUM_REAL()!=null)
			tipo = "real";
		else if(ctx.IDENT()!=null){
			tipo = ctx.IDENT().getText();
			if(!this.pilhaTabs.existeSimbolo(tipo)){
				sp.println("Erro: variavel " + tipo + " não declarada", "semantico");
			}
		}
		else if(ctx.STRING()!=null)
			tipo = "string";
		
		
		return tipo;
	}
	
	
	@Override
	public String visitAtribuicao(AtribuicaoContext ctx) {
		
		/* Retorna nome variavel atribuida se existe, senao retorna tipo */
		
		String var = null;
		
		/* CASO SEJA IDENT */
		if(ctx.IDENT()!=null)
			var = ctx.IDENT().getText();
		else if(ctx.NUM_INT()!=null)
			var = "int";
		else if(ctx.NUM_REAL()!=null)
			var = "real";
		else if(ctx.edges()!=null)
			var = "edges";
		else if(ctx.nodes()!=null)
			var = "nodes";
		else if(ctx.STRING()!=null)
			var = "string";
		
		return var;
	}
	
	@Override
	public String visitObjeto_metrica(Objeto_metricaContext ctx) {
		
		String grafo_id=null;
		boolean vertex = false;
		
		/* pega variavel graph */
		List<ParseTree> filhos = ctx.children;
	
		
		/* Verifica se e metrica de vertex ou graph */
		for(ParseTree p : filhos){
			if(p.getText().equals("vertex")){
				vertex = true;
				break;
			}
		}
		
		/* Pega nome grafo passado */
		if(vertex && filhos.size()>=5){
			grafo_id = filhos.get(4).getText();
		}else{
			grafo_id = filhos.get(1).getText();
			
		}
		
		
		return grafo_id;
	}

	@Override
	public String visitSalvar_opcional(Salvar_opcionalContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSalvar_opcional(ctx);
	}

	@Override
	public String visitArquivo_grafo(Arquivo_grafoContext ctx) {
		// TODO Auto-generated method stub
		return super.visitArquivo_grafo(ctx);
	}

	@Override
	public String visitMetrica(MetricaContext ctx) {
		// TODO Auto-generated method stub
		return super.visitMetrica(ctx);
	}







	@Override
	public String visitTipo(TipoContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTipo(ctx);
	}



	@Override
	public String visitEdges(EdgesContext ctx) {
		// TODO Auto-generated method stub
		return super.visitEdges(ctx);
	}

	@Override
	public String visitTupla(TuplaContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTupla(ctx);
	}

	@Override
	public String visitTipos_tupla(Tipos_tuplaContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTipos_tupla(ctx);
	}

	@Override
	public String visitTipos_tupla_op(Tipos_tupla_opContext ctx) {
		// TODO Auto-generated method stub
		return super.visitTipos_tupla_op(ctx);
	}

	@Override
	public String visitParametros_nodes(Parametros_nodesContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParametros_nodes(ctx);
	}

	@Override
	public String visitNodes(NodesContext ctx) {
		// TODO Auto-generated method stub
		return super.visitNodes(ctx);
	}

	



	
}
