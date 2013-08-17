/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Folding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getDescription <em>Description</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getAggregator <em>Aggregator</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getFrom <em>From</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyFolding()
 * @model
 * @generated
 */
public interface PropertyFolding extends EObject
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
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyFolding_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getDescription <em>Description</em>}' attribute.
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
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyFolding_Attributes()
   * @model containment="true"
   * @generated
   */
  AttributeList getAttributes();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getAttributes <em>Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Attributes</em>' containment reference.
   * @see #getAttributes()
   * @generated
   */
  void setAttributes(AttributeList value);

  /**
   * Returns the value of the '<em><b>Aggregator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregator</em>' containment reference.
   * @see #setAggregator(QualifiedName)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyFolding_Aggregator()
   * @model containment="true"
   * @generated
   */
  QualifiedName getAggregator();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getAggregator <em>Aggregator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregator</em>' containment reference.
   * @see #getAggregator()
   * @generated
   */
  void setAggregator(QualifiedName value);

  /**
   * Returns the value of the '<em><b>From</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' attribute.
   * @see #setFrom(String)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyFolding_From()
   * @model
   * @generated
   */
  String getFrom();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getFrom <em>From</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' attribute.
   * @see #getFrom()
   * @generated
   */
  void setFrom(String value);

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
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyFolding_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

} // PropertyFolding
