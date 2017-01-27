package main;

import java.util.ArrayList;
import java.util.List;

import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import gramatica.LGraphBaseVisitor;
import gramatica.LGraphParser.Arquivo_grafoContext;
import gramatica.LGraphParser.AtribuicaoContext;
import gramatica.LGraphParser.Atributos_nodes_vContext;
import gramatica.LGraphParser.CmdContext;
import gramatica.LGraphParser.ComandosContext;
import gramatica.LGraphParser.Comandos_forContext;
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
import gramatica.LGraphParser.MetricaContext;
import gramatica.LGraphParser.NodesContext;
import gramatica.LGraphParser.Nodes_atributos_atribuicaoContext;
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

public class GeradorDeCodigo extends LGraphBaseVisitor<String> {
	

	SaidaGerador sp;
	TabelaDeSimbolos t;
	PilhaDeTabelas pilha;
	String path; //caminho diretorio de saida para arquivos
	String atribuicao_aux;
	ArrayList<SetNodes> set_nodes;
	String aux1_for,aux2_for;
	boolean ident=false; //aux para definir identacao
	
	public GeradorDeCodigo(SaidaGerador s,PilhaDeTabelas p,String path){
		this.sp = s;
		this.pilha = p;
		this.t = pilha.topo();
		this.path = path;
		this.set_nodes = new ArrayList<SetNodes>();
	}
	
	@Override
	public String visitInicio(InicioContext ctx) {
		
		sp.println("# -*- coding: utf-8 -*-");
		sp.println("#!/usr/bin/env python\n\n");
		sp.println("#Geraçao de codigo LGraph\n\n");
		sp.println("import networkx as nx\n");
		sp.println("import matplotlib.pyplot as plt\n");
		sp.println("#Configuracoes default para plotagem de grafos\n");
		sp.println("plt.figure(1, figsize=(12, 8))\n");
		sp.println("plt.axis('off')\n");
		
		visitPrograma(ctx.programa());
		
		return null;
	}

	@Override
	public String visitPrograma(ProgramaContext ctx) {
		/* Declaracao de variaveis a partir da tabela de simbolos */
		/* Edges e Nodes e Graphs e Int e Float e String*/
	
		/* cria arquivo de saida para PRINTS */
		sp.println("#Criacao de aarquivo print");
		sp.println("arq_print = open('"+ this.path + "/print.txt','w')\n");
			
		
		for(String var : this.t.getSimbolos()){
			if(pilha.getTipo(var).equals("edges") ||pilha.getTipo(var).equals("nodes") ){
				
				sp.println("#Declaracao de edges e nodes e grafos\n");
				sp.println(var + " = " + "[]\n");
				
			}else if(pilha.getTipo(var).equals("graph")){
				
				
				sp.println("#Declaracao de grafos\n");
				sp.println(var + " = nx.Graph()\n");
				
			}
			
			else if((pilha.getTipo(var).equals("int") || pilha.getTipo(var).equals("float") ) && !var.contains(".")){

				sp.println("#Declaracao de inteiros e floats\n");
				sp.println(var + " = 0\n");
			}
			
			else if(pilha.getTipo(var).equals("string") && !var.contains(".")){

				sp.println("#Declaracao de string\n");
				sp.println(var + " = \" \"\n");
			}
			
			
		}
		
		/* Comandos */
		
		if(ctx.corpo()!=null && ctx.corpo().comandos()!=null)
			visitComandos(ctx.corpo().comandos());
		
		
		
		return null;
	}

	@Override
	public String visitCorpo(CorpoContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCorpo(ctx);
	}

	@Override
	public String visitDeclaracoes(DeclaracoesContext ctx) {
		// TODO Auto-generated method stub
		return super.visitDeclaracoes(ctx);
	}

	@Override
	public String visitVariavel(VariavelContext ctx) {
		// TODO Auto-generated method stub
		return super.visitVariavel(ctx);
	}

	@Override
	public String visitComandos(ComandosContext ctx) {
		
		/* Visita cada um dos comandos */
		for(CmdContext c : ctx.cmds){
			visitCmd(c);
		}
		
		return null;
	}
	
