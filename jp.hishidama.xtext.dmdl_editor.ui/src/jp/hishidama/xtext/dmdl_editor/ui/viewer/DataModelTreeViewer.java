package jp.hishidama.xtext.dmdl_editor.ui.viewer;

import java.util.ArrayList;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.DMDLFileUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData.FileNode;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData.FileNode.ModelTreeNodePredicate;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.ui.resource.IResourceSetProvider;

public class DataModelTreeViewer extends TreeViewer {

	private ModelTreeNodePredicate predicate;
	private DataModelFilter viewerFilter;

	public DataModelTreeViewer(Composite parent, int style) {
		this(parent, style, false);
	}

	public DataModelTreeViewer(Composite parent, int style, boolean enableDrag) {
		super(parent, style);
		setLabelProvider(new DMDLTreeLabelProvider());

		if (enableDrag) {
			int operations = DND.DROP_COPY | DND.DROP_DEFAULT;
			Transfer[] transferTypes = { DMDLTreeDataTransfer.getInstance() };
			addDragSupport(operations, transferTypes, new DMDLTreeDataDragListener(this));
		}
	}

	public void setChildrenPredicate(ModelTreeNodePredicate predicate) {
		this.predicate = predicate;
	}

	public void setInputAll(IProject project) {
		setContentProvider(new DMDLTreeContentProvider());

		IResourceSetProvider provider = InjectorUtil.getInstance(IResourceSetProvider.class);
		ResourceSet resourceSet = provider.get(project);

		List<IFile> files = DMDLFileUtil.getDmdlFiles(project);
		List<DMDLTreeData> list = new ArrayList<DMDLTreeData>(files.size());
		for (IFile file : files) {
			FileNode node = new DMDLTreeData.FileNode(file, resourceSet);
			node.setChildrenPredicate(predicate);
			list.add(node);
		}
		setInput(list);
	}

	public void setInputList(List<DMDLTreeData> list) {
		setContentProvider(new DMDLTreeContentProvider());
		setInput(list);
	}

	public void setInputModels(IProject project, String... modelNames) {
		List<DMDLTreeData> list = new ArrayList<DMDLTreeData>(modelNames.length);
		for (String modelName : modelNames) {
			if (StringUtil.isEmpty(modelName)) {
				continue;
			}
			ModelDefinition model = ModelUiUtil.findModel(project, modelName);
			if (model == null) {
				continue;
			}
			DMDLTreeData.ModelNode modelNode = new DMDLTreeData.ModelNode(project, null, model);
			list.add(modelNode);
		}
		setInputList(list);
	}

	@Override
	public ITreeSelection getSelection() {
		return (ITreeSelection) super.getSelection();
	}

	protected static class DataModelFilter extends ViewerFilter {

		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element) {
			DMDLTreeData data = (DMDLTreeData) element;
			return data.isFilterSelected();
		}
	}

	public void setFilterText(String filter) {
		@SuppressWarnings("unchecked")
		List<DMDLTreeData> input = (List<DMDLTreeData>) getInput();
		for (DMDLTreeData data : input) {
			data.setFilter(filter);
		}

		if (viewerFilter == null) {
			viewerFilter = new DataModelFilter();
			addFilter(viewerFilter);
		} else {
			refresh();
		}
	}

	public ModelDefinition findModel(String modelName) {
		@SuppressWarnings("unchecked")
		List<DMDLTreeData> list = (List<DMDLTreeData>) getInput();
		return findModel(list, modelName);
	}

	private ModelDefinition findModel(List<DMDLTreeData> list, String modelName) {
		if (list == null) {
			return null;
		}
		for (DMDLTreeData node : list) {
			if (node instanceof DMDLTreeData.FileNode) {
				ModelDefinition model = findModel(node.getChildren(), modelName);
				if (model != null) {
					return model;
				}
			}
			if (node instanceof DMDLTreeData.ModelNode) {
				ModelDefinition model = (ModelDefinition) node.getData();
				if (model.getName().equals(modelName)) {
					return model;
				}
			}
		}
		return null;
	}
}
