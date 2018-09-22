package jp.hishidama.xtext.dmdl_editor.jdt.refactoring;

import java.util.ArrayList;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.OperatorUtil;
import jp.hishidama.eclipse_plugin.jdt.util.TypeUtil;
import jp.hishidama.xtext.dmdl_editor.jdt.refactoring.JavaElementRefactoringFinder.MasterSelectionFinder;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
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
		return "Rename Asakusa Class";
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
		if (element instanceof IPackageFragment) {
			return true;
		}

		return false;
	}

	@Override
	public RefactoringStatus checkConditions(IProgressMonitor pm, CheckConditionsContext context) throws OperationCanceledException {
		return null;
	}

	@Override
	public Change createChange(IProgressMonitor pm0) throws CoreException, OperationCanceledException {
		Change result = null;
		CompositeChange compositeChange = null;

		RefactoringProcessor processor = getProcessor();
		Object[] elementList = processor.getElements();
		SubMonitor pm = SubMonitor.convert(pm0, elementList.length);

		for (Object element : elementList) {
			Change change = null;
			if (element instanceof IMethod) {
				IMethod method = (IMethod) element;
				if (OperatorUtil.isMasterSelection(method)) {
					change = createChangeMasterSelection(pm, method);
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
			} else if (element instanceof IPackageFragment) {
				IPackageFragment fragment = (IPackageFragment) element;
				change = createChangePackage(pm, fragment);
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

			pm.worked(1);
		}

		return result;
	}

	private Change createChangeMasterSelection(IProgressMonitor pm, IMethod method) {
		ICompilationUnit cu = method.getCompilationUnit();
		String oldName = method.getElementName();
		String newName = getArguments().getNewName();
		MasterSelectionFinder finder = new MasterSelectionFinder(oldName, newName);
		List<ReplaceEdit> list = finder.getEditList(pm, cu);
		if (list.isEmpty()) {
			return null;
		}

		Change result;
		TextChange change = getTextChange(cu);
		if (change == null) {
			change = new CompilationUnitChange(cu.getElementName(), cu);
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

	private Change createChangeMethod(IProgressMonitor pm, IMethod method) throws CoreException {
		String newName = getArguments().getNewName();
		OperatorMethodRenameRefactor refactor = new OperatorMethodRenameRefactor(this, method, newName);
		return refactor.createChangeMethod(pm);
	}

	private Change createChangeType(IProgressMonitor pm, IType type) throws CoreException {
		if (type == null) {
			return null;
		}

		String newFullName = type.getPackageFragment().getElementName() + "." + getArguments().getNewName();
		FactoryTypeRenameRefactor refactor = new FactoryTypeRenameRefactor(this, type, newFullName);
		return refactor.createChangeType(pm);
	}

	private Change createChangePackage(IProgressMonitor pm, IPackageFragment fragment) throws CoreException {
		List<FactoryTypeRenameRefactor.TypePair> typeList = getTypeList(fragment);
		if (typeList.isEmpty()) {
			return null;
		}

		FactoryTypeRenameRefactor refactor = new FactoryTypeRenameRefactor(this, typeList);
		return refactor.createChangeType(pm);
	}

	private List<FactoryTypeRenameRefactor.TypePair> getTypeList(IPackageFragment fragment) throws CoreException {
		String newPackageName = getArguments().getNewName();

		List<FactoryTypeRenameRefactor.TypePair> result = new ArrayList<FactoryTypeRenameRefactor.TypePair>();
		for (IJavaElement child : fragment.getChildren()) {
			if (child instanceof ICompilationUnit) {
				IType type = TypeUtil.getPublicType((ICompilationUnit) child);
				if (type != null) {
					if (OperatorUtil.isOperator(type) || FlowUtil.isFlowPart(type)) {
						String newFullName = newPackageName + "." + type.getElementName();
						result.add(new FactoryTypeRenameRefactor.TypePair(type, newFullName));
					}
				}
			}
		}
		return result;
	}
}
