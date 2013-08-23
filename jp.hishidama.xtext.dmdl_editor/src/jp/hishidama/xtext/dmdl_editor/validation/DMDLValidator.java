/*
 * first generated by Xtext
 */
package jp.hishidama.xtext.dmdl_editor.validation;

import jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
public class DMDLValidator extends AbstractDMDLValidator {
	// エラーコード
	public static final String INVALID_NAME = "invalidName";

	@Check
	public void checkModelName(ModelDefinition model) {
		String name = model.getName();
		checkName(name, DmdlPackage.Literals.MODEL_DEFINITION__NAME);
	}

	@Check
	public void checkPropertyName(PropertyDefinition p) {
		String name = p.getName();
		checkName(name, DmdlPackage.Literals.PROPERTY__NAME);
	}

	@Check
	public void checkPropertyName(PropertyFolding p) {
		String name = p.getName();
		checkName(name, DmdlPackage.Literals.PROPERTY__NAME);
	}

	private void checkName(String name, EStructuralFeature feature) {
		String[] ss = name.split("_");
		for (String s : ss) {
			char c = s.charAt(0);
			if ('0' <= c && c <= '9') {
				warning("アンダースコアで区切られた各部分は英字から始めることが推奨されています。", feature, INVALID_NAME, s);
				return;
			}
		}
	}
}
