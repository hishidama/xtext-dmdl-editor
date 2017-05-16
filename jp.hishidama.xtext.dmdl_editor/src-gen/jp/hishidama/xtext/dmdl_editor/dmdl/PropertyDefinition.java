/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition#getType <em>Type</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition#getExpression <em>Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyDefinition()
 * @model
 * @generated
 */
public interface PropertyDefinition extends Property
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Type)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyDefinition_Type()
   * @model containment="true"
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Type value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(PropertyExpression)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyDefinition_Expression()
   * @model containment="true"
   * @generated
   */
  PropertyExpression getExpression();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(PropertyExpression value);

} // PropertyDefinition
