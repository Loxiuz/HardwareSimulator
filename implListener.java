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
	 * Enter a parse tree produced by {@link implParser#latchDec}.
	 * @param ctx the parse tree
	 */
	void enterLatchDec(implParser.LatchDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#latchDec}.
	 * @param ctx the parse tree
	 */
	void exitLatchDec(implParser.LatchDecContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#updateDecl}.
	 * @param ctx the parse tree
	 */
	void enterUpdateDecl(implParser.UpdateDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#updateDecl}.
	 * @param ctx the parse tree
	 */
	void exitUpdateDecl(implParser.UpdateDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link implParser#simlnp}.
	 * @param ctx the parse tree
	 */
	void enterSimlnp(implParser.SimlnpContext ctx);
	/**
	 * Exit a parse tree produced by {@link implParser#simlnp}.
	 * @param ctx the parse tree
	 */
	void exitSimlnp(implParser.SimlnpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCondition(implParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCondition(implParser.ConditionContext ctx);
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
	 * Enter a parse tree produced by the {@code Signal}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterSignal(implParser.SignalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Signal}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitSignal(implParser.SignalContext ctx);
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
	 * Enter a parse tree produced by the {@code Const}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterConst(implParser.ConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Const}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitConst(implParser.ConstContext ctx);
}