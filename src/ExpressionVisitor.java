import java.util.*;
import org.antlr.v4.runtime.tree.*;

public abstract class ExpressionVisitor extends  EsJsBaseVisitor<String> {

    // ------------------------- Variables -------------------------

    //Flags para importar librerias
    protected boolean needsMathLib            = false;
    protected boolean needsRandomLib          = false;
    protected boolean needsIndefinidoSentinel = false;

    protected int   indentLevel = 0;
    protected int   objCounter = 0;
    protected final List<String> DefinicionesPendientes = new ArrayList<>();

    // ------------------------- Funciones -------------------------

    protected String indent() { return "    ".repeat(indentLevel); }

    protected boolean isToken(ParseTree node, int type) {
        return node instanceof TerminalNode
                && ((TerminalNode) node).getSymbol().getType() == type;
    }

    protected String flushPendientes() {
        if (DefinicionesPendientes.isEmpty()) return "";
        StringBuilder Output = new StringBuilder();
        DefinicionesPendientes.forEach(Output::append);
        DefinicionesPendientes.clear();
        return Output.toString();
    }

    protected String inc_dec(EsJsParser.ExpresionUnicaContext ctx) {
        List<EsJsParser.ExpresionUnicaContext> sub = ctx.expresionUnica();
        if (!sub.isEmpty()) {
            ParseTree c1 = ctx.getChild(1);
            if (isToken(c1, EsJsLexer.TKN_increment)) return visit(sub.getFirst()) + " += 1";
            if (isToken(c1, EsJsLexer.TKN_decrement)) return visit(sub.getFirst()) + " -= 1";
        }
        return visit(ctx);
    }

    private String visitMateExpr(EsJsParser.TipoMetodoMateContext ctx) {
        needsMathLib = true;
        return visit(ctx);
    }

    private String visitNumeroExpr(EsJsParser.TipoMetodoNumeroContext ctx) {
        return visit(ctx);
    }

    private String buildCall(String variable, EsJsParser.ArgumentosContext argsCtx) {
        String all   = visit(argsCtx);
        String inner = all.length() > 2 ? all.substring(1, all.length() - 1) : "";

        int dotIdx = variable.lastIndexOf(".##");
        if (dotIdx >= 0) {
            String obj    = variable.substring(0, dotIdx);
            String marker = variable.substring(dotIdx + 1);

            switch (marker) {
                case "##APPEND##":
                    return obj + ".append(" + inner + ")";

                case "##FIXED##": // x.fijarDecimales(n) → f"{x:.{n}f}"
                    return "f\"{" + obj + ":." + inner + "f}\"";

                case "##EXPONENTIAL##": // x.aExponencial() → f"{x:e}"
                    return "f\"{" + obj + ":e}\"";

                case "##TOSTRING##":
                    return "str(" + obj + ")";

                case "##VALUEOF##":
                    return "float(" + obj + ")";

                case "##TOLOCALESTRING##":
                    return "f\"{" + obj + ":,}\"";

                default:
                    break;
            }
        }
        return variable + all;
    }

    private String translateNumeroMethod(String metodo, String args) {
        needsMathLib = true;
        return switch (metodo) {
            case "interpretarDecimal" -> "float(" + args + ")";
            case "interpretarEntero" -> "int(" + args + ")";
            case "esFinito" -> "math.isfinite(" + args + ")";
            case "esEntero" -> "(isinstance(" + args + ", int)"
                    + " or float(" + args + ").is_integer())";
            case "esEnteroSeguro" -> "(-9007199254740991 <= (" + args + ") <= 9007199254740991)";
            case "NeN" -> "math.isnan(" + args + ")";
            default -> args;
        };
    }

