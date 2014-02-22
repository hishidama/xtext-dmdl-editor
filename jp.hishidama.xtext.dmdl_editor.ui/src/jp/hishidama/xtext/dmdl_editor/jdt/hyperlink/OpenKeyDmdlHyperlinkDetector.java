package jp.hishidama.xtext.dmdl_editor.jdt.hyperlink;

import jp.hishidama.eclipse_plugin.jdt.hyperlink.CompilationUnitHyperlinkDetector;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;

public class OpenKeyDmdlHyperlinkDetector extends CompilationUnitHyperlinkDetector {

	protected IHyperlink[] detectHyperlinks(ICompilationUnit unit, IRegion region) {
		PropertyStringFinder finder = new PropertyStringFinder(unit, region.getOffset());
		Property property = finder.getProperty();
		if (property != null) {
			return new IHyperlink[] { new DeclaredDmdlHyperlink(property, finder.getRegion()) };
		}

		return null;
	}
}
