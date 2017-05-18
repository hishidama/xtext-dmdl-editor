/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.Type#getBasicType <em>Basic Type</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.Type#getCollectionType <em>Collection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Basic Type</b></em>' attribute.
   * The literals are from the enumeration {@link jp.hishidama.xtext.dmdl_editor.dmdl.BasicType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Basic Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Basic Type</em>' attribute.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.BasicType
   * @see #setBasicType(BasicType)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getType_BasicType()
   * @model
   * @generated
   */
  BasicType getBasicType();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Type#getBasicType <em>Basic Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Basic Type</em>' attribute.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.BasicType
   * @see #getBasicType()
   * @generated
   */
  void setBasicType(BasicType value);

  /**
   * Returns the value of the '<em><b>Collection Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Collection Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection Type</em>' containment reference.
   * @see #setCollectionType(CollectionType)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getType_CollectionType()
   * @model containment="true"
   * @generated
   */
  CollectionType getCollectionType();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Type#getCollectionType <em>Collection Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection Type</em>' containment reference.
   * @see #getCollectionType()
   * @generated
   */
  void setCollectionType(CollectionType value);

} // Type
