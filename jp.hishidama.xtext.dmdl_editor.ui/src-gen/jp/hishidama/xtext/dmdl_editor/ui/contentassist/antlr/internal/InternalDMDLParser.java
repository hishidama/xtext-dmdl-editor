package jp.hishidama.xtext.dmdl_editor.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import jp.hishidama.xtext.dmdl_editor.services.DMDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDMDLParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NAME_TOKEN", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'->'", "'=>'", "'INT'", "'LONG'", "'BYTE'", "'SHORT'", "'DECIMAL'", "'FLOAT'", "'DOUBLE'", "'TEXT'", "'BOOLEAN'", "'DATE'", "'DATETIME'", "'TRUE'", "'FALSE'", "';'", "'='", "'projective'", "'+'", "'{'", "'}'", "':'", "'summarized'", "'@'", "'('", "')'", "','", "'%'", "'.'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=9;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=8;
    public static final int T__30=30;
    public static final int T__19=19;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__16=16;
    public static final int T__34=34;
    public static final int T__15=15;
    public static final int T__35=35;
    public static final int T__18=18;
    public static final int T__36=36;
    public static final int T__17=17;
    public static final int T__37=37;
    public static final int T__12=12;
    public static final int RULE_NAME_TOKEN=5;
    public static final int T__38=38;
    public static final int T__11=11;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=10;
    public static final int RULE_DECIMAL=7;

    // delegates
    // delegators


        public InternalDMDLParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalDMDLParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalDMDLParser.tokenNames; }
    public String getGrammarFileName() { return "../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g"; }


     
     	private DMDLGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(DMDLGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleScript"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:60:1: entryRuleScript : ruleScript EOF ;
    public final void entryRuleScript() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:61:1: ( ruleScript EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:62:1: ruleScript EOF
            {
             before(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript61);
            ruleScript();

            state._fsp--;

             after(grammarAccess.getScriptRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript68); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:69:1: ruleScript : ( ( rule__Script__ListAssignment )* ) ;
    public final void ruleScript() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:73:2: ( ( ( rule__Script__ListAssignment )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:74:1: ( ( rule__Script__ListAssignment )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:74:1: ( ( rule__Script__ListAssignment )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:75:1: ( rule__Script__ListAssignment )*
            {
             before(grammarAccess.getScriptAccess().getListAssignment()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:76:1: ( rule__Script__ListAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_NAME_TOKEN)||LA1_0==28||(LA1_0>=33 && LA1_0<=34)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:76:2: rule__Script__ListAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Script__ListAssignment_in_ruleScript94);
            	    rule__Script__ListAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getScriptAccess().getListAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:88:1: entryRuleModelDefinition : ruleModelDefinition EOF ;
    public final void entryRuleModelDefinition() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:89:1: ( ruleModelDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:90:1: ruleModelDefinition EOF
            {
             before(grammarAccess.getModelDefinitionRule()); 
            pushFollow(FOLLOW_ruleModelDefinition_in_entryRuleModelDefinition122);
            ruleModelDefinition();

            state._fsp--;

             after(grammarAccess.getModelDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelDefinition129); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelDefinition"


    // $ANTLR start "ruleModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:97:1: ruleModelDefinition : ( ( rule__ModelDefinition__Group__0 ) ) ;
    public final void ruleModelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:101:2: ( ( ( rule__ModelDefinition__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:102:1: ( ( rule__ModelDefinition__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:102:1: ( ( rule__ModelDefinition__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:103:1: ( rule__ModelDefinition__Group__0 )
            {
             before(grammarAccess.getModelDefinitionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:104:1: ( rule__ModelDefinition__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:104:2: rule__ModelDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group__0_in_ruleModelDefinition155);
            rule__ModelDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelDefinition"


    // $ANTLR start "entryRuleRecordModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:116:1: entryRuleRecordModelDefinition : ruleRecordModelDefinition EOF ;
    public final void entryRuleRecordModelDefinition() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:117:1: ( ruleRecordModelDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:118:1: ruleRecordModelDefinition EOF
            {
             before(grammarAccess.getRecordModelDefinitionRule()); 
            pushFollow(FOLLOW_ruleRecordModelDefinition_in_entryRuleRecordModelDefinition182);
            ruleRecordModelDefinition();

            state._fsp--;

             after(grammarAccess.getRecordModelDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordModelDefinition189); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecordModelDefinition"


    // $ANTLR start "ruleRecordModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:125:1: ruleRecordModelDefinition : ( ( rule__RecordModelDefinition__Group__0 ) ) ;
    public final void ruleRecordModelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:129:2: ( ( ( rule__RecordModelDefinition__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:130:1: ( ( rule__RecordModelDefinition__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:130:1: ( ( rule__RecordModelDefinition__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:131:1: ( rule__RecordModelDefinition__Group__0 )
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:132:1: ( rule__RecordModelDefinition__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:132:2: rule__RecordModelDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__0_in_ruleRecordModelDefinition215);
            rule__RecordModelDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordModelDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecordModelDefinition"


    // $ANTLR start "entryRuleProjectiveModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:144:1: entryRuleProjectiveModelDefinition : ruleProjectiveModelDefinition EOF ;
    public final void entryRuleProjectiveModelDefinition() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:145:1: ( ruleProjectiveModelDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:146:1: ruleProjectiveModelDefinition EOF
            {
             before(grammarAccess.getProjectiveModelDefinitionRule()); 
            pushFollow(FOLLOW_ruleProjectiveModelDefinition_in_entryRuleProjectiveModelDefinition242);
            ruleProjectiveModelDefinition();

            state._fsp--;

             after(grammarAccess.getProjectiveModelDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectiveModelDefinition249); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleProjectiveModelDefinition"


    // $ANTLR start "ruleProjectiveModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:153:1: ruleProjectiveModelDefinition : ( ( rule__ProjectiveModelDefinition__Group__0 ) ) ;
    public final void ruleProjectiveModelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:157:2: ( ( ( rule__ProjectiveModelDefinition__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:158:1: ( ( rule__ProjectiveModelDefinition__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:158:1: ( ( rule__ProjectiveModelDefinition__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:159:1: ( rule__ProjectiveModelDefinition__Group__0 )
            {
             before(grammarAccess.getProjectiveModelDefinitionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:160:1: ( rule__ProjectiveModelDefinition__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:160:2: rule__ProjectiveModelDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__Group__0_in_ruleProjectiveModelDefinition275);
            rule__ProjectiveModelDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getProjectiveModelDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleProjectiveModelDefinition"


    // $ANTLR start "entryRuleRecordExpression"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:172:1: entryRuleRecordExpression : ruleRecordExpression EOF ;
    public final void entryRuleRecordExpression() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:173:1: ( ruleRecordExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:174:1: ruleRecordExpression EOF
            {
             before(grammarAccess.getRecordExpressionRule()); 
            pushFollow(FOLLOW_ruleRecordExpression_in_entryRuleRecordExpression302);
            ruleRecordExpression();

            state._fsp--;

             after(grammarAccess.getRecordExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordExpression309); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecordExpression"


    // $ANTLR start "ruleRecordExpression"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:181:1: ruleRecordExpression : ( ( rule__RecordExpression__Group__0 ) ) ;
    public final void ruleRecordExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:185:2: ( ( ( rule__RecordExpression__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:186:1: ( ( rule__RecordExpression__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:186:1: ( ( rule__RecordExpression__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:187:1: ( rule__RecordExpression__Group__0 )
            {
             before(grammarAccess.getRecordExpressionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:188:1: ( rule__RecordExpression__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:188:2: rule__RecordExpression__Group__0
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group__0_in_ruleRecordExpression335);
            rule__RecordExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecordExpression"


    // $ANTLR start "entryRuleRecordTerm"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:200:1: entryRuleRecordTerm : ruleRecordTerm EOF ;
    public final void entryRuleRecordTerm() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:201:1: ( ruleRecordTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:202:1: ruleRecordTerm EOF
            {
             before(grammarAccess.getRecordTermRule()); 
            pushFollow(FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm362);
            ruleRecordTerm();

            state._fsp--;

             after(grammarAccess.getRecordTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordTerm369); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRecordTerm"


    // $ANTLR start "ruleRecordTerm"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:209:1: ruleRecordTerm : ( ( rule__RecordTerm__Alternatives ) ) ;
    public final void ruleRecordTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:213:2: ( ( ( rule__RecordTerm__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:214:1: ( ( rule__RecordTerm__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:214:1: ( ( rule__RecordTerm__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:215:1: ( rule__RecordTerm__Alternatives )
            {
             before(grammarAccess.getRecordTermAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:216:1: ( rule__RecordTerm__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:216:2: rule__RecordTerm__Alternatives
            {
            pushFollow(FOLLOW_rule__RecordTerm__Alternatives_in_ruleRecordTerm395);
            rule__RecordTerm__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getRecordTermAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRecordTerm"


    // $ANTLR start "entryRuleModelReference"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:228:1: entryRuleModelReference : ruleModelReference EOF ;
    public final void entryRuleModelReference() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:229:1: ( ruleModelReference EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:230:1: ruleModelReference EOF
            {
             before(grammarAccess.getModelReferenceRule()); 
            pushFollow(FOLLOW_ruleModelReference_in_entryRuleModelReference422);
            ruleModelReference();

            state._fsp--;

             after(grammarAccess.getModelReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelReference429); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelReference"


    // $ANTLR start "ruleModelReference"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:237:1: ruleModelReference : ( ( rule__ModelReference__NameAssignment ) ) ;
    public final void ruleModelReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:241:2: ( ( ( rule__ModelReference__NameAssignment ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:242:1: ( ( rule__ModelReference__NameAssignment ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:242:1: ( ( rule__ModelReference__NameAssignment ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:243:1: ( rule__ModelReference__NameAssignment )
            {
             before(grammarAccess.getModelReferenceAccess().getNameAssignment()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:244:1: ( rule__ModelReference__NameAssignment )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:244:2: rule__ModelReference__NameAssignment
            {
            pushFollow(FOLLOW_rule__ModelReference__NameAssignment_in_ruleModelReference455);
            rule__ModelReference__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getModelReferenceAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelReference"


    // $ANTLR start "entryRulePropertyDefinition"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:256:1: entryRulePropertyDefinition : rulePropertyDefinition EOF ;
    public final void entryRulePropertyDefinition() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:257:1: ( rulePropertyDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:258:1: rulePropertyDefinition EOF
            {
             before(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition482);
            rulePropertyDefinition();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition489); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:265:1: rulePropertyDefinition : ( ( rule__PropertyDefinition__Group__0 ) ) ;
    public final void rulePropertyDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:269:2: ( ( ( rule__PropertyDefinition__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:270:1: ( ( rule__PropertyDefinition__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:270:1: ( ( rule__PropertyDefinition__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:271:1: ( rule__PropertyDefinition__Group__0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:272:1: ( rule__PropertyDefinition__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:272:2: rule__PropertyDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition515);
            rule__PropertyDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRuleSummarizeModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:284:1: entryRuleSummarizeModelDefinition : ruleSummarizeModelDefinition EOF ;
    public final void entryRuleSummarizeModelDefinition() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:285:1: ( ruleSummarizeModelDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:286:1: ruleSummarizeModelDefinition EOF
            {
             before(grammarAccess.getSummarizeModelDefinitionRule()); 
            pushFollow(FOLLOW_ruleSummarizeModelDefinition_in_entryRuleSummarizeModelDefinition542);
            ruleSummarizeModelDefinition();

            state._fsp--;

             after(grammarAccess.getSummarizeModelDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeModelDefinition549); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSummarizeModelDefinition"


    // $ANTLR start "ruleSummarizeModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:293:1: ruleSummarizeModelDefinition : ( ( rule__SummarizeModelDefinition__Group__0 ) ) ;
    public final void ruleSummarizeModelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:297:2: ( ( ( rule__SummarizeModelDefinition__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:298:1: ( ( rule__SummarizeModelDefinition__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:298:1: ( ( rule__SummarizeModelDefinition__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:299:1: ( rule__SummarizeModelDefinition__Group__0 )
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:300:1: ( rule__SummarizeModelDefinition__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:300:2: rule__SummarizeModelDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__0_in_ruleSummarizeModelDefinition575);
            rule__SummarizeModelDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSummarizeModelDefinitionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSummarizeModelDefinition"


    // $ANTLR start "entryRuleSummarizeExpression"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:312:1: entryRuleSummarizeExpression : ruleSummarizeExpression EOF ;
    public final void entryRuleSummarizeExpression() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:313:1: ( ruleSummarizeExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:314:1: ruleSummarizeExpression EOF
            {
             before(grammarAccess.getSummarizeExpressionRule()); 
            pushFollow(FOLLOW_ruleSummarizeExpression_in_entryRuleSummarizeExpression602);
            ruleSummarizeExpression();

            state._fsp--;

             after(grammarAccess.getSummarizeExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeExpression609); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSummarizeExpression"


    // $ANTLR start "ruleSummarizeExpression"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:321:1: ruleSummarizeExpression : ( ( rule__SummarizeExpression__Group__0 ) ) ;
    public final void ruleSummarizeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:325:2: ( ( ( rule__SummarizeExpression__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:326:1: ( ( rule__SummarizeExpression__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:326:1: ( ( rule__SummarizeExpression__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:327:1: ( rule__SummarizeExpression__Group__0 )
            {
             before(grammarAccess.getSummarizeExpressionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:328:1: ( rule__SummarizeExpression__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:328:2: rule__SummarizeExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group__0_in_ruleSummarizeExpression635);
            rule__SummarizeExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSummarizeExpressionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSummarizeExpression"


    // $ANTLR start "entryRuleSummarizeTerm"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:340:1: entryRuleSummarizeTerm : ruleSummarizeTerm EOF ;
    public final void entryRuleSummarizeTerm() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:341:1: ( ruleSummarizeTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:342:1: ruleSummarizeTerm EOF
            {
             before(grammarAccess.getSummarizeTermRule()); 
            pushFollow(FOLLOW_ruleSummarizeTerm_in_entryRuleSummarizeTerm662);
            ruleSummarizeTerm();

            state._fsp--;

             after(grammarAccess.getSummarizeTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeTerm669); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleSummarizeTerm"


    // $ANTLR start "ruleSummarizeTerm"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:349:1: ruleSummarizeTerm : ( ( rule__SummarizeTerm__Group__0 ) ) ;
    public final void ruleSummarizeTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:353:2: ( ( ( rule__SummarizeTerm__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:354:1: ( ( rule__SummarizeTerm__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:354:1: ( ( rule__SummarizeTerm__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:355:1: ( rule__SummarizeTerm__Group__0 )
            {
             before(grammarAccess.getSummarizeTermAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:356:1: ( rule__SummarizeTerm__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:356:2: rule__SummarizeTerm__Group__0
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__Group__0_in_ruleSummarizeTerm695);
            rule__SummarizeTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSummarizeTermAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSummarizeTerm"


    // $ANTLR start "entryRuleDescription"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:368:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:369:1: ( ruleDescription EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:370:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription722);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription729); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:377:1: ruleDescription : ( RULE_STRING ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:381:2: ( ( RULE_STRING ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:382:1: ( RULE_STRING )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:382:1: ( RULE_STRING )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:383:1: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDescription755); 
             after(grammarAccess.getDescriptionAccess().getSTRINGTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleAttributeList"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:396:1: entryRuleAttributeList : ruleAttributeList EOF ;
    public final void entryRuleAttributeList() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:397:1: ( ruleAttributeList EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:398:1: ruleAttributeList EOF
            {
             before(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_ruleAttributeList_in_entryRuleAttributeList781);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getAttributeListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeList788); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeList"


    // $ANTLR start "ruleAttributeList"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:405:1: ruleAttributeList : ( ( ( rule__AttributeList__AttributesAssignment ) ) ( ( rule__AttributeList__AttributesAssignment )* ) ) ;
    public final void ruleAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:409:2: ( ( ( ( rule__AttributeList__AttributesAssignment ) ) ( ( rule__AttributeList__AttributesAssignment )* ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:410:1: ( ( ( rule__AttributeList__AttributesAssignment ) ) ( ( rule__AttributeList__AttributesAssignment )* ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:410:1: ( ( ( rule__AttributeList__AttributesAssignment ) ) ( ( rule__AttributeList__AttributesAssignment )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:411:1: ( ( rule__AttributeList__AttributesAssignment ) ) ( ( rule__AttributeList__AttributesAssignment )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:411:1: ( ( rule__AttributeList__AttributesAssignment ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:412:1: ( rule__AttributeList__AttributesAssignment )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:413:1: ( rule__AttributeList__AttributesAssignment )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:413:2: rule__AttributeList__AttributesAssignment
            {
            pushFollow(FOLLOW_rule__AttributeList__AttributesAssignment_in_ruleAttributeList816);
            rule__AttributeList__AttributesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getAttributesAssignment()); 

            }

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:416:1: ( ( rule__AttributeList__AttributesAssignment )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:417:1: ( rule__AttributeList__AttributesAssignment )*
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:418:1: ( rule__AttributeList__AttributesAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==34) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:418:2: rule__AttributeList__AttributesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__AttributeList__AttributesAssignment_in_ruleAttributeList828);
            	    rule__AttributeList__AttributesAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

             after(grammarAccess.getAttributeListAccess().getAttributesAssignment()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeList"


    // $ANTLR start "entryRuleAttribute"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:431:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:432:1: ( ruleAttribute EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:433:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute858);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute865); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:440:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:444:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:445:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:445:1: ( ( rule__Attribute__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:446:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:447:1: ( rule__Attribute__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:447:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute891);
            rule__Attribute__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeElementList"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:459:1: entryRuleAttributeElementList : ruleAttributeElementList EOF ;
    public final void entryRuleAttributeElementList() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:460:1: ( ruleAttributeElementList EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:461:1: ruleAttributeElementList EOF
            {
             before(grammarAccess.getAttributeElementListRule()); 
            pushFollow(FOLLOW_ruleAttributeElementList_in_entryRuleAttributeElementList918);
            ruleAttributeElementList();

            state._fsp--;

             after(grammarAccess.getAttributeElementListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElementList925); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeElementList"


    // $ANTLR start "ruleAttributeElementList"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:468:1: ruleAttributeElementList : ( ( rule__AttributeElementList__Group__0 ) ) ;
    public final void ruleAttributeElementList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:472:2: ( ( ( rule__AttributeElementList__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:473:1: ( ( rule__AttributeElementList__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:473:1: ( ( rule__AttributeElementList__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:474:1: ( rule__AttributeElementList__Group__0 )
            {
             before(grammarAccess.getAttributeElementListAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:475:1: ( rule__AttributeElementList__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:475:2: rule__AttributeElementList__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group__0_in_ruleAttributeElementList951);
            rule__AttributeElementList__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeElementListAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeElementList"


    // $ANTLR start "entryRuleAttributeElement"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:487:1: entryRuleAttributeElement : ruleAttributeElement EOF ;
    public final void entryRuleAttributeElement() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:488:1: ( ruleAttributeElement EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:489:1: ruleAttributeElement EOF
            {
             before(grammarAccess.getAttributeElementRule()); 
            pushFollow(FOLLOW_ruleAttributeElement_in_entryRuleAttributeElement978);
            ruleAttributeElement();

            state._fsp--;

             after(grammarAccess.getAttributeElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElement985); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeElement"


    // $ANTLR start "ruleAttributeElement"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:496:1: ruleAttributeElement : ( ( rule__AttributeElement__Group__0 ) ) ;
    public final void ruleAttributeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:500:2: ( ( ( rule__AttributeElement__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:501:1: ( ( rule__AttributeElement__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:501:1: ( ( rule__AttributeElement__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:502:1: ( rule__AttributeElement__Group__0 )
            {
             before(grammarAccess.getAttributeElementAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:503:1: ( rule__AttributeElement__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:503:2: rule__AttributeElement__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeElement__Group__0_in_ruleAttributeElement1011);
            rule__AttributeElement__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeElementAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeElement"


    // $ANTLR start "entryRuleAttributeValue"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:515:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:516:1: ( ruleAttributeValue EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:517:1: ruleAttributeValue EOF
            {
             before(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue1038);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getAttributeValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue1045); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:524:1: ruleAttributeValue : ( ( rule__AttributeValue__Alternatives ) ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:528:2: ( ( ( rule__AttributeValue__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:529:1: ( ( rule__AttributeValue__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:529:1: ( ( rule__AttributeValue__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:530:1: ( rule__AttributeValue__Alternatives )
            {
             before(grammarAccess.getAttributeValueAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:531:1: ( rule__AttributeValue__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:531:2: rule__AttributeValue__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeValue__Alternatives_in_ruleAttributeValue1071);
            rule__AttributeValue__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValueAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleAttributeValueArray"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:543:1: entryRuleAttributeValueArray : ruleAttributeValueArray EOF ;
    public final void entryRuleAttributeValueArray() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:544:1: ( ruleAttributeValueArray EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:545:1: ruleAttributeValueArray EOF
            {
             before(grammarAccess.getAttributeValueArrayRule()); 
            pushFollow(FOLLOW_ruleAttributeValueArray_in_entryRuleAttributeValueArray1098);
            ruleAttributeValueArray();

            state._fsp--;

             after(grammarAccess.getAttributeValueArrayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValueArray1105); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAttributeValueArray"


    // $ANTLR start "ruleAttributeValueArray"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:552:1: ruleAttributeValueArray : ( ( rule__AttributeValueArray__Group__0 ) ) ;
    public final void ruleAttributeValueArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:556:2: ( ( ( rule__AttributeValueArray__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:557:1: ( ( rule__AttributeValueArray__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:557:1: ( ( rule__AttributeValueArray__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:558:1: ( rule__AttributeValueArray__Group__0 )
            {
             before(grammarAccess.getAttributeValueArrayAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:559:1: ( rule__AttributeValueArray__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:559:2: rule__AttributeValueArray__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__0_in_ruleAttributeValueArray1131);
            rule__AttributeValueArray__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValueArrayAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeValueArray"


    // $ANTLR start "entryRuleGrouping"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:571:1: entryRuleGrouping : ruleGrouping EOF ;
    public final void entryRuleGrouping() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:572:1: ( ruleGrouping EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:573:1: ruleGrouping EOF
            {
             before(grammarAccess.getGroupingRule()); 
            pushFollow(FOLLOW_ruleGrouping_in_entryRuleGrouping1158);
            ruleGrouping();

            state._fsp--;

             after(grammarAccess.getGroupingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouping1165); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleGrouping"


    // $ANTLR start "ruleGrouping"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:580:1: ruleGrouping : ( ( rule__Grouping__Group__0 ) ) ;
    public final void ruleGrouping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:584:2: ( ( ( rule__Grouping__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:585:1: ( ( rule__Grouping__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:585:1: ( ( rule__Grouping__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:586:1: ( rule__Grouping__Group__0 )
            {
             before(grammarAccess.getGroupingAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:587:1: ( rule__Grouping__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:587:2: rule__Grouping__Group__0
            {
            pushFollow(FOLLOW_rule__Grouping__Group__0_in_ruleGrouping1191);
            rule__Grouping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getGroupingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleGrouping"


    // $ANTLR start "entryRuleModelFolding"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:599:1: entryRuleModelFolding : ruleModelFolding EOF ;
    public final void entryRuleModelFolding() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:600:1: ( ruleModelFolding EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:601:1: ruleModelFolding EOF
            {
             before(grammarAccess.getModelFoldingRule()); 
            pushFollow(FOLLOW_ruleModelFolding_in_entryRuleModelFolding1218);
            ruleModelFolding();

            state._fsp--;

             after(grammarAccess.getModelFoldingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelFolding1225); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleModelFolding"


    // $ANTLR start "ruleModelFolding"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:608:1: ruleModelFolding : ( ( rule__ModelFolding__Group__0 ) ) ;
    public final void ruleModelFolding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:612:2: ( ( ( rule__ModelFolding__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:613:1: ( ( rule__ModelFolding__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:613:1: ( ( rule__ModelFolding__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:614:1: ( rule__ModelFolding__Group__0 )
            {
             before(grammarAccess.getModelFoldingAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:615:1: ( rule__ModelFolding__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:615:2: rule__ModelFolding__Group__0
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__0_in_ruleModelFolding1251);
            rule__ModelFolding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelFoldingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModelFolding"


    // $ANTLR start "entryRulePropertyFolding"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:627:1: entryRulePropertyFolding : rulePropertyFolding EOF ;
    public final void entryRulePropertyFolding() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:628:1: ( rulePropertyFolding EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:629:1: rulePropertyFolding EOF
            {
             before(grammarAccess.getPropertyFoldingRule()); 
            pushFollow(FOLLOW_rulePropertyFolding_in_entryRulePropertyFolding1278);
            rulePropertyFolding();

            state._fsp--;

             after(grammarAccess.getPropertyFoldingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyFolding1285); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePropertyFolding"


    // $ANTLR start "rulePropertyFolding"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:636:1: rulePropertyFolding : ( ( rule__PropertyFolding__Group__0 ) ) ;
    public final void rulePropertyFolding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:640:2: ( ( ( rule__PropertyFolding__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:641:1: ( ( rule__PropertyFolding__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:641:1: ( ( rule__PropertyFolding__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:642:1: ( rule__PropertyFolding__Group__0 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:643:1: ( rule__PropertyFolding__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:643:2: rule__PropertyFolding__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__0_in_rulePropertyFolding1311);
            rule__PropertyFolding__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyFoldingAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePropertyFolding"


    // $ANTLR start "entryRuleQualifiedName"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:655:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:656:1: ( ruleQualifiedName EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:657:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1338);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1345); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:664:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:668:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:669:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:669:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:670:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:671:1: ( rule__QualifiedName__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:671:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1371);
            rule__QualifiedName__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleName"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:683:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:684:1: ( ruleName EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:685:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName1398);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName1405); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:692:1: ruleName : ( RULE_NAME_TOKEN ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:696:2: ( ( RULE_NAME_TOKEN ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:697:1: ( RULE_NAME_TOKEN )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:697:1: ( RULE_NAME_TOKEN )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:698:1: RULE_NAME_TOKEN
            {
             before(grammarAccess.getNameAccess().getNAME_TOKENTerminalRuleCall()); 
            match(input,RULE_NAME_TOKEN,FOLLOW_RULE_NAME_TOKEN_in_ruleName1431); 
             after(grammarAccess.getNameAccess().getNAME_TOKENTerminalRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleLiteral"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:711:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:712:1: ( ruleLiteral EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:713:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1457);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1464); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:720:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:724:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:725:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:725:1: ( ( rule__Literal__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:726:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:727:1: ( rule__Literal__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:727:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1490);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "ruleType"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:740:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:744:1: ( ( ( rule__Type__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:745:1: ( ( rule__Type__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:745:1: ( ( rule__Type__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:746:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:747:1: ( rule__Type__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:747:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1527);
            rule__Type__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleBOOLEAN"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:759:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:763:1: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:764:1: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:764:1: ( ( rule__BOOLEAN__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:765:1: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:766:1: ( rule__BOOLEAN__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:766:2: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN1563);
            rule__BOOLEAN__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getBOOLEANAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleBOOLEAN"


    // $ANTLR start "rule__ModelDefinition__Alternatives_2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:777:1: rule__ModelDefinition__Alternatives_2 : ( ( ( rule__ModelDefinition__ModelAssignment_2_0 ) ) | ( ( rule__ModelDefinition__ModelAssignment_2_1 ) ) | ( ( rule__ModelDefinition__ModelAssignment_2_2 ) ) );
    public final void rule__ModelDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:781:1: ( ( ( rule__ModelDefinition__ModelAssignment_2_0 ) ) | ( ( rule__ModelDefinition__ModelAssignment_2_1 ) ) | ( ( rule__ModelDefinition__ModelAssignment_2_2 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_NAME_TOKEN:
                {
                alt3=1;
                }
                break;
            case 28:
                {
                alt3=2;
                }
                break;
            case 33:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:782:1: ( ( rule__ModelDefinition__ModelAssignment_2_0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:782:1: ( ( rule__ModelDefinition__ModelAssignment_2_0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:783:1: ( rule__ModelDefinition__ModelAssignment_2_0 )
                    {
                     before(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:784:1: ( rule__ModelDefinition__ModelAssignment_2_0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:784:2: rule__ModelDefinition__ModelAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__ModelAssignment_2_0_in_rule__ModelDefinition__Alternatives_21598);
                    rule__ModelDefinition__ModelAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:788:6: ( ( rule__ModelDefinition__ModelAssignment_2_1 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:788:6: ( ( rule__ModelDefinition__ModelAssignment_2_1 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:789:1: ( rule__ModelDefinition__ModelAssignment_2_1 )
                    {
                     before(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:790:1: ( rule__ModelDefinition__ModelAssignment_2_1 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:790:2: rule__ModelDefinition__ModelAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__ModelAssignment_2_1_in_rule__ModelDefinition__Alternatives_21616);
                    rule__ModelDefinition__ModelAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:794:6: ( ( rule__ModelDefinition__ModelAssignment_2_2 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:794:6: ( ( rule__ModelDefinition__ModelAssignment_2_2 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:795:1: ( rule__ModelDefinition__ModelAssignment_2_2 )
                    {
                     before(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_2()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:796:1: ( rule__ModelDefinition__ModelAssignment_2_2 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:796:2: rule__ModelDefinition__ModelAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__ModelAssignment_2_2_in_rule__ModelDefinition__Alternatives_21634);
                    rule__ModelDefinition__ModelAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Alternatives_2"


    // $ANTLR start "rule__RecordTerm__Alternatives"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:805:1: rule__RecordTerm__Alternatives : ( ( ( rule__RecordTerm__Group_0__0 ) ) | ( ( rule__RecordTerm__ReferenceAssignment_1 ) ) );
    public final void rule__RecordTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:809:1: ( ( ( rule__RecordTerm__Group_0__0 ) ) | ( ( rule__RecordTerm__ReferenceAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==30) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_NAME_TOKEN) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:810:1: ( ( rule__RecordTerm__Group_0__0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:810:1: ( ( rule__RecordTerm__Group_0__0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:811:1: ( rule__RecordTerm__Group_0__0 )
                    {
                     before(grammarAccess.getRecordTermAccess().getGroup_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:812:1: ( rule__RecordTerm__Group_0__0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:812:2: rule__RecordTerm__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__RecordTerm__Group_0__0_in_rule__RecordTerm__Alternatives1667);
                    rule__RecordTerm__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecordTermAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:816:6: ( ( rule__RecordTerm__ReferenceAssignment_1 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:816:6: ( ( rule__RecordTerm__ReferenceAssignment_1 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:817:1: ( rule__RecordTerm__ReferenceAssignment_1 )
                    {
                     before(grammarAccess.getRecordTermAccess().getReferenceAssignment_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:818:1: ( rule__RecordTerm__ReferenceAssignment_1 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:818:2: rule__RecordTerm__ReferenceAssignment_1
                    {
                    pushFollow(FOLLOW_rule__RecordTerm__ReferenceAssignment_1_in_rule__RecordTerm__Alternatives1685);
                    rule__RecordTerm__ReferenceAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecordTermAccess().getReferenceAssignment_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTerm__Alternatives"


    // $ANTLR start "rule__AttributeValue__Alternatives"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:827:1: rule__AttributeValue__Alternatives : ( ( ( rule__AttributeValue__ValueAssignment_0 ) ) | ( ( rule__AttributeValue__ValueAssignment_1 ) ) | ( ( rule__AttributeValue__ValueAssignment_2 ) ) );
    public final void rule__AttributeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:831:1: ( ( ( rule__AttributeValue__ValueAssignment_0 ) ) | ( ( rule__AttributeValue__ValueAssignment_1 ) ) | ( ( rule__AttributeValue__ValueAssignment_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 30:
                {
                alt5=1;
                }
                break;
            case RULE_NAME_TOKEN:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DECIMAL:
            case 24:
            case 25:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:832:1: ( ( rule__AttributeValue__ValueAssignment_0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:832:1: ( ( rule__AttributeValue__ValueAssignment_0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:833:1: ( rule__AttributeValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getValueAssignment_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:834:1: ( rule__AttributeValue__ValueAssignment_0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:834:2: rule__AttributeValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__AttributeValue__ValueAssignment_0_in_rule__AttributeValue__Alternatives1718);
                    rule__AttributeValue__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:838:6: ( ( rule__AttributeValue__ValueAssignment_1 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:838:6: ( ( rule__AttributeValue__ValueAssignment_1 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:839:1: ( rule__AttributeValue__ValueAssignment_1 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getValueAssignment_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:840:1: ( rule__AttributeValue__ValueAssignment_1 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:840:2: rule__AttributeValue__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AttributeValue__ValueAssignment_1_in_rule__AttributeValue__Alternatives1736);
                    rule__AttributeValue__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValueAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:844:6: ( ( rule__AttributeValue__ValueAssignment_2 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:844:6: ( ( rule__AttributeValue__ValueAssignment_2 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:845:1: ( rule__AttributeValue__ValueAssignment_2 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getValueAssignment_2()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:846:1: ( rule__AttributeValue__ValueAssignment_2 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:846:2: rule__AttributeValue__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__AttributeValue__ValueAssignment_2_in_rule__AttributeValue__Alternatives1754);
                    rule__AttributeValue__ValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValueAccess().getValueAssignment_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__Alternatives"


    // $ANTLR start "rule__PropertyFolding__Alternatives_4"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:855:1: rule__PropertyFolding__Alternatives_4 : ( ( '->' ) | ( '=>' ) );
    public final void rule__PropertyFolding__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:859:1: ( ( '->' ) | ( '=>' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==11) ) {
                alt6=1;
            }
            else if ( (LA6_0==12) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:860:1: ( '->' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:860:1: ( '->' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:861:1: '->'
                    {
                     before(grammarAccess.getPropertyFoldingAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 
                    match(input,11,FOLLOW_11_in_rule__PropertyFolding__Alternatives_41788); 
                     after(grammarAccess.getPropertyFoldingAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:868:6: ( '=>' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:868:6: ( '=>' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:869:1: '=>'
                    {
                     before(grammarAccess.getPropertyFoldingAccess().getEqualsSignGreaterThanSignKeyword_4_1()); 
                    match(input,12,FOLLOW_12_in_rule__PropertyFolding__Alternatives_41808); 
                     after(grammarAccess.getPropertyFoldingAccess().getEqualsSignGreaterThanSignKeyword_4_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__Alternatives_4"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:881:1: rule__Literal__Alternatives : ( ( ( rule__Literal__StringValueAssignment_0 ) ) | ( ( rule__Literal__IntValueAssignment_1 ) ) | ( ( rule__Literal__DecimalValueAssignment_2 ) ) | ( ( rule__Literal__BooleanValueAssignment_3 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:885:1: ( ( ( rule__Literal__StringValueAssignment_0 ) ) | ( ( rule__Literal__IntValueAssignment_1 ) ) | ( ( rule__Literal__DecimalValueAssignment_2 ) ) | ( ( rule__Literal__BooleanValueAssignment_3 ) ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt7=1;
                }
                break;
            case RULE_INT:
                {
                alt7=2;
                }
                break;
            case RULE_DECIMAL:
                {
                alt7=3;
                }
                break;
            case 24:
            case 25:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:886:1: ( ( rule__Literal__StringValueAssignment_0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:886:1: ( ( rule__Literal__StringValueAssignment_0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:887:1: ( rule__Literal__StringValueAssignment_0 )
                    {
                     before(grammarAccess.getLiteralAccess().getStringValueAssignment_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:888:1: ( rule__Literal__StringValueAssignment_0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:888:2: rule__Literal__StringValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Literal__StringValueAssignment_0_in_rule__Literal__Alternatives1842);
                    rule__Literal__StringValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getStringValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:892:6: ( ( rule__Literal__IntValueAssignment_1 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:892:6: ( ( rule__Literal__IntValueAssignment_1 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:893:1: ( rule__Literal__IntValueAssignment_1 )
                    {
                     before(grammarAccess.getLiteralAccess().getIntValueAssignment_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:894:1: ( rule__Literal__IntValueAssignment_1 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:894:2: rule__Literal__IntValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Literal__IntValueAssignment_1_in_rule__Literal__Alternatives1860);
                    rule__Literal__IntValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getIntValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:898:6: ( ( rule__Literal__DecimalValueAssignment_2 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:898:6: ( ( rule__Literal__DecimalValueAssignment_2 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:899:1: ( rule__Literal__DecimalValueAssignment_2 )
                    {
                     before(grammarAccess.getLiteralAccess().getDecimalValueAssignment_2()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:900:1: ( rule__Literal__DecimalValueAssignment_2 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:900:2: rule__Literal__DecimalValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Literal__DecimalValueAssignment_2_in_rule__Literal__Alternatives1878);
                    rule__Literal__DecimalValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getDecimalValueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:904:6: ( ( rule__Literal__BooleanValueAssignment_3 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:904:6: ( ( rule__Literal__BooleanValueAssignment_3 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:905:1: ( rule__Literal__BooleanValueAssignment_3 )
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanValueAssignment_3()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:906:1: ( rule__Literal__BooleanValueAssignment_3 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:906:2: rule__Literal__BooleanValueAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Literal__BooleanValueAssignment_3_in_rule__Literal__Alternatives1896);
                    rule__Literal__BooleanValueAssignment_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getBooleanValueAssignment_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Type__Alternatives"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:915:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) | ( ( 'DECIMAL' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'TEXT' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'DATE' ) ) | ( ( 'DATETIME' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:919:1: ( ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) | ( ( 'DECIMAL' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'TEXT' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'DATE' ) ) | ( ( 'DATETIME' ) ) )
            int alt8=11;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt8=1;
                }
                break;
            case 14:
                {
                alt8=2;
                }
                break;
            case 15:
                {
                alt8=3;
                }
                break;
            case 16:
                {
                alt8=4;
                }
                break;
            case 17:
                {
                alt8=5;
                }
                break;
            case 18:
                {
                alt8=6;
                }
                break;
            case 19:
                {
                alt8=7;
                }
                break;
            case 20:
                {
                alt8=8;
                }
                break;
            case 21:
                {
                alt8=9;
                }
                break;
            case 22:
                {
                alt8=10;
                }
                break;
            case 23:
                {
                alt8=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:920:1: ( ( 'INT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:920:1: ( ( 'INT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:921:1: ( 'INT' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:922:1: ( 'INT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:922:3: 'INT'
                    {
                    match(input,13,FOLLOW_13_in_rule__Type__Alternatives1930); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:927:6: ( ( 'LONG' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:927:6: ( ( 'LONG' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:928:1: ( 'LONG' )
                    {
                     before(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:929:1: ( 'LONG' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:929:3: 'LONG'
                    {
                    match(input,14,FOLLOW_14_in_rule__Type__Alternatives1951); 

                    }

                     after(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:934:6: ( ( 'BYTE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:934:6: ( ( 'BYTE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:935:1: ( 'BYTE' )
                    {
                     before(grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_2()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:936:1: ( 'BYTE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:936:3: 'BYTE'
                    {
                    match(input,15,FOLLOW_15_in_rule__Type__Alternatives1972); 

                    }

                     after(grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:941:6: ( ( 'SHORT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:941:6: ( ( 'SHORT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:942:1: ( 'SHORT' )
                    {
                     before(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_3()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:943:1: ( 'SHORT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:943:3: 'SHORT'
                    {
                    match(input,16,FOLLOW_16_in_rule__Type__Alternatives1993); 

                    }

                     after(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:948:6: ( ( 'DECIMAL' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:948:6: ( ( 'DECIMAL' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:949:1: ( 'DECIMAL' )
                    {
                     before(grammarAccess.getTypeAccess().getDECIMALEnumLiteralDeclaration_4()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:950:1: ( 'DECIMAL' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:950:3: 'DECIMAL'
                    {
                    match(input,17,FOLLOW_17_in_rule__Type__Alternatives2014); 

                    }

                     after(grammarAccess.getTypeAccess().getDECIMALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:955:6: ( ( 'FLOAT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:955:6: ( ( 'FLOAT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:956:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:957:1: ( 'FLOAT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:957:3: 'FLOAT'
                    {
                    match(input,18,FOLLOW_18_in_rule__Type__Alternatives2035); 

                    }

                     after(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:962:6: ( ( 'DOUBLE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:962:6: ( ( 'DOUBLE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:963:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:964:1: ( 'DOUBLE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:964:3: 'DOUBLE'
                    {
                    match(input,19,FOLLOW_19_in_rule__Type__Alternatives2056); 

                    }

                     after(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:969:6: ( ( 'TEXT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:969:6: ( ( 'TEXT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:970:1: ( 'TEXT' )
                    {
                     before(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_7()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:971:1: ( 'TEXT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:971:3: 'TEXT'
                    {
                    match(input,20,FOLLOW_20_in_rule__Type__Alternatives2077); 

                    }

                     after(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:976:6: ( ( 'BOOLEAN' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:976:6: ( ( 'BOOLEAN' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:977:1: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_8()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:978:1: ( 'BOOLEAN' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:978:3: 'BOOLEAN'
                    {
                    match(input,21,FOLLOW_21_in_rule__Type__Alternatives2098); 

                    }

                     after(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:983:6: ( ( 'DATE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:983:6: ( ( 'DATE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:984:1: ( 'DATE' )
                    {
                     before(grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_9()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:985:1: ( 'DATE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:985:3: 'DATE'
                    {
                    match(input,22,FOLLOW_22_in_rule__Type__Alternatives2119); 

                    }

                     after(grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:990:6: ( ( 'DATETIME' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:990:6: ( ( 'DATETIME' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:991:1: ( 'DATETIME' )
                    {
                     before(grammarAccess.getTypeAccess().getDATETIMEEnumLiteralDeclaration_10()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:992:1: ( 'DATETIME' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:992:3: 'DATETIME'
                    {
                    match(input,23,FOLLOW_23_in_rule__Type__Alternatives2140); 

                    }

                     after(grammarAccess.getTypeAccess().getDATETIMEEnumLiteralDeclaration_10()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Type__Alternatives"


    // $ANTLR start "rule__BOOLEAN__Alternatives"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1002:1: rule__BOOLEAN__Alternatives : ( ( ( 'TRUE' ) ) | ( ( 'FALSE' ) ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1006:1: ( ( ( 'TRUE' ) ) | ( ( 'FALSE' ) ) )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            else if ( (LA9_0==25) ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1007:1: ( ( 'TRUE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1007:1: ( ( 'TRUE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1008:1: ( 'TRUE' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1009:1: ( 'TRUE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1009:3: 'TRUE'
                    {
                    match(input,24,FOLLOW_24_in_rule__BOOLEAN__Alternatives2176); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1014:6: ( ( 'FALSE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1014:6: ( ( 'FALSE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1015:1: ( 'FALSE' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1016:1: ( 'FALSE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1016:3: 'FALSE'
                    {
                    match(input,25,FOLLOW_25_in_rule__BOOLEAN__Alternatives2197); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__BOOLEAN__Alternatives"


    // $ANTLR start "rule__ModelDefinition__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1028:1: rule__ModelDefinition__Group__0 : rule__ModelDefinition__Group__0__Impl rule__ModelDefinition__Group__1 ;
    public final void rule__ModelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1032:1: ( rule__ModelDefinition__Group__0__Impl rule__ModelDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1033:2: rule__ModelDefinition__Group__0__Impl rule__ModelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group__0__Impl_in_rule__ModelDefinition__Group__02230);
            rule__ModelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group__1_in_rule__ModelDefinition__Group__02233);
            rule__ModelDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group__0"


    // $ANTLR start "rule__ModelDefinition__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1040:1: rule__ModelDefinition__Group__0__Impl : ( ( rule__ModelDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__ModelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1044:1: ( ( ( rule__ModelDefinition__DescriptionAssignment_0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1045:1: ( ( rule__ModelDefinition__DescriptionAssignment_0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1045:1: ( ( rule__ModelDefinition__DescriptionAssignment_0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1046:1: ( rule__ModelDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getModelDefinitionAccess().getDescriptionAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1047:1: ( rule__ModelDefinition__DescriptionAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1047:2: rule__ModelDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__DescriptionAssignment_0_in_rule__ModelDefinition__Group__0__Impl2260);
                    rule__ModelDefinition__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelDefinitionAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group__0__Impl"


    // $ANTLR start "rule__ModelDefinition__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1057:1: rule__ModelDefinition__Group__1 : rule__ModelDefinition__Group__1__Impl rule__ModelDefinition__Group__2 ;
    public final void rule__ModelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1061:1: ( rule__ModelDefinition__Group__1__Impl rule__ModelDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1062:2: rule__ModelDefinition__Group__1__Impl rule__ModelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group__1__Impl_in_rule__ModelDefinition__Group__12291);
            rule__ModelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group__2_in_rule__ModelDefinition__Group__12294);
            rule__ModelDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group__1"


    // $ANTLR start "rule__ModelDefinition__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1069:1: rule__ModelDefinition__Group__1__Impl : ( ( rule__ModelDefinition__AttributesAssignment_1 )? ) ;
    public final void rule__ModelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1073:1: ( ( ( rule__ModelDefinition__AttributesAssignment_1 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1074:1: ( ( rule__ModelDefinition__AttributesAssignment_1 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1074:1: ( ( rule__ModelDefinition__AttributesAssignment_1 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1075:1: ( rule__ModelDefinition__AttributesAssignment_1 )?
            {
             before(grammarAccess.getModelDefinitionAccess().getAttributesAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1076:1: ( rule__ModelDefinition__AttributesAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==34) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1076:2: rule__ModelDefinition__AttributesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__AttributesAssignment_1_in_rule__ModelDefinition__Group__1__Impl2321);
                    rule__ModelDefinition__AttributesAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelDefinitionAccess().getAttributesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group__1__Impl"


    // $ANTLR start "rule__ModelDefinition__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1086:1: rule__ModelDefinition__Group__2 : rule__ModelDefinition__Group__2__Impl rule__ModelDefinition__Group__3 ;
    public final void rule__ModelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1090:1: ( rule__ModelDefinition__Group__2__Impl rule__ModelDefinition__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1091:2: rule__ModelDefinition__Group__2__Impl rule__ModelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group__2__Impl_in_rule__ModelDefinition__Group__22352);
            rule__ModelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group__3_in_rule__ModelDefinition__Group__22355);
            rule__ModelDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group__2"


    // $ANTLR start "rule__ModelDefinition__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1098:1: rule__ModelDefinition__Group__2__Impl : ( ( rule__ModelDefinition__Alternatives_2 ) ) ;
    public final void rule__ModelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1102:1: ( ( ( rule__ModelDefinition__Alternatives_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1103:1: ( ( rule__ModelDefinition__Alternatives_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1103:1: ( ( rule__ModelDefinition__Alternatives_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1104:1: ( rule__ModelDefinition__Alternatives_2 )
            {
             before(grammarAccess.getModelDefinitionAccess().getAlternatives_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1105:1: ( rule__ModelDefinition__Alternatives_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1105:2: rule__ModelDefinition__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Alternatives_2_in_rule__ModelDefinition__Group__2__Impl2382);
            rule__ModelDefinition__Alternatives_2();

            state._fsp--;


            }

             after(grammarAccess.getModelDefinitionAccess().getAlternatives_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group__2__Impl"


    // $ANTLR start "rule__ModelDefinition__Group__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1115:1: rule__ModelDefinition__Group__3 : rule__ModelDefinition__Group__3__Impl ;
    public final void rule__ModelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1119:1: ( rule__ModelDefinition__Group__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1120:2: rule__ModelDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group__3__Impl_in_rule__ModelDefinition__Group__32412);
            rule__ModelDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group__3"


    // $ANTLR start "rule__ModelDefinition__Group__3__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1126:1: rule__ModelDefinition__Group__3__Impl : ( ';' ) ;
    public final void rule__ModelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1130:1: ( ( ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1131:1: ( ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1131:1: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1132:1: ';'
            {
             before(grammarAccess.getModelDefinitionAccess().getSemicolonKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__ModelDefinition__Group__3__Impl2440); 
             after(grammarAccess.getModelDefinitionAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group__3__Impl"


    // $ANTLR start "rule__RecordModelDefinition__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1153:1: rule__RecordModelDefinition__Group__0 : rule__RecordModelDefinition__Group__0__Impl rule__RecordModelDefinition__Group__1 ;
    public final void rule__RecordModelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1157:1: ( rule__RecordModelDefinition__Group__0__Impl rule__RecordModelDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1158:2: rule__RecordModelDefinition__Group__0__Impl rule__RecordModelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__0__Impl_in_rule__RecordModelDefinition__Group__02479);
            rule__RecordModelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__1_in_rule__RecordModelDefinition__Group__02482);
            rule__RecordModelDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordModelDefinition__Group__0"


    // $ANTLR start "rule__RecordModelDefinition__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1165:1: rule__RecordModelDefinition__Group__0__Impl : ( ( rule__RecordModelDefinition__NameAssignment_0 ) ) ;
    public final void rule__RecordModelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1169:1: ( ( ( rule__RecordModelDefinition__NameAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1170:1: ( ( rule__RecordModelDefinition__NameAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1170:1: ( ( rule__RecordModelDefinition__NameAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1171:1: ( rule__RecordModelDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getNameAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1172:1: ( rule__RecordModelDefinition__NameAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1172:2: rule__RecordModelDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__NameAssignment_0_in_rule__RecordModelDefinition__Group__0__Impl2509);
            rule__RecordModelDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRecordModelDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordModelDefinition__Group__0__Impl"


    // $ANTLR start "rule__RecordModelDefinition__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1182:1: rule__RecordModelDefinition__Group__1 : rule__RecordModelDefinition__Group__1__Impl rule__RecordModelDefinition__Group__2 ;
    public final void rule__RecordModelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1186:1: ( rule__RecordModelDefinition__Group__1__Impl rule__RecordModelDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1187:2: rule__RecordModelDefinition__Group__1__Impl rule__RecordModelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__1__Impl_in_rule__RecordModelDefinition__Group__12539);
            rule__RecordModelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__2_in_rule__RecordModelDefinition__Group__12542);
            rule__RecordModelDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordModelDefinition__Group__1"


    // $ANTLR start "rule__RecordModelDefinition__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1194:1: rule__RecordModelDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__RecordModelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1198:1: ( ( '=' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1199:1: ( '=' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1199:1: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1200:1: '='
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getEqualsSignKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__RecordModelDefinition__Group__1__Impl2570); 
             after(grammarAccess.getRecordModelDefinitionAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordModelDefinition__Group__1__Impl"


    // $ANTLR start "rule__RecordModelDefinition__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1213:1: rule__RecordModelDefinition__Group__2 : rule__RecordModelDefinition__Group__2__Impl ;
    public final void rule__RecordModelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1217:1: ( rule__RecordModelDefinition__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1218:2: rule__RecordModelDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__2__Impl_in_rule__RecordModelDefinition__Group__22601);
            rule__RecordModelDefinition__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordModelDefinition__Group__2"


    // $ANTLR start "rule__RecordModelDefinition__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1224:1: rule__RecordModelDefinition__Group__2__Impl : ( ( rule__RecordModelDefinition__RhsAssignment_2 ) ) ;
    public final void rule__RecordModelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1228:1: ( ( ( rule__RecordModelDefinition__RhsAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1229:1: ( ( rule__RecordModelDefinition__RhsAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1229:1: ( ( rule__RecordModelDefinition__RhsAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1230:1: ( rule__RecordModelDefinition__RhsAssignment_2 )
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getRhsAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1231:1: ( rule__RecordModelDefinition__RhsAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1231:2: rule__RecordModelDefinition__RhsAssignment_2
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__RhsAssignment_2_in_rule__RecordModelDefinition__Group__2__Impl2628);
            rule__RecordModelDefinition__RhsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRecordModelDefinitionAccess().getRhsAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordModelDefinition__Group__2__Impl"


    // $ANTLR start "rule__ProjectiveModelDefinition__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1247:1: rule__ProjectiveModelDefinition__Group__0 : rule__ProjectiveModelDefinition__Group__0__Impl rule__ProjectiveModelDefinition__Group__1 ;
    public final void rule__ProjectiveModelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1251:1: ( rule__ProjectiveModelDefinition__Group__0__Impl rule__ProjectiveModelDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1252:2: rule__ProjectiveModelDefinition__Group__0__Impl rule__ProjectiveModelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__Group__0__Impl_in_rule__ProjectiveModelDefinition__Group__02664);
            rule__ProjectiveModelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__Group__1_in_rule__ProjectiveModelDefinition__Group__02667);
            rule__ProjectiveModelDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectiveModelDefinition__Group__0"


    // $ANTLR start "rule__ProjectiveModelDefinition__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1259:1: rule__ProjectiveModelDefinition__Group__0__Impl : ( 'projective' ) ;
    public final void rule__ProjectiveModelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1263:1: ( ( 'projective' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1264:1: ( 'projective' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1264:1: ( 'projective' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1265:1: 'projective'
            {
             before(grammarAccess.getProjectiveModelDefinitionAccess().getProjectiveKeyword_0()); 
            match(input,28,FOLLOW_28_in_rule__ProjectiveModelDefinition__Group__0__Impl2695); 
             after(grammarAccess.getProjectiveModelDefinitionAccess().getProjectiveKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectiveModelDefinition__Group__0__Impl"


    // $ANTLR start "rule__ProjectiveModelDefinition__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1278:1: rule__ProjectiveModelDefinition__Group__1 : rule__ProjectiveModelDefinition__Group__1__Impl rule__ProjectiveModelDefinition__Group__2 ;
    public final void rule__ProjectiveModelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1282:1: ( rule__ProjectiveModelDefinition__Group__1__Impl rule__ProjectiveModelDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1283:2: rule__ProjectiveModelDefinition__Group__1__Impl rule__ProjectiveModelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__Group__1__Impl_in_rule__ProjectiveModelDefinition__Group__12726);
            rule__ProjectiveModelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__Group__2_in_rule__ProjectiveModelDefinition__Group__12729);
            rule__ProjectiveModelDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectiveModelDefinition__Group__1"


    // $ANTLR start "rule__ProjectiveModelDefinition__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1290:1: rule__ProjectiveModelDefinition__Group__1__Impl : ( ( rule__ProjectiveModelDefinition__NameAssignment_1 ) ) ;
    public final void rule__ProjectiveModelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1294:1: ( ( ( rule__ProjectiveModelDefinition__NameAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1295:1: ( ( rule__ProjectiveModelDefinition__NameAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1295:1: ( ( rule__ProjectiveModelDefinition__NameAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1296:1: ( rule__ProjectiveModelDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getProjectiveModelDefinitionAccess().getNameAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1297:1: ( rule__ProjectiveModelDefinition__NameAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1297:2: rule__ProjectiveModelDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__NameAssignment_1_in_rule__ProjectiveModelDefinition__Group__1__Impl2756);
            rule__ProjectiveModelDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getProjectiveModelDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectiveModelDefinition__Group__1__Impl"


    // $ANTLR start "rule__ProjectiveModelDefinition__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1307:1: rule__ProjectiveModelDefinition__Group__2 : rule__ProjectiveModelDefinition__Group__2__Impl rule__ProjectiveModelDefinition__Group__3 ;
    public final void rule__ProjectiveModelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1311:1: ( rule__ProjectiveModelDefinition__Group__2__Impl rule__ProjectiveModelDefinition__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1312:2: rule__ProjectiveModelDefinition__Group__2__Impl rule__ProjectiveModelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__Group__2__Impl_in_rule__ProjectiveModelDefinition__Group__22786);
            rule__ProjectiveModelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__Group__3_in_rule__ProjectiveModelDefinition__Group__22789);
            rule__ProjectiveModelDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectiveModelDefinition__Group__2"


    // $ANTLR start "rule__ProjectiveModelDefinition__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1319:1: rule__ProjectiveModelDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__ProjectiveModelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1323:1: ( ( '=' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1324:1: ( '=' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1324:1: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1325:1: '='
            {
             before(grammarAccess.getProjectiveModelDefinitionAccess().getEqualsSignKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__ProjectiveModelDefinition__Group__2__Impl2817); 
             after(grammarAccess.getProjectiveModelDefinitionAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectiveModelDefinition__Group__2__Impl"


    // $ANTLR start "rule__ProjectiveModelDefinition__Group__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1338:1: rule__ProjectiveModelDefinition__Group__3 : rule__ProjectiveModelDefinition__Group__3__Impl ;
    public final void rule__ProjectiveModelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1342:1: ( rule__ProjectiveModelDefinition__Group__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1343:2: rule__ProjectiveModelDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__Group__3__Impl_in_rule__ProjectiveModelDefinition__Group__32848);
            rule__ProjectiveModelDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectiveModelDefinition__Group__3"


    // $ANTLR start "rule__ProjectiveModelDefinition__Group__3__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1349:1: rule__ProjectiveModelDefinition__Group__3__Impl : ( ( rule__ProjectiveModelDefinition__RhsAssignment_3 ) ) ;
    public final void rule__ProjectiveModelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1353:1: ( ( ( rule__ProjectiveModelDefinition__RhsAssignment_3 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1354:1: ( ( rule__ProjectiveModelDefinition__RhsAssignment_3 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1354:1: ( ( rule__ProjectiveModelDefinition__RhsAssignment_3 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1355:1: ( rule__ProjectiveModelDefinition__RhsAssignment_3 )
            {
             before(grammarAccess.getProjectiveModelDefinitionAccess().getRhsAssignment_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1356:1: ( rule__ProjectiveModelDefinition__RhsAssignment_3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1356:2: rule__ProjectiveModelDefinition__RhsAssignment_3
            {
            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__RhsAssignment_3_in_rule__ProjectiveModelDefinition__Group__3__Impl2875);
            rule__ProjectiveModelDefinition__RhsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getProjectiveModelDefinitionAccess().getRhsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectiveModelDefinition__Group__3__Impl"


    // $ANTLR start "rule__RecordExpression__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1374:1: rule__RecordExpression__Group__0 : rule__RecordExpression__Group__0__Impl rule__RecordExpression__Group__1 ;
    public final void rule__RecordExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1378:1: ( rule__RecordExpression__Group__0__Impl rule__RecordExpression__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1379:2: rule__RecordExpression__Group__0__Impl rule__RecordExpression__Group__1
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group__0__Impl_in_rule__RecordExpression__Group__02913);
            rule__RecordExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordExpression__Group__1_in_rule__RecordExpression__Group__02916);
            rule__RecordExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordExpression__Group__0"


    // $ANTLR start "rule__RecordExpression__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1386:1: rule__RecordExpression__Group__0__Impl : ( ( rule__RecordExpression__TermsAssignment_0 ) ) ;
    public final void rule__RecordExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1390:1: ( ( ( rule__RecordExpression__TermsAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1391:1: ( ( rule__RecordExpression__TermsAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1391:1: ( ( rule__RecordExpression__TermsAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1392:1: ( rule__RecordExpression__TermsAssignment_0 )
            {
             before(grammarAccess.getRecordExpressionAccess().getTermsAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1393:1: ( rule__RecordExpression__TermsAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1393:2: rule__RecordExpression__TermsAssignment_0
            {
            pushFollow(FOLLOW_rule__RecordExpression__TermsAssignment_0_in_rule__RecordExpression__Group__0__Impl2943);
            rule__RecordExpression__TermsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRecordExpressionAccess().getTermsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordExpression__Group__0__Impl"


    // $ANTLR start "rule__RecordExpression__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1403:1: rule__RecordExpression__Group__1 : rule__RecordExpression__Group__1__Impl ;
    public final void rule__RecordExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1407:1: ( rule__RecordExpression__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1408:2: rule__RecordExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group__1__Impl_in_rule__RecordExpression__Group__12973);
            rule__RecordExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordExpression__Group__1"


    // $ANTLR start "rule__RecordExpression__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1414:1: rule__RecordExpression__Group__1__Impl : ( ( rule__RecordExpression__Group_1__0 )* ) ;
    public final void rule__RecordExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1418:1: ( ( ( rule__RecordExpression__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1419:1: ( ( rule__RecordExpression__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1419:1: ( ( rule__RecordExpression__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1420:1: ( rule__RecordExpression__Group_1__0 )*
            {
             before(grammarAccess.getRecordExpressionAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1421:1: ( rule__RecordExpression__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==29) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1421:2: rule__RecordExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RecordExpression__Group_1__0_in_rule__RecordExpression__Group__1__Impl3000);
            	    rule__RecordExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getRecordExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordExpression__Group__1__Impl"


    // $ANTLR start "rule__RecordExpression__Group_1__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1435:1: rule__RecordExpression__Group_1__0 : rule__RecordExpression__Group_1__0__Impl rule__RecordExpression__Group_1__1 ;
    public final void rule__RecordExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1439:1: ( rule__RecordExpression__Group_1__0__Impl rule__RecordExpression__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1440:2: rule__RecordExpression__Group_1__0__Impl rule__RecordExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group_1__0__Impl_in_rule__RecordExpression__Group_1__03035);
            rule__RecordExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordExpression__Group_1__1_in_rule__RecordExpression__Group_1__03038);
            rule__RecordExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordExpression__Group_1__0"


    // $ANTLR start "rule__RecordExpression__Group_1__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1447:1: rule__RecordExpression__Group_1__0__Impl : ( '+' ) ;
    public final void rule__RecordExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1451:1: ( ( '+' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1452:1: ( '+' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1452:1: ( '+' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1453:1: '+'
            {
             before(grammarAccess.getRecordExpressionAccess().getPlusSignKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__RecordExpression__Group_1__0__Impl3066); 
             after(grammarAccess.getRecordExpressionAccess().getPlusSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordExpression__Group_1__0__Impl"


    // $ANTLR start "rule__RecordExpression__Group_1__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1466:1: rule__RecordExpression__Group_1__1 : rule__RecordExpression__Group_1__1__Impl ;
    public final void rule__RecordExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1470:1: ( rule__RecordExpression__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1471:2: rule__RecordExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group_1__1__Impl_in_rule__RecordExpression__Group_1__13097);
            rule__RecordExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordExpression__Group_1__1"


    // $ANTLR start "rule__RecordExpression__Group_1__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1477:1: rule__RecordExpression__Group_1__1__Impl : ( ( rule__RecordExpression__TermsAssignment_1_1 ) ) ;
    public final void rule__RecordExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1481:1: ( ( ( rule__RecordExpression__TermsAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1482:1: ( ( rule__RecordExpression__TermsAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1482:1: ( ( rule__RecordExpression__TermsAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1483:1: ( rule__RecordExpression__TermsAssignment_1_1 )
            {
             before(grammarAccess.getRecordExpressionAccess().getTermsAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1484:1: ( rule__RecordExpression__TermsAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1484:2: rule__RecordExpression__TermsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RecordExpression__TermsAssignment_1_1_in_rule__RecordExpression__Group_1__1__Impl3124);
            rule__RecordExpression__TermsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordExpressionAccess().getTermsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordExpression__Group_1__1__Impl"


    // $ANTLR start "rule__RecordTerm__Group_0__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1498:1: rule__RecordTerm__Group_0__0 : rule__RecordTerm__Group_0__0__Impl rule__RecordTerm__Group_0__1 ;
    public final void rule__RecordTerm__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1502:1: ( rule__RecordTerm__Group_0__0__Impl rule__RecordTerm__Group_0__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1503:2: rule__RecordTerm__Group_0__0__Impl rule__RecordTerm__Group_0__1
            {
            pushFollow(FOLLOW_rule__RecordTerm__Group_0__0__Impl_in_rule__RecordTerm__Group_0__03158);
            rule__RecordTerm__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordTerm__Group_0__1_in_rule__RecordTerm__Group_0__03161);
            rule__RecordTerm__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTerm__Group_0__0"


    // $ANTLR start "rule__RecordTerm__Group_0__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1510:1: rule__RecordTerm__Group_0__0__Impl : ( '{' ) ;
    public final void rule__RecordTerm__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1514:1: ( ( '{' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1515:1: ( '{' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1515:1: ( '{' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1516:1: '{'
            {
             before(grammarAccess.getRecordTermAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,30,FOLLOW_30_in_rule__RecordTerm__Group_0__0__Impl3189); 
             after(grammarAccess.getRecordTermAccess().getLeftCurlyBracketKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTerm__Group_0__0__Impl"


    // $ANTLR start "rule__RecordTerm__Group_0__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1529:1: rule__RecordTerm__Group_0__1 : rule__RecordTerm__Group_0__1__Impl rule__RecordTerm__Group_0__2 ;
    public final void rule__RecordTerm__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1533:1: ( rule__RecordTerm__Group_0__1__Impl rule__RecordTerm__Group_0__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1534:2: rule__RecordTerm__Group_0__1__Impl rule__RecordTerm__Group_0__2
            {
            pushFollow(FOLLOW_rule__RecordTerm__Group_0__1__Impl_in_rule__RecordTerm__Group_0__13220);
            rule__RecordTerm__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordTerm__Group_0__2_in_rule__RecordTerm__Group_0__13223);
            rule__RecordTerm__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTerm__Group_0__1"


    // $ANTLR start "rule__RecordTerm__Group_0__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1541:1: rule__RecordTerm__Group_0__1__Impl : ( ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* ) ) ;
    public final void rule__RecordTerm__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1545:1: ( ( ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1546:1: ( ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1546:1: ( ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1547:1: ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1547:1: ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1548:1: ( rule__RecordTerm__PropertiesAssignment_0_1 )
            {
             before(grammarAccess.getRecordTermAccess().getPropertiesAssignment_0_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1549:1: ( rule__RecordTerm__PropertiesAssignment_0_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1549:2: rule__RecordTerm__PropertiesAssignment_0_1
            {
            pushFollow(FOLLOW_rule__RecordTerm__PropertiesAssignment_0_1_in_rule__RecordTerm__Group_0__1__Impl3252);
            rule__RecordTerm__PropertiesAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordTermAccess().getPropertiesAssignment_0_1()); 

            }

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1552:1: ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1553:1: ( rule__RecordTerm__PropertiesAssignment_0_1 )*
            {
             before(grammarAccess.getRecordTermAccess().getPropertiesAssignment_0_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1554:1: ( rule__RecordTerm__PropertiesAssignment_0_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_NAME_TOKEN)||LA13_0==34) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1554:2: rule__RecordTerm__PropertiesAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__RecordTerm__PropertiesAssignment_0_1_in_rule__RecordTerm__Group_0__1__Impl3264);
            	    rule__RecordTerm__PropertiesAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

             after(grammarAccess.getRecordTermAccess().getPropertiesAssignment_0_1()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTerm__Group_0__1__Impl"


    // $ANTLR start "rule__RecordTerm__Group_0__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1565:1: rule__RecordTerm__Group_0__2 : rule__RecordTerm__Group_0__2__Impl ;
    public final void rule__RecordTerm__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1569:1: ( rule__RecordTerm__Group_0__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1570:2: rule__RecordTerm__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__RecordTerm__Group_0__2__Impl_in_rule__RecordTerm__Group_0__23297);
            rule__RecordTerm__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTerm__Group_0__2"


    // $ANTLR start "rule__RecordTerm__Group_0__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1576:1: rule__RecordTerm__Group_0__2__Impl : ( '}' ) ;
    public final void rule__RecordTerm__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1580:1: ( ( '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1581:1: ( '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1581:1: ( '}' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1582:1: '}'
            {
             before(grammarAccess.getRecordTermAccess().getRightCurlyBracketKeyword_0_2()); 
            match(input,31,FOLLOW_31_in_rule__RecordTerm__Group_0__2__Impl3325); 
             after(grammarAccess.getRecordTermAccess().getRightCurlyBracketKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTerm__Group_0__2__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1601:1: rule__PropertyDefinition__Group__0 : rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 ;
    public final void rule__PropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1605:1: ( rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1606:2: rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__03362);
            rule__PropertyDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__03365);
            rule__PropertyDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__0"


    // $ANTLR start "rule__PropertyDefinition__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1613:1: rule__PropertyDefinition__Group__0__Impl : ( ( rule__PropertyDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__PropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1617:1: ( ( ( rule__PropertyDefinition__DescriptionAssignment_0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1618:1: ( ( rule__PropertyDefinition__DescriptionAssignment_0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1618:1: ( ( rule__PropertyDefinition__DescriptionAssignment_0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1619:1: ( rule__PropertyDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDescriptionAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1620:1: ( rule__PropertyDefinition__DescriptionAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1620:2: rule__PropertyDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__DescriptionAssignment_0_in_rule__PropertyDefinition__Group__0__Impl3392);
                    rule__PropertyDefinition__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyDefinitionAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__0__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1630:1: rule__PropertyDefinition__Group__1 : rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 ;
    public final void rule__PropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1634:1: ( rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1635:2: rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__13423);
            rule__PropertyDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__13426);
            rule__PropertyDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__1"


    // $ANTLR start "rule__PropertyDefinition__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1642:1: rule__PropertyDefinition__Group__1__Impl : ( ( rule__PropertyDefinition__AttributesAssignment_1 )? ) ;
    public final void rule__PropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1646:1: ( ( ( rule__PropertyDefinition__AttributesAssignment_1 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1647:1: ( ( rule__PropertyDefinition__AttributesAssignment_1 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1647:1: ( ( rule__PropertyDefinition__AttributesAssignment_1 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1648:1: ( rule__PropertyDefinition__AttributesAssignment_1 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getAttributesAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1649:1: ( rule__PropertyDefinition__AttributesAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==34) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1649:2: rule__PropertyDefinition__AttributesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__AttributesAssignment_1_in_rule__PropertyDefinition__Group__1__Impl3453);
                    rule__PropertyDefinition__AttributesAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyDefinitionAccess().getAttributesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__1__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1659:1: rule__PropertyDefinition__Group__2 : rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 ;
    public final void rule__PropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1663:1: ( rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1664:2: rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__23484);
            rule__PropertyDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__23487);
            rule__PropertyDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__2"


    // $ANTLR start "rule__PropertyDefinition__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1671:1: rule__PropertyDefinition__Group__2__Impl : ( ( rule__PropertyDefinition__NameAssignment_2 ) ) ;
    public final void rule__PropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1675:1: ( ( ( rule__PropertyDefinition__NameAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1676:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1676:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1677:1: ( rule__PropertyDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1678:1: ( rule__PropertyDefinition__NameAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1678:2: rule__PropertyDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__NameAssignment_2_in_rule__PropertyDefinition__Group__2__Impl3514);
            rule__PropertyDefinition__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__2__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1688:1: rule__PropertyDefinition__Group__3 : rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 ;
    public final void rule__PropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1692:1: ( rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1693:2: rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__33544);
            rule__PropertyDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__33547);
            rule__PropertyDefinition__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__3"


    // $ANTLR start "rule__PropertyDefinition__Group__3__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1700:1: rule__PropertyDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__PropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1704:1: ( ( ':' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1705:1: ( ':' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1705:1: ( ':' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1706:1: ':'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getColonKeyword_3()); 
            match(input,32,FOLLOW_32_in_rule__PropertyDefinition__Group__3__Impl3575); 
             after(grammarAccess.getPropertyDefinitionAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__3__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__4"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1719:1: rule__PropertyDefinition__Group__4 : rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 ;
    public final void rule__PropertyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1723:1: ( rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1724:2: rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__43606);
            rule__PropertyDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__43609);
            rule__PropertyDefinition__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__4"


    // $ANTLR start "rule__PropertyDefinition__Group__4__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1731:1: rule__PropertyDefinition__Group__4__Impl : ( ( rule__PropertyDefinition__TypeAssignment_4 ) ) ;
    public final void rule__PropertyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1735:1: ( ( ( rule__PropertyDefinition__TypeAssignment_4 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1736:1: ( ( rule__PropertyDefinition__TypeAssignment_4 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1736:1: ( ( rule__PropertyDefinition__TypeAssignment_4 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1737:1: ( rule__PropertyDefinition__TypeAssignment_4 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_4()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1738:1: ( rule__PropertyDefinition__TypeAssignment_4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1738:2: rule__PropertyDefinition__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__TypeAssignment_4_in_rule__PropertyDefinition__Group__4__Impl3636);
            rule__PropertyDefinition__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__4__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__5"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1748:1: rule__PropertyDefinition__Group__5 : rule__PropertyDefinition__Group__5__Impl ;
    public final void rule__PropertyDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1752:1: ( rule__PropertyDefinition__Group__5__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1753:2: rule__PropertyDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__53666);
            rule__PropertyDefinition__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__5"


    // $ANTLR start "rule__PropertyDefinition__Group__5__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1759:1: rule__PropertyDefinition__Group__5__Impl : ( ';' ) ;
    public final void rule__PropertyDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1763:1: ( ( ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1764:1: ( ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1764:1: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1765:1: ';'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__PropertyDefinition__Group__5__Impl3694); 
             after(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__Group__5__Impl"


    // $ANTLR start "rule__SummarizeModelDefinition__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1790:1: rule__SummarizeModelDefinition__Group__0 : rule__SummarizeModelDefinition__Group__0__Impl rule__SummarizeModelDefinition__Group__1 ;
    public final void rule__SummarizeModelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1794:1: ( rule__SummarizeModelDefinition__Group__0__Impl rule__SummarizeModelDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1795:2: rule__SummarizeModelDefinition__Group__0__Impl rule__SummarizeModelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__0__Impl_in_rule__SummarizeModelDefinition__Group__03737);
            rule__SummarizeModelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__1_in_rule__SummarizeModelDefinition__Group__03740);
            rule__SummarizeModelDefinition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeModelDefinition__Group__0"


    // $ANTLR start "rule__SummarizeModelDefinition__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1802:1: rule__SummarizeModelDefinition__Group__0__Impl : ( 'summarized' ) ;
    public final void rule__SummarizeModelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1806:1: ( ( 'summarized' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1807:1: ( 'summarized' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1807:1: ( 'summarized' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1808:1: 'summarized'
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getSummarizedKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__SummarizeModelDefinition__Group__0__Impl3768); 
             after(grammarAccess.getSummarizeModelDefinitionAccess().getSummarizedKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeModelDefinition__Group__0__Impl"


    // $ANTLR start "rule__SummarizeModelDefinition__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1821:1: rule__SummarizeModelDefinition__Group__1 : rule__SummarizeModelDefinition__Group__1__Impl rule__SummarizeModelDefinition__Group__2 ;
    public final void rule__SummarizeModelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1825:1: ( rule__SummarizeModelDefinition__Group__1__Impl rule__SummarizeModelDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1826:2: rule__SummarizeModelDefinition__Group__1__Impl rule__SummarizeModelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__1__Impl_in_rule__SummarizeModelDefinition__Group__13799);
            rule__SummarizeModelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__2_in_rule__SummarizeModelDefinition__Group__13802);
            rule__SummarizeModelDefinition__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeModelDefinition__Group__1"


    // $ANTLR start "rule__SummarizeModelDefinition__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1833:1: rule__SummarizeModelDefinition__Group__1__Impl : ( ( rule__SummarizeModelDefinition__NameAssignment_1 ) ) ;
    public final void rule__SummarizeModelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1837:1: ( ( ( rule__SummarizeModelDefinition__NameAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1838:1: ( ( rule__SummarizeModelDefinition__NameAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1838:1: ( ( rule__SummarizeModelDefinition__NameAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1839:1: ( rule__SummarizeModelDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getNameAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1840:1: ( rule__SummarizeModelDefinition__NameAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1840:2: rule__SummarizeModelDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__NameAssignment_1_in_rule__SummarizeModelDefinition__Group__1__Impl3829);
            rule__SummarizeModelDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSummarizeModelDefinitionAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeModelDefinition__Group__1__Impl"


    // $ANTLR start "rule__SummarizeModelDefinition__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1850:1: rule__SummarizeModelDefinition__Group__2 : rule__SummarizeModelDefinition__Group__2__Impl rule__SummarizeModelDefinition__Group__3 ;
    public final void rule__SummarizeModelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1854:1: ( rule__SummarizeModelDefinition__Group__2__Impl rule__SummarizeModelDefinition__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1855:2: rule__SummarizeModelDefinition__Group__2__Impl rule__SummarizeModelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__2__Impl_in_rule__SummarizeModelDefinition__Group__23859);
            rule__SummarizeModelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__3_in_rule__SummarizeModelDefinition__Group__23862);
            rule__SummarizeModelDefinition__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeModelDefinition__Group__2"


    // $ANTLR start "rule__SummarizeModelDefinition__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1862:1: rule__SummarizeModelDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__SummarizeModelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1866:1: ( ( '=' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1867:1: ( '=' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1867:1: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1868:1: '='
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getEqualsSignKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__SummarizeModelDefinition__Group__2__Impl3890); 
             after(grammarAccess.getSummarizeModelDefinitionAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeModelDefinition__Group__2__Impl"


    // $ANTLR start "rule__SummarizeModelDefinition__Group__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1881:1: rule__SummarizeModelDefinition__Group__3 : rule__SummarizeModelDefinition__Group__3__Impl ;
    public final void rule__SummarizeModelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1885:1: ( rule__SummarizeModelDefinition__Group__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1886:2: rule__SummarizeModelDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__3__Impl_in_rule__SummarizeModelDefinition__Group__33921);
            rule__SummarizeModelDefinition__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeModelDefinition__Group__3"


    // $ANTLR start "rule__SummarizeModelDefinition__Group__3__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1892:1: rule__SummarizeModelDefinition__Group__3__Impl : ( ( rule__SummarizeModelDefinition__RhsAssignment_3 ) ) ;
    public final void rule__SummarizeModelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1896:1: ( ( ( rule__SummarizeModelDefinition__RhsAssignment_3 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1897:1: ( ( rule__SummarizeModelDefinition__RhsAssignment_3 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1897:1: ( ( rule__SummarizeModelDefinition__RhsAssignment_3 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1898:1: ( rule__SummarizeModelDefinition__RhsAssignment_3 )
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getRhsAssignment_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1899:1: ( rule__SummarizeModelDefinition__RhsAssignment_3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1899:2: rule__SummarizeModelDefinition__RhsAssignment_3
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__RhsAssignment_3_in_rule__SummarizeModelDefinition__Group__3__Impl3948);
            rule__SummarizeModelDefinition__RhsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getSummarizeModelDefinitionAccess().getRhsAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeModelDefinition__Group__3__Impl"


    // $ANTLR start "rule__SummarizeExpression__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1917:1: rule__SummarizeExpression__Group__0 : rule__SummarizeExpression__Group__0__Impl rule__SummarizeExpression__Group__1 ;
    public final void rule__SummarizeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1921:1: ( rule__SummarizeExpression__Group__0__Impl rule__SummarizeExpression__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1922:2: rule__SummarizeExpression__Group__0__Impl rule__SummarizeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group__0__Impl_in_rule__SummarizeExpression__Group__03986);
            rule__SummarizeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeExpression__Group__1_in_rule__SummarizeExpression__Group__03989);
            rule__SummarizeExpression__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeExpression__Group__0"


    // $ANTLR start "rule__SummarizeExpression__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1929:1: rule__SummarizeExpression__Group__0__Impl : ( ( rule__SummarizeExpression__TermsAssignment_0 ) ) ;
    public final void rule__SummarizeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1933:1: ( ( ( rule__SummarizeExpression__TermsAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1934:1: ( ( rule__SummarizeExpression__TermsAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1934:1: ( ( rule__SummarizeExpression__TermsAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1935:1: ( rule__SummarizeExpression__TermsAssignment_0 )
            {
             before(grammarAccess.getSummarizeExpressionAccess().getTermsAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1936:1: ( rule__SummarizeExpression__TermsAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1936:2: rule__SummarizeExpression__TermsAssignment_0
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__TermsAssignment_0_in_rule__SummarizeExpression__Group__0__Impl4016);
            rule__SummarizeExpression__TermsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSummarizeExpressionAccess().getTermsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeExpression__Group__0__Impl"


    // $ANTLR start "rule__SummarizeExpression__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1946:1: rule__SummarizeExpression__Group__1 : rule__SummarizeExpression__Group__1__Impl ;
    public final void rule__SummarizeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1950:1: ( rule__SummarizeExpression__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1951:2: rule__SummarizeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group__1__Impl_in_rule__SummarizeExpression__Group__14046);
            rule__SummarizeExpression__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeExpression__Group__1"


    // $ANTLR start "rule__SummarizeExpression__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1957:1: rule__SummarizeExpression__Group__1__Impl : ( ( rule__SummarizeExpression__Group_1__0 )* ) ;
    public final void rule__SummarizeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1961:1: ( ( ( rule__SummarizeExpression__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1962:1: ( ( rule__SummarizeExpression__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1962:1: ( ( rule__SummarizeExpression__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1963:1: ( rule__SummarizeExpression__Group_1__0 )*
            {
             before(grammarAccess.getSummarizeExpressionAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1964:1: ( rule__SummarizeExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==29) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1964:2: rule__SummarizeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SummarizeExpression__Group_1__0_in_rule__SummarizeExpression__Group__1__Impl4073);
            	    rule__SummarizeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getSummarizeExpressionAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeExpression__Group__1__Impl"


    // $ANTLR start "rule__SummarizeExpression__Group_1__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1978:1: rule__SummarizeExpression__Group_1__0 : rule__SummarizeExpression__Group_1__0__Impl rule__SummarizeExpression__Group_1__1 ;
    public final void rule__SummarizeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1982:1: ( rule__SummarizeExpression__Group_1__0__Impl rule__SummarizeExpression__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1983:2: rule__SummarizeExpression__Group_1__0__Impl rule__SummarizeExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group_1__0__Impl_in_rule__SummarizeExpression__Group_1__04108);
            rule__SummarizeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeExpression__Group_1__1_in_rule__SummarizeExpression__Group_1__04111);
            rule__SummarizeExpression__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeExpression__Group_1__0"


    // $ANTLR start "rule__SummarizeExpression__Group_1__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1990:1: rule__SummarizeExpression__Group_1__0__Impl : ( '+' ) ;
    public final void rule__SummarizeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1994:1: ( ( '+' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1995:1: ( '+' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1995:1: ( '+' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1996:1: '+'
            {
             before(grammarAccess.getSummarizeExpressionAccess().getPlusSignKeyword_1_0()); 
            match(input,29,FOLLOW_29_in_rule__SummarizeExpression__Group_1__0__Impl4139); 
             after(grammarAccess.getSummarizeExpressionAccess().getPlusSignKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeExpression__Group_1__0__Impl"


    // $ANTLR start "rule__SummarizeExpression__Group_1__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2009:1: rule__SummarizeExpression__Group_1__1 : rule__SummarizeExpression__Group_1__1__Impl ;
    public final void rule__SummarizeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2013:1: ( rule__SummarizeExpression__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2014:2: rule__SummarizeExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group_1__1__Impl_in_rule__SummarizeExpression__Group_1__14170);
            rule__SummarizeExpression__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeExpression__Group_1__1"


    // $ANTLR start "rule__SummarizeExpression__Group_1__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2020:1: rule__SummarizeExpression__Group_1__1__Impl : ( ( rule__SummarizeExpression__TermsAssignment_1_1 ) ) ;
    public final void rule__SummarizeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2024:1: ( ( ( rule__SummarizeExpression__TermsAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2025:1: ( ( rule__SummarizeExpression__TermsAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2025:1: ( ( rule__SummarizeExpression__TermsAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2026:1: ( rule__SummarizeExpression__TermsAssignment_1_1 )
            {
             before(grammarAccess.getSummarizeExpressionAccess().getTermsAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2027:1: ( rule__SummarizeExpression__TermsAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2027:2: rule__SummarizeExpression__TermsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__TermsAssignment_1_1_in_rule__SummarizeExpression__Group_1__1__Impl4197);
            rule__SummarizeExpression__TermsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSummarizeExpressionAccess().getTermsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeExpression__Group_1__1__Impl"


    // $ANTLR start "rule__SummarizeTerm__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2041:1: rule__SummarizeTerm__Group__0 : rule__SummarizeTerm__Group__0__Impl rule__SummarizeTerm__Group__1 ;
    public final void rule__SummarizeTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2045:1: ( rule__SummarizeTerm__Group__0__Impl rule__SummarizeTerm__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2046:2: rule__SummarizeTerm__Group__0__Impl rule__SummarizeTerm__Group__1
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__Group__0__Impl_in_rule__SummarizeTerm__Group__04231);
            rule__SummarizeTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeTerm__Group__1_in_rule__SummarizeTerm__Group__04234);
            rule__SummarizeTerm__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeTerm__Group__0"


    // $ANTLR start "rule__SummarizeTerm__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2053:1: rule__SummarizeTerm__Group__0__Impl : ( ( rule__SummarizeTerm__ReferenceAssignment_0 ) ) ;
    public final void rule__SummarizeTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2057:1: ( ( ( rule__SummarizeTerm__ReferenceAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2058:1: ( ( rule__SummarizeTerm__ReferenceAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2058:1: ( ( rule__SummarizeTerm__ReferenceAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2059:1: ( rule__SummarizeTerm__ReferenceAssignment_0 )
            {
             before(grammarAccess.getSummarizeTermAccess().getReferenceAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2060:1: ( rule__SummarizeTerm__ReferenceAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2060:2: rule__SummarizeTerm__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__ReferenceAssignment_0_in_rule__SummarizeTerm__Group__0__Impl4261);
            rule__SummarizeTerm__ReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getSummarizeTermAccess().getReferenceAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeTerm__Group__0__Impl"


    // $ANTLR start "rule__SummarizeTerm__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2070:1: rule__SummarizeTerm__Group__1 : rule__SummarizeTerm__Group__1__Impl rule__SummarizeTerm__Group__2 ;
    public final void rule__SummarizeTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2074:1: ( rule__SummarizeTerm__Group__1__Impl rule__SummarizeTerm__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2075:2: rule__SummarizeTerm__Group__1__Impl rule__SummarizeTerm__Group__2
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__Group__1__Impl_in_rule__SummarizeTerm__Group__14291);
            rule__SummarizeTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeTerm__Group__2_in_rule__SummarizeTerm__Group__14294);
            rule__SummarizeTerm__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeTerm__Group__1"


    // $ANTLR start "rule__SummarizeTerm__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2082:1: rule__SummarizeTerm__Group__1__Impl : ( ( rule__SummarizeTerm__FoldingAssignment_1 ) ) ;
    public final void rule__SummarizeTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2086:1: ( ( ( rule__SummarizeTerm__FoldingAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2087:1: ( ( rule__SummarizeTerm__FoldingAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2087:1: ( ( rule__SummarizeTerm__FoldingAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2088:1: ( rule__SummarizeTerm__FoldingAssignment_1 )
            {
             before(grammarAccess.getSummarizeTermAccess().getFoldingAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2089:1: ( rule__SummarizeTerm__FoldingAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2089:2: rule__SummarizeTerm__FoldingAssignment_1
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__FoldingAssignment_1_in_rule__SummarizeTerm__Group__1__Impl4321);
            rule__SummarizeTerm__FoldingAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSummarizeTermAccess().getFoldingAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeTerm__Group__1__Impl"


    // $ANTLR start "rule__SummarizeTerm__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2099:1: rule__SummarizeTerm__Group__2 : rule__SummarizeTerm__Group__2__Impl ;
    public final void rule__SummarizeTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2103:1: ( rule__SummarizeTerm__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2104:2: rule__SummarizeTerm__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__Group__2__Impl_in_rule__SummarizeTerm__Group__24351);
            rule__SummarizeTerm__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeTerm__Group__2"


    // $ANTLR start "rule__SummarizeTerm__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2110:1: rule__SummarizeTerm__Group__2__Impl : ( ( rule__SummarizeTerm__GroupingAssignment_2 )? ) ;
    public final void rule__SummarizeTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2114:1: ( ( ( rule__SummarizeTerm__GroupingAssignment_2 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2115:1: ( ( rule__SummarizeTerm__GroupingAssignment_2 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2115:1: ( ( rule__SummarizeTerm__GroupingAssignment_2 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2116:1: ( rule__SummarizeTerm__GroupingAssignment_2 )?
            {
             before(grammarAccess.getSummarizeTermAccess().getGroupingAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2117:1: ( rule__SummarizeTerm__GroupingAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==38) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2117:2: rule__SummarizeTerm__GroupingAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SummarizeTerm__GroupingAssignment_2_in_rule__SummarizeTerm__Group__2__Impl4378);
                    rule__SummarizeTerm__GroupingAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSummarizeTermAccess().getGroupingAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeTerm__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2133:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2137:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2138:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04415);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04418);
            rule__Attribute__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0"


    // $ANTLR start "rule__Attribute__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2145:1: rule__Attribute__Group__0__Impl : ( '@' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2149:1: ( ( '@' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2150:1: ( '@' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2150:1: ( '@' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2151:1: '@'
            {
             before(grammarAccess.getAttributeAccess().getCommercialAtKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__Attribute__Group__0__Impl4446); 
             after(grammarAccess.getAttributeAccess().getCommercialAtKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__0__Impl"


    // $ANTLR start "rule__Attribute__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2164:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2168:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2169:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14477);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14480);
            rule__Attribute__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1"


    // $ANTLR start "rule__Attribute__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2176:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2180:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2181:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2181:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2182:1: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2183:1: ( rule__Attribute__NameAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2183:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl4507);
            rule__Attribute__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__1__Impl"


    // $ANTLR start "rule__Attribute__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2193:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2197:1: ( rule__Attribute__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2198:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24537);
            rule__Attribute__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2"


    // $ANTLR start "rule__Attribute__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2204:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2208:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2209:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2209:1: ( ( rule__Attribute__Group_2__0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2210:1: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2211:1: ( rule__Attribute__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==35) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2211:2: rule__Attribute__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_2__0_in_rule__Attribute__Group__2__Impl4564);
                    rule__Attribute__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group__2__Impl"


    // $ANTLR start "rule__Attribute__Group_2__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2227:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2231:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2232:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__0__Impl_in_rule__Attribute__Group_2__04601);
            rule__Attribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_2__1_in_rule__Attribute__Group_2__04604);
            rule__Attribute__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__0"


    // $ANTLR start "rule__Attribute__Group_2__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2239:1: rule__Attribute__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2243:1: ( ( '(' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2244:1: ( '(' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2244:1: ( '(' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2245:1: '('
            {
             before(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,35,FOLLOW_35_in_rule__Attribute__Group_2__0__Impl4632); 
             after(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__0__Impl"


    // $ANTLR start "rule__Attribute__Group_2__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2258:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2262:1: ( rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2263:2: rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__1__Impl_in_rule__Attribute__Group_2__14663);
            rule__Attribute__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_2__2_in_rule__Attribute__Group_2__14666);
            rule__Attribute__Group_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__1"


    // $ANTLR start "rule__Attribute__Group_2__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2270:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__Group_2_1__0 )? ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2274:1: ( ( ( rule__Attribute__Group_2_1__0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2275:1: ( ( rule__Attribute__Group_2_1__0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2275:1: ( ( rule__Attribute__Group_2_1__0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2276:1: ( rule__Attribute__Group_2_1__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2277:1: ( rule__Attribute__Group_2_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_NAME_TOKEN) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2277:2: rule__Attribute__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_2_1__0_in_rule__Attribute__Group_2__1__Impl4693);
                    rule__Attribute__Group_2_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getGroup_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__1__Impl"


    // $ANTLR start "rule__Attribute__Group_2__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2287:1: rule__Attribute__Group_2__2 : rule__Attribute__Group_2__2__Impl ;
    public final void rule__Attribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2291:1: ( rule__Attribute__Group_2__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2292:2: rule__Attribute__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__2__Impl_in_rule__Attribute__Group_2__24724);
            rule__Attribute__Group_2__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__2"


    // $ANTLR start "rule__Attribute__Group_2__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2298:1: rule__Attribute__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Attribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2302:1: ( ( ')' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2303:1: ( ')' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2303:1: ( ')' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2304:1: ')'
            {
             before(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_2_2()); 
            match(input,36,FOLLOW_36_in_rule__Attribute__Group_2__2__Impl4752); 
             after(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2__2__Impl"


    // $ANTLR start "rule__Attribute__Group_2_1__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2323:1: rule__Attribute__Group_2_1__0 : rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 ;
    public final void rule__Attribute__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2327:1: ( rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2328:2: rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2_1__0__Impl_in_rule__Attribute__Group_2_1__04789);
            rule__Attribute__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_2_1__1_in_rule__Attribute__Group_2_1__04792);
            rule__Attribute__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2_1__0"


    // $ANTLR start "rule__Attribute__Group_2_1__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2335:1: rule__Attribute__Group_2_1__0__Impl : ( ( rule__Attribute__ElementsAssignment_2_1_0 ) ) ;
    public final void rule__Attribute__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2339:1: ( ( ( rule__Attribute__ElementsAssignment_2_1_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2340:1: ( ( rule__Attribute__ElementsAssignment_2_1_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2340:1: ( ( rule__Attribute__ElementsAssignment_2_1_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2341:1: ( rule__Attribute__ElementsAssignment_2_1_0 )
            {
             before(grammarAccess.getAttributeAccess().getElementsAssignment_2_1_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2342:1: ( rule__Attribute__ElementsAssignment_2_1_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2342:2: rule__Attribute__ElementsAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__Attribute__ElementsAssignment_2_1_0_in_rule__Attribute__Group_2_1__0__Impl4819);
            rule__Attribute__ElementsAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeAccess().getElementsAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2_1__0__Impl"


    // $ANTLR start "rule__Attribute__Group_2_1__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2352:1: rule__Attribute__Group_2_1__1 : rule__Attribute__Group_2_1__1__Impl ;
    public final void rule__Attribute__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2356:1: ( rule__Attribute__Group_2_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2357:2: rule__Attribute__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2_1__1__Impl_in_rule__Attribute__Group_2_1__14849);
            rule__Attribute__Group_2_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2_1__1"


    // $ANTLR start "rule__Attribute__Group_2_1__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2363:1: rule__Attribute__Group_2_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__Attribute__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2367:1: ( ( ( ',' )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2368:1: ( ( ',' )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2368:1: ( ( ',' )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2369:1: ( ',' )?
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_2_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2370:1: ( ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==37) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2371:2: ','
                    {
                    match(input,37,FOLLOW_37_in_rule__Attribute__Group_2_1__1__Impl4878); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getCommaKeyword_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__Group_2_1__1__Impl"


    // $ANTLR start "rule__AttributeElementList__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2386:1: rule__AttributeElementList__Group__0 : rule__AttributeElementList__Group__0__Impl rule__AttributeElementList__Group__1 ;
    public final void rule__AttributeElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2390:1: ( rule__AttributeElementList__Group__0__Impl rule__AttributeElementList__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2391:2: rule__AttributeElementList__Group__0__Impl rule__AttributeElementList__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group__0__Impl_in_rule__AttributeElementList__Group__04915);
            rule__AttributeElementList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElementList__Group__1_in_rule__AttributeElementList__Group__04918);
            rule__AttributeElementList__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementList__Group__0"


    // $ANTLR start "rule__AttributeElementList__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2398:1: rule__AttributeElementList__Group__0__Impl : ( ( rule__AttributeElementList__ElementsAssignment_0 ) ) ;
    public final void rule__AttributeElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2402:1: ( ( ( rule__AttributeElementList__ElementsAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2403:1: ( ( rule__AttributeElementList__ElementsAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2403:1: ( ( rule__AttributeElementList__ElementsAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2404:1: ( rule__AttributeElementList__ElementsAssignment_0 )
            {
             before(grammarAccess.getAttributeElementListAccess().getElementsAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2405:1: ( rule__AttributeElementList__ElementsAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2405:2: rule__AttributeElementList__ElementsAssignment_0
            {
            pushFollow(FOLLOW_rule__AttributeElementList__ElementsAssignment_0_in_rule__AttributeElementList__Group__0__Impl4945);
            rule__AttributeElementList__ElementsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeElementListAccess().getElementsAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementList__Group__0__Impl"


    // $ANTLR start "rule__AttributeElementList__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2415:1: rule__AttributeElementList__Group__1 : rule__AttributeElementList__Group__1__Impl ;
    public final void rule__AttributeElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2419:1: ( rule__AttributeElementList__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2420:2: rule__AttributeElementList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group__1__Impl_in_rule__AttributeElementList__Group__14975);
            rule__AttributeElementList__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementList__Group__1"


    // $ANTLR start "rule__AttributeElementList__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2426:1: rule__AttributeElementList__Group__1__Impl : ( ( rule__AttributeElementList__Group_1__0 )* ) ;
    public final void rule__AttributeElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2430:1: ( ( ( rule__AttributeElementList__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2431:1: ( ( rule__AttributeElementList__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2431:1: ( ( rule__AttributeElementList__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2432:1: ( rule__AttributeElementList__Group_1__0 )*
            {
             before(grammarAccess.getAttributeElementListAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2433:1: ( rule__AttributeElementList__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==37) ) {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==RULE_NAME_TOKEN) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2433:2: rule__AttributeElementList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AttributeElementList__Group_1__0_in_rule__AttributeElementList__Group__1__Impl5002);
            	    rule__AttributeElementList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

             after(grammarAccess.getAttributeElementListAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementList__Group__1__Impl"


    // $ANTLR start "rule__AttributeElementList__Group_1__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2447:1: rule__AttributeElementList__Group_1__0 : rule__AttributeElementList__Group_1__0__Impl rule__AttributeElementList__Group_1__1 ;
    public final void rule__AttributeElementList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2451:1: ( rule__AttributeElementList__Group_1__0__Impl rule__AttributeElementList__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2452:2: rule__AttributeElementList__Group_1__0__Impl rule__AttributeElementList__Group_1__1
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group_1__0__Impl_in_rule__AttributeElementList__Group_1__05037);
            rule__AttributeElementList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElementList__Group_1__1_in_rule__AttributeElementList__Group_1__05040);
            rule__AttributeElementList__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementList__Group_1__0"


    // $ANTLR start "rule__AttributeElementList__Group_1__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2459:1: rule__AttributeElementList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AttributeElementList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2463:1: ( ( ',' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2464:1: ( ',' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2464:1: ( ',' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2465:1: ','
            {
             before(grammarAccess.getAttributeElementListAccess().getCommaKeyword_1_0()); 
            match(input,37,FOLLOW_37_in_rule__AttributeElementList__Group_1__0__Impl5068); 
             after(grammarAccess.getAttributeElementListAccess().getCommaKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementList__Group_1__0__Impl"


    // $ANTLR start "rule__AttributeElementList__Group_1__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2478:1: rule__AttributeElementList__Group_1__1 : rule__AttributeElementList__Group_1__1__Impl ;
    public final void rule__AttributeElementList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2482:1: ( rule__AttributeElementList__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2483:2: rule__AttributeElementList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group_1__1__Impl_in_rule__AttributeElementList__Group_1__15099);
            rule__AttributeElementList__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementList__Group_1__1"


    // $ANTLR start "rule__AttributeElementList__Group_1__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2489:1: rule__AttributeElementList__Group_1__1__Impl : ( ( rule__AttributeElementList__ElementsAssignment_1_1 ) ) ;
    public final void rule__AttributeElementList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2493:1: ( ( ( rule__AttributeElementList__ElementsAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2494:1: ( ( rule__AttributeElementList__ElementsAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2494:1: ( ( rule__AttributeElementList__ElementsAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2495:1: ( rule__AttributeElementList__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getAttributeElementListAccess().getElementsAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2496:1: ( rule__AttributeElementList__ElementsAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2496:2: rule__AttributeElementList__ElementsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AttributeElementList__ElementsAssignment_1_1_in_rule__AttributeElementList__Group_1__1__Impl5126);
            rule__AttributeElementList__ElementsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeElementListAccess().getElementsAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementList__Group_1__1__Impl"


    // $ANTLR start "rule__AttributeElement__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2510:1: rule__AttributeElement__Group__0 : rule__AttributeElement__Group__0__Impl rule__AttributeElement__Group__1 ;
    public final void rule__AttributeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2514:1: ( rule__AttributeElement__Group__0__Impl rule__AttributeElement__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2515:2: rule__AttributeElement__Group__0__Impl rule__AttributeElement__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeElement__Group__0__Impl_in_rule__AttributeElement__Group__05160);
            rule__AttributeElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElement__Group__1_in_rule__AttributeElement__Group__05163);
            rule__AttributeElement__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElement__Group__0"


    // $ANTLR start "rule__AttributeElement__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2522:1: rule__AttributeElement__Group__0__Impl : ( ( rule__AttributeElement__NameAssignment_0 ) ) ;
    public final void rule__AttributeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2526:1: ( ( ( rule__AttributeElement__NameAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2527:1: ( ( rule__AttributeElement__NameAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2527:1: ( ( rule__AttributeElement__NameAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2528:1: ( rule__AttributeElement__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeElementAccess().getNameAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2529:1: ( rule__AttributeElement__NameAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2529:2: rule__AttributeElement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AttributeElement__NameAssignment_0_in_rule__AttributeElement__Group__0__Impl5190);
            rule__AttributeElement__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeElementAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElement__Group__0__Impl"


    // $ANTLR start "rule__AttributeElement__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2539:1: rule__AttributeElement__Group__1 : rule__AttributeElement__Group__1__Impl rule__AttributeElement__Group__2 ;
    public final void rule__AttributeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2543:1: ( rule__AttributeElement__Group__1__Impl rule__AttributeElement__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2544:2: rule__AttributeElement__Group__1__Impl rule__AttributeElement__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeElement__Group__1__Impl_in_rule__AttributeElement__Group__15220);
            rule__AttributeElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElement__Group__2_in_rule__AttributeElement__Group__15223);
            rule__AttributeElement__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElement__Group__1"


    // $ANTLR start "rule__AttributeElement__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2551:1: rule__AttributeElement__Group__1__Impl : ( '=' ) ;
    public final void rule__AttributeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2555:1: ( ( '=' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2556:1: ( '=' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2556:1: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2557:1: '='
            {
             before(grammarAccess.getAttributeElementAccess().getEqualsSignKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__AttributeElement__Group__1__Impl5251); 
             after(grammarAccess.getAttributeElementAccess().getEqualsSignKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElement__Group__1__Impl"


    // $ANTLR start "rule__AttributeElement__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2570:1: rule__AttributeElement__Group__2 : rule__AttributeElement__Group__2__Impl ;
    public final void rule__AttributeElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2574:1: ( rule__AttributeElement__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2575:2: rule__AttributeElement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeElement__Group__2__Impl_in_rule__AttributeElement__Group__25282);
            rule__AttributeElement__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElement__Group__2"


    // $ANTLR start "rule__AttributeElement__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2581:1: rule__AttributeElement__Group__2__Impl : ( ( rule__AttributeElement__ValueAssignment_2 ) ) ;
    public final void rule__AttributeElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2585:1: ( ( ( rule__AttributeElement__ValueAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2586:1: ( ( rule__AttributeElement__ValueAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2586:1: ( ( rule__AttributeElement__ValueAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2587:1: ( rule__AttributeElement__ValueAssignment_2 )
            {
             before(grammarAccess.getAttributeElementAccess().getValueAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2588:1: ( rule__AttributeElement__ValueAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2588:2: rule__AttributeElement__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__AttributeElement__ValueAssignment_2_in_rule__AttributeElement__Group__2__Impl5309);
            rule__AttributeElement__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getAttributeElementAccess().getValueAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElement__Group__2__Impl"


    // $ANTLR start "rule__AttributeValueArray__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2604:1: rule__AttributeValueArray__Group__0 : rule__AttributeValueArray__Group__0__Impl rule__AttributeValueArray__Group__1 ;
    public final void rule__AttributeValueArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2608:1: ( rule__AttributeValueArray__Group__0__Impl rule__AttributeValueArray__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2609:2: rule__AttributeValueArray__Group__0__Impl rule__AttributeValueArray__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__0__Impl_in_rule__AttributeValueArray__Group__05345);
            rule__AttributeValueArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group__1_in_rule__AttributeValueArray__Group__05348);
            rule__AttributeValueArray__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueArray__Group__0"


    // $ANTLR start "rule__AttributeValueArray__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2616:1: rule__AttributeValueArray__Group__0__Impl : ( '{' ) ;
    public final void rule__AttributeValueArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2620:1: ( ( '{' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2621:1: ( '{' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2621:1: ( '{' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2622:1: '{'
            {
             before(grammarAccess.getAttributeValueArrayAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,30,FOLLOW_30_in_rule__AttributeValueArray__Group__0__Impl5376); 
             after(grammarAccess.getAttributeValueArrayAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueArray__Group__0__Impl"


    // $ANTLR start "rule__AttributeValueArray__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2635:1: rule__AttributeValueArray__Group__1 : rule__AttributeValueArray__Group__1__Impl rule__AttributeValueArray__Group__2 ;
    public final void rule__AttributeValueArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2639:1: ( rule__AttributeValueArray__Group__1__Impl rule__AttributeValueArray__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2640:2: rule__AttributeValueArray__Group__1__Impl rule__AttributeValueArray__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__1__Impl_in_rule__AttributeValueArray__Group__15407);
            rule__AttributeValueArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group__2_in_rule__AttributeValueArray__Group__15410);
            rule__AttributeValueArray__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueArray__Group__1"


    // $ANTLR start "rule__AttributeValueArray__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2647:1: rule__AttributeValueArray__Group__1__Impl : ( ( rule__AttributeValueArray__ElementsAssignment_1 ) ) ;
    public final void rule__AttributeValueArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2651:1: ( ( ( rule__AttributeValueArray__ElementsAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2652:1: ( ( rule__AttributeValueArray__ElementsAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2652:1: ( ( rule__AttributeValueArray__ElementsAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2653:1: ( rule__AttributeValueArray__ElementsAssignment_1 )
            {
             before(grammarAccess.getAttributeValueArrayAccess().getElementsAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2654:1: ( rule__AttributeValueArray__ElementsAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2654:2: rule__AttributeValueArray__ElementsAssignment_1
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__ElementsAssignment_1_in_rule__AttributeValueArray__Group__1__Impl5437);
            rule__AttributeValueArray__ElementsAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValueArrayAccess().getElementsAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueArray__Group__1__Impl"


    // $ANTLR start "rule__AttributeValueArray__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2664:1: rule__AttributeValueArray__Group__2 : rule__AttributeValueArray__Group__2__Impl rule__AttributeValueArray__Group__3 ;
    public final void rule__AttributeValueArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2668:1: ( rule__AttributeValueArray__Group__2__Impl rule__AttributeValueArray__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2669:2: rule__AttributeValueArray__Group__2__Impl rule__AttributeValueArray__Group__3
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__2__Impl_in_rule__AttributeValueArray__Group__25467);
            rule__AttributeValueArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group__3_in_rule__AttributeValueArray__Group__25470);
            rule__AttributeValueArray__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueArray__Group__2"


    // $ANTLR start "rule__AttributeValueArray__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2676:1: rule__AttributeValueArray__Group__2__Impl : ( ( rule__AttributeValueArray__Group_2__0 )* ) ;
    public final void rule__AttributeValueArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2680:1: ( ( ( rule__AttributeValueArray__Group_2__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2681:1: ( ( rule__AttributeValueArray__Group_2__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2681:1: ( ( rule__AttributeValueArray__Group_2__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2682:1: ( rule__AttributeValueArray__Group_2__0 )*
            {
             before(grammarAccess.getAttributeValueArrayAccess().getGroup_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2683:1: ( rule__AttributeValueArray__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==37) ) {
                    int LA22_1 = input.LA(2);

                    if ( ((LA22_1>=RULE_STRING && LA22_1<=RULE_DECIMAL)||(LA22_1>=24 && LA22_1<=25)||LA22_1==30) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2683:2: rule__AttributeValueArray__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__AttributeValueArray__Group_2__0_in_rule__AttributeValueArray__Group__2__Impl5497);
            	    rule__AttributeValueArray__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

             after(grammarAccess.getAttributeValueArrayAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueArray__Group__2__Impl"


    // $ANTLR start "rule__AttributeValueArray__Group__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2693:1: rule__AttributeValueArray__Group__3 : rule__AttributeValueArray__Group__3__Impl rule__AttributeValueArray__Group__4 ;
    public final void rule__AttributeValueArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2697:1: ( rule__AttributeValueArray__Group__3__Impl rule__AttributeValueArray__Group__4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2698:2: rule__AttributeValueArray__Group__3__Impl rule__AttributeValueArray__Group__4
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__3__Impl_in_rule__AttributeValueArray__Group__35528);
            rule__AttributeValueArray__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group__4_in_rule__AttributeValueArray__Group__35531);
            rule__AttributeValueArray__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueArray__Group__3"


    // $ANTLR start "rule__AttributeValueArray__Group__3__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2705:1: rule__AttributeValueArray__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__AttributeValueArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2709:1: ( ( ( ',' )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2710:1: ( ( ',' )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2710:1: ( ( ',' )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2711:1: ( ',' )?
            {
             before(grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2712:1: ( ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==37) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2713:2: ','
                    {
                    match(input,37,FOLLOW_37_in_rule__AttributeValueArray__Group__3__Impl5560); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueArray__Group__3__Impl"


    // $ANTLR start "rule__AttributeValueArray__Group__4"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2724:1: rule__AttributeValueArray__Group__4 : rule__AttributeValueArray__Group__4__Impl ;
    public final void rule__AttributeValueArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2728:1: ( rule__AttributeValueArray__Group__4__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2729:2: rule__AttributeValueArray__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__4__Impl_in_rule__AttributeValueArray__Group__45593);
            rule__AttributeValueArray__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueArray__Group__4"


    // $ANTLR start "rule__AttributeValueArray__Group__4__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2735:1: rule__AttributeValueArray__Group__4__Impl : ( '}' ) ;
    public final void rule__AttributeValueArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2739:1: ( ( '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2740:1: ( '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2740:1: ( '}' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2741:1: '}'
            {
             before(grammarAccess.getAttributeValueArrayAccess().getRightCurlyBracketKeyword_4()); 
            match(input,31,FOLLOW_31_in_rule__AttributeValueArray__Group__4__Impl5621); 
             after(grammarAccess.getAttributeValueArrayAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueArray__Group__4__Impl"


    // $ANTLR start "rule__AttributeValueArray__Group_2__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2764:1: rule__AttributeValueArray__Group_2__0 : rule__AttributeValueArray__Group_2__0__Impl rule__AttributeValueArray__Group_2__1 ;
    public final void rule__AttributeValueArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2768:1: ( rule__AttributeValueArray__Group_2__0__Impl rule__AttributeValueArray__Group_2__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2769:2: rule__AttributeValueArray__Group_2__0__Impl rule__AttributeValueArray__Group_2__1
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group_2__0__Impl_in_rule__AttributeValueArray__Group_2__05662);
            rule__AttributeValueArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group_2__1_in_rule__AttributeValueArray__Group_2__05665);
            rule__AttributeValueArray__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueArray__Group_2__0"


    // $ANTLR start "rule__AttributeValueArray__Group_2__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2776:1: rule__AttributeValueArray__Group_2__0__Impl : ( ',' ) ;
    public final void rule__AttributeValueArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2780:1: ( ( ',' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2781:1: ( ',' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2781:1: ( ',' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2782:1: ','
            {
             before(grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_2_0()); 
            match(input,37,FOLLOW_37_in_rule__AttributeValueArray__Group_2__0__Impl5693); 
             after(grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueArray__Group_2__0__Impl"


    // $ANTLR start "rule__AttributeValueArray__Group_2__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2795:1: rule__AttributeValueArray__Group_2__1 : rule__AttributeValueArray__Group_2__1__Impl ;
    public final void rule__AttributeValueArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2799:1: ( rule__AttributeValueArray__Group_2__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2800:2: rule__AttributeValueArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group_2__1__Impl_in_rule__AttributeValueArray__Group_2__15724);
            rule__AttributeValueArray__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueArray__Group_2__1"


    // $ANTLR start "rule__AttributeValueArray__Group_2__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2806:1: rule__AttributeValueArray__Group_2__1__Impl : ( ( rule__AttributeValueArray__ElementsAssignment_2_1 ) ) ;
    public final void rule__AttributeValueArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2810:1: ( ( ( rule__AttributeValueArray__ElementsAssignment_2_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2811:1: ( ( rule__AttributeValueArray__ElementsAssignment_2_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2811:1: ( ( rule__AttributeValueArray__ElementsAssignment_2_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2812:1: ( rule__AttributeValueArray__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getAttributeValueArrayAccess().getElementsAssignment_2_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2813:1: ( rule__AttributeValueArray__ElementsAssignment_2_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2813:2: rule__AttributeValueArray__ElementsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__ElementsAssignment_2_1_in_rule__AttributeValueArray__Group_2__1__Impl5751);
            rule__AttributeValueArray__ElementsAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getAttributeValueArrayAccess().getElementsAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueArray__Group_2__1__Impl"


    // $ANTLR start "rule__Grouping__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2827:1: rule__Grouping__Group__0 : rule__Grouping__Group__0__Impl rule__Grouping__Group__1 ;
    public final void rule__Grouping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2831:1: ( rule__Grouping__Group__0__Impl rule__Grouping__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2832:2: rule__Grouping__Group__0__Impl rule__Grouping__Group__1
            {
            pushFollow(FOLLOW_rule__Grouping__Group__0__Impl_in_rule__Grouping__Group__05785);
            rule__Grouping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group__1_in_rule__Grouping__Group__05788);
            rule__Grouping__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__0"


    // $ANTLR start "rule__Grouping__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2839:1: rule__Grouping__Group__0__Impl : ( '%' ) ;
    public final void rule__Grouping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2843:1: ( ( '%' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2844:1: ( '%' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2844:1: ( '%' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2845:1: '%'
            {
             before(grammarAccess.getGroupingAccess().getPercentSignKeyword_0()); 
            match(input,38,FOLLOW_38_in_rule__Grouping__Group__0__Impl5816); 
             after(grammarAccess.getGroupingAccess().getPercentSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__0__Impl"


    // $ANTLR start "rule__Grouping__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2858:1: rule__Grouping__Group__1 : rule__Grouping__Group__1__Impl rule__Grouping__Group__2 ;
    public final void rule__Grouping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2862:1: ( rule__Grouping__Group__1__Impl rule__Grouping__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2863:2: rule__Grouping__Group__1__Impl rule__Grouping__Group__2
            {
            pushFollow(FOLLOW_rule__Grouping__Group__1__Impl_in_rule__Grouping__Group__15847);
            rule__Grouping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group__2_in_rule__Grouping__Group__15850);
            rule__Grouping__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__1"


    // $ANTLR start "rule__Grouping__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2870:1: rule__Grouping__Group__1__Impl : ( ( rule__Grouping__NameAssignment_1 ) ) ;
    public final void rule__Grouping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2874:1: ( ( ( rule__Grouping__NameAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2875:1: ( ( rule__Grouping__NameAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2875:1: ( ( rule__Grouping__NameAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2876:1: ( rule__Grouping__NameAssignment_1 )
            {
             before(grammarAccess.getGroupingAccess().getNameAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2877:1: ( rule__Grouping__NameAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2877:2: rule__Grouping__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Grouping__NameAssignment_1_in_rule__Grouping__Group__1__Impl5877);
            rule__Grouping__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupingAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__1__Impl"


    // $ANTLR start "rule__Grouping__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2887:1: rule__Grouping__Group__2 : rule__Grouping__Group__2__Impl ;
    public final void rule__Grouping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2891:1: ( rule__Grouping__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2892:2: rule__Grouping__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Grouping__Group__2__Impl_in_rule__Grouping__Group__25907);
            rule__Grouping__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__2"


    // $ANTLR start "rule__Grouping__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2898:1: rule__Grouping__Group__2__Impl : ( ( rule__Grouping__Group_2__0 )* ) ;
    public final void rule__Grouping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2902:1: ( ( ( rule__Grouping__Group_2__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2903:1: ( ( rule__Grouping__Group_2__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2903:1: ( ( rule__Grouping__Group_2__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2904:1: ( rule__Grouping__Group_2__0 )*
            {
             before(grammarAccess.getGroupingAccess().getGroup_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2905:1: ( rule__Grouping__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==37) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2905:2: rule__Grouping__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Grouping__Group_2__0_in_rule__Grouping__Group__2__Impl5934);
            	    rule__Grouping__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

             after(grammarAccess.getGroupingAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group__2__Impl"


    // $ANTLR start "rule__Grouping__Group_2__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2921:1: rule__Grouping__Group_2__0 : rule__Grouping__Group_2__0__Impl rule__Grouping__Group_2__1 ;
    public final void rule__Grouping__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2925:1: ( rule__Grouping__Group_2__0__Impl rule__Grouping__Group_2__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2926:2: rule__Grouping__Group_2__0__Impl rule__Grouping__Group_2__1
            {
            pushFollow(FOLLOW_rule__Grouping__Group_2__0__Impl_in_rule__Grouping__Group_2__05971);
            rule__Grouping__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group_2__1_in_rule__Grouping__Group_2__05974);
            rule__Grouping__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group_2__0"


    // $ANTLR start "rule__Grouping__Group_2__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2933:1: rule__Grouping__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Grouping__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2937:1: ( ( ',' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2938:1: ( ',' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2938:1: ( ',' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2939:1: ','
            {
             before(grammarAccess.getGroupingAccess().getCommaKeyword_2_0()); 
            match(input,37,FOLLOW_37_in_rule__Grouping__Group_2__0__Impl6002); 
             after(grammarAccess.getGroupingAccess().getCommaKeyword_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group_2__0__Impl"


    // $ANTLR start "rule__Grouping__Group_2__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2952:1: rule__Grouping__Group_2__1 : rule__Grouping__Group_2__1__Impl ;
    public final void rule__Grouping__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2956:1: ( rule__Grouping__Group_2__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2957:2: rule__Grouping__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Grouping__Group_2__1__Impl_in_rule__Grouping__Group_2__16033);
            rule__Grouping__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group_2__1"


    // $ANTLR start "rule__Grouping__Group_2__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2963:1: rule__Grouping__Group_2__1__Impl : ( ( rule__Grouping__NameAssignment_2_1 ) ) ;
    public final void rule__Grouping__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2967:1: ( ( ( rule__Grouping__NameAssignment_2_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2968:1: ( ( rule__Grouping__NameAssignment_2_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2968:1: ( ( rule__Grouping__NameAssignment_2_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2969:1: ( rule__Grouping__NameAssignment_2_1 )
            {
             before(grammarAccess.getGroupingAccess().getNameAssignment_2_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2970:1: ( rule__Grouping__NameAssignment_2_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2970:2: rule__Grouping__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Grouping__NameAssignment_2_1_in_rule__Grouping__Group_2__1__Impl6060);
            rule__Grouping__NameAssignment_2_1();

            state._fsp--;


            }

             after(grammarAccess.getGroupingAccess().getNameAssignment_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__Group_2__1__Impl"


    // $ANTLR start "rule__ModelFolding__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2984:1: rule__ModelFolding__Group__0 : rule__ModelFolding__Group__0__Impl rule__ModelFolding__Group__1 ;
    public final void rule__ModelFolding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2988:1: ( rule__ModelFolding__Group__0__Impl rule__ModelFolding__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2989:2: rule__ModelFolding__Group__0__Impl rule__ModelFolding__Group__1
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__0__Impl_in_rule__ModelFolding__Group__06094);
            rule__ModelFolding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelFolding__Group__1_in_rule__ModelFolding__Group__06097);
            rule__ModelFolding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFolding__Group__0"


    // $ANTLR start "rule__ModelFolding__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2996:1: rule__ModelFolding__Group__0__Impl : ( '=>' ) ;
    public final void rule__ModelFolding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3000:1: ( ( '=>' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3001:1: ( '=>' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3001:1: ( '=>' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3002:1: '=>'
            {
             before(grammarAccess.getModelFoldingAccess().getEqualsSignGreaterThanSignKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__ModelFolding__Group__0__Impl6125); 
             after(grammarAccess.getModelFoldingAccess().getEqualsSignGreaterThanSignKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFolding__Group__0__Impl"


    // $ANTLR start "rule__ModelFolding__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3015:1: rule__ModelFolding__Group__1 : rule__ModelFolding__Group__1__Impl rule__ModelFolding__Group__2 ;
    public final void rule__ModelFolding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3019:1: ( rule__ModelFolding__Group__1__Impl rule__ModelFolding__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3020:2: rule__ModelFolding__Group__1__Impl rule__ModelFolding__Group__2
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__1__Impl_in_rule__ModelFolding__Group__16156);
            rule__ModelFolding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelFolding__Group__2_in_rule__ModelFolding__Group__16159);
            rule__ModelFolding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFolding__Group__1"


    // $ANTLR start "rule__ModelFolding__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3027:1: rule__ModelFolding__Group__1__Impl : ( '{' ) ;
    public final void rule__ModelFolding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3031:1: ( ( '{' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3032:1: ( '{' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3032:1: ( '{' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3033:1: '{'
            {
             before(grammarAccess.getModelFoldingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__ModelFolding__Group__1__Impl6187); 
             after(grammarAccess.getModelFoldingAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFolding__Group__1__Impl"


    // $ANTLR start "rule__ModelFolding__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3046:1: rule__ModelFolding__Group__2 : rule__ModelFolding__Group__2__Impl rule__ModelFolding__Group__3 ;
    public final void rule__ModelFolding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3050:1: ( rule__ModelFolding__Group__2__Impl rule__ModelFolding__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3051:2: rule__ModelFolding__Group__2__Impl rule__ModelFolding__Group__3
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__2__Impl_in_rule__ModelFolding__Group__26218);
            rule__ModelFolding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelFolding__Group__3_in_rule__ModelFolding__Group__26221);
            rule__ModelFolding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFolding__Group__2"


    // $ANTLR start "rule__ModelFolding__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3058:1: rule__ModelFolding__Group__2__Impl : ( ( ( rule__ModelFolding__FoldingsAssignment_2 ) ) ( ( rule__ModelFolding__FoldingsAssignment_2 )* ) ) ;
    public final void rule__ModelFolding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3062:1: ( ( ( ( rule__ModelFolding__FoldingsAssignment_2 ) ) ( ( rule__ModelFolding__FoldingsAssignment_2 )* ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3063:1: ( ( ( rule__ModelFolding__FoldingsAssignment_2 ) ) ( ( rule__ModelFolding__FoldingsAssignment_2 )* ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3063:1: ( ( ( rule__ModelFolding__FoldingsAssignment_2 ) ) ( ( rule__ModelFolding__FoldingsAssignment_2 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3064:1: ( ( rule__ModelFolding__FoldingsAssignment_2 ) ) ( ( rule__ModelFolding__FoldingsAssignment_2 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3064:1: ( ( rule__ModelFolding__FoldingsAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3065:1: ( rule__ModelFolding__FoldingsAssignment_2 )
            {
             before(grammarAccess.getModelFoldingAccess().getFoldingsAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3066:1: ( rule__ModelFolding__FoldingsAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3066:2: rule__ModelFolding__FoldingsAssignment_2
            {
            pushFollow(FOLLOW_rule__ModelFolding__FoldingsAssignment_2_in_rule__ModelFolding__Group__2__Impl6250);
            rule__ModelFolding__FoldingsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelFoldingAccess().getFoldingsAssignment_2()); 

            }

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3069:1: ( ( rule__ModelFolding__FoldingsAssignment_2 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3070:1: ( rule__ModelFolding__FoldingsAssignment_2 )*
            {
             before(grammarAccess.getModelFoldingAccess().getFoldingsAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3071:1: ( rule__ModelFolding__FoldingsAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_NAME_TOKEN)||LA25_0==34) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3071:2: rule__ModelFolding__FoldingsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ModelFolding__FoldingsAssignment_2_in_rule__ModelFolding__Group__2__Impl6262);
            	    rule__ModelFolding__FoldingsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

             after(grammarAccess.getModelFoldingAccess().getFoldingsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFolding__Group__2__Impl"


    // $ANTLR start "rule__ModelFolding__Group__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3082:1: rule__ModelFolding__Group__3 : rule__ModelFolding__Group__3__Impl ;
    public final void rule__ModelFolding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3086:1: ( rule__ModelFolding__Group__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3087:2: rule__ModelFolding__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__3__Impl_in_rule__ModelFolding__Group__36295);
            rule__ModelFolding__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFolding__Group__3"


    // $ANTLR start "rule__ModelFolding__Group__3__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3093:1: rule__ModelFolding__Group__3__Impl : ( '}' ) ;
    public final void rule__ModelFolding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3097:1: ( ( '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3098:1: ( '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3098:1: ( '}' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3099:1: '}'
            {
             before(grammarAccess.getModelFoldingAccess().getRightCurlyBracketKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__ModelFolding__Group__3__Impl6323); 
             after(grammarAccess.getModelFoldingAccess().getRightCurlyBracketKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFolding__Group__3__Impl"


    // $ANTLR start "rule__PropertyFolding__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3120:1: rule__PropertyFolding__Group__0 : rule__PropertyFolding__Group__0__Impl rule__PropertyFolding__Group__1 ;
    public final void rule__PropertyFolding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3124:1: ( rule__PropertyFolding__Group__0__Impl rule__PropertyFolding__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3125:2: rule__PropertyFolding__Group__0__Impl rule__PropertyFolding__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__0__Impl_in_rule__PropertyFolding__Group__06362);
            rule__PropertyFolding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__1_in_rule__PropertyFolding__Group__06365);
            rule__PropertyFolding__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__Group__0"


    // $ANTLR start "rule__PropertyFolding__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3132:1: rule__PropertyFolding__Group__0__Impl : ( ( rule__PropertyFolding__DescriptionAssignment_0 )? ) ;
    public final void rule__PropertyFolding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3136:1: ( ( ( rule__PropertyFolding__DescriptionAssignment_0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3137:1: ( ( rule__PropertyFolding__DescriptionAssignment_0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3137:1: ( ( rule__PropertyFolding__DescriptionAssignment_0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3138:1: ( rule__PropertyFolding__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getPropertyFoldingAccess().getDescriptionAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3139:1: ( rule__PropertyFolding__DescriptionAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3139:2: rule__PropertyFolding__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PropertyFolding__DescriptionAssignment_0_in_rule__PropertyFolding__Group__0__Impl6392);
                    rule__PropertyFolding__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyFoldingAccess().getDescriptionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__Group__0__Impl"


    // $ANTLR start "rule__PropertyFolding__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3149:1: rule__PropertyFolding__Group__1 : rule__PropertyFolding__Group__1__Impl rule__PropertyFolding__Group__2 ;
    public final void rule__PropertyFolding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3153:1: ( rule__PropertyFolding__Group__1__Impl rule__PropertyFolding__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3154:2: rule__PropertyFolding__Group__1__Impl rule__PropertyFolding__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__1__Impl_in_rule__PropertyFolding__Group__16423);
            rule__PropertyFolding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__2_in_rule__PropertyFolding__Group__16426);
            rule__PropertyFolding__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__Group__1"


    // $ANTLR start "rule__PropertyFolding__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3161:1: rule__PropertyFolding__Group__1__Impl : ( ( rule__PropertyFolding__AttributesAssignment_1 )? ) ;
    public final void rule__PropertyFolding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3165:1: ( ( ( rule__PropertyFolding__AttributesAssignment_1 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3166:1: ( ( rule__PropertyFolding__AttributesAssignment_1 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3166:1: ( ( rule__PropertyFolding__AttributesAssignment_1 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3167:1: ( rule__PropertyFolding__AttributesAssignment_1 )?
            {
             before(grammarAccess.getPropertyFoldingAccess().getAttributesAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3168:1: ( rule__PropertyFolding__AttributesAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==34) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3168:2: rule__PropertyFolding__AttributesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PropertyFolding__AttributesAssignment_1_in_rule__PropertyFolding__Group__1__Impl6453);
                    rule__PropertyFolding__AttributesAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyFoldingAccess().getAttributesAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__Group__1__Impl"


    // $ANTLR start "rule__PropertyFolding__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3178:1: rule__PropertyFolding__Group__2 : rule__PropertyFolding__Group__2__Impl rule__PropertyFolding__Group__3 ;
    public final void rule__PropertyFolding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3182:1: ( rule__PropertyFolding__Group__2__Impl rule__PropertyFolding__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3183:2: rule__PropertyFolding__Group__2__Impl rule__PropertyFolding__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__2__Impl_in_rule__PropertyFolding__Group__26484);
            rule__PropertyFolding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__3_in_rule__PropertyFolding__Group__26487);
            rule__PropertyFolding__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__Group__2"


    // $ANTLR start "rule__PropertyFolding__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3190:1: rule__PropertyFolding__Group__2__Impl : ( ( rule__PropertyFolding__AggregatorAssignment_2 ) ) ;
    public final void rule__PropertyFolding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3194:1: ( ( ( rule__PropertyFolding__AggregatorAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3195:1: ( ( rule__PropertyFolding__AggregatorAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3195:1: ( ( rule__PropertyFolding__AggregatorAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3196:1: ( rule__PropertyFolding__AggregatorAssignment_2 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getAggregatorAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3197:1: ( rule__PropertyFolding__AggregatorAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3197:2: rule__PropertyFolding__AggregatorAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyFolding__AggregatorAssignment_2_in_rule__PropertyFolding__Group__2__Impl6514);
            rule__PropertyFolding__AggregatorAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyFoldingAccess().getAggregatorAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__Group__2__Impl"


    // $ANTLR start "rule__PropertyFolding__Group__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3207:1: rule__PropertyFolding__Group__3 : rule__PropertyFolding__Group__3__Impl rule__PropertyFolding__Group__4 ;
    public final void rule__PropertyFolding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3211:1: ( rule__PropertyFolding__Group__3__Impl rule__PropertyFolding__Group__4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3212:2: rule__PropertyFolding__Group__3__Impl rule__PropertyFolding__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__3__Impl_in_rule__PropertyFolding__Group__36544);
            rule__PropertyFolding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__4_in_rule__PropertyFolding__Group__36547);
            rule__PropertyFolding__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__Group__3"


    // $ANTLR start "rule__PropertyFolding__Group__3__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3219:1: rule__PropertyFolding__Group__3__Impl : ( ( rule__PropertyFolding__FromAssignment_3 ) ) ;
    public final void rule__PropertyFolding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3223:1: ( ( ( rule__PropertyFolding__FromAssignment_3 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3224:1: ( ( rule__PropertyFolding__FromAssignment_3 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3224:1: ( ( rule__PropertyFolding__FromAssignment_3 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3225:1: ( rule__PropertyFolding__FromAssignment_3 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getFromAssignment_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3226:1: ( rule__PropertyFolding__FromAssignment_3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3226:2: rule__PropertyFolding__FromAssignment_3
            {
            pushFollow(FOLLOW_rule__PropertyFolding__FromAssignment_3_in_rule__PropertyFolding__Group__3__Impl6574);
            rule__PropertyFolding__FromAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getPropertyFoldingAccess().getFromAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__Group__3__Impl"


    // $ANTLR start "rule__PropertyFolding__Group__4"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3236:1: rule__PropertyFolding__Group__4 : rule__PropertyFolding__Group__4__Impl rule__PropertyFolding__Group__5 ;
    public final void rule__PropertyFolding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3240:1: ( rule__PropertyFolding__Group__4__Impl rule__PropertyFolding__Group__5 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3241:2: rule__PropertyFolding__Group__4__Impl rule__PropertyFolding__Group__5
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__4__Impl_in_rule__PropertyFolding__Group__46604);
            rule__PropertyFolding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__5_in_rule__PropertyFolding__Group__46607);
            rule__PropertyFolding__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__Group__4"


    // $ANTLR start "rule__PropertyFolding__Group__4__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3248:1: rule__PropertyFolding__Group__4__Impl : ( ( rule__PropertyFolding__Alternatives_4 ) ) ;
    public final void rule__PropertyFolding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3252:1: ( ( ( rule__PropertyFolding__Alternatives_4 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3253:1: ( ( rule__PropertyFolding__Alternatives_4 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3253:1: ( ( rule__PropertyFolding__Alternatives_4 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3254:1: ( rule__PropertyFolding__Alternatives_4 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getAlternatives_4()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3255:1: ( rule__PropertyFolding__Alternatives_4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3255:2: rule__PropertyFolding__Alternatives_4
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Alternatives_4_in_rule__PropertyFolding__Group__4__Impl6634);
            rule__PropertyFolding__Alternatives_4();

            state._fsp--;


            }

             after(grammarAccess.getPropertyFoldingAccess().getAlternatives_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__Group__4__Impl"


    // $ANTLR start "rule__PropertyFolding__Group__5"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3265:1: rule__PropertyFolding__Group__5 : rule__PropertyFolding__Group__5__Impl rule__PropertyFolding__Group__6 ;
    public final void rule__PropertyFolding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3269:1: ( rule__PropertyFolding__Group__5__Impl rule__PropertyFolding__Group__6 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3270:2: rule__PropertyFolding__Group__5__Impl rule__PropertyFolding__Group__6
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__5__Impl_in_rule__PropertyFolding__Group__56664);
            rule__PropertyFolding__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__6_in_rule__PropertyFolding__Group__56667);
            rule__PropertyFolding__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__Group__5"


    // $ANTLR start "rule__PropertyFolding__Group__5__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3277:1: rule__PropertyFolding__Group__5__Impl : ( ( rule__PropertyFolding__NameAssignment_5 ) ) ;
    public final void rule__PropertyFolding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3281:1: ( ( ( rule__PropertyFolding__NameAssignment_5 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3282:1: ( ( rule__PropertyFolding__NameAssignment_5 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3282:1: ( ( rule__PropertyFolding__NameAssignment_5 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3283:1: ( rule__PropertyFolding__NameAssignment_5 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getNameAssignment_5()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3284:1: ( rule__PropertyFolding__NameAssignment_5 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3284:2: rule__PropertyFolding__NameAssignment_5
            {
            pushFollow(FOLLOW_rule__PropertyFolding__NameAssignment_5_in_rule__PropertyFolding__Group__5__Impl6694);
            rule__PropertyFolding__NameAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getPropertyFoldingAccess().getNameAssignment_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__Group__5__Impl"


    // $ANTLR start "rule__PropertyFolding__Group__6"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3294:1: rule__PropertyFolding__Group__6 : rule__PropertyFolding__Group__6__Impl ;
    public final void rule__PropertyFolding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3298:1: ( rule__PropertyFolding__Group__6__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3299:2: rule__PropertyFolding__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__6__Impl_in_rule__PropertyFolding__Group__66724);
            rule__PropertyFolding__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__Group__6"


    // $ANTLR start "rule__PropertyFolding__Group__6__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3305:1: rule__PropertyFolding__Group__6__Impl : ( ';' ) ;
    public final void rule__PropertyFolding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3309:1: ( ( ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3310:1: ( ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3310:1: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3311:1: ';'
            {
             before(grammarAccess.getPropertyFoldingAccess().getSemicolonKeyword_6()); 
            match(input,26,FOLLOW_26_in_rule__PropertyFolding__Group__6__Impl6752); 
             after(grammarAccess.getPropertyFoldingAccess().getSemicolonKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__Group__6__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3338:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3342:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3343:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06797);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06800);
            rule__QualifiedName__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3350:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__NameAssignment_0 ) ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3354:1: ( ( ( rule__QualifiedName__NameAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3355:1: ( ( rule__QualifiedName__NameAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3355:1: ( ( rule__QualifiedName__NameAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3356:1: ( rule__QualifiedName__NameAssignment_0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getNameAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3357:1: ( rule__QualifiedName__NameAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3357:2: rule__QualifiedName__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__QualifiedName__NameAssignment_0_in_rule__QualifiedName__Group__0__Impl6827);
            rule__QualifiedName__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getNameAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3367:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3371:1: ( rule__QualifiedName__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3372:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16857);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3378:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3382:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3383:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3383:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3384:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3385:1: ( rule__QualifiedName__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==39) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3385:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6884);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

             after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3399:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3403:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3404:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06919);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06922);
            rule__QualifiedName__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3411:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3415:1: ( ( '.' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3416:1: ( '.' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3416:1: ( '.' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3417:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,39,FOLLOW_39_in_rule__QualifiedName__Group_1__0__Impl6950); 
             after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3430:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3434:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3435:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16981);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3441:1: rule__QualifiedName__Group_1__1__Impl : ( ( rule__QualifiedName__NameAssignment_1_1 ) ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3445:1: ( ( ( rule__QualifiedName__NameAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3446:1: ( ( rule__QualifiedName__NameAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3446:1: ( ( rule__QualifiedName__NameAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3447:1: ( rule__QualifiedName__NameAssignment_1_1 )
            {
             before(grammarAccess.getQualifiedNameAccess().getNameAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3448:1: ( rule__QualifiedName__NameAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3448:2: rule__QualifiedName__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__QualifiedName__NameAssignment_1_1_in_rule__QualifiedName__Group_1__1__Impl7008);
            rule__QualifiedName__NameAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameAccess().getNameAssignment_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__Script__ListAssignment"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3463:1: rule__Script__ListAssignment : ( ruleModelDefinition ) ;
    public final void rule__Script__ListAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3467:1: ( ( ruleModelDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3468:1: ( ruleModelDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3468:1: ( ruleModelDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3469:1: ruleModelDefinition
            {
             before(grammarAccess.getScriptAccess().getListModelDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleModelDefinition_in_rule__Script__ListAssignment7047);
            ruleModelDefinition();

            state._fsp--;

             after(grammarAccess.getScriptAccess().getListModelDefinitionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Script__ListAssignment"


    // $ANTLR start "rule__ModelDefinition__DescriptionAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3478:1: rule__ModelDefinition__DescriptionAssignment_0 : ( ruleDescription ) ;
    public final void rule__ModelDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3482:1: ( ( ruleDescription ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3483:1: ( ruleDescription )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3483:1: ( ruleDescription )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3484:1: ruleDescription
            {
             before(grammarAccess.getModelDefinitionAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__ModelDefinition__DescriptionAssignment_07078);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getModelDefinitionAccess().getDescriptionDescriptionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__DescriptionAssignment_0"


    // $ANTLR start "rule__ModelDefinition__AttributesAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3493:1: rule__ModelDefinition__AttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__ModelDefinition__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3497:1: ( ( ruleAttributeList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3498:1: ( ruleAttributeList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3498:1: ( ruleAttributeList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3499:1: ruleAttributeList
            {
             before(grammarAccess.getModelDefinitionAccess().getAttributesAttributeListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__ModelDefinition__AttributesAssignment_17109);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getModelDefinitionAccess().getAttributesAttributeListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__AttributesAssignment_1"


    // $ANTLR start "rule__ModelDefinition__ModelAssignment_2_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3508:1: rule__ModelDefinition__ModelAssignment_2_0 : ( ruleRecordModelDefinition ) ;
    public final void rule__ModelDefinition__ModelAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3512:1: ( ( ruleRecordModelDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3513:1: ( ruleRecordModelDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3513:1: ( ruleRecordModelDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3514:1: ruleRecordModelDefinition
            {
             before(grammarAccess.getModelDefinitionAccess().getModelRecordModelDefinitionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleRecordModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_07140);
            ruleRecordModelDefinition();

            state._fsp--;

             after(grammarAccess.getModelDefinitionAccess().getModelRecordModelDefinitionParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__ModelAssignment_2_0"


    // $ANTLR start "rule__ModelDefinition__ModelAssignment_2_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3523:1: rule__ModelDefinition__ModelAssignment_2_1 : ( ruleProjectiveModelDefinition ) ;
    public final void rule__ModelDefinition__ModelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3527:1: ( ( ruleProjectiveModelDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3528:1: ( ruleProjectiveModelDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3528:1: ( ruleProjectiveModelDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3529:1: ruleProjectiveModelDefinition
            {
             before(grammarAccess.getModelDefinitionAccess().getModelProjectiveModelDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleProjectiveModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_17171);
            ruleProjectiveModelDefinition();

            state._fsp--;

             after(grammarAccess.getModelDefinitionAccess().getModelProjectiveModelDefinitionParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__ModelAssignment_2_1"


    // $ANTLR start "rule__ModelDefinition__ModelAssignment_2_2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3538:1: rule__ModelDefinition__ModelAssignment_2_2 : ( ruleSummarizeModelDefinition ) ;
    public final void rule__ModelDefinition__ModelAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3542:1: ( ( ruleSummarizeModelDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3543:1: ( ruleSummarizeModelDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3543:1: ( ruleSummarizeModelDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3544:1: ruleSummarizeModelDefinition
            {
             before(grammarAccess.getModelDefinitionAccess().getModelSummarizeModelDefinitionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleSummarizeModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_27202);
            ruleSummarizeModelDefinition();

            state._fsp--;

             after(grammarAccess.getModelDefinitionAccess().getModelSummarizeModelDefinitionParserRuleCall_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__ModelAssignment_2_2"


    // $ANTLR start "rule__RecordModelDefinition__NameAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3553:1: rule__RecordModelDefinition__NameAssignment_0 : ( ruleName ) ;
    public final void rule__RecordModelDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3557:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3558:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3558:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3559:1: ruleName
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__RecordModelDefinition__NameAssignment_07233);
            ruleName();

            state._fsp--;

             after(grammarAccess.getRecordModelDefinitionAccess().getNameNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordModelDefinition__NameAssignment_0"


    // $ANTLR start "rule__RecordModelDefinition__RhsAssignment_2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3568:1: rule__RecordModelDefinition__RhsAssignment_2 : ( ruleRecordExpression ) ;
    public final void rule__RecordModelDefinition__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3572:1: ( ( ruleRecordExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3573:1: ( ruleRecordExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3573:1: ( ruleRecordExpression )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3574:1: ruleRecordExpression
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getRhsRecordExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRecordExpression_in_rule__RecordModelDefinition__RhsAssignment_27264);
            ruleRecordExpression();

            state._fsp--;

             after(grammarAccess.getRecordModelDefinitionAccess().getRhsRecordExpressionParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordModelDefinition__RhsAssignment_2"


    // $ANTLR start "rule__ProjectiveModelDefinition__NameAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3583:1: rule__ProjectiveModelDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__ProjectiveModelDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3587:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3588:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3588:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3589:1: ruleName
            {
             before(grammarAccess.getProjectiveModelDefinitionAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__ProjectiveModelDefinition__NameAssignment_17295);
            ruleName();

            state._fsp--;

             after(grammarAccess.getProjectiveModelDefinitionAccess().getNameNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectiveModelDefinition__NameAssignment_1"


    // $ANTLR start "rule__ProjectiveModelDefinition__RhsAssignment_3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3598:1: rule__ProjectiveModelDefinition__RhsAssignment_3 : ( ruleRecordExpression ) ;
    public final void rule__ProjectiveModelDefinition__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3602:1: ( ( ruleRecordExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3603:1: ( ruleRecordExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3603:1: ( ruleRecordExpression )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3604:1: ruleRecordExpression
            {
             before(grammarAccess.getProjectiveModelDefinitionAccess().getRhsRecordExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRecordExpression_in_rule__ProjectiveModelDefinition__RhsAssignment_37326);
            ruleRecordExpression();

            state._fsp--;

             after(grammarAccess.getProjectiveModelDefinitionAccess().getRhsRecordExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ProjectiveModelDefinition__RhsAssignment_3"


    // $ANTLR start "rule__RecordExpression__TermsAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3613:1: rule__RecordExpression__TermsAssignment_0 : ( ruleRecordTerm ) ;
    public final void rule__RecordExpression__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3617:1: ( ( ruleRecordTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3618:1: ( ruleRecordTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3618:1: ( ruleRecordTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3619:1: ruleRecordTerm
            {
             before(grammarAccess.getRecordExpressionAccess().getTermsRecordTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRecordTerm_in_rule__RecordExpression__TermsAssignment_07357);
            ruleRecordTerm();

            state._fsp--;

             after(grammarAccess.getRecordExpressionAccess().getTermsRecordTermParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordExpression__TermsAssignment_0"


    // $ANTLR start "rule__RecordExpression__TermsAssignment_1_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3628:1: rule__RecordExpression__TermsAssignment_1_1 : ( ruleRecordTerm ) ;
    public final void rule__RecordExpression__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3632:1: ( ( ruleRecordTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3633:1: ( ruleRecordTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3633:1: ( ruleRecordTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3634:1: ruleRecordTerm
            {
             before(grammarAccess.getRecordExpressionAccess().getTermsRecordTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRecordTerm_in_rule__RecordExpression__TermsAssignment_1_17388);
            ruleRecordTerm();

            state._fsp--;

             after(grammarAccess.getRecordExpressionAccess().getTermsRecordTermParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordExpression__TermsAssignment_1_1"


    // $ANTLR start "rule__RecordTerm__PropertiesAssignment_0_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3643:1: rule__RecordTerm__PropertiesAssignment_0_1 : ( rulePropertyDefinition ) ;
    public final void rule__RecordTerm__PropertiesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3647:1: ( ( rulePropertyDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3648:1: ( rulePropertyDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3648:1: ( rulePropertyDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3649:1: rulePropertyDefinition
            {
             before(grammarAccess.getRecordTermAccess().getPropertiesPropertyDefinitionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_rule__RecordTerm__PropertiesAssignment_0_17419);
            rulePropertyDefinition();

            state._fsp--;

             after(grammarAccess.getRecordTermAccess().getPropertiesPropertyDefinitionParserRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTerm__PropertiesAssignment_0_1"


    // $ANTLR start "rule__RecordTerm__ReferenceAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3658:1: rule__RecordTerm__ReferenceAssignment_1 : ( ruleModelReference ) ;
    public final void rule__RecordTerm__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3662:1: ( ( ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3663:1: ( ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3663:1: ( ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3664:1: ruleModelReference
            {
             before(grammarAccess.getRecordTermAccess().getReferenceModelReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModelReference_in_rule__RecordTerm__ReferenceAssignment_17450);
            ruleModelReference();

            state._fsp--;

             after(grammarAccess.getRecordTermAccess().getReferenceModelReferenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTerm__ReferenceAssignment_1"


    // $ANTLR start "rule__ModelReference__NameAssignment"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3673:1: rule__ModelReference__NameAssignment : ( ruleName ) ;
    public final void rule__ModelReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3677:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3678:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3678:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3679:1: ruleName
            {
             before(grammarAccess.getModelReferenceAccess().getNameNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__ModelReference__NameAssignment7481);
            ruleName();

            state._fsp--;

             after(grammarAccess.getModelReferenceAccess().getNameNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelReference__NameAssignment"


    // $ANTLR start "rule__PropertyDefinition__DescriptionAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3688:1: rule__PropertyDefinition__DescriptionAssignment_0 : ( ruleDescription ) ;
    public final void rule__PropertyDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3692:1: ( ( ruleDescription ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3693:1: ( ruleDescription )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3693:1: ( ruleDescription )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3694:1: ruleDescription
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__PropertyDefinition__DescriptionAssignment_07512);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getDescriptionDescriptionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__DescriptionAssignment_0"


    // $ANTLR start "rule__PropertyDefinition__AttributesAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3703:1: rule__PropertyDefinition__AttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__PropertyDefinition__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3707:1: ( ( ruleAttributeList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3708:1: ( ruleAttributeList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3708:1: ( ruleAttributeList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3709:1: ruleAttributeList
            {
             before(grammarAccess.getPropertyDefinitionAccess().getAttributesAttributeListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__PropertyDefinition__AttributesAssignment_17543);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getAttributesAttributeListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__AttributesAssignment_1"


    // $ANTLR start "rule__PropertyDefinition__NameAssignment_2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3718:1: rule__PropertyDefinition__NameAssignment_2 : ( ruleName ) ;
    public final void rule__PropertyDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3722:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3723:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3723:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3724:1: ruleName
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNameNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__PropertyDefinition__NameAssignment_27574);
            ruleName();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getNameNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__NameAssignment_2"


    // $ANTLR start "rule__PropertyDefinition__TypeAssignment_4"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3733:1: rule__PropertyDefinition__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__PropertyDefinition__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3737:1: ( ( ruleType ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3738:1: ( ruleType )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3738:1: ( ruleType )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3739:1: ruleType
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypeTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__PropertyDefinition__TypeAssignment_47605);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getTypeTypeEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__TypeAssignment_4"


    // $ANTLR start "rule__SummarizeModelDefinition__NameAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3748:1: rule__SummarizeModelDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__SummarizeModelDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3752:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3753:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3753:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3754:1: ruleName
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__SummarizeModelDefinition__NameAssignment_17636);
            ruleName();

            state._fsp--;

             after(grammarAccess.getSummarizeModelDefinitionAccess().getNameNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeModelDefinition__NameAssignment_1"


    // $ANTLR start "rule__SummarizeModelDefinition__RhsAssignment_3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3763:1: rule__SummarizeModelDefinition__RhsAssignment_3 : ( ruleSummarizeExpression ) ;
    public final void rule__SummarizeModelDefinition__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3767:1: ( ( ruleSummarizeExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3768:1: ( ruleSummarizeExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3768:1: ( ruleSummarizeExpression )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3769:1: ruleSummarizeExpression
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getRhsSummarizeExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSummarizeExpression_in_rule__SummarizeModelDefinition__RhsAssignment_37667);
            ruleSummarizeExpression();

            state._fsp--;

             after(grammarAccess.getSummarizeModelDefinitionAccess().getRhsSummarizeExpressionParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeModelDefinition__RhsAssignment_3"


    // $ANTLR start "rule__SummarizeExpression__TermsAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3778:1: rule__SummarizeExpression__TermsAssignment_0 : ( ruleSummarizeTerm ) ;
    public final void rule__SummarizeExpression__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3782:1: ( ( ruleSummarizeTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3783:1: ( ruleSummarizeTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3783:1: ( ruleSummarizeTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3784:1: ruleSummarizeTerm
            {
             before(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSummarizeTerm_in_rule__SummarizeExpression__TermsAssignment_07698);
            ruleSummarizeTerm();

            state._fsp--;

             after(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeExpression__TermsAssignment_0"


    // $ANTLR start "rule__SummarizeExpression__TermsAssignment_1_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3793:1: rule__SummarizeExpression__TermsAssignment_1_1 : ( ruleSummarizeTerm ) ;
    public final void rule__SummarizeExpression__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3797:1: ( ( ruleSummarizeTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3798:1: ( ruleSummarizeTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3798:1: ( ruleSummarizeTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3799:1: ruleSummarizeTerm
            {
             before(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleSummarizeTerm_in_rule__SummarizeExpression__TermsAssignment_1_17729);
            ruleSummarizeTerm();

            state._fsp--;

             after(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeExpression__TermsAssignment_1_1"


    // $ANTLR start "rule__SummarizeTerm__ReferenceAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3808:1: rule__SummarizeTerm__ReferenceAssignment_0 : ( ruleModelReference ) ;
    public final void rule__SummarizeTerm__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3812:1: ( ( ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3813:1: ( ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3813:1: ( ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3814:1: ruleModelReference
            {
             before(grammarAccess.getSummarizeTermAccess().getReferenceModelReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleModelReference_in_rule__SummarizeTerm__ReferenceAssignment_07760);
            ruleModelReference();

            state._fsp--;

             after(grammarAccess.getSummarizeTermAccess().getReferenceModelReferenceParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeTerm__ReferenceAssignment_0"


    // $ANTLR start "rule__SummarizeTerm__FoldingAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3823:1: rule__SummarizeTerm__FoldingAssignment_1 : ( ruleModelFolding ) ;
    public final void rule__SummarizeTerm__FoldingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3827:1: ( ( ruleModelFolding ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3828:1: ( ruleModelFolding )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3828:1: ( ruleModelFolding )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3829:1: ruleModelFolding
            {
             before(grammarAccess.getSummarizeTermAccess().getFoldingModelFoldingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModelFolding_in_rule__SummarizeTerm__FoldingAssignment_17791);
            ruleModelFolding();

            state._fsp--;

             after(grammarAccess.getSummarizeTermAccess().getFoldingModelFoldingParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeTerm__FoldingAssignment_1"


    // $ANTLR start "rule__SummarizeTerm__GroupingAssignment_2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3838:1: rule__SummarizeTerm__GroupingAssignment_2 : ( ruleGrouping ) ;
    public final void rule__SummarizeTerm__GroupingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3842:1: ( ( ruleGrouping ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3843:1: ( ruleGrouping )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3843:1: ( ruleGrouping )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3844:1: ruleGrouping
            {
             before(grammarAccess.getSummarizeTermAccess().getGroupingGroupingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGrouping_in_rule__SummarizeTerm__GroupingAssignment_27822);
            ruleGrouping();

            state._fsp--;

             after(grammarAccess.getSummarizeTermAccess().getGroupingGroupingParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__SummarizeTerm__GroupingAssignment_2"


    // $ANTLR start "rule__AttributeList__AttributesAssignment"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3853:1: rule__AttributeList__AttributesAssignment : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3857:1: ( ( ruleAttribute ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3858:1: ( ruleAttribute )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3858:1: ( ruleAttribute )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3859:1: ruleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__AttributeList__AttributesAssignment7853);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeList__AttributesAssignment"


    // $ANTLR start "rule__Attribute__NameAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3868:1: rule__Attribute__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3872:1: ( ( ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3873:1: ( ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3873:1: ( ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3874:1: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Attribute__NameAssignment_17884);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getNameQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__NameAssignment_1"


    // $ANTLR start "rule__Attribute__ElementsAssignment_2_1_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3883:1: rule__Attribute__ElementsAssignment_2_1_0 : ( ruleAttributeElementList ) ;
    public final void rule__Attribute__ElementsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3887:1: ( ( ruleAttributeElementList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3888:1: ( ruleAttributeElementList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3888:1: ( ruleAttributeElementList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3889:1: ruleAttributeElementList
            {
             before(grammarAccess.getAttributeAccess().getElementsAttributeElementListParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleAttributeElementList_in_rule__Attribute__ElementsAssignment_2_1_07915);
            ruleAttributeElementList();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getElementsAttributeElementListParserRuleCall_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ElementsAssignment_2_1_0"


    // $ANTLR start "rule__AttributeElementList__ElementsAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3898:1: rule__AttributeElementList__ElementsAssignment_0 : ( ruleAttributeElement ) ;
    public final void rule__AttributeElementList__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3902:1: ( ( ruleAttributeElement ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3903:1: ( ruleAttributeElement )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3903:1: ( ruleAttributeElement )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3904:1: ruleAttributeElement
            {
             before(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttributeElement_in_rule__AttributeElementList__ElementsAssignment_07946);
            ruleAttributeElement();

            state._fsp--;

             after(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementList__ElementsAssignment_0"


    // $ANTLR start "rule__AttributeElementList__ElementsAssignment_1_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3913:1: rule__AttributeElementList__ElementsAssignment_1_1 : ( ruleAttributeElement ) ;
    public final void rule__AttributeElementList__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3917:1: ( ( ruleAttributeElement ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3918:1: ( ruleAttributeElement )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3918:1: ( ruleAttributeElement )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3919:1: ruleAttributeElement
            {
             before(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAttributeElement_in_rule__AttributeElementList__ElementsAssignment_1_17977);
            ruleAttributeElement();

            state._fsp--;

             after(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementList__ElementsAssignment_1_1"


    // $ANTLR start "rule__AttributeElement__NameAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3928:1: rule__AttributeElement__NameAssignment_0 : ( ruleName ) ;
    public final void rule__AttributeElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3932:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3933:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3933:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3934:1: ruleName
            {
             before(grammarAccess.getAttributeElementAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__AttributeElement__NameAssignment_08008);
            ruleName();

            state._fsp--;

             after(grammarAccess.getAttributeElementAccess().getNameNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElement__NameAssignment_0"


    // $ANTLR start "rule__AttributeElement__ValueAssignment_2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3943:1: rule__AttributeElement__ValueAssignment_2 : ( ruleAttributeValue ) ;
    public final void rule__AttributeElement__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3947:1: ( ( ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3948:1: ( ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3948:1: ( ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3949:1: ruleAttributeValue
            {
             before(grammarAccess.getAttributeElementAccess().getValueAttributeValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_rule__AttributeElement__ValueAssignment_28039);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getAttributeElementAccess().getValueAttributeValueParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElement__ValueAssignment_2"


    // $ANTLR start "rule__AttributeValue__ValueAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3958:1: rule__AttributeValue__ValueAssignment_0 : ( ruleAttributeValueArray ) ;
    public final void rule__AttributeValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3962:1: ( ( ruleAttributeValueArray ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3963:1: ( ruleAttributeValueArray )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3963:1: ( ruleAttributeValueArray )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3964:1: ruleAttributeValueArray
            {
             before(grammarAccess.getAttributeValueAccess().getValueAttributeValueArrayParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttributeValueArray_in_rule__AttributeValue__ValueAssignment_08070);
            ruleAttributeValueArray();

            state._fsp--;

             after(grammarAccess.getAttributeValueAccess().getValueAttributeValueArrayParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__ValueAssignment_0"


    // $ANTLR start "rule__AttributeValue__ValueAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3973:1: rule__AttributeValue__ValueAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__AttributeValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3977:1: ( ( ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3978:1: ( ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3978:1: ( ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3979:1: ruleQualifiedName
            {
             before(grammarAccess.getAttributeValueAccess().getValueQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__AttributeValue__ValueAssignment_18101);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getAttributeValueAccess().getValueQualifiedNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__ValueAssignment_1"


    // $ANTLR start "rule__AttributeValue__ValueAssignment_2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3988:1: rule__AttributeValue__ValueAssignment_2 : ( ruleLiteral ) ;
    public final void rule__AttributeValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3992:1: ( ( ruleLiteral ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3993:1: ( ruleLiteral )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3993:1: ( ruleLiteral )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3994:1: ruleLiteral
            {
             before(grammarAccess.getAttributeValueAccess().getValueLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__AttributeValue__ValueAssignment_28132);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getAttributeValueAccess().getValueLiteralParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValue__ValueAssignment_2"


    // $ANTLR start "rule__AttributeValueArray__ElementsAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4003:1: rule__AttributeValueArray__ElementsAssignment_1 : ( ruleAttributeValue ) ;
    public final void rule__AttributeValueArray__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4007:1: ( ( ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4008:1: ( ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4008:1: ( ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4009:1: ruleAttributeValue
            {
             before(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_rule__AttributeValueArray__ElementsAssignment_18163);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueArray__ElementsAssignment_1"


    // $ANTLR start "rule__AttributeValueArray__ElementsAssignment_2_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4018:1: rule__AttributeValueArray__ElementsAssignment_2_1 : ( ruleAttributeValue ) ;
    public final void rule__AttributeValueArray__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4022:1: ( ( ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4023:1: ( ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4023:1: ( ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4024:1: ruleAttributeValue
            {
             before(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_rule__AttributeValueArray__ElementsAssignment_2_18194);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeValueArray__ElementsAssignment_2_1"


    // $ANTLR start "rule__Grouping__NameAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4033:1: rule__Grouping__NameAssignment_1 : ( ruleName ) ;
    public final void rule__Grouping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4037:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4038:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4038:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4039:1: ruleName
            {
             before(grammarAccess.getGroupingAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__Grouping__NameAssignment_18225);
            ruleName();

            state._fsp--;

             after(grammarAccess.getGroupingAccess().getNameNameParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__NameAssignment_1"


    // $ANTLR start "rule__Grouping__NameAssignment_2_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4048:1: rule__Grouping__NameAssignment_2_1 : ( ruleName ) ;
    public final void rule__Grouping__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4052:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4053:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4053:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4054:1: ruleName
            {
             before(grammarAccess.getGroupingAccess().getNameNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__Grouping__NameAssignment_2_18256);
            ruleName();

            state._fsp--;

             after(grammarAccess.getGroupingAccess().getNameNameParserRuleCall_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Grouping__NameAssignment_2_1"


    // $ANTLR start "rule__ModelFolding__FoldingsAssignment_2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4063:1: rule__ModelFolding__FoldingsAssignment_2 : ( rulePropertyFolding ) ;
    public final void rule__ModelFolding__FoldingsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4067:1: ( ( rulePropertyFolding ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4068:1: ( rulePropertyFolding )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4068:1: ( rulePropertyFolding )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4069:1: rulePropertyFolding
            {
             before(grammarAccess.getModelFoldingAccess().getFoldingsPropertyFoldingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePropertyFolding_in_rule__ModelFolding__FoldingsAssignment_28287);
            rulePropertyFolding();

            state._fsp--;

             after(grammarAccess.getModelFoldingAccess().getFoldingsPropertyFoldingParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFolding__FoldingsAssignment_2"


    // $ANTLR start "rule__PropertyFolding__DescriptionAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4078:1: rule__PropertyFolding__DescriptionAssignment_0 : ( ruleDescription ) ;
    public final void rule__PropertyFolding__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4082:1: ( ( ruleDescription ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4083:1: ( ruleDescription )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4083:1: ( ruleDescription )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4084:1: ruleDescription
            {
             before(grammarAccess.getPropertyFoldingAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__PropertyFolding__DescriptionAssignment_08318);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getPropertyFoldingAccess().getDescriptionDescriptionParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__DescriptionAssignment_0"


    // $ANTLR start "rule__PropertyFolding__AttributesAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4093:1: rule__PropertyFolding__AttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__PropertyFolding__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4097:1: ( ( ruleAttributeList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4098:1: ( ruleAttributeList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4098:1: ( ruleAttributeList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4099:1: ruleAttributeList
            {
             before(grammarAccess.getPropertyFoldingAccess().getAttributesAttributeListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__PropertyFolding__AttributesAssignment_18349);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getPropertyFoldingAccess().getAttributesAttributeListParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__AttributesAssignment_1"


    // $ANTLR start "rule__PropertyFolding__AggregatorAssignment_2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4108:1: rule__PropertyFolding__AggregatorAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__PropertyFolding__AggregatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4112:1: ( ( ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4113:1: ( ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4113:1: ( ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4114:1: ruleQualifiedName
            {
             before(grammarAccess.getPropertyFoldingAccess().getAggregatorQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PropertyFolding__AggregatorAssignment_28380);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getPropertyFoldingAccess().getAggregatorQualifiedNameParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__AggregatorAssignment_2"


    // $ANTLR start "rule__PropertyFolding__FromAssignment_3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4123:1: rule__PropertyFolding__FromAssignment_3 : ( ruleName ) ;
    public final void rule__PropertyFolding__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4127:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4128:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4128:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4129:1: ruleName
            {
             before(grammarAccess.getPropertyFoldingAccess().getFromNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__PropertyFolding__FromAssignment_38411);
            ruleName();

            state._fsp--;

             after(grammarAccess.getPropertyFoldingAccess().getFromNameParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__FromAssignment_3"


    // $ANTLR start "rule__PropertyFolding__NameAssignment_5"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4138:1: rule__PropertyFolding__NameAssignment_5 : ( ruleName ) ;
    public final void rule__PropertyFolding__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4142:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4143:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4143:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4144:1: ruleName
            {
             before(grammarAccess.getPropertyFoldingAccess().getNameNameParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__PropertyFolding__NameAssignment_58442);
            ruleName();

            state._fsp--;

             after(grammarAccess.getPropertyFoldingAccess().getNameNameParserRuleCall_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyFolding__NameAssignment_5"


    // $ANTLR start "rule__QualifiedName__NameAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4153:1: rule__QualifiedName__NameAssignment_0 : ( ruleName ) ;
    public final void rule__QualifiedName__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4157:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4158:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4158:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4159:1: ruleName
            {
             before(grammarAccess.getQualifiedNameAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__QualifiedName__NameAssignment_08473);
            ruleName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getNameNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__NameAssignment_0"


    // $ANTLR start "rule__QualifiedName__NameAssignment_1_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4168:1: rule__QualifiedName__NameAssignment_1_1 : ( ruleName ) ;
    public final void rule__QualifiedName__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4172:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4173:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4173:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4174:1: ruleName
            {
             before(grammarAccess.getQualifiedNameAccess().getNameNameParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__QualifiedName__NameAssignment_1_18504);
            ruleName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getNameNameParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__NameAssignment_1_1"


    // $ANTLR start "rule__Literal__StringValueAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4183:1: rule__Literal__StringValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Literal__StringValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4187:1: ( ( RULE_STRING ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4188:1: ( RULE_STRING )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4188:1: ( RULE_STRING )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4189:1: RULE_STRING
            {
             before(grammarAccess.getLiteralAccess().getStringValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Literal__StringValueAssignment_08535); 
             after(grammarAccess.getLiteralAccess().getStringValueSTRINGTerminalRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__StringValueAssignment_0"


    // $ANTLR start "rule__Literal__IntValueAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4198:1: rule__Literal__IntValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Literal__IntValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4202:1: ( ( RULE_INT ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4203:1: ( RULE_INT )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4203:1: ( RULE_INT )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4204:1: RULE_INT
            {
             before(grammarAccess.getLiteralAccess().getIntValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Literal__IntValueAssignment_18566); 
             after(grammarAccess.getLiteralAccess().getIntValueINTTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__IntValueAssignment_1"


    // $ANTLR start "rule__Literal__DecimalValueAssignment_2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4213:1: rule__Literal__DecimalValueAssignment_2 : ( RULE_DECIMAL ) ;
    public final void rule__Literal__DecimalValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4217:1: ( ( RULE_DECIMAL ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4218:1: ( RULE_DECIMAL )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4218:1: ( RULE_DECIMAL )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4219:1: RULE_DECIMAL
            {
             before(grammarAccess.getLiteralAccess().getDecimalValueDECIMALTerminalRuleCall_2_0()); 
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Literal__DecimalValueAssignment_28597); 
             after(grammarAccess.getLiteralAccess().getDecimalValueDECIMALTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__DecimalValueAssignment_2"


    // $ANTLR start "rule__Literal__BooleanValueAssignment_3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4228:1: rule__Literal__BooleanValueAssignment_3 : ( ruleBOOLEAN ) ;
    public final void rule__Literal__BooleanValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4232:1: ( ( ruleBOOLEAN ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4233:1: ( ruleBOOLEAN )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4233:1: ( ruleBOOLEAN )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4234:1: ruleBOOLEAN
            {
             before(grammarAccess.getLiteralAccess().getBooleanValueBOOLEANEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_rule__Literal__BooleanValueAssignment_38628);
            ruleBOOLEAN();

            state._fsp--;

             after(grammarAccess.getLiteralAccess().getBooleanValueBOOLEANEnumRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Literal__BooleanValueAssignment_3"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Script__ListAssignment_in_ruleScript94 = new BitSet(new long[]{0x0000000610000032L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_entryRuleModelDefinition122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelDefinition129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__0_in_ruleModelDefinition155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordModelDefinition_in_entryRuleRecordModelDefinition182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordModelDefinition189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__0_in_ruleRecordModelDefinition215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectiveModelDefinition_in_entryRuleProjectiveModelDefinition242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectiveModelDefinition249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__Group__0_in_ruleProjectiveModelDefinition275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_entryRuleRecordExpression302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordExpression309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__0_in_ruleRecordExpression335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordTerm369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Alternatives_in_ruleRecordTerm395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_entryRuleModelReference422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelReference429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelReference__NameAssignment_in_ruleModelReference455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeModelDefinition_in_entryRuleSummarizeModelDefinition542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeModelDefinition549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__0_in_ruleSummarizeModelDefinition575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeExpression_in_entryRuleSummarizeExpression602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeExpression609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group__0_in_ruleSummarizeExpression635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_entryRuleSummarizeTerm662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeTerm669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__0_in_ruleSummarizeTerm695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDescription755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_entryRuleAttributeList781 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeList788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__AttributesAssignment_in_ruleAttributeList816 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_rule__AttributeList__AttributesAssignment_in_ruleAttributeList828 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElementList_in_entryRuleAttributeElementList918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElementList925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group__0_in_ruleAttributeElementList951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_entryRuleAttributeElement978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElement985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__0_in_ruleAttributeElement1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue1038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__Alternatives_in_ruleAttributeValue1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueArray_in_entryRuleAttributeValueArray1098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValueArray1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__0_in_ruleAttributeValueArray1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_entryRuleGrouping1158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouping1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__0_in_ruleGrouping1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelFolding_in_entryRuleModelFolding1218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelFolding1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__0_in_ruleModelFolding1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFolding_in_entryRulePropertyFolding1278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyFolding1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__0_in_rulePropertyFolding1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName1398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_TOKEN_in_ruleName1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1457 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN1563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__ModelAssignment_2_0_in_rule__ModelDefinition__Alternatives_21598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__ModelAssignment_2_1_in_rule__ModelDefinition__Alternatives_21616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__ModelAssignment_2_2_in_rule__ModelDefinition__Alternatives_21634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__0_in_rule__RecordTerm__Alternatives1667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__ReferenceAssignment_1_in_rule__RecordTerm__Alternatives1685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__ValueAssignment_0_in_rule__AttributeValue__Alternatives1718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__ValueAssignment_1_in_rule__AttributeValue__Alternatives1736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__ValueAssignment_2_in_rule__AttributeValue__Alternatives1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PropertyFolding__Alternatives_41788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PropertyFolding__Alternatives_41808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__StringValueAssignment_0_in_rule__Literal__Alternatives1842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__IntValueAssignment_1_in_rule__Literal__Alternatives1860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__DecimalValueAssignment_2_in_rule__Literal__Alternatives1878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__BooleanValueAssignment_3_in_rule__Literal__Alternatives1896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__Alternatives1930 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__Alternatives1951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type__Alternatives1972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type__Alternatives1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type__Alternatives2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type__Alternatives2035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Type__Alternatives2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Type__Alternatives2077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Type__Alternatives2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Type__Alternatives2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Type__Alternatives2140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BOOLEAN__Alternatives2176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BOOLEAN__Alternatives2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__0__Impl_in_rule__ModelDefinition__Group__02230 = new BitSet(new long[]{0x0000000610000030L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__1_in_rule__ModelDefinition__Group__02233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__DescriptionAssignment_0_in_rule__ModelDefinition__Group__0__Impl2260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__1__Impl_in_rule__ModelDefinition__Group__12291 = new BitSet(new long[]{0x0000000610000030L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__2_in_rule__ModelDefinition__Group__12294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__AttributesAssignment_1_in_rule__ModelDefinition__Group__1__Impl2321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__2__Impl_in_rule__ModelDefinition__Group__22352 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__3_in_rule__ModelDefinition__Group__22355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Alternatives_2_in_rule__ModelDefinition__Group__2__Impl2382 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__3__Impl_in_rule__ModelDefinition__Group__32412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ModelDefinition__Group__3__Impl2440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__0__Impl_in_rule__RecordModelDefinition__Group__02479 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__1_in_rule__RecordModelDefinition__Group__02482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__NameAssignment_0_in_rule__RecordModelDefinition__Group__0__Impl2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__1__Impl_in_rule__RecordModelDefinition__Group__12539 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__2_in_rule__RecordModelDefinition__Group__12542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RecordModelDefinition__Group__1__Impl2570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__2__Impl_in_rule__RecordModelDefinition__Group__22601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__RhsAssignment_2_in_rule__RecordModelDefinition__Group__2__Impl2628 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__Group__0__Impl_in_rule__ProjectiveModelDefinition__Group__02664 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__Group__1_in_rule__ProjectiveModelDefinition__Group__02667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__ProjectiveModelDefinition__Group__0__Impl2695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__Group__1__Impl_in_rule__ProjectiveModelDefinition__Group__12726 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__Group__2_in_rule__ProjectiveModelDefinition__Group__12729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__NameAssignment_1_in_rule__ProjectiveModelDefinition__Group__1__Impl2756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__Group__2__Impl_in_rule__ProjectiveModelDefinition__Group__22786 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__Group__3_in_rule__ProjectiveModelDefinition__Group__22789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__ProjectiveModelDefinition__Group__2__Impl2817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__Group__3__Impl_in_rule__ProjectiveModelDefinition__Group__32848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__RhsAssignment_3_in_rule__ProjectiveModelDefinition__Group__3__Impl2875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__0__Impl_in_rule__RecordExpression__Group__02913 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__1_in_rule__RecordExpression__Group__02916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__TermsAssignment_0_in_rule__RecordExpression__Group__0__Impl2943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__1__Impl_in_rule__RecordExpression__Group__12973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__0_in_rule__RecordExpression__Group__1__Impl3000 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__0__Impl_in_rule__RecordExpression__Group_1__03035 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__1_in_rule__RecordExpression__Group_1__03038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RecordExpression__Group_1__0__Impl3066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__1__Impl_in_rule__RecordExpression__Group_1__13097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__TermsAssignment_1_1_in_rule__RecordExpression__Group_1__1__Impl3124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__0__Impl_in_rule__RecordTerm__Group_0__03158 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__1_in_rule__RecordTerm__Group_0__03161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__RecordTerm__Group_0__0__Impl3189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__1__Impl_in_rule__RecordTerm__Group_0__13220 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__2_in_rule__RecordTerm__Group_0__13223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__PropertiesAssignment_0_1_in_rule__RecordTerm__Group_0__1__Impl3252 = new BitSet(new long[]{0x0000000400000032L});
    public static final BitSet FOLLOW_rule__RecordTerm__PropertiesAssignment_0_1_in_rule__RecordTerm__Group_0__1__Impl3264 = new BitSet(new long[]{0x0000000400000032L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__2__Impl_in_rule__RecordTerm__Group_0__23297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RecordTerm__Group_0__2__Impl3325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__03362 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__03365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DescriptionAssignment_0_in_rule__PropertyDefinition__Group__0__Impl3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__13423 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__13426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__AttributesAssignment_1_in_rule__PropertyDefinition__Group__1__Impl3453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__23484 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__23487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NameAssignment_2_in_rule__PropertyDefinition__Group__2__Impl3514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__33544 = new BitSet(new long[]{0x0000000000FFE000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__33547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__PropertyDefinition__Group__3__Impl3575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__43606 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__43609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__TypeAssignment_4_in_rule__PropertyDefinition__Group__4__Impl3636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__53666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PropertyDefinition__Group__5__Impl3694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__0__Impl_in_rule__SummarizeModelDefinition__Group__03737 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__1_in_rule__SummarizeModelDefinition__Group__03740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SummarizeModelDefinition__Group__0__Impl3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__1__Impl_in_rule__SummarizeModelDefinition__Group__13799 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__2_in_rule__SummarizeModelDefinition__Group__13802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__NameAssignment_1_in_rule__SummarizeModelDefinition__Group__1__Impl3829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__2__Impl_in_rule__SummarizeModelDefinition__Group__23859 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__3_in_rule__SummarizeModelDefinition__Group__23862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SummarizeModelDefinition__Group__2__Impl3890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__3__Impl_in_rule__SummarizeModelDefinition__Group__33921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__RhsAssignment_3_in_rule__SummarizeModelDefinition__Group__3__Impl3948 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group__0__Impl_in_rule__SummarizeExpression__Group__03986 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group__1_in_rule__SummarizeExpression__Group__03989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__TermsAssignment_0_in_rule__SummarizeExpression__Group__0__Impl4016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group__1__Impl_in_rule__SummarizeExpression__Group__14046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group_1__0_in_rule__SummarizeExpression__Group__1__Impl4073 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group_1__0__Impl_in_rule__SummarizeExpression__Group_1__04108 = new BitSet(new long[]{0x0000000040000020L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group_1__1_in_rule__SummarizeExpression__Group_1__04111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__SummarizeExpression__Group_1__0__Impl4139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group_1__1__Impl_in_rule__SummarizeExpression__Group_1__14170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__TermsAssignment_1_1_in_rule__SummarizeExpression__Group_1__1__Impl4197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__0__Impl_in_rule__SummarizeTerm__Group__04231 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__1_in_rule__SummarizeTerm__Group__04234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__ReferenceAssignment_0_in_rule__SummarizeTerm__Group__0__Impl4261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__1__Impl_in_rule__SummarizeTerm__Group__14291 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__2_in_rule__SummarizeTerm__Group__14294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__FoldingAssignment_1_in_rule__SummarizeTerm__Group__1__Impl4321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__2__Impl_in_rule__SummarizeTerm__Group__24351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__GroupingAssignment_2_in_rule__SummarizeTerm__Group__2__Impl4378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04415 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Attribute__Group__0__Impl4446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14477 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl4507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__0_in_rule__Attribute__Group__2__Impl4564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__0__Impl_in_rule__Attribute__Group_2__04601 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__1_in_rule__Attribute__Group_2__04604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Attribute__Group_2__0__Impl4632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__1__Impl_in_rule__Attribute__Group_2__14663 = new BitSet(new long[]{0x0000001000000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__2_in_rule__Attribute__Group_2__14666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_1__0_in_rule__Attribute__Group_2__1__Impl4693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__2__Impl_in_rule__Attribute__Group_2__24724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Attribute__Group_2__2__Impl4752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_1__0__Impl_in_rule__Attribute__Group_2_1__04789 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_1__1_in_rule__Attribute__Group_2_1__04792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ElementsAssignment_2_1_0_in_rule__Attribute__Group_2_1__0__Impl4819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_1__1__Impl_in_rule__Attribute__Group_2_1__14849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Attribute__Group_2_1__1__Impl4878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group__0__Impl_in_rule__AttributeElementList__Group__04915 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group__1_in_rule__AttributeElementList__Group__04918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__ElementsAssignment_0_in_rule__AttributeElementList__Group__0__Impl4945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group__1__Impl_in_rule__AttributeElementList__Group__14975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group_1__0_in_rule__AttributeElementList__Group__1__Impl5002 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group_1__0__Impl_in_rule__AttributeElementList__Group_1__05037 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group_1__1_in_rule__AttributeElementList__Group_1__05040 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__AttributeElementList__Group_1__0__Impl5068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group_1__1__Impl_in_rule__AttributeElementList__Group_1__15099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__ElementsAssignment_1_1_in_rule__AttributeElementList__Group_1__1__Impl5126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__0__Impl_in_rule__AttributeElement__Group__05160 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__1_in_rule__AttributeElement__Group__05163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__NameAssignment_0_in_rule__AttributeElement__Group__0__Impl5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__1__Impl_in_rule__AttributeElement__Group__15220 = new BitSet(new long[]{0x00000000430000F0L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__2_in_rule__AttributeElement__Group__15223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AttributeElement__Group__1__Impl5251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__2__Impl_in_rule__AttributeElement__Group__25282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__ValueAssignment_2_in_rule__AttributeElement__Group__2__Impl5309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__0__Impl_in_rule__AttributeValueArray__Group__05345 = new BitSet(new long[]{0x00000000430000F0L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__1_in_rule__AttributeValueArray__Group__05348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AttributeValueArray__Group__0__Impl5376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__1__Impl_in_rule__AttributeValueArray__Group__15407 = new BitSet(new long[]{0x0000002080000000L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__2_in_rule__AttributeValueArray__Group__15410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__ElementsAssignment_1_in_rule__AttributeValueArray__Group__1__Impl5437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__2__Impl_in_rule__AttributeValueArray__Group__25467 = new BitSet(new long[]{0x0000002080000000L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__3_in_rule__AttributeValueArray__Group__25470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group_2__0_in_rule__AttributeValueArray__Group__2__Impl5497 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__3__Impl_in_rule__AttributeValueArray__Group__35528 = new BitSet(new long[]{0x0000002080000000L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__4_in_rule__AttributeValueArray__Group__35531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__AttributeValueArray__Group__3__Impl5560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__4__Impl_in_rule__AttributeValueArray__Group__45593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__AttributeValueArray__Group__4__Impl5621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group_2__0__Impl_in_rule__AttributeValueArray__Group_2__05662 = new BitSet(new long[]{0x00000000430000F0L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group_2__1_in_rule__AttributeValueArray__Group_2__05665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__AttributeValueArray__Group_2__0__Impl5693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group_2__1__Impl_in_rule__AttributeValueArray__Group_2__15724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__ElementsAssignment_2_1_in_rule__AttributeValueArray__Group_2__1__Impl5751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__0__Impl_in_rule__Grouping__Group__05785 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Grouping__Group__1_in_rule__Grouping__Group__05788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Grouping__Group__0__Impl5816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__1__Impl_in_rule__Grouping__Group__15847 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__Grouping__Group__2_in_rule__Grouping__Group__15850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__NameAssignment_1_in_rule__Grouping__Group__1__Impl5877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__2__Impl_in_rule__Grouping__Group__25907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_2__0_in_rule__Grouping__Group__2__Impl5934 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_2__0__Impl_in_rule__Grouping__Group_2__05971 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Grouping__Group_2__1_in_rule__Grouping__Group_2__05974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Grouping__Group_2__0__Impl6002 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_2__1__Impl_in_rule__Grouping__Group_2__16033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__NameAssignment_2_1_in_rule__Grouping__Group_2__1__Impl6060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__0__Impl_in_rule__ModelFolding__Group__06094 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__1_in_rule__ModelFolding__Group__06097 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ModelFolding__Group__0__Impl6125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__1__Impl_in_rule__ModelFolding__Group__16156 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__2_in_rule__ModelFolding__Group__16159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ModelFolding__Group__1__Impl6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__2__Impl_in_rule__ModelFolding__Group__26218 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__3_in_rule__ModelFolding__Group__26221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__FoldingsAssignment_2_in_rule__ModelFolding__Group__2__Impl6250 = new BitSet(new long[]{0x0000000400000032L});
    public static final BitSet FOLLOW_rule__ModelFolding__FoldingsAssignment_2_in_rule__ModelFolding__Group__2__Impl6262 = new BitSet(new long[]{0x0000000400000032L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__3__Impl_in_rule__ModelFolding__Group__36295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ModelFolding__Group__3__Impl6323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__0__Impl_in_rule__PropertyFolding__Group__06362 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__1_in_rule__PropertyFolding__Group__06365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__DescriptionAssignment_0_in_rule__PropertyFolding__Group__0__Impl6392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__1__Impl_in_rule__PropertyFolding__Group__16423 = new BitSet(new long[]{0x0000000400000030L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__2_in_rule__PropertyFolding__Group__16426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__AttributesAssignment_1_in_rule__PropertyFolding__Group__1__Impl6453 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__2__Impl_in_rule__PropertyFolding__Group__26484 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__3_in_rule__PropertyFolding__Group__26487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__AggregatorAssignment_2_in_rule__PropertyFolding__Group__2__Impl6514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__3__Impl_in_rule__PropertyFolding__Group__36544 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__4_in_rule__PropertyFolding__Group__36547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__FromAssignment_3_in_rule__PropertyFolding__Group__3__Impl6574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__4__Impl_in_rule__PropertyFolding__Group__46604 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__5_in_rule__PropertyFolding__Group__46607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Alternatives_4_in_rule__PropertyFolding__Group__4__Impl6634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__5__Impl_in_rule__PropertyFolding__Group__56664 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__6_in_rule__PropertyFolding__Group__56667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__NameAssignment_5_in_rule__PropertyFolding__Group__5__Impl6694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__6__Impl_in_rule__PropertyFolding__Group__66724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PropertyFolding__Group__6__Impl6752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06797 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__NameAssignment_0_in_rule__QualifiedName__Group__0__Impl6827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16857 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6884 = new BitSet(new long[]{0x0000008000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06919 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__QualifiedName__Group_1__0__Impl6950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__NameAssignment_1_1_in_rule__QualifiedName__Group_1__1__Impl7008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_rule__Script__ListAssignment7047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__ModelDefinition__DescriptionAssignment_07078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__ModelDefinition__AttributesAssignment_17109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_07140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectiveModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_17171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_27202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__RecordModelDefinition__NameAssignment_07233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_rule__RecordModelDefinition__RhsAssignment_27264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__ProjectiveModelDefinition__NameAssignment_17295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_rule__ProjectiveModelDefinition__RhsAssignment_37326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_rule__RecordExpression__TermsAssignment_07357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_rule__RecordExpression__TermsAssignment_1_17388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_rule__RecordTerm__PropertiesAssignment_0_17419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_rule__RecordTerm__ReferenceAssignment_17450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__ModelReference__NameAssignment7481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__PropertyDefinition__DescriptionAssignment_07512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__PropertyDefinition__AttributesAssignment_17543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__PropertyDefinition__NameAssignment_27574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__PropertyDefinition__TypeAssignment_47605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__SummarizeModelDefinition__NameAssignment_17636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeExpression_in_rule__SummarizeModelDefinition__RhsAssignment_37667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_rule__SummarizeExpression__TermsAssignment_07698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_rule__SummarizeExpression__TermsAssignment_1_17729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_rule__SummarizeTerm__ReferenceAssignment_07760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelFolding_in_rule__SummarizeTerm__FoldingAssignment_17791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_rule__SummarizeTerm__GroupingAssignment_27822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__AttributeList__AttributesAssignment7853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Attribute__NameAssignment_17884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElementList_in_rule__Attribute__ElementsAssignment_2_1_07915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_rule__AttributeElementList__ElementsAssignment_07946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_rule__AttributeElementList__ElementsAssignment_1_17977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__AttributeElement__NameAssignment_08008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_rule__AttributeElement__ValueAssignment_28039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueArray_in_rule__AttributeValue__ValueAssignment_08070 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__AttributeValue__ValueAssignment_18101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__AttributeValue__ValueAssignment_28132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_rule__AttributeValueArray__ElementsAssignment_18163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_rule__AttributeValueArray__ElementsAssignment_2_18194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Grouping__NameAssignment_18225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Grouping__NameAssignment_2_18256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFolding_in_rule__ModelFolding__FoldingsAssignment_28287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__PropertyFolding__DescriptionAssignment_08318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__PropertyFolding__AttributesAssignment_18349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PropertyFolding__AggregatorAssignment_28380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__PropertyFolding__FromAssignment_38411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__PropertyFolding__NameAssignment_58442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__QualifiedName__NameAssignment_08473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__QualifiedName__NameAssignment_1_18504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Literal__StringValueAssignment_08535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Literal__IntValueAssignment_18566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Literal__DecimalValueAssignment_28597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_rule__Literal__BooleanValueAssignment_38628 = new BitSet(new long[]{0x0000000000000002L});

}