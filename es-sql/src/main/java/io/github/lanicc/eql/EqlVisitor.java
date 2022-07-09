// Generated from /Users/lan/IdeaProjects/github/es-sql-demo/es-sql/src/main/java/io/github/lanicc/eql/Eql.g4 by ANTLR 4.10.1
package io.github.lanicc.eql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link EqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface EqlVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link EqlParser#sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql(EqlParser.SqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link EqlParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(EqlParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code index}
	 * labeled alternative in {@link EqlParser#index_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex(EqlParser.IndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equal}
	 * labeled alternative in {@link EqlParser#where_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(EqlParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code like}
	 * labeled alternative in {@link EqlParser#where_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike(EqlParser.LikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code in}
	 * labeled alternative in {@link EqlParser#where_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn(EqlParser.InContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and}
	 * labeled alternative in {@link EqlParser#where_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(EqlParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by {@link EqlParser#cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCols(EqlParser.ColsContext ctx);
	/**
	 * Visit a parse tree produced by {@link EqlParser#col}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCol(EqlParser.ColContext ctx);
	/**
	 * Visit a parse tree produced by {@link EqlParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(EqlParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link EqlParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(EqlParser.ExprContext ctx);
}