package jp.hishidama.xtext.dmdl_editor.jdt.search;

import java.text.MessageFormat;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.OperationCanceledException;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchParticipant;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;
import org.eclipse.jdt.internal.ui.search.JavaSearchScopeFactory;

@SuppressWarnings("restriction")
public class MasterSelectionSearchQuery implements ResultLabelSearchQuery {

	private final IMethod masterSelectionMethod;

	private JavaElementSearchResult searchResult;

	public MasterSelectionSearchQuery(IMethod method) {
		this.masterSelectionMethod = method;
	}

	public IStatus run(IProgressMonitor monitor) throws OperationCanceledException {
		JavaElementSearchResult result = getSearchResult();
		result.removeAll();

		SearchPattern pattern = createSearchPattern();
		SearchParticipant[] participants = { SearchEngine.getDefaultSearchParticipant() };
		IJavaSearchScope scope = getScope();
		SearchRequestor requestor = new MasterSelectionSearchRequestor(masterSelectionMethod, result);
		try {
			new SearchEngine().search(pattern, participants, scope, requestor, monitor);
		} catch (CoreException e) {
			return e.getStatus();
		}

		return Status.OK_STATUS;
	}

	private SearchPattern createSearchPattern() {
		int searchFor = IJavaSearchConstants.METHOD;
		int limitTo = IJavaSearchConstants.DECLARATIONS;
		int matchRule = SearchPattern.R_PATTERN_MATCH;
		return SearchPattern.createPattern("*", searchFor, limitTo, matchRule);
	}

	private IJavaSearchScope getScope() {
		final int INCLUDE_MASK = JavaSearchScopeFactory.PROJECTS | JavaSearchScopeFactory.SOURCES;

		JavaSearchScopeFactory factory = JavaSearchScopeFactory.getInstance();
		IJavaElement[] elements = { masterSelectionMethod.getDeclaringType() };
		return factory.createJavaSearchScope(elements, INCLUDE_MASK);
	}

	public String getLabel() {
		return masterSelectionMethod.getElementName();
	}

	public String getResultLabel(int matchCount) {
		return MessageFormat.format("''{0}'' - {1} found in {2}", getLabel(), matchCount, masterSelectionMethod
				.getDeclaringType().getElementName());
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
