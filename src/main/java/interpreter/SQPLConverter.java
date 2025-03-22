package interpreter;

import grammar.sqplGrammarBaseVisitor;
import grammar.sqplGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class SQPLConverter extends sqplGrammarBaseVisitor<String> {
    private final List<String> commands = new ArrayList<>();

    private StringBuilder command = new StringBuilder();


    @Override
    public String visitSelect_items(sqplGrammarParser.Select_itemsContext ctx) {
        command = new StringBuilder();
        command.append("SELECT ");
        command.append(visit(ctx.columns()));
        command.append(" FROM ");
        command.append(ctx.ID().getText());
        command.append(";");
        commands.add(command.toString());
        System.out.println(commands); //Print of the commands list for debugging purposes
        return null;
    }

    @Override
    public String visitSelect_where_items(sqplGrammarParser.Select_where_itemsContext ctx) {
        command = new StringBuilder();
        command.append("SELECT ");
        command.append(visit(ctx.columns()));
        command.append(" FROM ");
        command.append(ctx.ID().getText());
        command.append(visit(ctx.where()));
        command.append(";");
        commands.add(command.toString());
        System.out.println(commands);
        return null;
    }

    @Override
    public String visitSelect_order_items(sqplGrammarParser.Select_order_itemsContext ctx) {
        command = new StringBuilder();
        command.append("SELECT ");
        command.append(visit(ctx.columns()));
        command.append(" FROM ");
        command.append(ctx.ID().getText());
        command.append(visit(ctx.order_by()));
        command.append(";");
        commands.add(command.toString());
        System.out.println(commands);
        return null;
    }

    @Override
    public String visitSelect_where_order_items(sqplGrammarParser.Select_where_order_itemsContext ctx) {
        command = new StringBuilder();
        command.append("SELECT ");
        command.append(visit(ctx.columns()));
        command.append(" FROM ");
        command.append(ctx.ID().getText());
        command.append(visit(ctx.where()));
        command.append(visit(ctx.order_by()));
        command.append(";");
        commands.add(command.toString());
        System.out.println(commands);
        return null;
    }

    @Override
    public String visitUpdate_item(sqplGrammarParser.Update_itemContext ctx) {
        command = new StringBuilder();
        command.append("UPDATE ");
        command.append(ctx.ID().getText());
        command.append(" SET ");
        for (int i = 0; i < ctx.equation().size(); i++) {
            command.append(ctx.equation(i).getText());
            command.append(", ");
        }
        command.delete(command.length() - 2, command.length());
        command.append(visit(ctx.where()));
        command.append(";");
        commands.add(command.toString());
        System.out.println(commands);
        return null;
    }

    @Override
    public String visitInsert(sqplGrammarParser.InsertContext ctx) {
        command = new StringBuilder();
        command.append("INSERT INTO ");
        command.append(ctx.ID().getText());
        command.append(ctx.object(0).getText());
        command.append(" VALUES ");
        for (int i = 1; i < ctx.object().size(); i++) {
            command.append(ctx.object(i).getText());
            command.append(", ");
        }
        command.delete(command.length() - 2, command.length());
        command.append(";");
        commands.add(command.toString());
        System.out.println(commands);
        return null;
    }

    @Override
    public String visitDelete_item(sqplGrammarParser.Delete_itemContext ctx) {
        command = new StringBuilder();
        command.append("DELETE FROM ");
        command.append(ctx.ID().getText());
        if (ctx.where() != null) {
            command.append(visit(ctx.where()));
        }
        command.append(";");
        commands.add(command.toString());
        System.out.println(commands);
        return null;
    }

    @Override
    public String visitCreate_table(sqplGrammarParser.Create_tableContext ctx) {
        command = new StringBuilder();
        command.append("CREATE TABLE ");
        command.append(ctx.ID().getText());
        command.append(visit(ctx.definition()));
        command.append(";");
        commands.add(command.toString());
        System.out.println(commands);
        return null;
    }

    @Override
    public String visitDescribe_table(sqplGrammarParser.Describe_tableContext ctx) {
        command = new StringBuilder();
        command.append("DESCRIBE ");
        command.append(ctx.ID().getText());
        command.append(";");
        commands.add(command.toString());
        System.out.println(commands);
        return null;
    }

    @Override
    public String visitAdd_column(sqplGrammarParser.Add_columnContext ctx) {
        command = new StringBuilder();
        command.append("ALTER TABLE ");
        command.append(ctx.ID(0).getText());
        command.append(" ADD ");
        command.append(ctx.ID(1).getText());
        command.append(visit(ctx.constraints()));
        command.append(";");
        commands.add(command.toString());
        System.out.println(commands);
        return null;
    }

    @Override
    public String visitModify_column(sqplGrammarParser.Modify_columnContext ctx) {
        command = new StringBuilder();
        command.append("ALTER TABLE ");
        command.append(ctx.ID(0).getText());
        command.append(" MODIFY ");
        command.append(ctx.ID(1).getText());
        command.append(" ");
        command.append(visit(ctx.data_type()));
        command.append(";");
        commands.add(command.toString());
        System.out.println(commands);
        return null;
    }

    @Override
    public String visitDrop_column(sqplGrammarParser.Drop_columnContext ctx) {
        command = new StringBuilder();
        command.append("ALTER TABLE ");
        command.append(ctx.ID(0).getText());
        command.append(" DROP COLUMN ");
        command.append(ctx.ID(1).getText());
        command.append(";");
        commands.add(command.toString());
        System.out.println(commands);
        return null;
    }

    @Override
    public String visitDelete_table(sqplGrammarParser.Delete_tableContext ctx) {
        command = new StringBuilder();
        command.append("DROP TABLE ");
        command.append(ctx.ID().getText());
        command.append(";");
        commands.add(command.toString());
        System.out.println(commands);
        return null;
    }

    @Override
    public String visitCreate_db(sqplGrammarParser.Create_dbContext ctx) {
        command = new StringBuilder();
        command.append("CREATE DATABASE ");
        command.append(ctx.ID().getText());
        command.append(";");
        commands.add(command.toString());
        System.out.println(commands);
        return null;
    }

    @Override
    public String visitDrop_db(sqplGrammarParser.Drop_dbContext ctx) {
        command = new StringBuilder();
        command.append("DROP DATABASE ");
        command.append(ctx.ID().getText());
        command.append(";");
        commands.add(command.toString());
        System.out.println(commands);
        return null;
    }

    @Override
    public String visitColumns_without_coma(sqplGrammarParser.Columns_without_comaContext ctx) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ctx.ID().size(); i++) {
            result.append(ctx.ID(i).getText()).append(", ");
        }
        result.delete(result.length() - 2, result.length());
        return result.toString();
    }

    @Override
    public String visitColumns_with_coma(sqplGrammarParser.Columns_with_comaContext ctx) {
        return ctx.getText();
    }

    @Override
    public String visitColumns_star(sqplGrammarParser.Columns_starContext ctx) {
        return "*";
    }

    @Override
    public String visitWhere(sqplGrammarParser.WhereContext ctx) {
        StringBuilder result = new StringBuilder();
        StringBuilder conditions = new StringBuilder();
        result.append(" WHERE ");

        for(int i = 0; i < ctx.condition().size(); i++) {
            conditions.append(visit(ctx.condition(i)));
            conditions.append(" ");
        }

        if (conditions.toString().startsWith("AND"))
            conditions.delete(0, 4);

        result.append(conditions);

        return result.toString();
    }

    @Override
    public String visitOrder_by(sqplGrammarParser.Order_byContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append(" ORDER BY ");
        for (int i = 0; i < ctx.order().size(); i++) {
            result.append(ctx.ID(i).getText());
            if (ctx.order(i).getText().equals("malejąco"))
                result.append(" DESC ");
            else
                result.append(" ASC ");
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        return result.toString();
    }

    @Override
    public String visitCondition(sqplGrammarParser.ConditionContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append(visit(ctx.logic_sign()));
        result.append(" ");
        result.append(ctx.column_name.getText());
        result.append(" ");
        if (ctx.SIGN().getText().equals("==")) {
            result.append("=");
        }else
        {
            result.append(ctx.SIGN().getText());
        }
        result.append(" ");
        result.append(ctx.value().getText());
        return result.toString();
    }

    @Override
    public String visitDefinition(sqplGrammarParser.DefinitionContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append(" ( ");
        for (int i = 0; i < ctx.ID().size(); i++) {
            result.append(ctx.ID(i).getText());
            result.append(" ");
            result.append(visit(ctx.data_type(i)));
            result.append(" ");
            result.append(visit(ctx.constraints(i)));
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());
        result.append(" ) ");
        return result.toString();
    }

    @Override
    public String visitConstraints(sqplGrammarParser.ConstraintsContext ctx) {
        StringBuilder result = new StringBuilder();

        if (!ctx.PRIMARY_KEY().isEmpty()) {
            result.append( " PRIMARY KEY ");
        }
        if (!ctx.UNIQUE().isEmpty()) {
            result.append(" UNIQUE ");
        }
        if (!ctx.NOT_NULL().isEmpty()) {
            result.append(" NOT NULL ");
        }
        if (!ctx.foreign_key().isEmpty()) {
            result.append(visit(ctx.foreign_key(0)));
        }
        if (!ctx.default_().isEmpty()) {
            result.append(visit(ctx.default_(0)));
        }

        return result.toString();
    }



    @Override
    public String visitForeign_key(sqplGrammarParser.Foreign_keyContext ctx) {

        return " FOREIGN KEY " +
                ctx.ID(0).getText() +
                " ( " +
                ctx.ID(1).getText() +
                " ) ";
    }

    @Override
    public String visitDefault(sqplGrammarParser.DefaultContext ctx) {
        return " DEFAULT " +
                ctx.value().getText() +
                " ";
    }

    @Override
    public String visitLogic_sign(sqplGrammarParser.Logic_signContext ctx) {
        return switch (ctx.getText()) {
            case "lub" -> "OR";
            case "nie" -> "NOT";
            default -> "AND";
        };
    }

    @Override
    public String visitText(sqplGrammarParser.TextContext ctx) {
        String result = ctx.getText();
        result = result.replace("tekst", "VARCHAR");
        if (ctx.INT() == null) {
            result+=("(255)");
        }
        return result;
    }

    @Override
    public String visitInt(sqplGrammarParser.IntContext ctx) {
        String result = ctx.getText();
        result = result.replace("liczba całkowita", "INT");
        return result;
    }

    @Override
    public String visitDouble(sqplGrammarParser.DoubleContext ctx) {
        String result = ctx.getText();
        result = result.replace("liczba zmiennoprzecinkowa", "DOUBLE");
        return result;
    }

    @Override
    public String visitChar(sqplGrammarParser.CharContext ctx) {
        return "CHAR";
    }

    @Override
    public String visitDate(sqplGrammarParser.DateContext ctx) {
        return "DATE";
    }

    @Override
    public String visitBit(sqplGrammarParser.BitContext ctx) {
        return "BIT";
    }
}
