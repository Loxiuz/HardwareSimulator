import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;

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

    public AST visitStart(implParser.StartContext ctx){

		Command program = new NOP();
		for (implParser.CommandContext c : ctx.cs)
			program = new Sequence(program, (Command) visit(c));
		return program;




	}

	@Override
	public AST visitLatch(implParser.LatchContext ctx) {return new Latch(ctx.id1.getText(),ctx.id2.getText());
	}

	@Override
	public AST visitUpdate(implParser.UpdateContext ctx) {return null;}

	@Override
	public AST visitSimulate(implParser.SimulateContext ctx) {

		List<String> id = new ArrayList<String>();
		for (Token t : ctx.id) {
			id.add(t.getText());
		}
		return new Simlulate(id);
	}



	@Override
	public AST visitParantheses(implParser.ParanthesesContext ctx) {return new Parantheses(ctx.e1.getText());}
	@Override
	public AST visitSIGNALS(implParser.SIGNALSContext ctx) {return new Signal(ctx.c.getText());}

	@Override
	public AST visitVariable(implParser.VariableContext ctx) {return new Variable(ctx.id.getText());}

	@Override
	public AST visitNegation(implParser.NegationContext ctx) {
		Expr e1 = (Expr) visit(ctx.e1);
			return new Negation(e1);
	}

	@Override
	public AST visitAND(implParser.ANDContext ctx) {
		Expr e1=(Expr) visit(ctx.expr(1));
		Expr e2=(Expr) visit(ctx.expr(0));
		return new AND(e1,e2);
	}
	@Override
	public AST visitOR(implParser.ORContext ctx) {
			Expr e1=(Expr) visit(ctx.expr(1));
		    Expr e2=(Expr) visit(ctx.expr(0));
		return new OR(e1,e2);
	}

}

