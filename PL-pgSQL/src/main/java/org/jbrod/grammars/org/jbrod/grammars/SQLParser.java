// Generated from /home/jorge/Compi_2/PL-pgSQL/PL-pgSQL/src/gramaticas/SQL.g4 by ANTLR 4.13.2
package org.jbrod.grammars;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, SCHEMA=2, USE=3, TABLE=4, ALTER=5, ADD=6, COLUMN=7, TIPO=8, 
		DROP=9, CONSTRAINT=10, FOREIGN=11, PRIMARY=12, KEY=13, REFERENCES=14, 
		INTEGER=15, VARCHAR=16, BOOLEAN=17, INSERT=18, INTO=19, VALUES=20, UPDATE=21, 
		SET=22, WHERE=23, DELETE=24, FROM=25, SELECT=26, JOIN=27, LEFT_JOIN=28, 
		ON=29, USER=30, GRANT=31, TO=32, REVOKE=33, ALL_SYM=34, NOT=35, NULL=36, 
		EQUALS=37, DOT=38, COMMA=39, LPAREN=40, RPAREN=41, SEMICOLON=42, TRUE=43, 
		FALSE=44, STRING=45, IDENTIFICADOR=46, NUMERO=47, WS=48;
	public static final int
		RULE_valor_op = 0, RULE_valores = 1, RULE_opciones = 2, RULE_create_schema = 3, 
		RULE_use_schema = 4, RULE_tipo_dato = 5, RULE_restriccion_columna = 6, 
		RULE_columna = 7, RULE_llave_foranea = 8, RULE_elemento_tabla = 9, RULE_lista_elementos = 10, 
		RULE_create_table = 11, RULE_alter_add_column = 12, RULE_alter_drop_column = 13, 
		RULE_alter_add_constraint = 14, RULE_alter_drop_constraint = 15, RULE_drop_table = 16, 
		RULE_insert_into = 17, RULE_asignaciones = 18, RULE_update_sentence = 19, 
		RULE_delete_sentence = 20, RULE_columna_prefijo = 21, RULE_columnas = 22, 
		RULE_join_type = 23, RULE_join_clause = 24, RULE_join_list = 25, RULE_select_sentence = 26, 
		RULE_permiso = 27, RULE_tabla_op = 28, RULE_create_user = 29, RULE_grant_perm = 30, 
		RULE_revoke_perm = 31;
	private static String[] makeRuleNames() {
		return new String[] {
			"valor_op", "valores", "opciones", "create_schema", "use_schema", "tipo_dato", 
			"restriccion_columna", "columna", "llave_foranea", "elemento_tabla", 
			"lista_elementos", "create_table", "alter_add_column", "alter_drop_column", 
			"alter_add_constraint", "alter_drop_constraint", "drop_table", "insert_into", 
			"asignaciones", "update_sentence", "delete_sentence", "columna_prefijo", 
			"columnas", "join_type", "join_clause", "join_list", "select_sentence", 
			"permiso", "tabla_op", "create_user", "grant_perm", "revoke_perm"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CREATE'", "'SCHEMA'", "'USE'", "'TABLE'", "'ALTER'", "'ADD'", 
			"'COLUMN'", "'TIPO'", "'DROP'", "'CONSTRAINT'", "'FOREIGN'", "'PRIMARY'", 
			"'KEY'", "'REFERENCES'", "'INTEGER'", "'VARCHAR'", "'BOOLEAN'", "'INSERT'", 
			"'INTO'", "'VALUES'", "'UPDATE'", "'SET'", "'WHERE'", "'DELETE'", "'FROM'", 
			"'SELECT'", "'JOIN'", "'LEFT JOIN'", "'ON'", "'USER'", "'GRANT'", "'TO'", 
			"'REVOKE'", "'*'", "'NOT'", "'NULL'", "'='", "'.'", "','", "'('", "')'", 
			"';'", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CREATE", "SCHEMA", "USE", "TABLE", "ALTER", "ADD", "COLUMN", "TIPO", 
			"DROP", "CONSTRAINT", "FOREIGN", "PRIMARY", "KEY", "REFERENCES", "INTEGER", 
			"VARCHAR", "BOOLEAN", "INSERT", "INTO", "VALUES", "UPDATE", "SET", "WHERE", 
			"DELETE", "FROM", "SELECT", "JOIN", "LEFT_JOIN", "ON", "USER", "GRANT", 
			"TO", "REVOKE", "ALL_SYM", "NOT", "NULL", "EQUALS", "DOT", "COMMA", "LPAREN", 
			"RPAREN", "SEMICOLON", "TRUE", "FALSE", "STRING", "IDENTIFICADOR", "NUMERO", 
			"WS"
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
	public String getGrammarFileName() { return "SQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Valor_opContext extends ParserRuleContext {
		public TerminalNode NUMERO() { return getToken(SQLParser.NUMERO, 0); }
		public TerminalNode TRUE() { return getToken(SQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SQLParser.FALSE, 0); }
		public TerminalNode STRING() { return getToken(SQLParser.STRING, 0); }
		public Valor_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterValor_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitValor_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitValor_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Valor_opContext valor_op() throws RecognitionException {
		Valor_opContext _localctx = new Valor_opContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_valor_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 202310139510784L) != 0)) ) {
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
		public List<Valor_opContext> valor_op() {
			return getRuleContexts(Valor_opContext.class);
		}
		public Valor_opContext valor_op(int i) {
			return getRuleContext(Valor_opContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ValoresContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valores; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterValores(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitValores(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitValores(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValoresContext valores() throws RecognitionException {
		ValoresContext _localctx = new ValoresContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_valores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			valor_op();
			setState(71);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(67);
				match(COMMA);
				setState(68);
				valor_op();
				}
				}
				setState(73);
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
	public static class OpcionesContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SQLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SQLParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public OpcionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_opciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterOpciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitOpciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitOpciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OpcionesContext opciones() throws RecognitionException {
		OpcionesContext _localctx = new OpcionesContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_opciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74);
			match(IDENTIFICADOR);
			setState(79);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(75);
				match(COMMA);
				setState(76);
				match(IDENTIFICADOR);
				}
				}
				setState(81);
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
	public static class Create_schemaContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLParser.SCHEMA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SQLParser.IDENTIFICADOR, 0); }
		public Create_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_schemaContext create_schema() throws RecognitionException {
		Create_schemaContext _localctx = new Create_schemaContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_create_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			match(CREATE);
			setState(83);
			match(SCHEMA);
			setState(84);
			match(IDENTIFICADOR);
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
	public static class Use_schemaContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(SQLParser.USE, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLParser.SCHEMA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SQLParser.IDENTIFICADOR, 0); }
		public Use_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_use_schema; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUse_schema(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUse_schema(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUse_schema(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Use_schemaContext use_schema() throws RecognitionException {
		Use_schemaContext _localctx = new Use_schemaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_use_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(USE);
			setState(87);
			match(SCHEMA);
			setState(88);
			match(IDENTIFICADOR);
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
	public static class Tipo_datoContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(SQLParser.INTEGER, 0); }
		public TerminalNode VARCHAR() { return getToken(SQLParser.VARCHAR, 0); }
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public TerminalNode NUMERO() { return getToken(SQLParser.NUMERO, 0); }
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public TerminalNode BOOLEAN() { return getToken(SQLParser.BOOLEAN, 0); }
		public Tipo_datoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipo_dato; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTipo_dato(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTipo_dato(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTipo_dato(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tipo_datoContext tipo_dato() throws RecognitionException {
		Tipo_datoContext _localctx = new Tipo_datoContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tipo_dato);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(INTEGER);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(VARCHAR);
				setState(92);
				match(LPAREN);
				setState(93);
				match(NUMERO);
				setState(94);
				match(RPAREN);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				match(BOOLEAN);
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
	public static class Restriccion_columnaContext extends ParserRuleContext {
		public TerminalNode PRIMARY() { return getToken(SQLParser.PRIMARY, 0); }
		public TerminalNode KEY() { return getToken(SQLParser.KEY, 0); }
		public TerminalNode NOT() { return getToken(SQLParser.NOT, 0); }
		public TerminalNode NULL() { return getToken(SQLParser.NULL, 0); }
		public Restriccion_columnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restriccion_columna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRestriccion_columna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRestriccion_columna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRestriccion_columna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Restriccion_columnaContext restriccion_columna() throws RecognitionException {
		Restriccion_columnaContext _localctx = new Restriccion_columnaContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_restriccion_columna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(98);
				match(PRIMARY);
				setState(99);
				match(KEY);
				}
			}

			setState(105);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(102);
				match(NOT);
				setState(103);
				match(NULL);
				}
				break;
			case NULL:
				{
				setState(104);
				match(NULL);
				}
				break;
			case COMMA:
			case RPAREN:
			case SEMICOLON:
				break;
			default:
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

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnaContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(SQLParser.IDENTIFICADOR, 0); }
		public Tipo_datoContext tipo_dato() {
			return getRuleContext(Tipo_datoContext.class,0);
		}
		public Restriccion_columnaContext restriccion_columna() {
			return getRuleContext(Restriccion_columnaContext.class,0);
		}
		public ColumnaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columna; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumna(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumna(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumna(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnaContext columna() throws RecognitionException {
		ColumnaContext _localctx = new ColumnaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_columna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107);
			match(IDENTIFICADOR);
			setState(108);
			tipo_dato();
			setState(109);
			restriccion_columna();
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
	public static class Llave_foraneaContext extends ParserRuleContext {
		public TerminalNode FOREIGN() { return getToken(SQLParser.FOREIGN, 0); }
		public TerminalNode KEY() { return getToken(SQLParser.KEY, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(SQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(SQLParser.LPAREN, i);
		}
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SQLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SQLParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> RPAREN() { return getTokens(SQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(SQLParser.RPAREN, i);
		}
		public TerminalNode REFERENCES() { return getToken(SQLParser.REFERENCES, 0); }
		public Llave_foraneaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_llave_foranea; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLlave_foranea(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLlave_foranea(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLlave_foranea(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Llave_foraneaContext llave_foranea() throws RecognitionException {
		Llave_foraneaContext _localctx = new Llave_foraneaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_llave_foranea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(FOREIGN);
			setState(112);
			match(KEY);
			setState(113);
			match(LPAREN);
			setState(114);
			match(IDENTIFICADOR);
			setState(115);
			match(RPAREN);
			setState(116);
			match(REFERENCES);
			setState(117);
			match(IDENTIFICADOR);
			setState(118);
			match(LPAREN);
			setState(119);
			match(IDENTIFICADOR);
			setState(120);
			match(RPAREN);
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
	public static class Elemento_tablaContext extends ParserRuleContext {
		public ColumnaContext columna() {
			return getRuleContext(ColumnaContext.class,0);
		}
		public Llave_foraneaContext llave_foranea() {
			return getRuleContext(Llave_foraneaContext.class,0);
		}
		public Elemento_tablaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento_tabla; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterElemento_tabla(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitElemento_tabla(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitElemento_tabla(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Elemento_tablaContext elemento_tabla() throws RecognitionException {
		Elemento_tablaContext _localctx = new Elemento_tablaContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_elemento_tabla);
		try {
			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				columna();
				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				llave_foranea();
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
	public static class Lista_elementosContext extends ParserRuleContext {
		public List<Elemento_tablaContext> elemento_tabla() {
			return getRuleContexts(Elemento_tablaContext.class);
		}
		public Elemento_tablaContext elemento_tabla(int i) {
			return getRuleContext(Elemento_tablaContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public Lista_elementosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lista_elementos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterLista_elementos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitLista_elementos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitLista_elementos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Lista_elementosContext lista_elementos() throws RecognitionException {
		Lista_elementosContext _localctx = new Lista_elementosContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_lista_elementos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			elemento_tabla();
			setState(131);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(127);
				match(COMMA);
				setState(128);
				elemento_tabla();
				}
				}
				setState(133);
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
	public static class Create_tableContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SQLParser.IDENTIFICADOR, 0); }
		public TerminalNode LPAREN() { return getToken(SQLParser.LPAREN, 0); }
		public Lista_elementosContext lista_elementos() {
			return getRuleContext(Lista_elementosContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(SQLParser.RPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_create_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(CREATE);
			setState(135);
			match(TABLE);
			setState(136);
			match(IDENTIFICADOR);
			setState(137);
			match(LPAREN);
			setState(138);
			lista_elementos();
			setState(139);
			match(RPAREN);
			setState(140);
			match(SEMICOLON);
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
	public static class Alter_add_columnContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SQLParser.IDENTIFICADOR, 0); }
		public TerminalNode ADD() { return getToken(SQLParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SQLParser.COLUMN, 0); }
		public ColumnaContext columna() {
			return getRuleContext(ColumnaContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
		public Alter_add_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_add_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_add_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_add_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_add_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_add_columnContext alter_add_column() throws RecognitionException {
		Alter_add_columnContext _localctx = new Alter_add_columnContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_alter_add_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(142);
			match(ALTER);
			setState(143);
			match(TABLE);
			setState(144);
			match(IDENTIFICADOR);
			setState(145);
			match(ADD);
			setState(146);
			match(COLUMN);
			setState(147);
			columna();
			setState(148);
			match(SEMICOLON);
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
	public static class Alter_drop_columnContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SQLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SQLParser.IDENTIFICADOR, i);
		}
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public TerminalNode COLUMN() { return getToken(SQLParser.COLUMN, 0); }
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
		public Alter_drop_columnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_drop_column; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_drop_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_drop_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_drop_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_drop_columnContext alter_drop_column() throws RecognitionException {
		Alter_drop_columnContext _localctx = new Alter_drop_columnContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_alter_drop_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			match(ALTER);
			setState(151);
			match(TABLE);
			setState(152);
			match(IDENTIFICADOR);
			setState(153);
			match(DROP);
			setState(154);
			match(COLUMN);
			setState(155);
			match(IDENTIFICADOR);
			setState(156);
			match(SEMICOLON);
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
	public static class Alter_add_constraintContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SQLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SQLParser.IDENTIFICADOR, i);
		}
		public TerminalNode ADD() { return getToken(SQLParser.ADD, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SQLParser.CONSTRAINT, 0); }
		public Llave_foraneaContext llave_foranea() {
			return getRuleContext(Llave_foraneaContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
		public Alter_add_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_add_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_add_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_add_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_add_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_add_constraintContext alter_add_constraint() throws RecognitionException {
		Alter_add_constraintContext _localctx = new Alter_add_constraintContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_alter_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			match(ALTER);
			setState(159);
			match(TABLE);
			setState(160);
			match(IDENTIFICADOR);
			setState(161);
			match(ADD);
			setState(162);
			match(CONSTRAINT);
			setState(163);
			match(IDENTIFICADOR);
			setState(164);
			llave_foranea();
			setState(165);
			match(SEMICOLON);
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
	public static class Alter_drop_constraintContext extends ParserRuleContext {
		public TerminalNode ALTER() { return getToken(SQLParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SQLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SQLParser.IDENTIFICADOR, i);
		}
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public TerminalNode CONSTRAINT() { return getToken(SQLParser.CONSTRAINT, 0); }
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
		public Alter_drop_constraintContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alter_drop_constraint; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAlter_drop_constraint(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAlter_drop_constraint(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAlter_drop_constraint(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Alter_drop_constraintContext alter_drop_constraint() throws RecognitionException {
		Alter_drop_constraintContext _localctx = new Alter_drop_constraintContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_alter_drop_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(ALTER);
			setState(168);
			match(TABLE);
			setState(169);
			match(IDENTIFICADOR);
			setState(170);
			match(DROP);
			setState(171);
			match(CONSTRAINT);
			setState(172);
			match(IDENTIFICADOR);
			setState(173);
			match(SEMICOLON);
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
	public static class Drop_tableContext extends ParserRuleContext {
		public TerminalNode DROP() { return getToken(SQLParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SQLParser.TABLE, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SQLParser.IDENTIFICADOR, 0); }
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
		public Drop_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDrop_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDrop_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDrop_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_tableContext drop_table() throws RecognitionException {
		Drop_tableContext _localctx = new Drop_tableContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_drop_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
			match(DROP);
			setState(176);
			match(TABLE);
			setState(177);
			match(IDENTIFICADOR);
			setState(178);
			match(SEMICOLON);
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
	public static class Insert_intoContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SQLParser.INTO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SQLParser.IDENTIFICADOR, 0); }
		public List<TerminalNode> LPAREN() { return getTokens(SQLParser.LPAREN); }
		public TerminalNode LPAREN(int i) {
			return getToken(SQLParser.LPAREN, i);
		}
		public OpcionesContext opciones() {
			return getRuleContext(OpcionesContext.class,0);
		}
		public List<TerminalNode> RPAREN() { return getTokens(SQLParser.RPAREN); }
		public TerminalNode RPAREN(int i) {
			return getToken(SQLParser.RPAREN, i);
		}
		public TerminalNode VALUES() { return getToken(SQLParser.VALUES, 0); }
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public Insert_intoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_into; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterInsert_into(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitInsert_into(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitInsert_into(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_intoContext insert_into() throws RecognitionException {
		Insert_intoContext _localctx = new Insert_intoContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_insert_into);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(INSERT);
			setState(181);
			match(INTO);
			setState(182);
			match(IDENTIFICADOR);
			setState(183);
			match(LPAREN);
			setState(184);
			opciones();
			setState(185);
			match(RPAREN);
			setState(186);
			match(VALUES);
			setState(187);
			match(LPAREN);
			setState(188);
			valores();
			setState(189);
			match(RPAREN);
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
	public static class AsignacionesContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SQLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SQLParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> EQUALS() { return getTokens(SQLParser.EQUALS); }
		public TerminalNode EQUALS(int i) {
			return getToken(SQLParser.EQUALS, i);
		}
		public List<Valor_opContext> valor_op() {
			return getRuleContexts(Valor_opContext.class);
		}
		public Valor_opContext valor_op(int i) {
			return getRuleContext(Valor_opContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public AsignacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterAsignaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitAsignaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitAsignaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionesContext asignaciones() throws RecognitionException {
		AsignacionesContext _localctx = new AsignacionesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_asignaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(IDENTIFICADOR);
			setState(192);
			match(EQUALS);
			setState(193);
			valor_op();
			setState(200);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(194);
				match(COMMA);
				setState(195);
				match(IDENTIFICADOR);
				setState(196);
				match(EQUALS);
				setState(197);
				valor_op();
				}
				}
				setState(202);
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
	public static class Update_sentenceContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(SQLParser.UPDATE, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SQLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SQLParser.IDENTIFICADOR, i);
		}
		public TerminalNode SET() { return getToken(SQLParser.SET, 0); }
		public AsignacionesContext asignaciones() {
			return getRuleContext(AsignacionesContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public TerminalNode EQUALS() { return getToken(SQLParser.EQUALS, 0); }
		public Valor_opContext valor_op() {
			return getRuleContext(Valor_opContext.class,0);
		}
		public Update_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterUpdate_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitUpdate_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitUpdate_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_sentenceContext update_sentence() throws RecognitionException {
		Update_sentenceContext _localctx = new Update_sentenceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_update_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(203);
			match(UPDATE);
			setState(204);
			match(IDENTIFICADOR);
			setState(205);
			match(SET);
			setState(206);
			asignaciones();
			setState(207);
			match(WHERE);
			setState(208);
			match(IDENTIFICADOR);
			setState(209);
			match(EQUALS);
			setState(210);
			valor_op();
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
	public static class Delete_sentenceContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SQLParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SQLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SQLParser.IDENTIFICADOR, i);
		}
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public TerminalNode EQUALS() { return getToken(SQLParser.EQUALS, 0); }
		public Valor_opContext valor_op() {
			return getRuleContext(Valor_opContext.class,0);
		}
		public Delete_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDelete_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDelete_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDelete_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_sentenceContext delete_sentence() throws RecognitionException {
		Delete_sentenceContext _localctx = new Delete_sentenceContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_delete_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(212);
			match(DELETE);
			setState(213);
			match(FROM);
			setState(214);
			match(IDENTIFICADOR);
			setState(215);
			match(WHERE);
			setState(216);
			match(IDENTIFICADOR);
			setState(217);
			match(EQUALS);
			setState(218);
			valor_op();
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
	public static class Columna_prefijoContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SQLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SQLParser.IDENTIFICADOR, i);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Columna_prefijoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columna_prefijo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumna_prefijo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumna_prefijo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumna_prefijo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Columna_prefijoContext columna_prefijo() throws RecognitionException {
		Columna_prefijoContext _localctx = new Columna_prefijoContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_columna_prefijo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(220);
				match(IDENTIFICADOR);
				setState(221);
				match(DOT);
				}
				break;
			}
			setState(224);
			match(IDENTIFICADOR);
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
	public static class ColumnasContext extends ParserRuleContext {
		public List<Columna_prefijoContext> columna_prefijo() {
			return getRuleContexts(Columna_prefijoContext.class);
		}
		public Columna_prefijoContext columna_prefijo(int i) {
			return getRuleContext(Columna_prefijoContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SQLParser.COMMA, i);
		}
		public ColumnasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterColumnas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitColumnas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitColumnas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnasContext columnas() throws RecognitionException {
		ColumnasContext _localctx = new ColumnasContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_columnas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			columna_prefijo();
			setState(231);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(227);
				match(COMMA);
				setState(228);
				columna_prefijo();
				}
				}
				setState(233);
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
	public static class Join_typeContext extends ParserRuleContext {
		public TerminalNode JOIN() { return getToken(SQLParser.JOIN, 0); }
		public TerminalNode LEFT_JOIN() { return getToken(SQLParser.LEFT_JOIN, 0); }
		public Join_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_typeContext join_type() throws RecognitionException {
		Join_typeContext _localctx = new Join_typeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_join_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(234);
			_la = _input.LA(1);
			if ( !(_la==JOIN || _la==LEFT_JOIN) ) {
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
	public static class Join_clauseContext extends ParserRuleContext {
		public Join_typeContext join_type() {
			return getRuleContext(Join_typeContext.class,0);
		}
		public TerminalNode IDENTIFICADOR() { return getToken(SQLParser.IDENTIFICADOR, 0); }
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public List<Columna_prefijoContext> columna_prefijo() {
			return getRuleContexts(Columna_prefijoContext.class);
		}
		public Columna_prefijoContext columna_prefijo(int i) {
			return getRuleContext(Columna_prefijoContext.class,i);
		}
		public TerminalNode EQUALS() { return getToken(SQLParser.EQUALS, 0); }
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_join_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			join_type();
			setState(237);
			match(IDENTIFICADOR);
			setState(238);
			match(ON);
			setState(239);
			columna_prefijo();
			setState(240);
			match(EQUALS);
			setState(241);
			columna_prefijo();
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
	public static class Join_listContext extends ParserRuleContext {
		public List<Join_clauseContext> join_clause() {
			return getRuleContexts(Join_clauseContext.class);
		}
		public Join_clauseContext join_clause(int i) {
			return getRuleContext(Join_clauseContext.class,i);
		}
		public Join_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterJoin_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitJoin_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitJoin_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_listContext join_list() throws RecognitionException {
		Join_listContext _localctx = new Join_listContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_join_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(246);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JOIN || _la==LEFT_JOIN) {
				{
				{
				setState(243);
				join_clause();
				}
				}
				setState(248);
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
	public static class Select_sentenceContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLParser.SELECT, 0); }
		public ColumnasContext columnas() {
			return getRuleContext(ColumnasContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SQLParser.IDENTIFICADOR, 0); }
		public Join_listContext join_list() {
			return getRuleContext(Join_listContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SQLParser.WHERE, 0); }
		public Columna_prefijoContext columna_prefijo() {
			return getRuleContext(Columna_prefijoContext.class,0);
		}
		public TerminalNode EQUALS() { return getToken(SQLParser.EQUALS, 0); }
		public Valor_opContext valor_op() {
			return getRuleContext(Valor_opContext.class,0);
		}
		public Select_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSelect_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSelect_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSelect_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_sentenceContext select_sentence() throws RecognitionException {
		Select_sentenceContext _localctx = new Select_sentenceContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_select_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(249);
			match(SELECT);
			setState(250);
			columnas();
			setState(251);
			match(FROM);
			setState(252);
			match(IDENTIFICADOR);
			setState(254);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(253);
				join_list();
				}
				break;
			}
			setState(261);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(256);
				match(WHERE);
				setState(257);
				columna_prefijo();
				setState(258);
				match(EQUALS);
				setState(259);
				valor_op();
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

	@SuppressWarnings("CheckReturnValue")
	public static class PermisoContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SQLParser.SELECT, 0); }
		public TerminalNode INSERT() { return getToken(SQLParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(SQLParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(SQLParser.DELETE, 0); }
		public PermisoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_permiso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPermiso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPermiso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPermiso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PermisoContext permiso() throws RecognitionException {
		PermisoContext _localctx = new PermisoContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_permiso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 86245376L) != 0)) ) {
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
	public static class Tabla_opContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(SQLParser.IDENTIFICADOR, 0); }
		public TerminalNode ALL_SYM() { return getToken(SQLParser.ALL_SYM, 0); }
		public Tabla_opContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tabla_op; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterTabla_op(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitTabla_op(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitTabla_op(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Tabla_opContext tabla_op() throws RecognitionException {
		Tabla_opContext _localctx = new Tabla_opContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_tabla_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			_la = _input.LA(1);
			if ( !(_la==ALL_SYM || _la==IDENTIFICADOR) ) {
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
	public static class Create_userContext extends ParserRuleContext {
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public TerminalNode USER() { return getToken(SQLParser.USER, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SQLParser.IDENTIFICADOR, 0); }
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
		public Create_userContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_user; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterCreate_user(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitCreate_user(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitCreate_user(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_userContext create_user() throws RecognitionException {
		Create_userContext _localctx = new Create_userContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_create_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(CREATE);
			setState(268);
			match(USER);
			setState(269);
			match(IDENTIFICADOR);
			setState(270);
			match(SEMICOLON);
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
	public static class Grant_permContext extends ParserRuleContext {
		public TerminalNode GRANT() { return getToken(SQLParser.GRANT, 0); }
		public PermisoContext permiso() {
			return getRuleContext(PermisoContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SQLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SQLParser.IDENTIFICADOR, i);
		}
		public TerminalNode DOT() { return getToken(SQLParser.DOT, 0); }
		public Tabla_opContext tabla_op() {
			return getRuleContext(Tabla_opContext.class,0);
		}
		public TerminalNode TO() { return getToken(SQLParser.TO, 0); }
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
		public Grant_permContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_grant_perm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterGrant_perm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitGrant_perm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitGrant_perm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Grant_permContext grant_perm() throws RecognitionException {
		Grant_permContext _localctx = new Grant_permContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_grant_perm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			match(GRANT);
			setState(273);
			permiso();
			setState(274);
			match(ON);
			setState(275);
			match(IDENTIFICADOR);
			setState(276);
			match(DOT);
			setState(277);
			tabla_op();
			setState(278);
			match(TO);
			setState(279);
			match(IDENTIFICADOR);
			setState(280);
			match(SEMICOLON);
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
	public static class Revoke_permContext extends ParserRuleContext {
		public TerminalNode REVOKE() { return getToken(SQLParser.REVOKE, 0); }
		public PermisoContext permiso() {
			return getRuleContext(PermisoContext.class,0);
		}
		public TerminalNode ON() { return getToken(SQLParser.ON, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(SQLParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(SQLParser.IDENTIFICADOR, i);
		}
		public TerminalNode FROM() { return getToken(SQLParser.FROM, 0); }
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
		public Revoke_permContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_revoke_perm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterRevoke_perm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitRevoke_perm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitRevoke_perm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Revoke_permContext revoke_perm() throws RecognitionException {
		Revoke_permContext _localctx = new Revoke_permContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_revoke_perm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
			match(REVOKE);
			setState(283);
			permiso();
			setState(284);
			match(ON);
			setState(285);
			match(IDENTIFICADOR);
			setState(286);
			match(FROM);
			setState(287);
			match(IDENTIFICADOR);
			setState(288);
			match(SEMICOLON);
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
		"\u0004\u00010\u0123\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001F\b\u0001\n\u0001\f\u0001I\t\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002N\b\u0002\n\u0002\f\u0002Q\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005a\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0003\u0006e\b\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006"+
		"j\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0003\t}\b\t\u0001\n\u0001\n\u0001\n\u0005\n\u0082"+
		"\b\n\n\n\f\n\u0085\t\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0005\u0012\u00c7\b\u0012\n\u0012\f\u0012\u00ca\t\u0012\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u00df\b\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0005\u0016\u00e6\b\u0016\n\u0016\f\u0016\u00e9\t\u0016"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0005\u0019\u00f5\b\u0019"+
		"\n\u0019\f\u0019\u00f8\t\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0003\u001a\u00ff\b\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001a\u0003\u001a\u0106\b\u001a\u0001\u001b\u0001"+
		"\u001b\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0000\u0000 \u0000\u0002\u0004\u0006\b"+
		"\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02"+
		"468:<>\u0000\u0004\u0002\u0000+-//\u0001\u0000\u001b\u001c\u0004\u0000"+
		"\u0012\u0012\u0015\u0015\u0018\u0018\u001a\u001a\u0002\u0000\"\"..\u0111"+
		"\u0000@\u0001\u0000\u0000\u0000\u0002B\u0001\u0000\u0000\u0000\u0004J"+
		"\u0001\u0000\u0000\u0000\u0006R\u0001\u0000\u0000\u0000\bV\u0001\u0000"+
		"\u0000\u0000\n`\u0001\u0000\u0000\u0000\fd\u0001\u0000\u0000\u0000\u000e"+
		"k\u0001\u0000\u0000\u0000\u0010o\u0001\u0000\u0000\u0000\u0012|\u0001"+
		"\u0000\u0000\u0000\u0014~\u0001\u0000\u0000\u0000\u0016\u0086\u0001\u0000"+
		"\u0000\u0000\u0018\u008e\u0001\u0000\u0000\u0000\u001a\u0096\u0001\u0000"+
		"\u0000\u0000\u001c\u009e\u0001\u0000\u0000\u0000\u001e\u00a7\u0001\u0000"+
		"\u0000\u0000 \u00af\u0001\u0000\u0000\u0000\"\u00b4\u0001\u0000\u0000"+
		"\u0000$\u00bf\u0001\u0000\u0000\u0000&\u00cb\u0001\u0000\u0000\u0000("+
		"\u00d4\u0001\u0000\u0000\u0000*\u00de\u0001\u0000\u0000\u0000,\u00e2\u0001"+
		"\u0000\u0000\u0000.\u00ea\u0001\u0000\u0000\u00000\u00ec\u0001\u0000\u0000"+
		"\u00002\u00f6\u0001\u0000\u0000\u00004\u00f9\u0001\u0000\u0000\u00006"+
		"\u0107\u0001\u0000\u0000\u00008\u0109\u0001\u0000\u0000\u0000:\u010b\u0001"+
		"\u0000\u0000\u0000<\u0110\u0001\u0000\u0000\u0000>\u011a\u0001\u0000\u0000"+
		"\u0000@A\u0007\u0000\u0000\u0000A\u0001\u0001\u0000\u0000\u0000BG\u0003"+
		"\u0000\u0000\u0000CD\u0005\'\u0000\u0000DF\u0003\u0000\u0000\u0000EC\u0001"+
		"\u0000\u0000\u0000FI\u0001\u0000\u0000\u0000GE\u0001\u0000\u0000\u0000"+
		"GH\u0001\u0000\u0000\u0000H\u0003\u0001\u0000\u0000\u0000IG\u0001\u0000"+
		"\u0000\u0000JO\u0005.\u0000\u0000KL\u0005\'\u0000\u0000LN\u0005.\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000NQ\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000OP\u0001\u0000\u0000\u0000P\u0005\u0001\u0000\u0000\u0000"+
		"QO\u0001\u0000\u0000\u0000RS\u0005\u0001\u0000\u0000ST\u0005\u0002\u0000"+
		"\u0000TU\u0005.\u0000\u0000U\u0007\u0001\u0000\u0000\u0000VW\u0005\u0003"+
		"\u0000\u0000WX\u0005\u0002\u0000\u0000XY\u0005.\u0000\u0000Y\t\u0001\u0000"+
		"\u0000\u0000Za\u0005\u000f\u0000\u0000[\\\u0005\u0010\u0000\u0000\\]\u0005"+
		"(\u0000\u0000]^\u0005/\u0000\u0000^a\u0005)\u0000\u0000_a\u0005\u0011"+
		"\u0000\u0000`Z\u0001\u0000\u0000\u0000`[\u0001\u0000\u0000\u0000`_\u0001"+
		"\u0000\u0000\u0000a\u000b\u0001\u0000\u0000\u0000bc\u0005\f\u0000\u0000"+
		"ce\u0005\r\u0000\u0000db\u0001\u0000\u0000\u0000de\u0001\u0000\u0000\u0000"+
		"ei\u0001\u0000\u0000\u0000fg\u0005#\u0000\u0000gj\u0005$\u0000\u0000h"+
		"j\u0005$\u0000\u0000if\u0001\u0000\u0000\u0000ih\u0001\u0000\u0000\u0000"+
		"ij\u0001\u0000\u0000\u0000j\r\u0001\u0000\u0000\u0000kl\u0005.\u0000\u0000"+
		"lm\u0003\n\u0005\u0000mn\u0003\f\u0006\u0000n\u000f\u0001\u0000\u0000"+
		"\u0000op\u0005\u000b\u0000\u0000pq\u0005\r\u0000\u0000qr\u0005(\u0000"+
		"\u0000rs\u0005.\u0000\u0000st\u0005)\u0000\u0000tu\u0005\u000e\u0000\u0000"+
		"uv\u0005.\u0000\u0000vw\u0005(\u0000\u0000wx\u0005.\u0000\u0000xy\u0005"+
		")\u0000\u0000y\u0011\u0001\u0000\u0000\u0000z}\u0003\u000e\u0007\u0000"+
		"{}\u0003\u0010\b\u0000|z\u0001\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000"+
		"}\u0013\u0001\u0000\u0000\u0000~\u0083\u0003\u0012\t\u0000\u007f\u0080"+
		"\u0005\'\u0000\u0000\u0080\u0082\u0003\u0012\t\u0000\u0081\u007f\u0001"+
		"\u0000\u0000\u0000\u0082\u0085\u0001\u0000\u0000\u0000\u0083\u0081\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0015\u0001"+
		"\u0000\u0000\u0000\u0085\u0083\u0001\u0000\u0000\u0000\u0086\u0087\u0005"+
		"\u0001\u0000\u0000\u0087\u0088\u0005\u0004\u0000\u0000\u0088\u0089\u0005"+
		".\u0000\u0000\u0089\u008a\u0005(\u0000\u0000\u008a\u008b\u0003\u0014\n"+
		"\u0000\u008b\u008c\u0005)\u0000\u0000\u008c\u008d\u0005*\u0000\u0000\u008d"+
		"\u0017\u0001\u0000\u0000\u0000\u008e\u008f\u0005\u0005\u0000\u0000\u008f"+
		"\u0090\u0005\u0004\u0000\u0000\u0090\u0091\u0005.\u0000\u0000\u0091\u0092"+
		"\u0005\u0006\u0000\u0000\u0092\u0093\u0005\u0007\u0000\u0000\u0093\u0094"+
		"\u0003\u000e\u0007\u0000\u0094\u0095\u0005*\u0000\u0000\u0095\u0019\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0005\u0005\u0000\u0000\u0097\u0098\u0005"+
		"\u0004\u0000\u0000\u0098\u0099\u0005.\u0000\u0000\u0099\u009a\u0005\t"+
		"\u0000\u0000\u009a\u009b\u0005\u0007\u0000\u0000\u009b\u009c\u0005.\u0000"+
		"\u0000\u009c\u009d\u0005*\u0000\u0000\u009d\u001b\u0001\u0000\u0000\u0000"+
		"\u009e\u009f\u0005\u0005\u0000\u0000\u009f\u00a0\u0005\u0004\u0000\u0000"+
		"\u00a0\u00a1\u0005.\u0000\u0000\u00a1\u00a2\u0005\u0006\u0000\u0000\u00a2"+
		"\u00a3\u0005\n\u0000\u0000\u00a3\u00a4\u0005.\u0000\u0000\u00a4\u00a5"+
		"\u0003\u0010\b\u0000\u00a5\u00a6\u0005*\u0000\u0000\u00a6\u001d\u0001"+
		"\u0000\u0000\u0000\u00a7\u00a8\u0005\u0005\u0000\u0000\u00a8\u00a9\u0005"+
		"\u0004\u0000\u0000\u00a9\u00aa\u0005.\u0000\u0000\u00aa\u00ab\u0005\t"+
		"\u0000\u0000\u00ab\u00ac\u0005\n\u0000\u0000\u00ac\u00ad\u0005.\u0000"+
		"\u0000\u00ad\u00ae\u0005*\u0000\u0000\u00ae\u001f\u0001\u0000\u0000\u0000"+
		"\u00af\u00b0\u0005\t\u0000\u0000\u00b0\u00b1\u0005\u0004\u0000\u0000\u00b1"+
		"\u00b2\u0005.\u0000\u0000\u00b2\u00b3\u0005*\u0000\u0000\u00b3!\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0005\u0012\u0000\u0000\u00b5\u00b6\u0005"+
		"\u0013\u0000\u0000\u00b6\u00b7\u0005.\u0000\u0000\u00b7\u00b8\u0005(\u0000"+
		"\u0000\u00b8\u00b9\u0003\u0004\u0002\u0000\u00b9\u00ba\u0005)\u0000\u0000"+
		"\u00ba\u00bb\u0005\u0014\u0000\u0000\u00bb\u00bc\u0005(\u0000\u0000\u00bc"+
		"\u00bd\u0003\u0002\u0001\u0000\u00bd\u00be\u0005)\u0000\u0000\u00be#\u0001"+
		"\u0000\u0000\u0000\u00bf\u00c0\u0005.\u0000\u0000\u00c0\u00c1\u0005%\u0000"+
		"\u0000\u00c1\u00c8\u0003\u0000\u0000\u0000\u00c2\u00c3\u0005\'\u0000\u0000"+
		"\u00c3\u00c4\u0005.\u0000\u0000\u00c4\u00c5\u0005%\u0000\u0000\u00c5\u00c7"+
		"\u0003\u0000\u0000\u0000\u00c6\u00c2\u0001\u0000\u0000\u0000\u00c7\u00ca"+
		"\u0001\u0000\u0000\u0000\u00c8\u00c6\u0001\u0000\u0000\u0000\u00c8\u00c9"+
		"\u0001\u0000\u0000\u0000\u00c9%\u0001\u0000\u0000\u0000\u00ca\u00c8\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u0005\u0015\u0000\u0000\u00cc\u00cd\u0005"+
		".\u0000\u0000\u00cd\u00ce\u0005\u0016\u0000\u0000\u00ce\u00cf\u0003$\u0012"+
		"\u0000\u00cf\u00d0\u0005\u0017\u0000\u0000\u00d0\u00d1\u0005.\u0000\u0000"+
		"\u00d1\u00d2\u0005%\u0000\u0000\u00d2\u00d3\u0003\u0000\u0000\u0000\u00d3"+
		"\'\u0001\u0000\u0000\u0000\u00d4\u00d5\u0005\u0018\u0000\u0000\u00d5\u00d6"+
		"\u0005\u0019\u0000\u0000\u00d6\u00d7\u0005.\u0000\u0000\u00d7\u00d8\u0005"+
		"\u0017\u0000\u0000\u00d8\u00d9\u0005.\u0000\u0000\u00d9\u00da\u0005%\u0000"+
		"\u0000\u00da\u00db\u0003\u0000\u0000\u0000\u00db)\u0001\u0000\u0000\u0000"+
		"\u00dc\u00dd\u0005.\u0000\u0000\u00dd\u00df\u0005&\u0000\u0000\u00de\u00dc"+
		"\u0001\u0000\u0000\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e0"+
		"\u0001\u0000\u0000\u0000\u00e0\u00e1\u0005.\u0000\u0000\u00e1+\u0001\u0000"+
		"\u0000\u0000\u00e2\u00e7\u0003*\u0015\u0000\u00e3\u00e4\u0005\'\u0000"+
		"\u0000\u00e4\u00e6\u0003*\u0015\u0000\u00e5\u00e3\u0001\u0000\u0000\u0000"+
		"\u00e6\u00e9\u0001\u0000\u0000\u0000\u00e7\u00e5\u0001\u0000\u0000\u0000"+
		"\u00e7\u00e8\u0001\u0000\u0000\u0000\u00e8-\u0001\u0000\u0000\u0000\u00e9"+
		"\u00e7\u0001\u0000\u0000\u0000\u00ea\u00eb\u0007\u0001\u0000\u0000\u00eb"+
		"/\u0001\u0000\u0000\u0000\u00ec\u00ed\u0003.\u0017\u0000\u00ed\u00ee\u0005"+
		".\u0000\u0000\u00ee\u00ef\u0005\u001d\u0000\u0000\u00ef\u00f0\u0003*\u0015"+
		"\u0000\u00f0\u00f1\u0005%\u0000\u0000\u00f1\u00f2\u0003*\u0015\u0000\u00f2"+
		"1\u0001\u0000\u0000\u0000\u00f3\u00f5\u00030\u0018\u0000\u00f4\u00f3\u0001"+
		"\u0000\u0000\u0000\u00f5\u00f8\u0001\u0000\u0000\u0000\u00f6\u00f4\u0001"+
		"\u0000\u0000\u0000\u00f6\u00f7\u0001\u0000\u0000\u0000\u00f73\u0001\u0000"+
		"\u0000\u0000\u00f8\u00f6\u0001\u0000\u0000\u0000\u00f9\u00fa\u0005\u001a"+
		"\u0000\u0000\u00fa\u00fb\u0003,\u0016\u0000\u00fb\u00fc\u0005\u0019\u0000"+
		"\u0000\u00fc\u00fe\u0005.\u0000\u0000\u00fd\u00ff\u00032\u0019\u0000\u00fe"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fe\u00ff\u0001\u0000\u0000\u0000\u00ff"+
		"\u0105\u0001\u0000\u0000\u0000\u0100\u0101\u0005\u0017\u0000\u0000\u0101"+
		"\u0102\u0003*\u0015\u0000\u0102\u0103\u0005%\u0000\u0000\u0103\u0104\u0003"+
		"\u0000\u0000\u0000\u0104\u0106\u0001\u0000\u0000\u0000\u0105\u0100\u0001"+
		"\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000\u01065\u0001\u0000"+
		"\u0000\u0000\u0107\u0108\u0007\u0002\u0000\u0000\u01087\u0001\u0000\u0000"+
		"\u0000\u0109\u010a\u0007\u0003\u0000\u0000\u010a9\u0001\u0000\u0000\u0000"+
		"\u010b\u010c\u0005\u0001\u0000\u0000\u010c\u010d\u0005\u001e\u0000\u0000"+
		"\u010d\u010e\u0005.\u0000\u0000\u010e\u010f\u0005*\u0000\u0000\u010f;"+
		"\u0001\u0000\u0000\u0000\u0110\u0111\u0005\u001f\u0000\u0000\u0111\u0112"+
		"\u00036\u001b\u0000\u0112\u0113\u0005\u001d\u0000\u0000\u0113\u0114\u0005"+
		".\u0000\u0000\u0114\u0115\u0005&\u0000\u0000\u0115\u0116\u00038\u001c"+
		"\u0000\u0116\u0117\u0005 \u0000\u0000\u0117\u0118\u0005.\u0000\u0000\u0118"+
		"\u0119\u0005*\u0000\u0000\u0119=\u0001\u0000\u0000\u0000\u011a\u011b\u0005"+
		"!\u0000\u0000\u011b\u011c\u00036\u001b\u0000\u011c\u011d\u0005\u001d\u0000"+
		"\u0000\u011d\u011e\u0005.\u0000\u0000\u011e\u011f\u0005\u0019\u0000\u0000"+
		"\u011f\u0120\u0005.\u0000\u0000\u0120\u0121\u0005*\u0000\u0000\u0121?"+
		"\u0001\u0000\u0000\u0000\rGO`di|\u0083\u00c8\u00de\u00e7\u00f6\u00fe\u0105";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}