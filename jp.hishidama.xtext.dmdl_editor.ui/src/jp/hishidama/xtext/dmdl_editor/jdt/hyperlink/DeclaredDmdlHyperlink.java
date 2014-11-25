package jp.hishidama.xtext.dmdl_editor.jdt.hyperlink;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.xtext.ui.editor.GlobalURIEditorOpener;

public class DeclaredDmdlHyperlink implements IHyperlink {
	private final ModelDefinition model;
	private final Property property;
	private final URI uri;
	private final IRegion region;
	private final String name;

	public DeclaredDmdlHyperlink(ModelDefinition model, Property property, IRegion region) {
		this.model = model;
		this.property = property;
		EObject token = (property != null) ? property : model;
		this.uri = EcoreUtil.getURI(token);
		this.region = region;
		this.name = (property != null) ? property.getName() : model.getName();

	}

	public ModelDefinition getModel() {
		return model;
	}

	public Property getProperty() {
		return property;
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
