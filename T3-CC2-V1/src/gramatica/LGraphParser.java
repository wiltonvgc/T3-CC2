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
		FINAL=46, INICIO=47, IDENT=48, NUM_INT=49, NUM_REAL=50, STRING=51, WS=52, 
		COMENTARIO=53;
	public static final int
		RULE_inicio = 0, RULE_programa = 1, RULE_corpo = 2, RULE_declaracoes = 3, 
		RULE_variavel = 4, RULE_nodes_atributos = 5, RULE_tipo_atributo_node = 6, 
		RULE_comandos = 7, RULE_objeto_metrica = 8, RULE_salvar_opcional = 9, 
		RULE_arquivo_grafo = 10, RULE_metrica = 11, RULE_caminho = 12, RULE_cmd = 13, 
		RULE_corpo_for = 14, RULE_comandos_for = 15, RULE_corpo_if = 16, RULE_corpo_else = 17, 
		RULE_expressao_if = 18, RULE_exp_relacional = 19, RULE_op_relacional = 20, 
		RULE_exp_igualdade = 21, RULE_op_igualdade = 22, RULE_parametros_create = 23, 
		RULE_parametros_update = 24, RULE_valor_parametro = 25, RULE_tipo = 26, 
		RULE_atribuicao = 27, RULE_nodes_atributos_atribuicao = 28, RULE_atributos_nodes_v = 29, 
		RULE_edges = 30, RULE_tupla = 31, RULE_tipos_tupla = 32, RULE_tipos_tupla_op = 33, 
		RULE_parametros_nodes = 34, RULE_nodes = 35;
	public static final String[] ruleNames = {
		"inicio", "programa", "corpo", "declaracoes", "variavel", "nodes_atributos", 
		"tipo_atributo_node", "comandos", "objeto_metrica", "salvar_opcional", 
		"arquivo_grafo", "metrica", "caminho", "cmd", "corpo_for", "comandos_for", 
		"corpo_if", "corpo_else", "expressao_if", "exp_relacional", "op_relacional", 
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
		"'print'", "'.'", "'<'", "'>'", "'<='", "'>='", "'=='", "'!='", "'type'", 
		"'edges'", "'['", "']'", "'end'", "'begin'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "FINAL", "INICIO", 
		"IDENT", "NUM_INT", "NUM_REAL", "STRING", "WS", "COMENTARIO"
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
			setState(72);
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
			setState(74);
			match(INICIO);
			setState(75);
			corpo();
			setState(76);
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
			setState(78);
			declaracoes();
			setState(79);
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
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			match(T__0);
			setState(82);
			((DeclaracoesContext)_localctx).dec1 = variavel();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(83);
				match(T__1);
				setState(84);
				((DeclaracoesContext)_localctx).variavel = variavel();
				((DeclaracoesContext)_localctx).outrasDecs.add(((DeclaracoesContext)_localctx).variavel);
				}
				}
				setState(89);
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
			setState(90);
			((VariavelContext)_localctx).var1 = match(IDENT);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(91);
				match(T__1);
				setState(92);
				((VariavelContext)_localctx).IDENT = match(IDENT);
				((VariavelContext)_localctx).outrasVars.add(((VariavelContext)_localctx).IDENT);
				}
				}
				setState(97);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(98);
			match(T__2);
			setState(101);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(99);
				((VariavelContext)_localctx).t = tipo();
				}
				break;
			case 2:
				{
				setState(100);
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
			setState(103);
			match(T__3);
			setState(104);
			match(T__4);
			setState(105);
			((Nodes_atributosContext)_localctx).at1 = match(IDENT);
			setState(106);
			match(T__2);
			setState(107);
			((Nodes_atributosContext)_localctx).tan1 = tipo_atributo_node();
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(108);
				match(T__1);
				setState(109);
				((Nodes_atributosContext)_localctx).IDENT = match(IDENT);
				((Nodes_atributosContext)_localctx).ats.add(((Nodes_atributosContext)_localctx).IDENT);
				setState(110);
				match(T__2);
				setState(111);
				((Nodes_atributosContext)_localctx).tipo_atributo_node = tipo_atributo_node();
				((Nodes_atributosContext)_localctx).tans.add(((Nodes_atributosContext)_localctx).tipo_atributo_node);
				}
				}
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(117);
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
			setState(119);
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
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__12) | (1L << T__22) | (1L << T__23) | (1L << T__24) | (1L << T__26) | (1L << T__28) | (1L << T__29) | (1L << IDENT))) != 0)) {
				{
				{
				setState(121);
				((ComandosContext)_localctx).cmd = cmd();
				((ComandosContext)_localctx).cmds.add(((ComandosContext)_localctx).cmd);
				}
				}
				setState(126);
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
			setState(134);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__9:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				match(T__9);
				setState(128);
				((Objeto_metricaContext)_localctx).v = match(STRING);
				setState(129);
				match(T__10);
				setState(130);
				match(T__11);
				setState(131);
				((Objeto_metricaContext)_localctx).id_vert = match(IDENT);
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 2);
				{
				setState(132);
				match(T__11);
				setState(133);
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
			setState(137);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(136);
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
			setState(139);
			match(T__13);
			setState(140);
			match(T__14);
			setState(143);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(141);
				((Arquivo_grafoContext)_localctx).id = match(IDENT);
				}
				break;
			case STRING:
				{
				setState(142);
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
			setState(145);
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
			setState(147);
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
		public Salvar_opcionalContext salvar_opcional() {
			return getRuleContext(Salvar_opcionalContext.class,0);
		}
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
			setState(189);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				salvar_opcional();
				setState(150);
				match(T__22);
				setState(151);
				match(T__11);
				setState(152);
				((CmdContext)_localctx).id_grafo = match(IDENT);
				setState(153);
				match(T__4);
				setState(154);
				parametros_create();
				setState(155);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(157);
				salvar_opcional();
				setState(158);
				match(T__23);
				setState(159);
				match(T__11);
				setState(160);
				((CmdContext)_localctx).id_gf = match(IDENT);
				setState(161);
				arquivo_grafo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(163);
				match(T__24);
				setState(164);
				match(T__11);
				setState(165);
				((CmdContext)_localctx).id_grafo_up = match(IDENT);
				setState(166);
				match(T__25);
				setState(167);
				match(T__4);
				setState(168);
				parametros_update();
				setState(169);
				match(T__5);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(171);
				salvar_opcional();
				setState(172);
				match(T__26);
				setState(173);
				metrica();
				setState(174);
				match(T__27);
				setState(175);
				objeto_metrica();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(177);
				match(T__28);
				setState(178);
				match(T__11);
				setState(179);
				((CmdContext)_localctx).id_plot = match(IDENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(180);
				match(T__29);
				setState(181);
				match(T__9);
				setState(182);
				((CmdContext)_localctx).id = match(IDENT);
				setState(183);
				match(T__10);
				setState(184);
				((CmdContext)_localctx).g_id = match(IDENT);
				setState(185);
				((CmdContext)_localctx).cf = corpo_for();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(186);
				((CmdContext)_localctx).id1 = match(IDENT);
				setState(187);
				match(T__30);
				setState(188);
				atribuicao();
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
			setState(191);
			match(INICIO);
			setState(192);
			comandos_for();
			setState(193);
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
		public List<TerminalNode> STRING() { return getTokens(LGraphParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(LGraphParser.STRING, i);
		}
		public List<TerminalNode> IDENT() { return getTokens(LGraphParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LGraphParser.IDENT, i);
		}
		public List<Corpo_elseContext> corpo_else() {
			return getRuleContexts(Corpo_elseContext.class);
		}
		public Corpo_elseContext corpo_else(int i) {
			return getRuleContext(Corpo_elseContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(208);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case T__31:
						{
						setState(195);
						match(T__31);
						setState(196);
						match(T__4);
						setState(197);
						((Comandos_forContext)_localctx).expressao_if = expressao_if();
						((Comandos_forContext)_localctx).ctx_if.add(((Comandos_forContext)_localctx).expressao_if);
						setState(198);
						match(T__5);
						setState(199);
						((Comandos_forContext)_localctx).corpo_if = corpo_if();
						((Comandos_forContext)_localctx).cif.add(((Comandos_forContext)_localctx).corpo_if);
						setState(202);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==T__32) {
							{
							setState(200);
							match(T__32);
							setState(201);
							corpo_else();
							}
						}

						}
						break;
					case T__33:
						{
						setState(204);
						match(T__33);
						setState(205);
						match(T__4);
						setState(206);
						_la = _input.LA(1);
						if ( !(_la==IDENT || _la==STRING) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(207);
						match(T__5);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(212);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		public Comandos_forContext comandos_for() {
			return getRuleContext(Comandos_forContext.class,0);
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
		try {
			setState(218);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INICIO:
				enterOuterAlt(_localctx, 1);
				{
				setState(213);
				match(INICIO);
				setState(214);
				comandos_for();
				setState(215);
				match(FINAL);
				}
				break;
			case T__31:
			case T__32:
			case T__33:
			case FINAL:
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

	public static class Corpo_elseContext extends ParserRuleContext {
		public Comandos_forContext comandos_for() {
			return getRuleContext(Comandos_forContext.class,0);
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
		enterRule(_localctx, 34, RULE_corpo_else);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(220);
			comandos_for();
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
		enterRule(_localctx, 36, RULE_expressao_if);
		try {
			setState(224);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(222);
				exp_relacional();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(223);
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
		enterRule(_localctx, 38, RULE_exp_relacional);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(226);
				((Exp_relacionalContext)_localctx).op1_int = match(NUM_INT);
				}
				break;
			case 2:
				{
				setState(227);
				((Exp_relacionalContext)_localctx).op1_real = match(NUM_REAL);
				}
				break;
			case 3:
				{
				{
				setState(228);
				((Exp_relacionalContext)_localctx).op1_v = match(IDENT);
				setState(229);
				match(T__34);
				setState(230);
				((Exp_relacionalContext)_localctx).at1 = match(IDENT);
				}
				}
				break;
			case 4:
				{
				setState(231);
				((Exp_relacionalContext)_localctx).op1_id = match(IDENT);
				}
				break;
			}
			setState(234);
			((Exp_relacionalContext)_localctx).op = op_relacional();
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(235);
				((Exp_relacionalContext)_localctx).op2_int = match(NUM_INT);
				}
				break;
			case 2:
				{
				setState(236);
				((Exp_relacionalContext)_localctx).op2_real = match(NUM_REAL);
				}
				break;
			case 3:
				{
				setState(237);
				((Exp_relacionalContext)_localctx).op2_v = match(IDENT);
				setState(238);
				match(T__34);
				setState(239);
				((Exp_relacionalContext)_localctx).at2 = match(IDENT);
				}
				break;
			case 4:
				{
				setState(240);
				((Exp_relacionalContext)_localctx).op2_id = match(IDENT);
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
		enterRule(_localctx, 40, RULE_op_relacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__35) | (1L << T__36) | (1L << T__37) | (1L << T__38))) != 0)) ) {
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
		enterRule(_localctx, 42, RULE_exp_igualdade);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(245);
				((Exp_igualdadeContext)_localctx).op1_int = match(NUM_INT);
				}
				break;
			case 2:
				{
				setState(246);
				((Exp_igualdadeContext)_localctx).op1_real = match(NUM_REAL);
				}
				break;
			case 3:
				{
				setState(247);
				((Exp_igualdadeContext)_localctx).op1_v = match(IDENT);
				setState(248);
				match(T__34);
				setState(249);
				((Exp_igualdadeContext)_localctx).at1 = match(IDENT);
				}
				break;
			case 4:
				{
				setState(250);
				((Exp_igualdadeContext)_localctx).op1_id = match(IDENT);
				}
				break;
			case 5:
				{
				setState(251);
				((Exp_igualdadeContext)_localctx).op1_s = match(STRING);
				}
				break;
			}
			setState(254);
			((Exp_igualdadeContext)_localctx).op = op_igualdade();
			setState(262);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(255);
				((Exp_igualdadeContext)_localctx).op2_int = match(NUM_INT);
				}
				break;
			case 2:
				{
				setState(256);
				((Exp_igualdadeContext)_localctx).op2_real = match(NUM_REAL);
				}
				break;
			case 3:
				{
				setState(257);
				((Exp_igualdadeContext)_localctx).op2_id = match(IDENT);
				}
				break;
			case 4:
				{
				setState(258);
				((Exp_igualdadeContext)_localctx).op2_s = match(STRING);
				}
				break;
			case 5:
				{
				setState(259);
				((Exp_igualdadeContext)_localctx).op2_v = match(IDENT);
				setState(260);
				match(T__34);
				setState(261);
				((Exp_igualdadeContext)_localctx).at2 = match(IDENT);
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
		enterRule(_localctx, 44, RULE_op_igualdade);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(264);
			_la = _input.LA(1);
			if ( !(_la==T__39 || _la==T__40) ) {
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
		public Valor_parametroContext v1;
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
		enterRule(_localctx, 46, RULE_parametros_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(T__41);
			setState(267);
			match(T__30);
			setState(268);
			((Parametros_createContext)_localctx).v1 = valor_parametro();
			setState(269);
			match(T__1);
			setState(270);
			match(T__3);
			setState(271);
			match(T__30);
			setState(272);
			((Parametros_createContext)_localctx).v2 = valor_parametro();
			setState(273);
			match(T__1);
			setState(274);
			match(T__42);
			setState(275);
			match(T__30);
			setState(276);
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
		enterRule(_localctx, 48, RULE_parametros_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(278);
			match(T__3);
			setState(279);
			match(T__30);
			setState(280);
			((Parametros_updateContext)_localctx).v1 = valor_parametro();
			setState(281);
			match(T__1);
			setState(282);
			match(T__42);
			setState(283);
			match(T__30);
			setState(284);
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
		public TerminalNode NUM_INT() { return getToken(LGraphParser.NUM_INT, 0); }
		public TerminalNode NUM_REAL() { return getToken(LGraphParser.NUM_REAL, 0); }
		public TerminalNode IDENT() { return getToken(LGraphParser.IDENT, 0); }
		public TerminalNode STRING() { return getToken(LGraphParser.STRING, 0); }
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
		enterRule(_localctx, 50, RULE_valor_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(286);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IDENT) | (1L << NUM_INT) | (1L << NUM_REAL) | (1L << STRING))) != 0)) ) {
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
		enterRule(_localctx, 52, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__3) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << T__11) | (1L << T__42))) != 0)) ) {
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
		enterRule(_localctx, 54, RULE_atribuicao);
		try {
			setState(297);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(290);
				match(NUM_INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(291);
				match(NUM_REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(292);
				match(IDENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(293);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(294);
				nodes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(295);
				edges();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(296);
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
		enterRule(_localctx, 56, RULE_nodes_atributos_atribuicao);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(299);
			match(T__43);
			{
			setState(300);
			match(T__4);
			setState(304);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				{
				setState(301);
				((Nodes_atributos_atribuicaoContext)_localctx).id = match(NUM_INT);
				}
				break;
			case NUM_REAL:
				{
				setState(302);
				((Nodes_atributos_atribuicaoContext)_localctx).id = match(NUM_REAL);
				}
				break;
			case STRING:
				{
				setState(303);
				((Nodes_atributos_atribuicaoContext)_localctx).id = match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(314); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(306);
				match(T__1);
				setState(307);
				((Nodes_atributos_atribuicaoContext)_localctx).IDENT = match(IDENT);
				((Nodes_atributos_atribuicaoContext)_localctx).ats1.add(((Nodes_atributos_atribuicaoContext)_localctx).IDENT);
				setState(308);
				match(T__30);
				setState(312);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM_INT:
					{
					setState(309);
					((Nodes_atributos_atribuicaoContext)_localctx).NUM_INT = match(NUM_INT);
					((Nodes_atributos_atribuicaoContext)_localctx).t.add(((Nodes_atributos_atribuicaoContext)_localctx).NUM_INT);
					}
					break;
				case NUM_REAL:
					{
					setState(310);
					((Nodes_atributos_atribuicaoContext)_localctx).NUM_REAL = match(NUM_REAL);
					((Nodes_atributos_atribuicaoContext)_localctx).t.add(((Nodes_atributos_atribuicaoContext)_localctx).NUM_REAL);
					}
					break;
				case STRING:
					{
					setState(311);
					((Nodes_atributos_atribuicaoContext)_localctx).STRING = match(STRING);
					((Nodes_atributos_atribuicaoContext)_localctx).t.add(((Nodes_atributos_atribuicaoContext)_localctx).STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(316); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(318);
			match(T__5);
			}
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(320);
				((Nodes_atributos_atribuicaoContext)_localctx).atributos_nodes_v = atributos_nodes_v();
				((Nodes_atributos_atribuicaoContext)_localctx).atrn.add(((Nodes_atributos_atribuicaoContext)_localctx).atributos_nodes_v);
				}
				}
				setState(325);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(326);
			match(T__44);
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
		enterRule(_localctx, 58, RULE_atributos_nodes_v);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(T__1);
			setState(329);
			match(T__4);
			setState(333);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				{
				setState(330);
				((Atributos_nodes_vContext)_localctx).id = match(NUM_INT);
				}
				break;
			case NUM_REAL:
				{
				setState(331);
				((Atributos_nodes_vContext)_localctx).id = match(NUM_REAL);
				}
				break;
			case STRING:
				{
				setState(332);
				((Atributos_nodes_vContext)_localctx).id = match(STRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(343); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(335);
				match(T__1);
				setState(336);
				((Atributos_nodes_vContext)_localctx).IDENT = match(IDENT);
				((Atributos_nodes_vContext)_localctx).atsn.add(((Atributos_nodes_vContext)_localctx).IDENT);
				setState(337);
				match(T__30);
				setState(341);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NUM_INT:
					{
					setState(338);
					((Atributos_nodes_vContext)_localctx).NUM_INT = match(NUM_INT);
					((Atributos_nodes_vContext)_localctx).t.add(((Atributos_nodes_vContext)_localctx).NUM_INT);
					}
					break;
				case NUM_REAL:
					{
					setState(339);
					((Atributos_nodes_vContext)_localctx).NUM_REAL = match(NUM_REAL);
					((Atributos_nodes_vContext)_localctx).t.add(((Atributos_nodes_vContext)_localctx).NUM_REAL);
					}
					break;
				case STRING:
					{
					setState(340);
					((Atributos_nodes_vContext)_localctx).STRING = match(STRING);
					((Atributos_nodes_vContext)_localctx).t.add(((Atributos_nodes_vContext)_localctx).STRING);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				}
				setState(345); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__1 );
			setState(347);
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
		enterRule(_localctx, 60, RULE_edges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(349);
			match(T__43);
			setState(350);
			tupla();
			setState(355);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(351);
				match(T__1);
				setState(352);
				tupla();
				}
				}
				setState(357);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(358);
			match(T__44);
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
		public List<Tipos_tupla_opContext> tipos_tupla_op() {
			return getRuleContexts(Tipos_tupla_opContext.class);
		}
		public Tipos_tupla_opContext tipos_tupla_op(int i) {
			return getRuleContext(Tipos_tupla_opContext.class,i);
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
		enterRule(_localctx, 62, RULE_tupla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			match(T__4);
			setState(361);
			tipos_tupla();
			setState(362);
			match(T__1);
			setState(363);
			tipos_tupla();
			setState(368);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(364);
				match(T__1);
				setState(365);
				tipos_tupla_op();
				}
				}
				setState(370);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(371);
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
		enterRule(_localctx, 64, RULE_tipos_tupla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
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
		public TerminalNode NUM_REAL() { return getToken(LGraphParser.NUM_REAL, 0); }
		public TerminalNode STRING() { return getToken(LGraphParser.STRING, 0); }
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
		enterRule(_localctx, 66, RULE_tipos_tupla_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(375);
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
		enterRule(_localctx, 68, RULE_parametros_nodes);
		try {
			int _alt;
			setState(401);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(377);
				match(NUM_INT);
				setState(382);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(378);
						match(T__1);
						setState(379);
						parametros_nodes();
						}
						} 
					}
					setState(384);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(385);
				match(NUM_REAL);
				setState(390);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(386);
						match(T__1);
						setState(387);
						parametros_nodes();
						}
						} 
					}
					setState(392);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(393);
				match(STRING);
				setState(398);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(394);
						match(T__1);
						setState(395);
						parametros_nodes();
						}
						} 
					}
					setState(400);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
		enterRule(_localctx, 70, RULE_nodes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(403);
			match(T__43);
			setState(404);
			parametros_nodes();
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(405);
				match(T__1);
				setState(406);
				parametros_nodes();
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			match(T__44);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\67\u01a1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5"+
		"\3\5\3\5\3\5\7\5X\n\5\f\5\16\5[\13\5\3\6\3\6\3\6\7\6`\n\6\f\6\16\6c\13"+
		"\6\3\6\3\6\3\6\5\6h\n\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7s\n\7\f"+
		"\7\16\7v\13\7\3\7\3\7\3\b\3\b\3\t\7\t}\n\t\f\t\16\t\u0080\13\t\3\n\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\5\n\u0089\n\n\3\13\5\13\u008c\n\13\3\f\3\f\3\f\3"+
		"\f\5\f\u0092\n\f\3\r\3\r\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\5\17\u00c0\n\17\3\20\3\20\3\20\3\20\3\21\3\21"+
		"\3\21\3\21\3\21\3\21\3\21\5\21\u00cd\n\21\3\21\3\21\3\21\3\21\7\21\u00d3"+
		"\n\21\f\21\16\21\u00d6\13\21\3\22\3\22\3\22\3\22\3\22\5\22\u00dd\n\22"+
		"\3\23\3\23\3\24\3\24\5\24\u00e3\n\24\3\25\3\25\3\25\3\25\3\25\3\25\5\25"+
		"\u00eb\n\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u00f4\n\25\3\26\3"+
		"\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\5\27\u00ff\n\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\5\27\u0109\n\27\3\30\3\30\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\5\35"+
		"\u012c\n\35\3\36\3\36\3\36\3\36\3\36\5\36\u0133\n\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\36\5\36\u013b\n\36\6\36\u013d\n\36\r\36\16\36\u013e\3\36\3"+
		"\36\3\36\7\36\u0144\n\36\f\36\16\36\u0147\13\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3\37\5\37\u0150\n\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0158"+
		"\n\37\6\37\u015a\n\37\r\37\16\37\u015b\3\37\3\37\3 \3 \3 \3 \7 \u0164"+
		"\n \f \16 \u0167\13 \3 \3 \3!\3!\3!\3!\3!\3!\7!\u0171\n!\f!\16!\u0174"+
		"\13!\3!\3!\3\"\3\"\3#\3#\3$\3$\3$\7$\u017f\n$\f$\16$\u0182\13$\3$\3$\3"+
		"$\7$\u0187\n$\f$\16$\u018a\13$\3$\3$\3$\7$\u018f\n$\f$\16$\u0192\13$\5"+
		"$\u0194\n$\3%\3%\3%\3%\7%\u019a\n%\f%\16%\u019d\13%\3%\3%\3%\2\2&\2\4"+
		"\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<>@BDFH\2\13"+
		"\3\2\t\13\3\2\22\26\3\2\27\30\4\2\62\62\65\65\3\2&)\3\2*+\3\2\62\65\6"+
		"\2\6\6\t\13\16\16--\3\2\63\65\u01b6\2J\3\2\2\2\4L\3\2\2\2\6P\3\2\2\2\b"+
		"S\3\2\2\2\n\\\3\2\2\2\fi\3\2\2\2\16y\3\2\2\2\20~\3\2\2\2\22\u0088\3\2"+
		"\2\2\24\u008b\3\2\2\2\26\u008d\3\2\2\2\30\u0093\3\2\2\2\32\u0095\3\2\2"+
		"\2\34\u00bf\3\2\2\2\36\u00c1\3\2\2\2 \u00d4\3\2\2\2\"\u00dc\3\2\2\2$\u00de"+
		"\3\2\2\2&\u00e2\3\2\2\2(\u00ea\3\2\2\2*\u00f5\3\2\2\2,\u00fe\3\2\2\2."+
		"\u010a\3\2\2\2\60\u010c\3\2\2\2\62\u0118\3\2\2\2\64\u0120\3\2\2\2\66\u0122"+
		"\3\2\2\28\u012b\3\2\2\2:\u012d\3\2\2\2<\u014a\3\2\2\2>\u015f\3\2\2\2@"+
		"\u016a\3\2\2\2B\u0177\3\2\2\2D\u0179\3\2\2\2F\u0193\3\2\2\2H\u0195\3\2"+
		"\2\2JK\5\4\3\2K\3\3\2\2\2LM\7\61\2\2MN\5\6\4\2NO\7\60\2\2O\5\3\2\2\2P"+
		"Q\5\b\5\2QR\5\20\t\2R\7\3\2\2\2ST\7\3\2\2TY\5\n\6\2UV\7\4\2\2VX\5\n\6"+
		"\2WU\3\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\t\3\2\2\2[Y\3\2\2\2\\a\7\62"+
		"\2\2]^\7\4\2\2^`\7\62\2\2_]\3\2\2\2`c\3\2\2\2a_\3\2\2\2ab\3\2\2\2bd\3"+
		"\2\2\2ca\3\2\2\2dg\7\5\2\2eh\5\66\34\2fh\5\f\7\2ge\3\2\2\2gf\3\2\2\2h"+
		"\13\3\2\2\2ij\7\6\2\2jk\7\7\2\2kl\7\62\2\2lm\7\5\2\2mt\5\16\b\2no\7\4"+
		"\2\2op\7\62\2\2pq\7\5\2\2qs\5\16\b\2rn\3\2\2\2sv\3\2\2\2tr\3\2\2\2tu\3"+
		"\2\2\2uw\3\2\2\2vt\3\2\2\2wx\7\b\2\2x\r\3\2\2\2yz\t\2\2\2z\17\3\2\2\2"+
		"{}\5\34\17\2|{\3\2\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\21\3"+
		"\2\2\2\u0080~\3\2\2\2\u0081\u0082\7\f\2\2\u0082\u0083\7\65\2\2\u0083\u0084"+
		"\7\r\2\2\u0084\u0085\7\16\2\2\u0085\u0089\7\62\2\2\u0086\u0087\7\16\2"+
		"\2\u0087\u0089\7\62\2\2\u0088\u0081\3\2\2\2\u0088\u0086\3\2\2\2\u0089"+
		"\23\3\2\2\2\u008a\u008c\7\17\2\2\u008b\u008a\3\2\2\2\u008b\u008c\3\2\2"+
		"\2\u008c\25\3\2\2\2\u008d\u008e\7\20\2\2\u008e\u0091\7\21\2\2\u008f\u0092"+
		"\7\62\2\2\u0090\u0092\7\65\2\2\u0091\u008f\3\2\2\2\u0091\u0090\3\2\2\2"+
		"\u0092\27\3\2\2\2\u0093\u0094\t\3\2\2\u0094\31\3\2\2\2\u0095\u0096\t\4"+
		"\2\2\u0096\33\3\2\2\2\u0097\u0098\5\24\13\2\u0098\u0099\7\31\2\2\u0099"+
		"\u009a\7\16\2\2\u009a\u009b\7\62\2\2\u009b\u009c\7\7\2\2\u009c\u009d\5"+
		"\60\31\2\u009d\u009e\7\b\2\2\u009e\u00c0\3\2\2\2\u009f\u00a0\5\24\13\2"+
		"\u00a0\u00a1\7\32\2\2\u00a1\u00a2\7\16\2\2\u00a2\u00a3\7\62\2\2\u00a3"+
		"\u00a4\5\26\f\2\u00a4\u00c0\3\2\2\2\u00a5\u00a6\7\33\2\2\u00a6\u00a7\7"+
		"\16\2\2\u00a7\u00a8\7\62\2\2\u00a8\u00a9\7\34\2\2\u00a9\u00aa\7\7\2\2"+
		"\u00aa\u00ab\5\62\32\2\u00ab\u00ac\7\b\2\2\u00ac\u00c0\3\2\2\2\u00ad\u00ae"+
		"\5\24\13\2\u00ae\u00af\7\35\2\2\u00af\u00b0\5\30\r\2\u00b0\u00b1\7\36"+
		"\2\2\u00b1\u00b2\5\22\n\2\u00b2\u00c0\3\2\2\2\u00b3\u00b4\7\37\2\2\u00b4"+
		"\u00b5\7\16\2\2\u00b5\u00c0\7\62\2\2\u00b6\u00b7\7 \2\2\u00b7\u00b8\7"+
		"\f\2\2\u00b8\u00b9\7\62\2\2\u00b9\u00ba\7\r\2\2\u00ba\u00bb\7\62\2\2\u00bb"+
		"\u00c0\5\36\20\2\u00bc\u00bd\7\62\2\2\u00bd\u00be\7!\2\2\u00be\u00c0\5"+
		"8\35\2\u00bf\u0097\3\2\2\2\u00bf\u009f\3\2\2\2\u00bf\u00a5\3\2\2\2\u00bf"+
		"\u00ad\3\2\2\2\u00bf\u00b3\3\2\2\2\u00bf\u00b6\3\2\2\2\u00bf\u00bc\3\2"+
		"\2\2\u00c0\35\3\2\2\2\u00c1\u00c2\7\61\2\2\u00c2\u00c3\5 \21\2\u00c3\u00c4"+
		"\7\60\2\2\u00c4\37\3\2\2\2\u00c5\u00c6\7\"\2\2\u00c6\u00c7\7\7\2\2\u00c7"+
		"\u00c8\5&\24\2\u00c8\u00c9\7\b\2\2\u00c9\u00cc\5\"\22\2\u00ca\u00cb\7"+
		"#\2\2\u00cb\u00cd\5$\23\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00d3\3\2\2\2\u00ce\u00cf\7$\2\2\u00cf\u00d0\7\7\2\2\u00d0\u00d1\t\5"+
		"\2\2\u00d1\u00d3\7\b\2\2\u00d2\u00c5\3\2\2\2\u00d2\u00ce\3\2\2\2\u00d3"+
		"\u00d6\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d4\u00d5\3\2\2\2\u00d5!\3\2\2\2"+
		"\u00d6\u00d4\3\2\2\2\u00d7\u00d8\7\61\2\2\u00d8\u00d9\5 \21\2\u00d9\u00da"+
		"\7\60\2\2\u00da\u00dd\3\2\2\2\u00db\u00dd\3\2\2\2\u00dc\u00d7\3\2\2\2"+
		"\u00dc\u00db\3\2\2\2\u00dd#\3\2\2\2\u00de\u00df\5 \21\2\u00df%\3\2\2\2"+
		"\u00e0\u00e3\5(\25\2\u00e1\u00e3\5,\27\2\u00e2\u00e0\3\2\2\2\u00e2\u00e1"+
		"\3\2\2\2\u00e3\'\3\2\2\2\u00e4\u00eb\7\63\2\2\u00e5\u00eb\7\64\2\2\u00e6"+
		"\u00e7\7\62\2\2\u00e7\u00e8\7%\2\2\u00e8\u00eb\7\62\2\2\u00e9\u00eb\7"+
		"\62\2\2\u00ea\u00e4\3\2\2\2\u00ea\u00e5\3\2\2\2\u00ea\u00e6\3\2\2\2\u00ea"+
		"\u00e9\3\2\2\2\u00eb\u00ec\3\2\2\2\u00ec\u00f3\5*\26\2\u00ed\u00f4\7\63"+
		"\2\2\u00ee\u00f4\7\64\2\2\u00ef\u00f0\7\62\2\2\u00f0\u00f1\7%\2\2\u00f1"+
		"\u00f4\7\62\2\2\u00f2\u00f4\7\62\2\2\u00f3\u00ed\3\2\2\2\u00f3\u00ee\3"+
		"\2\2\2\u00f3\u00ef\3\2\2\2\u00f3\u00f2\3\2\2\2\u00f4)\3\2\2\2\u00f5\u00f6"+
		"\t\6\2\2\u00f6+\3\2\2\2\u00f7\u00ff\7\63\2\2\u00f8\u00ff\7\64\2\2\u00f9"+
		"\u00fa\7\62\2\2\u00fa\u00fb\7%\2\2\u00fb\u00ff\7\62\2\2\u00fc\u00ff\7"+
		"\62\2\2\u00fd\u00ff\7\65\2\2\u00fe\u00f7\3\2\2\2\u00fe\u00f8\3\2\2\2\u00fe"+
		"\u00f9\3\2\2\2\u00fe\u00fc\3\2\2\2\u00fe\u00fd\3\2\2\2\u00ff\u0100\3\2"+
		"\2\2\u0100\u0108\5.\30\2\u0101\u0109\7\63\2\2\u0102\u0109\7\64\2\2\u0103"+
		"\u0109\7\62\2\2\u0104\u0109\7\65\2\2\u0105\u0106\7\62\2\2\u0106\u0107"+
		"\7%\2\2\u0107\u0109\7\62\2\2\u0108\u0101\3\2\2\2\u0108\u0102\3\2\2\2\u0108"+
		"\u0103\3\2\2\2\u0108\u0104\3\2\2\2\u0108\u0105\3\2\2\2\u0109-\3\2\2\2"+
		"\u010a\u010b\t\7\2\2\u010b/\3\2\2\2\u010c\u010d\7,\2\2\u010d\u010e\7!"+
		"\2\2\u010e\u010f\5\64\33\2\u010f\u0110\7\4\2\2\u0110\u0111\7\6\2\2\u0111"+
		"\u0112\7!\2\2\u0112\u0113\5\64\33\2\u0113\u0114\7\4\2\2\u0114\u0115\7"+
		"-\2\2\u0115\u0116\7!\2\2\u0116\u0117\5\64\33\2\u0117\61\3\2\2\2\u0118"+
		"\u0119\7\6\2\2\u0119\u011a\7!\2\2\u011a\u011b\5\64\33\2\u011b\u011c\7"+
		"\4\2\2\u011c\u011d\7-\2\2\u011d\u011e\7!\2\2\u011e\u011f\5\64\33\2\u011f"+
		"\63\3\2\2\2\u0120\u0121\t\b\2\2\u0121\65\3\2\2\2\u0122\u0123\t\t\2\2\u0123"+
		"\67\3\2\2\2\u0124\u012c\7\63\2\2\u0125\u012c\7\64\2\2\u0126\u012c\7\62"+
		"\2\2\u0127\u012c\7\65\2\2\u0128\u012c\5H%\2\u0129\u012c\5> \2\u012a\u012c"+
		"\5:\36\2\u012b\u0124\3\2\2\2\u012b\u0125\3\2\2\2\u012b\u0126\3\2\2\2\u012b"+
		"\u0127\3\2\2\2\u012b\u0128\3\2\2\2\u012b\u0129\3\2\2\2\u012b\u012a\3\2"+
		"\2\2\u012c9\3\2\2\2\u012d\u012e\7.\2\2\u012e\u0132\7\7\2\2\u012f\u0133"+
		"\7\63\2\2\u0130\u0133\7\64\2\2\u0131\u0133\7\65\2\2\u0132\u012f\3\2\2"+
		"\2\u0132\u0130\3\2\2\2\u0132\u0131\3\2\2\2\u0133\u013c\3\2\2\2\u0134\u0135"+
		"\7\4\2\2\u0135\u0136\7\62\2\2\u0136\u013a\7!\2\2\u0137\u013b\7\63\2\2"+
		"\u0138\u013b\7\64\2\2\u0139\u013b\7\65\2\2\u013a\u0137\3\2\2\2\u013a\u0138"+
		"\3\2\2\2\u013a\u0139\3\2\2\2\u013b\u013d\3\2\2\2\u013c\u0134\3\2\2\2\u013d"+
		"\u013e\3\2\2\2\u013e\u013c\3\2\2\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2"+
		"\2\2\u0140\u0141\7\b\2\2\u0141\u0145\3\2\2\2\u0142\u0144\5<\37\2\u0143"+
		"\u0142\3\2\2\2\u0144\u0147\3\2\2\2\u0145\u0143\3\2\2\2\u0145\u0146\3\2"+
		"\2\2\u0146\u0148\3\2\2\2\u0147\u0145\3\2\2\2\u0148\u0149\7/\2\2\u0149"+
		";\3\2\2\2\u014a\u014b\7\4\2\2\u014b\u014f\7\7\2\2\u014c\u0150\7\63\2\2"+
		"\u014d\u0150\7\64\2\2\u014e\u0150\7\65\2\2\u014f\u014c\3\2\2\2\u014f\u014d"+
		"\3\2\2\2\u014f\u014e\3\2\2\2\u0150\u0159\3\2\2\2\u0151\u0152\7\4\2\2\u0152"+
		"\u0153\7\62\2\2\u0153\u0157\7!\2\2\u0154\u0158\7\63\2\2\u0155\u0158\7"+
		"\64\2\2\u0156\u0158\7\65\2\2\u0157\u0154\3\2\2\2\u0157\u0155\3\2\2\2\u0157"+
		"\u0156\3\2\2\2\u0158\u015a\3\2\2\2\u0159\u0151\3\2\2\2\u015a\u015b\3\2"+
		"\2\2\u015b\u0159\3\2\2\2\u015b\u015c\3\2\2\2\u015c\u015d\3\2\2\2\u015d"+
		"\u015e\7\b\2\2\u015e=\3\2\2\2\u015f\u0160\7.\2\2\u0160\u0165\5@!\2\u0161"+
		"\u0162\7\4\2\2\u0162\u0164\5@!\2\u0163\u0161\3\2\2\2\u0164\u0167\3\2\2"+
		"\2\u0165\u0163\3\2\2\2\u0165\u0166\3\2\2\2\u0166\u0168\3\2\2\2\u0167\u0165"+
		"\3\2\2\2\u0168\u0169\7/\2\2\u0169?\3\2\2\2\u016a\u016b\7\7\2\2\u016b\u016c"+
		"\5B\"\2\u016c\u016d\7\4\2\2\u016d\u0172\5B\"\2\u016e\u016f\7\4\2\2\u016f"+
		"\u0171\5D#\2\u0170\u016e\3\2\2\2\u0171\u0174\3\2\2\2\u0172\u0170\3\2\2"+
		"\2\u0172\u0173\3\2\2\2\u0173\u0175\3\2\2\2\u0174\u0172\3\2\2\2\u0175\u0176"+
		"\7\b\2\2\u0176A\3\2\2\2\u0177\u0178\t\n\2\2\u0178C\3\2\2\2\u0179\u017a"+
		"\t\n\2\2\u017aE\3\2\2\2\u017b\u0180\7\63\2\2\u017c\u017d\7\4\2\2\u017d"+
		"\u017f\5F$\2\u017e\u017c\3\2\2\2\u017f\u0182\3\2\2\2\u0180\u017e\3\2\2"+
		"\2\u0180\u0181\3\2\2\2\u0181\u0194\3\2\2\2\u0182\u0180\3\2\2\2\u0183\u0188"+
		"\7\64\2\2\u0184\u0185\7\4\2\2\u0185\u0187\5F$\2\u0186\u0184\3\2\2\2\u0187"+
		"\u018a\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189\u0194\3\2"+
		"\2\2\u018a\u0188\3\2\2\2\u018b\u0190\7\65\2\2\u018c\u018d\7\4\2\2\u018d"+
		"\u018f\5F$\2\u018e\u018c\3\2\2\2\u018f\u0192\3\2\2\2\u0190\u018e\3\2\2"+
		"\2\u0190\u0191\3\2\2\2\u0191\u0194\3\2\2\2\u0192\u0190\3\2\2\2\u0193\u017b"+
		"\3\2\2\2\u0193\u0183\3\2\2\2\u0193\u018b\3\2\2\2\u0194G\3\2\2\2\u0195"+
		"\u0196\7.\2\2\u0196\u019b\5F$\2\u0197\u0198\7\4\2\2\u0198\u019a\5F$\2"+
		"\u0199\u0197\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2\2\2\u019b\u019c"+
		"\3\2\2\2\u019c\u019e\3\2\2\2\u019d\u019b\3\2\2\2\u019e\u019f\7/\2\2\u019f"+
		"I\3\2\2\2#Yagt~\u0088\u008b\u0091\u00bf\u00cc\u00d2\u00d4\u00dc\u00e2"+
		"\u00ea\u00f3\u00fe\u0108\u012b\u0132\u013a\u013e\u0145\u014f\u0157\u015b"+
		"\u0165\u0172\u0180\u0188\u0190\u0193\u019b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}