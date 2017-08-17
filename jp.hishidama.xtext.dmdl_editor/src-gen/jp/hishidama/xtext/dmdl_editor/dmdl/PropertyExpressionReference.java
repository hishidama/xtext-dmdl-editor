/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Expression Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionReference#getModelName <em>Model Name</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionReference#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyExpressionReference()
 * @model
 * @generated
 */
public interface PropertyExpressionReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Model Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Name</em>' reference.
   * @see #setModelName(ModelDefinition)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyExpressionReference_ModelName()
   * @model
   * @generated
   */
  ModelDefinition getModelName();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionReference#getModelName <em>Model Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Name</em>' reference.
   * @see #getModelName()
   * @generated
   */
  void setModelName(ModelDefinition value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(Property)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyExpressionReference_Name()
   * @model
   * @generated
   */
  Property getName();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionReference#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(Property value);

} // PropertyExpressionReference
