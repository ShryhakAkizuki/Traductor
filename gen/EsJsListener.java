// Generated from C:/Users/metal/OneDrive/Desktop/Traductor/grammar/EsJs.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EsJsParser}.
 */
public interface EsJsListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EsJsParser#s}.
	 * @param ctx the parse tree
	 */
	void enterS(EsJsParser.SContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#s}.
	 * @param ctx the parse tree
	 */
	void exitS(EsJsParser.SContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(EsJsParser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(EsJsParser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(EsJsParser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(EsJsParser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#sentenciaVariable}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaVariable(EsJsParser.SentenciaVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#sentenciaVariable}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaVariable(EsJsParser.SentenciaVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#listaDeclaracionVariable}.
	 * @param ctx the parse tree
	 */
	void enterListaDeclaracionVariable(EsJsParser.ListaDeclaracionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#listaDeclaracionVariable}.
	 * @param ctx the parse tree
	 */
	void exitListaDeclaracionVariable(EsJsParser.ListaDeclaracionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#modificadorVariable}.
	 * @param ctx the parse tree
	 */
	void enterModificadorVariable(EsJsParser.ModificadorVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#modificadorVariable}.
	 * @param ctx the parse tree
	 */
	void exitModificadorVariable(EsJsParser.ModificadorVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionVariable(EsJsParser.DeclaracionVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#declaracionVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionVariable(EsJsParser.DeclaracionVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#sentenciaVacia}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaVacia(EsJsParser.SentenciaVaciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#sentenciaVacia}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaVacia(EsJsParser.SentenciaVaciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracionFuncion(EsJsParser.DeclaracionFuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#declaracionFuncion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracionFuncion(EsJsParser.DeclaracionFuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void enterListaParametros(EsJsParser.ListaParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#listaParametros}.
	 * @param ctx the parse tree
	 */
	void exitListaParametros(EsJsParser.ListaParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#funcionFlecha}.
	 * @param ctx the parse tree
	 */
	void enterFuncionFlecha(EsJsParser.FuncionFlechaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#funcionFlecha}.
	 * @param ctx the parse tree
	 */
	void exitFuncionFlecha(EsJsParser.FuncionFlechaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#sentenciaSi}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaSi(EsJsParser.SentenciaSiContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#sentenciaSi}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaSi(EsJsParser.SentenciaSiContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#sentenciaIterar}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaIterar(EsJsParser.SentenciaIterarContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#sentenciaIterar}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaIterar(EsJsParser.SentenciaIterarContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#inicioFor}.
	 * @param ctx the parse tree
	 */
	void enterInicioFor(EsJsParser.InicioForContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#inicioFor}.
	 * @param ctx the parse tree
	 */
	void exitInicioFor(EsJsParser.InicioForContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#condicionFor}.
	 * @param ctx the parse tree
	 */
	void enterCondicionFor(EsJsParser.CondicionForContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#condicionFor}.
	 * @param ctx the parse tree
	 */
	void exitCondicionFor(EsJsParser.CondicionForContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#actualizacionFor}.
	 * @param ctx the parse tree
	 */
	void enterActualizacionFor(EsJsParser.ActualizacionForContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#actualizacionFor}.
	 * @param ctx the parse tree
	 */
	void exitActualizacionFor(EsJsParser.ActualizacionForContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#sentenciaContinuar}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaContinuar(EsJsParser.SentenciaContinuarContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#sentenciaContinuar}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaContinuar(EsJsParser.SentenciaContinuarContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#sentenciaRomper}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaRomper(EsJsParser.SentenciaRomperContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#sentenciaRomper}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaRomper(EsJsParser.SentenciaRomperContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#sentenciaRetornar}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaRetornar(EsJsParser.SentenciaRetornarContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#sentenciaRetornar}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaRetornar(EsJsParser.SentenciaRetornarContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#sentenciaElegir}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaElegir(EsJsParser.SentenciaElegirContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#sentenciaElegir}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaElegir(EsJsParser.SentenciaElegirContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#bloqueCaso}.
	 * @param ctx the parse tree
	 */
	void enterBloqueCaso(EsJsParser.BloqueCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#bloqueCaso}.
	 * @param ctx the parse tree
	 */
	void exitBloqueCaso(EsJsParser.BloqueCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#casoSTMT}.
	 * @param ctx the parse tree
	 */
	void enterCasoSTMT(EsJsParser.CasoSTMTContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#casoSTMT}.
	 * @param ctx the parse tree
	 */
	void exitCasoSTMT(EsJsParser.CasoSTMTContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#casoDefecto}.
	 * @param ctx the parse tree
	 */
	void enterCasoDefecto(EsJsParser.CasoDefectoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#casoDefecto}.
	 * @param ctx the parse tree
	 */
	void exitCasoDefecto(EsJsParser.CasoDefectoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#sentenciaIntentar}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaIntentar(EsJsParser.SentenciaIntentarContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#sentenciaIntentar}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaIntentar(EsJsParser.SentenciaIntentarContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#sentenciaConsola}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaConsola(EsJsParser.SentenciaConsolaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#sentenciaConsola}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaConsola(EsJsParser.SentenciaConsolaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#metodoConsola}.
	 * @param ctx the parse tree
	 */
	void enterMetodoConsola(EsJsParser.MetodoConsolaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#metodoConsola}.
	 * @param ctx the parse tree
	 */
	void exitMetodoConsola(EsJsParser.MetodoConsolaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#sentenciaExpresion}.
	 * @param ctx the parse tree
	 */
	void enterSentenciaExpresion(EsJsParser.SentenciaExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#sentenciaExpresion}.
	 * @param ctx the parse tree
	 */
	void exitSentenciaExpresion(EsJsParser.SentenciaExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#secuenciaExpresiones}.
	 * @param ctx the parse tree
	 */
	void enterSecuenciaExpresiones(EsJsParser.SecuenciaExpresionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#secuenciaExpresiones}.
	 * @param ctx the parse tree
	 */
	void exitSecuenciaExpresiones(EsJsParser.SecuenciaExpresionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#expresionUnica}.
	 * @param ctx the parse tree
	 */
	void enterExpresionUnica(EsJsParser.ExpresionUnicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#expresionUnica}.
	 * @param ctx the parse tree
	 */
	void exitExpresionUnica(EsJsParser.ExpresionUnicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#restoCrear}.
	 * @param ctx the parse tree
	 */
	void enterRestoCrear(EsJsParser.RestoCrearContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#restoCrear}.
	 * @param ctx the parse tree
	 */
	void exitRestoCrear(EsJsParser.RestoCrearContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#nombreAccesible}.
	 * @param ctx the parse tree
	 */
	void enterNombreAccesible(EsJsParser.NombreAccesibleContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#nombreAccesible}.
	 * @param ctx the parse tree
	 */
	void exitNombreAccesible(EsJsParser.NombreAccesibleContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#tipoMetodoNumero}.
	 * @param ctx the parse tree
	 */
	void enterTipoMetodoNumero(EsJsParser.TipoMetodoNumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#tipoMetodoNumero}.
	 * @param ctx the parse tree
	 */
	void exitTipoMetodoNumero(EsJsParser.TipoMetodoNumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#constanteNumero}.
	 * @param ctx the parse tree
	 */
	void enterConstanteNumero(EsJsParser.ConstanteNumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#constanteNumero}.
	 * @param ctx the parse tree
	 */
	void exitConstanteNumero(EsJsParser.ConstanteNumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#metodoNumero}.
	 * @param ctx the parse tree
	 */
	void enterMetodoNumero(EsJsParser.MetodoNumeroContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#metodoNumero}.
	 * @param ctx the parse tree
	 */
	void exitMetodoNumero(EsJsParser.MetodoNumeroContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#tipoMetodoMate}.
	 * @param ctx the parse tree
	 */
	void enterTipoMetodoMate(EsJsParser.TipoMetodoMateContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#tipoMetodoMate}.
	 * @param ctx the parse tree
	 */
	void exitTipoMetodoMate(EsJsParser.TipoMetodoMateContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#constanteMate}.
	 * @param ctx the parse tree
	 */
	void enterConstanteMate(EsJsParser.ConstanteMateContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#constanteMate}.
	 * @param ctx the parse tree
	 */
	void exitConstanteMate(EsJsParser.ConstanteMateContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#metodoMate}.
	 * @param ctx the parse tree
	 */
	void enterMetodoMate(EsJsParser.MetodoMateContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#metodoMate}.
	 * @param ctx the parse tree
	 */
	void exitMetodoMate(EsJsParser.MetodoMateContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#tipoNativo}.
	 * @param ctx the parse tree
	 */
	void enterTipoNativo(EsJsParser.TipoNativoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#tipoNativo}.
	 * @param ctx the parse tree
	 */
	void exitTipoNativo(EsJsParser.TipoNativoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(EsJsParser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(EsJsParser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void enterListaArgumentos(EsJsParser.ListaArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#listaArgumentos}.
	 * @param ctx the parse tree
	 */
	void exitListaArgumentos(EsJsParser.ListaArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#argumento}.
	 * @param ctx the parse tree
	 */
	void enterArgumento(EsJsParser.ArgumentoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#argumento}.
	 * @param ctx the parse tree
	 */
	void exitArgumento(EsJsParser.ArgumentoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#operadorMultiplicacion}.
	 * @param ctx the parse tree
	 */
	void enterOperadorMultiplicacion(EsJsParser.OperadorMultiplicacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#operadorMultiplicacion}.
	 * @param ctx the parse tree
	 */
	void exitOperadorMultiplicacion(EsJsParser.OperadorMultiplicacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#operadorAdicion}.
	 * @param ctx the parse tree
	 */
	void enterOperadorAdicion(EsJsParser.OperadorAdicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#operadorAdicion}.
	 * @param ctx the parse tree
	 */
	void exitOperadorAdicion(EsJsParser.OperadorAdicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#operadorRelacional}.
	 * @param ctx the parse tree
	 */
	void enterOperadorRelacional(EsJsParser.OperadorRelacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#operadorRelacional}.
	 * @param ctx the parse tree
	 */
	void exitOperadorRelacional(EsJsParser.OperadorRelacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#operadorIgualdad}.
	 * @param ctx the parse tree
	 */
	void enterOperadorIgualdad(EsJsParser.OperadorIgualdadContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#operadorIgualdad}.
	 * @param ctx the parse tree
	 */
	void exitOperadorIgualdad(EsJsParser.OperadorIgualdadContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#operadorAsignacion}.
	 * @param ctx the parse tree
	 */
	void enterOperadorAsignacion(EsJsParser.OperadorAsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#operadorAsignacion}.
	 * @param ctx the parse tree
	 */
	void exitOperadorAsignacion(EsJsParser.OperadorAsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#operadorUnario}.
	 * @param ctx the parse tree
	 */
	void enterOperadorUnario(EsJsParser.OperadorUnarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#operadorUnario}.
	 * @param ctx the parse tree
	 */
	void exitOperadorUnario(EsJsParser.OperadorUnarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(EsJsParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(EsJsParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(EsJsParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(EsJsParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#arregloLiteral}.
	 * @param ctx the parse tree
	 */
	void enterArregloLiteral(EsJsParser.ArregloLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#arregloLiteral}.
	 * @param ctx the parse tree
	 */
	void exitArregloLiteral(EsJsParser.ArregloLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#listaElementos}.
	 * @param ctx the parse tree
	 */
	void enterListaElementos(EsJsParser.ListaElementosContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#listaElementos}.
	 * @param ctx the parse tree
	 */
	void exitListaElementos(EsJsParser.ListaElementosContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#elemento}.
	 * @param ctx the parse tree
	 */
	void enterElemento(EsJsParser.ElementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#elemento}.
	 * @param ctx the parse tree
	 */
	void exitElemento(EsJsParser.ElementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#objetoLiteral}.
	 * @param ctx the parse tree
	 */
	void enterObjetoLiteral(EsJsParser.ObjetoLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#objetoLiteral}.
	 * @param ctx the parse tree
	 */
	void exitObjetoLiteral(EsJsParser.ObjetoLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#listaPropiedades}.
	 * @param ctx the parse tree
	 */
	void enterListaPropiedades(EsJsParser.ListaPropiedadesContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#listaPropiedades}.
	 * @param ctx the parse tree
	 */
	void exitListaPropiedades(EsJsParser.ListaPropiedadesContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#propiedad}.
	 * @param ctx the parse tree
	 */
	void enterPropiedad(EsJsParser.PropiedadContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#propiedad}.
	 * @param ctx the parse tree
	 */
	void exitPropiedad(EsJsParser.PropiedadContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#nombrePropiedad}.
	 * @param ctx the parse tree
	 */
	void enterNombrePropiedad(EsJsParser.NombrePropiedadContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#nombrePropiedad}.
	 * @param ctx the parse tree
	 */
	void exitNombrePropiedad(EsJsParser.NombrePropiedadContext ctx);
	/**
	 * Enter a parse tree produced by {@link EsJsParser#eos}.
	 * @param ctx the parse tree
	 */
	void enterEos(EsJsParser.EosContext ctx);
	/**
	 * Exit a parse tree produced by {@link EsJsParser#eos}.
	 * @param ctx the parse tree
	 */
	void exitEos(EsJsParser.EosContext ctx);
}