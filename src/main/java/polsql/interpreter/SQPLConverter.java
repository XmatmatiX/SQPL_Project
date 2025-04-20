package polsql.interpreter;

import polsql.grammar.sqplGrammarBaseVisitor;
import polsql.grammar.sqplGrammarParser;

import java.util.ArrayList;
import java.util.List;

public class SQPLConverter extends sqplGrammarBaseVisitor<String> {
    private final List<String> commands = new ArrayList<>();

    private StringBuilder command = new StringBuilder();

    /**
     * Przejście przez wszystkie komendy i zmiana na komendy SQL
     * @param ctx the parse tree
     * @return lista komend w języku SQL
     */
    @Override
    public String visitProg(sqplGrammarParser.ProgContext ctx) {
        for (int i = 0; i < ctx.getChildCount(); i++) {
            visit(ctx.getChild(i));             //przechodzi przez każdą komendę 
        }
        return commands.toString();
    }

    /**
     * Tworzy zapytanie SELECT, pobierając dane o kolumnach oraz nazwie tabeli.
     * Następnie dodaje polecenie do listy poleceń.
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public String visitSelect_items(sqplGrammarParser.Select_itemsContext ctx) {
        command = new StringBuilder();
        command.append("SELECT ");
        command.append(visit(ctx.columns()));   //tłumaczenie gramatyki kolumn na kod SQL
        command.append(" FROM ");
        command.append(ctx.ID().getText());     //pobieranie nazwy tabeli
        command.append(";");
        commands.add(command.toString());
        //System.out.println(commands);
        return null;
    }

    /**
     * Tworzy zapytanie SELECT, pobierając dane o kolumnach oraz nazwie tabeli.
     * Następnie pobiera dane dotyczące klauzuli WHERE i dodaje polecenie do listy poleceń.
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public String visitSelect_where_items(sqplGrammarParser.Select_where_itemsContext ctx) {
        command = new StringBuilder();
        command.append("SELECT ");
        command.append(visit(ctx.columns()));   //tłumaczenie gramatyki kolumn na kod SQL
        command.append(" FROM ");
        command.append(ctx.ID().getText());     //pobranie nazwy tabeli
        command.append(visit(ctx.where()));     //tłumaczenie gramatyki where na kod SQL
        command.append(";");
        commands.add(command.toString());
        //System.out.println(commands);
        return null;
    }

    /**
     * Tworzy zapytanie SELECT, pobierając dane o kolumnach oraz nazwie tabeli.
     * Następnie pobiera dane dotyczące klauzuli ORDER BY i dodaje polecenie do listy poleceń.
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public String visitSelect_order_items(sqplGrammarParser.Select_order_itemsContext ctx) {
        command = new StringBuilder();
        command.append("SELECT ");
        command.append(visit(ctx.columns()));   //tłumaczenie gramatyki kolumn na kod SQL
        command.append(" FROM ");
        command.append(ctx.ID().getText());     //pobranie nazwy tabeli
        command.append(visit(ctx.order_by()));  //tłumaczenie gramatyki order by na kod SQL
        command.append(";");
        commands.add(command.toString());
        //System.out.println(commands);
        return null;
    }

    /**
     * Tworzy zapytanie SELECT, pobierając dane o kolumnach oraz nazwie tabeli.
     * Następnie pobiera dane dotyczące klauzul WHERE i ORDER BY, po czym dodaje
     * polecenie do listy poleceń.
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public String visitSelect_where_order_items(sqplGrammarParser.Select_where_order_itemsContext ctx) {
        command = new StringBuilder();
        command.append("SELECT ");
        command.append(visit(ctx.columns()));   //tłumaczenie gramatyki kolumn na kod SQL
        command.append(" FROM ");
        command.append(ctx.ID().getText());     //pobranie nazwy tabeli
        command.append(visit(ctx.where()));     //tłumaczenie gramatyki where na kod SQL
        command.append(visit(ctx.order_by()));  //tłumaczenie gramatyki order by na kod SQL
        command.append(";");
        commands.add(command.toString());
        //System.out.println(commands);
        return null;
    }

    /**
     * Tworzy zapytanie UPDATE pobierając dane o nazwie tabeli.
     * Następnie konwertuje wszystkie parametry, które należy ustawić.
     * Na konice dodaje klauzulę WHERE i dodaje polecenie do listy.
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public String visitUpdate_item(sqplGrammarParser.Update_itemContext ctx) {
        command = new StringBuilder();
        command.append("UPDATE ");
        command.append(ctx.ID().getText());                 //pobieranie nazwy tabeli
        command.append(" SET ");
        for (int i = 0; i < ctx.equation().size(); i++) {
            command.append(ctx.equation(i).getText());      //dopisanie przypisania wartości
            command.append(", ");
        }
        //usunięcie ostatniego przecinka
        command.delete(command.length() - 2, command.length());
        command.append(visit(ctx.where()));                 //tłumaczenie gramatyki where na kod SQL
        command.append(";");
        commands.add(command.toString());
        //System.out.println(commands);
        return null;
    }

    /**
     * Tworzy zapytanie INSERT INTO pobierając dane o nazwie tabeli.
     * Następnie określane są kolumny, których będzie używać dodawany obiekt
     * Pętla for przekształca każdy element na kod SQL
     * Na koniec polecenie dodawane jest do listy komend
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public String visitInsert(sqplGrammarParser.InsertContext ctx) {
        command = new StringBuilder();
        command.append("INSERT INTO ");
        command.append(ctx.ID().getText());             //pobranie nazwy tabeli
        command.append(ctx.object(0).getText());      //pobranie nazw kolumn
        command.append(" VALUES ");
        for (int i = 1; i < ctx.object().size(); i++) {
            command.append(ctx.object(i).getText());    //pobranie wartości dla zdefiniowanych kolumn
            command.append(", ");
        }
        //usuwanie ostatniego przecinka
        command.delete(command.length() - 2, command.length());
        command.append(";");
        commands.add(command.toString());
        //System.out.println(commands);
        return null;
    }

    /**
     * Tworzy zapytanie DELETE FROM pobierając nazwę tabeli.
     * Jeśli istenieje klauzula WHERE, jest ona dodawana.
     * Na koniec polecenie dodawane jest do listy komend
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public String visitDelete_item(sqplGrammarParser.Delete_itemContext ctx) {
        command = new StringBuilder();
        command.append("DELETE FROM ");
        command.append(ctx.ID().getText());     //pobranie nazwy tabeli
        if (ctx.where() != null) {
            command.append(visit(ctx.where())); //tłumaczenie WHERE jeśli istnieje
        }
        command.append(";");
        commands.add(command.toString());
        //System.out.println(commands);
        return null;
    }

    /**
     * Tworzy zapytanie CREATE TABLE pobierając nazwę tabeli.
     * Następnie definiowane są kolumny tej tabeli.
     * Na koniec polecenie dodawane jest do listy komend.
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public String visitCreate_table(sqplGrammarParser.Create_tableContext ctx) {
        command = new StringBuilder();
        command.append("CREATE TABLE ");
        command.append(ctx.ID().getText());         //pobieranie nazwy tabeli
        command.append(visit(ctx.definition()));    //tłumaczenie definicji kolumn na język SQL
        command.append(";");
        commands.add(command.toString());
        //System.out.println(commands);
        return null;
    }

    /**
     * Tworzy polecenie DESCRIBE pobierając nazwę tabeli.
     * Następnie dodaje polecenie do listy komend.
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public String visitDescribe_table(sqplGrammarParser.Describe_tableContext ctx) {
        command = new StringBuilder();
        command.append("DESCRIBE ");
        command.append(ctx.ID().getText());     //pobranie nazwy tabeli
        command.append(";");
        commands.add(command.toString());
        //System.out.println(commands);
        return null;
    }

    /**
     * Tworzy polecenie ALTER TABLE, które dodaje nową kolumnę.
     * W pierwszej kolejności pobiera nazwę tabeli, a następnie nazwę nowej kolumny.
     * Na koniec pobiera typ ograniczenia kolumny po czym dodaje komendę do listy.
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public String visitAdd_column(sqplGrammarParser.Add_columnContext ctx) {
        command = new StringBuilder();
        command.append("ALTER TABLE ");
        command.append(ctx.ID(0).getText());          //pobranie nazwy tabeli
        command.append(" ADD ");
        command.append(ctx.ID(1).getText());          //pobranie nazwy kolumny
        command.append(visit(ctx.data_type()));         //tłumaczenie typu na kod SQL
        command.append(visit(ctx.constraints()));       //tłumaczenie ograniczeń na kod SQL
        command.append(";");
        commands.add(command.toString());
        //System.out.println(commands);
        return null;
    }

    /**
     * Tworzy polecenie ALTER TABLE, które modyfikuje istniejącą kolumnę.
     * Rozpoczyna od pobrania nazwy tabeli oraz kolumny.
     * Następnie pobiera nowy typ danych kolumny i dodaje komendę do listy.
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public String visitModify_column(sqplGrammarParser.Modify_columnContext ctx) {
        command = new StringBuilder();
        command.append("ALTER TABLE ");
        command.append(ctx.ID(0).getText());        //pobranie nazwy tabeli
        command.append(" MODIFY ");
        command.append(ctx.ID(1).getText());        //pobranie nazwy kolumny
        command.append(" ");
        command.append(visit(ctx.data_type()));        //tłumaczenie typu na kod SQL
        command.append(";");
        commands.add(command.toString());
        //System.out.println(commands);
        return null;
    }

    /**
     * Tworzy polecenie ALTER TABLE, które usuwa kolumnę.
     * W pierwszej kolejności pobiera nazwę tabeli, a następnie pobiera nazwę kolumny do usunięcia
     * Na koniec dodaje polecenie do do listy komend
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public String visitDrop_column(sqplGrammarParser.Drop_columnContext ctx) {
        command = new StringBuilder();
        command.append("ALTER TABLE ");
        command.append(ctx.ID(0).getText());    //pobranie nazwy tabeli
        command.append(" DROP COLUMN ");
        command.append(ctx.ID(1).getText());    //pobranie nazwy kolumny
        command.append(";");
        commands.add(command.toString());
        //System.out.println(commands);
        return null;
    }

    /**
     * Tworzy polecenie DROP TABLE, pobierając nazwę tabeli do usunięcia
     * Następnie dodaje polecenie do listy komend.
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public String visitDelete_table(sqplGrammarParser.Delete_tableContext ctx) {
        command = new StringBuilder();
        command.append("DROP TABLE ");
        command.append(ctx.ID().getText()); //pobranie nazwy tabeli
        command.append(";");
        commands.add(command.toString());
        //System.out.println(commands);
        return null;
    }

    /**
     * Tworzy polecenie CREATE DATABASE pobierając nazwę nowej bazy danych
     * Następnie polecenie dodawane jest do listy komend.
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public String visitCreate_db(sqplGrammarParser.Create_dbContext ctx) {
        command = new StringBuilder();
        command.append("CREATE DATABASE ");
        command.append(ctx.ID().getText());     //pobranie nazwy bazy danych
        command.append(";");
        commands.add(command.toString());
        //System.out.println(commands);
        return null;
    }

    /**
     * Tworzy polecenie DROP DATABASE pobierając nazwę bazy danych.
     * Następnie dodaje polecenie do listy komend
     * @param ctx the parse tree
     * @return null
     */
    @Override
    public String visitDrop_db(sqplGrammarParser.Drop_dbContext ctx) {
        command = new StringBuilder();
        command.append("DROP DATABASE ");
        command.append(ctx.ID().getText());     //pobranie nazwy bazy danych
        command.append(";");
        commands.add(command.toString());
        //System.out.println(commands);
        return null;
    }

