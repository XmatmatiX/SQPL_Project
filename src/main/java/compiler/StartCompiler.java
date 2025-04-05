package compiler;


import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import grammar.sqplGrammarLexer;
import grammar.sqplGrammarParser;

import java.io.FileWriter;
import java.io.IOException;


public class StartCompiler {
    public static void main(String[] args) {
        CharStream inp = null;

        try {
            inp = CharStreams.fromFileName("kod.sqpl");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
//        CharStream inp = CharStreams.fromString("1\n2+3+4","wejście");
        sqplGrammarLexer lex = new sqplGrammarLexer(inp);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        sqplGrammarParser par = new sqplGrammarParser(tokens);

        ParseTree tree = par.prog();

        //st group
//        STGroup.trackCreationEvents = true;
        STGroup group = new STGroupFile("src/main/java/compiler/test.stg");

        EmitVisitor em = new EmitVisitor(group);
        ST res = em.visit(tree);
        System.out.println(res.render());
        try {
            var wr = new FileWriter("wy.sql");
            wr.write(res.render());
            wr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        //res.inspect();
    }
}
