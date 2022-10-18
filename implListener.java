// Generated from impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link implParser}.
 */
public interface implListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(implParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(implParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Latch}
	 * labeled alternative in {@link implParser#latchDec}.
	 * @param ctx the parse tree
	 */
	void enterLatch(implParser.LatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Latch}
	 * labeled alternative in {@link implParser#latchDec}.
	 * @param ctx the parse tree
	 */
	void exitLatch(implParser.LatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Update}
	 * labeled alternative in {@link implParser#updateDecl}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(implParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Update}
	 * labeled alternative in {@link implParser#updateDecl}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(implParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Simulate}
	 * labeled alternative in {@link implParser#simlnp}.
	 * @param ctx the parse tree
	 */
	void enterSimulate(implParser.SimulateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Simulate}
	 * labeled alternative in {@link implParser#simlnp}.
	 * @param ctx the parse tree
	 */
	void exitSimulate(implParser.SimulateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parantheses}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParantheses(implParser.ParanthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parantheses}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParantheses(implParser.ParanthesesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(implParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(implParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OR}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOR(implParser.ORContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OR}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOR(implParser.ORContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNegation(implParser.NegationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNegation(implParser.NegationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AND}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAND(implParser.ANDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AND}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAND(implParser.ANDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SIGNALS}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSIGNALS(implParser.SIGNALSContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SIGNALS}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSIGNALS(implParser.SIGNALSContext ctx);
}