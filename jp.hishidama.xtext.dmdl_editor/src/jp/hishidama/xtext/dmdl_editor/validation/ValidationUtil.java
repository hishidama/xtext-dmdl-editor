package jp.hishidama.xtext.dmdl_editor.validation;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;

public class ValidationUtil {

	public static IStatus validateName(String title, String name) {
		for (int i = 0; i < name.length(); i++) {
			char c = name.charAt(i);
			if (('a' <= c && c <= 'z') || ('0' <= c && c <= '9' || c == '_')) {
				continue;
			} else {
				return new ErrorStatus("{0}に使える文字は英小文字・数字・アンダースコアのみです。", title);
			}
		}
		if (name.startsWith("_")) {
			return new ErrorStatus("{0}の最初の文字にアンダースコアは使用できません。", title);
		}
		if (name.endsWith("_")) {
			return new ErrorStatus("{0}の最後の文字にアンダースコアは使用できません。", title);
		}
		if (name.indexOf("__") >= 0) {
			return new ErrorStatus("{0}の中でアンダースコアを2つ以上続けて使うことは出来ません。", title);
		}

		String[] ss = name.split("\\_");
		for (String s : ss) {
			if (s.length() > 0) {
				char c = s.charAt(0);
				if ('a' <= c && c <= 'z') {
					// ok
				} else {
					return new WarningStatus("{0}に含まれる各単語（アンダースコアで区切られた文字列）はアルファベットから始めることが推奨されています。", title);
				}
			}
		}

		return Status.OK_STATUS;
	}
}