    /**
     * Przechodzi przez listę kolumn i rozdziela je przecinkami
     * @param ctx the parse tree
     * @return kolumny po przecinku
     */
    @Override
    public String visitColumns_without_coma(sqplGrammarParser.Columns_without_comaContext ctx) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < ctx.ID().size(); i++) {
            result.append(ctx.ID(i).getText()).append(", ");    //pobranie nazwy i-tej kolumny
        }
        result.delete(result.length() - 2, result.length());    //usunięcie ostatniego przecinka
        return result.toString();
    }

    /**
     * Zwraca listę kolumn po przecinku
     * @param ctx the parse tree
     * @return kolumny po przecinku
     */
    @Override
    public String visitColumns_with_coma(sqplGrammarParser.Columns_with_comaContext ctx) {
        return ctx.getText();
    }

    /**
     * Zamienia słowne symbole na symbol "*"
     * @param ctx the parse tree
     * @return "*"
     */
    @Override
    public String visitColumns_star(sqplGrammarParser.Columns_starContext ctx) {
        return "*";
    }

    /**
     * Tłumaczy gramatykę where na klauzulę w języku SQL
     * Przechodzi przez każdy warunek i zamienia go na rarunki odpowiadające
     * warunkom w SQL
     * @param ctx the parse tree
     * @return kod SQL klauzuli WHERE
     */
    @Override
    public String visitWhere(sqplGrammarParser.WhereContext ctx) {
        StringBuilder result = new StringBuilder();
        StringBuilder conditions = new StringBuilder();
        result.append(" WHERE ");

        for(int i = 0; i < ctx.condition().size(); i++) {
            conditions.append(visit(ctx.condition(i)));         //tłumaczenie warunku na kod SQL
            conditions.append(" ");
        }

        if (conditions.toString().startsWith("AND"))            //usuwanie AND z początku komendy
            conditions.delete(0, 4);

        result.append(conditions);

        return result.toString();
    }

    /**
     * Tłumaczy gramatykę order by na klauzulę w języku SQL
     * Przechodzi przez każdą wartość po której jest sortowana,
     * a następnie łączy wszystkie elementy po których jest sortowana
     * @param ctx the parse tree
     * @return kod SQL klauzuli ORDER BY
     */
    @Override
    public String visitOrder_by(sqplGrammarParser.Order_byContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append(" ORDER BY ");
        for (int i = 0; i < ctx.order().size(); i++) {
            result.append(ctx.ID(i).getText());         //pobieranie nazwy kolumny do sortowania
            if (ctx.order(i).getText().equals("malejąco"))  //pobieranie porządku sortowania dla tej kolumny
                result.append(" DESC ");
            else
                result.append(" ASC ");
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());    //usuwanie ostatniego przecinka
        return result.toString();
    }

    /**
     * Przekształca tekst warunku, na warunek w języku SQL
     * @param ctx the parse tree
     * @return kod SQL warunku
     */
    @Override
    public String visitCondition(sqplGrammarParser.ConditionContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append(visit(ctx.logic_sign()));     //tłumaczenie znaku logicznego równania (AND OR NOT)
        result.append(" ");
        result.append(ctx.column_name.getText());   //Pobieranie nazwy kolumny
        result.append(" ");
        if (ctx.SIGN().getText().equals("==")) {
            result.append("=");                     //zatąpienie '==' znakiem '='
        }else
        {
            result.append(ctx.SIGN().getText());    //pobieranie znaku warunku
        }
        result.append(" ");
        result.append(ctx.value().getText());       //pobranie wartości do porównania
        return result.toString();
    }

    /**
     * Tłumaczy definicje kolumn na kod SQL
     * @param ctx the parse tree
     * @return definicja kolumn w języku SQL
     */
    @Override
    public String visitDefinition(sqplGrammarParser.DefinitionContext ctx) {
        StringBuilder result = new StringBuilder();
        result.append(" ( ");
        for (int i = 0; i < ctx.ID().size(); i++) {
            result.append(ctx.ID(i).getText());         //pobranie nazwy kolumny
            result.append(" ");
            result.append(visit(ctx.data_type(i)));     //przetłumaczenie typu danych kolumny na kod SQL
            result.append(" ");
            result.append(visit(ctx.constraints(i)));   //przetłumaczenie ograniczeń kolumny na kod SQL
            result.append(", ");
        }
        result.delete(result.length() - 2, result.length());    //usuwanie ostatniego przecinka
        result.append(" ) ");
        return result.toString();
    }

    /**
     * Tłumaczenie ograniczeń kolumn na język SQL
     * @param ctx the parse tree
     * @return lista ograniczeń w języku SQL
     */
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
            result.append(visit(ctx.foreign_key(0)));   //tłumaczenie tekstu klucza obcego na kod SQL
        }
        if (!ctx.default_().isEmpty()) {
            result.append(visit(ctx.default_(0)));      //tłumaczenie domyślnej wartości na kod SQL
        }

        return result.toString();
    }

    /**
     * Tłumaczenie tekstu klucza obcego na kod FOREIGN KEY w języku SQL
     * @param ctx the parse tree
     * @return kod SQL określający klucz obcy
     */
    @Override
    public String visitForeign_key(sqplGrammarParser.Foreign_keyContext ctx) {

        return " FOREIGN KEY " +
                ctx.ID(0).getText() +   //pobranie nazwy tabeli
                " ( " +
                ctx.ID(1).getText() +   //pobranie nazwy kolumny
                " ) ";
    }

    /**
     * Tłumaczenie tekstu domyślnej wartości na DEFAULT w języku SQL
     * @param ctx the parse tree
     * @return kod SQL określający wartość domyślną
     */
    @Override
    public String visitDefault(sqplGrammarParser.DefaultContext ctx) {
        return " DEFAULT " +
                ctx.value().getText() + //pobranie domyślnej wartości
                " ";
    }

    /**
     * Tłumaczenie tekstu znaku logicznego na znak logiczny w języku SQL
     * @param ctx the parse tree
     * @return znak logiczny
     */
    @Override
    public String visitLogic_sign(sqplGrammarParser.Logic_signContext ctx) {
        return switch (ctx.getText()) {
            case "lub" -> " OR ";
            case "nie" -> " NOT ";
            default -> " AND ";       //w przypadku braku zdefiniowanego znaku, przyjmujemy znak AND
        };
    }

    /**
     * Tłumaczenie typu tekst na kod w języku SQL
     * @param ctx the parse tree
     * @return varchar(x)
     */
    @Override
    public String visitText(sqplGrammarParser.TextContext ctx) {
        String result = ctx.getText();      //pobierz typ danych
        result = result.replace("tekst", " VARCHAR");    //zamień tekst na kod SQL
        if (ctx.INT() == null) {
            result+=("(255)");              //przyjmij (255) jako wartość domyślną
        }
        return result;
    }

    /**
     * Tłumaczenie typu liczby całkowitej na kod w języku SQL
     * @param ctx the parse tree
     * @return INT/INT(x)
     */
    @Override
    public String visitInt(sqplGrammarParser.IntContext ctx) {
        String result = ctx.getText();      //pobranie typu danych
        result = result.replace("liczba całkowita", " INT");     //podmiana tekstu na kod SQL
        return result;
    }

    /**
     * Tłumaczenie typu liczby zmiennoprzecinkowej na kod w języku SQL
     * @param ctx the parse tree
     * @return DOUBLE/DOUBLE(x,y)
     */
    @Override
    public String visitDouble(sqplGrammarParser.DoubleContext ctx) {
        String result = ctx.getText();      //pobranie typu danych
        result = result.replace("liczba zmiennoprzecinkowa", " DOUBLE");     //pobranie teksty na kod SQL
        return result;
    }

    /**
     * Tłumaczenie typu znaku na kod w języku SQL
     * @param ctx the parse tree
     * @return CHAR
     */
    @Override
    public String visitChar(sqplGrammarParser.CharContext ctx) {
        return " CHAR ";
    }

    /**
     * Tłumaczenie typu daty na kod w jęzuku SQL
     * @param ctx the parse tree
     * @return DATE
     */
    @Override
    public String visitDate(sqplGrammarParser.DateContext ctx) {
        return " DATE ";
    }

    /**
     * Tłumaczenie typu bitu na kod w języku SQL
     * @param ctx the parse tree
     * @return BIT
     */
    @Override
    public String visitBit(sqplGrammarParser.BitContext ctx) {
        return " BIT ";
    }
}
