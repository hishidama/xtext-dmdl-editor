package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.flowpart;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.FlowUtil;
import jp.hishidama.eclipse_plugin.jdt.util.AstRewriteUtility;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUiUtil;

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
import org.eclipse.jdt.core.dom.QualifiedType;
import org.eclipse.jdt.core.dom.SimpleName;
import org.eclipse.jdt.core.dom.SimpleType;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.TagElement;
import org.eclipse.jdt.core.dom.ThisExpression;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeParameter;
import org.eclipse.jdt.core.dom.VariableDeclarationFragment;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;

public class FlowpartClassModifier extends AstRewriteUtility {

	private final IDocument document;
	private final IType type;
	private final SetFlowpartPortPage portPage;
	private final SetArgumentPage argPage;

	public interface FlowPartClassModifierRow {
		public String getName();

		public String getLabel();
	}

	private List<FlowPartClassModifierRow> dstList;
	private TypeDeclaration astType;
	private Set<String> srcSet;

	public FlowpartClassModifier(IDocument document, IType type, SetFlowpartPortPage portPage, SetArgumentPage argPage) {
		this.document = document;
		this.type = type;
		this.portPage = portPage;
		this.argPage = argPage;
	}

	private Set<String> typeParameterSet = null;

	@Override
	protected boolean isTypeParameter(String typeName) {
		if (typeParameterSet == null) {
			Set<String> set = new HashSet<String>();

			List<FlowpartModelRow> list = getGenericsModelList();
			for (FlowpartModelRow row : list) {
				if (row.isGenerics()) {
					set.add(row.genericsName);
				}
			}

			typeParameterSet = set;
		}
		return typeParameterSet.contains(typeName);
	}

	protected final List<FlowpartModelRow> getGenericsModelList() {
		List<FlowpartModelRow> list = new ArrayList<FlowpartModelRow>();
		Set<String> set = new HashSet<String>();
		for (FlowpartModelRow row : portPage.getDataModelList()) {
			collectGenericsModelList(list, row, set);
		}
		return list;
	}

	private void collectGenericsModelList(List<FlowpartModelRow> list, FlowpartModelRow row, Set<String> set) {
		if (row.isGenerics()) {
			String key = String.format("<%s>%s", row.genericsName, row.getModelClassName());
			if (!set.contains(key)) {
				set.add(key);
				list.add(row);
			}
		}
	}

	public void execute() throws BadLocationException, CoreException {
		initializeAst(type.getCompilationUnit());

		this.dstList = new ArrayList<FlowPartClassModifierRow>();
		this.dstList.addAll(portPage.getDataModelList());
		this.dstList.addAll(argPage.getArgumentList());
		this.astType = getAstType();

		srcSet = new HashSet<String>();
		for (FlowpartModelRow row : portPage.getInitList()) {
			srcSet.add(row.name);
		}
		for (ArgumentRow row : argPage.getInitList()) {
			srcSet.add(row.name);
		}

		modifyTypeParameter();
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
	private void modifyTypeParameter() {
		List<FlowpartModelRow> rlist = getGenericsModelList();
		if (rlist.isEmpty()) {
			return;
		}

		Set<String> set = new HashSet<String>();
		for (FlowpartModelRow row : rlist) {
			set.add(row.genericsName);
		}

		ListRewrite rewriter = getAstRewrite().getListRewrite(astType, TypeDeclaration.TYPE_PARAMETERS_PROPERTY);

		List<TypeParameter> tlist = astType.typeParameters();
		typeParamRemove: for (TypeParameter param : tlist) {
			List<Type> bounds = param.typeBounds();
			for (Type bound : bounds) {
				String name = null;
				if (bound instanceof SimpleType) {
					name = ((SimpleType) bound).getName().getFullyQualifiedName();
				} else if (bound instanceof QualifiedType) {
					name = ((QualifiedType) bound).getName().getIdentifier();
				}
				ModelDefinition model = ModelUiUtil.findModelByClass(type.getJavaProject().getProject(), name);
				if (model != null) {
					rewriter.remove(param, null);
					continue typeParamRemove;
				}
			}
		}

		TypeParameter prev = null;
		for (FlowpartModelRow row : rlist) {
			TypeParameter param = ast.newTypeParameter();
			param.setName(ast.newSimpleName(row.genericsName));
			List<Type> bounds = param.typeBounds();
			for (String className : row.getModelClassNames()) {
				bounds.add(newType(className));
			}

			if (prev == null) {
				rewriter.insertFirst(param, null);
			} else {
				rewriter.insertAfter(param, prev, null);
			}
			prev = param;
		}
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
		for (FlowPartClassModifierRow row : dstList) {
			Javadoc javadoc = newJavadoc(row.getLabel());

			VariableDeclarationFragment fragment = ast.newVariableDeclarationFragment();
			fragment.setName(ast.newSimpleName(row.getName()));
			FieldDeclaration field = ast.newFieldDeclaration(fragment);
			field.setJavadoc(javadoc);
			field.modifiers().addAll(ast.newModifiers(Modifier.PRIVATE | Modifier.FINAL));
			field.setType(newType(row));

			if (prev == null) {
				rewriter.insertFirst(field, null);
			} else {
				rewriter.insertAfter(field, prev, null);
			}
			prev = field;
		}
	}

	private Type newType(FlowPartClassModifierRow row0) {
		if (row0 instanceof FlowpartModelRow) {
			FlowpartModelRow row = (FlowpartModelRow) row0;
			return newType(row.in ? FlowUtil.IN_NAME : FlowUtil.OUT_NAME, row.getModelTypeName());
		}

		ArgumentRow row = (ArgumentRow) row0;
		return newType(row.type);
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
		for (FlowPartClassModifierRow row : dstList) {
			TagElement tag = ast.newTagElement();
			tag.setTagName(TagElement.TAG_PARAM);
			tag.fragments().add(ast.newSimpleName(row.getName()));
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
		for (FlowPartClassModifierRow row : dstList) {
			SingleVariableDeclaration param = ast.newSingleVariableDeclaration();
			param.setType(newType(row));
			param.setName(ast.newSimpleName(row.getName()));

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
		for (FlowPartClassModifierRow row : dstList) {
			FieldAccess d = ast.newFieldAccess();
			d.setExpression(ast.newThisExpression());
			d.setName(ast.newSimpleName(row.getName()));
			SimpleName s = ast.newSimpleName(row.getName());

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
