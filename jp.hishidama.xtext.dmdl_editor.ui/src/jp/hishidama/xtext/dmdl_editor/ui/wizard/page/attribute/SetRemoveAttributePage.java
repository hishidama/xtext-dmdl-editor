package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.attribute;

import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.attribute.update.AttributeRemover;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.attribute.update.AttributeUpdater;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

public class SetRemoveAttributePage extends SetAttributePage {

	public SetRemoveAttributePage(IProject project) {
		super("SetRemoveAttributePage", project);
		setTitle("削除する属性の指定");
		setDescription("削除する属性の名前を指定して下さい。");
	}

	@Override
	protected void createNoteArea(Group group) {
		group.setLayout(new FillLayout(SWT.VERTICAL));

		Label label = new Label(group, SWT.NONE);
		label.setText("指定された属性名の属性を削除します。 削除する属性名は複数指定することが出来ます。");
	}

	protected String getDefaultModelAttribute(DMDLAttributeWizardDefinition def, String version) {
		return def.getRemoveModelAttribute(version);
	}

	protected String getDefaultPropertyAttribute(DMDLAttributeWizardDefinition def, String version) {
		return def.getRemovePropertyAttribute(version);
	}

	public AttributeUpdater getUpdater(SelectAddRemovePage selectPage) {
		return new AttributeRemover();
	}
}
