package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import static jp.hishidama.eclipse_plugin.util.StringUtil.*;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Type;
import jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelDefinitionImpl;
import jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyDefinitionImpl;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData.ModelNode;
import jp.hishidama.xtext.dmdl_editor.util.DMDLStringUtil;
import jp.hishidama.xtext.dmdl_editor.validation.ValidationUtil;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.jface.viewers.TextCellEditor;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.xtext.EcoreUtil2;

class DataModelJoinRow extends DataModelRow {

	public ModelDefinition model;
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
			return refPropertyName;
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
			return nonNull(refPropertyName);
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
			this.model = null;
			return true;
		}
		if (property.equals(TP_REF_PROPERTY)) {
			String text = ((String) value).trim();
			this.refPropertyName = text;
			this.prop = null;
			return true;
		}
		throw new UnsupportedOperationException(MessageFormat.format("property={0}", property));
	}

	@Override
	public String validate() {
		if (nonEmpty(name)) {
			IStatus status = ValidationUtil.validateName("プロパティー名", name);
			if (!status.isOK()) {
				return status.getMessage();
			}
		}
		if (isEmpty(refModelName)) {
			return "結合元データモデルは必須です。";
		}
		return null;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public String getDataType() {
		return null;
	}
}

public class CreateDataModelJoinPage extends CreateDataModelMainPage<DataModelJoinRow> {

	private Set<JoinKey> keyBuffer = new HashSet<JoinKey>();

	public CreateDataModelJoinPage() {
		super("CreateDataModelNormalPage", "結合データモデルの定義", "結合データモデルのプロパティーを定義して下さい。（結合キーは次ページで定義します）");
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
		row.refPropertyName = prop.getName();
		row.model = model;
		row.prop = prop;
		return row;
	}

	@Override
	protected boolean visibleDefCopy() {
		return true;
	}

	@Override
	protected String getDefCopyToolTipText() {
		return "結合データモデルの定義をコピーします。";
	}

	@Override
	protected boolean enableDefCopy(ModelDefinition model, Property prop) {
		return "joined".equals(model.getType());
	}

	@Override
	protected DataModelJoinRow newDefCopyRow(ModelDefinition model, Property prop, boolean copyAttribute) {
		DataModelJoinRow row = new DataModelJoinRow();
		row.name = prop.getName();
		row.description = DMDLStringUtil.decodeDescription(prop.getDescription());
		if (copyAttribute) {
			row.attribute = PropertyUtil.getAttributeString(prop);
		}

		if (prop instanceof PropertyFolding) {
			PropertyFolding folding = (PropertyFolding) prop;
			ModelDefinition refModel = EcoreUtil2.getContainerOfType(folding.getFrom(), ModelDefinition.class);
			if (refModel != null) {
				row.refModelName = refModel.getName();
			}
			row.refPropertyName = folding.getFrom().getName();
			row.model = refModel;
			row.prop = folding.getFrom();
			setKey(model, row.refModelName, row.name);
		} else if (prop instanceof PropertyMapping) {
			PropertyMapping mapping = (PropertyMapping) prop;
			ModelDefinition refModel = EcoreUtil2.getContainerOfType(mapping.getFrom(), ModelDefinition.class);
			if (refModel != null) {
				row.refModelName = refModel.getName();
			}
			row.refPropertyName = mapping.getFrom().getName();
			row.model = refModel;
			row.prop = mapping.getFrom();
			setKey(model, row.refModelName, row.name);
		} else {
			row.refModelName = model.getName();
			row.refPropertyName = prop.getName();
			row.model = model;
			row.prop = prop;
		}

		return row;
	}

	private void setKey(ModelDefinition model, String refModelName, String propertyName) {
		if (refModelName == null || propertyName == null) {
			return;
		}
		Map<ModelDefinition, List<Property>> map = ModelUtil.getKeys(model);
		int found = -1;
		find: for (Entry<ModelDefinition, List<Property>> entry : map.entrySet()) {
			if (refModelName.equals(entry.getKey().getName())) {
				int i = 0;
				for (Property p : entry.getValue()) {
					if (propertyName.equals(p.getName())) {
						found = i;
						break find;
					}
					i++;
				}
			}
		}
		if (found >= 0) {
			JoinKey key = new JoinKey();
			for (Entry<ModelDefinition, List<Property>> entry : map.entrySet()) {
				String modelName = entry.getKey().getName();
				List<Property> list = entry.getValue();
				if (found < list.size()) {
					Property p = list.get(found);
					key.add(modelName, p.getName());
				}
			}
			keyBuffer.add(key);
		}
	}

	static class JoinKey {
		public final Map<String, String> map = new HashMap<String, String>();

		public void add(String modelName, String propertyName) {
			map.put(modelName, propertyName);
		}

		@Override
		public boolean equals(Object obj) {
			JoinKey that = (JoinKey) obj;
			return map.equals(that.map);
		}

		@Override
		public int hashCode() {
			return map.hashCode();
		}
	}

	@Override
	protected String getReferenceToolTipText() {
		return "データモデルを結合モデルの対象にします。\n" + "例えばm1とm2を参照すると、\n" + "joined model = m1 + m2;\n" + "となります。";
	}

	@Override
	protected boolean enableReference(ModelDefinition model, Property prop) {
		return model != null;
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
		if (nonEmpty(row.name)) {
			gen.appendRefProperty(row.name, row.description, row.refModelName, row.refPropertyName, row.attribute);
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
			ModelDefinition model = null;
			List<Property> plist = null;
			List<DMDLTreeData> children = new ArrayList<DMDLTreeData>();
			for (DataModelJoinRow row : list) {
				if (modelName == null) {
					modelName = row.refModelName;
				}
				if (row.model != null) {
					model = row.model;
				} else {
					model = findModel(modelName);
				}
				if (nonEmpty(row.name) || nonEmpty(row.refPropertyName)) {
					Property p = row.prop;
					if (p == null) {
						String name = nonEmpty(row.refPropertyName) ? row.refPropertyName : row.name;
						if (plist == null) {
							plist = ModelUtil.getProperties(model);
						}
						for (Property org : plist) {
							if (name.equals(org.getName())) {
								p = org;
								break;
							}
						}
					}
					String pname = nonEmpty(row.name) ? row.name : row.refPropertyName;
					String pdesc = nonEmpty(row.description) ? row.description : ((p != null) ? DMDLStringUtil
							.decodeDescription(p.getDescription()) : null);
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

			if (model == null) {
				model = findModel(modelName);
				if (model == null) {
					model = InjectorUtil.getInstance(ModelDefinitionImpl.class);
					model.setName(modelName);
				}
			}
			DMDLTreeData.ModelNode modelNode = new DMDLTreeData.ModelNode(project, null, model);
			if (children != null) {
				modelNode.setChildren(children);
			}
			modelNode.setOtherData(children != null);
			result.add(modelNode);
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
					if (node != null) {
						ModelDefinition model = (ModelDefinition) node.getData();
						String name = model.getName();
						modelMap.put(name, model);
					}
				}
			}
		}
		return modelMap.get(modelName);
	}

	public Set<JoinKey> getKeyBuffer() {
		return keyBuffer;
	}
}