    private String translateMateMethod(String metodo, String args) {
        needsMathLib = true;
        return switch (metodo) {
            case "absoluto" -> "abs(" + args + ")";
            case "raizCuadrada" -> "math.sqrt(" + args + ")";
            case "raizCubica" -> "(" + args + ") ** (1/3)";
            case "potencia" -> "math.pow(" + args + ")";
            case "maximo" -> "max(" + args + ")";
            case "minimo" -> "min(" + args + ")";
            case "redondear" -> "round(" + args + ")";
            case "floor", "redondearHaciaAbajo" -> "math.floor(" + args + ")";
            case "redondearHaciaArriba" -> "math.ceil(" + args + ")";
            case "truncar" -> "math.trunc(" + args + ")";
            case "aleatorio" -> {
                needsRandomLib = true;
                yield "random.random()";
            }
            case "seno" -> "math.sin(" + args + ")";
            case "coseno" -> "math.cos(" + args + ")";
            case "tangente" -> "math.tan(" + args + ")";
            case "arcoseno" -> "math.asin(" + args + ")";
            case "arcocoseno" -> "math.acos(" + args + ")";
            case "arcotangente" -> "math.atan(" + args + ")";
            case "arcotangente2" -> "math.atan2(" + args + ")";
            case "logaritmo" -> "math.log(" + args + ")";
            case "logaritmoBase10" -> "math.log10(" + args + ")";
            case "logaritmoBase2" -> "math.log2(" + args + ")";
            case "logaritmoDe1Mas" -> "math.log1p(" + args + ")";
            case "exponencialMate" -> "math.exp(" + args + ")";
            case "senoHiperbolico" -> "math.sinh(" + args + ")";
            case "cosenoHiperbolico" -> "math.cosh(" + args + ")";
            case "tangenteHiperbolica" -> "math.tanh(" + args + ")";
            case "arcosenoHiperbolico" -> "math.asinh(" + args + ")";
            case "arcocosenoHiperbolico" -> "math.acosh(" + args + ")";
            case "arcotangenteHiperbolica" -> "math.atanh(" + args + ")";
            case "signo" -> "math.copysign(1, " + args + ")";
            case "hipotenusa" -> "math.hypot(" + args + ")";
            default -> "math." + metodo + "(" + args + ")";
        };
    }

    private String buildObjectClass(List<EsJsParser.PropiedadContext> props) {
        int    saved    = indentLevel;
        String clsName  = "_EsJsObj" + objCounter++;
        StringBuilder def = new StringBuilder();

        def.append(indent()).append("class ").append(clsName).append(":\n");
        indentLevel++;

        def.append(indent()).append("def __init__(self):\n");
        indentLevel++;
        boolean anyData = false;
        for (EsJsParser.PropiedadContext p : props) {
            if (p.bloque() != null || p.TKN_spread() != null) continue;
            String key, val;
            if (p.identificador() != null && p.TKN_colon() == null) {
                key = val = visit(p.identificador());
            } else if (p.nombrePropiedad() != null) {
                key = visit(p.nombrePropiedad());
                val = visit(p.expresionUnica(0));
            } else continue;
            def.append(indent()).append("self.").append(key)
                    .append(" = ").append(val).append("\n");
            anyData = true;
        }
        if (!anyData) def.append(indent()).append("pass\n");
        indentLevel--;

        for (EsJsParser.PropiedadContext p : props) {
            if (p.bloque() == null) continue;
            String mName   = visit(p.nombrePropiedad());
            String mParams = p.listaParametros() != null
                    ? "self, " + visit(p.listaParametros()) : "self";
            def.append(indent()).append("def ").append(mName)
                    .append("(").append(mParams).append("):\n");
            def.append(buildBlock(p.bloque().instruccion()));
        }

        indentLevel = saved;
        DefinicionesPendientes.add(def.toString());
        return clsName + "()";
    }

    protected String buildBlock(List<EsJsParser.InstruccionContext> insts) {
        StringBuilder sb = new StringBuilder();
        indentLevel++;
        if (insts.isEmpty()) {
            sb.append(indent()).append("pass\n");
        } else {
            for (EsJsParser.InstruccionContext inst : insts)
                sb.append(visit(inst));
        }
        indentLevel--;
        return sb.toString();
    }

    // ------------------------- Overrides -------------------------

    @Override
    public String visitSentenciaExpresion(EsJsParser.SentenciaExpresionContext ctx) {
        StringBuilder output = new StringBuilder();
        for(EsJsParser.ExpresionUnicaContext e: ctx.secuenciaExpresiones().expresionUnica()){
            String code = inc_dec(e);
            String pendientes = flushPendientes();
            output.append(pendientes);
            output.append(indent()).append(code).append("\n");
        }
        return output.toString();
    }

    @Override
    public String visitSecuenciaExpresiones(EsJsParser.SecuenciaExpresionesContext ctx) {
        StringBuilder output = new StringBuilder();
        List<EsJsParser.ExpresionUnicaContext> exprs = ctx.expresionUnica();
        for (int i = 0; i < exprs.size(); i++) {
            if (i > 0) output.append(", ");
            output.append(visit(exprs.get(i)));
        }
        return output.toString();
    }

