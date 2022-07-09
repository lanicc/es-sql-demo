// Generated from /Users/lan/IdeaProjects/github/es-sql-demo/es-sql/src/main/java/io/github/lanicc/eql/Eql.g4 by ANTLR 4.10.1
package io.github.lanicc.eql;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class EqlParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SELECT=1, FROM=2, WHERE=3, ASSIGN=4, LP=5, RP=6, AND=7, LIKE=8, IN=9, 
		DOT=10, COMMA=11, TRUE=12, FALSE=13, INTEGER=14, DECIMAL=15, STRING=16, 
		ID=17, WS=18;
	public static final int
		RULE_sql = 0, RULE_statement = 1, RULE_index_name = 2, RULE_where_statement = 3, 
		RULE_cols = 4, RULE_col = 5, RULE_array = 6, RULE_expr = 7;
	private static String[] makeRuleNames() {
		return new String[] {
			"sql", "statement", "index_name", "where_statement", "cols", "col", "array", 
			"expr"
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

	@Override
	public String getGrammarFileName() { return "Eql.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public EqlParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SqlContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(EqlParser.EOF, 0); }
		public SqlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sql; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterSql(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitSql(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitSql(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SqlContext sql() throws RecognitionException {
		SqlContext _localctx = new SqlContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_sql);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			statement();
			setState(17);
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

	public static class StatementContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(EqlParser.SELECT, 0); }
		public ColsContext cols() {
			return getRuleContext(ColsContext.class,0);
		}
		public TerminalNode FROM() { return getToken(EqlParser.FROM, 0); }
		public Index_nameContext index_name() {
			return getRuleContext(Index_nameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(EqlParser.WHERE, 0); }
		public Where_statementContext where_statement() {
			return getRuleContext(Where_statementContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(SELECT);
			setState(20);
			cols();
			setState(21);
			match(FROM);
			setState(22);
			index_name();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WHERE) {
				{
				setState(23);
				match(WHERE);
				setState(24);
				where_statement(0);
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

	public static class Index_nameContext extends ParserRuleContext {
		public Index_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_index_name; }
	 
		public Index_nameContext() { }
		public void copyFrom(Index_nameContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class IndexContext extends Index_nameContext {
		public TerminalNode ID() { return getToken(EqlParser.ID, 0); }
		public IndexContext(Index_nameContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Index_nameContext index_name() throws RecognitionException {
		Index_nameContext _localctx = new Index_nameContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_index_name);
		try {
			_localctx = new IndexContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(27);
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

	public static class Where_statementContext extends ParserRuleContext {
		public Where_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_where_statement; }
	 
		public Where_statementContext() { }
		public void copyFrom(Where_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class EqualContext extends Where_statementContext {
		public TerminalNode ID() { return getToken(EqlParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(EqlParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public EqualContext(Where_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterEqual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitEqual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitEqual(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeContext extends Where_statementContext {
		public TerminalNode ID() { return getToken(EqlParser.ID, 0); }
		public TerminalNode LIKE() { return getToken(EqlParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(EqlParser.STRING, 0); }
		public LikeContext(Where_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InContext extends Where_statementContext {
		public TerminalNode ID() { return getToken(EqlParser.ID, 0); }
		public TerminalNode IN() { return getToken(EqlParser.IN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public InContext(Where_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterIn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitIn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitIn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AndContext extends Where_statementContext {
		public List<Where_statementContext> where_statement() {
			return getRuleContexts(Where_statementContext.class);
		}
		public Where_statementContext where_statement(int i) {
			return getRuleContext(Where_statementContext.class,i);
		}
		public TerminalNode AND() { return getToken(EqlParser.AND, 0); }
		public AndContext(Where_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitAnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Where_statementContext where_statement() throws RecognitionException {
		return where_statement(0);
	}

	private Where_statementContext where_statement(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Where_statementContext _localctx = new Where_statementContext(_ctx, _parentState);
		Where_statementContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_where_statement, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,1,_ctx) ) {
			case 1:
				{
				_localctx = new EqualContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(30);
				match(ID);
				setState(31);
				match(ASSIGN);
				setState(32);
				expr();
				}
				break;
			case 2:
				{
				_localctx = new LikeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(33);
				match(ID);
				setState(34);
				match(LIKE);
				setState(35);
				match(STRING);
				}
				break;
			case 3:
				{
				_localctx = new InContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(36);
				match(ID);
				setState(37);
				match(IN);
				setState(38);
				array();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(46);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndContext(new Where_statementContext(_parentctx, _parentState));
					pushNewRecursionContext(_localctx, _startState, RULE_where_statement);
					setState(41);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(42);
					match(AND);
					setState(43);
					where_statement(2);
					}
					} 
				}
				setState(48);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ColsContext extends ParserRuleContext {
		public List<ColContext> col() {
			return getRuleContexts(ColContext.class);
		}
		public ColContext col(int i) {
			return getRuleContext(ColContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(EqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EqlParser.COMMA, i);
		}
		public ColsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cols; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterCols(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitCols(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitCols(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColsContext cols() throws RecognitionException {
		ColsContext _localctx = new ColsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_cols);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			col();
			setState(54);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(50);
				match(COMMA);
				setState(51);
				col();
				}
				}
				setState(56);
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

	public static class ColContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(EqlParser.ID, 0); }
		public ColContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_col; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterCol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitCol(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitCol(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColContext col() throws RecognitionException {
		ColContext _localctx = new ColContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_col);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode LP() { return getToken(EqlParser.LP, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP() { return getToken(EqlParser.RP, 0); }
		public List<TerminalNode> COMMA() { return getTokens(EqlParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(EqlParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(59);
			match(LP);
			setState(60);
			expr();
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(61);
				match(COMMA);
				setState(62);
				expr();
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(RP);
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

	public static class ExprContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(EqlParser.STRING, 0); }
		public TerminalNode INTEGER() { return getToken(EqlParser.INTEGER, 0); }
		public TerminalNode DECIMAL() { return getToken(EqlParser.DECIMAL, 0); }
		public TerminalNode TRUE() { return getToken(EqlParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(EqlParser.FALSE, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof EqlListener ) ((EqlListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof EqlVisitor ) return ((EqlVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_expr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TRUE) | (1L << FALSE) | (1L << INTEGER) | (1L << DECIMAL) | (1L << STRING))) != 0)) ) {
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return where_statement_sempred((Where_statementContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean where_statement_sempred(Where_statementContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012I\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0003\u0001\u001a\b\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0003\u0003(\b"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003-\b\u0003\n\u0003"+
		"\f\u00030\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u00045\b\u0004"+
		"\n\u0004\f\u00048\t\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006"+
		"\u0001\u0006\u0001\u0006\u0005\u0006@\b\u0006\n\u0006\f\u0006C\t\u0006"+
		"\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0000\u0001"+
		"\u0006\b\u0000\u0002\u0004\u0006\b\n\f\u000e\u0000\u0001\u0001\u0000\f"+
		"\u0010F\u0000\u0010\u0001\u0000\u0000\u0000\u0002\u0013\u0001\u0000\u0000"+
		"\u0000\u0004\u001b\u0001\u0000\u0000\u0000\u0006\'\u0001\u0000\u0000\u0000"+
		"\b1\u0001\u0000\u0000\u0000\n9\u0001\u0000\u0000\u0000\f;\u0001\u0000"+
		"\u0000\u0000\u000eF\u0001\u0000\u0000\u0000\u0010\u0011\u0003\u0002\u0001"+
		"\u0000\u0011\u0012\u0005\u0000\u0000\u0001\u0012\u0001\u0001\u0000\u0000"+
		"\u0000\u0013\u0014\u0005\u0001\u0000\u0000\u0014\u0015\u0003\b\u0004\u0000"+
		"\u0015\u0016\u0005\u0002\u0000\u0000\u0016\u0019\u0003\u0004\u0002\u0000"+
		"\u0017\u0018\u0005\u0003\u0000\u0000\u0018\u001a\u0003\u0006\u0003\u0000"+
		"\u0019\u0017\u0001\u0000\u0000\u0000\u0019\u001a\u0001\u0000\u0000\u0000"+
		"\u001a\u0003\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0011\u0000\u0000"+
		"\u001c\u0005\u0001\u0000\u0000\u0000\u001d\u001e\u0006\u0003\uffff\uffff"+
		"\u0000\u001e\u001f\u0005\u0011\u0000\u0000\u001f \u0005\u0004\u0000\u0000"+
		" (\u0003\u000e\u0007\u0000!\"\u0005\u0011\u0000\u0000\"#\u0005\b\u0000"+
		"\u0000#(\u0005\u0010\u0000\u0000$%\u0005\u0011\u0000\u0000%&\u0005\t\u0000"+
		"\u0000&(\u0003\f\u0006\u0000\'\u001d\u0001\u0000\u0000\u0000\'!\u0001"+
		"\u0000\u0000\u0000\'$\u0001\u0000\u0000\u0000(.\u0001\u0000\u0000\u0000"+
		")*\n\u0001\u0000\u0000*+\u0005\u0007\u0000\u0000+-\u0003\u0006\u0003\u0002"+
		",)\u0001\u0000\u0000\u0000-0\u0001\u0000\u0000\u0000.,\u0001\u0000\u0000"+
		"\u0000./\u0001\u0000\u0000\u0000/\u0007\u0001\u0000\u0000\u00000.\u0001"+
		"\u0000\u0000\u000016\u0003\n\u0005\u000023\u0005\u000b\u0000\u000035\u0003"+
		"\n\u0005\u000042\u0001\u0000\u0000\u000058\u0001\u0000\u0000\u000064\u0001"+
		"\u0000\u0000\u000067\u0001\u0000\u0000\u00007\t\u0001\u0000\u0000\u0000"+
		"86\u0001\u0000\u0000\u00009:\u0005\u0011\u0000\u0000:\u000b\u0001\u0000"+
		"\u0000\u0000;<\u0005\u0005\u0000\u0000<A\u0003\u000e\u0007\u0000=>\u0005"+
		"\u000b\u0000\u0000>@\u0003\u000e\u0007\u0000?=\u0001\u0000\u0000\u0000"+
		"@C\u0001\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000AB\u0001\u0000\u0000"+
		"\u0000BD\u0001\u0000\u0000\u0000CA\u0001\u0000\u0000\u0000DE\u0005\u0006"+
		"\u0000\u0000E\r\u0001\u0000\u0000\u0000FG\u0007\u0000\u0000\u0000G\u000f"+
		"\u0001\u0000\u0000\u0000\u0005\u0019\'.6A";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}