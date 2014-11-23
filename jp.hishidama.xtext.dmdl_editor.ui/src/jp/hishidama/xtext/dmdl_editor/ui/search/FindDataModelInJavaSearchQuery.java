package jp.hishidama.xtext.dmdl_editor.ui.search;

import java.text.MessageFormat;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchParticipant;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;
import org.eclipse.search.ui.ISearchQuery;

public class FindDataModelInJavaSearchQuery implements ISearchQuery {
	private final FindDataModelInJavaSearchData data;

	private FindDataModelInJavaSearchResult searchResult;

	public FindDataModelInJavaSearchQuery(FindDataModelInJavaSearchData data) {
		this.data = data;
	}

	public IStatus run(IProgressMonitor monitor) throws OperationCanceledException {
		FindDataModelInJavaSearchResult result = getSearchResult();
		result.removeAll();

		SearchPattern pattern = data.createSearchPattern();
		SearchParticipant[] participants = { SearchEngine.getDefaultSearchParticipant() };
		IJavaSearchScope scope = data.getScope();
		SearchRequestor requestor = new FindDataModelInJavaSearchRequestor(data, result);
		try {
			new SearchEngine().search(pattern, participants, scope, requestor, monitor);
		} catch (CoreException e) {
			return e.getStatus();
		}

		return Status.OK_STATUS;
	}

	public String getLabel() {
		if (data.getPropertyName() == null) {
			return data.getModelName();
		}
		return MessageFormat.format("{0}.{1}", data.getModelName(), data.getPropertyName());
	}

	public String getResultLabel(int matchCount) {
		return MessageFormat.format("''{0}'' - {1} found in {2}", getLabel(), matchCount, data.getScopeDescription());
	}

	public boolean canRerun() {
		return true;
	}

	public boolean canRunInBackground() {
		return true;
	}

	public FindDataModelInJavaSearchResult getSearchResult() {
		if (searchResult == null) {
			searchResult = new FindDataModelInJavaSearchResult(this);
		}
		return searchResult;
	}
}
