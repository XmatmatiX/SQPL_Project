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
	 * Visit a parse tree produced by {@link sqplGrammarParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(sqplGrammarParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code select_items}
	 * labeled alternative in {@link sqplGrammarParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_items(sqplGrammarParser.Select_itemsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code select_where_items}
	 * labeled alternative in {@link sqplGrammarParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_where_items(sqplGrammarParser.Select_where_itemsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code select_order_items}
	 * labeled alternative in {@link sqplGrammarParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_order_items(sqplGrammarParser.Select_order_itemsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code select_where_order_items}
	 * labeled alternative in {@link sqplGrammarParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_where_order_items(sqplGrammarParser.Select_where_order_itemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#update_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_item(sqplGrammarParser.Update_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(sqplGrammarParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#delete_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_item(sqplGrammarParser.Delete_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(sqplGrammarParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#describe_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribe_table(sqplGrammarParser.Describe_tableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code add_column}
	 * labeled alternative in {@link sqplGrammarParser#update_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_column(sqplGrammarParser.Add_columnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code modify_column}
	 * labeled alternative in {@link sqplGrammarParser#update_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_column(sqplGrammarParser.Modify_columnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code drop_column}
	 * labeled alternative in {@link sqplGrammarParser#update_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_column(sqplGrammarParser.Drop_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#delete_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_table(sqplGrammarParser.Delete_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#create_db}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_db(sqplGrammarParser.Create_dbContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#drop_db}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_db(sqplGrammarParser.Drop_dbContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(sqplGrammarParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#order_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by(sqplGrammarParser.Order_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitObject(sqplGrammarParser.ObjectContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition(sqplGrammarParser.DefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns(sqplGrammarParser.ColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#equation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquation(sqplGrammarParser.EquationContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(sqplGrammarParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link sqplGrammarParser#constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraints(sqplGrammarParser.ConstraintsContext ctx);
}