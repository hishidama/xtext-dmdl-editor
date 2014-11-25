package jp.hishidama.xtext.dmdl_editor.jdt.assist;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.AfwStringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.jdt.core.dom.Type;

public class JavadocDmdlFinder extends ASTVisitor {
	private ICompilationUnit unit;
	private int offset;

	private String varName;
	private String modelClassName;

	public JavadocDmdlFinder(ICompilationUnit unit, int offset) {
		this.unit = unit;
		this.offset = offset;
	}

	private ModelDefinition model;

	public ModelDefinition getModel() {
		if (model != null) {
			return model;
		}

		visit();
		if (modelClassName == null) {
			return null;
		}

		IProject project = unit.getJavaProject().getProject();
		modelClassName = AfwStringUtil.extractModelClassName(modelClassName);
		this.model = ModelUiUtil.findModelByClass(project, modelClassName);
		return model;
	}

	private boolean visited = false;

	private void visit() {
		if (visited) {
			return;
		}
		visited = true;

		ASTParser parser = ASTParser.newParser(AST.JLS4);
		parser.setSource(unit);
		parser.setSourceRange(offset, 1);
		ASTNode node = parser.createAST(new NullProgressMonitor());
		node.accept(this);
	}

	@Override
	public boolean preVisit2(ASTNode node) {
		int offset = node.getStartPosition();
		int length = node.getLength();
		return offset <= this.offset && this.offset <= offset + length;
	}

	@Override
	public boolean visit(FieldDeclaration node) {
		this.modelClassName = node.getType().toString();
		return false;
	}

	@SuppressWarnings("unchecked")
	@Override
	public boolean visit(MethodDeclaration node) {
		if (javadoc(node.getJavadoc())) {
			if ("return".equals(varName)) {
				Type type = node.getReturnType2();
				this.modelClassName = type.toString();
			} else if (varName != null) {
				List<SingleVariableDeclaration> plist = node.parameters();
				for (SingleVariableDeclaration variable : plist) {
					String name = variable.getName().getIdentifier();
					if (varName.equals(name)) {
						this.modelClassName = variable.getType().toString();
						break;
					}
				}
			}
		}
		return false;
	}

	@SuppressWarnings("unchecked")
	private boolean javadoc(Javadoc javadoc) {
		List<TagElement> tlist = javadoc.tags();
		for (TagElement tag : tlist) {
			if (tag.getStartPosition() <= offset && offset <= tag.getStartPosition() + tag.getLength()) {
				String name = tag.getTagName();
				if ("@return".equals(name)) {
					javadocReturn(tag);
				} else if ("@param".equals(name)) {
					javadocParam(tag);
				}
				return true;
			}
		}
		return false;
	}

	private void javadocReturn(TagElement tag) {
		if (tag.getStartPosition() + "@return".length() <= offset) {
			this.varName = "return";
		}
	}

	@SuppressWarnings("unchecked")
	private void javadocParam(TagElement tag) {
		List<ASTNode> flist = tag.fragments();
		if (flist.size() >= 1) {
			ASTNode node = flist.get(0);
			if (node.getStartPosition() + node.getLength() <= offset) {
				if (node instanceof SimpleName) {
					this.varName = ((SimpleName) node).getIdentifier();
				}
			}
		}
	}
}
