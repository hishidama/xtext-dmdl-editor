package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.batch;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;

import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class SetBatchParameterPage extends EditWizardPage {

	private FlowpartModelTable table;

	public SetBatchParameterPage() {
		super("SetBatchParameterPage");

		setTitle("Set Batch Parameters");
		setDescription("Set batch parameters.");
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());

		int nColumns = 2;

		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);

		createLabel(composite, "parameter:");
		table = new FlowpartModelTable(composite);
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

		return composite;
	}

	@Override
	protected String validate() {
		Set<String> set = new HashSet<String>();
		for (BatchParameterRow element : table.getElementList()) {
			String name = element.name;
			if (set.contains(name)) {
				return MessageFormat.format("duplicate name. name={0}", name);
			}
			set.add(name);
		}
		return null;
	}

	protected class FlowpartModelTable extends ModifiableTable<BatchParameterRow> {

		public FlowpartModelTable(Composite parent) {
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

	public List<BatchParameterRow> getParameterList() {
		return table.getElementList();
	}
}
