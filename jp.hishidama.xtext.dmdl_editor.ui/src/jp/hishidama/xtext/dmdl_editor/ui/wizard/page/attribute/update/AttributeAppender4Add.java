package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.attribute.update;

import static jp.hishidama.eclipse_plugin.util.StringUtil.*;
import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;

public class AttributeAppender4Add extends AttributeAppender {

	@Override
	protected Executor<?> getExecutor() {
		return new AppendExecutor() {

			@Override
			protected void execute(XtextResource resource, EObject parent, AttributeList attributeList, String attr) {
				if (isEmpty(attr)) {
					return;
				}
				if (attributeList == null) {
					attributeList = createAttributeList(parent);
				}

				EList<Attribute> newList = parseAttribute(parent, attr);
				if (newList != null) {
					attributeList.getAttributes().addAll(newList);
					resource.setModified(true);
				}
			}
		};
	}
}
