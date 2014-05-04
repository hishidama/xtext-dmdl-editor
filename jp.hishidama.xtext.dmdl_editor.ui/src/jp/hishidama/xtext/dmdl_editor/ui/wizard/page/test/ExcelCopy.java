package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import jp.hishidama.eclipse_plugin.util.FileUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;

public class ExcelCopy {

	private IProject project;

	private Map<String, AsakusaExcel> map = new LinkedHashMap<String, AsakusaExcel>();

	public ExcelCopy(IProject project) {
		this.project = project;
	}

	public void add(String excelName, String sheetName, String srcExcelName, String srcSheetName) {
		if (sheetName == null || sheetName.isEmpty()) {
			return;
		}

		AsakusaExcel excel = map.get(excelName);
		if (excel == null) {
			excel = new AsakusaExcel();
			excel.dstExcelName = excelName;
			map.put(excelName, excel);
		}
		excel.add(sheetName, srcExcelName, srcSheetName);
	}

	public void execute() {
		for (AsakusaExcel excel : map.values()) {
			IFile dst = project.getFile(excel.dstExcelName);
			try {
				FileUtil.createFolder(project, dst);
			} catch (CoreException e) {
				LogUtil.logWarn(dst.toString(), e);
			}
			for (SheetName name : excel.list) {
				IFile src = project.getFile(name.srcExcelName);
				if (FileUtil.copy(src, dst)) {
					break;
				}
			}

			try {
				Workbook dstBook = WorkbookFactory.create(dst.getContents());
				for (SheetName name : excel.list) {
					if (!name.srcSheetName.equals(name.dstSheetName)) {
						int n = dstBook.getSheetIndex(name.srcSheetName);
						if (n >= 0) {
							dstBook.setSheetName(n, name.dstSheetName);
						}
					}
				}
				save(dstBook, dst);
			} catch (Exception e) {
				LogUtil.logWarn(dst.toString(), e);
			}
		}
	}

	void execute0() {
		// TODO セルのプルダウンのコピーが出来ないので、このメソッドは保留
		for (AsakusaExcel excel : map.values()) {
			Workbook dstBook;
			if (excel.dstExcelName.endsWith(".xls")) {
				dstBook = new HSSFWorkbook();
			} else {
				dstBook = new XSSFWorkbook();
			}

			for (SheetName name : excel.list) {
				Workbook srcBook = getInputWorkbook(name.srcExcelName);
				if (srcBook == null) {
					continue;
				}
				Sheet srcSheet = srcBook.getSheet(name.srcSheetName);
				if (srcSheet == null) {
					continue;
				}

				Sheet dstSheet = dstBook.createSheet(name.dstSheetName);
				copy(srcSheet, dstSheet);
			}

			IFile dst = project.getFile(excel.dstExcelName);
			try {
				FileUtil.createFolder(project, dst);
			} catch (CoreException e) {
				LogUtil.logWarn(dst.toString(), e);
			}
			save(dstBook, dst);
		}
	}

	private void save(Workbook book, IFile file) {
		try {
			FileOutputStream os = new FileOutputStream(FileUtil.getLocation(file));
			try {
				book.write(os);
			} catch (IOException e) {
				LogUtil.logWarn(file.toString(), e);
			} finally {
				try {
					os.close();
				} catch (IOException e) {
					// do nothing
				}
			}
		} catch (FileNotFoundException e) {
			LogUtil.logWarn(file.toString(), e);
		}
	}

	private Map<String, Workbook> inputMap = new HashMap<String, Workbook>();

