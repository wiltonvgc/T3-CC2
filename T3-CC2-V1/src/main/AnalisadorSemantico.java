package main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ErrorNode;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.omg.IOP.TAG_RMI_CUSTOM_MAX_STREAM_FORMAT;

import gramatica.LGraphBaseVisitor;
import gramatica.LGraphParser.Arquivo_grafoContext;
import gramatica.LGraphParser.AtribuicaoContext;
import gramatica.LGraphParser.Atribuicao_forContext;
import gramatica.LGraphParser.Atributos_nodes_vContext;
import gramatica.LGraphParser.CmdContext;
import gramatica.LGraphParser.ComandosContext;
import gramatica.LGraphParser.Comandos_forContext;
import gramatica.LGraphParser.Comandos_ifContext;
import gramatica.LGraphParser.CorpoContext;
import gramatica.LGraphParser.Corpo_elseContext;
import gramatica.LGraphParser.Corpo_forContext;
import gramatica.LGraphParser.Corpo_ifContext;
import gramatica.LGraphParser.DeclaracoesContext;
import gramatica.LGraphParser.EdgesContext;
import gramatica.LGraphParser.Exp_igualdadeContext;
import gramatica.LGraphParser.Exp_relacionalContext;
import gramatica.LGraphParser.Expressao_ifContext;
import gramatica.LGraphParser.ImprimirContext;
import gramatica.LGraphParser.InicioContext;
import gramatica.LGraphParser.Mais_expContext;
import gramatica.LGraphParser.MetricaContext;
import gramatica.LGraphParser.NodesContext;
import gramatica.LGraphParser.Nodes_atributosContext;
import gramatica.LGraphParser.Nodes_atributos_atribuicaoContext;
import gramatica.LGraphParser.Objeto_metricaContext;
import gramatica.LGraphParser.Op_igualdadeContext;
import gramatica.LGraphParser.Op_relacionalContext;
import gramatica.LGraphParser.Parametros_createContext;
import gramatica.LGraphParser.Parametros_nodesContext;
import gramatica.LGraphParser.Parametros_updateContext;
import gramatica.LGraphParser.ProgramaContext;
import gramatica.LGraphParser.Salvar_opcionalContext;
import gramatica.LGraphParser.TipoContext;
import gramatica.LGraphParser.Tipo_atributo_nodeContext;
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
	ArrayList<String> grafos_criados;//guarda nome dos grafos criados com CREATE
	ArrayList<Nodes> nodes_atributos;//guarda nodes com atributos criados
	ArrayList<String> nodes_atributos_aux; //lista auxiliar que guarda tipos nodes com atributos
	String var_at,grafo_for,grafo_create;
	ArrayList<Grafo> grafos;
	
	public AnalisadorSemantico(TabelaDeSimbolos t,SaidaParser sp,PilhaDeTabelas p){
		this.tab = t;
		this.sp = sp;
		this.pilhaTabs = p;
		this.pilhaTabs.empilhar(this.tab);
		this.grafos_criados = new ArrayList<String>();
		nodes_atributos = new ArrayList<Nodes>();
		this.nodes_atributos_aux = new ArrayList<String>();
		this.grafos = new ArrayList<Grafo>();
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
		
		String retorno=null;
		
		/* guarda em varsDecl variaveis declaradas de MESMO tipo */
		varsDecl.add(ctx.var1.getText());
		
		if(ctx.nt!=null){
			this.nodes_atributos_aux.add(ctx.var1.getText());
		}
		
		for(Token var : ctx.outrasVars){
			varsDecl.add(var.getText());
			
			
			/* se for tipo nodes COM atributos */
			if(ctx.nt!=null){
				this.nodes_atributos_aux.add(var.getText());
			}
			
		}	
		
		
		
		
		/* retorna tipo */
		if(ctx.t!=null)
			retorno = ctx.t.getText();//tipos sem atributos
		else if(ctx.nt!=null){
			retorno = visitNodes_atributos(ctx.nt); //tipo nodes com atributos
		}
		
	
		
		return retorno;
	}

	@Override
	public String visitNodes_atributos(Nodes_atributosContext ctx) {
		
		ArrayList<String> atributos = new ArrayList<String>();
		ArrayList<String> tipos_atributos = new ArrayList<String>();
		
		/* Cria lista de atributos de no */
		String par1 = ctx.at1.getText();//id atributo 1
		atributos.add(par1);
		
	
		
		for(Token par : ctx.ats){
			atributos.add(par.getText());//outros (?) atributos
			
		}
		
		/* Cria lista de tipos dos atributos de nos */
		String tipo_at1 = visitTipo_atributo_node(ctx.tan1);
		
		tipos_atributos.add(tipo_at1);
		String out_tipos;
		
		for(Tipo_atributo_nodeContext t : ctx.tans){
			out_tipos = visitTipo_atributo_node(t);
			tipos_atributos.add(out_tipos);
		}
		
		
		
		for(String id_node : this.nodes_atributos_aux){
			Nodes n = new Nodes(id_node);
			n.addAtributos(atributos);
			n.addTiposAtributos(tipos_atributos);
			this.nodes_atributos.add(n);
		}
		
		this.nodes_atributos_aux.clear();
	
		
		
		
		return "nodes_com_atributos";
	}


	@Override
	public String visitTipo_atributo_node(Tipo_atributo_nodeContext ctx) {
	
		return ctx.getText();
	}


	@Override
	public String visitComandos(ComandosContext ctx) {
		
		/* percorre lista de comandos feitos */
		for(CmdContext cmd : ctx.cmds){
			if(cmd!=null)
				visitCmd(cmd);
		}
		
		
		return null;
	}


	@Override
	public String visitCmd(CmdContext ctx) {
		
		int comando=0; // 1 - leitura, 2 - create, 3 - update, 4 - find, 5 - atribuicao,7-foreach, 6 - plot, 8 - print
		
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
			}else if(p.getText().equals("foreach")){
				comando = 7;
			}else if(ctx.imprimir()!=null){
				comando = 8;
			}
			
			
		}// FIM QUAL COMANDO E
	
		
		
		/* SEMANTICA : Verifica se variaveis passadas para create, read, update, find sao tipo graph e se foram declaradas */
		
		/* CREATE ou READ */
		if(comando==2 || comando==1){
			this.grafo_create = ctx.id_grafo.getText();
			
			String id = filhos.get(3).getText();
			
			/* variavel graph nao declarada */
			if(!this.tab.existeSimbolo(id)){
				sp.println("Erro: variavel " + id + " não declarada", "semantico");
			}
			/* variavel nao e tipo graph */
			else if(!this.pilhaTabs.getTipo(id).equals("graph")){
				sp.println("Erro: variavel " + id + " não é do tipo graph", "semantico");
			}
			/* grafo de mesmo nome ja criado */
			else if(this.grafos_criados.contains(id)){
				sp.println("Erro: grafo " + id + " já criado", "semantico");
			}else{
				this.grafos_criados.add(id);
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
			/* verifica se grafo ja foi criado com create */
			else if(!this.grafos_criados.contains(id)){
				sp.println("Erro: grafo " + id + " não criado", "semantico");
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
		/* FOREACH */
		else if(comando==7){
			
			
			String id_grafo = ctx.g_id.getText();
			this.grafo_for = id_grafo;
			
			String id_vert = ctx.id.getText();
			
			/* variavel graph nao declarada */
			if(!this.tab.existeSimbolo(id_grafo)){
				sp.println("Erro: variavel " + id_grafo + " não declarada", "semantico");
			}
			/* variavel nao e tipo graph */
			else if(!this.pilhaTabs.getTipo(id_grafo).equals("graph")){
				sp.println("Erro: variavel " + id_grafo + " não é do tipo graph", "semantico");
			}
			
			/* verifica se variavel a ser o vertice no loop ja existe */
			
			/* variavel id_vert ja declarada */
			if(this.tab.existeSimbolo(id_vert)){
				sp.println("Erro: variavel " + id_vert + " já declarada", "semantico");
			}else{
				//declara
				this.tab.adicionarSimbolo(id_vert, "vertice_loop");
			}
			
			if(ctx.corpo_for()!=null){
				visitCorpo_for(ctx.corpo_for());
			}
			
			
		}//FIM FOR EACH
		
	}
		
		/* FIM VERIFICACAO SEMANTICA DE GRAPH EM COMANDOS */
		
		
		/* SEMANTICA : VERIFICACAO DE DECLARACAO DE VARIAVEIS EM ATRIBUICAO */
		if(comando==5){
			
			String var_atribuicao=null;
			if(ctx.IDENT()!=null)
				var_atribuicao = ctx.id1.getText();//variavel que recebe o valor
			
			/* Verifica se var_atribuicao ja foi declarada */
			if(!this.pilhaTabs.existeSimbolo(var_atribuicao)){
				sp.println("Erro: variavel " + var_atribuicao + " não declarada", "semantico");
			}
			
			/* Verifica se variavel atribuida ja foi declarada */
			String var = visitAtribuicao(ctx.atribuicao());
			if(var!=null && var!="int" && var!="real" && var!="edges" && var!="nodes" && var!="string" && var!="nodes_com_atributos"){
				if(!this.pilhaTabs.existeSimbolo(var)){
					sp.println("Erro: variavel " + var + " não declarada", "semantico");
				}
			}
			
		}//FIM VERIFICAO SEMANTICA DECLARACAODE VARIAVEIS EM ATRBUICAO
		
		/* SEMANTICA : VERIFICACAO DE COMPATIBILIDADE EM ATRIBUICAO */
		if(comando==5){
			
			String var_atribuicao=null;
			
			if(ctx.IDENT()!=null)
				var_atribuicao = ctx.id1.getText();//variavel que recebe o valor
			
			this.var_at = var_atribuicao;
			
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
				
			}
			else if(t.equals("nodes_com_atributos")){
				if(!tipo_var_atr.equals(t)){
					sp.println("Erro: incompatibilidade de tipo em atribuicao de " + var_atribuicao, "semantico");
				}
			}
			
			else{
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
		
		/* Verificacao de parametro de caminho de arquivo em READ */
		if(comando==1){
			
			String path=null;//caminho do arquivo - IDENT STRING ou STRING PURA
			if(ctx.arquivo_grafo()!=null)
				path = visitArquivo_grafo(ctx.arquivo_grafo());
			
			if(path!=null && path.contains("\"")){
				//STRING PURA
				
			}else{
				//IDENT
				/* variavel path nao declarada */
				if(!this.tab.existeSimbolo(path)){
					sp.println("Erro: variavel " + path + " não declarada", "semantico");
				}
				
				/* verifica se path e do tipo string */
				else if(!this.pilhaTabs.getTipo(path).equals("string")){
					sp.println("Erro: caminho de arquivo " + path + " não é tipo string", "semantico");
					
				}/* grafo de mesmo nome ja criado */
				else if(this.grafos_criados.contains(ctx.id_gf.getText())){
					sp.println("Erro: grafo " + ctx.id_gf.getText() + " já criado", "semantico");
				}else{
					this.grafos_criados.add(ctx.id_gf.getText());
				}
				
			}
			
		}//READ
		
		/* PERTINENCIA DE METRICA PARA GRAFO OU VERTICE */
		if(comando==4){
			String metrica = visitMetrica(ctx.metrica());
			
			/* SE FOR GRAFO */
			if(ctx.objeto_metrica()!=null && ctx.objeto_metrica().id_graph!=null){
				
			}
			/* SE E VERTICE */
			else if(ctx.objeto_metrica()!=null && ctx.objeto_metrica().id_vert!=null){
				/* CENTRALITY SO SE APLICA A GRAFOS , NAO A NOS INDIVIDUAL */
				if(metrica.equals("centrality") || metrica.equals("average_node_connectivity") || metrica.equals("edge_connectivity") || metrica.equals("node_connectivity") ){
					sp.println("Erro: metrica " + metrica + " não se aplica a vértices individuais", "semantico");
				}
				
			}
			
		}
		
		/* Verificacao de existencia de atributos para o no atribuido caso seja NODES COM ATRIBUTOS*/
		
		if(comando==5){
			if(ctx.atribuicao().nodes_atributos_atribuicao()!=null){
				visitNodes_atributos_atribuicao(ctx.atribuicao().nodes_atributos_atribuicao());
			}
		}
		
		
		/* PRINT */
		if(comando==8){
			visitImprimir(ctx.imprimir());
		}
		
		return null;
	}
	

	
	@Override
	public String visitCorpo_for(Corpo_forContext ctx) {
		
		if(ctx.comandos_for()!=null){
			visitComandos_for(ctx.comandos_for());
		}
		return null;
	}
	
	


	@Override
	public String visitComandos_for(Comandos_forContext ctx) {
		
		/* Percorre corpo(s) de IF*/
		for(Expressao_ifContext c : ctx.ctx_if){
			if(c.exp_relacional()!=null){
				visitExp_relacional(c.exp_relacional());
				
				
			}else if(c.exp_igualdade()!=null){
				visitExp_igualdade(c.exp_igualdade());
			}
		}
		
		
		for(Corpo_ifContext c : ctx.cif){
			if(c!=null)
				visitCorpo_if(c);
		}
		
		/* ATRIBUICOES*/
		
		
		
		return null;
	}


	@Override
	public String visitCorpo_if(Corpo_ifContext ctx) {
		
		/* comando PRINT e ATRUICAO*/
		for(Comandos_ifContext com : ctx.coms){
			if(com.imprimir()!=null){
				visitImprimir(com.imprimir());
			}
			//atribuicao
			else if(com.atribuicao_for()!=null){
				String id = com.at.getText();
				
				/* verifica se variavel de atribuicao foi declarada */
				if(!this.tab.existeSimbolo(id)){
					sp.println("Erro: variável " + id + " não declarada","semantico");
				}
				
				/* compatibilidade de tipo em atribuicao */
	            /* tipo de variavel de atribuicao */
				String tipo_at = this.pilhaTabs.getTipo(id);
				
				String tipo_at1 = visitAtribuicao_for(com.atribuicao_for());
			
			    if(!tipo_at.equals(tipo_at1)){
				   sp.println("Erro: incompatibilidade de atribuicao em " + id ,"semantico");
			    }
				
				
			}//fim verificacao atribuicao
		}
		
		if(ctx.celse!=null){
			visitCorpo_else(ctx.celse);
		}
	
		return null;
	}
	

	

	@Override
	public String visitAtribuicao_for(Atribuicao_forContext ctx) {
		
		/* Retorna nome variavel atribuida se existe, senao retorna tipo */
		
		String var = null;
		
		/* CASO SEJA IDENT */
		if(ctx.id!=null){
			var = ctx.id.getText();
			/* verifica se variavel de atribuicao foi declarada */
			if(!this.tab.existeSimbolo(ctx.id.getText())){
				sp.println("Erro: variável " + ctx.id.getText() + " não declarada","semantico");
			}
		}
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
		else if(ctx.nodes_atributos_atribuicao()!=null)
			var = "nodes_com_atributos";
		else if(ctx.id1!=null && ctx.id2!=null){
			String atributo = ctx.id2.getText();
			Grafo grafo=null;
			
			for(Grafo g : this.grafos){
				if(g.getNome().equals(this.grafo_for)){
					grafo = g;
					break;
				}
			}
			
			
			for(String at : grafo.getAtributos()){
				if(at.equals(atributo)){
					var = grafo.getTiposAtributos().get(grafo.getAtributos().indexOf(at));
					break;
				}
			}
			
		}//fim no com atributo
		
		return var;
		
	
	}


	@Override
	public String visitCorpo_else(Corpo_elseContext ctx) {
		
		/* comando PRINT */
		for(ImprimirContext print : ctx.imp){
			if(print!=null){
				visitImprimir(print);
			}
		}
	
		return null;
		
	}

	
	

	@Override
	public String visitImprimir(ImprimirContext ctx) {
		
		/* verifica se IDENT ja foi declarado */
		if(ctx.IDENT()!=null){
			
			String tipo = this.pilhaTabs.getTipo(ctx.IDENT().getText());
			
			
			
			if(!this.tab.existeSimbolo(ctx.IDENT().getText())){
				sp.println("Erro: variável " + ctx.IDENT().getText() + " não declarada!", "semantico");
			}else if(tipo!=null && (tipo.equals("graph") || tipo.equals("nodes") || tipo.equals("nodes_com_atributos") )){
				sp.println("Erro: não é possível imprimir tipo graph, nodes e nodes com atributos", "semantico");
			}
			
			
			
		}
		
		
		return null;
	}



	@Override
	public String visitExpressao_if(Expressao_ifContext ctx) {
		// TODO Auto-generated method stub
		return super.visitExpressao_if(ctx);
	}


	@Override
	public String visitExp_relacional(Exp_relacionalContext ctx) {
		
		String tipo1=null,tipo2=null;//tipos de op1 e op2 => op1 < op2
		
		
		/* Busca de tipo do operando 1 */
		if(ctx.op1_id!=null){
			//IDENT VARIAVEL
			tipo1 = this.pilhaTabs.getTipo(ctx.op1_id.getText());
		}else if(ctx.op1_int!=null){
			tipo1 = "int";
		}else if(ctx.op1_real!=null){
			tipo1 = "float";
		}else if(ctx.at1!=null){
			
			String atributo = ctx.at1.getText();
			Grafo grafo=null;
			
			for(Grafo g : this.grafos){
				if(g.getNome().equals(this.grafo_for)){
					grafo = g;
					break;
				}
			}
			
			String tipo_atributo = null;
			for(String at : grafo.getAtributos()){
				if(at.equals(atributo)){
					tipo_atributo = grafo.getTiposAtributos().get(grafo.getAtributos().indexOf(at));
					break;
				}
			}
			
			/* atributo nao existente */
			if(tipo_atributo==null){
				sp.println("Erro: atributo " + atributo + " não existente no grafo " + this.grafo_for, "semantico");
			}else{
				tipo1 = tipo_atributo;
			}
			
		}//fim else if
		
		
		/* Busca de tipo do operando 2 */
		if(ctx.op2_id!=null){
			//IDENT VARIAVEL
			tipo2 = this.pilhaTabs.getTipo(ctx.op2_id.getText());
		}else if(ctx.op2_int!=null){
			tipo2 = "int";
		}else if(ctx.op2_real!=null){
			tipo2 = "float";
		}else if(ctx.at2!=null){
			
			String atributo = ctx.at2.getText();
			Grafo grafo=null;
			
			for(Grafo g : this.grafos){
				if(g.getNome().equals(this.grafo_for)){
					grafo = g;
					break;
				}
			}
			
			String tipo_atributo = null;
		if(grafo!=null){	
			for(String at : grafo.getAtributos()){
				if(at.equals(atributo)){
					tipo_atributo = grafo.getTiposAtributos().get(grafo.getAtributos().indexOf(at));
					break;
				}
			}
		}//fim if
			
			/* atributo nao existente */
			if(tipo_atributo==null){
				sp.println("Erro: atributo " + atributo + " não existente no grafo " + this.grafo_for, "semantico");
			}else{
				tipo2 = tipo_atributo;
			}
			
		}//fim else if
		
		
		if((tipo1!=null && tipo2!=null ) && (tipo1.equals("string") || tipo2.equals("string"))){
			sp.println("Erro: tipo string não permitido em expressão relacional", "semantico");
		}else if(tipo1.equals("graph" )|| tipo1.equals("edges") || tipo1.equals("nodes") || tipo1.equals("nodes_com_atributos")){
		    sp.println("Erro: Expressão relacional inválida!", "semantico");
		}else if(tipo2!=null && (tipo2.equals("graph" )|| tipo2.equals("edges") || tipo2.equals("nodes")||  tipo2.equals("nodes_com_atributos"))){
		    sp.println("Erro: Expressão relacional inválida! ", "semantico");
		}
		
		
		/* MAIS EXPRESSOES */
		for(Mais_expContext m : ctx.mais){
			
			if(m.exp_relacional()!=null){
				visitExp_relacional(m.exp_relacional());
			}else if(m.exp_igualdade()!=null){
				visitExp_igualdade(m.exp_igualdade());
			}
			
		}//fim MAIS EXPRESSOES
		
		return null;
	}


	@Override
	public String visitOp_relacional(Op_relacionalContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOp_relacional(ctx);
	}


	@Override
	public String visitExp_igualdade(Exp_igualdadeContext ctx) {
		String tipo1=null,tipo2=null;//tipos de op1 e op2 => op1 == op2
		
		
		/* Busca de tipo do operando 1 */
		if(ctx.op1_id!=null){
			//IDENT VARIAVEL
			tipo1 = this.pilhaTabs.getTipo(ctx.op1_id.getText());
			
		}else if(ctx.op1_s!=null){
			tipo1="string";
		}
		
		else if(ctx.op1_int!=null){
			tipo1 = "int";
		}else if(ctx.op1_real!=null){
			tipo1 = "float";
		}else if(ctx.at1!=null){
			
			String atributo = ctx.at1.getText();
			Grafo grafo=null;
			
			for(Grafo g : this.grafos){
				if(g.getNome().equals(this.grafo_for)){
					grafo = g;
					break;
				}
			}
			
			String tipo_atributo = null;
			for(String at : grafo.getAtributos()){
				if(at.equals(atributo)){
					tipo_atributo = grafo.getTiposAtributos().get(grafo.getAtributos().indexOf(at));
					break;
				}
			}
			
			/* atributo nao existente */
			if(tipo_atributo==null){
				sp.println("Erro: atributo " + atributo + " não existente no grafo " + this.grafo_for, "semantico");
			}else{
				tipo1 = tipo_atributo;
			}
			
		}//fim else if
		
		
		/* Busca de tipo do operando 2 */
		if(ctx.op2_id!=null){
			//IDENT VARIAVEL
			tipo2 = this.pilhaTabs.getTipo(ctx.op2_id.getText());
		}else if(ctx.op2_s!=null){
			tipo2="string";
		}else if(ctx.op2_int!=null){
			tipo2 = "int";
		}else if(ctx.op2_real!=null){
			tipo2 = "float";
		}else if(ctx.at2!=null){
			
			String atributo = ctx.at2.getText();
			Grafo grafo=null;
			
			for(Grafo g : this.grafos){
				if(g.getNome().equals(this.grafo_for)){
					grafo = g;
					break;
				}
			}
			
			String tipo_atributo = null;
			for(String at : grafo.getAtributos()){
				if(at.equals(atributo)){
					tipo_atributo = grafo.getTiposAtributos().get(grafo.getAtributos().indexOf(at));
					break;
				}
			}
			
			/* atributo nao existente */
			if(tipo_atributo==null){
				sp.println("Erro: atributo " + atributo + " não existente no grafo " + this.grafo_for, "semantico");
			}else{
				tipo2 = tipo_atributo;
			}
			
		}//fim else if
		
		
		if((tipo1.equals("int") || tipo1.equals("float")) && tipo2.equals("string")){
				sp.println("Erro: tipo string não permitido em expressão igualdade", "semantico");
		}else if((tipo2.equals("int") || tipo2.equals("float")) && tipo1.equals("string")){
				sp.println("Erro: tipo string não permitido em expressão igualdade", "semantico");
		}else if(tipo1.equals("graph" )|| tipo1.equals("edges") || tipo1.equals("nodes") ||  tipo1.equals("nodes_com_atributos")){
			    sp.println("Erro: tipo graph, edges e nodes não permitidos em expressão de igualdade", "semantico");
		}else if(tipo2.equals("graph" )|| tipo2.equals("edges") || tipo2.equals("nodes") ||  tipo2.equals("nodes_com_atributos")){
		    sp.println("Erro: tipo graph, edges e nodes não permitidos em expressão de igualdade", "semantico");
		}
		
		/* MAIS EXPRESSOES */
		for(Mais_expContext m : ctx.mais){
			
			if(m.exp_relacional()!=null){
				visitExp_relacional(m.exp_relacional());
			}else if(m.exp_igualdade()!=null){
				visitExp_igualdade(m.exp_igualdade());
			}
			
		}//fim MAIS EXPRESSOES
		
		
		return null;
	}


	@Override
	public String visitOp_igualdade(Op_igualdadeContext ctx) {
		// TODO Auto-generated method stub
		return super.visitOp_igualdade(ctx);
	}


	@Override
	public String visitNodes_atributos_atribuicao(Nodes_atributos_atribuicaoContext ctx) {
		
		Nodes no=null;
		ArrayList<String> atributos  = new ArrayList<String> () ;
		ArrayList<List<Token>> atributos_tokens = new ArrayList<List<Token>>();
		boolean erro=false; //ocorreu erro?
		
		
		/* Enconta NODE da atribuicao na lista nodes_atributos auxilixar*/
		for(Nodes n : this.nodes_atributos){
			if(n.getNome().equals(this.var_at)){
				
				no = n;
				
				
			}
		}
		
		if(no!=null)
			atributos = no.getAtributos();
		
		
		
		/* listas de ids de casa visita a regra nodes_atributos_v + 1*/
		atributos_tokens.add(ctx.ats1);
			
		if(ctx.atrn!=null){
			for(Atributos_nodes_vContext av : ctx.atrn){
				atributos_tokens.add(av.atsn);
			}
		}
		
		
		ArrayList<String> aux = new ArrayList<String>();
	
		/* verificacao SEMANTICA DE EXISTENCIA DE ATRIBUTOS NA ATRIBUICAO */
		for(List<Token> lts : atributos_tokens){
			
			for(Token t : lts){
				aux.add(t.getText());
			}
			
			/* AUSENCIA DE ATRIBUTO */
			for(String at : atributos){
				
					if(!aux.contains(at)){
						sp.println("Erro: ausência de atributo(s)", "semantico");
						erro = true;
						break;
					}
					else if(atributos.size()<aux.size()){
						sp.println("Erro: atributos inicializados porém não declarados", "semantico");
						erro = true;
						break;
					}
					else if(aux.size()!=atributos.size()){
						sp.println("Erro: ausência de atributo(s)", "semantico");
						erro = true;
						break;
					}
			}
			
			/* ATRIBUTO NAO DECLARADO */
			
			for(String at : aux){
				
				if(!atributos.contains(at)){
					sp.println("Erro: atributo " + at + " não declarado", "semantico");
					erro = true;
					break;
				}
			}
			
			aux.clear();
			
			/* REPETICAO DE ATRIBUTOS 
			//Conta quantos itens tem de cada produto
			Map<String, Integer> contador = new HashMap<String, Integer>();
			for (String valor : aux) {
			    if (!contador.containsKey(valor)) {
			        contador.put(valor, 0);
			    }
			    contador.put(valor, contador.get(valor)+1);
			}
			
			//Exibe os que tiverem mais de 1.
			for (Map.Entry<String, Integer> item : contador.entrySet()) {
			    if (item.getValue() >= 2) {
			       sp.println("Erro: atributo " + item.getKey() + " duplicado","semantico");
			    }
			}*/
			
			
		}/* FIM   verificacao SEMANTICA DE EXISTENCIA DE ATRIBUTOS NA ATRIBUICAO */
		
		
		/* VERIFICACAO SEMANTICA DE COMPATIBILIDADE DE ATRIBUICAO EM ATIBUTOS*/
		
		int i =0;
		/* primeira tupla */
		
	
		for(Token t : ctx.ats1){
			
			String tipo=null;
			int valor=0;
			
			if(no!=null){
				tipo = no.getTipoAtributo(t.getText());
			
			
				valor = ctx.t.get(i).getType();
			}
				String tipo_atr=null;
			
				if(valor==51){
					tipo_atr = "int";
				
				}else if(valor==52){
					tipo_atr = "float";
				}else if(valor==53){
					tipo_atr = "string";
				}
			
				if(tipo!=null && !tipo.equals(tipo_atr)){
					sp.println("Erro: incompatibilidade na atribuição do atributo " + t.getText(), "semantico");
			
					erro = true;
					break;
				}
			
				i+=1;
		}
	     
		i = 0;
		for(Atributos_nodes_vContext at : ctx.atrn){
			
			for(Token t : at.atsn){
				
				String tipo = no.getTipoAtributo(t.getText());
				
				int valor = at.t.get(i).getType();
				
				String tipo_atr=null;
				
			
				
				
				if(valor==51){
					tipo_atr = "int";
					
				}else if(valor==52){
					tipo_atr = "float";
					
					
				}else if(valor==53){
					tipo_atr = "string";
					
					
				}
				

				if(tipo!=null && !tipo.equals(tipo_atr)){
					sp.println("Erro: incompatibilidade na atribuição do atributo " + t.getText(), "semantico");
					erro = true;
					break;
				}
			
				i+=1;
			
				
			}
			i = 0;
		
		}/*FIM VERIFICACAO SEMANTICA DE COMPATIBILIDADE DE ATRIBUICAO EM ATIBUTOS*/
		
		/* SE NAO OCORREU NENHUM ERRO SEMANTICO INSERE ID_NODE + ATRIBUTO NA TABELA DE SIMBOLOS */
		
		
		if(!erro){
			String id_nodes = this.var_at;
		
			ArrayList<String> ats = no.getAtributos(); //atributos do tipo de id_nodes
			
		    
			
			/* Primeira tupla */
			for(String at : ats){
				
				String id_at = ctx.id.getText();
				
				if(id_at.contains("\"")){
					id_at = id_at.substring(1,id_at.length()-1);
				}
				
				 id_at = id_at + "." + at;
				
				
				if(!this.pilhaTabs.existeSimbolo(id_at)){
					String tipo = no.getTipoAtributo(at);
					this.tab.adicionarSimbolo(id_at, tipo);
				
				}else{
					sp.println("Erro: identificador " + id_at + " já declarado", "semantico");
					break;
				}
				
			}
			
			
			List<Atributos_nodes_vContext> outros_ids = ctx.atrn;
			
			for(Atributos_nodes_vContext c : outros_ids){
				
				/* Outras tuplas */
				for(String at : ats){
					
					String id_at = c.id.getText();
					
					if(id_at.contains("\"")){
						id_at = id_at.substring(1,id_at.length()-1);
					}
					
					 id_at = id_at + "." + at;
					
					if(!this.pilhaTabs.existeSimbolo(id_at)){
						String tipo = no.getTipoAtributo(at);
						this.tab.adicionarSimbolo(id_at, tipo);
					
						
					}else{
						sp.println("Erro: identificador " + id_at + " já declarado", "semantico");
						break;
					}
					
				}
				
			}
			
			
			
		}//FIM NAO OCORREU ERRO
	
		
		return null;
	}


	@Override
	public String visitArquivo_grafo(Arquivo_grafoContext ctx) {
		
		String caminho = null;
		
		if(ctx.STRING()!=null){
			caminho = ctx.STRING().getText();
		}else if(ctx.IDENT()!=null){
			caminho = ctx.IDENT().getText();
		}
		
		
		return caminho;
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
		if(!tipo2.equals("nodes") && !tipo2.equals("nodes_com_atributos")){
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
		
		
		/* Cria estrtura de dados de grafo com atributos e seus tipos caso seja um grafo com nodes com atributos */
		if(tipo2.equals("nodes_com_atributos")){
			Nodes no=null;
			
			for(Nodes n : this.nodes_atributos){
				if(n.getNome().equals(ctx.v2.getText())){
					no = n;
					break;
				}//fim if
			}//fim for
			
			Grafo g = new Grafo(this.grafo_create);
			g.addAtributos(no.getAtributos());
			g.addTiposAtributos(no.getTiposAtributos());
			this.grafos.add(g);
			
			
		}//fim if
	
		
		
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
		if(!tipo1.equals("nodes") && !tipo1.equals("nodes_com_atributos")){
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
		else if(ctx.nodes_atributos_atribuicao()!=null)
			var = "nodes_com_atributos";
		
		return var;
	}
	
	@Override
	public String visitObjeto_metrica(Objeto_metricaContext ctx) {
		
		String grafo_id=null;
		boolean vertex = false;
		List<ParseTree> filhos = null;
		
		/* pega variavel graph */
		if(ctx!=null)
			filhos = ctx.children;
	
		
		/* Verifica se e metrica de vertex ou graph */
	 if(filhos!=null)
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
			if(filhos!=null)
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
	public String visitMetrica(MetricaContext ctx) {
		
		
		return ctx.getText();
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
