/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl.impl;

import jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Summarize Term</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.SummarizeTermImpl#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SummarizeTermImpl extends MinimalEObjectImpl.Container implements SummarizeTerm
{
  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected ModelReference reference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SummarizeTermImpl()
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
    return DmdlPackage.Literals.SUMMARIZE_TERM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelReference getReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReference(ModelReference newReference, NotificationChain msgs)
  {
    ModelReference oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmdlPackage.SUMMARIZE_TERM__REFERENCE, oldReference, newReference);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(ModelReference newReference)
  {
    if (newReference != reference)
    {
      NotificationChain msgs = null;
      if (reference != null)
        msgs = ((InternalEObject)reference).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmdlPackage.SUMMARIZE_TERM__REFERENCE, null, msgs);
      if (newReference != null)
        msgs = ((InternalEObject)newReference).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmdlPackage.SUMMARIZE_TERM__REFERENCE, null, msgs);
      msgs = basicSetReference(newReference, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmdlPackage.SUMMARIZE_TERM__REFERENCE, newReference, newReference));
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
      case DmdlPackage.SUMMARIZE_TERM__REFERENCE:
        return basicSetReference(null, msgs);
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
      case DmdlPackage.SUMMARIZE_TERM__REFERENCE:
        return getReference();
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
      case DmdlPackage.SUMMARIZE_TERM__REFERENCE:
        setReference((ModelReference)newValue);
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
      case DmdlPackage.SUMMARIZE_TERM__REFERENCE:
        setReference((ModelReference)null);
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
      case DmdlPackage.SUMMARIZE_TERM__REFERENCE:
        return reference != null;
    }
    return super.eIsSet(featureID);
  }

} //SummarizeTermImpl
