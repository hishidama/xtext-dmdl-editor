package jp.hishidama.xtext.dmdl_editor.ui.wizard.page.test.excel;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import jp.hishidama.eclipse_plugin.asakusafw_wrapper.extension.AsakusafwConfiguration;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.BuildPropertiesUtil;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.TestSheetUtil;
import jp.hishidama.eclipse_plugin.asakusafw_wrapper.util.TestSheetUtil.SheetInfo;
import jp.hishidama.eclipse_plugin.util.FileUtil;
import jp.hishidama.eclipse_plugin.util.StringUtil;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.SubProgressMonitor;
import org.eclipse.jface.operation.IRunnableWithProgress;

public class TestExcelGenerateTask implements IRunnableWithProgress {

	private IProject project;

	private String flowClassName;
	private String indexSheetName;

	private Set<String> set = new HashSet<String>();
	private Map<String, AsakusaExcel> map = new LinkedHashMap<String, AsakusaExcel>();

	public TestExcelGenerateTask(IProject project) {
		this.project = project;
	}

	public void set(String flowClassName, String indexSheetName) {
		this.flowClassName = flowClassName;
		this.indexSheetName = indexSheetName;
	}

	public void add(String dstExcelName, String dstSheetName, String dstSheetDescription, String srcModelName,
			String srcModelDescription, String srcSheetName) {
		if (StringUtil.isEmpty(dstExcelName) || StringUtil.isEmpty(dstSheetName)) {
			return;
		}

		String key = String.format("%s#%s", dstExcelName, dstSheetName);
		if (set.contains(key)) {
			return;
		}
		set.add(key);

		AsakusaExcel excel = map.get(dstExcelName);
		if (excel == null) {
			excel = new AsakusaExcel();
			excel.dstExcelName = dstExcelName;
			map.put(dstExcelName, excel);
		}
		excel.add(dstSheetName, dstSheetDescription, srcModelName, srcModelDescription, srcSheetName);
	}

	public boolean nonEmpty() {
		return !map.isEmpty();
	}

	protected static class AsakusaExcel {
		public String dstExcelName;
		public IFile dstFile;
		public List<SheetName> list = new ArrayList<SheetName>();

		public void add(String sheetName, String sheetDescription, String srcModelName, String srcModelDescription,
				String srcSheetName) {
			SheetName name = findName(sheetName);
			if (name == null) {
				name = new SheetName();
				name.dstSheetName = sheetName;
				list.add(name);
			}
			name.dstSheetDescription = sheetDescription;
			name.srcModelName = srcModelName;
			name.srcModelDescription = srcModelDescription;
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
		public String dstSheetDescription;
		public String srcModelName;
		public String srcModelDescription;
		public String srcSheetName;
	}

	// @Override
	public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
		monitor.beginTask("generate test sheet", 100 + map.values().size());
		try {
			String version = getAsakusaFwVersion();
			List<SheetInfo> names = getSheetNameList(monitor);
			monitor.worked(10);

			TestSheetUtil.generateTestSheet(project, version, flowClassName, indexSheetName, names,
					new SubProgressMonitor(monitor, 90));

			for (AsakusaExcel excel : map.values()) {
				excel.dstFile.refreshLocal(IResource.DEPTH_ONE, new SubProgressMonitor(monitor, 1));
			}
		} catch (CoreException e) {
			throw new InvocationTargetException(e);
		} finally {
			monitor.done();
		}
	}

	private String getAsakusaFwVersion() {
		String version = null;
		AsakusafwConfiguration c = BuildPropertiesUtil.getAsakusafwConfiguration(project);
		if (c != null) {
			// version = c.getVersionMin();
			version = c.getCurrentVersion(project);
		}
		if (version == null) {
			version = "UNKNOWN";
		}
		return version;
	}

	private List<SheetInfo> getSheetNameList(IProgressMonitor monitor) throws InterruptedException, CoreException {
		List<SheetInfo> list = new ArrayList<SheetInfo>(map.size());
		for (AsakusaExcel excel : map.values()) {
			cancelCheck(monitor);

			IFile dstFile = project.getFile(excel.dstExcelName);
			excel.dstFile = dstFile;
			FileUtil.createFolder(project, dstFile);
			String dstBookPath = FileUtil.getLocation(dstFile);

			for (SheetName sheet : excel.list) {
				SheetInfo info = new SheetInfo();
				info.srcModelName = sheet.srcModelName;
				info.srcModelDescription = sheet.srcModelDescription;
				info.srcSheetName = sheet.srcSheetName;
				info.dstBookName = dstBookPath;
				info.dstSheetName = sheet.dstSheetName;
				info.dstSheetDescription = sheet.dstSheetDescription;
				list.add(info);
			}
		}
		return list;
	}

	protected final void cancelCheck(IProgressMonitor monitor) throws InterruptedException {
		if (monitor.isCanceled()) {
			throw new InterruptedException();
		}
	}
}
