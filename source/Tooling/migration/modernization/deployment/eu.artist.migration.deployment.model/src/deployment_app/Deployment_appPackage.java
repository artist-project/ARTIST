/**
 */
package deployment_app;

import deployment_provider.Deployment_providerPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see deployment_app.Deployment_appFactory
 * @model kind="package"
 * @generated
 */
public interface Deployment_appPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "deployment_app";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://deployment_app/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "deployment_app";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Deployment_appPackage eINSTANCE = deployment_app.impl.Deployment_appPackageImpl.init();

	/**
	 * The meta object id for the '{@link deployment_app.impl.CloudApplicationImpl <em>Cloud Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_app.impl.CloudApplicationImpl
	 * @see deployment_app.impl.Deployment_appPackageImpl#getCloudApplication()
	 * @generated
	 */
	int CLOUD_APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Deployment Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION__DEPLOYMENT_UNITS = 0;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION__LANGUAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION__NAME = 2;

	/**
	 * The feature id for the '<em><b>Required Frameworks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION__REQUIRED_FRAMEWORKS = 3;

	/**
	 * The feature id for the '<em><b>Hosted On Offering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION__HOSTED_ON_OFFERING = 4;

	/**
	 * The feature id for the '<em><b>Required Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION__REQUIRED_SERVICES = 5;

	/**
	 * The feature id for the '<em><b>Comprised Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION__COMPRISED_COMPONENTS = 6;

	/**
	 * The feature id for the '<em><b>Is Configured By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION__IS_CONFIGURED_BY = 7;

	/**
	 * The number of structural features of the '<em>Cloud Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION_FEATURE_COUNT = 8;

	/**
	 * The number of operations of the '<em>Cloud Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deployment_app.impl.CloudApplicationDeploymentUnitImpl <em>Cloud Application Deployment Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_app.impl.CloudApplicationDeploymentUnitImpl
	 * @see deployment_app.impl.Deployment_appPackageImpl#getCloudApplicationDeploymentUnit()
	 * @generated
	 */
	int CLOUD_APPLICATION_DEPLOYMENT_UNIT = 1;

	/**
	 * The feature id for the '<em><b>Is Configured By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION_DEPLOYMENT_UNIT__IS_CONFIGURED_BY = 0;

	/**
	 * The feature id for the '<em><b>Configure Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION_DEPLOYMENT_UNIT__CONFIGURE_SERVICES = 1;

	/**
	 * The number of structural features of the '<em>Cloud Application Deployment Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION_DEPLOYMENT_UNIT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cloud Application Deployment Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION_DEPLOYMENT_UNIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link deployment_app.impl.ApplicationComponentImpl <em>Application Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_app.impl.ApplicationComponentImpl
	 * @see deployment_app.impl.Deployment_appPackageImpl#getApplicationComponent()
	 * @generated
	 */
	int APPLICATION_COMPONENT = 2;

	/**
	 * The feature id for the '<em><b>Deployment Units</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__DEPLOYMENT_UNITS = CLOUD_APPLICATION__DEPLOYMENT_UNITS;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__LANGUAGE = CLOUD_APPLICATION__LANGUAGE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__NAME = CLOUD_APPLICATION__NAME;

	/**
	 * The feature id for the '<em><b>Required Frameworks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__REQUIRED_FRAMEWORKS = CLOUD_APPLICATION__REQUIRED_FRAMEWORKS;

	/**
	 * The feature id for the '<em><b>Hosted On Offering</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__HOSTED_ON_OFFERING = CLOUD_APPLICATION__HOSTED_ON_OFFERING;

	/**
	 * The feature id for the '<em><b>Required Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__REQUIRED_SERVICES = CLOUD_APPLICATION__REQUIRED_SERVICES;

	/**
	 * The feature id for the '<em><b>Comprised Components</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__COMPRISED_COMPONENTS = CLOUD_APPLICATION__COMPRISED_COMPONENTS;

	/**
	 * The feature id for the '<em><b>Is Configured By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT__IS_CONFIGURED_BY = CLOUD_APPLICATION__IS_CONFIGURED_BY;

	/**
	 * The number of structural features of the '<em>Application Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT_FEATURE_COUNT = CLOUD_APPLICATION_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_COMPONENT_OPERATION_COUNT = CLOUD_APPLICATION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deployment_app.impl.CloudApplicationPlatformDeploymentUnitImpl <em>Cloud Application Platform Deployment Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_app.impl.CloudApplicationPlatformDeploymentUnitImpl
	 * @see deployment_app.impl.Deployment_appPackageImpl#getCloudApplicationPlatformDeploymentUnit()
	 * @generated
	 */
	int CLOUD_APPLICATION_PLATFORM_DEPLOYMENT_UNIT = 3;

	/**
	 * The feature id for the '<em><b>Is Configured By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION_PLATFORM_DEPLOYMENT_UNIT__IS_CONFIGURED_BY = CLOUD_APPLICATION_DEPLOYMENT_UNIT__IS_CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Configure Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION_PLATFORM_DEPLOYMENT_UNIT__CONFIGURE_SERVICES = CLOUD_APPLICATION_DEPLOYMENT_UNIT__CONFIGURE_SERVICES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION_PLATFORM_DEPLOYMENT_UNIT__TYPE = CLOUD_APPLICATION_DEPLOYMENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cloud Application Platform Deployment Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION_PLATFORM_DEPLOYMENT_UNIT_FEATURE_COUNT = CLOUD_APPLICATION_DEPLOYMENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cloud Application Platform Deployment Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION_PLATFORM_DEPLOYMENT_UNIT_OPERATION_COUNT = CLOUD_APPLICATION_DEPLOYMENT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deployment_app.impl.CloudApplicationInfrastructureDeploymentUnitImpl <em>Cloud Application Infrastructure Deployment Unit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_app.impl.CloudApplicationInfrastructureDeploymentUnitImpl
	 * @see deployment_app.impl.Deployment_appPackageImpl#getCloudApplicationInfrastructureDeploymentUnit()
	 * @generated
	 */
	int CLOUD_APPLICATION_INFRASTRUCTURE_DEPLOYMENT_UNIT = 4;

	/**
	 * The feature id for the '<em><b>Is Configured By</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION_INFRASTRUCTURE_DEPLOYMENT_UNIT__IS_CONFIGURED_BY = CLOUD_APPLICATION_DEPLOYMENT_UNIT__IS_CONFIGURED_BY;

	/**
	 * The feature id for the '<em><b>Configure Services</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION_INFRASTRUCTURE_DEPLOYMENT_UNIT__CONFIGURE_SERVICES = CLOUD_APPLICATION_DEPLOYMENT_UNIT__CONFIGURE_SERVICES;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION_INFRASTRUCTURE_DEPLOYMENT_UNIT__TYPE = CLOUD_APPLICATION_DEPLOYMENT_UNIT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Cloud Application Infrastructure Deployment Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION_INFRASTRUCTURE_DEPLOYMENT_UNIT_FEATURE_COUNT = CLOUD_APPLICATION_DEPLOYMENT_UNIT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Cloud Application Infrastructure Deployment Unit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLOUD_APPLICATION_INFRASTRUCTURE_DEPLOYMENT_UNIT_OPERATION_COUNT = CLOUD_APPLICATION_DEPLOYMENT_UNIT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deployment_app.impl.ApplicationDescriptorImpl <em>Application Descriptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_app.impl.ApplicationDescriptorImpl
	 * @see deployment_app.impl.Deployment_appPackageImpl#getApplicationDescriptor()
	 * @generated
	 */
	int APPLICATION_DESCRIPTOR = 5;

	/**
	 * The feature id for the '<em><b>Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DESCRIPTOR__ENTRIES = Deployment_providerPackage.DESCRIPTOR__ENTRIES;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DESCRIPTOR__NAME = Deployment_providerPackage.DESCRIPTOR__NAME;

	/**
	 * The feature id for the '<em><b>Optional</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DESCRIPTOR__OPTIONAL = Deployment_providerPackage.DESCRIPTOR__OPTIONAL;

	/**
	 * The number of structural features of the '<em>Application Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DESCRIPTOR_FEATURE_COUNT = Deployment_providerPackage.DESCRIPTOR_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Application Descriptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DESCRIPTOR_OPERATION_COUNT = Deployment_providerPackage.DESCRIPTOR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link deployment_app.PlatformDeploymentUnitType <em>Platform Deployment Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_app.PlatformDeploymentUnitType
	 * @see deployment_app.impl.Deployment_appPackageImpl#getPlatformDeploymentUnitType()
	 * @generated
	 */
	int PLATFORM_DEPLOYMENT_UNIT_TYPE = 6;

	/**
	 * The meta object id for the '{@link deployment_app.ProgrammingLanguage <em>Programming Language</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_app.ProgrammingLanguage
	 * @see deployment_app.impl.Deployment_appPackageImpl#getProgrammingLanguage()
	 * @generated
	 */
	int PROGRAMMING_LANGUAGE = 7;

	/**
	 * The meta object id for the '{@link deployment_app.InfrastructureDeploymentUnitType <em>Infrastructure Deployment Unit Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see deployment_app.InfrastructureDeploymentUnitType
	 * @see deployment_app.impl.Deployment_appPackageImpl#getInfrastructureDeploymentUnitType()
	 * @generated
	 */
	int INFRASTRUCTURE_DEPLOYMENT_UNIT_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link deployment_app.CloudApplication <em>Cloud Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Application</em>'.
	 * @see deployment_app.CloudApplication
	 * @generated
	 */
	EClass getCloudApplication();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_app.CloudApplication#getDeploymentUnits <em>Deployment Units</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deployment Units</em>'.
	 * @see deployment_app.CloudApplication#getDeploymentUnits()
	 * @see #getCloudApplication()
	 * @generated
	 */
	EReference getCloudApplication_DeploymentUnits();

	/**
	 * Returns the meta object for the attribute '{@link deployment_app.CloudApplication#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see deployment_app.CloudApplication#getLanguage()
	 * @see #getCloudApplication()
	 * @generated
	 */
	EAttribute getCloudApplication_Language();

	/**
	 * Returns the meta object for the attribute '{@link deployment_app.CloudApplication#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see deployment_app.CloudApplication#getName()
	 * @see #getCloudApplication()
	 * @generated
	 */
	EAttribute getCloudApplication_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_app.CloudApplication#getRequiredFrameworks <em>Required Frameworks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Frameworks</em>'.
	 * @see deployment_app.CloudApplication#getRequiredFrameworks()
	 * @see #getCloudApplication()
	 * @generated
	 */
	EReference getCloudApplication_RequiredFrameworks();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_app.CloudApplication#getHostedOnOffering <em>Hosted On Offering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Hosted On Offering</em>'.
	 * @see deployment_app.CloudApplication#getHostedOnOffering()
	 * @see #getCloudApplication()
	 * @generated
	 */
	EReference getCloudApplication_HostedOnOffering();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_app.CloudApplication#getRequiredServices <em>Required Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Required Services</em>'.
	 * @see deployment_app.CloudApplication#getRequiredServices()
	 * @see #getCloudApplication()
	 * @generated
	 */
	EReference getCloudApplication_RequiredServices();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_app.CloudApplication#getComprisedComponents <em>Comprised Components</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Comprised Components</em>'.
	 * @see deployment_app.CloudApplication#getComprisedComponents()
	 * @see #getCloudApplication()
	 * @generated
	 */
	EReference getCloudApplication_ComprisedComponents();

	/**
	 * Returns the meta object for the reference list '{@link deployment_app.CloudApplication#getIsConfiguredBy <em>Is Configured By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Is Configured By</em>'.
	 * @see deployment_app.CloudApplication#getIsConfiguredBy()
	 * @see #getCloudApplication()
	 * @generated
	 */
	EReference getCloudApplication_IsConfiguredBy();

	/**
	 * Returns the meta object for class '{@link deployment_app.CloudApplicationDeploymentUnit <em>Cloud Application Deployment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Application Deployment Unit</em>'.
	 * @see deployment_app.CloudApplicationDeploymentUnit
	 * @generated
	 */
	EClass getCloudApplicationDeploymentUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_app.CloudApplicationDeploymentUnit#getIsConfiguredBy <em>Is Configured By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Is Configured By</em>'.
	 * @see deployment_app.CloudApplicationDeploymentUnit#getIsConfiguredBy()
	 * @see #getCloudApplicationDeploymentUnit()
	 * @generated
	 */
	EReference getCloudApplicationDeploymentUnit_IsConfiguredBy();

	/**
	 * Returns the meta object for the containment reference list '{@link deployment_app.CloudApplicationDeploymentUnit#getConfigureServices <em>Configure Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configure Services</em>'.
	 * @see deployment_app.CloudApplicationDeploymentUnit#getConfigureServices()
	 * @see #getCloudApplicationDeploymentUnit()
	 * @generated
	 */
	EReference getCloudApplicationDeploymentUnit_ConfigureServices();

	/**
	 * Returns the meta object for class '{@link deployment_app.ApplicationComponent <em>Application Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Component</em>'.
	 * @see deployment_app.ApplicationComponent
	 * @generated
	 */
	EClass getApplicationComponent();

	/**
	 * Returns the meta object for class '{@link deployment_app.CloudApplicationPlatformDeploymentUnit <em>Cloud Application Platform Deployment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Application Platform Deployment Unit</em>'.
	 * @see deployment_app.CloudApplicationPlatformDeploymentUnit
	 * @generated
	 */
	EClass getCloudApplicationPlatformDeploymentUnit();

	/**
	 * Returns the meta object for the attribute '{@link deployment_app.CloudApplicationPlatformDeploymentUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see deployment_app.CloudApplicationPlatformDeploymentUnit#getType()
	 * @see #getCloudApplicationPlatformDeploymentUnit()
	 * @generated
	 */
	EAttribute getCloudApplicationPlatformDeploymentUnit_Type();

	/**
	 * Returns the meta object for class '{@link deployment_app.CloudApplicationInfrastructureDeploymentUnit <em>Cloud Application Infrastructure Deployment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cloud Application Infrastructure Deployment Unit</em>'.
	 * @see deployment_app.CloudApplicationInfrastructureDeploymentUnit
	 * @generated
	 */
	EClass getCloudApplicationInfrastructureDeploymentUnit();

	/**
	 * Returns the meta object for the attribute '{@link deployment_app.CloudApplicationInfrastructureDeploymentUnit#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see deployment_app.CloudApplicationInfrastructureDeploymentUnit#getType()
	 * @see #getCloudApplicationInfrastructureDeploymentUnit()
	 * @generated
	 */
	EAttribute getCloudApplicationInfrastructureDeploymentUnit_Type();

	/**
	 * Returns the meta object for class '{@link deployment_app.ApplicationDescriptor <em>Application Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Descriptor</em>'.
	 * @see deployment_app.ApplicationDescriptor
	 * @generated
	 */
	EClass getApplicationDescriptor();

	/**
	 * Returns the meta object for enum '{@link deployment_app.PlatformDeploymentUnitType <em>Platform Deployment Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Platform Deployment Unit Type</em>'.
	 * @see deployment_app.PlatformDeploymentUnitType
	 * @generated
	 */
	EEnum getPlatformDeploymentUnitType();

	/**
	 * Returns the meta object for enum '{@link deployment_app.ProgrammingLanguage <em>Programming Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Programming Language</em>'.
	 * @see deployment_app.ProgrammingLanguage
	 * @generated
	 */
	EEnum getProgrammingLanguage();

	/**
	 * Returns the meta object for enum '{@link deployment_app.InfrastructureDeploymentUnitType <em>Infrastructure Deployment Unit Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Infrastructure Deployment Unit Type</em>'.
	 * @see deployment_app.InfrastructureDeploymentUnitType
	 * @generated
	 */
	EEnum getInfrastructureDeploymentUnitType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Deployment_appFactory getDeployment_appFactory();

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
		 * The meta object literal for the '{@link deployment_app.impl.CloudApplicationImpl <em>Cloud Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_app.impl.CloudApplicationImpl
		 * @see deployment_app.impl.Deployment_appPackageImpl#getCloudApplication()
		 * @generated
		 */
		EClass CLOUD_APPLICATION = eINSTANCE.getCloudApplication();

		/**
		 * The meta object literal for the '<em><b>Deployment Units</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_APPLICATION__DEPLOYMENT_UNITS = eINSTANCE.getCloudApplication_DeploymentUnits();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_APPLICATION__LANGUAGE = eINSTANCE.getCloudApplication_Language();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_APPLICATION__NAME = eINSTANCE.getCloudApplication_Name();

		/**
		 * The meta object literal for the '<em><b>Required Frameworks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_APPLICATION__REQUIRED_FRAMEWORKS = eINSTANCE.getCloudApplication_RequiredFrameworks();

		/**
		 * The meta object literal for the '<em><b>Hosted On Offering</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_APPLICATION__HOSTED_ON_OFFERING = eINSTANCE.getCloudApplication_HostedOnOffering();

		/**
		 * The meta object literal for the '<em><b>Required Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_APPLICATION__REQUIRED_SERVICES = eINSTANCE.getCloudApplication_RequiredServices();

		/**
		 * The meta object literal for the '<em><b>Comprised Components</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_APPLICATION__COMPRISED_COMPONENTS = eINSTANCE.getCloudApplication_ComprisedComponents();

		/**
		 * The meta object literal for the '<em><b>Is Configured By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_APPLICATION__IS_CONFIGURED_BY = eINSTANCE.getCloudApplication_IsConfiguredBy();

		/**
		 * The meta object literal for the '{@link deployment_app.impl.CloudApplicationDeploymentUnitImpl <em>Cloud Application Deployment Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_app.impl.CloudApplicationDeploymentUnitImpl
		 * @see deployment_app.impl.Deployment_appPackageImpl#getCloudApplicationDeploymentUnit()
		 * @generated
		 */
		EClass CLOUD_APPLICATION_DEPLOYMENT_UNIT = eINSTANCE.getCloudApplicationDeploymentUnit();

		/**
		 * The meta object literal for the '<em><b>Is Configured By</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_APPLICATION_DEPLOYMENT_UNIT__IS_CONFIGURED_BY = eINSTANCE.getCloudApplicationDeploymentUnit_IsConfiguredBy();

		/**
		 * The meta object literal for the '<em><b>Configure Services</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLOUD_APPLICATION_DEPLOYMENT_UNIT__CONFIGURE_SERVICES = eINSTANCE.getCloudApplicationDeploymentUnit_ConfigureServices();

		/**
		 * The meta object literal for the '{@link deployment_app.impl.ApplicationComponentImpl <em>Application Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_app.impl.ApplicationComponentImpl
		 * @see deployment_app.impl.Deployment_appPackageImpl#getApplicationComponent()
		 * @generated
		 */
		EClass APPLICATION_COMPONENT = eINSTANCE.getApplicationComponent();

		/**
		 * The meta object literal for the '{@link deployment_app.impl.CloudApplicationPlatformDeploymentUnitImpl <em>Cloud Application Platform Deployment Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_app.impl.CloudApplicationPlatformDeploymentUnitImpl
		 * @see deployment_app.impl.Deployment_appPackageImpl#getCloudApplicationPlatformDeploymentUnit()
		 * @generated
		 */
		EClass CLOUD_APPLICATION_PLATFORM_DEPLOYMENT_UNIT = eINSTANCE.getCloudApplicationPlatformDeploymentUnit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_APPLICATION_PLATFORM_DEPLOYMENT_UNIT__TYPE = eINSTANCE.getCloudApplicationPlatformDeploymentUnit_Type();

		/**
		 * The meta object literal for the '{@link deployment_app.impl.CloudApplicationInfrastructureDeploymentUnitImpl <em>Cloud Application Infrastructure Deployment Unit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_app.impl.CloudApplicationInfrastructureDeploymentUnitImpl
		 * @see deployment_app.impl.Deployment_appPackageImpl#getCloudApplicationInfrastructureDeploymentUnit()
		 * @generated
		 */
		EClass CLOUD_APPLICATION_INFRASTRUCTURE_DEPLOYMENT_UNIT = eINSTANCE.getCloudApplicationInfrastructureDeploymentUnit();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLOUD_APPLICATION_INFRASTRUCTURE_DEPLOYMENT_UNIT__TYPE = eINSTANCE.getCloudApplicationInfrastructureDeploymentUnit_Type();

		/**
		 * The meta object literal for the '{@link deployment_app.impl.ApplicationDescriptorImpl <em>Application Descriptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_app.impl.ApplicationDescriptorImpl
		 * @see deployment_app.impl.Deployment_appPackageImpl#getApplicationDescriptor()
		 * @generated
		 */
		EClass APPLICATION_DESCRIPTOR = eINSTANCE.getApplicationDescriptor();

		/**
		 * The meta object literal for the '{@link deployment_app.PlatformDeploymentUnitType <em>Platform Deployment Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_app.PlatformDeploymentUnitType
		 * @see deployment_app.impl.Deployment_appPackageImpl#getPlatformDeploymentUnitType()
		 * @generated
		 */
		EEnum PLATFORM_DEPLOYMENT_UNIT_TYPE = eINSTANCE.getPlatformDeploymentUnitType();

		/**
		 * The meta object literal for the '{@link deployment_app.ProgrammingLanguage <em>Programming Language</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_app.ProgrammingLanguage
		 * @see deployment_app.impl.Deployment_appPackageImpl#getProgrammingLanguage()
		 * @generated
		 */
		EEnum PROGRAMMING_LANGUAGE = eINSTANCE.getProgrammingLanguage();

		/**
		 * The meta object literal for the '{@link deployment_app.InfrastructureDeploymentUnitType <em>Infrastructure Deployment Unit Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see deployment_app.InfrastructureDeploymentUnitType
		 * @see deployment_app.impl.Deployment_appPackageImpl#getInfrastructureDeploymentUnitType()
		 * @generated
		 */
		EEnum INFRASTRUCTURE_DEPLOYMENT_UNIT_TYPE = eINSTANCE.getInfrastructureDeploymentUnitType();

	}

} //Deployment_appPackage
