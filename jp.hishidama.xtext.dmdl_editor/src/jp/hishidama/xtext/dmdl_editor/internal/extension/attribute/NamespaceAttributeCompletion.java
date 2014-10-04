package jp.hishidama.xtext.dmdl_editor.internal.extension.attribute;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementBlock;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementList;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValue;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.QualifiedNameObject;
import jp.hishidama.xtext.dmdl_editor.dmdl.Script;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeCompletion;

public class NamespaceAttributeCompletion implements DMDLAttributeCompletion {

	// @Override
	public String getCompletionModelAttributeName() {
		return "namespace";
	}

	// @Override
	public List<String> getCompletionModelAttributeElementNameList(String version) {
		return Arrays.asList("value");
	}

	// @Override
	public List<String> getCompletionModelAttributeValueList(AttributeElement element, String name, String version) {
		Script script = null;
		for (EObject object = element.eContainer(); object != null; object = object.eContainer()) {
			if (object instanceof Script) {
				script = (Script) object;
				break;
			}
		}
		if (script == null) {
			return null;
		}

		List<String> list = new ArrayList<String>();
		for (ModelDefinition model : script.getList()) {
			AttributeList alist = model.getAttributes();
			if (alist == null) {
				continue;
			}
			for (Attribute attr : alist.getAttributes()) {
				if (!"namespace".equals(attr.getName())) {
					continue;
				}
				AttributeElementBlock block = attr.getElementBlock();
				if (block == null) {
					continue;
				}
				AttributeElementList elements = block.getElements();
				if (elements == null) {
					continue;
				}
				for (AttributeElement elem : elements.getElements()) {
					if (!"value".equals(elem.getName())) {
						continue;
					}
					AttributeValue avalue = elem.getValue();
					if (avalue == null) {
						continue;
					}
					EObject value = avalue.getValue();
					if (value instanceof QualifiedNameObject) {
						String s = StringUtil.removeBlank(((QualifiedNameObject) value).getName());
						if (!list.contains(s)) {
							list.add(s);
						}
					}
				}
			}
		}
		return list;
	}

	// @Override
	public List<String> getCompletionPropertyAttributeName(Property property) {
		return null;
	}

	// @Override
	public List<String> getCompletionPropertyAttributeElementNameList(Property property, String name, String version) {
		return null;
	}

	// @Override
	public List<String> getCompletionPropertyAttributeElementValueList(Property property, String attributeName,
			AttributeElement element, String elementName, String version) {
		return null;
	}

	// @Override
	public List<String> getCompletionPropertyAttributeElementValueList(String attributeName, AttributeElement element,
			String elementName, String version) {
		return null;
	}
}
