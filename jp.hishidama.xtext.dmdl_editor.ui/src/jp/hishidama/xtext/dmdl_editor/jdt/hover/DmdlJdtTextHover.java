package jp.hishidama.xtext.dmdl_editor.jdt.hover;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICodeAssist;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.internal.ui.text.java.hover.AbstractJavaEditorTextHover;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;

@SuppressWarnings("restriction")
public class DmdlJdtTextHover extends AbstractJavaEditorTextHover {

	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		ICodeAssist assist = super.getCodeAssist();
		if (assist == null || !(assist instanceof ICompilationUnit)) {
			return null;
		}
		ICompilationUnit unit = (ICompilationUnit) assist;

		ASTParser parser = ASTParser.newParser(AST.JLS4);
		parser.setSource(unit);
		parser.setSourceRange(hoverRegion.getOffset(), hoverRegion.getLength());
		ASTNode node = parser.createAST(new NullProgressMonitor());
		PropertyFinder visitor = new PropertyFinder(hoverRegion);
		node.accept(visitor);
		String propertyName = visitor.propertyName;
		if (propertyName != null) {
			IProject project = unit.getJavaProject().getProject();
			String modelClassName = visitor.declaration.getType().toString();
			ModelDefinition model = ModelUiUtil.findModelByClass(project, modelClassName);
			Property property = ModelUtil.findProperty(model, propertyName);
			if (property == null) {
				return null;
			}

			StringBuilder sb = new StringBuilder(256);
			ModelUtil.appendTooltipModelName(sb, model);
			sb.append("<br>");
			PropertyUtil.appendTooltipPropertyName(sb, property);
			return sb.toString();
		}

		return null;
	}

	private static class PropertyFinder extends ASTVisitor {
		private int offset;

		public SingleVariableDeclaration declaration;
		public String memberName;
		public String propertyName;

		public PropertyFinder(IRegion region) {
			this.offset = region.getOffset();
		}

		protected final boolean contains(ASTNode node) {
			int offset = node.getStartPosition();
			int length = node.getLength();
			return offset <= this.offset && this.offset <= offset + length;
		}

		@Override
		public boolean preVisit2(ASTNode node) {
			return contains(node);
		}

		@Override
		public void endVisit(SingleVariableDeclaration node) {
			if (propertyName != null) {
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
			this.memberName = node.getName().getIdentifier();
			return "group".equals(memberName) || "order".equals(memberName);
		}

		@Override
		public boolean visit(StringLiteral node) {
			String value = node.getLiteralValue();
			value = value.replaceAll("[+-]", "").trim();
			int n = value.indexOf(' ');
			if (n >= 0) {
				value = value.substring(0, n);
			}
			this.propertyName = value;
			return false;
		}
	}
}
