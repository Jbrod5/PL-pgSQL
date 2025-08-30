// Generated from /home/jorge/Compi_2/PL-pgSQL/PL-pgSQL/src/gramaticas/SQL.g4 by ANTLR 4.13.2
package org.jbrod.grammars;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class SQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		CREATE=1, SCHEMA=2, USE=3, TABLE=4, ALTER=5, ADD=6, COLUMN=7, DROP=8, 
		CONSTRAINT=9, FOREIGN=10, PRIMARY=11, KEY=12, REFERENCES=13, INTEGER=14, 
		VARCHAR=15, BOOLEAN=16, INSERT=17, INTO=18, VALUES=19, UPDATE=20, SET=21, 
		WHERE=22, DELETE=23, FROM=24, SELECT=25, JOIN=26, LEFT_JOIN=27, ON=28, 
		USER=29, GRANT=30, TO=31, REVOKE=32, NOT=33, NULL=34, EQUALS=35, DOT=36, 
		COMMA=37, LPAREN=38, RPAREN=39, SEMICOLON=40, ALL_SYM=41, TRUE=42, FALSE=43, 
		STRING=44, IDENTIFICADOR=45, NUMERO=46, WS=47, COMENTARIO=48;
	public static final int
		RULE_sql_script = 0, RULE_valor_op = 1, RULE_valores = 2, RULE_opciones = 3, 
		RULE_ddl_sentence = 4, RULE_create_schema = 5, RULE_use_schema = 6, RULE_tipo_dato = 7, 
		RULE_restriccion_columna = 8, RULE_columna = 9, RULE_llave_foranea = 10, 
		RULE_elemento_tabla = 11, RULE_lista_elementos = 12, RULE_create_table = 13, 
		RULE_alter_add_column = 14, RULE_alter_drop_column = 15, RULE_alter_add_constraint = 16, 
		RULE_alter_drop_constraint = 17, RULE_drop_table = 18, RULE_dml_sentence = 19, 
		RULE_insert_into = 20, RULE_asignaciones = 21, RULE_update_sentence = 22, 
		RULE_delete_sentence = 23, RULE_columna_prefijo = 24, RULE_columnas = 25, 
		RULE_join_type = 26, RULE_join_clause = 27, RULE_join_list = 28, RULE_select_sentence = 29, 
		RULE_dcl_sentence = 30, RULE_permiso = 31, RULE_tabla_op = 32, RULE_create_user = 33, 
		RULE_grant_perm = 34, RULE_revoke_perm = 35;
	private static String[] makeRuleNames() {
		return new String[] {
			"sql_script", "valor_op", "valores", "opciones", "ddl_sentence", "create_schema", 
			"use_schema", "tipo_dato", "restriccion_columna", "columna", "llave_foranea", 
			"elemento_tabla", "lista_elementos", "create_table", "alter_add_column", 
			"alter_drop_column", "alter_add_constraint", "alter_drop_constraint", 
			"drop_table", "dml_sentence", "insert_into", "asignaciones", "update_sentence", 
			"delete_sentence", "columna_prefijo", "columnas", "join_type", "join_clause", 
			"join_list", "select_sentence", "dcl_sentence", "permiso", "tabla_op", 
			"create_user", "grant_perm", "revoke_perm"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'CREATE'", "'SCHEMA'", "'USE'", "'TABLE'", "'ALTER'", "'ADD'", 
			"'COLUMN'", "'DROP'", "'CONSTRAINT'", "'FOREIGN'", "'PRIMARY'", "'KEY'", 
			"'REFERENCES'", "'INTEGER'", "'VARCHAR'", "'BOOLEAN'", "'INSERT'", "'INTO'", 
			"'VALUES'", "'UPDATE'", "'SET'", "'WHERE'", "'DELETE'", "'FROM'", "'SELECT'", 
			"'JOIN'", "'LEFT JOIN'", "'ON'", "'USER'", "'GRANT'", "'TO'", "'REVOKE'", 
			"'NOT'", "'NULL'", "'='", "'.'", "','", "'('", "')'", "';'", "'*'", "'true'", 
			"'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "CREATE", "SCHEMA", "USE", "TABLE", "ALTER", "ADD", "COLUMN", "DROP", 
			"CONSTRAINT", "FOREIGN", "PRIMARY", "KEY", "REFERENCES", "INTEGER", "VARCHAR", 
			"BOOLEAN", "INSERT", "INTO", "VALUES", "UPDATE", "SET", "WHERE", "DELETE", 
			"FROM", "SELECT", "JOIN", "LEFT_JOIN", "ON", "USER", "GRANT", "TO", "REVOKE", 
			"NOT", "NULL", "EQUALS", "DOT", "COMMA", "LPAREN", "RPAREN", "SEMICOLON", 
			"ALL_SYM", "TRUE", "FALSE", "STRING", "IDENTIFICADOR", "NUMERO", "WS", 
			"COMENTARIO"
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
	public static class Sql_scriptContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(SQLParser.EOF, 0); }
		public List<Dcl_sentenceContext> dcl_sentence() {
			return getRuleContexts(Dcl_sentenceContext.class);
		}
		public Dcl_sentenceContext dcl_sentence(int i) {
			return getRuleContext(Dcl_sentenceContext.class,i);
		}
		public List<Dml_sentenceContext> dml_sentence() {
			return getRuleContexts(Dml_sentenceContext.class);
		}
		public Dml_sentenceContext dml_sentence(int i) {
			return getRuleContext(Dml_sentenceContext.class,i);
		}
		public List<Ddl_sentenceContext> ddl_sentence() {
			return getRuleContexts(Ddl_sentenceContext.class);
		}
		public Ddl_sentenceContext ddl_sentence(int i) {
			return getRuleContext(Ddl_sentenceContext.class,i);
		}
		public Sql_scriptContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql_script; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterSql_script(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitSql_script(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitSql_script(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sql_scriptContext sql_script() throws RecognitionException {
		Sql_scriptContext _localctx = new Sql_scriptContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sql_script);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(77);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 5411832106L) != 0)) {
				{
				setState(75);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(72);
					dcl_sentence();
					}
					break;
				case 2:
					{
					setState(73);
					dml_sentence();
					}
					break;
				case 3:
					{
					setState(74);
					ddl_sentence();
					}
					break;
				}
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(80);
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
		enterRule(_localctx, 2, RULE_valor_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(82);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 101155069755392L) != 0)) ) {
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
		enterRule(_localctx, 4, RULE_valores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(84);
			valor_op();
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(85);
				match(COMMA);
				setState(86);
				valor_op();
				}
				}
				setState(91);
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
		enterRule(_localctx, 6, RULE_opciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			match(IDENTIFICADOR);
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(93);
				match(COMMA);
				setState(94);
				match(IDENTIFICADOR);
				}
				}
				setState(99);
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
	public static class Ddl_sentenceContext extends ParserRuleContext {
		public Create_schemaContext create_schema() {
			return getRuleContext(Create_schemaContext.class,0);
		}
		public Use_schemaContext use_schema() {
			return getRuleContext(Use_schemaContext.class,0);
		}
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Alter_add_columnContext alter_add_column() {
			return getRuleContext(Alter_add_columnContext.class,0);
		}
		public Alter_drop_columnContext alter_drop_column() {
			return getRuleContext(Alter_drop_columnContext.class,0);
		}
		public Drop_tableContext drop_table() {
			return getRuleContext(Drop_tableContext.class,0);
		}
		public Alter_add_constraintContext alter_add_constraint() {
			return getRuleContext(Alter_add_constraintContext.class,0);
		}
		public Alter_drop_constraintContext alter_drop_constraint() {
			return getRuleContext(Alter_drop_constraintContext.class,0);
		}
		public Ddl_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ddl_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDdl_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDdl_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDdl_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ddl_sentenceContext ddl_sentence() throws RecognitionException {
		Ddl_sentenceContext _localctx = new Ddl_sentenceContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_ddl_sentence);
		try {
			setState(108);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(100);
				create_schema();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(101);
				use_schema();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(102);
				create_table();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(103);
				alter_add_column();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(104);
				alter_drop_column();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(105);
				drop_table();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(106);
				alter_add_constraint();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(107);
				alter_drop_constraint();
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
	public static class Create_schemaContext extends ParserRuleContext {
		public Create_schemaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_schema; }
	 
		public Create_schemaContext() { }
		public void copyFrom(Create_schemaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PRUEBAContext extends Create_schemaContext {
		public Token id;
		public TerminalNode CREATE() { return getToken(SQLParser.CREATE, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLParser.SCHEMA, 0); }
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SQLParser.IDENTIFICADOR, 0); }
		public PRUEBAContext(Create_schemaContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterPRUEBA(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitPRUEBA(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitPRUEBA(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_schemaContext create_schema() throws RecognitionException {
		Create_schemaContext _localctx = new Create_schemaContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_create_schema);
		try {
			_localctx = new PRUEBAContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(CREATE);
			setState(111);
			match(SCHEMA);
			setState(112);
			((PRUEBAContext)_localctx).id = match(IDENTIFICADOR);
			setState(113);
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
	public static class Use_schemaContext extends ParserRuleContext {
		public TerminalNode USE() { return getToken(SQLParser.USE, 0); }
		public TerminalNode SCHEMA() { return getToken(SQLParser.SCHEMA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(SQLParser.IDENTIFICADOR, 0); }
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 12, RULE_use_schema);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(USE);
			setState(116);
			match(SCHEMA);
			setState(117);
			match(IDENTIFICADOR);
			setState(118);
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
		enterRule(_localctx, 14, RULE_tipo_dato);
		try {
			setState(126);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				match(INTEGER);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(VARCHAR);
				setState(122);
				match(LPAREN);
				setState(123);
				match(NUMERO);
				setState(124);
				match(RPAREN);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 3);
				{
				setState(125);
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
		enterRule(_localctx, 16, RULE_restriccion_columna);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PRIMARY) {
				{
				setState(128);
				match(PRIMARY);
				setState(129);
				match(KEY);
				}
			}

			setState(135);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOT:
				{
				setState(132);
				match(NOT);
				setState(133);
				match(NULL);
				}
				break;
			case NULL:
				{
				setState(134);
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
		enterRule(_localctx, 18, RULE_columna);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(IDENTIFICADOR);
			setState(138);
			tipo_dato();
			setState(139);
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
		enterRule(_localctx, 20, RULE_llave_foranea);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141);
			match(FOREIGN);
			setState(142);
			match(KEY);
			setState(143);
			match(LPAREN);
			setState(144);
			match(IDENTIFICADOR);
			setState(145);
			match(RPAREN);
			setState(146);
			match(REFERENCES);
			setState(147);
			match(IDENTIFICADOR);
			setState(148);
			match(LPAREN);
			setState(149);
			match(IDENTIFICADOR);
			setState(150);
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
		enterRule(_localctx, 22, RULE_elemento_tabla);
		try {
			setState(154);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(152);
				columna();
				}
				break;
			case FOREIGN:
				enterOuterAlt(_localctx, 2);
				{
				setState(153);
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
		enterRule(_localctx, 24, RULE_lista_elementos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			elemento_tabla();
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(157);
				match(COMMA);
				setState(158);
				elemento_tabla();
				}
				}
				setState(163);
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
		enterRule(_localctx, 26, RULE_create_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(CREATE);
			setState(165);
			match(TABLE);
			setState(166);
			match(IDENTIFICADOR);
			setState(167);
			match(LPAREN);
			setState(168);
			lista_elementos();
			setState(169);
			match(RPAREN);
			setState(170);
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
		enterRule(_localctx, 28, RULE_alter_add_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ALTER);
			setState(173);
			match(TABLE);
			setState(174);
			match(IDENTIFICADOR);
			setState(175);
			match(ADD);
			setState(176);
			match(COLUMN);
			setState(177);
			columna();
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
		enterRule(_localctx, 30, RULE_alter_drop_column);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(180);
			match(ALTER);
			setState(181);
			match(TABLE);
			setState(182);
			match(IDENTIFICADOR);
			setState(183);
			match(DROP);
			setState(184);
			match(COLUMN);
			setState(185);
			match(IDENTIFICADOR);
			setState(186);
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
		enterRule(_localctx, 32, RULE_alter_add_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(188);
			match(ALTER);
			setState(189);
			match(TABLE);
			setState(190);
			match(IDENTIFICADOR);
			setState(191);
			match(ADD);
			setState(192);
			match(CONSTRAINT);
			setState(193);
			match(IDENTIFICADOR);
			setState(194);
			llave_foranea();
			setState(195);
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
		enterRule(_localctx, 34, RULE_alter_drop_constraint);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(ALTER);
			setState(198);
			match(TABLE);
			setState(199);
			match(IDENTIFICADOR);
			setState(200);
			match(DROP);
			setState(201);
			match(CONSTRAINT);
			setState(202);
			match(IDENTIFICADOR);
			setState(203);
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
		enterRule(_localctx, 36, RULE_drop_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(205);
			match(DROP);
			setState(206);
			match(TABLE);
			setState(207);
			match(IDENTIFICADOR);
			setState(208);
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
	public static class Dml_sentenceContext extends ParserRuleContext {
		public Insert_intoContext insert_into() {
			return getRuleContext(Insert_intoContext.class,0);
		}
		public Update_sentenceContext update_sentence() {
			return getRuleContext(Update_sentenceContext.class,0);
		}
		public Delete_sentenceContext delete_sentence() {
			return getRuleContext(Delete_sentenceContext.class,0);
		}
		public Select_sentenceContext select_sentence() {
			return getRuleContext(Select_sentenceContext.class,0);
		}
		public Dml_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dml_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDml_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDml_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDml_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dml_sentenceContext dml_sentence() throws RecognitionException {
		Dml_sentenceContext _localctx = new Dml_sentenceContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_dml_sentence);
		try {
			setState(214);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				insert_into();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
				update_sentence();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(212);
				delete_sentence();
				}
				break;
			case SELECT:
				enterOuterAlt(_localctx, 4);
				{
				setState(213);
				select_sentence();
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
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 40, RULE_insert_into);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			match(INSERT);
			setState(217);
			match(INTO);
			setState(218);
			match(IDENTIFICADOR);
			setState(219);
			match(LPAREN);
			setState(220);
			opciones();
			setState(221);
			match(RPAREN);
			setState(222);
			match(VALUES);
			setState(223);
			match(LPAREN);
			setState(224);
			valores();
			setState(225);
			match(RPAREN);
			setState(226);
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
		enterRule(_localctx, 42, RULE_asignaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(228);
			match(IDENTIFICADOR);
			setState(229);
			match(EQUALS);
			setState(230);
			valor_op();
			setState(237);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(231);
				match(COMMA);
				setState(232);
				match(IDENTIFICADOR);
				setState(233);
				match(EQUALS);
				setState(234);
				valor_op();
				}
				}
				setState(239);
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
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 44, RULE_update_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			match(UPDATE);
			setState(241);
			match(IDENTIFICADOR);
			setState(242);
			match(SET);
			setState(243);
			asignaciones();
			setState(244);
			match(WHERE);
			setState(245);
			match(IDENTIFICADOR);
			setState(246);
			match(EQUALS);
			setState(247);
			valor_op();
			setState(248);
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
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 46, RULE_delete_sentence);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(250);
			match(DELETE);
			setState(251);
			match(FROM);
			setState(252);
			match(IDENTIFICADOR);
			setState(253);
			match(WHERE);
			setState(254);
			match(IDENTIFICADOR);
			setState(255);
			match(EQUALS);
			setState(256);
			valor_op();
			setState(257);
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
		enterRule(_localctx, 48, RULE_columna_prefijo);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(259);
				match(IDENTIFICADOR);
				setState(260);
				match(DOT);
				}
				break;
			}
			setState(263);
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
		enterRule(_localctx, 50, RULE_columnas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			columna_prefijo();
			setState(270);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(266);
				match(COMMA);
				setState(267);
				columna_prefijo();
				}
				}
				setState(272);
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
		enterRule(_localctx, 52, RULE_join_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
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
		enterRule(_localctx, 54, RULE_join_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			join_type();
			setState(276);
			match(IDENTIFICADOR);
			setState(277);
			match(ON);
			setState(278);
			columna_prefijo();
			setState(279);
			match(EQUALS);
			setState(280);
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
		enterRule(_localctx, 56, RULE_join_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==JOIN || _la==LEFT_JOIN) {
				{
				{
				setState(282);
				join_clause();
				}
				}
				setState(287);
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
		public TerminalNode SEMICOLON() { return getToken(SQLParser.SEMICOLON, 0); }
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
		enterRule(_localctx, 58, RULE_select_sentence);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(SELECT);
			setState(289);
			columnas();
			setState(290);
			match(FROM);
			setState(291);
			match(IDENTIFICADOR);
			setState(293);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				{
				setState(292);
				join_list();
				}
				break;
			}
			setState(300);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(295);
				match(WHERE);
				setState(296);
				columna_prefijo();
				setState(297);
				match(EQUALS);
				setState(298);
				valor_op();
				}
			}

			setState(302);
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
	public static class Dcl_sentenceContext extends ParserRuleContext {
		public Create_userContext create_user() {
			return getRuleContext(Create_userContext.class,0);
		}
		public Grant_permContext grant_perm() {
			return getRuleContext(Grant_permContext.class,0);
		}
		public Revoke_permContext revoke_perm() {
			return getRuleContext(Revoke_permContext.class,0);
		}
		public Dcl_sentenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dcl_sentence; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).enterDcl_sentence(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SQLListener ) ((SQLListener)listener).exitDcl_sentence(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SQLVisitor ) return ((SQLVisitor<? extends T>)visitor).visitDcl_sentence(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Dcl_sentenceContext dcl_sentence() throws RecognitionException {
		Dcl_sentenceContext _localctx = new Dcl_sentenceContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_dcl_sentence);
		try {
			setState(307);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CREATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(304);
				create_user();
				}
				break;
			case GRANT:
				enterOuterAlt(_localctx, 2);
				{
				setState(305);
				grant_perm();
				}
				break;
			case REVOKE:
				enterOuterAlt(_localctx, 3);
				{
				setState(306);
				revoke_perm();
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
		enterRule(_localctx, 62, RULE_permiso);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(309);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 43122688L) != 0)) ) {
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
		enterRule(_localctx, 64, RULE_tabla_op);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(311);
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
		enterRule(_localctx, 66, RULE_create_user);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(313);
			match(CREATE);
			setState(314);
			match(USER);
			setState(315);
			match(IDENTIFICADOR);
			setState(316);
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
		enterRule(_localctx, 68, RULE_grant_perm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(318);
			match(GRANT);
			setState(319);
			permiso();
			setState(320);
			match(ON);
			setState(321);
			match(IDENTIFICADOR);
			setState(322);
			match(DOT);
			setState(323);
			tabla_op();
			setState(324);
			match(TO);
			setState(325);
			match(IDENTIFICADOR);
			setState(326);
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
		enterRule(_localctx, 70, RULE_revoke_perm);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(328);
			match(REVOKE);
			setState(329);
			permiso();
			setState(330);
			match(ON);
			setState(331);
			match(IDENTIFICADOR);
			setState(332);
			match(FROM);
			setState(333);
			match(IDENTIFICADOR);
			setState(334);
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
		"\u0004\u00010\u0151\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007\u001b"+
		"\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007\u001e"+
		"\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007\"\u0002"+
		"#\u0007#\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000L\b\u0000\n\u0000"+
		"\f\u0000O\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0005\u0002X\b\u0002\n\u0002\f\u0002[\t"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003`\b\u0003\n\u0003"+
		"\f\u0003c\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004m\b\u0004\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007\u007f\b\u0007\u0001"+
		"\b\u0001\b\u0003\b\u0083\b\b\u0001\b\u0001\b\u0001\b\u0003\b\u0088\b\b"+
		"\u0001\t\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b"+
		"\u0003\u000b\u009b\b\u000b\u0001\f\u0001\f\u0001\f\u0005\f\u00a0\b\f\n"+
		"\f\f\f\u00a3\t\f\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0003\u0013\u00d7\b\u0013\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u00ec\b\u0015"+
		"\n\u0015\f\u0015\u00ef\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0003"+
		"\u0018\u0106\b\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0005\u0019\u010d\b\u0019\n\u0019\f\u0019\u0110\t\u0019\u0001\u001a"+
		"\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001c\u0005\u001c\u011c\b\u001c\n\u001c"+
		"\f\u001c\u011f\t\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0003\u001d\u0126\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0003\u001d\u012d\b\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0134\b\u001e\u0001\u001f"+
		"\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0001!\u0001!\u0001\""+
		"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0000"+
		"\u0000$\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02468:<>@BDF\u0000\u0004\u0002\u0000*,..\u0001"+
		"\u0000\u001a\u001b\u0004\u0000\u0011\u0011\u0014\u0014\u0017\u0017\u0019"+
		"\u0019\u0002\u0000))--\u014a\u0000M\u0001\u0000\u0000\u0000\u0002R\u0001"+
		"\u0000\u0000\u0000\u0004T\u0001\u0000\u0000\u0000\u0006\\\u0001\u0000"+
		"\u0000\u0000\bl\u0001\u0000\u0000\u0000\nn\u0001\u0000\u0000\u0000\fs"+
		"\u0001\u0000\u0000\u0000\u000e~\u0001\u0000\u0000\u0000\u0010\u0082\u0001"+
		"\u0000\u0000\u0000\u0012\u0089\u0001\u0000\u0000\u0000\u0014\u008d\u0001"+
		"\u0000\u0000\u0000\u0016\u009a\u0001\u0000\u0000\u0000\u0018\u009c\u0001"+
		"\u0000\u0000\u0000\u001a\u00a4\u0001\u0000\u0000\u0000\u001c\u00ac\u0001"+
		"\u0000\u0000\u0000\u001e\u00b4\u0001\u0000\u0000\u0000 \u00bc\u0001\u0000"+
		"\u0000\u0000\"\u00c5\u0001\u0000\u0000\u0000$\u00cd\u0001\u0000\u0000"+
		"\u0000&\u00d6\u0001\u0000\u0000\u0000(\u00d8\u0001\u0000\u0000\u0000*"+
		"\u00e4\u0001\u0000\u0000\u0000,\u00f0\u0001\u0000\u0000\u0000.\u00fa\u0001"+
		"\u0000\u0000\u00000\u0105\u0001\u0000\u0000\u00002\u0109\u0001\u0000\u0000"+
		"\u00004\u0111\u0001\u0000\u0000\u00006\u0113\u0001\u0000\u0000\u00008"+
		"\u011d\u0001\u0000\u0000\u0000:\u0120\u0001\u0000\u0000\u0000<\u0133\u0001"+
		"\u0000\u0000\u0000>\u0135\u0001\u0000\u0000\u0000@\u0137\u0001\u0000\u0000"+
		"\u0000B\u0139\u0001\u0000\u0000\u0000D\u013e\u0001\u0000\u0000\u0000F"+
		"\u0148\u0001\u0000\u0000\u0000HL\u0003<\u001e\u0000IL\u0003&\u0013\u0000"+
		"JL\u0003\b\u0004\u0000KH\u0001\u0000\u0000\u0000KI\u0001\u0000\u0000\u0000"+
		"KJ\u0001\u0000\u0000\u0000LO\u0001\u0000\u0000\u0000MK\u0001\u0000\u0000"+
		"\u0000MN\u0001\u0000\u0000\u0000NP\u0001\u0000\u0000\u0000OM\u0001\u0000"+
		"\u0000\u0000PQ\u0005\u0000\u0000\u0001Q\u0001\u0001\u0000\u0000\u0000"+
		"RS\u0007\u0000\u0000\u0000S\u0003\u0001\u0000\u0000\u0000TY\u0003\u0002"+
		"\u0001\u0000UV\u0005%\u0000\u0000VX\u0003\u0002\u0001\u0000WU\u0001\u0000"+
		"\u0000\u0000X[\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000YZ\u0001"+
		"\u0000\u0000\u0000Z\u0005\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000"+
		"\u0000\\a\u0005-\u0000\u0000]^\u0005%\u0000\u0000^`\u0005-\u0000\u0000"+
		"_]\u0001\u0000\u0000\u0000`c\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000"+
		"\u0000ab\u0001\u0000\u0000\u0000b\u0007\u0001\u0000\u0000\u0000ca\u0001"+
		"\u0000\u0000\u0000dm\u0003\n\u0005\u0000em\u0003\f\u0006\u0000fm\u0003"+
		"\u001a\r\u0000gm\u0003\u001c\u000e\u0000hm\u0003\u001e\u000f\u0000im\u0003"+
		"$\u0012\u0000jm\u0003 \u0010\u0000km\u0003\"\u0011\u0000ld\u0001\u0000"+
		"\u0000\u0000le\u0001\u0000\u0000\u0000lf\u0001\u0000\u0000\u0000lg\u0001"+
		"\u0000\u0000\u0000lh\u0001\u0000\u0000\u0000li\u0001\u0000\u0000\u0000"+
		"lj\u0001\u0000\u0000\u0000lk\u0001\u0000\u0000\u0000m\t\u0001\u0000\u0000"+
		"\u0000no\u0005\u0001\u0000\u0000op\u0005\u0002\u0000\u0000pq\u0005-\u0000"+
		"\u0000qr\u0005(\u0000\u0000r\u000b\u0001\u0000\u0000\u0000st\u0005\u0003"+
		"\u0000\u0000tu\u0005\u0002\u0000\u0000uv\u0005-\u0000\u0000vw\u0005(\u0000"+
		"\u0000w\r\u0001\u0000\u0000\u0000x\u007f\u0005\u000e\u0000\u0000yz\u0005"+
		"\u000f\u0000\u0000z{\u0005&\u0000\u0000{|\u0005.\u0000\u0000|\u007f\u0005"+
		"\'\u0000\u0000}\u007f\u0005\u0010\u0000\u0000~x\u0001\u0000\u0000\u0000"+
		"~y\u0001\u0000\u0000\u0000~}\u0001\u0000\u0000\u0000\u007f\u000f\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0005\u000b\u0000\u0000\u0081\u0083\u0005"+
		"\f\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001\u0000"+
		"\u0000\u0000\u0083\u0087\u0001\u0000\u0000\u0000\u0084\u0085\u0005!\u0000"+
		"\u0000\u0085\u0088\u0005\"\u0000\u0000\u0086\u0088\u0005\"\u0000\u0000"+
		"\u0087\u0084\u0001\u0000\u0000\u0000\u0087\u0086\u0001\u0000\u0000\u0000"+
		"\u0087\u0088\u0001\u0000\u0000\u0000\u0088\u0011\u0001\u0000\u0000\u0000"+
		"\u0089\u008a\u0005-\u0000\u0000\u008a\u008b\u0003\u000e\u0007\u0000\u008b"+
		"\u008c\u0003\u0010\b\u0000\u008c\u0013\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0005\n\u0000\u0000\u008e\u008f\u0005\f\u0000\u0000\u008f\u0090\u0005"+
		"&\u0000\u0000\u0090\u0091\u0005-\u0000\u0000\u0091\u0092\u0005\'\u0000"+
		"\u0000\u0092\u0093\u0005\r\u0000\u0000\u0093\u0094\u0005-\u0000\u0000"+
		"\u0094\u0095\u0005&\u0000\u0000\u0095\u0096\u0005-\u0000\u0000\u0096\u0097"+
		"\u0005\'\u0000\u0000\u0097\u0015\u0001\u0000\u0000\u0000\u0098\u009b\u0003"+
		"\u0012\t\u0000\u0099\u009b\u0003\u0014\n\u0000\u009a\u0098\u0001\u0000"+
		"\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u0017\u0001\u0000"+
		"\u0000\u0000\u009c\u00a1\u0003\u0016\u000b\u0000\u009d\u009e\u0005%\u0000"+
		"\u0000\u009e\u00a0\u0003\u0016\u000b\u0000\u009f\u009d\u0001\u0000\u0000"+
		"\u0000\u00a0\u00a3\u0001\u0000\u0000\u0000\u00a1\u009f\u0001\u0000\u0000"+
		"\u0000\u00a1\u00a2\u0001\u0000\u0000\u0000\u00a2\u0019\u0001\u0000\u0000"+
		"\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a4\u00a5\u0005\u0001\u0000"+
		"\u0000\u00a5\u00a6\u0005\u0004\u0000\u0000\u00a6\u00a7\u0005-\u0000\u0000"+
		"\u00a7\u00a8\u0005&\u0000\u0000\u00a8\u00a9\u0003\u0018\f\u0000\u00a9"+
		"\u00aa\u0005\'\u0000\u0000\u00aa\u00ab\u0005(\u0000\u0000\u00ab\u001b"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0005\u0005\u0000\u0000\u00ad\u00ae"+
		"\u0005\u0004\u0000\u0000\u00ae\u00af\u0005-\u0000\u0000\u00af\u00b0\u0005"+
		"\u0006\u0000\u0000\u00b0\u00b1\u0005\u0007\u0000\u0000\u00b1\u00b2\u0003"+
		"\u0012\t\u0000\u00b2\u00b3\u0005(\u0000\u0000\u00b3\u001d\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b5\u0005\u0005\u0000\u0000\u00b5\u00b6\u0005\u0004"+
		"\u0000\u0000\u00b6\u00b7\u0005-\u0000\u0000\u00b7\u00b8\u0005\b\u0000"+
		"\u0000\u00b8\u00b9\u0005\u0007\u0000\u0000\u00b9\u00ba\u0005-\u0000\u0000"+
		"\u00ba\u00bb\u0005(\u0000\u0000\u00bb\u001f\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0005\u0005\u0000\u0000\u00bd\u00be\u0005\u0004\u0000\u0000\u00be"+
		"\u00bf\u0005-\u0000\u0000\u00bf\u00c0\u0005\u0006\u0000\u0000\u00c0\u00c1"+
		"\u0005\t\u0000\u0000\u00c1\u00c2\u0005-\u0000\u0000\u00c2\u00c3\u0003"+
		"\u0014\n\u0000\u00c3\u00c4\u0005(\u0000\u0000\u00c4!\u0001\u0000\u0000"+
		"\u0000\u00c5\u00c6\u0005\u0005\u0000\u0000\u00c6\u00c7\u0005\u0004\u0000"+
		"\u0000\u00c7\u00c8\u0005-\u0000\u0000\u00c8\u00c9\u0005\b\u0000\u0000"+
		"\u00c9\u00ca\u0005\t\u0000\u0000\u00ca\u00cb\u0005-\u0000\u0000\u00cb"+
		"\u00cc\u0005(\u0000\u0000\u00cc#\u0001\u0000\u0000\u0000\u00cd\u00ce\u0005"+
		"\b\u0000\u0000\u00ce\u00cf\u0005\u0004\u0000\u0000\u00cf\u00d0\u0005-"+
		"\u0000\u0000\u00d0\u00d1\u0005(\u0000\u0000\u00d1%\u0001\u0000\u0000\u0000"+
		"\u00d2\u00d7\u0003(\u0014\u0000\u00d3\u00d7\u0003,\u0016\u0000\u00d4\u00d7"+
		"\u0003.\u0017\u0000\u00d5\u00d7\u0003:\u001d\u0000\u00d6\u00d2\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d3\u0001\u0000\u0000\u0000\u00d6\u00d4\u0001\u0000"+
		"\u0000\u0000\u00d6\u00d5\u0001\u0000\u0000\u0000\u00d7\'\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005\u0011\u0000\u0000\u00d9\u00da\u0005\u0012\u0000"+
		"\u0000\u00da\u00db\u0005-\u0000\u0000\u00db\u00dc\u0005&\u0000\u0000\u00dc"+
		"\u00dd\u0003\u0006\u0003\u0000\u00dd\u00de\u0005\'\u0000\u0000\u00de\u00df"+
		"\u0005\u0013\u0000\u0000\u00df\u00e0\u0005&\u0000\u0000\u00e0\u00e1\u0003"+
		"\u0004\u0002\u0000\u00e1\u00e2\u0005\'\u0000\u0000\u00e2\u00e3\u0005("+
		"\u0000\u0000\u00e3)\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005-\u0000\u0000"+
		"\u00e5\u00e6\u0005#\u0000\u0000\u00e6\u00ed\u0003\u0002\u0001\u0000\u00e7"+
		"\u00e8\u0005%\u0000\u0000\u00e8\u00e9\u0005-\u0000\u0000\u00e9\u00ea\u0005"+
		"#\u0000\u0000\u00ea\u00ec\u0003\u0002\u0001\u0000\u00eb\u00e7\u0001\u0000"+
		"\u0000\u0000\u00ec\u00ef\u0001\u0000\u0000\u0000\u00ed\u00eb\u0001\u0000"+
		"\u0000\u0000\u00ed\u00ee\u0001\u0000\u0000\u0000\u00ee+\u0001\u0000\u0000"+
		"\u0000\u00ef\u00ed\u0001\u0000\u0000\u0000\u00f0\u00f1\u0005\u0014\u0000"+
		"\u0000\u00f1\u00f2\u0005-\u0000\u0000\u00f2\u00f3\u0005\u0015\u0000\u0000"+
		"\u00f3\u00f4\u0003*\u0015\u0000\u00f4\u00f5\u0005\u0016\u0000\u0000\u00f5"+
		"\u00f6\u0005-\u0000\u0000\u00f6\u00f7\u0005#\u0000\u0000\u00f7\u00f8\u0003"+
		"\u0002\u0001\u0000\u00f8\u00f9\u0005(\u0000\u0000\u00f9-\u0001\u0000\u0000"+
		"\u0000\u00fa\u00fb\u0005\u0017\u0000\u0000\u00fb\u00fc\u0005\u0018\u0000"+
		"\u0000\u00fc\u00fd\u0005-\u0000\u0000\u00fd\u00fe\u0005\u0016\u0000\u0000"+
		"\u00fe\u00ff\u0005-\u0000\u0000\u00ff\u0100\u0005#\u0000\u0000\u0100\u0101"+
		"\u0003\u0002\u0001\u0000\u0101\u0102\u0005(\u0000\u0000\u0102/\u0001\u0000"+
		"\u0000\u0000\u0103\u0104\u0005-\u0000\u0000\u0104\u0106\u0005$\u0000\u0000"+
		"\u0105\u0103\u0001\u0000\u0000\u0000\u0105\u0106\u0001\u0000\u0000\u0000"+
		"\u0106\u0107\u0001\u0000\u0000\u0000\u0107\u0108\u0005-\u0000\u0000\u0108"+
		"1\u0001\u0000\u0000\u0000\u0109\u010e\u00030\u0018\u0000\u010a\u010b\u0005"+
		"%\u0000\u0000\u010b\u010d\u00030\u0018\u0000\u010c\u010a\u0001\u0000\u0000"+
		"\u0000\u010d\u0110\u0001\u0000\u0000\u0000\u010e\u010c\u0001\u0000\u0000"+
		"\u0000\u010e\u010f\u0001\u0000\u0000\u0000\u010f3\u0001\u0000\u0000\u0000"+
		"\u0110\u010e\u0001\u0000\u0000\u0000\u0111\u0112\u0007\u0001\u0000\u0000"+
		"\u01125\u0001\u0000\u0000\u0000\u0113\u0114\u00034\u001a\u0000\u0114\u0115"+
		"\u0005-\u0000\u0000\u0115\u0116\u0005\u001c\u0000\u0000\u0116\u0117\u0003"+
		"0\u0018\u0000\u0117\u0118\u0005#\u0000\u0000\u0118\u0119\u00030\u0018"+
		"\u0000\u01197\u0001\u0000\u0000\u0000\u011a\u011c\u00036\u001b\u0000\u011b"+
		"\u011a\u0001\u0000\u0000\u0000\u011c\u011f\u0001\u0000\u0000\u0000\u011d"+
		"\u011b\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e"+
		"9\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u0120\u0121"+
		"\u0005\u0019\u0000\u0000\u0121\u0122\u00032\u0019\u0000\u0122\u0123\u0005"+
		"\u0018\u0000\u0000\u0123\u0125\u0005-\u0000\u0000\u0124\u0126\u00038\u001c"+
		"\u0000\u0125\u0124\u0001\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000"+
		"\u0000\u0126\u012c\u0001\u0000\u0000\u0000\u0127\u0128\u0005\u0016\u0000"+
		"\u0000\u0128\u0129\u00030\u0018\u0000\u0129\u012a\u0005#\u0000\u0000\u012a"+
		"\u012b\u0003\u0002\u0001\u0000\u012b\u012d\u0001\u0000\u0000\u0000\u012c"+
		"\u0127\u0001\u0000\u0000\u0000\u012c\u012d\u0001\u0000\u0000\u0000\u012d"+
		"\u012e\u0001\u0000\u0000\u0000\u012e\u012f\u0005(\u0000\u0000\u012f;\u0001"+
		"\u0000\u0000\u0000\u0130\u0134\u0003B!\u0000\u0131\u0134\u0003D\"\u0000"+
		"\u0132\u0134\u0003F#\u0000\u0133\u0130\u0001\u0000\u0000\u0000\u0133\u0131"+
		"\u0001\u0000\u0000\u0000\u0133\u0132\u0001\u0000\u0000\u0000\u0134=\u0001"+
		"\u0000\u0000\u0000\u0135\u0136\u0007\u0002\u0000\u0000\u0136?\u0001\u0000"+
		"\u0000\u0000\u0137\u0138\u0007\u0003\u0000\u0000\u0138A\u0001\u0000\u0000"+
		"\u0000\u0139\u013a\u0005\u0001\u0000\u0000\u013a\u013b\u0005\u001d\u0000"+
		"\u0000\u013b\u013c\u0005-\u0000\u0000\u013c\u013d\u0005(\u0000\u0000\u013d"+
		"C\u0001\u0000\u0000\u0000\u013e\u013f\u0005\u001e\u0000\u0000\u013f\u0140"+
		"\u0003>\u001f\u0000\u0140\u0141\u0005\u001c\u0000\u0000\u0141\u0142\u0005"+
		"-\u0000\u0000\u0142\u0143\u0005$\u0000\u0000\u0143\u0144\u0003@ \u0000"+
		"\u0144\u0145\u0005\u001f\u0000\u0000\u0145\u0146\u0005-\u0000\u0000\u0146"+
		"\u0147\u0005(\u0000\u0000\u0147E\u0001\u0000\u0000\u0000\u0148\u0149\u0005"+
		" \u0000\u0000\u0149\u014a\u0003>\u001f\u0000\u014a\u014b\u0005\u001c\u0000"+
		"\u0000\u014b\u014c\u0005-\u0000\u0000\u014c\u014d\u0005\u0018\u0000\u0000"+
		"\u014d\u014e\u0005-\u0000\u0000\u014e\u014f\u0005(\u0000\u0000\u014fG"+
		"\u0001\u0000\u0000\u0000\u0012KMYal~\u0082\u0087\u009a\u00a1\u00d6\u00ed"+
		"\u0105\u010e\u011d\u0125\u012c\u0133";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}