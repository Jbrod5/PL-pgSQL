// Generated from /home/jorge/Compi_2/PL-pgSQL/PL-pgSQL/src/gramaticas/pgsql.g4 by ANTLR 4.13.2
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
	 * Visit a parse tree produced by {@link pgsqlParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(pgsqlParser.ProgramaContext ctx);
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
	 * Visit a parse tree produced by {@link pgsqlParser#booleano}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleano(pgsqlParser.BooleanoContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#func_builtin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_builtin(pgsqlParser.Func_builtinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gtExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtExpr(pgsqlParser.GtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gteExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGteExpr(pgsqlParser.GteExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpr(pgsqlParser.OrExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubExpr(pgsqlParser.SubExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenExpr(pgsqlParser.ParenExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code neqExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNeqExpr(pgsqlParser.NeqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lteExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLteExpr(pgsqlParser.LteExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ltExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLtExpr(pgsqlParser.LtExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqExpr(pgsqlParser.EqExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpr(pgsqlParser.NotExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddExpr(pgsqlParser.AddExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valorExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValorExpr(pgsqlParser.ValorExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulExpr(pgsqlParser.MulExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivExpr(pgsqlParser.DivExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPowExpr(pgsqlParser.PowExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpr(pgsqlParser.AndExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#declaracion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion(pgsqlParser.DeclaracionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(pgsqlParser.DeclaracionesContext ctx);
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
	 * Visit a parse tree produced by {@link pgsqlParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(pgsqlParser.TipoContext ctx);
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
	 * Visit a parse tree produced by {@link pgsqlParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(pgsqlParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#sentencia_en_bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentencia_en_bloque(pgsqlParser.Sentencia_en_bloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#if_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_simple(pgsqlParser.If_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#if_else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_else(pgsqlParser.If_elseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#case_when}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_when(pgsqlParser.Case_whenContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#ciclo_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_for(pgsqlParser.Ciclo_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#ciclo_foreach_array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_foreach_array(pgsqlParser.Ciclo_foreach_arrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#ciclo_foreach_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCiclo_foreach_select(pgsqlParser.Ciclo_foreach_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExit_stmt(pgsqlParser.Exit_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#continue_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_stmt(pgsqlParser.Continue_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#raise_notice}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_notice(pgsqlParser.Raise_noticeContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#raise_warning}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_warning(pgsqlParser.Raise_warningContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#raise_exception}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_exception(pgsqlParser.Raise_exceptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#raise_simple}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_simple(pgsqlParser.Raise_simpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#trans_commit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_commit(pgsqlParser.Trans_commitContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#trans_rollback}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrans_rollback(pgsqlParser.Trans_rollbackContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncion(pgsqlParser.FuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#procedimiento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedimiento(pgsqlParser.ProcedimientoContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(pgsqlParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(pgsqlParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt(pgsqlParser.Insert_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#update_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt(pgsqlParser.Update_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt(pgsqlParser.Delete_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(pgsqlParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#columnas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnas(pgsqlParser.ColumnasContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#columna_prefijo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumna_prefijo(pgsqlParser.Columna_prefijoContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#join_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_list(pgsqlParser.Join_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(pgsqlParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#asignaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignaciones(pgsqlParser.AsignacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#where_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere_clause(pgsqlParser.Where_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link pgsqlParser#condicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicion(pgsqlParser.CondicionContext ctx);
}