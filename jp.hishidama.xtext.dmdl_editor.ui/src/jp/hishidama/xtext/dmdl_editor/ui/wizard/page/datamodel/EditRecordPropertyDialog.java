package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel;

import java.util.List;
import java.util.Map;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil.PropertyFilter;
import jp.hishidama.xtext.dmdl_editor.ui.dialog.DmdlModelSelectionDialog;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel.PropertyCollection.CollectionEntry;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

public class EditRecordPropertyDialog extends EditDialog {
	private static final String DATA_TYPE_LIST = "{list}";
	private static final String DATA_TYPE_MAP = "{map}";
	private static final String DATA_TYPE_REF = "{reference}";
	private static final String[] DATA_TYPE = { "INT", "LONG", "FLOAT", "DOUBLE", "TEXT", "DECIMAL", "DATE", "DATETIME", "BOOLEAN", "BYTE", "SHORT", DATA_TYPE_LIST, DATA_TYPE_MAP, DATA_TYPE_REF };

	private IProject project;
	private String modelName;
	private DataModelRecordRow row;

	private Button radio1, radio2;
	private Text nameText;
	private Text descText;
	private Combo typeCombo;
	private Text propertyCollectionText;
	private Button propertyCollectionButton;
	private Text refModelText;
	private Button refModelButton;

	public EditRecordPropertyDialog(Shell parentShell, IProject project, String modelName, DataModelRecordRow row) {
		super(parentShell, "プロパティー編集");
		this.project = project;
		this.modelName = modelName;
		this.row = row;
	}

