import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.tree.ParseTree;

public abstract class ControlFlowVisitor extends ExpressionVisitor {

    private int switchCounter = 0;

    private record SwitchEntry(String condition, List<EsJsParser.InstruccionContext> instructions) {
        boolean isDefault() {
            return condition == null;
        }
    }

    // ------------------------- Funciones -------------------------

    private String emitInstructions(List<EsJsParser.InstruccionContext> instructions) {
        StringBuilder output = new StringBuilder();
        for (EsJsParser.InstruccionContext instruction : instructions) {
            String code = visit(instruction);
            if (code != null && !code.isBlank()) {
                output.append(code);
                if (!code.endsWith("\n")) output.append("\n");
            }
        }
        return output.toString();
    }

    private String emitBlock(EsJsParser.BloqueContext ctx) {
        indentLevel++;
        String body = emitInstructions(ctx.instruccion());
        if (body.isBlank()) body = indent() + "pass\n";
        indentLevel--;
        return body;
    }

    private String emitForExpressions(EsJsParser.SecuenciaExpresionesContext ctx) {
        StringBuilder output = new StringBuilder();
        for (EsJsParser.ExpresionUnicaContext expr : ctx.expresionUnica()) {
            output.append(indent()).append(inc_dec(expr)).append("\n");
        }
        return output.toString();
    }

    private String emitForInitializers(EsJsParser.InicioForContext ctx) {
        if (ctx == null) return "";
        if (ctx.listaDeclaracionVariable() != null)
            return emitVariableDeclarations(ctx.listaDeclaracionVariable());
        return emitForExpressions(ctx.secuenciaExpresiones());
    }

    private String emitVariableDeclarations(EsJsParser.ListaDeclaracionVariableContext ctx) {
        StringBuilder output = new StringBuilder();
        for (EsJsParser.DeclaracionVariableContext declaration : ctx.declaracionVariable()) {
            output.append(indent()).append(visit(declaration.identificador()));
            if (declaration.expresionUnica() != null) {
                output.append(" = ").append(visit(declaration.expresionUnica()));
            } else {
                output.append(" = None");
            }
            output.append("\n");
        }
        return output.toString();
    }

    private String emitUpdate(EsJsParser.ActualizacionForContext ctx) {
        if (ctx == null) return "";
        return emitForExpressions(ctx.secuenciaExpresiones());
    }

    private String emitIf(EsJsParser.SentenciaSiContext ctx, boolean asElif) {
        StringBuilder output = new StringBuilder();
        output.append(indent())
                .append(asElif ? "elif " : "if ")
                .append(visit(ctx.secuenciaExpresiones()))
                .append(":\n");
        output.append(emitBlock(ctx.bloque(0)));

        if (ctx.TKN_sino() != null) {
            if (ctx.sentenciaSi() != null) {
                output.append(emitIf(ctx.sentenciaSi(), true));
            } else {
                output.append(indent()).append("else:\n");
                output.append(emitBlock(ctx.bloque(1)));
            }
        }
        return output.toString();
    }

    private List<SwitchEntry> switchEntries(EsJsParser.BloqueCasoContext ctx) {
        List<SwitchEntry> entries = new ArrayList<>();
        for (int i = 0; i < ctx.getChildCount(); i++) {
            ParseTree child = ctx.getChild(i);
            if (child instanceof EsJsParser.CasoSTMTContext caseCtx) {
                entries.add(new SwitchEntry(visit(caseCtx.secuenciaExpresiones()), caseCtx.instruccion()));
            } else if (child instanceof EsJsParser.CasoDefectoContext defaultCtx) {
                entries.add(new SwitchEntry(null, defaultCtx.instruccion()));
            }
        }
        return entries;
    }

    private String anyCaseMatches(String valueName, List<SwitchEntry> entries) {
        List<String> conditions = new ArrayList<>();
        for (SwitchEntry entry : entries) {
            if (!entry.isDefault()) conditions.add(valueName + " == " + entry.condition());
        }
        if (conditions.isEmpty()) return "True";
        return String.join(" or ", conditions);
    }

