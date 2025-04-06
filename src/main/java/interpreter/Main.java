package interpreter;

import grammar.sqplGrammarLexer;
import grammar.sqplGrammarParser;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static List<String> parseListString(String listString) {
		// Remove the surrounding brackets and split by comma
		return Arrays.stream(listString.substring(1, listString.length() - 1) // Remove [ ]
						.split(", ")) // Split by comma and space
				.map(String::trim) // Trim spaces
				.collect(Collectors.toList()); // Convert to List
	}
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
	String output = visitor.visit(tree);
	List<String> ListOfCommands = parseListString(output);
	for (String command : ListOfCommands) {
		System.out.println(command);
	}
  }
}