package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import java.text.MessageFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.eclipse_plugin.jface.ModifiableTable;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.eclipse_plugin.wizard.page.EditWizardPage;

import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;

public class SetArgumentPage extends EditWizardPage {

	private IJavaProject javaProject;
	private SelectOperatorInputModelPage inputPage;
	private SelectOperatorViewModelPage viewPage;
	private SelectOperatorOutputModelPage outputPage;
	private List<ArgumentRow> initList;

	private ArgumentTable table;

	public SetArgumentPage(IJavaProject javaProject, OperatorType opType) {
		super("SetArgumentPage");

		if (opType != null) {
			setTitle(MessageFormat.format("{0}の値引数の指定", opType.getName()));
		} else {
			setTitle("値引数の指定");
		}
		setDescription("値引数を使用する場合、値引数を指定して下さい。");

		this.javaProject = javaProject;
	}

	public void setInputPage(SelectOperatorInputModelPage inputPage, SelectOperatorViewModelPage viewPage, SelectOperatorOutputModelPage outputPage) {
		this.inputPage = inputPage;
		this.viewPage = viewPage;
		this.outputPage = outputPage;
	}

	public void init(List<ArgumentRow> initList) {
		this.initList = initList;
	}

	@Override
	protected Composite createComposite(Composite parent) {
		Composite composite = new Composite(parent, SWT.NONE);
		composite.setFont(parent.getFont());

		int nColumns = 2;

		GridLayout layout = new GridLayout();
		layout.numColumns = nColumns;
		composite.setLayout(layout);

		createLabel(composite, "argument:");
		table = new ArgumentTable(composite);
		table.addColumn("name", 128, SWT.NONE);
		table.addColumn("type", 128, SWT.NONE);
		table.addColumn("comment", 256, SWT.NONE);

		createLabel(composite, "");
		Composite field = new Composite(composite, SWT.NONE);
		// field.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		field.setLayout(new FillLayout(SWT.HORIZONTAL));
		table.createButtonArea(field);

		if (initList != null) {
			for (ArgumentRow row : initList) {
				table.addItem(row.clone());
			}
		}
		table.refresh();

		return composite;
	}

	@Override
	protected String validate() {
		Map<String, Integer> nameMap = new HashMap<String, Integer>();

		int i = 1;
		for (ArgumentRow row : table.getElementList()) {
			String message = validate(row, i);
			if (message != null) {
				return message;
			}

			Integer j = nameMap.get(row.name);
			if (j != null) {
				return MessageFormat.format("変数名{2}が重複しています。（{1,number,#}行目, {0,number,#}行目）", i, j, row.name);
			}
			nameMap.put(row.name, i);

			i++;
		}

		return null;
	}

	protected String validate(ArgumentRow row, int i) {
		if (StringUtil.isEmpty(row.name)) {
			return MessageFormat.format("変数名を入力して下さい。（{0,number,#}行目）", i);
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
				return MessageFormat.format("変数名{1}がビューページにある変数名と重複しています。（{0,number,#}行目, ビューページ{2,number,#}行目）", i, row.name, j);
			}

			j++;
		}
		j = 1;
		for (OperatorOutputModelRow inputRow : getOutputElementList()) {
			if (row.name.equals(inputRow.name)) {
				return MessageFormat.format("変数名{1}が出力ページにある変数名と重複しています。（{0,number,#}行目, 出力ページ{2,number,#}行目）", i, row.name, j);
			}

			j++;
		}

		return null;
	}

	protected class ArgumentTable extends ModifiableTable<ArgumentRow> {

		public ArgumentTable(Composite parent) {
			super(parent, SWT.BORDER | SWT.MULTI | SWT.FULL_SELECTION);
		}

		@Override
		protected String getText(ArgumentRow element, int columnIndex) {
			switch (columnIndex) {
			case 0:
				return element.name;
			case 1:
				return element.type;
			case 2:
				return element.comment;
			default:
				throw new UnsupportedOperationException("columnIndex=" + columnIndex);
			}
		}

		@Override
		protected void doAdd() {
			ArgumentRow element = createElement();
			EditArgumentDialog dialog = new EditArgumentDialog(getShell(), javaProject, element);
			if (dialog.open() == Window.OK) {
				super.doAdd(element);
			}
		}

		@Override
		protected ArgumentRow createElement() {
			return new ArgumentRow();
		}

		@Override
		protected void editElement(ArgumentRow element) {
			EditArgumentDialog dialog = new EditArgumentDialog(getShell(), javaProject, element);
			dialog.open();
		}

		@Override
		public void refresh() {
			super.refresh();
			validate(true);
		}
	}

	public List<ArgumentRow> getArgumentList() {
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

	protected final List<OperatorOutputModelRow> getOutputElementList() {
		if (outputPage == null) {
			return Collections.emptyList();
		}
		return outputPage.getElementList();
	}

	public List<ArgumentRow> getInitList() {
		return initList;
	}
}
