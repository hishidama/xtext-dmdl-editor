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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NAME_TOKEN", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'->'", "'=>'", "'INT'", "'LONG'", "'BYTE'", "'SHORT'", "'DECIMAL'", "'FLOAT'", "'DOUBLE'", "'TEXT'", "'BOOLEAN'", "'DATE'", "'DATETIME'", "'TRUE'", "'FALSE'", "';'", "'='", "'+'", "'{'", "'}'", "':'", "'summarized'", "'@'", "'('", "')'", "','", "'%'", "'.'"
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

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_NAME_TOKEN)||(LA1_0>=32 && LA1_0<=33)) ) {
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


    // $ANTLR start "entryRuleRecordExpression"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:144:1: entryRuleRecordExpression : ruleRecordExpression EOF ;
    public final void entryRuleRecordExpression() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:145:1: ( ruleRecordExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:146:1: ruleRecordExpression EOF
            {
             before(grammarAccess.getRecordExpressionRule()); 
            pushFollow(FOLLOW_ruleRecordExpression_in_entryRuleRecordExpression242);
            ruleRecordExpression();

            state._fsp--;

             after(grammarAccess.getRecordExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordExpression249); 

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
            pushFollow(FOLLOW_rule__RecordExpression__Group__0_in_ruleRecordExpression275);
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
            pushFollow(FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm302);
            ruleRecordTerm();

            state._fsp--;

             after(grammarAccess.getRecordTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordTerm309); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:181:1: ruleRecordTerm : ( ( rule__RecordTerm__Alternatives ) ) ;
    public final void ruleRecordTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:185:2: ( ( ( rule__RecordTerm__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:186:1: ( ( rule__RecordTerm__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:186:1: ( ( rule__RecordTerm__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:187:1: ( rule__RecordTerm__Alternatives )
            {
             before(grammarAccess.getRecordTermAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:188:1: ( rule__RecordTerm__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:188:2: rule__RecordTerm__Alternatives
            {
            pushFollow(FOLLOW_rule__RecordTerm__Alternatives_in_ruleRecordTerm335);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:200:1: entryRuleModelReference : ruleModelReference EOF ;
    public final void entryRuleModelReference() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:201:1: ( ruleModelReference EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:202:1: ruleModelReference EOF
            {
             before(grammarAccess.getModelReferenceRule()); 
            pushFollow(FOLLOW_ruleModelReference_in_entryRuleModelReference362);
            ruleModelReference();

            state._fsp--;

             after(grammarAccess.getModelReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelReference369); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:209:1: ruleModelReference : ( ( rule__ModelReference__NameAssignment ) ) ;
    public final void ruleModelReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:213:2: ( ( ( rule__ModelReference__NameAssignment ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:214:1: ( ( rule__ModelReference__NameAssignment ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:214:1: ( ( rule__ModelReference__NameAssignment ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:215:1: ( rule__ModelReference__NameAssignment )
            {
             before(grammarAccess.getModelReferenceAccess().getNameAssignment()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:216:1: ( rule__ModelReference__NameAssignment )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:216:2: rule__ModelReference__NameAssignment
            {
            pushFollow(FOLLOW_rule__ModelReference__NameAssignment_in_ruleModelReference395);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:228:1: entryRulePropertyDefinition : rulePropertyDefinition EOF ;
    public final void entryRulePropertyDefinition() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:229:1: ( rulePropertyDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:230:1: rulePropertyDefinition EOF
            {
             before(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition422);
            rulePropertyDefinition();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition429); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:237:1: rulePropertyDefinition : ( ( rule__PropertyDefinition__Group__0 ) ) ;
    public final void rulePropertyDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:241:2: ( ( ( rule__PropertyDefinition__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:242:1: ( ( rule__PropertyDefinition__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:242:1: ( ( rule__PropertyDefinition__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:243:1: ( rule__PropertyDefinition__Group__0 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:244:1: ( rule__PropertyDefinition__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:244:2: rule__PropertyDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition455);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:256:1: entryRuleSummarizeModelDefinition : ruleSummarizeModelDefinition EOF ;
    public final void entryRuleSummarizeModelDefinition() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:257:1: ( ruleSummarizeModelDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:258:1: ruleSummarizeModelDefinition EOF
            {
             before(grammarAccess.getSummarizeModelDefinitionRule()); 
            pushFollow(FOLLOW_ruleSummarizeModelDefinition_in_entryRuleSummarizeModelDefinition482);
            ruleSummarizeModelDefinition();

            state._fsp--;

             after(grammarAccess.getSummarizeModelDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeModelDefinition489); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:265:1: ruleSummarizeModelDefinition : ( ( rule__SummarizeModelDefinition__Group__0 ) ) ;
    public final void ruleSummarizeModelDefinition() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:269:2: ( ( ( rule__SummarizeModelDefinition__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:270:1: ( ( rule__SummarizeModelDefinition__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:270:1: ( ( rule__SummarizeModelDefinition__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:271:1: ( rule__SummarizeModelDefinition__Group__0 )
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:272:1: ( rule__SummarizeModelDefinition__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:272:2: rule__SummarizeModelDefinition__Group__0
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__0_in_ruleSummarizeModelDefinition515);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:284:1: entryRuleSummarizeExpression : ruleSummarizeExpression EOF ;
    public final void entryRuleSummarizeExpression() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:285:1: ( ruleSummarizeExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:286:1: ruleSummarizeExpression EOF
            {
             before(grammarAccess.getSummarizeExpressionRule()); 
            pushFollow(FOLLOW_ruleSummarizeExpression_in_entryRuleSummarizeExpression542);
            ruleSummarizeExpression();

            state._fsp--;

             after(grammarAccess.getSummarizeExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeExpression549); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:293:1: ruleSummarizeExpression : ( ( rule__SummarizeExpression__Group__0 ) ) ;
    public final void ruleSummarizeExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:297:2: ( ( ( rule__SummarizeExpression__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:298:1: ( ( rule__SummarizeExpression__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:298:1: ( ( rule__SummarizeExpression__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:299:1: ( rule__SummarizeExpression__Group__0 )
            {
             before(grammarAccess.getSummarizeExpressionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:300:1: ( rule__SummarizeExpression__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:300:2: rule__SummarizeExpression__Group__0
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group__0_in_ruleSummarizeExpression575);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:312:1: entryRuleSummarizeTerm : ruleSummarizeTerm EOF ;
    public final void entryRuleSummarizeTerm() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:313:1: ( ruleSummarizeTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:314:1: ruleSummarizeTerm EOF
            {
             before(grammarAccess.getSummarizeTermRule()); 
            pushFollow(FOLLOW_ruleSummarizeTerm_in_entryRuleSummarizeTerm602);
            ruleSummarizeTerm();

            state._fsp--;

             after(grammarAccess.getSummarizeTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeTerm609); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:321:1: ruleSummarizeTerm : ( ( rule__SummarizeTerm__Group__0 ) ) ;
    public final void ruleSummarizeTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:325:2: ( ( ( rule__SummarizeTerm__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:326:1: ( ( rule__SummarizeTerm__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:326:1: ( ( rule__SummarizeTerm__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:327:1: ( rule__SummarizeTerm__Group__0 )
            {
             before(grammarAccess.getSummarizeTermAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:328:1: ( rule__SummarizeTerm__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:328:2: rule__SummarizeTerm__Group__0
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__Group__0_in_ruleSummarizeTerm635);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:340:1: entryRuleDescription : ruleDescription EOF ;
    public final void entryRuleDescription() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:341:1: ( ruleDescription EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:342:1: ruleDescription EOF
            {
             before(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription662);
            ruleDescription();

            state._fsp--;

             after(grammarAccess.getDescriptionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription669); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:349:1: ruleDescription : ( RULE_STRING ) ;
    public final void ruleDescription() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:353:2: ( ( RULE_STRING ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:354:1: ( RULE_STRING )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:354:1: ( RULE_STRING )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:355:1: RULE_STRING
            {
             before(grammarAccess.getDescriptionAccess().getSTRINGTerminalRuleCall()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDescription695); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:368:1: entryRuleAttributeList : ruleAttributeList EOF ;
    public final void entryRuleAttributeList() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:369:1: ( ruleAttributeList EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:370:1: ruleAttributeList EOF
            {
             before(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_ruleAttributeList_in_entryRuleAttributeList721);
            ruleAttributeList();

            state._fsp--;

             after(grammarAccess.getAttributeListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeList728); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:377:1: ruleAttributeList : ( ( ( rule__AttributeList__AttributesAssignment ) ) ( ( rule__AttributeList__AttributesAssignment )* ) ) ;
    public final void ruleAttributeList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:381:2: ( ( ( ( rule__AttributeList__AttributesAssignment ) ) ( ( rule__AttributeList__AttributesAssignment )* ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:382:1: ( ( ( rule__AttributeList__AttributesAssignment ) ) ( ( rule__AttributeList__AttributesAssignment )* ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:382:1: ( ( ( rule__AttributeList__AttributesAssignment ) ) ( ( rule__AttributeList__AttributesAssignment )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:383:1: ( ( rule__AttributeList__AttributesAssignment ) ) ( ( rule__AttributeList__AttributesAssignment )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:383:1: ( ( rule__AttributeList__AttributesAssignment ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:384:1: ( rule__AttributeList__AttributesAssignment )
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:385:1: ( rule__AttributeList__AttributesAssignment )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:385:2: rule__AttributeList__AttributesAssignment
            {
            pushFollow(FOLLOW_rule__AttributeList__AttributesAssignment_in_ruleAttributeList756);
            rule__AttributeList__AttributesAssignment();

            state._fsp--;


            }

             after(grammarAccess.getAttributeListAccess().getAttributesAssignment()); 

            }

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:388:1: ( ( rule__AttributeList__AttributesAssignment )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:389:1: ( rule__AttributeList__AttributesAssignment )*
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAssignment()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:390:1: ( rule__AttributeList__AttributesAssignment )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==33) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:390:2: rule__AttributeList__AttributesAssignment
            	    {
            	    pushFollow(FOLLOW_rule__AttributeList__AttributesAssignment_in_ruleAttributeList768);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:403:1: entryRuleAttribute : ruleAttribute EOF ;
    public final void entryRuleAttribute() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:404:1: ( ruleAttribute EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:405:1: ruleAttribute EOF
            {
             before(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute798);
            ruleAttribute();

            state._fsp--;

             after(grammarAccess.getAttributeRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute805); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:412:1: ruleAttribute : ( ( rule__Attribute__Group__0 ) ) ;
    public final void ruleAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:416:2: ( ( ( rule__Attribute__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:417:1: ( ( rule__Attribute__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:417:1: ( ( rule__Attribute__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:418:1: ( rule__Attribute__Group__0 )
            {
             before(grammarAccess.getAttributeAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:419:1: ( rule__Attribute__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:419:2: rule__Attribute__Group__0
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0_in_ruleAttribute831);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:431:1: entryRuleAttributeElementList : ruleAttributeElementList EOF ;
    public final void entryRuleAttributeElementList() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:432:1: ( ruleAttributeElementList EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:433:1: ruleAttributeElementList EOF
            {
             before(grammarAccess.getAttributeElementListRule()); 
            pushFollow(FOLLOW_ruleAttributeElementList_in_entryRuleAttributeElementList858);
            ruleAttributeElementList();

            state._fsp--;

             after(grammarAccess.getAttributeElementListRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElementList865); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:440:1: ruleAttributeElementList : ( ( rule__AttributeElementList__Group__0 ) ) ;
    public final void ruleAttributeElementList() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:444:2: ( ( ( rule__AttributeElementList__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:445:1: ( ( rule__AttributeElementList__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:445:1: ( ( rule__AttributeElementList__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:446:1: ( rule__AttributeElementList__Group__0 )
            {
             before(grammarAccess.getAttributeElementListAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:447:1: ( rule__AttributeElementList__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:447:2: rule__AttributeElementList__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group__0_in_ruleAttributeElementList891);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:459:1: entryRuleAttributeElement : ruleAttributeElement EOF ;
    public final void entryRuleAttributeElement() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:460:1: ( ruleAttributeElement EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:461:1: ruleAttributeElement EOF
            {
             before(grammarAccess.getAttributeElementRule()); 
            pushFollow(FOLLOW_ruleAttributeElement_in_entryRuleAttributeElement918);
            ruleAttributeElement();

            state._fsp--;

             after(grammarAccess.getAttributeElementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElement925); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:468:1: ruleAttributeElement : ( ( rule__AttributeElement__Group__0 ) ) ;
    public final void ruleAttributeElement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:472:2: ( ( ( rule__AttributeElement__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:473:1: ( ( rule__AttributeElement__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:473:1: ( ( rule__AttributeElement__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:474:1: ( rule__AttributeElement__Group__0 )
            {
             before(grammarAccess.getAttributeElementAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:475:1: ( rule__AttributeElement__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:475:2: rule__AttributeElement__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeElement__Group__0_in_ruleAttributeElement951);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:487:1: entryRuleAttributeValue : ruleAttributeValue EOF ;
    public final void entryRuleAttributeValue() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:488:1: ( ruleAttributeValue EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:489:1: ruleAttributeValue EOF
            {
             before(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue978);
            ruleAttributeValue();

            state._fsp--;

             after(grammarAccess.getAttributeValueRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue985); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:496:1: ruleAttributeValue : ( ( rule__AttributeValue__Alternatives ) ) ;
    public final void ruleAttributeValue() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:500:2: ( ( ( rule__AttributeValue__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:501:1: ( ( rule__AttributeValue__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:501:1: ( ( rule__AttributeValue__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:502:1: ( rule__AttributeValue__Alternatives )
            {
             before(grammarAccess.getAttributeValueAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:503:1: ( rule__AttributeValue__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:503:2: rule__AttributeValue__Alternatives
            {
            pushFollow(FOLLOW_rule__AttributeValue__Alternatives_in_ruleAttributeValue1011);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:515:1: entryRuleAttributeValueArray : ruleAttributeValueArray EOF ;
    public final void entryRuleAttributeValueArray() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:516:1: ( ruleAttributeValueArray EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:517:1: ruleAttributeValueArray EOF
            {
             before(grammarAccess.getAttributeValueArrayRule()); 
            pushFollow(FOLLOW_ruleAttributeValueArray_in_entryRuleAttributeValueArray1038);
            ruleAttributeValueArray();

            state._fsp--;

             after(grammarAccess.getAttributeValueArrayRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValueArray1045); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:524:1: ruleAttributeValueArray : ( ( rule__AttributeValueArray__Group__0 ) ) ;
    public final void ruleAttributeValueArray() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:528:2: ( ( ( rule__AttributeValueArray__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:529:1: ( ( rule__AttributeValueArray__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:529:1: ( ( rule__AttributeValueArray__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:530:1: ( rule__AttributeValueArray__Group__0 )
            {
             before(grammarAccess.getAttributeValueArrayAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:531:1: ( rule__AttributeValueArray__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:531:2: rule__AttributeValueArray__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__0_in_ruleAttributeValueArray1071);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:543:1: entryRuleGrouping : ruleGrouping EOF ;
    public final void entryRuleGrouping() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:544:1: ( ruleGrouping EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:545:1: ruleGrouping EOF
            {
             before(grammarAccess.getGroupingRule()); 
            pushFollow(FOLLOW_ruleGrouping_in_entryRuleGrouping1098);
            ruleGrouping();

            state._fsp--;

             after(grammarAccess.getGroupingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouping1105); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:552:1: ruleGrouping : ( ( rule__Grouping__Group__0 ) ) ;
    public final void ruleGrouping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:556:2: ( ( ( rule__Grouping__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:557:1: ( ( rule__Grouping__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:557:1: ( ( rule__Grouping__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:558:1: ( rule__Grouping__Group__0 )
            {
             before(grammarAccess.getGroupingAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:559:1: ( rule__Grouping__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:559:2: rule__Grouping__Group__0
            {
            pushFollow(FOLLOW_rule__Grouping__Group__0_in_ruleGrouping1131);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:571:1: entryRuleModelFolding : ruleModelFolding EOF ;
    public final void entryRuleModelFolding() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:572:1: ( ruleModelFolding EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:573:1: ruleModelFolding EOF
            {
             before(grammarAccess.getModelFoldingRule()); 
            pushFollow(FOLLOW_ruleModelFolding_in_entryRuleModelFolding1158);
            ruleModelFolding();

            state._fsp--;

             after(grammarAccess.getModelFoldingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelFolding1165); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:580:1: ruleModelFolding : ( ( rule__ModelFolding__Group__0 ) ) ;
    public final void ruleModelFolding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:584:2: ( ( ( rule__ModelFolding__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:585:1: ( ( rule__ModelFolding__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:585:1: ( ( rule__ModelFolding__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:586:1: ( rule__ModelFolding__Group__0 )
            {
             before(grammarAccess.getModelFoldingAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:587:1: ( rule__ModelFolding__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:587:2: rule__ModelFolding__Group__0
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__0_in_ruleModelFolding1191);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:599:1: entryRulePropertyFolding : rulePropertyFolding EOF ;
    public final void entryRulePropertyFolding() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:600:1: ( rulePropertyFolding EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:601:1: rulePropertyFolding EOF
            {
             before(grammarAccess.getPropertyFoldingRule()); 
            pushFollow(FOLLOW_rulePropertyFolding_in_entryRulePropertyFolding1218);
            rulePropertyFolding();

            state._fsp--;

             after(grammarAccess.getPropertyFoldingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyFolding1225); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:608:1: rulePropertyFolding : ( ( rule__PropertyFolding__Group__0 ) ) ;
    public final void rulePropertyFolding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:612:2: ( ( ( rule__PropertyFolding__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:613:1: ( ( rule__PropertyFolding__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:613:1: ( ( rule__PropertyFolding__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:614:1: ( rule__PropertyFolding__Group__0 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:615:1: ( rule__PropertyFolding__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:615:2: rule__PropertyFolding__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__0_in_rulePropertyFolding1251);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:627:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:628:1: ( ruleQualifiedName EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:629:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1278);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1285); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:636:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:640:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:641:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:641:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:642:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:643:1: ( rule__QualifiedName__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:643:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1311);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:655:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:656:1: ( ruleName EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:657:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName1338);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName1345); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:664:1: ruleName : ( RULE_NAME_TOKEN ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:668:2: ( ( RULE_NAME_TOKEN ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:669:1: ( RULE_NAME_TOKEN )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:669:1: ( RULE_NAME_TOKEN )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:670:1: RULE_NAME_TOKEN
            {
             before(grammarAccess.getNameAccess().getNAME_TOKENTerminalRuleCall()); 
            match(input,RULE_NAME_TOKEN,FOLLOW_RULE_NAME_TOKEN_in_ruleName1371); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:683:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:684:1: ( ruleLiteral EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:685:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1397);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1404); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:692:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:696:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:697:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:697:1: ( ( rule__Literal__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:698:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:699:1: ( rule__Literal__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:699:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1430);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:712:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:716:1: ( ( ( rule__Type__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:717:1: ( ( rule__Type__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:717:1: ( ( rule__Type__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:718:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:719:1: ( rule__Type__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:719:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1467);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:731:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:735:1: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:736:1: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:736:1: ( ( rule__BOOLEAN__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:737:1: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:738:1: ( rule__BOOLEAN__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:738:2: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN1503);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:749:1: rule__ModelDefinition__Alternatives_2 : ( ( ( rule__ModelDefinition__ModelAssignment_2_0 ) ) | ( ( rule__ModelDefinition__ModelAssignment_2_1 ) ) );
    public final void rule__ModelDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:753:1: ( ( ( rule__ModelDefinition__ModelAssignment_2_0 ) ) | ( ( rule__ModelDefinition__ModelAssignment_2_1 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_NAME_TOKEN) ) {
                alt3=1;
            }
            else if ( (LA3_0==32) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:754:1: ( ( rule__ModelDefinition__ModelAssignment_2_0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:754:1: ( ( rule__ModelDefinition__ModelAssignment_2_0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:755:1: ( rule__ModelDefinition__ModelAssignment_2_0 )
                    {
                     before(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:756:1: ( rule__ModelDefinition__ModelAssignment_2_0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:756:2: rule__ModelDefinition__ModelAssignment_2_0
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__ModelAssignment_2_0_in_rule__ModelDefinition__Alternatives_21538);
                    rule__ModelDefinition__ModelAssignment_2_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:760:6: ( ( rule__ModelDefinition__ModelAssignment_2_1 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:760:6: ( ( rule__ModelDefinition__ModelAssignment_2_1 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:761:1: ( rule__ModelDefinition__ModelAssignment_2_1 )
                    {
                     before(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:762:1: ( rule__ModelDefinition__ModelAssignment_2_1 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:762:2: rule__ModelDefinition__ModelAssignment_2_1
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__ModelAssignment_2_1_in_rule__ModelDefinition__Alternatives_21556);
                    rule__ModelDefinition__ModelAssignment_2_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelDefinitionAccess().getModelAssignment_2_1()); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:771:1: rule__RecordTerm__Alternatives : ( ( ( rule__RecordTerm__Group_0__0 ) ) | ( ( rule__RecordTerm__ReferenceAssignment_1 ) ) );
    public final void rule__RecordTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:775:1: ( ( ( rule__RecordTerm__Group_0__0 ) ) | ( ( rule__RecordTerm__ReferenceAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==29) ) {
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:776:1: ( ( rule__RecordTerm__Group_0__0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:776:1: ( ( rule__RecordTerm__Group_0__0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:777:1: ( rule__RecordTerm__Group_0__0 )
                    {
                     before(grammarAccess.getRecordTermAccess().getGroup_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:778:1: ( rule__RecordTerm__Group_0__0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:778:2: rule__RecordTerm__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__RecordTerm__Group_0__0_in_rule__RecordTerm__Alternatives1589);
                    rule__RecordTerm__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecordTermAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:782:6: ( ( rule__RecordTerm__ReferenceAssignment_1 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:782:6: ( ( rule__RecordTerm__ReferenceAssignment_1 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:783:1: ( rule__RecordTerm__ReferenceAssignment_1 )
                    {
                     before(grammarAccess.getRecordTermAccess().getReferenceAssignment_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:784:1: ( rule__RecordTerm__ReferenceAssignment_1 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:784:2: rule__RecordTerm__ReferenceAssignment_1
                    {
                    pushFollow(FOLLOW_rule__RecordTerm__ReferenceAssignment_1_in_rule__RecordTerm__Alternatives1607);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:793:1: rule__AttributeValue__Alternatives : ( ( ( rule__AttributeValue__ValueAssignment_0 ) ) | ( ( rule__AttributeValue__ValueAssignment_1 ) ) | ( ( rule__AttributeValue__ValueAssignment_2 ) ) );
    public final void rule__AttributeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:797:1: ( ( ( rule__AttributeValue__ValueAssignment_0 ) ) | ( ( rule__AttributeValue__ValueAssignment_1 ) ) | ( ( rule__AttributeValue__ValueAssignment_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 29:
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:798:1: ( ( rule__AttributeValue__ValueAssignment_0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:798:1: ( ( rule__AttributeValue__ValueAssignment_0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:799:1: ( rule__AttributeValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getValueAssignment_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:800:1: ( rule__AttributeValue__ValueAssignment_0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:800:2: rule__AttributeValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__AttributeValue__ValueAssignment_0_in_rule__AttributeValue__Alternatives1640);
                    rule__AttributeValue__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:804:6: ( ( rule__AttributeValue__ValueAssignment_1 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:804:6: ( ( rule__AttributeValue__ValueAssignment_1 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:805:1: ( rule__AttributeValue__ValueAssignment_1 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getValueAssignment_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:806:1: ( rule__AttributeValue__ValueAssignment_1 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:806:2: rule__AttributeValue__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AttributeValue__ValueAssignment_1_in_rule__AttributeValue__Alternatives1658);
                    rule__AttributeValue__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValueAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:810:6: ( ( rule__AttributeValue__ValueAssignment_2 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:810:6: ( ( rule__AttributeValue__ValueAssignment_2 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:811:1: ( rule__AttributeValue__ValueAssignment_2 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getValueAssignment_2()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:812:1: ( rule__AttributeValue__ValueAssignment_2 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:812:2: rule__AttributeValue__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__AttributeValue__ValueAssignment_2_in_rule__AttributeValue__Alternatives1676);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:821:1: rule__PropertyFolding__Alternatives_4 : ( ( '->' ) | ( '=>' ) );
    public final void rule__PropertyFolding__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:825:1: ( ( '->' ) | ( '=>' ) )
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:826:1: ( '->' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:826:1: ( '->' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:827:1: '->'
                    {
                     before(grammarAccess.getPropertyFoldingAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 
                    match(input,11,FOLLOW_11_in_rule__PropertyFolding__Alternatives_41710); 
                     after(grammarAccess.getPropertyFoldingAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:834:6: ( '=>' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:834:6: ( '=>' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:835:1: '=>'
                    {
                     before(grammarAccess.getPropertyFoldingAccess().getEqualsSignGreaterThanSignKeyword_4_1()); 
                    match(input,12,FOLLOW_12_in_rule__PropertyFolding__Alternatives_41730); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:847:1: rule__Literal__Alternatives : ( ( ( rule__Literal__StringValueAssignment_0 ) ) | ( ( rule__Literal__IntValueAssignment_1 ) ) | ( ( rule__Literal__DecimalValueAssignment_2 ) ) | ( ( rule__Literal__BooleanValueAssignment_3 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:851:1: ( ( ( rule__Literal__StringValueAssignment_0 ) ) | ( ( rule__Literal__IntValueAssignment_1 ) ) | ( ( rule__Literal__DecimalValueAssignment_2 ) ) | ( ( rule__Literal__BooleanValueAssignment_3 ) ) )
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:852:1: ( ( rule__Literal__StringValueAssignment_0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:852:1: ( ( rule__Literal__StringValueAssignment_0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:853:1: ( rule__Literal__StringValueAssignment_0 )
                    {
                     before(grammarAccess.getLiteralAccess().getStringValueAssignment_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:854:1: ( rule__Literal__StringValueAssignment_0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:854:2: rule__Literal__StringValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Literal__StringValueAssignment_0_in_rule__Literal__Alternatives1764);
                    rule__Literal__StringValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getStringValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:858:6: ( ( rule__Literal__IntValueAssignment_1 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:858:6: ( ( rule__Literal__IntValueAssignment_1 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:859:1: ( rule__Literal__IntValueAssignment_1 )
                    {
                     before(grammarAccess.getLiteralAccess().getIntValueAssignment_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:860:1: ( rule__Literal__IntValueAssignment_1 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:860:2: rule__Literal__IntValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Literal__IntValueAssignment_1_in_rule__Literal__Alternatives1782);
                    rule__Literal__IntValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getIntValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:864:6: ( ( rule__Literal__DecimalValueAssignment_2 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:864:6: ( ( rule__Literal__DecimalValueAssignment_2 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:865:1: ( rule__Literal__DecimalValueAssignment_2 )
                    {
                     before(grammarAccess.getLiteralAccess().getDecimalValueAssignment_2()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:866:1: ( rule__Literal__DecimalValueAssignment_2 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:866:2: rule__Literal__DecimalValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Literal__DecimalValueAssignment_2_in_rule__Literal__Alternatives1800);
                    rule__Literal__DecimalValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getDecimalValueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:870:6: ( ( rule__Literal__BooleanValueAssignment_3 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:870:6: ( ( rule__Literal__BooleanValueAssignment_3 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:871:1: ( rule__Literal__BooleanValueAssignment_3 )
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanValueAssignment_3()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:872:1: ( rule__Literal__BooleanValueAssignment_3 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:872:2: rule__Literal__BooleanValueAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Literal__BooleanValueAssignment_3_in_rule__Literal__Alternatives1818);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:881:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) | ( ( 'DECIMAL' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'TEXT' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'DATE' ) ) | ( ( 'DATETIME' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:885:1: ( ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) | ( ( 'DECIMAL' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'TEXT' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'DATE' ) ) | ( ( 'DATETIME' ) ) )
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:886:1: ( ( 'INT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:886:1: ( ( 'INT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:887:1: ( 'INT' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:888:1: ( 'INT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:888:3: 'INT'
                    {
                    match(input,13,FOLLOW_13_in_rule__Type__Alternatives1852); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:893:6: ( ( 'LONG' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:893:6: ( ( 'LONG' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:894:1: ( 'LONG' )
                    {
                     before(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:895:1: ( 'LONG' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:895:3: 'LONG'
                    {
                    match(input,14,FOLLOW_14_in_rule__Type__Alternatives1873); 

                    }

                     after(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:900:6: ( ( 'BYTE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:900:6: ( ( 'BYTE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:901:1: ( 'BYTE' )
                    {
                     before(grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_2()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:902:1: ( 'BYTE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:902:3: 'BYTE'
                    {
                    match(input,15,FOLLOW_15_in_rule__Type__Alternatives1894); 

                    }

                     after(grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:907:6: ( ( 'SHORT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:907:6: ( ( 'SHORT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:908:1: ( 'SHORT' )
                    {
                     before(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_3()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:909:1: ( 'SHORT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:909:3: 'SHORT'
                    {
                    match(input,16,FOLLOW_16_in_rule__Type__Alternatives1915); 

                    }

                     after(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:914:6: ( ( 'DECIMAL' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:914:6: ( ( 'DECIMAL' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:915:1: ( 'DECIMAL' )
                    {
                     before(grammarAccess.getTypeAccess().getDECIMALEnumLiteralDeclaration_4()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:916:1: ( 'DECIMAL' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:916:3: 'DECIMAL'
                    {
                    match(input,17,FOLLOW_17_in_rule__Type__Alternatives1936); 

                    }

                     after(grammarAccess.getTypeAccess().getDECIMALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:921:6: ( ( 'FLOAT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:921:6: ( ( 'FLOAT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:922:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:923:1: ( 'FLOAT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:923:3: 'FLOAT'
                    {
                    match(input,18,FOLLOW_18_in_rule__Type__Alternatives1957); 

                    }

                     after(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:928:6: ( ( 'DOUBLE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:928:6: ( ( 'DOUBLE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:929:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:930:1: ( 'DOUBLE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:930:3: 'DOUBLE'
                    {
                    match(input,19,FOLLOW_19_in_rule__Type__Alternatives1978); 

                    }

                     after(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:935:6: ( ( 'TEXT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:935:6: ( ( 'TEXT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:936:1: ( 'TEXT' )
                    {
                     before(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_7()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:937:1: ( 'TEXT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:937:3: 'TEXT'
                    {
                    match(input,20,FOLLOW_20_in_rule__Type__Alternatives1999); 

                    }

                     after(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:942:6: ( ( 'BOOLEAN' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:942:6: ( ( 'BOOLEAN' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:943:1: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_8()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:944:1: ( 'BOOLEAN' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:944:3: 'BOOLEAN'
                    {
                    match(input,21,FOLLOW_21_in_rule__Type__Alternatives2020); 

                    }

                     after(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:949:6: ( ( 'DATE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:949:6: ( ( 'DATE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:950:1: ( 'DATE' )
                    {
                     before(grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_9()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:951:1: ( 'DATE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:951:3: 'DATE'
                    {
                    match(input,22,FOLLOW_22_in_rule__Type__Alternatives2041); 

                    }

                     after(grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:956:6: ( ( 'DATETIME' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:956:6: ( ( 'DATETIME' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:957:1: ( 'DATETIME' )
                    {
                     before(grammarAccess.getTypeAccess().getDATETIMEEnumLiteralDeclaration_10()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:958:1: ( 'DATETIME' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:958:3: 'DATETIME'
                    {
                    match(input,23,FOLLOW_23_in_rule__Type__Alternatives2062); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:968:1: rule__BOOLEAN__Alternatives : ( ( ( 'TRUE' ) ) | ( ( 'FALSE' ) ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:972:1: ( ( ( 'TRUE' ) ) | ( ( 'FALSE' ) ) )
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:973:1: ( ( 'TRUE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:973:1: ( ( 'TRUE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:974:1: ( 'TRUE' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:975:1: ( 'TRUE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:975:3: 'TRUE'
                    {
                    match(input,24,FOLLOW_24_in_rule__BOOLEAN__Alternatives2098); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:980:6: ( ( 'FALSE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:980:6: ( ( 'FALSE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:981:1: ( 'FALSE' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:982:1: ( 'FALSE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:982:3: 'FALSE'
                    {
                    match(input,25,FOLLOW_25_in_rule__BOOLEAN__Alternatives2119); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:994:1: rule__ModelDefinition__Group__0 : rule__ModelDefinition__Group__0__Impl rule__ModelDefinition__Group__1 ;
    public final void rule__ModelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:998:1: ( rule__ModelDefinition__Group__0__Impl rule__ModelDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:999:2: rule__ModelDefinition__Group__0__Impl rule__ModelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group__0__Impl_in_rule__ModelDefinition__Group__02152);
            rule__ModelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group__1_in_rule__ModelDefinition__Group__02155);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1006:1: rule__ModelDefinition__Group__0__Impl : ( ( rule__ModelDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__ModelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1010:1: ( ( ( rule__ModelDefinition__DescriptionAssignment_0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1011:1: ( ( rule__ModelDefinition__DescriptionAssignment_0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1011:1: ( ( rule__ModelDefinition__DescriptionAssignment_0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1012:1: ( rule__ModelDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getModelDefinitionAccess().getDescriptionAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1013:1: ( rule__ModelDefinition__DescriptionAssignment_0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1013:2: rule__ModelDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__DescriptionAssignment_0_in_rule__ModelDefinition__Group__0__Impl2182);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1023:1: rule__ModelDefinition__Group__1 : rule__ModelDefinition__Group__1__Impl rule__ModelDefinition__Group__2 ;
    public final void rule__ModelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1027:1: ( rule__ModelDefinition__Group__1__Impl rule__ModelDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1028:2: rule__ModelDefinition__Group__1__Impl rule__ModelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group__1__Impl_in_rule__ModelDefinition__Group__12213);
            rule__ModelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group__2_in_rule__ModelDefinition__Group__12216);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1035:1: rule__ModelDefinition__Group__1__Impl : ( ( rule__ModelDefinition__AttributesAssignment_1 )? ) ;
    public final void rule__ModelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1039:1: ( ( ( rule__ModelDefinition__AttributesAssignment_1 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1040:1: ( ( rule__ModelDefinition__AttributesAssignment_1 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1040:1: ( ( rule__ModelDefinition__AttributesAssignment_1 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1041:1: ( rule__ModelDefinition__AttributesAssignment_1 )?
            {
             before(grammarAccess.getModelDefinitionAccess().getAttributesAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1042:1: ( rule__ModelDefinition__AttributesAssignment_1 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1042:2: rule__ModelDefinition__AttributesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__AttributesAssignment_1_in_rule__ModelDefinition__Group__1__Impl2243);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1052:1: rule__ModelDefinition__Group__2 : rule__ModelDefinition__Group__2__Impl rule__ModelDefinition__Group__3 ;
    public final void rule__ModelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1056:1: ( rule__ModelDefinition__Group__2__Impl rule__ModelDefinition__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1057:2: rule__ModelDefinition__Group__2__Impl rule__ModelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group__2__Impl_in_rule__ModelDefinition__Group__22274);
            rule__ModelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group__3_in_rule__ModelDefinition__Group__22277);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1064:1: rule__ModelDefinition__Group__2__Impl : ( ( rule__ModelDefinition__Alternatives_2 ) ) ;
    public final void rule__ModelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1068:1: ( ( ( rule__ModelDefinition__Alternatives_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1069:1: ( ( rule__ModelDefinition__Alternatives_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1069:1: ( ( rule__ModelDefinition__Alternatives_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1070:1: ( rule__ModelDefinition__Alternatives_2 )
            {
             before(grammarAccess.getModelDefinitionAccess().getAlternatives_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1071:1: ( rule__ModelDefinition__Alternatives_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1071:2: rule__ModelDefinition__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Alternatives_2_in_rule__ModelDefinition__Group__2__Impl2304);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1081:1: rule__ModelDefinition__Group__3 : rule__ModelDefinition__Group__3__Impl ;
    public final void rule__ModelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1085:1: ( rule__ModelDefinition__Group__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1086:2: rule__ModelDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group__3__Impl_in_rule__ModelDefinition__Group__32334);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1092:1: rule__ModelDefinition__Group__3__Impl : ( ';' ) ;
    public final void rule__ModelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1096:1: ( ( ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1097:1: ( ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1097:1: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1098:1: ';'
            {
             before(grammarAccess.getModelDefinitionAccess().getSemicolonKeyword_3()); 
            match(input,26,FOLLOW_26_in_rule__ModelDefinition__Group__3__Impl2362); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1119:1: rule__RecordModelDefinition__Group__0 : rule__RecordModelDefinition__Group__0__Impl rule__RecordModelDefinition__Group__1 ;
    public final void rule__RecordModelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1123:1: ( rule__RecordModelDefinition__Group__0__Impl rule__RecordModelDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1124:2: rule__RecordModelDefinition__Group__0__Impl rule__RecordModelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__0__Impl_in_rule__RecordModelDefinition__Group__02401);
            rule__RecordModelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__1_in_rule__RecordModelDefinition__Group__02404);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1131:1: rule__RecordModelDefinition__Group__0__Impl : ( ( rule__RecordModelDefinition__NameAssignment_0 ) ) ;
    public final void rule__RecordModelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1135:1: ( ( ( rule__RecordModelDefinition__NameAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1136:1: ( ( rule__RecordModelDefinition__NameAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1136:1: ( ( rule__RecordModelDefinition__NameAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1137:1: ( rule__RecordModelDefinition__NameAssignment_0 )
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getNameAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1138:1: ( rule__RecordModelDefinition__NameAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1138:2: rule__RecordModelDefinition__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__NameAssignment_0_in_rule__RecordModelDefinition__Group__0__Impl2431);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1148:1: rule__RecordModelDefinition__Group__1 : rule__RecordModelDefinition__Group__1__Impl rule__RecordModelDefinition__Group__2 ;
    public final void rule__RecordModelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1152:1: ( rule__RecordModelDefinition__Group__1__Impl rule__RecordModelDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1153:2: rule__RecordModelDefinition__Group__1__Impl rule__RecordModelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__1__Impl_in_rule__RecordModelDefinition__Group__12461);
            rule__RecordModelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__2_in_rule__RecordModelDefinition__Group__12464);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1160:1: rule__RecordModelDefinition__Group__1__Impl : ( '=' ) ;
    public final void rule__RecordModelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1164:1: ( ( '=' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1165:1: ( '=' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1165:1: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1166:1: '='
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getEqualsSignKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__RecordModelDefinition__Group__1__Impl2492); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1179:1: rule__RecordModelDefinition__Group__2 : rule__RecordModelDefinition__Group__2__Impl ;
    public final void rule__RecordModelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1183:1: ( rule__RecordModelDefinition__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1184:2: rule__RecordModelDefinition__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__Group__2__Impl_in_rule__RecordModelDefinition__Group__22523);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1190:1: rule__RecordModelDefinition__Group__2__Impl : ( ( rule__RecordModelDefinition__RhsAssignment_2 ) ) ;
    public final void rule__RecordModelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1194:1: ( ( ( rule__RecordModelDefinition__RhsAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1195:1: ( ( rule__RecordModelDefinition__RhsAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1195:1: ( ( rule__RecordModelDefinition__RhsAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1196:1: ( rule__RecordModelDefinition__RhsAssignment_2 )
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getRhsAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1197:1: ( rule__RecordModelDefinition__RhsAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1197:2: rule__RecordModelDefinition__RhsAssignment_2
            {
            pushFollow(FOLLOW_rule__RecordModelDefinition__RhsAssignment_2_in_rule__RecordModelDefinition__Group__2__Impl2550);
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


    // $ANTLR start "rule__RecordExpression__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1213:1: rule__RecordExpression__Group__0 : rule__RecordExpression__Group__0__Impl rule__RecordExpression__Group__1 ;
    public final void rule__RecordExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1217:1: ( rule__RecordExpression__Group__0__Impl rule__RecordExpression__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1218:2: rule__RecordExpression__Group__0__Impl rule__RecordExpression__Group__1
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group__0__Impl_in_rule__RecordExpression__Group__02586);
            rule__RecordExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordExpression__Group__1_in_rule__RecordExpression__Group__02589);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1225:1: rule__RecordExpression__Group__0__Impl : ( ( rule__RecordExpression__TermsAssignment_0 ) ) ;
    public final void rule__RecordExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1229:1: ( ( ( rule__RecordExpression__TermsAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1230:1: ( ( rule__RecordExpression__TermsAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1230:1: ( ( rule__RecordExpression__TermsAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1231:1: ( rule__RecordExpression__TermsAssignment_0 )
            {
             before(grammarAccess.getRecordExpressionAccess().getTermsAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1232:1: ( rule__RecordExpression__TermsAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1232:2: rule__RecordExpression__TermsAssignment_0
            {
            pushFollow(FOLLOW_rule__RecordExpression__TermsAssignment_0_in_rule__RecordExpression__Group__0__Impl2616);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1242:1: rule__RecordExpression__Group__1 : rule__RecordExpression__Group__1__Impl ;
    public final void rule__RecordExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1246:1: ( rule__RecordExpression__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1247:2: rule__RecordExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group__1__Impl_in_rule__RecordExpression__Group__12646);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1253:1: rule__RecordExpression__Group__1__Impl : ( ( rule__RecordExpression__Group_1__0 )* ) ;
    public final void rule__RecordExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1257:1: ( ( ( rule__RecordExpression__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1258:1: ( ( rule__RecordExpression__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1258:1: ( ( rule__RecordExpression__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1259:1: ( rule__RecordExpression__Group_1__0 )*
            {
             before(grammarAccess.getRecordExpressionAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1260:1: ( rule__RecordExpression__Group_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==28) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1260:2: rule__RecordExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RecordExpression__Group_1__0_in_rule__RecordExpression__Group__1__Impl2673);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1274:1: rule__RecordExpression__Group_1__0 : rule__RecordExpression__Group_1__0__Impl rule__RecordExpression__Group_1__1 ;
    public final void rule__RecordExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1278:1: ( rule__RecordExpression__Group_1__0__Impl rule__RecordExpression__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1279:2: rule__RecordExpression__Group_1__0__Impl rule__RecordExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group_1__0__Impl_in_rule__RecordExpression__Group_1__02708);
            rule__RecordExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordExpression__Group_1__1_in_rule__RecordExpression__Group_1__02711);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1286:1: rule__RecordExpression__Group_1__0__Impl : ( '+' ) ;
    public final void rule__RecordExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1290:1: ( ( '+' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1291:1: ( '+' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1291:1: ( '+' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1292:1: '+'
            {
             before(grammarAccess.getRecordExpressionAccess().getPlusSignKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__RecordExpression__Group_1__0__Impl2739); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1305:1: rule__RecordExpression__Group_1__1 : rule__RecordExpression__Group_1__1__Impl ;
    public final void rule__RecordExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1309:1: ( rule__RecordExpression__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1310:2: rule__RecordExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group_1__1__Impl_in_rule__RecordExpression__Group_1__12770);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1316:1: rule__RecordExpression__Group_1__1__Impl : ( ( rule__RecordExpression__TermsAssignment_1_1 ) ) ;
    public final void rule__RecordExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1320:1: ( ( ( rule__RecordExpression__TermsAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1321:1: ( ( rule__RecordExpression__TermsAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1321:1: ( ( rule__RecordExpression__TermsAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1322:1: ( rule__RecordExpression__TermsAssignment_1_1 )
            {
             before(grammarAccess.getRecordExpressionAccess().getTermsAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1323:1: ( rule__RecordExpression__TermsAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1323:2: rule__RecordExpression__TermsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RecordExpression__TermsAssignment_1_1_in_rule__RecordExpression__Group_1__1__Impl2797);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1337:1: rule__RecordTerm__Group_0__0 : rule__RecordTerm__Group_0__0__Impl rule__RecordTerm__Group_0__1 ;
    public final void rule__RecordTerm__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1341:1: ( rule__RecordTerm__Group_0__0__Impl rule__RecordTerm__Group_0__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1342:2: rule__RecordTerm__Group_0__0__Impl rule__RecordTerm__Group_0__1
            {
            pushFollow(FOLLOW_rule__RecordTerm__Group_0__0__Impl_in_rule__RecordTerm__Group_0__02831);
            rule__RecordTerm__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordTerm__Group_0__1_in_rule__RecordTerm__Group_0__02834);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1349:1: rule__RecordTerm__Group_0__0__Impl : ( '{' ) ;
    public final void rule__RecordTerm__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1353:1: ( ( '{' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1354:1: ( '{' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1354:1: ( '{' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1355:1: '{'
            {
             before(grammarAccess.getRecordTermAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,29,FOLLOW_29_in_rule__RecordTerm__Group_0__0__Impl2862); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1368:1: rule__RecordTerm__Group_0__1 : rule__RecordTerm__Group_0__1__Impl rule__RecordTerm__Group_0__2 ;
    public final void rule__RecordTerm__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1372:1: ( rule__RecordTerm__Group_0__1__Impl rule__RecordTerm__Group_0__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1373:2: rule__RecordTerm__Group_0__1__Impl rule__RecordTerm__Group_0__2
            {
            pushFollow(FOLLOW_rule__RecordTerm__Group_0__1__Impl_in_rule__RecordTerm__Group_0__12893);
            rule__RecordTerm__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordTerm__Group_0__2_in_rule__RecordTerm__Group_0__12896);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1380:1: rule__RecordTerm__Group_0__1__Impl : ( ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* ) ) ;
    public final void rule__RecordTerm__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1384:1: ( ( ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1385:1: ( ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1385:1: ( ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1386:1: ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) ) ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1386:1: ( ( rule__RecordTerm__PropertiesAssignment_0_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1387:1: ( rule__RecordTerm__PropertiesAssignment_0_1 )
            {
             before(grammarAccess.getRecordTermAccess().getPropertiesAssignment_0_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1388:1: ( rule__RecordTerm__PropertiesAssignment_0_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1388:2: rule__RecordTerm__PropertiesAssignment_0_1
            {
            pushFollow(FOLLOW_rule__RecordTerm__PropertiesAssignment_0_1_in_rule__RecordTerm__Group_0__1__Impl2925);
            rule__RecordTerm__PropertiesAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getRecordTermAccess().getPropertiesAssignment_0_1()); 

            }

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1391:1: ( ( rule__RecordTerm__PropertiesAssignment_0_1 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1392:1: ( rule__RecordTerm__PropertiesAssignment_0_1 )*
            {
             before(grammarAccess.getRecordTermAccess().getPropertiesAssignment_0_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1393:1: ( rule__RecordTerm__PropertiesAssignment_0_1 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( ((LA13_0>=RULE_STRING && LA13_0<=RULE_NAME_TOKEN)||LA13_0==33) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1393:2: rule__RecordTerm__PropertiesAssignment_0_1
            	    {
            	    pushFollow(FOLLOW_rule__RecordTerm__PropertiesAssignment_0_1_in_rule__RecordTerm__Group_0__1__Impl2937);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1404:1: rule__RecordTerm__Group_0__2 : rule__RecordTerm__Group_0__2__Impl ;
    public final void rule__RecordTerm__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1408:1: ( rule__RecordTerm__Group_0__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1409:2: rule__RecordTerm__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__RecordTerm__Group_0__2__Impl_in_rule__RecordTerm__Group_0__22970);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1415:1: rule__RecordTerm__Group_0__2__Impl : ( '}' ) ;
    public final void rule__RecordTerm__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1419:1: ( ( '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1420:1: ( '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1420:1: ( '}' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1421:1: '}'
            {
             before(grammarAccess.getRecordTermAccess().getRightCurlyBracketKeyword_0_2()); 
            match(input,30,FOLLOW_30_in_rule__RecordTerm__Group_0__2__Impl2998); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1440:1: rule__PropertyDefinition__Group__0 : rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 ;
    public final void rule__PropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1444:1: ( rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1445:2: rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__03035);
            rule__PropertyDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__03038);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1452:1: rule__PropertyDefinition__Group__0__Impl : ( ( rule__PropertyDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__PropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1456:1: ( ( ( rule__PropertyDefinition__DescriptionAssignment_0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1457:1: ( ( rule__PropertyDefinition__DescriptionAssignment_0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1457:1: ( ( rule__PropertyDefinition__DescriptionAssignment_0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1458:1: ( rule__PropertyDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDescriptionAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1459:1: ( rule__PropertyDefinition__DescriptionAssignment_0 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1459:2: rule__PropertyDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__DescriptionAssignment_0_in_rule__PropertyDefinition__Group__0__Impl3065);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1469:1: rule__PropertyDefinition__Group__1 : rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 ;
    public final void rule__PropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1473:1: ( rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1474:2: rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__13096);
            rule__PropertyDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__13099);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1481:1: rule__PropertyDefinition__Group__1__Impl : ( ( rule__PropertyDefinition__AttributesAssignment_1 )? ) ;
    public final void rule__PropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1485:1: ( ( ( rule__PropertyDefinition__AttributesAssignment_1 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1486:1: ( ( rule__PropertyDefinition__AttributesAssignment_1 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1486:1: ( ( rule__PropertyDefinition__AttributesAssignment_1 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1487:1: ( rule__PropertyDefinition__AttributesAssignment_1 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getAttributesAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1488:1: ( rule__PropertyDefinition__AttributesAssignment_1 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1488:2: rule__PropertyDefinition__AttributesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__AttributesAssignment_1_in_rule__PropertyDefinition__Group__1__Impl3126);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1498:1: rule__PropertyDefinition__Group__2 : rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 ;
    public final void rule__PropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1502:1: ( rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1503:2: rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__23157);
            rule__PropertyDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__23160);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1510:1: rule__PropertyDefinition__Group__2__Impl : ( ( rule__PropertyDefinition__NameAssignment_2 ) ) ;
    public final void rule__PropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1514:1: ( ( ( rule__PropertyDefinition__NameAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1515:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1515:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1516:1: ( rule__PropertyDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1517:1: ( rule__PropertyDefinition__NameAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1517:2: rule__PropertyDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__NameAssignment_2_in_rule__PropertyDefinition__Group__2__Impl3187);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1527:1: rule__PropertyDefinition__Group__3 : rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 ;
    public final void rule__PropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1531:1: ( rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1532:2: rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__33217);
            rule__PropertyDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__33220);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1539:1: rule__PropertyDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__PropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1543:1: ( ( ':' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1544:1: ( ':' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1544:1: ( ':' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1545:1: ':'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getColonKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__PropertyDefinition__Group__3__Impl3248); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1558:1: rule__PropertyDefinition__Group__4 : rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 ;
    public final void rule__PropertyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1562:1: ( rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1563:2: rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__43279);
            rule__PropertyDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__43282);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1570:1: rule__PropertyDefinition__Group__4__Impl : ( ( rule__PropertyDefinition__TypeAssignment_4 ) ) ;
    public final void rule__PropertyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1574:1: ( ( ( rule__PropertyDefinition__TypeAssignment_4 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1575:1: ( ( rule__PropertyDefinition__TypeAssignment_4 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1575:1: ( ( rule__PropertyDefinition__TypeAssignment_4 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1576:1: ( rule__PropertyDefinition__TypeAssignment_4 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_4()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1577:1: ( rule__PropertyDefinition__TypeAssignment_4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1577:2: rule__PropertyDefinition__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__TypeAssignment_4_in_rule__PropertyDefinition__Group__4__Impl3309);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1587:1: rule__PropertyDefinition__Group__5 : rule__PropertyDefinition__Group__5__Impl ;
    public final void rule__PropertyDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1591:1: ( rule__PropertyDefinition__Group__5__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1592:2: rule__PropertyDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__53339);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1598:1: rule__PropertyDefinition__Group__5__Impl : ( ';' ) ;
    public final void rule__PropertyDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1602:1: ( ( ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1603:1: ( ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1603:1: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1604:1: ';'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5()); 
            match(input,26,FOLLOW_26_in_rule__PropertyDefinition__Group__5__Impl3367); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1629:1: rule__SummarizeModelDefinition__Group__0 : rule__SummarizeModelDefinition__Group__0__Impl rule__SummarizeModelDefinition__Group__1 ;
    public final void rule__SummarizeModelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1633:1: ( rule__SummarizeModelDefinition__Group__0__Impl rule__SummarizeModelDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1634:2: rule__SummarizeModelDefinition__Group__0__Impl rule__SummarizeModelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__0__Impl_in_rule__SummarizeModelDefinition__Group__03410);
            rule__SummarizeModelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__1_in_rule__SummarizeModelDefinition__Group__03413);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1641:1: rule__SummarizeModelDefinition__Group__0__Impl : ( 'summarized' ) ;
    public final void rule__SummarizeModelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1645:1: ( ( 'summarized' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1646:1: ( 'summarized' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1646:1: ( 'summarized' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1647:1: 'summarized'
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getSummarizedKeyword_0()); 
            match(input,32,FOLLOW_32_in_rule__SummarizeModelDefinition__Group__0__Impl3441); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1660:1: rule__SummarizeModelDefinition__Group__1 : rule__SummarizeModelDefinition__Group__1__Impl rule__SummarizeModelDefinition__Group__2 ;
    public final void rule__SummarizeModelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1664:1: ( rule__SummarizeModelDefinition__Group__1__Impl rule__SummarizeModelDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1665:2: rule__SummarizeModelDefinition__Group__1__Impl rule__SummarizeModelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__1__Impl_in_rule__SummarizeModelDefinition__Group__13472);
            rule__SummarizeModelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__2_in_rule__SummarizeModelDefinition__Group__13475);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1672:1: rule__SummarizeModelDefinition__Group__1__Impl : ( ( rule__SummarizeModelDefinition__NameAssignment_1 ) ) ;
    public final void rule__SummarizeModelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1676:1: ( ( ( rule__SummarizeModelDefinition__NameAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1677:1: ( ( rule__SummarizeModelDefinition__NameAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1677:1: ( ( rule__SummarizeModelDefinition__NameAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1678:1: ( rule__SummarizeModelDefinition__NameAssignment_1 )
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getNameAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1679:1: ( rule__SummarizeModelDefinition__NameAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1679:2: rule__SummarizeModelDefinition__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__NameAssignment_1_in_rule__SummarizeModelDefinition__Group__1__Impl3502);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1689:1: rule__SummarizeModelDefinition__Group__2 : rule__SummarizeModelDefinition__Group__2__Impl rule__SummarizeModelDefinition__Group__3 ;
    public final void rule__SummarizeModelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1693:1: ( rule__SummarizeModelDefinition__Group__2__Impl rule__SummarizeModelDefinition__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1694:2: rule__SummarizeModelDefinition__Group__2__Impl rule__SummarizeModelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__2__Impl_in_rule__SummarizeModelDefinition__Group__23532);
            rule__SummarizeModelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__3_in_rule__SummarizeModelDefinition__Group__23535);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1701:1: rule__SummarizeModelDefinition__Group__2__Impl : ( '=' ) ;
    public final void rule__SummarizeModelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1705:1: ( ( '=' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1706:1: ( '=' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1706:1: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1707:1: '='
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getEqualsSignKeyword_2()); 
            match(input,27,FOLLOW_27_in_rule__SummarizeModelDefinition__Group__2__Impl3563); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1720:1: rule__SummarizeModelDefinition__Group__3 : rule__SummarizeModelDefinition__Group__3__Impl ;
    public final void rule__SummarizeModelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1724:1: ( rule__SummarizeModelDefinition__Group__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1725:2: rule__SummarizeModelDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__Group__3__Impl_in_rule__SummarizeModelDefinition__Group__33594);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1731:1: rule__SummarizeModelDefinition__Group__3__Impl : ( ( rule__SummarizeModelDefinition__RhsAssignment_3 ) ) ;
    public final void rule__SummarizeModelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1735:1: ( ( ( rule__SummarizeModelDefinition__RhsAssignment_3 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1736:1: ( ( rule__SummarizeModelDefinition__RhsAssignment_3 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1736:1: ( ( rule__SummarizeModelDefinition__RhsAssignment_3 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1737:1: ( rule__SummarizeModelDefinition__RhsAssignment_3 )
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getRhsAssignment_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1738:1: ( rule__SummarizeModelDefinition__RhsAssignment_3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1738:2: rule__SummarizeModelDefinition__RhsAssignment_3
            {
            pushFollow(FOLLOW_rule__SummarizeModelDefinition__RhsAssignment_3_in_rule__SummarizeModelDefinition__Group__3__Impl3621);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1756:1: rule__SummarizeExpression__Group__0 : rule__SummarizeExpression__Group__0__Impl rule__SummarizeExpression__Group__1 ;
    public final void rule__SummarizeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1760:1: ( rule__SummarizeExpression__Group__0__Impl rule__SummarizeExpression__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1761:2: rule__SummarizeExpression__Group__0__Impl rule__SummarizeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group__0__Impl_in_rule__SummarizeExpression__Group__03659);
            rule__SummarizeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeExpression__Group__1_in_rule__SummarizeExpression__Group__03662);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1768:1: rule__SummarizeExpression__Group__0__Impl : ( ( rule__SummarizeExpression__TermsAssignment_0 ) ) ;
    public final void rule__SummarizeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1772:1: ( ( ( rule__SummarizeExpression__TermsAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1773:1: ( ( rule__SummarizeExpression__TermsAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1773:1: ( ( rule__SummarizeExpression__TermsAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1774:1: ( rule__SummarizeExpression__TermsAssignment_0 )
            {
             before(grammarAccess.getSummarizeExpressionAccess().getTermsAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1775:1: ( rule__SummarizeExpression__TermsAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1775:2: rule__SummarizeExpression__TermsAssignment_0
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__TermsAssignment_0_in_rule__SummarizeExpression__Group__0__Impl3689);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1785:1: rule__SummarizeExpression__Group__1 : rule__SummarizeExpression__Group__1__Impl ;
    public final void rule__SummarizeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1789:1: ( rule__SummarizeExpression__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1790:2: rule__SummarizeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group__1__Impl_in_rule__SummarizeExpression__Group__13719);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1796:1: rule__SummarizeExpression__Group__1__Impl : ( ( rule__SummarizeExpression__Group_1__0 )* ) ;
    public final void rule__SummarizeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1800:1: ( ( ( rule__SummarizeExpression__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1801:1: ( ( rule__SummarizeExpression__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1801:1: ( ( rule__SummarizeExpression__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1802:1: ( rule__SummarizeExpression__Group_1__0 )*
            {
             before(grammarAccess.getSummarizeExpressionAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1803:1: ( rule__SummarizeExpression__Group_1__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==28) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1803:2: rule__SummarizeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SummarizeExpression__Group_1__0_in_rule__SummarizeExpression__Group__1__Impl3746);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1817:1: rule__SummarizeExpression__Group_1__0 : rule__SummarizeExpression__Group_1__0__Impl rule__SummarizeExpression__Group_1__1 ;
    public final void rule__SummarizeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1821:1: ( rule__SummarizeExpression__Group_1__0__Impl rule__SummarizeExpression__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1822:2: rule__SummarizeExpression__Group_1__0__Impl rule__SummarizeExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group_1__0__Impl_in_rule__SummarizeExpression__Group_1__03781);
            rule__SummarizeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeExpression__Group_1__1_in_rule__SummarizeExpression__Group_1__03784);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1829:1: rule__SummarizeExpression__Group_1__0__Impl : ( '+' ) ;
    public final void rule__SummarizeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1833:1: ( ( '+' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1834:1: ( '+' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1834:1: ( '+' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1835:1: '+'
            {
             before(grammarAccess.getSummarizeExpressionAccess().getPlusSignKeyword_1_0()); 
            match(input,28,FOLLOW_28_in_rule__SummarizeExpression__Group_1__0__Impl3812); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1848:1: rule__SummarizeExpression__Group_1__1 : rule__SummarizeExpression__Group_1__1__Impl ;
    public final void rule__SummarizeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1852:1: ( rule__SummarizeExpression__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1853:2: rule__SummarizeExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group_1__1__Impl_in_rule__SummarizeExpression__Group_1__13843);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1859:1: rule__SummarizeExpression__Group_1__1__Impl : ( ( rule__SummarizeExpression__TermsAssignment_1_1 ) ) ;
    public final void rule__SummarizeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1863:1: ( ( ( rule__SummarizeExpression__TermsAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1864:1: ( ( rule__SummarizeExpression__TermsAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1864:1: ( ( rule__SummarizeExpression__TermsAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1865:1: ( rule__SummarizeExpression__TermsAssignment_1_1 )
            {
             before(grammarAccess.getSummarizeExpressionAccess().getTermsAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1866:1: ( rule__SummarizeExpression__TermsAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1866:2: rule__SummarizeExpression__TermsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__TermsAssignment_1_1_in_rule__SummarizeExpression__Group_1__1__Impl3870);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1880:1: rule__SummarizeTerm__Group__0 : rule__SummarizeTerm__Group__0__Impl rule__SummarizeTerm__Group__1 ;
    public final void rule__SummarizeTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1884:1: ( rule__SummarizeTerm__Group__0__Impl rule__SummarizeTerm__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1885:2: rule__SummarizeTerm__Group__0__Impl rule__SummarizeTerm__Group__1
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__Group__0__Impl_in_rule__SummarizeTerm__Group__03904);
            rule__SummarizeTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeTerm__Group__1_in_rule__SummarizeTerm__Group__03907);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1892:1: rule__SummarizeTerm__Group__0__Impl : ( ( rule__SummarizeTerm__ReferenceAssignment_0 ) ) ;
    public final void rule__SummarizeTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1896:1: ( ( ( rule__SummarizeTerm__ReferenceAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1897:1: ( ( rule__SummarizeTerm__ReferenceAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1897:1: ( ( rule__SummarizeTerm__ReferenceAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1898:1: ( rule__SummarizeTerm__ReferenceAssignment_0 )
            {
             before(grammarAccess.getSummarizeTermAccess().getReferenceAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1899:1: ( rule__SummarizeTerm__ReferenceAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1899:2: rule__SummarizeTerm__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__ReferenceAssignment_0_in_rule__SummarizeTerm__Group__0__Impl3934);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1909:1: rule__SummarizeTerm__Group__1 : rule__SummarizeTerm__Group__1__Impl rule__SummarizeTerm__Group__2 ;
    public final void rule__SummarizeTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1913:1: ( rule__SummarizeTerm__Group__1__Impl rule__SummarizeTerm__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1914:2: rule__SummarizeTerm__Group__1__Impl rule__SummarizeTerm__Group__2
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__Group__1__Impl_in_rule__SummarizeTerm__Group__13964);
            rule__SummarizeTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeTerm__Group__2_in_rule__SummarizeTerm__Group__13967);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1921:1: rule__SummarizeTerm__Group__1__Impl : ( ( rule__SummarizeTerm__FoldingAssignment_1 ) ) ;
    public final void rule__SummarizeTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1925:1: ( ( ( rule__SummarizeTerm__FoldingAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1926:1: ( ( rule__SummarizeTerm__FoldingAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1926:1: ( ( rule__SummarizeTerm__FoldingAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1927:1: ( rule__SummarizeTerm__FoldingAssignment_1 )
            {
             before(grammarAccess.getSummarizeTermAccess().getFoldingAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1928:1: ( rule__SummarizeTerm__FoldingAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1928:2: rule__SummarizeTerm__FoldingAssignment_1
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__FoldingAssignment_1_in_rule__SummarizeTerm__Group__1__Impl3994);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1938:1: rule__SummarizeTerm__Group__2 : rule__SummarizeTerm__Group__2__Impl ;
    public final void rule__SummarizeTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1942:1: ( rule__SummarizeTerm__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1943:2: rule__SummarizeTerm__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__Group__2__Impl_in_rule__SummarizeTerm__Group__24024);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1949:1: rule__SummarizeTerm__Group__2__Impl : ( ( rule__SummarizeTerm__GroupingAssignment_2 )? ) ;
    public final void rule__SummarizeTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1953:1: ( ( ( rule__SummarizeTerm__GroupingAssignment_2 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1954:1: ( ( rule__SummarizeTerm__GroupingAssignment_2 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1954:1: ( ( rule__SummarizeTerm__GroupingAssignment_2 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1955:1: ( rule__SummarizeTerm__GroupingAssignment_2 )?
            {
             before(grammarAccess.getSummarizeTermAccess().getGroupingAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1956:1: ( rule__SummarizeTerm__GroupingAssignment_2 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1956:2: rule__SummarizeTerm__GroupingAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SummarizeTerm__GroupingAssignment_2_in_rule__SummarizeTerm__Group__2__Impl4051);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1972:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1976:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1977:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04088);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04091);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1984:1: rule__Attribute__Group__0__Impl : ( '@' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1988:1: ( ( '@' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1989:1: ( '@' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1989:1: ( '@' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1990:1: '@'
            {
             before(grammarAccess.getAttributeAccess().getCommercialAtKeyword_0()); 
            match(input,33,FOLLOW_33_in_rule__Attribute__Group__0__Impl4119); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2003:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2007:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2008:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14150);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14153);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2015:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2019:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2020:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2020:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2021:1: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2022:1: ( rule__Attribute__NameAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2022:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl4180);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2032:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2036:1: ( rule__Attribute__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2037:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24210);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2043:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__Group_2__0 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2047:1: ( ( ( rule__Attribute__Group_2__0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2048:1: ( ( rule__Attribute__Group_2__0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2048:1: ( ( rule__Attribute__Group_2__0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2049:1: ( rule__Attribute__Group_2__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2050:1: ( rule__Attribute__Group_2__0 )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==34) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2050:2: rule__Attribute__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_2__0_in_rule__Attribute__Group__2__Impl4237);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2066:1: rule__Attribute__Group_2__0 : rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 ;
    public final void rule__Attribute__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2070:1: ( rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2071:2: rule__Attribute__Group_2__0__Impl rule__Attribute__Group_2__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__0__Impl_in_rule__Attribute__Group_2__04274);
            rule__Attribute__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_2__1_in_rule__Attribute__Group_2__04277);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2078:1: rule__Attribute__Group_2__0__Impl : ( '(' ) ;
    public final void rule__Attribute__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2082:1: ( ( '(' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2083:1: ( '(' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2083:1: ( '(' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2084:1: '('
            {
             before(grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_2_0()); 
            match(input,34,FOLLOW_34_in_rule__Attribute__Group_2__0__Impl4305); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2097:1: rule__Attribute__Group_2__1 : rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 ;
    public final void rule__Attribute__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2101:1: ( rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2102:2: rule__Attribute__Group_2__1__Impl rule__Attribute__Group_2__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__1__Impl_in_rule__Attribute__Group_2__14336);
            rule__Attribute__Group_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_2__2_in_rule__Attribute__Group_2__14339);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2109:1: rule__Attribute__Group_2__1__Impl : ( ( rule__Attribute__Group_2_1__0 )? ) ;
    public final void rule__Attribute__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2113:1: ( ( ( rule__Attribute__Group_2_1__0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2114:1: ( ( rule__Attribute__Group_2_1__0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2114:1: ( ( rule__Attribute__Group_2_1__0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2115:1: ( rule__Attribute__Group_2_1__0 )?
            {
             before(grammarAccess.getAttributeAccess().getGroup_2_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2116:1: ( rule__Attribute__Group_2_1__0 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_NAME_TOKEN) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2116:2: rule__Attribute__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__Attribute__Group_2_1__0_in_rule__Attribute__Group_2__1__Impl4366);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2126:1: rule__Attribute__Group_2__2 : rule__Attribute__Group_2__2__Impl ;
    public final void rule__Attribute__Group_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2130:1: ( rule__Attribute__Group_2__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2131:2: rule__Attribute__Group_2__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2__2__Impl_in_rule__Attribute__Group_2__24397);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2137:1: rule__Attribute__Group_2__2__Impl : ( ')' ) ;
    public final void rule__Attribute__Group_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2141:1: ( ( ')' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2142:1: ( ')' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2142:1: ( ')' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2143:1: ')'
            {
             before(grammarAccess.getAttributeAccess().getRightParenthesisKeyword_2_2()); 
            match(input,35,FOLLOW_35_in_rule__Attribute__Group_2__2__Impl4425); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2162:1: rule__Attribute__Group_2_1__0 : rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 ;
    public final void rule__Attribute__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2166:1: ( rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2167:2: rule__Attribute__Group_2_1__0__Impl rule__Attribute__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2_1__0__Impl_in_rule__Attribute__Group_2_1__04462);
            rule__Attribute__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group_2_1__1_in_rule__Attribute__Group_2_1__04465);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2174:1: rule__Attribute__Group_2_1__0__Impl : ( ( rule__Attribute__ElementsAssignment_2_1_0 ) ) ;
    public final void rule__Attribute__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2178:1: ( ( ( rule__Attribute__ElementsAssignment_2_1_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2179:1: ( ( rule__Attribute__ElementsAssignment_2_1_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2179:1: ( ( rule__Attribute__ElementsAssignment_2_1_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2180:1: ( rule__Attribute__ElementsAssignment_2_1_0 )
            {
             before(grammarAccess.getAttributeAccess().getElementsAssignment_2_1_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2181:1: ( rule__Attribute__ElementsAssignment_2_1_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2181:2: rule__Attribute__ElementsAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__Attribute__ElementsAssignment_2_1_0_in_rule__Attribute__Group_2_1__0__Impl4492);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2191:1: rule__Attribute__Group_2_1__1 : rule__Attribute__Group_2_1__1__Impl ;
    public final void rule__Attribute__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2195:1: ( rule__Attribute__Group_2_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2196:2: rule__Attribute__Group_2_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group_2_1__1__Impl_in_rule__Attribute__Group_2_1__14522);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2202:1: rule__Attribute__Group_2_1__1__Impl : ( ( ',' )? ) ;
    public final void rule__Attribute__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2206:1: ( ( ( ',' )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2207:1: ( ( ',' )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2207:1: ( ( ',' )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2208:1: ( ',' )?
            {
             before(grammarAccess.getAttributeAccess().getCommaKeyword_2_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2209:1: ( ',' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==36) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2210:2: ','
                    {
                    match(input,36,FOLLOW_36_in_rule__Attribute__Group_2_1__1__Impl4551); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2225:1: rule__AttributeElementList__Group__0 : rule__AttributeElementList__Group__0__Impl rule__AttributeElementList__Group__1 ;
    public final void rule__AttributeElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2229:1: ( rule__AttributeElementList__Group__0__Impl rule__AttributeElementList__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2230:2: rule__AttributeElementList__Group__0__Impl rule__AttributeElementList__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group__0__Impl_in_rule__AttributeElementList__Group__04588);
            rule__AttributeElementList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElementList__Group__1_in_rule__AttributeElementList__Group__04591);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2237:1: rule__AttributeElementList__Group__0__Impl : ( ( rule__AttributeElementList__ElementsAssignment_0 ) ) ;
    public final void rule__AttributeElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2241:1: ( ( ( rule__AttributeElementList__ElementsAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2242:1: ( ( rule__AttributeElementList__ElementsAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2242:1: ( ( rule__AttributeElementList__ElementsAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2243:1: ( rule__AttributeElementList__ElementsAssignment_0 )
            {
             before(grammarAccess.getAttributeElementListAccess().getElementsAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2244:1: ( rule__AttributeElementList__ElementsAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2244:2: rule__AttributeElementList__ElementsAssignment_0
            {
            pushFollow(FOLLOW_rule__AttributeElementList__ElementsAssignment_0_in_rule__AttributeElementList__Group__0__Impl4618);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2254:1: rule__AttributeElementList__Group__1 : rule__AttributeElementList__Group__1__Impl ;
    public final void rule__AttributeElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2258:1: ( rule__AttributeElementList__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2259:2: rule__AttributeElementList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group__1__Impl_in_rule__AttributeElementList__Group__14648);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2265:1: rule__AttributeElementList__Group__1__Impl : ( ( rule__AttributeElementList__Group_1__0 )* ) ;
    public final void rule__AttributeElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2269:1: ( ( ( rule__AttributeElementList__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2270:1: ( ( rule__AttributeElementList__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2270:1: ( ( rule__AttributeElementList__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2271:1: ( rule__AttributeElementList__Group_1__0 )*
            {
             before(grammarAccess.getAttributeElementListAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2272:1: ( rule__AttributeElementList__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==36) ) {
                    int LA21_2 = input.LA(2);

                    if ( (LA21_2==RULE_NAME_TOKEN) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2272:2: rule__AttributeElementList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AttributeElementList__Group_1__0_in_rule__AttributeElementList__Group__1__Impl4675);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2286:1: rule__AttributeElementList__Group_1__0 : rule__AttributeElementList__Group_1__0__Impl rule__AttributeElementList__Group_1__1 ;
    public final void rule__AttributeElementList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2290:1: ( rule__AttributeElementList__Group_1__0__Impl rule__AttributeElementList__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2291:2: rule__AttributeElementList__Group_1__0__Impl rule__AttributeElementList__Group_1__1
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group_1__0__Impl_in_rule__AttributeElementList__Group_1__04710);
            rule__AttributeElementList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElementList__Group_1__1_in_rule__AttributeElementList__Group_1__04713);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2298:1: rule__AttributeElementList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AttributeElementList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2302:1: ( ( ',' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2303:1: ( ',' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2303:1: ( ',' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2304:1: ','
            {
             before(grammarAccess.getAttributeElementListAccess().getCommaKeyword_1_0()); 
            match(input,36,FOLLOW_36_in_rule__AttributeElementList__Group_1__0__Impl4741); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2317:1: rule__AttributeElementList__Group_1__1 : rule__AttributeElementList__Group_1__1__Impl ;
    public final void rule__AttributeElementList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2321:1: ( rule__AttributeElementList__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2322:2: rule__AttributeElementList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group_1__1__Impl_in_rule__AttributeElementList__Group_1__14772);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2328:1: rule__AttributeElementList__Group_1__1__Impl : ( ( rule__AttributeElementList__ElementsAssignment_1_1 ) ) ;
    public final void rule__AttributeElementList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2332:1: ( ( ( rule__AttributeElementList__ElementsAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2333:1: ( ( rule__AttributeElementList__ElementsAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2333:1: ( ( rule__AttributeElementList__ElementsAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2334:1: ( rule__AttributeElementList__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getAttributeElementListAccess().getElementsAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2335:1: ( rule__AttributeElementList__ElementsAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2335:2: rule__AttributeElementList__ElementsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AttributeElementList__ElementsAssignment_1_1_in_rule__AttributeElementList__Group_1__1__Impl4799);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2349:1: rule__AttributeElement__Group__0 : rule__AttributeElement__Group__0__Impl rule__AttributeElement__Group__1 ;
    public final void rule__AttributeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2353:1: ( rule__AttributeElement__Group__0__Impl rule__AttributeElement__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2354:2: rule__AttributeElement__Group__0__Impl rule__AttributeElement__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeElement__Group__0__Impl_in_rule__AttributeElement__Group__04833);
            rule__AttributeElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElement__Group__1_in_rule__AttributeElement__Group__04836);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2361:1: rule__AttributeElement__Group__0__Impl : ( ( rule__AttributeElement__NameAssignment_0 ) ) ;
    public final void rule__AttributeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2365:1: ( ( ( rule__AttributeElement__NameAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2366:1: ( ( rule__AttributeElement__NameAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2366:1: ( ( rule__AttributeElement__NameAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2367:1: ( rule__AttributeElement__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeElementAccess().getNameAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2368:1: ( rule__AttributeElement__NameAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2368:2: rule__AttributeElement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AttributeElement__NameAssignment_0_in_rule__AttributeElement__Group__0__Impl4863);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2378:1: rule__AttributeElement__Group__1 : rule__AttributeElement__Group__1__Impl rule__AttributeElement__Group__2 ;
    public final void rule__AttributeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2382:1: ( rule__AttributeElement__Group__1__Impl rule__AttributeElement__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2383:2: rule__AttributeElement__Group__1__Impl rule__AttributeElement__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeElement__Group__1__Impl_in_rule__AttributeElement__Group__14893);
            rule__AttributeElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElement__Group__2_in_rule__AttributeElement__Group__14896);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2390:1: rule__AttributeElement__Group__1__Impl : ( '=' ) ;
    public final void rule__AttributeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2394:1: ( ( '=' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2395:1: ( '=' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2395:1: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2396:1: '='
            {
             before(grammarAccess.getAttributeElementAccess().getEqualsSignKeyword_1()); 
            match(input,27,FOLLOW_27_in_rule__AttributeElement__Group__1__Impl4924); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2409:1: rule__AttributeElement__Group__2 : rule__AttributeElement__Group__2__Impl ;
    public final void rule__AttributeElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2413:1: ( rule__AttributeElement__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2414:2: rule__AttributeElement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeElement__Group__2__Impl_in_rule__AttributeElement__Group__24955);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2420:1: rule__AttributeElement__Group__2__Impl : ( ( rule__AttributeElement__ValueAssignment_2 ) ) ;
    public final void rule__AttributeElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2424:1: ( ( ( rule__AttributeElement__ValueAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2425:1: ( ( rule__AttributeElement__ValueAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2425:1: ( ( rule__AttributeElement__ValueAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2426:1: ( rule__AttributeElement__ValueAssignment_2 )
            {
             before(grammarAccess.getAttributeElementAccess().getValueAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2427:1: ( rule__AttributeElement__ValueAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2427:2: rule__AttributeElement__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__AttributeElement__ValueAssignment_2_in_rule__AttributeElement__Group__2__Impl4982);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2443:1: rule__AttributeValueArray__Group__0 : rule__AttributeValueArray__Group__0__Impl rule__AttributeValueArray__Group__1 ;
    public final void rule__AttributeValueArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2447:1: ( rule__AttributeValueArray__Group__0__Impl rule__AttributeValueArray__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2448:2: rule__AttributeValueArray__Group__0__Impl rule__AttributeValueArray__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__0__Impl_in_rule__AttributeValueArray__Group__05018);
            rule__AttributeValueArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group__1_in_rule__AttributeValueArray__Group__05021);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2455:1: rule__AttributeValueArray__Group__0__Impl : ( '{' ) ;
    public final void rule__AttributeValueArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2459:1: ( ( '{' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2460:1: ( '{' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2460:1: ( '{' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2461:1: '{'
            {
             before(grammarAccess.getAttributeValueArrayAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,29,FOLLOW_29_in_rule__AttributeValueArray__Group__0__Impl5049); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2474:1: rule__AttributeValueArray__Group__1 : rule__AttributeValueArray__Group__1__Impl rule__AttributeValueArray__Group__2 ;
    public final void rule__AttributeValueArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2478:1: ( rule__AttributeValueArray__Group__1__Impl rule__AttributeValueArray__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2479:2: rule__AttributeValueArray__Group__1__Impl rule__AttributeValueArray__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__1__Impl_in_rule__AttributeValueArray__Group__15080);
            rule__AttributeValueArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group__2_in_rule__AttributeValueArray__Group__15083);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2486:1: rule__AttributeValueArray__Group__1__Impl : ( ( rule__AttributeValueArray__ElementsAssignment_1 ) ) ;
    public final void rule__AttributeValueArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2490:1: ( ( ( rule__AttributeValueArray__ElementsAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2491:1: ( ( rule__AttributeValueArray__ElementsAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2491:1: ( ( rule__AttributeValueArray__ElementsAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2492:1: ( rule__AttributeValueArray__ElementsAssignment_1 )
            {
             before(grammarAccess.getAttributeValueArrayAccess().getElementsAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2493:1: ( rule__AttributeValueArray__ElementsAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2493:2: rule__AttributeValueArray__ElementsAssignment_1
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__ElementsAssignment_1_in_rule__AttributeValueArray__Group__1__Impl5110);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2503:1: rule__AttributeValueArray__Group__2 : rule__AttributeValueArray__Group__2__Impl rule__AttributeValueArray__Group__3 ;
    public final void rule__AttributeValueArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2507:1: ( rule__AttributeValueArray__Group__2__Impl rule__AttributeValueArray__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2508:2: rule__AttributeValueArray__Group__2__Impl rule__AttributeValueArray__Group__3
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__2__Impl_in_rule__AttributeValueArray__Group__25140);
            rule__AttributeValueArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group__3_in_rule__AttributeValueArray__Group__25143);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2515:1: rule__AttributeValueArray__Group__2__Impl : ( ( rule__AttributeValueArray__Group_2__0 )* ) ;
    public final void rule__AttributeValueArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2519:1: ( ( ( rule__AttributeValueArray__Group_2__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2520:1: ( ( rule__AttributeValueArray__Group_2__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2520:1: ( ( rule__AttributeValueArray__Group_2__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2521:1: ( rule__AttributeValueArray__Group_2__0 )*
            {
             before(grammarAccess.getAttributeValueArrayAccess().getGroup_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2522:1: ( rule__AttributeValueArray__Group_2__0 )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==36) ) {
                    int LA22_1 = input.LA(2);

                    if ( ((LA22_1>=RULE_STRING && LA22_1<=RULE_DECIMAL)||(LA22_1>=24 && LA22_1<=25)||LA22_1==29) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2522:2: rule__AttributeValueArray__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__AttributeValueArray__Group_2__0_in_rule__AttributeValueArray__Group__2__Impl5170);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2532:1: rule__AttributeValueArray__Group__3 : rule__AttributeValueArray__Group__3__Impl rule__AttributeValueArray__Group__4 ;
    public final void rule__AttributeValueArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2536:1: ( rule__AttributeValueArray__Group__3__Impl rule__AttributeValueArray__Group__4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2537:2: rule__AttributeValueArray__Group__3__Impl rule__AttributeValueArray__Group__4
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__3__Impl_in_rule__AttributeValueArray__Group__35201);
            rule__AttributeValueArray__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group__4_in_rule__AttributeValueArray__Group__35204);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2544:1: rule__AttributeValueArray__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__AttributeValueArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2548:1: ( ( ( ',' )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2549:1: ( ( ',' )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2549:1: ( ( ',' )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2550:1: ( ',' )?
            {
             before(grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2551:1: ( ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==36) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2552:2: ','
                    {
                    match(input,36,FOLLOW_36_in_rule__AttributeValueArray__Group__3__Impl5233); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2563:1: rule__AttributeValueArray__Group__4 : rule__AttributeValueArray__Group__4__Impl ;
    public final void rule__AttributeValueArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2567:1: ( rule__AttributeValueArray__Group__4__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2568:2: rule__AttributeValueArray__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__4__Impl_in_rule__AttributeValueArray__Group__45266);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2574:1: rule__AttributeValueArray__Group__4__Impl : ( '}' ) ;
    public final void rule__AttributeValueArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2578:1: ( ( '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2579:1: ( '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2579:1: ( '}' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2580:1: '}'
            {
             before(grammarAccess.getAttributeValueArrayAccess().getRightCurlyBracketKeyword_4()); 
            match(input,30,FOLLOW_30_in_rule__AttributeValueArray__Group__4__Impl5294); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2603:1: rule__AttributeValueArray__Group_2__0 : rule__AttributeValueArray__Group_2__0__Impl rule__AttributeValueArray__Group_2__1 ;
    public final void rule__AttributeValueArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2607:1: ( rule__AttributeValueArray__Group_2__0__Impl rule__AttributeValueArray__Group_2__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2608:2: rule__AttributeValueArray__Group_2__0__Impl rule__AttributeValueArray__Group_2__1
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group_2__0__Impl_in_rule__AttributeValueArray__Group_2__05335);
            rule__AttributeValueArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group_2__1_in_rule__AttributeValueArray__Group_2__05338);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2615:1: rule__AttributeValueArray__Group_2__0__Impl : ( ',' ) ;
    public final void rule__AttributeValueArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2619:1: ( ( ',' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2620:1: ( ',' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2620:1: ( ',' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2621:1: ','
            {
             before(grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_2_0()); 
            match(input,36,FOLLOW_36_in_rule__AttributeValueArray__Group_2__0__Impl5366); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2634:1: rule__AttributeValueArray__Group_2__1 : rule__AttributeValueArray__Group_2__1__Impl ;
    public final void rule__AttributeValueArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2638:1: ( rule__AttributeValueArray__Group_2__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2639:2: rule__AttributeValueArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group_2__1__Impl_in_rule__AttributeValueArray__Group_2__15397);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2645:1: rule__AttributeValueArray__Group_2__1__Impl : ( ( rule__AttributeValueArray__ElementsAssignment_2_1 ) ) ;
    public final void rule__AttributeValueArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2649:1: ( ( ( rule__AttributeValueArray__ElementsAssignment_2_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2650:1: ( ( rule__AttributeValueArray__ElementsAssignment_2_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2650:1: ( ( rule__AttributeValueArray__ElementsAssignment_2_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2651:1: ( rule__AttributeValueArray__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getAttributeValueArrayAccess().getElementsAssignment_2_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2652:1: ( rule__AttributeValueArray__ElementsAssignment_2_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2652:2: rule__AttributeValueArray__ElementsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__ElementsAssignment_2_1_in_rule__AttributeValueArray__Group_2__1__Impl5424);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2666:1: rule__Grouping__Group__0 : rule__Grouping__Group__0__Impl rule__Grouping__Group__1 ;
    public final void rule__Grouping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2670:1: ( rule__Grouping__Group__0__Impl rule__Grouping__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2671:2: rule__Grouping__Group__0__Impl rule__Grouping__Group__1
            {
            pushFollow(FOLLOW_rule__Grouping__Group__0__Impl_in_rule__Grouping__Group__05458);
            rule__Grouping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group__1_in_rule__Grouping__Group__05461);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2678:1: rule__Grouping__Group__0__Impl : ( '%' ) ;
    public final void rule__Grouping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2682:1: ( ( '%' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2683:1: ( '%' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2683:1: ( '%' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2684:1: '%'
            {
             before(grammarAccess.getGroupingAccess().getPercentSignKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Grouping__Group__0__Impl5489); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2697:1: rule__Grouping__Group__1 : rule__Grouping__Group__1__Impl rule__Grouping__Group__2 ;
    public final void rule__Grouping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2701:1: ( rule__Grouping__Group__1__Impl rule__Grouping__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2702:2: rule__Grouping__Group__1__Impl rule__Grouping__Group__2
            {
            pushFollow(FOLLOW_rule__Grouping__Group__1__Impl_in_rule__Grouping__Group__15520);
            rule__Grouping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group__2_in_rule__Grouping__Group__15523);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2709:1: rule__Grouping__Group__1__Impl : ( ( rule__Grouping__NameAssignment_1 ) ) ;
    public final void rule__Grouping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2713:1: ( ( ( rule__Grouping__NameAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2714:1: ( ( rule__Grouping__NameAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2714:1: ( ( rule__Grouping__NameAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2715:1: ( rule__Grouping__NameAssignment_1 )
            {
             before(grammarAccess.getGroupingAccess().getNameAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2716:1: ( rule__Grouping__NameAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2716:2: rule__Grouping__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Grouping__NameAssignment_1_in_rule__Grouping__Group__1__Impl5550);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2726:1: rule__Grouping__Group__2 : rule__Grouping__Group__2__Impl ;
    public final void rule__Grouping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2730:1: ( rule__Grouping__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2731:2: rule__Grouping__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Grouping__Group__2__Impl_in_rule__Grouping__Group__25580);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2737:1: rule__Grouping__Group__2__Impl : ( ( rule__Grouping__Group_2__0 )* ) ;
    public final void rule__Grouping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2741:1: ( ( ( rule__Grouping__Group_2__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2742:1: ( ( rule__Grouping__Group_2__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2742:1: ( ( rule__Grouping__Group_2__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2743:1: ( rule__Grouping__Group_2__0 )*
            {
             before(grammarAccess.getGroupingAccess().getGroup_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2744:1: ( rule__Grouping__Group_2__0 )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==36) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2744:2: rule__Grouping__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Grouping__Group_2__0_in_rule__Grouping__Group__2__Impl5607);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2760:1: rule__Grouping__Group_2__0 : rule__Grouping__Group_2__0__Impl rule__Grouping__Group_2__1 ;
    public final void rule__Grouping__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2764:1: ( rule__Grouping__Group_2__0__Impl rule__Grouping__Group_2__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2765:2: rule__Grouping__Group_2__0__Impl rule__Grouping__Group_2__1
            {
            pushFollow(FOLLOW_rule__Grouping__Group_2__0__Impl_in_rule__Grouping__Group_2__05644);
            rule__Grouping__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group_2__1_in_rule__Grouping__Group_2__05647);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2772:1: rule__Grouping__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Grouping__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2776:1: ( ( ',' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2777:1: ( ',' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2777:1: ( ',' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2778:1: ','
            {
             before(grammarAccess.getGroupingAccess().getCommaKeyword_2_0()); 
            match(input,36,FOLLOW_36_in_rule__Grouping__Group_2__0__Impl5675); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2791:1: rule__Grouping__Group_2__1 : rule__Grouping__Group_2__1__Impl ;
    public final void rule__Grouping__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2795:1: ( rule__Grouping__Group_2__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2796:2: rule__Grouping__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Grouping__Group_2__1__Impl_in_rule__Grouping__Group_2__15706);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2802:1: rule__Grouping__Group_2__1__Impl : ( ( rule__Grouping__NameAssignment_2_1 ) ) ;
    public final void rule__Grouping__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2806:1: ( ( ( rule__Grouping__NameAssignment_2_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2807:1: ( ( rule__Grouping__NameAssignment_2_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2807:1: ( ( rule__Grouping__NameAssignment_2_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2808:1: ( rule__Grouping__NameAssignment_2_1 )
            {
             before(grammarAccess.getGroupingAccess().getNameAssignment_2_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2809:1: ( rule__Grouping__NameAssignment_2_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2809:2: rule__Grouping__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Grouping__NameAssignment_2_1_in_rule__Grouping__Group_2__1__Impl5733);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2823:1: rule__ModelFolding__Group__0 : rule__ModelFolding__Group__0__Impl rule__ModelFolding__Group__1 ;
    public final void rule__ModelFolding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2827:1: ( rule__ModelFolding__Group__0__Impl rule__ModelFolding__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2828:2: rule__ModelFolding__Group__0__Impl rule__ModelFolding__Group__1
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__0__Impl_in_rule__ModelFolding__Group__05767);
            rule__ModelFolding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelFolding__Group__1_in_rule__ModelFolding__Group__05770);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2835:1: rule__ModelFolding__Group__0__Impl : ( '=>' ) ;
    public final void rule__ModelFolding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2839:1: ( ( '=>' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2840:1: ( '=>' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2840:1: ( '=>' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2841:1: '=>'
            {
             before(grammarAccess.getModelFoldingAccess().getEqualsSignGreaterThanSignKeyword_0()); 
            match(input,12,FOLLOW_12_in_rule__ModelFolding__Group__0__Impl5798); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2854:1: rule__ModelFolding__Group__1 : rule__ModelFolding__Group__1__Impl rule__ModelFolding__Group__2 ;
    public final void rule__ModelFolding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2858:1: ( rule__ModelFolding__Group__1__Impl rule__ModelFolding__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2859:2: rule__ModelFolding__Group__1__Impl rule__ModelFolding__Group__2
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__1__Impl_in_rule__ModelFolding__Group__15829);
            rule__ModelFolding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelFolding__Group__2_in_rule__ModelFolding__Group__15832);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2866:1: rule__ModelFolding__Group__1__Impl : ( '{' ) ;
    public final void rule__ModelFolding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2870:1: ( ( '{' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2871:1: ( '{' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2871:1: ( '{' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2872:1: '{'
            {
             before(grammarAccess.getModelFoldingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,29,FOLLOW_29_in_rule__ModelFolding__Group__1__Impl5860); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2885:1: rule__ModelFolding__Group__2 : rule__ModelFolding__Group__2__Impl rule__ModelFolding__Group__3 ;
    public final void rule__ModelFolding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2889:1: ( rule__ModelFolding__Group__2__Impl rule__ModelFolding__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2890:2: rule__ModelFolding__Group__2__Impl rule__ModelFolding__Group__3
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__2__Impl_in_rule__ModelFolding__Group__25891);
            rule__ModelFolding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelFolding__Group__3_in_rule__ModelFolding__Group__25894);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2897:1: rule__ModelFolding__Group__2__Impl : ( ( ( rule__ModelFolding__FoldingsAssignment_2 ) ) ( ( rule__ModelFolding__FoldingsAssignment_2 )* ) ) ;
    public final void rule__ModelFolding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2901:1: ( ( ( ( rule__ModelFolding__FoldingsAssignment_2 ) ) ( ( rule__ModelFolding__FoldingsAssignment_2 )* ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2902:1: ( ( ( rule__ModelFolding__FoldingsAssignment_2 ) ) ( ( rule__ModelFolding__FoldingsAssignment_2 )* ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2902:1: ( ( ( rule__ModelFolding__FoldingsAssignment_2 ) ) ( ( rule__ModelFolding__FoldingsAssignment_2 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2903:1: ( ( rule__ModelFolding__FoldingsAssignment_2 ) ) ( ( rule__ModelFolding__FoldingsAssignment_2 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2903:1: ( ( rule__ModelFolding__FoldingsAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2904:1: ( rule__ModelFolding__FoldingsAssignment_2 )
            {
             before(grammarAccess.getModelFoldingAccess().getFoldingsAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2905:1: ( rule__ModelFolding__FoldingsAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2905:2: rule__ModelFolding__FoldingsAssignment_2
            {
            pushFollow(FOLLOW_rule__ModelFolding__FoldingsAssignment_2_in_rule__ModelFolding__Group__2__Impl5923);
            rule__ModelFolding__FoldingsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getModelFoldingAccess().getFoldingsAssignment_2()); 

            }

            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2908:1: ( ( rule__ModelFolding__FoldingsAssignment_2 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2909:1: ( rule__ModelFolding__FoldingsAssignment_2 )*
            {
             before(grammarAccess.getModelFoldingAccess().getFoldingsAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2910:1: ( rule__ModelFolding__FoldingsAssignment_2 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_NAME_TOKEN)||LA25_0==33) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2910:2: rule__ModelFolding__FoldingsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__ModelFolding__FoldingsAssignment_2_in_rule__ModelFolding__Group__2__Impl5935);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2921:1: rule__ModelFolding__Group__3 : rule__ModelFolding__Group__3__Impl ;
    public final void rule__ModelFolding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2925:1: ( rule__ModelFolding__Group__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2926:2: rule__ModelFolding__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__3__Impl_in_rule__ModelFolding__Group__35968);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2932:1: rule__ModelFolding__Group__3__Impl : ( '}' ) ;
    public final void rule__ModelFolding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2936:1: ( ( '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2937:1: ( '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2937:1: ( '}' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2938:1: '}'
            {
             before(grammarAccess.getModelFoldingAccess().getRightCurlyBracketKeyword_3()); 
            match(input,30,FOLLOW_30_in_rule__ModelFolding__Group__3__Impl5996); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2959:1: rule__PropertyFolding__Group__0 : rule__PropertyFolding__Group__0__Impl rule__PropertyFolding__Group__1 ;
    public final void rule__PropertyFolding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2963:1: ( rule__PropertyFolding__Group__0__Impl rule__PropertyFolding__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2964:2: rule__PropertyFolding__Group__0__Impl rule__PropertyFolding__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__0__Impl_in_rule__PropertyFolding__Group__06035);
            rule__PropertyFolding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__1_in_rule__PropertyFolding__Group__06038);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2971:1: rule__PropertyFolding__Group__0__Impl : ( ( rule__PropertyFolding__DescriptionAssignment_0 )? ) ;
    public final void rule__PropertyFolding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2975:1: ( ( ( rule__PropertyFolding__DescriptionAssignment_0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2976:1: ( ( rule__PropertyFolding__DescriptionAssignment_0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2976:1: ( ( rule__PropertyFolding__DescriptionAssignment_0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2977:1: ( rule__PropertyFolding__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getPropertyFoldingAccess().getDescriptionAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2978:1: ( rule__PropertyFolding__DescriptionAssignment_0 )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2978:2: rule__PropertyFolding__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PropertyFolding__DescriptionAssignment_0_in_rule__PropertyFolding__Group__0__Impl6065);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2988:1: rule__PropertyFolding__Group__1 : rule__PropertyFolding__Group__1__Impl rule__PropertyFolding__Group__2 ;
    public final void rule__PropertyFolding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2992:1: ( rule__PropertyFolding__Group__1__Impl rule__PropertyFolding__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2993:2: rule__PropertyFolding__Group__1__Impl rule__PropertyFolding__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__1__Impl_in_rule__PropertyFolding__Group__16096);
            rule__PropertyFolding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__2_in_rule__PropertyFolding__Group__16099);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3000:1: rule__PropertyFolding__Group__1__Impl : ( ( rule__PropertyFolding__AttributesAssignment_1 )? ) ;
    public final void rule__PropertyFolding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3004:1: ( ( ( rule__PropertyFolding__AttributesAssignment_1 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3005:1: ( ( rule__PropertyFolding__AttributesAssignment_1 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3005:1: ( ( rule__PropertyFolding__AttributesAssignment_1 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3006:1: ( rule__PropertyFolding__AttributesAssignment_1 )?
            {
             before(grammarAccess.getPropertyFoldingAccess().getAttributesAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3007:1: ( rule__PropertyFolding__AttributesAssignment_1 )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==33) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3007:2: rule__PropertyFolding__AttributesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PropertyFolding__AttributesAssignment_1_in_rule__PropertyFolding__Group__1__Impl6126);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3017:1: rule__PropertyFolding__Group__2 : rule__PropertyFolding__Group__2__Impl rule__PropertyFolding__Group__3 ;
    public final void rule__PropertyFolding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3021:1: ( rule__PropertyFolding__Group__2__Impl rule__PropertyFolding__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3022:2: rule__PropertyFolding__Group__2__Impl rule__PropertyFolding__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__2__Impl_in_rule__PropertyFolding__Group__26157);
            rule__PropertyFolding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__3_in_rule__PropertyFolding__Group__26160);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3029:1: rule__PropertyFolding__Group__2__Impl : ( ( rule__PropertyFolding__AggregatorAssignment_2 ) ) ;
    public final void rule__PropertyFolding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3033:1: ( ( ( rule__PropertyFolding__AggregatorAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3034:1: ( ( rule__PropertyFolding__AggregatorAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3034:1: ( ( rule__PropertyFolding__AggregatorAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3035:1: ( rule__PropertyFolding__AggregatorAssignment_2 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getAggregatorAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3036:1: ( rule__PropertyFolding__AggregatorAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3036:2: rule__PropertyFolding__AggregatorAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyFolding__AggregatorAssignment_2_in_rule__PropertyFolding__Group__2__Impl6187);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3046:1: rule__PropertyFolding__Group__3 : rule__PropertyFolding__Group__3__Impl rule__PropertyFolding__Group__4 ;
    public final void rule__PropertyFolding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3050:1: ( rule__PropertyFolding__Group__3__Impl rule__PropertyFolding__Group__4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3051:2: rule__PropertyFolding__Group__3__Impl rule__PropertyFolding__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__3__Impl_in_rule__PropertyFolding__Group__36217);
            rule__PropertyFolding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__4_in_rule__PropertyFolding__Group__36220);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3058:1: rule__PropertyFolding__Group__3__Impl : ( ( rule__PropertyFolding__FromAssignment_3 ) ) ;
    public final void rule__PropertyFolding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3062:1: ( ( ( rule__PropertyFolding__FromAssignment_3 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3063:1: ( ( rule__PropertyFolding__FromAssignment_3 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3063:1: ( ( rule__PropertyFolding__FromAssignment_3 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3064:1: ( rule__PropertyFolding__FromAssignment_3 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getFromAssignment_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3065:1: ( rule__PropertyFolding__FromAssignment_3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3065:2: rule__PropertyFolding__FromAssignment_3
            {
            pushFollow(FOLLOW_rule__PropertyFolding__FromAssignment_3_in_rule__PropertyFolding__Group__3__Impl6247);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3075:1: rule__PropertyFolding__Group__4 : rule__PropertyFolding__Group__4__Impl rule__PropertyFolding__Group__5 ;
    public final void rule__PropertyFolding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3079:1: ( rule__PropertyFolding__Group__4__Impl rule__PropertyFolding__Group__5 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3080:2: rule__PropertyFolding__Group__4__Impl rule__PropertyFolding__Group__5
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__4__Impl_in_rule__PropertyFolding__Group__46277);
            rule__PropertyFolding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__5_in_rule__PropertyFolding__Group__46280);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3087:1: rule__PropertyFolding__Group__4__Impl : ( ( rule__PropertyFolding__Alternatives_4 ) ) ;
    public final void rule__PropertyFolding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3091:1: ( ( ( rule__PropertyFolding__Alternatives_4 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3092:1: ( ( rule__PropertyFolding__Alternatives_4 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3092:1: ( ( rule__PropertyFolding__Alternatives_4 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3093:1: ( rule__PropertyFolding__Alternatives_4 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getAlternatives_4()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3094:1: ( rule__PropertyFolding__Alternatives_4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3094:2: rule__PropertyFolding__Alternatives_4
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Alternatives_4_in_rule__PropertyFolding__Group__4__Impl6307);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3104:1: rule__PropertyFolding__Group__5 : rule__PropertyFolding__Group__5__Impl rule__PropertyFolding__Group__6 ;
    public final void rule__PropertyFolding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3108:1: ( rule__PropertyFolding__Group__5__Impl rule__PropertyFolding__Group__6 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3109:2: rule__PropertyFolding__Group__5__Impl rule__PropertyFolding__Group__6
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__5__Impl_in_rule__PropertyFolding__Group__56337);
            rule__PropertyFolding__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__6_in_rule__PropertyFolding__Group__56340);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3116:1: rule__PropertyFolding__Group__5__Impl : ( ( rule__PropertyFolding__NameAssignment_5 ) ) ;
    public final void rule__PropertyFolding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3120:1: ( ( ( rule__PropertyFolding__NameAssignment_5 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3121:1: ( ( rule__PropertyFolding__NameAssignment_5 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3121:1: ( ( rule__PropertyFolding__NameAssignment_5 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3122:1: ( rule__PropertyFolding__NameAssignment_5 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getNameAssignment_5()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3123:1: ( rule__PropertyFolding__NameAssignment_5 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3123:2: rule__PropertyFolding__NameAssignment_5
            {
            pushFollow(FOLLOW_rule__PropertyFolding__NameAssignment_5_in_rule__PropertyFolding__Group__5__Impl6367);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3133:1: rule__PropertyFolding__Group__6 : rule__PropertyFolding__Group__6__Impl ;
    public final void rule__PropertyFolding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3137:1: ( rule__PropertyFolding__Group__6__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3138:2: rule__PropertyFolding__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__6__Impl_in_rule__PropertyFolding__Group__66397);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3144:1: rule__PropertyFolding__Group__6__Impl : ( ';' ) ;
    public final void rule__PropertyFolding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3148:1: ( ( ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3149:1: ( ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3149:1: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3150:1: ';'
            {
             before(grammarAccess.getPropertyFoldingAccess().getSemicolonKeyword_6()); 
            match(input,26,FOLLOW_26_in_rule__PropertyFolding__Group__6__Impl6425); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3177:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3181:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3182:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06470);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06473);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3189:1: rule__QualifiedName__Group__0__Impl : ( ( rule__QualifiedName__NameAssignment_0 ) ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3193:1: ( ( ( rule__QualifiedName__NameAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3194:1: ( ( rule__QualifiedName__NameAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3194:1: ( ( rule__QualifiedName__NameAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3195:1: ( rule__QualifiedName__NameAssignment_0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getNameAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3196:1: ( rule__QualifiedName__NameAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3196:2: rule__QualifiedName__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__QualifiedName__NameAssignment_0_in_rule__QualifiedName__Group__0__Impl6500);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3206:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3210:1: ( rule__QualifiedName__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3211:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16530);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3217:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3221:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3222:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3222:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3223:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3224:1: ( rule__QualifiedName__Group_1__0 )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==38) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3224:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6557);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3238:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3242:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3243:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06592);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06595);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3250:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3254:1: ( ( '.' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3255:1: ( '.' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3255:1: ( '.' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3256:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,38,FOLLOW_38_in_rule__QualifiedName__Group_1__0__Impl6623); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3269:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3273:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3274:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16654);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3280:1: rule__QualifiedName__Group_1__1__Impl : ( ( rule__QualifiedName__NameAssignment_1_1 ) ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3284:1: ( ( ( rule__QualifiedName__NameAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3285:1: ( ( rule__QualifiedName__NameAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3285:1: ( ( rule__QualifiedName__NameAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3286:1: ( rule__QualifiedName__NameAssignment_1_1 )
            {
             before(grammarAccess.getQualifiedNameAccess().getNameAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3287:1: ( rule__QualifiedName__NameAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3287:2: rule__QualifiedName__NameAssignment_1_1
            {
            pushFollow(FOLLOW_rule__QualifiedName__NameAssignment_1_1_in_rule__QualifiedName__Group_1__1__Impl6681);
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


    // $ANTLR start "rule__Models__ListAssignment"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3302:1: rule__Models__ListAssignment : ( ruleModelDefinition ) ;
    public final void rule__Models__ListAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3306:1: ( ( ruleModelDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3307:1: ( ruleModelDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3307:1: ( ruleModelDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3308:1: ruleModelDefinition
            {
             before(grammarAccess.getModelsAccess().getListModelDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleModelDefinition_in_rule__Models__ListAssignment6720);
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


    // $ANTLR start "rule__ModelDefinition__DescriptionAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3317:1: rule__ModelDefinition__DescriptionAssignment_0 : ( ruleDescription ) ;
    public final void rule__ModelDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3321:1: ( ( ruleDescription ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3322:1: ( ruleDescription )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3322:1: ( ruleDescription )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3323:1: ruleDescription
            {
             before(grammarAccess.getModelDefinitionAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__ModelDefinition__DescriptionAssignment_06751);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3332:1: rule__ModelDefinition__AttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__ModelDefinition__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3336:1: ( ( ruleAttributeList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3337:1: ( ruleAttributeList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3337:1: ( ruleAttributeList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3338:1: ruleAttributeList
            {
             before(grammarAccess.getModelDefinitionAccess().getAttributesAttributeListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__ModelDefinition__AttributesAssignment_16782);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3347:1: rule__ModelDefinition__ModelAssignment_2_0 : ( ruleRecordModelDefinition ) ;
    public final void rule__ModelDefinition__ModelAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3351:1: ( ( ruleRecordModelDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3352:1: ( ruleRecordModelDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3352:1: ( ruleRecordModelDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3353:1: ruleRecordModelDefinition
            {
             before(grammarAccess.getModelDefinitionAccess().getModelRecordModelDefinitionParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleRecordModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_06813);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3362:1: rule__ModelDefinition__ModelAssignment_2_1 : ( ruleSummarizeModelDefinition ) ;
    public final void rule__ModelDefinition__ModelAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3366:1: ( ( ruleSummarizeModelDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3367:1: ( ruleSummarizeModelDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3367:1: ( ruleSummarizeModelDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3368:1: ruleSummarizeModelDefinition
            {
             before(grammarAccess.getModelDefinitionAccess().getModelSummarizeModelDefinitionParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleSummarizeModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_16844);
            ruleSummarizeModelDefinition();

            state._fsp--;

             after(grammarAccess.getModelDefinitionAccess().getModelSummarizeModelDefinitionParserRuleCall_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__RecordModelDefinition__NameAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3377:1: rule__RecordModelDefinition__NameAssignment_0 : ( ruleName ) ;
    public final void rule__RecordModelDefinition__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3381:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3382:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3382:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3383:1: ruleName
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__RecordModelDefinition__NameAssignment_06875);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3392:1: rule__RecordModelDefinition__RhsAssignment_2 : ( ruleRecordExpression ) ;
    public final void rule__RecordModelDefinition__RhsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3396:1: ( ( ruleRecordExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3397:1: ( ruleRecordExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3397:1: ( ruleRecordExpression )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3398:1: ruleRecordExpression
            {
             before(grammarAccess.getRecordModelDefinitionAccess().getRhsRecordExpressionParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleRecordExpression_in_rule__RecordModelDefinition__RhsAssignment_26906);
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


    // $ANTLR start "rule__RecordExpression__TermsAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3407:1: rule__RecordExpression__TermsAssignment_0 : ( ruleRecordTerm ) ;
    public final void rule__RecordExpression__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3411:1: ( ( ruleRecordTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3412:1: ( ruleRecordTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3412:1: ( ruleRecordTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3413:1: ruleRecordTerm
            {
             before(grammarAccess.getRecordExpressionAccess().getTermsRecordTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRecordTerm_in_rule__RecordExpression__TermsAssignment_06937);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3422:1: rule__RecordExpression__TermsAssignment_1_1 : ( ruleRecordTerm ) ;
    public final void rule__RecordExpression__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3426:1: ( ( ruleRecordTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3427:1: ( ruleRecordTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3427:1: ( ruleRecordTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3428:1: ruleRecordTerm
            {
             before(grammarAccess.getRecordExpressionAccess().getTermsRecordTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRecordTerm_in_rule__RecordExpression__TermsAssignment_1_16968);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3437:1: rule__RecordTerm__PropertiesAssignment_0_1 : ( rulePropertyDefinition ) ;
    public final void rule__RecordTerm__PropertiesAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3441:1: ( ( rulePropertyDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3442:1: ( rulePropertyDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3442:1: ( rulePropertyDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3443:1: rulePropertyDefinition
            {
             before(grammarAccess.getRecordTermAccess().getPropertiesPropertyDefinitionParserRuleCall_0_1_0()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_rule__RecordTerm__PropertiesAssignment_0_16999);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3452:1: rule__RecordTerm__ReferenceAssignment_1 : ( ruleModelReference ) ;
    public final void rule__RecordTerm__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3456:1: ( ( ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3457:1: ( ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3457:1: ( ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3458:1: ruleModelReference
            {
             before(grammarAccess.getRecordTermAccess().getReferenceModelReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModelReference_in_rule__RecordTerm__ReferenceAssignment_17030);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3467:1: rule__ModelReference__NameAssignment : ( ruleName ) ;
    public final void rule__ModelReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3471:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3472:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3472:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3473:1: ruleName
            {
             before(grammarAccess.getModelReferenceAccess().getNameNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__ModelReference__NameAssignment7061);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3482:1: rule__PropertyDefinition__DescriptionAssignment_0 : ( ruleDescription ) ;
    public final void rule__PropertyDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3486:1: ( ( ruleDescription ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3487:1: ( ruleDescription )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3487:1: ( ruleDescription )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3488:1: ruleDescription
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__PropertyDefinition__DescriptionAssignment_07092);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3497:1: rule__PropertyDefinition__AttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__PropertyDefinition__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3501:1: ( ( ruleAttributeList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3502:1: ( ruleAttributeList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3502:1: ( ruleAttributeList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3503:1: ruleAttributeList
            {
             before(grammarAccess.getPropertyDefinitionAccess().getAttributesAttributeListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__PropertyDefinition__AttributesAssignment_17123);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3512:1: rule__PropertyDefinition__NameAssignment_2 : ( ruleName ) ;
    public final void rule__PropertyDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3516:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3517:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3517:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3518:1: ruleName
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNameNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__PropertyDefinition__NameAssignment_27154);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3527:1: rule__PropertyDefinition__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__PropertyDefinition__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3531:1: ( ( ruleType ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3532:1: ( ruleType )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3532:1: ( ruleType )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3533:1: ruleType
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypeTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__PropertyDefinition__TypeAssignment_47185);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3542:1: rule__SummarizeModelDefinition__NameAssignment_1 : ( ruleName ) ;
    public final void rule__SummarizeModelDefinition__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3546:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3547:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3547:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3548:1: ruleName
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__SummarizeModelDefinition__NameAssignment_17216);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3557:1: rule__SummarizeModelDefinition__RhsAssignment_3 : ( ruleSummarizeExpression ) ;
    public final void rule__SummarizeModelDefinition__RhsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3561:1: ( ( ruleSummarizeExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3562:1: ( ruleSummarizeExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3562:1: ( ruleSummarizeExpression )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3563:1: ruleSummarizeExpression
            {
             before(grammarAccess.getSummarizeModelDefinitionAccess().getRhsSummarizeExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleSummarizeExpression_in_rule__SummarizeModelDefinition__RhsAssignment_37247);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3572:1: rule__SummarizeExpression__TermsAssignment_0 : ( ruleSummarizeTerm ) ;
    public final void rule__SummarizeExpression__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3576:1: ( ( ruleSummarizeTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3577:1: ( ruleSummarizeTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3577:1: ( ruleSummarizeTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3578:1: ruleSummarizeTerm
            {
             before(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSummarizeTerm_in_rule__SummarizeExpression__TermsAssignment_07278);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3587:1: rule__SummarizeExpression__TermsAssignment_1_1 : ( ruleSummarizeTerm ) ;
    public final void rule__SummarizeExpression__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3591:1: ( ( ruleSummarizeTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3592:1: ( ruleSummarizeTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3592:1: ( ruleSummarizeTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3593:1: ruleSummarizeTerm
            {
             before(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleSummarizeTerm_in_rule__SummarizeExpression__TermsAssignment_1_17309);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3602:1: rule__SummarizeTerm__ReferenceAssignment_0 : ( ruleModelReference ) ;
    public final void rule__SummarizeTerm__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3606:1: ( ( ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3607:1: ( ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3607:1: ( ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3608:1: ruleModelReference
            {
             before(grammarAccess.getSummarizeTermAccess().getReferenceModelReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleModelReference_in_rule__SummarizeTerm__ReferenceAssignment_07340);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3617:1: rule__SummarizeTerm__FoldingAssignment_1 : ( ruleModelFolding ) ;
    public final void rule__SummarizeTerm__FoldingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3621:1: ( ( ruleModelFolding ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3622:1: ( ruleModelFolding )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3622:1: ( ruleModelFolding )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3623:1: ruleModelFolding
            {
             before(grammarAccess.getSummarizeTermAccess().getFoldingModelFoldingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModelFolding_in_rule__SummarizeTerm__FoldingAssignment_17371);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3632:1: rule__SummarizeTerm__GroupingAssignment_2 : ( ruleGrouping ) ;
    public final void rule__SummarizeTerm__GroupingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3636:1: ( ( ruleGrouping ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3637:1: ( ruleGrouping )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3637:1: ( ruleGrouping )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3638:1: ruleGrouping
            {
             before(grammarAccess.getSummarizeTermAccess().getGroupingGroupingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGrouping_in_rule__SummarizeTerm__GroupingAssignment_27402);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3647:1: rule__AttributeList__AttributesAssignment : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3651:1: ( ( ruleAttribute ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3652:1: ( ruleAttribute )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3652:1: ( ruleAttribute )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3653:1: ruleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__AttributeList__AttributesAssignment7433);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3662:1: rule__Attribute__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3666:1: ( ( ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3667:1: ( ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3667:1: ( ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3668:1: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Attribute__NameAssignment_17464);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3677:1: rule__Attribute__ElementsAssignment_2_1_0 : ( ruleAttributeElementList ) ;
    public final void rule__Attribute__ElementsAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3681:1: ( ( ruleAttributeElementList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3682:1: ( ruleAttributeElementList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3682:1: ( ruleAttributeElementList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3683:1: ruleAttributeElementList
            {
             before(grammarAccess.getAttributeAccess().getElementsAttributeElementListParserRuleCall_2_1_0_0()); 
            pushFollow(FOLLOW_ruleAttributeElementList_in_rule__Attribute__ElementsAssignment_2_1_07495);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3692:1: rule__AttributeElementList__ElementsAssignment_0 : ( ruleAttributeElement ) ;
    public final void rule__AttributeElementList__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3696:1: ( ( ruleAttributeElement ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3697:1: ( ruleAttributeElement )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3697:1: ( ruleAttributeElement )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3698:1: ruleAttributeElement
            {
             before(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttributeElement_in_rule__AttributeElementList__ElementsAssignment_07526);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3707:1: rule__AttributeElementList__ElementsAssignment_1_1 : ( ruleAttributeElement ) ;
    public final void rule__AttributeElementList__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3711:1: ( ( ruleAttributeElement ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3712:1: ( ruleAttributeElement )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3712:1: ( ruleAttributeElement )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3713:1: ruleAttributeElement
            {
             before(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAttributeElement_in_rule__AttributeElementList__ElementsAssignment_1_17557);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3722:1: rule__AttributeElement__NameAssignment_0 : ( ruleName ) ;
    public final void rule__AttributeElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3726:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3727:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3727:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3728:1: ruleName
            {
             before(grammarAccess.getAttributeElementAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__AttributeElement__NameAssignment_07588);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3737:1: rule__AttributeElement__ValueAssignment_2 : ( ruleAttributeValue ) ;
    public final void rule__AttributeElement__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3741:1: ( ( ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3742:1: ( ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3742:1: ( ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3743:1: ruleAttributeValue
            {
             before(grammarAccess.getAttributeElementAccess().getValueAttributeValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_rule__AttributeElement__ValueAssignment_27619);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3752:1: rule__AttributeValue__ValueAssignment_0 : ( ruleAttributeValueArray ) ;
    public final void rule__AttributeValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3756:1: ( ( ruleAttributeValueArray ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3757:1: ( ruleAttributeValueArray )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3757:1: ( ruleAttributeValueArray )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3758:1: ruleAttributeValueArray
            {
             before(grammarAccess.getAttributeValueAccess().getValueAttributeValueArrayParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttributeValueArray_in_rule__AttributeValue__ValueAssignment_07650);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3767:1: rule__AttributeValue__ValueAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__AttributeValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3771:1: ( ( ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3772:1: ( ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3772:1: ( ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3773:1: ruleQualifiedName
            {
             before(grammarAccess.getAttributeValueAccess().getValueQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__AttributeValue__ValueAssignment_17681);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3782:1: rule__AttributeValue__ValueAssignment_2 : ( ruleLiteral ) ;
    public final void rule__AttributeValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3786:1: ( ( ruleLiteral ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3787:1: ( ruleLiteral )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3787:1: ( ruleLiteral )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3788:1: ruleLiteral
            {
             before(grammarAccess.getAttributeValueAccess().getValueLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__AttributeValue__ValueAssignment_27712);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3797:1: rule__AttributeValueArray__ElementsAssignment_1 : ( ruleAttributeValue ) ;
    public final void rule__AttributeValueArray__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3801:1: ( ( ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3802:1: ( ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3802:1: ( ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3803:1: ruleAttributeValue
            {
             before(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_rule__AttributeValueArray__ElementsAssignment_17743);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3812:1: rule__AttributeValueArray__ElementsAssignment_2_1 : ( ruleAttributeValue ) ;
    public final void rule__AttributeValueArray__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3816:1: ( ( ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3817:1: ( ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3817:1: ( ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3818:1: ruleAttributeValue
            {
             before(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_rule__AttributeValueArray__ElementsAssignment_2_17774);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3827:1: rule__Grouping__NameAssignment_1 : ( ruleName ) ;
    public final void rule__Grouping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3831:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3832:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3832:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3833:1: ruleName
            {
             before(grammarAccess.getGroupingAccess().getNameNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__Grouping__NameAssignment_17805);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3842:1: rule__Grouping__NameAssignment_2_1 : ( ruleName ) ;
    public final void rule__Grouping__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3846:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3847:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3847:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3848:1: ruleName
            {
             before(grammarAccess.getGroupingAccess().getNameNameParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__Grouping__NameAssignment_2_17836);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3857:1: rule__ModelFolding__FoldingsAssignment_2 : ( rulePropertyFolding ) ;
    public final void rule__ModelFolding__FoldingsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3861:1: ( ( rulePropertyFolding ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3862:1: ( rulePropertyFolding )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3862:1: ( rulePropertyFolding )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3863:1: rulePropertyFolding
            {
             before(grammarAccess.getModelFoldingAccess().getFoldingsPropertyFoldingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_rulePropertyFolding_in_rule__ModelFolding__FoldingsAssignment_27867);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3872:1: rule__PropertyFolding__DescriptionAssignment_0 : ( ruleDescription ) ;
    public final void rule__PropertyFolding__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3876:1: ( ( ruleDescription ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3877:1: ( ruleDescription )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3877:1: ( ruleDescription )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3878:1: ruleDescription
            {
             before(grammarAccess.getPropertyFoldingAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__PropertyFolding__DescriptionAssignment_07898);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3887:1: rule__PropertyFolding__AttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__PropertyFolding__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3891:1: ( ( ruleAttributeList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3892:1: ( ruleAttributeList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3892:1: ( ruleAttributeList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3893:1: ruleAttributeList
            {
             before(grammarAccess.getPropertyFoldingAccess().getAttributesAttributeListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__PropertyFolding__AttributesAssignment_17929);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3902:1: rule__PropertyFolding__AggregatorAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__PropertyFolding__AggregatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3906:1: ( ( ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3907:1: ( ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3907:1: ( ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3908:1: ruleQualifiedName
            {
             before(grammarAccess.getPropertyFoldingAccess().getAggregatorQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PropertyFolding__AggregatorAssignment_27960);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3917:1: rule__PropertyFolding__FromAssignment_3 : ( ruleName ) ;
    public final void rule__PropertyFolding__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3921:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3922:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3922:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3923:1: ruleName
            {
             before(grammarAccess.getPropertyFoldingAccess().getFromNameParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__PropertyFolding__FromAssignment_37991);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3932:1: rule__PropertyFolding__NameAssignment_5 : ( ruleName ) ;
    public final void rule__PropertyFolding__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3936:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3937:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3937:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3938:1: ruleName
            {
             before(grammarAccess.getPropertyFoldingAccess().getNameNameParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__PropertyFolding__NameAssignment_58022);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3947:1: rule__QualifiedName__NameAssignment_0 : ( ruleName ) ;
    public final void rule__QualifiedName__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3951:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3952:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3952:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3953:1: ruleName
            {
             before(grammarAccess.getQualifiedNameAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__QualifiedName__NameAssignment_08053);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3962:1: rule__QualifiedName__NameAssignment_1_1 : ( ruleName ) ;
    public final void rule__QualifiedName__NameAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3966:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3967:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3967:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3968:1: ruleName
            {
             before(grammarAccess.getQualifiedNameAccess().getNameNameParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__QualifiedName__NameAssignment_1_18084);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3977:1: rule__Literal__StringValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Literal__StringValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3981:1: ( ( RULE_STRING ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3982:1: ( RULE_STRING )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3982:1: ( RULE_STRING )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3983:1: RULE_STRING
            {
             before(grammarAccess.getLiteralAccess().getStringValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Literal__StringValueAssignment_08115); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3992:1: rule__Literal__IntValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Literal__IntValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3996:1: ( ( RULE_INT ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3997:1: ( RULE_INT )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3997:1: ( RULE_INT )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3998:1: RULE_INT
            {
             before(grammarAccess.getLiteralAccess().getIntValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Literal__IntValueAssignment_18146); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4007:1: rule__Literal__DecimalValueAssignment_2 : ( RULE_DECIMAL ) ;
    public final void rule__Literal__DecimalValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4011:1: ( ( RULE_DECIMAL ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4012:1: ( RULE_DECIMAL )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4012:1: ( RULE_DECIMAL )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4013:1: RULE_DECIMAL
            {
             before(grammarAccess.getLiteralAccess().getDecimalValueDECIMALTerminalRuleCall_2_0()); 
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Literal__DecimalValueAssignment_28177); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4022:1: rule__Literal__BooleanValueAssignment_3 : ( ruleBOOLEAN ) ;
    public final void rule__Literal__BooleanValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4026:1: ( ( ruleBOOLEAN ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4027:1: ( ruleBOOLEAN )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4027:1: ( ruleBOOLEAN )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4028:1: ruleBOOLEAN
            {
             before(grammarAccess.getLiteralAccess().getBooleanValueBOOLEANEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_rule__Literal__BooleanValueAssignment_38208);
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


 

    public static final BitSet FOLLOW_ruleModels_in_entryRuleModels61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModels68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Models__ListAssignment_in_ruleModels94 = new BitSet(new long[]{0x0000000300000032L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_entryRuleModelDefinition122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelDefinition129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__0_in_ruleModelDefinition155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordModelDefinition_in_entryRuleRecordModelDefinition182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordModelDefinition189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__0_in_ruleRecordModelDefinition215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_entryRuleRecordExpression242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordExpression249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__0_in_ruleRecordExpression275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordTerm309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Alternatives_in_ruleRecordTerm335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_entryRuleModelReference362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelReference369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelReference__NameAssignment_in_ruleModelReference395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeModelDefinition_in_entryRuleSummarizeModelDefinition482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeModelDefinition489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__0_in_ruleSummarizeModelDefinition515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeExpression_in_entryRuleSummarizeExpression542 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeExpression549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group__0_in_ruleSummarizeExpression575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_entryRuleSummarizeTerm602 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeTerm609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__0_in_ruleSummarizeTerm635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription662 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDescription695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_entryRuleAttributeList721 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeList728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__AttributesAssignment_in_ruleAttributeList756 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__AttributeList__AttributesAssignment_in_ruleAttributeList768 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElementList_in_entryRuleAttributeElementList858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElementList865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group__0_in_ruleAttributeElementList891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_entryRuleAttributeElement918 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElement925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__0_in_ruleAttributeElement951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__Alternatives_in_ruleAttributeValue1011 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueArray_in_entryRuleAttributeValueArray1038 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValueArray1045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__0_in_ruleAttributeValueArray1071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_entryRuleGrouping1098 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouping1105 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__0_in_ruleGrouping1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelFolding_in_entryRuleModelFolding1158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelFolding1165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__0_in_ruleModelFolding1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFolding_in_entryRulePropertyFolding1218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyFolding1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__0_in_rulePropertyFolding1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName1338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_TOKEN_in_ruleName1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN1503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__ModelAssignment_2_0_in_rule__ModelDefinition__Alternatives_21538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__ModelAssignment_2_1_in_rule__ModelDefinition__Alternatives_21556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__0_in_rule__RecordTerm__Alternatives1589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__ReferenceAssignment_1_in_rule__RecordTerm__Alternatives1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__ValueAssignment_0_in_rule__AttributeValue__Alternatives1640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__ValueAssignment_1_in_rule__AttributeValue__Alternatives1658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__ValueAssignment_2_in_rule__AttributeValue__Alternatives1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_rule__PropertyFolding__Alternatives_41710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__PropertyFolding__Alternatives_41730 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__StringValueAssignment_0_in_rule__Literal__Alternatives1764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__IntValueAssignment_1_in_rule__Literal__Alternatives1782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__DecimalValueAssignment_2_in_rule__Literal__Alternatives1800 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__BooleanValueAssignment_3_in_rule__Literal__Alternatives1818 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Type__Alternatives1852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Type__Alternatives1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Type__Alternatives1894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Type__Alternatives1915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Type__Alternatives1936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type__Alternatives1957 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Type__Alternatives1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Type__Alternatives1999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Type__Alternatives2020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Type__Alternatives2041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Type__Alternatives2062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__BOOLEAN__Alternatives2098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__BOOLEAN__Alternatives2119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__0__Impl_in_rule__ModelDefinition__Group__02152 = new BitSet(new long[]{0x0000000300000030L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__1_in_rule__ModelDefinition__Group__02155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__DescriptionAssignment_0_in_rule__ModelDefinition__Group__0__Impl2182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__1__Impl_in_rule__ModelDefinition__Group__12213 = new BitSet(new long[]{0x0000000300000030L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__2_in_rule__ModelDefinition__Group__12216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__AttributesAssignment_1_in_rule__ModelDefinition__Group__1__Impl2243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__2__Impl_in_rule__ModelDefinition__Group__22274 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__3_in_rule__ModelDefinition__Group__22277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Alternatives_2_in_rule__ModelDefinition__Group__2__Impl2304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__3__Impl_in_rule__ModelDefinition__Group__32334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__ModelDefinition__Group__3__Impl2362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__0__Impl_in_rule__RecordModelDefinition__Group__02401 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__1_in_rule__RecordModelDefinition__Group__02404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__NameAssignment_0_in_rule__RecordModelDefinition__Group__0__Impl2431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__1__Impl_in_rule__RecordModelDefinition__Group__12461 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__2_in_rule__RecordModelDefinition__Group__12464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__RecordModelDefinition__Group__1__Impl2492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__Group__2__Impl_in_rule__RecordModelDefinition__Group__22523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordModelDefinition__RhsAssignment_2_in_rule__RecordModelDefinition__Group__2__Impl2550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__0__Impl_in_rule__RecordExpression__Group__02586 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__1_in_rule__RecordExpression__Group__02589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__TermsAssignment_0_in_rule__RecordExpression__Group__0__Impl2616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__1__Impl_in_rule__RecordExpression__Group__12646 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__0_in_rule__RecordExpression__Group__1__Impl2673 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__0__Impl_in_rule__RecordExpression__Group_1__02708 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__1_in_rule__RecordExpression__Group_1__02711 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__RecordExpression__Group_1__0__Impl2739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__1__Impl_in_rule__RecordExpression__Group_1__12770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__TermsAssignment_1_1_in_rule__RecordExpression__Group_1__1__Impl2797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__0__Impl_in_rule__RecordTerm__Group_0__02831 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__1_in_rule__RecordTerm__Group_0__02834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__RecordTerm__Group_0__0__Impl2862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__1__Impl_in_rule__RecordTerm__Group_0__12893 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__2_in_rule__RecordTerm__Group_0__12896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__PropertiesAssignment_0_1_in_rule__RecordTerm__Group_0__1__Impl2925 = new BitSet(new long[]{0x0000000200000032L});
    public static final BitSet FOLLOW_rule__RecordTerm__PropertiesAssignment_0_1_in_rule__RecordTerm__Group_0__1__Impl2937 = new BitSet(new long[]{0x0000000200000032L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__2__Impl_in_rule__RecordTerm__Group_0__22970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__RecordTerm__Group_0__2__Impl2998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__03035 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__03038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DescriptionAssignment_0_in_rule__PropertyDefinition__Group__0__Impl3065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__13096 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__13099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__AttributesAssignment_1_in_rule__PropertyDefinition__Group__1__Impl3126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__23157 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__23160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NameAssignment_2_in_rule__PropertyDefinition__Group__2__Impl3187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__33217 = new BitSet(new long[]{0x0000000000FFE000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__33220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PropertyDefinition__Group__3__Impl3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__43279 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__43282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__TypeAssignment_4_in_rule__PropertyDefinition__Group__4__Impl3309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__53339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PropertyDefinition__Group__5__Impl3367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__0__Impl_in_rule__SummarizeModelDefinition__Group__03410 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__1_in_rule__SummarizeModelDefinition__Group__03413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__SummarizeModelDefinition__Group__0__Impl3441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__1__Impl_in_rule__SummarizeModelDefinition__Group__13472 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__2_in_rule__SummarizeModelDefinition__Group__13475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__NameAssignment_1_in_rule__SummarizeModelDefinition__Group__1__Impl3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__2__Impl_in_rule__SummarizeModelDefinition__Group__23532 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__3_in_rule__SummarizeModelDefinition__Group__23535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__SummarizeModelDefinition__Group__2__Impl3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__Group__3__Impl_in_rule__SummarizeModelDefinition__Group__33594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeModelDefinition__RhsAssignment_3_in_rule__SummarizeModelDefinition__Group__3__Impl3621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group__0__Impl_in_rule__SummarizeExpression__Group__03659 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group__1_in_rule__SummarizeExpression__Group__03662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__TermsAssignment_0_in_rule__SummarizeExpression__Group__0__Impl3689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group__1__Impl_in_rule__SummarizeExpression__Group__13719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group_1__0_in_rule__SummarizeExpression__Group__1__Impl3746 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group_1__0__Impl_in_rule__SummarizeExpression__Group_1__03781 = new BitSet(new long[]{0x0000000020000020L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group_1__1_in_rule__SummarizeExpression__Group_1__03784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__SummarizeExpression__Group_1__0__Impl3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group_1__1__Impl_in_rule__SummarizeExpression__Group_1__13843 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__TermsAssignment_1_1_in_rule__SummarizeExpression__Group_1__1__Impl3870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__0__Impl_in_rule__SummarizeTerm__Group__03904 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__1_in_rule__SummarizeTerm__Group__03907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__ReferenceAssignment_0_in_rule__SummarizeTerm__Group__0__Impl3934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__1__Impl_in_rule__SummarizeTerm__Group__13964 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__2_in_rule__SummarizeTerm__Group__13967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__FoldingAssignment_1_in_rule__SummarizeTerm__Group__1__Impl3994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__2__Impl_in_rule__SummarizeTerm__Group__24024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__GroupingAssignment_2_in_rule__SummarizeTerm__Group__2__Impl4051 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__04088 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__04091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__Attribute__Group__0__Impl4119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__14150 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__14153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl4180 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__24210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__0_in_rule__Attribute__Group__2__Impl4237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__0__Impl_in_rule__Attribute__Group_2__04274 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__1_in_rule__Attribute__Group_2__04277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__Attribute__Group_2__0__Impl4305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__1__Impl_in_rule__Attribute__Group_2__14336 = new BitSet(new long[]{0x0000000800000020L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__2_in_rule__Attribute__Group_2__14339 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_1__0_in_rule__Attribute__Group_2__1__Impl4366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2__2__Impl_in_rule__Attribute__Group_2__24397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__Attribute__Group_2__2__Impl4425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_1__0__Impl_in_rule__Attribute__Group_2_1__04462 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_1__1_in_rule__Attribute__Group_2_1__04465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ElementsAssignment_2_1_0_in_rule__Attribute__Group_2_1__0__Impl4492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group_2_1__1__Impl_in_rule__Attribute__Group_2_1__14522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Attribute__Group_2_1__1__Impl4551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group__0__Impl_in_rule__AttributeElementList__Group__04588 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group__1_in_rule__AttributeElementList__Group__04591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__ElementsAssignment_0_in_rule__AttributeElementList__Group__0__Impl4618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group__1__Impl_in_rule__AttributeElementList__Group__14648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group_1__0_in_rule__AttributeElementList__Group__1__Impl4675 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group_1__0__Impl_in_rule__AttributeElementList__Group_1__04710 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group_1__1_in_rule__AttributeElementList__Group_1__04713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AttributeElementList__Group_1__0__Impl4741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group_1__1__Impl_in_rule__AttributeElementList__Group_1__14772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__ElementsAssignment_1_1_in_rule__AttributeElementList__Group_1__1__Impl4799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__0__Impl_in_rule__AttributeElement__Group__04833 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__1_in_rule__AttributeElement__Group__04836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__NameAssignment_0_in_rule__AttributeElement__Group__0__Impl4863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__1__Impl_in_rule__AttributeElement__Group__14893 = new BitSet(new long[]{0x00000000230000F0L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__2_in_rule__AttributeElement__Group__14896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__AttributeElement__Group__1__Impl4924 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__2__Impl_in_rule__AttributeElement__Group__24955 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__ValueAssignment_2_in_rule__AttributeElement__Group__2__Impl4982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__0__Impl_in_rule__AttributeValueArray__Group__05018 = new BitSet(new long[]{0x00000000230000F0L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__1_in_rule__AttributeValueArray__Group__05021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__AttributeValueArray__Group__0__Impl5049 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__1__Impl_in_rule__AttributeValueArray__Group__15080 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__2_in_rule__AttributeValueArray__Group__15083 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__ElementsAssignment_1_in_rule__AttributeValueArray__Group__1__Impl5110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__2__Impl_in_rule__AttributeValueArray__Group__25140 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__3_in_rule__AttributeValueArray__Group__25143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group_2__0_in_rule__AttributeValueArray__Group__2__Impl5170 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__3__Impl_in_rule__AttributeValueArray__Group__35201 = new BitSet(new long[]{0x0000001040000000L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__4_in_rule__AttributeValueArray__Group__35204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AttributeValueArray__Group__3__Impl5233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__4__Impl_in_rule__AttributeValueArray__Group__45266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__AttributeValueArray__Group__4__Impl5294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group_2__0__Impl_in_rule__AttributeValueArray__Group_2__05335 = new BitSet(new long[]{0x00000000230000F0L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group_2__1_in_rule__AttributeValueArray__Group_2__05338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__AttributeValueArray__Group_2__0__Impl5366 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group_2__1__Impl_in_rule__AttributeValueArray__Group_2__15397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__ElementsAssignment_2_1_in_rule__AttributeValueArray__Group_2__1__Impl5424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__0__Impl_in_rule__Grouping__Group__05458 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Grouping__Group__1_in_rule__Grouping__Group__05461 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Grouping__Group__0__Impl5489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__1__Impl_in_rule__Grouping__Group__15520 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__Grouping__Group__2_in_rule__Grouping__Group__15523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__NameAssignment_1_in_rule__Grouping__Group__1__Impl5550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__2__Impl_in_rule__Grouping__Group__25580 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_2__0_in_rule__Grouping__Group__2__Impl5607 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_2__0__Impl_in_rule__Grouping__Group_2__05644 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Grouping__Group_2__1_in_rule__Grouping__Group_2__05647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__Grouping__Group_2__0__Impl5675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_2__1__Impl_in_rule__Grouping__Group_2__15706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__NameAssignment_2_1_in_rule__Grouping__Group_2__1__Impl5733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__0__Impl_in_rule__ModelFolding__Group__05767 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__1_in_rule__ModelFolding__Group__05770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_12_in_rule__ModelFolding__Group__0__Impl5798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__1__Impl_in_rule__ModelFolding__Group__15829 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__2_in_rule__ModelFolding__Group__15832 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__ModelFolding__Group__1__Impl5860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__2__Impl_in_rule__ModelFolding__Group__25891 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__3_in_rule__ModelFolding__Group__25894 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__FoldingsAssignment_2_in_rule__ModelFolding__Group__2__Impl5923 = new BitSet(new long[]{0x0000000200000032L});
    public static final BitSet FOLLOW_rule__ModelFolding__FoldingsAssignment_2_in_rule__ModelFolding__Group__2__Impl5935 = new BitSet(new long[]{0x0000000200000032L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__3__Impl_in_rule__ModelFolding__Group__35968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__ModelFolding__Group__3__Impl5996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__0__Impl_in_rule__PropertyFolding__Group__06035 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__1_in_rule__PropertyFolding__Group__06038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__DescriptionAssignment_0_in_rule__PropertyFolding__Group__0__Impl6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__1__Impl_in_rule__PropertyFolding__Group__16096 = new BitSet(new long[]{0x0000000200000030L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__2_in_rule__PropertyFolding__Group__16099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__AttributesAssignment_1_in_rule__PropertyFolding__Group__1__Impl6126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__2__Impl_in_rule__PropertyFolding__Group__26157 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__3_in_rule__PropertyFolding__Group__26160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__AggregatorAssignment_2_in_rule__PropertyFolding__Group__2__Impl6187 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__3__Impl_in_rule__PropertyFolding__Group__36217 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__4_in_rule__PropertyFolding__Group__36220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__FromAssignment_3_in_rule__PropertyFolding__Group__3__Impl6247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__4__Impl_in_rule__PropertyFolding__Group__46277 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__5_in_rule__PropertyFolding__Group__46280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Alternatives_4_in_rule__PropertyFolding__Group__4__Impl6307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__5__Impl_in_rule__PropertyFolding__Group__56337 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__6_in_rule__PropertyFolding__Group__56340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__NameAssignment_5_in_rule__PropertyFolding__Group__5__Impl6367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__6__Impl_in_rule__PropertyFolding__Group__66397 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__PropertyFolding__Group__6__Impl6425 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__06470 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__06473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__NameAssignment_0_in_rule__QualifiedName__Group__0__Impl6500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__16530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl6557 = new BitSet(new long[]{0x0000004000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__06592 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__06595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__QualifiedName__Group_1__0__Impl6623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__16654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__NameAssignment_1_1_in_rule__QualifiedName__Group_1__1__Impl6681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_rule__Models__ListAssignment6720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__ModelDefinition__DescriptionAssignment_06751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__ModelDefinition__AttributesAssignment_16782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_06813 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeModelDefinition_in_rule__ModelDefinition__ModelAssignment_2_16844 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__RecordModelDefinition__NameAssignment_06875 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_rule__RecordModelDefinition__RhsAssignment_26906 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_rule__RecordExpression__TermsAssignment_06937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_rule__RecordExpression__TermsAssignment_1_16968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_rule__RecordTerm__PropertiesAssignment_0_16999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_rule__RecordTerm__ReferenceAssignment_17030 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__ModelReference__NameAssignment7061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__PropertyDefinition__DescriptionAssignment_07092 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__PropertyDefinition__AttributesAssignment_17123 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__PropertyDefinition__NameAssignment_27154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__PropertyDefinition__TypeAssignment_47185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__SummarizeModelDefinition__NameAssignment_17216 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeExpression_in_rule__SummarizeModelDefinition__RhsAssignment_37247 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_rule__SummarizeExpression__TermsAssignment_07278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_rule__SummarizeExpression__TermsAssignment_1_17309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_rule__SummarizeTerm__ReferenceAssignment_07340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelFolding_in_rule__SummarizeTerm__FoldingAssignment_17371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_rule__SummarizeTerm__GroupingAssignment_27402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__AttributeList__AttributesAssignment7433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Attribute__NameAssignment_17464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElementList_in_rule__Attribute__ElementsAssignment_2_1_07495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_rule__AttributeElementList__ElementsAssignment_07526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_rule__AttributeElementList__ElementsAssignment_1_17557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__AttributeElement__NameAssignment_07588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_rule__AttributeElement__ValueAssignment_27619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueArray_in_rule__AttributeValue__ValueAssignment_07650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__AttributeValue__ValueAssignment_17681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__AttributeValue__ValueAssignment_27712 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_rule__AttributeValueArray__ElementsAssignment_17743 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_rule__AttributeValueArray__ElementsAssignment_2_17774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Grouping__NameAssignment_17805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Grouping__NameAssignment_2_17836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFolding_in_rule__ModelFolding__FoldingsAssignment_27867 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__PropertyFolding__DescriptionAssignment_07898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__PropertyFolding__AttributesAssignment_17929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PropertyFolding__AggregatorAssignment_27960 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__PropertyFolding__FromAssignment_37991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__PropertyFolding__NameAssignment_58022 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__QualifiedName__NameAssignment_08053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__QualifiedName__NameAssignment_1_18084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Literal__StringValueAssignment_08115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Literal__IntValueAssignment_18146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Literal__DecimalValueAssignment_28177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_rule__Literal__BooleanValueAssignment_38208 = new BitSet(new long[]{0x0000000000000002L});

}