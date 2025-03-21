// Generated from C:/Users/Legion/IdeaProjects/SQPL_Project/src/grammar/sqplGrammar.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class sqplGrammarLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, SELECT=6, CREATE=7, INSERT=8, 
		UPDATE=9, DELETE=10, ID=11, SEMI=12, TEXT=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "SELECT", "CREATE", "INSERT", 
			"UPDATE", "DELETE", "ID", "SEMI", "TEXT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'z tabeli'", "'z'", "','", "'i'", "'oraz'", null, null, "'dodaj'", 
			null, "'usu\\u0144'", null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, "SELECT", "CREATE", "INSERT", "UPDATE", 
			"DELETE", "ID", "SEMI", "TEXT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public sqplGrammarLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "sqplGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000\u000e\u00a2\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0003"+
		"\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0003\u0005L\b\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006Z\b\u0006"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0003\b\u0089\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\n\u0004\n\u0091\b\n\u000b\n\f\n\u0092\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0004\f\u0098\b\f\u000b\f\f\f\u0099\u0001\r\u0004\r\u009d"+
		"\b\r\u000b\r\f\r\u009e\u0001\r\u0001\r\u0000\u0000\u000e\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u0001\u0000\u0003\u0004"+
		"\u000009AZ__az\u0003\u0000\t\n\r\r  \u0003\u0000\t\n\f\r  \u00ac\u0000"+
		"\u0001\u0001\u0000\u0000\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000"+
		"\u0005\u0001\u0000\u0000\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000"+
		"\t\u0001\u0000\u0000\u0000\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r"+
		"\u0001\u0000\u0000\u0000\u0000\u000f\u0001\u0000\u0000\u0000\u0000\u0011"+
		"\u0001\u0000\u0000\u0000\u0000\u0013\u0001\u0000\u0000\u0000\u0000\u0015"+
		"\u0001\u0000\u0000\u0000\u0000\u0017\u0001\u0000\u0000\u0000\u0000\u0019"+
		"\u0001\u0000\u0000\u0000\u0000\u001b\u0001\u0000\u0000\u0000\u0001\u001d"+
		"\u0001\u0000\u0000\u0000\u0003&\u0001\u0000\u0000\u0000\u0005(\u0001\u0000"+
		"\u0000\u0000\u0007*\u0001\u0000\u0000\u0000\t,\u0001\u0000\u0000\u0000"+
		"\u000bK\u0001\u0000\u0000\u0000\rY\u0001\u0000\u0000\u0000\u000f[\u0001"+
		"\u0000\u0000\u0000\u0011\u0088\u0001\u0000\u0000\u0000\u0013\u008a\u0001"+
		"\u0000\u0000\u0000\u0015\u0090\u0001\u0000\u0000\u0000\u0017\u0094\u0001"+
		"\u0000\u0000\u0000\u0019\u0097\u0001\u0000\u0000\u0000\u001b\u009c\u0001"+
		"\u0000\u0000\u0000\u001d\u001e\u0005z\u0000\u0000\u001e\u001f\u0005 \u0000"+
		"\u0000\u001f \u0005t\u0000\u0000 !\u0005a\u0000\u0000!\"\u0005b\u0000"+
		"\u0000\"#\u0005e\u0000\u0000#$\u0005l\u0000\u0000$%\u0005i\u0000\u0000"+
		"%\u0002\u0001\u0000\u0000\u0000&\'\u0005z\u0000\u0000\'\u0004\u0001\u0000"+
		"\u0000\u0000()\u0005,\u0000\u0000)\u0006\u0001\u0000\u0000\u0000*+\u0005"+
		"i\u0000\u0000+\b\u0001\u0000\u0000\u0000,-\u0005o\u0000\u0000-.\u0005"+
		"r\u0000\u0000./\u0005a\u0000\u0000/0\u0005z\u0000\u00000\n\u0001\u0000"+
		"\u0000\u000012\u0005w\u0000\u000023\u0005y\u0000\u000034\u0005b\u0000"+
		"\u000045\u0005i\u0000\u000056\u0005e\u0000\u000067\u0005r\u0000\u0000"+
		"7L\u0005z\u0000\u000089\u0005z\u0000\u00009:\u0005n\u0000\u0000:;\u0005"+
		"a\u0000\u0000;<\u0005j\u0000\u0000<=\u0005d\u0000\u0000=L\u0005\u017a"+
		"\u0000\u0000>?\u0005p\u0000\u0000?@\u0005o\u0000\u0000@A\u0005k\u0000"+
		"\u0000AB\u0005a\u0000\u0000BL\u0005\u017c\u0000\u0000CD\u0005w\u0000\u0000"+
		"DE\u0005y\u0000\u0000EF\u0005\u015b\u0000\u0000FG\u0005w\u0000\u0000G"+
		"H\u0005i\u0000\u0000HI\u0005e\u0000\u0000IJ\u0005t\u0000\u0000JL\u0005"+
		"l\u0000\u0000K1\u0001\u0000\u0000\u0000K8\u0001\u0000\u0000\u0000K>\u0001"+
		"\u0000\u0000\u0000KC\u0001\u0000\u0000\u0000L\f\u0001\u0000\u0000\u0000"+
		"MN\u0005s\u0000\u0000NO\u0005t\u0000\u0000OP\u0005w\u0000\u0000PQ\u0005"+
		"\u00f3\u0000\u0000QR\u0005r\u0000\u0000RZ\u0005z\u0000\u0000ST\u0005u"+
		"\u0000\u0000TU\u0005t\u0000\u0000UV\u0005w\u0000\u0000VW\u0005\u00f3\u0000"+
		"\u0000WX\u0005r\u0000\u0000XZ\u0005z\u0000\u0000YM\u0001\u0000\u0000\u0000"+
		"YS\u0001\u0000\u0000\u0000Z\u000e\u0001\u0000\u0000\u0000[\\\u0005d\u0000"+
		"\u0000\\]\u0005o\u0000\u0000]^\u0005d\u0000\u0000^_\u0005a\u0000\u0000"+
		"_`\u0005j\u0000\u0000`\u0010\u0001\u0000\u0000\u0000ab\u0005z\u0000\u0000"+
		"bc\u0005m\u0000\u0000cd\u0005i\u0000\u0000de\u0005e\u0000\u0000e\u0089"+
		"\u0005\u0144\u0000\u0000fg\u0005p\u0000\u0000gh\u0005o\u0000\u0000hi\u0005"+
		"d\u0000\u0000ij\u0005m\u0000\u0000jk\u0005i\u0000\u0000kl\u0005e\u0000"+
		"\u0000l\u0089\u0005\u0144\u0000\u0000mn\u0005z\u0000\u0000no\u0005a\u0000"+
		"\u0000op\u0005k\u0000\u0000pq\u0005t\u0000\u0000qr\u0005u\u0000\u0000"+
		"rs\u0005a\u0000\u0000st\u0005l\u0000\u0000tu\u0005i\u0000\u0000uv\u0005"+
		"z\u0000\u0000vw\u0005u\u0000\u0000w\u0089\u0005j\u0000\u0000xy\u0005a"+
		"\u0000\u0000yz\u0005k\u0000\u0000z{\u0005t\u0000\u0000{|\u0005u\u0000"+
		"\u0000|}\u0005a\u0000\u0000}~\u0005l\u0000\u0000~\u007f\u0005i\u0000\u0000"+
		"\u007f\u0080\u0005z\u0000\u0000\u0080\u0081\u0005u\u0000\u0000\u0081\u0089"+
		"\u0005j\u0000\u0000\u0082\u0083\u0005p\u0000\u0000\u0083\u0084\u0005o"+
		"\u0000\u0000\u0084\u0085\u0005p\u0000\u0000\u0085\u0086\u0005r\u0000\u0000"+
		"\u0086\u0087\u0005a\u0000\u0000\u0087\u0089\u0005w\u0000\u0000\u0088a"+
		"\u0001\u0000\u0000\u0000\u0088f\u0001\u0000\u0000\u0000\u0088m\u0001\u0000"+
		"\u0000\u0000\u0088x\u0001\u0000\u0000\u0000\u0088\u0082\u0001\u0000\u0000"+
		"\u0000\u0089\u0012\u0001\u0000\u0000\u0000\u008a\u008b\u0005u\u0000\u0000"+
		"\u008b\u008c\u0005s\u0000\u0000\u008c\u008d\u0005u\u0000\u0000\u008d\u008e"+
		"\u0005\u0144\u0000\u0000\u008e\u0014\u0001\u0000\u0000\u0000\u008f\u0091"+
		"\u0007\u0000\u0000\u0000\u0090\u008f\u0001\u0000\u0000\u0000\u0091\u0092"+
		"\u0001\u0000\u0000\u0000\u0092\u0090\u0001\u0000\u0000\u0000\u0092\u0093"+
		"\u0001\u0000\u0000\u0000\u0093\u0016\u0001\u0000\u0000\u0000\u0094\u0095"+
		"\u0005;\u0000\u0000\u0095\u0018\u0001\u0000\u0000\u0000\u0096\u0098\b"+
		"\u0001\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000\u0098\u0099\u0001"+
		"\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000\u0099\u009a\u0001"+
		"\u0000\u0000\u0000\u009a\u001a\u0001\u0000\u0000\u0000\u009b\u009d\u0007"+
		"\u0002\u0000\u0000\u009c\u009b\u0001\u0000\u0000\u0000\u009d\u009e\u0001"+
		"\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009e\u009f\u0001"+
		"\u0000\u0000\u0000\u009f\u00a0\u0001\u0000\u0000\u0000\u00a0\u00a1\u0006"+
		"\r\u0000\u0000\u00a1\u001c\u0001\u0000\u0000\u0000\u0007\u0000KY\u0088"+
		"\u0092\u0099\u009e\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}