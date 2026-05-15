# División de la gramática `EsJs.g4` para 4 personas

## Objetivo
Repartir las reglas para que 4 personas puedan traducir la gramática a Python sin duplicar trabajo y con una carga parecida en dificultad real, no solo en número de reglas.

## Criterio de reparto
Se priorizó la **complejidad de traducción a Python**. Eso significa que no se midió solo cuántas reglas tiene cada grupo, sino cuánto suele costar implementar cada bloque:

- unas reglas son directas y casi mecánicas,
- otras requieren manejar anidación, precedencia o casos opcionales,
- y las más complejas implican construir y respetar el árbol de expresiones.

## Resumen rápido

| Grupo | Tema principal | Dificultad aproximada | Motivo principal |
|---|---|---:|---|
| 1 | Estructura base y consola | Baja | Reglas de arranque, bloques y salida simple |
| 2 | Declaraciones, funciones y saltos | Media | Maneja variables, parámetros, retornos y `try/except` |
| 3 | Control de flujo y selección | Media-Alta | Tiene anidación y ramas opcionales |
| 4 | Expresiones, literales y accesos | Alta | Incluye precedencia, llamadas, operadores y acceso a datos |

---

## Grupo 1 - Estructura base y consola

**Reglas:**
- `s`
- `instruccion`
- `bloque`
- `sentenciaVacia`
- `sentenciaConsola`
- `metodoConsola`
- `eos`

### Por qué tiene esta complejidad
Este grupo es el más sencillo porque define el esqueleto del programa y una parte bastante directa de la traducción. La mayoría de las reglas solo determinan **cómo se agrupan instrucciones** o **cómo se reconoce una sentencia terminada**.

En Python, esto suele traducirse de forma bastante limpia:
- los bloques pasan a indentación,
- las sentencias de consola a `print()` o funciones equivalentes,
- y `eos` sirve para decidir cuándo una instrucción termina.

### Guía para quien lo implemente
- Asegurar que el traductor reconocer el programa completo (`s`) y cada instrucción (`instruccion`).
- Definir cómo convertir `bloque` a indentación en Python.
- Mapear `sentenciaConsola` a su equivalente Python o a una función auxiliar.
- Evitar romper sentencias que depender de salto de línea o punto y coma mediante `eos`.

---

## Grupo 2 - Declaraciones, funciones y saltos

**Reglas:**
- `sentenciaVariable`
- `listaDeclaracionVariable`
- `modificadorVariable`
- `declaracionVariable`
- `declaracionFuncion`
- `listaParametros`
- `funcionFlecha`
- `sentenciaContinuar`
- `sentenciaRomper`
- `sentenciaRetornar`
- `sentenciaIntentar`

### Por qué tiene esta complejidad
Este grupo es más complejo porque mezcla varias cosas que en Python tienen comportamiento distinto:

- declaraciones de variables con modificadores (`var`, `mut`, `const`),
- parámetros normales y parámetros con `...`,
- funciones tradicionales y funciones flecha,
- y sentencias de control como `return`, `break`, `continue` y `try/catch`.

La dificultad principal no es solo reconocerlas, sino decidir **cómo representarlas en Python**. Por ejemplo:
- `const` no existe igual que en JavaScript, así que la traducción puede ser solo convencional,
- `funcionFlecha` puede requerir convertir expresiones cortas a `lambda` o a `def`,
- y `sentenciaIntentar` debe mapearse bien a `try/except`.

### Guía para quien lo implemente
- Empezar por las declaraciones simples: variable y función normal.
- Definir cómo representar los parámetros y el `spread`.
- Resolver la traducción de `funcionFlecha`, porque ahí existir dos casos: bloque o expresión.
- Revisar cómo generar el `except` con o sin identificador de error en `sentenciaIntentar`.
- Hacer que `return`, `break` y `continue` respetar el contexto donde aparecer.

---

## Grupo 3  - Control de flujo y selección

