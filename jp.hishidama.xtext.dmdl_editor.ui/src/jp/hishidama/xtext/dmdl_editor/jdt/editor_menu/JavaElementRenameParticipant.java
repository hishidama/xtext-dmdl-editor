package jp.hishidama.xtext.dmdl_editor.jdt.editor_menu;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.OperatorUtil;
import jp.hishidama.eclipse_plugin.jdt.util.TypeUtil;
import jp.hishidama.eclipse_plugin.util.JdtUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.ImportDeclaration;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.Name;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.refactoring.CompilationUnitChange;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchParticipant;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.TextChange;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.RefactoringProcessor;
import org.eclipse.ltk.core.refactoring.participants.RenameParticipant;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEdit;

// http://help.eclipse.org/kepler/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Freference%2Fextension-points%2Forg_eclipse_ltk_core_refactoring_renameParticipants.html
// http://www.eclipse.org/jdt/ui/r3_2/RenameType.html
public class JavaElementRenameParticipant extends RenameParticipant {

	@Override
	public String getName() {
		return "Rename MasterSelection";
	}

	@Override
	protected boolean initialize(Object element) {
		if (!getArguments().getUpdateReferences()) {
			return false;
		}

		if (element instanceof IMethod) {
			IMethod method = (IMethod) element;
			if (OperatorUtil.isUserOperator(method) || OperatorUtil.isMasterSelection(method)) {
				return true;
			}
		}
		if (element instanceof IType) {
			IType type = (IType) element;
			if (OperatorUtil.isOperator(type) || FlowUtil.isFlowPart(type)) {
				return true;
			}
		}

		return false;
	}

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor pm, CheckConditionsContext context) throws OperationCanceledException {
		return null;
	}

	@Override
	public Change createChange(IProgressMonitor pm) throws CoreException, OperationCanceledException {
		Change result = null;
		CompositeChange compositeChange = null;

		RefactoringProcessor processor = getProcessor();
		Object[] elementList = processor.getElements();
		SubMonitor subMonitor = SubMonitor.convert(pm, elementList.length);

		for (Object element : elementList) {
			Change change = null;
			if (element instanceof IMethod) {
				IMethod method = (IMethod) element;
				if (OperatorUtil.isMasterSelection(method)) {
					change = createChangeMasterSelection(method);
				} else {
					change = createChangeMethod(pm, method);
				}
			} else if (element instanceof IType) {
				IType type = (IType) element;
				change = createChangeType(pm, type);
			} else if (element instanceof ICompilationUnit) {
				ICompilationUnit cu = (ICompilationUnit) element;
				IType type = TypeUtil.getPublicType(cu);
				change = createChangeType(pm, type);
			}

			if (change != null) {
				if (result == null) {
					result = change;
				} else {
					if (compositeChange == null) {
						compositeChange = new CompositeChange("rename composite");
						compositeChange.add(result);
						result = compositeChange;
					}
					compositeChange.add(change);
				}
			}

			subMonitor.worked(1);
		}

		return result;
	}

	private Change createChangeMethod(IProgressMonitor pm, IMethod method) throws CoreException {
		IMethod factoryMethod = getFactoryMethod(method);
		if (factoryMethod == null) {
			return null;
		}
		String typeName = StringUtil.toCamelCase(method.getElementName());
		IType returnType = factoryMethod.getDeclaringType().getType(typeName);

		Map<String, String> methodMap = new HashMap<String, String>();
		Map<String, String> typeMap = new HashMap<String, String>();
		SearchPattern pattern = createMethodSearchPattern(factoryMethod, returnType, methodMap, typeMap);

		MethodFinder finder = new MethodFinder(methodMap, typeMap);
		return searchElement(pm, pattern, finder);
	}

	private SearchPattern createMethodSearchPattern(IMethod method, IType type, Map<String, String> methodMap, Map<String, String> typeMap) {
		List<SearchPattern> list = new ArrayList<SearchPattern>();

		int limitTo = IJavaSearchConstants.REFERENCES; // 参照箇所を検索
		int matchRule = SearchPattern.R_EXACT_MATCH | SearchPattern.R_CASE_SENSITIVE | SearchPattern.R_ERASURE_MATCH;

		if (method != null) {
			list.add(SearchPattern.createPattern(method, limitTo, matchRule));

			String newName = getArguments().getNewName();
			methodMap.put(method.getElementName(), newName);
		}
		if (type != null) {
			list.add(SearchPattern.createPattern(type, limitTo, matchRule));

			String oldFullName = type.getFullyQualifiedName().replace('$', '.');
			String newName = StringUtil.toCamelCase(getArguments().getNewName());
			String newFullName = StringUtil.getPackageName(oldFullName) + "." + newName;
			putType(typeMap, oldFullName, newFullName);
		}

		return createSearchPattern(list);
	}

	private Change searchElement(IProgressMonitor pm, SearchPattern pattern, final AbstractFinder finder) throws CoreException {
		final List<TextChange> result = new ArrayList<TextChange>();
		final Map<ICompilationUnit, TextChange> myMap = new HashMap<ICompilationUnit, TextChange>();

		SearchParticipant[] participants = { SearchEngine.getDefaultSearchParticipant() };
		IJavaSearchScope scope = SearchEngine.createWorkspaceScope();
		SearchRequestor requestor = new SearchRequestor() {
			@Override
			public void acceptSearchMatch(SearchMatch match) throws CoreException {
				ICompilationUnit cu = JdtUtil.getCompilationUnit(match.getElement());
				if (cu == null) {
					return;
				}

				List<ReplaceEdit> editList = finder.getEditList(cu, match.getOffset());
				if (editList.isEmpty()) {
					return;
				}

				TextChange change = myMap.get(cu);
				if (change == null) {
					change = getTextChange(cu);
					if (change == null) {
						change = new CompilationUnitChange("Rename Factory Method", cu);
						change.setEdit(new MultiTextEdit());
						result.add(change);
					}
					myMap.put(cu, change);
				}

				for (TextEdit edit : editList) {
					change.addEdit(edit);
				}
			}
		};

		// 検索の実行
		new SearchEngine().search(pattern, participants, scope, requestor, pm);

		if (result.isEmpty()) {
			return null;
		}
		if (result.size() == 1) {
			return result.get(0);
		}

		CompositeChange compositeChange = new CompositeChange("composite", result.toArray(new TextChange[result.size()]));
		return compositeChange;
	}

	private static abstract class AbstractFinder extends ASTVisitor {
		private static final int NO_CHECK_OFFSET = Integer.MIN_VALUE;
		private Map<ICompilationUnit, ASTNode> nodeMap = new HashMap<ICompilationUnit, ASTNode>();

		protected int offset;
		private List<ReplaceEdit> editList = new ArrayList<ReplaceEdit>();

		public List<ReplaceEdit> getEditList(ICompilationUnit cu, int offset) {
			this.offset = offset;
			this.editList.clear();

			ASTNode node = nodeMap.get(cu);
			if (node == null) {
				ASTParser parser = JdtUtil.newASTParser();
				parser.setSource(cu);
				node = parser.createAST(new NullProgressMonitor());
				nodeMap.put(cu, node);
			}
			node.accept(this);

			return editList;
		}

		protected final void addEdit(ReplaceEdit edit) {
			if (edit != null) {
				editList.add(edit);
			}
		}

		@Override
		public boolean preVisit2(ASTNode node) {
			if (offset == NO_CHECK_OFFSET) {
				return true;
			}
			return node.getStartPosition() <= offset && offset < node.getStartPosition() + node.getLength();
		}
	}

	private static class MethodFinder extends AbstractFinder {
		private final Map<String, String> methodMap;
		private final Map<String, String> typeMap;

		public MethodFinder(Map<String, String> methodMap, Map<String, String> typeMap) {
			this.methodMap = methodMap;
			this.typeMap = typeMap;
		}

		@Override
		public boolean visit(ImportDeclaration node) {
			Name name = node.getName();
			if (preVisit2(name)) {
				createReplaceEdit(typeMap, name);
			}
			return false;
		}

		@Override
		public boolean visit(SimpleType node) {
			Name name = node.getName();
			if (preVisit2(name)) {
				createReplaceEdit(typeMap, name);
			}
			return false;
		}

		@Override
		public boolean visit(MethodInvocation node) {
			Name name = node.getName();
			if (!preVisit2(name)) {
				return true;
			}
			createReplaceEdit(methodMap, name);
			return false;
		}

		private void createReplaceEdit(Map<String, String> map, Name name) {
			String oldName = name.getFullyQualifiedName();
			String newName = map.get(oldName);
			if (newName != null) {
				addEdit(new ReplaceEdit(name.getStartPosition(), name.getLength(), newName));
			}
		}
	}

	private Change createChangeMasterSelection(IMethod method) {
		ICompilationUnit cu = method.getCompilationUnit();
		String oldName = method.getElementName();
		String newName = getArguments().getNewName();
		MasterSelectionFinder finder = new MasterSelectionFinder(oldName, newName);
		List<ReplaceEdit> list = finder.getEditList(cu, AbstractFinder.NO_CHECK_OFFSET);
		if (list.isEmpty()) {
			return null;
		}

		Change result;
		TextChange change = getTextChange(cu);
		if (change == null) {
			change = new CompilationUnitChange("Rename MasterSelection", cu);
			change.setEdit(new MultiTextEdit());
			result = change;
		} else {
			result = null;
		}
		for (ReplaceEdit edit : list) {
			change.addEdit(edit);
		}
		return result;
	}

	private static class MasterSelectionFinder extends AbstractFinder {
		private final String oldName;
		private final String newName;

		public MasterSelectionFinder(String oldName, String newName) {
			this.oldName = oldName;
			this.newName = newName;
		}

		@Override
		public boolean visit(NormalAnnotation node) {
			String name = node.getTypeName().getFullyQualifiedName();
			return "MasterCheck".equals(name) || "MasterJoin".equals(name) || "MasterBranch".equals(name) || "MasterJoinUpdate".equals(name);
		}

		@Override
		public boolean visit(MemberValuePair node) {
			String name = node.getName().getIdentifier();
			return "selection".equals(name);
		}

		@Override
		public boolean visit(StringLiteral node) {
			String value = node.getLiteralValue();
			String selectionName = value.trim();
			if (selectionName.equals(oldName)) {
				int offset = node.getStartPosition() + 1;
				int length = node.getLength() - 2;
				addEdit(new ReplaceEdit(offset, length, newName));
			}
			return false;
		}
	}

	private Change createChangeType(IProgressMonitor pm, IType type) throws CoreException {
		if (type == null) {
			return null;
		}

		Map<String, String> typeMap = new TreeMap<String, String>(new Comparator<String>() {
			// @Override
			public int compare(String o1, String o2) {
				return o2.length() - o1.length(); // 長さの降順
			}
		});
		SearchPattern pattern = createTypeSearchPattern(type, typeMap);
		if (pattern == null) {
			return null;
		}

		TypeFinder finder = new TypeFinder(typeMap);
		return searchElement(pm, pattern, finder);
	}

	private SearchPattern createTypeSearchPattern(IType type, Map<String, String> typeMap) throws JavaModelException {
		List<SearchPattern> list = new ArrayList<SearchPattern>();
		createTypeSearchPattern(type, "Factory", list, typeMap);
		if (OperatorUtil.isOperator(type)) {
			createTypeSearchPattern(type, "Impl", list, typeMap);
		}
		if (FlowUtil.isFlowPart(type)) {
			createFlowPartSearchPattern(type, list, typeMap);
		}
		return createSearchPattern(list);
	}

	private void createTypeSearchPattern(IType type, String suffix, List<SearchPattern> patternList, Map<String, String> typeMap) throws JavaModelException {
		IType targetType = type.getJavaProject().findType(type.getFullyQualifiedName() + suffix);
		if (targetType == null) {
			return;
		}

		int limitTo = IJavaSearchConstants.REFERENCES; // 参照箇所を検索
		int matchRule = SearchPattern.R_EXACT_MATCH | SearchPattern.R_CASE_SENSITIVE | SearchPattern.R_ERASURE_MATCH;
		SearchPattern pattern = SearchPattern.createPattern(targetType, limitTo, matchRule);
		patternList.add(pattern);

		String oldFullName = targetType.getFullyQualifiedName();
		String newFullName = StringUtil.getPackageName(oldFullName) + "." + getArguments().getNewName() + suffix;
		putType(typeMap, oldFullName, newFullName);
	}

	private void createFlowPartSearchPattern(IType type, List<SearchPattern> patternList, Map<String, String> typeMap) throws JavaModelException {
		IType targetType = type.getJavaProject().findType(type.getFullyQualifiedName() + "Factory." + type.getElementName());
		if (targetType == null) {
			return;
		}

		int limitTo = IJavaSearchConstants.REFERENCES; // 参照箇所を検索
		int matchRule = SearchPattern.R_EXACT_MATCH | SearchPattern.R_CASE_SENSITIVE | SearchPattern.R_ERASURE_MATCH;
		SearchPattern pattern = SearchPattern.createPattern(targetType, limitTo, matchRule);
		patternList.add(pattern);

		String oldFullName = targetType.getFullyQualifiedName().replace('$', '.');
		String newName = getArguments().getNewName();
		String newFullName = StringUtil.getPackageName(StringUtil.getPackageName(oldFullName)) + "." + newName + "Factory." + newName;
		putType(typeMap, oldFullName, newFullName);
	}

	private static class TypeFinder extends AbstractFinder {
		private final Map<String, String> typeMap;

		public TypeFinder(Map<String, String> typeMap) {
			this.typeMap = typeMap;
		}

		@Override
		public boolean visit(ImportDeclaration node) {
			Name name = node.getName();
			if (preVisit2(name)) {
				createReplaceEdit(name);
			}
			return false;
		}

		@Override
		public boolean visit(SimpleType node) {
			Name name = node.getName();
			if (preVisit2(name)) {
				createReplaceEdit(name);
			}
			return false;
		}

		private void createReplaceEdit(Name name) {
			String oldName = name.getFullyQualifiedName();
			String newName = typeMap.get(oldName);
			if (newName != null) {
				addEdit(new ReplaceEdit(name.getStartPosition(), name.getLength(), newName));
				return;
			}

			for (Entry<String, String> entry : typeMap.entrySet()) {
				String oldPrefix = entry.getKey() + ".";
				if (oldName.startsWith(oldPrefix)) {
					addEdit(new ReplaceEdit(name.getStartPosition(), oldPrefix.length() - 1, entry.getValue()));
					return;
				}
			}
		}
	}

	private IMethod getFactoryMethod(IMethod method) {
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

	private static void putType(Map<String, String> typeMap, String oldFullName, String newFullName) {
		typeMap.put(oldFullName, newFullName);
		typeMap.put(StringUtil.getSimpleName(oldFullName), StringUtil.getSimpleName(newFullName));
	}

	private static SearchPattern createSearchPattern(List<SearchPattern> list) {
		SearchPattern result = null;
		for (SearchPattern pattern : list) {
			if (result == null) {
				result = pattern;
			} else {
				result = SearchPattern.createOrPattern(result, pattern);
			}
		}
		return result;
	}
}
