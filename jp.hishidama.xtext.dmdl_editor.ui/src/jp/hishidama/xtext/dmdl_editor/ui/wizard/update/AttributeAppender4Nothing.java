package jp.hishidama.xtext.dmdl_editor.ui.wizard.update;

import static jp.hishidama.eclipse_plugin.util.StringUtil.isEmpty;

import java.util.HashMap;
import java.util.Map;

import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;

public class AttributeAppender4Nothing extends AttributeAppender {

	@Override
	protected Executor<?> getExecutor() {
		return new AppendExecutor() {

			@Override
			protected void execute(XtextResource resource, EObject parent, AttributeList attributeList, String attr) {
				if (isEmpty(attr)) {
					return;
				}
				EList<Attribute> newList = parseAttribute(parent, attr);
				if (newList == null) {
					return;
				}

				if (attributeList != null) {
					Map<String, Attribute> map = new HashMap<String, Attribute>();
					for (Attribute a : newList) {
						map.put(a.getName(), a);
					}
					for (Attribute attribute : attributeList.getAttributes()) {
						String name = attribute.getName();
						Attribute exist = map.get(name);
						if (exist != null) {
							newList.remove(exist);
						}
					}
				}

				if (!newList.isEmpty()) {
					if (attributeList == null) {
						attributeList = createAttributeList(parent);
					}
					attributeList.getAttributes().addAll(newList);
					resource.setModified(true);
				}
			}
		};
	}
}
