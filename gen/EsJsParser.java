// Generated from C:/Users/metal/OneDrive/Desktop/Traductor/grammar/EsJs.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class EsJsParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		TKN_Arreglo=1, TKN_Booleano=2, TKN_Cadena=3, TKN_Infinito=4, TKN_Mate=5, 
		TKN_Matriz=6, TKN_NuN=7, TKN_Numero=8, TKN_afirmar=9, TKN_agregar=10, 
		TKN_agrupar=11, TKN_ambiente=12, TKN_capturar=13, TKN_caso=14, TKN_consola=15, 
		TKN_const=16, TKN_continuar=17, TKN_crear=18, TKN_elegir=19, TKN_error=20, 
		TKN_escribir=21, TKN_falso=22, TKN_funcion=23, TKN_hacer=24, TKN_indefinido=25, 
		TKN_info=26, TKN_intentar=27, TKN_limpiar=28, TKN_longitud=29, TKN_mientras=30, 
		TKN_mut=31, TKN_nulo=32, TKN_para=33, TKN_porDefecto=34, TKN_retornar=35, 
		TKN_romper=36, TKN_si=37, TKN_sino=38, TKN_tabla=39, TKN_tipoDe=40, TKN_var=41, 
		TKN_verdadero=42, TKN_aExponencial=43, TKN_fijarDecimales=44, TKN_aCadenaLocalizado=45, 
		TKN_aPrecision=46, TKN_aCadena=47, TKN_valorDe=48, TKN_esFinito=49, TKN_esEntero=50, 
		TKN_NeN=51, TKN_esEnteroSeguro=52, TKN_interpretarDecimal=53, TKN_interpretarEntero=54, 
		TKN_MAX_VALUE=55, TKN_MIN_VALUE=56, TKN_POSITIVE_INFINITY=57, TKN_NEGATIVE_INFINITY=58, 
		TKN_E=59, TKN_LN2=60, TKN_LN10=61, TKN_LOG2E=62, TKN_LOG10E=63, TKN_PI=64, 
		TKN_SQRT1_2=65, TKN_SQRT2=66, TKN_absoluto=67, TKN_arcocosenoHiperbolico=68, 
		TKN_arcocoseno=69, TKN_arcosenoHiperbolico=70, TKN_arcoseno=71, TKN_arcotangente2=72, 
		TKN_arcotangenteHiperbolica=73, TKN_arcotangente=74, TKN_cerosALaIzquierdaEn32Bits=75, 
		TKN_cosenoHiperbolico=76, TKN_coseno=77, TKN_exponencialMate=78, TKN_exponencialMenos1=79, 
		TKN_exponencial=80, TKN_floor=81, TKN_hipotenusa=82, TKN_logaritmoBase10=83, 
		TKN_logaritmoBase2=84, TKN_logaritmoDe1Mas=85, TKN_logaritmo=86, TKN_maximo=87, 
		TKN_minimo=88, TKN_multiplicacionEntera=89, TKN_potencia=90, TKN_raizCubica=91, 
		TKN_raizCuadrada=92, TKN_redondearAComaFlotante=93, TKN_redondearHaciaAbajo=94, 
		TKN_redondearHaciaArriba=95, TKN_redondear=96, TKN_senoHiperbolico=97, 
		TKN_seno=98, TKN_signo=99, TKN_tangenteHiperbolica=100, TKN_tangente=101, 
		TKN_truncar=102, TKN_aleatorio=103, ID=104, TKN_str=105, TKN_num=106, 
		TKN_reg=107, TKN_spread=108, TKN_strict_equal=109, TKN_strict_neq=110, 
		TKN_power_assign=111, TKN_div_assign=112, TKN_mod_assign=113, TKN_plus_assign=114, 
		TKN_minus_assign=115, TKN_times_assign=116, TKN_power=117, TKN_equal=118, 
		TKN_neq=119, TKN_and=120, TKN_or=121, TKN_decrement=122, TKN_increment=123, 
		TKN_nulish=124, TKN_arrow=125, TKN_geq=126, TKN_leq=127, TKN_assign=128, 
		TKN_closing_bra=129, TKN_closing_key=130, TKN_closing_par=131, TKN_colon=132, 
		TKN_comma=133, TKN_div=134, TKN_greater=135, TKN_less=136, TKN_minus=137, 
		TKN_mod=138, TKN_not=139, TKN_opening_bra=140, TKN_opening_key=141, TKN_opening_par=142, 
		TKN_period=143, TKN_plus=144, TKN_semicolon=145, TKN_ternary=146, TKN_times=147, 
		NEWLINE=148, WS=149, LINE_COMMENT=150, BLOCK_COMMENT=151;
	public static final int
		RULE_s = 0, RULE_instruccion = 1, RULE_bloque = 2, RULE_sentenciaVariable = 3, 
		RULE_listaDeclaracionVariable = 4, RULE_modificadorVariable = 5, RULE_declaracionVariable = 6, 
		RULE_sentenciaVacia = 7, RULE_declaracionFuncion = 8, RULE_listaParametros = 9, 
		RULE_funcionFlecha = 10, RULE_sentenciaSi = 11, RULE_sentenciaIterar = 12, 
		RULE_inicioFor = 13, RULE_condicionFor = 14, RULE_actualizacionFor = 15, 
		RULE_sentenciaContinuar = 16, RULE_sentenciaRomper = 17, RULE_sentenciaRetornar = 18, 
		RULE_sentenciaElegir = 19, RULE_bloqueCaso = 20, RULE_casoSTMT = 21, RULE_casoDefecto = 22, 
		RULE_sentenciaIntentar = 23, RULE_sentenciaConsola = 24, RULE_metodoConsola = 25, 
		RULE_sentenciaExpresion = 26, RULE_secuenciaExpresiones = 27, RULE_expresionUnica = 28, 
		RULE_restoCrear = 29, RULE_nombreAccesible = 30, RULE_tipoMetodoNumero = 31, 
		RULE_constanteNumero = 32, RULE_metodoNumero = 33, RULE_tipoMetodoMate = 34, 
		RULE_constanteMate = 35, RULE_metodoMate = 36, RULE_tipoNativo = 37, RULE_argumentos = 38, 
		RULE_listaArgumentos = 39, RULE_argumento = 40, RULE_operadorMultiplicacion = 41, 
		RULE_operadorAdicion = 42, RULE_operadorRelacional = 43, RULE_operadorIgualdad = 44, 
		RULE_operadorAsignacion = 45, RULE_operadorUnario = 46, RULE_identificador = 47, 
		RULE_literal = 48, RULE_arregloLiteral = 49, RULE_listaElementos = 50, 
		RULE_elemento = 51, RULE_objetoLiteral = 52, RULE_listaPropiedades = 53, 
		RULE_propiedad = 54, RULE_nombrePropiedad = 55, RULE_eos = 56;
	private static String[] makeRuleNames() {
		return new String[] {
			"s", "instruccion", "bloque", "sentenciaVariable", "listaDeclaracionVariable", 
			"modificadorVariable", "declaracionVariable", "sentenciaVacia", "declaracionFuncion", 
			"listaParametros", "funcionFlecha", "sentenciaSi", "sentenciaIterar", 
			"inicioFor", "condicionFor", "actualizacionFor", "sentenciaContinuar", 
			"sentenciaRomper", "sentenciaRetornar", "sentenciaElegir", "bloqueCaso", 
			"casoSTMT", "casoDefecto", "sentenciaIntentar", "sentenciaConsola", "metodoConsola", 
			"sentenciaExpresion", "secuenciaExpresiones", "expresionUnica", "restoCrear", 
			"nombreAccesible", "tipoMetodoNumero", "constanteNumero", "metodoNumero", 
			"tipoMetodoMate", "constanteMate", "metodoMate", "tipoNativo", "argumentos", 
			"listaArgumentos", "argumento", "operadorMultiplicacion", "operadorAdicion", 
			"operadorRelacional", "operadorIgualdad", "operadorAsignacion", "operadorUnario", 
			"identificador", "literal", "arregloLiteral", "listaElementos", "elemento", 
			"objetoLiteral", "listaPropiedades", "propiedad", "nombrePropiedad", 
			"eos"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'Arreglo'", "'Booleano'", "'Cadena'", "'Infinito'", "'Mate'", 
			"'Matriz'", "'NuN'", "'Numero'", "'afirmar'", "'agregar'", "'agrupar'", 
			"'ambiente'", "'capturar'", "'caso'", "'consola'", "'const'", "'continuar'", 
			"'crear'", "'elegir'", "'error'", "'escribir'", "'falso'", "'funcion'", 
			"'hacer'", "'indefinido'", "'info'", "'intentar'", "'limpiar'", "'longitud'", 
			"'mientras'", "'mut'", "'nulo'", "'para'", "'porDefecto'", "'retornar'", 
			"'romper'", "'si'", "'sino'", "'tabla'", "'tipoDe'", "'var'", "'verdadero'", 
			"'aExponencial'", "'fijarDecimales'", "'aCadenaLocalizado'", "'aPrecision'", 
			"'aCadena'", "'valorDe'", "'esFinito'", "'esEntero'", "'NeN'", "'esEnteroSeguro'", 
			"'interpretarDecimal'", "'interpretarEntero'", "'MAX_VALUE'", "'MIN_VALUE'", 
			"'POSITIVE_INFINITY'", "'NEGATIVE_INFINITY'", "'E'", "'LN2'", "'LN10'", 
			"'LOG2E'", "'LOG10E'", "'PI'", "'SQRT1_2'", "'SQRT2'", "'absoluto'", 
			"'arcocosenoHiperbolico'", "'arcocoseno'", "'arcosenoHiperbolico'", "'arcoseno'", 
			"'arcotangente2'", "'arcotangenteHiperbolica'", "'arcotangente'", "'cerosALaIzquierdaEn32Bits'", 
			"'cosenoHiperbolico'", "'coseno'", "'exponencialMate'", "'exponencialMenos1'", 
			"'exponencial'", "'floor'", "'hipotenusa'", "'logaritmoBase10'", "'logaritmoBase2'", 
			"'logaritmoDe1Mas'", "'logaritmo'", "'maximo'", "'minimo'", "'multiplicacionEntera'", 
			"'potencia'", "'raizCubica'", "'raizCuadrada'", "'redondearAComaFlotante'", 
			"'redondearHaciaAbajo'", "'redondearHaciaArriba'", "'redondear'", "'senoHiperbolico'", 
			"'seno'", "'signo'", "'tangenteHiperbolica'", "'tangente'", "'truncar'", 
			"'aleatorio'", null, null, null, null, "'...'", "'==='", "'!=='", "'**='", 
			"'/='", "'%='", "'+='", "'-='", "'*='", "'**'", "'=='", "'!='", "'&&'", 
			"'||'", "'--'", "'++'", "'??'", "'=>'", "'>='", "'<='", "'='", "']'", 
			"'}'", "')'", "':'", "','", "'/'", "'>'", "'<'", "'-'", "'%'", "'!'", 
			"'['", "'{'", "'('", "'.'", "'+'", "';'", "'?'", "'*'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "TKN_Arreglo", "TKN_Booleano", "TKN_Cadena", "TKN_Infinito", "TKN_Mate", 
			"TKN_Matriz", "TKN_NuN", "TKN_Numero", "TKN_afirmar", "TKN_agregar", 
			"TKN_agrupar", "TKN_ambiente", "TKN_capturar", "TKN_caso", "TKN_consola", 
			"TKN_const", "TKN_continuar", "TKN_crear", "TKN_elegir", "TKN_error", 
			"TKN_escribir", "TKN_falso", "TKN_funcion", "TKN_hacer", "TKN_indefinido", 
			"TKN_info", "TKN_intentar", "TKN_limpiar", "TKN_longitud", "TKN_mientras", 
			"TKN_mut", "TKN_nulo", "TKN_para", "TKN_porDefecto", "TKN_retornar", 
			"TKN_romper", "TKN_si", "TKN_sino", "TKN_tabla", "TKN_tipoDe", "TKN_var", 
			"TKN_verdadero", "TKN_aExponencial", "TKN_fijarDecimales", "TKN_aCadenaLocalizado", 
			"TKN_aPrecision", "TKN_aCadena", "TKN_valorDe", "TKN_esFinito", "TKN_esEntero", 
			"TKN_NeN", "TKN_esEnteroSeguro", "TKN_interpretarDecimal", "TKN_interpretarEntero", 
			"TKN_MAX_VALUE", "TKN_MIN_VALUE", "TKN_POSITIVE_INFINITY", "TKN_NEGATIVE_INFINITY", 
			"TKN_E", "TKN_LN2", "TKN_LN10", "TKN_LOG2E", "TKN_LOG10E", "TKN_PI", 
			"TKN_SQRT1_2", "TKN_SQRT2", "TKN_absoluto", "TKN_arcocosenoHiperbolico", 
			"TKN_arcocoseno", "TKN_arcosenoHiperbolico", "TKN_arcoseno", "TKN_arcotangente2", 
			"TKN_arcotangenteHiperbolica", "TKN_arcotangente", "TKN_cerosALaIzquierdaEn32Bits", 
			"TKN_cosenoHiperbolico", "TKN_coseno", "TKN_exponencialMate", "TKN_exponencialMenos1", 
			"TKN_exponencial", "TKN_floor", "TKN_hipotenusa", "TKN_logaritmoBase10", 
			"TKN_logaritmoBase2", "TKN_logaritmoDe1Mas", "TKN_logaritmo", "TKN_maximo", 
			"TKN_minimo", "TKN_multiplicacionEntera", "TKN_potencia", "TKN_raizCubica", 
			"TKN_raizCuadrada", "TKN_redondearAComaFlotante", "TKN_redondearHaciaAbajo", 
			"TKN_redondearHaciaArriba", "TKN_redondear", "TKN_senoHiperbolico", "TKN_seno", 
			"TKN_signo", "TKN_tangenteHiperbolica", "TKN_tangente", "TKN_truncar", 
			"TKN_aleatorio", "ID", "TKN_str", "TKN_num", "TKN_reg", "TKN_spread", 
			"TKN_strict_equal", "TKN_strict_neq", "TKN_power_assign", "TKN_div_assign", 
			"TKN_mod_assign", "TKN_plus_assign", "TKN_minus_assign", "TKN_times_assign", 
			"TKN_power", "TKN_equal", "TKN_neq", "TKN_and", "TKN_or", "TKN_decrement", 
			"TKN_increment", "TKN_nulish", "TKN_arrow", "TKN_geq", "TKN_leq", "TKN_assign", 
			"TKN_closing_bra", "TKN_closing_key", "TKN_closing_par", "TKN_colon", 
			"TKN_comma", "TKN_div", "TKN_greater", "TKN_less", "TKN_minus", "TKN_mod", 
			"TKN_not", "TKN_opening_bra", "TKN_opening_key", "TKN_opening_par", "TKN_period", 
			"TKN_plus", "TKN_semicolon", "TKN_ternary", "TKN_times", "NEWLINE", "WS", 
			"LINE_COMMENT", "BLOCK_COMMENT"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "EsJs.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


	    boolean hayNuevaLinea() {
	        int i = _input.index() - 1;
	        while (i >= 0) {
	            Token t = _input.get(i);
	            if (t.getChannel() == Token.DEFAULT_CHANNEL) break;
	            if (t.getType() == EsJsLexer.NEWLINE) return true;
	            i--;
	        }
	        return false;
	    }

	public EsJsParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(EsJsParser.EOF, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public SContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_s; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SContext s() throws RecognitionException {
		SContext _localctx = new SContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_s);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576459909614244346L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 864708720641179641L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 445L) != 0)) {
				{
				{
				setState(114);
				instruccion();
				}
				}
				setState(119);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(120);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InstruccionContext extends ParserRuleContext {
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public SentenciaConsolaContext sentenciaConsola() {
			return getRuleContext(SentenciaConsolaContext.class,0);
		}
		public SentenciaVariableContext sentenciaVariable() {
			return getRuleContext(SentenciaVariableContext.class,0);
		}
		public SentenciaVaciaContext sentenciaVacia() {
			return getRuleContext(SentenciaVaciaContext.class,0);
		}
		public SentenciaExpresionContext sentenciaExpresion() {
			return getRuleContext(SentenciaExpresionContext.class,0);
		}
		public DeclaracionFuncionContext declaracionFuncion() {
			return getRuleContext(DeclaracionFuncionContext.class,0);
		}
		public SentenciaSiContext sentenciaSi() {
			return getRuleContext(SentenciaSiContext.class,0);
		}
		public SentenciaIterarContext sentenciaIterar() {
			return getRuleContext(SentenciaIterarContext.class,0);
		}
		public SentenciaContinuarContext sentenciaContinuar() {
			return getRuleContext(SentenciaContinuarContext.class,0);
		}
		public SentenciaRomperContext sentenciaRomper() {
			return getRuleContext(SentenciaRomperContext.class,0);
		}
		public SentenciaRetornarContext sentenciaRetornar() {
			return getRuleContext(SentenciaRetornarContext.class,0);
		}
		public SentenciaElegirContext sentenciaElegir() {
			return getRuleContext(SentenciaElegirContext.class,0);
		}
		public SentenciaIntentarContext sentenciaIntentar() {
			return getRuleContext(SentenciaIntentarContext.class,0);
		}
		public InstruccionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruccion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterInstruccion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitInstruccion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitInstruccion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstruccionContext instruccion() throws RecognitionException {
		InstruccionContext _localctx = new InstruccionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruccion);
		try {
			setState(135);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(122);
				bloque();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(123);
				sentenciaConsola();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(124);
				sentenciaVariable();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(125);
				sentenciaVacia();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(126);
				sentenciaExpresion();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(127);
				declaracionFuncion();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(128);
				sentenciaSi();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(129);
				sentenciaIterar();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(130);
				sentenciaContinuar();
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(131);
				sentenciaRomper();
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(132);
				sentenciaRetornar();
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(133);
				sentenciaElegir();
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(134);
				sentenciaIntentar();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueContext extends ParserRuleContext {
		public TerminalNode TKN_opening_key() { return getToken(EsJsParser.TKN_opening_key, 0); }
		public TerminalNode TKN_closing_key() { return getToken(EsJsParser.TKN_closing_key, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public BloqueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloque; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterBloque(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitBloque(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitBloque(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueContext bloque() throws RecognitionException {
		BloqueContext _localctx = new BloqueContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_bloque);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(137);
			match(TKN_opening_key);
			setState(141);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576459909614244346L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 864708720641179641L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 445L) != 0)) {
				{
				{
				setState(138);
				instruccion();
				}
				}
				setState(143);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(144);
			match(TKN_closing_key);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaVariableContext extends ParserRuleContext {
		public ListaDeclaracionVariableContext listaDeclaracionVariable() {
			return getRuleContext(ListaDeclaracionVariableContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public SentenciaVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterSentenciaVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitSentenciaVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitSentenciaVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaVariableContext sentenciaVariable() throws RecognitionException {
		SentenciaVariableContext _localctx = new SentenciaVariableContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_sentenciaVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			listaDeclaracionVariable();
			setState(147);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaDeclaracionVariableContext extends ParserRuleContext {
		public ModificadorVariableContext modificadorVariable() {
			return getRuleContext(ModificadorVariableContext.class,0);
		}
		public List<DeclaracionVariableContext> declaracionVariable() {
			return getRuleContexts(DeclaracionVariableContext.class);
		}
		public DeclaracionVariableContext declaracionVariable(int i) {
			return getRuleContext(DeclaracionVariableContext.class,i);
		}
		public List<TerminalNode> TKN_comma() { return getTokens(EsJsParser.TKN_comma); }
		public TerminalNode TKN_comma(int i) {
			return getToken(EsJsParser.TKN_comma, i);
		}
		public ListaDeclaracionVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaDeclaracionVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterListaDeclaracionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitListaDeclaracionVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitListaDeclaracionVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaDeclaracionVariableContext listaDeclaracionVariable() throws RecognitionException {
		ListaDeclaracionVariableContext _localctx = new ListaDeclaracionVariableContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_listaDeclaracionVariable);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			modificadorVariable();
			setState(150);
			declaracionVariable();
			setState(155);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(151);
					match(TKN_comma);
					setState(152);
					declaracionVariable();
					}
					} 
				}
				setState(157);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ModificadorVariableContext extends ParserRuleContext {
		public TerminalNode TKN_var() { return getToken(EsJsParser.TKN_var, 0); }
		public TerminalNode TKN_mut() { return getToken(EsJsParser.TKN_mut, 0); }
		public TerminalNode TKN_const() { return getToken(EsJsParser.TKN_const, 0); }
		public ModificadorVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_modificadorVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterModificadorVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitModificadorVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitModificadorVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModificadorVariableContext modificadorVariable() throws RecognitionException {
		ModificadorVariableContext _localctx = new ModificadorVariableContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_modificadorVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 2201170804736L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionVariableContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode TKN_assign() { return getToken(EsJsParser.TKN_assign, 0); }
		public ExpresionUnicaContext expresionUnica() {
			return getRuleContext(ExpresionUnicaContext.class,0);
		}
		public DeclaracionVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterDeclaracionVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitDeclaracionVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitDeclaracionVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionVariableContext declaracionVariable() throws RecognitionException {
		DeclaracionVariableContext _localctx = new DeclaracionVariableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_declaracionVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			identificador();
			setState(163);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				{
				setState(161);
				match(TKN_assign);
				setState(162);
				expresionUnica(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaVaciaContext extends ParserRuleContext {
		public TerminalNode TKN_semicolon() { return getToken(EsJsParser.TKN_semicolon, 0); }
		public SentenciaVaciaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaVacia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterSentenciaVacia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitSentenciaVacia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitSentenciaVacia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaVaciaContext sentenciaVacia() throws RecognitionException {
		SentenciaVaciaContext _localctx = new SentenciaVaciaContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_sentenciaVacia);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(TKN_semicolon);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclaracionFuncionContext extends ParserRuleContext {
		public TerminalNode TKN_funcion() { return getToken(EsJsParser.TKN_funcion, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode TKN_opening_par() { return getToken(EsJsParser.TKN_opening_par, 0); }
		public TerminalNode TKN_closing_par() { return getToken(EsJsParser.TKN_closing_par, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public DeclaracionFuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaracionFuncion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterDeclaracionFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitDeclaracionFuncion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitDeclaracionFuncion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclaracionFuncionContext declaracionFuncion() throws RecognitionException {
		DeclaracionFuncionContext _localctx = new DeclaracionFuncionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_declaracionFuncion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(TKN_funcion);
			setState(168);
			identificador();
			setState(169);
			match(TKN_opening_par);
			setState(171);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576451956210405376L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 19791209299961L) != 0)) {
				{
				setState(170);
				listaParametros();
				}
			}

			setState(173);
			match(TKN_closing_par);
			setState(174);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaParametrosContext extends ParserRuleContext {
		public List<DeclaracionVariableContext> declaracionVariable() {
			return getRuleContexts(DeclaracionVariableContext.class);
		}
		public DeclaracionVariableContext declaracionVariable(int i) {
			return getRuleContext(DeclaracionVariableContext.class,i);
		}
		public List<TerminalNode> TKN_comma() { return getTokens(EsJsParser.TKN_comma); }
		public TerminalNode TKN_comma(int i) {
			return getToken(EsJsParser.TKN_comma, i);
		}
		public TerminalNode TKN_spread() { return getToken(EsJsParser.TKN_spread, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public ListaParametrosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaParametros; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterListaParametros(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitListaParametros(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitListaParametros(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaParametrosContext listaParametros() throws RecognitionException {
		ListaParametrosContext _localctx = new ListaParametrosContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_listaParametros);
		int _la;
		try {
			int _alt;
			setState(191);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_ambiente:
			case TKN_aExponencial:
			case TKN_fijarDecimales:
			case TKN_aCadenaLocalizado:
			case TKN_aPrecision:
			case TKN_aCadena:
			case TKN_valorDe:
			case TKN_esFinito:
			case TKN_esEntero:
			case TKN_NeN:
			case TKN_esEnteroSeguro:
			case TKN_interpretarDecimal:
			case TKN_interpretarEntero:
			case TKN_MAX_VALUE:
			case TKN_MIN_VALUE:
			case TKN_POSITIVE_INFINITY:
			case TKN_NEGATIVE_INFINITY:
			case TKN_PI:
			case TKN_absoluto:
			case TKN_arcocosenoHiperbolico:
			case TKN_arcocoseno:
			case TKN_arcosenoHiperbolico:
			case TKN_arcoseno:
			case TKN_arcotangente2:
			case TKN_arcotangenteHiperbolica:
			case TKN_arcotangente:
			case TKN_cerosALaIzquierdaEn32Bits:
			case TKN_cosenoHiperbolico:
			case TKN_coseno:
			case TKN_exponencialMate:
			case TKN_exponencialMenos1:
			case TKN_exponencial:
			case TKN_floor:
			case TKN_hipotenusa:
			case TKN_logaritmoBase10:
			case TKN_logaritmoBase2:
			case TKN_logaritmoDe1Mas:
			case TKN_logaritmo:
			case TKN_maximo:
			case TKN_minimo:
			case TKN_multiplicacionEntera:
			case TKN_potencia:
			case TKN_raizCubica:
			case TKN_raizCuadrada:
			case TKN_redondearAComaFlotante:
			case TKN_redondearHaciaAbajo:
			case TKN_redondearHaciaArriba:
			case TKN_redondear:
			case TKN_senoHiperbolico:
			case TKN_seno:
			case TKN_signo:
			case TKN_tangenteHiperbolica:
			case TKN_tangente:
			case TKN_truncar:
			case TKN_aleatorio:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(176);
				declaracionVariable();
				setState(181);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(177);
						match(TKN_comma);
						setState(178);
						declaracionVariable();
						}
						} 
					}
					setState(183);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
				}
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==TKN_comma) {
					{
					setState(184);
					match(TKN_comma);
					setState(185);
					match(TKN_spread);
					setState(186);
					identificador();
					}
				}

				}
				break;
			case TKN_spread:
				enterOuterAlt(_localctx, 2);
				{
				setState(189);
				match(TKN_spread);
				setState(190);
				identificador();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FuncionFlechaContext extends ParserRuleContext {
		public TerminalNode TKN_opening_par() { return getToken(EsJsParser.TKN_opening_par, 0); }
		public TerminalNode TKN_closing_par() { return getToken(EsJsParser.TKN_closing_par, 0); }
		public TerminalNode TKN_arrow() { return getToken(EsJsParser.TKN_arrow, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ExpresionUnicaContext expresionUnica() {
			return getRuleContext(ExpresionUnicaContext.class,0);
		}
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public FuncionFlechaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcionFlecha; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterFuncionFlecha(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitFuncionFlecha(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitFuncionFlecha(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FuncionFlechaContext funcionFlecha() throws RecognitionException {
		FuncionFlechaContext _localctx = new FuncionFlechaContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_funcionFlecha);
		int _la;
		try {
			setState(209);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_opening_par:
				enterOuterAlt(_localctx, 1);
				{
				setState(193);
				match(TKN_opening_par);
				setState(195);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576451956210405376L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 19791209299961L) != 0)) {
					{
					setState(194);
					listaParametros();
					}
				}

				setState(197);
				match(TKN_closing_par);
				setState(198);
				match(TKN_arrow);
				setState(201);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
				case 1:
					{
					setState(199);
					bloque();
					}
					break;
				case 2:
					{
					setState(200);
					expresionUnica(0);
					}
					break;
				}
				}
				break;
			case TKN_ambiente:
			case TKN_aExponencial:
			case TKN_fijarDecimales:
			case TKN_aCadenaLocalizado:
			case TKN_aPrecision:
			case TKN_aCadena:
			case TKN_valorDe:
			case TKN_esFinito:
			case TKN_esEntero:
			case TKN_NeN:
			case TKN_esEnteroSeguro:
			case TKN_interpretarDecimal:
			case TKN_interpretarEntero:
			case TKN_MAX_VALUE:
			case TKN_MIN_VALUE:
			case TKN_POSITIVE_INFINITY:
			case TKN_NEGATIVE_INFINITY:
			case TKN_PI:
			case TKN_absoluto:
			case TKN_arcocosenoHiperbolico:
			case TKN_arcocoseno:
			case TKN_arcosenoHiperbolico:
			case TKN_arcoseno:
			case TKN_arcotangente2:
			case TKN_arcotangenteHiperbolica:
			case TKN_arcotangente:
			case TKN_cerosALaIzquierdaEn32Bits:
			case TKN_cosenoHiperbolico:
			case TKN_coseno:
			case TKN_exponencialMate:
			case TKN_exponencialMenos1:
			case TKN_exponencial:
			case TKN_floor:
			case TKN_hipotenusa:
			case TKN_logaritmoBase10:
			case TKN_logaritmoBase2:
			case TKN_logaritmoDe1Mas:
			case TKN_logaritmo:
			case TKN_maximo:
			case TKN_minimo:
			case TKN_multiplicacionEntera:
			case TKN_potencia:
			case TKN_raizCubica:
			case TKN_raizCuadrada:
			case TKN_redondearAComaFlotante:
			case TKN_redondearHaciaAbajo:
			case TKN_redondearHaciaArriba:
			case TKN_redondear:
			case TKN_senoHiperbolico:
			case TKN_seno:
			case TKN_signo:
			case TKN_tangenteHiperbolica:
			case TKN_tangente:
			case TKN_truncar:
			case TKN_aleatorio:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(203);
				identificador();
				setState(204);
				match(TKN_arrow);
				setState(207);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(205);
					bloque();
					}
					break;
				case 2:
					{
					setState(206);
					expresionUnica(0);
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaSiContext extends ParserRuleContext {
		public TerminalNode TKN_si() { return getToken(EsJsParser.TKN_si, 0); }
		public TerminalNode TKN_opening_par() { return getToken(EsJsParser.TKN_opening_par, 0); }
		public SecuenciaExpresionesContext secuenciaExpresiones() {
			return getRuleContext(SecuenciaExpresionesContext.class,0);
		}
		public TerminalNode TKN_closing_par() { return getToken(EsJsParser.TKN_closing_par, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode TKN_sino() { return getToken(EsJsParser.TKN_sino, 0); }
		public SentenciaSiContext sentenciaSi() {
			return getRuleContext(SentenciaSiContext.class,0);
		}
		public SentenciaSiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaSi; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterSentenciaSi(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitSentenciaSi(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitSentenciaSi(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaSiContext sentenciaSi() throws RecognitionException {
		SentenciaSiContext _localctx = new SentenciaSiContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sentenciaSi);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(TKN_si);
			setState(212);
			match(TKN_opening_par);
			setState(213);
			secuenciaExpresiones();
			setState(214);
			match(TKN_closing_par);
			setState(215);
			bloque();
			setState(221);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_sino) {
				{
				setState(216);
				match(TKN_sino);
				setState(219);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TKN_opening_key:
					{
					setState(217);
					bloque();
					}
					break;
				case TKN_si:
					{
					setState(218);
					sentenciaSi();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaIterarContext extends ParserRuleContext {
		public TerminalNode TKN_hacer() { return getToken(EsJsParser.TKN_hacer, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public TerminalNode TKN_mientras() { return getToken(EsJsParser.TKN_mientras, 0); }
		public TerminalNode TKN_opening_par() { return getToken(EsJsParser.TKN_opening_par, 0); }
		public SecuenciaExpresionesContext secuenciaExpresiones() {
			return getRuleContext(SecuenciaExpresionesContext.class,0);
		}
		public TerminalNode TKN_closing_par() { return getToken(EsJsParser.TKN_closing_par, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public TerminalNode TKN_para() { return getToken(EsJsParser.TKN_para, 0); }
		public List<TerminalNode> TKN_semicolon() { return getTokens(EsJsParser.TKN_semicolon); }
		public TerminalNode TKN_semicolon(int i) {
			return getToken(EsJsParser.TKN_semicolon, i);
		}
		public InicioForContext inicioFor() {
			return getRuleContext(InicioForContext.class,0);
		}
		public CondicionForContext condicionFor() {
			return getRuleContext(CondicionForContext.class,0);
		}
		public ActualizacionForContext actualizacionFor() {
			return getRuleContext(ActualizacionForContext.class,0);
		}
		public SentenciaIterarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaIterar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterSentenciaIterar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitSentenciaIterar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitSentenciaIterar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaIterarContext sentenciaIterar() throws RecognitionException {
		SentenciaIterarContext _localctx = new SentenciaIterarContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sentenciaIterar);
		int _la;
		try {
			setState(252);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_hacer:
				enterOuterAlt(_localctx, 1);
				{
				setState(223);
				match(TKN_hacer);
				setState(224);
				bloque();
				setState(225);
				match(TKN_mientras);
				setState(226);
				match(TKN_opening_par);
				setState(227);
				secuenciaExpresiones();
				setState(228);
				match(TKN_closing_par);
				setState(229);
				eos();
				}
				break;
			case TKN_mientras:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				match(TKN_mientras);
				setState(232);
				match(TKN_opening_par);
				setState(233);
				secuenciaExpresiones();
				setState(234);
				match(TKN_closing_par);
				setState(235);
				bloque();
				}
				break;
			case TKN_para:
				enterOuterAlt(_localctx, 3);
				{
				setState(237);
				match(TKN_para);
				setState(238);
				match(TKN_opening_par);
				setState(240);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576459659272327674L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 864708720641179641L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 189L) != 0)) {
					{
					setState(239);
					inicioFor();
					}
				}

				setState(242);
				match(TKN_semicolon);
				setState(244);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576457458101522938L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 864708720641179641L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 189L) != 0)) {
					{
					setState(243);
					condicionFor();
					}
				}

				setState(246);
				match(TKN_semicolon);
				setState(248);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576457458101522938L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 864708720641179641L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 189L) != 0)) {
					{
					setState(247);
					actualizacionFor();
					}
				}

				setState(250);
				match(TKN_closing_par);
				setState(251);
				bloque();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InicioForContext extends ParserRuleContext {
		public ListaDeclaracionVariableContext listaDeclaracionVariable() {
			return getRuleContext(ListaDeclaracionVariableContext.class,0);
		}
		public SecuenciaExpresionesContext secuenciaExpresiones() {
			return getRuleContext(SecuenciaExpresionesContext.class,0);
		}
		public InicioForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicioFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterInicioFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitInicioFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitInicioFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InicioForContext inicioFor() throws RecognitionException {
		InicioForContext _localctx = new InicioForContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_inicioFor);
		try {
			setState(256);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_const:
			case TKN_mut:
			case TKN_var:
				enterOuterAlt(_localctx, 1);
				{
				setState(254);
				listaDeclaracionVariable();
				}
				break;
			case TKN_Arreglo:
			case TKN_Cadena:
			case TKN_Infinito:
			case TKN_Mate:
			case TKN_Matriz:
			case TKN_NuN:
			case TKN_Numero:
			case TKN_ambiente:
			case TKN_crear:
			case TKN_falso:
			case TKN_indefinido:
			case TKN_nulo:
			case TKN_tipoDe:
			case TKN_verdadero:
			case TKN_aExponencial:
			case TKN_fijarDecimales:
			case TKN_aCadenaLocalizado:
			case TKN_aPrecision:
			case TKN_aCadena:
			case TKN_valorDe:
			case TKN_esFinito:
			case TKN_esEntero:
			case TKN_NeN:
			case TKN_esEnteroSeguro:
			case TKN_interpretarDecimal:
			case TKN_interpretarEntero:
			case TKN_MAX_VALUE:
			case TKN_MIN_VALUE:
			case TKN_POSITIVE_INFINITY:
			case TKN_NEGATIVE_INFINITY:
			case TKN_PI:
			case TKN_absoluto:
			case TKN_arcocosenoHiperbolico:
			case TKN_arcocoseno:
			case TKN_arcosenoHiperbolico:
			case TKN_arcoseno:
			case TKN_arcotangente2:
			case TKN_arcotangenteHiperbolica:
			case TKN_arcotangente:
			case TKN_cerosALaIzquierdaEn32Bits:
			case TKN_cosenoHiperbolico:
			case TKN_coseno:
			case TKN_exponencialMate:
			case TKN_exponencialMenos1:
			case TKN_exponencial:
			case TKN_floor:
			case TKN_hipotenusa:
			case TKN_logaritmoBase10:
			case TKN_logaritmoBase2:
			case TKN_logaritmoDe1Mas:
			case TKN_logaritmo:
			case TKN_maximo:
			case TKN_minimo:
			case TKN_multiplicacionEntera:
			case TKN_potencia:
			case TKN_raizCubica:
			case TKN_raizCuadrada:
			case TKN_redondearAComaFlotante:
			case TKN_redondearHaciaAbajo:
			case TKN_redondearHaciaArriba:
			case TKN_redondear:
			case TKN_senoHiperbolico:
			case TKN_seno:
			case TKN_signo:
			case TKN_tangenteHiperbolica:
			case TKN_tangente:
			case TKN_truncar:
			case TKN_aleatorio:
			case ID:
			case TKN_str:
			case TKN_num:
			case TKN_reg:
			case TKN_decrement:
			case TKN_increment:
			case TKN_minus:
			case TKN_not:
			case TKN_opening_bra:
			case TKN_opening_key:
			case TKN_opening_par:
			case TKN_plus:
				enterOuterAlt(_localctx, 2);
				{
				setState(255);
				secuenciaExpresiones();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CondicionForContext extends ParserRuleContext {
		public SecuenciaExpresionesContext secuenciaExpresiones() {
			return getRuleContext(SecuenciaExpresionesContext.class,0);
		}
		public CondicionForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condicionFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterCondicionFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitCondicionFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitCondicionFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CondicionForContext condicionFor() throws RecognitionException {
		CondicionForContext _localctx = new CondicionForContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_condicionFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(258);
			secuenciaExpresiones();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ActualizacionForContext extends ParserRuleContext {
		public SecuenciaExpresionesContext secuenciaExpresiones() {
			return getRuleContext(SecuenciaExpresionesContext.class,0);
		}
		public ActualizacionForContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_actualizacionFor; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterActualizacionFor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitActualizacionFor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitActualizacionFor(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ActualizacionForContext actualizacionFor() throws RecognitionException {
		ActualizacionForContext _localctx = new ActualizacionForContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_actualizacionFor);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(260);
			secuenciaExpresiones();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaContinuarContext extends ParserRuleContext {
		public TerminalNode TKN_continuar() { return getToken(EsJsParser.TKN_continuar, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public SentenciaContinuarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaContinuar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterSentenciaContinuar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitSentenciaContinuar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitSentenciaContinuar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaContinuarContext sentenciaContinuar() throws RecognitionException {
		SentenciaContinuarContext _localctx = new SentenciaContinuarContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sentenciaContinuar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(262);
			match(TKN_continuar);
			setState(263);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaRomperContext extends ParserRuleContext {
		public TerminalNode TKN_romper() { return getToken(EsJsParser.TKN_romper, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public SentenciaRomperContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaRomper; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterSentenciaRomper(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitSentenciaRomper(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitSentenciaRomper(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaRomperContext sentenciaRomper() throws RecognitionException {
		SentenciaRomperContext _localctx = new SentenciaRomperContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sentenciaRomper);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(265);
			match(TKN_romper);
			setState(266);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaRetornarContext extends ParserRuleContext {
		public TerminalNode TKN_retornar() { return getToken(EsJsParser.TKN_retornar, 0); }
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public SecuenciaExpresionesContext secuenciaExpresiones() {
			return getRuleContext(SecuenciaExpresionesContext.class,0);
		}
		public SentenciaRetornarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaRetornar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterSentenciaRetornar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitSentenciaRetornar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitSentenciaRetornar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaRetornarContext sentenciaRetornar() throws RecognitionException {
		SentenciaRetornarContext _localctx = new SentenciaRetornarContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_sentenciaRetornar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(268);
			match(TKN_retornar);
			setState(270);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,20,_ctx) ) {
			case 1:
				{
				setState(269);
				secuenciaExpresiones();
				}
				break;
			}
			setState(272);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaElegirContext extends ParserRuleContext {
		public TerminalNode TKN_elegir() { return getToken(EsJsParser.TKN_elegir, 0); }
		public TerminalNode TKN_opening_par() { return getToken(EsJsParser.TKN_opening_par, 0); }
		public SecuenciaExpresionesContext secuenciaExpresiones() {
			return getRuleContext(SecuenciaExpresionesContext.class,0);
		}
		public TerminalNode TKN_closing_par() { return getToken(EsJsParser.TKN_closing_par, 0); }
		public BloqueCasoContext bloqueCaso() {
			return getRuleContext(BloqueCasoContext.class,0);
		}
		public SentenciaElegirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaElegir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterSentenciaElegir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitSentenciaElegir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitSentenciaElegir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaElegirContext sentenciaElegir() throws RecognitionException {
		SentenciaElegirContext _localctx = new SentenciaElegirContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_sentenciaElegir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(274);
			match(TKN_elegir);
			setState(275);
			match(TKN_opening_par);
			setState(276);
			secuenciaExpresiones();
			setState(277);
			match(TKN_closing_par);
			setState(278);
			bloqueCaso();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BloqueCasoContext extends ParserRuleContext {
		public TerminalNode TKN_opening_key() { return getToken(EsJsParser.TKN_opening_key, 0); }
		public TerminalNode TKN_closing_key() { return getToken(EsJsParser.TKN_closing_key, 0); }
		public List<CasoSTMTContext> casoSTMT() {
			return getRuleContexts(CasoSTMTContext.class);
		}
		public CasoSTMTContext casoSTMT(int i) {
			return getRuleContext(CasoSTMTContext.class,i);
		}
		public CasoDefectoContext casoDefecto() {
			return getRuleContext(CasoDefectoContext.class,0);
		}
		public BloqueCasoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bloqueCaso; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterBloqueCaso(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitBloqueCaso(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitBloqueCaso(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BloqueCasoContext bloqueCaso() throws RecognitionException {
		BloqueCasoContext _localctx = new BloqueCasoContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_bloqueCaso);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
			match(TKN_opening_key);
			setState(284);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(281);
					casoSTMT();
					}
					} 
				}
				setState(286);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,21,_ctx);
			}
			setState(288);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_porDefecto) {
				{
				setState(287);
				casoDefecto();
				}
			}

			setState(293);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_caso) {
				{
				{
				setState(290);
				casoSTMT();
				}
				}
				setState(295);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(296);
			match(TKN_closing_key);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasoSTMTContext extends ParserRuleContext {
		public TerminalNode TKN_caso() { return getToken(EsJsParser.TKN_caso, 0); }
		public SecuenciaExpresionesContext secuenciaExpresiones() {
			return getRuleContext(SecuenciaExpresionesContext.class,0);
		}
		public TerminalNode TKN_colon() { return getToken(EsJsParser.TKN_colon, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public CasoSTMTContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casoSTMT; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterCasoSTMT(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitCasoSTMT(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitCasoSTMT(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoSTMTContext casoSTMT() throws RecognitionException {
		CasoSTMTContext _localctx = new CasoSTMTContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_casoSTMT);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
			match(TKN_caso);
			setState(299);
			secuenciaExpresiones();
			setState(300);
			match(TKN_colon);
			setState(304);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576459909614244346L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 864708720641179641L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 445L) != 0)) {
				{
				{
				setState(301);
				instruccion();
				}
				}
				setState(306);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CasoDefectoContext extends ParserRuleContext {
		public TerminalNode TKN_porDefecto() { return getToken(EsJsParser.TKN_porDefecto, 0); }
		public TerminalNode TKN_colon() { return getToken(EsJsParser.TKN_colon, 0); }
		public List<InstruccionContext> instruccion() {
			return getRuleContexts(InstruccionContext.class);
		}
		public InstruccionContext instruccion(int i) {
			return getRuleContext(InstruccionContext.class,i);
		}
		public CasoDefectoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_casoDefecto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterCasoDefecto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitCasoDefecto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitCasoDefecto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CasoDefectoContext casoDefecto() throws RecognitionException {
		CasoDefectoContext _localctx = new CasoDefectoContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_casoDefecto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(307);
			match(TKN_porDefecto);
			setState(308);
			match(TKN_colon);
			setState(312);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576459909614244346L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 864708720641179641L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 445L) != 0)) {
				{
				{
				setState(309);
				instruccion();
				}
				}
				setState(314);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaIntentarContext extends ParserRuleContext {
		public TerminalNode TKN_intentar() { return getToken(EsJsParser.TKN_intentar, 0); }
		public List<BloqueContext> bloque() {
			return getRuleContexts(BloqueContext.class);
		}
		public BloqueContext bloque(int i) {
			return getRuleContext(BloqueContext.class,i);
		}
		public TerminalNode TKN_capturar() { return getToken(EsJsParser.TKN_capturar, 0); }
		public TerminalNode TKN_opening_par() { return getToken(EsJsParser.TKN_opening_par, 0); }
		public TerminalNode TKN_closing_par() { return getToken(EsJsParser.TKN_closing_par, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public SentenciaIntentarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaIntentar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterSentenciaIntentar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitSentenciaIntentar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitSentenciaIntentar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaIntentarContext sentenciaIntentar() throws RecognitionException {
		SentenciaIntentarContext _localctx = new SentenciaIntentarContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sentenciaIntentar);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(315);
			match(TKN_intentar);
			setState(316);
			bloque();
			setState(317);
			match(TKN_capturar);
			setState(323);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_opening_par) {
				{
				setState(318);
				match(TKN_opening_par);
				setState(320);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576451956210405376L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2199023255545L) != 0)) {
					{
					setState(319);
					identificador();
					}
				}

				setState(322);
				match(TKN_closing_par);
				}
			}

			setState(325);
			bloque();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaConsolaContext extends ParserRuleContext {
		public TerminalNode TKN_consola() { return getToken(EsJsParser.TKN_consola, 0); }
		public TerminalNode TKN_period() { return getToken(EsJsParser.TKN_period, 0); }
		public MetodoConsolaContext metodoConsola() {
			return getRuleContext(MetodoConsolaContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public SentenciaConsolaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaConsola; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterSentenciaConsola(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitSentenciaConsola(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitSentenciaConsola(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaConsolaContext sentenciaConsola() throws RecognitionException {
		SentenciaConsolaContext _localctx = new SentenciaConsolaContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sentenciaConsola);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(327);
			match(TKN_consola);
			setState(328);
			match(TKN_period);
			setState(329);
			metodoConsola();
			setState(330);
			argumentos();
			setState(331);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MetodoConsolaContext extends ParserRuleContext {
		public TerminalNode TKN_afirmar() { return getToken(EsJsParser.TKN_afirmar, 0); }
		public TerminalNode TKN_agrupar() { return getToken(EsJsParser.TKN_agrupar, 0); }
		public TerminalNode TKN_error() { return getToken(EsJsParser.TKN_error, 0); }
		public TerminalNode TKN_escribir() { return getToken(EsJsParser.TKN_escribir, 0); }
		public TerminalNode TKN_info() { return getToken(EsJsParser.TKN_info, 0); }
		public TerminalNode TKN_limpiar() { return getToken(EsJsParser.TKN_limpiar, 0); }
		public TerminalNode TKN_tabla() { return getToken(EsJsParser.TKN_tabla, 0); }
		public MetodoConsolaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodoConsola; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterMetodoConsola(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitMetodoConsola(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitMetodoConsola(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodoConsolaContext metodoConsola() throws RecognitionException {
		MetodoConsolaContext _localctx = new MetodoConsolaContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_metodoConsola);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(333);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 550094506496L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SentenciaExpresionContext extends ParserRuleContext {
		public SecuenciaExpresionesContext secuenciaExpresiones() {
			return getRuleContext(SecuenciaExpresionesContext.class,0);
		}
		public EosContext eos() {
			return getRuleContext(EosContext.class,0);
		}
		public SentenciaExpresionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sentenciaExpresion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterSentenciaExpresion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitSentenciaExpresion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitSentenciaExpresion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SentenciaExpresionContext sentenciaExpresion() throws RecognitionException {
		SentenciaExpresionContext _localctx = new SentenciaExpresionContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sentenciaExpresion);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(335);
			secuenciaExpresiones();
			setState(336);
			eos();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SecuenciaExpresionesContext extends ParserRuleContext {
		public List<ExpresionUnicaContext> expresionUnica() {
			return getRuleContexts(ExpresionUnicaContext.class);
		}
		public ExpresionUnicaContext expresionUnica(int i) {
			return getRuleContext(ExpresionUnicaContext.class,i);
		}
		public List<TerminalNode> TKN_comma() { return getTokens(EsJsParser.TKN_comma); }
		public TerminalNode TKN_comma(int i) {
			return getToken(EsJsParser.TKN_comma, i);
		}
		public SecuenciaExpresionesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_secuenciaExpresiones; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterSecuenciaExpresiones(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitSecuenciaExpresiones(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitSecuenciaExpresiones(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SecuenciaExpresionesContext secuenciaExpresiones() throws RecognitionException {
		SecuenciaExpresionesContext _localctx = new SecuenciaExpresionesContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_secuenciaExpresiones);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(338);
			expresionUnica(0);
			setState(343);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(339);
					match(TKN_comma);
					setState(340);
					expresionUnica(0);
					}
					} 
				}
				setState(345);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpresionUnicaContext extends ParserRuleContext {
		public FuncionFlechaContext funcionFlecha() {
			return getRuleContext(FuncionFlechaContext.class,0);
		}
		public TerminalNode TKN_crear() { return getToken(EsJsParser.TKN_crear, 0); }
		public RestoCrearContext restoCrear() {
			return getRuleContext(RestoCrearContext.class,0);
		}
		public TerminalNode TKN_tipoDe() { return getToken(EsJsParser.TKN_tipoDe, 0); }
		public List<ExpresionUnicaContext> expresionUnica() {
			return getRuleContexts(ExpresionUnicaContext.class);
		}
		public ExpresionUnicaContext expresionUnica(int i) {
			return getRuleContext(ExpresionUnicaContext.class,i);
		}
		public OperadorUnarioContext operadorUnario() {
			return getRuleContext(OperadorUnarioContext.class,0);
		}
		public TerminalNode TKN_ambiente() { return getToken(EsJsParser.TKN_ambiente, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode TKN_Mate() { return getToken(EsJsParser.TKN_Mate, 0); }
		public TerminalNode TKN_period() { return getToken(EsJsParser.TKN_period, 0); }
		public TipoMetodoMateContext tipoMetodoMate() {
			return getRuleContext(TipoMetodoMateContext.class,0);
		}
		public TerminalNode TKN_Numero() { return getToken(EsJsParser.TKN_Numero, 0); }
		public TipoMetodoNumeroContext tipoMetodoNumero() {
			return getRuleContext(TipoMetodoNumeroContext.class,0);
		}
		public TipoNativoContext tipoNativo() {
			return getRuleContext(TipoNativoContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public ArregloLiteralContext arregloLiteral() {
			return getRuleContext(ArregloLiteralContext.class,0);
		}
		public ObjetoLiteralContext objetoLiteral() {
			return getRuleContext(ObjetoLiteralContext.class,0);
		}
		public TerminalNode TKN_opening_par() { return getToken(EsJsParser.TKN_opening_par, 0); }
		public TerminalNode TKN_closing_par() { return getToken(EsJsParser.TKN_closing_par, 0); }
		public TerminalNode TKN_power() { return getToken(EsJsParser.TKN_power, 0); }
		public OperadorMultiplicacionContext operadorMultiplicacion() {
			return getRuleContext(OperadorMultiplicacionContext.class,0);
		}
		public OperadorAdicionContext operadorAdicion() {
			return getRuleContext(OperadorAdicionContext.class,0);
		}
		public TerminalNode TKN_nulish() { return getToken(EsJsParser.TKN_nulish, 0); }
		public OperadorRelacionalContext operadorRelacional() {
			return getRuleContext(OperadorRelacionalContext.class,0);
		}
		public OperadorIgualdadContext operadorIgualdad() {
			return getRuleContext(OperadorIgualdadContext.class,0);
		}
		public TerminalNode TKN_and() { return getToken(EsJsParser.TKN_and, 0); }
		public TerminalNode TKN_or() { return getToken(EsJsParser.TKN_or, 0); }
		public TerminalNode TKN_ternary() { return getToken(EsJsParser.TKN_ternary, 0); }
		public TerminalNode TKN_colon() { return getToken(EsJsParser.TKN_colon, 0); }
		public TerminalNode TKN_assign() { return getToken(EsJsParser.TKN_assign, 0); }
		public OperadorAsignacionContext operadorAsignacion() {
			return getRuleContext(OperadorAsignacionContext.class,0);
		}
		public TerminalNode TKN_opening_bra() { return getToken(EsJsParser.TKN_opening_bra, 0); }
		public SecuenciaExpresionesContext secuenciaExpresiones() {
			return getRuleContext(SecuenciaExpresionesContext.class,0);
		}
		public TerminalNode TKN_closing_bra() { return getToken(EsJsParser.TKN_closing_bra, 0); }
		public NombreAccesibleContext nombreAccesible() {
			return getRuleContext(NombreAccesibleContext.class,0);
		}
		public TerminalNode TKN_increment() { return getToken(EsJsParser.TKN_increment, 0); }
		public TerminalNode TKN_decrement() { return getToken(EsJsParser.TKN_decrement, 0); }
		public ExpresionUnicaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expresionUnica; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterExpresionUnica(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitExpresionUnica(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitExpresionUnica(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpresionUnicaContext expresionUnica() throws RecognitionException {
		return expresionUnica(0);
	}

	private ExpresionUnicaContext expresionUnica(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpresionUnicaContext _localctx = new ExpresionUnicaContext(_ctx, _parentState);
		ExpresionUnicaContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, 56, RULE_expresionUnica, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(374);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(347);
				funcionFlecha();
				}
				break;
			case 2:
				{
				setState(348);
				match(TKN_crear);
				setState(349);
				restoCrear();
				}
				break;
			case 3:
				{
				setState(350);
				match(TKN_tipoDe);
				setState(351);
				expresionUnica(22);
				}
				break;
			case 4:
				{
				setState(352);
				operadorUnario();
				setState(353);
				expresionUnica(21);
				}
				break;
			case 5:
				{
				setState(355);
				match(TKN_ambiente);
				}
				break;
			case 6:
				{
				setState(356);
				identificador();
				}
				break;
			case 7:
				{
				setState(357);
				match(TKN_Mate);
				setState(358);
				match(TKN_period);
				setState(359);
				tipoMetodoMate();
				}
				break;
			case 8:
				{
				setState(360);
				match(TKN_Numero);
				setState(361);
				match(TKN_period);
				setState(362);
				tipoMetodoNumero();
				}
				break;
			case 9:
				{
				setState(363);
				tipoNativo();
				setState(365);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(364);
					argumentos();
					}
					break;
				}
				}
				break;
			case 10:
				{
				setState(367);
				literal();
				}
				break;
			case 11:
				{
				setState(368);
				arregloLiteral();
				}
				break;
			case 12:
				{
				setState(369);
				objetoLiteral();
				}
				break;
			case 13:
				{
				setState(370);
				match(TKN_opening_par);
				setState(371);
				expresionUnica(0);
				setState(372);
				match(TKN_closing_par);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(433);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(431);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,31,_ctx) ) {
					case 1:
						{
						_localctx = new ExpresionUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresionUnica);
						setState(376);
						if (!(precpred(_ctx, 20))) throw new FailedPredicateException(this, "precpred(_ctx, 20)");
						setState(377);
						match(TKN_power);
						setState(378);
						expresionUnica(21);
						}
						break;
					case 2:
						{
						_localctx = new ExpresionUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresionUnica);
						setState(379);
						if (!(precpred(_ctx, 19))) throw new FailedPredicateException(this, "precpred(_ctx, 19)");
						setState(380);
						operadorMultiplicacion();
						setState(381);
						expresionUnica(20);
						}
						break;
					case 3:
						{
						_localctx = new ExpresionUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresionUnica);
						setState(383);
						if (!(precpred(_ctx, 18))) throw new FailedPredicateException(this, "precpred(_ctx, 18)");
						setState(384);
						operadorAdicion();
						setState(385);
						expresionUnica(19);
						}
						break;
					case 4:
						{
						_localctx = new ExpresionUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresionUnica);
						setState(387);
						if (!(precpred(_ctx, 17))) throw new FailedPredicateException(this, "precpred(_ctx, 17)");
						setState(388);
						match(TKN_nulish);
						setState(389);
						expresionUnica(18);
						}
						break;
					case 5:
						{
						_localctx = new ExpresionUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresionUnica);
						setState(390);
						if (!(precpred(_ctx, 16))) throw new FailedPredicateException(this, "precpred(_ctx, 16)");
						setState(391);
						operadorRelacional();
						setState(392);
						expresionUnica(17);
						}
						break;
					case 6:
						{
						_localctx = new ExpresionUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresionUnica);
						setState(394);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(395);
						operadorIgualdad();
						setState(396);
						expresionUnica(16);
						}
						break;
					case 7:
						{
						_localctx = new ExpresionUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresionUnica);
						setState(398);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(399);
						match(TKN_and);
						setState(400);
						expresionUnica(15);
						}
						break;
					case 8:
						{
						_localctx = new ExpresionUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresionUnica);
						setState(401);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(402);
						match(TKN_or);
						setState(403);
						expresionUnica(14);
						}
						break;
					case 9:
						{
						_localctx = new ExpresionUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresionUnica);
						setState(404);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(405);
						match(TKN_ternary);
						setState(406);
						expresionUnica(0);
						setState(407);
						match(TKN_colon);
						setState(408);
						expresionUnica(13);
						}
						break;
					case 10:
						{
						_localctx = new ExpresionUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresionUnica);
						setState(410);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(411);
						match(TKN_assign);
						setState(412);
						expresionUnica(12);
						}
						break;
					case 11:
						{
						_localctx = new ExpresionUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresionUnica);
						setState(413);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(414);
						operadorAsignacion();
						setState(415);
						expresionUnica(11);
						}
						break;
					case 12:
						{
						_localctx = new ExpresionUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresionUnica);
						setState(417);
						if (!(precpred(_ctx, 28))) throw new FailedPredicateException(this, "precpred(_ctx, 28)");
						setState(418);
						match(TKN_opening_bra);
						setState(419);
						secuenciaExpresiones();
						setState(420);
						match(TKN_closing_bra);
						}
						break;
					case 13:
						{
						_localctx = new ExpresionUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresionUnica);
						setState(422);
						if (!(precpred(_ctx, 27))) throw new FailedPredicateException(this, "precpred(_ctx, 27)");
						setState(423);
						match(TKN_period);
						setState(424);
						nombreAccesible();
						}
						break;
					case 14:
						{
						_localctx = new ExpresionUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresionUnica);
						setState(425);
						if (!(precpred(_ctx, 25))) throw new FailedPredicateException(this, "precpred(_ctx, 25)");
						setState(426);
						argumentos();
						}
						break;
					case 15:
						{
						_localctx = new ExpresionUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresionUnica);
						setState(427);
						if (!(precpred(_ctx, 24))) throw new FailedPredicateException(this, "precpred(_ctx, 24)");
						setState(428);
						match(TKN_increment);
						}
						break;
					case 16:
						{
						_localctx = new ExpresionUnicaContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expresionUnica);
						setState(429);
						if (!(precpred(_ctx, 23))) throw new FailedPredicateException(this, "precpred(_ctx, 23)");
						setState(430);
						match(TKN_decrement);
						}
						break;
					}
					} 
				}
				setState(435);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,32,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RestoCrearContext extends ParserRuleContext {
		public TipoNativoContext tipoNativo() {
			return getRuleContext(TipoNativoContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public RestoCrearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_restoCrear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterRestoCrear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitRestoCrear(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitRestoCrear(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RestoCrearContext restoCrear() throws RecognitionException {
		RestoCrearContext _localctx = new RestoCrearContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_restoCrear);
		try {
			setState(444);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_Arreglo:
			case TKN_Cadena:
			case TKN_Matriz:
				enterOuterAlt(_localctx, 1);
				{
				setState(436);
				tipoNativo();
				setState(438);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
				case 1:
					{
					setState(437);
					argumentos();
					}
					break;
				}
				}
				break;
			case TKN_ambiente:
			case TKN_aExponencial:
			case TKN_fijarDecimales:
			case TKN_aCadenaLocalizado:
			case TKN_aPrecision:
			case TKN_aCadena:
			case TKN_valorDe:
			case TKN_esFinito:
			case TKN_esEntero:
			case TKN_NeN:
			case TKN_esEnteroSeguro:
			case TKN_interpretarDecimal:
			case TKN_interpretarEntero:
			case TKN_MAX_VALUE:
			case TKN_MIN_VALUE:
			case TKN_POSITIVE_INFINITY:
			case TKN_NEGATIVE_INFINITY:
			case TKN_PI:
			case TKN_absoluto:
			case TKN_arcocosenoHiperbolico:
			case TKN_arcocoseno:
			case TKN_arcosenoHiperbolico:
			case TKN_arcoseno:
			case TKN_arcotangente2:
			case TKN_arcotangenteHiperbolica:
			case TKN_arcotangente:
			case TKN_cerosALaIzquierdaEn32Bits:
			case TKN_cosenoHiperbolico:
			case TKN_coseno:
			case TKN_exponencialMate:
			case TKN_exponencialMenos1:
			case TKN_exponencial:
			case TKN_floor:
			case TKN_hipotenusa:
			case TKN_logaritmoBase10:
			case TKN_logaritmoBase2:
			case TKN_logaritmoDe1Mas:
			case TKN_logaritmo:
			case TKN_maximo:
			case TKN_minimo:
			case TKN_multiplicacionEntera:
			case TKN_potencia:
			case TKN_raizCubica:
			case TKN_raizCuadrada:
			case TKN_redondearAComaFlotante:
			case TKN_redondearHaciaAbajo:
			case TKN_redondearHaciaArriba:
			case TKN_redondear:
			case TKN_senoHiperbolico:
			case TKN_seno:
			case TKN_signo:
			case TKN_tangenteHiperbolica:
			case TKN_tangente:
			case TKN_truncar:
			case TKN_aleatorio:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(440);
				identificador();
				setState(442);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
				case 1:
					{
					setState(441);
					argumentos();
					}
					break;
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NombreAccesibleContext extends ParserRuleContext {
		public TerminalNode TKN_NuN() { return getToken(EsJsParser.TKN_NuN, 0); }
		public TerminalNode TKN_Booleano() { return getToken(EsJsParser.TKN_Booleano, 0); }
		public TerminalNode TKN_Arreglo() { return getToken(EsJsParser.TKN_Arreglo, 0); }
		public TerminalNode TKN_Cadena() { return getToken(EsJsParser.TKN_Cadena, 0); }
		public TerminalNode TKN_Matriz() { return getToken(EsJsParser.TKN_Matriz, 0); }
		public TerminalNode TKN_aExponencial() { return getToken(EsJsParser.TKN_aExponencial, 0); }
		public TerminalNode TKN_fijarDecimales() { return getToken(EsJsParser.TKN_fijarDecimales, 0); }
		public TerminalNode TKN_aCadenaLocalizado() { return getToken(EsJsParser.TKN_aCadenaLocalizado, 0); }
		public TerminalNode TKN_aCadena() { return getToken(EsJsParser.TKN_aCadena, 0); }
		public TerminalNode TKN_valorDe() { return getToken(EsJsParser.TKN_valorDe, 0); }
		public TerminalNode TKN_agregar() { return getToken(EsJsParser.TKN_agregar, 0); }
		public TerminalNode TKN_longitud() { return getToken(EsJsParser.TKN_longitud, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public NombreAccesibleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombreAccesible; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterNombreAccesible(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitNombreAccesible(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitNombreAccesible(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombreAccesibleContext nombreAccesible() throws RecognitionException {
		NombreAccesibleContext _localctx = new NombreAccesibleContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_nombreAccesible);
		try {
			setState(459);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(TKN_NuN);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(447);
				match(TKN_Booleano);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(448);
				match(TKN_Arreglo);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(449);
				match(TKN_Cadena);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(450);
				match(TKN_Matriz);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(451);
				match(TKN_aExponencial);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(452);
				match(TKN_fijarDecimales);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(453);
				match(TKN_aCadenaLocalizado);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(454);
				match(TKN_aCadena);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(455);
				match(TKN_valorDe);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(456);
				match(TKN_agregar);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(457);
				match(TKN_longitud);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(458);
				identificador();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoMetodoNumeroContext extends ParserRuleContext {
		public ConstanteNumeroContext constanteNumero() {
			return getRuleContext(ConstanteNumeroContext.class,0);
		}
		public MetodoNumeroContext metodoNumero() {
			return getRuleContext(MetodoNumeroContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TipoMetodoNumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoMetodoNumero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterTipoMetodoNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitTipoMetodoNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitTipoMetodoNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoMetodoNumeroContext tipoMetodoNumero() throws RecognitionException {
		TipoMetodoNumeroContext _localctx = new TipoMetodoNumeroContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_tipoMetodoNumero);
		try {
			setState(465);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(461);
				constanteNumero();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(462);
				metodoNumero();
				setState(463);
				argumentos();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstanteNumeroContext extends ParserRuleContext {
		public TerminalNode TKN_MAX_VALUE() { return getToken(EsJsParser.TKN_MAX_VALUE, 0); }
		public TerminalNode TKN_MIN_VALUE() { return getToken(EsJsParser.TKN_MIN_VALUE, 0); }
		public TerminalNode TKN_POSITIVE_INFINITY() { return getToken(EsJsParser.TKN_POSITIVE_INFINITY, 0); }
		public TerminalNode TKN_NEGATIVE_INFINITY() { return getToken(EsJsParser.TKN_NEGATIVE_INFINITY, 0); }
		public TerminalNode TKN_NeN() { return getToken(EsJsParser.TKN_NeN, 0); }
		public ConstanteNumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constanteNumero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterConstanteNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitConstanteNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitConstanteNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteNumeroContext constanteNumero() throws RecognitionException {
		ConstanteNumeroContext _localctx = new ConstanteNumeroContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_constanteNumero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(467);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 542683755098144768L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MetodoNumeroContext extends ParserRuleContext {
		public TerminalNode TKN_esFinito() { return getToken(EsJsParser.TKN_esFinito, 0); }
		public TerminalNode TKN_esEntero() { return getToken(EsJsParser.TKN_esEntero, 0); }
		public TerminalNode TKN_NeN() { return getToken(EsJsParser.TKN_NeN, 0); }
		public TerminalNode TKN_esEnteroSeguro() { return getToken(EsJsParser.TKN_esEnteroSeguro, 0); }
		public TerminalNode TKN_interpretarDecimal() { return getToken(EsJsParser.TKN_interpretarDecimal, 0); }
		public TerminalNode TKN_interpretarEntero() { return getToken(EsJsParser.TKN_interpretarEntero, 0); }
		public TerminalNode TKN_aPrecision() { return getToken(EsJsParser.TKN_aPrecision, 0); }
		public MetodoNumeroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodoNumero; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterMetodoNumero(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitMetodoNumero(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitMetodoNumero(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodoNumeroContext metodoNumero() throws RecognitionException {
		MetodoNumeroContext _localctx = new MetodoNumeroContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_metodoNumero);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(469);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 35536215809720320L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoMetodoMateContext extends ParserRuleContext {
		public ConstanteMateContext constanteMate() {
			return getRuleContext(ConstanteMateContext.class,0);
		}
		public MetodoMateContext metodoMate() {
			return getRuleContext(MetodoMateContext.class,0);
		}
		public ArgumentosContext argumentos() {
			return getRuleContext(ArgumentosContext.class,0);
		}
		public TipoMetodoMateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoMetodoMate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterTipoMetodoMate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitTipoMetodoMate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitTipoMetodoMate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoMetodoMateContext tipoMetodoMate() throws RecognitionException {
		TipoMetodoMateContext _localctx = new TipoMetodoMateContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_tipoMetodoMate);
		try {
			setState(475);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_E:
			case TKN_LN2:
			case TKN_LN10:
			case TKN_LOG2E:
			case TKN_LOG10E:
			case TKN_PI:
			case TKN_SQRT1_2:
			case TKN_SQRT2:
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				constanteMate();
				}
				break;
			case TKN_absoluto:
			case TKN_arcocosenoHiperbolico:
			case TKN_arcocoseno:
			case TKN_arcosenoHiperbolico:
			case TKN_arcoseno:
			case TKN_arcotangente2:
			case TKN_arcotangenteHiperbolica:
			case TKN_arcotangente:
			case TKN_cerosALaIzquierdaEn32Bits:
			case TKN_cosenoHiperbolico:
			case TKN_coseno:
			case TKN_exponencialMate:
			case TKN_exponencialMenos1:
			case TKN_floor:
			case TKN_hipotenusa:
			case TKN_logaritmoBase10:
			case TKN_logaritmoBase2:
			case TKN_logaritmoDe1Mas:
			case TKN_logaritmo:
			case TKN_maximo:
			case TKN_minimo:
			case TKN_multiplicacionEntera:
			case TKN_potencia:
			case TKN_raizCubica:
			case TKN_raizCuadrada:
			case TKN_redondearAComaFlotante:
			case TKN_redondearHaciaAbajo:
			case TKN_redondearHaciaArriba:
			case TKN_redondear:
			case TKN_senoHiperbolico:
			case TKN_seno:
			case TKN_signo:
			case TKN_tangenteHiperbolica:
			case TKN_tangente:
			case TKN_truncar:
			case TKN_aleatorio:
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				metodoMate();
				setState(473);
				argumentos();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstanteMateContext extends ParserRuleContext {
		public TerminalNode TKN_E() { return getToken(EsJsParser.TKN_E, 0); }
		public TerminalNode TKN_LN2() { return getToken(EsJsParser.TKN_LN2, 0); }
		public TerminalNode TKN_LN10() { return getToken(EsJsParser.TKN_LN10, 0); }
		public TerminalNode TKN_LOG2E() { return getToken(EsJsParser.TKN_LOG2E, 0); }
		public TerminalNode TKN_LOG10E() { return getToken(EsJsParser.TKN_LOG10E, 0); }
		public TerminalNode TKN_PI() { return getToken(EsJsParser.TKN_PI, 0); }
		public TerminalNode TKN_SQRT1_2() { return getToken(EsJsParser.TKN_SQRT1_2, 0); }
		public TerminalNode TKN_SQRT2() { return getToken(EsJsParser.TKN_SQRT2, 0); }
		public ConstanteMateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constanteMate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterConstanteMate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitConstanteMate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitConstanteMate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstanteMateContext constanteMate() throws RecognitionException {
		ConstanteMateContext _localctx = new ConstanteMateContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_constanteMate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(477);
			_la = _input.LA(1);
			if ( !(((((_la - 59)) & ~0x3f) == 0 && ((1L << (_la - 59)) & 255L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MetodoMateContext extends ParserRuleContext {
		public TerminalNode TKN_absoluto() { return getToken(EsJsParser.TKN_absoluto, 0); }
		public TerminalNode TKN_arcocoseno() { return getToken(EsJsParser.TKN_arcocoseno, 0); }
		public TerminalNode TKN_arcocosenoHiperbolico() { return getToken(EsJsParser.TKN_arcocosenoHiperbolico, 0); }
		public TerminalNode TKN_arcoseno() { return getToken(EsJsParser.TKN_arcoseno, 0); }
		public TerminalNode TKN_arcosenoHiperbolico() { return getToken(EsJsParser.TKN_arcosenoHiperbolico, 0); }
		public TerminalNode TKN_arcotangente() { return getToken(EsJsParser.TKN_arcotangente, 0); }
		public TerminalNode TKN_arcotangente2() { return getToken(EsJsParser.TKN_arcotangente2, 0); }
		public TerminalNode TKN_arcotangenteHiperbolica() { return getToken(EsJsParser.TKN_arcotangenteHiperbolica, 0); }
		public TerminalNode TKN_coseno() { return getToken(EsJsParser.TKN_coseno, 0); }
		public TerminalNode TKN_cosenoHiperbolico() { return getToken(EsJsParser.TKN_cosenoHiperbolico, 0); }
		public TerminalNode TKN_tangente() { return getToken(EsJsParser.TKN_tangente, 0); }
		public TerminalNode TKN_tangenteHiperbolica() { return getToken(EsJsParser.TKN_tangenteHiperbolica, 0); }
		public TerminalNode TKN_exponencialMate() { return getToken(EsJsParser.TKN_exponencialMate, 0); }
		public TerminalNode TKN_exponencialMenos1() { return getToken(EsJsParser.TKN_exponencialMenos1, 0); }
		public TerminalNode TKN_floor() { return getToken(EsJsParser.TKN_floor, 0); }
		public TerminalNode TKN_hipotenusa() { return getToken(EsJsParser.TKN_hipotenusa, 0); }
		public TerminalNode TKN_logaritmo() { return getToken(EsJsParser.TKN_logaritmo, 0); }
		public TerminalNode TKN_logaritmoBase10() { return getToken(EsJsParser.TKN_logaritmoBase10, 0); }
		public TerminalNode TKN_logaritmoDe1Mas() { return getToken(EsJsParser.TKN_logaritmoDe1Mas, 0); }
		public TerminalNode TKN_logaritmoBase2() { return getToken(EsJsParser.TKN_logaritmoBase2, 0); }
		public TerminalNode TKN_maximo() { return getToken(EsJsParser.TKN_maximo, 0); }
		public TerminalNode TKN_minimo() { return getToken(EsJsParser.TKN_minimo, 0); }
		public TerminalNode TKN_potencia() { return getToken(EsJsParser.TKN_potencia, 0); }
		public TerminalNode TKN_raizCuadrada() { return getToken(EsJsParser.TKN_raizCuadrada, 0); }
		public TerminalNode TKN_raizCubica() { return getToken(EsJsParser.TKN_raizCubica, 0); }
		public TerminalNode TKN_redondear() { return getToken(EsJsParser.TKN_redondear, 0); }
		public TerminalNode TKN_redondearHaciaAbajo() { return getToken(EsJsParser.TKN_redondearHaciaAbajo, 0); }
		public TerminalNode TKN_redondearHaciaArriba() { return getToken(EsJsParser.TKN_redondearHaciaArriba, 0); }
		public TerminalNode TKN_redondearAComaFlotante() { return getToken(EsJsParser.TKN_redondearAComaFlotante, 0); }
		public TerminalNode TKN_seno() { return getToken(EsJsParser.TKN_seno, 0); }
		public TerminalNode TKN_senoHiperbolico() { return getToken(EsJsParser.TKN_senoHiperbolico, 0); }
		public TerminalNode TKN_signo() { return getToken(EsJsParser.TKN_signo, 0); }
		public TerminalNode TKN_multiplicacionEntera() { return getToken(EsJsParser.TKN_multiplicacionEntera, 0); }
		public TerminalNode TKN_aleatorio() { return getToken(EsJsParser.TKN_aleatorio, 0); }
		public TerminalNode TKN_truncar() { return getToken(EsJsParser.TKN_truncar, 0); }
		public TerminalNode TKN_cerosALaIzquierdaEn32Bits() { return getToken(EsJsParser.TKN_cerosALaIzquierdaEn32Bits, 0); }
		public MetodoMateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_metodoMate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterMetodoMate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitMetodoMate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitMetodoMate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MetodoMateContext metodoMate() throws RecognitionException {
		MetodoMateContext _localctx = new MetodoMateContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_metodoMate);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(479);
			_la = _input.LA(1);
			if ( !(((((_la - 67)) & ~0x3f) == 0 && ((1L << (_la - 67)) & 137438945279L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TipoNativoContext extends ParserRuleContext {
		public TerminalNode TKN_Arreglo() { return getToken(EsJsParser.TKN_Arreglo, 0); }
		public TerminalNode TKN_Cadena() { return getToken(EsJsParser.TKN_Cadena, 0); }
		public TerminalNode TKN_Matriz() { return getToken(EsJsParser.TKN_Matriz, 0); }
		public TipoNativoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tipoNativo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterTipoNativo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitTipoNativo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitTipoNativo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TipoNativoContext tipoNativo() throws RecognitionException {
		TipoNativoContext _localctx = new TipoNativoContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tipoNativo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(481);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 74L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentosContext extends ParserRuleContext {
		public TerminalNode TKN_opening_par() { return getToken(EsJsParser.TKN_opening_par, 0); }
		public TerminalNode TKN_closing_par() { return getToken(EsJsParser.TKN_closing_par, 0); }
		public ListaArgumentosContext listaArgumentos() {
			return getRuleContext(ListaArgumentosContext.class,0);
		}
		public ArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentosContext argumentos() throws RecognitionException {
		ArgumentosContext _localctx = new ArgumentosContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_argumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(483);
			match(TKN_opening_par);
			setState(485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576457458101522938L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 864726312827224057L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 189L) != 0)) {
				{
				setState(484);
				listaArgumentos();
				}
			}

			setState(487);
			match(TKN_closing_par);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaArgumentosContext extends ParserRuleContext {
		public List<ArgumentoContext> argumento() {
			return getRuleContexts(ArgumentoContext.class);
		}
		public ArgumentoContext argumento(int i) {
			return getRuleContext(ArgumentoContext.class,i);
		}
		public List<TerminalNode> TKN_comma() { return getTokens(EsJsParser.TKN_comma); }
		public TerminalNode TKN_comma(int i) {
			return getToken(EsJsParser.TKN_comma, i);
		}
		public ListaArgumentosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaArgumentos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterListaArgumentos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitListaArgumentos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitListaArgumentos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaArgumentosContext listaArgumentos() throws RecognitionException {
		ListaArgumentosContext _localctx = new ListaArgumentosContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_listaArgumentos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(489);
			argumento();
			setState(494);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_comma) {
				{
				{
				setState(490);
				match(TKN_comma);
				setState(491);
				argumento();
				}
				}
				setState(496);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArgumentoContext extends ParserRuleContext {
		public ExpresionUnicaContext expresionUnica() {
			return getRuleContext(ExpresionUnicaContext.class,0);
		}
		public TerminalNode TKN_spread() { return getToken(EsJsParser.TKN_spread, 0); }
		public ArgumentoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argumento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterArgumento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitArgumento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitArgumento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgumentoContext argumento() throws RecognitionException {
		ArgumentoContext _localctx = new ArgumentoContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_argumento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(498);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_spread) {
				{
				setState(497);
				match(TKN_spread);
				}
			}

			setState(500);
			expresionUnica(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorMultiplicacionContext extends ParserRuleContext {
		public TerminalNode TKN_times() { return getToken(EsJsParser.TKN_times, 0); }
		public TerminalNode TKN_div() { return getToken(EsJsParser.TKN_div, 0); }
		public TerminalNode TKN_mod() { return getToken(EsJsParser.TKN_mod, 0); }
		public OperadorMultiplicacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorMultiplicacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterOperadorMultiplicacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitOperadorMultiplicacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitOperadorMultiplicacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorMultiplicacionContext operadorMultiplicacion() throws RecognitionException {
		OperadorMultiplicacionContext _localctx = new OperadorMultiplicacionContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_operadorMultiplicacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(502);
			_la = _input.LA(1);
			if ( !(((((_la - 134)) & ~0x3f) == 0 && ((1L << (_la - 134)) & 8209L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorAdicionContext extends ParserRuleContext {
		public TerminalNode TKN_plus() { return getToken(EsJsParser.TKN_plus, 0); }
		public TerminalNode TKN_minus() { return getToken(EsJsParser.TKN_minus, 0); }
		public OperadorAdicionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorAdicion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterOperadorAdicion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitOperadorAdicion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitOperadorAdicion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorAdicionContext operadorAdicion() throws RecognitionException {
		OperadorAdicionContext _localctx = new OperadorAdicionContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_operadorAdicion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(504);
			_la = _input.LA(1);
			if ( !(_la==TKN_minus || _la==TKN_plus) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorRelacionalContext extends ParserRuleContext {
		public TerminalNode TKN_less() { return getToken(EsJsParser.TKN_less, 0); }
		public TerminalNode TKN_greater() { return getToken(EsJsParser.TKN_greater, 0); }
		public TerminalNode TKN_leq() { return getToken(EsJsParser.TKN_leq, 0); }
		public TerminalNode TKN_geq() { return getToken(EsJsParser.TKN_geq, 0); }
		public OperadorRelacionalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorRelacional; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterOperadorRelacional(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitOperadorRelacional(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitOperadorRelacional(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorRelacionalContext operadorRelacional() throws RecognitionException {
		OperadorRelacionalContext _localctx = new OperadorRelacionalContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_operadorRelacional);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(506);
			_la = _input.LA(1);
			if ( !(((((_la - 126)) & ~0x3f) == 0 && ((1L << (_la - 126)) & 1539L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorIgualdadContext extends ParserRuleContext {
		public TerminalNode TKN_equal() { return getToken(EsJsParser.TKN_equal, 0); }
		public TerminalNode TKN_neq() { return getToken(EsJsParser.TKN_neq, 0); }
		public TerminalNode TKN_strict_equal() { return getToken(EsJsParser.TKN_strict_equal, 0); }
		public TerminalNode TKN_strict_neq() { return getToken(EsJsParser.TKN_strict_neq, 0); }
		public OperadorIgualdadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorIgualdad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterOperadorIgualdad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitOperadorIgualdad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitOperadorIgualdad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorIgualdadContext operadorIgualdad() throws RecognitionException {
		OperadorIgualdadContext _localctx = new OperadorIgualdadContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_operadorIgualdad);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			_la = _input.LA(1);
			if ( !(((((_la - 109)) & ~0x3f) == 0 && ((1L << (_la - 109)) & 1539L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorAsignacionContext extends ParserRuleContext {
		public TerminalNode TKN_times_assign() { return getToken(EsJsParser.TKN_times_assign, 0); }
		public TerminalNode TKN_div_assign() { return getToken(EsJsParser.TKN_div_assign, 0); }
		public TerminalNode TKN_mod_assign() { return getToken(EsJsParser.TKN_mod_assign, 0); }
		public TerminalNode TKN_plus_assign() { return getToken(EsJsParser.TKN_plus_assign, 0); }
		public TerminalNode TKN_minus_assign() { return getToken(EsJsParser.TKN_minus_assign, 0); }
		public TerminalNode TKN_power_assign() { return getToken(EsJsParser.TKN_power_assign, 0); }
		public OperadorAsignacionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorAsignacion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterOperadorAsignacion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitOperadorAsignacion(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitOperadorAsignacion(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorAsignacionContext operadorAsignacion() throws RecognitionException {
		OperadorAsignacionContext _localctx = new OperadorAsignacionContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_operadorAsignacion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(510);
			_la = _input.LA(1);
			if ( !(((((_la - 111)) & ~0x3f) == 0 && ((1L << (_la - 111)) & 63L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperadorUnarioContext extends ParserRuleContext {
		public TerminalNode TKN_increment() { return getToken(EsJsParser.TKN_increment, 0); }
		public TerminalNode TKN_decrement() { return getToken(EsJsParser.TKN_decrement, 0); }
		public TerminalNode TKN_plus() { return getToken(EsJsParser.TKN_plus, 0); }
		public TerminalNode TKN_minus() { return getToken(EsJsParser.TKN_minus, 0); }
		public TerminalNode TKN_not() { return getToken(EsJsParser.TKN_not, 0); }
		public OperadorUnarioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operadorUnario; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterOperadorUnario(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitOperadorUnario(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitOperadorUnario(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperadorUnarioContext operadorUnario() throws RecognitionException {
		OperadorUnarioContext _localctx = new OperadorUnarioContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_operadorUnario);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_la = _input.LA(1);
			if ( !(((((_la - 122)) & ~0x3f) == 0 && ((1L << (_la - 122)) & 4358147L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentificadorContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EsJsParser.ID, 0); }
		public TerminalNode TKN_ambiente() { return getToken(EsJsParser.TKN_ambiente, 0); }
		public TerminalNode TKN_aExponencial() { return getToken(EsJsParser.TKN_aExponencial, 0); }
		public TerminalNode TKN_fijarDecimales() { return getToken(EsJsParser.TKN_fijarDecimales, 0); }
		public TerminalNode TKN_aCadenaLocalizado() { return getToken(EsJsParser.TKN_aCadenaLocalizado, 0); }
		public TerminalNode TKN_aPrecision() { return getToken(EsJsParser.TKN_aPrecision, 0); }
		public TerminalNode TKN_aCadena() { return getToken(EsJsParser.TKN_aCadena, 0); }
		public TerminalNode TKN_valorDe() { return getToken(EsJsParser.TKN_valorDe, 0); }
		public TerminalNode TKN_esFinito() { return getToken(EsJsParser.TKN_esFinito, 0); }
		public TerminalNode TKN_esEntero() { return getToken(EsJsParser.TKN_esEntero, 0); }
		public TerminalNode TKN_NeN() { return getToken(EsJsParser.TKN_NeN, 0); }
		public TerminalNode TKN_esEnteroSeguro() { return getToken(EsJsParser.TKN_esEnteroSeguro, 0); }
		public TerminalNode TKN_interpretarDecimal() { return getToken(EsJsParser.TKN_interpretarDecimal, 0); }
		public TerminalNode TKN_interpretarEntero() { return getToken(EsJsParser.TKN_interpretarEntero, 0); }
		public TerminalNode TKN_MAX_VALUE() { return getToken(EsJsParser.TKN_MAX_VALUE, 0); }
		public TerminalNode TKN_MIN_VALUE() { return getToken(EsJsParser.TKN_MIN_VALUE, 0); }
		public TerminalNode TKN_POSITIVE_INFINITY() { return getToken(EsJsParser.TKN_POSITIVE_INFINITY, 0); }
		public TerminalNode TKN_NEGATIVE_INFINITY() { return getToken(EsJsParser.TKN_NEGATIVE_INFINITY, 0); }
		public TerminalNode TKN_PI() { return getToken(EsJsParser.TKN_PI, 0); }
		public TerminalNode TKN_absoluto() { return getToken(EsJsParser.TKN_absoluto, 0); }
		public TerminalNode TKN_arcocoseno() { return getToken(EsJsParser.TKN_arcocoseno, 0); }
		public TerminalNode TKN_arcocosenoHiperbolico() { return getToken(EsJsParser.TKN_arcocosenoHiperbolico, 0); }
		public TerminalNode TKN_arcoseno() { return getToken(EsJsParser.TKN_arcoseno, 0); }
		public TerminalNode TKN_arcosenoHiperbolico() { return getToken(EsJsParser.TKN_arcosenoHiperbolico, 0); }
		public TerminalNode TKN_arcotangente() { return getToken(EsJsParser.TKN_arcotangente, 0); }
		public TerminalNode TKN_arcotangente2() { return getToken(EsJsParser.TKN_arcotangente2, 0); }
		public TerminalNode TKN_arcotangenteHiperbolica() { return getToken(EsJsParser.TKN_arcotangenteHiperbolica, 0); }
		public TerminalNode TKN_coseno() { return getToken(EsJsParser.TKN_coseno, 0); }
		public TerminalNode TKN_cosenoHiperbolico() { return getToken(EsJsParser.TKN_cosenoHiperbolico, 0); }
		public TerminalNode TKN_tangente() { return getToken(EsJsParser.TKN_tangente, 0); }
		public TerminalNode TKN_tangenteHiperbolica() { return getToken(EsJsParser.TKN_tangenteHiperbolica, 0); }
		public TerminalNode TKN_exponencial() { return getToken(EsJsParser.TKN_exponencial, 0); }
		public TerminalNode TKN_exponencialMate() { return getToken(EsJsParser.TKN_exponencialMate, 0); }
		public TerminalNode TKN_exponencialMenos1() { return getToken(EsJsParser.TKN_exponencialMenos1, 0); }
		public TerminalNode TKN_floor() { return getToken(EsJsParser.TKN_floor, 0); }
		public TerminalNode TKN_hipotenusa() { return getToken(EsJsParser.TKN_hipotenusa, 0); }
		public TerminalNode TKN_logaritmo() { return getToken(EsJsParser.TKN_logaritmo, 0); }
		public TerminalNode TKN_logaritmoBase10() { return getToken(EsJsParser.TKN_logaritmoBase10, 0); }
		public TerminalNode TKN_logaritmoDe1Mas() { return getToken(EsJsParser.TKN_logaritmoDe1Mas, 0); }
		public TerminalNode TKN_logaritmoBase2() { return getToken(EsJsParser.TKN_logaritmoBase2, 0); }
		public TerminalNode TKN_maximo() { return getToken(EsJsParser.TKN_maximo, 0); }
		public TerminalNode TKN_minimo() { return getToken(EsJsParser.TKN_minimo, 0); }
		public TerminalNode TKN_potencia() { return getToken(EsJsParser.TKN_potencia, 0); }
		public TerminalNode TKN_raizCuadrada() { return getToken(EsJsParser.TKN_raizCuadrada, 0); }
		public TerminalNode TKN_raizCubica() { return getToken(EsJsParser.TKN_raizCubica, 0); }
		public TerminalNode TKN_redondear() { return getToken(EsJsParser.TKN_redondear, 0); }
		public TerminalNode TKN_redondearHaciaAbajo() { return getToken(EsJsParser.TKN_redondearHaciaAbajo, 0); }
		public TerminalNode TKN_redondearHaciaArriba() { return getToken(EsJsParser.TKN_redondearHaciaArriba, 0); }
		public TerminalNode TKN_redondearAComaFlotante() { return getToken(EsJsParser.TKN_redondearAComaFlotante, 0); }
		public TerminalNode TKN_seno() { return getToken(EsJsParser.TKN_seno, 0); }
		public TerminalNode TKN_senoHiperbolico() { return getToken(EsJsParser.TKN_senoHiperbolico, 0); }
		public TerminalNode TKN_signo() { return getToken(EsJsParser.TKN_signo, 0); }
		public TerminalNode TKN_multiplicacionEntera() { return getToken(EsJsParser.TKN_multiplicacionEntera, 0); }
		public TerminalNode TKN_aleatorio() { return getToken(EsJsParser.TKN_aleatorio, 0); }
		public TerminalNode TKN_truncar() { return getToken(EsJsParser.TKN_truncar, 0); }
		public TerminalNode TKN_cerosALaIzquierdaEn32Bits() { return getToken(EsJsParser.TKN_cerosALaIzquierdaEn32Bits, 0); }
		public IdentificadorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identificador; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterIdentificador(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitIdentificador(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitIdentificador(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentificadorContext identificador() throws RecognitionException {
		IdentificadorContext _localctx = new IdentificadorContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_identificador);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(514);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 576451956210405376L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 2199023255545L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode TKN_verdadero() { return getToken(EsJsParser.TKN_verdadero, 0); }
		public TerminalNode TKN_falso() { return getToken(EsJsParser.TKN_falso, 0); }
		public TerminalNode TKN_nulo() { return getToken(EsJsParser.TKN_nulo, 0); }
		public TerminalNode TKN_indefinido() { return getToken(EsJsParser.TKN_indefinido, 0); }
		public TerminalNode TKN_Infinito() { return getToken(EsJsParser.TKN_Infinito, 0); }
		public TerminalNode TKN_NuN() { return getToken(EsJsParser.TKN_NuN, 0); }
		public TerminalNode TKN_str() { return getToken(EsJsParser.TKN_str, 0); }
		public TerminalNode TKN_reg() { return getToken(EsJsParser.TKN_reg, 0); }
		public TerminalNode TKN_num() { return getToken(EsJsParser.TKN_num, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(516);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 4402379227280L) != 0) || ((((_la - 105)) & ~0x3f) == 0 && ((1L << (_la - 105)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ArregloLiteralContext extends ParserRuleContext {
		public TerminalNode TKN_opening_bra() { return getToken(EsJsParser.TKN_opening_bra, 0); }
		public TerminalNode TKN_closing_bra() { return getToken(EsJsParser.TKN_closing_bra, 0); }
		public ListaElementosContext listaElementos() {
			return getRuleContext(ListaElementosContext.class,0);
		}
		public ArregloLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arregloLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterArregloLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitArregloLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitArregloLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArregloLiteralContext arregloLiteral() throws RecognitionException {
		ArregloLiteralContext _localctx = new ArregloLiteralContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_arregloLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			match(TKN_opening_bra);
			setState(520);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576457458101522938L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 864726312827224057L) != 0) || ((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & 189L) != 0)) {
				{
				setState(519);
				listaElementos();
				}
			}

			setState(522);
			match(TKN_closing_bra);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaElementosContext extends ParserRuleContext {
		public List<ElementoContext> elemento() {
			return getRuleContexts(ElementoContext.class);
		}
		public ElementoContext elemento(int i) {
			return getRuleContext(ElementoContext.class,i);
		}
		public List<TerminalNode> TKN_comma() { return getTokens(EsJsParser.TKN_comma); }
		public TerminalNode TKN_comma(int i) {
			return getToken(EsJsParser.TKN_comma, i);
		}
		public ListaElementosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaElementos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterListaElementos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitListaElementos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitListaElementos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaElementosContext listaElementos() throws RecognitionException {
		ListaElementosContext _localctx = new ListaElementosContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_listaElementos);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			elemento();
			setState(529);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_comma) {
				{
				{
				setState(525);
				match(TKN_comma);
				setState(526);
				elemento();
				}
				}
				setState(531);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ElementoContext extends ParserRuleContext {
		public ExpresionUnicaContext expresionUnica() {
			return getRuleContext(ExpresionUnicaContext.class,0);
		}
		public TerminalNode TKN_spread() { return getToken(EsJsParser.TKN_spread, 0); }
		public ElementoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elemento; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterElemento(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitElemento(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitElemento(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementoContext elemento() throws RecognitionException {
		ElementoContext _localctx = new ElementoContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_elemento);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==TKN_spread) {
				{
				setState(532);
				match(TKN_spread);
				}
			}

			setState(535);
			expresionUnica(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjetoLiteralContext extends ParserRuleContext {
		public TerminalNode TKN_opening_key() { return getToken(EsJsParser.TKN_opening_key, 0); }
		public TerminalNode TKN_closing_key() { return getToken(EsJsParser.TKN_closing_key, 0); }
		public ListaPropiedadesContext listaPropiedades() {
			return getRuleContext(ListaPropiedadesContext.class,0);
		}
		public ObjetoLiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objetoLiteral; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterObjetoLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitObjetoLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitObjetoLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjetoLiteralContext objetoLiteral() throws RecognitionException {
		ObjetoLiteralContext _localctx = new ObjetoLiteralContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_objetoLiteral);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			match(TKN_opening_key);
			setState(539);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576451956210405376L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 26388279066617L) != 0) || _la==TKN_opening_bra) {
				{
				setState(538);
				listaPropiedades();
				}
			}

			setState(541);
			match(TKN_closing_key);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ListaPropiedadesContext extends ParserRuleContext {
		public List<PropiedadContext> propiedad() {
			return getRuleContexts(PropiedadContext.class);
		}
		public PropiedadContext propiedad(int i) {
			return getRuleContext(PropiedadContext.class,i);
		}
		public List<TerminalNode> TKN_comma() { return getTokens(EsJsParser.TKN_comma); }
		public TerminalNode TKN_comma(int i) {
			return getToken(EsJsParser.TKN_comma, i);
		}
		public ListaPropiedadesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listaPropiedades; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterListaPropiedades(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitListaPropiedades(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitListaPropiedades(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListaPropiedadesContext listaPropiedades() throws RecognitionException {
		ListaPropiedadesContext _localctx = new ListaPropiedadesContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_listaPropiedades);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(543);
			propiedad();
			setState(548);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TKN_comma) {
				{
				{
				setState(544);
				match(TKN_comma);
				setState(545);
				propiedad();
				}
				}
				setState(550);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PropiedadContext extends ParserRuleContext {
		public NombrePropiedadContext nombrePropiedad() {
			return getRuleContext(NombrePropiedadContext.class,0);
		}
		public TerminalNode TKN_colon() { return getToken(EsJsParser.TKN_colon, 0); }
		public List<ExpresionUnicaContext> expresionUnica() {
			return getRuleContexts(ExpresionUnicaContext.class);
		}
		public ExpresionUnicaContext expresionUnica(int i) {
			return getRuleContext(ExpresionUnicaContext.class,i);
		}
		public TerminalNode TKN_opening_par() { return getToken(EsJsParser.TKN_opening_par, 0); }
		public TerminalNode TKN_closing_par() { return getToken(EsJsParser.TKN_closing_par, 0); }
		public BloqueContext bloque() {
			return getRuleContext(BloqueContext.class,0);
		}
		public ListaParametrosContext listaParametros() {
			return getRuleContext(ListaParametrosContext.class,0);
		}
		public TerminalNode TKN_opening_bra() { return getToken(EsJsParser.TKN_opening_bra, 0); }
		public TerminalNode TKN_closing_bra() { return getToken(EsJsParser.TKN_closing_bra, 0); }
		public TerminalNode TKN_spread() { return getToken(EsJsParser.TKN_spread, 0); }
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public PropiedadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_propiedad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterPropiedad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitPropiedad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitPropiedad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PropiedadContext propiedad() throws RecognitionException {
		PropiedadContext _localctx = new PropiedadContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_propiedad);
		int _la;
		try {
			setState(572);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(551);
				nombrePropiedad();
				setState(552);
				match(TKN_colon);
				setState(553);
				expresionUnica(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(555);
				nombrePropiedad();
				setState(556);
				match(TKN_opening_par);
				setState(558);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & 576451956210405376L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 19791209299961L) != 0)) {
					{
					setState(557);
					listaParametros();
					}
				}

				setState(560);
				match(TKN_closing_par);
				setState(561);
				bloque();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(563);
				match(TKN_opening_bra);
				setState(564);
				expresionUnica(0);
				setState(565);
				match(TKN_closing_bra);
				setState(566);
				match(TKN_colon);
				setState(567);
				expresionUnica(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(569);
				match(TKN_spread);
				setState(570);
				expresionUnica(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(571);
				identificador();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NombrePropiedadContext extends ParserRuleContext {
		public IdentificadorContext identificador() {
			return getRuleContext(IdentificadorContext.class,0);
		}
		public TerminalNode TKN_str() { return getToken(EsJsParser.TKN_str, 0); }
		public TerminalNode TKN_num() { return getToken(EsJsParser.TKN_num, 0); }
		public NombrePropiedadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nombrePropiedad; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterNombrePropiedad(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitNombrePropiedad(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitNombrePropiedad(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NombrePropiedadContext nombrePropiedad() throws RecognitionException {
		NombrePropiedadContext _localctx = new NombrePropiedadContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_nombrePropiedad);
		try {
			setState(577);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TKN_ambiente:
			case TKN_aExponencial:
			case TKN_fijarDecimales:
			case TKN_aCadenaLocalizado:
			case TKN_aPrecision:
			case TKN_aCadena:
			case TKN_valorDe:
			case TKN_esFinito:
			case TKN_esEntero:
			case TKN_NeN:
			case TKN_esEnteroSeguro:
			case TKN_interpretarDecimal:
			case TKN_interpretarEntero:
			case TKN_MAX_VALUE:
			case TKN_MIN_VALUE:
			case TKN_POSITIVE_INFINITY:
			case TKN_NEGATIVE_INFINITY:
			case TKN_PI:
			case TKN_absoluto:
			case TKN_arcocosenoHiperbolico:
			case TKN_arcocoseno:
			case TKN_arcosenoHiperbolico:
			case TKN_arcoseno:
			case TKN_arcotangente2:
			case TKN_arcotangenteHiperbolica:
			case TKN_arcotangente:
			case TKN_cerosALaIzquierdaEn32Bits:
			case TKN_cosenoHiperbolico:
			case TKN_coseno:
			case TKN_exponencialMate:
			case TKN_exponencialMenos1:
			case TKN_exponencial:
			case TKN_floor:
			case TKN_hipotenusa:
			case TKN_logaritmoBase10:
			case TKN_logaritmoBase2:
			case TKN_logaritmoDe1Mas:
			case TKN_logaritmo:
			case TKN_maximo:
			case TKN_minimo:
			case TKN_multiplicacionEntera:
			case TKN_potencia:
			case TKN_raizCubica:
			case TKN_raizCuadrada:
			case TKN_redondearAComaFlotante:
			case TKN_redondearHaciaAbajo:
			case TKN_redondearHaciaArriba:
			case TKN_redondear:
			case TKN_senoHiperbolico:
			case TKN_seno:
			case TKN_signo:
			case TKN_tangenteHiperbolica:
			case TKN_tangente:
			case TKN_truncar:
			case TKN_aleatorio:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(574);
				identificador();
				}
				break;
			case TKN_str:
				enterOuterAlt(_localctx, 2);
				{
				setState(575);
				match(TKN_str);
				}
				break;
			case TKN_num:
				enterOuterAlt(_localctx, 3);
				{
				setState(576);
				match(TKN_num);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EosContext extends ParserRuleContext {
		public TerminalNode TKN_semicolon() { return getToken(EsJsParser.TKN_semicolon, 0); }
		public TerminalNode EOF() { return getToken(EsJsParser.EOF, 0); }
		public EosContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eos; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).enterEos(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EsJsListener ) ((EsJsListener)listener).exitEos(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EsJsVisitor ) return ((EsJsVisitor<? extends T>)visitor).visitEos(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EosContext eos() throws RecognitionException {
		EosContext _localctx = new EosContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_eos);
		try {
			setState(582);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(579);
				match(TKN_semicolon);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(580);
				match(EOF);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(581);
				if (!(hayNuevaLinea())) throw new FailedPredicateException(this, "hayNuevaLinea()");
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28:
			return expresionUnica_sempred((ExpresionUnicaContext)_localctx, predIndex);
		case 56:
			return eos_sempred((EosContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expresionUnica_sempred(ExpresionUnicaContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 20);
		case 1:
			return precpred(_ctx, 19);
		case 2:
			return precpred(_ctx, 18);
		case 3:
			return precpred(_ctx, 17);
		case 4:
			return precpred(_ctx, 16);
		case 5:
			return precpred(_ctx, 15);
		case 6:
			return precpred(_ctx, 14);
		case 7:
			return precpred(_ctx, 13);
		case 8:
			return precpred(_ctx, 12);
		case 9:
			return precpred(_ctx, 11);
		case 10:
			return precpred(_ctx, 10);
		case 11:
			return precpred(_ctx, 28);
		case 12:
			return precpred(_ctx, 27);
		case 13:
			return precpred(_ctx, 25);
		case 14:
			return precpred(_ctx, 24);
		case 15:
			return precpred(_ctx, 23);
		}
		return true;
	}
	private boolean eos_sempred(EosContext _localctx, int predIndex) {
		switch (predIndex) {
		case 16:
			return hayNuevaLinea();
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0097\u0249\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u0001\u0000\u0005\u0000t\b\u0000\n\u0000"+
		"\f\u0000w\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u0088"+
		"\b\u0001\u0001\u0002\u0001\u0002\u0005\u0002\u008c\b\u0002\n\u0002\f\u0002"+
		"\u008f\t\u0002\u0001\u0002\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u009a\b\u0004"+
		"\n\u0004\f\u0004\u009d\t\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0003\u0006\u00a4\b\u0006\u0001\u0007\u0001\u0007\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u00ac\b\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\t\u0001\t\u0001\t\u0005\t\u00b4\b\t\n\t\f\t\u00b7\t\t\u0001\t\u0001\t"+
		"\u0001\t\u0003\t\u00bc\b\t\u0001\t\u0001\t\u0003\t\u00c0\b\t\u0001\n\u0001"+
		"\n\u0003\n\u00c4\b\n\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00ca\b\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0003\n\u00d0\b\n\u0003\n\u00d2\b\n\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u00dc\b\u000b\u0003\u000b\u00de\b\u000b"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003"+
		"\f\u00f1\b\f\u0001\f\u0001\f\u0003\f\u00f5\b\f\u0001\f\u0001\f\u0003\f"+
		"\u00f9\b\f\u0001\f\u0001\f\u0003\f\u00fd\b\f\u0001\r\u0001\r\u0003\r\u0101"+
		"\b\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012\u0001"+
		"\u0012\u0003\u0012\u010f\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014\u0001"+
		"\u0014\u0005\u0014\u011b\b\u0014\n\u0014\f\u0014\u011e\t\u0014\u0001\u0014"+
		"\u0003\u0014\u0121\b\u0014\u0001\u0014\u0005\u0014\u0124\b\u0014\n\u0014"+
		"\f\u0014\u0127\t\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0005\u0015\u012f\b\u0015\n\u0015\f\u0015\u0132"+
		"\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0137\b\u0016"+
		"\n\u0016\f\u0016\u013a\t\u0016\u0001\u0017\u0001\u0017\u0001\u0017\u0001"+
		"\u0017\u0001\u0017\u0003\u0017\u0141\b\u0017\u0001\u0017\u0003\u0017\u0144"+
		"\b\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001"+
		"\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0005\u001b\u0156"+
		"\b\u001b\n\u001b\f\u001b\u0159\t\u001b\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0003\u001c\u016e\b\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u0177\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0005\u001c\u01b0\b\u001c"+
		"\n\u001c\f\u001c\u01b3\t\u001c\u0001\u001d\u0001\u001d\u0003\u001d\u01b7"+
		"\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01bb\b\u001d\u0003\u001d"+
		"\u01bd\b\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0001\u001e"+
		"\u0001\u001e\u0001\u001e\u0003\u001e\u01cc\b\u001e\u0001\u001f\u0001\u001f"+
		"\u0001\u001f\u0001\u001f\u0003\u001f\u01d2\b\u001f\u0001 \u0001 \u0001"+
		"!\u0001!\u0001\"\u0001\"\u0001\"\u0001\"\u0003\"\u01dc\b\"\u0001#\u0001"+
		"#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0003&\u01e6\b&\u0001&\u0001"+
		"&\u0001\'\u0001\'\u0001\'\u0005\'\u01ed\b\'\n\'\f\'\u01f0\t\'\u0001(\u0003"+
		"(\u01f3\b(\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001+\u0001+\u0001"+
		",\u0001,\u0001-\u0001-\u0001.\u0001.\u0001/\u0001/\u00010\u00010\u0001"+
		"1\u00011\u00031\u0209\b1\u00011\u00011\u00012\u00012\u00012\u00052\u0210"+
		"\b2\n2\f2\u0213\t2\u00013\u00033\u0216\b3\u00013\u00013\u00014\u00014"+
		"\u00034\u021c\b4\u00014\u00014\u00015\u00015\u00015\u00055\u0223\b5\n"+
		"5\f5\u0226\t5\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00036"+
		"\u022f\b6\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u00016\u0001"+
		"6\u00016\u00016\u00016\u00036\u023d\b6\u00017\u00017\u00017\u00037\u0242"+
		"\b7\u00018\u00018\u00018\u00038\u0247\b8\u00018\u0000\u000189\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnp\u0000\u000f\u0003\u0000\u0010"+
		"\u0010\u001f\u001f))\u0006\u0000\t\t\u000b\u000b\u0014\u0015\u001a\u001a"+
		"\u001c\u001c\'\'\u0002\u0000337:\u0002\u0000..16\u0001\u0000;B\u0002\u0000"+
		"COQg\u0003\u0000\u0001\u0001\u0003\u0003\u0006\u0006\u0003\u0000\u0086"+
		"\u0086\u008a\u008a\u0093\u0093\u0002\u0000\u0089\u0089\u0090\u0090\u0002"+
		"\u0000~\u007f\u0087\u0088\u0002\u0000mnvw\u0001\u0000ot\u0004\u0000z{"+
		"\u0089\u0089\u008b\u008b\u0090\u0090\u0004\u0000\f\f+:@@Ch\u0007\u0000"+
		"\u0004\u0004\u0007\u0007\u0016\u0016\u0019\u0019  **ik\u0277\u0000u\u0001"+
		"\u0000\u0000\u0000\u0002\u0087\u0001\u0000\u0000\u0000\u0004\u0089\u0001"+
		"\u0000\u0000\u0000\u0006\u0092\u0001\u0000\u0000\u0000\b\u0095\u0001\u0000"+
		"\u0000\u0000\n\u009e\u0001\u0000\u0000\u0000\f\u00a0\u0001\u0000\u0000"+
		"\u0000\u000e\u00a5\u0001\u0000\u0000\u0000\u0010\u00a7\u0001\u0000\u0000"+
		"\u0000\u0012\u00bf\u0001\u0000\u0000\u0000\u0014\u00d1\u0001\u0000\u0000"+
		"\u0000\u0016\u00d3\u0001\u0000\u0000\u0000\u0018\u00fc\u0001\u0000\u0000"+
		"\u0000\u001a\u0100\u0001\u0000\u0000\u0000\u001c\u0102\u0001\u0000\u0000"+
		"\u0000\u001e\u0104\u0001\u0000\u0000\u0000 \u0106\u0001\u0000\u0000\u0000"+
		"\"\u0109\u0001\u0000\u0000\u0000$\u010c\u0001\u0000\u0000\u0000&\u0112"+
		"\u0001\u0000\u0000\u0000(\u0118\u0001\u0000\u0000\u0000*\u012a\u0001\u0000"+
		"\u0000\u0000,\u0133\u0001\u0000\u0000\u0000.\u013b\u0001\u0000\u0000\u0000"+
		"0\u0147\u0001\u0000\u0000\u00002\u014d\u0001\u0000\u0000\u00004\u014f"+
		"\u0001\u0000\u0000\u00006\u0152\u0001\u0000\u0000\u00008\u0176\u0001\u0000"+
		"\u0000\u0000:\u01bc\u0001\u0000\u0000\u0000<\u01cb\u0001\u0000\u0000\u0000"+
		">\u01d1\u0001\u0000\u0000\u0000@\u01d3\u0001\u0000\u0000\u0000B\u01d5"+
		"\u0001\u0000\u0000\u0000D\u01db\u0001\u0000\u0000\u0000F\u01dd\u0001\u0000"+
		"\u0000\u0000H\u01df\u0001\u0000\u0000\u0000J\u01e1\u0001\u0000\u0000\u0000"+
		"L\u01e3\u0001\u0000\u0000\u0000N\u01e9\u0001\u0000\u0000\u0000P\u01f2"+
		"\u0001\u0000\u0000\u0000R\u01f6\u0001\u0000\u0000\u0000T\u01f8\u0001\u0000"+
		"\u0000\u0000V\u01fa\u0001\u0000\u0000\u0000X\u01fc\u0001\u0000\u0000\u0000"+
		"Z\u01fe\u0001\u0000\u0000\u0000\\\u0200\u0001\u0000\u0000\u0000^\u0202"+
		"\u0001\u0000\u0000\u0000`\u0204\u0001\u0000\u0000\u0000b\u0206\u0001\u0000"+
		"\u0000\u0000d\u020c\u0001\u0000\u0000\u0000f\u0215\u0001\u0000\u0000\u0000"+
		"h\u0219\u0001\u0000\u0000\u0000j\u021f\u0001\u0000\u0000\u0000l\u023c"+
		"\u0001\u0000\u0000\u0000n\u0241\u0001\u0000\u0000\u0000p\u0246\u0001\u0000"+
		"\u0000\u0000rt\u0003\u0002\u0001\u0000sr\u0001\u0000\u0000\u0000tw\u0001"+
		"\u0000\u0000\u0000us\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000"+
		"vx\u0001\u0000\u0000\u0000wu\u0001\u0000\u0000\u0000xy\u0005\u0000\u0000"+
		"\u0001y\u0001\u0001\u0000\u0000\u0000z\u0088\u0003\u0004\u0002\u0000{"+
		"\u0088\u00030\u0018\u0000|\u0088\u0003\u0006\u0003\u0000}\u0088\u0003"+
		"\u000e\u0007\u0000~\u0088\u00034\u001a\u0000\u007f\u0088\u0003\u0010\b"+
		"\u0000\u0080\u0088\u0003\u0016\u000b\u0000\u0081\u0088\u0003\u0018\f\u0000"+
		"\u0082\u0088\u0003 \u0010\u0000\u0083\u0088\u0003\"\u0011\u0000\u0084"+
		"\u0088\u0003$\u0012\u0000\u0085\u0088\u0003&\u0013\u0000\u0086\u0088\u0003"+
		".\u0017\u0000\u0087z\u0001\u0000\u0000\u0000\u0087{\u0001\u0000\u0000"+
		"\u0000\u0087|\u0001\u0000\u0000\u0000\u0087}\u0001\u0000\u0000\u0000\u0087"+
		"~\u0001\u0000\u0000\u0000\u0087\u007f\u0001\u0000\u0000\u0000\u0087\u0080"+
		"\u0001\u0000\u0000\u0000\u0087\u0081\u0001\u0000\u0000\u0000\u0087\u0082"+
		"\u0001\u0000\u0000\u0000\u0087\u0083\u0001\u0000\u0000\u0000\u0087\u0084"+
		"\u0001\u0000\u0000\u0000\u0087\u0085\u0001\u0000\u0000\u0000\u0087\u0086"+
		"\u0001\u0000\u0000\u0000\u0088\u0003\u0001\u0000\u0000\u0000\u0089\u008d"+
		"\u0005\u008d\u0000\u0000\u008a\u008c\u0003\u0002\u0001\u0000\u008b\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008b"+
		"\u0001\u0000\u0000\u0000\u008d\u008e\u0001\u0000\u0000\u0000\u008e\u0090"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005\u0082\u0000\u0000\u0091\u0005\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0003\b\u0004\u0000\u0093\u0094\u0003p8\u0000\u0094\u0007\u0001\u0000"+
		"\u0000\u0000\u0095\u0096\u0003\n\u0005\u0000\u0096\u009b\u0003\f\u0006"+
		"\u0000\u0097\u0098\u0005\u0085\u0000\u0000\u0098\u009a\u0003\f\u0006\u0000"+
		"\u0099\u0097\u0001\u0000\u0000\u0000\u009a\u009d\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000"+
		"\u009c\t\u0001\u0000\u0000\u0000\u009d\u009b\u0001\u0000\u0000\u0000\u009e"+
		"\u009f\u0007\u0000\u0000\u0000\u009f\u000b\u0001\u0000\u0000\u0000\u00a0"+
		"\u00a3\u0003^/\u0000\u00a1\u00a2\u0005\u0080\u0000\u0000\u00a2\u00a4\u0003"+
		"8\u001c\u0000\u00a3\u00a1\u0001\u0000\u0000\u0000\u00a3\u00a4\u0001\u0000"+
		"\u0000\u0000\u00a4\r\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005\u0091\u0000"+
		"\u0000\u00a6\u000f\u0001\u0000\u0000\u0000\u00a7\u00a8\u0005\u0017\u0000"+
		"\u0000\u00a8\u00a9\u0003^/\u0000\u00a9\u00ab\u0005\u008e\u0000\u0000\u00aa"+
		"\u00ac\u0003\u0012\t\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ab\u00ac"+
		"\u0001\u0000\u0000\u0000\u00ac\u00ad\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005\u0083\u0000\u0000\u00ae\u00af\u0003\u0004\u0002\u0000\u00af\u0011"+
		"\u0001\u0000\u0000\u0000\u00b0\u00b5\u0003\f\u0006\u0000\u00b1\u00b2\u0005"+
		"\u0085\u0000\u0000\u00b2\u00b4\u0003\f\u0006\u0000\u00b3\u00b1\u0001\u0000"+
		"\u0000\u0000\u00b4\u00b7\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"+
		"\u0000\u0000\u00b5\u00b6\u0001\u0000\u0000\u0000\u00b6\u00bb\u0001\u0000"+
		"\u0000\u0000\u00b7\u00b5\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005\u0085"+
		"\u0000\u0000\u00b9\u00ba\u0005l\u0000\u0000\u00ba\u00bc\u0003^/\u0000"+
		"\u00bb\u00b8\u0001\u0000\u0000\u0000\u00bb\u00bc\u0001\u0000\u0000\u0000"+
		"\u00bc\u00c0\u0001\u0000\u0000\u0000\u00bd\u00be\u0005l\u0000\u0000\u00be"+
		"\u00c0\u0003^/\u0000\u00bf\u00b0\u0001\u0000\u0000\u0000\u00bf\u00bd\u0001"+
		"\u0000\u0000\u0000\u00c0\u0013\u0001\u0000\u0000\u0000\u00c1\u00c3\u0005"+
		"\u008e\u0000\u0000\u00c2\u00c4\u0003\u0012\t\u0000\u00c3\u00c2\u0001\u0000"+
		"\u0000\u0000\u00c3\u00c4\u0001\u0000\u0000\u0000\u00c4\u00c5\u0001\u0000"+
		"\u0000\u0000\u00c5\u00c6\u0005\u0083\u0000\u0000\u00c6\u00c9\u0005}\u0000"+
		"\u0000\u00c7\u00ca\u0003\u0004\u0002\u0000\u00c8\u00ca\u00038\u001c\u0000"+
		"\u00c9\u00c7\u0001\u0000\u0000\u0000\u00c9\u00c8\u0001\u0000\u0000\u0000"+
		"\u00ca\u00d2\u0001\u0000\u0000\u0000\u00cb\u00cc\u0003^/\u0000\u00cc\u00cf"+
		"\u0005}\u0000\u0000\u00cd\u00d0\u0003\u0004\u0002\u0000\u00ce\u00d0\u0003"+
		"8\u001c\u0000\u00cf\u00cd\u0001\u0000\u0000\u0000\u00cf\u00ce\u0001\u0000"+
		"\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000\u0000\u00d1\u00c1\u0001\u0000"+
		"\u0000\u0000\u00d1\u00cb\u0001\u0000\u0000\u0000\u00d2\u0015\u0001\u0000"+
		"\u0000\u0000\u00d3\u00d4\u0005%\u0000\u0000\u00d4\u00d5\u0005\u008e\u0000"+
		"\u0000\u00d5\u00d6\u00036\u001b\u0000\u00d6\u00d7\u0005\u0083\u0000\u0000"+
		"\u00d7\u00dd\u0003\u0004\u0002\u0000\u00d8\u00db\u0005&\u0000\u0000\u00d9"+
		"\u00dc\u0003\u0004\u0002\u0000\u00da\u00dc\u0003\u0016\u000b\u0000\u00db"+
		"\u00d9\u0001\u0000\u0000\u0000\u00db\u00da\u0001\u0000\u0000\u0000\u00dc"+
		"\u00de\u0001\u0000\u0000\u0000\u00dd\u00d8\u0001\u0000\u0000\u0000\u00dd"+
		"\u00de\u0001\u0000\u0000\u0000\u00de\u0017\u0001\u0000\u0000\u0000\u00df"+
		"\u00e0\u0005\u0018\u0000\u0000\u00e0\u00e1\u0003\u0004\u0002\u0000\u00e1"+
		"\u00e2\u0005\u001e\u0000\u0000\u00e2\u00e3\u0005\u008e\u0000\u0000\u00e3"+
		"\u00e4\u00036\u001b\u0000\u00e4\u00e5\u0005\u0083\u0000\u0000\u00e5\u00e6"+
		"\u0003p8\u0000\u00e6\u00fd\u0001\u0000\u0000\u0000\u00e7\u00e8\u0005\u001e"+
		"\u0000\u0000\u00e8\u00e9\u0005\u008e\u0000\u0000\u00e9\u00ea\u00036\u001b"+
		"\u0000\u00ea\u00eb\u0005\u0083\u0000\u0000\u00eb\u00ec\u0003\u0004\u0002"+
		"\u0000\u00ec\u00fd\u0001\u0000\u0000\u0000\u00ed\u00ee\u0005!\u0000\u0000"+
		"\u00ee\u00f0\u0005\u008e\u0000\u0000\u00ef\u00f1\u0003\u001a\r\u0000\u00f0"+
		"\u00ef\u0001\u0000\u0000\u0000\u00f0\u00f1\u0001\u0000\u0000\u0000\u00f1"+
		"\u00f2\u0001\u0000\u0000\u0000\u00f2\u00f4\u0005\u0091\u0000\u0000\u00f3"+
		"\u00f5\u0003\u001c\u000e\u0000\u00f4\u00f3\u0001\u0000\u0000\u0000\u00f4"+
		"\u00f5\u0001\u0000\u0000\u0000\u00f5\u00f6\u0001\u0000\u0000\u0000\u00f6"+
		"\u00f8\u0005\u0091\u0000\u0000\u00f7\u00f9\u0003\u001e\u000f\u0000\u00f8"+
		"\u00f7\u0001\u0000\u0000\u0000\u00f8\u00f9\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fa\u0001\u0000\u0000\u0000\u00fa\u00fb\u0005\u0083\u0000\u0000\u00fb"+
		"\u00fd\u0003\u0004\u0002\u0000\u00fc\u00df\u0001\u0000\u0000\u0000\u00fc"+
		"\u00e7\u0001\u0000\u0000\u0000\u00fc\u00ed\u0001\u0000\u0000\u0000\u00fd"+
		"\u0019\u0001\u0000\u0000\u0000\u00fe\u0101\u0003\b\u0004\u0000\u00ff\u0101"+
		"\u00036\u001b\u0000\u0100\u00fe\u0001\u0000\u0000\u0000\u0100\u00ff\u0001"+
		"\u0000\u0000\u0000\u0101\u001b\u0001\u0000\u0000\u0000\u0102\u0103\u0003"+
		"6\u001b\u0000\u0103\u001d\u0001\u0000\u0000\u0000\u0104\u0105\u00036\u001b"+
		"\u0000\u0105\u001f\u0001\u0000\u0000\u0000\u0106\u0107\u0005\u0011\u0000"+
		"\u0000\u0107\u0108\u0003p8\u0000\u0108!\u0001\u0000\u0000\u0000\u0109"+
		"\u010a\u0005$\u0000\u0000\u010a\u010b\u0003p8\u0000\u010b#\u0001\u0000"+
		"\u0000\u0000\u010c\u010e\u0005#\u0000\u0000\u010d\u010f\u00036\u001b\u0000"+
		"\u010e\u010d\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0003p8\u0000\u0111%"+
		"\u0001\u0000\u0000\u0000\u0112\u0113\u0005\u0013\u0000\u0000\u0113\u0114"+
		"\u0005\u008e\u0000\u0000\u0114\u0115\u00036\u001b\u0000\u0115\u0116\u0005"+
		"\u0083\u0000\u0000\u0116\u0117\u0003(\u0014\u0000\u0117\'\u0001\u0000"+
		"\u0000\u0000\u0118\u011c\u0005\u008d\u0000\u0000\u0119\u011b\u0003*\u0015"+
		"\u0000\u011a\u0119\u0001\u0000\u0000\u0000\u011b\u011e\u0001\u0000\u0000"+
		"\u0000\u011c\u011a\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000"+
		"\u0000\u011d\u0120\u0001\u0000\u0000\u0000\u011e\u011c\u0001\u0000\u0000"+
		"\u0000\u011f\u0121\u0003,\u0016\u0000\u0120\u011f\u0001\u0000\u0000\u0000"+
		"\u0120\u0121\u0001\u0000\u0000\u0000\u0121\u0125\u0001\u0000\u0000\u0000"+
		"\u0122\u0124\u0003*\u0015\u0000\u0123\u0122\u0001\u0000\u0000\u0000\u0124"+
		"\u0127\u0001\u0000\u0000\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125"+
		"\u0126\u0001\u0000\u0000\u0000\u0126\u0128\u0001\u0000\u0000\u0000\u0127"+
		"\u0125\u0001\u0000\u0000\u0000\u0128\u0129\u0005\u0082\u0000\u0000\u0129"+
		")\u0001\u0000\u0000\u0000\u012a\u012b\u0005\u000e\u0000\u0000\u012b\u012c"+
		"\u00036\u001b\u0000\u012c\u0130\u0005\u0084\u0000\u0000\u012d\u012f\u0003"+
		"\u0002\u0001\u0000\u012e\u012d\u0001\u0000\u0000\u0000\u012f\u0132\u0001"+
		"\u0000\u0000\u0000\u0130\u012e\u0001\u0000\u0000\u0000\u0130\u0131\u0001"+
		"\u0000\u0000\u0000\u0131+\u0001\u0000\u0000\u0000\u0132\u0130\u0001\u0000"+
		"\u0000\u0000\u0133\u0134\u0005\"\u0000\u0000\u0134\u0138\u0005\u0084\u0000"+
		"\u0000\u0135\u0137\u0003\u0002\u0001\u0000\u0136\u0135\u0001\u0000\u0000"+
		"\u0000\u0137\u013a\u0001\u0000\u0000\u0000\u0138\u0136\u0001\u0000\u0000"+
		"\u0000\u0138\u0139\u0001\u0000\u0000\u0000\u0139-\u0001\u0000\u0000\u0000"+
		"\u013a\u0138\u0001\u0000\u0000\u0000\u013b\u013c\u0005\u001b\u0000\u0000"+
		"\u013c\u013d\u0003\u0004\u0002\u0000\u013d\u0143\u0005\r\u0000\u0000\u013e"+
		"\u0140\u0005\u008e\u0000\u0000\u013f\u0141\u0003^/\u0000\u0140\u013f\u0001"+
		"\u0000\u0000\u0000\u0140\u0141\u0001\u0000\u0000\u0000\u0141\u0142\u0001"+
		"\u0000\u0000\u0000\u0142\u0144\u0005\u0083\u0000\u0000\u0143\u013e\u0001"+
		"\u0000\u0000\u0000\u0143\u0144\u0001\u0000\u0000\u0000\u0144\u0145\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0003\u0004\u0002\u0000\u0146/\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0005\u000f\u0000\u0000\u0148\u0149\u0005\u008f"+
		"\u0000\u0000\u0149\u014a\u00032\u0019\u0000\u014a\u014b\u0003L&\u0000"+
		"\u014b\u014c\u0003p8\u0000\u014c1\u0001\u0000\u0000\u0000\u014d\u014e"+
		"\u0007\u0001\u0000\u0000\u014e3\u0001\u0000\u0000\u0000\u014f\u0150\u0003"+
		"6\u001b\u0000\u0150\u0151\u0003p8\u0000\u01515\u0001\u0000\u0000\u0000"+
		"\u0152\u0157\u00038\u001c\u0000\u0153\u0154\u0005\u0085\u0000\u0000\u0154"+
		"\u0156\u00038\u001c\u0000\u0155\u0153\u0001\u0000\u0000\u0000\u0156\u0159"+
		"\u0001\u0000\u0000\u0000\u0157\u0155\u0001\u0000\u0000\u0000\u0157\u0158"+
		"\u0001\u0000\u0000\u0000\u01587\u0001\u0000\u0000\u0000\u0159\u0157\u0001"+
		"\u0000\u0000\u0000\u015a\u015b\u0006\u001c\uffff\uffff\u0000\u015b\u0177"+
		"\u0003\u0014\n\u0000\u015c\u015d\u0005\u0012\u0000\u0000\u015d\u0177\u0003"+
		":\u001d\u0000\u015e\u015f\u0005(\u0000\u0000\u015f\u0177\u00038\u001c"+
		"\u0016\u0160\u0161\u0003\\.\u0000\u0161\u0162\u00038\u001c\u0015\u0162"+
		"\u0177\u0001\u0000\u0000\u0000\u0163\u0177\u0005\f\u0000\u0000\u0164\u0177"+
		"\u0003^/\u0000\u0165\u0166\u0005\u0005\u0000\u0000\u0166\u0167\u0005\u008f"+
		"\u0000\u0000\u0167\u0177\u0003D\"\u0000\u0168\u0169\u0005\b\u0000\u0000"+
		"\u0169\u016a\u0005\u008f\u0000\u0000\u016a\u0177\u0003>\u001f\u0000\u016b"+
		"\u016d\u0003J%\u0000\u016c\u016e\u0003L&\u0000\u016d\u016c\u0001\u0000"+
		"\u0000\u0000\u016d\u016e\u0001\u0000\u0000\u0000\u016e\u0177\u0001\u0000"+
		"\u0000\u0000\u016f\u0177\u0003`0\u0000\u0170\u0177\u0003b1\u0000\u0171"+
		"\u0177\u0003h4\u0000\u0172\u0173\u0005\u008e\u0000\u0000\u0173\u0174\u0003"+
		"8\u001c\u0000\u0174\u0175\u0005\u0083\u0000\u0000\u0175\u0177\u0001\u0000"+
		"\u0000\u0000\u0176\u015a\u0001\u0000\u0000\u0000\u0176\u015c\u0001\u0000"+
		"\u0000\u0000\u0176\u015e\u0001\u0000\u0000\u0000\u0176\u0160\u0001\u0000"+
		"\u0000\u0000\u0176\u0163\u0001\u0000\u0000\u0000\u0176\u0164\u0001\u0000"+
		"\u0000\u0000\u0176\u0165\u0001\u0000\u0000\u0000\u0176\u0168\u0001\u0000"+
		"\u0000\u0000\u0176\u016b\u0001\u0000\u0000\u0000\u0176\u016f\u0001\u0000"+
		"\u0000\u0000\u0176\u0170\u0001\u0000\u0000\u0000\u0176\u0171\u0001\u0000"+
		"\u0000\u0000\u0176\u0172\u0001\u0000\u0000\u0000\u0177\u01b1\u0001\u0000"+
		"\u0000\u0000\u0178\u0179\n\u0014\u0000\u0000\u0179\u017a\u0005u\u0000"+
		"\u0000\u017a\u01b0\u00038\u001c\u0015\u017b\u017c\n\u0013\u0000\u0000"+
		"\u017c\u017d\u0003R)\u0000\u017d\u017e\u00038\u001c\u0014\u017e\u01b0"+
		"\u0001\u0000\u0000\u0000\u017f\u0180\n\u0012\u0000\u0000\u0180\u0181\u0003"+
		"T*\u0000\u0181\u0182\u00038\u001c\u0013\u0182\u01b0\u0001\u0000\u0000"+
		"\u0000\u0183\u0184\n\u0011\u0000\u0000\u0184\u0185\u0005|\u0000\u0000"+
		"\u0185\u01b0\u00038\u001c\u0012\u0186\u0187\n\u0010\u0000\u0000\u0187"+
		"\u0188\u0003V+\u0000\u0188\u0189\u00038\u001c\u0011\u0189\u01b0\u0001"+
		"\u0000\u0000\u0000\u018a\u018b\n\u000f\u0000\u0000\u018b\u018c\u0003X"+
		",\u0000\u018c\u018d\u00038\u001c\u0010\u018d\u01b0\u0001\u0000\u0000\u0000"+
		"\u018e\u018f\n\u000e\u0000\u0000\u018f\u0190\u0005x\u0000\u0000\u0190"+
		"\u01b0\u00038\u001c\u000f\u0191\u0192\n\r\u0000\u0000\u0192\u0193\u0005"+
		"y\u0000\u0000\u0193\u01b0\u00038\u001c\u000e\u0194\u0195\n\f\u0000\u0000"+
		"\u0195\u0196\u0005\u0092\u0000\u0000\u0196\u0197\u00038\u001c\u0000\u0197"+
		"\u0198\u0005\u0084\u0000\u0000\u0198\u0199\u00038\u001c\r\u0199\u01b0"+
		"\u0001\u0000\u0000\u0000\u019a\u019b\n\u000b\u0000\u0000\u019b\u019c\u0005"+
		"\u0080\u0000\u0000\u019c\u01b0\u00038\u001c\f\u019d\u019e\n\n\u0000\u0000"+
		"\u019e\u019f\u0003Z-\u0000\u019f\u01a0\u00038\u001c\u000b\u01a0\u01b0"+
		"\u0001\u0000\u0000\u0000\u01a1\u01a2\n\u001c\u0000\u0000\u01a2\u01a3\u0005"+
		"\u008c\u0000\u0000\u01a3\u01a4\u00036\u001b\u0000\u01a4\u01a5\u0005\u0081"+
		"\u0000\u0000\u01a5\u01b0\u0001\u0000\u0000\u0000\u01a6\u01a7\n\u001b\u0000"+
		"\u0000\u01a7\u01a8\u0005\u008f\u0000\u0000\u01a8\u01b0\u0003<\u001e\u0000"+
		"\u01a9\u01aa\n\u0019\u0000\u0000\u01aa\u01b0\u0003L&\u0000\u01ab\u01ac"+
		"\n\u0018\u0000\u0000\u01ac\u01b0\u0005{\u0000\u0000\u01ad\u01ae\n\u0017"+
		"\u0000\u0000\u01ae\u01b0\u0005z\u0000\u0000\u01af\u0178\u0001\u0000\u0000"+
		"\u0000\u01af\u017b\u0001\u0000\u0000\u0000\u01af\u017f\u0001\u0000\u0000"+
		"\u0000\u01af\u0183\u0001\u0000\u0000\u0000\u01af\u0186\u0001\u0000\u0000"+
		"\u0000\u01af\u018a\u0001\u0000\u0000\u0000\u01af\u018e\u0001\u0000\u0000"+
		"\u0000\u01af\u0191\u0001\u0000\u0000\u0000\u01af\u0194\u0001\u0000\u0000"+
		"\u0000\u01af\u019a\u0001\u0000\u0000\u0000\u01af\u019d\u0001\u0000\u0000"+
		"\u0000\u01af\u01a1\u0001\u0000\u0000\u0000\u01af\u01a6\u0001\u0000\u0000"+
		"\u0000\u01af\u01a9\u0001\u0000\u0000\u0000\u01af\u01ab\u0001\u0000\u0000"+
		"\u0000\u01af\u01ad\u0001\u0000\u0000\u0000\u01b0\u01b3\u0001\u0000\u0000"+
		"\u0000\u01b1\u01af\u0001\u0000\u0000\u0000\u01b1\u01b2\u0001\u0000\u0000"+
		"\u0000\u01b29\u0001\u0000\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000"+
		"\u01b4\u01b6\u0003J%\u0000\u01b5\u01b7\u0003L&\u0000\u01b6\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b7\u0001\u0000\u0000\u0000\u01b7\u01bd\u0001"+
		"\u0000\u0000\u0000\u01b8\u01ba\u0003^/\u0000\u01b9\u01bb\u0003L&\u0000"+
		"\u01ba\u01b9\u0001\u0000\u0000\u0000\u01ba\u01bb\u0001\u0000\u0000\u0000"+
		"\u01bb\u01bd\u0001\u0000\u0000\u0000\u01bc\u01b4\u0001\u0000\u0000\u0000"+
		"\u01bc\u01b8\u0001\u0000\u0000\u0000\u01bd;\u0001\u0000\u0000\u0000\u01be"+
		"\u01cc\u0005\u0007\u0000\u0000\u01bf\u01cc\u0005\u0002\u0000\u0000\u01c0"+
		"\u01cc\u0005\u0001\u0000\u0000\u01c1\u01cc\u0005\u0003\u0000\u0000\u01c2"+
		"\u01cc\u0005\u0006\u0000\u0000\u01c3\u01cc\u0005+\u0000\u0000\u01c4\u01cc"+
		"\u0005,\u0000\u0000\u01c5\u01cc\u0005-\u0000\u0000\u01c6\u01cc\u0005/"+
		"\u0000\u0000\u01c7\u01cc\u00050\u0000\u0000\u01c8\u01cc\u0005\n\u0000"+
		"\u0000\u01c9\u01cc\u0005\u001d\u0000\u0000\u01ca\u01cc\u0003^/\u0000\u01cb"+
		"\u01be\u0001\u0000\u0000\u0000\u01cb\u01bf\u0001\u0000\u0000\u0000\u01cb"+
		"\u01c0\u0001\u0000\u0000\u0000\u01cb\u01c1\u0001\u0000\u0000\u0000\u01cb"+
		"\u01c2\u0001\u0000\u0000\u0000\u01cb\u01c3\u0001\u0000\u0000\u0000\u01cb"+
		"\u01c4\u0001\u0000\u0000\u0000\u01cb\u01c5\u0001\u0000\u0000\u0000\u01cb"+
		"\u01c6\u0001\u0000\u0000\u0000\u01cb\u01c7\u0001\u0000\u0000\u0000\u01cb"+
		"\u01c8\u0001\u0000\u0000\u0000\u01cb\u01c9\u0001\u0000\u0000\u0000\u01cb"+
		"\u01ca\u0001\u0000\u0000\u0000\u01cc=\u0001\u0000\u0000\u0000\u01cd\u01d2"+
		"\u0003@ \u0000\u01ce\u01cf\u0003B!\u0000\u01cf\u01d0\u0003L&\u0000\u01d0"+
		"\u01d2\u0001\u0000\u0000\u0000\u01d1\u01cd\u0001\u0000\u0000\u0000\u01d1"+
		"\u01ce\u0001\u0000\u0000\u0000\u01d2?\u0001\u0000\u0000\u0000\u01d3\u01d4"+
		"\u0007\u0002\u0000\u0000\u01d4A\u0001\u0000\u0000\u0000\u01d5\u01d6\u0007"+
		"\u0003\u0000\u0000\u01d6C\u0001\u0000\u0000\u0000\u01d7\u01dc\u0003F#"+
		"\u0000\u01d8\u01d9\u0003H$\u0000\u01d9\u01da\u0003L&\u0000\u01da\u01dc"+
		"\u0001\u0000\u0000\u0000\u01db\u01d7\u0001\u0000\u0000\u0000\u01db\u01d8"+
		"\u0001\u0000\u0000\u0000\u01dcE\u0001\u0000\u0000\u0000\u01dd\u01de\u0007"+
		"\u0004\u0000\u0000\u01deG\u0001\u0000\u0000\u0000\u01df\u01e0\u0007\u0005"+
		"\u0000\u0000\u01e0I\u0001\u0000\u0000\u0000\u01e1\u01e2\u0007\u0006\u0000"+
		"\u0000\u01e2K\u0001\u0000\u0000\u0000\u01e3\u01e5\u0005\u008e\u0000\u0000"+
		"\u01e4\u01e6\u0003N\'\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e5"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7"+
		"\u01e8\u0005\u0083\u0000\u0000\u01e8M\u0001\u0000\u0000\u0000\u01e9\u01ee"+
		"\u0003P(\u0000\u01ea\u01eb\u0005\u0085\u0000\u0000\u01eb\u01ed\u0003P"+
		"(\u0000\u01ec\u01ea\u0001\u0000\u0000\u0000\u01ed\u01f0\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ef\u0001\u0000\u0000"+
		"\u0000\u01efO\u0001\u0000\u0000\u0000\u01f0\u01ee\u0001\u0000\u0000\u0000"+
		"\u01f1\u01f3\u0005l\u0000\u0000\u01f2\u01f1\u0001\u0000\u0000\u0000\u01f2"+
		"\u01f3\u0001\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4"+
		"\u01f5\u00038\u001c\u0000\u01f5Q\u0001\u0000\u0000\u0000\u01f6\u01f7\u0007"+
		"\u0007\u0000\u0000\u01f7S\u0001\u0000\u0000\u0000\u01f8\u01f9\u0007\b"+
		"\u0000\u0000\u01f9U\u0001\u0000\u0000\u0000\u01fa\u01fb\u0007\t\u0000"+
		"\u0000\u01fbW\u0001\u0000\u0000\u0000\u01fc\u01fd\u0007\n\u0000\u0000"+
		"\u01fdY\u0001\u0000\u0000\u0000\u01fe\u01ff\u0007\u000b\u0000\u0000\u01ff"+
		"[\u0001\u0000\u0000\u0000\u0200\u0201\u0007\f\u0000\u0000\u0201]\u0001"+
		"\u0000\u0000\u0000\u0202\u0203\u0007\r\u0000\u0000\u0203_\u0001\u0000"+
		"\u0000\u0000\u0204\u0205\u0007\u000e\u0000\u0000\u0205a\u0001\u0000\u0000"+
		"\u0000\u0206\u0208\u0005\u008c\u0000\u0000\u0207\u0209\u0003d2\u0000\u0208"+
		"\u0207\u0001\u0000\u0000\u0000\u0208\u0209\u0001\u0000\u0000\u0000\u0209"+
		"\u020a\u0001\u0000\u0000\u0000\u020a\u020b\u0005\u0081\u0000\u0000\u020b"+
		"c\u0001\u0000\u0000\u0000\u020c\u0211\u0003f3\u0000\u020d\u020e\u0005"+
		"\u0085\u0000\u0000\u020e\u0210\u0003f3\u0000\u020f\u020d\u0001\u0000\u0000"+
		"\u0000\u0210\u0213\u0001\u0000\u0000\u0000\u0211\u020f\u0001\u0000\u0000"+
		"\u0000\u0211\u0212\u0001\u0000\u0000\u0000\u0212e\u0001\u0000\u0000\u0000"+
		"\u0213\u0211\u0001\u0000\u0000\u0000\u0214\u0216\u0005l\u0000\u0000\u0215"+
		"\u0214\u0001\u0000\u0000\u0000\u0215\u0216\u0001\u0000\u0000\u0000\u0216"+
		"\u0217\u0001\u0000\u0000\u0000\u0217\u0218\u00038\u001c\u0000\u0218g\u0001"+
		"\u0000\u0000\u0000\u0219\u021b\u0005\u008d\u0000\u0000\u021a\u021c\u0003"+
		"j5\u0000\u021b\u021a\u0001\u0000\u0000\u0000\u021b\u021c\u0001\u0000\u0000"+
		"\u0000\u021c\u021d\u0001\u0000\u0000\u0000\u021d\u021e\u0005\u0082\u0000"+
		"\u0000\u021ei\u0001\u0000\u0000\u0000\u021f\u0224\u0003l6\u0000\u0220"+
		"\u0221\u0005\u0085\u0000\u0000\u0221\u0223\u0003l6\u0000\u0222\u0220\u0001"+
		"\u0000\u0000\u0000\u0223\u0226\u0001\u0000\u0000\u0000\u0224\u0222\u0001"+
		"\u0000\u0000\u0000\u0224\u0225\u0001\u0000\u0000\u0000\u0225k\u0001\u0000"+
		"\u0000\u0000\u0226\u0224\u0001\u0000\u0000\u0000\u0227\u0228\u0003n7\u0000"+
		"\u0228\u0229\u0005\u0084\u0000\u0000\u0229\u022a\u00038\u001c\u0000\u022a"+
		"\u023d\u0001\u0000\u0000\u0000\u022b\u022c\u0003n7\u0000\u022c\u022e\u0005"+
		"\u008e\u0000\u0000\u022d\u022f\u0003\u0012\t\u0000\u022e\u022d\u0001\u0000"+
		"\u0000\u0000\u022e\u022f\u0001\u0000\u0000\u0000\u022f\u0230\u0001\u0000"+
		"\u0000\u0000\u0230\u0231\u0005\u0083\u0000\u0000\u0231\u0232\u0003\u0004"+
		"\u0002\u0000\u0232\u023d\u0001\u0000\u0000\u0000\u0233\u0234\u0005\u008c"+
		"\u0000\u0000\u0234\u0235\u00038\u001c\u0000\u0235\u0236\u0005\u0081\u0000"+
		"\u0000\u0236\u0237\u0005\u0084\u0000\u0000\u0237\u0238\u00038\u001c\u0000"+
		"\u0238\u023d\u0001\u0000\u0000\u0000\u0239\u023a\u0005l\u0000\u0000\u023a"+
		"\u023d\u00038\u001c\u0000\u023b\u023d\u0003^/\u0000\u023c\u0227\u0001"+
		"\u0000\u0000\u0000\u023c\u022b\u0001\u0000\u0000\u0000\u023c\u0233\u0001"+
		"\u0000\u0000\u0000\u023c\u0239\u0001\u0000\u0000\u0000\u023c\u023b\u0001"+
		"\u0000\u0000\u0000\u023dm\u0001\u0000\u0000\u0000\u023e\u0242\u0003^/"+
		"\u0000\u023f\u0242\u0005i\u0000\u0000\u0240\u0242\u0005j\u0000\u0000\u0241"+
		"\u023e\u0001\u0000\u0000\u0000\u0241\u023f\u0001\u0000\u0000\u0000\u0241"+
		"\u0240\u0001\u0000\u0000\u0000\u0242o\u0001\u0000\u0000\u0000\u0243\u0247"+
		"\u0005\u0091\u0000\u0000\u0244\u0247\u0005\u0000\u0000\u0001\u0245\u0247"+
		"\u00048\u0010\u0000\u0246\u0243\u0001\u0000\u0000\u0000\u0246\u0244\u0001"+
		"\u0000\u0000\u0000\u0246\u0245\u0001\u0000\u0000\u0000\u0247q\u0001\u0000"+
		"\u0000\u00003u\u0087\u008d\u009b\u00a3\u00ab\u00b5\u00bb\u00bf\u00c3\u00c9"+
		"\u00cf\u00d1\u00db\u00dd\u00f0\u00f4\u00f8\u00fc\u0100\u010e\u011c\u0120"+
		"\u0125\u0130\u0138\u0140\u0143\u0157\u016d\u0176\u01af\u01b1\u01b6\u01ba"+
		"\u01bc\u01cb\u01d1\u01db\u01e5\u01ee\u01f2\u0208\u0211\u0215\u021b\u0224"+
		"\u022e\u023c\u0241\u0246";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}