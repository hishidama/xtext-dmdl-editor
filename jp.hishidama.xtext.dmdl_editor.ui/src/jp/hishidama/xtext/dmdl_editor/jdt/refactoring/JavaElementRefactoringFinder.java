package jp.hishidama.xtext.dmdl_editor.jdt.refactoring;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import jp.hishidama.eclipse_plugin.util.JdtUtil;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
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
import org.eclipse.text.edits.ReplaceEdit;

abstract class JavaElementRefactoringFinder extends ASTVisitor {

	private static final int NO_CHECK_OFFSET = Integer.MIN_VALUE;

	protected int offset;
	private List<ReplaceEdit> editList = new ArrayList<ReplaceEdit>();

	public List<ReplaceEdit> getEditList(IProgressMonitor pm, ICompilationUnit cu, int offset) {
		this.offset = offset;
		this.editList.clear();

		ASTParser parser = JdtUtil.newASTParser();
		parser.setSource(cu);
		ASTNode node = parser.createAST(pm);
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

	static class StringFinder extends JavaElementRefactoringFinder {
		private final String oldName;
		private final String newName;
		private boolean check = false;

		public StringFinder(String oldName, String newName) {
			this.oldName = oldName;
			this.newName = newName;
		}

		public List<ReplaceEdit> getEditList(IProgressMonitor pm, ICompilationUnit cu) {
			this.check = false;
			return getEditList(pm, cu, NO_CHECK_OFFSET);
		}

		private static final Set<String> CLASS_NAME_SET = new HashSet<String>(Arrays.asList(//
				"MasterBranch", "MasterCheck", "MasterJoin", "MasterJoinUpdate", //
				"Batch", "JobFlow"));

		@Override
		public boolean visit(NormalAnnotation node) {
			String name = node.getTypeName().getFullyQualifiedName();
			return CLASS_NAME_SET.contains(name);
		}

		@Override
		public boolean visit(MemberValuePair node) {
			String name = node.getName().getIdentifier();
			this.check = "selection".equals(name) || "name".equals(name);
			return check;
		}

		@Override
		public boolean visit(StringLiteral node) {
			if (check) {
				String value = node.getLiteralValue().trim();
				if (value.equals(oldName)) {
					int offset = node.getStartPosition() + 1;
					int length = node.getLength() - 2;
					addEdit(new ReplaceEdit(offset, length, newName));
				}

				this.check = false;
			}
			return false;
		}
	}

	static class MethodFinder extends JavaElementRefactoringFinder {
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

	static class TypeFinder extends JavaElementRefactoringFinder {
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
}
