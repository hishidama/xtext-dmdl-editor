/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.Literal#getStringValue <em>String Value</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.Literal#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.Literal#getDecimalValue <em>Decimal Value</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.Literal#getBooleanValue <em>Boolean Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getLiteral()
 * @model
 * @generated
 */
public interface Literal extends EObject
{
  /**
   * Returns the value of the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>String Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>String Value</em>' attribute.
   * @see #setStringValue(String)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getLiteral_StringValue()
   * @model
   * @generated
   */
  String getStringValue();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Literal#getStringValue <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>String Value</em>' attribute.
   * @see #getStringValue()
   * @generated
   */
  void setStringValue(String value);

  /**
   * Returns the value of the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Int Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Int Value</em>' attribute.
   * @see #setIntValue(int)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getLiteral_IntValue()
   * @model
   * @generated
   */
  int getIntValue();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Literal#getIntValue <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Int Value</em>' attribute.
   * @see #getIntValue()
   * @generated
   */
  void setIntValue(int value);

  /**
   * Returns the value of the '<em><b>Decimal Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decimal Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decimal Value</em>' attribute.
   * @see #setDecimalValue(BigDecimal)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getLiteral_DecimalValue()
   * @model
   * @generated
   */
  BigDecimal getDecimalValue();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Literal#getDecimalValue <em>Decimal Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Decimal Value</em>' attribute.
   * @see #getDecimalValue()
   * @generated
   */
  void setDecimalValue(BigDecimal value);

  /**
   * Returns the value of the '<em><b>Boolean Value</b></em>' attribute.
   * The literals are from the enumeration {@link jp.hishidama.xtext.dmdl_editor.dmdl.BOOLEAN}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Boolean Value</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Boolean Value</em>' attribute.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.BOOLEAN
   * @see #setBooleanValue(BOOLEAN)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getLiteral_BooleanValue()
   * @model
   * @generated
   */
  BOOLEAN getBooleanValue();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Literal#getBooleanValue <em>Boolean Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Boolean Value</em>' attribute.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.BOOLEAN
   * @see #getBooleanValue()
   * @generated
   */
  void setBooleanValue(BOOLEAN value);

} // Literal
