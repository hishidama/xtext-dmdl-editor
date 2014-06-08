package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.ecore.EObject;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.dmdl.DataModelType;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeExpression;

public class DataModelTypeUtil {

	public static DataModelType valueOf(String s) {
		if (s == null) {
			return DataModelType.RECORD;
		}
		return DataModelType.valueOf(s.toUpperCase());
	}

	public static DataModelType valueOf(ModelDefinition model) {
		if (model == null) {
			return DataModelType.RECORD;
		}
		EObject rhs = model.getRhs();
		if (rhs instanceof JoinExpression) {
			return DataModelType.JOINED;
		} else if (rhs instanceof SummarizeExpression) {
			return DataModelType.SUMMARIZED;
		}
		if ("projective".equals(model.getType())) {
			return DataModelType.PROJECTIVE;
		} else {
			return DataModelType.RECORD;
		}
	}
}
