package jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.hishidama.xtext.dmdl_editor.dmdl.JoinExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;

public class ModelHierarchy {

	public static class ModelInfo {
		public ModelDefinition model;
		public List<ModelDefinition> superList = new ArrayList<ModelDefinition>();
		public List<ModelDefinition> autoSuperList = Collections.emptyList();
		public List<ModelDefinition> subList = new ArrayList<ModelDefinition>();
		public List<ModelDefinition> autoSubList = new ArrayList<ModelDefinition>();

		boolean sorted = false;
	}

	private Map<String, ModelInfo> modelMap;

	public void initializeModels(IProject project, IProgressMonitor monitor) {
		List<ModelDefinition> list;
		if (monitor != null) {
			list = ModelUiUtil.getAllModels(project, monitor);
		} else {
			ProgressMonitorDialog dialog = new ProgressMonitorDialog(null);
			list = ModelUiUtil.getAllModels(project, dialog);
		}

		modelMap = new HashMap<String, ModelInfo>(list.size());
		List<ModelDefinition> projectiveList = new ArrayList<ModelDefinition>();
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
	}

	private void sortModelInfo(ModelInfo mi) {
		if (mi.sorted) {
			return;
		}

		Comparator<ModelDefinition> comparator = new Comparator<ModelDefinition>() {
			public int compare(ModelDefinition o1, ModelDefinition o2) {
				return o1.getName().compareTo(o2.getName());
			}
		};
		Collections.sort(mi.superList, comparator);
		Collections.sort(mi.autoSuperList, comparator);
		Collections.sort(mi.subList, comparator);
		Collections.sort(mi.autoSubList, comparator);
		mi.sorted = true;
	}

	public ModelInfo getModel(String modelName) {
		ModelInfo mi = modelMap.get(modelName);
		if (mi != null) {
			sortModelInfo(mi);
		}
		return mi;
	}
}
