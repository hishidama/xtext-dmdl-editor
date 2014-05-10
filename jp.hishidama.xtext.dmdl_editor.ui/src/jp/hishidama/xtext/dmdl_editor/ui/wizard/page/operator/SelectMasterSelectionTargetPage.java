package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.eclipse_plugin.jdt.util.AnnotationUtil;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;

import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.JavaElementLabels;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;

public class SelectMasterSelectionTargetPage extends EditWizardPage {

	private final IType type;
	private final int offset;

	private List<IMethod> methodList;

	private Combo methodCombo;
	private Button check;

	public SelectMasterSelectionTargetPage(IType type, int offset) {
		super("SelectMasterSelectionTargetPage");

		setTitle("対象演算子の指定");
		setDescription("マスター選択演算子を生成する対象となる演算子メソッドを選択して下さい。");

		this.type = type;
		this.offset = offset;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		{
			composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			composite.setLayout(new GridLayout(2, false));
		}

		{
			List<String> labelList = initializeList();
			methodCombo = createComboField(composite, 1, "対象演算子メソッド:");
			methodCombo.setItems(labelList.toArray(new String[labelList.size()]));
			methodCombo.select(getInitialMethod());
		}
		{
			check = createCheckButtonField(composite, "", "対象演算子のselectionを、今回作成するマスター選択演算子のメソッドにする");
			check.setSelection(true);
		}

		return composite;
	}

	private List<String> initializeList() {
		List<String> labelList = new ArrayList<String>();
		methodList = new ArrayList<IMethod>();

		IMethod[] members;
		try {
			members = type.getMethods();
		} catch (JavaModelException e) {
			return labelList;
		}
		for (IMethod method : members) {
			if (isTarget(method)) {
				String methodLabel = JavaElementLabels.getElementLabel(method, JavaElementLabels.M_PARAMETER_TYPES);
				labelList.add(methodLabel);
				methodList.add(method);
			}
		}

		return labelList;
	}

	private boolean isTarget(IMethod method) {
		Set<String> set = new HashSet<String>();
		set.add(OperatorType.MASTER_JOIN.getTypeName());
		set.add(OperatorType.MASTER_BRANCH.getTypeName());
		set.add(OperatorType.MASTER_CHECK.getTypeName());
		set.add(OperatorType.MASTER_JOIN_UPDATE.getTypeName());

		return AnnotationUtil.getAnnotation(type, method, set) != null;
	}

	private int getInitialMethod() {
		int i = 0;
		for (IMethod method : methodList) {
			try {
				ISourceRange range = method.getSourceRange();
				if (range.getOffset() <= offset && offset <= range.getOffset() + range.getLength()) {
					return i;
				}
			} catch (JavaModelException e) {
				// ignore
			}
			i++;
		}
		return -1;
	}

	@Override
	protected String validate() {
		if (getTargetMethod() == null) {
			return "対象演算子を選択して下さい。";
		}
		return null;
	}

	public IMethod getTargetMethod() {
		int n = methodCombo.getSelectionIndex();
		if (n < 0 || n >= methodList.size()) {
			return null;
		}
		return methodList.get(n);
	}

	public boolean isReplaceSelection() {
		return check.getSelection();
	}
}
