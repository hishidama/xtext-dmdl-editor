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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NAME_TOKEN", "RULE_INT", "RULE_DECIMAL", "RULE_DIGIT_CHAR", "RULE_SYMBOL_CHAR", "RULE_BLANK_CHAR", "RULE_HEX_CHAR", "RULE_OCTAL_ESCAPE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'projective'", "'='", "'joined'", "'summarized'", "';'", "'+'", "'{'", "'}'", "':'", "','", "'@'", "'('", "')'", "'%'", "'->'", "'=>'", "'.'", "'INT'", "'LONG'", "'BYTE'", "'SHORT'", "'DECIMAL'", "'FLOAT'", "'DOUBLE'", "'TEXT'", "'BOOLEAN'", "'DATE'", "'DATETIME'"
    };
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int RULE_OCTAL_ESCAPE=12;
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

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_NAME_TOKEN)||LA1_0==16||(LA1_0>=18 && LA1_0<=19)||LA1_0==26) ) {
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

            if ( (LA3_0==26) ) {
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

                if ( (LA5_2==17) ) {
                    alt5=1;
                }
                else if ( (LA5_2==RULE_NAME_TOKEN||LA5_2==16||(LA5_2>=18 && LA5_2<=19)) ) {
                    alt5=2;
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

                        if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_NAME_TOKEN)||LA7_0==16||(LA7_0>=18 && LA7_0<=19)||LA7_0==26) ) {
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

            if ( (LA10_0==26) ) {
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

                if ( (LA12_2==17) ) {
                    alt12=2;
                }
                else if ( (LA12_2==24) ) {
                    alt12=1;
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

                if ( (LA12_4==17) ) {
                    alt12=2;
                }
                else if ( (LA12_4==24) ) {
                    alt12=1;
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:677:1: rulePropertyExpression returns [EObject current=null] : ( ( (lv_expression_0_0= rulePropertyExpressionList ) ) | ( (lv_expression_1_0= rulePropertyExpressionMap ) ) | ( (lv_expression_2_0= rulePropertyExpressionRefernce ) ) ) ;
    public final EObject rulePropertyExpression() throws RecognitionException {
        EObject current = null;

        EObject lv_expression_0_0 = null;

        EObject lv_expression_1_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:680:28: ( ( ( (lv_expression_0_0= rulePropertyExpressionList ) ) | ( (lv_expression_1_0= rulePropertyExpressionMap ) ) | ( (lv_expression_2_0= rulePropertyExpressionRefernce ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:681:1: ( ( (lv_expression_0_0= rulePropertyExpressionList ) ) | ( (lv_expression_1_0= rulePropertyExpressionMap ) ) | ( (lv_expression_2_0= rulePropertyExpressionRefernce ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:681:1: ( ( (lv_expression_0_0= rulePropertyExpressionList ) ) | ( (lv_expression_1_0= rulePropertyExpressionMap ) ) | ( (lv_expression_2_0= rulePropertyExpressionRefernce ) ) )
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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:719:6: ( (lv_expression_2_0= rulePropertyExpressionRefernce ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:719:6: ( (lv_expression_2_0= rulePropertyExpressionRefernce ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:720:1: (lv_expression_2_0= rulePropertyExpressionRefernce )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:720:1: (lv_expression_2_0= rulePropertyExpressionRefernce )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:721:3: lv_expression_2_0= rulePropertyExpressionRefernce
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyExpressionAccess().getExpressionPropertyExpressionRefernceParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_rulePropertyExpressionRefernce_in_rulePropertyExpression1337);
                    lv_expression_2_0=rulePropertyExpressionRefernce();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPropertyExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"expression",
                            		lv_expression_2_0, 
                            		"PropertyExpressionRefernce");
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

                if ( (LA19_1==24) ) {
                    alt19=1;
                }
                else if ( (LA19_1==RULE_STRING||(LA19_1>=RULE_INT && LA19_1<=RULE_DECIMAL)) ) {
                    alt19=2;
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


    // $ANTLR start "entryRulePropertyExpressionRefernce"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:977:1: entryRulePropertyExpressionRefernce returns [EObject current=null] : iv_rulePropertyExpressionRefernce= rulePropertyExpressionRefernce EOF ;
    public final EObject entryRulePropertyExpressionRefernce() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyExpressionRefernce = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:978:2: (iv_rulePropertyExpressionRefernce= rulePropertyExpressionRefernce EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:979:2: iv_rulePropertyExpressionRefernce= rulePropertyExpressionRefernce EOF
            {
             newCompositeNode(grammarAccess.getPropertyExpressionRefernceRule()); 
            pushFollow(FOLLOW_rulePropertyExpressionRefernce_in_entryRulePropertyExpressionRefernce1936);
            iv_rulePropertyExpressionRefernce=rulePropertyExpressionRefernce();

            state._fsp--;

             current =iv_rulePropertyExpressionRefernce; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyExpressionRefernce1946); 

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
    // $ANTLR end "entryRulePropertyExpressionRefernce"


    // $ANTLR start "rulePropertyExpressionRefernce"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:986:1: rulePropertyExpressionRefernce returns [EObject current=null] : ( ( ruleQualifiedName ) ) ;
    public final EObject rulePropertyExpressionRefernce() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:989:28: ( ( ( ruleQualifiedName ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:990:1: ( ( ruleQualifiedName ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:990:1: ( ( ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:991:1: ( ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:991:1: ( ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:992:3: ruleQualifiedName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyExpressionRefernceRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPropertyExpressionRefernceAccess().getNamePropertyCrossReference_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyExpressionRefernce1993);
            ruleQualifiedName();

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
    // $ANTLR end "rulePropertyExpressionRefernce"


    // $ANTLR start "entryRuleType"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1013:1: entryRuleType returns [EObject current=null] : iv_ruleType= ruleType EOF ;
    public final EObject entryRuleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleType = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1014:2: (iv_ruleType= ruleType EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1015:2: iv_ruleType= ruleType EOF
            {
             newCompositeNode(grammarAccess.getTypeRule()); 
            pushFollow(FOLLOW_ruleType_in_entryRuleType2028);
            iv_ruleType=ruleType();

            state._fsp--;

             current =iv_ruleType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleType2038); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1022:1: ruleType returns [EObject current=null] : ( ( (lv_basicType_0_0= ruleBasicType ) ) | ( (lv_collectionType_1_0= ruleCollectionType ) ) ) ;
    public final EObject ruleType() throws RecognitionException {
        EObject current = null;

        Enumerator lv_basicType_0_0 = null;

        EObject lv_collectionType_1_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1025:28: ( ( ( (lv_basicType_0_0= ruleBasicType ) ) | ( (lv_collectionType_1_0= ruleCollectionType ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1026:1: ( ( (lv_basicType_0_0= ruleBasicType ) ) | ( (lv_collectionType_1_0= ruleCollectionType ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1026:1: ( ( (lv_basicType_0_0= ruleBasicType ) ) | ( (lv_collectionType_1_0= ruleCollectionType ) ) )
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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1026:2: ( (lv_basicType_0_0= ruleBasicType ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1026:2: ( (lv_basicType_0_0= ruleBasicType ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1027:1: (lv_basicType_0_0= ruleBasicType )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1027:1: (lv_basicType_0_0= ruleBasicType )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1028:3: lv_basicType_0_0= ruleBasicType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getBasicTypeBasicTypeEnumRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleBasicType_in_ruleType2084);
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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1045:6: ( (lv_collectionType_1_0= ruleCollectionType ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1045:6: ( (lv_collectionType_1_0= ruleCollectionType ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1046:1: (lv_collectionType_1_0= ruleCollectionType )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1046:1: (lv_collectionType_1_0= ruleCollectionType )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1047:3: lv_collectionType_1_0= ruleCollectionType
                    {
                     
                    	        newCompositeNode(grammarAccess.getTypeAccess().getCollectionTypeCollectionTypeParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleCollectionType_in_ruleType2111);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1071:1: entryRuleJoinExpression returns [EObject current=null] : iv_ruleJoinExpression= ruleJoinExpression EOF ;
    public final EObject entryRuleJoinExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinExpression = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1072:2: (iv_ruleJoinExpression= ruleJoinExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1073:2: iv_ruleJoinExpression= ruleJoinExpression EOF
            {
             newCompositeNode(grammarAccess.getJoinExpressionRule()); 
            pushFollow(FOLLOW_ruleJoinExpression_in_entryRuleJoinExpression2147);
            iv_ruleJoinExpression=ruleJoinExpression();

            state._fsp--;

             current =iv_ruleJoinExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinExpression2157); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1080:1: ruleJoinExpression returns [EObject current=null] : ( ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )* ) ;
    public final EObject ruleJoinExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_terms_0_0 = null;

        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1083:28: ( ( ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1084:1: ( ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1084:1: ( ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1084:2: ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1084:2: ( (lv_terms_0_0= ruleJoinTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1085:1: (lv_terms_0_0= ruleJoinTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1085:1: (lv_terms_0_0= ruleJoinTerm )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1086:3: lv_terms_0_0= ruleJoinTerm
            {
             
            	        newCompositeNode(grammarAccess.getJoinExpressionAccess().getTermsJoinTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleJoinTerm_in_ruleJoinExpression2203);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1102:2: (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==21) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1102:4: otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleJoinExpression2216); 

            	        	newLeafNode(otherlv_1, grammarAccess.getJoinExpressionAccess().getPlusSignKeyword_1_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1106:1: ( (lv_terms_2_0= ruleJoinTerm ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1107:1: (lv_terms_2_0= ruleJoinTerm )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1107:1: (lv_terms_2_0= ruleJoinTerm )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1108:3: lv_terms_2_0= ruleJoinTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJoinExpressionAccess().getTermsJoinTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJoinTerm_in_ruleJoinExpression2237);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1132:1: entryRuleJoinTerm returns [EObject current=null] : iv_ruleJoinTerm= ruleJoinTerm EOF ;
    public final EObject entryRuleJoinTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinTerm = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1133:2: (iv_ruleJoinTerm= ruleJoinTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1134:2: iv_ruleJoinTerm= ruleJoinTerm EOF
            {
             newCompositeNode(grammarAccess.getJoinTermRule()); 
            pushFollow(FOLLOW_ruleJoinTerm_in_entryRuleJoinTerm2275);
            iv_ruleJoinTerm=ruleJoinTerm();

            state._fsp--;

             current =iv_ruleJoinTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinTerm2285); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1141:1: ruleJoinTerm returns [EObject current=null] : ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )? ) ;
    public final EObject ruleJoinTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_reference_0_0 = null;

        EObject lv_mapping_1_0 = null;

        EObject lv_grouping_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1144:28: ( ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )? ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1145:1: ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1145:1: ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )? )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1145:2: ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )?
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1145:2: ( (lv_reference_0_0= ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1146:1: (lv_reference_0_0= ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1146:1: (lv_reference_0_0= ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1147:3: lv_reference_0_0= ruleModelReference
            {
             
            	        newCompositeNode(grammarAccess.getJoinTermAccess().getReferenceModelReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModelReference_in_ruleJoinTerm2331);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1163:2: ( (lv_mapping_1_0= ruleModelMapping ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==30) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1164:1: (lv_mapping_1_0= ruleModelMapping )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1164:1: (lv_mapping_1_0= ruleModelMapping )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1165:3: lv_mapping_1_0= ruleModelMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getJoinTermAccess().getMappingModelMappingParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModelMapping_in_ruleJoinTerm2352);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1181:3: ( (lv_grouping_2_0= ruleGrouping ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==29) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1182:1: (lv_grouping_2_0= ruleGrouping )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1182:1: (lv_grouping_2_0= ruleGrouping )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1183:3: lv_grouping_2_0= ruleGrouping
                    {
                     
                    	        newCompositeNode(grammarAccess.getJoinTermAccess().getGroupingGroupingParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGrouping_in_ruleJoinTerm2374);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1207:1: entryRuleSummarizeExpression returns [EObject current=null] : iv_ruleSummarizeExpression= ruleSummarizeExpression EOF ;
    public final EObject entryRuleSummarizeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSummarizeExpression = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1208:2: (iv_ruleSummarizeExpression= ruleSummarizeExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1209:2: iv_ruleSummarizeExpression= ruleSummarizeExpression EOF
            {
             newCompositeNode(grammarAccess.getSummarizeExpressionRule()); 
            pushFollow(FOLLOW_ruleSummarizeExpression_in_entryRuleSummarizeExpression2411);
            iv_ruleSummarizeExpression=ruleSummarizeExpression();

            state._fsp--;

             current =iv_ruleSummarizeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeExpression2421); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1216:1: ruleSummarizeExpression returns [EObject current=null] : ( ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )* ) ;
    public final EObject ruleSummarizeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_terms_0_0 = null;

        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1219:28: ( ( ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1220:1: ( ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1220:1: ( ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1220:2: ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1220:2: ( (lv_terms_0_0= ruleSummarizeTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1221:1: (lv_terms_0_0= ruleSummarizeTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1221:1: (lv_terms_0_0= ruleSummarizeTerm )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1222:3: lv_terms_0_0= ruleSummarizeTerm
            {
             
            	        newCompositeNode(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSummarizeTerm_in_ruleSummarizeExpression2467);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1238:2: (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==21) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1238:4: otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSummarizeExpression2480); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSummarizeExpressionAccess().getPlusSignKeyword_1_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1242:1: ( (lv_terms_2_0= ruleSummarizeTerm ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1243:1: (lv_terms_2_0= ruleSummarizeTerm )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1243:1: (lv_terms_2_0= ruleSummarizeTerm )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1244:3: lv_terms_2_0= ruleSummarizeTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSummarizeTerm_in_ruleSummarizeExpression2501);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1268:1: entryRuleSummarizeTerm returns [EObject current=null] : iv_ruleSummarizeTerm= ruleSummarizeTerm EOF ;
    public final EObject entryRuleSummarizeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSummarizeTerm = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1269:2: (iv_ruleSummarizeTerm= ruleSummarizeTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1270:2: iv_ruleSummarizeTerm= ruleSummarizeTerm EOF
            {
             newCompositeNode(grammarAccess.getSummarizeTermRule()); 
            pushFollow(FOLLOW_ruleSummarizeTerm_in_entryRuleSummarizeTerm2539);
            iv_ruleSummarizeTerm=ruleSummarizeTerm();

            state._fsp--;

             current =iv_ruleSummarizeTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeTerm2549); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1277:1: ruleSummarizeTerm returns [EObject current=null] : ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )? ) ;
    public final EObject ruleSummarizeTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_reference_0_0 = null;

        EObject lv_folding_1_0 = null;

        EObject lv_grouping_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1280:28: ( ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )? ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1281:1: ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1281:1: ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )? )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1281:2: ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )?
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1281:2: ( (lv_reference_0_0= ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1282:1: (lv_reference_0_0= ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1282:1: (lv_reference_0_0= ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1283:3: lv_reference_0_0= ruleModelReference
            {
             
            	        newCompositeNode(grammarAccess.getSummarizeTermAccess().getReferenceModelReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModelReference_in_ruleSummarizeTerm2595);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1299:2: ( (lv_folding_1_0= ruleModelFolding ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1300:1: (lv_folding_1_0= ruleModelFolding )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1300:1: (lv_folding_1_0= ruleModelFolding )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1301:3: lv_folding_1_0= ruleModelFolding
            {
             
            	        newCompositeNode(grammarAccess.getSummarizeTermAccess().getFoldingModelFoldingParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleModelFolding_in_ruleSummarizeTerm2616);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1317:2: ( (lv_grouping_2_0= ruleGrouping ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==29) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1318:1: (lv_grouping_2_0= ruleGrouping )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1318:1: (lv_grouping_2_0= ruleGrouping )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1319:3: lv_grouping_2_0= ruleGrouping
                    {
                     
                    	        newCompositeNode(grammarAccess.getSummarizeTermAccess().getGroupingGroupingParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGrouping_in_ruleSummarizeTerm2637);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1343:1: entryRuleDescription returns [String current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final String entryRuleDescription() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDescription = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1344:2: (iv_ruleDescription= ruleDescription EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1345:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription2675);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription2686); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1352:1: ruleDescription returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleDescription() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1355:28: (this_STRING_0= RULE_STRING )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1356:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDescription2725); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1371:1: entryRuleAttributeList returns [EObject current=null] : iv_ruleAttributeList= ruleAttributeList EOF ;
    public final EObject entryRuleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeList = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1372:2: (iv_ruleAttributeList= ruleAttributeList EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1373:2: iv_ruleAttributeList= ruleAttributeList EOF
            {
             newCompositeNode(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_ruleAttributeList_in_entryRuleAttributeList2769);
            iv_ruleAttributeList=ruleAttributeList();

            state._fsp--;

             current =iv_ruleAttributeList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeList2779); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1380:1: ruleAttributeList returns [EObject current=null] : ( (lv_attributes_0_0= ruleAttribute ) )+ ;
    public final EObject ruleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_0_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1383:28: ( ( (lv_attributes_0_0= ruleAttribute ) )+ )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1384:1: ( (lv_attributes_0_0= ruleAttribute ) )+
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1384:1: ( (lv_attributes_0_0= ruleAttribute ) )+
            int cnt26=0;
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==26) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1385:1: (lv_attributes_0_0= ruleAttribute )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1385:1: (lv_attributes_0_0= ruleAttribute )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1386:3: lv_attributes_0_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleAttributeList2824);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1410:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1411:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1412:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute2860);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute2870); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1419:1: ruleAttribute returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elementBlock_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1422:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )? ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1423:1: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1423:1: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )? )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1423:3: otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )?
            {
            otherlv_0=(Token)match(input,26,FOLLOW_26_in_ruleAttribute2907); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getCommercialAtKeyword_0());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1427:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1428:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1428:1: (lv_name_1_0= ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1429:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAttribute2928);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1445:2: ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==27) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1446:1: (lv_elementBlock_2_0= ruleAttributeElementBlock )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1446:1: (lv_elementBlock_2_0= ruleAttributeElementBlock )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1447:3: lv_elementBlock_2_0= ruleAttributeElementBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getElementBlockAttributeElementBlockParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeElementBlock_in_ruleAttribute2949);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1471:1: entryRuleAttributeElementBlock returns [EObject current=null] : iv_ruleAttributeElementBlock= ruleAttributeElementBlock EOF ;
    public final EObject entryRuleAttributeElementBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeElementBlock = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1472:2: (iv_ruleAttributeElementBlock= ruleAttributeElementBlock EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1473:2: iv_ruleAttributeElementBlock= ruleAttributeElementBlock EOF
            {
             newCompositeNode(grammarAccess.getAttributeElementBlockRule()); 
            pushFollow(FOLLOW_ruleAttributeElementBlock_in_entryRuleAttributeElementBlock2986);
            iv_ruleAttributeElementBlock=ruleAttributeElementBlock();

            state._fsp--;

             current =iv_ruleAttributeElementBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElementBlock2996); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1480:1: ruleAttributeElementBlock returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )? otherlv_4= ')' ) ;
    public final EObject ruleAttributeElementBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1483:28: ( ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )? otherlv_4= ')' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1484:1: ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )? otherlv_4= ')' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1484:1: ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )? otherlv_4= ')' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1484:2: () otherlv_1= '(' ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )? otherlv_4= ')'
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1484:2: ()
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1485:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeElementBlockAccess().getAttributeElementBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleAttributeElementBlock3042); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeElementBlockAccess().getLeftParenthesisKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1494:1: ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_NAME_TOKEN||LA29_0==16||(LA29_0>=18 && LA29_0<=19)) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1494:2: ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )?
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1494:2: ( (lv_elements_2_0= ruleAttributeElementList ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1495:1: (lv_elements_2_0= ruleAttributeElementList )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1495:1: (lv_elements_2_0= ruleAttributeElementList )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1496:3: lv_elements_2_0= ruleAttributeElementList
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeElementBlockAccess().getElementsAttributeElementListParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeElementList_in_ruleAttributeElementBlock3064);
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

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1512:2: (otherlv_3= ',' )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==25) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1512:4: otherlv_3= ','
                            {
                            otherlv_3=(Token)match(input,25,FOLLOW_25_in_ruleAttributeElementBlock3077); 

                                	newLeafNode(otherlv_3, grammarAccess.getAttributeElementBlockAccess().getCommaKeyword_2_1());
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleAttributeElementBlock3093); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1528:1: entryRuleAttributeElementList returns [EObject current=null] : iv_ruleAttributeElementList= ruleAttributeElementList EOF ;
    public final EObject entryRuleAttributeElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeElementList = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1529:2: (iv_ruleAttributeElementList= ruleAttributeElementList EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1530:2: iv_ruleAttributeElementList= ruleAttributeElementList EOF
            {
             newCompositeNode(grammarAccess.getAttributeElementListRule()); 
            pushFollow(FOLLOW_ruleAttributeElementList_in_entryRuleAttributeElementList3129);
            iv_ruleAttributeElementList=ruleAttributeElementList();

            state._fsp--;

             current =iv_ruleAttributeElementList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElementList3139); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1537:1: ruleAttributeElementList returns [EObject current=null] : ( ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )* ) ;
    public final EObject ruleAttributeElementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1540:28: ( ( ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1541:1: ( ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1541:1: ( ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1541:2: ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1541:2: ( (lv_elements_0_0= ruleAttributeElement ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1542:1: (lv_elements_0_0= ruleAttributeElement )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1542:1: (lv_elements_0_0= ruleAttributeElement )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1543:3: lv_elements_0_0= ruleAttributeElement
            {
             
            	        newCompositeNode(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeElement_in_ruleAttributeElementList3185);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1559:2: (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )*
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
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1559:4: otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) )
            	    {
            	    otherlv_1=(Token)match(input,25,FOLLOW_25_in_ruleAttributeElementList3198); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAttributeElementListAccess().getCommaKeyword_1_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1563:1: ( (lv_elements_2_0= ruleAttributeElement ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1564:1: (lv_elements_2_0= ruleAttributeElement )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1564:1: (lv_elements_2_0= ruleAttributeElement )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1565:3: lv_elements_2_0= ruleAttributeElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttributeElement_in_ruleAttributeElementList3219);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1589:1: entryRuleAttributeElement returns [EObject current=null] : iv_ruleAttributeElement= ruleAttributeElement EOF ;
    public final EObject entryRuleAttributeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeElement = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1590:2: (iv_ruleAttributeElement= ruleAttributeElement EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1591:2: iv_ruleAttributeElement= ruleAttributeElement EOF
            {
             newCompositeNode(grammarAccess.getAttributeElementRule()); 
            pushFollow(FOLLOW_ruleAttributeElement_in_entryRuleAttributeElement3257);
            iv_ruleAttributeElement=ruleAttributeElement();

            state._fsp--;

             current =iv_ruleAttributeElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElement3267); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1598:1: ruleAttributeElement returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) ) ;
    public final EObject ruleAttributeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1601:28: ( ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1602:1: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1602:1: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1602:2: ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1602:2: ( (lv_name_0_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1603:1: (lv_name_0_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1603:1: (lv_name_0_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1604:3: lv_name_0_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getAttributeElementAccess().getNameNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleAttributeElement3313);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAttributeElement3325); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeElementAccess().getEqualsSignKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1624:1: ( (lv_value_2_0= ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1625:1: (lv_value_2_0= ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1625:1: (lv_value_2_0= ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1626:3: lv_value_2_0= ruleAttributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAttributeElementAccess().getValueAttributeValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeValue_in_ruleAttributeElement3346);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1650:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1651:2: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1652:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue3382);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue3392); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1659:1: ruleAttributeValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleAttributeValueArray ) ) | ( (lv_value_1_0= ruleAttributeValueMap ) ) | ( (lv_value_2_0= ruleQualifiedNameObject ) ) | ( (lv_value_3_0= ruleLiteral ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1662:28: ( ( ( (lv_value_0_0= ruleAttributeValueArray ) ) | ( (lv_value_1_0= ruleAttributeValueMap ) ) | ( (lv_value_2_0= ruleQualifiedNameObject ) ) | ( (lv_value_3_0= ruleLiteral ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1663:1: ( ( (lv_value_0_0= ruleAttributeValueArray ) ) | ( (lv_value_1_0= ruleAttributeValueMap ) ) | ( (lv_value_2_0= ruleQualifiedNameObject ) ) | ( (lv_value_3_0= ruleLiteral ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1663:1: ( ( (lv_value_0_0= ruleAttributeValueArray ) ) | ( (lv_value_1_0= ruleAttributeValueMap ) ) | ( (lv_value_2_0= ruleQualifiedNameObject ) ) | ( (lv_value_3_0= ruleLiteral ) ) )
            int alt31=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                switch ( input.LA(2) ) {
                case 24:
                    {
                    alt31=2;
                    }
                    break;
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
                    int LA31_6 = input.LA(3);

                    if ( (LA31_6==24) ) {
                        alt31=2;
                    }
                    else if ( (LA31_6==23||LA31_6==25) ) {
                        alt31=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 6, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_INT:
                    {
                    int LA31_7 = input.LA(3);

                    if ( (LA31_7==24) ) {
                        alt31=2;
                    }
                    else if ( (LA31_7==23||LA31_7==25) ) {
                        alt31=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 7, input);

                        throw nvae;
                    }
                    }
                    break;
                case RULE_DECIMAL:
                    {
                    int LA31_8 = input.LA(3);

                    if ( (LA31_8==24) ) {
                        alt31=2;
                    }
                    else if ( (LA31_8==23||LA31_8==25) ) {
                        alt31=1;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 8, input);

                        throw nvae;
                    }
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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1663:2: ( (lv_value_0_0= ruleAttributeValueArray ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1663:2: ( (lv_value_0_0= ruleAttributeValueArray ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1664:1: (lv_value_0_0= ruleAttributeValueArray )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1664:1: (lv_value_0_0= ruleAttributeValueArray )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1665:3: lv_value_0_0= ruleAttributeValueArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueAccess().getValueAttributeValueArrayParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeValueArray_in_ruleAttributeValue3438);
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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1682:6: ( (lv_value_1_0= ruleAttributeValueMap ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1682:6: ( (lv_value_1_0= ruleAttributeValueMap ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1683:1: (lv_value_1_0= ruleAttributeValueMap )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1683:1: (lv_value_1_0= ruleAttributeValueMap )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1684:3: lv_value_1_0= ruleAttributeValueMap
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueAccess().getValueAttributeValueMapParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeValueMap_in_ruleAttributeValue3465);
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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1701:6: ( (lv_value_2_0= ruleQualifiedNameObject ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1701:6: ( (lv_value_2_0= ruleQualifiedNameObject ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1702:1: (lv_value_2_0= ruleQualifiedNameObject )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1702:1: (lv_value_2_0= ruleQualifiedNameObject )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1703:3: lv_value_2_0= ruleQualifiedNameObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueAccess().getValueQualifiedNameObjectParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedNameObject_in_ruleAttributeValue3492);
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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1720:6: ( (lv_value_3_0= ruleLiteral ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1720:6: ( (lv_value_3_0= ruleLiteral ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1721:1: (lv_value_3_0= ruleLiteral )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1721:1: (lv_value_3_0= ruleLiteral )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1722:3: lv_value_3_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueAccess().getValueLiteralParserRuleCall_3_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleAttributeValue3519);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1746:1: entryRuleAttributeValueArray returns [EObject current=null] : iv_ruleAttributeValueArray= ruleAttributeValueArray EOF ;
    public final EObject entryRuleAttributeValueArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValueArray = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1747:2: (iv_ruleAttributeValueArray= ruleAttributeValueArray EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1748:2: iv_ruleAttributeValueArray= ruleAttributeValueArray EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueArrayRule()); 
            pushFollow(FOLLOW_ruleAttributeValueArray_in_entryRuleAttributeValueArray3555);
            iv_ruleAttributeValueArray=ruleAttributeValueArray();

            state._fsp--;

             current =iv_ruleAttributeValueArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValueArray3565); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1755:1: ruleAttributeValueArray returns [EObject current=null] : ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' ( (lv_elements_4_0= ruleAttributeValue ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) ) )* (otherlv_7= ',' )? otherlv_8= '}' ) ) ;
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
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1758:28: ( ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' ( (lv_elements_4_0= ruleAttributeValue ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) ) )* (otherlv_7= ',' )? otherlv_8= '}' ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1759:1: ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' ( (lv_elements_4_0= ruleAttributeValue ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) ) )* (otherlv_7= ',' )? otherlv_8= '}' ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1759:1: ( ( () otherlv_1= '{' otherlv_2= '}' ) | (otherlv_3= '{' ( (lv_elements_4_0= ruleAttributeValue ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) ) )* (otherlv_7= ',' )? otherlv_8= '}' ) )
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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1759:2: ( () otherlv_1= '{' otherlv_2= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1759:2: ( () otherlv_1= '{' otherlv_2= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1759:3: () otherlv_1= '{' otherlv_2= '}'
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1759:3: ()
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1760:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAttributeValueArrayAccess().getAttributeValueArrayAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAttributeValueArray3612); 

                        	newLeafNode(otherlv_1, grammarAccess.getAttributeValueArrayAccess().getLeftCurlyBracketKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleAttributeValueArray3624); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeValueArrayAccess().getRightCurlyBracketKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1774:6: (otherlv_3= '{' ( (lv_elements_4_0= ruleAttributeValue ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) ) )* (otherlv_7= ',' )? otherlv_8= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1774:6: (otherlv_3= '{' ( (lv_elements_4_0= ruleAttributeValue ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) ) )* (otherlv_7= ',' )? otherlv_8= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1774:8: otherlv_3= '{' ( (lv_elements_4_0= ruleAttributeValue ) ) (otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) ) )* (otherlv_7= ',' )? otherlv_8= '}'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleAttributeValueArray3644); 

                        	newLeafNode(otherlv_3, grammarAccess.getAttributeValueArrayAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1778:1: ( (lv_elements_4_0= ruleAttributeValue ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1779:1: (lv_elements_4_0= ruleAttributeValue )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1779:1: (lv_elements_4_0= ruleAttributeValue )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1780:3: lv_elements_4_0= ruleAttributeValue
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeValue_in_ruleAttributeValueArray3665);
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

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1796:2: (otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) ) )*
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
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1796:4: otherlv_5= ',' ( (lv_elements_6_0= ruleAttributeValue ) )
                    	    {
                    	    otherlv_5=(Token)match(input,25,FOLLOW_25_in_ruleAttributeValueArray3678); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1800:1: ( (lv_elements_6_0= ruleAttributeValue ) )
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1801:1: (lv_elements_6_0= ruleAttributeValue )
                    	    {
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1801:1: (lv_elements_6_0= ruleAttributeValue )
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1802:3: lv_elements_6_0= ruleAttributeValue
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttributeValue_in_ruleAttributeValueArray3699);
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

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1818:4: (otherlv_7= ',' )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==25) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1818:6: otherlv_7= ','
                            {
                            otherlv_7=(Token)match(input,25,FOLLOW_25_in_ruleAttributeValueArray3714); 

                                	newLeafNode(otherlv_7, grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_1_3());
                                

                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,23,FOLLOW_23_in_ruleAttributeValueArray3728); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1834:1: entryRuleAttributeValueMap returns [EObject current=null] : iv_ruleAttributeValueMap= ruleAttributeValueMap EOF ;
    public final EObject entryRuleAttributeValueMap() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValueMap = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1835:2: (iv_ruleAttributeValueMap= ruleAttributeValueMap EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1836:2: iv_ruleAttributeValueMap= ruleAttributeValueMap EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueMapRule()); 
            pushFollow(FOLLOW_ruleAttributeValueMap_in_entryRuleAttributeValueMap3765);
            iv_ruleAttributeValueMap=ruleAttributeValueMap();

            state._fsp--;

             current =iv_ruleAttributeValueMap; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValueMap3775); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1843:1: ruleAttributeValueMap returns [EObject current=null] : ( ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' ) | (otherlv_4= '{' ( (lv_elements_5_0= ruleAttributePair ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) ) ;
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
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1846:28: ( ( ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' ) | (otherlv_4= '{' ( (lv_elements_5_0= ruleAttributePair ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1847:1: ( ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' ) | (otherlv_4= '{' ( (lv_elements_5_0= ruleAttributePair ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1847:1: ( ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' ) | (otherlv_4= '{' ( (lv_elements_5_0= ruleAttributePair ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) ) )* (otherlv_8= ',' )? otherlv_9= '}' ) )
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==22) ) {
                int LA37_1 = input.LA(2);

                if ( (LA37_1==24) ) {
                    alt37=1;
                }
                else if ( (LA37_1==RULE_STRING||(LA37_1>=RULE_INT && LA37_1<=RULE_DECIMAL)) ) {
                    alt37=2;
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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1847:2: ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1847:2: ( () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1847:3: () otherlv_1= '{' otherlv_2= ':' otherlv_3= '}'
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1847:3: ()
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1848:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getAttributeValueMapAccess().getAttributeValueMapAction_0_0(),
                                current);
                        

                    }

                    otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleAttributeValueMap3822); 

                        	newLeafNode(otherlv_1, grammarAccess.getAttributeValueMapAccess().getLeftCurlyBracketKeyword_0_1());
                        
                    otherlv_2=(Token)match(input,24,FOLLOW_24_in_ruleAttributeValueMap3834); 

                        	newLeafNode(otherlv_2, grammarAccess.getAttributeValueMapAccess().getColonKeyword_0_2());
                        
                    otherlv_3=(Token)match(input,23,FOLLOW_23_in_ruleAttributeValueMap3846); 

                        	newLeafNode(otherlv_3, grammarAccess.getAttributeValueMapAccess().getRightCurlyBracketKeyword_0_3());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1866:6: (otherlv_4= '{' ( (lv_elements_5_0= ruleAttributePair ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) ) )* (otherlv_8= ',' )? otherlv_9= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1866:6: (otherlv_4= '{' ( (lv_elements_5_0= ruleAttributePair ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) ) )* (otherlv_8= ',' )? otherlv_9= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1866:8: otherlv_4= '{' ( (lv_elements_5_0= ruleAttributePair ) ) (otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) ) )* (otherlv_8= ',' )? otherlv_9= '}'
                    {
                    otherlv_4=(Token)match(input,22,FOLLOW_22_in_ruleAttributeValueMap3866); 

                        	newLeafNode(otherlv_4, grammarAccess.getAttributeValueMapAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1870:1: ( (lv_elements_5_0= ruleAttributePair ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1871:1: (lv_elements_5_0= ruleAttributePair )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1871:1: (lv_elements_5_0= ruleAttributePair )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1872:3: lv_elements_5_0= ruleAttributePair
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueMapAccess().getElementsAttributePairParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributePair_in_ruleAttributeValueMap3887);
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

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1888:2: (otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) ) )*
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
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1888:4: otherlv_6= ',' ( (lv_elements_7_0= ruleAttributePair ) )
                    	    {
                    	    otherlv_6=(Token)match(input,25,FOLLOW_25_in_ruleAttributeValueMap3900); 

                    	        	newLeafNode(otherlv_6, grammarAccess.getAttributeValueMapAccess().getCommaKeyword_1_2_0());
                    	        
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1892:1: ( (lv_elements_7_0= ruleAttributePair ) )
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1893:1: (lv_elements_7_0= ruleAttributePair )
                    	    {
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1893:1: (lv_elements_7_0= ruleAttributePair )
                    	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1894:3: lv_elements_7_0= ruleAttributePair
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getAttributeValueMapAccess().getElementsAttributePairParserRuleCall_1_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleAttributePair_in_ruleAttributeValueMap3921);
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

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1910:4: (otherlv_8= ',' )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==25) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1910:6: otherlv_8= ','
                            {
                            otherlv_8=(Token)match(input,25,FOLLOW_25_in_ruleAttributeValueMap3936); 

                                	newLeafNode(otherlv_8, grammarAccess.getAttributeValueMapAccess().getCommaKeyword_1_3());
                                

                            }
                            break;

                    }

                    otherlv_9=(Token)match(input,23,FOLLOW_23_in_ruleAttributeValueMap3950); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1926:1: entryRuleAttributePair returns [EObject current=null] : iv_ruleAttributePair= ruleAttributePair EOF ;
    public final EObject entryRuleAttributePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributePair = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1927:2: (iv_ruleAttributePair= ruleAttributePair EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1928:2: iv_ruleAttributePair= ruleAttributePair EOF
            {
             newCompositeNode(grammarAccess.getAttributePairRule()); 
            pushFollow(FOLLOW_ruleAttributePair_in_entryRuleAttributePair3987);
            iv_ruleAttributePair=ruleAttributePair();

            state._fsp--;

             current =iv_ruleAttributePair; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributePair3997); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1935:1: ruleAttributePair returns [EObject current=null] : ( ( (lv_name_0_0= ruleLiteral ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) ) ;
    public final EObject ruleAttributePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_name_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1938:28: ( ( ( (lv_name_0_0= ruleLiteral ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1939:1: ( ( (lv_name_0_0= ruleLiteral ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1939:1: ( ( (lv_name_0_0= ruleLiteral ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1939:2: ( (lv_name_0_0= ruleLiteral ) ) otherlv_1= ':' ( (lv_value_2_0= ruleAttributeValue ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1939:2: ( (lv_name_0_0= ruleLiteral ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1940:1: (lv_name_0_0= ruleLiteral )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1940:1: (lv_name_0_0= ruleLiteral )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1941:3: lv_name_0_0= ruleLiteral
            {
             
            	        newCompositeNode(grammarAccess.getAttributePairAccess().getNameLiteralParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleLiteral_in_ruleAttributePair4043);
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

            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleAttributePair4055); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributePairAccess().getColonKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1961:1: ( (lv_value_2_0= ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1962:1: (lv_value_2_0= ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1962:1: (lv_value_2_0= ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1963:3: lv_value_2_0= ruleAttributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAttributePairAccess().getValueAttributeValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeValue_in_ruleAttributePair4076);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1987:1: entryRuleGrouping returns [EObject current=null] : iv_ruleGrouping= ruleGrouping EOF ;
    public final EObject entryRuleGrouping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrouping = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1988:2: (iv_ruleGrouping= ruleGrouping EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1989:2: iv_ruleGrouping= ruleGrouping EOF
            {
             newCompositeNode(grammarAccess.getGroupingRule()); 
            pushFollow(FOLLOW_ruleGrouping_in_entryRuleGrouping4112);
            iv_ruleGrouping=ruleGrouping();

            state._fsp--;

             current =iv_ruleGrouping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouping4122); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1996:1: ruleGrouping returns [EObject current=null] : (otherlv_0= '%' ( ( ruleName ) ) (otherlv_2= ',' ( ( ruleName ) ) )* ) ;
    public final EObject ruleGrouping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1999:28: ( (otherlv_0= '%' ( ( ruleName ) ) (otherlv_2= ',' ( ( ruleName ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2000:1: (otherlv_0= '%' ( ( ruleName ) ) (otherlv_2= ',' ( ( ruleName ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2000:1: (otherlv_0= '%' ( ( ruleName ) ) (otherlv_2= ',' ( ( ruleName ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2000:3: otherlv_0= '%' ( ( ruleName ) ) (otherlv_2= ',' ( ( ruleName ) ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleGrouping4159); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupingAccess().getPercentSignKeyword_0());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2004:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2005:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2005:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2006:3: ruleName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGroupingAccess().getNamePropertyCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleGrouping4182);
            ruleName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2019:2: (otherlv_2= ',' ( ( ruleName ) ) )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==25) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2019:4: otherlv_2= ',' ( ( ruleName ) )
            	    {
            	    otherlv_2=(Token)match(input,25,FOLLOW_25_in_ruleGrouping4195); 

            	        	newLeafNode(otherlv_2, grammarAccess.getGroupingAccess().getCommaKeyword_2_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2023:1: ( ( ruleName ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2024:1: ( ruleName )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2024:1: ( ruleName )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2025:3: ruleName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupingRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGroupingAccess().getNamePropertyCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleName_in_ruleGrouping4218);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2046:1: entryRuleModelMapping returns [EObject current=null] : iv_ruleModelMapping= ruleModelMapping EOF ;
    public final EObject entryRuleModelMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelMapping = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2047:2: (iv_ruleModelMapping= ruleModelMapping EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2048:2: iv_ruleModelMapping= ruleModelMapping EOF
            {
             newCompositeNode(grammarAccess.getModelMappingRule()); 
            pushFollow(FOLLOW_ruleModelMapping_in_entryRuleModelMapping4256);
            iv_ruleModelMapping=ruleModelMapping();

            state._fsp--;

             current =iv_ruleModelMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelMapping4266); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2055:1: ruleModelMapping returns [EObject current=null] : (otherlv_0= '->' otherlv_1= '{' () ( (lv_mappings_3_0= rulePropertyMapping ) )* otherlv_4= '}' ) ;
    public final EObject ruleModelMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_mappings_3_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2058:28: ( (otherlv_0= '->' otherlv_1= '{' () ( (lv_mappings_3_0= rulePropertyMapping ) )* otherlv_4= '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2059:1: (otherlv_0= '->' otherlv_1= '{' () ( (lv_mappings_3_0= rulePropertyMapping ) )* otherlv_4= '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2059:1: (otherlv_0= '->' otherlv_1= '{' () ( (lv_mappings_3_0= rulePropertyMapping ) )* otherlv_4= '}' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2059:3: otherlv_0= '->' otherlv_1= '{' () ( (lv_mappings_3_0= rulePropertyMapping ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleModelMapping4303); 

                	newLeafNode(otherlv_0, grammarAccess.getModelMappingAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleModelMapping4315); 

                	newLeafNode(otherlv_1, grammarAccess.getModelMappingAccess().getLeftCurlyBracketKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2067:1: ()
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2068:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelMappingAccess().getModelMappingAction_2(),
                        current);
                

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2073:2: ( (lv_mappings_3_0= rulePropertyMapping ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=RULE_STRING && LA39_0<=RULE_NAME_TOKEN)||LA39_0==16||(LA39_0>=18 && LA39_0<=19)||LA39_0==26) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2074:1: (lv_mappings_3_0= rulePropertyMapping )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2074:1: (lv_mappings_3_0= rulePropertyMapping )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2075:3: lv_mappings_3_0= rulePropertyMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelMappingAccess().getMappingsPropertyMappingParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertyMapping_in_ruleModelMapping4345);
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleModelMapping4358); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2103:1: entryRulePropertyMapping returns [EObject current=null] : iv_rulePropertyMapping= rulePropertyMapping EOF ;
    public final EObject entryRulePropertyMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMapping = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2104:2: (iv_rulePropertyMapping= rulePropertyMapping EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2105:2: iv_rulePropertyMapping= rulePropertyMapping EOF
            {
             newCompositeNode(grammarAccess.getPropertyMappingRule()); 
            pushFollow(FOLLOW_rulePropertyMapping_in_entryRulePropertyMapping4394);
            iv_rulePropertyMapping=rulePropertyMapping();

            state._fsp--;

             current =iv_rulePropertyMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyMapping4404); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2112:1: rulePropertyMapping returns [EObject current=null] : ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' ) ;
    public final EObject rulePropertyMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_description_0_0 = null;

        EObject lv_attributes_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2115:28: ( ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2116:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2116:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2116:2: ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';'
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2116:2: ( (lv_description_0_0= ruleDescription ) )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==RULE_STRING) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2117:1: (lv_description_0_0= ruleDescription )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2117:1: (lv_description_0_0= ruleDescription )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2118:3: lv_description_0_0= ruleDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyMappingAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDescription_in_rulePropertyMapping4450);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2134:3: ( (lv_attributes_1_0= ruleAttributeList ) )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==26) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2135:1: (lv_attributes_1_0= ruleAttributeList )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2135:1: (lv_attributes_1_0= ruleAttributeList )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2136:3: lv_attributes_1_0= ruleAttributeList
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyMappingAccess().getAttributesAttributeListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeList_in_rulePropertyMapping4472);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2152:3: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2153:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2153:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2154:3: ruleName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPropertyMappingAccess().getFromPropertyCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyMapping4496);
            ruleName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_rulePropertyMapping4508); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyMappingAccess().getHyphenMinusGreaterThanSignKeyword_3());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2171:1: ( (lv_name_4_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2172:1: (lv_name_4_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2172:1: (lv_name_4_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2173:3: lv_name_4_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyMappingAccess().getNameNameParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyMapping4529);
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

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_rulePropertyMapping4541); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2201:1: entryRuleModelFolding returns [EObject current=null] : iv_ruleModelFolding= ruleModelFolding EOF ;
    public final EObject entryRuleModelFolding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFolding = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2202:2: (iv_ruleModelFolding= ruleModelFolding EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2203:2: iv_ruleModelFolding= ruleModelFolding EOF
            {
             newCompositeNode(grammarAccess.getModelFoldingRule()); 
            pushFollow(FOLLOW_ruleModelFolding_in_entryRuleModelFolding4577);
            iv_ruleModelFolding=ruleModelFolding();

            state._fsp--;

             current =iv_ruleModelFolding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelFolding4587); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2210:1: ruleModelFolding returns [EObject current=null] : (otherlv_0= '=>' otherlv_1= '{' () ( (lv_foldings_3_0= rulePropertyFolding ) )* otherlv_4= '}' ) ;
    public final EObject ruleModelFolding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_foldings_3_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2213:28: ( (otherlv_0= '=>' otherlv_1= '{' () ( (lv_foldings_3_0= rulePropertyFolding ) )* otherlv_4= '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2214:1: (otherlv_0= '=>' otherlv_1= '{' () ( (lv_foldings_3_0= rulePropertyFolding ) )* otherlv_4= '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2214:1: (otherlv_0= '=>' otherlv_1= '{' () ( (lv_foldings_3_0= rulePropertyFolding ) )* otherlv_4= '}' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2214:3: otherlv_0= '=>' otherlv_1= '{' () ( (lv_foldings_3_0= rulePropertyFolding ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleModelFolding4624); 

                	newLeafNode(otherlv_0, grammarAccess.getModelFoldingAccess().getEqualsSignGreaterThanSignKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleModelFolding4636); 

                	newLeafNode(otherlv_1, grammarAccess.getModelFoldingAccess().getLeftCurlyBracketKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2222:1: ()
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2223:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelFoldingAccess().getModelFoldingAction_2(),
                        current);
                

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2228:2: ( (lv_foldings_3_0= rulePropertyFolding ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( ((LA42_0>=RULE_STRING && LA42_0<=RULE_NAME_TOKEN)||LA42_0==16||(LA42_0>=18 && LA42_0<=19)||LA42_0==26) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2229:1: (lv_foldings_3_0= rulePropertyFolding )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2229:1: (lv_foldings_3_0= rulePropertyFolding )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2230:3: lv_foldings_3_0= rulePropertyFolding
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelFoldingAccess().getFoldingsPropertyFoldingParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertyFolding_in_ruleModelFolding4666);
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

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleModelFolding4679); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2258:1: entryRulePropertyFolding returns [EObject current=null] : iv_rulePropertyFolding= rulePropertyFolding EOF ;
    public final EObject entryRulePropertyFolding() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyFolding = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2259:2: (iv_rulePropertyFolding= rulePropertyFolding EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2260:2: iv_rulePropertyFolding= rulePropertyFolding EOF
            {
             newCompositeNode(grammarAccess.getPropertyFoldingRule()); 
            pushFollow(FOLLOW_rulePropertyFolding_in_entryRulePropertyFolding4715);
            iv_rulePropertyFolding=rulePropertyFolding();

            state._fsp--;

             current =iv_rulePropertyFolding; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyFolding4725); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2267:1: rulePropertyFolding returns [EObject current=null] : ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( ( ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' ) ;
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
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2270:28: ( ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( ( ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2271:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( ( ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2271:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( ( ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2271:2: ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( ( ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';'
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2271:2: ( (lv_description_0_0= ruleDescription ) )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==RULE_STRING) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2272:1: (lv_description_0_0= ruleDescription )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2272:1: (lv_description_0_0= ruleDescription )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2273:3: lv_description_0_0= ruleDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDescription_in_rulePropertyFolding4771);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2289:3: ( (lv_attributes_1_0= ruleAttributeList ) )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==26) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2290:1: (lv_attributes_1_0= ruleAttributeList )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2290:1: (lv_attributes_1_0= ruleAttributeList )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2291:3: lv_attributes_1_0= ruleAttributeList
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getAttributesAttributeListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeList_in_rulePropertyFolding4793);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2307:3: ( (lv_aggregator_2_0= ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2308:1: (lv_aggregator_2_0= ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2308:1: (lv_aggregator_2_0= ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2309:3: lv_aggregator_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getAggregatorQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyFolding4815);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2325:2: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2326:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2326:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2327:3: ruleName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyFoldingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getFromPropertyCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyFolding4838);
            ruleName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2340:2: (otherlv_4= '->' | otherlv_5= '=>' )
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==30) ) {
                alt45=1;
            }
            else if ( (LA45_0==31) ) {
                alt45=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 45, 0, input);

                throw nvae;
            }
            switch (alt45) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2340:4: otherlv_4= '->'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_rulePropertyFolding4851); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertyFoldingAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2345:7: otherlv_5= '=>'
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_rulePropertyFolding4869); 

                        	newLeafNode(otherlv_5, grammarAccess.getPropertyFoldingAccess().getEqualsSignGreaterThanSignKeyword_4_1());
                        

                    }
                    break;

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2349:2: ( (lv_name_6_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2350:1: (lv_name_6_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2350:1: (lv_name_6_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2351:3: lv_name_6_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getNameNameParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyFolding4891);
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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_rulePropertyFolding4903); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2381:1: entryRuleQualifiedNameObject returns [EObject current=null] : iv_ruleQualifiedNameObject= ruleQualifiedNameObject EOF ;
    public final EObject entryRuleQualifiedNameObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedNameObject = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2382:2: (iv_ruleQualifiedNameObject= ruleQualifiedNameObject EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2383:2: iv_ruleQualifiedNameObject= ruleQualifiedNameObject EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameObjectRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameObject_in_entryRuleQualifiedNameObject4941);
            iv_ruleQualifiedNameObject=ruleQualifiedNameObject();

            state._fsp--;

             current =iv_ruleQualifiedNameObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameObject4951); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2390:1: ruleQualifiedNameObject returns [EObject current=null] : ( (lv_name_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleQualifiedNameObject() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2393:28: ( ( (lv_name_0_0= ruleQualifiedName ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2394:1: ( (lv_name_0_0= ruleQualifiedName ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2394:1: ( (lv_name_0_0= ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2395:1: (lv_name_0_0= ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2395:1: (lv_name_0_0= ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2396:3: lv_name_0_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getQualifiedNameObjectAccess().getNameQualifiedNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameObject4996);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2420:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2421:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2422:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5032);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName5043); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2429:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2432:28: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2433:1: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2433:1: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2434:5: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )*
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleName_in_ruleQualifiedName5090);
            this_Name_0=ruleName();

            state._fsp--;


            		current.merge(this_Name_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2444:1: (kw= '.' this_Name_2= ruleName )*
            loop46:
            do {
                int alt46=2;
                int LA46_0 = input.LA(1);

                if ( (LA46_0==32) ) {
                    alt46=1;
                }


                switch (alt46) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2445:2: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,32,FOLLOW_32_in_ruleQualifiedName5109); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleName_in_ruleQualifiedName5131);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2469:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2470:2: (iv_ruleName= ruleName EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2471:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName5179);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName5190); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2478:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NAME_TOKEN_0= RULE_NAME_TOKEN | kw= 'projective' | kw= 'joined' | kw= 'summarized' ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NAME_TOKEN_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2481:28: ( (this_NAME_TOKEN_0= RULE_NAME_TOKEN | kw= 'projective' | kw= 'joined' | kw= 'summarized' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2482:1: (this_NAME_TOKEN_0= RULE_NAME_TOKEN | kw= 'projective' | kw= 'joined' | kw= 'summarized' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2482:1: (this_NAME_TOKEN_0= RULE_NAME_TOKEN | kw= 'projective' | kw= 'joined' | kw= 'summarized' )
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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2482:6: this_NAME_TOKEN_0= RULE_NAME_TOKEN
                    {
                    this_NAME_TOKEN_0=(Token)match(input,RULE_NAME_TOKEN,FOLLOW_RULE_NAME_TOKEN_in_ruleName5230); 

                    		current.merge(this_NAME_TOKEN_0);
                        
                     
                        newLeafNode(this_NAME_TOKEN_0, grammarAccess.getNameAccess().getNAME_TOKENTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2491:2: kw= 'projective'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleName5254); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getProjectiveKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2498:2: kw= 'joined'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleName5273); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getJoinedKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2505:2: kw= 'summarized'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleName5292); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2518:1: entryRuleCollectionType returns [EObject current=null] : iv_ruleCollectionType= ruleCollectionType EOF ;
    public final EObject entryRuleCollectionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCollectionType = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2519:2: (iv_ruleCollectionType= ruleCollectionType EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2520:2: iv_ruleCollectionType= ruleCollectionType EOF
            {
             newCompositeNode(grammarAccess.getCollectionTypeRule()); 
            pushFollow(FOLLOW_ruleCollectionType_in_entryRuleCollectionType5332);
            iv_ruleCollectionType=ruleCollectionType();

            state._fsp--;

             current =iv_ruleCollectionType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCollectionType5342); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2527:1: ruleCollectionType returns [EObject current=null] : ( (otherlv_0= '{' ( (lv_elementType_1_0= ruleType ) ) otherlv_2= '}' ) | (otherlv_3= '{' ( (lv_map_4_0= ':' ) ) ( (lv_elementType_5_0= ruleType ) ) otherlv_6= '}' ) ) ;
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
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2530:28: ( ( (otherlv_0= '{' ( (lv_elementType_1_0= ruleType ) ) otherlv_2= '}' ) | (otherlv_3= '{' ( (lv_map_4_0= ':' ) ) ( (lv_elementType_5_0= ruleType ) ) otherlv_6= '}' ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2531:1: ( (otherlv_0= '{' ( (lv_elementType_1_0= ruleType ) ) otherlv_2= '}' ) | (otherlv_3= '{' ( (lv_map_4_0= ':' ) ) ( (lv_elementType_5_0= ruleType ) ) otherlv_6= '}' ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2531:1: ( (otherlv_0= '{' ( (lv_elementType_1_0= ruleType ) ) otherlv_2= '}' ) | (otherlv_3= '{' ( (lv_map_4_0= ':' ) ) ( (lv_elementType_5_0= ruleType ) ) otherlv_6= '}' ) )
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==22) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==24) ) {
                    alt48=2;
                }
                else if ( (LA48_1==22||(LA48_1>=33 && LA48_1<=43)) ) {
                    alt48=1;
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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2531:2: (otherlv_0= '{' ( (lv_elementType_1_0= ruleType ) ) otherlv_2= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2531:2: (otherlv_0= '{' ( (lv_elementType_1_0= ruleType ) ) otherlv_2= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2531:4: otherlv_0= '{' ( (lv_elementType_1_0= ruleType ) ) otherlv_2= '}'
                    {
                    otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleCollectionType5380); 

                        	newLeafNode(otherlv_0, grammarAccess.getCollectionTypeAccess().getLeftCurlyBracketKeyword_0_0());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2535:1: ( (lv_elementType_1_0= ruleType ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2536:1: (lv_elementType_1_0= ruleType )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2536:1: (lv_elementType_1_0= ruleType )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2537:3: lv_elementType_1_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCollectionTypeAccess().getElementTypeTypeParserRuleCall_0_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleCollectionType5401);
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

                    otherlv_2=(Token)match(input,23,FOLLOW_23_in_ruleCollectionType5413); 

                        	newLeafNode(otherlv_2, grammarAccess.getCollectionTypeAccess().getRightCurlyBracketKeyword_0_2());
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2558:6: (otherlv_3= '{' ( (lv_map_4_0= ':' ) ) ( (lv_elementType_5_0= ruleType ) ) otherlv_6= '}' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2558:6: (otherlv_3= '{' ( (lv_map_4_0= ':' ) ) ( (lv_elementType_5_0= ruleType ) ) otherlv_6= '}' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2558:8: otherlv_3= '{' ( (lv_map_4_0= ':' ) ) ( (lv_elementType_5_0= ruleType ) ) otherlv_6= '}'
                    {
                    otherlv_3=(Token)match(input,22,FOLLOW_22_in_ruleCollectionType5433); 

                        	newLeafNode(otherlv_3, grammarAccess.getCollectionTypeAccess().getLeftCurlyBracketKeyword_1_0());
                        
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2562:1: ( (lv_map_4_0= ':' ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2563:1: (lv_map_4_0= ':' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2563:1: (lv_map_4_0= ':' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2564:3: lv_map_4_0= ':'
                    {
                    lv_map_4_0=(Token)match(input,24,FOLLOW_24_in_ruleCollectionType5451); 

                            newLeafNode(lv_map_4_0, grammarAccess.getCollectionTypeAccess().getMapColonKeyword_1_1_0());
                        

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getCollectionTypeRule());
                    	        }
                           		setWithLastConsumed(current, "map", true, ":");
                    	    

                    }


                    }

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2577:2: ( (lv_elementType_5_0= ruleType ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2578:1: (lv_elementType_5_0= ruleType )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2578:1: (lv_elementType_5_0= ruleType )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2579:3: lv_elementType_5_0= ruleType
                    {
                     
                    	        newCompositeNode(grammarAccess.getCollectionTypeAccess().getElementTypeTypeParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleType_in_ruleCollectionType5485);
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

                    otherlv_6=(Token)match(input,23,FOLLOW_23_in_ruleCollectionType5497); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2607:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2608:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2609:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral5534);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral5544); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2616:1: ruleLiteral returns [EObject current=null] : ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_decimalValue_2_0= RULE_DECIMAL ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_0_0=null;
        Token lv_intValue_1_0=null;
        Token lv_decimalValue_2_0=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2619:28: ( ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_decimalValue_2_0= RULE_DECIMAL ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2620:1: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_decimalValue_2_0= RULE_DECIMAL ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2620:1: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_decimalValue_2_0= RULE_DECIMAL ) ) )
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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2620:2: ( (lv_stringValue_0_0= RULE_STRING ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2620:2: ( (lv_stringValue_0_0= RULE_STRING ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2621:1: (lv_stringValue_0_0= RULE_STRING )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2621:1: (lv_stringValue_0_0= RULE_STRING )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2622:3: lv_stringValue_0_0= RULE_STRING
                    {
                    lv_stringValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral5586); 

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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2639:6: ( (lv_intValue_1_0= RULE_INT ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2639:6: ( (lv_intValue_1_0= RULE_INT ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2640:1: (lv_intValue_1_0= RULE_INT )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2640:1: (lv_intValue_1_0= RULE_INT )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2641:3: lv_intValue_1_0= RULE_INT
                    {
                    lv_intValue_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteral5614); 

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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2658:6: ( (lv_decimalValue_2_0= RULE_DECIMAL ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2658:6: ( (lv_decimalValue_2_0= RULE_DECIMAL ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2659:1: (lv_decimalValue_2_0= RULE_DECIMAL )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2659:1: (lv_decimalValue_2_0= RULE_DECIMAL )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2660:3: lv_decimalValue_2_0= RULE_DECIMAL
                    {
                    lv_decimalValue_2_0=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleLiteral5642); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2684:1: ruleBasicType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) ) ;
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
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2686:28: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2687:1: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2687:1: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) )
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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2687:2: (enumLiteral_0= 'INT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2687:2: (enumLiteral_0= 'INT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2687:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleBasicType5697); 

                            current = grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getBasicTypeAccess().getINTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2693:6: (enumLiteral_1= 'LONG' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2693:6: (enumLiteral_1= 'LONG' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2693:8: enumLiteral_1= 'LONG'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_34_in_ruleBasicType5714); 

                            current = grammarAccess.getBasicTypeAccess().getLONGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getBasicTypeAccess().getLONGEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2699:6: (enumLiteral_2= 'BYTE' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2699:6: (enumLiteral_2= 'BYTE' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2699:8: enumLiteral_2= 'BYTE'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_35_in_ruleBasicType5731); 

                            current = grammarAccess.getBasicTypeAccess().getBYTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getBasicTypeAccess().getBYTEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2705:6: (enumLiteral_3= 'SHORT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2705:6: (enumLiteral_3= 'SHORT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2705:8: enumLiteral_3= 'SHORT'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_36_in_ruleBasicType5748); 

                            current = grammarAccess.getBasicTypeAccess().getSHORTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getBasicTypeAccess().getSHORTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2711:6: (enumLiteral_4= 'DECIMAL' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2711:6: (enumLiteral_4= 'DECIMAL' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2711:8: enumLiteral_4= 'DECIMAL'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_37_in_ruleBasicType5765); 

                            current = grammarAccess.getBasicTypeAccess().getDECIMALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getBasicTypeAccess().getDECIMALEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2717:6: (enumLiteral_5= 'FLOAT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2717:6: (enumLiteral_5= 'FLOAT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2717:8: enumLiteral_5= 'FLOAT'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_38_in_ruleBasicType5782); 

                            current = grammarAccess.getBasicTypeAccess().getFLOATEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getBasicTypeAccess().getFLOATEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2723:6: (enumLiteral_6= 'DOUBLE' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2723:6: (enumLiteral_6= 'DOUBLE' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2723:8: enumLiteral_6= 'DOUBLE'
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_39_in_ruleBasicType5799); 

                            current = grammarAccess.getBasicTypeAccess().getDOUBLEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getBasicTypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2729:6: (enumLiteral_7= 'TEXT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2729:6: (enumLiteral_7= 'TEXT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2729:8: enumLiteral_7= 'TEXT'
                    {
                    enumLiteral_7=(Token)match(input,40,FOLLOW_40_in_ruleBasicType5816); 

                            current = grammarAccess.getBasicTypeAccess().getTEXTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getBasicTypeAccess().getTEXTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2735:6: (enumLiteral_8= 'BOOLEAN' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2735:6: (enumLiteral_8= 'BOOLEAN' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2735:8: enumLiteral_8= 'BOOLEAN'
                    {
                    enumLiteral_8=(Token)match(input,41,FOLLOW_41_in_ruleBasicType5833); 

                            current = grammarAccess.getBasicTypeAccess().getBOOLEANEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getBasicTypeAccess().getBOOLEANEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2741:6: (enumLiteral_9= 'DATE' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2741:6: (enumLiteral_9= 'DATE' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2741:8: enumLiteral_9= 'DATE'
                    {
                    enumLiteral_9=(Token)match(input,42,FOLLOW_42_in_ruleBasicType5850); 

                            current = grammarAccess.getBasicTypeAccess().getDATEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getBasicTypeAccess().getDATEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2747:6: (enumLiteral_10= 'DATETIME' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2747:6: (enumLiteral_10= 'DATETIME' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2747:8: enumLiteral_10= 'DATETIME'
                    {
                    enumLiteral_10=(Token)match(input,43,FOLLOW_43_in_ruleBasicType5867); 

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
    public static final BitSet FOLLOW_ruleModelDefinition_in_ruleScript130 = new BitSet(new long[]{0x00000000040D0032L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_entryRuleModelDefinition166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelDefinition176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_ruleModelDefinition222 = new BitSet(new long[]{0x00000000040D0020L});
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
    public static final BitSet FOLLOW_22_in_ruleRecordTerm745 = new BitSet(new long[]{0x00000000048D0030L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleRecordTerm775 = new BitSet(new long[]{0x00000000048D0030L});
    public static final BitSet FOLLOW_23_in_ruleRecordTerm788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_ruleRecordTerm816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_entryRuleModelReference852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelReference862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleModelReference909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rulePropertyDefinition1000 = new BitSet(new long[]{0x00000000040D0020L});
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
    public static final BitSet FOLLOW_rulePropertyExpressionRefernce_in_rulePropertyExpression1337 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_rulePropertyExpressionRefernce_in_entryRulePropertyExpressionRefernce1936 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyExpressionRefernce1946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyExpressionRefernce1993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleType_in_entryRuleType2028 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleType2038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBasicType_in_ruleType2084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_ruleType2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinExpression_in_entryRuleJoinExpression2147 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinExpression2157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_ruleJoinExpression2203 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleJoinExpression2216 = new BitSet(new long[]{0x00000000004D0020L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_ruleJoinExpression2237 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_entryRuleJoinTerm2275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinTerm2285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_ruleJoinTerm2331 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleModelMapping_in_ruleJoinTerm2352 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_ruleJoinTerm2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeExpression_in_entryRuleSummarizeExpression2411 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeExpression2421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_ruleSummarizeExpression2467 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleSummarizeExpression2480 = new BitSet(new long[]{0x00000000004D0020L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_ruleSummarizeExpression2501 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_entryRuleSummarizeTerm2539 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeTerm2549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_ruleSummarizeTerm2595 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleModelFolding_in_ruleSummarizeTerm2616 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_ruleSummarizeTerm2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription2675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription2686 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDescription2725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_entryRuleAttributeList2769 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeList2779 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAttributeList2824 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute2860 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute2870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAttribute2907 = new BitSet(new long[]{0x00000000004D0020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttribute2928 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleAttributeElementBlock_in_ruleAttribute2949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElementBlock_in_entryRuleAttributeElementBlock2986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElementBlock2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleAttributeElementBlock3042 = new BitSet(new long[]{0x00000000100D0020L});
    public static final BitSet FOLLOW_ruleAttributeElementList_in_ruleAttributeElementBlock3064 = new BitSet(new long[]{0x0000000012000000L});
    public static final BitSet FOLLOW_25_in_ruleAttributeElementBlock3077 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAttributeElementBlock3093 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElementList_in_entryRuleAttributeElementList3129 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElementList3139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_ruleAttributeElementList3185 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleAttributeElementList3198 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_ruleAttributeElementList3219 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_entryRuleAttributeElement3257 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElement3267 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleAttributeElement3313 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAttributeElement3325 = new BitSet(new long[]{0x00000000004D00F0L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAttributeElement3346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue3382 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue3392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueArray_in_ruleAttributeValue3438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueMap_in_ruleAttributeValue3465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameObject_in_ruleAttributeValue3492 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttributeValue3519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueArray_in_entryRuleAttributeValueArray3555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValueArray3565 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAttributeValueArray3612 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAttributeValueArray3624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAttributeValueArray3644 = new BitSet(new long[]{0x00000000004D00F0L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAttributeValueArray3665 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_25_in_ruleAttributeValueArray3678 = new BitSet(new long[]{0x00000000004D00F0L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAttributeValueArray3699 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_25_in_ruleAttributeValueArray3714 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAttributeValueArray3728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueMap_in_entryRuleAttributeValueMap3765 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValueMap3775 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAttributeValueMap3822 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAttributeValueMap3834 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAttributeValueMap3846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAttributeValueMap3866 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleAttributePair_in_ruleAttributeValueMap3887 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_25_in_ruleAttributeValueMap3900 = new BitSet(new long[]{0x00000000000000D0L});
    public static final BitSet FOLLOW_ruleAttributePair_in_ruleAttributeValueMap3921 = new BitSet(new long[]{0x0000000002800000L});
    public static final BitSet FOLLOW_25_in_ruleAttributeValueMap3936 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAttributeValueMap3950 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributePair_in_entryRuleAttributePair3987 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributePair3997 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttributePair4043 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleAttributePair4055 = new BitSet(new long[]{0x00000000004D00F0L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAttributePair4076 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_entryRuleGrouping4112 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouping4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleGrouping4159 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_ruleGrouping4182 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_25_in_ruleGrouping4195 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_ruleGrouping4218 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleModelMapping_in_entryRuleModelMapping4256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelMapping4266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleModelMapping4303 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleModelMapping4315 = new BitSet(new long[]{0x00000000048D0030L});
    public static final BitSet FOLLOW_rulePropertyMapping_in_ruleModelMapping4345 = new BitSet(new long[]{0x00000000048D0030L});
    public static final BitSet FOLLOW_23_in_ruleModelMapping4358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyMapping_in_entryRulePropertyMapping4394 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyMapping4404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rulePropertyMapping4450 = new BitSet(new long[]{0x00000000040D0020L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rulePropertyMapping4472 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyMapping4496 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePropertyMapping4508 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyMapping4529 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePropertyMapping4541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelFolding_in_entryRuleModelFolding4577 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelFolding4587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleModelFolding4624 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleModelFolding4636 = new BitSet(new long[]{0x0000000004CD0030L});
    public static final BitSet FOLLOW_rulePropertyFolding_in_ruleModelFolding4666 = new BitSet(new long[]{0x0000000004CD0030L});
    public static final BitSet FOLLOW_23_in_ruleModelFolding4679 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFolding_in_entryRulePropertyFolding4715 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyFolding4725 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rulePropertyFolding4771 = new BitSet(new long[]{0x00000000044D0020L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rulePropertyFolding4793 = new BitSet(new long[]{0x00000000004D0020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyFolding4815 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyFolding4838 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_rulePropertyFolding4851 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_31_in_rulePropertyFolding4869 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyFolding4891 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePropertyFolding4903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameObject_in_entryRuleQualifiedNameObject4941 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameObject4951 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameObject4996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName5032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName5043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleQualifiedName5090 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleQualifiedName5109 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_ruleQualifiedName5131 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName5179 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName5190 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_TOKEN_in_ruleName5230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleName5254 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleName5273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleName5292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCollectionType_in_entryRuleCollectionType5332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCollectionType5342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCollectionType5380 = new BitSet(new long[]{0x00000FFE00400000L});
    public static final BitSet FOLLOW_ruleType_in_ruleCollectionType5401 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCollectionType5413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleCollectionType5433 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCollectionType5451 = new BitSet(new long[]{0x00000FFE00400000L});
    public static final BitSet FOLLOW_ruleType_in_ruleCollectionType5485 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleCollectionType5497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral5534 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral5544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral5586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteral5614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleLiteral5642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleBasicType5697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleBasicType5714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleBasicType5731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleBasicType5748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleBasicType5765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleBasicType5782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleBasicType5799 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleBasicType5816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleBasicType5833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleBasicType5850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleBasicType5867 = new BitSet(new long[]{0x0000000000000002L});

}