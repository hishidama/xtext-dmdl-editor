package jp.hishidama.xtext.dmdl_editor.jdt.refactoring;

import java.util.ArrayList;
import java.util.Collections;
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

	public static final class TypePair {
		final IType type;
		private final String newFullName;

		public TypePair(IType type, String newFullName) {
			this.type = type;
			this.newFullName = newFullName;
		}

		public String getOldFullName() {
			return type.getFullyQualifiedName();
		}

		public String getNewFullName() {
			return newFullName;
		}
	}

	private final List<TypePair> typeList;

	public FactoryTypeRenameRefactor(RefactoringParticipant participant, List<TypePair> typeList) {
		super(participant);
		this.typeList = typeList;
	}

	public FactoryTypeRenameRefactor(RefactoringParticipant participant, IType type, String newFullName) {
		this(participant, Collections.singletonList(new TypePair(type, newFullName)));
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

		List<SearchPattern> list = new ArrayList<SearchPattern>();
		for (TypePair pair : typeList) {
			createSearchPattern(pair, list, typeMap);
		}
		SearchPattern pattern = SearchPatternUtil.createOrPattern(list);
		if (pattern == null) {
			return null;
		}

		TypeFinder finder = new TypeFinder(typeMap);
		return searchElement(pm, pattern, finder);
	}

	private void createSearchPattern(TypePair pair, List<SearchPattern> list, Map<String, String> typeMap) throws JavaModelException {
		createSuffixSearchPattern(pair, "Factory", list, typeMap);
		if (OperatorUtil.isOperator(pair.type)) {
			createSuffixSearchPattern(pair, "Impl", list, typeMap);
		}
		if (FlowUtil.isFlowPart(pair.type)) {
			createFlowPartSearchPattern(pair, list, typeMap);
		}
	}

	private void createSuffixSearchPattern(TypePair pair, String suffix, List<SearchPattern> patternList, Map<String, String> typeMap) throws JavaModelException {
		String oldFullName = pair.getOldFullName() + suffix;
		String newFullName = pair.getNewFullName() + suffix;
		IType targetType = pair.type.getJavaProject().findType(oldFullName);
		if (targetType == null) {
			return;
		}

		patternList.add(createSearchPattern(targetType));
		putType(typeMap, oldFullName, newFullName);
	}

	private void createFlowPartSearchPattern(TypePair pair, List<SearchPattern> patternList, Map<String, String> typeMap) throws JavaModelException {
		String oldTypeFullName = pair.getOldFullName();
		String newTypeFullName = pair.getNewFullName();
		String oldFullName = oldTypeFullName + "Factory." + StringUtil.getSimpleName(oldTypeFullName);
		String newFullName = newTypeFullName + "Factory." + StringUtil.getSimpleName(newTypeFullName);
		IType targetType = pair.type.getJavaProject().findType(oldFullName);
		if (targetType == null) {
			return;
		}

		patternList.add(createSearchPattern(targetType));
		putType(typeMap, oldFullName, newFullName);
	}
}
