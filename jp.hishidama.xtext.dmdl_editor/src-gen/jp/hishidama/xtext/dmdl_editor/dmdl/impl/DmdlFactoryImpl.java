/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl.impl;

import jp.hishidama.xtext.dmdl_editor.dmdl.*;

import org.eclipse.emf.ecore.EClass;
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
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
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
