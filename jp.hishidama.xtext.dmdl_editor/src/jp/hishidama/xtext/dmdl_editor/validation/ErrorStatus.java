package jp.hishidama.xtext.dmdl_editor.validation;

import java.text.MessageFormat;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class ErrorStatus extends Status {
	public ErrorStatus(String message) {
		super(IStatus.ERROR, "unknown", message);
	}

	public ErrorStatus(String message, Object... args) {
		super(IStatus.ERROR, "unknown", MessageFormat.format(message, args));
	}
}
