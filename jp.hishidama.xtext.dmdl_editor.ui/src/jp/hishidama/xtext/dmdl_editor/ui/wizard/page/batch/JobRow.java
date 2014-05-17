package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.batch;

import java.util.ArrayList;
import java.util.List;

public class JobRow {
	public String name;
	public String className;
	public List<JobNamePair> list = new ArrayList<JobNamePair>();

	public static class JobNamePair {
		public String name;
		public String className;
	}

	public String getListText() {
		StringBuilder sb = new StringBuilder(256);
		for (JobNamePair pair : list) {
			if (sb.length() != 0) {
				sb.append(", ");
			}
			sb.append(pair.name);
		}
		return sb.toString();
	}

	public boolean containsList(String className) {
		for (JobNamePair pair : list) {
			if (className.equals(pair.className)) {
				return true;
			}
		}
		return false;
	}
}
