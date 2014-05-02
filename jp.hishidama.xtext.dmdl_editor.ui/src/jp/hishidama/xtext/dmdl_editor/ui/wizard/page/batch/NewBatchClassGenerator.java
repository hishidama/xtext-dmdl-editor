package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.batch;

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

public class NewBatchClassGenerator extends ClassGenerator {
	private IProject project;
	private IPath srcDir;

	private String batchName;
	private String batchComment;
	private boolean batchStrict;
	private List<BatchParameterRow> paramList;

	public NewBatchClassGenerator(IProject project, IPath dir) {
		this.project = project;
		this.srcDir = dir;
	}

	public void generate(String packageName, String className, String batchName, String batchComment,
			boolean batchStrict, List<BatchParameterRow> list) throws CoreException {
		this.batchName = batchName;
		this.batchComment = batchComment;
		this.batchStrict = batchStrict;
		this.paramList = list;

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
		appendAnnotation(sb);
		sb.append("public class ");
		sb.append(className);
		sb.append(" extends ");
		sb.append(getCachedClassName("com.asakusafw.vocabulary.batch.BatchDescription"));
		sb.append(" {\n");
		{
			appenddescribe(sb);
		}
		sb.append("}\n");
	}

	private void appendAnnotation(StringBuilder sb) {
		sb.append("@");
		sb.append(getCachedClassName("com.asakusafw.vocabulary.batch.Batch"));
		sb.append("(\n");
		sb.append("\tname = \"");
		sb.append(batchName);
		sb.append("\",\n");
		sb.append("\tcomment = \"");
		sb.append(batchComment);
		sb.append("\",\n");
		if (!paramList.isEmpty()) {
			sb.append("\tparameters = {\n");
			for (BatchParameterRow param : paramList) {
				sb.append("\t\t@");
				sb.append(getCachedClassName("com.asakusafw.vocabulary.batch.Batch.Parameter"));
				sb.append("(key = \"");
				sb.append(param.name);
				sb.append("\", comment=\"");
				sb.append(param.comment);
				sb.append("\"");
				sb.append(", pattern = \"");
				sb.append(param.pattern);
				sb.append("\", required = ");
				sb.append(param.required);
				sb.append("),\n");
			}
			sb.append("\t},\n");
		}
		sb.append("\tstrict = ");
		sb.append(batchStrict);
		sb.append(")\n");
	}

	private void appenddescribe(StringBuilder sb) {
		sb.append("\n");
		sb.append("\t@Override\n");
		sb.append("\tpublic void describe() {\n");
		sb.append("\t\t// TODO run(Job1.class).soon(); run(Job2.class).after(job1);\n");
		sb.append("\t}\n");
	}
}
