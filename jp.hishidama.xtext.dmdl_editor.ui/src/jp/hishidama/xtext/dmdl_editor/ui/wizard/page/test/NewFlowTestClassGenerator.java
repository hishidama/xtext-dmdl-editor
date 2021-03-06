package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.extension.AsakusafwConfiguration;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowParameter;
import jp.hishidama.eclipse_plugin.java.ClassGenerator;
import jp.hishidama.eclipse_plugin.util.FileUtil;

public abstract class NewFlowTestClassGenerator extends ClassGenerator {
	private IProject project;
	private IPath srcDir;

	private String superClassName;
	protected String classUnderTestName;
	private List<TestExcelNameRow> portList;
	private List<FlowParameter> paramList;

	public NewFlowTestClassGenerator(IProject project, IPath dir) {
		this.project = project;
		this.srcDir = dir;
	}

	public void generate(String packageName, String className, String superClassName, String classUnderTestName, List<TestExcelNameRow> portList, List<FlowParameter> paramList) throws CoreException {
		this.superClassName = superClassName;
		this.classUnderTestName = classUnderTestName;
		this.portList = portList;
		this.paramList = paramList;

		String contents = super.generate(packageName, className);

		IFile file = getFile(packageName);
		FileUtil.save(file, contents);
		FileUtil.openFile(file, getFullClassName());
	}

	private IFile getFile(String packageName) throws CoreException {
		IWorkspaceRoot workspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
		IFolder folder = workspaceRoot.getFolder(srcDir);
		folder = folder.getFolder(packageName.replace('.', '/'));
		IFile file = folder.getFile(className + ".java");
		FileUtil.createFolder(project, folder.getProjectRelativePath());
		return file;
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void appendClass(StringBuilder sb) {
		appendJavadoc(sb);
		sb.append("public class ");
		sb.append(className);
		if (!"java.lang.Object".equals(superClassName)) {
			sb.append(" extends ");
			sb.append(getCachedClassName(superClassName));
		}
		sb.append(" {\n");
		appendSegmentSeparator(sb);
		appendDescribe(sb);
		sb.append("}\n");
	}

	private void appendJavadoc(StringBuilder sb) {
		sb.append("/**\n");
		sb.append(" * {@link ");
		sb.append(getCachedClassName(classUnderTestName));
		sb.append("}のテスト。\n");
		sb.append(" */\n");
	}

	private void appendSegmentSeparator(StringBuilder sb) {
		String version = getAsakusafwVersion();
		if (AsakusafwConfiguration.compareVersion(version, "0.7.0") >= 0) {
			sb.append("\n");
			sb.append("\tstatic {\n");
			sb.append("\t\t");
			sb.append(getCachedClassName("java.lang.System"));
			sb.append(".setProperty(");
			sb.append(getCachedClassName("com.asakusafw.testdriver.core.PropertyName"));
			sb.append(".KEY_SEGMENT_SEPARATOR, \"_\");\n");
			sb.append("\t}\n");
		}
	}

	protected final String getAsakusafwVersion() {
		return AsakusafwConfiguration.getAsakusaFwVersion(project);
	}

	private void appendDescribe(StringBuilder sb) {
		sb.append("\n");
		sb.append("\t@");
		sb.append(getCachedClassName("org.junit.Test"));
		sb.append("\n");
		sb.append("\tpublic void describe() {\n");

		String testerClassName = getCachedClassName(getTesterClassName());
		sb.append("\t\t");
		sb.append(testerClassName);
		sb.append(" tester = new ");
		sb.append(testerClassName);
		sb.append("(getClass());\n");

		sb.append("\t\t// TODO tester.setBatchArg(\"arg\", \"value\");\n");

		sb.append("\n");
		appendPort(sb);
		appendParameter(sb);

		sb.append("\n");
		appendRunTest(sb);

		sb.append("\t}\n");
	}

	protected abstract String getTesterClassName();

	private void appendPort(StringBuilder sb) {
		for (TestExcelNameRow row : portList) {
			if (row.in) {
				appendDataBase(sb, row, "input");
				appendDataPrepare(sb, row);
			} else {
				appendDataBase(sb, row, "output");
				appendDataVerify(sb, row);
			}
		}
	}

	private void appendDataBase(StringBuilder sb, TestExcelNameRow row, String methodName) {
		sb.append("\t\t");
		appendDataBasePrefix(sb, row);
		sb.append("tester.");
		sb.append(methodName);
		sb.append("(\"");
		sb.append(row.name);
		sb.append("\", ");
		sb.append(getCachedClassName(getDataBaseClassName(row)));
		sb.append(".class)");
	}

	protected String getDataBaseClassName(TestExcelNameRow row) {
		return row.modelClassName;
	}

	protected void appendDataBasePrefix(StringBuilder sb, TestExcelNameRow row) {
		// do override
	}

	private void appendDataPrepare(StringBuilder sb, TestExcelNameRow row) {
		sb.append(".prepare(\"");
		sb.append(row.excelDstFileName);
		sb.append("#");
		sb.append(row.sheetName);
		sb.append("\");\n");
	}

	private void appendDataVerify(StringBuilder sb, TestExcelNameRow row) {
		sb.append(".verify(\"");
		sb.append(row.excelDstFileName);
		sb.append("#");
		sb.append(row.sheetName);
		sb.append("\", \"");
		sb.append(row.excelDstFileName);
		sb.append("#");
		sb.append(row.ruleName);
		sb.append("\");\n");
	}

	private void appendParameter(StringBuilder sb) {
		for (FlowParameter row : paramList) {
			if (row.isPort()) {
				continue;
			}
			appendParameter(sb, row);
		}
	}

	protected void appendParameter(StringBuilder sb, FlowParameter row) {
		// do override
	}

	protected abstract void appendRunTest(StringBuilder sb);
}
