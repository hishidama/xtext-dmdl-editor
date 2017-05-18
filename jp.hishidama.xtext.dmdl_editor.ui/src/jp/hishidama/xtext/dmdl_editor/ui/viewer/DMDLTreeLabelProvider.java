package jp.hishidama.xtext.dmdl_editor.ui.viewer;

import java.text.MessageFormat;

import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Type;
import jp.hishidama.xtext.dmdl_editor.ui.labeling.DMDLImages;

import org.eclipse.core.resources.IFile;
import org.eclipse.jface.viewers.ITableLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

public class DMDLTreeLabelProvider extends LabelProvider implements ITableLabelProvider {

	// @Override
	public Image getColumnImage(Object element, int columnIndex) {
		if (columnIndex == 0) {
			return getImage(element);
		}
		return null;
	}

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
		if (obj instanceof Attribute) {
			return DMDLImages.getAttributeImage();
		}
		return null;
	}

	// @Override
	public String getColumnText(Object element, int columnIndex) {
		switch (columnIndex) {
		case 0:
			return getText(element);
		case 1:
			Object obj = element;
			if (element instanceof DMDLTreeData) {
				obj = ((DMDLTreeData) element).getData();
			}
			if (obj instanceof ModelDefinition) {
				ModelDefinition model = (ModelDefinition) obj;
				return ModelUtil.getAttributeString(model);
			}
			if (obj instanceof Property) {
				Property property = (Property) obj;
				return PropertyUtil.getAttributeString(property);
			}
			break;
		default:
			break;
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
			String title = (desc != null) ? MessageFormat.format("{0} : {1}", name, desc) : name;
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
					String typeText = PropertyUtil.getDataTypeText(type);
					sb.append(" : ");
					sb.append(typeText);
				}
			}
			return sb.toString();
		}
		if (obj instanceof Attribute) {
			Attribute attr = (Attribute) obj;
			return "@" + attr.getName();
		}
		return obj.toString();
	}
}
