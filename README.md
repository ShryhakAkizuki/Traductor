# Traductor EsJS → Python

Traductor académico del lenguaje **EsJS** a **Python**, implementado en Java con **ANTLR 4**. El programa recibe por **entrada estándar** un código fuente válido en EsJS y produce por **salida estándar** el código Python equivalente.


## Integrantes
 * Oscar Leonardo Riveros Perez
 * Cristian Camilo Barrera
 * Nicolas Martinez Lopez

## Objetivo

El proyecto implementa un traductor fuente-a-fuente que:

1. analiza léxicamente el programa EsJS,
2. construye su árbol sintáctico,
3. recorre el árbol con visitors especializados,
4. genera como salida el programa traducido a Python.

La solución está preparada para evaluación en entornos como **UNCode**, por lo que el punto de entrada lee desde `System.in` y escribe únicamente en `System.out`.

---

## Estructura del proyecto

### Archivos y carpetas principales

- [`src/Main.java`](src/Main.java)  
  Punto de entrada del traductor. Orquesta el flujo completo: lectura desde entrada estándar, creación del lexer, creación del parser, construcción del árbol sintáctico y ejecución del visitor traductor.

- [`grammar/EsJs.g4`](grammar/EsJs.g4)  
  Gramática del lenguaje EsJS. Define la estructura formal del lenguaje fuente, incluyendo:
  - programa principal (`s`),
  - instrucciones,
  - bloques,
  - declaraciones de variables y funciones,
  - condicionales,
  - iteraciones,
  - selección tipo `switch`,
  - manejo de excepciones,
  - expresiones, literales y accesos.

- [`gen/`](gen/)  
  Código generado automáticamente por ANTLR a partir de la gramática. Contiene:
  - [`gen/EsJsLexer.java`](gen/EsJsLexer.java): analizador léxico,
  - [`gen/EsJsParser.java`](gen/EsJsParser.java): analizador sintáctico,
  - visitors y listeners base generados por ANTLR.

- [`src/ExpressionVisitor.java`](src/ExpressionVisitor.java)  
  Componente base de traducción. Implementa la conversión de expresiones EsJS a Python:
  - literales,
  - identificadores,
  - operadores,
  - llamadas a funciones,
  - arreglos y objetos,
  - traducción de utilidades como `Mate` y `Numero`,
  - manejo de definiciones auxiliares pendientes,
  - control de indentación del código generado.

- [`src/ControlFlowVisitor.java`](src/ControlFlowVisitor.java)  
  Extiende el visitor de expresiones y traduce estructuras de control:
  - `si / sino`,
  - `mientras`,
  - `hacer / mientras`,
  - `para`,
  - `elegir / caso / porDefecto`.

- [`src/EsJsVisitorImpl.java`](src/EsJsVisitorImpl.java)  
  Visitor principal de ensamblaje del programa traducido. Se encarga de:
  - recorrer la raíz del árbol,
  - construir el programa Python final,
  - agregar imports necesarios,
  - incorporar definiciones auxiliares generadas durante la traducción,
  - traducir sentencias de consola,
  - centralizar manejo básico de errores internos del proceso de traducción.

- [`src/DeclarationsVisitor.java`](src/DeclarationsVisitor.java)  
  Capa final del traductor. Añade soporte para:
  - declaraciones de variables,
  - declaraciones de funciones,
  - parámetros,
  - funciones flecha,
  - `return`,
  - `break`,
  - `continue`,
  - `try / catch`.

- [`input/`](input/)  
  Conjunto de entradas de prueba del proyecto.

- [`ANTLR/antlr-runtime-4.13.1.jar`](ANTLR/antlr-runtime-4.13.1.jar)  
  Runtime de ANTLR necesario para compilar y ejecutar el traductor.

- [`grammar/division.md`](grammar/division.md)  
  Documento auxiliar de organización del trabajo.

---

## Arquitectura del traductor

La traducción está organizada como una jerarquía de visitors:

### 1. Lexer
El **lexer** generado por ANTLR ([`gen/EsJsLexer.java`](gen/EsJsLexer.java)) recibe el texto fuente EsJS y lo divide en tokens reconocibles por la gramática.

### 2. Parser
El **parser** generado ([`gen/EsJsParser.java`](gen/EsJsParser.java)) consume los tokens y construye el árbol sintáctico a partir de la regla inicial `s`.

