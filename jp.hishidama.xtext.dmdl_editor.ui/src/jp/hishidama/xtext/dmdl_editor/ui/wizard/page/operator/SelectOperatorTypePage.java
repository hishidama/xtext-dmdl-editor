package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

public class SelectOperatorTypePage extends EditWizardPage {

	private OperatorType defaultOperatorType;
	private List<Button> buttonList = new ArrayList<Button>();

	public SelectOperatorTypePage() {
		super("SelectOperatorTypePage");

		setTitle("演算子の種類の指定");
		setDescription("作成するユーザー演算子の種類を選択して下さい。");
	}

	@Override
	protected Composite createComposite(Composite parent) {
		this.defaultOperatorType = getDefaultOperatorType();

		Composite composite = new Composite(parent, SWT.NONE);
		{
			composite.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));

			composite.setLayout(new GridLayout(4, false));
		}

		{
			Label label = new Label(composite, SWT.NONE);
			label.setText("フロー制御演算子：");

			createRadio(composite, "分岐", OperatorType.BRANCH);
			new Label(composite, SWT.NONE);
			new Label(composite, SWT.NONE);
		}
		{
			Label label = new Label(composite, SWT.NONE);
			label.setText("データ操作演算子：");

			createRadio(composite, "更新", OperatorType.UPDATE);
			createRadio(composite, "変換", OperatorType.CONVERT);
			createRadio(composite, "抽出", OperatorType.EXTRACT);
		}
		{
			Label label = new Label(composite, SWT.NONE);
			label.setText("結合演算子：");

			createRadio(composite, "マスター確認", OperatorType.MASTER_CHECK);
			createRadio(composite, "マスター結合", OperatorType.MASTER_JOIN);
			createRadio(composite, "マスター分岐", OperatorType.MASTER_BRANCH);

			new Label(composite, SWT.NONE);
			createRadio(composite, "マスターつき更新", OperatorType.MASTER_JOIN_UPDATE);
			createRadio(composite, "グループ結合", OperatorType.CO_GROUP);
			createRadio(composite, "分割", OperatorType.SPLIT);
		}
		{
			Label label = new Label(composite, SWT.NONE);
			label.setText("集計演算子：");

			createRadio(composite, "単純集計", OperatorType.SUMMARIZE);
			createRadio(composite, "畳み込み", OperatorType.FOLD);
			createRadio(composite, "グループ整列", OperatorType.GROUP_SORT);
		}
		{
			Label label = new Label(composite, SWT.NONE);
			label.setText("特殊演算子：");

			createRadio(composite, "ロギング", OperatorType.LOGGING);
		}

		return composite;
	}

	private void createRadio(Composite composite, String text, OperatorType type) {
		Button button = new Button(composite, SWT.RADIO);
		button.setText(MessageFormat.format("{0}（{1}）", text, type.getShortTypeName()));
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				validate(true);
			}
		});

		button.setData(type);
		buttonList.add(button);

		if (type.equals(defaultOperatorType)) {
			button.setSelection(true);
		}
	}

	@Override
	protected String validate() {
		if (getOperatorType() == null) {
			return "演算子の種類を選択して下さい。";
		}
		return null;
	}

	public OperatorType getOperatorType() {
		for (Button button : buttonList) {
			if (button.getSelection()) {
				return (OperatorType) button.getData();
			}
		}
		return null;
	}

	private static final String KEY_DEFAULT_TYPE = "defaultOperatorType";

	private OperatorType getDefaultOperatorType() {
		try {
			IDialogSettings settings = getDialogSettings();
			String name = settings.get(getDialogSettingsKey(KEY_DEFAULT_TYPE));
			if (name == null) {
				return null;
			}
			return OperatorType.valueOf(name);
		} catch (Exception e) {
			return null;
		}
	}

	public void saveDialogSettings() {
		IDialogSettings settings = getDialogSettings();
		settings.put(getDialogSettingsKey(KEY_DEFAULT_TYPE), getOperatorType().name());
	}

	private String getDialogSettingsKey(String baseKey) {
		return getName() + "." + baseKey;
	}
}
