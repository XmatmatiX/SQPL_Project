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
	 * Enter a parse tree produced by {@link sqplGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(sqplGrammarParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(sqplGrammarParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code select_items}
	 * labeled alternative in {@link sqplGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect_items(sqplGrammarParser.Select_itemsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code select_items}
	 * labeled alternative in {@link sqplGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect_items(sqplGrammarParser.Select_itemsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code select_where_items}
	 * labeled alternative in {@link sqplGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect_where_items(sqplGrammarParser.Select_where_itemsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code select_where_items}
	 * labeled alternative in {@link sqplGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect_where_items(sqplGrammarParser.Select_where_itemsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code select_order_items}
	 * labeled alternative in {@link sqplGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect_order_items(sqplGrammarParser.Select_order_itemsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code select_order_items}
	 * labeled alternative in {@link sqplGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect_order_items(sqplGrammarParser.Select_order_itemsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code select_where_order_items}
	 * labeled alternative in {@link sqplGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect_where_order_items(sqplGrammarParser.Select_where_order_itemsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code select_where_order_items}
	 * labeled alternative in {@link sqplGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect_where_order_items(sqplGrammarParser.Select_where_order_itemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqplGrammarParser#update_item}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_item(sqplGrammarParser.Update_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#update_item}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_item(sqplGrammarParser.Update_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqplGrammarParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(sqplGrammarParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(sqplGrammarParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqplGrammarParser#delete_item}.
	 * @param ctx the parse tree
	 */
	void enterDelete_item(sqplGrammarParser.Delete_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#delete_item}.
	 * @param ctx the parse tree
	 */
	void exitDelete_item(sqplGrammarParser.Delete_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqplGrammarParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(sqplGrammarParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(sqplGrammarParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqplGrammarParser#describe_table}.
	 * @param ctx the parse tree
	 */
	void enterDescribe_table(sqplGrammarParser.Describe_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#describe_table}.
	 * @param ctx the parse tree
	 */
	void exitDescribe_table(sqplGrammarParser.Describe_tableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code add_column}
	 * labeled alternative in {@link sqplGrammarParser#update_table}.
	 * @param ctx the parse tree
	 */
	void enterAdd_column(sqplGrammarParser.Add_columnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code add_column}
	 * labeled alternative in {@link sqplGrammarParser#update_table}.
	 * @param ctx the parse tree
	 */
	void exitAdd_column(sqplGrammarParser.Add_columnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code modify_column}
	 * labeled alternative in {@link sqplGrammarParser#update_table}.
	 * @param ctx the parse tree
	 */
	void enterModify_column(sqplGrammarParser.Modify_columnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code modify_column}
	 * labeled alternative in {@link sqplGrammarParser#update_table}.
	 * @param ctx the parse tree
	 */
	void exitModify_column(sqplGrammarParser.Modify_columnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code drop_column}
	 * labeled alternative in {@link sqplGrammarParser#update_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_column(sqplGrammarParser.Drop_columnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code drop_column}
	 * labeled alternative in {@link sqplGrammarParser#update_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_column(sqplGrammarParser.Drop_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqplGrammarParser#delete_table}.
	 * @param ctx the parse tree
	 */
	void enterDelete_table(sqplGrammarParser.Delete_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#delete_table}.
	 * @param ctx the parse tree
	 */
	void exitDelete_table(sqplGrammarParser.Delete_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqplGrammarParser#create_db}.
	 * @param ctx the parse tree
	 */
	void enterCreate_db(sqplGrammarParser.Create_dbContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#create_db}.
	 * @param ctx the parse tree
	 */
	void exitCreate_db(sqplGrammarParser.Create_dbContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqplGrammarParser#drop_db}.
	 * @param ctx the parse tree
	 */
	void enterDrop_db(sqplGrammarParser.Drop_dbContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#drop_db}.
	 * @param ctx the parse tree
	 */
	void exitDrop_db(sqplGrammarParser.Drop_dbContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqplGrammarParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(sqplGrammarParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(sqplGrammarParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqplGrammarParser#order_by}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by(sqplGrammarParser.Order_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#order_by}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by(sqplGrammarParser.Order_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqplGrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void enterObject(sqplGrammarParser.ObjectContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#object}.
	 * @param ctx the parse tree
	 */
	void exitObject(sqplGrammarParser.ObjectContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqplGrammarParser#definition}.
	 * @param ctx the parse tree
	 */
	void enterDefinition(sqplGrammarParser.DefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#definition}.
	 * @param ctx the parse tree
	 */
	void exitDefinition(sqplGrammarParser.DefinitionContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link sqplGrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void enterEquation(sqplGrammarParser.EquationContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#equation}.
	 * @param ctx the parse tree
	 */
	void exitEquation(sqplGrammarParser.EquationContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqplGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(sqplGrammarParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(sqplGrammarParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link sqplGrammarParser#constraints}.
	 * @param ctx the parse tree
	 */
	void enterConstraints(sqplGrammarParser.ConstraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link sqplGrammarParser#constraints}.
	 * @param ctx the parse tree
	 */
	void exitConstraints(sqplGrammarParser.ConstraintsContext ctx);
}