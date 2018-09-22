package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.gen;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.eclipse_plugin.jdt.util.AstRewriteUtility;
import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.FieldCacheRow;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorInputModelRow;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorModelRow;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorOutputModelRow;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SelectOperatorInputModelPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SelectOperatorOutputModelPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SetCacheFieldPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SetMasterSelectionPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SetOperatorNamePage;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.IType;
import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.BodyDeclaration;
import org.eclipse.jdt.core.dom.ClassInstanceCreation;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.EmptyStatement;
import org.eclipse.jdt.core.dom.EnhancedForStatement;
import org.eclipse.jdt.core.dom.FieldDeclaration;
import org.eclipse.jdt.core.dom.IExtendedModifier;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.Modifier.ModifierKeyword;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Statement;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
import org.eclipse.jdt.core.dom.TypeParameter;
import org.eclipse.jdt.core.dom.rewrite.ASTRewrite;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.text.edits.TextEdit;

public abstract class OperatorGenerator extends AstRewriteUtility {

	public static OperatorGenerator create(OperatorType type) {
		switch (type) {
		case BRANCH:
			return new BranchOperatorGenerator();
		case UPDATE:
			return new UpdateOperatorGenerator();
		case CONVERT:
			return new ConvertOperatorGenerator();
		case EXTRACT:
			return new ExtractOperatorGenerator();
		case MASTER_CHECK:
			return new MasterCheckOperatorGenerator();
		case MASTER_JOIN:
			return new MasterJoinOperatorGenerator();
		case MASTER_BRANCH:
			return new MasterBranchOperatorGenerator();
		case MASTER_JOIN_UPDATE:
			return new MasterJoinUpdateOperatorGenerator();
		case MASTER_SELECTION:
			return new MasterSelectionOperatorGenerator();
		case CO_GROUP:
			return new CoGroupOperatorGenerator();
		case SPLIT:
			return new SplitOperatorGenerator();
		case SUMMARIZE:
			return new SummarizeOperatorGenerator();
		case FOLD:
			return new FoldOperatorGenerator();
		case GROUP_SORT:
			return new GroupSortOperatorGenerator();
		case LOGGING:
			return new LoggingOperatorGenerator();
		default:
			throw new IllegalStateException(MessageFormat.format("OperatorGenerator#create() error. opType={0}", type));
		}
	}

	private IDocument document;
	protected IType type;
	protected String methodComment;
	protected String methodName;
	private IMember position;
	private boolean after;
	protected List<IWizardPage> pageList;

	public void prepare(IDocument document, IType type, SetOperatorNamePage namePage, List<IWizardPage> pageList) {
		this.document = document;
		this.type = type;
		this.methodComment = namePage.getMethodComment();
		this.methodName = namePage.getMethodName();
		this.position = namePage.getPosition();
		this.after = namePage.getAfter();
		this.pageList = pageList;
	}

	public boolean execute() throws Exception {
		initializeAst(type.getCompilationUnit());

		// 新メソッド作成
		MethodDeclaration method = generateMethod();

		ASTRewrite astRewrite = getAstRewrite();
		TypeDeclaration astType = getAstType(astRoot);
		if (astType == null) {
			return false;
		}
		ListRewrite listRewrite = astRewrite.getListRewrite(astType, TypeDeclaration.BODY_DECLARATIONS_PROPERTY);

		// メソッドを挿入
		BodyDeclaration positionNode = null;
		if (position != null) {
			AstMethodFinder visitor = new AstMethodFinder(position);
			astType.accept(visitor);
			positionNode = visitor.getFoundNode();
		}
		if (positionNode != null) {
			listRewrite.insertAfter(method, positionNode, null);
		} else {
			if (after) {
				listRewrite.insertLast(method, null);
			} else {
				listRewrite.insertFirst(method, null);
			}
		}
		insertOther(listRewrite, method);

		// 更新を反映
		TextEdit edit = astRewrite.rewriteAST();
		edit.apply(document);
		TextEdit importEdit = getImportRewrite().rewriteImports(new NullProgressMonitor());
		importEdit.apply(document);

		return true;
	}

