/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Summarize Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeExpression#getTerms <em>Terms</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getSummarizeExpression()
 * @model
 * @generated
 */
public interface SummarizeExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Terms</b></em>' containment reference list.
   * The list contents are of type {@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Terms</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Terms</em>' containment reference list.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getSummarizeExpression_Terms()
   * @model containment="true"
   * @generated
   */
  EList<SummarizeTerm> getTerms();

} // SummarizeExpression
