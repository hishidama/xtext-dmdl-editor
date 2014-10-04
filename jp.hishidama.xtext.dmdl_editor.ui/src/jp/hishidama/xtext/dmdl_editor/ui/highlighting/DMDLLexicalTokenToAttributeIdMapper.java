package jp.hishidama.xtext.dmdl_editor.ui.highlighting;

import java.util.regex.Pattern;

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;

/**
 * @see DefaultAntlrTokenToAttributeIdMapper
 */
public class DMDLLexicalTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {
	/** 記号類 */
	private static final Pattern PUNCTUATION = Pattern.compile("\\p{Punct}*");

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if ("'@'".equals(tokenName)) {
			return DMDLHighlightingConfiguration.ATTRIBUTE_ID;
		}
		if (PUNCTUATION.matcher(tokenName).matches()) {
			return DMDLHighlightingConfiguration.PUNCTUATION_ID;
		}

		if (isKeyword(tokenName)) {
			return DMDLHighlightingConfiguration.DATATYPE_ID;
		}
		if ("RULE_STRING".equals(tokenName)) {
			return DMDLHighlightingConfiguration.STRING_ID;
		}
		if ("RULE_INT".equals(tokenName) || "RULE_DECIMAL".equals(tokenName)) {
			return DMDLHighlightingConfiguration.NUMBER_ID;
		}
		if ("RULE_ML_COMMENT".equals(tokenName) || "RULE_SL_COMMENT".equals(tokenName)) {
			return DMDLHighlightingConfiguration.COMMENT_ID;
		}
		return DMDLHighlightingConfiguration.DEFAULT_ID;
	}

	private boolean isKeyword(String tokenName) {
		if (tokenName.startsWith("'") && tokenName.endsWith("'")) {
			for (int i = 1; i < tokenName.length() - 1; i++) {
				char c = tokenName.charAt(i);
				if (!Character.isUpperCase(c)) {
					return false;
				}
			}
			return true;
		}
		return false;
	}
}
