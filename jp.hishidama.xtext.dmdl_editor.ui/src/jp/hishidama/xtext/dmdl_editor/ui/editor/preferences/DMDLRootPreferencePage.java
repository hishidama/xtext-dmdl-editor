package jp.hishidama.xtext.dmdl_editor.ui.editor.preferences;

import org.eclipse.jface.preference.BooleanFieldEditor;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.xtext.builder.preferences.BuilderPreferenceAccess;
import org.eclipse.xtext.ui.editor.preferences.LanguageRootPreferencePage;

@SuppressWarnings("restriction")
public class DMDLRootPreferencePage extends LanguageRootPreferencePage {

	public static final String FORMAT_ON_SAVE = "formatOnSave";

	@Override
	protected void createFieldEditors() {
		Composite parent = getFieldEditorParent();
		addField(new BooleanFieldEditor(FORMAT_ON_SAVE, "format dmdl source on save", parent));
		addField(new BooleanFieldEditor(BuilderPreferenceAccess.PREF_AUTO_BUILDING, "auto error-check on save", parent));
	}
}
