package jp.hishidama.xtext.dmdl_editor.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDMDLLexer extends Lexer {
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int RULE_OCTAL_ESCAPE=12;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int RULE_DIGIT_CHAR=8;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int RULE_INT=6;
    public static final int RULE_BLANK_CHAR=10;
    public static final int RULE_DECIMAL=7;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int RULE_HEX_CHAR=11;
    public static final int RULE_SL_COMMENT=14;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int RULE_NAME_TOKEN=5;
    public static final int T__39=39;
    public static final int RULE_SYMBOL_CHAR=9;
    public static final int RULE_WS=15;

    // delegates
    // delegators

    public InternalDMDLLexer() {;} 
    public InternalDMDLLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalDMDLLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g"; }

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:11:7: ( '->' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:11:9: '->'
            {
            match("->"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:12:7: ( '=>' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:12:9: '=>'
            {
            match("=>"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:13:7: ( 'projective' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:13:9: 'projective'
            {
            match("projective"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:14:7: ( 'joined' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:14:9: 'joined'
            {
            match("joined"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:15:7: ( 'summarized' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:15:9: 'summarized'
            {
            match("summarized"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:16:7: ( 'INT' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:16:9: 'INT'
            {
            match("INT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:17:7: ( 'LONG' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:17:9: 'LONG'
            {
            match("LONG"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:18:7: ( 'BYTE' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:18:9: 'BYTE'
            {
            match("BYTE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:19:7: ( 'SHORT' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:19:9: 'SHORT'
            {
            match("SHORT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:20:7: ( 'DECIMAL' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:20:9: 'DECIMAL'
            {
            match("DECIMAL"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:21:7: ( 'FLOAT' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:21:9: 'FLOAT'
            {
            match("FLOAT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:22:7: ( 'DOUBLE' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:22:9: 'DOUBLE'
            {
            match("DOUBLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:23:7: ( 'TEXT' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:23:9: 'TEXT'
            {
            match("TEXT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:24:7: ( 'BOOLEAN' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:24:9: 'BOOLEAN'
            {
            match("BOOLEAN"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:25:7: ( 'DATE' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:25:9: 'DATE'
            {
            match("DATE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:26:7: ( 'DATETIME' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:26:9: 'DATETIME'
            {
            match("DATETIME"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:27:7: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:27:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:28:7: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:28:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:29:7: ( '+' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:29:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:30:7: ( '{' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:30:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:31:7: ( '}' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:31:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:32:7: ( ':' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:32:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:33:7: ( ',' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:33:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:34:7: ( '@' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:34:9: '@'
            {
            match('@'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:35:7: ( '(' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:35:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:36:7: ( ')' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:36:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:37:7: ( '%' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:37:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:38:7: ( '.' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:38:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "RULE_NAME_TOKEN"
    public final void mRULE_NAME_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_NAME_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7745:17: (~ ( ( RULE_DIGIT_CHAR | RULE_SYMBOL_CHAR | RULE_BLANK_CHAR ) ) (~ ( ( RULE_SYMBOL_CHAR | RULE_BLANK_CHAR ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7745:19: ~ ( ( RULE_DIGIT_CHAR | RULE_SYMBOL_CHAR | RULE_BLANK_CHAR ) ) (~ ( ( RULE_SYMBOL_CHAR | RULE_BLANK_CHAR ) ) )*
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='&'||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7745:73: (~ ( ( RULE_SYMBOL_CHAR | RULE_BLANK_CHAR ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\u001F')||LA1_0=='!'||(LA1_0>='#' && LA1_0<='$')||LA1_0=='&'||(LA1_0>='0' && LA1_0<='9')||LA1_0=='?'||(LA1_0>='A' && LA1_0<='z')||LA1_0=='|'||(LA1_0>='~' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7745:73: ~ ( ( RULE_SYMBOL_CHAR | RULE_BLANK_CHAR ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='&'||(input.LA(1)>='0' && input.LA(1)<='9')||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_NAME_TOKEN"

    // $ANTLR start "RULE_DIGIT_CHAR"
    public final void mRULE_DIGIT_CHAR() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7747:26: ( '0' .. '9' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7747:28: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_DIGIT_CHAR"

    // $ANTLR start "RULE_SYMBOL_CHAR"
    public final void mRULE_SYMBOL_CHAR() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7749:27: ( ( '=' | '{' | '}' | '%' | ':' | '<' | '>' | '@' | '.' | '(' | ')' | '\"' | '\\'' | ',' | '-' | '+' | '*' | '/' | ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7749:29: ( '=' | '{' | '}' | '%' | ':' | '<' | '>' | '@' | '.' | '(' | ')' | '\"' | '\\'' | ',' | '-' | '+' | '*' | '/' | ';' )
            {
            if ( input.LA(1)=='\"'||input.LA(1)=='%'||(input.LA(1)>='\'' && input.LA(1)<='/')||(input.LA(1)>=':' && input.LA(1)<='>')||input.LA(1)=='@'||input.LA(1)=='{'||input.LA(1)=='}' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_SYMBOL_CHAR"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7751:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\\\' ) | '\\\\u' RULE_HEX_CHAR RULE_HEX_CHAR RULE_HEX_CHAR RULE_HEX_CHAR | RULE_OCTAL_ESCAPE | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7751:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\\\' ) | '\\\\u' RULE_HEX_CHAR RULE_HEX_CHAR RULE_HEX_CHAR RULE_HEX_CHAR | RULE_OCTAL_ESCAPE | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7751:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\\\' ) | '\\\\u' RULE_HEX_CHAR RULE_HEX_CHAR RULE_HEX_CHAR RULE_HEX_CHAR | RULE_OCTAL_ESCAPE | ~ ( ( '\\\\' | '\"' ) ) )*
            loop2:
            do {
                int alt2=5;
                int LA2_0 = input.LA(1);

                if ( (LA2_0=='\\') ) {
                    switch ( input.LA(2) ) {
                    case '\"':
                    case '\\':
                    case 'b':
                    case 'f':
                    case 'n':
                    case 'r':
                    case 't':
                        {
                        alt2=1;
                        }
                        break;
                    case 'u':
                        {
                        alt2=2;
                        }
                        break;
                    case '0':
                        {
                        alt2=3;
                        }
                        break;

                    }

                }
                else if ( ((LA2_0>='\u0000' && LA2_0<='!')||(LA2_0>='#' && LA2_0<='[')||(LA2_0>=']' && LA2_0<='\uFFFF')) ) {
                    alt2=4;
                }


                switch (alt2) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7751:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\\\' )
            	    {
            	    match('\\'); 
            	    if ( input.LA(1)=='\"'||input.LA(1)=='\\'||input.LA(1)=='b'||input.LA(1)=='f'||input.LA(1)=='n'||input.LA(1)=='r'||input.LA(1)=='t' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;
            	case 2 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7751:56: '\\\\u' RULE_HEX_CHAR RULE_HEX_CHAR RULE_HEX_CHAR RULE_HEX_CHAR
            	    {
            	    match("\\u"); 

            	    mRULE_HEX_CHAR(); 
            	    mRULE_HEX_CHAR(); 
            	    mRULE_HEX_CHAR(); 
            	    mRULE_HEX_CHAR(); 

            	    }
            	    break;
            	case 3 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7751:118: RULE_OCTAL_ESCAPE
            	    {
            	    mRULE_OCTAL_ESCAPE(); 

            	    }
            	    break;
            	case 4 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7751:136: ~ ( ( '\\\\' | '\"' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_HEX_CHAR"
    public final void mRULE_HEX_CHAR() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7753:24: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7753:26: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
            {
            if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='F')||(input.LA(1)>='a' && input.LA(1)<='f') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_HEX_CHAR"

    // $ANTLR start "RULE_OCTAL_ESCAPE"
    public final void mRULE_OCTAL_ESCAPE() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7755:28: ( '\\\\0' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '3' '0' .. '7' '0' .. '7' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7755:30: '\\\\0' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '3' '0' .. '7' '0' .. '7' )
            {
            match("\\0"); 

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7755:36: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '3' '0' .. '7' '0' .. '7' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( ((LA3_0>='0' && LA3_0<='3')) ) {
                int LA3_1 = input.LA(2);

                if ( ((LA3_1>='0' && LA3_1<='7')) ) {
                    int LA3_3 = input.LA(3);

                    if ( ((LA3_3>='0' && LA3_3<='7')) ) {
                        alt3=3;
                    }
                    else {
                        alt3=2;}
                }
                else {
                    alt3=1;}
            }
            else if ( ((LA3_0>='4' && LA3_0<='7')) ) {
                int LA3_2 = input.LA(2);

                if ( ((LA3_2>='0' && LA3_2<='7')) ) {
                    alt3=2;
                }
                else {
                    alt3=1;}
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7755:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7755:46: '0' .. '7' '0' .. '7'
                    {
                    matchRange('0','7'); 
                    matchRange('0','7'); 

                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7755:64: '0' .. '3' '0' .. '7' '0' .. '7'
                    {
                    matchRange('0','3'); 
                    matchRange('0','7'); 
                    matchRange('0','7'); 

                    }
                    break;

            }


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_OCTAL_ESCAPE"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7757:10: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7757:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7757:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='0') ) {
                alt5=1;
            }
            else if ( ((LA5_0>='1' && LA5_0<='9')) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7757:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7757:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7757:26: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7757:27: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_DECIMAL"
    public final void mRULE_DECIMAL() throws RecognitionException {
        try {
            int _type = RULE_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7759:14: ( ( '.' ( '0' .. '9' )+ | '0.' ( '0' .. '9' )* | '1' .. '9' ( '0' .. '9' )* '.' ( '0' .. '9' )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7759:16: ( '.' ( '0' .. '9' )+ | '0.' ( '0' .. '9' )* | '1' .. '9' ( '0' .. '9' )* '.' ( '0' .. '9' )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7759:16: ( '.' ( '0' .. '9' )+ | '0.' ( '0' .. '9' )* | '1' .. '9' ( '0' .. '9' )* '.' ( '0' .. '9' )* )
            int alt10=3;
            switch ( input.LA(1) ) {
            case '.':
                {
                alt10=1;
                }
                break;
            case '0':
                {
                alt10=2;
                }
                break;
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
                {
                alt10=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7759:17: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7759:21: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>='0' && LA6_0<='9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7759:22: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7759:33: '0.' ( '0' .. '9' )*
                    {
                    match("0."); 

                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7759:38: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7759:39: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7759:50: '1' .. '9' ( '0' .. '9' )* '.' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7759:59: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7759:60: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('.'); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7759:75: ( '0' .. '9' )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7759:76: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_DECIMAL"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7761:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7761:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7761:24: ( options {greedy=false; } : . )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0=='*') ) {
                    int LA11_1 = input.LA(2);

                    if ( (LA11_1=='/') ) {
                        alt11=2;
                    }
                    else if ( ((LA11_1>='\u0000' && LA11_1<='.')||(LA11_1>='0' && LA11_1<='\uFFFF')) ) {
                        alt11=1;
                    }


                }
                else if ( ((LA11_0>='\u0000' && LA11_0<=')')||(LA11_0>='+' && LA11_0<='\uFFFF')) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7761:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7763:17: ( ( '//' | '--' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7763:19: ( '//' | '--' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7763:19: ( '//' | '--' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='/') ) {
                alt12=1;
            }
            else if ( (LA12_0=='-') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }
            switch (alt12) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7763:20: '//'
                    {
                    match("//"); 


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7763:25: '--'
                    {
                    match("--"); 


                    }
                    break;

            }

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7763:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7763:31: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7763:47: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7763:48: ( '\\r' )? '\\n'
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7763:48: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7763:48: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7765:9: ( ( RULE_BLANK_CHAR )+ )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7765:11: ( RULE_BLANK_CHAR )+
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7765:11: ( RULE_BLANK_CHAR )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0>='\t' && LA16_0<='\n')||LA16_0=='\r'||LA16_0==' ') ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7765:11: RULE_BLANK_CHAR
            	    {
            	    mRULE_BLANK_CHAR(); 

            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_BLANK_CHAR"
    public final void mRULE_BLANK_CHAR() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7767:26: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:7767:28: ( ' ' | '\\t' | '\\r' | '\\n' )
            {
            if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "RULE_BLANK_CHAR"

    public void mTokens() throws RecognitionException {
        // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_NAME_TOKEN | RULE_STRING | RULE_INT | RULE_DECIMAL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt17=35;
        alt17 = dfa17.predict(input);
        switch (alt17) {
            case 1 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:10: T__16
                {
                mT__16(); 

                }
                break;
            case 2 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:16: T__17
                {
                mT__17(); 

                }
                break;
            case 3 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:22: T__18
                {
                mT__18(); 

                }
                break;
            case 4 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:28: T__19
                {
                mT__19(); 

                }
                break;
            case 5 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:34: T__20
                {
                mT__20(); 

                }
                break;
            case 6 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:40: T__21
                {
                mT__21(); 

                }
                break;
            case 7 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:46: T__22
                {
                mT__22(); 

                }
                break;
            case 8 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:52: T__23
                {
                mT__23(); 

                }
                break;
            case 9 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:58: T__24
                {
                mT__24(); 

                }
                break;
            case 10 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:64: T__25
                {
                mT__25(); 

                }
                break;
            case 11 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:70: T__26
                {
                mT__26(); 

                }
                break;
            case 12 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:76: T__27
                {
                mT__27(); 

                }
                break;
            case 13 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:82: T__28
                {
                mT__28(); 

                }
                break;
            case 14 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:88: T__29
                {
                mT__29(); 

                }
                break;
            case 15 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:94: T__30
                {
                mT__30(); 

                }
                break;
            case 16 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:100: T__31
                {
                mT__31(); 

                }
                break;
            case 17 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:106: T__32
                {
                mT__32(); 

                }
                break;
            case 18 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:112: T__33
                {
                mT__33(); 

                }
                break;
            case 19 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:118: T__34
                {
                mT__34(); 

                }
                break;
            case 20 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:124: T__35
                {
                mT__35(); 

                }
                break;
            case 21 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:130: T__36
                {
                mT__36(); 

                }
                break;
            case 22 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:136: T__37
                {
                mT__37(); 

                }
                break;
            case 23 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:142: T__38
                {
                mT__38(); 

                }
                break;
            case 24 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:148: T__39
                {
                mT__39(); 

                }
                break;
            case 25 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:154: T__40
                {
                mT__40(); 

                }
                break;
            case 26 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:160: T__41
                {
                mT__41(); 

                }
                break;
            case 27 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:166: T__42
                {
                mT__42(); 

                }
                break;
            case 28 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:172: T__43
                {
                mT__43(); 

                }
                break;
            case 29 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:178: RULE_NAME_TOKEN
                {
                mRULE_NAME_TOKEN(); 

                }
                break;
            case 30 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:194: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 31 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:206: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 32 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:215: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 33 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:228: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 34 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:244: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 35 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:260: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\2\uffff\1\41\12\30\12\uffff\1\57\2\uffff\2\61\6\uffff\15\30\3"+
        "\uffff\1\61\1\uffff\3\30\1\104\14\30\1\uffff\1\121\1\122\4\30\1"+
        "\130\1\30\1\132\3\30\2\uffff\1\30\1\137\3\30\1\uffff\1\143\1\uffff"+
        "\1\30\1\145\2\30\1\uffff\1\30\1\151\1\30\1\uffff\1\30\1\uffff\1"+
        "\30\1\155\1\156\1\uffff\3\30\2\uffff\1\162\2\30\1\uffff\1\165\1"+
        "\166\2\uffff";
    static final String DFA17_eofS =
        "\167\uffff";
    static final String DFA17_minS =
        "\1\0\1\55\1\76\1\162\1\157\1\165\1\116\2\117\1\110\1\101\1\114"+
        "\1\105\12\uffff\1\60\2\uffff\2\56\1\52\5\uffff\1\157\1\151\1\155"+
        "\1\124\1\116\1\124\2\117\1\103\1\125\1\124\1\117\1\130\3\uffff\1"+
        "\56\1\uffff\1\152\1\156\1\155\1\0\1\107\1\105\1\114\1\122\1\111"+
        "\1\102\1\105\1\101\1\124\2\145\1\141\1\uffff\2\0\1\105\1\124\1\115"+
        "\1\114\1\0\1\124\1\0\1\143\1\144\1\162\2\uffff\1\101\1\0\1\101\1"+
        "\105\1\111\1\uffff\1\0\1\uffff\1\164\1\0\1\151\1\116\1\uffff\1\114"+
        "\1\0\1\115\1\uffff\1\151\1\uffff\1\172\2\0\1\uffff\1\105\1\166\1"+
        "\145\2\uffff\1\0\1\145\1\144\1\uffff\2\0\2\uffff";
    static final String DFA17_maxS =
        "\1\uffff\2\76\1\162\1\157\1\165\1\116\1\117\1\131\1\110\1\117\1"+
        "\114\1\105\12\uffff\1\71\2\uffff\1\56\1\71\1\57\5\uffff\1\157\1"+
        "\151\1\155\1\124\1\116\1\124\2\117\1\103\1\125\1\124\1\117\1\130"+
        "\3\uffff\1\71\1\uffff\1\152\1\156\1\155\1\uffff\1\107\1\105\1\114"+
        "\1\122\1\111\1\102\1\105\1\101\1\124\2\145\1\141\1\uffff\2\uffff"+
        "\1\105\1\124\1\115\1\114\1\uffff\1\124\1\uffff\1\143\1\144\1\162"+
        "\2\uffff\1\101\1\uffff\1\101\1\105\1\111\1\uffff\1\uffff\1\uffff"+
        "\1\164\1\uffff\1\151\1\116\1\uffff\1\114\1\uffff\1\115\1\uffff\1"+
        "\151\1\uffff\1\172\2\uffff\1\uffff\1\105\1\166\1\145\2\uffff\1\uffff"+
        "\1\145\1\144\1\uffff\2\uffff\2\uffff";
    static final String DFA17_acceptS =
        "\15\uffff\1\21\1\23\1\24\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\uffff"+
        "\1\35\1\36\3\uffff\1\43\1\1\1\42\1\2\1\22\15\uffff\1\34\1\40\1\37"+
        "\1\uffff\1\41\20\uffff\1\6\14\uffff\1\7\1\10\5\uffff\1\17\1\uffff"+
        "\1\15\4\uffff\1\11\3\uffff\1\13\1\uffff\1\4\3\uffff\1\14\3\uffff"+
        "\1\16\1\12\3\uffff\1\20\2\uffff\1\3\1\5";
    static final String DFA17_specialS =
        "\1\2\66\uffff\1\4\15\uffff\1\16\1\15\4\uffff\1\11\1\uffff\1\7\6"+
        "\uffff\1\14\4\uffff\1\12\2\uffff\1\1\4\uffff\1\10\5\uffff\1\6\1"+
        "\13\6\uffff\1\5\3\uffff\1\0\1\3\2\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\30\2\35\2\30\1\35\22\30\1\35\1\30\1\31\2\30\1\26\1\30\1"+
            "\uffff\1\24\1\25\1\uffff\1\16\1\22\1\1\1\27\1\34\1\32\11\33"+
            "\1\21\1\15\1\uffff\1\2\1\uffff\1\30\1\23\1\30\1\10\1\30\1\12"+
            "\1\30\1\13\2\30\1\6\2\30\1\7\6\30\1\11\1\14\25\30\1\4\5\30\1"+
            "\3\2\30\1\5\7\30\1\17\1\30\1\20\uff82\30",
            "\1\37\20\uffff\1\36",
            "\1\40",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\50\11\uffff\1\47",
            "\1\51",
            "\1\54\3\uffff\1\52\11\uffff\1\53",
            "\1\55",
            "\1\56",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\60",
            "",
            "",
            "\1\60",
            "\1\60\1\uffff\12\62",
            "\1\63\4\uffff\1\37",
            "",
            "",
            "",
            "",
            "",
            "\1\64",
            "\1\65",
            "\1\66",
            "\1\67",
            "\1\70",
            "\1\71",
            "\1\72",
            "\1\73",
            "\1\74",
            "\1\75",
            "\1\76",
            "\1\77",
            "\1\100",
            "",
            "",
            "",
            "\1\60\1\uffff\12\62",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\1\105",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\23\30\1\127"+
            "\46\30\1\uffff\1\30\1\uffff\uff82\30",
            "\1\131",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "\1\136",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\1\140",
            "\1\141",
            "\1\142",
            "",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "",
            "\1\144",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\1\146",
            "\1\147",
            "",
            "\1\150",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\1\152",
            "",
            "\1\153",
            "",
            "\1\154",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\1\163",
            "\1\164",
            "",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "",
            ""
    };

    static final short[] DFA17_eot = DFA.unpackEncodedString(DFA17_eotS);
    static final short[] DFA17_eof = DFA.unpackEncodedString(DFA17_eofS);
    static final char[] DFA17_min = DFA.unpackEncodedStringToUnsignedChars(DFA17_minS);
    static final char[] DFA17_max = DFA.unpackEncodedStringToUnsignedChars(DFA17_maxS);
    static final short[] DFA17_accept = DFA.unpackEncodedString(DFA17_acceptS);
    static final short[] DFA17_special = DFA.unpackEncodedString(DFA17_specialS);
    static final short[][] DFA17_transition;

    static {
        int numStates = DFA17_transitionS.length;
        DFA17_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA17_transition[i] = DFA.unpackEncodedString(DFA17_transitionS[i]);
        }
    }

    class DFA17 extends DFA {

        public DFA17(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 17;
            this.eot = DFA17_eot;
            this.eof = DFA17_eof;
            this.min = DFA17_min;
            this.max = DFA17_max;
            this.accept = DFA17_accept;
            this.special = DFA17_special;
            this.transition = DFA17_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | RULE_NAME_TOKEN | RULE_STRING | RULE_INT | RULE_DECIMAL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_115 = input.LA(1);

                        s = -1;
                        if ( ((LA17_115>='\u0000' && LA17_115<='\b')||(LA17_115>='\u000B' && LA17_115<='\f')||(LA17_115>='\u000E' && LA17_115<='\u001F')||LA17_115=='!'||(LA17_115>='#' && LA17_115<='$')||LA17_115=='&'||(LA17_115>='0' && LA17_115<='9')||LA17_115=='?'||(LA17_115>='A' && LA17_115<='z')||LA17_115=='|'||(LA17_115>='~' && LA17_115<='\uFFFF')) ) {s = 24;}

                        else s = 117;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_92 = input.LA(1);

                        s = -1;
                        if ( ((LA17_92>='\u0000' && LA17_92<='\b')||(LA17_92>='\u000B' && LA17_92<='\f')||(LA17_92>='\u000E' && LA17_92<='\u001F')||LA17_92=='!'||(LA17_92>='#' && LA17_92<='$')||LA17_92=='&'||(LA17_92>='0' && LA17_92<='9')||LA17_92=='?'||(LA17_92>='A' && LA17_92<='z')||LA17_92=='|'||(LA17_92>='~' && LA17_92<='\uFFFF')) ) {s = 24;}

                        else s = 101;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_0 = input.LA(1);

                        s = -1;
                        if ( (LA17_0=='-') ) {s = 1;}

                        else if ( (LA17_0=='=') ) {s = 2;}

                        else if ( (LA17_0=='p') ) {s = 3;}

                        else if ( (LA17_0=='j') ) {s = 4;}

                        else if ( (LA17_0=='s') ) {s = 5;}

                        else if ( (LA17_0=='I') ) {s = 6;}

                        else if ( (LA17_0=='L') ) {s = 7;}

                        else if ( (LA17_0=='B') ) {s = 8;}

                        else if ( (LA17_0=='S') ) {s = 9;}

                        else if ( (LA17_0=='D') ) {s = 10;}

                        else if ( (LA17_0=='F') ) {s = 11;}

                        else if ( (LA17_0=='T') ) {s = 12;}

                        else if ( (LA17_0==';') ) {s = 13;}

                        else if ( (LA17_0=='+') ) {s = 14;}

                        else if ( (LA17_0=='{') ) {s = 15;}

                        else if ( (LA17_0=='}') ) {s = 16;}

                        else if ( (LA17_0==':') ) {s = 17;}

                        else if ( (LA17_0==',') ) {s = 18;}

                        else if ( (LA17_0=='@') ) {s = 19;}

                        else if ( (LA17_0=='(') ) {s = 20;}

                        else if ( (LA17_0==')') ) {s = 21;}

                        else if ( (LA17_0=='%') ) {s = 22;}

                        else if ( (LA17_0=='.') ) {s = 23;}

                        else if ( ((LA17_0>='\u0000' && LA17_0<='\b')||(LA17_0>='\u000B' && LA17_0<='\f')||(LA17_0>='\u000E' && LA17_0<='\u001F')||LA17_0=='!'||(LA17_0>='#' && LA17_0<='$')||LA17_0=='&'||LA17_0=='?'||LA17_0=='A'||LA17_0=='C'||LA17_0=='E'||(LA17_0>='G' && LA17_0<='H')||(LA17_0>='J' && LA17_0<='K')||(LA17_0>='M' && LA17_0<='R')||(LA17_0>='U' && LA17_0<='i')||(LA17_0>='k' && LA17_0<='o')||(LA17_0>='q' && LA17_0<='r')||(LA17_0>='t' && LA17_0<='z')||LA17_0=='|'||(LA17_0>='~' && LA17_0<='\uFFFF')) ) {s = 24;}

                        else if ( (LA17_0=='\"') ) {s = 25;}

                        else if ( (LA17_0=='0') ) {s = 26;}

                        else if ( ((LA17_0>='1' && LA17_0<='9')) ) {s = 27;}

                        else if ( (LA17_0=='/') ) {s = 28;}

                        else if ( ((LA17_0>='\t' && LA17_0<='\n')||LA17_0=='\r'||LA17_0==' ') ) {s = 29;}

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_116 = input.LA(1);

                        s = -1;
                        if ( ((LA17_116>='\u0000' && LA17_116<='\b')||(LA17_116>='\u000B' && LA17_116<='\f')||(LA17_116>='\u000E' && LA17_116<='\u001F')||LA17_116=='!'||(LA17_116>='#' && LA17_116<='$')||LA17_116=='&'||(LA17_116>='0' && LA17_116<='9')||LA17_116=='?'||(LA17_116>='A' && LA17_116<='z')||LA17_116=='|'||(LA17_116>='~' && LA17_116<='\uFFFF')) ) {s = 24;}

                        else s = 118;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_55 = input.LA(1);

                        s = -1;
                        if ( ((LA17_55>='\u0000' && LA17_55<='\b')||(LA17_55>='\u000B' && LA17_55<='\f')||(LA17_55>='\u000E' && LA17_55<='\u001F')||LA17_55=='!'||(LA17_55>='#' && LA17_55<='$')||LA17_55=='&'||(LA17_55>='0' && LA17_55<='9')||LA17_55=='?'||(LA17_55>='A' && LA17_55<='z')||LA17_55=='|'||(LA17_55>='~' && LA17_55<='\uFFFF')) ) {s = 24;}

                        else s = 68;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_111 = input.LA(1);

                        s = -1;
                        if ( ((LA17_111>='\u0000' && LA17_111<='\b')||(LA17_111>='\u000B' && LA17_111<='\f')||(LA17_111>='\u000E' && LA17_111<='\u001F')||LA17_111=='!'||(LA17_111>='#' && LA17_111<='$')||LA17_111=='&'||(LA17_111>='0' && LA17_111<='9')||LA17_111=='?'||(LA17_111>='A' && LA17_111<='z')||LA17_111=='|'||(LA17_111>='~' && LA17_111<='\uFFFF')) ) {s = 24;}

                        else s = 114;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_103 = input.LA(1);

                        s = -1;
                        if ( ((LA17_103>='\u0000' && LA17_103<='\b')||(LA17_103>='\u000B' && LA17_103<='\f')||(LA17_103>='\u000E' && LA17_103<='\u001F')||LA17_103=='!'||(LA17_103>='#' && LA17_103<='$')||LA17_103=='&'||(LA17_103>='0' && LA17_103<='9')||LA17_103=='?'||(LA17_103>='A' && LA17_103<='z')||LA17_103=='|'||(LA17_103>='~' && LA17_103<='\uFFFF')) ) {s = 24;}

                        else s = 109;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_77 = input.LA(1);

                        s = -1;
                        if ( ((LA17_77>='\u0000' && LA17_77<='\b')||(LA17_77>='\u000B' && LA17_77<='\f')||(LA17_77>='\u000E' && LA17_77<='\u001F')||LA17_77=='!'||(LA17_77>='#' && LA17_77<='$')||LA17_77=='&'||(LA17_77>='0' && LA17_77<='9')||LA17_77=='?'||(LA17_77>='A' && LA17_77<='z')||LA17_77=='|'||(LA17_77>='~' && LA17_77<='\uFFFF')) ) {s = 24;}

                        else s = 90;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_97 = input.LA(1);

                        s = -1;
                        if ( ((LA17_97>='\u0000' && LA17_97<='\b')||(LA17_97>='\u000B' && LA17_97<='\f')||(LA17_97>='\u000E' && LA17_97<='\u001F')||LA17_97=='!'||(LA17_97>='#' && LA17_97<='$')||LA17_97=='&'||(LA17_97>='0' && LA17_97<='9')||LA17_97=='?'||(LA17_97>='A' && LA17_97<='z')||LA17_97=='|'||(LA17_97>='~' && LA17_97<='\uFFFF')) ) {s = 24;}

                        else s = 105;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_75 = input.LA(1);

                        s = -1;
                        if ( (LA17_75=='T') ) {s = 87;}

                        else if ( ((LA17_75>='\u0000' && LA17_75<='\b')||(LA17_75>='\u000B' && LA17_75<='\f')||(LA17_75>='\u000E' && LA17_75<='\u001F')||LA17_75=='!'||(LA17_75>='#' && LA17_75<='$')||LA17_75=='&'||(LA17_75>='0' && LA17_75<='9')||LA17_75=='?'||(LA17_75>='A' && LA17_75<='S')||(LA17_75>='U' && LA17_75<='z')||LA17_75=='|'||(LA17_75>='~' && LA17_75<='\uFFFF')) ) {s = 24;}

                        else s = 88;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_89 = input.LA(1);

                        s = -1;
                        if ( ((LA17_89>='\u0000' && LA17_89<='\b')||(LA17_89>='\u000B' && LA17_89<='\f')||(LA17_89>='\u000E' && LA17_89<='\u001F')||LA17_89=='!'||(LA17_89>='#' && LA17_89<='$')||LA17_89=='&'||(LA17_89>='0' && LA17_89<='9')||LA17_89=='?'||(LA17_89>='A' && LA17_89<='z')||LA17_89=='|'||(LA17_89>='~' && LA17_89<='\uFFFF')) ) {s = 24;}

                        else s = 99;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_104 = input.LA(1);

                        s = -1;
                        if ( ((LA17_104>='\u0000' && LA17_104<='\b')||(LA17_104>='\u000B' && LA17_104<='\f')||(LA17_104>='\u000E' && LA17_104<='\u001F')||LA17_104=='!'||(LA17_104>='#' && LA17_104<='$')||LA17_104=='&'||(LA17_104>='0' && LA17_104<='9')||LA17_104=='?'||(LA17_104>='A' && LA17_104<='z')||LA17_104=='|'||(LA17_104>='~' && LA17_104<='\uFFFF')) ) {s = 24;}

                        else s = 110;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_84 = input.LA(1);

                        s = -1;
                        if ( ((LA17_84>='\u0000' && LA17_84<='\b')||(LA17_84>='\u000B' && LA17_84<='\f')||(LA17_84>='\u000E' && LA17_84<='\u001F')||LA17_84=='!'||(LA17_84>='#' && LA17_84<='$')||LA17_84=='&'||(LA17_84>='0' && LA17_84<='9')||LA17_84=='?'||(LA17_84>='A' && LA17_84<='z')||LA17_84=='|'||(LA17_84>='~' && LA17_84<='\uFFFF')) ) {s = 24;}

                        else s = 95;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_70 = input.LA(1);

                        s = -1;
                        if ( ((LA17_70>='\u0000' && LA17_70<='\b')||(LA17_70>='\u000B' && LA17_70<='\f')||(LA17_70>='\u000E' && LA17_70<='\u001F')||LA17_70=='!'||(LA17_70>='#' && LA17_70<='$')||LA17_70=='&'||(LA17_70>='0' && LA17_70<='9')||LA17_70=='?'||(LA17_70>='A' && LA17_70<='z')||LA17_70=='|'||(LA17_70>='~' && LA17_70<='\uFFFF')) ) {s = 24;}

                        else s = 82;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_69 = input.LA(1);

                        s = -1;
                        if ( ((LA17_69>='\u0000' && LA17_69<='\b')||(LA17_69>='\u000B' && LA17_69<='\f')||(LA17_69>='\u000E' && LA17_69<='\u001F')||LA17_69=='!'||(LA17_69>='#' && LA17_69<='$')||LA17_69=='&'||(LA17_69>='0' && LA17_69<='9')||LA17_69=='?'||(LA17_69>='A' && LA17_69<='z')||LA17_69=='|'||(LA17_69>='~' && LA17_69<='\uFFFF')) ) {s = 24;}

                        else s = 81;

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}