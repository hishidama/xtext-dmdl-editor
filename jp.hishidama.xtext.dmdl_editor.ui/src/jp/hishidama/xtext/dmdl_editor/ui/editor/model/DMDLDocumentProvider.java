package jp.hishidama.xtext.dmdl_editor.ui.editor.model;

import jp.hishidama.xtext.dmdl_editor.ui.editor.preferences.DMDLRootPreferencePage;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.xtext.ui.editor.model.XtextDocumentProvider;
import org.eclipse.xtext.ui.editor.preferences.IPreferenceStoreAccess;

import com.google.inject.Inject;

public class DMDLDocumentProvider extends XtextDocumentProvider {
	private static final String XTEXT_FORMAT_ACTION_COMMAND_ID = "org.eclipse.xtext.ui.FormatAction";

	@Inject
	private IPreferenceStoreAccess preferenceStoreAccess;

	@Override
	protected void doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite)
			throws CoreException {
		IPreferenceStore store = preferenceStoreAccess.getPreferenceStore();
		boolean formatOnSave = store.getBoolean(DMDLRootPreferencePage.FORMAT_ON_SAVE);
		if (formatOnSave) {
			// auto-format
			IHandlerService service = (IHandlerService) PlatformUI.getWorkbench().getService(IHandlerService.class);
			try {
				service.executeCommand(XTEXT_FORMAT_ACTION_COMMAND_ID, null);
			} catch (Exception e) {
				LogUtil.warnStatus("format error on save.", e);
			}
		}
		super.doSaveDocument(monitor, element, document, overwrite);
	}
}