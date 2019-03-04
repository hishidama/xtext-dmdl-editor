package jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy.property;

import jp.hishidama.xtext.dmdl_editor.ui.viewer.DMDLTreeLabelProvider;

public class IndexPropertyLabelProvider extends DMDLTreeLabelProvider {

	@Override
	public String getText(Object element) {
		String text = super.getText(element);

		if (element instanceof IndexProperty) {
			IndexProperty property = (IndexProperty) element;
			int row = property.getRowNumber();
			if (row >= 1) {
				return "(" + row + ") " + text;
			}
			return text;
		}

		return text;
	}
}
