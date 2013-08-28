/*
 * first generated by Xtext
 */
package jp.hishidama.xtext.dmdl_editor.formatting;

import jp.hishidama.xtext.dmdl_editor.services.DMDLGrammarAccess;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting.impl.AbstractDeclarativeFormatter;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.parsetree.reconstr.ITokenStream;
import org.eclipse.xtext.xbase.lib.Extension;

import com.google.inject.Inject;

/**
 * This class contains custom formatting description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#formatting on how and
 * when to use it
 * 
 * Also see {@link org.eclipse.xtext.xtext.XtextFormattingTokenSerializer} as an
 * example
 */
public class DMDLFormatter extends AbstractDeclarativeFormatter {
	@Inject
	@Extension
	private DMDLGrammarAccess grammarAccess;

	@Override
	protected void configureFormatting(FormattingConfig c) {
		DMDLFormatterDelegator.configureFormatting(c, grammarAccess);
	}

	@Override
	public ITokenStream createFormatterStream(String indent, ITokenStream out, boolean preserveWhitespaces) {
		return super.createFormatterStream(indent, new DMDLTokenStream(out), preserveWhitespaces);
	}

	@Override
	public ITokenStream createFormatterStream(EObject context, String indent, ITokenStream out,
			boolean preserveWhitespaces) {
		return super.createFormatterStream(context, indent, new DMDLTokenStream(out), preserveWhitespaces);
	}
}
