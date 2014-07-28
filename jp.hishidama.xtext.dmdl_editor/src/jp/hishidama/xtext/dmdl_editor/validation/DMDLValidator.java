/*
 * first generated by Xtext
 */
package jp.hishidama.xtext.dmdl_editor.validation;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

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
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (('a' <= c && c <= 'z') || ('0' <= c && c <= '9') || c == '_') {
				continue;
			} else {
				error("名前には英小文字・数字・アンダースコア以外は使えません。", feature, INVALID_NAME, name);
				return;
			}
		}

		if (name.startsWith("_")) {
			error("名前はアンダースコアから始めることは出来ません。", feature, INVALID_NAME, name);
			return;
		}
		if (name.endsWith("_")) {
			error("名前はアンダースコアで終わることは出来ません。", feature, INVALID_NAME, name);
			return;
		}

		if (name.contains("__")) {
			error("名前にはアンダースコアを連続で使用することは出来ません。", feature, INVALID_NAME, name);
			return;
		}

		if (RESERVED.contains(name)) {
			warning("名前にJavaの予約語を使うのは非推奨です。", feature, INVALID_NAME, name);
			return;
		}

		String[] ss = name.split("_");
		for (String s : ss) {
			if (s.length() <= 0) {
				continue;
			}
			char c = s.charAt(0);
			if ('0' <= c && c <= '9') {
				warning("アンダースコアで区切られた各部分は英字から始めることが推奨されています。", feature, INVALID_NAME, s);
				return;
			}
		}
	}

	// see com.asakusafw.utils.java.internal.model.syntax.SimpleNameImpl
	private static final Set<String> RESERVED;
	static {
		Set<String> set = new HashSet<String>();
		set.add("abstract");
		set.add("continue");
		set.add("for");
		set.add("new");
		set.add("switch");
		set.add("assert");
		set.add("default");
		set.add("if");
		set.add("package");
		set.add("synchronized");
		set.add("boolean");
		set.add("do");
		set.add("goto");
		set.add("private");
		set.add("this");
		set.add("break");
		set.add("double");
		set.add("implements");
		set.add("protected");
		set.add("throw");
		set.add("byte");
		set.add("else");
		set.add("import");
		set.add("public");
		set.add("throws");
		set.add("case");
		set.add("enum");
		set.add("instanceof");
		set.add("return");
		set.add("transient");
		set.add("catch");
		set.add("extends");
		set.add("int");
		set.add("short");
		set.add("try");
		set.add("char");
		set.add("final");
		set.add("interface");
		set.add("static");
		set.add("void");
		set.add("class");
		set.add("finally");
		set.add("long");
		set.add("strictfp");
		set.add("volatile");
		set.add("const");
		set.add("float");
		set.add("native");
		set.add("super");
		set.add("while");
		set.add("true");
		set.add("false");
		set.add("null");
		RESERVED = Collections.unmodifiableSet(set);
	}
}
