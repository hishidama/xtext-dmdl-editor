package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import java.util.ArrayList;
import java.util.List;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class EditJoinKeyPropertyDialog extends EditDialog {
	private IProject project;
	private DataModelJoinKey row;

	private List<Combo> comboList;

	public EditJoinKeyPropertyDialog(Shell parentShell, IProject project, DataModelJoinKey row) {
		super(parentShell, "結合キー編集", 3);
		this.project = project;
		this.row = row;
	}

	@Override
	protected void createFields(Composite composite) {
		int columns = row.getColumns();
		comboList = new ArrayList<Combo>(columns);
		for (int i = 0; i < columns; i++) {
			String modelName = row.getColumnText(i);
			String propName = row.get(modelName);
			String value = null;

			ModelDefinition model = ModelUiUtil.findModel(project, modelName);
			List<Property> properties = ModelUtil.getProperties(model);
			String[] ss = new String[properties.size()];
			for (int j = 0; j < properties.size(); j++) {
				Property p = properties.get(j);
				String desc = p.getDescription();
				if (StringUtil.isEmpty(desc)) {
					ss[j] = p.getName();
				} else {
					ss[j] = p.getName() + " " + desc;
				}
				if (p.getName().equals(propName)) {
					value = ss[j];
				}
			}

			String label;
			String desc = model.getDescription();
			if (StringUtil.isEmpty(desc)) {
				label = modelName;
			} else {
				label = modelName + " " + desc;
			}
			Combo combo = createComboField(composite, label, ss);
			comboList.add(combo);
			combo.setText(nonNull(value));
		}
	}

	@Override
	protected void refresh() {
		refreshOkButton();
	}

	@Override
	protected boolean validate() {
		for (Combo combo : comboList) {
			if (StringUtil.isEmpty(combo.getText())) {
				return false;
			}
		}
		return true;
	}

	@Override
	protected void okPressed() {
		for (int i = 0; i < comboList.size(); i++) {
			String name = row.getColumnText(i);
			String value = comboList.get(i).getText();
			int n = value.indexOf(' ');
			if (n >= 0) {
				value = value.substring(0, n);
			}
			row.set(name, value);
		}

		super.okPressed();
	}
}
