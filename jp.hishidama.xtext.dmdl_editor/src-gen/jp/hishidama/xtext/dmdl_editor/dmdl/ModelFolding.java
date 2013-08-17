/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Folding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelFolding#getFoldings <em>Foldings</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getModelFolding()
 * @model
 * @generated
 */
public interface ModelFolding extends EObject
{
  /**
   * Returns the value of the '<em><b>Foldings</b></em>' containment reference list.
   * The list contents are of type {@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Foldings</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Foldings</em>' containment reference list.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getModelFolding_Foldings()
   * @model containment="true"
   * @generated
   */
  EList<PropertyFolding> getFoldings();

} // ModelFolding
