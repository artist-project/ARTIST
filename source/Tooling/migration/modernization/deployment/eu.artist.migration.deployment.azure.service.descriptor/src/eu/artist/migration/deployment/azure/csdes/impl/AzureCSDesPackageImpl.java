/**
 */
package eu.artist.migration.deployment.azure.csdes.impl;

import eu.artist.migration.deployment.azure.csdes.AzureCSDesFactory;
import eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage;
import eu.artist.migration.deployment.azure.csdes.Project;
import eu.artist.migration.deployment.azure.csdes.PropertyGroup;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AzureCSDesPackageImpl extends EPackageImpl implements AzureCSDesPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyGroupEClass = null;

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
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private AzureCSDesPackageImpl() {
		super(eNS_URI, AzureCSDesFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link AzureCSDesPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static AzureCSDesPackage init() {
		if (isInited) return (AzureCSDesPackage)EPackage.Registry.INSTANCE.getEPackage(AzureCSDesPackage.eNS_URI);

		// Obtain or create and register package
		AzureCSDesPackageImpl theAzureCSDesPackage = (AzureCSDesPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AzureCSDesPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AzureCSDesPackageImpl());

		isInited = true;

		// Create package meta-data objects
		theAzureCSDesPackage.createPackageContents();

		// Initialize created meta-data
		theAzureCSDesPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theAzureCSDesPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(AzureCSDesPackage.eNS_URI, theAzureCSDesPackage);
		return theAzureCSDesPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProject() {
		return projectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProject_ToolsVersion() {
		return (EAttribute)projectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProject_PropertyGroup() {
		return (EReference)projectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyGroup() {
		return propertyGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_AzureCredentials() {
		return (EAttribute)propertyGroupEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_AzureDeleteDeploymentOnFailure() {
		return (EAttribute)propertyGroupEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_AzureDeploymentLabel() {
		return (EAttribute)propertyGroupEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_AzureDeploymentReplacementMethod() {
		return (EAttribute)propertyGroupEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_AzureSlot() {
		return (EAttribute)propertyGroupEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_AzureEnableRemoteDesktop() {
		return (EAttribute)propertyGroupEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_AzureEnableWebDeploy() {
		return (EAttribute)propertyGroupEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_AzureFallbackToDeleteAndRecreateIfUpgradeFails() {
		return (EAttribute)propertyGroupEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_AzureHostedServiceLabel() {
		return (EAttribute)propertyGroupEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_AzureHostedServiceName() {
		return (EAttribute)propertyGroupEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_AzureEnableIntelliTrace() {
		return (EAttribute)propertyGroupEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_AzureEnableProfiling() {
		return (EAttribute)propertyGroupEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_AzureServiceConfiguration() {
		return (EAttribute)propertyGroupEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_AzureSolutionConfiguration() {
		return (EAttribute)propertyGroupEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_AzureStorageAccountLabel() {
		return (EAttribute)propertyGroupEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_AzureStorageAccountName() {
		return (EAttribute)propertyGroupEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyGroup_AzureAppendTimestampToDeploymentLabel() {
		return (EAttribute)propertyGroupEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AzureCSDesFactory getAzureCSDesFactory() {
		return (AzureCSDesFactory)getEFactoryInstance();
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
		projectEClass = createEClass(PROJECT);
		createEAttribute(projectEClass, PROJECT__TOOLS_VERSION);
		createEReference(projectEClass, PROJECT__PROPERTY_GROUP);

		propertyGroupEClass = createEClass(PROPERTY_GROUP);
		createEAttribute(propertyGroupEClass, PROPERTY_GROUP__AZURE_CREDENTIALS);
		createEAttribute(propertyGroupEClass, PROPERTY_GROUP__AZURE_DELETE_DEPLOYMENT_ON_FAILURE);
		createEAttribute(propertyGroupEClass, PROPERTY_GROUP__AZURE_DEPLOYMENT_LABEL);
		createEAttribute(propertyGroupEClass, PROPERTY_GROUP__AZURE_DEPLOYMENT_REPLACEMENT_METHOD);
		createEAttribute(propertyGroupEClass, PROPERTY_GROUP__AZURE_SLOT);
		createEAttribute(propertyGroupEClass, PROPERTY_GROUP__AZURE_ENABLE_REMOTE_DESKTOP);
		createEAttribute(propertyGroupEClass, PROPERTY_GROUP__AZURE_ENABLE_WEB_DEPLOY);
		createEAttribute(propertyGroupEClass, PROPERTY_GROUP__AZURE_FALLBACK_TO_DELETE_AND_RECREATE_IF_UPGRADE_FAILS);
		createEAttribute(propertyGroupEClass, PROPERTY_GROUP__AZURE_HOSTED_SERVICE_LABEL);
		createEAttribute(propertyGroupEClass, PROPERTY_GROUP__AZURE_HOSTED_SERVICE_NAME);
		createEAttribute(propertyGroupEClass, PROPERTY_GROUP__AZURE_ENABLE_INTELLI_TRACE);
		createEAttribute(propertyGroupEClass, PROPERTY_GROUP__AZURE_ENABLE_PROFILING);
		createEAttribute(propertyGroupEClass, PROPERTY_GROUP__AZURE_SERVICE_CONFIGURATION);
		createEAttribute(propertyGroupEClass, PROPERTY_GROUP__AZURE_SOLUTION_CONFIGURATION);
		createEAttribute(propertyGroupEClass, PROPERTY_GROUP__AZURE_STORAGE_ACCOUNT_LABEL);
		createEAttribute(propertyGroupEClass, PROPERTY_GROUP__AZURE_STORAGE_ACCOUNT_NAME);
		createEAttribute(propertyGroupEClass, PROPERTY_GROUP__AZURE_APPEND_TIMESTAMP_TO_DEPLOYMENT_LABEL);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(projectEClass, Project.class, "Project", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProject_ToolsVersion(), ecorePackage.getEString(), "ToolsVersion", "12.0", 1, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getProject_PropertyGroup(), this.getPropertyGroup(), null, "PropertyGroup", null, 0, 1, Project.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyGroupEClass, PropertyGroup.class, "PropertyGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyGroup_AzureCredentials(), ecorePackage.getEString(), "AzureCredentials", null, 0, 1, PropertyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGroup_AzureDeleteDeploymentOnFailure(), ecorePackage.getEBoolean(), "AzureDeleteDeploymentOnFailure", "false", 0, 1, PropertyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGroup_AzureDeploymentLabel(), ecorePackage.getEString(), "AzureDeploymentLabel", "", 0, 1, PropertyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGroup_AzureDeploymentReplacementMethod(), ecorePackage.getEString(), "AzureDeploymentReplacementMethod", "AutomaticUpgrade", 0, 1, PropertyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGroup_AzureSlot(), ecorePackage.getEString(), "AzureSlot", "", 0, 1, PropertyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGroup_AzureEnableRemoteDesktop(), ecorePackage.getEBoolean(), "AzureEnableRemoteDesktop", "true", 0, 1, PropertyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGroup_AzureEnableWebDeploy(), ecorePackage.getEBoolean(), "AzureEnableWebDeploy", "false", 0, 1, PropertyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGroup_AzureFallbackToDeleteAndRecreateIfUpgradeFails(), ecorePackage.getEString(), "AzureFallbackToDeleteAndRecreateIfUpgradeFails", "False", 0, 1, PropertyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGroup_AzureHostedServiceLabel(), ecorePackage.getEString(), "AzureHostedServiceLabel", "", 0, 1, PropertyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGroup_AzureHostedServiceName(), ecorePackage.getEString(), "AzureHostedServiceName", "", 0, 1, PropertyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGroup_AzureEnableIntelliTrace(), ecorePackage.getEBoolean(), "AzureEnableIntelliTrace", "False", 0, 1, PropertyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGroup_AzureEnableProfiling(), ecorePackage.getEBoolean(), "AzureEnableProfiling", "False", 0, 1, PropertyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGroup_AzureServiceConfiguration(), ecorePackage.getEString(), "AzureServiceConfiguration", "", 0, 1, PropertyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGroup_AzureSolutionConfiguration(), ecorePackage.getEString(), "AzureSolutionConfiguration", "False", 0, 1, PropertyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGroup_AzureStorageAccountLabel(), ecorePackage.getEString(), "AzureStorageAccountLabel", null, 0, 1, PropertyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGroup_AzureStorageAccountName(), ecorePackage.getEString(), "AzureStorageAccountName", null, 0, 1, PropertyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyGroup_AzureAppendTimestampToDeploymentLabel(), ecorePackage.getEBoolean(), "AzureAppendTimestampToDeploymentLabel", "true", 0, 1, PropertyGroup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //AzureCSDesPackageImpl
