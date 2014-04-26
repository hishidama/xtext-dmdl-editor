package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.attribute.update;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.XtextResource;

public class AttributeRemover extends AttributeUpdater {

	private Set<String> modelAttr;
	private Set<String> propAttr;

	@Override
	public void setAttribute(String modelAttr, String propAttr) {
		this.modelAttr = toSet(modelAttr);
		this.propAttr = toSet(propAttr);
	}

	private static Set<String> toSet(String attr) {
		Set<String> set = new HashSet<String>();
		String[] ss = attr.split("[ \t\r\n]+");
		for (String s : ss) {
			set.add(s);
		}
		return set;
	}

	@Override
	protected Executor<?> getExecutor() {
		return new Executor<Set<String>>() {

			@Override
			protected Set<String> getModelAttribute() {
				return modelAttr;
			}

			@Override
			protected Set<String> getPropertyAttribute() {
				return propAttr;
			}

			@Override
			protected void execute(XtextResource resource, EObject parent, AttributeList attributeList, Set<String> attr) {
				if (attributeList == null || attr.isEmpty()) {
					return;
				}
				EList<Attribute> attributes = attributeList.getAttributes();
				List<Attribute> remove = new ArrayList<Attribute>();
				for (Attribute attribute : attributes) {
					String name = "@" + attribute.getName();
					if (attr.contains(name)) {
						remove.add(attribute);
					}
				}
				if (remove.size() == attributes.size()) {
					// 全属性を削除
					EcoreUtil.remove(attributeList);
					resource.setModified(true);
				} else {
					for (Attribute attribute : remove) {
						// ICompositeNode node =
						// NodeModelUtils.findActualNodeFor(attribute);
						// resource.update(node.getOffset(), node.getLength(),
						// "");
						EcoreUtil.remove(attribute);
						resource.setModified(true);
					}
				}
			}
		};
	}
}
