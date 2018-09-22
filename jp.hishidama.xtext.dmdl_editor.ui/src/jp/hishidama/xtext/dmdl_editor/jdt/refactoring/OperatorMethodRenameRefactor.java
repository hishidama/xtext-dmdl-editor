package jp.hishidama.xtext.dmdl_editor.jdt.refactoring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.jdt.refactoring.JavaElementRefactoringFinder.MethodFinder;
import jp.hishidama.xtext.dmdl_editor.jdt.search.SearchPatternUtil;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant;

public class OperatorMethodRenameRefactor extends JavaElementRefactor {

	private final IMethod method;
	private final String oldMethodName;
	private final String newMethodName;

	public OperatorMethodRenameRefactor(RefactoringParticipant participant, IMethod method, String newMethodName) {
		super(participant);
		this.method = method;
		this.oldMethodName = method.getElementName();
		this.newMethodName = newMethodName;
	}

	public Change createChangeMethod(IProgressMonitor pm) throws CoreException {
		IMethod factoryMethod = getFactoryMethod(method);
		if (factoryMethod == null) {
			return null;
		}
		String typeName = StringUtil.toCamelCase(method.getElementName());
		IType returnType = factoryMethod.getDeclaringType().getType(typeName);

		Map<String, String> methodMap = new HashMap<String, String>();
		Map<String, String> typeMap = new HashMap<String, String>();
		SearchPattern pattern = createSearchPattern(factoryMethod, returnType, methodMap, typeMap);

		MethodFinder finder = new MethodFinder(methodMap, typeMap);
		return searchElement(pm, pattern, finder);
	}

	private static IMethod getFactoryMethod(IMethod method) {
		IMethod factoryMethod = null;
		try {
			IType factoryType = method.getJavaProject().findType(method.getDeclaringType().getFullyQualifiedName() + "Factory");
			if (factoryType == null) {
				return null;
			}
			for (IMethod m : factoryType.getMethods()) {
				if (m.getElementName().equals(method.getElementName())) {
					factoryMethod = m;
					break;
				}
			}
			if (factoryMethod == null) {
				return null;
			}
		} catch (JavaModelException e) {
			return null;
		}
		return factoryMethod;
	}

	private SearchPattern createSearchPattern(IMethod method, IType type, Map<String, String> methodMap, Map<String, String> typeMap) {
		List<SearchPattern> list = new ArrayList<SearchPattern>();

		int limitTo = IJavaSearchConstants.REFERENCES; // 参照箇所を検索
		int matchRule = SearchPattern.R_EXACT_MATCH | SearchPattern.R_CASE_SENSITIVE | SearchPattern.R_ERASURE_MATCH;

		if (method != null) {
			list.add(SearchPattern.createPattern(method, limitTo, matchRule));

			methodMap.put(oldMethodName, newMethodName);
		}
		if (type != null) {
			list.add(SearchPattern.createPattern(type, limitTo, matchRule));

			String oldFullName = type.getFullyQualifiedName().replace('$', '.');
			String newName = StringUtil.toCamelCase(newMethodName);
			String newFullName = StringUtil.getPackageName(oldFullName) + "." + newName;
			putType(typeMap, oldFullName, newFullName);
		}

		return SearchPatternUtil.createOrPattern(list);
	}
}
