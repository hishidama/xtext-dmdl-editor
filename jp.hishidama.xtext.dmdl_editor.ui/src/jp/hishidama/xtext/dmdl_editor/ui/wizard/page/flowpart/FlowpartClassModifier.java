package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.jdt.util.AstRewriteUtility;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.dom.Assignment;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.Expression;
import org.eclipse.jdt.core.dom.ExpressionStatement;
import org.eclipse.jdt.core.dom.FieldAccess;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.jdt.core.dom.ThisExpression;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;

public class FlowpartClassModifier extends AstRewriteUtility {

	private IDocument document;
	private IType type;
	private SetFlowpartPortPage portPage;

	private List<FlowpartModelRow> srcList;
	private List<FlowpartModelRow> dstList;
	private TypeDeclaration astType;
	private Set<String> srcSet;

	public FlowpartClassModifier(IDocument document, IType type, SetFlowpartPortPage portPage) {
		this.document = document;
		this.type = type;
		this.portPage = portPage;
	}

	public void execute() throws BadLocationException, CoreException {
		initializeAst(type.getCompilationUnit());

		this.srcList = portPage.getInitList();
		this.dstList = portPage.getDataModelList();
		this.astType = getAstType();

		srcSet = new HashSet<String>();
		for (FlowpartModelRow row : srcList) {
			srcSet.add(row.name);
		}

		modifyField();
		modifyConstructor();

		// 更新を反映
		TextEdit edit = getAstRewrite().rewriteAST();
		edit.apply(document);
		TextEdit importEdit = getImportRewrite().rewriteImports(new NullProgressMonitor());
		importEdit.apply(document);
	}

