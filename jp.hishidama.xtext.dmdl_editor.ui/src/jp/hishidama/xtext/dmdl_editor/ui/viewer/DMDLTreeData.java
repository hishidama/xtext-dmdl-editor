package jp.hishidama.xtext.dmdl_editor.ui.viewer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.dmdl.DataModelType;
import jp.hishidama.xtext.dmdl_editor.dmdl.DataModelTypeUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Script;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil.PropertyFilter;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.ui.resource.IStorage2UriMapper;

public abstract class DMDLTreeData {
	private DMDLTreeData parent;
	protected final IProject project;
	protected final int depth;
	private Object otherData = null;

	public DMDLTreeData(IProject project, DMDLTreeData parent, int depth) {
		this.project = project;
		this.parent = parent;
		this.depth = depth;
	}

	public final DMDLTreeData getParent() {
		return parent;
	}

	protected final void setParent(DMDLTreeData parent) {
		this.parent = parent;
	}

	public abstract Object getData();

	public void setOtherData(Object object) {
		this.otherData = object;
	}

	public Object getOtherData() {
		return otherData;
	}

	protected abstract String getText();

	protected abstract String getText2();

	public abstract boolean hasChildren();

	public abstract List<DMDLTreeData> getChildren();

	public static class FileNode extends DMDLTreeData {
		private IFile file;
		private ResourceSet resourceSet;
		private List<DMDLTreeData> children;
		private ModelTreeNodePredicate predicate;

		public FileNode(IFile file, ResourceSet resourceSet) {
			this(file, resourceSet, 3);
		}

		public FileNode(IFile file, ResourceSet resourceSet, int depth) {
			super(file.getProject(), null, depth);
			this.file = file;
			this.resourceSet = resourceSet;
		}

		@Override
		public IFile getData() {
			return file;
		}

		private String path;

		@Override
		protected String getText() {
			if (path == null) {
				path = file.getFullPath().toPortableString();
			}
			return path;
		}

		@Override
		protected String getText2() {
			return null;
		}

		public boolean select(Pattern filter) {
			if (filter != null) {
				if (!filter.matcher(getText()).find()) {
					return false;
				}
			}
			return true;
		}

		@Override
		public boolean hasChildren() {
			if (depth <= 1) {
				return false;
			}
			return true;
		}

		@Override
		public List<DMDLTreeData> getChildren() {
			if (depth <= 1) {
				return Collections.emptyList();
			}
			if (children == null) {
				IStorage2UriMapper mapper = InjectorUtil.getInstance(IStorage2UriMapper.class);
				URI uri = mapper.getUri(file);
				Resource r = resourceSet.getResource(uri, true);
				EList<EObject> list = r.getContents();
				children = new ArrayList<DMDLTreeData>(list.size());
				for (EObject object : list) {
					if (object instanceof Script) {
						for (ModelDefinition model : ((Script) object).getList()) {
							if (isAddChildren(model)) {
								children.add(new ModelNode(project, this, model, depth - 1));
							}
						}
					}
				}
			}
			return children;
		}

		public static interface ModelTreeNodePredicate {
			public boolean isAddChildren(ModelDefinition model);
		}

		public void setChildrenPredicate(ModelTreeNodePredicate predicate) {
			this.predicate = predicate;
		}

		protected boolean isAddChildren(ModelDefinition model) {
			if (predicate != null) {
				return predicate.isAddChildren(model);
			}
			return true;
		}
	}

	public static class ModelNode extends DMDLTreeData {
		private final ModelDefinition model;
		private List<DMDLTreeData> children;

		public ModelNode(IProject project, DMDLTreeData parent, ModelDefinition model) {
			this(project, parent, model, 2);
		}

		public ModelNode(IProject project, DMDLTreeData parent, ModelDefinition model, int depth) {
			super(project, parent, depth);
			this.model = model;
		}

		@Override
		public ModelDefinition getData() {
			return model;
		}

		private String name;

		@Override
		protected String getText() {
			if (name == null) {
				name = model.getName();
			}
			return name;
		}

		@Override
		protected String getText2() {
			return ModelUtil.getDecodedDescription(model);
		}

		public boolean select(Pattern nameFilter, Pattern descFilter, Pattern attrFilter, DataModelType typeFilter) {
			if (nameFilter != null) {
				if (!nameFilter.matcher(getText()).find()) {
					return false;
				}
			}
			if (descFilter != null) {
				if (!descFilter.matcher(getDescription()).find()) {
					return false;
				}
			}
			if (attrFilter != null) {
				if (!attrFilter.matcher(getAttribute()).find()) {
					return false;
				}
			}
			if (typeFilter != null) {
				if (getModelType() != typeFilter) {
					return false;
				}
			}
			return true;
		}

		private String description;

		private String getDescription() {
			if (description == null) {
				description = ModelUtil.getDecodedDescriptionText(model);
			}
			return description;
		}

		private String attribute;

		private String getAttribute() {
			if (attribute == null) {
				attribute = ModelUtil.getAttributeString(model);
				if (attribute == null) {
					attribute = "";
				}
			}
			return attribute;
		}

		private DataModelType type;

		private DataModelType getModelType() {
			if (type == null) {
				type = DataModelTypeUtil.valueOf(model);
			}
			return type;
		}

		@Override
		public boolean hasChildren() {
			if (depth <= 1) {
				return false;
			}
			return true;
		}

		@Override
		public List<DMDLTreeData> getChildren() {
			if (depth <= 1) {
				return Collections.emptyList();
			}
			if (children == null) {
				List<Property> list = ModelUtil.getProperties(model, PropertyFilter.ALL);
				children = new ArrayList<DMDLTreeData>(list.size());
				for (Property p : list) {
					children.add(new PropertyNode(project, this, p, depth - 1));
				}
			}
			return children;
		}

		public void setChildren(List<DMDLTreeData> list) {
			if (list != null) {
				for (DMDLTreeData c : list) {
					c.setParent(this);
				}
			}
			this.children = list;
		}
	}

	public static class PropertyNode extends DMDLTreeData {
		private final Property property;

		public PropertyNode(IProject project, DMDLTreeData parent, Property property) {
			this(project, parent, property, 1);
		}

		public PropertyNode(IProject project, DMDLTreeData parent, Property property, int depth) {
			super(project, parent, depth);
			this.property = property;
		}

		@Override
		public Property getData() {
			return property;
		}

		private String name;

		@Override
		protected String getText() {
			if (name == null) {
				name = property.getName();
			}
			return name;
		}

		@Override
		protected String getText2() {
			return PropertyUtil.getDecodedDescription(property);
		}

		public boolean select(Pattern nameFilter, Pattern descFilter, Pattern attrFilter) {
			if (nameFilter != null) {
				if (!nameFilter.matcher(getText()).find()) {
					return false;
				}
			}
			if (descFilter != null) {
				if (!descFilter.matcher(getDescription()).find()) {
					return false;
				}
			}
			if (attrFilter != null) {
				if (!attrFilter.matcher(getAttribute()).find()) {
					return false;
				}
			}
			return true;
		}

		private String description;

		private String getDescription() {
			if (description == null) {
				description = PropertyUtil.getDecodedDescriptionText(property);
			}
			return description;
		}

		private String attribute;

		private String getAttribute() {
			if (attribute == null) {
				attribute = PropertyUtil.getAttributeString(property);
				if (attribute == null) {
					attribute = "";
				}
			}
			return attribute;
		}

		@Override
		public boolean hasChildren() {
			return false;
		}

		@Override
		public List<DMDLTreeData> getChildren() {
			return null;
		}
	}
}
