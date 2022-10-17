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
	 * Visit a parse tree produced by {@link implParser#latchDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatchDec(implParser.LatchDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#updateDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateDecl(implParser.UpdateDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link implParser#simlnp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimlnp(implParser.SimlnpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Condition}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(implParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parantheses}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParantheses(implParser.ParanthesesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Signal}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignal(implParser.SignalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(implParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negation}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegation(implParser.NegationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Const}
	 * labeled alternative in {@link implParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst(implParser.ConstContext ctx);
}