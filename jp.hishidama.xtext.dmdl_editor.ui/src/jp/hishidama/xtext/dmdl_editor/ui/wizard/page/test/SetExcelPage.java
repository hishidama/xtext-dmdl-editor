package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowParameter;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;
import jp.hishidama.eclipse_plugin.wizard.page.NewTestClassWizardPage;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLVariableTableUtil;

import org.apache.poi.ss.util.WorkbookUtil;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class SetExcelPage extends EditWizardPage {
	private static final String KEY_EXCEL_NAME = "SetExcelPage.EXCEL_NAME";
	private static final String KEY_DATA_NAME = "SetExcelPage.DATA_SHEET_NAME";
	private static final String KEY_RULE_NAME = "SetExcelPage.RULE_SHEET_NAME";

	private NewTestClassWizardPage classPage;
	private ExcelTable table;
	private Text excelNameText;
	private Text dataSheetText;
	private Text ruleSheetText;

	private IType classUnderTest;
	private List<FlowParameter> parameterList;

	public SetExcelPage(NewTestClassWizardPage classPage) {
		super("SetExcelPage");
		this.classPage = classPage;

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
		{
			createLabel(composite, "");
			Composite field = new Composite(composite, SWT.NONE);
			// field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			field.setLayout(new FillLayout(SWT.HORIZONTAL));
			table.createCheckButtonArea(field);
			table.createButtonArea(field);
		}
		{
			createLabel(composite, "");
			Composite field = new Composite(composite, SWT.NONE);
			field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			field.setLayout(new GridLayout(6, false));
			table.createReplaceButtonArea(field);
		}
		table.refresh();
		return composite;
	}

	private boolean visible;

	@Override
	public void setVisible(boolean visible) {
		this.visible = visible;
		super.setVisible(visible);
		if (visible) {
			initializeTable();
		}
	}

	protected IProject getProject() {
		return classPage.getJavaProject().getProject();
	}

	private void initializeTable() {
		IType type = classPage.getClassUnderTest();
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
			if (row.name == null) {
				row.name = parameter.getName();
			}
			row.modelClassName = parameter.getModelClassName();
			ModelDefinition model = ModelUiUtil.findModelByClass(getProject(), row.modelClassName);
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

		excelNameReplacer.replace(getDefaultExcelName(), true);
		sheetNameReplacer.replace(getDefaultDataSheetName(), true);
		ruleNameReplacer.replace(getDefaultRuleSheetName(), true);

		table.refresh();
	}

	@Override
	protected String validate() {
		List<TestExcelRow> list = table.getElementList();
		Map<String, String> map = new HashMap<String, String>(list.size() * 2);
		for (TestExcelRow row : list) {
			if (row.in) {
				String sheetName = row.sheetName;
				if (StringUtil.nonEmpty(sheetName)) {
					String message = validateSheetName(sheetName);
					if (message != null) {
						return message;
					}
					message = validateDuplicate(map, row, row.sheetName, "in");
					if (message != null) {
						return message;
					}
				}
			} else {
				{
					String sheetName = row.sheetName;
					if (StringUtil.nonEmpty(sheetName)) {
						String message = validateSheetName(sheetName);
						if (message != null) {
							return message;
						}
						message = validateDuplicate(map, row, sheetName, "data");
						if (message != null) {
							return message;
						}
					}
				}
				{
					String sheetName = row.ruleName;
					if (StringUtil.nonEmpty(sheetName)) {
						String message = validateSheetName(sheetName);
						if (message != null) {
							return message;
						}
						message = validateDuplicate(map, row, sheetName, "rule");
						if (message != null) {
							return message;
						}
					}
				}
			}
		}
		return null;
	}

	private static String validateSheetName(String sheetName) {
		if (!sheetName.isEmpty()) {
			try {
				WorkbookUtil.validateSheetName(sheetName);
			} catch (IllegalArgumentException e) {
				return MessageFormat.format("invalid sheet name. name={0}", sheetName);
			}
		}
		return null;
	}

	private static String validateDuplicate(Map<String, String> map, TestExcelRow row, String sheetName, String role) {
		String excelName = row.excelDstFileName.trim();
		sheetName = sheetName.trim();
		String key = String.format("%s#%s", excelName, sheetName);
		String value = String.format("%s#%s", row.modelName, role);
		String exists = map.get(key);
		if (exists != null && !exists.equals(value)) {
			return MessageFormat.format("duplicate sheet. excelName={0}, sheetName={1}", excelName, sheetName);
		}
		map.put(key, value);
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

		public void createReplaceButtonArea(Composite field) {
			{
				excelNameText = new Text(field, SWT.SINGLE | SWT.BORDER);
				GridDataFactory.fillDefaults().grab(true, false).applyTo(excelNameText);
				excelNameText.setText(getDefaultExcelName());
				Button button = createPushButton(field, "replace excel name");
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						excelNameReplacer.replace(excelNameText.getText(), false);
						refresh();
					}
				});
				selectionButton.add(button);
			}
			{
				dataSheetText = new Text(field, SWT.SINGLE | SWT.BORDER);
				GridDataFactory.fillDefaults().grab(true, false).applyTo(dataSheetText);
				dataSheetText.setText(getDefaultDataSheetName());
				Button button = createPushButton(field, "replace data sheet name");
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						sheetNameReplacer.replace(dataSheetText.getText(), false);
						refresh();
					}
				});
				selectionButton.add(button);
			}
			{
				ruleSheetText = new Text(field, SWT.SINGLE | SWT.BORDER);
				GridDataFactory.fillDefaults().grab(true, false).applyTo(ruleSheetText);
				ruleSheetText.setText(getDefaultRuleSheetName());
				Button button = createPushButton(field, "replace rule sheet name");
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						ruleNameReplacer.replace(ruleSheetText.getText(), false);
						refresh();
					}
				});
				selectionButton.add(button);
			}
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

	private abstract class Replacer {

		public void replace(String pattern, boolean all) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("className", StringUtil.getSimpleName(classPage.getClassUnderTestText()));
			map.put("testClassName", StringUtil.getSimpleName(classPage.getTypeName()));

			List<TestExcelRow> list = table.getElementList();
			if (all) {
				int i = 0;
				for (TestExcelRow row : list) {
					replaceRow(row, pattern, map, i++);
				}
			} else {
				int[] index = table.getSelectionIndices();
				for (int i = 0; i < index.length; i++) {
					TestExcelRow row = list.get(index[i]);
					replaceRow(row, pattern, map, i);
				}
			}
		}

		private void replaceRow(TestExcelRow row, String pattern, Map<String, String> map, int i) {
			map.put("in", Boolean.toString(row.in));
			map.put("name", row.name);
			map.put("modelName", row.modelName);
			map.put("modelDescription", row.modelDescription);
			map.put("number", Integer.toString(i));
			String s = DMDLVariableTableUtil.replaceVariable(pattern, map);
			setRow(row, s);
		}

		protected abstract void setRow(TestExcelRow row, String value);
	}

	private Replacer excelNameReplacer = new Replacer() {
		@Override
		protected void setRow(TestExcelRow row, String value) {
			row.excelDstFileName = value;
		}
	};
	private Replacer sheetNameReplacer = new Replacer() {
		@Override
		protected void setRow(TestExcelRow row, String value) {
			row.sheetName = value;
		}
	};
	private Replacer ruleNameReplacer = new Replacer() {
		@Override
		protected void setRow(TestExcelRow row, String value) {
			if (!row.in) {
				row.ruleName = value;
			}
		}
	};

	protected String getDefaultExcelName() {
		return getDefaultText(KEY_EXCEL_NAME, "$(testClassName).xls");
	}

	protected String getDefaultDataSheetName() {
		return getDefaultText(KEY_DATA_NAME, "$(name)");
	}

	protected String getDefaultRuleSheetName() {
		return getDefaultText(KEY_RULE_NAME, "$(name)_rule");
	}

	protected String getDefaultText(String key, String defaultText) {
		IDialogSettings settings = getDialogSettings();
		String value = settings.get(key);
		if (value != null) {
			return value;
		}
		return defaultText;
	}

	public void saveDialogSettings() {
		IDialogSettings settings = getDialogSettings();
		settings.put(KEY_EXCEL_NAME, excelNameText.getText());
		settings.put(KEY_DATA_NAME, dataSheetText.getText());
		settings.put(KEY_RULE_NAME, ruleSheetText.getText());
	}

	public List<TestExcelRow> getExcelList() {
		List<TestExcelRow> list = table.getElementList();
		for (int i = 0; i < list.size(); i++) {
			list.get(i).copy = table.getChecked(i);
		}
		return list;
	}

	public List<FlowParameter> getParameterList() {
		return parameterList;
	}
}
