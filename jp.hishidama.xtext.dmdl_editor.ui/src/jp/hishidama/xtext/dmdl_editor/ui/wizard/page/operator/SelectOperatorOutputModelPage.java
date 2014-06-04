package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.dialog.DmdlModelMultiSelectionDialog;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class SelectOperatorOutputModelPage extends EditWizardPage {

	private final IProject project;
	private boolean joinOnly;
	private boolean summarizeOnly;
	private List<String> roleList = new ArrayList<String>();

	private ModelTable table;

	public SelectOperatorOutputModelPage(IProject project, OperatorType opType) {
		this(project, opType, null);
	}

	public SelectOperatorOutputModelPage(IProject project, OperatorType opType, String description) {
		super("SelectOperatorOutputModelPage");

		setTitle(MessageFormat.format("{0}の出力モデルの指定", opType.getName()));
		if (description == null) {
			description = "演算子の出力となるデータモデルを選択して下さい。";
		}
		setDescription(description);

		this.project = project;
	}

	public void setJoinModelOnly() {
		this.joinOnly = true;
	}

	public void setSummarizeModelOnly() {
		this.summarizeOnly = true;
	}

	public void addRole(String role) {
		roleList.add(role);
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		{
			composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			composite.setLayout(new GridLayout(2, false));
		}

		createLabel(composite, "data model:");
		table = new ModelTable(composite);
		switch (roleList.size()) {
		case 0:
			break;
		case 1:
			table.setEnableButton(false, true, false, false);
			break;
		default:
			table.setEnableButton(false, true, true, false);
			break;
		}
		table.addColumn("role", 64, SWT.NONE);
		table.addColumn("name", 128, SWT.NONE);
		table.addColumn("model name", 128, SWT.NONE);
		table.addColumn("model description", 128, SWT.NONE);

		createLabel(composite, "");
		Composite field = new Composite(composite, SWT.NONE);
		// field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		field.setLayout(new FillLayout(SWT.HORIZONTAL));
		table.createButtonArea(field);

		for (int i = 0; i < roleList.size(); i++) {
			OperatorOutputModelRow row = new OperatorOutputModelRow();
			table.addItem(row);
		}

		table.refresh();

		return composite;
	}

	protected class ModelTable extends ModifiableTable<OperatorOutputModelRow> {

		public ModelTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		}

		@Override
		protected String getText(OperatorOutputModelRow element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return getRoleName(element);
			case 1:
				return element.name;
			case 2:
				return element.modelName;
			case 3:
				return element.modelDescription;
			default:
				throw new UnsupportedOperationException("columnIndex=" + columnIndex);
			}
		}

		@Override
		protected void doAdd() {
			DmdlModelMultiSelectionDialog dialog = new DmdlModelMultiSelectionDialog(getShell(), project);
			if (joinOnly) {
				dialog.setJoinModelOnly();
			} else if (summarizeOnly) {
				dialog.setSummarizeModelOnly();
			}
			if (dialog.open() != Window.OK) {
				return;
			}

			List<ModelDefinition> list = dialog.getSelectedDataModelList();
			for (ModelDefinition model : list) {
				String modelName = model.getName();

				OperatorOutputModelRow row = createElement();
				row.name = StringUtil.toLowerCamelCase(modelName);
				row.modelClassName = ModelUiUtil.getModelClassName(project, modelName);
				row.modelName = modelName;
				row.modelDescription = ModelUtil.getDecodedDescriptionText(model);
				super.doAdd(row);
			}
		}

		@Override
		protected OperatorOutputModelRow createElement() {
			return new OperatorOutputModelRow();
		}

		@Override
		protected void editElement(OperatorOutputModelRow element) {
			OperatorOutputModelDialog dialog = new OperatorOutputModelDialog(getShell(), project, getRoleName(element),
					element, joinOnly, summarizeOnly);
			dialog.open();
		}

		@Override
		public void refresh() {
			super.refresh();
			validate(isVisible());
		}
	}

	String getRoleName(OperatorOutputModelRow row) {
		if (!roleList.isEmpty()) {
			int n = table.getIndex(row);
			if (n >= 0 && n < roleList.size()) {
				return roleList.get(n);
			}
		}
		return null;
	}

	private boolean first = true;

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible && first) {
			first = false;
			if (roleList.size() >= 1) {
				table.setSelection(0);
			}
		}
	}

	@Override
	protected String validate() {
		int i = 1;
		for (OperatorOutputModelRow row : table.getElementList()) {
			if (StringUtil.isEmpty(row.name)) {
				return MessageFormat.format("変数名を入力して下さい。（{0,number,#}行目）", i);
			}
			if (StringUtil.isEmpty(row.modelName)) {
				return MessageFormat.format("モデルを選択して下さい。（{0,number,#}行目）", i);
			}
			i++;
		}
		return null;
	}

	public List<OperatorOutputModelRow> getElementList() {
		return table.getElementList();
	}
}
