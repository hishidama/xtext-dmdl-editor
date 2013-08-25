package jp.hishidama.xtext.dmdl_editor.ui.highlighting;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

/**
 * 
 * @see DefaultHighlightingConfiguration
 */
public class DMDLHighlightingConfiguration implements IHighlightingConfiguration {

	public static final String COMMENT_ID = DefaultHighlightingConfiguration.COMMENT_ID;
	public static final String DESCRIPTION_ID = "description";
	public static final String ATTRIBUTE_ID = "attribute";
	public static final String MODELTYPE_ID = "modelType";
	public static final String DATATYPE_ID = "dataType";
	public static final String AGGREGATOR_ID = "aggregator";
	public static final String STRING_ID = DefaultHighlightingConfiguration.STRING_ID;
	public static final String NUMBER_ID = DefaultHighlightingConfiguration.NUMBER_ID;
	public static final String BOOLEAN_ID = "boolean";

	public static final String DEFAULT_ID = DefaultHighlightingConfiguration.DEFAULT_ID;
	public static final String PUNCTUATION_ID = DefaultHighlightingConfiguration.PUNCTUATION_ID;
	public static final String INVALID_TOKEN_ID = DefaultHighlightingConfiguration.INVALID_TOKEN_ID;

	@Override
	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", commentTextStyle());
		acceptor.acceptDefaultHighlighting(DESCRIPTION_ID, "Description", stringTextStyle());
		acceptor.acceptDefaultHighlighting(ATTRIBUTE_ID, "Attribute", attributeTextStyle());
		acceptor.acceptDefaultHighlighting(MODELTYPE_ID, "Model Type", keywordBoldTextStyle());
		acceptor.acceptDefaultHighlighting(DATATYPE_ID, "Data Type", keywordTextStyle());
		acceptor.acceptDefaultHighlighting(AGGREGATOR_ID, "Summarized Type", keywordTextStyle());

		acceptor.acceptDefaultHighlighting(STRING_ID, "String", stringTextStyle());
		acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number", numberTextStyle());
		acceptor.acceptDefaultHighlighting(BOOLEAN_ID, "Boolean", numberTextStyle());

		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(PUNCTUATION_ID, "Punctuation character", punctuationTextStyle());
		acceptor.acceptDefaultHighlighting(INVALID_TOKEN_ID, "Invalid Symbol", errorTextStyle());
	}

	protected TextStyle defaultTextStyle() {
		TextStyle textStyle = new TextStyle();
		textStyle.setColor(new RGB(0, 0, 0));
		return textStyle;
	}

	protected TextStyle errorTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		// textStyle.setColor(new RGB(255, 0, 0));
		return textStyle;
	}

	protected TextStyle numberTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(125, 125, 125));
		return textStyle;
	}

	protected TextStyle stringTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(42, 0, 255));
		return textStyle;
	}

	protected TextStyle commentTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(63, 127, 95));
		return textStyle;
	}

	protected TextStyle keywordTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(192, 0, 0));
		return textStyle;
	}

	protected TextStyle keywordBoldTextStyle() {
		TextStyle textStyle = keywordTextStyle().copy();
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	protected TextStyle attributeTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(new RGB(127, 0, 127));
		textStyle.setStyle(SWT.BOLD);
		return textStyle;
	}

	protected TextStyle punctuationTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		return textStyle;
	}
}
