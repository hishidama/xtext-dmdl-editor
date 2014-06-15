package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.excel;

import java.lang.reflect.InvocationTargetException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;

public class ExcelSheetCopy {

	private FillRuleDataValidation fillRuleDataValidation;

	public void initialize(IProject project, IProgressMonitor monitor) throws InvocationTargetException,
			InterruptedException {
		fillRuleDataValidation = new FillRuleDataValidation(project);
		fillRuleDataValidation.initialize(monitor);
	}

	public void execute(Sheet src, Sheet dst) {
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

		if (src.getSheetName().equals("rule")) {
			// プルダウン（DataValidation）の取得が出来ないので、新規にセットする
			fillRuleDataValidation.fillRuleDataValidation(dst);
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
		System.out.println("TODO+++cellStyle clone"); // TODO
		return null;
	}

	private void setHyperlink(Cell dst, Hyperlink srcLink) {
		if (srcLink == null) {
			return;
		}
		try {
			dst.setHyperlink(srcLink);
		} catch (Exception e) {
			System.out.println("TODO+++cellLink copy"); // TODO
			e.printStackTrace();
		}
	}
}
