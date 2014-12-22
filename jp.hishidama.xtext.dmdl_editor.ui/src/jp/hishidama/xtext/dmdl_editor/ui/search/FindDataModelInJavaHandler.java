package jp.hishidama.xtext.dmdl_editor.ui.search;

import java.util.EnumSet;
import java.util.Set;

import jp.hishidama.eclipse_plugin.util.ProjectUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelProperty;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.jdt.search.OperatorMethodSearchHandler;
import jp.hishidama.xtext.dmdl_editor.ui.search.FindDataModelInJavaSearchData.SearchClass;
import jp.hishidama.xtext.dmdl_editor.ui.search.FindDataModelInJavaSearchData.SearchIn;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.search.ui.ISearchQuery;
import org.eclipse.search.ui.NewSearchUI;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.HandlerUtil;

//@see org.eclipse.xtext.ui.editor.findrefs.FindReferencesHandler
public class FindDataModelInJavaHandler extends AbstractHandler {

	public Object execute(ExecutionEvent event) throws ExecutionException {
		String action = event.getParameter("jp.hishidama.xtext.dmdl_editor.command.findDataModelInJava.action");
		if ("main".equalsIgnoreCase(action)) {
			Set<SearchIn> set = EnumSet.of(SearchIn.MAIN);
			execute(event, set, null);
		} else if ("main-operator".equalsIgnoreCase(action)) {
			Set<SearchIn> set = EnumSet.of(SearchIn.MAIN);
			execute(event, set, EnumSet.of(SearchClass.OPERATOR));
		} else if ("main-flow".equalsIgnoreCase(action)) {
			Set<SearchIn> set = EnumSet.of(SearchIn.MAIN);
			execute(event, set, EnumSet.of(SearchClass.JOBFLOW, SearchClass.JOBFLOW));
		} else if ("main-porter".equalsIgnoreCase(action)) {
			Set<SearchIn> set = EnumSet.of(SearchIn.MAIN);
			execute(event, set, EnumSet.of(SearchClass.IMPORTER, SearchClass.EXPORTER));
		} else if ("src".equalsIgnoreCase(action)) {
			Set<SearchIn> set = EnumSet.of(SearchIn.MAIN, SearchIn.TEST);
			execute(event, set, null);
		} else if ("all".equalsIgnoreCase(action)) {
			execute(event, null, null);
		} else {
			open();
		}
		return null;
	}

	private void open() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		NewSearchUI.openSearchDialog(window, FindDataModelInJavaPage.ID);
	}

	private void execute(final ExecutionEvent event, Set<SearchIn> searchIn, Set<SearchClass> searchClass)
			throws ExecutionException {
		{
			OperatorMethodSearchHandler handler = new OperatorMethodSearchHandler();
			Object target = handler.execute(event);
			if (target != null) {
				return;
			}
		}

		ISelection selection = HandlerUtil.getCurrentSelection(event);
		ModelProperty find = ModelUiUtil.findModel(selection);
		if (find == null) {
			IEditorPart editor = HandlerUtil.getActiveEditor(event);
			find = ModelUiUtil.findInEditorSelection(editor);
		}
		if (find != null) {
			if (find.hasProperty()) {
				String modelName = find.getModel().getName();
				String propertyName = find.getProperty().getName();
				findReferences(event, modelName, propertyName, searchIn, searchClass);
			} else {
				String modelName = find.getModel().getName();
				findReferences(event, modelName, null, searchIn, searchClass);
			}
		}
	}

	private void findReferences(ExecutionEvent event, String modelName, String propertyName, Set<SearchIn> searchIn,
			Set<SearchClass> searchClass) {
		IProject project = ProjectUtil.getProject(event);

		FindDataModelInJavaSearchData data = new FindDataModelInJavaSearchData(project, modelName, propertyName);
		data.initializeScope(searchIn);
		data.initializeSearchClass(searchClass);
		ISearchQuery query = new FindDataModelInJavaSearchQuery(data);

		NewSearchUI.activateSearchResultView();
		NewSearchUI.runQueryInBackground(query);
	}
}
