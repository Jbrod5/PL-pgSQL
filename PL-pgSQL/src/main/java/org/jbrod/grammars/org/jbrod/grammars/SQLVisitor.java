// Generated from /home/jorge/Compi_2/PL-pgSQL/PL-pgSQL/src/gramaticas/SQL.g4 by ANTLR 4.13.2
package org.jbrod.grammars;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SQLParser#sql_script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_script(SQLParser.Sql_scriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#valor_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_op(SQLParser.Valor_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#valores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValores(SQLParser.ValoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#opciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpciones(SQLParser.OpcionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#ddl_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_sentence(SQLParser.Ddl_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_schema(SQLParser.Create_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#use_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_schema(SQLParser.Use_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tipo_dato}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_dato(SQLParser.Tipo_datoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#restriccion_columna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestriccion_columna(SQLParser.Restriccion_columnaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#columna}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumna(SQLParser.ColumnaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#llave_foranea}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlave_foranea(SQLParser.Llave_foraneaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#elemento_tabla}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemento_tabla(SQLParser.Elemento_tablaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#lista_elementos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLista_elementos(SQLParser.Lista_elementosContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(SQLParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_add_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_add_column(SQLParser.Alter_add_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_drop_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_drop_column(SQLParser.Alter_drop_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_add_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_add_constraint(SQLParser.Alter_add_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#alter_drop_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_drop_constraint(SQLParser.Alter_drop_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#drop_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table(SQLParser.Drop_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dml_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_sentence(SQLParser.Dml_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#insert_into}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_into(SQLParser.Insert_intoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#asignaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignaciones(SQLParser.AsignacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#update_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_sentence(SQLParser.Update_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#delete_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_sentence(SQLParser.Delete_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#columna_prefijo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumna_prefijo(SQLParser.Columna_prefijoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#columnas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnas(SQLParser.ColumnasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_type(SQLParser.Join_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_clause(SQLParser.Join_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#join_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_list(SQLParser.Join_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#select_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_sentence(SQLParser.Select_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#dcl_sentence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDcl_sentence(SQLParser.Dcl_sentenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#permiso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermiso(SQLParser.PermisoContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#tabla_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTabla_op(SQLParser.Tabla_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#create_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user(SQLParser.Create_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#grant_perm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_perm(SQLParser.Grant_permContext ctx);
	/**
	 * Visit a parse tree produced by {@link SQLParser#revoke_perm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_perm(SQLParser.Revoke_permContext ctx);
}