package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.gen;

import java.util.List;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.operator.OperatorType;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.OperatorInputModelRow;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SetBranchEnumPage;
import jp.hishidama.xtext.dmdl_editor.ui.wizard.page.operator.SetBranchEnumPage.EnumRow;

import org.eclipse.jdt.core.dom.ASTNode;
import org.eclipse.jdt.core.dom.Annotation;
import org.eclipse.jdt.core.dom.Block;
import org.eclipse.jdt.core.dom.EnumConstantDeclaration;
import org.eclipse.jdt.core.dom.EnumDeclaration;
import org.eclipse.jdt.core.dom.IExtendedModifier;
import org.eclipse.jdt.core.dom.Javadoc;
import org.eclipse.jdt.core.dom.MethodDeclaration;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.SingleVariableDeclaration;
import org.eclipse.jdt.core.dom.Type;
import org.eclipse.jdt.core.dom.rewrite.ListRewrite;
import org.eclipse.jface.wizard.IWizardPage;

public class BranchOperatorGenerator extends OperatorGenerator {

	@Override
	protected Annotation getAnnotation() {
		return newMarkerAnnotation(OperatorType.BRANCH.getTypeName());
	}

	@Override
	protected Type getReturnType(Javadoc javadoc) {
		String name = getReturnTypeName(javadoc);
		if (name.contains(".")) {
			return newType(name);
		}
		return ast.newSimpleType(ast.newSimpleName(name));
	}

	@Override
	protected String getReturnTypeName(Javadoc javadoc) {
		SetBranchEnumPage page = getBranchEnumPage();
		addJavadocReturn(javadoc, page.getEnumComment());
		return page.getEnumName();
	}

	@Override
	protected void getParameters(List<SingleVariableDeclaration> plist, Javadoc javadoc) {
		List<OperatorInputModelRow> ilist = getInputModelList();
		for (OperatorInputModelRow row : ilist) {
			plist.add(newSimpleParameter(row.getModelTypeName(), row.name));
			addJavadocParam(javadoc, row.name, row.modelDescription);
		}

		addViewParameters(plist, javadoc, true);
	}

	@Override
	protected Block getBody() {
		return newReturnNullBlock();
	}

	@SuppressWarnings("unchecked")
	@Override
	protected ASTNode insertOther(ListRewrite listRewrite, MethodDeclaration method) {
		SetBranchEnumPage page = getBranchEnumPage();
		List<EnumRow> enumList = page.getEnumList();
		if (enumList == null) {
			return null;
		}

		EnumDeclaration enumDecl = ast.newEnumDeclaration();
		enumDecl.setJavadoc(newJavadoc(page.getEnumComment()));
		List<IExtendedModifier> mlist = enumDecl.modifiers();
		mlist.addAll(ast.newModifiers(Modifier.PUBLIC));
		enumDecl.setName(ast.newSimpleName(page.getEnumName()));

		List<EnumConstantDeclaration> elist = enumDecl.enumConstants();
		for (EnumRow row : enumList) {
			EnumConstantDeclaration ec = ast.newEnumConstantDeclaration();
			ec.setJavadoc(newJavadoc(row.comment));
			ec.setName(ast.newSimpleName(row.name));
			elist.add(ec);
		}

		listRewrite.insertAfter(enumDecl, method, null);

		return enumDecl;
	}

	protected final SetBranchEnumPage getBranchEnumPage() {
		for (IWizardPage page : pageList) {
			if (page instanceof SetBranchEnumPage) {
				return (SetBranchEnumPage) page;
			}
		}
		throw new IllegalStateException();
	}
}
