/*
 * generated by Xtext
 */
package jp.hishidama.xtext.dmdl_editor;

import jp.hishidama.xtext.dmdl_editor.validation.DMDLAssignmentQuantityIntervalProvider;

import org.eclipse.xtext.validation.IAssignmentQuantityIntervalProvider;

/**
 * Use this class to register components to be used at runtime / without the
 * Equinox extension registry.
 */
public class DMDLRuntimeModule extends jp.hishidama.xtext.dmdl_editor.AbstractDMDLRuntimeModule {

	public Class<? extends IAssignmentQuantityIntervalProvider> bindIAssignmentQuantityIntervalProvider() {
		return DMDLAssignmentQuantityIntervalProvider.class;
	}
}
