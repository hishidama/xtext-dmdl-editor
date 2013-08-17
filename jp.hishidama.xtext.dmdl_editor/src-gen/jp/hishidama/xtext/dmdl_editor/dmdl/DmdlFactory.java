/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage
 * @generated
 */
public interface DmdlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DmdlFactory eINSTANCE = jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Models</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Models</em>'.
   * @generated
   */
  Models createModels();

  /**
   * Returns a new object of class '<em>Model Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Definition</em>'.
   * @generated
   */
  ModelDefinition createModelDefinition();

  /**
   * Returns a new object of class '<em>Record Model Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Record Model Definition</em>'.
   * @generated
   */
  RecordModelDefinition createRecordModelDefinition();

  /**
   * Returns a new object of class '<em>Record Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Record Expression</em>'.
   * @generated
   */
  RecordExpression createRecordExpression();

  /**
   * Returns a new object of class '<em>Record Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Record Term</em>'.
   * @generated
   */
  RecordTerm createRecordTerm();

  /**
   * Returns a new object of class '<em>Property Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Definition</em>'.
   * @generated
   */
  PropertyDefinition createPropertyDefinition();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DmdlPackage getDmdlPackage();

} //DmdlFactory
