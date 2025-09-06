// Generated from /home/jorge/Compi_2/PL-pgSQL/PL-pgSQL/src/gramaticas/pgsql.g4 by ANTLR 4.13.2
package org.jbrod.grammars.pgsql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link pgsqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface pgsqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(pgsqlParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#valor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor(pgsqlParser.ValorContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#valores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValores(pgsqlParser.ValoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#array_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_literal(pgsqlParser.Array_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#tipo_base}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_base(pgsqlParser.Tipo_baseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#tipo_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_array(pgsqlParser.Tipo_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(pgsqlParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#declaracion_normal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_normal(pgsqlParser.Declaracion_normalContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#declaracion_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_array(pgsqlParser.Declaracion_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(pgsqlParser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(pgsqlParser.DeclaracionContext ctx);
}