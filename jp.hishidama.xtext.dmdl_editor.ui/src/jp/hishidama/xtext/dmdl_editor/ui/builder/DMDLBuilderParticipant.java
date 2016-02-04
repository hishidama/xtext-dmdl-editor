package jp.hishidama.xtext.dmdl_editor.ui.builder;

import java.lang.reflect.Method;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.xtext.builder.BuilderParticipant;
import org.eclipse.xtext.generator.IGenerator;

import jp.hishidama.xtext.dmdl_editor.generator.DMDLGenerator;

public class DMDLBuilderParticipant extends BuilderParticipant {

	@Override
	public void build(final IBuildContext context, IProgressMonitor monitor) throws CoreException {
		IGenerator gen = getGenerator();
		if (!(gen instanceof DMDLGenerator)) {
			try {
				// Xtext2.9
				Method method = gen.getClass().getMethod("getLegacyGenerator");
				gen = (IGenerator) method.invoke(gen);
			} catch (Exception e) {
				// fall through
			}
		}
		if (gen instanceof DMDLGenerator) {
			long fullTime = (context.getBuildType() == BuildType.FULL) ? System.currentTimeMillis() : 0;
			((DMDLGenerator) gen).setFullTime(fullTime);
		}

		super.build(context, monitor);
	}
}
