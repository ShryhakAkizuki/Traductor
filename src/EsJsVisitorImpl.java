import org.antlr.v4.runtime.tree.ParseTree;
import java.util.*;

/**
 * Implementación del Visitor para traducir EsJs a Python.
 * Grupo 1: Estructura Base y Consola
 *
 * Extiende de ControlFlowVisitor para reutilizar:
 * - indent() de ExpressionVisitor
 * - isToken() de ExpressionVisitor
 * - flushPendientes() de ExpressionVisitor
 * - Variables compartidas: indentLevel, DefinicionesPendientes
 *
 * @author Equipo de Desarrollo
 * @version 1.0.0
 */
public class EsJsVisitorImpl extends ControlFlowVisitor {
    
    // ==================== VARIABLES ADICIONALES ====================
    
    /** Flag adicional para imports de sys (stderr) */
    private boolean needsSysLib = false;
    
    /** Flag adicional para imports de os (limpiar consola) */
    private boolean needsOsLib = false;
    
    /** Contador de errores encontrados */
    private int errorCount = 0;
    
    // ==================== MÉTODOS AUXILIARES ====================
    
    // Nota: indent(), isToken(), flushPendientes() se heredan de ExpressionVisitor
    // Nota: indentLevel y DefinicionesPendientes se heredan de ExpressionVisitor
    
    /**
     * Verifica si un nodo es un token específico (sobrecarga para compatibilidad).
     * @param node Nodo a verificar
     * @param type Tipo de token esperado
     * @return true si el nodo es del tipo especificado
     */
    private boolean isTokenLocal(ParseTree node, int type) {
        return isToken(node, type); // Usa el método heredado
    }
    
    /**
     * Genera los imports necesarios basándose en los flags.
     * @return String con las declaraciones import
     */
    private String generateImports() {
        StringBuilder imports = new StringBuilder();
        
        if (needsSysLib)                imports.append("import sys\n");
        if (needsMathLib)               imports.append("import math\n");
        if (needsRandomLib)             imports.append("import random\n");
        if (!imports.isEmpty())         imports.append("\n");

        if (needsIndefinidoSentinel)    imports.append("_indefinido = object()\n\n");
        if (needsJsLooseEq) {
            imports.append(
                    "def _js_eq(a, b):\n"
                            + "    if a is None and b is _indefinido: return True\n"
                            + "    if a is _indefinido and b is None: return True\n"

                            + "    if a is None or a is _indefinido: return b is None or b is _indefinido\n"
                            + "    if b is None or b is _indefinido: return False\n"

                            + "    if type(a) is type(b): return a == b\n"

                            + "    if isinstance(a, bool): return _js_eq(int(a), b)\n"
                            + "    if isinstance(b, bool): return _js_eq(a, int(b))\n"

                            + "    if isinstance(a, (int, float)) and isinstance(b, str):\n"
                            + "        try: return a == float(b)\n"
                            + "        except: return False\n"
                            + "    if isinstance(b, (int, float)) and isinstance(a, str):\n"
                            + "        try: return float(a) == b\n"
                            + "        except: return False\n"
                            + "    return a == b\n\n"
            );
        }

        return imports.toString();
    }
    
    // Nota: flushPendingDefinitions() se reemplaza por flushPendientes() heredado
    // que usa DefinicionesPendientes en lugar de pendingDefinitions
    
    /**
     * Registra un error de traducción.
     * @param message Mensaje de error
     * @param ctx Contexto donde ocurrió el error
     */
    private void logError(String message, ParseTree ctx) {
        errorCount++;
        System.err.println("ERROR: " + message);
        if (ctx != null) {
            System.err.println("  Contexto: " + ctx.getText());
        }
    }
    
    /**
     * Obtiene el número de errores encontrados.
     * @return Cantidad de errores
     */
    public int getErrorCount() {
        return errorCount;
    }
    
    // ==================== GRUPO 1: ESTRUCTURA BASE ====================
    
