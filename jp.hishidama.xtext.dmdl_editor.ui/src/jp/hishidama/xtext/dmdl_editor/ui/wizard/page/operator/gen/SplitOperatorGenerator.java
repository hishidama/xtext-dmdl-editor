package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.gen;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorInputModelRow;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;

public class SplitOperatorGenerator extends OperatorGenerator {

	@Override
	protected Annotation getAnnotation() {
		return newMarkerAnnotation(OperatorType.SPLIT.getTypeName());
	}

	@Override
	protected String getReturnTypeName() {
		return "void";
	}

	@Override
	protected void getParameters(List<SingleVariableDeclaration> plist) {
		List<OperatorInputModelRow> ilist = getInputModelList();
		for (OperatorInputModelRow row : ilist) {
			plist.add(newSimpleParameter(row.modelClassName, row.name));

			int i = 0;

			IProject project = getProject();
			ModelDefinition model = ModelUiUtil.findModel(project, row.modelName);
			JoinExpression rhs = ModelUtil.getJoinExpression(model);
			if (rhs != null) {
				EList<JoinTerm> termList = rhs.getTerms();
				for (JoinTerm term : termList) {
					ModelReference ref = term.getReference();
					if (ref != null) {
						ModelDefinition rmodel = ref.getName();
						if (rmodel != null) {
							String name = rmodel.getName();
							String className = ModelUiUtil.getModelClassName(project, name);
							if (className != null) {
								plist.add(newResultParameter(className, getName(i++)));
							}
						}
					}
				}
			}

			return;
		}
	}

	private String getName(int i) {
		switch (i) {
		case 0:
			return "left";
		case 1:
			return "right";
		default:
			return "out" + (i + 1);
		}
	}

	@Override
	protected Block getBody() {
		return null;
	}
}
