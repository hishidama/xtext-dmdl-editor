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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_NAME_TOKEN", "RULE_INT", "RULE_DECIMAL", "RULE_DIGIT_CHAR", "RULE_SYMBOL_CHAR", "RULE_BLANK_CHAR", "RULE_HEX_CHAR", "RULE_OCTAL_ESCAPE", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'projective'", "'='", "'joined'", "'summarized'", "';'", "'+'", "'{'", "'}'", "':'", "'@'", "'('", "','", "')'", "'%'", "'->'", "'=>'", "'.'", "'INT'", "'LONG'", "'BYTE'", "'SHORT'", "'DECIMAL'", "'FLOAT'", "'DOUBLE'", "'TEXT'", "'BOOLEAN'", "'DATE'", "'DATETIME'"
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

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_NAME_TOKEN)||LA1_0==16||(LA1_0>=18 && LA1_0<=19)||LA1_0==25) ) {
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

            if ( (LA3_0==25) ) {
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

                if ( (LA5_3==17) ) {
                    alt5=1;
                }
                else if ( (LA5_3==RULE_NAME_TOKEN||LA5_3==16||(LA5_3>=18 && LA5_3<=19)) ) {
                    alt5=3;
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

                        if ( ((LA7_0>=RULE_STRING && LA7_0<=RULE_NAME_TOKEN)||LA7_0==16||(LA7_0>=18 && LA7_0<=19)||LA7_0==25) ) {
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:513:1: rulePropertyDefinition returns [EObject current=null] : ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' ) ;
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
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:516:28: ( ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:517:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:517:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:517:2: ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_name_2_0= ruleName ) ) otherlv_3= ':' ( (lv_type_4_0= ruleType ) ) otherlv_5= ';'
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

            if ( (LA10_0==25) ) {
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:553:3: ( (lv_name_2_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:554:1: (lv_name_2_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:554:1: (lv_name_2_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:555:3: lv_name_2_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNameNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyDefinition1044);
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_rulePropertyDefinition1056); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyDefinitionAccess().getColonKeyword_3());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:575:1: ( (lv_type_4_0= ruleType ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:576:1: (lv_type_4_0= ruleType )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:576:1: (lv_type_4_0= ruleType )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:577:3: lv_type_4_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypeTypeEnumRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_rulePropertyDefinition1077);
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

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_rulePropertyDefinition1089); 

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


    // $ANTLR start "entryRuleJoinExpression"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:605:1: entryRuleJoinExpression returns [EObject current=null] : iv_ruleJoinExpression= ruleJoinExpression EOF ;
    public final EObject entryRuleJoinExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinExpression = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:606:2: (iv_ruleJoinExpression= ruleJoinExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:607:2: iv_ruleJoinExpression= ruleJoinExpression EOF
            {
             newCompositeNode(grammarAccess.getJoinExpressionRule()); 
            pushFollow(FOLLOW_ruleJoinExpression_in_entryRuleJoinExpression1125);
            iv_ruleJoinExpression=ruleJoinExpression();

            state._fsp--;

             current =iv_ruleJoinExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinExpression1135); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:614:1: ruleJoinExpression returns [EObject current=null] : ( ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )* ) ;
    public final EObject ruleJoinExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_terms_0_0 = null;

        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:617:28: ( ( ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:618:1: ( ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:618:1: ( ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:618:2: ( (lv_terms_0_0= ruleJoinTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:618:2: ( (lv_terms_0_0= ruleJoinTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:619:1: (lv_terms_0_0= ruleJoinTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:619:1: (lv_terms_0_0= ruleJoinTerm )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:620:3: lv_terms_0_0= ruleJoinTerm
            {
             
            	        newCompositeNode(grammarAccess.getJoinExpressionAccess().getTermsJoinTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleJoinTerm_in_ruleJoinExpression1181);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:636:2: (otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) ) )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==21) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:636:4: otherlv_1= '+' ( (lv_terms_2_0= ruleJoinTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleJoinExpression1194); 

            	        	newLeafNode(otherlv_1, grammarAccess.getJoinExpressionAccess().getPlusSignKeyword_1_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:640:1: ( (lv_terms_2_0= ruleJoinTerm ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:641:1: (lv_terms_2_0= ruleJoinTerm )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:641:1: (lv_terms_2_0= ruleJoinTerm )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:642:3: lv_terms_2_0= ruleJoinTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getJoinExpressionAccess().getTermsJoinTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleJoinTerm_in_ruleJoinExpression1215);
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
            	    break loop11;
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:666:1: entryRuleJoinTerm returns [EObject current=null] : iv_ruleJoinTerm= ruleJoinTerm EOF ;
    public final EObject entryRuleJoinTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleJoinTerm = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:667:2: (iv_ruleJoinTerm= ruleJoinTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:668:2: iv_ruleJoinTerm= ruleJoinTerm EOF
            {
             newCompositeNode(grammarAccess.getJoinTermRule()); 
            pushFollow(FOLLOW_ruleJoinTerm_in_entryRuleJoinTerm1253);
            iv_ruleJoinTerm=ruleJoinTerm();

            state._fsp--;

             current =iv_ruleJoinTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleJoinTerm1263); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:675:1: ruleJoinTerm returns [EObject current=null] : ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )? ) ;
    public final EObject ruleJoinTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_reference_0_0 = null;

        EObject lv_mapping_1_0 = null;

        EObject lv_grouping_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:678:28: ( ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )? ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:679:1: ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:679:1: ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )? )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:679:2: ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_mapping_1_0= ruleModelMapping ) )? ( (lv_grouping_2_0= ruleGrouping ) )?
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:679:2: ( (lv_reference_0_0= ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:680:1: (lv_reference_0_0= ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:680:1: (lv_reference_0_0= ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:681:3: lv_reference_0_0= ruleModelReference
            {
             
            	        newCompositeNode(grammarAccess.getJoinTermAccess().getReferenceModelReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModelReference_in_ruleJoinTerm1309);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:697:2: ( (lv_mapping_1_0= ruleModelMapping ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==30) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:698:1: (lv_mapping_1_0= ruleModelMapping )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:698:1: (lv_mapping_1_0= ruleModelMapping )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:699:3: lv_mapping_1_0= ruleModelMapping
                    {
                     
                    	        newCompositeNode(grammarAccess.getJoinTermAccess().getMappingModelMappingParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleModelMapping_in_ruleJoinTerm1330);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:715:3: ( (lv_grouping_2_0= ruleGrouping ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==29) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:716:1: (lv_grouping_2_0= ruleGrouping )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:716:1: (lv_grouping_2_0= ruleGrouping )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:717:3: lv_grouping_2_0= ruleGrouping
                    {
                     
                    	        newCompositeNode(grammarAccess.getJoinTermAccess().getGroupingGroupingParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGrouping_in_ruleJoinTerm1352);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:741:1: entryRuleSummarizeExpression returns [EObject current=null] : iv_ruleSummarizeExpression= ruleSummarizeExpression EOF ;
    public final EObject entryRuleSummarizeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSummarizeExpression = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:742:2: (iv_ruleSummarizeExpression= ruleSummarizeExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:743:2: iv_ruleSummarizeExpression= ruleSummarizeExpression EOF
            {
             newCompositeNode(grammarAccess.getSummarizeExpressionRule()); 
            pushFollow(FOLLOW_ruleSummarizeExpression_in_entryRuleSummarizeExpression1389);
            iv_ruleSummarizeExpression=ruleSummarizeExpression();

            state._fsp--;

             current =iv_ruleSummarizeExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeExpression1399); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:750:1: ruleSummarizeExpression returns [EObject current=null] : ( ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )* ) ;
    public final EObject ruleSummarizeExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_terms_0_0 = null;

        EObject lv_terms_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:753:28: ( ( ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:754:1: ( ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:754:1: ( ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:754:2: ( (lv_terms_0_0= ruleSummarizeTerm ) ) (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:754:2: ( (lv_terms_0_0= ruleSummarizeTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:755:1: (lv_terms_0_0= ruleSummarizeTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:755:1: (lv_terms_0_0= ruleSummarizeTerm )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:756:3: lv_terms_0_0= ruleSummarizeTerm
            {
             
            	        newCompositeNode(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleSummarizeTerm_in_ruleSummarizeExpression1445);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:772:2: (otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==21) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:772:4: otherlv_1= '+' ( (lv_terms_2_0= ruleSummarizeTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleSummarizeExpression1458); 

            	        	newLeafNode(otherlv_1, grammarAccess.getSummarizeExpressionAccess().getPlusSignKeyword_1_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:776:1: ( (lv_terms_2_0= ruleSummarizeTerm ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:777:1: (lv_terms_2_0= ruleSummarizeTerm )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:777:1: (lv_terms_2_0= ruleSummarizeTerm )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:778:3: lv_terms_2_0= ruleSummarizeTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSummarizeExpressionAccess().getTermsSummarizeTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleSummarizeTerm_in_ruleSummarizeExpression1479);
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
            	    break loop14;
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:802:1: entryRuleSummarizeTerm returns [EObject current=null] : iv_ruleSummarizeTerm= ruleSummarizeTerm EOF ;
    public final EObject entryRuleSummarizeTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSummarizeTerm = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:803:2: (iv_ruleSummarizeTerm= ruleSummarizeTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:804:2: iv_ruleSummarizeTerm= ruleSummarizeTerm EOF
            {
             newCompositeNode(grammarAccess.getSummarizeTermRule()); 
            pushFollow(FOLLOW_ruleSummarizeTerm_in_entryRuleSummarizeTerm1517);
            iv_ruleSummarizeTerm=ruleSummarizeTerm();

            state._fsp--;

             current =iv_ruleSummarizeTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSummarizeTerm1527); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:811:1: ruleSummarizeTerm returns [EObject current=null] : ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )? ) ;
    public final EObject ruleSummarizeTerm() throws RecognitionException {
        EObject current = null;

        EObject lv_reference_0_0 = null;

        EObject lv_folding_1_0 = null;

        EObject lv_grouping_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:814:28: ( ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )? ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:815:1: ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:815:1: ( ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )? )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:815:2: ( (lv_reference_0_0= ruleModelReference ) ) ( (lv_folding_1_0= ruleModelFolding ) ) ( (lv_grouping_2_0= ruleGrouping ) )?
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:815:2: ( (lv_reference_0_0= ruleModelReference ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:816:1: (lv_reference_0_0= ruleModelReference )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:816:1: (lv_reference_0_0= ruleModelReference )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:817:3: lv_reference_0_0= ruleModelReference
            {
             
            	        newCompositeNode(grammarAccess.getSummarizeTermAccess().getReferenceModelReferenceParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleModelReference_in_ruleSummarizeTerm1573);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:833:2: ( (lv_folding_1_0= ruleModelFolding ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:834:1: (lv_folding_1_0= ruleModelFolding )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:834:1: (lv_folding_1_0= ruleModelFolding )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:835:3: lv_folding_1_0= ruleModelFolding
            {
             
            	        newCompositeNode(grammarAccess.getSummarizeTermAccess().getFoldingModelFoldingParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleModelFolding_in_ruleSummarizeTerm1594);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:851:2: ( (lv_grouping_2_0= ruleGrouping ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:852:1: (lv_grouping_2_0= ruleGrouping )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:852:1: (lv_grouping_2_0= ruleGrouping )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:853:3: lv_grouping_2_0= ruleGrouping
                    {
                     
                    	        newCompositeNode(grammarAccess.getSummarizeTermAccess().getGroupingGroupingParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleGrouping_in_ruleSummarizeTerm1615);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:877:1: entryRuleDescription returns [String current=null] : iv_ruleDescription= ruleDescription EOF ;
    public final String entryRuleDescription() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDescription = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:878:2: (iv_ruleDescription= ruleDescription EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:879:2: iv_ruleDescription= ruleDescription EOF
            {
             newCompositeNode(grammarAccess.getDescriptionRule()); 
            pushFollow(FOLLOW_ruleDescription_in_entryRuleDescription1653);
            iv_ruleDescription=ruleDescription();

            state._fsp--;

             current =iv_ruleDescription.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescription1664); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:886:1: ruleDescription returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleDescription() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:889:28: (this_STRING_0= RULE_STRING )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:890:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDescription1703); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:905:1: entryRuleAttributeList returns [EObject current=null] : iv_ruleAttributeList= ruleAttributeList EOF ;
    public final EObject entryRuleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeList = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:906:2: (iv_ruleAttributeList= ruleAttributeList EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:907:2: iv_ruleAttributeList= ruleAttributeList EOF
            {
             newCompositeNode(grammarAccess.getAttributeListRule()); 
            pushFollow(FOLLOW_ruleAttributeList_in_entryRuleAttributeList1747);
            iv_ruleAttributeList=ruleAttributeList();

            state._fsp--;

             current =iv_ruleAttributeList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeList1757); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:914:1: ruleAttributeList returns [EObject current=null] : ( (lv_attributes_0_0= ruleAttribute ) )+ ;
    public final EObject ruleAttributeList() throws RecognitionException {
        EObject current = null;

        EObject lv_attributes_0_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:917:28: ( ( (lv_attributes_0_0= ruleAttribute ) )+ )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:918:1: ( (lv_attributes_0_0= ruleAttribute ) )+
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:918:1: ( (lv_attributes_0_0= ruleAttribute ) )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==25) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:919:1: (lv_attributes_0_0= ruleAttribute )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:919:1: (lv_attributes_0_0= ruleAttribute )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:920:3: lv_attributes_0_0= ruleAttribute
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeListAccess().getAttributesAttributeParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttribute_in_ruleAttributeList1802);
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
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:944:1: entryRuleAttribute returns [EObject current=null] : iv_ruleAttribute= ruleAttribute EOF ;
    public final EObject entryRuleAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttribute = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:945:2: (iv_ruleAttribute= ruleAttribute EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:946:2: iv_ruleAttribute= ruleAttribute EOF
            {
             newCompositeNode(grammarAccess.getAttributeRule()); 
            pushFollow(FOLLOW_ruleAttribute_in_entryRuleAttribute1838);
            iv_ruleAttribute=ruleAttribute();

            state._fsp--;

             current =iv_ruleAttribute; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttribute1848); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:953:1: ruleAttribute returns [EObject current=null] : (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )? ) ;
    public final EObject ruleAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_elementBlock_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:956:28: ( (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )? ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:957:1: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )? )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:957:1: (otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )? )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:957:3: otherlv_0= '@' ( (lv_name_1_0= ruleQualifiedName ) ) ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )?
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleAttribute1885); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeAccess().getCommercialAtKeyword_0());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:961:1: ( (lv_name_1_0= ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:962:1: (lv_name_1_0= ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:962:1: (lv_name_1_0= ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:963:3: lv_name_1_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getAttributeAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleAttribute1906);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:979:2: ( (lv_elementBlock_2_0= ruleAttributeElementBlock ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==26) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:980:1: (lv_elementBlock_2_0= ruleAttributeElementBlock )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:980:1: (lv_elementBlock_2_0= ruleAttributeElementBlock )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:981:3: lv_elementBlock_2_0= ruleAttributeElementBlock
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeAccess().getElementBlockAttributeElementBlockParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeElementBlock_in_ruleAttribute1927);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1005:1: entryRuleAttributeElementBlock returns [EObject current=null] : iv_ruleAttributeElementBlock= ruleAttributeElementBlock EOF ;
    public final EObject entryRuleAttributeElementBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeElementBlock = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1006:2: (iv_ruleAttributeElementBlock= ruleAttributeElementBlock EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1007:2: iv_ruleAttributeElementBlock= ruleAttributeElementBlock EOF
            {
             newCompositeNode(grammarAccess.getAttributeElementBlockRule()); 
            pushFollow(FOLLOW_ruleAttributeElementBlock_in_entryRuleAttributeElementBlock1964);
            iv_ruleAttributeElementBlock=ruleAttributeElementBlock();

            state._fsp--;

             current =iv_ruleAttributeElementBlock; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElementBlock1974); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1014:1: ruleAttributeElementBlock returns [EObject current=null] : ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )? otherlv_4= ')' ) ;
    public final EObject ruleAttributeElementBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1017:28: ( ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )? otherlv_4= ')' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1018:1: ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )? otherlv_4= ')' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1018:1: ( () otherlv_1= '(' ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )? otherlv_4= ')' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1018:2: () otherlv_1= '(' ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )? otherlv_4= ')'
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1018:2: ()
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1019:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAttributeElementBlockAccess().getAttributeElementBlockAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleAttributeElementBlock2020); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeElementBlockAccess().getLeftParenthesisKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1028:1: ( ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )? )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_NAME_TOKEN||LA19_0==16||(LA19_0>=18 && LA19_0<=19)) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1028:2: ( (lv_elements_2_0= ruleAttributeElementList ) ) (otherlv_3= ',' )?
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1028:2: ( (lv_elements_2_0= ruleAttributeElementList ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1029:1: (lv_elements_2_0= ruleAttributeElementList )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1029:1: (lv_elements_2_0= ruleAttributeElementList )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1030:3: lv_elements_2_0= ruleAttributeElementList
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeElementBlockAccess().getElementsAttributeElementListParserRuleCall_2_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeElementList_in_ruleAttributeElementBlock2042);
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

                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1046:2: (otherlv_3= ',' )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==27) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1046:4: otherlv_3= ','
                            {
                            otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleAttributeElementBlock2055); 

                                	newLeafNode(otherlv_3, grammarAccess.getAttributeElementBlockAccess().getCommaKeyword_2_1());
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,28,FOLLOW_28_in_ruleAttributeElementBlock2071); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1062:1: entryRuleAttributeElementList returns [EObject current=null] : iv_ruleAttributeElementList= ruleAttributeElementList EOF ;
    public final EObject entryRuleAttributeElementList() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeElementList = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1063:2: (iv_ruleAttributeElementList= ruleAttributeElementList EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1064:2: iv_ruleAttributeElementList= ruleAttributeElementList EOF
            {
             newCompositeNode(grammarAccess.getAttributeElementListRule()); 
            pushFollow(FOLLOW_ruleAttributeElementList_in_entryRuleAttributeElementList2107);
            iv_ruleAttributeElementList=ruleAttributeElementList();

            state._fsp--;

             current =iv_ruleAttributeElementList; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElementList2117); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1071:1: ruleAttributeElementList returns [EObject current=null] : ( ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )* ) ;
    public final EObject ruleAttributeElementList() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_elements_0_0 = null;

        EObject lv_elements_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1074:28: ( ( ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1075:1: ( ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1075:1: ( ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1075:2: ( (lv_elements_0_0= ruleAttributeElement ) ) (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1075:2: ( (lv_elements_0_0= ruleAttributeElement ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1076:1: (lv_elements_0_0= ruleAttributeElement )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1076:1: (lv_elements_0_0= ruleAttributeElement )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1077:3: lv_elements_0_0= ruleAttributeElement
            {
             
            	        newCompositeNode(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeElement_in_ruleAttributeElementList2163);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1093:2: (otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==27) ) {
                    int LA20_1 = input.LA(2);

                    if ( (LA20_1==RULE_NAME_TOKEN||LA20_1==16||(LA20_1>=18 && LA20_1<=19)) ) {
                        alt20=1;
                    }


                }


                switch (alt20) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1093:4: otherlv_1= ',' ( (lv_elements_2_0= ruleAttributeElement ) )
            	    {
            	    otherlv_1=(Token)match(input,27,FOLLOW_27_in_ruleAttributeElementList2176); 

            	        	newLeafNode(otherlv_1, grammarAccess.getAttributeElementListAccess().getCommaKeyword_1_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1097:1: ( (lv_elements_2_0= ruleAttributeElement ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1098:1: (lv_elements_2_0= ruleAttributeElement )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1098:1: (lv_elements_2_0= ruleAttributeElement )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1099:3: lv_elements_2_0= ruleAttributeElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeElementListAccess().getElementsAttributeElementParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttributeElement_in_ruleAttributeElementList2197);
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
            	    break loop20;
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1123:1: entryRuleAttributeElement returns [EObject current=null] : iv_ruleAttributeElement= ruleAttributeElement EOF ;
    public final EObject entryRuleAttributeElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeElement = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1124:2: (iv_ruleAttributeElement= ruleAttributeElement EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1125:2: iv_ruleAttributeElement= ruleAttributeElement EOF
            {
             newCompositeNode(grammarAccess.getAttributeElementRule()); 
            pushFollow(FOLLOW_ruleAttributeElement_in_entryRuleAttributeElement2235);
            iv_ruleAttributeElement=ruleAttributeElement();

            state._fsp--;

             current =iv_ruleAttributeElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeElement2245); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1132:1: ruleAttributeElement returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) ) ;
    public final EObject ruleAttributeElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1135:28: ( ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1136:1: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1136:1: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1136:2: ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_value_2_0= ruleAttributeValue ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1136:2: ( (lv_name_0_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1137:1: (lv_name_0_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1137:1: (lv_name_0_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1138:3: lv_name_0_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getAttributeElementAccess().getNameNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleAttributeElement2291);
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

            otherlv_1=(Token)match(input,17,FOLLOW_17_in_ruleAttributeElement2303); 

                	newLeafNode(otherlv_1, grammarAccess.getAttributeElementAccess().getEqualsSignKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1158:1: ( (lv_value_2_0= ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1159:1: (lv_value_2_0= ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1159:1: (lv_value_2_0= ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1160:3: lv_value_2_0= ruleAttributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAttributeElementAccess().getValueAttributeValueParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeValue_in_ruleAttributeElement2324);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1184:1: entryRuleAttributeValue returns [EObject current=null] : iv_ruleAttributeValue= ruleAttributeValue EOF ;
    public final EObject entryRuleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValue = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1185:2: (iv_ruleAttributeValue= ruleAttributeValue EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1186:2: iv_ruleAttributeValue= ruleAttributeValue EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueRule()); 
            pushFollow(FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue2360);
            iv_ruleAttributeValue=ruleAttributeValue();

            state._fsp--;

             current =iv_ruleAttributeValue; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValue2370); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1193:1: ruleAttributeValue returns [EObject current=null] : ( ( (lv_value_0_0= ruleAttributeValueArray ) ) | ( (lv_value_1_0= ruleQualifiedNameObject ) ) | ( (lv_value_2_0= ruleLiteral ) ) ) ;
    public final EObject ruleAttributeValue() throws RecognitionException {
        EObject current = null;

        EObject lv_value_0_0 = null;

        EObject lv_value_1_0 = null;

        EObject lv_value_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1196:28: ( ( ( (lv_value_0_0= ruleAttributeValueArray ) ) | ( (lv_value_1_0= ruleQualifiedNameObject ) ) | ( (lv_value_2_0= ruleLiteral ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1197:1: ( ( (lv_value_0_0= ruleAttributeValueArray ) ) | ( (lv_value_1_0= ruleQualifiedNameObject ) ) | ( (lv_value_2_0= ruleLiteral ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1197:1: ( ( (lv_value_0_0= ruleAttributeValueArray ) ) | ( (lv_value_1_0= ruleQualifiedNameObject ) ) | ( (lv_value_2_0= ruleLiteral ) ) )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt21=1;
                }
                break;
            case RULE_NAME_TOKEN:
            case 16:
            case 18:
            case 19:
                {
                alt21=2;
                }
                break;
            case RULE_STRING:
            case RULE_INT:
            case RULE_DECIMAL:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1197:2: ( (lv_value_0_0= ruleAttributeValueArray ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1197:2: ( (lv_value_0_0= ruleAttributeValueArray ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1198:1: (lv_value_0_0= ruleAttributeValueArray )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1198:1: (lv_value_0_0= ruleAttributeValueArray )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1199:3: lv_value_0_0= ruleAttributeValueArray
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueAccess().getValueAttributeValueArrayParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeValueArray_in_ruleAttributeValue2416);
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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1216:6: ( (lv_value_1_0= ruleQualifiedNameObject ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1216:6: ( (lv_value_1_0= ruleQualifiedNameObject ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1217:1: (lv_value_1_0= ruleQualifiedNameObject )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1217:1: (lv_value_1_0= ruleQualifiedNameObject )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1218:3: lv_value_1_0= ruleQualifiedNameObject
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueAccess().getValueQualifiedNameObjectParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQualifiedNameObject_in_ruleAttributeValue2443);
                    lv_value_1_0=ruleQualifiedNameObject();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getAttributeValueRule());
                    	        }
                           		set(
                           			current, 
                           			"value",
                            		lv_value_1_0, 
                            		"QualifiedNameObject");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1235:6: ( (lv_value_2_0= ruleLiteral ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1235:6: ( (lv_value_2_0= ruleLiteral ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1236:1: (lv_value_2_0= ruleLiteral )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1236:1: (lv_value_2_0= ruleLiteral )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1237:3: lv_value_2_0= ruleLiteral
                    {
                     
                    	        newCompositeNode(grammarAccess.getAttributeValueAccess().getValueLiteralParserRuleCall_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleLiteral_in_ruleAttributeValue2470);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1261:1: entryRuleAttributeValueArray returns [EObject current=null] : iv_ruleAttributeValueArray= ruleAttributeValueArray EOF ;
    public final EObject entryRuleAttributeValueArray() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAttributeValueArray = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1262:2: (iv_ruleAttributeValueArray= ruleAttributeValueArray EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1263:2: iv_ruleAttributeValueArray= ruleAttributeValueArray EOF
            {
             newCompositeNode(grammarAccess.getAttributeValueArrayRule()); 
            pushFollow(FOLLOW_ruleAttributeValueArray_in_entryRuleAttributeValueArray2506);
            iv_ruleAttributeValueArray=ruleAttributeValueArray();

            state._fsp--;

             current =iv_ruleAttributeValueArray; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAttributeValueArray2516); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1270:1: ruleAttributeValueArray returns [EObject current=null] : (otherlv_0= '{' ( (lv_elements_1_0= ruleAttributeValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleAttributeValue ) ) )* (otherlv_4= ',' )? otherlv_5= '}' ) ;
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
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1273:28: ( (otherlv_0= '{' ( (lv_elements_1_0= ruleAttributeValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleAttributeValue ) ) )* (otherlv_4= ',' )? otherlv_5= '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1274:1: (otherlv_0= '{' ( (lv_elements_1_0= ruleAttributeValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleAttributeValue ) ) )* (otherlv_4= ',' )? otherlv_5= '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1274:1: (otherlv_0= '{' ( (lv_elements_1_0= ruleAttributeValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleAttributeValue ) ) )* (otherlv_4= ',' )? otherlv_5= '}' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1274:3: otherlv_0= '{' ( (lv_elements_1_0= ruleAttributeValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleAttributeValue ) ) )* (otherlv_4= ',' )? otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,22,FOLLOW_22_in_ruleAttributeValueArray2553); 

                	newLeafNode(otherlv_0, grammarAccess.getAttributeValueArrayAccess().getLeftCurlyBracketKeyword_0());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1278:1: ( (lv_elements_1_0= ruleAttributeValue ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1279:1: (lv_elements_1_0= ruleAttributeValue )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1279:1: (lv_elements_1_0= ruleAttributeValue )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1280:3: lv_elements_1_0= ruleAttributeValue
            {
             
            	        newCompositeNode(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleAttributeValue_in_ruleAttributeValueArray2574);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1296:2: (otherlv_2= ',' ( (lv_elements_3_0= ruleAttributeValue ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==27) ) {
                    int LA22_1 = input.LA(2);

                    if ( ((LA22_1>=RULE_STRING && LA22_1<=RULE_DECIMAL)||LA22_1==16||(LA22_1>=18 && LA22_1<=19)||LA22_1==22) ) {
                        alt22=1;
                    }


                }


                switch (alt22) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1296:4: otherlv_2= ',' ( (lv_elements_3_0= ruleAttributeValue ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleAttributeValueArray2587); 

            	        	newLeafNode(otherlv_2, grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_2_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1300:1: ( (lv_elements_3_0= ruleAttributeValue ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1301:1: (lv_elements_3_0= ruleAttributeValue )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1301:1: (lv_elements_3_0= ruleAttributeValue )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1302:3: lv_elements_3_0= ruleAttributeValue
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAttributeValueArrayAccess().getElementsAttributeValueParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleAttributeValue_in_ruleAttributeValueArray2608);
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
            	    break loop22;
                }
            } while (true);

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1318:4: (otherlv_4= ',' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==27) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1318:6: otherlv_4= ','
                    {
                    otherlv_4=(Token)match(input,27,FOLLOW_27_in_ruleAttributeValueArray2623); 

                        	newLeafNode(otherlv_4, grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_3());
                        

                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FOLLOW_23_in_ruleAttributeValueArray2637); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1334:1: entryRuleGrouping returns [EObject current=null] : iv_ruleGrouping= ruleGrouping EOF ;
    public final EObject entryRuleGrouping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGrouping = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1335:2: (iv_ruleGrouping= ruleGrouping EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1336:2: iv_ruleGrouping= ruleGrouping EOF
            {
             newCompositeNode(grammarAccess.getGroupingRule()); 
            pushFollow(FOLLOW_ruleGrouping_in_entryRuleGrouping2673);
            iv_ruleGrouping=ruleGrouping();

            state._fsp--;

             current =iv_ruleGrouping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGrouping2683); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1343:1: ruleGrouping returns [EObject current=null] : (otherlv_0= '%' ( ( ruleName ) ) (otherlv_2= ',' ( ( ruleName ) ) )* ) ;
    public final EObject ruleGrouping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1346:28: ( (otherlv_0= '%' ( ( ruleName ) ) (otherlv_2= ',' ( ( ruleName ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1347:1: (otherlv_0= '%' ( ( ruleName ) ) (otherlv_2= ',' ( ( ruleName ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1347:1: (otherlv_0= '%' ( ( ruleName ) ) (otherlv_2= ',' ( ( ruleName ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1347:3: otherlv_0= '%' ( ( ruleName ) ) (otherlv_2= ',' ( ( ruleName ) ) )*
            {
            otherlv_0=(Token)match(input,29,FOLLOW_29_in_ruleGrouping2720); 

                	newLeafNode(otherlv_0, grammarAccess.getGroupingAccess().getPercentSignKeyword_0());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1351:1: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1352:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1352:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1353:3: ruleName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getGroupingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getGroupingAccess().getNamePropertyCrossReference_1_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleGrouping2743);
            ruleName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1366:2: (otherlv_2= ',' ( ( ruleName ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==27) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1366:4: otherlv_2= ',' ( ( ruleName ) )
            	    {
            	    otherlv_2=(Token)match(input,27,FOLLOW_27_in_ruleGrouping2756); 

            	        	newLeafNode(otherlv_2, grammarAccess.getGroupingAccess().getCommaKeyword_2_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1370:1: ( ( ruleName ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1371:1: ( ruleName )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1371:1: ( ruleName )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1372:3: ruleName
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGroupingRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGroupingAccess().getNamePropertyCrossReference_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleName_in_ruleGrouping2779);
            	    ruleName();

            	    state._fsp--;

            	     
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
    // $ANTLR end "ruleGrouping"


    // $ANTLR start "entryRuleModelMapping"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1393:1: entryRuleModelMapping returns [EObject current=null] : iv_ruleModelMapping= ruleModelMapping EOF ;
    public final EObject entryRuleModelMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelMapping = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1394:2: (iv_ruleModelMapping= ruleModelMapping EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1395:2: iv_ruleModelMapping= ruleModelMapping EOF
            {
             newCompositeNode(grammarAccess.getModelMappingRule()); 
            pushFollow(FOLLOW_ruleModelMapping_in_entryRuleModelMapping2817);
            iv_ruleModelMapping=ruleModelMapping();

            state._fsp--;

             current =iv_ruleModelMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelMapping2827); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1402:1: ruleModelMapping returns [EObject current=null] : (otherlv_0= '->' otherlv_1= '{' () ( (lv_mappings_3_0= rulePropertyMapping ) )* otherlv_4= '}' ) ;
    public final EObject ruleModelMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_mappings_3_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1405:28: ( (otherlv_0= '->' otherlv_1= '{' () ( (lv_mappings_3_0= rulePropertyMapping ) )* otherlv_4= '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1406:1: (otherlv_0= '->' otherlv_1= '{' () ( (lv_mappings_3_0= rulePropertyMapping ) )* otherlv_4= '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1406:1: (otherlv_0= '->' otherlv_1= '{' () ( (lv_mappings_3_0= rulePropertyMapping ) )* otherlv_4= '}' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1406:3: otherlv_0= '->' otherlv_1= '{' () ( (lv_mappings_3_0= rulePropertyMapping ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_30_in_ruleModelMapping2864); 

                	newLeafNode(otherlv_0, grammarAccess.getModelMappingAccess().getHyphenMinusGreaterThanSignKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleModelMapping2876); 

                	newLeafNode(otherlv_1, grammarAccess.getModelMappingAccess().getLeftCurlyBracketKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1414:1: ()
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1415:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelMappingAccess().getModelMappingAction_2(),
                        current);
                

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1420:2: ( (lv_mappings_3_0= rulePropertyMapping ) )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( ((LA25_0>=RULE_STRING && LA25_0<=RULE_NAME_TOKEN)||LA25_0==16||(LA25_0>=18 && LA25_0<=19)||LA25_0==25) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1421:1: (lv_mappings_3_0= rulePropertyMapping )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1421:1: (lv_mappings_3_0= rulePropertyMapping )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1422:3: lv_mappings_3_0= rulePropertyMapping
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelMappingAccess().getMappingsPropertyMappingParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertyMapping_in_ruleModelMapping2906);
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
            	    break loop25;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleModelMapping2919); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1450:1: entryRulePropertyMapping returns [EObject current=null] : iv_rulePropertyMapping= rulePropertyMapping EOF ;
    public final EObject entryRulePropertyMapping() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyMapping = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1451:2: (iv_rulePropertyMapping= rulePropertyMapping EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1452:2: iv_rulePropertyMapping= rulePropertyMapping EOF
            {
             newCompositeNode(grammarAccess.getPropertyMappingRule()); 
            pushFollow(FOLLOW_rulePropertyMapping_in_entryRulePropertyMapping2955);
            iv_rulePropertyMapping=rulePropertyMapping();

            state._fsp--;

             current =iv_rulePropertyMapping; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyMapping2965); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1459:1: rulePropertyMapping returns [EObject current=null] : ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' ) ;
    public final EObject rulePropertyMapping() throws RecognitionException {
        EObject current = null;

        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_description_0_0 = null;

        EObject lv_attributes_1_0 = null;

        AntlrDatatypeRuleToken lv_name_4_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1462:28: ( ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1463:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1463:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1463:2: ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( ( ruleName ) ) otherlv_3= '->' ( (lv_name_4_0= ruleName ) ) otherlv_5= ';'
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1463:2: ( (lv_description_0_0= ruleDescription ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==RULE_STRING) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1464:1: (lv_description_0_0= ruleDescription )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1464:1: (lv_description_0_0= ruleDescription )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1465:3: lv_description_0_0= ruleDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyMappingAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDescription_in_rulePropertyMapping3011);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1481:3: ( (lv_attributes_1_0= ruleAttributeList ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==25) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1482:1: (lv_attributes_1_0= ruleAttributeList )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1482:1: (lv_attributes_1_0= ruleAttributeList )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1483:3: lv_attributes_1_0= ruleAttributeList
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyMappingAccess().getAttributesAttributeListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeList_in_rulePropertyMapping3033);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1499:3: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1500:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1500:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1501:3: ruleName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyMappingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPropertyMappingAccess().getFromPropertyCrossReference_2_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyMapping3057);
            ruleName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,30,FOLLOW_30_in_rulePropertyMapping3069); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyMappingAccess().getHyphenMinusGreaterThanSignKeyword_3());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1518:1: ( (lv_name_4_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1519:1: (lv_name_4_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1519:1: (lv_name_4_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1520:3: lv_name_4_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyMappingAccess().getNameNameParserRuleCall_4_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyMapping3090);
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

            otherlv_5=(Token)match(input,20,FOLLOW_20_in_rulePropertyMapping3102); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1548:1: entryRuleModelFolding returns [EObject current=null] : iv_ruleModelFolding= ruleModelFolding EOF ;
    public final EObject entryRuleModelFolding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelFolding = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1549:2: (iv_ruleModelFolding= ruleModelFolding EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1550:2: iv_ruleModelFolding= ruleModelFolding EOF
            {
             newCompositeNode(grammarAccess.getModelFoldingRule()); 
            pushFollow(FOLLOW_ruleModelFolding_in_entryRuleModelFolding3138);
            iv_ruleModelFolding=ruleModelFolding();

            state._fsp--;

             current =iv_ruleModelFolding; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModelFolding3148); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1557:1: ruleModelFolding returns [EObject current=null] : (otherlv_0= '=>' otherlv_1= '{' () ( (lv_foldings_3_0= rulePropertyFolding ) )* otherlv_4= '}' ) ;
    public final EObject ruleModelFolding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_foldings_3_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1560:28: ( (otherlv_0= '=>' otherlv_1= '{' () ( (lv_foldings_3_0= rulePropertyFolding ) )* otherlv_4= '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1561:1: (otherlv_0= '=>' otherlv_1= '{' () ( (lv_foldings_3_0= rulePropertyFolding ) )* otherlv_4= '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1561:1: (otherlv_0= '=>' otherlv_1= '{' () ( (lv_foldings_3_0= rulePropertyFolding ) )* otherlv_4= '}' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1561:3: otherlv_0= '=>' otherlv_1= '{' () ( (lv_foldings_3_0= rulePropertyFolding ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,31,FOLLOW_31_in_ruleModelFolding3185); 

                	newLeafNode(otherlv_0, grammarAccess.getModelFoldingAccess().getEqualsSignGreaterThanSignKeyword_0());
                
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleModelFolding3197); 

                	newLeafNode(otherlv_1, grammarAccess.getModelFoldingAccess().getLeftCurlyBracketKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1569:1: ()
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1570:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getModelFoldingAccess().getModelFoldingAction_2(),
                        current);
                

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1575:2: ( (lv_foldings_3_0= rulePropertyFolding ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=RULE_STRING && LA28_0<=RULE_NAME_TOKEN)||LA28_0==16||(LA28_0>=18 && LA28_0<=19)||LA28_0==25) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1576:1: (lv_foldings_3_0= rulePropertyFolding )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1576:1: (lv_foldings_3_0= rulePropertyFolding )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1577:3: lv_foldings_3_0= rulePropertyFolding
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelFoldingAccess().getFoldingsPropertyFoldingParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertyFolding_in_ruleModelFolding3227);
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
            	    break loop28;
                }
            } while (true);

            otherlv_4=(Token)match(input,23,FOLLOW_23_in_ruleModelFolding3240); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1605:1: entryRulePropertyFolding returns [EObject current=null] : iv_rulePropertyFolding= rulePropertyFolding EOF ;
    public final EObject entryRulePropertyFolding() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyFolding = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1606:2: (iv_rulePropertyFolding= rulePropertyFolding EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1607:2: iv_rulePropertyFolding= rulePropertyFolding EOF
            {
             newCompositeNode(grammarAccess.getPropertyFoldingRule()); 
            pushFollow(FOLLOW_rulePropertyFolding_in_entryRulePropertyFolding3276);
            iv_rulePropertyFolding=rulePropertyFolding();

            state._fsp--;

             current =iv_rulePropertyFolding; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyFolding3286); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1614:1: rulePropertyFolding returns [EObject current=null] : ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( ( ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' ) ;
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
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1617:28: ( ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( ( ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1618:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( ( ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1618:1: ( ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( ( ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1618:2: ( (lv_description_0_0= ruleDescription ) )? ( (lv_attributes_1_0= ruleAttributeList ) )? ( (lv_aggregator_2_0= ruleQualifiedName ) ) ( ( ruleName ) ) (otherlv_4= '->' | otherlv_5= '=>' ) ( (lv_name_6_0= ruleName ) ) otherlv_7= ';'
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1618:2: ( (lv_description_0_0= ruleDescription ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_STRING) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1619:1: (lv_description_0_0= ruleDescription )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1619:1: (lv_description_0_0= ruleDescription )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1620:3: lv_description_0_0= ruleDescription
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getDescriptionDescriptionParserRuleCall_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDescription_in_rulePropertyFolding3332);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1636:3: ( (lv_attributes_1_0= ruleAttributeList ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==25) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1637:1: (lv_attributes_1_0= ruleAttributeList )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1637:1: (lv_attributes_1_0= ruleAttributeList )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1638:3: lv_attributes_1_0= ruleAttributeList
                    {
                     
                    	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getAttributesAttributeListParserRuleCall_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleAttributeList_in_rulePropertyFolding3354);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1654:3: ( (lv_aggregator_2_0= ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1655:1: (lv_aggregator_2_0= ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1655:1: (lv_aggregator_2_0= ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1656:3: lv_aggregator_2_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getAggregatorQualifiedNameParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_rulePropertyFolding3376);
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

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1672:2: ( ( ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1673:1: ( ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1673:1: ( ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1674:3: ruleName
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getPropertyFoldingRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getFromPropertyCrossReference_3_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyFolding3399);
            ruleName();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1687:2: (otherlv_4= '->' | otherlv_5= '=>' )
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==30) ) {
                alt31=1;
            }
            else if ( (LA31_0==31) ) {
                alt31=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }
            switch (alt31) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1687:4: otherlv_4= '->'
                    {
                    otherlv_4=(Token)match(input,30,FOLLOW_30_in_rulePropertyFolding3412); 

                        	newLeafNode(otherlv_4, grammarAccess.getPropertyFoldingAccess().getHyphenMinusGreaterThanSignKeyword_4_0());
                        

                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1692:7: otherlv_5= '=>'
                    {
                    otherlv_5=(Token)match(input,31,FOLLOW_31_in_rulePropertyFolding3430); 

                        	newLeafNode(otherlv_5, grammarAccess.getPropertyFoldingAccess().getEqualsSignGreaterThanSignKeyword_4_1());
                        

                    }
                    break;

            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1696:2: ( (lv_name_6_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1697:1: (lv_name_6_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1697:1: (lv_name_6_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1698:3: lv_name_6_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyFoldingAccess().getNameNameParserRuleCall_5_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyFolding3452);
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

            otherlv_7=(Token)match(input,20,FOLLOW_20_in_rulePropertyFolding3464); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1728:1: entryRuleQualifiedNameObject returns [EObject current=null] : iv_ruleQualifiedNameObject= ruleQualifiedNameObject EOF ;
    public final EObject entryRuleQualifiedNameObject() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQualifiedNameObject = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1729:2: (iv_ruleQualifiedNameObject= ruleQualifiedNameObject EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1730:2: iv_ruleQualifiedNameObject= ruleQualifiedNameObject EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameObjectRule()); 
            pushFollow(FOLLOW_ruleQualifiedNameObject_in_entryRuleQualifiedNameObject3502);
            iv_ruleQualifiedNameObject=ruleQualifiedNameObject();

            state._fsp--;

             current =iv_ruleQualifiedNameObject; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedNameObject3512); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1737:1: ruleQualifiedNameObject returns [EObject current=null] : ( (lv_name_0_0= ruleQualifiedName ) ) ;
    public final EObject ruleQualifiedNameObject() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1740:28: ( ( (lv_name_0_0= ruleQualifiedName ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1741:1: ( (lv_name_0_0= ruleQualifiedName ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1741:1: ( (lv_name_0_0= ruleQualifiedName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1742:1: (lv_name_0_0= ruleQualifiedName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1742:1: (lv_name_0_0= ruleQualifiedName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1743:3: lv_name_0_0= ruleQualifiedName
            {
             
            	        newCompositeNode(grammarAccess.getQualifiedNameObjectAccess().getNameQualifiedNameParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleQualifiedName_in_ruleQualifiedNameObject3557);
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1767:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1768:2: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1769:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
             newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            pushFollow(FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3593);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;

             current =iv_ruleQualifiedName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQualifiedName3604); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1776:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_Name_0 = null;

        AntlrDatatypeRuleToken this_Name_2 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1779:28: ( (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1780:1: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1780:1: (this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1781:5: this_Name_0= ruleName (kw= '.' this_Name_2= ruleName )*
            {
             
                    newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_0()); 
                
            pushFollow(FOLLOW_ruleName_in_ruleQualifiedName3651);
            this_Name_0=ruleName();

            state._fsp--;


            		current.merge(this_Name_0);
                
             
                    afterParserOrEnumRuleCall();
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1791:1: (kw= '.' this_Name_2= ruleName )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==32) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1792:2: kw= '.' this_Name_2= ruleName
            	    {
            	    kw=(Token)match(input,32,FOLLOW_32_in_ruleQualifiedName3670); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            	        
            	     
            	            newCompositeNode(grammarAccess.getQualifiedNameAccess().getNameParserRuleCall_1_1()); 
            	        
            	    pushFollow(FOLLOW_ruleName_in_ruleQualifiedName3692);
            	    this_Name_2=ruleName();

            	    state._fsp--;


            	    		current.merge(this_Name_2);
            	        
            	     
            	            afterParserOrEnumRuleCall();
            	        

            	    }
            	    break;

            	default :
            	    break loop32;
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1816:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1817:2: (iv_ruleName= ruleName EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1818:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName3740);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName3751); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1825:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_NAME_TOKEN_0= RULE_NAME_TOKEN | kw= 'projective' | kw= 'joined' | kw= 'summarized' ) ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NAME_TOKEN_0=null;
        Token kw=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1828:28: ( (this_NAME_TOKEN_0= RULE_NAME_TOKEN | kw= 'projective' | kw= 'joined' | kw= 'summarized' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1829:1: (this_NAME_TOKEN_0= RULE_NAME_TOKEN | kw= 'projective' | kw= 'joined' | kw= 'summarized' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1829:1: (this_NAME_TOKEN_0= RULE_NAME_TOKEN | kw= 'projective' | kw= 'joined' | kw= 'summarized' )
            int alt33=4;
            switch ( input.LA(1) ) {
            case RULE_NAME_TOKEN:
                {
                alt33=1;
                }
                break;
            case 16:
                {
                alt33=2;
                }
                break;
            case 18:
                {
                alt33=3;
                }
                break;
            case 19:
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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1829:6: this_NAME_TOKEN_0= RULE_NAME_TOKEN
                    {
                    this_NAME_TOKEN_0=(Token)match(input,RULE_NAME_TOKEN,FOLLOW_RULE_NAME_TOKEN_in_ruleName3791); 

                    		current.merge(this_NAME_TOKEN_0);
                        
                     
                        newLeafNode(this_NAME_TOKEN_0, grammarAccess.getNameAccess().getNAME_TOKENTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1838:2: kw= 'projective'
                    {
                    kw=(Token)match(input,16,FOLLOW_16_in_ruleName3815); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getProjectiveKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1845:2: kw= 'joined'
                    {
                    kw=(Token)match(input,18,FOLLOW_18_in_ruleName3834); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getNameAccess().getJoinedKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1852:2: kw= 'summarized'
                    {
                    kw=(Token)match(input,19,FOLLOW_19_in_ruleName3853); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1865:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1866:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1867:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral3893);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral3903); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1874:1: ruleLiteral returns [EObject current=null] : ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_decimalValue_2_0= RULE_DECIMAL ) ) ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_stringValue_0_0=null;
        Token lv_intValue_1_0=null;
        Token lv_decimalValue_2_0=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1877:28: ( ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_decimalValue_2_0= RULE_DECIMAL ) ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1878:1: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_decimalValue_2_0= RULE_DECIMAL ) ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1878:1: ( ( (lv_stringValue_0_0= RULE_STRING ) ) | ( (lv_intValue_1_0= RULE_INT ) ) | ( (lv_decimalValue_2_0= RULE_DECIMAL ) ) )
            int alt34=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt34=1;
                }
                break;
            case RULE_INT:
                {
                alt34=2;
                }
                break;
            case RULE_DECIMAL:
                {
                alt34=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1878:2: ( (lv_stringValue_0_0= RULE_STRING ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1878:2: ( (lv_stringValue_0_0= RULE_STRING ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1879:1: (lv_stringValue_0_0= RULE_STRING )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1879:1: (lv_stringValue_0_0= RULE_STRING )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1880:3: lv_stringValue_0_0= RULE_STRING
                    {
                    lv_stringValue_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral3945); 

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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1897:6: ( (lv_intValue_1_0= RULE_INT ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1897:6: ( (lv_intValue_1_0= RULE_INT ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1898:1: (lv_intValue_1_0= RULE_INT )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1898:1: (lv_intValue_1_0= RULE_INT )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1899:3: lv_intValue_1_0= RULE_INT
                    {
                    lv_intValue_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLiteral3973); 

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
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1916:6: ( (lv_decimalValue_2_0= RULE_DECIMAL ) )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1916:6: ( (lv_decimalValue_2_0= RULE_DECIMAL ) )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1917:1: (lv_decimalValue_2_0= RULE_DECIMAL )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1917:1: (lv_decimalValue_2_0= RULE_DECIMAL )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1918:3: lv_decimalValue_2_0= RULE_DECIMAL
                    {
                    lv_decimalValue_2_0=(Token)match(input,RULE_DECIMAL,FOLLOW_RULE_DECIMAL_in_ruleLiteral4001); 

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


    // $ANTLR start "ruleType"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1942:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) ) ;
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
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1944:28: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1945:1: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1945:1: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) )
            int alt35=11;
            switch ( input.LA(1) ) {
            case 33:
                {
                alt35=1;
                }
                break;
            case 34:
                {
                alt35=2;
                }
                break;
            case 35:
                {
                alt35=3;
                }
                break;
            case 36:
                {
                alt35=4;
                }
                break;
            case 37:
                {
                alt35=5;
                }
                break;
            case 38:
                {
                alt35=6;
                }
                break;
            case 39:
                {
                alt35=7;
                }
                break;
            case 40:
                {
                alt35=8;
                }
                break;
            case 41:
                {
                alt35=9;
                }
                break;
            case 42:
                {
                alt35=10;
                }
                break;
            case 43:
                {
                alt35=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;
            }

            switch (alt35) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1945:2: (enumLiteral_0= 'INT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1945:2: (enumLiteral_0= 'INT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1945:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,33,FOLLOW_33_in_ruleType4056); 

                            current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1951:6: (enumLiteral_1= 'LONG' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1951:6: (enumLiteral_1= 'LONG' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1951:8: enumLiteral_1= 'LONG'
                    {
                    enumLiteral_1=(Token)match(input,34,FOLLOW_34_in_ruleType4073); 

                            current = grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1957:6: (enumLiteral_2= 'BYTE' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1957:6: (enumLiteral_2= 'BYTE' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1957:8: enumLiteral_2= 'BYTE'
                    {
                    enumLiteral_2=(Token)match(input,35,FOLLOW_35_in_ruleType4090); 

                            current = grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1963:6: (enumLiteral_3= 'SHORT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1963:6: (enumLiteral_3= 'SHORT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1963:8: enumLiteral_3= 'SHORT'
                    {
                    enumLiteral_3=(Token)match(input,36,FOLLOW_36_in_ruleType4107); 

                            current = grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1969:6: (enumLiteral_4= 'DECIMAL' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1969:6: (enumLiteral_4= 'DECIMAL' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1969:8: enumLiteral_4= 'DECIMAL'
                    {
                    enumLiteral_4=(Token)match(input,37,FOLLOW_37_in_ruleType4124); 

                            current = grammarAccess.getTypeAccess().getDECIMALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDECIMALEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1975:6: (enumLiteral_5= 'FLOAT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1975:6: (enumLiteral_5= 'FLOAT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1975:8: enumLiteral_5= 'FLOAT'
                    {
                    enumLiteral_5=(Token)match(input,38,FOLLOW_38_in_ruleType4141); 

                            current = grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1981:6: (enumLiteral_6= 'DOUBLE' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1981:6: (enumLiteral_6= 'DOUBLE' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1981:8: enumLiteral_6= 'DOUBLE'
                    {
                    enumLiteral_6=(Token)match(input,39,FOLLOW_39_in_ruleType4158); 

                            current = grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1987:6: (enumLiteral_7= 'TEXT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1987:6: (enumLiteral_7= 'TEXT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1987:8: enumLiteral_7= 'TEXT'
                    {
                    enumLiteral_7=(Token)match(input,40,FOLLOW_40_in_ruleType4175); 

                            current = grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1993:6: (enumLiteral_8= 'BOOLEAN' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1993:6: (enumLiteral_8= 'BOOLEAN' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1993:8: enumLiteral_8= 'BOOLEAN'
                    {
                    enumLiteral_8=(Token)match(input,41,FOLLOW_41_in_ruleType4192); 

                            current = grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1999:6: (enumLiteral_9= 'DATE' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1999:6: (enumLiteral_9= 'DATE' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:1999:8: enumLiteral_9= 'DATE'
                    {
                    enumLiteral_9=(Token)match(input,42,FOLLOW_42_in_ruleType4209); 

                            current = grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2005:6: (enumLiteral_10= 'DATETIME' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2005:6: (enumLiteral_10= 'DATETIME' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:2005:8: enumLiteral_10= 'DATETIME'
                    {
                    enumLiteral_10=(Token)match(input,43,FOLLOW_43_in_ruleType4226); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleScript_in_entryRuleScript75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleScript85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_ruleScript130 = new BitSet(new long[]{0x00000000020D0032L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_entryRuleModelDefinition166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelDefinition176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_ruleModelDefinition222 = new BitSet(new long[]{0x00000000020D0020L});
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
    public static final BitSet FOLLOW_22_in_ruleRecordTerm745 = new BitSet(new long[]{0x00000000028D0030L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleRecordTerm775 = new BitSet(new long[]{0x00000000028D0030L});
    public static final BitSet FOLLOW_23_in_ruleRecordTerm788 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_ruleRecordTerm816 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_entryRuleModelReference852 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelReference862 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleModelReference909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition944 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rulePropertyDefinition1000 = new BitSet(new long[]{0x00000000020D0020L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rulePropertyDefinition1022 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyDefinition1044 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_rulePropertyDefinition1056 = new BitSet(new long[]{0x00000FFE00000000L});
    public static final BitSet FOLLOW_ruleType_in_rulePropertyDefinition1077 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePropertyDefinition1089 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinExpression_in_entryRuleJoinExpression1125 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinExpression1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_ruleJoinExpression1181 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleJoinExpression1194 = new BitSet(new long[]{0x00000000004D0020L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_ruleJoinExpression1215 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleJoinTerm_in_entryRuleJoinTerm1253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleJoinTerm1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_ruleJoinTerm1309 = new BitSet(new long[]{0x0000000060000002L});
    public static final BitSet FOLLOW_ruleModelMapping_in_ruleJoinTerm1330 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_ruleJoinTerm1352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeExpression_in_entryRuleSummarizeExpression1389 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeExpression1399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_ruleSummarizeExpression1445 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_21_in_ruleSummarizeExpression1458 = new BitSet(new long[]{0x00000000004D0020L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_ruleSummarizeExpression1479 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_ruleSummarizeTerm_in_entryRuleSummarizeTerm1517 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSummarizeTerm1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelReference_in_ruleSummarizeTerm1573 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_ruleModelFolding_in_ruleSummarizeTerm1594 = new BitSet(new long[]{0x0000000020000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_ruleSummarizeTerm1615 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_entryRuleDescription1653 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescription1664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDescription1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeList_in_entryRuleAttributeList1747 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeList1757 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_ruleAttributeList1802 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_ruleAttribute_in_entryRuleAttribute1838 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttribute1848 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleAttribute1885 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleAttribute1906 = new BitSet(new long[]{0x0000000004000002L});
    public static final BitSet FOLLOW_ruleAttributeElementBlock_in_ruleAttribute1927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElementBlock_in_entryRuleAttributeElementBlock1964 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElementBlock1974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleAttributeElementBlock2020 = new BitSet(new long[]{0x00000000100D0020L});
    public static final BitSet FOLLOW_ruleAttributeElementList_in_ruleAttributeElementBlock2042 = new BitSet(new long[]{0x0000000018000000L});
    public static final BitSet FOLLOW_27_in_ruleAttributeElementBlock2055 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_28_in_ruleAttributeElementBlock2071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElementList_in_entryRuleAttributeElementList2107 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElementList2117 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_ruleAttributeElementList2163 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleAttributeElementList2176 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_ruleAttributeElementList2197 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleAttributeElement_in_entryRuleAttributeElement2235 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeElement2245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleAttributeElement2291 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleAttributeElement2303 = new BitSet(new long[]{0x00000000004D00F0L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAttributeElement2324 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_entryRuleAttributeValue2360 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValue2370 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueArray_in_ruleAttributeValue2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameObject_in_ruleAttributeValue2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleAttributeValue2470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAttributeValueArray_in_entryRuleAttributeValueArray2506 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAttributeValueArray2516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleAttributeValueArray2553 = new BitSet(new long[]{0x00000000004D00F0L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAttributeValueArray2574 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_27_in_ruleAttributeValueArray2587 = new BitSet(new long[]{0x00000000004D00F0L});
    public static final BitSet FOLLOW_ruleAttributeValue_in_ruleAttributeValueArray2608 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_27_in_ruleAttributeValueArray2623 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleAttributeValueArray2637 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGrouping_in_entryRuleGrouping2673 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGrouping2683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleGrouping2720 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_ruleGrouping2743 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_27_in_ruleGrouping2756 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_ruleGrouping2779 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_ruleModelMapping_in_entryRuleModelMapping2817 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelMapping2827 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleModelMapping2864 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleModelMapping2876 = new BitSet(new long[]{0x00000000028D0030L});
    public static final BitSet FOLLOW_rulePropertyMapping_in_ruleModelMapping2906 = new BitSet(new long[]{0x00000000028D0030L});
    public static final BitSet FOLLOW_23_in_ruleModelMapping2919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyMapping_in_entryRulePropertyMapping2955 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyMapping2965 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rulePropertyMapping3011 = new BitSet(new long[]{0x00000000020D0020L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rulePropertyMapping3033 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyMapping3057 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_30_in_rulePropertyMapping3069 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyMapping3090 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePropertyMapping3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelFolding_in_entryRuleModelFolding3138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelFolding3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleModelFolding3185 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleModelFolding3197 = new BitSet(new long[]{0x00000000028D0030L});
    public static final BitSet FOLLOW_rulePropertyFolding_in_ruleModelFolding3227 = new BitSet(new long[]{0x00000000028D0030L});
    public static final BitSet FOLLOW_23_in_ruleModelFolding3240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyFolding_in_entryRulePropertyFolding3276 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyFolding3286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescription_in_rulePropertyFolding3332 = new BitSet(new long[]{0x00000000020D0020L});
    public static final BitSet FOLLOW_ruleAttributeList_in_rulePropertyFolding3354 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_rulePropertyFolding3376 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyFolding3399 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_30_in_rulePropertyFolding3412 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_31_in_rulePropertyFolding3430 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyFolding3452 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_rulePropertyFolding3464 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedNameObject_in_entryRuleQualifiedNameObject3502 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedNameObject3512 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_ruleQualifiedNameObject3557 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQualifiedName_in_entryRuleQualifiedName3593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQualifiedName3604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleQualifiedName3651 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_32_in_ruleQualifiedName3670 = new BitSet(new long[]{0x00000000000D0020L});
    public static final BitSet FOLLOW_ruleName_in_ruleQualifiedName3692 = new BitSet(new long[]{0x0000000100000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName3740 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName3751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_TOKEN_in_ruleName3791 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleName3815 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleName3834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleName3853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral3893 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral3903 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral3945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLiteral3973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_DECIMAL_in_ruleLiteral4001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleType4056 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleType4073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleType4090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleType4107 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleType4124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleType4141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleType4158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_ruleType4175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_41_in_ruleType4192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleType4209 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleType4226 = new BitSet(new long[]{0x0000000000000002L});

}