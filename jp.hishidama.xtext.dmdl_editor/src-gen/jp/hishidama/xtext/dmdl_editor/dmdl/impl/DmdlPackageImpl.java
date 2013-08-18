/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl.impl;

import jp.hishidama.xtext.dmdl_editor.dmdl.Attribute;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementList;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValue;
import jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValueArray;
import jp.hishidama.xtext.dmdl_editor.dmdl.DmdlFactory;
import jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage;
import jp.hishidama.xtext.dmdl_editor.dmdl.Grouping;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm;
import jp.hishidama.xtext.dmdl_editor.dmdl.JoinedModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.Literal;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelFolding;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelMapping;
import jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference;
import jp.hishidama.xtext.dmdl_editor.dmdl.ProjectiveModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding;
import jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping;
import jp.hishidama.xtext.dmdl_editor.dmdl.QualifiedNameObject;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm;
import jp.hishidama.xtext.dmdl_editor.dmdl.Script;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeExpression;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeModelDefinition;
import jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm;
import jp.hishidama.xtext.dmdl_editor.dmdl.Type;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DmdlPackageImpl extends EPackageImpl implements DmdlPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass scriptEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordModelDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass projectiveModelDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass recordTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelReferenceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass joinedModelDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass joinExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass joinTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass summarizeModelDefinitionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass summarizeExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass summarizeTermEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeElementListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeValueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeValueArrayEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass groupingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyMappingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass modelFoldingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyFoldingEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualifiedNameObjectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass literalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum typeEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum booleanEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DmdlPackageImpl()
  {
    super(eNS_URI, DmdlFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link DmdlPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DmdlPackage init()
  {
    if (isInited) return (DmdlPackage)EPackage.Registry.INSTANCE.getEPackage(DmdlPackage.eNS_URI);

    // Obtain or create and register package
    DmdlPackageImpl theDmdlPackage = (DmdlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DmdlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DmdlPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theDmdlPackage.createPackageContents();

    // Initialize created meta-data
    theDmdlPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDmdlPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DmdlPackage.eNS_URI, theDmdlPackage);
    return theDmdlPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScript()
  {
    return scriptEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScript_List()
  {
    return (EReference)scriptEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelDefinition()
  {
    return modelDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelDefinition_Description()
  {
    return (EAttribute)modelDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelDefinition_Attributes()
  {
    return (EReference)modelDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelDefinition_Model()
  {
    return (EReference)modelDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordModelDefinition()
  {
    return recordModelDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRecordModelDefinition_Name()
  {
    return (EAttribute)recordModelDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordModelDefinition_Rhs()
  {
    return (EReference)recordModelDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProjectiveModelDefinition()
  {
    return projectiveModelDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProjectiveModelDefinition_Name()
  {
    return (EAttribute)projectiveModelDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProjectiveModelDefinition_Rhs()
  {
    return (EReference)projectiveModelDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordExpression()
  {
    return recordExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordExpression_Terms()
  {
    return (EReference)recordExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRecordTerm()
  {
    return recordTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordTerm_Properties()
  {
    return (EReference)recordTermEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRecordTerm_Reference()
  {
    return (EReference)recordTermEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelReference()
  {
    return modelReferenceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getModelReference_Name()
  {
    return (EAttribute)modelReferenceEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyDefinition()
  {
    return propertyDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_Description()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyDefinition_Attributes()
  {
    return (EReference)propertyDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_Name()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyDefinition_Type()
  {
    return (EAttribute)propertyDefinitionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJoinedModelDefinition()
  {
    return joinedModelDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getJoinedModelDefinition_Name()
  {
    return (EAttribute)joinedModelDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinedModelDefinition_Rhs()
  {
    return (EReference)joinedModelDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJoinExpression()
  {
    return joinExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinExpression_Terms()
  {
    return (EReference)joinExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getJoinTerm()
  {
    return joinTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinTerm_Reference()
  {
    return (EReference)joinTermEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinTerm_Mapping()
  {
    return (EReference)joinTermEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getJoinTerm_Grouping()
  {
    return (EReference)joinTermEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSummarizeModelDefinition()
  {
    return summarizeModelDefinitionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSummarizeModelDefinition_Name()
  {
    return (EAttribute)summarizeModelDefinitionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSummarizeModelDefinition_Rhs()
  {
    return (EReference)summarizeModelDefinitionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSummarizeExpression()
  {
    return summarizeExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSummarizeExpression_Terms()
  {
    return (EReference)summarizeExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSummarizeTerm()
  {
    return summarizeTermEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSummarizeTerm_Reference()
  {
    return (EReference)summarizeTermEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSummarizeTerm_Folding()
  {
    return (EReference)summarizeTermEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSummarizeTerm_Grouping()
  {
    return (EReference)summarizeTermEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeList()
  {
    return attributeListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeList_Attributes()
  {
    return (EReference)attributeListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttribute_Name()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttribute_Elements()
  {
    return (EReference)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeElementList()
  {
    return attributeElementListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeElementList_Elements()
  {
    return (EReference)attributeElementListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeElement()
  {
    return attributeElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAttributeElement_Name()
  {
    return (EAttribute)attributeElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeElement_Value()
  {
    return (EReference)attributeElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeValue()
  {
    return attributeValueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeValue_Value()
  {
    return (EReference)attributeValueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAttributeValueArray()
  {
    return attributeValueArrayEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAttributeValueArray_Elements()
  {
    return (EReference)attributeValueArrayEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGrouping()
  {
    return groupingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGrouping_Name()
  {
    return (EAttribute)groupingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelMapping()
  {
    return modelMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelMapping_Mappings()
  {
    return (EReference)modelMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyMapping()
  {
    return propertyMappingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyMapping_Description()
  {
    return (EAttribute)propertyMappingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyMapping_Attributes()
  {
    return (EReference)propertyMappingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyMapping_From()
  {
    return (EAttribute)propertyMappingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyMapping_Name()
  {
    return (EAttribute)propertyMappingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getModelFolding()
  {
    return modelFoldingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getModelFolding_Foldings()
  {
    return (EReference)modelFoldingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyFolding()
  {
    return propertyFoldingEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyFolding_Description()
  {
    return (EAttribute)propertyFoldingEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyFolding_Attributes()
  {
    return (EReference)propertyFoldingEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyFolding_Aggregator()
  {
    return (EAttribute)propertyFoldingEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyFolding_From()
  {
    return (EAttribute)propertyFoldingEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyFolding_Name()
  {
    return (EAttribute)propertyFoldingEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualifiedNameObject()
  {
    return qualifiedNameObjectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getQualifiedNameObject_Name()
  {
    return (EAttribute)qualifiedNameObjectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLiteral()
  {
    return literalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_StringValue()
  {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_IntValue()
  {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_DecimalValue()
  {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLiteral_BooleanValue()
  {
    return (EAttribute)literalEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getType()
  {
    return typeEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getBOOLEAN()
  {
    return booleanEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DmdlFactory getDmdlFactory()
  {
    return (DmdlFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    scriptEClass = createEClass(SCRIPT);
    createEReference(scriptEClass, SCRIPT__LIST);

    modelDefinitionEClass = createEClass(MODEL_DEFINITION);
    createEAttribute(modelDefinitionEClass, MODEL_DEFINITION__DESCRIPTION);
    createEReference(modelDefinitionEClass, MODEL_DEFINITION__ATTRIBUTES);
    createEReference(modelDefinitionEClass, MODEL_DEFINITION__MODEL);

    recordModelDefinitionEClass = createEClass(RECORD_MODEL_DEFINITION);
    createEAttribute(recordModelDefinitionEClass, RECORD_MODEL_DEFINITION__NAME);
    createEReference(recordModelDefinitionEClass, RECORD_MODEL_DEFINITION__RHS);

    projectiveModelDefinitionEClass = createEClass(PROJECTIVE_MODEL_DEFINITION);
    createEAttribute(projectiveModelDefinitionEClass, PROJECTIVE_MODEL_DEFINITION__NAME);
    createEReference(projectiveModelDefinitionEClass, PROJECTIVE_MODEL_DEFINITION__RHS);

    recordExpressionEClass = createEClass(RECORD_EXPRESSION);
    createEReference(recordExpressionEClass, RECORD_EXPRESSION__TERMS);

    recordTermEClass = createEClass(RECORD_TERM);
    createEReference(recordTermEClass, RECORD_TERM__PROPERTIES);
    createEReference(recordTermEClass, RECORD_TERM__REFERENCE);

    modelReferenceEClass = createEClass(MODEL_REFERENCE);
    createEAttribute(modelReferenceEClass, MODEL_REFERENCE__NAME);

    propertyDefinitionEClass = createEClass(PROPERTY_DEFINITION);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__DESCRIPTION);
    createEReference(propertyDefinitionEClass, PROPERTY_DEFINITION__ATTRIBUTES);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__NAME);
    createEAttribute(propertyDefinitionEClass, PROPERTY_DEFINITION__TYPE);

    joinedModelDefinitionEClass = createEClass(JOINED_MODEL_DEFINITION);
    createEAttribute(joinedModelDefinitionEClass, JOINED_MODEL_DEFINITION__NAME);
    createEReference(joinedModelDefinitionEClass, JOINED_MODEL_DEFINITION__RHS);

    joinExpressionEClass = createEClass(JOIN_EXPRESSION);
    createEReference(joinExpressionEClass, JOIN_EXPRESSION__TERMS);

    joinTermEClass = createEClass(JOIN_TERM);
    createEReference(joinTermEClass, JOIN_TERM__REFERENCE);
    createEReference(joinTermEClass, JOIN_TERM__MAPPING);
    createEReference(joinTermEClass, JOIN_TERM__GROUPING);

    summarizeModelDefinitionEClass = createEClass(SUMMARIZE_MODEL_DEFINITION);
    createEAttribute(summarizeModelDefinitionEClass, SUMMARIZE_MODEL_DEFINITION__NAME);
    createEReference(summarizeModelDefinitionEClass, SUMMARIZE_MODEL_DEFINITION__RHS);

    summarizeExpressionEClass = createEClass(SUMMARIZE_EXPRESSION);
    createEReference(summarizeExpressionEClass, SUMMARIZE_EXPRESSION__TERMS);

    summarizeTermEClass = createEClass(SUMMARIZE_TERM);
    createEReference(summarizeTermEClass, SUMMARIZE_TERM__REFERENCE);
    createEReference(summarizeTermEClass, SUMMARIZE_TERM__FOLDING);
    createEReference(summarizeTermEClass, SUMMARIZE_TERM__GROUPING);

    attributeListEClass = createEClass(ATTRIBUTE_LIST);
    createEReference(attributeListEClass, ATTRIBUTE_LIST__ATTRIBUTES);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__NAME);
    createEReference(attributeEClass, ATTRIBUTE__ELEMENTS);

    attributeElementListEClass = createEClass(ATTRIBUTE_ELEMENT_LIST);
    createEReference(attributeElementListEClass, ATTRIBUTE_ELEMENT_LIST__ELEMENTS);

    attributeElementEClass = createEClass(ATTRIBUTE_ELEMENT);
    createEAttribute(attributeElementEClass, ATTRIBUTE_ELEMENT__NAME);
    createEReference(attributeElementEClass, ATTRIBUTE_ELEMENT__VALUE);

    attributeValueEClass = createEClass(ATTRIBUTE_VALUE);
    createEReference(attributeValueEClass, ATTRIBUTE_VALUE__VALUE);

    attributeValueArrayEClass = createEClass(ATTRIBUTE_VALUE_ARRAY);
    createEReference(attributeValueArrayEClass, ATTRIBUTE_VALUE_ARRAY__ELEMENTS);

    groupingEClass = createEClass(GROUPING);
    createEAttribute(groupingEClass, GROUPING__NAME);

    modelMappingEClass = createEClass(MODEL_MAPPING);
    createEReference(modelMappingEClass, MODEL_MAPPING__MAPPINGS);

    propertyMappingEClass = createEClass(PROPERTY_MAPPING);
    createEAttribute(propertyMappingEClass, PROPERTY_MAPPING__DESCRIPTION);
    createEReference(propertyMappingEClass, PROPERTY_MAPPING__ATTRIBUTES);
    createEAttribute(propertyMappingEClass, PROPERTY_MAPPING__FROM);
    createEAttribute(propertyMappingEClass, PROPERTY_MAPPING__NAME);

    modelFoldingEClass = createEClass(MODEL_FOLDING);
    createEReference(modelFoldingEClass, MODEL_FOLDING__FOLDINGS);

    propertyFoldingEClass = createEClass(PROPERTY_FOLDING);
    createEAttribute(propertyFoldingEClass, PROPERTY_FOLDING__DESCRIPTION);
    createEReference(propertyFoldingEClass, PROPERTY_FOLDING__ATTRIBUTES);
    createEAttribute(propertyFoldingEClass, PROPERTY_FOLDING__AGGREGATOR);
    createEAttribute(propertyFoldingEClass, PROPERTY_FOLDING__FROM);
    createEAttribute(propertyFoldingEClass, PROPERTY_FOLDING__NAME);

    qualifiedNameObjectEClass = createEClass(QUALIFIED_NAME_OBJECT);
    createEAttribute(qualifiedNameObjectEClass, QUALIFIED_NAME_OBJECT__NAME);

    literalEClass = createEClass(LITERAL);
    createEAttribute(literalEClass, LITERAL__STRING_VALUE);
    createEAttribute(literalEClass, LITERAL__INT_VALUE);
    createEAttribute(literalEClass, LITERAL__DECIMAL_VALUE);
    createEAttribute(literalEClass, LITERAL__BOOLEAN_VALUE);

    // Create enums
    typeEEnum = createEEnum(TYPE);
    booleanEEnum = createEEnum(BOOLEAN);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(scriptEClass, Script.class, "Script", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScript_List(), this.getModelDefinition(), null, "list", null, 0, -1, Script.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelDefinitionEClass, ModelDefinition.class, "ModelDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelDefinition_Description(), ecorePackage.getEString(), "description", null, 0, 1, ModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelDefinition_Attributes(), this.getAttributeList(), null, "attributes", null, 0, 1, ModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getModelDefinition_Model(), ecorePackage.getEObject(), null, "model", null, 0, 1, ModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recordModelDefinitionEClass, RecordModelDefinition.class, "RecordModelDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRecordModelDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, RecordModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecordModelDefinition_Rhs(), this.getRecordExpression(), null, "rhs", null, 0, 1, RecordModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(projectiveModelDefinitionEClass, ProjectiveModelDefinition.class, "ProjectiveModelDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProjectiveModelDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, ProjectiveModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProjectiveModelDefinition_Rhs(), this.getRecordExpression(), null, "rhs", null, 0, 1, ProjectiveModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recordExpressionEClass, RecordExpression.class, "RecordExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRecordExpression_Terms(), this.getRecordTerm(), null, "terms", null, 0, -1, RecordExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(recordTermEClass, RecordTerm.class, "RecordTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRecordTerm_Properties(), this.getPropertyDefinition(), null, "properties", null, 0, -1, RecordTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRecordTerm_Reference(), this.getModelReference(), null, "reference", null, 0, 1, RecordTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelReferenceEClass, ModelReference.class, "ModelReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getModelReference_Name(), ecorePackage.getEString(), "name", null, 0, 1, ModelReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyDefinitionEClass, PropertyDefinition.class, "PropertyDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyDefinition_Description(), ecorePackage.getEString(), "description", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyDefinition_Attributes(), this.getAttributeList(), null, "attributes", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyDefinition_Type(), this.getType(), "type", null, 0, 1, PropertyDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(joinedModelDefinitionEClass, JoinedModelDefinition.class, "JoinedModelDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getJoinedModelDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, JoinedModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoinedModelDefinition_Rhs(), this.getJoinExpression(), null, "rhs", null, 0, 1, JoinedModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(joinExpressionEClass, JoinExpression.class, "JoinExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJoinExpression_Terms(), this.getJoinTerm(), null, "terms", null, 0, -1, JoinExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(joinTermEClass, JoinTerm.class, "JoinTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getJoinTerm_Reference(), this.getModelReference(), null, "reference", null, 0, 1, JoinTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoinTerm_Mapping(), this.getModelMapping(), null, "mapping", null, 0, 1, JoinTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getJoinTerm_Grouping(), this.getGrouping(), null, "grouping", null, 0, 1, JoinTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(summarizeModelDefinitionEClass, SummarizeModelDefinition.class, "SummarizeModelDefinition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSummarizeModelDefinition_Name(), ecorePackage.getEString(), "name", null, 0, 1, SummarizeModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSummarizeModelDefinition_Rhs(), this.getSummarizeExpression(), null, "rhs", null, 0, 1, SummarizeModelDefinition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(summarizeExpressionEClass, SummarizeExpression.class, "SummarizeExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSummarizeExpression_Terms(), this.getSummarizeTerm(), null, "terms", null, 0, -1, SummarizeExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(summarizeTermEClass, SummarizeTerm.class, "SummarizeTerm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getSummarizeTerm_Reference(), this.getModelReference(), null, "reference", null, 0, 1, SummarizeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSummarizeTerm_Folding(), this.getModelFolding(), null, "folding", null, 0, 1, SummarizeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSummarizeTerm_Grouping(), this.getGrouping(), null, "grouping", null, 0, 1, SummarizeTerm.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeListEClass, AttributeList.class, "AttributeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeList_Attributes(), this.getAttribute(), null, "attributes", null, 0, -1, AttributeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_Name(), ecorePackage.getEString(), "name", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttribute_Elements(), this.getAttributeElementList(), null, "elements", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeElementListEClass, AttributeElementList.class, "AttributeElementList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeElementList_Elements(), this.getAttributeElement(), null, "elements", null, 0, -1, AttributeElementList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeElementEClass, AttributeElement.class, "AttributeElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttributeElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, AttributeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAttributeElement_Value(), this.getAttributeValue(), null, "value", null, 0, 1, AttributeElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeValueEClass, AttributeValue.class, "AttributeValue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeValue_Value(), ecorePackage.getEObject(), null, "value", null, 0, 1, AttributeValue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeValueArrayEClass, AttributeValueArray.class, "AttributeValueArray", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeValueArray_Elements(), this.getAttributeValue(), null, "elements", null, 0, -1, AttributeValueArray.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(groupingEClass, Grouping.class, "Grouping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGrouping_Name(), ecorePackage.getEString(), "name", null, 0, -1, Grouping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelMappingEClass, ModelMapping.class, "ModelMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelMapping_Mappings(), this.getPropertyMapping(), null, "mappings", null, 0, -1, ModelMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyMappingEClass, PropertyMapping.class, "PropertyMapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyMapping_Description(), ecorePackage.getEString(), "description", null, 0, 1, PropertyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyMapping_Attributes(), this.getAttributeList(), null, "attributes", null, 0, 1, PropertyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyMapping_From(), ecorePackage.getEString(), "from", null, 0, 1, PropertyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyMapping_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyMapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(modelFoldingEClass, ModelFolding.class, "ModelFolding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getModelFolding_Foldings(), this.getPropertyFolding(), null, "foldings", null, 0, -1, ModelFolding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyFoldingEClass, PropertyFolding.class, "PropertyFolding", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPropertyFolding_Description(), ecorePackage.getEString(), "description", null, 0, 1, PropertyFolding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyFolding_Attributes(), this.getAttributeList(), null, "attributes", null, 0, 1, PropertyFolding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyFolding_Aggregator(), ecorePackage.getEString(), "aggregator", null, 0, 1, PropertyFolding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyFolding_From(), ecorePackage.getEString(), "from", null, 0, 1, PropertyFolding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyFolding_Name(), ecorePackage.getEString(), "name", null, 0, 1, PropertyFolding.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualifiedNameObjectEClass, QualifiedNameObject.class, "QualifiedNameObject", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getQualifiedNameObject_Name(), ecorePackage.getEString(), "name", null, 0, 1, QualifiedNameObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(literalEClass, Literal.class, "Literal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLiteral_StringValue(), ecorePackage.getEString(), "stringValue", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteral_IntValue(), ecorePackage.getEInt(), "intValue", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteral_DecimalValue(), ecorePackage.getEBigDecimal(), "decimalValue", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLiteral_BooleanValue(), this.getBOOLEAN(), "booleanValue", null, 0, 1, Literal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(typeEEnum, Type.class, "Type");
    addEEnumLiteral(typeEEnum, Type.INT);
    addEEnumLiteral(typeEEnum, Type.LONG);
    addEEnumLiteral(typeEEnum, Type.BYTE);
    addEEnumLiteral(typeEEnum, Type.SHORT);
    addEEnumLiteral(typeEEnum, Type.DECIMAL);
    addEEnumLiteral(typeEEnum, Type.FLOAT);
    addEEnumLiteral(typeEEnum, Type.DOUBLE);
    addEEnumLiteral(typeEEnum, Type.TEXT);
    addEEnumLiteral(typeEEnum, Type.BOOLEAN);
    addEEnumLiteral(typeEEnum, Type.DATE);
    addEEnumLiteral(typeEEnum, Type.DATETIME);

    initEEnum(booleanEEnum, jp.hishidama.xtext.dmdl_editor.dmdl.BOOLEAN.class, "BOOLEAN");
    addEEnumLiteral(booleanEEnum, jp.hishidama.xtext.dmdl_editor.dmdl.BOOLEAN.TRUE);
    addEEnumLiteral(booleanEEnum, jp.hishidama.xtext.dmdl_editor.dmdl.BOOLEAN.FALSE);

    // Create resource
    createResource(eNS_URI);
  }

} //DmdlPackageImpl
