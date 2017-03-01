package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowParameter;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;

public class NewFlowpartTestClassGenerator extends NewFlowTestClassGenerator {

	private List<String> varList = new ArrayList<String>();
	private final Map<String, String> typeParameterMap;

	public NewFlowpartTestClassGenerator(IProject project, IPath dir, Map<String, String> typeParameterMap) {
		super(project, dir);
		this.typeParameterMap = typeParameterMap;
	}

	@Override
	protected String getTesterClassName() {
		return "com.asakusafw.testdriver.FlowPartTester";
	}

	@Override
	protected void appendDataBasePrefix(StringBuilder sb, TestExcelNameRow row) {
		if (row.in) {
			sb.append(getCachedClassName(FlowUtil.IN_NAME));
		} else {
			sb.append(getCachedClassName(FlowUtil.OUT_NAME));
		}
		sb.append("<");
		sb.append(getCachedClassName(getDataBaseClassName(row)));
		sb.append("> ");
		sb.append(row.name);
		sb.append(" = ");

		varList.add(row.name);
	}

	@Override
	protected String getDataBaseClassName(TestExcelNameRow row) {
		String c = typeParameterMap.get(row.originalModelClassName);
		if (c != null) {
			return c;
		}
		return row.modelClassName;
	}

	@Override
	protected void appendParameter(StringBuilder sb, FlowParameter row) {
		sb.append("\t\t");
		sb.append(getCachedClassName(row.getType()));
		sb.append(" ");
		sb.append(row.getName());
		sb.append(" = ");
		if (isPrimitive(row.getType())) {
			sb.append("0");
		} else {
			sb.append("null");
		}
		sb.append("; // TODO ");
		sb.append(row.getName());
		sb.append("\n");

		varList.add(row.getName());
	}

	@Override
	protected void appendRunTest(StringBuilder sb) {
		sb.append("\t\t");
		sb.append(getCachedClassName("com.asakusafw.vocabulary.flow.FlowDescription"));
		sb.append(" flowPart = new ");
		sb.append(getCachedClassName(classUnderTestName));
		if (!typeParameterMap.isEmpty()) {
			sb.append("<");
			boolean first = true;
			for (String className : typeParameterMap.values()) {
				if (first) {
					first = false;
				} else {
					sb.append(", ");
				}
				sb.append(getCachedClassName(className));
			}
			sb.append(">");
		}
		sb.append("(");
		boolean first = true;
		for (String variable : varList) {
			if (first) {
				first = false;
			} else {
				sb.append(", ");
			}
			sb.append(variable);
		}
		sb.append(");\n");

		sb.append("\t\ttester.runTest(flowPart);\n");
	}
}
