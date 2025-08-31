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
		PUNTOCOMA=1, ASIGNACION=2, COMA=3, DOT=4, MAS=5, MENOS=6, POR=7, DIVIDIDO=8, 
		ELEVADO=9, MAYOR=10, MENOR=11, MAYOR_IGUAL=12, MENOR_IGUAL=13, IGUAL=14, 
		DIFERENTE=15, RANGE_DOTS=16, COR_OPN=17, COR_CLS=18, LPAR=19, RPAR=20, 
		DOLLAR_DOLLAR=21, ARRAY=22, DECLARE=23, INTEGER=24, DECIMAL=25, CHAR=26, 
		BOOLEAN=27, DATE=28, VARCHAR=29, TRUE=30, FALSE=31, BEGIN=32, END=33, 
		IF=34, THEN=35, ELSE=36, END_IF=37, CASE=38, WHEN=39, END_CASE=40, FOR=41, 
		IN=42, LOOP=43, END_LOOP=44, EXIT=45, CONTINUE=46, RAISE=47, RAISE_NOTICE=48, 
		RAISE_WARNING=49, RAISE_EXCEPTION=50, COMMIT=51, ROLLBACK=52, CREATE_FUNCTION=53, 
		CREATE_PROCEDURE=54, RETURNS=55, AS=56, LANGUAGE=57, PLPGSQL=58, FOREACH=59, 
		RETURN=60, OR_KW=61, AND_KW=62, NOT_KW=63, INSERT=64, INTO=65, VALUES=66, 
		UPDATE=67, SET=68, WHERE=69, DELETE=70, FROM=71, SELECT=72, JOIN=73, LEFT=74, 
		ON=75, NOW_FUNC=76, RANDOM_FUNC=77, CONCAT_FUNC=78, MODIFY_DATE_FUNC=79, 
		CAST_FUNC=80, SUBSTRING_FUNC=81, ARRAY_PUSH_FUNC=82, LEN_FUNC=83, IDENTIFICADOR=84, 
		NUMERO_DECIMAL=85, NUMERO=86, CHAR_LITERAL=87, VARCHAR_LITERAL=88, FECHA=89, 
		WS=90, LINE_COMMENT=91, BLOCK_COMMENT=92;
	public static final int
		RULE_programa = 0, RULE_valor = 1, RULE_valores = 2, RULE_booleano = 3, 
		RULE_func_builtin = 4, RULE_expresion = 5, RULE_declaracion = 6, RULE_declaraciones = 7, 
		RULE_declaracion_normal = 8, RULE_declaracion_array = 9, RULE_tipo = 10, 
		RULE_tipo_base = 11, RULE_tipo_array = 12, RULE_bloque = 13, RULE_sentencia_en_bloque = 14, 
		RULE_if_simple = 15, RULE_if_else = 16, RULE_case_when = 17, RULE_ciclo_for = 18, 
		RULE_ciclo_foreach_array = 19, RULE_ciclo_foreach_select = 20, RULE_exit_stmt = 21, 
		RULE_continue_stmt = 22, RULE_raise_notice = 23, RULE_raise_warning = 24, 
		RULE_raise_exception = 25, RULE_raise_simple = 26, RULE_trans_commit = 27, 
		RULE_trans_rollback = 28, RULE_funcion = 29, RULE_procedimiento = 30, 
		RULE_parametros = 31, RULE_parametro = 32, RULE_insert_stmt = 33, RULE_update_stmt = 34, 
		RULE_delete_stmt = 35, RULE_select_stmt = 36, RULE_columnas = 37, RULE_columna_prefijo = 38, 
		RULE_join_list = 39, RULE_join_clause = 40, RULE_asignaciones = 41, RULE_where_clause = 42, 
		RULE_condicion = 43;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "valor", "valores", "booleano", "func_builtin", "expresion", 
			"declaracion", "declaraciones", "declaracion_normal", "declaracion_array", 
			"tipo", "tipo_base", "tipo_array", "bloque", "sentencia_en_bloque", "if_simple", 
			"if_else", "case_when", "ciclo_for", "ciclo_foreach_array", "ciclo_foreach_select", 
			"exit_stmt", "continue_stmt", "raise_notice", "raise_warning", "raise_exception", 
			"raise_simple", "trans_commit", "trans_rollback", "funcion", "procedimiento", 
			"parametros", "parametro", "insert_stmt", "update_stmt", "delete_stmt", 
			"select_stmt", "columnas", "columna_prefijo", "join_list", "join_clause", 
			"asignaciones", "where_clause", "condicion"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "','", "'.'", "'+'", "'-'", "'*'", "'/'", "'^'", 
			"'>'", "'<'", "'>='", "'<='", "'='", "'<>'", "'..'", "'['", "']'", "'('", 
			"')'", "'$$'", "'ARRAY'", "'DECLARE'", "'INTEGER'", "'DECIMAL'", "'CHAR'", 
			"'BOOLEAN'", "'DATE'", "'VARCHAR'", "'TRUE'", "'FALSE'", "'BEGIN'", "'END'", 
			"'IF'", "'THEN'", "'ELSE'", "'END IF'", "'CASE'", "'WHEN'", "'END CASE'", 
			"'FOR'", "'IN'", "'LOOP'", "'END LOOP'", "'EXIT'", "'CONTINUE'", "'RAISE'", 
			"'RAISE NOTICE'", "'RAISE WARNING'", "'RAISE EXCEPTION'", "'COMMIT'", 
			"'ROLLBACK'", "'CREATE FUNCTION'", "'CREATE PROCEDURE'", "'RETURNS'", 
			"'AS'", "'LANGUAGE'", "'plpgsql'", "'FOREACH'", "'RETURN'", "'OR'", "'AND'", 
			"'NOT'", "'INSERT'", "'INTO'", "'VALUES'", "'UPDATE'", "'SET'", "'WHERE'", 
			"'DELETE'", "'FROM'", "'SELECT'", "'JOIN'", "'LEFT'", "'ON'", "'NOW()'", 
			"'RANDOM()'", "'CONCAT'", "'MODIFY_DATE'", "'CAST'", "'SUBSTRING'", "'ARRAY_PUSH'", 
			"'LEN'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PUNTOCOMA", "ASIGNACION", "COMA", "DOT", "MAS", "MENOS", "POR", 
			"DIVIDIDO", "ELEVADO", "MAYOR", "MENOR", "MAYOR_IGUAL", "MENOR_IGUAL", 
			"IGUAL", "DIFERENTE", "RANGE_DOTS", "COR_OPN", "COR_CLS", "LPAR", "RPAR", 
			"DOLLAR_DOLLAR", "ARRAY", "DECLARE", "INTEGER", "DECIMAL", "CHAR", "BOOLEAN", 
			"DATE", "VARCHAR", "TRUE", "FALSE", "BEGIN", "END", "IF", "THEN", "ELSE", 
			"END_IF", "CASE", "WHEN", "END_CASE", "FOR", "IN", "LOOP", "END_LOOP", 
			"EXIT", "CONTINUE", "RAISE", "RAISE_NOTICE", "RAISE_WARNING", "RAISE_EXCEPTION", 
			"COMMIT", "ROLLBACK", "CREATE_FUNCTION", "CREATE_PROCEDURE", "RETURNS", 
			"AS", "LANGUAGE", "PLPGSQL", "FOREACH", "RETURN", "OR_KW", "AND_KW", 
			"NOT_KW", "INSERT", "INTO", "VALUES", "UPDATE", "SET", "WHERE", "DELETE", 
			"FROM", "SELECT", "JOIN", "LEFT", "ON", "NOW_FUNC", "RANDOM_FUNC", "CONCAT_FUNC", 
			"MODIFY_DATE_FUNC", "CAST_FUNC", "SUBSTRING_FUNC", "ARRAY_PUSH_FUNC", 
			"LEN_FUNC", "IDENTIFICADOR", "NUMERO_DECIMAL", "NUMERO", "CHAR_LITERAL", 
			"VARCHAR_LITERAL", "FECHA", "WS", "LINE_COMMENT", "BLOCK_COMMENT"
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
	public static class ProgramaContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(pgsqlParser.EOF, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public List<FuncionContext> funcion() {
			return getRuleContexts(FuncionContext.class);
		}
		public FuncionContext funcion(int i) {
			return getRuleContext(FuncionContext.class,i);
		}
		public List<ProcedimientoContext> procedimiento() {
			return getRuleContexts(ProcedimientoContext.class);
		}
		public ProcedimientoContext procedimiento(int i) {
			return getRuleContext(ProcedimientoContext.class,i);
		}
		public ProgramaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_programa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterPrograma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitPrograma(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitPrograma(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(93);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 27021602067578880L) != 0)) {
				{
				setState(91);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DECLARE:
				case BEGIN:
					{
					setState(88);
					bloque();
					}
					break;
				case CREATE_FUNCTION:
					{
					setState(89);
					funcion();
					}
					break;
				case CREATE_PROCEDURE:
					{
					setState(90);
					procedimiento();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(95);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(96);
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
		public TerminalNode VARCHAR_LITERAL() { return getToken(pgsqlParser.VARCHAR_LITERAL, 0); }
		public TerminalNode CHAR_LITERAL() { return getToken(pgsqlParser.CHAR_LITERAL, 0); }
		public TerminalNode NUMERO() { return getToken(pgsqlParser.NUMERO, 0); }
		public TerminalNode NUMERO_DECIMAL() { return getToken(pgsqlParser.NUMERO_DECIMAL, 0); }
		public TerminalNode FECHA() { return getToken(pgsqlParser.FECHA, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(pgsqlParser.IDENTIFICADOR, 0); }
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public Func_builtinContext func_builtin() {
			return getRuleContext(Func_builtinContext.class,0);
		}
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
		try {
			setState(106);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case VARCHAR_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(98);
				match(VARCHAR_LITERAL);
				}
				break;
			case CHAR_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(99);
				match(CHAR_LITERAL);
				}
				break;
			case NUMERO:
				enterOuterAlt(_localctx, 3);
				{
				setState(100);
				match(NUMERO);
				}
				break;
			case NUMERO_DECIMAL:
				enterOuterAlt(_localctx, 4);
				{
				setState(101);
				match(NUMERO_DECIMAL);
				}
				break;
			case FECHA:
				enterOuterAlt(_localctx, 5);
				{
				setState(102);
				match(FECHA);
				}
				break;
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 6);
				{
				setState(103);
				match(IDENTIFICADOR);
				}
				break;
			case TRUE:
			case FALSE:
				enterOuterAlt(_localctx, 7);
				{
				setState(104);
				booleano();
				}
				break;
			case NOW_FUNC:
			case RANDOM_FUNC:
			case CONCAT_FUNC:
			case MODIFY_DATE_FUNC:
			case CAST_FUNC:
			case SUBSTRING_FUNC:
			case ARRAY_PUSH_FUNC:
			case LEN_FUNC:
				enterOuterAlt(_localctx, 8);
				{
				setState(105);
				func_builtin();
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
	public static class ValoresContext extends ParserRuleContext {
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(pgsqlParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pgsqlParser.COMA, i);
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
			setState(108);
			valor();
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(109);
				match(COMA);
				setState(110);
				valor();
				}
				}
				setState(115);
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
	public static class BooleanoContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(pgsqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(pgsqlParser.FALSE, 0); }
		public BooleanoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleano; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterBooleano(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitBooleano(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitBooleano(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
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
	public static class Func_builtinContext extends ParserRuleContext {
		public TerminalNode NOW_FUNC() { return getToken(pgsqlParser.NOW_FUNC, 0); }
		public TerminalNode RANDOM_FUNC() { return getToken(pgsqlParser.RANDOM_FUNC, 0); }
		public TerminalNode CONCAT_FUNC() { return getToken(pgsqlParser.CONCAT_FUNC, 0); }
		public TerminalNode MODIFY_DATE_FUNC() { return getToken(pgsqlParser.MODIFY_DATE_FUNC, 0); }
		public TerminalNode CAST_FUNC() { return getToken(pgsqlParser.CAST_FUNC, 0); }
		public TerminalNode SUBSTRING_FUNC() { return getToken(pgsqlParser.SUBSTRING_FUNC, 0); }
		public TerminalNode ARRAY_PUSH_FUNC() { return getToken(pgsqlParser.ARRAY_PUSH_FUNC, 0); }
		public TerminalNode LEN_FUNC() { return getToken(pgsqlParser.LEN_FUNC, 0); }
		public Func_builtinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_builtin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterFunc_builtin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitFunc_builtin(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitFunc_builtin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Func_builtinContext func_builtin() throws RecognitionException {
		Func_builtinContext _localctx = new Func_builtinContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_builtin);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			_la = _input.LA(1);
			if ( !(((((_la - 76)) & ~0x3f) == 0 && ((1L << (_la - 76)) & 255L) != 0)) ) {
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
	public static class ExpresionContext extends ParserRuleContext {
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	 
		public ExpresionContext() { }
		public void copyFrom(ExpresionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GtExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MAYOR() { return getToken(pgsqlParser.MAYOR, 0); }
		public GtExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterGtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitGtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitGtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class GteExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MAYOR_IGUAL() { return getToken(pgsqlParser.MAYOR_IGUAL, 0); }
		public GteExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterGteExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitGteExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitGteExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode OR_KW() { return getToken(pgsqlParser.OR_KW, 0); }
		public OrExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitOrExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitOrExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MENOS() { return getToken(pgsqlParser.MENOS, 0); }
		public SubExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterSubExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitSubExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitSubExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenExprContext extends ExpresionContext {
		public TerminalNode LPAR() { return getToken(pgsqlParser.LPAR, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(pgsqlParser.RPAR, 0); }
		public ParenExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterParenExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitParenExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitParenExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NeqExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode DIFERENTE() { return getToken(pgsqlParser.DIFERENTE, 0); }
		public NeqExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterNeqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitNeqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitNeqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LteExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MENOR_IGUAL() { return getToken(pgsqlParser.MENOR_IGUAL, 0); }
		public LteExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterLteExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitLteExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitLteExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class LtExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MENOR() { return getToken(pgsqlParser.MENOR, 0); }
		public LtExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterLtExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitLtExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitLtExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class EqExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(pgsqlParser.IGUAL, 0); }
		public EqExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterEqExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitEqExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitEqExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends ExpresionContext {
		public TerminalNode NOT_KW() { return getToken(pgsqlParser.NOT_KW, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public NotExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitNotExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitNotExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode MAS() { return getToken(pgsqlParser.MAS, 0); }
		public AddExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterAddExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitAddExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitAddExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValorExprContext extends ExpresionContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ValorExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterValorExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitValorExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitValorExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode POR() { return getToken(pgsqlParser.POR, 0); }
		public MulExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterMulExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitMulExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitMulExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode DIVIDIDO() { return getToken(pgsqlParser.DIVIDIDO, 0); }
		public DivExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterDivExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitDivExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitDivExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode ELEVADO() { return getToken(pgsqlParser.ELEVADO, 0); }
		public PowExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitPowExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitPowExpr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends ExpresionContext {
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode AND_KW() { return getToken(pgsqlParser.AND_KW, 0); }
		public AndExprContext(ExpresionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitAndExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitAndExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionContext expresion() throws RecognitionException {
		return expresion(0);
	}

	private ExpresionContext expresion(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionContext _localctx = new ExpresionContext(_ctx, _parentState);
		ExpresionContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_expresion, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				_localctx = new ParenExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(121);
				match(LPAR);
				setState(122);
				expresion(0);
				setState(123);
				match(RPAR);
				}
				break;
			case NOT_KW:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(125);
				match(NOT_KW);
				setState(126);
				expresion(15);
				}
				break;
			case TRUE:
			case FALSE:
			case NOW_FUNC:
			case RANDOM_FUNC:
			case CONCAT_FUNC:
			case MODIFY_DATE_FUNC:
			case CAST_FUNC:
			case SUBSTRING_FUNC:
			case ARRAY_PUSH_FUNC:
			case LEN_FUNC:
			case IDENTIFICADOR:
			case NUMERO_DECIMAL:
			case NUMERO:
			case CHAR_LITERAL:
			case VARCHAR_LITERAL:
			case FECHA:
				{
				_localctx = new ValorExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(127);
				valor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(171);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(169);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(130);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(131);
						match(ELEVADO);
						setState(132);
						expresion(15);
						}
						break;
					case 2:
						{
						_localctx = new MulExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(133);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(134);
						match(POR);
						setState(135);
						expresion(14);
						}
						break;
					case 3:
						{
						_localctx = new DivExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(136);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(137);
						match(DIVIDIDO);
						setState(138);
						expresion(13);
						}
						break;
					case 4:
						{
						_localctx = new AddExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(139);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(140);
						match(MAS);
						setState(141);
						expresion(12);
						}
						break;
					case 5:
						{
						_localctx = new SubExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(142);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(143);
						match(MENOS);
						setState(144);
						expresion(11);
						}
						break;
					case 6:
						{
						_localctx = new GtExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(145);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(146);
						match(MAYOR);
						setState(147);
						expresion(10);
						}
						break;
					case 7:
						{
						_localctx = new LtExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(148);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(149);
						match(MENOR);
						setState(150);
						expresion(9);
						}
						break;
					case 8:
						{
						_localctx = new GteExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(151);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(152);
						match(MAYOR_IGUAL);
						setState(153);
						expresion(8);
						}
						break;
					case 9:
						{
						_localctx = new LteExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(154);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(155);
						match(MENOR_IGUAL);
						setState(156);
						expresion(7);
						}
						break;
					case 10:
						{
						_localctx = new EqExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(157);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(158);
						match(IGUAL);
						setState(159);
						expresion(6);
						}
						break;
					case 11:
						{
						_localctx = new NeqExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(160);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(161);
						match(DIFERENTE);
						setState(162);
						expresion(5);
						}
						break;
					case 12:
						{
						_localctx = new AndExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(163);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(164);
						match(AND_KW);
						setState(165);
						expresion(4);
						}
						break;
					case 13:
						{
						_localctx = new OrExprContext(new ExpresionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion);
						setState(166);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(167);
						match(OR_KW);
						setState(168);
						expresion(3);
						}
						break;
					}
					} 
				}
				setState(173);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
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
		enterRule(_localctx, 12, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(174);
			match(DECLARE);
			setState(175);
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
		enterRule(_localctx, 14, RULE_declaraciones);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(179); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(179);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						setState(177);
						declaracion_normal();
						}
						break;
					case 2:
						{
						setState(178);
						declaracion_array();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(181); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
		public TerminalNode IDENTIFICADOR() { return getToken(pgsqlParser.IDENTIFICADOR, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public TerminalNode ASIGNACION() { return getToken(pgsqlParser.ASIGNACION, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
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
		enterRule(_localctx, 16, RULE_declaracion_normal);
		try {
			setState(193);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(183);
				match(IDENTIFICADOR);
				setState(184);
				tipo();
				setState(185);
				match(PUNTOCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(187);
				match(IDENTIFICADOR);
				setState(188);
				tipo();
				setState(189);
				match(ASIGNACION);
				setState(190);
				expresion(0);
				setState(191);
				match(PUNTOCOMA);
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
		public TerminalNode IDENTIFICADOR() { return getToken(pgsqlParser.IDENTIFICADOR, 0); }
		public Tipo_arrayContext tipo_array() {
			return getRuleContext(Tipo_arrayContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public TerminalNode ASIGNACION() { return getToken(pgsqlParser.ASIGNACION, 0); }
		public TerminalNode ARRAY() { return getToken(pgsqlParser.ARRAY, 0); }
		public TerminalNode COR_OPN() { return getToken(pgsqlParser.COR_OPN, 0); }
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public TerminalNode COR_CLS() { return getToken(pgsqlParser.COR_CLS, 0); }
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
		enterRule(_localctx, 18, RULE_declaracion_array);
		try {
			setState(208);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(195);
				match(IDENTIFICADOR);
				setState(196);
				tipo_array();
				setState(197);
				match(PUNTOCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(199);
				match(IDENTIFICADOR);
				setState(200);
				tipo_array();
				setState(201);
				match(ASIGNACION);
				setState(202);
				match(ARRAY);
				setState(203);
				match(COR_OPN);
				setState(204);
				valores();
				setState(205);
				match(COR_CLS);
				setState(206);
				match(PUNTOCOMA);
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
		enterRule(_localctx, 20, RULE_tipo);
		try {
			setState(212);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(210);
				tipo_base();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(211);
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
	public static class Tipo_baseContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(pgsqlParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(pgsqlParser.DECIMAL, 0); }
		public TerminalNode CHAR() { return getToken(pgsqlParser.CHAR, 0); }
		public TerminalNode BOOLEAN() { return getToken(pgsqlParser.BOOLEAN, 0); }
		public TerminalNode DATE() { return getToken(pgsqlParser.DATE, 0); }
		public TerminalNode VARCHAR() { return getToken(pgsqlParser.VARCHAR, 0); }
		public TerminalNode LPAR() { return getToken(pgsqlParser.LPAR, 0); }
		public TerminalNode NUMERO() { return getToken(pgsqlParser.NUMERO, 0); }
		public TerminalNode RPAR() { return getToken(pgsqlParser.RPAR, 0); }
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
		enterRule(_localctx, 22, RULE_tipo_base);
		try {
			setState(223);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(214);
				match(INTEGER);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(215);
				match(DECIMAL);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(216);
				match(CHAR);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(217);
				match(BOOLEAN);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(218);
				match(DATE);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(219);
				match(VARCHAR);
				setState(220);
				match(LPAR);
				setState(221);
				match(NUMERO);
				setState(222);
				match(RPAR);
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
		public TerminalNode COR_OPN() { return getToken(pgsqlParser.COR_OPN, 0); }
		public TerminalNode COR_CLS() { return getToken(pgsqlParser.COR_CLS, 0); }
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
		enterRule(_localctx, 24, RULE_tipo_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225);
			tipo_base();
			setState(226);
			match(COR_OPN);
			setState(227);
			match(COR_CLS);
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
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(pgsqlParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(pgsqlParser.END, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public List<Sentencia_en_bloqueContext> sentencia_en_bloque() {
			return getRuleContexts(Sentencia_en_bloqueContext.class);
		}
		public Sentencia_en_bloqueContext sentencia_en_bloque(int i) {
			return getRuleContext(Sentencia_en_bloqueContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(229);
				declaracion();
				}
			}

			setState(232);
			match(BEGIN);
			setState(236);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306566560070011393L) != 0)) {
				{
				{
				setState(233);
				sentencia_en_bloque();
				}
				}
				setState(238);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(239);
			match(END);
			setState(240);
			match(PUNTOCOMA);
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
	public static class Sentencia_en_bloqueContext extends ParserRuleContext {
		public DeclaracionContext declaracion() {
			return getRuleContext(DeclaracionContext.class,0);
		}
		public If_simpleContext if_simple() {
			return getRuleContext(If_simpleContext.class,0);
		}
		public If_elseContext if_else() {
			return getRuleContext(If_elseContext.class,0);
		}
		public Case_whenContext case_when() {
			return getRuleContext(Case_whenContext.class,0);
		}
		public Ciclo_forContext ciclo_for() {
			return getRuleContext(Ciclo_forContext.class,0);
		}
		public Ciclo_foreach_arrayContext ciclo_foreach_array() {
			return getRuleContext(Ciclo_foreach_arrayContext.class,0);
		}
		public Ciclo_foreach_selectContext ciclo_foreach_select() {
			return getRuleContext(Ciclo_foreach_selectContext.class,0);
		}
		public Exit_stmtContext exit_stmt() {
			return getRuleContext(Exit_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Raise_noticeContext raise_notice() {
			return getRuleContext(Raise_noticeContext.class,0);
		}
		public Raise_warningContext raise_warning() {
			return getRuleContext(Raise_warningContext.class,0);
		}
		public Raise_exceptionContext raise_exception() {
			return getRuleContext(Raise_exceptionContext.class,0);
		}
		public Raise_simpleContext raise_simple() {
			return getRuleContext(Raise_simpleContext.class,0);
		}
		public Trans_commitContext trans_commit() {
			return getRuleContext(Trans_commitContext.class,0);
		}
		public Trans_rollbackContext trans_rollback() {
			return getRuleContext(Trans_rollbackContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public ProcedimientoContext procedimiento() {
			return getRuleContext(ProcedimientoContext.class,0);
		}
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public AsignacionesContext asignaciones() {
			return getRuleContext(AsignacionesContext.class,0);
		}
		public Sentencia_en_bloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_en_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterSentencia_en_bloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitSentencia_en_bloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitSentencia_en_bloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sentencia_en_bloqueContext sentencia_en_bloque() throws RecognitionException {
		Sentencia_en_bloqueContext _localctx = new Sentencia_en_bloqueContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_sentencia_en_bloque);
		try {
			setState(265);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(242);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(243);
				if_simple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(244);
				if_else();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(245);
				case_when();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(246);
				ciclo_for();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(247);
				ciclo_foreach_array();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(248);
				ciclo_foreach_select();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(249);
				exit_stmt();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(250);
				continue_stmt();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(251);
				raise_notice();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(252);
				raise_warning();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(253);
				raise_exception();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(254);
				raise_simple();
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(255);
				trans_commit();
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(256);
				trans_rollback();
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(257);
				funcion();
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(258);
				procedimiento();
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(259);
				bloque();
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(260);
				select_stmt();
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(261);
				insert_stmt();
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(262);
				update_stmt();
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(263);
				delete_stmt();
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(264);
				asignaciones();
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
	public static class If_simpleContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(pgsqlParser.IF, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(pgsqlParser.THEN, 0); }
		public TerminalNode END_IF() { return getToken(pgsqlParser.END_IF, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public List<Sentencia_en_bloqueContext> sentencia_en_bloque() {
			return getRuleContexts(Sentencia_en_bloqueContext.class);
		}
		public Sentencia_en_bloqueContext sentencia_en_bloque(int i) {
			return getRuleContext(Sentencia_en_bloqueContext.class,i);
		}
		public If_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterIf_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitIf_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitIf_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_simpleContext if_simple() throws RecognitionException {
		If_simpleContext _localctx = new If_simpleContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_if_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(IF);
			setState(268);
			expresion(0);
			setState(269);
			match(THEN);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306566560070011393L) != 0)) {
				{
				{
				setState(270);
				sentencia_en_bloque();
				}
				}
				setState(275);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(276);
			match(END_IF);
			setState(277);
			match(PUNTOCOMA);
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
	public static class If_elseContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(pgsqlParser.IF, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode THEN() { return getToken(pgsqlParser.THEN, 0); }
		public TerminalNode ELSE() { return getToken(pgsqlParser.ELSE, 0); }
		public TerminalNode END_IF() { return getToken(pgsqlParser.END_IF, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public List<Sentencia_en_bloqueContext> sentencia_en_bloque() {
			return getRuleContexts(Sentencia_en_bloqueContext.class);
		}
		public Sentencia_en_bloqueContext sentencia_en_bloque(int i) {
			return getRuleContext(Sentencia_en_bloqueContext.class,i);
		}
		public If_elseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_else; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterIf_else(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitIf_else(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitIf_else(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_if_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(279);
			match(IF);
			setState(280);
			expresion(0);
			setState(281);
			match(THEN);
			setState(285);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306566560070011393L) != 0)) {
				{
				{
				setState(282);
				sentencia_en_bloque();
				}
				}
				setState(287);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(288);
			match(ELSE);
			setState(292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306566560070011393L) != 0)) {
				{
				{
				setState(289);
				sentencia_en_bloque();
				}
				}
				setState(294);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(295);
			match(END_IF);
			setState(296);
			match(PUNTOCOMA);
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
	public static class Case_whenContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(pgsqlParser.CASE, 0); }
		public TerminalNode END_CASE() { return getToken(pgsqlParser.END_CASE, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public List<TerminalNode> WHEN() { return getTokens(pgsqlParser.WHEN); }
		public TerminalNode WHEN(int i) {
			return getToken(pgsqlParser.WHEN, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> THEN() { return getTokens(pgsqlParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(pgsqlParser.THEN, i);
		}
		public TerminalNode ELSE() { return getToken(pgsqlParser.ELSE, 0); }
		public List<Sentencia_en_bloqueContext> sentencia_en_bloque() {
			return getRuleContexts(Sentencia_en_bloqueContext.class);
		}
		public Sentencia_en_bloqueContext sentencia_en_bloque(int i) {
			return getRuleContext(Sentencia_en_bloqueContext.class,i);
		}
		public Case_whenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_case_when; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterCase_when(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitCase_when(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitCase_when(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Case_whenContext case_when() throws RecognitionException {
		Case_whenContext _localctx = new Case_whenContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_case_when);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(CASE);
			setState(307); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(299);
				match(WHEN);
				setState(300);
				expresion(0);
				setState(301);
				match(THEN);
				setState(303); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(302);
					sentencia_en_bloque();
					}
					}
					setState(305); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306566560070011393L) != 0) );
				}
				}
				setState(309); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(317);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(311);
				match(ELSE);
				setState(313); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(312);
					sentencia_en_bloque();
					}
					}
					setState(315); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306566560070011393L) != 0) );
				}
			}

			setState(319);
			match(END_CASE);
			setState(320);
			match(PUNTOCOMA);
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
	public static class Ciclo_forContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(pgsqlParser.FOR, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(pgsqlParser.IDENTIFICADOR, 0); }
		public TerminalNode IN() { return getToken(pgsqlParser.IN, 0); }
		public List<TerminalNode> NUMERO() { return getTokens(pgsqlParser.NUMERO); }
		public TerminalNode NUMERO(int i) {
			return getToken(pgsqlParser.NUMERO, i);
		}
		public TerminalNode RANGE_DOTS() { return getToken(pgsqlParser.RANGE_DOTS, 0); }
		public TerminalNode LOOP() { return getToken(pgsqlParser.LOOP, 0); }
		public TerminalNode END_LOOP() { return getToken(pgsqlParser.END_LOOP, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public List<Sentencia_en_bloqueContext> sentencia_en_bloque() {
			return getRuleContexts(Sentencia_en_bloqueContext.class);
		}
		public Sentencia_en_bloqueContext sentencia_en_bloque(int i) {
			return getRuleContext(Sentencia_en_bloqueContext.class,i);
		}
		public Ciclo_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_for; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterCiclo_for(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitCiclo_for(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitCiclo_for(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_forContext ciclo_for() throws RecognitionException {
		Ciclo_forContext _localctx = new Ciclo_forContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_ciclo_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(322);
			match(FOR);
			setState(323);
			match(IDENTIFICADOR);
			setState(324);
			match(IN);
			setState(325);
			match(NUMERO);
			setState(326);
			match(RANGE_DOTS);
			setState(327);
			match(NUMERO);
			setState(328);
			match(LOOP);
			setState(332);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306566560070011393L) != 0)) {
				{
				{
				setState(329);
				sentencia_en_bloque();
				}
				}
				setState(334);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(335);
			match(END_LOOP);
			setState(336);
			match(PUNTOCOMA);
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
	public static class Ciclo_foreach_arrayContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(pgsqlParser.FOREACH, 0); }
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(pgsqlParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(pgsqlParser.IDENTIFICADOR, i);
		}
		public TerminalNode IN() { return getToken(pgsqlParser.IN, 0); }
		public TerminalNode ARRAY() { return getToken(pgsqlParser.ARRAY, 0); }
		public TerminalNode LOOP() { return getToken(pgsqlParser.LOOP, 0); }
		public TerminalNode END_LOOP() { return getToken(pgsqlParser.END_LOOP, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public List<Sentencia_en_bloqueContext> sentencia_en_bloque() {
			return getRuleContexts(Sentencia_en_bloqueContext.class);
		}
		public Sentencia_en_bloqueContext sentencia_en_bloque(int i) {
			return getRuleContext(Sentencia_en_bloqueContext.class,i);
		}
		public Ciclo_foreach_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_foreach_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterCiclo_foreach_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitCiclo_foreach_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitCiclo_foreach_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_foreach_arrayContext ciclo_foreach_array() throws RecognitionException {
		Ciclo_foreach_arrayContext _localctx = new Ciclo_foreach_arrayContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ciclo_foreach_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			match(FOREACH);
			setState(339);
			match(IDENTIFICADOR);
			setState(340);
			match(IN);
			setState(341);
			match(ARRAY);
			setState(342);
			match(IDENTIFICADOR);
			setState(343);
			match(LOOP);
			setState(347);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306566560070011393L) != 0)) {
				{
				{
				setState(344);
				sentencia_en_bloque();
				}
				}
				setState(349);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(350);
			match(END_LOOP);
			setState(351);
			match(PUNTOCOMA);
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
	public static class Ciclo_foreach_selectContext extends ParserRuleContext {
		public TerminalNode FOREACH() { return getToken(pgsqlParser.FOREACH, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(pgsqlParser.IDENTIFICADOR, 0); }
		public TerminalNode IN() { return getToken(pgsqlParser.IN, 0); }
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode LOOP() { return getToken(pgsqlParser.LOOP, 0); }
		public TerminalNode END_LOOP() { return getToken(pgsqlParser.END_LOOP, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public List<Sentencia_en_bloqueContext> sentencia_en_bloque() {
			return getRuleContexts(Sentencia_en_bloqueContext.class);
		}
		public Sentencia_en_bloqueContext sentencia_en_bloque(int i) {
			return getRuleContext(Sentencia_en_bloqueContext.class,i);
		}
		public Ciclo_foreach_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_foreach_select; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterCiclo_foreach_select(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitCiclo_foreach_select(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitCiclo_foreach_select(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Ciclo_foreach_selectContext ciclo_foreach_select() throws RecognitionException {
		Ciclo_foreach_selectContext _localctx = new Ciclo_foreach_selectContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_ciclo_foreach_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(353);
			match(FOREACH);
			setState(354);
			match(IDENTIFICADOR);
			setState(355);
			match(IN);
			setState(356);
			select_stmt();
			setState(357);
			match(LOOP);
			setState(361);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306566560070011393L) != 0)) {
				{
				{
				setState(358);
				sentencia_en_bloque();
				}
				}
				setState(363);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(364);
			match(END_LOOP);
			setState(365);
			match(PUNTOCOMA);
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
	public static class Exit_stmtContext extends ParserRuleContext {
		public TerminalNode EXIT() { return getToken(pgsqlParser.EXIT, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public Exit_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exit_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterExit_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitExit_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitExit_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Exit_stmtContext exit_stmt() throws RecognitionException {
		Exit_stmtContext _localctx = new Exit_stmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(367);
			match(EXIT);
			setState(368);
			match(PUNTOCOMA);
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
	public static class Continue_stmtContext extends ParserRuleContext {
		public TerminalNode CONTINUE() { return getToken(pgsqlParser.CONTINUE, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public Continue_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_continue_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterContinue_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitContinue_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitContinue_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(CONTINUE);
			setState(371);
			match(PUNTOCOMA);
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
	public static class Raise_noticeContext extends ParserRuleContext {
		public TerminalNode RAISE_NOTICE() { return getToken(pgsqlParser.RAISE_NOTICE, 0); }
		public TerminalNode VARCHAR_LITERAL() { return getToken(pgsqlParser.VARCHAR_LITERAL, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public List<TerminalNode> COMA() { return getTokens(pgsqlParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pgsqlParser.COMA, i);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public Raise_noticeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_notice; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterRaise_notice(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitRaise_notice(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitRaise_notice(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_noticeContext raise_notice() throws RecognitionException {
		Raise_noticeContext _localctx = new Raise_noticeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_raise_notice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(373);
			match(RAISE_NOTICE);
			setState(374);
			match(VARCHAR_LITERAL);
			setState(379);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(375);
				match(COMA);
				setState(376);
				valor();
				}
				}
				setState(381);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(382);
			match(PUNTOCOMA);
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
	public static class Raise_warningContext extends ParserRuleContext {
		public TerminalNode RAISE_WARNING() { return getToken(pgsqlParser.RAISE_WARNING, 0); }
		public TerminalNode VARCHAR_LITERAL() { return getToken(pgsqlParser.VARCHAR_LITERAL, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public List<TerminalNode> COMA() { return getTokens(pgsqlParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pgsqlParser.COMA, i);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public Raise_warningContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_warning; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterRaise_warning(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitRaise_warning(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitRaise_warning(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_warningContext raise_warning() throws RecognitionException {
		Raise_warningContext _localctx = new Raise_warningContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_raise_warning);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(384);
			match(RAISE_WARNING);
			setState(385);
			match(VARCHAR_LITERAL);
			setState(390);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(386);
				match(COMA);
				setState(387);
				valor();
				}
				}
				setState(392);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(393);
			match(PUNTOCOMA);
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
	public static class Raise_exceptionContext extends ParserRuleContext {
		public TerminalNode RAISE_EXCEPTION() { return getToken(pgsqlParser.RAISE_EXCEPTION, 0); }
		public TerminalNode VARCHAR_LITERAL() { return getToken(pgsqlParser.VARCHAR_LITERAL, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public List<TerminalNode> COMA() { return getTokens(pgsqlParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pgsqlParser.COMA, i);
		}
		public List<ValorContext> valor() {
			return getRuleContexts(ValorContext.class);
		}
		public ValorContext valor(int i) {
			return getRuleContext(ValorContext.class,i);
		}
		public Raise_exceptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_exception; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterRaise_exception(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitRaise_exception(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitRaise_exception(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_exceptionContext raise_exception() throws RecognitionException {
		Raise_exceptionContext _localctx = new Raise_exceptionContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_raise_exception);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(395);
			match(RAISE_EXCEPTION);
			setState(396);
			match(VARCHAR_LITERAL);
			setState(401);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(397);
				match(COMA);
				setState(398);
				valor();
				}
				}
				setState(403);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(404);
			match(PUNTOCOMA);
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
	public static class Raise_simpleContext extends ParserRuleContext {
		public TerminalNode RAISE() { return getToken(pgsqlParser.RAISE, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public Raise_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_simple; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterRaise_simple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitRaise_simple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitRaise_simple(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Raise_simpleContext raise_simple() throws RecognitionException {
		Raise_simpleContext _localctx = new Raise_simpleContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_raise_simple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(406);
			match(RAISE);
			setState(407);
			match(PUNTOCOMA);
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
	public static class Trans_commitContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(pgsqlParser.BEGIN, 0); }
		public TerminalNode COMMIT() { return getToken(pgsqlParser.COMMIT, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public List<Sentencia_en_bloqueContext> sentencia_en_bloque() {
			return getRuleContexts(Sentencia_en_bloqueContext.class);
		}
		public Sentencia_en_bloqueContext sentencia_en_bloque(int i) {
			return getRuleContext(Sentencia_en_bloqueContext.class,i);
		}
		public Trans_commitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trans_commit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterTrans_commit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitTrans_commit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitTrans_commit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trans_commitContext trans_commit() throws RecognitionException {
		Trans_commitContext _localctx = new Trans_commitContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_trans_commit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(409);
			match(BEGIN);
			setState(413);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306566560070011393L) != 0)) {
				{
				{
				setState(410);
				sentencia_en_bloque();
				}
				}
				setState(415);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(416);
			match(COMMIT);
			setState(417);
			match(PUNTOCOMA);
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
	public static class Trans_rollbackContext extends ParserRuleContext {
		public TerminalNode BEGIN() { return getToken(pgsqlParser.BEGIN, 0); }
		public TerminalNode ROLLBACK() { return getToken(pgsqlParser.ROLLBACK, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public List<Sentencia_en_bloqueContext> sentencia_en_bloque() {
			return getRuleContexts(Sentencia_en_bloqueContext.class);
		}
		public Sentencia_en_bloqueContext sentencia_en_bloque(int i) {
			return getRuleContext(Sentencia_en_bloqueContext.class,i);
		}
		public Trans_rollbackContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trans_rollback; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterTrans_rollback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitTrans_rollback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitTrans_rollback(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trans_rollbackContext trans_rollback() throws RecognitionException {
		Trans_rollbackContext _localctx = new Trans_rollbackContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_trans_rollback);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(419);
			match(BEGIN);
			setState(423);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306566560070011393L) != 0)) {
				{
				{
				setState(420);
				sentencia_en_bloque();
				}
				}
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(426);
			match(ROLLBACK);
			setState(427);
			match(PUNTOCOMA);
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
	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode CREATE_FUNCTION() { return getToken(pgsqlParser.CREATE_FUNCTION, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(pgsqlParser.IDENTIFICADOR, 0); }
		public TerminalNode LPAR() { return getToken(pgsqlParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(pgsqlParser.RPAR, 0); }
		public TerminalNode RETURNS() { return getToken(pgsqlParser.RETURNS, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public TerminalNode AS() { return getToken(pgsqlParser.AS, 0); }
		public List<TerminalNode> DOLLAR_DOLLAR() { return getTokens(pgsqlParser.DOLLAR_DOLLAR); }
		public TerminalNode DOLLAR_DOLLAR(int i) {
			return getToken(pgsqlParser.DOLLAR_DOLLAR, i);
		}
		public TerminalNode RETURN() { return getToken(pgsqlParser.RETURN, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public List<TerminalNode> PUNTOCOMA() { return getTokens(pgsqlParser.PUNTOCOMA); }
		public TerminalNode PUNTOCOMA(int i) {
			return getToken(pgsqlParser.PUNTOCOMA, i);
		}
		public TerminalNode LANGUAGE() { return getToken(pgsqlParser.LANGUAGE, 0); }
		public TerminalNode PLPGSQL() { return getToken(pgsqlParser.PLPGSQL, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Sentencia_en_bloqueContext> sentencia_en_bloque() {
			return getRuleContexts(Sentencia_en_bloqueContext.class);
		}
		public Sentencia_en_bloqueContext sentencia_en_bloque(int i) {
			return getRuleContext(Sentencia_en_bloqueContext.class,i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			match(CREATE_FUNCTION);
			setState(430);
			match(IDENTIFICADOR);
			setState(431);
			match(LPAR);
			setState(433);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(432);
				parametros();
				}
			}

			setState(435);
			match(RPAR);
			setState(436);
			match(RETURNS);
			setState(437);
			tipo();
			setState(438);
			match(AS);
			setState(439);
			match(DOLLAR_DOLLAR);
			setState(443);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306566560070011393L) != 0)) {
				{
				{
				setState(440);
				sentencia_en_bloque();
				}
				}
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(446);
			match(RETURN);
			setState(447);
			valor();
			setState(448);
			match(PUNTOCOMA);
			setState(449);
			match(DOLLAR_DOLLAR);
			setState(450);
			match(LANGUAGE);
			setState(451);
			match(PLPGSQL);
			setState(452);
			match(PUNTOCOMA);
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
	public static class ProcedimientoContext extends ParserRuleContext {
		public TerminalNode CREATE_PROCEDURE() { return getToken(pgsqlParser.CREATE_PROCEDURE, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(pgsqlParser.IDENTIFICADOR, 0); }
		public TerminalNode LPAR() { return getToken(pgsqlParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(pgsqlParser.RPAR, 0); }
		public TerminalNode LANGUAGE() { return getToken(pgsqlParser.LANGUAGE, 0); }
		public TerminalNode PLPGSQL() { return getToken(pgsqlParser.PLPGSQL, 0); }
		public TerminalNode AS() { return getToken(pgsqlParser.AS, 0); }
		public List<TerminalNode> DOLLAR_DOLLAR() { return getTokens(pgsqlParser.DOLLAR_DOLLAR); }
		public TerminalNode DOLLAR_DOLLAR(int i) {
			return getToken(pgsqlParser.DOLLAR_DOLLAR, i);
		}
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Sentencia_en_bloqueContext> sentencia_en_bloque() {
			return getRuleContexts(Sentencia_en_bloqueContext.class);
		}
		public Sentencia_en_bloqueContext sentencia_en_bloque(int i) {
			return getRuleContext(Sentencia_en_bloqueContext.class,i);
		}
		public ProcedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimiento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterProcedimiento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitProcedimiento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitProcedimiento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedimientoContext procedimiento() throws RecognitionException {
		ProcedimientoContext _localctx = new ProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_procedimiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(CREATE_PROCEDURE);
			setState(455);
			match(IDENTIFICADOR);
			setState(456);
			match(LPAR);
			setState(458);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(457);
				parametros();
				}
			}

			setState(460);
			match(RPAR);
			setState(461);
			match(LANGUAGE);
			setState(462);
			match(PLPGSQL);
			setState(463);
			match(AS);
			setState(464);
			match(DOLLAR_DOLLAR);
			setState(468);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306566560070011393L) != 0)) {
				{
				{
				setState(465);
				sentencia_en_bloque();
				}
				}
				setState(470);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(471);
			match(DOLLAR_DOLLAR);
			setState(472);
			match(PUNTOCOMA);
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
	public static class ParametrosContext extends ParserRuleContext {
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(pgsqlParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pgsqlParser.COMA, i);
		}
		public ParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(474);
			parametro();
			setState(479);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(475);
				match(COMA);
				setState(476);
				parametro();
				}
				}
				setState(481);
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
	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode IDENTIFICADOR() { return getToken(pgsqlParser.IDENTIFICADOR, 0); }
		public TipoContext tipo() {
			return getRuleContext(TipoContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitParametro(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitParametro(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			match(IDENTIFICADOR);
			setState(483);
			tipo();
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
	public static class Insert_stmtContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(pgsqlParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(pgsqlParser.INTO, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(pgsqlParser.IDENTIFICADOR, 0); }
		public List<TerminalNode> LPAR() { return getTokens(pgsqlParser.LPAR); }
		public TerminalNode LPAR(int i) {
			return getToken(pgsqlParser.LPAR, i);
		}
		public ColumnasContext columnas() {
			return getRuleContext(ColumnasContext.class,0);
		}
		public List<TerminalNode> RPAR() { return getTokens(pgsqlParser.RPAR); }
		public TerminalNode RPAR(int i) {
			return getToken(pgsqlParser.RPAR, i);
		}
		public TerminalNode VALUES() { return getToken(pgsqlParser.VALUES, 0); }
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public Insert_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterInsert_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitInsert_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitInsert_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_insert_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(485);
			match(INSERT);
			setState(486);
			match(INTO);
			setState(487);
			match(IDENTIFICADOR);
			setState(488);
			match(LPAR);
			setState(489);
			columnas();
			setState(490);
			match(RPAR);
			setState(491);
			match(VALUES);
			setState(492);
			match(LPAR);
			setState(493);
			valores();
			setState(494);
			match(RPAR);
			setState(495);
			match(PUNTOCOMA);
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
	public static class Update_stmtContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(pgsqlParser.UPDATE, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(pgsqlParser.IDENTIFICADOR, 0); }
		public TerminalNode SET() { return getToken(pgsqlParser.SET, 0); }
		public AsignacionesContext asignaciones() {
			return getRuleContext(AsignacionesContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(pgsqlParser.WHERE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public Update_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterUpdate_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitUpdate_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitUpdate_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_update_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(497);
			match(UPDATE);
			setState(498);
			match(IDENTIFICADOR);
			setState(499);
			match(SET);
			setState(500);
			asignaciones();
			setState(501);
			match(WHERE);
			setState(502);
			expresion(0);
			setState(503);
			match(PUNTOCOMA);
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
	public static class Delete_stmtContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(pgsqlParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(pgsqlParser.FROM, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(pgsqlParser.IDENTIFICADOR, 0); }
		public TerminalNode WHERE() { return getToken(pgsqlParser.WHERE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public Delete_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterDelete_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitDelete_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitDelete_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_delete_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			match(DELETE);
			setState(506);
			match(FROM);
			setState(507);
			match(IDENTIFICADOR);
			setState(508);
			match(WHERE);
			setState(509);
			expresion(0);
			setState(510);
			match(PUNTOCOMA);
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
	public static class Select_stmtContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(pgsqlParser.SELECT, 0); }
		public ColumnasContext columnas() {
			return getRuleContext(ColumnasContext.class,0);
		}
		public TerminalNode FROM() { return getToken(pgsqlParser.FROM, 0); }
		public TerminalNode IDENTIFICADOR() { return getToken(pgsqlParser.IDENTIFICADOR, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public Join_listContext join_list() {
			return getRuleContext(Join_listContext.class,0);
		}
		public Where_clauseContext where_clause() {
			return getRuleContext(Where_clauseContext.class,0);
		}
		public Select_stmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select_stmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterSelect_stmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitSelect_stmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitSelect_stmt(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			match(SELECT);
			setState(513);
			columnas();
			setState(514);
			match(FROM);
			setState(515);
			match(IDENTIFICADOR);
			setState(517);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JOIN || _la==LEFT) {
				{
				setState(516);
				join_list();
				}
			}

			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(519);
				where_clause();
				}
			}

			setState(522);
			match(PUNTOCOMA);
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
		public List<TerminalNode> COMA() { return getTokens(pgsqlParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pgsqlParser.COMA, i);
		}
		public ColumnasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnas; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterColumnas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitColumnas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitColumnas(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnasContext columnas() throws RecognitionException {
		ColumnasContext _localctx = new ColumnasContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_columnas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			columna_prefijo();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(525);
				match(COMA);
				setState(526);
				columna_prefijo();
				}
				}
				setState(531);
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
	public static class Columna_prefijoContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(pgsqlParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(pgsqlParser.IDENTIFICADOR, i);
		}
		public TerminalNode DOT() { return getToken(pgsqlParser.DOT, 0); }
		public Columna_prefijoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columna_prefijo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterColumna_prefijo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitColumna_prefijo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitColumna_prefijo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Columna_prefijoContext columna_prefijo() throws RecognitionException {
		Columna_prefijoContext _localctx = new Columna_prefijoContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_columna_prefijo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				{
				setState(532);
				match(IDENTIFICADOR);
				}
				break;
			}
			setState(536);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(535);
				match(DOT);
				}
			}

			setState(538);
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
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterJoin_list(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitJoin_list(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitJoin_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_listContext join_list() throws RecognitionException {
		Join_listContext _localctx = new Join_listContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_join_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(540);
				join_clause();
				}
				}
				setState(543); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==JOIN || _la==LEFT );
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
		public TerminalNode IDENTIFICADOR() { return getToken(pgsqlParser.IDENTIFICADOR, 0); }
		public TerminalNode ON() { return getToken(pgsqlParser.ON, 0); }
		public List<Columna_prefijoContext> columna_prefijo() {
			return getRuleContexts(Columna_prefijoContext.class);
		}
		public Columna_prefijoContext columna_prefijo(int i) {
			return getRuleContext(Columna_prefijoContext.class,i);
		}
		public TerminalNode IGUAL() { return getToken(pgsqlParser.IGUAL, 0); }
		public TerminalNode JOIN() { return getToken(pgsqlParser.JOIN, 0); }
		public TerminalNode LEFT() { return getToken(pgsqlParser.LEFT, 0); }
		public Join_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterJoin_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitJoin_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitJoin_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_join_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(548);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
				{
				setState(545);
				match(JOIN);
				}
				break;
			case LEFT:
				{
				setState(546);
				match(LEFT);
				setState(547);
				match(JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(550);
			match(IDENTIFICADOR);
			setState(551);
			match(ON);
			setState(552);
			columna_prefijo();
			setState(553);
			match(IGUAL);
			setState(554);
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
	public static class AsignacionesContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(pgsqlParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(pgsqlParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> ASIGNACION() { return getTokens(pgsqlParser.ASIGNACION); }
		public TerminalNode ASIGNACION(int i) {
			return getToken(pgsqlParser.ASIGNACION, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public List<TerminalNode> COMA() { return getTokens(pgsqlParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pgsqlParser.COMA, i);
		}
		public AsignacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignaciones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterAsignaciones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitAsignaciones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitAsignaciones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsignacionesContext asignaciones() throws RecognitionException {
		AsignacionesContext _localctx = new AsignacionesContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_asignaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			match(IDENTIFICADOR);
			setState(557);
			match(ASIGNACION);
			setState(558);
			expresion(0);
			setState(565);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(559);
				match(COMA);
				setState(560);
				match(IDENTIFICADOR);
				setState(561);
				match(ASIGNACION);
				setState(562);
				expresion(0);
				}
				}
				setState(567);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(568);
			match(PUNTOCOMA);
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
	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(pgsqlParser.WHERE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterWhere_clause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitWhere_clause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitWhere_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(WHERE);
			setState(571);
			expresion(0);
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
	public static class CondicionContext extends ParserRuleContext {
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public CondicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).enterCondicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof pgsqlListener ) ((pgsqlListener)listener).exitCondicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof pgsqlVisitor ) return ((pgsqlVisitor<? extends T>)visitor).visitCondicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(573);
			expresion(0);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5:
			return expresion_sempred((ExpresionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_sempred(ExpresionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 14);
		case 1:
			return precpred(_ctx, 13);
		case 2:
			return precpred(_ctx, 12);
		case 3:
			return precpred(_ctx, 11);
		case 4:
			return precpred(_ctx, 10);
		case 5:
			return precpred(_ctx, 9);
		case 6:
			return precpred(_ctx, 8);
		case 7:
			return precpred(_ctx, 7);
		case 8:
			return precpred(_ctx, 6);
		case 9:
			return precpred(_ctx, 5);
		case 10:
			return precpred(_ctx, 4);
		case 11:
			return precpred(_ctx, 3);
		case 12:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\\\u0240\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007\'\u0002"+
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0005\u0000\\\b\u0000\n\u0000\f\u0000_\t\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001k\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0005\u0002p\b\u0002\n\u0002\f\u0002s\t\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0081\b\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0005\u0005"+
		"\u00aa\b\u0005\n\u0005\f\u0005\u00ad\t\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0007\u0001\u0007\u0004\u0007\u00b4\b\u0007\u000b\u0007\f"+
		"\u0007\u00b5\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0003\b\u00c2\b\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0003"+
		"\t\u00d1\b\t\u0001\n\u0001\n\u0003\n\u00d5\b\n\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b"+
		"\u0001\u000b\u0003\u000b\u00e0\b\u000b\u0001\f\u0001\f\u0001\f\u0001\f"+
		"\u0001\r\u0003\r\u00e7\b\r\u0001\r\u0001\r\u0005\r\u00eb\b\r\n\r\f\r\u00ee"+
		"\t\r\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u010a\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0005\u000f\u0110\b\u000f\n\u000f\f\u000f\u0113\t\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u011c\b\u0010\n\u0010\f\u0010\u011f\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0005\u0010\u0123\b\u0010\n\u0010\f\u0010\u0126\t\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0001\u0011\u0004\u0011\u0130\b\u0011\u000b\u0011\f\u0011"+
		"\u0131\u0004\u0011\u0134\b\u0011\u000b\u0011\f\u0011\u0135\u0001\u0011"+
		"\u0001\u0011\u0004\u0011\u013a\b\u0011\u000b\u0011\f\u0011\u013b\u0003"+
		"\u0011\u013e\b\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001"+
		"\u0012\u0005\u0012\u014b\b\u0012\n\u0012\f\u0012\u014e\t\u0012\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0005\u0013\u015a\b\u0013\n\u0013"+
		"\f\u0013\u015d\t\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0005\u0014"+
		"\u0168\b\u0014\n\u0014\f\u0014\u016b\t\u0014\u0001\u0014\u0001\u0014\u0001"+
		"\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0005\u0017\u017a"+
		"\b\u0017\n\u0017\f\u0017\u017d\t\u0017\u0001\u0017\u0001\u0017\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0005\u0018\u0185\b\u0018\n\u0018"+
		"\f\u0018\u0188\t\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0005\u0019\u0190\b\u0019\n\u0019\f\u0019\u0193"+
		"\t\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001"+
		"\u001b\u0001\u001b\u0005\u001b\u019c\b\u001b\n\u001b\f\u001b\u019f\t\u001b"+
		"\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c\u0005\u001c"+
		"\u01a6\b\u001c\n\u001c\f\u001c\u01a9\t\u001c\u0001\u001c\u0001\u001c\u0001"+
		"\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01b2"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001d\u0005\u001d\u01ba\b\u001d\n\u001d\f\u001d\u01bd\t\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d\u0001\u001d"+
		"\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e"+
		"\u01cb\b\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0005\u001e\u01d3\b\u001e\n\u001e\f\u001e\u01d6\t\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001\u001f\u0001\u001f\u0005"+
		"\u001f\u01de\b\u001f\n\u001f\f\u001f\u01e1\t\u001f\u0001 \u0001 \u0001"+
		" \u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001!\u0001"+
		"!\u0001!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001"+
		"$\u0001$\u0001$\u0001$\u0003$\u0206\b$\u0001$\u0003$\u0209\b$\u0001$\u0001"+
		"$\u0001%\u0001%\u0001%\u0005%\u0210\b%\n%\f%\u0213\t%\u0001&\u0003&\u0216"+
		"\b&\u0001&\u0003&\u0219\b&\u0001&\u0001&\u0001\'\u0004\'\u021e\b\'\u000b"+
		"\'\f\'\u021f\u0001(\u0001(\u0001(\u0003(\u0225\b(\u0001(\u0001(\u0001"+
		"(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001)\u0001)\u0001)\u0001"+
		")\u0005)\u0234\b)\n)\f)\u0237\t)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0000\u0001\n,\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,.02468:<>@BDFHJLNPR"+
		"TV\u0000\u0002\u0001\u0000\u001e\u001f\u0001\u0000LS\u026b\u0000]\u0001"+
		"\u0000\u0000\u0000\u0002j\u0001\u0000\u0000\u0000\u0004l\u0001\u0000\u0000"+
		"\u0000\u0006t\u0001\u0000\u0000\u0000\bv\u0001\u0000\u0000\u0000\n\u0080"+
		"\u0001\u0000\u0000\u0000\f\u00ae\u0001\u0000\u0000\u0000\u000e\u00b3\u0001"+
		"\u0000\u0000\u0000\u0010\u00c1\u0001\u0000\u0000\u0000\u0012\u00d0\u0001"+
		"\u0000\u0000\u0000\u0014\u00d4\u0001\u0000\u0000\u0000\u0016\u00df\u0001"+
		"\u0000\u0000\u0000\u0018\u00e1\u0001\u0000\u0000\u0000\u001a\u00e6\u0001"+
		"\u0000\u0000\u0000\u001c\u0109\u0001\u0000\u0000\u0000\u001e\u010b\u0001"+
		"\u0000\u0000\u0000 \u0117\u0001\u0000\u0000\u0000\"\u012a\u0001\u0000"+
		"\u0000\u0000$\u0142\u0001\u0000\u0000\u0000&\u0152\u0001\u0000\u0000\u0000"+
		"(\u0161\u0001\u0000\u0000\u0000*\u016f\u0001\u0000\u0000\u0000,\u0172"+
		"\u0001\u0000\u0000\u0000.\u0175\u0001\u0000\u0000\u00000\u0180\u0001\u0000"+
		"\u0000\u00002\u018b\u0001\u0000\u0000\u00004\u0196\u0001\u0000\u0000\u0000"+
		"6\u0199\u0001\u0000\u0000\u00008\u01a3\u0001\u0000\u0000\u0000:\u01ad"+
		"\u0001\u0000\u0000\u0000<\u01c6\u0001\u0000\u0000\u0000>\u01da\u0001\u0000"+
		"\u0000\u0000@\u01e2\u0001\u0000\u0000\u0000B\u01e5\u0001\u0000\u0000\u0000"+
		"D\u01f1\u0001\u0000\u0000\u0000F\u01f9\u0001\u0000\u0000\u0000H\u0200"+
		"\u0001\u0000\u0000\u0000J\u020c\u0001\u0000\u0000\u0000L\u0215\u0001\u0000"+
		"\u0000\u0000N\u021d\u0001\u0000\u0000\u0000P\u0224\u0001\u0000\u0000\u0000"+
		"R\u022c\u0001\u0000\u0000\u0000T\u023a\u0001\u0000\u0000\u0000V\u023d"+
		"\u0001\u0000\u0000\u0000X\\\u0003\u001a\r\u0000Y\\\u0003:\u001d\u0000"+
		"Z\\\u0003<\u001e\u0000[X\u0001\u0000\u0000\u0000[Y\u0001\u0000\u0000\u0000"+
		"[Z\u0001\u0000\u0000\u0000\\_\u0001\u0000\u0000\u0000][\u0001\u0000\u0000"+
		"\u0000]^\u0001\u0000\u0000\u0000^`\u0001\u0000\u0000\u0000_]\u0001\u0000"+
		"\u0000\u0000`a\u0005\u0000\u0000\u0001a\u0001\u0001\u0000\u0000\u0000"+
		"bk\u0005X\u0000\u0000ck\u0005W\u0000\u0000dk\u0005V\u0000\u0000ek\u0005"+
		"U\u0000\u0000fk\u0005Y\u0000\u0000gk\u0005T\u0000\u0000hk\u0003\u0006"+
		"\u0003\u0000ik\u0003\b\u0004\u0000jb\u0001\u0000\u0000\u0000jc\u0001\u0000"+
		"\u0000\u0000jd\u0001\u0000\u0000\u0000je\u0001\u0000\u0000\u0000jf\u0001"+
		"\u0000\u0000\u0000jg\u0001\u0000\u0000\u0000jh\u0001\u0000\u0000\u0000"+
		"ji\u0001\u0000\u0000\u0000k\u0003\u0001\u0000\u0000\u0000lq\u0003\u0002"+
		"\u0001\u0000mn\u0005\u0003\u0000\u0000np\u0003\u0002\u0001\u0000om\u0001"+
		"\u0000\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000"+
		"qr\u0001\u0000\u0000\u0000r\u0005\u0001\u0000\u0000\u0000sq\u0001\u0000"+
		"\u0000\u0000tu\u0007\u0000\u0000\u0000u\u0007\u0001\u0000\u0000\u0000"+
		"vw\u0007\u0001\u0000\u0000w\t\u0001\u0000\u0000\u0000xy\u0006\u0005\uffff"+
		"\uffff\u0000yz\u0005\u0013\u0000\u0000z{\u0003\n\u0005\u0000{|\u0005\u0014"+
		"\u0000\u0000|\u0081\u0001\u0000\u0000\u0000}~\u0005?\u0000\u0000~\u0081"+
		"\u0003\n\u0005\u000f\u007f\u0081\u0003\u0002\u0001\u0000\u0080x\u0001"+
		"\u0000\u0000\u0000\u0080}\u0001\u0000\u0000\u0000\u0080\u007f\u0001\u0000"+
		"\u0000\u0000\u0081\u00ab\u0001\u0000\u0000\u0000\u0082\u0083\n\u000e\u0000"+
		"\u0000\u0083\u0084\u0005\t\u0000\u0000\u0084\u00aa\u0003\n\u0005\u000f"+
		"\u0085\u0086\n\r\u0000\u0000\u0086\u0087\u0005\u0007\u0000\u0000\u0087"+
		"\u00aa\u0003\n\u0005\u000e\u0088\u0089\n\f\u0000\u0000\u0089\u008a\u0005"+
		"\b\u0000\u0000\u008a\u00aa\u0003\n\u0005\r\u008b\u008c\n\u000b\u0000\u0000"+
		"\u008c\u008d\u0005\u0005\u0000\u0000\u008d\u00aa\u0003\n\u0005\f\u008e"+
		"\u008f\n\n\u0000\u0000\u008f\u0090\u0005\u0006\u0000\u0000\u0090\u00aa"+
		"\u0003\n\u0005\u000b\u0091\u0092\n\t\u0000\u0000\u0092\u0093\u0005\n\u0000"+
		"\u0000\u0093\u00aa\u0003\n\u0005\n\u0094\u0095\n\b\u0000\u0000\u0095\u0096"+
		"\u0005\u000b\u0000\u0000\u0096\u00aa\u0003\n\u0005\t\u0097\u0098\n\u0007"+
		"\u0000\u0000\u0098\u0099\u0005\f\u0000\u0000\u0099\u00aa\u0003\n\u0005"+
		"\b\u009a\u009b\n\u0006\u0000\u0000\u009b\u009c\u0005\r\u0000\u0000\u009c"+
		"\u00aa\u0003\n\u0005\u0007\u009d\u009e\n\u0005\u0000\u0000\u009e\u009f"+
		"\u0005\u000e\u0000\u0000\u009f\u00aa\u0003\n\u0005\u0006\u00a0\u00a1\n"+
		"\u0004\u0000\u0000\u00a1\u00a2\u0005\u000f\u0000\u0000\u00a2\u00aa\u0003"+
		"\n\u0005\u0005\u00a3\u00a4\n\u0003\u0000\u0000\u00a4\u00a5\u0005>\u0000"+
		"\u0000\u00a5\u00aa\u0003\n\u0005\u0004\u00a6\u00a7\n\u0002\u0000\u0000"+
		"\u00a7\u00a8\u0005=\u0000\u0000\u00a8\u00aa\u0003\n\u0005\u0003\u00a9"+
		"\u0082\u0001\u0000\u0000\u0000\u00a9\u0085\u0001\u0000\u0000\u0000\u00a9"+
		"\u0088\u0001\u0000\u0000\u0000\u00a9\u008b\u0001\u0000\u0000\u0000\u00a9"+
		"\u008e\u0001\u0000\u0000\u0000\u00a9\u0091\u0001\u0000\u0000\u0000\u00a9"+
		"\u0094\u0001\u0000\u0000\u0000\u00a9\u0097\u0001\u0000\u0000\u0000\u00a9"+
		"\u009a\u0001\u0000\u0000\u0000\u00a9\u009d\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a0\u0001\u0000\u0000\u0000\u00a9\u00a3\u0001\u0000\u0000\u0000\u00a9"+
		"\u00a6\u0001\u0000\u0000\u0000\u00aa\u00ad\u0001\u0000\u0000\u0000\u00ab"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ab\u00ac\u0001\u0000\u0000\u0000\u00ac"+
		"\u000b\u0001\u0000\u0000\u0000\u00ad\u00ab\u0001\u0000\u0000\u0000\u00ae"+
		"\u00af\u0005\u0017\u0000\u0000\u00af\u00b0\u0003\u000e\u0007\u0000\u00b0"+
		"\r\u0001\u0000\u0000\u0000\u00b1\u00b4\u0003\u0010\b\u0000\u00b2\u00b4"+
		"\u0003\u0012\t\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000\u00b3\u00b2\u0001"+
		"\u0000\u0000\u0000\u00b4\u00b5\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u000f\u0001"+
		"\u0000\u0000\u0000\u00b7\u00b8\u0005T\u0000\u0000\u00b8\u00b9\u0003\u0014"+
		"\n\u0000\u00b9\u00ba\u0005\u0001\u0000\u0000\u00ba\u00c2\u0001\u0000\u0000"+
		"\u0000\u00bb\u00bc\u0005T\u0000\u0000\u00bc\u00bd\u0003\u0014\n\u0000"+
		"\u00bd\u00be\u0005\u0002\u0000\u0000\u00be\u00bf\u0003\n\u0005\u0000\u00bf"+
		"\u00c0\u0005\u0001\u0000\u0000\u00c0\u00c2\u0001\u0000\u0000\u0000\u00c1"+
		"\u00b7\u0001\u0000\u0000\u0000\u00c1\u00bb\u0001\u0000\u0000\u0000\u00c2"+
		"\u0011\u0001\u0000\u0000\u0000\u00c3\u00c4\u0005T\u0000\u0000\u00c4\u00c5"+
		"\u0003\u0018\f\u0000\u00c5\u00c6\u0005\u0001\u0000\u0000\u00c6\u00d1\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c8\u0005T\u0000\u0000\u00c8\u00c9\u0003\u0018"+
		"\f\u0000\u00c9\u00ca\u0005\u0002\u0000\u0000\u00ca\u00cb\u0005\u0016\u0000"+
		"\u0000\u00cb\u00cc\u0005\u0011\u0000\u0000\u00cc\u00cd\u0003\u0004\u0002"+
		"\u0000\u00cd\u00ce\u0005\u0012\u0000\u0000\u00ce\u00cf\u0005\u0001\u0000"+
		"\u0000\u00cf\u00d1\u0001\u0000\u0000\u0000\u00d0\u00c3\u0001\u0000\u0000"+
		"\u0000\u00d0\u00c7\u0001\u0000\u0000\u0000\u00d1\u0013\u0001\u0000\u0000"+
		"\u0000\u00d2\u00d5\u0003\u0016\u000b\u0000\u00d3\u00d5\u0003\u0018\f\u0000"+
		"\u00d4\u00d2\u0001\u0000\u0000\u0000\u00d4\u00d3\u0001\u0000\u0000\u0000"+
		"\u00d5\u0015\u0001\u0000\u0000\u0000\u00d6\u00e0\u0005\u0018\u0000\u0000"+
		"\u00d7\u00e0\u0005\u0019\u0000\u0000\u00d8\u00e0\u0005\u001a\u0000\u0000"+
		"\u00d9\u00e0\u0005\u001b\u0000\u0000\u00da\u00e0\u0005\u001c\u0000\u0000"+
		"\u00db\u00dc\u0005\u001d\u0000\u0000\u00dc\u00dd\u0005\u0013\u0000\u0000"+
		"\u00dd\u00de\u0005V\u0000\u0000\u00de\u00e0\u0005\u0014\u0000\u0000\u00df"+
		"\u00d6\u0001\u0000\u0000\u0000\u00df\u00d7\u0001\u0000\u0000\u0000\u00df"+
		"\u00d8\u0001\u0000\u0000\u0000\u00df\u00d9\u0001\u0000\u0000\u0000\u00df"+
		"\u00da\u0001\u0000\u0000\u0000\u00df\u00db\u0001\u0000\u0000\u0000\u00e0"+
		"\u0017\u0001\u0000\u0000\u0000\u00e1\u00e2\u0003\u0016\u000b\u0000\u00e2"+
		"\u00e3\u0005\u0011\u0000\u0000\u00e3\u00e4\u0005\u0012\u0000\u0000\u00e4"+
		"\u0019\u0001\u0000\u0000\u0000\u00e5\u00e7\u0003\f\u0006\u0000\u00e6\u00e5"+
		"\u0001\u0000\u0000\u0000\u00e6\u00e7\u0001\u0000\u0000\u0000\u00e7\u00e8"+
		"\u0001\u0000\u0000\u0000\u00e8\u00ec\u0005 \u0000\u0000\u00e9\u00eb\u0003"+
		"\u001c\u000e\u0000\u00ea\u00e9\u0001\u0000\u0000\u0000\u00eb\u00ee\u0001"+
		"\u0000\u0000\u0000\u00ec\u00ea\u0001\u0000\u0000\u0000\u00ec\u00ed\u0001"+
		"\u0000\u0000\u0000\u00ed\u00ef\u0001\u0000\u0000\u0000\u00ee\u00ec\u0001"+
		"\u0000\u0000\u0000\u00ef\u00f0\u0005!\u0000\u0000\u00f0\u00f1\u0005\u0001"+
		"\u0000\u0000\u00f1\u001b\u0001\u0000\u0000\u0000\u00f2\u010a\u0003\f\u0006"+
		"\u0000\u00f3\u010a\u0003\u001e\u000f\u0000\u00f4\u010a\u0003 \u0010\u0000"+
		"\u00f5\u010a\u0003\"\u0011\u0000\u00f6\u010a\u0003$\u0012\u0000\u00f7"+
		"\u010a\u0003&\u0013\u0000\u00f8\u010a\u0003(\u0014\u0000\u00f9\u010a\u0003"+
		"*\u0015\u0000\u00fa\u010a\u0003,\u0016\u0000\u00fb\u010a\u0003.\u0017"+
		"\u0000\u00fc\u010a\u00030\u0018\u0000\u00fd\u010a\u00032\u0019\u0000\u00fe"+
		"\u010a\u00034\u001a\u0000\u00ff\u010a\u00036\u001b\u0000\u0100\u010a\u0003"+
		"8\u001c\u0000\u0101\u010a\u0003:\u001d\u0000\u0102\u010a\u0003<\u001e"+
		"\u0000\u0103\u010a\u0003\u001a\r\u0000\u0104\u010a\u0003H$\u0000\u0105"+
		"\u010a\u0003B!\u0000\u0106\u010a\u0003D\"\u0000\u0107\u010a\u0003F#\u0000"+
		"\u0108\u010a\u0003R)\u0000\u0109\u00f2\u0001\u0000\u0000\u0000\u0109\u00f3"+
		"\u0001\u0000\u0000\u0000\u0109\u00f4\u0001\u0000\u0000\u0000\u0109\u00f5"+
		"\u0001\u0000\u0000\u0000\u0109\u00f6\u0001\u0000\u0000\u0000\u0109\u00f7"+
		"\u0001\u0000\u0000\u0000\u0109\u00f8\u0001\u0000\u0000\u0000\u0109\u00f9"+
		"\u0001\u0000\u0000\u0000\u0109\u00fa\u0001\u0000\u0000\u0000\u0109\u00fb"+
		"\u0001\u0000\u0000\u0000\u0109\u00fc\u0001\u0000\u0000\u0000\u0109\u00fd"+
		"\u0001\u0000\u0000\u0000\u0109\u00fe\u0001\u0000\u0000\u0000\u0109\u00ff"+
		"\u0001\u0000\u0000\u0000\u0109\u0100\u0001\u0000\u0000\u0000\u0109\u0101"+
		"\u0001\u0000\u0000\u0000\u0109\u0102\u0001\u0000\u0000\u0000\u0109\u0103"+
		"\u0001\u0000\u0000\u0000\u0109\u0104\u0001\u0000\u0000\u0000\u0109\u0105"+
		"\u0001\u0000\u0000\u0000\u0109\u0106\u0001\u0000\u0000\u0000\u0109\u0107"+
		"\u0001\u0000\u0000\u0000\u0109\u0108\u0001\u0000\u0000\u0000\u010a\u001d"+
		"\u0001\u0000\u0000\u0000\u010b\u010c\u0005\"\u0000\u0000\u010c\u010d\u0003"+
		"\n\u0005\u0000\u010d\u0111\u0005#\u0000\u0000\u010e\u0110\u0003\u001c"+
		"\u000e\u0000\u010f\u010e\u0001\u0000\u0000\u0000\u0110\u0113\u0001\u0000"+
		"\u0000\u0000\u0111\u010f\u0001\u0000\u0000\u0000\u0111\u0112\u0001\u0000"+
		"\u0000\u0000\u0112\u0114\u0001\u0000\u0000\u0000\u0113\u0111\u0001\u0000"+
		"\u0000\u0000\u0114\u0115\u0005%\u0000\u0000\u0115\u0116\u0005\u0001\u0000"+
		"\u0000\u0116\u001f\u0001\u0000\u0000\u0000\u0117\u0118\u0005\"\u0000\u0000"+
		"\u0118\u0119\u0003\n\u0005\u0000\u0119\u011d\u0005#\u0000\u0000\u011a"+
		"\u011c\u0003\u001c\u000e\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c"+
		"\u011f\u0001\u0000\u0000\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011d"+
		"\u011e\u0001\u0000\u0000\u0000\u011e\u0120\u0001\u0000\u0000\u0000\u011f"+
		"\u011d\u0001\u0000\u0000\u0000\u0120\u0124\u0005$\u0000\u0000\u0121\u0123"+
		"\u0003\u001c\u000e\u0000\u0122\u0121\u0001\u0000\u0000\u0000\u0123\u0126"+
		"\u0001\u0000\u0000\u0000\u0124\u0122\u0001\u0000\u0000\u0000\u0124\u0125"+
		"\u0001\u0000\u0000\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u0124"+
		"\u0001\u0000\u0000\u0000\u0127\u0128\u0005%\u0000\u0000\u0128\u0129\u0005"+
		"\u0001\u0000\u0000\u0129!\u0001\u0000\u0000\u0000\u012a\u0133\u0005&\u0000"+
		"\u0000\u012b\u012c\u0005\'\u0000\u0000\u012c\u012d\u0003\n\u0005\u0000"+
		"\u012d\u012f\u0005#\u0000\u0000\u012e\u0130\u0003\u001c\u000e\u0000\u012f"+
		"\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001\u0000\u0000\u0000\u0131"+
		"\u012f\u0001\u0000\u0000\u0000\u0131\u0132\u0001\u0000\u0000\u0000\u0132"+
		"\u0134\u0001\u0000\u0000\u0000\u0133\u012b\u0001\u0000\u0000\u0000\u0134"+
		"\u0135\u0001\u0000\u0000\u0000\u0135\u0133\u0001\u0000\u0000\u0000\u0135"+
		"\u0136\u0001\u0000\u0000\u0000\u0136\u013d\u0001\u0000\u0000\u0000\u0137"+
		"\u0139\u0005$\u0000\u0000\u0138\u013a\u0003\u001c\u000e\u0000\u0139\u0138"+
		"\u0001\u0000\u0000\u0000\u013a\u013b\u0001\u0000\u0000\u0000\u013b\u0139"+
		"\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000\u0000\u013c\u013e"+
		"\u0001\u0000\u0000\u0000\u013d\u0137\u0001\u0000\u0000\u0000\u013d\u013e"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0140"+
		"\u0005(\u0000\u0000\u0140\u0141\u0005\u0001\u0000\u0000\u0141#\u0001\u0000"+
		"\u0000\u0000\u0142\u0143\u0005)\u0000\u0000\u0143\u0144\u0005T\u0000\u0000"+
		"\u0144\u0145\u0005*\u0000\u0000\u0145\u0146\u0005V\u0000\u0000\u0146\u0147"+
		"\u0005\u0010\u0000\u0000\u0147\u0148\u0005V\u0000\u0000\u0148\u014c\u0005"+
		"+\u0000\u0000\u0149\u014b\u0003\u001c\u000e\u0000\u014a\u0149\u0001\u0000"+
		"\u0000\u0000\u014b\u014e\u0001\u0000\u0000\u0000\u014c\u014a\u0001\u0000"+
		"\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d\u014f\u0001\u0000"+
		"\u0000\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014f\u0150\u0005,\u0000"+
		"\u0000\u0150\u0151\u0005\u0001\u0000\u0000\u0151%\u0001\u0000\u0000\u0000"+
		"\u0152\u0153\u0005;\u0000\u0000\u0153\u0154\u0005T\u0000\u0000\u0154\u0155"+
		"\u0005*\u0000\u0000\u0155\u0156\u0005\u0016\u0000\u0000\u0156\u0157\u0005"+
		"T\u0000\u0000\u0157\u015b\u0005+\u0000\u0000\u0158\u015a\u0003\u001c\u000e"+
		"\u0000\u0159\u0158\u0001\u0000\u0000\u0000\u015a\u015d\u0001\u0000\u0000"+
		"\u0000\u015b\u0159\u0001\u0000\u0000\u0000\u015b\u015c\u0001\u0000\u0000"+
		"\u0000\u015c\u015e\u0001\u0000\u0000\u0000\u015d\u015b\u0001\u0000\u0000"+
		"\u0000\u015e\u015f\u0005,\u0000\u0000\u015f\u0160\u0005\u0001\u0000\u0000"+
		"\u0160\'\u0001\u0000\u0000\u0000\u0161\u0162\u0005;\u0000\u0000\u0162"+
		"\u0163\u0005T\u0000\u0000\u0163\u0164\u0005*\u0000\u0000\u0164\u0165\u0003"+
		"H$\u0000\u0165\u0169\u0005+\u0000\u0000\u0166\u0168\u0003\u001c\u000e"+
		"\u0000\u0167\u0166\u0001\u0000\u0000\u0000\u0168\u016b\u0001\u0000\u0000"+
		"\u0000\u0169\u0167\u0001\u0000\u0000\u0000\u0169\u016a\u0001\u0000\u0000"+
		"\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000\u0000"+
		"\u0000\u016c\u016d\u0005,\u0000\u0000\u016d\u016e\u0005\u0001\u0000\u0000"+
		"\u016e)\u0001\u0000\u0000\u0000\u016f\u0170\u0005-\u0000\u0000\u0170\u0171"+
		"\u0005\u0001\u0000\u0000\u0171+\u0001\u0000\u0000\u0000\u0172\u0173\u0005"+
		".\u0000\u0000\u0173\u0174\u0005\u0001\u0000\u0000\u0174-\u0001\u0000\u0000"+
		"\u0000\u0175\u0176\u00050\u0000\u0000\u0176\u017b\u0005X\u0000\u0000\u0177"+
		"\u0178\u0005\u0003\u0000\u0000\u0178\u017a\u0003\u0002\u0001\u0000\u0179"+
		"\u0177\u0001\u0000\u0000\u0000\u017a\u017d\u0001\u0000\u0000\u0000\u017b"+
		"\u0179\u0001\u0000\u0000\u0000\u017b\u017c\u0001\u0000\u0000\u0000\u017c"+
		"\u017e\u0001\u0000\u0000\u0000\u017d\u017b\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0005\u0001\u0000\u0000\u017f/\u0001\u0000\u0000\u0000\u0180\u0181"+
		"\u00051\u0000\u0000\u0181\u0186\u0005X\u0000\u0000\u0182\u0183\u0005\u0003"+
		"\u0000\u0000\u0183\u0185\u0003\u0002\u0001\u0000\u0184\u0182\u0001\u0000"+
		"\u0000\u0000\u0185\u0188\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000"+
		"\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0189\u0001\u0000"+
		"\u0000\u0000\u0188\u0186\u0001\u0000\u0000\u0000\u0189\u018a\u0005\u0001"+
		"\u0000\u0000\u018a1\u0001\u0000\u0000\u0000\u018b\u018c\u00052\u0000\u0000"+
		"\u018c\u0191\u0005X\u0000\u0000\u018d\u018e\u0005\u0003\u0000\u0000\u018e"+
		"\u0190\u0003\u0002\u0001\u0000\u018f\u018d\u0001\u0000\u0000\u0000\u0190"+
		"\u0193\u0001\u0000\u0000\u0000\u0191\u018f\u0001\u0000\u0000\u0000\u0191"+
		"\u0192\u0001\u0000\u0000\u0000\u0192\u0194\u0001\u0000\u0000\u0000\u0193"+
		"\u0191\u0001\u0000\u0000\u0000\u0194\u0195\u0005\u0001\u0000\u0000\u0195"+
		"3\u0001\u0000\u0000\u0000\u0196\u0197\u0005/\u0000\u0000\u0197\u0198\u0005"+
		"\u0001\u0000\u0000\u01985\u0001\u0000\u0000\u0000\u0199\u019d\u0005 \u0000"+
		"\u0000\u019a\u019c\u0003\u001c\u000e\u0000\u019b\u019a\u0001\u0000\u0000"+
		"\u0000\u019c\u019f\u0001\u0000\u0000\u0000\u019d\u019b\u0001\u0000\u0000"+
		"\u0000\u019d\u019e\u0001\u0000\u0000\u0000\u019e\u01a0\u0001\u0000\u0000"+
		"\u0000\u019f\u019d\u0001\u0000\u0000\u0000\u01a0\u01a1\u00053\u0000\u0000"+
		"\u01a1\u01a2\u0005\u0001\u0000\u0000\u01a27\u0001\u0000\u0000\u0000\u01a3"+
		"\u01a7\u0005 \u0000\u0000\u01a4\u01a6\u0003\u001c\u000e\u0000\u01a5\u01a4"+
		"\u0001\u0000\u0000\u0000\u01a6\u01a9\u0001\u0000\u0000\u0000\u01a7\u01a5"+
		"\u0001\u0000\u0000\u0000\u01a7\u01a8\u0001\u0000\u0000\u0000\u01a8\u01aa"+
		"\u0001\u0000\u0000\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01aa\u01ab"+
		"\u00054\u0000\u0000\u01ab\u01ac\u0005\u0001\u0000\u0000\u01ac9\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ae\u00055\u0000\u0000\u01ae\u01af\u0005T\u0000\u0000"+
		"\u01af\u01b1\u0005\u0013\u0000\u0000\u01b0\u01b2\u0003>\u001f\u0000\u01b1"+
		"\u01b0\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000\u0000\u01b2"+
		"\u01b3\u0001\u0000\u0000\u0000\u01b3\u01b4\u0005\u0014\u0000\u0000\u01b4"+
		"\u01b5\u00057\u0000\u0000\u01b5\u01b6\u0003\u0014\n\u0000\u01b6\u01b7"+
		"\u00058\u0000\u0000\u01b7\u01bb\u0005\u0015\u0000\u0000\u01b8\u01ba\u0003"+
		"\u001c\u000e\u0000\u01b9\u01b8\u0001\u0000\u0000\u0000\u01ba\u01bd\u0001"+
		"\u0000\u0000\u0000\u01bb\u01b9\u0001\u0000\u0000\u0000\u01bb\u01bc\u0001"+
		"\u0000\u0000\u0000\u01bc\u01be\u0001\u0000\u0000\u0000\u01bd\u01bb\u0001"+
		"\u0000\u0000\u0000\u01be\u01bf\u0005<\u0000\u0000\u01bf\u01c0\u0003\u0002"+
		"\u0001\u0000\u01c0\u01c1\u0005\u0001\u0000\u0000\u01c1\u01c2\u0005\u0015"+
		"\u0000\u0000\u01c2\u01c3\u00059\u0000\u0000\u01c3\u01c4\u0005:\u0000\u0000"+
		"\u01c4\u01c5\u0005\u0001\u0000\u0000\u01c5;\u0001\u0000\u0000\u0000\u01c6"+
		"\u01c7\u00056\u0000\u0000\u01c7\u01c8\u0005T\u0000\u0000\u01c8\u01ca\u0005"+
		"\u0013\u0000\u0000\u01c9\u01cb\u0003>\u001f\u0000\u01ca\u01c9\u0001\u0000"+
		"\u0000\u0000\u01ca\u01cb\u0001\u0000\u0000\u0000\u01cb\u01cc\u0001\u0000"+
		"\u0000\u0000\u01cc\u01cd\u0005\u0014\u0000\u0000\u01cd\u01ce\u00059\u0000"+
		"\u0000\u01ce\u01cf\u0005:\u0000\u0000\u01cf\u01d0\u00058\u0000\u0000\u01d0"+
		"\u01d4\u0005\u0015\u0000\u0000\u01d1\u01d3\u0003\u001c\u000e\u0000\u01d2"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d7\u0001\u0000\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0005\u0015\u0000\u0000\u01d8\u01d9\u0005\u0001\u0000\u0000\u01d9"+
		"=\u0001\u0000\u0000\u0000\u01da\u01df\u0003@ \u0000\u01db\u01dc\u0005"+
		"\u0003\u0000\u0000\u01dc\u01de\u0003@ \u0000\u01dd\u01db\u0001\u0000\u0000"+
		"\u0000\u01de\u01e1\u0001\u0000\u0000\u0000\u01df\u01dd\u0001\u0000\u0000"+
		"\u0000\u01df\u01e0\u0001\u0000\u0000\u0000\u01e0?\u0001\u0000\u0000\u0000"+
		"\u01e1\u01df\u0001\u0000\u0000\u0000\u01e2\u01e3\u0005T\u0000\u0000\u01e3"+
		"\u01e4\u0003\u0014\n\u0000\u01e4A\u0001\u0000\u0000\u0000\u01e5\u01e6"+
		"\u0005@\u0000\u0000\u01e6\u01e7\u0005A\u0000\u0000\u01e7\u01e8\u0005T"+
		"\u0000\u0000\u01e8\u01e9\u0005\u0013\u0000\u0000\u01e9\u01ea\u0003J%\u0000"+
		"\u01ea\u01eb\u0005\u0014\u0000\u0000\u01eb\u01ec\u0005B\u0000\u0000\u01ec"+
		"\u01ed\u0005\u0013\u0000\u0000\u01ed\u01ee\u0003\u0004\u0002\u0000\u01ee"+
		"\u01ef\u0005\u0014\u0000\u0000\u01ef\u01f0\u0005\u0001\u0000\u0000\u01f0"+
		"C\u0001\u0000\u0000\u0000\u01f1\u01f2\u0005C\u0000\u0000\u01f2\u01f3\u0005"+
		"T\u0000\u0000\u01f3\u01f4\u0005D\u0000\u0000\u01f4\u01f5\u0003R)\u0000"+
		"\u01f5\u01f6\u0005E\u0000\u0000\u01f6\u01f7\u0003\n\u0005\u0000\u01f7"+
		"\u01f8\u0005\u0001\u0000\u0000\u01f8E\u0001\u0000\u0000\u0000\u01f9\u01fa"+
		"\u0005F\u0000\u0000\u01fa\u01fb\u0005G\u0000\u0000\u01fb\u01fc\u0005T"+
		"\u0000\u0000\u01fc\u01fd\u0005E\u0000\u0000\u01fd\u01fe\u0003\n\u0005"+
		"\u0000\u01fe\u01ff\u0005\u0001\u0000\u0000\u01ffG\u0001\u0000\u0000\u0000"+
		"\u0200\u0201\u0005H\u0000\u0000\u0201\u0202\u0003J%\u0000\u0202\u0203"+
		"\u0005G\u0000\u0000\u0203\u0205\u0005T\u0000\u0000\u0204\u0206\u0003N"+
		"\'\u0000\u0205\u0204\u0001\u0000\u0000\u0000\u0205\u0206\u0001\u0000\u0000"+
		"\u0000\u0206\u0208\u0001\u0000\u0000\u0000\u0207\u0209\u0003T*\u0000\u0208"+
		"\u0207\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209"+
		"\u020a\u0001\u0000\u0000\u0000\u020a\u020b\u0005\u0001\u0000\u0000\u020b"+
		"I\u0001\u0000\u0000\u0000\u020c\u0211\u0003L&\u0000\u020d\u020e\u0005"+
		"\u0003\u0000\u0000\u020e\u0210\u0003L&\u0000\u020f\u020d\u0001\u0000\u0000"+
		"\u0000\u0210\u0213\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000"+
		"\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212K\u0001\u0000\u0000\u0000"+
		"\u0213\u0211\u0001\u0000\u0000\u0000\u0214\u0216\u0005T\u0000\u0000\u0215"+
		"\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216"+
		"\u0218\u0001\u0000\u0000\u0000\u0217\u0219\u0005\u0004\u0000\u0000\u0218"+
		"\u0217\u0001\u0000\u0000\u0000\u0218\u0219\u0001\u0000\u0000\u0000\u0219"+
		"\u021a\u0001\u0000\u0000\u0000\u021a\u021b\u0005T\u0000\u0000\u021bM\u0001"+
		"\u0000\u0000\u0000\u021c\u021e\u0003P(\u0000\u021d\u021c\u0001\u0000\u0000"+
		"\u0000\u021e\u021f\u0001\u0000\u0000\u0000\u021f\u021d\u0001\u0000\u0000"+
		"\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220O\u0001\u0000\u0000\u0000"+
		"\u0221\u0225\u0005I\u0000\u0000\u0222\u0223\u0005J\u0000\u0000\u0223\u0225"+
		"\u0005I\u0000\u0000\u0224\u0221\u0001\u0000\u0000\u0000\u0224\u0222\u0001"+
		"\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000\u0000\u0226\u0227\u0005"+
		"T\u0000\u0000\u0227\u0228\u0005K\u0000\u0000\u0228\u0229\u0003L&\u0000"+
		"\u0229\u022a\u0005\u000e\u0000\u0000\u022a\u022b\u0003L&\u0000\u022bQ"+
		"\u0001\u0000\u0000\u0000\u022c\u022d\u0005T\u0000\u0000\u022d\u022e\u0005"+
		"\u0002\u0000\u0000\u022e\u0235\u0003\n\u0005\u0000\u022f\u0230\u0005\u0003"+
		"\u0000\u0000\u0230\u0231\u0005T\u0000\u0000\u0231\u0232\u0005\u0002\u0000"+
		"\u0000\u0232\u0234\u0003\n\u0005\u0000\u0233\u022f\u0001\u0000\u0000\u0000"+
		"\u0234\u0237\u0001\u0000\u0000\u0000\u0235\u0233\u0001\u0000\u0000\u0000"+
		"\u0235\u0236\u0001\u0000\u0000\u0000\u0236\u0238\u0001\u0000\u0000\u0000"+
		"\u0237\u0235\u0001\u0000\u0000\u0000\u0238\u0239\u0005\u0001\u0000\u0000"+
		"\u0239S\u0001\u0000\u0000\u0000\u023a\u023b\u0005E\u0000\u0000\u023b\u023c"+
		"\u0003\n\u0005\u0000\u023cU\u0001\u0000\u0000\u0000\u023d\u023e\u0003"+
		"\n\u0005\u0000\u023eW\u0001\u0000\u0000\u0000,[]jq\u0080\u00a9\u00ab\u00b3"+
		"\u00b5\u00c1\u00d0\u00d4\u00df\u00e6\u00ec\u0109\u0111\u011d\u0124\u0131"+
		"\u0135\u013b\u013d\u014c\u015b\u0169\u017b\u0186\u0191\u019d\u01a7\u01b1"+
		"\u01bb\u01ca\u01d4\u01df\u0205\u0208\u0211\u0215\u0218\u021f\u0224\u0235";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}