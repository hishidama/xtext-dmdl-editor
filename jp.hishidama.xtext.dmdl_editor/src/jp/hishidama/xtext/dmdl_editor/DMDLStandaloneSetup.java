/*
* generated by Xtext
*/
package jp.hishidama.xtext.dmdl_editor;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class DMDLStandaloneSetup extends DMDLStandaloneSetupGenerated{

	public static void doSetup() {
		new DMDLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}
