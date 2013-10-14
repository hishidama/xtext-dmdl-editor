package jp.hishidama.xtext.dmdl_editor.dmdl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jp.hishidama.eclipse_plugin.util.StringUtil;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class ModelUtil {

	public static List<Property> getProperties(ModelDefinition model) {
		List<Property> list = new ArrayList<Property>();
		Set<String> set = new HashSet<String>();
		resolveProperties(list, model, set);
		return list;
	}

	private static void resolveProperties(List<Property> list, ModelDefinition model, Set<String> set) {
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
						resolveProperties(list, ref.getName(), set);
					}
				} else {
					EList<PropertyDefinition> properties = term.getProperties();
					addProperties(list, properties, set);
				}
			}
		} else if (rhs instanceof JoinExpression) {
			EList<JoinTerm> terms = ((JoinExpression) rhs).getTerms();
			for (JoinTerm term : terms) {
				ModelMapping mapping = term.getMapping();
				if (mapping != null) {
					EList<PropertyMapping> properties = mapping.getMappings();
					addProperties(list, properties, set);
				} else {
					ModelReference ref = term.getReference();
					if (ref != null) {
						if (!recursiveModel(term.eContainer(), ref.getName())) {
							resolveProperties(list, ref.getName(), set);
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
					addProperties(list, properties, set);
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

	/**
	 * 生プロパティー一覧取得.
	 * 
	 * @param model
	 *            ModelDefinition
	 * @return PropertyまたはModelReferenceのList
	 */
	public static List<EObject> getRawProperties(ModelDefinition model) {
		List<EObject> list = new ArrayList<EObject>();
		collectRawProperties(list, model);
		return list;
	}

	private static void collectRawProperties(List<EObject> list, ModelDefinition model) {
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
					list.add(ref);
				} else {
					EList<PropertyDefinition> properties = term.getProperties();
					list.addAll(properties);
				}
			}
		} else if (rhs instanceof JoinExpression) {
			EList<JoinTerm> terms = ((JoinExpression) rhs).getTerms();
			for (JoinTerm term : terms) {
				ModelMapping mapping = term.getMapping();
				if (mapping != null) {
					EList<PropertyMapping> properties = mapping.getMappings();
					list.addAll(properties);
				} else {
					ModelReference ref = term.getReference();
					if (ref != null) {
						list.add(ref);
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

	public static IFile getFile(ModelDefinition model) {
		URI uri = EcoreUtil2.getNormalizedResourceURI(model);
		String pathString = uri.toPlatformString(true);
		IPath path = Path.fromPortableString(pathString);
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		return root.getFile(path);
	}

	public static String getAttributeString(ModelDefinition model) {
		ICompositeNode node = NodeModelUtils.getNode(model.getAttributes());
		if (node == null) {
			return null;
		}
		String text = node.getText();
		StringBuilder sb = new StringBuilder(text.length());
		String[] ss = text.split("\n");
		for (String s : ss) {
			if (!s.trim().isEmpty()) {
				if (sb.length() != 0) {
					sb.append("\n");
				}
				sb.append(s);
			}
		}
		return sb.toString();
	}
}
