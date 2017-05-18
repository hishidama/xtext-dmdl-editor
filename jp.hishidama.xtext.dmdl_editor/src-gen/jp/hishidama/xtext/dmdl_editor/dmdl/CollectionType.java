/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.CollectionType#getElementType <em>Element Type</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.CollectionType#isMap <em>Map</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getCollectionType()
 * @model
 * @generated
 */
public interface CollectionType extends EObject
{
  /**
   * Returns the value of the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Type</em>' containment reference.
   * @see #setElementType(Type)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getCollectionType_ElementType()
   * @model containment="true"
   * @generated
   */
  Type getElementType();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.CollectionType#getElementType <em>Element Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Type</em>' containment reference.
   * @see #getElementType()
   * @generated
   */
  void setElementType(Type value);

  /**
   * Returns the value of the '<em><b>Map</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Map</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Map</em>' attribute.
   * @see #setMap(boolean)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getCollectionType_Map()
   * @model
   * @generated
   */
  boolean isMap();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.CollectionType#isMap <em>Map</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Map</em>' attribute.
   * @see #isMap()
   * @generated
   */
  void setMap(boolean value);

} // CollectionType