	@SuppressWarnings("unchecked")
	private TypeDeclaration getAstType(CompilationUnit astRoot) {
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
	protected MethodDeclaration generateMethod() {
		Javadoc javadoc = newJavadoc(methodComment);

		MethodDeclaration method = ast.newMethodDeclaration();
		method.setJavadoc(javadoc);
		method.setName(ast.newSimpleName(methodName));

		int modifier = Modifier.PUBLIC;
		Block body = getBody();
		if (body == null) {
			modifier |= Modifier.ABSTRACT;
		} else {
			method.setBody(body);
		}
		List<IExtendedModifier> mlist = method.modifiers();
		mlist.add(getAnnotation());
		mlist.addAll(ast.newModifiers(modifier));

		List<SingleVariableDeclaration> plist = method.parameters();
		getParameters(plist, javadoc);

		method.setReturnType2(getReturnType(javadoc));
		generateMethodTypeParameters(method);

		return method;
	}

	protected Type getReturnType(Javadoc javadoc) {
		return newType(getReturnTypeName(javadoc));
	}

	protected abstract Annotation getAnnotation();

	protected abstract String getReturnTypeName(Javadoc javadoc);

	protected abstract void getParameters(List<SingleVariableDeclaration> plist, Javadoc javadoc);

	@SuppressWarnings("unchecked")
	protected void generateMethodTypeParameters(MethodDeclaration method) {
		List<TypeParameter> tlist = method.typeParameters();
		for (OperatorModelRow row : getGenericsModelList()) {
			TypeParameter parameter = ast.newTypeParameter();
			parameter.setName(ast.newSimpleName(row.genericsName));
			List<Type> bounds = parameter.typeBounds();
			bounds.add(newType(row.getModelClassName()));
			tlist.add(parameter);
		}
	}

	protected abstract Block getBody();

	protected ASTNode insertOther(ListRewrite listRewrite, MethodDeclaration method) {
		// do override
		return null; // 挿入した一番最後のASTNodeを返す
	}

	// マスター選択演算子関連

	protected Annotation getMasterAnnotaion(OperatorType opType) {
		SetMasterSelectionPage msPage = getMasterSelectionPage();
		String methodName = msPage.getMethodName();
		if (methodName == null) {
			return newMarkerAnnotation(opType.getTypeName());
		} else {
			NormalAnnotation a = newNormalAnnotation(opType.getTypeName());
			addTo(a, newMemberValuePair("selection", methodName));
			return a;
		}
	}

	protected ASTNode insertMasterSelectionMethod(ListRewrite listRewrite, ASTNode previousElement) {
		SetMasterSelectionPage msPage = getMasterSelectionPage();
		String methodName = msPage.getCreateMethodName();
		if (methodName == null) {
			return previousElement;
		}

		List<OperatorInputModelRow> ilist = getInputModelList();
		OperatorInputModelRow row0 = ilist.get(0);
		OperatorInputModelRow row1 = ilist.get(1);

		MethodDeclaration method = generateMasterSelectionMethod(methodName, null, row0.getModelTypeName(), row0.getLabel(), row1.getModelTypeName(), row1.getLabel());
		listRewrite.insertAfter(method, previousElement, null);

		return method;
	}

	@SuppressWarnings("unchecked")
	protected MethodDeclaration generateMasterSelectionMethod(String methodName, String methodComment, String masterType, String masterLabel, String txType, String txLabel) {
		String comment = methodComment;
		if (StringUtil.isEmpty(comment)) {
			comment = "有効なマスターを選択する。";
		}
		Javadoc javadoc = newJavadoc(comment);

		MethodDeclaration method = newMethodDeclaration(methodName);
		method.setJavadoc(javadoc);

		List<IExtendedModifier> mlist = method.modifiers();
		mlist.add(newMarkerAnnotation(OperatorType.MASTER_SELECTION.getTypeName()));
		mlist.add(ast.newModifier(ModifierKeyword.PUBLIC_KEYWORD));

		method.setReturnType2(newType(masterType));
		generateMethodTypeParameters(method);

		List<SingleVariableDeclaration> plist = method.parameters();
		plist.add(newListParameter("java.util.List", masterType, "masters"));
		plist.add(newSimpleParameter(txType, "tx"));
		addJavadocParam(javadoc, "masters", masterLabel);
		addJavadocParam(javadoc, "tx", txLabel);

		addJavadocReturn(javadoc, "実際に利用するマスターデータ、利用可能なものがない場合は{@code null}");

		{
			Block block = ast.newBlock();
			List<Statement> slist = block.statements();

			EnhancedForStatement forStatement = ast.newEnhancedForStatement();
			forStatement.setParameter(newSimpleParameter(masterType, "master"));
			forStatement.setExpression(ast.newSimpleName("masters"));
			forStatement.setBody(newEmptyBlock());
			slist.add(forStatement);

			slist.add(newReturnStatement(ast.newNullLiteral()));
			method.setBody(block);
		}

		return method;
	}

	// サブクラスで使用する為のメソッド

	protected final IProject getProject() {
		return type.getJavaProject().getProject();
	}

	protected final List<OperatorInputModelRow> getInputModelList() {
		for (IWizardPage page : pageList) {
			if (page instanceof SelectOperatorInputModelPage) {
				return ((SelectOperatorInputModelPage) page).getElementList();
			}
		}
		throw new IllegalStateException();
	}

	protected final List<OperatorOutputModelRow> getOutputModelList() {
		for (IWizardPage page : pageList) {
			if (page instanceof SelectOperatorOutputModelPage) {
				return ((SelectOperatorOutputModelPage) page).getElementList();
			}
		}
		throw new IllegalStateException();
	}

	protected final List<OperatorModelRow> getGenericsModelList() {
		List<OperatorModelRow> list = new ArrayList<OperatorModelRow>();
		Set<String> set = new HashSet<String>();
		for (IWizardPage page : pageList) {
			if (page instanceof SelectOperatorInputModelPage) {
				for (OperatorInputModelRow row : ((SelectOperatorInputModelPage) page).getElementList()) {
					collectGenericsModelList(list, row, set);
				}
			} else if (page instanceof SelectOperatorOutputModelPage) {
				for (OperatorOutputModelRow row : ((SelectOperatorOutputModelPage) page).getElementList()) {
					collectGenericsModelList(list, row, set);
				}
			}
		}
		return list;
	}

	private void collectGenericsModelList(List<OperatorModelRow> list, OperatorModelRow row, Set<String> set) {
		if (row.projective) {
			String key = String.format("<%s>%s", row.genericsName, row.getModelClassName());
			if (!set.contains(key)) {
				set.add(key);
				list.add(row);
			}
		}
	}

	private Set<String> typeParameterSet = null;

	@Override
	protected boolean isTypeParameter(String typeName) {
		if (typeParameterSet == null) {
			Set<String> set = new HashSet<String>();

			List<OperatorModelRow> list = getGenericsModelList();
			for (OperatorModelRow row : list) {
				if (row.projective) {
					set.add(row.genericsName);
				}
			}

			typeParameterSet = set;
		}
		return typeParameterSet.contains(typeName);
	}

	protected final SetMasterSelectionPage getMasterSelectionPage() {
		for (int i = pageList.size() - 1; i >= 0; i--) {
			IWizardPage page = pageList.get(i);
			if (page instanceof SetMasterSelectionPage) {
				return (SetMasterSelectionPage) page;
			}
		}
		throw new IllegalStateException();
	}

	protected final SetCacheFieldPage getCacheFieldPage() {
		for (int i = pageList.size() - 1; i >= 0; i--) {
			IWizardPage page = pageList.get(i);
			if (page instanceof SetCacheFieldPage) {
				return (SetCacheFieldPage) page;
			}
		}
		throw new IllegalStateException();
	}

	protected final String getLabel(ModelDefinition model) {
		if (model == null) {
			return "";
		}
		String description = ModelUtil.getDecodedDescriptionText(model);
		if (!description.isEmpty()) {
			return description;
		}
		return model.getName();
	}

	protected final ClassInstanceCreation newClassInstanceCreation(String typeName) {
		ClassInstanceCreation c = ast.newClassInstanceCreation();
		c.setType(newType(typeName));
		return c;
	}

	protected final SingleVariableDeclaration newSimpleParameter(String typeName, String name) {
		return newSimpleParameter(typeName, name, null, null);
	}

	protected final SingleVariableDeclaration newSimpleParameter(String typeName, String name, List<String> keyList, List<String> orderList) {
		SingleVariableDeclaration v = ast.newSingleVariableDeclaration();
		v.setType(newType(typeName));
		v.setName(ast.newSimpleName(name));
		addKeyAnnotation(v, keyList, orderList);
		return v;
	}

	private void addKeyAnnotation(SingleVariableDeclaration v, List<String> keyList, List<String> orderList) {
		if (keyList == null && orderList == null) {
			return;
		}

		NormalAnnotation a = newNormalAnnotation("com.asakusafw.vocabulary.model.Key");
		if (keyList != null) {
			addTo(a, newMemberValuePair("group", keyList));
		}
		if (orderList != null) {
			addTo(a, newMemberValuePair("order", orderList));
		}

		@SuppressWarnings("unchecked")
		List<IExtendedModifier> mlist = v.modifiers();
		mlist.add(a);
	}

	private void addOnceAnnotation(SingleVariableDeclaration v) {
		MarkerAnnotation a = newMarkerAnnotation("com.asakusafw.vocabulary.model.Once");
		@SuppressWarnings("unchecked")
		List<IExtendedModifier> mlist = v.modifiers();
		mlist.add(a);
	}

	protected final SingleVariableDeclaration newListParameter(String listClassName, String typeName, String name) {
		SingleVariableDeclaration v = ast.newSingleVariableDeclaration();
		v.setType(newType(listClassName, typeName));
		v.setName(ast.newSimpleName(name));
		return v;
	}

	protected final SingleVariableDeclaration newListParameter(String listClassName, String typeName, String name, List<String> keyList, List<String> orderList, boolean once) {
		SingleVariableDeclaration v = newListParameter(listClassName, typeName, name);
		addKeyAnnotation(v, keyList, orderList);
		if (once) {
			addOnceAnnotation(v);
		}
		return v;
	}

	protected final SingleVariableDeclaration newResultParameter(String typeName, String name) {
		SingleVariableDeclaration v = ast.newSingleVariableDeclaration();
		v.setType(newType("com.asakusafw.runtime.core.Result", typeName));
		v.setName(ast.newSimpleName(name));
		return v;
	}

	protected final EmptyStatement newResultCommentStatement() {
		ASTRewrite rewriter = getAstRewrite();
		String comment = "// TODO Resultのaddメソッドにデータモデルオブジェクトを渡すことにより、オブジェクトを出力します。\n" //
				+ "// XXX addは複数回呼び出せますが、Resultにaddしたオブジェクトはadd後に内容が変更されている可能性があるので、add後にオブジェクトの一部だけ変えて再度addするような使い方は出来ません。\n" //
				+ "// XXX オブジェクトを使い回したい場合は、値を全てセットし直すか、Resultにaddする専用のオブジェクトを作ってcopyFromメソッドでコピーする等の方法を採る必要があります。";
		EmptyStatement statement = (EmptyStatement) rewriter.createStringPlaceholder(comment, ASTNode.EMPTY_STATEMENT);
		return statement;
	}

	protected final void createDataModelFields(ListRewrite listRewrite, ASTNode positionNode) {
		SetCacheFieldPage fieldPage = getCacheFieldPage();
		int position = fieldPage.getCreatePosition();
		List<FieldCacheRow> list = fieldPage.getCreateFieldList();
		for (FieldCacheRow row : list) {
			FieldDeclaration field = createField(row);
			switch (position) {
			case 0:
				FieldDeclaration last = findLastField(listRewrite);
				if (last != null) {
					listRewrite.insertAfter(field, last, null);
				} else {
					listRewrite.insertFirst(field, null);
				}
				break;
			default:
				listRewrite.insertBefore(field, positionNode, null);
				break;
			}
		}
	}

	protected final FieldDeclaration createField(FieldCacheRow row) {
		String name = row.name;
		String className = row.modelClassName;
		FieldDeclaration field = newFieldDeclaration(className, name, true);

		Javadoc javadoc = newJavadoc(row.getLabel());
		field.setJavadoc(javadoc);

		return field;
	}
}
