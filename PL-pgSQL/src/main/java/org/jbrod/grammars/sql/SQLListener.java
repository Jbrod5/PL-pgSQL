// Generated from /home/jorge/Compi_2/PL-pgSQL/PL-pgSQL/src/gramaticas/SQL.g4 by ANTLR 4.13.2
package org.jbrod.grammars.sql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SQLParser}.
 */
public interface SQLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SQLParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void enterSql_script(SQLParser.Sql_scriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#sql_script}.
	 * @param ctx the parse tree
	 */
	void exitSql_script(SQLParser.Sql_scriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#valor_op}.
	 * @param ctx the parse tree
	 */
	void enterValor_op(SQLParser.Valor_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#valor_op}.
	 * @param ctx the parse tree
	 */
	void exitValor_op(SQLParser.Valor_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#valores}.
	 * @param ctx the parse tree
	 */
	void enterValores(SQLParser.ValoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#valores}.
	 * @param ctx the parse tree
	 */
	void exitValores(SQLParser.ValoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#opciones}.
	 * @param ctx the parse tree
	 */
	void enterOpciones(SQLParser.OpcionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#opciones}.
	 * @param ctx the parse tree
	 */
	void exitOpciones(SQLParser.OpcionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#ddl_sentence}.
	 * @param ctx the parse tree
	 */
	void enterDdl_sentence(SQLParser.Ddl_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#ddl_sentence}.
	 * @param ctx the parse tree
	 */
	void exitDdl_sentence(SQLParser.Ddl_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_schema}.
	 * @param ctx the parse tree
	 */
	void enterCreate_schema(SQLParser.Create_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_schema}.
	 * @param ctx the parse tree
	 */
	void exitCreate_schema(SQLParser.Create_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#use_schema}.
	 * @param ctx the parse tree
	 */
	void enterUse_schema(SQLParser.Use_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#use_schema}.
	 * @param ctx the parse tree
	 */
	void exitUse_schema(SQLParser.Use_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void enterTipo_dato(SQLParser.Tipo_datoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tipo_dato}.
	 * @param ctx the parse tree
	 */
	void exitTipo_dato(SQLParser.Tipo_datoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#restriccion_columna}.
	 * @param ctx the parse tree
	 */
	void enterRestriccion_columna(SQLParser.Restriccion_columnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#restriccion_columna}.
	 * @param ctx the parse tree
	 */
	void exitRestriccion_columna(SQLParser.Restriccion_columnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columna}.
	 * @param ctx the parse tree
	 */
	void enterColumna(SQLParser.ColumnaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columna}.
	 * @param ctx the parse tree
	 */
	void exitColumna(SQLParser.ColumnaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#llave_foranea}.
	 * @param ctx the parse tree
	 */
	void enterLlave_foranea(SQLParser.Llave_foraneaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#llave_foranea}.
	 * @param ctx the parse tree
	 */
	void exitLlave_foranea(SQLParser.Llave_foraneaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#elemento_tabla}.
	 * @param ctx the parse tree
	 */
	void enterElemento_tabla(SQLParser.Elemento_tablaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#elemento_tabla}.
	 * @param ctx the parse tree
	 */
	void exitElemento_tabla(SQLParser.Elemento_tablaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#lista_elementos}.
	 * @param ctx the parse tree
	 */
	void enterLista_elementos(SQLParser.Lista_elementosContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#lista_elementos}.
	 * @param ctx the parse tree
	 */
	void exitLista_elementos(SQLParser.Lista_elementosContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(SQLParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(SQLParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_add_column}.
	 * @param ctx the parse tree
	 */
	void enterAlter_add_column(SQLParser.Alter_add_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_add_column}.
	 * @param ctx the parse tree
	 */
	void exitAlter_add_column(SQLParser.Alter_add_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_drop_column}.
	 * @param ctx the parse tree
	 */
	void enterAlter_drop_column(SQLParser.Alter_drop_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_drop_column}.
	 * @param ctx the parse tree
	 */
	void exitAlter_drop_column(SQLParser.Alter_drop_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_add_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_add_constraint(SQLParser.Alter_add_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_add_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_add_constraint(SQLParser.Alter_add_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#alter_drop_constraint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_drop_constraint(SQLParser.Alter_drop_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#alter_drop_constraint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_drop_constraint(SQLParser.Alter_drop_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table(SQLParser.Drop_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table(SQLParser.Drop_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dml_sentence}.
	 * @param ctx the parse tree
	 */
	void enterDml_sentence(SQLParser.Dml_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dml_sentence}.
	 * @param ctx the parse tree
	 */
	void exitDml_sentence(SQLParser.Dml_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#insert_into}.
	 * @param ctx the parse tree
	 */
	void enterInsert_into(SQLParser.Insert_intoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#insert_into}.
	 * @param ctx the parse tree
	 */
	void exitInsert_into(SQLParser.Insert_intoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void enterAsignaciones(SQLParser.AsignacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#asignaciones}.
	 * @param ctx the parse tree
	 */
	void exitAsignaciones(SQLParser.AsignacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#update_sentence}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_sentence(SQLParser.Update_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#update_sentence}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_sentence(SQLParser.Update_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#delete_sentence}.
	 * @param ctx the parse tree
	 */
	void enterDelete_sentence(SQLParser.Delete_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#delete_sentence}.
	 * @param ctx the parse tree
	 */
	void exitDelete_sentence(SQLParser.Delete_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columna_prefijo}.
	 * @param ctx the parse tree
	 */
	void enterColumna_prefijo(SQLParser.Columna_prefijoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columna_prefijo}.
	 * @param ctx the parse tree
	 */
	void exitColumna_prefijo(SQLParser.Columna_prefijoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#columnas}.
	 * @param ctx the parse tree
	 */
	void enterColumnas(SQLParser.ColumnasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#columnas}.
	 * @param ctx the parse tree
	 */
	void exitColumnas(SQLParser.ColumnasContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_type}.
	 * @param ctx the parse tree
	 */
	void enterJoin_type(SQLParser.Join_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_type}.
	 * @param ctx the parse tree
	 */
	void exitJoin_type(SQLParser.Join_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void enterJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 */
	void exitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#join_list}.
	 * @param ctx the parse tree
	 */
	void enterJoin_list(SQLParser.Join_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#join_list}.
	 * @param ctx the parse tree
	 */
	void exitJoin_list(SQLParser.Join_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#select_sentence}.
	 * @param ctx the parse tree
	 */
	void enterSelect_sentence(SQLParser.Select_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#select_sentence}.
	 * @param ctx the parse tree
	 */
	void exitSelect_sentence(SQLParser.Select_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#dcl_sentence}.
	 * @param ctx the parse tree
	 */
	void enterDcl_sentence(SQLParser.Dcl_sentenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#dcl_sentence}.
	 * @param ctx the parse tree
	 */
	void exitDcl_sentence(SQLParser.Dcl_sentenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#permiso}.
	 * @param ctx the parse tree
	 */
	void enterPermiso(SQLParser.PermisoContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#permiso}.
	 * @param ctx the parse tree
	 */
	void exitPermiso(SQLParser.PermisoContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#tabla_op}.
	 * @param ctx the parse tree
	 */
	void enterTabla_op(SQLParser.Tabla_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#tabla_op}.
	 * @param ctx the parse tree
	 */
	void exitTabla_op(SQLParser.Tabla_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#create_user}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user(SQLParser.Create_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#create_user}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user(SQLParser.Create_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#grant_perm}.
	 * @param ctx the parse tree
	 */
	void enterGrant_perm(SQLParser.Grant_permContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#grant_perm}.
	 * @param ctx the parse tree
	 */
	void exitGrant_perm(SQLParser.Grant_permContext ctx);
	/**
	 * Enter a parse tree produced by {@link SQLParser#revoke_perm}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_perm(SQLParser.Revoke_permContext ctx);
	/**
	 * Exit a parse tree produced by {@link SQLParser#revoke_perm}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_perm(SQLParser.Revoke_permContext ctx);
}