/**
 */
package gaeweb;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appengine Web App Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link gaeweb.AppengineWebAppType#getApplication <em>Application</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getVersion <em>Version</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getSourceLanguage <em>Source Language</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getModule <em>Module</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getInstanceClass <em>Instance Class</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getAutomaticScaling <em>Automatic Scaling</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getManualScaling <em>Manual Scaling</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getBasicScaling <em>Basic Scaling</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getStaticFiles <em>Static Files</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getResourceFiles <em>Resource Files</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getSystemProperties <em>System Properties</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getVmSettings <em>Vm Settings</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getVmHealthCheck <em>Vm Health Check</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getEnvVariables <em>Env Variables</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#isSslEnabled <em>Ssl Enabled</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#isSessionsEnabled <em>Sessions Enabled</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getAsyncSessionPersistence <em>Async Session Persistence</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getUserPermissions <em>User Permissions</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getPublicRoot <em>Public Root</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getInboundServices <em>Inbound Services</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#isPrecompilationEnabled <em>Precompilation Enabled</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getAdminConsole <em>Admin Console</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getStaticErrorHandlers <em>Static Error Handlers</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#isWarmupRequestsEnabled <em>Warmup Requests Enabled</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#isThreadsafe <em>Threadsafe</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getAutoIdPolicy <em>Auto Id Policy</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#isCodeLock <em>Code Lock</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#isVm <em>Vm</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getPagespeed <em>Pagespeed</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getClassLoaderConfig <em>Class Loader Config</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#getUrlStreamHandler <em>Url Stream Handler</em>}</li>
 *   <li>{@link gaeweb.AppengineWebAppType#isUseGoogleConnectorJ <em>Use Google Connector J</em>}</li>
 * </ul>
 * </p>
 *
 * @see gaeweb.GaewebPackage#getAppengineWebAppType()
 * @model extendedMetaData="name='appengine-web-appType' kind='elementOnly'"
 * @generated
 */
public interface AppengineWebAppType extends EObject {
	/**
	 * Returns the value of the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Application</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Application</em>' attribute.
	 * @see #setApplication(String)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_Application()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='application' namespace='##targetNamespace'"
	 * @generated
	 */
	String getApplication();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getApplication <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application</em>' attribute.
	 * @see #getApplication()
	 * @generated
	 */
	void setApplication(String value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

	/**
	 * Returns the value of the '<em><b>Source Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Language</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Language</em>' attribute.
	 * @see #setSourceLanguage(String)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_SourceLanguage()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='source-language' namespace='##targetNamespace'"
	 * @generated
	 */
	String getSourceLanguage();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getSourceLanguage <em>Source Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Language</em>' attribute.
	 * @see #getSourceLanguage()
	 * @generated
	 */
	void setSourceLanguage(String value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' attribute.
	 * @see #setModule(String)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_Module()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='module' namespace='##targetNamespace'"
	 * @generated
	 */
	String getModule();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getModule <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' attribute.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(String value);

	/**
	 * Returns the value of the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Class</em>' attribute.
	 * @see #setInstanceClass(String)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_InstanceClass()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='instance-class' namespace='##targetNamespace'"
	 * @generated
	 */
	String getInstanceClass();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getInstanceClass <em>Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Class</em>' attribute.
	 * @see #getInstanceClass()
	 * @generated
	 */
	void setInstanceClass(String value);

	/**
	 * Returns the value of the '<em><b>Automatic Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Automatic Scaling</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Automatic Scaling</em>' containment reference.
	 * @see #setAutomaticScaling(AutomaticScalingType)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_AutomaticScaling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='automatic-scaling' namespace='##targetNamespace'"
	 * @generated
	 */
	AutomaticScalingType getAutomaticScaling();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getAutomaticScaling <em>Automatic Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Automatic Scaling</em>' containment reference.
	 * @see #getAutomaticScaling()
	 * @generated
	 */
	void setAutomaticScaling(AutomaticScalingType value);

	/**
	 * Returns the value of the '<em><b>Manual Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manual Scaling</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manual Scaling</em>' containment reference.
	 * @see #setManualScaling(ManualScalingType)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_ManualScaling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='manual-scaling' namespace='##targetNamespace'"
	 * @generated
	 */
	ManualScalingType getManualScaling();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getManualScaling <em>Manual Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manual Scaling</em>' containment reference.
	 * @see #getManualScaling()
	 * @generated
	 */
	void setManualScaling(ManualScalingType value);

	/**
	 * Returns the value of the '<em><b>Basic Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basic Scaling</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basic Scaling</em>' containment reference.
	 * @see #setBasicScaling(BasicScalingType)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_BasicScaling()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basic-scaling' namespace='##targetNamespace'"
	 * @generated
	 */
	BasicScalingType getBasicScaling();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getBasicScaling <em>Basic Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic Scaling</em>' containment reference.
	 * @see #getBasicScaling()
	 * @generated
	 */
	void setBasicScaling(BasicScalingType value);

	/**
	 * Returns the value of the '<em><b>Static Files</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Files</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Files</em>' containment reference.
	 * @see #setStaticFiles(StaticFilesType)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_StaticFiles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='static-files' namespace='##targetNamespace'"
	 * @generated
	 */
	StaticFilesType getStaticFiles();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getStaticFiles <em>Static Files</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Files</em>' containment reference.
	 * @see #getStaticFiles()
	 * @generated
	 */
	void setStaticFiles(StaticFilesType value);

	/**
	 * Returns the value of the '<em><b>Resource Files</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resource Files</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resource Files</em>' containment reference.
	 * @see #setResourceFiles(ResourceFilesType)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_ResourceFiles()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resource-files' namespace='##targetNamespace'"
	 * @generated
	 */
	ResourceFilesType getResourceFiles();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getResourceFiles <em>Resource Files</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resource Files</em>' containment reference.
	 * @see #getResourceFiles()
	 * @generated
	 */
	void setResourceFiles(ResourceFilesType value);

	/**
	 * Returns the value of the '<em><b>System Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>System Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>System Properties</em>' containment reference.
	 * @see #setSystemProperties(SystemPropertiesType)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_SystemProperties()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='system-properties' namespace='##targetNamespace'"
	 * @generated
	 */
	SystemPropertiesType getSystemProperties();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getSystemProperties <em>System Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>System Properties</em>' containment reference.
	 * @see #getSystemProperties()
	 * @generated
	 */
	void setSystemProperties(SystemPropertiesType value);

	/**
	 * Returns the value of the '<em><b>Vm Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Settings</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Settings</em>' containment reference.
	 * @see #setVmSettings(VmSettingsType)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_VmSettings()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vm-settings' namespace='##targetNamespace'"
	 * @generated
	 */
	VmSettingsType getVmSettings();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getVmSettings <em>Vm Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Settings</em>' containment reference.
	 * @see #getVmSettings()
	 * @generated
	 */
	void setVmSettings(VmSettingsType value);

	/**
	 * Returns the value of the '<em><b>Vm Health Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm Health Check</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm Health Check</em>' containment reference.
	 * @see #setVmHealthCheck(VmHealthCheckType)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_VmHealthCheck()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='vm-health-check' namespace='##targetNamespace'"
	 * @generated
	 */
	VmHealthCheckType getVmHealthCheck();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getVmHealthCheck <em>Vm Health Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm Health Check</em>' containment reference.
	 * @see #getVmHealthCheck()
	 * @generated
	 */
	void setVmHealthCheck(VmHealthCheckType value);

	/**
	 * Returns the value of the '<em><b>Env Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Variables</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Variables</em>' containment reference.
	 * @see #setEnvVariables(EnvVariablesType)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_EnvVariables()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='env-variables' namespace='##targetNamespace'"
	 * @generated
	 */
	EnvVariablesType getEnvVariables();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getEnvVariables <em>Env Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env Variables</em>' containment reference.
	 * @see #getEnvVariables()
	 * @generated
	 */
	void setEnvVariables(EnvVariablesType value);

	/**
	 * Returns the value of the '<em><b>Ssl Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ssl Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ssl Enabled</em>' attribute.
	 * @see #isSetSslEnabled()
	 * @see #unsetSslEnabled()
	 * @see #setSslEnabled(boolean)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_SslEnabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='ssl-enabled' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSslEnabled();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#isSslEnabled <em>Ssl Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ssl Enabled</em>' attribute.
	 * @see #isSetSslEnabled()
	 * @see #unsetSslEnabled()
	 * @see #isSslEnabled()
	 * @generated
	 */
	void setSslEnabled(boolean value);

	/**
	 * Unsets the value of the '{@link gaeweb.AppengineWebAppType#isSslEnabled <em>Ssl Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSslEnabled()
	 * @see #isSslEnabled()
	 * @see #setSslEnabled(boolean)
	 * @generated
	 */
	void unsetSslEnabled();

	/**
	 * Returns whether the value of the '{@link gaeweb.AppengineWebAppType#isSslEnabled <em>Ssl Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Ssl Enabled</em>' attribute is set.
	 * @see #unsetSslEnabled()
	 * @see #isSslEnabled()
	 * @see #setSslEnabled(boolean)
	 * @generated
	 */
	boolean isSetSslEnabled();

	/**
	 * Returns the value of the '<em><b>Sessions Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sessions Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sessions Enabled</em>' attribute.
	 * @see #isSetSessionsEnabled()
	 * @see #unsetSessionsEnabled()
	 * @see #setSessionsEnabled(boolean)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_SessionsEnabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='sessions-enabled' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isSessionsEnabled();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#isSessionsEnabled <em>Sessions Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sessions Enabled</em>' attribute.
	 * @see #isSetSessionsEnabled()
	 * @see #unsetSessionsEnabled()
	 * @see #isSessionsEnabled()
	 * @generated
	 */
	void setSessionsEnabled(boolean value);

	/**
	 * Unsets the value of the '{@link gaeweb.AppengineWebAppType#isSessionsEnabled <em>Sessions Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetSessionsEnabled()
	 * @see #isSessionsEnabled()
	 * @see #setSessionsEnabled(boolean)
	 * @generated
	 */
	void unsetSessionsEnabled();

	/**
	 * Returns whether the value of the '{@link gaeweb.AppengineWebAppType#isSessionsEnabled <em>Sessions Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Sessions Enabled</em>' attribute is set.
	 * @see #unsetSessionsEnabled()
	 * @see #isSessionsEnabled()
	 * @see #setSessionsEnabled(boolean)
	 * @generated
	 */
	boolean isSetSessionsEnabled();

	/**
	 * Returns the value of the '<em><b>Async Session Persistence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Async Session Persistence</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Async Session Persistence</em>' containment reference.
	 * @see #setAsyncSessionPersistence(AsyncSessionPersistenceType)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_AsyncSessionPersistence()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='async-session-persistence' namespace='##targetNamespace'"
	 * @generated
	 */
	AsyncSessionPersistenceType getAsyncSessionPersistence();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getAsyncSessionPersistence <em>Async Session Persistence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Async Session Persistence</em>' containment reference.
	 * @see #getAsyncSessionPersistence()
	 * @generated
	 */
	void setAsyncSessionPersistence(AsyncSessionPersistenceType value);

	/**
	 * Returns the value of the '<em><b>User Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Permissions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Permissions</em>' containment reference.
	 * @see #setUserPermissions(UserPermissionsType)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_UserPermissions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='user-permissions' namespace='##targetNamespace'"
	 * @generated
	 */
	UserPermissionsType getUserPermissions();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getUserPermissions <em>User Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Permissions</em>' containment reference.
	 * @see #getUserPermissions()
	 * @generated
	 */
	void setUserPermissions(UserPermissionsType value);

	/**
	 * Returns the value of the '<em><b>Public Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Root</em>' attribute.
	 * @see #setPublicRoot(String)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_PublicRoot()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='public-root' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPublicRoot();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getPublicRoot <em>Public Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Root</em>' attribute.
	 * @see #getPublicRoot()
	 * @generated
	 */
	void setPublicRoot(String value);

	/**
	 * Returns the value of the '<em><b>Inbound Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inbound Services</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inbound Services</em>' containment reference.
	 * @see #setInboundServices(InboundServicesType)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_InboundServices()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='inbound-services' namespace='##targetNamespace'"
	 * @generated
	 */
	InboundServicesType getInboundServices();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getInboundServices <em>Inbound Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inbound Services</em>' containment reference.
	 * @see #getInboundServices()
	 * @generated
	 */
	void setInboundServices(InboundServicesType value);

	/**
	 * Returns the value of the '<em><b>Precompilation Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Precompilation Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Precompilation Enabled</em>' attribute.
	 * @see #isSetPrecompilationEnabled()
	 * @see #unsetPrecompilationEnabled()
	 * @see #setPrecompilationEnabled(boolean)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_PrecompilationEnabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='precompilation-enabled' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isPrecompilationEnabled();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#isPrecompilationEnabled <em>Precompilation Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Precompilation Enabled</em>' attribute.
	 * @see #isSetPrecompilationEnabled()
	 * @see #unsetPrecompilationEnabled()
	 * @see #isPrecompilationEnabled()
	 * @generated
	 */
	void setPrecompilationEnabled(boolean value);

	/**
	 * Unsets the value of the '{@link gaeweb.AppengineWebAppType#isPrecompilationEnabled <em>Precompilation Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetPrecompilationEnabled()
	 * @see #isPrecompilationEnabled()
	 * @see #setPrecompilationEnabled(boolean)
	 * @generated
	 */
	void unsetPrecompilationEnabled();

	/**
	 * Returns whether the value of the '{@link gaeweb.AppengineWebAppType#isPrecompilationEnabled <em>Precompilation Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Precompilation Enabled</em>' attribute is set.
	 * @see #unsetPrecompilationEnabled()
	 * @see #isPrecompilationEnabled()
	 * @see #setPrecompilationEnabled(boolean)
	 * @generated
	 */
	boolean isSetPrecompilationEnabled();

	/**
	 * Returns the value of the '<em><b>Admin Console</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin Console</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin Console</em>' containment reference.
	 * @see #setAdminConsole(AdminConsole)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_AdminConsole()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='admin-console' namespace='##targetNamespace'"
	 * @generated
	 */
	AdminConsole getAdminConsole();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getAdminConsole <em>Admin Console</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin Console</em>' containment reference.
	 * @see #getAdminConsole()
	 * @generated
	 */
	void setAdminConsole(AdminConsole value);

	/**
	 * Returns the value of the '<em><b>Static Error Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static Error Handlers</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Static Error Handlers</em>' containment reference.
	 * @see #setStaticErrorHandlers(StaticErrorHandlers)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_StaticErrorHandlers()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='static-error-handlers' namespace='##targetNamespace'"
	 * @generated
	 */
	StaticErrorHandlers getStaticErrorHandlers();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getStaticErrorHandlers <em>Static Error Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Static Error Handlers</em>' containment reference.
	 * @see #getStaticErrorHandlers()
	 * @generated
	 */
	void setStaticErrorHandlers(StaticErrorHandlers value);

	/**
	 * Returns the value of the '<em><b>Warmup Requests Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Warmup Requests Enabled</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Warmup Requests Enabled</em>' attribute.
	 * @see #isSetWarmupRequestsEnabled()
	 * @see #unsetWarmupRequestsEnabled()
	 * @see #setWarmupRequestsEnabled(boolean)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_WarmupRequestsEnabled()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='warmup-requests-enabled' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isWarmupRequestsEnabled();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#isWarmupRequestsEnabled <em>Warmup Requests Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Warmup Requests Enabled</em>' attribute.
	 * @see #isSetWarmupRequestsEnabled()
	 * @see #unsetWarmupRequestsEnabled()
	 * @see #isWarmupRequestsEnabled()
	 * @generated
	 */
	void setWarmupRequestsEnabled(boolean value);

	/**
	 * Unsets the value of the '{@link gaeweb.AppengineWebAppType#isWarmupRequestsEnabled <em>Warmup Requests Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetWarmupRequestsEnabled()
	 * @see #isWarmupRequestsEnabled()
	 * @see #setWarmupRequestsEnabled(boolean)
	 * @generated
	 */
	void unsetWarmupRequestsEnabled();

	/**
	 * Returns whether the value of the '{@link gaeweb.AppengineWebAppType#isWarmupRequestsEnabled <em>Warmup Requests Enabled</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Warmup Requests Enabled</em>' attribute is set.
	 * @see #unsetWarmupRequestsEnabled()
	 * @see #isWarmupRequestsEnabled()
	 * @see #setWarmupRequestsEnabled(boolean)
	 * @generated
	 */
	boolean isSetWarmupRequestsEnabled();

	/**
	 * Returns the value of the '<em><b>Threadsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Threadsafe</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Threadsafe</em>' attribute.
	 * @see #isSetThreadsafe()
	 * @see #unsetThreadsafe()
	 * @see #setThreadsafe(boolean)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_Threadsafe()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='threadsafe' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isThreadsafe();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#isThreadsafe <em>Threadsafe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Threadsafe</em>' attribute.
	 * @see #isSetThreadsafe()
	 * @see #unsetThreadsafe()
	 * @see #isThreadsafe()
	 * @generated
	 */
	void setThreadsafe(boolean value);

	/**
	 * Unsets the value of the '{@link gaeweb.AppengineWebAppType#isThreadsafe <em>Threadsafe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetThreadsafe()
	 * @see #isThreadsafe()
	 * @see #setThreadsafe(boolean)
	 * @generated
	 */
	void unsetThreadsafe();

	/**
	 * Returns whether the value of the '{@link gaeweb.AppengineWebAppType#isThreadsafe <em>Threadsafe</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Threadsafe</em>' attribute is set.
	 * @see #unsetThreadsafe()
	 * @see #isThreadsafe()
	 * @see #setThreadsafe(boolean)
	 * @generated
	 */
	boolean isSetThreadsafe();

	/**
	 * Returns the value of the '<em><b>Auto Id Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Auto Id Policy</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Auto Id Policy</em>' attribute.
	 * @see #setAutoIdPolicy(String)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_AutoIdPolicy()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 *        extendedMetaData="kind='element' name='auto-id-policy' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAutoIdPolicy();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getAutoIdPolicy <em>Auto Id Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Auto Id Policy</em>' attribute.
	 * @see #getAutoIdPolicy()
	 * @generated
	 */
	void setAutoIdPolicy(String value);

	/**
	 * Returns the value of the '<em><b>Code Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Code Lock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Lock</em>' attribute.
	 * @see #isSetCodeLock()
	 * @see #unsetCodeLock()
	 * @see #setCodeLock(boolean)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_CodeLock()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='code-lock' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isCodeLock();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#isCodeLock <em>Code Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Lock</em>' attribute.
	 * @see #isSetCodeLock()
	 * @see #unsetCodeLock()
	 * @see #isCodeLock()
	 * @generated
	 */
	void setCodeLock(boolean value);

	/**
	 * Unsets the value of the '{@link gaeweb.AppengineWebAppType#isCodeLock <em>Code Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCodeLock()
	 * @see #isCodeLock()
	 * @see #setCodeLock(boolean)
	 * @generated
	 */
	void unsetCodeLock();

	/**
	 * Returns whether the value of the '{@link gaeweb.AppengineWebAppType#isCodeLock <em>Code Lock</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Code Lock</em>' attribute is set.
	 * @see #unsetCodeLock()
	 * @see #isCodeLock()
	 * @see #setCodeLock(boolean)
	 * @generated
	 */
	boolean isSetCodeLock();

	/**
	 * Returns the value of the '<em><b>Vm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Vm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vm</em>' attribute.
	 * @see #isSetVm()
	 * @see #unsetVm()
	 * @see #setVm(boolean)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_Vm()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='vm' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isVm();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#isVm <em>Vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vm</em>' attribute.
	 * @see #isSetVm()
	 * @see #unsetVm()
	 * @see #isVm()
	 * @generated
	 */
	void setVm(boolean value);

	/**
	 * Unsets the value of the '{@link gaeweb.AppengineWebAppType#isVm <em>Vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetVm()
	 * @see #isVm()
	 * @see #setVm(boolean)
	 * @generated
	 */
	void unsetVm();

	/**
	 * Returns whether the value of the '{@link gaeweb.AppengineWebAppType#isVm <em>Vm</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Vm</em>' attribute is set.
	 * @see #unsetVm()
	 * @see #isVm()
	 * @see #setVm(boolean)
	 * @generated
	 */
	boolean isSetVm();

	/**
	 * Returns the value of the '<em><b>Pagespeed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pagespeed</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pagespeed</em>' containment reference.
	 * @see #setPagespeed(PagespeedType)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_Pagespeed()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='pagespeed' namespace='##targetNamespace'"
	 * @generated
	 */
	PagespeedType getPagespeed();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getPagespeed <em>Pagespeed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pagespeed</em>' containment reference.
	 * @see #getPagespeed()
	 * @generated
	 */
	void setPagespeed(PagespeedType value);

	/**
	 * Returns the value of the '<em><b>Class Loader Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class Loader Config</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class Loader Config</em>' containment reference.
	 * @see #setClassLoaderConfig(ClassLoaderConfigType)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_ClassLoaderConfig()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='class-loader-config' namespace='##targetNamespace'"
	 * @generated
	 */
	ClassLoaderConfigType getClassLoaderConfig();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getClassLoaderConfig <em>Class Loader Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class Loader Config</em>' containment reference.
	 * @see #getClassLoaderConfig()
	 * @generated
	 */
	void setClassLoaderConfig(ClassLoaderConfigType value);

	/**
	 * Returns the value of the '<em><b>Url Stream Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url Stream Handler</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url Stream Handler</em>' attribute.
	 * @see #setUrlStreamHandler(String)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_UrlStreamHandler()
	 * @model dataType="gaeweb.UrlStreamHandlerType"
	 *        extendedMetaData="kind='element' name='url-stream-handler' namespace='##targetNamespace'"
	 * @generated
	 */
	String getUrlStreamHandler();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#getUrlStreamHandler <em>Url Stream Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Url Stream Handler</em>' attribute.
	 * @see #getUrlStreamHandler()
	 * @generated
	 */
	void setUrlStreamHandler(String value);

	/**
	 * Returns the value of the '<em><b>Use Google Connector J</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Google Connector J</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Google Connector J</em>' attribute.
	 * @see #isSetUseGoogleConnectorJ()
	 * @see #unsetUseGoogleConnectorJ()
	 * @see #setUseGoogleConnectorJ(boolean)
	 * @see gaeweb.GaewebPackage#getAppengineWebAppType_UseGoogleConnectorJ()
	 * @model unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='element' name='use-google-connector-j' namespace='##targetNamespace'"
	 * @generated
	 */
	boolean isUseGoogleConnectorJ();

	/**
	 * Sets the value of the '{@link gaeweb.AppengineWebAppType#isUseGoogleConnectorJ <em>Use Google Connector J</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Google Connector J</em>' attribute.
	 * @see #isSetUseGoogleConnectorJ()
	 * @see #unsetUseGoogleConnectorJ()
	 * @see #isUseGoogleConnectorJ()
	 * @generated
	 */
	void setUseGoogleConnectorJ(boolean value);

	/**
	 * Unsets the value of the '{@link gaeweb.AppengineWebAppType#isUseGoogleConnectorJ <em>Use Google Connector J</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetUseGoogleConnectorJ()
	 * @see #isUseGoogleConnectorJ()
	 * @see #setUseGoogleConnectorJ(boolean)
	 * @generated
	 */
	void unsetUseGoogleConnectorJ();

	/**
	 * Returns whether the value of the '{@link gaeweb.AppengineWebAppType#isUseGoogleConnectorJ <em>Use Google Connector J</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Use Google Connector J</em>' attribute is set.
	 * @see #unsetUseGoogleConnectorJ()
	 * @see #isUseGoogleConnectorJ()
	 * @see #setUseGoogleConnectorJ(boolean)
	 * @generated
	 */
	boolean isSetUseGoogleConnectorJ();

} // AppengineWebAppType
