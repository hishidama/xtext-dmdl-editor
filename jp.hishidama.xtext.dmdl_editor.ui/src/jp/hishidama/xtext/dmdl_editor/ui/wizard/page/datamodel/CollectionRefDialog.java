package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

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
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData.PropertyNode;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DataModelTreeViewer;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.jface.viewers.DoubleClickEvent;
import org.eclipse.jface.viewers.IDoubleClickListener;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ITreeSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;

public class CollectionRefDialog extends CollectionDialog {
	private final IProject project;
	private final String dataModelName;
	private String referenceName;
	private boolean isMap;

	private DataModelTreeViewer sourceViewer;

	public CollectionRefDialog(Shell parentShell, IProject project, String dataModelName, boolean isMap, String elementType, String referenceName) {
		super(parentShell, "プロパティー参照の選択", 1, elementType);
		this.project = project;
		this.dataModelName = dataModelName;
		this.isMap = isMap;
		this.referenceName = referenceName;
	}

	@Override
	protected void createFields(Composite composite) {
		// 1行目
		{
			createLabel(composite, "プロパティーの候補");
		}

		{
			Composite panel = new Composite(composite, SWT.NONE);
			{
				panel.setLayoutData(new GridData(GridData.FILL_BOTH));

				GridLayout layout = new GridLayout(2, false);
				layout.marginWidth = 0;
				layout.marginHeight = 0;
				layout.horizontalSpacing = 0;
				panel.setLayout(layout);
			}

			sourceViewer = new DataModelTreeViewer(panel, SWT.BORDER, 256 + 128, 128, true);
			GridData grid = new GridData(GridData.FILL_BOTH);
			grid.heightHint = 192;
			grid.horizontalSpan = 2;
			sourceViewer.setLayoutData(grid);
			sourceViewer.addSelectionChangedListener(new ISelectionChangedListener() {
				public void selectionChanged(SelectionChangedEvent event) {
					refreshOkButton();
				}
			});
			sourceViewer.addDoubleClickListener(new IDoubleClickListener() {
				public void doubleClick(DoubleClickEvent event) {
					if (refreshOkButton()) {
						okPressed();
					}
				}
			});

			sourceViewer.createFilterField(panel, GridDataFactory.fillDefaults().span(2, 1).grab(true, false).create());
		}

		createElementTypeCombo(composite);

		// 表の初期化
		sourceViewer.setInputAll(project);
		if (dataModelName != null) {
			ModelDefinition model = ModelUiUtil.findModel(project, dataModelName);
			Set<String> set = new LinkedHashSet<String>();
			collectSuperModels(set, model);

			StringBuilder sb = new StringBuilder(128);
			for (String name : set) {
				if (sb.length() != 0) {
					sb.append("|");
				}
				sb.append('^');
				sb.append(name);
				sb.append('$');
			}
			if (sb.length() > 0) {
				sourceViewer.setModelNameFilter(sb.toString());
			}

			if (set.size() == 1) {
				sourceViewer.expandAll();
			}
			{
				String modelName, propertyName;
				int n = referenceName.indexOf('.');
				if (n >= 0) {
					modelName = referenceName.substring(0, n).trim();
					propertyName = referenceName.substring(n + 1).trim();
				} else {
					modelName = dataModelName;
					propertyName = referenceName;
				}
				PropertyNode node = sourceViewer.findPropertyNode(modelName, propertyName);
				if (node != null) {
					sourceViewer.setSelection(new StructuredSelection(node), true);
				}
			}
		}
	}

	private void collectSuperModels(Set<String> set, ModelDefinition model) {
		if (model == null) {
			return;
		}

		List<ModelDefinition> list = new ArrayList<ModelDefinition>();

		EObject rhs = model.getRhs();
		if (rhs instanceof RecordExpression) {
			for (RecordTerm term : ((RecordExpression) rhs).getTerms()) {
				ModelReference ref = term.getReference();
				if (ref != null) {
					ModelDefinition m = ref.getName();
					if (m != null) {
						String name = m.getName();
						if (set.add(name)) {
							list.add(m);
						}
					}
				}
			}
		} else if (rhs instanceof SummarizeExpression) {
			for (SummarizeTerm term : ((SummarizeExpression) rhs).getTerms()) {
				ModelReference ref = term.getReference();
				if (ref != null) {
					ModelDefinition m = ref.getName();
					if (m != null) {
						String name = m.getName();
						if (set.add(name)) {
							list.add(m);
						}
					}
				}
			}
		} else if (rhs instanceof JoinExpression) {
			for (JoinTerm term : ((JoinExpression) rhs).getTerms()) {
				ModelReference ref = term.getReference();
				if (ref != null) {
					ModelDefinition m = ref.getName();
					if (m != null) {
						String name = m.getName();
						if (set.add(name)) {
							list.add(m);
						}
					}
				}
			}
		}

		for (ModelDefinition m : list) {
			collectSuperModels(set, m);
		}
	}

	@Override
	protected void refresh() {
		refreshOkButton();
	}

	@Override
	protected boolean validate() {
		Property p = getSelectedProperty();
		if (p == null) {
			return false;
		}

		return true;
	}

	private Property getSelectedProperty() {
		ITreeSelection s = sourceViewer.getSelection();
		for (@SuppressWarnings("unchecked")
		Iterator<Object> i = s.iterator(); i.hasNext();) {
			Object element = i.next();
			if ((element instanceof PropertyNode)) {
				return ((PropertyNode) element).getData();
			}
		}
		return null;
	}

	@Override
	protected void okPressed() {
		Property property = getSelectedProperty();
		ModelDefinition model = ModelUtil.getModel(property);
		if (model != null) {
			referenceName = model.getName() + "." + property.getName();
		} else {
			referenceName = property.getName();
		}
		String type = PropertyUtil.getResolvedDataTypeText(property);
		if (type != null && type.startsWith("{")) {
			isMap = type.contains(":");
		}

		super.okPressed();
	}

	public String getReferenceName() {
		return referenceName;
	}

	public boolean isMap() {
		return isMap;
	}
}
