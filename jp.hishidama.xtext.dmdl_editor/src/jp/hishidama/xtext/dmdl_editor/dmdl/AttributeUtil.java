package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.ecore.EObject;

import jp.hishidama.eclipse_plugin.util.StringUtil;

public class AttributeUtil {

	public static String getAttributeName(Attribute attribute) {
		return StringUtil.removeBlank(attribute.getName());
	}

	public static Attribute getAttribute(EObject object) {
		for (; object != null; object = object.eContainer()) {
			if (object instanceof Attribute) {
				return (Attribute) object;
			}
		}
		return null;
	}
}
