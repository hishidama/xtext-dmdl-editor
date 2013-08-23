/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Folding</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getAggregator <em>Aggregator</em>}</li>
 *   <li>{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyFolding()
 * @model
 * @generated
 */
public interface PropertyFolding extends Property
{
  /**
   * Returns the value of the '<em><b>Aggregator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aggregator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aggregator</em>' attribute.
   * @see #setAggregator(String)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyFolding_Aggregator()
   * @model
   * @generated
   */
  String getAggregator();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getAggregator <em>Aggregator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aggregator</em>' attribute.
   * @see #getAggregator()
   * @generated
   */
  void setAggregator(String value);

  /**
   * Returns the value of the '<em><b>From</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>From</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>From</em>' reference.
   * @see #setFrom(Property)
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#getPropertyFolding_From()
   * @model
   * @generated
   */
  Property getFrom();

  /**
   * Sets the value of the '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding#getFrom <em>From</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>From</em>' reference.
   * @see #getFrom()
   * @generated
   */
  void setFrom(Property value);

} // PropertyFolding
