package compiler;


import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import grammar.sqplGrammarBaseVisitor;
import grammar.sqplGrammarParser;


public class EmitVisitor extends sqplGrammarBaseVisitor<ST> {
    private final STGroup stGroup;

    public EmitVisitor(STGroup group) {
        super();
        this.stGroup = group;
    }

    @Override
    public ST visitProg(sqplGrammarParser.ProgContext ctx) {
        ST st = stGroup.getInstanceOf("prog");
        for (int i = 0; i < ctx.command().size(); i++) {
            ST commandST = visit(ctx.command(i));
            if (commandST != null) {
                st.add("commands", commandST.render()); // lub bez `.render()` jeśli później renderujesz całość
            }
        }
        return st;
    }

    @Override
    public ST visitCommand(sqplGrammarParser.CommandContext ctx) {
        if (ctx.select() != null) {
            return visit(ctx.select());
        } else if (ctx.create_db() != null) {
            return visit(ctx.create_db());
        } else if (ctx.insert() != null) {
            return visit(ctx.insert());
        } else if (ctx.update_item() != null) {
            return visit(ctx.update_item());
        } else if (ctx.delete_item() != null) {
            return visit(ctx.delete_item());
        } else if (ctx.describe_table() != null) {
            return visit(ctx.describe_table());
        } else if (ctx.create_table() != null) {
            return visit(ctx.create_table());
        } else if (ctx.update_table() != null) {
            return visit(ctx.update_table());
        } else if (ctx.delete_table() != null) {
            return visit(ctx.delete_table());
        } else if (ctx.drop_db() != null) {
            return visit(ctx.drop_db());
        }
        return null;
    }

    @Override
    public ST visitSelect_items(sqplGrammarParser.Select_itemsContext ctx) {
        ST st = stGroup.getInstanceOf("select_items");
        st.add("columns", visit(ctx.columns()));
        st.add("table", ctx.ID().getText());

        return st;
    }

    @Override
    public ST visitSelect_where_items(sqplGrammarParser.Select_where_itemsContext ctx) {
        ST st = stGroup.getInstanceOf("select_items");
        st.add("columns", visit(ctx.columns()));
        st.add("table", ctx.ID().getText());
        st.add("where", visit(ctx.where()));
        return st;
    }

    @Override
    public ST visitSelect_order_items(sqplGrammarParser.Select_order_itemsContext ctx) {
        ST st = stGroup.getInstanceOf("select_items");
        st.add("columns", visit(ctx.columns()));
        st.add("table", ctx.ID().getText());
        st.add("order", visit(ctx.order_by()));
        return st;
    }

    @Override
    public ST visitSelect_where_order_items(sqplGrammarParser.Select_where_order_itemsContext ctx) {
        ST st = stGroup.getInstanceOf("select_items");
        st.add("columns", visit(ctx.columns()));
        st.add("table", ctx.ID().getText());
        st.add("where", visit(ctx.where()));
        st.add("order", visit(ctx.order_by()));
        return st;
    }

    @Override
    public ST visitUpdate_item(sqplGrammarParser.Update_itemContext ctx) {
        ST st = stGroup.getInstanceOf("update_item");
        st.add("table", ctx.ID().getText());
        for (int i = 0; i < ctx.equation().size(); i++) {
            st.add("equations", ctx.equation(i).getText());
        }
        if (ctx.where() != null) {
            st.add("where", visit(ctx.where()));
        }
        return st;
    }

    @Override
    public ST visitInsert(sqplGrammarParser.InsertContext ctx) {
        ST st = stGroup.getInstanceOf("insert");
        st.add("table", ctx.ID().getText());
        st.add("columns", ctx.object(0).getText());
        for (int i = 1; i < ctx.object().size(); i++) {
            st.add("values", ctx.object(i).getText());
        }
        return st;
    }

