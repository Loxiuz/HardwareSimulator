// Generated from impl.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, IDENTIFIER=14, SIGNALS=15, HVIDRUM=16, 
		KOMMENTAR=17, MULTILINECOMMENTS=18;
	public static final int
		RULE_start = 0, RULE_latchDec = 1, RULE_updateDecl = 2, RULE_simlnp = 3, 
		RULE_expr = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "latchDec", "updateDecl", "simlnp", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.inputs'", "'.outputs'", "'.update'", "'.simulate'", 
			"'.latch'", "'->'", "'='", "'('", "')'", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, "IDENTIFIER", "SIGNALS", "HVIDRUM", "KOMMENTAR", "MULTILINECOMMENTS"
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
	public String getGrammarFileName() { return "impl.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public implParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public Token id;
		public Token IDENTIFIER;
		public List<Token> id1 = new ArrayList<Token>();
		public List<Token> id2 = new ArrayList<Token>();
		public LatchDecContext latchDec;
		public List<LatchDecContext> latch = new ArrayList<LatchDecContext>();
		public UpdateDeclContext updateDecl;
		public List<UpdateDeclContext> update = new ArrayList<UpdateDeclContext>();
		public SimlnpContext simlnp;
		public List<SimlnpContext> simulate = new ArrayList<SimlnpContext>();
		public TerminalNode EOF() { return getToken(implParser.EOF, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(implParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(implParser.IDENTIFIER, i);
		}
		public List<LatchDecContext> latchDec() {
			return getRuleContexts(LatchDecContext.class);
		}
		public LatchDecContext latchDec(int i) {
			return getRuleContext(LatchDecContext.class,i);
		}
		public List<UpdateDeclContext> updateDecl() {
			return getRuleContexts(UpdateDeclContext.class);
		}
		public UpdateDeclContext updateDecl(int i) {
			return getRuleContext(UpdateDeclContext.class,i);
		}
		public List<SimlnpContext> simlnp() {
			return getRuleContexts(SimlnpContext.class);
		}
		public SimlnpContext simlnp(int i) {
			return getRuleContext(SimlnpContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(T__0);
			setState(11);
			((StartContext)_localctx).id = match(IDENTIFIER);
			setState(12);
			match(T__1);
			setState(14); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(13);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((StartContext)_localctx).id1.add(((StartContext)_localctx).IDENTIFIER);
				}
				}
				setState(16); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(18);
			match(T__2);
			setState(20); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(19);
				((StartContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((StartContext)_localctx).id2.add(((StartContext)_localctx).IDENTIFIER);
				}
				}
				setState(22); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				((StartContext)_localctx).latchDec = latchDec();
				((StartContext)_localctx).latch.add(((StartContext)_localctx).latchDec);
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__5 );
			setState(29);
			match(T__3);
			setState(31); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(30);
				((StartContext)_localctx).updateDecl = updateDecl();
				((StartContext)_localctx).update.add(((StartContext)_localctx).updateDecl);
				}
				}
				setState(33); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(35);
			match(T__4);
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				((StartContext)_localctx).simlnp = simlnp();
				((StartContext)_localctx).simulate.add(((StartContext)_localctx).simlnp);
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
			setState(41);
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

	public static class LatchDecContext extends ParserRuleContext {
		public LatchDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latchDec; }
	 
		public LatchDecContext() { }
		public void copyFrom(LatchDecContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LatchContext extends LatchDecContext {
		public ExprContext id1;
		public ExprContext id2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public LatchContext(LatchDecContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterLatch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitLatch(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitLatch(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchDecContext latchDec() throws RecognitionException {
		LatchDecContext _localctx = new LatchDecContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_latchDec);
		try {
			_localctx = new LatchContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__5);
			setState(44);
			((LatchContext)_localctx).id1 = expr(0);
			setState(45);
			match(T__6);
			setState(46);
			((LatchContext)_localctx).id2 = expr(0);
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

	public static class UpdateDeclContext extends ParserRuleContext {
		public UpdateDeclContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateDecl; }
	 
		public UpdateDeclContext() { }
		public void copyFrom(UpdateDeclContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class UpdateContext extends UpdateDeclContext {
		public Token x1;
		public ExprContext e1;
		public TerminalNode IDENTIFIER() { return getToken(implParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UpdateContext(UpdateDeclContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterUpdate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitUpdate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitUpdate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateDeclContext updateDecl() throws RecognitionException {
		UpdateDeclContext _localctx = new UpdateDeclContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_updateDecl);
		try {
			_localctx = new UpdateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			((UpdateContext)_localctx).x1 = match(IDENTIFIER);
			setState(49);
			match(T__7);
			setState(50);
			((UpdateContext)_localctx).e1 = expr(0);
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

	public static class SimlnpContext extends ParserRuleContext {
		public SimlnpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simlnp; }
	 
		public SimlnpContext() { }
		public void copyFrom(SimlnpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SimulateContext extends SimlnpContext {
		public Token id;
		public Token c;
		public TerminalNode IDENTIFIER() { return getToken(implParser.IDENTIFIER, 0); }
		public TerminalNode SIGNALS() { return getToken(implParser.SIGNALS, 0); }
		public SimulateContext(SimlnpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterSimulate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitSimulate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitSimulate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimlnpContext simlnp() throws RecognitionException {
		SimlnpContext _localctx = new SimlnpContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_simlnp);
		try {
			_localctx = new SimulateContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			((SimulateContext)_localctx).id = match(IDENTIFIER);
			setState(53);
			match(T__7);
			setState(54);
			((SimulateContext)_localctx).c = match(SIGNALS);
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
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParanthesesContext extends ExprContext {
		public ExprContext e1;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParanthesesContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterParantheses(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitParantheses(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitParantheses(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(implParser.IDENTIFIER, 0); }
		public VariableContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ORContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ORContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterOR(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitOR(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitOR(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NegationContext extends ExprContext {
		public ExprContext e1;
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NegationContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterNegation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitNegation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitNegation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ANDContext extends ExprContext {
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ANDContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterAND(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitAND(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitAND(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SIGNALSContext extends ExprContext {
		public Token c;
		public TerminalNode SIGNALS() { return getToken(implParser.SIGNALS, 0); }
		public SIGNALSContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterSIGNALS(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitSIGNALS(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitSIGNALS(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				_localctx = new ParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(57);
				match(T__8);
				setState(58);
				((ParanthesesContext)_localctx).e1 = expr(0);
				setState(59);
				match(T__9);
				}
				break;
			case SIGNALS:
				{
				_localctx = new SIGNALSContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(61);
				((SIGNALSContext)_localctx).c = match(SIGNALS);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(62);
				((VariableContext)_localctx).id = match(IDENTIFIER);
				}
				break;
			case T__10:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(T__10);
				setState(64);
				((NegationContext)_localctx).e1 = expr(3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(75);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(73);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
					case 1:
						{
						_localctx = new ANDContext(new ExprContext(_parentctx, _parentState));
						((ANDContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(67);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(68);
						match(T__11);
						setState(69);
						((ANDContext)_localctx).e2 = expr(3);
						}
						break;
					case 2:
						{
						_localctx = new ORContext(new ExprContext(_parentctx, _parentState));
						((ORContext)_localctx).e1 = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(70);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(71);
						match(T__12);
						setState(72);
						((ORContext)_localctx).e2 = expr(2);
						}
						break;
					}
					} 
				}
				setState(77);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 4:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0012O\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0004\u0000\u000f\b\u0000\u000b"+
		"\u0000\f\u0000\u0010\u0001\u0000\u0001\u0000\u0004\u0000\u0015\b\u0000"+
		"\u000b\u0000\f\u0000\u0016\u0001\u0000\u0004\u0000\u001a\b\u0000\u000b"+
		"\u0000\f\u0000\u001b\u0001\u0000\u0001\u0000\u0004\u0000 \b\u0000\u000b"+
		"\u0000\f\u0000!\u0001\u0000\u0001\u0000\u0004\u0000&\b\u0000\u000b\u0000"+
		"\f\u0000\'\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0003\u0004B\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004J\b\u0004\n\u0004\f\u0004"+
		"M\t\u0004\u0001\u0004\u0000\u0001\b\u0005\u0000\u0002\u0004\u0006\b\u0000"+
		"\u0000S\u0000\n\u0001\u0000\u0000\u0000\u0002+\u0001\u0000\u0000\u0000"+
		"\u00040\u0001\u0000\u0000\u0000\u00064\u0001\u0000\u0000\u0000\bA\u0001"+
		"\u0000\u0000\u0000\n\u000b\u0005\u0001\u0000\u0000\u000b\f\u0005\u000e"+
		"\u0000\u0000\f\u000e\u0005\u0002\u0000\u0000\r\u000f\u0005\u000e\u0000"+
		"\u0000\u000e\r\u0001\u0000\u0000\u0000\u000f\u0010\u0001\u0000\u0000\u0000"+
		"\u0010\u000e\u0001\u0000\u0000\u0000\u0010\u0011\u0001\u0000\u0000\u0000"+
		"\u0011\u0012\u0001\u0000\u0000\u0000\u0012\u0014\u0005\u0003\u0000\u0000"+
		"\u0013\u0015\u0005\u000e\u0000\u0000\u0014\u0013\u0001\u0000\u0000\u0000"+
		"\u0015\u0016\u0001\u0000\u0000\u0000\u0016\u0014\u0001\u0000\u0000\u0000"+
		"\u0016\u0017\u0001\u0000\u0000\u0000\u0017\u0019\u0001\u0000\u0000\u0000"+
		"\u0018\u001a\u0003\u0002\u0001\u0000\u0019\u0018\u0001\u0000\u0000\u0000"+
		"\u001a\u001b\u0001\u0000\u0000\u0000\u001b\u0019\u0001\u0000\u0000\u0000"+
		"\u001b\u001c\u0001\u0000\u0000\u0000\u001c\u001d\u0001\u0000\u0000\u0000"+
		"\u001d\u001f\u0005\u0004\u0000\u0000\u001e \u0003\u0004\u0002\u0000\u001f"+
		"\u001e\u0001\u0000\u0000\u0000 !\u0001\u0000\u0000\u0000!\u001f\u0001"+
		"\u0000\u0000\u0000!\"\u0001\u0000\u0000\u0000\"#\u0001\u0000\u0000\u0000"+
		"#%\u0005\u0005\u0000\u0000$&\u0003\u0006\u0003\u0000%$\u0001\u0000\u0000"+
		"\u0000&\'\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001"+
		"\u0000\u0000\u0000()\u0001\u0000\u0000\u0000)*\u0005\u0000\u0000\u0001"+
		"*\u0001\u0001\u0000\u0000\u0000+,\u0005\u0006\u0000\u0000,-\u0003\b\u0004"+
		"\u0000-.\u0005\u0007\u0000\u0000./\u0003\b\u0004\u0000/\u0003\u0001\u0000"+
		"\u0000\u000001\u0005\u000e\u0000\u000012\u0005\b\u0000\u000023\u0003\b"+
		"\u0004\u00003\u0005\u0001\u0000\u0000\u000045\u0005\u000e\u0000\u0000"+
		"56\u0005\b\u0000\u000067\u0005\u000f\u0000\u00007\u0007\u0001\u0000\u0000"+
		"\u000089\u0006\u0004\uffff\uffff\u00009:\u0005\t\u0000\u0000:;\u0003\b"+
		"\u0004\u0000;<\u0005\n\u0000\u0000<B\u0001\u0000\u0000\u0000=B\u0005\u000f"+
		"\u0000\u0000>B\u0005\u000e\u0000\u0000?@\u0005\u000b\u0000\u0000@B\u0003"+
		"\b\u0004\u0003A8\u0001\u0000\u0000\u0000A=\u0001\u0000\u0000\u0000A>\u0001"+
		"\u0000\u0000\u0000A?\u0001\u0000\u0000\u0000BK\u0001\u0000\u0000\u0000"+
		"CD\n\u0002\u0000\u0000DE\u0005\f\u0000\u0000EJ\u0003\b\u0004\u0003FG\n"+
		"\u0001\u0000\u0000GH\u0005\r\u0000\u0000HJ\u0003\b\u0004\u0002IC\u0001"+
		"\u0000\u0000\u0000IF\u0001\u0000\u0000\u0000JM\u0001\u0000\u0000\u0000"+
		"KI\u0001\u0000\u0000\u0000KL\u0001\u0000\u0000\u0000L\t\u0001\u0000\u0000"+
		"\u0000MK\u0001\u0000\u0000\u0000\b\u0010\u0016\u001b!\'AIK";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}