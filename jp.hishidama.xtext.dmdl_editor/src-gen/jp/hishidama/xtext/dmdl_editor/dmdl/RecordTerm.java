/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Record Term</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm#getProperties <em>Properties</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm#getReference <em>Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getRecordTerm()
 * @model
 * @generated
 */
public interface RecordTerm extends EObject
{
  /**
   * Returns the value of the '<em><b>Properties</b></em>' containment reference list.
   * The list contents are of type {@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Properties</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Properties</em>' containment reference list.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getRecordTerm_Properties()
   * @model containment="true"
   * @generated
   */
  EList<PropertyDefinition> getProperties();

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
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getRecordTerm_Reference()
   * @model containment="true"
   * @generated
   */
  ModelReference getReference();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm#getReference <em>Reference</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' containment reference.
   * @see #getReference()
   * @generated
   */
  void setReference(ModelReference value);

} // RecordTerm
