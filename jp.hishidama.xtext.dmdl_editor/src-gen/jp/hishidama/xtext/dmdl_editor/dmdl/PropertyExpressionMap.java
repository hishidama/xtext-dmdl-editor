/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Expression Map</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionMap#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyExpressionMap()
 * @model
 * @generated
 */
public interface PropertyExpressionMap extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionMapEntry}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyExpressionMap_Elements()
   * @model containment="true"
   * @generated
   */
  EList<PropertyExpressionMapEntry> getElements();

} // PropertyExpressionMap
