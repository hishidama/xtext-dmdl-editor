package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;

import org.apache.poi.ss.util.WorkbookUtil;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class SelectExcelSheetPage extends EditWizardPage {
	private static final String KEY_INDEX_NAME = "SelectExcelSheetPage.INDEX_NAME";

	private SetExcelNamePage namePage;

	private Text indexText;
	private SheetTable table;

	public SelectExcelSheetPage(SetExcelNamePage namePage) {
		super("SelectExcelSheetPage");
		this.namePage = namePage;

		setTitle("Select Template Excel Sheet");
		setDescription("雛形Excelファイルを作成するシートにチェックを付けて下さい。\n（雛形Excelファイルはsrc/test/resourcesに作られます）");
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());

		int nColumns = 2;

		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);

		{
			Label label = createLabel(composite, "index sheet name:");
			label.setToolTipText("Excelファイルに作成する目次ページのシート名\n空にすると目次ページを作成しません。");
			indexText = createText(composite, 1);
			indexText.setText(getDefaultIndexSheetName());
		}

		createLabel(composite, "Excel sheet:");
		table = new SheetTable(composite);
		table.addColumn("excel file", 128 + 96 + 16, SWT.NONE);
		table.addColumn("sheet name", 128 + 64, SWT.NONE);
		table.addColumn("type", 64, SWT.NONE);
		table.addColumn("model name", 128, SWT.NONE);
		table.addColumn("model description", 128, SWT.NONE);
		{
			createLabel(composite, "");
			Composite field = new Composite(composite, SWT.NONE);
			// field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			field.setLayout(new FillLayout(SWT.HORIZONTAL));
			table.createCheckButtonArea(field);
			table.createButtonArea(field);
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
		return namePage.getProject();
	}

	private void initializeTable() {
		table.removeAll();

		Set<String> set = new HashSet<String>();

		List<TestExcelNameRow> nameList = namePage.getExcelList();
		for (TestExcelNameRow nameRow : nameList) {
			TestSheetRow dataRow = createRow(nameRow, true);
			if (isAddRow(dataRow, set)) {
				table.addItem(dataRow);
			}
		}
		for (TestExcelNameRow nameRow : nameList) {
			TestSheetRow dataRow = createRow(nameRow, false);
			if (isAddRow(dataRow, set)) {
				table.addItem(dataRow);
			}
		}

		table.refresh();
		table.setCheckedAll(true);
	}

	private TestSheetRow createRow(TestExcelNameRow nameRow, boolean data) {
		TestSheetRow row = new TestSheetRow();
		row.excelDstFileName = nameRow.excelDstFileName;
		if (data) {
			row.sheetName = nameRow.sheetName;
			row.sheetType = "data";
		} else {
			row.sheetName = nameRow.ruleName;
			row.sheetType = "rule";
		}
		row.modelClassName = nameRow.modelClassName;
		row.modelName = nameRow.modelName;
		row.modelDescription = nameRow.modelDescription;

		if (row.sheetName == null || row.sheetName.isEmpty()) {
			return null;
		}

		return row;
	}

	private boolean isAddRow(TestSheetRow row, Set<String> set) {
		if (row == null) {
			return false;
		}
		String key = String.format("%s#%s", row.excelDstFileName, row.sheetName);
		if (set.contains(key)) {
			return false;
		}
		set.add(key);
		return true;
	}

	@Override
	protected String validate() {
		String sheetName = indexText.getText().trim();
		if (StringUtil.nonEmpty(sheetName)) {
			String message = validateSheetName(sheetName);
			if (message != null) {
				return message;
			}
			for (TestSheetRow row : getSheetList()) {
				if (sheetName.equals(row.sheetName)) {
					return "duplicate sheet name.";
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
				return MessageFormat.format("invalid sheet name. reason={1}", sheetName, e.getMessage());
			}
		}
		return null;
	}

	@Override
	public boolean isPageComplete() {
		return isCurrentPage() && super.isPageComplete();
	}

	protected class SheetTable extends ModifiableTable<TestSheetRow> {

		public SheetTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION | SWT.CHECK);
		}

		@Override
		protected String getText(TestSheetRow element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return element.excelDstFileName;
			case 1:
				return element.sheetName;
			case 2:
				return element.sheetType;
			case 3:
				return element.modelName;
			case 4:
				return element.modelDescription;
			default:
				throw new UnsupportedOperationException("columnIndex=" + columnIndex);
			}
		}

		@Override
		protected void createAddButton(Composite field) {
			// no create
		}

		@Override
		protected void createEditButton(Composite field) {
			// no create
		}

		@Override
		protected void createDeleteButton(Composite field) {
			// no create
		}

		@Override
		protected TestSheetRow createElement() {
			return new TestSheetRow();
		}

		@Override
		protected void editElement(TestSheetRow element) {
			// do nothing
		}

		@Override
		public void refresh() {
			super.refresh();
			validate(visible);
		}
	}

	private String getDefaultIndexSheetName() {
		IDialogSettings settings = getDialogSettings();
		String value = settings.get(KEY_INDEX_NAME);
		if (value != null) {
			return value;
		}
		return "index";
	}

	public void saveDialogSettings() {
		IDialogSettings settings = getDialogSettings();
		settings.put(KEY_INDEX_NAME, indexText.getText());
	}

	public String getIndexSheetName() {
		String name = indexText.getText().trim();
		if (name.isEmpty()) {
			return null;
		}
		return name;
	}

	public List<TestSheetRow> getSheetList() {
		if (table == null) {
			return Collections.emptyList();
		}
		List<TestSheetRow> rowList = table.getElementList();
		List<TestSheetRow> list = new ArrayList<TestSheetRow>(rowList.size());
		for (int i = 0; i < rowList.size(); i++) {
			if (table.getChecked(i)) {
				list.add(rowList.get(i));
			}
		}
		return list;
	}
}
