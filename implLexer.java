// Generated from impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, IDENTIFIER=16, 
		CONST=17, HVIDRUM=18, KOMMENTAR=19, MULTILINECOMMENTS=20;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "IDENTIFIER", "CONST", 
			"HVIDRUM", "KOMMENTAR", "MULTILINECOMMENTS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.inputs'", "'.outputs'", "'.update'", "'.simulate'", 
			"'.latch'", "'->'", "'='", "'('", "')'", "'0'", "'1'", "'!'", "'&&'", 
			"'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "IDENTIFIER", "CONST", "HVIDRUM", "KOMMENTAR", 
			"MULTILINECOMMENTS"
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


	public implLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "impl.g4"; }

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
		"\u0004\u0000\u0014\u00a1\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0002\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\r\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0005\u000fu\b\u000f\n\u000f"+
		"\f\u000fx\t\u000f\u0001\u0010\u0005\u0010{\b\u0010\n\u0010\f\u0010~\t"+
		"\u0010\u0001\u0011\u0004\u0011\u0081\b\u0011\u000b\u0011\f\u0011\u0082"+
		"\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0005\u0012\u008b\b\u0012\n\u0012\f\u0012\u008e\t\u0012\u0001\u0012\u0001"+
		"\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001"+
		"\u0013\u0005\u0013\u0098\b\u0013\n\u0013\f\u0013\u009b\t\u0013\u0001\u0013"+
		"\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0000\u0000\u0014\u0001"+
		"\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007"+
		"\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d"+
		"\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014\u0001\u0000\u0007\u0003"+
		"\u0000AZ__az\u0004\u000009AZ__az\u0001\u000009\u0002\u0000\t\n  \u0001"+
		"\u0000\n\n\u0001\u0000//\u0001\u0000**\u00a6\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0001)\u0001\u0000\u0000\u0000\u00033\u0001\u0000\u0000\u0000"+
		"\u0005;\u0001\u0000\u0000\u0000\u0007D\u0001\u0000\u0000\u0000\tL\u0001"+
		"\u0000\u0000\u0000\u000bV\u0001\u0000\u0000\u0000\r]\u0001\u0000\u0000"+
		"\u0000\u000f`\u0001\u0000\u0000\u0000\u0011b\u0001\u0000\u0000\u0000\u0013"+
		"d\u0001\u0000\u0000\u0000\u0015f\u0001\u0000\u0000\u0000\u0017h\u0001"+
		"\u0000\u0000\u0000\u0019j\u0001\u0000\u0000\u0000\u001bl\u0001\u0000\u0000"+
		"\u0000\u001do\u0001\u0000\u0000\u0000\u001fr\u0001\u0000\u0000\u0000!"+
		"|\u0001\u0000\u0000\u0000#\u0080\u0001\u0000\u0000\u0000%\u0086\u0001"+
		"\u0000\u0000\u0000\'\u0091\u0001\u0000\u0000\u0000)*\u0005.\u0000\u0000"+
		"*+\u0005h\u0000\u0000+,\u0005a\u0000\u0000,-\u0005r\u0000\u0000-.\u0005"+
		"d\u0000\u0000./\u0005w\u0000\u0000/0\u0005a\u0000\u000001\u0005r\u0000"+
		"\u000012\u0005e\u0000\u00002\u0002\u0001\u0000\u0000\u000034\u0005.\u0000"+
		"\u000045\u0005i\u0000\u000056\u0005n\u0000\u000067\u0005p\u0000\u0000"+
		"78\u0005u\u0000\u000089\u0005t\u0000\u00009:\u0005s\u0000\u0000:\u0004"+
		"\u0001\u0000\u0000\u0000;<\u0005.\u0000\u0000<=\u0005o\u0000\u0000=>\u0005"+
		"u\u0000\u0000>?\u0005t\u0000\u0000?@\u0005p\u0000\u0000@A\u0005u\u0000"+
		"\u0000AB\u0005t\u0000\u0000BC\u0005s\u0000\u0000C\u0006\u0001\u0000\u0000"+
		"\u0000DE\u0005.\u0000\u0000EF\u0005u\u0000\u0000FG\u0005p\u0000\u0000"+
		"GH\u0005d\u0000\u0000HI\u0005a\u0000\u0000IJ\u0005t\u0000\u0000JK\u0005"+
		"e\u0000\u0000K\b\u0001\u0000\u0000\u0000LM\u0005.\u0000\u0000MN\u0005"+
		"s\u0000\u0000NO\u0005i\u0000\u0000OP\u0005m\u0000\u0000PQ\u0005u\u0000"+
		"\u0000QR\u0005l\u0000\u0000RS\u0005a\u0000\u0000ST\u0005t\u0000\u0000"+
		"TU\u0005e\u0000\u0000U\n\u0001\u0000\u0000\u0000VW\u0005.\u0000\u0000"+
		"WX\u0005l\u0000\u0000XY\u0005a\u0000\u0000YZ\u0005t\u0000\u0000Z[\u0005"+
		"c\u0000\u0000[\\\u0005h\u0000\u0000\\\f\u0001\u0000\u0000\u0000]^\u0005"+
		"-\u0000\u0000^_\u0005>\u0000\u0000_\u000e\u0001\u0000\u0000\u0000`a\u0005"+
		"=\u0000\u0000a\u0010\u0001\u0000\u0000\u0000bc\u0005(\u0000\u0000c\u0012"+
		"\u0001\u0000\u0000\u0000de\u0005)\u0000\u0000e\u0014\u0001\u0000\u0000"+
		"\u0000fg\u00050\u0000\u0000g\u0016\u0001\u0000\u0000\u0000hi\u00051\u0000"+
		"\u0000i\u0018\u0001\u0000\u0000\u0000jk\u0005!\u0000\u0000k\u001a\u0001"+
		"\u0000\u0000\u0000lm\u0005&\u0000\u0000mn\u0005&\u0000\u0000n\u001c\u0001"+
		"\u0000\u0000\u0000op\u0005|\u0000\u0000pq\u0005|\u0000\u0000q\u001e\u0001"+
		"\u0000\u0000\u0000rv\u0007\u0000\u0000\u0000su\u0007\u0001\u0000\u0000"+
		"ts\u0001\u0000\u0000\u0000ux\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000"+
		"\u0000vw\u0001\u0000\u0000\u0000w \u0001\u0000\u0000\u0000xv\u0001\u0000"+
		"\u0000\u0000y{\u0007\u0002\u0000\u0000zy\u0001\u0000\u0000\u0000{~\u0001"+
		"\u0000\u0000\u0000|z\u0001\u0000\u0000\u0000|}\u0001\u0000\u0000\u0000"+
		"}\"\u0001\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000\u007f\u0081\u0007"+
		"\u0003\u0000\u0000\u0080\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001"+
		"\u0000\u0000\u0000\u0082\u0080\u0001\u0000\u0000\u0000\u0082\u0083\u0001"+
		"\u0000\u0000\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u0085\u0006"+
		"\u0011\u0000\u0000\u0085$\u0001\u0000\u0000\u0000\u0086\u0087\u0005/\u0000"+
		"\u0000\u0087\u0088\u0005/\u0000\u0000\u0088\u008c\u0001\u0000\u0000\u0000"+
		"\u0089\u008b\b\u0004\u0000\u0000\u008a\u0089\u0001\u0000\u0000\u0000\u008b"+
		"\u008e\u0001\u0000\u0000\u0000\u008c\u008a\u0001\u0000\u0000\u0000\u008c"+
		"\u008d\u0001\u0000\u0000\u0000\u008d\u008f\u0001\u0000\u0000\u0000\u008e"+
		"\u008c\u0001\u0000\u0000\u0000\u008f\u0090\u0006\u0012\u0000\u0000\u0090"+
		"&\u0001\u0000\u0000\u0000\u0091\u0092\u0005/\u0000\u0000\u0092\u0093\u0005"+
		"*\u0000\u0000\u0093\u0099\u0001\u0000\u0000\u0000\u0094\u0095\u0005*\u0000"+
		"\u0000\u0095\u0098\b\u0005\u0000\u0000\u0096\u0098\b\u0006\u0000\u0000"+
		"\u0097\u0094\u0001\u0000\u0000\u0000\u0097\u0096\u0001\u0000\u0000\u0000"+
		"\u0098\u009b\u0001\u0000\u0000\u0000\u0099\u0097\u0001\u0000\u0000\u0000"+
		"\u0099\u009a\u0001\u0000\u0000\u0000\u009a\u009c\u0001\u0000\u0000\u0000"+
		"\u009b\u0099\u0001\u0000\u0000\u0000\u009c\u009d\u0005*\u0000\u0000\u009d"+
		"\u009e\u0005/\u0000\u0000\u009e\u009f\u0001\u0000\u0000\u0000\u009f\u00a0"+
		"\u0006\u0013\u0000\u0000\u00a0(\u0001\u0000\u0000\u0000\u0007\u0000v|"+
		"\u0082\u008c\u0097\u0099\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}