package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IField;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

public class MarkerMessage {

	private final Map<Integer, String> map = new TreeMap<Integer, String>();

	public MarkerMessage(IType type) {
		IMarker[] markers;
		try {
			IResource resource = type.getResource();
			markers = resource.findMarkers(null, true, IResource.DEPTH_INFINITE);
		} catch (CoreException e) {
			return;
		}
		for (IMarker marker : markers) {
			try {
				Integer charStart = (Integer) marker.getAttribute(IMarker.CHAR_START);
				String message = (String) marker.getAttribute(IMarker.MESSAGE);
				if (charStart != null && message != null) {
					String s = map.get(charStart);
					if (s == null) {
						s = message;
					} else {
						s += ", " + message;
					}
					map.put(charStart, s);
				}
			} catch (CoreException e) {
			}
		}
	}

	public String getMessage(IField field) {
		if (field == null) {
			return null;
		}

		int start, end;
		try {
			ISourceRange range = field.getNameRange();
			start = range.getOffset();
			end = start + range.getLength();
		} catch (JavaModelException e) {
			return null;
		}

		for (Entry<Integer, String> entry : map.entrySet()) {
			int pos = entry.getKey();
			if (start <= pos && pos < end) {
				return entry.getValue();
			}
		}
		return null;
	}
}
