package jp.hishidama.xtext.dmdl_editor.formatting;

import jp.hishidama.xtext.dmdl_editor.services.DMDLGrammarAccess;

import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.formatting.impl.FormattingConfig;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.util.Pair;

class DMDLFormatterUtil {

	// findKeywordsの部分は、DMDLFormatterに直接書くと、
	// （更新サイト経由でインストールして実行すると） 何故か「Guice provision errors」が発生する。
	// Guiceのインジェクションに何か問題があると思われるので、DMDLFormattertとは別のクラスに記述することにした。

	static void configureFormatting(FormattingConfig c, DMDLGrammarAccess f) {

		c.setAutoLinewrap(120);

		// 丸括弧
		for (Pair<Keyword, Keyword> pair : f.findKeywordPairs("(", ")")) {
			c.setNoSpace().after(pair.getFirst()); // 開き括弧の直後は詰める
			c.setNoSpace().before(pair.getSecond()); // 閉じ括弧の直前は詰める
		}
		// 波括弧
		curlyBrace(c, f.getRecordTermAccess());
		curlyBrace(c, f.getModelMappingAccess());
		curlyBrace(c, f.getModelFoldingAccess());

		// カンマ
		for (Keyword comma : f.findKeywords(",")) {
			c.setNoSpace().before(comma); // 直前は詰める
		}
		// セミコロン
		for (Keyword semicolon : f.findKeywords(";")) {
			c.setNoSpace().before(semicolon); // 直前は詰める
			c.setLinewrap().after(semicolon); // 直後は改行する
		}
		// @
		for (Keyword atmark : f.findKeywords("@")) {
			c.setNoSpace().after(atmark); // 直後は詰める
		}
		// ピリオド
		for (Keyword period : f.findKeywords(".")) {
			c.setNoSpace().around(period); // 両側とも詰める
		}

		// descriptionの直後は改行する
		c.setLinewrap().after(f.getDescriptionRule());

		// attributeの直後は改行する
		c.setNoSpace().before(f.getAttributeAccess().getLeftParenthesisKeyword_2_0());

		c.setLinewrap().after(f.getAttributeRule());

		// joinedの+の直前は改行する
		c.setLinewrap().before(f.getJoinExpressionAccess().getPlusSignKeyword_1_0());

		// モデル定義の後は1行空ける
		c.setLinewrap(2).after(f.getModelDefinitionRule());

		// コメント
		c.setLinewrap(0, 1, 2).before(f.getSL_COMMENTRule());
		c.setLinewrap(0, 1, 2).before(f.getML_COMMENTRule());
		c.setLinewrap(0, 1, 1).after(f.getML_COMMENTRule());
	}

	private static void curlyBrace(FormattingConfig c, AbstractElementFinder rule) {
		for (Pair<Keyword, Keyword> pair : rule.findKeywordPairs("{", "}")) {
			c.setIndentationIncrement().after(pair.getFirst());
			c.setLinewrap().after(pair.getFirst());
			c.setIndentationDecrement().before(pair.getSecond());
		}
	}
}
