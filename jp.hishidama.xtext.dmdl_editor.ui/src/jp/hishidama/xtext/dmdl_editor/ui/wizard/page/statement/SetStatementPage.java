package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.statement;

import java.util.ArrayList;
import java.util.List;

import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLVariableTableUtil;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.layout.GridDataFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

public class SetStatementPage extends EditWizardPage {

	private final boolean isProperty;

	private Text statText;

	private Combo hisCombo;

	public SetStatementPage(boolean isProperty) {
		super("SetStatementPage");
		this.isProperty = isProperty;

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
		GridDataFactory.fillDefaults().grab(true, true).hint(256, 64).applyTo(statText);
		statText.setText(getDefaultStatement());
		statText.addModifyListener(MODIFY_REFRESH_LISTENER);

		createLabel(composite, "history:");
		hisCombo = new Combo(composite, SWT.READ_ONLY);
		GridDataFactory.fillDefaults().grab(true, false).hint(256, SWT.DEFAULT).applyTo(hisCombo);
		List<String> list = getStatementHistory();
		hisCombo.setItems(list.toArray(new String[list.size()]));
		hisCombo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String text = hisCombo.getText();
				statText.setText(text);
			}
		});

		createDescription(composite);

		return composite;
	}

	private String getDefaultStatement() {
		final String KEY_STATEMENT = getSettingKeyStatement();

		IDialogSettings settings = getDialogSettings();
		String value = settings.get(KEY_STATEMENT);
		if (value == null) {
			value = isProperty ? getDefaultStatementProperty() : getDefaultStatementModel();
		}
		return value;
	}

	private String getDefaultStatementProperty() {
		return "// $(description)\n" + "left.set$(name.toCamelCase)Option(right.get$(name.toCamelCase)Option());";
	}

	private String getDefaultStatementModel() {
		StringBuilder sb = new StringBuilder(400);
		sb.append("In<$(modelName.toCamelCase)> $(modelName.toLowerCamelCase) = tester.input(\"$(modelName.toLowerCamelCase)\", $(modelName.toCamelCase).class).prepare(\"$(modelName).xls#input\");\n");
		sb.append("Out<$(modelName.toCamelCase)> $(modelName.toLowerCamelCase) = tester.output(\"$(modelName.toLowerCamelCase)\", $(modelName.toCamelCase).class).verify(\"$(modelName).xls#output\", \"$(modelName).xls#rule\");");
		return sb.toString();
	}

	private List<String> getStatementHistory() {
		final String KEY_HISTORY = getSettingKeyHistory();

		IDialogSettings settings = getDialogSettings();
		int count;
		try {
			count = settings.getInt(KEY_HISTORY);
		} catch (Exception e) {
			count = 0;
		}

		List<String> list = new ArrayList<String>(count);
		for (int i = 0; i < count; i++) {
			String key = String.format("%s.%d", KEY_HISTORY, i);
			String s = settings.get(key);
			if (s != null) {
				list.add(s);
			}
		}
		return list;
	}

	public void saveDialogSettings() {
		final String KEY_STATEMENT = getSettingKeyStatement();
		final String KEY_HISTORY = getSettingKeyHistory();

		IDialogSettings settings = getDialogSettings();
		String statement = getStatementText();
		settings.put(KEY_STATEMENT, statement);

		String[] items = hisCombo.getItems();
		List<String> list = new ArrayList<String>(items.length + 1);
		for (String s : items) {
			if (!statement.equals(s)) {
				list.add(s);
			}
		}
		list.add(0, statement);
		int count = Math.min(list.size(), 20);
		settings.put(KEY_HISTORY, count);
		for (int i = 0; i < count; i++) {
			String key = String.format("%s.%d", KEY_HISTORY, i);
			settings.put(key, list.get(i));
		}
	}

	protected void createDescription(Composite composite) {
		Group group = new Group(composite, SWT.SHADOW_IN);
		GridDataFactory.fillDefaults().grab(true, false).span(2, 1).applyTo(group);
		group.setLayout(new GridLayout(2, false));
		createLabel(group, "右記の変数を指定することが出来ます。\n行を選択してCtrl+Cを押すと変数名をコピーできます。");
		DMDLVariableTableUtil.createVariableTable(group, !isProperty, isProperty);

		createLabel(group, "例えば右記の様な文を書くことが出来ます。");
		Text text = new Text(group, SWT.BORDER | SWT.MULTI);
		GridDataFactory.fillDefaults().grab(true, false).hint(256, SWT.DEFAULT).applyTo(text);
		text.setText(isProperty ? getDefaultStatementProperty() : getDefaultStatementModel());
		text.setEditable(false);
	}

	private String getSettingKeyStatement() {
		if (isProperty) {
			return "SetStatementPage.STATEMENT";
		} else {
			return "SetStatementPage.model.STATEMENT";
		}
	}

	private String getSettingKeyHistory() {
		if (isProperty) {
			return "SetStatementPage.HISTORY";
		} else {
			return "SetStatementPage.model.HISTORY";
		}
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
