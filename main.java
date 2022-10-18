import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException{

	// we expect exactly one argument: the name of the input file
	if (args.length!=1) {
	    System.err.println("\n");
	    System.err.println("Impl Interpreter\n");
	    System.err.println("=================\n\n");
	    System.err.println("Please give as input argument a filename\n");
	    System.exit(-1);
	}
	String filename=args[0];

	// open the input file
	CharStream input = CharStreams.fromFileName(filename);
	    //new ANTLRFileStream (filename); // depricated
	
	// create a lexer/scanner
	implLexer lex = new implLexer(input);
	
	// get the stream of tokens from the scanner
	CommonTokenStream tokens = new CommonTokenStream(lex);
	
	// create a parser
	implParser parser = new implParser(tokens);
	
	// and parse anything from the grammar for "start"
	ParseTree parseTree = parser.start();

	// Construct an interpreter and run it on the parse tree
	Interpreter interpreter = new Interpreter();
		AST result=interpreter.visit(parseTree);
    }
}

// We write an interpreter that implements interface
// "implVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Double.

class Interpreter extends AbstractParseTreeVisitor<AST> implements implVisitor<AST> {

    public AST visitStart(implParser.StartContext ctx){return null;}
	@Override
	public AST visitLatchDec(implParser.LatchDecContext ctx) {return null;}

	@Override
	public AST visitUpdateDecl(implParser.UpdateDeclContext ctx) {
		return null;
	}
	@Override
	public AST visitSimlnp(implParser.SimlnpContext ctx) {return null;}
	@Override
	public AST visitCondition(implParser.ConditionContext ctx) {
		return null;
	}
	@Override
	public AST visitParantheses(implParser.ParanthesesContext ctx) {
		return null;
	}
	@Override
	public AST visitSignal(implParser.SignalContext ctx) {
		return null;
	}
	@Override
	public AST visitVariable(implParser.VariableContext ctx) {
		return null;
	}
	@Override
	public AST visitNegation(implParser.NegationContext ctx) {
		return null;
	}

	@Override
	public AST visitConst(implParser.ConstContext ctx) {
		return null;
	}

	public AST visitExpr(implParser.ExprContext ctx) {
		return null;
	}


    //public Double visitExpr(implParser.ExprContext ctx){return null;};

}

