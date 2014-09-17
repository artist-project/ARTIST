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
package eu.artist.postmigration.nfrvt.lang.nsl.nsl.impl;

import eu.artist.postmigration.nfrvt.lang.common.artistCommon.ArtistCommonPackage;

import eu.artist.postmigration.nfrvt.lang.nsl.nsl.BaseQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.DerivedQuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.DirectionKind;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslFactory;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.ParenthesizedArithmeticExpression;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.Property;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyCatalogue;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.PropertyImpact;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QualitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativeProperty;
import eu.artist.postmigration.nfrvt.lang.nsl.nsl.QuantitativePropertyExpression;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.uml.UMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NslPackageImpl extends EPackageImpl implements NslPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyCatalogueEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass qualitativePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantitativePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass baseQuantitativePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass derivedQuantitativePropertyEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass propertyImpactEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parenthesizedArithmeticExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass quantitativePropertyExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum directionKindEEnum = null;

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
   * @see eu.artist.postmigration.nfrvt.lang.nsl.nsl.NslPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private NslPackageImpl()
  {
    super(eNS_URI, NslFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link NslPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static NslPackage init()
  {
    if (isInited) return (NslPackage)EPackage.Registry.INSTANCE.getEPackage(NslPackage.eNS_URI);

    // Obtain or create and register package
    NslPackageImpl theNslPackage = (NslPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NslPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NslPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    ArtistCommonPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theNslPackage.createPackageContents();

    // Initialize created meta-data
    theNslPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theNslPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(NslPackage.eNS_URI, theNslPackage);
    return theNslPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyCatalogue()
  {
    return propertyCatalogueEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyCatalogue_Imports()
  {
    return (EReference)propertyCatalogueEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyCatalogue_Name()
  {
    return (EAttribute)propertyCatalogueEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyCatalogue_Properties()
  {
    return (EReference)propertyCatalogueEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getProperty()
  {
    return propertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Name()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Description()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getProperty_Direction()
  {
    return (EAttribute)propertyEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getProperty_Impacts()
  {
    return (EReference)propertyEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQualitativeProperty()
  {
    return qualitativePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQualitativeProperty_Properties()
  {
    return (EReference)qualitativePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuantitativeProperty()
  {
    return quantitativePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantitativeProperty_Type()
  {
    return (EReference)quantitativePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBaseQuantitativeProperty()
  {
    return baseQuantitativePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDerivedQuantitativeProperty()
  {
    return derivedQuantitativePropertyEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDerivedQuantitativeProperty_Expression()
  {
    return (EReference)derivedQuantitativePropertyEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPropertyImpact()
  {
    return propertyImpactEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPropertyImpact_Target()
  {
    return (EReference)propertyImpactEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPropertyImpact_Impact()
  {
    return (EAttribute)propertyImpactEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParenthesizedArithmeticExpression()
  {
    return parenthesizedArithmeticExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getParenthesizedArithmeticExpression_Value()
  {
    return (EReference)parenthesizedArithmeticExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getQuantitativePropertyExpression()
  {
    return quantitativePropertyExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getQuantitativePropertyExpression_Value()
  {
    return (EReference)quantitativePropertyExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getDirectionKind()
  {
    return directionKindEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NslFactory getNslFactory()
  {
    return (NslFactory)getEFactoryInstance();
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
    propertyCatalogueEClass = createEClass(PROPERTY_CATALOGUE);
    createEReference(propertyCatalogueEClass, PROPERTY_CATALOGUE__IMPORTS);
    createEAttribute(propertyCatalogueEClass, PROPERTY_CATALOGUE__NAME);
    createEReference(propertyCatalogueEClass, PROPERTY_CATALOGUE__PROPERTIES);

    propertyEClass = createEClass(PROPERTY);
    createEAttribute(propertyEClass, PROPERTY__NAME);
    createEAttribute(propertyEClass, PROPERTY__DESCRIPTION);
    createEAttribute(propertyEClass, PROPERTY__DIRECTION);
    createEReference(propertyEClass, PROPERTY__IMPACTS);

    qualitativePropertyEClass = createEClass(QUALITATIVE_PROPERTY);
    createEReference(qualitativePropertyEClass, QUALITATIVE_PROPERTY__PROPERTIES);

    quantitativePropertyEClass = createEClass(QUANTITATIVE_PROPERTY);
    createEReference(quantitativePropertyEClass, QUANTITATIVE_PROPERTY__TYPE);

    baseQuantitativePropertyEClass = createEClass(BASE_QUANTITATIVE_PROPERTY);

    derivedQuantitativePropertyEClass = createEClass(DERIVED_QUANTITATIVE_PROPERTY);
    createEReference(derivedQuantitativePropertyEClass, DERIVED_QUANTITATIVE_PROPERTY__EXPRESSION);

    propertyImpactEClass = createEClass(PROPERTY_IMPACT);
    createEReference(propertyImpactEClass, PROPERTY_IMPACT__TARGET);
    createEAttribute(propertyImpactEClass, PROPERTY_IMPACT__IMPACT);

    parenthesizedArithmeticExpressionEClass = createEClass(PARENTHESIZED_ARITHMETIC_EXPRESSION);
    createEReference(parenthesizedArithmeticExpressionEClass, PARENTHESIZED_ARITHMETIC_EXPRESSION__VALUE);

    quantitativePropertyExpressionEClass = createEClass(QUANTITATIVE_PROPERTY_EXPRESSION);
    createEReference(quantitativePropertyExpressionEClass, QUANTITATIVE_PROPERTY_EXPRESSION__VALUE);

    // Create enums
    directionKindEEnum = createEEnum(DIRECTION_KIND);
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
    UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    qualitativePropertyEClass.getESuperTypes().add(this.getProperty());
    quantitativePropertyEClass.getESuperTypes().add(this.getProperty());
    baseQuantitativePropertyEClass.getESuperTypes().add(this.getQuantitativeProperty());
    derivedQuantitativePropertyEClass.getESuperTypes().add(this.getQuantitativeProperty());
    parenthesizedArithmeticExpressionEClass.getESuperTypes().add(theArtistCommonPackage.getNumberExpression());
    quantitativePropertyExpressionEClass.getESuperTypes().add(theArtistCommonPackage.getNumberExpression());

    // Initialize classes and features; add operations and parameters
    initEClass(propertyCatalogueEClass, PropertyCatalogue.class, "PropertyCatalogue", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyCatalogue_Imports(), theArtistCommonPackage.getImportNamespace(), null, "imports", null, 0, -1, PropertyCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyCatalogue_Name(), theEcorePackage.getEString(), "name", null, 0, 1, PropertyCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPropertyCatalogue_Properties(), this.getProperty(), null, "properties", null, 0, -1, PropertyCatalogue.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyEClass, Property.class, "Property", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getProperty_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getProperty_Direction(), this.getDirectionKind(), "direction", null, 0, 1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getProperty_Impacts(), this.getPropertyImpact(), null, "impacts", null, 0, -1, Property.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(qualitativePropertyEClass, QualitativeProperty.class, "QualitativeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQualitativeProperty_Properties(), this.getProperty(), null, "properties", null, 0, -1, QualitativeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quantitativePropertyEClass, QuantitativeProperty.class, "QuantitativeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQuantitativeProperty_Type(), theUMLPackage.getDataType(), null, "type", null, 0, 1, QuantitativeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(baseQuantitativePropertyEClass, BaseQuantitativeProperty.class, "BaseQuantitativeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(derivedQuantitativePropertyEClass, DerivedQuantitativeProperty.class, "DerivedQuantitativeProperty", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDerivedQuantitativeProperty_Expression(), theArtistCommonPackage.getArithmeticExpression(), null, "expression", null, 0, 1, DerivedQuantitativeProperty.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(propertyImpactEClass, PropertyImpact.class, "PropertyImpact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPropertyImpact_Target(), this.getProperty(), null, "target", null, 0, 1, PropertyImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPropertyImpact_Impact(), theEcorePackage.getEBigDecimal(), "impact", null, 0, 1, PropertyImpact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(parenthesizedArithmeticExpressionEClass, ParenthesizedArithmeticExpression.class, "ParenthesizedArithmeticExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getParenthesizedArithmeticExpression_Value(), theArtistCommonPackage.getArithmeticExpression(), null, "value", null, 0, 1, ParenthesizedArithmeticExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(quantitativePropertyExpressionEClass, QuantitativePropertyExpression.class, "QuantitativePropertyExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getQuantitativePropertyExpression_Value(), this.getQuantitativeProperty(), null, "value", null, 0, 1, QuantitativePropertyExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(directionKindEEnum, DirectionKind.class, "DirectionKind");
    addEEnumLiteral(directionKindEEnum, DirectionKind.INCREASING);
    addEEnumLiteral(directionKindEEnum, DirectionKind.DECREASING);
    addEEnumLiteral(directionKindEEnum, DirectionKind.RANGE);

    // Create resource
    createResource(eNS_URI);
  }

} //NslPackageImpl