    /**
     * Regla: s
     * Punto de entrada del programa.
     * 
     * Gramática: s : instruccion* EOF
     * 
     * @param ctx Contexto del parser
     * @return Programa Python completo
     */
    @Override
    public String visitS(EsJsParser.SContext ctx) {
        if (ctx == null) {
            logError("Contexto nulo en visitS", null);
            return "";
        }
        
        StringBuilder output = new StringBuilder();
        
        try {
            // Procesar todas las instrucciones
            List<EsJsParser.InstruccionContext> instrucciones = ctx.instruccion();
            
            if (instrucciones != null) {
                for (EsJsParser.InstruccionContext instruccion : instrucciones) {
                    String code = visit(instruccion);
                    if (code != null && !code.isBlank()) {
                        output.append(code);
                    }
                }
            }
            
            // Obtener definiciones pendientes (usa el método heredado de ExpressionVisitor)
            String definitions = flushPendientes();
            
            // Generar imports
            String imports = generateImports();
            
            // Construir programa completo: imports + definiciones + código
            StringBuilder program = new StringBuilder();
            program.append(imports);
            program.append(definitions);
            program.append(output);
            
            return program.toString();
            
        } catch (Exception e) {
            logError("Error procesando programa: " + e.getMessage(), ctx);
            return "# Error: No se pudo transpilar el programa\n";
        }
    }
    
    /**
     * Regla: instruccion
     * Delega a las reglas específicas de cada tipo de instrucción.
     * 
     * @param ctx Contexto del parser
     * @return Código Python de la instrucción
     */
    @Override
    public String visitInstruccion(EsJsParser.InstruccionContext ctx) {
        if (ctx == null) {
            return "";
        }
        
        try {
            // Delegar al hijo específico
            return visitChildren(ctx);
        } catch (Exception e) {
            logError("Error procesando instrucción: " + e.getMessage(), ctx);
            return "";
        }
    }
    
    /**
     * Regla: bloque
     * Convierte bloques con llaves a bloques con indentación Python.
     * 
     * @param ctx Contexto del parser
     * @return Código Python del bloque con indentación
     */
    @Override
    public String visitBloque(EsJsParser.BloqueContext ctx) {
        if (ctx == null) {
            return "";
        }
        
        StringBuilder output = new StringBuilder();
        
        try {
            // NO incrementar indentLevel aquí
            // Los bloques en EsJs son solo agrupadores, no crean scope en Python
            
            List<EsJsParser.InstruccionContext> instrucciones = ctx.instruccion();
            
            if (instrucciones == null || instrucciones.isEmpty()) {
                // Bloque vacío → ignorar (no generar pass)
                return "";
            } else {
                // Procesar cada instrucción sin cambiar indentación
                for (EsJsParser.InstruccionContext instruccion : instrucciones) {
                    String code = visit(instruccion);
                    if (code != null && !code.isBlank()) {
                        output.append(code);
                    }
                }
            }
            
        } catch (Exception e) {
            logError("Error procesando bloque: " + e.getMessage(), ctx);
        }
        
        return output.toString();
    }
    
    /**
     * Regla: sentenciaVacia
     * En Python no se necesita, se ignora.
     * 
     * @param ctx Contexto del parser
     * @return String vacío (se ignora)
     */
    @Override
    public String visitSentenciaVacia(EsJsParser.SentenciaVaciaContext ctx) {
        // Ignorar sentencias vacías en Python
        return "";
    }
    
    // ==================== GRUPO 1: CONSOLA ====================
    
