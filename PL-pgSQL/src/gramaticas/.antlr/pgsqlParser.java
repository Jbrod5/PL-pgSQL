// Generated from /home/jorge/Compi_2/PL-pgSQL/PL-pgSQL/src/gramaticas/pgsql.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class pgsqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

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
		RULE_func_builtin = 4, RULE_expresion = 5, RULE_expresion_booleana = 6, 
		RULE_comparador = 7, RULE_expresion_aritmetica = 8, RULE_declaracion = 9, 
		RULE_declaraciones = 10, RULE_declaracion_normal = 11, RULE_declaracion_array = 12, 
		RULE_tipo = 13, RULE_tipo_base = 14, RULE_tipo_array = 15, RULE_bloque = 16, 
		RULE_sentencia_en_bloque_ciclo = 17, RULE_sentencias_transaccionales = 18, 
		RULE_sentencia_en_bloque_procedimiento = 19, RULE_sentencia_en_bloque_funcion = 20, 
		RULE_sentencia_en_bloque = 21, RULE_if_simple = 22, RULE_if_else = 23, 
		RULE_case_when = 24, RULE_ciclo_for = 25, RULE_ciclo_foreach_array = 26, 
		RULE_ciclo_foreach_select = 27, RULE_exit_stmt = 28, RULE_continue_stmt = 29, 
		RULE_raise_notice = 30, RULE_raise_warning = 31, RULE_raise_exception = 32, 
		RULE_raise_simple = 33, RULE_funcion = 34, RULE_procedimiento = 35, RULE_parametros = 36, 
		RULE_parametro = 37, RULE_asignaciones_igual = 38, RULE_insert_stmt = 39, 
		RULE_update_stmt = 40, RULE_delete_stmt = 41, RULE_select_stmt = 42, RULE_columnas = 43, 
		RULE_columna_prefijo = 44, RULE_join_list = 45, RULE_join_clause = 46, 
		RULE_asignaciones = 47, RULE_where_clause = 48, RULE_condicion = 49;
	private static String[] makeRuleNames() {
		return new String[] {
			"programa", "valor", "valores", "booleano", "func_builtin", "expresion", 
			"expresion_booleana", "comparador", "expresion_aritmetica", "declaracion", 
			"declaraciones", "declaracion_normal", "declaracion_array", "tipo", "tipo_base", 
			"tipo_array", "bloque", "sentencia_en_bloque_ciclo", "sentencias_transaccionales", 
			"sentencia_en_bloque_procedimiento", "sentencia_en_bloque_funcion", "sentencia_en_bloque", 
			"if_simple", "if_else", "case_when", "ciclo_for", "ciclo_foreach_array", 
			"ciclo_foreach_select", "exit_stmt", "continue_stmt", "raise_notice", 
			"raise_warning", "raise_exception", "raise_simple", "funcion", "procedimiento", 
			"parametros", "parametro", "asignaciones_igual", "insert_stmt", "update_stmt", 
			"delete_stmt", "select_stmt", "columnas", "columna_prefijo", "join_list", 
			"join_clause", "asignaciones", "where_clause", "condicion"
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
	}

	public final ProgramaContext programa() throws RecognitionException {
		ProgramaContext _localctx = new ProgramaContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_programa);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 27021602067578880L) != 0)) {
				{
				setState(103);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case DECLARE:
				case BEGIN:
					{
					setState(100);
					bloque();
					}
					break;
				case CREATE_FUNCTION:
					{
					setState(101);
					funcion();
					}
					break;
				case CREATE_PROCEDURE:
					{
					setState(102);
					procedimiento();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(107);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(108);
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
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(pgsqlParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(pgsqlParser.IDENTIFICADOR, i);
		}
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public Func_builtinContext func_builtin() {
			return getRuleContext(Func_builtinContext.class,0);
		}
		public TerminalNode DOT() { return getToken(pgsqlParser.DOT, 0); }
		public ValorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valor; }
	}

	public final ValorContext valor() throws RecognitionException {
		ValorContext _localctx = new ValorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_valor);
		try {
			setState(121);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(110);
				match(VARCHAR_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(111);
				match(CHAR_LITERAL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(112);
				match(NUMERO);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(113);
				match(NUMERO_DECIMAL);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(114);
				match(FECHA);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(115);
				match(IDENTIFICADOR);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(116);
				booleano();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(117);
				func_builtin();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(118);
				match(IDENTIFICADOR);
				setState(119);
				match(DOT);
				setState(120);
				match(IDENTIFICADOR);
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
	}

	public final ValoresContext valores() throws RecognitionException {
		ValoresContext _localctx = new ValoresContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_valores);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			valor();
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(124);
				match(COMA);
				setState(125);
				valor();
				}
				}
				setState(130);
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
	}

	public final BooleanoContext booleano() throws RecognitionException {
		BooleanoContext _localctx = new BooleanoContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_booleano);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
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
		public TerminalNode LPAR() { return getToken(pgsqlParser.LPAR, 0); }
		public ValoresContext valores() {
			return getRuleContext(ValoresContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(pgsqlParser.RPAR, 0); }
		public TerminalNode MODIFY_DATE_FUNC() { return getToken(pgsqlParser.MODIFY_DATE_FUNC, 0); }
		public TerminalNode CAST_FUNC() { return getToken(pgsqlParser.CAST_FUNC, 0); }
		public TerminalNode SUBSTRING_FUNC() { return getToken(pgsqlParser.SUBSTRING_FUNC, 0); }
		public TerminalNode ARRAY_PUSH_FUNC() { return getToken(pgsqlParser.ARRAY_PUSH_FUNC, 0); }
		public TerminalNode LEN_FUNC() { return getToken(pgsqlParser.LEN_FUNC, 0); }
		public Func_builtinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_func_builtin; }
	}

	public final Func_builtinContext func_builtin() throws RecognitionException {
		Func_builtinContext _localctx = new Func_builtinContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_func_builtin);
		try {
			setState(145);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NOW_FUNC:
				enterOuterAlt(_localctx, 1);
				{
				setState(133);
				match(NOW_FUNC);
				}
				break;
			case RANDOM_FUNC:
				enterOuterAlt(_localctx, 2);
				{
				setState(134);
				match(RANDOM_FUNC);
				}
				break;
			case CONCAT_FUNC:
				enterOuterAlt(_localctx, 3);
				{
				setState(135);
				match(CONCAT_FUNC);
				setState(136);
				match(LPAR);
				setState(137);
				valores();
				setState(138);
				match(RPAR);
				}
				break;
			case MODIFY_DATE_FUNC:
				enterOuterAlt(_localctx, 4);
				{
				setState(140);
				match(MODIFY_DATE_FUNC);
				}
				break;
			case CAST_FUNC:
				enterOuterAlt(_localctx, 5);
				{
				setState(141);
				match(CAST_FUNC);
				}
				break;
			case SUBSTRING_FUNC:
				enterOuterAlt(_localctx, 6);
				{
				setState(142);
				match(SUBSTRING_FUNC);
				}
				break;
			case ARRAY_PUSH_FUNC:
				enterOuterAlt(_localctx, 7);
				{
				setState(143);
				match(ARRAY_PUSH_FUNC);
				}
				break;
			case LEN_FUNC:
				enterOuterAlt(_localctx, 8);
				{
				setState(144);
				match(LEN_FUNC);
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
	public static class ExpresionContext extends ParserRuleContext {
		public Expresion_booleanaContext expresion_booleana() {
			return getRuleContext(Expresion_booleanaContext.class,0);
		}
		public Expresion_aritmeticaContext expresion_aritmetica() {
			return getRuleContext(Expresion_aritmeticaContext.class,0);
		}
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion; }
	}

	public final ExpresionContext expresion() throws RecognitionException {
		ExpresionContext _localctx = new ExpresionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expresion);
		try {
			setState(150);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(147);
				expresion_booleana(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(148);
				expresion_aritmetica(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(149);
				valor();
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
	public static class Expresion_booleanaContext extends ParserRuleContext {
		public Expresion_booleanaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_booleana; }
	 
		public Expresion_booleanaContext() { }
		public void copyFrom(Expresion_booleanaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenBoolExprContext extends Expresion_booleanaContext {
		public TerminalNode LPAR() { return getToken(pgsqlParser.LPAR, 0); }
		public Expresion_booleanaContext expresion_booleana() {
			return getRuleContext(Expresion_booleanaContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(pgsqlParser.RPAR, 0); }
		public ParenBoolExprContext(Expresion_booleanaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class NotExprContext extends Expresion_booleanaContext {
		public TerminalNode NOT_KW() { return getToken(pgsqlParser.NOT_KW, 0); }
		public Expresion_booleanaContext expresion_booleana() {
			return getRuleContext(Expresion_booleanaContext.class,0);
		}
		public NotExprContext(Expresion_booleanaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class CompExprContext extends Expresion_booleanaContext {
		public List<Expresion_aritmeticaContext> expresion_aritmetica() {
			return getRuleContexts(Expresion_aritmeticaContext.class);
		}
		public Expresion_aritmeticaContext expresion_aritmetica(int i) {
			return getRuleContext(Expresion_aritmeticaContext.class,i);
		}
		public ComparadorContext comparador() {
			return getRuleContext(ComparadorContext.class,0);
		}
		public CompExprContext(Expresion_booleanaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class OrExprContext extends Expresion_booleanaContext {
		public List<Expresion_booleanaContext> expresion_booleana() {
			return getRuleContexts(Expresion_booleanaContext.class);
		}
		public Expresion_booleanaContext expresion_booleana(int i) {
			return getRuleContext(Expresion_booleanaContext.class,i);
		}
		public TerminalNode OR_KW() { return getToken(pgsqlParser.OR_KW, 0); }
		public OrExprContext(Expresion_booleanaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class BoolLiteralExprContext extends Expresion_booleanaContext {
		public BooleanoContext booleano() {
			return getRuleContext(BooleanoContext.class,0);
		}
		public BoolLiteralExprContext(Expresion_booleanaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AndExprContext extends Expresion_booleanaContext {
		public List<Expresion_booleanaContext> expresion_booleana() {
			return getRuleContexts(Expresion_booleanaContext.class);
		}
		public Expresion_booleanaContext expresion_booleana(int i) {
			return getRuleContext(Expresion_booleanaContext.class,i);
		}
		public TerminalNode AND_KW() { return getToken(pgsqlParser.AND_KW, 0); }
		public AndExprContext(Expresion_booleanaContext ctx) { copyFrom(ctx); }
	}

	public final Expresion_booleanaContext expresion_booleana() throws RecognitionException {
		return expresion_booleana(0);
	}

	private Expresion_booleanaContext expresion_booleana(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expresion_booleanaContext _localctx = new Expresion_booleanaContext(_ctx, _parentState);
		Expresion_booleanaContext _prevctx = _localctx;
		int _startState = 12;
		enterRecursionRule(_localctx, 12, RULE_expresion_booleana, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				_localctx = new ParenBoolExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(153);
				match(LPAR);
				setState(154);
				expresion_booleana(0);
				setState(155);
				match(RPAR);
				}
				break;
			case 2:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(NOT_KW);
				setState(158);
				expresion_booleana(5);
				}
				break;
			case 3:
				{
				_localctx = new CompExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				expresion_aritmetica(0);
				setState(160);
				comparador();
				setState(161);
				expresion_aritmetica(0);
				}
				break;
			case 4:
				{
				_localctx = new BoolLiteralExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(163);
				booleano();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(174);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(172);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new AndExprContext(new Expresion_booleanaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_booleana);
						setState(166);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(167);
						match(AND_KW);
						setState(168);
						expresion_booleana(5);
						}
						break;
					case 2:
						{
						_localctx = new OrExprContext(new Expresion_booleanaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_booleana);
						setState(169);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(170);
						match(OR_KW);
						setState(171);
						expresion_booleana(4);
						}
						break;
					}
					} 
				}
				setState(176);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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
	public static class ComparadorContext extends ParserRuleContext {
		public TerminalNode IGUAL() { return getToken(pgsqlParser.IGUAL, 0); }
		public TerminalNode DIFERENTE() { return getToken(pgsqlParser.DIFERENTE, 0); }
		public TerminalNode MAYOR() { return getToken(pgsqlParser.MAYOR, 0); }
		public TerminalNode MENOR() { return getToken(pgsqlParser.MENOR, 0); }
		public TerminalNode MAYOR_IGUAL() { return getToken(pgsqlParser.MAYOR_IGUAL, 0); }
		public TerminalNode MENOR_IGUAL() { return getToken(pgsqlParser.MENOR_IGUAL, 0); }
		public ComparadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparador; }
	}

	public final ComparadorContext comparador() throws RecognitionException {
		ComparadorContext _localctx = new ComparadorContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_comparador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 64512L) != 0)) ) {
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
	public static class Expresion_aritmeticaContext extends ParserRuleContext {
		public Expresion_aritmeticaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresion_aritmetica; }
	 
		public Expresion_aritmeticaContext() { }
		public void copyFrom(Expresion_aritmeticaContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ParenArithExprContext extends Expresion_aritmeticaContext {
		public TerminalNode LPAR() { return getToken(pgsqlParser.LPAR, 0); }
		public Expresion_aritmeticaContext expresion_aritmetica() {
			return getRuleContext(Expresion_aritmeticaContext.class,0);
		}
		public TerminalNode RPAR() { return getToken(pgsqlParser.RPAR, 0); }
		public ParenArithExprContext(Expresion_aritmeticaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class AddExprContext extends Expresion_aritmeticaContext {
		public List<Expresion_aritmeticaContext> expresion_aritmetica() {
			return getRuleContexts(Expresion_aritmeticaContext.class);
		}
		public Expresion_aritmeticaContext expresion_aritmetica(int i) {
			return getRuleContext(Expresion_aritmeticaContext.class,i);
		}
		public TerminalNode MAS() { return getToken(pgsqlParser.MAS, 0); }
		public AddExprContext(Expresion_aritmeticaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class MulExprContext extends Expresion_aritmeticaContext {
		public List<Expresion_aritmeticaContext> expresion_aritmetica() {
			return getRuleContexts(Expresion_aritmeticaContext.class);
		}
		public Expresion_aritmeticaContext expresion_aritmetica(int i) {
			return getRuleContext(Expresion_aritmeticaContext.class,i);
		}
		public TerminalNode POR() { return getToken(pgsqlParser.POR, 0); }
		public MulExprContext(Expresion_aritmeticaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class DivExprContext extends Expresion_aritmeticaContext {
		public List<Expresion_aritmeticaContext> expresion_aritmetica() {
			return getRuleContexts(Expresion_aritmeticaContext.class);
		}
		public Expresion_aritmeticaContext expresion_aritmetica(int i) {
			return getRuleContext(Expresion_aritmeticaContext.class,i);
		}
		public TerminalNode DIVIDIDO() { return getToken(pgsqlParser.DIVIDIDO, 0); }
		public DivExprContext(Expresion_aritmeticaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ValorArithExprContext extends Expresion_aritmeticaContext {
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public ValorArithExprContext(Expresion_aritmeticaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class PowExprContext extends Expresion_aritmeticaContext {
		public List<Expresion_aritmeticaContext> expresion_aritmetica() {
			return getRuleContexts(Expresion_aritmeticaContext.class);
		}
		public Expresion_aritmeticaContext expresion_aritmetica(int i) {
			return getRuleContext(Expresion_aritmeticaContext.class,i);
		}
		public TerminalNode ELEVADO() { return getToken(pgsqlParser.ELEVADO, 0); }
		public PowExprContext(Expresion_aritmeticaContext ctx) { copyFrom(ctx); }
	}
	@SuppressWarnings("CheckReturnValue")
	public static class SubExprContext extends Expresion_aritmeticaContext {
		public List<Expresion_aritmeticaContext> expresion_aritmetica() {
			return getRuleContexts(Expresion_aritmeticaContext.class);
		}
		public Expresion_aritmeticaContext expresion_aritmetica(int i) {
			return getRuleContext(Expresion_aritmeticaContext.class,i);
		}
		public TerminalNode MENOS() { return getToken(pgsqlParser.MENOS, 0); }
		public SubExprContext(Expresion_aritmeticaContext ctx) { copyFrom(ctx); }
	}

	public final Expresion_aritmeticaContext expresion_aritmetica() throws RecognitionException {
		return expresion_aritmetica(0);
	}

	private Expresion_aritmeticaContext expresion_aritmetica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Expresion_aritmeticaContext _localctx = new Expresion_aritmeticaContext(_ctx, _parentState);
		Expresion_aritmeticaContext _prevctx = _localctx;
		int _startState = 16;
		enterRecursionRule(_localctx, 16, RULE_expresion_aritmetica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(185);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LPAR:
				{
				_localctx = new ParenArithExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(180);
				match(LPAR);
				setState(181);
				expresion_aritmetica(0);
				setState(182);
				match(RPAR);
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
				_localctx = new ValorArithExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(184);
				valor();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(204);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,11,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(202);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new Expresion_aritmeticaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_aritmetica);
						setState(187);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(188);
						match(ELEVADO);
						setState(189);
						expresion_aritmetica(7);
						}
						break;
					case 2:
						{
						_localctx = new MulExprContext(new Expresion_aritmeticaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_aritmetica);
						setState(190);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(191);
						match(POR);
						setState(192);
						expresion_aritmetica(6);
						}
						break;
					case 3:
						{
						_localctx = new DivExprContext(new Expresion_aritmeticaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_aritmetica);
						setState(193);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(194);
						match(DIVIDIDO);
						setState(195);
						expresion_aritmetica(5);
						}
						break;
					case 4:
						{
						_localctx = new AddExprContext(new Expresion_aritmeticaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_aritmetica);
						setState(196);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(197);
						match(MAS);
						setState(198);
						expresion_aritmetica(4);
						}
						break;
					case 5:
						{
						_localctx = new SubExprContext(new Expresion_aritmeticaContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expresion_aritmetica);
						setState(199);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(200);
						match(MENOS);
						setState(201);
						expresion_aritmetica(3);
						}
						break;
					}
					} 
				}
				setState(206);
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
	}

	public final DeclaracionContext declaracion() throws RecognitionException {
		DeclaracionContext _localctx = new DeclaracionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_declaracion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(207);
			match(DECLARE);
			setState(208);
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
	}

	public final DeclaracionesContext declaraciones() throws RecognitionException {
		DeclaracionesContext _localctx = new DeclaracionesContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_declaraciones);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(212); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					setState(212);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
					case 1:
						{
						setState(210);
						declaracion_normal();
						}
						break;
					case 2:
						{
						setState(211);
						declaracion_array();
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(214); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,13,_ctx);
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
	}

	public final Declaracion_normalContext declaracion_normal() throws RecognitionException {
		Declaracion_normalContext _localctx = new Declaracion_normalContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_declaracion_normal);
		try {
			setState(226);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(216);
				match(IDENTIFICADOR);
				setState(217);
				tipo();
				setState(218);
				match(PUNTOCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(220);
				match(IDENTIFICADOR);
				setState(221);
				tipo();
				setState(222);
				match(ASIGNACION);
				setState(223);
				expresion();
				setState(224);
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
	}

	public final Declaracion_arrayContext declaracion_array() throws RecognitionException {
		Declaracion_arrayContext _localctx = new Declaracion_arrayContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_declaracion_array);
		try {
			setState(241);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(228);
				match(IDENTIFICADOR);
				setState(229);
				tipo_array();
				setState(230);
				match(PUNTOCOMA);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(232);
				match(IDENTIFICADOR);
				setState(233);
				tipo_array();
				setState(234);
				match(ASIGNACION);
				setState(235);
				match(ARRAY);
				setState(236);
				match(COR_OPN);
				setState(237);
				valores();
				setState(238);
				match(COR_CLS);
				setState(239);
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
	}

	public final TipoContext tipo() throws RecognitionException {
		TipoContext _localctx = new TipoContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_tipo);
		try {
			setState(245);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(243);
				tipo_base();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(244);
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
	}

	public final Tipo_baseContext tipo_base() throws RecognitionException {
		Tipo_baseContext _localctx = new Tipo_baseContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_tipo_base);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				enterOuterAlt(_localctx, 1);
				{
				setState(247);
				match(INTEGER);
				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(248);
				match(DECIMAL);
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(249);
				match(CHAR);
				}
				break;
			case BOOLEAN:
				enterOuterAlt(_localctx, 4);
				{
				setState(250);
				match(BOOLEAN);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 5);
				{
				setState(251);
				match(DATE);
				}
				break;
			case VARCHAR:
				enterOuterAlt(_localctx, 6);
				{
				setState(252);
				match(VARCHAR);
				setState(253);
				match(LPAR);
				setState(254);
				match(NUMERO);
				setState(255);
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
	}

	public final Tipo_arrayContext tipo_array() throws RecognitionException {
		Tipo_arrayContext _localctx = new Tipo_arrayContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_tipo_array);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			tipo_base();
			setState(259);
			match(COR_OPN);
			setState(260);
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
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DECLARE) {
				{
				setState(262);
				declaracion();
				}
			}

			setState(265);
			match(BEGIN);
			setState(269);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306406028138547201L) != 0)) {
				{
				{
				setState(266);
				sentencia_en_bloque();
				}
				}
				setState(271);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(272);
			match(END);
			setState(273);
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
	public static class Sentencia_en_bloque_cicloContext extends ParserRuleContext {
		public Sentencia_en_bloqueContext sentencia_en_bloque() {
			return getRuleContext(Sentencia_en_bloqueContext.class,0);
		}
		public Exit_stmtContext exit_stmt() {
			return getRuleContext(Exit_stmtContext.class,0);
		}
		public Continue_stmtContext continue_stmt() {
			return getRuleContext(Continue_stmtContext.class,0);
		}
		public Sentencia_en_bloque_cicloContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_en_bloque_ciclo; }
	}

	public final Sentencia_en_bloque_cicloContext sentencia_en_bloque_ciclo() throws RecognitionException {
		Sentencia_en_bloque_cicloContext _localctx = new Sentencia_en_bloque_cicloContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sentencia_en_bloque_ciclo);
		try {
			setState(278);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
			case IF:
			case CASE:
			case FOR:
			case RAISE:
			case RAISE_NOTICE:
			case RAISE_WARNING:
			case RAISE_EXCEPTION:
			case FOREACH:
			case SELECT:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(275);
				sentencia_en_bloque();
				}
				break;
			case EXIT:
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				exit_stmt();
				}
				break;
			case CONTINUE:
				enterOuterAlt(_localctx, 3);
				{
				setState(277);
				continue_stmt();
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
	public static class Sentencias_transaccionalesContext extends ParserRuleContext {
		public Insert_stmtContext insert_stmt() {
			return getRuleContext(Insert_stmtContext.class,0);
		}
		public Update_stmtContext update_stmt() {
			return getRuleContext(Update_stmtContext.class,0);
		}
		public Delete_stmtContext delete_stmt() {
			return getRuleContext(Delete_stmtContext.class,0);
		}
		public Sentencias_transaccionalesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencias_transaccionales; }
	}

	public final Sentencias_transaccionalesContext sentencias_transaccionales() throws RecognitionException {
		Sentencias_transaccionalesContext _localctx = new Sentencias_transaccionalesContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sentencias_transaccionales);
		try {
			setState(283);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INSERT:
				enterOuterAlt(_localctx, 1);
				{
				setState(280);
				insert_stmt();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(281);
				update_stmt();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 3);
				{
				setState(282);
				delete_stmt();
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
	public static class Sentencia_en_bloque_procedimientoContext extends ParserRuleContext {
		public Sentencia_en_bloqueContext sentencia_en_bloque() {
			return getRuleContext(Sentencia_en_bloqueContext.class,0);
		}
		public Sentencias_transaccionalesContext sentencias_transaccionales() {
			return getRuleContext(Sentencias_transaccionalesContext.class,0);
		}
		public Sentencia_en_bloque_procedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_en_bloque_procedimiento; }
	}

	public final Sentencia_en_bloque_procedimientoContext sentencia_en_bloque_procedimiento() throws RecognitionException {
		Sentencia_en_bloque_procedimientoContext _localctx = new Sentencia_en_bloque_procedimientoContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sentencia_en_bloque_procedimiento);
		try {
			setState(287);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
			case IF:
			case CASE:
			case FOR:
			case RAISE:
			case RAISE_NOTICE:
			case RAISE_WARNING:
			case RAISE_EXCEPTION:
			case FOREACH:
			case SELECT:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(285);
				sentencia_en_bloque();
				}
				break;
			case INSERT:
			case UPDATE:
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(286);
				sentencias_transaccionales();
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
	public static class Sentencia_en_bloque_funcionContext extends ParserRuleContext {
		public Sentencia_en_bloqueContext sentencia_en_bloque() {
			return getRuleContext(Sentencia_en_bloqueContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(pgsqlParser.RETURN, 0); }
		public ValorContext valor() {
			return getRuleContext(ValorContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public Sentencia_en_bloque_funcionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_en_bloque_funcion; }
	}

	public final Sentencia_en_bloque_funcionContext sentencia_en_bloque_funcion() throws RecognitionException {
		Sentencia_en_bloque_funcionContext _localctx = new Sentencia_en_bloque_funcionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_sentencia_en_bloque_funcion);
		try {
			setState(294);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DECLARE:
			case IF:
			case CASE:
			case FOR:
			case RAISE:
			case RAISE_NOTICE:
			case RAISE_WARNING:
			case RAISE_EXCEPTION:
			case FOREACH:
			case SELECT:
			case IDENTIFICADOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(289);
				sentencia_en_bloque();
				}
				break;
			case RETURN:
				enterOuterAlt(_localctx, 2);
				{
				setState(290);
				match(RETURN);
				setState(291);
				valor();
				setState(292);
				match(PUNTOCOMA);
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
		public Select_stmtContext select_stmt() {
			return getRuleContext(Select_stmtContext.class,0);
		}
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public AsignacionesContext asignaciones() {
			return getRuleContext(AsignacionesContext.class,0);
		}
		public Sentencia_en_bloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentencia_en_bloque; }
	}

	public final Sentencia_en_bloqueContext sentencia_en_bloque() throws RecognitionException {
		Sentencia_en_bloqueContext _localctx = new Sentencia_en_bloqueContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_sentencia_en_bloque);
		try {
			setState(313);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(296);
				declaracion();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(297);
				if_simple();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(298);
				if_else();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(299);
				case_when();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(300);
				ciclo_for();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(301);
				ciclo_foreach_array();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(302);
				ciclo_foreach_select();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(303);
				raise_notice();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(304);
				raise_warning();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(305);
				raise_exception();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(306);
				raise_simple();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(307);
				select_stmt();
				setState(308);
				match(PUNTOCOMA);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(310);
				asignaciones();
				setState(311);
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
	public static class If_simpleContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(pgsqlParser.IF, 0); }
		public Expresion_booleanaContext expresion_booleana() {
			return getRuleContext(Expresion_booleanaContext.class,0);
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
	}

	public final If_simpleContext if_simple() throws RecognitionException {
		If_simpleContext _localctx = new If_simpleContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_if_simple);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(IF);
			setState(316);
			expresion_booleana(0);
			setState(317);
			match(THEN);
			setState(321);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306406028138547201L) != 0)) {
				{
				{
				setState(318);
				sentencia_en_bloque();
				}
				}
				setState(323);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(324);
			match(END_IF);
			setState(325);
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
		public Expresion_booleanaContext expresion_booleana() {
			return getRuleContext(Expresion_booleanaContext.class,0);
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
	}

	public final If_elseContext if_else() throws RecognitionException {
		If_elseContext _localctx = new If_elseContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_if_else);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(IF);
			setState(328);
			expresion_booleana(0);
			setState(329);
			match(THEN);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306406028138547201L) != 0)) {
				{
				{
				setState(330);
				sentencia_en_bloque();
				}
				}
				setState(335);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(336);
			match(ELSE);
			setState(340);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306406028138547201L) != 0)) {
				{
				{
				setState(337);
				sentencia_en_bloque();
				}
				}
				setState(342);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(343);
			match(END_IF);
			setState(344);
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
		public List<Expresion_booleanaContext> expresion_booleana() {
			return getRuleContexts(Expresion_booleanaContext.class);
		}
		public Expresion_booleanaContext expresion_booleana(int i) {
			return getRuleContext(Expresion_booleanaContext.class,i);
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
	}

	public final Case_whenContext case_when() throws RecognitionException {
		Case_whenContext _localctx = new Case_whenContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_case_when);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(346);
			match(CASE);
			setState(355); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(347);
				match(WHEN);
				setState(348);
				expresion_booleana(0);
				setState(349);
				match(THEN);
				setState(351); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(350);
					sentencia_en_bloque();
					}
					}
					setState(353); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306406028138547201L) != 0) );
				}
				}
				setState(357); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(365);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(359);
				match(ELSE);
				setState(361); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(360);
					sentencia_en_bloque();
					}
					}
					setState(363); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( ((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306406028138547201L) != 0) );
				}
			}

			setState(367);
			match(END_CASE);
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
		public List<Sentencia_en_bloque_cicloContext> sentencia_en_bloque_ciclo() {
			return getRuleContexts(Sentencia_en_bloque_cicloContext.class);
		}
		public Sentencia_en_bloque_cicloContext sentencia_en_bloque_ciclo(int i) {
			return getRuleContext(Sentencia_en_bloque_cicloContext.class,i);
		}
		public Ciclo_forContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_for; }
	}

	public final Ciclo_forContext ciclo_for() throws RecognitionException {
		Ciclo_forContext _localctx = new Ciclo_forContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_ciclo_for);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(370);
			match(FOR);
			setState(371);
			match(IDENTIFICADOR);
			setState(372);
			match(IN);
			setState(373);
			match(NUMERO);
			setState(374);
			match(RANGE_DOTS);
			setState(375);
			match(NUMERO);
			setState(376);
			match(LOOP);
			setState(380);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306406028151130113L) != 0)) {
				{
				{
				setState(377);
				sentencia_en_bloque_ciclo();
				}
				}
				setState(382);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(383);
			match(END_LOOP);
			setState(384);
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
		public List<Sentencia_en_bloque_cicloContext> sentencia_en_bloque_ciclo() {
			return getRuleContexts(Sentencia_en_bloque_cicloContext.class);
		}
		public Sentencia_en_bloque_cicloContext sentencia_en_bloque_ciclo(int i) {
			return getRuleContext(Sentencia_en_bloque_cicloContext.class,i);
		}
		public Ciclo_foreach_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_foreach_array; }
	}

	public final Ciclo_foreach_arrayContext ciclo_foreach_array() throws RecognitionException {
		Ciclo_foreach_arrayContext _localctx = new Ciclo_foreach_arrayContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_ciclo_foreach_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(386);
			match(FOREACH);
			setState(387);
			match(IDENTIFICADOR);
			setState(388);
			match(IN);
			setState(389);
			match(ARRAY);
			setState(390);
			match(IDENTIFICADOR);
			setState(391);
			match(LOOP);
			setState(395);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306406028151130113L) != 0)) {
				{
				{
				setState(392);
				sentencia_en_bloque_ciclo();
				}
				}
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(398);
			match(END_LOOP);
			setState(399);
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
		public List<Sentencia_en_bloque_cicloContext> sentencia_en_bloque_ciclo() {
			return getRuleContexts(Sentencia_en_bloque_cicloContext.class);
		}
		public Sentencia_en_bloque_cicloContext sentencia_en_bloque_ciclo(int i) {
			return getRuleContext(Sentencia_en_bloque_cicloContext.class,i);
		}
		public Ciclo_foreach_selectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ciclo_foreach_select; }
	}

	public final Ciclo_foreach_selectContext ciclo_foreach_select() throws RecognitionException {
		Ciclo_foreach_selectContext _localctx = new Ciclo_foreach_selectContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_ciclo_foreach_select);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(401);
			match(FOREACH);
			setState(402);
			match(IDENTIFICADOR);
			setState(403);
			match(IN);
			setState(404);
			select_stmt();
			setState(405);
			match(LOOP);
			setState(409);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306406028151130113L) != 0)) {
				{
				{
				setState(406);
				sentencia_en_bloque_ciclo();
				}
				}
				setState(411);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(412);
			match(END_LOOP);
			setState(413);
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
	}

	public final Exit_stmtContext exit_stmt() throws RecognitionException {
		Exit_stmtContext _localctx = new Exit_stmtContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_exit_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(415);
			match(EXIT);
			setState(416);
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
	}

	public final Continue_stmtContext continue_stmt() throws RecognitionException {
		Continue_stmtContext _localctx = new Continue_stmtContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_continue_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			match(CONTINUE);
			setState(419);
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
	}

	public final Raise_noticeContext raise_notice() throws RecognitionException {
		Raise_noticeContext _localctx = new Raise_noticeContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_raise_notice);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(421);
			match(RAISE_NOTICE);
			setState(422);
			match(VARCHAR_LITERAL);
			setState(427);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(423);
				match(COMA);
				setState(424);
				valor();
				}
				}
				setState(429);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(430);
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
	}

	public final Raise_warningContext raise_warning() throws RecognitionException {
		Raise_warningContext _localctx = new Raise_warningContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_raise_warning);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(432);
			match(RAISE_WARNING);
			setState(433);
			match(VARCHAR_LITERAL);
			setState(438);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(434);
				match(COMA);
				setState(435);
				valor();
				}
				}
				setState(440);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(441);
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
	}

	public final Raise_exceptionContext raise_exception() throws RecognitionException {
		Raise_exceptionContext _localctx = new Raise_exceptionContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_raise_exception);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(443);
			match(RAISE_EXCEPTION);
			setState(444);
			match(VARCHAR_LITERAL);
			setState(449);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(445);
				match(COMA);
				setState(446);
				valor();
				}
				}
				setState(451);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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
	public static class Raise_simpleContext extends ParserRuleContext {
		public TerminalNode RAISE() { return getToken(pgsqlParser.RAISE, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public Raise_simpleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_raise_simple; }
	}

	public final Raise_simpleContext raise_simple() throws RecognitionException {
		Raise_simpleContext _localctx = new Raise_simpleContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_raise_simple);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(454);
			match(RAISE);
			setState(455);
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
		public TerminalNode LANGUAGE() { return getToken(pgsqlParser.LANGUAGE, 0); }
		public TerminalNode PLPGSQL() { return getToken(pgsqlParser.PLPGSQL, 0); }
		public TerminalNode PUNTOCOMA() { return getToken(pgsqlParser.PUNTOCOMA, 0); }
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Sentencia_en_bloque_funcionContext> sentencia_en_bloque_funcion() {
			return getRuleContexts(Sentencia_en_bloque_funcionContext.class);
		}
		public Sentencia_en_bloque_funcionContext sentencia_en_bloque_funcion(int i) {
			return getRuleContext(Sentencia_en_bloque_funcionContext.class,i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(457);
			match(CREATE_FUNCTION);
			setState(458);
			match(IDENTIFICADOR);
			setState(459);
			match(LPAR);
			setState(461);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(460);
				parametros();
				}
			}

			setState(463);
			match(RPAR);
			setState(464);
			match(RETURNS);
			setState(465);
			tipo();
			setState(466);
			match(AS);
			setState(467);
			match(DOLLAR_DOLLAR);
			setState(471);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306406165577500673L) != 0)) {
				{
				{
				setState(468);
				sentencia_en_bloque_funcion();
				}
				}
				setState(473);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(474);
			match(DOLLAR_DOLLAR);
			setState(475);
			match(LANGUAGE);
			setState(476);
			match(PLPGSQL);
			setState(477);
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
		public TerminalNode BEGIN() { return getToken(pgsqlParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(pgsqlParser.END, 0); }
		public List<TerminalNode> PUNTOCOMA() { return getTokens(pgsqlParser.PUNTOCOMA); }
		public TerminalNode PUNTOCOMA(int i) {
			return getToken(pgsqlParser.PUNTOCOMA, i);
		}
		public ParametrosContext parametros() {
			return getRuleContext(ParametrosContext.class,0);
		}
		public List<Sentencia_en_bloque_procedimientoContext> sentencia_en_bloque_procedimiento() {
			return getRuleContexts(Sentencia_en_bloque_procedimientoContext.class);
		}
		public Sentencia_en_bloque_procedimientoContext sentencia_en_bloque_procedimiento(int i) {
			return getRuleContext(Sentencia_en_bloque_procedimientoContext.class,i);
		}
		public ProcedimientoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedimiento; }
	}

	public final ProcedimientoContext procedimiento() throws RecognitionException {
		ProcedimientoContext _localctx = new ProcedimientoContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_procedimiento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			match(CREATE_PROCEDURE);
			setState(480);
			match(IDENTIFICADOR);
			setState(481);
			match(LPAR);
			setState(483);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IDENTIFICADOR) {
				{
				setState(482);
				parametros();
				}
			}

			setState(485);
			match(RPAR);
			setState(486);
			match(LANGUAGE);
			setState(487);
			match(PLPGSQL);
			setState(488);
			match(AS);
			setState(489);
			match(DOLLAR_DOLLAR);
			setState(490);
			match(BEGIN);
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 23)) & ~0x3f) == 0 && ((1L << (_la - 23)) & 2306566556836202497L) != 0)) {
				{
				{
				setState(491);
				sentencia_en_bloque_procedimiento();
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(497);
			match(END);
			setState(498);
			match(PUNTOCOMA);
			setState(499);
			match(DOLLAR_DOLLAR);
			setState(500);
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
	}

	public final ParametrosContext parametros() throws RecognitionException {
		ParametrosContext _localctx = new ParametrosContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_parametros);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			parametro();
			setState(507);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(503);
				match(COMA);
				setState(504);
				parametro();
				}
				}
				setState(509);
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
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_parametro);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			match(IDENTIFICADOR);
			setState(511);
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
	public static class Asignaciones_igualContext extends ParserRuleContext {
		public List<TerminalNode> IDENTIFICADOR() { return getTokens(pgsqlParser.IDENTIFICADOR); }
		public TerminalNode IDENTIFICADOR(int i) {
			return getToken(pgsqlParser.IDENTIFICADOR, i);
		}
		public List<TerminalNode> IGUAL() { return getTokens(pgsqlParser.IGUAL); }
		public TerminalNode IGUAL(int i) {
			return getToken(pgsqlParser.IGUAL, i);
		}
		public List<ExpresionContext> expresion() {
			return getRuleContexts(ExpresionContext.class);
		}
		public ExpresionContext expresion(int i) {
			return getRuleContext(ExpresionContext.class,i);
		}
		public List<TerminalNode> COMA() { return getTokens(pgsqlParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pgsqlParser.COMA, i);
		}
		public Asignaciones_igualContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignaciones_igual; }
	}

	public final Asignaciones_igualContext asignaciones_igual() throws RecognitionException {
		Asignaciones_igualContext _localctx = new Asignaciones_igualContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_asignaciones_igual);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(513);
			match(IDENTIFICADOR);
			setState(514);
			match(IGUAL);
			setState(515);
			expresion();
			setState(522);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(516);
				match(COMA);
				setState(517);
				match(IDENTIFICADOR);
				setState(518);
				match(IGUAL);
				setState(519);
				expresion();
				}
				}
				setState(524);
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
	}

	public final Insert_stmtContext insert_stmt() throws RecognitionException {
		Insert_stmtContext _localctx = new Insert_stmtContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_insert_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			match(INSERT);
			setState(526);
			match(INTO);
			setState(527);
			match(IDENTIFICADOR);
			setState(528);
			match(LPAR);
			setState(529);
			columnas();
			setState(530);
			match(RPAR);
			setState(531);
			match(VALUES);
			setState(532);
			match(LPAR);
			setState(533);
			valores();
			setState(534);
			match(RPAR);
			setState(535);
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
		public Asignaciones_igualContext asignaciones_igual() {
			return getRuleContext(Asignaciones_igualContext.class,0);
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
	}

	public final Update_stmtContext update_stmt() throws RecognitionException {
		Update_stmtContext _localctx = new Update_stmtContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_update_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(UPDATE);
			setState(538);
			match(IDENTIFICADOR);
			setState(539);
			match(SET);
			setState(540);
			asignaciones_igual();
			setState(541);
			match(WHERE);
			setState(542);
			expresion();
			setState(543);
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
	}

	public final Delete_stmtContext delete_stmt() throws RecognitionException {
		Delete_stmtContext _localctx = new Delete_stmtContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_delete_stmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(545);
			match(DELETE);
			setState(546);
			match(FROM);
			setState(547);
			match(IDENTIFICADOR);
			setState(548);
			match(WHERE);
			setState(549);
			expresion();
			setState(550);
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
	}

	public final Select_stmtContext select_stmt() throws RecognitionException {
		Select_stmtContext _localctx = new Select_stmtContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_select_stmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(552);
			match(SELECT);
			setState(553);
			columnas();
			setState(554);
			match(FROM);
			setState(555);
			match(IDENTIFICADOR);
			setState(557);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==JOIN || _la==LEFT) {
				{
				setState(556);
				join_list();
				}
			}

			setState(560);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(559);
				where_clause();
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
	}

	public final ColumnasContext columnas() throws RecognitionException {
		ColumnasContext _localctx = new ColumnasContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_columnas);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			columna_prefijo();
			setState(567);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(563);
				match(COMA);
				setState(564);
				columna_prefijo();
				}
				}
				setState(569);
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
	}

	public final Columna_prefijoContext columna_prefijo() throws RecognitionException {
		Columna_prefijoContext _localctx = new Columna_prefijoContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_columna_prefijo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(571);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(570);
				match(IDENTIFICADOR);
				}
				break;
			}
			setState(574);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT) {
				{
				setState(573);
				match(DOT);
				}
			}

			setState(576);
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
	}

	public final Join_listContext join_list() throws RecognitionException {
		Join_listContext _localctx = new Join_listContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_join_list);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(579); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(578);
				join_clause();
				}
				}
				setState(581); 
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
	}

	public final Join_clauseContext join_clause() throws RecognitionException {
		Join_clauseContext _localctx = new Join_clauseContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_join_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(586);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
				{
				setState(583);
				match(JOIN);
				}
				break;
			case LEFT:
				{
				setState(584);
				match(LEFT);
				setState(585);
				match(JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(588);
			match(IDENTIFICADOR);
			setState(589);
			match(ON);
			setState(590);
			columna_prefijo();
			setState(591);
			match(IGUAL);
			setState(592);
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
		public List<TerminalNode> COMA() { return getTokens(pgsqlParser.COMA); }
		public TerminalNode COMA(int i) {
			return getToken(pgsqlParser.COMA, i);
		}
		public AsignacionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asignaciones; }
	}

	public final AsignacionesContext asignaciones() throws RecognitionException {
		AsignacionesContext _localctx = new AsignacionesContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_asignaciones);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(594);
			match(IDENTIFICADOR);
			setState(595);
			match(ASIGNACION);
			setState(596);
			expresion();
			setState(603);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMA) {
				{
				{
				setState(597);
				match(COMA);
				setState(598);
				match(IDENTIFICADOR);
				setState(599);
				match(ASIGNACION);
				setState(600);
				expresion();
				}
				}
				setState(605);
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
	public static class Where_clauseContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(pgsqlParser.WHERE, 0); }
		public ExpresionContext expresion() {
			return getRuleContext(ExpresionContext.class,0);
		}
		public Where_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_clause; }
	}

	public final Where_clauseContext where_clause() throws RecognitionException {
		Where_clauseContext _localctx = new Where_clauseContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_where_clause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(606);
			match(WHERE);
			setState(607);
			expresion();
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
	}

	public final CondicionContext condicion() throws RecognitionException {
		CondicionContext _localctx = new CondicionContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_condicion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(609);
			expresion();
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
		case 6:
			return expresion_booleana_sempred((Expresion_booleanaContext)_localctx, predIndex);
		case 8:
			return expresion_aritmetica_sempred((Expresion_aritmeticaContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresion_booleana_sempred(Expresion_booleanaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean expresion_aritmetica_sempred(Expresion_aritmeticaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 6);
		case 3:
			return precpred(_ctx, 5);
		case 4:
			return precpred(_ctx, 4);
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\\\u0264\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007,\u0002"+
		"-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u00071\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0005\u0000h\b\u0000\n\u0000\f\u0000k\t"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0003\u0001z\b\u0001\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0005\u0002\u007f\b\u0002\n\u0002\f\u0002\u0082\t\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004\u0092\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0003\u0005\u0097\b\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0003\u0006\u00a5\b\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0005\u0006\u00ad\b\u0006"+
		"\n\u0006\f\u0006\u00b0\t\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ba\b\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0005\b\u00cb\b\b\n\b\f\b\u00ce\t\b\u0001\t"+
		"\u0001\t\u0001\t\u0001\n\u0001\n\u0004\n\u00d5\b\n\u000b\n\f\n\u00d6\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0003\u000b\u00e3\b\u000b\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0003\f\u00f2\b\f\u0001\r\u0001\r\u0003\r\u00f6"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0101\b\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0003\u0010\u0108"+
		"\b\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u010c\b\u0010\n\u0010\f\u0010"+
		"\u010f\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0011\u0003\u0011\u0117\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u011c\b\u0012\u0001\u0013\u0001\u0013\u0003\u0013\u0120\b"+
		"\u0013\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003"+
		"\u0014\u0127\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0003\u0015\u013a\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0005\u0016\u0140\b\u0016\n\u0016\f\u0016\u0143\t\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0005\u0017\u014c\b\u0017\n\u0017\f\u0017\u014f\t\u0017\u0001\u0017\u0001"+
		"\u0017\u0005\u0017\u0153\b\u0017\n\u0017\f\u0017\u0156\t\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0004\u0018\u0160\b\u0018\u000b\u0018\f\u0018\u0161\u0004"+
		"\u0018\u0164\b\u0018\u000b\u0018\f\u0018\u0165\u0001\u0018\u0001\u0018"+
		"\u0004\u0018\u016a\b\u0018\u000b\u0018\f\u0018\u016b\u0003\u0018\u016e"+
		"\b\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0005"+
		"\u0019\u017b\b\u0019\n\u0019\f\u0019\u017e\t\u0019\u0001\u0019\u0001\u0019"+
		"\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0005\u001a\u018a\b\u001a\n\u001a\f\u001a\u018d"+
		"\t\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0198\b\u001b\n"+
		"\u001b\f\u001b\u019b\t\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001d\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0005\u001e\u01aa\b\u001e\n"+
		"\u001e\f\u001e\u01ad\t\u001e\u0001\u001e\u0001\u001e\u0001\u001f\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0005\u001f\u01b5\b\u001f\n\u001f\f\u001f"+
		"\u01b8\t\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001 \u0001 \u0005"+
		" \u01c0\b \n \f \u01c3\t \u0001 \u0001 \u0001!\u0001!\u0001!\u0001\"\u0001"+
		"\"\u0001\"\u0001\"\u0003\"\u01ce\b\"\u0001\"\u0001\"\u0001\"\u0001\"\u0001"+
		"\"\u0001\"\u0005\"\u01d6\b\"\n\"\f\"\u01d9\t\"\u0001\"\u0001\"\u0001\""+
		"\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0003#\u01e4\b#\u0001#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001#\u0005#\u01ed\b#\n#\f#\u01f0\t#\u0001"+
		"#\u0001#\u0001#\u0001#\u0001#\u0001$\u0001$\u0001$\u0005$\u01fa\b$\n$"+
		"\f$\u01fd\t$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001&\u0001&\u0001"+
		"&\u0001&\u0005&\u0209\b&\n&\f&\u020c\t&\u0001\'\u0001\'\u0001\'\u0001"+
		"\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001(\u0001)\u0001)\u0001"+
		")\u0001)\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0001*\u0003"+
		"*\u022e\b*\u0001*\u0003*\u0231\b*\u0001+\u0001+\u0001+\u0005+\u0236\b"+
		"+\n+\f+\u0239\t+\u0001,\u0003,\u023c\b,\u0001,\u0003,\u023f\b,\u0001,"+
		"\u0001,\u0001-\u0004-\u0244\b-\u000b-\f-\u0245\u0001.\u0001.\u0001.\u0003"+
		".\u024b\b.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001.\u0001/\u0001/\u0001"+
		"/\u0001/\u0001/\u0001/\u0001/\u0005/\u025a\b/\n/\f/\u025d\t/\u00010\u0001"+
		"0\u00010\u00011\u00011\u00011\u0000\u0002\f\u00102\u0000\u0002\u0004\u0006"+
		"\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e \"$&(*,."+
		"02468:<>@BDFHJLNPRTVXZ\\^`b\u0000\u0002\u0001\u0000\u001e\u001f\u0001"+
		"\u0000\n\u000f\u028a\u0000i\u0001\u0000\u0000\u0000\u0002y\u0001\u0000"+
		"\u0000\u0000\u0004{\u0001\u0000\u0000\u0000\u0006\u0083\u0001\u0000\u0000"+
		"\u0000\b\u0091\u0001\u0000\u0000\u0000\n\u0096\u0001\u0000\u0000\u0000"+
		"\f\u00a4\u0001\u0000\u0000\u0000\u000e\u00b1\u0001\u0000\u0000\u0000\u0010"+
		"\u00b9\u0001\u0000\u0000\u0000\u0012\u00cf\u0001\u0000\u0000\u0000\u0014"+
		"\u00d4\u0001\u0000\u0000\u0000\u0016\u00e2\u0001\u0000\u0000\u0000\u0018"+
		"\u00f1\u0001\u0000\u0000\u0000\u001a\u00f5\u0001\u0000\u0000\u0000\u001c"+
		"\u0100\u0001\u0000\u0000\u0000\u001e\u0102\u0001\u0000\u0000\u0000 \u0107"+
		"\u0001\u0000\u0000\u0000\"\u0116\u0001\u0000\u0000\u0000$\u011b\u0001"+
		"\u0000\u0000\u0000&\u011f\u0001\u0000\u0000\u0000(\u0126\u0001\u0000\u0000"+
		"\u0000*\u0139\u0001\u0000\u0000\u0000,\u013b\u0001\u0000\u0000\u0000."+
		"\u0147\u0001\u0000\u0000\u00000\u015a\u0001\u0000\u0000\u00002\u0172\u0001"+
		"\u0000\u0000\u00004\u0182\u0001\u0000\u0000\u00006\u0191\u0001\u0000\u0000"+
		"\u00008\u019f\u0001\u0000\u0000\u0000:\u01a2\u0001\u0000\u0000\u0000<"+
		"\u01a5\u0001\u0000\u0000\u0000>\u01b0\u0001\u0000\u0000\u0000@\u01bb\u0001"+
		"\u0000\u0000\u0000B\u01c6\u0001\u0000\u0000\u0000D\u01c9\u0001\u0000\u0000"+
		"\u0000F\u01df\u0001\u0000\u0000\u0000H\u01f6\u0001\u0000\u0000\u0000J"+
		"\u01fe\u0001\u0000\u0000\u0000L\u0201\u0001\u0000\u0000\u0000N\u020d\u0001"+
		"\u0000\u0000\u0000P\u0219\u0001\u0000\u0000\u0000R\u0221\u0001\u0000\u0000"+
		"\u0000T\u0228\u0001\u0000\u0000\u0000V\u0232\u0001\u0000\u0000\u0000X"+
		"\u023b\u0001\u0000\u0000\u0000Z\u0243\u0001\u0000\u0000\u0000\\\u024a"+
		"\u0001\u0000\u0000\u0000^\u0252\u0001\u0000\u0000\u0000`\u025e\u0001\u0000"+
		"\u0000\u0000b\u0261\u0001\u0000\u0000\u0000dh\u0003 \u0010\u0000eh\u0003"+
		"D\"\u0000fh\u0003F#\u0000gd\u0001\u0000\u0000\u0000ge\u0001\u0000\u0000"+
		"\u0000gf\u0001\u0000\u0000\u0000hk\u0001\u0000\u0000\u0000ig\u0001\u0000"+
		"\u0000\u0000ij\u0001\u0000\u0000\u0000jl\u0001\u0000\u0000\u0000ki\u0001"+
		"\u0000\u0000\u0000lm\u0005\u0000\u0000\u0001m\u0001\u0001\u0000\u0000"+
		"\u0000nz\u0005X\u0000\u0000oz\u0005W\u0000\u0000pz\u0005V\u0000\u0000"+
		"qz\u0005U\u0000\u0000rz\u0005Y\u0000\u0000sz\u0005T\u0000\u0000tz\u0003"+
		"\u0006\u0003\u0000uz\u0003\b\u0004\u0000vw\u0005T\u0000\u0000wx\u0005"+
		"\u0004\u0000\u0000xz\u0005T\u0000\u0000yn\u0001\u0000\u0000\u0000yo\u0001"+
		"\u0000\u0000\u0000yp\u0001\u0000\u0000\u0000yq\u0001\u0000\u0000\u0000"+
		"yr\u0001\u0000\u0000\u0000ys\u0001\u0000\u0000\u0000yt\u0001\u0000\u0000"+
		"\u0000yu\u0001\u0000\u0000\u0000yv\u0001\u0000\u0000\u0000z\u0003\u0001"+
		"\u0000\u0000\u0000{\u0080\u0003\u0002\u0001\u0000|}\u0005\u0003\u0000"+
		"\u0000}\u007f\u0003\u0002\u0001\u0000~|\u0001\u0000\u0000\u0000\u007f"+
		"\u0082\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0001\u0000\u0000\u0000\u0081\u0005\u0001\u0000\u0000\u0000\u0082\u0080"+
		"\u0001\u0000\u0000\u0000\u0083\u0084\u0007\u0000\u0000\u0000\u0084\u0007"+
		"\u0001\u0000\u0000\u0000\u0085\u0092\u0005L\u0000\u0000\u0086\u0092\u0005"+
		"M\u0000\u0000\u0087\u0088\u0005N\u0000\u0000\u0088\u0089\u0005\u0013\u0000"+
		"\u0000\u0089\u008a\u0003\u0004\u0002\u0000\u008a\u008b\u0005\u0014\u0000"+
		"\u0000\u008b\u0092\u0001\u0000\u0000\u0000\u008c\u0092\u0005O\u0000\u0000"+
		"\u008d\u0092\u0005P\u0000\u0000\u008e\u0092\u0005Q\u0000\u0000\u008f\u0092"+
		"\u0005R\u0000\u0000\u0090\u0092\u0005S\u0000\u0000\u0091\u0085\u0001\u0000"+
		"\u0000\u0000\u0091\u0086\u0001\u0000\u0000\u0000\u0091\u0087\u0001\u0000"+
		"\u0000\u0000\u0091\u008c\u0001\u0000\u0000\u0000\u0091\u008d\u0001\u0000"+
		"\u0000\u0000\u0091\u008e\u0001\u0000\u0000\u0000\u0091\u008f\u0001\u0000"+
		"\u0000\u0000\u0091\u0090\u0001\u0000\u0000\u0000\u0092\t\u0001\u0000\u0000"+
		"\u0000\u0093\u0097\u0003\f\u0006\u0000\u0094\u0097\u0003\u0010\b\u0000"+
		"\u0095\u0097\u0003\u0002\u0001\u0000\u0096\u0093\u0001\u0000\u0000\u0000"+
		"\u0096\u0094\u0001\u0000\u0000\u0000\u0096\u0095\u0001\u0000\u0000\u0000"+
		"\u0097\u000b\u0001\u0000\u0000\u0000\u0098\u0099\u0006\u0006\uffff\uffff"+
		"\u0000\u0099\u009a\u0005\u0013\u0000\u0000\u009a\u009b\u0003\f\u0006\u0000"+
		"\u009b\u009c\u0005\u0014\u0000\u0000\u009c\u00a5\u0001\u0000\u0000\u0000"+
		"\u009d\u009e\u0005?\u0000\u0000\u009e\u00a5\u0003\f\u0006\u0005\u009f"+
		"\u00a0\u0003\u0010\b\u0000\u00a0\u00a1\u0003\u000e\u0007\u0000\u00a1\u00a2"+
		"\u0003\u0010\b\u0000\u00a2\u00a5\u0001\u0000\u0000\u0000\u00a3\u00a5\u0003"+
		"\u0006\u0003\u0000\u00a4\u0098\u0001\u0000\u0000\u0000\u00a4\u009d\u0001"+
		"\u0000\u0000\u0000\u00a4\u009f\u0001\u0000\u0000\u0000\u00a4\u00a3\u0001"+
		"\u0000\u0000\u0000\u00a5\u00ae\u0001\u0000\u0000\u0000\u00a6\u00a7\n\u0004"+
		"\u0000\u0000\u00a7\u00a8\u0005>\u0000\u0000\u00a8\u00ad\u0003\f\u0006"+
		"\u0005\u00a9\u00aa\n\u0003\u0000\u0000\u00aa\u00ab\u0005=\u0000\u0000"+
		"\u00ab\u00ad\u0003\f\u0006\u0004\u00ac\u00a6\u0001\u0000\u0000\u0000\u00ac"+
		"\u00a9\u0001\u0000\u0000\u0000\u00ad\u00b0\u0001\u0000\u0000\u0000\u00ae"+
		"\u00ac\u0001\u0000\u0000\u0000\u00ae\u00af\u0001\u0000\u0000\u0000\u00af"+
		"\r\u0001\u0000\u0000\u0000\u00b0\u00ae\u0001\u0000\u0000\u0000\u00b1\u00b2"+
		"\u0007\u0001\u0000\u0000\u00b2\u000f\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0006\b\uffff\uffff\u0000\u00b4\u00b5\u0005\u0013\u0000\u0000\u00b5\u00b6"+
		"\u0003\u0010\b\u0000\u00b6\u00b7\u0005\u0014\u0000\u0000\u00b7\u00ba\u0001"+
		"\u0000\u0000\u0000\u00b8\u00ba\u0003\u0002\u0001\u0000\u00b9\u00b3\u0001"+
		"\u0000\u0000\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00ba\u00cc\u0001"+
		"\u0000\u0000\u0000\u00bb\u00bc\n\u0006\u0000\u0000\u00bc\u00bd\u0005\t"+
		"\u0000\u0000\u00bd\u00cb\u0003\u0010\b\u0007\u00be\u00bf\n\u0005\u0000"+
		"\u0000\u00bf\u00c0\u0005\u0007\u0000\u0000\u00c0\u00cb\u0003\u0010\b\u0006"+
		"\u00c1\u00c2\n\u0004\u0000\u0000\u00c2\u00c3\u0005\b\u0000\u0000\u00c3"+
		"\u00cb\u0003\u0010\b\u0005\u00c4\u00c5\n\u0003\u0000\u0000\u00c5\u00c6"+
		"\u0005\u0005\u0000\u0000\u00c6\u00cb\u0003\u0010\b\u0004\u00c7\u00c8\n"+
		"\u0002\u0000\u0000\u00c8\u00c9\u0005\u0006\u0000\u0000\u00c9\u00cb\u0003"+
		"\u0010\b\u0003\u00ca\u00bb\u0001\u0000\u0000\u0000\u00ca\u00be\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c1\u0001\u0000\u0000\u0000\u00ca\u00c4\u0001\u0000"+
		"\u0000\u0000\u00ca\u00c7\u0001\u0000\u0000\u0000\u00cb\u00ce\u0001\u0000"+
		"\u0000\u0000\u00cc\u00ca\u0001\u0000\u0000\u0000\u00cc\u00cd\u0001\u0000"+
		"\u0000\u0000\u00cd\u0011\u0001\u0000\u0000\u0000\u00ce\u00cc\u0001\u0000"+
		"\u0000\u0000\u00cf\u00d0\u0005\u0017\u0000\u0000\u00d0\u00d1\u0003\u0014"+
		"\n\u0000\u00d1\u0013\u0001\u0000\u0000\u0000\u00d2\u00d5\u0003\u0016\u000b"+
		"\u0000\u00d3\u00d5\u0003\u0018\f\u0000\u00d4\u00d2\u0001\u0000\u0000\u0000"+
		"\u00d4\u00d3\u0001\u0000\u0000\u0000\u00d5\u00d6\u0001\u0000\u0000\u0000"+
		"\u00d6\u00d4\u0001\u0000\u0000\u0000\u00d6\u00d7\u0001\u0000\u0000\u0000"+
		"\u00d7\u0015\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005T\u0000\u0000\u00d9"+
		"\u00da\u0003\u001a\r\u0000\u00da\u00db\u0005\u0001\u0000\u0000\u00db\u00e3"+
		"\u0001\u0000\u0000\u0000\u00dc\u00dd\u0005T\u0000\u0000\u00dd\u00de\u0003"+
		"\u001a\r\u0000\u00de\u00df\u0005\u0002\u0000\u0000\u00df\u00e0\u0003\n"+
		"\u0005\u0000\u00e0\u00e1\u0005\u0001\u0000\u0000\u00e1\u00e3\u0001\u0000"+
		"\u0000\u0000\u00e2\u00d8\u0001\u0000\u0000\u0000\u00e2\u00dc\u0001\u0000"+
		"\u0000\u0000\u00e3\u0017\u0001\u0000\u0000\u0000\u00e4\u00e5\u0005T\u0000"+
		"\u0000\u00e5\u00e6\u0003\u001e\u000f\u0000\u00e6\u00e7\u0005\u0001\u0000"+
		"\u0000\u00e7\u00f2\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005T\u0000\u0000"+
		"\u00e9\u00ea\u0003\u001e\u000f\u0000\u00ea\u00eb\u0005\u0002\u0000\u0000"+
		"\u00eb\u00ec\u0005\u0016\u0000\u0000\u00ec\u00ed\u0005\u0011\u0000\u0000"+
		"\u00ed\u00ee\u0003\u0004\u0002\u0000\u00ee\u00ef\u0005\u0012\u0000\u0000"+
		"\u00ef\u00f0\u0005\u0001\u0000\u0000\u00f0\u00f2\u0001\u0000\u0000\u0000"+
		"\u00f1\u00e4\u0001\u0000\u0000\u0000\u00f1\u00e8\u0001\u0000\u0000\u0000"+
		"\u00f2\u0019\u0001\u0000\u0000\u0000\u00f3\u00f6\u0003\u001c\u000e\u0000"+
		"\u00f4\u00f6\u0003\u001e\u000f\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000"+
		"\u00f5\u00f4\u0001\u0000\u0000\u0000\u00f6\u001b\u0001\u0000\u0000\u0000"+
		"\u00f7\u0101\u0005\u0018\u0000\u0000\u00f8\u0101\u0005\u0019\u0000\u0000"+
		"\u00f9\u0101\u0005\u001a\u0000\u0000\u00fa\u0101\u0005\u001b\u0000\u0000"+
		"\u00fb\u0101\u0005\u001c\u0000\u0000\u00fc\u00fd\u0005\u001d\u0000\u0000"+
		"\u00fd\u00fe\u0005\u0013\u0000\u0000\u00fe\u00ff\u0005V\u0000\u0000\u00ff"+
		"\u0101\u0005\u0014\u0000\u0000\u0100\u00f7\u0001\u0000\u0000\u0000\u0100"+
		"\u00f8\u0001\u0000\u0000\u0000\u0100\u00f9\u0001\u0000\u0000\u0000\u0100"+
		"\u00fa\u0001\u0000\u0000\u0000\u0100\u00fb\u0001\u0000\u0000\u0000\u0100"+
		"\u00fc\u0001\u0000\u0000\u0000\u0101\u001d\u0001\u0000\u0000\u0000\u0102"+
		"\u0103\u0003\u001c\u000e\u0000\u0103\u0104\u0005\u0011\u0000\u0000\u0104"+
		"\u0105\u0005\u0012\u0000\u0000\u0105\u001f\u0001\u0000\u0000\u0000\u0106"+
		"\u0108\u0003\u0012\t\u0000\u0107\u0106\u0001\u0000\u0000\u0000\u0107\u0108"+
		"\u0001\u0000\u0000\u0000\u0108\u0109\u0001\u0000\u0000\u0000\u0109\u010d"+
		"\u0005 \u0000\u0000\u010a\u010c\u0003*\u0015\u0000\u010b\u010a\u0001\u0000"+
		"\u0000\u0000\u010c\u010f\u0001\u0000\u0000\u0000\u010d\u010b\u0001\u0000"+
		"\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000\u010e\u0110\u0001\u0000"+
		"\u0000\u0000\u010f\u010d\u0001\u0000\u0000\u0000\u0110\u0111\u0005!\u0000"+
		"\u0000\u0111\u0112\u0005\u0001\u0000\u0000\u0112!\u0001\u0000\u0000\u0000"+
		"\u0113\u0117\u0003*\u0015\u0000\u0114\u0117\u00038\u001c\u0000\u0115\u0117"+
		"\u0003:\u001d\u0000\u0116\u0113\u0001\u0000\u0000\u0000\u0116\u0114\u0001"+
		"\u0000\u0000\u0000\u0116\u0115\u0001\u0000\u0000\u0000\u0117#\u0001\u0000"+
		"\u0000\u0000\u0118\u011c\u0003N\'\u0000\u0119\u011c\u0003P(\u0000\u011a"+
		"\u011c\u0003R)\u0000\u011b\u0118\u0001\u0000\u0000\u0000\u011b\u0119\u0001"+
		"\u0000\u0000\u0000\u011b\u011a\u0001\u0000\u0000\u0000\u011c%\u0001\u0000"+
		"\u0000\u0000\u011d\u0120\u0003*\u0015\u0000\u011e\u0120\u0003$\u0012\u0000"+
		"\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u011e\u0001\u0000\u0000\u0000"+
		"\u0120\'\u0001\u0000\u0000\u0000\u0121\u0127\u0003*\u0015\u0000\u0122"+
		"\u0123\u0005<\u0000\u0000\u0123\u0124\u0003\u0002\u0001\u0000\u0124\u0125"+
		"\u0005\u0001\u0000\u0000\u0125\u0127\u0001\u0000\u0000\u0000\u0126\u0121"+
		"\u0001\u0000\u0000\u0000\u0126\u0122\u0001\u0000\u0000\u0000\u0127)\u0001"+
		"\u0000\u0000\u0000\u0128\u013a\u0003\u0012\t\u0000\u0129\u013a\u0003,"+
		"\u0016\u0000\u012a\u013a\u0003.\u0017\u0000\u012b\u013a\u00030\u0018\u0000"+
		"\u012c\u013a\u00032\u0019\u0000\u012d\u013a\u00034\u001a\u0000\u012e\u013a"+
		"\u00036\u001b\u0000\u012f\u013a\u0003<\u001e\u0000\u0130\u013a\u0003>"+
		"\u001f\u0000\u0131\u013a\u0003@ \u0000\u0132\u013a\u0003B!\u0000\u0133"+
		"\u0134\u0003T*\u0000\u0134\u0135\u0005\u0001\u0000\u0000\u0135\u013a\u0001"+
		"\u0000\u0000\u0000\u0136\u0137\u0003^/\u0000\u0137\u0138\u0005\u0001\u0000"+
		"\u0000\u0138\u013a\u0001\u0000\u0000\u0000\u0139\u0128\u0001\u0000\u0000"+
		"\u0000\u0139\u0129\u0001\u0000\u0000\u0000\u0139\u012a\u0001\u0000\u0000"+
		"\u0000\u0139\u012b\u0001\u0000\u0000\u0000\u0139\u012c\u0001\u0000\u0000"+
		"\u0000\u0139\u012d\u0001\u0000\u0000\u0000\u0139\u012e\u0001\u0000\u0000"+
		"\u0000\u0139\u012f\u0001\u0000\u0000\u0000\u0139\u0130\u0001\u0000\u0000"+
		"\u0000\u0139\u0131\u0001\u0000\u0000\u0000\u0139\u0132\u0001\u0000\u0000"+
		"\u0000\u0139\u0133\u0001\u0000\u0000\u0000\u0139\u0136\u0001\u0000\u0000"+
		"\u0000\u013a+\u0001\u0000\u0000\u0000\u013b\u013c\u0005\"\u0000\u0000"+
		"\u013c\u013d\u0003\f\u0006\u0000\u013d\u0141\u0005#\u0000\u0000\u013e"+
		"\u0140\u0003*\u0015\u0000\u013f\u013e\u0001\u0000\u0000\u0000\u0140\u0143"+
		"\u0001\u0000\u0000\u0000\u0141\u013f\u0001\u0000\u0000\u0000\u0141\u0142"+
		"\u0001\u0000\u0000\u0000\u0142\u0144\u0001\u0000\u0000\u0000\u0143\u0141"+
		"\u0001\u0000\u0000\u0000\u0144\u0145\u0005%\u0000\u0000\u0145\u0146\u0005"+
		"\u0001\u0000\u0000\u0146-\u0001\u0000\u0000\u0000\u0147\u0148\u0005\""+
		"\u0000\u0000\u0148\u0149\u0003\f\u0006\u0000\u0149\u014d\u0005#\u0000"+
		"\u0000\u014a\u014c\u0003*\u0015\u0000\u014b\u014a\u0001\u0000\u0000\u0000"+
		"\u014c\u014f\u0001\u0000\u0000\u0000\u014d\u014b\u0001\u0000\u0000\u0000"+
		"\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0001\u0000\u0000\u0000"+
		"\u014f\u014d\u0001\u0000\u0000\u0000\u0150\u0154\u0005$\u0000\u0000\u0151"+
		"\u0153\u0003*\u0015\u0000\u0152\u0151\u0001\u0000\u0000\u0000\u0153\u0156"+
		"\u0001\u0000\u0000\u0000\u0154\u0152\u0001\u0000\u0000\u0000\u0154\u0155"+
		"\u0001\u0000\u0000\u0000\u0155\u0157\u0001\u0000\u0000\u0000\u0156\u0154"+
		"\u0001\u0000\u0000\u0000\u0157\u0158\u0005%\u0000\u0000\u0158\u0159\u0005"+
		"\u0001\u0000\u0000\u0159/\u0001\u0000\u0000\u0000\u015a\u0163\u0005&\u0000"+
		"\u0000\u015b\u015c\u0005\'\u0000\u0000\u015c\u015d\u0003\f\u0006\u0000"+
		"\u015d\u015f\u0005#\u0000\u0000\u015e\u0160\u0003*\u0015\u0000\u015f\u015e"+
		"\u0001\u0000\u0000\u0000\u0160\u0161\u0001\u0000\u0000\u0000\u0161\u015f"+
		"\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0164"+
		"\u0001\u0000\u0000\u0000\u0163\u015b\u0001\u0000\u0000\u0000\u0164\u0165"+
		"\u0001\u0000\u0000\u0000\u0165\u0163\u0001\u0000\u0000\u0000\u0165\u0166"+
		"\u0001\u0000\u0000\u0000\u0166\u016d\u0001\u0000\u0000\u0000\u0167\u0169"+
		"\u0005$\u0000\u0000\u0168\u016a\u0003*\u0015\u0000\u0169\u0168\u0001\u0000"+
		"\u0000\u0000\u016a\u016b\u0001\u0000\u0000\u0000\u016b\u0169\u0001\u0000"+
		"\u0000\u0000\u016b\u016c\u0001\u0000\u0000\u0000\u016c\u016e\u0001\u0000"+
		"\u0000\u0000\u016d\u0167\u0001\u0000\u0000\u0000\u016d\u016e\u0001\u0000"+
		"\u0000\u0000\u016e\u016f\u0001\u0000\u0000\u0000\u016f\u0170\u0005(\u0000"+
		"\u0000\u0170\u0171\u0005\u0001\u0000\u0000\u01711\u0001\u0000\u0000\u0000"+
		"\u0172\u0173\u0005)\u0000\u0000\u0173\u0174\u0005T\u0000\u0000\u0174\u0175"+
		"\u0005*\u0000\u0000\u0175\u0176\u0005V\u0000\u0000\u0176\u0177\u0005\u0010"+
		"\u0000\u0000\u0177\u0178\u0005V\u0000\u0000\u0178\u017c\u0005+\u0000\u0000"+
		"\u0179\u017b\u0003\"\u0011\u0000\u017a\u0179\u0001\u0000\u0000\u0000\u017b"+
		"\u017e\u0001\u0000\u0000\u0000\u017c\u017a\u0001\u0000\u0000\u0000\u017c"+
		"\u017d\u0001\u0000\u0000\u0000\u017d\u017f\u0001\u0000\u0000\u0000\u017e"+
		"\u017c\u0001\u0000\u0000\u0000\u017f\u0180\u0005,\u0000\u0000\u0180\u0181"+
		"\u0005\u0001\u0000\u0000\u01813\u0001\u0000\u0000\u0000\u0182\u0183\u0005"+
		";\u0000\u0000\u0183\u0184\u0005T\u0000\u0000\u0184\u0185\u0005*\u0000"+
		"\u0000\u0185\u0186\u0005\u0016\u0000\u0000\u0186\u0187\u0005T\u0000\u0000"+
		"\u0187\u018b\u0005+\u0000\u0000\u0188\u018a\u0003\"\u0011\u0000\u0189"+
		"\u0188\u0001\u0000\u0000\u0000\u018a\u018d\u0001\u0000\u0000\u0000\u018b"+
		"\u0189\u0001\u0000\u0000\u0000\u018b\u018c\u0001\u0000\u0000\u0000\u018c"+
		"\u018e\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018e"+
		"\u018f\u0005,\u0000\u0000\u018f\u0190\u0005\u0001\u0000\u0000\u01905\u0001"+
		"\u0000\u0000\u0000\u0191\u0192\u0005;\u0000\u0000\u0192\u0193\u0005T\u0000"+
		"\u0000\u0193\u0194\u0005*\u0000\u0000\u0194\u0195\u0003T*\u0000\u0195"+
		"\u0199\u0005+\u0000\u0000\u0196\u0198\u0003\"\u0011\u0000\u0197\u0196"+
		"\u0001\u0000\u0000\u0000\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197"+
		"\u0001\u0000\u0000\u0000\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019c"+
		"\u0001\u0000\u0000\u0000\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019d"+
		"\u0005,\u0000\u0000\u019d\u019e\u0005\u0001\u0000\u0000\u019e7\u0001\u0000"+
		"\u0000\u0000\u019f\u01a0\u0005-\u0000\u0000\u01a0\u01a1\u0005\u0001\u0000"+
		"\u0000\u01a19\u0001\u0000\u0000\u0000\u01a2\u01a3\u0005.\u0000\u0000\u01a3"+
		"\u01a4\u0005\u0001\u0000\u0000\u01a4;\u0001\u0000\u0000\u0000\u01a5\u01a6"+
		"\u00050\u0000\u0000\u01a6\u01ab\u0005X\u0000\u0000\u01a7\u01a8\u0005\u0003"+
		"\u0000\u0000\u01a8\u01aa\u0003\u0002\u0001\u0000\u01a9\u01a7\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ad\u0001\u0000\u0000\u0000\u01ab\u01a9\u0001\u0000"+
		"\u0000\u0000\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01ae\u0001\u0000"+
		"\u0000\u0000\u01ad\u01ab\u0001\u0000\u0000\u0000\u01ae\u01af\u0005\u0001"+
		"\u0000\u0000\u01af=\u0001\u0000\u0000\u0000\u01b0\u01b1\u00051\u0000\u0000"+
		"\u01b1\u01b6\u0005X\u0000\u0000\u01b2\u01b3\u0005\u0003\u0000\u0000\u01b3"+
		"\u01b5\u0003\u0002\u0001\u0000\u01b4\u01b2\u0001\u0000\u0000\u0000\u01b5"+
		"\u01b8\u0001\u0000\u0000\u0000\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6"+
		"\u01b7\u0001\u0000\u0000\u0000\u01b7\u01b9\u0001\u0000\u0000\u0000\u01b8"+
		"\u01b6\u0001\u0000\u0000\u0000\u01b9\u01ba\u0005\u0001\u0000\u0000\u01ba"+
		"?\u0001\u0000\u0000\u0000\u01bb\u01bc\u00052\u0000\u0000\u01bc\u01c1\u0005"+
		"X\u0000\u0000\u01bd\u01be\u0005\u0003\u0000\u0000\u01be\u01c0\u0003\u0002"+
		"\u0001\u0000\u01bf\u01bd\u0001\u0000\u0000\u0000\u01c0\u01c3\u0001\u0000"+
		"\u0000\u0000\u01c1\u01bf\u0001\u0000\u0000\u0000\u01c1\u01c2\u0001\u0000"+
		"\u0000\u0000\u01c2\u01c4\u0001\u0000\u0000\u0000\u01c3\u01c1\u0001\u0000"+
		"\u0000\u0000\u01c4\u01c5\u0005\u0001\u0000\u0000\u01c5A\u0001\u0000\u0000"+
		"\u0000\u01c6\u01c7\u0005/\u0000\u0000\u01c7\u01c8\u0005\u0001\u0000\u0000"+
		"\u01c8C\u0001\u0000\u0000\u0000\u01c9\u01ca\u00055\u0000\u0000\u01ca\u01cb"+
		"\u0005T\u0000\u0000\u01cb\u01cd\u0005\u0013\u0000\u0000\u01cc\u01ce\u0003"+
		"H$\u0000\u01cd\u01cc\u0001\u0000\u0000\u0000\u01cd\u01ce\u0001\u0000\u0000"+
		"\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf\u01d0\u0005\u0014\u0000"+
		"\u0000\u01d0\u01d1\u00057\u0000\u0000\u01d1\u01d2\u0003\u001a\r\u0000"+
		"\u01d2\u01d3\u00058\u0000\u0000\u01d3\u01d7\u0005\u0015\u0000\u0000\u01d4"+
		"\u01d6\u0003(\u0014\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6\u01d9"+
		"\u0001\u0000\u0000\u0000\u01d7\u01d5\u0001\u0000\u0000\u0000\u01d7\u01d8"+
		"\u0001\u0000\u0000\u0000\u01d8\u01da\u0001\u0000\u0000\u0000\u01d9\u01d7"+
		"\u0001\u0000\u0000\u0000\u01da\u01db\u0005\u0015\u0000\u0000\u01db\u01dc"+
		"\u00059\u0000\u0000\u01dc\u01dd\u0005:\u0000\u0000\u01dd\u01de\u0005\u0001"+
		"\u0000\u0000\u01deE\u0001\u0000\u0000\u0000\u01df\u01e0\u00056\u0000\u0000"+
		"\u01e0\u01e1\u0005T\u0000\u0000\u01e1\u01e3\u0005\u0013\u0000\u0000\u01e2"+
		"\u01e4\u0003H$\u0000\u01e3\u01e2\u0001\u0000\u0000\u0000\u01e3\u01e4\u0001"+
		"\u0000\u0000\u0000\u01e4\u01e5\u0001\u0000\u0000\u0000\u01e5\u01e6\u0005"+
		"\u0014\u0000\u0000\u01e6\u01e7\u00059\u0000\u0000\u01e7\u01e8\u0005:\u0000"+
		"\u0000\u01e8\u01e9\u00058\u0000\u0000\u01e9\u01ea\u0005\u0015\u0000\u0000"+
		"\u01ea\u01ee\u0005 \u0000\u0000\u01eb\u01ed\u0003&\u0013\u0000\u01ec\u01eb"+
		"\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000\u0000\u0000\u01ee\u01ec"+
		"\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000\u0000\u01ef\u01f1"+
		"\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000\u01f1\u01f2"+
		"\u0005!\u0000\u0000\u01f2\u01f3\u0005\u0001\u0000\u0000\u01f3\u01f4\u0005"+
		"\u0015\u0000\u0000\u01f4\u01f5\u0005\u0001\u0000\u0000\u01f5G\u0001\u0000"+
		"\u0000\u0000\u01f6\u01fb\u0003J%\u0000\u01f7\u01f8\u0005\u0003\u0000\u0000"+
		"\u01f8\u01fa\u0003J%\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01fa\u01fd"+
		"\u0001\u0000\u0000\u0000\u01fb\u01f9\u0001\u0000\u0000\u0000\u01fb\u01fc"+
		"\u0001\u0000\u0000\u0000\u01fcI\u0001\u0000\u0000\u0000\u01fd\u01fb\u0001"+
		"\u0000\u0000\u0000\u01fe\u01ff\u0005T\u0000\u0000\u01ff\u0200\u0003\u001a"+
		"\r\u0000\u0200K\u0001\u0000\u0000\u0000\u0201\u0202\u0005T\u0000\u0000"+
		"\u0202\u0203\u0005\u000e\u0000\u0000\u0203\u020a\u0003\n\u0005\u0000\u0204"+
		"\u0205\u0005\u0003\u0000\u0000\u0205\u0206\u0005T\u0000\u0000\u0206\u0207"+
		"\u0005\u000e\u0000\u0000\u0207\u0209\u0003\n\u0005\u0000\u0208\u0204\u0001"+
		"\u0000\u0000\u0000\u0209\u020c\u0001\u0000\u0000\u0000\u020a\u0208\u0001"+
		"\u0000\u0000\u0000\u020a\u020b\u0001\u0000\u0000\u0000\u020bM\u0001\u0000"+
		"\u0000\u0000\u020c\u020a\u0001\u0000\u0000\u0000\u020d\u020e\u0005@\u0000"+
		"\u0000\u020e\u020f\u0005A\u0000\u0000\u020f\u0210\u0005T\u0000\u0000\u0210"+
		"\u0211\u0005\u0013\u0000\u0000\u0211\u0212\u0003V+\u0000\u0212\u0213\u0005"+
		"\u0014\u0000\u0000\u0213\u0214\u0005B\u0000\u0000\u0214\u0215\u0005\u0013"+
		"\u0000\u0000\u0215\u0216\u0003\u0004\u0002\u0000\u0216\u0217\u0005\u0014"+
		"\u0000\u0000\u0217\u0218\u0005\u0001\u0000\u0000\u0218O\u0001\u0000\u0000"+
		"\u0000\u0219\u021a\u0005C\u0000\u0000\u021a\u021b\u0005T\u0000\u0000\u021b"+
		"\u021c\u0005D\u0000\u0000\u021c\u021d\u0003L&\u0000\u021d\u021e\u0005"+
		"E\u0000\u0000\u021e\u021f\u0003\n\u0005\u0000\u021f\u0220\u0005\u0001"+
		"\u0000\u0000\u0220Q\u0001\u0000\u0000\u0000\u0221\u0222\u0005F\u0000\u0000"+
		"\u0222\u0223\u0005G\u0000\u0000\u0223\u0224\u0005T\u0000\u0000\u0224\u0225"+
		"\u0005E\u0000\u0000\u0225\u0226\u0003\n\u0005\u0000\u0226\u0227\u0005"+
		"\u0001\u0000\u0000\u0227S\u0001\u0000\u0000\u0000\u0228\u0229\u0005H\u0000"+
		"\u0000\u0229\u022a\u0003V+\u0000\u022a\u022b\u0005G\u0000\u0000\u022b"+
		"\u022d\u0005T\u0000\u0000\u022c\u022e\u0003Z-\u0000\u022d\u022c\u0001"+
		"\u0000\u0000\u0000\u022d\u022e\u0001\u0000\u0000\u0000\u022e\u0230\u0001"+
		"\u0000\u0000\u0000\u022f\u0231\u0003`0\u0000\u0230\u022f\u0001\u0000\u0000"+
		"\u0000\u0230\u0231\u0001\u0000\u0000\u0000\u0231U\u0001\u0000\u0000\u0000"+
		"\u0232\u0237\u0003X,\u0000\u0233\u0234\u0005\u0003\u0000\u0000\u0234\u0236"+
		"\u0003X,\u0000\u0235\u0233\u0001\u0000\u0000\u0000\u0236\u0239\u0001\u0000"+
		"\u0000\u0000\u0237\u0235\u0001\u0000\u0000\u0000\u0237\u0238\u0001\u0000"+
		"\u0000\u0000\u0238W\u0001\u0000\u0000\u0000\u0239\u0237\u0001\u0000\u0000"+
		"\u0000\u023a\u023c\u0005T\u0000\u0000\u023b\u023a\u0001\u0000\u0000\u0000"+
		"\u023b\u023c\u0001\u0000\u0000\u0000\u023c\u023e\u0001\u0000\u0000\u0000"+
		"\u023d\u023f\u0005\u0004\u0000\u0000\u023e\u023d\u0001\u0000\u0000\u0000"+
		"\u023e\u023f\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000"+
		"\u0240\u0241\u0005T\u0000\u0000\u0241Y\u0001\u0000\u0000\u0000\u0242\u0244"+
		"\u0003\\.\u0000\u0243\u0242\u0001\u0000\u0000\u0000\u0244\u0245\u0001"+
		"\u0000\u0000\u0000\u0245\u0243\u0001\u0000\u0000\u0000\u0245\u0246\u0001"+
		"\u0000\u0000\u0000\u0246[\u0001\u0000\u0000\u0000\u0247\u024b\u0005I\u0000"+
		"\u0000\u0248\u0249\u0005J\u0000\u0000\u0249\u024b\u0005I\u0000\u0000\u024a"+
		"\u0247\u0001\u0000\u0000\u0000\u024a\u0248\u0001\u0000\u0000\u0000\u024b"+
		"\u024c\u0001\u0000\u0000\u0000\u024c\u024d\u0005T\u0000\u0000\u024d\u024e"+
		"\u0005K\u0000\u0000\u024e\u024f\u0003X,\u0000\u024f\u0250\u0005\u000e"+
		"\u0000\u0000\u0250\u0251\u0003X,\u0000\u0251]\u0001\u0000\u0000\u0000"+
		"\u0252\u0253\u0005T\u0000\u0000\u0253\u0254\u0005\u0002\u0000\u0000\u0254"+
		"\u025b\u0003\n\u0005\u0000\u0255\u0256\u0005\u0003\u0000\u0000\u0256\u0257"+
		"\u0005T\u0000\u0000\u0257\u0258\u0005\u0002\u0000\u0000\u0258\u025a\u0003"+
		"\n\u0005\u0000\u0259\u0255\u0001\u0000\u0000\u0000\u025a\u025d\u0001\u0000"+
		"\u0000\u0000\u025b\u0259\u0001\u0000\u0000\u0000\u025b\u025c\u0001\u0000"+
		"\u0000\u0000\u025c_\u0001\u0000\u0000\u0000\u025d\u025b\u0001\u0000\u0000"+
		"\u0000\u025e\u025f\u0005E\u0000\u0000\u025f\u0260\u0003\n\u0005\u0000"+
		"\u0260a\u0001\u0000\u0000\u0000\u0261\u0262\u0003\n\u0005\u0000\u0262"+
		"c\u0001\u0000\u0000\u00004giy\u0080\u0091\u0096\u00a4\u00ac\u00ae\u00b9"+
		"\u00ca\u00cc\u00d4\u00d6\u00e2\u00f1\u00f5\u0100\u0107\u010d\u0116\u011b"+
		"\u011f\u0126\u0139\u0141\u014d\u0154\u0161\u0165\u016b\u016d\u017c\u018b"+
		"\u0199\u01ab\u01b6\u01c1\u01cd\u01d7\u01e3\u01ee\u01fb\u020a\u022d\u0230"+
		"\u0237\u023b\u023e\u0245\u024a\u025b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}