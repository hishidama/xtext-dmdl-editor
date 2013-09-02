/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl.impl;

import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementBlock;
import jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeImpl#getElementBlock <em>Element Block</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends MinimalEObjectImpl.Container implements Attribute
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The cached value of the '{@link #getElementBlock() <em>Element Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementBlock()
   * @generated
   * @ordered
   */
  protected AttributeElementBlock elementBlock;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AttributeImpl()
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
    return DmdlPackage.Literals.ATTRIBUTE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmdlPackage.ATTRIBUTE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeElementBlock getElementBlock()
  {
    return elementBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetElementBlock(AttributeElementBlock newElementBlock, NotificationChain msgs)
  {
    AttributeElementBlock oldElementBlock = elementBlock;
    elementBlock = newElementBlock;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmdlPackage.ATTRIBUTE__ELEMENT_BLOCK, oldElementBlock, newElementBlock);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementBlock(AttributeElementBlock newElementBlock)
  {
    if (newElementBlock != elementBlock)
    {
      NotificationChain msgs = null;
      if (elementBlock != null)
        msgs = ((InternalEObject)elementBlock).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmdlPackage.ATTRIBUTE__ELEMENT_BLOCK, null, msgs);
      if (newElementBlock != null)
        msgs = ((InternalEObject)newElementBlock).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmdlPackage.ATTRIBUTE__ELEMENT_BLOCK, null, msgs);
      msgs = basicSetElementBlock(newElementBlock, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmdlPackage.ATTRIBUTE__ELEMENT_BLOCK, newElementBlock, newElementBlock));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DmdlPackage.ATTRIBUTE__ELEMENT_BLOCK:
        return basicSetElementBlock(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case DmdlPackage.ATTRIBUTE__NAME:
        return getName();
      case DmdlPackage.ATTRIBUTE__ELEMENT_BLOCK:
        return getElementBlock();
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
      case DmdlPackage.ATTRIBUTE__NAME:
        setName((String)newValue);
        return;
      case DmdlPackage.ATTRIBUTE__ELEMENT_BLOCK:
        setElementBlock((AttributeElementBlock)newValue);
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
      case DmdlPackage.ATTRIBUTE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case DmdlPackage.ATTRIBUTE__ELEMENT_BLOCK:
        setElementBlock((AttributeElementBlock)null);
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
      case DmdlPackage.ATTRIBUTE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case DmdlPackage.ATTRIBUTE__ELEMENT_BLOCK:
        return elementBlock != null;
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //AttributeImpl
