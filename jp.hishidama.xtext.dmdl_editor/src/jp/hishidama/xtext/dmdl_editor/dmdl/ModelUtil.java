package jp.hishidama.xtext.dmdl_editor.dmdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jp.hishidama.eclipse_plugin.util.StringUtil;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

public class ModelUtil {

	public static List<Property> getProperties(ModelDefinition model) {
		List<Property> list = new ArrayList<Property>();
		resolveProperties(list, model);
		return list;
	}

	private static void resolveProperties(List<Property> list, ModelDefinition model) {
		if (model == null) {
			return;
		}
		EObject rhs = model.getRhs();
		if (rhs == null) {
			return;
		}
		if (rhs instanceof RecordExpression) {
			EList<RecordTerm> terms = ((RecordExpression) rhs).getTerms();
			for (RecordTerm term : terms) {
				ModelReference ref = term.getReference();
				if (ref != null) {
					if (!recursiveModel(term.eContainer(), ref.getName())) {
						List<Property> properties = new ArrayList<Property>();
						resolveProperties(properties, ref.getName());
						list.addAll(properties);
					}
				} else {
					EList<PropertyDefinition> properties = term.getProperties();
					list.addAll(properties);
				}
			}
		} else if (rhs instanceof JoinExpression) {
			EList<JoinTerm> terms = ((JoinExpression) rhs).getTerms();
			Set<String> set = new HashSet<String>();
			for (JoinTerm term : terms) {
				ModelMapping mapping = term.getMapping();
				if (mapping != null) {
					EList<PropertyMapping> properties = mapping.getMappings();
					addProperties(list, properties, set);
				} else {
					ModelReference ref = term.getReference();
					if (ref != null) {
						if (!recursiveModel(term.eContainer(), ref.getName())) {
							List<Property> properties = new ArrayList<Property>();
							resolveProperties(properties, ref.getName());
							addProperties(list, properties, set);
						}
					}
				}
			}
		} else if (rhs instanceof SummarizeExpression) {
			EList<SummarizeTerm> terms = ((SummarizeExpression) rhs).getTerms();
			for (SummarizeTerm term : terms) {
				ModelFolding folding = term.getFolding();
				if (folding != null) {
					EList<PropertyFolding> properties = folding.getFoldings();
					list.addAll(properties);
				}
			}
		}
	}

	private static void addProperties(List<Property> list, List<? extends Property> properties, Set<String> set) {
		for (Property property : properties) {
			String name = property.getName();
			if (set.contains(name)) {
				continue;
			}
			set.add(name);

			list.add(property);
		}
	}

	public static boolean recursiveModel(EObject source, ModelDefinition model) {
		for (EObject object = source; object != null; object = object.eContainer()) {
			if (object == model) {
				return true; // 循環参照
			}
		}
		return false;
	}

	public static Property findProperty(ModelDefinition model, String name) {
		List<Property> list = getProperties(model);
		return findProperty(list, name);
	}

	public static Property findProperty(List<Property> list, String name) {
		for (Property p : list) {
			String pname = p.getName();
			if (name.equals(pname)) {
				return p;
			}
		}
		for (Property p : list) {
			String pname = StringUtil.toLowerCamelCase(p.getName());
			if (name.equals(pname)) {
				return p;
			}
		}
		return null;
	}

	public static Map<ModelDefinition, List<Property>> getKeys(ModelDefinition model) {
		Map<ModelDefinition, List<Property>> map = new HashMap<ModelDefinition, List<Property>>();

		EObject rhs = model.getRhs();
		if (rhs instanceof SummarizeExpression) {
			EList<SummarizeTerm> terms = ((SummarizeExpression) rhs).getTerms();
			for (SummarizeTerm term : terms) {
				ModelReference ref = term.getReference();
				Grouping group = term.getGrouping();
				if (ref != null && group != null) {
					map.put(ref.getName(), group.getName());
				}
			}
		} else if (rhs instanceof JoinExpression) {
			EList<JoinTerm> terms = ((JoinExpression) rhs).getTerms();
			for (JoinTerm term : terms) {
				ModelReference ref = term.getReference();
				Grouping group = term.getGrouping();
				if (ref != null && group != null) {
					map.put(ref.getName(), group.getName());
				}
			}
		}
		return map;
	}

	public static boolean containsSummarizeKey(ModelDefinition model, String propertyName) {
		if (model == null || propertyName == null) {
			return false;
		}

		EObject rhs = model.getRhs();
		if (rhs instanceof SummarizeExpression) {
			EList<SummarizeTerm> terms = ((SummarizeExpression) rhs).getTerms();
			for (SummarizeTerm term : terms) {
				Grouping group = term.getGrouping();
				if (group != null) {
					for (Property p : group.getName()) {
						if (propertyName.equals(p.getName())) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	public static boolean containsJoinKey(ModelDefinition model, String refModelName, String propertyName) {
		if (model == null || refModelName == null || propertyName == null) {
			return false;
		}

		EObject rhs = model.getRhs();
		if (rhs instanceof JoinExpression) {
			EList<JoinTerm> terms = ((JoinExpression) rhs).getTerms();
			for (JoinTerm term : terms) {
				ModelReference ref = term.getReference();
				if (ref == null || !refModelName.equals(ref.getName())) {
					continue;
				}
				Grouping group = term.getGrouping();
				if (group != null) {
					for (Property p : group.getName()) {
						if (propertyName.equals(p.getName())) {
							return true;
						}
					}
				}
			}
		}
		return false;
	}
}
