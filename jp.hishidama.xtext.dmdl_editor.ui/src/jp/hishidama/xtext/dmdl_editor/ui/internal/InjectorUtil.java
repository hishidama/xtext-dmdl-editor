package jp.hishidama.xtext.dmdl_editor.ui.internal;

import jp.hishidama.xtext.dmdl_editor.ui.search.DMDLEObjectSearch;

import com.google.inject.Injector;

public class InjectorUtil {

	public static Injector getInjector() {
		return DMDLActivator.getInstance().getInjector(DMDLActivator.JP_HISHIDAMA_XTEXT_DMDL_EDITOR_DMDL);
	}

	public static <T> T getInstance(Class<T> type) {
		return getInjector().getInstance(type);
	}

	public static void injectMembers(DMDLEObjectSearch instance) {
		getInjector().injectMembers(instance);
	}
}
