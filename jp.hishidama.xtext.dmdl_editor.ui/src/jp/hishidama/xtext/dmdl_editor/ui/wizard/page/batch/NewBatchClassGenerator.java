package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.batch;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.BatchUtil;
import jp.hishidama.eclipse_plugin.java.ClassGenerator;
import jp.hishidama.eclipse_plugin.util.FileUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.batch.JobRow.JobNamePair;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

public class NewBatchClassGenerator extends ClassGenerator {
	private IProject project;
	private IPath srcDir;

	private String batchName;
	private String batchComment;
	private boolean batchStrict;
	private List<BatchParameterRow> paramList;
	private List<JobRow> jobList;

	public NewBatchClassGenerator(IProject project, IPath dir) {
		this.project = project;
		this.srcDir = dir;
	}

	public void generate(String packageName, String className, String batchName, String batchComment,
			boolean batchStrict, List<BatchParameterRow> paramList, List<JobRow> jobList) throws CoreException {
		this.batchName = batchName;
		this.batchComment = batchComment;
		this.batchStrict = batchStrict;
		this.paramList = paramList;
		this.jobList = jobList;

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
		setClassJavadoc(sb, batchComment);
		appendAnnotation(sb);
		sb.append("public class ");
		sb.append(className);
		sb.append(" extends ");
		sb.append(getCachedClassName(BatchUtil.BATCH_DESCRIPTION_NAME));
		sb.append(" {\n");
		{
			appenddescribe(sb);
		}
		sb.append("}\n");
	}

	private void appendAnnotation(StringBuilder sb) {
		sb.append("@");
		sb.append(getCachedClassName(BatchUtil.BATCH_NAME));
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
		Map<String, String> map = new HashMap<String, String>();
		{
			Set<String> set = new HashSet<String>();
			for (JobRow row : jobList) {
				for (JobNamePair pair : row.list) {
					set.add(pair.className);
				}
			}
			int id = 1;
			Set<String> varSet = new HashSet<String>();
			for (JobRow row : jobList) {
				if (set.contains(row.className)) {
					if (!map.containsKey(row.className)) {
						String varName = StringUtil.toFirstLower(StringUtil.getSimpleName(row.className));
						while (varSet.contains(varName)) {
							varName = "job" + id;
							id++;
						}
						varSet.add(varName);
						map.put(row.className, varName);
					}
				}
			}
		}

		sb.append("\n");
		sb.append("\t@Override\n");
		sb.append("\tpublic void describe() {\n");
		if (jobList.isEmpty()) {
			sb.append("\t\t// TODO Work job1 = run(Job1.class).soon();\n");
			sb.append("\t\t// run(Job2.class).after(job1);\n");
		} else {
			for (JobRow row : jobList) {
				sb.append("\t\t");
				String varName = map.get(row.className);
				if (varName != null) {
					sb.append(getCachedClassName(BatchUtil.WORK_NAME));
					sb.append(" ");
					sb.append(varName);
					sb.append(" = ");
				}
				sb.append("run(");
				sb.append(getCachedClassName(row.className));
				sb.append(".class)");
				if (row.list.isEmpty()) {
					sb.append(".soon()");
				} else {
					sb.append(".after(");
					for (JobNamePair job : row.list) {
						if (sb.charAt(sb.length() - 1) != '(') {
							sb.append(", ");
						}
						sb.append(map.get(job.className));
					}
					sb.append(")");
				}
				sb.append(";\n");
			}
		}
		sb.append("\t}\n");
	}
}
