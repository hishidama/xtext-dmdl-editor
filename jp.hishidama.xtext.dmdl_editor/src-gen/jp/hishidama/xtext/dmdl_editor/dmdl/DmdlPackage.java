/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_DEFINITION__NAME = 0;

  /**
   * The number of structural features of the '<em>Model Definition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_DEFINITION_FEATURE_COUNT = 1;


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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MODEL_DEFINITION__NAME = eINSTANCE.getModelDefinition_Name();

  }

} //DmdlPackage
