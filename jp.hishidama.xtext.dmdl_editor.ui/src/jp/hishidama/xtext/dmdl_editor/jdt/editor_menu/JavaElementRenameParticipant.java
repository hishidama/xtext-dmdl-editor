package jp.hishidama.xtext.dmdl_editor.jdt.editor_menu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.OperatorUtil;
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

// http://help.eclipse.org/kepler/index.jsp?topic=%2Forg.eclipse.platform.doc.isv%2Freference%2Fextension-points%2Forg_eclipse_ltk_core_refactoring_renameParticipants.html
// http://www.eclipse.org/jdt/ui/r3_2/RenameType.html
public class JavaElementRenameParticipant extends RenameParticipant {

	@Override
	public String getName() {
		return "Rename MasterSelection";
	}

	@Override
	protected boolean initialize(Object element) {
		if (element instanceof IMethod) {
			IMethod method = (IMethod) element;
			if (OperatorUtil.isUserOperator(method) || OperatorUtil.isMasterSelection(method)) {
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
					change = createChangeOperator(pm, method);
				}
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

	private Change createChangeOperator(IProgressMonitor pm, IMethod method) throws CoreException {
		IMethod factoryMethod = getFactoryMethod(method);
		if (factoryMethod == null) {
			return null;
		}
		String typeName = StringUtil.toCamelCase(method.getElementName());
		IType returnType = factoryMethod.getDeclaringType().getType(typeName);

		Map<String, String> methodMap = new HashMap<String, String>();
		Map<String, String> typeMap = new HashMap<String, String>();
		SearchPattern pattern = createSearchPattern(factoryMethod, returnType, methodMap, typeMap);

		return searchElement(pm, pattern, methodMap, typeMap);
	}

	private SearchPattern createSearchPattern(IMethod method, IType type, Map<String, String> methodMap, Map<String, String> typeMap) {
		int limitTo = IJavaSearchConstants.REFERENCES; // 参照箇所を検索
		int matchRule = SearchPattern.R_EXACT_MATCH | SearchPattern.R_CASE_SENSITIVE | SearchPattern.R_ERASURE_MATCH;

		SearchPattern elementPattern = null;
		if (method != null) {
			elementPattern = SearchPattern.createPattern(method, limitTo, matchRule);

			String newName = getArguments().getNewName();
			methodMap.put(method.getElementName(), newName);
		}
		SearchPattern typePattern = null;
		if (type != null) {
			typePattern = SearchPattern.createPattern(type, limitTo, matchRule);

			String newName = StringUtil.toCamelCase(getArguments().getNewName());
			typeMap.put(type.getElementName(), newName);

			String name = type.getFullyQualifiedName().replace('$', '.');
			int n = name.lastIndexOf('.');
			if (n >= 0) {
				typeMap.put(name, name.substring(0, n + 1) + newName);
			}
		}

		if (elementPattern == null) {
			return typePattern;
		}
		if (typePattern == null) {
			return elementPattern;
		}
		return SearchPattern.createOrPattern(elementPattern, typePattern);
	}

	private Change searchElement(IProgressMonitor pm, SearchPattern pattern, final Map<String, String> methodMap, final Map<String, String> typeMap) throws CoreException {
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

				OperatorFinder finder = new OperatorFinder(cu, methodMap, typeMap);
				ReplaceEdit edit = finder.findEdit(match.getOffset());
				if (edit == null) {
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
				change.addEdit(edit);
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

	private static class OperatorFinder extends ASTVisitor {
		private final ASTNode rootNode;
		private final Map<String, String> methodMap;
		private final Map<String, String> typeMap;
		private int offset;
		private ReplaceEdit edit;

		public OperatorFinder(ICompilationUnit unit, Map<String, String> methodMap, Map<String, String> typeMap) {
			ASTParser parser = JdtUtil.newASTParser();
			parser.setSource(unit);
			this.rootNode = parser.createAST(new NullProgressMonitor());
			this.methodMap = methodMap;
			this.typeMap = typeMap;
		}

		public ReplaceEdit findEdit(int offset) {
			this.offset = offset;
			this.edit = null;
			rootNode.accept(this);
			return edit;
		}

		@Override
		public boolean preVisit2(ASTNode node) {
			return node.getStartPosition() <= offset && offset < node.getStartPosition() + node.getLength();
		}

		@Override
		public boolean visit(ImportDeclaration node) {
			Name name = node.getName();
			if (!preVisit2(name)) {
				return false;
			}
			String oldName = name.getFullyQualifiedName();
			String newName = typeMap.get(oldName);
			if (newName != null) {
				edit = new ReplaceEdit(name.getStartPosition(), name.getLength(), newName);
			}
			return false;
		}

		@Override
		public boolean visit(SimpleType node) {
			Name name = node.getName();
			if (!preVisit2(name)) {
				return false;
			}
			String oldName = name.getFullyQualifiedName();
			String newName = typeMap.get(oldName);
			if (newName != null) {
				edit = new ReplaceEdit(name.getStartPosition(), name.getLength(), newName);
			}
			return false;
		}

		@Override
		public boolean visit(MethodInvocation node) {
			Name name = node.getName();
			if (!preVisit2(name)) {
				return true;
			}
			String oldName = name.getFullyQualifiedName();
			String newName = methodMap.get(oldName);
			if (newName != null) {
				edit = new ReplaceEdit(name.getStartPosition(), name.getLength(), newName);
			}
			return false;
		}
	}

	private Change createChangeMasterSelection(IMethod method) {
		ICompilationUnit cu = method.getCompilationUnit();
		String oldName = method.getElementName();
		String newName = getArguments().getNewName();
		MasterSelectionFinder finder = new MasterSelectionFinder(cu, oldName, newName);
		List<ReplaceEdit> list = finder.getEditList();
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

	private static class MasterSelectionFinder extends ASTVisitor {
		private final ICompilationUnit unit;
		private final String oldName;
		private final String newName;

		private List<ReplaceEdit> editList = new ArrayList<ReplaceEdit>();

		public MasterSelectionFinder(ICompilationUnit unit, String oldName, String newName) {
			this.unit = unit;
			this.oldName = oldName;
			this.newName = newName;
		}

		public List<ReplaceEdit> getEditList() {
			visit();
			return editList;
		}

		private boolean visited = false;

		private void visit() {
			if (visited) {
				return;
			}
			visited = true;

			ASTParser parser = JdtUtil.newASTParser();
			parser.setSource(unit);
			ASTNode node = parser.createAST(new NullProgressMonitor());
			node.accept(this);
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
				ReplaceEdit edit = new ReplaceEdit(offset, length, newName);
				editList.add(edit);
			}
			return false;
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
}
