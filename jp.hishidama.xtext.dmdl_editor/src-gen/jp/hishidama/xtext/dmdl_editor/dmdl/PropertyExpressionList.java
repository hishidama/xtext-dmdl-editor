/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Expression List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionList#getElements <em>Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyExpressionList()
 * @model
 * @generated
 */
public interface PropertyExpressionList extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' reference list.
   * The list contents are of type {@link jp.hishidama.xtext.dmdl_editor.dmdl.Property}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' reference list.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyExpressionList_Elements()
   * @model
   * @generated
   */
  EList<Property> getElements();

} // PropertyExpressionList
