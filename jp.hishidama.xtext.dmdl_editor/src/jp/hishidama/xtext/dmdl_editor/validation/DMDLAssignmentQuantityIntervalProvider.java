package jp.hishidama.xtext.dmdl_editor.validation;

import java.util.Set;

import jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.IAssignmentQuantityAllocator.IQuantities;
import org.eclipse.xtext.validation.IConcreteSyntaxConstraintProvider.ISyntaxConstraint;
import org.eclipse.xtext.validation.impl.AssignmentQuantityIntervalProvider;

public class DMDLAssignmentQuantityIntervalProvider extends AssignmentQuantityIntervalProvider {

	@Override
	public int getMax(IQuantities ctx, ISyntaxConstraint assignment, Set<ISyntaxConstraint> involved,
			String excludeFeature) {
		int max = super.getMax(ctx, assignment, involved, excludeFeature);

		if (max == 0) {
			EObject object = ctx.getEObject();
			if (object instanceof RecordTerm) {
				String name = assignment.getAssignmentName();
				if ("reference".equals(name)) {
					return 1;
				}
			}
		}

		return max;
	}
}
