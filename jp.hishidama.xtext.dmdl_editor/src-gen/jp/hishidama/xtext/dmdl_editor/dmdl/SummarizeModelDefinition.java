/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Summarize Model Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeModelDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeModelDefinition#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeModelDefinition#getName <em>Name</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeModelDefinition#getRhs <em>Rhs</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getSummarizeModelDefinition()
 * @model
 * @generated
 */
public interface SummarizeModelDefinition extends EObject
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getSummarizeModelDefinition_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeModelDefinition#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Attributes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Attributes</em>' containment reference.
   * @see #setAttributes(AttributeList)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getSummarizeModelDefinition_Attributes()
   * @model containment="true"
   * @generated
   */
  AttributeList getAttributes();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeModelDefinition#getAttributes <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributes</em>' containment reference.
   * @see #getAttributes()
   * @generated
   */
  void setAttributes(AttributeList value);

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
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getSummarizeModelDefinition_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeModelDefinition#getName <em>Name</em>}' attribute.
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
   * @see #setRhs(SummarizeExpression)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getSummarizeModelDefinition_Rhs()
   * @model containment="true"
   * @generated
   */
  SummarizeExpression getRhs();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeModelDefinition#getRhs <em>Rhs</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rhs</em>' containment reference.
   * @see #getRhs()
   * @generated
   */
  void setRhs(SummarizeExpression value);

} // SummarizeModelDefinition
