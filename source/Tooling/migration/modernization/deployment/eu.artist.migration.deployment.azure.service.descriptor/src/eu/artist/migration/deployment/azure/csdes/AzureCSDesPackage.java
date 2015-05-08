/**
 */
package eu.artist.migration.deployment.azure.csdes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesFactory
 * @model kind="package"
 * @generated
 */
public interface AzureCSDesPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "csdes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://schemas.microsoft.com/developer/msbuild/2003";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "csdes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	AzureCSDesPackage eINSTANCE = eu.artist.migration.deployment.azure.csdes.impl.AzureCSDesPackageImpl.init();

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdes.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdes.impl.ProjectImpl
	 * @see eu.artist.migration.deployment.azure.csdes.impl.AzureCSDesPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Tools Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__TOOLS_VERSION = 0;

	/**
	 * The feature id for the '<em><b>Property Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PROPERTY_GROUP = 1;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl <em>Property Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl
	 * @see eu.artist.migration.deployment.azure.csdes.impl.AzureCSDesPackageImpl#getPropertyGroup()
	 * @generated
	 */
	int PROPERTY_GROUP = 1;

	/**
	 * The feature id for the '<em><b>Azure Credentials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP__AZURE_CREDENTIALS = 0;

	/**
	 * The feature id for the '<em><b>Azure Delete Deployment On Failure</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP__AZURE_DELETE_DEPLOYMENT_ON_FAILURE = 1;

	/**
	 * The feature id for the '<em><b>Azure Deployment Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP__AZURE_DEPLOYMENT_LABEL = 2;

	/**
	 * The feature id for the '<em><b>Azure Deployment Replacement Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP__AZURE_DEPLOYMENT_REPLACEMENT_METHOD = 3;

	/**
	 * The feature id for the '<em><b>Azure Slot</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP__AZURE_SLOT = 4;

	/**
	 * The feature id for the '<em><b>Azure Enable Remote Desktop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP__AZURE_ENABLE_REMOTE_DESKTOP = 5;

	/**
	 * The feature id for the '<em><b>Azure Enable Web Deploy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP__AZURE_ENABLE_WEB_DEPLOY = 6;

	/**
	 * The feature id for the '<em><b>Azure Fallback To Delete And Recreate If Upgrade Fails</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP__AZURE_FALLBACK_TO_DELETE_AND_RECREATE_IF_UPGRADE_FAILS = 7;

	/**
	 * The feature id for the '<em><b>Azure Hosted Service Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP__AZURE_HOSTED_SERVICE_LABEL = 8;

	/**
	 * The feature id for the '<em><b>Azure Hosted Service Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP__AZURE_HOSTED_SERVICE_NAME = 9;

	/**
	 * The feature id for the '<em><b>Azure Enable Intelli Trace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP__AZURE_ENABLE_INTELLI_TRACE = 10;

	/**
	 * The feature id for the '<em><b>Azure Enable Profiling</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP__AZURE_ENABLE_PROFILING = 11;

	/**
	 * The feature id for the '<em><b>Azure Service Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP__AZURE_SERVICE_CONFIGURATION = 12;

	/**
	 * The feature id for the '<em><b>Azure Solution Configuration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP__AZURE_SOLUTION_CONFIGURATION = 13;

	/**
	 * The feature id for the '<em><b>Azure Storage Account Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP__AZURE_STORAGE_ACCOUNT_LABEL = 14;

	/**
	 * The feature id for the '<em><b>Azure Storage Account Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP__AZURE_STORAGE_ACCOUNT_NAME = 15;

	/**
	 * The feature id for the '<em><b>Azure Append Timestamp To Deployment Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP__AZURE_APPEND_TIMESTAMP_TO_DEPLOYMENT_LABEL = 16;

	/**
	 * The number of structural features of the '<em>Property Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP_FEATURE_COUNT = 17;

	/**
	 * The number of operations of the '<em>Property Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_GROUP_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdes.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.Project#getToolsVersion <em>Tools Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Tools Version</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.Project#getToolsVersion()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_ToolsVersion();

	/**
	 * Returns the meta object for the containment reference '{@link eu.artist.migration.deployment.azure.csdes.Project#getPropertyGroup <em>Property Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Property Group</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.Project#getPropertyGroup()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_PropertyGroup();

	/**
	 * Returns the meta object for class '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup <em>Property Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Group</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup
	 * @generated
	 */
	EClass getPropertyGroup();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureCredentials <em>Azure Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Credentials</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureCredentials()
	 * @see #getPropertyGroup()
	 * @generated
	 */
	EAttribute getPropertyGroup_AzureCredentials();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureDeleteDeploymentOnFailure <em>Azure Delete Deployment On Failure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Delete Deployment On Failure</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureDeleteDeploymentOnFailure()
	 * @see #getPropertyGroup()
	 * @generated
	 */
	EAttribute getPropertyGroup_AzureDeleteDeploymentOnFailure();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureDeploymentLabel <em>Azure Deployment Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Deployment Label</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureDeploymentLabel()
	 * @see #getPropertyGroup()
	 * @generated
	 */
	EAttribute getPropertyGroup_AzureDeploymentLabel();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureDeploymentReplacementMethod <em>Azure Deployment Replacement Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Deployment Replacement Method</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureDeploymentReplacementMethod()
	 * @see #getPropertyGroup()
	 * @generated
	 */
	EAttribute getPropertyGroup_AzureDeploymentReplacementMethod();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureSlot <em>Azure Slot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Slot</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureSlot()
	 * @see #getPropertyGroup()
	 * @generated
	 */
	EAttribute getPropertyGroup_AzureSlot();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureEnableRemoteDesktop <em>Azure Enable Remote Desktop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Enable Remote Desktop</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureEnableRemoteDesktop()
	 * @see #getPropertyGroup()
	 * @generated
	 */
	EAttribute getPropertyGroup_AzureEnableRemoteDesktop();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureEnableWebDeploy <em>Azure Enable Web Deploy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Enable Web Deploy</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureEnableWebDeploy()
	 * @see #getPropertyGroup()
	 * @generated
	 */
	EAttribute getPropertyGroup_AzureEnableWebDeploy();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureFallbackToDeleteAndRecreateIfUpgradeFails <em>Azure Fallback To Delete And Recreate If Upgrade Fails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Fallback To Delete And Recreate If Upgrade Fails</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureFallbackToDeleteAndRecreateIfUpgradeFails()
	 * @see #getPropertyGroup()
	 * @generated
	 */
	EAttribute getPropertyGroup_AzureFallbackToDeleteAndRecreateIfUpgradeFails();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureHostedServiceLabel <em>Azure Hosted Service Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Hosted Service Label</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureHostedServiceLabel()
	 * @see #getPropertyGroup()
	 * @generated
	 */
	EAttribute getPropertyGroup_AzureHostedServiceLabel();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureHostedServiceName <em>Azure Hosted Service Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Hosted Service Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureHostedServiceName()
	 * @see #getPropertyGroup()
	 * @generated
	 */
	EAttribute getPropertyGroup_AzureHostedServiceName();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureEnableIntelliTrace <em>Azure Enable Intelli Trace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Enable Intelli Trace</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureEnableIntelliTrace()
	 * @see #getPropertyGroup()
	 * @generated
	 */
	EAttribute getPropertyGroup_AzureEnableIntelliTrace();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureEnableProfiling <em>Azure Enable Profiling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Enable Profiling</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureEnableProfiling()
	 * @see #getPropertyGroup()
	 * @generated
	 */
	EAttribute getPropertyGroup_AzureEnableProfiling();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureServiceConfiguration <em>Azure Service Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Service Configuration</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureServiceConfiguration()
	 * @see #getPropertyGroup()
	 * @generated
	 */
	EAttribute getPropertyGroup_AzureServiceConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureSolutionConfiguration <em>Azure Solution Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Solution Configuration</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureSolutionConfiguration()
	 * @see #getPropertyGroup()
	 * @generated
	 */
	EAttribute getPropertyGroup_AzureSolutionConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureStorageAccountLabel <em>Azure Storage Account Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Storage Account Label</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureStorageAccountLabel()
	 * @see #getPropertyGroup()
	 * @generated
	 */
	EAttribute getPropertyGroup_AzureStorageAccountLabel();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureStorageAccountName <em>Azure Storage Account Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Storage Account Name</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureStorageAccountName()
	 * @see #getPropertyGroup()
	 * @generated
	 */
	EAttribute getPropertyGroup_AzureStorageAccountName();

	/**
	 * Returns the meta object for the attribute '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureAppendTimestampToDeploymentLabel <em>Azure Append Timestamp To Deployment Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Azure Append Timestamp To Deployment Label</em>'.
	 * @see eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureAppendTimestampToDeploymentLabel()
	 * @see #getPropertyGroup()
	 * @generated
	 */
	EAttribute getPropertyGroup_AzureAppendTimestampToDeploymentLabel();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	AzureCSDesFactory getAzureCSDesFactory();

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
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdes.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdes.impl.ProjectImpl
		 * @see eu.artist.migration.deployment.azure.csdes.impl.AzureCSDesPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Tools Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__TOOLS_VERSION = eINSTANCE.getProject_ToolsVersion();

		/**
		 * The meta object literal for the '<em><b>Property Group</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PROPERTY_GROUP = eINSTANCE.getProject_PropertyGroup();

		/**
		 * The meta object literal for the '{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl <em>Property Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl
		 * @see eu.artist.migration.deployment.azure.csdes.impl.AzureCSDesPackageImpl#getPropertyGroup()
		 * @generated
		 */
		EClass PROPERTY_GROUP = eINSTANCE.getPropertyGroup();

		/**
		 * The meta object literal for the '<em><b>Azure Credentials</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GROUP__AZURE_CREDENTIALS = eINSTANCE.getPropertyGroup_AzureCredentials();

		/**
		 * The meta object literal for the '<em><b>Azure Delete Deployment On Failure</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GROUP__AZURE_DELETE_DEPLOYMENT_ON_FAILURE = eINSTANCE.getPropertyGroup_AzureDeleteDeploymentOnFailure();

		/**
		 * The meta object literal for the '<em><b>Azure Deployment Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GROUP__AZURE_DEPLOYMENT_LABEL = eINSTANCE.getPropertyGroup_AzureDeploymentLabel();

		/**
		 * The meta object literal for the '<em><b>Azure Deployment Replacement Method</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GROUP__AZURE_DEPLOYMENT_REPLACEMENT_METHOD = eINSTANCE.getPropertyGroup_AzureDeploymentReplacementMethod();

		/**
		 * The meta object literal for the '<em><b>Azure Slot</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GROUP__AZURE_SLOT = eINSTANCE.getPropertyGroup_AzureSlot();

		/**
		 * The meta object literal for the '<em><b>Azure Enable Remote Desktop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GROUP__AZURE_ENABLE_REMOTE_DESKTOP = eINSTANCE.getPropertyGroup_AzureEnableRemoteDesktop();

		/**
		 * The meta object literal for the '<em><b>Azure Enable Web Deploy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GROUP__AZURE_ENABLE_WEB_DEPLOY = eINSTANCE.getPropertyGroup_AzureEnableWebDeploy();

		/**
		 * The meta object literal for the '<em><b>Azure Fallback To Delete And Recreate If Upgrade Fails</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GROUP__AZURE_FALLBACK_TO_DELETE_AND_RECREATE_IF_UPGRADE_FAILS = eINSTANCE.getPropertyGroup_AzureFallbackToDeleteAndRecreateIfUpgradeFails();

		/**
		 * The meta object literal for the '<em><b>Azure Hosted Service Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GROUP__AZURE_HOSTED_SERVICE_LABEL = eINSTANCE.getPropertyGroup_AzureHostedServiceLabel();

		/**
		 * The meta object literal for the '<em><b>Azure Hosted Service Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GROUP__AZURE_HOSTED_SERVICE_NAME = eINSTANCE.getPropertyGroup_AzureHostedServiceName();

		/**
		 * The meta object literal for the '<em><b>Azure Enable Intelli Trace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GROUP__AZURE_ENABLE_INTELLI_TRACE = eINSTANCE.getPropertyGroup_AzureEnableIntelliTrace();

		/**
		 * The meta object literal for the '<em><b>Azure Enable Profiling</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GROUP__AZURE_ENABLE_PROFILING = eINSTANCE.getPropertyGroup_AzureEnableProfiling();

		/**
		 * The meta object literal for the '<em><b>Azure Service Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GROUP__AZURE_SERVICE_CONFIGURATION = eINSTANCE.getPropertyGroup_AzureServiceConfiguration();

		/**
		 * The meta object literal for the '<em><b>Azure Solution Configuration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GROUP__AZURE_SOLUTION_CONFIGURATION = eINSTANCE.getPropertyGroup_AzureSolutionConfiguration();

		/**
		 * The meta object literal for the '<em><b>Azure Storage Account Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GROUP__AZURE_STORAGE_ACCOUNT_LABEL = eINSTANCE.getPropertyGroup_AzureStorageAccountLabel();

		/**
		 * The meta object literal for the '<em><b>Azure Storage Account Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GROUP__AZURE_STORAGE_ACCOUNT_NAME = eINSTANCE.getPropertyGroup_AzureStorageAccountName();

		/**
		 * The meta object literal for the '<em><b>Azure Append Timestamp To Deployment Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_GROUP__AZURE_APPEND_TIMESTAMP_TO_DEPLOYMENT_LABEL = eINSTANCE.getPropertyGroup_AzureAppendTimestampToDeploymentLabel();

	}

} //AzureCSDesPackage
