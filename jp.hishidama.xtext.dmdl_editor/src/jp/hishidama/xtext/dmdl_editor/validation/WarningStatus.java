package jp.hishidama.xtext.dmdl_editor.validation;

import java.text.MessageFormat;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class WarningStatus extends Status {
	public WarningStatus(String message) {
		super(IStatus.WARNING, "unknown", message);
	}

	public WarningStatus(String message, Object... args) {
		super(IStatus.WARNING, "unknown", MessageFormat.format(message, args));
	}
}
