package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;

public abstract class CreateDataModelMainPage<R extends DataModelRow> extends CreateDataModelPage<R> {

	public CreateDataModelMainPage(String pageName, String pageTitle, String pageDescription) {
		super(pageName, pageTitle, pageDescription);
	}

	@Override
	protected void setInput() {
		sourceViewer.setInputAll(project);
	}

	@Override
	protected void doVisible(boolean visible) {
		if (visible) {
			if (defineList.isEmpty()) {
				ModelDefinition model = sourceViewer.findModel(modelName);
				if (model != null) {
					DMDLTreeData node = new DMDLTreeData.ModelNode(null, null, model);
					List<DMDLTreeData> list = Collections.singletonList(node);
					doCopy(0, list.iterator());
					tableViewer.refresh();
					validate(true);
				}
			}
		}
	}

	@Override
	protected boolean enableCopy(ModelDefinition model, Property prop) {
		return true;
	}

	@Override
	protected void doCopy(int index, Iterator<DMDLTreeData> iterator) {
		Set<Property> set = new HashSet<Property>();

		for (Iterator<DMDLTreeData> i = iterator; i.hasNext();) {
			DMDLTreeData data = i.next();
			Object obj = data.getData();
			if (obj instanceof ModelDefinition) {
				List<DMDLTreeData> props = data.getChildren();
				if (props != null) {
					ModelDefinition model = (ModelDefinition) obj;
					for (DMDLTreeData pd : props) {
						Property p = (Property) pd.getData();
						if (!set.contains(p)) {
							set.add(p);
							R row = newCopyRow(model, p);
							index = addToList(index, row);
						}
					}
				}
			} else if (obj instanceof Property) {
				Property p = (Property) obj;
				if (!set.contains(p)) {
					set.add(p);
					ModelDefinition model = (ModelDefinition) data.getParent().getData();
					R row = newCopyRow(model, p);
					index = addToList(index, row);
				}
			}
		}
	}
}
