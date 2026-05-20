import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

/**
 * Implementación del Visitor para traducir EsJs a Python.
 * Integrantes:
 * - Oscar Leonardo Riveros Perez
 */

public class Main {
    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            System.err.println("Uso: java Main <archivo.esjs>");
            System.exit(1);
        }

        // ── 1. Análisis léxico ───────────────────────────────────────────
        CharStream input = CharStreams.fromFileName(args[0]);
        EsJsLexer  lexer = new EsJsLexer(input);

        // Capturar errores léxicos
        lexer.removeErrorListeners();
        lexer.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?,?> rec, Object sym,
                                    int line, int col,
                                    String msg, RecognitionException e) {
                System.err.printf("[Error Léxico]  línea %d:%d  %s%n",
                        line, col, msg);
            }
        });

        // ── 2. Análisis sintáctico ───────────────────────────────────────
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        EsJsParser        parser = new EsJsParser(tokens);

        parser.removeErrorListeners();
        final boolean[] hasError = {false};
        parser.addErrorListener(new BaseErrorListener() {
            @Override
            public void syntaxError(Recognizer<?,?> rec, Object sym,
                                    int line, int col,
                                    String msg, RecognitionException e) {
                hasError[0] = true;
                System.err.printf("[Error Sintáctico]  línea %d:%d  %s%n",
                        line, col, msg);
            }
        });

        ParseTree tree = parser.s();   // regla raíz

        if (hasError[0]) {
            System.err.println("Traducción cancelada por errores sintácticos.");
            System.exit(2);
        }

        // ── 3. Traducción ────────────────────────────────────────────────
        DeclarationsVisitor translator = new DeclarationsVisitor();
        String python = translator.visit(tree);

        // ── 4. Salida ────────────────────────────────────────────────────
        System.out.print(python);
    }
}