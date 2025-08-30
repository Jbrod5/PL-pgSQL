// Generated from /home/jorge/Compi_2/PL-pgSQL/PL-pgSQL/src/gramaticas/pgsql.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pgsqlParser}.
 */
public interface pgsqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(pgsqlParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(pgsqlParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#valor}.
	 * @param ctx the parse tree
	 */
	void enterValor(pgsqlParser.ValorContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#valor}.
	 * @param ctx the parse tree
	 */
	void exitValor(pgsqlParser.ValorContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#valores}.
	 * @param ctx the parse tree
	 */
	void enterValores(pgsqlParser.ValoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#valores}.
	 * @param ctx the parse tree
	 */
	void exitValores(pgsqlParser.ValoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void enterArray_literal(pgsqlParser.Array_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#array_literal}.
	 * @param ctx the parse tree
	 */
	void exitArray_literal(pgsqlParser.Array_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#tipo_base}.
	 * @param ctx the parse tree
	 */
	void enterTipo_base(pgsqlParser.Tipo_baseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#tipo_base}.
	 * @param ctx the parse tree
	 */
	void exitTipo_base(pgsqlParser.Tipo_baseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#tipo_array}.
	 * @param ctx the parse tree
	 */
	void enterTipo_array(pgsqlParser.Tipo_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#tipo_array}.
	 * @param ctx the parse tree
	 */
	void exitTipo_array(pgsqlParser.Tipo_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(pgsqlParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(pgsqlParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#declaracion_normal}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_normal(pgsqlParser.Declaracion_normalContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#declaracion_normal}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_normal(pgsqlParser.Declaracion_normalContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#declaracion_array}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_array(pgsqlParser.Declaracion_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#declaracion_array}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_array(pgsqlParser.Declaracion_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(pgsqlParser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(pgsqlParser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion(pgsqlParser.DeclaracionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#declaracion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion(pgsqlParser.DeclaracionContext ctx);
}