package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.jobflow;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.PorterUtil;
import jp.hishidama.eclipse_plugin.dialog.ProjectFileSelectionDialog;
import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.NewJobflowClassWizard;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
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

	private boolean visible;

	@Override
	public void setVisible(boolean visible) {
		this.visible = visible;
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
		List<JobflowPorterRow> list = table.getElementList();
		if (list.isEmpty()) {
			return "Importer/Exporterは必須です。";
		}

		Set<String> set = new HashSet<String>();
		for (JobflowPorterRow element : list) {
			String name = element.name;
			if (name == null || name.isEmpty()) {
				return "name is empty.";
			}
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

		@Override
		protected void doAdd() {
			IProject project = javaProject.getProject();
			ProjectFileSelectionDialog dialog = new ProjectFileSelectionDialog(getShell(), project);
			dialog.setTitle("Select Importer/Exporter");
			dialog.setInitialSelection(getWizard().getDir());
			dialog.addFileterExtension("java");
			if (dialog.open() != Window.OK) {
				return;
			}

			List<JobflowPorterRow> result = new ArrayList<JobflowPorterRow>();
			for (String path : dialog.getResult()) {
				doAdd(project, path, result);
			}
			for (JobflowPorterRow row : result) {
				if (row.in) {
					super.doAdd(row);
				}
			}
			for (JobflowPorterRow row : result) {
				if (!row.in) {
					super.doAdd(row);
				}
			}
		}

		private void doAdd(IProject project, String path, List<JobflowPorterRow> result) {
			IFile file = project.getFile(path);
			ICompilationUnit cu = (ICompilationUnit) JavaCore.create(file, javaProject);
			if (cu != null) {
				doAdd(project, cu, result);
			} else {
				doAdd(project.getFolder(path), result);
			}
		}

		private void doAdd(IFolder folder, List<JobflowPorterRow> result) {
			try {
				for (IResource r : folder.members()) {
					if (r instanceof IFile) {
						ICompilationUnit cu = (ICompilationUnit) JavaCore.create(r, javaProject);
						if (cu != null) {
							doAdd(folder.getProject(), cu, result);
						}
					} else if (r instanceof IFolder) {
						doAdd((IFolder) r, result);
					}
				}
			} catch (CoreException e) {
				// do nothing
			}
		}

		private void doAdd(IProject project, ICompilationUnit cu, List<JobflowPorterRow> result) {
			try {
				for (IType type : cu.getTypes()) {
					String porter = PorterUtil.getPorterInterfaceName(type);
					if (porter == null) {
						continue;
					}

					JobflowPorterRow row = createElement();
					row.in = PorterUtil.IMPORTER_NAME.equals(porter);
					row.porterClassName = type.getFullyQualifiedName();
					String modelClassName = PorterUtil.getModelClassName(javaProject, row.porterClassName);
					row.modelClassName = modelClassName;
					ModelDefinition model = ModelUiUtil.findModelByClass(project, modelClassName);
					if (model != null) {
						String modelName = model.getName();
						row.name = StringUtil.toLowerCamelCase(modelName);
						row.modelName = modelName;
						row.modelDescription = ModelUtil.getDecodedDescriptionText(model);
					}
					result.add(row);
				}
			} catch (JavaModelException e) {
				// do nothing
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
			validate(visible);
		}
	}

	public List<JobflowPorterRow> getPorterList() {
		return table.getElementList();
	}
}
