package jp.hishidama.xtext.dmdl_editor.ui.viewer;

import java.text.MessageFormat;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Type;
import jp.hishidama.xtext.dmdl_editor.ui.labeling.DMDLImages;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class DMDLTreeLabelProvider extends LabelProvider {

	@Override
	public Image getImage(Object element) {
		Object obj = element;
		if (element instanceof DMDLTreeData) {
			obj = ((DMDLTreeData) element).getData();
		}

		if (obj instanceof IFile) {
			return DMDLImages.getDmdlFileImage();
		}
		if (obj instanceof ModelDefinition) {
			ModelDefinition model = (ModelDefinition) obj;
			return DMDLImages.getDataModelImage(model);
		}
		if (obj instanceof Property) {
			return DMDLImages.getPropertyImage();
		}
		return null;
	}

	@Override
	public String getText(Object element) {
		Object obj = element;
		if (element instanceof DMDLTreeData) {
			obj = ((DMDLTreeData) element).getData();
		}

		if (obj instanceof IFile) {
			IFile file = (IFile) obj;
			return file.getFullPath().toPortableString();
		}
		if (obj instanceof ModelDefinition) {
			ModelDefinition model = (ModelDefinition) obj;
			String name = model.getName();
			String desc = model.getDescription();
			String title = (desc != null) ? MessageFormat.format("{0} : {1}",
					name, desc) : name;
			return title;
		}
		if (obj instanceof Property) {
			Property prop = (Property) obj;
			StringBuilder sb = new StringBuilder(64);
			{
				String name = prop.getName();
				sb.append(name);

				String desc = prop.getDescription();
				if (desc != null) {
					sb.append(" ");
					sb.append(desc);
				}

				Type type = PropertyUtil.getResolvedDataType(prop);
				if (type != null) {
					sb.append(" : ");
					sb.append(type);
				}
			}
			return sb.toString();
		}
		return obj.toString();
	}
}
