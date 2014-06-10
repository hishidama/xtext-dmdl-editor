package jp.hishidama.xtext.dmdl_editor.ui.internal;

import static jp.hishidama.eclipse_plugin.util.StringUtil.toCamelCase;
import static jp.hishidama.eclipse_plugin.util.StringUtil.toLowerCamelCase;

import java.util.HashMap;
import java.util.Map;

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
		Map<String, String> map = new HashMap<String, String>();
		map.put("modelName", modelName);
		map.put("modelDescription", DMDLStringUtil.decodeDescription(modelDesc));
		map.put("name", propName);
		map.put("description", DMDLStringUtil.decodeDescription(propDesc));
		return replaceVariable(s, map);
	}

	public static String replaceVariable(String s, Map<String, String> map) {
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
					sb.append(convert(key, map));
					pos = m + 1;
				} else {
					String key = s.substring(n + 2);
					sb.append(convert(key, map));
					break;
				}
			} else {
				sb.append(s, pos, s.length());
				break;
			}
		}
		return sb.toString();
	}

	private static String convert(String key, Map<String, String> map) {
		int n = indexOfFirstSeparator(key);
		String base, other;
		if (n >= 0) {
			base = key.substring(0, n).trim();
			other = key.substring(n + 1).trim();
		} else {
			base = key.trim();
			other = "";
		}

		String value = map.get(base);
		if (value == null) {
			return "";
		}

		if (base.equals("in")) {
			int m = other.indexOf(':');
			if (m < 0) {
				return other;
			}
			if (Boolean.parseBoolean(value)) {
				return other.substring(0, m).trim();
			} else {
				return other.substring(m + 1).trim();
			}
		}
		if (base.equals("number")) {
			int number;
			try {
				number = Integer.parseInt(other);
			} catch (Exception e) {
				number = 0;
			}
			number += Integer.parseInt(value);
			return Integer.toString(number);
		}

		if (other.equals("toUpper")) {
			return value.toUpperCase();
		} else if (other.equals("toCamelCase")) {
			return toCamelCase(value);
		} else if (other.equals("toLowerCamelCase")) {
			return toLowerCamelCase(value);
		}
		return value;
	}

	private static int indexOfFirstSeparator(String s) {
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			switch (c) {
			case '.':
			case '?':
				return i;
			default:
				break;
			}
		}
		return -1;
	}
}
