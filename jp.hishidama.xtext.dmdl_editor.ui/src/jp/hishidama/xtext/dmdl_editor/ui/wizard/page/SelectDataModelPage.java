package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import java.util.ArrayList;
import java.util.List;

import static jp.hishidama.eclipse_plugin.util.StringUtil.*;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.ui.labeling.DMDLImages;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.CheckboxTreeViewer;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

public class SelectDataModelPage extends WizardPage {
	private List<IFile> files;

	private Tree tree;

	public SelectDataModelPage(String title, List<IFile> list) {
		super("SelectDataModelPage");
		setTitle(title);
		this.files = list;

		setPageComplete(false);
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new GridLayout(1, false));

		{
			tree = new Tree(composite, SWT.BORDER | SWT.CHECK);
			GridData grid = new GridData(GridData.FILL_BOTH);
			tree.setLayoutData(grid);
			rebuild();

			CheckboxTreeViewer viewer = new CheckboxTreeViewer(tree);
			viewer.addCheckStateListener(new ICheckStateListener() {
				public void checkStateChanged(CheckStateChangedEvent event) {
					refreshChecked(event.getElement());
				}
			});
			viewer.getTree().addMouseListener(new MouseAdapter() {
				@Override
				public void mouseDown(MouseEvent e) {
					Point point = new Point(e.x, e.y);
					Tree tree = (Tree) e.widget;
					TreeItem item = tree.getItem(point);
					if (item != null && item.getBounds(0).contains(point)) {
						item.setChecked(!item.getChecked());
						refreshChecked(item.getData());
					}
				}
			});
		}

		setControl(composite);
	}

	private void rebuild() {
		Image rowImage = DMDLImages.getDmdlFileImage();
		ResourceSet resourceSet = InjectorUtil.getInstance(ResourceSet.class);

		tree.removeAll();
		for (IFile file : files) {
			TreeItem row = new TreeItem(tree, SWT.NONE);
			row.setText(file.getFullPath().toPortableString());
			row.setImage(rowImage);
			row.setExpanded(true);
			row.setData(file);

			DMDLTreeData.FileNode fileNode = new DMDLTreeData.FileNode(file, resourceSet);
			List<DMDLTreeData> models = fileNode.getChildren();
			for (DMDLTreeData data : models) {
				ModelDefinition model = (ModelDefinition) data.getData();
				String name = model.getName();
				String desc = model.getDescription();
				String text;
				if (desc == null) {
					text = name;
				} else {
					text = String.format("%s : %s", name, desc);
				}

				TreeItem item = new TreeItem(row, SWT.NONE);
				item.setText(nonNull(text));
				item.setImage(DMDLImages.getDataModelImage(model));
				item.setData(model);
			}

			if (files.size() == 1) {
				row.setExpanded(true);
			}
		}
	}

	private void refreshChecked(Object obj) {
		if (obj instanceof IFile) {
			TreeItem row = findItem((IFile) obj);
			boolean c = row.getChecked();
			row.setGrayed(false);
			for (TreeItem item : row.getItems()) {
				item.setChecked(c);
			}
		} else if (obj instanceof ModelDefinition) {
			TreeItem row = findItem((ModelDefinition) obj);
			int empty = 0, checked = 0;
			TreeItem[] items = row.getItems();
			for (TreeItem item : items) {
				if (item.getChecked()) {
					checked++;
				} else {
					empty++;
				}
			}
			if (empty == items.length) {
				row.setChecked(false);
				row.setGrayed(false);
			} else if (checked == items.length) {
				row.setChecked(true);
				row.setGrayed(false);
			} else {
				row.setChecked(true);
				row.setGrayed(true);
			}
		}
		List<?> list = getModelList();
		setPageComplete(!list.isEmpty());
	}

	private TreeItem findItem(IFile file) {
		for (TreeItem row : tree.getItems()) {
			if (row.getData() == file) {
				return row;
			}
			IFile data = (IFile) row.getData();
			if (data.getFullPath().equals(file.getFullPath())) {
				return row;
			}
		}
		return null;
	}

	private TreeItem findItem(ModelDefinition model) {
		for (TreeItem row : tree.getItems()) {
			for (TreeItem item : row.getItems()) {
				if (item.getData() == model) {
					return row;
				}
			}
		}
		return null;
	}

	public List<ModelFile> getModelList() {
		List<ModelFile> list = new ArrayList<ModelFile>();
		for (TreeItem row : tree.getItems()) {
			IFile file = (IFile) row.getData();
			for (TreeItem item : row.getItems()) {
				if (item.getChecked()) {
					ModelDefinition model = (ModelDefinition) item.getData();
					list.add(new ModelFile(file, model));
				}
			}
		}
		return list;
	}

	public static class ModelFile {
		public IFile file;
		public ModelDefinition model;

		public ModelFile(IFile file, ModelDefinition model) {
			this.file = file;
			this.model = model;
		}
	}
}
