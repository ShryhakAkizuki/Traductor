import java.util.*;
import org.antlr.v4.runtime.tree.*;

public class DeclarationsVisitor extends EsJsVisitorImpl {

    // ------------------------- Funciones -------------------------

    private String blockArrowAsDef(String name,
                                   EsJsParser.FuncionFlechaContext ff) {
        String params = ff.listaParametros() != null
                ? visit(ff.listaParametros()) : "";
        return indent() + "def " + name + "(" + params + "):\n"
                + buildBlock(ff.bloque().instruccion());
    }
    // ------------------------- Overrides -------------------------

    @Override
    public String visitSentenciaVariable(EsJsParser.SentenciaVariableContext ctx) {
        return visit(ctx.listaDeclaracionVariable());
    }

    @Override
    public String visitListaDeclaracionVariable(
            EsJsParser.ListaDeclaracionVariableContext ctx) {
        StringBuilder sb = new StringBuilder();
        boolean isVar = ctx.modificadorVariable() != null
                && ctx.modificadorVariable().TKN_var() != null;
        for (EsJsParser.DeclaracionVariableContext decl : ctx.declaracionVariable()) {
            EsJsParser.ExpresionUnicaContext expr = decl.expresionUnica();
            if (isVar && expr == null) continue;
            if (expr != null
                    && expr.funcionFlecha() != null
                    && expr.funcionFlecha().bloque() != null) {
                sb.append(flushPendientes());
                sb.append(blockArrowAsDef(visit(decl.identificador()),
                        expr.funcionFlecha()));
            } else {
                String val     = visit(decl);   // puede poblar pendingDefs
                String pending = flushPendientes();
                sb.append(pending);
                sb.append(indent()).append(val).append("\n");
            }
        }
        return sb.toString();
    }

    @Override
    public String visitDeclaracionVariable(EsJsParser.DeclaracionVariableContext ctx) {
        String id = visit(ctx.identificador());
        return ctx.expresionUnica() != null
                ? id + " = " + visit(ctx.expresionUnica())
                : id + " = None";
    }

    @Override
    public String visitModificadorVariable(
            EsJsParser.ModificadorVariableContext ctx) { return ""; }

    @Override
    public String visitDeclaracionFuncion(EsJsParser.DeclaracionFuncionContext ctx) {
        String name   = visit(ctx.identificador());
        String params = ctx.listaParametros() != null
                ? visit(ctx.listaParametros()) : "";


        return indent() + "def " + name + "(" + params + "):\n"
                + buildBlock(ctx.bloque().instruccion());
    }

    @Override
    public String visitListaParametros(EsJsParser.ListaParametrosContext ctx) {
        StringBuilder sb = new StringBuilder();
        List<EsJsParser.DeclaracionVariableContext> vars = ctx.declaracionVariable();
        for (int i = 0; i < vars.size(); i++) {
            if (i > 0) sb.append(", ");
            EsJsParser.DeclaracionVariableContext v = vars.get(i);
            sb.append(visit(v.identificador()));
            if (v.expresionUnica() != null)
                sb.append("=").append(visit(v.expresionUnica()));
        }
        if (ctx.TKN_spread() != null) {
            if (!vars.isEmpty()) sb.append(", ");
            EsJsParser.IdentificadorContext id = ctx.identificador();
            sb.append("*").append(id != null ? visit(id) : "args");
        }
        return sb.toString();
    }

    @Override
    public String visitFuncionFlecha(EsJsParser.FuncionFlechaContext ctx) {
        String params;
        if (ctx.identificador() != null) {
            params = visit(ctx.identificador()); // forma  x => expr
        } else {
            params = ctx.listaParametros() != null
                    ? visit(ctx.listaParametros()) : "";
        }
        if (ctx.bloque() != null) {
            return "None  # flecha con bloque — convertir a def";
        }
        return "lambda " + params + ": " + visit(ctx.expresionUnica());
    }

    @Override
    public String visitSentenciaContinuar(EsJsParser.SentenciaContinuarContext ctx) {
        return indent() + "continue\n";
    }

    @Override
    public String visitSentenciaRomper(EsJsParser.SentenciaRomperContext ctx) {
        return indent() + "break\n";
    }

    @Override
    public String visitSentenciaRetornar(EsJsParser.SentenciaRetornarContext ctx) {
        String expr    = ctx.secuenciaExpresiones() != null
                ? visit(ctx.secuenciaExpresiones()) : null;
        String pending = flushPendientes(); // clases generadas dentro del return
        return pending + indent()
                + (expr != null ? "return " + expr : "return") + "\n";
    }

    @Override
    public String visitSentenciaIntentar(EsJsParser.SentenciaIntentarContext ctx) {
        String excVar = ctx.identificador() != null
                ? visit(ctx.identificador()) : "_e";
        return indent() + "try:\n"
                + buildBlock(ctx.bloque(0).instruccion())
                + indent() + "except Exception as " + excVar + ":\n"
                + buildBlock(ctx.bloque(1).instruccion());
    }
}
