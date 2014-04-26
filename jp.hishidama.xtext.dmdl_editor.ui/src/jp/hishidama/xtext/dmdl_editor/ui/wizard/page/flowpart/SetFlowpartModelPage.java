package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.NewFlowpartClassWizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class SetFlowpartModelPage extends EditWizardPage {

	private IProject project;

	private FlowpartModelTable table;

	public SetFlowpartModelPage() {
		super("SetFlowpartModelPage");

		setTitle("Set In/Out DataModel");
		setDescription("Set data model for FlowPart.");
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());

		int nColumns = 2;

		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);

		createLabel(composite, "data model:");
		table = new FlowpartModelTable(composite);
		table.addColumn("in/out", 64, SWT.NONE);
		table.addColumn("name", 128, SWT.NONE);
		table.addColumn("model name", 128, SWT.NONE);
		table.addColumn("model description", 128, SWT.NONE);

		createLabel(composite, "");
		Composite field = new Composite(composite, SWT.NONE);
		// field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		field.setLayout(new FillLayout(SWT.HORIZONTAL));
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
			this.project = getWizard().getProject();
		}
	}

	@Override
	public NewFlowpartClassWizard getWizard() {
		return (NewFlowpartClassWizard) super.getWizard();
	}

	@Override
	protected String validate() {
		List<FlowpartModelRow> list = table.getElementList();
		if (list.isEmpty()) {
			return "In/Outは必須です。";
		}

		Set<String> set = new HashSet<String>();
		for (FlowpartModelRow element : list) {
			String name = element.name;
			if (set.contains(name)) {
				return MessageFormat.format("duplicate name. name={0}", name);
			}
			set.add(name);
		}
		return null;
	}

	protected class FlowpartModelTable extends ModifiableTable<FlowpartModelRow> {

		public FlowpartModelTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		}

		@Override
		protected void createAddButton(Composite field) {
			{
				Button button = new Button(field, SWT.PUSH);
				button.setText("add In");
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						doAdd(true);
					}
				});
			}
			{
				Button button = new Button(field, SWT.PUSH);
				button.setText("add Out");
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						doAdd(false);
					}
				});
			}
		}

		@Override
		protected String getText(FlowpartModelRow element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return element.getIn();
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

		protected void doAdd(boolean in) {
			FlowpartModelRow element = createElement();
			element.in = in;
			EditFlowpartModelDialog dialog = new EditFlowpartModelDialog(getShell(), project, element);
			if (dialog.open() == Window.OK) {
				super.doAdd(element);
			}
		}

		@Override
		protected FlowpartModelRow createElement() {
			return new FlowpartModelRow();
		}

		@Override
		protected void editElement(FlowpartModelRow element) {
			EditFlowpartModelDialog dialog = new EditFlowpartModelDialog(getShell(), project, element);
			dialog.open();
		}

		@Override
		public void refresh() {
			super.refresh();
			validate(visible);
		}
	}

	public List<FlowpartModelRow> getDataModelList() {
		return table.getElementList();
	}
}
