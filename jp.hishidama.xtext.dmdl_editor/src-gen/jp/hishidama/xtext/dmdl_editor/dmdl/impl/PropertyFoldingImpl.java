/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl.impl;

import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList;
import jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding;
import jp.hishidama.xtext.dmdl_editor.dmdl.QualifiedName;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Folding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyFoldingImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyFoldingImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyFoldingImpl#getAggregator <em>Aggregator</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyFoldingImpl#getFrom <em>From</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyFoldingImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyFoldingImpl extends MinimalEObjectImpl.Container implements PropertyFolding
{
  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

  /**
   * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAttributes()
   * @generated
   * @ordered
   */
  protected AttributeList attributes;

  /**
   * The cached value of the '{@link #getAggregator() <em>Aggregator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAggregator()
   * @generated
   * @ordered
   */
  protected QualifiedName aggregator;

  /**
   * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected static final String FROM_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFrom()
   * @generated
   * @ordered
   */
  protected String from = FROM_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PropertyFoldingImpl()
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
    return DmdlPackage.Literals.PROPERTY_FOLDING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmdlPackage.PROPERTY_FOLDING__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeList getAttributes()
  {
    return attributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAttributes(AttributeList newAttributes, NotificationChain msgs)
  {
    AttributeList oldAttributes = attributes;
    attributes = newAttributes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmdlPackage.PROPERTY_FOLDING__ATTRIBUTES, oldAttributes, newAttributes);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAttributes(AttributeList newAttributes)
  {
    if (newAttributes != attributes)
    {
      NotificationChain msgs = null;
      if (attributes != null)
        msgs = ((InternalEObject)attributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmdlPackage.PROPERTY_FOLDING__ATTRIBUTES, null, msgs);
      if (newAttributes != null)
        msgs = ((InternalEObject)newAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmdlPackage.PROPERTY_FOLDING__ATTRIBUTES, null, msgs);
      msgs = basicSetAttributes(newAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmdlPackage.PROPERTY_FOLDING__ATTRIBUTES, newAttributes, newAttributes));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedName getAggregator()
  {
    return aggregator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAggregator(QualifiedName newAggregator, NotificationChain msgs)
  {
    QualifiedName oldAggregator = aggregator;
    aggregator = newAggregator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DmdlPackage.PROPERTY_FOLDING__AGGREGATOR, oldAggregator, newAggregator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAggregator(QualifiedName newAggregator)
  {
    if (newAggregator != aggregator)
    {
      NotificationChain msgs = null;
      if (aggregator != null)
        msgs = ((InternalEObject)aggregator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DmdlPackage.PROPERTY_FOLDING__AGGREGATOR, null, msgs);
      if (newAggregator != null)
        msgs = ((InternalEObject)newAggregator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DmdlPackage.PROPERTY_FOLDING__AGGREGATOR, null, msgs);
      msgs = basicSetAggregator(newAggregator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmdlPackage.PROPERTY_FOLDING__AGGREGATOR, newAggregator, newAggregator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFrom()
  {
    return from;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFrom(String newFrom)
  {
    String oldFrom = from;
    from = newFrom;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DmdlPackage.PROPERTY_FOLDING__FROM, oldFrom, from));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DmdlPackage.PROPERTY_FOLDING__NAME, oldName, name));
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
      case DmdlPackage.PROPERTY_FOLDING__ATTRIBUTES:
        return basicSetAttributes(null, msgs);
      case DmdlPackage.PROPERTY_FOLDING__AGGREGATOR:
        return basicSetAggregator(null, msgs);
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
      case DmdlPackage.PROPERTY_FOLDING__DESCRIPTION:
        return getDescription();
      case DmdlPackage.PROPERTY_FOLDING__ATTRIBUTES:
        return getAttributes();
      case DmdlPackage.PROPERTY_FOLDING__AGGREGATOR:
        return getAggregator();
      case DmdlPackage.PROPERTY_FOLDING__FROM:
        return getFrom();
      case DmdlPackage.PROPERTY_FOLDING__NAME:
        return getName();
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
      case DmdlPackage.PROPERTY_FOLDING__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case DmdlPackage.PROPERTY_FOLDING__ATTRIBUTES:
        setAttributes((AttributeList)newValue);
        return;
      case DmdlPackage.PROPERTY_FOLDING__AGGREGATOR:
        setAggregator((QualifiedName)newValue);
        return;
      case DmdlPackage.PROPERTY_FOLDING__FROM:
        setFrom((String)newValue);
        return;
      case DmdlPackage.PROPERTY_FOLDING__NAME:
        setName((String)newValue);
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
      case DmdlPackage.PROPERTY_FOLDING__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case DmdlPackage.PROPERTY_FOLDING__ATTRIBUTES:
        setAttributes((AttributeList)null);
        return;
      case DmdlPackage.PROPERTY_FOLDING__AGGREGATOR:
        setAggregator((QualifiedName)null);
        return;
      case DmdlPackage.PROPERTY_FOLDING__FROM:
        setFrom(FROM_EDEFAULT);
        return;
      case DmdlPackage.PROPERTY_FOLDING__NAME:
        setName(NAME_EDEFAULT);
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
      case DmdlPackage.PROPERTY_FOLDING__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case DmdlPackage.PROPERTY_FOLDING__ATTRIBUTES:
        return attributes != null;
      case DmdlPackage.PROPERTY_FOLDING__AGGREGATOR:
        return aggregator != null;
      case DmdlPackage.PROPERTY_FOLDING__FROM:
        return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
      case DmdlPackage.PROPERTY_FOLDING__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
    result.append(" (description: ");
    result.append(description);
    result.append(", from: ");
    result.append(from);
    result.append(", name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //PropertyFoldingImpl
