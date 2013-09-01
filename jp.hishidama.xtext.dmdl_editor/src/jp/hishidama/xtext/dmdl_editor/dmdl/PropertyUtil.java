package jp.hishidama.xtext.dmdl_editor.dmdl;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;

public class PropertyUtil {

	public static Type getResolvedDataType(Property property) {
		return resoloveDataType(property, new HashSet<String>());
	}

	private static Type resoloveDataType(Property property, Set<String> set) {
		if (property == null) {
			return null;
		}

		ModelDefinition model = getModelDefinition(property);
		if (model == null) {
			return null;
		}
		String modelName = model.getName();
		if (set.contains(modelName)) {
			return null;
		}
		set.add(modelName);

		if (property instanceof PropertyDefinition) {
			PropertyDefinition p = (PropertyDefinition) property;
			return p.getType();
		}
		if (property instanceof PropertyMapping) {
			PropertyMapping p = (PropertyMapping) property;
			return resoloveDataType(p.getFrom(), set);
		}
		if (property instanceof PropertyFolding) {
			PropertyFolding p = (PropertyFolding) property;
			String aggr = p.getAggregator();
			if ("count".equals(aggr)) {
				return Type.LONG;
			}

			Type r = resoloveDataType(p.getFrom(), set);
			if ("sum".equals(aggr)) {
				if (r == null) {
					return null;
				}
				switch (r) {
				case BYTE:
				case SHORT:
				case INT:
				case LONG:
					return Type.LONG;
				case FLOAT:
				case DOUBLE:
					return Type.DOUBLE;
				case DECIMAL:
					return Type.DECIMAL;
				default:
					return null;
				}
			}
			return r;
		}
		throw new IllegalStateException("property=" + property);
	}

	public static String getModelName(EObject object) {
		ModelDefinition model = getModelDefinition(object);
		if (model != null) {
			return model.getName();
		}
		return null;
	}

	public static ModelDefinition getModelDefinition(EObject object) {
		while (object != null) {
			if (object instanceof ModelDefinition) {
				return (ModelDefinition) object;
			}
			object = object.eContainer();
		}
		return null;
	}
}
