package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.jobflow;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.jdt.util.AnnotationUtil;
import jp.hishidama.eclipse_plugin.jdt.util.JavadocUtil;
import jp.hishidama.eclipse_plugin.jdt.util.TypeUtil;
import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.util.DialogSettingsUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.PorterFile;
import jp.hishidama.xtext.dmdl_editor.ui.dialog.PorterSelectionDialog;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLActivator;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLVariableTableUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.TypeWizard;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.MarkerMessage;

import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.ILocalVariable;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;

public class SetJobflowPorterPage extends EditWizardPage {

	private IJavaProject javaProject;

	private List<JobflowPorterRow> initList;

	private JobflowPorterTable table;

	public SetJobflowPorterPage() {
		super("SetJobflowPorterPage");

		setTitle("Set Importer/Exporter");
		setDescription("Set importer/exporter for JobFlow.");
	}

	public void init(IType type) {
		this.initList = initList(type);
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
		table.addColumn("comment", 128, SWT.NONE);
		table.addColumn("class", 256 + 32, SWT.NONE);
		table.addColumn("model name", 128, SWT.NONE);
		table.addColumn("model description", 128, SWT.NONE);
		table.addColumn("marker message", 64, SWT.NONE);

		{
			createLabel(composite, "");
			Composite field = new Composite(composite, SWT.NONE);
			// field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			field.setLayout(new FillLayout(SWT.HORIZONTAL));
			table.createButtonArea(field);
		}
		{
			createLabel(composite, "");
			Composite field = new Composite(composite, SWT.NONE);
			field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			field.setLayout(new GridLayout(3, false));
			table.createTextArea(field);
		}

		if (initList != null) {
			for (JobflowPorterRow row : initList) {
				table.addItem(row.clone());
			}
		}
		table.refresh();

		return composite;
	}

