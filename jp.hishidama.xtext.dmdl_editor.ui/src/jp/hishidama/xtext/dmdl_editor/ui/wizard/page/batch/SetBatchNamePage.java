package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.batch;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.NewBatchClassWizard;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class SetBatchNamePage extends EditWizardPage {

	private Text nameText;
	private Text commentText;
	private BatchParameterTable table;
	private Button strictCheck;

	public SetBatchNamePage() {
		super("SetBatchNamePage");

		setTitle("Set Batch name");
		setDescription("Set Batch name.");
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());

		int nColumns = 2;

		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);

		nameText = createTextField(composite, nColumns - 1, "Batch name:");
		commentText = createTextField(composite, nColumns - 1, "comment:");
		{
			createLabel(composite, "parameter:");
			table = new BatchParameterTable(composite);
			table.addColumn("name", 128, SWT.NONE);
			table.addColumn("comment", 256, SWT.NONE);
			table.addColumn("required", 64, SWT.NONE);
			table.addColumn("pattern", 128, SWT.NONE);

			createLabel(composite, "");
			Composite field = new Composite(composite, SWT.NONE);
			// field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			field.setLayout(new FillLayout(SWT.HORIZONTAL));
			table.createButtonArea(field);
			table.refresh();
		}
		strictCheck = createCheckButtonField(composite, "strict:", "parameterで指定していない引数を利用できないようにする");
		strictCheck.setSelection(false);

		return composite;
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			if (nameText != null && nameText.getText().trim().isEmpty()) {
				nameText.setText(getWizard().getTypeName());
			}
			nameText.setFocus();
		}
	}

	@Override
	public NewBatchClassWizard getWizard() {
		return (NewBatchClassWizard) super.getWizard();
	}

	protected class BatchParameterTable extends ModifiableTable<BatchParameterRow> {

		public BatchParameterTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		}

		@Override
		protected String getText(BatchParameterRow element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return element.name;
			case 1:
				return element.comment;
			case 2:
				return element.required ? "required" : "";
			case 3:
				return element.pattern;
			default:
				throw new UnsupportedOperationException("columnIndex=" + columnIndex);
			}
		}

		@Override
		protected void doAdd() {
			BatchParameterRow element = createElement();
			EditBatchParameterDialog dialog = new EditBatchParameterDialog(getShell(), element);
			if (dialog.open() == Window.OK) {
				super.doAdd(element);
			}
		}

		@Override
		protected BatchParameterRow createElement() {
			return new BatchParameterRow();
		}

		@Override
		protected void editElement(BatchParameterRow element) {
			EditBatchParameterDialog dialog = new EditBatchParameterDialog(getShell(), element);
			dialog.open();
		}

		@Override
		public void refresh() {
			super.refresh();
			validate(true);
		}
	}

	@Override
	protected String validate() {
		{
			String text = getBatchName();
			if (text.trim().isEmpty()) {
				return "Batch name is empty.";
			}
		}
		Set<String> set = new HashSet<String>();
		for (BatchParameterRow element : table.getElementList()) {
			String name = element.name;
			if (set.contains(name)) {
				return MessageFormat.format("duplicate parameter name. name={0}", name);
			}
			set.add(name);
		}
		return null;
	}

	public String getBatchName() {
		return nameText.getText();
	}

	public String getComment() {
		return commentText.getText();
	}

	public List<BatchParameterRow> getParameterList() {
		return table.getElementList();
	}

	public boolean isStrict() {
		return strictCheck.getSelection();
	}
}
