package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.eclipse_plugin.java.ClassGenerator;
import jp.hishidama.eclipse_plugin.util.FileUtil;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;

public class NewFlowpartClassGenerator extends ClassGenerator {
	private IProject project;
	private IPath srcDir;

	private String description;
	private List<FlowpartModelRow> modelList;
	private List<ArgumentRow> argList;

	public NewFlowpartClassGenerator(IProject project, IPath dir) {
		this.project = project;
		this.srcDir = dir;
	}

	public void generate(String packageName, String className, String description, List<FlowpartModelRow> modelList,
			List<ArgumentRow> argList) throws CoreException {
		this.description = description;
		this.modelList = modelList;
		this.argList = argList;

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
		setClassJavadoc(sb, description);
		appendAnnotation(sb);
		sb.append("public class ");
		sb.append(className);
		appendGenerics(sb);
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
		sb.append(getCachedClassName("com.asakusafw.vocabulary.flow.FlowPart"));
		sb.append("\n");
	}

	private void appendGenerics(StringBuilder sb) {
		List<FlowpartModelRow> list = new ArrayList<FlowpartModelRow>();

		Set<String> set = new HashSet<String>();
		for (FlowpartModelRow row : modelList) {
			if (row.projective) {
				String key = String.format("<%s>%s", row.genericsName, row.getModelClassName());
				if (!set.contains(key)) {
					set.add(key);
					list.add(row);
					super.typeParameterSet.add(row.genericsName);
				}
			}
		}

		if (list.isEmpty()) {
			return;
		}

		sb.append("<");
		boolean first = true;
		for (FlowpartModelRow row : list) {
			if (first) {
				first = false;
			} else {
				sb.append(", ");
			}
			sb.append(row.genericsName);
			sb.append(" extends ");
			sb.append(getCachedClassName(row.getModelClassName()));

		}
		sb.append("> ");
	}

	private void appendFields(StringBuilder sb) {
		sb.append("\n");
		for (FlowpartModelRow row : modelList) {
			setLineJavadoc(sb, 1, row.comment);
			sb.append("\tprivate final ");
			appendVariableDefinition(sb, row);
			sb.append(";\n");
		}
		for (ArgumentRow row : argList) {
			setLineJavadoc(sb, 1, row.comment);
			sb.append("\tprivate ");
			sb.append(getCachedClassName(row.type));
			sb.append(" ");
			sb.append(row.name);
			sb.append(";\n");
		}
	}

	protected void appendVariableDefinition(StringBuilder sb, FlowpartModelRow row) {
		if (row.in) {
			sb.append(getCachedClassName("com.asakusafw.vocabulary.flow.In"));
		} else {
			sb.append(getCachedClassName("com.asakusafw.vocabulary.flow.Out"));
		}
		sb.append("<");
		sb.append(getCachedClassName(row.getModelTypeName()));
		sb.append("> ");
		sb.append(row.name);
	}

	private void appendConstructor(StringBuilder sb) {
		sb.append("\n");

		sb.append("\t/**\n");
		sb.append("\t * ");
		sb.append(description);
		sb.append("\n");
		for (FlowpartModelRow row : modelList) {
			setParamJavadoc(sb, 1, row.name, row.comment);
		}
		for (ArgumentRow row : argList) {
			setParamJavadoc(sb, 1, row.name, row.comment);
		}
		sb.append("\t */\n");

		sb.append("\tpublic ");
		sb.append(className);
		sb.append("(");

		boolean first = true;
		for (FlowpartModelRow row : modelList) {
			if (first) {
				first = false;
			} else {
				sb.append(",");
			}
			sb.append("\n\t\t");
			appendVariableDefinition(sb, row);
		}
		for (ArgumentRow row : argList) {
			if (first) {
				first = false;
			} else {
				sb.append(",");
			}
			sb.append("\n\t\t");
			sb.append(getCachedClassName(row.type));
			sb.append(" ");
			sb.append(row.name);
		}
		sb.append("\n\t) {\n");

		for (FlowpartModelRow row : modelList) {
			sb.append("\t\tthis.");
			sb.append(row.name);
			sb.append(" = ");
			sb.append(row.name);
			sb.append(";\n");
		}
		for (ArgumentRow row : argList) {
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
