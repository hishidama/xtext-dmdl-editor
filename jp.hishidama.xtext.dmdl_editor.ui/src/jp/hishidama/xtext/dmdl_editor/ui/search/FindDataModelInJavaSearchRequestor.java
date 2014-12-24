package jp.hishidama.xtext.dmdl_editor.ui.search;

import java.util.Arrays;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.PorterUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
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
import org.eclipse.jdt.core.JavaModelException;
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
		if (!data.containsSearchClass(element)) {
			return;
		}

		if (data.getPropertyName() == null) {
			acceptModel(element, match);
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

			if (!isTargetModel(node.getParent())) {
				return true;
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

		private boolean isTargetModel(ASTNode node) {
			List<String> modelClassNameList = null;
			for (; node != null; node = node.getParent()) {
				if (node instanceof SingleVariableDeclaration) {
					SingleVariableDeclaration decl = (SingleVariableDeclaration) node;
					modelClassNameList = ModelUtil.getModelClassName(decl.getType());
					break;
				} else if (node instanceof TypeDeclaration) {
					TypeDeclaration decl = (TypeDeclaration) node;
					modelClassNameList = Arrays.asList(decl.getName().getIdentifier());
					break;
				}
			}

			if (modelClassNameList != null) {
				for (String name : modelClassNameList) {
					if (name.equals(data.getModelClassSimpleName())) {
						return true;
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

	private void acceptModel(IJavaElement element, SearchMatch match) {
		if (element instanceof IType) {
			IType type = (IType) element;
			try {
				if (type.isEnum() || type.isAnnotation()) {
					return;
				}
			} catch (JavaModelException e) {
			}
			ICompilationUnit unit = type.getCompilationUnit();
			ASTParser parser = ASTParser.newParser(AST.JLS4);
			parser.setSource(unit);
			ASTNode node = parser.createAST(new NullProgressMonitor());
			TypeVisitor visitor = new TypeVisitor(match);
			node.accept(visitor);
			if (visitor.foundTypeDeclaration()) {
				String modelClassName = PorterUtil.getModelClassName(type);
				if (modelClassName == null) {
					return;
				}
				if (!modelClassName.equals(data.getModelClassName())) {
					return;
				}
			}
		}

		result.addMatch(element, match.getOffset(), match.getLength());
	}

	private class TypeVisitor extends ASTVisitor {

		private final SearchMatch match;

		private boolean foundTypeDeclaration = false;

		public TypeVisitor(SearchMatch match) {
			this.match = match;
		}

		public boolean foundTypeDeclaration() {
			return foundTypeDeclaration;
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

		@Override
		public boolean visit(TypeDeclaration node) {
			if (include(node.getName())) {
				foundTypeDeclaration = true;
				return false;
			}
			return true;
		}
	}
}
