// Generated from /Users/lan/IdeaProjects/github/es-sql-demo/es-sql/src/main/java/io/github/lanicc/eql/Eql.g4 by ANTLR 4.10.1
package io.github.lanicc.eql;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EqlLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, ASSIGN=4, LP=5, RP=6, AND=7, LIKE=8, IN=9, 
		DOT=10, COMMA=11, TRUE=12, FALSE=13, INTEGER=14, DECIMAL=15, STRING=16, 
		ID=17, WS=18;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"SELECT", "FROM", "WHERE", "ASSIGN", "LP", "RP", "AND", "LIKE", "IN", 
			"DOT", "COMMA", "TRUE", "FALSE", "INTEGER", "DECIMAL", "STRING", "ID", 
			"WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'SELECT'", "'FROM'", "'WHERE'", "'='", "'('", "')'", "'AND'", 
			"'LIKE'", "'IN'", "'.'", "','", "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SELECT", "FROM", "WHERE", "ASSIGN", "LP", "RP", "AND", "LIKE", 
			"IN", "DOT", "COMMA", "TRUE", "FALSE", "INTEGER", "DECIMAL", "STRING", 
			"ID", "WS"
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


	public EqlLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Eql.g4"; }

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
		"\u0004\u0000\u0012\u00a0\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002"+
		"\u0001\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002"+
		"\u0004\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002"+
		"\u0007\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002"+
		"\u000b\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e"+
		"\u0002\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011"+
		"\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005\u0001\u0005"+
		"\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001\t\u0001"+
		"\t\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\r\u0003\r"+
		"Z\b\r\u0001\r\u0001\r\u0001\r\u0005\r_\b\r\n\r\f\rb\t\r\u0003\rd\b\r\u0001"+
		"\u000e\u0003\u000eg\b\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000el\b\u000e\n\u000e\f\u000eo\t\u000e\u0003\u000eq\b\u000e\u0001\u000e"+
		"\u0001\u000e\u0004\u000eu\b\u000e\u000b\u000e\f\u000ev\u0003\u000ey\b"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e}\b\u000e\u0001\u000e\u0004"+
		"\u000e\u0080\b\u000e\u000b\u000e\f\u000e\u0081\u0003\u000e\u0084\b\u000e"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0005\u000f\u008c\b\u000f\n\u000f\f\u000f\u008f\t\u000f\u0001\u000f\u0001"+
		"\u000f\u0001\u0010\u0001\u0010\u0005\u0010\u0095\b\u0010\n\u0010\f\u0010"+
		"\u0098\t\u0010\u0001\u0011\u0004\u0011\u009b\b\u0011\u000b\u0011\f\u0011"+
		"\u009c\u0001\u0011\u0001\u0011\u0001\u008d\u0000\u0012\u0001\u0001\u0003"+
		"\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b\u0006\r\u0007\u000f\b\u0011"+
		"\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b\u000e\u001d\u000f\u001f\u0010"+
		"!\u0011#\u0012\u0001\u0000\b\u0002\u0000++--\u0001\u000019\u0001\u0000"+
		"09\u0002\u0000EEee\u0002\u0000\"\"\\\\\u0003\u0000AZ__az\u0006\u0000."+
		".09AZ\\\\__az\u0003\u0000\t\n\r\r  \u00af\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0001%\u0001\u0000\u0000\u0000\u0003,\u0001\u0000\u0000"+
		"\u0000\u00051\u0001\u0000\u0000\u0000\u00077\u0001\u0000\u0000\u0000\t"+
		"9\u0001\u0000\u0000\u0000\u000b;\u0001\u0000\u0000\u0000\r=\u0001\u0000"+
		"\u0000\u0000\u000fA\u0001\u0000\u0000\u0000\u0011F\u0001\u0000\u0000\u0000"+
		"\u0013I\u0001\u0000\u0000\u0000\u0015K\u0001\u0000\u0000\u0000\u0017M"+
		"\u0001\u0000\u0000\u0000\u0019R\u0001\u0000\u0000\u0000\u001bY\u0001\u0000"+
		"\u0000\u0000\u001df\u0001\u0000\u0000\u0000\u001f\u0085\u0001\u0000\u0000"+
		"\u0000!\u0092\u0001\u0000\u0000\u0000#\u009a\u0001\u0000\u0000\u0000%"+
		"&\u0005S\u0000\u0000&\'\u0005E\u0000\u0000\'(\u0005L\u0000\u0000()\u0005"+
		"E\u0000\u0000)*\u0005C\u0000\u0000*+\u0005T\u0000\u0000+\u0002\u0001\u0000"+
		"\u0000\u0000,-\u0005F\u0000\u0000-.\u0005R\u0000\u0000./\u0005O\u0000"+
		"\u0000/0\u0005M\u0000\u00000\u0004\u0001\u0000\u0000\u000012\u0005W\u0000"+
		"\u000023\u0005H\u0000\u000034\u0005E\u0000\u000045\u0005R\u0000\u0000"+
		"56\u0005E\u0000\u00006\u0006\u0001\u0000\u0000\u000078\u0005=\u0000\u0000"+
		"8\b\u0001\u0000\u0000\u00009:\u0005(\u0000\u0000:\n\u0001\u0000\u0000"+
		"\u0000;<\u0005)\u0000\u0000<\f\u0001\u0000\u0000\u0000=>\u0005A\u0000"+
		"\u0000>?\u0005N\u0000\u0000?@\u0005D\u0000\u0000@\u000e\u0001\u0000\u0000"+
		"\u0000AB\u0005L\u0000\u0000BC\u0005I\u0000\u0000CD\u0005K\u0000\u0000"+
		"DE\u0005E\u0000\u0000E\u0010\u0001\u0000\u0000\u0000FG\u0005I\u0000\u0000"+
		"GH\u0005N\u0000\u0000H\u0012\u0001\u0000\u0000\u0000IJ\u0005.\u0000\u0000"+
		"J\u0014\u0001\u0000\u0000\u0000KL\u0005,\u0000\u0000L\u0016\u0001\u0000"+
		"\u0000\u0000MN\u0005t\u0000\u0000NO\u0005r\u0000\u0000OP\u0005u\u0000"+
		"\u0000PQ\u0005e\u0000\u0000Q\u0018\u0001\u0000\u0000\u0000RS\u0005f\u0000"+
		"\u0000ST\u0005a\u0000\u0000TU\u0005l\u0000\u0000UV\u0005s\u0000\u0000"+
		"VW\u0005e\u0000\u0000W\u001a\u0001\u0000\u0000\u0000XZ\u0007\u0000\u0000"+
		"\u0000YX\u0001\u0000\u0000\u0000YZ\u0001\u0000\u0000\u0000Zc\u0001\u0000"+
		"\u0000\u0000[d\u00050\u0000\u0000\\`\u0007\u0001\u0000\u0000]_\u0007\u0002"+
		"\u0000\u0000^]\u0001\u0000\u0000\u0000_b\u0001\u0000\u0000\u0000`^\u0001"+
		"\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000ad\u0001\u0000\u0000\u0000"+
		"b`\u0001\u0000\u0000\u0000c[\u0001\u0000\u0000\u0000c\\\u0001\u0000\u0000"+
		"\u0000d\u001c\u0001\u0000\u0000\u0000eg\u0007\u0000\u0000\u0000fe\u0001"+
		"\u0000\u0000\u0000fg\u0001\u0000\u0000\u0000gp\u0001\u0000\u0000\u0000"+
		"hq\u00050\u0000\u0000im\u0007\u0001\u0000\u0000jl\u0007\u0002\u0000\u0000"+
		"kj\u0001\u0000\u0000\u0000lo\u0001\u0000\u0000\u0000mk\u0001\u0000\u0000"+
		"\u0000mn\u0001\u0000\u0000\u0000nq\u0001\u0000\u0000\u0000om\u0001\u0000"+
		"\u0000\u0000ph\u0001\u0000\u0000\u0000pi\u0001\u0000\u0000\u0000qx\u0001"+
		"\u0000\u0000\u0000rt\u0003\u0013\t\u0000su\u0007\u0002\u0000\u0000ts\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vt\u0001\u0000\u0000\u0000"+
		"vw\u0001\u0000\u0000\u0000wy\u0001\u0000\u0000\u0000xr\u0001\u0000\u0000"+
		"\u0000xy\u0001\u0000\u0000\u0000y\u0083\u0001\u0000\u0000\u0000z|\u0007"+
		"\u0003\u0000\u0000{}\u0007\u0000\u0000\u0000|{\u0001\u0000\u0000\u0000"+
		"|}\u0001\u0000\u0000\u0000}\u007f\u0001\u0000\u0000\u0000~\u0080\u0007"+
		"\u0002\u0000\u0000\u007f~\u0001\u0000\u0000\u0000\u0080\u0081\u0001\u0000"+
		"\u0000\u0000\u0081\u007f\u0001\u0000\u0000\u0000\u0081\u0082\u0001\u0000"+
		"\u0000\u0000\u0082\u0084\u0001\u0000\u0000\u0000\u0083z\u0001\u0000\u0000"+
		"\u0000\u0083\u0084\u0001\u0000\u0000\u0000\u0084\u001e\u0001\u0000\u0000"+
		"\u0000\u0085\u008d\u0005\"\u0000\u0000\u0086\u0087\u0005\\\u0000\u0000"+
		"\u0087\u008c\u0005\"\u0000\u0000\u0088\u0089\u0005\\\u0000\u0000\u0089"+
		"\u008c\u0005\\\u0000\u0000\u008a\u008c\b\u0004\u0000\u0000\u008b\u0086"+
		"\u0001\u0000\u0000\u0000\u008b\u0088\u0001\u0000\u0000\u0000\u008b\u008a"+
		"\u0001\u0000\u0000\u0000\u008c\u008f\u0001\u0000\u0000\u0000\u008d\u008e"+
		"\u0001\u0000\u0000\u0000\u008d\u008b\u0001\u0000\u0000\u0000\u008e\u0090"+
		"\u0001\u0000\u0000\u0000\u008f\u008d\u0001\u0000\u0000\u0000\u0090\u0091"+
		"\u0005\"\u0000\u0000\u0091 \u0001\u0000\u0000\u0000\u0092\u0096\u0007"+
		"\u0005\u0000\u0000\u0093\u0095\u0007\u0006\u0000\u0000\u0094\u0093\u0001"+
		"\u0000\u0000\u0000\u0095\u0098\u0001\u0000\u0000\u0000\u0096\u0094\u0001"+
		"\u0000\u0000\u0000\u0096\u0097\u0001\u0000\u0000\u0000\u0097\"\u0001\u0000"+
		"\u0000\u0000\u0098\u0096\u0001\u0000\u0000\u0000\u0099\u009b\u0007\u0007"+
		"\u0000\u0000\u009a\u0099\u0001\u0000\u0000\u0000\u009b\u009c\u0001\u0000"+
		"\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d\u0001\u0000"+
		"\u0000\u0000\u009d\u009e\u0001\u0000\u0000\u0000\u009e\u009f\u0006\u0011"+
		"\u0000\u0000\u009f$\u0001\u0000\u0000\u0000\u0010\u0000Y`cfmpvx|\u0081"+
		"\u0083\u008b\u008d\u0096\u009c\u0001\u0006\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}