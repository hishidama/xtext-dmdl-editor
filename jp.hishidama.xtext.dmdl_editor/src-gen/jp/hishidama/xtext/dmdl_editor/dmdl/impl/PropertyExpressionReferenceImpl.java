/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl.impl;

import jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Property;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionReference;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Expression Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionReferenceImpl#getModelName <em>Model Name</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionReferenceImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyExpressionReferenceImpl extends MinimalEObjectImpl.Container implements PropertyExpressionReference
{
  /**
   * The cached value of the '{@link #getModelName() <em>Model Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelName()
   * @generated
   * @ordered
   */
  protected ModelDefinition modelName;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected Property name;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyExpressionReferenceImpl()
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
    return DmdlPackage.Literals.PROPERTY_EXPRESSION_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDefinition getModelName()
  {
    if (modelName != null && modelName.eIsProxy())
    {
      InternalEObject oldModelName = (InternalEObject)modelName;
      modelName = (ModelDefinition)eResolveProxy(oldModelName);
      if (modelName != oldModelName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmdlPackage.PROPERTY_EXPRESSION_REFERENCE__MODEL_NAME, oldModelName, modelName));
      }
    }
    return modelName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDefinition basicGetModelName()
  {
    return modelName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelName(ModelDefinition newModelName)
  {
    ModelDefinition oldModelName = modelName;
    modelName = newModelName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmdlPackage.PROPERTY_EXPRESSION_REFERENCE__MODEL_NAME, oldModelName, modelName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property getName()
  {
    if (name != null && name.eIsProxy())
    {
      InternalEObject oldName = (InternalEObject)name;
      name = (Property)eResolveProxy(oldName);
      if (name != oldName)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DmdlPackage.PROPERTY_EXPRESSION_REFERENCE__NAME, oldName, name));
      }
    }
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property basicGetName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(Property newName)
  {
    Property oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmdlPackage.PROPERTY_EXPRESSION_REFERENCE__NAME, oldName, name));
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
      case DmdlPackage.PROPERTY_EXPRESSION_REFERENCE__MODEL_NAME:
        if (resolve) return getModelName();
        return basicGetModelName();
      case DmdlPackage.PROPERTY_EXPRESSION_REFERENCE__NAME:
        if (resolve) return getName();
        return basicGetName();
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
      case DmdlPackage.PROPERTY_EXPRESSION_REFERENCE__MODEL_NAME:
        setModelName((ModelDefinition)newValue);
        return;
      case DmdlPackage.PROPERTY_EXPRESSION_REFERENCE__NAME:
        setName((Property)newValue);
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
      case DmdlPackage.PROPERTY_EXPRESSION_REFERENCE__MODEL_NAME:
        setModelName((ModelDefinition)null);
        return;
      case DmdlPackage.PROPERTY_EXPRESSION_REFERENCE__NAME:
        setName((Property)null);
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
      case DmdlPackage.PROPERTY_EXPRESSION_REFERENCE__MODEL_NAME:
        return modelName != null;
      case DmdlPackage.PROPERTY_EXPRESSION_REFERENCE__NAME:
        return name != null;
    }
    return super.eIsSet(featureID);
  }

} //PropertyExpressionReferenceImpl
