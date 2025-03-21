// Generated from C:/Users/Legion/IdeaProjects/SQPL_Project/src/grammar/sqplGrammar.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link sqplGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface sqplGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(sqplGrammarParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SelectItems}
	 * labeled alternative in {@link sqplGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectItems(sqplGrammarParser.SelectItemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns(sqplGrammarParser.ColumnsContext ctx);
}