/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl.impl;

import jp.hishidama.xtext.dmdl_editor.dmdl.DmdlFactory;
import jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Models;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DmdlPackageImpl extends EPackageImpl implements DmdlPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelDefinitionEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DmdlPackageImpl()
  {
    super(eNS_URI, DmdlFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DmdlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DmdlPackage init()
  {
    if (isInited) return (DmdlPackage)EPackage.Registry.INSTANCE.getEPackage(DmdlPackage.eNS_URI);

    // Obtain or create and register package
    DmdlPackageImpl theDmdlPackage = (DmdlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DmdlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DmdlPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDmdlPackage.createPackageContents();

    // Initialize created meta-data
    theDmdlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDmdlPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DmdlPackage.eNS_URI, theDmdlPackage);
    return theDmdlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModels()
  {
    return modelsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModels_List()
  {
    return (EReference)modelsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelDefinition()
  {
    return modelDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelDefinition_Name()
  {
    return (EAttribute)modelDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DmdlFactory getDmdlFactory()
  {
    return (DmdlFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    modelsEClass = createEClass(MODELS);
    createEReference(modelsEClass, MODELS__LIST);

    modelDefinitionEClass = createEClass(MODEL_DEFINITION);
    createEAttribute(modelDefinitionEClass, MODEL_DEFINITION__NAME);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(modelsEClass, Models.class, "Models", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModels_List(), this.getModelDefinition(), null, "list", null, 0, -1, Models.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelDefinitionEClass, ModelDefinition.class, "ModelDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DmdlPackageImpl
