// Generated from impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link implParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface implVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(implParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Latch}
	 * labeled alternative in {@link implParser#latchDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatch(implParser.LatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Update}
	 * labeled alternative in {@link implParser#updateDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(implParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Simulate}
	 * labeled alternative in {@link implParser#simlnp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulate(implParser.SimulateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parantheses}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParantheses(implParser.ParanthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(implParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOR(implParser.ORContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(implParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAND(implParser.ANDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SIGNALS}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSIGNALS(implParser.SIGNALSContext ctx);
}