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
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * The literals are from the enumeration {@link jp.hishidama.xtext.dmdl_editor.dmdl.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Type
   * @see #setType(Type)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyDefinition_Type()
   * @model
   * @generated
   */
  Type getType();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Type
   * @see #getType()
   * @generated
   */
  void setType(Type value);

} // PropertyDefinition