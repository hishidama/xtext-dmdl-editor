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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NAME_TOKEN", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'->'", "'=>'", "'projective'", "'joined'", "'summarized'", "'INT'", "'LONG'", "'BYTE'", "'SHORT'", "'DECIMAL'", "'FLOAT'", "'DOUBLE'", "'TEXT'", "'BOOLEAN'", "'DATE'", "'DATETIME'", "'TRUE'", "'FALSE'", "';'", "'='", "'+'", "'{'", "'}'", "':'", "'@'", "'('", "')'", "','", "'%'", "'.'"
    };
    public static final int T__40=40;
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

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_NAME_TOKEN)||(LA1_0>=13 && LA1_0<=15)||LA1_0==35) ) {
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


    // $ANTLR start "entryRuleJoinedModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:284:1: entryRuleJoinedModelDefinition : ruleJoinedModelDefinition EOF ;
    public final void entryRuleJoinedModelDefinition() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:285:1: ( ruleJoinedModelDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:286:1: ruleJoinedModelDefinition EOF
            {
             before(grammarAccess.getJoinedModelDefinitionRule()); 
            pushFollow(FOLLOW_ruleJoinedModelDefinition_in_entryRuleJoinedModelDefinition542);
            ruleJoinedModelDefinition();

            state._fsp--;

             after(grammarAccess.getJoinedModelDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinedModelDefinition549); 

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
    // $ANTLR end "entryRuleJoinedModelDefinition"


    // $ANTLR start "ruleJoinedModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:293:1: ruleJoinedModelDefinition : ( ( rule__JoinedModelDefinition__Group__0 ) ) ;
    public final void ruleJoinedModelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:297:2: ( ( ( rule__JoinedModelDefinition__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:298:1: ( ( rule__JoinedModelDefinition__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:298:1: ( ( rule__JoinedModelDefinition__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:299:1: ( rule__JoinedModelDefinition__Group__0 )
            {
             before(grammarAccess.getJoinedModelDefinitionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:300:1: ( rule__JoinedModelDefinition__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:300:2: rule__JoinedModelDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__JoinedModelDefinition__Group__0_in_ruleJoinedModelDefinition575);
            rule__JoinedModelDefinition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoinedModelDefinitionAccess().getGroup()); 

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
    // $ANTLR end "ruleJoinedModelDefinition"


    // $ANTLR start "entryRuleJoinExpression"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:312:1: entryRuleJoinExpression : ruleJoinExpression EOF ;
    public final void entryRuleJoinExpression() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:313:1: ( ruleJoinExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:314:1: ruleJoinExpression EOF
            {
             before(grammarAccess.getJoinExpressionRule()); 
            pushFollow(FOLLOW_ruleJoinExpression_in_entryRuleJoinExpression602);
            ruleJoinExpression();

            state._fsp--;

             after(grammarAccess.getJoinExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinExpression609); 

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
    // $ANTLR end "entryRuleJoinExpression"


    // $ANTLR start "ruleJoinExpression"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:321:1: ruleJoinExpression : ( ( rule__JoinExpression__Group__0 ) ) ;
    public final void ruleJoinExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:325:2: ( ( ( rule__JoinExpression__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:326:1: ( ( rule__JoinExpression__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:326:1: ( ( rule__JoinExpression__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:327:1: ( rule__JoinExpression__Group__0 )
            {
             before(grammarAccess.getJoinExpressionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:328:1: ( rule__JoinExpression__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:328:2: rule__JoinExpression__Group__0
            {
            pushFollow(FOLLOW_rule__JoinExpression__Group__0_in_ruleJoinExpression635);
            rule__JoinExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoinExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleJoinExpression"


    // $ANTLR start "entryRuleJoinTerm"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:340:1: entryRuleJoinTerm : ruleJoinTerm EOF ;
    public final void entryRuleJoinTerm() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:341:1: ( ruleJoinTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:342:1: ruleJoinTerm EOF
            {
             before(grammarAccess.getJoinTermRule()); 
            pushFollow(FOLLOW_ruleJoinTerm_in_entryRuleJoinTerm662);
            ruleJoinTerm();

            state._fsp--;

             after(grammarAccess.getJoinTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinTerm669); 

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
    // $ANTLR end "entryRuleJoinTerm"


    // $ANTLR start "ruleJoinTerm"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:349:1: ruleJoinTerm : ( ( rule__JoinTerm__Group__0 ) ) ;
    public final void ruleJoinTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:353:2: ( ( ( rule__JoinTerm__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:354:1: ( ( rule__JoinTerm__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:354:1: ( ( rule__JoinTerm__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:355:1: ( rule__JoinTerm__Group__0 )
            {
             before(grammarAccess.getJoinTermAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:356:1: ( rule__JoinTerm__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:356:2: rule__JoinTerm__Group__0
            {
            pushFollow(FOLLOW_rule__JoinTerm__Group__0_in_ruleJoinTerm695);
            rule__JoinTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getJoinTermAccess().getGroup()); 

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
    // $ANTLR end "ruleJoinTerm"


    // $ANTLR start "entryRuleSummarizeModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:368:1: entryRuleSummarizeModelDefinition : ruleSummarizeModelDefinition EOF ;
    public final void entryRuleSummarizeModelDefinition() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:369:1: ( ruleSummarizeModelDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:370:1: ruleSummarizeModelDefinition EOF
            {
             before(grammarAccess.getSummarizeModelDefinitionRule()); 
            pushFollow(FOLLOW_ruleSummarizeModelDefinition_in_entryRuleSummarizeModelDefinition722);
            ruleSummarizeModelDefinition();

            state._fsp--;

             after(grammarAccess.getSummarizeModelDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeModelDefinition729); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:377:1: ruleSummarizeModelDefinition : ( ( rule__SummarizeModelDefinition__Group__0 ) ) ;
    public final void ruleSummarizeModelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:381:2: ( ( ( rule__SummarizeModelDefinition__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:382:1: ( ( rule__SummarizeModelDefinition__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:382:1: ( ( rule__SummarizeModelDefinition__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:383:1: ( rule__SummarizeModelDefinition__Group__0 )
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:384:1: ( rule__SummarizeModelDefinition__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:384:2: rule__SummarizeModelDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__0_in_ruleSummarizeModelDefinition755);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:396:1: entryRuleSummarizeExpression : ruleSummarizeExpression EOF ;
    public final void entryRuleSummarizeExpression() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:397:1: ( ruleSummarizeExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:398:1: ruleSummarizeExpression EOF
            {
             before(grammarAccess.getSummarizeExpressionRule()); 
            pushFollow(FOLLOW_ruleSummarizeExpression_in_entryRuleSummarizeExpression782);
            ruleSummarizeExpression();

            state._fsp--;

             after(grammarAccess.getSummarizeExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeExpression789); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:405:1: ruleSummarizeExpression : ( ( rule__SummarizeExpression__Group__0 ) ) ;
    public final void ruleSummarizeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:409:2: ( ( ( rule__SummarizeExpression__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:410:1: ( ( rule__SummarizeExpression__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:410:1: ( ( rule__SummarizeExpression__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:411:1: ( rule__SummarizeExpression__Group__0 )
            {
             before(grammarAccess.getSummarizeExpressionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:412:1: ( rule__SummarizeExpression__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:412:2: rule__SummarizeExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group__0_in_ruleSummarizeExpression815);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:424:1: entryRuleSummarizeTerm : ruleSummarizeTerm EOF ;
    public final void entryRuleSummarizeTerm() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:425:1: ( ruleSummarizeTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:426:1: ruleSummarizeTerm EOF
            {
             before(grammarAccess.getSummarizeTermRule()); 
            pushFollow(FOLLOW_ruleSummarizeTerm_in_entryRuleSummarizeTerm842);
            ruleSummarizeTerm();

            state._fsp--;

             after(grammarAccess.getSummarizeTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeTerm849); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:433:1: ruleSummarizeTerm : ( ( rule__SummarizeTerm__Group__0 ) ) ;
    public final void ruleSummarizeTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:437:2: ( ( ( rule__SummarizeTerm__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:438:1: ( ( rule__SummarizeTerm__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:438:1: ( ( rule__SummarizeTerm__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:439:1: ( rule__SummarizeTerm__Group__0 )
            {
             before(grammarAccess.getSummarizeTermAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:440:1: ( rule__SummarizeTerm__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:440:2: rule__SummarizeTerm__Group__0
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__Group__0_in_ruleSummarizeTerm875);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:452:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:453:1: ( ruleDescription EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:454:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription902);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription909); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:461:1: ruleDescription : ( RULE_STRING ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:465:2: ( ( RULE_STRING ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:466:1: ( RULE_STRING )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:466:1: ( RULE_STRING )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:467:1: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDescription935); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:480:1: entryRuleAttributeList : ruleAttributeList EOF ;
    public final void entryRuleAttributeList() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:481:1: ( ruleAttributeList EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:482:1: ruleAttributeList EOF
            {
             before(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_ruleAttributeList_in_entryRuleAttributeList961);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getAttributeListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeList968); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:489:1: ruleAttributeList : ( ( ( rule__AttributeList__AttributesAssignment ) ) ( ( rule__AttributeList__AttributesAssignment )* ) ) ;
    public final void ruleAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:493:2: ( ( ( ( rule__AttributeList__AttributesAssignment ) ) ( ( rule__AttributeList__AttributesAssignment )* ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:494:1: ( ( ( rule__AttributeList__AttributesAssignment ) ) ( ( rule__AttributeList__AttributesAssignment )* ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:494:1: ( ( ( rule__AttributeList__AttributesAssignment ) ) ( ( rule__AttributeList__AttributesAssignment )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:495:1: ( ( rule__AttributeList__AttributesAssignment ) ) ( ( rule__AttributeList__AttributesAssignment )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:495:1: ( ( rule__AttributeList__AttributesAssignment ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:496:1: ( rule__AttributeList__AttributesAssignment )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:497:1: ( rule__AttributeList__AttributesAssignment )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:497:2: rule__AttributeList__AttributesAssignment
            {
            pushFollow(FOLLOW_rule__AttributeList__AttributesAssignment_in_ruleAttributeList996);
            rule__AttributeList__AttributesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getAttributesAssignment()); 

            }

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:500:1: ( ( rule__AttributeList__AttributesAssignment )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:501:1: ( rule__AttributeList__AttributesAssignment )*
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:502:1: ( rule__AttributeList__AttributesAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==35) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:502:2: rule__AttributeList__AttributesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__AttributeList__AttributesAssignment_in_ruleAttributeList1008);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:515:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:516:1: ( ruleAttribute EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:517:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1038);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1045); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:524:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:528:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:529:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:529:1: ( ( rule__Attribute__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:530:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:531:1: ( rule__Attribute__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:531:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1071);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:543:1: entryRuleAttributeElementList : ruleAttributeElementList EOF ;
    public final void entryRuleAttributeElementList() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:544:1: ( ruleAttributeElementList EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:545:1: ruleAttributeElementList EOF
            {
             before(grammarAccess.getAttributeElementListRule()); 
            pushFollow(FOLLOW_ruleAttributeElementList_in_entryRuleAttributeElementList1098);
            ruleAttributeElementList();

            state._fsp--;

             after(grammarAccess.getAttributeElementListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElementList1105); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:552:1: ruleAttributeElementList : ( ( rule__AttributeElementList__Group__0 ) ) ;
    public final void ruleAttributeElementList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:556:2: ( ( ( rule__AttributeElementList__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:557:1: ( ( rule__AttributeElementList__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:557:1: ( ( rule__AttributeElementList__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:558:1: ( rule__AttributeElementList__Group__0 )
            {
             before(grammarAccess.getAttributeElementListAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:559:1: ( rule__AttributeElementList__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:559:2: rule__AttributeElementList__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group__0_in_ruleAttributeElementList1131);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:571:1: entryRuleAttributeElement : ruleAttributeElement EOF ;
    public final void entryRuleAttributeElement() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:572:1: ( ruleAttributeElement EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:573:1: ruleAttributeElement EOF
            {
             before(grammarAccess.getAttributeElementRule()); 
            pushFollow(FOLLOW_ruleAttributeElement_in_entryRuleAttributeElement1158);
            ruleAttributeElement();

            state._fsp--;

             after(grammarAccess.getAttributeElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElement1165); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:580:1: ruleAttributeElement : ( ( rule__AttributeElement__Group__0 ) ) ;
    public final void ruleAttributeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:584:2: ( ( ( rule__AttributeElement__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:585:1: ( ( rule__AttributeElement__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:585:1: ( ( rule__AttributeElement__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:586:1: ( rule__AttributeElement__Group__0 )
            {
             before(grammarAccess.getAttributeElementAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:587:1: ( rule__AttributeElement__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:587:2: rule__AttributeElement__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeElement__Group__0_in_ruleAttributeElement1191);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:599:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:600:1: ( ruleAttributeValue EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:601:1: ruleAttributeValue EOF
            {
             before(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue1218);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getAttributeValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue1225); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:608:1: ruleAttributeValue : ( ( rule__AttributeValue__Alternatives ) ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:612:2: ( ( ( rule__AttributeValue__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:613:1: ( ( rule__AttributeValue__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:613:1: ( ( rule__AttributeValue__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:614:1: ( rule__AttributeValue__Alternatives )
            {
             before(grammarAccess.getAttributeValueAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:615:1: ( rule__AttributeValue__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:615:2: rule__AttributeValue__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeValue__Alternatives_in_ruleAttributeValue1251);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:627:1: entryRuleAttributeValueArray : ruleAttributeValueArray EOF ;
    public final void entryRuleAttributeValueArray() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:628:1: ( ruleAttributeValueArray EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:629:1: ruleAttributeValueArray EOF
            {
             before(grammarAccess.getAttributeValueArrayRule()); 
            pushFollow(FOLLOW_ruleAttributeValueArray_in_entryRuleAttributeValueArray1278);
            ruleAttributeValueArray();

            state._fsp--;

             after(grammarAccess.getAttributeValueArrayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValueArray1285); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:636:1: ruleAttributeValueArray : ( ( rule__AttributeValueArray__Group__0 ) ) ;
    public final void ruleAttributeValueArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:640:2: ( ( ( rule__AttributeValueArray__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:641:1: ( ( rule__AttributeValueArray__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:641:1: ( ( rule__AttributeValueArray__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:642:1: ( rule__AttributeValueArray__Group__0 )
            {
             before(grammarAccess.getAttributeValueArrayAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:643:1: ( rule__AttributeValueArray__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:643:2: rule__AttributeValueArray__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__0_in_ruleAttributeValueArray1311);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:655:1: entryRuleGrouping : ruleGrouping EOF ;
    public final void entryRuleGrouping() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:656:1: ( ruleGrouping EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:657:1: ruleGrouping EOF
            {
             before(grammarAccess.getGroupingRule()); 
            pushFollow(FOLLOW_ruleGrouping_in_entryRuleGrouping1338);
            ruleGrouping();

            state._fsp--;

             after(grammarAccess.getGroupingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouping1345); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:664:1: ruleGrouping : ( ( rule__Grouping__Group__0 ) ) ;
    public final void ruleGrouping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:668:2: ( ( ( rule__Grouping__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:669:1: ( ( rule__Grouping__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:669:1: ( ( rule__Grouping__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:670:1: ( rule__Grouping__Group__0 )
            {
             before(grammarAccess.getGroupingAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:671:1: ( rule__Grouping__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:671:2: rule__Grouping__Group__0
            {
            pushFollow(FOLLOW_rule__Grouping__Group__0_in_ruleGrouping1371);
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


    // $ANTLR start "entryRuleModelMapping"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:683:1: entryRuleModelMapping : ruleModelMapping EOF ;
    public final void entryRuleModelMapping() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:684:1: ( ruleModelMapping EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:685:1: ruleModelMapping EOF
            {
             before(grammarAccess.getModelMappingRule()); 
            pushFollow(FOLLOW_ruleModelMapping_in_entryRuleModelMapping1398);
            ruleModelMapping();

            state._fsp--;

             after(grammarAccess.getModelMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelMapping1405); 

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
    // $ANTLR end "entryRuleModelMapping"


    // $ANTLR start "ruleModelMapping"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:692:1: ruleModelMapping : ( ( rule__ModelMapping__Group__0 ) ) ;
    public final void ruleModelMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:696:2: ( ( ( rule__ModelMapping__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:697:1: ( ( rule__ModelMapping__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:697:1: ( ( rule__ModelMapping__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:698:1: ( rule__ModelMapping__Group__0 )
            {
             before(grammarAccess.getModelMappingAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:699:1: ( rule__ModelMapping__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:699:2: rule__ModelMapping__Group__0
            {
            pushFollow(FOLLOW_rule__ModelMapping__Group__0_in_ruleModelMapping1431);
            rule__ModelMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelMappingAccess().getGroup()); 

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
    // $ANTLR end "ruleModelMapping"


    // $ANTLR start "entryRulePropertyMapping"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:711:1: entryRulePropertyMapping : rulePropertyMapping EOF ;
    public final void entryRulePropertyMapping() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:712:1: ( rulePropertyMapping EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:713:1: rulePropertyMapping EOF
            {
             before(grammarAccess.getPropertyMappingRule()); 
            pushFollow(FOLLOW_rulePropertyMapping_in_entryRulePropertyMapping1458);
            rulePropertyMapping();

            state._fsp--;

             after(grammarAccess.getPropertyMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyMapping1465); 

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
    // $ANTLR end "entryRulePropertyMapping"


    // $ANTLR start "rulePropertyMapping"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:720:1: rulePropertyMapping : ( ( rule__PropertyMapping__Group__0 ) ) ;
    public final void rulePropertyMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:724:2: ( ( ( rule__PropertyMapping__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:725:1: ( ( rule__PropertyMapping__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:725:1: ( ( rule__PropertyMapping__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:726:1: ( rule__PropertyMapping__Group__0 )
            {
             before(grammarAccess.getPropertyMappingAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:727:1: ( rule__PropertyMapping__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:727:2: rule__PropertyMapping__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyMapping__Group__0_in_rulePropertyMapping1491);
            rule__PropertyMapping__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyMappingAccess().getGroup()); 

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
    // $ANTLR end "rulePropertyMapping"


    // $ANTLR start "entryRuleModelFolding"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:739:1: entryRuleModelFolding : ruleModelFolding EOF ;
    public final void entryRuleModelFolding() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:740:1: ( ruleModelFolding EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:741:1: ruleModelFolding EOF
            {
             before(grammarAccess.getModelFoldingRule()); 
            pushFollow(FOLLOW_ruleModelFolding_in_entryRuleModelFolding1518);
            ruleModelFolding();

            state._fsp--;

             after(grammarAccess.getModelFoldingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelFolding1525); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:748:1: ruleModelFolding : ( ( rule__ModelFolding__Group__0 ) ) ;
    public final void ruleModelFolding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:752:2: ( ( ( rule__ModelFolding__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:753:1: ( ( rule__ModelFolding__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:753:1: ( ( rule__ModelFolding__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:754:1: ( rule__ModelFolding__Group__0 )
            {
             before(grammarAccess.getModelFoldingAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:755:1: ( rule__ModelFolding__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:755:2: rule__ModelFolding__Group__0
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__0_in_ruleModelFolding1551);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:767:1: entryRulePropertyFolding : rulePropertyFolding EOF ;
    public final void entryRulePropertyFolding() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:768:1: ( rulePropertyFolding EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:769:1: rulePropertyFolding EOF
            {
             before(grammarAccess.getPropertyFoldingRule()); 
            pushFollow(FOLLOW_rulePropertyFolding_in_entryRulePropertyFolding1578);
            rulePropertyFolding();

            state._fsp--;

             after(grammarAccess.getPropertyFoldingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyFolding1585); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:776:1: rulePropertyFolding : ( ( rule__PropertyFolding__Group__0 ) ) ;
    public final void rulePropertyFolding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:780:2: ( ( ( rule__PropertyFolding__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:781:1: ( ( rule__PropertyFolding__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:781:1: ( ( rule__PropertyFolding__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:782:1: ( rule__PropertyFolding__Group__0 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:783:1: ( rule__PropertyFolding__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:783:2: rule__PropertyFolding__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__0_in_rulePropertyFolding1611);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:795:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:796:1: ( ruleQualifiedName EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:797:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1638);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1645); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:804:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:808:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:809:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:809:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:810:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:811:1: ( rule__QualifiedName__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:811:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1671);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:823:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:824:1: ( ruleName EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:825:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName1698);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName1705); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:832:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:836:2: ( ( ( rule__Name__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:837:1: ( ( rule__Name__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:837:1: ( ( rule__Name__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:838:1: ( rule__Name__Alternatives )
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:839:1: ( rule__Name__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:839:2: rule__Name__Alternatives
            {
            pushFollow(FOLLOW_rule__Name__Alternatives_in_ruleName1731);
            rule__Name__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getNameAccess().getAlternatives()); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:851:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:852:1: ( ruleLiteral EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:853:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1758);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1765); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:860:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:864:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:865:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:865:1: ( ( rule__Literal__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:866:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:867:1: ( rule__Literal__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:867:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1791);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:880:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:884:1: ( ( ( rule__Type__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:885:1: ( ( rule__Type__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:885:1: ( ( rule__Type__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:886:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:887:1: ( rule__Type__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:887:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1828);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:899:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:903:1: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:904:1: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:904:1: ( ( rule__BOOLEAN__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:905:1: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:906:1: ( rule__BOOLEAN__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:906:2: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN1864);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:917:1: rule__ModelDefinition__Alternatives_2 : ( ( ( rule__ModelDefinition__ModelAssignment_2_0 ) ) | ( ( rule__ModelDefinition__ModelAssignment_2_1 ) ) | ( ( rule__ModelDefinition__ModelAssignment_2_2 ) ) | ( ( rule__ModelDefinition__ModelAssignment_2_3 ) ) );
    public final void rule__ModelDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:921:1: ( ( ( rule__ModelDefinition__ModelAssignment_2_0 ) ) | ( ( rule__ModelDefinition__ModelAssignment_2_1 ) ) | ( ( rule__ModelDefinition__ModelAssignment_2_2 ) ) | ( ( rule__ModelDefinition__ModelAssignment_2_3 ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_NAME_TOKEN:
                {
                alt3=1;
                }
                break;
            case 13:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==30) ) {
                    alt3=1;
                }
                else if ( (LA3_2==RULE_NAME_TOKEN||(LA3_2>=13 && LA3_2<=15)) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 14:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==RULE_NAME_TOKEN||(LA3_3>=13 && LA3_3<=15)) ) {
                    alt3=3;
                }
                else if ( (LA3_3==30) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                int LA3_4 = input.LA(2);

                if ( (LA3_4==30) ) {
                    alt3=1;
                }
                else if ( (LA3_4==RULE_NAME_TOKEN||(LA3_4>=13 && LA3_4<=15)) ) {
                    alt3=4;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:922:1: ( ( rule__ModelDefinition__ModelAssignment_2_0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:922:1: ( ( rule__ModelDefinition__ModelAssignment_2_0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:923:1: ( rule__ModelDefinition__ModelAssignment_2_0 )
                    {
                     before(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:924:1: ( rule__ModelDefinition__ModelAssignment_2_0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:924:2: rule__ModelDefinition__ModelAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__ModelAssignment_2_0_in_rule__ModelDefinition__Alternatives_21899);
                    rule__ModelDefinition__ModelAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:928:6: ( ( rule__ModelDefinition__ModelAssignment_2_1 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:928:6: ( ( rule__ModelDefinition__ModelAssignment_2_1 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:929:1: ( rule__ModelDefinition__ModelAssignment_2_1 )
                    {
                     before(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:930:1: ( rule__ModelDefinition__ModelAssignment_2_1 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:930:2: rule__ModelDefinition__ModelAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__ModelAssignment_2_1_in_rule__ModelDefinition__Alternatives_21917);
                    rule__ModelDefinition__ModelAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:934:6: ( ( rule__ModelDefinition__ModelAssignment_2_2 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:934:6: ( ( rule__ModelDefinition__ModelAssignment_2_2 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:935:1: ( rule__ModelDefinition__ModelAssignment_2_2 )
                    {
                     before(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_2()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:936:1: ( rule__ModelDefinition__ModelAssignment_2_2 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:936:2: rule__ModelDefinition__ModelAssignment_2_2
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__ModelAssignment_2_2_in_rule__ModelDefinition__Alternatives_21935);
                    rule__ModelDefinition__ModelAssignment_2_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:940:6: ( ( rule__ModelDefinition__ModelAssignment_2_3 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:940:6: ( ( rule__ModelDefinition__ModelAssignment_2_3 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:941:1: ( rule__ModelDefinition__ModelAssignment_2_3 )
                    {
                     before(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_3()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:942:1: ( rule__ModelDefinition__ModelAssignment_2_3 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:942:2: rule__ModelDefinition__ModelAssignment_2_3
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__ModelAssignment_2_3_in_rule__ModelDefinition__Alternatives_21953);
                    rule__ModelDefinition__ModelAssignment_2_3();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_3()); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:951:1: rule__RecordTerm__Alternatives : ( ( ( rule__RecordTerm__Group_0__0 ) ) | ( ( rule__RecordTerm__ReferenceAssignment_1 ) ) );
    public final void rule__RecordTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:955:1: ( ( ( rule__RecordTerm__Group_0__0 ) ) | ( ( rule__RecordTerm__ReferenceAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==32) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_NAME_TOKEN||(LA4_0>=13 && LA4_0<=15)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:956:1: ( ( rule__RecordTerm__Group_0__0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:956:1: ( ( rule__RecordTerm__Group_0__0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:957:1: ( rule__RecordTerm__Group_0__0 )
                    {
                     before(grammarAccess.getRecordTermAccess().getGroup_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:958:1: ( rule__RecordTerm__Group_0__0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:958:2: rule__RecordTerm__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__RecordTerm__Group_0__0_in_rule__RecordTerm__Alternatives1986);
                    rule__RecordTerm__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecordTermAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:962:6: ( ( rule__RecordTerm__ReferenceAssignment_1 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:962:6: ( ( rule__RecordTerm__ReferenceAssignment_1 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:963:1: ( rule__RecordTerm__ReferenceAssignment_1 )
                    {
                     before(grammarAccess.getRecordTermAccess().getReferenceAssignment_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:964:1: ( rule__RecordTerm__ReferenceAssignment_1 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:964:2: rule__RecordTerm__ReferenceAssignment_1
                    {
                    pushFollow(FOLLOW_rule__RecordTerm__ReferenceAssignment_1_in_rule__RecordTerm__Alternatives2004);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:973:1: rule__AttributeValue__Alternatives : ( ( ( rule__AttributeValue__ValueAssignment_0 ) ) | ( ( rule__AttributeValue__ValueAssignment_1 ) ) | ( ( rule__AttributeValue__ValueAssignment_2 ) ) );
    public final void rule__AttributeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:977:1: ( ( ( rule__AttributeValue__ValueAssignment_0 ) ) | ( ( rule__AttributeValue__ValueAssignment_1 ) ) | ( ( rule__AttributeValue__ValueAssignment_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt5=1;
                }
                break;
            case RULE_NAME_TOKEN:
            case 13:
            case 14:
            case 15:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DECIMAL:
            case 27:
            case 28:
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:978:1: ( ( rule__AttributeValue__ValueAssignment_0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:978:1: ( ( rule__AttributeValue__ValueAssignment_0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:979:1: ( rule__AttributeValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getValueAssignment_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:980:1: ( rule__AttributeValue__ValueAssignment_0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:980:2: rule__AttributeValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__AttributeValue__ValueAssignment_0_in_rule__AttributeValue__Alternatives2037);
                    rule__AttributeValue__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:984:6: ( ( rule__AttributeValue__ValueAssignment_1 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:984:6: ( ( rule__AttributeValue__ValueAssignment_1 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:985:1: ( rule__AttributeValue__ValueAssignment_1 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getValueAssignment_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:986:1: ( rule__AttributeValue__ValueAssignment_1 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:986:2: rule__AttributeValue__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AttributeValue__ValueAssignment_1_in_rule__AttributeValue__Alternatives2055);
                    rule__AttributeValue__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValueAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:990:6: ( ( rule__AttributeValue__ValueAssignment_2 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:990:6: ( ( rule__AttributeValue__ValueAssignment_2 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:991:1: ( rule__AttributeValue__ValueAssignment_2 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getValueAssignment_2()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:992:1: ( rule__AttributeValue__ValueAssignment_2 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:992:2: rule__AttributeValue__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__AttributeValue__ValueAssignment_2_in_rule__AttributeValue__Alternatives2073);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1001:1: rule__PropertyFolding__Alternatives_4 : ( ( '->' ) | ( '=>' ) );
    public final void rule__PropertyFolding__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1005:1: ( ( '->' ) | ( '=>' ) )
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1006:1: ( '->' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1006:1: ( '->' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1007:1: '->'
                    {
                     before(grammarAccess.getPropertyFoldingAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 
                    match(input,11,FOLLOW_11_in_rule__PropertyFolding__Alternatives_42107); 
                     after(grammarAccess.getPropertyFoldingAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1014:6: ( '=>' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1014:6: ( '=>' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1015:1: '=>'
                    {
                     before(grammarAccess.getPropertyFoldingAccess().getEqualsSignGreaterThanSignKeyword_4_1()); 
                    match(input,12,FOLLOW_12_in_rule__PropertyFolding__Alternatives_42127); 
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


    // $ANTLR start "rule__Name__Alternatives"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1027:1: rule__Name__Alternatives : ( ( RULE_NAME_TOKEN ) | ( 'projective' ) | ( 'joined' ) | ( 'summarized' ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1031:1: ( ( RULE_NAME_TOKEN ) | ( 'projective' ) | ( 'joined' ) | ( 'summarized' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_NAME_TOKEN:
                {
                alt7=1;
                }
                break;
            case 13:
                {
                alt7=2;
                }
                break;
            case 14:
                {
                alt7=3;
                }
                break;
            case 15:
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1032:1: ( RULE_NAME_TOKEN )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1032:1: ( RULE_NAME_TOKEN )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1033:1: RULE_NAME_TOKEN
                    {
                     before(grammarAccess.getNameAccess().getNAME_TOKENTerminalRuleCall_0()); 
                    match(input,RULE_NAME_TOKEN,FOLLOW_RULE_NAME_TOKEN_in_rule__Name__Alternatives2161); 
                     after(grammarAccess.getNameAccess().getNAME_TOKENTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1038:6: ( 'projective' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1038:6: ( 'projective' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1039:1: 'projective'
                    {
                     before(grammarAccess.getNameAccess().getProjectiveKeyword_1()); 
                    match(input,13,FOLLOW_13_in_rule__Name__Alternatives2179); 
                     after(grammarAccess.getNameAccess().getProjectiveKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1046:6: ( 'joined' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1046:6: ( 'joined' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1047:1: 'joined'
                    {
                     before(grammarAccess.getNameAccess().getJoinedKeyword_2()); 
                    match(input,14,FOLLOW_14_in_rule__Name__Alternatives2199); 
                     after(grammarAccess.getNameAccess().getJoinedKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1054:6: ( 'summarized' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1054:6: ( 'summarized' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1055:1: 'summarized'
                    {
                     before(grammarAccess.getNameAccess().getSummarizedKeyword_3()); 
                    match(input,15,FOLLOW_15_in_rule__Name__Alternatives2219); 
                     after(grammarAccess.getNameAccess().getSummarizedKeyword_3()); 

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
    // $ANTLR end "rule__Name__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1067:1: rule__Literal__Alternatives : ( ( ( rule__Literal__StringValueAssignment_0 ) ) | ( ( rule__Literal__IntValueAssignment_1 ) ) | ( ( rule__Literal__DecimalValueAssignment_2 ) ) | ( ( rule__Literal__BooleanValueAssignment_3 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1071:1: ( ( ( rule__Literal__StringValueAssignment_0 ) ) | ( ( rule__Literal__IntValueAssignment_1 ) ) | ( ( rule__Literal__DecimalValueAssignment_2 ) ) | ( ( rule__Literal__BooleanValueAssignment_3 ) ) )
            int alt8=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt8=1;
                }
                break;
            case RULE_INT:
                {
                alt8=2;
                }
                break;
            case RULE_DECIMAL:
                {
                alt8=3;
                }
                break;
            case 27:
            case 28:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1072:1: ( ( rule__Literal__StringValueAssignment_0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1072:1: ( ( rule__Literal__StringValueAssignment_0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1073:1: ( rule__Literal__StringValueAssignment_0 )
                    {
                     before(grammarAccess.getLiteralAccess().getStringValueAssignment_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1074:1: ( rule__Literal__StringValueAssignment_0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1074:2: rule__Literal__StringValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Literal__StringValueAssignment_0_in_rule__Literal__Alternatives2253);
                    rule__Literal__StringValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getStringValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1078:6: ( ( rule__Literal__IntValueAssignment_1 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1078:6: ( ( rule__Literal__IntValueAssignment_1 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1079:1: ( rule__Literal__IntValueAssignment_1 )
                    {
                     before(grammarAccess.getLiteralAccess().getIntValueAssignment_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1080:1: ( rule__Literal__IntValueAssignment_1 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1080:2: rule__Literal__IntValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Literal__IntValueAssignment_1_in_rule__Literal__Alternatives2271);
                    rule__Literal__IntValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getIntValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1084:6: ( ( rule__Literal__DecimalValueAssignment_2 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1084:6: ( ( rule__Literal__DecimalValueAssignment_2 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1085:1: ( rule__Literal__DecimalValueAssignment_2 )
                    {
                     before(grammarAccess.getLiteralAccess().getDecimalValueAssignment_2()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1086:1: ( rule__Literal__DecimalValueAssignment_2 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1086:2: rule__Literal__DecimalValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Literal__DecimalValueAssignment_2_in_rule__Literal__Alternatives2289);
                    rule__Literal__DecimalValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getDecimalValueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1090:6: ( ( rule__Literal__BooleanValueAssignment_3 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1090:6: ( ( rule__Literal__BooleanValueAssignment_3 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1091:1: ( rule__Literal__BooleanValueAssignment_3 )
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanValueAssignment_3()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1092:1: ( rule__Literal__BooleanValueAssignment_3 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1092:2: rule__Literal__BooleanValueAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Literal__BooleanValueAssignment_3_in_rule__Literal__Alternatives2307);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1101:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) | ( ( 'DECIMAL' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'TEXT' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'DATE' ) ) | ( ( 'DATETIME' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1105:1: ( ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) | ( ( 'DECIMAL' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'TEXT' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'DATE' ) ) | ( ( 'DATETIME' ) ) )
            int alt9=11;
            switch ( input.LA(1) ) {
            case 16:
                {
                alt9=1;
                }
                break;
            case 17:
                {
                alt9=2;
                }
                break;
            case 18:
                {
                alt9=3;
                }
                break;
            case 19:
                {
                alt9=4;
                }
                break;
            case 20:
                {
                alt9=5;
                }
                break;
            case 21:
                {
                alt9=6;
                }
                break;
            case 22:
                {
                alt9=7;
                }
                break;
            case 23:
                {
                alt9=8;
                }
                break;
            case 24:
                {
                alt9=9;
                }
                break;
            case 25:
                {
                alt9=10;
                }
                break;
            case 26:
                {
                alt9=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1106:1: ( ( 'INT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1106:1: ( ( 'INT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1107:1: ( 'INT' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1108:1: ( 'INT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1108:3: 'INT'
                    {
                    match(input,16,FOLLOW_16_in_rule__Type__Alternatives2341); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1113:6: ( ( 'LONG' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1113:6: ( ( 'LONG' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1114:1: ( 'LONG' )
                    {
                     before(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1115:1: ( 'LONG' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1115:3: 'LONG'
                    {
                    match(input,17,FOLLOW_17_in_rule__Type__Alternatives2362); 

                    }

                     after(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1120:6: ( ( 'BYTE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1120:6: ( ( 'BYTE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1121:1: ( 'BYTE' )
                    {
                     before(grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_2()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1122:1: ( 'BYTE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1122:3: 'BYTE'
                    {
                    match(input,18,FOLLOW_18_in_rule__Type__Alternatives2383); 

                    }

                     after(grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1127:6: ( ( 'SHORT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1127:6: ( ( 'SHORT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1128:1: ( 'SHORT' )
                    {
                     before(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_3()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1129:1: ( 'SHORT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1129:3: 'SHORT'
                    {
                    match(input,19,FOLLOW_19_in_rule__Type__Alternatives2404); 

                    }

                     after(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1134:6: ( ( 'DECIMAL' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1134:6: ( ( 'DECIMAL' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1135:1: ( 'DECIMAL' )
                    {
                     before(grammarAccess.getTypeAccess().getDECIMALEnumLiteralDeclaration_4()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1136:1: ( 'DECIMAL' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1136:3: 'DECIMAL'
                    {
                    match(input,20,FOLLOW_20_in_rule__Type__Alternatives2425); 

                    }

                     after(grammarAccess.getTypeAccess().getDECIMALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1141:6: ( ( 'FLOAT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1141:6: ( ( 'FLOAT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1142:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1143:1: ( 'FLOAT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1143:3: 'FLOAT'
                    {
                    match(input,21,FOLLOW_21_in_rule__Type__Alternatives2446); 

                    }

                     after(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1148:6: ( ( 'DOUBLE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1148:6: ( ( 'DOUBLE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1149:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1150:1: ( 'DOUBLE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1150:3: 'DOUBLE'
                    {
                    match(input,22,FOLLOW_22_in_rule__Type__Alternatives2467); 

                    }

                     after(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1155:6: ( ( 'TEXT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1155:6: ( ( 'TEXT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1156:1: ( 'TEXT' )
                    {
                     before(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_7()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1157:1: ( 'TEXT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1157:3: 'TEXT'
                    {
                    match(input,23,FOLLOW_23_in_rule__Type__Alternatives2488); 

                    }

                     after(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1162:6: ( ( 'BOOLEAN' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1162:6: ( ( 'BOOLEAN' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1163:1: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_8()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1164:1: ( 'BOOLEAN' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1164:3: 'BOOLEAN'
                    {
                    match(input,24,FOLLOW_24_in_rule__Type__Alternatives2509); 

                    }

                     after(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1169:6: ( ( 'DATE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1169:6: ( ( 'DATE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1170:1: ( 'DATE' )
                    {
                     before(grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_9()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1171:1: ( 'DATE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1171:3: 'DATE'
                    {
                    match(input,25,FOLLOW_25_in_rule__Type__Alternatives2530); 

                    }

                     after(grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1176:6: ( ( 'DATETIME' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1176:6: ( ( 'DATETIME' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1177:1: ( 'DATETIME' )
                    {
                     before(grammarAccess.getTypeAccess().getDATETIMEEnumLiteralDeclaration_10()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1178:1: ( 'DATETIME' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1178:3: 'DATETIME'
                    {
                    match(input,26,FOLLOW_26_in_rule__Type__Alternatives2551); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1188:1: rule__BOOLEAN__Alternatives : ( ( ( 'TRUE' ) ) | ( ( 'FALSE' ) ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1192:1: ( ( ( 'TRUE' ) ) | ( ( 'FALSE' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            else if ( (LA10_0==28) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1193:1: ( ( 'TRUE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1193:1: ( ( 'TRUE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1194:1: ( 'TRUE' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1195:1: ( 'TRUE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1195:3: 'TRUE'
                    {
                    match(input,27,FOLLOW_27_in_rule__BOOLEAN__Alternatives2587); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1200:6: ( ( 'FALSE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1200:6: ( ( 'FALSE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1201:1: ( 'FALSE' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1202:1: ( 'FALSE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1202:3: 'FALSE'
                    {
                    match(input,28,FOLLOW_28_in_rule__BOOLEAN__Alternatives2608); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1214:1: rule__ModelDefinition__Group__0 : rule__ModelDefinition__Group__0__Impl rule__ModelDefinition__Group__1 ;
    public final void rule__ModelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1218:1: ( rule__ModelDefinition__Group__0__Impl rule__ModelDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1219:2: rule__ModelDefinition__Group__0__Impl rule__ModelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group__0__Impl_in_rule__ModelDefinition__Group__02641);
            rule__ModelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group__1_in_rule__ModelDefinition__Group__02644);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1226:1: rule__ModelDefinition__Group__0__Impl : ( ( rule__ModelDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__ModelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1230:1: ( ( ( rule__ModelDefinition__DescriptionAssignment_0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1231:1: ( ( rule__ModelDefinition__DescriptionAssignment_0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1231:1: ( ( rule__ModelDefinition__DescriptionAssignment_0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1232:1: ( rule__ModelDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getModelDefinitionAccess().getDescriptionAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1233:1: ( rule__ModelDefinition__DescriptionAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1233:2: rule__ModelDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__DescriptionAssignment_0_in_rule__ModelDefinition__Group__0__Impl2671);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1243:1: rule__ModelDefinition__Group__1 : rule__ModelDefinition__Group__1__Impl rule__ModelDefinition__Group__2 ;
    public final void rule__ModelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1247:1: ( rule__ModelDefinition__Group__1__Impl rule__ModelDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1248:2: rule__ModelDefinition__Group__1__Impl rule__ModelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group__1__Impl_in_rule__ModelDefinition__Group__12702);
            rule__ModelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group__2_in_rule__ModelDefinition__Group__12705);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1255:1: rule__ModelDefinition__Group__1__Impl : ( ( rule__ModelDefinition__AttributesAssignment_1 )? ) ;
    public final void rule__ModelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1259:1: ( ( ( rule__ModelDefinition__AttributesAssignment_1 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1260:1: ( ( rule__ModelDefinition__AttributesAssignment_1 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1260:1: ( ( rule__ModelDefinition__AttributesAssignment_1 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1261:1: ( rule__ModelDefinition__AttributesAssignment_1 )?
            {
             before(grammarAccess.getModelDefinitionAccess().getAttributesAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1262:1: ( rule__ModelDefinition__AttributesAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==35) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1262:2: rule__ModelDefinition__AttributesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__AttributesAssignment_1_in_rule__ModelDefinition__Group__1__Impl2732);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1272:1: rule__ModelDefinition__Group__2 : rule__ModelDefinition__Group__2__Impl rule__ModelDefinition__Group__3 ;
    public final void rule__ModelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1276:1: ( rule__ModelDefinition__Group__2__Impl rule__ModelDefinition__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1277:2: rule__ModelDefinition__Group__2__Impl rule__ModelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group__2__Impl_in_rule__ModelDefinition__Group__22763);
            rule__ModelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group__3_in_rule__ModelDefinition__Group__22766);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1284:1: rule__ModelDefinition__Group__2__Impl : ( ( rule__ModelDefinition__Alternatives_2 ) ) ;
    public final void rule__ModelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1288:1: ( ( ( rule__ModelDefinition__Alternatives_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1289:1: ( ( rule__ModelDefinition__Alternatives_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1289:1: ( ( rule__ModelDefinition__Alternatives_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1290:1: ( rule__ModelDefinition__Alternatives_2 )
            {
             before(grammarAccess.getModelDefinitionAccess().getAlternatives_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1291:1: ( rule__ModelDefinition__Alternatives_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1291:2: rule__ModelDefinition__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Alternatives_2_in_rule__ModelDefinition__Group__2__Impl2793);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1301:1: rule__ModelDefinition__Group__3 : rule__ModelDefinition__Group__3__Impl ;
    public final void rule__ModelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1305:1: ( rule__ModelDefinition__Group__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1306:2: rule__ModelDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group__3__Impl_in_rule__ModelDefinition__Group__32823);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1312:1: rule__ModelDefinition__Group__3__Impl : ( ';' ) ;
    public final void rule__ModelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1316:1: ( ( ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1317:1: ( ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1317:1: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1318:1: ';'
            {
             before(grammarAccess.getModelDefinitionAccess().getSemicolonKeyword_3()); 
            match(input,29,FOLLOW_29_in_rule__ModelDefinition__Group__3__Impl2851); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1339:1: rule__RecordModelDefinition__Group__0 : rule__RecordModelDefinition__Group__0__Impl rule__RecordModelDefinition__Group__1 ;
    public final void rule__RecordModelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1343:1: ( rule__RecordModelDefinition__Group__0__Impl rule__RecordModelDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1344:2: rule__RecordModelDefinition__Group__0__Impl rule__RecordModelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__0__Impl_in_rule__RecordModelDefinition__Group__02890);
            rule__RecordModelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__1_in_rule__RecordModelDefinition__Group__02893);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1351:1: rule__RecordModelDefinition__Group__0__Impl : ( ( rule__RecordModelDefinition__NameAssignment_0 ) ) ;
    public final void rule__RecordModelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1355:1: ( ( ( rule__RecordModelDefinition__NameAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1356:1: ( ( rule__RecordModelDefinition__NameAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1356:1: ( ( rule__RecordModelDefinition__NameAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1357:1: ( rule__RecordModelDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getNameAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1358:1: ( rule__RecordModelDefinition__NameAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1358:2: rule__RecordModelDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__NameAssignment_0_in_rule__RecordModelDefinition__Group__0__Impl2920);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1368:1: rule__RecordModelDefinition__Group__1 : rule__RecordModelDefinition__Group__1__Impl rule__RecordModelDefinition__Group__2 ;
    public final void rule__RecordModelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1372:1: ( rule__RecordModelDefinition__Group__1__Impl rule__RecordModelDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1373:2: rule__RecordModelDefinition__Group__1__Impl rule__RecordModelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__1__Impl_in_rule__RecordModelDefinition__Group__12950);
            rule__RecordModelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__2_in_rule__RecordModelDefinition__Group__12953);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1380:1: rule__RecordModelDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__RecordModelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1384:1: ( ( '=' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1385:1: ( '=' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1385:1: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1386:1: '='
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getEqualsSignKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__RecordModelDefinition__Group__1__Impl2981); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1399:1: rule__RecordModelDefinition__Group__2 : rule__RecordModelDefinition__Group__2__Impl ;
    public final void rule__RecordModelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1403:1: ( rule__RecordModelDefinition__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1404:2: rule__RecordModelDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__2__Impl_in_rule__RecordModelDefinition__Group__23012);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1410:1: rule__RecordModelDefinition__Group__2__Impl : ( ( rule__RecordModelDefinition__RhsAssignment_2 ) ) ;
    public final void rule__RecordModelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1414:1: ( ( ( rule__RecordModelDefinition__RhsAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1415:1: ( ( rule__RecordModelDefinition__RhsAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1415:1: ( ( rule__RecordModelDefinition__RhsAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1416:1: ( rule__RecordModelDefinition__RhsAssignment_2 )
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getRhsAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1417:1: ( rule__RecordModelDefinition__RhsAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1417:2: rule__RecordModelDefinition__RhsAssignment_2
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__RhsAssignment_2_in_rule__RecordModelDefinition__Group__2__Impl3039);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1433:1: rule__ProjectiveModelDefinition__Group__0 : rule__ProjectiveModelDefinition__Group__0__Impl rule__ProjectiveModelDefinition__Group__1 ;
    public final void rule__ProjectiveModelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1437:1: ( rule__ProjectiveModelDefinition__Group__0__Impl rule__ProjectiveModelDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1438:2: rule__ProjectiveModelDefinition__Group__0__Impl rule__ProjectiveModelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__Group__0__Impl_in_rule__ProjectiveModelDefinition__Group__03075);
            rule__ProjectiveModelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__Group__1_in_rule__ProjectiveModelDefinition__Group__03078);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1445:1: rule__ProjectiveModelDefinition__Group__0__Impl : ( 'projective' ) ;
    public final void rule__ProjectiveModelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1449:1: ( ( 'projective' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1450:1: ( 'projective' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1450:1: ( 'projective' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1451:1: 'projective'
            {
             before(grammarAccess.getProjectiveModelDefinitionAccess().getProjectiveKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__ProjectiveModelDefinition__Group__0__Impl3106); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1464:1: rule__ProjectiveModelDefinition__Group__1 : rule__ProjectiveModelDefinition__Group__1__Impl rule__ProjectiveModelDefinition__Group__2 ;
    public final void rule__ProjectiveModelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1468:1: ( rule__ProjectiveModelDefinition__Group__1__Impl rule__ProjectiveModelDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1469:2: rule__ProjectiveModelDefinition__Group__1__Impl rule__ProjectiveModelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__Group__1__Impl_in_rule__ProjectiveModelDefinition__Group__13137);
            rule__ProjectiveModelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__Group__2_in_rule__ProjectiveModelDefinition__Group__13140);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1476:1: rule__ProjectiveModelDefinition__Group__1__Impl : ( ( rule__ProjectiveModelDefinition__NameAssignment_1 ) ) ;
    public final void rule__ProjectiveModelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1480:1: ( ( ( rule__ProjectiveModelDefinition__NameAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1481:1: ( ( rule__ProjectiveModelDefinition__NameAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1481:1: ( ( rule__ProjectiveModelDefinition__NameAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1482:1: ( rule__ProjectiveModelDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getProjectiveModelDefinitionAccess().getNameAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1483:1: ( rule__ProjectiveModelDefinition__NameAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1483:2: rule__ProjectiveModelDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__NameAssignment_1_in_rule__ProjectiveModelDefinition__Group__1__Impl3167);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1493:1: rule__ProjectiveModelDefinition__Group__2 : rule__ProjectiveModelDefinition__Group__2__Impl rule__ProjectiveModelDefinition__Group__3 ;
    public final void rule__ProjectiveModelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1497:1: ( rule__ProjectiveModelDefinition__Group__2__Impl rule__ProjectiveModelDefinition__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1498:2: rule__ProjectiveModelDefinition__Group__2__Impl rule__ProjectiveModelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__Group__2__Impl_in_rule__ProjectiveModelDefinition__Group__23197);
            rule__ProjectiveModelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__Group__3_in_rule__ProjectiveModelDefinition__Group__23200);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1505:1: rule__ProjectiveModelDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__ProjectiveModelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1509:1: ( ( '=' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1510:1: ( '=' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1510:1: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1511:1: '='
            {
             before(grammarAccess.getProjectiveModelDefinitionAccess().getEqualsSignKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__ProjectiveModelDefinition__Group__2__Impl3228); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1524:1: rule__ProjectiveModelDefinition__Group__3 : rule__ProjectiveModelDefinition__Group__3__Impl ;
    public final void rule__ProjectiveModelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1528:1: ( rule__ProjectiveModelDefinition__Group__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1529:2: rule__ProjectiveModelDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__Group__3__Impl_in_rule__ProjectiveModelDefinition__Group__33259);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1535:1: rule__ProjectiveModelDefinition__Group__3__Impl : ( ( rule__ProjectiveModelDefinition__RhsAssignment_3 ) ) ;
    public final void rule__ProjectiveModelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1539:1: ( ( ( rule__ProjectiveModelDefinition__RhsAssignment_3 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1540:1: ( ( rule__ProjectiveModelDefinition__RhsAssignment_3 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1540:1: ( ( rule__ProjectiveModelDefinition__RhsAssignment_3 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1541:1: ( rule__ProjectiveModelDefinition__RhsAssignment_3 )
            {
             before(grammarAccess.getProjectiveModelDefinitionAccess().getRhsAssignment_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1542:1: ( rule__ProjectiveModelDefinition__RhsAssignment_3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1542:2: rule__ProjectiveModelDefinition__RhsAssignment_3
            {
            pushFollow(FOLLOW_rule__ProjectiveModelDefinition__RhsAssignment_3_in_rule__ProjectiveModelDefinition__Group__3__Impl3286);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1560:1: rule__RecordExpression__Group__0 : rule__RecordExpression__Group__0__Impl rule__RecordExpression__Group__1 ;
    public final void rule__RecordExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1564:1: ( rule__RecordExpression__Group__0__Impl rule__RecordExpression__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1565:2: rule__RecordExpression__Group__0__Impl rule__RecordExpression__Group__1
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group__0__Impl_in_rule__RecordExpression__Group__03324);
            rule__RecordExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordExpression__Group__1_in_rule__RecordExpression__Group__03327);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1572:1: rule__RecordExpression__Group__0__Impl : ( ( rule__RecordExpression__TermsAssignment_0 ) ) ;
    public final void rule__RecordExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1576:1: ( ( ( rule__RecordExpression__TermsAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1577:1: ( ( rule__RecordExpression__TermsAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1577:1: ( ( rule__RecordExpression__TermsAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1578:1: ( rule__RecordExpression__TermsAssignment_0 )
            {
             before(grammarAccess.getRecordExpressionAccess().getTermsAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1579:1: ( rule__RecordExpression__TermsAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1579:2: rule__RecordExpression__TermsAssignment_0
            {
            pushFollow(FOLLOW_rule__RecordExpression__TermsAssignment_0_in_rule__RecordExpression__Group__0__Impl3354);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1589:1: rule__RecordExpression__Group__1 : rule__RecordExpression__Group__1__Impl ;
    public final void rule__RecordExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1593:1: ( rule__RecordExpression__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1594:2: rule__RecordExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group__1__Impl_in_rule__RecordExpression__Group__13384);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1600:1: rule__RecordExpression__Group__1__Impl : ( ( rule__RecordExpression__Group_1__0 )* ) ;
    public final void rule__RecordExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1604:1: ( ( ( rule__RecordExpression__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1605:1: ( ( rule__RecordExpression__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1605:1: ( ( rule__RecordExpression__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1606:1: ( rule__RecordExpression__Group_1__0 )*
            {
             before(grammarAccess.getRecordExpressionAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1607:1: ( rule__RecordExpression__Group_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1607:2: rule__RecordExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RecordExpression__Group_1__0_in_rule__RecordExpression__Group__1__Impl3411);
            	    rule__RecordExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop13;
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1621:1: rule__RecordExpression__Group_1__0 : rule__RecordExpression__Group_1__0__Impl rule__RecordExpression__Group_1__1 ;
    public final void rule__RecordExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1625:1: ( rule__RecordExpression__Group_1__0__Impl rule__RecordExpression__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1626:2: rule__RecordExpression__Group_1__0__Impl rule__RecordExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group_1__0__Impl_in_rule__RecordExpression__Group_1__03446);
            rule__RecordExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordExpression__Group_1__1_in_rule__RecordExpression__Group_1__03449);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1633:1: rule__RecordExpression__Group_1__0__Impl : ( '+' ) ;
    public final void rule__RecordExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1637:1: ( ( '+' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1638:1: ( '+' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1638:1: ( '+' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1639:1: '+'
            {
             before(grammarAccess.getRecordExpressionAccess().getPlusSignKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__RecordExpression__Group_1__0__Impl3477); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1652:1: rule__RecordExpression__Group_1__1 : rule__RecordExpression__Group_1__1__Impl ;
    public final void rule__RecordExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1656:1: ( rule__RecordExpression__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1657:2: rule__RecordExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group_1__1__Impl_in_rule__RecordExpression__Group_1__13508);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1663:1: rule__RecordExpression__Group_1__1__Impl : ( ( rule__RecordExpression__TermsAssignment_1_1 ) ) ;
    public final void rule__RecordExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1667:1: ( ( ( rule__RecordExpression__TermsAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1668:1: ( ( rule__RecordExpression__TermsAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1668:1: ( ( rule__RecordExpression__TermsAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1669:1: ( rule__RecordExpression__TermsAssignment_1_1 )
            {
             before(grammarAccess.getRecordExpressionAccess().getTermsAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1670:1: ( rule__RecordExpression__TermsAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1670:2: rule__RecordExpression__TermsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RecordExpression__TermsAssignment_1_1_in_rule__RecordExpression__Group_1__1__Impl3535);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1684:1: rule__RecordTerm__Group_0__0 : rule__RecordTerm__Group_0__0__Impl rule__RecordTerm__Group_0__1 ;
    public final void rule__RecordTerm__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1688:1: ( rule__RecordTerm__Group_0__0__Impl rule__RecordTerm__Group_0__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1689:2: rule__RecordTerm__Group_0__0__Impl rule__RecordTerm__Group_0__1
            {
            pushFollow(FOLLOW_rule__RecordTerm__Group_0__0__Impl_in_rule__RecordTerm__Group_0__03569);
            rule__RecordTerm__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordTerm__Group_0__1_in_rule__RecordTerm__Group_0__03572);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1696:1: rule__RecordTerm__Group_0__0__Impl : ( '{' ) ;
    public final void rule__RecordTerm__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1700:1: ( ( '{' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1701:1: ( '{' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1701:1: ( '{' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1702:1: '{'
            {
             before(grammarAccess.getRecordTermAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,32,FOLLOW_32_in_rule__RecordTerm__Group_0__0__Impl3600); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1715:1: rule__RecordTerm__Group_0__1 : rule__RecordTerm__Group_0__1__Impl rule__RecordTerm__Group_0__2 ;
    public final void rule__RecordTerm__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1719:1: ( rule__RecordTerm__Group_0__1__Impl rule__RecordTerm__Group_0__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1720:2: rule__RecordTerm__Group_0__1__Impl rule__RecordTerm__Group_0__2
            {
            pushFollow(FOLLOW_rule__RecordTerm__Group_0__1__Impl_in_rule__RecordTerm__Group_0__13631);
            rule__RecordTerm__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordTerm__Group_0__2_in_rule__RecordTerm__Group_0__13634);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1727:1: rule__RecordTerm__Group_0__1__Impl : ( ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* ) ) ;
    public final void rule__RecordTerm__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1731:1: ( ( ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1732:1: ( ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1732:1: ( ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1733:1: ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1733:1: ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1734:1: ( rule__RecordTerm__PropertiesAssignment_0_1 )
            {
             before(grammarAccess.getRecordTermAccess().getPropertiesAssignment_0_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1735:1: ( rule__RecordTerm__PropertiesAssignment_0_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1735:2: rule__RecordTerm__PropertiesAssignment_0_1
            {
            pushFollow(FOLLOW_rule__RecordTerm__PropertiesAssignment_0_1_in_rule__RecordTerm__Group_0__1__Impl3663);
            rule__RecordTerm__PropertiesAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordTermAccess().getPropertiesAssignment_0_1()); 

            }

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1738:1: ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1739:1: ( rule__RecordTerm__PropertiesAssignment_0_1 )*
            {
             before(grammarAccess.getRecordTermAccess().getPropertiesAssignment_0_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1740:1: ( rule__RecordTerm__PropertiesAssignment_0_1 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( ((LA14_0>=RULE_STRING && LA14_0<=RULE_NAME_TOKEN)||(LA14_0>=13 && LA14_0<=15)||LA14_0==35) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1740:2: rule__RecordTerm__PropertiesAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__RecordTerm__PropertiesAssignment_0_1_in_rule__RecordTerm__Group_0__1__Impl3675);
            	    rule__RecordTerm__PropertiesAssignment_0_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1751:1: rule__RecordTerm__Group_0__2 : rule__RecordTerm__Group_0__2__Impl ;
    public final void rule__RecordTerm__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1755:1: ( rule__RecordTerm__Group_0__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1756:2: rule__RecordTerm__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__RecordTerm__Group_0__2__Impl_in_rule__RecordTerm__Group_0__23708);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1762:1: rule__RecordTerm__Group_0__2__Impl : ( '}' ) ;
    public final void rule__RecordTerm__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1766:1: ( ( '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1767:1: ( '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1767:1: ( '}' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1768:1: '}'
            {
             before(grammarAccess.getRecordTermAccess().getRightCurlyBracketKeyword_0_2()); 
            match(input,33,FOLLOW_33_in_rule__RecordTerm__Group_0__2__Impl3736); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1787:1: rule__PropertyDefinition__Group__0 : rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 ;
    public final void rule__PropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1791:1: ( rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1792:2: rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__03773);
            rule__PropertyDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__03776);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1799:1: rule__PropertyDefinition__Group__0__Impl : ( ( rule__PropertyDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__PropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1803:1: ( ( ( rule__PropertyDefinition__DescriptionAssignment_0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1804:1: ( ( rule__PropertyDefinition__DescriptionAssignment_0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1804:1: ( ( rule__PropertyDefinition__DescriptionAssignment_0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1805:1: ( rule__PropertyDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDescriptionAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1806:1: ( rule__PropertyDefinition__DescriptionAssignment_0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1806:2: rule__PropertyDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__DescriptionAssignment_0_in_rule__PropertyDefinition__Group__0__Impl3803);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1816:1: rule__PropertyDefinition__Group__1 : rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 ;
    public final void rule__PropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1820:1: ( rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1821:2: rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__13834);
            rule__PropertyDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__13837);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1828:1: rule__PropertyDefinition__Group__1__Impl : ( ( rule__PropertyDefinition__AttributesAssignment_1 )? ) ;
    public final void rule__PropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1832:1: ( ( ( rule__PropertyDefinition__AttributesAssignment_1 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1833:1: ( ( rule__PropertyDefinition__AttributesAssignment_1 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1833:1: ( ( rule__PropertyDefinition__AttributesAssignment_1 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1834:1: ( rule__PropertyDefinition__AttributesAssignment_1 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getAttributesAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1835:1: ( rule__PropertyDefinition__AttributesAssignment_1 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==35) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1835:2: rule__PropertyDefinition__AttributesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__AttributesAssignment_1_in_rule__PropertyDefinition__Group__1__Impl3864);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1845:1: rule__PropertyDefinition__Group__2 : rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 ;
    public final void rule__PropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1849:1: ( rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1850:2: rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__23895);
            rule__PropertyDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__23898);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1857:1: rule__PropertyDefinition__Group__2__Impl : ( ( rule__PropertyDefinition__NameAssignment_2 ) ) ;
    public final void rule__PropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1861:1: ( ( ( rule__PropertyDefinition__NameAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1862:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1862:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1863:1: ( rule__PropertyDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1864:1: ( rule__PropertyDefinition__NameAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1864:2: rule__PropertyDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__NameAssignment_2_in_rule__PropertyDefinition__Group__2__Impl3925);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1874:1: rule__PropertyDefinition__Group__3 : rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 ;
    public final void rule__PropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1878:1: ( rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1879:2: rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__33955);
            rule__PropertyDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__33958);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1886:1: rule__PropertyDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__PropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1890:1: ( ( ':' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1891:1: ( ':' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1891:1: ( ':' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1892:1: ':'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getColonKeyword_3()); 
            match(input,34,FOLLOW_34_in_rule__PropertyDefinition__Group__3__Impl3986); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1905:1: rule__PropertyDefinition__Group__4 : rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 ;
    public final void rule__PropertyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1909:1: ( rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1910:2: rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__44017);
            rule__PropertyDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__44020);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1917:1: rule__PropertyDefinition__Group__4__Impl : ( ( rule__PropertyDefinition__TypeAssignment_4 ) ) ;
    public final void rule__PropertyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1921:1: ( ( ( rule__PropertyDefinition__TypeAssignment_4 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1922:1: ( ( rule__PropertyDefinition__TypeAssignment_4 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1922:1: ( ( rule__PropertyDefinition__TypeAssignment_4 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1923:1: ( rule__PropertyDefinition__TypeAssignment_4 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_4()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1924:1: ( rule__PropertyDefinition__TypeAssignment_4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1924:2: rule__PropertyDefinition__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__TypeAssignment_4_in_rule__PropertyDefinition__Group__4__Impl4047);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1934:1: rule__PropertyDefinition__Group__5 : rule__PropertyDefinition__Group__5__Impl ;
    public final void rule__PropertyDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1938:1: ( rule__PropertyDefinition__Group__5__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1939:2: rule__PropertyDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__54077);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1945:1: rule__PropertyDefinition__Group__5__Impl : ( ';' ) ;
    public final void rule__PropertyDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1949:1: ( ( ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1950:1: ( ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1950:1: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1951:1: ';'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__PropertyDefinition__Group__5__Impl4105); 
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


    // $ANTLR start "rule__JoinedModelDefinition__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1976:1: rule__JoinedModelDefinition__Group__0 : rule__JoinedModelDefinition__Group__0__Impl rule__JoinedModelDefinition__Group__1 ;
    public final void rule__JoinedModelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1980:1: ( rule__JoinedModelDefinition__Group__0__Impl rule__JoinedModelDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1981:2: rule__JoinedModelDefinition__Group__0__Impl rule__JoinedModelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__JoinedModelDefinition__Group__0__Impl_in_rule__JoinedModelDefinition__Group__04148);
            rule__JoinedModelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoinedModelDefinition__Group__1_in_rule__JoinedModelDefinition__Group__04151);
            rule__JoinedModelDefinition__Group__1();

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
    // $ANTLR end "rule__JoinedModelDefinition__Group__0"


    // $ANTLR start "rule__JoinedModelDefinition__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1988:1: rule__JoinedModelDefinition__Group__0__Impl : ( 'joined' ) ;
    public final void rule__JoinedModelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1992:1: ( ( 'joined' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1993:1: ( 'joined' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1993:1: ( 'joined' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1994:1: 'joined'
            {
             before(grammarAccess.getJoinedModelDefinitionAccess().getJoinedKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__JoinedModelDefinition__Group__0__Impl4179); 
             after(grammarAccess.getJoinedModelDefinitionAccess().getJoinedKeyword_0()); 

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
    // $ANTLR end "rule__JoinedModelDefinition__Group__0__Impl"


    // $ANTLR start "rule__JoinedModelDefinition__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2007:1: rule__JoinedModelDefinition__Group__1 : rule__JoinedModelDefinition__Group__1__Impl rule__JoinedModelDefinition__Group__2 ;
    public final void rule__JoinedModelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2011:1: ( rule__JoinedModelDefinition__Group__1__Impl rule__JoinedModelDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2012:2: rule__JoinedModelDefinition__Group__1__Impl rule__JoinedModelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__JoinedModelDefinition__Group__1__Impl_in_rule__JoinedModelDefinition__Group__14210);
            rule__JoinedModelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoinedModelDefinition__Group__2_in_rule__JoinedModelDefinition__Group__14213);
            rule__JoinedModelDefinition__Group__2();

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
    // $ANTLR end "rule__JoinedModelDefinition__Group__1"


    // $ANTLR start "rule__JoinedModelDefinition__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2019:1: rule__JoinedModelDefinition__Group__1__Impl : ( ( rule__JoinedModelDefinition__NameAssignment_1 ) ) ;
    public final void rule__JoinedModelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2023:1: ( ( ( rule__JoinedModelDefinition__NameAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2024:1: ( ( rule__JoinedModelDefinition__NameAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2024:1: ( ( rule__JoinedModelDefinition__NameAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2025:1: ( rule__JoinedModelDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getJoinedModelDefinitionAccess().getNameAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2026:1: ( rule__JoinedModelDefinition__NameAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2026:2: rule__JoinedModelDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__JoinedModelDefinition__NameAssignment_1_in_rule__JoinedModelDefinition__Group__1__Impl4240);
            rule__JoinedModelDefinition__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getJoinedModelDefinitionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__JoinedModelDefinition__Group__1__Impl"


    // $ANTLR start "rule__JoinedModelDefinition__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2036:1: rule__JoinedModelDefinition__Group__2 : rule__JoinedModelDefinition__Group__2__Impl rule__JoinedModelDefinition__Group__3 ;
    public final void rule__JoinedModelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2040:1: ( rule__JoinedModelDefinition__Group__2__Impl rule__JoinedModelDefinition__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2041:2: rule__JoinedModelDefinition__Group__2__Impl rule__JoinedModelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__JoinedModelDefinition__Group__2__Impl_in_rule__JoinedModelDefinition__Group__24270);
            rule__JoinedModelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoinedModelDefinition__Group__3_in_rule__JoinedModelDefinition__Group__24273);
            rule__JoinedModelDefinition__Group__3();

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
    // $ANTLR end "rule__JoinedModelDefinition__Group__2"


    // $ANTLR start "rule__JoinedModelDefinition__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2048:1: rule__JoinedModelDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__JoinedModelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2052:1: ( ( '=' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2053:1: ( '=' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2053:1: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2054:1: '='
            {
             before(grammarAccess.getJoinedModelDefinitionAccess().getEqualsSignKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__JoinedModelDefinition__Group__2__Impl4301); 
             after(grammarAccess.getJoinedModelDefinitionAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__JoinedModelDefinition__Group__2__Impl"


    // $ANTLR start "rule__JoinedModelDefinition__Group__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2067:1: rule__JoinedModelDefinition__Group__3 : rule__JoinedModelDefinition__Group__3__Impl ;
    public final void rule__JoinedModelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2071:1: ( rule__JoinedModelDefinition__Group__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2072:2: rule__JoinedModelDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__JoinedModelDefinition__Group__3__Impl_in_rule__JoinedModelDefinition__Group__34332);
            rule__JoinedModelDefinition__Group__3__Impl();

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
    // $ANTLR end "rule__JoinedModelDefinition__Group__3"


    // $ANTLR start "rule__JoinedModelDefinition__Group__3__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2078:1: rule__JoinedModelDefinition__Group__3__Impl : ( ( rule__JoinedModelDefinition__RhsAssignment_3 ) ) ;
    public final void rule__JoinedModelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2082:1: ( ( ( rule__JoinedModelDefinition__RhsAssignment_3 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2083:1: ( ( rule__JoinedModelDefinition__RhsAssignment_3 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2083:1: ( ( rule__JoinedModelDefinition__RhsAssignment_3 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2084:1: ( rule__JoinedModelDefinition__RhsAssignment_3 )
            {
             before(grammarAccess.getJoinedModelDefinitionAccess().getRhsAssignment_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2085:1: ( rule__JoinedModelDefinition__RhsAssignment_3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2085:2: rule__JoinedModelDefinition__RhsAssignment_3
            {
            pushFollow(FOLLOW_rule__JoinedModelDefinition__RhsAssignment_3_in_rule__JoinedModelDefinition__Group__3__Impl4359);
            rule__JoinedModelDefinition__RhsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getJoinedModelDefinitionAccess().getRhsAssignment_3()); 

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
    // $ANTLR end "rule__JoinedModelDefinition__Group__3__Impl"


    // $ANTLR start "rule__JoinExpression__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2103:1: rule__JoinExpression__Group__0 : rule__JoinExpression__Group__0__Impl rule__JoinExpression__Group__1 ;
    public final void rule__JoinExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2107:1: ( rule__JoinExpression__Group__0__Impl rule__JoinExpression__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2108:2: rule__JoinExpression__Group__0__Impl rule__JoinExpression__Group__1
            {
            pushFollow(FOLLOW_rule__JoinExpression__Group__0__Impl_in_rule__JoinExpression__Group__04397);
            rule__JoinExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoinExpression__Group__1_in_rule__JoinExpression__Group__04400);
            rule__JoinExpression__Group__1();

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
    // $ANTLR end "rule__JoinExpression__Group__0"


    // $ANTLR start "rule__JoinExpression__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2115:1: rule__JoinExpression__Group__0__Impl : ( ( rule__JoinExpression__TermsAssignment_0 ) ) ;
    public final void rule__JoinExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2119:1: ( ( ( rule__JoinExpression__TermsAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2120:1: ( ( rule__JoinExpression__TermsAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2120:1: ( ( rule__JoinExpression__TermsAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2121:1: ( rule__JoinExpression__TermsAssignment_0 )
            {
             before(grammarAccess.getJoinExpressionAccess().getTermsAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2122:1: ( rule__JoinExpression__TermsAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2122:2: rule__JoinExpression__TermsAssignment_0
            {
            pushFollow(FOLLOW_rule__JoinExpression__TermsAssignment_0_in_rule__JoinExpression__Group__0__Impl4427);
            rule__JoinExpression__TermsAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJoinExpressionAccess().getTermsAssignment_0()); 

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
    // $ANTLR end "rule__JoinExpression__Group__0__Impl"


    // $ANTLR start "rule__JoinExpression__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2132:1: rule__JoinExpression__Group__1 : rule__JoinExpression__Group__1__Impl ;
    public final void rule__JoinExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2136:1: ( rule__JoinExpression__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2137:2: rule__JoinExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__JoinExpression__Group__1__Impl_in_rule__JoinExpression__Group__14457);
            rule__JoinExpression__Group__1__Impl();

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
    // $ANTLR end "rule__JoinExpression__Group__1"


    // $ANTLR start "rule__JoinExpression__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2143:1: rule__JoinExpression__Group__1__Impl : ( ( rule__JoinExpression__Group_1__0 )* ) ;
    public final void rule__JoinExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2147:1: ( ( ( rule__JoinExpression__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2148:1: ( ( rule__JoinExpression__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2148:1: ( ( rule__JoinExpression__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2149:1: ( rule__JoinExpression__Group_1__0 )*
            {
             before(grammarAccess.getJoinExpressionAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2150:1: ( rule__JoinExpression__Group_1__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==31) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2150:2: rule__JoinExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__JoinExpression__Group_1__0_in_rule__JoinExpression__Group__1__Impl4484);
            	    rule__JoinExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getJoinExpressionAccess().getGroup_1()); 

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
    // $ANTLR end "rule__JoinExpression__Group__1__Impl"


    // $ANTLR start "rule__JoinExpression__Group_1__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2164:1: rule__JoinExpression__Group_1__0 : rule__JoinExpression__Group_1__0__Impl rule__JoinExpression__Group_1__1 ;
    public final void rule__JoinExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2168:1: ( rule__JoinExpression__Group_1__0__Impl rule__JoinExpression__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2169:2: rule__JoinExpression__Group_1__0__Impl rule__JoinExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__JoinExpression__Group_1__0__Impl_in_rule__JoinExpression__Group_1__04519);
            rule__JoinExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoinExpression__Group_1__1_in_rule__JoinExpression__Group_1__04522);
            rule__JoinExpression__Group_1__1();

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
    // $ANTLR end "rule__JoinExpression__Group_1__0"


    // $ANTLR start "rule__JoinExpression__Group_1__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2176:1: rule__JoinExpression__Group_1__0__Impl : ( '+' ) ;
    public final void rule__JoinExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2180:1: ( ( '+' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2181:1: ( '+' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2181:1: ( '+' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2182:1: '+'
            {
             before(grammarAccess.getJoinExpressionAccess().getPlusSignKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__JoinExpression__Group_1__0__Impl4550); 
             after(grammarAccess.getJoinExpressionAccess().getPlusSignKeyword_1_0()); 

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
    // $ANTLR end "rule__JoinExpression__Group_1__0__Impl"


    // $ANTLR start "rule__JoinExpression__Group_1__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2195:1: rule__JoinExpression__Group_1__1 : rule__JoinExpression__Group_1__1__Impl ;
    public final void rule__JoinExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2199:1: ( rule__JoinExpression__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2200:2: rule__JoinExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__JoinExpression__Group_1__1__Impl_in_rule__JoinExpression__Group_1__14581);
            rule__JoinExpression__Group_1__1__Impl();

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
    // $ANTLR end "rule__JoinExpression__Group_1__1"


    // $ANTLR start "rule__JoinExpression__Group_1__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2206:1: rule__JoinExpression__Group_1__1__Impl : ( ( rule__JoinExpression__TermsAssignment_1_1 ) ) ;
    public final void rule__JoinExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2210:1: ( ( ( rule__JoinExpression__TermsAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2211:1: ( ( rule__JoinExpression__TermsAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2211:1: ( ( rule__JoinExpression__TermsAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2212:1: ( rule__JoinExpression__TermsAssignment_1_1 )
            {
             before(grammarAccess.getJoinExpressionAccess().getTermsAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2213:1: ( rule__JoinExpression__TermsAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2213:2: rule__JoinExpression__TermsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__JoinExpression__TermsAssignment_1_1_in_rule__JoinExpression__Group_1__1__Impl4608);
            rule__JoinExpression__TermsAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getJoinExpressionAccess().getTermsAssignment_1_1()); 

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
    // $ANTLR end "rule__JoinExpression__Group_1__1__Impl"


    // $ANTLR start "rule__JoinTerm__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2227:1: rule__JoinTerm__Group__0 : rule__JoinTerm__Group__0__Impl rule__JoinTerm__Group__1 ;
    public final void rule__JoinTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2231:1: ( rule__JoinTerm__Group__0__Impl rule__JoinTerm__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2232:2: rule__JoinTerm__Group__0__Impl rule__JoinTerm__Group__1
            {
            pushFollow(FOLLOW_rule__JoinTerm__Group__0__Impl_in_rule__JoinTerm__Group__04642);
            rule__JoinTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoinTerm__Group__1_in_rule__JoinTerm__Group__04645);
            rule__JoinTerm__Group__1();

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
    // $ANTLR end "rule__JoinTerm__Group__0"


    // $ANTLR start "rule__JoinTerm__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2239:1: rule__JoinTerm__Group__0__Impl : ( ( rule__JoinTerm__ReferenceAssignment_0 ) ) ;
    public final void rule__JoinTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2243:1: ( ( ( rule__JoinTerm__ReferenceAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2244:1: ( ( rule__JoinTerm__ReferenceAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2244:1: ( ( rule__JoinTerm__ReferenceAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2245:1: ( rule__JoinTerm__ReferenceAssignment_0 )
            {
             before(grammarAccess.getJoinTermAccess().getReferenceAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2246:1: ( rule__JoinTerm__ReferenceAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2246:2: rule__JoinTerm__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__JoinTerm__ReferenceAssignment_0_in_rule__JoinTerm__Group__0__Impl4672);
            rule__JoinTerm__ReferenceAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getJoinTermAccess().getReferenceAssignment_0()); 

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
    // $ANTLR end "rule__JoinTerm__Group__0__Impl"


    // $ANTLR start "rule__JoinTerm__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2256:1: rule__JoinTerm__Group__1 : rule__JoinTerm__Group__1__Impl rule__JoinTerm__Group__2 ;
    public final void rule__JoinTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2260:1: ( rule__JoinTerm__Group__1__Impl rule__JoinTerm__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2261:2: rule__JoinTerm__Group__1__Impl rule__JoinTerm__Group__2
            {
            pushFollow(FOLLOW_rule__JoinTerm__Group__1__Impl_in_rule__JoinTerm__Group__14702);
            rule__JoinTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoinTerm__Group__2_in_rule__JoinTerm__Group__14705);
            rule__JoinTerm__Group__2();

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
    // $ANTLR end "rule__JoinTerm__Group__1"


    // $ANTLR start "rule__JoinTerm__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2268:1: rule__JoinTerm__Group__1__Impl : ( ( rule__JoinTerm__MappingAssignment_1 )? ) ;
    public final void rule__JoinTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2272:1: ( ( ( rule__JoinTerm__MappingAssignment_1 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2273:1: ( ( rule__JoinTerm__MappingAssignment_1 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2273:1: ( ( rule__JoinTerm__MappingAssignment_1 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2274:1: ( rule__JoinTerm__MappingAssignment_1 )?
            {
             before(grammarAccess.getJoinTermAccess().getMappingAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2275:1: ( rule__JoinTerm__MappingAssignment_1 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==11) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2275:2: rule__JoinTerm__MappingAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JoinTerm__MappingAssignment_1_in_rule__JoinTerm__Group__1__Impl4732);
                    rule__JoinTerm__MappingAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJoinTermAccess().getMappingAssignment_1()); 

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
    // $ANTLR end "rule__JoinTerm__Group__1__Impl"


    // $ANTLR start "rule__JoinTerm__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2285:1: rule__JoinTerm__Group__2 : rule__JoinTerm__Group__2__Impl ;
    public final void rule__JoinTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2289:1: ( rule__JoinTerm__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2290:2: rule__JoinTerm__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JoinTerm__Group__2__Impl_in_rule__JoinTerm__Group__24763);
            rule__JoinTerm__Group__2__Impl();

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
    // $ANTLR end "rule__JoinTerm__Group__2"


    // $ANTLR start "rule__JoinTerm__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2296:1: rule__JoinTerm__Group__2__Impl : ( ( rule__JoinTerm__GroupingAssignment_2 )? ) ;
    public final void rule__JoinTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2300:1: ( ( ( rule__JoinTerm__GroupingAssignment_2 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2301:1: ( ( rule__JoinTerm__GroupingAssignment_2 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2301:1: ( ( rule__JoinTerm__GroupingAssignment_2 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2302:1: ( rule__JoinTerm__GroupingAssignment_2 )?
            {
             before(grammarAccess.getJoinTermAccess().getGroupingAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2303:1: ( rule__JoinTerm__GroupingAssignment_2 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==39) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2303:2: rule__JoinTerm__GroupingAssignment_2
                    {
                    pushFollow(FOLLOW_rule__JoinTerm__GroupingAssignment_2_in_rule__JoinTerm__Group__2__Impl4790);
                    rule__JoinTerm__GroupingAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getJoinTermAccess().getGroupingAssignment_2()); 

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
    // $ANTLR end "rule__JoinTerm__Group__2__Impl"


    // $ANTLR start "rule__SummarizeModelDefinition__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2319:1: rule__SummarizeModelDefinition__Group__0 : rule__SummarizeModelDefinition__Group__0__Impl rule__SummarizeModelDefinition__Group__1 ;
    public final void rule__SummarizeModelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2323:1: ( rule__SummarizeModelDefinition__Group__0__Impl rule__SummarizeModelDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2324:2: rule__SummarizeModelDefinition__Group__0__Impl rule__SummarizeModelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__0__Impl_in_rule__SummarizeModelDefinition__Group__04827);
            rule__SummarizeModelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__1_in_rule__SummarizeModelDefinition__Group__04830);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2331:1: rule__SummarizeModelDefinition__Group__0__Impl : ( 'summarized' ) ;
    public final void rule__SummarizeModelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2335:1: ( ( 'summarized' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2336:1: ( 'summarized' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2336:1: ( 'summarized' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2337:1: 'summarized'
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getSummarizedKeyword_0()); 
            match(input,15,FOLLOW_15_in_rule__SummarizeModelDefinition__Group__0__Impl4858); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2350:1: rule__SummarizeModelDefinition__Group__1 : rule__SummarizeModelDefinition__Group__1__Impl rule__SummarizeModelDefinition__Group__2 ;
    public final void rule__SummarizeModelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2354:1: ( rule__SummarizeModelDefinition__Group__1__Impl rule__SummarizeModelDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2355:2: rule__SummarizeModelDefinition__Group__1__Impl rule__SummarizeModelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__1__Impl_in_rule__SummarizeModelDefinition__Group__14889);
            rule__SummarizeModelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__2_in_rule__SummarizeModelDefinition__Group__14892);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2362:1: rule__SummarizeModelDefinition__Group__1__Impl : ( ( rule__SummarizeModelDefinition__NameAssignment_1 ) ) ;
    public final void rule__SummarizeModelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2366:1: ( ( ( rule__SummarizeModelDefinition__NameAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2367:1: ( ( rule__SummarizeModelDefinition__NameAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2367:1: ( ( rule__SummarizeModelDefinition__NameAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2368:1: ( rule__SummarizeModelDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getNameAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2369:1: ( rule__SummarizeModelDefinition__NameAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2369:2: rule__SummarizeModelDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__NameAssignment_1_in_rule__SummarizeModelDefinition__Group__1__Impl4919);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2379:1: rule__SummarizeModelDefinition__Group__2 : rule__SummarizeModelDefinition__Group__2__Impl rule__SummarizeModelDefinition__Group__3 ;
    public final void rule__SummarizeModelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2383:1: ( rule__SummarizeModelDefinition__Group__2__Impl rule__SummarizeModelDefinition__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2384:2: rule__SummarizeModelDefinition__Group__2__Impl rule__SummarizeModelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__2__Impl_in_rule__SummarizeModelDefinition__Group__24949);
            rule__SummarizeModelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__3_in_rule__SummarizeModelDefinition__Group__24952);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2391:1: rule__SummarizeModelDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__SummarizeModelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2395:1: ( ( '=' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2396:1: ( '=' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2396:1: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2397:1: '='
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getEqualsSignKeyword_2()); 
            match(input,30,FOLLOW_30_in_rule__SummarizeModelDefinition__Group__2__Impl4980); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2410:1: rule__SummarizeModelDefinition__Group__3 : rule__SummarizeModelDefinition__Group__3__Impl ;
    public final void rule__SummarizeModelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2414:1: ( rule__SummarizeModelDefinition__Group__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2415:2: rule__SummarizeModelDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__3__Impl_in_rule__SummarizeModelDefinition__Group__35011);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2421:1: rule__SummarizeModelDefinition__Group__3__Impl : ( ( rule__SummarizeModelDefinition__RhsAssignment_3 ) ) ;
    public final void rule__SummarizeModelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2425:1: ( ( ( rule__SummarizeModelDefinition__RhsAssignment_3 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2426:1: ( ( rule__SummarizeModelDefinition__RhsAssignment_3 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2426:1: ( ( rule__SummarizeModelDefinition__RhsAssignment_3 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2427:1: ( rule__SummarizeModelDefinition__RhsAssignment_3 )
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getRhsAssignment_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2428:1: ( rule__SummarizeModelDefinition__RhsAssignment_3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2428:2: rule__SummarizeModelDefinition__RhsAssignment_3
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__RhsAssignment_3_in_rule__SummarizeModelDefinition__Group__3__Impl5038);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2446:1: rule__SummarizeExpression__Group__0 : rule__SummarizeExpression__Group__0__Impl rule__SummarizeExpression__Group__1 ;
    public final void rule__SummarizeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2450:1: ( rule__SummarizeExpression__Group__0__Impl rule__SummarizeExpression__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2451:2: rule__SummarizeExpression__Group__0__Impl rule__SummarizeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group__0__Impl_in_rule__SummarizeExpression__Group__05076);
            rule__SummarizeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeExpression__Group__1_in_rule__SummarizeExpression__Group__05079);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2458:1: rule__SummarizeExpression__Group__0__Impl : ( ( rule__SummarizeExpression__TermsAssignment_0 ) ) ;
    public final void rule__SummarizeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2462:1: ( ( ( rule__SummarizeExpression__TermsAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2463:1: ( ( rule__SummarizeExpression__TermsAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2463:1: ( ( rule__SummarizeExpression__TermsAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2464:1: ( rule__SummarizeExpression__TermsAssignment_0 )
            {
             before(grammarAccess.getSummarizeExpressionAccess().getTermsAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2465:1: ( rule__SummarizeExpression__TermsAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2465:2: rule__SummarizeExpression__TermsAssignment_0
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__TermsAssignment_0_in_rule__SummarizeExpression__Group__0__Impl5106);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2475:1: rule__SummarizeExpression__Group__1 : rule__SummarizeExpression__Group__1__Impl ;
    public final void rule__SummarizeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2479:1: ( rule__SummarizeExpression__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2480:2: rule__SummarizeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group__1__Impl_in_rule__SummarizeExpression__Group__15136);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2486:1: rule__SummarizeExpression__Group__1__Impl : ( ( rule__SummarizeExpression__Group_1__0 )* ) ;
    public final void rule__SummarizeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2490:1: ( ( ( rule__SummarizeExpression__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2491:1: ( ( rule__SummarizeExpression__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2491:1: ( ( rule__SummarizeExpression__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2492:1: ( rule__SummarizeExpression__Group_1__0 )*
            {
             before(grammarAccess.getSummarizeExpressionAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2493:1: ( rule__SummarizeExpression__Group_1__0 )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==31) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2493:2: rule__SummarizeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SummarizeExpression__Group_1__0_in_rule__SummarizeExpression__Group__1__Impl5163);
            	    rule__SummarizeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2507:1: rule__SummarizeExpression__Group_1__0 : rule__SummarizeExpression__Group_1__0__Impl rule__SummarizeExpression__Group_1__1 ;
    public final void rule__SummarizeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2511:1: ( rule__SummarizeExpression__Group_1__0__Impl rule__SummarizeExpression__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2512:2: rule__SummarizeExpression__Group_1__0__Impl rule__SummarizeExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group_1__0__Impl_in_rule__SummarizeExpression__Group_1__05198);
            rule__SummarizeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeExpression__Group_1__1_in_rule__SummarizeExpression__Group_1__05201);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2519:1: rule__SummarizeExpression__Group_1__0__Impl : ( '+' ) ;
    public final void rule__SummarizeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2523:1: ( ( '+' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2524:1: ( '+' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2524:1: ( '+' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2525:1: '+'
            {
             before(grammarAccess.getSummarizeExpressionAccess().getPlusSignKeyword_1_0()); 
            match(input,31,FOLLOW_31_in_rule__SummarizeExpression__Group_1__0__Impl5229); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2538:1: rule__SummarizeExpression__Group_1__1 : rule__SummarizeExpression__Group_1__1__Impl ;
    public final void rule__SummarizeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2542:1: ( rule__SummarizeExpression__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2543:2: rule__SummarizeExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group_1__1__Impl_in_rule__SummarizeExpression__Group_1__15260);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2549:1: rule__SummarizeExpression__Group_1__1__Impl : ( ( rule__SummarizeExpression__TermsAssignment_1_1 ) ) ;
    public final void rule__SummarizeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2553:1: ( ( ( rule__SummarizeExpression__TermsAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2554:1: ( ( rule__SummarizeExpression__TermsAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2554:1: ( ( rule__SummarizeExpression__TermsAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2555:1: ( rule__SummarizeExpression__TermsAssignment_1_1 )
            {
             before(grammarAccess.getSummarizeExpressionAccess().getTermsAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2556:1: ( rule__SummarizeExpression__TermsAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2556:2: rule__SummarizeExpression__TermsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__TermsAssignment_1_1_in_rule__SummarizeExpression__Group_1__1__Impl5287);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2570:1: rule__SummarizeTerm__Group__0 : rule__SummarizeTerm__Group__0__Impl rule__SummarizeTerm__Group__1 ;
    public final void rule__SummarizeTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2574:1: ( rule__SummarizeTerm__Group__0__Impl rule__SummarizeTerm__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2575:2: rule__SummarizeTerm__Group__0__Impl rule__SummarizeTerm__Group__1
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__Group__0__Impl_in_rule__SummarizeTerm__Group__05321);
            rule__SummarizeTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeTerm__Group__1_in_rule__SummarizeTerm__Group__05324);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2582:1: rule__SummarizeTerm__Group__0__Impl : ( ( rule__SummarizeTerm__ReferenceAssignment_0 ) ) ;
    public final void rule__SummarizeTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2586:1: ( ( ( rule__SummarizeTerm__ReferenceAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2587:1: ( ( rule__SummarizeTerm__ReferenceAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2587:1: ( ( rule__SummarizeTerm__ReferenceAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2588:1: ( rule__SummarizeTerm__ReferenceAssignment_0 )
            {
             before(grammarAccess.getSummarizeTermAccess().getReferenceAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2589:1: ( rule__SummarizeTerm__ReferenceAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2589:2: rule__SummarizeTerm__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__ReferenceAssignment_0_in_rule__SummarizeTerm__Group__0__Impl5351);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2599:1: rule__SummarizeTerm__Group__1 : rule__SummarizeTerm__Group__1__Impl rule__SummarizeTerm__Group__2 ;
    public final void rule__SummarizeTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2603:1: ( rule__SummarizeTerm__Group__1__Impl rule__SummarizeTerm__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2604:2: rule__SummarizeTerm__Group__1__Impl rule__SummarizeTerm__Group__2
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__Group__1__Impl_in_rule__SummarizeTerm__Group__15381);
            rule__SummarizeTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeTerm__Group__2_in_rule__SummarizeTerm__Group__15384);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2611:1: rule__SummarizeTerm__Group__1__Impl : ( ( rule__SummarizeTerm__FoldingAssignment_1 ) ) ;
    public final void rule__SummarizeTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2615:1: ( ( ( rule__SummarizeTerm__FoldingAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2616:1: ( ( rule__SummarizeTerm__FoldingAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2616:1: ( ( rule__SummarizeTerm__FoldingAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2617:1: ( rule__SummarizeTerm__FoldingAssignment_1 )
            {
             before(grammarAccess.getSummarizeTermAccess().getFoldingAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2618:1: ( rule__SummarizeTerm__FoldingAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2618:2: rule__SummarizeTerm__FoldingAssignment_1
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__FoldingAssignment_1_in_rule__SummarizeTerm__Group__1__Impl5411);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2628:1: rule__SummarizeTerm__Group__2 : rule__SummarizeTerm__Group__2__Impl ;
    public final void rule__SummarizeTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2632:1: ( rule__SummarizeTerm__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2633:2: rule__SummarizeTerm__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__Group__2__Impl_in_rule__SummarizeTerm__Group__25441);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2639:1: rule__SummarizeTerm__Group__2__Impl : ( ( rule__SummarizeTerm__GroupingAssignment_2 )? ) ;
    public final void rule__SummarizeTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2643:1: ( ( ( rule__SummarizeTerm__GroupingAssignment_2 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2644:1: ( ( rule__SummarizeTerm__GroupingAssignment_2 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2644:1: ( ( rule__SummarizeTerm__GroupingAssignment_2 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2645:1: ( rule__SummarizeTerm__GroupingAssignment_2 )?
            {
             before(grammarAccess.getSummarizeTermAccess().getGroupingAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2646:1: ( rule__SummarizeTerm__GroupingAssignment_2 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==39) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2646:2: rule__SummarizeTerm__GroupingAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SummarizeTerm__GroupingAssignment_2_in_rule__SummarizeTerm__Group__2__Impl5468);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2662:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2666:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2667:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05505);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05508);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2674:1: rule__Attribute__Group__0__Impl : ( '@' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2678:1: ( ( '@' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2679:1: ( '@' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2679:1: ( '@' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2680:1: '@'
            {
             before(grammarAccess.getAttributeAccess().getCommercialAtKeyword_0()); 
            match(input,35,FOLLOW_35_in_rule__Attribute__Group__0__Impl5536); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2693:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2697:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2698:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15567);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15570);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2705:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2709:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2710:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2710:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2711:1: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2712:1: ( rule__Attribute__NameAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2712:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl5597);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2722:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2726:1: ( rule__Attribute__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2727:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25627);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2733:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2737:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2738:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2738:1: ( ( rule__Attribute__Group_2__0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2739:1: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2740:1: ( rule__Attribute__Group_2__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==36) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2740:2: rule__Attribute__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_2__0_in_rule__Attribute__Group__2__Impl5654);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2756:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2760:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2761:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__0__Impl_in_rule__Attribute__Group_2__05691);
            rule__Attribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_2__1_in_rule__Attribute__Group_2__05694);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2768:1: rule__Attribute__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2772:1: ( ( '(' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2773:1: ( '(' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2773:1: ( '(' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2774:1: '('
            {
             before(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,36,FOLLOW_36_in_rule__Attribute__Group_2__0__Impl5722); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2787:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2791:1: ( rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2792:2: rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__1__Impl_in_rule__Attribute__Group_2__15753);
            rule__Attribute__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_2__2_in_rule__Attribute__Group_2__15756);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2799:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__Group_2_1__0 )? ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2803:1: ( ( ( rule__Attribute__Group_2_1__0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2804:1: ( ( rule__Attribute__Group_2_1__0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2804:1: ( ( rule__Attribute__Group_2_1__0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2805:1: ( rule__Attribute__Group_2_1__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2806:1: ( rule__Attribute__Group_2_1__0 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==RULE_NAME_TOKEN||(LA23_0>=13 && LA23_0<=15)) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2806:2: rule__Attribute__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_2_1__0_in_rule__Attribute__Group_2__1__Impl5783);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2816:1: rule__Attribute__Group_2__2 : rule__Attribute__Group_2__2__Impl ;
    public final void rule__Attribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2820:1: ( rule__Attribute__Group_2__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2821:2: rule__Attribute__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__2__Impl_in_rule__Attribute__Group_2__25814);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2827:1: rule__Attribute__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Attribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2831:1: ( ( ')' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2832:1: ( ')' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2832:1: ( ')' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2833:1: ')'
            {
             before(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_2_2()); 
            match(input,37,FOLLOW_37_in_rule__Attribute__Group_2__2__Impl5842); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2852:1: rule__Attribute__Group_2_1__0 : rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 ;
    public final void rule__Attribute__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2856:1: ( rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2857:2: rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2_1__0__Impl_in_rule__Attribute__Group_2_1__05879);
            rule__Attribute__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_2_1__1_in_rule__Attribute__Group_2_1__05882);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2864:1: rule__Attribute__Group_2_1__0__Impl : ( ( rule__Attribute__ElementsAssignment_2_1_0 ) ) ;
    public final void rule__Attribute__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2868:1: ( ( ( rule__Attribute__ElementsAssignment_2_1_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2869:1: ( ( rule__Attribute__ElementsAssignment_2_1_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2869:1: ( ( rule__Attribute__ElementsAssignment_2_1_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2870:1: ( rule__Attribute__ElementsAssignment_2_1_0 )
            {
             before(grammarAccess.getAttributeAccess().getElementsAssignment_2_1_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2871:1: ( rule__Attribute__ElementsAssignment_2_1_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2871:2: rule__Attribute__ElementsAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__Attribute__ElementsAssignment_2_1_0_in_rule__Attribute__Group_2_1__0__Impl5909);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2881:1: rule__Attribute__Group_2_1__1 : rule__Attribute__Group_2_1__1__Impl ;
    public final void rule__Attribute__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2885:1: ( rule__Attribute__Group_2_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2886:2: rule__Attribute__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2_1__1__Impl_in_rule__Attribute__Group_2_1__15939);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2892:1: rule__Attribute__Group_2_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__Attribute__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2896:1: ( ( ( ',' )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2897:1: ( ( ',' )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2897:1: ( ( ',' )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2898:1: ( ',' )?
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_2_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2899:1: ( ',' )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==38) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2900:2: ','
                    {
                    match(input,38,FOLLOW_38_in_rule__Attribute__Group_2_1__1__Impl5968); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2915:1: rule__AttributeElementList__Group__0 : rule__AttributeElementList__Group__0__Impl rule__AttributeElementList__Group__1 ;
    public final void rule__AttributeElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2919:1: ( rule__AttributeElementList__Group__0__Impl rule__AttributeElementList__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2920:2: rule__AttributeElementList__Group__0__Impl rule__AttributeElementList__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group__0__Impl_in_rule__AttributeElementList__Group__06005);
            rule__AttributeElementList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElementList__Group__1_in_rule__AttributeElementList__Group__06008);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2927:1: rule__AttributeElementList__Group__0__Impl : ( ( rule__AttributeElementList__ElementsAssignment_0 ) ) ;
    public final void rule__AttributeElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2931:1: ( ( ( rule__AttributeElementList__ElementsAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2932:1: ( ( rule__AttributeElementList__ElementsAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2932:1: ( ( rule__AttributeElementList__ElementsAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2933:1: ( rule__AttributeElementList__ElementsAssignment_0 )
            {
             before(grammarAccess.getAttributeElementListAccess().getElementsAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2934:1: ( rule__AttributeElementList__ElementsAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2934:2: rule__AttributeElementList__ElementsAssignment_0
            {
            pushFollow(FOLLOW_rule__AttributeElementList__ElementsAssignment_0_in_rule__AttributeElementList__Group__0__Impl6035);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2944:1: rule__AttributeElementList__Group__1 : rule__AttributeElementList__Group__1__Impl ;
    public final void rule__AttributeElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2948:1: ( rule__AttributeElementList__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2949:2: rule__AttributeElementList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group__1__Impl_in_rule__AttributeElementList__Group__16065);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2955:1: rule__AttributeElementList__Group__1__Impl : ( ( rule__AttributeElementList__Group_1__0 )* ) ;
    public final void rule__AttributeElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2959:1: ( ( ( rule__AttributeElementList__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2960:1: ( ( rule__AttributeElementList__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2960:1: ( ( rule__AttributeElementList__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2961:1: ( rule__AttributeElementList__Group_1__0 )*
            {
             before(grammarAccess.getAttributeElementListAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2962:1: ( rule__AttributeElementList__Group_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==38) ) {
                    int LA25_2 = input.LA(2);

                    if ( (LA25_2==RULE_NAME_TOKEN||(LA25_2>=13 && LA25_2<=15)) ) {
                        alt25=1;
                    }


                }


                switch (alt25) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2962:2: rule__AttributeElementList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AttributeElementList__Group_1__0_in_rule__AttributeElementList__Group__1__Impl6092);
            	    rule__AttributeElementList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop25;
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2976:1: rule__AttributeElementList__Group_1__0 : rule__AttributeElementList__Group_1__0__Impl rule__AttributeElementList__Group_1__1 ;
    public final void rule__AttributeElementList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2980:1: ( rule__AttributeElementList__Group_1__0__Impl rule__AttributeElementList__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2981:2: rule__AttributeElementList__Group_1__0__Impl rule__AttributeElementList__Group_1__1
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group_1__0__Impl_in_rule__AttributeElementList__Group_1__06127);
            rule__AttributeElementList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElementList__Group_1__1_in_rule__AttributeElementList__Group_1__06130);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2988:1: rule__AttributeElementList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AttributeElementList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2992:1: ( ( ',' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2993:1: ( ',' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2993:1: ( ',' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2994:1: ','
            {
             before(grammarAccess.getAttributeElementListAccess().getCommaKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__AttributeElementList__Group_1__0__Impl6158); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3007:1: rule__AttributeElementList__Group_1__1 : rule__AttributeElementList__Group_1__1__Impl ;
    public final void rule__AttributeElementList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3011:1: ( rule__AttributeElementList__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3012:2: rule__AttributeElementList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group_1__1__Impl_in_rule__AttributeElementList__Group_1__16189);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3018:1: rule__AttributeElementList__Group_1__1__Impl : ( ( rule__AttributeElementList__ElementsAssignment_1_1 ) ) ;
    public final void rule__AttributeElementList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3022:1: ( ( ( rule__AttributeElementList__ElementsAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3023:1: ( ( rule__AttributeElementList__ElementsAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3023:1: ( ( rule__AttributeElementList__ElementsAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3024:1: ( rule__AttributeElementList__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getAttributeElementListAccess().getElementsAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3025:1: ( rule__AttributeElementList__ElementsAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3025:2: rule__AttributeElementList__ElementsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AttributeElementList__ElementsAssignment_1_1_in_rule__AttributeElementList__Group_1__1__Impl6216);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3039:1: rule__AttributeElement__Group__0 : rule__AttributeElement__Group__0__Impl rule__AttributeElement__Group__1 ;
    public final void rule__AttributeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3043:1: ( rule__AttributeElement__Group__0__Impl rule__AttributeElement__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3044:2: rule__AttributeElement__Group__0__Impl rule__AttributeElement__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeElement__Group__0__Impl_in_rule__AttributeElement__Group__06250);
            rule__AttributeElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElement__Group__1_in_rule__AttributeElement__Group__06253);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3051:1: rule__AttributeElement__Group__0__Impl : ( ( rule__AttributeElement__NameAssignment_0 ) ) ;
    public final void rule__AttributeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3055:1: ( ( ( rule__AttributeElement__NameAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3056:1: ( ( rule__AttributeElement__NameAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3056:1: ( ( rule__AttributeElement__NameAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3057:1: ( rule__AttributeElement__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeElementAccess().getNameAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3058:1: ( rule__AttributeElement__NameAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3058:2: rule__AttributeElement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AttributeElement__NameAssignment_0_in_rule__AttributeElement__Group__0__Impl6280);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3068:1: rule__AttributeElement__Group__1 : rule__AttributeElement__Group__1__Impl rule__AttributeElement__Group__2 ;
    public final void rule__AttributeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3072:1: ( rule__AttributeElement__Group__1__Impl rule__AttributeElement__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3073:2: rule__AttributeElement__Group__1__Impl rule__AttributeElement__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeElement__Group__1__Impl_in_rule__AttributeElement__Group__16310);
            rule__AttributeElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElement__Group__2_in_rule__AttributeElement__Group__16313);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3080:1: rule__AttributeElement__Group__1__Impl : ( '=' ) ;
    public final void rule__AttributeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3084:1: ( ( '=' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3085:1: ( '=' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3085:1: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3086:1: '='
            {
             before(grammarAccess.getAttributeElementAccess().getEqualsSignKeyword_1()); 
            match(input,30,FOLLOW_30_in_rule__AttributeElement__Group__1__Impl6341); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3099:1: rule__AttributeElement__Group__2 : rule__AttributeElement__Group__2__Impl ;
    public final void rule__AttributeElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3103:1: ( rule__AttributeElement__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3104:2: rule__AttributeElement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeElement__Group__2__Impl_in_rule__AttributeElement__Group__26372);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3110:1: rule__AttributeElement__Group__2__Impl : ( ( rule__AttributeElement__ValueAssignment_2 ) ) ;
    public final void rule__AttributeElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3114:1: ( ( ( rule__AttributeElement__ValueAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3115:1: ( ( rule__AttributeElement__ValueAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3115:1: ( ( rule__AttributeElement__ValueAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3116:1: ( rule__AttributeElement__ValueAssignment_2 )
            {
             before(grammarAccess.getAttributeElementAccess().getValueAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3117:1: ( rule__AttributeElement__ValueAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3117:2: rule__AttributeElement__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__AttributeElement__ValueAssignment_2_in_rule__AttributeElement__Group__2__Impl6399);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3133:1: rule__AttributeValueArray__Group__0 : rule__AttributeValueArray__Group__0__Impl rule__AttributeValueArray__Group__1 ;
    public final void rule__AttributeValueArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3137:1: ( rule__AttributeValueArray__Group__0__Impl rule__AttributeValueArray__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3138:2: rule__AttributeValueArray__Group__0__Impl rule__AttributeValueArray__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__0__Impl_in_rule__AttributeValueArray__Group__06435);
            rule__AttributeValueArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group__1_in_rule__AttributeValueArray__Group__06438);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3145:1: rule__AttributeValueArray__Group__0__Impl : ( '{' ) ;
    public final void rule__AttributeValueArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3149:1: ( ( '{' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3150:1: ( '{' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3150:1: ( '{' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3151:1: '{'
            {
             before(grammarAccess.getAttributeValueArrayAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__AttributeValueArray__Group__0__Impl6466); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3164:1: rule__AttributeValueArray__Group__1 : rule__AttributeValueArray__Group__1__Impl rule__AttributeValueArray__Group__2 ;
    public final void rule__AttributeValueArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3168:1: ( rule__AttributeValueArray__Group__1__Impl rule__AttributeValueArray__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3169:2: rule__AttributeValueArray__Group__1__Impl rule__AttributeValueArray__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__1__Impl_in_rule__AttributeValueArray__Group__16497);
            rule__AttributeValueArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group__2_in_rule__AttributeValueArray__Group__16500);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3176:1: rule__AttributeValueArray__Group__1__Impl : ( ( rule__AttributeValueArray__ElementsAssignment_1 ) ) ;
    public final void rule__AttributeValueArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3180:1: ( ( ( rule__AttributeValueArray__ElementsAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3181:1: ( ( rule__AttributeValueArray__ElementsAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3181:1: ( ( rule__AttributeValueArray__ElementsAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3182:1: ( rule__AttributeValueArray__ElementsAssignment_1 )
            {
             before(grammarAccess.getAttributeValueArrayAccess().getElementsAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3183:1: ( rule__AttributeValueArray__ElementsAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3183:2: rule__AttributeValueArray__ElementsAssignment_1
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__ElementsAssignment_1_in_rule__AttributeValueArray__Group__1__Impl6527);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3193:1: rule__AttributeValueArray__Group__2 : rule__AttributeValueArray__Group__2__Impl rule__AttributeValueArray__Group__3 ;
    public final void rule__AttributeValueArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3197:1: ( rule__AttributeValueArray__Group__2__Impl rule__AttributeValueArray__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3198:2: rule__AttributeValueArray__Group__2__Impl rule__AttributeValueArray__Group__3
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__2__Impl_in_rule__AttributeValueArray__Group__26557);
            rule__AttributeValueArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group__3_in_rule__AttributeValueArray__Group__26560);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3205:1: rule__AttributeValueArray__Group__2__Impl : ( ( rule__AttributeValueArray__Group_2__0 )* ) ;
    public final void rule__AttributeValueArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3209:1: ( ( ( rule__AttributeValueArray__Group_2__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3210:1: ( ( rule__AttributeValueArray__Group_2__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3210:1: ( ( rule__AttributeValueArray__Group_2__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3211:1: ( rule__AttributeValueArray__Group_2__0 )*
            {
             before(grammarAccess.getAttributeValueArrayAccess().getGroup_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3212:1: ( rule__AttributeValueArray__Group_2__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==38) ) {
                    int LA26_1 = input.LA(2);

                    if ( ((LA26_1>=RULE_STRING && LA26_1<=RULE_DECIMAL)||(LA26_1>=13 && LA26_1<=15)||(LA26_1>=27 && LA26_1<=28)||LA26_1==32) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3212:2: rule__AttributeValueArray__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__AttributeValueArray__Group_2__0_in_rule__AttributeValueArray__Group__2__Impl6587);
            	    rule__AttributeValueArray__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3222:1: rule__AttributeValueArray__Group__3 : rule__AttributeValueArray__Group__3__Impl rule__AttributeValueArray__Group__4 ;
    public final void rule__AttributeValueArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3226:1: ( rule__AttributeValueArray__Group__3__Impl rule__AttributeValueArray__Group__4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3227:2: rule__AttributeValueArray__Group__3__Impl rule__AttributeValueArray__Group__4
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__3__Impl_in_rule__AttributeValueArray__Group__36618);
            rule__AttributeValueArray__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group__4_in_rule__AttributeValueArray__Group__36621);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3234:1: rule__AttributeValueArray__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__AttributeValueArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3238:1: ( ( ( ',' )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3239:1: ( ( ',' )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3239:1: ( ( ',' )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3240:1: ( ',' )?
            {
             before(grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3241:1: ( ',' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==38) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3242:2: ','
                    {
                    match(input,38,FOLLOW_38_in_rule__AttributeValueArray__Group__3__Impl6650); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3253:1: rule__AttributeValueArray__Group__4 : rule__AttributeValueArray__Group__4__Impl ;
    public final void rule__AttributeValueArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3257:1: ( rule__AttributeValueArray__Group__4__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3258:2: rule__AttributeValueArray__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__4__Impl_in_rule__AttributeValueArray__Group__46683);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3264:1: rule__AttributeValueArray__Group__4__Impl : ( '}' ) ;
    public final void rule__AttributeValueArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3268:1: ( ( '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3269:1: ( '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3269:1: ( '}' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3270:1: '}'
            {
             before(grammarAccess.getAttributeValueArrayAccess().getRightCurlyBracketKeyword_4()); 
            match(input,33,FOLLOW_33_in_rule__AttributeValueArray__Group__4__Impl6711); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3293:1: rule__AttributeValueArray__Group_2__0 : rule__AttributeValueArray__Group_2__0__Impl rule__AttributeValueArray__Group_2__1 ;
    public final void rule__AttributeValueArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3297:1: ( rule__AttributeValueArray__Group_2__0__Impl rule__AttributeValueArray__Group_2__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3298:2: rule__AttributeValueArray__Group_2__0__Impl rule__AttributeValueArray__Group_2__1
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group_2__0__Impl_in_rule__AttributeValueArray__Group_2__06752);
            rule__AttributeValueArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group_2__1_in_rule__AttributeValueArray__Group_2__06755);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3305:1: rule__AttributeValueArray__Group_2__0__Impl : ( ',' ) ;
    public final void rule__AttributeValueArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3309:1: ( ( ',' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3310:1: ( ',' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3310:1: ( ',' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3311:1: ','
            {
             before(grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__AttributeValueArray__Group_2__0__Impl6783); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3324:1: rule__AttributeValueArray__Group_2__1 : rule__AttributeValueArray__Group_2__1__Impl ;
    public final void rule__AttributeValueArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3328:1: ( rule__AttributeValueArray__Group_2__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3329:2: rule__AttributeValueArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group_2__1__Impl_in_rule__AttributeValueArray__Group_2__16814);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3335:1: rule__AttributeValueArray__Group_2__1__Impl : ( ( rule__AttributeValueArray__ElementsAssignment_2_1 ) ) ;
    public final void rule__AttributeValueArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3339:1: ( ( ( rule__AttributeValueArray__ElementsAssignment_2_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3340:1: ( ( rule__AttributeValueArray__ElementsAssignment_2_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3340:1: ( ( rule__AttributeValueArray__ElementsAssignment_2_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3341:1: ( rule__AttributeValueArray__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getAttributeValueArrayAccess().getElementsAssignment_2_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3342:1: ( rule__AttributeValueArray__ElementsAssignment_2_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3342:2: rule__AttributeValueArray__ElementsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__ElementsAssignment_2_1_in_rule__AttributeValueArray__Group_2__1__Impl6841);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3356:1: rule__Grouping__Group__0 : rule__Grouping__Group__0__Impl rule__Grouping__Group__1 ;
    public final void rule__Grouping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3360:1: ( rule__Grouping__Group__0__Impl rule__Grouping__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3361:2: rule__Grouping__Group__0__Impl rule__Grouping__Group__1
            {
            pushFollow(FOLLOW_rule__Grouping__Group__0__Impl_in_rule__Grouping__Group__06875);
            rule__Grouping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group__1_in_rule__Grouping__Group__06878);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3368:1: rule__Grouping__Group__0__Impl : ( '%' ) ;
    public final void rule__Grouping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3372:1: ( ( '%' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3373:1: ( '%' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3373:1: ( '%' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3374:1: '%'
            {
             before(grammarAccess.getGroupingAccess().getPercentSignKeyword_0()); 
            match(input,39,FOLLOW_39_in_rule__Grouping__Group__0__Impl6906); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3387:1: rule__Grouping__Group__1 : rule__Grouping__Group__1__Impl rule__Grouping__Group__2 ;
    public final void rule__Grouping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3391:1: ( rule__Grouping__Group__1__Impl rule__Grouping__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3392:2: rule__Grouping__Group__1__Impl rule__Grouping__Group__2
            {
            pushFollow(FOLLOW_rule__Grouping__Group__1__Impl_in_rule__Grouping__Group__16937);
            rule__Grouping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group__2_in_rule__Grouping__Group__16940);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3399:1: rule__Grouping__Group__1__Impl : ( ( rule__Grouping__NameAssignment_1 ) ) ;
    public final void rule__Grouping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3403:1: ( ( ( rule__Grouping__NameAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3404:1: ( ( rule__Grouping__NameAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3404:1: ( ( rule__Grouping__NameAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3405:1: ( rule__Grouping__NameAssignment_1 )
            {
             before(grammarAccess.getGroupingAccess().getNameAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3406:1: ( rule__Grouping__NameAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3406:2: rule__Grouping__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Grouping__NameAssignment_1_in_rule__Grouping__Group__1__Impl6967);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3416:1: rule__Grouping__Group__2 : rule__Grouping__Group__2__Impl ;
    public final void rule__Grouping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3420:1: ( rule__Grouping__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3421:2: rule__Grouping__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Grouping__Group__2__Impl_in_rule__Grouping__Group__26997);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3427:1: rule__Grouping__Group__2__Impl : ( ( rule__Grouping__Group_2__0 )* ) ;
    public final void rule__Grouping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3431:1: ( ( ( rule__Grouping__Group_2__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3432:1: ( ( rule__Grouping__Group_2__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3432:1: ( ( rule__Grouping__Group_2__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3433:1: ( rule__Grouping__Group_2__0 )*
            {
             before(grammarAccess.getGroupingAccess().getGroup_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3434:1: ( rule__Grouping__Group_2__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==38) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3434:2: rule__Grouping__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Grouping__Group_2__0_in_rule__Grouping__Group__2__Impl7024);
            	    rule__Grouping__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop28;
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3450:1: rule__Grouping__Group_2__0 : rule__Grouping__Group_2__0__Impl rule__Grouping__Group_2__1 ;
    public final void rule__Grouping__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3454:1: ( rule__Grouping__Group_2__0__Impl rule__Grouping__Group_2__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3455:2: rule__Grouping__Group_2__0__Impl rule__Grouping__Group_2__1
            {
            pushFollow(FOLLOW_rule__Grouping__Group_2__0__Impl_in_rule__Grouping__Group_2__07061);
            rule__Grouping__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group_2__1_in_rule__Grouping__Group_2__07064);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3462:1: rule__Grouping__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Grouping__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3466:1: ( ( ',' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3467:1: ( ',' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3467:1: ( ',' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3468:1: ','
            {
             before(grammarAccess.getGroupingAccess().getCommaKeyword_2_0()); 
            match(input,38,FOLLOW_38_in_rule__Grouping__Group_2__0__Impl7092); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3481:1: rule__Grouping__Group_2__1 : rule__Grouping__Group_2__1__Impl ;
    public final void rule__Grouping__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3485:1: ( rule__Grouping__Group_2__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3486:2: rule__Grouping__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Grouping__Group_2__1__Impl_in_rule__Grouping__Group_2__17123);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3492:1: rule__Grouping__Group_2__1__Impl : ( ( rule__Grouping__NameAssignment_2_1 ) ) ;
    public final void rule__Grouping__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3496:1: ( ( ( rule__Grouping__NameAssignment_2_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3497:1: ( ( rule__Grouping__NameAssignment_2_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3497:1: ( ( rule__Grouping__NameAssignment_2_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3498:1: ( rule__Grouping__NameAssignment_2_1 )
            {
             before(grammarAccess.getGroupingAccess().getNameAssignment_2_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3499:1: ( rule__Grouping__NameAssignment_2_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3499:2: rule__Grouping__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Grouping__NameAssignment_2_1_in_rule__Grouping__Group_2__1__Impl7150);
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


    // $ANTLR start "rule__ModelMapping__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3513:1: rule__ModelMapping__Group__0 : rule__ModelMapping__Group__0__Impl rule__ModelMapping__Group__1 ;
    public final void rule__ModelMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3517:1: ( rule__ModelMapping__Group__0__Impl rule__ModelMapping__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3518:2: rule__ModelMapping__Group__0__Impl rule__ModelMapping__Group__1
            {
            pushFollow(FOLLOW_rule__ModelMapping__Group__0__Impl_in_rule__ModelMapping__Group__07184);
            rule__ModelMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelMapping__Group__1_in_rule__ModelMapping__Group__07187);
            rule__ModelMapping__Group__1();

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
    // $ANTLR end "rule__ModelMapping__Group__0"


    // $ANTLR start "rule__ModelMapping__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3525:1: rule__ModelMapping__Group__0__Impl : ( '->' ) ;
    public final void rule__ModelMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3529:1: ( ( '->' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3530:1: ( '->' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3530:1: ( '->' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3531:1: '->'
            {
             before(grammarAccess.getModelMappingAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,11,FOLLOW_11_in_rule__ModelMapping__Group__0__Impl7215); 
             after(grammarAccess.getModelMappingAccess().getHyphenMinusGreaterThanSignKeyword_0()); 

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
    // $ANTLR end "rule__ModelMapping__Group__0__Impl"


    // $ANTLR start "rule__ModelMapping__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3544:1: rule__ModelMapping__Group__1 : rule__ModelMapping__Group__1__Impl rule__ModelMapping__Group__2 ;
    public final void rule__ModelMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3548:1: ( rule__ModelMapping__Group__1__Impl rule__ModelMapping__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3549:2: rule__ModelMapping__Group__1__Impl rule__ModelMapping__Group__2
            {
            pushFollow(FOLLOW_rule__ModelMapping__Group__1__Impl_in_rule__ModelMapping__Group__17246);
            rule__ModelMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelMapping__Group__2_in_rule__ModelMapping__Group__17249);
            rule__ModelMapping__Group__2();

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
    // $ANTLR end "rule__ModelMapping__Group__1"


    // $ANTLR start "rule__ModelMapping__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3556:1: rule__ModelMapping__Group__1__Impl : ( '{' ) ;
    public final void rule__ModelMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3560:1: ( ( '{' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3561:1: ( '{' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3561:1: ( '{' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3562:1: '{'
            {
             before(grammarAccess.getModelMappingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__ModelMapping__Group__1__Impl7277); 
             after(grammarAccess.getModelMappingAccess().getLeftCurlyBracketKeyword_1()); 

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
    // $ANTLR end "rule__ModelMapping__Group__1__Impl"


    // $ANTLR start "rule__ModelMapping__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3575:1: rule__ModelMapping__Group__2 : rule__ModelMapping__Group__2__Impl rule__ModelMapping__Group__3 ;
    public final void rule__ModelMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3579:1: ( rule__ModelMapping__Group__2__Impl rule__ModelMapping__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3580:2: rule__ModelMapping__Group__2__Impl rule__ModelMapping__Group__3
            {
            pushFollow(FOLLOW_rule__ModelMapping__Group__2__Impl_in_rule__ModelMapping__Group__27308);
            rule__ModelMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelMapping__Group__3_in_rule__ModelMapping__Group__27311);
            rule__ModelMapping__Group__3();

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
    // $ANTLR end "rule__ModelMapping__Group__2"


    // $ANTLR start "rule__ModelMapping__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3587:1: rule__ModelMapping__Group__2__Impl : ( ( ( rule__ModelMapping__MappingsAssignment_2 ) ) ( ( rule__ModelMapping__MappingsAssignment_2 )* ) ) ;
    public final void rule__ModelMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3591:1: ( ( ( ( rule__ModelMapping__MappingsAssignment_2 ) ) ( ( rule__ModelMapping__MappingsAssignment_2 )* ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3592:1: ( ( ( rule__ModelMapping__MappingsAssignment_2 ) ) ( ( rule__ModelMapping__MappingsAssignment_2 )* ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3592:1: ( ( ( rule__ModelMapping__MappingsAssignment_2 ) ) ( ( rule__ModelMapping__MappingsAssignment_2 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3593:1: ( ( rule__ModelMapping__MappingsAssignment_2 ) ) ( ( rule__ModelMapping__MappingsAssignment_2 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3593:1: ( ( rule__ModelMapping__MappingsAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3594:1: ( rule__ModelMapping__MappingsAssignment_2 )
            {
             before(grammarAccess.getModelMappingAccess().getMappingsAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3595:1: ( rule__ModelMapping__MappingsAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3595:2: rule__ModelMapping__MappingsAssignment_2
            {
            pushFollow(FOLLOW_rule__ModelMapping__MappingsAssignment_2_in_rule__ModelMapping__Group__2__Impl7340);
            rule__ModelMapping__MappingsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelMappingAccess().getMappingsAssignment_2()); 

            }

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3598:1: ( ( rule__ModelMapping__MappingsAssignment_2 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3599:1: ( rule__ModelMapping__MappingsAssignment_2 )*
            {
             before(grammarAccess.getModelMappingAccess().getMappingsAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3600:1: ( rule__ModelMapping__MappingsAssignment_2 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0>=RULE_STRING && LA29_0<=RULE_NAME_TOKEN)||(LA29_0>=13 && LA29_0<=15)||LA29_0==35) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3600:2: rule__ModelMapping__MappingsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ModelMapping__MappingsAssignment_2_in_rule__ModelMapping__Group__2__Impl7352);
            	    rule__ModelMapping__MappingsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

             after(grammarAccess.getModelMappingAccess().getMappingsAssignment_2()); 

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
    // $ANTLR end "rule__ModelMapping__Group__2__Impl"


    // $ANTLR start "rule__ModelMapping__Group__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3611:1: rule__ModelMapping__Group__3 : rule__ModelMapping__Group__3__Impl ;
    public final void rule__ModelMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3615:1: ( rule__ModelMapping__Group__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3616:2: rule__ModelMapping__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModelMapping__Group__3__Impl_in_rule__ModelMapping__Group__37385);
            rule__ModelMapping__Group__3__Impl();

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
    // $ANTLR end "rule__ModelMapping__Group__3"


    // $ANTLR start "rule__ModelMapping__Group__3__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3622:1: rule__ModelMapping__Group__3__Impl : ( '}' ) ;
    public final void rule__ModelMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3626:1: ( ( '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3627:1: ( '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3627:1: ( '}' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3628:1: '}'
            {
             before(grammarAccess.getModelMappingAccess().getRightCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__ModelMapping__Group__3__Impl7413); 
             after(grammarAccess.getModelMappingAccess().getRightCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__ModelMapping__Group__3__Impl"


    // $ANTLR start "rule__PropertyMapping__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3649:1: rule__PropertyMapping__Group__0 : rule__PropertyMapping__Group__0__Impl rule__PropertyMapping__Group__1 ;
    public final void rule__PropertyMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3653:1: ( rule__PropertyMapping__Group__0__Impl rule__PropertyMapping__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3654:2: rule__PropertyMapping__Group__0__Impl rule__PropertyMapping__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyMapping__Group__0__Impl_in_rule__PropertyMapping__Group__07452);
            rule__PropertyMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyMapping__Group__1_in_rule__PropertyMapping__Group__07455);
            rule__PropertyMapping__Group__1();

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
    // $ANTLR end "rule__PropertyMapping__Group__0"


    // $ANTLR start "rule__PropertyMapping__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3661:1: rule__PropertyMapping__Group__0__Impl : ( ( rule__PropertyMapping__DescriptionAssignment_0 )? ) ;
    public final void rule__PropertyMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3665:1: ( ( ( rule__PropertyMapping__DescriptionAssignment_0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3666:1: ( ( rule__PropertyMapping__DescriptionAssignment_0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3666:1: ( ( rule__PropertyMapping__DescriptionAssignment_0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3667:1: ( rule__PropertyMapping__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getPropertyMappingAccess().getDescriptionAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3668:1: ( rule__PropertyMapping__DescriptionAssignment_0 )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==RULE_STRING) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3668:2: rule__PropertyMapping__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PropertyMapping__DescriptionAssignment_0_in_rule__PropertyMapping__Group__0__Impl7482);
                    rule__PropertyMapping__DescriptionAssignment_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyMappingAccess().getDescriptionAssignment_0()); 

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
    // $ANTLR end "rule__PropertyMapping__Group__0__Impl"


    // $ANTLR start "rule__PropertyMapping__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3678:1: rule__PropertyMapping__Group__1 : rule__PropertyMapping__Group__1__Impl rule__PropertyMapping__Group__2 ;
    public final void rule__PropertyMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3682:1: ( rule__PropertyMapping__Group__1__Impl rule__PropertyMapping__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3683:2: rule__PropertyMapping__Group__1__Impl rule__PropertyMapping__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyMapping__Group__1__Impl_in_rule__PropertyMapping__Group__17513);
            rule__PropertyMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyMapping__Group__2_in_rule__PropertyMapping__Group__17516);
            rule__PropertyMapping__Group__2();

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
    // $ANTLR end "rule__PropertyMapping__Group__1"


    // $ANTLR start "rule__PropertyMapping__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3690:1: rule__PropertyMapping__Group__1__Impl : ( ( rule__PropertyMapping__AttributesAssignment_1 )? ) ;
    public final void rule__PropertyMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3694:1: ( ( ( rule__PropertyMapping__AttributesAssignment_1 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3695:1: ( ( rule__PropertyMapping__AttributesAssignment_1 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3695:1: ( ( rule__PropertyMapping__AttributesAssignment_1 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3696:1: ( rule__PropertyMapping__AttributesAssignment_1 )?
            {
             before(grammarAccess.getPropertyMappingAccess().getAttributesAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3697:1: ( rule__PropertyMapping__AttributesAssignment_1 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==35) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3697:2: rule__PropertyMapping__AttributesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PropertyMapping__AttributesAssignment_1_in_rule__PropertyMapping__Group__1__Impl7543);
                    rule__PropertyMapping__AttributesAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPropertyMappingAccess().getAttributesAssignment_1()); 

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
    // $ANTLR end "rule__PropertyMapping__Group__1__Impl"


    // $ANTLR start "rule__PropertyMapping__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3707:1: rule__PropertyMapping__Group__2 : rule__PropertyMapping__Group__2__Impl rule__PropertyMapping__Group__3 ;
    public final void rule__PropertyMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3711:1: ( rule__PropertyMapping__Group__2__Impl rule__PropertyMapping__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3712:2: rule__PropertyMapping__Group__2__Impl rule__PropertyMapping__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyMapping__Group__2__Impl_in_rule__PropertyMapping__Group__27574);
            rule__PropertyMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyMapping__Group__3_in_rule__PropertyMapping__Group__27577);
            rule__PropertyMapping__Group__3();

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
    // $ANTLR end "rule__PropertyMapping__Group__2"


    // $ANTLR start "rule__PropertyMapping__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3719:1: rule__PropertyMapping__Group__2__Impl : ( ( rule__PropertyMapping__FromAssignment_2 ) ) ;
    public final void rule__PropertyMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3723:1: ( ( ( rule__PropertyMapping__FromAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3724:1: ( ( rule__PropertyMapping__FromAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3724:1: ( ( rule__PropertyMapping__FromAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3725:1: ( rule__PropertyMapping__FromAssignment_2 )
            {
             before(grammarAccess.getPropertyMappingAccess().getFromAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3726:1: ( rule__PropertyMapping__FromAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3726:2: rule__PropertyMapping__FromAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyMapping__FromAssignment_2_in_rule__PropertyMapping__Group__2__Impl7604);
            rule__PropertyMapping__FromAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyMappingAccess().getFromAssignment_2()); 

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
    // $ANTLR end "rule__PropertyMapping__Group__2__Impl"


    // $ANTLR start "rule__PropertyMapping__Group__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3736:1: rule__PropertyMapping__Group__3 : rule__PropertyMapping__Group__3__Impl rule__PropertyMapping__Group__4 ;
    public final void rule__PropertyMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3740:1: ( rule__PropertyMapping__Group__3__Impl rule__PropertyMapping__Group__4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3741:2: rule__PropertyMapping__Group__3__Impl rule__PropertyMapping__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyMapping__Group__3__Impl_in_rule__PropertyMapping__Group__37634);
            rule__PropertyMapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyMapping__Group__4_in_rule__PropertyMapping__Group__37637);
            rule__PropertyMapping__Group__4();

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
    // $ANTLR end "rule__PropertyMapping__Group__3"


    // $ANTLR start "rule__PropertyMapping__Group__3__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3748:1: rule__PropertyMapping__Group__3__Impl : ( '->' ) ;
    public final void rule__PropertyMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3752:1: ( ( '->' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3753:1: ( '->' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3753:1: ( '->' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3754:1: '->'
            {
             before(grammarAccess.getPropertyMappingAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,11,FOLLOW_11_in_rule__PropertyMapping__Group__3__Impl7665); 
             after(grammarAccess.getPropertyMappingAccess().getHyphenMinusGreaterThanSignKeyword_3()); 

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
    // $ANTLR end "rule__PropertyMapping__Group__3__Impl"


    // $ANTLR start "rule__PropertyMapping__Group__4"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3767:1: rule__PropertyMapping__Group__4 : rule__PropertyMapping__Group__4__Impl rule__PropertyMapping__Group__5 ;
    public final void rule__PropertyMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3771:1: ( rule__PropertyMapping__Group__4__Impl rule__PropertyMapping__Group__5 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3772:2: rule__PropertyMapping__Group__4__Impl rule__PropertyMapping__Group__5
            {
            pushFollow(FOLLOW_rule__PropertyMapping__Group__4__Impl_in_rule__PropertyMapping__Group__47696);
            rule__PropertyMapping__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyMapping__Group__5_in_rule__PropertyMapping__Group__47699);
            rule__PropertyMapping__Group__5();

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
    // $ANTLR end "rule__PropertyMapping__Group__4"


    // $ANTLR start "rule__PropertyMapping__Group__4__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3779:1: rule__PropertyMapping__Group__4__Impl : ( ( rule__PropertyMapping__NameAssignment_4 ) ) ;
    public final void rule__PropertyMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3783:1: ( ( ( rule__PropertyMapping__NameAssignment_4 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3784:1: ( ( rule__PropertyMapping__NameAssignment_4 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3784:1: ( ( rule__PropertyMapping__NameAssignment_4 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3785:1: ( rule__PropertyMapping__NameAssignment_4 )
            {
             before(grammarAccess.getPropertyMappingAccess().getNameAssignment_4()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3786:1: ( rule__PropertyMapping__NameAssignment_4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3786:2: rule__PropertyMapping__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__PropertyMapping__NameAssignment_4_in_rule__PropertyMapping__Group__4__Impl7726);
            rule__PropertyMapping__NameAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPropertyMappingAccess().getNameAssignment_4()); 

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
    // $ANTLR end "rule__PropertyMapping__Group__4__Impl"


    // $ANTLR start "rule__PropertyMapping__Group__5"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3796:1: rule__PropertyMapping__Group__5 : rule__PropertyMapping__Group__5__Impl ;
    public final void rule__PropertyMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3800:1: ( rule__PropertyMapping__Group__5__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3801:2: rule__PropertyMapping__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PropertyMapping__Group__5__Impl_in_rule__PropertyMapping__Group__57756);
            rule__PropertyMapping__Group__5__Impl();

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
    // $ANTLR end "rule__PropertyMapping__Group__5"


    // $ANTLR start "rule__PropertyMapping__Group__5__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3807:1: rule__PropertyMapping__Group__5__Impl : ( ';' ) ;
    public final void rule__PropertyMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3811:1: ( ( ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3812:1: ( ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3812:1: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3813:1: ';'
            {
             before(grammarAccess.getPropertyMappingAccess().getSemicolonKeyword_5()); 
            match(input,29,FOLLOW_29_in_rule__PropertyMapping__Group__5__Impl7784); 
             after(grammarAccess.getPropertyMappingAccess().getSemicolonKeyword_5()); 

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
    // $ANTLR end "rule__PropertyMapping__Group__5__Impl"


    // $ANTLR start "rule__ModelFolding__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3838:1: rule__ModelFolding__Group__0 : rule__ModelFolding__Group__0__Impl rule__ModelFolding__Group__1 ;
    public final void rule__ModelFolding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3842:1: ( rule__ModelFolding__Group__0__Impl rule__ModelFolding__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3843:2: rule__ModelFolding__Group__0__Impl rule__ModelFolding__Group__1
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__0__Impl_in_rule__ModelFolding__Group__07827);
            rule__ModelFolding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelFolding__Group__1_in_rule__ModelFolding__Group__07830);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3850:1: rule__ModelFolding__Group__0__Impl : ( '=>' ) ;
    public final void rule__ModelFolding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3854:1: ( ( '=>' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3855:1: ( '=>' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3855:1: ( '=>' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3856:1: '=>'
            {
             before(grammarAccess.getModelFoldingAccess().getEqualsSignGreaterThanSignKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__ModelFolding__Group__0__Impl7858); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3869:1: rule__ModelFolding__Group__1 : rule__ModelFolding__Group__1__Impl rule__ModelFolding__Group__2 ;
    public final void rule__ModelFolding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3873:1: ( rule__ModelFolding__Group__1__Impl rule__ModelFolding__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3874:2: rule__ModelFolding__Group__1__Impl rule__ModelFolding__Group__2
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__1__Impl_in_rule__ModelFolding__Group__17889);
            rule__ModelFolding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelFolding__Group__2_in_rule__ModelFolding__Group__17892);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3881:1: rule__ModelFolding__Group__1__Impl : ( '{' ) ;
    public final void rule__ModelFolding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3885:1: ( ( '{' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3886:1: ( '{' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3886:1: ( '{' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3887:1: '{'
            {
             before(grammarAccess.getModelFoldingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__ModelFolding__Group__1__Impl7920); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3900:1: rule__ModelFolding__Group__2 : rule__ModelFolding__Group__2__Impl rule__ModelFolding__Group__3 ;
    public final void rule__ModelFolding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3904:1: ( rule__ModelFolding__Group__2__Impl rule__ModelFolding__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3905:2: rule__ModelFolding__Group__2__Impl rule__ModelFolding__Group__3
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__2__Impl_in_rule__ModelFolding__Group__27951);
            rule__ModelFolding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelFolding__Group__3_in_rule__ModelFolding__Group__27954);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3912:1: rule__ModelFolding__Group__2__Impl : ( ( ( rule__ModelFolding__FoldingsAssignment_2 ) ) ( ( rule__ModelFolding__FoldingsAssignment_2 )* ) ) ;
    public final void rule__ModelFolding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3916:1: ( ( ( ( rule__ModelFolding__FoldingsAssignment_2 ) ) ( ( rule__ModelFolding__FoldingsAssignment_2 )* ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3917:1: ( ( ( rule__ModelFolding__FoldingsAssignment_2 ) ) ( ( rule__ModelFolding__FoldingsAssignment_2 )* ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3917:1: ( ( ( rule__ModelFolding__FoldingsAssignment_2 ) ) ( ( rule__ModelFolding__FoldingsAssignment_2 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3918:1: ( ( rule__ModelFolding__FoldingsAssignment_2 ) ) ( ( rule__ModelFolding__FoldingsAssignment_2 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3918:1: ( ( rule__ModelFolding__FoldingsAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3919:1: ( rule__ModelFolding__FoldingsAssignment_2 )
            {
             before(grammarAccess.getModelFoldingAccess().getFoldingsAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3920:1: ( rule__ModelFolding__FoldingsAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3920:2: rule__ModelFolding__FoldingsAssignment_2
            {
            pushFollow(FOLLOW_rule__ModelFolding__FoldingsAssignment_2_in_rule__ModelFolding__Group__2__Impl7983);
            rule__ModelFolding__FoldingsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelFoldingAccess().getFoldingsAssignment_2()); 

            }

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3923:1: ( ( rule__ModelFolding__FoldingsAssignment_2 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3924:1: ( rule__ModelFolding__FoldingsAssignment_2 )*
            {
             before(grammarAccess.getModelFoldingAccess().getFoldingsAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3925:1: ( rule__ModelFolding__FoldingsAssignment_2 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( ((LA32_0>=RULE_STRING && LA32_0<=RULE_NAME_TOKEN)||(LA32_0>=13 && LA32_0<=15)||LA32_0==35) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3925:2: rule__ModelFolding__FoldingsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ModelFolding__FoldingsAssignment_2_in_rule__ModelFolding__Group__2__Impl7995);
            	    rule__ModelFolding__FoldingsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3936:1: rule__ModelFolding__Group__3 : rule__ModelFolding__Group__3__Impl ;
    public final void rule__ModelFolding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3940:1: ( rule__ModelFolding__Group__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3941:2: rule__ModelFolding__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__3__Impl_in_rule__ModelFolding__Group__38028);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3947:1: rule__ModelFolding__Group__3__Impl : ( '}' ) ;
    public final void rule__ModelFolding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3951:1: ( ( '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3952:1: ( '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3952:1: ( '}' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3953:1: '}'
            {
             before(grammarAccess.getModelFoldingAccess().getRightCurlyBracketKeyword_3()); 
            match(input,33,FOLLOW_33_in_rule__ModelFolding__Group__3__Impl8056); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3974:1: rule__PropertyFolding__Group__0 : rule__PropertyFolding__Group__0__Impl rule__PropertyFolding__Group__1 ;
    public final void rule__PropertyFolding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3978:1: ( rule__PropertyFolding__Group__0__Impl rule__PropertyFolding__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3979:2: rule__PropertyFolding__Group__0__Impl rule__PropertyFolding__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__0__Impl_in_rule__PropertyFolding__Group__08095);
            rule__PropertyFolding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__1_in_rule__PropertyFolding__Group__08098);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3986:1: rule__PropertyFolding__Group__0__Impl : ( ( rule__PropertyFolding__DescriptionAssignment_0 )? ) ;
    public final void rule__PropertyFolding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3990:1: ( ( ( rule__PropertyFolding__DescriptionAssignment_0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3991:1: ( ( rule__PropertyFolding__DescriptionAssignment_0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3991:1: ( ( rule__PropertyFolding__DescriptionAssignment_0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3992:1: ( rule__PropertyFolding__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getPropertyFoldingAccess().getDescriptionAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3993:1: ( rule__PropertyFolding__DescriptionAssignment_0 )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==RULE_STRING) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3993:2: rule__PropertyFolding__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PropertyFolding__DescriptionAssignment_0_in_rule__PropertyFolding__Group__0__Impl8125);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4003:1: rule__PropertyFolding__Group__1 : rule__PropertyFolding__Group__1__Impl rule__PropertyFolding__Group__2 ;
    public final void rule__PropertyFolding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4007:1: ( rule__PropertyFolding__Group__1__Impl rule__PropertyFolding__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4008:2: rule__PropertyFolding__Group__1__Impl rule__PropertyFolding__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__1__Impl_in_rule__PropertyFolding__Group__18156);
            rule__PropertyFolding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__2_in_rule__PropertyFolding__Group__18159);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4015:1: rule__PropertyFolding__Group__1__Impl : ( ( rule__PropertyFolding__AttributesAssignment_1 )? ) ;
    public final void rule__PropertyFolding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4019:1: ( ( ( rule__PropertyFolding__AttributesAssignment_1 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4020:1: ( ( rule__PropertyFolding__AttributesAssignment_1 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4020:1: ( ( rule__PropertyFolding__AttributesAssignment_1 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4021:1: ( rule__PropertyFolding__AttributesAssignment_1 )?
            {
             before(grammarAccess.getPropertyFoldingAccess().getAttributesAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4022:1: ( rule__PropertyFolding__AttributesAssignment_1 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==35) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4022:2: rule__PropertyFolding__AttributesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PropertyFolding__AttributesAssignment_1_in_rule__PropertyFolding__Group__1__Impl8186);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4032:1: rule__PropertyFolding__Group__2 : rule__PropertyFolding__Group__2__Impl rule__PropertyFolding__Group__3 ;
    public final void rule__PropertyFolding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4036:1: ( rule__PropertyFolding__Group__2__Impl rule__PropertyFolding__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4037:2: rule__PropertyFolding__Group__2__Impl rule__PropertyFolding__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__2__Impl_in_rule__PropertyFolding__Group__28217);
            rule__PropertyFolding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__3_in_rule__PropertyFolding__Group__28220);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4044:1: rule__PropertyFolding__Group__2__Impl : ( ( rule__PropertyFolding__AggregatorAssignment_2 ) ) ;
    public final void rule__PropertyFolding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4048:1: ( ( ( rule__PropertyFolding__AggregatorAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4049:1: ( ( rule__PropertyFolding__AggregatorAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4049:1: ( ( rule__PropertyFolding__AggregatorAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4050:1: ( rule__PropertyFolding__AggregatorAssignment_2 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getAggregatorAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4051:1: ( rule__PropertyFolding__AggregatorAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4051:2: rule__PropertyFolding__AggregatorAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyFolding__AggregatorAssignment_2_in_rule__PropertyFolding__Group__2__Impl8247);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4061:1: rule__PropertyFolding__Group__3 : rule__PropertyFolding__Group__3__Impl rule__PropertyFolding__Group__4 ;
    public final void rule__PropertyFolding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4065:1: ( rule__PropertyFolding__Group__3__Impl rule__PropertyFolding__Group__4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4066:2: rule__PropertyFolding__Group__3__Impl rule__PropertyFolding__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__3__Impl_in_rule__PropertyFolding__Group__38277);
            rule__PropertyFolding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__4_in_rule__PropertyFolding__Group__38280);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4073:1: rule__PropertyFolding__Group__3__Impl : ( ( rule__PropertyFolding__FromAssignment_3 ) ) ;
    public final void rule__PropertyFolding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4077:1: ( ( ( rule__PropertyFolding__FromAssignment_3 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4078:1: ( ( rule__PropertyFolding__FromAssignment_3 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4078:1: ( ( rule__PropertyFolding__FromAssignment_3 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4079:1: ( rule__PropertyFolding__FromAssignment_3 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getFromAssignment_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4080:1: ( rule__PropertyFolding__FromAssignment_3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4080:2: rule__PropertyFolding__FromAssignment_3
            {
            pushFollow(FOLLOW_rule__PropertyFolding__FromAssignment_3_in_rule__PropertyFolding__Group__3__Impl8307);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4090:1: rule__PropertyFolding__Group__4 : rule__PropertyFolding__Group__4__Impl rule__PropertyFolding__Group__5 ;
    public final void rule__PropertyFolding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4094:1: ( rule__PropertyFolding__Group__4__Impl rule__PropertyFolding__Group__5 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4095:2: rule__PropertyFolding__Group__4__Impl rule__PropertyFolding__Group__5
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__4__Impl_in_rule__PropertyFolding__Group__48337);
            rule__PropertyFolding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__5_in_rule__PropertyFolding__Group__48340);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4102:1: rule__PropertyFolding__Group__4__Impl : ( ( rule__PropertyFolding__Alternatives_4 ) ) ;
    public final void rule__PropertyFolding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4106:1: ( ( ( rule__PropertyFolding__Alternatives_4 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4107:1: ( ( rule__PropertyFolding__Alternatives_4 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4107:1: ( ( rule__PropertyFolding__Alternatives_4 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4108:1: ( rule__PropertyFolding__Alternatives_4 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getAlternatives_4()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4109:1: ( rule__PropertyFolding__Alternatives_4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4109:2: rule__PropertyFolding__Alternatives_4
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Alternatives_4_in_rule__PropertyFolding__Group__4__Impl8367);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4119:1: rule__PropertyFolding__Group__5 : rule__PropertyFolding__Group__5__Impl rule__PropertyFolding__Group__6 ;
    public final void rule__PropertyFolding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4123:1: ( rule__PropertyFolding__Group__5__Impl rule__PropertyFolding__Group__6 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4124:2: rule__PropertyFolding__Group__5__Impl rule__PropertyFolding__Group__6
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__5__Impl_in_rule__PropertyFolding__Group__58397);
            rule__PropertyFolding__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__6_in_rule__PropertyFolding__Group__58400);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4131:1: rule__PropertyFolding__Group__5__Impl : ( ( rule__PropertyFolding__NameAssignment_5 ) ) ;
    public final void rule__PropertyFolding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4135:1: ( ( ( rule__PropertyFolding__NameAssignment_5 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4136:1: ( ( rule__PropertyFolding__NameAssignment_5 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4136:1: ( ( rule__PropertyFolding__NameAssignment_5 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4137:1: ( rule__PropertyFolding__NameAssignment_5 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getNameAssignment_5()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4138:1: ( rule__PropertyFolding__NameAssignment_5 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4138:2: rule__PropertyFolding__NameAssignment_5
            {
            pushFollow(FOLLOW_rule__PropertyFolding__NameAssignment_5_in_rule__PropertyFolding__Group__5__Impl8427);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4148:1: rule__PropertyFolding__Group__6 : rule__PropertyFolding__Group__6__Impl ;
    public final void rule__PropertyFolding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4152:1: ( rule__PropertyFolding__Group__6__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4153:2: rule__PropertyFolding__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__6__Impl_in_rule__PropertyFolding__Group__68457);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4159:1: rule__PropertyFolding__Group__6__Impl : ( ';' ) ;
    public final void rule__PropertyFolding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4163:1: ( ( ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4164:1: ( ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4164:1: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4165:1: ';'
            {
             before(grammarAccess.getPropertyFoldingAccess().getSemicolonKeyword_6()); 
            match(input,29,FOLLOW_29_in_rule__PropertyFolding__Group__6__Impl8485); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4192:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4196:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4197:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08530);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08533);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4204:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__NameAssignment_0 ) ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4208:1: ( ( ( rule__QualifiedName__NameAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4209:1: ( ( rule__QualifiedName__NameAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4209:1: ( ( rule__QualifiedName__NameAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4210:1: ( rule__QualifiedName__NameAssignment_0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getNameAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4211:1: ( rule__QualifiedName__NameAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4211:2: rule__QualifiedName__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__QualifiedName__NameAssignment_0_in_rule__QualifiedName__Group__0__Impl8560);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4221:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4225:1: ( rule__QualifiedName__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4226:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18590);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4232:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4236:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4237:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4237:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4238:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4239:1: ( rule__QualifiedName__Group_1__0 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==40) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4239:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8617);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4253:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4257:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4258:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08652);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08655);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4265:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4269:1: ( ( '.' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4270:1: ( '.' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4270:1: ( '.' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4271:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__QualifiedName__Group_1__0__Impl8683); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4284:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4288:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4289:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18714);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4295:1: rule__QualifiedName__Group_1__1__Impl : ( ( rule__QualifiedName__NameAssignment_1_1 ) ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4299:1: ( ( ( rule__QualifiedName__NameAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4300:1: ( ( rule__QualifiedName__NameAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4300:1: ( ( rule__QualifiedName__NameAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4301:1: ( rule__QualifiedName__NameAssignment_1_1 )
            {
             before(grammarAccess.getQualifiedNameAccess().getNameAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4302:1: ( rule__QualifiedName__NameAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4302:2: rule__QualifiedName__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__QualifiedName__NameAssignment_1_1_in_rule__QualifiedName__Group_1__1__Impl8741);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4317:1: rule__Script__ListAssignment : ( ruleModelDefinition ) ;
    public final void rule__Script__ListAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4321:1: ( ( ruleModelDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4322:1: ( ruleModelDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4322:1: ( ruleModelDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4323:1: ruleModelDefinition
            {
             before(grammarAccess.getScriptAccess().getListModelDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleModelDefinition_in_rule__Script__ListAssignment8780);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4332:1: rule__ModelDefinition__DescriptionAssignment_0 : ( ruleDescription ) ;
    public final void rule__ModelDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4336:1: ( ( ruleDescription ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4337:1: ( ruleDescription )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4337:1: ( ruleDescription )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4338:1: ruleDescription
            {
             before(grammarAccess.getModelDefinitionAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__ModelDefinition__DescriptionAssignment_08811);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4347:1: rule__ModelDefinition__AttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__ModelDefinition__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4351:1: ( ( ruleAttributeList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4352:1: ( ruleAttributeList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4352:1: ( ruleAttributeList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4353:1: ruleAttributeList
            {
             before(grammarAccess.getModelDefinitionAccess().getAttributesAttributeListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__ModelDefinition__AttributesAssignment_18842);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4362:1: rule__ModelDefinition__ModelAssignment_2_0 : ( ruleRecordModelDefinition ) ;
    public final void rule__ModelDefinition__ModelAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4366:1: ( ( ruleRecordModelDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4367:1: ( ruleRecordModelDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4367:1: ( ruleRecordModelDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4368:1: ruleRecordModelDefinition
            {
             before(grammarAccess.getModelDefinitionAccess().getModelRecordModelDefinitionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleRecordModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_08873);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4377:1: rule__ModelDefinition__ModelAssignment_2_1 : ( ruleProjectiveModelDefinition ) ;
    public final void rule__ModelDefinition__ModelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4381:1: ( ( ruleProjectiveModelDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4382:1: ( ruleProjectiveModelDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4382:1: ( ruleProjectiveModelDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4383:1: ruleProjectiveModelDefinition
            {
             before(grammarAccess.getModelDefinitionAccess().getModelProjectiveModelDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleProjectiveModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_18904);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4392:1: rule__ModelDefinition__ModelAssignment_2_2 : ( ruleJoinedModelDefinition ) ;
    public final void rule__ModelDefinition__ModelAssignment_2_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4396:1: ( ( ruleJoinedModelDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4397:1: ( ruleJoinedModelDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4397:1: ( ruleJoinedModelDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4398:1: ruleJoinedModelDefinition
            {
             before(grammarAccess.getModelDefinitionAccess().getModelJoinedModelDefinitionParserRuleCall_2_2_0()); 
            pushFollow(FOLLOW_ruleJoinedModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_28935);
            ruleJoinedModelDefinition();

            state._fsp--;

             after(grammarAccess.getModelDefinitionAccess().getModelJoinedModelDefinitionParserRuleCall_2_2_0()); 

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


    // $ANTLR start "rule__ModelDefinition__ModelAssignment_2_3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4407:1: rule__ModelDefinition__ModelAssignment_2_3 : ( ruleSummarizeModelDefinition ) ;
    public final void rule__ModelDefinition__ModelAssignment_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4411:1: ( ( ruleSummarizeModelDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4412:1: ( ruleSummarizeModelDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4412:1: ( ruleSummarizeModelDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4413:1: ruleSummarizeModelDefinition
            {
             before(grammarAccess.getModelDefinitionAccess().getModelSummarizeModelDefinitionParserRuleCall_2_3_0()); 
            pushFollow(FOLLOW_ruleSummarizeModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_38966);
            ruleSummarizeModelDefinition();

            state._fsp--;

             after(grammarAccess.getModelDefinitionAccess().getModelSummarizeModelDefinitionParserRuleCall_2_3_0()); 

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
    // $ANTLR end "rule__ModelDefinition__ModelAssignment_2_3"


    // $ANTLR start "rule__RecordModelDefinition__NameAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4422:1: rule__RecordModelDefinition__NameAssignment_0 : ( ruleName ) ;
    public final void rule__RecordModelDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4426:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4427:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4427:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4428:1: ruleName
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__RecordModelDefinition__NameAssignment_08997);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4437:1: rule__RecordModelDefinition__RhsAssignment_2 : ( ruleRecordExpression ) ;
    public final void rule__RecordModelDefinition__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4441:1: ( ( ruleRecordExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4442:1: ( ruleRecordExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4442:1: ( ruleRecordExpression )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4443:1: ruleRecordExpression
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getRhsRecordExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRecordExpression_in_rule__RecordModelDefinition__RhsAssignment_29028);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4452:1: rule__ProjectiveModelDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__ProjectiveModelDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4456:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4457:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4457:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4458:1: ruleName
            {
             before(grammarAccess.getProjectiveModelDefinitionAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__ProjectiveModelDefinition__NameAssignment_19059);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4467:1: rule__ProjectiveModelDefinition__RhsAssignment_3 : ( ruleRecordExpression ) ;
    public final void rule__ProjectiveModelDefinition__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4471:1: ( ( ruleRecordExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4472:1: ( ruleRecordExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4472:1: ( ruleRecordExpression )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4473:1: ruleRecordExpression
            {
             before(grammarAccess.getProjectiveModelDefinitionAccess().getRhsRecordExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleRecordExpression_in_rule__ProjectiveModelDefinition__RhsAssignment_39090);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4482:1: rule__RecordExpression__TermsAssignment_0 : ( ruleRecordTerm ) ;
    public final void rule__RecordExpression__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4486:1: ( ( ruleRecordTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4487:1: ( ruleRecordTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4487:1: ( ruleRecordTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4488:1: ruleRecordTerm
            {
             before(grammarAccess.getRecordExpressionAccess().getTermsRecordTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRecordTerm_in_rule__RecordExpression__TermsAssignment_09121);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4497:1: rule__RecordExpression__TermsAssignment_1_1 : ( ruleRecordTerm ) ;
    public final void rule__RecordExpression__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4501:1: ( ( ruleRecordTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4502:1: ( ruleRecordTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4502:1: ( ruleRecordTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4503:1: ruleRecordTerm
            {
             before(grammarAccess.getRecordExpressionAccess().getTermsRecordTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRecordTerm_in_rule__RecordExpression__TermsAssignment_1_19152);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4512:1: rule__RecordTerm__PropertiesAssignment_0_1 : ( rulePropertyDefinition ) ;
    public final void rule__RecordTerm__PropertiesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4516:1: ( ( rulePropertyDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4517:1: ( rulePropertyDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4517:1: ( rulePropertyDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4518:1: rulePropertyDefinition
            {
             before(grammarAccess.getRecordTermAccess().getPropertiesPropertyDefinitionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_rule__RecordTerm__PropertiesAssignment_0_19183);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4527:1: rule__RecordTerm__ReferenceAssignment_1 : ( ruleModelReference ) ;
    public final void rule__RecordTerm__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4531:1: ( ( ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4532:1: ( ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4532:1: ( ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4533:1: ruleModelReference
            {
             before(grammarAccess.getRecordTermAccess().getReferenceModelReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModelReference_in_rule__RecordTerm__ReferenceAssignment_19214);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4542:1: rule__ModelReference__NameAssignment : ( ruleName ) ;
    public final void rule__ModelReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4546:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4547:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4547:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4548:1: ruleName
            {
             before(grammarAccess.getModelReferenceAccess().getNameNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__ModelReference__NameAssignment9245);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4557:1: rule__PropertyDefinition__DescriptionAssignment_0 : ( ruleDescription ) ;
    public final void rule__PropertyDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4561:1: ( ( ruleDescription ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4562:1: ( ruleDescription )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4562:1: ( ruleDescription )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4563:1: ruleDescription
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__PropertyDefinition__DescriptionAssignment_09276);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4572:1: rule__PropertyDefinition__AttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__PropertyDefinition__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4576:1: ( ( ruleAttributeList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4577:1: ( ruleAttributeList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4577:1: ( ruleAttributeList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4578:1: ruleAttributeList
            {
             before(grammarAccess.getPropertyDefinitionAccess().getAttributesAttributeListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__PropertyDefinition__AttributesAssignment_19307);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4587:1: rule__PropertyDefinition__NameAssignment_2 : ( ruleName ) ;
    public final void rule__PropertyDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4591:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4592:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4592:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4593:1: ruleName
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNameNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__PropertyDefinition__NameAssignment_29338);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4602:1: rule__PropertyDefinition__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__PropertyDefinition__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4606:1: ( ( ruleType ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4607:1: ( ruleType )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4607:1: ( ruleType )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4608:1: ruleType
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypeTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__PropertyDefinition__TypeAssignment_49369);
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


    // $ANTLR start "rule__JoinedModelDefinition__NameAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4617:1: rule__JoinedModelDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__JoinedModelDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4621:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4622:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4622:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4623:1: ruleName
            {
             before(grammarAccess.getJoinedModelDefinitionAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__JoinedModelDefinition__NameAssignment_19400);
            ruleName();

            state._fsp--;

             after(grammarAccess.getJoinedModelDefinitionAccess().getNameNameParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__JoinedModelDefinition__NameAssignment_1"


    // $ANTLR start "rule__JoinedModelDefinition__RhsAssignment_3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4632:1: rule__JoinedModelDefinition__RhsAssignment_3 : ( ruleJoinExpression ) ;
    public final void rule__JoinedModelDefinition__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4636:1: ( ( ruleJoinExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4637:1: ( ruleJoinExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4637:1: ( ruleJoinExpression )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4638:1: ruleJoinExpression
            {
             before(grammarAccess.getJoinedModelDefinitionAccess().getRhsJoinExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleJoinExpression_in_rule__JoinedModelDefinition__RhsAssignment_39431);
            ruleJoinExpression();

            state._fsp--;

             after(grammarAccess.getJoinedModelDefinitionAccess().getRhsJoinExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__JoinedModelDefinition__RhsAssignment_3"


    // $ANTLR start "rule__JoinExpression__TermsAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4647:1: rule__JoinExpression__TermsAssignment_0 : ( ruleJoinTerm ) ;
    public final void rule__JoinExpression__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4651:1: ( ( ruleJoinTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4652:1: ( ruleJoinTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4652:1: ( ruleJoinTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4653:1: ruleJoinTerm
            {
             before(grammarAccess.getJoinExpressionAccess().getTermsJoinTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJoinTerm_in_rule__JoinExpression__TermsAssignment_09462);
            ruleJoinTerm();

            state._fsp--;

             after(grammarAccess.getJoinExpressionAccess().getTermsJoinTermParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__JoinExpression__TermsAssignment_0"


    // $ANTLR start "rule__JoinExpression__TermsAssignment_1_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4662:1: rule__JoinExpression__TermsAssignment_1_1 : ( ruleJoinTerm ) ;
    public final void rule__JoinExpression__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4666:1: ( ( ruleJoinTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4667:1: ( ruleJoinTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4667:1: ( ruleJoinTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4668:1: ruleJoinTerm
            {
             before(grammarAccess.getJoinExpressionAccess().getTermsJoinTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleJoinTerm_in_rule__JoinExpression__TermsAssignment_1_19493);
            ruleJoinTerm();

            state._fsp--;

             after(grammarAccess.getJoinExpressionAccess().getTermsJoinTermParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__JoinExpression__TermsAssignment_1_1"


    // $ANTLR start "rule__JoinTerm__ReferenceAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4677:1: rule__JoinTerm__ReferenceAssignment_0 : ( ruleModelReference ) ;
    public final void rule__JoinTerm__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4681:1: ( ( ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4682:1: ( ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4682:1: ( ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4683:1: ruleModelReference
            {
             before(grammarAccess.getJoinTermAccess().getReferenceModelReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleModelReference_in_rule__JoinTerm__ReferenceAssignment_09524);
            ruleModelReference();

            state._fsp--;

             after(grammarAccess.getJoinTermAccess().getReferenceModelReferenceParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__JoinTerm__ReferenceAssignment_0"


    // $ANTLR start "rule__JoinTerm__MappingAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4692:1: rule__JoinTerm__MappingAssignment_1 : ( ruleModelMapping ) ;
    public final void rule__JoinTerm__MappingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4696:1: ( ( ruleModelMapping ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4697:1: ( ruleModelMapping )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4697:1: ( ruleModelMapping )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4698:1: ruleModelMapping
            {
             before(grammarAccess.getJoinTermAccess().getMappingModelMappingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModelMapping_in_rule__JoinTerm__MappingAssignment_19555);
            ruleModelMapping();

            state._fsp--;

             after(grammarAccess.getJoinTermAccess().getMappingModelMappingParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__JoinTerm__MappingAssignment_1"


    // $ANTLR start "rule__JoinTerm__GroupingAssignment_2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4707:1: rule__JoinTerm__GroupingAssignment_2 : ( ruleGrouping ) ;
    public final void rule__JoinTerm__GroupingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4711:1: ( ( ruleGrouping ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4712:1: ( ruleGrouping )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4712:1: ( ruleGrouping )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4713:1: ruleGrouping
            {
             before(grammarAccess.getJoinTermAccess().getGroupingGroupingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGrouping_in_rule__JoinTerm__GroupingAssignment_29586);
            ruleGrouping();

            state._fsp--;

             after(grammarAccess.getJoinTermAccess().getGroupingGroupingParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__JoinTerm__GroupingAssignment_2"


    // $ANTLR start "rule__SummarizeModelDefinition__NameAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4722:1: rule__SummarizeModelDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__SummarizeModelDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4726:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4727:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4727:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4728:1: ruleName
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__SummarizeModelDefinition__NameAssignment_19617);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4737:1: rule__SummarizeModelDefinition__RhsAssignment_3 : ( ruleSummarizeExpression ) ;
    public final void rule__SummarizeModelDefinition__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4741:1: ( ( ruleSummarizeExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4742:1: ( ruleSummarizeExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4742:1: ( ruleSummarizeExpression )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4743:1: ruleSummarizeExpression
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getRhsSummarizeExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSummarizeExpression_in_rule__SummarizeModelDefinition__RhsAssignment_39648);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4752:1: rule__SummarizeExpression__TermsAssignment_0 : ( ruleSummarizeTerm ) ;
    public final void rule__SummarizeExpression__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4756:1: ( ( ruleSummarizeTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4757:1: ( ruleSummarizeTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4757:1: ( ruleSummarizeTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4758:1: ruleSummarizeTerm
            {
             before(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSummarizeTerm_in_rule__SummarizeExpression__TermsAssignment_09679);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4767:1: rule__SummarizeExpression__TermsAssignment_1_1 : ( ruleSummarizeTerm ) ;
    public final void rule__SummarizeExpression__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4771:1: ( ( ruleSummarizeTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4772:1: ( ruleSummarizeTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4772:1: ( ruleSummarizeTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4773:1: ruleSummarizeTerm
            {
             before(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleSummarizeTerm_in_rule__SummarizeExpression__TermsAssignment_1_19710);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4782:1: rule__SummarizeTerm__ReferenceAssignment_0 : ( ruleModelReference ) ;
    public final void rule__SummarizeTerm__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4786:1: ( ( ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4787:1: ( ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4787:1: ( ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4788:1: ruleModelReference
            {
             before(grammarAccess.getSummarizeTermAccess().getReferenceModelReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleModelReference_in_rule__SummarizeTerm__ReferenceAssignment_09741);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4797:1: rule__SummarizeTerm__FoldingAssignment_1 : ( ruleModelFolding ) ;
    public final void rule__SummarizeTerm__FoldingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4801:1: ( ( ruleModelFolding ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4802:1: ( ruleModelFolding )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4802:1: ( ruleModelFolding )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4803:1: ruleModelFolding
            {
             before(grammarAccess.getSummarizeTermAccess().getFoldingModelFoldingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModelFolding_in_rule__SummarizeTerm__FoldingAssignment_19772);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4812:1: rule__SummarizeTerm__GroupingAssignment_2 : ( ruleGrouping ) ;
    public final void rule__SummarizeTerm__GroupingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4816:1: ( ( ruleGrouping ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4817:1: ( ruleGrouping )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4817:1: ( ruleGrouping )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4818:1: ruleGrouping
            {
             before(grammarAccess.getSummarizeTermAccess().getGroupingGroupingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGrouping_in_rule__SummarizeTerm__GroupingAssignment_29803);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4827:1: rule__AttributeList__AttributesAssignment : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4831:1: ( ( ruleAttribute ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4832:1: ( ruleAttribute )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4832:1: ( ruleAttribute )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4833:1: ruleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__AttributeList__AttributesAssignment9834);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4842:1: rule__Attribute__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4846:1: ( ( ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4847:1: ( ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4847:1: ( ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4848:1: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Attribute__NameAssignment_19865);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4857:1: rule__Attribute__ElementsAssignment_2_1_0 : ( ruleAttributeElementList ) ;
    public final void rule__Attribute__ElementsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4861:1: ( ( ruleAttributeElementList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4862:1: ( ruleAttributeElementList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4862:1: ( ruleAttributeElementList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4863:1: ruleAttributeElementList
            {
             before(grammarAccess.getAttributeAccess().getElementsAttributeElementListParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleAttributeElementList_in_rule__Attribute__ElementsAssignment_2_1_09896);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4872:1: rule__AttributeElementList__ElementsAssignment_0 : ( ruleAttributeElement ) ;
    public final void rule__AttributeElementList__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4876:1: ( ( ruleAttributeElement ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4877:1: ( ruleAttributeElement )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4877:1: ( ruleAttributeElement )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4878:1: ruleAttributeElement
            {
             before(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttributeElement_in_rule__AttributeElementList__ElementsAssignment_09927);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4887:1: rule__AttributeElementList__ElementsAssignment_1_1 : ( ruleAttributeElement ) ;
    public final void rule__AttributeElementList__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4891:1: ( ( ruleAttributeElement ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4892:1: ( ruleAttributeElement )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4892:1: ( ruleAttributeElement )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4893:1: ruleAttributeElement
            {
             before(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAttributeElement_in_rule__AttributeElementList__ElementsAssignment_1_19958);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4902:1: rule__AttributeElement__NameAssignment_0 : ( ruleName ) ;
    public final void rule__AttributeElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4906:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4907:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4907:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4908:1: ruleName
            {
             before(grammarAccess.getAttributeElementAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__AttributeElement__NameAssignment_09989);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4917:1: rule__AttributeElement__ValueAssignment_2 : ( ruleAttributeValue ) ;
    public final void rule__AttributeElement__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4921:1: ( ( ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4922:1: ( ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4922:1: ( ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4923:1: ruleAttributeValue
            {
             before(grammarAccess.getAttributeElementAccess().getValueAttributeValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_rule__AttributeElement__ValueAssignment_210020);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4932:1: rule__AttributeValue__ValueAssignment_0 : ( ruleAttributeValueArray ) ;
    public final void rule__AttributeValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4936:1: ( ( ruleAttributeValueArray ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4937:1: ( ruleAttributeValueArray )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4937:1: ( ruleAttributeValueArray )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4938:1: ruleAttributeValueArray
            {
             before(grammarAccess.getAttributeValueAccess().getValueAttributeValueArrayParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttributeValueArray_in_rule__AttributeValue__ValueAssignment_010051);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4947:1: rule__AttributeValue__ValueAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__AttributeValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4951:1: ( ( ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4952:1: ( ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4952:1: ( ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4953:1: ruleQualifiedName
            {
             before(grammarAccess.getAttributeValueAccess().getValueQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__AttributeValue__ValueAssignment_110082);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4962:1: rule__AttributeValue__ValueAssignment_2 : ( ruleLiteral ) ;
    public final void rule__AttributeValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4966:1: ( ( ruleLiteral ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4967:1: ( ruleLiteral )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4967:1: ( ruleLiteral )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4968:1: ruleLiteral
            {
             before(grammarAccess.getAttributeValueAccess().getValueLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__AttributeValue__ValueAssignment_210113);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4977:1: rule__AttributeValueArray__ElementsAssignment_1 : ( ruleAttributeValue ) ;
    public final void rule__AttributeValueArray__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4981:1: ( ( ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4982:1: ( ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4982:1: ( ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4983:1: ruleAttributeValue
            {
             before(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_rule__AttributeValueArray__ElementsAssignment_110144);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4992:1: rule__AttributeValueArray__ElementsAssignment_2_1 : ( ruleAttributeValue ) ;
    public final void rule__AttributeValueArray__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4996:1: ( ( ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4997:1: ( ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4997:1: ( ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4998:1: ruleAttributeValue
            {
             before(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_rule__AttributeValueArray__ElementsAssignment_2_110175);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5007:1: rule__Grouping__NameAssignment_1 : ( ruleName ) ;
    public final void rule__Grouping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5011:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5012:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5012:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5013:1: ruleName
            {
             before(grammarAccess.getGroupingAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__Grouping__NameAssignment_110206);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5022:1: rule__Grouping__NameAssignment_2_1 : ( ruleName ) ;
    public final void rule__Grouping__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5026:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5027:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5027:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5028:1: ruleName
            {
             before(grammarAccess.getGroupingAccess().getNameNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__Grouping__NameAssignment_2_110237);
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


    // $ANTLR start "rule__ModelMapping__MappingsAssignment_2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5037:1: rule__ModelMapping__MappingsAssignment_2 : ( rulePropertyMapping ) ;
    public final void rule__ModelMapping__MappingsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5041:1: ( ( rulePropertyMapping ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5042:1: ( rulePropertyMapping )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5042:1: ( rulePropertyMapping )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5043:1: rulePropertyMapping
            {
             before(grammarAccess.getModelMappingAccess().getMappingsPropertyMappingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePropertyMapping_in_rule__ModelMapping__MappingsAssignment_210268);
            rulePropertyMapping();

            state._fsp--;

             after(grammarAccess.getModelMappingAccess().getMappingsPropertyMappingParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__ModelMapping__MappingsAssignment_2"


    // $ANTLR start "rule__PropertyMapping__DescriptionAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5052:1: rule__PropertyMapping__DescriptionAssignment_0 : ( ruleDescription ) ;
    public final void rule__PropertyMapping__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5056:1: ( ( ruleDescription ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5057:1: ( ruleDescription )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5057:1: ( ruleDescription )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5058:1: ruleDescription
            {
             before(grammarAccess.getPropertyMappingAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__PropertyMapping__DescriptionAssignment_010299);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getPropertyMappingAccess().getDescriptionDescriptionParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__PropertyMapping__DescriptionAssignment_0"


    // $ANTLR start "rule__PropertyMapping__AttributesAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5067:1: rule__PropertyMapping__AttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__PropertyMapping__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5071:1: ( ( ruleAttributeList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5072:1: ( ruleAttributeList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5072:1: ( ruleAttributeList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5073:1: ruleAttributeList
            {
             before(grammarAccess.getPropertyMappingAccess().getAttributesAttributeListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__PropertyMapping__AttributesAssignment_110330);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getPropertyMappingAccess().getAttributesAttributeListParserRuleCall_1_0()); 

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
    // $ANTLR end "rule__PropertyMapping__AttributesAssignment_1"


    // $ANTLR start "rule__PropertyMapping__FromAssignment_2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5082:1: rule__PropertyMapping__FromAssignment_2 : ( ruleName ) ;
    public final void rule__PropertyMapping__FromAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5086:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5087:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5087:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5088:1: ruleName
            {
             before(grammarAccess.getPropertyMappingAccess().getFromNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__PropertyMapping__FromAssignment_210361);
            ruleName();

            state._fsp--;

             after(grammarAccess.getPropertyMappingAccess().getFromNameParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__PropertyMapping__FromAssignment_2"


    // $ANTLR start "rule__PropertyMapping__NameAssignment_4"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5097:1: rule__PropertyMapping__NameAssignment_4 : ( ruleName ) ;
    public final void rule__PropertyMapping__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5101:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5102:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5102:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5103:1: ruleName
            {
             before(grammarAccess.getPropertyMappingAccess().getNameNameParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__PropertyMapping__NameAssignment_410392);
            ruleName();

            state._fsp--;

             after(grammarAccess.getPropertyMappingAccess().getNameNameParserRuleCall_4_0()); 

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
    // $ANTLR end "rule__PropertyMapping__NameAssignment_4"


    // $ANTLR start "rule__ModelFolding__FoldingsAssignment_2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5112:1: rule__ModelFolding__FoldingsAssignment_2 : ( rulePropertyFolding ) ;
    public final void rule__ModelFolding__FoldingsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5116:1: ( ( rulePropertyFolding ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5117:1: ( rulePropertyFolding )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5117:1: ( rulePropertyFolding )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5118:1: rulePropertyFolding
            {
             before(grammarAccess.getModelFoldingAccess().getFoldingsPropertyFoldingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePropertyFolding_in_rule__ModelFolding__FoldingsAssignment_210423);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5127:1: rule__PropertyFolding__DescriptionAssignment_0 : ( ruleDescription ) ;
    public final void rule__PropertyFolding__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5131:1: ( ( ruleDescription ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5132:1: ( ruleDescription )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5132:1: ( ruleDescription )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5133:1: ruleDescription
            {
             before(grammarAccess.getPropertyFoldingAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__PropertyFolding__DescriptionAssignment_010454);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5142:1: rule__PropertyFolding__AttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__PropertyFolding__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5146:1: ( ( ruleAttributeList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5147:1: ( ruleAttributeList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5147:1: ( ruleAttributeList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5148:1: ruleAttributeList
            {
             before(grammarAccess.getPropertyFoldingAccess().getAttributesAttributeListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__PropertyFolding__AttributesAssignment_110485);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5157:1: rule__PropertyFolding__AggregatorAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__PropertyFolding__AggregatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5161:1: ( ( ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5162:1: ( ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5162:1: ( ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5163:1: ruleQualifiedName
            {
             before(grammarAccess.getPropertyFoldingAccess().getAggregatorQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PropertyFolding__AggregatorAssignment_210516);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5172:1: rule__PropertyFolding__FromAssignment_3 : ( ruleName ) ;
    public final void rule__PropertyFolding__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5176:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5177:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5177:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5178:1: ruleName
            {
             before(grammarAccess.getPropertyFoldingAccess().getFromNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__PropertyFolding__FromAssignment_310547);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5187:1: rule__PropertyFolding__NameAssignment_5 : ( ruleName ) ;
    public final void rule__PropertyFolding__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5191:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5192:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5192:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5193:1: ruleName
            {
             before(grammarAccess.getPropertyFoldingAccess().getNameNameParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__PropertyFolding__NameAssignment_510578);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5202:1: rule__QualifiedName__NameAssignment_0 : ( ruleName ) ;
    public final void rule__QualifiedName__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5206:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5207:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5207:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5208:1: ruleName
            {
             before(grammarAccess.getQualifiedNameAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__QualifiedName__NameAssignment_010609);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5217:1: rule__QualifiedName__NameAssignment_1_1 : ( ruleName ) ;
    public final void rule__QualifiedName__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5221:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5222:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5222:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5223:1: ruleName
            {
             before(grammarAccess.getQualifiedNameAccess().getNameNameParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__QualifiedName__NameAssignment_1_110640);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5232:1: rule__Literal__StringValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Literal__StringValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5236:1: ( ( RULE_STRING ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5237:1: ( RULE_STRING )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5237:1: ( RULE_STRING )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5238:1: RULE_STRING
            {
             before(grammarAccess.getLiteralAccess().getStringValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Literal__StringValueAssignment_010671); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5247:1: rule__Literal__IntValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Literal__IntValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5251:1: ( ( RULE_INT ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5252:1: ( RULE_INT )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5252:1: ( RULE_INT )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5253:1: RULE_INT
            {
             before(grammarAccess.getLiteralAccess().getIntValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Literal__IntValueAssignment_110702); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5262:1: rule__Literal__DecimalValueAssignment_2 : ( RULE_DECIMAL ) ;
    public final void rule__Literal__DecimalValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5266:1: ( ( RULE_DECIMAL ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5267:1: ( RULE_DECIMAL )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5267:1: ( RULE_DECIMAL )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5268:1: RULE_DECIMAL
            {
             before(grammarAccess.getLiteralAccess().getDecimalValueDECIMALTerminalRuleCall_2_0()); 
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Literal__DecimalValueAssignment_210733); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5277:1: rule__Literal__BooleanValueAssignment_3 : ( ruleBOOLEAN ) ;
    public final void rule__Literal__BooleanValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5281:1: ( ( ruleBOOLEAN ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5282:1: ( ruleBOOLEAN )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5282:1: ( ruleBOOLEAN )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5283:1: ruleBOOLEAN
            {
             before(grammarAccess.getLiteralAccess().getBooleanValueBOOLEANEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_rule__Literal__BooleanValueAssignment_310764);
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
    public static final BitSet FOLLOW_rule__Script__ListAssignment_in_ruleScript94 = new BitSet(new long[]{0x000000080000E032L});
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
    public static final BitSet FOLLOW_ruleJoinedModelDefinition_in_entryRuleJoinedModelDefinition542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinedModelDefinition549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinedModelDefinition__Group__0_in_ruleJoinedModelDefinition575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinExpression_in_entryRuleJoinExpression602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinExpression609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinExpression__Group__0_in_ruleJoinExpression635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_entryRuleJoinTerm662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinTerm669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinTerm__Group__0_in_ruleJoinTerm695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeModelDefinition_in_entryRuleSummarizeModelDefinition722 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeModelDefinition729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__0_in_ruleSummarizeModelDefinition755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeExpression_in_entryRuleSummarizeExpression782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeExpression789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group__0_in_ruleSummarizeExpression815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_entryRuleSummarizeTerm842 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeTerm849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__0_in_ruleSummarizeTerm875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription902 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDescription935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_entryRuleAttributeList961 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeList968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__AttributesAssignment_in_ruleAttributeList996 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_rule__AttributeList__AttributesAssignment_in_ruleAttributeList1008 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElementList_in_entryRuleAttributeElementList1098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElementList1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group__0_in_ruleAttributeElementList1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_entryRuleAttributeElement1158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElement1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__0_in_ruleAttributeElement1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue1218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__Alternatives_in_ruleAttributeValue1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueArray_in_entryRuleAttributeValueArray1278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValueArray1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__0_in_ruleAttributeValueArray1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_entryRuleGrouping1338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouping1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__0_in_ruleGrouping1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelMapping_in_entryRuleModelMapping1398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelMapping1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__0_in_ruleModelMapping1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyMapping_in_entryRulePropertyMapping1458 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyMapping1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__0_in_rulePropertyMapping1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelFolding_in_entryRuleModelFolding1518 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelFolding1525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__0_in_ruleModelFolding1551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFolding_in_entryRulePropertyFolding1578 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyFolding1585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__0_in_rulePropertyFolding1611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName1698 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName1705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Alternatives_in_ruleName1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1758 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN1864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__ModelAssignment_2_0_in_rule__ModelDefinition__Alternatives_21899 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__ModelAssignment_2_1_in_rule__ModelDefinition__Alternatives_21917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__ModelAssignment_2_2_in_rule__ModelDefinition__Alternatives_21935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__ModelAssignment_2_3_in_rule__ModelDefinition__Alternatives_21953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__0_in_rule__RecordTerm__Alternatives1986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__ReferenceAssignment_1_in_rule__RecordTerm__Alternatives2004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__ValueAssignment_0_in_rule__AttributeValue__Alternatives2037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__ValueAssignment_1_in_rule__AttributeValue__Alternatives2055 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__ValueAssignment_2_in_rule__AttributeValue__Alternatives2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PropertyFolding__Alternatives_42107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PropertyFolding__Alternatives_42127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_TOKEN_in_rule__Name__Alternatives2161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Name__Alternatives2179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Name__Alternatives2199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Name__Alternatives2219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__StringValueAssignment_0_in_rule__Literal__Alternatives2253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__IntValueAssignment_1_in_rule__Literal__Alternatives2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__DecimalValueAssignment_2_in_rule__Literal__Alternatives2289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__BooleanValueAssignment_3_in_rule__Literal__Alternatives2307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type__Alternatives2341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type__Alternatives2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type__Alternatives2383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Type__Alternatives2404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Type__Alternatives2425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Type__Alternatives2446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Type__Alternatives2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Type__Alternatives2488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Type__Alternatives2509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Type__Alternatives2530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Type__Alternatives2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__BOOLEAN__Alternatives2587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__BOOLEAN__Alternatives2608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__0__Impl_in_rule__ModelDefinition__Group__02641 = new BitSet(new long[]{0x000000080000E030L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__1_in_rule__ModelDefinition__Group__02644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__DescriptionAssignment_0_in_rule__ModelDefinition__Group__0__Impl2671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__1__Impl_in_rule__ModelDefinition__Group__12702 = new BitSet(new long[]{0x000000080000E030L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__2_in_rule__ModelDefinition__Group__12705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__AttributesAssignment_1_in_rule__ModelDefinition__Group__1__Impl2732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__2__Impl_in_rule__ModelDefinition__Group__22763 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__3_in_rule__ModelDefinition__Group__22766 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Alternatives_2_in_rule__ModelDefinition__Group__2__Impl2793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__3__Impl_in_rule__ModelDefinition__Group__32823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ModelDefinition__Group__3__Impl2851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__0__Impl_in_rule__RecordModelDefinition__Group__02890 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__1_in_rule__RecordModelDefinition__Group__02893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__NameAssignment_0_in_rule__RecordModelDefinition__Group__0__Impl2920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__1__Impl_in_rule__RecordModelDefinition__Group__12950 = new BitSet(new long[]{0x000000010000E020L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__2_in_rule__RecordModelDefinition__Group__12953 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__RecordModelDefinition__Group__1__Impl2981 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__2__Impl_in_rule__RecordModelDefinition__Group__23012 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__RhsAssignment_2_in_rule__RecordModelDefinition__Group__2__Impl3039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__Group__0__Impl_in_rule__ProjectiveModelDefinition__Group__03075 = new BitSet(new long[]{0x000000000000E020L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__Group__1_in_rule__ProjectiveModelDefinition__Group__03078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ProjectiveModelDefinition__Group__0__Impl3106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__Group__1__Impl_in_rule__ProjectiveModelDefinition__Group__13137 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__Group__2_in_rule__ProjectiveModelDefinition__Group__13140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__NameAssignment_1_in_rule__ProjectiveModelDefinition__Group__1__Impl3167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__Group__2__Impl_in_rule__ProjectiveModelDefinition__Group__23197 = new BitSet(new long[]{0x000000010000E020L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__Group__3_in_rule__ProjectiveModelDefinition__Group__23200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ProjectiveModelDefinition__Group__2__Impl3228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__Group__3__Impl_in_rule__ProjectiveModelDefinition__Group__33259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ProjectiveModelDefinition__RhsAssignment_3_in_rule__ProjectiveModelDefinition__Group__3__Impl3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__0__Impl_in_rule__RecordExpression__Group__03324 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__1_in_rule__RecordExpression__Group__03327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__TermsAssignment_0_in_rule__RecordExpression__Group__0__Impl3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__1__Impl_in_rule__RecordExpression__Group__13384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__0_in_rule__RecordExpression__Group__1__Impl3411 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__0__Impl_in_rule__RecordExpression__Group_1__03446 = new BitSet(new long[]{0x000000010000E020L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__1_in_rule__RecordExpression__Group_1__03449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__RecordExpression__Group_1__0__Impl3477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__1__Impl_in_rule__RecordExpression__Group_1__13508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__TermsAssignment_1_1_in_rule__RecordExpression__Group_1__1__Impl3535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__0__Impl_in_rule__RecordTerm__Group_0__03569 = new BitSet(new long[]{0x000000080000E030L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__1_in_rule__RecordTerm__Group_0__03572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__RecordTerm__Group_0__0__Impl3600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__1__Impl_in_rule__RecordTerm__Group_0__13631 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__2_in_rule__RecordTerm__Group_0__13634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__PropertiesAssignment_0_1_in_rule__RecordTerm__Group_0__1__Impl3663 = new BitSet(new long[]{0x000000080000E032L});
    public static final BitSet FOLLOW_rule__RecordTerm__PropertiesAssignment_0_1_in_rule__RecordTerm__Group_0__1__Impl3675 = new BitSet(new long[]{0x000000080000E032L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__2__Impl_in_rule__RecordTerm__Group_0__23708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RecordTerm__Group_0__2__Impl3736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__03773 = new BitSet(new long[]{0x000000080000E030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__03776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DescriptionAssignment_0_in_rule__PropertyDefinition__Group__0__Impl3803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__13834 = new BitSet(new long[]{0x000000080000E030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__13837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__AttributesAssignment_1_in_rule__PropertyDefinition__Group__1__Impl3864 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__23895 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__23898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NameAssignment_2_in_rule__PropertyDefinition__Group__2__Impl3925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__33955 = new BitSet(new long[]{0x0000000007FF0000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__33958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__PropertyDefinition__Group__3__Impl3986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__44017 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__44020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__TypeAssignment_4_in_rule__PropertyDefinition__Group__4__Impl4047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__54077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PropertyDefinition__Group__5__Impl4105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinedModelDefinition__Group__0__Impl_in_rule__JoinedModelDefinition__Group__04148 = new BitSet(new long[]{0x000000000000E020L});
    public static final BitSet FOLLOW_rule__JoinedModelDefinition__Group__1_in_rule__JoinedModelDefinition__Group__04151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__JoinedModelDefinition__Group__0__Impl4179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinedModelDefinition__Group__1__Impl_in_rule__JoinedModelDefinition__Group__14210 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__JoinedModelDefinition__Group__2_in_rule__JoinedModelDefinition__Group__14213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinedModelDefinition__NameAssignment_1_in_rule__JoinedModelDefinition__Group__1__Impl4240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinedModelDefinition__Group__2__Impl_in_rule__JoinedModelDefinition__Group__24270 = new BitSet(new long[]{0x000000010000E020L});
    public static final BitSet FOLLOW_rule__JoinedModelDefinition__Group__3_in_rule__JoinedModelDefinition__Group__24273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__JoinedModelDefinition__Group__2__Impl4301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinedModelDefinition__Group__3__Impl_in_rule__JoinedModelDefinition__Group__34332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinedModelDefinition__RhsAssignment_3_in_rule__JoinedModelDefinition__Group__3__Impl4359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinExpression__Group__0__Impl_in_rule__JoinExpression__Group__04397 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__JoinExpression__Group__1_in_rule__JoinExpression__Group__04400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinExpression__TermsAssignment_0_in_rule__JoinExpression__Group__0__Impl4427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinExpression__Group__1__Impl_in_rule__JoinExpression__Group__14457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinExpression__Group_1__0_in_rule__JoinExpression__Group__1__Impl4484 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__JoinExpression__Group_1__0__Impl_in_rule__JoinExpression__Group_1__04519 = new BitSet(new long[]{0x000000010000E020L});
    public static final BitSet FOLLOW_rule__JoinExpression__Group_1__1_in_rule__JoinExpression__Group_1__04522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__JoinExpression__Group_1__0__Impl4550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinExpression__Group_1__1__Impl_in_rule__JoinExpression__Group_1__14581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinExpression__TermsAssignment_1_1_in_rule__JoinExpression__Group_1__1__Impl4608 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinTerm__Group__0__Impl_in_rule__JoinTerm__Group__04642 = new BitSet(new long[]{0x0000008000000800L});
    public static final BitSet FOLLOW_rule__JoinTerm__Group__1_in_rule__JoinTerm__Group__04645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinTerm__ReferenceAssignment_0_in_rule__JoinTerm__Group__0__Impl4672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinTerm__Group__1__Impl_in_rule__JoinTerm__Group__14702 = new BitSet(new long[]{0x0000008000000800L});
    public static final BitSet FOLLOW_rule__JoinTerm__Group__2_in_rule__JoinTerm__Group__14705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinTerm__MappingAssignment_1_in_rule__JoinTerm__Group__1__Impl4732 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinTerm__Group__2__Impl_in_rule__JoinTerm__Group__24763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinTerm__GroupingAssignment_2_in_rule__JoinTerm__Group__2__Impl4790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__0__Impl_in_rule__SummarizeModelDefinition__Group__04827 = new BitSet(new long[]{0x000000000000E020L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__1_in_rule__SummarizeModelDefinition__Group__04830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__SummarizeModelDefinition__Group__0__Impl4858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__1__Impl_in_rule__SummarizeModelDefinition__Group__14889 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__2_in_rule__SummarizeModelDefinition__Group__14892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__NameAssignment_1_in_rule__SummarizeModelDefinition__Group__1__Impl4919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__2__Impl_in_rule__SummarizeModelDefinition__Group__24949 = new BitSet(new long[]{0x000000010000E020L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__3_in_rule__SummarizeModelDefinition__Group__24952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__SummarizeModelDefinition__Group__2__Impl4980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__3__Impl_in_rule__SummarizeModelDefinition__Group__35011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__RhsAssignment_3_in_rule__SummarizeModelDefinition__Group__3__Impl5038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group__0__Impl_in_rule__SummarizeExpression__Group__05076 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group__1_in_rule__SummarizeExpression__Group__05079 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__TermsAssignment_0_in_rule__SummarizeExpression__Group__0__Impl5106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group__1__Impl_in_rule__SummarizeExpression__Group__15136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group_1__0_in_rule__SummarizeExpression__Group__1__Impl5163 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group_1__0__Impl_in_rule__SummarizeExpression__Group_1__05198 = new BitSet(new long[]{0x000000010000E020L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group_1__1_in_rule__SummarizeExpression__Group_1__05201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__SummarizeExpression__Group_1__0__Impl5229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group_1__1__Impl_in_rule__SummarizeExpression__Group_1__15260 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__TermsAssignment_1_1_in_rule__SummarizeExpression__Group_1__1__Impl5287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__0__Impl_in_rule__SummarizeTerm__Group__05321 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__1_in_rule__SummarizeTerm__Group__05324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__ReferenceAssignment_0_in_rule__SummarizeTerm__Group__0__Impl5351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__1__Impl_in_rule__SummarizeTerm__Group__15381 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__2_in_rule__SummarizeTerm__Group__15384 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__FoldingAssignment_1_in_rule__SummarizeTerm__Group__1__Impl5411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__2__Impl_in_rule__SummarizeTerm__Group__25441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__GroupingAssignment_2_in_rule__SummarizeTerm__Group__2__Impl5468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05505 = new BitSet(new long[]{0x000000000000E020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05508 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Attribute__Group__0__Impl5536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15567 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl5597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__0_in_rule__Attribute__Group__2__Impl5654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__0__Impl_in_rule__Attribute__Group_2__05691 = new BitSet(new long[]{0x000000200000E020L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__1_in_rule__Attribute__Group_2__05694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Attribute__Group_2__0__Impl5722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__1__Impl_in_rule__Attribute__Group_2__15753 = new BitSet(new long[]{0x000000200000E020L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__2_in_rule__Attribute__Group_2__15756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_1__0_in_rule__Attribute__Group_2__1__Impl5783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__2__Impl_in_rule__Attribute__Group_2__25814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Attribute__Group_2__2__Impl5842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_1__0__Impl_in_rule__Attribute__Group_2_1__05879 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_1__1_in_rule__Attribute__Group_2_1__05882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ElementsAssignment_2_1_0_in_rule__Attribute__Group_2_1__0__Impl5909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_1__1__Impl_in_rule__Attribute__Group_2_1__15939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Attribute__Group_2_1__1__Impl5968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group__0__Impl_in_rule__AttributeElementList__Group__06005 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group__1_in_rule__AttributeElementList__Group__06008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__ElementsAssignment_0_in_rule__AttributeElementList__Group__0__Impl6035 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group__1__Impl_in_rule__AttributeElementList__Group__16065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group_1__0_in_rule__AttributeElementList__Group__1__Impl6092 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group_1__0__Impl_in_rule__AttributeElementList__Group_1__06127 = new BitSet(new long[]{0x000000000000E020L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group_1__1_in_rule__AttributeElementList__Group_1__06130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__AttributeElementList__Group_1__0__Impl6158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group_1__1__Impl_in_rule__AttributeElementList__Group_1__16189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__ElementsAssignment_1_1_in_rule__AttributeElementList__Group_1__1__Impl6216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__0__Impl_in_rule__AttributeElement__Group__06250 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__1_in_rule__AttributeElement__Group__06253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__NameAssignment_0_in_rule__AttributeElement__Group__0__Impl6280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__1__Impl_in_rule__AttributeElement__Group__16310 = new BitSet(new long[]{0x000000011800E0F0L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__2_in_rule__AttributeElement__Group__16313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AttributeElement__Group__1__Impl6341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__2__Impl_in_rule__AttributeElement__Group__26372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__ValueAssignment_2_in_rule__AttributeElement__Group__2__Impl6399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__0__Impl_in_rule__AttributeValueArray__Group__06435 = new BitSet(new long[]{0x000000011800E0F0L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__1_in_rule__AttributeValueArray__Group__06438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AttributeValueArray__Group__0__Impl6466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__1__Impl_in_rule__AttributeValueArray__Group__16497 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__2_in_rule__AttributeValueArray__Group__16500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__ElementsAssignment_1_in_rule__AttributeValueArray__Group__1__Impl6527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__2__Impl_in_rule__AttributeValueArray__Group__26557 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__3_in_rule__AttributeValueArray__Group__26560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group_2__0_in_rule__AttributeValueArray__Group__2__Impl6587 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__3__Impl_in_rule__AttributeValueArray__Group__36618 = new BitSet(new long[]{0x0000004200000000L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__4_in_rule__AttributeValueArray__Group__36621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__AttributeValueArray__Group__3__Impl6650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__4__Impl_in_rule__AttributeValueArray__Group__46683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__AttributeValueArray__Group__4__Impl6711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group_2__0__Impl_in_rule__AttributeValueArray__Group_2__06752 = new BitSet(new long[]{0x000000011800E0F0L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group_2__1_in_rule__AttributeValueArray__Group_2__06755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__AttributeValueArray__Group_2__0__Impl6783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group_2__1__Impl_in_rule__AttributeValueArray__Group_2__16814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__ElementsAssignment_2_1_in_rule__AttributeValueArray__Group_2__1__Impl6841 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__0__Impl_in_rule__Grouping__Group__06875 = new BitSet(new long[]{0x000000000000E020L});
    public static final BitSet FOLLOW_rule__Grouping__Group__1_in_rule__Grouping__Group__06878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__Grouping__Group__0__Impl6906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__1__Impl_in_rule__Grouping__Group__16937 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Grouping__Group__2_in_rule__Grouping__Group__16940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__NameAssignment_1_in_rule__Grouping__Group__1__Impl6967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__2__Impl_in_rule__Grouping__Group__26997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_2__0_in_rule__Grouping__Group__2__Impl7024 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_2__0__Impl_in_rule__Grouping__Group_2__07061 = new BitSet(new long[]{0x000000000000E020L});
    public static final BitSet FOLLOW_rule__Grouping__Group_2__1_in_rule__Grouping__Group_2__07064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__Grouping__Group_2__0__Impl7092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_2__1__Impl_in_rule__Grouping__Group_2__17123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__NameAssignment_2_1_in_rule__Grouping__Group_2__1__Impl7150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__0__Impl_in_rule__ModelMapping__Group__07184 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__1_in_rule__ModelMapping__Group__07187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__ModelMapping__Group__0__Impl7215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__1__Impl_in_rule__ModelMapping__Group__17246 = new BitSet(new long[]{0x000000080000E030L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__2_in_rule__ModelMapping__Group__17249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ModelMapping__Group__1__Impl7277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__2__Impl_in_rule__ModelMapping__Group__27308 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__3_in_rule__ModelMapping__Group__27311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMapping__MappingsAssignment_2_in_rule__ModelMapping__Group__2__Impl7340 = new BitSet(new long[]{0x000000080000E032L});
    public static final BitSet FOLLOW_rule__ModelMapping__MappingsAssignment_2_in_rule__ModelMapping__Group__2__Impl7352 = new BitSet(new long[]{0x000000080000E032L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__3__Impl_in_rule__ModelMapping__Group__37385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ModelMapping__Group__3__Impl7413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__0__Impl_in_rule__PropertyMapping__Group__07452 = new BitSet(new long[]{0x000000080000E030L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__1_in_rule__PropertyMapping__Group__07455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__DescriptionAssignment_0_in_rule__PropertyMapping__Group__0__Impl7482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__1__Impl_in_rule__PropertyMapping__Group__17513 = new BitSet(new long[]{0x000000080000E030L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__2_in_rule__PropertyMapping__Group__17516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__AttributesAssignment_1_in_rule__PropertyMapping__Group__1__Impl7543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__2__Impl_in_rule__PropertyMapping__Group__27574 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__3_in_rule__PropertyMapping__Group__27577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__FromAssignment_2_in_rule__PropertyMapping__Group__2__Impl7604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__3__Impl_in_rule__PropertyMapping__Group__37634 = new BitSet(new long[]{0x000000000000E020L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__4_in_rule__PropertyMapping__Group__37637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PropertyMapping__Group__3__Impl7665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__4__Impl_in_rule__PropertyMapping__Group__47696 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__5_in_rule__PropertyMapping__Group__47699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__NameAssignment_4_in_rule__PropertyMapping__Group__4__Impl7726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__5__Impl_in_rule__PropertyMapping__Group__57756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PropertyMapping__Group__5__Impl7784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__0__Impl_in_rule__ModelFolding__Group__07827 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__1_in_rule__ModelFolding__Group__07830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ModelFolding__Group__0__Impl7858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__1__Impl_in_rule__ModelFolding__Group__17889 = new BitSet(new long[]{0x000000080000E030L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__2_in_rule__ModelFolding__Group__17892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ModelFolding__Group__1__Impl7920 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__2__Impl_in_rule__ModelFolding__Group__27951 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__3_in_rule__ModelFolding__Group__27954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__FoldingsAssignment_2_in_rule__ModelFolding__Group__2__Impl7983 = new BitSet(new long[]{0x000000080000E032L});
    public static final BitSet FOLLOW_rule__ModelFolding__FoldingsAssignment_2_in_rule__ModelFolding__Group__2__Impl7995 = new BitSet(new long[]{0x000000080000E032L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__3__Impl_in_rule__ModelFolding__Group__38028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__ModelFolding__Group__3__Impl8056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__0__Impl_in_rule__PropertyFolding__Group__08095 = new BitSet(new long[]{0x000000080000E030L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__1_in_rule__PropertyFolding__Group__08098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__DescriptionAssignment_0_in_rule__PropertyFolding__Group__0__Impl8125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__1__Impl_in_rule__PropertyFolding__Group__18156 = new BitSet(new long[]{0x000000080000E030L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__2_in_rule__PropertyFolding__Group__18159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__AttributesAssignment_1_in_rule__PropertyFolding__Group__1__Impl8186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__2__Impl_in_rule__PropertyFolding__Group__28217 = new BitSet(new long[]{0x000000000000E020L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__3_in_rule__PropertyFolding__Group__28220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__AggregatorAssignment_2_in_rule__PropertyFolding__Group__2__Impl8247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__3__Impl_in_rule__PropertyFolding__Group__38277 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__4_in_rule__PropertyFolding__Group__38280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__FromAssignment_3_in_rule__PropertyFolding__Group__3__Impl8307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__4__Impl_in_rule__PropertyFolding__Group__48337 = new BitSet(new long[]{0x000000000000E020L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__5_in_rule__PropertyFolding__Group__48340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Alternatives_4_in_rule__PropertyFolding__Group__4__Impl8367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__5__Impl_in_rule__PropertyFolding__Group__58397 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__6_in_rule__PropertyFolding__Group__58400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__NameAssignment_5_in_rule__PropertyFolding__Group__5__Impl8427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__6__Impl_in_rule__PropertyFolding__Group__68457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__PropertyFolding__Group__6__Impl8485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08530 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__NameAssignment_0_in_rule__QualifiedName__Group__0__Impl8560 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8617 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08652 = new BitSet(new long[]{0x000000000000E020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__QualifiedName__Group_1__0__Impl8683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__NameAssignment_1_1_in_rule__QualifiedName__Group_1__1__Impl8741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_rule__Script__ListAssignment8780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__ModelDefinition__DescriptionAssignment_08811 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__ModelDefinition__AttributesAssignment_18842 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_08873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectiveModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_18904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinedModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_28935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_38966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__RecordModelDefinition__NameAssignment_08997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_rule__RecordModelDefinition__RhsAssignment_29028 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__ProjectiveModelDefinition__NameAssignment_19059 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_rule__ProjectiveModelDefinition__RhsAssignment_39090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_rule__RecordExpression__TermsAssignment_09121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_rule__RecordExpression__TermsAssignment_1_19152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_rule__RecordTerm__PropertiesAssignment_0_19183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_rule__RecordTerm__ReferenceAssignment_19214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__ModelReference__NameAssignment9245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__PropertyDefinition__DescriptionAssignment_09276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__PropertyDefinition__AttributesAssignment_19307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__PropertyDefinition__NameAssignment_29338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__PropertyDefinition__TypeAssignment_49369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__JoinedModelDefinition__NameAssignment_19400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinExpression_in_rule__JoinedModelDefinition__RhsAssignment_39431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_rule__JoinExpression__TermsAssignment_09462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_rule__JoinExpression__TermsAssignment_1_19493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_rule__JoinTerm__ReferenceAssignment_09524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelMapping_in_rule__JoinTerm__MappingAssignment_19555 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_rule__JoinTerm__GroupingAssignment_29586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__SummarizeModelDefinition__NameAssignment_19617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeExpression_in_rule__SummarizeModelDefinition__RhsAssignment_39648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_rule__SummarizeExpression__TermsAssignment_09679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_rule__SummarizeExpression__TermsAssignment_1_19710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_rule__SummarizeTerm__ReferenceAssignment_09741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelFolding_in_rule__SummarizeTerm__FoldingAssignment_19772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_rule__SummarizeTerm__GroupingAssignment_29803 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__AttributeList__AttributesAssignment9834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Attribute__NameAssignment_19865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElementList_in_rule__Attribute__ElementsAssignment_2_1_09896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_rule__AttributeElementList__ElementsAssignment_09927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_rule__AttributeElementList__ElementsAssignment_1_19958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__AttributeElement__NameAssignment_09989 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_rule__AttributeElement__ValueAssignment_210020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueArray_in_rule__AttributeValue__ValueAssignment_010051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__AttributeValue__ValueAssignment_110082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__AttributeValue__ValueAssignment_210113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_rule__AttributeValueArray__ElementsAssignment_110144 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_rule__AttributeValueArray__ElementsAssignment_2_110175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Grouping__NameAssignment_110206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Grouping__NameAssignment_2_110237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyMapping_in_rule__ModelMapping__MappingsAssignment_210268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__PropertyMapping__DescriptionAssignment_010299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__PropertyMapping__AttributesAssignment_110330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__PropertyMapping__FromAssignment_210361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__PropertyMapping__NameAssignment_410392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFolding_in_rule__ModelFolding__FoldingsAssignment_210423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__PropertyFolding__DescriptionAssignment_010454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__PropertyFolding__AttributesAssignment_110485 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PropertyFolding__AggregatorAssignment_210516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__PropertyFolding__FromAssignment_310547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__PropertyFolding__NameAssignment_510578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__QualifiedName__NameAssignment_010609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__QualifiedName__NameAssignment_1_110640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Literal__StringValueAssignment_010671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Literal__IntValueAssignment_110702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Literal__DecimalValueAssignment_210733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_rule__Literal__BooleanValueAssignment_310764 = new BitSet(new long[]{0x0000000000000002L});

}