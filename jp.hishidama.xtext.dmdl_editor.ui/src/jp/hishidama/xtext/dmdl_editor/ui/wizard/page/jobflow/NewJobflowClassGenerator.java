package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.jobflow;

import java.util.List;

import jp.hishidama.eclipse_plugin.java.ClassGenerator;
import jp.hishidama.eclipse_plugin.util.FileUtil;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

public class NewJobflowClassGenerator extends ClassGenerator {
	private IProject project;
	private IPath srcDir;

	private String jobflowName;
	private String jobDescription;
	private List<JobflowPorterRow> porterList;

	public NewJobflowClassGenerator(IProject project, IPath dir) {
		this.project = project;
		this.srcDir = dir;
	}

	public void generate(String packageName, String className, String jobflowName, String jobDescription,
			List<JobflowPorterRow> list) throws CoreException {
		this.jobflowName = jobflowName;
		this.jobDescription = jobDescription;
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
		setClassJavadoc(sb, jobDescription);

		appendAnnotation(sb);
		sb.append("public class ");
		sb.append(className);
		sb.append(" extends ");
		sb.append(getCachedClassName("com.asakusafw.vocabulary.flow.FlowDescription"));
		sb.append(" {\n");
		{
			appendFields(sb);
			appendConstructor(sb);
			appenddescribe(sb);
		}
		sb.append("}\n");
	}

	private void appendAnnotation(StringBuilder sb) {
		sb.append("@");
		sb.append(getCachedClassName("com.asakusafw.vocabulary.flow.JobFlow"));
		sb.append("(name = \"");
		sb.append(jobflowName);
		sb.append("\")\n");
	}

	private void appendFields(StringBuilder sb) {
		sb.append("\n");
		for (JobflowPorterRow row : porterList) {
			setLineJavadoc(sb, 1, row.comment);
			sb.append("\tprivate final ");
			appendVariableDefinition(sb, row);
			sb.append(";\n");
		}
	}

	protected void appendVariableDefinition(StringBuilder sb, JobflowPorterRow row) {
		if (row.in) {
			sb.append(getCachedClassName("com.asakusafw.vocabulary.flow.In"));
		} else {
			sb.append(getCachedClassName("com.asakusafw.vocabulary.flow.Out"));
		}
		sb.append("<");
		sb.append(getCachedClassName(row.modelClassName));
		sb.append("> ");
		sb.append(row.name);
	}

	private void appendConstructor(StringBuilder sb) {
		sb.append("\n");

		sb.append("\t/**\n");
		sb.append("\t * ");
		sb.append(jobDescription);
		sb.append("\n");
		for (JobflowPorterRow row : porterList) {
			setParamJavadoc(sb, 1, row.name, row.comment);
		}
		sb.append("\t */\n");

		sb.append("\tpublic ");
		sb.append(className);
		sb.append("(\n");

		int i = 0;
		for (JobflowPorterRow row : porterList) {
			sb.append("\t\t@");
			if (row.in) {
				sb.append(getCachedClassName("com.asakusafw.vocabulary.flow.Import"));
			} else {
				sb.append(getCachedClassName("com.asakusafw.vocabulary.flow.Export"));
			}
			sb.append("(name = \"");
			sb.append(row.name);
			sb.append("\", description = ");
			sb.append(getCachedClassName(row.porterClassName));
			sb.append(".class) ");

			appendVariableDefinition(sb, row);
			if (++i < porterList.size()) {
				sb.append(",");
			}
			sb.append("\n");
		}
		sb.append("\t) {\n");

		for (JobflowPorterRow row : porterList) {
			sb.append("\t\tthis.");
			sb.append(row.name);
			sb.append(" = ");
			sb.append(row.name);
			sb.append(";\n");
		}
		sb.append("\t}\n");
	}

	private void appenddescribe(StringBuilder sb) {
		sb.append("\n");
		sb.append("\t@Override\n");
		sb.append("\tpublic void describe() {\n");
		sb.append("\t\t// TODO " + className + ".describe()\n");
		sb.append("\t}\n");
	}
}
