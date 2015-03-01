package jp.hishidama.xtext.dmdl_editor.ui.wizard;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.dmdl.DataModelType;
import jp.hishidama.eclipse_plugin.util.FileUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Script;
import jp.hishidama.xtext.dmdl_editor.parser.antlr.DMDLParser;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLActivator;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel.CreateDataModelJoinKeyPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel.CreateDataModelJoinPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel.CreateDataModelRecordPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel.CreateDataModelPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel.CreateDataModelProjectivePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel.CreateDataModelSummarizePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel.SetDataModelNamePage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel.SetDataModelNamePage.FilePosition;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.datamodel.SetDataModelNamePage.PositionType;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchWizard;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.FileEditorInput;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.ILeafNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.XtextDocumentUtil;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;

public class NewDataModelWizard extends Wizard implements IWorkbenchWizard {
	protected IProject project;
	protected DataModelType fixType;
	private String[] sourceModels;
	protected String defaultFile = "src/main/dmdl/";
	private String positionModelName = null;
	private PositionType positionType = PositionType.FILE_LAST;

	private SetDataModelNamePage modelPage;
	private CreateDataModelJoinPage joinPage;
	private CreateDataModelJoinKeyPage joinKeyPage;
	private Map<DataModelType, List<IWizardPage>> createPageMap = new EnumMap<DataModelType, List<IWizardPage>>(
			DataModelType.class);

	protected String modelName;
	protected String modelDescription;

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
		if (obj instanceof IFolder) {
			IFolder folder = (IFolder) obj;
			project = folder.getProject();
			defaultFile = folder.getProjectRelativePath().toPortableString() + "/";
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
			initFilePosition(file);
		} else {
			defaultFile = file.getParent().getProjectRelativePath().toPortableString() + "/";
		}
	}

	private void initFilePosition(IFile file) {
		IEditorPart editorPart = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActiveEditor();
		if (!(editorPart instanceof XtextEditor)) {
			return;
		}
		XtextEditor editor = (XtextEditor) editorPart;
		if (!file.equals(((FileEditorInput) editor.getEditorInput()).getFile())) {
			return;
		}
		IXtextDocument doc = XtextDocumentUtil.get(file);
		if (doc != null) {
			ITextSelection ts = (ITextSelection) editor.getSelectionProvider().getSelection();
			final int offset = ts.getOffset();
			ModelDefinition model = doc.readOnly(new IUnitOfWork<ModelDefinition, XtextResource>() {
				public ModelDefinition exec(XtextResource state) throws Exception {
					EList<EObject> list = state.getContents();
					for (EObject object : list) {
						Script script = (Script) object;
						ModelDefinition prevModel = null;
						for (ModelDefinition model : script.getList()) {
							ICompositeNode node = NodeModelUtils.findActualNodeFor(model);
							if (node.getTotalOffset() <= offset && offset < node.getTotalEndOffset()) {
								String text = node.getText();
								int space = 0;
								for (; space < text.length(); space++) {
									switch (text.charAt(space)) {
									case ' ':
									case '\t':
									case '\r':
									case '\n':
										continue;
									default:
										break;
									}
									break;
								}
								if (offset < node.getTotalOffset() + space) {
									if (prevModel == null) {
										positionType = PositionType.FILE_FIRST;
										return null;
									}
									return prevModel;
								}
								return model;
							}
							prevModel = model;
						}
					}
					return null;
				}
			});
			if (model != null) {
				positionModelName = model.getName();
				positionType = PositionType.DM_AFTER;
			}
		}
	}

	public void init(IProject project, DataModelType fixType) {
		this.project = project;
		this.fixType = fixType;
	}

	public void initSource(String... models) {
		this.sourceModels = models;
	}

	public void initSource(List<String> models) {
		initSource(models.toArray(new String[models.size()]));
	}

	@Override
	public void addPages() {
		modelPage = new SetDataModelNamePage(project, fixType);
		modelPage.setDmdlFile(defaultFile, positionModelName, positionType);
		addModelPage(modelPage);

		addPage(DataModelType.RECORD, new CreateDataModelRecordPage());
		addPage(DataModelType.SUMMARIZED, new CreateDataModelSummarizePage());
		joinKeyPage = new CreateDataModelJoinKeyPage();
		joinPage = new CreateDataModelJoinPage(joinKeyPage);
		addPage(DataModelType.JOINED, joinPage);
		addPage(DataModelType.JOINED, joinKeyPage);
		addPage(DataModelType.PROJECTIVE, new CreateDataModelProjectivePage());
	}

	protected void addModelPage(SetDataModelNamePage page) {
		addPage(modelPage);
	}

	private void addPage(DataModelType type, CreateDataModelPage<?> page) {
		if (fixType != null) {
			if (type != fixType) {
				return;
			}
		}
		List<IWizardPage> list = createPageMap.get(type);
		if (list == null) {
			list = new ArrayList<IWizardPage>();
			createPageMap.put(type, list);
		}
		list.add(page);

		page.setProject(project);
		page.setDataModelType(type);
		page.setSourceModels(sourceModels);
		addPage(page);
	}

	@Override
	public IWizardPage getStartingPage() {
		IWizardPage page = super.getStartingPage();
		return getPage(page);
	}

	@Override
	public IWizardPage getNextPage(IWizardPage page) {
		DataModelType type = modelPage.getDataModelType();

		IWizardPage nextPage = super.getNextPage(page);
		while (nextPage instanceof CreateDataModelPage) {
			CreateDataModelPage<?> cpage = (CreateDataModelPage<?>) nextPage;
			if (cpage.getDataModelType() == type) {
				break;
			}
			nextPage = super.getNextPage(nextPage);
		}
		return getPage(nextPage);
	}

	@Override
	public IWizardPage getPreviousPage(IWizardPage page) {
		DataModelType type = modelPage.getDataModelType();

		IWizardPage prevPage = super.getPreviousPage(page);
		while (prevPage instanceof CreateDataModelPage) {
			CreateDataModelPage<?> cpage = (CreateDataModelPage<?>) prevPage;
			if (cpage.getDataModelType() == type) {
				break;
			}
			prevPage = super.getPreviousPage(prevPage);
		}
		return getPage(prevPage);
	}

	protected IWizardPage getPage(IWizardPage page) {
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
		CreateDataModelPage<?> lastPage = getLastCreatePage();
		if (page != lastPage) {
			return false;
		}
		return lastPage.isPageComplete();
	}

	protected List<IWizardPage> getCreatePages() {
		DataModelType type = modelPage.getDataModelType();
		return createPageMap.get(type);
	}

	protected CreateDataModelPage<?> getFirstCreatePage() {
		return (CreateDataModelPage<?>) getCreatePages().get(0);
	}

	protected CreateDataModelPage<?> getLastCreatePage() {
		List<IWizardPage> list = getCreatePages();
		IWizardPage page = list.get(list.size() - 1);
		return (CreateDataModelPage<?>) page;
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
		CreateDataModelPage<?> createPage = getLastCreatePage();
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
