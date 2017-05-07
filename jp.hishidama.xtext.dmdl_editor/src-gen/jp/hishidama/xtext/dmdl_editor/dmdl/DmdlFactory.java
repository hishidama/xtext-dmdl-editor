/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage
 * @generated
 */
public interface DmdlFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DmdlFactory eINSTANCE = jp.hishidama.xtext.dmdl_editor.dmdl.impl.DmdlFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Script</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Script</em>'.
   * @generated
   */
  Script createScript();

  /**
   * Returns a new object of class '<em>Model Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Definition</em>'.
   * @generated
   */
  ModelDefinition createModelDefinition();

  /**
   * Returns a new object of class '<em>Record Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Record Expression</em>'.
   * @generated
   */
  RecordExpression createRecordExpression();

  /**
   * Returns a new object of class '<em>Record Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Record Term</em>'.
   * @generated
   */
  RecordTerm createRecordTerm();

  /**
   * Returns a new object of class '<em>Model Reference</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Reference</em>'.
   * @generated
   */
  ModelReference createModelReference();

  /**
   * Returns a new object of class '<em>Property Definition</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Definition</em>'.
   * @generated
   */
  PropertyDefinition createPropertyDefinition();

  /**
   * Returns a new object of class '<em>Join Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Join Expression</em>'.
   * @generated
   */
  JoinExpression createJoinExpression();

  /**
   * Returns a new object of class '<em>Join Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Join Term</em>'.
   * @generated
   */
  JoinTerm createJoinTerm();

  /**
   * Returns a new object of class '<em>Summarize Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Summarize Expression</em>'.
   * @generated
   */
  SummarizeExpression createSummarizeExpression();

  /**
   * Returns a new object of class '<em>Summarize Term</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Summarize Term</em>'.
   * @generated
   */
  SummarizeTerm createSummarizeTerm();

  /**
   * Returns a new object of class '<em>Attribute List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute List</em>'.
   * @generated
   */
  AttributeList createAttributeList();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Attribute Element Block</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Element Block</em>'.
   * @generated
   */
  AttributeElementBlock createAttributeElementBlock();

  /**
   * Returns a new object of class '<em>Attribute Element List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Element List</em>'.
   * @generated
   */
  AttributeElementList createAttributeElementList();

  /**
   * Returns a new object of class '<em>Attribute Element</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Element</em>'.
   * @generated
   */
  AttributeElement createAttributeElement();

  /**
   * Returns a new object of class '<em>Attribute Value</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Value</em>'.
   * @generated
   */
  AttributeValue createAttributeValue();

  /**
   * Returns a new object of class '<em>Attribute Value Array</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Value Array</em>'.
   * @generated
   */
  AttributeValueArray createAttributeValueArray();

  /**
   * Returns a new object of class '<em>Attribute Value Map</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Value Map</em>'.
   * @generated
   */
  AttributeValueMap createAttributeValueMap();

  /**
   * Returns a new object of class '<em>Attribute Pair</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute Pair</em>'.
   * @generated
   */
  AttributePair createAttributePair();

  /**
   * Returns a new object of class '<em>Grouping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Grouping</em>'.
   * @generated
   */
  Grouping createGrouping();

  /**
   * Returns a new object of class '<em>Model Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Mapping</em>'.
   * @generated
   */
  ModelMapping createModelMapping();

  /**
   * Returns a new object of class '<em>Property Mapping</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Mapping</em>'.
   * @generated
   */
  PropertyMapping createPropertyMapping();

  /**
   * Returns a new object of class '<em>Model Folding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model Folding</em>'.
   * @generated
   */
  ModelFolding createModelFolding();

  /**
   * Returns a new object of class '<em>Property Folding</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property Folding</em>'.
   * @generated
   */
  PropertyFolding createPropertyFolding();

  /**
   * Returns a new object of class '<em>Property</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Property</em>'.
   * @generated
   */
  Property createProperty();

  /**
   * Returns a new object of class '<em>Qualified Name Object</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Qualified Name Object</em>'.
   * @generated
   */
  QualifiedNameObject createQualifiedNameObject();

  /**
   * Returns a new object of class '<em>Literal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Literal</em>'.
   * @generated
   */
  Literal createLiteral();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DmdlPackage getDmdlPackage();

} //DmdlFactory
