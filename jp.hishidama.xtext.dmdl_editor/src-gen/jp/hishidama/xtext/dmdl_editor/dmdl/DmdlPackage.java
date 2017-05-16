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
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.ScriptImpl <em>Script</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.ScriptImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getScript()
   * @generated
   */
  int SCRIPT = 0;

  /**
   * The feature id for the '<em><b>List</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT__LIST = 0;

  /**
   * The number of structural features of the '<em>Script</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCRIPT_FEATURE_COUNT = 1;

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
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_DEFINITION__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_DEFINITION__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_DEFINITION__TYPE = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_DEFINITION__NAME = 3;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_DEFINITION__RHS = 4;

  /**
   * The number of structural features of the '<em>Model Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_DEFINITION_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.RecordExpressionImpl <em>Record Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.RecordExpressionImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getRecordExpression()
   * @generated
   */
  int RECORD_EXPRESSION = 2;

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
  int RECORD_TERM = 3;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TERM__PROPERTIES = 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TERM__REFERENCE = 1;

  /**
   * The number of structural features of the '<em>Record Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_TERM_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelReferenceImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getModelReference()
   * @generated
   */
  int MODEL_REFERENCE = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_REFERENCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Model Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_REFERENCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 30;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__DESCRIPTION = 0;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__ATTRIBUTES = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 2;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 3;

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
  int PROPERTY_DEFINITION__DESCRIPTION = PROPERTY__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__ATTRIBUTES = PROPERTY__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__NAME = PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__TYPE = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__EXPRESSION = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Property Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionImpl <em>Property Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getPropertyExpression()
   * @generated
   */
  int PROPERTY_EXPRESSION = 6;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_EXPRESSION__EXPRESSION = 0;

  /**
   * The number of structural features of the '<em>Property Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionListImpl <em>Property Expression List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionListImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getPropertyExpressionList()
   * @generated
   */
  int PROPERTY_EXPRESSION_LIST = 7;

  /**
   * The feature id for the '<em><b>Elements</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_EXPRESSION_LIST__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Property Expression List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_EXPRESSION_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionMapImpl <em>Property Expression Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionMapImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getPropertyExpressionMap()
   * @generated
   */
  int PROPERTY_EXPRESSION_MAP = 8;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_EXPRESSION_MAP__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Property Expression Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_EXPRESSION_MAP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionMapEntryImpl <em>Property Expression Map Entry</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionMapEntryImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getPropertyExpressionMapEntry()
   * @generated
   */
  int PROPERTY_EXPRESSION_MAP_ENTRY = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_EXPRESSION_MAP_ENTRY__NAME = 0;

  /**
   * The feature id for the '<em><b>Property</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_EXPRESSION_MAP_ENTRY__PROPERTY = 1;

  /**
   * The number of structural features of the '<em>Property Expression Map Entry</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_EXPRESSION_MAP_ENTRY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionRefernceImpl <em>Property Expression Refernce</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionRefernceImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getPropertyExpressionRefernce()
   * @generated
   */
  int PROPERTY_EXPRESSION_REFERNCE = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_EXPRESSION_REFERNCE__NAME = 0;

  /**
   * The number of structural features of the '<em>Property Expression Refernce</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_EXPRESSION_REFERNCE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.TypeImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getType()
   * @generated
   */
  int TYPE = 11;

  /**
   * The feature id for the '<em><b>Basic Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__BASIC_TYPE = 0;

  /**
   * The feature id for the '<em><b>Collection Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__COLLECTION_TYPE = 1;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.JoinExpressionImpl <em>Join Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.JoinExpressionImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getJoinExpression()
   * @generated
   */
  int JOIN_EXPRESSION = 12;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_EXPRESSION__TERMS = 0;

  /**
   * The number of structural features of the '<em>Join Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.JoinTermImpl <em>Join Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.JoinTermImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getJoinTerm()
   * @generated
   */
  int JOIN_TERM = 13;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TERM__REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TERM__MAPPING = 1;

  /**
   * The feature id for the '<em><b>Grouping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TERM__GROUPING = 2;

  /**
   * The number of structural features of the '<em>Join Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int JOIN_TERM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.SummarizeExpressionImpl <em>Summarize Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.SummarizeExpressionImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getSummarizeExpression()
   * @generated
   */
  int SUMMARIZE_EXPRESSION = 14;

  /**
   * The feature id for the '<em><b>Terms</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUMMARIZE_EXPRESSION__TERMS = 0;

  /**
   * The number of structural features of the '<em>Summarize Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUMMARIZE_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.SummarizeTermImpl <em>Summarize Term</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.SummarizeTermImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getSummarizeTerm()
   * @generated
   */
  int SUMMARIZE_TERM = 15;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUMMARIZE_TERM__REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Folding</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUMMARIZE_TERM__FOLDING = 1;

  /**
   * The feature id for the '<em><b>Grouping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUMMARIZE_TERM__GROUPING = 2;

  /**
   * The number of structural features of the '<em>Summarize Term</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SUMMARIZE_TERM_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeListImpl <em>Attribute List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeListImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributeList()
   * @generated
   */
  int ATTRIBUTE_LIST = 16;

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
  int ATTRIBUTE = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__NAME = 0;

  /**
   * The feature id for the '<em><b>Element Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ELEMENT_BLOCK = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeElementBlockImpl <em>Attribute Element Block</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeElementBlockImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributeElementBlock()
   * @generated
   */
  int ATTRIBUTE_ELEMENT_BLOCK = 18;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_ELEMENT_BLOCK__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Attribute Element Block</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_ELEMENT_BLOCK_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeElementListImpl <em>Attribute Element List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeElementListImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributeElementList()
   * @generated
   */
  int ATTRIBUTE_ELEMENT_LIST = 19;

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
  int ATTRIBUTE_ELEMENT = 20;

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
  int ATTRIBUTE_VALUE = 21;

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
  int ATTRIBUTE_VALUE_ARRAY = 22;

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
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeValueMapImpl <em>Attribute Value Map</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeValueMapImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributeValueMap()
   * @generated
   */
  int ATTRIBUTE_VALUE_MAP = 23;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE_MAP__ELEMENTS = 0;

  /**
   * The number of structural features of the '<em>Attribute Value Map</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_VALUE_MAP_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributePairImpl <em>Attribute Pair</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributePairImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributePair()
   * @generated
   */
  int ATTRIBUTE_PAIR = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PAIR__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PAIR__VALUE = 1;

  /**
   * The number of structural features of the '<em>Attribute Pair</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_PAIR_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.GroupingImpl <em>Grouping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.GroupingImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getGrouping()
   * @generated
   */
  int GROUPING = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING__NAME = 0;

  /**
   * The number of structural features of the '<em>Grouping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GROUPING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelMappingImpl <em>Model Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelMappingImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getModelMapping()
   * @generated
   */
  int MODEL_MAPPING = 26;

  /**
   * The feature id for the '<em><b>Mappings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPING__MAPPINGS = 0;

  /**
   * The number of structural features of the '<em>Model Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_MAPPING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyMappingImpl <em>Property Mapping</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyMappingImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getPropertyMapping()
   * @generated
   */
  int PROPERTY_MAPPING = 27;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_MAPPING__DESCRIPTION = PROPERTY__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_MAPPING__ATTRIBUTES = PROPERTY__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_MAPPING__NAME = PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_MAPPING__FROM = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Property Mapping</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_MAPPING_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelFoldingImpl <em>Model Folding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelFoldingImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getModelFolding()
   * @generated
   */
  int MODEL_FOLDING = 28;

  /**
   * The feature id for the '<em><b>Foldings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FOLDING__FOLDINGS = 0;

  /**
   * The number of structural features of the '<em>Model Folding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FOLDING_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyFoldingImpl <em>Property Folding</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyFoldingImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getPropertyFolding()
   * @generated
   */
  int PROPERTY_FOLDING = 29;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FOLDING__DESCRIPTION = PROPERTY__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FOLDING__ATTRIBUTES = PROPERTY__ATTRIBUTES;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FOLDING__NAME = PROPERTY__NAME;

  /**
   * The feature id for the '<em><b>Aggregator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FOLDING__AGGREGATOR = PROPERTY_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FOLDING__FROM = PROPERTY_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Property Folding</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FOLDING_FEATURE_COUNT = PROPERTY_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.QualifiedNameObjectImpl <em>Qualified Name Object</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.QualifiedNameObjectImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getQualifiedNameObject()
   * @generated
   */
  int QUALIFIED_NAME_OBJECT = 31;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_OBJECT__NAME = 0;

  /**
   * The number of structural features of the '<em>Qualified Name Object</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int QUALIFIED_NAME_OBJECT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.CollectionTypeImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getCollectionType()
   * @generated
   */
  int COLLECTION_TYPE = 32;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TYPE__ELEMENT_TYPE = 0;

  /**
   * The feature id for the '<em><b>Map</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TYPE__MAP = 1;

  /**
   * The number of structural features of the '<em>Collection Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLLECTION_TYPE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.LiteralImpl <em>Literal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.LiteralImpl
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getLiteral()
   * @generated
   */
  int LITERAL = 33;

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
   * The number of structural features of the '<em>Literal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LITERAL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.BasicType <em>Basic Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.BasicType
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getBasicType()
   * @generated
   */
  int BASIC_TYPE = 34;


  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Script</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Script
   * @generated
   */
  EClass getScript();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Script#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>List</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Script#getList()
   * @see #getScript()
   * @generated
   */
  EReference getScript_List();

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
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition#getDescription()
   * @see #getModelDefinition()
   * @generated
   */
  EAttribute getModelDefinition_Description();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition#getAttributes()
   * @see #getModelDefinition()
   * @generated
   */
  EReference getModelDefinition_Attributes();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition#getType()
   * @see #getModelDefinition()
   * @generated
   */
  EAttribute getModelDefinition_Type();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition#getName()
   * @see #getModelDefinition()
   * @generated
   */
  EAttribute getModelDefinition_Name();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition#getRhs <em>Rhs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Rhs</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition#getRhs()
   * @see #getModelDefinition()
   * @generated
   */
  EReference getModelDefinition_Rhs();

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
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm#getReference()
   * @see #getRecordTerm()
   * @generated
   */
  EReference getRecordTerm_Reference();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference <em>Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Reference</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference
   * @generated
   */
  EClass getModelReference();

  /**
   * Returns the meta object for the reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference#getName()
   * @see #getModelReference()
   * @generated
   */
  EReference getModelReference_Name();

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
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition#getType()
   * @see #getPropertyDefinition()
   * @generated
   */
  EReference getPropertyDefinition_Type();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition#getExpression()
   * @see #getPropertyDefinition()
   * @generated
   */
  EReference getPropertyDefinition_Expression();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpression <em>Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Expression</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpression
   * @generated
   */
  EClass getPropertyExpression();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpression#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpression#getExpression()
   * @see #getPropertyExpression()
   * @generated
   */
  EReference getPropertyExpression_Expression();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionList <em>Property Expression List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Expression List</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionList
   * @generated
   */
  EClass getPropertyExpressionList();

  /**
   * Returns the meta object for the reference list '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionList#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Elements</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionList#getElements()
   * @see #getPropertyExpressionList()
   * @generated
   */
  EReference getPropertyExpressionList_Elements();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionMap <em>Property Expression Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Expression Map</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionMap
   * @generated
   */
  EClass getPropertyExpressionMap();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionMap#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionMap#getElements()
   * @see #getPropertyExpressionMap()
   * @generated
   */
  EReference getPropertyExpressionMap_Elements();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionMapEntry <em>Property Expression Map Entry</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Expression Map Entry</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionMapEntry
   * @generated
   */
  EClass getPropertyExpressionMapEntry();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionMapEntry#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionMapEntry#getName()
   * @see #getPropertyExpressionMapEntry()
   * @generated
   */
  EReference getPropertyExpressionMapEntry_Name();

  /**
   * Returns the meta object for the reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionMapEntry#getProperty <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Property</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionMapEntry#getProperty()
   * @see #getPropertyExpressionMapEntry()
   * @generated
   */
  EReference getPropertyExpressionMapEntry_Property();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionRefernce <em>Property Expression Refernce</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Expression Refernce</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionRefernce
   * @generated
   */
  EClass getPropertyExpressionRefernce();

  /**
   * Returns the meta object for the reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionRefernce#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Name</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionRefernce#getName()
   * @see #getPropertyExpressionRefernce()
   * @generated
   */
  EReference getPropertyExpressionRefernce_Name();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Type#getBasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Basic Type</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Type#getBasicType()
   * @see #getType()
   * @generated
   */
  EAttribute getType_BasicType();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Type#getCollectionType <em>Collection Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Collection Type</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Type#getCollectionType()
   * @see #getType()
   * @generated
   */
  EReference getType_CollectionType();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.JoinExpression <em>Join Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Expression</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.JoinExpression
   * @generated
   */
  EClass getJoinExpression();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.dmdl_editor.dmdl.JoinExpression#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Terms</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.JoinExpression#getTerms()
   * @see #getJoinExpression()
   * @generated
   */
  EReference getJoinExpression_Terms();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm <em>Join Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Join Term</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm
   * @generated
   */
  EClass getJoinTerm();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm#getReference()
   * @see #getJoinTerm()
   * @generated
   */
  EReference getJoinTerm_Reference();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm#getMapping <em>Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Mapping</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm#getMapping()
   * @see #getJoinTerm()
   * @generated
   */
  EReference getJoinTerm_Mapping();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm#getGrouping <em>Grouping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Grouping</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm#getGrouping()
   * @see #getJoinTerm()
   * @generated
   */
  EReference getJoinTerm_Grouping();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeExpression <em>Summarize Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Summarize Expression</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeExpression
   * @generated
   */
  EClass getSummarizeExpression();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeExpression#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Terms</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeExpression#getTerms()
   * @see #getSummarizeExpression()
   * @generated
   */
  EReference getSummarizeExpression_Terms();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm <em>Summarize Term</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Summarize Term</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm
   * @generated
   */
  EClass getSummarizeTerm();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Reference</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm#getReference()
   * @see #getSummarizeTerm()
   * @generated
   */
  EReference getSummarizeTerm_Reference();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm#getFolding <em>Folding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Folding</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm#getFolding()
   * @see #getSummarizeTerm()
   * @generated
   */
  EReference getSummarizeTerm_Folding();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm#getGrouping <em>Grouping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Grouping</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm#getGrouping()
   * @see #getSummarizeTerm()
   * @generated
   */
  EReference getSummarizeTerm_Grouping();

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
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Attribute#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Attribute#getName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_Name();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Attribute#getElementBlock <em>Element Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Block</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Attribute#getElementBlock()
   * @see #getAttribute()
   * @generated
   */
  EReference getAttribute_ElementBlock();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementBlock <em>Attribute Element Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Element Block</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementBlock
   * @generated
   */
  EClass getAttributeElementBlock();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementBlock#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Elements</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementBlock#getElements()
   * @see #getAttributeElementBlock()
   * @generated
   */
  EReference getAttributeElementBlock_Elements();

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
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValueMap <em>Attribute Value Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Value Map</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValueMap
   * @generated
   */
  EClass getAttributeValueMap();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValueMap#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValueMap#getElements()
   * @see #getAttributeValueMap()
   * @generated
   */
  EReference getAttributeValueMap_Elements();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributePair <em>Attribute Pair</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute Pair</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributePair
   * @generated
   */
  EClass getAttributePair();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributePair#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Name</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributePair#getName()
   * @see #getAttributePair()
   * @generated
   */
  EReference getAttributePair_Name();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributePair#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Value</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributePair#getValue()
   * @see #getAttributePair()
   * @generated
   */
  EReference getAttributePair_Value();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Grouping <em>Grouping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Grouping</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Grouping
   * @generated
   */
  EClass getGrouping();

  /**
   * Returns the meta object for the reference list '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Grouping#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Name</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Grouping#getName()
   * @see #getGrouping()
   * @generated
   */
  EReference getGrouping_Name();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelMapping <em>Model Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Mapping</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.ModelMapping
   * @generated
   */
  EClass getModelMapping();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelMapping#getMappings <em>Mappings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Mappings</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.ModelMapping#getMappings()
   * @see #getModelMapping()
   * @generated
   */
  EReference getModelMapping_Mappings();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping <em>Property Mapping</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Mapping</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping
   * @generated
   */
  EClass getPropertyMapping();

  /**
   * Returns the meta object for the reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping#getFrom()
   * @see #getPropertyMapping()
   * @generated
   */
  EReference getPropertyMapping_From();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelFolding <em>Model Folding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model Folding</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.ModelFolding
   * @generated
   */
  EClass getModelFolding();

  /**
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelFolding#getFoldings <em>Foldings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Foldings</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.ModelFolding#getFoldings()
   * @see #getModelFolding()
   * @generated
   */
  EReference getModelFolding_Foldings();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding <em>Property Folding</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property Folding</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding
   * @generated
   */
  EClass getPropertyFolding();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getAggregator <em>Aggregator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Aggregator</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getAggregator()
   * @see #getPropertyFolding()
   * @generated
   */
  EAttribute getPropertyFolding_Aggregator();

  /**
   * Returns the meta object for the reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getFrom <em>From</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>From</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getFrom()
   * @see #getPropertyFolding()
   * @generated
   */
  EReference getPropertyFolding_From();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Property#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Property#getDescription()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Description();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Property#getAttributes <em>Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Attributes</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Property#getAttributes()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Attributes();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.QualifiedNameObject <em>Qualified Name Object</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Qualified Name Object</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.QualifiedNameObject
   * @generated
   */
  EClass getQualifiedNameObject();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.QualifiedNameObject#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.QualifiedNameObject#getName()
   * @see #getQualifiedNameObject()
   * @generated
   */
  EAttribute getQualifiedNameObject_Name();

  /**
   * Returns the meta object for class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.CollectionType <em>Collection Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Collection Type</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.CollectionType
   * @generated
   */
  EClass getCollectionType();

  /**
   * Returns the meta object for the containment reference '{@link jp.hishidama.xtext.dmdl_editor.dmdl.CollectionType#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Element Type</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.CollectionType#getElementType()
   * @see #getCollectionType()
   * @generated
   */
  EReference getCollectionType_ElementType();

  /**
   * Returns the meta object for the attribute '{@link jp.hishidama.xtext.dmdl_editor.dmdl.CollectionType#isMap <em>Map</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Map</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.CollectionType#isMap()
   * @see #getCollectionType()
   * @generated
   */
  EAttribute getCollectionType_Map();

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
   * Returns the meta object for enum '{@link jp.hishidama.xtext.dmdl_editor.dmdl.BasicType <em>Basic Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Basic Type</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.BasicType
   * @generated
   */
  EEnum getBasicType();

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
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.ScriptImpl <em>Script</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.ScriptImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getScript()
     * @generated
     */
    EClass SCRIPT = eINSTANCE.getScript();

    /**
     * The meta object literal for the '<em><b>List</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCRIPT__LIST = eINSTANCE.getScript_List();

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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_DEFINITION__DESCRIPTION = eINSTANCE.getModelDefinition_Description();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_DEFINITION__ATTRIBUTES = eINSTANCE.getModelDefinition_Attributes();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_DEFINITION__TYPE = eINSTANCE.getModelDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_DEFINITION__NAME = eINSTANCE.getModelDefinition_Name();

    /**
     * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_DEFINITION__RHS = eINSTANCE.getModelDefinition_Rhs();

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
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_TERM__REFERENCE = eINSTANCE.getRecordTerm_Reference();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelReferenceImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getModelReference()
     * @generated
     */
    EClass MODEL_REFERENCE = eINSTANCE.getModelReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_REFERENCE__NAME = eINSTANCE.getModelReference_Name();

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
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DEFINITION__TYPE = eINSTANCE.getPropertyDefinition_Type();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_DEFINITION__EXPRESSION = eINSTANCE.getPropertyDefinition_Expression();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionImpl <em>Property Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getPropertyExpression()
     * @generated
     */
    EClass PROPERTY_EXPRESSION = eINSTANCE.getPropertyExpression();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_EXPRESSION__EXPRESSION = eINSTANCE.getPropertyExpression_Expression();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionListImpl <em>Property Expression List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionListImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getPropertyExpressionList()
     * @generated
     */
    EClass PROPERTY_EXPRESSION_LIST = eINSTANCE.getPropertyExpressionList();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_EXPRESSION_LIST__ELEMENTS = eINSTANCE.getPropertyExpressionList_Elements();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionMapImpl <em>Property Expression Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionMapImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getPropertyExpressionMap()
     * @generated
     */
    EClass PROPERTY_EXPRESSION_MAP = eINSTANCE.getPropertyExpressionMap();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_EXPRESSION_MAP__ELEMENTS = eINSTANCE.getPropertyExpressionMap_Elements();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionMapEntryImpl <em>Property Expression Map Entry</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionMapEntryImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getPropertyExpressionMapEntry()
     * @generated
     */
    EClass PROPERTY_EXPRESSION_MAP_ENTRY = eINSTANCE.getPropertyExpressionMapEntry();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_EXPRESSION_MAP_ENTRY__NAME = eINSTANCE.getPropertyExpressionMapEntry_Name();

    /**
     * The meta object literal for the '<em><b>Property</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_EXPRESSION_MAP_ENTRY__PROPERTY = eINSTANCE.getPropertyExpressionMapEntry_Property();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionRefernceImpl <em>Property Expression Refernce</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyExpressionRefernceImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getPropertyExpressionRefernce()
     * @generated
     */
    EClass PROPERTY_EXPRESSION_REFERNCE = eINSTANCE.getPropertyExpressionRefernce();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_EXPRESSION_REFERNCE__NAME = eINSTANCE.getPropertyExpressionRefernce_Name();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.TypeImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Basic Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__BASIC_TYPE = eINSTANCE.getType_BasicType();

    /**
     * The meta object literal for the '<em><b>Collection Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__COLLECTION_TYPE = eINSTANCE.getType_CollectionType();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.JoinExpressionImpl <em>Join Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.JoinExpressionImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getJoinExpression()
     * @generated
     */
    EClass JOIN_EXPRESSION = eINSTANCE.getJoinExpression();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_EXPRESSION__TERMS = eINSTANCE.getJoinExpression_Terms();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.JoinTermImpl <em>Join Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.JoinTermImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getJoinTerm()
     * @generated
     */
    EClass JOIN_TERM = eINSTANCE.getJoinTerm();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_TERM__REFERENCE = eINSTANCE.getJoinTerm_Reference();

    /**
     * The meta object literal for the '<em><b>Mapping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_TERM__MAPPING = eINSTANCE.getJoinTerm_Mapping();

    /**
     * The meta object literal for the '<em><b>Grouping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference JOIN_TERM__GROUPING = eINSTANCE.getJoinTerm_Grouping();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.SummarizeExpressionImpl <em>Summarize Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.SummarizeExpressionImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getSummarizeExpression()
     * @generated
     */
    EClass SUMMARIZE_EXPRESSION = eINSTANCE.getSummarizeExpression();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUMMARIZE_EXPRESSION__TERMS = eINSTANCE.getSummarizeExpression_Terms();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.SummarizeTermImpl <em>Summarize Term</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.SummarizeTermImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getSummarizeTerm()
     * @generated
     */
    EClass SUMMARIZE_TERM = eINSTANCE.getSummarizeTerm();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUMMARIZE_TERM__REFERENCE = eINSTANCE.getSummarizeTerm_Reference();

    /**
     * The meta object literal for the '<em><b>Folding</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUMMARIZE_TERM__FOLDING = eINSTANCE.getSummarizeTerm_Folding();

    /**
     * The meta object literal for the '<em><b>Grouping</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SUMMARIZE_TERM__GROUPING = eINSTANCE.getSummarizeTerm_Grouping();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

    /**
     * The meta object literal for the '<em><b>Element Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE__ELEMENT_BLOCK = eINSTANCE.getAttribute_ElementBlock();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeElementBlockImpl <em>Attribute Element Block</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeElementBlockImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributeElementBlock()
     * @generated
     */
    EClass ATTRIBUTE_ELEMENT_BLOCK = eINSTANCE.getAttributeElementBlock();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_ELEMENT_BLOCK__ELEMENTS = eINSTANCE.getAttributeElementBlock_Elements();

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
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeValueMapImpl <em>Attribute Value Map</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributeValueMapImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributeValueMap()
     * @generated
     */
    EClass ATTRIBUTE_VALUE_MAP = eINSTANCE.getAttributeValueMap();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_VALUE_MAP__ELEMENTS = eINSTANCE.getAttributeValueMap_Elements();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributePairImpl <em>Attribute Pair</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.AttributePairImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getAttributePair()
     * @generated
     */
    EClass ATTRIBUTE_PAIR = eINSTANCE.getAttributePair();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_PAIR__NAME = eINSTANCE.getAttributePair_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_PAIR__VALUE = eINSTANCE.getAttributePair_Value();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.GroupingImpl <em>Grouping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.GroupingImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getGrouping()
     * @generated
     */
    EClass GROUPING = eINSTANCE.getGrouping();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GROUPING__NAME = eINSTANCE.getGrouping_Name();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelMappingImpl <em>Model Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelMappingImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getModelMapping()
     * @generated
     */
    EClass MODEL_MAPPING = eINSTANCE.getModelMapping();

    /**
     * The meta object literal for the '<em><b>Mappings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_MAPPING__MAPPINGS = eINSTANCE.getModelMapping_Mappings();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyMappingImpl <em>Property Mapping</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyMappingImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getPropertyMapping()
     * @generated
     */
    EClass PROPERTY_MAPPING = eINSTANCE.getPropertyMapping();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_MAPPING__FROM = eINSTANCE.getPropertyMapping_From();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelFoldingImpl <em>Model Folding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.ModelFoldingImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getModelFolding()
     * @generated
     */
    EClass MODEL_FOLDING = eINSTANCE.getModelFolding();

    /**
     * The meta object literal for the '<em><b>Foldings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL_FOLDING__FOLDINGS = eINSTANCE.getModelFolding_Foldings();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyFoldingImpl <em>Property Folding</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyFoldingImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getPropertyFolding()
     * @generated
     */
    EClass PROPERTY_FOLDING = eINSTANCE.getPropertyFolding();

    /**
     * The meta object literal for the '<em><b>Aggregator</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY_FOLDING__AGGREGATOR = eINSTANCE.getPropertyFolding_Aggregator();

    /**
     * The meta object literal for the '<em><b>From</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY_FOLDING__FROM = eINSTANCE.getPropertyFolding_From();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.PropertyImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__DESCRIPTION = eINSTANCE.getProperty_Description();

    /**
     * The meta object literal for the '<em><b>Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__ATTRIBUTES = eINSTANCE.getProperty_Attributes();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.QualifiedNameObjectImpl <em>Qualified Name Object</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.QualifiedNameObjectImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getQualifiedNameObject()
     * @generated
     */
    EClass QUALIFIED_NAME_OBJECT = eINSTANCE.getQualifiedNameObject();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute QUALIFIED_NAME_OBJECT__NAME = eINSTANCE.getQualifiedNameObject_Name();

    /**
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.impl.CollectionTypeImpl <em>Collection Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.CollectionTypeImpl
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getCollectionType()
     * @generated
     */
    EClass COLLECTION_TYPE = eINSTANCE.getCollectionType();

    /**
     * The meta object literal for the '<em><b>Element Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COLLECTION_TYPE__ELEMENT_TYPE = eINSTANCE.getCollectionType_ElementType();

    /**
     * The meta object literal for the '<em><b>Map</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLLECTION_TYPE__MAP = eINSTANCE.getCollectionType_Map();

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
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.BasicType <em>Basic Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.BasicType
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getBasicType()
     * @generated
     */
    EEnum BASIC_TYPE = eINSTANCE.getBasicType();

  }

} //DmdlPackage
