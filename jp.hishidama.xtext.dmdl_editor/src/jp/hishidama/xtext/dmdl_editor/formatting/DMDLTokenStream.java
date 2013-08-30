package jp.hishidama.xtext.dmdl_editor.formatting;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.AbstractRule;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.formatting.impl.BaseTokenStream;
import org.eclipse.xtext.parsetree.reconstr.IHiddenTokenHelper;
import org.eclipse.xtext.parsetree.reconstr.ITokenStream;

class DMDLTokenStream extends BaseTokenStream {
	IHiddenTokenHelper hiddenTokenHelper;

	public DMDLTokenStream(ITokenStream out, IHiddenTokenHelper hiddenTokenHelper) {
		super(out);

		this.hiddenTokenHelper = hiddenTokenHelper;
	}

	private class Token {
		private final boolean hidden;
		private final EObject grammarElement;
		private final String value;

		public Token(boolean hidden, EObject grammarElement, String value) {
			this.hidden = hidden;
			this.grammarElement = grammarElement;
			this.value = value;
		}

		public boolean isComment() {
			AbstractRule rule = GrammarUtil.containingRule(grammarElement);
			if (rule != null) {
				return hiddenTokenHelper.isComment(rule);
			}
			return false;
		}

		public boolean containsLf() {
			return value.indexOf('\n') >= 0;
		}

		public void write() throws IOException {
			outWrite(hidden, grammarElement, value);
		}
	}

	private boolean block = false;
	private List<Token> tokenList = new ArrayList<Token>();
	private boolean comma = false;

	@Override
	public void writeHidden(EObject grammarElement, String value) throws IOException {
		write(true, grammarElement, value);
	}

	@Override
	public void writeSemantic(EObject grammarElement, String value) throws IOException {
		write(false, grammarElement, value);
	}

	private void write(boolean hidden, EObject grammarElement, String value) throws IOException {
		if ("(".equals(value)) {
			outWrite(hidden, grammarElement, value);
			block = true;
			comma = false;
		} else if (block && ")".equals(value)) {
			if (comma) {
				for (Token t : tokenList) {
					t.write();
				}
			} else {
				for (Token t : tokenList) {
					if (t.isComment() || !t.containsLf()) {
						t.write();
					}
				}
			}
			tokenList.clear();
			outWrite(hidden, grammarElement, value);
			block = false;
		} else if (block) {
			tokenList.add(new Token(hidden, grammarElement, value));
			if (",".equals(value)) {
				comma = true;
			}
		} else {
			outWrite(hidden, grammarElement, value);
		}
	}

	@Override
	public void flush() throws IOException {
		if (block) {
			for (Token t : tokenList) {
				t.write();
			}
			block = false;
		}
		tokenList.clear();
		super.flush();
	}

	private void outWrite(boolean hidden, EObject grammarElement, String value) throws IOException {
		if (hidden) {
			out.writeHidden(grammarElement, value);
		} else {
			out.writeSemantic(grammarElement, value);
		}
	}
}
