package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.statement;

import java.util.List;

import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil.PropertyFilter;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SelectDataModelPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SelectDataModelPage.ModelFile;

import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class SelectPropertyPage extends EditWizardPage {

	private SelectDataModelPage modelPage;

	private PropertyTable table;

	public SelectPropertyPage(SelectDataModelPage modelPage) {
		super("SelectPropertyPage");

		setTitle("プロパティーの選択");
		setDescription("作成対象となるプロパティーを選択して下さい。");

		this.modelPage = modelPage;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		{
			composite.setLayoutData(new GridData(GridData.FILL_BOTH));

			composite.setLayout(new GridLayout(1, false));
		}

		createPropertyTable(composite);

		return composite;
	}

	protected void createPropertyTable(Composite composite) {
		table = new PropertyTable(composite);
		table.addColumn("name", 256, SWT.NONE);
		table.addColumn("type", 96, SWT.NONE);
		table.addColumn("description", 256, SWT.NONE);
		{
			Composite field = new Composite(composite, SWT.NONE);
			GridDataFactory.swtDefaults().grab(true, false).applyTo(field);
			field.setLayout(new FillLayout());
			table.createButtonArea(field);
		}
		{
			Composite field = new Composite(composite, SWT.NONE);
			GridDataFactory.swtDefaults().grab(true, false).applyTo(field);
			field.setLayout(new FillLayout());
			table.createCheckButtonArea(field);
		}
	}

	protected class PropertyTable extends ModifiableTable<PropertyRow> {

		public PropertyTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.FULL_SELECTION | SWT.MULTI | SWT.CHECK);
			setEnableButton(false, false, true, false);
		}

		@Override
		protected String getText(PropertyRow element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return element.name;
			case 1:
				return element.type;
			case 2:
				return element.description;
			default:
				throw new UnsupportedOperationException("columnIndex=" + columnIndex);
			}
		}

		@Override
		protected PropertyRow createElement() {
			throw new IllegalStateException();
		}

		@Override
		protected void editElement(PropertyRow element) {
			throw new IllegalStateException();
		}

		@Override
		protected void widgetChecked(SelectionEvent e) {
			validate(isVisible());
		}
	}

	@Override
	public void setVisible(boolean visible) {
		if (visible) {
			refreshTable();
		}
		super.setVisible(visible);
	}

	private ModelDefinition nowModel;

	private void refreshTable() {
		List<ModelFile> mlist = modelPage.getModelList();
		if (mlist.size() <= 0) {
			return;
		}
		ModelDefinition model = mlist.get(0).model;
		if (model == nowModel) {
			return;
		}
		nowModel = model;

		table.removeAll();
		List<Property> plist = ModelUtil.getProperties(model, PropertyFilter.ALL);
		for (Property property : plist) {
			PropertyRow row = new PropertyRow();
			row.name = property.getName();
			row.description = PropertyUtil.getDecodedDescription(property);
			row.type = PropertyUtil.getResolvedDataTypeText(property);
			table.addItem(row);
		}
		table.refresh();
		table.setCheckedAll(true);

		validate(true);
	}

	@Override
	protected String validate() {
		List<PropertyRow> list = table.getCheckedElementList();
		if (list.isEmpty()) {
			return "プロパティーを選択して下さい。";
		}
		return null;
	}

	public List<PropertyRow> getPropertyList() {
		return table.getCheckedElementList();
	}
}