### 3. Visitor de expresiones
[`src/ExpressionVisitor.java`](src/ExpressionVisitor.java) traduce las construcciones básicas del lenguaje:
- expresiones aritméticas y lógicas,
- llamadas,
- objetos,
- arreglos,
- utilidades nativas equivalentes en Python.

### 4. Visitor de control de flujo
[`src/ControlFlowVisitor.java`](src/ControlFlowVisitor.java) añade la traducción de estructuras de control del programa.

### 5. Visitor principal
[`src/EsJsVisitorImpl.java`](src/EsJsVisitorImpl.java) organiza la salida final, agrega imports requeridos y coordina la construcción del programa Python completo.

### 6. Visitor de declaraciones
[`src/DeclarationsVisitor.java`](src/DeclarationsVisitor.java) completa la traducción con variables, funciones y sentencias de salto.

---

## Flujo de ejecución

El flujo del traductor es el siguiente:

1. **Lectura del código fuente**  
   [`src/Main.java`](src/Main.java) lee desde `System.in` el programa EsJS completo.

2. **Análisis léxico**  
   Se crea una instancia de `EsJsLexer`, que transforma la entrada en tokens.

3. **Análisis sintáctico**  
   Los tokens se entregan a `EsJsParser`, que construye el árbol sintáctico usando la regla raíz `s`.

4. **Recorrido del árbol**  
   Se instancia [`src/DeclarationsVisitor.java`](src/DeclarationsVisitor.java), que hereda la funcionalidad acumulada de:
   - [`src/ExpressionVisitor.java`](src/ExpressionVisitor.java),
   - [`src/ControlFlowVisitor.java`](src/ControlFlowVisitor.java),
   - [`src/EsJsVisitorImpl.java`](src/EsJsVisitorImpl.java).

5. **Generación de código Python**  
   Cada nodo del árbol se visita y se transforma en su representación equivalente en Python.

6. **Salida final**  
   El código traducido se imprime por `System.out`.

---

## Supuesto de operación

Para la evaluación manual se asume que:

- la **entrada estándar** contiene un programa **EsJS válido**,
- dicho programa no presenta errores léxicos, sintácticos ni semánticos,
- la **salida estándar** contiene exclusivamente el código traducido a **Python**.

---

## Compilación y ejecución

## Requisitos

- Runtime de ANTLR incluido en el proyecto: [`ANTLR/antlr-runtime-4.13.1.jar`](ANTLR/antlr-runtime-4.13.1.jar)

### Compilación en Windows / UNCode

```bat
javac --release 8 -cp ".;ANTLR/antlr-runtime-4.13.1.jar;gen;src" src/Main.java src/ControlFlowVisitor.java src/DeclarationsVisitor.java src/EsJsVisitorImpl.java src/ExpressionVisitor.java gen/EsJs*.java
```

La compatibilidad del proyecto fue validada con esta compilación.

### Ejecución en Windows / UNCode con entrada estándar

```bat
type input\test.in | java -cp ".;ANTLR/antlr-runtime-4.13.1.jar;gen;src" Main
```

También puede ejecutarse redirigiendo desde cualquier archivo de prueba:

```bat
type input\01.in | java -cp ".;ANTLR/antlr-runtime-4.13.1.jar;gen;src" Main
```

---

## Consideraciones para UNCode

- La clase [`src/Main.java`](src/Main.java) está adaptada para leer desde **`System.in`**.
- La salida del traductor se envía por **`System.out`**.
- No se requieren argumentos de línea de comandos.
- No depende de rutas absolutas ni configuraciones externas.
- El código fuente fue ajustado para ser compatible con **Java 8**, que es el entorno objetivo de UNCode.
- La compilación solo requiere Java y el runtime de ANTLR incluido en el repositorio.

Esto permite que el traductor se ejecute en un entorno de evaluación automática o manual sin modificaciones adicionales en el código fuente.

---

## Resumen técnico

En términos de arquitectura, el proyecto separa claramente:

- **definición del lenguaje** en la gramática,
- **análisis léxico y sintáctico** en el código generado por ANTLR,
- **traducción semántica y generación de código** en la jerarquía de visitors.

Esta organización facilita explicar, mantener y evaluar el traductor de forma directa.