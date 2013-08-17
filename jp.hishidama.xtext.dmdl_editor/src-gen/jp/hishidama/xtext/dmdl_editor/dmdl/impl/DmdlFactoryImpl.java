/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl.impl;

import jp.hishidama.xtext.dmdl_editor.dmdl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DmdlFactoryImpl extends EFactoryImpl implements DmdlFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DmdlFactory init()
  {
    try
    {
      DmdlFactory theDmdlFactory = (DmdlFactory)EPackage.Registry.INSTANCE.getEFactory(DmdlPackage.eNS_URI);
      if (theDmdlFactory != null)
      {
        return theDmdlFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DmdlFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DmdlFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DmdlPackage.MODELS: return createModels();
      case DmdlPackage.MODEL_DEFINITION: return createModelDefinition();
      case DmdlPackage.RECORD_MODEL_DEFINITION: return createRecordModelDefinition();
      case DmdlPackage.RECORD_EXPRESSION: return createRecordExpression();
      case DmdlPackage.RECORD_TERM: return createRecordTerm();
      case DmdlPackage.PROPERTY_DEFINITION: return createPropertyDefinition();
      case DmdlPackage.ATTRIBUTE_LIST: return createAttributeList();
      case DmdlPackage.ATTRIBUTE: return createAttribute();
      case DmdlPackage.ATTRIBUTE_ELEMENT_LIST: return createAttributeElementList();
      case DmdlPackage.ATTRIBUTE_ELEMENT: return createAttributeElement();
      case DmdlPackage.ATTRIBUTE_VALUE: return createAttributeValue();
      case DmdlPackage.ATTRIBUTE_VALUE_ARRAY: return createAttributeValueArray();
      case DmdlPackage.QUALIFIED_NAME: return createQualifiedName();
      case DmdlPackage.LITERAL: return createLiteral();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DmdlPackage.TYPE:
        return createTypeFromString(eDataType, initialValue);
      case DmdlPackage.BOOLEAN:
        return createBOOLEANFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DmdlPackage.TYPE:
        return convertTypeToString(eDataType, instanceValue);
      case DmdlPackage.BOOLEAN:
        return convertBOOLEANToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Models createModels()
  {
    ModelsImpl models = new ModelsImpl();
    return models;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelDefinition createModelDefinition()
  {
    ModelDefinitionImpl modelDefinition = new ModelDefinitionImpl();
    return modelDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordModelDefinition createRecordModelDefinition()
  {
    RecordModelDefinitionImpl recordModelDefinition = new RecordModelDefinitionImpl();
    return recordModelDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordExpression createRecordExpression()
  {
    RecordExpressionImpl recordExpression = new RecordExpressionImpl();
    return recordExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RecordTerm createRecordTerm()
  {
    RecordTermImpl recordTerm = new RecordTermImpl();
    return recordTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyDefinition createPropertyDefinition()
  {
    PropertyDefinitionImpl propertyDefinition = new PropertyDefinitionImpl();
    return propertyDefinition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeList createAttributeList()
  {
    AttributeListImpl attributeList = new AttributeListImpl();
    return attributeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeElementList createAttributeElementList()
  {
    AttributeElementListImpl attributeElementList = new AttributeElementListImpl();
    return attributeElementList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeElement createAttributeElement()
  {
    AttributeElementImpl attributeElement = new AttributeElementImpl();
    return attributeElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeValue createAttributeValue()
  {
    AttributeValueImpl attributeValue = new AttributeValueImpl();
    return attributeValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AttributeValueArray createAttributeValueArray()
  {
    AttributeValueArrayImpl attributeValueArray = new AttributeValueArrayImpl();
    return attributeValueArray;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedName createQualifiedName()
  {
    QualifiedNameImpl qualifiedName = new QualifiedNameImpl();
    return qualifiedName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Literal createLiteral()
  {
    LiteralImpl literal = new LiteralImpl();
    return literal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createTypeFromString(EDataType eDataType, String initialValue)
  {
    Type result = Type.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertTypeToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BOOLEAN createBOOLEANFromString(EDataType eDataType, String initialValue)
  {
    BOOLEAN result = BOOLEAN.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertBOOLEANToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DmdlPackage getDmdlPackage()
  {
    return (DmdlPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DmdlPackage getPackage()
  {
    return DmdlPackage.eINSTANCE;
  }

} //DmdlFactoryImpl
