package org.jbrod;

//import org.antlr.runtime.tree.ParseTree;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.jbrod.controllers.sql.BD;
import org.jbrod.grammars.sql.SQLLexer;
import org.jbrod.grammars.sql.SQLParser;
import org.jbrod.grammars.sql.visitor;

public class MainSQLTest {
    public static void main(String[] args) throws Exception {
        try {
            // 1. Crear el controlador BD
            BD bd = new BD();
            System.out.println("Se exportaran los yamls vacios .o");
            bd.exportarYamls();

            // 2. Ejemplo de entrada SQL
            String sqlInput = ""
                    + "-- Crear y usar esquemas\n"
                    + "CREATE SCHEMA ventas;\n"
                    + "CREATE SCHEMA compras;\n"
                    + "USE SCHEMA ventas;\n"
                    + "\n"
                    + "-- Crear tablas\n"
                    + "CREATE TABLE clientes (\n"
                    + "    id INTEGER PRIMARY KEY,\n"
                    + "    nombre VARCHAR(100) NOT NULL,\n"
                    + "    activo BOOLEAN NULL,\n"
                    + "    FOREIGN KEY (id) REFERENCES clientes(id)\n"
                    + ");\n"
                    + "\n"
                    + "CREATE TABLE pedidos (\n"
                    + "    pedido_id INTEGER PRIMARY KEY,\n"
                    + "    cliente_id INTEGER NOT NULL,\n"
                    + "    monto INTEGER NOT NULL,\n"
                    + "    FOREIGN KEY (cliente_id) REFERENCES clientes(id)\n"
                    + ");";

            // 3. Alimentar el lexer y parser de ANTLR con la entrada
            SQLLexer lexer = new SQLLexer(CharStreams.fromString(sqlInput));
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SQLParser parser = new SQLParser(tokens);

            // 4. Generar el árbol sintáctico
            SQLParser.Sql_scriptContext tree = parser.sql_script();

            // 5. Crear visitor con la BD y recorrer el árbol
            visitor visitor = new visitor(bd); // <-- aquí pasamos el mismo BD
            visitor.visit(tree);

            // 6. Mensaje de éxito
            System.out.println("\nPrueba finalizada, árbol procesado.");

            // 7. Exportar YAML al final
            bd.exportarYamls();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
