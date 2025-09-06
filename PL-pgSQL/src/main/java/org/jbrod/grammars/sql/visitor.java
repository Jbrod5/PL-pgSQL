package org.jbrod.grammars.sql;

import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import org.jbrod.controllers.sql.BD;

import org.jbrod.controllers.sql.Exepciones.BadConfigurationException;
import org.jbrod.controllers.sql.ForeignKeyConstraint;
import org.jbrod.controllers.sql.Tabla;
import org.jbrod.grammars.sql.*;
import org.jbrod.grammars.sql.paquetes_informacion.ColumnaInfo;
import org.jbrod.grammars.sql.paquetes_informacion.FKInfo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class visitor extends SQLBaseVisitor<Object> {

    BD bdController;
    public visitor(BD controller){
        bdController = controller;
    }




    @Override
    public Object visitSql_script(SQLParser.Sql_scriptContext ctx) {
        // deja que el BaseVisitor visite los hijos
        return visitChildren(ctx);
    }


    @Override
    public Object visitValor_op(SQLParser.Valor_opContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitValores(SQLParser.ValoresContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitOpciones(SQLParser.OpcionesContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitDdl_sentence(SQLParser.Ddl_sentenceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitCreate_schema(SQLParser.Create_schemaContext ctx) {
        String schemaName = ctx.id.getText();
        bdController.crearEsquema(schemaName);
        System.out.println("Esquema creado: " + schemaName);
        return visitChildren(ctx);
    }





    // = = = USE SCHEMA nombre;
    @Override
    public Object visitUse_schema(SQLParser.Use_schemaContext ctx) {
        String schemaName = ctx.id.getText();
        bdController.establecerEsquemaEnUso(schemaName);
        System.out.println("Usando esquema: " + schemaName);
        return visitChildren(ctx);
    }



    @Override
    public Object visitTipo_dato(SQLParser.Tipo_datoContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitRestriccion_columna(SQLParser.Restriccion_columnaContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public ColumnaInfo visitColumna(SQLParser.ColumnaContext ctx) {
        String nombre = ctx.IDENTIFICADOR().getText();
        String tipo = ctx.tipo_dato().getText();
        boolean esPK = false;
        boolean notNull = false;

        if (ctx.restriccion_columna() != null) {
            if (ctx.restriccion_columna().PRIMARY() != null) esPK = true;
            if (ctx.restriccion_columna().NOT() != null) notNull = true;
        }

        return new ColumnaInfo(nombre, tipo, esPK, notNull);
    }

    @Override
    public FKInfo visitLlave_foranea(SQLParser.Llave_foraneaContext ctx) {
        String colLocal = ctx.IDENTIFICADOR(0).getText();
        String tablaRef = ctx.IDENTIFICADOR(1).getText();
        String colRef = ctx.IDENTIFICADOR(2).getText();

        return new FKInfo(colLocal, tablaRef, colRef);
    }

    @Override
    public Object visitElemento_tabla(SQLParser.Elemento_tablaContext ctx) {
        if (ctx.columna() != null) {
            return visitColumna(ctx.columna());
        } else if (ctx.llave_foranea() != null) {
            return visitLlave_foranea(ctx.llave_foranea());
        }
        return null;
    }

    @Override
    public Object visitLista_elementos(SQLParser.Lista_elementosContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitCreate_table(SQLParser.Create_tableContext ctx) {
        String nombreTabla = ctx.IDENTIFICADOR().getText();

        List<ColumnaInfo> columnas = new ArrayList<>();
        List<FKInfo> fks = new ArrayList<>();

        for (SQLParser.Elemento_tablaContext elemCtx : ctx.lista_elementos().elemento_tabla()) {
            Object obj = visit(elemCtx);
            if (obj instanceof ColumnaInfo) {
                columnas.add((ColumnaInfo) obj);
            } else if (obj instanceof FKInfo) {
                fks.add((FKInfo) obj);
            }
        }

        // Ahora armamos la tabla en BD
        Tabla tabla = new Tabla(nombreTabla);

        for (ColumnaInfo col : columnas) {
            tabla.agregarColumna(col.nombre, col.tipo, col.esPK, col.notNull);
        }

        for (ForeignKeyInfo fk : fks) {
            tabla.agregarConstraintFK(fk.colLocal, fk.tablaRef, fk.colRef);
        }

        bdController.agregarTabla(tabla);

        System.out.println("Tabla creada: " + nombreTabla);
        return null;
    }







    // = = = ALTER TABLE nombre ADD COLUMN ...
    @Override
    public Object visitAlter_add_column(SQLParser.Alter_add_columnContext ctx) {
        String tableName = ctx.IDENTIFICADOR().getText();
        String colName = ctx.columna().IDENTIFICADOR().getText();
        String tipoDato = ctx.columna().tipo_dato().getText();

        // Extraer restricciones (aunque por ahora tu Tabla.agregarColumna no las usa directamente)
        boolean pk = ctx.columna().restriccion_columna() != null &&
                ctx.columna().restriccion_columna().PRIMARY() != null;
        boolean notNull = ctx.columna().restriccion_columna() != null &&
                ctx.columna().restriccion_columna().NOT() != null;

        try {
            bdController.agregarColumnaTabla(tableName, colName, tipoDato);
            System.out.println("Columna agregada: " + colName + " (" + tipoDato + ") a tabla " + tableName);

            if (pk) {
                System.out.println("Esta columna es PRIMARY KEY (aún falta integrarlo en agregarColumnaTabla)");
            }
            if (notNull) {
                System.out.println("Esta columna tiene restricción NOT NULL (aún falta integrarlo en agregarColumnaTabla)");
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Error al agregar columna: " + e.getMessage());
        } catch (BadConfigurationException e) {
            System.out.println(e.getMessage());
        }

        return visitChildren(ctx);
    }





    // = = = ALTER TABLE nombre DROP COLUMN col;
    @Override
    public Object visitAlter_drop_column(SQLParser.Alter_drop_columnContext ctx) {
        String tableName = ctx.IDENTIFICADOR(0).getText();
        String colName = ctx.IDENTIFICADOR(1).getText();
        try {
            bdController.eliminarColumnaTabla(tableName, colName);
        } catch (BadConfigurationException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Columna eliminada: " + colName + " de tabla " + tableName);
        return visitChildren(ctx);
    }




    @Override
    public Object visitAlter_add_constraint(SQLParser.Alter_add_constraintContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitAlter_drop_constraint(SQLParser.Alter_drop_constraintContext ctx) {
        return visitChildren(ctx);
    }





    // = = = DROP TABLE nombre;
    @Override
    public Object visitDrop_table(SQLParser.Drop_tableContext ctx) {
        String tableName = ctx.IDENTIFICADOR().getText();
        try {
            bdController.eliminarTabla(tableName);
        } catch (BadConfigurationException e) {
            System.out.println(e.getMessage());;
        }
        System.out.println("Tabla eliminada: " + tableName);
        return visitChildren(ctx);
    }





    @Override
    public Object visitDml_sentence(SQLParser.Dml_sentenceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitInsert_into(SQLParser.Insert_intoContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitAsignaciones(SQLParser.AsignacionesContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitUpdate_sentence(SQLParser.Update_sentenceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitDelete_sentence(SQLParser.Delete_sentenceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitColumna_prefijo(SQLParser.Columna_prefijoContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitColumnas(SQLParser.ColumnasContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitJoin_type(SQLParser.Join_typeContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitJoin_clause(SQLParser.Join_clauseContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitJoin_list(SQLParser.Join_listContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitSelect_sentence(SQLParser.Select_sentenceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitDcl_sentence(SQLParser.Dcl_sentenceContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitPermiso(SQLParser.PermisoContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitTabla_op(SQLParser.Tabla_opContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitCreate_user(SQLParser.Create_userContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitGrant_perm(SQLParser.Grant_permContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public Object visitRevoke_perm(SQLParser.Revoke_permContext ctx) {
        return visitChildren(ctx);
    }

}
