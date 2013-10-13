package jp.hishidama.xtext.dmdl_editor.ui.formatting;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.formatting.ILineSeparatorInformation;
import org.eclipse.xtext.ui.editor.formatting.PreferenceStoreWhitespaceInformationProvider;

public class DMDLWhitespaceInformationProvider extends PreferenceStoreWhitespaceInformationProvider {

	@Override
	public ILineSeparatorInformation getLineSeparatorInformation(URI uri) {
		return new ILineSeparatorInformation() {
			public String getLineSeparator() {
				return "\n";
			}
		};
	}
}
