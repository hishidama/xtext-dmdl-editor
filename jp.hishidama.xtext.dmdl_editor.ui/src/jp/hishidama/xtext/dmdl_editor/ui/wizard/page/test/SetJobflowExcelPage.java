package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowParameter;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.NewJobflowTestClassWizard;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class SetJobflowExcelPage extends EditWizardPage {

	private IJavaProject javaProject;
	private ExcelTable table;

	private IType classUnderTest;
	private List<FlowParameter> parameterList;

	public SetJobflowExcelPage() {
		super("SetJobflowExcelPage");

		setTitle("Select Excel File");
		setDescription("テストデータのExcelファイルのシート名を入力して下さい。\nチェックを付けた行は、雛形Excelファイルをsrc/test/resourcesにコピーします。");
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());

		int nColumns = 2;

		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);

		createLabel(composite, "Excel file:");
		table = new ExcelTable(composite);
		table.addColumn("in/out", 48 + 16, SWT.NONE);
		table.addColumn("name", 128, SWT.NONE);
		table.addColumn("model name", 128, SWT.NONE);
		table.addColumn("model description", 128, SWT.NONE);
		table.addColumn("excel file", 128, SWT.NONE);
		table.addColumn("data sheet name", 128, SWT.NONE);
		table.addColumn("rule sheet name", 128, SWT.NONE);

		createLabel(composite, "");
		Composite field = new Composite(composite, SWT.NONE);
		// field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		field.setLayout(new FillLayout(SWT.HORIZONTAL));
		table.createCheckButtonArea(field);
		table.createButtonArea(field);

		table.refresh();
		return composite;
	}

	private boolean visible;

	@Override
	public void setVisible(boolean visible) {
		this.visible = visible;
		super.setVisible(visible);
		if (visible) {
			this.javaProject = getWizard().getJavaProject();
			initializeTable();
		}
	}

	@Override
	public NewJobflowTestClassWizard getWizard() {
		return (NewJobflowTestClassWizard) super.getWizard();
	}

	private void initializeTable() {
		IType type = getWizard().getClassUnderTest();
		if (type == null) {
			return;
		}
		if (classUnderTest != null && type.getFullyQualifiedName().equals(classUnderTest.getFullyQualifiedName())) {
			return;
		}
		classUnderTest = type;

		table.removeAll();
		parameterList = FlowUtil.getFlowParameters(type);
		for (FlowParameter parameter : parameterList) {
			if (!parameter.isPort()) {
				continue;
			}

			TestExcelRow row = new TestExcelRow();
			row.in = parameter.isIn();
			row.name = parameter.getPorterName();
			row.modelClassName = parameter.getModelClassName();
			ModelDefinition model = ModelUiUtil.findModelByClass(javaProject.getProject(), row.modelClassName);
			if (model != null) {
				row.modelName = model.getName();
				row.modelDescription = ModelUtil.getDecodedDescription(model);
				row.excelDstFileName = row.modelName + ".xls";
			}
			if (row.in) {
				row.sheetName = "input";
			} else {
				row.sheetName = "output";
				row.ruleName = "rule";
			}
			table.addItem(row);
		}
		table.refresh();
	}

	@Override
	protected String validate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPageComplete() {
		return isCurrentPage() && super.isPageComplete();
	}

	protected class ExcelTable extends ModifiableTable<TestExcelRow> {

		public ExcelTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION | SWT.CHECK);
		}

		@Override
		protected String getText(TestExcelRow element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return element.getIn();
			case 1:
				return element.name;
			case 2:
				return element.modelName;
			case 3:
				return element.modelDescription;
			case 4:
				return element.excelDstFileName;
			case 5:
				return element.sheetName;
			case 6:
				return element.ruleName;
			default:
				throw new UnsupportedOperationException("columnIndex=" + columnIndex);
			}
		}

		@Override
		protected void createAddButton(Composite field) {
			// no create
		}

		@Override
		protected void createDeleteButton(Composite field) {
			// no create
		}

		@Override
		protected TestExcelRow createElement() {
			return new TestExcelRow();
		}

		@Override
		protected void editElement(TestExcelRow element) {
			EditTestExcelDialog dialog = new EditTestExcelDialog(getShell(), element);
			dialog.open();
		}

		@Override
		public void refresh() {
			super.refresh();
			validate(visible);
		}
	}

	public List<TestExcelRow> getExcelList() {
		List<TestExcelRow> list = table.getElementList();
		for (int i = 0; i < list.size(); i++) {
			list.get(i).copy = table.getChecked(i);
		}
		return list;
	}
}
