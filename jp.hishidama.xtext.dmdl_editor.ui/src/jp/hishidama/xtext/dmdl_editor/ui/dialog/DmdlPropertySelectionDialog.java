package jp.hishidama.xtext.dmdl_editor.ui.dialog;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.widgets.Shell;

public class DmdlPropertySelectionDialog extends DataModelTreeDialog {
	private boolean enableResultModel = false;

	private String modelName;
	private String propertyName;

	public DmdlPropertySelectionDialog(Shell parentShell, IProject project) {
		super(parentShell, project, "プロパティー選択");
	}

	public void setEnableResultModel(boolean enable) {
		this.enableResultModel = enable;
	}

	public void setInitialProperty(String modelName, String propertyName) {
		setInitialModel(modelName);
		this.modelName = modelName;
		this.propertyName = propertyName;
	}

	@Override
	protected int getInitialExpandLevel() {
		return 2;
	}

	@Override
	protected boolean expandProperty() {
		return true;
	}

	@Override
	protected boolean isSelectedProperty(DMDLTreeData data, ModelDefinition model, Property property) {
		if (property.getName().equals(propertyName)) {
			String mname = model.getName();
			if (mname != null && mname.equals(modelName)) {
				this.treeData = data;
				return true;
			}
		}
		return false;
	}

	@Override
	protected boolean validateData(Object obj) {
		if (enableResultModel) {
			if (obj instanceof ModelDefinition) {
				return true;
			}
		}
		return (obj instanceof Property);
	}

	public ModelDefinition getSelectedDataModel() {
		for (DMDLTreeData data = getSelectionData(); data != null; data = data.getParent()) {
			Object obj = data.getData();
			if (obj instanceof Property) {
				DMDLTreeData parent = data.getParent();
				Object parentData = parent.getData();
				if (parentData instanceof ModelDefinition) {
					return (ModelDefinition) parentData;
				}
			}
		}

		if (!enableResultModel) {
			return null;
		}
		for (DMDLTreeData data = getSelectionData(); data != null; data = data.getParent()) {
			Object obj = data.getData();
			if (obj instanceof ModelDefinition) {
				return (ModelDefinition) obj;
			}
		}
		return null;
	}

	public Property getSelectedProperty() {
		for (DMDLTreeData data = getSelectionData(); data != null; data = data.getParent()) {
			Object obj = data.getData();
			if (obj instanceof Property) {
				return (Property) obj;
			}
		}
		return null;
	}
}
