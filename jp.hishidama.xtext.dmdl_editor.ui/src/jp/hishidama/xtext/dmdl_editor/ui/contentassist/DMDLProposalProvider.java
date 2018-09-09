/*
 * first generated by Xtext
 */
package jp.hishidama.xtext.dmdl_editor.ui.contentassist;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.extension.AsakusafwConfiguration;
import jp.hishidama.eclipse_plugin.util.ProjectUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeCompletion;
import jp.hishidama.xtext.dmdl_editor.extension.ExtensionUtil;

import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.ui.editor.contentassist.PrefixMatcher;

/**
 * see http://www.eclipse.org/Xtext/documentation.html#contentAssist on how to
 * customize content assistant
 */
public class DMDLProposalProvider extends AbstractDMDLProposalProvider {

	private static final PrefixMatcher ALWAYS_MATCHER = new PrefixMatcher() {

		@Override
		public boolean isCandidateMatchingPrefix(String name, String prefix) {
			return true; // 常にマッチ
		}
	};

	@Override
	public void completeModelDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		ModelDefinition modelDef = (ModelDefinition) model;
		String name = modelDef.getName();
		if (name != null) {
			completeName(name, context, acceptor);
		} else {
			super.completeModelDefinition_Name(model, assignment, context, acceptor);
		}
	}

	@Override
	public void completePropertyDefinition_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		PropertyDefinition property = null;
		if (model instanceof PropertyDefinition) {
			// "名前" name| : TYPE; のとき
			property = (PropertyDefinition) model;
		} else if (model instanceof RecordTerm) {
			// name| : TYPE; のとき
			EList<PropertyDefinition> list = ((RecordTerm) model).getProperties();
			if (list != null && !list.isEmpty()) {
				// カーソル位置のPropertyDefinitionの取得方法が不明
				// property = list.get(0);
			}
		} else {
			// System.out.println(model);
		}
		if (property != null) {
			String name = property.getName();
			if (name != null) {
				completeName(name, context, acceptor);
				return;
			}
		}

		super.completePropertyDefinition_Name(model, assignment, context, acceptor);
	}

	private void completeName(String name, ContentAssistContext originalContext, ICompletionProposalAcceptor acceptor) {
		ContentAssistContext context = originalContext.copy().setMatcher(ALWAYS_MATCHER).toContext();

		if (name.contains("__")) {
			String s = name.replaceAll("_+", "_");
			acceptor.accept(createCompletionProposal(s, context));
		}

		if (StringUtil.containsUppreCase(name)) {
			String s1 = name.toLowerCase();
			if (!s1.equals(name)) {
				acceptor.accept(createCompletionProposal(s1, context));
			}
			String s2 = StringUtil.toSnakeCase(name);
			if (!s1.equals(name) && !s2.equals(s1)) {
				acceptor.accept(createCompletionProposal(s2, context));
			}
		}
	}

	@Override
	public void completePropertyFolding_Aggregator(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		acceptor.accept(createCompletionProposal("any", context));
		acceptor.accept(createCompletionProposal("sum", context));
		acceptor.accept(createCompletionProposal("min", context));
		acceptor.accept(createCompletionProposal("max", context));
		acceptor.accept(createCompletionProposal("count", context));
	}

	@Override
	public void completePropertyMapping_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		PropertyMapping property = (PropertyMapping) model;
		Property ref = property.getFrom();
		if (ref != null) {
			acceptor.accept(createCompletionProposal(ref.getName(), context));
		}
	}

	@Override
	public void completePropertyFolding_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		PropertyFolding property = (PropertyFolding) model;
		Property ref = property.getFrom();
		if (ref != null) {
			acceptor.accept(createCompletionProposal(ref.getName(), context));
		}
	}

	@Override
	public void completeAttribute_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		Attribute attribute = (Attribute) model;
		AttributeList list = (AttributeList) attribute.eContainer();
		EObject container = list.eContainer();
		if (container instanceof ModelDefinition) {
			completeModelAttribute(context, acceptor);
		} else if (container instanceof Property) {
			Property property = (Property) container;
			completePropertyAttribute(property, context, acceptor);
		}
	}

	@Override
	public void completeAttributeElement_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		Attribute attribute = EcoreUtil2.getContainerOfType(model, Attribute.class);
		if (attribute != null) {
			AttributeList list = (AttributeList) attribute.eContainer();
			EObject container = list.eContainer();
			if (container instanceof ModelDefinition) {
				completeModelAttributeElement(attribute, context, acceptor);
			} else if (container instanceof Property) {
				Property property = (Property) container;
				completePropertyAttributeElement(property, attribute, context, acceptor);
			}
		}
	}

	@Override
	public void completeAttributeElement_Value(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		AttributeElement element = EcoreUtil2.getContainerOfType(model, AttributeElement.class);
		if (element != null) {
			Attribute attribute = null;
			AttributeList list = null;
			for (EObject object = element.eContainer(); object != null; object = object.eContainer()) {
				if (object instanceof Attribute) {
					attribute = (Attribute) object;
					continue;
				}
				if (object instanceof AttributeList) {
					list = (AttributeList) object;
					break;
				}
			}
			if (attribute != null && list != null) {
				EObject container = list.eContainer();
				if (container instanceof ModelDefinition) {
					completeModelAttributeValue(attribute, element, context, acceptor);
				} else if (container instanceof Property) {
					Property property = (Property) container;
					completePropertyAttributeValue(property, attribute, element, context, acceptor);
				}
			}
		}
	}

	// モデル属性の入力補完

	private void completeModelAttribute(ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		List<DMDLAttributeCompletion> list = ExtensionUtil.getAttributeCompletions();
		for (DMDLAttributeCompletion completion : list) {
			String name = completion.getCompletionModelAttributeName();
			if (name != null) {
				acceptor.accept(createCompletionProposal(name, context));
			}
		}
	}

	private void completeModelAttributeElement(Attribute attribute, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		String attributeName = AttributeUtil.getAttributeName(attribute);
		if (attributeName == null) {
			return;
		}

		String version = getCurrentVersion(attribute);

		List<DMDLAttributeCompletion> list = ExtensionUtil.getAttributeCompletions();
		for (DMDLAttributeCompletion completion : list) {
			if (attributeName.equals(completion.getCompletionModelAttributeName())) {
				List<String> names = completion.getCompletionModelAttributeElementNameList(version);
				if (names != null) {
					for (String name : names) {
						acceptor.accept(createCompletionProposal(name + " = ", context));
					}
				}
			}
		}
	}

	private void completeModelAttributeValue(Attribute attribute, AttributeElement element, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		String attributeName = AttributeUtil.getAttributeName(attribute);
		if (attributeName == null) {
			return;
		}

		String version = getCurrentVersion(attribute);

		List<DMDLAttributeCompletion> list = ExtensionUtil.getAttributeCompletions();
		for (DMDLAttributeCompletion completion : list) {
			if (attributeName.equals(completion.getCompletionModelAttributeName())) {
				List<String> values = completion.getCompletionModelAttributeValueList(element, element.getName(), version);
				if (values != null) {
					for (String value : values) {
						acceptor.accept(createCompletionProposal(value, context));
					}
				}
			}
		}
	}

	// プロパティー属性の入力補完

	private void completePropertyAttribute(Property property, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		List<DMDLAttributeCompletion> list = ExtensionUtil.getAttributeCompletions();
		for (DMDLAttributeCompletion completion : list) {
			List<String> names = completion.getCompletionPropertyAttributeName(property);
			if (names != null) {
				for (String name : names) {
					acceptor.accept(createCompletionProposal(name, context));
				}
			}
		}
	}

	private void completePropertyAttributeElement(Property property, Attribute attribute, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		String attributeName = AttributeUtil.getAttributeName(attribute);
		if (attributeName == null) {
			return;
		}

		String version = getCurrentVersion(attribute);

		List<DMDLAttributeCompletion> list = ExtensionUtil.getAttributeCompletions();
		for (DMDLAttributeCompletion completion : list) {
			List<String> names = completion.getCompletionPropertyAttributeElementNameList(property, attributeName, version);
			if (names != null) {
				for (String name : names) {
					acceptor.accept(createCompletionProposal(name + " = ", context));
				}
			}
		}
	}

	private void completePropertyAttributeValue(Property property, Attribute attribute, AttributeElement element, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		String attributeName = AttributeUtil.getAttributeName(attribute);
		if (attributeName == null) {
			return;
		}

		String version = getCurrentVersion(attribute);

		List<DMDLAttributeCompletion> list = ExtensionUtil.getAttributeCompletions();
		for (DMDLAttributeCompletion completion : list) {
			List<String> values = completion.getCompletionPropertyAttributeElementValueList(attributeName, element, element.getName(), version);
			if (values != null) {
				for (String value : values) {
					acceptor.accept(createCompletionProposal(value, context));
				}
			}
		}
	}

	protected String getCurrentVersion(EObject object) {
		URI uri = EcoreUtil.getURI(object);
		if (uri.isPlatform()) {
			String projectName = uri.segment(1);
			IProject project = ProjectUtil.getProject(projectName);
			if (project != null) {
				return AsakusafwConfiguration.getAsakusaFwVersion(project);
			}
		}
		return null;
	}
}