    @Override
    public String visitExpresionUnica(EsJsParser.ExpresionUnicaContext ctx) {
        List<EsJsParser.ExpresionUnicaContext> sub = ctx.expresionUnica();

        if (ctx.funcionFlecha() != null)
            return visit(ctx.funcionFlecha());

        if (ctx.TKN_ambiente() != null && sub.isEmpty())
            return "self";

        if (ctx.literal() != null)
            return visit(ctx.literal());

        if (ctx.arregloLiteral() != null)
            return visit(ctx.arregloLiteral());

        if (ctx.objetoLiteral() != null)
            return visit(ctx.objetoLiteral());

        // Identificador puro
        if (ctx.identificador() != null && sub.isEmpty() && ctx.tipoNativo() == null)
            return visit(ctx.identificador());

        if (ctx.TKN_crear() != null)
            return visit(ctx.restoCrear());

        if (ctx.TKN_tipoDe() != null)
            return "type(" + visit(sub.getFirst()) + ").__name__";

        if (ctx.operadorUnario() != null)
            return visit(ctx.operadorUnario()) + visit(sub.getFirst());

        if (ctx.TKN_Mate() != null)
            return visitMateExpr(ctx.tipoMetodoMate());

        if (ctx.TKN_Numero() != null)
            return visitNumeroExpr(ctx.tipoMetodoNumero());

        if (ctx.tipoNativo() != null) {
            String t = visit(ctx.tipoNativo());
            return ctx.argumentos() != null ? t + visit(ctx.argumentos()) : t + "()";
        }

        // (Expresion)
        if (isToken(ctx.getChild(0), EsJsLexer.TKN_opening_par) && sub.size() == 1 && ctx.getChildCount() == 3)
            return "(" + visit(sub.get(0)) + ")";

        if (!sub.isEmpty()) {
            String left = visit(sub.getFirst());
            ParseTree  c1   = ctx.getChild(1);

            if (isToken(c1, EsJsLexer.TKN_increment)) return left + " + 1";
            if (isToken(c1, EsJsLexer.TKN_decrement)) return left + " - 1";

            // Expresion[acceso] o Expresion.acceso
            if (isToken(c1, EsJsLexer.TKN_opening_bra)) {

                List<EsJsParser.ExpresionUnicaContext> secuencia = ctx.secuenciaExpresiones().expresionUnica();
                String idx = secuencia.isEmpty() ? "" : visit(secuencia.get(0));

                if ((idx.startsWith("\"") && idx.endsWith("\"")) || (idx.startsWith("'")  && idx.endsWith("'")))
                    return left + "." + idx.substring(1, idx.length() - 1);
                return left + "[" + idx + "]";
            }

            // Expresion.metodo
            if (isToken(c1, EsJsLexer.TKN_period)) {
                String member = visit(ctx.nombreAccesible());
                if ("##LEN##".equals(member)) return "len(" + left + ")";
                return left + "." + member;
            }

            // Expresion(args) -> llamada a metodo
            if (c1 instanceof EsJsParser.ArgumentosContext)
                return buildCall(left, ctx.argumentos());

            if (isToken(c1, EsJsLexer.TKN_power))
                return left + " ** " + visit(sub.get(1));

            if (isToken(c1, EsJsLexer.TKN_and))
                return left + " and " + visit(sub.get(1));

            if (isToken(c1, EsJsLexer.TKN_or))
                return left + " or " + visit(sub.get(1));

            if (isToken(c1, EsJsLexer.TKN_nulish))
                return "(" + left + " if " + left + " is not None else "
                        + visit(sub.get(1)) + ")";

            if (isToken(c1, EsJsLexer.TKN_assign))
                return left + " = " + visit(sub.get(1));

            if (isToken(c1, EsJsLexer.TKN_ternary))
                return visit(sub.get(1)) + " if " + left + " else " + visit(sub.get(2));

            if (c1 instanceof EsJsParser.OperadorMultiplicacionContext)
                return left + " " + visit(ctx.operadorMultiplicacion())
                        + " " + visit(sub.get(1));

            if (c1 instanceof EsJsParser.OperadorAdicionContext)
                return left + " " + visit(ctx.operadorAdicion())
                        + " " + visit(sub.get(1));

            if (c1 instanceof EsJsParser.OperadorRelacionalContext)
                return left + " " + visit(ctx.operadorRelacional())
                        + " " + visit(sub.get(1));

            if (c1 instanceof EsJsParser.OperadorIgualdadContext) {
                String op = visit(ctx.operadorIgualdad());
                if ("is_same_type_and_eq".equals(op)) {
                    return "(type(" + left + ") is type(" + visit(sub.get(1)) + ") and "
                            + left + " == " + visit(sub.get(1)) + ")";
                } else if ("not_same_type_and_eq".equals(op)) {
                    return "not (type(" + left + ") is type(" + visit(sub.get(1)) + ") and "
                            + left + " == " + visit(sub.get(1)) + ")";
                } else {
                    return left + " " + op + " " + visit(sub.get(1));
                }
            }

            if (c1 instanceof EsJsParser.OperadorAsignacionContext)
                return left + " " + visit(ctx.operadorAsignacion())
                        + " " + visit(sub.get(1));
        }

        return ctx.getText(); // fallback
    }

