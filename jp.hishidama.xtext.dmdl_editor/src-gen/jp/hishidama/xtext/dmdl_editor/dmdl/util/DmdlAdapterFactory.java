/**
 */
package jp.hishidama.xtext.dmdl_editor.dmdl.util;

import jp.hishidama.xtext.dmdl_editor.dmdl.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jp.hishidama.xtext.dmdl_editor.dmdl.DmdlPackage
 * @generated
 */
public class DmdlAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DmdlPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DmdlAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DmdlPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DmdlSwitch<Adapter> modelSwitch =
    new DmdlSwitch<Adapter>()
    {
      @Override
      public Adapter caseScript(Script object)
      {
        return createScriptAdapter();
      }
      @Override
      public Adapter caseModelDefinition(ModelDefinition object)
      {
        return createModelDefinitionAdapter();
      }
      @Override
      public Adapter caseRecordExpression(RecordExpression object)
      {
        return createRecordExpressionAdapter();
      }
      @Override
      public Adapter caseRecordTerm(RecordTerm object)
      {
        return createRecordTermAdapter();
      }
      @Override
      public Adapter caseModelReference(ModelReference object)
      {
        return createModelReferenceAdapter();
      }
      @Override
      public Adapter casePropertyDefinition(PropertyDefinition object)
      {
        return createPropertyDefinitionAdapter();
      }
      @Override
      public Adapter casePropertyExpression(PropertyExpression object)
      {
        return createPropertyExpressionAdapter();
      }
      @Override
      public Adapter casePropertyExpressionList(PropertyExpressionList object)
      {
        return createPropertyExpressionListAdapter();
      }
      @Override
      public Adapter casePropertyExpressionMap(PropertyExpressionMap object)
      {
        return createPropertyExpressionMapAdapter();
      }
      @Override
      public Adapter casePropertyExpressionMapEntry(PropertyExpressionMapEntry object)
      {
        return createPropertyExpressionMapEntryAdapter();
      }
      @Override
      public Adapter casePropertyExpressionReference(PropertyExpressionReference object)
      {
        return createPropertyExpressionReferenceAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseJoinExpression(JoinExpression object)
      {
        return createJoinExpressionAdapter();
      }
      @Override
      public Adapter caseJoinTerm(JoinTerm object)
      {
        return createJoinTermAdapter();
      }
      @Override
      public Adapter caseSummarizeExpression(SummarizeExpression object)
      {
        return createSummarizeExpressionAdapter();
      }
      @Override
      public Adapter caseSummarizeTerm(SummarizeTerm object)
      {
        return createSummarizeTermAdapter();
      }
      @Override
      public Adapter caseAttributeList(AttributeList object)
      {
        return createAttributeListAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseAttributeElementBlock(AttributeElementBlock object)
      {
        return createAttributeElementBlockAdapter();
      }
      @Override
      public Adapter caseAttributeElementList(AttributeElementList object)
      {
        return createAttributeElementListAdapter();
      }
      @Override
      public Adapter caseAttributeElement(AttributeElement object)
      {
        return createAttributeElementAdapter();
      }
      @Override
      public Adapter caseAttributeValue(AttributeValue object)
      {
        return createAttributeValueAdapter();
      }
      @Override
      public Adapter caseAttributeValueArray(AttributeValueArray object)
      {
        return createAttributeValueArrayAdapter();
      }
      @Override
      public Adapter caseAttributeValueMap(AttributeValueMap object)
      {
        return createAttributeValueMapAdapter();
      }
      @Override
      public Adapter caseAttributePair(AttributePair object)
      {
        return createAttributePairAdapter();
      }
      @Override
      public Adapter caseGrouping(Grouping object)
      {
        return createGroupingAdapter();
      }
      @Override
      public Adapter caseModelMapping(ModelMapping object)
      {
        return createModelMappingAdapter();
      }
      @Override
      public Adapter casePropertyMapping(PropertyMapping object)
      {
        return createPropertyMappingAdapter();
      }
      @Override
      public Adapter caseModelFolding(ModelFolding object)
      {
        return createModelFoldingAdapter();
      }
      @Override
      public Adapter casePropertyFolding(PropertyFolding object)
      {
        return createPropertyFoldingAdapter();
      }
      @Override
      public Adapter caseProperty(Property object)
      {
        return createPropertyAdapter();
      }
      @Override
      public Adapter caseQualifiedNameObject(QualifiedNameObject object)
      {
        return createQualifiedNameObjectAdapter();
      }
      @Override
      public Adapter caseCollectionType(CollectionType object)
      {
        return createCollectionTypeAdapter();
      }
      @Override
      public Adapter caseLiteral(Literal object)
      {
        return createLiteralAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Script <em>Script</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Script
   * @generated
   */
  public Adapter createScriptAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition <em>Model Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.ModelDefinition
   * @generated
   */
  public Adapter createModelDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.RecordExpression <em>Record Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.RecordExpression
   * @generated
   */
  public Adapter createRecordExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm <em>Record Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.RecordTerm
   * @generated
   */
  public Adapter createRecordTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference <em>Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.ModelReference
   * @generated
   */
  public Adapter createModelReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition <em>Property Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyDefinition
   * @generated
   */
  public Adapter createPropertyDefinitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpression <em>Property Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpression
   * @generated
   */
  public Adapter createPropertyExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionList <em>Property Expression List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionList
   * @generated
   */
  public Adapter createPropertyExpressionListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionMap <em>Property Expression Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionMap
   * @generated
   */
  public Adapter createPropertyExpressionMapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionMapEntry <em>Property Expression Map Entry</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionMapEntry
   * @generated
   */
  public Adapter createPropertyExpressionMapEntryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionReference <em>Property Expression Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyExpressionReference
   * @generated
   */
  public Adapter createPropertyExpressionReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.JoinExpression <em>Join Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.JoinExpression
   * @generated
   */
  public Adapter createJoinExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm <em>Join Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.JoinTerm
   * @generated
   */
  public Adapter createJoinTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeExpression <em>Summarize Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeExpression
   * @generated
   */
  public Adapter createSummarizeExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm <em>Summarize Term</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.SummarizeTerm
   * @generated
   */
  public Adapter createSummarizeTermAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList <em>Attribute List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeList
   * @generated
   */
  public Adapter createAttributeListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementBlock <em>Attribute Element Block</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementBlock
   * @generated
   */
  public Adapter createAttributeElementBlockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementList <em>Attribute Element List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElementList
   * @generated
   */
  public Adapter createAttributeElementListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement <em>Attribute Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeElement
   * @generated
   */
  public Adapter createAttributeElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValue
   * @generated
   */
  public Adapter createAttributeValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValueArray <em>Attribute Value Array</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValueArray
   * @generated
   */
  public Adapter createAttributeValueArrayAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValueMap <em>Attribute Value Map</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributeValueMap
   * @generated
   */
  public Adapter createAttributeValueMapAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.AttributePair <em>Attribute Pair</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.AttributePair
   * @generated
   */
  public Adapter createAttributePairAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Grouping <em>Grouping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Grouping
   * @generated
   */
  public Adapter createGroupingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelMapping <em>Model Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.ModelMapping
   * @generated
   */
  public Adapter createModelMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping <em>Property Mapping</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyMapping
   * @generated
   */
  public Adapter createPropertyMappingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.ModelFolding <em>Model Folding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.ModelFolding
   * @generated
   */
  public Adapter createModelFoldingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding <em>Property Folding</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.PropertyFolding
   * @generated
   */
  public Adapter createPropertyFoldingAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Property
   * @generated
   */
  public Adapter createPropertyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.QualifiedNameObject <em>Qualified Name Object</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.QualifiedNameObject
   * @generated
   */
  public Adapter createQualifiedNameObjectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.CollectionType <em>Collection Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.CollectionType
   * @generated
   */
  public Adapter createCollectionTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Literal <em>Literal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Literal
   * @generated
   */
  public Adapter createLiteralAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DmdlAdapterFactory
