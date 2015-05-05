/**
 */
package deployment_app.impl;

import deployment_app.ApplicationComponent;
import deployment_app.ApplicationDescriptor;
import deployment_app.CloudApplication;
import deployment_app.CloudApplicationDeploymentUnit;
import deployment_app.CloudApplicationInfrastructureDeploymentUnit;
import deployment_app.CloudApplicationPlatformDeploymentUnit;
import deployment_app.Deployment_appFactory;
import deployment_app.Deployment_appPackage;
import deployment_app.InfrastructureDeploymentUnitType;
import deployment_app.PlatformDeploymentUnitType;
import deployment_app.ProgrammingLanguage;

import deployment_provider.Deployment_providerPackage;

import deployment_provider.impl.Deployment_providerPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Deployment_appPackageImpl extends EPackageImpl implements Deployment_appPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudApplicationDeploymentUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudApplicationPlatformDeploymentUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cloudApplicationInfrastructureDeploymentUnitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationDescriptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum platformDeploymentUnitTypeEEnum = null;

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
	private EEnum infrastructureDeploymentUnitTypeEEnum = null;

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
	 * @see deployment_app.Deployment_appPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Deployment_appPackageImpl() {
		super(eNS_URI, Deployment_appFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Deployment_appPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Deployment_appPackage init() {
		if (isInited) return (Deployment_appPackage)EPackage.Registry.INSTANCE.getEPackage(Deployment_appPackage.eNS_URI);

		// Obtain or create and register package
		Deployment_appPackageImpl theDeployment_appPackage = (Deployment_appPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Deployment_appPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Deployment_appPackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		Deployment_providerPackageImpl theDeployment_providerPackage = (Deployment_providerPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(Deployment_providerPackage.eNS_URI) instanceof Deployment_providerPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(Deployment_providerPackage.eNS_URI) : Deployment_providerPackage.eINSTANCE);

		// Create package meta-data objects
		theDeployment_appPackage.createPackageContents();
		theDeployment_providerPackage.createPackageContents();

		// Initialize created meta-data
		theDeployment_appPackage.initializePackageContents();
		theDeployment_providerPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDeployment_appPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Deployment_appPackage.eNS_URI, theDeployment_appPackage);
		return theDeployment_appPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudApplication() {
		return cloudApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudApplication_DeploymentUnits() {
		return (EReference)cloudApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudApplication_Language() {
		return (EAttribute)cloudApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudApplication_Name() {
		return (EAttribute)cloudApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudApplication_RequiredFrameworks() {
		return (EReference)cloudApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudApplication_HostedOnOffering() {
		return (EReference)cloudApplicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudApplication_RequiredServices() {
		return (EReference)cloudApplicationEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudApplication_ComprisedComponents() {
		return (EReference)cloudApplicationEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudApplication_IsConfiguredBy() {
		return (EReference)cloudApplicationEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudApplicationDeploymentUnit() {
		return cloudApplicationDeploymentUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudApplicationDeploymentUnit_IsConfiguredBy() {
		return (EReference)cloudApplicationDeploymentUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCloudApplicationDeploymentUnit_ConfigureServices() {
		return (EReference)cloudApplicationDeploymentUnitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationComponent() {
		return applicationComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudApplicationPlatformDeploymentUnit() {
		return cloudApplicationPlatformDeploymentUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudApplicationPlatformDeploymentUnit_Type() {
		return (EAttribute)cloudApplicationPlatformDeploymentUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCloudApplicationInfrastructureDeploymentUnit() {
		return cloudApplicationInfrastructureDeploymentUnitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCloudApplicationInfrastructureDeploymentUnit_Type() {
		return (EAttribute)cloudApplicationInfrastructureDeploymentUnitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationDescriptor() {
		return applicationDescriptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlatformDeploymentUnitType() {
		return platformDeploymentUnitTypeEEnum;
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
	public EEnum getInfrastructureDeploymentUnitType() {
		return infrastructureDeploymentUnitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment_appFactory getDeployment_appFactory() {
		return (Deployment_appFactory)getEFactoryInstance();
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
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cloudApplicationEClass = createEClass(CLOUD_APPLICATION);
		createEReference(cloudApplicationEClass, CLOUD_APPLICATION__DEPLOYMENT_UNITS);
		createEAttribute(cloudApplicationEClass, CLOUD_APPLICATION__LANGUAGE);
		createEAttribute(cloudApplicationEClass, CLOUD_APPLICATION__NAME);
		createEReference(cloudApplicationEClass, CLOUD_APPLICATION__REQUIRED_FRAMEWORKS);
		createEReference(cloudApplicationEClass, CLOUD_APPLICATION__HOSTED_ON_OFFERING);
		createEReference(cloudApplicationEClass, CLOUD_APPLICATION__REQUIRED_SERVICES);
		createEReference(cloudApplicationEClass, CLOUD_APPLICATION__COMPRISED_COMPONENTS);
		createEReference(cloudApplicationEClass, CLOUD_APPLICATION__IS_CONFIGURED_BY);

		cloudApplicationDeploymentUnitEClass = createEClass(CLOUD_APPLICATION_DEPLOYMENT_UNIT);
		createEReference(cloudApplicationDeploymentUnitEClass, CLOUD_APPLICATION_DEPLOYMENT_UNIT__IS_CONFIGURED_BY);
		createEReference(cloudApplicationDeploymentUnitEClass, CLOUD_APPLICATION_DEPLOYMENT_UNIT__CONFIGURE_SERVICES);

		applicationComponentEClass = createEClass(APPLICATION_COMPONENT);

		cloudApplicationPlatformDeploymentUnitEClass = createEClass(CLOUD_APPLICATION_PLATFORM_DEPLOYMENT_UNIT);
		createEAttribute(cloudApplicationPlatformDeploymentUnitEClass, CLOUD_APPLICATION_PLATFORM_DEPLOYMENT_UNIT__TYPE);

		cloudApplicationInfrastructureDeploymentUnitEClass = createEClass(CLOUD_APPLICATION_INFRASTRUCTURE_DEPLOYMENT_UNIT);
		createEAttribute(cloudApplicationInfrastructureDeploymentUnitEClass, CLOUD_APPLICATION_INFRASTRUCTURE_DEPLOYMENT_UNIT__TYPE);

		applicationDescriptorEClass = createEClass(APPLICATION_DESCRIPTOR);

		// Create enums
		platformDeploymentUnitTypeEEnum = createEEnum(PLATFORM_DEPLOYMENT_UNIT_TYPE);
		programmingLanguageEEnum = createEEnum(PROGRAMMING_LANGUAGE);
		infrastructureDeploymentUnitTypeEEnum = createEEnum(INFRASTRUCTURE_DEPLOYMENT_UNIT_TYPE);
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
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		Deployment_providerPackage theDeployment_providerPackage = (Deployment_providerPackage)EPackage.Registry.INSTANCE.getEPackage(Deployment_providerPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		applicationComponentEClass.getESuperTypes().add(this.getCloudApplication());
		cloudApplicationPlatformDeploymentUnitEClass.getESuperTypes().add(this.getCloudApplicationDeploymentUnit());
		cloudApplicationInfrastructureDeploymentUnitEClass.getESuperTypes().add(this.getCloudApplicationDeploymentUnit());
		applicationDescriptorEClass.getESuperTypes().add(theDeployment_providerPackage.getDescriptor());

		// Initialize classes, features, and operations; add parameters
		initEClass(cloudApplicationEClass, CloudApplication.class, "CloudApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudApplication_DeploymentUnits(), this.getCloudApplicationDeploymentUnit(), null, "deploymentUnits", null, 1, -1, CloudApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudApplication_Language(), this.getProgrammingLanguage(), "language", null, 0, 1, CloudApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCloudApplication_Name(), ecorePackage.getEString(), "name", null, 0, 1, CloudApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudApplication_RequiredFrameworks(), theDeployment_providerPackage.getApplicationFramework(), null, "requiredFrameworks", null, 0, -1, CloudApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudApplication_HostedOnOffering(), theDeployment_providerPackage.getCloudOffering(), null, "hostedOnOffering", null, 0, -1, CloudApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudApplication_RequiredServices(), theDeployment_providerPackage.getCloudService(), null, "requiredServices", null, 0, -1, CloudApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudApplication_ComprisedComponents(), this.getApplicationComponent(), null, "comprisedComponents", null, 0, -1, CloudApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudApplication_IsConfiguredBy(), this.getApplicationDescriptor(), null, "isConfiguredBy", null, 0, -1, CloudApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudApplicationDeploymentUnitEClass, CloudApplicationDeploymentUnit.class, "CloudApplicationDeploymentUnit", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCloudApplicationDeploymentUnit_IsConfiguredBy(), theDeployment_providerPackage.getDeploymentDescriptor(), null, "isConfiguredBy", null, 1, -1, CloudApplicationDeploymentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCloudApplicationDeploymentUnit_ConfigureServices(), theDeployment_providerPackage.getServiceConfigurationDescriptor(), null, "configureServices", null, 0, -1, CloudApplicationDeploymentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationComponentEClass, ApplicationComponent.class, "ApplicationComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cloudApplicationPlatformDeploymentUnitEClass, CloudApplicationPlatformDeploymentUnit.class, "CloudApplicationPlatformDeploymentUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudApplicationPlatformDeploymentUnit_Type(), this.getPlatformDeploymentUnitType(), "type", null, 1, 1, CloudApplicationPlatformDeploymentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cloudApplicationInfrastructureDeploymentUnitEClass, CloudApplicationInfrastructureDeploymentUnit.class, "CloudApplicationInfrastructureDeploymentUnit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCloudApplicationInfrastructureDeploymentUnit_Type(), this.getInfrastructureDeploymentUnitType(), "type", null, 1, 1, CloudApplicationInfrastructureDeploymentUnit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationDescriptorEClass, ApplicationDescriptor.class, "ApplicationDescriptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(platformDeploymentUnitTypeEEnum, PlatformDeploymentUnitType.class, "PlatformDeploymentUnitType");
		addEEnumLiteral(platformDeploymentUnitTypeEEnum, PlatformDeploymentUnitType.WAR);
		addEEnumLiteral(platformDeploymentUnitTypeEEnum, PlatformDeploymentUnitType.EAR);
		addEEnumLiteral(platformDeploymentUnitTypeEEnum, PlatformDeploymentUnitType.ZIP);
		addEEnumLiteral(platformDeploymentUnitTypeEEnum, PlatformDeploymentUnitType.GIT);
		addEEnumLiteral(platformDeploymentUnitTypeEEnum, PlatformDeploymentUnitType.SVN);
		addEEnumLiteral(platformDeploymentUnitTypeEEnum, PlatformDeploymentUnitType.DOT_NET_ASSEMBLY);
		addEEnumLiteral(platformDeploymentUnitTypeEEnum, PlatformDeploymentUnitType.FOLDER);

		initEEnum(programmingLanguageEEnum, ProgrammingLanguage.class, "ProgrammingLanguage");
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.C);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.CSHARP);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.GO);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.JAVA);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.PYTHON);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.PHP);
		addEEnumLiteral(programmingLanguageEEnum, ProgrammingLanguage.RUBY);

		initEEnum(infrastructureDeploymentUnitTypeEEnum, InfrastructureDeploymentUnitType.class, "InfrastructureDeploymentUnitType");
		addEEnumLiteral(infrastructureDeploymentUnitTypeEEnum, InfrastructureDeploymentUnitType.OVF);
		addEEnumLiteral(infrastructureDeploymentUnitTypeEEnum, InfrastructureDeploymentUnitType.VHD);

		// Create resource
		createResource(eNS_URI);
	}

} //Deployment_appPackageImpl
