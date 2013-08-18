/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Projective Model Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.ProjectiveModelDefinition#getName <em>Name</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.ProjectiveModelDefinition#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getProjectiveModelDefinition()
 * @model
 * @generated
 */
public interface ProjectiveModelDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getProjectiveModelDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ProjectiveModelDefinition#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Rhs</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rhs</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rhs</em>' containment reference.
   * @see #setRhs(RecordExpression)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getProjectiveModelDefinition_Rhs()
   * @model containment="true"
   * @generated
   */
  RecordExpression getRhs();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ProjectiveModelDefinition#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(RecordExpression value);

} // ProjectiveModelDefinition