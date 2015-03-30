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
package eu.artist.postmigration.nfrvt.resources.types.impl;

import eu.artist.postmigration.nfrvt.resources.types.ARTISTTypesFactory;
import eu.artist.postmigration.nfrvt.resources.types.ARTISTTypesPackage;
import eu.artist.postmigration.nfrvt.resources.types.CloudProvider;
import eu.artist.postmigration.nfrvt.resources.types.Country;
import eu.artist.postmigration.nfrvt.resources.types.DBType;
import eu.artist.postmigration.nfrvt.resources.types.ProgrammingLanguage;
import eu.artist.postmigration.nfrvt.resources.types.ProvisioningType;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the umlPackage <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ARTISTTypesPackageImpl extends EPackageImpl implements ARTISTTypesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass countryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cloudProviderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum programmingLanguageEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dbTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum provisioningTypeEEnum = null;

	/**
	 * Creates an instance of the umlPackage <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see eu.artist.postmigration.nfrvt.resources.types.ARTISTTypesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ARTISTTypesPackageImpl() {
		super(eNS_URI, ARTISTTypesFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this umlPackage, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link ARTISTTypesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static ARTISTTypesPackage init() {
		if (isInited) return (ARTISTTypesPackage)EPackage.Registry.INSTANCE.getEPackage(ARTISTTypesPackage.eNS_URI);

		// Obtain or create and register package
		ARTISTTypesPackageImpl theARTISTTypesPackage = (ARTISTTypesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof ARTISTTypesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new ARTISTTypesPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theARTISTTypesPackage.createPackageContents();

		// Initialize created meta-data
		theARTISTTypesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theARTISTTypesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(ARTISTTypesPackage.eNS_URI, theARTISTTypesPackage);
		return theARTISTTypesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCountry() {
		return countryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountry_Code() {
		return (EAttribute)countryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCountry_Name() {
		return (EAttribute)countryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCloudProvider() {
		return cloudProviderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProgrammingLanguage() {
		return programmingLanguageEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDBType() {
		return dbTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProvisioningType() {
		return provisioningTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ARTISTTypesFactory getARTISTTypesFactory() {
		return (ARTISTTypesFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-umlPackage objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		countryEClass = createEClass(COUNTRY);
		createEAttribute(countryEClass, COUNTRY__CODE);
		createEAttribute(countryEClass, COUNTRY__NAME);

		// Create enums
		cloudProviderEEnum = createEEnum(CLOUD_PROVIDER);
		programmingLanguageEEnum = createEEnum(PROGRAMMING_LANGUAGE);
		dbTypeEEnum = createEEnum(DB_TYPE);
		provisioningTypeEEnum = createEEnum(PROVISIONING_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-umlPackage.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(countryEClass, Country.class, "Country", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCountry_Code(), theTypesPackage.getString(), "code", null, 1, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getCountry_Name(), theTypesPackage.getString(), "name", null, 1, 1, Country.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(cloudProviderEEnum, CloudProvider.class, "CloudProvider");
		addEEnumLiteral(cloudProviderEEnum, CloudProvider.GOOGLE_APP_ENGINE);
		addEEnumLiteral(cloudProviderEEnum, CloudProvider.MICROSOFT_AZURE);
		addEEnumLiteral(cloudProviderEEnum, CloudProvider.AMAZON_EC2);

		initEEnum(programmingLanguageEEnum, ProgrammingLanguage.class, "ProgrammingLanguage");
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.JAVA);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.CSHARP);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.CPLUS_PLUS);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.RUBY);

		initEEnum(dbTypeEEnum, DBType.class, "DBType");
		addEEnumLiteral(dbTypeEEnum, DBType.SQL);
		addEEnumLiteral(dbTypeEEnum, DBType.NO_SQL);

		initEEnum(provisioningTypeEEnum, ProvisioningType.class, "ProvisioningType");
		addEEnumLiteral(provisioningTypeEEnum, ProvisioningType.PAA_S);
		addEEnumLiteral(provisioningTypeEEnum, ProvisioningType.IAA_S);
		addEEnumLiteral(provisioningTypeEEnum, ProvisioningType.SAA_S);
		addEEnumLiteral(provisioningTypeEEnum, ProvisioningType.HYBRID);

		// Create resource
		createResource(eNS_URI);
	}

} //ARTISTTypesPackageImpl
