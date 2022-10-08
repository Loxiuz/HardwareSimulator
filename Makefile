antlr4 = java org.antlr.v4.Tool
grun = java org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = implParser.java implBaseVisitor.java implVisitor.java implLexer.java

all:
	make tree

main.class:	$(SRCFILES) $(GENERATED) impl.g4
	javac  $(SRCFILES) $(GENERATED)

implLexer.java:	impl.g4
	$(antlr4) -visitor impl.g4

implLexer.class: implLexer.java
	javac $(GENERATED)

test:	main.class 03-trafiklys.hw
	java main 03-trafiklys.hw

tree:	implLexer.class impl.g4 03-trafiklys.hw
	$(grun) impl start -gui -tokens 03-trafiklys.hw
