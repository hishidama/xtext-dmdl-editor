/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Summarize Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getSummarizeTerm()
 * @model
 * @generated
 */
public interface SummarizeTerm extends EObject
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' containment reference.
   * @see #setReference(ModelReference)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getSummarizeTerm_Reference()
   * @model containment="true"
   * @generated
   */
  ModelReference getReference();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm#getReference <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' containment reference.
   * @see #getReference()
   * @generated
   */
  void setReference(ModelReference value);

} // SummarizeTerm
