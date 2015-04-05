package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.gen;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.eclipse_plugin.jdt.util.TypeUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SelectMasterSelectionTargetPage;

import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.ITypeParameter;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.IExtendedModifier;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeParameter;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.wizard.IWizardPage;

public class MasterSelectionOperatorGenerator extends OperatorGenerator {

	@Override
	protected Annotation getAnnotation() {
		return getMasterAnnotaion(OperatorType.MASTER_SELECTION);
	}

	@Override
	protected boolean isTypeParameter(String typeName) {
		Map<String, List<String>> map = getTypeParameterMap();
		return map.containsKey(typeName);
	}

	private Map<String, List<String>> typeParameterMap = null;

	protected Map<String, List<String>> getTypeParameterMap() {
		if (typeParameterMap == null) {
			Map<String, List<String>> map = new LinkedHashMap<String, List<String>>();

			ITypeParameter[] parameters;
			IType type;
			try {
				IMethod target = getTargetMethod();
				type = target.getDeclaringType();
				parameters = target.getTypeParameters();
			} catch (JavaModelException e) {
				return map;
			}
			for (ITypeParameter parameter : parameters) {
				String name = parameter.getElementName();
				List<String> list = new ArrayList<String>();
				try {
					String[] bounds = parameter.getBounds();
					for (String bound : bounds) {
						list.add(TypeUtil.resolveTypeNameAll(bound, type));
					}
				} catch (JavaModelException e) {
				}
				map.put(name, list);
			}

			typeParameterMap = map;
		}
		return typeParameterMap;
	}

	@Override
	protected MethodDeclaration generateMethod() {
		if (getTargetPage().isReplaceSelection()) {
			replaceTargetSelection();
		}

		Map<String, List<String>> map = getTypeParameterMap();

		String masterType = getParameterType(0);
		String masterLabel = getLabel(masterType, map);
		String txType = getParameterType(1);
		String txLabel = getLabel(txType, map);
		return generateMasterSelectionMethod(methodName, methodComment, masterType, masterLabel, txType, txLabel);
	}

	private String getLabel(String type, Map<String, List<String>> map) {
		List<String> list = map.get(type);
		if (list == null) {
			return getLabel(ModelUiUtil.findModelByClass(getProject(), type));
		}

		StringBuilder sb = new StringBuilder(128);
		for (String name : list) {
			if (sb.length() != 0) {
				sb.append(", ");
			}
			sb.append(getLabel(ModelUiUtil.findModelByClass(getProject(), name)));
		}
		return sb.toString();
	}

	@SuppressWarnings("unchecked")
	@Override
	protected void generateMethodTypeParameters(MethodDeclaration method) {
		List<TypeParameter> typeParameters = method.typeParameters();

		IMethod target = getTargetMethod();
		try {
			ITypeParameter[] parameters = target.getTypeParameters();
			for (ITypeParameter parameter : parameters) {
				String name = parameter.getElementName();
				String[] bounds = parameter.getBounds();

				TypeParameter typeParameter = ast.newTypeParameter();
				typeParameter.setName(ast.newSimpleName(name));
				List<Type> typeBounds = typeParameter.typeBounds();
				for (String bound : bounds) {
					typeBounds.add(ast.newSimpleType(ast.newName(bound)));
				}
				typeParameters.add(typeParameter);
			}
		} catch (JavaModelException e) {
		}
	}

	@SuppressWarnings("unchecked")
	private void replaceTargetSelection() {
		Set<String> set = new HashSet<String>();
		set.add(OperatorType.MASTER_JOIN.getType());
		set.add(OperatorType.MASTER_BRANCH.getType());
		set.add(OperatorType.MASTER_CHECK.getType());
		set.add(OperatorType.MASTER_JOIN_UPDATE.getType());

		try {
			MethodDeclaration method = findMethodDeclaration(getTargetMethod().getSourceRange().getOffset());
			List<IExtendedModifier> mlist = method.modifiers();
			for (IExtendedModifier modifier : mlist) {
				if (modifier instanceof NormalAnnotation) {
					NormalAnnotation a = (NormalAnnotation) modifier;
					String aname = a.getTypeName().getFullyQualifiedName();
					if (set.contains(aname)) {
						replaceTargetSelection(a);
						break;
					}
				} else if (modifier instanceof MarkerAnnotation) {
					MarkerAnnotation a = (MarkerAnnotation) modifier;
					String aname = a.getTypeName().getFullyQualifiedName();
					if (set.contains(aname)) {
						NormalAnnotation na = ast.newNormalAnnotation();
						na.setTypeName(ast.newName(aname));
						replaceTargetSelection(na);

						ListRewrite rewriter = getAstRewrite().getListRewrite(method,
								MethodDeclaration.MODIFIERS2_PROPERTY);
						rewriter.replace(a, na, null);
						break;
					}
				}
			}
		} catch (JavaModelException e) {
			LogUtil.logWarn(getClass().getName(), e);
		}
	}

	@SuppressWarnings("unchecked")
	private void replaceTargetSelection(NormalAnnotation a) {
		StringLiteral s = ast.newStringLiteral();
		s.setLiteralValue(methodName);

		List<MemberValuePair> vlist = a.values();
		for (MemberValuePair pair : vlist) {
			if ("selection".equals(pair.getName().getIdentifier())) {
				getAstRewrite().replace(pair.getValue(), s, null);
				return;
			}
		}

		MemberValuePair pair = ast.newMemberValuePair();
		pair.setName(ast.newSimpleName("selection"));
		pair.setValue(s);

		ListRewrite rewriter = getAstRewrite().getListRewrite(a, NormalAnnotation.VALUES_PROPERTY);
		rewriter.insertLast(pair, null);
	}

	private String getParameterType(int n) {
		IMethod method = getTargetMethod();
		try {
			return TypeUtil.getVariableTypeName(method.getParameters()[n]);
		} catch (JavaModelException e) {
			return null;
		}
	}

	private IMethod getTargetMethod() {
		return getTargetPage().getTargetMethod();
	}

	private SelectMasterSelectionTargetPage targetPage;

	private SelectMasterSelectionTargetPage getTargetPage() {
		if (targetPage == null) {
			for (IWizardPage page : pageList) {
				if (page instanceof SelectMasterSelectionTargetPage) {
					targetPage = (SelectMasterSelectionTargetPage) page;
					break;
				}
			}
		}
		return targetPage;
	}

	@Override
	protected String getReturnTypeName(Javadoc javadoc) {
		throw new UnsupportedOperationException();
	}

	@Override
	protected void getParameters(List<SingleVariableDeclaration> plist, Javadoc javadoc) {
		throw new UnsupportedOperationException();
	}

	@Override
	protected Block getBody() {
		throw new UnsupportedOperationException();
	}
}
