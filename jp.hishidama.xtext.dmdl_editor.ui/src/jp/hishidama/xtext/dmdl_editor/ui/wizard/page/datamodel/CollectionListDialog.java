package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.util.DialogSettingsUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil.PropertyExpressionType;
import jp.hishidama.xtext.dmdl_editor.ui.dialog.SelectRuleDialog;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLActivator;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLVariableTableUtil;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeDataTransfer;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DataModelTreeViewer;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel.PropertyCollection.CollectionEntry;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.DropTarget;
import org.eclipse.swt.dnd.DropTargetAdapter;
import org.eclipse.swt.dnd.DropTargetEvent;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;

class CollectionListRow implements Cloneable {
	protected String key;
	protected String name;
	protected String description;
	protected String dataType;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getText(int columnIndex) {
		switch (columnIndex) {
		case 0:
			return key;
		case 1:
			return name;
		case 2:
			return description;
		case 3:
			return dataType;
		default:
			throw new AssertionError(MessageFormat.format("index={0}", columnIndex));
		}
	}

	@Override
	protected CollectionListRow clone() {
		try {
			return (CollectionListRow) super.clone();
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e);
		}
	}
}

abstract class CollectionDialog extends EditDialog {
	private static final String DATA_TYPE_UNDEFINE = "-undefine-";
	private static final String[] DATA_TYPE = { DATA_TYPE_UNDEFINE, "INT", "LONG", "FLOAT", "DOUBLE", "TEXT", "DECIMAL", "DATE", "DATETIME", "BOOLEAN", "BYTE", "SHORT" };

	private String elementType;

	private Combo typeCombo;

	public CollectionDialog(Shell parentShell, String windowTitle, int numColumns, String elementType) {
		super(parentShell, windowTitle, numColumns);
		this.elementType = elementType;
	}

	protected void createElementTypeCombo(Composite composite) {
		Composite field = new Composite(composite, SWT.NONE);
		field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		GridLayout layout = new GridLayout(2, false);
		layout.marginWidth = 0;
		layout.marginHeight = 0;
		layout.horizontalSpacing = 0;
		field.setLayout(layout);
		typeCombo = createComboFieldFull(field, "explicit element type : ", DATA_TYPE);

		String type = this.elementType;
		if (type == null || type.isEmpty()) {
			typeCombo.setText(DATA_TYPE_UNDEFINE);
		} else {
			typeCombo.setText(type);
		}
	}

	@Override
	protected void okPressed() {
		String type = typeCombo.getText();
		if (DATA_TYPE_UNDEFINE.equals(type)) {
			this.elementType = null;
		} else {
			this.elementType = type;
		}

		super.okPressed();
	}

	public String getElementType() {
		return elementType;
	}
}

public class CollectionListDialog extends CollectionDialog {

	private final IProject project;
	private final String dataModelName;
	private final boolean isMap;
	private List<CollectionEntry> propertyNameList;

	private DataModelTreeViewer sourceViewer;
	private Button copyButton;
	private DataModelTable table;
	private TableViewer tableViewer;

	public CollectionListDialog(Shell parentShell, IProject project, String dataModelName, boolean isMap, String elementType, List<CollectionEntry> nameList) {
		super(parentShell, "コレクションの作成", 3, elementType);
		this.project = project;
		this.dataModelName = dataModelName;
		this.isMap = isMap;
		this.propertyNameList = nameList;
	}

