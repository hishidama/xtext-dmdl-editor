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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_MODEL_DEFINITION__NAME = MODEL_DEFINITION_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_MODEL_DEFINITION__RHS = MODEL_DEFINITION_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Record Model Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_MODEL_DEFINITION_FEATURE_COUNT = MODEL_DEFINITION_FEATURE_COUNT + 2;

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
   * The feature id for the '<em><b>Block</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RECORD_EXPRESSION__BLOCK = 0;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__NAME = 0;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION__TYPE = 1;

  /**
   * The number of structural features of the '<em>Property Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_DEFINITION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Type <em>Type</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Type
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getType()
   * @generated
   */
  int TYPE = 6;


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
   * Returns the meta object for the containment reference list '{@link jp.hishidama.xtext.dmdl_editor.dmdl.RecordExpression#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Block</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.RecordExpression#getBlock()
   * @see #getRecordExpression()
   * @generated
   */
  EReference getRecordExpression_Block();

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
   * Returns the meta object for enum '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Type</em>'.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Type
   * @generated
   */
  EEnum getType();

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
     * The meta object literal for the '<em><b>Block</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RECORD_EXPRESSION__BLOCK = eINSTANCE.getRecordExpression_Block();

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
     * The meta object literal for the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Type <em>Type</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.Type
     * @see jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlPackageImpl#getType()
     * @generated
     */
    EEnum TYPE = eINSTANCE.getType();

  }

} //DmdlPackage
