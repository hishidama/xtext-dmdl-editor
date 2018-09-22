package jp.hishidama.xtext.dmdl_editor.jdt.search;

import java.util.List;

import org.eclipse.jdt.core.search.SearchPattern;

public class SearchPatternUtil {

	public static SearchPattern createOrPattern(List<SearchPattern> list) {
		SearchPattern result = null;
		for (SearchPattern pattern : list) {
			if (result == null) {
				result = pattern;
			} else {
				result = SearchPattern.createOrPattern(result, pattern);
			}
		}
		return result;
	}
}
