package jp.hishidama.xtext.dmdl_editor.jdt.hover;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.jdt.hyperlink.PropertyStringFinder;

import org.eclipse.jdt.core.ICodeAssist;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.internal.ui.text.java.hover.AbstractJavaEditorTextHover;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;

@SuppressWarnings("restriction")
public class DmdlJdtTextHover extends AbstractJavaEditorTextHover {

	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		ICodeAssist assist = super.getCodeAssist();
		if (assist == null || !(assist instanceof ICompilationUnit)) {
			return null;
		}
		ICompilationUnit unit = (ICompilationUnit) assist;
		return getHoverInfo(unit, hoverRegion);
	}

	public String getHoverInfo(ICompilationUnit unit, IRegion hoverRegion) {
		PropertyStringFinder finder = new PropertyStringFinder(unit, hoverRegion.getOffset());
		Property property = finder.getProperty();
		if (property == null) {
			return null;
		}

		StringBuilder sb = new StringBuilder(256);
		ModelUtil.appendTooltipModelName(sb, finder.getModel());
		sb.append("<br>");
		PropertyUtil.appendTooltipPropertyName(sb, property);
		return sb.toString();
	}
}
