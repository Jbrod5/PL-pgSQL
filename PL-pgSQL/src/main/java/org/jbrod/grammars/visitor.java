package org.jbrod.grammars;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class visitor implements SQLVisitor{

    @Override
    public Object visitSql_script(SQLParser.Sql_scriptContext ctx) {
        return null;
    }

    @Override
    public Object visitValor_op(SQLParser.Valor_opContext ctx) {
        return null;
    }

    @Override
    public Object visitValores(SQLParser.ValoresContext ctx) {
        return null;
    }

    @Override
    public Object visitOpciones(SQLParser.OpcionesContext ctx) {
        return null;
    }

    @Override
    public Object visitDdl_sentence(SQLParser.Ddl_sentenceContext ctx) {
        return null;
    }

    @Override
    public Object visitPRUEBA(SQLParser.PRUEBAContext ctx) {
        String valId = ctx.id.getText();
        System.out.println(valId);
        return null;
    }

    @Override
    public Object visitUse_schema(SQLParser.Use_schemaContext ctx) {
        return null;
    }

    @Override
    public Object visitTipo_dato(SQLParser.Tipo_datoContext ctx) {
        return null;
    }

    @Override
    public Object visitRestriccion_columna(SQLParser.Restriccion_columnaContext ctx) {
        return null;
    }

    @Override
    public Object visitColumna(SQLParser.ColumnaContext ctx) {
        return null;
    }

    @Override
    public Object visitLlave_foranea(SQLParser.Llave_foraneaContext ctx) {
        return null;
    }

    @Override
    public Object visitElemento_tabla(SQLParser.Elemento_tablaContext ctx) {
        return null;
    }

    @Override
    public Object visitLista_elementos(SQLParser.Lista_elementosContext ctx) {
        return null;
    }

    @Override
    public Object visitCreate_table(SQLParser.Create_tableContext ctx) {
        return null;
    }

    @Override
    public Object visitAlter_add_column(SQLParser.Alter_add_columnContext ctx) {
        return null;
    }

    @Override
    public Object visitAlter_drop_column(SQLParser.Alter_drop_columnContext ctx) {
        return null;
    }

    @Override
    public Object visitAlter_add_constraint(SQLParser.Alter_add_constraintContext ctx) {
        return null;
    }

    @Override
    public Object visitAlter_drop_constraint(SQLParser.Alter_drop_constraintContext ctx) {
        return null;
    }

    @Override
    public Object visitDrop_table(SQLParser.Drop_tableContext ctx) {
        return null;
    }

    @Override
    public Object visitDml_sentence(SQLParser.Dml_sentenceContext ctx) {
        return null;
    }

    @Override
    public Object visitInsert_into(SQLParser.Insert_intoContext ctx) {
        return null;
    }

    @Override
    public Object visitAsignaciones(SQLParser.AsignacionesContext ctx) {
        return null;
    }

    @Override
    public Object visitUpdate_sentence(SQLParser.Update_sentenceContext ctx) {
        return null;
    }

    @Override
    public Object visitDelete_sentence(SQLParser.Delete_sentenceContext ctx) {
        return null;
    }

    @Override
    public Object visitColumna_prefijo(SQLParser.Columna_prefijoContext ctx) {
        return null;
    }

    @Override
    public Object visitColumnas(SQLParser.ColumnasContext ctx) {
        return null;
    }

    @Override
    public Object visitJoin_type(SQLParser.Join_typeContext ctx) {
        return null;
    }

    @Override
    public Object visitJoin_clause(SQLParser.Join_clauseContext ctx) {
        return null;
    }

    @Override
    public Object visitJoin_list(SQLParser.Join_listContext ctx) {
        return null;
    }

    @Override
    public Object visitSelect_sentence(SQLParser.Select_sentenceContext ctx) {
        return null;
    }

    @Override
    public Object visitDcl_sentence(SQLParser.Dcl_sentenceContext ctx) {
        return null;
    }

    @Override
    public Object visitPermiso(SQLParser.PermisoContext ctx) {
        return null;
    }

    @Override
    public Object visitTabla_op(SQLParser.Tabla_opContext ctx) {
        return null;
    }

    @Override
    public Object visitCreate_user(SQLParser.Create_userContext ctx) {
        return null;
    }

    @Override
    public Object visitGrant_perm(SQLParser.Grant_permContext ctx) {
        return null;
    }

    @Override
    public Object visitRevoke_perm(SQLParser.Revoke_permContext ctx) {
        return null;
    }

    @Override
    public Object visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
