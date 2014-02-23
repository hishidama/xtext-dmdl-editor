package jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy;

import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jface.action.Action;

/**
 * @see org.eclipse.jdt.internal.ui.typehierarchy.ToggleViewAction
 */
@SuppressWarnings("restriction")
public class SubModelAction extends Action {

	private ModelHierarchyView view;

	public SubModelAction(ModelHierarchyView view, boolean initValue) {
		super("Show the Sub Model Hierarchy", AS_RADIO_BUTTON);
		setDescription("Show the Sub Model Hierarchy");
		setToolTipText("Show the Sub Model Hierarchy");

		JavaPluginImages.setLocalImageDescriptors(this, "sub_co.gif"); //$NON-NLS-1$

		this.view = view;

		setChecked(initValue);
	}

	@Override
	public void run() {
		if (isChecked()) {
			view.refreshTree();
		}
	}
}
