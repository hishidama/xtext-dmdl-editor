package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import java.text.MessageFormat;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.util.StringUtil;
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

public class SelectOperatorInputModelPage extends SelectOperatorModelPage<OperatorInputModelRow> {

	private final boolean hasList;
	private final boolean hasKey;
	private final boolean hasOrder;

	public SelectOperatorInputModelPage(IProject project, OperatorType opType, boolean hasList, boolean hasKey, boolean hasOrder) {
		super("SelectOperatorInputModelPage", project);

		setTitle(MessageFormat.format("{0}の入力モデルの指定", opType.getName()));
		setDescription("演算子の入力となるデータモデルを選択して下さい。");

		this.hasList = hasList;
		this.hasKey = hasKey;
		this.hasOrder = hasOrder;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		{
			composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			composite.setLayout(new GridLayout(2, false));
		}

		createLabel(composite, "data model:");
		table = initializeModelTable(new ModelTable(composite));
		table.addColumn("role", 64, SWT.NONE);
		table.addColumn("generics name", 32, SWT.NONE);
		table.addColumn("name", 128, SWT.NONE);
		table.addColumn("model name", 128, SWT.NONE);
		table.addColumn("model description", 128, SWT.NONE);
		if (hasKey) {
			table.addColumn("@Key.group", 128, SWT.NONE);
			if (hasOrder) {
				table.addColumn("@Key.order", 128, SWT.NONE);
			}
		}

		createLabel(composite, "");
		Composite field = new Composite(composite, SWT.NONE);
		// field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		field.setLayout(new FillLayout(SWT.HORIZONTAL));
		table.createButtonArea(field);

		for (int i = 0; i < roleList.size(); i++) {
			OperatorInputModelRow row = new OperatorInputModelRow();
			table.addItem(row);
		}

		table.refresh();

		return composite;
	}

	protected ModelTable initializeModelTable(ModelTable table) {
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
		return table;
	}

	protected class ModelTable extends ModifiableTable<OperatorInputModelRow> {

		public ModelTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		}

		@Override
		protected String getText(OperatorInputModelRow element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return getRoleName(element);
			case 1:
				return element.genericsName;
			case 2:
				return element.name;
			case 3:
				return element.modelName;
			case 4:
				return element.modelDescription;
			case 5:
				return element.getKeyText();
			case 6:
				return element.getOrderText();
			default:
				throw new UnsupportedOperationException("columnIndex=" + columnIndex);
			}
		}

		@Override
		protected void doAdd() {
			DmdlModelMultiSelectionDialog dialog = new DmdlModelMultiSelectionDialog(getShell(), project);
			if (dialog.open() != Window.OK) {
				return;
			}

			List<ModelDefinition> list = dialog.getSelectedDataModelList();
			for (ModelDefinition model : list) {
				String modelName = model.getName();

				OperatorInputModelRow row = createElement();
				row.name = StringUtil.toLowerCamelCase(modelName);
				row.setModelClassName(ModelUiUtil.getModelClassName(project, modelName));
				row.modelName = modelName;
				row.modelDescription = ModelUtil.getDecodedDescriptionText(model);
				row.projective = ModelUtil.isProjective(model);
				if (row.projective) {
					row.genericsName = modelName.substring(0, 1).toUpperCase();
				}
				super.doAdd(row);
			}
		}

		@Override
		protected OperatorInputModelRow createElement() {
			return new OperatorInputModelRow();
		}

		@Override
		protected void editElement(OperatorInputModelRow element) {
			OperatorInputModelDialog dialog = createOperatorInputModelDialog(element);
			dialog.open();
		}

		@Override
		public void refresh() {
			super.refresh();
			validate(isVisible());
		}
	}

	protected OperatorInputModelDialog createOperatorInputModelDialog(OperatorInputModelRow element) {
		return new OperatorInputModelDialog(getShell(), project, getRoleName(element), element, hasList, hasKey, hasOrder, joinOnly);
	}
}
