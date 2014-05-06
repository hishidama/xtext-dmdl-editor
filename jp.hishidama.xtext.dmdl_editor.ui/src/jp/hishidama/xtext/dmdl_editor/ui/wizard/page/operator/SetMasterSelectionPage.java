package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.eclipse_plugin.jdt.util.AnnotationUtil;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;

import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

public class SetMasterSelectionPage extends EditWizardPage {

	private IType type;

	private List<String> existsList;

	private Button useCheck;

	private Button button0;
	private Group group0;
	private Combo enumCombo;

	private Button button1;
	private Group group1;
	private Text nameText;

	public SetMasterSelectionPage(IType type, OperatorType opType) {
		super("SetMasterSelectionPage");

		setTitle(MessageFormat.format("{0}のマスター選択演算子の指定", opType.getName()));
		setDescription("マスター選択演算子を使用する場合、そのメソッドを指定して下さい。");

		this.type = type;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		{
			composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			composite.setLayout(new GridLayout(2, false));
		}

		useCheck = new Button(composite, SWT.CHECK);
		{
			GridData data = new GridData(GridData.FILL_HORIZONTAL);
			data.horizontalSpan = 2;
			useCheck.setLayoutData(data);
		}
		useCheck.setText("マスター選択演算子を使用する");
		useCheck.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				if (useCheck.getSelection()) {
					setEnabled(true, button0.getSelection(), button1.getSelection());
				} else {
					setEnabled(false, false, false);
				}
			}
		});

		{
			button0 = new Button(composite, SWT.RADIO);
			button0.setText("既存のメソッドから選択：");

			group0 = new Group(composite, SWT.SHADOW_IN);
			group0.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			group0.setLayout(new GridLayout());
			existsList = getExistsMethodList();
			enumCombo = createCombo(group0, 1);
			enumCombo.setItems(existsList.toArray(new String[existsList.size()]));
		}
		{
			button1 = new Button(composite, SWT.RADIO);
			button1.setText("新しいメソッドを作成：");

			group1 = new Group(composite, SWT.SHADOW_IN);
			group1.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
			group1.setLayout(new GridLayout(2, false));
			nameText = createTextField(group1, 1, "メソッド名：");
		}

		button0.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setEnabled(true, true, false);
			}
		});
		button1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				setEnabled(true, false, true);
			}
		});

		if (existsList.isEmpty()) {
			button1.setSelection(true);
		} else {
			button0.setSelection(true);
		}
		setEnabled(false, false, false);

		return composite;
	}

	void setEnabled(boolean use, boolean b0, boolean b1) {
		if (!use) {
			b0 = false;
			b1 = false;
		}
		button0.setEnabled(use);
		group0.setEnabled(b0);
		enumCombo.setEnabled(b0);
		button1.setEnabled(use);
		group1.setEnabled(b1);
		nameText.setEnabled(b1);
		validate(isVisible());
	}

	private List<String> getExistsMethodList() {
		List<String> list = new ArrayList<String>();
		try {
			for (IJavaElement c : type.getChildren()) {
				if (c instanceof IMethod) {
					IMethod method = (IMethod) c;
					if (AnnotationUtil.getAnnotation(type, method, "com.asakusafw.vocabulary.operator.MasterSelection") != null) {
						list.add(method.getElementName());
					}
				}
			}
		} catch (JavaModelException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	protected String validate() {
		if (button0 == null || button1 == null) {
			return null;
		}

		if (!useCheck.getSelection()) {
			return null;
		}

		if (button0.getSelection()) {
			String name = enumCombo.getText().trim();
			if (name.isEmpty()) {
				return "メソッドを選択して下さい。";
			}
			return null;
		}
		if (button1.getSelection()) {
			String name = nameText.getText().trim();
			if (name.isEmpty()) {
				return "メソッド名を入力して下さい。";
			}
			if (existsList.contains(name)) {
				return "メソッドが既に存在しています。";
			}

			return null;
		}

		return "どちらかを選択して下さい。";
	}

	public String getMethodName() {
		if (!useCheck.getSelection()) {
			return null;
		}

		if (button0.getSelection()) {
			return enumCombo.getText().trim();
		} else {
			return nameText.getText().trim();
		}
	}

	public String getCreateMethodName() {
		if (useCheck.getSelection() && button1.getSelection()) {
			return nameText.getText().trim();
		}

		return null;
	}
}
