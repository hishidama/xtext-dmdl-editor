package jp.hishidama.xtext.dmdl_editor.jdt.search;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IAnnotation;
import org.eclipse.jdt.core.IMemberValuePair;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchRequestor;

public class MasterSelectionSearchRequestor extends SearchRequestor {

	private final IMethod masterSelectionMethod;
	private final JavaElementSearchResult result;

	public MasterSelectionSearchRequestor(IMethod method, JavaElementSearchResult result) {
		this.masterSelectionMethod = method;
		this.result = result;
	}

	@Override
	public void acceptSearchMatch(SearchMatch match) throws CoreException {
		IMethod method = (IMethod) match.getElement();
		accept(method, match);
	}

	private void accept(IMethod method, SearchMatch match) throws JavaModelException {
		for (IAnnotation a : method.getAnnotations()) {
			for (IMemberValuePair member : a.getMemberValuePairs()) {
				if ("selection".equals(member.getMemberName())) {
					Object value = member.getValue();
					if (value instanceof String) {
						String s = (String) value;
						if (s.equals(masterSelectionMethod.getElementName())) {
							result.addMatch(match.getElement(), match.getOffset(), match.getLength());
						}
					}
				}
			}
		}
	}
}
