package jp.hishidama.xtext.dmdl_editor.jdt.refactoring;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.OperatorUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.jdt.refactoring.JavaElementRefactoringFinder.TypeFinder;
import jp.hishidama.xtext.dmdl_editor.jdt.search.SearchPatternUtil;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant;

public class FactoryTypeRenameRefactor extends JavaElementRefactor {

	private final IType type;
	private final String oldTypeFullName;
	private final String newTypeFullName;

	public FactoryTypeRenameRefactor(RefactoringParticipant participant, IType type, String newFullName) {
		super(participant);
		this.type = type;
		this.oldTypeFullName = type.getFullyQualifiedName();
		this.newTypeFullName = newFullName;
	}

	public Change createChangeType(IProgressMonitor pm) throws CoreException {
		Map<String, String> typeMap = new TreeMap<String, String>(new Comparator<String>() {
			// @Override
			public int compare(String o1, String o2) {
				int c = o2.length() - o1.length(); // 長さの降順
				if (c != 0) {
					return c;
				}
				return o1.compareTo(o2);
			}
		});

		SearchPattern pattern = createSearchPattern(typeMap);
		if (pattern == null) {
			return null;
		}

		TypeFinder finder = new TypeFinder(typeMap);
		return searchElement(pm, pattern, finder);
	}

	private SearchPattern createSearchPattern(Map<String, String> typeMap) throws JavaModelException {
		List<SearchPattern> list = new ArrayList<SearchPattern>();
		createSuffixSearchPattern("Factory", list, typeMap);
		if (OperatorUtil.isOperator(type)) {
			createSuffixSearchPattern("Impl", list, typeMap);
		}
		if (FlowUtil.isFlowPart(type)) {
			createFlowPartSearchPattern(list, typeMap);
		}
		return SearchPatternUtil.createOrPattern(list);
	}

	private void createSuffixSearchPattern(String suffix, List<SearchPattern> patternList, Map<String, String> typeMap) throws JavaModelException {
		String oldFullName = oldTypeFullName + suffix;
		String newFullName = newTypeFullName + suffix;
		IType targetType = type.getJavaProject().findType(oldFullName);
		if (targetType == null) {
			return;
		}

		patternList.add(createSearchPattern(targetType));
		putType(typeMap, oldFullName, newFullName);
	}

	private void createFlowPartSearchPattern(List<SearchPattern> patternList, Map<String, String> typeMap) throws JavaModelException {
		String oldFullName = oldTypeFullName + "Factory." + StringUtil.getSimpleName(oldTypeFullName);
		String newFullName = newTypeFullName + "Factory." + StringUtil.getSimpleName(newTypeFullName);
		IType targetType = type.getJavaProject().findType(oldFullName);
		if (targetType == null) {
			return;
		}

		patternList.add(createSearchPattern(targetType));
		putType(typeMap, oldFullName, newFullName);
	}
}