	@Override
	public String visitCmd(CmdContext ctx) {
		
		int comando=0; // 1 - leitura, 2 - create, 3 - update, 4 - find, 5 - atribuicao, 6 - plot, 7 - FOREACH, 8 - print
		
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
				else if(p.getText().equals("foreach")){
					comando = 7;
				}else if(ctx.imprimir()!=null){
					comando = 8;
				}
			}
			
		}// FIM QUAL COMANDO E
	
		/* Geracao de codigo para ATRIBUICAO */
		if(comando==5){
			this.atribuicao_aux = ctx.id1.getText();
			
			String atribuido = visitAtribuicao(ctx.atribuicao());
			
			if(atribuido!=null){
				String var = ctx.id1.getText();
				
				sp.println(var + " = " + atribuido);
				
				
			}else{
				if(this.pilha.getTipo(this.atribuicao_aux).equals("nodes_com_atributos")){
					sp.println(this.atribuicao_aux + " = " + "[]");
				}
			}
		}//fim atribuicao
		
		/* Geracao de codigo para CREATE GRAPH */
		if(comando==2){
			/* Parametros : tipo, nos, arestas */
			
			String p1 = visitValor_parametro(ctx.parametros_create().v1);
			String p2 = visitValor_parametro(ctx.parametros_create().v2);
			String p3 = visitValor_parametro(ctx.parametros_create().v3);
			
			String id_grafo = ctx.id_grafo.getText();
			
			/* NOS SEM ATRIBUTOS */
			if(this.pilha.getTipo(p2).equals("nodes")){
				/* Codigo Python adicionar arestas e noos */
				sp.println("#Adicao de nos e arestas nos grafos\n");
				sp.println(id_grafo + ".add_nodes_from(" + p2 + ")\n");
				sp.println(id_grafo + ".add_weighted_edges_from(" + p3 + ")\n");
			
			}
			/* NOS COM ATRIBUTOS */
			else{
				SetNodes s=null;
				/* Acha estrutura do nodes*/
				for(SetNodes nodes : this.set_nodes){
					if(nodes.getNome().equals(p2)){
						s = nodes;
						break;
					}
					
				}//fim for
				
				sp.println("\n#Insercao de atributos de nodes em grafo");
			
			if(s!=null){
				/* Lista de ids do nodes */
				ArrayList<String> ids_nodes = s.getIds();
				ArrayList<String> atributos_nodes = s.getAtributos();
				ArrayList<String> valores_atributos = s.getValoresAtributos();
				String aux=null;
				int i=0;
				
				
				
				for(String id : ids_nodes){
					aux = id_grafo + ".add_node(" + id;
					
						String at = atributos_nodes.get(i);
						String v = valores_atributos.get(i);
						aux  = aux + ", " + at + " = " + v;
						i+=1;
						
						aux = aux + ")";
					
					sp.println(aux);
					
				}
			
			}//fim s!=null
		}//fim else
			
			
		}
		
		/* Geracao de codigo para UPDATE GRAPH */
		if(comando==3){
			
			/* Parametros nos e arestas */
			String p1 = visitValor_parametro(ctx.parametros_update().v1);
			String p2 = visitValor_parametro(ctx.parametros_update().v2);
			
			String id_grafo = ctx.id_grafo_up.getText();
			
			
			if(this.pilha.getTipo(p1).equals("nodes")){
				/* Codigo Python adicionar arestas e noos */
				sp.println("#Atualizacao de nos e arestas nos grafos\n");
				sp.println(id_grafo + ".add_nodes_from(" + p1 + ")\n");
				sp.println(id_grafo + ".add_weighted_edges_from(" + p2 + ")\n");
			
			}/* NOS COM ATRIBUTOS */
			
			else{
				SetNodes s=null;
				/* Acha estrutura do nodes*/
				for(SetNodes nodes : this.set_nodes){
					if(nodes.getNome().equals(p1)){
						s = nodes;
						break;
					}
					
				}//fim for
				
				sp.println("\n#Insercao de atributos de nodes em grafo");
				
				/* Lista de ids do nodes */
				
			if(s!=null){
				ArrayList<String> ids_nodes = s.getIds();
				ArrayList<String> atributos_nodes = s.getAtributos();
				ArrayList<String> valores_atributos = s.getValoresAtributos();
				String aux=null;
				int i=0;
				
				
				
				for(String id : ids_nodes){
					aux = id_grafo + ".add_node(" + id;
					
						String at = atributos_nodes.get(i);
						String v = valores_atributos.get(i);
						aux  = aux + ", " + at + " = " + v;
						i+=1;
						
						aux = aux + ")";
					
					sp.println(aux);
					
				}
				
			}//fim s != null
				
			}//fim else
			
		}//FIM UPDATE
		
		
		
		
		/* Geracao de imagem de grafo PLOT */
		if(comando==6){
			String id_grafo = ctx.id_plot.getText();
			sp.println("#Plotagem de grafo\n");
			sp.println("pos=nx.fruchterman_reingold_layout("+ id_grafo + ")\n");
			sp.println("nx.draw(" + id_grafo+ ")");
			//sp.println("nx.draw_networkx_edges(" + id_grafo+ ",pos,node_size=50)");
			sp.println("plt.title(\""+ id_grafo + "\", size=16)\n");
			sp.println("plt.savefig(\""+ this.path+"/"+id_grafo +"\")\n");
			sp.println("plt.close()\n");
		}
		
		/* Geracao de leitura de grafo a partir de arquivo */
		if(comando==1){
			String id_grafo = ctx.id_gf.getText();
			
			String path = visitArquivo_grafo(ctx.arquivo_grafo());
			
			if(!path.contains("\"")){
				//IDENT STRING
				path = "\"" + path + "\"";
			}
			
			/* Formato paj */
			if(path.contains("paj")){
				sp.println("#Leitura de grafo a partir de arquivo GML\n");
				sp.println(id_grafo + " = nx.read_pajek(" + path + ")\n");
			}
			
		}
		
		
		/* Geracao de codigo para encontrar metricas FIND */
		if(comando==4){
			String metrica = visitMetrica(ctx.metrica());
			String obj = visitObjeto_metrica(ctx.objeto_metrica());
			
			
			
			
			/* Metrica DEGREE */
			if(metrica.equals("degree")){
				
				String vertice=null, grafo=null,aux=null;
				
				if(obj.contains("*")){
					vertice = obj.substring(0,obj.indexOf("*"));
					grafo = obj.substring(obj.indexOf("*")+1,obj.length());
					aux = obj;
					obj = grafo;
				}

				/* cria arquivo de metricas para grafo ou usa o que ja existe */
				sp.println("#Criacao de arquivo metrica");
				sp.println(obj + "Metricas = open('" + path + "/" + obj + "Metricas.txt', 'w')\n");
				String arq = obj + "Metricas";
				sp.println(arq+".write(\"========== MÉTRICAS DE GRAFO "+ obj  + " ==========\")");
				
				
				   /* codigo Python para encontrar graus */
					
					/* Grau de grafo */
					if(aux==null ){
						sp.println("graus = nx.degree(" + obj + ")\n");
						/* Imprimir dict graus em arquivo criado de metrica */
						sp.println("#Impressao de graus de vertices de grafo\n");
						sp.println(arq + ".write(\"\\n\\n*** Métrica : DEGREE ***\")");
						sp.println("for chave in graus:");
						sp.println("	"+ arq + ".write(\"\\nNó: \" + str(chave)  + \" Grau => \" + str(graus[chave]))");
					}
					/* Grau de vertice */
					else{
						sp.println("ngraus = " + grafo + ".degree(" + vertice + ")\n");
						sp.println(arq + ".write(\"\\n\\n*** Métrica : DEGREE ***\")");
						sp.println(arq + ".write(\"\\nNó: \" + str(" + vertice   + ")"+ "+ \" Grau => \" + str(graus))");
					}
					
				
			}//fim DEGREE
			
			/* Metrica: DEGREE CENTRALITY */
			else if(metrica.equals("degree_centrality")){
				
				String arq = obj + "Metricas";
				
				/* CENTRALITY SO SE APLICA A GRAFO */
				sp.println("centralidades = nx.degree_centrality(" + obj + ")\n");
				/* Imprimir dict graus em arquivo criado de metrica */
				sp.println("#Impressao de centralidade de vertices de grafo\n");
				sp.println(arq + ".write(\"\\n\\n*** Métrica : DEGREE CENTRALITY ***\")");
				sp.println("for chave in centralidades:");
				sp.println("	"+ arq + ".write(\"\\nNó: \" + str(chave)  + \" Centralidade => \" + str(centralidades[chave]))");
				
				
			}
			
			/* Metrica : average_node_connectivity */
			else if(metrica.equals("average_node_connectivity")){
				String arq = obj + "Metricas";
				
				/*  average_node_connecti SO SE APLICA A GRAFO */
				sp.println("con = nx.average_node_connectivity(" + obj + ")\n");
				/* Imprimir dict graus em arquivo criado de metrica */
				sp.println("#Impressao de average_node_connectivity de vertices de grafo\n");
				sp.println(arq + ".write(\"\\n\\n*** Métrica : AVERAGE_NODE_CONNECTIVITY ***\")");
				sp.println(arq + ".write(\"\\nGrafo "+  obj  + " Average_node_connectivity => \" + str(con))");
				
			}
			
			/* Metrica : edge_connectivity */
			else if(metrica.equals("edge_connectivity")){
				String arq = obj + "Metricas";
				
				/*  edge_connecti SO SE APLICA A GRAFO */
				sp.println("con = nx.edge_connectivity(" + obj + ")\n");
				/* Imprimir dict graus em arquivo criado de metrica */
				sp.println("#Impressao de edge_connectivity de grafo\n");
				sp.println(arq + ".write(\"\\n\\n*** Métrica : EDGE_CONNECTIVITY ***\")");
				sp.println(arq + ".write(\"\\nGrafo "+  obj  + " Edge_connectivity => \" + str(con))");
				
			}
			
			/* Metrica : node_connectivity */
			else if(metrica.equals("node_connectivity")){
				String arq = obj + "Metricas";
				
				/*  node_connecti SO SE APLICA A GRAFO */
				sp.println("con = nx.node_connectivity(" + obj + ")\n");
				/* Imprimir dict graus em arquivo criado de metrica */
				sp.println("#Impressao de node_connectivity de grafo\n");
				sp.println(arq + ".write(\"\\n\\n*** Métrica : NODE_CONNECTIVITY ***\")");
				sp.println(arq + ".write(\"\\nGrafo "+  obj  + " Node_connectivity => \" + str(con))");
				
			}
			
			
		
			
			
			
			
			
		}//FIM GERACAO DE CODIGO PARA FIND
		
		/* GERACAO DE CODIGO PARA FOREACH */
		if(comando==7){
			
	
			String vertice=null,grafo=null;
			
			if(ctx.id!=null){
				vertice = ctx.id.getText();
				grafo = ctx.g_id.getText();
				this.aux1_for = vertice;
				this.aux2_for = grafo;
			}
			
			/* Geracao de for v in graph: */
			if(vertice!=null && grafo!=null){
				sp.println("#Laco FOREACH");
				sp.println("for " + vertice + " in " + grafo + ".nodes()"  + ":");
				
			}
			
			
			if(ctx.corpo_for()!=null){
				visitCorpo_for(ctx.corpo_for());
			}
			
		}//fim FOREACH
		
		
		/* PRINT */
		if(comando==8){
			
			if(ctx.imprimir()!=null){
				this.ident=true;
			}
			
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
		
		String comando=null;
		int i=0;
		
		/* Gera codigo IF e ELSE caso existam */
		for(Expressao_ifContext c : ctx.ctx_if){
			comando = "	if(";
			
			if(c.exp_relacional()!=null){
			
				String exp = visitExp_relacional(c.exp_relacional());
				comando = comando + exp + "):";
				sp.println(comando);
			}else if(c.exp_igualdade()!=null){
				String exp = visitExp_igualdade(c.exp_igualdade());
				comando = comando + exp + "):";
				sp.println(comando);
			}
			
			visitCorpo_if(ctx.cif.get(i));
			i = i+1;
			
			
		}//fim for IF ELSE
		i=0;
		
	
		
		return null;
	}

	@Override
	public String visitCorpo_if(Corpo_ifContext ctx) {
		
		/* Gera codigo para prints */
		for(ImprimirContext i : ctx.imp){
			visitImprimir(i);
		}
		
		/* Corpo else */
		if(ctx.celse!=null){
			visitCorpo_else(ctx.celse);
		}
		
		
		return null;
	}
	
	

	@Override
	public String visitImprimir(ImprimirContext ctx) {
		
		/* Com IDENT */
		if(!this.ident){
			if(ctx.STRING()!=null){
				sp.println("		arq_print.write(\"\\n\")");
				sp.println("		arq_print.write(" +ctx.STRING().getText() + ")");
			}else if(ctx.IDENT()!=null){
				String tipo = this.pilha.getTipo(ctx.IDENT().getText());
			
				if(tipo!=null && !tipo.equals("graph") && !tipo.equals("nodes") && !tipo.equals("nodes_com_atributos")){
					/* imprimi VARS INTS, FLOATS,STRINGS */
					sp.println("		arq_print.write(\"\\n\")");
					sp.println("		arq_print.write(" + ctx.IDENT().getText() + ")");
				}
			}
		}//fim ident
		
		/* SEM IDENT */
		else{
			if(ctx.STRING()!=null){
				sp.println("arq_print.write(\"\\n\")");
				sp.println("arq_print.write(" +ctx.STRING().getText() + ")");
			}else if(ctx.IDENT()!=null){
				String tipo = this.pilha.getTipo(ctx.IDENT().getText());
			
				if(tipo!=null && !tipo.equals("graph") && !tipo.equals("nodes") && !tipo.equals("nodes_com_atributos")){
					/* imprimi VARS INTS, FLOATS,STRINGS */
					sp.println("arq_print.write(\"\\n\")");
					sp.println("arq_print.write(" + ctx.IDENT().getText() + ")");
				}
			}
		}//fim ident
		this.ident = false;
		
		return null;
	}

	@Override
	public String visitCorpo_else(Corpo_elseContext ctx) {
		
		/* PRINTS */
		sp.println("	else:");
		for(ImprimirContext i : ctx.imp){
			visitImprimir(i);
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
		
		String exp=null;
		
		
		/* Busca do operando 1 */
		if(ctx.op1_id!=null){
			//IDENT VARIAVEL
			exp = ctx.op1_id.getText();
		}
		else if(ctx.op1_int!=null){
			exp = ctx.op1_int.getText();
		}
		else if(ctx.op1_real!=null){
			exp = ctx.op1_real.getText();
		}
		else if(ctx.at1!=null){
			exp = this.aux2_for+".node"+"["+this.aux1_for+"]["+ctx.at1.getText()+"]";
		}
		
		
		exp = exp + ctx.op_relacional().getText();

		/* Busca do operando 2 */
		if(ctx.op2_id!=null){
			//IDENT VARIAVEL
			exp = exp + ctx.op2_id.getText();
		}
		else if(ctx.op2_int!=null){
			exp = exp + ctx.op2_int.getText();
		}
		else if(ctx.op2_real!=null){
			exp = exp + ctx.op2_real.getText();
		}
		else if(ctx.at2!=null){
			exp = exp + this.aux2_for+".node"+"["+this.aux1_for+"]['"+ctx.at2.getText()+"']";
		}
		
		
		return exp;
	}

	@Override
	public String visitExp_igualdade(Exp_igualdadeContext ctx) {
		String exp=null;
		
		
		/* Busca do operando 1 */
		if(ctx.op1_id!=null){
			//IDENT VARIAVEL
			exp = ctx.op1_id.getText();
		}
		else if(ctx.op1_int!=null){
			exp = ctx.op1_int.getText();
		}
		else if(ctx.op1_real!=null){
			exp = ctx.op1_real.getText();
		}
		else if(ctx.at1!=null){
			exp = this.aux2_for+".node"+"["+this.aux1_for+"]["+ctx.at1.getText()+"]";
		}else if(ctx.op1_s!=null){
			exp = ctx.op1_s.getText();
		}
		
		
		exp = exp + ctx.op_igualdade().getText();

		/* Busca do operando 2 */
		if(ctx.op2_id!=null){
			//IDENT VARIAVEL
			exp = exp + ctx.op2_id.getText();
		}
		else if(ctx.op2_int!=null){
			exp = exp + ctx.op2_int.getText();
		}
		else if(ctx.op2_real!=null){
			exp = exp + ctx.op2_real.getText();
		}
		else if(ctx.at2!=null){
			exp = exp + this.aux2_for+".node"+"["+this.aux1_for+"]['"+ctx.at2.getText()+"']";
		}else if(ctx.op2_s!=null){
			exp = exp + ctx.op2_s.getText();
		}
		
		
		return exp;
		
	}

	@Override
	public String visitMetrica(MetricaContext ctx) {
		
		return ctx.getText();
	}

	
	@Override
	public String visitObjeto_metrica(Objeto_metricaContext ctx) {
	
		String retorno=null;//caso seja metrica de grafo retorna id do grafo,senao retorna 
		//id vertice + "*" + id grafo
		
		/* verifica se e metrica de grafo ou vertice */
		if(ctx.id_graph!=null){
			retorno = ctx.id_graph.getText();
		}else if(ctx.id_vert!=null && ctx.v!=null){
			retorno = ctx.v.getText() + "*" + ctx.id_vert.getText();
		}
		
		return retorno;
	}

	
	@Override
	public String visitValor_parametro(Valor_parametroContext ctx) {
		
		
		String valor=null;
		
		if(ctx.NUM_INT()!=null){
			valor = ctx.NUM_INT().getText();
		}else if(ctx.NUM_REAL()!=null){
			valor = ctx.NUM_REAL().getText();
		}else if(ctx.STRING()!=null){
			valor = ctx.STRING().getText();
		}else if(ctx.IDENT()!=null){
			valor = ctx.IDENT().getText();
		}
		
		
		return valor;
	}

	
	@Override
	public String visitAtribuicao(AtribuicaoContext ctx) {
		
		
		String atribuido = null;
		
		/* Se for aresta */
		if(ctx.edges()!=null){
			atribuido = ctx.edges().getText();
		}else if(ctx.nodes()!=null){
			atribuido = ctx.nodes().getText();
		}else if(ctx.NUM_INT()!=null){
			atribuido = ctx.NUM_INT().getText();
		}else if(ctx.NUM_REAL()!=null){
			atribuido = ctx.NUM_REAL().getText();
		}else if(ctx.STRING()!=null){
			atribuido = ctx.STRING().getText();
		}else if(ctx.nodes_atributos_atribuicao()!=null){
			atribuido = visitNodes_atributos_atribuicao(ctx.nodes_atributos_atribuicao());
			
			
			
		}
		
		
		return atribuido;
	}
	
	


	
	@Override
	public String visitNodes_atributos_atribuicao(Nodes_atributos_atribuicaoContext ctx) {
		
		/* Cria estrura com nome de nodes e seus ids + parametros com valores */
		
		SetNodes s = new SetNodes(this.atribuicao_aux);
		
		/* Primeira tupla */
		String id = ctx.id.getText();
		int i=0;
		
		/* Percorre atributos e valores da primeira tupla */
		for(Token at : ctx.ats1){
			String v = ctx.t.get(i).getText();
			s.add(id, at.getText(), v);
			//System.out.println(id + " " + at.getText() + " " + v);
			i+=1;
			
		}
		
		
		/* Percorre outras tuplas */
		for(Atributos_nodes_vContext c : ctx.atrn){
			i = 0;
			id = c.id.getText();
			

			/* Percorre atributos e valores da primeira tupla */
			for(Token at : c.atsn){
				String v = c.t.get(i).getText();
				s.add(id, at.getText(), v);
				//System.out.println(id + " " + at.getText() + " " + v);
				i+=1;
				
			}
			
			
		}
		this.set_nodes.add(s);
		
		return null;
	}

	@Override
	public String visitSalvar_opcional(Salvar_opcionalContext ctx) {
		// TODO Auto-generated method stub
		return super.visitSalvar_opcional(ctx);
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
		// TODO Auto-generated method stub
		return super.visitParametros_create(ctx);
	}

	@Override
	public String visitParametros_update(Parametros_updateContext ctx) {
		// TODO Auto-generated method stub
		return super.visitParametros_update(ctx);
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
