package jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import jp.hishidama.eclipse_plugin.jface.SelectionProviderAdapter;
import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelProperty;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil.PropertyFilter;
import jp.hishidama.xtext.dmdl_editor.ui.labeling.DMDLImages;
import jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy.ModelHierarchy.ModelInfo;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeLabelProvider;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.CLabel;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.custom.ViewForm;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.IWorkbenchActionConstants;
import org.eclipse.ui.part.ViewPart;

/**
 * @see org.eclipse.jdt.internal.ui.typehierarchy.TypeHierarchyViewPart
 */
@SuppressWarnings("restriction")
public class ModelHierarchyView extends ViewPart {
	public static final String ID = "jp.hishidama.xtext.dmdl_editor.view.ModelHierarchyView";

	private static final String MENU_ID = "jp.hishidama.xtext.dmdl_editor.ui.modelHierarchyView";

	private static final String CONTEXT_MENU_ID = "ModelHierarchyViewContextMenu";

	private IProject project;

	private ModelDefinition model1;
	private Label form1Title;
	private TreeViewer tree1;
	private SuperModelAction superModelAction;
	private SubModelAction subModelAction;

	private ModelDefinition model2;
	private CLabel form2Title;
	private TableViewer table2;
	private ShowAllPropertiesAction showAllPropertiesAction;

	private ModelHierarchy modelHierarchy;

	@Override
	public void createPartControl(Composite parent) {
		SashForm splitter = new SashForm(parent, SWT.VERTICAL);

		{
			ViewForm form = new ViewForm(splitter, SWT.NONE);
			Control content = createForm1(form);
			form.setContent(content);

			ToolBar toolBar = new ToolBar(form, SWT.FLAT | SWT.WRAP);
			form.setTopCenter(toolBar);
			ToolBarManager toolManager = new ToolBarManager(toolBar);
			superModelAction = new SuperModelAction(this, true);
			toolManager.add(superModelAction);
			subModelAction = new SubModelAction(this, false);
			toolManager.add(subModelAction);
			toolManager.update(true);
		}
		{
			ViewForm form = new ViewForm(splitter, SWT.NONE);
			Control content = createForm2(form);
			form.setContent(content);

			ToolBar toolBar = new ToolBar(form, SWT.FLAT | SWT.WRAP);
			form.setTopCenter(toolBar);
			ToolBarManager toolManager = new ToolBarManager(toolBar);
			showAllPropertiesAction = new ShowAllPropertiesAction(this, true);
			toolManager.add(showAllPropertiesAction);
			toolManager.update(true);
		}

		splitter.setWeights(new int[] { 35, 65 });

		getSite().setSelectionProvider(new SelectionProviderAdapter());
		updateToolTipAndDescription();
		configureContextMenu();
	}

	private Control createForm1(ViewForm parent) {
		form1Title = new Label(parent, SWT.NONE);
		form1Title.setText("DataModel Hierarchy");
		parent.setTopLeft(form1Title);

		tree1 = new TreeViewer(parent, SWT.SINGLE);
		tree1.setLabelProvider(new Tree1LabelProvider());
		tree1.setContentProvider(new Tree1ContentProvider());
		tree1.addSelectionChangedListener(new Tree1SelectionChangeListener());
		tree1.addDoubleClickListener(new DoubleClickListener());
		return tree1.getControl();
	}

	private class Tree1LabelProvider extends DMDLTreeLabelProvider {
		@Override
		public Image getImage(Object element) {
			if (element instanceof SubAutoProjection) {
				return DMDLImages.getAttributeImage();
			}
			return super.getImage(element);
		}

		@Override
		public String getText(Object element) {
			if (element instanceof SubAutoProjection) {
				return "@auto_projection";
			}
			return super.getText(element);
		}
	}

	private class Tree1ContentProvider implements ITreeContentProvider {

		public Object[] getElements(Object inputElement) {
			if (inputElement instanceof Object[]) {
				return (Object[]) inputElement;
			}
			return getChildren(inputElement);
		}

		public boolean hasChildren(Object element) {
			if (element instanceof Attribute) {
				return true;
			}
			if (element instanceof SubAutoProjection) {
				SubAutoProjection sub = (SubAutoProjection) element;
				return !sub.info.autoSubList.isEmpty();
			}

			ModelDefinition model = (ModelDefinition) element;
			ModelInfo mi = modelHierarchy.getModel(model.getName());
			if (mi == null) {
				return false;
			}

			if (superModelAction.isChecked()) {
				if (!mi.superList.isEmpty()) {
					return true;
				}
				if (ModelUtil.containsAttribute(model, "auto_projection")) {
					return true;
				}
			} else {
				if (!mi.subList.isEmpty() || !mi.autoSubList.isEmpty()) {
					return true;
				}
			}

			return false;
		}

		public Object[] getChildren(Object parentElement) {
			if (parentElement instanceof Attribute) {
				return getAutoProjection((Attribute) parentElement);
			}
			if (parentElement instanceof SubAutoProjection) {
				SubAutoProjection sub = (SubAutoProjection) parentElement;
				return sub.info.autoSubList.toArray();
			}

			List<Object> list = new ArrayList<Object>();
			ModelDefinition model = (ModelDefinition) parentElement;
			ModelInfo mi = modelHierarchy.getModel(model.getName());
			if (mi == null) {
				return null;
			}

			if (superModelAction.isChecked()) {
				list.addAll(mi.superList);

				AttributeList attributes = model.getAttributes();
				if (attributes != null) {
					for (Attribute attr : attributes.getAttributes()) {
						if ("auto_projection".equals(attr.getName())) {
							list.add(attr);
							break;
						}
					}
				}
			} else {
				list.addAll(mi.subList);
				if ("projective".equals(mi.model.getType())) {
					SubAutoProjection sub = new SubAutoProjection();
					sub.info = mi;
					list.add(sub);
				}
			}

			return list.toArray();
		}

