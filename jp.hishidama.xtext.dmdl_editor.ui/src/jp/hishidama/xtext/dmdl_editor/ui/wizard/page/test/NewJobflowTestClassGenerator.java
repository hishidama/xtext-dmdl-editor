package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

import jp.hishidama.eclipse_plugin.java.ClassGenerator;
import jp.hishidama.eclipse_plugin.util.FileUtil;

public class NewJobflowTestClassGenerator extends ClassGenerator {
	private IProject project;
	private IPath srcDir;

	private String superClassName;
	private List<TestExcelRow> porterList;
	private String classUnderTestName;

	public NewJobflowTestClassGenerator(IProject project, IPath dir) {
		this.project = project;
		this.srcDir = dir;
	}

	public void generate(String packageName, String className, String superClassName, String classUnderTestName,
			List<TestExcelRow> list) throws CoreException {
		this.superClassName = superClassName;
		this.classUnderTestName = classUnderTestName;
		this.porterList = list;

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
		appenddescribe(sb);
		sb.append("}\n");
	}

	private void appendJavadoc(StringBuilder sb) {
		sb.append("/**\n");
		sb.append(" * {@link ");
		sb.append(getCachedClassName(classUnderTestName));
		sb.append("}のテスト。\n");
		sb.append(" */\n");
	}

	private void appenddescribe(StringBuilder sb) {
		sb.append("\n");
		sb.append("\t@");
		sb.append(getCachedClassName("org.junit.Test"));
		sb.append("\n");
		sb.append("\tpublic void describe() {\n");

		String testerClassName = getCachedClassName("com.asakusafw.testdriver.JobFlowTester");
		sb.append("\t\t");
		sb.append(testerClassName);
		sb.append(" tester = new ");
		sb.append(testerClassName);
		sb.append("(getClass());\n");

		sb.append("\t\t// TODO tester.setBatchArg(\"arg\", \"value\");\n");

		sb.append("\n");
		for (TestExcelRow row : porterList) {
			if (row.in) {
				appendDataBase(sb, row, "input");
				appendDataPrepare(sb, row);
			} else {
				appendDataBase(sb, row, "output");
				appendDataVerify(sb, row);
			}
		}

		sb.append("\n");
		sb.append("\t\ttester.runTest(");
		sb.append(getCachedClassName(classUnderTestName));
		sb.append(".class);\n");

		sb.append("\t}\n");
	}

	private void appendDataBase(StringBuilder sb, TestExcelRow row, String methodName) {
		sb.append("\t\ttester.");
		sb.append(methodName);
		sb.append("(\"");
		sb.append(row.name);
		sb.append("\", ");
		sb.append(getCachedClassName(row.modelClassName));
		sb.append(".class)");
	}

	private void appendDataPrepare(StringBuilder sb, TestExcelRow row) {
		sb.append(".prepare(\"");
		sb.append(row.excelDstFileName);
		sb.append("#");
		sb.append(row.sheetName);
		sb.append("\");\n");
	}

	private void appendDataVerify(StringBuilder sb, TestExcelRow row) {
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
}
