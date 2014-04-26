package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.jobflow;

import java.text.MessageFormat;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.NewJobflowClassWizard;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;

public class SetJobflowPorterPage extends EditWizardPage {

	private IJavaProject javaProject;

	private JobflowPorterTable table;

	public SetJobflowPorterPage() {
		super("SetJobflowPorterPage");

		setTitle("Set Importer/Exporter");
		setDescription("Set importer/exporter for JobFlow.");
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());

		int nColumns = 2;

		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);

		createLabel(composite, "Importer/Exporter:");
		table = new JobflowPorterTable(composite);
		table.addColumn("in/out", 64 + 8, SWT.NONE);
		table.addColumn("name", 128, SWT.NONE);
		table.addColumn("class", 256 + 32, SWT.NONE);
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

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			this.javaProject = getWizard().getJavaProject();
		}
	}

	@Override
	public NewJobflowClassWizard getWizard() {
		return (NewJobflowClassWizard) super.getWizard();
	}

	@Override
	protected String validate() {
		Set<String> set = new HashSet<String>();
		for (JobflowPorterRow element : table.getElementList()) {
			String name = element.name;
			if (set.contains(name)) {
				return MessageFormat.format("duplicate name. name={0}", name);
			}
			set.add(name);
		}
		return null;
	}

	protected class JobflowPorterTable extends ModifiableTable<JobflowPorterRow> {

		public JobflowPorterTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		}

		@Override
		protected void createAddButton(Composite field) {
			{
				Button button = new Button(field, SWT.PUSH);
				button.setText("add Importer");
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						doAdd(true);
					}
				});
			}
			{
				Button button = new Button(field, SWT.PUSH);
				button.setText("add Exporter");
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						doAdd(false);
					}
				});
			}
		}

		@Override
		protected String getText(JobflowPorterRow element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return element.getIn();
			case 1:
				return element.name;
			case 2:
				return element.porterClassName;
			case 3:
				return element.modelName;
			case 4:
				return element.modelDescription;
			default:
				throw new UnsupportedOperationException("columnIndex=" + columnIndex);
			}
		}

		protected void doAdd(boolean in) {
			JobflowPorterRow element = createElement();
			element.in = in;
			EditJobflowPorterDialog dialog = new EditJobflowPorterDialog(getShell(), javaProject, element);
			if (dialog.open() == Window.OK) {
				super.doAdd(element);
			}
		}

		@Override
		protected JobflowPorterRow createElement() {
			return new JobflowPorterRow();
		}

		@Override
		protected void editElement(JobflowPorterRow element) {
			EditJobflowPorterDialog dialog = new EditJobflowPorterDialog(getShell(), javaProject, element);
			dialog.open();
		}

		@Override
		public void refresh() {
			super.refresh();
			validate(true);
		}
	}

	public List<JobflowPorterRow> getPorterList() {
		return table.getElementList();
	}
}
