package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import jp.hishidama.eclipse_plugin.util.FileUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Script;
import jp.hishidama.xtext.dmdl_editor.parser.antlr.DMDLParser;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLActivator;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.CreateDataModelJoinKeyPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.CreateDataModelJoinPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.CreateDataModelNormalPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.CreateDataModelPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.CreateDataModelProjectivePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.CreateDataModelSummarizePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.DataModelType;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SetDataModelNamePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SetDataModelNamePage.FilePosition;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SetDataModelNamePage.PositionType;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;

public class NewDataModelWizard extends Wizard implements IWorkbenchWizard {
	private IProject project;
	private DataModelType fixType;
	private String defaultFile = "src/main/dmdl/";

	private SetDataModelNamePage modelPage;
	private CreateDataModelJoinPage joinPage;
	private CreateDataModelJoinKeyPage joinKeyPage;
	private Map<DataModelType, List<IWizardPage>> createPageMap = new EnumMap<DataModelType, List<IWizardPage>>(
			DataModelType.class);

	private String modelName;
	private String modelDescription;

	public NewDataModelWizard() {
		setWindowTitle("データモデルの作成");
		setDialogSettings(DMDLActivator.getInstance().getDialogSettings());
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		Object obj = selection.getFirstElement();
		if (obj instanceof IFile) {
			init((IFile) obj);
			return;
		}
		if (obj instanceof IResource) {
			IResource resource = (IResource) obj;
			project = resource.getProject();
			return;
		}
		if (obj instanceof IJavaElement) {
			project = ((IJavaElement) obj).getJavaProject().getProject();
			return;
		}

		IEditorPart editor = workbench.getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (editor != null) {
			IEditorInput input = editor.getEditorInput();
			if (input instanceof IFileEditorInput) {
				IFile file = ((IFileEditorInput) input).getFile();
				init(file);
				return;
			}
		}

	}

	private void init(IFile file) {
		project = file.getProject();
		if ("dmdl".equals(file.getFileExtension())) {
			defaultFile = file.getProjectRelativePath().toPortableString();
		}
	}

	public void init(IProject project, DataModelType fixType) {
		this.project = project;
		this.fixType = fixType;
	}

	@Override
	public void addPages() {
		modelPage = new SetDataModelNamePage(project, fixType);
		modelPage.setDmdlFile(defaultFile);
		addPage(modelPage);

		addPage(DataModelType.NORMAL, new CreateDataModelNormalPage());
		addPage(DataModelType.SUMMARIZED, new CreateDataModelSummarizePage());
		joinPage = new CreateDataModelJoinPage();
		joinKeyPage = new CreateDataModelJoinKeyPage();
		addPage(DataModelType.JOINED, joinPage);
		addPage(DataModelType.JOINED, joinKeyPage);
		addPage(DataModelType.PROJECTIVE, new CreateDataModelProjectivePage());
	}

	private void addPage(DataModelType type, WizardPage page) {
		List<IWizardPage> list = createPageMap.get(type);
		if (list == null) {
			list = new ArrayList<IWizardPage>();
			createPageMap.put(type, list);
		}
		list.add(page);

		if (page instanceof CreateDataModelPage) {
			((CreateDataModelPage<?>) page).setProject(project);
		}
		addPage(page);
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		DataModelType type = modelPage.getDataModelType();
		List<IWizardPage> list = createPageMap.get(type);

		IWizardPage nextPage;
		if (page == modelPage) {
			nextPage = list.get(0);
		} else {
			nextPage = null;
			for (int i = 0; i < list.size(); i++) {
				IWizardPage p = list.get(i);
				if (p == page) {
					if (i + 1 < list.size()) {
						nextPage = list.get(i + 1);
					} else {
						nextPage = null;
					}
					break;
				}
			}
		}
		return getPage(nextPage);
	}

	@Override
	public IWizardPage getPreviousPage(IWizardPage page) {
		DataModelType type = modelPage.getDataModelType();
		List<IWizardPage> list = createPageMap.get(type);

		IWizardPage prevPage;
		if (page == list.get(0)) {
			prevPage = modelPage;
		} else {
			prevPage = modelPage;
			for (int i = 0; i < list.size(); i++) {
				IWizardPage p = list.get(i);
				if (p == page) {
					if (i - 1 >= 0) {
						prevPage = list.get(i - 1);
					} else {
						prevPage = modelPage;
					}
					break;
				}
			}
		}
		return getPage(prevPage);
	}

