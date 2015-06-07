package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel;

import java.util.Collection;
import java.util.HashSet;
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
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm;
import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeData;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public abstract class CreateDataModelMainPage<R extends DataModelRow> extends CreateDataModelPage<R> {

	public CreateDataModelMainPage(String pageName, String pageTitle, String pageDescription) {
		super(pageName, pageTitle, pageDescription);
	}

	@Override
	protected void setInput() {
		if (sourceModels == null || sourceModels.length == 0) {
			sourceViewer.setInputAll(project);
		} else {
			sourceViewer.setInputModels(project, sourceModels);
			sourceViewer.expandAll();
		}
	}

	@Override
	protected void doVisible(boolean visible) {
		if (visible) {
			List<R> defineList = getDefinedPropertyList();
			if (defineList.isEmpty()) {
				ModelDefinition model = sourceViewer.findModel(modelName);
				if (model == null) {
					model = ModelUiUtil.findModel(project, modelName);
				}
				if (model != null) {
					Set<String> modelNameSet = new LinkedHashSet<String>();

					EObject rhs = model.getRhs();
					if (rhs instanceof RecordExpression) {
						modelNameSet.add(model.getName());
						EList<RecordTerm> terms = ((RecordExpression) rhs).getTerms();
						for (RecordTerm term : terms) {
							addSet(modelNameSet, term.getReference());
						}
					} else if (rhs instanceof JoinExpression) {
						EList<JoinTerm> terms = ((JoinExpression) rhs).getTerms();
						for (JoinTerm term : terms) {
							addSet(modelNameSet, term.getReference());
						}
					} else if (rhs instanceof SummarizeExpression) {
						EList<SummarizeTerm> terms = ((SummarizeExpression) rhs).getTerms();
						for (SummarizeTerm term : terms) {
							addSet(modelNameSet, term.getReference());
						}
					}

					List<EObject> list = ModelUtil.getRawProperties(model);
					int index = 0;
					for (EObject object : list) {
						R row;
						if (object instanceof Property) {
							row = newInitRow(model, (Property) object);
						} else if (object instanceof ModelReference) {
							ModelReference ref = (ModelReference) object;
							row = newReferenceModel(model, ref.getName());
						} else {
							throw new UnsupportedOperationException("object=" + object);
						}
						index = addToList(index, row);
					}
					tableViewer.refresh();
					validate(true);

					String filter = createModelNameFilter(modelNameSet);
					if (filter != null) {
						sourceViewer.setModelNameFilter(filter);
					}
				}
			}
		}
	}

	private void addSet(Set<String> set, ModelReference ref) {
		if (ref != null) {
			ModelDefinition def = ref.getName();
			if (def != null) {
				String n = def.getName();
				if (n != null) {
					set.add(n);
				}
			}
		}
	}

	protected R newInitRow(ModelDefinition model, Property property) {
		return newDefCopyRow(model, property, true);
	}

	protected String createModelNameFilter(Collection<String> modelNames) {
		if (modelNames.isEmpty()) {
			return null;
		}
		StringBuilder sb = new StringBuilder(32);
		for (String name : modelNames) {
			if (sb.length() != 0) {
				sb.append('|');
			}
			sb.append('^');
			sb.append(name);
			sb.append('$');
		}
		return sb.toString();
	}

	@Override
	protected boolean enableCopy(ModelDefinition model, Property prop) {
		return true;
	}

	@Override
	protected void doCopy(int index, Iterator<DMDLTreeData> iterator) {
		Set<Property> set = new HashSet<Property>();

		for (Iterator<DMDLTreeData> i = iterator; i.hasNext();) {
			DMDLTreeData data = i.next();
			Object obj = data.getData();
			if (obj instanceof ModelDefinition) {
				List<DMDLTreeData> props = data.getChildren();
				if (props != null) {
					ModelDefinition model = (ModelDefinition) obj;
					for (DMDLTreeData pd : props) {
						Property p = (Property) pd.getData();
						if (!set.contains(p)) {
							set.add(p);
							R row = newCopyRow(model, p);
							index = addToList(index, row);
						}
					}
				}
			} else if (obj instanceof Property) {
				Property p = (Property) obj;
				if (!set.contains(p)) {
					set.add(p);
					ModelDefinition model = (ModelDefinition) data.getParent().getData();
					R row = newCopyRow(model, p);
					index = addToList(index, row);
				}
			}
		}
	}
}
