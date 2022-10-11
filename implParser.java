// Generated from C:/Users/Emjay/Desktop/HardwareSimulator\impl.g4 by ANTLR 4.10.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class implParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, IDENTIFIER=16, 
		CONST=17, HVIDRUM=18, KOMMENTAR=19, MULTILINECOMMENTS=20;
	public static final int
		RULE_start = 0, RULE_hardware = 1, RULE_inputs = 2, RULE_outputs = 3, 
		RULE_latchDec = 4, RULE_update = 5, RULE_updateDec = 6, RULE_simulate = 7, 
		RULE_simlnp = 8, RULE_expr = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "hardware", "inputs", "outputs", "latchDec", "update", "updateDec", 
			"simulate", "simlnp", "expr"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'.hardware'", "'.inputs'", "'.outputs'", "'.latch'", "'->'", "'.update'", 
			"'='", "'.simulate'", "'('", "')'", "'0'", "'1'", "'!'", "'&&'", "'||'"
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
		public HardwareContext hardware() {
			return getRuleContext(HardwareContext.class,0);
		}
		public InputsContext inputs() {
			return getRuleContext(InputsContext.class,0);
		}
		public OutputsContext outputs() {
			return getRuleContext(OutputsContext.class,0);
		}
		public UpdateContext update() {
			return getRuleContext(UpdateContext.class,0);
		}
		public SimlnpContext simlnp() {
			return getRuleContext(SimlnpContext.class,0);
		}
		public TerminalNode EOF() { return getToken(implParser.EOF, 0); }
		public List<LatchDecContext> latchDec() {
			return getRuleContexts(LatchDecContext.class);
		}
		public LatchDecContext latchDec(int i) {
			return getRuleContext(LatchDecContext.class,i);
		}
		public List<UpdateDecContext> updateDec() {
			return getRuleContexts(UpdateDecContext.class);
		}
		public UpdateDecContext updateDec(int i) {
			return getRuleContext(UpdateDecContext.class,i);
		}
		public List<SimulateContext> simulate() {
			return getRuleContexts(SimulateContext.class);
		}
		public SimulateContext simulate(int i) {
			return getRuleContext(SimulateContext.class,i);
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
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			hardware();
			setState(21);
			inputs();
			setState(22);
			outputs();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__3) {
				{
				{
				setState(23);
				latchDec();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(29);
			update();
			setState(33);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(30);
					updateDec();
					}
					} 
				}
				setState(35);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__7) {
				{
				{
				setState(36);
				simulate();
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(42);
			simlnp();
			setState(43);
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

	public static class HardwareContext extends ParserRuleContext {
		public Token id;
		public TerminalNode IDENTIFIER() { return getToken(implParser.IDENTIFIER, 0); }
		public HardwareContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hardware; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterHardware(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitHardware(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitHardware(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HardwareContext hardware() throws RecognitionException {
		HardwareContext _localctx = new HardwareContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_hardware);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			match(T__0);
			setState(46);
			((HardwareContext)_localctx).id = match(IDENTIFIER);
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

	public static class InputsContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public List<Token> id = new ArrayList<Token>();
		public List<TerminalNode> IDENTIFIER() { return getTokens(implParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(implParser.IDENTIFIER, i);
		}
		public InputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterInputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitInputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitInputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InputsContext inputs() throws RecognitionException {
		InputsContext _localctx = new InputsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_inputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(48);
			match(T__1);
			setState(50); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(49);
				((InputsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((InputsContext)_localctx).id.add(((InputsContext)_localctx).IDENTIFIER);
				}
				}
				setState(52); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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

	public static class OutputsContext extends ParserRuleContext {
		public Token IDENTIFIER;
		public List<Token> id = new ArrayList<Token>();
		public List<TerminalNode> IDENTIFIER() { return getTokens(implParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(implParser.IDENTIFIER, i);
		}
		public OutputsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterOutputs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitOutputs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitOutputs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OutputsContext outputs() throws RecognitionException {
		OutputsContext _localctx = new OutputsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_outputs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(T__2);
			setState(56); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(55);
				((OutputsContext)_localctx).IDENTIFIER = match(IDENTIFIER);
				((OutputsContext)_localctx).id.add(((OutputsContext)_localctx).IDENTIFIER);
				}
				}
				setState(58); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==IDENTIFIER );
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
		public Token id1;
		public Token id2;
		public List<TerminalNode> IDENTIFIER() { return getTokens(implParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(implParser.IDENTIFIER, i);
		}
		public LatchDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_latchDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterLatchDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitLatchDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitLatchDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LatchDecContext latchDec() throws RecognitionException {
		LatchDecContext _localctx = new LatchDecContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_latchDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(60);
			match(T__3);
			setState(61);
			((LatchDecContext)_localctx).id1 = match(IDENTIFIER);
			setState(62);
			match(T__4);
			setState(63);
			((LatchDecContext)_localctx).id2 = match(IDENTIFIER);
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

	public static class UpdateContext extends ParserRuleContext {
		public UpdateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_update; }
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

	public final UpdateContext update() throws RecognitionException {
		UpdateContext _localctx = new UpdateContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_update);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
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

	public static class UpdateDecContext extends ParserRuleContext {
		public Token x1;
		public ExprContext e1;
		public TerminalNode IDENTIFIER() { return getToken(implParser.IDENTIFIER, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UpdateDecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_updateDec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterUpdateDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitUpdateDec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitUpdateDec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UpdateDecContext updateDec() throws RecognitionException {
		UpdateDecContext _localctx = new UpdateDecContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_updateDec);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			((UpdateDecContext)_localctx).x1 = match(IDENTIFIER);
			setState(68);
			match(T__6);
			setState(69);
			((UpdateDecContext)_localctx).e1 = expr(0);
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

	public static class SimulateContext extends ParserRuleContext {
		public SimulateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simulate; }
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

	public final SimulateContext simulate() throws RecognitionException {
		SimulateContext _localctx = new SimulateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_simulate);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(71);
			match(T__7);
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
		public Token x1;
		public Token c;
		public TerminalNode IDENTIFIER() { return getToken(implParser.IDENTIFIER, 0); }
		public TerminalNode CONST() { return getToken(implParser.CONST, 0); }
		public SimlnpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simlnp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterSimlnp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitSimlnp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitSimlnp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimlnpContext simlnp() throws RecognitionException {
		SimlnpContext _localctx = new SimlnpContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_simlnp);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			((SimlnpContext)_localctx).x1 = match(IDENTIFIER);
			setState(74);
			match(T__6);
			setState(75);
			((SimlnpContext)_localctx).c = match(CONST);
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
	public static class ConditionContext extends ExprContext {
		public ExprContext e1;
		public Token con;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ConditionContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitCondition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitCondition(this);
			else return visitor.visitChildren(this);
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
	public static class SignalContext extends ExprContext {
		public Token b1;
		public SignalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterSignal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitSignal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitSignal(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class VariableContext extends ExprContext {
		public Token x1;
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
	public static class ConstContext extends ExprContext {
		public Token c;
		public TerminalNode CONST() { return getToken(implParser.CONST, 0); }
		public ConstContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).enterConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof implListener ) ((implListener)listener).exitConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof implVisitor ) return ((implVisitor<? extends T>)visitor).visitConst(this);
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
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__8:
				{
				_localctx = new ParanthesesContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(78);
				match(T__8);
				setState(79);
				((ParanthesesContext)_localctx).e1 = expr(0);
				setState(80);
				match(T__9);
				}
				break;
			case T__10:
			case T__11:
				{
				_localctx = new SignalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(82);
				((SignalContext)_localctx).b1 = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==T__10 || _la==T__11) ) {
					((SignalContext)_localctx).b1 = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case CONST:
				{
				_localctx = new ConstContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(83);
				((ConstContext)_localctx).c = match(CONST);
				}
				break;
			case IDENTIFIER:
				{
				_localctx = new VariableContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(84);
				((VariableContext)_localctx).x1 = match(IDENTIFIER);
				}
				break;
			case T__12:
				{
				_localctx = new NegationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(85);
				match(T__12);
				setState(86);
				((NegationContext)_localctx).e1 = expr(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(94);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new ConditionContext(new ExprContext(_parentctx, _parentState));
					((ConditionContext)_localctx).e1 = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_expr);
					setState(89);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(90);
					((ConditionContext)_localctx).con = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__13 || _la==T__14) ) {
						((ConditionContext)_localctx).con = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(91);
					((ConditionContext)_localctx).e2 = expr(2);
					}
					} 
				}
				setState(96);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
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
		case 9:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u0014b\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0005\u0000\u0019\b\u0000\n\u0000\f\u0000\u001c\t\u0000\u0001\u0000\u0001"+
		"\u0000\u0005\u0000 \b\u0000\n\u0000\f\u0000#\t\u0000\u0001\u0000\u0005"+
		"\u0000&\b\u0000\n\u0000\f\u0000)\t\u0000\u0001\u0000\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0004"+
		"\u00023\b\u0002\u000b\u0002\f\u00024\u0001\u0003\u0001\u0003\u0004\u0003"+
		"9\b\u0003\u000b\u0003\f\u0003:\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0007\u0001\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0003\tX\b\t\u0001\t\u0001\t\u0001\t\u0005\t]\b\t\n\t\f\t`"+
		"\t\t\u0001\t\u0000\u0001\u0012\n\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010"+
		"\u0012\u0000\u0002\u0001\u0000\u000b\f\u0001\u0000\u000e\u000fa\u0000"+
		"\u0014\u0001\u0000\u0000\u0000\u0002-\u0001\u0000\u0000\u0000\u00040\u0001"+
		"\u0000\u0000\u0000\u00066\u0001\u0000\u0000\u0000\b<\u0001\u0000\u0000"+
		"\u0000\nA\u0001\u0000\u0000\u0000\fC\u0001\u0000\u0000\u0000\u000eG\u0001"+
		"\u0000\u0000\u0000\u0010I\u0001\u0000\u0000\u0000\u0012W\u0001\u0000\u0000"+
		"\u0000\u0014\u0015\u0003\u0002\u0001\u0000\u0015\u0016\u0003\u0004\u0002"+
		"\u0000\u0016\u001a\u0003\u0006\u0003\u0000\u0017\u0019\u0003\b\u0004\u0000"+
		"\u0018\u0017\u0001\u0000\u0000\u0000\u0019\u001c\u0001\u0000\u0000\u0000"+
		"\u001a\u0018\u0001\u0000\u0000\u0000\u001a\u001b\u0001\u0000\u0000\u0000"+
		"\u001b\u001d\u0001\u0000\u0000\u0000\u001c\u001a\u0001\u0000\u0000\u0000"+
		"\u001d!\u0003\n\u0005\u0000\u001e \u0003\f\u0006\u0000\u001f\u001e\u0001"+
		"\u0000\u0000\u0000 #\u0001\u0000\u0000\u0000!\u001f\u0001\u0000\u0000"+
		"\u0000!\"\u0001\u0000\u0000\u0000\"\'\u0001\u0000\u0000\u0000#!\u0001"+
		"\u0000\u0000\u0000$&\u0003\u000e\u0007\u0000%$\u0001\u0000\u0000\u0000"+
		"&)\u0001\u0000\u0000\u0000\'%\u0001\u0000\u0000\u0000\'(\u0001\u0000\u0000"+
		"\u0000(*\u0001\u0000\u0000\u0000)\'\u0001\u0000\u0000\u0000*+\u0003\u0010"+
		"\b\u0000+,\u0005\u0000\u0000\u0001,\u0001\u0001\u0000\u0000\u0000-.\u0005"+
		"\u0001\u0000\u0000./\u0005\u0010\u0000\u0000/\u0003\u0001\u0000\u0000"+
		"\u000002\u0005\u0002\u0000\u000013\u0005\u0010\u0000\u000021\u0001\u0000"+
		"\u0000\u000034\u0001\u0000\u0000\u000042\u0001\u0000\u0000\u000045\u0001"+
		"\u0000\u0000\u00005\u0005\u0001\u0000\u0000\u000068\u0005\u0003\u0000"+
		"\u000079\u0005\u0010\u0000\u000087\u0001\u0000\u0000\u00009:\u0001\u0000"+
		"\u0000\u0000:8\u0001\u0000\u0000\u0000:;\u0001\u0000\u0000\u0000;\u0007"+
		"\u0001\u0000\u0000\u0000<=\u0005\u0004\u0000\u0000=>\u0005\u0010\u0000"+
		"\u0000>?\u0005\u0005\u0000\u0000?@\u0005\u0010\u0000\u0000@\t\u0001\u0000"+
		"\u0000\u0000AB\u0005\u0006\u0000\u0000B\u000b\u0001\u0000\u0000\u0000"+
		"CD\u0005\u0010\u0000\u0000DE\u0005\u0007\u0000\u0000EF\u0003\u0012\t\u0000"+
		"F\r\u0001\u0000\u0000\u0000GH\u0005\b\u0000\u0000H\u000f\u0001\u0000\u0000"+
		"\u0000IJ\u0005\u0010\u0000\u0000JK\u0005\u0007\u0000\u0000KL\u0005\u0011"+
		"\u0000\u0000L\u0011\u0001\u0000\u0000\u0000MN\u0006\t\uffff\uffff\u0000"+
		"NO\u0005\t\u0000\u0000OP\u0003\u0012\t\u0000PQ\u0005\n\u0000\u0000QX\u0001"+
		"\u0000\u0000\u0000RX\u0007\u0000\u0000\u0000SX\u0005\u0011\u0000\u0000"+
		"TX\u0005\u0010\u0000\u0000UV\u0005\r\u0000\u0000VX\u0003\u0012\t\u0002"+
		"WM\u0001\u0000\u0000\u0000WR\u0001\u0000\u0000\u0000WS\u0001\u0000\u0000"+
		"\u0000WT\u0001\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000X^\u0001\u0000"+
		"\u0000\u0000YZ\n\u0001\u0000\u0000Z[\u0007\u0001\u0000\u0000[]\u0003\u0012"+
		"\t\u0002\\Y\u0001\u0000\u0000\u0000]`\u0001\u0000\u0000\u0000^\\\u0001"+
		"\u0000\u0000\u0000^_\u0001\u0000\u0000\u0000_\u0013\u0001\u0000\u0000"+
		"\u0000`^\u0001\u0000\u0000\u0000\u0007\u001a!\'4:W^";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}