    // ------------------------- Overrides -------------------------

    @Override
    public String visitSentenciaSi(EsJsParser.SentenciaSiContext ctx) {
        return emitIf(ctx, false);
    }

    @Override
    public String visitSentenciaIterar(EsJsParser.SentenciaIterarContext ctx) {
        StringBuilder output = new StringBuilder();

        if (ctx.TKN_hacer() != null) {
            output.append(indent()).append("while True:\n");
            output.append(emitBlock(ctx.bloque()));
            indentLevel++;
            output.append(indent())
                    .append("if not (")
                    .append(visit(ctx.secuenciaExpresiones()))
                    .append("):\n");
            indentLevel++;
            output.append(indent()).append("break\n");
            indentLevel -= 2;
            return output.toString();
        }

        if (ctx.TKN_mientras() != null) {
            output.append(indent())
                    .append("while ")
                    .append(visit(ctx.secuenciaExpresiones()))
                    .append(":\n");
            output.append(emitBlock(ctx.bloque()));
            return output.toString();
        }

        output.append(visitInicioFor(ctx.inicioFor()));
        String condition = ctx.condicionFor() != null ? visitCondicionFor(ctx.condicionFor()) : "True";
        output.append(indent()).append("while ").append(condition).append(":\n");

        indentLevel++;
        String body = emitInstructions(ctx.bloque().instruccion());
        String update = visitActualizacionFor(ctx.actualizacionFor());
        if (body.isBlank() && update.isBlank()) {
            output.append(indent()).append("pass\n");
        } else {
            output.append(body).append(update);
        }
        indentLevel--;
        return output.toString();
    }

    @Override
    public String visitInicioFor(EsJsParser.InicioForContext ctx) {
        return emitForInitializers(ctx);
    }

    @Override
    public String visitCondicionFor(EsJsParser.CondicionForContext ctx) {
        return visit(ctx.secuenciaExpresiones());
    }

    @Override
    public String visitActualizacionFor(EsJsParser.ActualizacionForContext ctx) {
        return emitUpdate(ctx);
    }

    @Override
    public String visitSentenciaElegir(EsJsParser.SentenciaElegirContext ctx) {
        String valueName = "_switch_value_" + switchCounter;
        String matchedName = "_switch_matched_" + switchCounter;
        switchCounter++;

        StringBuilder output = new StringBuilder();
        output.append(indent()).append(valueName).append(" = ").append(visit(ctx.secuenciaExpresiones())).append("\n");
        output.append(indent()).append(matchedName).append(" = False\n");
        output.append(indent()).append("while True:\n");

        indentLevel++;
        output.append(visit(ctx.bloqueCaso()));
        output.append(indent()).append("break\n");
        indentLevel--;
        return output.toString();
    }

    @Override
    public String visitBloqueCaso(EsJsParser.BloqueCasoContext ctx) {
        StringBuilder output = new StringBuilder();
        String valueName = "_switch_value_" + (switchCounter - 1);
        String matchedName = "_switch_matched_" + (switchCounter - 1);
        List<SwitchEntry> entries = switchEntries(ctx);
        String anyCase = anyCaseMatches(valueName, entries);

        for (SwitchEntry entry : entries) {
            String condition = entry.isDefault()
                    ? matchedName + " or not (" + anyCase + ")"
                    : matchedName + " or " + valueName + " == " + entry.condition();

            output.append(indent()).append("if ").append(condition).append(":\n");
            indentLevel++;
            output.append(indent()).append(matchedName).append(" = True\n");
            String body = emitInstructions(entry.instructions());
            if (body.isBlank()) body = indent() + "pass\n";
            output.append(body);
            indentLevel--;
        }
        return output.toString();
    }

    @Override
    public String visitCasoSTMT(EsJsParser.CasoSTMTContext ctx) {
        return emitInstructions(ctx.instruccion());
    }

    @Override
    public String visitCasoDefecto(EsJsParser.CasoDefectoContext ctx) {
        return emitInstructions(ctx.instruccion());
    }
}
