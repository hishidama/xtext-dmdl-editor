package jp.hishidama.xtext.dmdl_editor.jdt.hyperlink;

import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.xtext.ui.editor.GlobalURIEditorOpener;

public class DeclaredDmdlHyperlink implements IHyperlink {
	private URI uri;
	private IRegion region;
	private String name;

	public DeclaredDmdlHyperlink(EObject token, IRegion region, String name) {
		this.uri = EcoreUtil.getURI(token);
		this.region = region;
		this.name = name;
	}

	public IRegion getHyperlinkRegion() {
		return region;
	}

	public String getName() {
		return name;
	}

	public String getTypeLabel() {
		return "Open DMDL";
	}

	public String getHyperlinkText() {
		return "Open DMDL";
	}

	public void open() {
		GlobalURIEditorOpener opener = InjectorUtil.getInstance(GlobalURIEditorOpener.class);
		opener.open(uri, true);
	}
}
