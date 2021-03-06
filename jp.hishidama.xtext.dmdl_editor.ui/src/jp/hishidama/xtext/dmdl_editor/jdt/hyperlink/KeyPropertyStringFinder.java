package jp.hishidama.xtext.dmdl_editor.jdt.hyperlink;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.AfwStringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil.NamePosition;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.IMethodBinding;
import org.eclipse.jdt.core.dom.ITypeBinding;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;

/**
 * <pre>
 * &#064;Key(group = { "対象" }, order = { "対象" })
 * </pre>
 * 
 * <pre>
 * OperatorTestEnvironment.loader().group(&quot;対象&quot;).order(&quot;対象&quot;).asView()
 * </pre>
 */
public class KeyPropertyStringFinder extends ASTVisitor {
	private ICompilationUnit unit;
	private int offset;

	private IRegion region;
	private Region textRegion;
	private String text;
	private String declarationType;
	private String memberName;
	private String propertyName;

	public KeyPropertyStringFinder(ICompilationUnit unit, int offset) {
		this.unit = unit;
		this.offset = offset;
	}

	public String getMemberName() {
		return memberName;
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
		if (model != null) {
			return model;
		}

		visit();
		if (declarationType == null) {
			return null;
		}

		IProject project = unit.getJavaProject().getProject();
		String modelClassName = AfwStringUtil.extractModelClassName(declarationType);
		this.model = ModelUiUtil.findModelByClass(project, modelClassName);
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
		parser.setSource(unit);
		parser.setSourceRange(offset, 1);
		parser.setResolveBindings(true);
		ASTNode node = parser.createAST(new NullProgressMonitor());
		node.accept(this);
	}

	@Override
	public boolean preVisit2(ASTNode node) {
		return include(node);
	}

	protected boolean include(ASTNode node) {
		int offset = node.getStartPosition();
		int length = node.getLength();
		return offset <= this.offset && this.offset <= offset + length;
	}

	@Override
	public void endVisit(SingleVariableDeclaration node) {
		if (propertyName != null) {
			if (declarationType == null) {
				IProject project = unit.getJavaProject().getProject();
				List<String> list = ModelUtil.getModelClassName(node.getType());
				if (list.size() == 1) {
					this.declarationType = list.get(0);
					return;
				}
				for (String name : list) {
					ModelDefinition m = ModelUiUtil.findModelByClass(project, name);
					Property property = ModelUtil.findProperty(m, propertyName);
					if (property != null) {
						this.declarationType = name;
						return;
					}
				}
			}
		}
	}

	@Override
	public void endVisit(TypeDeclaration node) {
		if (propertyName != null) {
			if (declarationType == null) {
				this.declarationType = node.getName().getIdentifier();
			}
		}
	}

	@Override
	public boolean visit(MemberValuePair node) {
		ASTNode parent = node.getParent();
		if (!(parent instanceof NormalAnnotation)) {
			return true;
		}
		NormalAnnotation annotation = (NormalAnnotation) parent;
		if (!"Key".equals(annotation.getTypeName().getFullyQualifiedName())) {
			return true;
		}

		this.memberName = node.getName().getIdentifier();
		if (!("group".equals(memberName) || "order".equals(memberName))) {
			return true;
		}

		node.getValue().accept(new StringVisitor());
		return false;
	}

	private class StringVisitor extends ASTVisitor {
		@Override
		public boolean preVisit2(ASTNode node) {
			return include(node);
		}

		@Override
		public boolean visit(StringLiteral node) {
			String value = node.getLiteralValue();
			NamePosition pos;
			if (value.isEmpty()) {
				pos = new NamePosition(0, 0);
			} else {
				pos = PropertyUtil.findName(value);
				if (pos == null) {
					return false;
				}
			}

			text = value;
			textRegion = new Region(node.getStartPosition() + 1, node.getLength() - 2);
			propertyName = pos.getName(value);
			region = new Region(node.getStartPosition() + 1 + pos.getOffset(), pos.getLength());
			return false;
		}
	}

	@Override
	public boolean visit(MethodInvocation node) {
		{
			int count = 0;
			for (Object obj : node.arguments()) {
				Expression arg = (Expression) obj;
				if (include(arg)) {
					count++;
				}
			}
			if (count != 1) {
				return true;
			}
		}

		String name = node.getName().getIdentifier();
		// System.out.println(node);

		String expected;
		{
			if ("group".equals(name)) {
				expected = "com.asakusafw.testdriver.loader.DataLoader";
			} else if ("order".equals(name)) {
				expected = "com.asakusafw.testdriver.loader.GroupLoader";
			} else {
				return true;
			}
		}
		String decl = null;
		{
			IMethodBinding method = node.resolveMethodBinding();
			if (method != null) {
				ITypeBinding type = method.getDeclaringClass();
				if (type != null) {
					decl = type.getBinaryName();
				}
			}
		}
		if (!expected.equals(decl)) {
			return true;
		}

		node.accept(new StringVisitor());
		if (this.propertyName != null) {
			this.memberName = name;
			this.declarationType = AfwStringUtil.extractTypeParameter(node.resolveTypeBinding().getName());
		}
		return false;
	}
}
