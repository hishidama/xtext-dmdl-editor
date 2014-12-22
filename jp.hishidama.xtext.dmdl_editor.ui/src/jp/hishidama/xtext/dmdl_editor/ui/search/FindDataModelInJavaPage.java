package jp.hishidama.xtext.dmdl_editor.ui.search;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.eclipse_plugin.dialog.ProjectSelectionDialog;
import jp.hishidama.eclipse_plugin.util.FileUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelProperty;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.ui.dialog.DmdlPropertySelectionDialog;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLActivator;
import jp.hishidama.xtext.dmdl_editor.ui.search.FindDataModelInJavaSearchData.LimitTo;
import jp.hishidama.xtext.dmdl_editor.ui.search.FindDataModelInJavaSearchData.SearchClass;
import jp.hishidama.xtext.dmdl_editor.ui.search.FindDataModelInJavaSearchData.SearchIn;
import jp.hishidama.xtext.dmdl_editor.util.DMDLXtextUtil;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.jface.dialogs.DialogPage;
import org.eclipse.jface.dialogs.DialogSettings;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.search.ui.ISearchPage;
import org.eclipse.search.ui.ISearchPageContainer;
import org.eclipse.search.ui.NewSearchUI;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Layout;
import org.eclipse.swt.widgets.Text;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PlatformUI;

public class FindDataModelInJavaPage extends DialogPage implements ISearchPage {

	public static final String ID = "jp.hishidama.xtext.dmdl_editor.ui.FindDataModelInJavaPage";

	private static final String PAGE_NAME = "FindDataModelInJavaPage";

	private ISearchPageContainer fContainer;
	private IDialogSettings fDialogSettings;

	private boolean created = false;

	private Text projectText;
	private Button projectButton;
	private Text modelText;
	private Text propertyText;
	private Button propertyButton;

	private List<Button> limitButtons = new ArrayList<Button>();
	private List<Button> searchInButtons = new ArrayList<Button>();
	private List<Button> searchClassButtons = new ArrayList<Button>();

	private List<Button> dialogSaveButtons = new ArrayList<Button>();

	private SelectionListener updateListener = new SelectionAdapter() {
		@Override
		public void widgetSelected(SelectionEvent e) {
			updateOKStatus();
		}
	};