    /**
     * Regla: sentenciaConsola
     * Traduce llamadas a consola.metodo() a su equivalente Python.
     * 
     * @param ctx Contexto del parser
     * @return Código Python de la sentencia de consola
     */
    @Override
    public String visitSentenciaConsola(EsJsParser.SentenciaConsolaContext ctx) {
        if (ctx == null) {
            return "";
        }

        try {
            String metodo = visit(ctx.metodoConsola());
            String argumentos = visit(ctx.argumentos());

            if (metodo == null || argumentos == null) {
                logError("Método o argumentos nulos en sentenciaConsola", ctx);
                return "";
            }

            // Remover paréntesis de argumentos para procesarlos
            String args = "";
            if (argumentos.length() >= 2) {
                args = argumentos.substring(1, argumentos.length() - 1);
            }
            
            // Convertir concatenación de strings a f-string si es necesario
            args = convertToFString(args);

            StringBuilder output = new StringBuilder();
            output.append(indent());

            switch (metodo) {
                case "escribir":
                    // consola.escribir(...) → print(...)
                    output.append("print(").append(args).append(")");
                    break;

                case "error":
                    // consola.error(...) → print(..., file=sys.stderr)
                    needsSysLib = true;
                    if (args.isEmpty()) {
                        output.append("print(file=sys.stderr)");
                    } else {
                        output.append("print(").append(args).append(", file=sys.stderr)");
                    }
                    break;

                case "info":
                    // consola.info(...) → print(...)
                    output.append("print(").append(args).append(")");
                    break;

                case "afirmar":
                    // consola.afirmar(...) → assert ...
                    if (args.isEmpty()) {
                        output.append("assert True");
                    } else {
                        output.append("assert ").append(args);
                    }
                    break;

                case "limpiar":
                    // consola.limpiar() → print('\033[2J\033[H', end='')
                    output.append("print('\\033[2J\\033[H', end='')");
                    break;

                case "tabla":
                    // consola.tabla(...) → print(...) (simplificado por ahora)
                    output.append("print(").append(args).append(")");
                    break;

                case "agrupar":
                    // consola.agrupar(...) → print(...) (simplificado por ahora)
                    output.append("print(").append(args).append(")");
                    break;

                default:
                    // Método desconocido, usar print por defecto
                    logError("Método de consola desconocido: " + metodo, ctx);
                    output.append("print(").append(args).append(")");
                    break;
            }

            output.append("\n");
            return output.toString();

        } catch (Exception e) {
            logError("Error procesando sentenciaConsola: " + e.getMessage(), ctx);
            return "";
        }
    }
    
    /**
     * Convierte concatenación de strings con + a f-string de Python.
     * Ejemplo: "x: " + x → f"x: {x}"
     *
     * @param args Argumentos originales
     * @return Argumentos convertidos a f-string si contienen concatenación
     */
    private String convertToFString(String args) {
        if (args == null || args.isEmpty()) {
            return args;
        }
        
        // Si no contiene concatenación con +, retornar tal cual
        if (!args.contains(" + ")) {
            return args;
        }
        
        // Detectar si hay concatenación de strings
        // Patrón: "string" + expresion o expresion + "string"
        if (args.matches(".*\"[^\"]*\"\\s*\\+.*") || args.matches(".*\\+\\s*\"[^\"]*\".*")) {
            // Convertir a f-string
            StringBuilder fstring = new StringBuilder("f");
            
            // Dividir por + y procesar cada parte
            String[] parts = args.split("\\s*\\+\\s*");
            boolean firstPart = true;
            
            for (String part : parts) {
                part = part.trim();
                
                if (part.startsWith("\"") && part.endsWith("\"")) {
                    // Es un string literal
                    if (firstPart) {
                        fstring.append(part, 0, part.length() - 1); // Quitar comilla final
                        firstPart = false;
                    } else {
                        fstring.append(part.substring(1, part.length() - 1)); // Quitar ambas comillas
                    }
                } else {
                    // Es una expresión
                    if (firstPart) {
                        fstring.append("\"");
                        firstPart = false;
                    }
                    // Eliminar paréntesis externos innecesarios
                    String expr = part;
                    if (expr.startsWith("(") && expr.endsWith(")")) {
                        expr = expr.substring(1, expr.length() - 1);
                    }
                    fstring.append("{").append(expr).append("}");
                }
            }
            
            // Cerrar el f-string
            if (!firstPart) {
                fstring.append("\"");
            }
            
            return fstring.toString();
        }
        
        // Si no es un patrón reconocido, retornar tal cual
        return args;
    }
    
    /**
     * Regla: metodoConsola
     * Retorna el nombre del método de consola.
     * 
     * @param ctx Contexto del parser
     * @return Nombre del método
     */
    @Override
    public String visitMetodoConsola(EsJsParser.MetodoConsolaContext ctx) {
        if (ctx == null) {
            return "";
        }
        return ctx.getText();
    }
    

    // ==================== MÉTODOS HEREDADOS ====================
    
    // defaultResult() y aggregateResult() se heredan de EsJsBaseVisitor
    // a través de ExpressionVisitor y ControlFlowVisitor
    // No es necesario sobrescribirlos aquí
}