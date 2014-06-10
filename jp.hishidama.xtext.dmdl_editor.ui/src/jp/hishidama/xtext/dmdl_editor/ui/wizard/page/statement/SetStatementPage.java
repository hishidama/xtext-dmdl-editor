package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.statement;

import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLVariableTableUtil;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

public class SetStatementPage extends EditWizardPage {
	private static final String KEY_STATEMENT = "SetStatementPage.STATEMENT";

	private Text statText;

	public SetStatementPage() {
		super("SetStatementPage");

		setTitle("文の入力");
		setDescription("作成する文を入力して下さい。");
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		{
			composite.setLayoutData(new GridData(GridData.FILL_BOTH));

			composite.setLayout(new GridLayout(2, false));
		}

		createLabel(composite, "statement:");
		statText = new Text(composite, SWT.BORDER | SWT.MULTI);
		GridDataFactory.fillDefaults().grab(true, true).hint(-1, 64).applyTo(statText);
		statText.setText(getDefaultStatement());
		statText.addModifyListener(MODIFY_REFRESH_LISTENER);

		createGroup(composite);

		return composite;
	}

	private String getDefaultStatement() {
		IDialogSettings settings = getDialogSettings();
		String value = settings.get(KEY_STATEMENT);
		if (value == null) {
			value = "// $(description)\n" + "left.set$(name.toCamelCase)Option(right.get$(name.toCamelCase)Option());";
		}
		return value;
	}

	public void saveDialogSettings() {
		IDialogSettings settings = getDialogSettings();
		settings.put(KEY_STATEMENT, getStatementText());
	}

	protected void createGroup(Composite composite) {
		Group group = new Group(composite, SWT.SHADOW_IN);
		GridDataFactory.fillDefaults().grab(true, false).span(2, 1).applyTo(group);
		group.setLayout(new GridLayout(2, false));
		createLabel(group, "右記の変数を指定することが出来ます。\n行を選択してCtrl+Cを押すと変数名をコピーできます。");
		DMDLVariableTableUtil.createVariableTable(group, false, true);

		createLabel(group, "例えば右記の様な文を書くことが出来ます。");
		Text text = new Text(group, SWT.BORDER | SWT.MULTI);
		GridDataFactory.fillDefaults().grab(true, false).applyTo(text);
		text.setText("// $(description)\n" + "left.set$(name.toCamelCase)Option(right.get$(name.toCamelCase)Option());");
		text.setEditable(false);
	}

	@Override
	protected String validate() {
		String statement = statText.getText();
		if (statement.isEmpty()) {
			return "ステートメントを入力して下さい。";
		}
		return null;
	}

	public String getStatementText() {
		return statText.getText();
	}
}
