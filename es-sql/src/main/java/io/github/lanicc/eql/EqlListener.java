// Generated from /Users/lan/IdeaProjects/github/es-sql-demo/es-sql/src/main/java/io/github/lanicc/eql/Eql.g4 by ANTLR 4.10.1
package io.github.lanicc.eql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EqlParser}.
 */
public interface EqlListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EqlParser#sql}.
	 * @param ctx the parse tree
	 */
	void enterSql(EqlParser.SqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link EqlParser#sql}.
	 * @param ctx the parse tree
	 */
	void exitSql(EqlParser.SqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link EqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(EqlParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link EqlParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(EqlParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code index}
	 * labeled alternative in {@link EqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void enterIndex(EqlParser.IndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code index}
	 * labeled alternative in {@link EqlParser#index_name}.
	 * @param ctx the parse tree
	 */
	void exitIndex(EqlParser.IndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equal}
	 * labeled alternative in {@link EqlParser#where_statement}.
	 * @param ctx the parse tree
	 */
	void enterEqual(EqlParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link EqlParser#where_statement}.
	 * @param ctx the parse tree
	 */
	void exitEqual(EqlParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code like}
	 * labeled alternative in {@link EqlParser#where_statement}.
	 * @param ctx the parse tree
	 */
	void enterLike(EqlParser.LikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code like}
	 * labeled alternative in {@link EqlParser#where_statement}.
	 * @param ctx the parse tree
	 */
	void exitLike(EqlParser.LikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code in}
	 * labeled alternative in {@link EqlParser#where_statement}.
	 * @param ctx the parse tree
	 */
	void enterIn(EqlParser.InContext ctx);
	/**
	 * Exit a parse tree produced by the {@code in}
	 * labeled alternative in {@link EqlParser#where_statement}.
	 * @param ctx the parse tree
	 */
	void exitIn(EqlParser.InContext ctx);
	/**
	 * Enter a parse tree produced by the {@code and}
	 * labeled alternative in {@link EqlParser#where_statement}.
	 * @param ctx the parse tree
	 */
	void enterAnd(EqlParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code and}
	 * labeled alternative in {@link EqlParser#where_statement}.
	 * @param ctx the parse tree
	 */
	void exitAnd(EqlParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by {@link EqlParser#cols}.
	 * @param ctx the parse tree
	 */
	void enterCols(EqlParser.ColsContext ctx);
	/**
	 * Exit a parse tree produced by {@link EqlParser#cols}.
	 * @param ctx the parse tree
	 */
	void exitCols(EqlParser.ColsContext ctx);
	/**
	 * Enter a parse tree produced by {@link EqlParser#col}.
	 * @param ctx the parse tree
	 */
	void enterCol(EqlParser.ColContext ctx);
	/**
	 * Exit a parse tree produced by {@link EqlParser#col}.
	 * @param ctx the parse tree
	 */
	void exitCol(EqlParser.ColContext ctx);
	/**
	 * Enter a parse tree produced by {@link EqlParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(EqlParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link EqlParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(EqlParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link EqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(EqlParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EqlParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(EqlParser.ExprContext ctx);
}