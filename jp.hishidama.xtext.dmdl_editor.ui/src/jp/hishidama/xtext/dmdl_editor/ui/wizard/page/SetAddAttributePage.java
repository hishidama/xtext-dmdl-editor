package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import java.io.StringReader;
import java.text.MessageFormat;

import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;
import jp.hishidama.xtext.dmdl_editor.parser.antlr.DMDLParser;
import jp.hishidama.xtext.dmdl_editor.services.DMDLGrammarAccess;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SelectAddRemovePage.AddPattern;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.update.AttributeAppender4Add;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.update.AttributeAppender4Nothing;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.update.AttributeAppender4Replace;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.update.AttributeUpdater;
import jp.hishidama.xtext.dmdl_editor.util.DMDLStringUtil;

import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.parser.IParseResult;

public class SetAddAttributePage extends SetAttributePage {
	private DMDLParser parser = InjectorUtil.getInstance(DMDLParser.class);

	public SetAddAttributePage() {
		super("SetAttributePage");
		setTitle("追加する属性の指定");
		setDescription("追加する属性の内容を指定して下さい。");
	}

	@Override
	protected void createNoteArea(Group group) {
		group.setLayout(new GridLayout(2, false));

		Label label = new Label(group, SWT.NONE);
		label.setText("追加する属性には右記の変数を指定することが出来ます。\n行を選択してCtrl+Cを押すと変数名をコピーできます。");

		Table table = new Table(group, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
		table.setHeaderVisible(false);
		table.setLinesVisible(true);
		GridData grid = new GridData(GridData.GRAB_HORIZONTAL);
		grid.heightHint = 18 * 3;
		table.setLayoutData(grid);
		{
			TableColumn col = new TableColumn(table, SWT.NONE);
			col.setWidth(128 + 64);
		}
		{
			TableColumn col = new TableColumn(table, SWT.NONE);
			col.setWidth(128 + 64);
		}
		createItem(table, "モデル名", "$(modelName)");
		createItem(table, "モデル名（大文字）", "$(modelName.toUpper)");
		createItem(table, "プロパティー名", "$(name)");
		createItem(table, "プロパティー名（大文字）", "$(name.toUpper)");
		createItem(table, "プロパティー説明", "$(description)");
		table.addKeyListener(new KeyListener() {
			public void keyReleased(KeyEvent e) {
			}

			public void keyPressed(KeyEvent e) {
				if (e.character == 0x03) { // Ctrl+C
					Table table = (Table) e.getSource();
					TableItem[] items = table.getSelection();
					if (items.length > 0) {
						TableItem item = items[0];
						Clipboard clipboard = new Clipboard(e.display);
						clipboard.setContents(new Object[] { item.getData() },
								new Transfer[] { TextTransfer.getInstance() });
					}
				}
			}
		});
	}

	private void createItem(Table table, String desc, String value) {
		TableItem item = new TableItem(table, SWT.NONE);
		item.setText(0, desc);
		item.setText(1, value);
		item.setData(value);
	}

	protected String getDefaultModelAttribute(DMDLAttributeWizardDefinition def) {
		return def.getAddModelAttribute();
	}

	protected String getDefaultPropertyAttribute(DMDLAttributeWizardDefinition def) {
		return def.getAddPropertyAttribute();
	}

	@Override
	protected void validate() {
		setErrorMessage(null);
		boolean ok = true;
		ok &= validateParse("モデルの属性", modelText);
		ok &= validateParse("プロパティーの属性", propertyText);
		if (!ok) {
			return;
		}

		super.validate();
	}

	private boolean validateParse(String title, Text text) {
		String attr = text.getText();
		if (attr.trim().isEmpty()) {
			return true;
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

	@Override
	public AttributeUpdater getUpdater(SelectAddRemovePage selectPage) {
		AddPattern pattern = selectPage.getAddPattern();
		switch (pattern) {
		case ADD:
			return new AttributeAppender4Add();
		case NOTHING:
			return new AttributeAppender4Nothing();
		case REPLACE:
			return new AttributeAppender4Replace();
		default:
			throw new UnsupportedOperationException("pattern=" + pattern);
		}
	}
}
