package jp.hishidama.xtext.dmdl_editor.ui.extension;

/**
 * WindGateのImporter/Exporterクラスのソースを生成する.
 * 
 * @since 2013.07.15
 */
public abstract class WindgateGenerator extends DMDLImporterExporterGenerator {
	public static final String GROUP_WINDGATE = "@windgate";
	public static final String GROUP_WINDGATE_CSV = "@windgate.csv";
	public static final String GROUP_WINDGATE_JDBC = "@windgate.jdbc";
	public static final String GROUP_WINDGATE_JDBC_IMPORTER = "@windgate.jdbc Importer";
	public static final String GROUP_WINDGATE_JDBC_EXPORTER = "@windgate.jdbc Exporter";

	public static final String KEY_PROFILE_NAME = "windate.profileName";
	public static final String KEY_PATH = "windate.path";
	public static final String KEY_TABLE_NAME = "windate.jdbc.tableName";
	public static final String KEY_COLUMN_NAMES = "windate.jdbc.columnNames";
	public static final String KEY_CONDITION = "windate.jdbc.condition";
	public static final String KEY_CUSTOM_TRUNCATE = "windate.jdbc.customTruncate";

	// フィールド定義用
	/**
	 * WindGate項目の追加.
	 */
	protected final void addFieldWindgate() {
		addTextField(null, GROUP_WINDGATE, KEY_PROFILE_NAME, true, "getProfileName()", "プロファイル", "プロファイル\n"
				+ "「example」と入力すると\nreturn \"example\";\nになります。\n"
				+ "この例の場合、$ASAKUSA_HOME/windgate/profile/example.properties が使われることになります。");
	}

	/**
	 * WindGate CSV項目の追加.
	 */
	protected final void addFieldWindgateCsv() {
		addFieldWindgatePath(GROUP_WINDGATE_CSV);
	}

	/**
	 * WindGateのpath項目の追加.
	 */
	protected final void addFieldWindgatePath(String groupName) {
		addTextField(null, groupName, KEY_PATH, true, "getPath()", "ファイルのパス",
				"プロファイル内で指定されているresource.local.basePath からの相対パス\n" + "「data.csv」と入力すると\nreturn \"data.csv\";\nになります。");
	}

	/**
	 * WindGate JDBC項目の追加.
	 */
	protected final void addFieldWindgateJdbc() {
		addTextField(null, GROUP_WINDGATE_JDBC, KEY_TABLE_NAME, false, "getTableName()", "テーブル名", "テーブル名\n"
				+ "「TABLE1」と入力すると\nreturn \"TABLE1\";\n未入力だとgetTableName()は生成（オーバーライド）されず、DMDLで指定されたテーブル名が使われます。");
		addTextField(null, GROUP_WINDGATE_JDBC, KEY_COLUMN_NAMES, false, "getColumnNames()", "カラム名",
				"絞り込むカラム名（カンマ区切り）\n" + "「COL1, COL2」と入力すると\nreturn Arrays.asList(\"COL1\", \"COL2\");\n"
						+ "未入力だと\nreturn super.getColumnNames();\nとなります。");
	}

	/**
	 * WindGate JDBC Importer項目の追加.
	 */
	protected final void addFieldWindgateJdbcImporter() {
		addTextField(null, GROUP_WINDGATE_JDBC_IMPORTER, KEY_CONDITION, false, "getCondition()", "WHERE条件",
				"インポーターが利用する抽出条件（SQLの条件式）\n" + "「COL1 = 123」と入力すると\nreturn \"COL1 = 123\";\nになります。");
	}

	/**
	 * WindGate JDBC Exporter項目の追加.
	 */
	protected final void addFieldWindgateJdbcExporter() {
		addTextField("0.7.3", GROUP_WINDGATE_JDBC_EXPORTER, KEY_CUSTOM_TRUNCATE, false, "getCustomTruncate()",
				"削除SQL文", "INSERT前にテーブルのデータを削除する為のSQL文\n"
						+ "「DELETE FROM ZZZ」と入力すると\nreturn \"DELETE FROM ZZZ\";\nになります。");
	}

	// メソッド生成用
	/**
	 * getProfileName()メソッド生成.
	 * 
	 * @param sb
	 *            生成先
	 */
	protected final void appendMethodProfileName(StringBuilder sb) {
		appendMethod(sb, "getProfileName", getValue(KEY_PROFILE_NAME));
	}

	/**
	 * getPath()メソッド生成.
	 * 
	 * @param sb
	 *            生成先
	 */
	protected final void appendMethodPath(StringBuilder sb) {
		appendMethod(sb, "getPath", getValue(KEY_PATH));
	}

	/**
	 * getTableName()メソッド生成.
	 * 
	 * @param sb
	 *            生成先
	 */
	protected final void appendMethodTableName(StringBuilder sb) {
		String name = getValue(KEY_TABLE_NAME);
		if (!name.trim().isEmpty()) {
			appendMethod(sb, "getTableName", name);
		}
	}

	/**
	 * getColumnNames()メソッド生成.
	 * 
	 * @param sb
	 *            生成先
	 */
	protected final void appendMethodColumnNames(StringBuilder sb) {
		appendMethodList(sb, "getColumnNames", getValue(KEY_COLUMN_NAMES));
	}

	/**
	 * getCondition()メソッド生成.
	 * 
	 * @param sb
	 *            生成先
	 */
	protected final void appendMethodCondition(StringBuilder sb) {
		String cond = getValue(KEY_CONDITION);
		if (cond.trim().isEmpty()) {
			appendMethodNull(sb, "getCondition");
		} else {
			appendMethod(sb, "getCondition", cond);
		}
	}

	/**
	 * getCustomTruncate()メソッド生成.
	 * 
	 * @param sb
	 *            生成先
	 */
	protected final void appendMethodCustomTruncate(StringBuilder sb) {
		String sql = getValue(KEY_CUSTOM_TRUNCATE);
		if (!sql.trim().isEmpty()) {
			appendMethod(sb, "getCustomTruncate", sql);
		}
	}
}
