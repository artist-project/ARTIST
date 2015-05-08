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
package eu.artist.postmigration.nfrvt.resources.types;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the umlPackage.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see eu.artist.postmigration.nfrvt.resources.types.ARTISTTypesFactory
 * @umlPackage kind="package"
 * @generated
 */
public interface ARTISTTypesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "types";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.artist.eu/postmigration/nfrvt/ARTIST_SimpleTypes";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "eu.artist.postmigration.nfrvt.resources.types";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	ARTISTTypesPackage eINSTANCE = eu.artist.postmigration.nfrvt.resources.types.impl.ARTISTTypesPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.artist.postmigration.nfrvt.resources.types.impl.CountryImpl <em>Country</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.postmigration.nfrvt.resources.types.impl.CountryImpl
	 * @see eu.artist.postmigration.nfrvt.resources.types.impl.ARTISTTypesPackageImpl#getCountry()
	 * @generated
	 */
	int COUNTRY = 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__CODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY__NAME = 1;

	/**
	 * The number of structural features of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Country</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUNTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.postmigration.nfrvt.resources.types.CloudProvider <em>Cloud Provider</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.postmigration.nfrvt.resources.types.CloudProvider
	 * @see eu.artist.postmigration.nfrvt.resources.types.impl.ARTISTTypesPackageImpl#getCloudProvider()
	 * @generated
	 */
	int CLOUD_PROVIDER = 1;

	/**
	 * The meta object id for the '{@link eu.artist.postmigration.nfrvt.resources.types.ProgrammingLanguage <em>Programming Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.postmigration.nfrvt.resources.types.ProgrammingLanguage
	 * @see eu.artist.postmigration.nfrvt.resources.types.impl.ARTISTTypesPackageImpl#getProgrammingLanguage()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE = 2;

	/**
	 * The meta object id for the '{@link eu.artist.postmigration.nfrvt.resources.types.DBType <em>DB Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.postmigration.nfrvt.resources.types.DBType
	 * @see eu.artist.postmigration.nfrvt.resources.types.impl.ARTISTTypesPackageImpl#getDBType()
	 * @generated
	 */
	int DB_TYPE = 3;

	/**
	 * The meta object id for the '{@link eu.artist.postmigration.nfrvt.resources.types.ProvisioningType <em>Provisioning Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.postmigration.nfrvt.resources.types.ProvisioningType
	 * @see eu.artist.postmigration.nfrvt.resources.types.impl.ARTISTTypesPackageImpl#getProvisioningType()
	 * @generated
	 */
	int PROVISIONING_TYPE = 4;


	/**
	 * Returns the meta object for class '{@link eu.artist.postmigration.nfrvt.resources.types.Country <em>Country</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Country</em>'.
	 * @see eu.artist.postmigration.nfrvt.resources.types.Country
	 * @generated
	 */
	EClass getCountry();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.resources.types.Country#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code</em>'.
	 * @see eu.artist.postmigration.nfrvt.resources.types.Country#getCode()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Code();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.postmigration.nfrvt.resources.types.Country#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see eu.artist.postmigration.nfrvt.resources.types.Country#getName()
	 * @see #getCountry()
	 * @generated
	 */
	EAttribute getCountry_Name();

	/**
	 * Returns the meta object for enum '{@link eu.artist.postmigration.nfrvt.resources.types.CloudProvider <em>Cloud Provider</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Cloud Provider</em>'.
	 * @see eu.artist.postmigration.nfrvt.resources.types.CloudProvider
	 * @generated
	 */
	EEnum getCloudProvider();

	/**
	 * Returns the meta object for enum '{@link eu.artist.postmigration.nfrvt.resources.types.ProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programming Language</em>'.
	 * @see eu.artist.postmigration.nfrvt.resources.types.ProgrammingLanguage
	 * @generated
	 */
	EEnum getProgrammingLanguage();

	/**
	 * Returns the meta object for enum '{@link eu.artist.postmigration.nfrvt.resources.types.DBType <em>DB Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>DB Type</em>'.
	 * @see eu.artist.postmigration.nfrvt.resources.types.DBType
	 * @generated
	 */
	EEnum getDBType();

	/**
	 * Returns the meta object for enum '{@link eu.artist.postmigration.nfrvt.resources.types.ProvisioningType <em>Provisioning Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Provisioning Type</em>'.
	 * @see eu.artist.postmigration.nfrvt.resources.types.ProvisioningType
	 * @generated
	 */
	EEnum getProvisioningType();

	/**
	 * Returns the factory that creates the instances of the umlPackage.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the umlPackage.
	 * @generated
	 */
	ARTISTTypesFactory getARTISTTypesFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.resources.types.impl.CountryImpl <em>Country</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.postmigration.nfrvt.resources.types.impl.CountryImpl
		 * @see eu.artist.postmigration.nfrvt.resources.types.impl.ARTISTTypesPackageImpl#getCountry()
		 * @generated
		 */
		EClass COUNTRY = eINSTANCE.getCountry();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__CODE = eINSTANCE.getCountry_Code();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUNTRY__NAME = eINSTANCE.getCountry_Name();

		/**
		 * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.resources.types.CloudProvider <em>Cloud Provider</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.postmigration.nfrvt.resources.types.CloudProvider
		 * @see eu.artist.postmigration.nfrvt.resources.types.impl.ARTISTTypesPackageImpl#getCloudProvider()
		 * @generated
		 */
		EEnum CLOUD_PROVIDER = eINSTANCE.getCloudProvider();

		/**
		 * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.resources.types.ProgrammingLanguage <em>Programming Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.postmigration.nfrvt.resources.types.ProgrammingLanguage
		 * @see eu.artist.postmigration.nfrvt.resources.types.impl.ARTISTTypesPackageImpl#getProgrammingLanguage()
		 * @generated
		 */
		EEnum PROGRAMMING_LANGUAGE = eINSTANCE.getProgrammingLanguage();

		/**
		 * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.resources.types.DBType <em>DB Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.postmigration.nfrvt.resources.types.DBType
		 * @see eu.artist.postmigration.nfrvt.resources.types.impl.ARTISTTypesPackageImpl#getDBType()
		 * @generated
		 */
		EEnum DB_TYPE = eINSTANCE.getDBType();

		/**
		 * The meta object literal for the '{@link eu.artist.postmigration.nfrvt.resources.types.ProvisioningType <em>Provisioning Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.postmigration.nfrvt.resources.types.ProvisioningType
		 * @see eu.artist.postmigration.nfrvt.resources.types.impl.ARTISTTypesPackageImpl#getProvisioningType()
		 * @generated
		 */
		EEnum PROVISIONING_TYPE = eINSTANCE.getProvisioningType();

	}

} //ARTISTTypesPackage