		private Object[] getAutoProjection(Attribute parentElement) {
			ModelDefinition model = ModelUtil.getModel(parentElement);
			ModelInfo mi = modelHierarchy.getModel(model.getName());
			if (mi == null) {
				return null;
			}
			return mi.autoSuperList.toArray();
		}

		public Object getParent(Object element) {
			return null;
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}
	}

	private class Tree1SelectionChangeListener implements ISelectionChangedListener {

		public void selectionChanged(SelectionChangedEvent event) {
			TreeSelection selection = (TreeSelection) event.getSelection();
			Object element = selection.getFirstElement();
			if (element instanceof ModelDefinition) {
				setModel2((ModelDefinition) element);
			}
		}
	}

	private static class DoubleClickListener implements IDoubleClickListener {

		public void doubleClick(DoubleClickEvent event) {
			IStructuredSelection selection = (IStructuredSelection) event.getSelection();
			Object element = selection.getFirstElement();
			if (element instanceof EObject) {
				EObject object = (EObject) element;
				ModelUiUtil.openEditor(object);
			}
		}
	}

	private Control createForm2(ViewForm parent) {
		form2Title = new CLabel(parent, SWT.NONE);
		parent.setTopLeft(form2Title);

		table2 = new TableViewer(parent, SWT.MULTI);
		table2.setLabelProvider(new DMDLTreeLabelProvider());
		table2.setContentProvider(new Tree2ContentProvider());
		table2.addSelectionChangedListener(new Table2SelectionChangeListener());
		table2.addDoubleClickListener(new DoubleClickListener());
		return table2.getControl();
	}

	private static class Tree2ContentProvider implements ITreeContentProvider {

		public Object[] getElements(Object inputElement) {
			@SuppressWarnings("unchecked")
			List<Property> list = (List<Property>) inputElement;
			return list.toArray();
		}

		public boolean hasChildren(Object element) {
			return false;
		}

		public Object[] getChildren(Object parentElement) {
			return null;
		}

		public Object getParent(Object element) {
			return null;
		}

		public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		}

		public void dispose() {
		}
	}

	private class Table2SelectionChangeListener implements ISelectionChangedListener {

		@SuppressWarnings("unchecked")
		public void selectionChanged(SelectionChangedEvent event) {
			IStructuredSelection selection = (IStructuredSelection) event.getSelection();

			List<ModelProperty> list = new ArrayList<ModelProperty>(selection.size());
			for (Iterator<Property> i = selection.iterator(); i.hasNext();) {
				Property property = i.next();
				ModelProperty element = new ModelProperty(model2, property);
				list.add(element);
			}

			getSite().getSelectionProvider().setSelection(new StructuredSelection(list));
		}
	}

	@Override
	public void setFocus() {
	}

	public void setInput(IProject project, ModelDefinition model) {
		this.project = project;
		this.model1 = model;

		String modelName = model.getName();
		form1Title.setText(modelName);

		initializeModels();

		tree1.setInput(new Object[] { model });
		tree1.expandAll();
		setModel2(model);

		updateToolTipAndDescription();
	}

	private void initializeModels() {
		modelHierarchy = new ModelHierarchy();
		modelHierarchy.initializeModels(project, null);
	}

	private static class SubAutoProjection {
		public ModelInfo info;
	}

	public void refreshTree() {
		tree1.refresh();
		tree1.expandAll();
	}

	private void setModel2(ModelDefinition model) {
		this.model2 = model;

		Image modelImage = DMDLImages.getDataModelImage(model);
		String modelName = model.getName();

		form2Title.setImage(modelImage);
		form2Title.setText(modelName);

		setShowAllProperties(showAllPropertiesAction.isChecked());
	}

	public void setShowAllProperties(boolean checked) {
		List<Property> properties;
		if (checked) {
			properties = ModelUtil.getProperties(model2, PropertyFilter.ALL);
		} else {
			List<EObject> list = ModelUtil.getRawProperties(model2);
			Set<String> set = new HashSet<String>(list.size());
			properties = new ArrayList<Property>(list.size());
			for (EObject object : list) {
				if (object instanceof Property) {
					Property property = (Property) object;
					String name = property.getName();
					if (!set.contains(name)) {
						set.add(name);
						properties.add(property);
					}
				}
			}
		}
		table2.setInput(properties);
	}

	private void updateToolTipAndDescription() {
		String tooltip; //$NON-NLS-1$
		if (model1 != null) {
			tooltip = MessageFormat.format("{0} of ''{1}''", getPartName(), model1.getName());
		} else {
			tooltip = getPartName();
		}
		// String description = tooltip;

		setTitleToolTip(tooltip);
		// setContentDescription(description);
	}

	// @see
	// org.eclipse.xtext.ui.editor.outline.impl.OutlinePage#configureContextMenu()
	protected void configureContextMenu() {
		MenuManager menuManager = new MenuManager(CONTEXT_MENU_ID, CONTEXT_MENU_ID);
		menuManager.add(new Separator(IWorkbenchActionConstants.MB_ADDITIONS));
		menuManager.setRemoveAllWhenShown(true);

		Menu contextMenu = menuManager.createContextMenu(table2.getTable());
		table2.getTable().setMenu(contextMenu);
		getSite().registerContextMenu(MENU_ID, menuManager, table2);
	}
}
