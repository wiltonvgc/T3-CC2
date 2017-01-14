// Generated from LGraph.g4 by ANTLR 4.6
package gramatica;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LGraphParser}.
 */
public interface LGraphListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LGraphParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(LGraphParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(LGraphParser.InicioContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(LGraphParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(LGraphParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(LGraphParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(LGraphParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(LGraphParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(LGraphParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(LGraphParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(LGraphParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#comandos}.
	 * @param ctx the parse tree
	 */
	void enterComandos(LGraphParser.ComandosContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#comandos}.
	 * @param ctx the parse tree
	 */
	void exitComandos(LGraphParser.ComandosContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#objeto_metrica}.
	 * @param ctx the parse tree
	 */
	void enterObjeto_metrica(LGraphParser.Objeto_metricaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#objeto_metrica}.
	 * @param ctx the parse tree
	 */
	void exitObjeto_metrica(LGraphParser.Objeto_metricaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#salvar_opcional}.
	 * @param ctx the parse tree
	 */
	void enterSalvar_opcional(LGraphParser.Salvar_opcionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#salvar_opcional}.
	 * @param ctx the parse tree
	 */
	void exitSalvar_opcional(LGraphParser.Salvar_opcionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#arquivo_grafo}.
	 * @param ctx the parse tree
	 */
	void enterArquivo_grafo(LGraphParser.Arquivo_grafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#arquivo_grafo}.
	 * @param ctx the parse tree
	 */
	void exitArquivo_grafo(LGraphParser.Arquivo_grafoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#metrica}.
	 * @param ctx the parse tree
	 */
	void enterMetrica(LGraphParser.MetricaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#metrica}.
	 * @param ctx the parse tree
	 */
	void exitMetrica(LGraphParser.MetricaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(LGraphParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(LGraphParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#parametros_create}.
	 * @param ctx the parse tree
	 */
	void enterParametros_create(LGraphParser.Parametros_createContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#parametros_create}.
	 * @param ctx the parse tree
	 */
	void exitParametros_create(LGraphParser.Parametros_createContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#parametros_update}.
	 * @param ctx the parse tree
	 */
	void enterParametros_update(LGraphParser.Parametros_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#parametros_update}.
	 * @param ctx the parse tree
	 */
	void exitParametros_update(LGraphParser.Parametros_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#valor_parametro}.
	 * @param ctx the parse tree
	 */
	void enterValor_parametro(LGraphParser.Valor_parametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#valor_parametro}.
	 * @param ctx the parse tree
	 */
	void exitValor_parametro(LGraphParser.Valor_parametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(LGraphParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(LGraphParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicao(LGraphParser.AtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#atribuicao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicao(LGraphParser.AtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#edges}.
	 * @param ctx the parse tree
	 */
	void enterEdges(LGraphParser.EdgesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#edges}.
	 * @param ctx the parse tree
	 */
	void exitEdges(LGraphParser.EdgesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#tupla}.
	 * @param ctx the parse tree
	 */
	void enterTupla(LGraphParser.TuplaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#tupla}.
	 * @param ctx the parse tree
	 */
	void exitTupla(LGraphParser.TuplaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#tipos_tupla}.
	 * @param ctx the parse tree
	 */
	void enterTipos_tupla(LGraphParser.Tipos_tuplaContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#tipos_tupla}.
	 * @param ctx the parse tree
	 */
	void exitTipos_tupla(LGraphParser.Tipos_tuplaContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#tipos_tupla_op}.
	 * @param ctx the parse tree
	 */
	void enterTipos_tupla_op(LGraphParser.Tipos_tupla_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#tipos_tupla_op}.
	 * @param ctx the parse tree
	 */
	void exitTipos_tupla_op(LGraphParser.Tipos_tupla_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#parametros_nodes}.
	 * @param ctx the parse tree
	 */
	void enterParametros_nodes(LGraphParser.Parametros_nodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#parametros_nodes}.
	 * @param ctx the parse tree
	 */
	void exitParametros_nodes(LGraphParser.Parametros_nodesContext ctx);
	/**
	 * Enter a parse tree produced by {@link LGraphParser#nodes}.
	 * @param ctx the parse tree
	 */
	void enterNodes(LGraphParser.NodesContext ctx);
	/**
	 * Exit a parse tree produced by {@link LGraphParser#nodes}.
	 * @param ctx the parse tree
	 */
	void exitNodes(LGraphParser.NodesContext ctx);
}