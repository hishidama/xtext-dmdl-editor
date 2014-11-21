package jp.hishidama.xtext.dmdl_editor.ui.search;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.PorterUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil.NamePosition;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IMethod;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.dom.AST;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.ASTParser;
import org.eclipse.jdt.core.dom.ASTVisitor;
import org.eclipse.jdt.core.dom.ArrayInitializer;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.MemberValuePair;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.MethodInvocation;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.StringLiteral;
import org.eclipse.jdt.core.dom.Type;
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
		// TODO ディレクトリー判定

		if (!sameProject(element)) {
			return;
		}

		if (element instanceof IMember) {
			ICompilationUnit unit = ((IMember) element).getCompilationUnit();
			accept(unit, match);
		}
	}

	private boolean sameProject(IJavaElement element) {
		String targetName = data.getProject().getName();
		if (targetName.equals(element.getJavaProject().getElementName())) {
			return true;
		}
		try {
			String[] names = element.getJavaProject().getRequiredProjectNames();
			for (String name : names) {
				if (targetName.equals(name)) {
					return true;
				}
			}
		} catch (JavaModelException e) {
			// do nothing
		}
		return false;
	}

	private void accept(ICompilationUnit unit, SearchMatch match) {
		ASTParser parser = ASTParser.newParser(AST.JLS4);
		parser.setSource(unit);
		ASTNode node = parser.createAST(new NullProgressMonitor());
		MethodVisitor visitor = new MethodVisitor(match);
		node.accept(visitor);
	}

	private class MethodVisitor extends ASTVisitor {

		private final SearchMatch match;

		public MethodVisitor(SearchMatch match) {
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

			ASTNode parent = node.getParent();
			if (parent instanceof SingleVariableDeclaration) {
				SingleVariableDeclaration decl = (SingleVariableDeclaration) parent;
				Type type = decl.getType();
				if (type instanceof SimpleType) {
					String name = ((SimpleType) type).getName().getFullyQualifiedName();
					if (!name.equals(data.getModelClassSimpleName())) {
						return false;
					}
				}
			}

			List<ASTNode> values = node.values();
			for (ASTNode valueNode : values) {
				if (valueNode instanceof MemberValuePair) {
					MemberValuePair pair = (MemberValuePair) valueNode;
					String name = pair.getName().getIdentifier();
					if ("group".equals(name) || "order".equals(name)) {
						Expression value = pair.getValue();
						if (value instanceof ArrayInitializer) {
							ArrayInitializer array = (ArrayInitializer) value;
							List<ASTNode> list = array.expressions();
							for (ASTNode a : list) {
								if (a instanceof StringLiteral) {
									String literal = ((StringLiteral) a).getLiteralValue();
									NamePosition pos = PropertyUtil.nameIndexOf(literal, data.getPropertyName());
									if (pos != null) {
										result.addMatch(match.getElement(), a.getStartPosition() + 1 + pos.offset,
												pos.length);
									}
								}
							}
						} else if (value instanceof StringLiteral) {
							String literal = ((StringLiteral) value).getLiteralValue();
							NamePosition pos = PropertyUtil.nameIndexOf(literal, data.getPropertyName());
							if (pos != null) {
								result.addMatch(match.getElement(), value.getStartPosition() + 1 + pos.offset,
										pos.length);
							}
						}
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

			ASTVisitor visitor = new ASTVisitor() {
				@Override
				public boolean visit(StringLiteral node) {
					String literal = node.getLiteralValue();
					NamePosition pos = PropertyUtil.nameIndexOf(literal, data.getPropertyName());
					if (pos != null) {
						result.addMatch(match.getElement(), node.getStartPosition() + 1 + pos.offset, pos.length);
					}
					return true;
				}
			};
			node.getBody().accept(visitor);

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
