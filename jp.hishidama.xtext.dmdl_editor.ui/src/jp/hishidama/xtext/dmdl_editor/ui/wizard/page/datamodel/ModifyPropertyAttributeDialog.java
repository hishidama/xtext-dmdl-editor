package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel;

import java.io.StringReader;

import jp.hishidama.eclipse_plugin.dialog.EditDialog;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.parser.antlr.DMDLParser;
import jp.hishidama.xtext.dmdl_editor.services.DMDLGrammarAccess;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.util.DMDLStringUtil;

import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;

public class ModifyPropertyAttributeDialog extends EditDialog {

	private DataModelRow row;
	private Text attributeText;

	public ModifyPropertyAttributeDialog(Shell parentShell, DataModelRow row) {
		super(parentShell, "プロパティー属性編集");
		this.row = row;
	}

	@Override
	protected void createFields(Composite composite) {
		addField(composite, "name", row.getName(), false);
		addField(composite, "description", row.getDescription(), false);
		addField(composite, "type", row.getDataType(), false);
		attributeText = addField(composite, "attribute", row.getAttribute(), true);
		GridData grid = new GridData(GridData.FILL_BOTH);
		grid.widthHint = 256 + 128;
		grid.heightHint = 20 * 6;
		attributeText.setLayoutData(grid);
		attributeText.setFocus();
	}

	private Text addField(Composite composite, String label, String text, boolean edit) {
		createLabel(composite, label);

		int style = SWT.BORDER;
		if (edit) {
			style |= SWT.MULTI | SWT.H_SCROLL | SWT.V_SCROLL;
		}
		Text t = createText(composite, style);
		t.setText(StringUtil.nonNull(text));
		t.setEditable(edit);
		return t;
	}

	@Override
	protected boolean validate() {
		return validateParse(attributeText);
	}

	private DMDLParser parser;

	boolean validateParse(Text text) {
		String attr = text.getText();
		if (attr.trim().isEmpty()) {
			Button button = getButton(IDialogConstants.OK_ID);
			if (button != null) {
				button.setEnabled(true);
			}
			return true;
		}

		if (parser == null) {
			parser = InjectorUtil.getInstance(DMDLParser.class);
		}

		String resolved = DMDLStringUtil.replace(attr, "model_name", "property_name", "\"property description\"");
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
			Button button = getButton(IDialogConstants.OK_ID);
			if (button != null) {
				button.setEnabled(false);
			}
			text.setToolTipText(sb.toString());
			return false;
		}

		Button button = getButton(IDialogConstants.OK_ID);
		if (button != null) {
			button.setEnabled(true);
		}
		text.setToolTipText(null);
		return true;
	}

	@Override
	protected void refresh() {
		refreshOkButton();
	}

	@Override
	protected void okPressed() {
		row.setAttribute(attributeText.getText());

		super.okPressed();
	}
}
