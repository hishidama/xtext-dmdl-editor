package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.gen;

import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.ISourceRange;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.AnnotationTypeDeclaration;
import org.eclipse.jdt.core.dom.AnnotationTypeMemberDeclaration;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.Initializer;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.TypeDeclaration;

public class AstMethodFinder extends ASTVisitor {

	private ISourceRange range;
	private BodyDeclaration found;

	public AstMethodFinder(IMember position) {
		try {
			this.range = position.getSourceRange();
		} catch (JavaModelException e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public boolean visit(AnnotationTypeDeclaration node) {
		return visit0(node);
	}

	@Override
	public boolean visit(EnumDeclaration node) {
		return visit0(node);
	}

	@Override
	public boolean visit(TypeDeclaration node) {
		visit0(node);
		return true;
	}

	@Override
	public boolean visit(AnnotationTypeMemberDeclaration node) {
		return visit0(node);
	}

	@Override
	public boolean visit(EnumConstantDeclaration node) {
		return visit0(node);
	}

	@Override
	public boolean visit(FieldDeclaration node) {
		return visit0(node);
	}

	@Override
	public boolean visit(Initializer node) {
		return visit0(node);
	}

	@Override
	public boolean visit(MethodDeclaration node) {
		return visit0(node);
	}

	private boolean visit0(BodyDeclaration node) {
		if (range.getOffset() == node.getStartPosition() && range.getLength() == node.getLength()) {
			this.found = node;
		}
		return false;
	}

	public BodyDeclaration getFoundNode() {
		return found;
	}
}
