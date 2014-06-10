package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import java.util.ArrayList;
import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData.ModelNode;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DataModelTreeViewer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.graphics.Point;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

public class SelectDataModelPage extends WizardPage {
	private IProject project;
	private List<IFile> files;
	private boolean multi;

	private DataModelTreeViewer viewer;

	public SelectDataModelPage(String title, IProject project, List<IFile> list) {
		this(title, project, list, true);
	}

	public SelectDataModelPage(String title, IProject project, List<IFile> list, boolean multi) {
		super("SelectDataModelPage");
		setTitle(title);
		this.project = project;
		this.files = list;
		this.multi = multi;

		setPageComplete(false);
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new GridLayout(1, false));

		{
			viewer = new DataModelTreeViewer(composite, SWT.BORDER | SWT.CHECK | SWT.FULL_SELECTION, 512, 256);
			GridData grid = new GridData(GridData.FILL_BOTH);
			grid.heightHint = 192;
			viewer.setLayoutData(grid);
			rebuild(viewer);
			viewer.createFilterField(composite, GridDataFactory.fillDefaults().grab(true, false).create());
			viewer.createExpandButtonField(composite, GridDataFactory.swtDefaults().grab(true, false).create());

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

	private void rebuild(DataModelTreeViewer viewer) {
		if (files == null) {
			viewer.setInputAll(project, 3);
			return;
		}

		ResourceSet resourceSet = InjectorUtil.getInstance(ResourceSet.class);

		List<DMDLTreeData> list = new ArrayList<DMDLTreeData>(files.size());
		for (IFile file : files) {
			DMDLTreeData.FileNode fileNode = new DMDLTreeData.FileNode(file, resourceSet, 3);
			list.add(fileNode);
		}
		viewer.setInputList(list);

		if (files.size() == 1) {
			viewer.expandToLevel(1);
		}
	}

	private void refreshChecked(Object obj) {
		List<?> list = getModelList();
		if (multi) {
			setPageComplete(!list.isEmpty());
		} else {
			setPageComplete(list.size() == 1);
		}
	}

	public List<ModelFile> getModelList() {
		List<ModelNode> checked = viewer.getCheckedModelList();
		List<ModelFile> list = new ArrayList<ModelFile>(checked.size());
		for (ModelNode node : checked) {
			DMDLTreeData parent = node.getParent();
			IFile file = (IFile) parent.getData();
			ModelDefinition model = node.getData();
			list.add(new ModelFile(file, model));
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
