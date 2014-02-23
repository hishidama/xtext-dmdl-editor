package jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm;
import jp.hishidama.xtext.dmdl_editor.ui.labeling.DMDLImages;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeLabelProvider;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.ToolBarManager;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
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
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.ui.part.ViewPart;

/**
 * @see org.eclipse.jdt.internal.ui.typehierarchy.TypeHierarchyViewPart
 */
@SuppressWarnings("restriction")
public class ModelHierarchyView extends ViewPart {
	public static final String ID = "jp.hishidama.xtext.dmdl_editor.view.ModelHierarchyView";

	private IProject project;

	private Label form1Title;
	private TreeViewer tree1;
	private SuperModelAction superModelAction;
	private SubModelAction subModelAction;

	private ModelDefinition model2;
	private CLabel form2Title;
	private TableViewer table2;
	private ShowAllPropertiesAction showAllPropertiesAction;

	private Map<String, ModelInfo> modelMap;
	private List<ModelDefinition> projectiveList;

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
			ModelInfo mi = modelMap.get(model.getName());
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
			ModelInfo mi = modelMap.get(model.getName());
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
			ModelDefinition model = PropertyUtil.getModelDefinition(parentElement);
			ModelInfo mi = modelMap.get(model.getName());
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

	@Override
	public void setFocus() {
	}

	public void setInput(IProject project, ModelDefinition model) {
		this.project = project;

		String modelName = model.getName();
		form1Title.setText(modelName);

		initializeModels();

		tree1.setInput(new Object[] { model });
		tree1.expandAll();
		setModel2(model);
	}

	private void initializeModels() {
		ProgressMonitorDialog dialog = new ProgressMonitorDialog(null);
		List<ModelDefinition> list = ModelUiUtil.getAllModels(project, dialog);
		modelMap = new HashMap<String, ModelHierarchyView.ModelInfo>(list.size());
		projectiveList = new ArrayList<ModelDefinition>();
		for (ModelDefinition model : list) {
			ModelInfo mi = new ModelInfo();
			mi.model = model;
			modelMap.put(model.getName(), mi);

			EObject rhs = model.getRhs();
			if (rhs instanceof RecordExpression) {
				for (RecordTerm term : ((RecordExpression) rhs).getTerms()) {
					ModelReference ref = term.getReference();
					if (ref != null) {
						ModelDefinition m = ref.getName();
						if (m != null) {
							mi.superList.add(m);
						}
					}
				}
			} else if (rhs instanceof SummarizeExpression) {
				for (SummarizeTerm term : ((SummarizeExpression) rhs).getTerms()) {
					ModelReference ref = term.getReference();
					if (ref != null) {
						ModelDefinition m = ref.getName();
						if (m != null) {
							mi.superList.add(m);
						}
					}
				}
			} else if (rhs instanceof JoinExpression) {
				for (JoinTerm term : ((JoinExpression) rhs).getTerms()) {
					ModelReference ref = term.getReference();
					if (ref != null) {
						ModelDefinition m = ref.getName();
						if (m != null) {
							mi.superList.add(m);
						}
					}
				}
			}

			if ("projective".equals(model.getType())) {
				projectiveList.add(model);
			}
		}

		for (ModelInfo mi : modelMap.values()) {
			for (ModelDefinition model : mi.superList) {
				String name = model.getName();
				ModelInfo superInfo = modelMap.get(name);
				if (superInfo != null) {
					superInfo.subList.add(mi.model);
				}
			}

			if (ModelUtil.containsAttribute(mi.model, "auto_projection")) {
				List<ModelDefinition> autoList = ModelUtil.getProjectiveContainsModel(mi.model, projectiveList);
				if (autoList != null) {
					mi.autoSuperList = autoList;
					for (ModelDefinition a : autoList) {
						ModelInfo ami = modelMap.get(a.getName());
						if (ami != null) {
							ami.autoSubList.add(mi.model);
						}
					}
				}
			}
		}

		Comparator<ModelDefinition> comparator = new Comparator<ModelDefinition>() {
			public int compare(ModelDefinition o1, ModelDefinition o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		for (ModelInfo mi : modelMap.values()) {
			Collections.sort(mi.superList, comparator);
			Collections.sort(mi.autoSuperList, comparator);
			Collections.sort(mi.subList, comparator);
			Collections.sort(mi.autoSubList, comparator);
		}
	}

	private static class ModelInfo {
		public ModelDefinition model;
		public List<ModelDefinition> superList = new ArrayList<ModelDefinition>();
		public List<ModelDefinition> autoSuperList = Collections.emptyList();
		public List<ModelDefinition> subList = new ArrayList<ModelDefinition>();
		public List<ModelDefinition> autoSubList = new ArrayList<ModelDefinition>();
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
			properties = ModelUtil.getProperties(model2);
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
}