	@Override
	protected void createFields(Composite composite) {
		// 1行目
		{
			createLabel(composite, "プロパティーの候補");
			createLabel(composite, ""); // dummy
			createLabel(composite, isMap ? "mapのプロパティー" : "listのプロパティー");
		}

		// 2行目
		{ // 左の表
			Composite panel = new Composite(composite, SWT.NONE);
			{
				panel.setLayoutData(new GridData(GridData.FILL_BOTH));

				GridLayout layout = new GridLayout(2, false);
				layout.marginWidth = 0;
				layout.marginHeight = 0;
				layout.horizontalSpacing = 0;
				panel.setLayout(layout);
			}

			sourceViewer = new DataModelTreeViewer(panel, SWT.BORDER | SWT.MULTI, 256 + 128, 128, true);
			GridData grid = new GridData(GridData.FILL_BOTH);
			grid.heightHint = 192;
			grid.horizontalSpan = 2;
			sourceViewer.setLayoutData(grid);
			sourceViewer.addSelectionChangedListener(new ISelectionChangedListener() {
				public void selectionChanged(SelectionChangedEvent event) {
					ITreeSelection selection = (ITreeSelection) event.getSelection();
					doSelectionChange(selection);
				}
			});
			sourceViewer.addDoubleClickListener(new IDoubleClickListener() {
				public void doubleClick(DoubleClickEvent event) {
					ITreeSelection selection = (ITreeSelection) event.getSelection();
					doSelectionChange(selection);
					if (copyButton.isEnabled()) {
						doCopy();
					}
				}
			});

			sourceViewer.createFilterField(panel, GridDataFactory.fillDefaults().span(2, 1).grab(true, false).create());
		}
		{ // 中央のボタン
			Composite column = new Composite(composite, SWT.NONE);
			column.setLayout(new GridLayout(1, true));
			{
				Button button = new Button(column, SWT.NONE);
				button.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				button.setText("copy->");
				button.setToolTipText("データモデルのプロパティーをコピーします。");
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						doCopy();
					}
				});
				copyButton = button;
			}
		}
		{ // 右の表
			Composite column = new Composite(composite, SWT.NONE);
			{
				column.setLayoutData(new GridData(GridData.FILL_BOTH));
				GridLayout layout = new GridLayout(1, false);
				layout.marginWidth = 0;
				layout.marginHeight = 0;
				column.setLayout(layout);
			}

			createTableViewer(column);

			{
				Composite field = new Composite(column, SWT.NONE);
				field.setLayoutData(new GridData(SWT.LEFT, SWT.END, true, false));
				GridLayout layout = new GridLayout(6, true);
				layout.marginWidth = 0;
				layout.marginHeight = 0;
				layout.horizontalSpacing = 0;
				field.setLayout(layout);
				table.createButtonArea(field);
			}
			if (isMap) {
				Composite field = new Composite(column, SWT.NONE);
				field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
				GridLayout layout = new GridLayout(4, false);
				layout.marginWidth = 0;
				layout.marginHeight = 0;
				layout.horizontalSpacing = 0;
				field.setLayout(layout);
				table.createRuleArea(field);
			}
			createElementTypeCombo(column);
		}

		// 左の表の初期化
		sourceViewer.setInputAll(project);
		if (dataModelName != null) {
			sourceViewer.setModelNameFilter('^' + dataModelName + '$');
			sourceViewer.expandAll();
		}
		// 右の表の初期化
		{
			Map<String, Property> map = ModelUiUtil.getPropertiesMap(project, dataModelName);
			int i = 0;
			for (CollectionEntry entry : propertyNameList) {
				CollectionListRow row = new CollectionListRow();
				row.key = isMap ? entry.key : Integer.toString(i++);
				row.name = entry.name;
				Property p = map.get(entry.name);
				if (p != null) {
					row.description = PropertyUtil.getDecodedDescription(p);
					row.dataType = PropertyUtil.getResolvedDataTypeText(p);
				}
				table.addItem(row);
			}
			table.refresh();
		}

		doSelectionChange(null);
		// validate(false);
	}

	private void createTableViewer(Composite column) {
		table = new DataModelTable(column);
		tableViewer = table.getTableViewer();
		addColumn(isMap ? "key" : "index", 48);
		addColumn("name", 128);
		addColumn("description", 128);
		addColumn("type", 96);
	}

	protected final void addColumn(String text, int width) {
		table.addColumn(text, width, SWT.NONE);
	}

	protected class DataModelTable extends ModifiableTable<CollectionListRow> {
		private static final String KEY = "CollectionListDialog.DataModelTable.KEY_RULE";

		private Combo keyRuleCombo;

		public DataModelTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
			setEnableButton(false, isMap, true, true);
			setVisibleDupButton(true);

			int operations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_DEFAULT;
			Transfer[] transferTypes = { DMDLTreeDataTransfer.getInstance() };
			viewer.addDropSupport(operations, transferTypes, new DropTargetAdapter() {
				@Override
				public void dragEnter(DropTargetEvent event) {
					if (DMDLTreeDataTransfer.getInstance().isSupportedType(event.currentDataType)) {
						ITreeSelection selection = (ITreeSelection) event.data;
						if (selection == null) {
							selection = sourceViewer.getSelection();
						}
						if (enableCopy(selection)) {
							event.detail = DND.DROP_COPY;
						} else {
							event.detail = DND.DROP_NONE;
						}
					}
				}

				@Override
				public void drop(DropTargetEvent event) {
					if (DMDLTreeDataTransfer.getInstance().isSupportedType(event.currentDataType)) {
						int index = -1;
						{
							DropTarget target = (DropTarget) event.widget;
							Table table = (Table) target.getControl();
							Point point = event.display.map(null, table, event.x, event.y);
							TableItem item = table.getItem(point);
							if (item != null) {
								index = table.indexOf(item);
							}
						}

						ITreeSelection selection = (ITreeSelection) event.data;
						doCopy(selection, index);
					}
				}
			});
		}

		@Override
		protected void createAddButton(Composite field) {
			// not create
		}

		private String dialogFreeValue = "key$(number.1.%02d)";

		public void createRuleArea(Composite field) {
			createLabel(field, "キーの命名ルール :").setToolTipText("copy, applyを実行した際に使われます。");
			{
				keyRuleCombo = new Combo(field, SWT.BORDER);
				GridData data = new GridData(GridData.FILL_HORIZONTAL);
				data.horizontalSpan = 1;
				keyRuleCombo.setLayoutData(data);
				DialogSettingsUtil.load(getDialogSettings(), keyRuleCombo, KEY, "$(name)");
			}
			{
				Button button = new Button(field, SWT.PUSH);
				button.setText("select");
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						String value = keyRuleCombo.getText();
						KeyRuleDialog dialog = new KeyRuleDialog(getShell(), dialogFreeValue, value);
						if (dialog.open() == Window.OK) {
							dialogFreeValue = dialog.getFreeValue();

							refreshkeyRuleComboItems();
							value = dialog.getSelectedValue();
							keyRuleCombo.setText(value);
							refreshkeyRuleComboItems();
						}
					}
				});
			}
			{
				Button button = new Button(field, SWT.PUSH);
				button.setText("apply");
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						doApply();
					}
				});
				selectionButton.add(button);
			}
		}

		protected final IDialogSettings getDialogSettings() {
			IDialogSettings rootSettings = DMDLActivator.getInstance().getDialogSettings();
			String sectionName = "CollectionListDialog";
			IDialogSettings settings = rootSettings.getSection(sectionName);
			if (settings == null) {
				settings = rootSettings.addNewSection(sectionName);
			}

			return settings;
		}

		public void saveDialogSettings() {
			if (keyRuleCombo != null) {
				DialogSettingsUtil.save(getDialogSettings(), keyRuleCombo, KEY, 20);
			}
		}

		@Override
		protected Button createPushButton(Composite parent, String text) {
			Button button = super.createPushButton(parent, text);
			button.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			return button;
		}

		@Override
		protected String getText(CollectionListRow element, int columnIndex) {
			return element.getText(columnIndex);
		}

		@Override
		protected CollectionListRow createElement() {
			return new CollectionListRow();
		}

		@Override
		protected void editElement(CollectionListRow element) {
			if (isMap) {
				EditCollectionKeyDialog dialog = new EditCollectionKeyDialog(getShell(), element);
				dialog.open();
			}
		}

		@Override
		protected void doMove(int z) {
			super.doMove(z);
			updateIndex();
		}

		@Override
		protected void doDuplicate() {
			super.doDuplicate();
			updateIndex();
		}

		@Override
		protected CollectionListRow dupElement(CollectionListRow element) {
			return element.clone();
		}

		@Override
		protected void doDelete() {
			super.doDelete();
			updateIndex();
		}

		protected void doApply() {
			String rule = keyRuleCombo.getText();
			int[] index = getSelectionIndices();
			List<CollectionListRow> list = getElementList();
			for (int i : index) {
				CollectionListRow row = list.get(i);
				String key = getKey(row, rule, i);
				row.setKey(key);
			}

			refresh();
		}

		public String getKey(CollectionListRow row, int number) {
			String rule = keyRuleCombo.getText();
			return getKey(row, rule, number);
		}

		private String getKey(CollectionListRow row, String nameRule, int number) {
			Map<String, String> map = new HashMap<String, String>();
			map.put("modelName", dataModelName);
			map.put("name", row.getName());
			map.put("description", row.getDescription());
			map.put("number", Integer.toString(number));

			String key = DMDLVariableTableUtil.replaceVariable(nameRule, map);
			if (StringUtil.nonEmpty(key)) {
				return key;
			}
			return row.getKey();
		}

		void refreshkeyRuleComboItems() {
			DialogSettingsUtil.refreshComboItems(keyRuleCombo);
		}

		private void updateIndex() {
			if (!isMap) {
				List<CollectionListRow> list = getElementList();
				for (int i = 0; i < list.size(); i++) {
					list.get(i).setKey(Integer.toString(i));
				}
				refresh();
			}
		}
	}

	protected void doSelectionChange(ITreeSelection selection) {
		boolean copy = false;

		if (selection != null) {
			for (@SuppressWarnings("unchecked")
			Iterator<DMDLTreeData> i = selection.iterator(); i.hasNext();) {
				DMDLTreeData data = i.next();
				Object obj = data.getData();
				if (obj instanceof ModelDefinition) {
					ModelDefinition model = (ModelDefinition) obj;
					copy |= enableCopy(model, null);
				} else if (obj instanceof Property) {
					ModelDefinition model = (ModelDefinition) data.getParent().getData();
					Property prop = (Property) obj;
					copy |= enableCopy(model, prop);
				}
			}
		}

		copyButton.setEnabled(copy);
	}

	protected boolean enableCopy(ModelDefinition model, Property prop) {
		return prop != null;
	}

	boolean enableCopy(ITreeSelection selection) {
		boolean copy = false;

		for (@SuppressWarnings("unchecked")
		Iterator<DMDLTreeData> i = selection.iterator(); i.hasNext();) {
			DMDLTreeData data = i.next();
			Object obj = data.getData();
			if (obj instanceof ModelDefinition) {
				ModelDefinition model = (ModelDefinition) obj;
				copy |= enableCopy(model, null);
			} else if (obj instanceof Property) {
				ModelDefinition model = (ModelDefinition) data.getParent().getData();
				Property prop = (Property) obj;
				copy |= enableCopy(model, prop);
			}
		}

		return copy;
	}

	void doCopy() {
		ITreeSelection selection = sourceViewer.getSelection();
		if (selection.isEmpty()) {
			return;
		}
		int index = table.getSelectionIndex();
		doCopy(selection, index);
	}

	protected void doCopy(ITreeSelection selection, int index) {
		@SuppressWarnings("unchecked")
		Iterator<DMDLTreeData> iterator = selection.iterator();
		doCopy(index, iterator);
		table.refresh();
	}

	protected void doCopy(int index, Iterator<DMDLTreeData> iterator) {
		for (Iterator<DMDLTreeData> i = iterator; i.hasNext();) {
			DMDLTreeData data = i.next();
			Object obj = data.getData();
			if (obj instanceof Property) {
				Property property = (Property) obj;
				PropertyExpressionType expression = PropertyUtil.getPropertyExpression(property);
				if (expression != null) {
					if (expression.isList()) {
						List<Property> list = expression.getList();
						for (Property p : list) {
							CollectionListRow row = newCopyRow(p);
							index = addToList(index, row);
						}
					} else if (expression.isMap()) {
						Map<String, Property> map = expression.getMap();
						for (Property p : map.values()) {
							CollectionListRow row = newCopyRow(p);
							index = addToList(index, row);
						}
					}
					continue;
				}

				CollectionListRow row = newCopyRow(property);
				index = addToList(index, row);
			}
		}
	}

	protected CollectionListRow newCopyRow(Property property) {
		CollectionListRow row = new CollectionListRow();
		row.name = property.getName();
		row.description = PropertyUtil.getDecodedDescription(property);
		row.dataType = PropertyUtil.getResolvedDataTypeText(property);
		return row;
	}

	protected final int addToList(int index, CollectionListRow row) {
		List<CollectionListRow> defineList = table.getElementList();
		if (index < 0) {
			if (isMap) {
				String key = table.getKey(row, index);
				row.setKey(key);
			} else {
				row.setKey(Integer.toString(defineList.size()));
			}
			defineList.add(row);
		} else {
			if (isMap) {
				String key = table.getKey(row, index);
				row.setKey(key);
			}
			defineList.add(index++, row);
			if (!isMap) {
				for (int i = index; i < defineList.size(); i++) {
					defineList.get(i).setKey(Integer.toString(i));
				}
			}
		}
		return index;
	}

	@Override
	protected void refresh() {
		tableViewer.refresh();
	}

	@Override
	protected boolean validate() {
		return true;
	}

	@Override
	protected void okPressed() {
		table.saveDialogSettings();

		List<CollectionListRow> list = table.getElementList();
		List<CollectionEntry> result = new ArrayList<CollectionEntry>(list.size());
		for (CollectionListRow row : list) {
			result.add(new CollectionEntry(row.getKey(), row.getName()));
		}
		this.propertyNameList = result;

		super.okPressed();
	}

	public List<CollectionEntry> getPropertyNameList() {
		return propertyNameList;
	}
}