	public Workbook getInputWorkbook(String name) {
		Workbook book = inputMap.get(name);
		if (book == null) {
			IFile file = project.getFile(name);
			try {
				book = WorkbookFactory.create(file.getContents());
				inputMap.put(name, book);
			} catch (Exception e) {
				LogUtil.warnStatus(file.toString(), e);
			}
		}
		return book;
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

	private void copy(Sheet src, Sheet dst) {
		dst.setAutobreaks(src.getAutobreaks());
		dst.setDefaultColumnWidth(src.getDefaultColumnWidth());
		dst.setDefaultRowHeight(src.getDefaultRowHeight());
		dst.setDisplayFormulas(src.isDisplayFormulas());
		dst.setDisplayGridlines(src.isDisplayGridlines());
		dst.setDisplayRowColHeadings(src.isDisplayRowColHeadings());
		dst.setDisplayZeros(src.isDisplayZeros());
		dst.setFitToPage(src.getFitToPage());
		dst.setForceFormulaRecalculation(src.getForceFormulaRecalculation());
		dst.setHorizontallyCenter(src.getHorizontallyCenter());
		dst.setPrintGridlines(src.isPrintGridlines());
		dst.setRightToLeft(src.isRightToLeft());
		dst.setRowSumsBelow(src.getRowSumsBelow());
		dst.setRowSumsRight(src.getRowSumsRight());
		// dst.setSelected(src.isSelected());
		dst.setVerticallyCenter(src.getVerticallyCenter());

		for (Iterator<Row> i = src.rowIterator(); i.hasNext();) {
			Row srcRow = i.next();
			Row dstRow = dst.createRow(srcRow.getRowNum());

			dstRow.setHeight(srcRow.getHeight());
			dstRow.setZeroHeight(srcRow.getZeroHeight());
			CellStyle dstStyle = cloneCellStyle(srcRow.getRowStyle(), dst.getWorkbook());
			if (dstStyle != null) {
				dstRow.setRowStyle(dstStyle);
			}

			for (Iterator<Cell> j = srcRow.cellIterator(); j.hasNext();) {
				Cell srcCell = j.next();
				if (srcCell != null) {
					Cell dstCell = dstRow.createCell(srcCell.getColumnIndex(), srcCell.getCellType());
					copy(srcCell, dstCell);
				}
			}
		}

		int size = src.getNumMergedRegions();
		for (int i = 0; i < size; i++) {
			dst.addMergedRegion(src.getMergedRegion(i));
		}
	}

	private void copy(Cell src, Cell dst) {
		dst.setCellComment(src.getCellComment());
		switch (src.getCellType()) {
		case Cell.CELL_TYPE_NUMERIC:
			dst.setCellValue(src.getNumericCellValue());
			break;
		case Cell.CELL_TYPE_STRING:
			dst.setCellValue(src.getStringCellValue());
			break;
		case Cell.CELL_TYPE_FORMULA:
			dst.setCellFormula(src.getCellFormula());
			break;
		case Cell.CELL_TYPE_BLANK:
			break;
		case Cell.CELL_TYPE_BOOLEAN:
			dst.setCellValue(src.getBooleanCellValue());
			break;
		case Cell.CELL_TYPE_ERROR:
			dst.setCellErrorValue(src.getErrorCellValue());
			break;
		default:
			break;
		}
		dst.setCellStyle(cloneCellStyle(src.getCellStyle(), dst.getSheet().getWorkbook()));
		setHyperlink(dst, src.getHyperlink());
	}

	private CellStyle cloneCellStyle(CellStyle srcStyle, Workbook dstBook) {
		if (srcStyle == null) {
			return null;
		}
		CellStyle dstStyle = dstBook.createCellStyle();
		if (dstStyle.getClass() == srcStyle.getClass()) {
			dstStyle.cloneStyleFrom(srcStyle);
			return dstStyle;
		}
		LogUtil.logWarn("TODO+++cellStyle clone"); // TODO
		return null;
	}

	private void setHyperlink(Cell dst, Hyperlink srcLink) {
		if (srcLink == null) {
			return;
		}
		try {
			dst.setHyperlink(srcLink);
		} catch (Exception e) {
			LogUtil.logWarn("TODO+++cellLink copy", e); // TODO
		}
	}
}
