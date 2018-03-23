// Generated from forloopFinal.g4 by ANTLR 4.7
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link forloopFinalParser}.
 */
public interface forloopFinalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link forloopFinalParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(forloopFinalParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link forloopFinalParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(forloopFinalParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link forloopFinalParser#doexpr}.
	 * @param ctx the parse tree
	 */
	void enterDoexpr(forloopFinalParser.DoexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link forloopFinalParser#doexpr}.
	 * @param ctx the parse tree
	 */
	void exitDoexpr(forloopFinalParser.DoexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link forloopFinalParser#asgnexpr}.
	 * @param ctx the parse tree
	 */
	void enterAsgnexpr(forloopFinalParser.AsgnexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link forloopFinalParser#asgnexpr}.
	 * @param ctx the parse tree
	 */
	void exitAsgnexpr(forloopFinalParser.AsgnexprContext ctx);
	/**
	 * Enter a parse tree produced by {@link forloopFinalParser#bodyexpr}.
	 * @param ctx the parse tree
	 */
	void enterBodyexpr(forloopFinalParser.BodyexprContext ctx);
	/**
	 * Exit a parse tree produced by {@link forloopFinalParser#bodyexpr}.
	 * @param ctx the parse tree
	 */
	void exitBodyexpr(forloopFinalParser.BodyexprContext ctx);
}