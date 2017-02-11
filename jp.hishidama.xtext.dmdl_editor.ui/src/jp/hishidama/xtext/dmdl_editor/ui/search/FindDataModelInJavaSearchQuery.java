package jp.hishidama.xtext.dmdl_editor.ui.search;

import java.text.MessageFormat;

import jp.hishidama.xtext.dmdl_editor.jdt.search.JavaElementSearchResult;
import jp.hishidama.xtext.dmdl_editor.jdt.search.ResultLabelSearchQuery;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;

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

public class FindDataModelInJavaSearchQuery implements ResultLabelSearchQuery {
	private final FindDataModelInJavaSearchData data;

	private JavaElementSearchResult searchResult;

	public FindDataModelInJavaSearchQuery(FindDataModelInJavaSearchData data) {
		this.data = data;
	}

	public IStatus run(IProgressMonitor monitor) throws OperationCanceledException {
		JavaElementSearchResult result = getSearchResult();
		result.removeAll();

		SearchPattern pattern = data.createSearchPattern(monitor);
		if (pattern == null) {
			return LogUtil.infoStatus("FindDataModelInJavaSearchQuery: createSearchPattern() returns null.");
		}
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
		String name = data.getSearchTypeName();
		if (name != null) {
			return name;
		}
		if (data.getPropertyName() == null) {
			return data.getModelName();
		}
		return MessageFormat.format("{0}.{1}", data.getModelName(), data.getPropertyName());
	}

	public String getResultLabel(int matchCount) {
		String ex;
		if (data.isIncludeHierarchyProperties()) {
			ex = " include hierarchy";
		} else {
			ex = "";
		}
		return MessageFormat.format("''{0}''{3} - {1} found in {2}", getLabel(), matchCount,
				data.getScopeDescription(), ex);
	}

	public boolean canRerun() {
		return true;
	}

	public boolean canRunInBackground() {
		return true;
	}

	public JavaElementSearchResult getSearchResult() {
		if (searchResult == null) {
			searchResult = new JavaElementSearchResult(this);
		}
		return searchResult;
	}
}
