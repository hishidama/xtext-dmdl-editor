package jp.hishidama.xtext.dmdl_editor.jdt.assist;

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
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;

/**
 * <pre>
 * &#064;Key(group=対象 , order=対象)
 * </pre>
 */
public class KeyMemberFinder extends ASTVisitor {
	private ICompilationUnit unit;
	private int offset;

	private SingleVariableDeclaration declaration;
	private String memberName;

	public KeyMemberFinder(ICompilationUnit unit, int offset) {
		this.unit = unit;
		this.offset = offset;
	}

	public String getMemberName() {
		return memberName;
	}

	private ModelDefinition model;

	public ModelDefinition getModel() {
		if (model != null) {
			return model;
		}

		visit();
		if (declaration == null) {
			return null;
		}

		IProject project = unit.getJavaProject().getProject();
		String modelClassName = AfwStringUtil.extractModelClassName(declaration.getType().toString());
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
	public void endVisit(SingleVariableDeclaration node) {
		if (memberName != null) {
			if (declaration == null) {
				this.declaration = node;
			}
		}
	}

	@Override
	public boolean visit(NormalAnnotation node) {
		String name = node.getTypeName().getFullyQualifiedName();
		return "Key".equals(name);
	}

	@Override
	public boolean visit(MemberValuePair node) {
		String name = node.getName().getIdentifier();
		if ("group".equals(name) || "order".equals(name)) {
			this.memberName = name;
			return true;
		}
		return false;
	}
}
