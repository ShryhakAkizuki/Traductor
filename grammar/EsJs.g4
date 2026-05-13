grammar EsJs;

@parser::members {
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
}

// ══════════════════════════════════════════════════════════
//  PARSER
// ══════════════════════════════════════════════════════════

s
    : instruccion* EOF
    ;

instruccion
    : bloque
    | sentenciaConsola
    | sentenciaVariable
    | sentenciaVacia
    | sentenciaExpresion
    | declaracionFuncion
    | sentenciaSi
    | sentenciaIterar
    | sentenciaContinuar
    | sentenciaRomper
    | sentenciaRetornar
    | sentenciaElegir
    | sentenciaIntentar
    ;

bloque
    : TKN_opening_key instruccion* TKN_closing_key
    ;

// ── Variables ────────────────────────────────────────────

sentenciaVariable
    : listaDeclaracionVariable  eos
    ;

listaDeclaracionVariable
    : modificadorVariable declaracionVariable (TKN_comma declaracionVariable)*
    ;

modificadorVariable
    : TKN_var   | TKN_mut   | TKN_const
    ;

declaracionVariable
    : identificador (TKN_assign expresionUnica)?
    ;

sentenciaVacia
    : TKN_semicolon
    ;

// ── Funciones ────────────────────────────────────────────

declaracionFuncion
    : TKN_funcion identificador TKN_opening_par listaParametros? TKN_closing_par bloque
    ;

listaParametros
    : declaracionVariable (TKN_comma declaracionVariable)* (TKN_comma TKN_spread identificador)?
    | TKN_spread identificador
    ;

funcionFlecha
    : TKN_opening_par listaParametros? TKN_closing_par TKN_arrow (bloque | expresionUnica)
    | identificador TKN_arrow (bloque | expresionUnica)
    ;

// ── Condicional ──────────────────────────────────────────

sentenciaSi
    : TKN_si TKN_opening_par secuenciaExpresiones TKN_closing_par bloque (TKN_sino (bloque | sentenciaSi))?
    ;

// ── Iteración ────────────────────────────────────────────

sentenciaIterar
    : TKN_hacer bloque TKN_mientras TKN_opening_par secuenciaExpresiones TKN_closing_par eos
    | TKN_mientras TKN_opening_par secuenciaExpresiones TKN_closing_par bloque
    | TKN_para TKN_opening_par inicioFor? TKN_semicolon condicionFor? TKN_semicolon actualizacionFor? TKN_closing_par bloque
    ;

inicioFor       : listaDeclaracionVariable | secuenciaExpresiones ;
condicionFor    : secuenciaExpresiones ;
actualizacionFor: secuenciaExpresiones ;

sentenciaContinuar : TKN_continuar eos ;
sentenciaRomper    : TKN_romper    eos ;
sentenciaRetornar  : TKN_retornar  secuenciaExpresiones? eos ;

// ── Elegir (switch) ──────────────────────────────────────

sentenciaElegir
    : TKN_elegir TKN_opening_par secuenciaExpresiones TKN_closing_par bloqueCaso
    ;

bloqueCaso
    : TKN_opening_key casoSTMT* casoDefecto? casoSTMT* TKN_closing_key
    ;

casoSTMT
    : TKN_caso secuenciaExpresiones TKN_colon instruccion*
    ;

casoDefecto
    : TKN_porDefecto TKN_colon instruccion*
    ;

// ── Intentar / Capturar ──────────────────────────────────

sentenciaIntentar
    : TKN_intentar bloque TKN_capturar (TKN_opening_par identificador? TKN_closing_par)? bloque
    ;

// ── Consola ──────────────────────────────────────────────

sentenciaConsola
    : TKN_consola TKN_period metodoConsola argumentos eos
    ;

metodoConsola
    : TKN_afirmar
    | TKN_agrupar
    | TKN_error
    | TKN_escribir
    | TKN_info
    | TKN_limpiar
    | TKN_tabla
    ;

// ── Expresiones ──────────────────────────────────────────

sentenciaExpresion
    : secuenciaExpresiones eos
    ;

