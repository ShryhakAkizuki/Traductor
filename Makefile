JAVAC=javac
JAVA=java
JFLAGS=
CP=.:ANTLR/antlr-runtime-4.13.1.jar:gen:src

SRC=src/Main.java \
    src/ControlFlowVisitor.java \
    src/DeclarationsVisitor.java \
    src/EsJsVisitorImpl.java \
    src/ExpressionVisitor.java

GEN=gen/EsJsBaseListener.java \
    gen/EsJsBaseVisitor.java \
    gen/EsJsLexer.java \
    gen/EsJsListener.java \
    gen/EsJsParser.java \
    gen/EsJsVisitor.java

all: clean compile run

compile:
	@$(JAVAC) $(JFLAGS) -cp "$(CP)" $(SRC) $(GEN)

run:
	@$(JAVA) -cp "$(CP)" Main

clean:
	rm -f src/*.class gen/*.class
