package jp.hishidama.xtext.dmdl_editor.ui.dialog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.widgets.Shell;

public class DmdlModelMultiSelectionDialog extends DataModelTreeMultiDialog {

	public DmdlModelMultiSelectionDialog(Shell parentShell, IProject project) {
		super(parentShell, project, "データモデル複数選択");
	}

	@Override
	protected int getInitialExpandLevel() {
		return 2;
	}

	public List<ModelDefinition> getSelectedDataModelList() {
		List<DMDLTreeData> dataList = super.getSelectionDataList();
		Set<String> set = new HashSet<String>(dataList.size());
		List<ModelDefinition> result = new ArrayList<ModelDefinition>(dataList.size());
		for (DMDLTreeData data : dataList) {
			List<ModelDefinition> list = getModel(data);
			for (ModelDefinition model : list) {
				String name = model.getName();
				if (!set.contains(name)) {
					set.add(name);
					result.add(model);
				}
			}
		}
		return result;
	}

	private List<ModelDefinition> getModel(DMDLTreeData data) {
		for (DMDLTreeData d = data; d != null; d = d.getParent()) {
			Object obj = d.getData();
			if (obj instanceof ModelDefinition) {
				return Arrays.asList((ModelDefinition) obj);
			}
		}
		List<ModelDefinition> list = new ArrayList<ModelDefinition>();
		for (DMDLTreeData d : data.getChildren()) {
			Object obj = d.getData();
			if (obj instanceof ModelDefinition) {
				list.add((ModelDefinition) obj);
			}
		}
		return list;
	}
}
