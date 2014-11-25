package jp.hishidama.xtext.dmdl_editor.ui.search;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.AfwStringUtil;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.PorterUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil.NamePosition;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IImportDeclaration;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.search.SearchMatch;
import org.eclipse.jdt.core.search.SearchRequestor;

public class FindDataModelInJavaSearchRequestor extends SearchRequestor {

	private final FindDataModelInJavaSearchData data;
	private final FindDataModelInJavaSearchResult result;

	public FindDataModelInJavaSearchRequestor(FindDataModelInJavaSearchData data, FindDataModelInJavaSearchResult result) {
		this.data = data;
		this.result = result;
	}

	@Override
	public void acceptSearchMatch(SearchMatch match) throws CoreException {
		IJavaElement element = (IJavaElement) match.getElement();
		if (element instanceof IImportDeclaration) {
			return;
		}

		if (data.getPropertyName() == null) {
			result.addMatch(element, match.getOffset(), match.getLength());
			return;
		}

		if (element instanceof IMember) {
			ICompilationUnit unit = ((IMember) element).getCompilationUnit();
			accept(unit, match);
		}
	}

	private void accept(ICompilationUnit unit, SearchMatch match) {
		ASTParser parser = ASTParser.newParser(AST.JLS4);
		parser.setSource(unit);
		ASTNode node = parser.createAST(new NullProgressMonitor());
		AcceptVisitor visitor = new AcceptVisitor(match);
		node.accept(visitor);
	}

	private class AcceptVisitor extends ASTVisitor {

		private final SearchMatch match;

		public AcceptVisitor(SearchMatch match) {
			this.match = match;
		}

		@Override
		public boolean preVisit2(ASTNode node) {
			return include(node);
		}

		private boolean include(ASTNode node) {
			int offset = node.getStartPosition();
			int length = node.getLength();
			return (offset <= match.getOffset()) && (match.getOffset() < offset + length);
		}

		@SuppressWarnings("unchecked")
		public boolean visit(NormalAnnotation node) {
			if (!include(node.getTypeName())) {
				return true;
			}
			String annotationSimpleName = node.getTypeName().getFullyQualifiedName();
			if (!"Key".equals(annotationSimpleName)) {
				return true;
			}

			String modelClassName = null;
			for (ASTNode parent = node.getParent(); parent != null; parent = parent.getParent()) {
				if (parent instanceof SingleVariableDeclaration) {
					SingleVariableDeclaration decl = (SingleVariableDeclaration) parent;
					Type type = decl.getType();
					modelClassName = AfwStringUtil.extractModelClassName(type.toString());
					break;
				} else if (parent instanceof TypeDeclaration) {
					TypeDeclaration decl = (TypeDeclaration) parent;
					modelClassName = decl.getName().getIdentifier();
					break;
				}
			}
			if (modelClassName == null) {
				return true;
			}
			if (!modelClassName.equals(data.getModelClassSimpleName())) {
				return false;
			}

			List<ASTNode> values = node.values();
			for (ASTNode valueNode : values) {
				if (valueNode instanceof MemberValuePair) {
					MemberValuePair pair = (MemberValuePair) valueNode;
					String name = pair.getName().getIdentifier();
					if ("group".equals(name) || "order".equals(name)) {
						Expression value = pair.getValue();
						value.accept(new ASTVisitor() {
							@Override
							public boolean visit(StringLiteral node) {
								String literal = node.getLiteralValue();
								NamePosition pos = PropertyUtil.nameIndexOf(literal, data.getPropertyName());
								if (pos != null) {
									result.addMatch(match.getElement(), node.getStartPosition() + 1 + pos.getOffset(),
											pos.getLength());
								}
								return true;
							}
						});
					}
				}
			}

			return false;
		}

		@Override
		public boolean visit(MethodDeclaration node) {
			if (!include(node.getName())) {
				return true;
			}
			String methodName = node.getName().getFullyQualifiedName();
			if (!"getOrder".equals(methodName)) {
				return true;
			}

			IMethod method = (IMethod) match.getElement();
			IType type = method.getDeclaringType();
			if (!PorterUtil.isExporter(type)) {
				return true;
			}

			String modelClassName = PorterUtil.getModelClassName(type);
			if (modelClassName == null || !modelClassName.equals(data.getModelClassName())) {
				return true;
			}

			node.getBody().accept(new ASTVisitor() {
				@Override
				public boolean visit(StringLiteral node) {
					String literal = node.getLiteralValue();
					NamePosition pos = PropertyUtil.nameIndexOf(literal, data.getPropertyName());
					if (pos != null) {
						result.addMatch(match.getElement(), node.getStartPosition() + 1 + pos.getOffset(),
								pos.getLength());
					}
					return true;
				}
			});

			return true;
		}

		@Override
		public boolean visit(MethodInvocation node) {
			if (!include(node.getName())) {
				return true;
			}

			result.addMatch(match.getElement(), match.getOffset(), match.getLength());

			return true;
		}
	}
}