secuenciaExpresiones
    : expresionUnica (TKN_comma expresionUnica)*
    ;

// Primeros -> Mayor precedencia
expresionUnica
    : funcionFlecha

    | expresionUnica TKN_opening_bra secuenciaExpresiones TKN_closing_bra
    | expresionUnica TKN_period nombreAccesible
    | TKN_crear restoCrear
    | expresionUnica argumentos
    | expresionUnica TKN_increment
    | expresionUnica TKN_decrement

    | TKN_tipoDe expresionUnica
    | operadorUnario expresionUnica

    | expresionUnica TKN_power expresionUnica
    | expresionUnica operadorMultiplicacion expresionUnica
    | expresionUnica operadorAdicion expresionUnica
    | expresionUnica TKN_nulish expresionUnica
    | expresionUnica operadorRelacional expresionUnica
    | expresionUnica operadorIgualdad expresionUnica
    | expresionUnica TKN_and expresionUnica
    | expresionUnica TKN_or expresionUnica
    | expresionUnica TKN_ternary expresionUnica TKN_colon expresionUnica
    | expresionUnica TKN_assign expresionUnica
    | expresionUnica operadorAsignacion expresionUnica
    | TKN_ambiente
    | identificador
    | TKN_Mate TKN_period tipoMetodoMate
    | TKN_Numero TKN_period tipoMetodoNumero
    | tipoNativo argumentos?
    | literal
    | arregloLiteral
    | objetoLiteral
    | TKN_opening_par expresionUnica TKN_closing_par
    ;

restoCrear
    : tipoNativo argumentos?
    | identificador argumentos?
    ;

nombreAccesible
    : TKN_NuN | TKN_Booleano | TKN_Arreglo
    | TKN_Cadena | TKN_Matriz | TKN_aExponencial
    | TKN_fijarDecimales | TKN_aCadenaLocalizado
    | TKN_aCadena | TKN_valorDe | TKN_agregar
    | TKN_longitud | identificador
    ;

tipoMetodoNumero
    : constanteNumero
    | metodoNumero argumentos
    ;

constanteNumero
    : TKN_MAX_VALUE
    | TKN_MIN_VALUE
    | TKN_POSITIVE_INFINITY
    | TKN_NEGATIVE_INFINITY
    | TKN_NeN
    ;

metodoNumero
    : TKN_esFinito | TKN_esEntero | TKN_NeN | TKN_esEnteroSeguro
    | TKN_interpretarDecimal | TKN_interpretarEntero | TKN_aPrecision
    ;

tipoMetodoMate
    : constanteMate
    | metodoMate argumentos
    ;

constanteMate
    : TKN_E | TKN_LN2 | TKN_LN10 | TKN_LOG2E | TKN_LOG10E | TKN_PI
    | TKN_SQRT1_2 | TKN_SQRT2
    ;

metodoMate
    : TKN_absoluto | TKN_arcocoseno | TKN_arcocosenoHiperbolico
    | TKN_arcoseno | TKN_arcosenoHiperbolico | TKN_arcotangente
    | TKN_arcotangente2 | TKN_arcotangenteHiperbolica | TKN_coseno
    | TKN_cosenoHiperbolico | TKN_tangente | TKN_tangenteHiperbolica
    | TKN_exponencialMate | TKN_exponencialMenos1 | TKN_floor
    | TKN_hipotenusa | TKN_logaritmo | TKN_logaritmoBase10
    | TKN_logaritmoDe1Mas | TKN_logaritmoBase2 | TKN_maximo
    | TKN_minimo | TKN_potencia | TKN_raizCuadrada | TKN_raizCubica
    | TKN_redondear | TKN_redondearHaciaAbajo | TKN_redondearHaciaArriba
    | TKN_redondearAComaFlotante | TKN_seno | TKN_senoHiperbolico
    | TKN_signo | TKN_multiplicacionEntera | TKN_aleatorio | TKN_truncar
    | TKN_cerosALaIzquierdaEn32Bits
    ;

tipoNativo
    : TKN_Arreglo | TKN_Cadena | TKN_Matriz
    ;

argumentos
    : TKN_opening_par listaArgumentos? TKN_closing_par
    ;

