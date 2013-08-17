/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition#getDescription <em>Description</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition#getModel <em>Model</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getModelDefinition()
 * @model
 * @generated
 */
public interface ModelDefinition extends EObject
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
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getModelDefinition_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition#getDescription <em>Description</em>}' attribute.
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
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getModelDefinition_Attributes()
   * @model containment="true"
   * @generated
   */
  AttributeList getAttributes();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition#getAttributes <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributes</em>' containment reference.
   * @see #getAttributes()
   * @generated
   */
  void setAttributes(AttributeList value);

  /**
   * Returns the value of the '<em><b>Model</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model</em>' containment reference.
   * @see #setModel(EObject)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getModelDefinition_Model()
   * @model containment="true"
   * @generated
   */
  EObject getModel();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition#getModel <em>Model</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model</em>' containment reference.
   * @see #getModel()
   * @generated
   */
  void setModel(EObject value);

} // ModelDefinition
