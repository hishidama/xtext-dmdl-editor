package jp.hishidama.xtext.dmdl_editor.ui.labeling;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;

import org.eclipse.jdt.ui.ISharedImages;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.PluginImageHelper;

public class DMDLImages {

	private static PluginImageHelper imageHelper;

	private static PluginImageHelper getImageHelper() {
		if (imageHelper == null) {
			imageHelper = InjectorUtil.getInstance(PluginImageHelper.class);
		}
		return imageHelper;
	}

	public static Image getDmdlFileImage() {
		PluginImageHelper helper = getImageHelper();
		return helper.getImage("hishidama16.gif");
	}

	public static Image getDataModelImage() {
		return JavaUI.getSharedImages().getImage(org.eclipse.jdt.ui.ISharedImages.IMG_OBJS_CLASS);
	}

	public static Image getDataModelImage(ModelDefinition model) {
		String modelType = model.getType();
		return getDataModelImage(modelType);
	}

	public static Image getDataModelImage(String modelType) {
		// TODO modelType image
		if ("projective".equals(modelType)) {
			return JavaUI.getSharedImages().getImage(org.eclipse.jdt.ui.ISharedImages.IMG_OBJS_INTERFACE);
		}
		return DMDLImages.getDataModelImage();
	}

	public static Image getPropertyImage() {
		return JavaUI.getSharedImages().getImage(org.eclipse.jdt.ui.ISharedImages.IMG_FIELD_PUBLIC);
	}

	public static Image getAttributeImage() {
		return JavaUI.getSharedImages().getImage(ISharedImages.IMG_OBJS_ANNOTATION);
	}
}
