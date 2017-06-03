package jp.hishidama.xtext.dmdl_editor.jdt.assist;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.PorterUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;
import jp.hishidama.xtext.dmdl_editor.jdt.hyperlink.ExporterPropertyStringFinder;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;

/**
 * 
 * <pre>
 * public class Importer {
 *   public String getBasePath()　{
 *     return "対象";
 *   }
 *   public String getResourcePattern()　{
 *     return "対象";
 *   }
 * }
 * </pre>
 * 
 * @see ExporterPropertyStringFinder
 */
public class ImporterStringFinder extends ASTVisitor {
	private IType type;
	private int offset;

	private boolean isLiteral = false;
	private String targetMethodName;

	public ImporterStringFinder(IType type, int offset) {
		this.type = type;
		this.offset = offset;
	}

	public boolean foundStringLiteral() {
		visit();
		return isLiteral;
	}

	public String getMethodName() {
		visit();
		return targetMethodName;
	}

	private ModelDefinition model;

	public ModelDefinition getModel() {
		if (model == null) {
			visit();
			String modelClassName = PorterUtil.getModelClassName(type);
			model = ModelUiUtil.findModelByClass(type.getJavaProject().getProject(), modelClassName);
		}
		return model;
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
		if ("getBasePath".equals(methodName) || "getResourcePattern".equals(methodName)) {
			this.targetMethodName = methodName;
			return true;
		}
		return false;
	}

	@Override
	public boolean visit(StringLiteral node) {
		isLiteral = true;
		return false;
	}
}
