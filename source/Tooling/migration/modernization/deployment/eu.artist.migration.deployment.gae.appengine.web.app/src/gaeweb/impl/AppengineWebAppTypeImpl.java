/**
 */
package gaeweb.impl;

import gaeweb.AdminConsole;
import gaeweb.AppengineWebAppType;
import gaeweb.AsyncSessionPersistenceType;
import gaeweb.AutomaticScalingType;
import gaeweb.BasicScalingType;
import gaeweb.ClassLoaderConfigType;
import gaeweb.EnvVariablesType;
import gaeweb.GaewebPackage;
import gaeweb.InboundServicesType;
import gaeweb.ManualScalingType;
import gaeweb.PagespeedType;
import gaeweb.ResourceFilesType;
import gaeweb.StaticErrorHandlers;
import gaeweb.StaticFilesType;
import gaeweb.SystemPropertiesType;
import gaeweb.UserPermissionsType;
import gaeweb.VmHealthCheckType;
import gaeweb.VmSettingsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Appengine Web App Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getApplication <em>Application</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getSourceLanguage <em>Source Language</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getModule <em>Module</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getInstanceClass <em>Instance Class</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getAutomaticScaling <em>Automatic Scaling</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getManualScaling <em>Manual Scaling</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getBasicScaling <em>Basic Scaling</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getStaticFiles <em>Static Files</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getResourceFiles <em>Resource Files</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getSystemProperties <em>System Properties</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getVmSettings <em>Vm Settings</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getVmHealthCheck <em>Vm Health Check</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getEnvVariables <em>Env Variables</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#isSslEnabled <em>Ssl Enabled</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#isSessionsEnabled <em>Sessions Enabled</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getAsyncSessionPersistence <em>Async Session Persistence</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getUserPermissions <em>User Permissions</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getPublicRoot <em>Public Root</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getInboundServices <em>Inbound Services</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#isPrecompilationEnabled <em>Precompilation Enabled</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getAdminConsole <em>Admin Console</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getStaticErrorHandlers <em>Static Error Handlers</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#isWarmupRequestsEnabled <em>Warmup Requests Enabled</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#isThreadsafe <em>Threadsafe</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getAutoIdPolicy <em>Auto Id Policy</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#isCodeLock <em>Code Lock</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#isVm <em>Vm</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getPagespeed <em>Pagespeed</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getClassLoaderConfig <em>Class Loader Config</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#getUrlStreamHandler <em>Url Stream Handler</em>}</li>
 *   <li>{@link gaeweb.impl.AppengineWebAppTypeImpl#isUseGoogleConnectorJ <em>Use Google Connector J</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AppengineWebAppTypeImpl extends MinimalEObjectImpl.Container implements AppengineWebAppType {
	/**
	 * The default value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected static final String APPLICATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getApplication() <em>Application</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplication()
	 * @generated
	 * @ordered
	 */
	protected String application = APPLICATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSourceLanguage() <em>Source Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSourceLanguage() <em>Source Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceLanguage()
	 * @generated
	 * @ordered
	 */
	protected String sourceLanguage = SOURCE_LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getModule() <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected static final String MODULE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getModule() <em>Module</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModule()
	 * @generated
	 * @ordered
	 */
	protected String module = MODULE_EDEFAULT;

	/**
	 * The default value of the '{@link #getInstanceClass() <em>Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClass()
	 * @generated
	 * @ordered
	 */
	protected static final String INSTANCE_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getInstanceClass() <em>Instance Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceClass()
	 * @generated
	 * @ordered
	 */
	protected String instanceClass = INSTANCE_CLASS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAutomaticScaling() <em>Automatic Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticScaling()
	 * @generated
	 * @ordered
	 */
	protected AutomaticScalingType automaticScaling;

	/**
	 * The cached value of the '{@link #getManualScaling() <em>Manual Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManualScaling()
	 * @generated
	 * @ordered
	 */
	protected ManualScalingType manualScaling;

	/**
	 * The cached value of the '{@link #getBasicScaling() <em>Basic Scaling</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicScaling()
	 * @generated
	 * @ordered
	 */
	protected BasicScalingType basicScaling;

	/**
	 * The cached value of the '{@link #getStaticFiles() <em>Static Files</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticFiles()
	 * @generated
	 * @ordered
	 */
	protected StaticFilesType staticFiles;

	/**
	 * The cached value of the '{@link #getResourceFiles() <em>Resource Files</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceFiles()
	 * @generated
	 * @ordered
	 */
	protected ResourceFilesType resourceFiles;

	/**
	 * The cached value of the '{@link #getSystemProperties() <em>System Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemProperties()
	 * @generated
	 * @ordered
	 */
	protected SystemPropertiesType systemProperties;

	/**
	 * The cached value of the '{@link #getVmSettings() <em>Vm Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmSettings()
	 * @generated
	 * @ordered
	 */
	protected VmSettingsType vmSettings;

	/**
	 * The cached value of the '{@link #getVmHealthCheck() <em>Vm Health Check</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmHealthCheck()
	 * @generated
	 * @ordered
	 */
	protected VmHealthCheckType vmHealthCheck;

	/**
	 * The cached value of the '{@link #getEnvVariables() <em>Env Variables</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvVariables()
	 * @generated
	 * @ordered
	 */
	protected EnvVariablesType envVariables;

	/**
	 * The default value of the '{@link #isSslEnabled() <em>Ssl Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSslEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SSL_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSslEnabled() <em>Ssl Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSslEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean sslEnabled = SSL_ENABLED_EDEFAULT;

	/**
	 * This is true if the Ssl Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sslEnabledESet;

	/**
	 * The default value of the '{@link #isSessionsEnabled() <em>Sessions Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSessionsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SESSIONS_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSessionsEnabled() <em>Sessions Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSessionsEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean sessionsEnabled = SESSIONS_ENABLED_EDEFAULT;

	/**
	 * This is true if the Sessions Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sessionsEnabledESet;

	/**
	 * The cached value of the '{@link #getAsyncSessionPersistence() <em>Async Session Persistence</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAsyncSessionPersistence()
	 * @generated
	 * @ordered
	 */
	protected AsyncSessionPersistenceType asyncSessionPersistence;

	/**
	 * The cached value of the '{@link #getUserPermissions() <em>User Permissions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserPermissions()
	 * @generated
	 * @ordered
	 */
	protected UserPermissionsType userPermissions;

	/**
	 * The default value of the '{@link #getPublicRoot() <em>Public Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicRoot()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBLIC_ROOT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPublicRoot() <em>Public Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicRoot()
	 * @generated
	 * @ordered
	 */
	protected String publicRoot = PUBLIC_ROOT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInboundServices() <em>Inbound Services</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInboundServices()
	 * @generated
	 * @ordered
	 */
	protected InboundServicesType inboundServices;

	/**
	 * The default value of the '{@link #isPrecompilationEnabled() <em>Precompilation Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrecompilationEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PRECOMPILATION_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPrecompilationEnabled() <em>Precompilation Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPrecompilationEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean precompilationEnabled = PRECOMPILATION_ENABLED_EDEFAULT;

	/**
	 * This is true if the Precompilation Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precompilationEnabledESet;

	/**
	 * The cached value of the '{@link #getAdminConsole() <em>Admin Console</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdminConsole()
	 * @generated
	 * @ordered
	 */
	protected AdminConsole adminConsole;

	/**
	 * The cached value of the '{@link #getStaticErrorHandlers() <em>Static Error Handlers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticErrorHandlers()
	 * @generated
	 * @ordered
	 */
	protected StaticErrorHandlers staticErrorHandlers;

	/**
	 * The default value of the '{@link #isWarmupRequestsEnabled() <em>Warmup Requests Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWarmupRequestsEnabled()
	 * @generated
	 * @ordered
	 */
	protected static final boolean WARMUP_REQUESTS_ENABLED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isWarmupRequestsEnabled() <em>Warmup Requests Enabled</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isWarmupRequestsEnabled()
	 * @generated
	 * @ordered
	 */
	protected boolean warmupRequestsEnabled = WARMUP_REQUESTS_ENABLED_EDEFAULT;

	/**
	 * This is true if the Warmup Requests Enabled attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean warmupRequestsEnabledESet;

	/**
	 * The default value of the '{@link #isThreadsafe() <em>Threadsafe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreadsafe()
	 * @generated
	 * @ordered
	 */
	protected static final boolean THREADSAFE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isThreadsafe() <em>Threadsafe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isThreadsafe()
	 * @generated
	 * @ordered
	 */
	protected boolean threadsafe = THREADSAFE_EDEFAULT;

	/**
	 * This is true if the Threadsafe attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean threadsafeESet;

	/**
	 * The default value of the '{@link #getAutoIdPolicy() <em>Auto Id Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoIdPolicy()
	 * @generated
	 * @ordered
	 */
	protected static final String AUTO_ID_POLICY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAutoIdPolicy() <em>Auto Id Policy</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoIdPolicy()
	 * @generated
	 * @ordered
	 */
	protected String autoIdPolicy = AUTO_ID_POLICY_EDEFAULT;

	/**
	 * The default value of the '{@link #isCodeLock() <em>Code Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCodeLock()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CODE_LOCK_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCodeLock() <em>Code Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCodeLock()
	 * @generated
	 * @ordered
	 */
	protected boolean codeLock = CODE_LOCK_EDEFAULT;

	/**
	 * This is true if the Code Lock attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean codeLockESet;

	/**
	 * The default value of the '{@link #isVm() <em>Vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVm()
	 * @generated
	 * @ordered
	 */
	protected static final boolean VM_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isVm() <em>Vm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isVm()
	 * @generated
	 * @ordered
	 */
	protected boolean vm = VM_EDEFAULT;

	/**
	 * This is true if the Vm attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vmESet;

	/**
	 * The cached value of the '{@link #getPagespeed() <em>Pagespeed</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagespeed()
	 * @generated
	 * @ordered
	 */
	protected PagespeedType pagespeed;

	/**
	 * The cached value of the '{@link #getClassLoaderConfig() <em>Class Loader Config</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassLoaderConfig()
	 * @generated
	 * @ordered
	 */
	protected ClassLoaderConfigType classLoaderConfig;

	/**
	 * The default value of the '{@link #getUrlStreamHandler() <em>Url Stream Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlStreamHandler()
	 * @generated
	 * @ordered
	 */
	protected static final String URL_STREAM_HANDLER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUrlStreamHandler() <em>Url Stream Handler</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrlStreamHandler()
	 * @generated
	 * @ordered
	 */
	protected String urlStreamHandler = URL_STREAM_HANDLER_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseGoogleConnectorJ() <em>Use Google Connector J</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseGoogleConnectorJ()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_GOOGLE_CONNECTOR_J_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseGoogleConnectorJ() <em>Use Google Connector J</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseGoogleConnectorJ()
	 * @generated
	 * @ordered
	 */
	protected boolean useGoogleConnectorJ = USE_GOOGLE_CONNECTOR_J_EDEFAULT;

	/**
	 * This is true if the Use Google Connector J attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean useGoogleConnectorJESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AppengineWebAppTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaewebPackage.Literals.APPENGINE_WEB_APP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getApplication() {
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplication(String newApplication) {
		String oldApplication = application;
		application = newApplication;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__APPLICATION, oldApplication, application));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSourceLanguage() {
		return sourceLanguage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceLanguage(String newSourceLanguage) {
		String oldSourceLanguage = sourceLanguage;
		sourceLanguage = newSourceLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__SOURCE_LANGUAGE, oldSourceLanguage, sourceLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getModule() {
		return module;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(String newModule) {
		String oldModule = module;
		module = newModule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__MODULE, oldModule, module));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getInstanceClass() {
		return instanceClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceClass(String newInstanceClass) {
		String oldInstanceClass = instanceClass;
		instanceClass = newInstanceClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__INSTANCE_CLASS, oldInstanceClass, instanceClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomaticScalingType getAutomaticScaling() {
		return automaticScaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutomaticScaling(AutomaticScalingType newAutomaticScaling, NotificationChain msgs) {
		AutomaticScalingType oldAutomaticScaling = automaticScaling;
		automaticScaling = newAutomaticScaling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__AUTOMATIC_SCALING, oldAutomaticScaling, newAutomaticScaling);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticScaling(AutomaticScalingType newAutomaticScaling) {
		if (newAutomaticScaling != automaticScaling) {
			NotificationChain msgs = null;
			if (automaticScaling != null)
				msgs = ((InternalEObject)automaticScaling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__AUTOMATIC_SCALING, null, msgs);
			if (newAutomaticScaling != null)
				msgs = ((InternalEObject)newAutomaticScaling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__AUTOMATIC_SCALING, null, msgs);
			msgs = basicSetAutomaticScaling(newAutomaticScaling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__AUTOMATIC_SCALING, newAutomaticScaling, newAutomaticScaling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManualScalingType getManualScaling() {
		return manualScaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetManualScaling(ManualScalingType newManualScaling, NotificationChain msgs) {
		ManualScalingType oldManualScaling = manualScaling;
		manualScaling = newManualScaling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__MANUAL_SCALING, oldManualScaling, newManualScaling);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManualScaling(ManualScalingType newManualScaling) {
		if (newManualScaling != manualScaling) {
			NotificationChain msgs = null;
			if (manualScaling != null)
				msgs = ((InternalEObject)manualScaling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__MANUAL_SCALING, null, msgs);
			if (newManualScaling != null)
				msgs = ((InternalEObject)newManualScaling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__MANUAL_SCALING, null, msgs);
			msgs = basicSetManualScaling(newManualScaling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__MANUAL_SCALING, newManualScaling, newManualScaling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicScalingType getBasicScaling() {
		return basicScaling;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasicScaling(BasicScalingType newBasicScaling, NotificationChain msgs) {
		BasicScalingType oldBasicScaling = basicScaling;
		basicScaling = newBasicScaling;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__BASIC_SCALING, oldBasicScaling, newBasicScaling);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasicScaling(BasicScalingType newBasicScaling) {
		if (newBasicScaling != basicScaling) {
			NotificationChain msgs = null;
			if (basicScaling != null)
				msgs = ((InternalEObject)basicScaling).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__BASIC_SCALING, null, msgs);
			if (newBasicScaling != null)
				msgs = ((InternalEObject)newBasicScaling).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__BASIC_SCALING, null, msgs);
			msgs = basicSetBasicScaling(newBasicScaling, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__BASIC_SCALING, newBasicScaling, newBasicScaling));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticFilesType getStaticFiles() {
		return staticFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticFiles(StaticFilesType newStaticFiles, NotificationChain msgs) {
		StaticFilesType oldStaticFiles = staticFiles;
		staticFiles = newStaticFiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_FILES, oldStaticFiles, newStaticFiles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticFiles(StaticFilesType newStaticFiles) {
		if (newStaticFiles != staticFiles) {
			NotificationChain msgs = null;
			if (staticFiles != null)
				msgs = ((InternalEObject)staticFiles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_FILES, null, msgs);
			if (newStaticFiles != null)
				msgs = ((InternalEObject)newStaticFiles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_FILES, null, msgs);
			msgs = basicSetStaticFiles(newStaticFiles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_FILES, newStaticFiles, newStaticFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceFilesType getResourceFiles() {
		return resourceFiles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResourceFiles(ResourceFilesType newResourceFiles, NotificationChain msgs) {
		ResourceFilesType oldResourceFiles = resourceFiles;
		resourceFiles = newResourceFiles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__RESOURCE_FILES, oldResourceFiles, newResourceFiles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResourceFiles(ResourceFilesType newResourceFiles) {
		if (newResourceFiles != resourceFiles) {
			NotificationChain msgs = null;
			if (resourceFiles != null)
				msgs = ((InternalEObject)resourceFiles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__RESOURCE_FILES, null, msgs);
			if (newResourceFiles != null)
				msgs = ((InternalEObject)newResourceFiles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__RESOURCE_FILES, null, msgs);
			msgs = basicSetResourceFiles(newResourceFiles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__RESOURCE_FILES, newResourceFiles, newResourceFiles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemPropertiesType getSystemProperties() {
		return systemProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSystemProperties(SystemPropertiesType newSystemProperties, NotificationChain msgs) {
		SystemPropertiesType oldSystemProperties = systemProperties;
		systemProperties = newSystemProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__SYSTEM_PROPERTIES, oldSystemProperties, newSystemProperties);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemProperties(SystemPropertiesType newSystemProperties) {
		if (newSystemProperties != systemProperties) {
			NotificationChain msgs = null;
			if (systemProperties != null)
				msgs = ((InternalEObject)systemProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__SYSTEM_PROPERTIES, null, msgs);
			if (newSystemProperties != null)
				msgs = ((InternalEObject)newSystemProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__SYSTEM_PROPERTIES, null, msgs);
			msgs = basicSetSystemProperties(newSystemProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__SYSTEM_PROPERTIES, newSystemProperties, newSystemProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmSettingsType getVmSettings() {
		return vmSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVmSettings(VmSettingsType newVmSettings, NotificationChain msgs) {
		VmSettingsType oldVmSettings = vmSettings;
		vmSettings = newVmSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_SETTINGS, oldVmSettings, newVmSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmSettings(VmSettingsType newVmSettings) {
		if (newVmSettings != vmSettings) {
			NotificationChain msgs = null;
			if (vmSettings != null)
				msgs = ((InternalEObject)vmSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_SETTINGS, null, msgs);
			if (newVmSettings != null)
				msgs = ((InternalEObject)newVmSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_SETTINGS, null, msgs);
			msgs = basicSetVmSettings(newVmSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_SETTINGS, newVmSettings, newVmSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmHealthCheckType getVmHealthCheck() {
		return vmHealthCheck;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVmHealthCheck(VmHealthCheckType newVmHealthCheck, NotificationChain msgs) {
		VmHealthCheckType oldVmHealthCheck = vmHealthCheck;
		vmHealthCheck = newVmHealthCheck;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_HEALTH_CHECK, oldVmHealthCheck, newVmHealthCheck);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmHealthCheck(VmHealthCheckType newVmHealthCheck) {
		if (newVmHealthCheck != vmHealthCheck) {
			NotificationChain msgs = null;
			if (vmHealthCheck != null)
				msgs = ((InternalEObject)vmHealthCheck).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_HEALTH_CHECK, null, msgs);
			if (newVmHealthCheck != null)
				msgs = ((InternalEObject)newVmHealthCheck).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_HEALTH_CHECK, null, msgs);
			msgs = basicSetVmHealthCheck(newVmHealthCheck, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_HEALTH_CHECK, newVmHealthCheck, newVmHealthCheck));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvVariablesType getEnvVariables() {
		return envVariables;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvVariables(EnvVariablesType newEnvVariables, NotificationChain msgs) {
		EnvVariablesType oldEnvVariables = envVariables;
		envVariables = newEnvVariables;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__ENV_VARIABLES, oldEnvVariables, newEnvVariables);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvVariables(EnvVariablesType newEnvVariables) {
		if (newEnvVariables != envVariables) {
			NotificationChain msgs = null;
			if (envVariables != null)
				msgs = ((InternalEObject)envVariables).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__ENV_VARIABLES, null, msgs);
			if (newEnvVariables != null)
				msgs = ((InternalEObject)newEnvVariables).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__ENV_VARIABLES, null, msgs);
			msgs = basicSetEnvVariables(newEnvVariables, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__ENV_VARIABLES, newEnvVariables, newEnvVariables));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSslEnabled() {
		return sslEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSslEnabled(boolean newSslEnabled) {
		boolean oldSslEnabled = sslEnabled;
		sslEnabled = newSslEnabled;
		boolean oldSslEnabledESet = sslEnabledESet;
		sslEnabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__SSL_ENABLED, oldSslEnabled, sslEnabled, !oldSslEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSslEnabled() {
		boolean oldSslEnabled = sslEnabled;
		boolean oldSslEnabledESet = sslEnabledESet;
		sslEnabled = SSL_ENABLED_EDEFAULT;
		sslEnabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GaewebPackage.APPENGINE_WEB_APP_TYPE__SSL_ENABLED, oldSslEnabled, SSL_ENABLED_EDEFAULT, oldSslEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSslEnabled() {
		return sslEnabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSessionsEnabled() {
		return sessionsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSessionsEnabled(boolean newSessionsEnabled) {
		boolean oldSessionsEnabled = sessionsEnabled;
		sessionsEnabled = newSessionsEnabled;
		boolean oldSessionsEnabledESet = sessionsEnabledESet;
		sessionsEnabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__SESSIONS_ENABLED, oldSessionsEnabled, sessionsEnabled, !oldSessionsEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSessionsEnabled() {
		boolean oldSessionsEnabled = sessionsEnabled;
		boolean oldSessionsEnabledESet = sessionsEnabledESet;
		sessionsEnabled = SESSIONS_ENABLED_EDEFAULT;
		sessionsEnabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GaewebPackage.APPENGINE_WEB_APP_TYPE__SESSIONS_ENABLED, oldSessionsEnabled, SESSIONS_ENABLED_EDEFAULT, oldSessionsEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSessionsEnabled() {
		return sessionsEnabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsyncSessionPersistenceType getAsyncSessionPersistence() {
		return asyncSessionPersistence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAsyncSessionPersistence(AsyncSessionPersistenceType newAsyncSessionPersistence, NotificationChain msgs) {
		AsyncSessionPersistenceType oldAsyncSessionPersistence = asyncSessionPersistence;
		asyncSessionPersistence = newAsyncSessionPersistence;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__ASYNC_SESSION_PERSISTENCE, oldAsyncSessionPersistence, newAsyncSessionPersistence);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAsyncSessionPersistence(AsyncSessionPersistenceType newAsyncSessionPersistence) {
		if (newAsyncSessionPersistence != asyncSessionPersistence) {
			NotificationChain msgs = null;
			if (asyncSessionPersistence != null)
				msgs = ((InternalEObject)asyncSessionPersistence).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__ASYNC_SESSION_PERSISTENCE, null, msgs);
			if (newAsyncSessionPersistence != null)
				msgs = ((InternalEObject)newAsyncSessionPersistence).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__ASYNC_SESSION_PERSISTENCE, null, msgs);
			msgs = basicSetAsyncSessionPersistence(newAsyncSessionPersistence, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__ASYNC_SESSION_PERSISTENCE, newAsyncSessionPersistence, newAsyncSessionPersistence));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserPermissionsType getUserPermissions() {
		return userPermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserPermissions(UserPermissionsType newUserPermissions, NotificationChain msgs) {
		UserPermissionsType oldUserPermissions = userPermissions;
		userPermissions = newUserPermissions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__USER_PERMISSIONS, oldUserPermissions, newUserPermissions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserPermissions(UserPermissionsType newUserPermissions) {
		if (newUserPermissions != userPermissions) {
			NotificationChain msgs = null;
			if (userPermissions != null)
				msgs = ((InternalEObject)userPermissions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__USER_PERMISSIONS, null, msgs);
			if (newUserPermissions != null)
				msgs = ((InternalEObject)newUserPermissions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__USER_PERMISSIONS, null, msgs);
			msgs = basicSetUserPermissions(newUserPermissions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__USER_PERMISSIONS, newUserPermissions, newUserPermissions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPublicRoot() {
		return publicRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicRoot(String newPublicRoot) {
		String oldPublicRoot = publicRoot;
		publicRoot = newPublicRoot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__PUBLIC_ROOT, oldPublicRoot, publicRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundServicesType getInboundServices() {
		return inboundServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInboundServices(InboundServicesType newInboundServices, NotificationChain msgs) {
		InboundServicesType oldInboundServices = inboundServices;
		inboundServices = newInboundServices;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__INBOUND_SERVICES, oldInboundServices, newInboundServices);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInboundServices(InboundServicesType newInboundServices) {
		if (newInboundServices != inboundServices) {
			NotificationChain msgs = null;
			if (inboundServices != null)
				msgs = ((InternalEObject)inboundServices).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__INBOUND_SERVICES, null, msgs);
			if (newInboundServices != null)
				msgs = ((InternalEObject)newInboundServices).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__INBOUND_SERVICES, null, msgs);
			msgs = basicSetInboundServices(newInboundServices, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__INBOUND_SERVICES, newInboundServices, newInboundServices));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPrecompilationEnabled() {
		return precompilationEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecompilationEnabled(boolean newPrecompilationEnabled) {
		boolean oldPrecompilationEnabled = precompilationEnabled;
		precompilationEnabled = newPrecompilationEnabled;
		boolean oldPrecompilationEnabledESet = precompilationEnabledESet;
		precompilationEnabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__PRECOMPILATION_ENABLED, oldPrecompilationEnabled, precompilationEnabled, !oldPrecompilationEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecompilationEnabled() {
		boolean oldPrecompilationEnabled = precompilationEnabled;
		boolean oldPrecompilationEnabledESet = precompilationEnabledESet;
		precompilationEnabled = PRECOMPILATION_ENABLED_EDEFAULT;
		precompilationEnabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GaewebPackage.APPENGINE_WEB_APP_TYPE__PRECOMPILATION_ENABLED, oldPrecompilationEnabled, PRECOMPILATION_ENABLED_EDEFAULT, oldPrecompilationEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecompilationEnabled() {
		return precompilationEnabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdminConsole getAdminConsole() {
		return adminConsole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdminConsole(AdminConsole newAdminConsole, NotificationChain msgs) {
		AdminConsole oldAdminConsole = adminConsole;
		adminConsole = newAdminConsole;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__ADMIN_CONSOLE, oldAdminConsole, newAdminConsole);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdminConsole(AdminConsole newAdminConsole) {
		if (newAdminConsole != adminConsole) {
			NotificationChain msgs = null;
			if (adminConsole != null)
				msgs = ((InternalEObject)adminConsole).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__ADMIN_CONSOLE, null, msgs);
			if (newAdminConsole != null)
				msgs = ((InternalEObject)newAdminConsole).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__ADMIN_CONSOLE, null, msgs);
			msgs = basicSetAdminConsole(newAdminConsole, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__ADMIN_CONSOLE, newAdminConsole, newAdminConsole));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticErrorHandlers getStaticErrorHandlers() {
		return staticErrorHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStaticErrorHandlers(StaticErrorHandlers newStaticErrorHandlers, NotificationChain msgs) {
		StaticErrorHandlers oldStaticErrorHandlers = staticErrorHandlers;
		staticErrorHandlers = newStaticErrorHandlers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_ERROR_HANDLERS, oldStaticErrorHandlers, newStaticErrorHandlers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticErrorHandlers(StaticErrorHandlers newStaticErrorHandlers) {
		if (newStaticErrorHandlers != staticErrorHandlers) {
			NotificationChain msgs = null;
			if (staticErrorHandlers != null)
				msgs = ((InternalEObject)staticErrorHandlers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_ERROR_HANDLERS, null, msgs);
			if (newStaticErrorHandlers != null)
				msgs = ((InternalEObject)newStaticErrorHandlers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_ERROR_HANDLERS, null, msgs);
			msgs = basicSetStaticErrorHandlers(newStaticErrorHandlers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_ERROR_HANDLERS, newStaticErrorHandlers, newStaticErrorHandlers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isWarmupRequestsEnabled() {
		return warmupRequestsEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWarmupRequestsEnabled(boolean newWarmupRequestsEnabled) {
		boolean oldWarmupRequestsEnabled = warmupRequestsEnabled;
		warmupRequestsEnabled = newWarmupRequestsEnabled;
		boolean oldWarmupRequestsEnabledESet = warmupRequestsEnabledESet;
		warmupRequestsEnabledESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__WARMUP_REQUESTS_ENABLED, oldWarmupRequestsEnabled, warmupRequestsEnabled, !oldWarmupRequestsEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetWarmupRequestsEnabled() {
		boolean oldWarmupRequestsEnabled = warmupRequestsEnabled;
		boolean oldWarmupRequestsEnabledESet = warmupRequestsEnabledESet;
		warmupRequestsEnabled = WARMUP_REQUESTS_ENABLED_EDEFAULT;
		warmupRequestsEnabledESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GaewebPackage.APPENGINE_WEB_APP_TYPE__WARMUP_REQUESTS_ENABLED, oldWarmupRequestsEnabled, WARMUP_REQUESTS_ENABLED_EDEFAULT, oldWarmupRequestsEnabledESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetWarmupRequestsEnabled() {
		return warmupRequestsEnabledESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isThreadsafe() {
		return threadsafe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThreadsafe(boolean newThreadsafe) {
		boolean oldThreadsafe = threadsafe;
		threadsafe = newThreadsafe;
		boolean oldThreadsafeESet = threadsafeESet;
		threadsafeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__THREADSAFE, oldThreadsafe, threadsafe, !oldThreadsafeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetThreadsafe() {
		boolean oldThreadsafe = threadsafe;
		boolean oldThreadsafeESet = threadsafeESet;
		threadsafe = THREADSAFE_EDEFAULT;
		threadsafeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GaewebPackage.APPENGINE_WEB_APP_TYPE__THREADSAFE, oldThreadsafe, THREADSAFE_EDEFAULT, oldThreadsafeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetThreadsafe() {
		return threadsafeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAutoIdPolicy() {
		return autoIdPolicy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoIdPolicy(String newAutoIdPolicy) {
		String oldAutoIdPolicy = autoIdPolicy;
		autoIdPolicy = newAutoIdPolicy;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__AUTO_ID_POLICY, oldAutoIdPolicy, autoIdPolicy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCodeLock() {
		return codeLock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeLock(boolean newCodeLock) {
		boolean oldCodeLock = codeLock;
		codeLock = newCodeLock;
		boolean oldCodeLockESet = codeLockESet;
		codeLockESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__CODE_LOCK, oldCodeLock, codeLock, !oldCodeLockESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCodeLock() {
		boolean oldCodeLock = codeLock;
		boolean oldCodeLockESet = codeLockESet;
		codeLock = CODE_LOCK_EDEFAULT;
		codeLockESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GaewebPackage.APPENGINE_WEB_APP_TYPE__CODE_LOCK, oldCodeLock, CODE_LOCK_EDEFAULT, oldCodeLockESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCodeLock() {
		return codeLockESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isVm() {
		return vm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVm(boolean newVm) {
		boolean oldVm = vm;
		vm = newVm;
		boolean oldVmESet = vmESet;
		vmESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__VM, oldVm, vm, !oldVmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVm() {
		boolean oldVm = vm;
		boolean oldVmESet = vmESet;
		vm = VM_EDEFAULT;
		vmESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GaewebPackage.APPENGINE_WEB_APP_TYPE__VM, oldVm, VM_EDEFAULT, oldVmESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVm() {
		return vmESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagespeedType getPagespeed() {
		return pagespeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPagespeed(PagespeedType newPagespeed, NotificationChain msgs) {
		PagespeedType oldPagespeed = pagespeed;
		pagespeed = newPagespeed;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__PAGESPEED, oldPagespeed, newPagespeed);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPagespeed(PagespeedType newPagespeed) {
		if (newPagespeed != pagespeed) {
			NotificationChain msgs = null;
			if (pagespeed != null)
				msgs = ((InternalEObject)pagespeed).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__PAGESPEED, null, msgs);
			if (newPagespeed != null)
				msgs = ((InternalEObject)newPagespeed).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__PAGESPEED, null, msgs);
			msgs = basicSetPagespeed(newPagespeed, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__PAGESPEED, newPagespeed, newPagespeed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassLoaderConfigType getClassLoaderConfig() {
		return classLoaderConfig;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClassLoaderConfig(ClassLoaderConfigType newClassLoaderConfig, NotificationChain msgs) {
		ClassLoaderConfigType oldClassLoaderConfig = classLoaderConfig;
		classLoaderConfig = newClassLoaderConfig;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__CLASS_LOADER_CONFIG, oldClassLoaderConfig, newClassLoaderConfig);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClassLoaderConfig(ClassLoaderConfigType newClassLoaderConfig) {
		if (newClassLoaderConfig != classLoaderConfig) {
			NotificationChain msgs = null;
			if (classLoaderConfig != null)
				msgs = ((InternalEObject)classLoaderConfig).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__CLASS_LOADER_CONFIG, null, msgs);
			if (newClassLoaderConfig != null)
				msgs = ((InternalEObject)newClassLoaderConfig).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GaewebPackage.APPENGINE_WEB_APP_TYPE__CLASS_LOADER_CONFIG, null, msgs);
			msgs = basicSetClassLoaderConfig(newClassLoaderConfig, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__CLASS_LOADER_CONFIG, newClassLoaderConfig, newClassLoaderConfig));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUrlStreamHandler() {
		return urlStreamHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUrlStreamHandler(String newUrlStreamHandler) {
		String oldUrlStreamHandler = urlStreamHandler;
		urlStreamHandler = newUrlStreamHandler;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__URL_STREAM_HANDLER, oldUrlStreamHandler, urlStreamHandler));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseGoogleConnectorJ() {
		return useGoogleConnectorJ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseGoogleConnectorJ(boolean newUseGoogleConnectorJ) {
		boolean oldUseGoogleConnectorJ = useGoogleConnectorJ;
		useGoogleConnectorJ = newUseGoogleConnectorJ;
		boolean oldUseGoogleConnectorJESet = useGoogleConnectorJESet;
		useGoogleConnectorJESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.APPENGINE_WEB_APP_TYPE__USE_GOOGLE_CONNECTOR_J, oldUseGoogleConnectorJ, useGoogleConnectorJ, !oldUseGoogleConnectorJESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUseGoogleConnectorJ() {
		boolean oldUseGoogleConnectorJ = useGoogleConnectorJ;
		boolean oldUseGoogleConnectorJESet = useGoogleConnectorJESet;
		useGoogleConnectorJ = USE_GOOGLE_CONNECTOR_J_EDEFAULT;
		useGoogleConnectorJESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, GaewebPackage.APPENGINE_WEB_APP_TYPE__USE_GOOGLE_CONNECTOR_J, oldUseGoogleConnectorJ, USE_GOOGLE_CONNECTOR_J_EDEFAULT, oldUseGoogleConnectorJESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUseGoogleConnectorJ() {
		return useGoogleConnectorJESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__AUTOMATIC_SCALING:
				return basicSetAutomaticScaling(null, msgs);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__MANUAL_SCALING:
				return basicSetManualScaling(null, msgs);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__BASIC_SCALING:
				return basicSetBasicScaling(null, msgs);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_FILES:
				return basicSetStaticFiles(null, msgs);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__RESOURCE_FILES:
				return basicSetResourceFiles(null, msgs);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__SYSTEM_PROPERTIES:
				return basicSetSystemProperties(null, msgs);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_SETTINGS:
				return basicSetVmSettings(null, msgs);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_HEALTH_CHECK:
				return basicSetVmHealthCheck(null, msgs);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__ENV_VARIABLES:
				return basicSetEnvVariables(null, msgs);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__ASYNC_SESSION_PERSISTENCE:
				return basicSetAsyncSessionPersistence(null, msgs);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__USER_PERMISSIONS:
				return basicSetUserPermissions(null, msgs);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__INBOUND_SERVICES:
				return basicSetInboundServices(null, msgs);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__ADMIN_CONSOLE:
				return basicSetAdminConsole(null, msgs);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_ERROR_HANDLERS:
				return basicSetStaticErrorHandlers(null, msgs);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__PAGESPEED:
				return basicSetPagespeed(null, msgs);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__CLASS_LOADER_CONFIG:
				return basicSetClassLoaderConfig(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__APPLICATION:
				return getApplication();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VERSION:
				return getVersion();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__SOURCE_LANGUAGE:
				return getSourceLanguage();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__MODULE:
				return getModule();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__INSTANCE_CLASS:
				return getInstanceClass();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__AUTOMATIC_SCALING:
				return getAutomaticScaling();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__MANUAL_SCALING:
				return getManualScaling();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__BASIC_SCALING:
				return getBasicScaling();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_FILES:
				return getStaticFiles();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__RESOURCE_FILES:
				return getResourceFiles();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__SYSTEM_PROPERTIES:
				return getSystemProperties();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_SETTINGS:
				return getVmSettings();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_HEALTH_CHECK:
				return getVmHealthCheck();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__ENV_VARIABLES:
				return getEnvVariables();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__SSL_ENABLED:
				return isSslEnabled();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__SESSIONS_ENABLED:
				return isSessionsEnabled();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__ASYNC_SESSION_PERSISTENCE:
				return getAsyncSessionPersistence();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__USER_PERMISSIONS:
				return getUserPermissions();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__PUBLIC_ROOT:
				return getPublicRoot();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__INBOUND_SERVICES:
				return getInboundServices();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__PRECOMPILATION_ENABLED:
				return isPrecompilationEnabled();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__ADMIN_CONSOLE:
				return getAdminConsole();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_ERROR_HANDLERS:
				return getStaticErrorHandlers();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__WARMUP_REQUESTS_ENABLED:
				return isWarmupRequestsEnabled();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__THREADSAFE:
				return isThreadsafe();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__AUTO_ID_POLICY:
				return getAutoIdPolicy();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__CODE_LOCK:
				return isCodeLock();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VM:
				return isVm();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__PAGESPEED:
				return getPagespeed();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__CLASS_LOADER_CONFIG:
				return getClassLoaderConfig();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__URL_STREAM_HANDLER:
				return getUrlStreamHandler();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__USE_GOOGLE_CONNECTOR_J:
				return isUseGoogleConnectorJ();
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
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__APPLICATION:
				setApplication((String)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__SOURCE_LANGUAGE:
				setSourceLanguage((String)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__MODULE:
				setModule((String)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__INSTANCE_CLASS:
				setInstanceClass((String)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__AUTOMATIC_SCALING:
				setAutomaticScaling((AutomaticScalingType)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__MANUAL_SCALING:
				setManualScaling((ManualScalingType)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__BASIC_SCALING:
				setBasicScaling((BasicScalingType)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_FILES:
				setStaticFiles((StaticFilesType)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__RESOURCE_FILES:
				setResourceFiles((ResourceFilesType)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__SYSTEM_PROPERTIES:
				setSystemProperties((SystemPropertiesType)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_SETTINGS:
				setVmSettings((VmSettingsType)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_HEALTH_CHECK:
				setVmHealthCheck((VmHealthCheckType)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__ENV_VARIABLES:
				setEnvVariables((EnvVariablesType)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__SSL_ENABLED:
				setSslEnabled((Boolean)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__SESSIONS_ENABLED:
				setSessionsEnabled((Boolean)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__ASYNC_SESSION_PERSISTENCE:
				setAsyncSessionPersistence((AsyncSessionPersistenceType)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__USER_PERMISSIONS:
				setUserPermissions((UserPermissionsType)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__PUBLIC_ROOT:
				setPublicRoot((String)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__INBOUND_SERVICES:
				setInboundServices((InboundServicesType)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__PRECOMPILATION_ENABLED:
				setPrecompilationEnabled((Boolean)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__ADMIN_CONSOLE:
				setAdminConsole((AdminConsole)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_ERROR_HANDLERS:
				setStaticErrorHandlers((StaticErrorHandlers)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__WARMUP_REQUESTS_ENABLED:
				setWarmupRequestsEnabled((Boolean)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__THREADSAFE:
				setThreadsafe((Boolean)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__AUTO_ID_POLICY:
				setAutoIdPolicy((String)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__CODE_LOCK:
				setCodeLock((Boolean)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VM:
				setVm((Boolean)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__PAGESPEED:
				setPagespeed((PagespeedType)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__CLASS_LOADER_CONFIG:
				setClassLoaderConfig((ClassLoaderConfigType)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__URL_STREAM_HANDLER:
				setUrlStreamHandler((String)newValue);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__USE_GOOGLE_CONNECTOR_J:
				setUseGoogleConnectorJ((Boolean)newValue);
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
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__APPLICATION:
				setApplication(APPLICATION_EDEFAULT);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__SOURCE_LANGUAGE:
				setSourceLanguage(SOURCE_LANGUAGE_EDEFAULT);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__MODULE:
				setModule(MODULE_EDEFAULT);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__INSTANCE_CLASS:
				setInstanceClass(INSTANCE_CLASS_EDEFAULT);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__AUTOMATIC_SCALING:
				setAutomaticScaling((AutomaticScalingType)null);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__MANUAL_SCALING:
				setManualScaling((ManualScalingType)null);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__BASIC_SCALING:
				setBasicScaling((BasicScalingType)null);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_FILES:
				setStaticFiles((StaticFilesType)null);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__RESOURCE_FILES:
				setResourceFiles((ResourceFilesType)null);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__SYSTEM_PROPERTIES:
				setSystemProperties((SystemPropertiesType)null);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_SETTINGS:
				setVmSettings((VmSettingsType)null);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_HEALTH_CHECK:
				setVmHealthCheck((VmHealthCheckType)null);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__ENV_VARIABLES:
				setEnvVariables((EnvVariablesType)null);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__SSL_ENABLED:
				unsetSslEnabled();
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__SESSIONS_ENABLED:
				unsetSessionsEnabled();
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__ASYNC_SESSION_PERSISTENCE:
				setAsyncSessionPersistence((AsyncSessionPersistenceType)null);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__USER_PERMISSIONS:
				setUserPermissions((UserPermissionsType)null);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__PUBLIC_ROOT:
				setPublicRoot(PUBLIC_ROOT_EDEFAULT);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__INBOUND_SERVICES:
				setInboundServices((InboundServicesType)null);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__PRECOMPILATION_ENABLED:
				unsetPrecompilationEnabled();
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__ADMIN_CONSOLE:
				setAdminConsole((AdminConsole)null);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_ERROR_HANDLERS:
				setStaticErrorHandlers((StaticErrorHandlers)null);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__WARMUP_REQUESTS_ENABLED:
				unsetWarmupRequestsEnabled();
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__THREADSAFE:
				unsetThreadsafe();
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__AUTO_ID_POLICY:
				setAutoIdPolicy(AUTO_ID_POLICY_EDEFAULT);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__CODE_LOCK:
				unsetCodeLock();
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VM:
				unsetVm();
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__PAGESPEED:
				setPagespeed((PagespeedType)null);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__CLASS_LOADER_CONFIG:
				setClassLoaderConfig((ClassLoaderConfigType)null);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__URL_STREAM_HANDLER:
				setUrlStreamHandler(URL_STREAM_HANDLER_EDEFAULT);
				return;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__USE_GOOGLE_CONNECTOR_J:
				unsetUseGoogleConnectorJ();
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
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__APPLICATION:
				return APPLICATION_EDEFAULT == null ? application != null : !APPLICATION_EDEFAULT.equals(application);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__SOURCE_LANGUAGE:
				return SOURCE_LANGUAGE_EDEFAULT == null ? sourceLanguage != null : !SOURCE_LANGUAGE_EDEFAULT.equals(sourceLanguage);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__MODULE:
				return MODULE_EDEFAULT == null ? module != null : !MODULE_EDEFAULT.equals(module);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__INSTANCE_CLASS:
				return INSTANCE_CLASS_EDEFAULT == null ? instanceClass != null : !INSTANCE_CLASS_EDEFAULT.equals(instanceClass);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__AUTOMATIC_SCALING:
				return automaticScaling != null;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__MANUAL_SCALING:
				return manualScaling != null;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__BASIC_SCALING:
				return basicScaling != null;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_FILES:
				return staticFiles != null;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__RESOURCE_FILES:
				return resourceFiles != null;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__SYSTEM_PROPERTIES:
				return systemProperties != null;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_SETTINGS:
				return vmSettings != null;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VM_HEALTH_CHECK:
				return vmHealthCheck != null;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__ENV_VARIABLES:
				return envVariables != null;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__SSL_ENABLED:
				return isSetSslEnabled();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__SESSIONS_ENABLED:
				return isSetSessionsEnabled();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__ASYNC_SESSION_PERSISTENCE:
				return asyncSessionPersistence != null;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__USER_PERMISSIONS:
				return userPermissions != null;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__PUBLIC_ROOT:
				return PUBLIC_ROOT_EDEFAULT == null ? publicRoot != null : !PUBLIC_ROOT_EDEFAULT.equals(publicRoot);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__INBOUND_SERVICES:
				return inboundServices != null;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__PRECOMPILATION_ENABLED:
				return isSetPrecompilationEnabled();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__ADMIN_CONSOLE:
				return adminConsole != null;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__STATIC_ERROR_HANDLERS:
				return staticErrorHandlers != null;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__WARMUP_REQUESTS_ENABLED:
				return isSetWarmupRequestsEnabled();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__THREADSAFE:
				return isSetThreadsafe();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__AUTO_ID_POLICY:
				return AUTO_ID_POLICY_EDEFAULT == null ? autoIdPolicy != null : !AUTO_ID_POLICY_EDEFAULT.equals(autoIdPolicy);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__CODE_LOCK:
				return isSetCodeLock();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__VM:
				return isSetVm();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__PAGESPEED:
				return pagespeed != null;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__CLASS_LOADER_CONFIG:
				return classLoaderConfig != null;
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__URL_STREAM_HANDLER:
				return URL_STREAM_HANDLER_EDEFAULT == null ? urlStreamHandler != null : !URL_STREAM_HANDLER_EDEFAULT.equals(urlStreamHandler);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE__USE_GOOGLE_CONNECTOR_J:
				return isSetUseGoogleConnectorJ();
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
		result.append(" (application: ");
		result.append(application);
		result.append(", version: ");
		result.append(version);
		result.append(", sourceLanguage: ");
		result.append(sourceLanguage);
		result.append(", module: ");
		result.append(module);
		result.append(", instanceClass: ");
		result.append(instanceClass);
		result.append(", sslEnabled: ");
		if (sslEnabledESet) result.append(sslEnabled); else result.append("<unset>");
		result.append(", sessionsEnabled: ");
		if (sessionsEnabledESet) result.append(sessionsEnabled); else result.append("<unset>");
		result.append(", publicRoot: ");
		result.append(publicRoot);
		result.append(", precompilationEnabled: ");
		if (precompilationEnabledESet) result.append(precompilationEnabled); else result.append("<unset>");
		result.append(", warmupRequestsEnabled: ");
		if (warmupRequestsEnabledESet) result.append(warmupRequestsEnabled); else result.append("<unset>");
		result.append(", threadsafe: ");
		if (threadsafeESet) result.append(threadsafe); else result.append("<unset>");
		result.append(", autoIdPolicy: ");
		result.append(autoIdPolicy);
		result.append(", codeLock: ");
		if (codeLockESet) result.append(codeLock); else result.append("<unset>");
		result.append(", vm: ");
		if (vmESet) result.append(vm); else result.append("<unset>");
		result.append(", urlStreamHandler: ");
		result.append(urlStreamHandler);
		result.append(", useGoogleConnectorJ: ");
		if (useGoogleConnectorJESet) result.append(useGoogleConnectorJ); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //AppengineWebAppTypeImpl
