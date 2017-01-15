package main;

import java.util.List;

import org.antlr.v4.runtime.tree.ParseTree;

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

public class GeradorDeCodigo extends LGraphBaseVisitor<String> {

	SaidaGerador sp;
	TabelaDeSimbolos t;
	PilhaDeTabelas pilha;
	
	public GeradorDeCodigo(SaidaGerador s,PilhaDeTabelas p){
		this.sp = s;
		this.pilha = p;
		this.t = pilha.topo();
	}
	
	@Override
	public String visitInicio(InicioContext ctx) {
		
		sp.println("# -*- coding: utf-8 -*-");
		sp.println("#!/usr/bin/env python\n\n");
		sp.println("#Geraçao de codigo LGraph\n\n");
		sp.println("import networkx as nx\n");
		visitPrograma(ctx.programa());
		
		return null;
	}

	@Override
	public String visitPrograma(ProgramaContext ctx) {
		/* Declaracao de variaveis a partir da tabela de simbolos */
		/* Edges e Nodes e Graphs */
		
		sp.println("#Declaracao de edges e nodes e grafos\n");
		for(String var : this.t.getSimbolos()){
			if(pilha.getTipo(var).equals("edges") ||pilha.getTipo(var).equals("nodes") ){
				sp.println(var + " = " + "[]\n");
			}else if(pilha.getTipo(var).equals("graph")){
				sp.println(var + " = nx.Graph()\n");
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
			}
			
		}// FIM QUAL COMANDO E
	
		/* Geracao de codigo para ATRIBUICAO */
		if(comando==5){
			
			String atribuido = visitAtribuicao(ctx.atribuicao());
			
			if(atribuido!=null){
				String var = ctx.IDENT().getText();
				
				sp.println(var + " = " + atribuido);
				
				
			}
		}//fim atribuicao
		
		
		
		return null;
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
		}
		
		
		return atribuido;
	}


	@Override
	public String visitObjeto_metrica(Objeto_metricaContext ctx) {
		// TODO Auto-generated method stub
		return super.visitObjeto_metrica(ctx);
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
	public String visitValor_parametro(Valor_parametroContext ctx) {
		// TODO Auto-generated method stub
		return super.visitValor_parametro(ctx);
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
