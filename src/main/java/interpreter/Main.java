package interpreter;

import grammar.sqplGrammarLexer;
import grammar.sqplGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;

public class Main {
  public static void main(String[] args) throws Exception {
	  CharStream input = null;
	  try {
		  input = CharStreams.fromFileName("kod.sqpl");
	  } catch (IOException e) {
		  throw new RuntimeException(e);
	  }

	// create a lexer that feeds off of input CharStream
	sqplGrammarLexer lexer = new sqplGrammarLexer(input);

	// create a buffer of tokens pulled from the lexer
	CommonTokenStream tokens = new CommonTokenStream(lexer);

	// create a parser that feeds off the tokens buffer
	sqplGrammarParser parser = new sqplGrammarParser(tokens);

	// start parsing at the prog rule
	ParseTree tree = parser.prog();
	// System.out.println(tree.toStringTree(parser));

	// create a visitor to traverse the parse tree
	SQPLConverter visitor = new SQPLConverter();
	System.out.println(visitor.visit(tree));
  }
}