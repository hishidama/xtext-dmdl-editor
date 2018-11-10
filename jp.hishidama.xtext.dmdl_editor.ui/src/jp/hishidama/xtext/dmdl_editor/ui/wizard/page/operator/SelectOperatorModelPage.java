package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;

import org.eclipse.core.resources.IProject;

public abstract class SelectOperatorModelPage<R extends OperatorModelRow> extends EditWizardPage {

	protected final IProject project;
	private SelectOperatorInputModelPage inputPage = null;
	private SelectOperatorViewModelPage viewPage = null;
	protected boolean joinOnly;
	protected boolean summarizeOnly;
	protected final List<String> roleList = new ArrayList<String>();
	protected ModifiableTable<R> table;

	public SelectOperatorModelPage(String pageName, IProject project) {
		super(pageName);

		this.project = project;
	}

	public void setJoinModelOnly() {
		this.joinOnly = true;
	}

	public void setSummarizeModelOnly() {
		this.summarizeOnly = true;
	}

	public void addRole(String role) {
		roleList.add(role);
	}

	public void setInputPage(SelectOperatorInputModelPage inputPage) {
		this.inputPage = inputPage;
	}

	public void setInputPage(SelectOperatorInputModelPage inputPage, SelectOperatorViewModelPage viewPage) {
		this.inputPage = inputPage;
		this.viewPage = viewPage;
	}

	String getRoleName(R row) {
		if (!roleList.isEmpty()) {
			int n = table.getIndex(row);
			if (n >= 0 && n < roleList.size()) {
				return roleList.get(n);
			}
		}
		return null;
	}

	private boolean first = true;

	@Override
	public void setVisible(boolean visible) {
		super.setVisible(visible);
		if (visible && first) {
			first = false;
			if (roleList.size() >= 1) {
				table.setSelection(0);
			}
		}
	}

	@Override
	protected String validate() {
		Map<String, Integer> nameMap = new HashMap<String, Integer>();
		class Pair {
			public String modelName;
			public int index;
		}
		Map<String, Pair> genericsMap = new HashMap<String, Pair>();

		int i = 1;
		for (R row : table.getElementList()) {
			String message = validate(row, i);
			if (message != null) {
				return message;
			}

			Integer j = nameMap.get(row.name);
			if (j != null) {
				return MessageFormat.format("変数名{2}が重複しています。（{1,number,#}行目, {0,number,#}行目）", i, j, row.name);
			}
			nameMap.put(row.name, i);

			if (row.projective) {
				Pair pair = genericsMap.get(row.genericsName);
				if (pair != null) {
					if (!pair.modelName.equals(row.modelName)) {
						return MessageFormat.format("型引数{1}の射影モデルが一致していません。（{3,number,#}行目={4}, {0,number,#}行目={2}）", i, row.genericsName, row.modelName, pair.index, pair.modelName);
					}
				} else {
					pair = new Pair();
					pair.index = i;
					pair.modelName = row.modelName;
					genericsMap.put(row.genericsName, pair);
				}
			}

			i++;
		}

		return null;
	}

	protected String validate(R row, int i) {
		if (StringUtil.isEmpty(row.name)) {
			return MessageFormat.format("変数名を入力して下さい。（{0,number,#}行目）", i);
		}
		if (StringUtil.isEmpty(row.modelName)) {
			return MessageFormat.format("データモデルを選択して下さい。（{0,number,#}行目）", i);
		}

		int j = 1;
		for (OperatorInputModelRow inputRow : getInputElementList()) {
			if (row.name.equals(inputRow.name)) {
				return MessageFormat.format("変数名{1}が入力ページにある変数名と重複しています。（{0,number,#}行目, 入力ページ{2,number,#}行目）", i, row.name, j);
			}

			j++;
		}
		j = 1;
		for (OperatorInputModelRow inputRow : getViewElementList()) {
			if (row.name.equals(inputRow.name)) {
				return MessageFormat.format("変数名{1}がビューページにある変数名と重複しています。（{0,number,#}行目, 入力ページ{2,number,#}行目）", i, row.name, j);
			}

			j++;
		}

		return null;
	}

	public List<R> getElementList() {
		return table.getElementList();
	}

	protected final List<OperatorInputModelRow> getInputElementList() {
		if (inputPage == null) {
			return Collections.emptyList();
		}
		return inputPage.getElementList();
	}

	protected final List<OperatorInputModelRow> getViewElementList() {
		if (viewPage == null) {
			return Collections.emptyList();
		}
		return viewPage.getElementList();
	}
}
