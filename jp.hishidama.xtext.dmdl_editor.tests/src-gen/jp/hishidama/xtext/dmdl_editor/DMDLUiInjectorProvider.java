/*
* generated by Xtext
*/
package jp.hishidama.xtext.dmdl_editor;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class DMDLUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLActivator.getInstance().getInjector("jp.hishidama.xtext.dmdl_editor.DMDL");
	}
	
}