	private IWizardPage getPage(IWizardPage page) {
		if (page == joinKeyPage) {
			joinKeyPage.setSourceList(joinPage.getSelectedModelList(), joinPage.getKeyBuffer());
		}
		if (page instanceof CreateDataModelPage) {
			CreateDataModelPage<?> createPage = (CreateDataModelPage<?>) page;
			createPage.setModelName(modelPage.getDataModelName(), modelPage.getDataModelDescription());
			return createPage;
		}
		return page;
	}

	@Override
	public boolean canFinish() {
		IWizardPage page = getContainer().getCurrentPage();
		CreateDataModelPage<?> lastPage = getLastPage();
		if (page != lastPage) {
			return false;
		}
		return lastPage.isPageComplete();
	}

	private CreateDataModelPage<?> getLastPage() {
		DataModelType type = modelPage.getDataModelType();
		List<IWizardPage> list = createPageMap.get(type);
		IWizardPage lastPage = list.get(list.size() - 1);
		return (CreateDataModelPage<?>) lastPage;
	}

	@Override
	public boolean performFinish() {
		try {
			this.modelName = modelPage.getDataModelName();
			this.modelDescription = modelPage.getDataModelDescription();

			save();
			return true;
		} catch (CoreException e) {
			ErrorDialog.openError(getShell(), "error", "error", e.getStatus());
			return false;
		}
	}

	private void save() throws CoreException {
		CreateDataModelPage<?> createPage = getLastPage();
		String text = createPage.getDataModelText();

		FilePosition f = modelPage.getDmdlFile();
		IFile file = project.getFile(f.filePath);
		if (!file.exists()) {
			FileUtil.save(file, text);
		} else {
			StringBuilder sb = FileUtil.load(file);
			String s = insert(sb, f, text);
			FileUtil.save(file, s);
		}
		if (fixType == null) {
			FileUtil.openEditor(file);
		}
	}

	private String insert(StringBuilder sb, FilePosition f, String text) {
		PositionType pos = f.position;
		ModelDefinition model = null;

		Script models = null;
		if (f.position.name().startsWith("DM_") || f.position == PositionType.FILE_FIRST_COMMENT) {
			DMDLParser parser = InjectorUtil.getInstance(DMDLParser.class);
			IParseResult result = parser.parse(new StringReader(sb.toString()));
			models = (Script) result.getRootASTElement();
		}
		if (f.position.name().startsWith("DM_")) {
			for (ModelDefinition m : models.getList()) {
				if (f.modelName.equals(m.getName())) {
					model = m;
					break;
				}
			}
			if (model == null) {
				pos = PositionType.FILE_LAST;
			}
		}
		ICompositeNode modelNode = NodeModelUtils.getNode(model);

		int n;
		switch (pos) {
		case FILE_FIRST:
			return text + "\n" + sb;
		case FILE_LAST:
			return sb + "\n" + text;
		case FILE_FIRST_COMMENT:
			n = posAfterComment(sb, models, text);
			text += "\n";
			break;
		case DM_BEFORE:
			n = modelNode.getTotalOffset();
			text = "\n" + text + "\n";
			break;
		case DM_AFTER:
			n = modelNode.getTotalEndOffset();
			text = "\n" + text + "\n";
			break;
		case DM_REPLACE:
			n = modelNode.getTotalOffset();
			sb.replace(modelNode.getTotalOffset(), modelNode.getTotalEndOffset(), "");
			text = "\n" + text + "\n";
			break;
		default:
			throw new UnsupportedOperationException("pos=" + pos);
		}

		if (n < sb.length() && sb.charAt(n) == '\r') {
			n++;
		}
		if (n < sb.length() && sb.charAt(n) == '\n') {
			n++;
		}
		return sb.substring(0, n) + text + sb.substring(n);
	}

	private int posAfterComment(StringBuilder sb, Script models, String text) {
		INode lastComment = null;
		ICompositeNode root = NodeModelUtils.getNode(models);
		for (INode node : root.getAsTreeIterable()) {
			if (node instanceof ILeafNode) {
				if (((ILeafNode) node).isHidden()) {
					lastComment = node;
					continue;
				}
				break;
			}
		}
		if (lastComment != null) {
			int n = lastComment.getTotalEndOffset();
			return n;
		}

		return sb.length();
	}

	public String getDataModelName() {
		return modelName;
	}

	public String getDataModelDescription() {
		return modelDescription;
	}
}
