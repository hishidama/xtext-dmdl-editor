/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl.impl;

import jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage;
import jp.hishidama.xtext.dmdl_editor.dmdl.Grouping;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelFolding;
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
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.SummarizeTermImpl#getFolding <em>Folding</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.SummarizeTermImpl#getGrouping <em>Grouping</em>}</li>
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
   * The cached value of the '{@link #getFolding() <em>Folding</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFolding()
   * @generated
   * @ordered
   */
  protected ModelFolding folding;

  /**
   * The cached value of the '{@link #getGrouping() <em>Grouping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGrouping()
   * @generated
   * @ordered
   */
  protected Grouping grouping;

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
  public ModelFolding getFolding()
  {
    return folding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFolding(ModelFolding newFolding, NotificationChain msgs)
  {
    ModelFolding oldFolding = folding;
    folding = newFolding;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmdlPackage.SUMMARIZE_TERM__FOLDING, oldFolding, newFolding);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFolding(ModelFolding newFolding)
  {
    if (newFolding != folding)
    {
      NotificationChain msgs = null;
      if (folding != null)
        msgs = ((InternalEObject)folding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmdlPackage.SUMMARIZE_TERM__FOLDING, null, msgs);
      if (newFolding != null)
        msgs = ((InternalEObject)newFolding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmdlPackage.SUMMARIZE_TERM__FOLDING, null, msgs);
      msgs = basicSetFolding(newFolding, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmdlPackage.SUMMARIZE_TERM__FOLDING, newFolding, newFolding));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Grouping getGrouping()
  {
    return grouping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGrouping(Grouping newGrouping, NotificationChain msgs)
  {
    Grouping oldGrouping = grouping;
    grouping = newGrouping;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmdlPackage.SUMMARIZE_TERM__GROUPING, oldGrouping, newGrouping);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGrouping(Grouping newGrouping)
  {
    if (newGrouping != grouping)
    {
      NotificationChain msgs = null;
      if (grouping != null)
        msgs = ((InternalEObject)grouping).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmdlPackage.SUMMARIZE_TERM__GROUPING, null, msgs);
      if (newGrouping != null)
        msgs = ((InternalEObject)newGrouping).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmdlPackage.SUMMARIZE_TERM__GROUPING, null, msgs);
      msgs = basicSetGrouping(newGrouping, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmdlPackage.SUMMARIZE_TERM__GROUPING, newGrouping, newGrouping));
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
      case DmdlPackage.SUMMARIZE_TERM__FOLDING:
        return basicSetFolding(null, msgs);
      case DmdlPackage.SUMMARIZE_TERM__GROUPING:
        return basicSetGrouping(null, msgs);
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
      case DmdlPackage.SUMMARIZE_TERM__FOLDING:
        return getFolding();
      case DmdlPackage.SUMMARIZE_TERM__GROUPING:
        return getGrouping();
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
      case DmdlPackage.SUMMARIZE_TERM__FOLDING:
        setFolding((ModelFolding)newValue);
        return;
      case DmdlPackage.SUMMARIZE_TERM__GROUPING:
        setGrouping((Grouping)newValue);
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
      case DmdlPackage.SUMMARIZE_TERM__FOLDING:
        setFolding((ModelFolding)null);
        return;
      case DmdlPackage.SUMMARIZE_TERM__GROUPING:
        setGrouping((Grouping)null);
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
      case DmdlPackage.SUMMARIZE_TERM__FOLDING:
        return folding != null;
      case DmdlPackage.SUMMARIZE_TERM__GROUPING:
        return grouping != null;
    }
    return super.eIsSet(featureID);
  }

} //SummarizeTermImpl
