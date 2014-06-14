package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.TestSheetUtil;
import jp.hishidama.eclipse_plugin.util.FileUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.operation.IRunnableContext;

public class ExcelCopy {

	private IProject project;

	private IRunnableContext runner;

	private Set<String> set = new HashSet<String>();
	private Map<String, AsakusaExcel> map = new LinkedHashMap<String, AsakusaExcel>();

	public ExcelCopy(IProject project, IRunnableContext runner) {
		this.project = project;
		this.runner = runner;
	}

	public void add(String excelName, String sheetName, String srcExcelName, String srcSheetName) {
		if (StringUtil.isEmpty(excelName) || StringUtil.isEmpty(sheetName)) {
			return;
		}

		String key = String.format("%s#%s", excelName, sheetName);
		if (set.contains(key)) {
			return;
		}
		set.add(key);

		AsakusaExcel excel = map.get(excelName);
		if (excel == null) {
			excel = new AsakusaExcel();
			excel.dstExcelName = excelName;
			map.put(excelName, excel);
		}
		excel.add(sheetName, srcExcelName, srcSheetName);
	}

	public void execute() throws CoreException {
		Map<String, List<Object[]>> m = new LinkedHashMap<String, List<Object[]>>();
		for (AsakusaExcel excel : map.values()) {
			IFile dst = project.getFile(excel.dstExcelName);
			FileUtil.createFolder(project, dst);
			String dstBookName = FileUtil.getLocation(dst);

			List<Object[]> list = new ArrayList<Object[]>(excel.list.size());
			for (SheetName name : excel.list) {
				Object[] object = new Object[3];
				object[0] = name.dstSheetName;
				IFile src = project.getFile(name.srcExcelName);
				object[1] = FileUtil.getLocation(src);
				object[2] = name.srcSheetName;
				list.add(object);
			}
			m.put(dstBookName, list);
		}

		TestSheetUtil.copySheets(project, m, runner);
	}

	protected static class AsakusaExcel {
		public String dstExcelName;
		public List<SheetName> list = new ArrayList<SheetName>();

		public void add(String sheetName, String srcExcelName, String srcSheetName) {
			SheetName name = findName(sheetName);
			if (name == null) {
				name = new SheetName();
				name.dstSheetName = sheetName;
				list.add(name);
			}
			name.srcExcelName = srcExcelName;
			name.srcSheetName = srcSheetName;
		}

		private SheetName findName(String sheetName) {
			for (SheetName name : list) {
				if (sheetName.equals(name.dstSheetName)) {
					return name;
				}
			}
			return null;
		}
	}

	protected static class SheetName {
		public String dstSheetName;
		public String srcExcelName;
		public String srcSheetName;
	}
}
