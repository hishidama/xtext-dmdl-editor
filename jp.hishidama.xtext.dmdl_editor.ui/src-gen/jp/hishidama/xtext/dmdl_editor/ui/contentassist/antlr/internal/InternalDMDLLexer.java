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
    public static final int T__44=44;
    public static final int T__45=45;
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
    public static final int RULE_SYMBOL_CHAR=9;
    public static final int T__39=39;
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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:27:7: ( 'TRUE' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:27:9: 'TRUE'
            {
            match("TRUE"); 


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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:28:7: ( 'FALSE' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:28:9: 'FALSE'
            {
            match("FALSE"); 


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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:29:7: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:29:9: ';'
            {
            match(';'); 

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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:30:7: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:30:9: '='
            {
            match('='); 

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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:31:7: ( '+' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:31:9: '+'
            {
            match('+'); 

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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:32:7: ( '{' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:32:9: '{'
            {
            match('{'); 

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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:33:7: ( '}' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:33:9: '}'
            {
            match('}'); 

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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:34:7: ( ':' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:34:9: ':'
            {
            match(':'); 

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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:35:7: ( '@' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:35:9: '@'
            {
            match('@'); 

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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:36:7: ( '(' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:36:9: '('
            {
            match('('); 

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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:37:7: ( ')' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:37:9: ')'
            {
            match(')'); 

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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:38:7: ( ',' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:38:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:39:7: ( '%' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:39:9: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:40:7: ( '.' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:40:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "RULE_NAME_TOKEN"
    public final void mRULE_NAME_TOKEN() throws RecognitionException {
        try {
            int _type = RULE_NAME_TOKEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5244:17: (~ ( ( RULE_DIGIT_CHAR | RULE_SYMBOL_CHAR | RULE_BLANK_CHAR ) ) (~ ( ( RULE_SYMBOL_CHAR | RULE_BLANK_CHAR ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5244:19: ~ ( ( RULE_DIGIT_CHAR | RULE_SYMBOL_CHAR | RULE_BLANK_CHAR ) ) (~ ( ( RULE_SYMBOL_CHAR | RULE_BLANK_CHAR ) ) )*
            {
            if ( (input.LA(1)>='\u0000' && input.LA(1)<='\b')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\u001F')||input.LA(1)=='!'||(input.LA(1)>='#' && input.LA(1)<='$')||input.LA(1)=='&'||input.LA(1)=='?'||(input.LA(1)>='A' && input.LA(1)<='z')||input.LA(1)=='|'||(input.LA(1)>='~' && input.LA(1)<='\uFFFF') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5244:73: (~ ( ( RULE_SYMBOL_CHAR | RULE_BLANK_CHAR ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>='\u0000' && LA1_0<='\b')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='\u001F')||LA1_0=='!'||(LA1_0>='#' && LA1_0<='$')||LA1_0=='&'||(LA1_0>='0' && LA1_0<='9')||LA1_0=='?'||(LA1_0>='A' && LA1_0<='z')||LA1_0=='|'||(LA1_0>='~' && LA1_0<='\uFFFF')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5244:73: ~ ( ( RULE_SYMBOL_CHAR | RULE_BLANK_CHAR ) )
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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5246:26: ( '0' .. '9' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5246:28: '0' .. '9'
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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5248:27: ( ( '=' | '{' | '}' | '%' | ':' | '<' | '>' | '@' | '.' | '(' | ')' | '\"' | '\\'' | ',' | '-' | '+' | '*' | '/' | ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5248:29: ( '=' | '{' | '}' | '%' | ':' | '<' | '>' | '@' | '.' | '(' | ')' | '\"' | '\\'' | ',' | '-' | '+' | '*' | '/' | ';' )
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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5250:13: ( '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\\\' ) | '\\\\u' RULE_HEX_CHAR RULE_HEX_CHAR RULE_HEX_CHAR RULE_HEX_CHAR | RULE_OCTAL_ESCAPE | ~ ( ( '\\\\' | '\"' ) ) )* '\"' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5250:15: '\"' ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\\\' ) | '\\\\u' RULE_HEX_CHAR RULE_HEX_CHAR RULE_HEX_CHAR RULE_HEX_CHAR | RULE_OCTAL_ESCAPE | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
            {
            match('\"'); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5250:19: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\\\' ) | '\\\\u' RULE_HEX_CHAR RULE_HEX_CHAR RULE_HEX_CHAR RULE_HEX_CHAR | RULE_OCTAL_ESCAPE | ~ ( ( '\\\\' | '\"' ) ) )*
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
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5250:20: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\\\' )
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
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5250:56: '\\\\u' RULE_HEX_CHAR RULE_HEX_CHAR RULE_HEX_CHAR RULE_HEX_CHAR
            	    {
            	    match("\\u"); 

            	    mRULE_HEX_CHAR(); 
            	    mRULE_HEX_CHAR(); 
            	    mRULE_HEX_CHAR(); 
            	    mRULE_HEX_CHAR(); 

            	    }
            	    break;
            	case 3 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5250:118: RULE_OCTAL_ESCAPE
            	    {
            	    mRULE_OCTAL_ESCAPE(); 

            	    }
            	    break;
            	case 4 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5250:136: ~ ( ( '\\\\' | '\"' ) )
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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5252:24: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5252:26: ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' )
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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5254:28: ( '\\\\0' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '3' '0' .. '7' '0' .. '7' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5254:30: '\\\\0' ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '3' '0' .. '7' '0' .. '7' )
            {
            match("\\0"); 

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5254:36: ( '0' .. '7' | '0' .. '7' '0' .. '7' | '0' .. '3' '0' .. '7' '0' .. '7' )
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5254:37: '0' .. '7'
                    {
                    matchRange('0','7'); 

                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5254:46: '0' .. '7' '0' .. '7'
                    {
                    matchRange('0','7'); 
                    matchRange('0','7'); 

                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5254:64: '0' .. '3' '0' .. '7' '0' .. '7'
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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5256:10: ( ( '0' | '1' .. '9' ( '0' .. '9' )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5256:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5256:12: ( '0' | '1' .. '9' ( '0' .. '9' )* )
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5256:13: '0'
                    {
                    match('0'); 

                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5256:17: '1' .. '9' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5256:26: ( '0' .. '9' )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( ((LA4_0>='0' && LA4_0<='9')) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5256:27: '0' .. '9'
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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5258:14: ( ( '.' ( '0' .. '9' )+ | '0.' ( '0' .. '9' )* | '1' .. '9' ( '0' .. '9' )* '.' ( '0' .. '9' )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5258:16: ( '.' ( '0' .. '9' )+ | '0.' ( '0' .. '9' )* | '1' .. '9' ( '0' .. '9' )* '.' ( '0' .. '9' )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5258:16: ( '.' ( '0' .. '9' )+ | '0.' ( '0' .. '9' )* | '1' .. '9' ( '0' .. '9' )* '.' ( '0' .. '9' )* )
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5258:17: '.' ( '0' .. '9' )+
                    {
                    match('.'); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5258:21: ( '0' .. '9' )+
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
                    	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5258:22: '0' .. '9'
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5258:33: '0.' ( '0' .. '9' )*
                    {
                    match("0."); 

                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5258:38: ( '0' .. '9' )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>='0' && LA7_0<='9')) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5258:39: '0' .. '9'
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5258:50: '1' .. '9' ( '0' .. '9' )* '.' ( '0' .. '9' )*
                    {
                    matchRange('1','9'); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5258:59: ( '0' .. '9' )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( ((LA8_0>='0' && LA8_0<='9')) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5258:60: '0' .. '9'
                    	    {
                    	    matchRange('0','9'); 

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);

                    match('.'); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5258:75: ( '0' .. '9' )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( ((LA9_0>='0' && LA9_0<='9')) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5258:76: '0' .. '9'
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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5260:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5260:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5260:24: ( options {greedy=false; } : . )*
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
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5260:52: .
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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5262:17: ( ( '//' | '--' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5262:19: ( '//' | '--' ) (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5262:19: ( '//' | '--' )
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5262:20: '//'
                    {
                    match("//"); 


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5262:25: '--'
                    {
                    match("--"); 


                    }
                    break;

            }

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5262:31: (~ ( ( '\\n' | '\\r' ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>='\u0000' && LA13_0<='\t')||(LA13_0>='\u000B' && LA13_0<='\f')||(LA13_0>='\u000E' && LA13_0<='\uFFFF')) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5262:31: ~ ( ( '\\n' | '\\r' ) )
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

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5262:47: ( ( '\\r' )? '\\n' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='\n'||LA15_0=='\r') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5262:48: ( '\\r' )? '\\n'
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5262:48: ( '\\r' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0=='\r') ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5262:48: '\\r'
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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5264:9: ( ( RULE_BLANK_CHAR )+ )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5264:11: ( RULE_BLANK_CHAR )+
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5264:11: ( RULE_BLANK_CHAR )+
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
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5264:11: RULE_BLANK_CHAR
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
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5266:26: ( ( ' ' | '\\t' | '\\r' | '\\n' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5266:28: ( ' ' | '\\t' | '\\r' | '\\n' )
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
        // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:8: ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_NAME_TOKEN | RULE_STRING | RULE_INT | RULE_DECIMAL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS )
        int alt17=37;
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
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:178: T__44
                {
                mT__44(); 

                }
                break;
            case 30 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:184: T__45
                {
                mT__45(); 

                }
                break;
            case 31 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:190: RULE_NAME_TOKEN
                {
                mRULE_NAME_TOKEN(); 

                }
                break;
            case 32 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:206: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 33 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:218: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:227: RULE_DECIMAL
                {
                mRULE_DECIMAL(); 

                }
                break;
            case 35 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:240: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:256: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1:272: RULE_WS
                {
                mRULE_WS(); 

                }
                break;

        }

    }


    protected DFA17 dfa17 = new DFA17(this);
    static final String DFA17_eotS =
        "\2\uffff\1\41\12\30\12\uffff\1\61\2\uffff\2\63\6\uffff\17\30\3"+
        "\uffff\1\63\1\uffff\3\30\1\110\16\30\1\uffff\1\127\1\130\4\30\1"+
        "\136\2\30\1\141\1\142\3\30\2\uffff\1\30\1\147\3\30\1\uffff\1\153"+
        "\1\154\2\uffff\1\30\1\156\2\30\1\uffff\1\30\1\162\1\30\2\uffff\1"+
        "\30\1\uffff\1\30\1\166\1\167\1\uffff\3\30\2\uffff\1\173\2\30\1\uffff"+
        "\1\176\1\177\2\uffff";
    static final String DFA17_eofS =
        "\u0080\uffff";
    static final String DFA17_minS =
        "\1\0\1\55\1\76\1\162\1\157\1\165\1\116\2\117\1\110\2\101\1\105"+
        "\12\uffff\1\60\2\uffff\2\56\1\52\5\uffff\1\157\1\151\1\155\1\124"+
        "\1\116\1\124\2\117\1\103\1\125\1\124\1\117\1\114\1\130\1\125\3\uffff"+
        "\1\56\1\uffff\1\152\1\156\1\155\1\0\1\107\1\105\1\114\1\122\1\111"+
        "\1\102\1\105\1\101\1\123\1\124\1\105\2\145\1\141\1\uffff\2\0\1\105"+
        "\1\124\1\115\1\114\1\0\1\124\1\105\2\0\1\143\1\144\1\162\2\uffff"+
        "\1\101\1\0\1\101\1\105\1\111\1\uffff\2\0\2\uffff\1\164\1\0\1\151"+
        "\1\116\1\uffff\1\114\1\0\1\115\2\uffff\1\151\1\uffff\1\172\2\0\1"+
        "\uffff\1\105\1\166\1\145\2\uffff\1\0\1\145\1\144\1\uffff\2\0\2\uffff";
    static final String DFA17_maxS =
        "\1\uffff\2\76\1\162\1\157\1\165\1\116\1\117\1\131\1\110\1\117\1"+
        "\114\1\122\12\uffff\1\71\2\uffff\1\56\1\71\1\57\5\uffff\1\157\1"+
        "\151\1\155\1\124\1\116\1\124\2\117\1\103\1\125\1\124\1\117\1\114"+
        "\1\130\1\125\3\uffff\1\71\1\uffff\1\152\1\156\1\155\1\uffff\1\107"+
        "\1\105\1\114\1\122\1\111\1\102\1\105\1\101\1\123\1\124\1\105\2\145"+
        "\1\141\1\uffff\2\uffff\1\105\1\124\1\115\1\114\1\uffff\1\124\1\105"+
        "\2\uffff\1\143\1\144\1\162\2\uffff\1\101\1\uffff\1\101\1\105\1\111"+
        "\1\uffff\2\uffff\2\uffff\1\164\1\uffff\1\151\1\116\1\uffff\1\114"+
        "\1\uffff\1\115\2\uffff\1\151\1\uffff\1\172\2\uffff\1\uffff\1\105"+
        "\1\166\1\145\2\uffff\1\uffff\1\145\1\144\1\uffff\2\uffff\2\uffff";
    static final String DFA17_acceptS =
        "\15\uffff\1\23\1\25\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\uffff"+
        "\1\37\1\40\3\uffff\1\45\1\1\1\44\1\2\1\24\17\uffff\1\36\1\42\1\41"+
        "\1\uffff\1\43\22\uffff\1\6\16\uffff\1\7\1\10\5\uffff\1\17\2\uffff"+
        "\1\15\1\21\4\uffff\1\11\3\uffff\1\13\1\22\1\uffff\1\4\3\uffff\1"+
        "\14\3\uffff\1\16\1\12\3\uffff\1\20\2\uffff\1\3\1\5";
    static final String DFA17_specialS =
        "\1\20\70\uffff\1\6\17\uffff\1\5\1\4\4\uffff\1\3\2\uffff\1\17\1"+
        "\14\6\uffff\1\2\4\uffff\1\0\1\11\3\uffff\1\10\4\uffff\1\16\6\uffff"+
        "\1\15\1\1\6\uffff\1\13\3\uffff\1\12\1\7\2\uffff}>";
    static final String[] DFA17_transitionS = {
            "\11\30\2\35\2\30\1\35\22\30\1\35\1\30\1\31\2\30\1\26\1\30\1"+
            "\uffff\1\23\1\24\1\uffff\1\16\1\25\1\1\1\27\1\34\1\32\11\33"+
            "\1\21\1\15\1\uffff\1\2\1\uffff\1\30\1\22\1\30\1\10\1\30\1\12"+
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
            "\1\56\12\uffff\1\55",
            "\1\57\14\uffff\1\60",
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
            "\12\62",
            "",
            "",
            "\1\62",
            "\1\62\1\uffff\12\64",
            "\1\65\4\uffff\1\37",
            "",
            "",
            "",
            "",
            "",
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
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "",
            "",
            "",
            "\1\62\1\uffff\12\64",
            "",
            "\1\105",
            "\1\106",
            "\1\107",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\1\111",
            "\1\112",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\23\30\1\135"+
            "\46\30\1\uffff\1\30\1\uffff\uff82\30",
            "\1\137",
            "\1\140",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\1\143",
            "\1\144",
            "\1\145",
            "",
            "",
            "\1\146",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\1\150",
            "\1\151",
            "\1\152",
            "",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "",
            "",
            "\1\155",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\1\157",
            "\1\160",
            "",
            "\1\161",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\1\163",
            "",
            "",
            "\1\164",
            "",
            "\1\165",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "",
            "\11\30\2\uffff\2\30\1\uffff\22\30\1\uffff\1\30\1\uffff\2\30"+
            "\1\uffff\1\30\11\uffff\12\30\5\uffff\1\30\1\uffff\72\30\1\uffff"+
            "\1\30\1\uffff\uff82\30",
            "\1\174",
            "\1\175",
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
            return "1:1: Tokens : ( T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | RULE_NAME_TOKEN | RULE_STRING | RULE_INT | RULE_DECIMAL | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA17_95 = input.LA(1);

                        s = -1;
                        if ( ((LA17_95>='\u0000' && LA17_95<='\b')||(LA17_95>='\u000B' && LA17_95<='\f')||(LA17_95>='\u000E' && LA17_95<='\u001F')||LA17_95=='!'||(LA17_95>='#' && LA17_95<='$')||LA17_95=='&'||(LA17_95>='0' && LA17_95<='9')||LA17_95=='?'||(LA17_95>='A' && LA17_95<='z')||LA17_95=='|'||(LA17_95>='~' && LA17_95<='\uFFFF')) ) {s = 24;}

                        else s = 107;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA17_113 = input.LA(1);

                        s = -1;
                        if ( ((LA17_113>='\u0000' && LA17_113<='\b')||(LA17_113>='\u000B' && LA17_113<='\f')||(LA17_113>='\u000E' && LA17_113<='\u001F')||LA17_113=='!'||(LA17_113>='#' && LA17_113<='$')||LA17_113=='&'||(LA17_113>='0' && LA17_113<='9')||LA17_113=='?'||(LA17_113>='A' && LA17_113<='z')||LA17_113=='|'||(LA17_113>='~' && LA17_113<='\uFFFF')) ) {s = 24;}

                        else s = 119;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA17_90 = input.LA(1);

                        s = -1;
                        if ( ((LA17_90>='\u0000' && LA17_90<='\b')||(LA17_90>='\u000B' && LA17_90<='\f')||(LA17_90>='\u000E' && LA17_90<='\u001F')||LA17_90=='!'||(LA17_90>='#' && LA17_90<='$')||LA17_90=='&'||(LA17_90>='0' && LA17_90<='9')||LA17_90=='?'||(LA17_90>='A' && LA17_90<='z')||LA17_90=='|'||(LA17_90>='~' && LA17_90<='\uFFFF')) ) {s = 24;}

                        else s = 103;

                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA17_79 = input.LA(1);

                        s = -1;
                        if ( (LA17_79=='T') ) {s = 93;}

                        else if ( ((LA17_79>='\u0000' && LA17_79<='\b')||(LA17_79>='\u000B' && LA17_79<='\f')||(LA17_79>='\u000E' && LA17_79<='\u001F')||LA17_79=='!'||(LA17_79>='#' && LA17_79<='$')||LA17_79=='&'||(LA17_79>='0' && LA17_79<='9')||LA17_79=='?'||(LA17_79>='A' && LA17_79<='S')||(LA17_79>='U' && LA17_79<='z')||LA17_79=='|'||(LA17_79>='~' && LA17_79<='\uFFFF')) ) {s = 24;}

                        else s = 94;

                        if ( s>=0 ) return s;
                        break;
                    case 4 : 
                        int LA17_74 = input.LA(1);

                        s = -1;
                        if ( ((LA17_74>='\u0000' && LA17_74<='\b')||(LA17_74>='\u000B' && LA17_74<='\f')||(LA17_74>='\u000E' && LA17_74<='\u001F')||LA17_74=='!'||(LA17_74>='#' && LA17_74<='$')||LA17_74=='&'||(LA17_74>='0' && LA17_74<='9')||LA17_74=='?'||(LA17_74>='A' && LA17_74<='z')||LA17_74=='|'||(LA17_74>='~' && LA17_74<='\uFFFF')) ) {s = 24;}

                        else s = 88;

                        if ( s>=0 ) return s;
                        break;
                    case 5 : 
                        int LA17_73 = input.LA(1);

                        s = -1;
                        if ( ((LA17_73>='\u0000' && LA17_73<='\b')||(LA17_73>='\u000B' && LA17_73<='\f')||(LA17_73>='\u000E' && LA17_73<='\u001F')||LA17_73=='!'||(LA17_73>='#' && LA17_73<='$')||LA17_73=='&'||(LA17_73>='0' && LA17_73<='9')||LA17_73=='?'||(LA17_73>='A' && LA17_73<='z')||LA17_73=='|'||(LA17_73>='~' && LA17_73<='\uFFFF')) ) {s = 24;}

                        else s = 87;

                        if ( s>=0 ) return s;
                        break;
                    case 6 : 
                        int LA17_57 = input.LA(1);

                        s = -1;
                        if ( ((LA17_57>='\u0000' && LA17_57<='\b')||(LA17_57>='\u000B' && LA17_57<='\f')||(LA17_57>='\u000E' && LA17_57<='\u001F')||LA17_57=='!'||(LA17_57>='#' && LA17_57<='$')||LA17_57=='&'||(LA17_57>='0' && LA17_57<='9')||LA17_57=='?'||(LA17_57>='A' && LA17_57<='z')||LA17_57=='|'||(LA17_57>='~' && LA17_57<='\uFFFF')) ) {s = 24;}

                        else s = 72;

                        if ( s>=0 ) return s;
                        break;
                    case 7 : 
                        int LA17_125 = input.LA(1);

                        s = -1;
                        if ( ((LA17_125>='\u0000' && LA17_125<='\b')||(LA17_125>='\u000B' && LA17_125<='\f')||(LA17_125>='\u000E' && LA17_125<='\u001F')||LA17_125=='!'||(LA17_125>='#' && LA17_125<='$')||LA17_125=='&'||(LA17_125>='0' && LA17_125<='9')||LA17_125=='?'||(LA17_125>='A' && LA17_125<='z')||LA17_125=='|'||(LA17_125>='~' && LA17_125<='\uFFFF')) ) {s = 24;}

                        else s = 127;

                        if ( s>=0 ) return s;
                        break;
                    case 8 : 
                        int LA17_100 = input.LA(1);

                        s = -1;
                        if ( ((LA17_100>='\u0000' && LA17_100<='\b')||(LA17_100>='\u000B' && LA17_100<='\f')||(LA17_100>='\u000E' && LA17_100<='\u001F')||LA17_100=='!'||(LA17_100>='#' && LA17_100<='$')||LA17_100=='&'||(LA17_100>='0' && LA17_100<='9')||LA17_100=='?'||(LA17_100>='A' && LA17_100<='z')||LA17_100=='|'||(LA17_100>='~' && LA17_100<='\uFFFF')) ) {s = 24;}

                        else s = 110;

                        if ( s>=0 ) return s;
                        break;
                    case 9 : 
                        int LA17_96 = input.LA(1);

                        s = -1;
                        if ( ((LA17_96>='\u0000' && LA17_96<='\b')||(LA17_96>='\u000B' && LA17_96<='\f')||(LA17_96>='\u000E' && LA17_96<='\u001F')||LA17_96=='!'||(LA17_96>='#' && LA17_96<='$')||LA17_96=='&'||(LA17_96>='0' && LA17_96<='9')||LA17_96=='?'||(LA17_96>='A' && LA17_96<='z')||LA17_96=='|'||(LA17_96>='~' && LA17_96<='\uFFFF')) ) {s = 24;}

                        else s = 108;

                        if ( s>=0 ) return s;
                        break;
                    case 10 : 
                        int LA17_124 = input.LA(1);

                        s = -1;
                        if ( ((LA17_124>='\u0000' && LA17_124<='\b')||(LA17_124>='\u000B' && LA17_124<='\f')||(LA17_124>='\u000E' && LA17_124<='\u001F')||LA17_124=='!'||(LA17_124>='#' && LA17_124<='$')||LA17_124=='&'||(LA17_124>='0' && LA17_124<='9')||LA17_124=='?'||(LA17_124>='A' && LA17_124<='z')||LA17_124=='|'||(LA17_124>='~' && LA17_124<='\uFFFF')) ) {s = 24;}

                        else s = 126;

                        if ( s>=0 ) return s;
                        break;
                    case 11 : 
                        int LA17_120 = input.LA(1);

                        s = -1;
                        if ( ((LA17_120>='\u0000' && LA17_120<='\b')||(LA17_120>='\u000B' && LA17_120<='\f')||(LA17_120>='\u000E' && LA17_120<='\u001F')||LA17_120=='!'||(LA17_120>='#' && LA17_120<='$')||LA17_120=='&'||(LA17_120>='0' && LA17_120<='9')||LA17_120=='?'||(LA17_120>='A' && LA17_120<='z')||LA17_120=='|'||(LA17_120>='~' && LA17_120<='\uFFFF')) ) {s = 24;}

                        else s = 123;

                        if ( s>=0 ) return s;
                        break;
                    case 12 : 
                        int LA17_83 = input.LA(1);

                        s = -1;
                        if ( ((LA17_83>='\u0000' && LA17_83<='\b')||(LA17_83>='\u000B' && LA17_83<='\f')||(LA17_83>='\u000E' && LA17_83<='\u001F')||LA17_83=='!'||(LA17_83>='#' && LA17_83<='$')||LA17_83=='&'||(LA17_83>='0' && LA17_83<='9')||LA17_83=='?'||(LA17_83>='A' && LA17_83<='z')||LA17_83=='|'||(LA17_83>='~' && LA17_83<='\uFFFF')) ) {s = 24;}

                        else s = 98;

                        if ( s>=0 ) return s;
                        break;
                    case 13 : 
                        int LA17_112 = input.LA(1);

                        s = -1;
                        if ( ((LA17_112>='\u0000' && LA17_112<='\b')||(LA17_112>='\u000B' && LA17_112<='\f')||(LA17_112>='\u000E' && LA17_112<='\u001F')||LA17_112=='!'||(LA17_112>='#' && LA17_112<='$')||LA17_112=='&'||(LA17_112>='0' && LA17_112<='9')||LA17_112=='?'||(LA17_112>='A' && LA17_112<='z')||LA17_112=='|'||(LA17_112>='~' && LA17_112<='\uFFFF')) ) {s = 24;}

                        else s = 118;

                        if ( s>=0 ) return s;
                        break;
                    case 14 : 
                        int LA17_105 = input.LA(1);

                        s = -1;
                        if ( ((LA17_105>='\u0000' && LA17_105<='\b')||(LA17_105>='\u000B' && LA17_105<='\f')||(LA17_105>='\u000E' && LA17_105<='\u001F')||LA17_105=='!'||(LA17_105>='#' && LA17_105<='$')||LA17_105=='&'||(LA17_105>='0' && LA17_105<='9')||LA17_105=='?'||(LA17_105>='A' && LA17_105<='z')||LA17_105=='|'||(LA17_105>='~' && LA17_105<='\uFFFF')) ) {s = 24;}

                        else s = 114;

                        if ( s>=0 ) return s;
                        break;
                    case 15 : 
                        int LA17_82 = input.LA(1);

                        s = -1;
                        if ( ((LA17_82>='\u0000' && LA17_82<='\b')||(LA17_82>='\u000B' && LA17_82<='\f')||(LA17_82>='\u000E' && LA17_82<='\u001F')||LA17_82=='!'||(LA17_82>='#' && LA17_82<='$')||LA17_82=='&'||(LA17_82>='0' && LA17_82<='9')||LA17_82=='?'||(LA17_82>='A' && LA17_82<='z')||LA17_82=='|'||(LA17_82>='~' && LA17_82<='\uFFFF')) ) {s = 24;}

                        else s = 97;

                        if ( s>=0 ) return s;
                        break;
                    case 16 : 
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

                        else if ( (LA17_0=='@') ) {s = 18;}

                        else if ( (LA17_0=='(') ) {s = 19;}

                        else if ( (LA17_0==')') ) {s = 20;}

                        else if ( (LA17_0==',') ) {s = 21;}

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
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 17, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}