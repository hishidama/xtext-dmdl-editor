package jp.hishidama.xtext.dmdl_editor.jdt.search;

import org.eclipse.search.ui.ISearchQuery;

public interface ResultLabelSearchQuery extends ISearchQuery {

	public String getResultLabel(int matchCount);
}
