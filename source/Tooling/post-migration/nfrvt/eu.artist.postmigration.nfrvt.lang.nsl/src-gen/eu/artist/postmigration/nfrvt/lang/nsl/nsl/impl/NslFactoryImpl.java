/**
 */
package eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NslFactoryImpl extends EFactoryImpl implements NslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static NslFactory init()
  {
    try
    {
      NslFactory theNslFactory = (NslFactory)EPackage.Registry.INSTANCE.getEFactory(NslPackage.eNS_URI);
      if (theNslFactory != null)
      {
        return theNslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new NslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NslFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case NslPackage.PROPERTY_CATALOGUE: return createPropertyCatalogue();
      case NslPackage.PROPERTY: return createProperty();
      case NslPackage.QUALITATIVE_PROPERTY: return createQualitativeProperty();
      case NslPackage.QUANTITATIVE_PROPERTY: return createQuantitativeProperty();
      case NslPackage.BASE_QUANTITATIVE_PROPERTY: return createBaseQuantitativeProperty();
      case NslPackage.DERIVED_QUANTITATIVE_PROPERTY: return createDerivedQuantitativeProperty();
      case NslPackage.PROPERTY_IMPACT: return createPropertyImpact();
      case NslPackage.PARENTHESIZED_ARITHMETIC_EXPRESSION: return createParenthesizedArithmeticExpression();
      case NslPackage.QUANTITATIVE_PROPERTY_EXPRESSION: return createQuantitativePropertyExpression();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case NslPackage.DIRECTION_KIND:
        return createDirectionKindFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case NslPackage.DIRECTION_KIND:
        return convertDirectionKindToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyCatalogue createPropertyCatalogue()
  {
    PropertyCatalogueImpl propertyCatalogue = new PropertyCatalogueImpl();
    return propertyCatalogue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Property createProperty()
  {
    PropertyImpl property = new PropertyImpl();
    return property;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QualitativeProperty createQualitativeProperty()
  {
    QualitativePropertyImpl qualitativeProperty = new QualitativePropertyImpl();
    return qualitativeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantitativeProperty createQuantitativeProperty()
  {
    QuantitativePropertyImpl quantitativeProperty = new QuantitativePropertyImpl();
    return quantitativeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BaseQuantitativeProperty createBaseQuantitativeProperty()
  {
    BaseQuantitativePropertyImpl baseQuantitativeProperty = new BaseQuantitativePropertyImpl();
    return baseQuantitativeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DerivedQuantitativeProperty createDerivedQuantitativeProperty()
  {
    DerivedQuantitativePropertyImpl derivedQuantitativeProperty = new DerivedQuantitativePropertyImpl();
    return derivedQuantitativeProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PropertyImpact createPropertyImpact()
  {
    PropertyImpactImpl propertyImpact = new PropertyImpactImpl();
    return propertyImpact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ParenthesizedArithmeticExpression createParenthesizedArithmeticExpression()
  {
    ParenthesizedArithmeticExpressionImpl parenthesizedArithmeticExpression = new ParenthesizedArithmeticExpressionImpl();
    return parenthesizedArithmeticExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public QuantitativePropertyExpression createQuantitativePropertyExpression()
  {
    QuantitativePropertyExpressionImpl quantitativePropertyExpression = new QuantitativePropertyExpressionImpl();
    return quantitativePropertyExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DirectionKind createDirectionKindFromString(EDataType eDataType, String initialValue)
  {
    DirectionKind result = DirectionKind.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertDirectionKindToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NslPackage getNslPackage()
  {
    return (NslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static NslPackage getPackage()
  {
    return NslPackage.eINSTANCE;
  }

} //NslFactoryImpl
