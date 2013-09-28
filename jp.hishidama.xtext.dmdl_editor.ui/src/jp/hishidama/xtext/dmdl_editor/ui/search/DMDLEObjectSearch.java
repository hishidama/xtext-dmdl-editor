package jp.hishidama.xtext.dmdl_editor.ui.search;

import java.util.Collection;
import java.util.Collections;

import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.ui.dialogs.SearchPattern;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.ui.search.IXtextEObjectSearch;

import com.google.common.base.Function;
import com.google.common.collect.Iterables;

public class DMDLEObjectSearch extends IXtextEObjectSearch.Default {
	private String projectName;
	private IProgressMonitor monitor;

	public DMDLEObjectSearch(String projectName) {
		this(projectName, null);
	}

	public DMDLEObjectSearch(String projectName, IProgressMonitor monitor) {
		this.projectName = projectName;
		this.monitor = monitor;
		InjectorUtil.injectMembers(this);
	}

	@Override
	protected Iterable<IEObjectDescription> getSearchScope() {
		return Iterables.concat(Iterables.transform(getResourceDescriptions().getAllResourceDescriptions(),
				new Function<IResourceDescription, Iterable<IEObjectDescription>>() {
					public Iterable<IEObjectDescription> apply(IResourceDescription from) {
						if (monitor != null) {
							if (monitor.isCanceled()) {
								throw new RuntimeException(new InterruptedException());
							}
						}
						URI uri = from.getURI();
						if (isTarget(uri)) {
							return from.getExportedObjects();
						}
						return Collections.emptyList();
					}
				}));
	}

	private boolean isTarget(URI uri) {
		if (uri.fileExtension().equals("dmdl")) {
			String[] seg = uri.segments();
			if (seg.length >= 2 && projectName.equals(seg[1])) { // プロジェクト名
				return true;
			}
		}
		return false;
	}

	@Override
	protected boolean isNameMatches(SearchPattern searchPattern, IEObjectDescription eObjectDescription,
			Collection<String> namespaceDelimiters) {
		if (monitor != null) {
			if (monitor.isCanceled()) {
				throw new RuntimeException(new InterruptedException());
			}
		}
		return super.isNameMatches(searchPattern, eObjectDescription, namespaceDelimiters);
	}

	public static String getPattern(String name) {
		StringBuilder sb = new StringBuilder(name.length() * 2);
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (Character.isUpperCase(c)) {
				if (i != 0) {
					sb.append('_');
				}
				sb.append(Character.toLowerCase(c));
			} else if (Character.isDigit(c)) {
				if (i != 0) {
					sb.append('*');
				}
				sb.append(c);
			} else {
				sb.append(c);
			}
		}
		return sb.toString();
	}
}