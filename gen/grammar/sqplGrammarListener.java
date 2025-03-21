// Generated from C:/Users/Legion/IdeaProjects/SQPL_Project/src/grammar/sqplGrammar.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link sqplGrammarParser}.
 */
public interface sqplGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link sqplGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(sqplGrammarParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(sqplGrammarParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SelectItems}
	 * labeled alternative in {@link sqplGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void enterSelectItems(sqplGrammarParser.SelectItemsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SelectItems}
	 * labeled alternative in {@link sqplGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void exitSelectItems(sqplGrammarParser.SelectItemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqplGrammarParser#columns}.
	 * @param ctx the parse tree
	 */
	void enterColumns(sqplGrammarParser.ColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#columns}.
	 * @param ctx the parse tree
	 */
	void exitColumns(sqplGrammarParser.ColumnsContext ctx);
}