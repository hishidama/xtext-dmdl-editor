package jp.hishidama.xtext.dmdl_editor.ui.highlighting;

import java.util.regex.Pattern;

import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;

/**
 * @see DefaultAntlrTokenToAttributeIdMapper
 */
public class DMDLLexicalTokenToAttributeIdMapper extends AbstractAntlrTokenToAttributeIdMapper {
	/** 記号類 */
	private static final Pattern PUNCTUATION = Pattern.compile("\\p{Punct}*");

	@Override
	protected String calculateId(String tokenName, int tokenType) {
		if (PUNCTUATION.matcher(tokenName).matches()) {
			return DefaultHighlightingConfiguration.PUNCTUATION_ID;
		}
		if ("'TRUE'".equals(tokenName) || "'FALSE'".equals(tokenName)) {
			return DefaultHighlightingConfiguration.NUMBER_ID;
		}
		if (isKeyword(tokenName)) {
			return DefaultHighlightingConfiguration.KEYWORD_ID;
		}
		if ("RULE_STRING".equals(tokenName)) {
			return DefaultHighlightingConfiguration.STRING_ID;
		}
		if ("RULE_INT".equals(tokenName) || "RULE_DECIMAL".equals(tokenName)) {
			return DefaultHighlightingConfiguration.NUMBER_ID;
		}
		if ("RULE_ML_COMMENT".equals(tokenName) || "RULE_SL_COMMENT".equals(tokenName)) {
			return DefaultHighlightingConfiguration.COMMENT_ID;
		}
		return DefaultHighlightingConfiguration.DEFAULT_ID;
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
