package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Type;
import jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelDefinitionImpl;
import jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyDefinitionImpl;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData.ModelNode;
import jp.hishidama.xtext.dmdl_editor.util.DMDLStringUtil;
import jp.hishidama.xtext.dmdl_editor.validation.ValidationUtil;

import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.TreeItem;

class DataModelJoinRow extends DataModelRow {
	public static final String TP_NAME = "name";
	public static final String TP_DESC = "description";
	public static final String TP_REF_MODEL = "refModel";
	public static final String TP_REF_PROPERTY = "refProperty";

	public String name;
	public String description;
	public String refModelName;
	public String refProperty;

	public ModelDefinition info;
	public Property prop;

	@Override
	public String getText(int columnIndex) {
		switch (columnIndex) {
		case 0:
			return name;
		case 1:
			return description;
		case 2:
			return refModelName;
		case 3:
			return refProperty;
		default:
			throw new UnsupportedOperationException(MessageFormat.format("index={0}", columnIndex));
		}
	}

	@Override
	public Object getValue(String property) {
		if (property.equals(TP_NAME)) {
			return nonNull(name);
		}
		if (property.equals(TP_DESC)) {
			return nonNull(description);
		}
		if (property.equals(TP_REF_MODEL)) {
			return nonNull(refModelName);
		}
		if (property.equals(TP_REF_PROPERTY)) {
			return nonNull(refProperty);
		}
		throw new UnsupportedOperationException(MessageFormat.format("property={0}", property));
	}

	@Override
	public boolean modify(String property, Object value) {
		if (property.equals(TP_NAME)) {
			String text = ((String) value).trim();
			this.name = text;
			return true;
		}
		if (property.equals(TP_DESC)) {
			String text = ((String) value).trim();
			this.description = text;
			return false;
		}
		if (property.equals(TP_REF_MODEL)) {
			String text = ((String) value).trim();
			this.refModelName = text;
			this.info = null;
			return true;
		}
		if (property.equals(TP_REF_PROPERTY)) {
			String text = ((String) value).trim();
			this.refProperty = text;
			this.prop = null;
			return true;
		}
		throw new UnsupportedOperationException(MessageFormat.format("property={0}", property));
	}

	@Override
	public String validate() {
		if (StringUtil.nonEmpty(name)) {
			String message = ValidationUtil.validateName("プロパティー名", name);
			if (message != null) {
				return message;
			}
		}
		if (StringUtil.isEmpty(refModelName)) {
			return "結合元データモデルは必須です。";
		}
		return null;
	}
}

public class CreateDataModelJoinPage extends CreateDataModelPage<DataModelJoinRow> {

	public CreateDataModelJoinPage() {
		super("CreateDataModelNormalPage", "結合データモデルの作成", "結合データモデルのプロパティーを定義して下さい。（結合キーは次ページで定義します）");
	}

	@Override
	protected String getSourceLabelText() {
		return "結合元データモデルの候補";
	}

	@Override
	protected void defineColumns(Table table) {
		addColumn("name", 128, DataModelJoinRow.TP_NAME, new TextCellEditor(table));
		addColumn("description", 128, DataModelJoinRow.TP_DESC, new TextCellEditor(table));
		addColumn("src model", 128, DataModelJoinRow.TP_REF_MODEL, new TextCellEditor(table));
		addColumn("src property", 128, DataModelJoinRow.TP_REF_PROPERTY, new TextCellEditor(table));
	}

	@Override
	protected DataModelJoinRow newAddRow() {
		return new DataModelJoinRow();
	}

	@Override
	protected String getCopyToolTipText() {
		return "データモデルのプロパティーを結合モデルの対象にします。\n" + "例えばp1とp2をコピーすると、\n" + "joined model = src -> { p1->p1; p2->p2; };\n"
				+ "となります。";
	}

	@Override
	protected DataModelJoinRow newCopyRow(ModelDefinition model, Property prop) {
		DataModelJoinRow row = new DataModelJoinRow();
		row.name = prop.getName();
		row.description = DMDLStringUtil.decodeDescription(prop.getDescription());
		row.refModelName = model.getName();
		row.refProperty = prop.getName();
		row.info = model;
		row.prop = prop;
		return row;
	}

	@Override
	protected String getReferenceToolTipText() {
		return "データモデルを結合モデルの対象にします。\n" + "例えばm1とm2を参照すると、\n" + "joined model = m1 + m2;\n" + "となります。";
	}

	@Override
	protected boolean enableReference(ModelDefinition info, Property prop) {
		return info != null;
	}