listaArgumentos
    : argumento (TKN_comma argumento)*
    ;

argumento
    : TKN_spread? expresionUnica
    ;

// ── Operadores ───────────────────────────────────────────

operadorMultiplicacion : TKN_times | TKN_div | TKN_mod ;
operadorAdicion        : TKN_plus  | TKN_minus ;
operadorRelacional     : TKN_less  | TKN_greater | TKN_leq | TKN_geq ;
operadorIgualdad       : TKN_equal | TKN_neq | TKN_strict_equal | TKN_strict_neq ;

operadorAsignacion     : TKN_times_assign | TKN_div_assign | TKN_mod_assign
                       | TKN_plus_assign  | TKN_minus_assign | TKN_power_assign ;

operadorUnario         : TKN_increment | TKN_decrement | TKN_plus | TKN_minus | TKN_not ;

// ── Literales ────────────────────────────────────────────

identificador
    : ID
    | TKN_ambiente
    | TKN_aExponencial
    | TKN_fijarDecimales
    | TKN_aCadenaLocalizado
    | TKN_aPrecision
    | TKN_aCadena
    | TKN_valorDe
    | TKN_esFinito
    | TKN_esEntero
    | TKN_NeN
    | TKN_esEnteroSeguro
    | TKN_interpretarDecimal
    | TKN_interpretarEntero
    | TKN_MAX_VALUE
    | TKN_MIN_VALUE
    | TKN_POSITIVE_INFINITY
    | TKN_NEGATIVE_INFINITY
    | TKN_PI
    | TKN_absoluto
    | TKN_arcocoseno
    | TKN_arcocosenoHiperbolico
    | TKN_arcoseno
    | TKN_arcosenoHiperbolico
    | TKN_arcotangente
    | TKN_arcotangente2
    | TKN_arcotangenteHiperbolica
    | TKN_coseno
    | TKN_cosenoHiperbolico
    | TKN_tangente
    | TKN_tangenteHiperbolica
    | TKN_exponencial
    | TKN_exponencialMate
    | TKN_exponencialMenos1
    | TKN_floor
    | TKN_hipotenusa
    | TKN_logaritmo
    | TKN_logaritmoBase10
    | TKN_logaritmoDe1Mas
    | TKN_logaritmoBase2
    | TKN_maximo
    | TKN_minimo
    | TKN_potencia
    | TKN_raizCuadrada
    | TKN_raizCubica
    | TKN_redondear
    | TKN_redondearHaciaAbajo
    | TKN_redondearHaciaArriba
    | TKN_redondearAComaFlotante
    | TKN_seno
    | TKN_senoHiperbolico
    | TKN_signo
    | TKN_multiplicacionEntera
    | TKN_aleatorio
    | TKN_truncar
    | TKN_cerosALaIzquierdaEn32Bits
    ;

literal
    : TKN_verdadero | TKN_falso | TKN_nulo | TKN_indefinido
    | TKN_Infinito  | TKN_NuN  | TKN_str  | TKN_reg | TKN_num
    ;

arregloLiteral
    : TKN_opening_bra listaElementos? TKN_closing_bra
    ;

listaElementos
    : elemento (TKN_comma elemento)*
    ;

elemento
    : TKN_spread? expresionUnica
    ;

objetoLiteral
    : TKN_opening_key listaPropiedades? TKN_closing_key
    ;

listaPropiedades
    : propiedad (TKN_comma propiedad)*
    ;

propiedad
    : nombrePropiedad TKN_colon expresionUnica
    | nombrePropiedad TKN_opening_par listaParametros? TKN_closing_par bloque
    | TKN_opening_bra expresionUnica TKN_closing_bra TKN_colon expresionUnica
    | TKN_spread expresionUnica
    | identificador
    ;

nombrePropiedad : identificador | TKN_str | TKN_num ;

eos : TKN_semicolon | EOF | {hayNuevaLinea()}?;


// ══════════════════════════════════════════════════════════
//  LEXER
// ══════════════════════════════════════════════════════════

