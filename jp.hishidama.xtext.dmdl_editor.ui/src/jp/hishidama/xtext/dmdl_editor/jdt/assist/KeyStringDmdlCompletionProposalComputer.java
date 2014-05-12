package jp.hishidama.xtext.dmdl_editor.jdt.assist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.jdt.hyperlink.PropertyStringFinder;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.ui.text.java.ContentAssistInvocationContext;
import org.eclipse.jdt.ui.text.java.IJavaCompletionProposalComputer;
import org.eclipse.jdt.ui.text.java.JavaContentAssistInvocationContext;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.contentassist.CompletionProposal;
import org.eclipse.jface.text.contentassist.ICompletionProposal;
import org.eclipse.jface.text.contentassist.IContextInformation;

public class KeyStringDmdlCompletionProposalComputer implements IJavaCompletionProposalComputer {

	// @Override
	public void sessionStarted() {
	}

	// @Override
	public List<ICompletionProposal> computeCompletionProposals(ContentAssistInvocationContext context,
			IProgressMonitor monitor) {
		if (!(context instanceof JavaContentAssistInvocationContext)) {
			return Collections.emptyList();
		}
		JavaContentAssistInvocationContext javaContext = (JavaContentAssistInvocationContext) context;

		ICompilationUnit cu = javaContext.getCompilationUnit();
		int offset = context.getInvocationOffset();
		PropertyStringFinder finder = new PropertyStringFinder(cu, offset);

		String prefix = getPrefix(finder, offset);
		if (prefix == null) {
			if ("order".equals(finder.getMemberName())) {
				return getOrderProposal(finder.getRegion(), finder.getText(), finder.getTextRegion(), offset);
			}
			return Collections.emptyList();
		}

		IRegion region = finder.getRegion();
		ModelDefinition model = finder.getModel();
		List<ICompletionProposal> list = new ArrayList<ICompletionProposal>();
		for (Property property : ModelUtil.getProperties(model)) {
			String s = property.getName();
			if (s.startsWith(prefix)) {
				int start, len;
				if (prefix.isEmpty()) {
					start = offset;
					len = 0;
				} else {
					start = region.getOffset();
					len = region.getLength();
				}
				CompletionProposal proposal = new CompletionProposal(s, start, len, s.length());
				list.add(proposal);
			}
		}
		return list;
	}

	private String getPrefix(PropertyStringFinder finder, int offset) {
		String name = finder.getPropertyName();
		if (name == null) {
			return "";
		}
		IRegion region = finder.getRegion();
		if (region.getOffset() + region.getLength() < offset) {
			return null;
		}
		int len = offset - region.getOffset();
		if (len <= 0) {
			return "";
		}
		if (len > name.length()) {
			return name;
		}
		return name.substring(0, len);
	}

	private List<ICompletionProposal> getOrderProposal(IRegion propertyRegion, String text, IRegion textRegion,
			int offset) {
		int propertyEnd = propertyRegion.getOffset() + propertyRegion.getLength();
		int textEnd = textRegion.getOffset() + textRegion.getLength();
		int start = propertyEnd + 1;
		if (textEnd <= start) {
			start = textEnd;
		}
		int len = textEnd - propertyEnd - 1;
		if (len < 0) {
			len = 0;
		}

		String as = "ASC";
		CompletionProposal asc = new CompletionProposal(as, start, len, as.length());
		String ds = "DESC";
		CompletionProposal desc = new CompletionProposal(ds, start, len, ds.length());
		return Arrays.<ICompletionProposal> asList(asc, desc);
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