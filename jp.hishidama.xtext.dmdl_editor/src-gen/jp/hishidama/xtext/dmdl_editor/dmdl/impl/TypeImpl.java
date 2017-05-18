/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl.impl;

import jp.hishidama.xtext.dmdl_editor.dmdl.BasicType;
import jp.hishidama.xtext.dmdl_editor.dmdl.CollectionType;
import jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage;
import jp.hishidama.xtext.dmdl_editor.dmdl.Type;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.TypeImpl#getBasicType <em>Basic Type</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.TypeImpl#getCollectionType <em>Collection Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends MinimalEObjectImpl.Container implements Type
{
  /**
   * The default value of the '{@link #getBasicType() <em>Basic Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasicType()
   * @generated
   * @ordered
   */
  protected static final BasicType BASIC_TYPE_EDEFAULT = BasicType.INT;

  /**
   * The cached value of the '{@link #getBasicType() <em>Basic Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBasicType()
   * @generated
   * @ordered
   */
  protected BasicType basicType = BASIC_TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getCollectionType() <em>Collection Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCollectionType()
   * @generated
   * @ordered
   */
  protected CollectionType collectionType;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypeImpl()
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
    return DmdlPackage.Literals.TYPE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BasicType getBasicType()
  {
    return basicType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBasicType(BasicType newBasicType)
  {
    BasicType oldBasicType = basicType;
    basicType = newBasicType == null ? BASIC_TYPE_EDEFAULT : newBasicType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmdlPackage.TYPE__BASIC_TYPE, oldBasicType, basicType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CollectionType getCollectionType()
  {
    return collectionType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCollectionType(CollectionType newCollectionType, NotificationChain msgs)
  {
    CollectionType oldCollectionType = collectionType;
    collectionType = newCollectionType;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmdlPackage.TYPE__COLLECTION_TYPE, oldCollectionType, newCollectionType);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCollectionType(CollectionType newCollectionType)
  {
    if (newCollectionType != collectionType)
    {
      NotificationChain msgs = null;
      if (collectionType != null)
        msgs = ((InternalEObject)collectionType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmdlPackage.TYPE__COLLECTION_TYPE, null, msgs);
      if (newCollectionType != null)
        msgs = ((InternalEObject)newCollectionType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmdlPackage.TYPE__COLLECTION_TYPE, null, msgs);
      msgs = basicSetCollectionType(newCollectionType, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmdlPackage.TYPE__COLLECTION_TYPE, newCollectionType, newCollectionType));
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
      case DmdlPackage.TYPE__COLLECTION_TYPE:
        return basicSetCollectionType(null, msgs);
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
      case DmdlPackage.TYPE__BASIC_TYPE:
        return getBasicType();
      case DmdlPackage.TYPE__COLLECTION_TYPE:
        return getCollectionType();
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
      case DmdlPackage.TYPE__BASIC_TYPE:
        setBasicType((BasicType)newValue);
        return;
      case DmdlPackage.TYPE__COLLECTION_TYPE:
        setCollectionType((CollectionType)newValue);
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
      case DmdlPackage.TYPE__BASIC_TYPE:
        setBasicType(BASIC_TYPE_EDEFAULT);
        return;
      case DmdlPackage.TYPE__COLLECTION_TYPE:
        setCollectionType((CollectionType)null);
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
      case DmdlPackage.TYPE__BASIC_TYPE:
        return basicType != BASIC_TYPE_EDEFAULT;
      case DmdlPackage.TYPE__COLLECTION_TYPE:
        return collectionType != null;
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
    result.append(" (basicType: ");
    result.append(basicType);
    result.append(')');
    return result.toString();
  }

} //TypeImpl
