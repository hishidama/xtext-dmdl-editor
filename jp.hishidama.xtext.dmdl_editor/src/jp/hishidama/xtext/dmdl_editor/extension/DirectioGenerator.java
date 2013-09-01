package jp.hishidama.xtext.dmdl_editor.extension;

import java.text.MessageFormat;

/**
 * Direct I/OのImporter/Exporterクラスのソースを生成する.
 * 
 * @since 2013.07.15
 */
public abstract class DirectioGenerator extends DMDLImporterExporterGenerator {
	public static final String GROUP_DIRECTIO = "@directio";
	public static final String GROUP_DIRECTIO_EXPORTER = "@directio Exporter";

	public static final String KEY_BASE_PATH = "directio.basePath";
	public static final String KEY_RESOURCE_PATTERN = "directio.resourcePattern";
	public static final String KEY_ORDER = "directio.order";
	public static final String KEY_DELETE_PATTERN = "directio.deletePattern";

	// フィールド定義用
	/**
	 * DirectIO CSV項目の追加.
	 */
	protected final void addFieldDirectioCsv() {
		addFieldDirectio("csv");
	}

	/**
	 * DirectIO SequenceFile項目の追加.
	 * 
	 * @since 2013.08.03
	 */
	protected final void addFieldDirectioSeqfile() {
		addFieldDirectio("seq");
	}

	protected final void addFieldDirectio(String ext) {
		addTextField(GROUP_DIRECTIO, KEY_BASE_PATH, true, "getBasePath()", "ベースパス", "論理パス\n"
				+ "「example」と入力すると\nreturn \"example\";\nになります。");
		String tip = MessageFormat.format("ファイル名のパターン\n" + "「data.{0}」と入力すると\nreturn \"data.{0}\";\nになります。", ext);
		addTextField(GROUP_DIRECTIO, KEY_RESOURCE_PATTERN, true, "getResourcePattern()", "リソースパターン", tip);
	}

	/**
	 * DiorectIO CSV Exporter項目の追加.
	 */
	protected final void addFieldDirectioCsvExporter() {
		addFieldDirectioExporter("csv");
	}

	/**
	 * DiorectIO SequenceFile Exporter項目の追加.
	 * 
	 * @since 2013.08.03
	 */
	protected final void addFieldDirectioSeqfileExporter() {
		addFieldDirectioExporter("seq");
	}

	protected final void addFieldDirectioExporter(String ext) {
		addTextField(GROUP_DIRECTIO_EXPORTER, KEY_ORDER, false, "getOrder()", "ソート順", "出力ファイルのソート用カラム名（カンマ区切り）\n"
				+ "「+id1, -id2」と入力すると\nreturn Arrays.asList(\"+id1\", \"-id2\");\nになります。");
		String tip = MessageFormat.format("出力を行う前に削除するファイル名パターン（カンマ区切り）\n"
				+ "「data*.{0}, test*.{0}」と入力すると\nreturn Arrays.asList(\"data*.{0}\", \"test*.{0}\");\nになります。", ext);
		addTextField(GROUP_DIRECTIO_EXPORTER, KEY_DELETE_PATTERN, false, "getDeletePatterns()", "削除パターン", tip);
	}

	// メソッド生成用
	/**
	 * getBasePath()メソッド生成.
	 * 
	 * @param sb
	 *            生成先
	 */
	protected final void appendMethodBasePath(StringBuilder sb) {
		appendMethod(sb, "getBasePath", getValue(KEY_BASE_PATH));
	}

	/**
	 * getResourcePattern()メソッド生成.
	 * 
	 * @param sb
	 *            生成先
	 */
	protected final void appendMethodResourcePattern(StringBuilder sb) {
		appendMethod(sb, "getResourcePattern", getValue(KEY_RESOURCE_PATTERN));
	}

	/**
	 * getOrder()メソッド生成.
	 * 
	 * @param sb
	 *            生成先
	 */
	protected final void appendMethodOrder(StringBuilder sb) {
		appendMethodList(sb, "getOrder", getValue(KEY_ORDER));
	}

	/**
	 * getDeletePatterns()メソッド生成.
	 * 
	 * @param sb
	 *            生成先
	 */
	protected final void appendMethodDeletePatterns(StringBuilder sb) {
		appendMethodList(sb, "getDeletePatterns", getValue(KEY_DELETE_PATTERN));
	}
}
