package jp.hishidama.xtext.dmdl_editor.ui.view.model_hierarchy.property;

import java.lang.reflect.InvocationTargetException;

import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

public abstract class IndexProperty implements Property {

	protected final Property property;

	private int row = 0;

	public static IndexProperty newInstance(Property property) {
		if (property instanceof PropertyDefinition) {
			return new IndexPropertyDefinition((PropertyDefinition) property);
		}
		if (property instanceof PropertyFolding) {
			return new IndexPropertyFolding((PropertyFolding) property);
		}
		if (property instanceof PropertyMapping) {
			return new IndexPropertyMapping((PropertyMapping) property);
		}
		throw new IllegalStateException(property.toString());
	}

	public IndexProperty(Property property) {
		this.property = property;
	}

	public Property getProperty() {
		return property;
	}

	public void setRowNumber(int row) {
		this.row = row;
	}

	public int getRowNumber() {
		return row;
	}

	public EClass eClass() {
		return property.eClass();
	}

	public Resource eResource() {
		return property.eResource();
	}

	public EObject eContainer() {
		return property.eContainer();
	}

	public EStructuralFeature eContainingFeature() {
		return property.eContainingFeature();
	}

	public EReference eContainmentFeature() {
		return property.eContainmentFeature();
	}

	public EList<EObject> eContents() {
		return property.eContents();
	}

	public TreeIterator<EObject> eAllContents() {
		return property.eAllContents();
	}

	public boolean eIsProxy() {
		return property.eIsProxy();
	}

	public EList<EObject> eCrossReferences() {
		return property.eCrossReferences();
	}

	public Object eGet(EStructuralFeature feature) {
		return property.eGet(feature);
	}

	public Object eGet(EStructuralFeature feature, boolean resolve) {
		return property.eGet(feature, resolve);
	}

	public void eSet(EStructuralFeature feature, Object newValue) {
		property.eSet(feature, newValue);
	}

	public boolean eIsSet(EStructuralFeature feature) {
		return property.eIsSet(feature);
	}

	public void eUnset(EStructuralFeature feature) {
		property.eUnset(feature);
	}

	public Object eInvoke(EOperation operation, EList<?> arguments) throws InvocationTargetException {
		return property.eInvoke(operation, arguments);
	}

	public EList<Adapter> eAdapters() {
		return property.eAdapters();
	}

	public boolean eDeliver() {
		return property.eDeliver();
	}

	public void eSetDeliver(boolean deliver) {
		property.eSetDeliver(deliver);
	}

	public void eNotify(Notification notification) {
		property.eNotify(notification);
	}

	public String getDescription() {
		return property.getDescription();
	}

	public void setDescription(String value) {
		property.setDescription(value);
	}

	public AttributeList getAttributes() {
		return property.getAttributes();
	}

	public void setAttributes(AttributeList value) {
		property.setAttributes(value);
	}

	public String getName() {
		return property.getName();
	}

	public void setName(String value) {
		property.setName(value);
	}
}
