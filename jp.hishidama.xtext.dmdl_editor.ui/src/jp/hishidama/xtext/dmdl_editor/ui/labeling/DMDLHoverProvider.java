package jp.hishidama.xtext.dmdl_editor.ui.labeling;

import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping;
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

			String name = object.getName();
			sb.append("<b>");
			sb.append(name);
			sb.append("</b>");

			String desc = object.getDescription();
			if (desc != null) {
				sb.append(" ");
				sb.append(desc);
			}

			return sb.toString();
		}

		@Override
		public String casePropertyDefinition(PropertyDefinition object) {
			StringBuilder sb = new StringBuilder(64);

			String name = object.getName();
			sb.append("<b>");
			sb.append(name);
			sb.append("</b>");

			String desc = object.getDescription();
			if (desc != null) {
				sb.append(" ");
				sb.append(desc);
			}

			Type type = object.getType();
			if (type != null) {
				sb.append(" : ");
				sb.append(type);
			}

			return sb.toString();
		}

		@Override
		public String casePropertyMapping(PropertyMapping object) {
			StringBuilder sb = new StringBuilder(64);

			String name = object.getName();
			sb.append("<b>");
			sb.append(name);
			sb.append("</b>");

			String desc = object.getDescription();
			if (desc != null) {
				sb.append(" ");
				sb.append(desc);
			}

			Property from = object.getFrom();
			if (from != null) {
				String n = from.getName();
				sb.append(" <- ");
				sb.append(n);
			}

			return sb.toString();
		}

		@Override
		public String casePropertyFolding(PropertyFolding object) {
			StringBuilder sb = new StringBuilder(64);

			String name = object.getName();
			sb.append("<b>");
			sb.append(name);
			sb.append("</b>");

			String desc = object.getDescription();
			if (desc != null) {
				sb.append(" ");
				sb.append(desc);
			}

			String aggr = object.getAggregator();
			if (aggr != null) {
				sb.append(" <- ");
				sb.append(aggr);

				Property from = object.getFrom();
				if (from != null) {
					String n = from.getName();
					sb.append("(");
					sb.append(n);
					sb.append(")");
				}
			}

			return sb.toString();
		}
	}
}
