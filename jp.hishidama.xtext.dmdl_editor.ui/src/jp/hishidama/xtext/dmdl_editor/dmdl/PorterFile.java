package jp.hishidama.xtext.dmdl_editor.dmdl;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.PorterUtil;
import jp.hishidama.eclipse_plugin.jdt.util.JavadocUtil;
import jp.hishidama.eclipse_plugin.util.JdtUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;

import org.eclipse.core.resources.IFile;
import org.eclipse.jdt.core.Flags;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;

public class PorterFile {
	private final IFile file;
	private final IType type;

	public PorterFile(IFile file) {
		this.file = file;

		ICompilationUnit unit = JdtUtil.getCompilationUnit(file);
		if (unit != null) {
			this.type = unit.findPrimaryType();
		} else {
			this.type = null;
		}
	}

	private String name;

	public String getName() {
		if (name == null) {
			String path = getPath();
			int n = path.lastIndexOf('/');
			if (n >= 0) {
				name = path.substring(n + 1);
			} else {
				name = path;
			}
			int m = name.lastIndexOf('.');
			if (m >= 0) {
				name = name.substring(0, m);
			}
		}
		return name;
	}

	public String getClassName() {
		if (type != null) {
			return type.getFullyQualifiedName();
		}
		return getName();
	}

	private String path;

	public String getPath() {
		if (path == null) {
			path = file.getFullPath().toPortableString();
		}
		return path;
	}

	private boolean checkedImporter = false, checkedExporter = false;
	private boolean isImporter, isExporter;

	public boolean isImporter() {
		if (!checkedImporter) {
			checkedImporter = true;
			if (!isAbstract()) {
				isImporter = PorterUtil.isImporter(type);
			}
		}
		return isImporter;
	}

	public boolean isExporter() {
		if (!checkedExporter) {
			checkedExporter = true;
			if (!isAbstract()) {
				isExporter = PorterUtil.isExporter(type);
			}
		}
		return isExporter;
	}

	private boolean checkedAbstract = false;
	private boolean isAbstract;

	protected boolean isAbstract() {
		if (!checkedAbstract) {
			checkedAbstract = true;
			if (type != null) {
				try {
					isAbstract = Flags.isAbstract(type.getFlags());
				} catch (JavaModelException e) {
					isAbstract = true;
				}
			}
		}
		return isAbstract;
	}

	private boolean checkedComment = false;
	private String comment;

	public String getComment() {
		if (!checkedComment) {
			checkedComment = true;
			comment = JavadocUtil.getHeader(JavadocUtil.getJavadoc(type));
			if (comment == null) {
				comment = "";
			}
		}
		return comment;
	}

	private String modelName;

	public String getModelName() {
		if (modelName == null) {
			ModelDefinition model = getModel();
			if (model != null) {
				modelName = model.getName();
			}
			if (modelName == null) {
				modelName = "";
			}
		}
		return modelName;
	}

	private String modelDescription;

	public String getModelDescription() {
		if (modelDescription == null) {
			ModelDefinition model = getModel();
			modelDescription = ModelUtil.getDecodedDescriptionText(model);
		}
		return modelDescription;
	}

	private boolean checkedModel = false;
	private ModelDefinition model;

	public ModelDefinition getModel() {
		if (!checkedModel) {
			checkedModel = true;
			model = ModelUiUtil.findModelByClass(file.getProject(), getModelClassName());
		}
		return model;
	}

	private boolean checkedModelClassName = false;
	private String modelClassName;

	public String getModelClassName() {
		if (!checkedModelClassName) {
			checkedModelClassName = true;
			modelClassName = PorterUtil.getModelClassName(type);
		}
		return modelClassName;
	}
}
