package jp.hishidama.xtext.dmdl_editor.jdt.hyperlink;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.PorterUtil;
import jp.hishidama.eclipse_plugin.jdt.hyperlink.CompilationUnitHyperlinkDetector;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.texteditor.ITextEditor;

public class OpenKeyDmdlHyperlinkDetector extends CompilationUnitHyperlinkDetector {

	public IHyperlink[] detectHyperlinks(ITextEditor editor, int offset) {
		ICompilationUnit unit = getCompilationUnit(editor);
		if (unit == null) {
			return null;
		}

		IRegion region = new Region(offset, 0);
		return detectHyperlinks(unit, region);
	}

	protected IHyperlink[] detectHyperlinks(ICompilationUnit unit, IRegion region) {
		IType type = unit.findPrimaryType();
		if (PorterUtil.isExporter(type)) {
			ExporterPropertyStringFinder finder = new ExporterPropertyStringFinder(type, region.getOffset());
			Property property = finder.getProperty();
			if (property != null) {
				ModelDefinition model = finder.getModel();
				return new IHyperlink[] { new DeclaredDmdlHyperlink(model, property, finder.getRegion()) };
			}
		}

		KeyPropertyStringFinder finder = new KeyPropertyStringFinder(unit, region.getOffset());
		Property property = finder.getProperty();
		if (property != null) {
			ModelDefinition model = finder.getModel();
			return new IHyperlink[] { new DeclaredDmdlHyperlink(model, property, finder.getRegion()) };
		}

		return null;
	}
}
