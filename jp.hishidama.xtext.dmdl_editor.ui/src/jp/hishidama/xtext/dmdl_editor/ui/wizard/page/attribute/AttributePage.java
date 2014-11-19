package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.attribute;

import static jp.hishidama.eclipse_plugin.util.StringUtil.nonNull;

import java.io.StringReader;
import java.text.MessageFormat;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.extension.AsakusafwConfiguration;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.BuildPropertiesUtil;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;
import jp.hishidama.xtext.dmdl_editor.extension.ExtensionUtil;
import jp.hishidama.xtext.dmdl_editor.parser.antlr.DMDLParser;
import jp.hishidama.xtext.dmdl_editor.services.DMDLGrammarAccess;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLVariableTableUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;

import org.eclipse.core.resources.IProject;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;

public abstract class AttributePage extends WizardPage {
	protected static final String SETTINGS_COMBO_DEFAULT = "AttributeWizard.combo.default";
	protected static final String SETTINGS_MODEL_ATTR = "AttributeWizard.modelAttribute";
	protected static final String SETTINGS_PROP_ATTR = "AttributeWizard.propertyAttribute";

	private final IProject project;
	protected Text modelText;
	protected Text propertyText;

	public AttributePage(String pageName, IProject project) {
		super(pageName);
		this.project = project;

		setPageComplete(false);
	}

	public final void createControl(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new GridLayout(2, false));

		createFields(composite);
		validate();

		setControl(composite);
	}

	protected abstract void createFields(Composite composite);

	protected void createModelField(Composite composite) {
		Label label = new Label(composite, SWT.NONE);
		label.setText("モデルの属性");
		modelText = new Text(composite, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		modelText.setText(nonNull(getSetting(SETTINGS_MODEL_ATTR)));
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.heightHint = 18 * 9;
		modelText.setLayoutData(data);
		modelText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validate();
			}
		});
	}

	protected void createPropertyField(Composite composite) {
		Label label = new Label(composite, SWT.NONE);
		label.setText("プロパティーの属性");
		propertyText = new Text(composite, SWT.BORDER | SWT.MULTI | SWT.V_SCROLL);
		propertyText.setText(nonNull(getSetting(SETTINGS_PROP_ATTR)));
		GridData data = new GridData(GridData.FILL_HORIZONTAL);
		data.heightHint = 18 * 4;
		propertyText.setLayoutData(data);
		propertyText.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				validate();
			}
		});
	}

	/*
	 * noteグループ
	 */
	protected void createNoteField(Composite composite) {
		Group group = new Group(composite, SWT.SHADOW_IN);
		group.setText("note");
		GridData grid = new GridData(GridData.FILL_HORIZONTAL);
		grid.horizontalSpan = 2;
		group.setLayoutData(grid);
		createNoteArea(group);
	}

	protected abstract void createNoteArea(Group group);

	protected void createVariableTable(Group group, boolean hasModel, boolean hasProperty) {
		DMDLVariableTableUtil.createVariableTable(group, hasModel, hasProperty);
	}

	/*
	 * デフォルト属性値ボタン
	 */
	protected void createDefaultButtonField(Composite composite) {
		new Label(composite, SWT.NONE).setText(""); // dummy

		Composite field = new Composite(composite, SWT.NONE);
		field.setLayout(new GridLayout(2, false));

		final Map<String, DMDLAttributeWizardDefinition> map = getDefinitionMap();
		final Combo combo = new Combo(field, SWT.DROP_DOWN);
		{
			for (String name : map.keySet()) {
				combo.add(name);
			}
			combo.setText(nonNull(getSetting(SETTINGS_COMBO_DEFAULT)));
		}
		final Button button = new Button(field, SWT.PUSH);
		button.setText("属性のデフォルト値を下記入力欄に設定する");
		{
			String key = combo.getText();
			DMDLAttributeWizardDefinition def = map.get(key);
			button.setEnabled(def != null);
		}

		combo.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String key = combo.getText();
				DMDLAttributeWizardDefinition def = map.get(key);
				button.setEnabled(def != null);
				if (def != null) {
					setSetting(SETTINGS_COMBO_DEFAULT, key);
				}
			}
		});
		button.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				String key = combo.getText();
				DMDLAttributeWizardDefinition def = map.get(key);
				if (def != null) {
					setDefaultAttribute(def);
				}
			}
		});
	}

	private Map<String, DMDLAttributeWizardDefinition> getDefinitionMap() {
		List<DMDLAttributeWizardDefinition> list = ExtensionUtil.getAttributeWizardDefinitions();

		Map<String, DMDLAttributeWizardDefinition> map = new TreeMap<String, DMDLAttributeWizardDefinition>();
		for (DMDLAttributeWizardDefinition def : list) {
			String key = def.getName();
			map.put(key, def);
		}
		return map;
	}

	private String version = null;

	private void setDefaultAttribute(DMDLAttributeWizardDefinition def) {
		if (version == null) {
			AsakusafwConfiguration c = BuildPropertiesUtil.getAsakusafwConfiguration(project);
			if (c != null) {
				version = c.getCurrentVersion(project);
			}
			if (version == null) {
				version = "UNKNOWN";
			}
		}
		if (modelText != null) {
			modelText.setText(nonNull(getDefaultModelAttribute(def, version)));
		}
		if (propertyText != null) {
			propertyText.setText(nonNull(getDefaultPropertyAttribute(def, version)));
		}
	}

	protected abstract String getDefaultModelAttribute(DMDLAttributeWizardDefinition def, String version);

	protected abstract String getDefaultPropertyAttribute(DMDLAttributeWizardDefinition def, String version);

	/*
	 * validate
	 */
	protected abstract void validate();

	private DMDLParser parser;

	protected boolean validateParse(String title, Text text) {
		String attr = text.getText();
		if (attr.trim().isEmpty()) {
			return true;
		}

		if (parser == null) {
			parser = InjectorUtil.getInstance(DMDLParser.class);
		}

		String resolved = DMDLVariableTableUtil.replaceVariable(attr, "model_name", "\"model description\"",
				"property_name", "\"property description\"");
		DMDLGrammarAccess grammar = parser.getGrammarAccess();
		IParseResult result = parser.parse(grammar.getAttributeListRule(), new StringReader(resolved));
		if (result.hasSyntaxErrors()) {
			StringBuilder sb = new StringBuilder();
			for (INode error : result.getSyntaxErrors()) {
				if (sb.length() != 0) {
					sb.append("\n");
				}
				sb.append(error.getSyntaxErrorMessage().getMessage());
			}
			if (getErrorMessage() == null) {
				setErrorMessage(MessageFormat.format("{0}の内容が不正です。", title));
			}
			setPageComplete(false);
			text.setToolTipText(sb.toString());
			return false;
		}

		text.setToolTipText(null);
		return true;
	}

	public String getModelAttribute() {
		String text = modelText.getText();
		setSetting(SETTINGS_MODEL_ATTR, text);
		return text;
	}

	public String getPropertyAttribute() {
		String text = propertyText.getText();
		setSetting(SETTINGS_PROP_ATTR, text);
		return text;
	}

	private String getSetting(String key) {
		IDialogSettings settings = getDialogSettings();
		return settings.get(getKey(key));
	}

	private void setSetting(String key, String value) {
		IDialogSettings settings = getDialogSettings();
		settings.put(getKey(key), value);
	}

	private String getKey(String key) {
		return String.format("%s.%s", key, getName());
	}
}
