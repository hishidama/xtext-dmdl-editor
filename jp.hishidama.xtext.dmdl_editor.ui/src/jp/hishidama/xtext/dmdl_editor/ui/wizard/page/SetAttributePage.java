package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import jp.hishidama.xtext.dmdl_editor.ui.wizard.update.AttributeUpdater;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.widgets.Composite;

public abstract class SetAttributePage extends AttributePage {

	public SetAttributePage(String pageName, IProject project) {
		super(pageName, project);
	}

	@Override
	public void createFields(Composite composite) {
		createDefaultButtonField(composite);
		createModelField(composite);
		createPropertyField(composite);
		createNoteField(composite);
	}

	@Override
	protected void validate() {
		boolean complete = !modelText.getText().trim().isEmpty() || !propertyText.getText().trim().isEmpty();
		setPageComplete(complete);
	}

	public abstract AttributeUpdater getUpdater(SelectAddRemovePage selectPage);
}
