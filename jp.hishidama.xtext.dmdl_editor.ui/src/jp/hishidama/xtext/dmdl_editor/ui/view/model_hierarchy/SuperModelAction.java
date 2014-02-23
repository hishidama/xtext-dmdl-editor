package jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy;

import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jface.action.Action;

/**
 * @see org.eclipse.jdt.internal.ui.typehierarchy.ToggleViewAction
 */
@SuppressWarnings("restriction")
public class SuperModelAction extends Action {

	private ModelHierarchyView view;

	public SuperModelAction(ModelHierarchyView view, boolean initValue) {
		super("Show the Super Model Hierarchy", AS_RADIO_BUTTON);
		setDescription("Show the Super Model Hierarchy");
		setToolTipText("Show the Super Model Hierarchy");

		JavaPluginImages.setLocalImageDescriptors(this, "super_co.gif"); //$NON-NLS-1$

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