TKN_Arreglo    : 'Arreglo'    ;
TKN_Booleano   : 'Booleano'   ;
TKN_Cadena     : 'Cadena'     ;
TKN_Infinito   : 'Infinito'   ;
TKN_Mate       : 'Mate'       ;
TKN_Matriz     : 'Matriz'     ;
TKN_NuN        : 'NuN'        ;
TKN_Numero     : 'Numero'     ;

TKN_afirmar    : 'afirmar'    ;
TKN_agregar    : 'agregar'    ;
TKN_agrupar    : 'agrupar'    ;
TKN_ambiente   : 'ambiente'   ;
TKN_capturar   : 'capturar'   ;
TKN_caso       : 'caso'       ;
TKN_consola    : 'consola'    ;
TKN_const      : 'const'      ;
TKN_continuar  : 'continuar'  ;
TKN_crear      : 'crear'      ;
TKN_elegir     : 'elegir'     ;
TKN_error      : 'error'      ;
TKN_escribir   : 'escribir'   ;
TKN_falso      : 'falso'      ;
TKN_funcion    : 'funcion'    ;
TKN_hacer      : 'hacer'      ;
TKN_indefinido : 'indefinido' ;
TKN_info       : 'info'       ;
TKN_intentar   : 'intentar'   ;
TKN_limpiar    : 'limpiar'    ;
TKN_longitud   : 'longitud'   ;
TKN_mientras   : 'mientras'   ;
TKN_mut        : 'mut'        ;
TKN_nulo       : 'nulo'       ;
TKN_para       : 'para'       ;
TKN_porDefecto : 'porDefecto' ;
TKN_retornar   : 'retornar'   ;
TKN_romper     : 'romper'     ;
TKN_si         : 'si'         ;
TKN_sino       : 'sino'       ;
TKN_tabla      : 'tabla'      ;
TKN_tipoDe     : 'tipoDe'     ;
TKN_var        : 'var'        ;
TKN_verdadero  : 'verdadero'  ;

TKN_aExponencial      : 'aExponencial'      ;
TKN_fijarDecimales    : 'fijarDecimales'    ;
TKN_aCadenaLocalizado : 'aCadenaLocalizado' ;
TKN_aPrecision        : 'aPrecision'        ;
TKN_aCadena           : 'aCadena'           ;
TKN_valorDe           : 'valorDe'           ;

TKN_esFinito          : 'esFinito'          ;
TKN_esEntero          : 'esEntero'          ;
TKN_NeN               : 'NeN'              ;
TKN_esEnteroSeguro    : 'esEnteroSeguro'    ;
TKN_interpretarDecimal: 'interpretarDecimal';
TKN_interpretarEntero : 'interpretarEntero' ;

TKN_MAX_VALUE         : 'MAX_VALUE'         ;
TKN_MIN_VALUE         : 'MIN_VALUE'         ;
TKN_POSITIVE_INFINITY : 'POSITIVE_INFINITY' ;
TKN_NEGATIVE_INFINITY : 'NEGATIVE_INFINITY' ;

TKN_E        : 'E'        ;
TKN_LN2      : 'LN2'      ;
TKN_LN10     : 'LN10'     ;
TKN_LOG2E    : 'LOG2E'    ;
TKN_LOG10E   : 'LOG10E'   ;
TKN_PI       : 'PI'       ;
TKN_SQRT1_2  : 'SQRT1_2'  ;
TKN_SQRT2    : 'SQRT2'    ;