	@Override
	protected void createFields(Composite composite) {
		{
			Button button = new Button(composite, SWT.RADIO);
			button.setText("プロパティー");
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					refreshField(true, false);
					refreshOkButton();
				}
			});
			radio1 = button;

			Group group = new Group(composite, SWT.SHADOW_IN);
			GridData grid = new GridData(GridData.FILL_HORIZONTAL);
			group.setLayoutData(grid);
			group.setLayout(new GridLayout(3, false));

			nameText = createTextField(group, "name");
			nameText.setText(nonNull(row.getName()));
			descText = createTextField(group, "description");
			descText.setText(nonNull(row.getDescription()));
			typeCombo = createComboFieldFull(group, "type", DATA_TYPE);
			String dataType = getDataTypeText(row.getDataType(), row.propertyCollection);
			typeCombo.setText(dataType);
			TextButtonPair r = createTextButtonField(group, "collection", "edit");
			r.label.setToolTipText("collection type (afw0.9.2-)");
			propertyCollectionText = r.text;
			propertyCollectionText.setEditable(false);
			propertyCollectionButton = r.button;
			propertyCollectionButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					doPropertyCollectionEdit();
				}
			});
			if (row.propertyCollection != null) {
				propertyCollectionText.setText(row.propertyCollection);
			}
			if (dataType.startsWith("{")) {
				propertyCollectionButton.setEnabled(true);
			} else {
				propertyCollectionButton.setEnabled(false);
			}
		}
		{
			Button button = new Button(composite, SWT.RADIO);
			button.setText("データモデル参照");
			button.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					refreshField(false, true);
					refreshOkButton();
				}
			});
			radio2 = button;

			Group group = new Group(composite, SWT.SHADOW_IN);
			GridData grid = new GridData(GridData.FILL_HORIZONTAL);
			group.setLayoutData(grid);
			group.setLayout(new GridLayout(3, false));
			TextButtonPair r = createTextButtonField(group, "reference model name", "select");
			refModelText = r.text;
			refModelText.setText(nonNull(row.getRefModelName()));
			refModelButton = r.button;
			refModelButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					referenceModel();
				}
			});
		}

		nameText.setFocus();
	}

	private String getDataTypeText(String rowDataType, String expression) {
		if (PropertyCollection.isReference(nonNull(expression))) {
			return DATA_TYPE_REF;
		}

		String dataType = nonNull(rowDataType);
		if (dataType.startsWith("{:") || dataType.equals(DATA_TYPE_MAP)) {
			return DATA_TYPE_MAP;
		}
		if (dataType.startsWith("{")) {
			return DATA_TYPE_LIST;
		}
		return dataType;
	}

	void doPropertyCollectionEdit() {
		String type = typeCombo.getText();
		if (DATA_TYPE_LIST.equals(type) || DATA_TYPE_MAP.equals(type)) {
			String text = propertyCollectionText.getText();
			String elementType = PropertyCollection.getElementType(text);
			List<CollectionEntry> nameList = PropertyCollection.getNameList(text);
			boolean isMap = DATA_TYPE_MAP.equals(type);
			CollectionListDialog dialog = new CollectionListDialog(getShell(), project, modelName, isMap, elementType, nameList);
			if (dialog.open() == Window.OK) {
				elementType = dialog.getElementType();
				nameList = dialog.getPropertyNameList();
				propertyCollectionText.setText(PropertyCollection.toText(isMap, elementType, nameList));
			}
			return;
		} else if (DATA_TYPE_REF.equals(type)) {
			String text = propertyCollectionText.getText();
			boolean isMap = PropertyCollection.isMap(text);
			String elementType = PropertyCollection.getElementType(text);
			String refName = PropertyCollection.getReferenceName(text);
			CollectionRefDialog dialog = new CollectionRefDialog(getShell(), project, modelName, isMap, elementType, refName);
			if (dialog.open() == Window.OK) {
				isMap = dialog.isMap();
				elementType = dialog.getElementType();
				refName = dialog.getReferenceName();
				propertyCollectionText.setText(PropertyCollection.toText(isMap, elementType, refName));
			}
		}
	}

	void refreshField(boolean enable1, boolean enable2) {
		nameText.setEnabled(enable1);
		descText.setEnabled(enable1);
		typeCombo.setEnabled(enable1);
		refModelText.setEnabled(enable2);
		refModelButton.setEnabled(enable2);
	}

	void referenceModel() {
		DmdlModelSelectionDialog dialog = new DmdlModelSelectionDialog(getShell(), project);
		dialog.setInitialModel(refModelText.getText().trim());
		if (dialog.open() == Window.OK) {
			ModelDefinition model = dialog.getSelectedDataModel();
			refModelText.setText(nonNull(model.getName()));
		}
	}

	@Override
	protected void refresh() {
		if (refModelText.getText().isEmpty()) {
			radio1.setSelection(true);
			refreshField(true, false);
		} else {
			radio2.setSelection(true);
			refreshField(false, true);
		}
		refreshOkButton();
	}

	@Override
	protected boolean validate() {
		if (radio1.getSelection()) {
			String type = typeCombo.getText();
			propertyCollectionButton.setEnabled(type.startsWith("{"));

			if (StringUtil.isEmpty(nameText.getText().trim())) {
				return false;
			}
			if (StringUtil.isEmpty(type)) {
				return false;
			}
		}
		if (radio2.getSelection()) {
			if (StringUtil.isEmpty(refModelText.getText().trim())) {
				return false;
			}
		}
		return true;
	}

	@Override
	protected void okPressed() {
		if (radio1.getSelection()) {
			row.setName(nameText.getText().trim());
			row.setDescription(descText.getText());
			String dataType = typeCombo.getText();
			if (DATA_TYPE_LIST.equals(dataType) || DATA_TYPE_MAP.equals(dataType)) {
				boolean isMap = DATA_TYPE_MAP.equals(dataType);
				String text = propertyCollectionText.getText();
				{
					String elementType = PropertyCollection.getElementType(text);
					List<CollectionEntry> nameList = PropertyCollection.getNameList(text);
					row.propertyCollection = PropertyCollection.toText(isMap, elementType, nameList);
				}

				String type = PropertyCollection.getType(text);
				List<CollectionEntry> list = PropertyCollection.getNameList(text);
				if (type != null) {
					row.setDataType(type);
				} else {
					row.setDataType(dataType);
					Map<String, Property> propertyMap = ModelUiUtil.getPropertiesMap(project, modelName, PropertyFilter.ALL);
					for (CollectionEntry entry : list) {
						Property p = propertyMap.get(entry.name);
						String t = PropertyUtil.getResolvedDataTypeText(p);
						if (!t.isEmpty()) {
							if (isMap) {
								row.setDataType("{:" + t + "}");
							} else {
								row.setDataType("{" + t + "}");
							}
							break;
						}
					}
				}
			} else if (DATA_TYPE_REF.equals(dataType)) {
				String text = propertyCollectionText.getText();
				boolean isMap;
				{
					String type = PropertyCollection.getType(text);
					if (type != null) {
						row.setDataType(type);
						isMap = type.contains(":");
					} else {
						row.setDataType(dataType);
						isMap = dataType.contains(":");
					}
				}
				{
					String elementType = PropertyCollection.getElementType(text);
					String refName = PropertyCollection.getReferenceName(text);
					row.propertyCollection = PropertyCollection.toText(isMap, elementType, refName);
				}
			} else {
				row.setDataType(dataType);
			}
			row.setRefModelName(null);
		}
		if (radio2.getSelection()) {
			row.setName(null);
			row.setDescription(null);
			row.setDataType(null);
			row.setRefModelName(refModelText.getText().trim());
		}

		super.okPressed();
	}
}
