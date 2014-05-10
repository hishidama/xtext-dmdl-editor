package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.jobflow;

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
import org.eclipse.jdt.core.dom.FieldAccess;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeLiteral;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;

public class JobflowClassModifier extends AstRewriteUtility {

	private IDocument document;
	private IType type;
	private SetJobflowPorterPage porterPage;

	private List<JobflowPorterRow> srcList;
	private List<JobflowPorterRow> dstList;
	private TypeDeclaration astType;

	public JobflowClassModifier(IDocument document, IType type, SetJobflowPorterPage porterPage) {
		this.document = document;
		this.type = type;
		this.porterPage = porterPage;
	}

	public void execute() throws BadLocationException, CoreException {
		initializeAst(type.getCompilationUnit());

		this.srcList = porterPage.getInitList();
		this.dstList = porterPage.getPorterList();
		this.astType = getAstType();

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
		Set<String> set = new HashSet<String>();
		for (JobflowPorterRow row : srcList) {
			set.add(row.name);
		}

		ListRewrite rewriter = getAstRewrite().getListRewrite(astType, TypeDeclaration.BODY_DECLARATIONS_PROPERTY);

		BodyDeclaration first = null;
		boolean fix = false;
		List<BodyDeclaration> blist = astType.bodyDeclarations();
		for (BodyDeclaration member : blist) {
			if (member instanceof FieldDeclaration) {
				FieldDeclaration field = (FieldDeclaration) member;
				String fname = getFieldName(field);
				if (set.contains(fname)) {
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
		for (JobflowPorterRow row : dstList) {
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
				rewriter.remove(tag, null);
				fix = true;
				continue;
			}
			if (!fix) {
				first = tag;
			}
		}

		TagElement prev = first;
		for (JobflowPorterRow row : dstList) {
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

		List<SingleVariableDeclaration> plist = constructor.parameters();
		for (SingleVariableDeclaration param : plist) {
			rewriter.remove(param, null);
		}

		for (JobflowPorterRow row : dstList) {
			SingleVariableDeclaration param = ast.newSingleVariableDeclaration();
			NormalAnnotation a = newNormalAnnotation(row.in ? FlowUtil.IMPORT_NAME : FlowUtil.EXPORT_NAME);
			{
				addTo(a, newMemberValuePair("name", row.name));
				TypeLiteral literal = ast.newTypeLiteral();
				literal.setType(newType(row.porterClassName));
				addTo(a, newMemberValuePair("description", literal));
				param.modifiers().add(a);
			}
			param.setType(newType(row.in ? FlowUtil.IN_NAME : FlowUtil.OUT_NAME, row.modelClassName));
			param.setName(ast.newSimpleName(row.name));

			rewriter.insertLast(param, null);
		}
	}

	@SuppressWarnings("unchecked")
	private void modifyConstructorBody(MethodDeclaration constructor) {
		Block block = ast.newBlock();
		List<Statement> slist = block.statements();
		for (JobflowPorterRow row : dstList) {
			FieldAccess d = ast.newFieldAccess();
			d.setExpression(ast.newThisExpression());
			d.setName(ast.newSimpleName(row.name));
			SimpleName s = ast.newSimpleName(row.name);

			Assignment assign = ast.newAssignment();
			assign.setLeftHandSide(d);
			assign.setRightHandSide(s);
			slist.add(ast.newExpressionStatement(assign));
		}

		ASTRewrite rewriter = getAstRewrite();
		Block old = constructor.getBody();
		if (old != null) {
			rewriter.replace(old, block, null);
		} else {
			rewriter.set(constructor, MethodDeclaration.BODY_PROPERTY, block, null);
		}
	}
}