TKN_absoluto                  : 'absoluto'                  ;
TKN_arcocosenoHiperbolico     : 'arcocosenoHiperbolico'     ;
TKN_arcocoseno                : 'arcocoseno'                ;
TKN_arcosenoHiperbolico       : 'arcosenoHiperbolico'       ;
TKN_arcoseno                  : 'arcoseno'                  ;
TKN_arcotangente2             : 'arcotangente2'             ;
TKN_arcotangenteHiperbolica   : 'arcotangenteHiperbolica'   ;
TKN_arcotangente              : 'arcotangente'              ;
TKN_cerosALaIzquierdaEn32Bits : 'cerosALaIzquierdaEn32Bits';
TKN_cosenoHiperbolico         : 'cosenoHiperbolico'         ;
TKN_coseno                    : 'coseno'                    ;
TKN_exponencialMate           : 'exponencialMate'           ;
TKN_exponencialMenos1         : 'exponencialMenos1'         ;
TKN_exponencial               : 'exponencial'               ;
TKN_floor                     : 'floor'                     ;
TKN_hipotenusa                : 'hipotenusa'                ;
TKN_logaritmoBase10           : 'logaritmoBase10'           ;
TKN_logaritmoBase2            : 'logaritmoBase2'            ;
TKN_logaritmoDe1Mas           : 'logaritmoDe1Mas'           ;
TKN_logaritmo                 : 'logaritmo'                 ;
TKN_maximo                    : 'maximo'                    ;
TKN_minimo                    : 'minimo'                    ;
TKN_multiplicacionEntera      : 'multiplicacionEntera'      ;
TKN_potencia                  : 'potencia'                  ;
TKN_raizCubica                : 'raizCubica'                ;
TKN_raizCuadrada              : 'raizCuadrada'              ;
TKN_redondearAComaFlotante    : 'redondearAComaFlotante'    ;
TKN_redondearHaciaAbajo       : 'redondearHaciaAbajo'       ;
TKN_redondearHaciaArriba      : 'redondearHaciaArriba'      ;
TKN_redondear                 : 'redondear'                 ;
TKN_senoHiperbolico           : 'senoHiperbolico'           ;
TKN_seno                      : 'seno'                      ;
TKN_signo                     : 'signo'                     ;
TKN_tangenteHiperbolica       : 'tangenteHiperbolica'       ;
TKN_tangente                  : 'tangente'                  ;
TKN_truncar                   : 'truncar'                   ;
TKN_aleatorio                 : 'aleatorio'                 ;

ID    : ( [\p{L}_] | '$' )
        ( [\p{L}\p{Nd}_] | '$' )*
      ;

TKN_str
    : '"'  ( '\\' . | ~["\\] )* '"'
    | '\'' ( '\\' . | ~['\\] )* '\''
    ;

TKN_num
    : [0-9]+ '.' [0-9]+
    | [0-9]+
    ;

TKN_reg
    : '/' ( '\\' . | ~[/\\\r\n] )+ '/' [gimsuy]*
    ;

TKN_spread       : '...' ;
TKN_strict_equal : '===' ;
TKN_strict_neq   : '!==' ;
TKN_power_assign : '**=' ;

TKN_div_assign   : '/='  ;
TKN_mod_assign   : '%='  ;
TKN_plus_assign  : '+='  ;
TKN_minus_assign : '-='  ;
TKN_times_assign : '*='  ;
TKN_power        : '**'  ;
TKN_equal        : '=='  ;
TKN_neq          : '!='  ;
TKN_and          : '&&'  ;
TKN_or           : '||'  ;
TKN_decrement    : '--'  ;
TKN_increment    : '++'  ;
TKN_nulish       : '??'  ;
TKN_arrow        : '=>'  ;
TKN_geq          : '>='  ;
TKN_leq          : '<='  ;

TKN_assign       : '='  ;
TKN_closing_bra  : ']'  ;
TKN_closing_key  : '}'  ;
TKN_closing_par  : ')'  ;
TKN_colon        : ':'  ;
TKN_comma        : ','  ;
TKN_div          : '/'  ;
TKN_greater      : '>'  ;
TKN_less         : '<'  ;
TKN_minus        : '-'  ;
TKN_mod          : '%'  ;
TKN_not          : '!'  ;
TKN_opening_bra  : '['  ;
TKN_opening_key  : '{'  ;
TKN_opening_par  : '('  ;
TKN_period       : '.'  ;
TKN_plus         : '+'  ;
TKN_semicolon    : ';'  ;
TKN_ternary      : '?'  ;
TKN_times        : '*'  ;

// ── Ignorados ────────────────────────────────────────────
NEWLINE  : [\r\n]+   -> channel(HIDDEN) ;
WS       : [ \t\f]+  -> skip ;
LINE_COMMENT  : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;





