package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.excel;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.TestSheetUtil;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.TestSheetUtil.RuleItem;

import org.apache.poi.hssf.usermodel.DVConstraint;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataValidation;
import org.apache.poi.ss.usermodel.DataValidationHelper;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.util.CellRangeAddressList;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;

/**
 * @see com.asakusafw.testdata.generator.excel.SheetBuilder
 */
public class FillRuleDataValidation {

	private IProject project;

	private Map<String, RuleItem> ruleItemMap;

	public FillRuleDataValidation(IProject project) {
		this.project = project;
	}

	public void initialize(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		ruleItemMap = TestSheetUtil.getRuleItem(project, monitor);
	}

	public void fillRuleDataValidation(Sheet sheet) {
		if (ruleItemMap == null) {
			return;
		}
		fillRuleTotalCondition(sheet);
		fillRulePropertyConditions(sheet);
	}

	private void fillRuleTotalCondition(Sheet sheet) {
		// 全体の比較
		RuleItem item = ruleItemMap.get("TotalConditionKind");
		Cell value = getCell(sheet, item, 0, 1);
		if (value == null) {
			return;
		}
		setExplicitListConstraint(sheet, item.getOptions(), value.getRowIndex(), value.getColumnIndex(),
				value.getRowIndex(), value.getColumnIndex());
	}

	private void fillRulePropertyConditions(Sheet sheet) {
		RuleItem item = ruleItemMap.get("ValueConditionKind");
		int start = item.getRowIndex() + 1;
		int end = getEndRowIndex(sheet, start, item.getColumnIndex());
		// 値の比較
		setExplicitListConstraint(sheet, item.getOptions(), start, item.getColumnIndex(), end, item.getColumnIndex());
		// NULLの比較
		item = ruleItemMap.get("NullityConditionKind");
		setExplicitListConstraint(sheet, item.getOptions(), start, item.getColumnIndex(), end, item.getColumnIndex());
	}

	private int getEndRowIndex(Sheet sheet, int start, int columnIndex) {
		for (int i = start; i < Integer.MAX_VALUE; i++) {
			Cell cell = getCell(sheet, i, columnIndex);
			if (cell == null) {
				return i - 1;
			}
		}
		return Integer.MAX_VALUE;
	}

	private Cell getCell(Sheet sheet, RuleItem item, int rowOffset, int columnOffset) {
		return getCell(sheet, item.getRowIndex() + rowOffset, item.getColumnIndex() + columnOffset);
	}

	private Cell getCell(Sheet sheet, int rowIndex, int columnIndex) {
		Row row = sheet.getRow(rowIndex);
		if (row == null) {
			return null;
		}
		Cell cell = row.getCell(columnIndex);
		return cell;
	}

	private void setExplicitListConstraint(Sheet sheet, String[] list, int firstRow, int firstCol, int lastRow,
			int lastCol) {
		assert sheet != null;
		assert list != null;
		CellRangeAddressList addressList = new CellRangeAddressList(firstRow, lastRow, firstCol, lastCol);
		DVConstraint constraint = DVConstraint.createExplicitListConstraint(list);
		DataValidationHelper helper = sheet.getDataValidationHelper();
		DataValidation validation = helper.createValidation(constraint, addressList);
		validation.setEmptyCellAllowed(true);
		validation.setSuppressDropDownArrow(false);
		sheet.addValidationData(validation);
	}
}
