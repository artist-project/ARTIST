/**
 */
package eu.artist.migration.deployment.azure.csdes;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureCredentials <em>Azure Credentials</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureDeleteDeploymentOnFailure <em>Azure Delete Deployment On Failure</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureDeploymentLabel <em>Azure Deployment Label</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureDeploymentReplacementMethod <em>Azure Deployment Replacement Method</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureSlot <em>Azure Slot</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureEnableRemoteDesktop <em>Azure Enable Remote Desktop</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureEnableWebDeploy <em>Azure Enable Web Deploy</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureFallbackToDeleteAndRecreateIfUpgradeFails <em>Azure Fallback To Delete And Recreate If Upgrade Fails</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureHostedServiceLabel <em>Azure Hosted Service Label</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureHostedServiceName <em>Azure Hosted Service Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureEnableIntelliTrace <em>Azure Enable Intelli Trace</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureEnableProfiling <em>Azure Enable Profiling</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureServiceConfiguration <em>Azure Service Configuration</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureSolutionConfiguration <em>Azure Solution Configuration</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureStorageAccountLabel <em>Azure Storage Account Label</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureStorageAccountName <em>Azure Storage Account Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureAppendTimestampToDeploymentLabel <em>Azure Append Timestamp To Deployment Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup()
 * @model
 * @generated
 */
