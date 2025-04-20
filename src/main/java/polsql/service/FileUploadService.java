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

    public byte[] processFile(final MultipartFile file, final String template) {
        return convertFromCharStream(
                readCharStreamFromFile(file),
                template
        ).getBytes(StandardCharsets.UTF_8);
    }

    public byte[] convertCode(final String code, final String template) {
        return convertFromCharStream(
                CharStreams.fromString(code),
                template
        ).getBytes(StandardCharsets.UTF_8);
    }

    private CharStream readCharStreamFromFile(MultipartFile file) {
        try {
            return CharStreams.fromReader(
                    new InputStreamReader(file.getInputStream(), StandardCharsets.UTF_8)
            );
        } catch (IOException e) {
            throw new RuntimeException("Error reading uploaded file", e);
        }
    }

    private String convertFromCharStream(final CharStream inp, final String template) {
        sqplGrammarLexer lex = new sqplGrammarLexer(inp);
        CommonTokenStream tokens = new CommonTokenStream(lex);
        sqplGrammarParser par = new sqplGrammarParser(tokens);

        ParseTree tree = par.prog();

        // Load template group based on user choice
        String stgPath = String.format("src/main/java/polsql/compiler/%s.stg", template);
        STGroup group = new STGroupFile(stgPath);

        EmitVisitor visitor = new EmitVisitor(group);
        ST st = visitor.visit(tree);
        return st.render();
    }

}
