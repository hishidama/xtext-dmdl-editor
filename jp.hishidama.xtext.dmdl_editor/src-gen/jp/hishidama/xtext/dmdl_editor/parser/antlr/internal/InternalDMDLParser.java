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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME_TOKEN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'='", "';'", "'+'", "'{'", "'}'", "':'", "'INT'", "'LONG'", "'BYTE'", "'SHORT'", "'DECIMAL'", "'FLOAT'", "'DOUBLE'", "'TEXT'", "'BOOLEAN'", "'DATE'", "'DATETIME'"
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
    public String getGrammarFileName() { return "../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g"; }



     	private DMDLGrammarAccess grammarAccess;
     	
        public InternalDMDLParser(TokenStream input, DMDLGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "Models";	
       	}
       	
       	@Override
       	protected DMDLGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleModels"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:68:1: entryRuleModels returns [EObject current=null] : iv_ruleModels= ruleModels EOF ;
    public final EObject entryRuleModels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModels = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:69:2: (iv_ruleModels= ruleModels EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:70:2: iv_ruleModels= ruleModels EOF
            {
             newCompositeNode(grammarAccess.getModelsRule()); 
            pushFollow(FOLLOW_ruleModels_in_entryRuleModels75);
            iv_ruleModels=ruleModels();

            state._fsp--;

             current =iv_ruleModels; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleModels85); 

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
    // $ANTLR end "entryRuleModels"


    // $ANTLR start "ruleModels"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:77:1: ruleModels returns [EObject current=null] : ( (lv_list_0_0= ruleModelDefinition ) )* ;
    public final EObject ruleModels() throws RecognitionException {
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

                if ( (LA1_0==RULE_NAME_TOKEN) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:82:1: (lv_list_0_0= ruleModelDefinition )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:82:1: (lv_list_0_0= ruleModelDefinition )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:83:3: lv_list_0_0= ruleModelDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getModelsAccess().getListModelDefinitionParserRuleCall_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleModelDefinition_in_ruleModels130);
            	    lv_list_0_0=ruleModelDefinition();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getModelsRule());
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
    // $ANTLR end "ruleModels"


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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:116:1: ruleModelDefinition returns [EObject current=null] : this_RecordModelDefinition_0= ruleRecordModelDefinition ;
    public final EObject ruleModelDefinition() throws RecognitionException {
        EObject current = null;

        EObject this_RecordModelDefinition_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:119:28: (this_RecordModelDefinition_0= ruleRecordModelDefinition )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:121:5: this_RecordModelDefinition_0= ruleRecordModelDefinition
            {
             
                    newCompositeNode(grammarAccess.getModelDefinitionAccess().getRecordModelDefinitionParserRuleCall()); 
                
            pushFollow(FOLLOW_ruleRecordModelDefinition_in_ruleModelDefinition222);
            this_RecordModelDefinition_0=ruleRecordModelDefinition();

            state._fsp--;

             
                    current = this_RecordModelDefinition_0; 
                    afterParserOrEnumRuleCall();
                

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:137:1: entryRuleRecordModelDefinition returns [EObject current=null] : iv_ruleRecordModelDefinition= ruleRecordModelDefinition EOF ;
    public final EObject entryRuleRecordModelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordModelDefinition = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:138:2: (iv_ruleRecordModelDefinition= ruleRecordModelDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:139:2: iv_ruleRecordModelDefinition= ruleRecordModelDefinition EOF
            {
             newCompositeNode(grammarAccess.getRecordModelDefinitionRule()); 
            pushFollow(FOLLOW_ruleRecordModelDefinition_in_entryRuleRecordModelDefinition256);
            iv_ruleRecordModelDefinition=ruleRecordModelDefinition();

            state._fsp--;

             current =iv_ruleRecordModelDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordModelDefinition266); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:146:1: ruleRecordModelDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleRecordExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleRecordModelDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_rhs_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:149:28: ( ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleRecordExpression ) ) otherlv_3= ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:150:1: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleRecordExpression ) ) otherlv_3= ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:150:1: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleRecordExpression ) ) otherlv_3= ';' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:150:2: ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' ( (lv_rhs_2_0= ruleRecordExpression ) ) otherlv_3= ';'
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:150:2: ( (lv_name_0_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:151:1: (lv_name_0_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:151:1: (lv_name_0_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:152:3: lv_name_0_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getRecordModelDefinitionAccess().getNameNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleRecordModelDefinition312);
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

            otherlv_1=(Token)match(input,8,FOLLOW_8_in_ruleRecordModelDefinition324); 

                	newLeafNode(otherlv_1, grammarAccess.getRecordModelDefinitionAccess().getEqualsSignKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:172:1: ( (lv_rhs_2_0= ruleRecordExpression ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:173:1: (lv_rhs_2_0= ruleRecordExpression )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:173:1: (lv_rhs_2_0= ruleRecordExpression )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:174:3: lv_rhs_2_0= ruleRecordExpression
            {
             
            	        newCompositeNode(grammarAccess.getRecordModelDefinitionAccess().getRhsRecordExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleRecordExpression_in_ruleRecordModelDefinition345);
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

            otherlv_3=(Token)match(input,9,FOLLOW_9_in_ruleRecordModelDefinition357); 

                	newLeafNode(otherlv_3, grammarAccess.getRecordModelDefinitionAccess().getSemicolonKeyword_3());
                

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


    // $ANTLR start "entryRuleRecordExpression"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:202:1: entryRuleRecordExpression returns [EObject current=null] : iv_ruleRecordExpression= ruleRecordExpression EOF ;
    public final EObject entryRuleRecordExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordExpression = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:203:2: (iv_ruleRecordExpression= ruleRecordExpression EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:204:2: iv_ruleRecordExpression= ruleRecordExpression EOF
            {
             newCompositeNode(grammarAccess.getRecordExpressionRule()); 
            pushFollow(FOLLOW_ruleRecordExpression_in_entryRuleRecordExpression393);
            iv_ruleRecordExpression=ruleRecordExpression();

            state._fsp--;

             current =iv_ruleRecordExpression; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordExpression403); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:211:1: ruleRecordExpression returns [EObject current=null] : ( ( (lv_block_0_0= ruleRecordTerm ) ) (otherlv_1= '+' ( (lv_block_2_0= ruleRecordTerm ) ) )* ) ;
    public final EObject ruleRecordExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_block_0_0 = null;

        EObject lv_block_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:214:28: ( ( ( (lv_block_0_0= ruleRecordTerm ) ) (otherlv_1= '+' ( (lv_block_2_0= ruleRecordTerm ) ) )* ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:215:1: ( ( (lv_block_0_0= ruleRecordTerm ) ) (otherlv_1= '+' ( (lv_block_2_0= ruleRecordTerm ) ) )* )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:215:1: ( ( (lv_block_0_0= ruleRecordTerm ) ) (otherlv_1= '+' ( (lv_block_2_0= ruleRecordTerm ) ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:215:2: ( (lv_block_0_0= ruleRecordTerm ) ) (otherlv_1= '+' ( (lv_block_2_0= ruleRecordTerm ) ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:215:2: ( (lv_block_0_0= ruleRecordTerm ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:216:1: (lv_block_0_0= ruleRecordTerm )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:216:1: (lv_block_0_0= ruleRecordTerm )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:217:3: lv_block_0_0= ruleRecordTerm
            {
             
            	        newCompositeNode(grammarAccess.getRecordExpressionAccess().getBlockRecordTermParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleRecordTerm_in_ruleRecordExpression449);
            lv_block_0_0=ruleRecordTerm();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRecordExpressionRule());
            	        }
                   		add(
                   			current, 
                   			"block",
                    		lv_block_0_0, 
                    		"RecordTerm");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:233:2: (otherlv_1= '+' ( (lv_block_2_0= ruleRecordTerm ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==10) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:233:4: otherlv_1= '+' ( (lv_block_2_0= ruleRecordTerm ) )
            	    {
            	    otherlv_1=(Token)match(input,10,FOLLOW_10_in_ruleRecordExpression462); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRecordExpressionAccess().getPlusSignKeyword_1_0());
            	        
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:237:1: ( (lv_block_2_0= ruleRecordTerm ) )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:238:1: (lv_block_2_0= ruleRecordTerm )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:238:1: (lv_block_2_0= ruleRecordTerm )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:239:3: lv_block_2_0= ruleRecordTerm
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecordExpressionAccess().getBlockRecordTermParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRecordTerm_in_ruleRecordExpression483);
            	    lv_block_2_0=ruleRecordTerm();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRecordExpressionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"block",
            	            		lv_block_2_0, 
            	            		"RecordTerm");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:263:1: entryRuleRecordTerm returns [EObject current=null] : iv_ruleRecordTerm= ruleRecordTerm EOF ;
    public final EObject entryRuleRecordTerm() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRecordTerm = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:264:2: (iv_ruleRecordTerm= ruleRecordTerm EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:265:2: iv_ruleRecordTerm= ruleRecordTerm EOF
            {
             newCompositeNode(grammarAccess.getRecordTermRule()); 
            pushFollow(FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm521);
            iv_ruleRecordTerm=ruleRecordTerm();

            state._fsp--;

             current =iv_ruleRecordTerm; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRecordTerm531); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:272:1: ruleRecordTerm returns [EObject current=null] : (otherlv_0= '{' ( (lv_properties_1_0= rulePropertyDefinition ) )+ otherlv_2= '}' ) ;
    public final EObject ruleRecordTerm() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_properties_1_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:275:28: ( (otherlv_0= '{' ( (lv_properties_1_0= rulePropertyDefinition ) )+ otherlv_2= '}' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:276:1: (otherlv_0= '{' ( (lv_properties_1_0= rulePropertyDefinition ) )+ otherlv_2= '}' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:276:1: (otherlv_0= '{' ( (lv_properties_1_0= rulePropertyDefinition ) )+ otherlv_2= '}' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:276:3: otherlv_0= '{' ( (lv_properties_1_0= rulePropertyDefinition ) )+ otherlv_2= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleRecordTerm568); 

                	newLeafNode(otherlv_0, grammarAccess.getRecordTermAccess().getLeftCurlyBracketKeyword_0());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:280:1: ( (lv_properties_1_0= rulePropertyDefinition ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==RULE_NAME_TOKEN) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:281:1: (lv_properties_1_0= rulePropertyDefinition )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:281:1: (lv_properties_1_0= rulePropertyDefinition )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:282:3: lv_properties_1_0= rulePropertyDefinition
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRecordTermAccess().getPropertiesPropertyDefinitionParserRuleCall_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_rulePropertyDefinition_in_ruleRecordTerm589);
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
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRecordTerm602); 

                	newLeafNode(otherlv_2, grammarAccess.getRecordTermAccess().getRightCurlyBracketKeyword_2());
                

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


    // $ANTLR start "entryRulePropertyDefinition"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:310:1: entryRulePropertyDefinition returns [EObject current=null] : iv_rulePropertyDefinition= rulePropertyDefinition EOF ;
    public final EObject entryRulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePropertyDefinition = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:311:2: (iv_rulePropertyDefinition= rulePropertyDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:312:2: iv_rulePropertyDefinition= rulePropertyDefinition EOF
            {
             newCompositeNode(grammarAccess.getPropertyDefinitionRule()); 
            pushFollow(FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition638);
            iv_rulePropertyDefinition=rulePropertyDefinition();

            state._fsp--;

             current =iv_rulePropertyDefinition; 
            match(input,EOF,FOLLOW_EOF_in_entryRulePropertyDefinition648); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:319:1: rulePropertyDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' ) ;
    public final EObject rulePropertyDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        Enumerator lv_type_2_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:322:28: ( ( ( (lv_name_0_0= ruleName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:323:1: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:323:1: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:323:2: ( (lv_name_0_0= ruleName ) ) otherlv_1= ':' ( (lv_type_2_0= ruleType ) ) otherlv_3= ';'
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:323:2: ( (lv_name_0_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:324:1: (lv_name_0_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:324:1: (lv_name_0_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:325:3: lv_name_0_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getNameNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_rulePropertyDefinition694);
            lv_name_0_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FOLLOW_13_in_rulePropertyDefinition706); 

                	newLeafNode(otherlv_1, grammarAccess.getPropertyDefinitionAccess().getColonKeyword_1());
                
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:345:1: ( (lv_type_2_0= ruleType ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:346:1: (lv_type_2_0= ruleType )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:346:1: (lv_type_2_0= ruleType )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:347:3: lv_type_2_0= ruleType
            {
             
            	        newCompositeNode(grammarAccess.getPropertyDefinitionAccess().getTypeTypeEnumRuleCall_2_0()); 
            	    
            pushFollow(FOLLOW_ruleType_in_rulePropertyDefinition727);
            lv_type_2_0=ruleType();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPropertyDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"type",
                    		lv_type_2_0, 
                    		"Type");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,9,FOLLOW_9_in_rulePropertyDefinition739); 

                	newLeafNode(otherlv_3, grammarAccess.getPropertyDefinitionAccess().getSemicolonKeyword_3());
                

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


    // $ANTLR start "entryRuleName"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:375:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:376:2: (iv_ruleName= ruleName EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:377:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName776);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName787); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:384:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NAME_TOKEN_0= RULE_NAME_TOKEN ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NAME_TOKEN_0=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:387:28: (this_NAME_TOKEN_0= RULE_NAME_TOKEN )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:388:5: this_NAME_TOKEN_0= RULE_NAME_TOKEN
            {
            this_NAME_TOKEN_0=(Token)match(input,RULE_NAME_TOKEN,FOLLOW_RULE_NAME_TOKEN_in_ruleName826); 

            		current.merge(this_NAME_TOKEN_0);
                
             
                newLeafNode(this_NAME_TOKEN_0, grammarAccess.getNameAccess().getNAME_TOKENTerminalRuleCall()); 
                

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


    // $ANTLR start "ruleType"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:403:1: ruleType returns [Enumerator current=null] : ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) ) ;
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
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:405:28: ( ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:406:1: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:406:1: ( (enumLiteral_0= 'INT' ) | (enumLiteral_1= 'LONG' ) | (enumLiteral_2= 'BYTE' ) | (enumLiteral_3= 'SHORT' ) | (enumLiteral_4= 'DECIMAL' ) | (enumLiteral_5= 'FLOAT' ) | (enumLiteral_6= 'DOUBLE' ) | (enumLiteral_7= 'TEXT' ) | (enumLiteral_8= 'BOOLEAN' ) | (enumLiteral_9= 'DATE' ) | (enumLiteral_10= 'DATETIME' ) )
            int alt4=11;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 15:
                {
                alt4=2;
                }
                break;
            case 16:
                {
                alt4=3;
                }
                break;
            case 17:
                {
                alt4=4;
                }
                break;
            case 18:
                {
                alt4=5;
                }
                break;
            case 19:
                {
                alt4=6;
                }
                break;
            case 20:
                {
                alt4=7;
                }
                break;
            case 21:
                {
                alt4=8;
                }
                break;
            case 22:
                {
                alt4=9;
                }
                break;
            case 23:
                {
                alt4=10;
                }
                break;
            case 24:
                {
                alt4=11;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }

            switch (alt4) {
                case 1 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:406:2: (enumLiteral_0= 'INT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:406:2: (enumLiteral_0= 'INT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:406:4: enumLiteral_0= 'INT'
                    {
                    enumLiteral_0=(Token)match(input,14,FOLLOW_14_in_ruleType884); 

                            current = grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getTypeAccess().getINTEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:412:6: (enumLiteral_1= 'LONG' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:412:6: (enumLiteral_1= 'LONG' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:412:8: enumLiteral_1= 'LONG'
                    {
                    enumLiteral_1=(Token)match(input,15,FOLLOW_15_in_ruleType901); 

                            current = grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getTypeAccess().getLONGEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:418:6: (enumLiteral_2= 'BYTE' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:418:6: (enumLiteral_2= 'BYTE' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:418:8: enumLiteral_2= 'BYTE'
                    {
                    enumLiteral_2=(Token)match(input,16,FOLLOW_16_in_ruleType918); 

                            current = grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getTypeAccess().getBYTEEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:424:6: (enumLiteral_3= 'SHORT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:424:6: (enumLiteral_3= 'SHORT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:424:8: enumLiteral_3= 'SHORT'
                    {
                    enumLiteral_3=(Token)match(input,17,FOLLOW_17_in_ruleType935); 

                            current = grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getTypeAccess().getSHORTEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:430:6: (enumLiteral_4= 'DECIMAL' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:430:6: (enumLiteral_4= 'DECIMAL' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:430:8: enumLiteral_4= 'DECIMAL'
                    {
                    enumLiteral_4=(Token)match(input,18,FOLLOW_18_in_ruleType952); 

                            current = grammarAccess.getTypeAccess().getDECIMALEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getTypeAccess().getDECIMALEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:436:6: (enumLiteral_5= 'FLOAT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:436:6: (enumLiteral_5= 'FLOAT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:436:8: enumLiteral_5= 'FLOAT'
                    {
                    enumLiteral_5=(Token)match(input,19,FOLLOW_19_in_ruleType969); 

                            current = grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getTypeAccess().getFLOATEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:442:6: (enumLiteral_6= 'DOUBLE' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:442:6: (enumLiteral_6= 'DOUBLE' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:442:8: enumLiteral_6= 'DOUBLE'
                    {
                    enumLiteral_6=(Token)match(input,20,FOLLOW_20_in_ruleType986); 

                            current = grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getTypeAccess().getDOUBLEEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:448:6: (enumLiteral_7= 'TEXT' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:448:6: (enumLiteral_7= 'TEXT' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:448:8: enumLiteral_7= 'TEXT'
                    {
                    enumLiteral_7=(Token)match(input,21,FOLLOW_21_in_ruleType1003); 

                            current = grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getTypeAccess().getTEXTEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;
                case 9 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:454:6: (enumLiteral_8= 'BOOLEAN' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:454:6: (enumLiteral_8= 'BOOLEAN' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:454:8: enumLiteral_8= 'BOOLEAN'
                    {
                    enumLiteral_8=(Token)match(input,22,FOLLOW_22_in_ruleType1020); 

                            current = grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_8().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_8, grammarAccess.getTypeAccess().getBOOLEANEnumLiteralDeclaration_8()); 
                        

                    }


                    }
                    break;
                case 10 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:460:6: (enumLiteral_9= 'DATE' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:460:6: (enumLiteral_9= 'DATE' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:460:8: enumLiteral_9= 'DATE'
                    {
                    enumLiteral_9=(Token)match(input,23,FOLLOW_23_in_ruleType1037); 

                            current = grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_9().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_9, grammarAccess.getTypeAccess().getDATEEnumLiteralDeclaration_9()); 
                        

                    }


                    }
                    break;
                case 11 :
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:466:6: (enumLiteral_10= 'DATETIME' )
                    {
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:466:6: (enumLiteral_10= 'DATETIME' )
                    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:466:8: enumLiteral_10= 'DATETIME'
                    {
                    enumLiteral_10=(Token)match(input,24,FOLLOW_24_in_ruleType1054); 

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


 

    public static final BitSet FOLLOW_ruleModels_in_entryRuleModels75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModels85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_ruleModels130 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_entryRuleModelDefinition166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelDefinition176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordModelDefinition_in_ruleModelDefinition222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordModelDefinition_in_entryRuleRecordModelDefinition256 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordModelDefinition266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleRecordModelDefinition312 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_ruleRecordModelDefinition324 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_ruleRecordModelDefinition345 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_ruleRecordModelDefinition357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordExpression_in_entryRuleRecordExpression393 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordExpression403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_ruleRecordExpression449 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_10_in_ruleRecordExpression462 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_ruleRecordExpression483 = new BitSet(new long[]{0x0000000000000402L});
    public static final BitSet FOLLOW_ruleRecordTerm_in_entryRuleRecordTerm521 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRecordTerm531 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleRecordTerm568 = new BitSet(new long[]{0x0000000000002010L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_ruleRecordTerm589 = new BitSet(new long[]{0x0000000000003010L});
    public static final BitSet FOLLOW_12_in_ruleRecordTerm602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePropertyDefinition_in_entryRulePropertyDefinition638 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePropertyDefinition648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_rulePropertyDefinition694 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_rulePropertyDefinition706 = new BitSet(new long[]{0x0000000001FFC000L});
    public static final BitSet FOLLOW_ruleType_in_rulePropertyDefinition727 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_rulePropertyDefinition739 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName776 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName787 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_TOKEN_in_ruleName826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleType884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleType901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleType918 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleType935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleType952 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleType969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_ruleType986 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_ruleType1003 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_ruleType1020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleType1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleType1054 = new BitSet(new long[]{0x0000000000000002L});

}