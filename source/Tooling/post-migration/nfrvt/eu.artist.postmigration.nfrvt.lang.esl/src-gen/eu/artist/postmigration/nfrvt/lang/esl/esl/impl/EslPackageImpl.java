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
package eu.artist.postmigration.nfrvt.lang.esl.esl.impl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage;

import eu.artist.postmigration.nfrvt.lang.esl.esl.EslFactory;
import eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage;
import eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategy;
import eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyCatalogue;
import eu.artist.postmigration.nfrvt.lang.esl.esl.EvaluationStrategyLevelKind;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.common.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class EslPackageImpl extends EPackageImpl implements EslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass evaluationStrategyCatalogueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass evaluationStrategyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum evaluationStrategyLevelKindEEnum = null;

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
   * @see eu.artist.postmigration.nfrvt.lang.esl.esl.EslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private EslPackageImpl()
  {
    super(eNS_URI, EslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link EslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static EslPackage init()
  {
    if (isInited) return (EslPackage)EPackage.Registry.INSTANCE.getEPackage(EslPackage.eNS_URI);

    // Obtain or create and register package
    EslPackageImpl theEslPackage = (EslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof EslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new EslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    NslPackage.eINSTANCE.eClass();
    TypesPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theEslPackage.createPackageContents();

    // Initialize created meta-data
    theEslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theEslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(EslPackage.eNS_URI, theEslPackage);
    return theEslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvaluationStrategyCatalogue()
  {
    return evaluationStrategyCatalogueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvaluationStrategyCatalogue_Imports()
  {
    return (EReference)evaluationStrategyCatalogueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvaluationStrategyCatalogue_Name()
  {
    return (EAttribute)evaluationStrategyCatalogueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvaluationStrategyCatalogue_Strategies()
  {
    return (EReference)evaluationStrategyCatalogueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvaluationStrategy()
  {
    return evaluationStrategyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvaluationStrategy_Name()
  {
    return (EAttribute)evaluationStrategyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvaluationStrategy_JavaClass()
  {
    return (EReference)evaluationStrategyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvaluationStrategy_Description()
  {
    return (EAttribute)evaluationStrategyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getEvaluationStrategy_Level()
  {
    return (EAttribute)evaluationStrategyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvaluationStrategy_Properties()
  {
    return (EReference)evaluationStrategyEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getEvaluationStrategyLevelKind()
  {
    return evaluationStrategyLevelKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EslFactory getEslFactory()
  {
    return (EslFactory)getEFactoryInstance();
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
    evaluationStrategyCatalogueEClass = createEClass(EVALUATION_STRATEGY_CATALOGUE);
    createEReference(evaluationStrategyCatalogueEClass, EVALUATION_STRATEGY_CATALOGUE__IMPORTS);
    createEAttribute(evaluationStrategyCatalogueEClass, EVALUATION_STRATEGY_CATALOGUE__NAME);
    createEReference(evaluationStrategyCatalogueEClass, EVALUATION_STRATEGY_CATALOGUE__STRATEGIES);

    evaluationStrategyEClass = createEClass(EVALUATION_STRATEGY);
    createEAttribute(evaluationStrategyEClass, EVALUATION_STRATEGY__NAME);
    createEReference(evaluationStrategyEClass, EVALUATION_STRATEGY__JAVA_CLASS);
    createEAttribute(evaluationStrategyEClass, EVALUATION_STRATEGY__DESCRIPTION);
    createEAttribute(evaluationStrategyEClass, EVALUATION_STRATEGY__LEVEL);
    createEReference(evaluationStrategyEClass, EVALUATION_STRATEGY__PROPERTIES);

    // Create enums
    evaluationStrategyLevelKindEEnum = createEEnum(EVALUATION_STRATEGY_LEVEL_KIND);
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
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    NslPackage theNslPackage = (NslPackage)EPackage.Registry.INSTANCE.getEPackage(NslPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(evaluationStrategyCatalogueEClass, EvaluationStrategyCatalogue.class, "EvaluationStrategyCatalogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEvaluationStrategyCatalogue_Imports(), theArtistCommonPackage.getImportNamespace(), null, "imports", null, 0, -1, EvaluationStrategyCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvaluationStrategyCatalogue_Name(), theEcorePackage.getEString(), "name", null, 0, 1, EvaluationStrategyCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluationStrategyCatalogue_Strategies(), this.getEvaluationStrategy(), null, "strategies", null, 0, -1, EvaluationStrategyCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(evaluationStrategyEClass, EvaluationStrategy.class, "EvaluationStrategy", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getEvaluationStrategy_Name(), theEcorePackage.getEString(), "name", null, 0, 1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluationStrategy_JavaClass(), theTypesPackage.getJvmDeclaredType(), null, "javaClass", null, 0, 1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvaluationStrategy_Description(), theEcorePackage.getEString(), "description", null, 0, 1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getEvaluationStrategy_Level(), this.getEvaluationStrategyLevelKind(), "level", null, 0, 1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getEvaluationStrategy_Properties(), theNslPackage.getQuantitativeProperty(), null, "properties", null, 0, -1, EvaluationStrategy.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(evaluationStrategyLevelKindEEnum, EvaluationStrategyLevelKind.class, "EvaluationStrategyLevelKind");
    addEEnumLiteral(evaluationStrategyLevelKindEEnum, EvaluationStrategyLevelKind.MODEL);
    addEEnumLiteral(evaluationStrategyLevelKindEEnum, EvaluationStrategyLevelKind.CODE);

    // Create resource
    createResource(eNS_URI);
  }

} //EslPackageImpl
