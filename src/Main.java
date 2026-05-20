import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * Implementación del Visitor para traducir EsJs a Python.
 * Integrantes:
 * - Oscar Leonardo Riveros Perez
 * - Cristian Camilo Barrera
 * - Nicolas Martinez Lopez
 */

public class Main {
    public static void main(String[] args) throws Exception {
        CharStream input = CharStreams.fromStream(System.in);
        EsJsLexer lexer = new EsJsLexer(input);

        lexer.removeErrorListeners();
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> rec, Object sym,
                                    int line, int col,
                                    String msg, RecognitionException e) {
                System.err.printf("[Error Léxico] línea %d:%d %s%n", line, col, msg);
            }
        });

        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EsJsParser parser = new EsJsParser(tokens);

        parser.removeErrorListeners();
        final boolean[] hasError = {false};
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?, ?> rec, Object sym,
                                    int line, int col,
                                    String msg, RecognitionException e) {
                hasError[0] = true;
                System.err.printf("[Error Sintáctico] línea %d:%d %s%n", line, col, msg);
            }
        });

        ParseTree tree = parser.s();

        if (hasError[0]) {
            return;
        }

        DeclarationsVisitor translator = new DeclarationsVisitor();
        String python = translator.visit(tree);
        System.out.print(python);
    }
}