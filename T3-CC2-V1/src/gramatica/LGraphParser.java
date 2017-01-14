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
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, FINAL=31, 
		INICIO=32, IDENT=33, NUM_INT=34, NUM_REAL=35, STRING=36, WS=37;
	public static final int
		RULE_inicio = 0, RULE_programa = 1, RULE_corpo = 2, RULE_declaracoes = 3, 
		RULE_variavel = 4, RULE_comandos = 5, RULE_objeto_metrica = 6, RULE_salvar_opcional = 7, 
		RULE_arquivo_grafo = 8, RULE_metrica = 9, RULE_cmd = 10, RULE_parametros_create = 11, 
		RULE_parametros_update = 12, RULE_valor_parametro = 13, RULE_tipo = 14, 
		RULE_atribuicao = 15, RULE_edges = 16, RULE_tupla = 17, RULE_tipos_tupla = 18, 
		RULE_tipos_tupla_op = 19, RULE_parametros_nodes = 20, RULE_nodes = 21;
	public static final String[] ruleNames = {
		"inicio", "programa", "corpo", "declaracoes", "variavel", "comandos", 
		"objeto_metrica", "salvar_opcional", "arquivo_grafo", "metrica", "cmd", 
		"parametros_create", "parametros_update", "valor_parametro", "tipo", "atribuicao", 
		"edges", "tupla", "tipos_tupla", "tipos_tupla_op", "parametros_nodes", 
		"nodes"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'data'", "','", "':'", "'vertex'", "'in'", "'graph'", "'save'", 
		"'from'", "'file'", "'degree'", "'clustering'", "'create'", "'('", "')'", 
		"'read'", "'update'", "'with'", "'delete'", "'find'", "'of'", "'plot'", 
		"'='", "'type'", "'nodes'", "'edges'", "'string'", "'int'", "'float'", 
		"'['", "']'", "'end'", "'begin'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "FINAL", "INICIO", "IDENT", 
		"NUM_INT", "NUM_REAL", "STRING", "WS"
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
			setState(44);
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
			setState(46);
			match(INICIO);
			setState(47);
			corpo();
			setState(48);
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
			setState(50);
			declaracoes();
			setState(51);
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
			setState(53);
			match(T__0);
			setState(54);
			((DeclaracoesContext)_localctx).dec1 = variavel();
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(55);
				match(T__1);
				setState(56);
				((DeclaracoesContext)_localctx).variavel = variavel();
				((DeclaracoesContext)_localctx).outrasDecs.add(((DeclaracoesContext)_localctx).variavel);
				}
				}
				setState(61);
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
			setState(62);
			((VariavelContext)_localctx).var1 = match(IDENT);
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(63);
				match(T__1);
				setState(64);
				((VariavelContext)_localctx).IDENT = match(IDENT);
				((VariavelContext)_localctx).outrasVars.add(((VariavelContext)_localctx).IDENT);
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70);
			match(T__2);
			setState(71);
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
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__11) | (1L << T__14) | (1L << T__15) | (1L << T__17) | (1L << T__18) | (1L << T__20) | (1L << IDENT))) != 0)) {
				{
				{
				setState(73);
				((ComandosContext)_localctx).cmd = cmd();
				((ComandosContext)_localctx).cmds.add(((ComandosContext)_localctx).cmd);
				}
				}
				setState(78);
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
			setState(86);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				match(T__3);
				setState(80);
				match(STRING);
				setState(81);
				match(T__4);
				setState(82);
				match(T__5);
				setState(83);
				match(IDENT);
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				match(T__5);
				setState(85);
				match(IDENT);
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
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__6) {
				{
				setState(88);
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
		public TerminalNode IDENT() { return getToken(LGraphParser.IDENT, 0); }
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
			setState(91);
			match(T__7);
			setState(92);
			match(T__8);
			setState(93);
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
			setState(95);
			_la = _input.LA(1);
			if ( !(_la==T__9 || _la==T__10) ) {
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
		public Salvar_opcionalContext salvar_opcional() {
			return getRuleContext(Salvar_opcionalContext.class,0);
		}
		public TerminalNode IDENT() { return getToken(LGraphParser.IDENT, 0); }
		public Parametros_createContext parametros_create() {
			return getRuleContext(Parametros_createContext.class,0);
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
		enterRule(_localctx, 20, RULE_cmd);
		try {
			setState(136);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(97);
				salvar_opcional();
				setState(98);
				match(T__11);
				setState(99);
				match(T__5);
				setState(100);
				match(IDENT);
				setState(101);
				match(T__12);
				setState(102);
				parametros_create();
				setState(103);
				match(T__13);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(105);
				salvar_opcional();
				setState(106);
				match(T__14);
				setState(107);
				match(T__5);
				setState(108);
				match(IDENT);
				setState(109);
				arquivo_grafo();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(111);
				match(T__15);
				setState(112);
				match(T__5);
				setState(113);
				match(IDENT);
				setState(114);
				match(T__16);
				setState(115);
				match(T__12);
				setState(116);
				parametros_update();
				setState(117);
				match(T__13);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(119);
				match(T__17);
				setState(120);
				match(T__5);
				setState(121);
				match(IDENT);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(122);
				salvar_opcional();
				setState(123);
				match(T__18);
				setState(124);
				metrica();
				setState(125);
				match(T__19);
				setState(126);
				objeto_metrica();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(128);
				match(T__20);
				setState(129);
				match(T__5);
				setState(130);
				match(IDENT);
				setState(131);
				match(T__12);
				setState(132);
				match(T__13);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(133);
				match(IDENT);
				setState(134);
				match(T__21);
				setState(135);
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
		enterRule(_localctx, 22, RULE_parametros_create);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			match(T__22);
			setState(139);
			match(T__21);
			setState(140);
			((Parametros_createContext)_localctx).v1 = valor_parametro();
			setState(141);
			match(T__1);
			setState(142);
			match(T__23);
			setState(143);
			match(T__21);
			setState(144);
			((Parametros_createContext)_localctx).v2 = valor_parametro();
			setState(145);
			match(T__1);
			setState(146);
			match(T__24);
			setState(147);
			match(T__21);
			setState(148);
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
		enterRule(_localctx, 24, RULE_parametros_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(T__24);
			setState(151);
			match(T__21);
			setState(152);
			((Parametros_updateContext)_localctx).v1 = valor_parametro();
			setState(153);
			match(T__1);
			setState(154);
			match(T__23);
			setState(155);
			match(T__21);
			setState(156);
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
		enterRule(_localctx, 26, RULE_valor_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
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
		enterRule(_localctx, 28, RULE_tipo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__5) | (1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
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
		enterRule(_localctx, 30, RULE_atribuicao);
		try {
			setState(168);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(162);
				match(NUM_INT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(163);
				match(NUM_REAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(164);
				match(IDENT);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(165);
				match(STRING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(166);
				nodes();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(167);
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
		enterRule(_localctx, 32, RULE_edges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(T__28);
			setState(171);
			tupla();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(172);
				match(T__1);
				setState(173);
				tupla();
				}
				}
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(179);
			match(T__29);
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
		enterRule(_localctx, 34, RULE_tupla);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(T__12);
			setState(182);
			tipos_tupla();
			setState(183);
			match(T__1);
			setState(184);
			tipos_tupla();
			setState(185);
			match(T__1);
			setState(186);
			tipos_tupla_op();
			setState(187);
			match(T__13);
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
		enterRule(_localctx, 36, RULE_tipos_tupla);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
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
		enterRule(_localctx, 38, RULE_tipos_tupla_op);
		try {
			setState(195);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(NUM_INT);
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(NUM_REAL);
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(193);
				match(STRING);
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 4);
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
		enterRule(_localctx, 40, RULE_parametros_nodes);
		try {
			int _alt;
			setState(221);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM_INT:
				enterOuterAlt(_localctx, 1);
				{
				setState(197);
				match(NUM_INT);
				setState(202);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(198);
						match(T__1);
						setState(199);
						parametros_nodes();
						}
						} 
					}
					setState(204);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,9,_ctx);
				}
				}
				break;
			case NUM_REAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(205);
				match(NUM_REAL);
				setState(210);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(206);
						match(T__1);
						setState(207);
						parametros_nodes();
						}
						} 
					}
					setState(212);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
				}
				}
				break;
			case STRING:
				enterOuterAlt(_localctx, 3);
				{
				setState(213);
				match(STRING);
				setState(218);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(214);
						match(T__1);
						setState(215);
						parametros_nodes();
						}
						} 
					}
					setState(220);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
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
		enterRule(_localctx, 42, RULE_nodes);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			match(T__28);
			setState(224);
			parametros_nodes();
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(225);
				match(T__1);
				setState(226);
				parametros_nodes();
				}
				}
				setState(231);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(232);
			match(T__29);
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\'\u00ed\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\5\3\5\3\5\3\5\7\5<\n\5\f\5\16\5?\13\5\3\6\3\6\3\6\7"+
		"\6D\n\6\f\6\16\6G\13\6\3\6\3\6\3\6\3\7\7\7M\n\7\f\7\16\7P\13\7\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bY\n\b\3\t\5\t\\\n\t\3\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\5\f\u008b\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u00ab\n\21\3\22\3\22\3\22\3\22\7\22"+
		"\u00b1\n\22\f\22\16\22\u00b4\13\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\23\3\24\3\24\3\25\3\25\3\25\3\25\5\25\u00c6\n\25\3\26\3\26"+
		"\3\26\7\26\u00cb\n\26\f\26\16\26\u00ce\13\26\3\26\3\26\3\26\7\26\u00d3"+
		"\n\26\f\26\16\26\u00d6\13\26\3\26\3\26\3\26\7\26\u00db\n\26\f\26\16\26"+
		"\u00de\13\26\5\26\u00e0\n\26\3\27\3\27\3\27\3\27\7\27\u00e6\n\27\f\27"+
		"\16\27\u00e9\13\27\3\27\3\27\3\27\2\2\30\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,\2\6\3\2\f\r\3\2#&\4\2\b\b\32\36\3\2$&\u00f0\2.\3\2\2"+
		"\2\4\60\3\2\2\2\6\64\3\2\2\2\b\67\3\2\2\2\n@\3\2\2\2\fN\3\2\2\2\16X\3"+
		"\2\2\2\20[\3\2\2\2\22]\3\2\2\2\24a\3\2\2\2\26\u008a\3\2\2\2\30\u008c\3"+
		"\2\2\2\32\u0098\3\2\2\2\34\u00a0\3\2\2\2\36\u00a2\3\2\2\2 \u00aa\3\2\2"+
		"\2\"\u00ac\3\2\2\2$\u00b7\3\2\2\2&\u00bf\3\2\2\2(\u00c5\3\2\2\2*\u00df"+
		"\3\2\2\2,\u00e1\3\2\2\2./\5\4\3\2/\3\3\2\2\2\60\61\7\"\2\2\61\62\5\6\4"+
		"\2\62\63\7!\2\2\63\5\3\2\2\2\64\65\5\b\5\2\65\66\5\f\7\2\66\7\3\2\2\2"+
		"\678\7\3\2\28=\5\n\6\29:\7\4\2\2:<\5\n\6\2;9\3\2\2\2<?\3\2\2\2=;\3\2\2"+
		"\2=>\3\2\2\2>\t\3\2\2\2?=\3\2\2\2@E\7#\2\2AB\7\4\2\2BD\7#\2\2CA\3\2\2"+
		"\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2GE\3\2\2\2HI\7\5\2\2IJ\5\36"+
		"\20\2J\13\3\2\2\2KM\5\26\f\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2O"+
		"\r\3\2\2\2PN\3\2\2\2QR\7\6\2\2RS\7&\2\2ST\7\7\2\2TU\7\b\2\2UY\7#\2\2V"+
		"W\7\b\2\2WY\7#\2\2XQ\3\2\2\2XV\3\2\2\2Y\17\3\2\2\2Z\\\7\t\2\2[Z\3\2\2"+
		"\2[\\\3\2\2\2\\\21\3\2\2\2]^\7\n\2\2^_\7\13\2\2_`\7#\2\2`\23\3\2\2\2a"+
		"b\t\2\2\2b\25\3\2\2\2cd\5\20\t\2de\7\16\2\2ef\7\b\2\2fg\7#\2\2gh\7\17"+
		"\2\2hi\5\30\r\2ij\7\20\2\2j\u008b\3\2\2\2kl\5\20\t\2lm\7\21\2\2mn\7\b"+
		"\2\2no\7#\2\2op\5\22\n\2p\u008b\3\2\2\2qr\7\22\2\2rs\7\b\2\2st\7#\2\2"+
		"tu\7\23\2\2uv\7\17\2\2vw\5\32\16\2wx\7\20\2\2x\u008b\3\2\2\2yz\7\24\2"+
		"\2z{\7\b\2\2{\u008b\7#\2\2|}\5\20\t\2}~\7\25\2\2~\177\5\24\13\2\177\u0080"+
		"\7\26\2\2\u0080\u0081\5\16\b\2\u0081\u008b\3\2\2\2\u0082\u0083\7\27\2"+
		"\2\u0083\u0084\7\b\2\2\u0084\u0085\7#\2\2\u0085\u0086\7\17\2\2\u0086\u008b"+
		"\7\20\2\2\u0087\u0088\7#\2\2\u0088\u0089\7\30\2\2\u0089\u008b\5 \21\2"+
		"\u008ac\3\2\2\2\u008ak\3\2\2\2\u008aq\3\2\2\2\u008ay\3\2\2\2\u008a|\3"+
		"\2\2\2\u008a\u0082\3\2\2\2\u008a\u0087\3\2\2\2\u008b\27\3\2\2\2\u008c"+
		"\u008d\7\31\2\2\u008d\u008e\7\30\2\2\u008e\u008f\5\34\17\2\u008f\u0090"+
		"\7\4\2\2\u0090\u0091\7\32\2\2\u0091\u0092\7\30\2\2\u0092\u0093\5\34\17"+
		"\2\u0093\u0094\7\4\2\2\u0094\u0095\7\33\2\2\u0095\u0096\7\30\2\2\u0096"+
		"\u0097\5\34\17\2\u0097\31\3\2\2\2\u0098\u0099\7\33\2\2\u0099\u009a\7\30"+
		"\2\2\u009a\u009b\5\34\17\2\u009b\u009c\7\4\2\2\u009c\u009d\7\32\2\2\u009d"+
		"\u009e\7\30\2\2\u009e\u009f\5\34\17\2\u009f\33\3\2\2\2\u00a0\u00a1\t\3"+
		"\2\2\u00a1\35\3\2\2\2\u00a2\u00a3\t\4\2\2\u00a3\37\3\2\2\2\u00a4\u00ab"+
		"\7$\2\2\u00a5\u00ab\7%\2\2\u00a6\u00ab\7#\2\2\u00a7\u00ab\7&\2\2\u00a8"+
		"\u00ab\5,\27\2\u00a9\u00ab\5\"\22\2\u00aa\u00a4\3\2\2\2\u00aa\u00a5\3"+
		"\2\2\2\u00aa\u00a6\3\2\2\2\u00aa\u00a7\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa"+
		"\u00a9\3\2\2\2\u00ab!\3\2\2\2\u00ac\u00ad\7\37\2\2\u00ad\u00b2\5$\23\2"+
		"\u00ae\u00af\7\4\2\2\u00af\u00b1\5$\23\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4"+
		"\3\2\2\2\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b5\3\2\2\2\u00b4"+
		"\u00b2\3\2\2\2\u00b5\u00b6\7 \2\2\u00b6#\3\2\2\2\u00b7\u00b8\7\17\2\2"+
		"\u00b8\u00b9\5&\24\2\u00b9\u00ba\7\4\2\2\u00ba\u00bb\5&\24\2\u00bb\u00bc"+
		"\7\4\2\2\u00bc\u00bd\5(\25\2\u00bd\u00be\7\20\2\2\u00be%\3\2\2\2\u00bf"+
		"\u00c0\t\5\2\2\u00c0\'\3\2\2\2\u00c1\u00c6\7$\2\2\u00c2\u00c6\7%\2\2\u00c3"+
		"\u00c6\7&\2\2\u00c4\u00c6\3\2\2\2\u00c5\u00c1\3\2\2\2\u00c5\u00c2\3\2"+
		"\2\2\u00c5\u00c3\3\2\2\2\u00c5\u00c4\3\2\2\2\u00c6)\3\2\2\2\u00c7\u00cc"+
		"\7$\2\2\u00c8\u00c9\7\4\2\2\u00c9\u00cb\5*\26\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00e0\3\2"+
		"\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00d4\7%\2\2\u00d0\u00d1\7\4\2\2\u00d1"+
		"\u00d3\5*\26\2\u00d2\u00d0\3\2\2\2\u00d3\u00d6\3\2\2\2\u00d4\u00d2\3\2"+
		"\2\2\u00d4\u00d5\3\2\2\2\u00d5\u00e0\3\2\2\2\u00d6\u00d4\3\2\2\2\u00d7"+
		"\u00dc\7&\2\2\u00d8\u00d9\7\4\2\2\u00d9\u00db\5*\26\2\u00da\u00d8\3\2"+
		"\2\2\u00db\u00de\3\2\2\2\u00dc\u00da\3\2\2\2\u00dc\u00dd\3\2\2\2\u00dd"+
		"\u00e0\3\2\2\2\u00de\u00dc\3\2\2\2\u00df\u00c7\3\2\2\2\u00df\u00cf\3\2"+
		"\2\2\u00df\u00d7\3\2\2\2\u00e0+\3\2\2\2\u00e1\u00e2\7\37\2\2\u00e2\u00e7"+
		"\5*\26\2\u00e3\u00e4\7\4\2\2\u00e4\u00e6\5*\26\2\u00e5\u00e3\3\2\2\2\u00e6"+
		"\u00e9\3\2\2\2\u00e7\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\u00ea\3\2"+
		"\2\2\u00e9\u00e7\3\2\2\2\u00ea\u00eb\7 \2\2\u00eb-\3\2\2\2\20=ENX[\u008a"+
		"\u00aa\u00b2\u00c5\u00cc\u00d4\u00dc\u00df\u00e7";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}