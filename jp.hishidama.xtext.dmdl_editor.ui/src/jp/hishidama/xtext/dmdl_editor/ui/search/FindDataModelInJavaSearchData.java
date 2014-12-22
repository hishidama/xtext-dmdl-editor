package jp.hishidama.xtext.dmdl_editor.ui.search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.OperatorUtil;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.PorterUtil;
import jp.hishidama.eclipse_plugin.jdt.util.TypeUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.search.IJavaSearchConstants;
import org.eclipse.jdt.core.search.IJavaSearchScope;
import org.eclipse.jdt.core.search.SearchPattern;
import org.eclipse.jdt.internal.ui.search.JavaSearchScopeFactory;

@SuppressWarnings("restriction")
public class FindDataModelInJavaSearchData {

	public static enum LimitTo {
		// getter
		GET("get%s"), GET_OPTION("get%sOption"), GET_STRING("get%sAsString"),
		// setter
		SET("set%s"), SET_OPTION("set%sOption"), SET_STRING("set%sAsString"),
		// other
		KEY, EXPORTER;

		private final String data;

		LimitTo() {
			this(null);
		}

		LimitTo(String data) {
			this.data = data;
		}

		public String getData() {
			return data;
		}
	}

	public static enum SearchIn {
		MAIN, TEST, GENERATE
	}

	public static enum SearchClass {
		OPERATOR, JOBFLOW, FLOWPART, PORTER
	}

	private final IProject dmdlProject;
	private final String modelName;
	private final String propertyName;

	private boolean limitKey = true;
	private boolean limitExporter = true;
	private List<String> methodPattern = null;
	private Set<SearchIn> searchIn = null;
	private Set<SearchClass> searchClass = null;

	private IJavaSearchScope scope;
	private String scopeDescription;

	public FindDataModelInJavaSearchData(IProject project, String modelName, String propertyName) {
		this.dmdlProject = project;
		this.modelName = modelName;
		this.propertyName = propertyName;
	}

	// @see org.eclipse.jdt.internal.ui.search.JavaSearchPage#performNewSearch()
	public void initializeScope(Set<SearchIn> searchIn) {
		initializeSearchIn(searchIn);
		initializeScopeWorkspace();
	}

	private static final int INCLUDE_MASK = JavaSearchScopeFactory.PROJECTS | JavaSearchScopeFactory.SOURCES;

	private void initializeScopeWorkspace() {
		Set<IJavaElement> set = new HashSet<IJavaElement>();

		try {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IJavaProject[] projects = JavaCore.create(root).getJavaProjects();
			for (IJavaProject project : projects) {
				if (isCollectScope(project.getProject())) {
					collectScope(set, project);
				}
			}
		} catch (JavaModelException e) {
			// do nothing
		}

		JavaSearchScopeFactory factory = JavaSearchScopeFactory.getInstance();
		initializeScope(factory, set);
		scopeDescription = factory.getWorkspaceScopeDescription(INCLUDE_MASK);
	}

	private void initializeScope(JavaSearchScopeFactory factory, Set<IJavaElement> set) {
		IJavaElement[] elements = set.toArray(new IJavaElement[set.size()]);
		scope = factory.createJavaSearchScope(elements, INCLUDE_MASK);
	}

	private void collectScope(Set<IJavaElement> set, IJavaProject project) {
		IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
		try {
			IClasspathEntry[] entries = project.getResolvedClasspath(true);
			for (IClasspathEntry entry : entries) {
				if (entry.getEntryKind() == IClasspathEntry.CPE_SOURCE) {
					IPath path = entry.getPath();
					IResource resource = root.findMember(path);
					IJavaElement element = JavaCore.create(resource);
					collectScope(set, element);
				}
			}
		} catch (JavaModelException e) {
			return;
		}
	}

	private void collectScope(Set<IJavaElement> set, IJavaElement element) {
		IProject project = element.getJavaProject().getProject();
		if (isCollectScope(project) && containsSearchIn(element)) {
			set.add(element);
		}
	}

	private boolean isCollectScope(IProject project) {
		if (project.equals(dmdlProject)) {
			return true;
		}

		try {
			IProject[] projects = project.getReferencedProjects();
			for (IProject p : projects) {
				if (p.equals(dmdlProject)) {
					return true;
				}
			}
		} catch (CoreException e) {
		}
		return false;
	}

	public void initializeMethodPattern(List<String> methodPattern) {
		this.methodPattern = methodPattern;
	}

