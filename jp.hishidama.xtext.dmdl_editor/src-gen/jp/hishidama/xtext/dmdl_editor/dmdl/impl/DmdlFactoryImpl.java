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
      case DmdlPackage.SCRIPT: return createScript();
      case DmdlPackage.MODEL_DEFINITION: return createModelDefinition();
      case DmdlPackage.RECORD_EXPRESSION: return createRecordExpression();
      case DmdlPackage.RECORD_TERM: return createRecordTerm();
      case DmdlPackage.MODEL_REFERENCE: return createModelReference();
      case DmdlPackage.PROPERTY_DEFINITION: return createPropertyDefinition();
      case DmdlPackage.JOIN_EXPRESSION: return createJoinExpression();
      case DmdlPackage.JOIN_TERM: return createJoinTerm();
      case DmdlPackage.SUMMARIZE_EXPRESSION: return createSummarizeExpression();
      case DmdlPackage.SUMMARIZE_TERM: return createSummarizeTerm();
      case DmdlPackage.ATTRIBUTE_LIST: return createAttributeList();
      case DmdlPackage.ATTRIBUTE: return createAttribute();
      case DmdlPackage.ATTRIBUTE_ELEMENT_BLOCK: return createAttributeElementBlock();
      case DmdlPackage.ATTRIBUTE_ELEMENT_LIST: return createAttributeElementList();
      case DmdlPackage.ATTRIBUTE_ELEMENT: return createAttributeElement();
      case DmdlPackage.ATTRIBUTE_VALUE: return createAttributeValue();
      case DmdlPackage.ATTRIBUTE_VALUE_ARRAY: return createAttributeValueArray();
      case DmdlPackage.GROUPING: return createGrouping();
      case DmdlPackage.MODEL_MAPPING: return createModelMapping();
      case DmdlPackage.PROPERTY_MAPPING: return createPropertyMapping();
      case DmdlPackage.MODEL_FOLDING: return createModelFolding();
      case DmdlPackage.PROPERTY_FOLDING: return createPropertyFolding();
      case DmdlPackage.PROPERTY: return createProperty();
      case DmdlPackage.QUALIFIED_NAME_OBJECT: return createQualifiedNameObject();
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
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Script createScript()
  {
    ScriptImpl script = new ScriptImpl();
    return script;
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
  public ModelReference createModelReference()
  {
    ModelReferenceImpl modelReference = new ModelReferenceImpl();
    return modelReference;
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
  public JoinExpression createJoinExpression()
  {
    JoinExpressionImpl joinExpression = new JoinExpressionImpl();
    return joinExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public JoinTerm createJoinTerm()
  {
    JoinTermImpl joinTerm = new JoinTermImpl();
    return joinTerm;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SummarizeExpression createSummarizeExpression()
  {
    SummarizeExpressionImpl summarizeExpression = new SummarizeExpressionImpl();
    return summarizeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SummarizeTerm createSummarizeTerm()
  {
    SummarizeTermImpl summarizeTerm = new SummarizeTermImpl();
    return summarizeTerm;
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
  public AttributeElementBlock createAttributeElementBlock()
  {
    AttributeElementBlockImpl attributeElementBlock = new AttributeElementBlockImpl();
    return attributeElementBlock;
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
  public Grouping createGrouping()
  {
    GroupingImpl grouping = new GroupingImpl();
    return grouping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelMapping createModelMapping()
  {
    ModelMappingImpl modelMapping = new ModelMappingImpl();
    return modelMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyMapping createPropertyMapping()
  {
    PropertyMappingImpl propertyMapping = new PropertyMappingImpl();
    return propertyMapping;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ModelFolding createModelFolding()
  {
    ModelFoldingImpl modelFolding = new ModelFoldingImpl();
    return modelFolding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyFolding createPropertyFolding()
  {
    PropertyFoldingImpl propertyFolding = new PropertyFoldingImpl();
    return propertyFolding;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualifiedNameObject createQualifiedNameObject()
  {
    QualifiedNameObjectImpl qualifiedNameObject = new QualifiedNameObjectImpl();
    return qualifiedNameObject;
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
