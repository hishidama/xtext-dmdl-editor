package jp.hishidama.xtext.dmdl_editor.ui.wizard.page;

import java.io.StringReader;
import java.text.MessageFormat;

import jp.hishidama.eclipse_plugin.util.StringUtil;
import jp.hishidama.xtext.dmdl_editor.parser.antlr.DMDLParser;
import jp.hishidama.xtext.dmdl_editor.ui.internal.InjectorUtil;
import jp.hishidama.xtext.dmdl_editor.ui.internal.LogUtil;
import jp.hishidama.xtext.dmdl_editor.util.DMDLStringUtil;

import org.eclipse.xtext.formatting.INodeModelFormatter;
import org.eclipse.xtext.formatting.INodeModelFormatter.IFormattedRegion;
import org.eclipse.xtext.parser.IParseResult;

public class DataModelTextGenerator {
	private String modelName;
	private String modelDescription;
	private String modelAttribute;
	private String modelType;

	public void setModelName(String name) {
		this.modelName = name;
	}

	public void setModelDescription(String description) {
		this.modelDescription = description;
	}

	public void setModelAttribute(String attribute) {
		this.modelAttribute = attribute;
	}

	public void setModelType(String type) {
		this.modelType = type;
	}

	private StringBuilder sb = new StringBuilder(1024);
	private String indent = "  ";

	private String blockName = NOTHING;
	private static final String NOTHING = "\0nothing\0";
	private String refNameOnly = null;

	public void appendProperty(String name, String desc, String type, String attribute) {
		block("", null, true, true);

		appendDescription(desc);
		appendAttribute(attribute);
		sb.append(indent);
		sb.append(StringUtil.get(name, "プロパティー名が未定義"));
		sb.append(" : ");
		sb.append(StringUtil.get(type, "データ型が未定義"));
		sb.append(";\n");
	}

	public void appendRefProperty(String refModelName) {
		if (refModelName == null) {
			refModelName = "";
		}
		if (!refModelName.equals(this.refNameOnly)) {
			block(refModelName, null, false, false);
		}
	}

	public void appendRefProperty(String name, String desc, String refModelName, String refName, String attribute) {
		block(refModelName, "->", true, true);

		appendDescription(desc);
		appendAttribute(attribute);
		sb.append(indent);
		sb.append(StringUtil.nonEmpty(refName) ? refName : StringUtil.get(name, "参照元プロパティー名が未定義"));
		sb.append(" -> ");
		sb.append(StringUtil.nonEmpty(name) ? name : StringUtil.get(refName, "プロパティー名が未定義"));
		sb.append(";\n");
	}

	public void appendSumProperty(String name, String desc, String type, String refModelName, String refName,
			String attribute) {
		block(StringUtil.get(refModelName, "集計元データモデル名が未定義"), "=>", true, true);

		appendDescription(desc);
		appendAttribute(attribute);
		sb.append(indent);
		sb.append(StringUtil.get(type, "集計方法が未定義"));
		sb.append(" ");
		sb.append(StringUtil.nonEmpty(refName) ? refName : StringUtil.get(name, "集計対象プロパティー名が未定義"));
		sb.append(" -> ");
		sb.append(StringUtil.nonEmpty(name) ? name : StringUtil.get(refName, "プロパティー名が未定義"));
		sb.append(";\n");
	}

	private StringBuilder key = new StringBuilder(128);

	public void appendKey(String name, String refName) {
		key.append(key.length() == 0 ? " % " : ", ");
		key.append(StringUtil.nonEmpty(name) ? name : StringUtil.get(refName, "キー名が未定義"));
	}

	private void block(String refModelName, String arrow, boolean block, boolean lf) {
		if (refModelName == null) {
			refModelName = "";
		}

		if (!refModelName.equals(blockName)) {
			if (blockName != NOTHING) {
				sb.append("}");
			}
			sb.append(key);
			key.setLength(0);

			sb.append(sb.length() == 0 ? "" : " +");
			if (refModelName != NOTHING && !refModelName.isEmpty()) {
				sb.append(" ");
				sb.append(refModelName);
				refNameOnly = refModelName;
			}
			if (arrow != null) {
				sb.append(" ");
				sb.append(arrow);
			}
			if (block) {
				sb.append(" {\n");
				refNameOnly = null;
				blockName = refModelName;
			} else {
				blockName = NOTHING;
			}
		} else {
			if (lf) {
				sb.append("\n");
			}
		}
	}

	private void appendDescription(String desc) {
		if (StringUtil.nonEmpty(desc)) {
			sb.append(indent);
			sb.append(DMDLStringUtil.encodeDescription(desc));
			sb.append("\n");
		}
	}

	private void appendAttribute(String attribute) {
		if (StringUtil.nonEmpty(attribute)) {
			sb.append(indent);
			sb.append(attribute);
			sb.append("\n");
		}
	}

	public String getText() {
		if (sb.length() == 0) {
			sb.append(" {}");
		} else if (blockName != NOTHING && refNameOnly == null) {
			sb.append("}");
			blockName = NOTHING;
		}
		sb.append(key);
		key.setLength(0);

		StringBuilder all = new StringBuilder(256 + sb.length());
		if (StringUtil.nonEmpty(modelDescription)) {
			all.append(DMDLStringUtil.encodeDescription(modelDescription));
			all.append("\n");
		}
		if (StringUtil.nonEmpty(modelAttribute)) {
			all.append(modelAttribute);
			all.append("\n");
		}
		if (StringUtil.nonEmpty(modelType)) {
			all.append(modelType);
			all.append(" ");
		}
		all.append(modelName);
		all.append(" =");
		all.append(sb);
		all.append(";\n");

		String text;
		try {
			DMDLParser parser = InjectorUtil.getInstance(DMDLParser.class);
			IParseResult result = parser.parse(new StringReader(all.toString()));
			INodeModelFormatter formatter = InjectorUtil.getInstance(INodeModelFormatter.class);
			IFormattedRegion r = formatter.format(result.getRootNode(), 0, all.length());
			text = r.getFormattedText();
		} catch (Exception e) {
			LogUtil.logWarn(MessageFormat.format("{0} formatting error.\nsrc=[{1}]", getClass().getSimpleName(), all),
					e);
			text = all.toString();
		}
		return text;
	}
}
