package org.jbrod;

import org.antlr.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.jbrod.grammars.SQLLexer;
import org.jbrod.grammars.SQLParser;

public class MainSQLTest {
    public static void main(String[] args) throws Exception {
        // Leer entrada desde un string o archivo
        String input = "SELECT id, nombre FROM usuarios;";
        SQLLexer lexer = new SQLLexer(CharStreams.fromString(input));
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SQLParser parser = new SQLParser(tokens);

        // Invocar regla inicial (ej: select_sentence)
        ParseTree tree = parser.select_sentence();

        // Imprimir el árbol
        System.out.println(tree.toStringTree(parser));
    }
}