	private List<JobflowPorterRow> initList(IType type) {
		List<JobflowPorterRow> list = new ArrayList<JobflowPorterRow>();

		IMethod constructor = TypeUtil.findConsructor(type);
		if (constructor == null) {
			return list;
		}

		MarkerMessage markerMessage = new MarkerMessage(type);

		IProject project = type.getJavaProject().getProject();
		try {
			Map<String, String> paramJavadoc = JavadocUtil.getParamMap(JavadocUtil.getJavadoc(constructor));
			for (ILocalVariable param : constructor.getParameters()) {
				String t = TypeUtil.getVariableTypeName(param);
				int s = t.indexOf('<');
				int e = t.lastIndexOf('>');
				if (s < 0 || e < 0) {
					continue;
				}

				JobflowPorterRow row = new JobflowPorterRow();
				row.in = t.startsWith(FlowUtil.IN_NAME);
				row.name = param.getElementName();
				row.comment = StringUtil.trim(paramJavadoc.get(row.name));
				row.modelClassName = t.substring(s + 1, e);
				ModelDefinition model = ModelUiUtil.findModelByClass(project, row.modelClassName);
				if (model != null) {
					row.modelName = model.getName();
					row.modelDescription = ModelUtil.getDecodedDescriptionText(model);
				}

				String desc = AnnotationUtil.getAnnotationValue(type, param, FlowUtil.IMPORT_NAME, "description");
				if (desc == null) {
					desc = AnnotationUtil.getAnnotationValue(type, param, FlowUtil.EXPORT_NAME, "description");
				}
				row.porterClassName = TypeUtil.resolveTypeName(desc, type);

				row.markerMessage = markerMessage.getMessage(type.getField(row.name));

				list.add(row);
			}
		} catch (JavaModelException e) {
			LogUtil.logWarn("", e);
		}

		return list;
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
	public TypeWizard getWizard() {
		return (TypeWizard) super.getWizard();
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
		private static final String KEY = "JobflowPorterTable.NAME_RULE";

		private Combo nameRuleCombo;

		public JobflowPorterTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
			setVisibleDupButton(true);
		}

		@Override
		protected void createAddButton(Composite field) {
			Button button1 = createPushButton(field, "add Imp");
			button1.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					doAdd1(true);
				}
			});
			Button button2 = createPushButton(field, "add Exp");
			button2.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					doAdd1(false);
				}
			});

			Button button3 = createPushButton(field, "adds");
			button3.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					doAdd();
				}
			});
		}

		@Override
		protected void createButtonAfterDup(Composite field) {
			Button button = createPushButton(field, "rename");
			button.setToolTipText("選択された行の名前を一括して置換します。");
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					doRename();
				}
			});
			selectionButton.add(button);
		}

		public void createTextArea(Composite field) {
			createLabel(field, "名前の命名ルール :").setToolTipText("追加・改名を実行した際に使われます。");
			nameRuleCombo = new Combo(field, SWT.BORDER);
			GridData data = new GridData(GridData.FILL_HORIZONTAL);
			data.horizontalSpan = 1;
			nameRuleCombo.setLayoutData(data);
			DialogSettingsUtil.load(getDialogSettings(), nameRuleCombo, KEY, "$(className.toLowerCamelCase)");

			Button button = new Button(field, SWT.PUSH);
			button.setText("select");
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					JobflowPortNameRuleDialog dialog = new JobflowPortNameRuleDialog(getShell());
					if (dialog.open() == Window.OK) {
						refreshNameRuleComboItems();
						String value = dialog.getSelectedValue();
						nameRuleCombo.setText(value);
						refreshNameRuleComboItems();
					}
				}
			});
		}

		protected final IDialogSettings getDialogSettings() {
			IDialogSettings rootSettings = DMDLActivator.getInstance().getDialogSettings();
			String sectionName = "SetJobflowPorterPage";
			IDialogSettings settings = rootSettings.getSection(sectionName);
			if (settings == null) {
				settings = rootSettings.addNewSection(sectionName);
			}

			return settings;
		}

		public void saveDialogSettings() {
			DialogSettingsUtil.save(getDialogSettings(), nameRuleCombo, KEY, 20);
		}

		@Override
		protected String getText(JobflowPorterRow element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return element.getIn();
			case 1:
				return element.name;
			case 2:
				return element.comment;
			case 3:
				return element.porterClassName;
			case 4:
				return element.modelName;
			case 5:
				return element.modelDescription;
			case 6:
				return element.markerMessage;
			default:
				throw new UnsupportedOperationException("columnIndex=" + columnIndex);
			}
		}

		protected void doAdd1(boolean in) {
			JobflowPorterRow element = createElement();
			element.in = in;
			EditJobflowPorterDialog dialog = new EditJobflowPorterDialog(getShell(), javaProject, element, nameRuleCombo.getText(), 0);
			if (dialog.open() == Window.OK) {
				doAdd(element);
			}
		}

		private PorterSelectionDialog porterSelectionDialog;

		@Override
		protected void doAdd() {
			IProject project = javaProject.getProject();
			if (porterSelectionDialog == null) {
				porterSelectionDialog = new PorterSelectionDialog(getShell(), project);
			}
			PorterSelectionDialog dialog = porterSelectionDialog;
			// dialog.setInitialSelection(getWizard().getDir());
			if (dialog.open() != Window.OK) {
				return;
			}

			List<PorterFile> files = dialog.getSelectedFiles();
			List<JobflowPorterRow> result = new ArrayList<JobflowPorterRow>(files.size());
			String nameRule = nameRuleCombo.getText();
			int i = 0;
			for (PorterFile file : files) {
				doAdd(file, result, nameRule, i++);
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

		private void doAdd(PorterFile file, List<JobflowPorterRow> result, String nameRule, int number) {
			JobflowPorterRow row = createElement();
			row.in = file.isImporter();
			row.porterClassName = file.getClassName();
			row.comment = file.getComment();
			row.modelClassName = file.getModelClassName();
			row.modelName = file.getModelName();
			row.modelDescription = file.getModelDescription();

			row.name = getName(row, nameRule, number);

			if (StringUtil.isEmpty(row.comment)) {
				row.comment = row.modelDescription;
			}

			result.add(row);
		}

		private String getName(JobflowPorterRow row, String nameRule, int number) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("in", Boolean.toString(row.in));
			map.put("className", StringUtil.getSimpleName(row.porterClassName));
			map.put("modelName", row.modelName);
			map.put("modelDescription", row.modelDescription);
			map.put("number", Integer.toString(number));

			String name = DMDLVariableTableUtil.replaceVariable(nameRule, map);
			if (StringUtil.nonEmpty(name)) {
				return name;
			}
			return StringUtil.toFirstLower(StringUtil.getSimpleName(row.porterClassName));
		}

		@Override
		protected JobflowPorterRow createElement() {
			return new JobflowPorterRow();
		}

		@Override
		protected void editElement(JobflowPorterRow element) {
			EditJobflowPorterDialog dialog = new EditJobflowPorterDialog(getShell(), javaProject, element, nameRuleCombo.getText(), 0);
			dialog.open();
		}

		@Override
		protected JobflowPorterRow dupElement(JobflowPorterRow element) {
			return element.clone();
		}

		protected void doRename() {
			String nameRule = nameRuleCombo.getText();
			List<JobflowPorterRow> list = getElementList();
			int[] index = table.getSelectionIndices();
			for (int i = 0; i < index.length; i++) {
				JobflowPorterRow row = list.get(index[i]);
				row.name = getName(row, nameRule, i);
			}
			refresh();
		}

		@Override
		public void refresh() {
			super.refresh();
			refreshNameRuleComboItems();
			validate(visible);
		}

		void refreshNameRuleComboItems() {
			DialogSettingsUtil.refreshComboItems(nameRuleCombo);
		}
	}

	public List<JobflowPorterRow> getPorterList() {
		return table.getElementList();
	}

	public List<JobflowPorterRow> getInitList() {
		return initList;
	}

	public void saveDialogSettings() {
		table.saveDialogSettings();
	}
}
