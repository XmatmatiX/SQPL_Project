package polsql.service;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroup;
import org.stringtemplate.v4.STGroupFile;
import polsql.compiler.EmitVisitor;
import polsql.domain.FileUploadResponse;
import polsql.grammar.sqplGrammarLexer;
import polsql.grammar.sqplGrammarParser;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

@Service
public class FileUploadService {

    public FileUploadResponse processFile(final MultipartFile file) {
        CharStream inp;

        try {
            inp = CharStreams.fromReader(new InputStreamReader(file.getInputStream(), StandardCharsets.UTF_8));
        } catch (IOException e) {
            return new FileUploadResponse(HttpStatus.INTERNAL_SERVER_ERROR);
        }

        sqplGrammarLexer lex = new sqplGrammarLexer(inp);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        sqplGrammarParser par = new sqplGrammarParser(tokens);

        ParseTree tree = par.prog();

        STGroup group = new STGroupFile("src/main/java/polsql/compiler/test.stg");

        EmitVisitor em = new EmitVisitor(group);
        ST res = em.visit(tree);
        System.out.println(res.render());
        try {
            var wr = new FileWriter("wy.sql");
            wr.write(res.render());
            wr.close();
        } catch (IOException e) {
            return new FileUploadResponse(HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new FileUploadResponse(HttpStatus.CREATED);
    }

}