public interface PropertyGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Azure Credentials</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azure Credentials</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azure Credentials</em>' attribute.
	 * @see #setAzureCredentials(String)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup_AzureCredentials()
	 * @model
	 * @generated
	 */
	String getAzureCredentials();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureCredentials <em>Azure Credentials</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Credentials</em>' attribute.
	 * @see #getAzureCredentials()
	 * @generated
	 */
	void setAzureCredentials(String value);

	/**
	 * Returns the value of the '<em><b>Azure Delete Deployment On Failure</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azure Delete Deployment On Failure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azure Delete Deployment On Failure</em>' attribute.
	 * @see #setAzureDeleteDeploymentOnFailure(boolean)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup_AzureDeleteDeploymentOnFailure()
	 * @model default="false"
	 * @generated
	 */
	boolean isAzureDeleteDeploymentOnFailure();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureDeleteDeploymentOnFailure <em>Azure Delete Deployment On Failure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Delete Deployment On Failure</em>' attribute.
	 * @see #isAzureDeleteDeploymentOnFailure()
	 * @generated
	 */
	void setAzureDeleteDeploymentOnFailure(boolean value);

	/**
	 * Returns the value of the '<em><b>Azure Deployment Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azure Deployment Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azure Deployment Label</em>' attribute.
	 * @see #setAzureDeploymentLabel(String)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup_AzureDeploymentLabel()
	 * @model default=""
	 * @generated
	 */
	String getAzureDeploymentLabel();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureDeploymentLabel <em>Azure Deployment Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Deployment Label</em>' attribute.
	 * @see #getAzureDeploymentLabel()
	 * @generated
	 */
	void setAzureDeploymentLabel(String value);

	/**
	 * Returns the value of the '<em><b>Azure Deployment Replacement Method</b></em>' attribute.
	 * The default value is <code>"AutomaticUpgrade"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azure Deployment Replacement Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azure Deployment Replacement Method</em>' attribute.
	 * @see #setAzureDeploymentReplacementMethod(String)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup_AzureDeploymentReplacementMethod()
	 * @model default="AutomaticUpgrade"
	 * @generated
	 */
	String getAzureDeploymentReplacementMethod();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureDeploymentReplacementMethod <em>Azure Deployment Replacement Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Deployment Replacement Method</em>' attribute.
	 * @see #getAzureDeploymentReplacementMethod()
	 * @generated
	 */
	void setAzureDeploymentReplacementMethod(String value);

	/**
	 * Returns the value of the '<em><b>Azure Slot</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azure Slot</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azure Slot</em>' attribute.
	 * @see #setAzureSlot(String)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup_AzureSlot()
	 * @model default=""
	 * @generated
	 */
	String getAzureSlot();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureSlot <em>Azure Slot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Slot</em>' attribute.
	 * @see #getAzureSlot()
	 * @generated
	 */
	void setAzureSlot(String value);

	/**
	 * Returns the value of the '<em><b>Azure Enable Remote Desktop</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azure Enable Remote Desktop</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azure Enable Remote Desktop</em>' attribute.
	 * @see #setAzureEnableRemoteDesktop(boolean)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup_AzureEnableRemoteDesktop()
	 * @model default="true"
	 * @generated
	 */
	boolean isAzureEnableRemoteDesktop();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureEnableRemoteDesktop <em>Azure Enable Remote Desktop</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Enable Remote Desktop</em>' attribute.
	 * @see #isAzureEnableRemoteDesktop()
	 * @generated
	 */
	void setAzureEnableRemoteDesktop(boolean value);

	/**
	 * Returns the value of the '<em><b>Azure Enable Web Deploy</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azure Enable Web Deploy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azure Enable Web Deploy</em>' attribute.
	 * @see #setAzureEnableWebDeploy(boolean)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup_AzureEnableWebDeploy()
	 * @model default="false"
	 * @generated
	 */
	boolean isAzureEnableWebDeploy();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureEnableWebDeploy <em>Azure Enable Web Deploy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Enable Web Deploy</em>' attribute.
	 * @see #isAzureEnableWebDeploy()
	 * @generated
	 */
	void setAzureEnableWebDeploy(boolean value);

	/**
	 * Returns the value of the '<em><b>Azure Fallback To Delete And Recreate If Upgrade Fails</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azure Fallback To Delete And Recreate If Upgrade Fails</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azure Fallback To Delete And Recreate If Upgrade Fails</em>' attribute.
	 * @see #setAzureFallbackToDeleteAndRecreateIfUpgradeFails(String)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup_AzureFallbackToDeleteAndRecreateIfUpgradeFails()
	 * @model default="False"
	 * @generated
	 */
	String getAzureFallbackToDeleteAndRecreateIfUpgradeFails();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureFallbackToDeleteAndRecreateIfUpgradeFails <em>Azure Fallback To Delete And Recreate If Upgrade Fails</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Fallback To Delete And Recreate If Upgrade Fails</em>' attribute.
	 * @see #getAzureFallbackToDeleteAndRecreateIfUpgradeFails()
	 * @generated
	 */
	void setAzureFallbackToDeleteAndRecreateIfUpgradeFails(String value);

	/**
	 * Returns the value of the '<em><b>Azure Hosted Service Label</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azure Hosted Service Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azure Hosted Service Label</em>' attribute.
	 * @see #setAzureHostedServiceLabel(String)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup_AzureHostedServiceLabel()
	 * @model default=""
	 * @generated
	 */
	String getAzureHostedServiceLabel();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureHostedServiceLabel <em>Azure Hosted Service Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Hosted Service Label</em>' attribute.
	 * @see #getAzureHostedServiceLabel()
	 * @generated
	 */
	void setAzureHostedServiceLabel(String value);

	/**
	 * Returns the value of the '<em><b>Azure Hosted Service Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azure Hosted Service Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azure Hosted Service Name</em>' attribute.
	 * @see #setAzureHostedServiceName(String)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup_AzureHostedServiceName()
	 * @model default=""
	 * @generated
	 */
	String getAzureHostedServiceName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureHostedServiceName <em>Azure Hosted Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Hosted Service Name</em>' attribute.
	 * @see #getAzureHostedServiceName()
	 * @generated
	 */
	void setAzureHostedServiceName(String value);

	/**
	 * Returns the value of the '<em><b>Azure Enable Intelli Trace</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azure Enable Intelli Trace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azure Enable Intelli Trace</em>' attribute.
	 * @see #setAzureEnableIntelliTrace(boolean)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup_AzureEnableIntelliTrace()
	 * @model default="False"
	 * @generated
	 */
	boolean isAzureEnableIntelliTrace();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureEnableIntelliTrace <em>Azure Enable Intelli Trace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Enable Intelli Trace</em>' attribute.
	 * @see #isAzureEnableIntelliTrace()
	 * @generated
	 */
	void setAzureEnableIntelliTrace(boolean value);

	/**
	 * Returns the value of the '<em><b>Azure Enable Profiling</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azure Enable Profiling</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azure Enable Profiling</em>' attribute.
	 * @see #setAzureEnableProfiling(boolean)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup_AzureEnableProfiling()
	 * @model default="False"
	 * @generated
	 */
	boolean isAzureEnableProfiling();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureEnableProfiling <em>Azure Enable Profiling</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Enable Profiling</em>' attribute.
	 * @see #isAzureEnableProfiling()
	 * @generated
	 */
	void setAzureEnableProfiling(boolean value);

	/**
	 * Returns the value of the '<em><b>Azure Service Configuration</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azure Service Configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azure Service Configuration</em>' attribute.
	 * @see #setAzureServiceConfiguration(String)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup_AzureServiceConfiguration()
	 * @model default=""
	 * @generated
	 */
	String getAzureServiceConfiguration();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureServiceConfiguration <em>Azure Service Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Service Configuration</em>' attribute.
	 * @see #getAzureServiceConfiguration()
	 * @generated
	 */
	void setAzureServiceConfiguration(String value);

	/**
	 * Returns the value of the '<em><b>Azure Solution Configuration</b></em>' attribute.
	 * The default value is <code>"False"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azure Solution Configuration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azure Solution Configuration</em>' attribute.
	 * @see #setAzureSolutionConfiguration(String)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup_AzureSolutionConfiguration()
	 * @model default="False"
	 * @generated
	 */
	String getAzureSolutionConfiguration();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureSolutionConfiguration <em>Azure Solution Configuration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Solution Configuration</em>' attribute.
	 * @see #getAzureSolutionConfiguration()
	 * @generated
	 */
	void setAzureSolutionConfiguration(String value);

	/**
	 * Returns the value of the '<em><b>Azure Storage Account Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azure Storage Account Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azure Storage Account Label</em>' attribute.
	 * @see #setAzureStorageAccountLabel(String)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup_AzureStorageAccountLabel()
	 * @model
	 * @generated
	 */
	String getAzureStorageAccountLabel();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureStorageAccountLabel <em>Azure Storage Account Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Storage Account Label</em>' attribute.
	 * @see #getAzureStorageAccountLabel()
	 * @generated
	 */
	void setAzureStorageAccountLabel(String value);

	/**
	 * Returns the value of the '<em><b>Azure Storage Account Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azure Storage Account Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azure Storage Account Name</em>' attribute.
	 * @see #setAzureStorageAccountName(String)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup_AzureStorageAccountName()
	 * @model
	 * @generated
	 */
	String getAzureStorageAccountName();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#getAzureStorageAccountName <em>Azure Storage Account Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Storage Account Name</em>' attribute.
	 * @see #getAzureStorageAccountName()
	 * @generated
	 */
	void setAzureStorageAccountName(String value);

	/**
	 * Returns the value of the '<em><b>Azure Append Timestamp To Deployment Label</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Azure Append Timestamp To Deployment Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Azure Append Timestamp To Deployment Label</em>' attribute.
	 * @see #setAzureAppendTimestampToDeploymentLabel(boolean)
	 * @see eu.artist.migration.deployment.azure.csdes.AzureCSDesPackage#getPropertyGroup_AzureAppendTimestampToDeploymentLabel()
	 * @model default="true"
	 * @generated
	 */
	boolean isAzureAppendTimestampToDeploymentLabel();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.csdes.PropertyGroup#isAzureAppendTimestampToDeploymentLabel <em>Azure Append Timestamp To Deployment Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Azure Append Timestamp To Deployment Label</em>' attribute.
	 * @see #isAzureAppendTimestampToDeploymentLabel()
	 * @generated
	 */
	void setAzureAppendTimestampToDeploymentLabel(boolean value);

} // PropertyGroup
