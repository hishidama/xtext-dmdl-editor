package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.hishidama.eclipse_plugin.jdt.util.JavadocUtil;
import jp.hishidama.eclipse_plugin.jdt.util.TypeUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart.FlowpartModelRow;

import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.ILocalVariable;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.ITypeParameter;
import org.eclipse.jdt.core.JavaModelException;

public class OperatorMethodParser {

	private final IMethod method;

	private List<OperatorInputModelRow> inputList;
	private List<OperatorInputModelRow> viewList;
	private List<OperatorOutputModelRow> outputList;
	private List<ArgumentRow> argList;

	public OperatorMethodParser(IMethod method) {
		this.method = method;
	}

	public List<OperatorInputModelRow> getViewList() {
		initList();
		return viewList;
	}

	public List<ArgumentRow> getArgumentList() {
		initList();
		return argList;
	}

	private void initList() {
		if (inputList != null) {
			return;
		}
		this.inputList = new ArrayList<OperatorInputModelRow>();
		this.viewList = new ArrayList<OperatorInputModelRow>();
		this.outputList = new ArrayList<OperatorOutputModelRow>();
		this.argList = new ArrayList<ArgumentRow>();

		IJavaProject javaProject = method.getJavaProject();
		IProject project = javaProject.getProject();
		try {
			Map<String, String> genericsMap = new HashMap<String, String>();
			for (ITypeParameter param : method.getTypeParameters()) {
				String genericsName = param.getElementName();
				String className = null;
				for (String bound : param.getBounds()) {
					className = OperatorInputModelRow.catModelClassName(className, bound);
				}
				genericsMap.put(genericsName, className);
			}

			Map<String, String> paramJavadoc = JavadocUtil.getParamMap(JavadocUtil.getJavadoc(method));
			for (ILocalVariable param : method.getParameters()) {
				String typeName = TypeUtil.getVariableTypeName(param);
				int s = typeName.indexOf('<');
				int e = typeName.lastIndexOf('>');
				if (s >= 0 && e >= 0) {
					String listClassName = typeName.substring(0, s);
					String modelClassName = typeName.substring(s + 1, e);
					initPort(project, param, listClassName, modelClassName, paramJavadoc, genericsMap);
				} else {
					boolean isModel = ModelUiUtil.isModelClass(javaProject, typeName);
					if (isModel) {
						initPort(project, param, null, typeName, paramJavadoc, genericsMap);
					} else {
						initArgument(param, typeName, paramJavadoc);
					}
				}
			}
		} catch (JavaModelException e) {
			LogUtil.logWarn("Operator method parse error.", e);
		}
	}

	private void initPort(IProject project, ILocalVariable param, String listClassName, String modelClassName, Map<String, String> paramJavadoc, Map<String, String> genericsMap) {
		if (listClassName == null) {
			OperatorInputModelRow row = new OperatorInputModelRow();
			row.listClassName = null;
			initPort(row, project, param, modelClassName, paramJavadoc, genericsMap);
			inputList.add(row);
			return;
		}
		if (listClassName.endsWith("Result")) {
			OperatorOutputModelRow row = new OperatorOutputModelRow();
			initPort(row, project, param, modelClassName, paramJavadoc, genericsMap);
			outputList.add(row);
			return;
		}

		if (listClassName.endsWith("View")) {
			OperatorInputModelRow row = new OperatorInputModelRow();
			row.listClassName = listClassName;
			initPort(row, project, param, modelClassName, paramJavadoc, genericsMap);
			viewList.add(row);
			return;
		}

		OperatorInputModelRow row = new OperatorInputModelRow();
		row.listClassName = listClassName;
		initPort(row, project, param, modelClassName, paramJavadoc, genericsMap);
		inputList.add(row);
	}

	private void initPort(OperatorModelRow row, IProject project, ILocalVariable param, String modelClassName, Map<String, String> paramJavadoc, Map<String, String> genericsMap) {
		row.name = param.getElementName();
		row.comment = StringUtil.trim(paramJavadoc.get(row.name));
		row.setModelClassName(modelClassName);

		String genericsBound = genericsMap.get(modelClassName);
		if (genericsBound != null) {
			row.genericsName = modelClassName;
			row.setModelClassName(genericsBound);
			for (String boundClassName : row.getModelClassNames()) {
				ModelDefinition model = ModelUiUtil.findModelByClass(project, boundClassName);
				if (model != null) {
					row.modelName = FlowpartModelRow.catModelName(row.modelName, model.getName());
					row.modelDescription = FlowpartModelRow.catModelDescription(row.modelDescription, ModelUtil.getDecodedDescriptionText(model));
				}
			}
		} else {
			ModelDefinition model = ModelUiUtil.findModelByClass(project, modelClassName);
			if (model != null) {
				row.modelName = model.getName();
				row.modelDescription = ModelUtil.getDecodedDescriptionText(model);
			}
		}
	}

	private void initArgument(ILocalVariable param, String typeName, Map<String, String> paramJavadoc) {
		ArgumentRow row = new ArgumentRow();
		row.name = param.getElementName();
		String resolveTypeName = TypeUtil.resolveTypeName(typeName, method.getDeclaringType());
		if (resolveTypeName != null) {
			row.type = resolveTypeName;
		} else {
			row.type = typeName;
		}
		row.comment = StringUtil.trim(paramJavadoc.get(row.name));

		argList.add(row);
	}
}