	public void initializeLimit(boolean key, boolean exporter) {
		this.limitKey = key;
		this.limitExporter = exporter;
	}

	private void initializeSearchIn(Set<SearchIn> searchIn) {
		this.searchIn = searchIn;
	}

	public void initializeSearchClass(Set<SearchClass> searchClass) {
		this.searchClass = searchClass;
	}

	public IProject getProject() {
		return dmdlProject;
	}

	public String getModelName() {
		return modelName;
	}

	private String modelClassName;

	public String getModelClassName() {
		if (modelClassName == null) {
			modelClassName = ModelUiUtil.getModelClassName(dmdlProject, modelName);
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
		if (getPropertyName() == null) {
			return createTypePattern();
		}

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

	protected SearchPattern createTypePattern() {
		IJavaProject javaProject = JavaCore.create(getProject());
		IType type = TypeUtil.findType(javaProject, getModelClassName());
		int limitTo = IJavaSearchConstants.REFERENCES;
		int matchRule = SearchPattern.R_EXACT_MATCH | SearchPattern.R_CASE_SENSITIVE | SearchPattern.R_ERASURE_MATCH;
		return SearchPattern.createPattern(type, limitTo, matchRule);
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
		if (!limitKey) {
			return;
		}
		int searchFor = IJavaSearchConstants.ANNOTATION_TYPE;
		int limitTo = IJavaSearchConstants.ANNOTATION_TYPE_REFERENCE;
		int matchRule = SearchPattern.R_EXACT_MATCH | SearchPattern.R_CASE_SENSITIVE;
		SearchPattern pattern = SearchPattern.createPattern(OperatorUtil.KEY_NAME, searchFor, limitTo, matchRule);
		list.add(pattern);
	}

	protected void createGetOrderPattern(List<SearchPattern> list) {
		if (!limitExporter) {
			return;
		}
		String method = "getOrder() java.util.List<java.lang.String>";
		int searchFor = IJavaSearchConstants.METHOD;
		int limitTo = IJavaSearchConstants.DECLARATIONS;
		int matchRule = SearchPattern.R_EXACT_MATCH | SearchPattern.R_CASE_SENSITIVE;
		SearchPattern pattern = SearchPattern.createPattern(method, searchFor, limitTo, matchRule);
		list.add(pattern);
	}

	public boolean containsSearchIn(IJavaElement element) {
		if (searchIn == null) {
			return true;
		}

		SearchIn dir = getSearchIn(element);
		return searchIn.contains(dir);
	}

	private SearchIn getSearchIn(IJavaElement element) {
		IResource resource = element.getResource();
		if (resource == null) {
			return null;
		}
		IPath path = resource.getProjectRelativePath();
		if (path.segmentCount() > 0) {
			String segment = path.segment(0);
			if ("target".equals(segment) || "build".equals(segment)) {
				return SearchIn.GENERATE;
			}
			if ("test".equals(segment)) {
				return SearchIn.TEST;
			}
		}

		if (path.segmentCount() > 1) {
			String segment = path.segment(1);
			if ("test".equals(segment)) {
				return SearchIn.TEST;
			}
		}

		return SearchIn.MAIN;
	}

	public boolean containsSearchClass(IJavaElement element) {
		if (searchClass == null) {
			return true;
		}

		SearchClass c = getSearchClass(element);
		return searchClass.contains(c);
	}

	private SearchClass getSearchClass(IJavaElement element) {
		IType type = null;
		if (element instanceof IType) {
			type = (IType) element;
		} else if (element instanceof IMember) {
			ICompilationUnit unit = ((IMember) element).getCompilationUnit();
			try {
				IType[] types = unit.getTypes();
				for (IType t : types) {
					type = t;
					break;
				}
			} catch (JavaModelException e) {
			}
		}
		if (type != null) {
			if (FlowUtil.isJobFlow(type)) {
				return SearchClass.JOBFLOW;
			}
			if (FlowUtil.isFlowPart(type)) {
				return SearchClass.FLOWPART;
			}
			if (PorterUtil.isPorterOrFormat(type)) {
				return SearchClass.PORTER;
			}

			String name = type.getFullyQualifiedName();
			if (name.endsWith("Factory")) {
				type = TypeUtil.findType(type.getJavaProject(), StringUtil.removeEnds(name, "Factory"));
				if (type != null) {
					if (FlowUtil.isFlowPart(type)) {
						return SearchClass.FLOWPART;
					}
				}
			}
		}
		return SearchClass.OPERATOR;
	}
}
