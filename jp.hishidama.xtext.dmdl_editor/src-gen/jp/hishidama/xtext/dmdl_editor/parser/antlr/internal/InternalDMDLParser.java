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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NAME_TOKEN", "RULE_INT", "RULE_DECIMAL", "RULE_DIGIT_CHAR", "RULE_SYMBOL_CHAR", "RULE_BLANK_CHAR", "RULE_HEX_CHAR", "RULE_OCTAL_ESCAPE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'projective'", "'='", "'joined'", "'summarized'", "';'", "'+'", "'{'", "'}'", "':'", "','", "'.'", "'@'", "'('", "')'", "'%'", "'->'", "'=>'", "'INT'", "'LONG'", "'BYTE'", "'SHORT'", "'DECIMAL'", "'FLOAT'", "'DOUBLE'", "'TEXT'", "'BOOLEAN'", "'DATE'", "'DATETIME'"
    };
    public static final int RULE_DIGIT_CHAR=8;
    public static final int RULE_HEX_CHAR=11;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int RULE_DECIMAL=7;
    public static final int T__26=26;
    public static final int RULE_NAME_TOKEN=5;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_OCTAL_ESCAPE=12;
    public static final int RULE_ML_COMMENT=13;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=4;
    public static final int RULE_SYMBOL_CHAR=9;
    public static final int RULE_SL_COMMENT=14;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_BLANK_CHAR=10;
    public static final int T__32=32;
    public static final int RULE_WS=15;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

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

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_NAME_TOKEN)||LA1_0==16||(LA1_0>=18 && LA1_0<=19)||LA1_0==27) ) {
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:116:1: ruleModelDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ( (lv_type_2_0= 'projective' ) )? ( (lv_name_3_0= ruleName ) ) otherlv_4= '=' ( (lv_rhs_5_0= ruleRecordExpression ) ) ) | ( ( (lv_type_6_0= 'joined' ) ) ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_rhs_9_0= ruleJoinExpression ) ) ) | ( ( (lv_type_10_0= 'summarized' ) ) ( (lv_name_11_0= ruleName ) ) otherlv_12= '=' ( (lv_rhs_13_0= ruleSummarizeExpression ) ) ) ) otherlv_14= ';' ) ;
    public final EObject ruleModelDefinition() throws RecognitionException {
        EObject current = null;

        Token lv_type_2_0=null;
        Token otherlv_4=null;
        Token lv_type_6_0=null;
        Token otherlv_8=null;
        Token lv_type_10_0=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_description_0_0 = null;

        EObject lv_attributes_1_0 = null;

        AntlrDatatypeRuleToken lv_name_3_0 = null;

        EObject lv_rhs_5_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_rhs_9_0 = null;

        AntlrDatatypeRuleToken lv_name_11_0 = null;

        EObject lv_rhs_13_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:119:28: ( ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ( (lv_type_2_0= 'projective' ) )? ( (lv_name_3_0= ruleName ) ) otherlv_4= '=' ( (lv_rhs_5_0= ruleRecordExpression ) ) ) | ( ( (lv_type_6_0= 'joined' ) ) ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_rhs_9_0= ruleJoinExpression ) ) ) | ( ( (lv_type_10_0= 'summarized' ) ) ( (lv_name_11_0= ruleName ) ) otherlv_12= '=' ( (lv_rhs_13_0= ruleSummarizeExpression ) ) ) ) otherlv_14= ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:120:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ( (lv_type_2_0= 'projective' ) )? ( (lv_name_3_0= ruleName ) ) otherlv_4= '=' ( (lv_rhs_5_0= ruleRecordExpression ) ) ) | ( ( (lv_type_6_0= 'joined' ) ) ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_rhs_9_0= ruleJoinExpression ) ) ) | ( ( (lv_type_10_0= 'summarized' ) ) ( (lv_name_11_0= ruleName ) ) otherlv_12= '=' ( (lv_rhs_13_0= ruleSummarizeExpression ) ) ) ) otherlv_14= ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:120:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ( (lv_type_2_0= 'projective' ) )? ( (lv_name_3_0= ruleName ) ) otherlv_4= '=' ( (lv_rhs_5_0= ruleRecordExpression ) ) ) | ( ( (lv_type_6_0= 'joined' ) ) ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_rhs_9_0= ruleJoinExpression ) ) ) | ( ( (lv_type_10_0= 'summarized' ) ) ( (lv_name_11_0= ruleName ) ) otherlv_12= '=' ( (lv_rhs_13_0= ruleSummarizeExpression ) ) ) ) otherlv_14= ';' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:120:2: ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ( (lv_type_2_0= 'projective' ) )? ( (lv_name_3_0= ruleName ) ) otherlv_4= '=' ( (lv_rhs_5_0= ruleRecordExpression ) ) ) | ( ( (lv_type_6_0= 'joined' ) ) ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_rhs_9_0= ruleJoinExpression ) ) ) | ( ( (lv_type_10_0= 'summarized' ) ) ( (lv_name_11_0= ruleName ) ) otherlv_12= '=' ( (lv_rhs_13_0= ruleSummarizeExpression ) ) ) ) otherlv_14= ';'
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

            if ( (LA3_0==27) ) {
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:156:3: ( ( ( (lv_type_2_0= 'projective' ) )? ( (lv_name_3_0= ruleName ) ) otherlv_4= '=' ( (lv_rhs_5_0= ruleRecordExpression ) ) ) | ( ( (lv_type_6_0= 'joined' ) ) ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_rhs_9_0= ruleJoinExpression ) ) ) | ( ( (lv_type_10_0= 'summarized' ) ) ( (lv_name_11_0= ruleName ) ) otherlv_12= '=' ( (lv_rhs_13_0= ruleSummarizeExpression ) ) ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_NAME_TOKEN:
            case 16:
                {
                alt5=1;
                }
                break;
            case 18:
                {
                int LA5_2 = input.LA(2);

                if ( (LA5_2==RULE_NAME_TOKEN||LA5_2==16||(LA5_2>=18 && LA5_2<=19)) ) {
                    alt5=2;
                }
                else if ( (LA5_2==17) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 2, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA5_3 = input.LA(2);

                if ( (LA5_3==RULE_NAME_TOKEN||LA5_3==16||(LA5_3>=18 && LA5_3<=19)) ) {
                    alt5=3;
                }
                else if ( (LA5_3==17) ) {
                    alt5=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 3, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:156:4: ( ( (lv_type_2_0= 'projective' ) )? ( (lv_name_3_0= ruleName ) ) otherlv_4= '=' ( (lv_rhs_5_0= ruleRecordExpression ) ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:156:4: ( ( (lv_type_2_0= 'projective' ) )? ( (lv_name_3_0= ruleName ) ) otherlv_4= '=' ( (lv_rhs_5_0= ruleRecordExpression ) ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:156:5: ( (lv_type_2_0= 'projective' ) )? ( (lv_name_3_0= ruleName ) ) otherlv_4= '=' ( (lv_rhs_5_0= ruleRecordExpression ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:156:5: ( (lv_type_2_0= 'projective' ) )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==16) ) {
                        int LA4_1 = input.LA(2);

                        if ( (LA4_1==RULE_NAME_TOKEN||LA4_1==16||(LA4_1>=18 && LA4_1<=19)) ) {
                            alt4=1;
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:157:1: (lv_type_2_0= 'projective' )
                            {
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:157:1: (lv_type_2_0= 'projective' )
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:158:3: lv_type_2_0= 'projective'
                            {
                            lv_type_2_0=(Token)match(input,16,FOLLOW_16_in_ruleModelDefinition265); 

                                    newLeafNode(lv_type_2_0, grammarAccess.getModelDefinitionAccess().getTypeProjectiveKeyword_2_0_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getModelDefinitionRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_2_0, "projective");
                            	    

                            }


                            }
                            break;

                    }

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:171:3: ( (lv_name_3_0= ruleName ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:172:1: (lv_name_3_0= ruleName )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:172:1: (lv_name_3_0= ruleName )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:173:3: lv_name_3_0= ruleName
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelDefinitionAccess().getNameNameParserRuleCall_2_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleName_in_ruleModelDefinition300);
                    lv_name_3_0=ruleName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_3_0, 
                            		"Name");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_4=(Token)match(input,17,FOLLOW_17_in_ruleModelDefinition312); 

                        	newLeafNode(otherlv_4, grammarAccess.getModelDefinitionAccess().getEqualsSignKeyword_2_0_2());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:193:1: ( (lv_rhs_5_0= ruleRecordExpression ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:194:1: (lv_rhs_5_0= ruleRecordExpression )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:194:1: (lv_rhs_5_0= ruleRecordExpression )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:195:3: lv_rhs_5_0= ruleRecordExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelDefinitionAccess().getRhsRecordExpressionParserRuleCall_2_0_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRecordExpression_in_ruleModelDefinition333);
                    lv_rhs_5_0=ruleRecordExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"rhs",
                            		lv_rhs_5_0, 
                            		"RecordExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:212:6: ( ( (lv_type_6_0= 'joined' ) ) ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_rhs_9_0= ruleJoinExpression ) ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:212:6: ( ( (lv_type_6_0= 'joined' ) ) ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_rhs_9_0= ruleJoinExpression ) ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:212:7: ( (lv_type_6_0= 'joined' ) ) ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_rhs_9_0= ruleJoinExpression ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:212:7: ( (lv_type_6_0= 'joined' ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:213:1: (lv_type_6_0= 'joined' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:213:1: (lv_type_6_0= 'joined' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:214:3: lv_type_6_0= 'joined'
                    {
                    lv_type_6_0=(Token)match(input,18,FOLLOW_18_in_ruleModelDefinition359); 

                            newLeafNode(lv_type_6_0, grammarAccess.getModelDefinitionAccess().getTypeJoinedKeyword_2_1_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_6_0, "joined");
                    	    

                    }


                    }

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:227:2: ( (lv_name_7_0= ruleName ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:228:1: (lv_name_7_0= ruleName )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:228:1: (lv_name_7_0= ruleName )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:229:3: lv_name_7_0= ruleName
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelDefinitionAccess().getNameNameParserRuleCall_2_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleName_in_ruleModelDefinition393);
                    lv_name_7_0=ruleName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_7_0, 
                            		"Name");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_ruleModelDefinition405); 

                        	newLeafNode(otherlv_8, grammarAccess.getModelDefinitionAccess().getEqualsSignKeyword_2_1_2());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:249:1: ( (lv_rhs_9_0= ruleJoinExpression ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:250:1: (lv_rhs_9_0= ruleJoinExpression )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:250:1: (lv_rhs_9_0= ruleJoinExpression )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:251:3: lv_rhs_9_0= ruleJoinExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelDefinitionAccess().getRhsJoinExpressionParserRuleCall_2_1_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleJoinExpression_in_ruleModelDefinition426);
                    lv_rhs_9_0=ruleJoinExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"rhs",
                            		lv_rhs_9_0, 
                            		"JoinExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:268:6: ( ( (lv_type_10_0= 'summarized' ) ) ( (lv_name_11_0= ruleName ) ) otherlv_12= '=' ( (lv_rhs_13_0= ruleSummarizeExpression ) ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:268:6: ( ( (lv_type_10_0= 'summarized' ) ) ( (lv_name_11_0= ruleName ) ) otherlv_12= '=' ( (lv_rhs_13_0= ruleSummarizeExpression ) ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:268:7: ( (lv_type_10_0= 'summarized' ) ) ( (lv_name_11_0= ruleName ) ) otherlv_12= '=' ( (lv_rhs_13_0= ruleSummarizeExpression ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:268:7: ( (lv_type_10_0= 'summarized' ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:269:1: (lv_type_10_0= 'summarized' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:269:1: (lv_type_10_0= 'summarized' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:270:3: lv_type_10_0= 'summarized'
                    {
                    lv_type_10_0=(Token)match(input,19,FOLLOW_19_in_ruleModelDefinition452); 

                            newLeafNode(lv_type_10_0, grammarAccess.getModelDefinitionAccess().getTypeSummarizedKeyword_2_2_0_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getModelDefinitionRule());
                    	        }
                           		setWithLastConsumed(current, "type", lv_type_10_0, "summarized");
                    	    

                    }


                    }

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:283:2: ( (lv_name_11_0= ruleName ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:284:1: (lv_name_11_0= ruleName )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:284:1: (lv_name_11_0= ruleName )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:285:3: lv_name_11_0= ruleName
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelDefinitionAccess().getNameNameParserRuleCall_2_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleName_in_ruleModelDefinition486);
                    lv_name_11_0=ruleName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_11_0, 
                            		"Name");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_12=(Token)match(input,17,FOLLOW_17_in_ruleModelDefinition498); 

                        	newLeafNode(otherlv_12, grammarAccess.getModelDefinitionAccess().getEqualsSignKeyword_2_2_2());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:305:1: ( (lv_rhs_13_0= ruleSummarizeExpression ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:306:1: (lv_rhs_13_0= ruleSummarizeExpression )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:306:1: (lv_rhs_13_0= ruleSummarizeExpression )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:307:3: lv_rhs_13_0= ruleSummarizeExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getModelDefinitionAccess().getRhsSummarizeExpressionParserRuleCall_2_2_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleSummarizeExpression_in_ruleModelDefinition519);
                    lv_rhs_13_0=ruleSummarizeExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getModelDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"rhs",
                            		lv_rhs_13_0, 
                            		"SummarizeExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_14=(Token)match(input,20,FOLLOW_20_in_ruleModelDefinition533); 

                	newLeafNode(otherlv_14, grammarAccess.getModelDefinitionAccess().getSemicolonKeyword_3());
                

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


    // $ANTLR start "entryRuleRecordExpression"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:335:1: entryRuleRecordExpression returns [EObject current=null] : iv_ruleRecordExpression= ruleRecordExpression EOF ;
    public final EObject entryRuleRecordExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordExpression = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:336:2: (iv_ruleRecordExpression= ruleRecordExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:337:2: iv_ruleRecordExpression= ruleRecordExpression EOF
            {
             newCompositeNode(grammarAccess.getRecordExpressionRule()); 
            pushFollow(FOLLOW_ruleRecordExpression_in_entryRuleRecordExpression569);
            iv_ruleRecordExpression=ruleRecordExpression();

            state._fsp--;

             current =iv_ruleRecordExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordExpression579); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:344:1: ruleRecordExpression returns [EObject current=null] : ( ( (lv_terms_0_0= ruleRecordTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleRecordTerm ) ) )* ) ;
    public final EObject ruleRecordExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_terms_0_0 = null;

        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:347:28: ( ( ( (lv_terms_0_0= ruleRecordTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleRecordTerm ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:348:1: ( ( (lv_terms_0_0= ruleRecordTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleRecordTerm ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:348:1: ( ( (lv_terms_0_0= ruleRecordTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleRecordTerm ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:348:2: ( (lv_terms_0_0= ruleRecordTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleRecordTerm ) ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:348:2: ( (lv_terms_0_0= ruleRecordTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:349:1: (lv_terms_0_0= ruleRecordTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:349:1: (lv_terms_0_0= ruleRecordTerm )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:350:3: lv_terms_0_0= ruleRecordTerm
            {
             
            	        newCompositeNode(grammarAccess.getRecordExpressionAccess().getTermsRecordTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRecordTerm_in_ruleRecordExpression625);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:366:2: (otherlv_1= '+' ( (lv_terms_2_0= ruleRecordTerm ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:366:4: otherlv_1= '+' ( (lv_terms_2_0= ruleRecordTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleRecordExpression638); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRecordExpressionAccess().getPlusSignKeyword_1_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:370:1: ( (lv_terms_2_0= ruleRecordTerm ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:371:1: (lv_terms_2_0= ruleRecordTerm )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:371:1: (lv_terms_2_0= ruleRecordTerm )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:372:3: lv_terms_2_0= ruleRecordTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecordExpressionAccess().getTermsRecordTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRecordTerm_in_ruleRecordExpression659);
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
            	    break loop6;
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:396:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:397:2: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:398:2: iv_ruleRecordTerm= ruleRecordTerm EOF
            {
             newCompositeNode(grammarAccess.getRecordTermRule()); 
            pushFollow(FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm697);
            iv_ruleRecordTerm=ruleRecordTerm();

            state._fsp--;

             current =iv_ruleRecordTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordTerm707); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:405:1: ruleRecordTerm returns [EObject current=null] : ( (otherlv_0= '{' () ( (lv_properties_2_0= rulePropertyDefinition ) )* otherlv_3= '}' ) | ( (lv_reference_4_0= ruleModelReference ) ) ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_properties_2_0 = null;

        EObject lv_reference_4_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:408:28: ( ( (otherlv_0= '{' () ( (lv_properties_2_0= rulePropertyDefinition ) )* otherlv_3= '}' ) | ( (lv_reference_4_0= ruleModelReference ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:409:1: ( (otherlv_0= '{' () ( (lv_properties_2_0= rulePropertyDefinition ) )* otherlv_3= '}' ) | ( (lv_reference_4_0= ruleModelReference ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:409:1: ( (otherlv_0= '{' () ( (lv_properties_2_0= rulePropertyDefinition ) )* otherlv_3= '}' ) | ( (lv_reference_4_0= ruleModelReference ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_NAME_TOKEN||LA8_0==16||(LA8_0>=18 && LA8_0<=19)) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:409:2: (otherlv_0= '{' () ( (lv_properties_2_0= rulePropertyDefinition ) )* otherlv_3= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:409:2: (otherlv_0= '{' () ( (lv_properties_2_0= rulePropertyDefinition ) )* otherlv_3= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:409:4: otherlv_0= '{' () ( (lv_properties_2_0= rulePropertyDefinition ) )* otherlv_3= '}'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleRecordTerm745); 

                        	newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftCurlyBracketKeyword_0_0());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:413:1: ()
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:414:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getRecordTermAccess().getRecordTermAction_0_1(),
                                current);
                        

                    }

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:419:2: ( (lv_properties_2_0= rulePropertyDefinition ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_NAME_TOKEN)||LA7_0==16||(LA7_0>=18 && LA7_0<=19)||LA7_0==27) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:420:1: (lv_properties_2_0= rulePropertyDefinition )
                    	    {
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:420:1: (lv_properties_2_0= rulePropertyDefinition )
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:421:3: lv_properties_2_0= rulePropertyDefinition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRecordTermAccess().getPropertiesPropertyDefinitionParserRuleCall_0_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleRecordTerm775);
                    	    lv_properties_2_0=rulePropertyDefinition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRecordTermRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"properties",
                    	            		lv_properties_2_0, 
                    	            		"PropertyDefinition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);

                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleRecordTerm788); 

                        	newLeafNode(otherlv_3, grammarAccess.getRecordTermAccess().getRightCurlyBracketKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:442:6: ( (lv_reference_4_0= ruleModelReference ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:442:6: ( (lv_reference_4_0= ruleModelReference ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:443:1: (lv_reference_4_0= ruleModelReference )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:443:1: (lv_reference_4_0= ruleModelReference )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:444:3: lv_reference_4_0= ruleModelReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getRecordTermAccess().getReferenceModelReferenceParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModelReference_in_ruleRecordTerm816);
                    lv_reference_4_0=ruleModelReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRecordTermRule());
                    	        }
                           		set(
                           			current, 
                           			"reference",
                            		lv_reference_4_0, 
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:468:1: entryRuleModelReference returns [EObject current=null] : iv_ruleModelReference= ruleModelReference EOF ;
    public final EObject entryRuleModelReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelReference = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:469:2: (iv_ruleModelReference= ruleModelReference EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:470:2: iv_ruleModelReference= ruleModelReference EOF
            {
             newCompositeNode(grammarAccess.getModelReferenceRule()); 
            pushFollow(FOLLOW_ruleModelReference_in_entryRuleModelReference852);
            iv_ruleModelReference=ruleModelReference();

            state._fsp--;

             current =iv_ruleModelReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelReference862); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:477:1: ruleModelReference returns [EObject current=null] : ( ( ruleName ) ) ;
    public final EObject ruleModelReference() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:480:28: ( ( ( ruleName ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:481:1: ( ( ruleName ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:481:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:482:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:482:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:483:3: ruleName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getModelReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getModelReferenceAccess().getNameModelDefinitionCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleModelReference909);
            ruleName();

            state._fsp--;

             
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:504:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:505:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:506:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition944);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;

             current =iv_rulePropertyDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition954); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:513:1: rulePropertyDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_expression_6_0= rulePropertyExpression ) ) )? ) | ( ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_expression_9_0= rulePropertyExpression ) ) ) ) otherlv_10= ';' ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_description_0_0 = null;

        EObject lv_attributes_1_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_type_4_0 = null;

        EObject lv_expression_6_0 = null;

        AntlrDatatypeRuleToken lv_name_7_0 = null;

        EObject lv_expression_9_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:516:28: ( ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_expression_6_0= rulePropertyExpression ) ) )? ) | ( ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_expression_9_0= rulePropertyExpression ) ) ) ) otherlv_10= ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:517:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_expression_6_0= rulePropertyExpression ) ) )? ) | ( ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_expression_9_0= rulePropertyExpression ) ) ) ) otherlv_10= ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:517:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_expression_6_0= rulePropertyExpression ) ) )? ) | ( ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_expression_9_0= rulePropertyExpression ) ) ) ) otherlv_10= ';' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:517:2: ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_expression_6_0= rulePropertyExpression ) ) )? ) | ( ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_expression_9_0= rulePropertyExpression ) ) ) ) otherlv_10= ';'
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:517:2: ( (lv_description_0_0= ruleDescription ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:518:1: (lv_description_0_0= ruleDescription )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:518:1: (lv_description_0_0= ruleDescription )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:519:3: lv_description_0_0= ruleDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDescription_in_rulePropertyDefinition1000);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:535:3: ( (lv_attributes_1_0= ruleAttributeList ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==27) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:536:1: (lv_attributes_1_0= ruleAttributeList )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:536:1: (lv_attributes_1_0= ruleAttributeList )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:537:3: lv_attributes_1_0= ruleAttributeList
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getAttributesAttributeListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeList_in_rulePropertyDefinition1022);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:553:3: ( ( ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_expression_6_0= rulePropertyExpression ) ) )? ) | ( ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_expression_9_0= rulePropertyExpression ) ) ) )
            int alt12=2;
            switch ( input.LA(1) ) {
            case RULE_NAME_TOKEN:
                {
                int LA12_1 = input.LA(2);

                if ( (LA12_1==24) ) {
                    alt12=1;
                }
                else if ( (LA12_1==17) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;
                }
                }
                break;
            case 16:
                {
                int LA12_2 = input.LA(2);

                if ( (LA12_2==24) ) {
                    alt12=1;
                }
                else if ( (LA12_2==17) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 2, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                int LA12_3 = input.LA(2);

                if ( (LA12_3==17) ) {
                    alt12=2;
                }
                else if ( (LA12_3==24) ) {
                    alt12=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 3, input);

                    throw nvae;
                }
                }
                break;
            case 19:
                {
                int LA12_4 = input.LA(2);

                if ( (LA12_4==24) ) {
                    alt12=1;
                }
                else if ( (LA12_4==17) ) {
                    alt12=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 4, input);

                    throw nvae;
                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;
            }

            switch (alt12) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:553:4: ( ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_expression_6_0= rulePropertyExpression ) ) )? )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:553:4: ( ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_expression_6_0= rulePropertyExpression ) ) )? )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:553:5: ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) (otherlv_5= '=' ( (lv_expression_6_0= rulePropertyExpression ) ) )?
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:553:5: ( (lv_name_2_0= ruleName ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:554:1: (lv_name_2_0= ruleName )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:554:1: (lv_name_2_0= ruleName )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:555:3: lv_name_2_0= ruleName
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNameNameParserRuleCall_2_0_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleName_in_rulePropertyDefinition1046);
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

                    otherlv_3=(Token)match(input,24,FOLLOW_24_in_rulePropertyDefinition1058); 

                        	newLeafNode(otherlv_3, grammarAccess.getPropertyDefinitionAccess().getColonKeyword_2_0_1());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:575:1: ( (lv_type_4_0= ruleType ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:576:1: (lv_type_4_0= ruleType )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:576:1: (lv_type_4_0= ruleType )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:577:3: lv_type_4_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypeTypeParserRuleCall_2_0_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_rulePropertyDefinition1079);
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

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:593:2: (otherlv_5= '=' ( (lv_expression_6_0= rulePropertyExpression ) ) )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==17) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:593:4: otherlv_5= '=' ( (lv_expression_6_0= rulePropertyExpression ) )
                            {
                            otherlv_5=(Token)match(input,17,FOLLOW_17_in_rulePropertyDefinition1092); 

                                	newLeafNode(otherlv_5, grammarAccess.getPropertyDefinitionAccess().getEqualsSignKeyword_2_0_3_0());
                                
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:597:1: ( (lv_expression_6_0= rulePropertyExpression ) )
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:598:1: (lv_expression_6_0= rulePropertyExpression )
                            {
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:598:1: (lv_expression_6_0= rulePropertyExpression )
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:599:3: lv_expression_6_0= rulePropertyExpression
                            {
                             
                            	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getExpressionPropertyExpressionParserRuleCall_2_0_3_1_0()); 
                            	    
                            pushFollow(FOLLOW_rulePropertyExpression_in_rulePropertyDefinition1113);
                            lv_expression_6_0=rulePropertyExpression();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"expression",
                                    		lv_expression_6_0, 
                                    		"PropertyExpression");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }


                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:616:6: ( ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_expression_9_0= rulePropertyExpression ) ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:616:6: ( ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_expression_9_0= rulePropertyExpression ) ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:616:7: ( (lv_name_7_0= ruleName ) ) otherlv_8= '=' ( (lv_expression_9_0= rulePropertyExpression ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:616:7: ( (lv_name_7_0= ruleName ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:617:1: (lv_name_7_0= ruleName )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:617:1: (lv_name_7_0= ruleName )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:618:3: lv_name_7_0= ruleName
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNameNameParserRuleCall_2_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleName_in_rulePropertyDefinition1144);
                    lv_name_7_0=ruleName();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"name",
                            		lv_name_7_0, 
                            		"Name");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_17_in_rulePropertyDefinition1156); 

                        	newLeafNode(otherlv_8, grammarAccess.getPropertyDefinitionAccess().getEqualsSignKeyword_2_1_1());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:638:1: ( (lv_expression_9_0= rulePropertyExpression ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:639:1: (lv_expression_9_0= rulePropertyExpression )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:639:1: (lv_expression_9_0= rulePropertyExpression )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:640:3: lv_expression_9_0= rulePropertyExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getExpressionPropertyExpressionParserRuleCall_2_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyExpression_in_rulePropertyDefinition1177);
                    lv_expression_9_0=rulePropertyExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_9_0, 
                            		"PropertyExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }

            otherlv_10=(Token)match(input,20,FOLLOW_20_in_rulePropertyDefinition1191); 

                	newLeafNode(otherlv_10, grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_3());
                

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


    // $ANTLR start "entryRulePropertyExpression"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:668:1: entryRulePropertyExpression returns [EObject current=null] : iv_rulePropertyExpression= rulePropertyExpression EOF ;
    public final EObject entryRulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpression = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:669:2: (iv_rulePropertyExpression= rulePropertyExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:670:2: iv_rulePropertyExpression= rulePropertyExpression EOF
            {
             newCompositeNode(grammarAccess.getPropertyExpressionRule()); 
            pushFollow(FOLLOW_rulePropertyExpression_in_entryRulePropertyExpression1227);
            iv_rulePropertyExpression=rulePropertyExpression();

            state._fsp--;

             current =iv_rulePropertyExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyExpression1237); 

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
    // $ANTLR end "entryRulePropertyExpression"


    // $ANTLR start "rulePropertyExpression"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:677:1: rulePropertyExpression returns [EObject current=null] : ( ( (lv_expression_0_0= rulePropertyExpressionList ) ) | ( (lv_expression_1_0= rulePropertyExpressionMap ) ) | ( (lv_expression_2_0= rulePropertyExpressionReference ) ) ) ;
    public final EObject rulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        EObject lv_expression_1_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:680:28: ( ( ( (lv_expression_0_0= rulePropertyExpressionList ) ) | ( (lv_expression_1_0= rulePropertyExpressionMap ) ) | ( (lv_expression_2_0= rulePropertyExpressionReference ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:681:1: ( ( (lv_expression_0_0= rulePropertyExpressionList ) ) | ( (lv_expression_1_0= rulePropertyExpressionMap ) ) | ( (lv_expression_2_0= rulePropertyExpressionReference ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:681:1: ( ( (lv_expression_0_0= rulePropertyExpressionList ) ) | ( (lv_expression_1_0= rulePropertyExpressionMap ) ) | ( (lv_expression_2_0= rulePropertyExpressionReference ) ) )
            int alt13=3;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==22) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==RULE_STRING||(LA13_1>=RULE_INT && LA13_1<=RULE_DECIMAL)||LA13_1==24) ) {
                    alt13=2;
                }
                else if ( (LA13_1==RULE_NAME_TOKEN||LA13_1==16||(LA13_1>=18 && LA13_1<=19)||LA13_1==23) ) {
                    alt13=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;
                }
            }
            else if ( (LA13_0==RULE_NAME_TOKEN||LA13_0==16||(LA13_0>=18 && LA13_0<=19)) ) {
                alt13=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;
            }
            switch (alt13) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:681:2: ( (lv_expression_0_0= rulePropertyExpressionList ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:681:2: ( (lv_expression_0_0= rulePropertyExpressionList ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:682:1: (lv_expression_0_0= rulePropertyExpressionList )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:682:1: (lv_expression_0_0= rulePropertyExpressionList )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:683:3: lv_expression_0_0= rulePropertyExpressionList
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyExpressionAccess().getExpressionPropertyExpressionListParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyExpressionList_in_rulePropertyExpression1283);
                    lv_expression_0_0=rulePropertyExpressionList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_0_0, 
                            		"PropertyExpressionList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:700:6: ( (lv_expression_1_0= rulePropertyExpressionMap ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:700:6: ( (lv_expression_1_0= rulePropertyExpressionMap ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:701:1: (lv_expression_1_0= rulePropertyExpressionMap )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:701:1: (lv_expression_1_0= rulePropertyExpressionMap )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:702:3: lv_expression_1_0= rulePropertyExpressionMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyExpressionAccess().getExpressionPropertyExpressionMapParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyExpressionMap_in_rulePropertyExpression1310);
                    lv_expression_1_0=rulePropertyExpressionMap();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_1_0, 
                            		"PropertyExpressionMap");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:719:6: ( (lv_expression_2_0= rulePropertyExpressionReference ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:719:6: ( (lv_expression_2_0= rulePropertyExpressionReference ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:720:1: (lv_expression_2_0= rulePropertyExpressionReference )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:720:1: (lv_expression_2_0= rulePropertyExpressionReference )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:721:3: lv_expression_2_0= rulePropertyExpressionReference
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyExpressionAccess().getExpressionPropertyExpressionReferenceParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyExpressionReference_in_rulePropertyExpression1337);
                    lv_expression_2_0=rulePropertyExpressionReference();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_2_0, 
                            		"PropertyExpressionReference");
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
    // $ANTLR end "rulePropertyExpression"


    // $ANTLR start "entryRulePropertyExpressionList"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:745:1: entryRulePropertyExpressionList returns [EObject current=null] : iv_rulePropertyExpressionList= rulePropertyExpressionList EOF ;
    public final EObject entryRulePropertyExpressionList() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpressionList = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:746:2: (iv_rulePropertyExpressionList= rulePropertyExpressionList EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:747:2: iv_rulePropertyExpressionList= rulePropertyExpressionList EOF
            {
             newCompositeNode(grammarAccess.getPropertyExpressionListRule()); 
            pushFollow(FOLLOW_rulePropertyExpressionList_in_entryRulePropertyExpressionList1373);
            iv_rulePropertyExpressionList=rulePropertyExpressionList();

            state._fsp--;

             current =iv_rulePropertyExpressionList; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyExpressionList1383); 

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
    // $ANTLR end "entryRulePropertyExpressionList"


    // $ANTLR start "rulePropertyExpressionList"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:754:1: rulePropertyExpressionList returns [EObject current=null] : ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' ( ( ruleName ) ) (otherlv_5= ',' ( ( ruleName ) ) )* (otherlv_7= ',' )? otherlv_8= '}' ) ) ;
    public final EObject rulePropertyExpressionList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:757:28: ( ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' ( ( ruleName ) ) (otherlv_5= ',' ( ( ruleName ) ) )* (otherlv_7= ',' )? otherlv_8= '}' ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:758:1: ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' ( ( ruleName ) ) (otherlv_5= ',' ( ( ruleName ) ) )* (otherlv_7= ',' )? otherlv_8= '}' ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:758:1: ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' ( ( ruleName ) ) (otherlv_5= ',' ( ( ruleName ) ) )* (otherlv_7= ',' )? otherlv_8= '}' ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==22) ) {
                int LA16_1 = input.LA(2);

                if ( (LA16_1==RULE_NAME_TOKEN||LA16_1==16||(LA16_1>=18 && LA16_1<=19)) ) {
                    alt16=2;
                }
                else if ( (LA16_1==23) ) {
                    alt16=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 16, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:758:2: ( () otherlv_1= '{' otherlv_2= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:758:2: ( () otherlv_1= '{' otherlv_2= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:758:3: () otherlv_1= '{' otherlv_2= '}'
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:758:3: ()
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:759:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPropertyExpressionListAccess().getPropertyExpressionListAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulePropertyExpressionList1430); 

                        	newLeafNode(otherlv_1, grammarAccess.getPropertyExpressionListAccess().getLeftCurlyBracketKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_rulePropertyExpressionList1442); 

                        	newLeafNode(otherlv_2, grammarAccess.getPropertyExpressionListAccess().getRightCurlyBracketKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:773:6: (otherlv_3= '{' ( ( ruleName ) ) (otherlv_5= ',' ( ( ruleName ) ) )* (otherlv_7= ',' )? otherlv_8= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:773:6: (otherlv_3= '{' ( ( ruleName ) ) (otherlv_5= ',' ( ( ruleName ) ) )* (otherlv_7= ',' )? otherlv_8= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:773:8: otherlv_3= '{' ( ( ruleName ) ) (otherlv_5= ',' ( ( ruleName ) ) )* (otherlv_7= ',' )? otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_rulePropertyExpressionList1462); 

                        	newLeafNode(otherlv_3, grammarAccess.getPropertyExpressionListAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:777:1: ( ( ruleName ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:778:1: ( ruleName )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:778:1: ( ruleName )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:779:3: ruleName
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPropertyExpressionListRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPropertyExpressionListAccess().getElementsPropertyCrossReference_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleName_in_rulePropertyExpressionList1485);
                    ruleName();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:792:2: (otherlv_5= ',' ( ( ruleName ) ) )*
                    loop14:
                    do {
                        int alt14=2;
                        int LA14_0 = input.LA(1);

                        if ( (LA14_0==25) ) {
                            int LA14_1 = input.LA(2);

                            if ( (LA14_1==RULE_NAME_TOKEN||LA14_1==16||(LA14_1>=18 && LA14_1<=19)) ) {
                                alt14=1;
                            }


                        }


                        switch (alt14) {
                    	case 1 :
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:792:4: otherlv_5= ',' ( ( ruleName ) )
                    	    {
                    	    otherlv_5=(Token)match(input,25,FOLLOW_25_in_rulePropertyExpressionList1498); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getPropertyExpressionListAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:796:1: ( ( ruleName ) )
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:797:1: ( ruleName )
                    	    {
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:797:1: ( ruleName )
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:798:3: ruleName
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getPropertyExpressionListRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertyExpressionListAccess().getElementsPropertyCrossReference_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleName_in_rulePropertyExpressionList1521);
                    	    ruleName();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop14;
                        }
                    } while (true);

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:811:4: (otherlv_7= ',' )?
                    int alt15=2;
                    int LA15_0 = input.LA(1);

                    if ( (LA15_0==25) ) {
                        alt15=1;
                    }
                    switch (alt15) {
                        case 1 :
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:811:6: otherlv_7= ','
                            {
                            otherlv_7=(Token)match(input,25,FOLLOW_25_in_rulePropertyExpressionList1536); 

                                	newLeafNode(otherlv_7, grammarAccess.getPropertyExpressionListAccess().getCommaKeyword_1_3());
                                

                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_rulePropertyExpressionList1550); 

                        	newLeafNode(otherlv_8, grammarAccess.getPropertyExpressionListAccess().getRightCurlyBracketKeyword_1_4());
                        

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
    // $ANTLR end "rulePropertyExpressionList"


    // $ANTLR start "entryRulePropertyExpressionMap"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:827:1: entryRulePropertyExpressionMap returns [EObject current=null] : iv_rulePropertyExpressionMap= rulePropertyExpressionMap EOF ;
    public final EObject entryRulePropertyExpressionMap() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpressionMap = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:828:2: (iv_rulePropertyExpressionMap= rulePropertyExpressionMap EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:829:2: iv_rulePropertyExpressionMap= rulePropertyExpressionMap EOF
            {
             newCompositeNode(grammarAccess.getPropertyExpressionMapRule()); 
            pushFollow(FOLLOW_rulePropertyExpressionMap_in_entryRulePropertyExpressionMap1587);
            iv_rulePropertyExpressionMap=rulePropertyExpressionMap();

            state._fsp--;

             current =iv_rulePropertyExpressionMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyExpressionMap1597); 

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
    // $ANTLR end "entryRulePropertyExpressionMap"


    // $ANTLR start "rulePropertyExpressionMap"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:836:1: rulePropertyExpressionMap returns [EObject current=null] : ( ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' ) | (otherlv_4= '{' ( (lv_elements_5_0= rulePropertyExpressionMapEntry ) ) (otherlv_6= ',' ( (lv_elements_7_0= rulePropertyExpressionMapEntry ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) ) ;
    public final EObject rulePropertyExpressionMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_elements_5_0 = null;

        EObject lv_elements_7_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:839:28: ( ( ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' ) | (otherlv_4= '{' ( (lv_elements_5_0= rulePropertyExpressionMapEntry ) ) (otherlv_6= ',' ( (lv_elements_7_0= rulePropertyExpressionMapEntry ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:840:1: ( ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' ) | (otherlv_4= '{' ( (lv_elements_5_0= rulePropertyExpressionMapEntry ) ) (otherlv_6= ',' ( (lv_elements_7_0= rulePropertyExpressionMapEntry ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:840:1: ( ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' ) | (otherlv_4= '{' ( (lv_elements_5_0= rulePropertyExpressionMapEntry ) ) (otherlv_6= ',' ( (lv_elements_7_0= rulePropertyExpressionMapEntry ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==22) ) {
                int LA19_1 = input.LA(2);

                if ( (LA19_1==RULE_STRING||(LA19_1>=RULE_INT && LA19_1<=RULE_DECIMAL)) ) {
                    alt19=2;
                }
                else if ( (LA19_1==24) ) {
                    alt19=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 19, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;
            }
            switch (alt19) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:840:2: ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:840:2: ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:840:3: () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}'
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:840:3: ()
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:841:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPropertyExpressionMapAccess().getPropertyExpressionMapAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_rulePropertyExpressionMap1644); 

                        	newLeafNode(otherlv_1, grammarAccess.getPropertyExpressionMapAccess().getLeftCurlyBracketKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_rulePropertyExpressionMap1656); 

                        	newLeafNode(otherlv_2, grammarAccess.getPropertyExpressionMapAccess().getColonKeyword_0_2());
                        
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_rulePropertyExpressionMap1668); 

                        	newLeafNode(otherlv_3, grammarAccess.getPropertyExpressionMapAccess().getRightCurlyBracketKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:859:6: (otherlv_4= '{' ( (lv_elements_5_0= rulePropertyExpressionMapEntry ) ) (otherlv_6= ',' ( (lv_elements_7_0= rulePropertyExpressionMapEntry ) ) )* (otherlv_8= ',' )? otherlv_9= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:859:6: (otherlv_4= '{' ( (lv_elements_5_0= rulePropertyExpressionMapEntry ) ) (otherlv_6= ',' ( (lv_elements_7_0= rulePropertyExpressionMapEntry ) ) )* (otherlv_8= ',' )? otherlv_9= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:859:8: otherlv_4= '{' ( (lv_elements_5_0= rulePropertyExpressionMapEntry ) ) (otherlv_6= ',' ( (lv_elements_7_0= rulePropertyExpressionMapEntry ) ) )* (otherlv_8= ',' )? otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_rulePropertyExpressionMap1688); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertyExpressionMapAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:863:1: ( (lv_elements_5_0= rulePropertyExpressionMapEntry ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:864:1: (lv_elements_5_0= rulePropertyExpressionMapEntry )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:864:1: (lv_elements_5_0= rulePropertyExpressionMapEntry )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:865:3: lv_elements_5_0= rulePropertyExpressionMapEntry
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyExpressionMapAccess().getElementsPropertyExpressionMapEntryParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyExpressionMapEntry_in_rulePropertyExpressionMap1709);
                    lv_elements_5_0=rulePropertyExpressionMapEntry();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyExpressionMapRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_5_0, 
                            		"PropertyExpressionMapEntry");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:881:2: (otherlv_6= ',' ( (lv_elements_7_0= rulePropertyExpressionMapEntry ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==25) ) {
                            int LA17_1 = input.LA(2);

                            if ( (LA17_1==RULE_STRING||(LA17_1>=RULE_INT && LA17_1<=RULE_DECIMAL)) ) {
                                alt17=1;
                            }


                        }


                        switch (alt17) {
                    	case 1 :
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:881:4: otherlv_6= ',' ( (lv_elements_7_0= rulePropertyExpressionMapEntry ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_25_in_rulePropertyExpressionMap1722); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getPropertyExpressionMapAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:885:1: ( (lv_elements_7_0= rulePropertyExpressionMapEntry ) )
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:886:1: (lv_elements_7_0= rulePropertyExpressionMapEntry )
                    	    {
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:886:1: (lv_elements_7_0= rulePropertyExpressionMapEntry )
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:887:3: lv_elements_7_0= rulePropertyExpressionMapEntry
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPropertyExpressionMapAccess().getElementsPropertyExpressionMapEntryParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_rulePropertyExpressionMapEntry_in_rulePropertyExpressionMap1743);
                    	    lv_elements_7_0=rulePropertyExpressionMapEntry();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPropertyExpressionMapRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_7_0, 
                    	            		"PropertyExpressionMapEntry");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:903:4: (otherlv_8= ',' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==25) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:903:6: otherlv_8= ','
                            {
                            otherlv_8=(Token)match(input,25,FOLLOW_25_in_rulePropertyExpressionMap1758); 

                                	newLeafNode(otherlv_8, grammarAccess.getPropertyExpressionMapAccess().getCommaKeyword_1_3());
                                

                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_rulePropertyExpressionMap1772); 

                        	newLeafNode(otherlv_9, grammarAccess.getPropertyExpressionMapAccess().getRightCurlyBracketKeyword_1_4());
                        

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
    // $ANTLR end "rulePropertyExpressionMap"


    // $ANTLR start "entryRulePropertyExpressionMapEntry"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:919:1: entryRulePropertyExpressionMapEntry returns [EObject current=null] : iv_rulePropertyExpressionMapEntry= rulePropertyExpressionMapEntry EOF ;
    public final EObject entryRulePropertyExpressionMapEntry() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpressionMapEntry = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:920:2: (iv_rulePropertyExpressionMapEntry= rulePropertyExpressionMapEntry EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:921:2: iv_rulePropertyExpressionMapEntry= rulePropertyExpressionMapEntry EOF
            {
             newCompositeNode(grammarAccess.getPropertyExpressionMapEntryRule()); 
            pushFollow(FOLLOW_rulePropertyExpressionMapEntry_in_entryRulePropertyExpressionMapEntry1809);
            iv_rulePropertyExpressionMapEntry=rulePropertyExpressionMapEntry();

            state._fsp--;

             current =iv_rulePropertyExpressionMapEntry; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyExpressionMapEntry1819); 

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
    // $ANTLR end "entryRulePropertyExpressionMapEntry"


    // $ANTLR start "rulePropertyExpressionMapEntry"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:928:1: rulePropertyExpressionMapEntry returns [EObject current=null] : ( ( (lv_name_0_0= ruleLiteral ) ) otherlv_1= ':' ( ( ruleName ) ) ) ;
    public final EObject rulePropertyExpressionMapEntry() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:931:28: ( ( ( (lv_name_0_0= ruleLiteral ) ) otherlv_1= ':' ( ( ruleName ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:932:1: ( ( (lv_name_0_0= ruleLiteral ) ) otherlv_1= ':' ( ( ruleName ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:932:1: ( ( (lv_name_0_0= ruleLiteral ) ) otherlv_1= ':' ( ( ruleName ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:932:2: ( (lv_name_0_0= ruleLiteral ) ) otherlv_1= ':' ( ( ruleName ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:932:2: ( (lv_name_0_0= ruleLiteral ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:933:1: (lv_name_0_0= ruleLiteral )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:933:1: (lv_name_0_0= ruleLiteral )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:934:3: lv_name_0_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getPropertyExpressionMapEntryAccess().getNameLiteralParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_rulePropertyExpressionMapEntry1865);
            lv_name_0_0=ruleLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyExpressionMapEntryRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Literal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_rulePropertyExpressionMapEntry1877); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyExpressionMapEntryAccess().getColonKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:954:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:955:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:955:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:956:3: ruleName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyExpressionMapEntryRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPropertyExpressionMapEntryAccess().getPropertyPropertyCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyExpressionMapEntry1900);
            ruleName();

            state._fsp--;

             
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
    // $ANTLR end "rulePropertyExpressionMapEntry"


    // $ANTLR start "entryRulePropertyExpressionReference"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:977:1: entryRulePropertyExpressionReference returns [EObject current=null] : iv_rulePropertyExpressionReference= rulePropertyExpressionReference EOF ;
    public final EObject entryRulePropertyExpressionReference() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpressionReference = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:978:2: (iv_rulePropertyExpressionReference= rulePropertyExpressionReference EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:979:2: iv_rulePropertyExpressionReference= rulePropertyExpressionReference EOF
            {
             newCompositeNode(grammarAccess.getPropertyExpressionReferenceRule()); 
            pushFollow(FOLLOW_rulePropertyExpressionReference_in_entryRulePropertyExpressionReference1936);
            iv_rulePropertyExpressionReference=rulePropertyExpressionReference();

            state._fsp--;

             current =iv_rulePropertyExpressionReference; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyExpressionReference1946); 

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
    // $ANTLR end "entryRulePropertyExpressionReference"


    // $ANTLR start "rulePropertyExpressionReference"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:986:1: rulePropertyExpressionReference returns [EObject current=null] : ( ( ( ruleName ) ) otherlv_1= '.' ( ( ruleName ) ) ) ;
    public final EObject rulePropertyExpressionReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:989:28: ( ( ( ( ruleName ) ) otherlv_1= '.' ( ( ruleName ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:990:1: ( ( ( ruleName ) ) otherlv_1= '.' ( ( ruleName ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:990:1: ( ( ( ruleName ) ) otherlv_1= '.' ( ( ruleName ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:990:2: ( ( ruleName ) ) otherlv_1= '.' ( ( ruleName ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:990:2: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:991:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:991:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:992:3: ruleName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyExpressionReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPropertyExpressionReferenceAccess().getModelNameModelDefinitionCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyExpressionReference1994);
            ruleName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_rulePropertyExpressionReference2006); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyExpressionReferenceAccess().getFullStopKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1009:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1010:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1010:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1011:3: ruleName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyExpressionReferenceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPropertyExpressionReferenceAccess().getNamePropertyCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyExpressionReference2029);
            ruleName();

            state._fsp--;

             
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
    // $ANTLR end "rulePropertyExpressionReference"


    // $ANTLR start "entryRuleType"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1032:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1033:2: (iv_ruleType= ruleType EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1034:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2065);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2075); 

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
    // $ANTLR end "entryRuleType"


    // $ANTLR start "ruleType"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1041:1: ruleType returns [EObject current=null] : ( ( (lv_basicType_0_0= ruleBasicType ) ) | ( (lv_collectionType_1_0= ruleCollectionType ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_basicType_0_0 = null;

        EObject lv_collectionType_1_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1044:28: ( ( ( (lv_basicType_0_0= ruleBasicType ) ) | ( (lv_collectionType_1_0= ruleCollectionType ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1045:1: ( ( (lv_basicType_0_0= ruleBasicType ) ) | ( (lv_collectionType_1_0= ruleCollectionType ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1045:1: ( ( (lv_basicType_0_0= ruleBasicType ) ) | ( (lv_collectionType_1_0= ruleCollectionType ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( ((LA20_0>=33 && LA20_0<=43)) ) {
                alt20=1;
            }
            else if ( (LA20_0==22) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1045:2: ( (lv_basicType_0_0= ruleBasicType ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1045:2: ( (lv_basicType_0_0= ruleBasicType ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1046:1: (lv_basicType_0_0= ruleBasicType )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1046:1: (lv_basicType_0_0= ruleBasicType )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1047:3: lv_basicType_0_0= ruleBasicType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getBasicTypeBasicTypeEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBasicType_in_ruleType2121);
                    lv_basicType_0_0=ruleBasicType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"basicType",
                            		lv_basicType_0_0, 
                            		"BasicType");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1064:6: ( (lv_collectionType_1_0= ruleCollectionType ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1064:6: ( (lv_collectionType_1_0= ruleCollectionType ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1065:1: (lv_collectionType_1_0= ruleCollectionType )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1065:1: (lv_collectionType_1_0= ruleCollectionType )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1066:3: lv_collectionType_1_0= ruleCollectionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getCollectionTypeCollectionTypeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionType_in_ruleType2148);
                    lv_collectionType_1_0=ruleCollectionType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"collectionType",
                            		lv_collectionType_1_0, 
                            		"CollectionType");
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
    // $ANTLR end "ruleType"


    // $ANTLR start "entryRuleJoinExpression"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1090:1: entryRuleJoinExpression returns [EObject current=null] : iv_ruleJoinExpression= ruleJoinExpression EOF ;
    public final EObject entryRuleJoinExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinExpression = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1091:2: (iv_ruleJoinExpression= ruleJoinExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1092:2: iv_ruleJoinExpression= ruleJoinExpression EOF
            {
             newCompositeNode(grammarAccess.getJoinExpressionRule()); 
            pushFollow(FOLLOW_ruleJoinExpression_in_entryRuleJoinExpression2184);
            iv_ruleJoinExpression=ruleJoinExpression();

            state._fsp--;

             current =iv_ruleJoinExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinExpression2194); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1099:1: ruleJoinExpression returns [EObject current=null] : ( ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )* ) ;
    public final EObject ruleJoinExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_terms_0_0 = null;

        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1102:28: ( ( ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1103:1: ( ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1103:1: ( ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1103:2: ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1103:2: ( (lv_terms_0_0= ruleJoinTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1104:1: (lv_terms_0_0= ruleJoinTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1104:1: (lv_terms_0_0= ruleJoinTerm )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1105:3: lv_terms_0_0= ruleJoinTerm
            {
             
            	        newCompositeNode(grammarAccess.getJoinExpressionAccess().getTermsJoinTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleJoinTerm_in_ruleJoinExpression2240);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1121:2: (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1121:4: otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleJoinExpression2253); 

            	        	newLeafNode(otherlv_1, grammarAccess.getJoinExpressionAccess().getPlusSignKeyword_1_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1125:1: ( (lv_terms_2_0= ruleJoinTerm ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1126:1: (lv_terms_2_0= ruleJoinTerm )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1126:1: (lv_terms_2_0= ruleJoinTerm )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1127:3: lv_terms_2_0= ruleJoinTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJoinExpressionAccess().getTermsJoinTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJoinTerm_in_ruleJoinExpression2274);
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
            	    break loop21;
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1151:1: entryRuleJoinTerm returns [EObject current=null] : iv_ruleJoinTerm= ruleJoinTerm EOF ;
    public final EObject entryRuleJoinTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinTerm = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1152:2: (iv_ruleJoinTerm= ruleJoinTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1153:2: iv_ruleJoinTerm= ruleJoinTerm EOF
            {
             newCompositeNode(grammarAccess.getJoinTermRule()); 
            pushFollow(FOLLOW_ruleJoinTerm_in_entryRuleJoinTerm2312);
            iv_ruleJoinTerm=ruleJoinTerm();

            state._fsp--;

             current =iv_ruleJoinTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinTerm2322); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1160:1: ruleJoinTerm returns [EObject current=null] : ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )? ) ;
    public final EObject ruleJoinTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_reference_0_0 = null;

        EObject lv_mapping_1_0 = null;

        EObject lv_grouping_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1163:28: ( ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )? ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1164:1: ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1164:1: ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )? )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1164:2: ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )?
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1164:2: ( (lv_reference_0_0= ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1165:1: (lv_reference_0_0= ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1165:1: (lv_reference_0_0= ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1166:3: lv_reference_0_0= ruleModelReference
            {
             
            	        newCompositeNode(grammarAccess.getJoinTermAccess().getReferenceModelReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModelReference_in_ruleJoinTerm2368);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1182:2: ( (lv_mapping_1_0= ruleModelMapping ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1183:1: (lv_mapping_1_0= ruleModelMapping )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1183:1: (lv_mapping_1_0= ruleModelMapping )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1184:3: lv_mapping_1_0= ruleModelMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getJoinTermAccess().getMappingModelMappingParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModelMapping_in_ruleJoinTerm2389);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1200:3: ( (lv_grouping_2_0= ruleGrouping ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==30) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1201:1: (lv_grouping_2_0= ruleGrouping )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1201:1: (lv_grouping_2_0= ruleGrouping )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1202:3: lv_grouping_2_0= ruleGrouping
                    {
                     
                    	        newCompositeNode(grammarAccess.getJoinTermAccess().getGroupingGroupingParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGrouping_in_ruleJoinTerm2411);
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


    // $ANTLR start "entryRuleSummarizeExpression"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1226:1: entryRuleSummarizeExpression returns [EObject current=null] : iv_ruleSummarizeExpression= ruleSummarizeExpression EOF ;
    public final EObject entryRuleSummarizeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSummarizeExpression = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1227:2: (iv_ruleSummarizeExpression= ruleSummarizeExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1228:2: iv_ruleSummarizeExpression= ruleSummarizeExpression EOF
            {
             newCompositeNode(grammarAccess.getSummarizeExpressionRule()); 
            pushFollow(FOLLOW_ruleSummarizeExpression_in_entryRuleSummarizeExpression2448);
            iv_ruleSummarizeExpression=ruleSummarizeExpression();

            state._fsp--;

             current =iv_ruleSummarizeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeExpression2458); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1235:1: ruleSummarizeExpression returns [EObject current=null] : ( ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )* ) ;
    public final EObject ruleSummarizeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_terms_0_0 = null;

        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1238:28: ( ( ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1239:1: ( ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1239:1: ( ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1239:2: ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1239:2: ( (lv_terms_0_0= ruleSummarizeTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1240:1: (lv_terms_0_0= ruleSummarizeTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1240:1: (lv_terms_0_0= ruleSummarizeTerm )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1241:3: lv_terms_0_0= ruleSummarizeTerm
            {
             
            	        newCompositeNode(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSummarizeTerm_in_ruleSummarizeExpression2504);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1257:2: (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==21) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1257:4: otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSummarizeExpression2517); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSummarizeExpressionAccess().getPlusSignKeyword_1_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1261:1: ( (lv_terms_2_0= ruleSummarizeTerm ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1262:1: (lv_terms_2_0= ruleSummarizeTerm )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1262:1: (lv_terms_2_0= ruleSummarizeTerm )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1263:3: lv_terms_2_0= ruleSummarizeTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSummarizeTerm_in_ruleSummarizeExpression2538);
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
            	    break loop24;
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1287:1: entryRuleSummarizeTerm returns [EObject current=null] : iv_ruleSummarizeTerm= ruleSummarizeTerm EOF ;
    public final EObject entryRuleSummarizeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSummarizeTerm = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1288:2: (iv_ruleSummarizeTerm= ruleSummarizeTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1289:2: iv_ruleSummarizeTerm= ruleSummarizeTerm EOF
            {
             newCompositeNode(grammarAccess.getSummarizeTermRule()); 
            pushFollow(FOLLOW_ruleSummarizeTerm_in_entryRuleSummarizeTerm2576);
            iv_ruleSummarizeTerm=ruleSummarizeTerm();

            state._fsp--;

             current =iv_ruleSummarizeTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeTerm2586); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1296:1: ruleSummarizeTerm returns [EObject current=null] : ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )? ) ;
    public final EObject ruleSummarizeTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_reference_0_0 = null;

        EObject lv_folding_1_0 = null;

        EObject lv_grouping_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1299:28: ( ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )? ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1300:1: ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1300:1: ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )? )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1300:2: ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )?
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1300:2: ( (lv_reference_0_0= ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1301:1: (lv_reference_0_0= ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1301:1: (lv_reference_0_0= ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1302:3: lv_reference_0_0= ruleModelReference
            {
             
            	        newCompositeNode(grammarAccess.getSummarizeTermAccess().getReferenceModelReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModelReference_in_ruleSummarizeTerm2632);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1318:2: ( (lv_folding_1_0= ruleModelFolding ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1319:1: (lv_folding_1_0= ruleModelFolding )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1319:1: (lv_folding_1_0= ruleModelFolding )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1320:3: lv_folding_1_0= ruleModelFolding
            {
             
            	        newCompositeNode(grammarAccess.getSummarizeTermAccess().getFoldingModelFoldingParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleModelFolding_in_ruleSummarizeTerm2653);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1336:2: ( (lv_grouping_2_0= ruleGrouping ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==30) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1337:1: (lv_grouping_2_0= ruleGrouping )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1337:1: (lv_grouping_2_0= ruleGrouping )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1338:3: lv_grouping_2_0= ruleGrouping
                    {
                     
                    	        newCompositeNode(grammarAccess.getSummarizeTermAccess().getGroupingGroupingParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGrouping_in_ruleSummarizeTerm2674);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1362:1: entryRuleDescription returns [String current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final String entryRuleDescription() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDescription = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1363:2: (iv_ruleDescription= ruleDescription EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1364:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription2712);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription2723); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1371:1: ruleDescription returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleDescription() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1374:28: (this_STRING_0= RULE_STRING )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1375:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDescription2762); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1390:1: entryRuleAttributeList returns [EObject current=null] : iv_ruleAttributeList= ruleAttributeList EOF ;
    public final EObject entryRuleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeList = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1391:2: (iv_ruleAttributeList= ruleAttributeList EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1392:2: iv_ruleAttributeList= ruleAttributeList EOF
            {
             newCompositeNode(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_ruleAttributeList_in_entryRuleAttributeList2806);
            iv_ruleAttributeList=ruleAttributeList();

            state._fsp--;

             current =iv_ruleAttributeList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeList2816); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1399:1: ruleAttributeList returns [EObject current=null] : ( (lv_attributes_0_0= ruleAttribute ) )+ ;
    public final EObject ruleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_0_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1402:28: ( ( (lv_attributes_0_0= ruleAttribute ) )+ )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1403:1: ( (lv_attributes_0_0= ruleAttribute ) )+
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1403:1: ( (lv_attributes_0_0= ruleAttribute ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==27) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1404:1: (lv_attributes_0_0= ruleAttribute )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1404:1: (lv_attributes_0_0= ruleAttribute )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1405:3: lv_attributes_0_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleAttributeList2861);
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
            	    if ( cnt26 >= 1 ) break loop26;
                        EarlyExitException eee =
                            new EarlyExitException(26, input);
                        throw eee;
                }
                cnt26++;
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1429:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1430:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1431:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute2897);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute2907); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1438:1: ruleAttribute returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elementBlock_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1441:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )? ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1442:1: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1442:1: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )? )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1442:3: otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )?
            {
            otherlv_0=(Token)match(input,27,FOLLOW_27_in_ruleAttribute2944); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getCommercialAtKeyword_0());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1446:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1447:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1447:1: (lv_name_1_0= ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1448:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAttribute2965);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1464:2: ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==28) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1465:1: (lv_elementBlock_2_0= ruleAttributeElementBlock )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1465:1: (lv_elementBlock_2_0= ruleAttributeElementBlock )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1466:3: lv_elementBlock_2_0= ruleAttributeElementBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getElementBlockAttributeElementBlockParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeElementBlock_in_ruleAttribute2986);
                    lv_elementBlock_2_0=ruleAttributeElementBlock();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeRule());
                    	        }
                           		set(
                           			current, 
                           			"elementBlock",
                            		lv_elementBlock_2_0, 
                            		"AttributeElementBlock");
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
    // $ANTLR end "ruleAttribute"


    // $ANTLR start "entryRuleAttributeElementBlock"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1490:1: entryRuleAttributeElementBlock returns [EObject current=null] : iv_ruleAttributeElementBlock= ruleAttributeElementBlock EOF ;
    public final EObject entryRuleAttributeElementBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeElementBlock = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1491:2: (iv_ruleAttributeElementBlock= ruleAttributeElementBlock EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1492:2: iv_ruleAttributeElementBlock= ruleAttributeElementBlock EOF
            {
             newCompositeNode(grammarAccess.getAttributeElementBlockRule()); 
            pushFollow(FOLLOW_ruleAttributeElementBlock_in_entryRuleAttributeElementBlock3023);
            iv_ruleAttributeElementBlock=ruleAttributeElementBlock();

            state._fsp--;

             current =iv_ruleAttributeElementBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElementBlock3033); 

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
    // $ANTLR end "entryRuleAttributeElementBlock"


    // $ANTLR start "ruleAttributeElementBlock"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1499:1: ruleAttributeElementBlock returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )? otherlv_4= ')' ) ;
    public final EObject ruleAttributeElementBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1502:28: ( ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )? otherlv_4= ')' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1503:1: ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )? otherlv_4= ')' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1503:1: ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )? otherlv_4= ')' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1503:2: () otherlv_1= '(' ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )? otherlv_4= ')'
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1503:2: ()
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1504:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeElementBlockAccess().getAttributeElementBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FOLLOW_28_in_ruleAttributeElementBlock3079); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeElementBlockAccess().getLeftParenthesisKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1513:1: ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_NAME_TOKEN||LA29_0==16||(LA29_0>=18 && LA29_0<=19)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1513:2: ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )?
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1513:2: ( (lv_elements_2_0= ruleAttributeElementList ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1514:1: (lv_elements_2_0= ruleAttributeElementList )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1514:1: (lv_elements_2_0= ruleAttributeElementList )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1515:3: lv_elements_2_0= ruleAttributeElementList
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeElementBlockAccess().getElementsAttributeElementListParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeElementList_in_ruleAttributeElementBlock3101);
                    lv_elements_2_0=ruleAttributeElementList();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeElementBlockRule());
                    	        }
                           		set(
                           			current, 
                           			"elements",
                            		lv_elements_2_0, 
                            		"AttributeElementList");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1531:2: (otherlv_3= ',' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==25) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1531:4: otherlv_3= ','
                            {
                            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleAttributeElementBlock3114); 

                                	newLeafNode(otherlv_3, grammarAccess.getAttributeElementBlockAccess().getCommaKeyword_2_1());
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,29,FOLLOW_29_in_ruleAttributeElementBlock3130); 

                	newLeafNode(otherlv_4, grammarAccess.getAttributeElementBlockAccess().getRightParenthesisKeyword_3());
                

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
    // $ANTLR end "ruleAttributeElementBlock"


    // $ANTLR start "entryRuleAttributeElementList"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1547:1: entryRuleAttributeElementList returns [EObject current=null] : iv_ruleAttributeElementList= ruleAttributeElementList EOF ;
    public final EObject entryRuleAttributeElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeElementList = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1548:2: (iv_ruleAttributeElementList= ruleAttributeElementList EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1549:2: iv_ruleAttributeElementList= ruleAttributeElementList EOF
            {
             newCompositeNode(grammarAccess.getAttributeElementListRule()); 
            pushFollow(FOLLOW_ruleAttributeElementList_in_entryRuleAttributeElementList3166);
            iv_ruleAttributeElementList=ruleAttributeElementList();

            state._fsp--;

             current =iv_ruleAttributeElementList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElementList3176); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1556:1: ruleAttributeElementList returns [EObject current=null] : ( ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )* ) ;
    public final EObject ruleAttributeElementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1559:28: ( ( ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1560:1: ( ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1560:1: ( ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1560:2: ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1560:2: ( (lv_elements_0_0= ruleAttributeElement ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1561:1: (lv_elements_0_0= ruleAttributeElement )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1561:1: (lv_elements_0_0= ruleAttributeElement )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1562:3: lv_elements_0_0= ruleAttributeElement
            {
             
            	        newCompositeNode(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeElement_in_ruleAttributeElementList3222);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1578:2: (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==25) ) {
                    int LA30_1 = input.LA(2);

                    if ( (LA30_1==RULE_NAME_TOKEN||LA30_1==16||(LA30_1>=18 && LA30_1<=19)) ) {
                        alt30=1;
                    }


                }


                switch (alt30) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1578:4: otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleAttributeElementList3235); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAttributeElementListAccess().getCommaKeyword_1_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1582:1: ( (lv_elements_2_0= ruleAttributeElement ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1583:1: (lv_elements_2_0= ruleAttributeElement )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1583:1: (lv_elements_2_0= ruleAttributeElement )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1584:3: lv_elements_2_0= ruleAttributeElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttributeElement_in_ruleAttributeElementList3256);
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
            	    break loop30;
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1608:1: entryRuleAttributeElement returns [EObject current=null] : iv_ruleAttributeElement= ruleAttributeElement EOF ;
    public final EObject entryRuleAttributeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeElement = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1609:2: (iv_ruleAttributeElement= ruleAttributeElement EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1610:2: iv_ruleAttributeElement= ruleAttributeElement EOF
            {
             newCompositeNode(grammarAccess.getAttributeElementRule()); 
            pushFollow(FOLLOW_ruleAttributeElement_in_entryRuleAttributeElement3294);
            iv_ruleAttributeElement=ruleAttributeElement();

            state._fsp--;

             current =iv_ruleAttributeElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElement3304); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1617:1: ruleAttributeElement returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) ) ;
    public final EObject ruleAttributeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1620:28: ( ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1621:1: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1621:1: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1621:2: ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1621:2: ( (lv_name_0_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1622:1: (lv_name_0_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1622:1: (lv_name_0_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1623:3: lv_name_0_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getAttributeElementAccess().getNameNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleAttributeElement3350);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAttributeElement3362); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeElementAccess().getEqualsSignKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1643:1: ( (lv_value_2_0= ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1644:1: (lv_value_2_0= ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1644:1: (lv_value_2_0= ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1645:3: lv_value_2_0= ruleAttributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAttributeElementAccess().getValueAttributeValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeValue_in_ruleAttributeElement3383);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1669:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1670:2: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1671:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue3419);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue3429); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1678:1: ruleAttributeValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleAttributeValueArray ) ) | ( (lv_value_1_0= ruleAttributeValueMap ) ) | ( (lv_value_2_0= ruleQualifiedNameObject ) ) | ( (lv_value_3_0= ruleLiteral ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1681:28: ( ( ( (lv_value_0_0= ruleAttributeValueArray ) ) | ( (lv_value_1_0= ruleAttributeValueMap ) ) | ( (lv_value_2_0= ruleQualifiedNameObject ) ) | ( (lv_value_3_0= ruleLiteral ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1682:1: ( ( (lv_value_0_0= ruleAttributeValueArray ) ) | ( (lv_value_1_0= ruleAttributeValueMap ) ) | ( (lv_value_2_0= ruleQualifiedNameObject ) ) | ( (lv_value_3_0= ruleLiteral ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1682:1: ( ( (lv_value_0_0= ruleAttributeValueArray ) ) | ( (lv_value_1_0= ruleAttributeValueMap ) ) | ( (lv_value_2_0= ruleQualifiedNameObject ) ) | ( (lv_value_3_0= ruleLiteral ) ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                switch ( input.LA(2) ) {
                case RULE_NAME_TOKEN:
                case 16:
                case 18:
                case 19:
                case 22:
                case 23:
                    {
                    alt31=1;
                    }
                    break;
                case RULE_STRING:
                    {
                    int LA31_5 = input.LA(3);

                    if ( (LA31_5==23||LA31_5==25) ) {
                        alt31=1;
                    }
                    else if ( (LA31_5==24) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 5, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA31_6 = input.LA(3);

                    if ( (LA31_6==23||LA31_6==25) ) {
                        alt31=1;
                    }
                    else if ( (LA31_6==24) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_DECIMAL:
                    {
                    int LA31_7 = input.LA(3);

                    if ( (LA31_7==23||LA31_7==25) ) {
                        alt31=1;
                    }
                    else if ( (LA31_7==24) ) {
                        alt31=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case 24:
                    {
                    alt31=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;
                }

                }
                break;
            case RULE_NAME_TOKEN:
            case 16:
            case 18:
            case 19:
                {
                alt31=3;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt31=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1682:2: ( (lv_value_0_0= ruleAttributeValueArray ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1682:2: ( (lv_value_0_0= ruleAttributeValueArray ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1683:1: (lv_value_0_0= ruleAttributeValueArray )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1683:1: (lv_value_0_0= ruleAttributeValueArray )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1684:3: lv_value_0_0= ruleAttributeValueArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueAccess().getValueAttributeValueArrayParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeValueArray_in_ruleAttributeValue3475);
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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1701:6: ( (lv_value_1_0= ruleAttributeValueMap ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1701:6: ( (lv_value_1_0= ruleAttributeValueMap ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1702:1: (lv_value_1_0= ruleAttributeValueMap )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1702:1: (lv_value_1_0= ruleAttributeValueMap )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1703:3: lv_value_1_0= ruleAttributeValueMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueAccess().getValueAttributeValueMapParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeValueMap_in_ruleAttributeValue3502);
                    lv_value_1_0=ruleAttributeValueMap();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"AttributeValueMap");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1720:6: ( (lv_value_2_0= ruleQualifiedNameObject ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1720:6: ( (lv_value_2_0= ruleQualifiedNameObject ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1721:1: (lv_value_2_0= ruleQualifiedNameObject )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1721:1: (lv_value_2_0= ruleQualifiedNameObject )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1722:3: lv_value_2_0= ruleQualifiedNameObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueAccess().getValueQualifiedNameObjectParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedNameObject_in_ruleAttributeValue3529);
                    lv_value_2_0=ruleQualifiedNameObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_2_0, 
                            		"QualifiedNameObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1739:6: ( (lv_value_3_0= ruleLiteral ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1739:6: ( (lv_value_3_0= ruleLiteral ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1740:1: (lv_value_3_0= ruleLiteral )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1740:1: (lv_value_3_0= ruleLiteral )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1741:3: lv_value_3_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueAccess().getValueLiteralParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleAttributeValue3556);
                    lv_value_3_0=ruleLiteral();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_3_0, 
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1765:1: entryRuleAttributeValueArray returns [EObject current=null] : iv_ruleAttributeValueArray= ruleAttributeValueArray EOF ;
    public final EObject entryRuleAttributeValueArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValueArray = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1766:2: (iv_ruleAttributeValueArray= ruleAttributeValueArray EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1767:2: iv_ruleAttributeValueArray= ruleAttributeValueArray EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueArrayRule()); 
            pushFollow(FOLLOW_ruleAttributeValueArray_in_entryRuleAttributeValueArray3592);
            iv_ruleAttributeValueArray=ruleAttributeValueArray();

            state._fsp--;

             current =iv_ruleAttributeValueArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValueArray3602); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1774:1: ruleAttributeValueArray returns [EObject current=null] : ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' ( (lv_elements_4_0= ruleAttributeValue ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) ) )* (otherlv_7= ',' )? otherlv_8= '}' ) ) ;
    public final EObject ruleAttributeValueArray() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_elements_4_0 = null;

        EObject lv_elements_6_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1777:28: ( ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' ( (lv_elements_4_0= ruleAttributeValue ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) ) )* (otherlv_7= ',' )? otherlv_8= '}' ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1778:1: ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' ( (lv_elements_4_0= ruleAttributeValue ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) ) )* (otherlv_7= ',' )? otherlv_8= '}' ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1778:1: ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' ( (lv_elements_4_0= ruleAttributeValue ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) ) )* (otherlv_7= ',' )? otherlv_8= '}' ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==22) ) {
                int LA34_1 = input.LA(2);

                if ( ((LA34_1>=RULE_STRING && LA34_1<=RULE_DECIMAL)||LA34_1==16||(LA34_1>=18 && LA34_1<=19)||LA34_1==22) ) {
                    alt34=2;
                }
                else if ( (LA34_1==23) ) {
                    alt34=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 34, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }
            switch (alt34) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1778:2: ( () otherlv_1= '{' otherlv_2= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1778:2: ( () otherlv_1= '{' otherlv_2= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1778:3: () otherlv_1= '{' otherlv_2= '}'
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1778:3: ()
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1779:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAttributeValueArrayAccess().getAttributeValueArrayAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAttributeValueArray3649); 

                        	newLeafNode(otherlv_1, grammarAccess.getAttributeValueArrayAccess().getLeftCurlyBracketKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleAttributeValueArray3661); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeValueArrayAccess().getRightCurlyBracketKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1793:6: (otherlv_3= '{' ( (lv_elements_4_0= ruleAttributeValue ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) ) )* (otherlv_7= ',' )? otherlv_8= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1793:6: (otherlv_3= '{' ( (lv_elements_4_0= ruleAttributeValue ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) ) )* (otherlv_7= ',' )? otherlv_8= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1793:8: otherlv_3= '{' ( (lv_elements_4_0= ruleAttributeValue ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) ) )* (otherlv_7= ',' )? otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleAttributeValueArray3681); 

                        	newLeafNode(otherlv_3, grammarAccess.getAttributeValueArrayAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1797:1: ( (lv_elements_4_0= ruleAttributeValue ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1798:1: (lv_elements_4_0= ruleAttributeValue )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1798:1: (lv_elements_4_0= ruleAttributeValue )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1799:3: lv_elements_4_0= ruleAttributeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeValue_in_ruleAttributeValueArray3702);
                    lv_elements_4_0=ruleAttributeValue();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeValueArrayRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_4_0, 
                            		"AttributeValue");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1815:2: (otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) ) )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==25) ) {
                            int LA32_1 = input.LA(2);

                            if ( ((LA32_1>=RULE_STRING && LA32_1<=RULE_DECIMAL)||LA32_1==16||(LA32_1>=18 && LA32_1<=19)||LA32_1==22) ) {
                                alt32=1;
                            }


                        }


                        switch (alt32) {
                    	case 1 :
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1815:4: otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) )
                    	    {
                    	    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleAttributeValueArray3715); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1819:1: ( (lv_elements_6_0= ruleAttributeValue ) )
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1820:1: (lv_elements_6_0= ruleAttributeValue )
                    	    {
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1820:1: (lv_elements_6_0= ruleAttributeValue )
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1821:3: lv_elements_6_0= ruleAttributeValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttributeValue_in_ruleAttributeValueArray3736);
                    	    lv_elements_6_0=ruleAttributeValue();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAttributeValueArrayRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_6_0, 
                    	            		"AttributeValue");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1837:4: (otherlv_7= ',' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==25) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1837:6: otherlv_7= ','
                            {
                            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleAttributeValueArray3751); 

                                	newLeafNode(otherlv_7, grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_1_3());
                                

                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleAttributeValueArray3765); 

                        	newLeafNode(otherlv_8, grammarAccess.getAttributeValueArrayAccess().getRightCurlyBracketKeyword_1_4());
                        

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
    // $ANTLR end "ruleAttributeValueArray"


    // $ANTLR start "entryRuleAttributeValueMap"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1853:1: entryRuleAttributeValueMap returns [EObject current=null] : iv_ruleAttributeValueMap= ruleAttributeValueMap EOF ;
    public final EObject entryRuleAttributeValueMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValueMap = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1854:2: (iv_ruleAttributeValueMap= ruleAttributeValueMap EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1855:2: iv_ruleAttributeValueMap= ruleAttributeValueMap EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueMapRule()); 
            pushFollow(FOLLOW_ruleAttributeValueMap_in_entryRuleAttributeValueMap3802);
            iv_ruleAttributeValueMap=ruleAttributeValueMap();

            state._fsp--;

             current =iv_ruleAttributeValueMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValueMap3812); 

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
    // $ANTLR end "entryRuleAttributeValueMap"


    // $ANTLR start "ruleAttributeValueMap"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1862:1: ruleAttributeValueMap returns [EObject current=null] : ( ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' ) | (otherlv_4= '{' ( (lv_elements_5_0= ruleAttributePair ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) ) ;
    public final EObject ruleAttributeValueMap() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_elements_5_0 = null;

        EObject lv_elements_7_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1865:28: ( ( ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' ) | (otherlv_4= '{' ( (lv_elements_5_0= ruleAttributePair ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1866:1: ( ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' ) | (otherlv_4= '{' ( (lv_elements_5_0= ruleAttributePair ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1866:1: ( ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' ) | (otherlv_4= '{' ( (lv_elements_5_0= ruleAttributePair ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==22) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==RULE_STRING||(LA37_1>=RULE_INT && LA37_1<=RULE_DECIMAL)) ) {
                    alt37=2;
                }
                else if ( (LA37_1==24) ) {
                    alt37=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 37, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 37, 0, input);

                throw nvae;
            }
            switch (alt37) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1866:2: ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1866:2: ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1866:3: () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}'
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1866:3: ()
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1867:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAttributeValueMapAccess().getAttributeValueMapAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAttributeValueMap3859); 

                        	newLeafNode(otherlv_1, grammarAccess.getAttributeValueMapAccess().getLeftCurlyBracketKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleAttributeValueMap3871); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeValueMapAccess().getColonKeyword_0_2());
                        
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleAttributeValueMap3883); 

                        	newLeafNode(otherlv_3, grammarAccess.getAttributeValueMapAccess().getRightCurlyBracketKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1885:6: (otherlv_4= '{' ( (lv_elements_5_0= ruleAttributePair ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) ) )* (otherlv_8= ',' )? otherlv_9= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1885:6: (otherlv_4= '{' ( (lv_elements_5_0= ruleAttributePair ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) ) )* (otherlv_8= ',' )? otherlv_9= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1885:8: otherlv_4= '{' ( (lv_elements_5_0= ruleAttributePair ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) ) )* (otherlv_8= ',' )? otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleAttributeValueMap3903); 

                        	newLeafNode(otherlv_4, grammarAccess.getAttributeValueMapAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1889:1: ( (lv_elements_5_0= ruleAttributePair ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1890:1: (lv_elements_5_0= ruleAttributePair )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1890:1: (lv_elements_5_0= ruleAttributePair )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1891:3: lv_elements_5_0= ruleAttributePair
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueMapAccess().getElementsAttributePairParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributePair_in_ruleAttributeValueMap3924);
                    lv_elements_5_0=ruleAttributePair();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeValueMapRule());
                    	        }
                           		add(
                           			current, 
                           			"elements",
                            		lv_elements_5_0, 
                            		"AttributePair");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1907:2: (otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) ) )*
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==25) ) {
                            int LA35_1 = input.LA(2);

                            if ( (LA35_1==RULE_STRING||(LA35_1>=RULE_INT && LA35_1<=RULE_DECIMAL)) ) {
                                alt35=1;
                            }


                        }


                        switch (alt35) {
                    	case 1 :
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1907:4: otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleAttributeValueMap3937); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getAttributeValueMapAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1911:1: ( (lv_elements_7_0= ruleAttributePair ) )
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1912:1: (lv_elements_7_0= ruleAttributePair )
                    	    {
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1912:1: (lv_elements_7_0= ruleAttributePair )
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1913:3: lv_elements_7_0= ruleAttributePair
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAttributeValueMapAccess().getElementsAttributePairParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttributePair_in_ruleAttributeValueMap3958);
                    	    lv_elements_7_0=ruleAttributePair();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getAttributeValueMapRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"elements",
                    	            		lv_elements_7_0, 
                    	            		"AttributePair");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop35;
                        }
                    } while (true);

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1929:4: (otherlv_8= ',' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==25) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1929:6: otherlv_8= ','
                            {
                            otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleAttributeValueMap3973); 

                                	newLeafNode(otherlv_8, grammarAccess.getAttributeValueMapAccess().getCommaKeyword_1_3());
                                

                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleAttributeValueMap3987); 

                        	newLeafNode(otherlv_9, grammarAccess.getAttributeValueMapAccess().getRightCurlyBracketKeyword_1_4());
                        

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
    // $ANTLR end "ruleAttributeValueMap"


    // $ANTLR start "entryRuleAttributePair"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1945:1: entryRuleAttributePair returns [EObject current=null] : iv_ruleAttributePair= ruleAttributePair EOF ;
    public final EObject entryRuleAttributePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributePair = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1946:2: (iv_ruleAttributePair= ruleAttributePair EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1947:2: iv_ruleAttributePair= ruleAttributePair EOF
            {
             newCompositeNode(grammarAccess.getAttributePairRule()); 
            pushFollow(FOLLOW_ruleAttributePair_in_entryRuleAttributePair4024);
            iv_ruleAttributePair=ruleAttributePair();

            state._fsp--;

             current =iv_ruleAttributePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributePair4034); 

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
    // $ANTLR end "entryRuleAttributePair"


    // $ANTLR start "ruleAttributePair"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1954:1: ruleAttributePair returns [EObject current=null] : ( ( (lv_name_0_0= ruleLiteral ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) ) ;
    public final EObject ruleAttributePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_name_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1957:28: ( ( ( (lv_name_0_0= ruleLiteral ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1958:1: ( ( (lv_name_0_0= ruleLiteral ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1958:1: ( ( (lv_name_0_0= ruleLiteral ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1958:2: ( (lv_name_0_0= ruleLiteral ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1958:2: ( (lv_name_0_0= ruleLiteral ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1959:1: (lv_name_0_0= ruleLiteral )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1959:1: (lv_name_0_0= ruleLiteral )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1960:3: lv_name_0_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getAttributePairAccess().getNameLiteralParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_ruleAttributePair4080);
            lv_name_0_0=ruleLiteral();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributePairRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Literal");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleAttributePair4092); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributePairAccess().getColonKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1980:1: ( (lv_value_2_0= ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1981:1: (lv_value_2_0= ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1981:1: (lv_value_2_0= ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1982:3: lv_value_2_0= ruleAttributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAttributePairAccess().getValueAttributeValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeValue_in_ruleAttributePair4113);
            lv_value_2_0=ruleAttributeValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getAttributePairRule());
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
    // $ANTLR end "ruleAttributePair"


    // $ANTLR start "entryRuleGrouping"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2006:1: entryRuleGrouping returns [EObject current=null] : iv_ruleGrouping= ruleGrouping EOF ;
    public final EObject entryRuleGrouping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrouping = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2007:2: (iv_ruleGrouping= ruleGrouping EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2008:2: iv_ruleGrouping= ruleGrouping EOF
            {
             newCompositeNode(grammarAccess.getGroupingRule()); 
            pushFollow(FOLLOW_ruleGrouping_in_entryRuleGrouping4149);
            iv_ruleGrouping=ruleGrouping();

            state._fsp--;

             current =iv_ruleGrouping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouping4159); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2015:1: ruleGrouping returns [EObject current=null] : (otherlv_0= '%' ( ( ruleName ) ) (otherlv_2= ',' ( ( ruleName ) ) )* ) ;
    public final EObject ruleGrouping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2018:28: ( (otherlv_0= '%' ( ( ruleName ) ) (otherlv_2= ',' ( ( ruleName ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2019:1: (otherlv_0= '%' ( ( ruleName ) ) (otherlv_2= ',' ( ( ruleName ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2019:1: (otherlv_0= '%' ( ( ruleName ) ) (otherlv_2= ',' ( ( ruleName ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2019:3: otherlv_0= '%' ( ( ruleName ) ) (otherlv_2= ',' ( ( ruleName ) ) )*
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleGrouping4196); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupingAccess().getPercentSignKeyword_0());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2023:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2024:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2024:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2025:3: ruleName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGroupingAccess().getNamePropertyCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleGrouping4219);
            ruleName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2038:2: (otherlv_2= ',' ( ( ruleName ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==25) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2038:4: otherlv_2= ',' ( ( ruleName ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleGrouping4232); 

            	        	newLeafNode(otherlv_2, grammarAccess.getGroupingAccess().getCommaKeyword_2_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2042:1: ( ( ruleName ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2043:1: ( ruleName )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2043:1: ( ruleName )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2044:3: ruleName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupingRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGroupingAccess().getNamePropertyCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleName_in_ruleGrouping4255);
            	    ruleName();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2065:1: entryRuleModelMapping returns [EObject current=null] : iv_ruleModelMapping= ruleModelMapping EOF ;
    public final EObject entryRuleModelMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelMapping = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2066:2: (iv_ruleModelMapping= ruleModelMapping EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2067:2: iv_ruleModelMapping= ruleModelMapping EOF
            {
             newCompositeNode(grammarAccess.getModelMappingRule()); 
            pushFollow(FOLLOW_ruleModelMapping_in_entryRuleModelMapping4293);
            iv_ruleModelMapping=ruleModelMapping();

            state._fsp--;

             current =iv_ruleModelMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelMapping4303); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2074:1: ruleModelMapping returns [EObject current=null] : (otherlv_0= '->' otherlv_1= '{' () ( (lv_mappings_3_0= rulePropertyMapping ) )* otherlv_4= '}' ) ;
    public final EObject ruleModelMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_mappings_3_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2077:28: ( (otherlv_0= '->' otherlv_1= '{' () ( (lv_mappings_3_0= rulePropertyMapping ) )* otherlv_4= '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2078:1: (otherlv_0= '->' otherlv_1= '{' () ( (lv_mappings_3_0= rulePropertyMapping ) )* otherlv_4= '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2078:1: (otherlv_0= '->' otherlv_1= '{' () ( (lv_mappings_3_0= rulePropertyMapping ) )* otherlv_4= '}' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2078:3: otherlv_0= '->' otherlv_1= '{' () ( (lv_mappings_3_0= rulePropertyMapping ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleModelMapping4340); 

                	newLeafNode(otherlv_0, grammarAccess.getModelMappingAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleModelMapping4352); 

                	newLeafNode(otherlv_1, grammarAccess.getModelMappingAccess().getLeftCurlyBracketKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2086:1: ()
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2087:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelMappingAccess().getModelMappingAction_2(),
                        current);
                

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2092:2: ( (lv_mappings_3_0= rulePropertyMapping ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_NAME_TOKEN)||LA39_0==16||(LA39_0>=18 && LA39_0<=19)||LA39_0==27) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2093:1: (lv_mappings_3_0= rulePropertyMapping )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2093:1: (lv_mappings_3_0= rulePropertyMapping )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2094:3: lv_mappings_3_0= rulePropertyMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelMappingAccess().getMappingsPropertyMappingParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertyMapping_in_ruleModelMapping4382);
            	    lv_mappings_3_0=rulePropertyMapping();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelMappingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"mappings",
            	            		lv_mappings_3_0, 
            	            		"PropertyMapping");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleModelMapping4395); 

                	newLeafNode(otherlv_4, grammarAccess.getModelMappingAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2122:1: entryRulePropertyMapping returns [EObject current=null] : iv_rulePropertyMapping= rulePropertyMapping EOF ;
    public final EObject entryRulePropertyMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMapping = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2123:2: (iv_rulePropertyMapping= rulePropertyMapping EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2124:2: iv_rulePropertyMapping= rulePropertyMapping EOF
            {
             newCompositeNode(grammarAccess.getPropertyMappingRule()); 
            pushFollow(FOLLOW_rulePropertyMapping_in_entryRulePropertyMapping4431);
            iv_rulePropertyMapping=rulePropertyMapping();

            state._fsp--;

             current =iv_rulePropertyMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyMapping4441); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2131:1: rulePropertyMapping returns [EObject current=null] : ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' ) ;
    public final EObject rulePropertyMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_description_0_0 = null;

        EObject lv_attributes_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2134:28: ( ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2135:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2135:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2135:2: ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';'
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2135:2: ( (lv_description_0_0= ruleDescription ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2136:1: (lv_description_0_0= ruleDescription )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2136:1: (lv_description_0_0= ruleDescription )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2137:3: lv_description_0_0= ruleDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyMappingAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDescription_in_rulePropertyMapping4487);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2153:3: ( (lv_attributes_1_0= ruleAttributeList ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==27) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2154:1: (lv_attributes_1_0= ruleAttributeList )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2154:1: (lv_attributes_1_0= ruleAttributeList )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2155:3: lv_attributes_1_0= ruleAttributeList
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyMappingAccess().getAttributesAttributeListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeList_in_rulePropertyMapping4509);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2171:3: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2172:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2172:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2173:3: ruleName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPropertyMappingAccess().getFromPropertyCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyMapping4533);
            ruleName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,31,FOLLOW_31_in_rulePropertyMapping4545); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyMappingAccess().getHyphenMinusGreaterThanSignKeyword_3());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2190:1: ( (lv_name_4_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2191:1: (lv_name_4_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2191:1: (lv_name_4_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2192:3: lv_name_4_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyMappingAccess().getNameNameParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyMapping4566);
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

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_rulePropertyMapping4578); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2220:1: entryRuleModelFolding returns [EObject current=null] : iv_ruleModelFolding= ruleModelFolding EOF ;
    public final EObject entryRuleModelFolding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFolding = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2221:2: (iv_ruleModelFolding= ruleModelFolding EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2222:2: iv_ruleModelFolding= ruleModelFolding EOF
            {
             newCompositeNode(grammarAccess.getModelFoldingRule()); 
            pushFollow(FOLLOW_ruleModelFolding_in_entryRuleModelFolding4614);
            iv_ruleModelFolding=ruleModelFolding();

            state._fsp--;

             current =iv_ruleModelFolding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelFolding4624); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2229:1: ruleModelFolding returns [EObject current=null] : (otherlv_0= '=>' otherlv_1= '{' () ( (lv_foldings_3_0= rulePropertyFolding ) )* otherlv_4= '}' ) ;
    public final EObject ruleModelFolding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_foldings_3_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2232:28: ( (otherlv_0= '=>' otherlv_1= '{' () ( (lv_foldings_3_0= rulePropertyFolding ) )* otherlv_4= '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2233:1: (otherlv_0= '=>' otherlv_1= '{' () ( (lv_foldings_3_0= rulePropertyFolding ) )* otherlv_4= '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2233:1: (otherlv_0= '=>' otherlv_1= '{' () ( (lv_foldings_3_0= rulePropertyFolding ) )* otherlv_4= '}' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2233:3: otherlv_0= '=>' otherlv_1= '{' () ( (lv_foldings_3_0= rulePropertyFolding ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleModelFolding4661); 

                	newLeafNode(otherlv_0, grammarAccess.getModelFoldingAccess().getEqualsSignGreaterThanSignKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleModelFolding4673); 

                	newLeafNode(otherlv_1, grammarAccess.getModelFoldingAccess().getLeftCurlyBracketKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2241:1: ()
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2242:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelFoldingAccess().getModelFoldingAction_2(),
                        current);
                

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2247:2: ( (lv_foldings_3_0= rulePropertyFolding ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_NAME_TOKEN)||LA42_0==16||(LA42_0>=18 && LA42_0<=19)||LA42_0==27) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2248:1: (lv_foldings_3_0= rulePropertyFolding )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2248:1: (lv_foldings_3_0= rulePropertyFolding )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2249:3: lv_foldings_3_0= rulePropertyFolding
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelFoldingAccess().getFoldingsPropertyFoldingParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertyFolding_in_ruleModelFolding4703);
            	    lv_foldings_3_0=rulePropertyFolding();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelFoldingRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"foldings",
            	            		lv_foldings_3_0, 
            	            		"PropertyFolding");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleModelFolding4716); 

                	newLeafNode(otherlv_4, grammarAccess.getModelFoldingAccess().getRightCurlyBracketKeyword_4());
                

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2277:1: entryRulePropertyFolding returns [EObject current=null] : iv_rulePropertyFolding= rulePropertyFolding EOF ;
    public final EObject entryRulePropertyFolding() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyFolding = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2278:2: (iv_rulePropertyFolding= rulePropertyFolding EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2279:2: iv_rulePropertyFolding= rulePropertyFolding EOF
            {
             newCompositeNode(grammarAccess.getPropertyFoldingRule()); 
            pushFollow(FOLLOW_rulePropertyFolding_in_entryRulePropertyFolding4752);
            iv_rulePropertyFolding=rulePropertyFolding();

            state._fsp--;

             current =iv_rulePropertyFolding; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyFolding4762); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2286:1: rulePropertyFolding returns [EObject current=null] : ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( ( ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' ) ;
    public final EObject rulePropertyFolding() throws RecognitionException {
        EObject current = null;

        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_description_0_0 = null;

        EObject lv_attributes_1_0 = null;

        AntlrDatatypeRuleToken lv_aggregator_2_0 = null;

        AntlrDatatypeRuleToken lv_name_6_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2289:28: ( ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( ( ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2290:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( ( ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2290:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( ( ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2290:2: ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( ( ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';'
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2290:2: ( (lv_description_0_0= ruleDescription ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_STRING) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2291:1: (lv_description_0_0= ruleDescription )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2291:1: (lv_description_0_0= ruleDescription )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2292:3: lv_description_0_0= ruleDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDescription_in_rulePropertyFolding4808);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2308:3: ( (lv_attributes_1_0= ruleAttributeList ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==27) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2309:1: (lv_attributes_1_0= ruleAttributeList )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2309:1: (lv_attributes_1_0= ruleAttributeList )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2310:3: lv_attributes_1_0= ruleAttributeList
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getAttributesAttributeListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeList_in_rulePropertyFolding4830);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2326:3: ( (lv_aggregator_2_0= ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2327:1: (lv_aggregator_2_0= ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2327:1: (lv_aggregator_2_0= ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2328:3: lv_aggregator_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getAggregatorQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyFolding4852);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2344:2: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2345:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2345:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2346:3: ruleName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyFoldingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getFromPropertyCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyFolding4875);
            ruleName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2359:2: (otherlv_4= '->' | otherlv_5= '=>' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==31) ) {
                alt45=1;
            }
            else if ( (LA45_0==32) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2359:4: otherlv_4= '->'
                    {
                    otherlv_4=(Token)match(input,31,FOLLOW_31_in_rulePropertyFolding4888); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertyFoldingAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2364:7: otherlv_5= '=>'
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_32_in_rulePropertyFolding4906); 

                        	newLeafNode(otherlv_5, grammarAccess.getPropertyFoldingAccess().getEqualsSignGreaterThanSignKeyword_4_1());
                        

                    }
                    break;

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2368:2: ( (lv_name_6_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2369:1: (lv_name_6_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2369:1: (lv_name_6_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2370:3: lv_name_6_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getNameNameParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyFolding4928);
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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_rulePropertyFolding4940); 

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


    // $ANTLR start "entryRuleQualifiedNameObject"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2400:1: entryRuleQualifiedNameObject returns [EObject current=null] : iv_ruleQualifiedNameObject= ruleQualifiedNameObject EOF ;
    public final EObject entryRuleQualifiedNameObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedNameObject = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2401:2: (iv_ruleQualifiedNameObject= ruleQualifiedNameObject EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2402:2: iv_ruleQualifiedNameObject= ruleQualifiedNameObject EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameObjectRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameObject_in_entryRuleQualifiedNameObject4978);
            iv_ruleQualifiedNameObject=ruleQualifiedNameObject();

            state._fsp--;

             current =iv_ruleQualifiedNameObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameObject4988); 

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
    // $ANTLR end "entryRuleQualifiedNameObject"


    // $ANTLR start "ruleQualifiedNameObject"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2409:1: ruleQualifiedNameObject returns [EObject current=null] : ( (lv_name_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleQualifiedNameObject() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2412:28: ( ( (lv_name_0_0= ruleQualifiedName ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2413:1: ( (lv_name_0_0= ruleQualifiedName ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2413:1: ( (lv_name_0_0= ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2414:1: (lv_name_0_0= ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2414:1: (lv_name_0_0= ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2415:3: lv_name_0_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getQualifiedNameObjectAccess().getNameQualifiedNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameObject5033);
            lv_name_0_0=ruleQualifiedName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getQualifiedNameObjectRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"QualifiedName");
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
    // $ANTLR end "ruleQualifiedNameObject"


    // $ANTLR start "entryRuleQualifiedName"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2439:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2440:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2441:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5069);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName5080); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2448:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2451:28: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2452:1: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2452:1: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2453:5: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )*
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleName_in_ruleQualifiedName5127);
            this_Name_0=ruleName();

            state._fsp--;


            		current.merge(this_Name_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2463:1: (kw= '.' this_Name_2= ruleName )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==26) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2464:2: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,26,FOLLOW_26_in_ruleQualifiedName5146); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleName_in_ruleQualifiedName5168);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    		current.merge(this_Name_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop46;
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2488:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2489:2: (iv_ruleName= ruleName EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2490:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName5216);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName5227); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2497:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NAME_TOKEN_0= RULE_NAME_TOKEN | kw= 'projective' | kw= 'joined' | kw= 'summarized' ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NAME_TOKEN_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2500:28: ( (this_NAME_TOKEN_0= RULE_NAME_TOKEN | kw= 'projective' | kw= 'joined' | kw= 'summarized' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2501:1: (this_NAME_TOKEN_0= RULE_NAME_TOKEN | kw= 'projective' | kw= 'joined' | kw= 'summarized' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2501:1: (this_NAME_TOKEN_0= RULE_NAME_TOKEN | kw= 'projective' | kw= 'joined' | kw= 'summarized' )
            int alt47=4;
            switch ( input.LA(1) ) {
            case RULE_NAME_TOKEN:
                {
                alt47=1;
                }
                break;
            case 16:
                {
                alt47=2;
                }
                break;
            case 18:
                {
                alt47=3;
                }
                break;
            case 19:
                {
                alt47=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 47, 0, input);

                throw nvae;
            }

            switch (alt47) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2501:6: this_NAME_TOKEN_0= RULE_NAME_TOKEN
                    {
                    this_NAME_TOKEN_0=(Token)match(input,RULE_NAME_TOKEN,FOLLOW_RULE_NAME_TOKEN_in_ruleName5267); 

                    		current.merge(this_NAME_TOKEN_0);
                        
                     
                        newLeafNode(this_NAME_TOKEN_0, grammarAccess.getNameAccess().getNAME_TOKENTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2510:2: kw= 'projective'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleName5291); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getProjectiveKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2517:2: kw= 'joined'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleName5310); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getJoinedKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2524:2: kw= 'summarized'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleName5329); 

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


    // $ANTLR start "entryRuleCollectionType"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2537:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2538:2: (iv_ruleCollectionType= ruleCollectionType EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2539:2: iv_ruleCollectionType= ruleCollectionType EOF
            {
             newCompositeNode(grammarAccess.getCollectionTypeRule()); 
            pushFollow(FOLLOW_ruleCollectionType_in_entryRuleCollectionType5369);
            iv_ruleCollectionType=ruleCollectionType();

            state._fsp--;

             current =iv_ruleCollectionType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionType5379); 

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
    // $ANTLR end "entryRuleCollectionType"


    // $ANTLR start "ruleCollectionType"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2546:1: ruleCollectionType returns [EObject current=null] : ( (otherlv_0= '{' ( (lv_elementType_1_0= ruleType ) ) otherlv_2= '}' ) | (otherlv_3= '{' ( (lv_map_4_0= ':' ) ) ( (lv_elementType_5_0= ruleType ) ) otherlv_6= '}' ) ) ;
    public final EObject ruleCollectionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_map_4_0=null;
        Token otherlv_6=null;
        EObject lv_elementType_1_0 = null;

        EObject lv_elementType_5_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2549:28: ( ( (otherlv_0= '{' ( (lv_elementType_1_0= ruleType ) ) otherlv_2= '}' ) | (otherlv_3= '{' ( (lv_map_4_0= ':' ) ) ( (lv_elementType_5_0= ruleType ) ) otherlv_6= '}' ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2550:1: ( (otherlv_0= '{' ( (lv_elementType_1_0= ruleType ) ) otherlv_2= '}' ) | (otherlv_3= '{' ( (lv_map_4_0= ':' ) ) ( (lv_elementType_5_0= ruleType ) ) otherlv_6= '}' ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2550:1: ( (otherlv_0= '{' ( (lv_elementType_1_0= ruleType ) ) otherlv_2= '}' ) | (otherlv_3= '{' ( (lv_map_4_0= ':' ) ) ( (lv_elementType_5_0= ruleType ) ) otherlv_6= '}' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==22) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==22||(LA48_1>=33 && LA48_1<=43)) ) {
                    alt48=1;
                }
                else if ( (LA48_1==24) ) {
                    alt48=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 48, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 48, 0, input);

                throw nvae;
            }
            switch (alt48) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2550:2: (otherlv_0= '{' ( (lv_elementType_1_0= ruleType ) ) otherlv_2= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2550:2: (otherlv_0= '{' ( (lv_elementType_1_0= ruleType ) ) otherlv_2= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2550:4: otherlv_0= '{' ( (lv_elementType_1_0= ruleType ) ) otherlv_2= '}'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleCollectionType5417); 

                        	newLeafNode(otherlv_0, grammarAccess.getCollectionTypeAccess().getLeftCurlyBracketKeyword_0_0());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2554:1: ( (lv_elementType_1_0= ruleType ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2555:1: (lv_elementType_1_0= ruleType )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2555:1: (lv_elementType_1_0= ruleType )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2556:3: lv_elementType_1_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCollectionTypeAccess().getElementTypeTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleCollectionType5438);
                    lv_elementType_1_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"elementType",
                            		lv_elementType_1_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleCollectionType5450); 

                        	newLeafNode(otherlv_2, grammarAccess.getCollectionTypeAccess().getRightCurlyBracketKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2577:6: (otherlv_3= '{' ( (lv_map_4_0= ':' ) ) ( (lv_elementType_5_0= ruleType ) ) otherlv_6= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2577:6: (otherlv_3= '{' ( (lv_map_4_0= ':' ) ) ( (lv_elementType_5_0= ruleType ) ) otherlv_6= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2577:8: otherlv_3= '{' ( (lv_map_4_0= ':' ) ) ( (lv_elementType_5_0= ruleType ) ) otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleCollectionType5470); 

                        	newLeafNode(otherlv_3, grammarAccess.getCollectionTypeAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2581:1: ( (lv_map_4_0= ':' ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2582:1: (lv_map_4_0= ':' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2582:1: (lv_map_4_0= ':' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2583:3: lv_map_4_0= ':'
                    {
                    lv_map_4_0=(Token)match(input,24,FOLLOW_24_in_ruleCollectionType5488); 

                            newLeafNode(lv_map_4_0, grammarAccess.getCollectionTypeAccess().getMapColonKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionTypeRule());
                    	        }
                           		setWithLastConsumed(current, "map", true, ":");
                    	    

                    }


                    }

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2596:2: ( (lv_elementType_5_0= ruleType ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2597:1: (lv_elementType_5_0= ruleType )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2597:1: (lv_elementType_5_0= ruleType )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2598:3: lv_elementType_5_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCollectionTypeAccess().getElementTypeTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleCollectionType5522);
                    lv_elementType_5_0=ruleType();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getCollectionTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"elementType",
                            		lv_elementType_5_0, 
                            		"Type");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleCollectionType5534); 

                        	newLeafNode(otherlv_6, grammarAccess.getCollectionTypeAccess().getRightCurlyBracketKeyword_1_3());
                        

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
    // $ANTLR end "ruleCollectionType"


    // $ANTLR start "entryRuleLiteral"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2626:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2627:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2628:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral5571);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral5581); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2635:1: ruleLiteral returns [EObject current=null] : ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_decimalValue_2_0= RULE_DECIMAL ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_0_0=null;
        Token lv_intValue_1_0=null;
        Token lv_decimalValue_2_0=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2638:28: ( ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_decimalValue_2_0= RULE_DECIMAL ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2639:1: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_decimalValue_2_0= RULE_DECIMAL ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2639:1: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_decimalValue_2_0= RULE_DECIMAL ) ) )
            int alt49=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt49=1;
                }
                break;
            case RULE_INT:
                {
                alt49=2;
                }
                break;
            case RULE_DECIMAL:
                {
                alt49=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 49, 0, input);

                throw nvae;
            }

            switch (alt49) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2639:2: ( (lv_stringValue_0_0= RULE_STRING ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2639:2: ( (lv_stringValue_0_0= RULE_STRING ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2640:1: (lv_stringValue_0_0= RULE_STRING )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2640:1: (lv_stringValue_0_0= RULE_STRING )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2641:3: lv_stringValue_0_0= RULE_STRING
                    {
                    lv_stringValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral5623); 

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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2658:6: ( (lv_intValue_1_0= RULE_INT ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2658:6: ( (lv_intValue_1_0= RULE_INT ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2659:1: (lv_intValue_1_0= RULE_INT )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2659:1: (lv_intValue_1_0= RULE_INT )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2660:3: lv_intValue_1_0= RULE_INT
                    {
                    lv_intValue_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteral5651); 

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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2677:6: ( (lv_decimalValue_2_0= RULE_DECIMAL ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2677:6: ( (lv_decimalValue_2_0= RULE_DECIMAL ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2678:1: (lv_decimalValue_2_0= RULE_DECIMAL )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2678:1: (lv_decimalValue_2_0= RULE_DECIMAL )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2679:3: lv_decimalValue_2_0= RULE_DECIMAL
                    {
                    lv_decimalValue_2_0=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleLiteral5679); 

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


    // $ANTLR start "ruleBasicType"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2703:1: ruleBasicType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) ) ;
    public final Enumerator ruleBasicType() throws RecognitionException {
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
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2705:28: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2706:1: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2706:1: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) )
            int alt50=11;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt50=1;
                }
                break;
            case 34:
                {
                alt50=2;
                }
                break;
            case 35:
                {
                alt50=3;
                }
                break;
            case 36:
                {
                alt50=4;
                }
                break;
            case 37:
                {
                alt50=5;
                }
                break;
            case 38:
                {
                alt50=6;
                }
                break;
            case 39:
                {
                alt50=7;
                }
                break;
            case 40:
                {
                alt50=8;
                }
                break;
            case 41:
                {
                alt50=9;
                }
                break;
            case 42:
                {
                alt50=10;
                }
                break;
            case 43:
                {
                alt50=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2706:2: (enumLiteral_0= 'INT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2706:2: (enumLiteral_0= 'INT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2706:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleBasicType5734); 

                            current = grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2712:6: (enumLiteral_1= 'LONG' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2712:6: (enumLiteral_1= 'LONG' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2712:8: enumLiteral_1= 'LONG'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_34_in_ruleBasicType5751); 

                            current = grammarAccess.getBasicTypeAccess().getLONGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBasicTypeAccess().getLONGEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2718:6: (enumLiteral_2= 'BYTE' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2718:6: (enumLiteral_2= 'BYTE' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2718:8: enumLiteral_2= 'BYTE'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_35_in_ruleBasicType5768); 

                            current = grammarAccess.getBasicTypeAccess().getBYTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBasicTypeAccess().getBYTEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2724:6: (enumLiteral_3= 'SHORT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2724:6: (enumLiteral_3= 'SHORT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2724:8: enumLiteral_3= 'SHORT'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_36_in_ruleBasicType5785); 

                            current = grammarAccess.getBasicTypeAccess().getSHORTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBasicTypeAccess().getSHORTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2730:6: (enumLiteral_4= 'DECIMAL' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2730:6: (enumLiteral_4= 'DECIMAL' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2730:8: enumLiteral_4= 'DECIMAL'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_37_in_ruleBasicType5802); 

                            current = grammarAccess.getBasicTypeAccess().getDECIMALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getBasicTypeAccess().getDECIMALEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2736:6: (enumLiteral_5= 'FLOAT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2736:6: (enumLiteral_5= 'FLOAT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2736:8: enumLiteral_5= 'FLOAT'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_38_in_ruleBasicType5819); 

                            current = grammarAccess.getBasicTypeAccess().getFLOATEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getBasicTypeAccess().getFLOATEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2742:6: (enumLiteral_6= 'DOUBLE' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2742:6: (enumLiteral_6= 'DOUBLE' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2742:8: enumLiteral_6= 'DOUBLE'
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_39_in_ruleBasicType5836); 

                            current = grammarAccess.getBasicTypeAccess().getDOUBLEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getBasicTypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2748:6: (enumLiteral_7= 'TEXT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2748:6: (enumLiteral_7= 'TEXT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2748:8: enumLiteral_7= 'TEXT'
                    {
                    enumLiteral_7=(Token)match(input,40,FOLLOW_40_in_ruleBasicType5853); 

                            current = grammarAccess.getBasicTypeAccess().getTEXTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getBasicTypeAccess().getTEXTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2754:6: (enumLiteral_8= 'BOOLEAN' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2754:6: (enumLiteral_8= 'BOOLEAN' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2754:8: enumLiteral_8= 'BOOLEAN'
                    {
                    enumLiteral_8=(Token)match(input,41,FOLLOW_41_in_ruleBasicType5870); 

                            current = grammarAccess.getBasicTypeAccess().getBOOLEANEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getBasicTypeAccess().getBOOLEANEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2760:6: (enumLiteral_9= 'DATE' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2760:6: (enumLiteral_9= 'DATE' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2760:8: enumLiteral_9= 'DATE'
                    {
                    enumLiteral_9=(Token)match(input,42,FOLLOW_42_in_ruleBasicType5887); 

                            current = grammarAccess.getBasicTypeAccess().getDATEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getBasicTypeAccess().getDATEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2766:6: (enumLiteral_10= 'DATETIME' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2766:6: (enumLiteral_10= 'DATETIME' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2766:8: enumLiteral_10= 'DATETIME'
                    {
                    enumLiteral_10=(Token)match(input,43,FOLLOW_43_in_ruleBasicType5904); 

                            current = grammarAccess.getBasicTypeAccess().getDATETIMEEnumLiteralDeclaration_10().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_10, grammarAccess.getBasicTypeAccess().getDATETIMEEnumLiteralDeclaration_10()); 
                        

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
    // $ANTLR end "ruleBasicType"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_ruleScript130 = new BitSet(new long[]{0x00000000080D0032L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_entryRuleModelDefinition166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelDefinition176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_ruleModelDefinition222 = new BitSet(new long[]{0x00000000080D0020L});
    public static final BitSet FOLLOW_ruleAttributeList_in_ruleModelDefinition244 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_16_in_ruleModelDefinition265 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_ruleModelDefinition300 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleModelDefinition312 = new BitSet(new long[]{0x00000000004D0020L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_ruleModelDefinition333 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_18_in_ruleModelDefinition359 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_ruleModelDefinition393 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleModelDefinition405 = new BitSet(new long[]{0x00000000004D0020L});
    public static final BitSet FOLLOW_ruleJoinExpression_in_ruleModelDefinition426 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_19_in_ruleModelDefinition452 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_ruleModelDefinition486 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleModelDefinition498 = new BitSet(new long[]{0x00000000004D0020L});
    public static final BitSet FOLLOW_ruleSummarizeExpression_in_ruleModelDefinition519 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleModelDefinition533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_entryRuleRecordExpression569 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordExpression579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_ruleRecordExpression625 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleRecordExpression638 = new BitSet(new long[]{0x00000000004D0020L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_ruleRecordExpression659 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm697 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordTerm707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleRecordTerm745 = new BitSet(new long[]{0x00000000088D0030L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleRecordTerm775 = new BitSet(new long[]{0x00000000088D0030L});
    public static final BitSet FOLLOW_23_in_ruleRecordTerm788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_ruleRecordTerm816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_entryRuleModelReference852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelReference862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleModelReference909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rulePropertyDefinition1000 = new BitSet(new long[]{0x00000000080D0020L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rulePropertyDefinition1022 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyDefinition1046 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePropertyDefinition1058 = new BitSet(new long[]{0x00000FFE00400000L});
    public static final BitSet FOLLOW_ruleType_in_rulePropertyDefinition1079 = new BitSet(new long[]{0x0000000000120000L});
    public static final BitSet FOLLOW_17_in_rulePropertyDefinition1092 = new BitSet(new long[]{0x00000000004D0020L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_rulePropertyDefinition1113 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyDefinition1144 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_rulePropertyDefinition1156 = new BitSet(new long[]{0x00000000004D0020L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_rulePropertyDefinition1177 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePropertyDefinition1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpression_in_entryRulePropertyExpression1227 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyExpression1237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpressionList_in_rulePropertyExpression1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpressionMap_in_rulePropertyExpression1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpressionReference_in_rulePropertyExpression1337 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpressionList_in_entryRulePropertyExpressionList1373 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyExpressionList1383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePropertyExpressionList1430 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePropertyExpressionList1442 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePropertyExpressionList1462 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyExpressionList1485 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_25_in_rulePropertyExpressionList1498 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyExpressionList1521 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_25_in_rulePropertyExpressionList1536 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePropertyExpressionList1550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpressionMap_in_entryRulePropertyExpressionMap1587 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyExpressionMap1597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePropertyExpressionMap1644 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePropertyExpressionMap1656 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePropertyExpressionMap1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rulePropertyExpressionMap1688 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_rulePropertyExpressionMapEntry_in_rulePropertyExpressionMap1709 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_25_in_rulePropertyExpressionMap1722 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_rulePropertyExpressionMapEntry_in_rulePropertyExpressionMap1743 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_25_in_rulePropertyExpressionMap1758 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_rulePropertyExpressionMap1772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpressionMapEntry_in_entryRulePropertyExpressionMapEntry1809 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyExpressionMapEntry1819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_rulePropertyExpressionMapEntry1865 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePropertyExpressionMapEntry1877 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyExpressionMapEntry1900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyExpressionReference_in_entryRulePropertyExpressionReference1936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyExpressionReference1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyExpressionReference1994 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_rulePropertyExpressionReference2006 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyExpressionReference2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2065 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2075 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleType2121 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_ruleType2148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinExpression_in_entryRuleJoinExpression2184 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinExpression2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_ruleJoinExpression2240 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleJoinExpression2253 = new BitSet(new long[]{0x00000000004D0020L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_ruleJoinExpression2274 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_entryRuleJoinTerm2312 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinTerm2322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_ruleJoinTerm2368 = new BitSet(new long[]{0x00000000C0000002L});
    public static final BitSet FOLLOW_ruleModelMapping_in_ruleJoinTerm2389 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_ruleJoinTerm2411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeExpression_in_entryRuleSummarizeExpression2448 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeExpression2458 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_ruleSummarizeExpression2504 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleSummarizeExpression2517 = new BitSet(new long[]{0x00000000004D0020L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_ruleSummarizeExpression2538 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_entryRuleSummarizeTerm2576 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeTerm2586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_ruleSummarizeTerm2632 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ruleModelFolding_in_ruleSummarizeTerm2653 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_ruleSummarizeTerm2674 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription2712 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription2723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDescription2762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_entryRuleAttributeList2806 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeList2816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAttributeList2861 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute2897 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2907 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAttribute2944 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttribute2965 = new BitSet(new long[]{0x0000000010000002L});
    public static final BitSet FOLLOW_ruleAttributeElementBlock_in_ruleAttribute2986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElementBlock_in_entryRuleAttributeElementBlock3023 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElementBlock3033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleAttributeElementBlock3079 = new BitSet(new long[]{0x00000000200D0020L});
    public static final BitSet FOLLOW_ruleAttributeElementList_in_ruleAttributeElementBlock3101 = new BitSet(new long[]{0x0000000022000000L});
    public static final BitSet FOLLOW_25_in_ruleAttributeElementBlock3114 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleAttributeElementBlock3130 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElementList_in_entryRuleAttributeElementList3166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElementList3176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_ruleAttributeElementList3222 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleAttributeElementList3235 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_ruleAttributeElementList3256 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_entryRuleAttributeElement3294 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElement3304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleAttributeElement3350 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAttributeElement3362 = new BitSet(new long[]{0x00000000004D00F0L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAttributeElement3383 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue3419 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue3429 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueArray_in_ruleAttributeValue3475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueMap_in_ruleAttributeValue3502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameObject_in_ruleAttributeValue3529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttributeValue3556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueArray_in_entryRuleAttributeValueArray3592 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValueArray3602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAttributeValueArray3649 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAttributeValueArray3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAttributeValueArray3681 = new BitSet(new long[]{0x00000000004D00F0L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAttributeValueArray3702 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_25_in_ruleAttributeValueArray3715 = new BitSet(new long[]{0x00000000004D00F0L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAttributeValueArray3736 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_25_in_ruleAttributeValueArray3751 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAttributeValueArray3765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueMap_in_entryRuleAttributeValueMap3802 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValueMap3812 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAttributeValueMap3859 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAttributeValueMap3871 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAttributeValueMap3883 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAttributeValueMap3903 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleAttributePair_in_ruleAttributeValueMap3924 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_25_in_ruleAttributeValueMap3937 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleAttributePair_in_ruleAttributeValueMap3958 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_25_in_ruleAttributeValueMap3973 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAttributeValueMap3987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePair_in_entryRuleAttributePair4024 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributePair4034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttributePair4080 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAttributePair4092 = new BitSet(new long[]{0x00000000004D00F0L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAttributePair4113 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_entryRuleGrouping4149 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouping4159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleGrouping4196 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_ruleGrouping4219 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleGrouping4232 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_ruleGrouping4255 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleModelMapping_in_entryRuleModelMapping4293 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelMapping4303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleModelMapping4340 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleModelMapping4352 = new BitSet(new long[]{0x00000000088D0030L});
    public static final BitSet FOLLOW_rulePropertyMapping_in_ruleModelMapping4382 = new BitSet(new long[]{0x00000000088D0030L});
    public static final BitSet FOLLOW_23_in_ruleModelMapping4395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyMapping_in_entryRulePropertyMapping4431 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyMapping4441 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rulePropertyMapping4487 = new BitSet(new long[]{0x00000000080D0020L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rulePropertyMapping4509 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyMapping4533 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_31_in_rulePropertyMapping4545 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyMapping4566 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePropertyMapping4578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelFolding_in_entryRuleModelFolding4614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelFolding4624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleModelFolding4661 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleModelFolding4673 = new BitSet(new long[]{0x00000000088D0030L});
    public static final BitSet FOLLOW_rulePropertyFolding_in_ruleModelFolding4703 = new BitSet(new long[]{0x00000000088D0030L});
    public static final BitSet FOLLOW_23_in_ruleModelFolding4716 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFolding_in_entryRulePropertyFolding4752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyFolding4762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rulePropertyFolding4808 = new BitSet(new long[]{0x00000000080D0020L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rulePropertyFolding4830 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyFolding4852 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyFolding4875 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_rulePropertyFolding4888 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_32_in_rulePropertyFolding4906 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyFolding4928 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePropertyFolding4940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameObject_in_entryRuleQualifiedNameObject4978 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameObject4988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameObject5033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5069 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleQualifiedName5127 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_26_in_ruleQualifiedName5146 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_ruleQualifiedName5168 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName5216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName5227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_TOKEN_in_ruleName5267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleName5291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleName5310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleName5329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_entryRuleCollectionType5369 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionType5379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCollectionType5417 = new BitSet(new long[]{0x00000FFE00400000L});
    public static final BitSet FOLLOW_ruleType_in_ruleCollectionType5438 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCollectionType5450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCollectionType5470 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCollectionType5488 = new BitSet(new long[]{0x00000FFE00400000L});
    public static final BitSet FOLLOW_ruleType_in_ruleCollectionType5522 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCollectionType5534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral5571 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral5581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral5623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteral5651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleLiteral5679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBasicType5734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBasicType5751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBasicType5768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBasicType5785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBasicType5802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBasicType5819 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBasicType5836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBasicType5853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBasicType5870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBasicType5887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBasicType5904 = new BitSet(new long[]{0x0000000000000002L});

}