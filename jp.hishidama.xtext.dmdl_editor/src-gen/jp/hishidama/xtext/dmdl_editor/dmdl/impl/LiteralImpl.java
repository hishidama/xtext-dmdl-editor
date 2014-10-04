/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl.impl;

import java.math.BigDecimal;

import jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage;
import jp.hishidama.xtext.dmdl_editor.dmdl.Literal;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.LiteralImpl#getStringValue <em>String Value</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.LiteralImpl#getIntValue <em>Int Value</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.LiteralImpl#getDecimalValue <em>Decimal Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralImpl extends MinimalEObjectImpl.Container implements Literal
{
  /**
   * The default value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected static final String STRING_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStringValue() <em>String Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStringValue()
   * @generated
   * @ordered
   */
  protected String stringValue = STRING_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected static final int INT_VALUE_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getIntValue() <em>Int Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntValue()
   * @generated
   * @ordered
   */
  protected int intValue = INT_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getDecimalValue() <em>Decimal Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimalValue()
   * @generated
   * @ordered
   */
  protected static final BigDecimal DECIMAL_VALUE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDecimalValue() <em>Decimal Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecimalValue()
   * @generated
   * @ordered
   */
  protected BigDecimal decimalValue = DECIMAL_VALUE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LiteralImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DmdlPackage.Literals.LITERAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStringValue()
  {
    return stringValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStringValue(String newStringValue)
  {
    String oldStringValue = stringValue;
    stringValue = newStringValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmdlPackage.LITERAL__STRING_VALUE, oldStringValue, stringValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getIntValue()
  {
    return intValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIntValue(int newIntValue)
  {
    int oldIntValue = intValue;
    intValue = newIntValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmdlPackage.LITERAL__INT_VALUE, oldIntValue, intValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BigDecimal getDecimalValue()
  {
    return decimalValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDecimalValue(BigDecimal newDecimalValue)
  {
    BigDecimal oldDecimalValue = decimalValue;
    decimalValue = newDecimalValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmdlPackage.LITERAL__DECIMAL_VALUE, oldDecimalValue, decimalValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DmdlPackage.LITERAL__STRING_VALUE:
        return getStringValue();
      case DmdlPackage.LITERAL__INT_VALUE:
        return getIntValue();
      case DmdlPackage.LITERAL__DECIMAL_VALUE:
        return getDecimalValue();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DmdlPackage.LITERAL__STRING_VALUE:
        setStringValue((String)newValue);
        return;
      case DmdlPackage.LITERAL__INT_VALUE:
        setIntValue((Integer)newValue);
        return;
      case DmdlPackage.LITERAL__DECIMAL_VALUE:
        setDecimalValue((BigDecimal)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DmdlPackage.LITERAL__STRING_VALUE:
        setStringValue(STRING_VALUE_EDEFAULT);
        return;
      case DmdlPackage.LITERAL__INT_VALUE:
        setIntValue(INT_VALUE_EDEFAULT);
        return;
      case DmdlPackage.LITERAL__DECIMAL_VALUE:
        setDecimalValue(DECIMAL_VALUE_EDEFAULT);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DmdlPackage.LITERAL__STRING_VALUE:
        return STRING_VALUE_EDEFAULT == null ? stringValue != null : !STRING_VALUE_EDEFAULT.equals(stringValue);
      case DmdlPackage.LITERAL__INT_VALUE:
        return intValue != INT_VALUE_EDEFAULT;
      case DmdlPackage.LITERAL__DECIMAL_VALUE:
        return DECIMAL_VALUE_EDEFAULT == null ? decimalValue != null : !DECIMAL_VALUE_EDEFAULT.equals(decimalValue);
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (stringValue: ");
    result.append(stringValue);
    result.append(", intValue: ");
    result.append(intValue);
    result.append(", decimalValue: ");
    result.append(decimalValue);
    result.append(')');
    return result.toString();
  }

} //LiteralImpl
