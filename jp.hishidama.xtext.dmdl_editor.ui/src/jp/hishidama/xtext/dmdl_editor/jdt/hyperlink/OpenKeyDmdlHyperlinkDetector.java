package jp.hishidama.xtext.dmdl_editor.jdt.hyperlink;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.PorterUtil;
import jp.hishidama.eclipse_plugin.jdt.hyperlink.CompilationUnitHyperlinkDetector;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;

public class OpenKeyDmdlHyperlinkDetector extends CompilationUnitHyperlinkDetector {

	protected IHyperlink[] detectHyperlinks(ICompilationUnit unit, IRegion region) {
		IType type = unit.findPrimaryType();
		if (PorterUtil.isExporter(type)) {
			ExporterPropertyStringFinder finder = new ExporterPropertyStringFinder(type, region.getOffset());
			Property property = finder.getProperty();
			if (property != null) {
				return new IHyperlink[] { new DeclaredDmdlHyperlink(property, finder.getRegion()) };
			}
		}

		KeyPropertyStringFinder finder = new KeyPropertyStringFinder(unit, region.getOffset());
		Property property = finder.getProperty();
		if (property != null) {
			return new IHyperlink[] { new DeclaredDmdlHyperlink(property, finder.getRegion()) };
		}

		return null;
	}
}