class KeyRuleDialog extends SelectRuleDialog {

	private String freeValue;
	private final String firstValue;

	private Button freeButton;
	private Text freeText;

	public KeyRuleDialog(Shell parentShell, String freeValue, String value) {
		super(parentShell, "Select key rule");
		this.freeValue = freeValue;
		this.firstValue = value;
	}

	@Override
	protected void createFields(Composite composite) {
		createRadioButton(composite, "property name", "$(name)");
		createRadioButton(composite, "property name (camelCase)", "$(name.toLowerCamelCase)");
		createRadioButton(composite, "sequencial numer", "$(number.1.%d)");
		ButtonTextPair pair = createRadioButton(composite, "free text", SWT.BORDER, freeValue);
		this.freeButton = pair.button;
		this.freeText = pair.text;
		freeText.addFocusListener(new FocusListener() {
			public void focusGained(FocusEvent e) {
				setSelection(freeButton);
			}

			public void focusLost(FocusEvent e) {
				refreshOkButton();
			}
		});

		for (Button button : getButtonList()) {
			String data = (String) button.getData();
			if (data.equals(firstValue)) {
				setSelection(button);
				break;
			}
		}
	}

	@Override
	protected boolean validate() {
		if (freeButton.getSelection()) {
			String text = freeText.getText().trim();
			if (text.isEmpty()) {
				return false;
			}
			freeButton.setData(text);
		}

		return super.validate();
	}

