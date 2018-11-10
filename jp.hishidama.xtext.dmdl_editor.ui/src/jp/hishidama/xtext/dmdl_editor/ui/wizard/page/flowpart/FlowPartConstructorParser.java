package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.jdt.util.AnnotationUtil;
import jp.hishidama.eclipse_plugin.jdt.util.JavadocUtil;
import jp.hishidama.eclipse_plugin.jdt.util.TypeUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;

import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.ILocalVariable;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeParameter;
import org.eclipse.jdt.core.JavaModelException;

public class FlowPartConstructorParser {

	private final IType flowPartType;
	private List<FlowpartModelRow> portList;
	private List<ArgumentRow> argList;

	public FlowPartConstructorParser(IType flowPartType) {
		this.flowPartType = flowPartType;
	}

	public List<FlowpartModelRow> getPortList() {
		initList();
		return portList;
	}

	public List<ArgumentRow> getArgumentList() {
		initList();
		return argList;
	}

	private void initList() {
		if (portList != null) {
			return;
		}
		this.portList = new ArrayList<FlowpartModelRow>();
		this.argList = new ArrayList<ArgumentRow>();

		IMethod constructor = TypeUtil.findConsructor(flowPartType);
		if (constructor == null) {
			return;
		}
		IProject project = flowPartType.getJavaProject().getProject();
		try {
			Map<String, String> genericsMap = new HashMap<String, String>();
			for (ITypeParameter param : flowPartType.getTypeParameters()) {
				String genericsName = param.getElementName();
				String className = null;
				for (String bound : param.getBounds()) {
					className = FlowpartModelRow.catModelClassName(className, bound);
				}
				genericsMap.put(genericsName, className);
			}

			Map<String, String> paramJavadoc = JavadocUtil.getParamMap(JavadocUtil.getJavadoc(constructor));
			for (ILocalVariable param : constructor.getParameters()) {
				String typeName = TypeUtil.getVariableTypeName(param);
				int s = typeName.indexOf('<');
				int e = typeName.lastIndexOf('>');
				if (s >= 0 && e >= 0) {
					String modelClassName = typeName.substring(s + 1, e);
					initPort(project, param, typeName, modelClassName, paramJavadoc, genericsMap);
				} else {
					initArgument(param, typeName, paramJavadoc);
				}
			}
		} catch (JavaModelException e) {
			LogUtil.logWarn("FlowPart parse error.", e);
		}
	}

	private void initPort(IProject project, ILocalVariable param, String typeName, String modelClassName, Map<String, String> paramJavadoc, Map<String, String> genericsMap) {
		FlowpartModelRow row = new FlowpartModelRow();
		row.in = typeName.startsWith(FlowUtil.IN_NAME);
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

		String desc = AnnotationUtil.getAnnotationValue(flowPartType, param, FlowUtil.IMPORT_NAME, "description");
		if (desc == null) {
			desc = AnnotationUtil.getAnnotationValue(flowPartType, param, FlowUtil.EXPORT_NAME, "description");
		}

		portList.add(row);
	}

	private void initArgument(ILocalVariable param, String typeName, Map<String, String> paramJavadoc) {
		ArgumentRow row = new ArgumentRow();
		row.name = param.getElementName();
		row.type = typeName;
		row.comment = StringUtil.trim(paramJavadoc.get(row.name));

		argList.add(row);
	}
}
