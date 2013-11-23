package jp.hishidama.xtext.dmdl_editor.extension;

import java.util.List;

import jp.hishidama.eclipse_plugin.util.StringUtil;

/**
 * 属性追加削除ウィザードの定義.
 * 
 * @see AttributeWizard
 * @since 2013.07.14
 */
public abstract class DMDLAttributeWizardDefinition {

	/**
	 * 定義名取得.
	 * 
	 * @return 定義名（null不可）
	 */
	public abstract String getName();

	/**
	 * 属性追加時のモデルの属性.
	 * 
	 * @param version
	 *            バージョン
	 * @return モデルの属性
	 */
	public abstract String getAddModelAttribute(String version);

	/**
	 * 属性追加時のプロパティーの属性.
	 * 
	 * @param version
	 *            バージョン
	 * @return プロパティーの属性
	 */
	public abstract String getAddPropertyAttribute(String version);

	/**
	 * 属性削除時のモデルの属性.
	 * 
	 * @param version
	 *            バージョン
	 * @return モデルの属性（改行コード区切りで複数指定）
	 */
	public String getRemoveModelAttribute(String version) {
		return StringUtil.toString(getRemoveModelAttributeList(version));
	}

	/**
	 * 属性削除時のモデルの属性.
	 * 
	 * @param version
	 *            バージョン
	 * @return モデルの属性
	 */
	protected abstract List<String> getRemoveModelAttributeList(String version);

	/**
	 * 属性削除時のプロパティーの属性.
	 * 
	 * @param version
	 *            バージョン
	 * @return プロパティーの属性（改行コード区切りで複数指定）
	 */
	public String getRemovePropertyAttribute(String version) {
		return StringUtil.toString(getRemovePropertyAttributeList(version));
	}

	/**
	 * 属性削除時のプロパティーの属性.
	 * 
	 * @param version
	 *            バージョン
	 * @return プロパティーの属性
	 */
	protected abstract List<String> getRemovePropertyAttributeList(String version);
}
