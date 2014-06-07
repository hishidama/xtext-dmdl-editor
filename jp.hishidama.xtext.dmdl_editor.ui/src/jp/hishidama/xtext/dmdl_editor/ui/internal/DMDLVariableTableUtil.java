package jp.hishidama.xtext.dmdl_editor.ui.internal;

import static jp.hishidama.eclipse_plugin.util.StringUtil.toCamelCase;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.util.DMDLStringUtil;

import org.eclipse.swt.SWT;
import org.eclipse.swt.dnd.Clipboard;
import org.eclipse.swt.dnd.TextTransfer;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

public class DMDLVariableTableUtil {

	public static void createVariableTable(Composite composite, boolean hasModel, boolean hasProperty) {
		Table table = new Table(composite, SWT.BORDER | SWT.SINGLE | SWT.FULL_SELECTION);
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

		if (hasModel) {
			createItem(table, "モデル名", "$(modelName)");
			createItem(table, "モデル名（大文字）", "$(modelName.toUpper)");
			createItem(table, "モデル名（CamelCase）", "$(modelName.toCamelCase)");
			createItem(table, "モデル説明", "$(modelDescription)");
		}
		if (hasProperty) {
			createItem(table, "プロパティー名", "$(name)");
			createItem(table, "プロパティー名（大文字）", "$(name.toUpper)");
			createItem(table, "プロパティー名（CamelCase）", "$(name.toCamelCase)");
			createItem(table, "プロパティー説明", "$(description)");
		}

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

	private static void createItem(Table table, String desc, String value) {
		TableItem item = new TableItem(table, SWT.NONE);
		item.setText(0, desc);
		item.setText(1, value);
		item.setData(value);
	}

	public static String replaceVariable(String s, ModelDefinition model, Property property) {
		String modelName = (model != null) ? model.getName() : null;
		String modelDesc = (model != null) ? model.getDescription() : null;
		String propName = (property != null) ? property.getName() : null;
		String propDesc = (property != null) ? property.getDescription() : null;
		return replaceVariable(s, modelName, modelDesc, propName, propDesc);
	}

	public static String replaceVariable(String s, String modelName, String modelDesc, String propName, String propDesc) {
		if (s == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder(s.length());
		for (int pos = 0;;) {
			int n = s.indexOf("$(", pos);
			if (n >= 0) {
				sb.append(s, pos, n);
				pos = n;
				int m = s.indexOf(")", pos);
				if (m >= 0) {
					String key = s.substring(n + 2, m);
					sb.append(convert(key, modelName, modelDesc, propName, propDesc));
					pos = m + 1;
				} else {
					String key = s.substring(n + 2);
					sb.append(convert(key, modelName, modelDesc, propName, propDesc));
					break;
				}
			} else {
				sb.append(s, pos, s.length());
				break;
			}
		}
		return sb.toString();
	}

	private static String convert(String key, String modelName, String modelDescription, String propName,
			String propDesc) {
		String s;
		if ("modelName".equals(key)) {
			s = modelName;
		} else if ("modelName.toUpper".equals(key)) {
			s = (modelName != null) ? modelName.toUpperCase() : null;
		} else if ("modelName.toCamelCase".equals(key)) {
			s = toCamelCase(modelName);
		} else if ("name".equals(key)) {
			s = propName;
		} else if ("modelDescription".equals(key)) {
			if (StringUtil.nonEmpty(modelDescription)) {
				s = DMDLStringUtil.decodeDescription(modelDescription);
			} else {
				s = modelName;
			}
		} else if ("name.toUpper".equals(key)) {
			s = (propName != null) ? propName.toUpperCase() : null;
		} else if ("name.toCamelCase".equals(key)) {
			s = toCamelCase(propName);
		} else if ("description".equals(key)) {
			if (StringUtil.nonEmpty(propDesc)) {
				s = DMDLStringUtil.decodeDescription(propDesc);
			} else {
				s = propName;
			}
		} else {
			s = "";
		}
		return (s != null) ? s : "";
	}
}
