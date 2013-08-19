package jp.hishidama.xtext.dmdl_editor.serializer;

import com.google.inject.Inject;
import java.util.List;
import jp.hishidama.xtext.dmdl_editor.services.DMDLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AlternativeAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class DMDLSyntacticSequencer extends AbstractSyntacticSequencer {

	protected DMDLGrammarAccess grammarAccess;
	protected AbstractElementAlias match_AttributeValueArray_CommaKeyword_3_q;
	protected AbstractElementAlias match_Attribute_CommaKeyword_2_1_1_q;
	protected AbstractElementAlias match_Attribute___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q;
	protected AbstractElementAlias match_PropertyFolding_EqualsSignGreaterThanSignKeyword_4_1_or_HyphenMinusGreaterThanSignKeyword_4_0;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (DMDLGrammarAccess) access;
		match_AttributeValueArray_CommaKeyword_3_q = new TokenAlias(false, true, grammarAccess.getAttributeValueArrayAccess().getCommaKeyword_3());
		match_Attribute_CommaKeyword_2_1_1_q = new TokenAlias(false, true, grammarAccess.getAttributeAccess().getCommaKeyword_2_1_1());
		match_Attribute___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getAttributeAccess().getLeftParenthesisKeyword_2_0()), new TokenAlias(false, false, grammarAccess.getAttributeAccess().getRightParenthesisKeyword_2_2()));
		match_PropertyFolding_EqualsSignGreaterThanSignKeyword_4_1_or_HyphenMinusGreaterThanSignKeyword_4_0 = new AlternativeAlias(false, false, new TokenAlias(false, false, grammarAccess.getPropertyFoldingAccess().getEqualsSignGreaterThanSignKeyword_4_1()), new TokenAlias(false, false, grammarAccess.getPropertyFoldingAccess().getHyphenMinusGreaterThanSignKeyword_4_0()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_AttributeValueArray_CommaKeyword_3_q.equals(syntax))
				emit_AttributeValueArray_CommaKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Attribute_CommaKeyword_2_1_1_q.equals(syntax))
				emit_Attribute_CommaKeyword_2_1_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Attribute___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q.equals(syntax))
				emit_Attribute___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_PropertyFolding_EqualsSignGreaterThanSignKeyword_4_1_or_HyphenMinusGreaterThanSignKeyword_4_0.equals(syntax))
				emit_PropertyFolding_EqualsSignGreaterThanSignKeyword_4_1_or_HyphenMinusGreaterThanSignKeyword_4_0(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_AttributeValueArray_CommaKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ','?
	 */
	protected void emit_Attribute_CommaKeyword_2_1_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('(' ')')?
	 */
	protected void emit_Attribute___LeftParenthesisKeyword_2_0_RightParenthesisKeyword_2_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     '=>' | '->'
	 */
	protected void emit_PropertyFolding_EqualsSignGreaterThanSignKeyword_4_1_or_HyphenMinusGreaterThanSignKeyword_4_0(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
