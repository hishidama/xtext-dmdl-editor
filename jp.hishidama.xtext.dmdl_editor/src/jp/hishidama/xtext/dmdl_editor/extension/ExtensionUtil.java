package jp.hishidama.xtext.dmdl_editor.extension;

import java.util.List;

public class ExtensionUtil {

	private static final ExtensionLoader extensionLoader = new ExtensionLoader();

	public static ExtensionLoader getExtensionLoader() {
		return extensionLoader;
	}

	public static List<DMDLImporterExporterGenerator> getImporterExporterGenerators() {
		return getExtensionLoader().getImporterExporterGenerators();
	}
}
