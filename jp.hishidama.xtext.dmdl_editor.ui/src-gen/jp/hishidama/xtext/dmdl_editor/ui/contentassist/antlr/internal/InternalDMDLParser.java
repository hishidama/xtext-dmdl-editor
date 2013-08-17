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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME_TOKEN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'INT'", "'LONG'", "'BYTE'", "'SHORT'", "'DECIMAL'", "'FLOAT'", "'DOUBLE'", "'TEXT'", "'BOOLEAN'", "'DATE'", "'DATETIME'", "'='", "';'", "'+'", "'{'", "'}'", "':'"
    };
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=6;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_ML_COMMENT=5;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int RULE_NAME_TOKEN=4;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int T__10=10;
    public static final int RULE_WS=7;

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




    // $ANTLR start "entryRuleModels"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:60:1: entryRuleModels : ruleModels EOF ;
    public final void entryRuleModels() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:61:1: ( ruleModels EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:62:1: ruleModels EOF
            {
             before(grammarAccess.getModelsRule()); 
            pushFollow(FOLLOW_ruleModels_in_entryRuleModels61);
            ruleModels();

            state._fsp--;

             after(grammarAccess.getModelsRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModels68); 

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
    // $ANTLR end "entryRuleModels"


    // $ANTLR start "ruleModels"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:69:1: ruleModels : ( ( rule__Models__ListAssignment )* ) ;
    public final void ruleModels() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:73:2: ( ( ( rule__Models__ListAssignment )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:74:1: ( ( rule__Models__ListAssignment )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:74:1: ( ( rule__Models__ListAssignment )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:75:1: ( rule__Models__ListAssignment )*
            {
             before(grammarAccess.getModelsAccess().getListAssignment()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:76:1: ( rule__Models__ListAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_NAME_TOKEN) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:76:2: rule__Models__ListAssignment
            	    {
            	    pushFollow(FOLLOW_rule__Models__ListAssignment_in_ruleModels94);
            	    rule__Models__ListAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getModelsAccess().getListAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleModels"


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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:97:1: ruleModelDefinition : ( ruleRecordModelDefinition ) ;
    public final void ruleModelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:101:2: ( ( ruleRecordModelDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:102:1: ( ruleRecordModelDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:102:1: ( ruleRecordModelDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:103:1: ruleRecordModelDefinition
            {
             before(grammarAccess.getModelDefinitionAccess().getRecordModelDefinitionParserRuleCall()); 
            pushFollow(FOLLOW_ruleRecordModelDefinition_in_ruleModelDefinition155);
            ruleRecordModelDefinition();

            state._fsp--;

             after(grammarAccess.getModelDefinitionAccess().getRecordModelDefinitionParserRuleCall()); 

            }


            }

        }
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
            pushFollow(FOLLOW_ruleRecordModelDefinition_in_entryRuleRecordModelDefinition181);
            ruleRecordModelDefinition();

            state._fsp--;

             after(grammarAccess.getRecordModelDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordModelDefinition188); 

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
            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__0_in_ruleRecordModelDefinition214);
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


    // $ANTLR start "entryRuleRecordExpression"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:144:1: entryRuleRecordExpression : ruleRecordExpression EOF ;
    public final void entryRuleRecordExpression() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:145:1: ( ruleRecordExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:146:1: ruleRecordExpression EOF
            {
             before(grammarAccess.getRecordExpressionRule()); 
            pushFollow(FOLLOW_ruleRecordExpression_in_entryRuleRecordExpression241);
            ruleRecordExpression();

            state._fsp--;

             after(grammarAccess.getRecordExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordExpression248); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:153:1: ruleRecordExpression : ( ( rule__RecordExpression__Group__0 ) ) ;
    public final void ruleRecordExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:157:2: ( ( ( rule__RecordExpression__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:158:1: ( ( rule__RecordExpression__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:158:1: ( ( rule__RecordExpression__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:159:1: ( rule__RecordExpression__Group__0 )
            {
             before(grammarAccess.getRecordExpressionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:160:1: ( rule__RecordExpression__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:160:2: rule__RecordExpression__Group__0
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group__0_in_ruleRecordExpression274);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:172:1: entryRuleRecordTerm : ruleRecordTerm EOF ;
    public final void entryRuleRecordTerm() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:173:1: ( ruleRecordTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:174:1: ruleRecordTerm EOF
            {
             before(grammarAccess.getRecordTermRule()); 
            pushFollow(FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm301);
            ruleRecordTerm();

            state._fsp--;

             after(grammarAccess.getRecordTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordTerm308); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:181:1: ruleRecordTerm : ( ( rule__RecordTerm__Group__0 ) ) ;
    public final void ruleRecordTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:185:2: ( ( ( rule__RecordTerm__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:186:1: ( ( rule__RecordTerm__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:186:1: ( ( rule__RecordTerm__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:187:1: ( rule__RecordTerm__Group__0 )
            {
             before(grammarAccess.getRecordTermAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:188:1: ( rule__RecordTerm__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:188:2: rule__RecordTerm__Group__0
            {
            pushFollow(FOLLOW_rule__RecordTerm__Group__0_in_ruleRecordTerm334);
            rule__RecordTerm__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRecordTermAccess().getGroup()); 

            }


            }

        }
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


    // $ANTLR start "entryRulePropertyDefinition"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:200:1: entryRulePropertyDefinition : rulePropertyDefinition EOF ;
    public final void entryRulePropertyDefinition() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:201:1: ( rulePropertyDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:202:1: rulePropertyDefinition EOF
            {
             before(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition361);
            rulePropertyDefinition();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition368); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:209:1: rulePropertyDefinition : ( ( rule__PropertyDefinition__Group__0 ) ) ;
    public final void rulePropertyDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:213:2: ( ( ( rule__PropertyDefinition__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:214:1: ( ( rule__PropertyDefinition__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:214:1: ( ( rule__PropertyDefinition__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:215:1: ( rule__PropertyDefinition__Group__0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:216:1: ( rule__PropertyDefinition__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:216:2: rule__PropertyDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition394);
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


    // $ANTLR start "entryRuleName"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:228:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:229:1: ( ruleName EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:230:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName421);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName428); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:237:1: ruleName : ( RULE_NAME_TOKEN ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:241:2: ( ( RULE_NAME_TOKEN ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:242:1: ( RULE_NAME_TOKEN )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:242:1: ( RULE_NAME_TOKEN )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:243:1: RULE_NAME_TOKEN
            {
             before(grammarAccess.getNameAccess().getNAME_TOKENTerminalRuleCall()); 
            match(input,RULE_NAME_TOKEN,FOLLOW_RULE_NAME_TOKEN_in_ruleName454); 
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


    // $ANTLR start "ruleType"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:257:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:261:1: ( ( ( rule__Type__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:262:1: ( ( rule__Type__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:262:1: ( ( rule__Type__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:263:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:264:1: ( rule__Type__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:264:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType490);
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


    // $ANTLR start "rule__Type__Alternatives"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:275:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) | ( ( 'DECIMAL' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'TEXT' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'DATE' ) ) | ( ( 'DATETIME' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:279:1: ( ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) | ( ( 'DECIMAL' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'TEXT' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'DATE' ) ) | ( ( 'DATETIME' ) ) )
            int alt2=11;
            switch ( input.LA(1) ) {
            case 8:
                {
                alt2=1;
                }
                break;
            case 9:
                {
                alt2=2;
                }
                break;
            case 10:
                {
                alt2=3;
                }
                break;
            case 11:
                {
                alt2=4;
                }
                break;
            case 12:
                {
                alt2=5;
                }
                break;
            case 13:
                {
                alt2=6;
                }
                break;
            case 14:
                {
                alt2=7;
                }
                break;
            case 15:
                {
                alt2=8;
                }
                break;
            case 16:
                {
                alt2=9;
                }
                break;
            case 17:
                {
                alt2=10;
                }
                break;
            case 18:
                {
                alt2=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:280:1: ( ( 'INT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:280:1: ( ( 'INT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:281:1: ( 'INT' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:282:1: ( 'INT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:282:3: 'INT'
                    {
                    match(input,8,FOLLOW_8_in_rule__Type__Alternatives526); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:287:6: ( ( 'LONG' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:287:6: ( ( 'LONG' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:288:1: ( 'LONG' )
                    {
                     before(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:289:1: ( 'LONG' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:289:3: 'LONG'
                    {
                    match(input,9,FOLLOW_9_in_rule__Type__Alternatives547); 

                    }

                     after(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:294:6: ( ( 'BYTE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:294:6: ( ( 'BYTE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:295:1: ( 'BYTE' )
                    {
                     before(grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_2()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:296:1: ( 'BYTE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:296:3: 'BYTE'
                    {
                    match(input,10,FOLLOW_10_in_rule__Type__Alternatives568); 

                    }

                     after(grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:301:6: ( ( 'SHORT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:301:6: ( ( 'SHORT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:302:1: ( 'SHORT' )
                    {
                     before(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_3()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:303:1: ( 'SHORT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:303:3: 'SHORT'
                    {
                    match(input,11,FOLLOW_11_in_rule__Type__Alternatives589); 

                    }

                     after(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:308:6: ( ( 'DECIMAL' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:308:6: ( ( 'DECIMAL' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:309:1: ( 'DECIMAL' )
                    {
                     before(grammarAccess.getTypeAccess().getDECIMALEnumLiteralDeclaration_4()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:310:1: ( 'DECIMAL' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:310:3: 'DECIMAL'
                    {
                    match(input,12,FOLLOW_12_in_rule__Type__Alternatives610); 

                    }

                     after(grammarAccess.getTypeAccess().getDECIMALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:315:6: ( ( 'FLOAT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:315:6: ( ( 'FLOAT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:316:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:317:1: ( 'FLOAT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:317:3: 'FLOAT'
                    {
                    match(input,13,FOLLOW_13_in_rule__Type__Alternatives631); 

                    }

                     after(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:322:6: ( ( 'DOUBLE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:322:6: ( ( 'DOUBLE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:323:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:324:1: ( 'DOUBLE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:324:3: 'DOUBLE'
                    {
                    match(input,14,FOLLOW_14_in_rule__Type__Alternatives652); 

                    }

                     after(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:329:6: ( ( 'TEXT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:329:6: ( ( 'TEXT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:330:1: ( 'TEXT' )
                    {
                     before(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_7()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:331:1: ( 'TEXT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:331:3: 'TEXT'
                    {
                    match(input,15,FOLLOW_15_in_rule__Type__Alternatives673); 

                    }

                     after(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:336:6: ( ( 'BOOLEAN' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:336:6: ( ( 'BOOLEAN' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:337:1: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_8()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:338:1: ( 'BOOLEAN' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:338:3: 'BOOLEAN'
                    {
                    match(input,16,FOLLOW_16_in_rule__Type__Alternatives694); 

                    }

                     after(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:343:6: ( ( 'DATE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:343:6: ( ( 'DATE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:344:1: ( 'DATE' )
                    {
                     before(grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_9()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:345:1: ( 'DATE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:345:3: 'DATE'
                    {
                    match(input,17,FOLLOW_17_in_rule__Type__Alternatives715); 

                    }

                     after(grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:350:6: ( ( 'DATETIME' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:350:6: ( ( 'DATETIME' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:351:1: ( 'DATETIME' )
                    {
                     before(grammarAccess.getTypeAccess().getDATETIMEEnumLiteralDeclaration_10()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:352:1: ( 'DATETIME' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:352:3: 'DATETIME'
                    {
                    match(input,18,FOLLOW_18_in_rule__Type__Alternatives736); 

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


    // $ANTLR start "rule__RecordModelDefinition__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:364:1: rule__RecordModelDefinition__Group__0 : rule__RecordModelDefinition__Group__0__Impl rule__RecordModelDefinition__Group__1 ;
    public final void rule__RecordModelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:368:1: ( rule__RecordModelDefinition__Group__0__Impl rule__RecordModelDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:369:2: rule__RecordModelDefinition__Group__0__Impl rule__RecordModelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__0__Impl_in_rule__RecordModelDefinition__Group__0769);
            rule__RecordModelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__1_in_rule__RecordModelDefinition__Group__0772);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:376:1: rule__RecordModelDefinition__Group__0__Impl : ( ( rule__RecordModelDefinition__NameAssignment_0 ) ) ;
    public final void rule__RecordModelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:380:1: ( ( ( rule__RecordModelDefinition__NameAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:381:1: ( ( rule__RecordModelDefinition__NameAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:381:1: ( ( rule__RecordModelDefinition__NameAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:382:1: ( rule__RecordModelDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getNameAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:383:1: ( rule__RecordModelDefinition__NameAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:383:2: rule__RecordModelDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__NameAssignment_0_in_rule__RecordModelDefinition__Group__0__Impl799);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:393:1: rule__RecordModelDefinition__Group__1 : rule__RecordModelDefinition__Group__1__Impl rule__RecordModelDefinition__Group__2 ;
    public final void rule__RecordModelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:397:1: ( rule__RecordModelDefinition__Group__1__Impl rule__RecordModelDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:398:2: rule__RecordModelDefinition__Group__1__Impl rule__RecordModelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__1__Impl_in_rule__RecordModelDefinition__Group__1829);
            rule__RecordModelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__2_in_rule__RecordModelDefinition__Group__1832);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:405:1: rule__RecordModelDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__RecordModelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:409:1: ( ( '=' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:410:1: ( '=' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:410:1: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:411:1: '='
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getEqualsSignKeyword_1()); 
            match(input,19,FOLLOW_19_in_rule__RecordModelDefinition__Group__1__Impl860); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:424:1: rule__RecordModelDefinition__Group__2 : rule__RecordModelDefinition__Group__2__Impl rule__RecordModelDefinition__Group__3 ;
    public final void rule__RecordModelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:428:1: ( rule__RecordModelDefinition__Group__2__Impl rule__RecordModelDefinition__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:429:2: rule__RecordModelDefinition__Group__2__Impl rule__RecordModelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__2__Impl_in_rule__RecordModelDefinition__Group__2891);
            rule__RecordModelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__3_in_rule__RecordModelDefinition__Group__2894);
            rule__RecordModelDefinition__Group__3();

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:436:1: rule__RecordModelDefinition__Group__2__Impl : ( ( rule__RecordModelDefinition__RhsAssignment_2 ) ) ;
    public final void rule__RecordModelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:440:1: ( ( ( rule__RecordModelDefinition__RhsAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:441:1: ( ( rule__RecordModelDefinition__RhsAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:441:1: ( ( rule__RecordModelDefinition__RhsAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:442:1: ( rule__RecordModelDefinition__RhsAssignment_2 )
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getRhsAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:443:1: ( rule__RecordModelDefinition__RhsAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:443:2: rule__RecordModelDefinition__RhsAssignment_2
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__RhsAssignment_2_in_rule__RecordModelDefinition__Group__2__Impl921);
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


    // $ANTLR start "rule__RecordModelDefinition__Group__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:453:1: rule__RecordModelDefinition__Group__3 : rule__RecordModelDefinition__Group__3__Impl ;
    public final void rule__RecordModelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:457:1: ( rule__RecordModelDefinition__Group__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:458:2: rule__RecordModelDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__3__Impl_in_rule__RecordModelDefinition__Group__3951);
            rule__RecordModelDefinition__Group__3__Impl();

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
    // $ANTLR end "rule__RecordModelDefinition__Group__3"


    // $ANTLR start "rule__RecordModelDefinition__Group__3__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:464:1: rule__RecordModelDefinition__Group__3__Impl : ( ';' ) ;
    public final void rule__RecordModelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:468:1: ( ( ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:469:1: ( ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:469:1: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:470:1: ';'
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getSemicolonKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__RecordModelDefinition__Group__3__Impl979); 
             after(grammarAccess.getRecordModelDefinitionAccess().getSemicolonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordModelDefinition__Group__3__Impl"


    // $ANTLR start "rule__RecordExpression__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:491:1: rule__RecordExpression__Group__0 : rule__RecordExpression__Group__0__Impl rule__RecordExpression__Group__1 ;
    public final void rule__RecordExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:495:1: ( rule__RecordExpression__Group__0__Impl rule__RecordExpression__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:496:2: rule__RecordExpression__Group__0__Impl rule__RecordExpression__Group__1
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group__0__Impl_in_rule__RecordExpression__Group__01018);
            rule__RecordExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordExpression__Group__1_in_rule__RecordExpression__Group__01021);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:503:1: rule__RecordExpression__Group__0__Impl : ( ( rule__RecordExpression__BlockAssignment_0 ) ) ;
    public final void rule__RecordExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:507:1: ( ( ( rule__RecordExpression__BlockAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:508:1: ( ( rule__RecordExpression__BlockAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:508:1: ( ( rule__RecordExpression__BlockAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:509:1: ( rule__RecordExpression__BlockAssignment_0 )
            {
             before(grammarAccess.getRecordExpressionAccess().getBlockAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:510:1: ( rule__RecordExpression__BlockAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:510:2: rule__RecordExpression__BlockAssignment_0
            {
            pushFollow(FOLLOW_rule__RecordExpression__BlockAssignment_0_in_rule__RecordExpression__Group__0__Impl1048);
            rule__RecordExpression__BlockAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRecordExpressionAccess().getBlockAssignment_0()); 

            }


            }

        }
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:520:1: rule__RecordExpression__Group__1 : rule__RecordExpression__Group__1__Impl ;
    public final void rule__RecordExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:524:1: ( rule__RecordExpression__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:525:2: rule__RecordExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group__1__Impl_in_rule__RecordExpression__Group__11078);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:531:1: rule__RecordExpression__Group__1__Impl : ( ( rule__RecordExpression__Group_1__0 )* ) ;
    public final void rule__RecordExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:535:1: ( ( ( rule__RecordExpression__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:536:1: ( ( rule__RecordExpression__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:536:1: ( ( rule__RecordExpression__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:537:1: ( rule__RecordExpression__Group_1__0 )*
            {
             before(grammarAccess.getRecordExpressionAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:538:1: ( rule__RecordExpression__Group_1__0 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==21) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:538:2: rule__RecordExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RecordExpression__Group_1__0_in_rule__RecordExpression__Group__1__Impl1105);
            	    rule__RecordExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:552:1: rule__RecordExpression__Group_1__0 : rule__RecordExpression__Group_1__0__Impl rule__RecordExpression__Group_1__1 ;
    public final void rule__RecordExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:556:1: ( rule__RecordExpression__Group_1__0__Impl rule__RecordExpression__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:557:2: rule__RecordExpression__Group_1__0__Impl rule__RecordExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group_1__0__Impl_in_rule__RecordExpression__Group_1__01140);
            rule__RecordExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordExpression__Group_1__1_in_rule__RecordExpression__Group_1__01143);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:564:1: rule__RecordExpression__Group_1__0__Impl : ( '+' ) ;
    public final void rule__RecordExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:568:1: ( ( '+' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:569:1: ( '+' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:569:1: ( '+' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:570:1: '+'
            {
             before(grammarAccess.getRecordExpressionAccess().getPlusSignKeyword_1_0()); 
            match(input,21,FOLLOW_21_in_rule__RecordExpression__Group_1__0__Impl1171); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:583:1: rule__RecordExpression__Group_1__1 : rule__RecordExpression__Group_1__1__Impl ;
    public final void rule__RecordExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:587:1: ( rule__RecordExpression__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:588:2: rule__RecordExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group_1__1__Impl_in_rule__RecordExpression__Group_1__11202);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:594:1: rule__RecordExpression__Group_1__1__Impl : ( ( rule__RecordExpression__BlockAssignment_1_1 ) ) ;
    public final void rule__RecordExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:598:1: ( ( ( rule__RecordExpression__BlockAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:599:1: ( ( rule__RecordExpression__BlockAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:599:1: ( ( rule__RecordExpression__BlockAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:600:1: ( rule__RecordExpression__BlockAssignment_1_1 )
            {
             before(grammarAccess.getRecordExpressionAccess().getBlockAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:601:1: ( rule__RecordExpression__BlockAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:601:2: rule__RecordExpression__BlockAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RecordExpression__BlockAssignment_1_1_in_rule__RecordExpression__Group_1__1__Impl1229);
            rule__RecordExpression__BlockAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordExpressionAccess().getBlockAssignment_1_1()); 

            }


            }

        }
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


    // $ANTLR start "rule__RecordTerm__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:615:1: rule__RecordTerm__Group__0 : rule__RecordTerm__Group__0__Impl rule__RecordTerm__Group__1 ;
    public final void rule__RecordTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:619:1: ( rule__RecordTerm__Group__0__Impl rule__RecordTerm__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:620:2: rule__RecordTerm__Group__0__Impl rule__RecordTerm__Group__1
            {
            pushFollow(FOLLOW_rule__RecordTerm__Group__0__Impl_in_rule__RecordTerm__Group__01263);
            rule__RecordTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordTerm__Group__1_in_rule__RecordTerm__Group__01266);
            rule__RecordTerm__Group__1();

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
    // $ANTLR end "rule__RecordTerm__Group__0"


    // $ANTLR start "rule__RecordTerm__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:627:1: rule__RecordTerm__Group__0__Impl : ( '{' ) ;
    public final void rule__RecordTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:631:1: ( ( '{' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:632:1: ( '{' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:632:1: ( '{' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:633:1: '{'
            {
             before(grammarAccess.getRecordTermAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,22,FOLLOW_22_in_rule__RecordTerm__Group__0__Impl1294); 
             after(grammarAccess.getRecordTermAccess().getLeftCurlyBracketKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTerm__Group__0__Impl"


    // $ANTLR start "rule__RecordTerm__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:646:1: rule__RecordTerm__Group__1 : rule__RecordTerm__Group__1__Impl rule__RecordTerm__Group__2 ;
    public final void rule__RecordTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:650:1: ( rule__RecordTerm__Group__1__Impl rule__RecordTerm__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:651:2: rule__RecordTerm__Group__1__Impl rule__RecordTerm__Group__2
            {
            pushFollow(FOLLOW_rule__RecordTerm__Group__1__Impl_in_rule__RecordTerm__Group__11325);
            rule__RecordTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordTerm__Group__2_in_rule__RecordTerm__Group__11328);
            rule__RecordTerm__Group__2();

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
    // $ANTLR end "rule__RecordTerm__Group__1"


    // $ANTLR start "rule__RecordTerm__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:658:1: rule__RecordTerm__Group__1__Impl : ( ( ( rule__RecordTerm__PropertiesAssignment_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_1 )* ) ) ;
    public final void rule__RecordTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:662:1: ( ( ( ( rule__RecordTerm__PropertiesAssignment_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_1 )* ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:663:1: ( ( ( rule__RecordTerm__PropertiesAssignment_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_1 )* ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:663:1: ( ( ( rule__RecordTerm__PropertiesAssignment_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_1 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:664:1: ( ( rule__RecordTerm__PropertiesAssignment_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_1 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:664:1: ( ( rule__RecordTerm__PropertiesAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:665:1: ( rule__RecordTerm__PropertiesAssignment_1 )
            {
             before(grammarAccess.getRecordTermAccess().getPropertiesAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:666:1: ( rule__RecordTerm__PropertiesAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:666:2: rule__RecordTerm__PropertiesAssignment_1
            {
            pushFollow(FOLLOW_rule__RecordTerm__PropertiesAssignment_1_in_rule__RecordTerm__Group__1__Impl1357);
            rule__RecordTerm__PropertiesAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordTermAccess().getPropertiesAssignment_1()); 

            }

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:669:1: ( ( rule__RecordTerm__PropertiesAssignment_1 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:670:1: ( rule__RecordTerm__PropertiesAssignment_1 )*
            {
             before(grammarAccess.getRecordTermAccess().getPropertiesAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:671:1: ( rule__RecordTerm__PropertiesAssignment_1 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==RULE_NAME_TOKEN) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:671:2: rule__RecordTerm__PropertiesAssignment_1
            	    {
            	    pushFollow(FOLLOW_rule__RecordTerm__PropertiesAssignment_1_in_rule__RecordTerm__Group__1__Impl1369);
            	    rule__RecordTerm__PropertiesAssignment_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getRecordTermAccess().getPropertiesAssignment_1()); 

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
    // $ANTLR end "rule__RecordTerm__Group__1__Impl"


    // $ANTLR start "rule__RecordTerm__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:682:1: rule__RecordTerm__Group__2 : rule__RecordTerm__Group__2__Impl ;
    public final void rule__RecordTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:686:1: ( rule__RecordTerm__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:687:2: rule__RecordTerm__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RecordTerm__Group__2__Impl_in_rule__RecordTerm__Group__21402);
            rule__RecordTerm__Group__2__Impl();

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
    // $ANTLR end "rule__RecordTerm__Group__2"


    // $ANTLR start "rule__RecordTerm__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:693:1: rule__RecordTerm__Group__2__Impl : ( '}' ) ;
    public final void rule__RecordTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:697:1: ( ( '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:698:1: ( '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:698:1: ( '}' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:699:1: '}'
            {
             before(grammarAccess.getRecordTermAccess().getRightCurlyBracketKeyword_2()); 
            match(input,23,FOLLOW_23_in_rule__RecordTerm__Group__2__Impl1430); 
             after(grammarAccess.getRecordTermAccess().getRightCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTerm__Group__2__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:718:1: rule__PropertyDefinition__Group__0 : rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 ;
    public final void rule__PropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:722:1: ( rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:723:2: rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__01467);
            rule__PropertyDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__01470);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:730:1: rule__PropertyDefinition__Group__0__Impl : ( ( rule__PropertyDefinition__NameAssignment_0 ) ) ;
    public final void rule__PropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:734:1: ( ( ( rule__PropertyDefinition__NameAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:735:1: ( ( rule__PropertyDefinition__NameAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:735:1: ( ( rule__PropertyDefinition__NameAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:736:1: ( rule__PropertyDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:737:1: ( rule__PropertyDefinition__NameAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:737:2: rule__PropertyDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__NameAssignment_0_in_rule__PropertyDefinition__Group__0__Impl1497);
            rule__PropertyDefinition__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_0()); 

            }


            }

        }
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:747:1: rule__PropertyDefinition__Group__1 : rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 ;
    public final void rule__PropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:751:1: ( rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:752:2: rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__11527);
            rule__PropertyDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__11530);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:759:1: rule__PropertyDefinition__Group__1__Impl : ( ':' ) ;
    public final void rule__PropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:763:1: ( ( ':' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:764:1: ( ':' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:764:1: ( ':' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:765:1: ':'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getColonKeyword_1()); 
            match(input,24,FOLLOW_24_in_rule__PropertyDefinition__Group__1__Impl1558); 
             after(grammarAccess.getPropertyDefinitionAccess().getColonKeyword_1()); 

            }


            }

        }
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:778:1: rule__PropertyDefinition__Group__2 : rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 ;
    public final void rule__PropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:782:1: ( rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:783:2: rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__21589);
            rule__PropertyDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__21592);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:790:1: rule__PropertyDefinition__Group__2__Impl : ( ( rule__PropertyDefinition__TypeAssignment_2 ) ) ;
    public final void rule__PropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:794:1: ( ( ( rule__PropertyDefinition__TypeAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:795:1: ( ( rule__PropertyDefinition__TypeAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:795:1: ( ( rule__PropertyDefinition__TypeAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:796:1: ( rule__PropertyDefinition__TypeAssignment_2 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:797:1: ( rule__PropertyDefinition__TypeAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:797:2: rule__PropertyDefinition__TypeAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__TypeAssignment_2_in_rule__PropertyDefinition__Group__2__Impl1619);
            rule__PropertyDefinition__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_2()); 

            }


            }

        }
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:807:1: rule__PropertyDefinition__Group__3 : rule__PropertyDefinition__Group__3__Impl ;
    public final void rule__PropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:811:1: ( rule__PropertyDefinition__Group__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:812:2: rule__PropertyDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__31649);
            rule__PropertyDefinition__Group__3__Impl();

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:818:1: rule__PropertyDefinition__Group__3__Impl : ( ';' ) ;
    public final void rule__PropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:822:1: ( ( ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:823:1: ( ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:823:1: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:824:1: ';'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_3()); 
            match(input,20,FOLLOW_20_in_rule__PropertyDefinition__Group__3__Impl1677); 
             after(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__Models__ListAssignment"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:846:1: rule__Models__ListAssignment : ( ruleModelDefinition ) ;
    public final void rule__Models__ListAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:850:1: ( ( ruleModelDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:851:1: ( ruleModelDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:851:1: ( ruleModelDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:852:1: ruleModelDefinition
            {
             before(grammarAccess.getModelsAccess().getListModelDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleModelDefinition_in_rule__Models__ListAssignment1721);
            ruleModelDefinition();

            state._fsp--;

             after(grammarAccess.getModelsAccess().getListModelDefinitionParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Models__ListAssignment"


    // $ANTLR start "rule__RecordModelDefinition__NameAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:861:1: rule__RecordModelDefinition__NameAssignment_0 : ( ruleName ) ;
    public final void rule__RecordModelDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:865:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:866:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:866:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:867:1: ruleName
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__RecordModelDefinition__NameAssignment_01752);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:876:1: rule__RecordModelDefinition__RhsAssignment_2 : ( ruleRecordExpression ) ;
    public final void rule__RecordModelDefinition__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:880:1: ( ( ruleRecordExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:881:1: ( ruleRecordExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:881:1: ( ruleRecordExpression )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:882:1: ruleRecordExpression
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getRhsRecordExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRecordExpression_in_rule__RecordModelDefinition__RhsAssignment_21783);
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


    // $ANTLR start "rule__RecordExpression__BlockAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:891:1: rule__RecordExpression__BlockAssignment_0 : ( ruleRecordTerm ) ;
    public final void rule__RecordExpression__BlockAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:895:1: ( ( ruleRecordTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:896:1: ( ruleRecordTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:896:1: ( ruleRecordTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:897:1: ruleRecordTerm
            {
             before(grammarAccess.getRecordExpressionAccess().getBlockRecordTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRecordTerm_in_rule__RecordExpression__BlockAssignment_01814);
            ruleRecordTerm();

            state._fsp--;

             after(grammarAccess.getRecordExpressionAccess().getBlockRecordTermParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordExpression__BlockAssignment_0"


    // $ANTLR start "rule__RecordExpression__BlockAssignment_1_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:906:1: rule__RecordExpression__BlockAssignment_1_1 : ( ruleRecordTerm ) ;
    public final void rule__RecordExpression__BlockAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:910:1: ( ( ruleRecordTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:911:1: ( ruleRecordTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:911:1: ( ruleRecordTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:912:1: ruleRecordTerm
            {
             before(grammarAccess.getRecordExpressionAccess().getBlockRecordTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRecordTerm_in_rule__RecordExpression__BlockAssignment_1_11845);
            ruleRecordTerm();

            state._fsp--;

             after(grammarAccess.getRecordExpressionAccess().getBlockRecordTermParserRuleCall_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordExpression__BlockAssignment_1_1"


    // $ANTLR start "rule__RecordTerm__PropertiesAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:921:1: rule__RecordTerm__PropertiesAssignment_1 : ( rulePropertyDefinition ) ;
    public final void rule__RecordTerm__PropertiesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:925:1: ( ( rulePropertyDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:926:1: ( rulePropertyDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:926:1: ( rulePropertyDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:927:1: rulePropertyDefinition
            {
             before(grammarAccess.getRecordTermAccess().getPropertiesPropertyDefinitionParserRuleCall_1_0()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_rule__RecordTerm__PropertiesAssignment_11876);
            rulePropertyDefinition();

            state._fsp--;

             after(grammarAccess.getRecordTermAccess().getPropertiesPropertyDefinitionParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTerm__PropertiesAssignment_1"


    // $ANTLR start "rule__PropertyDefinition__NameAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:936:1: rule__PropertyDefinition__NameAssignment_0 : ( ruleName ) ;
    public final void rule__PropertyDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:940:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:941:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:941:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:942:1: ruleName
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__PropertyDefinition__NameAssignment_01907);
            ruleName();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getNameNameParserRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__NameAssignment_0"


    // $ANTLR start "rule__PropertyDefinition__TypeAssignment_2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:951:1: rule__PropertyDefinition__TypeAssignment_2 : ( ruleType ) ;
    public final void rule__PropertyDefinition__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:955:1: ( ( ruleType ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:956:1: ( ruleType )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:956:1: ( ruleType )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:957:1: ruleType
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypeTypeEnumRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__PropertyDefinition__TypeAssignment_21938);
            ruleType();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionAccess().getTypeTypeEnumRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PropertyDefinition__TypeAssignment_2"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModels_in_entryRuleModels61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModels68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Models__ListAssignment_in_ruleModels94 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_entryRuleModelDefinition122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelDefinition129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordModelDefinition_in_ruleModelDefinition155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordModelDefinition_in_entryRuleRecordModelDefinition181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordModelDefinition188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__0_in_ruleRecordModelDefinition214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_entryRuleRecordExpression241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordExpression248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__0_in_ruleRecordExpression274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordTerm308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group__0_in_ruleRecordTerm334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName421 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_TOKEN_in_ruleName454 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType490 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_8_in_rule__Type__Alternatives526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_9_in_rule__Type__Alternatives547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_10_in_rule__Type__Alternatives568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__Type__Alternatives589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__Type__Alternatives610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__Alternatives631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__Alternatives652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type__Alternatives673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type__Alternatives694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type__Alternatives715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type__Alternatives736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__0__Impl_in_rule__RecordModelDefinition__Group__0769 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__1_in_rule__RecordModelDefinition__Group__0772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__NameAssignment_0_in_rule__RecordModelDefinition__Group__0__Impl799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__1__Impl_in_rule__RecordModelDefinition__Group__1829 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__2_in_rule__RecordModelDefinition__Group__1832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__RecordModelDefinition__Group__1__Impl860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__2__Impl_in_rule__RecordModelDefinition__Group__2891 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__3_in_rule__RecordModelDefinition__Group__2894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__RhsAssignment_2_in_rule__RecordModelDefinition__Group__2__Impl921 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__3__Impl_in_rule__RecordModelDefinition__Group__3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__RecordModelDefinition__Group__3__Impl979 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__0__Impl_in_rule__RecordExpression__Group__01018 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__1_in_rule__RecordExpression__Group__01021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__BlockAssignment_0_in_rule__RecordExpression__Group__0__Impl1048 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__1__Impl_in_rule__RecordExpression__Group__11078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__0_in_rule__RecordExpression__Group__1__Impl1105 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__0__Impl_in_rule__RecordExpression__Group_1__01140 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__1_in_rule__RecordExpression__Group_1__01143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__RecordExpression__Group_1__0__Impl1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__1__Impl_in_rule__RecordExpression__Group_1__11202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__BlockAssignment_1_1_in_rule__RecordExpression__Group_1__1__Impl1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group__0__Impl_in_rule__RecordTerm__Group__01263 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group__1_in_rule__RecordTerm__Group__01266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__RecordTerm__Group__0__Impl1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group__1__Impl_in_rule__RecordTerm__Group__11325 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group__2_in_rule__RecordTerm__Group__11328 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__PropertiesAssignment_1_in_rule__RecordTerm__Group__1__Impl1357 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__RecordTerm__PropertiesAssignment_1_in_rule__RecordTerm__Group__1__Impl1369 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group__2__Impl_in_rule__RecordTerm__Group__21402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__RecordTerm__Group__2__Impl1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__01467 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__01470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NameAssignment_0_in_rule__PropertyDefinition__Group__0__Impl1497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__11527 = new BitSet(new long[]{0x000000000007FF00L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__11530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__PropertyDefinition__Group__1__Impl1558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__21589 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__21592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__TypeAssignment_2_in_rule__PropertyDefinition__Group__2__Impl1619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__31649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__PropertyDefinition__Group__3__Impl1677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_rule__Models__ListAssignment1721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__RecordModelDefinition__NameAssignment_01752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_rule__RecordModelDefinition__RhsAssignment_21783 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_rule__RecordExpression__BlockAssignment_01814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_rule__RecordExpression__BlockAssignment_1_11845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_rule__RecordTerm__PropertiesAssignment_11876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__PropertyDefinition__NameAssignment_01907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__PropertyDefinition__TypeAssignment_21938 = new BitSet(new long[]{0x0000000000000002L});

}