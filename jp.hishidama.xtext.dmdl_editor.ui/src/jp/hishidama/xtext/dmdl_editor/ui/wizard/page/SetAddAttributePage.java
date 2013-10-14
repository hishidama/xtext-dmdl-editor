package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SelectAddRemovePage.AddPattern;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.update.AttributeAppender4Add;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.update.AttributeAppender4Nothing;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.update.AttributeAppender4Replace;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.update.AttributeUpdater;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;

public class SetAddAttributePage extends SetAttributePage {

	public SetAddAttributePage() {
		super("SetAddAttributePage");
		setTitle("追加する属性の指定");
		setDescription("追加する属性の内容を指定して下さい。");
	}

	@Override
	protected void createNoteArea(Group group) {
		group.setLayout(new GridLayout(2, false));

		Label label = new Label(group, SWT.NONE);
		label.setText("追加する属性には右記の変数を指定することが出来ます。\n行を選択してCtrl+Cを押すと変数名をコピーできます。");

		createVariableTable(group, true, true);
	}

	protected String getDefaultModelAttribute(DMDLAttributeWizardDefinition def) {
		return def.getAddModelAttribute();
	}

	protected String getDefaultPropertyAttribute(DMDLAttributeWizardDefinition def) {
		return def.getAddPropertyAttribute();
	}

	@Override
	protected void validate() {
		setErrorMessage(null);
		boolean ok = true;
		ok &= validateParse("モデルの属性", modelText);
		ok &= validateParse("プロパティーの属性", propertyText);
		if (!ok) {
			return;
		}

		super.validate();
	}

	@Override
	public AttributeUpdater getUpdater(SelectAddRemovePage selectPage) {
		AddPattern pattern = selectPage.getAddPattern();
		switch (pattern) {
		case ADD:
			return new AttributeAppender4Add();
		case NOTHING:
			return new AttributeAppender4Nothing();
		case REPLACE:
			return new AttributeAppender4Replace();
		default:
			throw new UnsupportedOperationException("pattern=" + pattern);
		}
	}
}
