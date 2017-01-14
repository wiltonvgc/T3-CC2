package main;

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

public class GeradorDeCodigo extends LGraphBaseVisitor<String> {

	SaidaGerador sp;
	
	public GeradorDeCodigo(SaidaGerador s){
		this.sp = s;
	}
	
	@Override
	public String visitInicio(InicioContext ctx) {
		
		sp.println("# -*- coding: utf-8 -*-");
		sp.println("#!/usr/bin/env python\n\n");
		sp.println("#Geraçao de codigo LGraph\n\n");
		sp.println("import networkx as nx\n");
		
		return null;
	}

	@Override
	public String visitPrograma(ProgramaContext ctx) {
		// TODO Auto-generated method stub
		return super.visitPrograma(ctx);
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
		// TODO Auto-generated method stub
		return super.visitComandos(ctx);
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
	public String visitCmd(CmdContext ctx) {
		// TODO Auto-generated method stub
		return super.visitCmd(ctx);
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
	public String visitAtribuicao(AtribuicaoContext ctx) {
		// TODO Auto-generated method stub
		return super.visitAtribuicao(ctx);
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
