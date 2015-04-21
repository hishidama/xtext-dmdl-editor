package jp.hishidama.xtext.dmdl_editor.jdt.hyperlink;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.PorterUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil.NamePosition;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;

public class ExporterPropertyStringFinder extends ASTVisitor {
	private IType type;
	private int offset;

	private boolean isTargetMethod = false;
	private IRegion region;
	private Region textRegion;
	private String text;
	private String propertyName;

	public ExporterPropertyStringFinder(IType type, int offset) {
		this.type = type;
		this.offset = offset;
	}

	public boolean foundTargetMethod() {
		visit();
		return isTargetMethod;
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
		if ("getOrder".equals(methodName)) {
			isTargetMethod = true;
			visitGetOrder(node.getBody());
			return false;
		} else if ("getResourcePattern".equals(methodName)) {
			isTargetMethod = true;
			visitGetResourcePattern(node.getBody());
			return false;
		}
		return true;
	}

	private void visitGetOrder(Block block) {
		block.accept(new ASTVisitor() {
			@Override
			public boolean preVisit2(ASTNode node) {
				return ExporterPropertyStringFinder.this.preVisit2(node);
			}

			@Override
			public boolean visit(StringLiteral node) {
				String value = node.getLiteralValue();
				NamePosition pos = PropertyUtil.findName(value);
				if (pos == null) {
					return false;
				}

				text = value;
				textRegion = new Region(node.getStartPosition() + 1, node.getLength() - 2);
				propertyName = pos.getName(value);
				region = new Region(node.getStartPosition() + 1 + pos.getOffset(), pos.getLength());
				return false;
			}
		});
	}

	private void visitGetResourcePattern(Block block) {
		block.accept(new ASTVisitor() {
			@Override
			public boolean preVisit2(ASTNode node) {
				return ExporterPropertyStringFinder.this.preVisit2(node);
			}

			@Override
			public boolean visit(StringLiteral node) {
				String value = node.getLiteralValue();
				List<NamePosition> list = PropertyUtil.getResourcePatternProperties(value);
				for (NamePosition pos : list) {
					int offset = node.getStartPosition() + 1 + pos.getOffset();
					int length = pos.getLength();
					if (offset <= ExporterPropertyStringFinder.this.offset
							&& ExporterPropertyStringFinder.this.offset <= offset + length) {
						text = value;
						textRegion = new Region(node.getStartPosition() + 1, node.getLength() - 2);
						propertyName = pos.getName(value).trim();
						region = new Region(offset, length);
						return false;
					}
				}
				isTargetMethod = false;
				return false;
			}
		});
	}
}
