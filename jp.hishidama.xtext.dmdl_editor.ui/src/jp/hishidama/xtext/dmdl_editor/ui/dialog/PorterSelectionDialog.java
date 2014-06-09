package jp.hishidama.xtext.dmdl_editor.ui.dialog;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

import jp.hishidama.eclipse_plugin.dialog.ProjectFileSelectionDialog;
import jp.hishidama.xtext.dmdl_editor.dmdl.PorterFile;
import jp.hishidama.xtext.dmdl_editor.util.DMDLStringUtil;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerFilter;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeColumn;
import org.eclipse.ui.model.BaseWorkbenchContentProvider;
import org.eclipse.ui.model.WorkbenchLabelProvider;

public class PorterSelectionDialog extends ProjectFileSelectionDialog {

	public PorterSelectionDialog(Shell parent, IProject project) {
		super(parent, project, new PorterLabelProvider(), new BaseWorkbenchContentProvider());

		setTitle("Select Importer/Exporter");
		setMessage("Importer/Exporterクラスを選択して下さい。");
	}

	@Override
	protected Control createDialogArea(Composite parent) {
		Composite area = (Composite) super.createDialogArea(parent);
		{
			Composite field = new Composite(area, SWT.NONE);
			GridDataFactory.swtDefaults().grab(true, false).applyTo(field);
			field.setLayout(new FillLayout());

			createLabel(field, "in/out :");
			final Button importerButton = new Button(field, SWT.CHECK);
			importerButton.setText("Importer");
			importerButton.setSelection(true);
			final Button exporterButton = new Button(field, SWT.CHECK);
			exporterButton.setText("Exporter");
			exporterButton.setSelection(true);

			importerButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					importerFilter = importerButton.getSelection();
					if (importerFilter == false && exporterFilter == false) {
						exporterButton.setSelection(true);
						exporterFilter = true;
						getTreeViewer().refresh();
						getTreeViewer().expandAll();
						return;
					}
					getTreeViewer().refresh();
					if (importerFilter) {
						getTreeViewer().expandAll();
					}
				}
			});
			exporterButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					exporterFilter = exporterButton.getSelection();
					if (importerFilter == false && exporterFilter == false) {
						importerButton.setSelection(true);
						importerFilter = true;
						getTreeViewer().refresh();
						getTreeViewer().expandAll();
						return;
					}
					getTreeViewer().refresh();
					if (exporterFilter) {
						getTreeViewer().expandAll();
					}
				}
			});
		}

		Composite field = new Composite(area, SWT.NONE);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(field);
		field.setLayout(new GridLayout(4, false));
		{
			final Text text = createTextField(field, "file name filter :");
			text.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					fileNameFilter = DMDLStringUtil.getPattern(text.getText());
					getTreeViewer().refresh();
					if (fileNameFilter != null) {
						getTreeViewer().expandAll();
					}
				}
			});
			text.setFocus();
		}
		{
			final Text text = createTextField(field, "comment :");
			text.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					commentFilter = DMDLStringUtil.getPattern(text.getText());
					getTreeViewer().refresh();
					if (commentFilter != null) {
						getTreeViewer().expandAll();
					}
				}
			});
		}
		{
			final Text text = createTextField(field, "model name filter :");
			text.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					modelNameFilter = DMDLStringUtil.getNamePattern(text.getText());
					getTreeViewer().refresh();
					if (modelNameFilter != null) {
						getTreeViewer().expandAll();
					}
				}
			});
		}
		{
			final Text text = createTextField(field, "description :");
			text.addModifyListener(new ModifyListener() {
				public void modifyText(ModifyEvent e) {
					modelDescFilter = DMDLStringUtil.getPattern(text.getText());
					getTreeViewer().refresh();
					if (modelDescFilter != null) {
						getTreeViewer().expandAll();
					}
				}
			});
		}
		return area;
	}

	protected void createLabel(Composite field, String label) {
		new Label(field, SWT.LEFT).setText(label);
	}

	protected Text createTextField(Composite field, String label) {
		createLabel(field, label);

		Text text = new Text(field, SWT.BORDER);
		text.setLayoutData(GridDataFactory.fillDefaults().grab(true, false).create());
		return text;
	}

	@Override
	protected TreeViewer createTreeViewer(Composite parent) {
		TreeViewer viewer = super.createTreeViewer(parent);
		viewer.addFilter(new PorterFilter());
		Tree tree = viewer.getTree();
		tree.setHeaderVisible(true);
		tree.setLinesVisible(true);
		{
			TreeColumn column = new TreeColumn(tree, SWT.NONE);
			column.setText("name");
			column.setWidth(256 + 128);
		}
		{
			TreeColumn column = new TreeColumn(tree, SWT.NONE);
			column.setText("comment");
			column.setWidth(96);
		}
		{
			TreeColumn column = new TreeColumn(tree, SWT.NONE);
			column.setText("model name");
			column.setWidth(96);
		}
		{
			TreeColumn column = new TreeColumn(tree, SWT.NONE);
			column.setText("model description");
			column.setWidth(96);
		}
		PorterLabelProvider provider = (PorterLabelProvider) viewer.getLabelProvider();
		provider.setOwner(this);
		return viewer;
	}

	protected static class PorterLabelProvider extends WorkbenchLabelProvider implements ITableLabelProvider {
		private PorterSelectionDialog owner;

		public void setOwner(PorterSelectionDialog owner) {
			this.owner = owner;
		}

		// @Override
		public Image getColumnImage(Object element, int columnIndex) {
			if (columnIndex == 0) {
				return super.getImage(element);
			}
			return null;
		}

		// @Override
		public String getColumnText(Object element, int columnIndex) {
			if (!(element instanceof IFile)) {
				if (columnIndex == 0) {
					return super.getText(element);
				}
				return null;
			}
			IFile file = (IFile) element;
			PorterFile info = owner.getInfo(file);
			switch (columnIndex) {
			case 0:
				return super.getText(element);
			case 1:
				return info.getComment();
			case 2:
				return info.getModelName();
			case 3:
				return info.getModelDescription();
			default:
				throw new UnsupportedOperationException("columnIndex=" + columnIndex);
			}
		}
	}

	private final Map<IFile, PorterFile> map = new HashMap<IFile, PorterFile>(256);

	protected PorterFile getInfo(IFile file) {
		PorterFile info = map.get(file);
		if (info == null) {
			info = new PorterFile(file);
			map.put(file, info);
		}
		return info;
	}

	private boolean importerFilter = true, exporterFilter = true;
	private Pattern fileNameFilter, commentFilter;
	private Pattern modelNameFilter, modelDescFilter;

	protected class PorterFilter extends ViewerFilter {

		@Override
		public boolean select(Viewer viewer, Object parentElement, Object element) {
			if (element instanceof IFile) {
				IFile file = (IFile) element;
				return select(file);
			}
			if (element instanceof IContainer) {
				IContainer container = (IContainer) element;
				try {
					IResource[] mlist = container.members();
					for (IResource member : mlist) {
						if (select(viewer, element, member)) {
							return true;
						}
					}
					return false;
				} catch (CoreException e) {
					return true;
				}
			}
			return true;
		}

		protected boolean select(IFile file) {
			if (!"java".equals(file.getFileExtension())) {
				return false;
			}

			PorterFile info = getInfo(file);
			porter: {
				if (importerFilter) {
					if (info.isImporter()) {
						break porter;
					}
				}
				if (exporterFilter) {
					if (info.isExporter()) {
						break porter;
					}
				}
				return false;
			}
			if (fileNameFilter != null) {
				if (!fileNameFilter.matcher(info.getName()).matches()) {
					return false;
				}
			}
			if (commentFilter != null) {
				if (!commentFilter.matcher(info.getComment()).find()) {
					return false;
				}
			}
			if (modelNameFilter != null) {
				if (!modelNameFilter.matcher(info.getModelName()).matches()) {
					return false;
				}
			}
			if (modelDescFilter != null) {
				if (!modelDescFilter.matcher(info.getModelDescription()).matches()) {
					return false;
				}
			}
			return true;
		}
	}

	public List<PorterFile> getSelectedFiles() {
		Object[] result = getOriginalResult();
		List<PorterFile> list = new ArrayList<PorterFile>(result.length);
		for (Object obj : result) {
			if (obj instanceof IFile) {
				IFile file = (IFile) obj;
				collect(list, file);
			} else if (obj instanceof IContainer) {
				IContainer container = (IContainer) obj;
				collect(list, container);
			}
		}
		return list;
	}

	private void collect(List<PorterFile> list, IFile file) {
		PorterFile info = map.get(file);
		if (info != null) {
			if (info.isImporter() || info.isExporter()) {
				list.add(info);
			}
		}
	}

	private void collect(List<PorterFile> list, IContainer container) {
		try {
			for (IResource member : container.members()) {
				if (member instanceof IFile) {
					collect(list, (IFile) member);
				} else if (member instanceof IContainer) {
					collect(list, (IContainer) member);
				}
			}
		} catch (CoreException e) {
			// ignore
		}
	}
}
