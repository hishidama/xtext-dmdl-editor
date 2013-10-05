package jp.hishidama.xtext.dmdl_editor.ui.wizard.update;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelFolding;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelMapping;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.SelectDataModelPage.ModelFile;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IPath;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.xtext.resource.XtextResource;

public abstract class AttributeUpdater {

	public abstract void setAttribute(String modelAttr, String propAttr);

	public boolean execute(List<ModelFile> list) throws IOException {
		ResourceSet resourceSet = InjectorUtil.getInstance(ResourceSet.class);

		List<XtextResource> rlist = new ArrayList<XtextResource>();
		for (ModelFile mf : list) {
			IFile file = mf.file;
			ModelDefinition model = mf.model;
			XtextResource resource = (XtextResource) model.eResource();
			if (resource == null) {
				URI uri = URI.createPlatformResourceURI(file.getFullPath().toPortableString(), true);
				resource = (XtextResource) resourceSet.getResource(uri, true);
			}
			Executor<?> executor = getExecutor();
			executor.execute(resource, model);
			rlist.add(resource);
		}
		return executeFinish(rlist);
	}

	protected abstract Executor<?> getExecutor();

	protected static abstract class Executor<T> {
		public void execute(XtextResource resource, ModelDefinition model) {
			execute(resource, model, model.getAttributes(), getModelAttribute());

			EObject rhs = model.getRhs();
			if (rhs instanceof RecordExpression) {
				recordExpression(resource, (RecordExpression) rhs);
			} else if (rhs instanceof JoinExpression) {
				joinExpression(resource, (JoinExpression) rhs);
			} else if (rhs instanceof SummarizeExpression) {
				summarizeExpression(resource, (SummarizeExpression) rhs);
			}
		}

		private void recordExpression(XtextResource resource, RecordExpression rhs) {
			EList<RecordTerm> terms = rhs.getTerms();
			if (terms == null) {
				return;
			}
			for (RecordTerm term : terms) {
				EList<PropertyDefinition> properties = term.getProperties();
				for (PropertyDefinition p : properties) {
					execute(resource, p, p.getAttributes(), getPropertyAttribute());
				}
			}
		}

		private void joinExpression(XtextResource resource, JoinExpression rhs) {
			EList<JoinTerm> terms = rhs.getTerms();
			if (terms == null) {
				return;
			}
			for (JoinTerm term : terms) {
				ModelMapping mapping = term.getMapping();
				if (mapping != null) {
					EList<PropertyMapping> properties = mapping.getMappings();
					if (properties != null) {
						for (PropertyMapping p : properties) {
							execute(resource, p, p.getAttributes(), getPropertyAttribute());
						}
					}
				}
			}
		}

		private void summarizeExpression(XtextResource resource, SummarizeExpression rhs) {
			EList<SummarizeTerm> terms = rhs.getTerms();
			if (terms == null) {
				return;
			}
			for (SummarizeTerm term : terms) {
				ModelFolding folding = term.getFolding();
				if (folding != null) {
					EList<PropertyFolding> properties = folding.getFoldings();
					if (properties != null) {
						for (PropertyFolding p : properties) {
							execute(resource, p, p.getAttributes(), getPropertyAttribute());
						}
					}
				}
			}
		}

		protected abstract T getModelAttribute();

		protected abstract T getPropertyAttribute();

		protected abstract void execute(XtextResource resource, EObject parent, AttributeList attributeList, T attr);
	}

	protected static int getLineTop(IDocument doc, int start) {
		try {
			for (int i = start - 1; i >= 0; i--) {
				char c = doc.getChar(i);
				switch (c) {
				case ' ':
				case '\t':
					continue;
				default:
					return i + 1;
				}
			}
			return 0;
		} catch (BadLocationException e) {
			return start;
		}
	}

	private Map<IPath, List<Region>> regionMap = new LinkedHashMap<IPath, List<Region>>();

	protected final void addAppendRegion(IFile file, int offset, String text) {
		addRegion(file, new Region(offset, offset, text));
	}

	protected final void addRemoveRegion(IFile file, int start, int end) {
		addRegion(file, new Region(start, end, ""));
	}

	protected final void addReplaceRegion(IFile file, int start, int end, String text) {
		addRegion(file, new Region(start, end, text));
	}

	private void addRegion(IFile file, Region region) {
		IPath path = file.getFullPath();
		List<Region> list = regionMap.get(path);
		if (list == null) {
			list = new ArrayList<Region>();
			regionMap.put(path, list);
		}
		list.add(region);
	}

	private boolean executeFinish(List<XtextResource> rlist) throws IOException {
		for (XtextResource resource : rlist) {
			if (resource.isModified()) {
				resource.save(null);
			}
		}
		return true;
	}

	protected void executeFinish(IDocument doc, Region region) {
		try {
			int offset = region.getOffset();
			int length = region.getLength();
			String text = region.getText();
			doc.replace(offset, length, text);
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
	}

	private static class Region implements Comparable<Region> {
		private int start;
		private int end;
		private String text;

		public Region(int start, int end, String text) {
			this.start = start;
			this.end = end;
			this.text = text;
		}

		public int getOffset() {
			return start;
		}

		public int getLength() {
			return end - start;
		}

		public String getText() {
			return text;
		}

		public int compareTo(Region that) {
			return that.start - this.start; // 降順
		}
	}
}
