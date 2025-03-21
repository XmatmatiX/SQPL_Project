package interpreter;

import grammar.sqplGrammarBaseVisitor;
import grammar.sqplGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class SQPLConverter extends sqplGrammarBaseVisitor<String> {
    private final List<String> commands = new ArrayList<>();
    private final static String SPACE = " ";

    /**
     * Method for creating a simple SQL query as: SELECT ... FROM table
     *
     * @param ctx the parse tree
     * @return {@code null}
     */
    @Override
    public String visitSelect_items(sqplGrammarParser.Select_itemsContext ctx) {
        commands.add(createSimpleSelectStatement(visit(ctx.columns()), ctx.ID().toString())
                .append(SQLConstants.SEMICOLON).toString());
        System.out.println(commands); //Print of the commands list for debugging purposes
        return null;
    }

    /**
     * Public method to retrieve all column names
     *
     * @param ctx the parse tree
     * @return A string with all column names
     */
    @Override
    public String visitColumns(sqplGrammarParser.ColumnsContext ctx) {
        //@TODO fix the logic to correctly retrieve column names
        final StringBuilder result = new StringBuilder();
        if (ctx.STAR() != null) {
            result.append(SQLConstants.ASTERISK);
            return result.toString();
        } else if (ctx.ID_COMMA() == null) {
            if (ctx.ID() != null) {
                result.append(ctx.ID().toString());
            }
            else {
                result.append(SQLConstants.ASTERISK);
            }
        } else {
            result.append(ctx.ID_COMMA().toString());
            if (ctx.ID() != null) {
                result.append(ctx.ID().toString());
            }
        }
        return result.toString();
    }

    /**
     * Private method to populate base of all SELECT queries
     *
     * @param columns   columns which user wants to fetch
     * @param tableName name of the base table from which user want to fetch data
     * @return StringBuilder object with initialized base of the SELECT query
     */
    private StringBuilder createSimpleSelectStatement(final String columns, final String tableName) {
        return new StringBuilder(SQLConstants.SELECT + SPACE + columns + SPACE + SQLConstants.FROM + SPACE + tableName);
    }

}
