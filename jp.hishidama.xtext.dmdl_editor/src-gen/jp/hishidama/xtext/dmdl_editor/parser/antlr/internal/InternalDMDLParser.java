package jp.hishidama.xtext.dmdl_editor.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_NAME_TOKEN", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "'='", "'{'", "'}'", "';'"
    };
    public static final int RULE_NAME_TOKEN=4;
    public static final int T__11=11;
    public static final int T__10=10;
    public static final int RULE_WS=7;
    public static final int RULE_SL_COMMENT=6;
    public static final int EOF=-1;
    public static final int T__9=9;
    public static final int T__8=8;
    public static final int RULE_ML_COMMENT=5;

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:67:1: entryRuleModels returns [EObject current=null] : iv_ruleModels= ruleModels EOF ;
    public final EObject entryRuleModels() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModels = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:68:2: (iv_ruleModels= ruleModels EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:69:2: iv_ruleModels= ruleModels EOF
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:76:1: ruleModels returns [EObject current=null] : ( (lv_list_0_0= ruleModelDefinition ) )* ;
    public final EObject ruleModels() throws RecognitionException {
        EObject current = null;

        EObject lv_list_0_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:79:28: ( ( (lv_list_0_0= ruleModelDefinition ) )* )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:80:1: ( (lv_list_0_0= ruleModelDefinition ) )*
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:80:1: ( (lv_list_0_0= ruleModelDefinition ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==RULE_NAME_TOKEN) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:81:1: (lv_list_0_0= ruleModelDefinition )
            	    {
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:81:1: (lv_list_0_0= ruleModelDefinition )
            	    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:82:3: lv_list_0_0= ruleModelDefinition
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:106:1: entryRuleModelDefinition returns [EObject current=null] : iv_ruleModelDefinition= ruleModelDefinition EOF ;
    public final EObject entryRuleModelDefinition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModelDefinition = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:107:2: (iv_ruleModelDefinition= ruleModelDefinition EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:108:2: iv_ruleModelDefinition= ruleModelDefinition EOF
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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:115:1: ruleModelDefinition returns [EObject current=null] : ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' ) ;
    public final EObject ruleModelDefinition() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;


         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:118:28: ( ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:119:1: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:119:1: ( ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';' )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:119:2: ( (lv_name_0_0= ruleName ) ) otherlv_1= '=' otherlv_2= '{' otherlv_3= '}' otherlv_4= ';'
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:119:2: ( (lv_name_0_0= ruleName ) )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:120:1: (lv_name_0_0= ruleName )
            {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:120:1: (lv_name_0_0= ruleName )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:121:3: lv_name_0_0= ruleName
            {
             
            	        newCompositeNode(grammarAccess.getModelDefinitionAccess().getNameNameParserRuleCall_0_0()); 
            	    
            pushFollow(FOLLOW_ruleName_in_ruleModelDefinition222);
            lv_name_0_0=ruleName();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getModelDefinitionRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"Name");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,8,FOLLOW_8_in_ruleModelDefinition234); 

                	newLeafNode(otherlv_1, grammarAccess.getModelDefinitionAccess().getEqualsSignKeyword_1());
                
            otherlv_2=(Token)match(input,9,FOLLOW_9_in_ruleModelDefinition246); 

                	newLeafNode(otherlv_2, grammarAccess.getModelDefinitionAccess().getLeftCurlyBracketKeyword_2());
                
            otherlv_3=(Token)match(input,10,FOLLOW_10_in_ruleModelDefinition258); 

                	newLeafNode(otherlv_3, grammarAccess.getModelDefinitionAccess().getRightCurlyBracketKeyword_3());
                
            otherlv_4=(Token)match(input,11,FOLLOW_11_in_ruleModelDefinition270); 

                	newLeafNode(otherlv_4, grammarAccess.getModelDefinitionAccess().getSemicolonKeyword_4());
                

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


    // $ANTLR start "entryRuleName"
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:161:1: entryRuleName returns [String current=null] : iv_ruleName= ruleName EOF ;
    public final String entryRuleName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleName = null;


        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:162:2: (iv_ruleName= ruleName EOF )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:163:2: iv_ruleName= ruleName EOF
            {
             newCompositeNode(grammarAccess.getNameRule()); 
            pushFollow(FOLLOW_ruleName_in_entryRuleName307);
            iv_ruleName=ruleName();

            state._fsp--;

             current =iv_ruleName.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleName318); 

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
    // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:170:1: ruleName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_NAME_TOKEN_0= RULE_NAME_TOKEN ;
    public final AntlrDatatypeRuleToken ruleName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_NAME_TOKEN_0=null;

         enterRule(); 
            
        try {
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:173:28: (this_NAME_TOKEN_0= RULE_NAME_TOKEN )
            // ../jp.hishidama.xtext.dmdl_editor/src-gen/jp/hishidama/xtext/dmdl_editor/parser/antlr/internal/InternalDMDL.g:174:5: this_NAME_TOKEN_0= RULE_NAME_TOKEN
            {
            this_NAME_TOKEN_0=(Token)match(input,RULE_NAME_TOKEN,FOLLOW_RULE_NAME_TOKEN_in_ruleName357); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleModels_in_entryRuleModels75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModels85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_ruleModels130 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_ruleModelDefinition_in_entryRuleModelDefinition166 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleModelDefinition176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_ruleModelDefinition222 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_8_in_ruleModelDefinition234 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_9_in_ruleModelDefinition246 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_10_in_ruleModelDefinition258 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_11_in_ruleModelDefinition270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleName_in_entryRuleName307 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleName318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_NAME_TOKEN_in_ruleName357 = new BitSet(new long[]{0x0000000000000002L});

}