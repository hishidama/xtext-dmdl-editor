/*
 * first generated by Xtext
 */
package jp.hishidama.xtext.dmdl_editor.scoping;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.xtext.dmdl_editor.dmdl.Grouping;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelFolding;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelMapping;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil.PropertyFilter;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionReference;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation.html#scoping on how and when
 * to use it
 * 
 */
public class DMDLScopeProvider extends AbstractDeclarativeScopeProvider {

	// joined
	public IScope scope_PropertyMapping_from(EObject context, EReference ref) {
		JoinTerm term = EcoreUtil2.getContainerOfType(context, JoinTerm.class);
		if (term == null) {
			return null;
		}
		ModelDefinition model = term.getReference().getName();

		List<EObject> list = new ArrayList<EObject>();
		add(list, model);
		return Scopes.scopeFor(list);
	}

	// summarized
	public IScope scope_PropertyFolding_from(EObject context, EReference ref) {
		SummarizeTerm term = EcoreUtil2.getContainerOfType(context, SummarizeTerm.class);
		if (term == null) {
			return null;
		}
		ModelDefinition model = term.getReference().getName();

		List<EObject> list = new ArrayList<EObject>();
		add(list, model);
		return Scopes.scopeFor(list);
	}

	public IScope scope_Grouping_name(Grouping group, EReference ref) {
		List<EObject> list = new ArrayList<EObject>();
		{
			JoinTerm term = EcoreUtil2.getContainerOfType(group, JoinTerm.class);
			if (term != null) {
				ModelMapping mapping = term.getMapping();
				if (mapping != null) {
					EList<PropertyMapping> properties = mapping.getMappings();
					list.addAll(properties);
				} else {
					add(list, term.getReference());
				}
			}
		}
		{
			SummarizeTerm term = EcoreUtil2.getContainerOfType(group, SummarizeTerm.class);
			if (term != null) {
				ModelFolding folding = term.getFolding();
				if (folding != null) {
					EList<PropertyFolding> properties = folding.getFoldings();
					list.addAll(properties);
				}
			}
		}

		return Scopes.scopeFor(list);
	}

	private void add(List<EObject> list, ModelDefinition model) {
		add(list, model, new HashSet<String>());
	}

	private void add(List<EObject> list, ModelDefinition model, Set<String> set) {
		String modelName = model.getName();
		if (set.contains(modelName)) {
			return;
		}
		set.add(modelName);

		EObject rhs = model.getRhs();
		if (rhs instanceof RecordExpression) {
			EList<RecordTerm> terms = ((RecordExpression) rhs).getTerms();
			for (RecordTerm term : terms) {
				EList<PropertyDefinition> propertiess = term.getProperties();
				list.addAll(propertiess);
				add(list, term.getReference(), set);
			}
		} else if (rhs instanceof JoinExpression) {
			EList<JoinTerm> terms = ((JoinExpression) rhs).getTerms();
			for (JoinTerm term : terms) {
				ModelMapping mappings = term.getMapping();
				if (mappings != null) {
					EList<PropertyMapping> properties = mappings.getMappings();
					list.addAll(properties);
				} else {
					add(list, term.getReference(), set);
				}
			}
		} else if (rhs instanceof SummarizeExpression) {
			EList<SummarizeTerm> terms = ((SummarizeExpression) rhs).getTerms();
			for (SummarizeTerm term : terms) {
				ModelFolding folding = term.getFolding();
				if (folding != null) {
					EList<PropertyFolding> properties = folding.getFoldings();
					list.addAll(properties);
				}
			}
		}
	}

	private void add(List<EObject> list, ModelReference ref) {
		add(list, ref, new HashSet<String>());
	}

	private void add(List<EObject> list, ModelReference ref, Set<String> set) {
		if (ref != null) {
			add(list, ref.getName(), set);
		}
	}

	// プロパティー参照（List）
	public IScope scope_PropertyExpressionList_elements(EObject context, EReference ref) {
		return scopePropertyReferenceCollection(context, ref);
	}

	// プロパティー参照（Map）
	public IScope scope_PropertyExpressionMapEntry_property(EObject context, EReference ref) {
		return scopePropertyReferenceCollection(context, ref);
	}

	private IScope scopePropertyReferenceCollection(EObject context, EReference ref) {
		ModelDefinition model = EcoreUtil2.getContainerOfType(context, ModelDefinition.class);
		List<Property> list = ModelUtil.getProperties(model, PropertyFilter.PROPERTY);

		return Scopes.scopeFor(list);
	}

	// プロパティー参照（reference）
	public IScope scope_PropertyExpressionReference_modelName(EObject context, EReference ref) {
		List<ModelDefinition> list = new ArrayList<ModelDefinition>();

		ModelDefinition model = EcoreUtil2.getContainerOfType(context, ModelDefinition.class);
		RecordExpression rhs = (RecordExpression) model.getRhs();
		EList<RecordTerm> terms = rhs.getTerms();
		for (RecordTerm term : terms) {
			ModelReference m = term.getReference();
			if (m != null) {
				list.add(m.getName());
			}
		}

		return Scopes.scopeFor(list);
	}

	public IScope scope_PropertyExpressionReference_name(PropertyExpressionReference context, EReference ref) {
		ModelDefinition model = context.getModelName();
		List<Property> list = ModelUtil.getProperties(model, PropertyFilter.REFERENCE);

		return Scopes.scopeFor(list);
	}
}