	public void createControl(Composite parent) {
		initializeDialogUnits(parent);

		Composite composite = new Composite(parent, SWT.NONE);
		Layout layout = new GridLayout(3, false);
		composite.setLayout(layout);

		new Label(composite, SWT.NONE).setText("Project of DataModel:");
		projectText = new Text(composite, SWT.BORDER);
		projectText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		projectText.setEditable(false);
		projectButton = new Button(composite, SWT.PUSH);
		projectButton.setText("select");
		projectButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectProject();
			}
		});

		new Label(composite, SWT.NONE).setText("DataModel name:");
		modelText = new Text(composite, SWT.BORDER);
		modelText.setLayoutData(new GridData(SWT.FILL, SWT.NONE, true, false, 2, 1));
		modelText.addModifyListener(new ModifyListener() {
			// @Override
			public void modifyText(ModifyEvent e) {
				updateOKStatus();
			}
		});

		new Label(composite, SWT.NONE).setText("Property name:");
		propertyText = new Text(composite, SWT.BORDER);
		propertyText.setLayoutData(new GridData(GridData.FILL_HORIZONTAL));
		propertyText.addModifyListener(new ModifyListener() {
			// @Override
			public void modifyText(ModifyEvent e) {
				updateOKStatus();
			}
		});
		propertyButton = new Button(composite, SWT.PUSH);
		propertyButton.setText("select");
		propertyButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				selectProperty();
			}
		});

		Label separator = new Label(composite, SWT.NONE);
		{
			separator.setVisible(false);
			GridData data = new GridData(GridData.FILL, GridData.FILL, false, false, 3, 1);
			data.heightHint = convertHeightInCharsToPixels(1) / 3;
			separator.setLayoutData(data);
		}

		Composite block = new Composite(composite, SWT.NONE);
		{
			GridData data = new GridData(GridData.FILL, GridData.FILL, false, false, 3, 1);
			block.setLayoutData(data);
			block.setLayout(new GridLayout(2, true));
		}

		createLimitTo(block);
		createSearchIn(block);
		createSearchClass(block);

		setControl(composite);
		Dialog.applyDialogFont(composite);

		created = true;
	}

	private Control createLimitTo(Composite composite) {
		Group field = new Group(composite, SWT.NONE);
		field.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		field.setText("Use As");
		field.setLayout(new GridLayout(1, false));

		Composite field1 = new Composite(field, SWT.NONE);
		field1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		field1.setLayout(new GridLayout(6, false));
		Composite field2 = new Composite(field, SWT.NONE);
		field2.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, false, false, 1, 1));
		field2.setLayout(new GridLayout(6, false));
		limitButtons.add(createCheckButton(field1, "get", LimitTo.GET, true));
		limitButtons.add(createCheckButton(field1, "getOption", LimitTo.GET_OPTION, true));
		limitButtons.add(createCheckButton(field1, "getAsString", LimitTo.GET_STRING, true));
		limitButtons.add(createCheckButton(field1, "set", LimitTo.SET, true));
		limitButtons.add(createCheckButton(field1, "setOption", LimitTo.SET_OPTION, true));
		limitButtons.add(createCheckButton(field1, "setAsString", LimitTo.SET_STRING, true));
		limitButtons.add(createCheckButton(field2, "@Key(group,order)", LimitTo.KEY, true));
		limitButtons.add(createCheckButton(field2, "Exporter(order)", LimitTo.EXPORTER, true));

		for (Button button : limitButtons) {
			button.addSelectionListener(updateListener);
		}

		return field;
	}

	private Control createSearchIn(Composite composite) {
		Group field = new Group(composite, SWT.NONE);
		field.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		field.setText("Search In");
		field.setLayout(new GridLayout(3, false));

		searchInButtons.add(createCheckButton(field, "src/main", SearchIn.MAIN, true));
		searchInButtons.add(createCheckButton(field, "src/test", SearchIn.TEST, true));
		searchInButtons.add(createCheckButton(field, "generated-sources", SearchIn.GENERATE, false));

		for (Button button : searchInButtons) {
			button.addSelectionListener(updateListener);
		}

		return field;
	}

	private Control createSearchClass(Composite composite) {
		Group field = new Group(composite, SWT.NONE);
		field.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 3, 1));
		field.setText("Search Class");
		field.setLayout(new GridLayout(5, false));

		searchClassButtons.add(createCheckButton(field, "Operator", SearchClass.OPERATOR, true));
		searchClassButtons.add(createCheckButton(field, "JobFlow", SearchClass.JOBFLOW, true));
		searchClassButtons.add(createCheckButton(field, "FlowPart", SearchClass.FLOWPART, true));
		searchClassButtons.add(createCheckButton(field, "Importer", SearchClass.IMPORTER, true));
		searchClassButtons.add(createCheckButton(field, "Exporter", SearchClass.EXPORTER, true));

		for (Button button : searchClassButtons) {
			button.addSelectionListener(updateListener);
		}

		return field;
	}

	private Button createCheckButton(Composite field, String text, Object data, boolean defaultValue) {
		Button button = new Button(field, SWT.CHECK);
		button.setText(text);
		button.setData(data);

		boolean select;
		IDialogSettings settings = getDialogSettings();
		String key = data.toString();
		if (settings.get(key) != null) {
			select = settings.getBoolean(key);
		} else {
			select = defaultValue;
		}
		button.setSelection(select);
		dialogSaveButtons.add(button);

		return button;
	}

	private void storeConfiguration() {
		IDialogSettings settings = getDialogSettings();
		for (Button button : dialogSaveButtons) {
			Object data = button.getData();
			settings.put(data.toString(), button.getSelection());
		}
	}

	private IDialogSettings getDialogSettings() {
		if (fDialogSettings == null) {
			IDialogSettings settings = DMDLActivator.getInstance().getDialogSettings();
			fDialogSettings = DialogSettings.getOrCreateSection(settings, PAGE_NAME);
		}
		return fDialogSettings;
	}

	void selectProject() {
		ProjectSelectionDialog dialog = new ProjectSelectionDialog(getShell());
		dialog.setInitialSelection(getProject());
		if (dialog.open() != Window.OK) {
			return;
		}

		IProject project = dialog.getResultProject();
		setProject(project);
		updateOKStatus();
	}

	void selectProperty() {
		DmdlPropertySelectionDialog dialog = new DmdlPropertySelectionDialog(getShell(), getProject());
		dialog.setEnableResultModel(true);
		dialog.setInitialProperty(modelText.getText().trim(), propertyText.getText().trim());
		if (dialog.open() != Window.OK) {
			return;
		}

		Property property = dialog.getSelectedProperty();
		if (property != null) {
			setProperty(dialog.getSelectedDataModel(), property);
		} else {
			setModel(dialog.getSelectedDataModel());
		}
	}

	private void setModel(ModelDefinition model) {
		if (model == null) {
			modelText.setText("");
		} else {
			modelText.setText(model.getName());
		}
		propertyText.setText("");
	}

	private void setProperty(ModelDefinition model, Property property) {
		if (property == null) {
			if (model == null) {
				modelText.setText("");
			} else {
				modelText.setText(model.getName());
			}
			propertyText.setText("");
		} else {
			if (model == null) {
				modelText.setText(PropertyUtil.getModelName(property));
			} else {
				modelText.setText(model.getName());
			}
			propertyText.setText(property.getName());
		}
	}

	private boolean firstVisible = true;

	@Override
	public void setVisible(boolean visible) {
		if (visible) {
			if (firstVisible) {
				firstVisible = false;
				initSelections();
			}
		}
		updateOKStatus();

		super.setVisible(visible);
	}

	private void initSelections() {
		ISelection sel = getContainer().getSelection();
		if (sel instanceof IStructuredSelection) {
			Object element = ((IStructuredSelection) sel).getFirstElement();
			if (element instanceof IJavaElement) {
				element = ((IJavaElement) element).getResource();
			}
			if (element instanceof IResource) {
				IProject project = ((IResource) element).getProject();
				setProject(project);
				return;
			}

			ModelProperty find = ModelUiUtil.findModel(sel);
			if (find != null) {
				ModelDefinition model = find.getModel();
				setProject(DMDLXtextUtil.getProject(model));
				setModelProperty(find);
				return;
			}
		}

		IWorkbenchPage activePage = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage();
		if (activePage != null) {
			IEditorPart editor = activePage.getActiveEditor();
			IFile file = FileUtil.getFile(editor);
			if (file != null) {
				setProject(file.getProject());
			} else {
				setProject(null);
			}
			ModelProperty find = ModelUiUtil.findInEditorSelection(editor);
			setModelProperty(find);
			return;
		}

		setProject(null);
	}

	private void setModelProperty(ModelProperty find) {
		if (find != null) {
			if (find.hasProperty()) {
				setProperty(find.getModel(), find.getProperty());
			} else {
				setModel(find.getModel());
			}
		}
	}

	private void setProject(IProject project) {
		if (project == null) {
			projectText.setText("");
			propertyButton.setEnabled(false);
		} else {
			projectText.setText(project.getName());
			propertyButton.setEnabled(true);
		}
	}

	private IProject getProject() {
		IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectText.getText());
		return project;
	}

	final void updateOKStatus() {
		if (created) {
			boolean enable = validate();
			getContainer().setPerformActionEnabled(enable);
		}
	}

	private boolean validate() {
		IProject project = getProject();
		if (project == null) {
			return false;
		}
		String modelName = modelText.getText().trim();
		if (modelName.isEmpty()) {
			return false;
		}

		boolean limitExists = false;
		for (Button button : limitButtons) {
			limitExists |= button.getSelection();
		}
		if (!limitExists) {
			return false;
		}

		if (getSearchIn().isEmpty()) {
			return false;
		}
		if (getSearchClass().isEmpty()) {
			return false;
		}

		return true;
	}

	public List<String> getMethodPattern() {
		List<String> list = new ArrayList<String>();
		for (Button button : limitButtons) {
			if (button.getSelection()) {
				LimitTo limit = (LimitTo) button.getData();
				String data = limit.getData();
				if (data != null) {
					list.add(data);
				}
			}
		}
		return list;
	}

	public boolean containsLimit(LimitTo limit) {
		for (Button button : limitButtons) {
			if (button.getSelection()) {
				if (button.getData() == limit) {
					return true;
				}
			}
		}
		return false;
	}

	public Set<SearchIn> getSearchIn() {
		Set<SearchIn> set = EnumSet.noneOf(SearchIn.class);
		for (Button button : searchInButtons) {
			if (button.getSelection()) {
				set.add((SearchIn) button.getData());
			}
		}
		return set;
	}

	public Set<SearchClass> getSearchClass() {
		Set<SearchClass> set = EnumSet.noneOf(SearchClass.class);
		for (Button button : searchClassButtons) {
			if (button.getSelection()) {
				set.add((SearchClass) button.getData());
			}
		}
		return set;
	}

	public boolean performAction() {
		storeConfiguration();

		IProject project = getProject();
		String modelName = modelText.getText().trim();
		String propertyName = propertyText.getText().trim();
		if (project == null || modelName.isEmpty()) {
			return false;
		}
		if (propertyName.isEmpty()) {
			propertyName = null;
		}

		FindDataModelInJavaSearchData data = new FindDataModelInJavaSearchData(project, modelName, propertyName);
		data.initializeScope(getSearchIn());
		data.initializeMethodPattern(getMethodPattern());
		data.initializeLimit(containsLimit(LimitTo.KEY), containsLimit(LimitTo.EXPORTER));
		data.initializeSearchClass(getSearchClass());
		FindDataModelInJavaSearchQuery query = new FindDataModelInJavaSearchQuery(data);

		NewSearchUI.activateSearchResultView();
		NewSearchUI.runQueryInBackground(query);
		return true;
	}

	public void setContainer(ISearchPageContainer container) {
		this.fContainer = container;
	}

	/**
	 * Returns the search page's container.
	 * 
	 * @return the search page container
	 */
	private ISearchPageContainer getContainer() {
		return fContainer;
	}
}
