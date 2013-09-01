package jp.hishidama.xtext.dmdl_editor.ui.viewer;

import java.util.List;

import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

public class DMDLTreeContentProvider implements ITreeContentProvider {

	public DMDLTreeContentProvider() {
	}

	public Object[] getElements(Object inputElement) {
		List<?> list = (List<?>) inputElement;
		return toArray(list);
	}

	public boolean hasChildren(Object element) {
		DMDLTreeData data = (DMDLTreeData) element;
		return data.hasChildren();
	}

	public Object[] getChildren(Object parentElement) {
		DMDLTreeData data = (DMDLTreeData) parentElement;
		List<DMDLTreeData> list = data.getChildren();
		return toArray(list);
	}

	protected static Object[] toArray(List<?> list) {
		return (list != null) ? list.toArray() : null;
	}

	public Object getParent(Object element) {
		DMDLTreeData data = (DMDLTreeData) element;
		return data.getParent();
	}

	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
	}

	public void dispose() {
	}
}