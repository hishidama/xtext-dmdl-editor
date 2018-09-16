package jp.hishidama.xtext.dmdl_editor.jdt.editor_menu;

import java.util.ArrayList;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.OperatorUtil;
import jp.hishidama.eclipse_plugin.util.JdtUtil;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.refactoring.CompilationUnitChange;
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
			if (OperatorUtil.isMasterSelection(method)) {
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
}
