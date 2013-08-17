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
      public Adapter caseModels(Models object)
      {
        return createModelsAdapter();
      }
      @Override
      public Adapter caseModelDefinition(ModelDefinition object)
      {
        return createModelDefinitionAdapter();
      }
      @Override
      public Adapter caseRecordModelDefinition(RecordModelDefinition object)
      {
        return createRecordModelDefinitionAdapter();
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
      public Adapter casePropertyDefinition(PropertyDefinition object)
      {
        return createPropertyDefinitionAdapter();
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
      public Adapter caseQualifiedName(QualifiedName object)
      {
        return createQualifiedNameAdapter();
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
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.Models <em>Models</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.Models
   * @generated
   */
  public Adapter createModelsAdapter()
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
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.RecordModelDefinition <em>Record Model Definition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.RecordModelDefinition
   * @generated
   */
  public Adapter createRecordModelDefinitionAdapter()
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
   * Creates a new adapter for an object of class '{@link jp.hishidama.xtext.dmdl_editor.dmdl.QualifiedName <em>Qualified Name</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see jp.hishidama.xtext.dmdl_editor.dmdl.QualifiedName
   * @generated
   */
  public Adapter createQualifiedNameAdapter()
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
