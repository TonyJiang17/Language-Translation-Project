// Generated from forloopFinal.g4 by ANTLR 4.7
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class forloopFinalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, Var=7, I1=8, WS=9;
	public static final int
		RULE_prog = 0, RULE_doexpr = 1, RULE_asgnexpr = 2, RULE_bodyexpr = 3;
	public static final String[] ruleNames = {
		"prog", "doexpr", "asgnexpr", "bodyexpr"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'end'", "';'", "'do'", "'to'", "'='", "'put'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "Var", "I1", "WS"
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
	public String getGrammarFileName() { return "forloopFinal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public forloopFinalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ProgContext extends ParserRuleContext {
		public DoexprContext doexpr() {
			return getRuleContext(DoexprContext.class,0);
		}
		public ProgContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_prog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof forloopFinalListener ) ((forloopFinalListener)listener).enterProg(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof forloopFinalListener ) ((forloopFinalListener)listener).exitProg(this);
		}
	}

	public final ProgContext prog() throws RecognitionException {
		ProgContext _localctx = new ProgContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_prog);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8);
			doexpr();
			setState(9);
			match(T__0);
			setState(10);
			match(T__1);
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

	public static class DoexprContext extends ParserRuleContext {
		public AsgnexprContext asgnexpr() {
			return getRuleContext(AsgnexprContext.class,0);
		}
		public TerminalNode I1() { return getToken(forloopFinalParser.I1, 0); }
		public BodyexprContext bodyexpr() {
			return getRuleContext(BodyexprContext.class,0);
		}
		public DoexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_doexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof forloopFinalListener ) ((forloopFinalListener)listener).enterDoexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof forloopFinalListener ) ((forloopFinalListener)listener).exitDoexpr(this);
		}
	}

	public final DoexprContext doexpr() throws RecognitionException {
		DoexprContext _localctx = new DoexprContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_doexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(12);
			match(T__2);
			}
			setState(13);
			asgnexpr();
			{
			setState(14);
			match(T__3);
			}
			setState(15);
			match(I1);
			setState(16);
			bodyexpr();
			setState(17);
			match(T__1);
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

	public static class AsgnexprContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(forloopFinalParser.Var, 0); }
		public TerminalNode I1() { return getToken(forloopFinalParser.I1, 0); }
		public AsgnexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_asgnexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof forloopFinalListener ) ((forloopFinalListener)listener).enterAsgnexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof forloopFinalListener ) ((forloopFinalListener)listener).exitAsgnexpr(this);
		}
	}

	public final AsgnexprContext asgnexpr() throws RecognitionException {
		AsgnexprContext _localctx = new AsgnexprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_asgnexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(19);
			match(Var);
			{
			setState(20);
			match(T__4);
			}
			setState(21);
			match(I1);
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

	public static class BodyexprContext extends ParserRuleContext {
		public TerminalNode Var() { return getToken(forloopFinalParser.Var, 0); }
		public BodyexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bodyexpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof forloopFinalListener ) ((forloopFinalListener)listener).enterBodyexpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof forloopFinalListener ) ((forloopFinalListener)listener).exitBodyexpr(this);
		}
	}

	public final BodyexprContext bodyexpr() throws RecognitionException {
		BodyexprContext _localctx = new BodyexprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_bodyexpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(23);
			match(T__5);
			}
			setState(24);
			match(Var);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\13\35\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3"+
		"\4\3\4\3\4\3\5\3\5\3\5\3\5\2\2\6\2\4\6\b\2\2\2\30\2\n\3\2\2\2\4\16\3\2"+
		"\2\2\6\25\3\2\2\2\b\31\3\2\2\2\n\13\5\4\3\2\13\f\7\3\2\2\f\r\7\4\2\2\r"+
		"\3\3\2\2\2\16\17\7\5\2\2\17\20\5\6\4\2\20\21\7\6\2\2\21\22\7\n\2\2\22"+
		"\23\5\b\5\2\23\24\7\4\2\2\24\5\3\2\2\2\25\26\7\t\2\2\26\27\7\7\2\2\27"+
		"\30\7\n\2\2\30\7\3\2\2\2\31\32\7\b\2\2\32\33\7\t\2\2\33\t\3\2\2\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}