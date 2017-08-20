package jp.hishidama.xtext.dmdl_editor.dmdl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.AfwStringUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.util.DMDLStringUtil;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeParameter;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class ModelUtil {

	public static ModelDefinition getModel(EObject object) {
		return EcoreUtil2.getContainerOfType(object, ModelDefinition.class);
	}

	public static boolean isProjective(ModelDefinition model) {
		if (model == null) {
			return false;
		}
		String type = model.getType();
		return "projective".equals(type);
	}

	public static void appendTooltipModelName(StringBuilder sb, ModelDefinition model) {
		String desc = model.getDescription();
		if (desc != null) {
			sb.append(desc);
			sb.append("<br>");
		}

		String name = model.getName();
		sb.append("<b>");
		sb.append(name);
		sb.append("</b>");
	}

	public static String getDecodedDescription(ModelDefinition model) {
		if (model == null) {
			return null;
		}
		return DMDLStringUtil.decodeDescription(model.getDescription());
	}

	public static String getDecodedDescriptionText(ModelDefinition model) {
		return StringUtil.nonNull(getDecodedDescription(model));
	}

	public static List<String> getSourceModelName(ModelDefinition model) {
		if (model == null) {
			return Collections.emptyList();
		}

		List<String> list = new ArrayList<String>();
		EObject rhs = model.getRhs();
		if (rhs instanceof JoinExpression) {
			EList<JoinTerm> terms = ((JoinExpression) rhs).getTerms();
			for (JoinTerm term : terms) {
				ModelReference ref = term.getReference();
				list.add(getModelName(ref));
			}
		} else if (rhs instanceof SummarizeExpression) {
			EList<SummarizeTerm> terms = ((SummarizeExpression) rhs).getTerms();
			for (SummarizeTerm term : terms) {
				ModelReference ref = term.getReference();
				list.add(getModelName(ref));
			}
		}

		return list;
	}

	private static String getModelName(ModelReference ref) {
		if (ref == null) {
			return null;
		}
		ModelDefinition model = ref.getName();
		if (model != null) {
			return model.getName();
		}

		List<INode> nodeList = NodeModelUtils.findNodesForFeature(ref, DmdlPackage.Literals.MODEL_DEFINITION__NAME);
		for (INode node : nodeList) {
			return NodeModelUtils.getTokenText(node).trim();
		}
		return null;
	}

	public enum PropertyFilter {
		/** 全て */
		ALL,
		/** 通常のプロパティーのみ */
		PROPERTY,
		/** プロパティー参照のみ */
		REFERENCE,
	}

	public static List<Property> getProperties(ModelDefinition model, PropertyFilter filter) {
		Map<String, Property> map = getPropertiesMap(model, filter);
		return new ArrayList<Property>(map.values());
	}

	public static Map<String, Property> getPropertiesMap(ModelDefinition model, PropertyFilter filter) {
		if (model == null) {
			return Collections.emptyMap();
		}
		EObject rhs = model.getRhs();
		if (rhs == null) {
			return Collections.emptyMap();
		}

		Map<String, Property> result = new LinkedHashMap<String, Property>();
		if (rhs instanceof RecordExpression) {
			EList<RecordTerm> terms = ((RecordExpression) rhs).getTerms();
			for (RecordTerm term : terms) {
				ModelReference ref = term.getReference();
				if (ref != null) {
					if (!recursiveModel(term.eContainer(), ref.getName())) {
						addProperties(result, getPropertiesMap(ref.getName(), filter).values(), false, filter);
					}
				} else {
					EList<PropertyDefinition> properties = term.getProperties();
					addProperties(result, properties, true, filter);
				}
			}
		} else if (rhs instanceof JoinExpression) {
			EList<JoinTerm> terms = ((JoinExpression) rhs).getTerms();
			for (JoinTerm term : terms) {
				ModelMapping mapping = term.getMapping();
				if (mapping != null) {
					EList<PropertyMapping> properties = mapping.getMappings();
					addProperties(result, properties, true, filter);
				} else {
					ModelReference ref = term.getReference();
					if (ref != null) {
						if (!recursiveModel(term.eContainer(), ref.getName())) {
							addProperties(result, getPropertiesMap(ref.getName(), filter).values(), false, filter);
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
					addProperties(result, properties, true, filter);
				}
			}
		}
		return result;
	}

	private static void addProperties(Map<String, Property> result, Collection<? extends Property> properties, boolean overwrite, PropertyFilter filter) {
		for (Property property : properties) {
			switch (filter) {
			case PROPERTY:
				if (PropertyUtil.isPropertyReference(property)) {
					continue;
				}
				break;
			case REFERENCE:
				if (!PropertyUtil.isPropertyReference(property)) {
					continue;
				}
				break;
			default:
				break;
			}
			String name = property.getName();

			if (!overwrite) {
				if (result.containsKey(name)) {
					continue;
				}
			}

			result.put(name, property);
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

	public static SummarizeExpression getSummarizeExpression(ModelDefinition model) {
		if (model == null) {
			return null;
		}
		EObject rhs = model.getRhs();
		if (rhs instanceof SummarizeExpression) {
			return (SummarizeExpression) rhs;
		}
		return null;
	}

	public static JoinExpression getJoinExpression(ModelDefinition model) {
		if (model == null) {
			return null;
		}
		EObject rhs = model.getRhs();
		if (rhs instanceof JoinExpression) {
			return (JoinExpression) rhs;
		}
		return null;
	}

	public static List<ModelDefinition> getProjectiveContainsModel(ModelDefinition model, List<ModelDefinition> projectiveList) {
		if (model == null || projectiveList == null) {
			return Collections.emptyList();
		}

		List<Property> properties = ModelUtil.getProperties(model, PropertyFilter.ALL);
		Map<String, Type> map = new HashMap<String, Type>(properties.size());
		for (Property property : properties) {
			String name = property.getName();
			Type type = PropertyUtil.getResolvedDataType(property);
			map.put(name, type);
		}

		String modelName = model.getName();
		List<ModelDefinition> result = new ArrayList<ModelDefinition>();
		loop: for (ModelDefinition projectiveModel : projectiveList) {
			if (modelName.equals(projectiveModel.getName())) {
				continue;
			}
			List<Property> projProps = ModelUtil.getProperties(projectiveModel, PropertyFilter.ALL);
			if (projProps == null || projProps.isEmpty()) {
				continue;
			}
			for (Property property : projProps) {
				String name = property.getName();
				Type type = PropertyUtil.getResolvedDataType(property);
				if (!equals(map.get(name), type)) {
					continue loop;
				}
			}
			result.add(projectiveModel);
		}

		return result;
	}

	private static boolean equals(Type type1, Type type2) {
		if (type1 == null) {
			return type2 == null;
		}
		if (type2 == null) {
			return false;
		}
		BasicType basicType1 = type1.getBasicType();
		BasicType basicType2 = type2.getBasicType();
		if (basicType1 != null || basicType2 != null) {
			return basicType1 == basicType2;
		}
		// TODO Type.equals
		return false;
	}

	public static Property findProperty(ModelDefinition model, String name) {
		if (model == null || name == null) {
			return null;
		}

		Map<String, Property> map = getPropertiesMap(model, PropertyFilter.ALL);
		{
			Property p = map.get(name);
			if (p != null) {
				return p;
			}
		}
		for (Property p : map.values()) {
			String pname = StringUtil.toLowerCamelCase(p.getName());
			if (name.equals(pname)) {
				return p;
			}
		}
		return null;
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

	public static boolean containsAttribute(ModelDefinition model, String attributeName) {
		if (model == null || attributeName == null) {
			return false;
		}

		AttributeList list = model.getAttributes();
		if (list == null) {
			return false;
		}
		for (Attribute attr : list.getAttributes()) {
			if (attributeName.equals(attr.getName())) {
				return true;
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
		if (model == null) {
			return null;
		}
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

	public static List<String> getModelClassName(org.eclipse.jdt.core.dom.Type type) {
		Map<String, Set<String>> map = collectTypeParameter(type);
		String name = AfwStringUtil.extractModelClassName(type.toString());
		Set<String> set = map.get(name);
		if (set == null) {
			return Collections.singletonList(name);
		}

		return new ArrayList<String>(set);
	}

	@SuppressWarnings("unchecked")
	private static Map<String, Set<String>> collectTypeParameter(ASTNode node) {
		Map<String, Set<String>> map = new HashMap<String, Set<String>>();
		for (; node != null; node = node.getParent()) {
			List<TypeParameter> typeParameters = null;
			if (node instanceof MethodDeclaration) {
				typeParameters = ((MethodDeclaration) node).typeParameters();
			} else if (node instanceof TypeDeclaration) {
				typeParameters = ((TypeDeclaration) node).typeParameters();
			}

			if (typeParameters != null) {
				for (TypeParameter param : typeParameters) {
					String name = param.getName().getIdentifier();
					if (!map.containsKey(name)) {
						List<org.eclipse.jdt.core.dom.Type> typeBounds = param.typeBounds();
						Set<String> set = new LinkedHashSet<String>(typeBounds.size());
						for (org.eclipse.jdt.core.dom.Type bound : typeBounds) {
							set.add(AfwStringUtil.extractModelClassName(bound.toString()));
						}
						map.put(name, set);
					}
				}
			}
		}
		return map;
	}
}