    @Override
    public String visitRestoCrear(EsJsParser.RestoCrearContext ctx) {
        String name;
        if (ctx.tipoNativo()    != null) name = visit(ctx.tipoNativo());
        else if (ctx.identificador() != null) name = visit(ctx.identificador());
        else name = ctx.getText();
        String args = ctx.argumentos() != null ? visit(ctx.argumentos()) : "()";
        return name + args;
    }

    @Override
    public String visitNombreAccesible(EsJsParser.NombreAccesibleContext ctx) {
        if (ctx.TKN_longitud()          != null) return "##LEN##";
        if (ctx.TKN_agregar()           != null) return "##APPEND##";
        if (ctx.TKN_fijarDecimales()    != null) return "##FIXED##";
        if (ctx.TKN_aExponencial()      != null) return "##EXPONENTIAL##";
        if (ctx.TKN_aCadena()           != null) return "##TOSTRING##";
        if (ctx.TKN_valorDe()           != null) return "##VALUEOF##";
        if (ctx.TKN_aCadenaLocalizado() != null) return "##TOLOCALESTRING##";
        if (ctx.identificador()         != null) return visit(ctx.identificador());

        return ctx.getText();
    }

    @Override
    public String visitTipoMetodoNumero(EsJsParser.TipoMetodoNumeroContext ctx) {
        if (ctx.constanteNumero() != null)
            return visit(ctx.constanteNumero());

        String m     = visit(ctx.metodoNumero());
        String all   = visit(ctx.argumentos());
        String inner = all.length() > 2 ? all.substring(1, all.length() - 1) : "";
        return translateNumeroMethod(m, inner);
    }

    @Override
    public String visitConstanteNumero(EsJsParser.ConstanteNumeroContext ctx) {
        return switch (ctx.getText()) {
            case "MAX_VALUE" -> "1.7976931348623157e+308";
            case "MIN_VALUE" -> "5e-324";
            case "POSITIVE_INFINITY" -> "float('inf')";
            case "NEGATIVE_INFINITY" -> "float('-inf')";
            case "NeN" -> "float('nan')";
            default -> "float('nan')";
        };
    }

