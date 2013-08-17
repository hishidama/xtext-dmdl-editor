/*
* generated by Xtext
*/
grammar InternalDMDL;

options {
	superClass=AbstractInternalContentAssistParser;
	
}

@lexer::header {
package jp.hishidama.xtext.dmdl_editor.ui.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}

@parser::members {
 
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

}




// Entry rule entryRuleModels
entryRuleModels 
:
{ before(grammarAccess.getModelsRule()); }
	 ruleModels
{ after(grammarAccess.getModelsRule()); } 
	 EOF 
;

// Rule Models
ruleModels
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelsAccess().getListAssignment()); }
(rule__Models__ListAssignment)*
{ after(grammarAccess.getModelsAccess().getListAssignment()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleModelDefinition
entryRuleModelDefinition 
:
{ before(grammarAccess.getModelDefinitionRule()); }
	 ruleModelDefinition
{ after(grammarAccess.getModelDefinitionRule()); } 
	 EOF 
;

// Rule ModelDefinition
ruleModelDefinition
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getModelDefinitionAccess().getGroup()); }
(rule__ModelDefinition__Group__0)
{ after(grammarAccess.getModelDefinitionAccess().getGroup()); }
)

;
finally {
	restoreStackSize(stackSize);
}



// Entry rule entryRuleName
entryRuleName 
:
{ before(grammarAccess.getNameRule()); }
	 ruleName
{ after(grammarAccess.getNameRule()); } 
	 EOF 
;

// Rule Name
ruleName
    @init {
		int stackSize = keepStackSize();
    }
	:
(
{ before(grammarAccess.getNameAccess().getNAME_TOKENTerminalRuleCall()); }
	RULE_NAME_TOKEN
{ after(grammarAccess.getNameAccess().getNAME_TOKENTerminalRuleCall()); }
)

;
finally {
	restoreStackSize(stackSize);
}






rule__ModelDefinition__Group__0
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ModelDefinition__Group__0__Impl
	rule__ModelDefinition__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelDefinition__Group__0__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelDefinitionAccess().getNameAssignment_0()); }
(rule__ModelDefinition__NameAssignment_0)
{ after(grammarAccess.getModelDefinitionAccess().getNameAssignment_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ModelDefinition__Group__1
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ModelDefinition__Group__1__Impl
	rule__ModelDefinition__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelDefinition__Group__1__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelDefinitionAccess().getEqualsSignKeyword_1()); }

	'=' 

{ after(grammarAccess.getModelDefinitionAccess().getEqualsSignKeyword_1()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ModelDefinition__Group__2
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ModelDefinition__Group__2__Impl
	rule__ModelDefinition__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelDefinition__Group__2__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelDefinitionAccess().getLeftCurlyBracketKeyword_2()); }

	'{' 

{ after(grammarAccess.getModelDefinitionAccess().getLeftCurlyBracketKeyword_2()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ModelDefinition__Group__3
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ModelDefinition__Group__3__Impl
	rule__ModelDefinition__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelDefinition__Group__3__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelDefinitionAccess().getRightCurlyBracketKeyword_3()); }

	'}' 

{ after(grammarAccess.getModelDefinitionAccess().getRightCurlyBracketKeyword_3()); }
)

;
finally {
	restoreStackSize(stackSize);
}


rule__ModelDefinition__Group__4
    @init {
		int stackSize = keepStackSize();
    }
:
	rule__ModelDefinition__Group__4__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__ModelDefinition__Group__4__Impl
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelDefinitionAccess().getSemicolonKeyword_4()); }

	';' 

{ after(grammarAccess.getModelDefinitionAccess().getSemicolonKeyword_4()); }
)

;
finally {
	restoreStackSize(stackSize);
}













rule__Models__ListAssignment
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelsAccess().getListModelDefinitionParserRuleCall_0()); }
	ruleModelDefinition{ after(grammarAccess.getModelsAccess().getListModelDefinitionParserRuleCall_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}

rule__ModelDefinition__NameAssignment_0
    @init {
		int stackSize = keepStackSize();
    }
:
(
{ before(grammarAccess.getModelDefinitionAccess().getNameNameParserRuleCall_0_0()); }
	ruleName{ after(grammarAccess.getModelDefinitionAccess().getNameNameParserRuleCall_0_0()); }
)

;
finally {
	restoreStackSize(stackSize);
}


RULE_NAME_TOKEN : 'a'..'z' ('a'..'z'|'0'..'9')* ('_' ('a'..'z'|'0'..'9')+)*;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : ('//'|'--') ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;