    @Override
    public ST visitDelete_item(sqplGrammarParser.Delete_itemContext ctx) {
        ST st = stGroup.getInstanceOf("delete_item");
        st.add("table", ctx.ID().getText());
        if (ctx.where() != null) {
            st.add("where", visit(ctx.where()));
        }
        return st;
    }

    @Override
    public ST visitCreate_table(sqplGrammarParser.Create_tableContext ctx) {
        ST st = stGroup.getInstanceOf("create_table");
        st.add("table", ctx.ID().getText());
        st.add("definition", visit(ctx.definition()));
        return st;
    }

    @Override
    public ST visitDefinition(sqplGrammarParser.DefinitionContext ctx) {
        ST st = stGroup.getInstanceOf("definition");
        for (int i = 0; i < ctx.ID().size(); i++) {
            String column = ctx.ID(i).getText();
            column += " ";
            column += visit(ctx.data_type(i)).render();
            column += " ";
            column += visit(ctx.constraints(i)).render();
            st.add("columns", column);
        }
        return st;
    }

    @Override
    public ST visitDescribe_table(sqplGrammarParser.Describe_tableContext ctx) {
        ST st = stGroup.getInstanceOf("describe_table");
        st.add("table", ctx.ID().getText());
        return st;
    }

    @Override
    public ST visitAdd_column(sqplGrammarParser.Add_columnContext ctx) {
        ST st = stGroup.getInstanceOf("add_column");
        st.add("table", ctx.ID(0).getText());
        st.add("column", ctx.ID(1).getText());
        st.add("data_type", visit(ctx.data_type()));
        st.add("constraints", visit(ctx.constraints()));
        return st;
    }

    @Override
    public ST visitModify_column(sqplGrammarParser.Modify_columnContext ctx) {
        ST st = stGroup.getInstanceOf("modify_column");
        st.add("table", ctx.ID(0).getText());
        st.add("column", ctx.ID(1).getText());
        st.add("data_type", visit(ctx.data_type()));
        return st;
    }

    @Override
    public ST visitDrop_column(sqplGrammarParser.Drop_columnContext ctx) {
        ST st = stGroup.getInstanceOf("drop_column");
        st.add("table", ctx.ID(0).getText());
        st.add("column", ctx.ID(1).getText());
        return st;
    }

    @Override
    public ST visitDelete_table(sqplGrammarParser.Delete_tableContext ctx) {
        ST st = stGroup.getInstanceOf("delete_table");
        st.add("table", ctx.ID().getText());
        return st;
    }

    @Override
    public ST visitCreate_db(sqplGrammarParser.Create_dbContext ctx) {
        ST st = stGroup.getInstanceOf("create_db");
        st.add("name", ctx.ID().getText());
        return st;
    }

    @Override
    public ST visitDrop_db(sqplGrammarParser.Drop_dbContext ctx) {
        ST st = stGroup.getInstanceOf("drop_db");
        st.add("name", ctx.ID().getText());
        return st;
    }

    @Override
    public ST visitConstraints(sqplGrammarParser.ConstraintsContext ctx) {
        ST st = stGroup.getInstanceOf("constraints");
        if (!ctx.PRIMARY_KEY().isEmpty())
        {
            st.add("pk", ctx.PRIMARY_KEY().toString());
        }
        if(!ctx.UNIQUE().isEmpty())
        {
            st.add("unique", ctx.UNIQUE().toString());
        }
        if (!ctx.NOT_NULL().isEmpty())
        {
            st.add("not_null", ctx.NOT_NULL().toString());
        }
        if(!ctx.default_().isEmpty())
        {
            st.add("def", visit(ctx.default_(0)));
        }
        if (!ctx.foreign_key().isEmpty())
        {
            st.add("fk", visit(ctx.foreign_key(0)));
        }
        return st;
    }

    @Override
    public ST visitDefault(sqplGrammarParser.DefaultContext ctx) {
        ST st = stGroup.getInstanceOf("default_");
        st.add("value", ctx.value().getText());
        return st;
    }

