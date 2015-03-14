package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData.ModelNode;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData.PropertyNode;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DataModelTreeViewer;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.CheckStateChangedEvent;
import org.eclipse.jface.viewers.ICheckStateListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
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
	private final IProject project;
	private final List<IFile> files;
	private final boolean multi;
	private final boolean check;

	private DataModelTreeViewer viewer;

	public SelectDataModelPage(String title, IProject project, List<IFile> list) {
		this(title, project, list, true, true);
	}

	public SelectDataModelPage(String title, IProject project, List<IFile> list, boolean multi, boolean check) {
		super("SelectDataModelPage");
		setTitle(title);
		this.project = project;
		this.files = list;
		this.multi = multi;
		this.check = check;

		setPageComplete(false);
	}

	public void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new GridLayout(1, false));

		{
			int style = SWT.BORDER | SWT.FULL_SELECTION;
			if (check) {
				style |= SWT.CHECK;
			}
			viewer = new DataModelTreeViewer(composite, style, 512, 256);
			GridData grid = new GridData(GridData.FILL_BOTH);
			grid.heightHint = 192;
			viewer.setLayoutData(grid);
			rebuild(viewer);
			viewer.createFilterField(composite, GridDataFactory.fillDefaults().grab(true, false).create());
			viewer.createExpandButtonField(composite, GridDataFactory.swtDefaults().grab(true, false).create());

			if (check) {
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
			} else {
				viewer.addSelectionChangedListener(new ISelectionChangedListener() {
					public void selectionChanged(SelectionChangedEvent event) {
						refreshChecked(event.getSelection());
					}
				});
			}
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
		if (check) {
			return getCheckedModelList();
		} else {
			return getSelectedModelList();
		}
	}

	public static class ModelFile {
		public IFile file;
		public ModelDefinition model;

		public ModelFile(IFile file, ModelDefinition model) {
			this.file = file;
			this.model = model;
		}
	}

	private List<ModelFile> getCheckedModelList() {
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

	private List<ModelFile> getSelectedModelList() {
		ITreeSelection selection = viewer.getSelection();
		List<ModelFile> list = new ArrayList<ModelFile>(selection.size());
		for (Iterator<?> i = selection.iterator(); i.hasNext();) {
			Object object = i.next();
			ModelNode node = null;
			if (object instanceof ModelNode) {
				node = (ModelNode) object;
			} else if (object instanceof PropertyNode) {
				node = (ModelNode) ((PropertyNode) object).getParent();
			}
			if (node == null) {
				continue;
			}
			DMDLTreeData parent = node.getParent();
			IFile file = (IFile) parent.getData();
			ModelDefinition model = node.getData();
			list.add(new ModelFile(file, model));
		}
		return list;
	}
}
