package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jp.hishidama.eclipse_plugin.util.FileUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;

public class TestExcelCopyTask implements IRunnableWithProgress {

	private IProject project;

	private Set<String> set = new HashSet<String>();
	private Map<String, AsakusaExcel> map = new LinkedHashMap<String, AsakusaExcel>();

	public TestExcelCopyTask(IProject project) {
		this.project = project;
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

	private ExcelSheetCopy sheetCopy;

	// @Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		monitor.beginTask("create excel workbook", 1 + map.size() * 2);
		try {
			sheetCopy = new ExcelSheetCopy();
			sheetCopy.initialize(project, new SubProgressMonitor(monitor, 1));

			for (AsakusaExcel excel : map.values()) {
				cancelCheck(monitor);
				IFile dst = project.getFile(excel.dstExcelName);
				FileUtil.createFolder(project, dst);
				String dstBookPath = FileUtil.getLocation(dst);
				Workbook dstBook = createNewBook(dstBookPath);

				copySheets(dstBook, excel.list, new SubProgressMonitor(monitor, 1));

				cancelCheck(monitor);
				save(dstBook, dstBookPath);
				dst.refreshLocal(IResource.DEPTH_ONE, new SubProgressMonitor(monitor, 1));
			}
		} catch (CoreException e) {
			throw new InvocationTargetException(e);
		} catch (IOException e) {
			throw new InvocationTargetException(e);
		} finally {
			monitor.done();
		}
	}

	protected Workbook createNewBook(String dstBookName) {
		if (dstBookName.endsWith(".xls")) {
			return new HSSFWorkbook();
		} else {
			return new XSSFWorkbook();
		}
	}

	private void copySheets(Workbook dstBook, List<SheetName> list, IProgressMonitor monitor) throws IOException,
			InterruptedException {
		monitor.beginTask("copy excel sheet", list.size());
		try {
			for (SheetName name : list) {
				cancelCheck(monitor);
				IFile src = project.getFile(name.srcExcelName);
				String srcBookPath = FileUtil.getLocation(src);

				Workbook srcBook = getInputWorkbook(srcBookPath);
				Sheet srcSheet = srcBook.getSheet(name.srcSheetName);
				Sheet dstSheet = dstBook.createSheet(name.dstSheetName);
				sheetCopy.execute(srcSheet, dstSheet);
			}
		} finally {
			monitor.done();
		}
	}

	private Map<String, Workbook> inputMap = new HashMap<String, Workbook>();

	private Workbook getInputWorkbook(String name) throws IOException {
		Workbook book = inputMap.get(name);
		if (book == null) {
			File file = new File(name);
			try {
				book = WorkbookFactory.create(file);
				inputMap.put(name, book);
			} catch (IOException e) {
				throw e;
			} catch (Exception e) {
				throw new IOException(e);
			}
		}
		return book;
	}

	private void save(Workbook book, String path) throws IOException {
		File file = new File(path);
		FileOutputStream os = new FileOutputStream(file);
		try {
			book.write(os);
		} finally {
			try {
				os.close();
			} catch (IOException e) {
				// ignore
			}
		}
	}

	protected final void cancelCheck(IProgressMonitor monitor) throws InterruptedException {
		if (monitor.isCanceled()) {
			throw new InterruptedException();
		}
	}
}