	@Override
	protected DataModelJoinRow newReferenceRow(ModelDefinition model, Property prop) {
		DataModelJoinRow row = new DataModelJoinRow();
		row.refModelName = model.getName();
		return row;
	}

	@Override
	protected String getModelType() {
		return "joined";
	}

	@Override
	protected void setGenerator(DataModelTextGenerator gen, TableItem[] items) {
		Map<String, List<DataModelJoinRow>> map = getSort(items);
		for (List<DataModelJoinRow> list : map.values()) {
			for (DataModelJoinRow row : list) {
				setGeneratorProperty(gen, row);
			}
		}
	}

	private Map<String, List<DataModelJoinRow>> getSort(TableItem[] items) {
		Map<String, List<DataModelJoinRow>> map = new LinkedHashMap<String, List<DataModelJoinRow>>();
		for (TableItem item : items) {
			DataModelJoinRow row = (DataModelJoinRow) item.getData();
			String name = row.refModelName;
			List<DataModelJoinRow> list = map.get(name);
			if (list == null) {
				list = new ArrayList<DataModelJoinRow>();
			}
			list.add(row);
			map.put(name, list);
		}
		return map;
	}

	@Override
	protected void setGeneratorProperty(DataModelTextGenerator gen, DataModelJoinRow row) {
		if (StringUtil.nonEmpty(row.name)) {
			gen.appendRefProperty(row.name, row.description, row.refModelName, row.refProperty);
		} else {
			gen.appendRefProperty(row.refModelName);
		}
	}

	public List<DMDLTreeData> getSelectedModelList() {
		TableItem[] items = tableViewer.getTable().getItems();
		Map<String, List<DataModelJoinRow>> map = getSort(items);

		List<DMDLTreeData> result = new ArrayList<DMDLTreeData>(map.size());
		for (List<DataModelJoinRow> list : map.values()) {
			String modelName = null;
			ModelDefinition info = null;
			List<Property> plist = null;
			List<DMDLTreeData> children = new ArrayList<DMDLTreeData>();
			for (DataModelJoinRow row : list) {
				if (modelName == null) {
					modelName = row.refModelName;
				}
				if (row.info != null) {
					info = row.info;
				} else {
					info = findModel(modelName);
				}
				if (StringUtil.nonEmpty(row.name) || StringUtil.nonEmpty(row.refProperty)) {
					Property p = row.prop;
					if (p == null) {
						String name = StringUtil.nonEmpty(row.refProperty) ? row.refProperty : row.name;
						if (plist == null) {
							plist = ModelUtil.getProperties(info);
						}
						for (Property org : plist) {
							if (name.equals(org.getName())) {
								p = org;
								break;
							}
						}
					}
					String pname = StringUtil.nonEmpty(row.name) ? row.name : row.refProperty;
					String pdesc = StringUtil.nonEmpty(row.description) ? row.description : ((p != null) ? p
							.getDescription() : null);
					Type ptype = PropertyUtil.getResolvedDataType(p);
					PropertyDefinition n = InjectorUtil.getInstance(PropertyDefinitionImpl.class);
					n.setName(pname);
					n.setDescription(DMDLStringUtil.encodeDescription(pdesc));
					n.setType(ptype);
					DMDLTreeData.PropertyNode prop = new DMDLTreeData.PropertyNode(project, null, n);
					prop.setOtherData(row);
					children.add(prop);
				} else {
					children = null;
					break;
				}
			}

			if (info == null) {
				info = findModel(modelName);
				if (info == null) {
					info = InjectorUtil.getInstance(ModelDefinitionImpl.class);
					info.setName(modelName);
				}
			}
			DMDLTreeData.ModelNode model = new DMDLTreeData.ModelNode(project, null, info);
			if (children != null) {
				model.setChildren(children);
			}
			model.setOtherData(children != null);
			result.add(model);
		}
		return result;
	}

	private Map<String, ModelDefinition> modelMap;

	private ModelDefinition findModel(String modelName) {
		if (modelMap == null) {
			modelMap = new HashMap<String, ModelDefinition>();
			TreeItem[] items = super.sourceViewer.getTree().getItems();
			for (TreeItem item : items) {
				for (TreeItem i : item.getItems()) {
					ModelNode node = (ModelNode) i.getData();
					ModelDefinition model = (ModelDefinition) node.getData();
					String name = model.getName();
					modelMap.put(name, model);
				}
			}
		}
		return modelMap.get(modelName);
	}
}
