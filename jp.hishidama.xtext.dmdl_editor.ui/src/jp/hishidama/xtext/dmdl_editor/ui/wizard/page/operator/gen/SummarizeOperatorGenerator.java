package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.gen;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorOutputModelRow;

import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;

public class SummarizeOperatorGenerator extends OperatorGenerator {

	@Override
	protected Annotation getAnnotation() {
		return newMarkerAnnotation(OperatorType.SUMMARIZE.getTypeName());
	}

	@Override
	protected String getReturnTypeName() {
		List<OperatorOutputModelRow> olist = getOutputModelList();
		for (OperatorOutputModelRow row : olist) {
			return row.modelClassName;
		}
		return "error";
	}

	@Override
	protected void getParameters(List<SingleVariableDeclaration> plist) {
		List<OperatorOutputModelRow> olist = getOutputModelList();
		for (OperatorOutputModelRow row : olist) {
			IProject project = getProject();
			ModelDefinition model = ModelUiUtil.findModel(project, row.modelName);
			SummarizeExpression rhs = ModelUtil.getSummarizeExpression(model);
			if (rhs != null) {
				for (SummarizeTerm term : rhs.getTerms()) {
					ModelReference ref = term.getReference();
					if (ref != null) {
						ModelDefinition rmodel = ref.getName();
						String modelClassName = ModelUiUtil.getModelClassName(project, rmodel.getName());
						if (modelClassName != null) {
							plist.add(newSimpleParameter(modelClassName, "in"));
							return;
						}
					}
				}
			}
		}
	}

	@Override
	protected Block getBody() {
		return null;
	}
}
