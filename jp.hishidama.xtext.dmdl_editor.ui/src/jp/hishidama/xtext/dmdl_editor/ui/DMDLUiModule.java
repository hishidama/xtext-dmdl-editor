/*
 * first generated by Xtext
 */
package jp.hishidama.xtext.dmdl_editor.ui;

import jp.hishidama.xtext.dmdl_editor.ui.formatting.DMDLWhitespaceInformationProvider;
import jp.hishidama.xtext.dmdl_editor.ui.highlighting.DMDLHighlightingConfiguration;
import jp.hishidama.xtext.dmdl_editor.ui.highlighting.DMDLLexicalTokenToAttributeIdMapper;
import jp.hishidama.xtext.dmdl_editor.ui.highlighting.DMDLSemanticHighlightingCalculator;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLEditorCallback;
import jp.hishidama.xtext.dmdl_editor.ui.labeling.DMDLHoverProvider;

import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.eclipse.xtext.formatting.IWhitespaceInformationProvider;
import org.eclipse.xtext.ui.editor.hover.IEObjectHoverProvider;
import org.eclipse.xtext.ui.editor.syntaxcoloring.AbstractAntlrTokenToAttributeIdMapper;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.ISemanticHighlightingCalculator;

/**
 * Use this class to register components to be used within the IDE.
 */
public class DMDLUiModule extends jp.hishidama.xtext.dmdl_editor.ui.AbstractDMDLUiModule {
	public DMDLUiModule(AbstractUIPlugin plugin) {
		super(plugin);
	}

	@Override
	public Class<? extends org.eclipse.xtext.ui.editor.IXtextEditorCallback> bindIXtextEditorCallback() {
		return DMDLEditorCallback.class;
	}

	public Class<? extends AbstractAntlrTokenToAttributeIdMapper> bindTokenToAttributeIdMapper() {
		return DMDLLexicalTokenToAttributeIdMapper.class;
	}

	public Class<? extends ISemanticHighlightingCalculator> bindSemanticHighlightingCalculator() {
		return DMDLSemanticHighlightingCalculator.class;
	}

	public Class<? extends IHighlightingConfiguration> bindHighlightingConfiguration() {
		return DMDLHighlightingConfiguration.class;
	}

	@Override
	public Class<? extends IWhitespaceInformationProvider> bindIWhitespaceInformationProvider() {
		return DMDLWhitespaceInformationProvider.class;
	}

	public Class<? extends IEObjectHoverProvider> bindHoverProvider() {
		return DMDLHoverProvider.class;
	}
}
