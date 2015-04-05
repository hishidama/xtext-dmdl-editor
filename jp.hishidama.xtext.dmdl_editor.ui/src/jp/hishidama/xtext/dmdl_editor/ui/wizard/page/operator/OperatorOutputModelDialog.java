package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator;

import org.eclipse.core.resources.IProject;
import org.eclipse.swt.widgets.Shell;

public class OperatorOutputModelDialog extends OperatorModelDialog<OperatorOutputModelRow> {

	public OperatorOutputModelDialog(Shell parentShell, IProject project, String role, OperatorOutputModelRow row,
			boolean joinOnly, boolean summarizeOnly) {
		super(parentShell, "出力データモデル選択", project, role, row, joinOnly, summarizeOnly);
	}
}
