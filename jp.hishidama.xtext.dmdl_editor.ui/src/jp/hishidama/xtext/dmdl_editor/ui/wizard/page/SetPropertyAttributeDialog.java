package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import java.util.List;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementBlock;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementList;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValue;
import jp.hishidama.xtext.dmdl_editor.dmdl.Literal;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.extension.DMDLAttributeWizardDefinition;
import jp.hishidama.xtext.dmdl_editor.ui.internal.DMDLActivator;
import jp.hishidama.xtext.dmdl_editor.util.DMDLStringUtil;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.IDialogConstants;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;

public class SetPropertyAttributeDialog extends Wizard {

	private Shell shell;
	private ModelDefinition model;
	private List<DataModelRow> propertyList;

	private SetPropertyAttributePage page;

	public SetPropertyAttributeDialog(Shell shell, ModelDefinition model, List<DataModelRow> list) {
		setWindowTitle("属性の一括編集");
		this.shell = shell;
		setDialogSettings(DMDLActivator.getInstance().getDialogSettings());

		this.model = model;
		this.propertyList = list;
	}

	public int open() {
		WizardDialog dialog = new WizardDialog(shell, this) {
			@Override
			protected Button createButton(Composite parent, int id, String label, boolean defaultButton) {
				if (id == IDialogConstants.FINISH_ID) {
					label = IDialogConstants.OK_LABEL;
				}
				return super.createButton(parent, id, label, defaultButton);
			}
		};
		dialog.setHelpAvailable(false);
		return dialog.open();
	}

	@Override
	public void addPages() {
		page = new SetPropertyAttributePage();
		page.setAttribute(model);
		addPage(page);
	}

	@Override
	public boolean performFinish() {
		String attribute = page.getPropertyAttribute();
		for (DataModelRow row : propertyList) {
			String a = DMDLStringUtil.replace(attribute, model.getName(), row.getName(), row.getDescription());
			row.setAttribute(a);
		}
		return true;
	}
}

class SetPropertyAttributePage extends AttributePage {

	private String attribute;

	public SetPropertyAttributePage() {
		super("SetPropertyAttributePage");
		setTitle("プロパティーの属性の指定");
		setDescription("一括で設定するプロパティーの属性の内容を指定して下さい。");
	}

	public void setAttribute(ModelDefinition model) {
		this.attribute = getDefaultPropertyAttribute(model);
	}

	@Override
	public void createFields(Composite composite) {
		createDefaultButtonField(composite);
		createPropertyField(composite);
		createNoteField(composite);

		propertyText.setText(StringUtil.nonNull(attribute));
	}

	@Override
	protected void createNoteArea(Group group) {
		group.setLayout(new GridLayout(2, false));

		Label label = new Label(group, SWT.NONE);
		label.setText("右記の変数を指定することが出来ます。\n行を選択してCtrl+Cを押すと変数名をコピーできます。");

		createVariableTable(group, false, true);
	}

	@Override
	protected String getDefaultModelAttribute(DMDLAttributeWizardDefinition def) {
		throw new UnsupportedOperationException();
	}

	@Override
	protected String getDefaultPropertyAttribute(DMDLAttributeWizardDefinition def) {
		return def.getAddPropertyAttribute();
	}

	@Override
	protected void validate() {
		if (!validateParse("プロパティーの属性", propertyText)) {
			return;
		}
		setErrorMessage(null);
		setPageComplete(true);
	}

	public static String getDefaultPropertyAttribute(ModelDefinition model) {
		for (EObject obj : ModelUtil.getRawProperties(model)) {
			if (obj instanceof Property) {
				Property p = (Property) obj;
				String s = getReplacedAttribute(p);
				if (s != null) {
					return s;
				}
			}
		}
		return null;
	}

	private static String getReplacedAttribute(Property p) {
		AttributeList list = p.getAttributes();
		if (list == null) {
			return null;
		}
		String name = p.getName();
		String upperName = p.getName().toUpperCase();
		String desc = PropertyUtil.getDecodedDescription(p);

		StringBuilder sb = new StringBuilder(256);
		for (Attribute a : list.getAttributes()) {
			if (sb.length() != 0) {
				sb.append("\n");
			}
			sb.append("@");
			sb.append(a.getName());
			AttributeElementBlock block = a.getElementBlock();
			if (block == null) {
				continue;
			}
			sb.append("(");
			AttributeElementList elements = block.getElements();
			if (elements != null) {
				boolean first = true;
				for (AttributeElement e : elements.getElements()) {
					if (first) {
						first = false;
					} else {
						sb.append(", ");
					}
					sb.append(e.getName());
					AttributeValue value = e.getValue();
					if (value != null) {
						sb.append(" = ");
						EObject obj = value.getValue();
						if (obj instanceof Literal) {
							String s = ((Literal) obj).getStringValue();
							if (s != null) {
								sb.append('"');
								sb.append(replace(s, name, upperName, desc));
								sb.append('"');
							} else {
								sb.append(NodeModelUtils.getTokenText(NodeModelUtils.getNode(obj)));
							}
						}
					}
				}
			}
			sb.append(")");
		}
		return sb.toString();
	}

	private static String replace(String text, String name, String upperName, String desc) {
		if (desc != null) {
			return split(text, desc, "$(description)", name, upperName, null);
		}
		if (upperName != null) {
			return split(text, upperName, "$(name.toUpper)", name, null, null);
		}
		if (name != null) {
			return split(text, name, "$(name)", null, null, null);
		}
		return text;
	}

	private static String split(String text, String word, String split, String name, String upperName, String desc) {
		if (text.equals(word)) {
			return replace(split, name, upperName, desc);
		}
		String[] ss = text.split(word);
		if (ss.length == 1) {
			return replace(text, name, upperName, desc);
		}

		StringBuilder sb = new StringBuilder(text.length() * 2);
		for (String s : ss) {
			if (sb.length() != 0) {
				sb.append(split);
			}
			sb.append(replace(s, name, upperName, null));
		}
		return sb.toString();
	}

}
