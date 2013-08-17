/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlFactory
 * @model kind="package"
 * @generated
 */
public interface DmdlPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dmdl";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.hishidama.jp/xtext/dmdl_editor/dmdl";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dmdl";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DmdlPackage eINSTANCE = jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl.init();

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelsImpl <em>Models</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelsImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getModels()
   * @generated
   */
  int MODELS = 0;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODELS__LIST = 0;

  /**
   * The number of structural features of the '<em>Models</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODELS_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelDefinitionImpl <em>Model Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelDefinitionImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getModelDefinition()
   * @generated
   */
  int MODEL_DEFINITION = 1;

  /**
   * The number of structural features of the '<em>Model Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_DEFINITION_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.RecordModelDefinitionImpl <em>Record Model Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.RecordModelDefinitionImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getRecordModelDefinition()
   * @generated
   */
  int RECORD_MODEL_DEFINITION = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_MODEL_DEFINITION__DESCRIPTION = MODEL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_MODEL_DEFINITION__ATTRIBUTES = MODEL_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_MODEL_DEFINITION__NAME = MODEL_DEFINITION_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_MODEL_DEFINITION__RHS = MODEL_DEFINITION_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Record Model Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_MODEL_DEFINITION_FEATURE_COUNT = MODEL_DEFINITION_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.RecordExpressionImpl <em>Record Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.RecordExpressionImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getRecordExpression()
   * @generated
   */
  int RECORD_EXPRESSION = 3;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_EXPRESSION__TERMS = 0;

  /**
   * The number of structural features of the '<em>Record Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.RecordTermImpl <em>Record Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.RecordTermImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getRecordTerm()
   * @generated
   */
  int RECORD_TERM = 4;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TERM__PROPERTIES = 0;

  /**
   * The number of structural features of the '<em>Record Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TERM_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyDefinitionImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getPropertyDefinition()
   * @generated
   */
  int PROPERTY_DEFINITION = 5;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__NAME = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__TYPE = 3;

  /**
   * The number of structural features of the '<em>Property Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeListImpl <em>Attribute List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeListImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributeList()
   * @generated
   */
  int ATTRIBUTE_LIST = 6;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_LIST__ATTRIBUTES = 0;

  /**
   * The number of structural features of the '<em>Attribute List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeElementListImpl <em>Attribute Element List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeElementListImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributeElementList()
   * @generated
   */
  int ATTRIBUTE_ELEMENT_LIST = 8;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_ELEMENT_LIST__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Attribute Element List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_ELEMENT_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeElementImpl <em>Attribute Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeElementImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributeElement()
   * @generated
   */
  int ATTRIBUTE_ELEMENT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_ELEMENT__VALUE = 1;

  /**
   * The number of structural features of the '<em>Attribute Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeValueImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributeValue()
   * @generated
   */
  int ATTRIBUTE_VALUE = 10;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE__VALUE = 0;

  /**
   * The number of structural features of the '<em>Attribute Value</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeValueArrayImpl <em>Attribute Value Array</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeValueArrayImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributeValueArray()
   * @generated
   */
  int ATTRIBUTE_VALUE_ARRAY = 11;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE_ARRAY__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Attribute Value Array</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE_ARRAY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.QualifiedNameImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getQualifiedName()
   * @generated
   */
  int QUALIFIED_NAME = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME__NAME = 0;

  /**
   * The number of structural features of the '<em>Qualified Name</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.LiteralImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 13;

  /**
   * The feature id for the '<em><b>String Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__STRING_VALUE = 0;

  /**
   * The feature id for the '<em><b>Int Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__INT_VALUE = 1;

  /**
   * The feature id for the '<em><b>Decimal Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__DECIMAL_VALUE = 2;

  /**
   * The feature id for the '<em><b>Boolean Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL__BOOLEAN_VALUE = 3;

  /**
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Type <em>Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Type
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getType()
   * @generated
   */
  int TYPE = 14;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.BOOLEAN <em>BOOLEAN</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.BOOLEAN
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getBOOLEAN()
   * @generated
   */
  int BOOLEAN = 15;


  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Models <em>Models</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Models</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Models
   * @generated
   */
  EClass getModels();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Models#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>List</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Models#getList()
   * @see #getModels()
   * @generated
   */
  EReference getModels_List();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition <em>Model Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Definition</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition
   * @generated
   */
  EClass getModelDefinition();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.RecordModelDefinition <em>Record Model Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Model Definition</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.RecordModelDefinition
   * @generated
   */
  EClass getRecordModelDefinition();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.RecordModelDefinition#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.RecordModelDefinition#getDescription()
   * @see #getRecordModelDefinition()
   * @generated
   */
  EAttribute getRecordModelDefinition_Description();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.RecordModelDefinition#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.RecordModelDefinition#getAttributes()
   * @see #getRecordModelDefinition()
   * @generated
   */
  EReference getRecordModelDefinition_Attributes();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.RecordModelDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.RecordModelDefinition#getName()
   * @see #getRecordModelDefinition()
   * @generated
   */
  EAttribute getRecordModelDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.RecordModelDefinition#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.RecordModelDefinition#getRhs()
   * @see #getRecordModelDefinition()
   * @generated
   */
  EReference getRecordModelDefinition_Rhs();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.RecordExpression <em>Record Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Expression</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.RecordExpression
   * @generated
   */
  EClass getRecordExpression();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.dmdl_editor.dmdl.RecordExpression#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Terms</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.RecordExpression#getTerms()
   * @see #getRecordExpression()
   * @generated
   */
  EReference getRecordExpression_Terms();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm <em>Record Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Record Term</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm
   * @generated
   */
  EClass getRecordTerm();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm#getProperties()
   * @see #getRecordTerm()
   * @generated
   */
  EReference getRecordTerm_Properties();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition <em>Property Definition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Definition</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition
   * @generated
   */
  EClass getPropertyDefinition();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition#getDescription()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_Description();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition#getAttributes()
   * @see #getPropertyDefinition()
   * @generated
   */
  EReference getPropertyDefinition_Attributes();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition#getName()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_Name();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition#getType()
   * @see #getPropertyDefinition()
   * @generated
   */
  EAttribute getPropertyDefinition_Type();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList <em>Attribute List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute List</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList
   * @generated
   */
  EClass getAttributeList();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attributes</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList#getAttributes()
   * @see #getAttributeList()
   * @generated
   */
  EReference getAttributeList_Attributes();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Name();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Attribute#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elements</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Attribute#getElements()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_Elements();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementList <em>Attribute Element List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Element List</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementList
   * @generated
   */
  EClass getAttributeElementList();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementList#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementList#getElements()
   * @see #getAttributeElementList()
   * @generated
   */
  EReference getAttributeElementList_Elements();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement <em>Attribute Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Element</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement
   * @generated
   */
  EClass getAttributeElement();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement#getName()
   * @see #getAttributeElement()
   * @generated
   */
  EAttribute getAttributeElement_Name();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement#getValue()
   * @see #getAttributeElement()
   * @generated
   */
  EReference getAttributeElement_Value();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Value</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValue
   * @generated
   */
  EClass getAttributeValue();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValue#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValue#getValue()
   * @see #getAttributeValue()
   * @generated
   */
  EReference getAttributeValue_Value();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValueArray <em>Attribute Value Array</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Value Array</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValueArray
   * @generated
   */
  EClass getAttributeValueArray();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValueArray#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValueArray#getElements()
   * @see #getAttributeValueArray()
   * @generated
   */
  EReference getAttributeValueArray_Elements();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.QualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.QualifiedName
   * @generated
   */
  EClass getQualifiedName();

  /**
   * Returns the meta object for the attribute list '{@link jp.hishidama.xtext.dmdl_editor.dmdl.QualifiedName#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Name</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.QualifiedName#getName()
   * @see #getQualifiedName()
   * @generated
   */
  EAttribute getQualifiedName_Name();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Literal</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Literal
   * @generated
   */
  EClass getLiteral();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Literal#getStringValue <em>String Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>String Value</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Literal#getStringValue()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_StringValue();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Literal#getIntValue <em>Int Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Int Value</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Literal#getIntValue()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_IntValue();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Literal#getDecimalValue <em>Decimal Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Decimal Value</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Literal#getDecimalValue()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_DecimalValue();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Literal#getBooleanValue <em>Boolean Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Boolean Value</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Literal#getBooleanValue()
   * @see #getLiteral()
   * @generated
   */
  EAttribute getLiteral_BooleanValue();

  /**
   * Returns the meta object for enum '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Type
   * @generated
   */
  EEnum getType();

  /**
   * Returns the meta object for enum '{@link jp.hishidama.xtext.dmdl_editor.dmdl.BOOLEAN <em>BOOLEAN</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>BOOLEAN</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.BOOLEAN
   * @generated
   */
  EEnum getBOOLEAN();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DmdlFactory getDmdlFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelsImpl <em>Models</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelsImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getModels()
     * @generated
     */
    EClass MODELS = eINSTANCE.getModels();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODELS__LIST = eINSTANCE.getModels_List();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelDefinitionImpl <em>Model Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelDefinitionImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getModelDefinition()
     * @generated
     */
    EClass MODEL_DEFINITION = eINSTANCE.getModelDefinition();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.RecordModelDefinitionImpl <em>Record Model Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.RecordModelDefinitionImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getRecordModelDefinition()
     * @generated
     */
    EClass RECORD_MODEL_DEFINITION = eINSTANCE.getRecordModelDefinition();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD_MODEL_DEFINITION__DESCRIPTION = eINSTANCE.getRecordModelDefinition_Description();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_MODEL_DEFINITION__ATTRIBUTES = eINSTANCE.getRecordModelDefinition_Attributes();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RECORD_MODEL_DEFINITION__NAME = eINSTANCE.getRecordModelDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_MODEL_DEFINITION__RHS = eINSTANCE.getRecordModelDefinition_Rhs();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.RecordExpressionImpl <em>Record Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.RecordExpressionImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getRecordExpression()
     * @generated
     */
    EClass RECORD_EXPRESSION = eINSTANCE.getRecordExpression();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_EXPRESSION__TERMS = eINSTANCE.getRecordExpression_Terms();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.RecordTermImpl <em>Record Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.RecordTermImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getRecordTerm()
     * @generated
     */
    EClass RECORD_TERM = eINSTANCE.getRecordTerm();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_TERM__PROPERTIES = eINSTANCE.getRecordTerm_Properties();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyDefinitionImpl <em>Property Definition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyDefinitionImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getPropertyDefinition()
     * @generated
     */
    EClass PROPERTY_DEFINITION = eINSTANCE.getPropertyDefinition();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__DESCRIPTION = eINSTANCE.getPropertyDefinition_Description();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DEFINITION__ATTRIBUTES = eINSTANCE.getPropertyDefinition_Attributes();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__NAME = eINSTANCE.getPropertyDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_DEFINITION__TYPE = eINSTANCE.getPropertyDefinition_Type();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeListImpl <em>Attribute List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeListImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributeList()
     * @generated
     */
    EClass ATTRIBUTE_LIST = eINSTANCE.getAttributeList();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_LIST__ATTRIBUTES = eINSTANCE.getAttributeList_Attributes();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__ELEMENTS = eINSTANCE.getAttribute_Elements();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeElementListImpl <em>Attribute Element List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeElementListImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributeElementList()
     * @generated
     */
    EClass ATTRIBUTE_ELEMENT_LIST = eINSTANCE.getAttributeElementList();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_ELEMENT_LIST__ELEMENTS = eINSTANCE.getAttributeElementList_Elements();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeElementImpl <em>Attribute Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeElementImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributeElement()
     * @generated
     */
    EClass ATTRIBUTE_ELEMENT = eINSTANCE.getAttributeElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE_ELEMENT__NAME = eINSTANCE.getAttributeElement_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_ELEMENT__VALUE = eINSTANCE.getAttributeElement_Value();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeValueImpl <em>Attribute Value</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeValueImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributeValue()
     * @generated
     */
    EClass ATTRIBUTE_VALUE = eINSTANCE.getAttributeValue();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_VALUE__VALUE = eINSTANCE.getAttributeValue_Value();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeValueArrayImpl <em>Attribute Value Array</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeValueArrayImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributeValueArray()
     * @generated
     */
    EClass ATTRIBUTE_VALUE_ARRAY = eINSTANCE.getAttributeValueArray();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_VALUE_ARRAY__ELEMENTS = eINSTANCE.getAttributeValueArray_Elements();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.QualifiedNameImpl <em>Qualified Name</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.QualifiedNameImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getQualifiedName()
     * @generated
     */
    EClass QUALIFIED_NAME = eINSTANCE.getQualifiedName();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_NAME__NAME = eINSTANCE.getQualifiedName_Name();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.LiteralImpl <em>Literal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.LiteralImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getLiteral()
     * @generated
     */
    EClass LITERAL = eINSTANCE.getLiteral();

    /**
     * The meta object literal for the '<em><b>String Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__STRING_VALUE = eINSTANCE.getLiteral_StringValue();

    /**
     * The meta object literal for the '<em><b>Int Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__INT_VALUE = eINSTANCE.getLiteral_IntValue();

    /**
     * The meta object literal for the '<em><b>Decimal Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__DECIMAL_VALUE = eINSTANCE.getLiteral_DecimalValue();

    /**
     * The meta object literal for the '<em><b>Boolean Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LITERAL__BOOLEAN_VALUE = eINSTANCE.getLiteral_BooleanValue();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Type <em>Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.Type
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getType()
     * @generated
     */
    EEnum TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.BOOLEAN <em>BOOLEAN</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.BOOLEAN
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getBOOLEAN()
     * @generated
     */
    EEnum BOOLEAN = eINSTANCE.getBOOLEAN();

  }

} //DmdlPackage
