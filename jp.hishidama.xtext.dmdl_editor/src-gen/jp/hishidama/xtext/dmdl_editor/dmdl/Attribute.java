/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.Attribute#getElementBlock <em>Element Block</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getAttribute_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Attribute#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Element Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Block</em>' containment reference.
   * @see #setElementBlock(AttributeElementBlock)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getAttribute_ElementBlock()
   * @model containment="true"
   * @generated
   */
  AttributeElementBlock getElementBlock();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Attribute#getElementBlock <em>Element Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Block</em>' containment reference.
   * @see #getElementBlock()
   * @generated
   */
  void setElementBlock(AttributeElementBlock value);

} // Attribute
