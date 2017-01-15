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
		T__31=32, T__32=33, FINAL=34, INICIO=35, IDENT=36, NUM_INT=37, NUM_REAL=38, 
		STRING=39, WS=40, COMENTARIO=41;
	public static final int
		RULE_inicio = 0, RULE_programa = 1, RULE_corpo = 2, RULE_declaracoes = 3, 
		RULE_variavel = 4, RULE_comandos = 5, RULE_objeto_metrica = 6, RULE_salvar_opcional = 7, 
		RULE_arquivo_grafo = 8, RULE_metrica = 9, RULE_caminho = 10, RULE_cmd = 11, 
		RULE_corpo_for = 12, RULE_parametros_create = 13, RULE_parametros_update = 14, 
		RULE_valor_parametro = 15, RULE_tipo = 16, RULE_atribuicao = 17, RULE_edges = 18, 
		RULE_tupla = 19, RULE_tipos_tupla = 20, RULE_tipos_tupla_op = 21, RULE_parametros_nodes = 22, 
		RULE_nodes = 23;
	public static final String[] ruleNames = {
		"inicio", "programa", "corpo", "declaracoes", "variavel", "comandos", 
		"objeto_metrica", "salvar_opcional", "arquivo_grafo", "metrica", "caminho", 
		"cmd", "corpo_for", "parametros_create", "parametros_update", "valor_parametro", 
		"tipo", "atribuicao", "edges", "tupla", "tipos_tupla", "tipos_tupla_op", 
		"parametros_nodes", "nodes"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'data'", "','", "':'", "'vertex'", "'in'", "'graph'", "'save'", 
		"'from'", "'file'", "'degree'", "'degree_centrality'", "'average_node_connectivity'", 
		"'MST'", "'CM'", "'create'", "'('", "')'", "'read'", "'update'", "'with'", 
		"'find'", "'of'", "'plot'", "'foreach'", "'='", "'type'", "'nodes'", "'edges'", 
		"'string'", "'int'", "'float'", "'['", "']'", "'end'", "'begin'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
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
			setState(48);
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
			setState(50);
			match(INICIO);
			setState(51);
			corpo();
			setState(52);
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
			setState(54);
			declaracoes();
			setState(55);
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
			setState(57);
			match(T__0);
			setState(58);
			((DeclaracoesContext)_localctx).dec1 = variavel();
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(59);
				match(T__1);
				setState(60);
				((DeclaracoesContext)_localctx).variavel = variavel();
				((DeclaracoesContext)_localctx).outrasDecs.add(((DeclaracoesContext)_localctx).variavel);
				}
				}
				setState(65);
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
		public List<TerminalNode> IDENT() { return getTokens(LGraphParser.IDENT); }
		public TerminalNode IDENT(int i) {
			return getToken(LGraphParser.IDENT, i);
		}
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
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
			setState(66);
			((VariavelContext)_localctx).var1 = match(IDENT);
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(67);
				match(T__1);
				setState(68);
				((VariavelContext)_localctx).IDENT = match(IDENT);
				((VariavelContext)_localctx).outrasVars.add(((VariavelContext)_localctx).IDENT);
				}
				}
				setState(73);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(74);
			match(T__2);
			setState(75);
			((VariavelContext)_localctx).t = tipo();
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
		enterRule(_localctx, 10, RULE_comandos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__14) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << T__22) | (1L << T__23) | (1L << IDENT))) != 0)) {
				{
				{
				setState(77);
				((ComandosContext)_localctx).cmd = cmd();
				((ComandosContext)_localctx).cmds.add(((ComandosContext)_localctx).cmd);
				}
				}
				setState(82);
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
		enterRule(_localctx, 12, RULE_objeto_metrica);
		try {
			setState(90);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(T__3);
				setState(84);
				((Objeto_metricaContext)_localctx).v = match(STRING);
				setState(85);
				match(T__4);
				setState(86);
				match(T__5);
				setState(87);
				((Objeto_metricaContext)_localctx).id_vert = match(IDENT);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(88);
				match(T__5);
				setState(89);
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
		enterRule(_localctx, 14, RULE_salvar_opcional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(92);
				match(T__6);
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
		enterRule(_localctx, 16, RULE_arquivo_grafo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(95);
			match(T__7);
			setState(96);
			match(T__8);
			setState(99);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENT:
				{
				setState(97);
				((Arquivo_grafoContext)_localctx).id = match(IDENT);
				}
				break;
			case STRING:
				{
				setState(98);
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
		enterRule(_localctx, 18, RULE_metrica);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(101);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__9) | (1L << T__10) | (1L << T__11))) != 0)) ) {
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
		enterRule(_localctx, 20, RULE_caminho);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			_la = _input.LA(1);
			if ( !(_la==T__12 || _la==T__13) ) {
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
		public Token id2;
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
		public CaminhoContext caminho() {
			return getRuleContext(CaminhoContext.class,0);
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
		enterRule(_localctx, 22, RULE_cmd);
		try {
			setState(148);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(105);
				salvar_opcional();
				setState(106);
				match(T__14);
				setState(107);
				match(T__5);
				setState(108);
				((CmdContext)_localctx).id_grafo = match(IDENT);
				setState(109);
				match(T__15);
				setState(110);
				parametros_create();
				setState(111);
				match(T__16);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(113);
				salvar_opcional();
				setState(114);
				match(T__17);
				setState(115);
				match(T__5);
				setState(116);
				((CmdContext)_localctx).id_gf = match(IDENT);
				setState(117);
				arquivo_grafo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(119);
				match(T__18);
				setState(120);
				match(T__5);
				setState(121);
				((CmdContext)_localctx).id_grafo_up = match(IDENT);
				setState(122);
				match(T__19);
				setState(123);
				match(T__15);
				setState(124);
				parametros_update();
				setState(125);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(127);
				salvar_opcional();
				setState(128);
				match(T__20);
				setState(129);
				metrica();
				setState(130);
				match(T__21);
				setState(131);
				objeto_metrica();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(133);
				match(T__22);
				setState(134);
				match(T__5);
				setState(135);
				((CmdContext)_localctx).id_plot = match(IDENT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(136);
				match(T__23);
				setState(137);
				match(T__3);
				setState(138);
				((CmdContext)_localctx).id = match(IDENT);
				setState(139);
				match(T__4);
				setState(140);
				caminho();
				setState(141);
				match(T__21);
				setState(142);
				((CmdContext)_localctx).id2 = match(IDENT);
				setState(143);
				corpo_for();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(145);
				((CmdContext)_localctx).id1 = match(IDENT);
				setState(146);
				match(T__24);
				setState(147);
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
		public ComandosContext comandos() {
			return getRuleContext(ComandosContext.class,0);
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
		enterRule(_localctx, 24, RULE_corpo_for);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(INICIO);
			setState(151);
			comandos();
			setState(152);
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
		enterRule(_localctx, 26, RULE_parametros_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(T__25);
			setState(155);
			match(T__24);
			setState(156);
			((Parametros_createContext)_localctx).v1 = valor_parametro();
			setState(157);
			match(T__1);
			setState(158);
			match(T__26);
			setState(159);
			match(T__24);
			setState(160);
			((Parametros_createContext)_localctx).v2 = valor_parametro();
			setState(161);
			match(T__1);
			setState(162);
			match(T__27);
			setState(163);
			match(T__24);
			setState(164);
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
		enterRule(_localctx, 28, RULE_parametros_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			match(T__26);
			setState(167);
			match(T__24);
			setState(168);
			((Parametros_updateContext)_localctx).v1 = valor_parametro();
			setState(169);
			match(T__1);
			setState(170);
			match(T__27);
			setState(171);
			match(T__24);
			setState(172);
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
		enterRule(_localctx, 30, RULE_valor_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
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
		enterRule(_localctx, 32, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__26) | (1L << T__27) | (1L << T__28) | (1L << T__29) | (1L << T__30))) != 0)) ) {
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
		enterRule(_localctx, 34, RULE_atribuicao);
		try {
			setState(184);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(178);
				match(NUM_INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(179);
				match(NUM_REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(180);
				match(IDENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(181);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(182);
				nodes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(183);
				edges();
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
		enterRule(_localctx, 36, RULE_edges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			match(T__31);
			setState(187);
			tupla();
			setState(192);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(188);
				match(T__1);
				setState(189);
				tupla();
				}
				}
				setState(194);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(195);
			match(T__32);
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
		enterRule(_localctx, 38, RULE_tupla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(T__15);
			setState(198);
			tipos_tupla();
			setState(199);
			match(T__1);
			setState(200);
			tipos_tupla();
			setState(205);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(201);
				match(T__1);
				setState(202);
				tipos_tupla_op();
				}
				}
				setState(207);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(208);
			match(T__16);
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
		enterRule(_localctx, 40, RULE_tipos_tupla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(210);
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
		enterRule(_localctx, 42, RULE_tipos_tupla_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
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
		enterRule(_localctx, 44, RULE_parametros_nodes);
		try {
			int _alt;
			setState(238);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(NUM_INT);
				setState(219);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(215);
						match(T__1);
						setState(216);
						parametros_nodes();
						}
						} 
					}
					setState(221);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(222);
				match(NUM_REAL);
				setState(227);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(223);
						match(T__1);
						setState(224);
						parametros_nodes();
						}
						} 
					}
					setState(229);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(230);
				match(STRING);
				setState(235);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(231);
						match(T__1);
						setState(232);
						parametros_nodes();
						}
						} 
					}
					setState(237);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
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
		enterRule(_localctx, 46, RULE_nodes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(T__31);
			setState(241);
			parametros_nodes();
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(242);
				match(T__1);
				setState(243);
				parametros_nodes();
				}
				}
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(249);
			match(T__32);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3+\u00fe\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5@\n\5\f\5\16\5"+
		"C\13\5\3\6\3\6\3\6\7\6H\n\6\f\6\16\6K\13\6\3\6\3\6\3\6\3\7\7\7Q\n\7\f"+
		"\7\16\7T\13\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b]\n\b\3\t\5\t`\n\t\3\n\3"+
		"\n\3\n\3\n\5\nf\n\n\3\13\3\13\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\5\r\u0097\n\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21"+
		"\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00bb\n\23\3\24\3\24"+
		"\3\24\3\24\7\24\u00c1\n\24\f\24\16\24\u00c4\13\24\3\24\3\24\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\7\25\u00ce\n\25\f\25\16\25\u00d1\13\25\3\25\3\25"+
		"\3\26\3\26\3\27\3\27\3\30\3\30\3\30\7\30\u00dc\n\30\f\30\16\30\u00df\13"+
		"\30\3\30\3\30\3\30\7\30\u00e4\n\30\f\30\16\30\u00e7\13\30\3\30\3\30\3"+
		"\30\7\30\u00ec\n\30\f\30\16\30\u00ef\13\30\5\30\u00f1\n\30\3\31\3\31\3"+
		"\31\3\31\7\31\u00f7\n\31\f\31\16\31\u00fa\13\31\3\31\3\31\3\31\2\2\32"+
		"\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\2\7\3\2\f\16\3\2\17"+
		"\20\3\2&)\4\2\b\b\35!\3\2\')\u00fe\2\62\3\2\2\2\4\64\3\2\2\2\68\3\2\2"+
		"\2\b;\3\2\2\2\nD\3\2\2\2\fR\3\2\2\2\16\\\3\2\2\2\20_\3\2\2\2\22a\3\2\2"+
		"\2\24g\3\2\2\2\26i\3\2\2\2\30\u0096\3\2\2\2\32\u0098\3\2\2\2\34\u009c"+
		"\3\2\2\2\36\u00a8\3\2\2\2 \u00b0\3\2\2\2\"\u00b2\3\2\2\2$\u00ba\3\2\2"+
		"\2&\u00bc\3\2\2\2(\u00c7\3\2\2\2*\u00d4\3\2\2\2,\u00d6\3\2\2\2.\u00f0"+
		"\3\2\2\2\60\u00f2\3\2\2\2\62\63\5\4\3\2\63\3\3\2\2\2\64\65\7%\2\2\65\66"+
		"\5\6\4\2\66\67\7$\2\2\67\5\3\2\2\289\5\b\5\29:\5\f\7\2:\7\3\2\2\2;<\7"+
		"\3\2\2<A\5\n\6\2=>\7\4\2\2>@\5\n\6\2?=\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3"+
		"\2\2\2B\t\3\2\2\2CA\3\2\2\2DI\7&\2\2EF\7\4\2\2FH\7&\2\2GE\3\2\2\2HK\3"+
		"\2\2\2IG\3\2\2\2IJ\3\2\2\2JL\3\2\2\2KI\3\2\2\2LM\7\5\2\2MN\5\"\22\2N\13"+
		"\3\2\2\2OQ\5\30\r\2PO\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2S\r\3\2\2\2"+
		"TR\3\2\2\2UV\7\6\2\2VW\7)\2\2WX\7\7\2\2XY\7\b\2\2Y]\7&\2\2Z[\7\b\2\2["+
		"]\7&\2\2\\U\3\2\2\2\\Z\3\2\2\2]\17\3\2\2\2^`\7\t\2\2_^\3\2\2\2_`\3\2\2"+
		"\2`\21\3\2\2\2ab\7\n\2\2be\7\13\2\2cf\7&\2\2df\7)\2\2ec\3\2\2\2ed\3\2"+
		"\2\2f\23\3\2\2\2gh\t\2\2\2h\25\3\2\2\2ij\t\3\2\2j\27\3\2\2\2kl\5\20\t"+
		"\2lm\7\21\2\2mn\7\b\2\2no\7&\2\2op\7\22\2\2pq\5\34\17\2qr\7\23\2\2r\u0097"+
		"\3\2\2\2st\5\20\t\2tu\7\24\2\2uv\7\b\2\2vw\7&\2\2wx\5\22\n\2x\u0097\3"+
		"\2\2\2yz\7\25\2\2z{\7\b\2\2{|\7&\2\2|}\7\26\2\2}~\7\22\2\2~\177\5\36\20"+
		"\2\177\u0080\7\23\2\2\u0080\u0097\3\2\2\2\u0081\u0082\5\20\t\2\u0082\u0083"+
		"\7\27\2\2\u0083\u0084\5\24\13\2\u0084\u0085\7\30\2\2\u0085\u0086\5\16"+
		"\b\2\u0086\u0097\3\2\2\2\u0087\u0088\7\31\2\2\u0088\u0089\7\b\2\2\u0089"+
		"\u0097\7&\2\2\u008a\u008b\7\32\2\2\u008b\u008c\7\6\2\2\u008c\u008d\7&"+
		"\2\2\u008d\u008e\7\7\2\2\u008e\u008f\5\26\f\2\u008f\u0090\7\30\2\2\u0090"+
		"\u0091\7&\2\2\u0091\u0092\5\32\16\2\u0092\u0097\3\2\2\2\u0093\u0094\7"+
		"&\2\2\u0094\u0095\7\33\2\2\u0095\u0097\5$\23\2\u0096k\3\2\2\2\u0096s\3"+
		"\2\2\2\u0096y\3\2\2\2\u0096\u0081\3\2\2\2\u0096\u0087\3\2\2\2\u0096\u008a"+
		"\3\2\2\2\u0096\u0093\3\2\2\2\u0097\31\3\2\2\2\u0098\u0099\7%\2\2\u0099"+
		"\u009a\5\f\7\2\u009a\u009b\7$\2\2\u009b\33\3\2\2\2\u009c\u009d\7\34\2"+
		"\2\u009d\u009e\7\33\2\2\u009e\u009f\5 \21\2\u009f\u00a0\7\4\2\2\u00a0"+
		"\u00a1\7\35\2\2\u00a1\u00a2\7\33\2\2\u00a2\u00a3\5 \21\2\u00a3\u00a4\7"+
		"\4\2\2\u00a4\u00a5\7\36\2\2\u00a5\u00a6\7\33\2\2\u00a6\u00a7\5 \21\2\u00a7"+
		"\35\3\2\2\2\u00a8\u00a9\7\35\2\2\u00a9\u00aa\7\33\2\2\u00aa\u00ab\5 \21"+
		"\2\u00ab\u00ac\7\4\2\2\u00ac\u00ad\7\36\2\2\u00ad\u00ae\7\33\2\2\u00ae"+
		"\u00af\5 \21\2\u00af\37\3\2\2\2\u00b0\u00b1\t\4\2\2\u00b1!\3\2\2\2\u00b2"+
		"\u00b3\t\5\2\2\u00b3#\3\2\2\2\u00b4\u00bb\7\'\2\2\u00b5\u00bb\7(\2\2\u00b6"+
		"\u00bb\7&\2\2\u00b7\u00bb\7)\2\2\u00b8\u00bb\5\60\31\2\u00b9\u00bb\5&"+
		"\24\2\u00ba\u00b4\3\2\2\2\u00ba\u00b5\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba"+
		"\u00b7\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00b9\3\2\2\2\u00bb%\3\2\2\2"+
		"\u00bc\u00bd\7\"\2\2\u00bd\u00c2\5(\25\2\u00be\u00bf\7\4\2\2\u00bf\u00c1"+
		"\5(\25\2\u00c0\u00be\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2\u00c0\3\2\2\2\u00c2"+
		"\u00c3\3\2\2\2\u00c3\u00c5\3\2\2\2\u00c4\u00c2\3\2\2\2\u00c5\u00c6\7#"+
		"\2\2\u00c6\'\3\2\2\2\u00c7\u00c8\7\22\2\2\u00c8\u00c9\5*\26\2\u00c9\u00ca"+
		"\7\4\2\2\u00ca\u00cf\5*\26\2\u00cb\u00cc\7\4\2\2\u00cc\u00ce\5,\27\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00d1\3\2\2\2\u00cf\u00cd\3\2\2\2\u00cf\u00d0\3\2"+
		"\2\2\u00d0\u00d2\3\2\2\2\u00d1\u00cf\3\2\2\2\u00d2\u00d3\7\23\2\2\u00d3"+
		")\3\2\2\2\u00d4\u00d5\t\6\2\2\u00d5+\3\2\2\2\u00d6\u00d7\t\6\2\2\u00d7"+
		"-\3\2\2\2\u00d8\u00dd\7\'\2\2\u00d9\u00da\7\4\2\2\u00da\u00dc\5.\30\2"+
		"\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2\2\2\u00dd\u00de"+
		"\3\2\2\2\u00de\u00f1\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0\u00e5\7(\2\2\u00e1"+
		"\u00e2\7\4\2\2\u00e2\u00e4\5.\30\2\u00e3\u00e1\3\2\2\2\u00e4\u00e7\3\2"+
		"\2\2\u00e5\u00e3\3\2\2\2\u00e5\u00e6\3\2\2\2\u00e6\u00f1\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e8\u00ed\7)\2\2\u00e9\u00ea\7\4\2\2\u00ea\u00ec\5.\30"+
		"\2\u00eb\u00e9\3\2\2\2\u00ec\u00ef\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ed\u00ee"+
		"\3\2\2\2\u00ee\u00f1\3\2\2\2\u00ef\u00ed\3\2\2\2\u00f0\u00d8\3\2\2\2\u00f0"+
		"\u00e0\3\2\2\2\u00f0\u00e8\3\2\2\2\u00f1/\3\2\2\2\u00f2\u00f3\7\"\2\2"+
		"\u00f3\u00f8\5.\30\2\u00f4\u00f5\7\4\2\2\u00f5\u00f7\5.\30\2\u00f6\u00f4"+
		"\3\2\2\2\u00f7\u00fa\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f8\u00f9\3\2\2\2\u00f9"+
		"\u00fb\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fb\u00fc\7#\2\2\u00fc\61\3\2\2\2"+
		"\21AIR\\_e\u0096\u00ba\u00c2\u00cf\u00dd\u00e5\u00ed\u00f0\u00f8";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}