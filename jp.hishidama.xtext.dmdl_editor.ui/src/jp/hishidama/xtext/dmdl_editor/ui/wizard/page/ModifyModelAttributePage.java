package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

public class ModifyModelAttributePage extends AttributePage {

	private String attribute;

	public ModifyModelAttributePage() {
		super("SetModelAttributePage");
		setTitle("データモデルの属性の指定");
		setDescription("データモデルの属性の内容を指定して下さい。");
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	@Override
	public void createFields(Composite composite) {
		createDefaultButtonField(composite);
		createModelField(composite);
		createNoteField(composite);

		modelText.setText(StringUtil.nonNull(attribute));
	}

	@Override
	protected void createNoteArea(Group group) {
		group.setLayout(new GridLayout(2, false));

		Label label = new Label(group, SWT.NONE);
		label.setText("右記の変数を指定することが出来ます。\n行を選択してCtrl+Cを押すと変数名をコピーできます。");

		createVariableTable(group, true, false);
	}

	@Override
	protected String getDefaultModelAttribute(DMDLAttributeWizardDefinition def) {
		return def.getAddModelAttribute();
	}

	@Override
	protected String getDefaultPropertyAttribute(DMDLAttributeWizardDefinition def) {
		throw new UnsupportedOperationException();
	}

	@Override
	protected void validate() {
		if (!validateParse("モデルの属性", modelText)) {
			return;
		}
		setErrorMessage(null);
		setPageComplete(true);
	}
}
