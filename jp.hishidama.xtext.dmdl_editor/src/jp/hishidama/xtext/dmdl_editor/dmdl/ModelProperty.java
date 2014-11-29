package jp.hishidama.xtext.dmdl_editor.dmdl;

public class ModelProperty {
	private final ModelDefinition model;
	private final Property property;

	public ModelProperty(ModelDefinition model, Property property) {
		assert model != null;
		this.model = model;
		this.property = property;
	}

	public ModelDefinition getModel() {
		return model;
	}

	public boolean hasProperty() {
		return property != null;
	}

	public Property getProperty() {
		return property;
	}
}
