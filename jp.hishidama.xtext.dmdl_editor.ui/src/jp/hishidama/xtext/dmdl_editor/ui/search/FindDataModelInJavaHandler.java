package jp.hishidama.xtext.dmdl_editor.ui.search;

import java.util.EnumSet;
import java.util.Set;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.util.JdtUtil;
import jp.hishidama.eclipse_plugin.util.ProjectUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelProperty;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.jdt.search.OperatorMethodSearchHandler;
import jp.hishidama.xtext.dmdl_editor.ui.search.FindDataModelInJavaSearchData.SearchClass;
import jp.hishidama.xtext.dmdl_editor.ui.search.FindDataModelInJavaSearchData.SearchHierarchy;
import jp.hishidama.xtext.dmdl_editor.ui.search.FindDataModelInJavaSearchData.SearchIn;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
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
			execute(event, set, null, null);
		} else if ("main-operator".equalsIgnoreCase(action)) {
			Set<SearchIn> set = EnumSet.of(SearchIn.MAIN);
			execute(event, set, EnumSet.of(SearchClass.OPERATOR), null);
		} else if ("main-operator-hierarchy".equalsIgnoreCase(action)) {
			Set<SearchIn> set = EnumSet.of(SearchIn.MAIN);
			execute(event, set, EnumSet.of(SearchClass.OPERATOR),
					EnumSet.of(SearchHierarchy.PROJECTIVE, SearchHierarchy.SUB));
		} else if ("main-flow".equalsIgnoreCase(action)) {
			Set<SearchIn> set = EnumSet.of(SearchIn.MAIN);
			execute(event, set, EnumSet.of(SearchClass.JOBFLOW, SearchClass.FLOWPART), null);
		} else if ("main-porter".equalsIgnoreCase(action)) {
			Set<SearchIn> set = EnumSet.of(SearchIn.MAIN);
			execute(event, set, EnumSet.of(SearchClass.IMPORTER, SearchClass.EXPORTER), null);
		} else if ("src".equalsIgnoreCase(action)) {
			Set<SearchIn> set = EnumSet.of(SearchIn.MAIN, SearchIn.TEST);
			execute(event, set, null, null);
		} else if ("all".equalsIgnoreCase(action)) {
			execute(event, null, null, null);
		} else {
			openSearchDialog();
		}
		return null;
	}

	private void openSearchDialog() {
		IWorkbenchWindow window = PlatformUI.getWorkbench().getActiveWorkbenchWindow();
		NewSearchUI.openSearchDialog(window, FindDataModelInJavaPage.ID);
	}

	private void execute(final ExecutionEvent event, Set<SearchIn> searchIn, Set<SearchClass> searchClass,
			Set<SearchHierarchy> searchHierarchy) throws ExecutionException {
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
				findReferences(event, modelName, propertyName, searchIn, searchClass, searchHierarchy);
			} else {
				String modelName = find.getModel().getName();
				findReferences(event, modelName, null, searchIn, searchClass, searchHierarchy);
			}
			return;
		}

		{
			IType type = findJobFlowType(event);
			if (type != null) {
				findReferences(type, searchIn);
				return;
			}
		}
	}

	private IType findJobFlowType(ExecutionEvent event) {
		IJavaElement element = JdtUtil.getJavaElement(event);
		if (element instanceof IMethod) {
			IMethod method = (IMethod) element;
			element = method.getDeclaringType();
		}
		if (element instanceof IType) {
			IType type = (IType) element;
			if (FlowUtil.isJobFlow(type)) {
				return type;
			}
		}
		return null;
	}

	private void findReferences(ExecutionEvent event, String modelName, String propertyName, Set<SearchIn> searchIn,
			Set<SearchClass> searchClass, Set<SearchHierarchy> searchHierarchy) {
		IProject project = ProjectUtil.getProject(event);

		FindDataModelInJavaSearchData data = new FindDataModelInJavaSearchData(project, modelName, propertyName);
		data.initializeScope(searchIn);
		data.initializeSearchClass(searchClass);
		data.initializeSearchHierarchy(searchHierarchy);
		ISearchQuery query = new FindDataModelInJavaSearchQuery(data);

		NewSearchUI.activateSearchResultView();
		NewSearchUI.runQueryInBackground(query);
	}

	private void findReferences(IType type, Set<SearchIn> searchIn) {
		FindDataModelInJavaSearchData data = new FindDataModelInJavaSearchData(type);
		data.initializeScope(searchIn);
		data.initializeSearchClass(null);
		data.initializeSearchHierarchy(null);
		ISearchQuery query = new FindDataModelInJavaSearchQuery(data);

		NewSearchUI.activateSearchResultView();
		NewSearchUI.runQueryInBackground(query);
	}
}
