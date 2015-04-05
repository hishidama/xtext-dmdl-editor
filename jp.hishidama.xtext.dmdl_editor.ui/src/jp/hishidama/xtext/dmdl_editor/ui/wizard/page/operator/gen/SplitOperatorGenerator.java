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
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;

public class SplitOperatorGenerator extends OperatorGenerator {

	@Override
	protected Annotation getAnnotation() {
		return newMarkerAnnotation(OperatorType.SPLIT.getTypeName());
	}

	@Override
	protected String getReturnTypeName(Javadoc javadoc) {
		return "void";
	}

	@Override
	protected void getParameters(List<SingleVariableDeclaration> plist, Javadoc javadoc) {
		List<OperatorInputModelRow> ilist = getInputModelList();
		for (OperatorInputModelRow row : ilist) {
			plist.add(newSimpleParameter(row.getModelTypeName(), row.name));
			addJavadocParam(javadoc, row.name, row.getLabel());

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
							String rname = rmodel.getName();
							String className = ModelUiUtil.getModelClassName(project, rname);
							if (className != null) {
								String name = getName(i++);
								plist.add(newResultParameter(className, name));
								addJavadocParam(javadoc, name, getLabel(rmodel));
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
