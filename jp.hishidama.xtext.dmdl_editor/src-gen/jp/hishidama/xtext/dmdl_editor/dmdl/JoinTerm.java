/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm#getReference <em>Reference</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm#getMapping <em>Mapping</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm#getGrouping <em>Grouping</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getJoinTerm()
 * @model
 * @generated
 */
public interface JoinTerm extends EObject
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
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getJoinTerm_Reference()
   * @model containment="true"
   * @generated
   */
  ModelReference getReference();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm#getReference <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' containment reference.
   * @see #getReference()
   * @generated
   */
  void setReference(ModelReference value);

  /**
   * Returns the value of the '<em><b>Mapping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Mapping</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Mapping</em>' containment reference.
   * @see #setMapping(ModelMapping)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getJoinTerm_Mapping()
   * @model containment="true"
   * @generated
   */
  ModelMapping getMapping();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm#getMapping <em>Mapping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Mapping</em>' containment reference.
   * @see #getMapping()
   * @generated
   */
  void setMapping(ModelMapping value);

  /**
   * Returns the value of the '<em><b>Grouping</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Grouping</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Grouping</em>' containment reference.
   * @see #setGrouping(Grouping)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getJoinTerm_Grouping()
   * @model containment="true"
   * @generated
   */
  Grouping getGrouping();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm#getGrouping <em>Grouping</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Grouping</em>' containment reference.
   * @see #getGrouping()
   * @generated
   */
  void setGrouping(Grouping value);

} // JoinTerm