	@SuppressWarnings("unchecked")
	private TypeDeclaration getAstType() {
		List<TypeDeclaration> list = astRoot.types();
		if (list.size() == 1) {
			return list.get(0);
		}

		String typeName = type.getElementName();
		for (TypeDeclaration t : list) {
			String name = t.getName().getIdentifier();
			if (name.equals(typeName)) {
				return t;
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	private void modifyField() {
		ListRewrite rewriter = getAstRewrite().getListRewrite(astType, TypeDeclaration.BODY_DECLARATIONS_PROPERTY);

		BodyDeclaration first = null;
		boolean fix = false;
		List<BodyDeclaration> blist = astType.bodyDeclarations();
		for (BodyDeclaration member : blist) {
			if (member instanceof FieldDeclaration) {
				FieldDeclaration field = (FieldDeclaration) member;
				String fname = getFieldName(field);
				if (srcSet.contains(fname)) {
					rewriter.remove(field, null);
					fix = true;
					continue;
				}
			}
			if (!fix) {
				first = member;
			}
		}

		BodyDeclaration prev = first;
		for (FlowpartModelRow row : dstList) {
			Javadoc javadoc = newJavadoc(row.getLabel());

			VariableDeclarationFragment fragment = ast.newVariableDeclarationFragment();
			fragment.setName(ast.newSimpleName(row.name));
			FieldDeclaration field = ast.newFieldDeclaration(fragment);
			field.setJavadoc(javadoc);
			field.modifiers().addAll(ast.newModifiers(Modifier.PRIVATE | Modifier.FINAL));
			field.setType(newType(row.in ? FlowUtil.IN_NAME : FlowUtil.OUT_NAME, row.modelClassName));

			if (prev == null) {
				rewriter.insertFirst(field, null);
			} else {
				rewriter.insertAfter(field, prev, null);
			}
			prev = field;
		}
	}

	@SuppressWarnings("unchecked")
	private void modifyConstructor() {
		MethodDeclaration constructor = getConstructor();
		if (constructor == null) {
			constructor = newMethodDeclaration(type.getElementName());
			constructor.setConstructor(true);
			constructor.modifiers().add(ast.newModifier(ModifierKeyword.PUBLIC_KEYWORD));
			constructor.setJavadoc(ast.newJavadoc());

			ListRewrite rewriter = getAstRewrite().getListRewrite(astType, TypeDeclaration.BODY_DECLARATIONS_PROPERTY);
			MethodDeclaration[] mlist = astType.getMethods();
			if (mlist.length >= 1) {
				rewriter.insertBefore(constructor, mlist[0], null);
			} else {
				rewriter.insertLast(constructor, null);
			}
		}

		modifyConstructorJavadoc(constructor);
		modifyConstructorParameter(constructor);
		modifyConstructorBody(constructor);
	}

	private MethodDeclaration getConstructor() {
		for (MethodDeclaration method : astType.getMethods()) {
			if (method.isConstructor()) {
				return method;
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	private void modifyConstructorJavadoc(MethodDeclaration constructor) {
		Javadoc javadoc = constructor.getJavadoc();
		if (javadoc == null) {
			javadoc = ast.newJavadoc();
			getAstRewrite().set(constructor, MethodDeclaration.JAVADOC_PROPERTY, javadoc, null);
		}
		ListRewrite rewriter = getAstRewrite().getListRewrite(javadoc, Javadoc.TAGS_PROPERTY);

		boolean fix = false;
		TagElement first = null;

		List<TagElement> tlist = javadoc.tags();
		for (TagElement tag : tlist) {
			if (TagElement.TAG_PARAM.equals(tag.getTagName())) {
				String name = getJavadocParamName(tag);
				if (srcSet.contains(name)) {
					rewriter.remove(tag, null);
					fix = true;
					continue;
				}
			}
			if (!fix) {
				first = tag;
			}
		}

		TagElement prev = first;
		for (FlowpartModelRow row : dstList) {
			TagElement tag = ast.newTagElement();
			tag.setTagName(TagElement.TAG_PARAM);
			tag.fragments().add(ast.newSimpleName(row.name));
			tag.fragments().add(newTextElement(row.getLabel()));

			if (prev == null) {
				rewriter.insertFirst(tag, null);
			} else {
				rewriter.insertAfter(tag, prev, null);
			}
			prev = tag;
		}
	}

	@SuppressWarnings("unchecked")
	private void modifyConstructorParameter(MethodDeclaration constructor) {
		ListRewrite rewriter = getAstRewrite().getListRewrite(constructor, MethodDeclaration.PARAMETERS_PROPERTY);

		SingleVariableDeclaration first = null;
		boolean fix = false;

		List<SingleVariableDeclaration> plist = constructor.parameters();
		for (SingleVariableDeclaration param : plist) {
			String name = param.getName().getIdentifier();
			if (srcSet.contains(name)) {
				rewriter.remove(param, null);
				fix = true;
				continue;
			}
			if (!fix) {
				first = param;
			}
		}

		SingleVariableDeclaration prev = first;
		for (FlowpartModelRow row : dstList) {
			SingleVariableDeclaration param = ast.newSingleVariableDeclaration();
			param.setType(newType(row.in ? FlowUtil.IN_NAME : FlowUtil.OUT_NAME, row.modelClassName));
			param.setName(ast.newSimpleName(row.name));

			if (prev == null) {
				rewriter.insertFirst(param, null);
			} else {
				rewriter.insertAfter(param, prev, null);
			}
			prev = param;
		}
	}

	@SuppressWarnings("unchecked")
	private void modifyConstructorBody(MethodDeclaration constructor) {
		Block block = constructor.getBody();
		if (block == null) {
			block = ast.newBlock();
			ASTRewrite rewriter = getAstRewrite();
			rewriter.set(constructor, MethodDeclaration.BODY_PROPERTY, block, null);
		}

		ListRewrite rewriter = getAstRewrite().getListRewrite(block, Block.STATEMENTS_PROPERTY);
		List<Statement> slist = block.statements();
		for (Statement s : slist) {
			if (s instanceof ExpressionStatement) {
				Expression expression = ((ExpressionStatement) s).getExpression();
				if (expression instanceof Assignment) {
					Expression left = ((Assignment) expression).getLeftHandSide();
					if (left instanceof FieldAccess) {
						FieldAccess fa = (FieldAccess) left;
						Expression obj = fa.getExpression();
						if (obj instanceof ThisExpression) {
							String name = fa.getName().getIdentifier();
							if (srcSet.contains(name)) {
								rewriter.remove(s, null);
							}
						}
					}
				}
			}
		}

		Statement prev = null;
		for (FlowpartModelRow row : dstList) {
			FieldAccess d = ast.newFieldAccess();
			d.setExpression(ast.newThisExpression());
			d.setName(ast.newSimpleName(row.name));
			SimpleName s = ast.newSimpleName(row.name);

			Assignment assign = ast.newAssignment();
			assign.setLeftHandSide(d);
			assign.setRightHandSide(s);
			ExpressionStatement stat = ast.newExpressionStatement(assign);

			if (prev == null) {
				rewriter.insertFirst(stat, null);
			} else {
				rewriter.insertAfter(stat, prev, null);
			}
			prev = stat;
		}
	}
}
