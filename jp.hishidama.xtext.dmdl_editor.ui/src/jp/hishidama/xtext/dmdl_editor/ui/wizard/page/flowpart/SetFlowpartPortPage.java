package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

import java.text.MessageFormat;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.dialog.DmdlModelMultiSelectionDialog;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLActivator;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLVariableTableUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.TypeWizard;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

public class SetFlowpartPortPage extends EditWizardPage {

	private IProject project;

	private List<FlowpartModelRow> initList;

	private FlowpartModelTable table;

	public SetFlowpartPortPage() {
		super("SetFlowpartPortPage");

		setTitle("Set In/Out DataModel");
		setDescription("Set data model for FlowPart.");
	}

	public void init(FlowPartConstructorParser parser) {
		this.initList = parser.getPortList();
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
		table.addColumn("generics name", 32, SWT.NONE);
		table.addColumn("name", 128, SWT.NONE);
		table.addColumn("comment", 128, SWT.NONE);
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
			for (FlowpartModelRow row : initList) {
				table.addItem(row.clone());
			}
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
			this.project = getWizard().getJavaProject().getProject();
		}
	}

	@Override
	public TypeWizard getWizard() {
		return (TypeWizard) super.getWizard();
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
		private static final String KEY = "FlowpartModelTable.NAME_RULE";

		private Text nameText;

		public FlowpartModelTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
			setVisibleDupButton(true);
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
			nameText = createText(field, 1, null);
			IDialogSettings settings = getDialogSettings();
			String value = settings.get(KEY);
			if (value == null || value.trim().isEmpty()) {
				value = "$(modelName.toLowerCamelCase)";
			}
			nameText.setText(value);

			Button button = new Button(field, SWT.PUSH);
			button.setText("select");
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					FlowpartPortNameRuleDialog dialog = new FlowpartPortNameRuleDialog(getShell());
					if (dialog.open() == Window.OK) {
						String value = dialog.getSelectedValue();
						nameText.setText(value);
					}
				}
			});
		}

		protected final IDialogSettings getDialogSettings() {
			IDialogSettings rootSettings = DMDLActivator.getInstance().getDialogSettings();
			String sectionName = "SetFlowpartPortPage";
			IDialogSettings settings = rootSettings.getSection(sectionName);
			if (settings == null) {
				settings = rootSettings.addNewSection(sectionName);
			}

			return settings;
		}

		public void saveDialogSettings() {
			String value = nameText.getText();
			getDialogSettings().put(KEY, value);
		}

		@Override
		protected String getText(FlowpartModelRow element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return element.getIn();
			case 1:
				return element.genericsName;
			case 2:
				return element.name;
			case 3:
				return element.comment;
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

		protected void doAdd(boolean in) {
			DmdlModelMultiSelectionDialog dialog = new DmdlModelMultiSelectionDialog(getShell(), project);
			if (dialog.open() != Window.OK) {
				return;
			}

			List<ModelDefinition> list = dialog.getSelectedDataModelList();
			String nameRule = nameText.getText();
			int i = 0;
			for (ModelDefinition model : list) {
				String modelName = model.getName();

				FlowpartModelRow row = createElement();
				row.in = in;
				row.setModelClassName(ModelUiUtil.getModelClassName(project, modelName));
				row.modelName = modelName;
				row.modelDescription = ModelUtil.getDecodedDescriptionText(model);
				row.comment = row.modelDescription;
				if (ModelUtil.isProjective(model)) {
					row.genericsName = modelName.substring(0, 1).toUpperCase();
				}

				row.name = getName(row, nameRule, i++);

				super.doAdd(row);
			}
		}

		private String getName(FlowpartModelRow row, String nameRule, int number) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("in", Boolean.toString(row.in));
			map.put("modelName", row.modelName);
			map.put("modelDescription", row.modelDescription);
			map.put("number", Integer.toString(number));

			String name = DMDLVariableTableUtil.replaceVariable(nameRule, map);
			if (StringUtil.nonEmpty(name)) {
				return name;
			}
			return StringUtil.toLowerCamelCase(row.modelName);
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
		protected FlowpartModelRow dupElement(FlowpartModelRow element) {
			return element.clone();
		}

		protected void doRename() {
			String nameRule = nameText.getText();
			List<FlowpartModelRow> list = getElementList();
			int[] index = table.getSelectionIndices();
			for (int i = 0; i < index.length; i++) {
				FlowpartModelRow row = list.get(index[i]);
				row.name = getName(row, nameRule, i);
			}
			refresh();
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

	public List<FlowpartModelRow> getInitList() {
		return initList;
	}

	public void saveDialogSettings() {
		table.saveDialogSettings();
	}
}
