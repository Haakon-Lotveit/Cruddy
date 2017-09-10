// Generated from Cruddy by ANTLR 4.7
package cruddy.generated;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CruddyLexer extends Lexer {
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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"TYPE_LITERAL", "FIELDS_LITERAL", "READERS_LITERAL", "DELETERS_LITERAL", 
		"QUERY_LITERAL", "ARGS_LITERAL", "LT", "GT", "LPAREN", "RPAREN", "COLON", 
		"QUOTE", "STRING_LITERAL", "CLASSNAME_TOKEN", "IDENTIFIER_TOKEN", "WS"
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


	public CruddyLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Cruddy"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\33\u00b9\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\4\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u009e\n\27"+
		"\f\27\16\27\u00a1\13\27\3\27\3\27\3\30\3\30\7\30\u00a7\n\30\f\30\16\30"+
		"\u00aa\13\30\3\31\3\31\7\31\u00ae\n\31\f\31\16\31\u00b1\13\31\3\32\6\32"+
		"\u00b4\n\32\r\32\16\32\u00b5\3\32\3\32\3\u009f\2\33\3\3\5\4\7\5\t\6\13"+
		"\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'"+
		"\25)\26+\27-\30/\31\61\32\63\33\3\2\6\3\2C\\\6\2\62;C\\aac|\4\2aac|\5"+
		"\2\13\f\17\17\"\"\2\u00bd\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2"+
		"\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2"+
		"\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3"+
		"\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2"+
		"\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\3\65\3\2\2\2\5\67"+
		"\3\2\2\2\7?\3\2\2\2\tD\3\2\2\2\13I\3\2\2\2\rO\3\2\2\2\17S\3\2\2\2\21X"+
		"\3\2\2\2\23^\3\2\2\2\25e\3\2\2\2\27j\3\2\2\2\31q\3\2\2\2\33y\3\2\2\2\35"+
		"\u0082\3\2\2\2\37\u0088\3\2\2\2!\u008d\3\2\2\2#\u008f\3\2\2\2%\u0091\3"+
		"\2\2\2\'\u0093\3\2\2\2)\u0095\3\2\2\2+\u0097\3\2\2\2-\u0099\3\2\2\2/\u00a4"+
		"\3\2\2\2\61\u00ab\3\2\2\2\63\u00b3\3\2\2\2\65\66\7\60\2\2\66\4\3\2\2\2"+
		"\678\7d\2\289\7q\2\29:\7q\2\2:;\7n\2\2;<\7g\2\2<=\7c\2\2=>\7p\2\2>\6\3"+
		"\2\2\2?@\7d\2\2@A\7{\2\2AB\7v\2\2BC\7g\2\2C\b\3\2\2\2DE\7e\2\2EF\7j\2"+
		"\2FG\7c\2\2GH\7t\2\2H\n\3\2\2\2IJ\7u\2\2JK\7j\2\2KL\7q\2\2LM\7t\2\2MN"+
		"\7v\2\2N\f\3\2\2\2OP\7k\2\2PQ\7p\2\2QR\7v\2\2R\16\3\2\2\2ST\7n\2\2TU\7"+
		"q\2\2UV\7p\2\2VW\7i\2\2W\20\3\2\2\2XY\7h\2\2YZ\7n\2\2Z[\7q\2\2[\\\7c\2"+
		"\2\\]\7v\2\2]\22\3\2\2\2^_\7f\2\2_`\7q\2\2`a\7w\2\2ab\7d\2\2bc\7n\2\2"+
		"cd\7g\2\2d\24\3\2\2\2ef\7v\2\2fg\7{\2\2gh\7r\2\2hi\7g\2\2i\26\3\2\2\2"+
		"jk\7h\2\2kl\7k\2\2lm\7g\2\2mn\7n\2\2no\7f\2\2op\7u\2\2p\30\3\2\2\2qr\7"+
		"t\2\2rs\7g\2\2st\7c\2\2tu\7f\2\2uv\7g\2\2vw\7t\2\2wx\7u\2\2x\32\3\2\2"+
		"\2yz\7f\2\2z{\7g\2\2{|\7n\2\2|}\7g\2\2}~\7v\2\2~\177\7g\2\2\177\u0080"+
		"\7t\2\2\u0080\u0081\7u\2\2\u0081\34\3\2\2\2\u0082\u0083\7s\2\2\u0083\u0084"+
		"\7w\2\2\u0084\u0085\7g\2\2\u0085\u0086\7t\2\2\u0086\u0087\7{\2\2\u0087"+
		"\36\3\2\2\2\u0088\u0089\7c\2\2\u0089\u008a\7t\2\2\u008a\u008b\7i\2\2\u008b"+
		"\u008c\7u\2\2\u008c \3\2\2\2\u008d\u008e\7>\2\2\u008e\"\3\2\2\2\u008f"+
		"\u0090\7@\2\2\u0090$\3\2\2\2\u0091\u0092\7*\2\2\u0092&\3\2\2\2\u0093\u0094"+
		"\7+\2\2\u0094(\3\2\2\2\u0095\u0096\7<\2\2\u0096*\3\2\2\2\u0097\u0098\7"+
		"$\2\2\u0098,\3\2\2\2\u0099\u009f\5+\26\2\u009a\u009b\7^\2\2\u009b\u009e"+
		"\7$\2\2\u009c\u009e\13\2\2\2\u009d\u009a\3\2\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\u00a1\3\2\2\2\u009f\u00a0\3\2\2\2\u009f\u009d\3\2\2\2\u00a0\u00a2\3\2"+
		"\2\2\u00a1\u009f\3\2\2\2\u00a2\u00a3\5+\26\2\u00a3.\3\2\2\2\u00a4\u00a8"+
		"\t\2\2\2\u00a5\u00a7\t\3\2\2\u00a6\u00a5\3\2\2\2\u00a7\u00aa\3\2\2\2\u00a8"+
		"\u00a6\3\2\2\2\u00a8\u00a9\3\2\2\2\u00a9\60\3\2\2\2\u00aa\u00a8\3\2\2"+
		"\2\u00ab\u00af\t\4\2\2\u00ac\u00ae\t\3\2\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1"+
		"\3\2\2\2\u00af\u00ad\3\2\2\2\u00af\u00b0\3\2\2\2\u00b0\62\3\2\2\2\u00b1"+
		"\u00af\3\2\2\2\u00b2\u00b4\t\5\2\2\u00b3\u00b2\3\2\2\2\u00b4\u00b5\3\2"+
		"\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7"+
		"\u00b8\b\32\2\2\u00b8\64\3\2\2\2\b\2\u009d\u009f\u00a8\u00af\u00b5\3\b"+
		"\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}