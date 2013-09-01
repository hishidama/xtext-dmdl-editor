package jp.hishidama.xtext.dmdl_editor.dmdl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
			if (terms == null) {
				return;
			}
			for (RecordTerm term : terms) {
				EList<PropertyDefinition> ps = term.getProperties();
				if (ps != null) {
					EList<PropertyDefinition> properties = term.getProperties();
					if (properties != null) {
						list.addAll(properties);
					}
				}
			}
		} else if (rhs instanceof JoinExpression) {
			EList<JoinTerm> terms = ((JoinExpression) rhs).getTerms();
			if (terms == null) {
				return;
			}
			Set<String> set = new HashSet<String>();
			for (JoinTerm term : terms) {
				ModelMapping mapping = term.getMapping();
				if (mapping != null) {
					EList<PropertyMapping> properties = mapping.getMappings();
					addProperties(list, properties, set);
				} else {
					ModelReference ref = term.getReference();
					if (ref != null) {
						List<Property> properties = new ArrayList<Property>();
						resolveProperties(properties, ref.getName());
						addProperties(list, properties, set);
					}
				}
			}
		} else if (rhs instanceof SummarizeExpression) {
			EList<SummarizeTerm> terms = ((SummarizeExpression) rhs).getTerms();
			if (terms == null) {
				return;
			}
			for (SummarizeTerm term : terms) {
				ModelFolding folding = term.getFolding();
				if (folding != null) {
					EList<PropertyFolding> properties = folding.getFoldings();
					if (properties != null) {
						list.addAll(properties);
					}
				}
			}
		}
	}

	private static void addProperties(List<Property> list, List<? extends Property> properties, Set<String> set) {
		if (properties == null) {
			return;
		}
		for (Property property : properties) {
			String name = property.getName();
			if (set.contains(name)) {
				return;
			}
			set.add(name);

			list.add(property);
		}
	}
}
