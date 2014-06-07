package jp.hishidama.xtext.dmdl_editor.jdt.hover;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.PorterUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.jdt.hyperlink.ExporterPropertyStringFinder;
import jp.hishidama.xtext.dmdl_editor.jdt.hyperlink.KeyPropertyStringFinder;

import org.eclipse.jdt.core.ICodeAssist;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IType;
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
		IType type = unit.findPrimaryType();
		if (PorterUtil.isExporter(type)) {
			return getExporterHoverInfo(type, hoverRegion);
		}

		KeyPropertyStringFinder finder = new KeyPropertyStringFinder(unit, hoverRegion.getOffset());
		Property property = finder.getProperty();
		if (property == null) {
			return null;
		}

		return createHoverInfo(finder.getModel(), property);
	}

	private String getExporterHoverInfo(IType type, IRegion hoverRegion) {
		ExporterPropertyStringFinder finder = new ExporterPropertyStringFinder(type, hoverRegion.getOffset());
		Property property = finder.getProperty();
		if (property == null) {
			return null;
		}

		return createHoverInfo(finder.getModel(), property);
	}

	private String createHoverInfo(ModelDefinition model, Property property) {
		StringBuilder sb = new StringBuilder(256);
		ModelUtil.appendTooltipModelName(sb, model);
		sb.append("<br>");
		PropertyUtil.appendTooltipPropertyName(sb, property);
		return sb.toString();
	}
}
