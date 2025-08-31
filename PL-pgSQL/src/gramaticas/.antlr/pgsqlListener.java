// Generated from /home/jorge/Compi_2/PL-pgSQL/PL-pgSQL/src/gramaticas/pgsql.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link pgsqlParser}.
 */
public interface pgsqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(pgsqlParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(pgsqlParser.ProgramaContext ctx);
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
	 * Enter a parse tree produced by {@link pgsqlParser#booleano}.
	 * @param ctx the parse tree
	 */
	void enterBooleano(pgsqlParser.BooleanoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#booleano}.
	 * @param ctx the parse tree
	 */
	void exitBooleano(pgsqlParser.BooleanoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#func_builtin}.
	 * @param ctx the parse tree
	 */
	void enterFunc_builtin(pgsqlParser.Func_builtinContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#func_builtin}.
	 * @param ctx the parse tree
	 */
	void exitFunc_builtin(pgsqlParser.Func_builtinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterGtExpr(pgsqlParser.GtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitGtExpr(pgsqlParser.GtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gteExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterGteExpr(pgsqlParser.GteExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gteExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitGteExpr(pgsqlParser.GteExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterOrExpr(pgsqlParser.OrExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitOrExpr(pgsqlParser.OrExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterSubExpr(pgsqlParser.SubExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitSubExpr(pgsqlParser.SubExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterParenExpr(pgsqlParser.ParenExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitParenExpr(pgsqlParser.ParenExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code neqExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterNeqExpr(pgsqlParser.NeqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code neqExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitNeqExpr(pgsqlParser.NeqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lteExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterLteExpr(pgsqlParser.LteExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lteExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitLteExpr(pgsqlParser.LteExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ltExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterLtExpr(pgsqlParser.LtExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ltExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitLtExpr(pgsqlParser.LtExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterEqExpr(pgsqlParser.EqExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code eqExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitEqExpr(pgsqlParser.EqExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterNotExpr(pgsqlParser.NotExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitNotExpr(pgsqlParser.NotExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterAddExpr(pgsqlParser.AddExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitAddExpr(pgsqlParser.AddExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valorExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterValorExpr(pgsqlParser.ValorExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valorExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitValorExpr(pgsqlParser.ValorExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterMulExpr(pgsqlParser.MulExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mulExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitMulExpr(pgsqlParser.MulExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterDivExpr(pgsqlParser.DivExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitDivExpr(pgsqlParser.DivExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterPowExpr(pgsqlParser.PowExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code powExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitPowExpr(pgsqlParser.PowExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterAndExpr(pgsqlParser.AndExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpr}
	 * labeled alternative in {@link pgsqlParser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitAndExpr(pgsqlParser.AndExprContext ctx);
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
	 * Enter a parse tree produced by {@link pgsqlParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(pgsqlParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(pgsqlParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#sentencia_en_bloque}.
	 * @param ctx the parse tree
	 */
	void enterSentencia_en_bloque(pgsqlParser.Sentencia_en_bloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#sentencia_en_bloque}.
	 * @param ctx the parse tree
	 */
	void exitSentencia_en_bloque(pgsqlParser.Sentencia_en_bloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#if_simple}.
	 * @param ctx the parse tree
	 */
	void enterIf_simple(pgsqlParser.If_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#if_simple}.
	 * @param ctx the parse tree
	 */
	void exitIf_simple(pgsqlParser.If_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#if_else}.
	 * @param ctx the parse tree
	 */
	void enterIf_else(pgsqlParser.If_elseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#if_else}.
	 * @param ctx the parse tree
	 */
	void exitIf_else(pgsqlParser.If_elseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#case_when}.
	 * @param ctx the parse tree
	 */
	void enterCase_when(pgsqlParser.Case_whenContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#case_when}.
	 * @param ctx the parse tree
	 */
	void exitCase_when(pgsqlParser.Case_whenContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#ciclo_for}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_for(pgsqlParser.Ciclo_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#ciclo_for}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_for(pgsqlParser.Ciclo_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#ciclo_foreach_array}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_foreach_array(pgsqlParser.Ciclo_foreach_arrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#ciclo_foreach_array}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_foreach_array(pgsqlParser.Ciclo_foreach_arrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#ciclo_foreach_select}.
	 * @param ctx the parse tree
	 */
	void enterCiclo_foreach_select(pgsqlParser.Ciclo_foreach_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#ciclo_foreach_select}.
	 * @param ctx the parse tree
	 */
	void exitCiclo_foreach_select(pgsqlParser.Ciclo_foreach_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExit_stmt(pgsqlParser.Exit_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#exit_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExit_stmt(pgsqlParser.Exit_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void enterContinue_stmt(pgsqlParser.Continue_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#continue_stmt}.
	 * @param ctx the parse tree
	 */
	void exitContinue_stmt(pgsqlParser.Continue_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#raise_notice}.
	 * @param ctx the parse tree
	 */
	void enterRaise_notice(pgsqlParser.Raise_noticeContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#raise_notice}.
	 * @param ctx the parse tree
	 */
	void exitRaise_notice(pgsqlParser.Raise_noticeContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#raise_warning}.
	 * @param ctx the parse tree
	 */
	void enterRaise_warning(pgsqlParser.Raise_warningContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#raise_warning}.
	 * @param ctx the parse tree
	 */
	void exitRaise_warning(pgsqlParser.Raise_warningContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#raise_exception}.
	 * @param ctx the parse tree
	 */
	void enterRaise_exception(pgsqlParser.Raise_exceptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#raise_exception}.
	 * @param ctx the parse tree
	 */
	void exitRaise_exception(pgsqlParser.Raise_exceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#raise_simple}.
	 * @param ctx the parse tree
	 */
	void enterRaise_simple(pgsqlParser.Raise_simpleContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#raise_simple}.
	 * @param ctx the parse tree
	 */
	void exitRaise_simple(pgsqlParser.Raise_simpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#trans_commit}.
	 * @param ctx the parse tree
	 */
	void enterTrans_commit(pgsqlParser.Trans_commitContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#trans_commit}.
	 * @param ctx the parse tree
	 */
	void exitTrans_commit(pgsqlParser.Trans_commitContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#trans_rollback}.
	 * @param ctx the parse tree
	 */
	void enterTrans_rollback(pgsqlParser.Trans_rollbackContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#trans_rollback}.
	 * @param ctx the parse tree
	 */
	void exitTrans_rollback(pgsqlParser.Trans_rollbackContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#funcion}.
	 * @param ctx the parse tree
	 */
	void enterFuncion(pgsqlParser.FuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#funcion}.
	 * @param ctx the parse tree
	 */
	void exitFuncion(pgsqlParser.FuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#procedimiento}.
	 * @param ctx the parse tree
	 */
	void enterProcedimiento(pgsqlParser.ProcedimientoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#procedimiento}.
	 * @param ctx the parse tree
	 */
	void exitProcedimiento(pgsqlParser.ProcedimientoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(pgsqlParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(pgsqlParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(pgsqlParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(pgsqlParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt(pgsqlParser.Insert_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#insert_stmt}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt(pgsqlParser.Insert_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt(pgsqlParser.Update_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#update_stmt}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt(pgsqlParser.Update_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt(pgsqlParser.Delete_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#delete_stmt}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt(pgsqlParser.Delete_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(pgsqlParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(pgsqlParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#columnas}.
	 * @param ctx the parse tree
	 */
	void enterColumnas(pgsqlParser.ColumnasContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#columnas}.
	 * @param ctx the parse tree
	 */
	void exitColumnas(pgsqlParser.ColumnasContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#columna_prefijo}.
	 * @param ctx the parse tree
	 */
	void enterColumna_prefijo(pgsqlParser.Columna_prefijoContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#columna_prefijo}.
	 * @param ctx the parse tree
	 */
	void exitColumna_prefijo(pgsqlParser.Columna_prefijoContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#join_list}.
	 * @param ctx the parse tree
	 */
	void enterJoin_list(pgsqlParser.Join_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#join_list}.
	 * @param ctx the parse tree
	 */
	void exitJoin_list(pgsqlParser.Join_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(pgsqlParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(pgsqlParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void enterAsignaciones(pgsqlParser.AsignacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void exitAsignaciones(pgsqlParser.AsignacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void enterWhere_clause(pgsqlParser.Where_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#where_clause}.
	 * @param ctx the parse tree
	 */
	void exitWhere_clause(pgsqlParser.Where_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link pgsqlParser#condicion}.
	 * @param ctx the parse tree
	 */
	void enterCondicion(pgsqlParser.CondicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link pgsqlParser#condicion}.
	 * @param ctx the parse tree
	 */
	void exitCondicion(pgsqlParser.CondicionContext ctx);
}