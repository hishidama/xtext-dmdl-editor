package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.JavaElementLabels;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;

// @see org.eclipse.jdt.internal.ui.dialogs.SourceActionDialog
public class SetOperatorNamePage extends EditWizardPage {

	private final IType type;
	private final int offset;

	private List<IMember> memberList;
	// Valid values for the insert position:
	private static final int INSERT_FIRST_INDEX = 0;
	private static final int INSERT_LAST_INDEX = 1;
	private static final int INSERT_POSITION_FROM_EDITOR = 2;

	private Text commentText;
	private Text nameText;
	private Combo posCombo;

	public SetOperatorNamePage(IType type, int offset) {
		super("SetOperatorNamePage");

		setTitle("演算子のメソッド名の指定");
		setDescription("作成するユーザー演算子のメソッド名を入力して下さい。");

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
			commentText = createTextField(composite, 1, "コメント：");
			nameText = createTextField(composite, 1, "メソッド名：");
		}
		{
			List<String> labelList = initializeList();
			posCombo = createComboField(composite, 1, "Insertion point:");
			posCombo.setItems(labelList.toArray(new String[labelList.size()]));
			posCombo.select(getElementAfterCursorPosition());
		}

		return composite;
	}

	private List<String> initializeList() {
		List<String> labelList = new ArrayList<String>();
		memberList = new ArrayList<IMember>();
		labelList.add("First member");
		memberList.add(null); // INSERT_FIRST_INDEX
		labelList.add("Last member");
		memberList.add(null); // INSERT_LAST_INDEX

		IJavaElement[] members;
		try {
			members = type.getChildren();
		} catch (JavaModelException e) {
			return labelList;
		}
		for (IJavaElement element : members) {
			if (element instanceof IMember) {
				IMember member = (IMember) element;
				String methodLabel = JavaElementLabels.getElementLabel(member, JavaElementLabels.M_PARAMETER_TYPES);
				labelList.add(MessageFormat.format("After {0}", methodLabel));
				memberList.add(member);
			}
		}

		return labelList;
	}

	private int getElementAfterCursorPosition() {
		for (int i = INSERT_POSITION_FROM_EDITOR; i < memberList.size(); i++) {
			IMember member = memberList.get(i);
			try {
				ISourceRange range = member.getSourceRange();
				if (offset < range.getOffset()) {
					if (i == INSERT_POSITION_FROM_EDITOR) {
						return INSERT_FIRST_INDEX;
					}
					return i - 1;
				}
			} catch (JavaModelException e) {
				e.printStackTrace();
			}
		}
		return INSERT_LAST_INDEX;
	}

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible) {
			commentText.setFocus();
		}
	}

	@Override
	protected String validate() {
		if (getMethodName().isEmpty()) {
			return "メソッド名を入力して下さい。";
		}
		return null;
	}

	public String getMethodComment() {
		return commentText.getText().trim();
	}

	public String getMethodName() {
		return nameText.getText().trim();
	}

	public IMember getPosition() {
		int n = posCombo.getSelectionIndex();
		return memberList.get(n);
	}

	public boolean getAfter() {
		int n = posCombo.getSelectionIndex();
		return n != INSERT_FIRST_INDEX;
	}
}
