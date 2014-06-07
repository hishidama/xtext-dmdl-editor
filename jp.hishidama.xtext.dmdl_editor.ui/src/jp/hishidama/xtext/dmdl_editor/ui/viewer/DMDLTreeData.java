package jp.hishidama.xtext.dmdl_editor.ui.viewer;

import static jp.hishidama.eclipse_plugin.util.StringUtil.isEmpty;

import java.util.ArrayList;
import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Script;
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
	private boolean filterSelected = true;

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

	public boolean setFilter(String filter) {
		filterSelected = isSelect(filter);
		return filterSelected;
	}

	public boolean isFilterSelected() {
		return filterSelected;
	}

	private boolean isSelect(String filter) {
		boolean r = isSelect(getText(), filter) || isSelect(getText2(), filter);
		r |= childSelect(filter);
		return r;
	}

	private boolean childSelect(String filter) {
		List<DMDLTreeData> cs = getChildren();
		if (cs == null) {
			return false;
		}
		boolean r = false;
		for (DMDLTreeData c : cs) {
			r |= c.setFilter(filter);
		}
		return r;
	}

	protected abstract String getText();

	protected abstract String getText2();

	private static boolean isSelect(String s, String filter) {
		if (s == null) {
			return false;
		}
		if (isEmpty(filter)) {
			return true;
		}
		return s.contains(filter);
	}

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

		@Override
		protected String getText() {
			return file.getFullPath().toPortableString();
		}

		@Override
		protected String getText2() {
			return null;
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
				return null;
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

		@Override
		protected String getText() {
			return model.getName();
		}

		@Override
		protected String getText2() {
			return ModelUtil.getDecodedDescription(model);
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
				return null;
			}
			if (children == null) {
				List<Property> list = ModelUtil.getProperties(model);
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

		@Override
		protected String getText() {
			return property.getName();
		}

		@Override
		protected String getText2() {
			return PropertyUtil.getDecodedDescription(property);
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
