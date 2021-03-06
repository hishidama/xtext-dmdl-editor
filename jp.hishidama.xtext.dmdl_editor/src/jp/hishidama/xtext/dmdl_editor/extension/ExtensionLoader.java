package jp.hishidama.xtext.dmdl_editor.extension;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
import org.eclipse.core.runtime.IExtensionRegistry;
import org.eclipse.core.runtime.Platform;

public class ExtensionLoader {
	private static final String PLUGIN_ID = "jp.hishidama.xtext.dmdl_editor";
	private static final String ATTRIBUTE_DEF_POINT_ID = PLUGIN_ID + ".dmdlAttributeWizardDefinition";
	private static final String ATTRIBUTE_COMP_POINT_ID = PLUGIN_ID + ".dmdlAttributeCompletion";

	private List<DMDLAttributeWizardDefinition> attrDefList;
	private List<DMDLAttributeCompletion> attrCompList;

	public List<DMDLAttributeWizardDefinition> getAttributeWizardDefinitions() {
		if (attrDefList != null) {
			return attrDefList;
		}

		IExtensionPoint point = getExtensionPoint(ATTRIBUTE_DEF_POINT_ID);

		attrDefList = new ArrayList<DMDLAttributeWizardDefinition>();
		for (IExtension extension : point.getExtensions()) {
			for (IConfigurationElement element : extension.getConfigurationElements()) {
				try {
					Object obj = element.createExecutableExtension("class");
					if (obj instanceof DMDLAttributeWizardDefinition) {
						attrDefList.add((DMDLAttributeWizardDefinition) obj);
					}
				} catch (CoreException e) {
					e.printStackTrace(); // TODO log
				}
			}
		}
		return attrDefList;
	}

	public List<DMDLAttributeCompletion> getAttributeCompletions() {
		if (attrCompList != null) {
			return attrCompList;
		}

		IExtensionPoint point = getExtensionPoint(ATTRIBUTE_COMP_POINT_ID);

		attrCompList = new ArrayList<DMDLAttributeCompletion>();
		for (IExtension extension : point.getExtensions()) {
			for (IConfigurationElement element : extension.getConfigurationElements()) {
				try {
					Object obj = element.createExecutableExtension("class");
					if (obj instanceof DMDLAttributeCompletion) {
						attrCompList.add((DMDLAttributeCompletion) obj);
					}
				} catch (CoreException e) {
					e.printStackTrace(); // TODO log
				}
			}
		}
		return attrCompList;
	}

	private IExtensionPoint getExtensionPoint(String id) {
		IExtensionRegistry registory = Platform.getExtensionRegistry();
		IExtensionPoint point = registory.getExtensionPoint(id);
		if (point == null) {
			throw new IllegalStateException(id);
		}
		return point;
	}
}
