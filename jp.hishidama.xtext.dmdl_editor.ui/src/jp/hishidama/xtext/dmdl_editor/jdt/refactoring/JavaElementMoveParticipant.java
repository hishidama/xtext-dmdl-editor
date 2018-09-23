package jp.hishidama.xtext.dmdl_editor.jdt.refactoring;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.OperatorUtil;
import jp.hishidama.eclipse_plugin.jdt.util.TypeUtil;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IType;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.CheckConditionsContext;
import org.eclipse.ltk.core.refactoring.participants.MoveParticipant;
import org.eclipse.ltk.core.refactoring.participants.RefactoringProcessor;

public class JavaElementMoveParticipant extends MoveParticipant {

	@Override
	public String getName() {
		return "Move Asakusa Class";
	}

	@Override
	protected boolean initialize(Object element) {
		if (!getArguments().getUpdateReferences()) {
			return false;
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
			if (element instanceof IType) {
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
						compositeChange = new CompositeChange(getName());
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

	private Change createChangeType(IProgressMonitor pm, IType type) throws CoreException {
		String newFullName = getNewTypeName(type);
		if (newFullName == null) {
			return null;
		}

		FactoryTypeRenameRefactor refactor = new FactoryTypeRenameRefactor(this, type, newFullName);
		return refactor.createChangeType(pm);
	}

	private String getNewTypeName(IType type) {
		Object destination = getArguments().getDestination();
		if (destination instanceof IPackageFragment) {
			IPackageFragment fragment = (IPackageFragment) destination;
			return fragment.getElementName() + "." + type.getElementName();
		}

		return null;
	}
}
