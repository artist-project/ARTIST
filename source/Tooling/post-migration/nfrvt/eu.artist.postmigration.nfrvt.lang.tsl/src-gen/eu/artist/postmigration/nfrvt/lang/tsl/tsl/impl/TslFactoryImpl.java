/**
 */
package eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl;

import eu.artist.postmigration.nfrvt.lang.tsl.tsl.*;

import org.eclipse.emf.ecore.EClass;
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
public class TslFactoryImpl extends EFactoryImpl implements TslFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TslFactory init()
  {
    try
    {
      TslFactory theTslFactory = (TslFactory)EPackage.Registry.INSTANCE.getEFactory(TslPackage.eNS_URI);
      if (theTslFactory != null)
      {
        return theTslFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TslFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TslFactoryImpl()
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
      case TslPackage.PATTERN_CATALOGUE: return createPatternCatalogue();
      case TslPackage.PATTERN: return createPattern();
      case TslPackage.PATTERN_IMPACT: return createPatternImpact();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternCatalogue createPatternCatalogue()
  {
    PatternCatalogueImpl patternCatalogue = new PatternCatalogueImpl();
    return patternCatalogue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Pattern createPattern()
  {
    PatternImpl pattern = new PatternImpl();
    return pattern;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternImpact createPatternImpact()
  {
    PatternImpactImpl patternImpact = new PatternImpactImpl();
    return patternImpact;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TslPackage getTslPackage()
  {
    return (TslPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TslPackage getPackage()
  {
    return TslPackage.eINSTANCE;
  }

} //TslFactoryImpl
