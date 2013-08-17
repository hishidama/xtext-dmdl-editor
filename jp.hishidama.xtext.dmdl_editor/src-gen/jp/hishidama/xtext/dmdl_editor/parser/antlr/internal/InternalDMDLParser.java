package jp.hishidama.xtext.dmdl_editor.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import jp.hishidama.xtext.dmdl_editor.services.DMDLGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalDMDLParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NAME_TOKEN", "RULE_INT", "RULE_DECIMAL", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "';'", "'='", "'projective'", "'+'", "'{'", "'}'", "':'", "'joined'", "'summarized'", "'@'", "'('", "','", "')'", "'%'", "'->'", "'=>'", "'.'", "'INT'", "'LONG'", "'BYTE'", "'SHORT'", "'DECIMAL'", "'FLOAT'", "'DOUBLE'", "'TEXT'", "'BOOLEAN'", "'DATE'", "'DATETIME'", "'TRUE'", "'FALSE'"
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
    public String getGrammarFileName() { return "../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g"; }



     	private DMDLGrammarAccess grammarAccess;
     	
        public InternalDMDLParser(TokenStream input, DMDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Script";	
       	}
       	
       	@Override
       	protected DMDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleScript"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:68:1: entryRuleScript returns [EObject current=null] : iv_ruleScript= ruleScript EOF ;
    public final EObject entryRuleScript() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleScript = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:69:2: (iv_ruleScript= ruleScript EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:70:2: iv_ruleScript= ruleScript EOF
            {
             newCompositeNode(grammarAccess.getScriptRule()); 
            pushFollow(FOLLOW_ruleScript_in_entryRuleScript75);
            iv_ruleScript=ruleScript();

            state._fsp--;

             current =iv_ruleScript; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleScript85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleScript"


    // $ANTLR start "ruleScript"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:77:1: ruleScript returns [EObject current=null] : ( (lv_list_0_0= ruleModelDefinition ) )* ;
    public final EObject ruleScript() throws RecognitionException {
        EObject current = null;

        EObject lv_list_0_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:80:28: ( ( (lv_list_0_0= ruleModelDefinition ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:81:1: ( (lv_list_0_0= ruleModelDefinition ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:81:1: ( (lv_list_0_0= ruleModelDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_NAME_TOKEN)||LA1_0==13||(LA1_0>=18 && LA1_0<=20)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:82:1: (lv_list_0_0= ruleModelDefinition )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:82:1: (lv_list_0_0= ruleModelDefinition )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:83:3: lv_list_0_0= ruleModelDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getScriptAccess().getListModelDefinitionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelDefinition_in_ruleScript130);
            	    lv_list_0_0=ruleModelDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getScriptRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"list",
            	            		lv_list_0_0, 
            	            		"ModelDefinition");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleScript"


    // $ANTLR start "entryRuleModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:107:1: entryRuleModelDefinition returns [EObject current=null] : iv_ruleModelDefinition= ruleModelDefinition EOF ;
    public final EObject entryRuleModelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelDefinition = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:108:2: (iv_ruleModelDefinition= ruleModelDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:109:2: iv_ruleModelDefinition= ruleModelDefinition EOF
            {
             newCompositeNode(grammarAccess.getModelDefinitionRule()); 
            pushFollow(FOLLOW_ruleModelDefinition_in_entryRuleModelDefinition166);
            iv_ruleModelDefinition=ruleModelDefinition();

            state._fsp--;

             current =iv_ruleModelDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelDefinition176); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelDefinition"


    // $ANTLR start "ruleModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:116:1: ruleModelDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( (lv_model_2_0= ruleRecordModelDefinition ) ) | ( (lv_model_3_0= ruleProjectiveModelDefinition ) ) | ( (lv_model_4_0= ruleJoinedModelDefinition ) ) | ( (lv_model_5_0= ruleSummarizeModelDefinition ) ) ) otherlv_6= ';' ) ;
    public final EObject ruleModelDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_description_0_0 = null;

        EObject lv_attributes_1_0 = null;

        EObject lv_model_2_0 = null;

        EObject lv_model_3_0 = null;

        EObject lv_model_4_0 = null;

        EObject lv_model_5_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:119:28: ( ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( (lv_model_2_0= ruleRecordModelDefinition ) ) | ( (lv_model_3_0= ruleProjectiveModelDefinition ) ) | ( (lv_model_4_0= ruleJoinedModelDefinition ) ) | ( (lv_model_5_0= ruleSummarizeModelDefinition ) ) ) otherlv_6= ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:120:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( (lv_model_2_0= ruleRecordModelDefinition ) ) | ( (lv_model_3_0= ruleProjectiveModelDefinition ) ) | ( (lv_model_4_0= ruleJoinedModelDefinition ) ) | ( (lv_model_5_0= ruleSummarizeModelDefinition ) ) ) otherlv_6= ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:120:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( (lv_model_2_0= ruleRecordModelDefinition ) ) | ( (lv_model_3_0= ruleProjectiveModelDefinition ) ) | ( (lv_model_4_0= ruleJoinedModelDefinition ) ) | ( (lv_model_5_0= ruleSummarizeModelDefinition ) ) ) otherlv_6= ';' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:120:2: ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( (lv_model_2_0= ruleRecordModelDefinition ) ) | ( (lv_model_3_0= ruleProjectiveModelDefinition ) ) | ( (lv_model_4_0= ruleJoinedModelDefinition ) ) | ( (lv_model_5_0= ruleSummarizeModelDefinition ) ) ) otherlv_6= ';'
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:120:2: ( (lv_description_0_0= ruleDescription ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:121:1: (lv_description_0_0= ruleDescription )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:121:1: (lv_description_0_0= ruleDescription )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:122:3: lv_description_0_0= ruleDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelDefinitionAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDescription_in_ruleModelDefinition222);
                    lv_description_0_0=ruleDescription();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_0_0, 
                            		"Description");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:138:3: ( (lv_attributes_1_0= ruleAttributeList ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==20) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:139:1: (lv_attributes_1_0= ruleAttributeList )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:139:1: (lv_attributes_1_0= ruleAttributeList )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:140:3: lv_attributes_1_0= ruleAttributeList
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelDefinitionAccess().getAttributesAttributeListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeList_in_ruleModelDefinition244);
                    lv_attributes_1_0=ruleAttributeList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"attributes",
                            		lv_attributes_1_0, 
                            		"AttributeList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:156:3: ( ( (lv_model_2_0= ruleRecordModelDefinition ) ) | ( (lv_model_3_0= ruleProjectiveModelDefinition ) ) | ( (lv_model_4_0= ruleJoinedModelDefinition ) ) | ( (lv_model_5_0= ruleSummarizeModelDefinition ) ) )
            int alt4=4;
            switch ( input.LA(1) ) {
            case RULE_NAME_TOKEN:
                {
                alt4=1;
                }
                break;
            case 13:
                {
                int LA4_2 = input.LA(2);

                if ( (LA4_2==12) ) {
                    alt4=1;
                }
                else if ( (LA4_2==RULE_NAME_TOKEN||LA4_2==13||(LA4_2>=18 && LA4_2<=19)) ) {
                    alt4=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 2, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA4_3 = input.LA(2);

                if ( (LA4_3==12) ) {
                    alt4=1;
                }
                else if ( (LA4_3==RULE_NAME_TOKEN||LA4_3==13||(LA4_3>=18 && LA4_3<=19)) ) {
                    alt4=3;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA4_4 = input.LA(2);

                if ( (LA4_4==RULE_NAME_TOKEN||LA4_4==13||(LA4_4>=18 && LA4_4<=19)) ) {
                    alt4=4;
                }
                else if ( (LA4_4==12) ) {
                    alt4=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:156:4: ( (lv_model_2_0= ruleRecordModelDefinition ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:156:4: ( (lv_model_2_0= ruleRecordModelDefinition ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:157:1: (lv_model_2_0= ruleRecordModelDefinition )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:157:1: (lv_model_2_0= ruleRecordModelDefinition )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:158:3: lv_model_2_0= ruleRecordModelDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelDefinitionAccess().getModelRecordModelDefinitionParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRecordModelDefinition_in_ruleModelDefinition267);
                    lv_model_2_0=ruleRecordModelDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"model",
                            		lv_model_2_0, 
                            		"RecordModelDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:175:6: ( (lv_model_3_0= ruleProjectiveModelDefinition ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:175:6: ( (lv_model_3_0= ruleProjectiveModelDefinition ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:176:1: (lv_model_3_0= ruleProjectiveModelDefinition )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:176:1: (lv_model_3_0= ruleProjectiveModelDefinition )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:177:3: lv_model_3_0= ruleProjectiveModelDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelDefinitionAccess().getModelProjectiveModelDefinitionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleProjectiveModelDefinition_in_ruleModelDefinition294);
                    lv_model_3_0=ruleProjectiveModelDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"model",
                            		lv_model_3_0, 
                            		"ProjectiveModelDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:194:6: ( (lv_model_4_0= ruleJoinedModelDefinition ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:194:6: ( (lv_model_4_0= ruleJoinedModelDefinition ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:195:1: (lv_model_4_0= ruleJoinedModelDefinition )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:195:1: (lv_model_4_0= ruleJoinedModelDefinition )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:196:3: lv_model_4_0= ruleJoinedModelDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelDefinitionAccess().getModelJoinedModelDefinitionParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJoinedModelDefinition_in_ruleModelDefinition321);
                    lv_model_4_0=ruleJoinedModelDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"model",
                            		lv_model_4_0, 
                            		"JoinedModelDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:213:6: ( (lv_model_5_0= ruleSummarizeModelDefinition ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:213:6: ( (lv_model_5_0= ruleSummarizeModelDefinition ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:214:1: (lv_model_5_0= ruleSummarizeModelDefinition )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:214:1: (lv_model_5_0= ruleSummarizeModelDefinition )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:215:3: lv_model_5_0= ruleSummarizeModelDefinition
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelDefinitionAccess().getModelSummarizeModelDefinitionParserRuleCall_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSummarizeModelDefinition_in_ruleModelDefinition348);
                    lv_model_5_0=ruleSummarizeModelDefinition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"model",
                            		lv_model_5_0, 
                            		"SummarizeModelDefinition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,11,FOLLOW_11_in_ruleModelDefinition361); 

                	newLeafNode(otherlv_6, grammarAccess.getModelDefinitionAccess().getSemicolonKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelDefinition"


    // $ANTLR start "entryRuleRecordModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:243:1: entryRuleRecordModelDefinition returns [EObject current=null] : iv_ruleRecordModelDefinition= ruleRecordModelDefinition EOF ;
    public final EObject entryRuleRecordModelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordModelDefinition = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:244:2: (iv_ruleRecordModelDefinition= ruleRecordModelDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:245:2: iv_ruleRecordModelDefinition= ruleRecordModelDefinition EOF
            {
             newCompositeNode(grammarAccess.getRecordModelDefinitionRule()); 
            pushFollow(FOLLOW_ruleRecordModelDefinition_in_entryRuleRecordModelDefinition397);
            iv_ruleRecordModelDefinition=ruleRecordModelDefinition();

            state._fsp--;

             current =iv_ruleRecordModelDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordModelDefinition407); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecordModelDefinition"


    // $ANTLR start "ruleRecordModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:252:1: ruleRecordModelDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleRecordExpression ) ) ) ;
    public final EObject ruleRecordModelDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:255:28: ( ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleRecordExpression ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:256:1: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleRecordExpression ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:256:1: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleRecordExpression ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:256:2: ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleRecordExpression ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:256:2: ( (lv_name_0_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:257:1: (lv_name_0_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:257:1: (lv_name_0_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:258:3: lv_name_0_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getRecordModelDefinitionAccess().getNameNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleRecordModelDefinition453);
            lv_name_0_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRecordModelDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleRecordModelDefinition465); 

                	newLeafNode(otherlv_1, grammarAccess.getRecordModelDefinitionAccess().getEqualsSignKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:278:1: ( (lv_rhs_2_0= ruleRecordExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:279:1: (lv_rhs_2_0= ruleRecordExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:279:1: (lv_rhs_2_0= ruleRecordExpression )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:280:3: lv_rhs_2_0= ruleRecordExpression
            {
             
            	        newCompositeNode(grammarAccess.getRecordModelDefinitionAccess().getRhsRecordExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRecordExpression_in_ruleRecordModelDefinition486);
            lv_rhs_2_0=ruleRecordExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRecordModelDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_2_0, 
                    		"RecordExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordModelDefinition"


    // $ANTLR start "entryRuleProjectiveModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:304:1: entryRuleProjectiveModelDefinition returns [EObject current=null] : iv_ruleProjectiveModelDefinition= ruleProjectiveModelDefinition EOF ;
    public final EObject entryRuleProjectiveModelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProjectiveModelDefinition = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:305:2: (iv_ruleProjectiveModelDefinition= ruleProjectiveModelDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:306:2: iv_ruleProjectiveModelDefinition= ruleProjectiveModelDefinition EOF
            {
             newCompositeNode(grammarAccess.getProjectiveModelDefinitionRule()); 
            pushFollow(FOLLOW_ruleProjectiveModelDefinition_in_entryRuleProjectiveModelDefinition522);
            iv_ruleProjectiveModelDefinition=ruleProjectiveModelDefinition();

            state._fsp--;

             current =iv_ruleProjectiveModelDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleProjectiveModelDefinition532); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleProjectiveModelDefinition"


    // $ANTLR start "ruleProjectiveModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:313:1: ruleProjectiveModelDefinition returns [EObject current=null] : (otherlv_0= 'projective' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleRecordExpression ) ) ) ;
    public final EObject ruleProjectiveModelDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:316:28: ( (otherlv_0= 'projective' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleRecordExpression ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:317:1: (otherlv_0= 'projective' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleRecordExpression ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:317:1: (otherlv_0= 'projective' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleRecordExpression ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:317:3: otherlv_0= 'projective' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleRecordExpression ) )
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleProjectiveModelDefinition569); 

                	newLeafNode(otherlv_0, grammarAccess.getProjectiveModelDefinitionAccess().getProjectiveKeyword_0());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:321:1: ( (lv_name_1_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:322:1: (lv_name_1_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:322:1: (lv_name_1_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:323:3: lv_name_1_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getProjectiveModelDefinitionAccess().getNameNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleProjectiveModelDefinition590);
            lv_name_1_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProjectiveModelDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleProjectiveModelDefinition602); 

                	newLeafNode(otherlv_2, grammarAccess.getProjectiveModelDefinitionAccess().getEqualsSignKeyword_2());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:343:1: ( (lv_rhs_3_0= ruleRecordExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:344:1: (lv_rhs_3_0= ruleRecordExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:344:1: (lv_rhs_3_0= ruleRecordExpression )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:345:3: lv_rhs_3_0= ruleRecordExpression
            {
             
            	        newCompositeNode(grammarAccess.getProjectiveModelDefinitionAccess().getRhsRecordExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleRecordExpression_in_ruleProjectiveModelDefinition623);
            lv_rhs_3_0=ruleRecordExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getProjectiveModelDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_3_0, 
                    		"RecordExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleProjectiveModelDefinition"


    // $ANTLR start "entryRuleRecordExpression"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:369:1: entryRuleRecordExpression returns [EObject current=null] : iv_ruleRecordExpression= ruleRecordExpression EOF ;
    public final EObject entryRuleRecordExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordExpression = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:370:2: (iv_ruleRecordExpression= ruleRecordExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:371:2: iv_ruleRecordExpression= ruleRecordExpression EOF
            {
             newCompositeNode(grammarAccess.getRecordExpressionRule()); 
            pushFollow(FOLLOW_ruleRecordExpression_in_entryRuleRecordExpression659);
            iv_ruleRecordExpression=ruleRecordExpression();

            state._fsp--;

             current =iv_ruleRecordExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordExpression669); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecordExpression"


    // $ANTLR start "ruleRecordExpression"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:378:1: ruleRecordExpression returns [EObject current=null] : ( ( (lv_terms_0_0= ruleRecordTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleRecordTerm ) ) )* ) ;
    public final EObject ruleRecordExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_terms_0_0 = null;

        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:381:28: ( ( ( (lv_terms_0_0= ruleRecordTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleRecordTerm ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:382:1: ( ( (lv_terms_0_0= ruleRecordTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleRecordTerm ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:382:1: ( ( (lv_terms_0_0= ruleRecordTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleRecordTerm ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:382:2: ( (lv_terms_0_0= ruleRecordTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleRecordTerm ) ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:382:2: ( (lv_terms_0_0= ruleRecordTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:383:1: (lv_terms_0_0= ruleRecordTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:383:1: (lv_terms_0_0= ruleRecordTerm )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:384:3: lv_terms_0_0= ruleRecordTerm
            {
             
            	        newCompositeNode(grammarAccess.getRecordExpressionAccess().getTermsRecordTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRecordTerm_in_ruleRecordExpression715);
            lv_terms_0_0=ruleRecordTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRecordExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"terms",
                    		lv_terms_0_0, 
                    		"RecordTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:400:2: (otherlv_1= '+' ( (lv_terms_2_0= ruleRecordTerm ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:400:4: otherlv_1= '+' ( (lv_terms_2_0= ruleRecordTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleRecordExpression728); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRecordExpressionAccess().getPlusSignKeyword_1_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:404:1: ( (lv_terms_2_0= ruleRecordTerm ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:405:1: (lv_terms_2_0= ruleRecordTerm )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:405:1: (lv_terms_2_0= ruleRecordTerm )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:406:3: lv_terms_2_0= ruleRecordTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecordExpressionAccess().getTermsRecordTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRecordTerm_in_ruleRecordExpression749);
            	    lv_terms_2_0=ruleRecordTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRecordExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"terms",
            	            		lv_terms_2_0, 
            	            		"RecordTerm");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordExpression"


    // $ANTLR start "entryRuleRecordTerm"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:430:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:431:2: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:432:2: iv_ruleRecordTerm= ruleRecordTerm EOF
            {
             newCompositeNode(grammarAccess.getRecordTermRule()); 
            pushFollow(FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm787);
            iv_ruleRecordTerm=ruleRecordTerm();

            state._fsp--;

             current =iv_ruleRecordTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordTerm797); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRecordTerm"


    // $ANTLR start "ruleRecordTerm"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:439:1: ruleRecordTerm returns [EObject current=null] : ( (otherlv_0= '{' ( (lv_properties_1_0= rulePropertyDefinition ) )+ otherlv_2= '}' ) | ( (lv_reference_3_0= ruleModelReference ) ) ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_properties_1_0 = null;

        EObject lv_reference_3_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:442:28: ( ( (otherlv_0= '{' ( (lv_properties_1_0= rulePropertyDefinition ) )+ otherlv_2= '}' ) | ( (lv_reference_3_0= ruleModelReference ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:443:1: ( (otherlv_0= '{' ( (lv_properties_1_0= rulePropertyDefinition ) )+ otherlv_2= '}' ) | ( (lv_reference_3_0= ruleModelReference ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:443:1: ( (otherlv_0= '{' ( (lv_properties_1_0= rulePropertyDefinition ) )+ otherlv_2= '}' ) | ( (lv_reference_3_0= ruleModelReference ) ) )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_NAME_TOKEN||LA7_0==13||(LA7_0>=18 && LA7_0<=19)) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:443:2: (otherlv_0= '{' ( (lv_properties_1_0= rulePropertyDefinition ) )+ otherlv_2= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:443:2: (otherlv_0= '{' ( (lv_properties_1_0= rulePropertyDefinition ) )+ otherlv_2= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:443:4: otherlv_0= '{' ( (lv_properties_1_0= rulePropertyDefinition ) )+ otherlv_2= '}'
                    {
                    otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleRecordTerm835); 

                        	newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftCurlyBracketKeyword_0_0());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:447:1: ( (lv_properties_1_0= rulePropertyDefinition ) )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0>=RULE_STRING && LA6_0<=RULE_NAME_TOKEN)||LA6_0==13||(LA6_0>=18 && LA6_0<=20)) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:448:1: (lv_properties_1_0= rulePropertyDefinition )
                    	    {
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:448:1: (lv_properties_1_0= rulePropertyDefinition )
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:449:3: lv_properties_1_0= rulePropertyDefinition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRecordTermAccess().getPropertiesPropertyDefinitionParserRuleCall_0_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleRecordTerm856);
                    	    lv_properties_1_0=rulePropertyDefinition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRecordTermRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_1_0, 
                    	            		"PropertyDefinition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


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

                    otherlv_2=(Token)match(input,16,FOLLOW_16_in_ruleRecordTerm869); 

                        	newLeafNode(otherlv_2, grammarAccess.getRecordTermAccess().getRightCurlyBracketKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:470:6: ( (lv_reference_3_0= ruleModelReference ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:470:6: ( (lv_reference_3_0= ruleModelReference ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:471:1: (lv_reference_3_0= ruleModelReference )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:471:1: (lv_reference_3_0= ruleModelReference )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:472:3: lv_reference_3_0= ruleModelReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getRecordTermAccess().getReferenceModelReferenceParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModelReference_in_ruleRecordTerm897);
                    lv_reference_3_0=ruleModelReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRecordTermRule());
                    	        }
                           		set(
                           			current, 
                           			"reference",
                            		lv_reference_3_0, 
                            		"ModelReference");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRecordTerm"


    // $ANTLR start "entryRuleModelReference"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:496:1: entryRuleModelReference returns [EObject current=null] : iv_ruleModelReference= ruleModelReference EOF ;
    public final EObject entryRuleModelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelReference = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:497:2: (iv_ruleModelReference= ruleModelReference EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:498:2: iv_ruleModelReference= ruleModelReference EOF
            {
             newCompositeNode(grammarAccess.getModelReferenceRule()); 
            pushFollow(FOLLOW_ruleModelReference_in_entryRuleModelReference933);
            iv_ruleModelReference=ruleModelReference();

            state._fsp--;

             current =iv_ruleModelReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelReference943); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelReference"


    // $ANTLR start "ruleModelReference"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:505:1: ruleModelReference returns [EObject current=null] : ( (lv_name_0_0= ruleName ) ) ;
    public final EObject ruleModelReference() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:508:28: ( ( (lv_name_0_0= ruleName ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:509:1: ( (lv_name_0_0= ruleName ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:509:1: ( (lv_name_0_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:510:1: (lv_name_0_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:510:1: (lv_name_0_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:511:3: lv_name_0_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getModelReferenceAccess().getNameNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleModelReference988);
            lv_name_0_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelReferenceRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelReference"


    // $ANTLR start "entryRulePropertyDefinition"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:535:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:536:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:537:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition1023);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;

             current =iv_rulePropertyDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition1033); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyDefinition"


    // $ANTLR start "rulePropertyDefinition"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:544:1: rulePropertyDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_description_0_0 = null;

        EObject lv_attributes_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        Enumerator lv_type_4_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:547:28: ( ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:548:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:548:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:548:2: ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';'
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:548:2: ( (lv_description_0_0= ruleDescription ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:549:1: (lv_description_0_0= ruleDescription )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:549:1: (lv_description_0_0= ruleDescription )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:550:3: lv_description_0_0= ruleDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDescription_in_rulePropertyDefinition1079);
                    lv_description_0_0=ruleDescription();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_0_0, 
                            		"Description");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:566:3: ( (lv_attributes_1_0= ruleAttributeList ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==20) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:567:1: (lv_attributes_1_0= ruleAttributeList )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:567:1: (lv_attributes_1_0= ruleAttributeList )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:568:3: lv_attributes_1_0= ruleAttributeList
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAttributesAttributeListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeList_in_rulePropertyDefinition1101);
                    lv_attributes_1_0=ruleAttributeList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"attributes",
                            		lv_attributes_1_0, 
                            		"AttributeList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:584:3: ( (lv_name_2_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:585:1: (lv_name_2_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:585:1: (lv_name_2_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:586:3: lv_name_2_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNameNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyDefinition1123);
            lv_name_2_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_rulePropertyDefinition1135); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyDefinitionAccess().getColonKeyword_3());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:606:1: ( (lv_type_4_0= ruleType ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:607:1: (lv_type_4_0= ruleType )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:607:1: (lv_type_4_0= ruleType )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:608:3: lv_type_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypeTypeEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_rulePropertyDefinition1156);
            lv_type_4_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_4_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_rulePropertyDefinition1168); 

                	newLeafNode(otherlv_5, grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyDefinition"


    // $ANTLR start "entryRuleJoinedModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:636:1: entryRuleJoinedModelDefinition returns [EObject current=null] : iv_ruleJoinedModelDefinition= ruleJoinedModelDefinition EOF ;
    public final EObject entryRuleJoinedModelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinedModelDefinition = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:637:2: (iv_ruleJoinedModelDefinition= ruleJoinedModelDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:638:2: iv_ruleJoinedModelDefinition= ruleJoinedModelDefinition EOF
            {
             newCompositeNode(grammarAccess.getJoinedModelDefinitionRule()); 
            pushFollow(FOLLOW_ruleJoinedModelDefinition_in_entryRuleJoinedModelDefinition1204);
            iv_ruleJoinedModelDefinition=ruleJoinedModelDefinition();

            state._fsp--;

             current =iv_ruleJoinedModelDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinedModelDefinition1214); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoinedModelDefinition"


    // $ANTLR start "ruleJoinedModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:645:1: ruleJoinedModelDefinition returns [EObject current=null] : (otherlv_0= 'joined' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleJoinExpression ) ) ) ;
    public final EObject ruleJoinedModelDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:648:28: ( (otherlv_0= 'joined' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleJoinExpression ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:649:1: (otherlv_0= 'joined' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleJoinExpression ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:649:1: (otherlv_0= 'joined' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleJoinExpression ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:649:3: otherlv_0= 'joined' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleJoinExpression ) )
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleJoinedModelDefinition1251); 

                	newLeafNode(otherlv_0, grammarAccess.getJoinedModelDefinitionAccess().getJoinedKeyword_0());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:653:1: ( (lv_name_1_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:654:1: (lv_name_1_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:654:1: (lv_name_1_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:655:3: lv_name_1_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getJoinedModelDefinitionAccess().getNameNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleJoinedModelDefinition1272);
            lv_name_1_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinedModelDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleJoinedModelDefinition1284); 

                	newLeafNode(otherlv_2, grammarAccess.getJoinedModelDefinitionAccess().getEqualsSignKeyword_2());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:675:1: ( (lv_rhs_3_0= ruleJoinExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:676:1: (lv_rhs_3_0= ruleJoinExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:676:1: (lv_rhs_3_0= ruleJoinExpression )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:677:3: lv_rhs_3_0= ruleJoinExpression
            {
             
            	        newCompositeNode(grammarAccess.getJoinedModelDefinitionAccess().getRhsJoinExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleJoinExpression_in_ruleJoinedModelDefinition1305);
            lv_rhs_3_0=ruleJoinExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinedModelDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_3_0, 
                    		"JoinExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinedModelDefinition"


    // $ANTLR start "entryRuleJoinExpression"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:701:1: entryRuleJoinExpression returns [EObject current=null] : iv_ruleJoinExpression= ruleJoinExpression EOF ;
    public final EObject entryRuleJoinExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinExpression = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:702:2: (iv_ruleJoinExpression= ruleJoinExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:703:2: iv_ruleJoinExpression= ruleJoinExpression EOF
            {
             newCompositeNode(grammarAccess.getJoinExpressionRule()); 
            pushFollow(FOLLOW_ruleJoinExpression_in_entryRuleJoinExpression1341);
            iv_ruleJoinExpression=ruleJoinExpression();

            state._fsp--;

             current =iv_ruleJoinExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinExpression1351); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoinExpression"


    // $ANTLR start "ruleJoinExpression"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:710:1: ruleJoinExpression returns [EObject current=null] : ( ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )* ) ;
    public final EObject ruleJoinExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_terms_0_0 = null;

        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:713:28: ( ( ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:714:1: ( ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:714:1: ( ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:714:2: ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:714:2: ( (lv_terms_0_0= ruleJoinTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:715:1: (lv_terms_0_0= ruleJoinTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:715:1: (lv_terms_0_0= ruleJoinTerm )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:716:3: lv_terms_0_0= ruleJoinTerm
            {
             
            	        newCompositeNode(grammarAccess.getJoinExpressionAccess().getTermsJoinTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleJoinTerm_in_ruleJoinExpression1397);
            lv_terms_0_0=ruleJoinTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"terms",
                    		lv_terms_0_0, 
                    		"JoinTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:732:2: (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==14) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:732:4: otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleJoinExpression1410); 

            	        	newLeafNode(otherlv_1, grammarAccess.getJoinExpressionAccess().getPlusSignKeyword_1_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:736:1: ( (lv_terms_2_0= ruleJoinTerm ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:737:1: (lv_terms_2_0= ruleJoinTerm )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:737:1: (lv_terms_2_0= ruleJoinTerm )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:738:3: lv_terms_2_0= ruleJoinTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJoinExpressionAccess().getTermsJoinTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJoinTerm_in_ruleJoinExpression1431);
            	    lv_terms_2_0=ruleJoinTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getJoinExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"terms",
            	            		lv_terms_2_0, 
            	            		"JoinTerm");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinExpression"


    // $ANTLR start "entryRuleJoinTerm"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:762:1: entryRuleJoinTerm returns [EObject current=null] : iv_ruleJoinTerm= ruleJoinTerm EOF ;
    public final EObject entryRuleJoinTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinTerm = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:763:2: (iv_ruleJoinTerm= ruleJoinTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:764:2: iv_ruleJoinTerm= ruleJoinTerm EOF
            {
             newCompositeNode(grammarAccess.getJoinTermRule()); 
            pushFollow(FOLLOW_ruleJoinTerm_in_entryRuleJoinTerm1469);
            iv_ruleJoinTerm=ruleJoinTerm();

            state._fsp--;

             current =iv_ruleJoinTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinTerm1479); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleJoinTerm"


    // $ANTLR start "ruleJoinTerm"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:771:1: ruleJoinTerm returns [EObject current=null] : ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )? ) ;
    public final EObject ruleJoinTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_reference_0_0 = null;

        EObject lv_mapping_1_0 = null;

        EObject lv_grouping_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:774:28: ( ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )? ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:775:1: ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:775:1: ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )? )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:775:2: ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )?
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:775:2: ( (lv_reference_0_0= ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:776:1: (lv_reference_0_0= ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:776:1: (lv_reference_0_0= ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:777:3: lv_reference_0_0= ruleModelReference
            {
             
            	        newCompositeNode(grammarAccess.getJoinTermAccess().getReferenceModelReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModelReference_in_ruleJoinTerm1525);
            lv_reference_0_0=ruleModelReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getJoinTermRule());
            	        }
                   		set(
                   			current, 
                   			"reference",
                    		lv_reference_0_0, 
                    		"ModelReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:793:2: ( (lv_mapping_1_0= ruleModelMapping ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==25) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:794:1: (lv_mapping_1_0= ruleModelMapping )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:794:1: (lv_mapping_1_0= ruleModelMapping )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:795:3: lv_mapping_1_0= ruleModelMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getJoinTermAccess().getMappingModelMappingParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModelMapping_in_ruleJoinTerm1546);
                    lv_mapping_1_0=ruleModelMapping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJoinTermRule());
                    	        }
                           		set(
                           			current, 
                           			"mapping",
                            		lv_mapping_1_0, 
                            		"ModelMapping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:811:3: ( (lv_grouping_2_0= ruleGrouping ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==24) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:812:1: (lv_grouping_2_0= ruleGrouping )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:812:1: (lv_grouping_2_0= ruleGrouping )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:813:3: lv_grouping_2_0= ruleGrouping
                    {
                     
                    	        newCompositeNode(grammarAccess.getJoinTermAccess().getGroupingGroupingParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGrouping_in_ruleJoinTerm1568);
                    lv_grouping_2_0=ruleGrouping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getJoinTermRule());
                    	        }
                           		set(
                           			current, 
                           			"grouping",
                            		lv_grouping_2_0, 
                            		"Grouping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleJoinTerm"


    // $ANTLR start "entryRuleSummarizeModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:837:1: entryRuleSummarizeModelDefinition returns [EObject current=null] : iv_ruleSummarizeModelDefinition= ruleSummarizeModelDefinition EOF ;
    public final EObject entryRuleSummarizeModelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSummarizeModelDefinition = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:838:2: (iv_ruleSummarizeModelDefinition= ruleSummarizeModelDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:839:2: iv_ruleSummarizeModelDefinition= ruleSummarizeModelDefinition EOF
            {
             newCompositeNode(grammarAccess.getSummarizeModelDefinitionRule()); 
            pushFollow(FOLLOW_ruleSummarizeModelDefinition_in_entryRuleSummarizeModelDefinition1605);
            iv_ruleSummarizeModelDefinition=ruleSummarizeModelDefinition();

            state._fsp--;

             current =iv_ruleSummarizeModelDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeModelDefinition1615); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSummarizeModelDefinition"


    // $ANTLR start "ruleSummarizeModelDefinition"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:846:1: ruleSummarizeModelDefinition returns [EObject current=null] : (otherlv_0= 'summarized' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleSummarizeExpression ) ) ) ;
    public final EObject ruleSummarizeModelDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_rhs_3_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:849:28: ( (otherlv_0= 'summarized' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleSummarizeExpression ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:850:1: (otherlv_0= 'summarized' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleSummarizeExpression ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:850:1: (otherlv_0= 'summarized' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleSummarizeExpression ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:850:3: otherlv_0= 'summarized' ( (lv_name_1_0= ruleName ) ) otherlv_2= '=' ( (lv_rhs_3_0= ruleSummarizeExpression ) )
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleSummarizeModelDefinition1652); 

                	newLeafNode(otherlv_0, grammarAccess.getSummarizeModelDefinitionAccess().getSummarizedKeyword_0());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:854:1: ( (lv_name_1_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:855:1: (lv_name_1_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:855:1: (lv_name_1_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:856:3: lv_name_1_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getSummarizeModelDefinitionAccess().getNameNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleSummarizeModelDefinition1673);
            lv_name_1_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSummarizeModelDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleSummarizeModelDefinition1685); 

                	newLeafNode(otherlv_2, grammarAccess.getSummarizeModelDefinitionAccess().getEqualsSignKeyword_2());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:876:1: ( (lv_rhs_3_0= ruleSummarizeExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:877:1: (lv_rhs_3_0= ruleSummarizeExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:877:1: (lv_rhs_3_0= ruleSummarizeExpression )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:878:3: lv_rhs_3_0= ruleSummarizeExpression
            {
             
            	        newCompositeNode(grammarAccess.getSummarizeModelDefinitionAccess().getRhsSummarizeExpressionParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleSummarizeExpression_in_ruleSummarizeModelDefinition1706);
            lv_rhs_3_0=ruleSummarizeExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSummarizeModelDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"rhs",
                    		lv_rhs_3_0, 
                    		"SummarizeExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSummarizeModelDefinition"


    // $ANTLR start "entryRuleSummarizeExpression"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:902:1: entryRuleSummarizeExpression returns [EObject current=null] : iv_ruleSummarizeExpression= ruleSummarizeExpression EOF ;
    public final EObject entryRuleSummarizeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSummarizeExpression = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:903:2: (iv_ruleSummarizeExpression= ruleSummarizeExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:904:2: iv_ruleSummarizeExpression= ruleSummarizeExpression EOF
            {
             newCompositeNode(grammarAccess.getSummarizeExpressionRule()); 
            pushFollow(FOLLOW_ruleSummarizeExpression_in_entryRuleSummarizeExpression1742);
            iv_ruleSummarizeExpression=ruleSummarizeExpression();

            state._fsp--;

             current =iv_ruleSummarizeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeExpression1752); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSummarizeExpression"


    // $ANTLR start "ruleSummarizeExpression"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:911:1: ruleSummarizeExpression returns [EObject current=null] : ( ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )* ) ;
    public final EObject ruleSummarizeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_terms_0_0 = null;

        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:914:28: ( ( ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:915:1: ( ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:915:1: ( ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:915:2: ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:915:2: ( (lv_terms_0_0= ruleSummarizeTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:916:1: (lv_terms_0_0= ruleSummarizeTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:916:1: (lv_terms_0_0= ruleSummarizeTerm )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:917:3: lv_terms_0_0= ruleSummarizeTerm
            {
             
            	        newCompositeNode(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSummarizeTerm_in_ruleSummarizeExpression1798);
            lv_terms_0_0=ruleSummarizeTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSummarizeExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"terms",
                    		lv_terms_0_0, 
                    		"SummarizeTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:933:2: (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==14) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:933:4: otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,14,FOLLOW_14_in_ruleSummarizeExpression1811); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSummarizeExpressionAccess().getPlusSignKeyword_1_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:937:1: ( (lv_terms_2_0= ruleSummarizeTerm ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:938:1: (lv_terms_2_0= ruleSummarizeTerm )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:938:1: (lv_terms_2_0= ruleSummarizeTerm )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:939:3: lv_terms_2_0= ruleSummarizeTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSummarizeTerm_in_ruleSummarizeExpression1832);
            	    lv_terms_2_0=ruleSummarizeTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSummarizeExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"terms",
            	            		lv_terms_2_0, 
            	            		"SummarizeTerm");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSummarizeExpression"


    // $ANTLR start "entryRuleSummarizeTerm"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:963:1: entryRuleSummarizeTerm returns [EObject current=null] : iv_ruleSummarizeTerm= ruleSummarizeTerm EOF ;
    public final EObject entryRuleSummarizeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSummarizeTerm = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:964:2: (iv_ruleSummarizeTerm= ruleSummarizeTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:965:2: iv_ruleSummarizeTerm= ruleSummarizeTerm EOF
            {
             newCompositeNode(grammarAccess.getSummarizeTermRule()); 
            pushFollow(FOLLOW_ruleSummarizeTerm_in_entryRuleSummarizeTerm1870);
            iv_ruleSummarizeTerm=ruleSummarizeTerm();

            state._fsp--;

             current =iv_ruleSummarizeTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeTerm1880); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSummarizeTerm"


    // $ANTLR start "ruleSummarizeTerm"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:972:1: ruleSummarizeTerm returns [EObject current=null] : ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )? ) ;
    public final EObject ruleSummarizeTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_reference_0_0 = null;

        EObject lv_folding_1_0 = null;

        EObject lv_grouping_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:975:28: ( ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )? ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:976:1: ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:976:1: ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )? )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:976:2: ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )?
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:976:2: ( (lv_reference_0_0= ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:977:1: (lv_reference_0_0= ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:977:1: (lv_reference_0_0= ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:978:3: lv_reference_0_0= ruleModelReference
            {
             
            	        newCompositeNode(grammarAccess.getSummarizeTermAccess().getReferenceModelReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModelReference_in_ruleSummarizeTerm1926);
            lv_reference_0_0=ruleModelReference();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSummarizeTermRule());
            	        }
                   		set(
                   			current, 
                   			"reference",
                    		lv_reference_0_0, 
                    		"ModelReference");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:994:2: ( (lv_folding_1_0= ruleModelFolding ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:995:1: (lv_folding_1_0= ruleModelFolding )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:995:1: (lv_folding_1_0= ruleModelFolding )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:996:3: lv_folding_1_0= ruleModelFolding
            {
             
            	        newCompositeNode(grammarAccess.getSummarizeTermAccess().getFoldingModelFoldingParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleModelFolding_in_ruleSummarizeTerm1947);
            lv_folding_1_0=ruleModelFolding();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getSummarizeTermRule());
            	        }
                   		set(
                   			current, 
                   			"folding",
                    		lv_folding_1_0, 
                    		"ModelFolding");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1012:2: ( (lv_grouping_2_0= ruleGrouping ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1013:1: (lv_grouping_2_0= ruleGrouping )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1013:1: (lv_grouping_2_0= ruleGrouping )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1014:3: lv_grouping_2_0= ruleGrouping
                    {
                     
                    	        newCompositeNode(grammarAccess.getSummarizeTermAccess().getGroupingGroupingParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGrouping_in_ruleSummarizeTerm1968);
                    lv_grouping_2_0=ruleGrouping();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getSummarizeTermRule());
                    	        }
                           		set(
                           			current, 
                           			"grouping",
                            		lv_grouping_2_0, 
                            		"Grouping");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSummarizeTerm"


    // $ANTLR start "entryRuleDescription"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1038:1: entryRuleDescription returns [String current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final String entryRuleDescription() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDescription = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1039:2: (iv_ruleDescription= ruleDescription EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1040:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription2006);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription2017); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDescription"


    // $ANTLR start "ruleDescription"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1047:1: ruleDescription returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleDescription() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1050:28: (this_STRING_0= RULE_STRING )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1051:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDescription2056); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getDescriptionAccess().getSTRINGTerminalRuleCall()); 
                

            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDescription"


    // $ANTLR start "entryRuleAttributeList"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1066:1: entryRuleAttributeList returns [EObject current=null] : iv_ruleAttributeList= ruleAttributeList EOF ;
    public final EObject entryRuleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeList = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1067:2: (iv_ruleAttributeList= ruleAttributeList EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1068:2: iv_ruleAttributeList= ruleAttributeList EOF
            {
             newCompositeNode(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_ruleAttributeList_in_entryRuleAttributeList2100);
            iv_ruleAttributeList=ruleAttributeList();

            state._fsp--;

             current =iv_ruleAttributeList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeList2110); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeList"


    // $ANTLR start "ruleAttributeList"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1075:1: ruleAttributeList returns [EObject current=null] : ( (lv_attributes_0_0= ruleAttribute ) )+ ;
    public final EObject ruleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_0_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1078:28: ( ( (lv_attributes_0_0= ruleAttribute ) )+ )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1079:1: ( (lv_attributes_0_0= ruleAttribute ) )+
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1079:1: ( (lv_attributes_0_0= ruleAttribute ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==20) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1080:1: (lv_attributes_0_0= ruleAttribute )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1080:1: (lv_attributes_0_0= ruleAttribute )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1081:3: lv_attributes_0_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleAttributeList2155);
            	    lv_attributes_0_0=ruleAttribute();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAttributeListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"attributes",
            	            		lv_attributes_0_0, 
            	            		"Attribute");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeList"


    // $ANTLR start "entryRuleAttribute"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1105:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1106:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1107:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute2191);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute2201); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttribute"


    // $ANTLR start "ruleAttribute"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1114:1: ruleAttribute returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( ( (lv_elements_3_0= ruleAttributeElementList ) ) (otherlv_4= ',' )? )? otherlv_5= ')' )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_name_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1117:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( ( (lv_elements_3_0= ruleAttributeElementList ) ) (otherlv_4= ',' )? )? otherlv_5= ')' )? ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1118:1: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( ( (lv_elements_3_0= ruleAttributeElementList ) ) (otherlv_4= ',' )? )? otherlv_5= ')' )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1118:1: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( ( (lv_elements_3_0= ruleAttributeElementList ) ) (otherlv_4= ',' )? )? otherlv_5= ')' )? )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1118:3: otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= '(' ( ( (lv_elements_3_0= ruleAttributeElementList ) ) (otherlv_4= ',' )? )? otherlv_5= ')' )?
            {
            otherlv_0=(Token)match(input,20,FOLLOW_20_in_ruleAttribute2238); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getCommercialAtKeyword_0());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1122:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1123:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1123:1: (lv_name_1_0= ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1124:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAttribute2259);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1140:2: (otherlv_2= '(' ( ( (lv_elements_3_0= ruleAttributeElementList ) ) (otherlv_4= ',' )? )? otherlv_5= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==21) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1140:4: otherlv_2= '(' ( ( (lv_elements_3_0= ruleAttributeElementList ) ) (otherlv_4= ',' )? )? otherlv_5= ')'
                    {
                    otherlv_2=(Token)match(input,21,FOLLOW_21_in_ruleAttribute2272); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_2_0());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1144:1: ( ( (lv_elements_3_0= ruleAttributeElementList ) ) (otherlv_4= ',' )? )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_NAME_TOKEN||LA17_0==13||(LA17_0>=18 && LA17_0<=19)) ) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1144:2: ( (lv_elements_3_0= ruleAttributeElementList ) ) (otherlv_4= ',' )?
                            {
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1144:2: ( (lv_elements_3_0= ruleAttributeElementList ) )
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1145:1: (lv_elements_3_0= ruleAttributeElementList )
                            {
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1145:1: (lv_elements_3_0= ruleAttributeElementList )
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1146:3: lv_elements_3_0= ruleAttributeElementList
                            {
                             
                            	        newCompositeNode(grammarAccess.getAttributeAccess().getElementsAttributeElementListParserRuleCall_2_1_0_0()); 
                            	    
                            pushFollow(FOLLOW_ruleAttributeElementList_in_ruleAttribute2294);
                            lv_elements_3_0=ruleAttributeElementList();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"elements",
                                    		lv_elements_3_0, 
                                    		"AttributeElementList");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }

                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1162:2: (otherlv_4= ',' )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==22) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1162:4: otherlv_4= ','
                                    {
                                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleAttribute2307); 

                                        	newLeafNode(otherlv_4, grammarAccess.getAttributeAccess().getCommaKeyword_2_1_1());
                                        

                                    }
                                    break;

                            }


                            }
                            break;

                    }

                    otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleAttribute2323); 

                        	newLeafNode(otherlv_5, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_2_2());
                        

                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeElementList"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1178:1: entryRuleAttributeElementList returns [EObject current=null] : iv_ruleAttributeElementList= ruleAttributeElementList EOF ;
    public final EObject entryRuleAttributeElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeElementList = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1179:2: (iv_ruleAttributeElementList= ruleAttributeElementList EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1180:2: iv_ruleAttributeElementList= ruleAttributeElementList EOF
            {
             newCompositeNode(grammarAccess.getAttributeElementListRule()); 
            pushFollow(FOLLOW_ruleAttributeElementList_in_entryRuleAttributeElementList2361);
            iv_ruleAttributeElementList=ruleAttributeElementList();

            state._fsp--;

             current =iv_ruleAttributeElementList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElementList2371); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeElementList"


    // $ANTLR start "ruleAttributeElementList"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1187:1: ruleAttributeElementList returns [EObject current=null] : ( ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )* ) ;
    public final EObject ruleAttributeElementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1190:28: ( ( ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1191:1: ( ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1191:1: ( ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1191:2: ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1191:2: ( (lv_elements_0_0= ruleAttributeElement ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1192:1: (lv_elements_0_0= ruleAttributeElement )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1192:1: (lv_elements_0_0= ruleAttributeElement )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1193:3: lv_elements_0_0= ruleAttributeElement
            {
             
            	        newCompositeNode(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeElement_in_ruleAttributeElementList2417);
            lv_elements_0_0=ruleAttributeElement();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeElementListRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_0_0, 
                    		"AttributeElement");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1209:2: (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==22) ) {
                    int LA19_1 = input.LA(2);

                    if ( (LA19_1==RULE_NAME_TOKEN||LA19_1==13||(LA19_1>=18 && LA19_1<=19)) ) {
                        alt19=1;
                    }


                }


                switch (alt19) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1209:4: otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) )
            	    {
            	    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAttributeElementList2430); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAttributeElementListAccess().getCommaKeyword_1_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1213:1: ( (lv_elements_2_0= ruleAttributeElement ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1214:1: (lv_elements_2_0= ruleAttributeElement )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1214:1: (lv_elements_2_0= ruleAttributeElement )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1215:3: lv_elements_2_0= ruleAttributeElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttributeElement_in_ruleAttributeElementList2451);
            	    lv_elements_2_0=ruleAttributeElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAttributeElementListRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_2_0, 
            	            		"AttributeElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeElementList"


    // $ANTLR start "entryRuleAttributeElement"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1239:1: entryRuleAttributeElement returns [EObject current=null] : iv_ruleAttributeElement= ruleAttributeElement EOF ;
    public final EObject entryRuleAttributeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeElement = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1240:2: (iv_ruleAttributeElement= ruleAttributeElement EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1241:2: iv_ruleAttributeElement= ruleAttributeElement EOF
            {
             newCompositeNode(grammarAccess.getAttributeElementRule()); 
            pushFollow(FOLLOW_ruleAttributeElement_in_entryRuleAttributeElement2489);
            iv_ruleAttributeElement=ruleAttributeElement();

            state._fsp--;

             current =iv_ruleAttributeElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElement2499); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeElement"


    // $ANTLR start "ruleAttributeElement"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1248:1: ruleAttributeElement returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) ) ;
    public final EObject ruleAttributeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1251:28: ( ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1252:1: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1252:1: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1252:2: ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1252:2: ( (lv_name_0_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1253:1: (lv_name_0_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1253:1: (lv_name_0_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1254:3: lv_name_0_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getAttributeElementAccess().getNameNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleAttributeElement2545);
            lv_name_0_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeElementRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,12,FOLLOW_12_in_ruleAttributeElement2557); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeElementAccess().getEqualsSignKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1274:1: ( (lv_value_2_0= ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1275:1: (lv_value_2_0= ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1275:1: (lv_value_2_0= ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1276:3: lv_value_2_0= ruleAttributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAttributeElementAccess().getValueAttributeValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeValue_in_ruleAttributeElement2578);
            lv_value_2_0=ruleAttributeValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeElementRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_2_0, 
                    		"AttributeValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeElement"


    // $ANTLR start "entryRuleAttributeValue"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1300:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1301:2: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1302:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue2614);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue2624); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeValue"


    // $ANTLR start "ruleAttributeValue"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1309:1: ruleAttributeValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleAttributeValueArray ) ) | ( (lv_value_1_0= ruleQualifiedName ) ) | ( (lv_value_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1312:28: ( ( ( (lv_value_0_0= ruleAttributeValueArray ) ) | ( (lv_value_1_0= ruleQualifiedName ) ) | ( (lv_value_2_0= ruleLiteral ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1313:1: ( ( (lv_value_0_0= ruleAttributeValueArray ) ) | ( (lv_value_1_0= ruleQualifiedName ) ) | ( (lv_value_2_0= ruleLiteral ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1313:1: ( ( (lv_value_0_0= ruleAttributeValueArray ) ) | ( (lv_value_1_0= ruleQualifiedName ) ) | ( (lv_value_2_0= ruleLiteral ) ) )
            int alt20=3;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt20=1;
                }
                break;
            case RULE_NAME_TOKEN:
            case 13:
            case 18:
            case 19:
                {
                alt20=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DECIMAL:
            case 39:
            case 40:
                {
                alt20=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1313:2: ( (lv_value_0_0= ruleAttributeValueArray ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1313:2: ( (lv_value_0_0= ruleAttributeValueArray ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1314:1: (lv_value_0_0= ruleAttributeValueArray )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1314:1: (lv_value_0_0= ruleAttributeValueArray )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1315:3: lv_value_0_0= ruleAttributeValueArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueAccess().getValueAttributeValueArrayParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeValueArray_in_ruleAttributeValue2670);
                    lv_value_0_0=ruleAttributeValueArray();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_0_0, 
                            		"AttributeValueArray");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1332:6: ( (lv_value_1_0= ruleQualifiedName ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1332:6: ( (lv_value_1_0= ruleQualifiedName ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1333:1: (lv_value_1_0= ruleQualifiedName )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1333:1: (lv_value_1_0= ruleQualifiedName )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1334:3: lv_value_1_0= ruleQualifiedName
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueAccess().getValueQualifiedNameParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedName_in_ruleAttributeValue2697);
                    lv_value_1_0=ruleQualifiedName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"QualifiedName");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1351:6: ( (lv_value_2_0= ruleLiteral ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1351:6: ( (lv_value_2_0= ruleLiteral ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1352:1: (lv_value_2_0= ruleLiteral )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1352:1: (lv_value_2_0= ruleLiteral )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1353:3: lv_value_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueAccess().getValueLiteralParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleAttributeValue2724);
                    lv_value_2_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"Literal");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeValue"


    // $ANTLR start "entryRuleAttributeValueArray"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1377:1: entryRuleAttributeValueArray returns [EObject current=null] : iv_ruleAttributeValueArray= ruleAttributeValueArray EOF ;
    public final EObject entryRuleAttributeValueArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValueArray = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1378:2: (iv_ruleAttributeValueArray= ruleAttributeValueArray EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1379:2: iv_ruleAttributeValueArray= ruleAttributeValueArray EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueArrayRule()); 
            pushFollow(FOLLOW_ruleAttributeValueArray_in_entryRuleAttributeValueArray2760);
            iv_ruleAttributeValueArray=ruleAttributeValueArray();

            state._fsp--;

             current =iv_ruleAttributeValueArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValueArray2770); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAttributeValueArray"


    // $ANTLR start "ruleAttributeValueArray"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1386:1: ruleAttributeValueArray returns [EObject current=null] : (otherlv_0= '{' ( (lv_elements_1_0= ruleAttributeValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleAttributeValue ) ) )* (otherlv_4= ',' )? otherlv_5= '}' ) ;
    public final EObject ruleAttributeValueArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1389:28: ( (otherlv_0= '{' ( (lv_elements_1_0= ruleAttributeValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleAttributeValue ) ) )* (otherlv_4= ',' )? otherlv_5= '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1390:1: (otherlv_0= '{' ( (lv_elements_1_0= ruleAttributeValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleAttributeValue ) ) )* (otherlv_4= ',' )? otherlv_5= '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1390:1: (otherlv_0= '{' ( (lv_elements_1_0= ruleAttributeValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleAttributeValue ) ) )* (otherlv_4= ',' )? otherlv_5= '}' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1390:3: otherlv_0= '{' ( (lv_elements_1_0= ruleAttributeValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleAttributeValue ) ) )* (otherlv_4= ',' )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,15,FOLLOW_15_in_ruleAttributeValueArray2807); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeValueArrayAccess().getLeftCurlyBracketKeyword_0());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1394:1: ( (lv_elements_1_0= ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1395:1: (lv_elements_1_0= ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1395:1: (lv_elements_1_0= ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1396:3: lv_elements_1_0= ruleAttributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeValue_in_ruleAttributeValueArray2828);
            lv_elements_1_0=ruleAttributeValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributeValueArrayRule());
            	        }
                   		add(
                   			current, 
                   			"elements",
                    		lv_elements_1_0, 
                    		"AttributeValue");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1412:2: (otherlv_2= ',' ( (lv_elements_3_0= ruleAttributeValue ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==22) ) {
                    int LA21_1 = input.LA(2);

                    if ( ((LA21_1>=RULE_STRING && LA21_1<=RULE_DECIMAL)||LA21_1==13||LA21_1==15||(LA21_1>=18 && LA21_1<=19)||(LA21_1>=39 && LA21_1<=40)) ) {
                        alt21=1;
                    }


                }


                switch (alt21) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1412:4: otherlv_2= ',' ( (lv_elements_3_0= ruleAttributeValue ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleAttributeValueArray2841); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_2_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1416:1: ( (lv_elements_3_0= ruleAttributeValue ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1417:1: (lv_elements_3_0= ruleAttributeValue )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1417:1: (lv_elements_3_0= ruleAttributeValue )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1418:3: lv_elements_3_0= ruleAttributeValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttributeValue_in_ruleAttributeValueArray2862);
            	    lv_elements_3_0=ruleAttributeValue();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAttributeValueArrayRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"elements",
            	            		lv_elements_3_0, 
            	            		"AttributeValue");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1434:4: (otherlv_4= ',' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==22) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1434:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleAttributeValueArray2877); 

                        	newLeafNode(otherlv_4, grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,16,FOLLOW_16_in_ruleAttributeValueArray2891); 

                	newLeafNode(otherlv_5, grammarAccess.getAttributeValueArrayAccess().getRightCurlyBracketKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAttributeValueArray"


    // $ANTLR start "entryRuleGrouping"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1450:1: entryRuleGrouping returns [EObject current=null] : iv_ruleGrouping= ruleGrouping EOF ;
    public final EObject entryRuleGrouping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrouping = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1451:2: (iv_ruleGrouping= ruleGrouping EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1452:2: iv_ruleGrouping= ruleGrouping EOF
            {
             newCompositeNode(grammarAccess.getGroupingRule()); 
            pushFollow(FOLLOW_ruleGrouping_in_entryRuleGrouping2927);
            iv_ruleGrouping=ruleGrouping();

            state._fsp--;

             current =iv_ruleGrouping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouping2937); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGrouping"


    // $ANTLR start "ruleGrouping"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1459:1: ruleGrouping returns [EObject current=null] : (otherlv_0= '%' ( (lv_name_1_0= ruleName ) ) (otherlv_2= ',' ( (lv_name_3_0= ruleName ) ) )* ) ;
    public final EObject ruleGrouping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1462:28: ( (otherlv_0= '%' ( (lv_name_1_0= ruleName ) ) (otherlv_2= ',' ( (lv_name_3_0= ruleName ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1463:1: (otherlv_0= '%' ( (lv_name_1_0= ruleName ) ) (otherlv_2= ',' ( (lv_name_3_0= ruleName ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1463:1: (otherlv_0= '%' ( (lv_name_1_0= ruleName ) ) (otherlv_2= ',' ( (lv_name_3_0= ruleName ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1463:3: otherlv_0= '%' ( (lv_name_1_0= ruleName ) ) (otherlv_2= ',' ( (lv_name_3_0= ruleName ) ) )*
            {
            otherlv_0=(Token)match(input,24,FOLLOW_24_in_ruleGrouping2974); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupingAccess().getPercentSignKeyword_0());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1467:1: ( (lv_name_1_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1468:1: (lv_name_1_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1468:1: (lv_name_1_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1469:3: lv_name_1_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getGroupingAccess().getNameNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleGrouping2995);
            lv_name_1_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getGroupingRule());
            	        }
                   		add(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1485:2: (otherlv_2= ',' ( (lv_name_3_0= ruleName ) ) )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==22) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1485:4: otherlv_2= ',' ( (lv_name_3_0= ruleName ) )
            	    {
            	    otherlv_2=(Token)match(input,22,FOLLOW_22_in_ruleGrouping3008); 

            	        	newLeafNode(otherlv_2, grammarAccess.getGroupingAccess().getCommaKeyword_2_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1489:1: ( (lv_name_3_0= ruleName ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1490:1: (lv_name_3_0= ruleName )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1490:1: (lv_name_3_0= ruleName )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1491:3: lv_name_3_0= ruleName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGroupingAccess().getNameNameParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleName_in_ruleGrouping3029);
            	    lv_name_3_0=ruleName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGroupingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"name",
            	            		lv_name_3_0, 
            	            		"Name");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGrouping"


    // $ANTLR start "entryRuleModelMapping"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1515:1: entryRuleModelMapping returns [EObject current=null] : iv_ruleModelMapping= ruleModelMapping EOF ;
    public final EObject entryRuleModelMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelMapping = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1516:2: (iv_ruleModelMapping= ruleModelMapping EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1517:2: iv_ruleModelMapping= ruleModelMapping EOF
            {
             newCompositeNode(grammarAccess.getModelMappingRule()); 
            pushFollow(FOLLOW_ruleModelMapping_in_entryRuleModelMapping3067);
            iv_ruleModelMapping=ruleModelMapping();

            state._fsp--;

             current =iv_ruleModelMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelMapping3077); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelMapping"


    // $ANTLR start "ruleModelMapping"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1524:1: ruleModelMapping returns [EObject current=null] : (otherlv_0= '->' otherlv_1= '{' ( (lv_mappings_2_0= rulePropertyMapping ) )+ otherlv_3= '}' ) ;
    public final EObject ruleModelMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_mappings_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1527:28: ( (otherlv_0= '->' otherlv_1= '{' ( (lv_mappings_2_0= rulePropertyMapping ) )+ otherlv_3= '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1528:1: (otherlv_0= '->' otherlv_1= '{' ( (lv_mappings_2_0= rulePropertyMapping ) )+ otherlv_3= '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1528:1: (otherlv_0= '->' otherlv_1= '{' ( (lv_mappings_2_0= rulePropertyMapping ) )+ otherlv_3= '}' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1528:3: otherlv_0= '->' otherlv_1= '{' ( (lv_mappings_2_0= rulePropertyMapping ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleModelMapping3114); 

                	newLeafNode(otherlv_0, grammarAccess.getModelMappingAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleModelMapping3126); 

                	newLeafNode(otherlv_1, grammarAccess.getModelMappingAccess().getLeftCurlyBracketKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1536:1: ( (lv_mappings_2_0= rulePropertyMapping ) )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=RULE_STRING && LA24_0<=RULE_NAME_TOKEN)||LA24_0==13||(LA24_0>=18 && LA24_0<=20)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1537:1: (lv_mappings_2_0= rulePropertyMapping )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1537:1: (lv_mappings_2_0= rulePropertyMapping )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1538:3: lv_mappings_2_0= rulePropertyMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelMappingAccess().getMappingsPropertyMappingParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertyMapping_in_ruleModelMapping3147);
            	    lv_mappings_2_0=rulePropertyMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelMappingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mappings",
            	            		lv_mappings_2_0, 
            	            		"PropertyMapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleModelMapping3160); 

                	newLeafNode(otherlv_3, grammarAccess.getModelMappingAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelMapping"


    // $ANTLR start "entryRulePropertyMapping"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1566:1: entryRulePropertyMapping returns [EObject current=null] : iv_rulePropertyMapping= rulePropertyMapping EOF ;
    public final EObject entryRulePropertyMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMapping = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1567:2: (iv_rulePropertyMapping= rulePropertyMapping EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1568:2: iv_rulePropertyMapping= rulePropertyMapping EOF
            {
             newCompositeNode(grammarAccess.getPropertyMappingRule()); 
            pushFollow(FOLLOW_rulePropertyMapping_in_entryRulePropertyMapping3196);
            iv_rulePropertyMapping=rulePropertyMapping();

            state._fsp--;

             current =iv_rulePropertyMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyMapping3206); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyMapping"


    // $ANTLR start "rulePropertyMapping"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1575:1: rulePropertyMapping returns [EObject current=null] : ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_from_2_0= ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' ) ;
    public final EObject rulePropertyMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_description_0_0 = null;

        EObject lv_attributes_1_0 = null;

        AntlrDatatypeRuleToken lv_from_2_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1578:28: ( ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_from_2_0= ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1579:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_from_2_0= ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1579:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_from_2_0= ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1579:2: ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_from_2_0= ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';'
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1579:2: ( (lv_description_0_0= ruleDescription ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==RULE_STRING) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1580:1: (lv_description_0_0= ruleDescription )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1580:1: (lv_description_0_0= ruleDescription )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1581:3: lv_description_0_0= ruleDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyMappingAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDescription_in_rulePropertyMapping3252);
                    lv_description_0_0=ruleDescription();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyMappingRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_0_0, 
                            		"Description");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1597:3: ( (lv_attributes_1_0= ruleAttributeList ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==20) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1598:1: (lv_attributes_1_0= ruleAttributeList )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1598:1: (lv_attributes_1_0= ruleAttributeList )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1599:3: lv_attributes_1_0= ruleAttributeList
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyMappingAccess().getAttributesAttributeListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeList_in_rulePropertyMapping3274);
                    lv_attributes_1_0=ruleAttributeList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyMappingRule());
                    	        }
                           		set(
                           			current, 
                           			"attributes",
                            		lv_attributes_1_0, 
                            		"AttributeList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1615:3: ( (lv_from_2_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1616:1: (lv_from_2_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1616:1: (lv_from_2_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1617:3: lv_from_2_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyMappingAccess().getFromNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyMapping3296);
            lv_from_2_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyMappingRule());
            	        }
                   		set(
                   			current, 
                   			"from",
                    		lv_from_2_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_25_in_rulePropertyMapping3308); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyMappingAccess().getHyphenMinusGreaterThanSignKeyword_3());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1637:1: ( (lv_name_4_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1638:1: (lv_name_4_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1638:1: (lv_name_4_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1639:3: lv_name_4_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyMappingAccess().getNameNameParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyMapping3329);
            lv_name_4_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyMappingRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_4_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_5=(Token)match(input,11,FOLLOW_11_in_rulePropertyMapping3341); 

                	newLeafNode(otherlv_5, grammarAccess.getPropertyMappingAccess().getSemicolonKeyword_5());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyMapping"


    // $ANTLR start "entryRuleModelFolding"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1667:1: entryRuleModelFolding returns [EObject current=null] : iv_ruleModelFolding= ruleModelFolding EOF ;
    public final EObject entryRuleModelFolding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFolding = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1668:2: (iv_ruleModelFolding= ruleModelFolding EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1669:2: iv_ruleModelFolding= ruleModelFolding EOF
            {
             newCompositeNode(grammarAccess.getModelFoldingRule()); 
            pushFollow(FOLLOW_ruleModelFolding_in_entryRuleModelFolding3377);
            iv_ruleModelFolding=ruleModelFolding();

            state._fsp--;

             current =iv_ruleModelFolding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelFolding3387); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModelFolding"


    // $ANTLR start "ruleModelFolding"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1676:1: ruleModelFolding returns [EObject current=null] : (otherlv_0= '=>' otherlv_1= '{' ( (lv_foldings_2_0= rulePropertyFolding ) )+ otherlv_3= '}' ) ;
    public final EObject ruleModelFolding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_foldings_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1679:28: ( (otherlv_0= '=>' otherlv_1= '{' ( (lv_foldings_2_0= rulePropertyFolding ) )+ otherlv_3= '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1680:1: (otherlv_0= '=>' otherlv_1= '{' ( (lv_foldings_2_0= rulePropertyFolding ) )+ otherlv_3= '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1680:1: (otherlv_0= '=>' otherlv_1= '{' ( (lv_foldings_2_0= rulePropertyFolding ) )+ otherlv_3= '}' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1680:3: otherlv_0= '=>' otherlv_1= '{' ( (lv_foldings_2_0= rulePropertyFolding ) )+ otherlv_3= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleModelFolding3424); 

                	newLeafNode(otherlv_0, grammarAccess.getModelFoldingAccess().getEqualsSignGreaterThanSignKeyword_0());
                
            otherlv_1=(Token)match(input,15,FOLLOW_15_in_ruleModelFolding3436); 

                	newLeafNode(otherlv_1, grammarAccess.getModelFoldingAccess().getLeftCurlyBracketKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1688:1: ( (lv_foldings_2_0= rulePropertyFolding ) )+
            int cnt27=0;
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( ((LA27_0>=RULE_STRING && LA27_0<=RULE_NAME_TOKEN)||LA27_0==13||(LA27_0>=18 && LA27_0<=20)) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1689:1: (lv_foldings_2_0= rulePropertyFolding )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1689:1: (lv_foldings_2_0= rulePropertyFolding )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1690:3: lv_foldings_2_0= rulePropertyFolding
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelFoldingAccess().getFoldingsPropertyFoldingParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertyFolding_in_ruleModelFolding3457);
            	    lv_foldings_2_0=rulePropertyFolding();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelFoldingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"foldings",
            	            		lv_foldings_2_0, 
            	            		"PropertyFolding");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt27 >= 1 ) break loop27;
                        EarlyExitException eee =
                            new EarlyExitException(27, input);
                        throw eee;
                }
                cnt27++;
            } while (true);

            otherlv_3=(Token)match(input,16,FOLLOW_16_in_ruleModelFolding3470); 

                	newLeafNode(otherlv_3, grammarAccess.getModelFoldingAccess().getRightCurlyBracketKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModelFolding"


    // $ANTLR start "entryRulePropertyFolding"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1718:1: entryRulePropertyFolding returns [EObject current=null] : iv_rulePropertyFolding= rulePropertyFolding EOF ;
    public final EObject entryRulePropertyFolding() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyFolding = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1719:2: (iv_rulePropertyFolding= rulePropertyFolding EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1720:2: iv_rulePropertyFolding= rulePropertyFolding EOF
            {
             newCompositeNode(grammarAccess.getPropertyFoldingRule()); 
            pushFollow(FOLLOW_rulePropertyFolding_in_entryRulePropertyFolding3506);
            iv_rulePropertyFolding=rulePropertyFolding();

            state._fsp--;

             current =iv_rulePropertyFolding; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyFolding3516); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePropertyFolding"


    // $ANTLR start "rulePropertyFolding"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1727:1: rulePropertyFolding returns [EObject current=null] : ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( (lv_from_3_0= ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' ) ;
    public final EObject rulePropertyFolding() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_description_0_0 = null;

        EObject lv_attributes_1_0 = null;

        EObject lv_aggregator_2_0 = null;

        AntlrDatatypeRuleToken lv_from_3_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1730:28: ( ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( (lv_from_3_0= ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1731:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( (lv_from_3_0= ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1731:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( (lv_from_3_0= ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1731:2: ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( (lv_from_3_0= ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';'
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1731:2: ( (lv_description_0_0= ruleDescription ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==RULE_STRING) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1732:1: (lv_description_0_0= ruleDescription )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1732:1: (lv_description_0_0= ruleDescription )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1733:3: lv_description_0_0= ruleDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDescription_in_rulePropertyFolding3562);
                    lv_description_0_0=ruleDescription();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyFoldingRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_0_0, 
                            		"Description");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1749:3: ( (lv_attributes_1_0= ruleAttributeList ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==20) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1750:1: (lv_attributes_1_0= ruleAttributeList )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1750:1: (lv_attributes_1_0= ruleAttributeList )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1751:3: lv_attributes_1_0= ruleAttributeList
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getAttributesAttributeListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeList_in_rulePropertyFolding3584);
                    lv_attributes_1_0=ruleAttributeList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyFoldingRule());
                    	        }
                           		set(
                           			current, 
                           			"attributes",
                            		lv_attributes_1_0, 
                            		"AttributeList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }
                    break;

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1767:3: ( (lv_aggregator_2_0= ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1768:1: (lv_aggregator_2_0= ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1768:1: (lv_aggregator_2_0= ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1769:3: lv_aggregator_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getAggregatorQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyFolding3606);
            lv_aggregator_2_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyFoldingRule());
            	        }
                   		set(
                   			current, 
                   			"aggregator",
                    		lv_aggregator_2_0, 
                    		"QualifiedName");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1785:2: ( (lv_from_3_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1786:1: (lv_from_3_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1786:1: (lv_from_3_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1787:3: lv_from_3_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getFromNameParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyFolding3627);
            lv_from_3_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyFoldingRule());
            	        }
                   		set(
                   			current, 
                   			"from",
                    		lv_from_3_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1803:2: (otherlv_4= '->' | otherlv_5= '=>' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            else if ( (LA30_0==26) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1803:4: otherlv_4= '->'
                    {
                    otherlv_4=(Token)match(input,25,FOLLOW_25_in_rulePropertyFolding3640); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertyFoldingAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1808:7: otherlv_5= '=>'
                    {
                    otherlv_5=(Token)match(input,26,FOLLOW_26_in_rulePropertyFolding3658); 

                        	newLeafNode(otherlv_5, grammarAccess.getPropertyFoldingAccess().getEqualsSignGreaterThanSignKeyword_4_1());
                        

                    }
                    break;

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1812:2: ( (lv_name_6_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1813:1: (lv_name_6_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1813:1: (lv_name_6_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1814:3: lv_name_6_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getNameNameParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyFolding3680);
            lv_name_6_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyFoldingRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_6_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_7=(Token)match(input,11,FOLLOW_11_in_rulePropertyFolding3692); 

                	newLeafNode(otherlv_7, grammarAccess.getPropertyFoldingAccess().getSemicolonKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePropertyFolding"


    // $ANTLR start "entryRuleQualifiedName"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1842:1: entryRuleQualifiedName returns [EObject current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final EObject entryRuleQualifiedName() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedName = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1843:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1844:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3728);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3738); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1851:1: ruleQualifiedName returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= '.' ( (lv_name_2_0= ruleName ) ) )* ) ;
    public final EObject ruleQualifiedName() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1854:28: ( ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= '.' ( (lv_name_2_0= ruleName ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1855:1: ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= '.' ( (lv_name_2_0= ruleName ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1855:1: ( ( (lv_name_0_0= ruleName ) ) (otherlv_1= '.' ( (lv_name_2_0= ruleName ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1855:2: ( (lv_name_0_0= ruleName ) ) (otherlv_1= '.' ( (lv_name_2_0= ruleName ) ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1855:2: ( (lv_name_0_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1856:1: (lv_name_0_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1856:1: (lv_name_0_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1857:3: lv_name_0_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleQualifiedName3784);
            lv_name_0_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQualifiedNameRule());
            	        }
                   		add(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1873:2: (otherlv_1= '.' ( (lv_name_2_0= ruleName ) ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==27) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1873:4: otherlv_1= '.' ( (lv_name_2_0= ruleName ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleQualifiedName3797); 

            	        	newLeafNode(otherlv_1, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1877:1: ( (lv_name_2_0= ruleName ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1878:1: (lv_name_2_0= ruleName )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1878:1: (lv_name_2_0= ruleName )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1879:3: lv_name_2_0= ruleName
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameNameParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleName_in_ruleQualifiedName3818);
            	    lv_name_2_0=ruleName();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getQualifiedNameRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"name",
            	            		lv_name_2_0, 
            	            		"Name");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleName"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1903:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1904:2: (iv_ruleName= ruleName EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1905:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName3857);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName3868); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleName"


    // $ANTLR start "ruleName"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1912:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NAME_TOKEN_0= RULE_NAME_TOKEN | kw= 'projective' | kw= 'joined' | kw= 'summarized' ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NAME_TOKEN_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1915:28: ( (this_NAME_TOKEN_0= RULE_NAME_TOKEN | kw= 'projective' | kw= 'joined' | kw= 'summarized' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1916:1: (this_NAME_TOKEN_0= RULE_NAME_TOKEN | kw= 'projective' | kw= 'joined' | kw= 'summarized' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1916:1: (this_NAME_TOKEN_0= RULE_NAME_TOKEN | kw= 'projective' | kw= 'joined' | kw= 'summarized' )
            int alt32=4;
            switch ( input.LA(1) ) {
            case RULE_NAME_TOKEN:
                {
                alt32=1;
                }
                break;
            case 13:
                {
                alt32=2;
                }
                break;
            case 18:
                {
                alt32=3;
                }
                break;
            case 19:
                {
                alt32=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1916:6: this_NAME_TOKEN_0= RULE_NAME_TOKEN
                    {
                    this_NAME_TOKEN_0=(Token)match(input,RULE_NAME_TOKEN,FOLLOW_RULE_NAME_TOKEN_in_ruleName3908); 

                    		current.merge(this_NAME_TOKEN_0);
                        
                     
                        newLeafNode(this_NAME_TOKEN_0, grammarAccess.getNameAccess().getNAME_TOKENTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1925:2: kw= 'projective'
                    {
                    kw=(Token)match(input,13,FOLLOW_13_in_ruleName3932); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getProjectiveKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1932:2: kw= 'joined'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleName3951); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getJoinedKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1939:2: kw= 'summarized'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleName3970); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getSummarizedKeyword_3()); 
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleName"


    // $ANTLR start "entryRuleLiteral"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1952:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1953:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1954:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral4010);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral4020); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1961:1: ruleLiteral returns [EObject current=null] : ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_decimalValue_2_0= RULE_DECIMAL ) ) | ( (lv_booleanValue_3_0= ruleBOOLEAN ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_0_0=null;
        Token lv_intValue_1_0=null;
        Token lv_decimalValue_2_0=null;
        Enumerator lv_booleanValue_3_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1964:28: ( ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_decimalValue_2_0= RULE_DECIMAL ) ) | ( (lv_booleanValue_3_0= ruleBOOLEAN ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1965:1: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_decimalValue_2_0= RULE_DECIMAL ) ) | ( (lv_booleanValue_3_0= ruleBOOLEAN ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1965:1: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_decimalValue_2_0= RULE_DECIMAL ) ) | ( (lv_booleanValue_3_0= ruleBOOLEAN ) ) )
            int alt33=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt33=1;
                }
                break;
            case RULE_INT:
                {
                alt33=2;
                }
                break;
            case RULE_DECIMAL:
                {
                alt33=3;
                }
                break;
            case 39:
            case 40:
                {
                alt33=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1965:2: ( (lv_stringValue_0_0= RULE_STRING ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1965:2: ( (lv_stringValue_0_0= RULE_STRING ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1966:1: (lv_stringValue_0_0= RULE_STRING )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1966:1: (lv_stringValue_0_0= RULE_STRING )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1967:3: lv_stringValue_0_0= RULE_STRING
                    {
                    lv_stringValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral4062); 

                    			newLeafNode(lv_stringValue_0_0, grammarAccess.getLiteralAccess().getStringValueSTRINGTerminalRuleCall_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"stringValue",
                            		lv_stringValue_0_0, 
                            		"STRING");
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1984:6: ( (lv_intValue_1_0= RULE_INT ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1984:6: ( (lv_intValue_1_0= RULE_INT ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1985:1: (lv_intValue_1_0= RULE_INT )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1985:1: (lv_intValue_1_0= RULE_INT )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1986:3: lv_intValue_1_0= RULE_INT
                    {
                    lv_intValue_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteral4090); 

                    			newLeafNode(lv_intValue_1_0, grammarAccess.getLiteralAccess().getIntValueINTTerminalRuleCall_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"intValue",
                            		lv_intValue_1_0, 
                            		"INT");
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2003:6: ( (lv_decimalValue_2_0= RULE_DECIMAL ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2003:6: ( (lv_decimalValue_2_0= RULE_DECIMAL ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2004:1: (lv_decimalValue_2_0= RULE_DECIMAL )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2004:1: (lv_decimalValue_2_0= RULE_DECIMAL )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2005:3: lv_decimalValue_2_0= RULE_DECIMAL
                    {
                    lv_decimalValue_2_0=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleLiteral4118); 

                    			newLeafNode(lv_decimalValue_2_0, grammarAccess.getLiteralAccess().getDecimalValueDECIMALTerminalRuleCall_2_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getLiteralRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"decimalValue",
                            		lv_decimalValue_2_0, 
                            		"DECIMAL");
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2022:6: ( (lv_booleanValue_3_0= ruleBOOLEAN ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2022:6: ( (lv_booleanValue_3_0= ruleBOOLEAN ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2023:1: (lv_booleanValue_3_0= ruleBOOLEAN )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2023:1: (lv_booleanValue_3_0= ruleBOOLEAN )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2024:3: lv_booleanValue_3_0= ruleBOOLEAN
                    {
                     
                    	        newCompositeNode(grammarAccess.getLiteralAccess().getBooleanValueBOOLEANEnumRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBOOLEAN_in_ruleLiteral4150);
                    lv_booleanValue_3_0=ruleBOOLEAN();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getLiteralRule());
                    	        }
                           		set(
                           			current, 
                           			"booleanValue",
                            		lv_booleanValue_3_0, 
                            		"BOOLEAN");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "ruleType"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2048:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) ) ;
    public final Enumerator ruleType() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;
        Token enumLiteral_8=null;
        Token enumLiteral_9=null;
        Token enumLiteral_10=null;

         enterRule(); 
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2050:28: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2051:1: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2051:1: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) )
            int alt34=11;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt34=1;
                }
                break;
            case 29:
                {
                alt34=2;
                }
                break;
            case 30:
                {
                alt34=3;
                }
                break;
            case 31:
                {
                alt34=4;
                }
                break;
            case 32:
                {
                alt34=5;
                }
                break;
            case 33:
                {
                alt34=6;
                }
                break;
            case 34:
                {
                alt34=7;
                }
                break;
            case 35:
                {
                alt34=8;
                }
                break;
            case 36:
                {
                alt34=9;
                }
                break;
            case 37:
                {
                alt34=10;
                }
                break;
            case 38:
                {
                alt34=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2051:2: (enumLiteral_0= 'INT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2051:2: (enumLiteral_0= 'INT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2051:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,28,FOLLOW_28_in_ruleType4200); 

                            current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2057:6: (enumLiteral_1= 'LONG' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2057:6: (enumLiteral_1= 'LONG' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2057:8: enumLiteral_1= 'LONG'
                    {
                    enumLiteral_1=(Token)match(input,29,FOLLOW_29_in_ruleType4217); 

                            current = grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2063:6: (enumLiteral_2= 'BYTE' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2063:6: (enumLiteral_2= 'BYTE' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2063:8: enumLiteral_2= 'BYTE'
                    {
                    enumLiteral_2=(Token)match(input,30,FOLLOW_30_in_ruleType4234); 

                            current = grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2069:6: (enumLiteral_3= 'SHORT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2069:6: (enumLiteral_3= 'SHORT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2069:8: enumLiteral_3= 'SHORT'
                    {
                    enumLiteral_3=(Token)match(input,31,FOLLOW_31_in_ruleType4251); 

                            current = grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2075:6: (enumLiteral_4= 'DECIMAL' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2075:6: (enumLiteral_4= 'DECIMAL' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2075:8: enumLiteral_4= 'DECIMAL'
                    {
                    enumLiteral_4=(Token)match(input,32,FOLLOW_32_in_ruleType4268); 

                            current = grammarAccess.getTypeAccess().getDECIMALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDECIMALEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2081:6: (enumLiteral_5= 'FLOAT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2081:6: (enumLiteral_5= 'FLOAT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2081:8: enumLiteral_5= 'FLOAT'
                    {
                    enumLiteral_5=(Token)match(input,33,FOLLOW_33_in_ruleType4285); 

                            current = grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2087:6: (enumLiteral_6= 'DOUBLE' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2087:6: (enumLiteral_6= 'DOUBLE' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2087:8: enumLiteral_6= 'DOUBLE'
                    {
                    enumLiteral_6=(Token)match(input,34,FOLLOW_34_in_ruleType4302); 

                            current = grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2093:6: (enumLiteral_7= 'TEXT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2093:6: (enumLiteral_7= 'TEXT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2093:8: enumLiteral_7= 'TEXT'
                    {
                    enumLiteral_7=(Token)match(input,35,FOLLOW_35_in_ruleType4319); 

                            current = grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2099:6: (enumLiteral_8= 'BOOLEAN' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2099:6: (enumLiteral_8= 'BOOLEAN' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2099:8: enumLiteral_8= 'BOOLEAN'
                    {
                    enumLiteral_8=(Token)match(input,36,FOLLOW_36_in_ruleType4336); 

                            current = grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2105:6: (enumLiteral_9= 'DATE' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2105:6: (enumLiteral_9= 'DATE' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2105:8: enumLiteral_9= 'DATE'
                    {
                    enumLiteral_9=(Token)match(input,37,FOLLOW_37_in_ruleType4353); 

                            current = grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2111:6: (enumLiteral_10= 'DATETIME' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2111:6: (enumLiteral_10= 'DATETIME' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2111:8: enumLiteral_10= 'DATETIME'
                    {
                    enumLiteral_10=(Token)match(input,38,FOLLOW_38_in_ruleType4370); 

                            current = grammarAccess.getTypeAccess().getDATETIMEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getTypeAccess().getDATETIMEEnumLiteralDeclaration_10()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleType"


    // $ANTLR start "ruleBOOLEAN"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2121:1: ruleBOOLEAN returns [Enumerator current=null] : ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) ) ;
    public final Enumerator ruleBOOLEAN() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;

         enterRule(); 
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2123:28: ( ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2124:1: ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2124:1: ( (enumLiteral_0= 'TRUE' ) | (enumLiteral_1= 'FALSE' ) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==39) ) {
                alt35=1;
            }
            else if ( (LA35_0==40) ) {
                alt35=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }
            switch (alt35) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2124:2: (enumLiteral_0= 'TRUE' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2124:2: (enumLiteral_0= 'TRUE' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2124:4: enumLiteral_0= 'TRUE'
                    {
                    enumLiteral_0=(Token)match(input,39,FOLLOW_39_in_ruleBOOLEAN4415); 

                            current = grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBOOLEANAccess().getTRUEEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2130:6: (enumLiteral_1= 'FALSE' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2130:6: (enumLiteral_1= 'FALSE' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2130:8: enumLiteral_1= 'FALSE'
                    {
                    enumLiteral_1=(Token)match(input,40,FOLLOW_40_in_ruleBOOLEAN4432); 

                            current = grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBOOLEANAccess().getFALSEEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleBOOLEAN"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_ruleScript130 = new BitSet(new long[]{0x00000000001C2032L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_entryRuleModelDefinition166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelDefinition176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_ruleModelDefinition222 = new BitSet(new long[]{0x00000000001C2830L});
    public static final BitSet FOLLOW_ruleAttributeList_in_ruleModelDefinition244 = new BitSet(new long[]{0x00000000001C2830L});
    public static final BitSet FOLLOW_ruleRecordModelDefinition_in_ruleModelDefinition267 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleProjectiveModelDefinition_in_ruleModelDefinition294 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleJoinedModelDefinition_in_ruleModelDefinition321 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleSummarizeModelDefinition_in_ruleModelDefinition348 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleModelDefinition361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordModelDefinition_in_entryRuleRecordModelDefinition397 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordModelDefinition407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleRecordModelDefinition453 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleRecordModelDefinition465 = new BitSet(new long[]{0x00000000000CA020L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_ruleRecordModelDefinition486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleProjectiveModelDefinition_in_entryRuleProjectiveModelDefinition522 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleProjectiveModelDefinition532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleProjectiveModelDefinition569 = new BitSet(new long[]{0x00000000000C2020L});
    public static final BitSet FOLLOW_ruleName_in_ruleProjectiveModelDefinition590 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleProjectiveModelDefinition602 = new BitSet(new long[]{0x00000000000CA020L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_ruleProjectiveModelDefinition623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_entryRuleRecordExpression659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordExpression669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_ruleRecordExpression715 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleRecordExpression728 = new BitSet(new long[]{0x00000000000CA020L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_ruleRecordExpression749 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm787 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordTerm797 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleRecordTerm835 = new BitSet(new long[]{0x00000000001C2030L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleRecordTerm856 = new BitSet(new long[]{0x00000000001D2030L});
    public static final BitSet FOLLOW_16_in_ruleRecordTerm869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_ruleRecordTerm897 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_entryRuleModelReference933 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelReference943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleModelReference988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition1023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition1033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rulePropertyDefinition1079 = new BitSet(new long[]{0x00000000001C2020L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rulePropertyDefinition1101 = new BitSet(new long[]{0x00000000000C2020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyDefinition1123 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePropertyDefinition1135 = new BitSet(new long[]{0x0000007FF0000000L});
    public static final BitSet FOLLOW_ruleType_in_rulePropertyDefinition1156 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePropertyDefinition1168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinedModelDefinition_in_entryRuleJoinedModelDefinition1204 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinedModelDefinition1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleJoinedModelDefinition1251 = new BitSet(new long[]{0x00000000000C2020L});
    public static final BitSet FOLLOW_ruleName_in_ruleJoinedModelDefinition1272 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleJoinedModelDefinition1284 = new BitSet(new long[]{0x00000000000CA020L});
    public static final BitSet FOLLOW_ruleJoinExpression_in_ruleJoinedModelDefinition1305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinExpression_in_entryRuleJoinExpression1341 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinExpression1351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_ruleJoinExpression1397 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleJoinExpression1410 = new BitSet(new long[]{0x00000000000CA020L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_ruleJoinExpression1431 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_entryRuleJoinTerm1469 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinTerm1479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_ruleJoinTerm1525 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_ruleModelMapping_in_ruleJoinTerm1546 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_ruleJoinTerm1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeModelDefinition_in_entryRuleSummarizeModelDefinition1605 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeModelDefinition1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSummarizeModelDefinition1652 = new BitSet(new long[]{0x00000000000C2020L});
    public static final BitSet FOLLOW_ruleName_in_ruleSummarizeModelDefinition1673 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleSummarizeModelDefinition1685 = new BitSet(new long[]{0x00000000000CA020L});
    public static final BitSet FOLLOW_ruleSummarizeExpression_in_ruleSummarizeModelDefinition1706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeExpression_in_entryRuleSummarizeExpression1742 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeExpression1752 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_ruleSummarizeExpression1798 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_14_in_ruleSummarizeExpression1811 = new BitSet(new long[]{0x00000000000CA020L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_ruleSummarizeExpression1832 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_entryRuleSummarizeTerm1870 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeTerm1880 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_ruleSummarizeTerm1926 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ruleModelFolding_in_ruleSummarizeTerm1947 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_ruleSummarizeTerm1968 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription2006 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription2017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDescription2056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_entryRuleAttributeList2100 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeList2110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAttributeList2155 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute2191 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2201 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleAttribute2238 = new BitSet(new long[]{0x00000000000C2020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttribute2259 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleAttribute2272 = new BitSet(new long[]{0x00000000008C2020L});
    public static final BitSet FOLLOW_ruleAttributeElementList_in_ruleAttribute2294 = new BitSet(new long[]{0x0000000000C00000L});
    public static final BitSet FOLLOW_22_in_ruleAttribute2307 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAttribute2323 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElementList_in_entryRuleAttributeElementList2361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElementList2371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_ruleAttributeElementList2417 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleAttributeElementList2430 = new BitSet(new long[]{0x00000000000C2020L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_ruleAttributeElementList2451 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_entryRuleAttributeElement2489 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElement2499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleAttributeElement2545 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_12_in_ruleAttributeElement2557 = new BitSet(new long[]{0x00000180000CA0F0L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAttributeElement2578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue2614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueArray_in_ruleAttributeValue2670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttributeValue2697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttributeValue2724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueArray_in_entryRuleAttributeValueArray2760 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValueArray2770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleAttributeValueArray2807 = new BitSet(new long[]{0x00000180000CA0F0L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAttributeValueArray2828 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleAttributeValueArray2841 = new BitSet(new long[]{0x00000180000CA0F0L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAttributeValueArray2862 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_22_in_ruleAttributeValueArray2877 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleAttributeValueArray2891 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_entryRuleGrouping2927 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouping2937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleGrouping2974 = new BitSet(new long[]{0x00000000000C2020L});
    public static final BitSet FOLLOW_ruleName_in_ruleGrouping2995 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_22_in_ruleGrouping3008 = new BitSet(new long[]{0x00000000000C2020L});
    public static final BitSet FOLLOW_ruleName_in_ruleGrouping3029 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_ruleModelMapping_in_entryRuleModelMapping3067 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelMapping3077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleModelMapping3114 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModelMapping3126 = new BitSet(new long[]{0x00000000001C2030L});
    public static final BitSet FOLLOW_rulePropertyMapping_in_ruleModelMapping3147 = new BitSet(new long[]{0x00000000001D2030L});
    public static final BitSet FOLLOW_16_in_ruleModelMapping3160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyMapping_in_entryRulePropertyMapping3196 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyMapping3206 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rulePropertyMapping3252 = new BitSet(new long[]{0x00000000001C2020L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rulePropertyMapping3274 = new BitSet(new long[]{0x00000000000C2020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyMapping3296 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_25_in_rulePropertyMapping3308 = new BitSet(new long[]{0x00000000000C2020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyMapping3329 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePropertyMapping3341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelFolding_in_entryRuleModelFolding3377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelFolding3387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleModelFolding3424 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15_in_ruleModelFolding3436 = new BitSet(new long[]{0x00000000001C2030L});
    public static final BitSet FOLLOW_rulePropertyFolding_in_ruleModelFolding3457 = new BitSet(new long[]{0x00000000001D2030L});
    public static final BitSet FOLLOW_16_in_ruleModelFolding3470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFolding_in_entryRulePropertyFolding3506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyFolding3516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rulePropertyFolding3562 = new BitSet(new long[]{0x00000000001C2020L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rulePropertyFolding3584 = new BitSet(new long[]{0x00000000000C2020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyFolding3606 = new BitSet(new long[]{0x00000000000C2020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyFolding3627 = new BitSet(new long[]{0x0000000006000000L});
    public static final BitSet FOLLOW_25_in_rulePropertyFolding3640 = new BitSet(new long[]{0x00000000000C2020L});
    public static final BitSet FOLLOW_26_in_rulePropertyFolding3658 = new BitSet(new long[]{0x00000000000C2020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyFolding3680 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_rulePropertyFolding3692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3728 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleQualifiedName3784 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleQualifiedName3797 = new BitSet(new long[]{0x00000000000C2020L});
    public static final BitSet FOLLOW_ruleName_in_ruleQualifiedName3818 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName3857 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName3868 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_TOKEN_in_ruleName3908 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleName3932 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleName3951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleName3970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral4010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral4020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral4062 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteral4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleLiteral4118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBOOLEAN_in_ruleLiteral4150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleType4200 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleType4217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleType4234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleType4251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleType4268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleType4285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleType4302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleType4319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleType4336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleType4353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleType4370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBOOLEAN4415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBOOLEAN4432 = new BitSet(new long[]{0x0000000000000002L});

}