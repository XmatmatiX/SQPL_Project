// Generated from C:/Users/Legion/IdeaProjects/SQPL_Project/src/grammar/sqplGrammar.g4 by ANTLR 4.13.2
package grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class sqplGrammarParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SELECT=9, 
		CREATE=10, INSERT_INTO=11, UPDATE=12, DELETE=13, CREATE_TABLE=14, DELETE_TABLE=15, 
		DESCRIBE=16, ALTER_TABLE=17, CREATE_DB=18, DROP_DB=19, SET=20, FROM=21, 
		WHERE=22, ORDER_BY=23, ASC=24, DESC=25, VALUES=26, ADD=27, MODIFY=28, 
		DROP_COLUMN=29, AS=30, SIGN=31, STAR=32, DATA_TYPE=33, PRIMARY_KEY=34, 
		UNIQUE=35, NOT_NULL=36, DEFAULT=37, FOREIGN_KEY=38, ID=39, ID_COMMA=40, 
		SEMI=41, DOUBLE=42, INT=43, TEXT=44, WS=45;
	public static final int
		RULE_prog = 0, RULE_command = 1, RULE_select = 2, RULE_update_item = 3, 
		RULE_insert = 4, RULE_delete_item = 5, RULE_create_table = 6, RULE_describe_table = 7, 
		RULE_update_table = 8, RULE_delete_table = 9, RULE_create_db = 10, RULE_drop_db = 11, 
		RULE_where = 12, RULE_order_by = 13, RULE_object = 14, RULE_definition = 15, 
		RULE_columns = 16, RULE_equation = 17, RULE_condition = 18, RULE_constraints = 19;
	private static String[] makeRuleNames() {
		return new String[] {
			"prog", "command", "select", "update_item", "insert", "delete_item", 
			"create_table", "describe_table", "update_table", "delete_table", "create_db", 
			"drop_db", "where", "order_by", "object", "definition", "columns", "equation", 
			"condition", "constraints"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'i'", "'obiekt'", "'obiekty'", "','", "'('", "')'", "'oraz'", 
			"'='", null, null, null, null, null, null, null, null, null, null, "'usu\\u0144 baz\\u0119 danych'", 
			null, null, null, null, null, "'malej\\u0105co'", null, null, null, "'usu\\u0144 kolumn\\u0119'", 
			"'jako'", null, null, null, "'klucz g\\u0142\\u00F3wny'", "'unikalny'", 
			"'nie zero'", null, null, null, null, "';'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, "SELECT", "CREATE", 
			"INSERT_INTO", "UPDATE", "DELETE", "CREATE_TABLE", "DELETE_TABLE", "DESCRIBE", 
			"ALTER_TABLE", "CREATE_DB", "DROP_DB", "SET", "FROM", "WHERE", "ORDER_BY", 
			"ASC", "DESC", "VALUES", "ADD", "MODIFY", "DROP_COLUMN", "AS", "SIGN", 
			"STAR", "DATA_TYPE", "PRIMARY_KEY", "UNIQUE", "NOT_NULL", "DEFAULT", 
			"FOREIGN_KEY", "ID", "ID_COMMA", "SEMI", "DOUBLE", "INT", "TEXT", "WS"
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

	@Override
	public String getGrammarFileName() { return "sqplGrammar.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public sqplGrammarParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(sqplGrammarParser.EOF, 0); }
		public List<CommandContext> command() {
			return getRuleContexts(CommandContext.class);
		}
		public CommandContext command(int i) {
			return getRuleContext(CommandContext.class,i);
		}
		public List<TerminalNode> SEMI() { return getTokens(sqplGrammarParser.SEMI); }
		public TerminalNode SEMI(int i) {
			return getToken(sqplGrammarParser.SEMI, i);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitProg(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitProg(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1047040L) != 0)) {
				{
				{
				setState(40);
				command();
				setState(41);
				match(SEMI);
				}
				}
				setState(47);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(48);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public SelectContext select() {
			return getRuleContext(SelectContext.class,0);
		}
		public Update_itemContext update_item() {
			return getRuleContext(Update_itemContext.class,0);
		}
		public InsertContext insert() {
			return getRuleContext(InsertContext.class,0);
		}
		public Delete_itemContext delete_item() {
			return getRuleContext(Delete_itemContext.class,0);
		}
		public Create_tableContext create_table() {
			return getRuleContext(Create_tableContext.class,0);
		}
		public Describe_tableContext describe_table() {
			return getRuleContext(Describe_tableContext.class,0);
		}
		public Update_tableContext update_table() {
			return getRuleContext(Update_tableContext.class,0);
		}
		public Delete_tableContext delete_table() {
			return getRuleContext(Delete_tableContext.class,0);
		}
		public Create_dbContext create_db() {
			return getRuleContext(Create_dbContext.class,0);
		}
		public Drop_dbContext drop_db() {
			return getRuleContext(Drop_dbContext.class,0);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		try {
			setState(60);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(50);
				select();
				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(51);
				update_item();
				}
				break;
			case INSERT_INTO:
				enterOuterAlt(_localctx, 3);
				{
				setState(52);
				insert();
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				delete_item();
				}
				break;
			case CREATE_TABLE:
				enterOuterAlt(_localctx, 5);
				{
				setState(54);
				create_table();
				}
				break;
			case DESCRIBE:
				enterOuterAlt(_localctx, 6);
				{
				setState(55);
				describe_table();
				}
				break;
			case ALTER_TABLE:
				enterOuterAlt(_localctx, 7);
				{
				setState(56);
				update_table();
				}
				break;
			case DELETE_TABLE:
				enterOuterAlt(_localctx, 8);
				{
				setState(57);
				delete_table();
				}
				break;
			case CREATE_DB:
				enterOuterAlt(_localctx, 9);
				{
				setState(58);
				create_db();
				}
				break;
			case DROP_DB:
				enterOuterAlt(_localctx, 10);
				{
				setState(59);
				drop_db();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SelectContext extends ParserRuleContext {
		public SelectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_select; }
	 
		public SelectContext() { }
		public void copyFrom(SelectContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Select_order_itemsContext extends SelectContext {
		public TerminalNode SELECT() { return getToken(sqplGrammarParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(sqplGrammarParser.FROM, 0); }
		public TerminalNode ID() { return getToken(sqplGrammarParser.ID, 0); }
		public Order_byContext order_by() {
			return getRuleContext(Order_byContext.class,0);
		}
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public TerminalNode STAR() { return getToken(sqplGrammarParser.STAR, 0); }
		public Select_order_itemsContext(SelectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterSelect_order_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitSelect_order_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitSelect_order_items(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Select_where_order_itemsContext extends SelectContext {
		public TerminalNode SELECT() { return getToken(sqplGrammarParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(sqplGrammarParser.FROM, 0); }
		public TerminalNode ID() { return getToken(sqplGrammarParser.ID, 0); }
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public Order_byContext order_by() {
			return getRuleContext(Order_byContext.class,0);
		}
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public TerminalNode STAR() { return getToken(sqplGrammarParser.STAR, 0); }
		public Select_where_order_itemsContext(SelectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterSelect_where_order_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitSelect_where_order_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitSelect_where_order_items(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Select_where_itemsContext extends SelectContext {
		public TerminalNode SELECT() { return getToken(sqplGrammarParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(sqplGrammarParser.FROM, 0); }
		public TerminalNode ID() { return getToken(sqplGrammarParser.ID, 0); }
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public TerminalNode STAR() { return getToken(sqplGrammarParser.STAR, 0); }
		public Select_where_itemsContext(SelectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterSelect_where_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitSelect_where_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitSelect_where_items(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Select_itemsContext extends SelectContext {
		public TerminalNode SELECT() { return getToken(sqplGrammarParser.SELECT, 0); }
		public TerminalNode FROM() { return getToken(sqplGrammarParser.FROM, 0); }
		public TerminalNode ID() { return getToken(sqplGrammarParser.ID, 0); }
		public ColumnsContext columns() {
			return getRuleContext(ColumnsContext.class,0);
		}
		public TerminalNode STAR() { return getToken(sqplGrammarParser.STAR, 0); }
		public Select_itemsContext(SelectContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterSelect_items(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitSelect_items(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitSelect_items(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectContext select() throws RecognitionException {
		SelectContext _localctx = new SelectContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_select);
		try {
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				_localctx = new Select_itemsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(SELECT);
				setState(65);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case ID_COMMA:
					{
					setState(63);
					columns();
					}
					break;
				case STAR:
					{
					setState(64);
					match(STAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(67);
				match(FROM);
				setState(68);
				match(ID);
				}
				break;
			case 2:
				_localctx = new Select_where_itemsContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				match(SELECT);
				setState(72);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case ID_COMMA:
					{
					setState(70);
					columns();
					}
					break;
				case STAR:
					{
					setState(71);
					match(STAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(74);
				match(FROM);
				setState(75);
				match(ID);
				setState(76);
				where();
				}
				break;
			case 3:
				_localctx = new Select_order_itemsContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(77);
				match(SELECT);
				setState(80);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case ID_COMMA:
					{
					setState(78);
					columns();
					}
					break;
				case STAR:
					{
					setState(79);
					match(STAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(82);
				match(FROM);
				setState(83);
				match(ID);
				setState(84);
				order_by();
				}
				break;
			case 4:
				_localctx = new Select_where_order_itemsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(85);
				match(SELECT);
				setState(88);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ID:
				case ID_COMMA:
					{
					setState(86);
					columns();
					}
					break;
				case STAR:
					{
					setState(87);
					match(STAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(90);
				match(FROM);
				setState(91);
				match(ID);
				setState(92);
				where();
				setState(93);
				order_by();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_itemContext extends ParserRuleContext {
		public TerminalNode UPDATE() { return getToken(sqplGrammarParser.UPDATE, 0); }
		public TerminalNode ID() { return getToken(sqplGrammarParser.ID, 0); }
		public TerminalNode SET() { return getToken(sqplGrammarParser.SET, 0); }
		public List<EquationContext> equation() {
			return getRuleContexts(EquationContext.class);
		}
		public EquationContext equation(int i) {
			return getRuleContext(EquationContext.class,i);
		}
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public Update_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterUpdate_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitUpdate_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitUpdate_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_itemContext update_item() throws RecognitionException {
		Update_itemContext _localctx = new Update_itemContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_update_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(UPDATE);
			setState(98);
			match(ID);
			setState(99);
			match(SET);
			setState(100);
			equation();
			setState(107);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0 || _la==ID) {
				{
				{
				setState(102);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__0) {
					{
					setState(101);
					match(T__0);
					}
				}

				setState(104);
				equation();
				}
				}
				setState(109);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(110);
			where();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InsertContext extends ParserRuleContext {
		public TerminalNode INSERT_INTO() { return getToken(sqplGrammarParser.INSERT_INTO, 0); }
		public TerminalNode ID() { return getToken(sqplGrammarParser.ID, 0); }
		public List<ObjectContext> object() {
			return getRuleContexts(ObjectContext.class);
		}
		public ObjectContext object(int i) {
			return getRuleContext(ObjectContext.class,i);
		}
		public TerminalNode VALUES() { return getToken(sqplGrammarParser.VALUES, 0); }
		public InsertContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_insert; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterInsert(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitInsert(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitInsert(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InsertContext insert() throws RecognitionException {
		InsertContext _localctx = new InsertContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_insert);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(112);
			match(INSERT_INTO);
			setState(113);
			match(ID);
			setState(114);
			_la = _input.LA(1);
			if ( !(_la==T__1 || _la==T__2) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(115);
			object();
			setState(116);
			match(VALUES);
			setState(117);
			object();
			setState(122);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(118);
				match(T__3);
				setState(119);
				object();
				}
				}
				setState(124);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_itemContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(sqplGrammarParser.DELETE, 0); }
		public TerminalNode ID() { return getToken(sqplGrammarParser.ID, 0); }
		public WhereContext where() {
			return getRuleContext(WhereContext.class,0);
		}
		public Delete_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterDelete_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitDelete_item(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitDelete_item(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_itemContext delete_item() throws RecognitionException {
		Delete_itemContext _localctx = new Delete_itemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_delete_item);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(DELETE);
			setState(126);
			match(ID);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(127);
				where();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_tableContext extends ParserRuleContext {
		public TerminalNode CREATE_TABLE() { return getToken(sqplGrammarParser.CREATE_TABLE, 0); }
		public TerminalNode ID() { return getToken(sqplGrammarParser.ID, 0); }
		public DefinitionContext definition() {
			return getRuleContext(DefinitionContext.class,0);
		}
		public Create_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterCreate_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitCreate_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitCreate_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_tableContext create_table() throws RecognitionException {
		Create_tableContext _localctx = new Create_tableContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_create_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			match(CREATE_TABLE);
			setState(131);
			match(ID);
			setState(132);
			definition();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Describe_tableContext extends ParserRuleContext {
		public TerminalNode DESCRIBE() { return getToken(sqplGrammarParser.DESCRIBE, 0); }
		public TerminalNode ID() { return getToken(sqplGrammarParser.ID, 0); }
		public Describe_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_describe_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterDescribe_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitDescribe_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitDescribe_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Describe_tableContext describe_table() throws RecognitionException {
		Describe_tableContext _localctx = new Describe_tableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_describe_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(134);
			match(DESCRIBE);
			setState(135);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Update_tableContext extends ParserRuleContext {
		public Update_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update_table; }
	 
		public Update_tableContext() { }
		public void copyFrom(Update_tableContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Add_columnContext extends Update_tableContext {
		public TerminalNode ALTER_TABLE() { return getToken(sqplGrammarParser.ALTER_TABLE, 0); }
		public List<TerminalNode> ID() { return getTokens(sqplGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sqplGrammarParser.ID, i);
		}
		public TerminalNode ADD() { return getToken(sqplGrammarParser.ADD, 0); }
		public TerminalNode DATA_TYPE() { return getToken(sqplGrammarParser.DATA_TYPE, 0); }
		public ConstraintsContext constraints() {
			return getRuleContext(ConstraintsContext.class,0);
		}
		public Add_columnContext(Update_tableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterAdd_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitAdd_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitAdd_column(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Modify_columnContext extends Update_tableContext {
		public TerminalNode ALTER_TABLE() { return getToken(sqplGrammarParser.ALTER_TABLE, 0); }
		public List<TerminalNode> ID() { return getTokens(sqplGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sqplGrammarParser.ID, i);
		}
		public TerminalNode MODIFY() { return getToken(sqplGrammarParser.MODIFY, 0); }
		public TerminalNode DATA_TYPE() { return getToken(sqplGrammarParser.DATA_TYPE, 0); }
		public Modify_columnContext(Update_tableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterModify_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitModify_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitModify_column(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Drop_columnContext extends Update_tableContext {
		public TerminalNode ALTER_TABLE() { return getToken(sqplGrammarParser.ALTER_TABLE, 0); }
		public List<TerminalNode> ID() { return getTokens(sqplGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sqplGrammarParser.ID, i);
		}
		public TerminalNode DROP_COLUMN() { return getToken(sqplGrammarParser.DROP_COLUMN, 0); }
		public Drop_columnContext(Update_tableContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterDrop_column(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitDrop_column(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitDrop_column(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Update_tableContext update_table() throws RecognitionException {
		Update_tableContext _localctx = new Update_tableContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_update_table);
		try {
			setState(152);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				_localctx = new Add_columnContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(137);
				match(ALTER_TABLE);
				setState(138);
				match(ID);
				setState(139);
				match(ADD);
				setState(140);
				match(ID);
				setState(141);
				match(DATA_TYPE);
				setState(142);
				constraints();
				}
				break;
			case 2:
				_localctx = new Modify_columnContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(143);
				match(ALTER_TABLE);
				setState(144);
				match(ID);
				setState(145);
				match(MODIFY);
				setState(146);
				match(ID);
				setState(147);
				match(DATA_TYPE);
				}
				break;
			case 3:
				_localctx = new Drop_columnContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(148);
				match(ALTER_TABLE);
				setState(149);
				match(ID);
				setState(150);
				match(DROP_COLUMN);
				setState(151);
				match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Delete_tableContext extends ParserRuleContext {
		public TerminalNode DELETE_TABLE() { return getToken(sqplGrammarParser.DELETE_TABLE, 0); }
		public TerminalNode ID() { return getToken(sqplGrammarParser.ID, 0); }
		public Delete_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delete_table; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterDelete_table(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitDelete_table(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitDelete_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Delete_tableContext delete_table() throws RecognitionException {
		Delete_tableContext _localctx = new Delete_tableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_delete_table);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			match(DELETE_TABLE);
			setState(155);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Create_dbContext extends ParserRuleContext {
		public TerminalNode CREATE_DB() { return getToken(sqplGrammarParser.CREATE_DB, 0); }
		public TerminalNode ID() { return getToken(sqplGrammarParser.ID, 0); }
		public Create_dbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_create_db; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterCreate_db(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitCreate_db(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitCreate_db(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Create_dbContext create_db() throws RecognitionException {
		Create_dbContext _localctx = new Create_dbContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_create_db);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(157);
			match(CREATE_DB);
			setState(158);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Drop_dbContext extends ParserRuleContext {
		public TerminalNode DROP_DB() { return getToken(sqplGrammarParser.DROP_DB, 0); }
		public TerminalNode ID() { return getToken(sqplGrammarParser.ID, 0); }
		public Drop_dbContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_drop_db; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterDrop_db(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitDrop_db(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitDrop_db(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Drop_dbContext drop_db() throws RecognitionException {
		Drop_dbContext _localctx = new Drop_dbContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_drop_db);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(DROP_DB);
			setState(161);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WhereContext extends ParserRuleContext {
		public TerminalNode WHERE() { return getToken(sqplGrammarParser.WHERE, 0); }
		public List<ConditionContext> condition() {
			return getRuleContexts(ConditionContext.class);
		}
		public ConditionContext condition(int i) {
			return getRuleContext(ConditionContext.class,i);
		}
		public WhereContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterWhere(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitWhere(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitWhere(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhereContext where() throws RecognitionException {
		WhereContext _localctx = new WhereContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_where);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(WHERE);
			setState(164);
			condition();
			setState(169);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(165);
				match(T__0);
				setState(166);
				condition();
				}
				}
				setState(171);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class Order_byContext extends ParserRuleContext {
		public TerminalNode ORDER_BY() { return getToken(sqplGrammarParser.ORDER_BY, 0); }
		public List<TerminalNode> ID() { return getTokens(sqplGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sqplGrammarParser.ID, i);
		}
		public List<TerminalNode> ASC() { return getTokens(sqplGrammarParser.ASC); }
		public TerminalNode ASC(int i) {
			return getToken(sqplGrammarParser.ASC, i);
		}
		public List<TerminalNode> DESC() { return getTokens(sqplGrammarParser.DESC); }
		public TerminalNode DESC(int i) {
			return getToken(sqplGrammarParser.DESC, i);
		}
		public Order_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterOrder_by(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitOrder_by(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitOrder_by(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_byContext order_by() throws RecognitionException {
		Order_byContext _localctx = new Order_byContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_order_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(ORDER_BY);
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				match(ID);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ASC || _la==DESC) {
					{
					setState(174);
					_la = _input.LA(1);
					if ( !(_la==ASC || _la==DESC) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ObjectContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(sqplGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sqplGrammarParser.ID, i);
		}
		public List<TerminalNode> ID_COMMA() { return getTokens(sqplGrammarParser.ID_COMMA); }
		public TerminalNode ID_COMMA(int i) {
			return getToken(sqplGrammarParser.ID_COMMA, i);
		}
		public List<TerminalNode> INT() { return getTokens(sqplGrammarParser.INT); }
		public TerminalNode INT(int i) {
			return getToken(sqplGrammarParser.INT, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(sqplGrammarParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(sqplGrammarParser.DOUBLE, i);
		}
		public List<TerminalNode> TEXT() { return getTokens(sqplGrammarParser.TEXT); }
		public TerminalNode TEXT(int i) {
			return getToken(sqplGrammarParser.TEXT, i);
		}
		public ObjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_object; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitObject(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitObject(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ObjectContext object() throws RecognitionException {
		ObjectContext _localctx = new ObjectContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_object);
		int _la;
		try {
			int _alt;
			setState(200);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(181);
				match(T__4);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==ID_COMMA) {
					{
					{
					setState(182);
					match(ID_COMMA);
					}
					}
					setState(187);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(188);
				match(ID);
				setState(189);
				match(T__5);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(190);
				match(T__4);
				setState(195);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(191);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31336081391616L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(192);
						match(T__3);
						}
						} 
					}
					setState(197);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
				}
				setState(198);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31336081391616L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(199);
				match(T__5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefinitionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(sqplGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sqplGrammarParser.ID, i);
		}
		public List<TerminalNode> AS() { return getTokens(sqplGrammarParser.AS); }
		public TerminalNode AS(int i) {
			return getToken(sqplGrammarParser.AS, i);
		}
		public List<TerminalNode> DATA_TYPE() { return getTokens(sqplGrammarParser.DATA_TYPE); }
		public TerminalNode DATA_TYPE(int i) {
			return getToken(sqplGrammarParser.DATA_TYPE, i);
		}
		public List<ConstraintsContext> constraints() {
			return getRuleContexts(ConstraintsContext.class);
		}
		public ConstraintsContext constraints(int i) {
			return getRuleContext(ConstraintsContext.class,i);
		}
		public DefinitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterDefinition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitDefinition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitDefinition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefinitionContext definition() throws RecognitionException {
		DefinitionContext _localctx = new DefinitionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_definition);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(202);
			match(T__4);
			setState(211);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(203);
					match(ID);
					setState(204);
					match(AS);
					setState(205);
					match(DATA_TYPE);
					setState(206);
					constraints();
					setState(207);
					match(T__3);
					}
					} 
				}
				setState(213);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,18,_ctx);
			}
			setState(214);
			match(ID);
			setState(215);
			match(AS);
			setState(216);
			match(DATA_TYPE);
			setState(217);
			constraints();
			setState(218);
			match(T__5);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnsContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(sqplGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sqplGrammarParser.ID, i);
		}
		public List<TerminalNode> ID_COMMA() { return getTokens(sqplGrammarParser.ID_COMMA); }
		public TerminalNode ID_COMMA(int i) {
			return getToken(sqplGrammarParser.ID_COMMA, i);
		}
		public ColumnsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columns; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitColumns(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnsContext columns() throws RecognitionException {
		ColumnsContext _localctx = new ColumnsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_columns);
		int _la;
		try {
			setState(239);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(221); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(220);
					match(ID);
					}
					}
					setState(223); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID );
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(226); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(225);
					match(ID_COMMA);
					}
					}
					setState(228); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID_COMMA );
				setState(230);
				match(ID);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(231);
					match(ID_COMMA);
					}
					}
					setState(234); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==ID_COMMA );
				setState(236);
				match(ID);
				{
				setState(237);
				_la = _input.LA(1);
				if ( !(_la==T__0 || _la==T__6) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(238);
				match(ID);
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EquationContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(sqplGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sqplGrammarParser.ID, i);
		}
		public TerminalNode INT() { return getToken(sqplGrammarParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(sqplGrammarParser.DOUBLE, 0); }
		public TerminalNode TEXT() { return getToken(sqplGrammarParser.TEXT, 0); }
		public EquationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_equation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterEquation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitEquation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitEquation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EquationContext equation() throws RecognitionException {
		EquationContext _localctx = new EquationContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_equation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(241);
			match(ID);
			setState(242);
			match(T__7);
			setState(243);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31336081391616L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(sqplGrammarParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(sqplGrammarParser.ID, i);
		}
		public TerminalNode SIGN() { return getToken(sqplGrammarParser.SIGN, 0); }
		public TerminalNode INT() { return getToken(sqplGrammarParser.INT, 0); }
		public TerminalNode DOUBLE() { return getToken(sqplGrammarParser.DOUBLE, 0); }
		public TerminalNode TEXT() { return getToken(sqplGrammarParser.TEXT, 0); }
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(ID);
			setState(246);
			match(SIGN);
			setState(247);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 31336081391616L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintsContext extends ParserRuleContext {
		public List<TerminalNode> PRIMARY_KEY() { return getTokens(sqplGrammarParser.PRIMARY_KEY); }
		public TerminalNode PRIMARY_KEY(int i) {
			return getToken(sqplGrammarParser.PRIMARY_KEY, i);
		}
		public List<TerminalNode> FOREIGN_KEY() { return getTokens(sqplGrammarParser.FOREIGN_KEY); }
		public TerminalNode FOREIGN_KEY(int i) {
			return getToken(sqplGrammarParser.FOREIGN_KEY, i);
		}
		public List<TerminalNode> UNIQUE() { return getTokens(sqplGrammarParser.UNIQUE); }
		public TerminalNode UNIQUE(int i) {
			return getToken(sqplGrammarParser.UNIQUE, i);
		}
		public List<TerminalNode> NOT_NULL() { return getTokens(sqplGrammarParser.NOT_NULL); }
		public TerminalNode NOT_NULL(int i) {
			return getToken(sqplGrammarParser.NOT_NULL, i);
		}
		public List<TerminalNode> DEFAULT() { return getTokens(sqplGrammarParser.DEFAULT); }
		public TerminalNode DEFAULT(int i) {
			return getToken(sqplGrammarParser.DEFAULT, i);
		}
		public ConstraintsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraints; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).enterConstraints(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof sqplGrammarListener ) ((sqplGrammarListener)listener).exitConstraints(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof sqplGrammarVisitor ) return ((sqplGrammarVisitor<? extends T>)visitor).visitConstraints(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintsContext constraints() throws RecognitionException {
		ConstraintsContext _localctx = new ConstraintsContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_constraints);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 532575944704L) != 0)) {
				{
				{
				setState(249);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 532575944704L) != 0)) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(254);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001-\u0100\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000\u0001\u0000\u0005\u0000"+
		",\b\u0000\n\u0000\f\u0000/\t\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001=\b\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002B\b\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002I\b\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002"+
		"Q\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0003\u0002Y\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0003\u0002`\b\u0002\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003g\b\u0003\u0001\u0003"+
		"\u0005\u0003j\b\u0003\n\u0003\f\u0003m\t\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004y\b\u0004\n\u0004\f\u0004|\t\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u0081\b\u0005\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0003\b\u0099\b\b\u0001"+
		"\t\u0001\t\u0001\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u00a8\b\f\n\f\f\f\u00ab"+
		"\t\f\u0001\r\u0001\r\u0001\r\u0003\r\u00b0\b\r\u0004\r\u00b2\b\r\u000b"+
		"\r\f\r\u00b3\u0001\u000e\u0001\u000e\u0005\u000e\u00b8\b\u000e\n\u000e"+
		"\f\u000e\u00bb\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0005\u000e\u00c2\b\u000e\n\u000e\f\u000e\u00c5\t\u000e\u0001"+
		"\u000e\u0001\u000e\u0003\u000e\u00c9\b\u000e\u0001\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0005\u000f\u00d2"+
		"\b\u000f\n\u000f\f\u000f\u00d5\t\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0004\u0010\u00de\b\u0010"+
		"\u000b\u0010\f\u0010\u00df\u0001\u0010\u0004\u0010\u00e3\b\u0010\u000b"+
		"\u0010\f\u0010\u00e4\u0001\u0010\u0001\u0010\u0004\u0010\u00e9\b\u0010"+
		"\u000b\u0010\f\u0010\u00ea\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010"+
		"\u00f0\b\u0010\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0012"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0005\u0013\u00fb\b\u0013"+
		"\n\u0013\f\u0013\u00fe\t\u0013\u0001\u0013\u0000\u0000\u0014\u0000\u0002"+
		"\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c\u001e"+
		" \"$&\u0000\u0005\u0001\u0000\u0002\u0003\u0001\u0000\u0018\u0019\u0002"+
		"\u0000\'\'*,\u0002\u0000\u0001\u0001\u0007\u0007\u0001\u0000\"&\u010f"+
		"\u0000-\u0001\u0000\u0000\u0000\u0002<\u0001\u0000\u0000\u0000\u0004_"+
		"\u0001\u0000\u0000\u0000\u0006a\u0001\u0000\u0000\u0000\bp\u0001\u0000"+
		"\u0000\u0000\n}\u0001\u0000\u0000\u0000\f\u0082\u0001\u0000\u0000\u0000"+
		"\u000e\u0086\u0001\u0000\u0000\u0000\u0010\u0098\u0001\u0000\u0000\u0000"+
		"\u0012\u009a\u0001\u0000\u0000\u0000\u0014\u009d\u0001\u0000\u0000\u0000"+
		"\u0016\u00a0\u0001\u0000\u0000\u0000\u0018\u00a3\u0001\u0000\u0000\u0000"+
		"\u001a\u00ac\u0001\u0000\u0000\u0000\u001c\u00c8\u0001\u0000\u0000\u0000"+
		"\u001e\u00ca\u0001\u0000\u0000\u0000 \u00ef\u0001\u0000\u0000\u0000\""+
		"\u00f1\u0001\u0000\u0000\u0000$\u00f5\u0001\u0000\u0000\u0000&\u00fc\u0001"+
		"\u0000\u0000\u0000()\u0003\u0002\u0001\u0000)*\u0005)\u0000\u0000*,\u0001"+
		"\u0000\u0000\u0000+(\u0001\u0000\u0000\u0000,/\u0001\u0000\u0000\u0000"+
		"-+\u0001\u0000\u0000\u0000-.\u0001\u0000\u0000\u0000.0\u0001\u0000\u0000"+
		"\u0000/-\u0001\u0000\u0000\u000001\u0005\u0000\u0000\u00011\u0001\u0001"+
		"\u0000\u0000\u00002=\u0003\u0004\u0002\u00003=\u0003\u0006\u0003\u0000"+
		"4=\u0003\b\u0004\u00005=\u0003\n\u0005\u00006=\u0003\f\u0006\u00007=\u0003"+
		"\u000e\u0007\u00008=\u0003\u0010\b\u00009=\u0003\u0012\t\u0000:=\u0003"+
		"\u0014\n\u0000;=\u0003\u0016\u000b\u0000<2\u0001\u0000\u0000\u0000<3\u0001"+
		"\u0000\u0000\u0000<4\u0001\u0000\u0000\u0000<5\u0001\u0000\u0000\u0000"+
		"<6\u0001\u0000\u0000\u0000<7\u0001\u0000\u0000\u0000<8\u0001\u0000\u0000"+
		"\u0000<9\u0001\u0000\u0000\u0000<:\u0001\u0000\u0000\u0000<;\u0001\u0000"+
		"\u0000\u0000=\u0003\u0001\u0000\u0000\u0000>A\u0005\t\u0000\u0000?B\u0003"+
		" \u0010\u0000@B\u0005 \u0000\u0000A?\u0001\u0000\u0000\u0000A@\u0001\u0000"+
		"\u0000\u0000BC\u0001\u0000\u0000\u0000CD\u0005\u0015\u0000\u0000D`\u0005"+
		"\'\u0000\u0000EH\u0005\t\u0000\u0000FI\u0003 \u0010\u0000GI\u0005 \u0000"+
		"\u0000HF\u0001\u0000\u0000\u0000HG\u0001\u0000\u0000\u0000IJ\u0001\u0000"+
		"\u0000\u0000JK\u0005\u0015\u0000\u0000KL\u0005\'\u0000\u0000L`\u0003\u0018"+
		"\f\u0000MP\u0005\t\u0000\u0000NQ\u0003 \u0010\u0000OQ\u0005 \u0000\u0000"+
		"PN\u0001\u0000\u0000\u0000PO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RS\u0005\u0015\u0000\u0000ST\u0005\'\u0000\u0000T`\u0003\u001a\r"+
		"\u0000UX\u0005\t\u0000\u0000VY\u0003 \u0010\u0000WY\u0005 \u0000\u0000"+
		"XV\u0001\u0000\u0000\u0000XW\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000"+
		"\u0000Z[\u0005\u0015\u0000\u0000[\\\u0005\'\u0000\u0000\\]\u0003\u0018"+
		"\f\u0000]^\u0003\u001a\r\u0000^`\u0001\u0000\u0000\u0000_>\u0001\u0000"+
		"\u0000\u0000_E\u0001\u0000\u0000\u0000_M\u0001\u0000\u0000\u0000_U\u0001"+
		"\u0000\u0000\u0000`\u0005\u0001\u0000\u0000\u0000ab\u0005\f\u0000\u0000"+
		"bc\u0005\'\u0000\u0000cd\u0005\u0014\u0000\u0000dk\u0003\"\u0011\u0000"+
		"eg\u0005\u0001\u0000\u0000fe\u0001\u0000\u0000\u0000fg\u0001\u0000\u0000"+
		"\u0000gh\u0001\u0000\u0000\u0000hj\u0003\"\u0011\u0000if\u0001\u0000\u0000"+
		"\u0000jm\u0001\u0000\u0000\u0000ki\u0001\u0000\u0000\u0000kl\u0001\u0000"+
		"\u0000\u0000ln\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000\u0000no\u0003"+
		"\u0018\f\u0000o\u0007\u0001\u0000\u0000\u0000pq\u0005\u000b\u0000\u0000"+
		"qr\u0005\'\u0000\u0000rs\u0007\u0000\u0000\u0000st\u0003\u001c\u000e\u0000"+
		"tu\u0005\u001a\u0000\u0000uz\u0003\u001c\u000e\u0000vw\u0005\u0004\u0000"+
		"\u0000wy\u0003\u001c\u000e\u0000xv\u0001\u0000\u0000\u0000y|\u0001\u0000"+
		"\u0000\u0000zx\u0001\u0000\u0000\u0000z{\u0001\u0000\u0000\u0000{\t\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000}~\u0005\r\u0000\u0000~\u0080"+
		"\u0005\'\u0000\u0000\u007f\u0081\u0003\u0018\f\u0000\u0080\u007f\u0001"+
		"\u0000\u0000\u0000\u0080\u0081\u0001\u0000\u0000\u0000\u0081\u000b\u0001"+
		"\u0000\u0000\u0000\u0082\u0083\u0005\u000e\u0000\u0000\u0083\u0084\u0005"+
		"\'\u0000\u0000\u0084\u0085\u0003\u001e\u000f\u0000\u0085\r\u0001\u0000"+
		"\u0000\u0000\u0086\u0087\u0005\u0010\u0000\u0000\u0087\u0088\u0005\'\u0000"+
		"\u0000\u0088\u000f\u0001\u0000\u0000\u0000\u0089\u008a\u0005\u0011\u0000"+
		"\u0000\u008a\u008b\u0005\'\u0000\u0000\u008b\u008c\u0005\u001b\u0000\u0000"+
		"\u008c\u008d\u0005\'\u0000\u0000\u008d\u008e\u0005!\u0000\u0000\u008e"+
		"\u0099\u0003&\u0013\u0000\u008f\u0090\u0005\u0011\u0000\u0000\u0090\u0091"+
		"\u0005\'\u0000\u0000\u0091\u0092\u0005\u001c\u0000\u0000\u0092\u0093\u0005"+
		"\'\u0000\u0000\u0093\u0099\u0005!\u0000\u0000\u0094\u0095\u0005\u0011"+
		"\u0000\u0000\u0095\u0096\u0005\'\u0000\u0000\u0096\u0097\u0005\u001d\u0000"+
		"\u0000\u0097\u0099\u0005\'\u0000\u0000\u0098\u0089\u0001\u0000\u0000\u0000"+
		"\u0098\u008f\u0001\u0000\u0000\u0000\u0098\u0094\u0001\u0000\u0000\u0000"+
		"\u0099\u0011\u0001\u0000\u0000\u0000\u009a\u009b\u0005\u000f\u0000\u0000"+
		"\u009b\u009c\u0005\'\u0000\u0000\u009c\u0013\u0001\u0000\u0000\u0000\u009d"+
		"\u009e\u0005\u0012\u0000\u0000\u009e\u009f\u0005\'\u0000\u0000\u009f\u0015"+
		"\u0001\u0000\u0000\u0000\u00a0\u00a1\u0005\u0013\u0000\u0000\u00a1\u00a2"+
		"\u0005\'\u0000\u0000\u00a2\u0017\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005"+
		"\u0016\u0000\u0000\u00a4\u00a9\u0003$\u0012\u0000\u00a5\u00a6\u0005\u0001"+
		"\u0000\u0000\u00a6\u00a8\u0003$\u0012\u0000\u00a7\u00a5\u0001\u0000\u0000"+
		"\u0000\u00a8\u00ab\u0001\u0000\u0000\u0000\u00a9\u00a7\u0001\u0000\u0000"+
		"\u0000\u00a9\u00aa\u0001\u0000\u0000\u0000\u00aa\u0019\u0001\u0000\u0000"+
		"\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ac\u00b1\u0005\u0017\u0000"+
		"\u0000\u00ad\u00af\u0005\'\u0000\u0000\u00ae\u00b0\u0007\u0001\u0000\u0000"+
		"\u00af\u00ae\u0001\u0000\u0000\u0000\u00af\u00b0\u0001\u0000\u0000\u0000"+
		"\u00b0\u00b2\u0001\u0000\u0000\u0000\u00b1\u00ad\u0001\u0000\u0000\u0000"+
		"\u00b2\u00b3\u0001\u0000\u0000\u0000\u00b3\u00b1\u0001\u0000\u0000\u0000"+
		"\u00b3\u00b4\u0001\u0000\u0000\u0000\u00b4\u001b\u0001\u0000\u0000\u0000"+
		"\u00b5\u00b9\u0005\u0005\u0000\u0000\u00b6\u00b8\u0005(\u0000\u0000\u00b7"+
		"\u00b6\u0001\u0000\u0000\u0000\u00b8\u00bb\u0001\u0000\u0000\u0000\u00b9"+
		"\u00b7\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000\u0000\u00ba"+
		"\u00bc\u0001\u0000\u0000\u0000\u00bb\u00b9\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0005\'\u0000\u0000\u00bd\u00c9\u0005\u0006\u0000\u0000\u00be\u00c3"+
		"\u0005\u0005\u0000\u0000\u00bf\u00c0\u0007\u0002\u0000\u0000\u00c0\u00c2"+
		"\u0005\u0004\u0000\u0000\u00c1\u00bf\u0001\u0000\u0000\u0000\u00c2\u00c5"+
		"\u0001\u0000\u0000\u0000\u00c3\u00c1\u0001\u0000\u0000\u0000\u00c3\u00c4"+
		"\u0001\u0000\u0000\u0000\u00c4\u00c6\u0001\u0000\u0000\u0000\u00c5\u00c3"+
		"\u0001\u0000\u0000\u0000\u00c6\u00c7\u0007\u0002\u0000\u0000\u00c7\u00c9"+
		"\u0005\u0006\u0000\u0000\u00c8\u00b5\u0001\u0000\u0000\u0000\u00c8\u00be"+
		"\u0001\u0000\u0000\u0000\u00c9\u001d\u0001\u0000\u0000\u0000\u00ca\u00d3"+
		"\u0005\u0005\u0000\u0000\u00cb\u00cc\u0005\'\u0000\u0000\u00cc\u00cd\u0005"+
		"\u001e\u0000\u0000\u00cd\u00ce\u0005!\u0000\u0000\u00ce\u00cf\u0003&\u0013"+
		"\u0000\u00cf\u00d0\u0005\u0004\u0000\u0000\u00d0\u00d2\u0001\u0000\u0000"+
		"\u0000\u00d1\u00cb\u0001\u0000\u0000\u0000\u00d2\u00d5\u0001\u0000\u0000"+
		"\u0000\u00d3\u00d1\u0001\u0000\u0000\u0000\u00d3\u00d4\u0001\u0000\u0000"+
		"\u0000\u00d4\u00d6\u0001\u0000\u0000\u0000\u00d5\u00d3\u0001\u0000\u0000"+
		"\u0000\u00d6\u00d7\u0005\'\u0000\u0000\u00d7\u00d8\u0005\u001e\u0000\u0000"+
		"\u00d8\u00d9\u0005!\u0000\u0000\u00d9\u00da\u0003&\u0013\u0000\u00da\u00db"+
		"\u0005\u0006\u0000\u0000\u00db\u001f\u0001\u0000\u0000\u0000\u00dc\u00de"+
		"\u0005\'\u0000\u0000\u00dd\u00dc\u0001\u0000\u0000\u0000\u00de\u00df\u0001"+
		"\u0000\u0000\u0000\u00df\u00dd\u0001\u0000\u0000\u0000\u00df\u00e0\u0001"+
		"\u0000\u0000\u0000\u00e0\u00f0\u0001\u0000\u0000\u0000\u00e1\u00e3\u0005"+
		"(\u0000\u0000\u00e2\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000"+
		"\u0000\u0000\u00e4\u00e2\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000"+
		"\u0000\u0000\u00e5\u00e6\u0001\u0000\u0000\u0000\u00e6\u00f0\u0005\'\u0000"+
		"\u0000\u00e7\u00e9\u0005(\u0000\u0000\u00e8\u00e7\u0001\u0000\u0000\u0000"+
		"\u00e9\u00ea\u0001\u0000\u0000\u0000\u00ea\u00e8\u0001\u0000\u0000\u0000"+
		"\u00ea\u00eb\u0001\u0000\u0000\u0000\u00eb\u00ec\u0001\u0000\u0000\u0000"+
		"\u00ec\u00ed\u0005\'\u0000\u0000\u00ed\u00ee\u0007\u0003\u0000\u0000\u00ee"+
		"\u00f0\u0005\'\u0000\u0000\u00ef\u00dd\u0001\u0000\u0000\u0000\u00ef\u00e2"+
		"\u0001\u0000\u0000\u0000\u00ef\u00e8\u0001\u0000\u0000\u0000\u00f0!\u0001"+
		"\u0000\u0000\u0000\u00f1\u00f2\u0005\'\u0000\u0000\u00f2\u00f3\u0005\b"+
		"\u0000\u0000\u00f3\u00f4\u0007\u0002\u0000\u0000\u00f4#\u0001\u0000\u0000"+
		"\u0000\u00f5\u00f6\u0005\'\u0000\u0000\u00f6\u00f7\u0005\u001f\u0000\u0000"+
		"\u00f7\u00f8\u0007\u0002\u0000\u0000\u00f8%\u0001\u0000\u0000\u0000\u00f9"+
		"\u00fb\u0007\u0004\u0000\u0000\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb"+
		"\u00fe\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc"+
		"\u00fd\u0001\u0000\u0000\u0000\u00fd\'\u0001\u0000\u0000\u0000\u00fe\u00fc"+
		"\u0001\u0000\u0000\u0000\u0018-<AHPX_fkz\u0080\u0098\u00a9\u00af\u00b3"+
		"\u00b9\u00c3\u00c8\u00d3\u00df\u00e4\u00ea\u00ef\u00fc";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}