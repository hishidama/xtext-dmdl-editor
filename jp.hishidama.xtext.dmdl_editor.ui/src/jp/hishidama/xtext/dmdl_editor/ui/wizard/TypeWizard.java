package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import org.eclipse.core.resources.IResource;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.wizard.IWizard;

public interface TypeWizard extends IWizard {

	public IJavaProject getJavaProject();

	public IResource getDir();
}
