/*******************************************************************************
 * Copyright (c) 2014 Vienna University of Technology.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 * Martin Fleck (Vienna University of Technology) - initial API and implementation
 *
 * Initially developed in the context of ARTIST EU project www.artist-project.eu
 *******************************************************************************/
/**
 */
package eu.artist.postmigration.nfrvt.lang.tsl.tsl.impl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage;

import eu.artist.postmigration.nfrvt.lang.tsl.tsl.Pattern;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternCatalogue;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.PatternImpact;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslFactory;
import eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TslPackageImpl extends EPackageImpl implements TslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patternCatalogueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patternImpactEClass = null;

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
   * @see eu.artist.postmigration.nfrvt.lang.tsl.tsl.TslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TslPackageImpl()
  {
    super(eNS_URI, TslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link TslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TslPackage init()
  {
    if (isInited) return (TslPackage)EPackage.Registry.INSTANCE.getEPackage(TslPackage.eNS_URI);

    // Obtain or create and register package
    TslPackageImpl theTslPackage = (TslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    NslPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theTslPackage.createPackageContents();

    // Initialize created meta-data
    theTslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TslPackage.eNS_URI, theTslPackage);
    return theTslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatternCatalogue()
  {
    return patternCatalogueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatternCatalogue_Imports()
  {
    return (EReference)patternCatalogueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPatternCatalogue_Name()
  {
    return (EAttribute)patternCatalogueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatternCatalogue_Patterns()
  {
    return (EReference)patternCatalogueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPattern()
  {
    return patternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPattern_Name()
  {
    return (EAttribute)patternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPattern_Context()
  {
    return (EAttribute)patternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPattern_Problem()
  {
    return (EAttribute)patternEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPattern_Solution()
  {
    return (EAttribute)patternEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPattern_PropertyImpacts()
  {
    return (EReference)patternEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPattern_PatternImpacts()
  {
    return (EReference)patternEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPattern_RelatedPatterns()
  {
    return (EReference)patternEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPatternImpact()
  {
    return patternImpactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPatternImpact_Target()
  {
    return (EReference)patternImpactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPatternImpact_Impact()
  {
    return (EAttribute)patternImpactEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TslFactory getTslFactory()
  {
    return (TslFactory)getEFactoryInstance();
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
    patternCatalogueEClass = createEClass(PATTERN_CATALOGUE);
    createEReference(patternCatalogueEClass, PATTERN_CATALOGUE__IMPORTS);
    createEAttribute(patternCatalogueEClass, PATTERN_CATALOGUE__NAME);
    createEReference(patternCatalogueEClass, PATTERN_CATALOGUE__PATTERNS);

    patternEClass = createEClass(PATTERN);
    createEAttribute(patternEClass, PATTERN__NAME);
    createEAttribute(patternEClass, PATTERN__CONTEXT);
    createEAttribute(patternEClass, PATTERN__PROBLEM);
    createEAttribute(patternEClass, PATTERN__SOLUTION);
    createEReference(patternEClass, PATTERN__PROPERTY_IMPACTS);
    createEReference(patternEClass, PATTERN__PATTERN_IMPACTS);
    createEReference(patternEClass, PATTERN__RELATED_PATTERNS);

    patternImpactEClass = createEClass(PATTERN_IMPACT);
    createEReference(patternImpactEClass, PATTERN_IMPACT__TARGET);
    createEAttribute(patternImpactEClass, PATTERN_IMPACT__IMPACT);
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

    // Obtain other dependent packages
    ArtistCommonPackage theArtistCommonPackage = (ArtistCommonPackage)EPackage.Registry.INSTANCE.getEPackage(ArtistCommonPackage.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    NslPackage theNslPackage = (NslPackage)EPackage.Registry.INSTANCE.getEPackage(NslPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(patternCatalogueEClass, PatternCatalogue.class, "PatternCatalogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPatternCatalogue_Imports(), theArtistCommonPackage.getImportNamespace(), null, "imports", null, 0, -1, PatternCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPatternCatalogue_Name(), theEcorePackage.getEString(), "name", null, 0, 1, PatternCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPatternCatalogue_Patterns(), this.getPattern(), null, "patterns", null, 0, -1, PatternCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patternEClass, Pattern.class, "Pattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPattern_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPattern_Context(), theEcorePackage.getEString(), "context", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPattern_Problem(), theEcorePackage.getEString(), "problem", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPattern_Solution(), theEcorePackage.getEString(), "solution", null, 0, 1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPattern_PropertyImpacts(), theNslPackage.getPropertyImpact(), null, "propertyImpacts", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPattern_PatternImpacts(), this.getPatternImpact(), null, "patternImpacts", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPattern_RelatedPatterns(), this.getPattern(), null, "relatedPatterns", null, 0, -1, Pattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(patternImpactEClass, PatternImpact.class, "PatternImpact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPatternImpact_Target(), this.getPattern(), null, "target", null, 0, 1, PatternImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPatternImpact_Impact(), theEcorePackage.getEBigDecimal(), "impact", null, 0, 1, PatternImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TslPackageImpl
