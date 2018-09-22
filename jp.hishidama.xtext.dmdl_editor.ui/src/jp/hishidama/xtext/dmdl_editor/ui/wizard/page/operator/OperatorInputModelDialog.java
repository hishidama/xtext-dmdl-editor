package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil.PropertyFilter;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class OperatorInputModelDialog extends OperatorModelDialog<OperatorInputModelRow> {

	private boolean hasList;
	private boolean hasKey;
	private boolean hasOrder;

	private List<Property> propertyList;
	private Map<String, NamePair> oldKeyMap;
	private Map<String, NamePair> oldOrderMap;

	private KeyTable keyTable;
	private KeyTable orderTable;
	private Button onceButton;
	private Button iterableButton;

	private static class NamePair {
		public int index;
		public String name;
		public String order;
	}

	public OperatorInputModelDialog(Shell parentShell, IProject project, String role, OperatorInputModelRow row, boolean hasList, boolean hasKey, boolean hasOrder, boolean joinOnly) {
		super(parentShell, "入力データモデル選択", project, role, row, joinOnly, false);
		this.hasList = hasList;
		this.hasKey = hasKey;
		this.hasOrder = hasOrder;

		if (row.keyList != null) {
			oldKeyMap = new HashMap<String, NamePair>();
			int i = 0;
			for (String name : row.keyList) {
				NamePair pair = new NamePair();
				pair.index = i++;
				pair.name = name;
				oldKeyMap.put(name, pair);
			}
		}
		if (row.orderList != null) {
			oldOrderMap = new HashMap<String, NamePair>();
			int i = 0;
			for (String s : row.orderList) {
				String name, order;
				{
					int n = s.indexOf(' ');
					if (n >= 0) {
						name = s.substring(0, n);
						order = s.substring(n + 1);
					} else {
						name = s;
						order = null;
					}
				}
				NamePair pair = new NamePair();
				pair.index = i++;
				pair.name = name;
				pair.order = order;
				oldOrderMap.put(name, pair);
			}
		}
	}

	@Override
	protected void createFields(Composite composite) {
		super.createFields(composite);

		if (hasKey) {
			createLabel(composite, "@Key.group");
			createKeyGroupTable(composite);

			createLabel(composite, "");
			Composite field = createFillLayout(composite, 2);
			keyTable.createCheckButtonArea(field);
			keyTable.createButtonArea(field);

			initializeKeys(nonNull(row.modelName));
			initializeKeyGroupTable();
		}
		if (hasOrder) {
			createLabel(composite, "@Key.order");
			createKeyOrderTable(composite);

			createLabel(composite, "");
			Composite field = createFillLayout(composite, 2);
			orderTable.createCheckButtonArea(field);
			orderTable.createButtonArea(field);
			orderTable.createOrderButton(field);

			initializeKeys(nonNull(row.modelName));
			initializeKeyOrderTable();
		}
		if (hasList) {
			createLabel(composite, "list type");
			Composite field = createRowLayout(composite);
			onceButton = createCheckButton(field, "@Once");
			onceButton.setSelection(row.once);

			List<Button> list = createRadioField(field, null, "List", "Iterable");
			iterableButton = list.get(1);
			boolean iterable = "java.lang.Iterable".equals(row.listClassName);
			list.get(0).setSelection(!iterable);
			list.get(1).setSelection(iterable);
		}
	}

	@Override
	protected void selectDataModel(ModelDefinition model, String modelName) {
		super.selectDataModel(model, modelName);

		if (hasKey) {
			initializeKeys(modelName);
			initializeKeyGroupTable();
			if (hasOrder) {
				initializeKeyOrderTable();
			}
		}
	}

	private void createKeyGroupTable(Composite panel) {
		KeyTable table = keyTable = new KeyTable(panel);
		table.addColumn("name", 128 + 32, SWT.NONE);
		table.addColumn("description", 128 + 32, SWT.NONE);
	}

	private void createKeyOrderTable(Composite panel) {
		KeyTable table = orderTable = new KeyTable(panel);
		table.addColumn("name", 128 + 32, SWT.NONE);
		table.addColumn("description", 128 + 32, SWT.NONE);
		table.addColumn("order", 64, SWT.NONE);
	}

	private static class KeyRow {
		public int checked;
		public String name;
		public String description;
		public String order;

		public String getNameOrder() {
			if (StringUtil.isEmpty(order)) {
				return name;
			}
			return String.format("%s %s", name, order);
		}
	}

	private static class KeyTable extends ModifiableTable<KeyRow> {

		public KeyTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION | SWT.CHECK);
		}

		@Override
		protected GridData createGridData() {
			GridData data = super.createGridData();
			data.horizontalSpan = 2;
			return data;
		}

		@Override
		protected String getText(KeyRow element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return element.name;
			case 1:
				return element.description;
			case 2:
				return element.order;
			default:
				throw new UnsupportedOperationException("columnIndex=" + columnIndex);
			}
		}

		@Override
		protected void createAddButton(Composite field) {
			// do nothing
		}

		@Override
		protected void createEditButton(Composite field) {
			// do nothing
		}

		@Override
		protected void createDeleteButton(Composite field) {
			// do nothing
		}

		public void createOrderButton(Composite field) {
			{
				Button button = new Button(field, SWT.PUSH);
				button.setText("ASC");
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						doSetOrder("ASC");
					}
				});
				selectionButton.add(button);
			}
			{
				Button button = new Button(field, SWT.PUSH);
				button.setText("DESC");
				button.addSelectionListener(new SelectionAdapter() {
					@Override
					public void widgetSelected(SelectionEvent e) {
						doSetOrder("DESC");
					}
				});
				selectionButton.add(button);
			}
		}

		protected void doSetOrder(String order) {
			int[] index = table.getSelectionIndices();
			List<KeyRow> list = getElementList();
			for (int i : index) {
				KeyRow key = list.get(i);
				key.order = order;
			}
			refresh();
		}

		@Override
		protected KeyRow createElement() {
			throw new IllegalStateException();
		}

		@Override
		protected void editElement(KeyRow element) {
			// do nothing
		}
	}

	private String oldModelName = null;

	private void initializeKeys(String modelName) {
		if (modelName.equals(oldModelName)) {
			return;
		}
		oldModelName = modelName;

		ModelDefinition model = ModelUiUtil.findModel(project, modelName);
		propertyList = ModelUtil.getProperties(model, PropertyFilter.PROPERTY);
	}

	private void initializeKeyGroupTable() {
		initializeTable(keyTable, oldKeyMap);
		oldKeyMap = null;
	}

	private void initializeKeyOrderTable() {
		initializeTable(orderTable, oldOrderMap);
		oldOrderMap = null;
	}

	private void initializeTable(KeyTable table, Map<String, NamePair> oldMap) {
		if (table == null) {
			return;
		}
		if (oldMap == null) {
			oldMap = new HashMap<String, NamePair>();
			List<KeyRow> list = table.getElementList();
			for (int i = 0; i < list.size(); i++) {
				if (table.getChecked(i)) {
					KeyRow key = list.get(i);
					NamePair pair = new NamePair();
					pair.index = i;
					pair.name = key.name;
					pair.order = key.order;
					oldMap.put(pair.name, pair);
				}
			}
		}
		table.removeAll();

		List<KeyRow> list = new ArrayList<KeyRow>(propertyList.size());
		for (Property property : propertyList) {
			KeyRow key = new KeyRow();
			key.name = property.getName();
			key.description = PropertyUtil.getDecodedDescriptionText(property);
			NamePair old = oldMap.get(key.name);
			if (old != null) {
				key.checked = old.index;
				key.order = old.order;
			} else {
				key.checked = Short.MAX_VALUE;
			}
			list.add(key);
		}
		Collections.sort(list, new Comparator<KeyRow>() {
			// @Override
			public int compare(KeyRow o1, KeyRow o2) {
				return o1.checked - o2.checked;
			}
		});
		for (KeyRow row : list) {
			table.addItem(row);
		}
		table.refresh();

		int i = 0;
		for (KeyRow key : list) {
			if (key.checked != Short.MAX_VALUE) {
				table.setChecked(i, true);
			}
			i++;
		}
	}

	@Override
	protected void okPressed() {
		if (hasList) {
			row.once = onceButton.getSelection();
			if (iterableButton.getSelection()) {
				row.listClassName = "java.lang.Iterable";
			} else {
				row.listClassName = "java.util.List";
			}
		}
		if (hasKey) {
			row.keyList = new ArrayList<String>();
			List<KeyRow> list = keyTable.getCheckedElementList();
			for (KeyRow key : list) {
				row.keyList.add(key.name);
			}
		}
		if (hasOrder) {
			row.orderList = new ArrayList<String>();
			List<KeyRow> list = orderTable.getCheckedElementList();
			for (KeyRow key : list) {
				row.orderList.add(key.getNameOrder());
			}
		}

		super.okPressed();
	}
}
