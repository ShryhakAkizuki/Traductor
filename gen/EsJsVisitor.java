// Generated from C:/Users/metal/OneDrive/Desktop/Traductor/grammar/EsJs.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EsJsParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EsJsVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EsJsParser#s}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitS(EsJsParser.SContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(EsJsParser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(EsJsParser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#sentenciaVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaVariable(EsJsParser.SentenciaVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#listaDeclaracionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaDeclaracionVariable(EsJsParser.ListaDeclaracionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#modificadorVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModificadorVariable(EsJsParser.ModificadorVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#declaracionVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionVariable(EsJsParser.DeclaracionVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#sentenciaVacia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaVacia(EsJsParser.SentenciaVaciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracionFuncion(EsJsParser.DeclaracionFuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#listaParametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaParametros(EsJsParser.ListaParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#funcionFlecha}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncionFlecha(EsJsParser.FuncionFlechaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#sentenciaSi}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaSi(EsJsParser.SentenciaSiContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#sentenciaIterar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaIterar(EsJsParser.SentenciaIterarContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#inicioFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInicioFor(EsJsParser.InicioForContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#condicionFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondicionFor(EsJsParser.CondicionForContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#actualizacionFor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitActualizacionFor(EsJsParser.ActualizacionForContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#sentenciaContinuar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaContinuar(EsJsParser.SentenciaContinuarContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#sentenciaRomper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaRomper(EsJsParser.SentenciaRomperContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#sentenciaRetornar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaRetornar(EsJsParser.SentenciaRetornarContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#sentenciaElegir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaElegir(EsJsParser.SentenciaElegirContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#bloqueCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloqueCaso(EsJsParser.BloqueCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#casoSTMT}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasoSTMT(EsJsParser.CasoSTMTContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#casoDefecto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCasoDefecto(EsJsParser.CasoDefectoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#sentenciaIntentar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaIntentar(EsJsParser.SentenciaIntentarContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#sentenciaConsola}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaConsola(EsJsParser.SentenciaConsolaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#metodoConsola}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoConsola(EsJsParser.MetodoConsolaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#sentenciaExpresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSentenciaExpresion(EsJsParser.SentenciaExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#secuenciaExpresiones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecuenciaExpresiones(EsJsParser.SecuenciaExpresionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#expresionUnica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresionUnica(EsJsParser.ExpresionUnicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#restoCrear}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestoCrear(EsJsParser.RestoCrearContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#nombreAccesible}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombreAccesible(EsJsParser.NombreAccesibleContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#tipoMetodoNumero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoMetodoNumero(EsJsParser.TipoMetodoNumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#constanteNumero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstanteNumero(EsJsParser.ConstanteNumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#metodoNumero}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoNumero(EsJsParser.MetodoNumeroContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#tipoMetodoMate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoMetodoMate(EsJsParser.TipoMetodoMateContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#constanteMate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstanteMate(EsJsParser.ConstanteMateContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#metodoMate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMetodoMate(EsJsParser.MetodoMateContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#tipoNativo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipoNativo(EsJsParser.TipoNativoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(EsJsParser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#listaArgumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaArgumentos(EsJsParser.ListaArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#argumento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumento(EsJsParser.ArgumentoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#operadorMultiplicacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorMultiplicacion(EsJsParser.OperadorMultiplicacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#operadorAdicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorAdicion(EsJsParser.OperadorAdicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#operadorRelacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorRelacional(EsJsParser.OperadorRelacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#operadorIgualdad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorIgualdad(EsJsParser.OperadorIgualdadContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#operadorAsignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorAsignacion(EsJsParser.OperadorAsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#operadorUnario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperadorUnario(EsJsParser.OperadorUnarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(EsJsParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(EsJsParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#arregloLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArregloLiteral(EsJsParser.ArregloLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#listaElementos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaElementos(EsJsParser.ListaElementosContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#elemento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElemento(EsJsParser.ElementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#objetoLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObjetoLiteral(EsJsParser.ObjetoLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#listaPropiedades}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListaPropiedades(EsJsParser.ListaPropiedadesContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#propiedad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropiedad(EsJsParser.PropiedadContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#nombrePropiedad}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNombrePropiedad(EsJsParser.NombrePropiedadContext ctx);
	/**
	 * Visit a parse tree produced by {@link EsJsParser#eos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEos(EsJsParser.EosContext ctx);
}