package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IPath;

public class NewJobflowTestClassGenerator extends NewFlowTestClassGenerator {

	public NewJobflowTestClassGenerator(IProject project, IPath dir) {
		super(project, dir);
	}

	@Override
	protected String getTesterClassName() {
		return "com.asakusafw.testdriver.JobFlowTester";
	}

	@Override
	protected void appendRunTest(StringBuilder sb) {
		sb.append("\t\ttester.runTest(");
		sb.append(getCachedClassName(classUnderTestName));
		sb.append(".class);\n");
	}
}
