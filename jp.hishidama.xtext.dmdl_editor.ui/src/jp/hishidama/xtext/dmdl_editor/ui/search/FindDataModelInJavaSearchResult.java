package jp.hishidama.xtext.dmdl_editor.ui.search;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IParent;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.search.ui.ISearchQuery;
import org.eclipse.search.ui.text.AbstractTextSearchResult;
import org.eclipse.search.ui.text.IEditorMatchAdapter;
import org.eclipse.search.ui.text.IFileMatchAdapter;
import org.eclipse.search.ui.text.Match;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;

public class FindDataModelInJavaSearchResult extends AbstractTextSearchResult implements IFileMatchAdapter,
		IEditorMatchAdapter {

	private final FindDataModelInJavaSearchQuery query;

	public FindDataModelInJavaSearchResult(FindDataModelInJavaSearchQuery query) {
		this.query = query;
	}

	public void addMatch(Object element, int offset, int length) {
		super.addMatch(new Match(element, offset, length));
	}

	public String getLabel() {
		return query.getResultLabel(getMatchCount());
	}

	public String getTooltip() {
		return getLabel();
	}

	public ImageDescriptor getImageDescriptor() {
		return null;
	}

	public ISearchQuery getQuery() {
		return query;
	}

	@Override
	public IEditorMatchAdapter getEditorMatchAdapter() {
		return this;
	}

	@Override
	public IFileMatchAdapter getFileMatchAdapter() {
		return this;
	}

	// IFileMatchAdapter

	public Match[] computeContainedMatches(AbstractTextSearchResult result, IFile file) {
		return getMatches(file);
	}

	public IFile getFile(Object element) {
		if (element instanceof IJavaElement) {
			IJavaElement javaElement = (IJavaElement) element;
			return (IFile) javaElement.getResource();
		}
		if (element instanceof IEditorPart) {
			IEditorPart editor = (IEditorPart) element;
			IEditorInput input = editor.getEditorInput();
			if (input instanceof IFileEditorInput) {
				return ((IFileEditorInput) input).getFile();
			}
		}
		return null;
	}

	// IEditorMatchAdapter

	public boolean isShownInEditor(Match match, IEditorPart editor) {
		IFile editorFile = getFile(editor);
		if (editorFile == null) {
			return false;
		}
		IFile file = getFile(match.getElement());
		return editorFile.equals(file);
	}

	public Match[] computeContainedMatches(AbstractTextSearchResult result, IEditorPart editor) {
		IFile file = getFile(editor);
		return getMatches(file);
	}

	protected Match[] getMatches(IFile file) {
		IJavaElement element = JavaCore.create(file);
		Set<Match> set = new HashSet<Match>();

		collectMatches(set, element);

		return set.toArray(new Match[set.size()]);
	}

	private void collectMatches(Set<Match> set, IJavaElement element) {
		if (element == null) {
			return;
		}

		Match[] matches = super.getMatches(element);
		for (Match match : matches) {
			set.add(match);
		}

		if (element instanceof IParent) {
			try {
				IJavaElement[] children = ((IParent) element).getChildren();
				for (IJavaElement child : children) {
					collectMatches(set, child);
				}
			} catch (JavaModelException e) {
				// do nothing
			}
		}
	}
}
