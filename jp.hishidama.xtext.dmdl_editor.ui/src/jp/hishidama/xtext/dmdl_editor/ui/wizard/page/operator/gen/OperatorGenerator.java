package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.gen;

import java.text.MessageFormat;
import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.eclipse_plugin.jdt.util.AstRewriteUtility;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorInputModelRow;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorOutputModelRow;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SelectOperatorInputModelPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SelectOperatorOutputModelPage;
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
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.IExtendedModifier;
import org.eclipse.jdt.core.dom.MarkerAnnotation;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.NormalAnnotation;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.TypeDeclaration;
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
	private String methodName;
	private IMember position;
	private boolean after;
	protected List<IWizardPage> pageList;

	public void prepare(IDocument document, IType type, SetOperatorNamePage namePage, List<IWizardPage> pageList) {
		this.document = document;
		this.type = type;
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
	private MethodDeclaration generateMethod() {
		MethodDeclaration method = ast.newMethodDeclaration();
		method.setName(ast.newSimpleName(methodName));
		method.setReturnType2(getReturnType());

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
		getParameters(plist);

		return method;
	}

	protected Type getReturnType() {
		return newType(getReturnTypeName());
	}

	protected abstract Annotation getAnnotation();

	protected abstract String getReturnTypeName();

	protected abstract void getParameters(List<SingleVariableDeclaration> plist);

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

	@SuppressWarnings("unchecked")
	protected ASTNode insertMasterSelectionMethod(ListRewrite listRewrite, ASTNode previousElement) {
		SetMasterSelectionPage msPage = getMasterSelectionPage();
		String methodName = msPage.getCreateMethodName();
		if (methodName == null) {
			return previousElement;
		}

		MethodDeclaration method = newMethodDeclaration(methodName);

		List<IExtendedModifier> mlist = method.modifiers();
		MarkerAnnotation a = newMarkerAnnotation("com.asakusafw.vocabulary.operator.MasterSelection");
		mlist.add(a);
		mlist.addAll(ast.newModifiers(Modifier.PUBLIC));

		List<OperatorInputModelRow> ilist = getInputModelList();
		OperatorInputModelRow row0 = ilist.get(0);
		OperatorInputModelRow row1 = ilist.get(1);
		method.setReturnType2(newType(row0.modelClassName));

		List<SingleVariableDeclaration> plist = method.parameters();
		plist.add(newListParameter(row0.modelClassName, "masters", null, null));
		plist.add(newSimpleParameter(row1.modelClassName, "tx"));

		method.setBody(newReturnNullBlock());

		listRewrite.insertAfter(method, previousElement, null);

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

	protected final SetMasterSelectionPage getMasterSelectionPage() {
		for (IWizardPage page : pageList) {
			if (page instanceof SetMasterSelectionPage) {
				return (SetMasterSelectionPage) page;
			}
		}
		throw new IllegalStateException();
	}

	protected final SingleVariableDeclaration newSimpleParameter(String typeName, String name) {
		return newSimpleParameter(typeName, name, null, null);
	}

	protected final SingleVariableDeclaration newSimpleParameter(String typeName, String name, List<String> keyList,
			List<String> orderList) {
		SingleVariableDeclaration v = ast.newSingleVariableDeclaration();
		v.setType(newType(typeName));
		v.setName(ast.newSimpleName(name));
		addKeyAnnotation(v, keyList, orderList);
		return v;
	}

	@SuppressWarnings("unchecked")
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

		List<IExtendedModifier> mlist = v.modifiers();
		mlist.add(a);
	}

	protected final SingleVariableDeclaration newListParameter(String typeName, String name, List<String> keyList,
			List<String> orderList) {
		SingleVariableDeclaration v = ast.newSingleVariableDeclaration();
		v.setType(newType("java.util.List", typeName));
		v.setName(ast.newSimpleName(name));
		addKeyAnnotation(v, keyList, orderList);
		return v;
	}

	protected final SingleVariableDeclaration newResultParameter(String typeName, String name) {
		SingleVariableDeclaration v = ast.newSingleVariableDeclaration();
		v.setType(newType("com.asakusafw.runtime.core.Result", typeName));
		v.setName(ast.newSimpleName(name));
		return v;
	}
}
