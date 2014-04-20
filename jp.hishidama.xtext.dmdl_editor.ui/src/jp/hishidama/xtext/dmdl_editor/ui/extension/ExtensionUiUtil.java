package jp.hishidama.xtext.dmdl_editor.ui.extension;

import java.util.List;

import jp.hishidama.xtext.dmdl_editor.ui.extension.DMDLImporterExporterGenerator;

public class ExtensionUiUtil {

	private static final ExtensionUiLoader extensionLoader = new ExtensionUiLoader();

	public static ExtensionUiLoader getExtensionLoader() {
		return extensionLoader;
	}

	public static List<DMDLImporterExporterGenerator> getImporterExporterGenerators() {
		return getExtensionLoader().getImporterExporterGenerators();
	}
}
