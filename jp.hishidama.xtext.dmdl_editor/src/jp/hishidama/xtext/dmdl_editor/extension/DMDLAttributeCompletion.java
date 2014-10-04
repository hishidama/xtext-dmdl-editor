package jp.hishidama.xtext.dmdl_editor.extension;

import java.util.List;

import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;

/**
 * 属性の入力補完の定義.
 * 
 * @since 2014.10.01
 */
public interface DMDLAttributeCompletion {

	/**
	 * モデル属性名.
	 * 
	 * @return 属性名候補
	 */
	public String getCompletionModelAttributeName();

	/**
	 * モデル属性要素名.
	 * 
	 * @return 要素名候補
	 */
	public List<String> getCompletionModelAttributeElementNameList(String version);

	/**
	 * モデル属性値.
	 * 
	 * @param element
	 *            要素
	 * @param name
	 *            要素名
	 * @param version
	 *            バージョン
	 * 
	 * @return 値候補
	 */
	public List<String> getCompletionModelAttributeValueList(AttributeElement element, String name, String version);

	/**
	 * プロパティー属性名.
	 * 
	 * @param property
	 *            プロパティー
	 * @return 属性名候補
	 */
	public List<String> getCompletionPropertyAttributeName(Property property);

	/**
	 * プロパティー属性要素名.
	 * 
	 * @param property
	 *            プロパティー
	 * @param name
	 *            属性名
	 * @param version
	 *            バージョン
	 * @return 要素名候補
	 */
	public List<String> getCompletionPropertyAttributeElementNameList(Property property, String name, String version);

	/**
	 * プロパティー属性値.
	 * 
	 * @param attributeName
	 *            属性名
	 * @param element
	 *            要素
	 * @param elementName
	 *            要素名
	 * @param version
	 *            バージョン
	 * @return 値候補
	 */
	public List<String> getCompletionPropertyAttributeElementValueList(String attributeName, AttributeElement element,
			String elementName, String version);
}
