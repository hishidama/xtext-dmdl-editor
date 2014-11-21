package jp.hishidama.xtext.dmdl_editor.ui.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.OperatorUtil;
import jp.hishidama.eclipse_plugin.jdt.util.TypeUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.internal.ui.search.JavaSearchScopeFactory;
import org.eclipse.jdt.internal.ui.search.SearchUtil;
import org.eclipse.search.ui.ISearchPageContainer;
import org.eclipse.ui.IWorkingSet;

@SuppressWarnings("restriction")
public class FindDataModelInJavaSearchData {
	private IProject project;
	private String modelName;
	private String propertyName;

	private IJavaSearchScope scope;
	private String scopeDescription;
	private List<String> methodPattern;

	public FindDataModelInJavaSearchData(IProject project, String modelName, String propertyName) {
		this.project = project;
		this.modelName = modelName;
		this.propertyName = propertyName;
	}

	// @see org.eclipse.jdt.internal.ui.search.JavaSearchPage#performNewSearch()
	public void initializeScope(ISearchPageContainer container) {
		int includeMask = JavaSearchScopeFactory.PROJECTS | JavaSearchScopeFactory.SOURCES;
		JavaSearchScopeFactory factory = JavaSearchScopeFactory.getInstance();

		switch (container.getSelectedScope()) {
		case ISearchPageContainer.WORKSPACE_SCOPE:
			scopeDescription = factory.getWorkspaceScopeDescription(includeMask);
			scope = factory.createWorkspaceScope(includeMask);
			break;
		case ISearchPageContainer.SELECTION_SCOPE:
			IJavaElement[] javaElements = new IJavaElement[0];
			if (container.getActiveEditorInput() != null) {
				IFile file = (IFile) container.getActiveEditorInput().getAdapter(IFile.class);
				if (file != null && file.exists()) {
					IJavaElement javaElement = JavaCore.create(file);
					if (javaElement != null)
						javaElements = new IJavaElement[] { javaElement };
				}
			} else
				javaElements = factory.getJavaElements(container.getSelection());
			scope = factory.createJavaSearchScope(javaElements, includeMask);
			scopeDescription = factory.getSelectionScopeDescription(javaElements, includeMask);
			break;
		case ISearchPageContainer.SELECTED_PROJECTS_SCOPE: {
			String[] projectNames = container.getSelectedProjectNames();
			scope = factory.createJavaProjectSearchScope(projectNames, includeMask);
			scopeDescription = factory.getProjectScopeDescription(projectNames, includeMask);
			break;
		}
		case ISearchPageContainer.WORKING_SET_SCOPE: {
			IWorkingSet[] workingSets = container.getSelectedWorkingSets();
			// should not happen - just to be sure
			if (workingSets == null || workingSets.length < 1) {
				return;
			}
			scopeDescription = factory.getWorkingSetScopeDescription(workingSets, includeMask);
			scope = factory.createJavaSearchScope(workingSets, includeMask);
			SearchUtil.updateLRUWorkingSets(workingSets);
			break;
		}
		}
	}

	public void initializeWorkspaceScope() {
		int includeMask = JavaSearchScopeFactory.PROJECTS | JavaSearchScopeFactory.SOURCES;
		JavaSearchScopeFactory factory = JavaSearchScopeFactory.getInstance();
		scopeDescription = factory.getWorkspaceScopeDescription(includeMask);
		scope = factory.createWorkspaceScope(includeMask);
	}

	public void initializeMethodPattern(List<String> methodPattern) {
		this.methodPattern = methodPattern;
	}

	public IProject getProject() {
		return project;
	}

	public String getModelName() {
		return modelName;
	}

	private String modelClassName;

	public String getModelClassName() {
		if (modelClassName == null) {
			modelClassName = ModelUiUtil.getModelClassName(project, modelName);
		}
		return modelClassName;
	}

	private String modelClassSimpleName;

	public String getModelClassSimpleName() {
		if (modelClassSimpleName == null) {
			modelClassSimpleName = StringUtil.getSimpleName(getModelClassName());
		}
		return modelClassSimpleName;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public IJavaSearchScope getScope() {
		return scope;
	}

	public String getScopeDescription() {
		return scopeDescription;
	}

	public List<String> getMethodPattern() {
		if (methodPattern == null) {
			return Arrays.asList("get%s", "get%sOption", "get%sAsString", "set%s", "set%sOption", "set%sAsString");
		}
		return methodPattern;
	}

	public SearchPattern createSearchPattern() {
		List<SearchPattern> list = new ArrayList<SearchPattern>();
		createMethodPattern(list);
		createKeyPattern(list);
		createGetOrderPattern(list);

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

	protected void createMethodPattern(List<SearchPattern> list) {
		List<String> names = getMethodPattern();
		if (names.isEmpty()) {
			return;
		}

		String className = ModelUiUtil.getModelClassName(getProject(), getModelName());
		IJavaProject javaProject = JavaCore.create(getProject());
		IType type = TypeUtil.findType(javaProject, className);
		if (type == null) {
			return;
		}

		int limitTo = IJavaSearchConstants.REFERENCES;
		int matchRule = SearchPattern.R_EXACT_MATCH | SearchPattern.R_CASE_SENSITIVE | SearchPattern.R_ERASURE_MATCH;

		String camelName = StringUtil.toCamelCase(getPropertyName());
		for (String namePattern : names) {
			String name = String.format(namePattern, camelName);
			IMethod method = TypeUtil.findMethod(type, name);
			if (method == null) {
				continue;
			}

			SearchPattern pattern = SearchPattern.createPattern(method, limitTo, matchRule);
			list.add(pattern);
		}
	}

	protected void createKeyPattern(List<SearchPattern> list) {
		int searchFor = IJavaSearchConstants.ANNOTATION_TYPE;
		int limitTo = IJavaSearchConstants.ANNOTATION_TYPE_REFERENCE;
		int matchRule = SearchPattern.R_EXACT_MATCH | SearchPattern.R_CASE_SENSITIVE;
		SearchPattern pattern = SearchPattern.createPattern(OperatorUtil.KEY_NAME, searchFor, limitTo, matchRule);
		list.add(pattern);
	}

	protected void createGetOrderPattern(List<SearchPattern> list) {
		String method = "getOrder() java.util.List<java.lang.String>";
		int searchFor = IJavaSearchConstants.METHOD;
		int limitTo = IJavaSearchConstants.DECLARATIONS;
		int matchRule = SearchPattern.R_EXACT_MATCH | SearchPattern.R_CASE_SENSITIVE;
		SearchPattern pattern = SearchPattern.createPattern(method, searchFor, limitTo, matchRule);
		list.add(pattern);
	}
}