**Reglas:**
- `sentenciaSi`
- `sentenciaIterar`
- `inicioFor`
- `condicionFor`
- `actualizacionFor`
- `sentenciaElegir`
- `bloqueCaso`
- `casoSTMT`
- `casoDefecto`

### Por qué tiene esta complejidad
Este grupo ya exige una traducción más cuidadosa porque hay **varias formas de control de flujo** y además hay mucha anidación:

- `si` puede encadenar `sino` y `si` nuevamente,
- `iterar` contiene `hacer/mientras`, `mientras` y `para`,
- `elegir` necesita simular un `switch`, que en Python no existe de forma nativa en versiones antiguas,
- y `bloqueCaso` mezcla casos normales con caso por defecto.

La dificultad está en conservar la lógica original sin perder el orden de los casos ni la estructura de los bucles.

### Guía para quien lo implemente
- Traducir `sentenciaSi` primero, porque servir como base para otras ramas.
- Separar en `sentenciaIterar` los tres formatos: `do-while`, `while` y `for`.
- Decidir en `sentenciaElegir` si implementar con `if/elif/else`, `match` o una estructura auxiliar.
- Asegurar que `casoDefecto` funcionar siempre como rama final.
- Revisar muy bien los bloques anidados para no perder indentación ni alcance de una sentencia.

---

## Grupo 4  - Expresiones, literales y accesos

**Reglas:**
- `sentenciaExpresion`
- `secuenciaExpresiones`
- `expresionUnica`
- `restoCrear`
- `nombreAccesible`
- `tipoMetodoNumero`
- `constanteNumero`
- `metodoNumero`
- `tipoMetodoMate`
- `constanteMate`
- `metodoMate`
- `tipoNativo`
- `argumentos`
- `listaArgumentos`
- `argumento`
- `operadorMultiplicacion`
- `operadorAdicion`
- `operadorRelacional`
- `operadorIgualdad`
- `operadorAsignacion`
- `operadorUnario`
- `identificador`
- `literal`
- `arregloLiteral`
- `listaElementos`
- `elemento`
- `objetoLiteral`
- `listaPropiedades`
- `propiedad`
- `nombrePropiedad`

### Por qué tiene esta complejidad
Este es el grupo más difícil porque concentra el **núcleo de las expresiones** y ahí está casi toda la complejidad de la gramática:

- precedencia de operadores,
- llamadas a funciones,
- acceso con punto y corchetes,
- operadores unarios y asignaciones compuestas,
- literales, arrays y objetos,
- funciones/métodos de `Mate`, `Numero` y tipos nativos.

Además, `expresionUnica` es recursiva y combina muchas alternativas. Al traducirla a Python hay que cuidar mucho el orden de evaluación, la prioridad de operadores y el formato final de cada expresión.

### Guía para quien lo implemente
- Empezar por los casos simples: `identificador`, `literal`, `arregloLiteral` y `objetoLiteral`.
- Pasar después a llamadas y accesos (`argumentos`, `nombreAccesible`, `restoCrear`).
- Implementar luego los operadores por niveles, respetando la precedencia.
- Dejar `expresionUnica` como la última parte, porque depender de casi todas las demás reglas.

---

## Recomendaciones generales

1. **No repetir lógica**: reutilizar esa solución en los demás grupos cuando una regla ya haber sido tratada.
2. **Unificar estilo**: acordar desde el inicio el uso de funciones auxiliares, clases o un traductor basado en nodos.
3. **Probar con ejemplos pequeños**: comenzar con sentencias simples, seguir con bloques anidados y terminar con expresiones complejas.
4. **Coordinar el manejo de indentación**: prestar especial atención a este punto en Python.
5. **Revisar los casos opcionales**: considerar parámetros opcionales, `else` opcional, `catch` opcional, `spread`, etc.

## Nota final
La división está pensada para que el trabajo sea bastante equilibrado. Aun así, el Grupo 4 sigue siendo el más pesado. Si queremos repartirlo todavía mejor, una buena idea es que esa persona reciba apoyo puntual del Grupo 2 o del Grupo 3 para revisar cómo se conectan las expresiones con las sentencias.

