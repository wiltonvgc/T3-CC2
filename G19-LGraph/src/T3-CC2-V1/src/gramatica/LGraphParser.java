// Generated from LGraph.g4 by ANTLR 4.6
package gramatica;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class LGraphParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, T__33=34, T__34=35, T__35=36, T__36=37, T__37=38, 
		T__38=39, T__39=40, T__40=41, T__41=42, T__42=43, T__43=44, T__44=45, 
		T__45=46, FINAL=47, INICIO=48, IDENT=49, NUM_INT=50, NUM_REAL=51, STRING=52, 
		WS=53, COMENTARIO=54;
	public static final int
		RULE_inicio = 0, RULE_programa = 1, RULE_corpo = 2, RULE_declaracoes = 3, 
		RULE_variavel = 4, RULE_nodes_atributos = 5, RULE_tipo_atributo_node = 6, 
		RULE_comandos = 7, RULE_objeto_metrica = 8, RULE_salvar_opcional = 9, 
		RULE_arquivo_grafo = 10, RULE_metrica = 11, RULE_caminho = 12, RULE_cmd = 13, 
		RULE_corpo_for = 14, RULE_comandos_for = 15, RULE_corpo_if = 16, RULE_comandos_if = 17, 
		RULE_atribuicao_for = 18, RULE_imprimir = 19, RULE_corpo_else = 20, RULE_expressao_if = 21, 
		RULE_exp_relacional = 22, RULE_mais_exp = 23, RULE_op_logico = 24, RULE_op_relacional = 25, 
		RULE_exp_igualdade = 26, RULE_op_igualdade = 27, RULE_parametros_create = 28, 
		RULE_parametros_update = 29, RULE_valor_parametro = 30, RULE_tipo = 31, 
		RULE_atribuicao = 32, RULE_nodes_atributos_atribuicao = 33, RULE_atributos_nodes_v = 34, 
		RULE_edges = 35, RULE_tupla = 36, RULE_tipos_tupla = 37, RULE_tipos_tupla_op = 38, 
		RULE_parametros_nodes = 39, RULE_nodes = 40;
	public static final String[] ruleNames = {
		"inicio", "programa", "corpo", "declaracoes", "variavel", "nodes_atributos", 
		"tipo_atributo_node", "comandos", "objeto_metrica", "salvar_opcional", 
		"arquivo_grafo", "metrica", "caminho", "cmd", "corpo_for", "comandos_for", 
		"corpo_if", "comandos_if", "atribuicao_for", "imprimir", "corpo_else", 
		"expressao_if", "exp_relacional", "mais_exp", "op_logico", "op_relacional", 
		"exp_igualdade", "op_igualdade", "parametros_create", "parametros_update", 
		"valor_parametro", "tipo", "atribuicao", "nodes_atributos_atribuicao", 
		"atributos_nodes_v", "edges", "tupla", "tipos_tupla", "tipos_tupla_op", 
		"parametros_nodes", "nodes"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'data'", "','", "':'", "'nodes'", "'('", "')'", "'float'", "'int'", 
		"'string'", "'vertex'", "'in'", "'graph'", "'save'", "'from'", "'file'", 
		"'degree'", "'degree_centrality'", "'average_node_connectivity'", "'edge_connectivity'", 
		"'node_connectivity'", "'MST'", "'CM'", "'create'", "'read'", "'update'", 
		"'with'", "'find'", "'of'", "'plot'", "'foreach'", "'='", "'if'", "'else'", 
		"'.'", "'print'", "'AND'", "'OR'", "'<'", "'>'", "'<='", "'>='", "'=='", 
		"'!='", "'edges'", "'['", "']'", "'end'", "'begin'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, "FINAL", 
		"INICIO", "IDENT", "NUM_INT", "NUM_REAL", "STRING", "WS", "COMENTARIO"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "LGraph.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public LGraphParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InicioContext extends ParserRuleContext {
		public ProgramaContext programa() {
			return getRuleContext(ProgramaContext.class,0);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterInicio(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitInicio(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitInicio(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			programa();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode INICIO() { return getToken(LGraphParser.INICIO, 0); }
		public CorpoContext corpo() {
			return getRuleContext(CorpoContext.class,0);
		}
		public TerminalNode FINAL() { return getToken(LGraphParser.FINAL, 0); }
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_programa);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			match(INICIO);
			setState(85);
			corpo();
			setState(86);
			match(FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CorpoContext extends ParserRuleContext {
		public DeclaracoesContext declaracoes() {
			return getRuleContext(DeclaracoesContext.class,0);
		}
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
		}
		public CorpoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterCorpo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitCorpo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitCorpo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CorpoContext corpo() throws RecognitionException {
		CorpoContext _localctx = new CorpoContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_corpo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			declaracoes();
			setState(89);
			comandos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class DeclaracoesContext extends ParserRuleContext {
		public VariavelContext dec1;
		public VariavelContext variavel;
		public List<VariavelContext> outrasDecs = new ArrayList<VariavelContext>();
		public List<VariavelContext> variavel() {
			return getRuleContexts(VariavelContext.class);
		}
		public VariavelContext variavel(int i) {
			return getRuleContext(VariavelContext.class,i);
		}
		public DeclaracoesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracoes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterDeclaracoes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitDeclaracoes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitDeclaracoes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracoesContext declaracoes() throws RecognitionException {
		DeclaracoesContext _localctx = new DeclaracoesContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaracoes);
		int _la;
		try {
			setState(101);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				enterOuterAlt(_localctx, 1);
				{
				setState(91);
				match(T__0);
				setState(92);
				((DeclaracoesContext)_localctx).dec1 = variavel();
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(93);
					match(T__1);
					setState(94);
					((DeclaracoesContext)_localctx).variavel = variavel();
					((DeclaracoesContext)_localctx).outrasDecs.add(((DeclaracoesContext)_localctx).variavel);
					}
					}
					setState(99);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case T__22:
			case T__23:
			case T__24:
			case T__26:
			case T__28:
			case T__29:
			case T__34:
			case FINAL:
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariavelContext extends ParserRuleContext {
		public Token var1;
		public Token IDENT;
		public List<Token> outrasVars = new ArrayList<Token>();
		public TipoContext t;
		public Nodes_atributosContext nt;
		public List<TerminalNode> IDENT() { return getTokens(LGraphParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LGraphParser.IDENT, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public Nodes_atributosContext nodes_atributos() {
			return getRuleContext(Nodes_atributosContext.class,0);
		}
		public VariavelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variavel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterVariavel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitVariavel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitVariavel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariavelContext variavel() throws RecognitionException {
		VariavelContext _localctx = new VariavelContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_variavel);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			((VariavelContext)_localctx).var1 = match(IDENT);
			setState(108);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(104);
				match(T__1);
				setState(105);
				((VariavelContext)_localctx).IDENT = match(IDENT);
				((VariavelContext)_localctx).outrasVars.add(((VariavelContext)_localctx).IDENT);
				}
				}
				setState(110);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			match(T__2);
			setState(114);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				{
				setState(112);
				((VariavelContext)_localctx).t = tipo();
				}
				break;
			case 2:
				{
				setState(113);
				((VariavelContext)_localctx).nt = nodes_atributos();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nodes_atributosContext extends ParserRuleContext {
		public Token at1;
		public Tipo_atributo_nodeContext tan1;
		public Token IDENT;
		public List<Token> ats = new ArrayList<Token>();
		public Tipo_atributo_nodeContext tipo_atributo_node;
		public List<Tipo_atributo_nodeContext> tans = new ArrayList<Tipo_atributo_nodeContext>();
		public List<TerminalNode> IDENT() { return getTokens(LGraphParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LGraphParser.IDENT, i);
		}
		public List<Tipo_atributo_nodeContext> tipo_atributo_node() {
			return getRuleContexts(Tipo_atributo_nodeContext.class);
		}
		public Tipo_atributo_nodeContext tipo_atributo_node(int i) {
			return getRuleContext(Tipo_atributo_nodeContext.class,i);
		}
		public Nodes_atributosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodes_atributos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterNodes_atributos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitNodes_atributos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitNodes_atributos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nodes_atributosContext nodes_atributos() throws RecognitionException {
		Nodes_atributosContext _localctx = new Nodes_atributosContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nodes_atributos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			match(T__3);
			setState(117);
			match(T__4);
			setState(118);
			((Nodes_atributosContext)_localctx).at1 = match(IDENT);
			setState(119);
			match(T__2);
			setState(120);
			((Nodes_atributosContext)_localctx).tan1 = tipo_atributo_node();
			setState(127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(121);
				match(T__1);
				setState(122);
				((Nodes_atributosContext)_localctx).IDENT = match(IDENT);
				((Nodes_atributosContext)_localctx).ats.add(((Nodes_atributosContext)_localctx).IDENT);
				setState(123);
				match(T__2);
				setState(124);
				((Nodes_atributosContext)_localctx).tipo_atributo_node = tipo_atributo_node();
				((Nodes_atributosContext)_localctx).tans.add(((Nodes_atributosContext)_localctx).tipo_atributo_node);
				}
				}
				setState(129);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(130);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipo_atributo_nodeContext extends ParserRuleContext {
		public Tipo_atributo_nodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_atributo_node; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterTipo_atributo_node(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitTipo_atributo_node(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitTipo_atributo_node(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_atributo_nodeContext tipo_atributo_node() throws RecognitionException {
		Tipo_atributo_nodeContext _localctx = new Tipo_atributo_nodeContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo_atributo_node);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComandosContext extends ParserRuleContext {
		public CmdContext cmd;
		public List<CmdContext> cmds = new ArrayList<CmdContext>();
		public List<CmdContext> cmd() {
			return getRuleContexts(CmdContext.class);
		}
		public CmdContext cmd(int i) {
			return getRuleContext(CmdContext.class,i);
		}
		public ComandosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterComandos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitComandos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitComandos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComandosContext comandos() throws RecognitionException {
		ComandosContext _localctx = new ComandosContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << T__34) | (1L << IDENT))) != 0)) {
				{
				{
				setState(134);
				((ComandosContext)_localctx).cmd = cmd();
				((ComandosContext)_localctx).cmds.add(((ComandosContext)_localctx).cmd);
				}
				}
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Objeto_metricaContext extends ParserRuleContext {
		public Token v;
		public Token id_vert;
		public Token id_graph;
		public TerminalNode STRING() { return getToken(LGraphParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(LGraphParser.IDENT, 0); }
		public Objeto_metricaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto_metrica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterObjeto_metrica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitObjeto_metrica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitObjeto_metrica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Objeto_metricaContext objeto_metrica() throws RecognitionException {
		Objeto_metricaContext _localctx = new Objeto_metricaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_objeto_metrica);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(140);
				match(T__9);
				setState(141);
				((Objeto_metricaContext)_localctx).v = match(STRING);
				setState(142);
				match(T__10);
				setState(143);
				match(T__11);
				setState(144);
				((Objeto_metricaContext)_localctx).id_vert = match(IDENT);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(145);
				match(T__11);
				setState(146);
				((Objeto_metricaContext)_localctx).id_graph = match(IDENT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Salvar_opcionalContext extends ParserRuleContext {
		public Salvar_opcionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_salvar_opcional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterSalvar_opcional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitSalvar_opcional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitSalvar_opcional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Salvar_opcionalContext salvar_opcional() throws RecognitionException {
		Salvar_opcionalContext _localctx = new Salvar_opcionalContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_salvar_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(149);
				match(T__12);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Arquivo_grafoContext extends ParserRuleContext {
		public Token id;
		public Token str;
		public TerminalNode IDENT() { return getToken(LGraphParser.IDENT, 0); }
		public TerminalNode STRING() { return getToken(LGraphParser.STRING, 0); }
		public Arquivo_grafoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arquivo_grafo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterArquivo_grafo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitArquivo_grafo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitArquivo_grafo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Arquivo_grafoContext arquivo_grafo() throws RecognitionException {
		Arquivo_grafoContext _localctx = new Arquivo_grafoContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_arquivo_grafo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__13);
			setState(153);
			match(T__14);
			setState(156);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(154);
				((Arquivo_grafoContext)_localctx).id = match(IDENT);
				}
				break;
			case STRING:
				{
				setState(155);
				((Arquivo_grafoContext)_localctx).str = match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class MetricaContext extends ParserRuleContext {
		public MetricaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metrica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterMetrica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitMetrica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitMetrica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetricaContext metrica() throws RecognitionException {
		MetricaContext _localctx = new MetricaContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_metrica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CaminhoContext extends ParserRuleContext {
		public CaminhoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caminho; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterCaminho(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitCaminho(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitCaminho(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaminhoContext caminho() throws RecognitionException {
		CaminhoContext _localctx = new CaminhoContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_caminho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !(_la==T__20 || _la==T__21) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CmdContext extends ParserRuleContext {
		public Token id_grafo;
		public Token id_gf;
		public Token id_grafo_up;
		public Token id_plot;
		public Token id;
		public Token g_id;
		public Corpo_forContext cf;
		public Token id1;
		public Parametros_createContext parametros_create() {
			return getRuleContext(Parametros_createContext.class,0);
		}
		public List<TerminalNode> IDENT() { return getTokens(LGraphParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LGraphParser.IDENT, i);
		}
		public Arquivo_grafoContext arquivo_grafo() {
			return getRuleContext(Arquivo_grafoContext.class,0);
		}
		public Parametros_updateContext parametros_update() {
			return getRuleContext(Parametros_updateContext.class,0);
		}
		public MetricaContext metrica() {
			return getRuleContext(MetricaContext.class,0);
		}
		public Objeto_metricaContext objeto_metrica() {
			return getRuleContext(Objeto_metricaContext.class,0);
		}
		public Corpo_forContext corpo_for() {
			return getRuleContext(Corpo_forContext.class,0);
		}
		public AtribuicaoContext atribuicao() {
			return getRuleContext(AtribuicaoContext.class,0);
		}
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public CmdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cmd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterCmd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitCmd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitCmd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CmdContext cmd() throws RecognitionException {
		CmdContext _localctx = new CmdContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_cmd);
		try {
			setState(199);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__22:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(T__22);
				setState(163);
				match(T__11);
				setState(164);
				((CmdContext)_localctx).id_grafo = match(IDENT);
				setState(165);
				match(T__4);
				setState(166);
				parametros_create();
				setState(167);
				match(T__5);
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 2);
				{
				setState(169);
				match(T__23);
				setState(170);
				match(T__11);
				setState(171);
				((CmdContext)_localctx).id_gf = match(IDENT);
				setState(172);
				arquivo_grafo();
				}
				break;
			case T__24:
				enterOuterAlt(_localctx, 3);
				{
				setState(173);
				match(T__24);
				setState(174);
				match(T__11);
				setState(175);
				((CmdContext)_localctx).id_grafo_up = match(IDENT);
				setState(176);
				match(T__25);
				setState(177);
				match(T__4);
				setState(178);
				parametros_update();
				setState(179);
				match(T__5);
				}
				break;
			case T__26:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(T__26);
				setState(182);
				metrica();
				setState(183);
				match(T__27);
				setState(184);
				objeto_metrica();
				}
				break;
			case T__28:
				enterOuterAlt(_localctx, 5);
				{
				setState(186);
				match(T__28);
				setState(187);
				match(T__11);
				setState(188);
				((CmdContext)_localctx).id_plot = match(IDENT);
				}
				break;
			case T__29:
				enterOuterAlt(_localctx, 6);
				{
				setState(189);
				match(T__29);
				setState(190);
				match(T__9);
				setState(191);
				((CmdContext)_localctx).id = match(IDENT);
				setState(192);
				match(T__10);
				setState(193);
				((CmdContext)_localctx).g_id = match(IDENT);
				setState(194);
				((CmdContext)_localctx).cf = corpo_for();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 7);
				{
				setState(195);
				((CmdContext)_localctx).id1 = match(IDENT);
				setState(196);
				match(T__30);
				setState(197);
				atribuicao();
				}
				break;
			case T__34:
				enterOuterAlt(_localctx, 8);
				{
				setState(198);
				imprimir();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Corpo_forContext extends ParserRuleContext {
		public Comandos_forContext comandos_for() {
			return getRuleContext(Comandos_forContext.class,0);
		}
		public Corpo_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterCorpo_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitCorpo_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitCorpo_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Corpo_forContext corpo_for() throws RecognitionException {
		Corpo_forContext _localctx = new Corpo_forContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_corpo_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(201);
			match(INICIO);
			setState(202);
			comandos_for();
			setState(203);
			match(FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comandos_forContext extends ParserRuleContext {
		public Expressao_ifContext expressao_if;
		public List<Expressao_ifContext> ctx_if = new ArrayList<Expressao_ifContext>();
		public Corpo_ifContext corpo_if;
		public List<Corpo_ifContext> cif = new ArrayList<Corpo_ifContext>();
		public List<Expressao_ifContext> expressao_if() {
			return getRuleContexts(Expressao_ifContext.class);
		}
		public Expressao_ifContext expressao_if(int i) {
			return getRuleContext(Expressao_ifContext.class,i);
		}
		public List<Corpo_ifContext> corpo_if() {
			return getRuleContexts(Corpo_ifContext.class);
		}
		public Corpo_ifContext corpo_if(int i) {
			return getRuleContext(Corpo_ifContext.class,i);
		}
		public Comandos_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterComandos_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitComandos_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitComandos_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comandos_forContext comandos_for() throws RecognitionException {
		Comandos_forContext _localctx = new Comandos_forContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_comandos_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__31) {
				{
				{
				setState(205);
				match(T__31);
				setState(206);
				match(T__4);
				setState(207);
				((Comandos_forContext)_localctx).expressao_if = expressao_if();
				((Comandos_forContext)_localctx).ctx_if.add(((Comandos_forContext)_localctx).expressao_if);
				setState(208);
				match(T__5);
				setState(209);
				((Comandos_forContext)_localctx).corpo_if = corpo_if();
				((Comandos_forContext)_localctx).cif.add(((Comandos_forContext)_localctx).corpo_if);
				}
				}
				setState(215);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Corpo_ifContext extends ParserRuleContext {
		public Comandos_ifContext comandos_if;
		public List<Comandos_ifContext> coms = new ArrayList<Comandos_ifContext>();
		public Corpo_elseContext celse;
		public List<Comandos_ifContext> comandos_if() {
			return getRuleContexts(Comandos_ifContext.class);
		}
		public Comandos_ifContext comandos_if(int i) {
			return getRuleContext(Comandos_ifContext.class,i);
		}
		public Corpo_elseContext corpo_else() {
			return getRuleContext(Corpo_elseContext.class,0);
		}
		public Corpo_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterCorpo_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitCorpo_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitCorpo_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Corpo_ifContext corpo_if() throws RecognitionException {
		Corpo_ifContext _localctx = new Corpo_ifContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_corpo_if);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(INICIO);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__34 || _la==IDENT) {
				{
				{
				setState(217);
				((Corpo_ifContext)_localctx).comandos_if = comandos_if();
				((Corpo_ifContext)_localctx).coms.add(((Corpo_ifContext)_localctx).comandos_if);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(223);
			match(FINAL);
			setState(226);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__32) {
				{
				setState(224);
				match(T__32);
				setState(225);
				((Corpo_ifContext)_localctx).celse = corpo_else();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Comandos_ifContext extends ParserRuleContext {
		public Token at;
		public ImprimirContext imprimir() {
			return getRuleContext(ImprimirContext.class,0);
		}
		public Atribuicao_forContext atribuicao_for() {
			return getRuleContext(Atribuicao_forContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LGraphParser.IDENT, 0); }
		public Comandos_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comandos_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterComandos_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitComandos_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitComandos_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Comandos_ifContext comandos_if() throws RecognitionException {
		Comandos_ifContext _localctx = new Comandos_ifContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_comandos_if);
		try {
			setState(232);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__34:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				imprimir();
				}
				break;
			case IDENT:
				enterOuterAlt(_localctx, 2);
				{
				setState(229);
				((Comandos_ifContext)_localctx).at = match(IDENT);
				setState(230);
				match(T__30);
				setState(231);
				atribuicao_for();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atribuicao_forContext extends ParserRuleContext {
		public Token id;
		public Token id1;
		public Token id2;
		public TerminalNode NUM_INT() { return getToken(LGraphParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LGraphParser.NUM_REAL, 0); }
		public List<TerminalNode> IDENT() { return getTokens(LGraphParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LGraphParser.IDENT, i);
		}
		public TerminalNode STRING() { return getToken(LGraphParser.STRING, 0); }
		public NodesContext nodes() {
			return getRuleContext(NodesContext.class,0);
		}
		public EdgesContext edges() {
			return getRuleContext(EdgesContext.class,0);
		}
		public Nodes_atributos_atribuicaoContext nodes_atributos_atribuicao() {
			return getRuleContext(Nodes_atributos_atribuicaoContext.class,0);
		}
		public Atribuicao_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterAtribuicao_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitAtribuicao_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitAtribuicao_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atribuicao_forContext atribuicao_for() throws RecognitionException {
		Atribuicao_forContext _localctx = new Atribuicao_forContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_atribuicao_for);
		try {
			setState(244);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(NUM_INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(235);
				match(NUM_REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(236);
				((Atribuicao_forContext)_localctx).id = match(IDENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(237);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(238);
				nodes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(239);
				edges();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(240);
				nodes_atributos_atribuicao();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(241);
				((Atribuicao_forContext)_localctx).id1 = match(IDENT);
				setState(242);
				match(T__33);
				setState(243);
				((Atribuicao_forContext)_localctx).id2 = match(IDENT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImprimirContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(LGraphParser.STRING, 0); }
		public TerminalNode IDENT() { return getToken(LGraphParser.IDENT, 0); }
		public ImprimirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_imprimir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterImprimir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitImprimir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitImprimir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImprimirContext imprimir() throws RecognitionException {
		ImprimirContext _localctx = new ImprimirContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_imprimir);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			match(T__34);
			setState(247);
			match(T__4);
			setState(248);
			_la = _input.LA(1);
			if ( !(_la==IDENT || _la==STRING) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(249);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Corpo_elseContext extends ParserRuleContext {
		public ImprimirContext imprimir;
		public List<ImprimirContext> imp = new ArrayList<ImprimirContext>();
		public List<ImprimirContext> imprimir() {
			return getRuleContexts(ImprimirContext.class);
		}
		public ImprimirContext imprimir(int i) {
			return getRuleContext(ImprimirContext.class,i);
		}
		public Corpo_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_corpo_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterCorpo_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitCorpo_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitCorpo_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Corpo_elseContext corpo_else() throws RecognitionException {
		Corpo_elseContext _localctx = new Corpo_elseContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_corpo_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(251);
			match(INICIO);
			setState(255);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__34) {
				{
				{
				setState(252);
				((Corpo_elseContext)_localctx).imprimir = imprimir();
				((Corpo_elseContext)_localctx).imp.add(((Corpo_elseContext)_localctx).imprimir);
				}
				}
				setState(257);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(258);
			match(FINAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Expressao_ifContext extends ParserRuleContext {
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Exp_igualdadeContext exp_igualdade() {
			return getRuleContext(Exp_igualdadeContext.class,0);
		}
		public Expressao_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressao_if; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterExpressao_if(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitExpressao_if(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitExpressao_if(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Expressao_ifContext expressao_if() throws RecognitionException {
		Expressao_ifContext _localctx = new Expressao_ifContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_expressao_if);
		try {
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(260);
				exp_relacional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(261);
				exp_igualdade();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_relacionalContext extends ParserRuleContext {
		public Token op1_int;
		public Token op1_real;
		public Token op1_v;
		public Token at1;
		public Token op1_id;
		public Op_relacionalContext op;
		public Token op2_int;
		public Token op2_real;
		public Token op2_v;
		public Token at2;
		public Token op2_id;
		public Mais_expContext mais_exp;
		public List<Mais_expContext> mais = new ArrayList<Mais_expContext>();
		public Op_relacionalContext op_relacional() {
			return getRuleContext(Op_relacionalContext.class,0);
		}
		public List<TerminalNode> NUM_INT() { return getTokens(LGraphParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(LGraphParser.NUM_INT, i);
		}
		public List<TerminalNode> NUM_REAL() { return getTokens(LGraphParser.NUM_REAL); }
		public TerminalNode NUM_REAL(int i) {
			return getToken(LGraphParser.NUM_REAL, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(LGraphParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LGraphParser.IDENT, i);
		}
		public List<Mais_expContext> mais_exp() {
			return getRuleContexts(Mais_expContext.class);
		}
		public Mais_expContext mais_exp(int i) {
			return getRuleContext(Mais_expContext.class,i);
		}
		public Exp_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterExp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitExp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitExp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_relacionalContext exp_relacional() throws RecognitionException {
		Exp_relacionalContext _localctx = new Exp_relacionalContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_exp_relacional);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(264);
				((Exp_relacionalContext)_localctx).op1_int = match(NUM_INT);
				}
				break;
			case 2:
				{
				setState(265);
				((Exp_relacionalContext)_localctx).op1_real = match(NUM_REAL);
				}
				break;
			case 3:
				{
				{
				setState(266);
				((Exp_relacionalContext)_localctx).op1_v = match(IDENT);
				setState(267);
				match(T__33);
				setState(268);
				((Exp_relacionalContext)_localctx).at1 = match(IDENT);
				}
				}
				break;
			case 4:
				{
				setState(269);
				((Exp_relacionalContext)_localctx).op1_id = match(IDENT);
				}
				break;
			}
			setState(272);
			((Exp_relacionalContext)_localctx).op = op_relacional();
			setState(279);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				{
				setState(273);
				((Exp_relacionalContext)_localctx).op2_int = match(NUM_INT);
				}
				break;
			case 2:
				{
				setState(274);
				((Exp_relacionalContext)_localctx).op2_real = match(NUM_REAL);
				}
				break;
			case 3:
				{
				setState(275);
				((Exp_relacionalContext)_localctx).op2_v = match(IDENT);
				setState(276);
				match(T__33);
				setState(277);
				((Exp_relacionalContext)_localctx).at2 = match(IDENT);
				}
				break;
			case 4:
				{
				setState(278);
				((Exp_relacionalContext)_localctx).op2_id = match(IDENT);
				}
				break;
			}
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(281);
					((Exp_relacionalContext)_localctx).mais_exp = mais_exp();
					((Exp_relacionalContext)_localctx).mais.add(((Exp_relacionalContext)_localctx).mais_exp);
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,19,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Mais_expContext extends ParserRuleContext {
		public Op_logicoContext op_logico() {
			return getRuleContext(Op_logicoContext.class,0);
		}
		public Exp_relacionalContext exp_relacional() {
			return getRuleContext(Exp_relacionalContext.class,0);
		}
		public Exp_igualdadeContext exp_igualdade() {
			return getRuleContext(Exp_igualdadeContext.class,0);
		}
		public Mais_expContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mais_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterMais_exp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitMais_exp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitMais_exp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Mais_expContext mais_exp() throws RecognitionException {
		Mais_expContext _localctx = new Mais_expContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_mais_exp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(287);
			op_logico();
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(288);
				exp_relacional();
				}
				break;
			case 2:
				{
				setState(289);
				exp_igualdade();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_logicoContext extends ParserRuleContext {
		public Op_logicoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_logico; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterOp_logico(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitOp_logico(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitOp_logico(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_logicoContext op_logico() throws RecognitionException {
		Op_logicoContext _localctx = new Op_logicoContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_op_logico);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			_la = _input.LA(1);
			if ( !(_la==T__35 || _la==T__36) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_relacionalContext extends ParserRuleContext {
		public Op_relacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_relacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterOp_relacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitOp_relacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitOp_relacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_relacionalContext op_relacional() throws RecognitionException {
		Op_relacionalContext _localctx = new Op_relacionalContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(294);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__37) | (1L << T__38) | (1L << T__39) | (1L << T__40))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Exp_igualdadeContext extends ParserRuleContext {
		public Token op1_int;
		public Token op1_real;
		public Token op1_v;
		public Token at1;
		public Token op1_id;
		public Token op1_s;
		public Op_igualdadeContext op;
		public Token op2_int;
		public Token op2_real;
		public Token op2_id;
		public Token op2_s;
		public Token op2_v;
		public Token at2;
		public Mais_expContext mais_exp;
		public List<Mais_expContext> mais = new ArrayList<Mais_expContext>();
		public Op_igualdadeContext op_igualdade() {
			return getRuleContext(Op_igualdadeContext.class,0);
		}
		public List<TerminalNode> NUM_INT() { return getTokens(LGraphParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(LGraphParser.NUM_INT, i);
		}
		public List<TerminalNode> NUM_REAL() { return getTokens(LGraphParser.NUM_REAL); }
		public TerminalNode NUM_REAL(int i) {
			return getToken(LGraphParser.NUM_REAL, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(LGraphParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LGraphParser.IDENT, i);
		}
		public List<TerminalNode> STRING() { return getTokens(LGraphParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LGraphParser.STRING, i);
		}
		public List<Mais_expContext> mais_exp() {
			return getRuleContexts(Mais_expContext.class);
		}
		public Mais_expContext mais_exp(int i) {
			return getRuleContext(Mais_expContext.class,i);
		}
		public Exp_igualdadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp_igualdade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterExp_igualdade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitExp_igualdade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitExp_igualdade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exp_igualdadeContext exp_igualdade() throws RecognitionException {
		Exp_igualdadeContext _localctx = new Exp_igualdadeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_exp_igualdade);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(303);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(296);
				((Exp_igualdadeContext)_localctx).op1_int = match(NUM_INT);
				}
				break;
			case 2:
				{
				setState(297);
				((Exp_igualdadeContext)_localctx).op1_real = match(NUM_REAL);
				}
				break;
			case 3:
				{
				setState(298);
				((Exp_igualdadeContext)_localctx).op1_v = match(IDENT);
				setState(299);
				match(T__33);
				setState(300);
				((Exp_igualdadeContext)_localctx).at1 = match(IDENT);
				}
				break;
			case 4:
				{
				setState(301);
				((Exp_igualdadeContext)_localctx).op1_id = match(IDENT);
				}
				break;
			case 5:
				{
				setState(302);
				((Exp_igualdadeContext)_localctx).op1_s = match(STRING);
				}
				break;
			}
			setState(305);
			((Exp_igualdadeContext)_localctx).op = op_igualdade();
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				{
				setState(306);
				((Exp_igualdadeContext)_localctx).op2_int = match(NUM_INT);
				}
				break;
			case 2:
				{
				setState(307);
				((Exp_igualdadeContext)_localctx).op2_real = match(NUM_REAL);
				}
				break;
			case 3:
				{
				setState(308);
				((Exp_igualdadeContext)_localctx).op2_id = match(IDENT);
				}
				break;
			case 4:
				{
				setState(309);
				((Exp_igualdadeContext)_localctx).op2_s = match(STRING);
				}
				break;
			case 5:
				{
				setState(310);
				((Exp_igualdadeContext)_localctx).op2_v = match(IDENT);
				setState(311);
				match(T__33);
				setState(312);
				((Exp_igualdadeContext)_localctx).at2 = match(IDENT);
				}
				break;
			}
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(315);
					((Exp_igualdadeContext)_localctx).mais_exp = mais_exp();
					((Exp_igualdadeContext)_localctx).mais.add(((Exp_igualdadeContext)_localctx).mais_exp);
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Op_igualdadeContext extends ParserRuleContext {
		public Op_igualdadeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_op_igualdade; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterOp_igualdade(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitOp_igualdade(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitOp_igualdade(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Op_igualdadeContext op_igualdade() throws RecognitionException {
		Op_igualdadeContext _localctx = new Op_igualdadeContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_op_igualdade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			_la = _input.LA(1);
			if ( !(_la==T__41 || _la==T__42) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parametros_createContext extends ParserRuleContext {
		public Valor_parametroContext v2;
		public Valor_parametroContext v3;
		public List<Valor_parametroContext> valor_parametro() {
			return getRuleContexts(Valor_parametroContext.class);
		}
		public Valor_parametroContext valor_parametro(int i) {
			return getRuleContext(Valor_parametroContext.class,i);
		}
		public Parametros_createContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_create; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterParametros_create(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitParametros_create(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitParametros_create(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_createContext parametros_create() throws RecognitionException {
		Parametros_createContext _localctx = new Parametros_createContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_parametros_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(323);
			match(T__3);
			setState(324);
			match(T__30);
			setState(325);
			((Parametros_createContext)_localctx).v2 = valor_parametro();
			setState(326);
			match(T__1);
			setState(327);
			match(T__43);
			setState(328);
			match(T__30);
			setState(329);
			((Parametros_createContext)_localctx).v3 = valor_parametro();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parametros_updateContext extends ParserRuleContext {
		public Valor_parametroContext v1;
		public Valor_parametroContext v2;
		public List<Valor_parametroContext> valor_parametro() {
			return getRuleContexts(Valor_parametroContext.class);
		}
		public Valor_parametroContext valor_parametro(int i) {
			return getRuleContext(Valor_parametroContext.class,i);
		}
		public Parametros_updateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_update; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterParametros_update(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitParametros_update(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitParametros_update(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_updateContext parametros_update() throws RecognitionException {
		Parametros_updateContext _localctx = new Parametros_updateContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_parametros_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(331);
			match(T__3);
			setState(332);
			match(T__30);
			setState(333);
			((Parametros_updateContext)_localctx).v1 = valor_parametro();
			setState(334);
			match(T__1);
			setState(335);
			match(T__43);
			setState(336);
			match(T__30);
			setState(337);
			((Parametros_updateContext)_localctx).v2 = valor_parametro();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Valor_parametroContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(LGraphParser.IDENT, 0); }
		public Valor_parametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterValor_parametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitValor_parametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitValor_parametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_parametroContext valor_parametro() throws RecognitionException {
		Valor_parametroContext _localctx = new Valor_parametroContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_valor_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(339);
			match(IDENT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TipoContext extends ParserRuleContext {
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(341);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__43))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AtribuicaoContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(LGraphParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LGraphParser.NUM_REAL, 0); }
		public TerminalNode IDENT() { return getToken(LGraphParser.IDENT, 0); }
		public TerminalNode STRING() { return getToken(LGraphParser.STRING, 0); }
		public NodesContext nodes() {
			return getRuleContext(NodesContext.class,0);
		}
		public EdgesContext edges() {
			return getRuleContext(EdgesContext.class,0);
		}
		public Nodes_atributos_atribuicaoContext nodes_atributos_atribuicao() {
			return getRuleContext(Nodes_atributos_atribuicaoContext.class,0);
		}
		public AtribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterAtribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitAtribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitAtribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AtribuicaoContext atribuicao() throws RecognitionException {
		AtribuicaoContext _localctx = new AtribuicaoContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_atribuicao);
		try {
			setState(350);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(343);
				match(NUM_INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(344);
				match(NUM_REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(345);
				match(IDENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(346);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(347);
				nodes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(348);
				edges();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(349);
				nodes_atributos_atribuicao();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Nodes_atributos_atribuicaoContext extends ParserRuleContext {
		public Token id;
		public Token IDENT;
		public List<Token> ats1 = new ArrayList<Token>();
		public Token NUM_INT;
		public List<Token> t = new ArrayList<Token>();
		public Token NUM_REAL;
		public Token STRING;
		public Atributos_nodes_vContext atributos_nodes_v;
		public List<Atributos_nodes_vContext> atrn = new ArrayList<Atributos_nodes_vContext>();
		public List<Atributos_nodes_vContext> atributos_nodes_v() {
			return getRuleContexts(Atributos_nodes_vContext.class);
		}
		public Atributos_nodes_vContext atributos_nodes_v(int i) {
			return getRuleContext(Atributos_nodes_vContext.class,i);
		}
		public List<TerminalNode> NUM_INT() { return getTokens(LGraphParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(LGraphParser.NUM_INT, i);
		}
		public List<TerminalNode> NUM_REAL() { return getTokens(LGraphParser.NUM_REAL); }
		public TerminalNode NUM_REAL(int i) {
			return getToken(LGraphParser.NUM_REAL, i);
		}
		public List<TerminalNode> STRING() { return getTokens(LGraphParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LGraphParser.STRING, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(LGraphParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LGraphParser.IDENT, i);
		}
		public Nodes_atributos_atribuicaoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodes_atributos_atribuicao; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterNodes_atributos_atribuicao(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitNodes_atributos_atribuicao(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitNodes_atributos_atribuicao(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Nodes_atributos_atribuicaoContext nodes_atributos_atribuicao() throws RecognitionException {
		Nodes_atributos_atribuicaoContext _localctx = new Nodes_atributos_atribuicaoContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_nodes_atributos_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(352);
			match(T__44);
			{
			setState(353);
			match(T__4);
			setState(357);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				{
				setState(354);
				((Nodes_atributos_atribuicaoContext)_localctx).id = match(NUM_INT);
				}
				break;
			case NUM_REAL:
				{
				setState(355);
				((Nodes_atributos_atribuicaoContext)_localctx).id = match(NUM_REAL);
				}
				break;
			case STRING:
				{
				setState(356);
				((Nodes_atributos_atribuicaoContext)_localctx).id = match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(367); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(359);
				match(T__1);
				setState(360);
				((Nodes_atributos_atribuicaoContext)_localctx).IDENT = match(IDENT);
				((Nodes_atributos_atribuicaoContext)_localctx).ats1.add(((Nodes_atributos_atribuicaoContext)_localctx).IDENT);
				setState(361);
				match(T__30);
				setState(365);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM_INT:
					{
					setState(362);
					((Nodes_atributos_atribuicaoContext)_localctx).NUM_INT = match(NUM_INT);
					((Nodes_atributos_atribuicaoContext)_localctx).t.add(((Nodes_atributos_atribuicaoContext)_localctx).NUM_INT);
					}
					break;
				case NUM_REAL:
					{
					setState(363);
					((Nodes_atributos_atribuicaoContext)_localctx).NUM_REAL = match(NUM_REAL);
					((Nodes_atributos_atribuicaoContext)_localctx).t.add(((Nodes_atributos_atribuicaoContext)_localctx).NUM_REAL);
					}
					break;
				case STRING:
					{
					setState(364);
					((Nodes_atributos_atribuicaoContext)_localctx).STRING = match(STRING);
					((Nodes_atributos_atribuicaoContext)_localctx).t.add(((Nodes_atributos_atribuicaoContext)_localctx).STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(369); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(371);
			match(T__5);
			}
			setState(376);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(373);
				((Nodes_atributos_atribuicaoContext)_localctx).atributos_nodes_v = atributos_nodes_v();
				((Nodes_atributos_atribuicaoContext)_localctx).atrn.add(((Nodes_atributos_atribuicaoContext)_localctx).atributos_nodes_v);
				}
				}
				setState(378);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(379);
			match(T__45);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Atributos_nodes_vContext extends ParserRuleContext {
		public Token id;
		public Token IDENT;
		public List<Token> atsn = new ArrayList<Token>();
		public Token NUM_INT;
		public List<Token> t = new ArrayList<Token>();
		public Token NUM_REAL;
		public Token STRING;
		public List<TerminalNode> NUM_INT() { return getTokens(LGraphParser.NUM_INT); }
		public TerminalNode NUM_INT(int i) {
			return getToken(LGraphParser.NUM_INT, i);
		}
		public List<TerminalNode> NUM_REAL() { return getTokens(LGraphParser.NUM_REAL); }
		public TerminalNode NUM_REAL(int i) {
			return getToken(LGraphParser.NUM_REAL, i);
		}
		public List<TerminalNode> STRING() { return getTokens(LGraphParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LGraphParser.STRING, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(LGraphParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LGraphParser.IDENT, i);
		}
		public Atributos_nodes_vContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atributos_nodes_v; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterAtributos_nodes_v(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitAtributos_nodes_v(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitAtributos_nodes_v(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Atributos_nodes_vContext atributos_nodes_v() throws RecognitionException {
		Atributos_nodes_vContext _localctx = new Atributos_nodes_vContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_atributos_nodes_v);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			match(T__1);
			setState(382);
			match(T__4);
			setState(386);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				{
				setState(383);
				((Atributos_nodes_vContext)_localctx).id = match(NUM_INT);
				}
				break;
			case NUM_REAL:
				{
				setState(384);
				((Atributos_nodes_vContext)_localctx).id = match(NUM_REAL);
				}
				break;
			case STRING:
				{
				setState(385);
				((Atributos_nodes_vContext)_localctx).id = match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(396); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(388);
				match(T__1);
				setState(389);
				((Atributos_nodes_vContext)_localctx).IDENT = match(IDENT);
				((Atributos_nodes_vContext)_localctx).atsn.add(((Atributos_nodes_vContext)_localctx).IDENT);
				setState(390);
				match(T__30);
				setState(394);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM_INT:
					{
					setState(391);
					((Atributos_nodes_vContext)_localctx).NUM_INT = match(NUM_INT);
					((Atributos_nodes_vContext)_localctx).t.add(((Atributos_nodes_vContext)_localctx).NUM_INT);
					}
					break;
				case NUM_REAL:
					{
					setState(392);
					((Atributos_nodes_vContext)_localctx).NUM_REAL = match(NUM_REAL);
					((Atributos_nodes_vContext)_localctx).t.add(((Atributos_nodes_vContext)_localctx).NUM_REAL);
					}
					break;
				case STRING:
					{
					setState(393);
					((Atributos_nodes_vContext)_localctx).STRING = match(STRING);
					((Atributos_nodes_vContext)_localctx).t.add(((Atributos_nodes_vContext)_localctx).STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(398); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(400);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EdgesContext extends ParserRuleContext {
		public List<TuplaContext> tupla() {
			return getRuleContexts(TuplaContext.class);
		}
		public TuplaContext tupla(int i) {
			return getRuleContext(TuplaContext.class,i);
		}
		public EdgesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_edges; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterEdges(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitEdges(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitEdges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EdgesContext edges() throws RecognitionException {
		EdgesContext _localctx = new EdgesContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_edges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(402);
			match(T__44);
			setState(403);
			tupla();
			setState(408);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(404);
				match(T__1);
				setState(405);
				tupla();
				}
				}
				setState(410);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(411);
			match(T__45);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TuplaContext extends ParserRuleContext {
		public List<Tipos_tuplaContext> tipos_tupla() {
			return getRuleContexts(Tipos_tuplaContext.class);
		}
		public Tipos_tuplaContext tipos_tupla(int i) {
			return getRuleContext(Tipos_tuplaContext.class,i);
		}
		public Tipos_tupla_opContext tipos_tupla_op() {
			return getRuleContext(Tipos_tupla_opContext.class,0);
		}
		public TuplaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tupla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterTupla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitTupla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitTupla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TuplaContext tupla() throws RecognitionException {
		TuplaContext _localctx = new TuplaContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_tupla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(413);
			match(T__4);
			setState(414);
			tipos_tupla();
			setState(415);
			match(T__1);
			setState(416);
			tipos_tupla();
			setState(417);
			match(T__1);
			setState(418);
			tipos_tupla_op();
			setState(419);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipos_tuplaContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(LGraphParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LGraphParser.NUM_REAL, 0); }
		public TerminalNode STRING() { return getToken(LGraphParser.STRING, 0); }
		public Tipos_tuplaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_tupla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterTipos_tupla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitTipos_tupla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitTipos_tupla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_tuplaContext tipos_tupla() throws RecognitionException {
		Tipos_tuplaContext _localctx = new Tipos_tuplaContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tipos_tupla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUM_INT) | (1L << NUM_REAL) | (1L << STRING))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tipos_tupla_opContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(LGraphParser.NUM_INT, 0); }
		public Tipos_tupla_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipos_tupla_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterTipos_tupla_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitTipos_tupla_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitTipos_tupla_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipos_tupla_opContext tipos_tupla_op() throws RecognitionException {
		Tipos_tupla_opContext _localctx = new Tipos_tupla_opContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_tipos_tupla_op);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(423);
			match(NUM_INT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Parametros_nodesContext extends ParserRuleContext {
		public TerminalNode NUM_INT() { return getToken(LGraphParser.NUM_INT, 0); }
		public List<Parametros_nodesContext> parametros_nodes() {
			return getRuleContexts(Parametros_nodesContext.class);
		}
		public Parametros_nodesContext parametros_nodes(int i) {
			return getRuleContext(Parametros_nodesContext.class,i);
		}
		public TerminalNode NUM_REAL() { return getToken(LGraphParser.NUM_REAL, 0); }
		public TerminalNode STRING() { return getToken(LGraphParser.STRING, 0); }
		public Parametros_nodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros_nodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterParametros_nodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitParametros_nodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitParametros_nodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Parametros_nodesContext parametros_nodes() throws RecognitionException {
		Parametros_nodesContext _localctx = new Parametros_nodesContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_parametros_nodes);
		try {
			int _alt;
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(425);
				match(NUM_INT);
				setState(430);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(426);
						match(T__1);
						setState(427);
						parametros_nodes();
						}
						} 
					}
					setState(432);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
				}
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(433);
				match(NUM_REAL);
				setState(438);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(434);
						match(T__1);
						setState(435);
						parametros_nodes();
						}
						} 
					}
					setState(440);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,34,_ctx);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(441);
				match(STRING);
				setState(446);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(442);
						match(T__1);
						setState(443);
						parametros_nodes();
						}
						} 
					}
					setState(448);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,35,_ctx);
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NodesContext extends ParserRuleContext {
		public List<Parametros_nodesContext> parametros_nodes() {
			return getRuleContexts(Parametros_nodesContext.class);
		}
		public Parametros_nodesContext parametros_nodes(int i) {
			return getRuleContext(Parametros_nodesContext.class,i);
		}
		public NodesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).enterNodes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof LGraphListener ) ((LGraphListener)listener).exitNodes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof LGraphVisitor ) return ((LGraphVisitor<? extends T>)visitor).visitNodes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NodesContext nodes() throws RecognitionException {
		NodesContext _localctx = new NodesContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_nodes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(T__44);
			setState(452);
			parametros_nodes();
			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(453);
				match(T__1);
				setState(454);
				parametros_nodes();
				}
				}
				setState(459);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(460);
			match(T__45);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\38\u01d1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\3\2\3\2"+
		"\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5b\n\5\f\5\16\5e\13\5\3"+
		"\5\5\5h\n\5\3\6\3\6\3\6\7\6m\n\6\f\6\16\6p\13\6\3\6\3\6\3\6\5\6u\n\6\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u0080\n\7\f\7\16\7\u0083\13\7\3"+
		"\7\3\7\3\b\3\b\3\t\7\t\u008a\n\t\f\t\16\t\u008d\13\t\3\n\3\n\3\n\3\n\3"+
		"\n\3\n\3\n\5\n\u0096\n\n\3\13\5\13\u0099\n\13\3\f\3\f\3\f\3\f\5\f\u009f"+
		"\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3"+
		"\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\5"+
		"\17\u00ca\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\7\21"+
		"\u00d6\n\21\f\21\16\21\u00d9\13\21\3\22\3\22\7\22\u00dd\n\22\f\22\16\22"+
		"\u00e0\13\22\3\22\3\22\3\22\5\22\u00e5\n\22\3\23\3\23\3\23\3\23\5\23\u00eb"+
		"\n\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\5\24\u00f7\n\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\26\3\26\7\26\u0100\n\26\f\26\16\26\u0103\13"+
		"\26\3\26\3\26\3\27\3\27\5\27\u0109\n\27\3\30\3\30\3\30\3\30\3\30\3\30"+
		"\5\30\u0111\n\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u011a\n\30\3"+
		"\30\7\30\u011d\n\30\f\30\16\30\u0120\13\30\3\31\3\31\3\31\5\31\u0125\n"+
		"\31\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u0132"+
		"\n\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\34\5\34\u013c\n\34\3\34\7\34"+
		"\u013f\n\34\f\34\16\34\u0142\13\34\3\35\3\35\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3!\3!\3"+
		"\"\3\"\3\"\3\"\3\"\3\"\3\"\5\"\u0161\n\"\3#\3#\3#\3#\3#\5#\u0168\n#\3"+
		"#\3#\3#\3#\3#\3#\5#\u0170\n#\6#\u0172\n#\r#\16#\u0173\3#\3#\3#\7#\u0179"+
		"\n#\f#\16#\u017c\13#\3#\3#\3$\3$\3$\3$\3$\5$\u0185\n$\3$\3$\3$\3$\3$\3"+
		"$\5$\u018d\n$\6$\u018f\n$\r$\16$\u0190\3$\3$\3%\3%\3%\3%\7%\u0199\n%\f"+
		"%\16%\u019c\13%\3%\3%\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3(\3(\3)\3)\3)\7"+
		")\u01af\n)\f)\16)\u01b2\13)\3)\3)\3)\7)\u01b7\n)\f)\16)\u01ba\13)\3)\3"+
		")\3)\7)\u01bf\n)\f)\16)\u01c2\13)\5)\u01c4\n)\3*\3*\3*\3*\7*\u01ca\n*"+
		"\f*\16*\u01cd\13*\3*\3*\3*\2\2+\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36"+
		" \"$&(*,.\60\62\64\668:<>@BDFHJLNPR\2\13\3\2\t\13\3\2\22\26\3\2\27\30"+
		"\4\2\63\63\66\66\3\2&\'\3\2(+\3\2,-\6\2\6\6\t\13\16\16..\3\2\64\66\u01ed"+
		"\2T\3\2\2\2\4V\3\2\2\2\6Z\3\2\2\2\bg\3\2\2\2\ni\3\2\2\2\fv\3\2\2\2\16"+
		"\u0086\3\2\2\2\20\u008b\3\2\2\2\22\u0095\3\2\2\2\24\u0098\3\2\2\2\26\u009a"+
		"\3\2\2\2\30\u00a0\3\2\2\2\32\u00a2\3\2\2\2\34\u00c9\3\2\2\2\36\u00cb\3"+
		"\2\2\2 \u00d7\3\2\2\2\"\u00da\3\2\2\2$\u00ea\3\2\2\2&\u00f6\3\2\2\2(\u00f8"+
		"\3\2\2\2*\u00fd\3\2\2\2,\u0108\3\2\2\2.\u0110\3\2\2\2\60\u0121\3\2\2\2"+
		"\62\u0126\3\2\2\2\64\u0128\3\2\2\2\66\u0131\3\2\2\28\u0143\3\2\2\2:\u0145"+
		"\3\2\2\2<\u014d\3\2\2\2>\u0155\3\2\2\2@\u0157\3\2\2\2B\u0160\3\2\2\2D"+
		"\u0162\3\2\2\2F\u017f\3\2\2\2H\u0194\3\2\2\2J\u019f\3\2\2\2L\u01a7\3\2"+
		"\2\2N\u01a9\3\2\2\2P\u01c3\3\2\2\2R\u01c5\3\2\2\2TU\5\4\3\2U\3\3\2\2\2"+
		"VW\7\62\2\2WX\5\6\4\2XY\7\61\2\2Y\5\3\2\2\2Z[\5\b\5\2[\\\5\20\t\2\\\7"+
		"\3\2\2\2]^\7\3\2\2^c\5\n\6\2_`\7\4\2\2`b\5\n\6\2a_\3\2\2\2be\3\2\2\2c"+
		"a\3\2\2\2cd\3\2\2\2dh\3\2\2\2ec\3\2\2\2fh\3\2\2\2g]\3\2\2\2gf\3\2\2\2"+
		"h\t\3\2\2\2in\7\63\2\2jk\7\4\2\2km\7\63\2\2lj\3\2\2\2mp\3\2\2\2nl\3\2"+
		"\2\2no\3\2\2\2oq\3\2\2\2pn\3\2\2\2qt\7\5\2\2ru\5@!\2su\5\f\7\2tr\3\2\2"+
		"\2ts\3\2\2\2u\13\3\2\2\2vw\7\6\2\2wx\7\7\2\2xy\7\63\2\2yz\7\5\2\2z\u0081"+
		"\5\16\b\2{|\7\4\2\2|}\7\63\2\2}~\7\5\2\2~\u0080\5\16\b\2\177{\3\2\2\2"+
		"\u0080\u0083\3\2\2\2\u0081\177\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084"+
		"\3\2\2\2\u0083\u0081\3\2\2\2\u0084\u0085\7\b\2\2\u0085\r\3\2\2\2\u0086"+
		"\u0087\t\2\2\2\u0087\17\3\2\2\2\u0088\u008a\5\34\17\2\u0089\u0088\3\2"+
		"\2\2\u008a\u008d\3\2\2\2\u008b\u0089\3\2\2\2\u008b\u008c\3\2\2\2\u008c"+
		"\21\3\2\2\2\u008d\u008b\3\2\2\2\u008e\u008f\7\f\2\2\u008f\u0090\7\66\2"+
		"\2\u0090\u0091\7\r\2\2\u0091\u0092\7\16\2\2\u0092\u0096\7\63\2\2\u0093"+
		"\u0094\7\16\2\2\u0094\u0096\7\63\2\2\u0095\u008e\3\2\2\2\u0095\u0093\3"+
		"\2\2\2\u0096\23\3\2\2\2\u0097\u0099\7\17\2\2\u0098\u0097\3\2\2\2\u0098"+
		"\u0099\3\2\2\2\u0099\25\3\2\2\2\u009a\u009b\7\20\2\2\u009b\u009e\7\21"+
		"\2\2\u009c\u009f\7\63\2\2\u009d\u009f\7\66\2\2\u009e\u009c\3\2\2\2\u009e"+
		"\u009d\3\2\2\2\u009f\27\3\2\2\2\u00a0\u00a1\t\3\2\2\u00a1\31\3\2\2\2\u00a2"+
		"\u00a3\t\4\2\2\u00a3\33\3\2\2\2\u00a4\u00a5\7\31\2\2\u00a5\u00a6\7\16"+
		"\2\2\u00a6\u00a7\7\63\2\2\u00a7\u00a8\7\7\2\2\u00a8\u00a9\5:\36\2\u00a9"+
		"\u00aa\7\b\2\2\u00aa\u00ca\3\2\2\2\u00ab\u00ac\7\32\2\2\u00ac\u00ad\7"+
		"\16\2\2\u00ad\u00ae\7\63\2\2\u00ae\u00ca\5\26\f\2\u00af\u00b0\7\33\2\2"+
		"\u00b0\u00b1\7\16\2\2\u00b1\u00b2\7\63\2\2\u00b2\u00b3\7\34\2\2\u00b3"+
		"\u00b4\7\7\2\2\u00b4\u00b5\5<\37\2\u00b5\u00b6\7\b\2\2\u00b6\u00ca\3\2"+
		"\2\2\u00b7\u00b8\7\35\2\2\u00b8\u00b9\5\30\r\2\u00b9\u00ba\7\36\2\2\u00ba"+
		"\u00bb\5\22\n\2\u00bb\u00ca\3\2\2\2\u00bc\u00bd\7\37\2\2\u00bd\u00be\7"+
		"\16\2\2\u00be\u00ca\7\63\2\2\u00bf\u00c0\7 \2\2\u00c0\u00c1\7\f\2\2\u00c1"+
		"\u00c2\7\63\2\2\u00c2\u00c3\7\r\2\2\u00c3\u00c4\7\63\2\2\u00c4\u00ca\5"+
		"\36\20\2\u00c5\u00c6\7\63\2\2\u00c6\u00c7\7!\2\2\u00c7\u00ca\5B\"\2\u00c8"+
		"\u00ca\5(\25\2\u00c9\u00a4\3\2\2\2\u00c9\u00ab\3\2\2\2\u00c9\u00af\3\2"+
		"\2\2\u00c9\u00b7\3\2\2\2\u00c9\u00bc\3\2\2\2\u00c9\u00bf\3\2\2\2\u00c9"+
		"\u00c5\3\2\2\2\u00c9\u00c8\3\2\2\2\u00ca\35\3\2\2\2\u00cb\u00cc\7\62\2"+
		"\2\u00cc\u00cd\5 \21\2\u00cd\u00ce\7\61\2\2\u00ce\37\3\2\2\2\u00cf\u00d0"+
		"\7\"\2\2\u00d0\u00d1\7\7\2\2\u00d1\u00d2\5,\27\2\u00d2\u00d3\7\b\2\2\u00d3"+
		"\u00d4\5\"\22\2\u00d4\u00d6\3\2\2\2\u00d5\u00cf\3\2\2\2\u00d6\u00d9\3"+
		"\2\2\2\u00d7\u00d5\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8!\3\2\2\2\u00d9\u00d7"+
		"\3\2\2\2\u00da\u00de\7\62\2\2\u00db\u00dd\5$\23\2\u00dc\u00db\3\2\2\2"+
		"\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e1"+
		"\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e4\7\61\2\2\u00e2\u00e3\7#\2\2\u00e3"+
		"\u00e5\5*\26\2\u00e4\u00e2\3\2\2\2\u00e4\u00e5\3\2\2\2\u00e5#\3\2\2\2"+
		"\u00e6\u00eb\5(\25\2\u00e7\u00e8\7\63\2\2\u00e8\u00e9\7!\2\2\u00e9\u00eb"+
		"\5&\24\2\u00ea\u00e6\3\2\2\2\u00ea\u00e7\3\2\2\2\u00eb%\3\2\2\2\u00ec"+
		"\u00f7\7\64\2\2\u00ed\u00f7\7\65\2\2\u00ee\u00f7\7\63\2\2\u00ef\u00f7"+
		"\7\66\2\2\u00f0\u00f7\5R*\2\u00f1\u00f7\5H%\2\u00f2\u00f7\5D#\2\u00f3"+
		"\u00f4\7\63\2\2\u00f4\u00f5\7$\2\2\u00f5\u00f7\7\63\2\2\u00f6\u00ec\3"+
		"\2\2\2\u00f6\u00ed\3\2\2\2\u00f6\u00ee\3\2\2\2\u00f6\u00ef\3\2\2\2\u00f6"+
		"\u00f0\3\2\2\2\u00f6\u00f1\3\2\2\2\u00f6\u00f2\3\2\2\2\u00f6\u00f3\3\2"+
		"\2\2\u00f7\'\3\2\2\2\u00f8\u00f9\7%\2\2\u00f9\u00fa\7\7\2\2\u00fa\u00fb"+
		"\t\5\2\2\u00fb\u00fc\7\b\2\2\u00fc)\3\2\2\2\u00fd\u0101\7\62\2\2\u00fe"+
		"\u0100\5(\25\2\u00ff\u00fe\3\2\2\2\u0100\u0103\3\2\2\2\u0101\u00ff\3\2"+
		"\2\2\u0101\u0102\3\2\2\2\u0102\u0104\3\2\2\2\u0103\u0101\3\2\2\2\u0104"+
		"\u0105\7\61\2\2\u0105+\3\2\2\2\u0106\u0109\5.\30\2\u0107\u0109\5\66\34"+
		"\2\u0108\u0106\3\2\2\2\u0108\u0107\3\2\2\2\u0109-\3\2\2\2\u010a\u0111"+
		"\7\64\2\2\u010b\u0111\7\65\2\2\u010c\u010d\7\63\2\2\u010d\u010e\7$\2\2"+
		"\u010e\u0111\7\63\2\2\u010f\u0111\7\63\2\2\u0110\u010a\3\2\2\2\u0110\u010b"+
		"\3\2\2\2\u0110\u010c\3\2\2\2\u0110\u010f\3\2\2\2\u0111\u0112\3\2\2\2\u0112"+
		"\u0119\5\64\33\2\u0113\u011a\7\64\2\2\u0114\u011a\7\65\2\2\u0115\u0116"+
		"\7\63\2\2\u0116\u0117\7$\2\2\u0117\u011a\7\63\2\2\u0118\u011a\7\63\2\2"+
		"\u0119\u0113\3\2\2\2\u0119\u0114\3\2\2\2\u0119\u0115\3\2\2\2\u0119\u0118"+
		"\3\2\2\2\u011a\u011e\3\2\2\2\u011b\u011d\5\60\31\2\u011c\u011b\3\2\2\2"+
		"\u011d\u0120\3\2\2\2\u011e\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f/\3"+
		"\2\2\2\u0120\u011e\3\2\2\2\u0121\u0124\5\62\32\2\u0122\u0125\5.\30\2\u0123"+
		"\u0125\5\66\34\2\u0124\u0122\3\2\2\2\u0124\u0123\3\2\2\2\u0125\61\3\2"+
		"\2\2\u0126\u0127\t\6\2\2\u0127\63\3\2\2\2\u0128\u0129\t\7\2\2\u0129\65"+
		"\3\2\2\2\u012a\u0132\7\64\2\2\u012b\u0132\7\65\2\2\u012c\u012d\7\63\2"+
		"\2\u012d\u012e\7$\2\2\u012e\u0132\7\63\2\2\u012f\u0132\7\63\2\2\u0130"+
		"\u0132\7\66\2\2\u0131\u012a\3\2\2\2\u0131\u012b\3\2\2\2\u0131\u012c\3"+
		"\2\2\2\u0131\u012f\3\2\2\2\u0131\u0130\3\2\2\2\u0132\u0133\3\2\2\2\u0133"+
		"\u013b\58\35\2\u0134\u013c\7\64\2\2\u0135\u013c\7\65\2\2\u0136\u013c\7"+
		"\63\2\2\u0137\u013c\7\66\2\2\u0138\u0139\7\63\2\2\u0139\u013a\7$\2\2\u013a"+
		"\u013c\7\63\2\2\u013b\u0134\3\2\2\2\u013b\u0135\3\2\2\2\u013b\u0136\3"+
		"\2\2\2\u013b\u0137\3\2\2\2\u013b\u0138\3\2\2\2\u013c\u0140\3\2\2\2\u013d"+
		"\u013f\5\60\31\2\u013e\u013d\3\2\2\2\u013f\u0142\3\2\2\2\u0140\u013e\3"+
		"\2\2\2\u0140\u0141\3\2\2\2\u0141\67\3\2\2\2\u0142\u0140\3\2\2\2\u0143"+
		"\u0144\t\b\2\2\u01449\3\2\2\2\u0145\u0146\7\6\2\2\u0146\u0147\7!\2\2\u0147"+
		"\u0148\5> \2\u0148\u0149\7\4\2\2\u0149\u014a\7.\2\2\u014a\u014b\7!\2\2"+
		"\u014b\u014c\5> \2\u014c;\3\2\2\2\u014d\u014e\7\6\2\2\u014e\u014f\7!\2"+
		"\2\u014f\u0150\5> \2\u0150\u0151\7\4\2\2\u0151\u0152\7.\2\2\u0152\u0153"+
		"\7!\2\2\u0153\u0154\5> \2\u0154=\3\2\2\2\u0155\u0156\7\63\2\2\u0156?\3"+
		"\2\2\2\u0157\u0158\t\t\2\2\u0158A\3\2\2\2\u0159\u0161\7\64\2\2\u015a\u0161"+
		"\7\65\2\2\u015b\u0161\7\63\2\2\u015c\u0161\7\66\2\2\u015d\u0161\5R*\2"+
		"\u015e\u0161\5H%\2\u015f\u0161\5D#\2\u0160\u0159\3\2\2\2\u0160\u015a\3"+
		"\2\2\2\u0160\u015b\3\2\2\2\u0160\u015c\3\2\2\2\u0160\u015d\3\2\2\2\u0160"+
		"\u015e\3\2\2\2\u0160\u015f\3\2\2\2\u0161C\3\2\2\2\u0162\u0163\7/\2\2\u0163"+
		"\u0167\7\7\2\2\u0164\u0168\7\64\2\2\u0165\u0168\7\65\2\2\u0166\u0168\7"+
		"\66\2\2\u0167\u0164\3\2\2\2\u0167\u0165\3\2\2\2\u0167\u0166\3\2\2\2\u0168"+
		"\u0171\3\2\2\2\u0169\u016a\7\4\2\2\u016a\u016b\7\63\2\2\u016b\u016f\7"+
		"!\2\2\u016c\u0170\7\64\2\2\u016d\u0170\7\65\2\2\u016e\u0170\7\66\2\2\u016f"+
		"\u016c\3\2\2\2\u016f\u016d\3\2\2\2\u016f\u016e\3\2\2\2\u0170\u0172\3\2"+
		"\2\2\u0171\u0169\3\2\2\2\u0172\u0173\3\2\2\2\u0173\u0171\3\2\2\2\u0173"+
		"\u0174\3\2\2\2\u0174\u0175\3\2\2\2\u0175\u0176\7\b\2\2\u0176\u017a\3\2"+
		"\2\2\u0177\u0179\5F$\2\u0178\u0177\3\2\2\2\u0179\u017c\3\2\2\2\u017a\u0178"+
		"\3\2\2\2\u017a\u017b\3\2\2\2\u017b\u017d\3\2\2\2\u017c\u017a\3\2\2\2\u017d"+
		"\u017e\7\60\2\2\u017eE\3\2\2\2\u017f\u0180\7\4\2\2\u0180\u0184\7\7\2\2"+
		"\u0181\u0185\7\64\2\2\u0182\u0185\7\65\2\2\u0183\u0185\7\66\2\2\u0184"+
		"\u0181\3\2\2\2\u0184\u0182\3\2\2\2\u0184\u0183\3\2\2\2\u0185\u018e\3\2"+
		"\2\2\u0186\u0187\7\4\2\2\u0187\u0188\7\63\2\2\u0188\u018c\7!\2\2\u0189"+
		"\u018d\7\64\2\2\u018a\u018d\7\65\2\2\u018b\u018d\7\66\2\2\u018c\u0189"+
		"\3\2\2\2\u018c\u018a\3\2\2\2\u018c\u018b\3\2\2\2\u018d\u018f\3\2\2\2\u018e"+
		"\u0186\3\2\2\2\u018f\u0190\3\2\2\2\u0190\u018e\3\2\2\2\u0190\u0191\3\2"+
		"\2\2\u0191\u0192\3\2\2\2\u0192\u0193\7\b\2\2\u0193G\3\2\2\2\u0194\u0195"+
		"\7/\2\2\u0195\u019a\5J&\2\u0196\u0197\7\4\2\2\u0197\u0199\5J&\2\u0198"+
		"\u0196\3\2\2\2\u0199\u019c\3\2\2\2\u019a\u0198\3\2\2\2\u019a\u019b\3\2"+
		"\2\2\u019b\u019d\3\2\2\2\u019c\u019a\3\2\2\2\u019d\u019e\7\60\2\2\u019e"+
		"I\3\2\2\2\u019f\u01a0\7\7\2\2\u01a0\u01a1\5L\'\2\u01a1\u01a2\7\4\2\2\u01a2"+
		"\u01a3\5L\'\2\u01a3\u01a4\7\4\2\2\u01a4\u01a5\5N(\2\u01a5\u01a6\7\b\2"+
		"\2\u01a6K\3\2\2\2\u01a7\u01a8\t\n\2\2\u01a8M\3\2\2\2\u01a9\u01aa\7\64"+
		"\2\2\u01aaO\3\2\2\2\u01ab\u01b0\7\64\2\2\u01ac\u01ad\7\4\2\2\u01ad\u01af"+
		"\5P)\2\u01ae\u01ac\3\2\2\2\u01af\u01b2\3\2\2\2\u01b0\u01ae\3\2\2\2\u01b0"+
		"\u01b1\3\2\2\2\u01b1\u01c4\3\2\2\2\u01b2\u01b0\3\2\2\2\u01b3\u01b8\7\65"+
		"\2\2\u01b4\u01b5\7\4\2\2\u01b5\u01b7\5P)\2\u01b6\u01b4\3\2\2\2\u01b7\u01ba"+
		"\3\2\2\2\u01b8\u01b6\3\2\2\2\u01b8\u01b9\3\2\2\2\u01b9\u01c4\3\2\2\2\u01ba"+
		"\u01b8\3\2\2\2\u01bb\u01c0\7\66\2\2\u01bc\u01bd\7\4\2\2\u01bd\u01bf\5"+
		"P)\2\u01be\u01bc\3\2\2\2\u01bf\u01c2\3\2\2\2\u01c0\u01be\3\2\2\2\u01c0"+
		"\u01c1\3\2\2\2\u01c1\u01c4\3\2\2\2\u01c2\u01c0\3\2\2\2\u01c3\u01ab\3\2"+
		"\2\2\u01c3\u01b3\3\2\2\2\u01c3\u01bb\3\2\2\2\u01c4Q\3\2\2\2\u01c5\u01c6"+
		"\7/\2\2\u01c6\u01cb\5P)\2\u01c7\u01c8\7\4\2\2\u01c8\u01ca\5P)\2\u01c9"+
		"\u01c7\3\2\2\2\u01ca\u01cd\3\2\2\2\u01cb\u01c9\3\2\2\2\u01cb\u01cc\3\2"+
		"\2\2\u01cc\u01ce\3\2\2\2\u01cd\u01cb\3\2\2\2\u01ce\u01cf\7\60\2\2\u01cf"+
		"S\3\2\2\2(cgnt\u0081\u008b\u0095\u0098\u009e\u00c9\u00d7\u00de\u00e4\u00ea"+
		"\u00f6\u0101\u0108\u0110\u0119\u011e\u0124\u0131\u013b\u0140\u0160\u0167"+
		"\u016f\u0173\u017a\u0184\u018c\u0190\u019a\u01b0\u01b8\u01c0\u01c3\u01cb";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}