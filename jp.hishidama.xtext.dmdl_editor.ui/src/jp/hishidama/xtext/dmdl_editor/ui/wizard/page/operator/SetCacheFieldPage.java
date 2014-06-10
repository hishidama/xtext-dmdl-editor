package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.eclipse_plugin.jdt.util.TypeUtil;
import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;

import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

public class SetCacheFieldPage extends EditWizardPage {

	private IType type;
	private SelectOperatorInputModelPage inputPage;
	private SelectOperatorOutputModelPage outputPage;
	private boolean defaultCheck;

	private FieldCacheTable table;
	private Button button1;
	private Button button2;

	public SetCacheFieldPage(IType type, OperatorType opType, SelectOperatorInputModelPage inputPage,
			SelectOperatorOutputModelPage outputPage, boolean defaultCheck) {
		super("SetCacheFieldPage");

		setTitle("演算子で使用するフィールドの指定");
		setDescription("キャッシュ用オブジェクトをフィールドに定義する場合、そのデータモデルを指定して下さい。");

		this.type = type;
		this.inputPage = inputPage;
		this.outputPage = outputPage;
		this.defaultCheck = defaultCheck;
	}

	protected List<FieldCacheRow> getInitialRow() {
		List<FieldCacheRow> rowList = new ArrayList<FieldCacheRow>();
		if (inputPage != null) {
			List<OperatorInputModelRow> list = inputPage.getElementList();
			for (OperatorInputModelRow irow : list) {
				FieldCacheRow row = new FieldCacheRow();
				row.name = irow.name;
				row.modelClassName = irow.modelClassName;
				row.modelName = irow.modelName;
				row.modelDescription = irow.modelDescription;
				rowList.add(row);
			}
		}
		if (outputPage != null) {
			for (OperatorOutputModelRow orow : outputPage.getElementList()) {
				FieldCacheRow row = new FieldCacheRow();
				row.name = orow.name;
				row.modelClassName = orow.modelClassName;
				row.modelName = orow.modelName;
				row.modelDescription = orow.modelDescription;
				rowList.add(row);
			}
		}
		return rowList;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		{
			composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			composite.setLayout(new GridLayout(2, false));
		}

		createTableField(composite);
		createPositionField(composite);
		createNoteField(composite);

		return composite;
	}

	protected void createTableField(Composite composite) {
		createLabel(composite, "field:");
		table = new FieldCacheTable(composite);
		table.addColumn("name", 128, SWT.NONE);
		table.addColumn("model name", 128, SWT.NONE);
		table.addColumn("model description", 128, SWT.NONE);
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
			// field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			field.setLayout(new FillLayout(SWT.HORIZONTAL));
			table.createCheckButtonArea(field);
		}
	}

	protected void createPositionField(Composite composite) {
		createLabel(composite, "position:");
		Composite field = new Composite(composite, SWT.NONE);
		GridDataFactory.swtDefaults().applyTo(field);
		field.setLayout(new FillLayout());

		button1 = new Button(field, SWT.RADIO);
		button1.setText("after last field");
		button2 = new Button(field, SWT.RADIO);
		button2.setText("before created method");
		button1.setSelection(true);
	}

	protected void createNoteField(Composite composite) {
		Group group = new Group(composite, SWT.SHADOW_IN);
		group.setText("note");
		GridDataFactory.fillDefaults().grab(true, false).span(2, 1).applyTo(group);
		group.setLayout(new FillLayout());

		createLabel(group, "フィールドに定義したデータモデルオブジェクトは、異なる演算子メソッド間で個別に使用することが出来ます。\n"
				+ "（実行時にはOperatorインスタンスは演算子(メソッド)毎に作られるため、複数の演算子メソッドがフィールドのインスタンスに同時にアクセスすることはありません）\n"
				+ "（ただし、当然staticフィールドはその限りではありません。そもそも分散環境で実行されるので、共有されるわけでもありません）");
	}

	private boolean firstVisible = true;

	@Override
	public void setVisible(boolean visible) {
		if (visible) {
			List<FieldCacheRow> list = table.getCheckedElementList();
			Map<String, Integer> map = new HashMap<String, Integer>(list.size());
			for (FieldCacheRow row : list) {
				map.put(row.name, -1);
			}

			table.removeAll();
			int index = 0;
			for (FieldCacheRow row : getInitialRow()) {
				table.addItem(row);
				if (map.containsKey(row.name)) {
					map.put(row.name, index);
				}
				index++;
			}
			table.refresh();

			for (int i : map.values()) {
				if (i >= 0) {
					table.setChecked(i, true);
				}
			}

			if (firstVisible) {
				firstVisible = false;
				if (defaultCheck) {
					table.setCheckedAll(true);
					validate(true);
				}
			}
		}
		super.setVisible(visible);
	}

	protected class FieldCacheTable extends ModifiableTable<FieldCacheRow> {

		public FieldCacheTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.FULL_SELECTION | SWT.CHECK);
			setEnableButton(false, true, true, false);
		}

		@Override
		protected String getText(FieldCacheRow element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return element.name;
			case 1:
				return element.modelName;
			case 2:
				return element.modelDescription;
			default:
				throw new UnsupportedOperationException("columnIndex=" + columnIndex);
			}
		}

		@Override
		protected FieldCacheRow createElement() {
			return new FieldCacheRow();
		}

		@Override
		protected void editElement(FieldCacheRow element) {
			FieldCacheDialog dialog = new FieldCacheDialog(getShell(), element);
			if (dialog.open() != Window.OK) {
				return;
			}
			refresh();
			validate(true);
		}

		@Override
		protected void widgetChecked(SelectionEvent e) {
			validate(isVisible());
		}
	}

	@Override
	protected String validate() {
		List<FieldCacheRow> list = table.getCheckedElementList();
		{
			Set<String> set = new HashSet<String>(list.size());
			for (FieldCacheRow row : list) {
				String name = row.name;
				if (set.contains(name)) {
					return MessageFormat.format("フィールド名が重複しています。name={0}", name);
				}
				set.add(name);
			}
		}
		{
			Map<String, String> map = getExistsFieldMap();
			for (FieldCacheRow row : list) {
				String name = row.name;
				String exists = map.get(name);
				if (exists != null) {
					if (!exists.equals(row.modelClassName)) {
						return MessageFormat.format("同名で異なる型のフィールドがOperatorクラス内に存在しています。name={0}, type={1}", name,
								exists);
					}
				}
			}
		}
		return null;
	}

	private Map<String, String> fieldMap;

	private Map<String, String> getExistsFieldMap() {
		if (fieldMap == null) {
			fieldMap = new HashMap<String, String>();
			try {
				for (IJavaElement c : type.getChildren()) {
					if (c instanceof IField) {
						IField field = (IField) c;
						fieldMap.put(field.getElementName(), TypeUtil.getFieldTypeName(field));
					}
				}
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
		}
		return fieldMap;
	}

	public List<FieldCacheRow> getCheckedFieldList() {
		return table.getCheckedElementList();
	}

	public List<FieldCacheRow> getCreateFieldList() {
		List<FieldCacheRow> list = getCheckedFieldList();
		List<FieldCacheRow> result = new ArrayList<FieldCacheRow>(list.size());
		Map<String, String> map = getExistsFieldMap();
		for (FieldCacheRow row : list) {
			if (!map.containsKey(row.name)) {
				result.add(row);
			}
		}
		return result;
	}

	public int getCreatePosition() {
		if (button2.getSelection()) {
			return 1;
		}
		return 0;
	}
}
