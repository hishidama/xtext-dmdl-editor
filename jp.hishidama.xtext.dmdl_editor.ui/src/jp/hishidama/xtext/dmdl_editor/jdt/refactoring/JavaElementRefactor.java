package jp.hishidama.xtext.dmdl_editor.jdt.refactoring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.hishidama.eclipse_plugin.util.JdtUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.refactoring.CompilationUnitChange;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchEngine;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchParticipant;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.core.search.SearchRequestor;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.CompositeChange;
import org.eclipse.ltk.core.refactoring.TextChange;
import org.eclipse.ltk.core.refactoring.participants.RefactoringParticipant;
import org.eclipse.text.edits.MultiTextEdit;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEdit;

public class JavaElementRefactor {

	private final RefactoringParticipant participant;

	public JavaElementRefactor(RefactoringParticipant participant) {
		this.participant = participant;
	}

	protected static SearchPattern createSearchPattern(IJavaElement element) {
		int limitTo = IJavaSearchConstants.REFERENCES; // 参照箇所を検索
		int matchRule = SearchPattern.R_EXACT_MATCH | SearchPattern.R_CASE_SENSITIVE | SearchPattern.R_ERASURE_MATCH;
		return SearchPattern.createPattern(element, limitTo, matchRule);
	}

	protected static void putType(Map<String, String> typeMap, String oldFullName, String newFullName) {
		typeMap.put(oldFullName, newFullName);
		typeMap.put(StringUtil.getSimpleName(oldFullName), StringUtil.getSimpleName(newFullName));
	}

	protected Change searchElement(final IProgressMonitor pm, SearchPattern pattern, final JavaElementRefactoringFinder finder) throws CoreException {
		final List<TextChange> result = new ArrayList<TextChange>();
		final Map<ICompilationUnit, TextChange> myMap = new HashMap<ICompilationUnit, TextChange>();

		SearchParticipant[] participants = { SearchEngine.getDefaultSearchParticipant() };
		IJavaSearchScope scope = SearchEngine.createWorkspaceScope();
		SearchRequestor requestor = new SearchRequestor() {
			@Override
			public void acceptSearchMatch(SearchMatch match) throws CoreException {
				ICompilationUnit cu = JdtUtil.getCompilationUnit(match.getElement());
				if (cu == null) {
					return;
				}
				// cu = cu.getPrimary().getWorkingCopy(pm);

				List<ReplaceEdit> editList = finder.getEditList(pm, cu, match.getOffset());
				if (editList.isEmpty()) {
					return;
				}

				TextChange change = myMap.get(cu);
				if (change == null) {
					change = participant.getTextChange(cu);
					if (change == null) {
						change = new CompilationUnitChange(cu.getElementName(), cu);
						change.setEdit(new MultiTextEdit());
						result.add(change);
					}
					myMap.put(cu, change);
				}

				for (TextEdit edit : editList) {
					// パッケージ名の改名で、既存機能によるリファクタリングでimport文を削除して追加される場合に、文字数が短くなる改名だと範囲が被ることがある。
					// そのままだと例外が発生するので、事前に判定する。
					// ただし、必要なeditが登録できないので、リファクタリング結果は一部が失敗した状態になる。
					// FIXME editの範囲が被らないようにするにはどうすればよいか？
					if (!covers(change, edit)) {
						change.addEdit(edit);
					}
				}
			}

			private boolean covers(TextChange change, TextEdit edit) {
				TextEdit changeEdit = change.getEdit();
				for (TextEdit child : changeEdit.getChildren()) {
					if (child.covers(edit)) {
						return true;
					}
				}
				return false;
			}
		};

		// 検索の実行
		new SearchEngine().search(pattern, participants, scope, requestor, pm);

		if (result.isEmpty()) {
			return null;
		}
		if (result.size() == 1) {
			return result.get(0);
		}

		CompositeChange compositeChange = new CompositeChange("composite", result.toArray(new TextChange[result.size()]));
		return compositeChange;
	}
}