    @Override
    public ST visitForeign_key(sqplGrammarParser.Foreign_keyContext ctx) {
        ST st = stGroup.getInstanceOf("foreign_key");
        st.add("table", ctx.ID(0).getText());
        st.add("column", ctx.ID(1).getText());
        return st;
    }

    @Override
    public ST visitColumns_without_coma(sqplGrammarParser.Columns_without_comaContext ctx) {
        ST st = stGroup.getInstanceOf("columns");
        for (int i = 0; i < ctx.ID().size(); i++) {
            st.add("names", ctx.ID(i).getText());
        }
        return st;
    }

    @Override
    public ST visitWhere(sqplGrammarParser.WhereContext ctx) {
        ST st = stGroup.getInstanceOf("where");
        for (int i = 0; i < ctx.condition().size(); i++) {
            st.add("conditions", visit(ctx.condition(i)));
        }
        return st;
    }

    @Override
    public ST visitCondition(sqplGrammarParser.ConditionContext ctx) {
        ST st = stGroup.getInstanceOf("condition");
        st.add("logic", visit(ctx.logic_sign()));
        st.add("column", ctx.column_name.getText());
        if (ctx.SIGN().getText().equals("==")) {
            st.add("sign", "=");
        }else
        {
            st.add("sign", ctx.SIGN().getText());
        }
        st.add("value", ctx.value().getText());
        return st;
    }

    @Override
    public ST visitColumns_with_coma(sqplGrammarParser.Columns_with_comaContext ctx) {
        ST st = stGroup.getInstanceOf("columns");
        st.add("names", ctx.getText());
        return st;
    }

    @Override
    public ST visitColumns_star(sqplGrammarParser.Columns_starContext ctx) {
        ST st = stGroup.getInstanceOf("columns");
        st.add("names", "*");
        return st;
    }

    @Override
    public ST visitLogic_sign(sqplGrammarParser.Logic_signContext ctx) {
        ST st = stGroup.getInstanceOf("text");
        if (ctx.AND() != null) {
            st.add("text", "AND");
        } else if (ctx.OR() != null) {
            st.add("text", "OR");
        } else if (ctx.NOT() != null) {
            st.add("text", "NOT");
        }else {
            st.add("text", "");
        }
        return st;
    }

    @Override
    public ST visitOrder_by(sqplGrammarParser.Order_byContext ctx) {
        ST st = stGroup.getInstanceOf("order_by");
        for (int i = 0; i < ctx.order().size(); i++) {
            String order = ctx.ID(i).getText();
            if (ctx.order(i).getText().equals("malejąco")) {
                order += " DESC";
            }else
            {
                order += " ASC";
            }
            st.add("orders", order);
        }
        return st;
    }

    @Override
    public ST visitText(sqplGrammarParser.TextContext ctx) {
        ST st = stGroup.getInstanceOf("text_type");
        if (ctx.INT() != null) {
            st.add("size", ctx.INT().getText());
        }
        return st;
    }

    @Override
    public ST visitInt(sqplGrammarParser.IntContext ctx) {
        ST st = stGroup.getInstanceOf("int_type");
        if (ctx.INT() != null) {
            st.add("size", ctx.INT().getText());
        }
        return st;
    }

    @Override
    public ST visitDouble(sqplGrammarParser.DoubleContext ctx) {
        ST st = stGroup.getInstanceOf("double_type");
        if (ctx.INT() != null) {
            st.add("first", ctx.INT(0).getText());
            st.add("second", ctx.INT(1).getText());
        }
        return st;
    }

    @Override
    public ST visitChar(sqplGrammarParser.CharContext ctx) {
        ST st = stGroup.getInstanceOf("char_type");
        return st;
    }

    @Override
    public ST visitBit(sqplGrammarParser.BitContext ctx) {
        ST st = stGroup.getInstanceOf("bit_type");
        return st;
    }

    @Override
    public ST visitDate(sqplGrammarParser.DateContext ctx) {
        ST st = stGroup.getInstanceOf("date_type");
        return st;
    }
}
