package jp.hishidama.xtext.dmdl_editor.jdt.assist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.ui.text.java.ContentAssistInvocationContext;
import org.eclipse.jdt.ui.text.java.IJavaCompletionProposalComputer;
import org.eclipse.jdt.ui.text.java.JavaContentAssistInvocationContext;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;

public class KeyDmdlCompletionProposalComputer implements IJavaCompletionProposalComputer {

	// @Override
	public void sessionStarted() {
	}

	// @Override
	public List<ICompletionProposal> computeCompletionProposals(ContentAssistInvocationContext context,
			IProgressMonitor monitor) {
		if (!isAssist(context)) {
			return Collections.emptyList();
		}

		if (!(context instanceof JavaContentAssistInvocationContext)) {
			return Collections.emptyList();
		}
		JavaContentAssistInvocationContext javaContext = (JavaContentAssistInvocationContext) context;

		ICompilationUnit cu = javaContext.getCompilationUnit();
		int offset = context.getInvocationOffset();
		ModelFinder finder = new ModelFinder(cu, offset);

		ModelDefinition model = finder.getModel();
		if (model == null) {
			return Collections.emptyList();
		}

		List<ICompletionProposal> list = new ArrayList<ICompletionProposal>();
		for (Property property : ModelUtil.getProperties(model)) {
			String s = '"' + property.getName() + '"';
			CompletionProposal proposal = new CompletionProposal(s, offset, 0, s.length());
			list.add(proposal);
		}
		return list;
	}

	private boolean isAssist(ContentAssistInvocationContext context) {
		IDocument document = context.getDocument();
		for (int i = context.getInvocationOffset() - 1; i >= 0; i--) {
			char c;
			try {
				c = document.getChar(i);
			} catch (BadLocationException e) {
				return false;
			}
			switch (c) {
			case ' ':
			case '\t':
			case '\r':
			case '\n':
				continue;
			case '=':
			case ',':
			case '{':
				return true;
			default:
				return false;
			}
		}
		return false;
	}

	// @Override
	public List<IContextInformation> computeContextInformation(ContentAssistInvocationContext context,
			IProgressMonitor monitor) {
		return null;
	}

	// @Override
	public String getErrorMessage() {
		return null;
	}

	// @Override
	public void sessionEnded() {
	}
}
