/**
 */
package eu.artist.migration.deployment.azure.csdes.impl;

import eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage;
import eu.artist.migration.deployment.azure.csdes.PropertyGroup;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl#getAzureCredentials <em>Azure Credentials</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl#isAzureDeleteDeploymentOnFailure <em>Azure Delete Deployment On Failure</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl#getAzureDeploymentLabel <em>Azure Deployment Label</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl#getAzureDeploymentReplacementMethod <em>Azure Deployment Replacement Method</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl#getAzureSlot <em>Azure Slot</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl#isAzureEnableRemoteDesktop <em>Azure Enable Remote Desktop</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl#isAzureEnableWebDeploy <em>Azure Enable Web Deploy</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl#getAzureFallbackToDeleteAndRecreateIfUpgradeFails <em>Azure Fallback To Delete And Recreate If Upgrade Fails</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl#getAzureHostedServiceLabel <em>Azure Hosted Service Label</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl#getAzureHostedServiceName <em>Azure Hosted Service Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl#isAzureEnableIntelliTrace <em>Azure Enable Intelli Trace</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl#isAzureEnableProfiling <em>Azure Enable Profiling</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl#getAzureServiceConfiguration <em>Azure Service Configuration</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl#getAzureSolutionConfiguration <em>Azure Solution Configuration</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl#getAzureStorageAccountLabel <em>Azure Storage Account Label</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl#getAzureStorageAccountName <em>Azure Storage Account Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.impl.PropertyGroupImpl#isAzureAppendTimestampToDeploymentLabel <em>Azure Append Timestamp To Deployment Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PropertyGroupImpl extends MinimalEObjectImpl.Container implements PropertyGroup {
	/**
	 * The default value of the '{@link #getAzureCredentials() <em>Azure Credentials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureCredentials()
	 * @generated
	 * @ordered
	 */
	protected static final String AZURE_CREDENTIALS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAzureCredentials() <em>Azure Credentials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureCredentials()
	 * @generated
	 * @ordered
	 */
	protected String azureCredentials = AZURE_CREDENTIALS_EDEFAULT;

	/**
	 * The default value of the '{@link #isAzureDeleteDeploymentOnFailure() <em>Azure Delete Deployment On Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAzureDeleteDeploymentOnFailure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AZURE_DELETE_DEPLOYMENT_ON_FAILURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAzureDeleteDeploymentOnFailure() <em>Azure Delete Deployment On Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAzureDeleteDeploymentOnFailure()
	 * @generated
	 * @ordered
	 */
	protected boolean azureDeleteDeploymentOnFailure = AZURE_DELETE_DEPLOYMENT_ON_FAILURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzureDeploymentLabel() <em>Azure Deployment Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureDeploymentLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String AZURE_DEPLOYMENT_LABEL_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAzureDeploymentLabel() <em>Azure Deployment Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureDeploymentLabel()
	 * @generated
	 * @ordered
	 */
	protected String azureDeploymentLabel = AZURE_DEPLOYMENT_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzureDeploymentReplacementMethod() <em>Azure Deployment Replacement Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureDeploymentReplacementMethod()
	 * @generated
	 * @ordered
	 */
	protected static final String AZURE_DEPLOYMENT_REPLACEMENT_METHOD_EDEFAULT = "AutomaticUpgrade";

	/**
	 * The cached value of the '{@link #getAzureDeploymentReplacementMethod() <em>Azure Deployment Replacement Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureDeploymentReplacementMethod()
	 * @generated
	 * @ordered
	 */
	protected String azureDeploymentReplacementMethod = AZURE_DEPLOYMENT_REPLACEMENT_METHOD_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzureSlot() <em>Azure Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureSlot()
	 * @generated
	 * @ordered
	 */
	protected static final String AZURE_SLOT_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAzureSlot() <em>Azure Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureSlot()
	 * @generated
	 * @ordered
	 */
	protected String azureSlot = AZURE_SLOT_EDEFAULT;

	/**
	 * The default value of the '{@link #isAzureEnableRemoteDesktop() <em>Azure Enable Remote Desktop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAzureEnableRemoteDesktop()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AZURE_ENABLE_REMOTE_DESKTOP_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAzureEnableRemoteDesktop() <em>Azure Enable Remote Desktop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAzureEnableRemoteDesktop()
	 * @generated
	 * @ordered
	 */
	protected boolean azureEnableRemoteDesktop = AZURE_ENABLE_REMOTE_DESKTOP_EDEFAULT;

	/**
	 * The default value of the '{@link #isAzureEnableWebDeploy() <em>Azure Enable Web Deploy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAzureEnableWebDeploy()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AZURE_ENABLE_WEB_DEPLOY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAzureEnableWebDeploy() <em>Azure Enable Web Deploy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAzureEnableWebDeploy()
	 * @generated
	 * @ordered
	 */
	protected boolean azureEnableWebDeploy = AZURE_ENABLE_WEB_DEPLOY_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzureFallbackToDeleteAndRecreateIfUpgradeFails() <em>Azure Fallback To Delete And Recreate If Upgrade Fails</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureFallbackToDeleteAndRecreateIfUpgradeFails()
	 * @generated
	 * @ordered
	 */
	protected static final String AZURE_FALLBACK_TO_DELETE_AND_RECREATE_IF_UPGRADE_FAILS_EDEFAULT = "False";

	/**
	 * The cached value of the '{@link #getAzureFallbackToDeleteAndRecreateIfUpgradeFails() <em>Azure Fallback To Delete And Recreate If Upgrade Fails</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureFallbackToDeleteAndRecreateIfUpgradeFails()
	 * @generated
	 * @ordered
	 */
	protected String azureFallbackToDeleteAndRecreateIfUpgradeFails = AZURE_FALLBACK_TO_DELETE_AND_RECREATE_IF_UPGRADE_FAILS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzureHostedServiceLabel() <em>Azure Hosted Service Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureHostedServiceLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String AZURE_HOSTED_SERVICE_LABEL_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAzureHostedServiceLabel() <em>Azure Hosted Service Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureHostedServiceLabel()
	 * @generated
	 * @ordered
	 */
	protected String azureHostedServiceLabel = AZURE_HOSTED_SERVICE_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzureHostedServiceName() <em>Azure Hosted Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureHostedServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String AZURE_HOSTED_SERVICE_NAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAzureHostedServiceName() <em>Azure Hosted Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureHostedServiceName()
	 * @generated
	 * @ordered
	 */
	protected String azureHostedServiceName = AZURE_HOSTED_SERVICE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isAzureEnableIntelliTrace() <em>Azure Enable Intelli Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAzureEnableIntelliTrace()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AZURE_ENABLE_INTELLI_TRACE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAzureEnableIntelliTrace() <em>Azure Enable Intelli Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAzureEnableIntelliTrace()
	 * @generated
	 * @ordered
	 */
	protected boolean azureEnableIntelliTrace = AZURE_ENABLE_INTELLI_TRACE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAzureEnableProfiling() <em>Azure Enable Profiling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAzureEnableProfiling()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AZURE_ENABLE_PROFILING_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAzureEnableProfiling() <em>Azure Enable Profiling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAzureEnableProfiling()
	 * @generated
	 * @ordered
	 */
	protected boolean azureEnableProfiling = AZURE_ENABLE_PROFILING_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzureServiceConfiguration() <em>Azure Service Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureServiceConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final String AZURE_SERVICE_CONFIGURATION_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getAzureServiceConfiguration() <em>Azure Service Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureServiceConfiguration()
	 * @generated
	 * @ordered
	 */
	protected String azureServiceConfiguration = AZURE_SERVICE_CONFIGURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzureSolutionConfiguration() <em>Azure Solution Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureSolutionConfiguration()
	 * @generated
	 * @ordered
	 */
	protected static final String AZURE_SOLUTION_CONFIGURATION_EDEFAULT = "False";

	/**
	 * The cached value of the '{@link #getAzureSolutionConfiguration() <em>Azure Solution Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureSolutionConfiguration()
	 * @generated
	 * @ordered
	 */
	protected String azureSolutionConfiguration = AZURE_SOLUTION_CONFIGURATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzureStorageAccountLabel() <em>Azure Storage Account Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureStorageAccountLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String AZURE_STORAGE_ACCOUNT_LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAzureStorageAccountLabel() <em>Azure Storage Account Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureStorageAccountLabel()
	 * @generated
	 * @ordered
	 */
	protected String azureStorageAccountLabel = AZURE_STORAGE_ACCOUNT_LABEL_EDEFAULT;

	/**
	 * The default value of the '{@link #getAzureStorageAccountName() <em>Azure Storage Account Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureStorageAccountName()
	 * @generated
	 * @ordered
	 */
	protected static final String AZURE_STORAGE_ACCOUNT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAzureStorageAccountName() <em>Azure Storage Account Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAzureStorageAccountName()
	 * @generated
	 * @ordered
	 */
	protected String azureStorageAccountName = AZURE_STORAGE_ACCOUNT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isAzureAppendTimestampToDeploymentLabel() <em>Azure Append Timestamp To Deployment Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAzureAppendTimestampToDeploymentLabel()
	 * @generated
	 * @ordered
	 */
	protected static final boolean AZURE_APPEND_TIMESTAMP_TO_DEPLOYMENT_LABEL_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isAzureAppendTimestampToDeploymentLabel() <em>Azure Append Timestamp To Deployment Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAzureAppendTimestampToDeploymentLabel()
	 * @generated
	 * @ordered
	 */
	protected boolean azureAppendTimestampToDeploymentLabel = AZURE_APPEND_TIMESTAMP_TO_DEPLOYMENT_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDesPackage.Literals.PROPERTY_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAzureCredentials() {
		return azureCredentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureCredentials(String newAzureCredentials) {
		String oldAzureCredentials = azureCredentials;
		azureCredentials = newAzureCredentials;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDesPackage.PROPERTY_GROUP__AZURE_CREDENTIALS, oldAzureCredentials, azureCredentials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAzureDeleteDeploymentOnFailure() {
		return azureDeleteDeploymentOnFailure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureDeleteDeploymentOnFailure(boolean newAzureDeleteDeploymentOnFailure) {
		boolean oldAzureDeleteDeploymentOnFailure = azureDeleteDeploymentOnFailure;
		azureDeleteDeploymentOnFailure = newAzureDeleteDeploymentOnFailure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDesPackage.PROPERTY_GROUP__AZURE_DELETE_DEPLOYMENT_ON_FAILURE, oldAzureDeleteDeploymentOnFailure, azureDeleteDeploymentOnFailure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAzureDeploymentLabel() {
		return azureDeploymentLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureDeploymentLabel(String newAzureDeploymentLabel) {
		String oldAzureDeploymentLabel = azureDeploymentLabel;
		azureDeploymentLabel = newAzureDeploymentLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDesPackage.PROPERTY_GROUP__AZURE_DEPLOYMENT_LABEL, oldAzureDeploymentLabel, azureDeploymentLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAzureDeploymentReplacementMethod() {
		return azureDeploymentReplacementMethod;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureDeploymentReplacementMethod(String newAzureDeploymentReplacementMethod) {
		String oldAzureDeploymentReplacementMethod = azureDeploymentReplacementMethod;
		azureDeploymentReplacementMethod = newAzureDeploymentReplacementMethod;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDesPackage.PROPERTY_GROUP__AZURE_DEPLOYMENT_REPLACEMENT_METHOD, oldAzureDeploymentReplacementMethod, azureDeploymentReplacementMethod));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAzureSlot() {
		return azureSlot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureSlot(String newAzureSlot) {
		String oldAzureSlot = azureSlot;
		azureSlot = newAzureSlot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDesPackage.PROPERTY_GROUP__AZURE_SLOT, oldAzureSlot, azureSlot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAzureEnableRemoteDesktop() {
		return azureEnableRemoteDesktop;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureEnableRemoteDesktop(boolean newAzureEnableRemoteDesktop) {
		boolean oldAzureEnableRemoteDesktop = azureEnableRemoteDesktop;
		azureEnableRemoteDesktop = newAzureEnableRemoteDesktop;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_REMOTE_DESKTOP, oldAzureEnableRemoteDesktop, azureEnableRemoteDesktop));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAzureEnableWebDeploy() {
		return azureEnableWebDeploy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureEnableWebDeploy(boolean newAzureEnableWebDeploy) {
		boolean oldAzureEnableWebDeploy = azureEnableWebDeploy;
		azureEnableWebDeploy = newAzureEnableWebDeploy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_WEB_DEPLOY, oldAzureEnableWebDeploy, azureEnableWebDeploy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAzureFallbackToDeleteAndRecreateIfUpgradeFails() {
		return azureFallbackToDeleteAndRecreateIfUpgradeFails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureFallbackToDeleteAndRecreateIfUpgradeFails(String newAzureFallbackToDeleteAndRecreateIfUpgradeFails) {
		String oldAzureFallbackToDeleteAndRecreateIfUpgradeFails = azureFallbackToDeleteAndRecreateIfUpgradeFails;
		azureFallbackToDeleteAndRecreateIfUpgradeFails = newAzureFallbackToDeleteAndRecreateIfUpgradeFails;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDesPackage.PROPERTY_GROUP__AZURE_FALLBACK_TO_DELETE_AND_RECREATE_IF_UPGRADE_FAILS, oldAzureFallbackToDeleteAndRecreateIfUpgradeFails, azureFallbackToDeleteAndRecreateIfUpgradeFails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAzureHostedServiceLabel() {
		return azureHostedServiceLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureHostedServiceLabel(String newAzureHostedServiceLabel) {
		String oldAzureHostedServiceLabel = azureHostedServiceLabel;
		azureHostedServiceLabel = newAzureHostedServiceLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDesPackage.PROPERTY_GROUP__AZURE_HOSTED_SERVICE_LABEL, oldAzureHostedServiceLabel, azureHostedServiceLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAzureHostedServiceName() {
		return azureHostedServiceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureHostedServiceName(String newAzureHostedServiceName) {
		String oldAzureHostedServiceName = azureHostedServiceName;
		azureHostedServiceName = newAzureHostedServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDesPackage.PROPERTY_GROUP__AZURE_HOSTED_SERVICE_NAME, oldAzureHostedServiceName, azureHostedServiceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAzureEnableIntelliTrace() {
		return azureEnableIntelliTrace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureEnableIntelliTrace(boolean newAzureEnableIntelliTrace) {
		boolean oldAzureEnableIntelliTrace = azureEnableIntelliTrace;
		azureEnableIntelliTrace = newAzureEnableIntelliTrace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_INTELLI_TRACE, oldAzureEnableIntelliTrace, azureEnableIntelliTrace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAzureEnableProfiling() {
		return azureEnableProfiling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureEnableProfiling(boolean newAzureEnableProfiling) {
		boolean oldAzureEnableProfiling = azureEnableProfiling;
		azureEnableProfiling = newAzureEnableProfiling;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_PROFILING, oldAzureEnableProfiling, azureEnableProfiling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAzureServiceConfiguration() {
		return azureServiceConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureServiceConfiguration(String newAzureServiceConfiguration) {
		String oldAzureServiceConfiguration = azureServiceConfiguration;
		azureServiceConfiguration = newAzureServiceConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDesPackage.PROPERTY_GROUP__AZURE_SERVICE_CONFIGURATION, oldAzureServiceConfiguration, azureServiceConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAzureSolutionConfiguration() {
		return azureSolutionConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureSolutionConfiguration(String newAzureSolutionConfiguration) {
		String oldAzureSolutionConfiguration = azureSolutionConfiguration;
		azureSolutionConfiguration = newAzureSolutionConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDesPackage.PROPERTY_GROUP__AZURE_SOLUTION_CONFIGURATION, oldAzureSolutionConfiguration, azureSolutionConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAzureStorageAccountLabel() {
		return azureStorageAccountLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureStorageAccountLabel(String newAzureStorageAccountLabel) {
		String oldAzureStorageAccountLabel = azureStorageAccountLabel;
		azureStorageAccountLabel = newAzureStorageAccountLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDesPackage.PROPERTY_GROUP__AZURE_STORAGE_ACCOUNT_LABEL, oldAzureStorageAccountLabel, azureStorageAccountLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAzureStorageAccountName() {
		return azureStorageAccountName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureStorageAccountName(String newAzureStorageAccountName) {
		String oldAzureStorageAccountName = azureStorageAccountName;
		azureStorageAccountName = newAzureStorageAccountName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDesPackage.PROPERTY_GROUP__AZURE_STORAGE_ACCOUNT_NAME, oldAzureStorageAccountName, azureStorageAccountName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAzureAppendTimestampToDeploymentLabel() {
		return azureAppendTimestampToDeploymentLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAzureAppendTimestampToDeploymentLabel(boolean newAzureAppendTimestampToDeploymentLabel) {
		boolean oldAzureAppendTimestampToDeploymentLabel = azureAppendTimestampToDeploymentLabel;
		azureAppendTimestampToDeploymentLabel = newAzureAppendTimestampToDeploymentLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDesPackage.PROPERTY_GROUP__AZURE_APPEND_TIMESTAMP_TO_DEPLOYMENT_LABEL, oldAzureAppendTimestampToDeploymentLabel, azureAppendTimestampToDeploymentLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_CREDENTIALS:
				return getAzureCredentials();
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_DELETE_DEPLOYMENT_ON_FAILURE:
				return isAzureDeleteDeploymentOnFailure();
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_DEPLOYMENT_LABEL:
				return getAzureDeploymentLabel();
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_DEPLOYMENT_REPLACEMENT_METHOD:
				return getAzureDeploymentReplacementMethod();
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_SLOT:
				return getAzureSlot();
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_REMOTE_DESKTOP:
				return isAzureEnableRemoteDesktop();
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_WEB_DEPLOY:
				return isAzureEnableWebDeploy();
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_FALLBACK_TO_DELETE_AND_RECREATE_IF_UPGRADE_FAILS:
				return getAzureFallbackToDeleteAndRecreateIfUpgradeFails();
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_HOSTED_SERVICE_LABEL:
				return getAzureHostedServiceLabel();
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_HOSTED_SERVICE_NAME:
				return getAzureHostedServiceName();
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_INTELLI_TRACE:
				return isAzureEnableIntelliTrace();
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_PROFILING:
				return isAzureEnableProfiling();
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_SERVICE_CONFIGURATION:
				return getAzureServiceConfiguration();
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_SOLUTION_CONFIGURATION:
				return getAzureSolutionConfiguration();
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_STORAGE_ACCOUNT_LABEL:
				return getAzureStorageAccountLabel();
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_STORAGE_ACCOUNT_NAME:
				return getAzureStorageAccountName();
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_APPEND_TIMESTAMP_TO_DEPLOYMENT_LABEL:
				return isAzureAppendTimestampToDeploymentLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_CREDENTIALS:
				setAzureCredentials((String)newValue);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_DELETE_DEPLOYMENT_ON_FAILURE:
				setAzureDeleteDeploymentOnFailure((Boolean)newValue);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_DEPLOYMENT_LABEL:
				setAzureDeploymentLabel((String)newValue);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_DEPLOYMENT_REPLACEMENT_METHOD:
				setAzureDeploymentReplacementMethod((String)newValue);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_SLOT:
				setAzureSlot((String)newValue);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_REMOTE_DESKTOP:
				setAzureEnableRemoteDesktop((Boolean)newValue);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_WEB_DEPLOY:
				setAzureEnableWebDeploy((Boolean)newValue);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_FALLBACK_TO_DELETE_AND_RECREATE_IF_UPGRADE_FAILS:
				setAzureFallbackToDeleteAndRecreateIfUpgradeFails((String)newValue);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_HOSTED_SERVICE_LABEL:
				setAzureHostedServiceLabel((String)newValue);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_HOSTED_SERVICE_NAME:
				setAzureHostedServiceName((String)newValue);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_INTELLI_TRACE:
				setAzureEnableIntelliTrace((Boolean)newValue);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_PROFILING:
				setAzureEnableProfiling((Boolean)newValue);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_SERVICE_CONFIGURATION:
				setAzureServiceConfiguration((String)newValue);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_SOLUTION_CONFIGURATION:
				setAzureSolutionConfiguration((String)newValue);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_STORAGE_ACCOUNT_LABEL:
				setAzureStorageAccountLabel((String)newValue);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_STORAGE_ACCOUNT_NAME:
				setAzureStorageAccountName((String)newValue);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_APPEND_TIMESTAMP_TO_DEPLOYMENT_LABEL:
				setAzureAppendTimestampToDeploymentLabel((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_CREDENTIALS:
				setAzureCredentials(AZURE_CREDENTIALS_EDEFAULT);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_DELETE_DEPLOYMENT_ON_FAILURE:
				setAzureDeleteDeploymentOnFailure(AZURE_DELETE_DEPLOYMENT_ON_FAILURE_EDEFAULT);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_DEPLOYMENT_LABEL:
				setAzureDeploymentLabel(AZURE_DEPLOYMENT_LABEL_EDEFAULT);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_DEPLOYMENT_REPLACEMENT_METHOD:
				setAzureDeploymentReplacementMethod(AZURE_DEPLOYMENT_REPLACEMENT_METHOD_EDEFAULT);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_SLOT:
				setAzureSlot(AZURE_SLOT_EDEFAULT);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_REMOTE_DESKTOP:
				setAzureEnableRemoteDesktop(AZURE_ENABLE_REMOTE_DESKTOP_EDEFAULT);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_WEB_DEPLOY:
				setAzureEnableWebDeploy(AZURE_ENABLE_WEB_DEPLOY_EDEFAULT);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_FALLBACK_TO_DELETE_AND_RECREATE_IF_UPGRADE_FAILS:
				setAzureFallbackToDeleteAndRecreateIfUpgradeFails(AZURE_FALLBACK_TO_DELETE_AND_RECREATE_IF_UPGRADE_FAILS_EDEFAULT);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_HOSTED_SERVICE_LABEL:
				setAzureHostedServiceLabel(AZURE_HOSTED_SERVICE_LABEL_EDEFAULT);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_HOSTED_SERVICE_NAME:
				setAzureHostedServiceName(AZURE_HOSTED_SERVICE_NAME_EDEFAULT);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_INTELLI_TRACE:
				setAzureEnableIntelliTrace(AZURE_ENABLE_INTELLI_TRACE_EDEFAULT);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_PROFILING:
				setAzureEnableProfiling(AZURE_ENABLE_PROFILING_EDEFAULT);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_SERVICE_CONFIGURATION:
				setAzureServiceConfiguration(AZURE_SERVICE_CONFIGURATION_EDEFAULT);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_SOLUTION_CONFIGURATION:
				setAzureSolutionConfiguration(AZURE_SOLUTION_CONFIGURATION_EDEFAULT);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_STORAGE_ACCOUNT_LABEL:
				setAzureStorageAccountLabel(AZURE_STORAGE_ACCOUNT_LABEL_EDEFAULT);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_STORAGE_ACCOUNT_NAME:
				setAzureStorageAccountName(AZURE_STORAGE_ACCOUNT_NAME_EDEFAULT);
				return;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_APPEND_TIMESTAMP_TO_DEPLOYMENT_LABEL:
				setAzureAppendTimestampToDeploymentLabel(AZURE_APPEND_TIMESTAMP_TO_DEPLOYMENT_LABEL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_CREDENTIALS:
				return AZURE_CREDENTIALS_EDEFAULT == null ? azureCredentials != null : !AZURE_CREDENTIALS_EDEFAULT.equals(azureCredentials);
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_DELETE_DEPLOYMENT_ON_FAILURE:
				return azureDeleteDeploymentOnFailure != AZURE_DELETE_DEPLOYMENT_ON_FAILURE_EDEFAULT;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_DEPLOYMENT_LABEL:
				return AZURE_DEPLOYMENT_LABEL_EDEFAULT == null ? azureDeploymentLabel != null : !AZURE_DEPLOYMENT_LABEL_EDEFAULT.equals(azureDeploymentLabel);
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_DEPLOYMENT_REPLACEMENT_METHOD:
				return AZURE_DEPLOYMENT_REPLACEMENT_METHOD_EDEFAULT == null ? azureDeploymentReplacementMethod != null : !AZURE_DEPLOYMENT_REPLACEMENT_METHOD_EDEFAULT.equals(azureDeploymentReplacementMethod);
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_SLOT:
				return AZURE_SLOT_EDEFAULT == null ? azureSlot != null : !AZURE_SLOT_EDEFAULT.equals(azureSlot);
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_REMOTE_DESKTOP:
				return azureEnableRemoteDesktop != AZURE_ENABLE_REMOTE_DESKTOP_EDEFAULT;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_WEB_DEPLOY:
				return azureEnableWebDeploy != AZURE_ENABLE_WEB_DEPLOY_EDEFAULT;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_FALLBACK_TO_DELETE_AND_RECREATE_IF_UPGRADE_FAILS:
				return AZURE_FALLBACK_TO_DELETE_AND_RECREATE_IF_UPGRADE_FAILS_EDEFAULT == null ? azureFallbackToDeleteAndRecreateIfUpgradeFails != null : !AZURE_FALLBACK_TO_DELETE_AND_RECREATE_IF_UPGRADE_FAILS_EDEFAULT.equals(azureFallbackToDeleteAndRecreateIfUpgradeFails);
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_HOSTED_SERVICE_LABEL:
				return AZURE_HOSTED_SERVICE_LABEL_EDEFAULT == null ? azureHostedServiceLabel != null : !AZURE_HOSTED_SERVICE_LABEL_EDEFAULT.equals(azureHostedServiceLabel);
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_HOSTED_SERVICE_NAME:
				return AZURE_HOSTED_SERVICE_NAME_EDEFAULT == null ? azureHostedServiceName != null : !AZURE_HOSTED_SERVICE_NAME_EDEFAULT.equals(azureHostedServiceName);
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_INTELLI_TRACE:
				return azureEnableIntelliTrace != AZURE_ENABLE_INTELLI_TRACE_EDEFAULT;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_ENABLE_PROFILING:
				return azureEnableProfiling != AZURE_ENABLE_PROFILING_EDEFAULT;
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_SERVICE_CONFIGURATION:
				return AZURE_SERVICE_CONFIGURATION_EDEFAULT == null ? azureServiceConfiguration != null : !AZURE_SERVICE_CONFIGURATION_EDEFAULT.equals(azureServiceConfiguration);
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_SOLUTION_CONFIGURATION:
				return AZURE_SOLUTION_CONFIGURATION_EDEFAULT == null ? azureSolutionConfiguration != null : !AZURE_SOLUTION_CONFIGURATION_EDEFAULT.equals(azureSolutionConfiguration);
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_STORAGE_ACCOUNT_LABEL:
				return AZURE_STORAGE_ACCOUNT_LABEL_EDEFAULT == null ? azureStorageAccountLabel != null : !AZURE_STORAGE_ACCOUNT_LABEL_EDEFAULT.equals(azureStorageAccountLabel);
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_STORAGE_ACCOUNT_NAME:
				return AZURE_STORAGE_ACCOUNT_NAME_EDEFAULT == null ? azureStorageAccountName != null : !AZURE_STORAGE_ACCOUNT_NAME_EDEFAULT.equals(azureStorageAccountName);
			case AzureCSDesPackage.PROPERTY_GROUP__AZURE_APPEND_TIMESTAMP_TO_DEPLOYMENT_LABEL:
				return azureAppendTimestampToDeploymentLabel != AZURE_APPEND_TIMESTAMP_TO_DEPLOYMENT_LABEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (AzureCredentials: ");
		result.append(azureCredentials);
		result.append(", AzureDeleteDeploymentOnFailure: ");
		result.append(azureDeleteDeploymentOnFailure);
		result.append(", AzureDeploymentLabel: ");
		result.append(azureDeploymentLabel);
		result.append(", AzureDeploymentReplacementMethod: ");
		result.append(azureDeploymentReplacementMethod);
		result.append(", AzureSlot: ");
		result.append(azureSlot);
		result.append(", AzureEnableRemoteDesktop: ");
		result.append(azureEnableRemoteDesktop);
		result.append(", AzureEnableWebDeploy: ");
		result.append(azureEnableWebDeploy);
		result.append(", AzureFallbackToDeleteAndRecreateIfUpgradeFails: ");
		result.append(azureFallbackToDeleteAndRecreateIfUpgradeFails);
		result.append(", AzureHostedServiceLabel: ");
		result.append(azureHostedServiceLabel);
		result.append(", AzureHostedServiceName: ");
		result.append(azureHostedServiceName);
		result.append(", AzureEnableIntelliTrace: ");
		result.append(azureEnableIntelliTrace);
		result.append(", AzureEnableProfiling: ");
		result.append(azureEnableProfiling);
		result.append(", AzureServiceConfiguration: ");
		result.append(azureServiceConfiguration);
		result.append(", AzureSolutionConfiguration: ");
		result.append(azureSolutionConfiguration);
		result.append(", AzureStorageAccountLabel: ");
		result.append(azureStorageAccountLabel);
		result.append(", AzureStorageAccountName: ");
		result.append(azureStorageAccountName);
		result.append(", AzureAppendTimestampToDeploymentLabel: ");
		result.append(azureAppendTimestampToDeploymentLabel);
		result.append(')');
		return result.toString();
	}

} //PropertyGroupImpl
