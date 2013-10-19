package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import org.eclipse.emf.ecore.EObject;

import jp.hishidama.xtext.dmdl_editor.dmdl.JoinExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeExpression;

public enum DataModelType {
	NORMAL, SUMMARIZED, JOINED, PROJECTIVE;

	public String displayName() {
		return name().toLowerCase();
	}

	public static DataModelType valueOf(ModelDefinition model) {
		if (model == null) {
			return NORMAL;
		}
		EObject rhs = model.getRhs();
		if (rhs instanceof JoinExpression) {
			return JOINED;
		} else if (rhs instanceof SummarizeExpression) {
			return SUMMARIZED;
		}
		if ("projective".equals(model.getType())) {
			return PROJECTIVE;
		} else {
			return NORMAL;
		}
	}
}
