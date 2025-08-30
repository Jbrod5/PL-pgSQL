// Generated from /home/jorge/Compi_2/PL-pgSQL/PL-pgSQL/src/gramaticas/pgsql.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class pgsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		DECLARE=1, ARRAY=2, INTEGER_KW=3, DECIMAL_KW=4, VARCHAR_KW=5, CHAR_KW=6, 
		BOOLEAN_KW=7, DATE_KW=8, TRUE=9, FALSE=10, ASSIGN=11, COMMA=12, SEMICOLON=13, 
		LBRACK=14, RBRACK=15, LPAREN=16, RPAREN=17, DECIMAL_LIT=18, INT=19, DATE_LIT=20, 
		STRING=21, CHAR_LITERAL=22, IDENT=23, LINE_COMMENT=24, BLOCK_COMMENT=25, 
		WS=26;
	public static final int
		RULE_script = 0, RULE_valor = 1, RULE_valores = 2, RULE_array_literal = 3, 
		RULE_tipo_base = 4, RULE_tipo_array = 5, RULE_tipo = 6, RULE_declaracion_normal = 7, 
		RULE_declaracion_array = 8, RULE_declaraciones = 9, RULE_declaracion = 10;
	private static String[] makeRuleNames() {
		return new String[] {
			"script", "valor", "valores", "array_literal", "tipo_base", "tipo_array", 
			"tipo", "declaracion_normal", "declaracion_array", "declaraciones", "declaracion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'DECLARE'", "'ARRAY'", "'INTEGER'", "'DECIMAL'", "'VARCHAR'", 
			"'CHAR'", "'BOOLEAN'", "'DATE'", "'TRUE'", "'FALSE'", "':='", "','", 
			"';'", "'['", "']'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "DECLARE", "ARRAY", "INTEGER_KW", "DECIMAL_KW", "VARCHAR_KW", "CHAR_KW", 
			"BOOLEAN_KW", "DATE_KW", "TRUE", "FALSE", "ASSIGN", "COMMA", "SEMICOLON", 
			"LBRACK", "RBRACK", "LPAREN", "RPAREN", "DECIMAL_LIT", "INT", "DATE_LIT", 
			"STRING", "CHAR_LITERAL", "IDENT", "LINE_COMMENT", "BLOCK_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "pgsql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public pgsqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ScriptContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(pgsqlParser.EOF, 0); }
		public ScriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterScript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitScript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitScript(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ScriptContext script() throws RecognitionException {
		ScriptContext _localctx = new ScriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_script);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			declaracion();
			setState(23);
			match(EOF);
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValorContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(pgsqlParser.STRING, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(pgsqlParser.CHAR_LITERAL, 0); }
		public TerminalNode DECIMAL_LIT() { return getToken(pgsqlParser.DECIMAL_LIT, 0); }
		public TerminalNode INT() { return getToken(pgsqlParser.INT, 0); }
		public TerminalNode DATE_LIT() { return getToken(pgsqlParser.DATE_LIT, 0); }
		public TerminalNode IDENT() { return getToken(pgsqlParser.IDENT, 0); }
		public TerminalNode TRUE() { return getToken(pgsqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(pgsqlParser.FALSE, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterValor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitValor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitValor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_valor);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 16516608L) != 0)) ) {
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

	@SuppressWarnings("CheckReturnValue")
	public static class ValoresContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(pgsqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(pgsqlParser.COMMA, i);
		}
		public ValoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterValores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitValores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitValores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValoresContext valores() throws RecognitionException {
		ValoresContext _localctx = new ValoresContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_valores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
			valor();
			setState(32);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(28);
				match(COMMA);
				setState(29);
				valor();
				}
				}
				setState(34);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Array_literalContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(pgsqlParser.ARRAY, 0); }
		public TerminalNode LBRACK() { return getToken(pgsqlParser.LBRACK, 0); }
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public TerminalNode RBRACK() { return getToken(pgsqlParser.RBRACK, 0); }
		public Array_literalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterArray_literal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitArray_literal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitArray_literal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_literalContext array_literal() throws RecognitionException {
		Array_literalContext _localctx = new Array_literalContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_array_literal);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35);
			match(ARRAY);
			setState(36);
			match(LBRACK);
			setState(37);
			valores();
			setState(38);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_baseContext extends ParserRuleContext {
		public TerminalNode INTEGER_KW() { return getToken(pgsqlParser.INTEGER_KW, 0); }
		public TerminalNode DECIMAL_KW() { return getToken(pgsqlParser.DECIMAL_KW, 0); }
		public TerminalNode VARCHAR_KW() { return getToken(pgsqlParser.VARCHAR_KW, 0); }
		public TerminalNode LPAREN() { return getToken(pgsqlParser.LPAREN, 0); }
		public TerminalNode INT() { return getToken(pgsqlParser.INT, 0); }
		public TerminalNode RPAREN() { return getToken(pgsqlParser.RPAREN, 0); }
		public TerminalNode CHAR_KW() { return getToken(pgsqlParser.CHAR_KW, 0); }
		public TerminalNode BOOLEAN_KW() { return getToken(pgsqlParser.BOOLEAN_KW, 0); }
		public TerminalNode DATE_KW() { return getToken(pgsqlParser.DATE_KW, 0); }
		public Tipo_baseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_base; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterTipo_base(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitTipo_base(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitTipo_base(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_baseContext tipo_base() throws RecognitionException {
		Tipo_baseContext _localctx = new Tipo_baseContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_tipo_base);
		try {
			setState(49);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER_KW:
				enterOuterAlt(_localctx, 1);
				{
				setState(40);
				match(INTEGER_KW);
				}
				break;
			case DECIMAL_KW:
				enterOuterAlt(_localctx, 2);
				{
				setState(41);
				match(DECIMAL_KW);
				}
				break;
			case VARCHAR_KW:
				enterOuterAlt(_localctx, 3);
				{
				setState(42);
				match(VARCHAR_KW);
				setState(43);
				match(LPAREN);
				setState(44);
				match(INT);
				setState(45);
				match(RPAREN);
				}
				break;
			case CHAR_KW:
				enterOuterAlt(_localctx, 4);
				{
				setState(46);
				match(CHAR_KW);
				}
				break;
			case BOOLEAN_KW:
				enterOuterAlt(_localctx, 5);
				{
				setState(47);
				match(BOOLEAN_KW);
				}
				break;
			case DATE_KW:
				enterOuterAlt(_localctx, 6);
				{
				setState(48);
				match(DATE_KW);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Tipo_arrayContext extends ParserRuleContext {
		public Tipo_baseContext tipo_base() {
			return getRuleContext(Tipo_baseContext.class,0);
		}
		public TerminalNode LBRACK() { return getToken(pgsqlParser.LBRACK, 0); }
		public TerminalNode RBRACK() { return getToken(pgsqlParser.RBRACK, 0); }
		public Tipo_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterTipo_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitTipo_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitTipo_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_arrayContext tipo_array() throws RecognitionException {
		Tipo_arrayContext _localctx = new Tipo_arrayContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			tipo_base();
			setState(52);
			match(LBRACK);
			setState(53);
			match(RBRACK);
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

	@SuppressWarnings("CheckReturnValue")
	public static class TipoContext extends ParserRuleContext {
		public Tipo_baseContext tipo_base() {
			return getRuleContext(Tipo_baseContext.class,0);
		}
		public Tipo_arrayContext tipo_array() {
			return getRuleContext(Tipo_arrayContext.class,0);
		}
		public TipoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterTipo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitTipo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitTipo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tipo);
		try {
			setState(57);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(55);
				tipo_base();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(56);
				tipo_array();
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracion_normalContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(pgsqlParser.IDENT, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(pgsqlParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(pgsqlParser.ASSIGN, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public Declaracion_normalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_normal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterDeclaracion_normal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitDeclaracion_normal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitDeclaracion_normal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_normalContext declaracion_normal() throws RecognitionException {
		Declaracion_normalContext _localctx = new Declaracion_normalContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_declaracion_normal);
		try {
			setState(69);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(59);
				match(IDENT);
				setState(60);
				tipo();
				setState(61);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(IDENT);
				setState(64);
				tipo();
				setState(65);
				match(ASSIGN);
				setState(66);
				valor();
				setState(67);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class Declaracion_arrayContext extends ParserRuleContext {
		public TerminalNode IDENT() { return getToken(pgsqlParser.IDENT, 0); }
		public Tipo_arrayContext tipo_array() {
			return getRuleContext(Tipo_arrayContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(pgsqlParser.SEMICOLON, 0); }
		public TerminalNode ASSIGN() { return getToken(pgsqlParser.ASSIGN, 0); }
		public Array_literalContext array_literal() {
			return getRuleContext(Array_literalContext.class,0);
		}
		public Declaracion_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterDeclaracion_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitDeclaracion_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitDeclaracion_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Declaracion_arrayContext declaracion_array() throws RecognitionException {
		Declaracion_arrayContext _localctx = new Declaracion_arrayContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracion_array);
		try {
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(71);
				match(IDENT);
				setState(72);
				tipo_array();
				setState(73);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				match(IDENT);
				setState(76);
				tipo_array();
				setState(77);
				match(ASSIGN);
				setState(78);
				array_literal();
				setState(79);
				match(SEMICOLON);
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionesContext extends ParserRuleContext {
		public List<Declaracion_normalContext> declaracion_normal() {
			return getRuleContexts(Declaracion_normalContext.class);
		}
		public Declaracion_normalContext declaracion_normal(int i) {
			return getRuleContext(Declaracion_normalContext.class,i);
		}
		public List<Declaracion_arrayContext> declaracion_array() {
			return getRuleContexts(Declaracion_arrayContext.class);
		}
		public Declaracion_arrayContext declaracion_array(int i) {
			return getRuleContext(Declaracion_arrayContext.class,i);
		}
		public DeclaracionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaraciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterDeclaraciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitDeclaraciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitDeclaraciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaraciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				setState(85);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
				case 1:
					{
					setState(83);
					declaracion_normal();
					}
					break;
				case 2:
					{
					setState(84);
					declaracion_array();
					}
					break;
				}
				}
				setState(87); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENT );
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

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionContext extends ParserRuleContext {
		public TerminalNode DECLARE() { return getToken(pgsqlParser.DECLARE, 0); }
		public DeclaracionesContext declaraciones() {
			return getRuleContext(DeclaracionesContext.class,0);
		}
		public DeclaracionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterDeclaracion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitDeclaracion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitDeclaracion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			match(DECLARE);
			setState(90);
			declaraciones();
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
		"\u0004\u0001\u001a]\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0005"+
		"\u0002\u001f\b\u0002\n\u0002\f\u0002\"\t\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0003\u00042\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0003\u0006:\b\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0003\u0007F\b\u0007\u0001\b\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\bR\b\b"+
		"\u0001\t\u0001\t\u0004\tV\b\t\u000b\t\f\tW\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0000\u0000\u000b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014"+
		"\u0000\u0001\u0002\u0000\t\n\u0012\u0017\\\u0000\u0016\u0001\u0000\u0000"+
		"\u0000\u0002\u0019\u0001\u0000\u0000\u0000\u0004\u001b\u0001\u0000\u0000"+
		"\u0000\u0006#\u0001\u0000\u0000\u0000\b1\u0001\u0000\u0000\u0000\n3\u0001"+
		"\u0000\u0000\u0000\f9\u0001\u0000\u0000\u0000\u000eE\u0001\u0000\u0000"+
		"\u0000\u0010Q\u0001\u0000\u0000\u0000\u0012U\u0001\u0000\u0000\u0000\u0014"+
		"Y\u0001\u0000\u0000\u0000\u0016\u0017\u0003\u0014\n\u0000\u0017\u0018"+
		"\u0005\u0000\u0000\u0001\u0018\u0001\u0001\u0000\u0000\u0000\u0019\u001a"+
		"\u0007\u0000\u0000\u0000\u001a\u0003\u0001\u0000\u0000\u0000\u001b \u0003"+
		"\u0002\u0001\u0000\u001c\u001d\u0005\f\u0000\u0000\u001d\u001f\u0003\u0002"+
		"\u0001\u0000\u001e\u001c\u0001\u0000\u0000\u0000\u001f\"\u0001\u0000\u0000"+
		"\u0000 \u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u0005"+
		"\u0001\u0000\u0000\u0000\" \u0001\u0000\u0000\u0000#$\u0005\u0002\u0000"+
		"\u0000$%\u0005\u000e\u0000\u0000%&\u0003\u0004\u0002\u0000&\'\u0005\u000f"+
		"\u0000\u0000\'\u0007\u0001\u0000\u0000\u0000(2\u0005\u0003\u0000\u0000"+
		")2\u0005\u0004\u0000\u0000*+\u0005\u0005\u0000\u0000+,\u0005\u0010\u0000"+
		"\u0000,-\u0005\u0013\u0000\u0000-2\u0005\u0011\u0000\u0000.2\u0005\u0006"+
		"\u0000\u0000/2\u0005\u0007\u0000\u000002\u0005\b\u0000\u00001(\u0001\u0000"+
		"\u0000\u00001)\u0001\u0000\u0000\u00001*\u0001\u0000\u0000\u00001.\u0001"+
		"\u0000\u0000\u00001/\u0001\u0000\u0000\u000010\u0001\u0000\u0000\u0000"+
		"2\t\u0001\u0000\u0000\u000034\u0003\b\u0004\u000045\u0005\u000e\u0000"+
		"\u000056\u0005\u000f\u0000\u00006\u000b\u0001\u0000\u0000\u00007:\u0003"+
		"\b\u0004\u00008:\u0003\n\u0005\u000097\u0001\u0000\u0000\u000098\u0001"+
		"\u0000\u0000\u0000:\r\u0001\u0000\u0000\u0000;<\u0005\u0017\u0000\u0000"+
		"<=\u0003\f\u0006\u0000=>\u0005\r\u0000\u0000>F\u0001\u0000\u0000\u0000"+
		"?@\u0005\u0017\u0000\u0000@A\u0003\f\u0006\u0000AB\u0005\u000b\u0000\u0000"+
		"BC\u0003\u0002\u0001\u0000CD\u0005\r\u0000\u0000DF\u0001\u0000\u0000\u0000"+
		"E;\u0001\u0000\u0000\u0000E?\u0001\u0000\u0000\u0000F\u000f\u0001\u0000"+
		"\u0000\u0000GH\u0005\u0017\u0000\u0000HI\u0003\n\u0005\u0000IJ\u0005\r"+
		"\u0000\u0000JR\u0001\u0000\u0000\u0000KL\u0005\u0017\u0000\u0000LM\u0003"+
		"\n\u0005\u0000MN\u0005\u000b\u0000\u0000NO\u0003\u0006\u0003\u0000OP\u0005"+
		"\r\u0000\u0000PR\u0001\u0000\u0000\u0000QG\u0001\u0000\u0000\u0000QK\u0001"+
		"\u0000\u0000\u0000R\u0011\u0001\u0000\u0000\u0000SV\u0003\u000e\u0007"+
		"\u0000TV\u0003\u0010\b\u0000US\u0001\u0000\u0000\u0000UT\u0001\u0000\u0000"+
		"\u0000VW\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000"+
		"\u0000\u0000X\u0013\u0001\u0000\u0000\u0000YZ\u0005\u0001\u0000\u0000"+
		"Z[\u0003\u0012\t\u0000[\u0015\u0001\u0000\u0000\u0000\u0007 19EQUW";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}