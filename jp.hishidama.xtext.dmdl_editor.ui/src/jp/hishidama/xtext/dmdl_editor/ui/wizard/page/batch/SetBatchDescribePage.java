package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.batch;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.dialog.ClassSelectionAnnotationFilter;
import jp.hishidama.eclipse_plugin.dialog.ClassSelectionDialog;
import jp.hishidama.eclipse_plugin.dialog.ClassSelectionDialog.Filter;
import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.NewBatchClassWizard;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.batch.JobRow.JobNamePair;

import org.eclipse.jdt.core.IType;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

public class SetBatchDescribePage extends EditWizardPage {

	private JobTable table;

	public SetBatchDescribePage() {
		super("SetBatchDescribePage");

		setTitle("Set JobFlow");
		setDescription("Select JobFlow in Batch.");
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());

		int nColumns = 2;

		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);

		createLabel(composite, "JobFlow:");
		table = new JobTable(composite);
		table.addColumn("job name", 128, SWT.NONE);
		table.addColumn("class name", 256 + 32, SWT.NONE);
		table.addColumn("先行ジョブ", 256, SWT.NONE);

		createLabel(composite, "");
		Composite field = new Composite(composite, SWT.NONE);
		// field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		field.setLayout(new FillLayout(SWT.HORIZONTAL));
		table.createButtonArea(field);
		table.refresh();

		return composite;
	}

	@Override
	public NewBatchClassWizard getWizard() {
		return (NewBatchClassWizard) super.getWizard();
	}

	protected class JobTable extends ModifiableTable<JobRow> {

		public JobTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		}

		@Override
		protected String getText(JobRow element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return element.name;
			case 1:
				return element.className;
			case 2:
				return element.getListText();
			default:
				throw new UnsupportedOperationException("columnIndex=" + columnIndex);
			}
		}

		@Override
		protected void doAdd() {
			JobRow element = createElement();
			EditJobDialog dialog = new EditJobDialog(getShell(), element);
			if (dialog.open() == Window.OK) {
				super.doAdd(element);
			}
		}

		@Override
		protected JobRow createElement() {
			return new JobRow();
		}

		@Override
		protected void editElement(JobRow element) {
			EditJobDialog dialog = new EditJobDialog(getShell(), element);
			dialog.open();
		}

		@Override
		public void refresh() {
			super.refresh();
			validate(true);
		}
	}

	private class EditJobDialog extends EditDialog {

		private JobRow row;

		private Text nameText;
		private Text classText;
		private AfterTable table;

		private class AfterTable extends ModifiableTable<JobNamePair> {

			public AfterTable(Composite parent) {
				super(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION | SWT.CHECK);
			}

			@Override
			protected GridData createGridData() {
				GridData grid = super.createGridData();
				grid.horizontalSpan = 2;
				grid.heightHint = 80;
				return grid;
			}

			@Override
			protected String getText(JobNamePair element, int columnIndex) {
				switch (columnIndex) {
				case 0:
					return element.name;
				case 1:
					return element.className;
				default:
					throw new UnsupportedOperationException("columnIndex=" + columnIndex);
				}
			}

			@Override
			protected JobNamePair createElement() {
				throw new UnsupportedOperationException();
			}

			@Override
			protected void editElement(JobNamePair element) {
				// do nothing
			}
		}

		public EditJobDialog(Shell parentShell, JobRow row) {
			super(parentShell, "ジョブフロー選択", 3);
			this.row = row;
		}

		@Override
		protected void createFields(Composite composite) {
			TextButtonPair pair = createTextButtonField(composite, "job name", "select");
			nameText = pair.text;
			nameText.setText(nonNull(row.name));
			nameText.setEditable(false);
			classText = createTextField(composite, "class name");
			classText.setText(nonNull(row.className));
			classText.setEditable(false);

			pair.button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					Filter filter = new ClassSelectionAnnotationFilter(FlowUtil.JOBFLOW_NAME);
					ClassSelectionDialog dialog = ClassSelectionDialog.create(getShell(), getWizard().getJavaProject(),
							getContainer(), filter);
					dialog.setTitle("Select JobFlow");
					if (dialog.open() != Window.OK) {
						return;
					}

					IType type = dialog.getSelectedClass();
					nameText.setText(nonNull(FlowUtil.getJobFlowName(type)));
					classText.setText(type.getFullyQualifiedName());
				}
			});

			createLabel(composite, "先行ジョブ");
			table = new AfterTable(composite);
			table.addColumn("name", 128, SWT.NONE);
			table.addColumn("className", 128 + 64, SWT.NONE);
			for (JobRow job : getJobList(row.name)) {
				JobNamePair element = new JobNamePair();
				element.name = job.name;
				element.className = job.className;
				table.addItem(element);
			}
			table.refresh();
			List<JobNamePair> list = table.getElementList();
			for (int i = 0; i < list.size(); i++) {
				String className = list.get(i).className;
				if (row.containsList(className)) {
					table.setChecked(i, true);
				}
			}

			table.getTable().addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					TableItem item = (TableItem) e.item;
					item.setChecked(!item.getChecked());
				}
			});
		}

		@Override
		protected void refresh() {
			refreshOkButton();
		}

		@Override
		protected boolean validate() {
			if (StringUtil.isEmpty(nameText.getText().trim())) {
				return false;
			}
			return true;
		}

		@Override
		protected void okPressed() {
			row.name = nameText.getText();
			row.className = classText.getText();

			row.list.clear();
			List<JobNamePair> list = table.getElementList();
			for (int i = 0; i < list.size(); i++) {
				if (table.getChecked(i)) {
					JobNamePair pair = list.get(i);
					row.list.add(pair);
				}
			}

			super.okPressed();
		}
	}

	@Override
	protected String validate() {
		List<JobRow> list = table.getElementList();
		{
			Set<String> set = new HashSet<String>();
			for (JobRow row : list) {
				if (set.contains(row.className)) {
					return MessageFormat.format("ジョブフローは1つずつしか使用できません。className={0}", row.className);
				}
				set.add(row.className);
			}
		}
		{
			Set<String> set = new HashSet<String>();
			for (JobRow row : list) {
				for (JobNamePair pair : row.list) {
					if (!set.contains(pair.className)) {
						return MessageFormat.format("{0}に指定されている先行ジョブ{1}は、{0}より前に存在しません。", row.name, pair.name);
					}
				}
				set.add(row.className);
			}
		}

		return null;
	}

	List<JobRow> getJobList(String name) {
		List<JobRow> all = table.getElementList();
		if (name == null) {
			return all;
		}

		List<JobRow> list = new ArrayList<JobRow>(all.size());
		for (JobRow row : all) {
			if (name.equals(row.name)) {
				break;
			}
			list.add(row);
		}
		return list;
	}

	public List<JobRow> getJobList() {
		return table.getElementList();
	}
}
