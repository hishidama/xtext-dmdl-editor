package jp.hishidama.xtext.dmdl_editor.ui.builder;

import jp.hishidama.xtext.dmdl_editor.generator.DMDLGenerator;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.builder.BuilderParticipant;

public class DMDLBuilderParticipant extends BuilderParticipant {

	@Override
	public void build(final IBuildContext context, IProgressMonitor monitor) throws CoreException {
		DMDLGenerator gen = (DMDLGenerator) getGenerator();
		long fullTime = (context.getBuildType() == BuildType.FULL) ? System.currentTimeMillis() : 0;
		gen.setFullTime(fullTime);

		super.build(context, monitor);
	}
}
