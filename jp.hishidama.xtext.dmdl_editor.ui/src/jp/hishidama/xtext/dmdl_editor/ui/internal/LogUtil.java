package jp.hishidama.xtext.dmdl_editor.ui.internal;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class LogUtil {

	public static IStatus infoStatus(String message) {
		return new Status(IStatus.INFO, DMDLActivator.JP_HISHIDAMA_XTEXT_DMDL_EDITOR_DMDL, message);
	}

	public static IStatus warnStatus(String message, Throwable t) {
		return new Status(IStatus.WARNING, DMDLActivator.JP_HISHIDAMA_XTEXT_DMDL_EDITOR_DMDL, message, t);
	}

	public static IStatus errorStatus(String message, Throwable t) {
		return new Status(IStatus.ERROR, DMDLActivator.JP_HISHIDAMA_XTEXT_DMDL_EDITOR_DMDL, message, t);
	}

	public static IStatus logInfo(String message) {
		IStatus status = infoStatus(message);
		log(status);
		return status;
	}

	public static IStatus logWarn(String message) {
		return logWarn(message, null);
	}

	public static IStatus logWarn(String message, Throwable t) {
		IStatus status = warnStatus(message, t);
		log(status);
		return status;
	}

	public static IStatus logError(String message, Throwable t) {
		IStatus status = errorStatus(message, t);
		log(status);
		return status;
	}

	public static void log(IStatus status) {
		DMDLActivator.getInstance().getLog().log(status);
	}
}
