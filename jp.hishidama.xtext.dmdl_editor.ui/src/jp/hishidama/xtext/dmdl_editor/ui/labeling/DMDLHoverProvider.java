package jp.hishidama.xtext.dmdl_editor.ui.labeling;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyUtil;
import jp.hishidama.xtext.dmdl_editor.dmdl.Type;
import jp.hishidama.xtext.dmdl_editor.dmdl.util.DmdlSwitch;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.ui.editor.hover.html.DefaultEObjectHoverProvider;

public class DMDLHoverProvider extends DefaultEObjectHoverProvider {

	private static final LabelSwitch LABEL_SWITCHER = new LabelSwitch();

	@Override
	protected String getFirstLine(EObject o) {
		String label = LABEL_SWITCHER.doSwitch(o);
		if (label != null) {
			return label;
		}

		label = getLabel(o);
		return (label != null) ? " <b>" + label + "</b>" : "";
	}

	@Override
	protected String getDocumentation(EObject o) {
		return super.getDocumentation(o);
	}

	private static class LabelSwitch extends DmdlSwitch<String> {

		@Override
		public String caseModelDefinition(ModelDefinition object) {
			StringBuilder sb = new StringBuilder(64);

			String desc = object.getDescription();
			if (desc != null) {
				sb.append(desc);
				sb.append("<br>");
			}

			String name = object.getName();
			sb.append("<b>");
			sb.append(name);
			sb.append("</b>");

			return sb.toString();
		}

		@Override
		public String casePropertyDefinition(PropertyDefinition object) {
			StringBuilder sb = new StringBuilder(64);

			appendPropertyName(sb, object);

			return sb.toString();
		}

		@Override
		public String casePropertyMapping(PropertyMapping object) {
			StringBuilder sb = new StringBuilder(64);

			appendPropertyName(sb, object);

			Property from = object.getFrom();
			if (from != null) {
				String n = from.getName();
				sb.append("<br> &lt;- ");
				{
					String modelName = PropertyUtil.getModelName(from);
					if (modelName != null) {
						sb.append(modelName);
						sb.append(".");
					}
				}
				sb.append(n);
			}

			return sb.toString();
		}

		@Override
		public String casePropertyFolding(PropertyFolding object) {
			StringBuilder sb = new StringBuilder(64);

			appendPropertyName(sb, object);

			String aggr = object.getAggregator();
			if (aggr != null) {
				sb.append("<br> &lt;- ");
				sb.append(aggr);

				Property from = object.getFrom();
				if (from != null) {
					String n = from.getName();
					sb.append("(");
					{
						String modelName = PropertyUtil.getModelName(from);
						if (modelName != null) {
							sb.append(modelName);
							sb.append(".");
						}
					}
					sb.append(n);
					sb.append(")");
				}
			}

			return sb.toString();
		}

		private void appendPropertyName(StringBuilder sb, Property object) {
			String desc = object.getDescription();
			if (desc != null) {
				sb.append(desc);
				sb.append("<br>");
			}

			String name = object.getName();
			sb.append("<b>");
			sb.append(name);
			sb.append("</b>");

			Type type = PropertyUtil.getResolvedDataType(object);
			if (type != null) {
				sb.append(" : ");
				sb.append(type);
			}
		}
	}
}
