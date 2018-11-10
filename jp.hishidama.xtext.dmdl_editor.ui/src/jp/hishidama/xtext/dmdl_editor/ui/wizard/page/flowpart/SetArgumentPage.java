package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

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

public class SetArgumentPage extends EditWizardPage {

	private List<ArgumentRow> initList;

	private FlowpartModelTable table;

	public SetArgumentPage() {
		super("SetArgumentPage");

		setTitle("Set Arguments");
		setDescription("Set arguments.");
	}

	public void init(FlowPartConstructorParser parser) {
		this.initList = parser.getArgumentList();
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());

		int nColumns = 2;

		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);

		createLabel(composite, "argument:");
		table = new FlowpartModelTable(composite);
		table.addColumn("name", 128, SWT.NONE);
		table.addColumn("type", 128, SWT.NONE);
		table.addColumn("comment", 256, SWT.NONE);

		createLabel(composite, "");
		Composite field = new Composite(composite, SWT.NONE);
		// field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		field.setLayout(new FillLayout(SWT.HORIZONTAL));
		table.createButtonArea(field);

		if (initList != null) {
			for (ArgumentRow row : initList) {
				table.addItem(row.clone());
			}
		}
		table.refresh();

		return composite;
	}

	@Override
	protected String validate() {
		Set<String> set = new HashSet<String>();
		for (ArgumentRow element : table.getElementList()) {
			String name = element.name;
			if (set.contains(name)) {
				return MessageFormat.format("duplicate name. name={0}", name);
			}
			set.add(name);
		}
		return null;
	}

	protected class FlowpartModelTable extends ModifiableTable<ArgumentRow> {

		public FlowpartModelTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		}

		@Override
		protected String getText(ArgumentRow element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return element.name;
			case 1:
				return element.type;
			case 2:
				return element.comment;
			default:
				throw new UnsupportedOperationException("columnIndex=" + columnIndex);
			}
		}

		@Override
		protected void doAdd() {
			ArgumentRow element = createElement();
			EditArgumentDialog dialog = new EditArgumentDialog(getShell(), element);
			if (dialog.open() == Window.OK) {
				super.doAdd(element);
			}
		}

		@Override
		protected ArgumentRow createElement() {
			return new ArgumentRow();
		}

		@Override
		protected void editElement(ArgumentRow element) {
			EditArgumentDialog dialog = new EditArgumentDialog(getShell(), element);
			dialog.open();
		}

		@Override
		public void refresh() {
			super.refresh();
			validate(true);
		}
	}

	public List<ArgumentRow> getArgumentList() {
		return table.getElementList();
	}

	public List<ArgumentRow> getInitList() {
		return initList;
	}
}
