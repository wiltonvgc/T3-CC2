// Generated from LGraph.g4 by ANTLR 4.6
package gramatica;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link LGraphParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface LGraphVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link LGraphParser#inicio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicio(LGraphParser.InicioContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(LGraphParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(LGraphParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(LGraphParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(LGraphParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#comandos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComandos(LGraphParser.ComandosContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#objeto_metrica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjeto_metrica(LGraphParser.Objeto_metricaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#salvar_opcional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSalvar_opcional(LGraphParser.Salvar_opcionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#arquivo_grafo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArquivo_grafo(LGraphParser.Arquivo_grafoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#metrica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetrica(LGraphParser.MetricaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(LGraphParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#parametros_create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_create(LGraphParser.Parametros_createContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#parametros_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_update(LGraphParser.Parametros_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#valor_parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_parametro(LGraphParser.Valor_parametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(LGraphParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#atribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtribuicao(LGraphParser.AtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#edges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEdges(LGraphParser.EdgesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#tupla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupla(LGraphParser.TuplaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#tipos_tupla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos_tupla(LGraphParser.Tipos_tuplaContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#tipos_tupla_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipos_tupla_op(LGraphParser.Tipos_tupla_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#parametros_nodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros_nodes(LGraphParser.Parametros_nodesContext ctx);
	/**
	 * Visit a parse tree produced by {@link LGraphParser#nodes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodes(LGraphParser.NodesContext ctx);
}