    @Override
    public String visitMetodoNumero(EsJsParser.MetodoNumeroContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitTipoMetodoMate(EsJsParser.TipoMetodoMateContext ctx) {
        needsMathLib = true;
        if (ctx.constanteMate() != null)
            return visit(ctx.constanteMate());

        String m     = visit(ctx.metodoMate());
        String all   = visit(ctx.argumentos());
        String inner = all.length() > 2 ? all.substring(1, all.length() - 1) : "";
        return translateMateMethod(m, inner);
    }

    @Override
    public String visitConstanteMate(EsJsParser.ConstanteMateContext ctx) {
        needsMathLib = true;
        return switch (ctx.getText()) {
            case "PI" -> "math.pi";
            case "E" -> "math.e";
            case "LN2" -> "math.log(2)";
            case "LN10" -> "math.log(10)";
            case "LOG2E" -> "math.log2(math.e)";
            case "LOG10E" -> "math.log10(math.e)";
            case "SQRT2" -> "math.sqrt(2)";
            case "SQRT1_2" -> "math.sqrt(0.5)";
            default -> "math." + ctx.getText().toLowerCase();
        };
    }

    @Override
    public String visitMetodoMate(EsJsParser.MetodoMateContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitTipoNativo(EsJsParser.TipoNativoContext ctx) {
        if (ctx.TKN_Arreglo() != null) return "list";
        if (ctx.TKN_Cadena()  != null) return "str";
        if (ctx.TKN_Matriz()  != null) return "list";
        return ctx.getText();
    }

    @Override
    public String visitArgumentos(EsJsParser.ArgumentosContext ctx) {
        return ctx.listaArgumentos() == null ? "()"
                : "(" + visit(ctx.listaArgumentos()) + ")";
    }

    @Override
    public String visitListaArgumentos(EsJsParser.ListaArgumentosContext ctx) {
        StringBuilder Output = new StringBuilder();
        List<EsJsParser.ArgumentoContext> args = ctx.argumento();
        for (int i = 0; i < args.size(); i++) {
            if (i > 0) Output.append(", ");
            Output.append(visit(args.get(i)));
        }
        return Output.toString();
    }

    @Override
    public String visitArgumento(EsJsParser.ArgumentoContext ctx) {
        return (ctx.TKN_spread() != null ? "*" : "") + visit(ctx.expresionUnica());
    }

    @Override
    public String visitOperadorMultiplicacion(
            EsJsParser.OperadorMultiplicacionContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOperadorAdicion(EsJsParser.OperadorAdicionContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOperadorRelacional(EsJsParser.OperadorRelacionalContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOperadorIgualdad(EsJsParser.OperadorIgualdadContext ctx) {
        String op = ctx.getText();
        return switch (op) {
            case "===" -> "is_same_type_and_eq";
            case "!==" -> "not_same_type_and_eq";
            default    -> op;   // "==" o "!=" normales
        };
    }

    @Override
    public String visitOperadorAsignacion(EsJsParser.OperadorAsignacionContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitOperadorUnario(EsJsParser.OperadorUnarioContext ctx) {
        return switch (ctx.getText()) {
            case "!" -> "not ";
            case "-" -> "-";
            case "+" -> "+";
            default -> "";
        };
    }

    @Override
    public String visitIdentificador(EsJsParser.IdentificadorContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitLiteral(EsJsParser.LiteralContext ctx) {
        if (ctx.TKN_verdadero()  != null) return "True";
        if (ctx.TKN_falso()      != null) return "False";
        if (ctx.TKN_nulo()       != null) return "None";
        if (ctx.TKN_indefinido() != null) {
            needsIndefinidoSentinel = true;
            return "_indefinido";
        }
        if (ctx.TKN_Infinito()   != null) return "float('inf')";
        if (ctx.TKN_NuN()        != null) return "float('nan')";
        if (ctx.TKN_str()        != null) return ctx.getText();
        if (ctx.TKN_num()        != null) return ctx.getText();
        if (ctx.TKN_reg()        != null) {

            String raw  = ctx.getText();
            int    last = raw.lastIndexOf('/');
            String pat  = raw.substring(1, last).replace("\\", "\\\\");
            return "\"" + pat + "\"";
        }
        return ctx.getText();
    }

    @Override
    public String visitArregloLiteral(EsJsParser.ArregloLiteralContext ctx) {
        return ctx.listaElementos() == null ? "[]"
                : "[" + visit(ctx.listaElementos()) + "]";
    }

    @Override
    public String visitListaElementos(EsJsParser.ListaElementosContext ctx) {
        StringBuilder Output = new StringBuilder();
        List<EsJsParser.ElementoContext> elems = ctx.elemento();
        for (int i = 0; i < elems.size(); i++) {
            if (i > 0) Output.append(", ");
            Output.append(visit(elems.get(i)));
        }
        return Output.toString();
    }

    @Override
    public String visitElemento(EsJsParser.ElementoContext ctx) {
        return (ctx.TKN_spread() != null ? "*" : "") + visit(ctx.expresionUnica());
    }

    @Override
    public String visitObjetoLiteral(EsJsParser.ObjetoLiteralContext ctx) {
        List<EsJsParser.PropiedadContext> props =
                ctx.listaPropiedades().propiedad();

        if (ctx.listaPropiedades() != null) {
            props = ctx.listaPropiedades().propiedad();
        }

        return buildObjectClass(props);
    }

    @Override
    public String visitListaPropiedades(EsJsParser.ListaPropiedadesContext ctx) {
        StringBuilder Output = new StringBuilder();
        List<EsJsParser.PropiedadContext> props = ctx.propiedad();
        for (int i = 0; i < props.size(); i++) {
            if (i > 0) Output.append(", ");
            Output.append(visit(props.get(i)));
        }
        return Output.toString();
    }

    @Override
    public String visitPropiedad(EsJsParser.PropiedadContext ctx) {
        if (ctx.TKN_spread() != null)
            return "**vars(" + visit(ctx.expresionUnica(0)) + ")";
        if (ctx.identificador() != null && ctx.TKN_colon() == null)
            return visit(ctx.identificador());
        if (ctx.nombrePropiedad() != null && ctx.TKN_colon() != null)
            return visit(ctx.nombrePropiedad()) + "=" + visit(ctx.expresionUnica(0));
        if (ctx.bloque() != null)
            return "def " + visit(ctx.nombrePropiedad()) + "(self): ...";
        return ctx.getText();
    }

    @Override
    public String visitNombrePropiedad(EsJsParser.NombrePropiedadContext ctx) {
        if (ctx.identificador() != null) return visit(ctx.identificador());
        String raw = ctx.getText();
        if ((raw.startsWith("\"") && raw.endsWith("\""))
                || (raw.startsWith("'")  && raw.endsWith("'")))
            return raw.substring(1, raw.length() - 1);
        return raw;
    }


}