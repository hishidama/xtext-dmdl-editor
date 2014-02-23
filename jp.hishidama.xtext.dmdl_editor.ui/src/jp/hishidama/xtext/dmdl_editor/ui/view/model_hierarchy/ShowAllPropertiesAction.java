package jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy;

import org.eclipse.jdt.internal.ui.JavaPluginImages;
import org.eclipse.jface.action.Action;

/**
 * @see org.eclipse.jdt.internal.ui.typehierarchy.ShowInheritedMembersAction
 */
@SuppressWarnings("restriction")
public class ShowAllPropertiesAction extends Action {

	private ModelHierarchyView view;

	public ShowAllPropertiesAction(ModelHierarchyView view, boolean initValue) {
		super("Show All Properties");
		setDescription("Show All Properties");
		setToolTipText("Show All Properties");

		JavaPluginImages.setLocalImageDescriptors(this, "inher_co.gif"); //$NON-NLS-1$

		this.view = view;

		setChecked(initValue);
	}

	@Override
	public void run() {
		boolean checked = isChecked();
		view.setShowAllProperties(checked);
	}
}
