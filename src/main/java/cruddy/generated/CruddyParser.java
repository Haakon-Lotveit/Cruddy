// Generated from Cruddy by ANTLR 4.7
package cruddy.generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CruddyParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		TYPE_LITERAL=10, FIELDS_LITERAL=11, READERS_LITERAL=12, DELETERS_LITERAL=13, 
		QUERY_LITERAL=14, ARGS_LITERAL=15, LT=16, GT=17, LPAREN=18, RPAREN=19, 
		COLON=20, QUOTE=21, STRING_LITERAL=22, CLASSNAME_TOKEN=23, IDENTIFIER_TOKEN=24, 
		WS=25;
	public static final int
		RULE_crudExpression = 0, RULE_typeName = 1, RULE_fields = 2, RULE_readers = 3, 
		RULE_deleters = 4, RULE_fieldDeclaration = 5, RULE_readerDeclaration = 6, 
		RULE_deleterDeclaration = 7, RULE_query = 8, RULE_variable = 9, RULE_fieldType = 10, 
		RULE_objectIdentifier = 11, RULE_primitiveType = 12, RULE_fieldName = 13, 
		RULE_fieldDBKey = 14, RULE_genericType = 15;
	public static final String[] ruleNames = {
		"crudExpression", "typeName", "fields", "readers", "deleters", "fieldDeclaration", 
		"readerDeclaration", "deleterDeclaration", "query", "variable", "fieldType", 
		"objectIdentifier", "primitiveType", "fieldName", "fieldDBKey", "genericType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'boolean'", "'byte'", "'char'", "'short'", "'int'", "'long'", 
		"'float'", "'double'", "'type'", "'fields'", "'readers'", "'deleters'", 
		"'query'", "'args'", "'<'", "'>'", "'('", "')'", "':'", "'\"'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, "TYPE_LITERAL", 
		"FIELDS_LITERAL", "READERS_LITERAL", "DELETERS_LITERAL", "QUERY_LITERAL", 
		"ARGS_LITERAL", "LT", "GT", "LPAREN", "RPAREN", "COLON", "QUOTE", "STRING_LITERAL", 
		"CLASSNAME_TOKEN", "IDENTIFIER_TOKEN", "WS"
	};
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
	public String getGrammarFileName() { return "Cruddy"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CruddyParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CrudExpressionContext extends ParserRuleContext {
		public TerminalNode TYPE_LITERAL() { return getToken(CruddyParser.TYPE_LITERAL, 0); }
		public TypeNameContext typeName() {
			return getRuleContext(TypeNameContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(CruddyParser.LPAREN, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public ReadersContext readers() {
			return getRuleContext(ReadersContext.class,0);
		}
		public DeletersContext deleters() {
			return getRuleContext(DeletersContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(CruddyParser.RPAREN, 0); }
		public CrudExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_crudExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).enterCrudExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).exitCrudExpression(this);
		}
	}

	public final CrudExpressionContext crudExpression() throws RecognitionException {
		CrudExpressionContext _localctx = new CrudExpressionContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_crudExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(32);
			match(TYPE_LITERAL);
			setState(33);
			typeName();
			setState(34);
			match(LPAREN);
			setState(35);
			fields();
			setState(36);
			readers();
			setState(37);
			deleters();
			setState(38);
			match(RPAREN);
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

	public static class TypeNameContext extends ParserRuleContext {
		public TerminalNode CLASSNAME_TOKEN() { return getToken(CruddyParser.CLASSNAME_TOKEN, 0); }
		public TypeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).enterTypeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).exitTypeName(this);
		}
	}

	public final TypeNameContext typeName() throws RecognitionException {
		TypeNameContext _localctx = new TypeNameContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_typeName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(40);
			match(CLASSNAME_TOKEN);
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

	public static class FieldsContext extends ParserRuleContext {
		public TerminalNode FIELDS_LITERAL() { return getToken(CruddyParser.FIELDS_LITERAL, 0); }
		public TerminalNode LPAREN() { return getToken(CruddyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CruddyParser.RPAREN, 0); }
		public List<FieldDeclarationContext> fieldDeclaration() {
			return getRuleContexts(FieldDeclarationContext.class);
		}
		public FieldDeclarationContext fieldDeclaration(int i) {
			return getRuleContext(FieldDeclarationContext.class,i);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).exitFields(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fields);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(FIELDS_LITERAL);
			setState(43);
			match(LPAREN);
			setState(45); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(44);
				fieldDeclaration();
				}
				}
				setState(47); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << CLASSNAME_TOKEN) | (1L << IDENTIFIER_TOKEN))) != 0) );
			setState(49);
			match(RPAREN);
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

	public static class ReadersContext extends ParserRuleContext {
		public TerminalNode READERS_LITERAL() { return getToken(CruddyParser.READERS_LITERAL, 0); }
		public TerminalNode LPAREN() { return getToken(CruddyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CruddyParser.RPAREN, 0); }
		public List<ReaderDeclarationContext> readerDeclaration() {
			return getRuleContexts(ReaderDeclarationContext.class);
		}
		public ReaderDeclarationContext readerDeclaration(int i) {
			return getRuleContext(ReaderDeclarationContext.class,i);
		}
		public ReadersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readers; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).enterReaders(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).exitReaders(this);
		}
	}

	public final ReadersContext readers() throws RecognitionException {
		ReadersContext _localctx = new ReadersContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_readers);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(51);
			match(READERS_LITERAL);
			setState(52);
			match(LPAREN);
			setState(54); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(53);
				readerDeclaration();
				}
				}
				setState(56); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER_TOKEN );
			setState(58);
			match(RPAREN);
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

	public static class DeletersContext extends ParserRuleContext {
		public TerminalNode DELETERS_LITERAL() { return getToken(CruddyParser.DELETERS_LITERAL, 0); }
		public TerminalNode LPAREN() { return getToken(CruddyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CruddyParser.RPAREN, 0); }
		public List<DeleterDeclarationContext> deleterDeclaration() {
			return getRuleContexts(DeleterDeclarationContext.class);
		}
		public DeleterDeclarationContext deleterDeclaration(int i) {
			return getRuleContext(DeleterDeclarationContext.class,i);
		}
		public DeletersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleters; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).enterDeleters(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).exitDeleters(this);
		}
	}

	public final DeletersContext deleters() throws RecognitionException {
		DeletersContext _localctx = new DeletersContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_deleters);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(DELETERS_LITERAL);
			setState(61);
			match(LPAREN);
			setState(63); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(62);
				deleterDeclaration();
				}
				}
				setState(65); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER_TOKEN );
			setState(67);
			match(RPAREN);
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

	public static class FieldDeclarationContext extends ParserRuleContext {
		public FieldTypeContext fieldType() {
			return getRuleContext(FieldTypeContext.class,0);
		}
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public FieldDBKeyContext fieldDBKey() {
			return getRuleContext(FieldDBKeyContext.class,0);
		}
		public FieldDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).enterFieldDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).exitFieldDeclaration(this);
		}
	}

	public final FieldDeclarationContext fieldDeclaration() throws RecognitionException {
		FieldDeclarationContext _localctx = new FieldDeclarationContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_fieldDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			fieldType();
			setState(70);
			fieldName();
			setState(71);
			fieldDBKey();
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

	public static class ReaderDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_TOKEN() { return getToken(CruddyParser.IDENTIFIER_TOKEN, 0); }
		public List<TerminalNode> COLON() { return getTokens(CruddyParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CruddyParser.COLON, i);
		}
		public TerminalNode QUERY_LITERAL() { return getToken(CruddyParser.QUERY_LITERAL, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode ARGS_LITERAL() { return getToken(CruddyParser.ARGS_LITERAL, 0); }
		public TerminalNode LPAREN() { return getToken(CruddyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CruddyParser.RPAREN, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public ReaderDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_readerDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).enterReaderDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).exitReaderDeclaration(this);
		}
	}

	public final ReaderDeclarationContext readerDeclaration() throws RecognitionException {
		ReaderDeclarationContext _localctx = new ReaderDeclarationContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_readerDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(IDENTIFIER_TOKEN);
			setState(74);
			match(COLON);
			setState(75);
			match(QUERY_LITERAL);
			setState(76);
			match(COLON);
			setState(77);
			query();
			setState(78);
			match(ARGS_LITERAL);
			setState(79);
			match(COLON);
			setState(80);
			match(LPAREN);
			setState(82); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(81);
				variable();
				}
				}
				setState(84); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << CLASSNAME_TOKEN) | (1L << IDENTIFIER_TOKEN))) != 0) );
			setState(86);
			match(RPAREN);
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

	public static class DeleterDeclarationContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_TOKEN() { return getToken(CruddyParser.IDENTIFIER_TOKEN, 0); }
		public List<TerminalNode> COLON() { return getTokens(CruddyParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(CruddyParser.COLON, i);
		}
		public TerminalNode QUERY_LITERAL() { return getToken(CruddyParser.QUERY_LITERAL, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode ARGS_LITERAL() { return getToken(CruddyParser.ARGS_LITERAL, 0); }
		public TerminalNode LPAREN() { return getToken(CruddyParser.LPAREN, 0); }
		public TerminalNode RPAREN() { return getToken(CruddyParser.RPAREN, 0); }
		public List<VariableContext> variable() {
			return getRuleContexts(VariableContext.class);
		}
		public VariableContext variable(int i) {
			return getRuleContext(VariableContext.class,i);
		}
		public DeleterDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_deleterDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).enterDeleterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).exitDeleterDeclaration(this);
		}
	}

	public final DeleterDeclarationContext deleterDeclaration() throws RecognitionException {
		DeleterDeclarationContext _localctx = new DeleterDeclarationContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_deleterDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(88);
			match(IDENTIFIER_TOKEN);
			setState(89);
			match(COLON);
			setState(90);
			match(QUERY_LITERAL);
			setState(91);
			match(COLON);
			setState(92);
			query();
			setState(93);
			match(ARGS_LITERAL);
			setState(94);
			match(COLON);
			setState(95);
			match(LPAREN);
			setState(97); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(96);
				variable();
				}
				}
				setState(99); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8) | (1L << CLASSNAME_TOKEN) | (1L << IDENTIFIER_TOKEN))) != 0) );
			setState(101);
			match(RPAREN);
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

	public static class QueryContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(CruddyParser.STRING_LITERAL, 0); }
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).exitQuery(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_query);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(103);
			match(STRING_LITERAL);
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

	public static class VariableContext extends ParserRuleContext {
		public FieldTypeContext fieldType() {
			return getRuleContext(FieldTypeContext.class,0);
		}
		public FieldNameContext fieldName() {
			return getRuleContext(FieldNameContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_variable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			fieldType();
			setState(106);
			fieldName();
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

	public static class FieldTypeContext extends ParserRuleContext {
		public ObjectIdentifierContext objectIdentifier() {
			return getRuleContext(ObjectIdentifierContext.class,0);
		}
		public PrimitiveTypeContext primitiveType() {
			return getRuleContext(PrimitiveTypeContext.class,0);
		}
		public FieldTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).enterFieldType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).exitFieldType(this);
		}
	}

	public final FieldTypeContext fieldType() throws RecognitionException {
		FieldTypeContext _localctx = new FieldTypeContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_fieldType);
		try {
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CLASSNAME_TOKEN:
			case IDENTIFIER_TOKEN:
				enterOuterAlt(_localctx, 1);
				{
				setState(108);
				objectIdentifier();
				}
				break;
			case T__1:
			case T__2:
			case T__3:
			case T__4:
			case T__5:
			case T__6:
			case T__7:
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(109);
				primitiveType();
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

	public static class ObjectIdentifierContext extends ParserRuleContext {
		public TerminalNode CLASSNAME_TOKEN() { return getToken(CruddyParser.CLASSNAME_TOKEN, 0); }
		public List<TerminalNode> IDENTIFIER_TOKEN() { return getTokens(CruddyParser.IDENTIFIER_TOKEN); }
		public TerminalNode IDENTIFIER_TOKEN(int i) {
			return getToken(CruddyParser.IDENTIFIER_TOKEN, i);
		}
		public GenericTypeContext genericType() {
			return getRuleContext(GenericTypeContext.class,0);
		}
		public ObjectIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objectIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).enterObjectIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).exitObjectIdentifier(this);
		}
	}

	public final ObjectIdentifierContext objectIdentifier() throws RecognitionException {
		ObjectIdentifierContext _localctx = new ObjectIdentifierContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_objectIdentifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IDENTIFIER_TOKEN) {
				{
				{
				setState(112);
				match(IDENTIFIER_TOKEN);
				setState(113);
				match(T__0);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(CLASSNAME_TOKEN);
			setState(121);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LT) {
				{
				setState(120);
				genericType();
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

	public static class PrimitiveTypeContext extends ParserRuleContext {
		public PrimitiveTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primitiveType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).enterPrimitiveType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).exitPrimitiveType(this);
		}
	}

	public final PrimitiveTypeContext primitiveType() throws RecognitionException {
		PrimitiveTypeContext _localctx = new PrimitiveTypeContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_primitiveType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(123);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__3) | (1L << T__4) | (1L << T__5) | (1L << T__6) | (1L << T__7) | (1L << T__8))) != 0)) ) {
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

	public static class FieldNameContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_TOKEN() { return getToken(CruddyParser.IDENTIFIER_TOKEN, 0); }
		public FieldNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).enterFieldName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).exitFieldName(this);
		}
	}

	public final FieldNameContext fieldName() throws RecognitionException {
		FieldNameContext _localctx = new FieldNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_fieldName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			match(IDENTIFIER_TOKEN);
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

	public static class FieldDBKeyContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(CruddyParser.STRING_LITERAL, 0); }
		public FieldDBKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldDBKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).enterFieldDBKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).exitFieldDBKey(this);
		}
	}

	public final FieldDBKeyContext fieldDBKey() throws RecognitionException {
		FieldDBKeyContext _localctx = new FieldDBKeyContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fieldDBKey);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			match(STRING_LITERAL);
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

	public static class GenericTypeContext extends ParserRuleContext {
		public TerminalNode LT() { return getToken(CruddyParser.LT, 0); }
		public TerminalNode CLASSNAME_TOKEN() { return getToken(CruddyParser.CLASSNAME_TOKEN, 0); }
		public TerminalNode GT() { return getToken(CruddyParser.GT, 0); }
		public GenericTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_genericType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).enterGenericType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CruddyListener ) ((CruddyListener)listener).exitGenericType(this);
		}
	}

	public final GenericTypeContext genericType() throws RecognitionException {
		GenericTypeContext _localctx = new GenericTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_genericType);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(129);
			match(LT);
			setState(130);
			match(CLASSNAME_TOKEN);
			setState(131);
			match(GT);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0088\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4\3\4\3\4\6\4\60\n\4\r\4\16\4\61\3"+
		"\4\3\4\3\5\3\5\3\5\6\59\n\5\r\5\16\5:\3\5\3\5\3\6\3\6\3\6\6\6B\n\6\r\6"+
		"\16\6C\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\6\b"+
		"U\n\b\r\b\16\bV\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\6\td\n\t\r"+
		"\t\16\te\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\f\3\f\5\fq\n\f\3\r\3\r\7\ru"+
		"\n\r\f\r\16\rx\13\r\3\r\3\r\5\r|\n\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21"+
		"\3\21\3\21\3\21\3\21\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2"+
		"\3\3\2\4\13\2\177\2\"\3\2\2\2\4*\3\2\2\2\6,\3\2\2\2\b\65\3\2\2\2\n>\3"+
		"\2\2\2\fG\3\2\2\2\16K\3\2\2\2\20Z\3\2\2\2\22i\3\2\2\2\24k\3\2\2\2\26p"+
		"\3\2\2\2\30v\3\2\2\2\32}\3\2\2\2\34\177\3\2\2\2\36\u0081\3\2\2\2 \u0083"+
		"\3\2\2\2\"#\7\f\2\2#$\5\4\3\2$%\7\24\2\2%&\5\6\4\2&\'\5\b\5\2\'(\5\n\6"+
		"\2()\7\25\2\2)\3\3\2\2\2*+\7\31\2\2+\5\3\2\2\2,-\7\r\2\2-/\7\24\2\2.\60"+
		"\5\f\7\2/.\3\2\2\2\60\61\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2"+
		"\2\63\64\7\25\2\2\64\7\3\2\2\2\65\66\7\16\2\2\668\7\24\2\2\679\5\16\b"+
		"\28\67\3\2\2\29:\3\2\2\2:8\3\2\2\2:;\3\2\2\2;<\3\2\2\2<=\7\25\2\2=\t\3"+
		"\2\2\2>?\7\17\2\2?A\7\24\2\2@B\5\20\t\2A@\3\2\2\2BC\3\2\2\2CA\3\2\2\2"+
		"CD\3\2\2\2DE\3\2\2\2EF\7\25\2\2F\13\3\2\2\2GH\5\26\f\2HI\5\34\17\2IJ\5"+
		"\36\20\2J\r\3\2\2\2KL\7\32\2\2LM\7\26\2\2MN\7\20\2\2NO\7\26\2\2OP\5\22"+
		"\n\2PQ\7\21\2\2QR\7\26\2\2RT\7\24\2\2SU\5\24\13\2TS\3\2\2\2UV\3\2\2\2"+
		"VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\7\25\2\2Y\17\3\2\2\2Z[\7\32\2\2[\\\7"+
		"\26\2\2\\]\7\20\2\2]^\7\26\2\2^_\5\22\n\2_`\7\21\2\2`a\7\26\2\2ac\7\24"+
		"\2\2bd\5\24\13\2cb\3\2\2\2de\3\2\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2gh\7"+
		"\25\2\2h\21\3\2\2\2ij\7\30\2\2j\23\3\2\2\2kl\5\26\f\2lm\5\34\17\2m\25"+
		"\3\2\2\2nq\5\30\r\2oq\5\32\16\2pn\3\2\2\2po\3\2\2\2q\27\3\2\2\2rs\7\32"+
		"\2\2su\7\3\2\2tr\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2"+
		"\2\2y{\7\31\2\2z|\5 \21\2{z\3\2\2\2{|\3\2\2\2|\31\3\2\2\2}~\t\2\2\2~\33"+
		"\3\2\2\2\177\u0080\7\32\2\2\u0080\35\3\2\2\2\u0081\u0082\7\30\2\2\u0082"+
		"\37\3\2\2\2\u0083\u0084\7\22\2\2\u0084\u0085\7\31\2\2\u0085\u0086\7\23"+
		"\2\2\u0086!\3\2\2\2\n\61:CVepv{";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}