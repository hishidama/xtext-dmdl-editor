package jp.hishidama.xtext.dmdl_editor.jdt.hyperlink;

import jp.hishidama.xtext.dmdl_editor.dmdl.Property;

import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.internal.ui.JavaPlugin;
import org.eclipse.jdt.internal.ui.javaeditor.WorkingCopyManager;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.hyperlink.AbstractHyperlinkDetector;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.texteditor.ITextEditor;

@SuppressWarnings("restriction")
public class OpenKeyDmdlHyperlinkDetector extends AbstractHyperlinkDetector {

	public IHyperlink[] detectHyperlinks(ITextViewer textViewer, IRegion region, boolean canShowMultipleHyperlinks) {
		ITextEditor editor = (ITextEditor) getAdapter(ITextEditor.class);
		if (editor == null) {
			return null;
		}
		ICompilationUnit unit = getCompilationUnit(editor);
		if (unit == null) {
			return null;
		}

		return detectHyperlinks(unit, region);
	}

	protected ICompilationUnit getCompilationUnit(ITextEditor editor) {
		IEditorInput input = editor.getEditorInput();
		WorkingCopyManager manager = JavaPlugin.getDefault().getWorkingCopyManager();
		return manager.getWorkingCopy(input, false);
	}

	private IHyperlink[] detectHyperlinks(ICompilationUnit unit, IRegion region) {
		PropertyStringFinder finder = new PropertyStringFinder(unit, region.getOffset());
		Property property = finder.getProperty();
		if (property != null) {
			return new IHyperlink[] { new DeclaredDmdlHyperlink(property, finder.getRegion()) };
		}

		return null;
	}
}
