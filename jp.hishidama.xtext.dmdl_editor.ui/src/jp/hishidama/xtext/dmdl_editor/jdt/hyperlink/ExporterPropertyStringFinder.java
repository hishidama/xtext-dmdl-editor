package jp.hishidama.xtext.dmdl_editor.jdt.hyperlink;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.PorterUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;

public class ExporterPropertyStringFinder extends ASTVisitor {
	private IType type;
	private int offset;

	private IRegion region;
	private Region textRegion;
	private String text;
	private String propertyName;

	public ExporterPropertyStringFinder(IType type, int offset) {
		this.type = type;
		this.offset = offset;
	}

	public String getPropertyName() {
		visit();
		return propertyName;
	}

	public Property getProperty() {
		visit();
		if (propertyName == null) {
			return null;
		}

		ModelDefinition model = getModel();
		Property property = ModelUtil.findProperty(model, propertyName);
		return property;
	}

	private ModelDefinition model;

	public ModelDefinition getModel() {
		if (model == null) {
			String modelClassName = PorterUtil.getModelClassName(type);
			model = ModelUiUtil.findModelByClass(type.getJavaProject().getProject(), modelClassName);
		}
		return model;
	}

	public IRegion getRegion() {
		visit();
		return region;
	}

	public String getText() {
		visit();
		return text;
	}

	public IRegion getTextRegion() {
		visit();
		return textRegion;
	}

	private boolean visited = false;

	private void visit() {
		if (visited) {
			return;
		}
		visited = true;

		ASTParser parser = ASTParser.newParser(AST.JLS4);
		parser.setSource(type.getCompilationUnit());
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
	public boolean visit(MethodDeclaration node) {
		String methodName = node.getName().getIdentifier();
		return "getOrder".equals(methodName);
	}

	@Override
	public boolean visit(StringLiteral node) {
		String value = node.getLiteralValue();
		this.text = value;
		this.textRegion = new Region(node.getStartPosition() + 1, node.getLength() - 2);

		int s = 0;
		for (; s < value.length(); s++) {
			char c = value.charAt(s);
			switch (c) {
			case '+':
			case '-':
			case ' ':
			case '\t':
				continue;
			}
			break;
		}

		int n = value.indexOf(' ', s);
		if (n < 0) {
			n = value.length();
		}
		this.propertyName = value.substring(s, n);
		this.region = new Region(node.getStartPosition() + 1 + s, propertyName.length());
		return false;
	}
}