	@Override
	protected void okPressed() {
		freeValue = freeText.getText().trim();

		super.okPressed();
	}

	public String getFreeValue() {
		return freeValue;
	}
}

class EditCollectionKeyDialog extends EditDialog {
	private final CollectionListRow row;
	private Text keyText;
	private Text nameText;
	private Text descText;
	private Text typeText;

	public EditCollectionKeyDialog(Shell parentShell, CollectionListRow row) {
		super(parentShell, "キー名編集", 2);
		this.row = row;
	}

	@Override
	protected void createFields(Composite composite) {
		keyText = createTextField(composite, "key");
		keyText.setText(nonNull(row.getKey()));
		nameText = createTextField(composite, "name");
		nameText.setText(nonNull(row.getName()));
		nameText.setEditable(false);
		descText = createTextField(composite, "description");
		descText.setText(nonNull(row.getDescription()));
		descText.setEditable(false);
		typeText = createTextField(composite, "type");
		typeText.setText(nonNull(row.getDataType()));
		typeText.setEditable(false);
	}

	@Override
	protected void refresh() {
		// do nothing
	}

	@Override
	protected boolean validate() {
		String key = keyText.getText();
		if (key.trim().isEmpty()) {
			return false;
		}
		return true;
	}

	@Override
	protected void okPressed() {
		row.setKey(keyText.getText().trim());

		super.okPressed();
	}
}
