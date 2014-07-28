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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NAME_TOKEN", "RULE_INT", "RULE_DECIMAL", "RULE_HEX_CHAR", "RULE_OCTAL_ESCAPE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'->'", "'=>'", "'projective'", "'joined'", "'summarized'", "'INT'", "'LONG'", "'BYTE'", "'SHORT'", "'DECIMAL'", "'FLOAT'", "'DOUBLE'", "'TEXT'", "'BOOLEAN'", "'DATE'", "'DATETIME'", "'TRUE'", "'FALSE'", "';'", "'='", "'+'", "'{'", "'}'", "':'", "'@'", "'('", "')'", "','", "'%'", "'.'"
    };
    public static final int T__42=42;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int RULE_HEX_CHAR=8;
    public static final int T__26=26;
    public static final int RULE_OCTAL_ESCAPE=9;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int RULE_SL_COMMENT=11;
    public static final int EOF=-1;
    public static final int RULE_ML_COMMENT=10;
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
    public static final int RULE_NAME_TOKEN=5;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int RULE_WS=12;
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

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_NAME_TOKEN)||(LA1_0>=15 && LA1_0<=17)||LA1_0==37) ) {
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


    // $ANTLR start "entryRuleRecordExpression"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:116:1: entryRuleRecordExpression : ruleRecordExpression EOF ;
    public final void entryRuleRecordExpression() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:117:1: ( ruleRecordExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:118:1: ruleRecordExpression EOF
            {
             before(grammarAccess.getRecordExpressionRule()); 
            pushFollow(FOLLOW_ruleRecordExpression_in_entryRuleRecordExpression182);
            ruleRecordExpression();

            state._fsp--;

             after(grammarAccess.getRecordExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordExpression189); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:125:1: ruleRecordExpression : ( ( rule__RecordExpression__Group__0 ) ) ;
    public final void ruleRecordExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:129:2: ( ( ( rule__RecordExpression__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:130:1: ( ( rule__RecordExpression__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:130:1: ( ( rule__RecordExpression__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:131:1: ( rule__RecordExpression__Group__0 )
            {
             before(grammarAccess.getRecordExpressionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:132:1: ( rule__RecordExpression__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:132:2: rule__RecordExpression__Group__0
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group__0_in_ruleRecordExpression215);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:144:1: entryRuleRecordTerm : ruleRecordTerm EOF ;
    public final void entryRuleRecordTerm() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:145:1: ( ruleRecordTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:146:1: ruleRecordTerm EOF
            {
             before(grammarAccess.getRecordTermRule()); 
            pushFollow(FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm242);
            ruleRecordTerm();

            state._fsp--;

             after(grammarAccess.getRecordTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordTerm249); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:153:1: ruleRecordTerm : ( ( rule__RecordTerm__Alternatives ) ) ;
    public final void ruleRecordTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:157:2: ( ( ( rule__RecordTerm__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:158:1: ( ( rule__RecordTerm__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:158:1: ( ( rule__RecordTerm__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:159:1: ( rule__RecordTerm__Alternatives )
            {
             before(grammarAccess.getRecordTermAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:160:1: ( rule__RecordTerm__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:160:2: rule__RecordTerm__Alternatives
            {
            pushFollow(FOLLOW_rule__RecordTerm__Alternatives_in_ruleRecordTerm275);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:172:1: entryRuleModelReference : ruleModelReference EOF ;
    public final void entryRuleModelReference() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:173:1: ( ruleModelReference EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:174:1: ruleModelReference EOF
            {
             before(grammarAccess.getModelReferenceRule()); 
            pushFollow(FOLLOW_ruleModelReference_in_entryRuleModelReference302);
            ruleModelReference();

            state._fsp--;

             after(grammarAccess.getModelReferenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelReference309); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:181:1: ruleModelReference : ( ( rule__ModelReference__NameAssignment ) ) ;
    public final void ruleModelReference() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:185:2: ( ( ( rule__ModelReference__NameAssignment ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:186:1: ( ( rule__ModelReference__NameAssignment ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:186:1: ( ( rule__ModelReference__NameAssignment ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:187:1: ( rule__ModelReference__NameAssignment )
            {
             before(grammarAccess.getModelReferenceAccess().getNameAssignment()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:188:1: ( rule__ModelReference__NameAssignment )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:188:2: rule__ModelReference__NameAssignment
            {
            pushFollow(FOLLOW_rule__ModelReference__NameAssignment_in_ruleModelReference335);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:200:1: entryRulePropertyDefinition : rulePropertyDefinition EOF ;
    public final void entryRulePropertyDefinition() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:201:1: ( rulePropertyDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:202:1: rulePropertyDefinition EOF
            {
             before(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition362);
            rulePropertyDefinition();

            state._fsp--;

             after(grammarAccess.getPropertyDefinitionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition369); 

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
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition395);
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


    // $ANTLR start "entryRuleJoinExpression"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:228:1: entryRuleJoinExpression : ruleJoinExpression EOF ;
    public final void entryRuleJoinExpression() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:229:1: ( ruleJoinExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:230:1: ruleJoinExpression EOF
            {
             before(grammarAccess.getJoinExpressionRule()); 
            pushFollow(FOLLOW_ruleJoinExpression_in_entryRuleJoinExpression422);
            ruleJoinExpression();

            state._fsp--;

             after(grammarAccess.getJoinExpressionRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinExpression429); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:237:1: ruleJoinExpression : ( ( rule__JoinExpression__Group__0 ) ) ;
    public final void ruleJoinExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:241:2: ( ( ( rule__JoinExpression__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:242:1: ( ( rule__JoinExpression__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:242:1: ( ( rule__JoinExpression__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:243:1: ( rule__JoinExpression__Group__0 )
            {
             before(grammarAccess.getJoinExpressionAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:244:1: ( rule__JoinExpression__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:244:2: rule__JoinExpression__Group__0
            {
            pushFollow(FOLLOW_rule__JoinExpression__Group__0_in_ruleJoinExpression455);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:256:1: entryRuleJoinTerm : ruleJoinTerm EOF ;
    public final void entryRuleJoinTerm() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:257:1: ( ruleJoinTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:258:1: ruleJoinTerm EOF
            {
             before(grammarAccess.getJoinTermRule()); 
            pushFollow(FOLLOW_ruleJoinTerm_in_entryRuleJoinTerm482);
            ruleJoinTerm();

            state._fsp--;

             after(grammarAccess.getJoinTermRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinTerm489); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:265:1: ruleJoinTerm : ( ( rule__JoinTerm__Group__0 ) ) ;
    public final void ruleJoinTerm() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:269:2: ( ( ( rule__JoinTerm__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:270:1: ( ( rule__JoinTerm__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:270:1: ( ( rule__JoinTerm__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:271:1: ( rule__JoinTerm__Group__0 )
            {
             before(grammarAccess.getJoinTermAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:272:1: ( rule__JoinTerm__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:272:2: rule__JoinTerm__Group__0
            {
            pushFollow(FOLLOW_rule__JoinTerm__Group__0_in_ruleJoinTerm515);
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

                if ( (LA2_0==37) ) {
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


    // $ANTLR start "entryRuleAttributeElementBlock"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:431:1: entryRuleAttributeElementBlock : ruleAttributeElementBlock EOF ;
    public final void entryRuleAttributeElementBlock() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:432:1: ( ruleAttributeElementBlock EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:433:1: ruleAttributeElementBlock EOF
            {
             before(grammarAccess.getAttributeElementBlockRule()); 
            pushFollow(FOLLOW_ruleAttributeElementBlock_in_entryRuleAttributeElementBlock858);
            ruleAttributeElementBlock();

            state._fsp--;

             after(grammarAccess.getAttributeElementBlockRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElementBlock865); 

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
    // $ANTLR end "entryRuleAttributeElementBlock"


    // $ANTLR start "ruleAttributeElementBlock"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:440:1: ruleAttributeElementBlock : ( ( rule__AttributeElementBlock__Group__0 ) ) ;
    public final void ruleAttributeElementBlock() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:444:2: ( ( ( rule__AttributeElementBlock__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:445:1: ( ( rule__AttributeElementBlock__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:445:1: ( ( rule__AttributeElementBlock__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:446:1: ( rule__AttributeElementBlock__Group__0 )
            {
             before(grammarAccess.getAttributeElementBlockAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:447:1: ( rule__AttributeElementBlock__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:447:2: rule__AttributeElementBlock__Group__0
            {
            pushFollow(FOLLOW_rule__AttributeElementBlock__Group__0_in_ruleAttributeElementBlock891);
            rule__AttributeElementBlock__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeElementBlockAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAttributeElementBlock"


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


    // $ANTLR start "entryRuleModelMapping"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:599:1: entryRuleModelMapping : ruleModelMapping EOF ;
    public final void entryRuleModelMapping() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:600:1: ( ruleModelMapping EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:601:1: ruleModelMapping EOF
            {
             before(grammarAccess.getModelMappingRule()); 
            pushFollow(FOLLOW_ruleModelMapping_in_entryRuleModelMapping1218);
            ruleModelMapping();

            state._fsp--;

             after(grammarAccess.getModelMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelMapping1225); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:608:1: ruleModelMapping : ( ( rule__ModelMapping__Group__0 ) ) ;
    public final void ruleModelMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:612:2: ( ( ( rule__ModelMapping__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:613:1: ( ( rule__ModelMapping__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:613:1: ( ( rule__ModelMapping__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:614:1: ( rule__ModelMapping__Group__0 )
            {
             before(grammarAccess.getModelMappingAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:615:1: ( rule__ModelMapping__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:615:2: rule__ModelMapping__Group__0
            {
            pushFollow(FOLLOW_rule__ModelMapping__Group__0_in_ruleModelMapping1251);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:627:1: entryRulePropertyMapping : rulePropertyMapping EOF ;
    public final void entryRulePropertyMapping() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:628:1: ( rulePropertyMapping EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:629:1: rulePropertyMapping EOF
            {
             before(grammarAccess.getPropertyMappingRule()); 
            pushFollow(FOLLOW_rulePropertyMapping_in_entryRulePropertyMapping1278);
            rulePropertyMapping();

            state._fsp--;

             after(grammarAccess.getPropertyMappingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyMapping1285); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:636:1: rulePropertyMapping : ( ( rule__PropertyMapping__Group__0 ) ) ;
    public final void rulePropertyMapping() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:640:2: ( ( ( rule__PropertyMapping__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:641:1: ( ( rule__PropertyMapping__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:641:1: ( ( rule__PropertyMapping__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:642:1: ( rule__PropertyMapping__Group__0 )
            {
             before(grammarAccess.getPropertyMappingAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:643:1: ( rule__PropertyMapping__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:643:2: rule__PropertyMapping__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyMapping__Group__0_in_rulePropertyMapping1311);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:655:1: entryRuleModelFolding : ruleModelFolding EOF ;
    public final void entryRuleModelFolding() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:656:1: ( ruleModelFolding EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:657:1: ruleModelFolding EOF
            {
             before(grammarAccess.getModelFoldingRule()); 
            pushFollow(FOLLOW_ruleModelFolding_in_entryRuleModelFolding1338);
            ruleModelFolding();

            state._fsp--;

             after(grammarAccess.getModelFoldingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelFolding1345); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:664:1: ruleModelFolding : ( ( rule__ModelFolding__Group__0 ) ) ;
    public final void ruleModelFolding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:668:2: ( ( ( rule__ModelFolding__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:669:1: ( ( rule__ModelFolding__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:669:1: ( ( rule__ModelFolding__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:670:1: ( rule__ModelFolding__Group__0 )
            {
             before(grammarAccess.getModelFoldingAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:671:1: ( rule__ModelFolding__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:671:2: rule__ModelFolding__Group__0
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__0_in_ruleModelFolding1371);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:683:1: entryRulePropertyFolding : rulePropertyFolding EOF ;
    public final void entryRulePropertyFolding() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:684:1: ( rulePropertyFolding EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:685:1: rulePropertyFolding EOF
            {
             before(grammarAccess.getPropertyFoldingRule()); 
            pushFollow(FOLLOW_rulePropertyFolding_in_entryRulePropertyFolding1398);
            rulePropertyFolding();

            state._fsp--;

             after(grammarAccess.getPropertyFoldingRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyFolding1405); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:692:1: rulePropertyFolding : ( ( rule__PropertyFolding__Group__0 ) ) ;
    public final void rulePropertyFolding() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:696:2: ( ( ( rule__PropertyFolding__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:697:1: ( ( rule__PropertyFolding__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:697:1: ( ( rule__PropertyFolding__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:698:1: ( rule__PropertyFolding__Group__0 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:699:1: ( rule__PropertyFolding__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:699:2: rule__PropertyFolding__Group__0
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__0_in_rulePropertyFolding1431);
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


    // $ANTLR start "entryRuleQualifiedNameObject"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:713:1: entryRuleQualifiedNameObject : ruleQualifiedNameObject EOF ;
    public final void entryRuleQualifiedNameObject() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:714:1: ( ruleQualifiedNameObject EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:715:1: ruleQualifiedNameObject EOF
            {
             before(grammarAccess.getQualifiedNameObjectRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameObject_in_entryRuleQualifiedNameObject1460);
            ruleQualifiedNameObject();

            state._fsp--;

             after(grammarAccess.getQualifiedNameObjectRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameObject1467); 

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
    // $ANTLR end "entryRuleQualifiedNameObject"


    // $ANTLR start "ruleQualifiedNameObject"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:722:1: ruleQualifiedNameObject : ( ( rule__QualifiedNameObject__NameAssignment ) ) ;
    public final void ruleQualifiedNameObject() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:726:2: ( ( ( rule__QualifiedNameObject__NameAssignment ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:727:1: ( ( rule__QualifiedNameObject__NameAssignment ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:727:1: ( ( rule__QualifiedNameObject__NameAssignment ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:728:1: ( rule__QualifiedNameObject__NameAssignment )
            {
             before(grammarAccess.getQualifiedNameObjectAccess().getNameAssignment()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:729:1: ( rule__QualifiedNameObject__NameAssignment )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:729:2: rule__QualifiedNameObject__NameAssignment
            {
            pushFollow(FOLLOW_rule__QualifiedNameObject__NameAssignment_in_ruleQualifiedNameObject1493);
            rule__QualifiedNameObject__NameAssignment();

            state._fsp--;


            }

             after(grammarAccess.getQualifiedNameObjectAccess().getNameAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameObject"


    // $ANTLR start "entryRuleQualifiedName"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:741:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:742:1: ( ruleQualifiedName EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:743:1: ruleQualifiedName EOF
            {
             before(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1520);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName1527); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:750:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:754:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:755:1: ( ( rule__QualifiedName__Group__0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:755:1: ( ( rule__QualifiedName__Group__0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:756:1: ( rule__QualifiedName__Group__0 )
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:757:1: ( rule__QualifiedName__Group__0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:757:2: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1553);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:769:1: entryRuleName : ruleName EOF ;
    public final void entryRuleName() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:770:1: ( ruleName EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:771:1: ruleName EOF
            {
             before(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName1580);
            ruleName();

            state._fsp--;

             after(grammarAccess.getNameRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName1587); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:778:1: ruleName : ( ( rule__Name__Alternatives ) ) ;
    public final void ruleName() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:782:2: ( ( ( rule__Name__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:783:1: ( ( rule__Name__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:783:1: ( ( rule__Name__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:784:1: ( rule__Name__Alternatives )
            {
             before(grammarAccess.getNameAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:785:1: ( rule__Name__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:785:2: rule__Name__Alternatives
            {
            pushFollow(FOLLOW_rule__Name__Alternatives_in_ruleName1613);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:797:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:798:1: ( ruleLiteral EOF )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:799:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral1640);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral1647); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:806:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:810:2: ( ( ( rule__Literal__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:811:1: ( ( rule__Literal__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:811:1: ( ( rule__Literal__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:812:1: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:813:1: ( rule__Literal__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:813:2: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1673);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:826:1: ruleType : ( ( rule__Type__Alternatives ) ) ;
    public final void ruleType() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:830:1: ( ( ( rule__Type__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:831:1: ( ( rule__Type__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:831:1: ( ( rule__Type__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:832:1: ( rule__Type__Alternatives )
            {
             before(grammarAccess.getTypeAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:833:1: ( rule__Type__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:833:2: rule__Type__Alternatives
            {
            pushFollow(FOLLOW_rule__Type__Alternatives_in_ruleType1710);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:845:1: ruleBOOLEAN : ( ( rule__BOOLEAN__Alternatives ) ) ;
    public final void ruleBOOLEAN() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:849:1: ( ( ( rule__BOOLEAN__Alternatives ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:850:1: ( ( rule__BOOLEAN__Alternatives ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:850:1: ( ( rule__BOOLEAN__Alternatives ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:851:1: ( rule__BOOLEAN__Alternatives )
            {
             before(grammarAccess.getBOOLEANAccess().getAlternatives()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:852:1: ( rule__BOOLEAN__Alternatives )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:852:2: rule__BOOLEAN__Alternatives
            {
            pushFollow(FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN1746);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:863:1: rule__ModelDefinition__Alternatives_2 : ( ( ( rule__ModelDefinition__Group_2_0__0 ) ) | ( ( rule__ModelDefinition__Group_2_1__0 ) ) | ( ( rule__ModelDefinition__Group_2_2__0 ) ) );
    public final void rule__ModelDefinition__Alternatives_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:867:1: ( ( ( rule__ModelDefinition__Group_2_0__0 ) ) | ( ( rule__ModelDefinition__Group_2_1__0 ) ) | ( ( rule__ModelDefinition__Group_2_2__0 ) ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_NAME_TOKEN:
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                int LA3_2 = input.LA(2);

                if ( (LA3_2==32) ) {
                    alt3=1;
                }
                else if ( (LA3_2==RULE_NAME_TOKEN||(LA3_2>=15 && LA3_2<=17)) ) {
                    alt3=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 2, input);

                    throw nvae;
                }
                }
                break;
            case 17:
                {
                int LA3_3 = input.LA(2);

                if ( (LA3_3==32) ) {
                    alt3=1;
                }
                else if ( (LA3_3==RULE_NAME_TOKEN||(LA3_3>=15 && LA3_3<=17)) ) {
                    alt3=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 3, input);

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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:868:1: ( ( rule__ModelDefinition__Group_2_0__0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:868:1: ( ( rule__ModelDefinition__Group_2_0__0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:869:1: ( rule__ModelDefinition__Group_2_0__0 )
                    {
                     before(grammarAccess.getModelDefinitionAccess().getGroup_2_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:870:1: ( rule__ModelDefinition__Group_2_0__0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:870:2: rule__ModelDefinition__Group_2_0__0
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__Group_2_0__0_in_rule__ModelDefinition__Alternatives_21781);
                    rule__ModelDefinition__Group_2_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelDefinitionAccess().getGroup_2_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:874:6: ( ( rule__ModelDefinition__Group_2_1__0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:874:6: ( ( rule__ModelDefinition__Group_2_1__0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:875:1: ( rule__ModelDefinition__Group_2_1__0 )
                    {
                     before(grammarAccess.getModelDefinitionAccess().getGroup_2_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:876:1: ( rule__ModelDefinition__Group_2_1__0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:876:2: rule__ModelDefinition__Group_2_1__0
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__Group_2_1__0_in_rule__ModelDefinition__Alternatives_21799);
                    rule__ModelDefinition__Group_2_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelDefinitionAccess().getGroup_2_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:880:6: ( ( rule__ModelDefinition__Group_2_2__0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:880:6: ( ( rule__ModelDefinition__Group_2_2__0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:881:1: ( rule__ModelDefinition__Group_2_2__0 )
                    {
                     before(grammarAccess.getModelDefinitionAccess().getGroup_2_2()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:882:1: ( rule__ModelDefinition__Group_2_2__0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:882:2: rule__ModelDefinition__Group_2_2__0
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__Group_2_2__0_in_rule__ModelDefinition__Alternatives_21817);
                    rule__ModelDefinition__Group_2_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getModelDefinitionAccess().getGroup_2_2()); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:891:1: rule__RecordTerm__Alternatives : ( ( ( rule__RecordTerm__Group_0__0 ) ) | ( ( rule__RecordTerm__ReferenceAssignment_1 ) ) );
    public final void rule__RecordTerm__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:895:1: ( ( ( rule__RecordTerm__Group_0__0 ) ) | ( ( rule__RecordTerm__ReferenceAssignment_1 ) ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==34) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_NAME_TOKEN||(LA4_0>=15 && LA4_0<=17)) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:896:1: ( ( rule__RecordTerm__Group_0__0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:896:1: ( ( rule__RecordTerm__Group_0__0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:897:1: ( rule__RecordTerm__Group_0__0 )
                    {
                     before(grammarAccess.getRecordTermAccess().getGroup_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:898:1: ( rule__RecordTerm__Group_0__0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:898:2: rule__RecordTerm__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__RecordTerm__Group_0__0_in_rule__RecordTerm__Alternatives1850);
                    rule__RecordTerm__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getRecordTermAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:902:6: ( ( rule__RecordTerm__ReferenceAssignment_1 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:902:6: ( ( rule__RecordTerm__ReferenceAssignment_1 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:903:1: ( rule__RecordTerm__ReferenceAssignment_1 )
                    {
                     before(grammarAccess.getRecordTermAccess().getReferenceAssignment_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:904:1: ( rule__RecordTerm__ReferenceAssignment_1 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:904:2: rule__RecordTerm__ReferenceAssignment_1
                    {
                    pushFollow(FOLLOW_rule__RecordTerm__ReferenceAssignment_1_in_rule__RecordTerm__Alternatives1868);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:913:1: rule__AttributeValue__Alternatives : ( ( ( rule__AttributeValue__ValueAssignment_0 ) ) | ( ( rule__AttributeValue__ValueAssignment_1 ) ) | ( ( rule__AttributeValue__ValueAssignment_2 ) ) );
    public final void rule__AttributeValue__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:917:1: ( ( ( rule__AttributeValue__ValueAssignment_0 ) ) | ( ( rule__AttributeValue__ValueAssignment_1 ) ) | ( ( rule__AttributeValue__ValueAssignment_2 ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt5=1;
                }
                break;
            case RULE_NAME_TOKEN:
            case 15:
            case 16:
            case 17:
                {
                alt5=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DECIMAL:
            case 29:
            case 30:
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:918:1: ( ( rule__AttributeValue__ValueAssignment_0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:918:1: ( ( rule__AttributeValue__ValueAssignment_0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:919:1: ( rule__AttributeValue__ValueAssignment_0 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getValueAssignment_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:920:1: ( rule__AttributeValue__ValueAssignment_0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:920:2: rule__AttributeValue__ValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__AttributeValue__ValueAssignment_0_in_rule__AttributeValue__Alternatives1901);
                    rule__AttributeValue__ValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValueAccess().getValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:924:6: ( ( rule__AttributeValue__ValueAssignment_1 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:924:6: ( ( rule__AttributeValue__ValueAssignment_1 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:925:1: ( rule__AttributeValue__ValueAssignment_1 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getValueAssignment_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:926:1: ( rule__AttributeValue__ValueAssignment_1 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:926:2: rule__AttributeValue__ValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__AttributeValue__ValueAssignment_1_in_rule__AttributeValue__Alternatives1919);
                    rule__AttributeValue__ValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getAttributeValueAccess().getValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:930:6: ( ( rule__AttributeValue__ValueAssignment_2 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:930:6: ( ( rule__AttributeValue__ValueAssignment_2 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:931:1: ( rule__AttributeValue__ValueAssignment_2 )
                    {
                     before(grammarAccess.getAttributeValueAccess().getValueAssignment_2()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:932:1: ( rule__AttributeValue__ValueAssignment_2 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:932:2: rule__AttributeValue__ValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__AttributeValue__ValueAssignment_2_in_rule__AttributeValue__Alternatives1937);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:941:1: rule__PropertyFolding__Alternatives_4 : ( ( '->' ) | ( '=>' ) );
    public final void rule__PropertyFolding__Alternatives_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:945:1: ( ( '->' ) | ( '=>' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==13) ) {
                alt6=1;
            }
            else if ( (LA6_0==14) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:946:1: ( '->' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:946:1: ( '->' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:947:1: '->'
                    {
                     before(grammarAccess.getPropertyFoldingAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 
                    match(input,13,FOLLOW_13_in_rule__PropertyFolding__Alternatives_41971); 
                     after(grammarAccess.getPropertyFoldingAccess().getHyphenMinusGreaterThanSignKeyword_4_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:954:6: ( '=>' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:954:6: ( '=>' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:955:1: '=>'
                    {
                     before(grammarAccess.getPropertyFoldingAccess().getEqualsSignGreaterThanSignKeyword_4_1()); 
                    match(input,14,FOLLOW_14_in_rule__PropertyFolding__Alternatives_41991); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:968:1: rule__Name__Alternatives : ( ( RULE_NAME_TOKEN ) | ( 'projective' ) | ( 'joined' ) | ( 'summarized' ) );
    public final void rule__Name__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:972:1: ( ( RULE_NAME_TOKEN ) | ( 'projective' ) | ( 'joined' ) | ( 'summarized' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case RULE_NAME_TOKEN:
                {
                alt7=1;
                }
                break;
            case 15:
                {
                alt7=2;
                }
                break;
            case 16:
                {
                alt7=3;
                }
                break;
            case 17:
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:973:1: ( RULE_NAME_TOKEN )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:973:1: ( RULE_NAME_TOKEN )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:974:1: RULE_NAME_TOKEN
                    {
                     before(grammarAccess.getNameAccess().getNAME_TOKENTerminalRuleCall_0()); 
                    match(input,RULE_NAME_TOKEN,FOLLOW_RULE_NAME_TOKEN_in_rule__Name__Alternatives2026); 
                     after(grammarAccess.getNameAccess().getNAME_TOKENTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:979:6: ( 'projective' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:979:6: ( 'projective' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:980:1: 'projective'
                    {
                     before(grammarAccess.getNameAccess().getProjectiveKeyword_1()); 
                    match(input,15,FOLLOW_15_in_rule__Name__Alternatives2044); 
                     after(grammarAccess.getNameAccess().getProjectiveKeyword_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:987:6: ( 'joined' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:987:6: ( 'joined' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:988:1: 'joined'
                    {
                     before(grammarAccess.getNameAccess().getJoinedKeyword_2()); 
                    match(input,16,FOLLOW_16_in_rule__Name__Alternatives2064); 
                     after(grammarAccess.getNameAccess().getJoinedKeyword_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:995:6: ( 'summarized' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:995:6: ( 'summarized' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:996:1: 'summarized'
                    {
                     before(grammarAccess.getNameAccess().getSummarizedKeyword_3()); 
                    match(input,17,FOLLOW_17_in_rule__Name__Alternatives2084); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1008:1: rule__Literal__Alternatives : ( ( ( rule__Literal__StringValueAssignment_0 ) ) | ( ( rule__Literal__IntValueAssignment_1 ) ) | ( ( rule__Literal__DecimalValueAssignment_2 ) ) | ( ( rule__Literal__BooleanValueAssignment_3 ) ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1012:1: ( ( ( rule__Literal__StringValueAssignment_0 ) ) | ( ( rule__Literal__IntValueAssignment_1 ) ) | ( ( rule__Literal__DecimalValueAssignment_2 ) ) | ( ( rule__Literal__BooleanValueAssignment_3 ) ) )
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
            case 29:
            case 30:
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1013:1: ( ( rule__Literal__StringValueAssignment_0 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1013:1: ( ( rule__Literal__StringValueAssignment_0 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1014:1: ( rule__Literal__StringValueAssignment_0 )
                    {
                     before(grammarAccess.getLiteralAccess().getStringValueAssignment_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1015:1: ( rule__Literal__StringValueAssignment_0 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1015:2: rule__Literal__StringValueAssignment_0
                    {
                    pushFollow(FOLLOW_rule__Literal__StringValueAssignment_0_in_rule__Literal__Alternatives2118);
                    rule__Literal__StringValueAssignment_0();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getStringValueAssignment_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1019:6: ( ( rule__Literal__IntValueAssignment_1 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1019:6: ( ( rule__Literal__IntValueAssignment_1 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1020:1: ( rule__Literal__IntValueAssignment_1 )
                    {
                     before(grammarAccess.getLiteralAccess().getIntValueAssignment_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1021:1: ( rule__Literal__IntValueAssignment_1 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1021:2: rule__Literal__IntValueAssignment_1
                    {
                    pushFollow(FOLLOW_rule__Literal__IntValueAssignment_1_in_rule__Literal__Alternatives2136);
                    rule__Literal__IntValueAssignment_1();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getIntValueAssignment_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1025:6: ( ( rule__Literal__DecimalValueAssignment_2 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1025:6: ( ( rule__Literal__DecimalValueAssignment_2 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1026:1: ( rule__Literal__DecimalValueAssignment_2 )
                    {
                     before(grammarAccess.getLiteralAccess().getDecimalValueAssignment_2()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1027:1: ( rule__Literal__DecimalValueAssignment_2 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1027:2: rule__Literal__DecimalValueAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Literal__DecimalValueAssignment_2_in_rule__Literal__Alternatives2154);
                    rule__Literal__DecimalValueAssignment_2();

                    state._fsp--;


                    }

                     after(grammarAccess.getLiteralAccess().getDecimalValueAssignment_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1031:6: ( ( rule__Literal__BooleanValueAssignment_3 ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1031:6: ( ( rule__Literal__BooleanValueAssignment_3 ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1032:1: ( rule__Literal__BooleanValueAssignment_3 )
                    {
                     before(grammarAccess.getLiteralAccess().getBooleanValueAssignment_3()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1033:1: ( rule__Literal__BooleanValueAssignment_3 )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1033:2: rule__Literal__BooleanValueAssignment_3
                    {
                    pushFollow(FOLLOW_rule__Literal__BooleanValueAssignment_3_in_rule__Literal__Alternatives2172);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1042:1: rule__Type__Alternatives : ( ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) | ( ( 'DECIMAL' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'TEXT' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'DATE' ) ) | ( ( 'DATETIME' ) ) );
    public final void rule__Type__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1046:1: ( ( ( 'INT' ) ) | ( ( 'LONG' ) ) | ( ( 'BYTE' ) ) | ( ( 'SHORT' ) ) | ( ( 'DECIMAL' ) ) | ( ( 'FLOAT' ) ) | ( ( 'DOUBLE' ) ) | ( ( 'TEXT' ) ) | ( ( 'BOOLEAN' ) ) | ( ( 'DATE' ) ) | ( ( 'DATETIME' ) ) )
            int alt9=11;
            switch ( input.LA(1) ) {
            case 18:
                {
                alt9=1;
                }
                break;
            case 19:
                {
                alt9=2;
                }
                break;
            case 20:
                {
                alt9=3;
                }
                break;
            case 21:
                {
                alt9=4;
                }
                break;
            case 22:
                {
                alt9=5;
                }
                break;
            case 23:
                {
                alt9=6;
                }
                break;
            case 24:
                {
                alt9=7;
                }
                break;
            case 25:
                {
                alt9=8;
                }
                break;
            case 26:
                {
                alt9=9;
                }
                break;
            case 27:
                {
                alt9=10;
                }
                break;
            case 28:
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
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1047:1: ( ( 'INT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1047:1: ( ( 'INT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1048:1: ( 'INT' )
                    {
                     before(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1049:1: ( 'INT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1049:3: 'INT'
                    {
                    match(input,18,FOLLOW_18_in_rule__Type__Alternatives2206); 

                    }

                     after(grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1054:6: ( ( 'LONG' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1054:6: ( ( 'LONG' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1055:1: ( 'LONG' )
                    {
                     before(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1056:1: ( 'LONG' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1056:3: 'LONG'
                    {
                    match(input,19,FOLLOW_19_in_rule__Type__Alternatives2227); 

                    }

                     after(grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1061:6: ( ( 'BYTE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1061:6: ( ( 'BYTE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1062:1: ( 'BYTE' )
                    {
                     before(grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_2()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1063:1: ( 'BYTE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1063:3: 'BYTE'
                    {
                    match(input,20,FOLLOW_20_in_rule__Type__Alternatives2248); 

                    }

                     after(grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1068:6: ( ( 'SHORT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1068:6: ( ( 'SHORT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1069:1: ( 'SHORT' )
                    {
                     before(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_3()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1070:1: ( 'SHORT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1070:3: 'SHORT'
                    {
                    match(input,21,FOLLOW_21_in_rule__Type__Alternatives2269); 

                    }

                     after(grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1075:6: ( ( 'DECIMAL' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1075:6: ( ( 'DECIMAL' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1076:1: ( 'DECIMAL' )
                    {
                     before(grammarAccess.getTypeAccess().getDECIMALEnumLiteralDeclaration_4()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1077:1: ( 'DECIMAL' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1077:3: 'DECIMAL'
                    {
                    match(input,22,FOLLOW_22_in_rule__Type__Alternatives2290); 

                    }

                     after(grammarAccess.getTypeAccess().getDECIMALEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1082:6: ( ( 'FLOAT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1082:6: ( ( 'FLOAT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1083:1: ( 'FLOAT' )
                    {
                     before(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1084:1: ( 'FLOAT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1084:3: 'FLOAT'
                    {
                    match(input,23,FOLLOW_23_in_rule__Type__Alternatives2311); 

                    }

                     after(grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1089:6: ( ( 'DOUBLE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1089:6: ( ( 'DOUBLE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1090:1: ( 'DOUBLE' )
                    {
                     before(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1091:1: ( 'DOUBLE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1091:3: 'DOUBLE'
                    {
                    match(input,24,FOLLOW_24_in_rule__Type__Alternatives2332); 

                    }

                     after(grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1096:6: ( ( 'TEXT' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1096:6: ( ( 'TEXT' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1097:1: ( 'TEXT' )
                    {
                     before(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_7()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1098:1: ( 'TEXT' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1098:3: 'TEXT'
                    {
                    match(input,25,FOLLOW_25_in_rule__Type__Alternatives2353); 

                    }

                     after(grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;
                case 9 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1103:6: ( ( 'BOOLEAN' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1103:6: ( ( 'BOOLEAN' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1104:1: ( 'BOOLEAN' )
                    {
                     before(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_8()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1105:1: ( 'BOOLEAN' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1105:3: 'BOOLEAN'
                    {
                    match(input,26,FOLLOW_26_in_rule__Type__Alternatives2374); 

                    }

                     after(grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_8()); 

                    }


                    }
                    break;
                case 10 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1110:6: ( ( 'DATE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1110:6: ( ( 'DATE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1111:1: ( 'DATE' )
                    {
                     before(grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_9()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1112:1: ( 'DATE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1112:3: 'DATE'
                    {
                    match(input,27,FOLLOW_27_in_rule__Type__Alternatives2395); 

                    }

                     after(grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_9()); 

                    }


                    }
                    break;
                case 11 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1117:6: ( ( 'DATETIME' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1117:6: ( ( 'DATETIME' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1118:1: ( 'DATETIME' )
                    {
                     before(grammarAccess.getTypeAccess().getDATETIMEEnumLiteralDeclaration_10()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1119:1: ( 'DATETIME' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1119:3: 'DATETIME'
                    {
                    match(input,28,FOLLOW_28_in_rule__Type__Alternatives2416); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1129:1: rule__BOOLEAN__Alternatives : ( ( ( 'TRUE' ) ) | ( ( 'FALSE' ) ) );
    public final void rule__BOOLEAN__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1133:1: ( ( ( 'TRUE' ) ) | ( ( 'FALSE' ) ) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            else if ( (LA10_0==30) ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }
            switch (alt10) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1134:1: ( ( 'TRUE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1134:1: ( ( 'TRUE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1135:1: ( 'TRUE' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1136:1: ( 'TRUE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1136:3: 'TRUE'
                    {
                    match(input,29,FOLLOW_29_in_rule__BOOLEAN__Alternatives2452); 

                    }

                     after(grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1141:6: ( ( 'FALSE' ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1141:6: ( ( 'FALSE' ) )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1142:1: ( 'FALSE' )
                    {
                     before(grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); 
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1143:1: ( 'FALSE' )
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1143:3: 'FALSE'
                    {
                    match(input,30,FOLLOW_30_in_rule__BOOLEAN__Alternatives2473); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1155:1: rule__ModelDefinition__Group__0 : rule__ModelDefinition__Group__0__Impl rule__ModelDefinition__Group__1 ;
    public final void rule__ModelDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1159:1: ( rule__ModelDefinition__Group__0__Impl rule__ModelDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1160:2: rule__ModelDefinition__Group__0__Impl rule__ModelDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group__0__Impl_in_rule__ModelDefinition__Group__02506);
            rule__ModelDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group__1_in_rule__ModelDefinition__Group__02509);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1167:1: rule__ModelDefinition__Group__0__Impl : ( ( rule__ModelDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__ModelDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1171:1: ( ( ( rule__ModelDefinition__DescriptionAssignment_0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1172:1: ( ( rule__ModelDefinition__DescriptionAssignment_0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1172:1: ( ( rule__ModelDefinition__DescriptionAssignment_0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1173:1: ( rule__ModelDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getModelDefinitionAccess().getDescriptionAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1174:1: ( rule__ModelDefinition__DescriptionAssignment_0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1174:2: rule__ModelDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__DescriptionAssignment_0_in_rule__ModelDefinition__Group__0__Impl2536);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1184:1: rule__ModelDefinition__Group__1 : rule__ModelDefinition__Group__1__Impl rule__ModelDefinition__Group__2 ;
    public final void rule__ModelDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1188:1: ( rule__ModelDefinition__Group__1__Impl rule__ModelDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1189:2: rule__ModelDefinition__Group__1__Impl rule__ModelDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group__1__Impl_in_rule__ModelDefinition__Group__12567);
            rule__ModelDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group__2_in_rule__ModelDefinition__Group__12570);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1196:1: rule__ModelDefinition__Group__1__Impl : ( ( rule__ModelDefinition__AttributesAssignment_1 )? ) ;
    public final void rule__ModelDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1200:1: ( ( ( rule__ModelDefinition__AttributesAssignment_1 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1201:1: ( ( rule__ModelDefinition__AttributesAssignment_1 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1201:1: ( ( rule__ModelDefinition__AttributesAssignment_1 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1202:1: ( rule__ModelDefinition__AttributesAssignment_1 )?
            {
             before(grammarAccess.getModelDefinitionAccess().getAttributesAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1203:1: ( rule__ModelDefinition__AttributesAssignment_1 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==37) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1203:2: rule__ModelDefinition__AttributesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__AttributesAssignment_1_in_rule__ModelDefinition__Group__1__Impl2597);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1213:1: rule__ModelDefinition__Group__2 : rule__ModelDefinition__Group__2__Impl rule__ModelDefinition__Group__3 ;
    public final void rule__ModelDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1217:1: ( rule__ModelDefinition__Group__2__Impl rule__ModelDefinition__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1218:2: rule__ModelDefinition__Group__2__Impl rule__ModelDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group__2__Impl_in_rule__ModelDefinition__Group__22628);
            rule__ModelDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group__3_in_rule__ModelDefinition__Group__22631);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1225:1: rule__ModelDefinition__Group__2__Impl : ( ( rule__ModelDefinition__Alternatives_2 ) ) ;
    public final void rule__ModelDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1229:1: ( ( ( rule__ModelDefinition__Alternatives_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1230:1: ( ( rule__ModelDefinition__Alternatives_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1230:1: ( ( rule__ModelDefinition__Alternatives_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1231:1: ( rule__ModelDefinition__Alternatives_2 )
            {
             before(grammarAccess.getModelDefinitionAccess().getAlternatives_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1232:1: ( rule__ModelDefinition__Alternatives_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1232:2: rule__ModelDefinition__Alternatives_2
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Alternatives_2_in_rule__ModelDefinition__Group__2__Impl2658);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1242:1: rule__ModelDefinition__Group__3 : rule__ModelDefinition__Group__3__Impl ;
    public final void rule__ModelDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1246:1: ( rule__ModelDefinition__Group__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1247:2: rule__ModelDefinition__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group__3__Impl_in_rule__ModelDefinition__Group__32688);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1253:1: rule__ModelDefinition__Group__3__Impl : ( ';' ) ;
    public final void rule__ModelDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1257:1: ( ( ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1258:1: ( ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1258:1: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1259:1: ';'
            {
             before(grammarAccess.getModelDefinitionAccess().getSemicolonKeyword_3()); 
            match(input,31,FOLLOW_31_in_rule__ModelDefinition__Group__3__Impl2716); 
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


    // $ANTLR start "rule__ModelDefinition__Group_2_0__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1280:1: rule__ModelDefinition__Group_2_0__0 : rule__ModelDefinition__Group_2_0__0__Impl rule__ModelDefinition__Group_2_0__1 ;
    public final void rule__ModelDefinition__Group_2_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1284:1: ( rule__ModelDefinition__Group_2_0__0__Impl rule__ModelDefinition__Group_2_0__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1285:2: rule__ModelDefinition__Group_2_0__0__Impl rule__ModelDefinition__Group_2_0__1
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_0__0__Impl_in_rule__ModelDefinition__Group_2_0__02755);
            rule__ModelDefinition__Group_2_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_0__1_in_rule__ModelDefinition__Group_2_0__02758);
            rule__ModelDefinition__Group_2_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_0__0"


    // $ANTLR start "rule__ModelDefinition__Group_2_0__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1292:1: rule__ModelDefinition__Group_2_0__0__Impl : ( ( rule__ModelDefinition__TypeAssignment_2_0_0 )? ) ;
    public final void rule__ModelDefinition__Group_2_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1296:1: ( ( ( rule__ModelDefinition__TypeAssignment_2_0_0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1297:1: ( ( rule__ModelDefinition__TypeAssignment_2_0_0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1297:1: ( ( rule__ModelDefinition__TypeAssignment_2_0_0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1298:1: ( rule__ModelDefinition__TypeAssignment_2_0_0 )?
            {
             before(grammarAccess.getModelDefinitionAccess().getTypeAssignment_2_0_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1299:1: ( rule__ModelDefinition__TypeAssignment_2_0_0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_NAME_TOKEN||(LA13_1>=15 && LA13_1<=17)) ) {
                    alt13=1;
                }
            }
            switch (alt13) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1299:2: rule__ModelDefinition__TypeAssignment_2_0_0
                    {
                    pushFollow(FOLLOW_rule__ModelDefinition__TypeAssignment_2_0_0_in_rule__ModelDefinition__Group_2_0__0__Impl2785);
                    rule__ModelDefinition__TypeAssignment_2_0_0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getModelDefinitionAccess().getTypeAssignment_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_0__0__Impl"


    // $ANTLR start "rule__ModelDefinition__Group_2_0__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1309:1: rule__ModelDefinition__Group_2_0__1 : rule__ModelDefinition__Group_2_0__1__Impl rule__ModelDefinition__Group_2_0__2 ;
    public final void rule__ModelDefinition__Group_2_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1313:1: ( rule__ModelDefinition__Group_2_0__1__Impl rule__ModelDefinition__Group_2_0__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1314:2: rule__ModelDefinition__Group_2_0__1__Impl rule__ModelDefinition__Group_2_0__2
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_0__1__Impl_in_rule__ModelDefinition__Group_2_0__12816);
            rule__ModelDefinition__Group_2_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_0__2_in_rule__ModelDefinition__Group_2_0__12819);
            rule__ModelDefinition__Group_2_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_0__1"


    // $ANTLR start "rule__ModelDefinition__Group_2_0__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1321:1: rule__ModelDefinition__Group_2_0__1__Impl : ( ( rule__ModelDefinition__NameAssignment_2_0_1 ) ) ;
    public final void rule__ModelDefinition__Group_2_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1325:1: ( ( ( rule__ModelDefinition__NameAssignment_2_0_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1326:1: ( ( rule__ModelDefinition__NameAssignment_2_0_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1326:1: ( ( rule__ModelDefinition__NameAssignment_2_0_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1327:1: ( rule__ModelDefinition__NameAssignment_2_0_1 )
            {
             before(grammarAccess.getModelDefinitionAccess().getNameAssignment_2_0_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1328:1: ( rule__ModelDefinition__NameAssignment_2_0_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1328:2: rule__ModelDefinition__NameAssignment_2_0_1
            {
            pushFollow(FOLLOW_rule__ModelDefinition__NameAssignment_2_0_1_in_rule__ModelDefinition__Group_2_0__1__Impl2846);
            rule__ModelDefinition__NameAssignment_2_0_1();

            state._fsp--;


            }

             after(grammarAccess.getModelDefinitionAccess().getNameAssignment_2_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_0__1__Impl"


    // $ANTLR start "rule__ModelDefinition__Group_2_0__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1338:1: rule__ModelDefinition__Group_2_0__2 : rule__ModelDefinition__Group_2_0__2__Impl rule__ModelDefinition__Group_2_0__3 ;
    public final void rule__ModelDefinition__Group_2_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1342:1: ( rule__ModelDefinition__Group_2_0__2__Impl rule__ModelDefinition__Group_2_0__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1343:2: rule__ModelDefinition__Group_2_0__2__Impl rule__ModelDefinition__Group_2_0__3
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_0__2__Impl_in_rule__ModelDefinition__Group_2_0__22876);
            rule__ModelDefinition__Group_2_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_0__3_in_rule__ModelDefinition__Group_2_0__22879);
            rule__ModelDefinition__Group_2_0__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_0__2"


    // $ANTLR start "rule__ModelDefinition__Group_2_0__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1350:1: rule__ModelDefinition__Group_2_0__2__Impl : ( '=' ) ;
    public final void rule__ModelDefinition__Group_2_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1354:1: ( ( '=' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1355:1: ( '=' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1355:1: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1356:1: '='
            {
             before(grammarAccess.getModelDefinitionAccess().getEqualsSignKeyword_2_0_2()); 
            match(input,32,FOLLOW_32_in_rule__ModelDefinition__Group_2_0__2__Impl2907); 
             after(grammarAccess.getModelDefinitionAccess().getEqualsSignKeyword_2_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_0__2__Impl"


    // $ANTLR start "rule__ModelDefinition__Group_2_0__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1369:1: rule__ModelDefinition__Group_2_0__3 : rule__ModelDefinition__Group_2_0__3__Impl ;
    public final void rule__ModelDefinition__Group_2_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1373:1: ( rule__ModelDefinition__Group_2_0__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1374:2: rule__ModelDefinition__Group_2_0__3__Impl
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_0__3__Impl_in_rule__ModelDefinition__Group_2_0__32938);
            rule__ModelDefinition__Group_2_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_0__3"


    // $ANTLR start "rule__ModelDefinition__Group_2_0__3__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1380:1: rule__ModelDefinition__Group_2_0__3__Impl : ( ( rule__ModelDefinition__RhsAssignment_2_0_3 ) ) ;
    public final void rule__ModelDefinition__Group_2_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1384:1: ( ( ( rule__ModelDefinition__RhsAssignment_2_0_3 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1385:1: ( ( rule__ModelDefinition__RhsAssignment_2_0_3 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1385:1: ( ( rule__ModelDefinition__RhsAssignment_2_0_3 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1386:1: ( rule__ModelDefinition__RhsAssignment_2_0_3 )
            {
             before(grammarAccess.getModelDefinitionAccess().getRhsAssignment_2_0_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1387:1: ( rule__ModelDefinition__RhsAssignment_2_0_3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1387:2: rule__ModelDefinition__RhsAssignment_2_0_3
            {
            pushFollow(FOLLOW_rule__ModelDefinition__RhsAssignment_2_0_3_in_rule__ModelDefinition__Group_2_0__3__Impl2965);
            rule__ModelDefinition__RhsAssignment_2_0_3();

            state._fsp--;


            }

             after(grammarAccess.getModelDefinitionAccess().getRhsAssignment_2_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_0__3__Impl"


    // $ANTLR start "rule__ModelDefinition__Group_2_1__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1405:1: rule__ModelDefinition__Group_2_1__0 : rule__ModelDefinition__Group_2_1__0__Impl rule__ModelDefinition__Group_2_1__1 ;
    public final void rule__ModelDefinition__Group_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1409:1: ( rule__ModelDefinition__Group_2_1__0__Impl rule__ModelDefinition__Group_2_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1410:2: rule__ModelDefinition__Group_2_1__0__Impl rule__ModelDefinition__Group_2_1__1
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_1__0__Impl_in_rule__ModelDefinition__Group_2_1__03003);
            rule__ModelDefinition__Group_2_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_1__1_in_rule__ModelDefinition__Group_2_1__03006);
            rule__ModelDefinition__Group_2_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_1__0"


    // $ANTLR start "rule__ModelDefinition__Group_2_1__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1417:1: rule__ModelDefinition__Group_2_1__0__Impl : ( ( rule__ModelDefinition__TypeAssignment_2_1_0 ) ) ;
    public final void rule__ModelDefinition__Group_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1421:1: ( ( ( rule__ModelDefinition__TypeAssignment_2_1_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1422:1: ( ( rule__ModelDefinition__TypeAssignment_2_1_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1422:1: ( ( rule__ModelDefinition__TypeAssignment_2_1_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1423:1: ( rule__ModelDefinition__TypeAssignment_2_1_0 )
            {
             before(grammarAccess.getModelDefinitionAccess().getTypeAssignment_2_1_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1424:1: ( rule__ModelDefinition__TypeAssignment_2_1_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1424:2: rule__ModelDefinition__TypeAssignment_2_1_0
            {
            pushFollow(FOLLOW_rule__ModelDefinition__TypeAssignment_2_1_0_in_rule__ModelDefinition__Group_2_1__0__Impl3033);
            rule__ModelDefinition__TypeAssignment_2_1_0();

            state._fsp--;


            }

             after(grammarAccess.getModelDefinitionAccess().getTypeAssignment_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_1__0__Impl"


    // $ANTLR start "rule__ModelDefinition__Group_2_1__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1434:1: rule__ModelDefinition__Group_2_1__1 : rule__ModelDefinition__Group_2_1__1__Impl rule__ModelDefinition__Group_2_1__2 ;
    public final void rule__ModelDefinition__Group_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1438:1: ( rule__ModelDefinition__Group_2_1__1__Impl rule__ModelDefinition__Group_2_1__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1439:2: rule__ModelDefinition__Group_2_1__1__Impl rule__ModelDefinition__Group_2_1__2
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_1__1__Impl_in_rule__ModelDefinition__Group_2_1__13063);
            rule__ModelDefinition__Group_2_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_1__2_in_rule__ModelDefinition__Group_2_1__13066);
            rule__ModelDefinition__Group_2_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_1__1"


    // $ANTLR start "rule__ModelDefinition__Group_2_1__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1446:1: rule__ModelDefinition__Group_2_1__1__Impl : ( ( rule__ModelDefinition__NameAssignment_2_1_1 ) ) ;
    public final void rule__ModelDefinition__Group_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1450:1: ( ( ( rule__ModelDefinition__NameAssignment_2_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1451:1: ( ( rule__ModelDefinition__NameAssignment_2_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1451:1: ( ( rule__ModelDefinition__NameAssignment_2_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1452:1: ( rule__ModelDefinition__NameAssignment_2_1_1 )
            {
             before(grammarAccess.getModelDefinitionAccess().getNameAssignment_2_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1453:1: ( rule__ModelDefinition__NameAssignment_2_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1453:2: rule__ModelDefinition__NameAssignment_2_1_1
            {
            pushFollow(FOLLOW_rule__ModelDefinition__NameAssignment_2_1_1_in_rule__ModelDefinition__Group_2_1__1__Impl3093);
            rule__ModelDefinition__NameAssignment_2_1_1();

            state._fsp--;


            }

             after(grammarAccess.getModelDefinitionAccess().getNameAssignment_2_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_1__1__Impl"


    // $ANTLR start "rule__ModelDefinition__Group_2_1__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1463:1: rule__ModelDefinition__Group_2_1__2 : rule__ModelDefinition__Group_2_1__2__Impl rule__ModelDefinition__Group_2_1__3 ;
    public final void rule__ModelDefinition__Group_2_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1467:1: ( rule__ModelDefinition__Group_2_1__2__Impl rule__ModelDefinition__Group_2_1__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1468:2: rule__ModelDefinition__Group_2_1__2__Impl rule__ModelDefinition__Group_2_1__3
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_1__2__Impl_in_rule__ModelDefinition__Group_2_1__23123);
            rule__ModelDefinition__Group_2_1__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_1__3_in_rule__ModelDefinition__Group_2_1__23126);
            rule__ModelDefinition__Group_2_1__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_1__2"


    // $ANTLR start "rule__ModelDefinition__Group_2_1__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1475:1: rule__ModelDefinition__Group_2_1__2__Impl : ( '=' ) ;
    public final void rule__ModelDefinition__Group_2_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1479:1: ( ( '=' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1480:1: ( '=' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1480:1: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1481:1: '='
            {
             before(grammarAccess.getModelDefinitionAccess().getEqualsSignKeyword_2_1_2()); 
            match(input,32,FOLLOW_32_in_rule__ModelDefinition__Group_2_1__2__Impl3154); 
             after(grammarAccess.getModelDefinitionAccess().getEqualsSignKeyword_2_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_1__2__Impl"


    // $ANTLR start "rule__ModelDefinition__Group_2_1__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1494:1: rule__ModelDefinition__Group_2_1__3 : rule__ModelDefinition__Group_2_1__3__Impl ;
    public final void rule__ModelDefinition__Group_2_1__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1498:1: ( rule__ModelDefinition__Group_2_1__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1499:2: rule__ModelDefinition__Group_2_1__3__Impl
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_1__3__Impl_in_rule__ModelDefinition__Group_2_1__33185);
            rule__ModelDefinition__Group_2_1__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_1__3"


    // $ANTLR start "rule__ModelDefinition__Group_2_1__3__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1505:1: rule__ModelDefinition__Group_2_1__3__Impl : ( ( rule__ModelDefinition__RhsAssignment_2_1_3 ) ) ;
    public final void rule__ModelDefinition__Group_2_1__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1509:1: ( ( ( rule__ModelDefinition__RhsAssignment_2_1_3 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1510:1: ( ( rule__ModelDefinition__RhsAssignment_2_1_3 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1510:1: ( ( rule__ModelDefinition__RhsAssignment_2_1_3 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1511:1: ( rule__ModelDefinition__RhsAssignment_2_1_3 )
            {
             before(grammarAccess.getModelDefinitionAccess().getRhsAssignment_2_1_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1512:1: ( rule__ModelDefinition__RhsAssignment_2_1_3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1512:2: rule__ModelDefinition__RhsAssignment_2_1_3
            {
            pushFollow(FOLLOW_rule__ModelDefinition__RhsAssignment_2_1_3_in_rule__ModelDefinition__Group_2_1__3__Impl3212);
            rule__ModelDefinition__RhsAssignment_2_1_3();

            state._fsp--;


            }

             after(grammarAccess.getModelDefinitionAccess().getRhsAssignment_2_1_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_1__3__Impl"


    // $ANTLR start "rule__ModelDefinition__Group_2_2__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1530:1: rule__ModelDefinition__Group_2_2__0 : rule__ModelDefinition__Group_2_2__0__Impl rule__ModelDefinition__Group_2_2__1 ;
    public final void rule__ModelDefinition__Group_2_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1534:1: ( rule__ModelDefinition__Group_2_2__0__Impl rule__ModelDefinition__Group_2_2__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1535:2: rule__ModelDefinition__Group_2_2__0__Impl rule__ModelDefinition__Group_2_2__1
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_2__0__Impl_in_rule__ModelDefinition__Group_2_2__03250);
            rule__ModelDefinition__Group_2_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_2__1_in_rule__ModelDefinition__Group_2_2__03253);
            rule__ModelDefinition__Group_2_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_2__0"


    // $ANTLR start "rule__ModelDefinition__Group_2_2__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1542:1: rule__ModelDefinition__Group_2_2__0__Impl : ( ( rule__ModelDefinition__TypeAssignment_2_2_0 ) ) ;
    public final void rule__ModelDefinition__Group_2_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1546:1: ( ( ( rule__ModelDefinition__TypeAssignment_2_2_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1547:1: ( ( rule__ModelDefinition__TypeAssignment_2_2_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1547:1: ( ( rule__ModelDefinition__TypeAssignment_2_2_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1548:1: ( rule__ModelDefinition__TypeAssignment_2_2_0 )
            {
             before(grammarAccess.getModelDefinitionAccess().getTypeAssignment_2_2_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1549:1: ( rule__ModelDefinition__TypeAssignment_2_2_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1549:2: rule__ModelDefinition__TypeAssignment_2_2_0
            {
            pushFollow(FOLLOW_rule__ModelDefinition__TypeAssignment_2_2_0_in_rule__ModelDefinition__Group_2_2__0__Impl3280);
            rule__ModelDefinition__TypeAssignment_2_2_0();

            state._fsp--;


            }

             after(grammarAccess.getModelDefinitionAccess().getTypeAssignment_2_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_2__0__Impl"


    // $ANTLR start "rule__ModelDefinition__Group_2_2__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1559:1: rule__ModelDefinition__Group_2_2__1 : rule__ModelDefinition__Group_2_2__1__Impl rule__ModelDefinition__Group_2_2__2 ;
    public final void rule__ModelDefinition__Group_2_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1563:1: ( rule__ModelDefinition__Group_2_2__1__Impl rule__ModelDefinition__Group_2_2__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1564:2: rule__ModelDefinition__Group_2_2__1__Impl rule__ModelDefinition__Group_2_2__2
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_2__1__Impl_in_rule__ModelDefinition__Group_2_2__13310);
            rule__ModelDefinition__Group_2_2__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_2__2_in_rule__ModelDefinition__Group_2_2__13313);
            rule__ModelDefinition__Group_2_2__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_2__1"


    // $ANTLR start "rule__ModelDefinition__Group_2_2__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1571:1: rule__ModelDefinition__Group_2_2__1__Impl : ( ( rule__ModelDefinition__NameAssignment_2_2_1 ) ) ;
    public final void rule__ModelDefinition__Group_2_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1575:1: ( ( ( rule__ModelDefinition__NameAssignment_2_2_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1576:1: ( ( rule__ModelDefinition__NameAssignment_2_2_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1576:1: ( ( rule__ModelDefinition__NameAssignment_2_2_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1577:1: ( rule__ModelDefinition__NameAssignment_2_2_1 )
            {
             before(grammarAccess.getModelDefinitionAccess().getNameAssignment_2_2_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1578:1: ( rule__ModelDefinition__NameAssignment_2_2_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1578:2: rule__ModelDefinition__NameAssignment_2_2_1
            {
            pushFollow(FOLLOW_rule__ModelDefinition__NameAssignment_2_2_1_in_rule__ModelDefinition__Group_2_2__1__Impl3340);
            rule__ModelDefinition__NameAssignment_2_2_1();

            state._fsp--;


            }

             after(grammarAccess.getModelDefinitionAccess().getNameAssignment_2_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_2__1__Impl"


    // $ANTLR start "rule__ModelDefinition__Group_2_2__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1588:1: rule__ModelDefinition__Group_2_2__2 : rule__ModelDefinition__Group_2_2__2__Impl rule__ModelDefinition__Group_2_2__3 ;
    public final void rule__ModelDefinition__Group_2_2__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1592:1: ( rule__ModelDefinition__Group_2_2__2__Impl rule__ModelDefinition__Group_2_2__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1593:2: rule__ModelDefinition__Group_2_2__2__Impl rule__ModelDefinition__Group_2_2__3
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_2__2__Impl_in_rule__ModelDefinition__Group_2_2__23370);
            rule__ModelDefinition__Group_2_2__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_2__3_in_rule__ModelDefinition__Group_2_2__23373);
            rule__ModelDefinition__Group_2_2__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_2__2"


    // $ANTLR start "rule__ModelDefinition__Group_2_2__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1600:1: rule__ModelDefinition__Group_2_2__2__Impl : ( '=' ) ;
    public final void rule__ModelDefinition__Group_2_2__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1604:1: ( ( '=' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1605:1: ( '=' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1605:1: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1606:1: '='
            {
             before(grammarAccess.getModelDefinitionAccess().getEqualsSignKeyword_2_2_2()); 
            match(input,32,FOLLOW_32_in_rule__ModelDefinition__Group_2_2__2__Impl3401); 
             after(grammarAccess.getModelDefinitionAccess().getEqualsSignKeyword_2_2_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_2__2__Impl"


    // $ANTLR start "rule__ModelDefinition__Group_2_2__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1619:1: rule__ModelDefinition__Group_2_2__3 : rule__ModelDefinition__Group_2_2__3__Impl ;
    public final void rule__ModelDefinition__Group_2_2__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1623:1: ( rule__ModelDefinition__Group_2_2__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1624:2: rule__ModelDefinition__Group_2_2__3__Impl
            {
            pushFollow(FOLLOW_rule__ModelDefinition__Group_2_2__3__Impl_in_rule__ModelDefinition__Group_2_2__33432);
            rule__ModelDefinition__Group_2_2__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_2__3"


    // $ANTLR start "rule__ModelDefinition__Group_2_2__3__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1630:1: rule__ModelDefinition__Group_2_2__3__Impl : ( ( rule__ModelDefinition__RhsAssignment_2_2_3 ) ) ;
    public final void rule__ModelDefinition__Group_2_2__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1634:1: ( ( ( rule__ModelDefinition__RhsAssignment_2_2_3 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1635:1: ( ( rule__ModelDefinition__RhsAssignment_2_2_3 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1635:1: ( ( rule__ModelDefinition__RhsAssignment_2_2_3 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1636:1: ( rule__ModelDefinition__RhsAssignment_2_2_3 )
            {
             before(grammarAccess.getModelDefinitionAccess().getRhsAssignment_2_2_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1637:1: ( rule__ModelDefinition__RhsAssignment_2_2_3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1637:2: rule__ModelDefinition__RhsAssignment_2_2_3
            {
            pushFollow(FOLLOW_rule__ModelDefinition__RhsAssignment_2_2_3_in_rule__ModelDefinition__Group_2_2__3__Impl3459);
            rule__ModelDefinition__RhsAssignment_2_2_3();

            state._fsp--;


            }

             after(grammarAccess.getModelDefinitionAccess().getRhsAssignment_2_2_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__Group_2_2__3__Impl"


    // $ANTLR start "rule__RecordExpression__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1655:1: rule__RecordExpression__Group__0 : rule__RecordExpression__Group__0__Impl rule__RecordExpression__Group__1 ;
    public final void rule__RecordExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1659:1: ( rule__RecordExpression__Group__0__Impl rule__RecordExpression__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1660:2: rule__RecordExpression__Group__0__Impl rule__RecordExpression__Group__1
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group__0__Impl_in_rule__RecordExpression__Group__03497);
            rule__RecordExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordExpression__Group__1_in_rule__RecordExpression__Group__03500);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1667:1: rule__RecordExpression__Group__0__Impl : ( ( rule__RecordExpression__TermsAssignment_0 ) ) ;
    public final void rule__RecordExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1671:1: ( ( ( rule__RecordExpression__TermsAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1672:1: ( ( rule__RecordExpression__TermsAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1672:1: ( ( rule__RecordExpression__TermsAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1673:1: ( rule__RecordExpression__TermsAssignment_0 )
            {
             before(grammarAccess.getRecordExpressionAccess().getTermsAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1674:1: ( rule__RecordExpression__TermsAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1674:2: rule__RecordExpression__TermsAssignment_0
            {
            pushFollow(FOLLOW_rule__RecordExpression__TermsAssignment_0_in_rule__RecordExpression__Group__0__Impl3527);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1684:1: rule__RecordExpression__Group__1 : rule__RecordExpression__Group__1__Impl ;
    public final void rule__RecordExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1688:1: ( rule__RecordExpression__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1689:2: rule__RecordExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group__1__Impl_in_rule__RecordExpression__Group__13557);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1695:1: rule__RecordExpression__Group__1__Impl : ( ( rule__RecordExpression__Group_1__0 )* ) ;
    public final void rule__RecordExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1699:1: ( ( ( rule__RecordExpression__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1700:1: ( ( rule__RecordExpression__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1700:1: ( ( rule__RecordExpression__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1701:1: ( rule__RecordExpression__Group_1__0 )*
            {
             before(grammarAccess.getRecordExpressionAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1702:1: ( rule__RecordExpression__Group_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==33) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1702:2: rule__RecordExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__RecordExpression__Group_1__0_in_rule__RecordExpression__Group__1__Impl3584);
            	    rule__RecordExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1716:1: rule__RecordExpression__Group_1__0 : rule__RecordExpression__Group_1__0__Impl rule__RecordExpression__Group_1__1 ;
    public final void rule__RecordExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1720:1: ( rule__RecordExpression__Group_1__0__Impl rule__RecordExpression__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1721:2: rule__RecordExpression__Group_1__0__Impl rule__RecordExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group_1__0__Impl_in_rule__RecordExpression__Group_1__03619);
            rule__RecordExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordExpression__Group_1__1_in_rule__RecordExpression__Group_1__03622);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1728:1: rule__RecordExpression__Group_1__0__Impl : ( '+' ) ;
    public final void rule__RecordExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1732:1: ( ( '+' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1733:1: ( '+' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1733:1: ( '+' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1734:1: '+'
            {
             before(grammarAccess.getRecordExpressionAccess().getPlusSignKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__RecordExpression__Group_1__0__Impl3650); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1747:1: rule__RecordExpression__Group_1__1 : rule__RecordExpression__Group_1__1__Impl ;
    public final void rule__RecordExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1751:1: ( rule__RecordExpression__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1752:2: rule__RecordExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__RecordExpression__Group_1__1__Impl_in_rule__RecordExpression__Group_1__13681);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1758:1: rule__RecordExpression__Group_1__1__Impl : ( ( rule__RecordExpression__TermsAssignment_1_1 ) ) ;
    public final void rule__RecordExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1762:1: ( ( ( rule__RecordExpression__TermsAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1763:1: ( ( rule__RecordExpression__TermsAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1763:1: ( ( rule__RecordExpression__TermsAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1764:1: ( rule__RecordExpression__TermsAssignment_1_1 )
            {
             before(grammarAccess.getRecordExpressionAccess().getTermsAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1765:1: ( rule__RecordExpression__TermsAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1765:2: rule__RecordExpression__TermsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__RecordExpression__TermsAssignment_1_1_in_rule__RecordExpression__Group_1__1__Impl3708);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1779:1: rule__RecordTerm__Group_0__0 : rule__RecordTerm__Group_0__0__Impl rule__RecordTerm__Group_0__1 ;
    public final void rule__RecordTerm__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1783:1: ( rule__RecordTerm__Group_0__0__Impl rule__RecordTerm__Group_0__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1784:2: rule__RecordTerm__Group_0__0__Impl rule__RecordTerm__Group_0__1
            {
            pushFollow(FOLLOW_rule__RecordTerm__Group_0__0__Impl_in_rule__RecordTerm__Group_0__03742);
            rule__RecordTerm__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordTerm__Group_0__1_in_rule__RecordTerm__Group_0__03745);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1791:1: rule__RecordTerm__Group_0__0__Impl : ( '{' ) ;
    public final void rule__RecordTerm__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1795:1: ( ( '{' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1796:1: ( '{' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1796:1: ( '{' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1797:1: '{'
            {
             before(grammarAccess.getRecordTermAccess().getLeftCurlyBracketKeyword_0_0()); 
            match(input,34,FOLLOW_34_in_rule__RecordTerm__Group_0__0__Impl3773); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1810:1: rule__RecordTerm__Group_0__1 : rule__RecordTerm__Group_0__1__Impl rule__RecordTerm__Group_0__2 ;
    public final void rule__RecordTerm__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1814:1: ( rule__RecordTerm__Group_0__1__Impl rule__RecordTerm__Group_0__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1815:2: rule__RecordTerm__Group_0__1__Impl rule__RecordTerm__Group_0__2
            {
            pushFollow(FOLLOW_rule__RecordTerm__Group_0__1__Impl_in_rule__RecordTerm__Group_0__13804);
            rule__RecordTerm__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordTerm__Group_0__2_in_rule__RecordTerm__Group_0__13807);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1822:1: rule__RecordTerm__Group_0__1__Impl : ( () ) ;
    public final void rule__RecordTerm__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1826:1: ( ( () ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1827:1: ( () )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1827:1: ( () )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1828:1: ()
            {
             before(grammarAccess.getRecordTermAccess().getRecordTermAction_0_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1829:1: ()
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1831:1: 
            {
            }

             after(grammarAccess.getRecordTermAccess().getRecordTermAction_0_1()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTerm__Group_0__1__Impl"


    // $ANTLR start "rule__RecordTerm__Group_0__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1841:1: rule__RecordTerm__Group_0__2 : rule__RecordTerm__Group_0__2__Impl rule__RecordTerm__Group_0__3 ;
    public final void rule__RecordTerm__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1845:1: ( rule__RecordTerm__Group_0__2__Impl rule__RecordTerm__Group_0__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1846:2: rule__RecordTerm__Group_0__2__Impl rule__RecordTerm__Group_0__3
            {
            pushFollow(FOLLOW_rule__RecordTerm__Group_0__2__Impl_in_rule__RecordTerm__Group_0__23865);
            rule__RecordTerm__Group_0__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__RecordTerm__Group_0__3_in_rule__RecordTerm__Group_0__23868);
            rule__RecordTerm__Group_0__3();

            state._fsp--;


            }

        }
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1853:1: rule__RecordTerm__Group_0__2__Impl : ( ( rule__RecordTerm__PropertiesAssignment_0_2 )* ) ;
    public final void rule__RecordTerm__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1857:1: ( ( ( rule__RecordTerm__PropertiesAssignment_0_2 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1858:1: ( ( rule__RecordTerm__PropertiesAssignment_0_2 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1858:1: ( ( rule__RecordTerm__PropertiesAssignment_0_2 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1859:1: ( rule__RecordTerm__PropertiesAssignment_0_2 )*
            {
             before(grammarAccess.getRecordTermAccess().getPropertiesAssignment_0_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1860:1: ( rule__RecordTerm__PropertiesAssignment_0_2 )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( ((LA15_0>=RULE_STRING && LA15_0<=RULE_NAME_TOKEN)||(LA15_0>=15 && LA15_0<=17)||LA15_0==37) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1860:2: rule__RecordTerm__PropertiesAssignment_0_2
            	    {
            	    pushFollow(FOLLOW_rule__RecordTerm__PropertiesAssignment_0_2_in_rule__RecordTerm__Group_0__2__Impl3895);
            	    rule__RecordTerm__PropertiesAssignment_0_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

             after(grammarAccess.getRecordTermAccess().getPropertiesAssignment_0_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__RecordTerm__Group_0__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1870:1: rule__RecordTerm__Group_0__3 : rule__RecordTerm__Group_0__3__Impl ;
    public final void rule__RecordTerm__Group_0__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1874:1: ( rule__RecordTerm__Group_0__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1875:2: rule__RecordTerm__Group_0__3__Impl
            {
            pushFollow(FOLLOW_rule__RecordTerm__Group_0__3__Impl_in_rule__RecordTerm__Group_0__33926);
            rule__RecordTerm__Group_0__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTerm__Group_0__3"


    // $ANTLR start "rule__RecordTerm__Group_0__3__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1881:1: rule__RecordTerm__Group_0__3__Impl : ( '}' ) ;
    public final void rule__RecordTerm__Group_0__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1885:1: ( ( '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1886:1: ( '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1886:1: ( '}' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1887:1: '}'
            {
             before(grammarAccess.getRecordTermAccess().getRightCurlyBracketKeyword_0_3()); 
            match(input,35,FOLLOW_35_in_rule__RecordTerm__Group_0__3__Impl3954); 
             after(grammarAccess.getRecordTermAccess().getRightCurlyBracketKeyword_0_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTerm__Group_0__3__Impl"


    // $ANTLR start "rule__PropertyDefinition__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1908:1: rule__PropertyDefinition__Group__0 : rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 ;
    public final void rule__PropertyDefinition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1912:1: ( rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1913:2: rule__PropertyDefinition__Group__0__Impl rule__PropertyDefinition__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__03993);
            rule__PropertyDefinition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__03996);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1920:1: rule__PropertyDefinition__Group__0__Impl : ( ( rule__PropertyDefinition__DescriptionAssignment_0 )? ) ;
    public final void rule__PropertyDefinition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1924:1: ( ( ( rule__PropertyDefinition__DescriptionAssignment_0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1925:1: ( ( rule__PropertyDefinition__DescriptionAssignment_0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1925:1: ( ( rule__PropertyDefinition__DescriptionAssignment_0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1926:1: ( rule__PropertyDefinition__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDescriptionAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1927:1: ( rule__PropertyDefinition__DescriptionAssignment_0 )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1927:2: rule__PropertyDefinition__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__DescriptionAssignment_0_in_rule__PropertyDefinition__Group__0__Impl4023);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1937:1: rule__PropertyDefinition__Group__1 : rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 ;
    public final void rule__PropertyDefinition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1941:1: ( rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1942:2: rule__PropertyDefinition__Group__1__Impl rule__PropertyDefinition__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__14054);
            rule__PropertyDefinition__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__14057);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1949:1: rule__PropertyDefinition__Group__1__Impl : ( ( rule__PropertyDefinition__AttributesAssignment_1 )? ) ;
    public final void rule__PropertyDefinition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1953:1: ( ( ( rule__PropertyDefinition__AttributesAssignment_1 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1954:1: ( ( rule__PropertyDefinition__AttributesAssignment_1 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1954:1: ( ( rule__PropertyDefinition__AttributesAssignment_1 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1955:1: ( rule__PropertyDefinition__AttributesAssignment_1 )?
            {
             before(grammarAccess.getPropertyDefinitionAccess().getAttributesAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1956:1: ( rule__PropertyDefinition__AttributesAssignment_1 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==37) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1956:2: rule__PropertyDefinition__AttributesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PropertyDefinition__AttributesAssignment_1_in_rule__PropertyDefinition__Group__1__Impl4084);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1966:1: rule__PropertyDefinition__Group__2 : rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 ;
    public final void rule__PropertyDefinition__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1970:1: ( rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1971:2: rule__PropertyDefinition__Group__2__Impl rule__PropertyDefinition__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__24115);
            rule__PropertyDefinition__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__24118);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1978:1: rule__PropertyDefinition__Group__2__Impl : ( ( rule__PropertyDefinition__NameAssignment_2 ) ) ;
    public final void rule__PropertyDefinition__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1982:1: ( ( ( rule__PropertyDefinition__NameAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1983:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1983:1: ( ( rule__PropertyDefinition__NameAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1984:1: ( rule__PropertyDefinition__NameAssignment_2 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNameAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1985:1: ( rule__PropertyDefinition__NameAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1985:2: rule__PropertyDefinition__NameAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__NameAssignment_2_in_rule__PropertyDefinition__Group__2__Impl4145);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1995:1: rule__PropertyDefinition__Group__3 : rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 ;
    public final void rule__PropertyDefinition__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:1999:1: ( rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2000:2: rule__PropertyDefinition__Group__3__Impl rule__PropertyDefinition__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__34175);
            rule__PropertyDefinition__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__34178);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2007:1: rule__PropertyDefinition__Group__3__Impl : ( ':' ) ;
    public final void rule__PropertyDefinition__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2011:1: ( ( ':' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2012:1: ( ':' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2012:1: ( ':' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2013:1: ':'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getColonKeyword_3()); 
            match(input,36,FOLLOW_36_in_rule__PropertyDefinition__Group__3__Impl4206); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2026:1: rule__PropertyDefinition__Group__4 : rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 ;
    public final void rule__PropertyDefinition__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2030:1: ( rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2031:2: rule__PropertyDefinition__Group__4__Impl rule__PropertyDefinition__Group__5
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__44237);
            rule__PropertyDefinition__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__44240);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2038:1: rule__PropertyDefinition__Group__4__Impl : ( ( rule__PropertyDefinition__TypeAssignment_4 ) ) ;
    public final void rule__PropertyDefinition__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2042:1: ( ( ( rule__PropertyDefinition__TypeAssignment_4 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2043:1: ( ( rule__PropertyDefinition__TypeAssignment_4 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2043:1: ( ( rule__PropertyDefinition__TypeAssignment_4 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2044:1: ( rule__PropertyDefinition__TypeAssignment_4 )
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypeAssignment_4()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2045:1: ( rule__PropertyDefinition__TypeAssignment_4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2045:2: rule__PropertyDefinition__TypeAssignment_4
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__TypeAssignment_4_in_rule__PropertyDefinition__Group__4__Impl4267);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2055:1: rule__PropertyDefinition__Group__5 : rule__PropertyDefinition__Group__5__Impl ;
    public final void rule__PropertyDefinition__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2059:1: ( rule__PropertyDefinition__Group__5__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2060:2: rule__PropertyDefinition__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__54297);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2066:1: rule__PropertyDefinition__Group__5__Impl : ( ';' ) ;
    public final void rule__PropertyDefinition__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2070:1: ( ( ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2071:1: ( ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2071:1: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2072:1: ';'
            {
             before(grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__PropertyDefinition__Group__5__Impl4325); 
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


    // $ANTLR start "rule__JoinExpression__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2097:1: rule__JoinExpression__Group__0 : rule__JoinExpression__Group__0__Impl rule__JoinExpression__Group__1 ;
    public final void rule__JoinExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2101:1: ( rule__JoinExpression__Group__0__Impl rule__JoinExpression__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2102:2: rule__JoinExpression__Group__0__Impl rule__JoinExpression__Group__1
            {
            pushFollow(FOLLOW_rule__JoinExpression__Group__0__Impl_in_rule__JoinExpression__Group__04368);
            rule__JoinExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoinExpression__Group__1_in_rule__JoinExpression__Group__04371);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2109:1: rule__JoinExpression__Group__0__Impl : ( ( rule__JoinExpression__TermsAssignment_0 ) ) ;
    public final void rule__JoinExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2113:1: ( ( ( rule__JoinExpression__TermsAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2114:1: ( ( rule__JoinExpression__TermsAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2114:1: ( ( rule__JoinExpression__TermsAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2115:1: ( rule__JoinExpression__TermsAssignment_0 )
            {
             before(grammarAccess.getJoinExpressionAccess().getTermsAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2116:1: ( rule__JoinExpression__TermsAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2116:2: rule__JoinExpression__TermsAssignment_0
            {
            pushFollow(FOLLOW_rule__JoinExpression__TermsAssignment_0_in_rule__JoinExpression__Group__0__Impl4398);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2126:1: rule__JoinExpression__Group__1 : rule__JoinExpression__Group__1__Impl ;
    public final void rule__JoinExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2130:1: ( rule__JoinExpression__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2131:2: rule__JoinExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__JoinExpression__Group__1__Impl_in_rule__JoinExpression__Group__14428);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2137:1: rule__JoinExpression__Group__1__Impl : ( ( rule__JoinExpression__Group_1__0 )* ) ;
    public final void rule__JoinExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2141:1: ( ( ( rule__JoinExpression__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2142:1: ( ( rule__JoinExpression__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2142:1: ( ( rule__JoinExpression__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2143:1: ( rule__JoinExpression__Group_1__0 )*
            {
             before(grammarAccess.getJoinExpressionAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2144:1: ( rule__JoinExpression__Group_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==33) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2144:2: rule__JoinExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__JoinExpression__Group_1__0_in_rule__JoinExpression__Group__1__Impl4455);
            	    rule__JoinExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2158:1: rule__JoinExpression__Group_1__0 : rule__JoinExpression__Group_1__0__Impl rule__JoinExpression__Group_1__1 ;
    public final void rule__JoinExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2162:1: ( rule__JoinExpression__Group_1__0__Impl rule__JoinExpression__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2163:2: rule__JoinExpression__Group_1__0__Impl rule__JoinExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__JoinExpression__Group_1__0__Impl_in_rule__JoinExpression__Group_1__04490);
            rule__JoinExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoinExpression__Group_1__1_in_rule__JoinExpression__Group_1__04493);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2170:1: rule__JoinExpression__Group_1__0__Impl : ( '+' ) ;
    public final void rule__JoinExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2174:1: ( ( '+' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2175:1: ( '+' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2175:1: ( '+' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2176:1: '+'
            {
             before(grammarAccess.getJoinExpressionAccess().getPlusSignKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__JoinExpression__Group_1__0__Impl4521); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2189:1: rule__JoinExpression__Group_1__1 : rule__JoinExpression__Group_1__1__Impl ;
    public final void rule__JoinExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2193:1: ( rule__JoinExpression__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2194:2: rule__JoinExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__JoinExpression__Group_1__1__Impl_in_rule__JoinExpression__Group_1__14552);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2200:1: rule__JoinExpression__Group_1__1__Impl : ( ( rule__JoinExpression__TermsAssignment_1_1 ) ) ;
    public final void rule__JoinExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2204:1: ( ( ( rule__JoinExpression__TermsAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2205:1: ( ( rule__JoinExpression__TermsAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2205:1: ( ( rule__JoinExpression__TermsAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2206:1: ( rule__JoinExpression__TermsAssignment_1_1 )
            {
             before(grammarAccess.getJoinExpressionAccess().getTermsAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2207:1: ( rule__JoinExpression__TermsAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2207:2: rule__JoinExpression__TermsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__JoinExpression__TermsAssignment_1_1_in_rule__JoinExpression__Group_1__1__Impl4579);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2221:1: rule__JoinTerm__Group__0 : rule__JoinTerm__Group__0__Impl rule__JoinTerm__Group__1 ;
    public final void rule__JoinTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2225:1: ( rule__JoinTerm__Group__0__Impl rule__JoinTerm__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2226:2: rule__JoinTerm__Group__0__Impl rule__JoinTerm__Group__1
            {
            pushFollow(FOLLOW_rule__JoinTerm__Group__0__Impl_in_rule__JoinTerm__Group__04613);
            rule__JoinTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoinTerm__Group__1_in_rule__JoinTerm__Group__04616);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2233:1: rule__JoinTerm__Group__0__Impl : ( ( rule__JoinTerm__ReferenceAssignment_0 ) ) ;
    public final void rule__JoinTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2237:1: ( ( ( rule__JoinTerm__ReferenceAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2238:1: ( ( rule__JoinTerm__ReferenceAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2238:1: ( ( rule__JoinTerm__ReferenceAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2239:1: ( rule__JoinTerm__ReferenceAssignment_0 )
            {
             before(grammarAccess.getJoinTermAccess().getReferenceAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2240:1: ( rule__JoinTerm__ReferenceAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2240:2: rule__JoinTerm__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__JoinTerm__ReferenceAssignment_0_in_rule__JoinTerm__Group__0__Impl4643);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2250:1: rule__JoinTerm__Group__1 : rule__JoinTerm__Group__1__Impl rule__JoinTerm__Group__2 ;
    public final void rule__JoinTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2254:1: ( rule__JoinTerm__Group__1__Impl rule__JoinTerm__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2255:2: rule__JoinTerm__Group__1__Impl rule__JoinTerm__Group__2
            {
            pushFollow(FOLLOW_rule__JoinTerm__Group__1__Impl_in_rule__JoinTerm__Group__14673);
            rule__JoinTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__JoinTerm__Group__2_in_rule__JoinTerm__Group__14676);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2262:1: rule__JoinTerm__Group__1__Impl : ( ( rule__JoinTerm__MappingAssignment_1 )? ) ;
    public final void rule__JoinTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2266:1: ( ( ( rule__JoinTerm__MappingAssignment_1 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2267:1: ( ( rule__JoinTerm__MappingAssignment_1 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2267:1: ( ( rule__JoinTerm__MappingAssignment_1 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2268:1: ( rule__JoinTerm__MappingAssignment_1 )?
            {
             before(grammarAccess.getJoinTermAccess().getMappingAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2269:1: ( rule__JoinTerm__MappingAssignment_1 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==13) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2269:2: rule__JoinTerm__MappingAssignment_1
                    {
                    pushFollow(FOLLOW_rule__JoinTerm__MappingAssignment_1_in_rule__JoinTerm__Group__1__Impl4703);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2279:1: rule__JoinTerm__Group__2 : rule__JoinTerm__Group__2__Impl ;
    public final void rule__JoinTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2283:1: ( rule__JoinTerm__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2284:2: rule__JoinTerm__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__JoinTerm__Group__2__Impl_in_rule__JoinTerm__Group__24734);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2290:1: rule__JoinTerm__Group__2__Impl : ( ( rule__JoinTerm__GroupingAssignment_2 )? ) ;
    public final void rule__JoinTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2294:1: ( ( ( rule__JoinTerm__GroupingAssignment_2 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2295:1: ( ( rule__JoinTerm__GroupingAssignment_2 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2295:1: ( ( rule__JoinTerm__GroupingAssignment_2 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2296:1: ( rule__JoinTerm__GroupingAssignment_2 )?
            {
             before(grammarAccess.getJoinTermAccess().getGroupingAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2297:1: ( rule__JoinTerm__GroupingAssignment_2 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==41) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2297:2: rule__JoinTerm__GroupingAssignment_2
                    {
                    pushFollow(FOLLOW_rule__JoinTerm__GroupingAssignment_2_in_rule__JoinTerm__Group__2__Impl4761);
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


    // $ANTLR start "rule__SummarizeExpression__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2313:1: rule__SummarizeExpression__Group__0 : rule__SummarizeExpression__Group__0__Impl rule__SummarizeExpression__Group__1 ;
    public final void rule__SummarizeExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2317:1: ( rule__SummarizeExpression__Group__0__Impl rule__SummarizeExpression__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2318:2: rule__SummarizeExpression__Group__0__Impl rule__SummarizeExpression__Group__1
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group__0__Impl_in_rule__SummarizeExpression__Group__04798);
            rule__SummarizeExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeExpression__Group__1_in_rule__SummarizeExpression__Group__04801);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2325:1: rule__SummarizeExpression__Group__0__Impl : ( ( rule__SummarizeExpression__TermsAssignment_0 ) ) ;
    public final void rule__SummarizeExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2329:1: ( ( ( rule__SummarizeExpression__TermsAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2330:1: ( ( rule__SummarizeExpression__TermsAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2330:1: ( ( rule__SummarizeExpression__TermsAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2331:1: ( rule__SummarizeExpression__TermsAssignment_0 )
            {
             before(grammarAccess.getSummarizeExpressionAccess().getTermsAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2332:1: ( rule__SummarizeExpression__TermsAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2332:2: rule__SummarizeExpression__TermsAssignment_0
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__TermsAssignment_0_in_rule__SummarizeExpression__Group__0__Impl4828);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2342:1: rule__SummarizeExpression__Group__1 : rule__SummarizeExpression__Group__1__Impl ;
    public final void rule__SummarizeExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2346:1: ( rule__SummarizeExpression__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2347:2: rule__SummarizeExpression__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group__1__Impl_in_rule__SummarizeExpression__Group__14858);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2353:1: rule__SummarizeExpression__Group__1__Impl : ( ( rule__SummarizeExpression__Group_1__0 )* ) ;
    public final void rule__SummarizeExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2357:1: ( ( ( rule__SummarizeExpression__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2358:1: ( ( rule__SummarizeExpression__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2358:1: ( ( rule__SummarizeExpression__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2359:1: ( rule__SummarizeExpression__Group_1__0 )*
            {
             before(grammarAccess.getSummarizeExpressionAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2360:1: ( rule__SummarizeExpression__Group_1__0 )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==33) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2360:2: rule__SummarizeExpression__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__SummarizeExpression__Group_1__0_in_rule__SummarizeExpression__Group__1__Impl4885);
            	    rule__SummarizeExpression__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop21;
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2374:1: rule__SummarizeExpression__Group_1__0 : rule__SummarizeExpression__Group_1__0__Impl rule__SummarizeExpression__Group_1__1 ;
    public final void rule__SummarizeExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2378:1: ( rule__SummarizeExpression__Group_1__0__Impl rule__SummarizeExpression__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2379:2: rule__SummarizeExpression__Group_1__0__Impl rule__SummarizeExpression__Group_1__1
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group_1__0__Impl_in_rule__SummarizeExpression__Group_1__04920);
            rule__SummarizeExpression__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeExpression__Group_1__1_in_rule__SummarizeExpression__Group_1__04923);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2386:1: rule__SummarizeExpression__Group_1__0__Impl : ( '+' ) ;
    public final void rule__SummarizeExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2390:1: ( ( '+' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2391:1: ( '+' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2391:1: ( '+' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2392:1: '+'
            {
             before(grammarAccess.getSummarizeExpressionAccess().getPlusSignKeyword_1_0()); 
            match(input,33,FOLLOW_33_in_rule__SummarizeExpression__Group_1__0__Impl4951); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2405:1: rule__SummarizeExpression__Group_1__1 : rule__SummarizeExpression__Group_1__1__Impl ;
    public final void rule__SummarizeExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2409:1: ( rule__SummarizeExpression__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2410:2: rule__SummarizeExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__Group_1__1__Impl_in_rule__SummarizeExpression__Group_1__14982);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2416:1: rule__SummarizeExpression__Group_1__1__Impl : ( ( rule__SummarizeExpression__TermsAssignment_1_1 ) ) ;
    public final void rule__SummarizeExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2420:1: ( ( ( rule__SummarizeExpression__TermsAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2421:1: ( ( rule__SummarizeExpression__TermsAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2421:1: ( ( rule__SummarizeExpression__TermsAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2422:1: ( rule__SummarizeExpression__TermsAssignment_1_1 )
            {
             before(grammarAccess.getSummarizeExpressionAccess().getTermsAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2423:1: ( rule__SummarizeExpression__TermsAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2423:2: rule__SummarizeExpression__TermsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__SummarizeExpression__TermsAssignment_1_1_in_rule__SummarizeExpression__Group_1__1__Impl5009);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2437:1: rule__SummarizeTerm__Group__0 : rule__SummarizeTerm__Group__0__Impl rule__SummarizeTerm__Group__1 ;
    public final void rule__SummarizeTerm__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2441:1: ( rule__SummarizeTerm__Group__0__Impl rule__SummarizeTerm__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2442:2: rule__SummarizeTerm__Group__0__Impl rule__SummarizeTerm__Group__1
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__Group__0__Impl_in_rule__SummarizeTerm__Group__05043);
            rule__SummarizeTerm__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeTerm__Group__1_in_rule__SummarizeTerm__Group__05046);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2449:1: rule__SummarizeTerm__Group__0__Impl : ( ( rule__SummarizeTerm__ReferenceAssignment_0 ) ) ;
    public final void rule__SummarizeTerm__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2453:1: ( ( ( rule__SummarizeTerm__ReferenceAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2454:1: ( ( rule__SummarizeTerm__ReferenceAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2454:1: ( ( rule__SummarizeTerm__ReferenceAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2455:1: ( rule__SummarizeTerm__ReferenceAssignment_0 )
            {
             before(grammarAccess.getSummarizeTermAccess().getReferenceAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2456:1: ( rule__SummarizeTerm__ReferenceAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2456:2: rule__SummarizeTerm__ReferenceAssignment_0
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__ReferenceAssignment_0_in_rule__SummarizeTerm__Group__0__Impl5073);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2466:1: rule__SummarizeTerm__Group__1 : rule__SummarizeTerm__Group__1__Impl rule__SummarizeTerm__Group__2 ;
    public final void rule__SummarizeTerm__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2470:1: ( rule__SummarizeTerm__Group__1__Impl rule__SummarizeTerm__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2471:2: rule__SummarizeTerm__Group__1__Impl rule__SummarizeTerm__Group__2
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__Group__1__Impl_in_rule__SummarizeTerm__Group__15103);
            rule__SummarizeTerm__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__SummarizeTerm__Group__2_in_rule__SummarizeTerm__Group__15106);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2478:1: rule__SummarizeTerm__Group__1__Impl : ( ( rule__SummarizeTerm__FoldingAssignment_1 ) ) ;
    public final void rule__SummarizeTerm__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2482:1: ( ( ( rule__SummarizeTerm__FoldingAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2483:1: ( ( rule__SummarizeTerm__FoldingAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2483:1: ( ( rule__SummarizeTerm__FoldingAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2484:1: ( rule__SummarizeTerm__FoldingAssignment_1 )
            {
             before(grammarAccess.getSummarizeTermAccess().getFoldingAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2485:1: ( rule__SummarizeTerm__FoldingAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2485:2: rule__SummarizeTerm__FoldingAssignment_1
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__FoldingAssignment_1_in_rule__SummarizeTerm__Group__1__Impl5133);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2495:1: rule__SummarizeTerm__Group__2 : rule__SummarizeTerm__Group__2__Impl ;
    public final void rule__SummarizeTerm__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2499:1: ( rule__SummarizeTerm__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2500:2: rule__SummarizeTerm__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__SummarizeTerm__Group__2__Impl_in_rule__SummarizeTerm__Group__25163);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2506:1: rule__SummarizeTerm__Group__2__Impl : ( ( rule__SummarizeTerm__GroupingAssignment_2 )? ) ;
    public final void rule__SummarizeTerm__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2510:1: ( ( ( rule__SummarizeTerm__GroupingAssignment_2 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2511:1: ( ( rule__SummarizeTerm__GroupingAssignment_2 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2511:1: ( ( rule__SummarizeTerm__GroupingAssignment_2 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2512:1: ( rule__SummarizeTerm__GroupingAssignment_2 )?
            {
             before(grammarAccess.getSummarizeTermAccess().getGroupingAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2513:1: ( rule__SummarizeTerm__GroupingAssignment_2 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==41) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2513:2: rule__SummarizeTerm__GroupingAssignment_2
                    {
                    pushFollow(FOLLOW_rule__SummarizeTerm__GroupingAssignment_2_in_rule__SummarizeTerm__Group__2__Impl5190);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2529:1: rule__Attribute__Group__0 : rule__Attribute__Group__0__Impl rule__Attribute__Group__1 ;
    public final void rule__Attribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2533:1: ( rule__Attribute__Group__0__Impl rule__Attribute__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2534:2: rule__Attribute__Group__0__Impl rule__Attribute__Group__1
            {
            pushFollow(FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05227);
            rule__Attribute__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05230);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2541:1: rule__Attribute__Group__0__Impl : ( '@' ) ;
    public final void rule__Attribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2545:1: ( ( '@' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2546:1: ( '@' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2546:1: ( '@' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2547:1: '@'
            {
             before(grammarAccess.getAttributeAccess().getCommercialAtKeyword_0()); 
            match(input,37,FOLLOW_37_in_rule__Attribute__Group__0__Impl5258); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2560:1: rule__Attribute__Group__1 : rule__Attribute__Group__1__Impl rule__Attribute__Group__2 ;
    public final void rule__Attribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2564:1: ( rule__Attribute__Group__1__Impl rule__Attribute__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2565:2: rule__Attribute__Group__1__Impl rule__Attribute__Group__2
            {
            pushFollow(FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15289);
            rule__Attribute__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15292);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2572:1: rule__Attribute__Group__1__Impl : ( ( rule__Attribute__NameAssignment_1 ) ) ;
    public final void rule__Attribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2576:1: ( ( ( rule__Attribute__NameAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2577:1: ( ( rule__Attribute__NameAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2577:1: ( ( rule__Attribute__NameAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2578:1: ( rule__Attribute__NameAssignment_1 )
            {
             before(grammarAccess.getAttributeAccess().getNameAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2579:1: ( rule__Attribute__NameAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2579:2: rule__Attribute__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl5319);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2589:1: rule__Attribute__Group__2 : rule__Attribute__Group__2__Impl ;
    public final void rule__Attribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2593:1: ( rule__Attribute__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2594:2: rule__Attribute__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25349);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2600:1: rule__Attribute__Group__2__Impl : ( ( rule__Attribute__ElementBlockAssignment_2 )? ) ;
    public final void rule__Attribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2604:1: ( ( ( rule__Attribute__ElementBlockAssignment_2 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2605:1: ( ( rule__Attribute__ElementBlockAssignment_2 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2605:1: ( ( rule__Attribute__ElementBlockAssignment_2 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2606:1: ( rule__Attribute__ElementBlockAssignment_2 )?
            {
             before(grammarAccess.getAttributeAccess().getElementBlockAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2607:1: ( rule__Attribute__ElementBlockAssignment_2 )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==38) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2607:2: rule__Attribute__ElementBlockAssignment_2
                    {
                    pushFollow(FOLLOW_rule__Attribute__ElementBlockAssignment_2_in_rule__Attribute__Group__2__Impl5376);
                    rule__Attribute__ElementBlockAssignment_2();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeAccess().getElementBlockAssignment_2()); 

            }


            }

        }
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


    // $ANTLR start "rule__AttributeElementBlock__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2623:1: rule__AttributeElementBlock__Group__0 : rule__AttributeElementBlock__Group__0__Impl rule__AttributeElementBlock__Group__1 ;
    public final void rule__AttributeElementBlock__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2627:1: ( rule__AttributeElementBlock__Group__0__Impl rule__AttributeElementBlock__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2628:2: rule__AttributeElementBlock__Group__0__Impl rule__AttributeElementBlock__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeElementBlock__Group__0__Impl_in_rule__AttributeElementBlock__Group__05413);
            rule__AttributeElementBlock__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElementBlock__Group__1_in_rule__AttributeElementBlock__Group__05416);
            rule__AttributeElementBlock__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementBlock__Group__0"


    // $ANTLR start "rule__AttributeElementBlock__Group__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2635:1: rule__AttributeElementBlock__Group__0__Impl : ( () ) ;
    public final void rule__AttributeElementBlock__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2639:1: ( ( () ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2640:1: ( () )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2640:1: ( () )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2641:1: ()
            {
             before(grammarAccess.getAttributeElementBlockAccess().getAttributeElementBlockAction_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2642:1: ()
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2644:1: 
            {
            }

             after(grammarAccess.getAttributeElementBlockAccess().getAttributeElementBlockAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementBlock__Group__0__Impl"


    // $ANTLR start "rule__AttributeElementBlock__Group__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2654:1: rule__AttributeElementBlock__Group__1 : rule__AttributeElementBlock__Group__1__Impl rule__AttributeElementBlock__Group__2 ;
    public final void rule__AttributeElementBlock__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2658:1: ( rule__AttributeElementBlock__Group__1__Impl rule__AttributeElementBlock__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2659:2: rule__AttributeElementBlock__Group__1__Impl rule__AttributeElementBlock__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeElementBlock__Group__1__Impl_in_rule__AttributeElementBlock__Group__15474);
            rule__AttributeElementBlock__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElementBlock__Group__2_in_rule__AttributeElementBlock__Group__15477);
            rule__AttributeElementBlock__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementBlock__Group__1"


    // $ANTLR start "rule__AttributeElementBlock__Group__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2666:1: rule__AttributeElementBlock__Group__1__Impl : ( '(' ) ;
    public final void rule__AttributeElementBlock__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2670:1: ( ( '(' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2671:1: ( '(' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2671:1: ( '(' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2672:1: '('
            {
             before(grammarAccess.getAttributeElementBlockAccess().getLeftParenthesisKeyword_1()); 
            match(input,38,FOLLOW_38_in_rule__AttributeElementBlock__Group__1__Impl5505); 
             after(grammarAccess.getAttributeElementBlockAccess().getLeftParenthesisKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementBlock__Group__1__Impl"


    // $ANTLR start "rule__AttributeElementBlock__Group__2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2685:1: rule__AttributeElementBlock__Group__2 : rule__AttributeElementBlock__Group__2__Impl rule__AttributeElementBlock__Group__3 ;
    public final void rule__AttributeElementBlock__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2689:1: ( rule__AttributeElementBlock__Group__2__Impl rule__AttributeElementBlock__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2690:2: rule__AttributeElementBlock__Group__2__Impl rule__AttributeElementBlock__Group__3
            {
            pushFollow(FOLLOW_rule__AttributeElementBlock__Group__2__Impl_in_rule__AttributeElementBlock__Group__25536);
            rule__AttributeElementBlock__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElementBlock__Group__3_in_rule__AttributeElementBlock__Group__25539);
            rule__AttributeElementBlock__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementBlock__Group__2"


    // $ANTLR start "rule__AttributeElementBlock__Group__2__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2697:1: rule__AttributeElementBlock__Group__2__Impl : ( ( rule__AttributeElementBlock__Group_2__0 )? ) ;
    public final void rule__AttributeElementBlock__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2701:1: ( ( ( rule__AttributeElementBlock__Group_2__0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2702:1: ( ( rule__AttributeElementBlock__Group_2__0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2702:1: ( ( rule__AttributeElementBlock__Group_2__0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2703:1: ( rule__AttributeElementBlock__Group_2__0 )?
            {
             before(grammarAccess.getAttributeElementBlockAccess().getGroup_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2704:1: ( rule__AttributeElementBlock__Group_2__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_NAME_TOKEN||(LA24_0>=15 && LA24_0<=17)) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2704:2: rule__AttributeElementBlock__Group_2__0
                    {
                    pushFollow(FOLLOW_rule__AttributeElementBlock__Group_2__0_in_rule__AttributeElementBlock__Group__2__Impl5566);
                    rule__AttributeElementBlock__Group_2__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAttributeElementBlockAccess().getGroup_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementBlock__Group__2__Impl"


    // $ANTLR start "rule__AttributeElementBlock__Group__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2714:1: rule__AttributeElementBlock__Group__3 : rule__AttributeElementBlock__Group__3__Impl ;
    public final void rule__AttributeElementBlock__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2718:1: ( rule__AttributeElementBlock__Group__3__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2719:2: rule__AttributeElementBlock__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__AttributeElementBlock__Group__3__Impl_in_rule__AttributeElementBlock__Group__35597);
            rule__AttributeElementBlock__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementBlock__Group__3"


    // $ANTLR start "rule__AttributeElementBlock__Group__3__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2725:1: rule__AttributeElementBlock__Group__3__Impl : ( ')' ) ;
    public final void rule__AttributeElementBlock__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2729:1: ( ( ')' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2730:1: ( ')' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2730:1: ( ')' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2731:1: ')'
            {
             before(grammarAccess.getAttributeElementBlockAccess().getRightParenthesisKeyword_3()); 
            match(input,39,FOLLOW_39_in_rule__AttributeElementBlock__Group__3__Impl5625); 
             after(grammarAccess.getAttributeElementBlockAccess().getRightParenthesisKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementBlock__Group__3__Impl"


    // $ANTLR start "rule__AttributeElementBlock__Group_2__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2752:1: rule__AttributeElementBlock__Group_2__0 : rule__AttributeElementBlock__Group_2__0__Impl rule__AttributeElementBlock__Group_2__1 ;
    public final void rule__AttributeElementBlock__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2756:1: ( rule__AttributeElementBlock__Group_2__0__Impl rule__AttributeElementBlock__Group_2__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2757:2: rule__AttributeElementBlock__Group_2__0__Impl rule__AttributeElementBlock__Group_2__1
            {
            pushFollow(FOLLOW_rule__AttributeElementBlock__Group_2__0__Impl_in_rule__AttributeElementBlock__Group_2__05664);
            rule__AttributeElementBlock__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElementBlock__Group_2__1_in_rule__AttributeElementBlock__Group_2__05667);
            rule__AttributeElementBlock__Group_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementBlock__Group_2__0"


    // $ANTLR start "rule__AttributeElementBlock__Group_2__0__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2764:1: rule__AttributeElementBlock__Group_2__0__Impl : ( ( rule__AttributeElementBlock__ElementsAssignment_2_0 ) ) ;
    public final void rule__AttributeElementBlock__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2768:1: ( ( ( rule__AttributeElementBlock__ElementsAssignment_2_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2769:1: ( ( rule__AttributeElementBlock__ElementsAssignment_2_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2769:1: ( ( rule__AttributeElementBlock__ElementsAssignment_2_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2770:1: ( rule__AttributeElementBlock__ElementsAssignment_2_0 )
            {
             before(grammarAccess.getAttributeElementBlockAccess().getElementsAssignment_2_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2771:1: ( rule__AttributeElementBlock__ElementsAssignment_2_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2771:2: rule__AttributeElementBlock__ElementsAssignment_2_0
            {
            pushFollow(FOLLOW_rule__AttributeElementBlock__ElementsAssignment_2_0_in_rule__AttributeElementBlock__Group_2__0__Impl5694);
            rule__AttributeElementBlock__ElementsAssignment_2_0();

            state._fsp--;


            }

             after(grammarAccess.getAttributeElementBlockAccess().getElementsAssignment_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementBlock__Group_2__0__Impl"


    // $ANTLR start "rule__AttributeElementBlock__Group_2__1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2781:1: rule__AttributeElementBlock__Group_2__1 : rule__AttributeElementBlock__Group_2__1__Impl ;
    public final void rule__AttributeElementBlock__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2785:1: ( rule__AttributeElementBlock__Group_2__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2786:2: rule__AttributeElementBlock__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeElementBlock__Group_2__1__Impl_in_rule__AttributeElementBlock__Group_2__15724);
            rule__AttributeElementBlock__Group_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementBlock__Group_2__1"


    // $ANTLR start "rule__AttributeElementBlock__Group_2__1__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2792:1: rule__AttributeElementBlock__Group_2__1__Impl : ( ( ',' )? ) ;
    public final void rule__AttributeElementBlock__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2796:1: ( ( ( ',' )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2797:1: ( ( ',' )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2797:1: ( ( ',' )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2798:1: ( ',' )?
            {
             before(grammarAccess.getAttributeElementBlockAccess().getCommaKeyword_2_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2799:1: ( ',' )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==40) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2800:2: ','
                    {
                    match(input,40,FOLLOW_40_in_rule__AttributeElementBlock__Group_2__1__Impl5753); 

                    }
                    break;

            }

             after(grammarAccess.getAttributeElementBlockAccess().getCommaKeyword_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementBlock__Group_2__1__Impl"


    // $ANTLR start "rule__AttributeElementList__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2815:1: rule__AttributeElementList__Group__0 : rule__AttributeElementList__Group__0__Impl rule__AttributeElementList__Group__1 ;
    public final void rule__AttributeElementList__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2819:1: ( rule__AttributeElementList__Group__0__Impl rule__AttributeElementList__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2820:2: rule__AttributeElementList__Group__0__Impl rule__AttributeElementList__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group__0__Impl_in_rule__AttributeElementList__Group__05790);
            rule__AttributeElementList__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElementList__Group__1_in_rule__AttributeElementList__Group__05793);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2827:1: rule__AttributeElementList__Group__0__Impl : ( ( rule__AttributeElementList__ElementsAssignment_0 ) ) ;
    public final void rule__AttributeElementList__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2831:1: ( ( ( rule__AttributeElementList__ElementsAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2832:1: ( ( rule__AttributeElementList__ElementsAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2832:1: ( ( rule__AttributeElementList__ElementsAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2833:1: ( rule__AttributeElementList__ElementsAssignment_0 )
            {
             before(grammarAccess.getAttributeElementListAccess().getElementsAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2834:1: ( rule__AttributeElementList__ElementsAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2834:2: rule__AttributeElementList__ElementsAssignment_0
            {
            pushFollow(FOLLOW_rule__AttributeElementList__ElementsAssignment_0_in_rule__AttributeElementList__Group__0__Impl5820);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2844:1: rule__AttributeElementList__Group__1 : rule__AttributeElementList__Group__1__Impl ;
    public final void rule__AttributeElementList__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2848:1: ( rule__AttributeElementList__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2849:2: rule__AttributeElementList__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group__1__Impl_in_rule__AttributeElementList__Group__15850);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2855:1: rule__AttributeElementList__Group__1__Impl : ( ( rule__AttributeElementList__Group_1__0 )* ) ;
    public final void rule__AttributeElementList__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2859:1: ( ( ( rule__AttributeElementList__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2860:1: ( ( rule__AttributeElementList__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2860:1: ( ( rule__AttributeElementList__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2861:1: ( rule__AttributeElementList__Group_1__0 )*
            {
             before(grammarAccess.getAttributeElementListAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2862:1: ( rule__AttributeElementList__Group_1__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==40) ) {
                    int LA26_2 = input.LA(2);

                    if ( (LA26_2==RULE_NAME_TOKEN||(LA26_2>=15 && LA26_2<=17)) ) {
                        alt26=1;
                    }


                }


                switch (alt26) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2862:2: rule__AttributeElementList__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__AttributeElementList__Group_1__0_in_rule__AttributeElementList__Group__1__Impl5877);
            	    rule__AttributeElementList__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop26;
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2876:1: rule__AttributeElementList__Group_1__0 : rule__AttributeElementList__Group_1__0__Impl rule__AttributeElementList__Group_1__1 ;
    public final void rule__AttributeElementList__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2880:1: ( rule__AttributeElementList__Group_1__0__Impl rule__AttributeElementList__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2881:2: rule__AttributeElementList__Group_1__0__Impl rule__AttributeElementList__Group_1__1
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group_1__0__Impl_in_rule__AttributeElementList__Group_1__05912);
            rule__AttributeElementList__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElementList__Group_1__1_in_rule__AttributeElementList__Group_1__05915);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2888:1: rule__AttributeElementList__Group_1__0__Impl : ( ',' ) ;
    public final void rule__AttributeElementList__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2892:1: ( ( ',' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2893:1: ( ',' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2893:1: ( ',' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2894:1: ','
            {
             before(grammarAccess.getAttributeElementListAccess().getCommaKeyword_1_0()); 
            match(input,40,FOLLOW_40_in_rule__AttributeElementList__Group_1__0__Impl5943); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2907:1: rule__AttributeElementList__Group_1__1 : rule__AttributeElementList__Group_1__1__Impl ;
    public final void rule__AttributeElementList__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2911:1: ( rule__AttributeElementList__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2912:2: rule__AttributeElementList__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeElementList__Group_1__1__Impl_in_rule__AttributeElementList__Group_1__15974);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2918:1: rule__AttributeElementList__Group_1__1__Impl : ( ( rule__AttributeElementList__ElementsAssignment_1_1 ) ) ;
    public final void rule__AttributeElementList__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2922:1: ( ( ( rule__AttributeElementList__ElementsAssignment_1_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2923:1: ( ( rule__AttributeElementList__ElementsAssignment_1_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2923:1: ( ( rule__AttributeElementList__ElementsAssignment_1_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2924:1: ( rule__AttributeElementList__ElementsAssignment_1_1 )
            {
             before(grammarAccess.getAttributeElementListAccess().getElementsAssignment_1_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2925:1: ( rule__AttributeElementList__ElementsAssignment_1_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2925:2: rule__AttributeElementList__ElementsAssignment_1_1
            {
            pushFollow(FOLLOW_rule__AttributeElementList__ElementsAssignment_1_1_in_rule__AttributeElementList__Group_1__1__Impl6001);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2939:1: rule__AttributeElement__Group__0 : rule__AttributeElement__Group__0__Impl rule__AttributeElement__Group__1 ;
    public final void rule__AttributeElement__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2943:1: ( rule__AttributeElement__Group__0__Impl rule__AttributeElement__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2944:2: rule__AttributeElement__Group__0__Impl rule__AttributeElement__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeElement__Group__0__Impl_in_rule__AttributeElement__Group__06035);
            rule__AttributeElement__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElement__Group__1_in_rule__AttributeElement__Group__06038);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2951:1: rule__AttributeElement__Group__0__Impl : ( ( rule__AttributeElement__NameAssignment_0 ) ) ;
    public final void rule__AttributeElement__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2955:1: ( ( ( rule__AttributeElement__NameAssignment_0 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2956:1: ( ( rule__AttributeElement__NameAssignment_0 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2956:1: ( ( rule__AttributeElement__NameAssignment_0 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2957:1: ( rule__AttributeElement__NameAssignment_0 )
            {
             before(grammarAccess.getAttributeElementAccess().getNameAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2958:1: ( rule__AttributeElement__NameAssignment_0 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2958:2: rule__AttributeElement__NameAssignment_0
            {
            pushFollow(FOLLOW_rule__AttributeElement__NameAssignment_0_in_rule__AttributeElement__Group__0__Impl6065);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2968:1: rule__AttributeElement__Group__1 : rule__AttributeElement__Group__1__Impl rule__AttributeElement__Group__2 ;
    public final void rule__AttributeElement__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2972:1: ( rule__AttributeElement__Group__1__Impl rule__AttributeElement__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2973:2: rule__AttributeElement__Group__1__Impl rule__AttributeElement__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeElement__Group__1__Impl_in_rule__AttributeElement__Group__16095);
            rule__AttributeElement__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeElement__Group__2_in_rule__AttributeElement__Group__16098);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2980:1: rule__AttributeElement__Group__1__Impl : ( '=' ) ;
    public final void rule__AttributeElement__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2984:1: ( ( '=' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2985:1: ( '=' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2985:1: ( '=' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2986:1: '='
            {
             before(grammarAccess.getAttributeElementAccess().getEqualsSignKeyword_1()); 
            match(input,32,FOLLOW_32_in_rule__AttributeElement__Group__1__Impl6126); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:2999:1: rule__AttributeElement__Group__2 : rule__AttributeElement__Group__2__Impl ;
    public final void rule__AttributeElement__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3003:1: ( rule__AttributeElement__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3004:2: rule__AttributeElement__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__AttributeElement__Group__2__Impl_in_rule__AttributeElement__Group__26157);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3010:1: rule__AttributeElement__Group__2__Impl : ( ( rule__AttributeElement__ValueAssignment_2 ) ) ;
    public final void rule__AttributeElement__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3014:1: ( ( ( rule__AttributeElement__ValueAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3015:1: ( ( rule__AttributeElement__ValueAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3015:1: ( ( rule__AttributeElement__ValueAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3016:1: ( rule__AttributeElement__ValueAssignment_2 )
            {
             before(grammarAccess.getAttributeElementAccess().getValueAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3017:1: ( rule__AttributeElement__ValueAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3017:2: rule__AttributeElement__ValueAssignment_2
            {
            pushFollow(FOLLOW_rule__AttributeElement__ValueAssignment_2_in_rule__AttributeElement__Group__2__Impl6184);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3033:1: rule__AttributeValueArray__Group__0 : rule__AttributeValueArray__Group__0__Impl rule__AttributeValueArray__Group__1 ;
    public final void rule__AttributeValueArray__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3037:1: ( rule__AttributeValueArray__Group__0__Impl rule__AttributeValueArray__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3038:2: rule__AttributeValueArray__Group__0__Impl rule__AttributeValueArray__Group__1
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__0__Impl_in_rule__AttributeValueArray__Group__06220);
            rule__AttributeValueArray__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group__1_in_rule__AttributeValueArray__Group__06223);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3045:1: rule__AttributeValueArray__Group__0__Impl : ( '{' ) ;
    public final void rule__AttributeValueArray__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3049:1: ( ( '{' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3050:1: ( '{' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3050:1: ( '{' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3051:1: '{'
            {
             before(grammarAccess.getAttributeValueArrayAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,34,FOLLOW_34_in_rule__AttributeValueArray__Group__0__Impl6251); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3064:1: rule__AttributeValueArray__Group__1 : rule__AttributeValueArray__Group__1__Impl rule__AttributeValueArray__Group__2 ;
    public final void rule__AttributeValueArray__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3068:1: ( rule__AttributeValueArray__Group__1__Impl rule__AttributeValueArray__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3069:2: rule__AttributeValueArray__Group__1__Impl rule__AttributeValueArray__Group__2
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__1__Impl_in_rule__AttributeValueArray__Group__16282);
            rule__AttributeValueArray__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group__2_in_rule__AttributeValueArray__Group__16285);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3076:1: rule__AttributeValueArray__Group__1__Impl : ( ( rule__AttributeValueArray__ElementsAssignment_1 ) ) ;
    public final void rule__AttributeValueArray__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3080:1: ( ( ( rule__AttributeValueArray__ElementsAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3081:1: ( ( rule__AttributeValueArray__ElementsAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3081:1: ( ( rule__AttributeValueArray__ElementsAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3082:1: ( rule__AttributeValueArray__ElementsAssignment_1 )
            {
             before(grammarAccess.getAttributeValueArrayAccess().getElementsAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3083:1: ( rule__AttributeValueArray__ElementsAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3083:2: rule__AttributeValueArray__ElementsAssignment_1
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__ElementsAssignment_1_in_rule__AttributeValueArray__Group__1__Impl6312);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3093:1: rule__AttributeValueArray__Group__2 : rule__AttributeValueArray__Group__2__Impl rule__AttributeValueArray__Group__3 ;
    public final void rule__AttributeValueArray__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3097:1: ( rule__AttributeValueArray__Group__2__Impl rule__AttributeValueArray__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3098:2: rule__AttributeValueArray__Group__2__Impl rule__AttributeValueArray__Group__3
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__2__Impl_in_rule__AttributeValueArray__Group__26342);
            rule__AttributeValueArray__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group__3_in_rule__AttributeValueArray__Group__26345);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3105:1: rule__AttributeValueArray__Group__2__Impl : ( ( rule__AttributeValueArray__Group_2__0 )* ) ;
    public final void rule__AttributeValueArray__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3109:1: ( ( ( rule__AttributeValueArray__Group_2__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3110:1: ( ( rule__AttributeValueArray__Group_2__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3110:1: ( ( rule__AttributeValueArray__Group_2__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3111:1: ( rule__AttributeValueArray__Group_2__0 )*
            {
             before(grammarAccess.getAttributeValueArrayAccess().getGroup_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3112:1: ( rule__AttributeValueArray__Group_2__0 )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==40) ) {
                    int LA27_1 = input.LA(2);

                    if ( ((LA27_1>=RULE_STRING && LA27_1<=RULE_DECIMAL)||(LA27_1>=15 && LA27_1<=17)||(LA27_1>=29 && LA27_1<=30)||LA27_1==34) ) {
                        alt27=1;
                    }


                }


                switch (alt27) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3112:2: rule__AttributeValueArray__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__AttributeValueArray__Group_2__0_in_rule__AttributeValueArray__Group__2__Impl6372);
            	    rule__AttributeValueArray__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop27;
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3122:1: rule__AttributeValueArray__Group__3 : rule__AttributeValueArray__Group__3__Impl rule__AttributeValueArray__Group__4 ;
    public final void rule__AttributeValueArray__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3126:1: ( rule__AttributeValueArray__Group__3__Impl rule__AttributeValueArray__Group__4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3127:2: rule__AttributeValueArray__Group__3__Impl rule__AttributeValueArray__Group__4
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__3__Impl_in_rule__AttributeValueArray__Group__36403);
            rule__AttributeValueArray__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group__4_in_rule__AttributeValueArray__Group__36406);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3134:1: rule__AttributeValueArray__Group__3__Impl : ( ( ',' )? ) ;
    public final void rule__AttributeValueArray__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3138:1: ( ( ( ',' )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3139:1: ( ( ',' )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3139:1: ( ( ',' )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3140:1: ( ',' )?
            {
             before(grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3141:1: ( ',' )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==40) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3142:2: ','
                    {
                    match(input,40,FOLLOW_40_in_rule__AttributeValueArray__Group__3__Impl6435); 

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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3153:1: rule__AttributeValueArray__Group__4 : rule__AttributeValueArray__Group__4__Impl ;
    public final void rule__AttributeValueArray__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3157:1: ( rule__AttributeValueArray__Group__4__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3158:2: rule__AttributeValueArray__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group__4__Impl_in_rule__AttributeValueArray__Group__46468);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3164:1: rule__AttributeValueArray__Group__4__Impl : ( '}' ) ;
    public final void rule__AttributeValueArray__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3168:1: ( ( '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3169:1: ( '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3169:1: ( '}' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3170:1: '}'
            {
             before(grammarAccess.getAttributeValueArrayAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_35_in_rule__AttributeValueArray__Group__4__Impl6496); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3193:1: rule__AttributeValueArray__Group_2__0 : rule__AttributeValueArray__Group_2__0__Impl rule__AttributeValueArray__Group_2__1 ;
    public final void rule__AttributeValueArray__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3197:1: ( rule__AttributeValueArray__Group_2__0__Impl rule__AttributeValueArray__Group_2__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3198:2: rule__AttributeValueArray__Group_2__0__Impl rule__AttributeValueArray__Group_2__1
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group_2__0__Impl_in_rule__AttributeValueArray__Group_2__06537);
            rule__AttributeValueArray__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__AttributeValueArray__Group_2__1_in_rule__AttributeValueArray__Group_2__06540);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3205:1: rule__AttributeValueArray__Group_2__0__Impl : ( ',' ) ;
    public final void rule__AttributeValueArray__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3209:1: ( ( ',' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3210:1: ( ',' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3210:1: ( ',' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3211:1: ','
            {
             before(grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_2_0()); 
            match(input,40,FOLLOW_40_in_rule__AttributeValueArray__Group_2__0__Impl6568); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3224:1: rule__AttributeValueArray__Group_2__1 : rule__AttributeValueArray__Group_2__1__Impl ;
    public final void rule__AttributeValueArray__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3228:1: ( rule__AttributeValueArray__Group_2__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3229:2: rule__AttributeValueArray__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__Group_2__1__Impl_in_rule__AttributeValueArray__Group_2__16599);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3235:1: rule__AttributeValueArray__Group_2__1__Impl : ( ( rule__AttributeValueArray__ElementsAssignment_2_1 ) ) ;
    public final void rule__AttributeValueArray__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3239:1: ( ( ( rule__AttributeValueArray__ElementsAssignment_2_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3240:1: ( ( rule__AttributeValueArray__ElementsAssignment_2_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3240:1: ( ( rule__AttributeValueArray__ElementsAssignment_2_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3241:1: ( rule__AttributeValueArray__ElementsAssignment_2_1 )
            {
             before(grammarAccess.getAttributeValueArrayAccess().getElementsAssignment_2_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3242:1: ( rule__AttributeValueArray__ElementsAssignment_2_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3242:2: rule__AttributeValueArray__ElementsAssignment_2_1
            {
            pushFollow(FOLLOW_rule__AttributeValueArray__ElementsAssignment_2_1_in_rule__AttributeValueArray__Group_2__1__Impl6626);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3256:1: rule__Grouping__Group__0 : rule__Grouping__Group__0__Impl rule__Grouping__Group__1 ;
    public final void rule__Grouping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3260:1: ( rule__Grouping__Group__0__Impl rule__Grouping__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3261:2: rule__Grouping__Group__0__Impl rule__Grouping__Group__1
            {
            pushFollow(FOLLOW_rule__Grouping__Group__0__Impl_in_rule__Grouping__Group__06660);
            rule__Grouping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group__1_in_rule__Grouping__Group__06663);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3268:1: rule__Grouping__Group__0__Impl : ( '%' ) ;
    public final void rule__Grouping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3272:1: ( ( '%' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3273:1: ( '%' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3273:1: ( '%' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3274:1: '%'
            {
             before(grammarAccess.getGroupingAccess().getPercentSignKeyword_0()); 
            match(input,41,FOLLOW_41_in_rule__Grouping__Group__0__Impl6691); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3287:1: rule__Grouping__Group__1 : rule__Grouping__Group__1__Impl rule__Grouping__Group__2 ;
    public final void rule__Grouping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3291:1: ( rule__Grouping__Group__1__Impl rule__Grouping__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3292:2: rule__Grouping__Group__1__Impl rule__Grouping__Group__2
            {
            pushFollow(FOLLOW_rule__Grouping__Group__1__Impl_in_rule__Grouping__Group__16722);
            rule__Grouping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group__2_in_rule__Grouping__Group__16725);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3299:1: rule__Grouping__Group__1__Impl : ( ( rule__Grouping__NameAssignment_1 ) ) ;
    public final void rule__Grouping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3303:1: ( ( ( rule__Grouping__NameAssignment_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3304:1: ( ( rule__Grouping__NameAssignment_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3304:1: ( ( rule__Grouping__NameAssignment_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3305:1: ( rule__Grouping__NameAssignment_1 )
            {
             before(grammarAccess.getGroupingAccess().getNameAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3306:1: ( rule__Grouping__NameAssignment_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3306:2: rule__Grouping__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Grouping__NameAssignment_1_in_rule__Grouping__Group__1__Impl6752);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3316:1: rule__Grouping__Group__2 : rule__Grouping__Group__2__Impl ;
    public final void rule__Grouping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3320:1: ( rule__Grouping__Group__2__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3321:2: rule__Grouping__Group__2__Impl
            {
            pushFollow(FOLLOW_rule__Grouping__Group__2__Impl_in_rule__Grouping__Group__26782);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3327:1: rule__Grouping__Group__2__Impl : ( ( rule__Grouping__Group_2__0 )* ) ;
    public final void rule__Grouping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3331:1: ( ( ( rule__Grouping__Group_2__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3332:1: ( ( rule__Grouping__Group_2__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3332:1: ( ( rule__Grouping__Group_2__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3333:1: ( rule__Grouping__Group_2__0 )*
            {
             before(grammarAccess.getGroupingAccess().getGroup_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3334:1: ( rule__Grouping__Group_2__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==40) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3334:2: rule__Grouping__Group_2__0
            	    {
            	    pushFollow(FOLLOW_rule__Grouping__Group_2__0_in_rule__Grouping__Group__2__Impl6809);
            	    rule__Grouping__Group_2__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3350:1: rule__Grouping__Group_2__0 : rule__Grouping__Group_2__0__Impl rule__Grouping__Group_2__1 ;
    public final void rule__Grouping__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3354:1: ( rule__Grouping__Group_2__0__Impl rule__Grouping__Group_2__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3355:2: rule__Grouping__Group_2__0__Impl rule__Grouping__Group_2__1
            {
            pushFollow(FOLLOW_rule__Grouping__Group_2__0__Impl_in_rule__Grouping__Group_2__06846);
            rule__Grouping__Group_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Grouping__Group_2__1_in_rule__Grouping__Group_2__06849);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3362:1: rule__Grouping__Group_2__0__Impl : ( ',' ) ;
    public final void rule__Grouping__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3366:1: ( ( ',' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3367:1: ( ',' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3367:1: ( ',' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3368:1: ','
            {
             before(grammarAccess.getGroupingAccess().getCommaKeyword_2_0()); 
            match(input,40,FOLLOW_40_in_rule__Grouping__Group_2__0__Impl6877); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3381:1: rule__Grouping__Group_2__1 : rule__Grouping__Group_2__1__Impl ;
    public final void rule__Grouping__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3385:1: ( rule__Grouping__Group_2__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3386:2: rule__Grouping__Group_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Grouping__Group_2__1__Impl_in_rule__Grouping__Group_2__16908);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3392:1: rule__Grouping__Group_2__1__Impl : ( ( rule__Grouping__NameAssignment_2_1 ) ) ;
    public final void rule__Grouping__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3396:1: ( ( ( rule__Grouping__NameAssignment_2_1 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3397:1: ( ( rule__Grouping__NameAssignment_2_1 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3397:1: ( ( rule__Grouping__NameAssignment_2_1 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3398:1: ( rule__Grouping__NameAssignment_2_1 )
            {
             before(grammarAccess.getGroupingAccess().getNameAssignment_2_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3399:1: ( rule__Grouping__NameAssignment_2_1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3399:2: rule__Grouping__NameAssignment_2_1
            {
            pushFollow(FOLLOW_rule__Grouping__NameAssignment_2_1_in_rule__Grouping__Group_2__1__Impl6935);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3413:1: rule__ModelMapping__Group__0 : rule__ModelMapping__Group__0__Impl rule__ModelMapping__Group__1 ;
    public final void rule__ModelMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3417:1: ( rule__ModelMapping__Group__0__Impl rule__ModelMapping__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3418:2: rule__ModelMapping__Group__0__Impl rule__ModelMapping__Group__1
            {
            pushFollow(FOLLOW_rule__ModelMapping__Group__0__Impl_in_rule__ModelMapping__Group__06969);
            rule__ModelMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelMapping__Group__1_in_rule__ModelMapping__Group__06972);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3425:1: rule__ModelMapping__Group__0__Impl : ( '->' ) ;
    public final void rule__ModelMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3429:1: ( ( '->' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3430:1: ( '->' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3430:1: ( '->' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3431:1: '->'
            {
             before(grammarAccess.getModelMappingAccess().getHyphenMinusGreaterThanSignKeyword_0()); 
            match(input,13,FOLLOW_13_in_rule__ModelMapping__Group__0__Impl7000); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3444:1: rule__ModelMapping__Group__1 : rule__ModelMapping__Group__1__Impl rule__ModelMapping__Group__2 ;
    public final void rule__ModelMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3448:1: ( rule__ModelMapping__Group__1__Impl rule__ModelMapping__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3449:2: rule__ModelMapping__Group__1__Impl rule__ModelMapping__Group__2
            {
            pushFollow(FOLLOW_rule__ModelMapping__Group__1__Impl_in_rule__ModelMapping__Group__17031);
            rule__ModelMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelMapping__Group__2_in_rule__ModelMapping__Group__17034);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3456:1: rule__ModelMapping__Group__1__Impl : ( '{' ) ;
    public final void rule__ModelMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3460:1: ( ( '{' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3461:1: ( '{' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3461:1: ( '{' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3462:1: '{'
            {
             before(grammarAccess.getModelMappingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__ModelMapping__Group__1__Impl7062); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3475:1: rule__ModelMapping__Group__2 : rule__ModelMapping__Group__2__Impl rule__ModelMapping__Group__3 ;
    public final void rule__ModelMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3479:1: ( rule__ModelMapping__Group__2__Impl rule__ModelMapping__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3480:2: rule__ModelMapping__Group__2__Impl rule__ModelMapping__Group__3
            {
            pushFollow(FOLLOW_rule__ModelMapping__Group__2__Impl_in_rule__ModelMapping__Group__27093);
            rule__ModelMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelMapping__Group__3_in_rule__ModelMapping__Group__27096);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3487:1: rule__ModelMapping__Group__2__Impl : ( () ) ;
    public final void rule__ModelMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3491:1: ( ( () ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3492:1: ( () )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3492:1: ( () )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3493:1: ()
            {
             before(grammarAccess.getModelMappingAccess().getModelMappingAction_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3494:1: ()
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3496:1: 
            {
            }

             after(grammarAccess.getModelMappingAccess().getModelMappingAction_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelMapping__Group__2__Impl"


    // $ANTLR start "rule__ModelMapping__Group__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3506:1: rule__ModelMapping__Group__3 : rule__ModelMapping__Group__3__Impl rule__ModelMapping__Group__4 ;
    public final void rule__ModelMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3510:1: ( rule__ModelMapping__Group__3__Impl rule__ModelMapping__Group__4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3511:2: rule__ModelMapping__Group__3__Impl rule__ModelMapping__Group__4
            {
            pushFollow(FOLLOW_rule__ModelMapping__Group__3__Impl_in_rule__ModelMapping__Group__37154);
            rule__ModelMapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelMapping__Group__4_in_rule__ModelMapping__Group__37157);
            rule__ModelMapping__Group__4();

            state._fsp--;


            }

        }
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3518:1: rule__ModelMapping__Group__3__Impl : ( ( rule__ModelMapping__MappingsAssignment_3 )* ) ;
    public final void rule__ModelMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3522:1: ( ( ( rule__ModelMapping__MappingsAssignment_3 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3523:1: ( ( rule__ModelMapping__MappingsAssignment_3 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3523:1: ( ( rule__ModelMapping__MappingsAssignment_3 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3524:1: ( rule__ModelMapping__MappingsAssignment_3 )*
            {
             before(grammarAccess.getModelMappingAccess().getMappingsAssignment_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3525:1: ( rule__ModelMapping__MappingsAssignment_3 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0>=RULE_STRING && LA30_0<=RULE_NAME_TOKEN)||(LA30_0>=15 && LA30_0<=17)||LA30_0==37) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3525:2: rule__ModelMapping__MappingsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ModelMapping__MappingsAssignment_3_in_rule__ModelMapping__Group__3__Impl7184);
            	    rule__ModelMapping__MappingsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

             after(grammarAccess.getModelMappingAccess().getMappingsAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__ModelMapping__Group__4"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3535:1: rule__ModelMapping__Group__4 : rule__ModelMapping__Group__4__Impl ;
    public final void rule__ModelMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3539:1: ( rule__ModelMapping__Group__4__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3540:2: rule__ModelMapping__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ModelMapping__Group__4__Impl_in_rule__ModelMapping__Group__47215);
            rule__ModelMapping__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelMapping__Group__4"


    // $ANTLR start "rule__ModelMapping__Group__4__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3546:1: rule__ModelMapping__Group__4__Impl : ( '}' ) ;
    public final void rule__ModelMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3550:1: ( ( '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3551:1: ( '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3551:1: ( '}' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3552:1: '}'
            {
             before(grammarAccess.getModelMappingAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_35_in_rule__ModelMapping__Group__4__Impl7243); 
             after(grammarAccess.getModelMappingAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelMapping__Group__4__Impl"


    // $ANTLR start "rule__PropertyMapping__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3575:1: rule__PropertyMapping__Group__0 : rule__PropertyMapping__Group__0__Impl rule__PropertyMapping__Group__1 ;
    public final void rule__PropertyMapping__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3579:1: ( rule__PropertyMapping__Group__0__Impl rule__PropertyMapping__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3580:2: rule__PropertyMapping__Group__0__Impl rule__PropertyMapping__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyMapping__Group__0__Impl_in_rule__PropertyMapping__Group__07284);
            rule__PropertyMapping__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyMapping__Group__1_in_rule__PropertyMapping__Group__07287);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3587:1: rule__PropertyMapping__Group__0__Impl : ( ( rule__PropertyMapping__DescriptionAssignment_0 )? ) ;
    public final void rule__PropertyMapping__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3591:1: ( ( ( rule__PropertyMapping__DescriptionAssignment_0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3592:1: ( ( rule__PropertyMapping__DescriptionAssignment_0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3592:1: ( ( rule__PropertyMapping__DescriptionAssignment_0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3593:1: ( rule__PropertyMapping__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getPropertyMappingAccess().getDescriptionAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3594:1: ( rule__PropertyMapping__DescriptionAssignment_0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_STRING) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3594:2: rule__PropertyMapping__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PropertyMapping__DescriptionAssignment_0_in_rule__PropertyMapping__Group__0__Impl7314);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3604:1: rule__PropertyMapping__Group__1 : rule__PropertyMapping__Group__1__Impl rule__PropertyMapping__Group__2 ;
    public final void rule__PropertyMapping__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3608:1: ( rule__PropertyMapping__Group__1__Impl rule__PropertyMapping__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3609:2: rule__PropertyMapping__Group__1__Impl rule__PropertyMapping__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyMapping__Group__1__Impl_in_rule__PropertyMapping__Group__17345);
            rule__PropertyMapping__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyMapping__Group__2_in_rule__PropertyMapping__Group__17348);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3616:1: rule__PropertyMapping__Group__1__Impl : ( ( rule__PropertyMapping__AttributesAssignment_1 )? ) ;
    public final void rule__PropertyMapping__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3620:1: ( ( ( rule__PropertyMapping__AttributesAssignment_1 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3621:1: ( ( rule__PropertyMapping__AttributesAssignment_1 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3621:1: ( ( rule__PropertyMapping__AttributesAssignment_1 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3622:1: ( rule__PropertyMapping__AttributesAssignment_1 )?
            {
             before(grammarAccess.getPropertyMappingAccess().getAttributesAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3623:1: ( rule__PropertyMapping__AttributesAssignment_1 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==37) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3623:2: rule__PropertyMapping__AttributesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PropertyMapping__AttributesAssignment_1_in_rule__PropertyMapping__Group__1__Impl7375);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3633:1: rule__PropertyMapping__Group__2 : rule__PropertyMapping__Group__2__Impl rule__PropertyMapping__Group__3 ;
    public final void rule__PropertyMapping__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3637:1: ( rule__PropertyMapping__Group__2__Impl rule__PropertyMapping__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3638:2: rule__PropertyMapping__Group__2__Impl rule__PropertyMapping__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyMapping__Group__2__Impl_in_rule__PropertyMapping__Group__27406);
            rule__PropertyMapping__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyMapping__Group__3_in_rule__PropertyMapping__Group__27409);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3645:1: rule__PropertyMapping__Group__2__Impl : ( ( rule__PropertyMapping__FromAssignment_2 ) ) ;
    public final void rule__PropertyMapping__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3649:1: ( ( ( rule__PropertyMapping__FromAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3650:1: ( ( rule__PropertyMapping__FromAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3650:1: ( ( rule__PropertyMapping__FromAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3651:1: ( rule__PropertyMapping__FromAssignment_2 )
            {
             before(grammarAccess.getPropertyMappingAccess().getFromAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3652:1: ( rule__PropertyMapping__FromAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3652:2: rule__PropertyMapping__FromAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyMapping__FromAssignment_2_in_rule__PropertyMapping__Group__2__Impl7436);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3662:1: rule__PropertyMapping__Group__3 : rule__PropertyMapping__Group__3__Impl rule__PropertyMapping__Group__4 ;
    public final void rule__PropertyMapping__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3666:1: ( rule__PropertyMapping__Group__3__Impl rule__PropertyMapping__Group__4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3667:2: rule__PropertyMapping__Group__3__Impl rule__PropertyMapping__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyMapping__Group__3__Impl_in_rule__PropertyMapping__Group__37466);
            rule__PropertyMapping__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyMapping__Group__4_in_rule__PropertyMapping__Group__37469);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3674:1: rule__PropertyMapping__Group__3__Impl : ( '->' ) ;
    public final void rule__PropertyMapping__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3678:1: ( ( '->' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3679:1: ( '->' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3679:1: ( '->' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3680:1: '->'
            {
             before(grammarAccess.getPropertyMappingAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            match(input,13,FOLLOW_13_in_rule__PropertyMapping__Group__3__Impl7497); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3693:1: rule__PropertyMapping__Group__4 : rule__PropertyMapping__Group__4__Impl rule__PropertyMapping__Group__5 ;
    public final void rule__PropertyMapping__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3697:1: ( rule__PropertyMapping__Group__4__Impl rule__PropertyMapping__Group__5 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3698:2: rule__PropertyMapping__Group__4__Impl rule__PropertyMapping__Group__5
            {
            pushFollow(FOLLOW_rule__PropertyMapping__Group__4__Impl_in_rule__PropertyMapping__Group__47528);
            rule__PropertyMapping__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyMapping__Group__5_in_rule__PropertyMapping__Group__47531);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3705:1: rule__PropertyMapping__Group__4__Impl : ( ( rule__PropertyMapping__NameAssignment_4 ) ) ;
    public final void rule__PropertyMapping__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3709:1: ( ( ( rule__PropertyMapping__NameAssignment_4 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3710:1: ( ( rule__PropertyMapping__NameAssignment_4 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3710:1: ( ( rule__PropertyMapping__NameAssignment_4 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3711:1: ( rule__PropertyMapping__NameAssignment_4 )
            {
             before(grammarAccess.getPropertyMappingAccess().getNameAssignment_4()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3712:1: ( rule__PropertyMapping__NameAssignment_4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3712:2: rule__PropertyMapping__NameAssignment_4
            {
            pushFollow(FOLLOW_rule__PropertyMapping__NameAssignment_4_in_rule__PropertyMapping__Group__4__Impl7558);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3722:1: rule__PropertyMapping__Group__5 : rule__PropertyMapping__Group__5__Impl ;
    public final void rule__PropertyMapping__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3726:1: ( rule__PropertyMapping__Group__5__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3727:2: rule__PropertyMapping__Group__5__Impl
            {
            pushFollow(FOLLOW_rule__PropertyMapping__Group__5__Impl_in_rule__PropertyMapping__Group__57588);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3733:1: rule__PropertyMapping__Group__5__Impl : ( ';' ) ;
    public final void rule__PropertyMapping__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3737:1: ( ( ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3738:1: ( ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3738:1: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3739:1: ';'
            {
             before(grammarAccess.getPropertyMappingAccess().getSemicolonKeyword_5()); 
            match(input,31,FOLLOW_31_in_rule__PropertyMapping__Group__5__Impl7616); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3764:1: rule__ModelFolding__Group__0 : rule__ModelFolding__Group__0__Impl rule__ModelFolding__Group__1 ;
    public final void rule__ModelFolding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3768:1: ( rule__ModelFolding__Group__0__Impl rule__ModelFolding__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3769:2: rule__ModelFolding__Group__0__Impl rule__ModelFolding__Group__1
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__0__Impl_in_rule__ModelFolding__Group__07659);
            rule__ModelFolding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelFolding__Group__1_in_rule__ModelFolding__Group__07662);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3776:1: rule__ModelFolding__Group__0__Impl : ( '=>' ) ;
    public final void rule__ModelFolding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3780:1: ( ( '=>' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3781:1: ( '=>' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3781:1: ( '=>' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3782:1: '=>'
            {
             before(grammarAccess.getModelFoldingAccess().getEqualsSignGreaterThanSignKeyword_0()); 
            match(input,14,FOLLOW_14_in_rule__ModelFolding__Group__0__Impl7690); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3795:1: rule__ModelFolding__Group__1 : rule__ModelFolding__Group__1__Impl rule__ModelFolding__Group__2 ;
    public final void rule__ModelFolding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3799:1: ( rule__ModelFolding__Group__1__Impl rule__ModelFolding__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3800:2: rule__ModelFolding__Group__1__Impl rule__ModelFolding__Group__2
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__1__Impl_in_rule__ModelFolding__Group__17721);
            rule__ModelFolding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelFolding__Group__2_in_rule__ModelFolding__Group__17724);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3807:1: rule__ModelFolding__Group__1__Impl : ( '{' ) ;
    public final void rule__ModelFolding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3811:1: ( ( '{' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3812:1: ( '{' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3812:1: ( '{' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3813:1: '{'
            {
             before(grammarAccess.getModelFoldingAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,34,FOLLOW_34_in_rule__ModelFolding__Group__1__Impl7752); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3826:1: rule__ModelFolding__Group__2 : rule__ModelFolding__Group__2__Impl rule__ModelFolding__Group__3 ;
    public final void rule__ModelFolding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3830:1: ( rule__ModelFolding__Group__2__Impl rule__ModelFolding__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3831:2: rule__ModelFolding__Group__2__Impl rule__ModelFolding__Group__3
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__2__Impl_in_rule__ModelFolding__Group__27783);
            rule__ModelFolding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelFolding__Group__3_in_rule__ModelFolding__Group__27786);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3838:1: rule__ModelFolding__Group__2__Impl : ( () ) ;
    public final void rule__ModelFolding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3842:1: ( ( () ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3843:1: ( () )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3843:1: ( () )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3844:1: ()
            {
             before(grammarAccess.getModelFoldingAccess().getModelFoldingAction_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3845:1: ()
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3847:1: 
            {
            }

             after(grammarAccess.getModelFoldingAccess().getModelFoldingAction_2()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFolding__Group__2__Impl"


    // $ANTLR start "rule__ModelFolding__Group__3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3857:1: rule__ModelFolding__Group__3 : rule__ModelFolding__Group__3__Impl rule__ModelFolding__Group__4 ;
    public final void rule__ModelFolding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3861:1: ( rule__ModelFolding__Group__3__Impl rule__ModelFolding__Group__4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3862:2: rule__ModelFolding__Group__3__Impl rule__ModelFolding__Group__4
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__3__Impl_in_rule__ModelFolding__Group__37844);
            rule__ModelFolding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__ModelFolding__Group__4_in_rule__ModelFolding__Group__37847);
            rule__ModelFolding__Group__4();

            state._fsp--;


            }

        }
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3869:1: rule__ModelFolding__Group__3__Impl : ( ( rule__ModelFolding__FoldingsAssignment_3 )* ) ;
    public final void rule__ModelFolding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3873:1: ( ( ( rule__ModelFolding__FoldingsAssignment_3 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3874:1: ( ( rule__ModelFolding__FoldingsAssignment_3 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3874:1: ( ( rule__ModelFolding__FoldingsAssignment_3 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3875:1: ( rule__ModelFolding__FoldingsAssignment_3 )*
            {
             before(grammarAccess.getModelFoldingAccess().getFoldingsAssignment_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3876:1: ( rule__ModelFolding__FoldingsAssignment_3 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0>=RULE_STRING && LA33_0<=RULE_NAME_TOKEN)||(LA33_0>=15 && LA33_0<=17)||LA33_0==37) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3876:2: rule__ModelFolding__FoldingsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__ModelFolding__FoldingsAssignment_3_in_rule__ModelFolding__Group__3__Impl7874);
            	    rule__ModelFolding__FoldingsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

             after(grammarAccess.getModelFoldingAccess().getFoldingsAssignment_3()); 

            }


            }

        }
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


    // $ANTLR start "rule__ModelFolding__Group__4"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3886:1: rule__ModelFolding__Group__4 : rule__ModelFolding__Group__4__Impl ;
    public final void rule__ModelFolding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3890:1: ( rule__ModelFolding__Group__4__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3891:2: rule__ModelFolding__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__ModelFolding__Group__4__Impl_in_rule__ModelFolding__Group__47905);
            rule__ModelFolding__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFolding__Group__4"


    // $ANTLR start "rule__ModelFolding__Group__4__Impl"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3897:1: rule__ModelFolding__Group__4__Impl : ( '}' ) ;
    public final void rule__ModelFolding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3901:1: ( ( '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3902:1: ( '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3902:1: ( '}' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3903:1: '}'
            {
             before(grammarAccess.getModelFoldingAccess().getRightCurlyBracketKeyword_4()); 
            match(input,35,FOLLOW_35_in_rule__ModelFolding__Group__4__Impl7933); 
             after(grammarAccess.getModelFoldingAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFolding__Group__4__Impl"


    // $ANTLR start "rule__PropertyFolding__Group__0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3926:1: rule__PropertyFolding__Group__0 : rule__PropertyFolding__Group__0__Impl rule__PropertyFolding__Group__1 ;
    public final void rule__PropertyFolding__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3930:1: ( rule__PropertyFolding__Group__0__Impl rule__PropertyFolding__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3931:2: rule__PropertyFolding__Group__0__Impl rule__PropertyFolding__Group__1
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__0__Impl_in_rule__PropertyFolding__Group__07974);
            rule__PropertyFolding__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__1_in_rule__PropertyFolding__Group__07977);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3938:1: rule__PropertyFolding__Group__0__Impl : ( ( rule__PropertyFolding__DescriptionAssignment_0 )? ) ;
    public final void rule__PropertyFolding__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3942:1: ( ( ( rule__PropertyFolding__DescriptionAssignment_0 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3943:1: ( ( rule__PropertyFolding__DescriptionAssignment_0 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3943:1: ( ( rule__PropertyFolding__DescriptionAssignment_0 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3944:1: ( rule__PropertyFolding__DescriptionAssignment_0 )?
            {
             before(grammarAccess.getPropertyFoldingAccess().getDescriptionAssignment_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3945:1: ( rule__PropertyFolding__DescriptionAssignment_0 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==RULE_STRING) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3945:2: rule__PropertyFolding__DescriptionAssignment_0
                    {
                    pushFollow(FOLLOW_rule__PropertyFolding__DescriptionAssignment_0_in_rule__PropertyFolding__Group__0__Impl8004);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3955:1: rule__PropertyFolding__Group__1 : rule__PropertyFolding__Group__1__Impl rule__PropertyFolding__Group__2 ;
    public final void rule__PropertyFolding__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3959:1: ( rule__PropertyFolding__Group__1__Impl rule__PropertyFolding__Group__2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3960:2: rule__PropertyFolding__Group__1__Impl rule__PropertyFolding__Group__2
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__1__Impl_in_rule__PropertyFolding__Group__18035);
            rule__PropertyFolding__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__2_in_rule__PropertyFolding__Group__18038);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3967:1: rule__PropertyFolding__Group__1__Impl : ( ( rule__PropertyFolding__AttributesAssignment_1 )? ) ;
    public final void rule__PropertyFolding__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3971:1: ( ( ( rule__PropertyFolding__AttributesAssignment_1 )? ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3972:1: ( ( rule__PropertyFolding__AttributesAssignment_1 )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3972:1: ( ( rule__PropertyFolding__AttributesAssignment_1 )? )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3973:1: ( rule__PropertyFolding__AttributesAssignment_1 )?
            {
             before(grammarAccess.getPropertyFoldingAccess().getAttributesAssignment_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3974:1: ( rule__PropertyFolding__AttributesAssignment_1 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==37) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3974:2: rule__PropertyFolding__AttributesAssignment_1
                    {
                    pushFollow(FOLLOW_rule__PropertyFolding__AttributesAssignment_1_in_rule__PropertyFolding__Group__1__Impl8065);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3984:1: rule__PropertyFolding__Group__2 : rule__PropertyFolding__Group__2__Impl rule__PropertyFolding__Group__3 ;
    public final void rule__PropertyFolding__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3988:1: ( rule__PropertyFolding__Group__2__Impl rule__PropertyFolding__Group__3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3989:2: rule__PropertyFolding__Group__2__Impl rule__PropertyFolding__Group__3
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__2__Impl_in_rule__PropertyFolding__Group__28096);
            rule__PropertyFolding__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__3_in_rule__PropertyFolding__Group__28099);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:3996:1: rule__PropertyFolding__Group__2__Impl : ( ( rule__PropertyFolding__AggregatorAssignment_2 ) ) ;
    public final void rule__PropertyFolding__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4000:1: ( ( ( rule__PropertyFolding__AggregatorAssignment_2 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4001:1: ( ( rule__PropertyFolding__AggregatorAssignment_2 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4001:1: ( ( rule__PropertyFolding__AggregatorAssignment_2 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4002:1: ( rule__PropertyFolding__AggregatorAssignment_2 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getAggregatorAssignment_2()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4003:1: ( rule__PropertyFolding__AggregatorAssignment_2 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4003:2: rule__PropertyFolding__AggregatorAssignment_2
            {
            pushFollow(FOLLOW_rule__PropertyFolding__AggregatorAssignment_2_in_rule__PropertyFolding__Group__2__Impl8126);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4013:1: rule__PropertyFolding__Group__3 : rule__PropertyFolding__Group__3__Impl rule__PropertyFolding__Group__4 ;
    public final void rule__PropertyFolding__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4017:1: ( rule__PropertyFolding__Group__3__Impl rule__PropertyFolding__Group__4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4018:2: rule__PropertyFolding__Group__3__Impl rule__PropertyFolding__Group__4
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__3__Impl_in_rule__PropertyFolding__Group__38156);
            rule__PropertyFolding__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__4_in_rule__PropertyFolding__Group__38159);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4025:1: rule__PropertyFolding__Group__3__Impl : ( ( rule__PropertyFolding__FromAssignment_3 ) ) ;
    public final void rule__PropertyFolding__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4029:1: ( ( ( rule__PropertyFolding__FromAssignment_3 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4030:1: ( ( rule__PropertyFolding__FromAssignment_3 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4030:1: ( ( rule__PropertyFolding__FromAssignment_3 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4031:1: ( rule__PropertyFolding__FromAssignment_3 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getFromAssignment_3()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4032:1: ( rule__PropertyFolding__FromAssignment_3 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4032:2: rule__PropertyFolding__FromAssignment_3
            {
            pushFollow(FOLLOW_rule__PropertyFolding__FromAssignment_3_in_rule__PropertyFolding__Group__3__Impl8186);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4042:1: rule__PropertyFolding__Group__4 : rule__PropertyFolding__Group__4__Impl rule__PropertyFolding__Group__5 ;
    public final void rule__PropertyFolding__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4046:1: ( rule__PropertyFolding__Group__4__Impl rule__PropertyFolding__Group__5 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4047:2: rule__PropertyFolding__Group__4__Impl rule__PropertyFolding__Group__5
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__4__Impl_in_rule__PropertyFolding__Group__48216);
            rule__PropertyFolding__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__5_in_rule__PropertyFolding__Group__48219);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4054:1: rule__PropertyFolding__Group__4__Impl : ( ( rule__PropertyFolding__Alternatives_4 ) ) ;
    public final void rule__PropertyFolding__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4058:1: ( ( ( rule__PropertyFolding__Alternatives_4 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4059:1: ( ( rule__PropertyFolding__Alternatives_4 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4059:1: ( ( rule__PropertyFolding__Alternatives_4 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4060:1: ( rule__PropertyFolding__Alternatives_4 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getAlternatives_4()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4061:1: ( rule__PropertyFolding__Alternatives_4 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4061:2: rule__PropertyFolding__Alternatives_4
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Alternatives_4_in_rule__PropertyFolding__Group__4__Impl8246);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4071:1: rule__PropertyFolding__Group__5 : rule__PropertyFolding__Group__5__Impl rule__PropertyFolding__Group__6 ;
    public final void rule__PropertyFolding__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4075:1: ( rule__PropertyFolding__Group__5__Impl rule__PropertyFolding__Group__6 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4076:2: rule__PropertyFolding__Group__5__Impl rule__PropertyFolding__Group__6
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__5__Impl_in_rule__PropertyFolding__Group__58276);
            rule__PropertyFolding__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__PropertyFolding__Group__6_in_rule__PropertyFolding__Group__58279);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4083:1: rule__PropertyFolding__Group__5__Impl : ( ( rule__PropertyFolding__NameAssignment_5 ) ) ;
    public final void rule__PropertyFolding__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4087:1: ( ( ( rule__PropertyFolding__NameAssignment_5 ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4088:1: ( ( rule__PropertyFolding__NameAssignment_5 ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4088:1: ( ( rule__PropertyFolding__NameAssignment_5 ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4089:1: ( rule__PropertyFolding__NameAssignment_5 )
            {
             before(grammarAccess.getPropertyFoldingAccess().getNameAssignment_5()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4090:1: ( rule__PropertyFolding__NameAssignment_5 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4090:2: rule__PropertyFolding__NameAssignment_5
            {
            pushFollow(FOLLOW_rule__PropertyFolding__NameAssignment_5_in_rule__PropertyFolding__Group__5__Impl8306);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4100:1: rule__PropertyFolding__Group__6 : rule__PropertyFolding__Group__6__Impl ;
    public final void rule__PropertyFolding__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4104:1: ( rule__PropertyFolding__Group__6__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4105:2: rule__PropertyFolding__Group__6__Impl
            {
            pushFollow(FOLLOW_rule__PropertyFolding__Group__6__Impl_in_rule__PropertyFolding__Group__68336);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4111:1: rule__PropertyFolding__Group__6__Impl : ( ';' ) ;
    public final void rule__PropertyFolding__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4115:1: ( ( ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4116:1: ( ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4116:1: ( ';' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4117:1: ';'
            {
             before(grammarAccess.getPropertyFoldingAccess().getSemicolonKeyword_6()); 
            match(input,31,FOLLOW_31_in_rule__PropertyFolding__Group__6__Impl8364); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4144:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4148:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4149:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08409);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08412);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4156:1: rule__QualifiedName__Group__0__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4160:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4161:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4161:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4162:1: ruleName
            {
             before(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__QualifiedName__Group__0__Impl8439);
            ruleName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0()); 

            }


            }

        }
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4173:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4177:1: ( rule__QualifiedName__Group__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4178:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18468);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4184:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4188:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4189:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4189:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4190:1: ( rule__QualifiedName__Group_1__0 )*
            {
             before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4191:1: ( rule__QualifiedName__Group_1__0 )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==42) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4191:2: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8495);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop36;
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4205:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4209:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4210:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08530);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08533);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4217:1: rule__QualifiedName__Group_1__0__Impl : ( '.' ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4221:1: ( ( '.' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4222:1: ( '.' )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4222:1: ( '.' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4223:1: '.'
            {
             before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            match(input,42,FOLLOW_42_in_rule__QualifiedName__Group_1__0__Impl8561); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4236:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4240:1: ( rule__QualifiedName__Group_1__1__Impl )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4241:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18592);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4247:1: rule__QualifiedName__Group_1__1__Impl : ( ruleName ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4251:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4252:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4252:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4253:1: ruleName
            {
             before(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleName_in_rule__QualifiedName__Group_1__1__Impl8619);
            ruleName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1()); 

            }


            }

        }
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4269:1: rule__Script__ListAssignment : ( ruleModelDefinition ) ;
    public final void rule__Script__ListAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4273:1: ( ( ruleModelDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4274:1: ( ruleModelDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4274:1: ( ruleModelDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4275:1: ruleModelDefinition
            {
             before(grammarAccess.getScriptAccess().getListModelDefinitionParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleModelDefinition_in_rule__Script__ListAssignment8657);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4284:1: rule__ModelDefinition__DescriptionAssignment_0 : ( ruleDescription ) ;
    public final void rule__ModelDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4288:1: ( ( ruleDescription ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4289:1: ( ruleDescription )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4289:1: ( ruleDescription )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4290:1: ruleDescription
            {
             before(grammarAccess.getModelDefinitionAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__ModelDefinition__DescriptionAssignment_08688);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4299:1: rule__ModelDefinition__AttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__ModelDefinition__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4303:1: ( ( ruleAttributeList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4304:1: ( ruleAttributeList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4304:1: ( ruleAttributeList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4305:1: ruleAttributeList
            {
             before(grammarAccess.getModelDefinitionAccess().getAttributesAttributeListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__ModelDefinition__AttributesAssignment_18719);
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


    // $ANTLR start "rule__ModelDefinition__TypeAssignment_2_0_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4314:1: rule__ModelDefinition__TypeAssignment_2_0_0 : ( ( 'projective' ) ) ;
    public final void rule__ModelDefinition__TypeAssignment_2_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4318:1: ( ( ( 'projective' ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4319:1: ( ( 'projective' ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4319:1: ( ( 'projective' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4320:1: ( 'projective' )
            {
             before(grammarAccess.getModelDefinitionAccess().getTypeProjectiveKeyword_2_0_0_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4321:1: ( 'projective' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4322:1: 'projective'
            {
             before(grammarAccess.getModelDefinitionAccess().getTypeProjectiveKeyword_2_0_0_0()); 
            match(input,15,FOLLOW_15_in_rule__ModelDefinition__TypeAssignment_2_0_08755); 
             after(grammarAccess.getModelDefinitionAccess().getTypeProjectiveKeyword_2_0_0_0()); 

            }

             after(grammarAccess.getModelDefinitionAccess().getTypeProjectiveKeyword_2_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__TypeAssignment_2_0_0"


    // $ANTLR start "rule__ModelDefinition__NameAssignment_2_0_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4337:1: rule__ModelDefinition__NameAssignment_2_0_1 : ( ruleName ) ;
    public final void rule__ModelDefinition__NameAssignment_2_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4341:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4342:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4342:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4343:1: ruleName
            {
             before(grammarAccess.getModelDefinitionAccess().getNameNameParserRuleCall_2_0_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__ModelDefinition__NameAssignment_2_0_18794);
            ruleName();

            state._fsp--;

             after(grammarAccess.getModelDefinitionAccess().getNameNameParserRuleCall_2_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__NameAssignment_2_0_1"


    // $ANTLR start "rule__ModelDefinition__RhsAssignment_2_0_3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4352:1: rule__ModelDefinition__RhsAssignment_2_0_3 : ( ruleRecordExpression ) ;
    public final void rule__ModelDefinition__RhsAssignment_2_0_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4356:1: ( ( ruleRecordExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4357:1: ( ruleRecordExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4357:1: ( ruleRecordExpression )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4358:1: ruleRecordExpression
            {
             before(grammarAccess.getModelDefinitionAccess().getRhsRecordExpressionParserRuleCall_2_0_3_0()); 
            pushFollow(FOLLOW_ruleRecordExpression_in_rule__ModelDefinition__RhsAssignment_2_0_38825);
            ruleRecordExpression();

            state._fsp--;

             after(grammarAccess.getModelDefinitionAccess().getRhsRecordExpressionParserRuleCall_2_0_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__RhsAssignment_2_0_3"


    // $ANTLR start "rule__ModelDefinition__TypeAssignment_2_1_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4367:1: rule__ModelDefinition__TypeAssignment_2_1_0 : ( ( 'joined' ) ) ;
    public final void rule__ModelDefinition__TypeAssignment_2_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4371:1: ( ( ( 'joined' ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4372:1: ( ( 'joined' ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4372:1: ( ( 'joined' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4373:1: ( 'joined' )
            {
             before(grammarAccess.getModelDefinitionAccess().getTypeJoinedKeyword_2_1_0_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4374:1: ( 'joined' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4375:1: 'joined'
            {
             before(grammarAccess.getModelDefinitionAccess().getTypeJoinedKeyword_2_1_0_0()); 
            match(input,16,FOLLOW_16_in_rule__ModelDefinition__TypeAssignment_2_1_08861); 
             after(grammarAccess.getModelDefinitionAccess().getTypeJoinedKeyword_2_1_0_0()); 

            }

             after(grammarAccess.getModelDefinitionAccess().getTypeJoinedKeyword_2_1_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__TypeAssignment_2_1_0"


    // $ANTLR start "rule__ModelDefinition__NameAssignment_2_1_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4390:1: rule__ModelDefinition__NameAssignment_2_1_1 : ( ruleName ) ;
    public final void rule__ModelDefinition__NameAssignment_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4394:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4395:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4395:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4396:1: ruleName
            {
             before(grammarAccess.getModelDefinitionAccess().getNameNameParserRuleCall_2_1_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__ModelDefinition__NameAssignment_2_1_18900);
            ruleName();

            state._fsp--;

             after(grammarAccess.getModelDefinitionAccess().getNameNameParserRuleCall_2_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__NameAssignment_2_1_1"


    // $ANTLR start "rule__ModelDefinition__RhsAssignment_2_1_3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4405:1: rule__ModelDefinition__RhsAssignment_2_1_3 : ( ruleJoinExpression ) ;
    public final void rule__ModelDefinition__RhsAssignment_2_1_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4409:1: ( ( ruleJoinExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4410:1: ( ruleJoinExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4410:1: ( ruleJoinExpression )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4411:1: ruleJoinExpression
            {
             before(grammarAccess.getModelDefinitionAccess().getRhsJoinExpressionParserRuleCall_2_1_3_0()); 
            pushFollow(FOLLOW_ruleJoinExpression_in_rule__ModelDefinition__RhsAssignment_2_1_38931);
            ruleJoinExpression();

            state._fsp--;

             after(grammarAccess.getModelDefinitionAccess().getRhsJoinExpressionParserRuleCall_2_1_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__RhsAssignment_2_1_3"


    // $ANTLR start "rule__ModelDefinition__TypeAssignment_2_2_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4420:1: rule__ModelDefinition__TypeAssignment_2_2_0 : ( ( 'summarized' ) ) ;
    public final void rule__ModelDefinition__TypeAssignment_2_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4424:1: ( ( ( 'summarized' ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4425:1: ( ( 'summarized' ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4425:1: ( ( 'summarized' ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4426:1: ( 'summarized' )
            {
             before(grammarAccess.getModelDefinitionAccess().getTypeSummarizedKeyword_2_2_0_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4427:1: ( 'summarized' )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4428:1: 'summarized'
            {
             before(grammarAccess.getModelDefinitionAccess().getTypeSummarizedKeyword_2_2_0_0()); 
            match(input,17,FOLLOW_17_in_rule__ModelDefinition__TypeAssignment_2_2_08967); 
             after(grammarAccess.getModelDefinitionAccess().getTypeSummarizedKeyword_2_2_0_0()); 

            }

             after(grammarAccess.getModelDefinitionAccess().getTypeSummarizedKeyword_2_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__TypeAssignment_2_2_0"


    // $ANTLR start "rule__ModelDefinition__NameAssignment_2_2_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4443:1: rule__ModelDefinition__NameAssignment_2_2_1 : ( ruleName ) ;
    public final void rule__ModelDefinition__NameAssignment_2_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4447:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4448:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4448:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4449:1: ruleName
            {
             before(grammarAccess.getModelDefinitionAccess().getNameNameParserRuleCall_2_2_1_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__ModelDefinition__NameAssignment_2_2_19006);
            ruleName();

            state._fsp--;

             after(grammarAccess.getModelDefinitionAccess().getNameNameParserRuleCall_2_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__NameAssignment_2_2_1"


    // $ANTLR start "rule__ModelDefinition__RhsAssignment_2_2_3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4458:1: rule__ModelDefinition__RhsAssignment_2_2_3 : ( ruleSummarizeExpression ) ;
    public final void rule__ModelDefinition__RhsAssignment_2_2_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4462:1: ( ( ruleSummarizeExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4463:1: ( ruleSummarizeExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4463:1: ( ruleSummarizeExpression )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4464:1: ruleSummarizeExpression
            {
             before(grammarAccess.getModelDefinitionAccess().getRhsSummarizeExpressionParserRuleCall_2_2_3_0()); 
            pushFollow(FOLLOW_ruleSummarizeExpression_in_rule__ModelDefinition__RhsAssignment_2_2_39037);
            ruleSummarizeExpression();

            state._fsp--;

             after(grammarAccess.getModelDefinitionAccess().getRhsSummarizeExpressionParserRuleCall_2_2_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelDefinition__RhsAssignment_2_2_3"


    // $ANTLR start "rule__RecordExpression__TermsAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4473:1: rule__RecordExpression__TermsAssignment_0 : ( ruleRecordTerm ) ;
    public final void rule__RecordExpression__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4477:1: ( ( ruleRecordTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4478:1: ( ruleRecordTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4478:1: ( ruleRecordTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4479:1: ruleRecordTerm
            {
             before(grammarAccess.getRecordExpressionAccess().getTermsRecordTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleRecordTerm_in_rule__RecordExpression__TermsAssignment_09068);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4488:1: rule__RecordExpression__TermsAssignment_1_1 : ( ruleRecordTerm ) ;
    public final void rule__RecordExpression__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4492:1: ( ( ruleRecordTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4493:1: ( ruleRecordTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4493:1: ( ruleRecordTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4494:1: ruleRecordTerm
            {
             before(grammarAccess.getRecordExpressionAccess().getTermsRecordTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleRecordTerm_in_rule__RecordExpression__TermsAssignment_1_19099);
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


    // $ANTLR start "rule__RecordTerm__PropertiesAssignment_0_2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4503:1: rule__RecordTerm__PropertiesAssignment_0_2 : ( rulePropertyDefinition ) ;
    public final void rule__RecordTerm__PropertiesAssignment_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4507:1: ( ( rulePropertyDefinition ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4508:1: ( rulePropertyDefinition )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4508:1: ( rulePropertyDefinition )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4509:1: rulePropertyDefinition
            {
             before(grammarAccess.getRecordTermAccess().getPropertiesPropertyDefinitionParserRuleCall_0_2_0()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_rule__RecordTerm__PropertiesAssignment_0_29130);
            rulePropertyDefinition();

            state._fsp--;

             after(grammarAccess.getRecordTermAccess().getPropertiesPropertyDefinitionParserRuleCall_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__RecordTerm__PropertiesAssignment_0_2"


    // $ANTLR start "rule__RecordTerm__ReferenceAssignment_1"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4518:1: rule__RecordTerm__ReferenceAssignment_1 : ( ruleModelReference ) ;
    public final void rule__RecordTerm__ReferenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4522:1: ( ( ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4523:1: ( ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4523:1: ( ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4524:1: ruleModelReference
            {
             before(grammarAccess.getRecordTermAccess().getReferenceModelReferenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModelReference_in_rule__RecordTerm__ReferenceAssignment_19161);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4533:1: rule__ModelReference__NameAssignment : ( ( ruleName ) ) ;
    public final void rule__ModelReference__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4537:1: ( ( ( ruleName ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4538:1: ( ( ruleName ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4538:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4539:1: ( ruleName )
            {
             before(grammarAccess.getModelReferenceAccess().getNameModelDefinitionCrossReference_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4540:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4541:1: ruleName
            {
             before(grammarAccess.getModelReferenceAccess().getNameModelDefinitionNameParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleName_in_rule__ModelReference__NameAssignment9196);
            ruleName();

            state._fsp--;

             after(grammarAccess.getModelReferenceAccess().getNameModelDefinitionNameParserRuleCall_0_1()); 

            }

             after(grammarAccess.getModelReferenceAccess().getNameModelDefinitionCrossReference_0()); 

            }


            }

        }
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4552:1: rule__PropertyDefinition__DescriptionAssignment_0 : ( ruleDescription ) ;
    public final void rule__PropertyDefinition__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4556:1: ( ( ruleDescription ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4557:1: ( ruleDescription )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4557:1: ( ruleDescription )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4558:1: ruleDescription
            {
             before(grammarAccess.getPropertyDefinitionAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__PropertyDefinition__DescriptionAssignment_09231);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4567:1: rule__PropertyDefinition__AttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__PropertyDefinition__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4571:1: ( ( ruleAttributeList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4572:1: ( ruleAttributeList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4572:1: ( ruleAttributeList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4573:1: ruleAttributeList
            {
             before(grammarAccess.getPropertyDefinitionAccess().getAttributesAttributeListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__PropertyDefinition__AttributesAssignment_19262);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4582:1: rule__PropertyDefinition__NameAssignment_2 : ( ruleName ) ;
    public final void rule__PropertyDefinition__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4586:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4587:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4587:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4588:1: ruleName
            {
             before(grammarAccess.getPropertyDefinitionAccess().getNameNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__PropertyDefinition__NameAssignment_29293);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4597:1: rule__PropertyDefinition__TypeAssignment_4 : ( ruleType ) ;
    public final void rule__PropertyDefinition__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4601:1: ( ( ruleType ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4602:1: ( ruleType )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4602:1: ( ruleType )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4603:1: ruleType
            {
             before(grammarAccess.getPropertyDefinitionAccess().getTypeTypeEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleType_in_rule__PropertyDefinition__TypeAssignment_49324);
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


    // $ANTLR start "rule__JoinExpression__TermsAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4612:1: rule__JoinExpression__TermsAssignment_0 : ( ruleJoinTerm ) ;
    public final void rule__JoinExpression__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4616:1: ( ( ruleJoinTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4617:1: ( ruleJoinTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4617:1: ( ruleJoinTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4618:1: ruleJoinTerm
            {
             before(grammarAccess.getJoinExpressionAccess().getTermsJoinTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleJoinTerm_in_rule__JoinExpression__TermsAssignment_09355);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4627:1: rule__JoinExpression__TermsAssignment_1_1 : ( ruleJoinTerm ) ;
    public final void rule__JoinExpression__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4631:1: ( ( ruleJoinTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4632:1: ( ruleJoinTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4632:1: ( ruleJoinTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4633:1: ruleJoinTerm
            {
             before(grammarAccess.getJoinExpressionAccess().getTermsJoinTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleJoinTerm_in_rule__JoinExpression__TermsAssignment_1_19386);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4642:1: rule__JoinTerm__ReferenceAssignment_0 : ( ruleModelReference ) ;
    public final void rule__JoinTerm__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4646:1: ( ( ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4647:1: ( ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4647:1: ( ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4648:1: ruleModelReference
            {
             before(grammarAccess.getJoinTermAccess().getReferenceModelReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleModelReference_in_rule__JoinTerm__ReferenceAssignment_09417);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4657:1: rule__JoinTerm__MappingAssignment_1 : ( ruleModelMapping ) ;
    public final void rule__JoinTerm__MappingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4661:1: ( ( ruleModelMapping ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4662:1: ( ruleModelMapping )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4662:1: ( ruleModelMapping )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4663:1: ruleModelMapping
            {
             before(grammarAccess.getJoinTermAccess().getMappingModelMappingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModelMapping_in_rule__JoinTerm__MappingAssignment_19448);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4672:1: rule__JoinTerm__GroupingAssignment_2 : ( ruleGrouping ) ;
    public final void rule__JoinTerm__GroupingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4676:1: ( ( ruleGrouping ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4677:1: ( ruleGrouping )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4677:1: ( ruleGrouping )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4678:1: ruleGrouping
            {
             before(grammarAccess.getJoinTermAccess().getGroupingGroupingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGrouping_in_rule__JoinTerm__GroupingAssignment_29479);
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


    // $ANTLR start "rule__SummarizeExpression__TermsAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4687:1: rule__SummarizeExpression__TermsAssignment_0 : ( ruleSummarizeTerm ) ;
    public final void rule__SummarizeExpression__TermsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4691:1: ( ( ruleSummarizeTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4692:1: ( ruleSummarizeTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4692:1: ( ruleSummarizeTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4693:1: ruleSummarizeTerm
            {
             before(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleSummarizeTerm_in_rule__SummarizeExpression__TermsAssignment_09510);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4702:1: rule__SummarizeExpression__TermsAssignment_1_1 : ( ruleSummarizeTerm ) ;
    public final void rule__SummarizeExpression__TermsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4706:1: ( ( ruleSummarizeTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4707:1: ( ruleSummarizeTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4707:1: ( ruleSummarizeTerm )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4708:1: ruleSummarizeTerm
            {
             before(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleSummarizeTerm_in_rule__SummarizeExpression__TermsAssignment_1_19541);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4717:1: rule__SummarizeTerm__ReferenceAssignment_0 : ( ruleModelReference ) ;
    public final void rule__SummarizeTerm__ReferenceAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4721:1: ( ( ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4722:1: ( ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4722:1: ( ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4723:1: ruleModelReference
            {
             before(grammarAccess.getSummarizeTermAccess().getReferenceModelReferenceParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleModelReference_in_rule__SummarizeTerm__ReferenceAssignment_09572);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4732:1: rule__SummarizeTerm__FoldingAssignment_1 : ( ruleModelFolding ) ;
    public final void rule__SummarizeTerm__FoldingAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4736:1: ( ( ruleModelFolding ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4737:1: ( ruleModelFolding )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4737:1: ( ruleModelFolding )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4738:1: ruleModelFolding
            {
             before(grammarAccess.getSummarizeTermAccess().getFoldingModelFoldingParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleModelFolding_in_rule__SummarizeTerm__FoldingAssignment_19603);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4747:1: rule__SummarizeTerm__GroupingAssignment_2 : ( ruleGrouping ) ;
    public final void rule__SummarizeTerm__GroupingAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4751:1: ( ( ruleGrouping ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4752:1: ( ruleGrouping )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4752:1: ( ruleGrouping )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4753:1: ruleGrouping
            {
             before(grammarAccess.getSummarizeTermAccess().getGroupingGroupingParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleGrouping_in_rule__SummarizeTerm__GroupingAssignment_29634);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4762:1: rule__AttributeList__AttributesAssignment : ( ruleAttribute ) ;
    public final void rule__AttributeList__AttributesAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4766:1: ( ( ruleAttribute ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4767:1: ( ruleAttribute )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4767:1: ( ruleAttribute )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4768:1: ruleAttribute
            {
             before(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleAttribute_in_rule__AttributeList__AttributesAssignment9665);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4777:1: rule__Attribute__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__Attribute__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4781:1: ( ( ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4782:1: ( ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4782:1: ( ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4783:1: ruleQualifiedName
            {
             before(grammarAccess.getAttributeAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__Attribute__NameAssignment_19696);
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


    // $ANTLR start "rule__Attribute__ElementBlockAssignment_2"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4792:1: rule__Attribute__ElementBlockAssignment_2 : ( ruleAttributeElementBlock ) ;
    public final void rule__Attribute__ElementBlockAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4796:1: ( ( ruleAttributeElementBlock ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4797:1: ( ruleAttributeElementBlock )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4797:1: ( ruleAttributeElementBlock )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4798:1: ruleAttributeElementBlock
            {
             before(grammarAccess.getAttributeAccess().getElementBlockAttributeElementBlockParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttributeElementBlock_in_rule__Attribute__ElementBlockAssignment_29727);
            ruleAttributeElementBlock();

            state._fsp--;

             after(grammarAccess.getAttributeAccess().getElementBlockAttributeElementBlockParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Attribute__ElementBlockAssignment_2"


    // $ANTLR start "rule__AttributeElementBlock__ElementsAssignment_2_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4807:1: rule__AttributeElementBlock__ElementsAssignment_2_0 : ( ruleAttributeElementList ) ;
    public final void rule__AttributeElementBlock__ElementsAssignment_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4811:1: ( ( ruleAttributeElementList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4812:1: ( ruleAttributeElementList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4812:1: ( ruleAttributeElementList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4813:1: ruleAttributeElementList
            {
             before(grammarAccess.getAttributeElementBlockAccess().getElementsAttributeElementListParserRuleCall_2_0_0()); 
            pushFollow(FOLLOW_ruleAttributeElementList_in_rule__AttributeElementBlock__ElementsAssignment_2_09758);
            ruleAttributeElementList();

            state._fsp--;

             after(grammarAccess.getAttributeElementBlockAccess().getElementsAttributeElementListParserRuleCall_2_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__AttributeElementBlock__ElementsAssignment_2_0"


    // $ANTLR start "rule__AttributeElementList__ElementsAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4822:1: rule__AttributeElementList__ElementsAssignment_0 : ( ruleAttributeElement ) ;
    public final void rule__AttributeElementList__ElementsAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4826:1: ( ( ruleAttributeElement ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4827:1: ( ruleAttributeElement )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4827:1: ( ruleAttributeElement )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4828:1: ruleAttributeElement
            {
             before(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttributeElement_in_rule__AttributeElementList__ElementsAssignment_09789);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4837:1: rule__AttributeElementList__ElementsAssignment_1_1 : ( ruleAttributeElement ) ;
    public final void rule__AttributeElementList__ElementsAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4841:1: ( ( ruleAttributeElement ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4842:1: ( ruleAttributeElement )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4842:1: ( ruleAttributeElement )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4843:1: ruleAttributeElement
            {
             before(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_ruleAttributeElement_in_rule__AttributeElementList__ElementsAssignment_1_19820);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4852:1: rule__AttributeElement__NameAssignment_0 : ( ruleName ) ;
    public final void rule__AttributeElement__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4856:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4857:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4857:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4858:1: ruleName
            {
             before(grammarAccess.getAttributeElementAccess().getNameNameParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__AttributeElement__NameAssignment_09851);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4867:1: rule__AttributeElement__ValueAssignment_2 : ( ruleAttributeValue ) ;
    public final void rule__AttributeElement__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4871:1: ( ( ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4872:1: ( ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4872:1: ( ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4873:1: ruleAttributeValue
            {
             before(grammarAccess.getAttributeElementAccess().getValueAttributeValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_rule__AttributeElement__ValueAssignment_29882);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4882:1: rule__AttributeValue__ValueAssignment_0 : ( ruleAttributeValueArray ) ;
    public final void rule__AttributeValue__ValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4886:1: ( ( ruleAttributeValueArray ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4887:1: ( ruleAttributeValueArray )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4887:1: ( ruleAttributeValueArray )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4888:1: ruleAttributeValueArray
            {
             before(grammarAccess.getAttributeValueAccess().getValueAttributeValueArrayParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleAttributeValueArray_in_rule__AttributeValue__ValueAssignment_09913);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4897:1: rule__AttributeValue__ValueAssignment_1 : ( ruleQualifiedNameObject ) ;
    public final void rule__AttributeValue__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4901:1: ( ( ruleQualifiedNameObject ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4902:1: ( ruleQualifiedNameObject )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4902:1: ( ruleQualifiedNameObject )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4903:1: ruleQualifiedNameObject
            {
             before(grammarAccess.getAttributeValueAccess().getValueQualifiedNameObjectParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleQualifiedNameObject_in_rule__AttributeValue__ValueAssignment_19944);
            ruleQualifiedNameObject();

            state._fsp--;

             after(grammarAccess.getAttributeValueAccess().getValueQualifiedNameObjectParserRuleCall_1_0()); 

            }


            }

        }
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4912:1: rule__AttributeValue__ValueAssignment_2 : ( ruleLiteral ) ;
    public final void rule__AttributeValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4916:1: ( ( ruleLiteral ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4917:1: ( ruleLiteral )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4917:1: ( ruleLiteral )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4918:1: ruleLiteral
            {
             before(grammarAccess.getAttributeValueAccess().getValueLiteralParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleLiteral_in_rule__AttributeValue__ValueAssignment_29975);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4927:1: rule__AttributeValueArray__ElementsAssignment_1 : ( ruleAttributeValue ) ;
    public final void rule__AttributeValueArray__ElementsAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4931:1: ( ( ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4932:1: ( ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4932:1: ( ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4933:1: ruleAttributeValue
            {
             before(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_rule__AttributeValueArray__ElementsAssignment_110006);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4942:1: rule__AttributeValueArray__ElementsAssignment_2_1 : ( ruleAttributeValue ) ;
    public final void rule__AttributeValueArray__ElementsAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4946:1: ( ( ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4947:1: ( ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4947:1: ( ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4948:1: ruleAttributeValue
            {
             before(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_2_1_0()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_rule__AttributeValueArray__ElementsAssignment_2_110037);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4957:1: rule__Grouping__NameAssignment_1 : ( ( ruleName ) ) ;
    public final void rule__Grouping__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4961:1: ( ( ( ruleName ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4962:1: ( ( ruleName ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4962:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4963:1: ( ruleName )
            {
             before(grammarAccess.getGroupingAccess().getNamePropertyCrossReference_1_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4964:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4965:1: ruleName
            {
             before(grammarAccess.getGroupingAccess().getNamePropertyNameParserRuleCall_1_0_1()); 
            pushFollow(FOLLOW_ruleName_in_rule__Grouping__NameAssignment_110072);
            ruleName();

            state._fsp--;

             after(grammarAccess.getGroupingAccess().getNamePropertyNameParserRuleCall_1_0_1()); 

            }

             after(grammarAccess.getGroupingAccess().getNamePropertyCrossReference_1_0()); 

            }


            }

        }
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4976:1: rule__Grouping__NameAssignment_2_1 : ( ( ruleName ) ) ;
    public final void rule__Grouping__NameAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4980:1: ( ( ( ruleName ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4981:1: ( ( ruleName ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4981:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4982:1: ( ruleName )
            {
             before(grammarAccess.getGroupingAccess().getNamePropertyCrossReference_2_1_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4983:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4984:1: ruleName
            {
             before(grammarAccess.getGroupingAccess().getNamePropertyNameParserRuleCall_2_1_0_1()); 
            pushFollow(FOLLOW_ruleName_in_rule__Grouping__NameAssignment_2_110111);
            ruleName();

            state._fsp--;

             after(grammarAccess.getGroupingAccess().getNamePropertyNameParserRuleCall_2_1_0_1()); 

            }

             after(grammarAccess.getGroupingAccess().getNamePropertyCrossReference_2_1_0()); 

            }


            }

        }
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


    // $ANTLR start "rule__ModelMapping__MappingsAssignment_3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4995:1: rule__ModelMapping__MappingsAssignment_3 : ( rulePropertyMapping ) ;
    public final void rule__ModelMapping__MappingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:4999:1: ( ( rulePropertyMapping ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5000:1: ( rulePropertyMapping )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5000:1: ( rulePropertyMapping )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5001:1: rulePropertyMapping
            {
             before(grammarAccess.getModelMappingAccess().getMappingsPropertyMappingParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePropertyMapping_in_rule__ModelMapping__MappingsAssignment_310146);
            rulePropertyMapping();

            state._fsp--;

             after(grammarAccess.getModelMappingAccess().getMappingsPropertyMappingParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelMapping__MappingsAssignment_3"


    // $ANTLR start "rule__PropertyMapping__DescriptionAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5010:1: rule__PropertyMapping__DescriptionAssignment_0 : ( ruleDescription ) ;
    public final void rule__PropertyMapping__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5014:1: ( ( ruleDescription ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5015:1: ( ruleDescription )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5015:1: ( ruleDescription )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5016:1: ruleDescription
            {
             before(grammarAccess.getPropertyMappingAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__PropertyMapping__DescriptionAssignment_010177);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5025:1: rule__PropertyMapping__AttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__PropertyMapping__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5029:1: ( ( ruleAttributeList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5030:1: ( ruleAttributeList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5030:1: ( ruleAttributeList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5031:1: ruleAttributeList
            {
             before(grammarAccess.getPropertyMappingAccess().getAttributesAttributeListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__PropertyMapping__AttributesAssignment_110208);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5040:1: rule__PropertyMapping__FromAssignment_2 : ( ( ruleName ) ) ;
    public final void rule__PropertyMapping__FromAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5044:1: ( ( ( ruleName ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5045:1: ( ( ruleName ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5045:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5046:1: ( ruleName )
            {
             before(grammarAccess.getPropertyMappingAccess().getFromPropertyCrossReference_2_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5047:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5048:1: ruleName
            {
             before(grammarAccess.getPropertyMappingAccess().getFromPropertyNameParserRuleCall_2_0_1()); 
            pushFollow(FOLLOW_ruleName_in_rule__PropertyMapping__FromAssignment_210243);
            ruleName();

            state._fsp--;

             after(grammarAccess.getPropertyMappingAccess().getFromPropertyNameParserRuleCall_2_0_1()); 

            }

             after(grammarAccess.getPropertyMappingAccess().getFromPropertyCrossReference_2_0()); 

            }


            }

        }
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5059:1: rule__PropertyMapping__NameAssignment_4 : ( ruleName ) ;
    public final void rule__PropertyMapping__NameAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5063:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5064:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5064:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5065:1: ruleName
            {
             before(grammarAccess.getPropertyMappingAccess().getNameNameParserRuleCall_4_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__PropertyMapping__NameAssignment_410278);
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


    // $ANTLR start "rule__ModelFolding__FoldingsAssignment_3"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5074:1: rule__ModelFolding__FoldingsAssignment_3 : ( rulePropertyFolding ) ;
    public final void rule__ModelFolding__FoldingsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5078:1: ( ( rulePropertyFolding ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5079:1: ( rulePropertyFolding )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5079:1: ( rulePropertyFolding )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5080:1: rulePropertyFolding
            {
             before(grammarAccess.getModelFoldingAccess().getFoldingsPropertyFoldingParserRuleCall_3_0()); 
            pushFollow(FOLLOW_rulePropertyFolding_in_rule__ModelFolding__FoldingsAssignment_310309);
            rulePropertyFolding();

            state._fsp--;

             after(grammarAccess.getModelFoldingAccess().getFoldingsPropertyFoldingParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__ModelFolding__FoldingsAssignment_3"


    // $ANTLR start "rule__PropertyFolding__DescriptionAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5089:1: rule__PropertyFolding__DescriptionAssignment_0 : ( ruleDescription ) ;
    public final void rule__PropertyFolding__DescriptionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5093:1: ( ( ruleDescription ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5094:1: ( ruleDescription )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5094:1: ( ruleDescription )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5095:1: ruleDescription
            {
             before(grammarAccess.getPropertyFoldingAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
            pushFollow(FOLLOW_ruleDescription_in_rule__PropertyFolding__DescriptionAssignment_010340);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5104:1: rule__PropertyFolding__AttributesAssignment_1 : ( ruleAttributeList ) ;
    public final void rule__PropertyFolding__AttributesAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5108:1: ( ( ruleAttributeList ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5109:1: ( ruleAttributeList )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5109:1: ( ruleAttributeList )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5110:1: ruleAttributeList
            {
             before(grammarAccess.getPropertyFoldingAccess().getAttributesAttributeListParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleAttributeList_in_rule__PropertyFolding__AttributesAssignment_110371);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5119:1: rule__PropertyFolding__AggregatorAssignment_2 : ( ruleQualifiedName ) ;
    public final void rule__PropertyFolding__AggregatorAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5123:1: ( ( ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5124:1: ( ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5124:1: ( ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5125:1: ruleQualifiedName
            {
             before(grammarAccess.getPropertyFoldingAccess().getAggregatorQualifiedNameParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__PropertyFolding__AggregatorAssignment_210402);
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5134:1: rule__PropertyFolding__FromAssignment_3 : ( ( ruleName ) ) ;
    public final void rule__PropertyFolding__FromAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5138:1: ( ( ( ruleName ) ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5139:1: ( ( ruleName ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5139:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5140:1: ( ruleName )
            {
             before(grammarAccess.getPropertyFoldingAccess().getFromPropertyCrossReference_3_0()); 
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5141:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5142:1: ruleName
            {
             before(grammarAccess.getPropertyFoldingAccess().getFromPropertyNameParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_ruleName_in_rule__PropertyFolding__FromAssignment_310437);
            ruleName();

            state._fsp--;

             after(grammarAccess.getPropertyFoldingAccess().getFromPropertyNameParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getPropertyFoldingAccess().getFromPropertyCrossReference_3_0()); 

            }


            }

        }
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5153:1: rule__PropertyFolding__NameAssignment_5 : ( ruleName ) ;
    public final void rule__PropertyFolding__NameAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5157:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5158:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5158:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5159:1: ruleName
            {
             before(grammarAccess.getPropertyFoldingAccess().getNameNameParserRuleCall_5_0()); 
            pushFollow(FOLLOW_ruleName_in_rule__PropertyFolding__NameAssignment_510472);
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


    // $ANTLR start "rule__QualifiedNameObject__NameAssignment"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5168:1: rule__QualifiedNameObject__NameAssignment : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameObject__NameAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5172:1: ( ( ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5173:1: ( ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5173:1: ( ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5174:1: ruleQualifiedName
            {
             before(grammarAccess.getQualifiedNameObjectAccess().getNameQualifiedNameParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_rule__QualifiedNameObject__NameAssignment10503);
            ruleQualifiedName();

            state._fsp--;

             after(grammarAccess.getQualifiedNameObjectAccess().getNameQualifiedNameParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameObject__NameAssignment"


    // $ANTLR start "rule__Literal__StringValueAssignment_0"
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5183:1: rule__Literal__StringValueAssignment_0 : ( RULE_STRING ) ;
    public final void rule__Literal__StringValueAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5187:1: ( ( RULE_STRING ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5188:1: ( RULE_STRING )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5188:1: ( RULE_STRING )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5189:1: RULE_STRING
            {
             before(grammarAccess.getLiteralAccess().getStringValueSTRINGTerminalRuleCall_0_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Literal__StringValueAssignment_010534); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5198:1: rule__Literal__IntValueAssignment_1 : ( RULE_INT ) ;
    public final void rule__Literal__IntValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5202:1: ( ( RULE_INT ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5203:1: ( RULE_INT )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5203:1: ( RULE_INT )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5204:1: RULE_INT
            {
             before(grammarAccess.getLiteralAccess().getIntValueINTTerminalRuleCall_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Literal__IntValueAssignment_110565); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5213:1: rule__Literal__DecimalValueAssignment_2 : ( RULE_DECIMAL ) ;
    public final void rule__Literal__DecimalValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5217:1: ( ( RULE_DECIMAL ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5218:1: ( RULE_DECIMAL )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5218:1: ( RULE_DECIMAL )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5219:1: RULE_DECIMAL
            {
             before(grammarAccess.getLiteralAccess().getDecimalValueDECIMALTerminalRuleCall_2_0()); 
            match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_rule__Literal__DecimalValueAssignment_210596); 
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
    // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5228:1: rule__Literal__BooleanValueAssignment_3 : ( ruleBOOLEAN ) ;
    public final void rule__Literal__BooleanValueAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5232:1: ( ( ruleBOOLEAN ) )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5233:1: ( ruleBOOLEAN )
            {
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5233:1: ( ruleBOOLEAN )
            // ../jp.hishidama.xtext.dmdl_editor.ui/src-gen/jp/hishidama/xtext/dmdl_editor/ui/contentassist/antlr/internal/InternalDMDL.g:5234:1: ruleBOOLEAN
            {
             before(grammarAccess.getLiteralAccess().getBooleanValueBOOLEANEnumRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleBOOLEAN_in_rule__Literal__BooleanValueAssignment_310627);
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
    public static final BitSet FOLLOW_rule__Script__ListAssignment_in_ruleScript94 = new BitSet(new long[]{0x0000002000038032L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_entryRuleModelDefinition122 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelDefinition129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__0_in_ruleModelDefinition155 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_entryRuleRecordExpression182 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordExpression189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__0_in_ruleRecordExpression215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm242 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordTerm249 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Alternatives_in_ruleRecordTerm275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_entryRuleModelReference302 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelReference309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelReference__NameAssignment_in_ruleModelReference335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition362 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0_in_rulePropertyDefinition395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinExpression_in_entryRuleJoinExpression422 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinExpression429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinExpression__Group__0_in_ruleJoinExpression455 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_entryRuleJoinTerm482 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinTerm489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinTerm__Group__0_in_ruleJoinTerm515 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rule__AttributeList__AttributesAssignment_in_ruleAttributeList756 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_rule__AttributeList__AttributesAssignment_in_ruleAttributeList768 = new BitSet(new long[]{0x0000002000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute798 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute805 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0_in_ruleAttribute831 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElementBlock_in_entryRuleAttributeElementBlock858 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElementBlock865 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementBlock__Group__0_in_ruleAttributeElementBlock891 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ruleModelMapping_in_entryRuleModelMapping1218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelMapping1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__0_in_ruleModelMapping1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyMapping_in_entryRulePropertyMapping1278 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyMapping1285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__0_in_rulePropertyMapping1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelFolding_in_entryRuleModelFolding1338 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelFolding1345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__0_in_ruleModelFolding1371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFolding_in_entryRulePropertyFolding1398 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyFolding1405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__0_in_rulePropertyFolding1431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameObject_in_entryRuleQualifiedNameObject1460 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameObject1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedNameObject__NameAssignment_in_ruleQualifiedNameObject1493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName1520 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0_in_ruleQualifiedName1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName1580 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Name__Alternatives_in_ruleName1613 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral1640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral1647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__Alternatives_in_ruleLiteral1673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Type__Alternatives_in_ruleType1710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__BOOLEAN__Alternatives_in_ruleBOOLEAN1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_0__0_in_rule__ModelDefinition__Alternatives_21781 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_1__0_in_rule__ModelDefinition__Alternatives_21799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_2__0_in_rule__ModelDefinition__Alternatives_21817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__0_in_rule__RecordTerm__Alternatives1850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__ReferenceAssignment_1_in_rule__RecordTerm__Alternatives1868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__ValueAssignment_0_in_rule__AttributeValue__Alternatives1901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__ValueAssignment_1_in_rule__AttributeValue__Alternatives1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValue__ValueAssignment_2_in_rule__AttributeValue__Alternatives1937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PropertyFolding__Alternatives_41971 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__PropertyFolding__Alternatives_41991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_TOKEN_in_rule__Name__Alternatives2026 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Name__Alternatives2044 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Name__Alternatives2064 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Name__Alternatives2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__StringValueAssignment_0_in_rule__Literal__Alternatives2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__IntValueAssignment_1_in_rule__Literal__Alternatives2136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__DecimalValueAssignment_2_in_rule__Literal__Alternatives2154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Literal__BooleanValueAssignment_3_in_rule__Literal__Alternatives2172 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Type__Alternatives2206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Type__Alternatives2227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Type__Alternatives2248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__Type__Alternatives2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Type__Alternatives2290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Type__Alternatives2311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Type__Alternatives2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Type__Alternatives2353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Type__Alternatives2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Type__Alternatives2395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Type__Alternatives2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__BOOLEAN__Alternatives2452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__BOOLEAN__Alternatives2473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__0__Impl_in_rule__ModelDefinition__Group__02506 = new BitSet(new long[]{0x0000002000038030L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__1_in_rule__ModelDefinition__Group__02509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__DescriptionAssignment_0_in_rule__ModelDefinition__Group__0__Impl2536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__1__Impl_in_rule__ModelDefinition__Group__12567 = new BitSet(new long[]{0x0000002000038030L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__2_in_rule__ModelDefinition__Group__12570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__AttributesAssignment_1_in_rule__ModelDefinition__Group__1__Impl2597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__2__Impl_in_rule__ModelDefinition__Group__22628 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__3_in_rule__ModelDefinition__Group__22631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Alternatives_2_in_rule__ModelDefinition__Group__2__Impl2658 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group__3__Impl_in_rule__ModelDefinition__Group__32688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__ModelDefinition__Group__3__Impl2716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_0__0__Impl_in_rule__ModelDefinition__Group_2_0__02755 = new BitSet(new long[]{0x0000000000038020L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_0__1_in_rule__ModelDefinition__Group_2_0__02758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__TypeAssignment_2_0_0_in_rule__ModelDefinition__Group_2_0__0__Impl2785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_0__1__Impl_in_rule__ModelDefinition__Group_2_0__12816 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_0__2_in_rule__ModelDefinition__Group_2_0__12819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__NameAssignment_2_0_1_in_rule__ModelDefinition__Group_2_0__1__Impl2846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_0__2__Impl_in_rule__ModelDefinition__Group_2_0__22876 = new BitSet(new long[]{0x0000000400038020L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_0__3_in_rule__ModelDefinition__Group_2_0__22879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ModelDefinition__Group_2_0__2__Impl2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_0__3__Impl_in_rule__ModelDefinition__Group_2_0__32938 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__RhsAssignment_2_0_3_in_rule__ModelDefinition__Group_2_0__3__Impl2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_1__0__Impl_in_rule__ModelDefinition__Group_2_1__03003 = new BitSet(new long[]{0x0000000000038020L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_1__1_in_rule__ModelDefinition__Group_2_1__03006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__TypeAssignment_2_1_0_in_rule__ModelDefinition__Group_2_1__0__Impl3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_1__1__Impl_in_rule__ModelDefinition__Group_2_1__13063 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_1__2_in_rule__ModelDefinition__Group_2_1__13066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__NameAssignment_2_1_1_in_rule__ModelDefinition__Group_2_1__1__Impl3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_1__2__Impl_in_rule__ModelDefinition__Group_2_1__23123 = new BitSet(new long[]{0x0000000400038020L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_1__3_in_rule__ModelDefinition__Group_2_1__23126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ModelDefinition__Group_2_1__2__Impl3154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_1__3__Impl_in_rule__ModelDefinition__Group_2_1__33185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__RhsAssignment_2_1_3_in_rule__ModelDefinition__Group_2_1__3__Impl3212 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_2__0__Impl_in_rule__ModelDefinition__Group_2_2__03250 = new BitSet(new long[]{0x0000000000038020L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_2__1_in_rule__ModelDefinition__Group_2_2__03253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__TypeAssignment_2_2_0_in_rule__ModelDefinition__Group_2_2__0__Impl3280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_2__1__Impl_in_rule__ModelDefinition__Group_2_2__13310 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_2__2_in_rule__ModelDefinition__Group_2_2__13313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__NameAssignment_2_2_1_in_rule__ModelDefinition__Group_2_2__1__Impl3340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_2__2__Impl_in_rule__ModelDefinition__Group_2_2__23370 = new BitSet(new long[]{0x0000000400038020L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_2__3_in_rule__ModelDefinition__Group_2_2__23373 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__ModelDefinition__Group_2_2__2__Impl3401 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__Group_2_2__3__Impl_in_rule__ModelDefinition__Group_2_2__33432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelDefinition__RhsAssignment_2_2_3_in_rule__ModelDefinition__Group_2_2__3__Impl3459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__0__Impl_in_rule__RecordExpression__Group__03497 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__1_in_rule__RecordExpression__Group__03500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__TermsAssignment_0_in_rule__RecordExpression__Group__0__Impl3527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group__1__Impl_in_rule__RecordExpression__Group__13557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__0_in_rule__RecordExpression__Group__1__Impl3584 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__0__Impl_in_rule__RecordExpression__Group_1__03619 = new BitSet(new long[]{0x0000000400038020L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__1_in_rule__RecordExpression__Group_1__03622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__RecordExpression__Group_1__0__Impl3650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__Group_1__1__Impl_in_rule__RecordExpression__Group_1__13681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordExpression__TermsAssignment_1_1_in_rule__RecordExpression__Group_1__1__Impl3708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__0__Impl_in_rule__RecordTerm__Group_0__03742 = new BitSet(new long[]{0x0000002800038030L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__1_in_rule__RecordTerm__Group_0__03745 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__RecordTerm__Group_0__0__Impl3773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__1__Impl_in_rule__RecordTerm__Group_0__13804 = new BitSet(new long[]{0x0000002800038030L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__2_in_rule__RecordTerm__Group_0__13807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__2__Impl_in_rule__RecordTerm__Group_0__23865 = new BitSet(new long[]{0x0000002800038030L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__3_in_rule__RecordTerm__Group_0__23868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__RecordTerm__PropertiesAssignment_0_2_in_rule__RecordTerm__Group_0__2__Impl3895 = new BitSet(new long[]{0x0000002000038032L});
    public static final BitSet FOLLOW_rule__RecordTerm__Group_0__3__Impl_in_rule__RecordTerm__Group_0__33926 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__RecordTerm__Group_0__3__Impl3954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__0__Impl_in_rule__PropertyDefinition__Group__03993 = new BitSet(new long[]{0x0000002000038030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1_in_rule__PropertyDefinition__Group__03996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__DescriptionAssignment_0_in_rule__PropertyDefinition__Group__0__Impl4023 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__1__Impl_in_rule__PropertyDefinition__Group__14054 = new BitSet(new long[]{0x0000002000038030L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2_in_rule__PropertyDefinition__Group__14057 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__AttributesAssignment_1_in_rule__PropertyDefinition__Group__1__Impl4084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__2__Impl_in_rule__PropertyDefinition__Group__24115 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3_in_rule__PropertyDefinition__Group__24118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__NameAssignment_2_in_rule__PropertyDefinition__Group__2__Impl4145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__3__Impl_in_rule__PropertyDefinition__Group__34175 = new BitSet(new long[]{0x000000001FFC0000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4_in_rule__PropertyDefinition__Group__34178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_rule__PropertyDefinition__Group__3__Impl4206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__4__Impl_in_rule__PropertyDefinition__Group__44237 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5_in_rule__PropertyDefinition__Group__44240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__TypeAssignment_4_in_rule__PropertyDefinition__Group__4__Impl4267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyDefinition__Group__5__Impl_in_rule__PropertyDefinition__Group__54297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PropertyDefinition__Group__5__Impl4325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinExpression__Group__0__Impl_in_rule__JoinExpression__Group__04368 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__JoinExpression__Group__1_in_rule__JoinExpression__Group__04371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinExpression__TermsAssignment_0_in_rule__JoinExpression__Group__0__Impl4398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinExpression__Group__1__Impl_in_rule__JoinExpression__Group__14428 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinExpression__Group_1__0_in_rule__JoinExpression__Group__1__Impl4455 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__JoinExpression__Group_1__0__Impl_in_rule__JoinExpression__Group_1__04490 = new BitSet(new long[]{0x0000000400038020L});
    public static final BitSet FOLLOW_rule__JoinExpression__Group_1__1_in_rule__JoinExpression__Group_1__04493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__JoinExpression__Group_1__0__Impl4521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinExpression__Group_1__1__Impl_in_rule__JoinExpression__Group_1__14552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinExpression__TermsAssignment_1_1_in_rule__JoinExpression__Group_1__1__Impl4579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinTerm__Group__0__Impl_in_rule__JoinTerm__Group__04613 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_rule__JoinTerm__Group__1_in_rule__JoinTerm__Group__04616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinTerm__ReferenceAssignment_0_in_rule__JoinTerm__Group__0__Impl4643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinTerm__Group__1__Impl_in_rule__JoinTerm__Group__14673 = new BitSet(new long[]{0x0000020000002000L});
    public static final BitSet FOLLOW_rule__JoinTerm__Group__2_in_rule__JoinTerm__Group__14676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinTerm__MappingAssignment_1_in_rule__JoinTerm__Group__1__Impl4703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinTerm__Group__2__Impl_in_rule__JoinTerm__Group__24734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__JoinTerm__GroupingAssignment_2_in_rule__JoinTerm__Group__2__Impl4761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group__0__Impl_in_rule__SummarizeExpression__Group__04798 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group__1_in_rule__SummarizeExpression__Group__04801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__TermsAssignment_0_in_rule__SummarizeExpression__Group__0__Impl4828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group__1__Impl_in_rule__SummarizeExpression__Group__14858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group_1__0_in_rule__SummarizeExpression__Group__1__Impl4885 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group_1__0__Impl_in_rule__SummarizeExpression__Group_1__04920 = new BitSet(new long[]{0x0000000400038020L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group_1__1_in_rule__SummarizeExpression__Group_1__04923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_rule__SummarizeExpression__Group_1__0__Impl4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__Group_1__1__Impl_in_rule__SummarizeExpression__Group_1__14982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeExpression__TermsAssignment_1_1_in_rule__SummarizeExpression__Group_1__1__Impl5009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__0__Impl_in_rule__SummarizeTerm__Group__05043 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__1_in_rule__SummarizeTerm__Group__05046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__ReferenceAssignment_0_in_rule__SummarizeTerm__Group__0__Impl5073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__1__Impl_in_rule__SummarizeTerm__Group__15103 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__2_in_rule__SummarizeTerm__Group__15106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__FoldingAssignment_1_in_rule__SummarizeTerm__Group__1__Impl5133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__Group__2__Impl_in_rule__SummarizeTerm__Group__25163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__SummarizeTerm__GroupingAssignment_2_in_rule__SummarizeTerm__Group__2__Impl5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__0__Impl_in_rule__Attribute__Group__05227 = new BitSet(new long[]{0x0000000000038020L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1_in_rule__Attribute__Group__05230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_rule__Attribute__Group__0__Impl5258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__1__Impl_in_rule__Attribute__Group__15289 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2_in_rule__Attribute__Group__15292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__NameAssignment_1_in_rule__Attribute__Group__1__Impl5319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__Group__2__Impl_in_rule__Attribute__Group__25349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Attribute__ElementBlockAssignment_2_in_rule__Attribute__Group__2__Impl5376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementBlock__Group__0__Impl_in_rule__AttributeElementBlock__Group__05413 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_rule__AttributeElementBlock__Group__1_in_rule__AttributeElementBlock__Group__05416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementBlock__Group__1__Impl_in_rule__AttributeElementBlock__Group__15474 = new BitSet(new long[]{0x0000008000038020L});
    public static final BitSet FOLLOW_rule__AttributeElementBlock__Group__2_in_rule__AttributeElementBlock__Group__15477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_rule__AttributeElementBlock__Group__1__Impl5505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementBlock__Group__2__Impl_in_rule__AttributeElementBlock__Group__25536 = new BitSet(new long[]{0x0000008000038020L});
    public static final BitSet FOLLOW_rule__AttributeElementBlock__Group__3_in_rule__AttributeElementBlock__Group__25539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementBlock__Group_2__0_in_rule__AttributeElementBlock__Group__2__Impl5566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementBlock__Group__3__Impl_in_rule__AttributeElementBlock__Group__35597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_rule__AttributeElementBlock__Group__3__Impl5625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementBlock__Group_2__0__Impl_in_rule__AttributeElementBlock__Group_2__05664 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AttributeElementBlock__Group_2__1_in_rule__AttributeElementBlock__Group_2__05667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementBlock__ElementsAssignment_2_0_in_rule__AttributeElementBlock__Group_2__0__Impl5694 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementBlock__Group_2__1__Impl_in_rule__AttributeElementBlock__Group_2__15724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__AttributeElementBlock__Group_2__1__Impl5753 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group__0__Impl_in_rule__AttributeElementList__Group__05790 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group__1_in_rule__AttributeElementList__Group__05793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__ElementsAssignment_0_in_rule__AttributeElementList__Group__0__Impl5820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group__1__Impl_in_rule__AttributeElementList__Group__15850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group_1__0_in_rule__AttributeElementList__Group__1__Impl5877 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group_1__0__Impl_in_rule__AttributeElementList__Group_1__05912 = new BitSet(new long[]{0x0000000000038020L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group_1__1_in_rule__AttributeElementList__Group_1__05915 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__AttributeElementList__Group_1__0__Impl5943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__Group_1__1__Impl_in_rule__AttributeElementList__Group_1__15974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElementList__ElementsAssignment_1_1_in_rule__AttributeElementList__Group_1__1__Impl6001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__0__Impl_in_rule__AttributeElement__Group__06035 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__1_in_rule__AttributeElement__Group__06038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__NameAssignment_0_in_rule__AttributeElement__Group__0__Impl6065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__1__Impl_in_rule__AttributeElement__Group__16095 = new BitSet(new long[]{0x00000004600380F0L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__2_in_rule__AttributeElement__Group__16098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_rule__AttributeElement__Group__1__Impl6126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__Group__2__Impl_in_rule__AttributeElement__Group__26157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeElement__ValueAssignment_2_in_rule__AttributeElement__Group__2__Impl6184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__0__Impl_in_rule__AttributeValueArray__Group__06220 = new BitSet(new long[]{0x00000004600380F0L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__1_in_rule__AttributeValueArray__Group__06223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__AttributeValueArray__Group__0__Impl6251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__1__Impl_in_rule__AttributeValueArray__Group__16282 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__2_in_rule__AttributeValueArray__Group__16285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__ElementsAssignment_1_in_rule__AttributeValueArray__Group__1__Impl6312 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__2__Impl_in_rule__AttributeValueArray__Group__26342 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__3_in_rule__AttributeValueArray__Group__26345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group_2__0_in_rule__AttributeValueArray__Group__2__Impl6372 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__3__Impl_in_rule__AttributeValueArray__Group__36403 = new BitSet(new long[]{0x0000010800000000L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__4_in_rule__AttributeValueArray__Group__36406 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__AttributeValueArray__Group__3__Impl6435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group__4__Impl_in_rule__AttributeValueArray__Group__46468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__AttributeValueArray__Group__4__Impl6496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group_2__0__Impl_in_rule__AttributeValueArray__Group_2__06537 = new BitSet(new long[]{0x00000004600380F0L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group_2__1_in_rule__AttributeValueArray__Group_2__06540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__AttributeValueArray__Group_2__0__Impl6568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__Group_2__1__Impl_in_rule__AttributeValueArray__Group_2__16599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__AttributeValueArray__ElementsAssignment_2_1_in_rule__AttributeValueArray__Group_2__1__Impl6626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__0__Impl_in_rule__Grouping__Group__06660 = new BitSet(new long[]{0x0000000000038020L});
    public static final BitSet FOLLOW_rule__Grouping__Group__1_in_rule__Grouping__Group__06663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_rule__Grouping__Group__0__Impl6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__1__Impl_in_rule__Grouping__Group__16722 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_rule__Grouping__Group__2_in_rule__Grouping__Group__16725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__NameAssignment_1_in_rule__Grouping__Group__1__Impl6752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group__2__Impl_in_rule__Grouping__Group__26782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_2__0_in_rule__Grouping__Group__2__Impl6809 = new BitSet(new long[]{0x0000010000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_2__0__Impl_in_rule__Grouping__Group_2__06846 = new BitSet(new long[]{0x0000000000038020L});
    public static final BitSet FOLLOW_rule__Grouping__Group_2__1_in_rule__Grouping__Group_2__06849 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rule__Grouping__Group_2__0__Impl6877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__Group_2__1__Impl_in_rule__Grouping__Group_2__16908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Grouping__NameAssignment_2_1_in_rule__Grouping__Group_2__1__Impl6935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__0__Impl_in_rule__ModelMapping__Group__06969 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__1_in_rule__ModelMapping__Group__06972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__ModelMapping__Group__0__Impl7000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__1__Impl_in_rule__ModelMapping__Group__17031 = new BitSet(new long[]{0x0000002800038030L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__2_in_rule__ModelMapping__Group__17034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ModelMapping__Group__1__Impl7062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__2__Impl_in_rule__ModelMapping__Group__27093 = new BitSet(new long[]{0x0000002800038030L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__3_in_rule__ModelMapping__Group__27096 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__3__Impl_in_rule__ModelMapping__Group__37154 = new BitSet(new long[]{0x0000002800038030L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__4_in_rule__ModelMapping__Group__37157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelMapping__MappingsAssignment_3_in_rule__ModelMapping__Group__3__Impl7184 = new BitSet(new long[]{0x0000002000038032L});
    public static final BitSet FOLLOW_rule__ModelMapping__Group__4__Impl_in_rule__ModelMapping__Group__47215 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ModelMapping__Group__4__Impl7243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__0__Impl_in_rule__PropertyMapping__Group__07284 = new BitSet(new long[]{0x0000002000038030L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__1_in_rule__PropertyMapping__Group__07287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__DescriptionAssignment_0_in_rule__PropertyMapping__Group__0__Impl7314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__1__Impl_in_rule__PropertyMapping__Group__17345 = new BitSet(new long[]{0x0000002000038030L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__2_in_rule__PropertyMapping__Group__17348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__AttributesAssignment_1_in_rule__PropertyMapping__Group__1__Impl7375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__2__Impl_in_rule__PropertyMapping__Group__27406 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__3_in_rule__PropertyMapping__Group__27409 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__FromAssignment_2_in_rule__PropertyMapping__Group__2__Impl7436 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__3__Impl_in_rule__PropertyMapping__Group__37466 = new BitSet(new long[]{0x0000000000038020L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__4_in_rule__PropertyMapping__Group__37469 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__PropertyMapping__Group__3__Impl7497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__4__Impl_in_rule__PropertyMapping__Group__47528 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__5_in_rule__PropertyMapping__Group__47531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__NameAssignment_4_in_rule__PropertyMapping__Group__4__Impl7558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyMapping__Group__5__Impl_in_rule__PropertyMapping__Group__57588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PropertyMapping__Group__5__Impl7616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__0__Impl_in_rule__ModelFolding__Group__07659 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__1_in_rule__ModelFolding__Group__07662 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__ModelFolding__Group__0__Impl7690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__1__Impl_in_rule__ModelFolding__Group__17721 = new BitSet(new long[]{0x0000002800038030L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__2_in_rule__ModelFolding__Group__17724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_rule__ModelFolding__Group__1__Impl7752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__2__Impl_in_rule__ModelFolding__Group__27783 = new BitSet(new long[]{0x0000002800038030L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__3_in_rule__ModelFolding__Group__27786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__3__Impl_in_rule__ModelFolding__Group__37844 = new BitSet(new long[]{0x0000002800038030L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__4_in_rule__ModelFolding__Group__37847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__ModelFolding__FoldingsAssignment_3_in_rule__ModelFolding__Group__3__Impl7874 = new BitSet(new long[]{0x0000002000038032L});
    public static final BitSet FOLLOW_rule__ModelFolding__Group__4__Impl_in_rule__ModelFolding__Group__47905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_rule__ModelFolding__Group__4__Impl7933 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__0__Impl_in_rule__PropertyFolding__Group__07974 = new BitSet(new long[]{0x0000002000038030L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__1_in_rule__PropertyFolding__Group__07977 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__DescriptionAssignment_0_in_rule__PropertyFolding__Group__0__Impl8004 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__1__Impl_in_rule__PropertyFolding__Group__18035 = new BitSet(new long[]{0x0000002000038030L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__2_in_rule__PropertyFolding__Group__18038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__AttributesAssignment_1_in_rule__PropertyFolding__Group__1__Impl8065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__2__Impl_in_rule__PropertyFolding__Group__28096 = new BitSet(new long[]{0x0000000000038020L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__3_in_rule__PropertyFolding__Group__28099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__AggregatorAssignment_2_in_rule__PropertyFolding__Group__2__Impl8126 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__3__Impl_in_rule__PropertyFolding__Group__38156 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__4_in_rule__PropertyFolding__Group__38159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__FromAssignment_3_in_rule__PropertyFolding__Group__3__Impl8186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__4__Impl_in_rule__PropertyFolding__Group__48216 = new BitSet(new long[]{0x0000000000038020L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__5_in_rule__PropertyFolding__Group__48219 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Alternatives_4_in_rule__PropertyFolding__Group__4__Impl8246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__5__Impl_in_rule__PropertyFolding__Group__58276 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__6_in_rule__PropertyFolding__Group__58279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__NameAssignment_5_in_rule__PropertyFolding__Group__5__Impl8306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__PropertyFolding__Group__6__Impl_in_rule__PropertyFolding__Group__68336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__PropertyFolding__Group__6__Impl8364 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__0__Impl_in_rule__QualifiedName__Group__08409 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1_in_rule__QualifiedName__Group__08412 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__QualifiedName__Group__0__Impl8439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group__1__Impl_in_rule__QualifiedName__Group__18468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0_in_rule__QualifiedName__Group__1__Impl8495 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__0__Impl_in_rule__QualifiedName__Group_1__08530 = new BitSet(new long[]{0x0000000000038020L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1_in_rule__QualifiedName__Group_1__08533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_rule__QualifiedName__Group_1__0__Impl8561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__QualifiedName__Group_1__1__Impl_in_rule__QualifiedName__Group_1__18592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__QualifiedName__Group_1__1__Impl8619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_rule__Script__ListAssignment8657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__ModelDefinition__DescriptionAssignment_08688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__ModelDefinition__AttributesAssignment_18719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__ModelDefinition__TypeAssignment_2_0_08755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__ModelDefinition__NameAssignment_2_0_18794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_rule__ModelDefinition__RhsAssignment_2_0_38825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__ModelDefinition__TypeAssignment_2_1_08861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__ModelDefinition__NameAssignment_2_1_18900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinExpression_in_rule__ModelDefinition__RhsAssignment_2_1_38931 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__ModelDefinition__TypeAssignment_2_2_08967 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__ModelDefinition__NameAssignment_2_2_19006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeExpression_in_rule__ModelDefinition__RhsAssignment_2_2_39037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_rule__RecordExpression__TermsAssignment_09068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_rule__RecordExpression__TermsAssignment_1_19099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_rule__RecordTerm__PropertiesAssignment_0_29130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_rule__RecordTerm__ReferenceAssignment_19161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__ModelReference__NameAssignment9196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__PropertyDefinition__DescriptionAssignment_09231 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__PropertyDefinition__AttributesAssignment_19262 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__PropertyDefinition__NameAssignment_29293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_rule__PropertyDefinition__TypeAssignment_49324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_rule__JoinExpression__TermsAssignment_09355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_rule__JoinExpression__TermsAssignment_1_19386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_rule__JoinTerm__ReferenceAssignment_09417 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelMapping_in_rule__JoinTerm__MappingAssignment_19448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_rule__JoinTerm__GroupingAssignment_29479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_rule__SummarizeExpression__TermsAssignment_09510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_rule__SummarizeExpression__TermsAssignment_1_19541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_rule__SummarizeTerm__ReferenceAssignment_09572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelFolding_in_rule__SummarizeTerm__FoldingAssignment_19603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_rule__SummarizeTerm__GroupingAssignment_29634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_rule__AttributeList__AttributesAssignment9665 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__Attribute__NameAssignment_19696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElementBlock_in_rule__Attribute__ElementBlockAssignment_29727 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElementList_in_rule__AttributeElementBlock__ElementsAssignment_2_09758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_rule__AttributeElementList__ElementsAssignment_09789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_rule__AttributeElementList__ElementsAssignment_1_19820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__AttributeElement__NameAssignment_09851 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_rule__AttributeElement__ValueAssignment_29882 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueArray_in_rule__AttributeValue__ValueAssignment_09913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameObject_in_rule__AttributeValue__ValueAssignment_19944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rule__AttributeValue__ValueAssignment_29975 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_rule__AttributeValueArray__ElementsAssignment_110006 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_rule__AttributeValueArray__ElementsAssignment_2_110037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Grouping__NameAssignment_110072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__Grouping__NameAssignment_2_110111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyMapping_in_rule__ModelMapping__MappingsAssignment_310146 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__PropertyMapping__DescriptionAssignment_010177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__PropertyMapping__AttributesAssignment_110208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__PropertyMapping__FromAssignment_210243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__PropertyMapping__NameAssignment_410278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFolding_in_rule__ModelFolding__FoldingsAssignment_310309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rule__PropertyFolding__DescriptionAssignment_010340 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rule__PropertyFolding__AttributesAssignment_110371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__PropertyFolding__AggregatorAssignment_210402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__PropertyFolding__FromAssignment_310437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rule__PropertyFolding__NameAssignment_510472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rule__QualifiedNameObject__NameAssignment10503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Literal__StringValueAssignment_010534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Literal__IntValueAssignment_110565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_rule__Literal__DecimalValueAssignment_210596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_rule__Literal__BooleanValueAssignment_310627 = new BitSet(new long[]{0x0000000000000002L});

}