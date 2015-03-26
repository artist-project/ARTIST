/**
 */
package gaeweb;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
 * @see gaeweb.GaewebFactory
 * @model kind="package"
 * @generated
 */
public interface GaewebPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "gaeweb";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://appengine.google.com/ns/1.0/appengine-web-app";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "gaeweb";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GaewebPackage eINSTANCE = gaeweb.impl.GaewebPackageImpl.init();

	/**
	 * The meta object id for the '{@link gaeweb.impl.AdminConsoleImpl <em>Admin Console</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.AdminConsoleImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getAdminConsole()
	 * @generated
	 */
	int ADMIN_CONSOLE = 0;

	/**
	 * The feature id for the '<em><b>Page</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONSOLE__PAGE = 0;

	/**
	 * The number of structural features of the '<em>Admin Console</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONSOLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Admin Console</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONSOLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.AdminConsolePageTypeImpl <em>Admin Console Page Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.AdminConsolePageTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getAdminConsolePageType()
	 * @generated
	 */
	int ADMIN_CONSOLE_PAGE_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONSOLE_PAGE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONSOLE_PAGE_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONSOLE_PAGE_TYPE__URL = 2;

	/**
	 * The number of structural features of the '<em>Admin Console Page Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONSOLE_PAGE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Admin Console Page Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_CONSOLE_PAGE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.AppengineWebAppTypeImpl <em>Appengine Web App Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.AppengineWebAppTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getAppengineWebAppType()
	 * @generated
	 */
	int APPENGINE_WEB_APP_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Application</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__APPLICATION = 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__VERSION = 1;

	/**
	 * The feature id for the '<em><b>Source Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__SOURCE_LANGUAGE = 2;

	/**
	 * The feature id for the '<em><b>Module</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__MODULE = 3;

	/**
	 * The feature id for the '<em><b>Instance Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__INSTANCE_CLASS = 4;

	/**
	 * The feature id for the '<em><b>Automatic Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__AUTOMATIC_SCALING = 5;

	/**
	 * The feature id for the '<em><b>Manual Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__MANUAL_SCALING = 6;

	/**
	 * The feature id for the '<em><b>Basic Scaling</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__BASIC_SCALING = 7;

	/**
	 * The feature id for the '<em><b>Static Files</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__STATIC_FILES = 8;

	/**
	 * The feature id for the '<em><b>Resource Files</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__RESOURCE_FILES = 9;

	/**
	 * The feature id for the '<em><b>System Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__SYSTEM_PROPERTIES = 10;

	/**
	 * The feature id for the '<em><b>Vm Settings</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__VM_SETTINGS = 11;

	/**
	 * The feature id for the '<em><b>Vm Health Check</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__VM_HEALTH_CHECK = 12;

	/**
	 * The feature id for the '<em><b>Env Variables</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__ENV_VARIABLES = 13;

	/**
	 * The feature id for the '<em><b>Ssl Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__SSL_ENABLED = 14;

	/**
	 * The feature id for the '<em><b>Sessions Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__SESSIONS_ENABLED = 15;

	/**
	 * The feature id for the '<em><b>Async Session Persistence</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__ASYNC_SESSION_PERSISTENCE = 16;

	/**
	 * The feature id for the '<em><b>User Permissions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__USER_PERMISSIONS = 17;

	/**
	 * The feature id for the '<em><b>Public Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__PUBLIC_ROOT = 18;

	/**
	 * The feature id for the '<em><b>Inbound Services</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__INBOUND_SERVICES = 19;

	/**
	 * The feature id for the '<em><b>Precompilation Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__PRECOMPILATION_ENABLED = 20;

	/**
	 * The feature id for the '<em><b>Admin Console</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__ADMIN_CONSOLE = 21;

	/**
	 * The feature id for the '<em><b>Static Error Handlers</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__STATIC_ERROR_HANDLERS = 22;

	/**
	 * The feature id for the '<em><b>Warmup Requests Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__WARMUP_REQUESTS_ENABLED = 23;

	/**
	 * The feature id for the '<em><b>Threadsafe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__THREADSAFE = 24;

	/**
	 * The feature id for the '<em><b>Auto Id Policy</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__AUTO_ID_POLICY = 25;

	/**
	 * The feature id for the '<em><b>Code Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__CODE_LOCK = 26;

	/**
	 * The feature id for the '<em><b>Vm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__VM = 27;

	/**
	 * The feature id for the '<em><b>Pagespeed</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__PAGESPEED = 28;

	/**
	 * The feature id for the '<em><b>Class Loader Config</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__CLASS_LOADER_CONFIG = 29;

	/**
	 * The feature id for the '<em><b>Url Stream Handler</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__URL_STREAM_HANDLER = 30;

	/**
	 * The feature id for the '<em><b>Use Google Connector J</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE__USE_GOOGLE_CONNECTOR_J = 31;

	/**
	 * The number of structural features of the '<em>Appengine Web App Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE_FEATURE_COUNT = 32;

	/**
	 * The number of operations of the '<em>Appengine Web App Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPENGINE_WEB_APP_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.AsyncSessionPersistenceTypeImpl <em>Async Session Persistence Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.AsyncSessionPersistenceTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getAsyncSessionPersistenceType()
	 * @generated
	 */
	int ASYNC_SESSION_PERSISTENCE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_SESSION_PERSISTENCE_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Enabled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_SESSION_PERSISTENCE_TYPE__ENABLED = 1;

	/**
	 * The feature id for the '<em><b>Queue Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_SESSION_PERSISTENCE_TYPE__QUEUE_NAME = 2;

	/**
	 * The number of structural features of the '<em>Async Session Persistence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_SESSION_PERSISTENCE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Async Session Persistence Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASYNC_SESSION_PERSISTENCE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.AutomaticScalingTypeImpl <em>Automatic Scaling Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.AutomaticScalingTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getAutomaticScalingType()
	 * @generated
	 */
	int AUTOMATIC_SCALING_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Min Pending Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_SCALING_TYPE__MIN_PENDING_LATENCY = 0;

	/**
	 * The feature id for the '<em><b>Max Pending Latency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_SCALING_TYPE__MAX_PENDING_LATENCY = 1;

	/**
	 * The feature id for the '<em><b>Min Idle Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_SCALING_TYPE__MIN_IDLE_INSTANCES = 2;

	/**
	 * The feature id for the '<em><b>Max Idle Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_SCALING_TYPE__MAX_IDLE_INSTANCES = 3;

	/**
	 * The feature id for the '<em><b>Max Concurrent Requests</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_SCALING_TYPE__MAX_CONCURRENT_REQUESTS = 4;

	/**
	 * The feature id for the '<em><b>Min Num Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_SCALING_TYPE__MIN_NUM_INSTANCES = 5;

	/**
	 * The feature id for the '<em><b>Max Num Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_SCALING_TYPE__MAX_NUM_INSTANCES = 6;

	/**
	 * The feature id for the '<em><b>Cool Down Period Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_SCALING_TYPE__COOL_DOWN_PERIOD_SEC = 7;

	/**
	 * The feature id for the '<em><b>Cpu Utilization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_SCALING_TYPE__CPU_UTILIZATION = 8;

	/**
	 * The number of structural features of the '<em>Automatic Scaling Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_SCALING_TYPE_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Automatic Scaling Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTOMATIC_SCALING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.BasicScalingTypeImpl <em>Basic Scaling Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.BasicScalingTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getBasicScalingType()
	 * @generated
	 */
	int BASIC_SCALING_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Max Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SCALING_TYPE__MAX_INSTANCES = 0;

	/**
	 * The feature id for the '<em><b>Idle Timeout</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SCALING_TYPE__IDLE_TIMEOUT = 1;

	/**
	 * The number of structural features of the '<em>Basic Scaling Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SCALING_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Basic Scaling Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASIC_SCALING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.ClassLoaderConfigTypeImpl <em>Class Loader Config Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.ClassLoaderConfigTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getClassLoaderConfigType()
	 * @generated
	 */
	int CLASS_LOADER_CONFIG_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Priority Specifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER_CONFIG_TYPE__PRIORITY_SPECIFIER = 0;

	/**
	 * The number of structural features of the '<em>Class Loader Config Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER_CONFIG_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Class Loader Config Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_LOADER_CONFIG_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.CpuUtilizationTypeImpl <em>Cpu Utilization Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.CpuUtilizationTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getCpuUtilizationType()
	 * @generated
	 */
	int CPU_UTILIZATION_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Target Utilization</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_UTILIZATION_TYPE__TARGET_UTILIZATION = 0;

	/**
	 * The feature id for the '<em><b>Aggregation Window Length Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_UTILIZATION_TYPE__AGGREGATION_WINDOW_LENGTH_SEC = 1;

	/**
	 * The number of structural features of the '<em>Cpu Utilization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_UTILIZATION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Cpu Utilization Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CPU_UTILIZATION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.DocumentRootImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 8;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Appengine Web App</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__APPENGINE_WEB_APP = 3;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.EnvVariablesTypeImpl <em>Env Variables Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.EnvVariablesTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getEnvVariablesType()
	 * @generated
	 */
	int ENV_VARIABLES_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Env Var</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VARIABLES_TYPE__ENV_VAR = 0;

	/**
	 * The number of structural features of the '<em>Env Variables Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VARIABLES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Env Variables Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VARIABLES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.EnvVarTypeImpl <em>Env Var Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.EnvVarTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getEnvVarType()
	 * @generated
	 */
	int ENV_VAR_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR_TYPE__VALUE1 = 2;

	/**
	 * The number of structural features of the '<em>Env Var Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Env Var Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENV_VAR_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.ExcludeTypeImpl <em>Exclude Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.ExcludeTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getExcludeType()
	 * @generated
	 */
	int EXCLUDE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_TYPE__PATH = 0;

	/**
	 * The number of structural features of the '<em>Exclude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Exclude Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXCLUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.HttpHeaderTypeImpl <em>Http Header Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.HttpHeaderTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getHttpHeaderType()
	 * @generated
	 */
	int HTTP_HEADER_TYPE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HEADER_TYPE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HEADER_TYPE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Http Header Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HEADER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Http Header Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HTTP_HEADER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.InboundServicesTypeImpl <em>Inbound Services Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.InboundServicesTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getInboundServicesType()
	 * @generated
	 */
	int INBOUND_SERVICES_TYPE = 13;

	/**
	 * The feature id for the '<em><b>Service</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_SERVICES_TYPE__SERVICE = 0;

	/**
	 * The number of structural features of the '<em>Inbound Services Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_SERVICES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Inbound Services Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INBOUND_SERVICES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.IncludeTypeImpl <em>Include Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.IncludeTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getIncludeType()
	 * @generated
	 */
	int INCLUDE_TYPE = 14;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE__PATH = 0;

	/**
	 * The number of structural features of the '<em>Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INCLUDE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.ManualScalingTypeImpl <em>Manual Scaling Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.ManualScalingTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getManualScalingType()
	 * @generated
	 */
	int MANUAL_SCALING_TYPE = 15;

	/**
	 * The feature id for the '<em><b>Instances</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_SCALING_TYPE__INSTANCES = 0;

	/**
	 * The number of structural features of the '<em>Manual Scaling Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_SCALING_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Manual Scaling Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MANUAL_SCALING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.PagespeedTypeImpl <em>Pagespeed Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.PagespeedTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getPagespeedType()
	 * @generated
	 */
	int PAGESPEED_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGESPEED_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Url Blacklist</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGESPEED_TYPE__URL_BLACKLIST = 1;

	/**
	 * The feature id for the '<em><b>Domain To Rewrite</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGESPEED_TYPE__DOMAIN_TO_REWRITE = 2;

	/**
	 * The feature id for the '<em><b>Enabled Rewriter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGESPEED_TYPE__ENABLED_REWRITER = 3;

	/**
	 * The feature id for the '<em><b>Disabled Rewriter</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGESPEED_TYPE__DISABLED_REWRITER = 4;

	/**
	 * The number of structural features of the '<em>Pagespeed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGESPEED_TYPE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Pagespeed Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PAGESPEED_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.PermissionTypeImpl <em>Permission Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.PermissionTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getPermissionType()
	 * @generated
	 */
	int PERMISSION_TYPE = 17;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Actions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_TYPE__ACTIONS = 1;

	/**
	 * The feature id for the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_TYPE__CLASS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_TYPE__NAME = 3;

	/**
	 * The number of structural features of the '<em>Permission Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Permission Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERMISSION_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.PrioritySpecifierTypeImpl <em>Priority Specifier Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.PrioritySpecifierTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getPrioritySpecifierType()
	 * @generated
	 */
	int PRIORITY_SPECIFIER_TYPE = 18;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_SPECIFIER_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_SPECIFIER_TYPE__FILENAME = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_SPECIFIER_TYPE__PRIORITY = 2;

	/**
	 * The number of structural features of the '<em>Priority Specifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_SPECIFIER_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Priority Specifier Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIORITY_SPECIFIER_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.PropertyTypeImpl <em>Property Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.PropertyTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getPropertyType()
	 * @generated
	 */
	int PROPERTY_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE__VALUE1 = 2;

	/**
	 * The number of structural features of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Property Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROPERTY_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.ResourceFilesTypeImpl <em>Resource Files Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.ResourceFilesTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getResourceFilesType()
	 * @generated
	 */
	int RESOURCE_FILES_TYPE = 20;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FILES_TYPE__INCLUDE = 0;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FILES_TYPE__EXCLUDE = 1;

	/**
	 * The number of structural features of the '<em>Resource Files Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FILES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Resource Files Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESOURCE_FILES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.SettingTypeImpl <em>Setting Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.SettingTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getSettingType()
	 * @generated
	 */
	int SETTING_TYPE = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Value1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_TYPE__VALUE1 = 2;

	/**
	 * The number of structural features of the '<em>Setting Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Setting Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SETTING_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.StaticErrorHandlersImpl <em>Static Error Handlers</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.StaticErrorHandlersImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getStaticErrorHandlers()
	 * @generated
	 */
	int STATIC_ERROR_HANDLERS = 22;

	/**
	 * The feature id for the '<em><b>Handler</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ERROR_HANDLERS__HANDLER = 0;

	/**
	 * The number of structural features of the '<em>Static Error Handlers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ERROR_HANDLERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Static Error Handlers</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ERROR_HANDLERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.StaticErrorHandlersHandlerImpl <em>Static Error Handlers Handler</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.StaticErrorHandlersHandlerImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getStaticErrorHandlersHandler()
	 * @generated
	 */
	int STATIC_ERROR_HANDLERS_HANDLER = 23;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ERROR_HANDLERS_HANDLER__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Error Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ERROR_HANDLERS_HANDLER__ERROR_CODE = 1;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ERROR_HANDLERS_HANDLER__FILE = 2;

	/**
	 * The number of structural features of the '<em>Static Error Handlers Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ERROR_HANDLERS_HANDLER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Static Error Handlers Handler</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_ERROR_HANDLERS_HANDLER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.StaticFilesTypeImpl <em>Static Files Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.StaticFilesTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getStaticFilesType()
	 * @generated
	 */
	int STATIC_FILES_TYPE = 24;

	/**
	 * The feature id for the '<em><b>Include</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FILES_TYPE__INCLUDE = 0;

	/**
	 * The feature id for the '<em><b>Exclude</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FILES_TYPE__EXCLUDE = 1;

	/**
	 * The number of structural features of the '<em>Static Files Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FILES_TYPE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Static Files Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_FILES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.StaticIncludeTypeImpl <em>Static Include Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.StaticIncludeTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getStaticIncludeType()
	 * @generated
	 */
	int STATIC_INCLUDE_TYPE = 25;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_INCLUDE_TYPE__PATH = INCLUDE_TYPE__PATH;

	/**
	 * The feature id for the '<em><b>Http Header</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_INCLUDE_TYPE__HTTP_HEADER = INCLUDE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expiration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_INCLUDE_TYPE__EXPIRATION = INCLUDE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Static Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_INCLUDE_TYPE_FEATURE_COUNT = INCLUDE_TYPE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Static Include Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATIC_INCLUDE_TYPE_OPERATION_COUNT = INCLUDE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.SystemPropertiesTypeImpl <em>System Properties Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.SystemPropertiesTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getSystemPropertiesType()
	 * @generated
	 */
	int SYSTEM_PROPERTIES_TYPE = 26;

	/**
	 * The feature id for the '<em><b>Property</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROPERTIES_TYPE__PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>System Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROPERTIES_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>System Properties Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_PROPERTIES_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.UserPermissionsTypeImpl <em>User Permissions Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.UserPermissionsTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getUserPermissionsType()
	 * @generated
	 */
	int USER_PERMISSIONS_TYPE = 27;

	/**
	 * The feature id for the '<em><b>Permission</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PERMISSIONS_TYPE__PERMISSION = 0;

	/**
	 * The number of structural features of the '<em>User Permissions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PERMISSIONS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>User Permissions Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PERMISSIONS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.VmHealthCheckTypeImpl <em>Vm Health Check Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.VmHealthCheckTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getVmHealthCheckType()
	 * @generated
	 */
	int VM_HEALTH_CHECK_TYPE = 28;

	/**
	 * The feature id for the '<em><b>Enable Health Check</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HEALTH_CHECK_TYPE__ENABLE_HEALTH_CHECK = 0;

	/**
	 * The feature id for the '<em><b>Check Interval Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HEALTH_CHECK_TYPE__CHECK_INTERVAL_SEC = 1;

	/**
	 * The feature id for the '<em><b>Timeout Sec</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HEALTH_CHECK_TYPE__TIMEOUT_SEC = 2;

	/**
	 * The feature id for the '<em><b>Unhealthy Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HEALTH_CHECK_TYPE__UNHEALTHY_THRESHOLD = 3;

	/**
	 * The feature id for the '<em><b>Healthy Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HEALTH_CHECK_TYPE__HEALTHY_THRESHOLD = 4;

	/**
	 * The feature id for the '<em><b>Restart Threshold</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HEALTH_CHECK_TYPE__RESTART_THRESHOLD = 5;

	/**
	 * The feature id for the '<em><b>Host</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HEALTH_CHECK_TYPE__HOST = 6;

	/**
	 * The number of structural features of the '<em>Vm Health Check Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HEALTH_CHECK_TYPE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Vm Health Check Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_HEALTH_CHECK_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link gaeweb.impl.VmSettingsTypeImpl <em>Vm Settings Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see gaeweb.impl.VmSettingsTypeImpl
	 * @see gaeweb.impl.GaewebPackageImpl#getVmSettingsType()
	 * @generated
	 */
	int VM_SETTINGS_TYPE = 29;

	/**
	 * The feature id for the '<em><b>Setting</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SETTINGS_TYPE__SETTING = 0;

	/**
	 * The number of structural features of the '<em>Vm Settings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SETTINGS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Vm Settings Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VM_SETTINGS_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '<em>Expiration Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gaeweb.impl.GaewebPackageImpl#getExpirationType()
	 * @generated
	 */
	int EXPIRATION_TYPE = 30;

	/**
	 * The meta object id for the '<em>Target Utilization Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.math.BigDecimal
	 * @see gaeweb.impl.GaewebPackageImpl#getTargetUtilizationType()
	 * @generated
	 */
	int TARGET_UTILIZATION_TYPE = 31;

	/**
	 * The meta object id for the '<em>Url Stream Handler Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see gaeweb.impl.GaewebPackageImpl#getUrlStreamHandlerType()
	 * @generated
	 */
	int URL_STREAM_HANDLER_TYPE = 32;


	/**
	 * Returns the meta object for class '{@link gaeweb.AdminConsole <em>Admin Console</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin Console</em>'.
	 * @see gaeweb.AdminConsole
	 * @generated
	 */
	EClass getAdminConsole();

	/**
	 * Returns the meta object for the containment reference list '{@link gaeweb.AdminConsole#getPage <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Page</em>'.
	 * @see gaeweb.AdminConsole#getPage()
	 * @see #getAdminConsole()
	 * @generated
	 */
	EReference getAdminConsole_Page();

	/**
	 * Returns the meta object for class '{@link gaeweb.AdminConsolePageType <em>Admin Console Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin Console Page Type</em>'.
	 * @see gaeweb.AdminConsolePageType
	 * @generated
	 */
	EClass getAdminConsolePageType();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AdminConsolePageType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gaeweb.AdminConsolePageType#getValue()
	 * @see #getAdminConsolePageType()
	 * @generated
	 */
	EAttribute getAdminConsolePageType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AdminConsolePageType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gaeweb.AdminConsolePageType#getName()
	 * @see #getAdminConsolePageType()
	 * @generated
	 */
	EAttribute getAdminConsolePageType_Name();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AdminConsolePageType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see gaeweb.AdminConsolePageType#getUrl()
	 * @see #getAdminConsolePageType()
	 * @generated
	 */
	EAttribute getAdminConsolePageType_Url();

	/**
	 * Returns the meta object for class '{@link gaeweb.AppengineWebAppType <em>Appengine Web App Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Appengine Web App Type</em>'.
	 * @see gaeweb.AppengineWebAppType
	 * @generated
	 */
	EClass getAppengineWebAppType();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AppengineWebAppType#getApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Application</em>'.
	 * @see gaeweb.AppengineWebAppType#getApplication()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EAttribute getAppengineWebAppType_Application();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AppengineWebAppType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see gaeweb.AppengineWebAppType#getVersion()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EAttribute getAppengineWebAppType_Version();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AppengineWebAppType#getSourceLanguage <em>Source Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source Language</em>'.
	 * @see gaeweb.AppengineWebAppType#getSourceLanguage()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EAttribute getAppengineWebAppType_SourceLanguage();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AppengineWebAppType#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Module</em>'.
	 * @see gaeweb.AppengineWebAppType#getModule()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EAttribute getAppengineWebAppType_Module();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AppengineWebAppType#getInstanceClass <em>Instance Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instance Class</em>'.
	 * @see gaeweb.AppengineWebAppType#getInstanceClass()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EAttribute getAppengineWebAppType_InstanceClass();

	/**
	 * Returns the meta object for the containment reference '{@link gaeweb.AppengineWebAppType#getAutomaticScaling <em>Automatic Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Automatic Scaling</em>'.
	 * @see gaeweb.AppengineWebAppType#getAutomaticScaling()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EReference getAppengineWebAppType_AutomaticScaling();

	/**
	 * Returns the meta object for the containment reference '{@link gaeweb.AppengineWebAppType#getManualScaling <em>Manual Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Manual Scaling</em>'.
	 * @see gaeweb.AppengineWebAppType#getManualScaling()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EReference getAppengineWebAppType_ManualScaling();

	/**
	 * Returns the meta object for the containment reference '{@link gaeweb.AppengineWebAppType#getBasicScaling <em>Basic Scaling</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basic Scaling</em>'.
	 * @see gaeweb.AppengineWebAppType#getBasicScaling()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EReference getAppengineWebAppType_BasicScaling();

	/**
	 * Returns the meta object for the containment reference '{@link gaeweb.AppengineWebAppType#getStaticFiles <em>Static Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Static Files</em>'.
	 * @see gaeweb.AppengineWebAppType#getStaticFiles()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EReference getAppengineWebAppType_StaticFiles();

	/**
	 * Returns the meta object for the containment reference '{@link gaeweb.AppengineWebAppType#getResourceFiles <em>Resource Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Resource Files</em>'.
	 * @see gaeweb.AppengineWebAppType#getResourceFiles()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EReference getAppengineWebAppType_ResourceFiles();

	/**
	 * Returns the meta object for the containment reference '{@link gaeweb.AppengineWebAppType#getSystemProperties <em>System Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>System Properties</em>'.
	 * @see gaeweb.AppengineWebAppType#getSystemProperties()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EReference getAppengineWebAppType_SystemProperties();

	/**
	 * Returns the meta object for the containment reference '{@link gaeweb.AppengineWebAppType#getVmSettings <em>Vm Settings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vm Settings</em>'.
	 * @see gaeweb.AppengineWebAppType#getVmSettings()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EReference getAppengineWebAppType_VmSettings();

	/**
	 * Returns the meta object for the containment reference '{@link gaeweb.AppengineWebAppType#getVmHealthCheck <em>Vm Health Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Vm Health Check</em>'.
	 * @see gaeweb.AppengineWebAppType#getVmHealthCheck()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EReference getAppengineWebAppType_VmHealthCheck();

	/**
	 * Returns the meta object for the containment reference '{@link gaeweb.AppengineWebAppType#getEnvVariables <em>Env Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Env Variables</em>'.
	 * @see gaeweb.AppengineWebAppType#getEnvVariables()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EReference getAppengineWebAppType_EnvVariables();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AppengineWebAppType#isSslEnabled <em>Ssl Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ssl Enabled</em>'.
	 * @see gaeweb.AppengineWebAppType#isSslEnabled()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EAttribute getAppengineWebAppType_SslEnabled();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AppengineWebAppType#isSessionsEnabled <em>Sessions Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sessions Enabled</em>'.
	 * @see gaeweb.AppengineWebAppType#isSessionsEnabled()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EAttribute getAppengineWebAppType_SessionsEnabled();

	/**
	 * Returns the meta object for the containment reference '{@link gaeweb.AppengineWebAppType#getAsyncSessionPersistence <em>Async Session Persistence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Async Session Persistence</em>'.
	 * @see gaeweb.AppengineWebAppType#getAsyncSessionPersistence()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EReference getAppengineWebAppType_AsyncSessionPersistence();

	/**
	 * Returns the meta object for the containment reference '{@link gaeweb.AppengineWebAppType#getUserPermissions <em>User Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Permissions</em>'.
	 * @see gaeweb.AppengineWebAppType#getUserPermissions()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EReference getAppengineWebAppType_UserPermissions();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AppengineWebAppType#getPublicRoot <em>Public Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Root</em>'.
	 * @see gaeweb.AppengineWebAppType#getPublicRoot()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EAttribute getAppengineWebAppType_PublicRoot();

	/**
	 * Returns the meta object for the containment reference '{@link gaeweb.AppengineWebAppType#getInboundServices <em>Inbound Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Inbound Services</em>'.
	 * @see gaeweb.AppengineWebAppType#getInboundServices()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EReference getAppengineWebAppType_InboundServices();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AppengineWebAppType#isPrecompilationEnabled <em>Precompilation Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Precompilation Enabled</em>'.
	 * @see gaeweb.AppengineWebAppType#isPrecompilationEnabled()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EAttribute getAppengineWebAppType_PrecompilationEnabled();

	/**
	 * Returns the meta object for the containment reference '{@link gaeweb.AppengineWebAppType#getAdminConsole <em>Admin Console</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Admin Console</em>'.
	 * @see gaeweb.AppengineWebAppType#getAdminConsole()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EReference getAppengineWebAppType_AdminConsole();

	/**
	 * Returns the meta object for the containment reference '{@link gaeweb.AppengineWebAppType#getStaticErrorHandlers <em>Static Error Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Static Error Handlers</em>'.
	 * @see gaeweb.AppengineWebAppType#getStaticErrorHandlers()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EReference getAppengineWebAppType_StaticErrorHandlers();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AppengineWebAppType#isWarmupRequestsEnabled <em>Warmup Requests Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warmup Requests Enabled</em>'.
	 * @see gaeweb.AppengineWebAppType#isWarmupRequestsEnabled()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EAttribute getAppengineWebAppType_WarmupRequestsEnabled();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AppengineWebAppType#isThreadsafe <em>Threadsafe</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Threadsafe</em>'.
	 * @see gaeweb.AppengineWebAppType#isThreadsafe()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EAttribute getAppengineWebAppType_Threadsafe();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AppengineWebAppType#getAutoIdPolicy <em>Auto Id Policy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Auto Id Policy</em>'.
	 * @see gaeweb.AppengineWebAppType#getAutoIdPolicy()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EAttribute getAppengineWebAppType_AutoIdPolicy();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AppengineWebAppType#isCodeLock <em>Code Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Code Lock</em>'.
	 * @see gaeweb.AppengineWebAppType#isCodeLock()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EAttribute getAppengineWebAppType_CodeLock();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AppengineWebAppType#isVm <em>Vm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vm</em>'.
	 * @see gaeweb.AppengineWebAppType#isVm()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EAttribute getAppengineWebAppType_Vm();

	/**
	 * Returns the meta object for the containment reference '{@link gaeweb.AppengineWebAppType#getPagespeed <em>Pagespeed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pagespeed</em>'.
	 * @see gaeweb.AppengineWebAppType#getPagespeed()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EReference getAppengineWebAppType_Pagespeed();

	/**
	 * Returns the meta object for the containment reference '{@link gaeweb.AppengineWebAppType#getClassLoaderConfig <em>Class Loader Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Class Loader Config</em>'.
	 * @see gaeweb.AppengineWebAppType#getClassLoaderConfig()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EReference getAppengineWebAppType_ClassLoaderConfig();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AppengineWebAppType#getUrlStreamHandler <em>Url Stream Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url Stream Handler</em>'.
	 * @see gaeweb.AppengineWebAppType#getUrlStreamHandler()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EAttribute getAppengineWebAppType_UrlStreamHandler();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AppengineWebAppType#isUseGoogleConnectorJ <em>Use Google Connector J</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Google Connector J</em>'.
	 * @see gaeweb.AppengineWebAppType#isUseGoogleConnectorJ()
	 * @see #getAppengineWebAppType()
	 * @generated
	 */
	EAttribute getAppengineWebAppType_UseGoogleConnectorJ();

	/**
	 * Returns the meta object for class '{@link gaeweb.AsyncSessionPersistenceType <em>Async Session Persistence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Async Session Persistence Type</em>'.
	 * @see gaeweb.AsyncSessionPersistenceType
	 * @generated
	 */
	EClass getAsyncSessionPersistenceType();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AsyncSessionPersistenceType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gaeweb.AsyncSessionPersistenceType#getValue()
	 * @see #getAsyncSessionPersistenceType()
	 * @generated
	 */
	EAttribute getAsyncSessionPersistenceType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AsyncSessionPersistenceType#isEnabled <em>Enabled</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enabled</em>'.
	 * @see gaeweb.AsyncSessionPersistenceType#isEnabled()
	 * @see #getAsyncSessionPersistenceType()
	 * @generated
	 */
	EAttribute getAsyncSessionPersistenceType_Enabled();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AsyncSessionPersistenceType#getQueueName <em>Queue Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Queue Name</em>'.
	 * @see gaeweb.AsyncSessionPersistenceType#getQueueName()
	 * @see #getAsyncSessionPersistenceType()
	 * @generated
	 */
	EAttribute getAsyncSessionPersistenceType_QueueName();

	/**
	 * Returns the meta object for class '{@link gaeweb.AutomaticScalingType <em>Automatic Scaling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Automatic Scaling Type</em>'.
	 * @see gaeweb.AutomaticScalingType
	 * @generated
	 */
	EClass getAutomaticScalingType();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AutomaticScalingType#getMinPendingLatency <em>Min Pending Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Pending Latency</em>'.
	 * @see gaeweb.AutomaticScalingType#getMinPendingLatency()
	 * @see #getAutomaticScalingType()
	 * @generated
	 */
	EAttribute getAutomaticScalingType_MinPendingLatency();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AutomaticScalingType#getMaxPendingLatency <em>Max Pending Latency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Pending Latency</em>'.
	 * @see gaeweb.AutomaticScalingType#getMaxPendingLatency()
	 * @see #getAutomaticScalingType()
	 * @generated
	 */
	EAttribute getAutomaticScalingType_MaxPendingLatency();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AutomaticScalingType#getMinIdleInstances <em>Min Idle Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Idle Instances</em>'.
	 * @see gaeweb.AutomaticScalingType#getMinIdleInstances()
	 * @see #getAutomaticScalingType()
	 * @generated
	 */
	EAttribute getAutomaticScalingType_MinIdleInstances();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AutomaticScalingType#getMaxIdleInstances <em>Max Idle Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Idle Instances</em>'.
	 * @see gaeweb.AutomaticScalingType#getMaxIdleInstances()
	 * @see #getAutomaticScalingType()
	 * @generated
	 */
	EAttribute getAutomaticScalingType_MaxIdleInstances();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AutomaticScalingType#getMaxConcurrentRequests <em>Max Concurrent Requests</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Concurrent Requests</em>'.
	 * @see gaeweb.AutomaticScalingType#getMaxConcurrentRequests()
	 * @see #getAutomaticScalingType()
	 * @generated
	 */
	EAttribute getAutomaticScalingType_MaxConcurrentRequests();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AutomaticScalingType#getMinNumInstances <em>Min Num Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Min Num Instances</em>'.
	 * @see gaeweb.AutomaticScalingType#getMinNumInstances()
	 * @see #getAutomaticScalingType()
	 * @generated
	 */
	EAttribute getAutomaticScalingType_MinNumInstances();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AutomaticScalingType#getMaxNumInstances <em>Max Num Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Num Instances</em>'.
	 * @see gaeweb.AutomaticScalingType#getMaxNumInstances()
	 * @see #getAutomaticScalingType()
	 * @generated
	 */
	EAttribute getAutomaticScalingType_MaxNumInstances();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.AutomaticScalingType#getCoolDownPeriodSec <em>Cool Down Period Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cool Down Period Sec</em>'.
	 * @see gaeweb.AutomaticScalingType#getCoolDownPeriodSec()
	 * @see #getAutomaticScalingType()
	 * @generated
	 */
	EAttribute getAutomaticScalingType_CoolDownPeriodSec();

	/**
	 * Returns the meta object for the containment reference '{@link gaeweb.AutomaticScalingType#getCpuUtilization <em>Cpu Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Cpu Utilization</em>'.
	 * @see gaeweb.AutomaticScalingType#getCpuUtilization()
	 * @see #getAutomaticScalingType()
	 * @generated
	 */
	EReference getAutomaticScalingType_CpuUtilization();

	/**
	 * Returns the meta object for class '{@link gaeweb.BasicScalingType <em>Basic Scaling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basic Scaling Type</em>'.
	 * @see gaeweb.BasicScalingType
	 * @generated
	 */
	EClass getBasicScalingType();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.BasicScalingType#getMaxInstances <em>Max Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Max Instances</em>'.
	 * @see gaeweb.BasicScalingType#getMaxInstances()
	 * @see #getBasicScalingType()
	 * @generated
	 */
	EAttribute getBasicScalingType_MaxInstances();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.BasicScalingType#getIdleTimeout <em>Idle Timeout</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Idle Timeout</em>'.
	 * @see gaeweb.BasicScalingType#getIdleTimeout()
	 * @see #getBasicScalingType()
	 * @generated
	 */
	EAttribute getBasicScalingType_IdleTimeout();

	/**
	 * Returns the meta object for class '{@link gaeweb.ClassLoaderConfigType <em>Class Loader Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class Loader Config Type</em>'.
	 * @see gaeweb.ClassLoaderConfigType
	 * @generated
	 */
	EClass getClassLoaderConfigType();

	/**
	 * Returns the meta object for the attribute list '{@link gaeweb.ClassLoaderConfigType#getPrioritySpecifier <em>Priority Specifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Priority Specifier</em>'.
	 * @see gaeweb.ClassLoaderConfigType#getPrioritySpecifier()
	 * @see #getClassLoaderConfigType()
	 * @generated
	 */
	EAttribute getClassLoaderConfigType_PrioritySpecifier();

	/**
	 * Returns the meta object for class '{@link gaeweb.CpuUtilizationType <em>Cpu Utilization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cpu Utilization Type</em>'.
	 * @see gaeweb.CpuUtilizationType
	 * @generated
	 */
	EClass getCpuUtilizationType();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.CpuUtilizationType#getTargetUtilization <em>Target Utilization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Utilization</em>'.
	 * @see gaeweb.CpuUtilizationType#getTargetUtilization()
	 * @see #getCpuUtilizationType()
	 * @generated
	 */
	EAttribute getCpuUtilizationType_TargetUtilization();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.CpuUtilizationType#getAggregationWindowLengthSec <em>Aggregation Window Length Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Aggregation Window Length Sec</em>'.
	 * @see gaeweb.CpuUtilizationType#getAggregationWindowLengthSec()
	 * @see #getCpuUtilizationType()
	 * @generated
	 */
	EAttribute getCpuUtilizationType_AggregationWindowLengthSec();

	/**
	 * Returns the meta object for class '{@link gaeweb.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see gaeweb.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link gaeweb.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see gaeweb.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link gaeweb.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see gaeweb.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link gaeweb.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see gaeweb.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference list '{@link gaeweb.DocumentRoot#getAppengineWebApp <em>Appengine Web App</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Appengine Web App</em>'.
	 * @see gaeweb.DocumentRoot#getAppengineWebApp()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_AppengineWebApp();

	/**
	 * Returns the meta object for class '{@link gaeweb.EnvVariablesType <em>Env Variables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Variables Type</em>'.
	 * @see gaeweb.EnvVariablesType
	 * @generated
	 */
	EClass getEnvVariablesType();

	/**
	 * Returns the meta object for the containment reference list '{@link gaeweb.EnvVariablesType#getEnvVar <em>Env Var</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Env Var</em>'.
	 * @see gaeweb.EnvVariablesType#getEnvVar()
	 * @see #getEnvVariablesType()
	 * @generated
	 */
	EReference getEnvVariablesType_EnvVar();

	/**
	 * Returns the meta object for class '{@link gaeweb.EnvVarType <em>Env Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Env Var Type</em>'.
	 * @see gaeweb.EnvVarType
	 * @generated
	 */
	EClass getEnvVarType();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.EnvVarType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gaeweb.EnvVarType#getValue()
	 * @see #getEnvVarType()
	 * @generated
	 */
	EAttribute getEnvVarType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.EnvVarType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gaeweb.EnvVarType#getName()
	 * @see #getEnvVarType()
	 * @generated
	 */
	EAttribute getEnvVarType_Name();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.EnvVarType#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see gaeweb.EnvVarType#getValue1()
	 * @see #getEnvVarType()
	 * @generated
	 */
	EAttribute getEnvVarType_Value1();

	/**
	 * Returns the meta object for class '{@link gaeweb.ExcludeType <em>Exclude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Exclude Type</em>'.
	 * @see gaeweb.ExcludeType
	 * @generated
	 */
	EClass getExcludeType();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.ExcludeType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see gaeweb.ExcludeType#getPath()
	 * @see #getExcludeType()
	 * @generated
	 */
	EAttribute getExcludeType_Path();

	/**
	 * Returns the meta object for class '{@link gaeweb.HttpHeaderType <em>Http Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Http Header Type</em>'.
	 * @see gaeweb.HttpHeaderType
	 * @generated
	 */
	EClass getHttpHeaderType();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.HttpHeaderType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gaeweb.HttpHeaderType#getName()
	 * @see #getHttpHeaderType()
	 * @generated
	 */
	EAttribute getHttpHeaderType_Name();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.HttpHeaderType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gaeweb.HttpHeaderType#getValue()
	 * @see #getHttpHeaderType()
	 * @generated
	 */
	EAttribute getHttpHeaderType_Value();

	/**
	 * Returns the meta object for class '{@link gaeweb.InboundServicesType <em>Inbound Services Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Inbound Services Type</em>'.
	 * @see gaeweb.InboundServicesType
	 * @generated
	 */
	EClass getInboundServicesType();

	/**
	 * Returns the meta object for the attribute list '{@link gaeweb.InboundServicesType#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Service</em>'.
	 * @see gaeweb.InboundServicesType#getService()
	 * @see #getInboundServicesType()
	 * @generated
	 */
	EAttribute getInboundServicesType_Service();

	/**
	 * Returns the meta object for class '{@link gaeweb.IncludeType <em>Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Include Type</em>'.
	 * @see gaeweb.IncludeType
	 * @generated
	 */
	EClass getIncludeType();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.IncludeType#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see gaeweb.IncludeType#getPath()
	 * @see #getIncludeType()
	 * @generated
	 */
	EAttribute getIncludeType_Path();

	/**
	 * Returns the meta object for class '{@link gaeweb.ManualScalingType <em>Manual Scaling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Manual Scaling Type</em>'.
	 * @see gaeweb.ManualScalingType
	 * @generated
	 */
	EClass getManualScalingType();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.ManualScalingType#getInstances <em>Instances</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Instances</em>'.
	 * @see gaeweb.ManualScalingType#getInstances()
	 * @see #getManualScalingType()
	 * @generated
	 */
	EAttribute getManualScalingType_Instances();

	/**
	 * Returns the meta object for class '{@link gaeweb.PagespeedType <em>Pagespeed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pagespeed Type</em>'.
	 * @see gaeweb.PagespeedType
	 * @generated
	 */
	EClass getPagespeedType();

	/**
	 * Returns the meta object for the attribute list '{@link gaeweb.PagespeedType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see gaeweb.PagespeedType#getGroup()
	 * @see #getPagespeedType()
	 * @generated
	 */
	EAttribute getPagespeedType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link gaeweb.PagespeedType#getUrlBlacklist <em>Url Blacklist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Url Blacklist</em>'.
	 * @see gaeweb.PagespeedType#getUrlBlacklist()
	 * @see #getPagespeedType()
	 * @generated
	 */
	EAttribute getPagespeedType_UrlBlacklist();

	/**
	 * Returns the meta object for the attribute list '{@link gaeweb.PagespeedType#getDomainToRewrite <em>Domain To Rewrite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Domain To Rewrite</em>'.
	 * @see gaeweb.PagespeedType#getDomainToRewrite()
	 * @see #getPagespeedType()
	 * @generated
	 */
	EAttribute getPagespeedType_DomainToRewrite();

	/**
	 * Returns the meta object for the attribute list '{@link gaeweb.PagespeedType#getEnabledRewriter <em>Enabled Rewriter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Enabled Rewriter</em>'.
	 * @see gaeweb.PagespeedType#getEnabledRewriter()
	 * @see #getPagespeedType()
	 * @generated
	 */
	EAttribute getPagespeedType_EnabledRewriter();

	/**
	 * Returns the meta object for the attribute list '{@link gaeweb.PagespeedType#getDisabledRewriter <em>Disabled Rewriter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Disabled Rewriter</em>'.
	 * @see gaeweb.PagespeedType#getDisabledRewriter()
	 * @see #getPagespeedType()
	 * @generated
	 */
	EAttribute getPagespeedType_DisabledRewriter();

	/**
	 * Returns the meta object for class '{@link gaeweb.PermissionType <em>Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Permission Type</em>'.
	 * @see gaeweb.PermissionType
	 * @generated
	 */
	EClass getPermissionType();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.PermissionType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gaeweb.PermissionType#getValue()
	 * @see #getPermissionType()
	 * @generated
	 */
	EAttribute getPermissionType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.PermissionType#getActions <em>Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Actions</em>'.
	 * @see gaeweb.PermissionType#getActions()
	 * @see #getPermissionType()
	 * @generated
	 */
	EAttribute getPermissionType_Actions();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.PermissionType#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Class</em>'.
	 * @see gaeweb.PermissionType#getClass_()
	 * @see #getPermissionType()
	 * @generated
	 */
	EAttribute getPermissionType_Class();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.PermissionType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gaeweb.PermissionType#getName()
	 * @see #getPermissionType()
	 * @generated
	 */
	EAttribute getPermissionType_Name();

	/**
	 * Returns the meta object for class '{@link gaeweb.PrioritySpecifierType <em>Priority Specifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Priority Specifier Type</em>'.
	 * @see gaeweb.PrioritySpecifierType
	 * @generated
	 */
	EClass getPrioritySpecifierType();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.PrioritySpecifierType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gaeweb.PrioritySpecifierType#getValue()
	 * @see #getPrioritySpecifierType()
	 * @generated
	 */
	EAttribute getPrioritySpecifierType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.PrioritySpecifierType#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Filename</em>'.
	 * @see gaeweb.PrioritySpecifierType#getFilename()
	 * @see #getPrioritySpecifierType()
	 * @generated
	 */
	EAttribute getPrioritySpecifierType_Filename();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.PrioritySpecifierType#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see gaeweb.PrioritySpecifierType#getPriority()
	 * @see #getPrioritySpecifierType()
	 * @generated
	 */
	EAttribute getPrioritySpecifierType_Priority();

	/**
	 * Returns the meta object for class '{@link gaeweb.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Property Type</em>'.
	 * @see gaeweb.PropertyType
	 * @generated
	 */
	EClass getPropertyType();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.PropertyType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gaeweb.PropertyType#getValue()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.PropertyType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gaeweb.PropertyType#getName()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Name();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.PropertyType#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see gaeweb.PropertyType#getValue1()
	 * @see #getPropertyType()
	 * @generated
	 */
	EAttribute getPropertyType_Value1();

	/**
	 * Returns the meta object for class '{@link gaeweb.ResourceFilesType <em>Resource Files Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Resource Files Type</em>'.
	 * @see gaeweb.ResourceFilesType
	 * @generated
	 */
	EClass getResourceFilesType();

	/**
	 * Returns the meta object for the containment reference list '{@link gaeweb.ResourceFilesType#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see gaeweb.ResourceFilesType#getInclude()
	 * @see #getResourceFilesType()
	 * @generated
	 */
	EReference getResourceFilesType_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link gaeweb.ResourceFilesType#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclude</em>'.
	 * @see gaeweb.ResourceFilesType#getExclude()
	 * @see #getResourceFilesType()
	 * @generated
	 */
	EReference getResourceFilesType_Exclude();

	/**
	 * Returns the meta object for class '{@link gaeweb.SettingType <em>Setting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Setting Type</em>'.
	 * @see gaeweb.SettingType
	 * @generated
	 */
	EClass getSettingType();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.SettingType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gaeweb.SettingType#getValue()
	 * @see #getSettingType()
	 * @generated
	 */
	EAttribute getSettingType_Value();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.SettingType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see gaeweb.SettingType#getName()
	 * @see #getSettingType()
	 * @generated
	 */
	EAttribute getSettingType_Name();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.SettingType#getValue1 <em>Value1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value1</em>'.
	 * @see gaeweb.SettingType#getValue1()
	 * @see #getSettingType()
	 * @generated
	 */
	EAttribute getSettingType_Value1();

	/**
	 * Returns the meta object for class '{@link gaeweb.StaticErrorHandlers <em>Static Error Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Error Handlers</em>'.
	 * @see gaeweb.StaticErrorHandlers
	 * @generated
	 */
	EClass getStaticErrorHandlers();

	/**
	 * Returns the meta object for the containment reference list '{@link gaeweb.StaticErrorHandlers#getHandler <em>Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Handler</em>'.
	 * @see gaeweb.StaticErrorHandlers#getHandler()
	 * @see #getStaticErrorHandlers()
	 * @generated
	 */
	EReference getStaticErrorHandlers_Handler();

	/**
	 * Returns the meta object for class '{@link gaeweb.StaticErrorHandlersHandler <em>Static Error Handlers Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Error Handlers Handler</em>'.
	 * @see gaeweb.StaticErrorHandlersHandler
	 * @generated
	 */
	EClass getStaticErrorHandlersHandler();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.StaticErrorHandlersHandler#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see gaeweb.StaticErrorHandlersHandler#getValue()
	 * @see #getStaticErrorHandlersHandler()
	 * @generated
	 */
	EAttribute getStaticErrorHandlersHandler_Value();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.StaticErrorHandlersHandler#getErrorCode <em>Error Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Error Code</em>'.
	 * @see gaeweb.StaticErrorHandlersHandler#getErrorCode()
	 * @see #getStaticErrorHandlersHandler()
	 * @generated
	 */
	EAttribute getStaticErrorHandlersHandler_ErrorCode();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.StaticErrorHandlersHandler#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see gaeweb.StaticErrorHandlersHandler#getFile()
	 * @see #getStaticErrorHandlersHandler()
	 * @generated
	 */
	EAttribute getStaticErrorHandlersHandler_File();

	/**
	 * Returns the meta object for class '{@link gaeweb.StaticFilesType <em>Static Files Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Files Type</em>'.
	 * @see gaeweb.StaticFilesType
	 * @generated
	 */
	EClass getStaticFilesType();

	/**
	 * Returns the meta object for the containment reference list '{@link gaeweb.StaticFilesType#getInclude <em>Include</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Include</em>'.
	 * @see gaeweb.StaticFilesType#getInclude()
	 * @see #getStaticFilesType()
	 * @generated
	 */
	EReference getStaticFilesType_Include();

	/**
	 * Returns the meta object for the containment reference list '{@link gaeweb.StaticFilesType#getExclude <em>Exclude</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exclude</em>'.
	 * @see gaeweb.StaticFilesType#getExclude()
	 * @see #getStaticFilesType()
	 * @generated
	 */
	EReference getStaticFilesType_Exclude();

	/**
	 * Returns the meta object for class '{@link gaeweb.StaticIncludeType <em>Static Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Static Include Type</em>'.
	 * @see gaeweb.StaticIncludeType
	 * @generated
	 */
	EClass getStaticIncludeType();

	/**
	 * Returns the meta object for the containment reference list '{@link gaeweb.StaticIncludeType#getHttpHeader <em>Http Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Http Header</em>'.
	 * @see gaeweb.StaticIncludeType#getHttpHeader()
	 * @see #getStaticIncludeType()
	 * @generated
	 */
	EReference getStaticIncludeType_HttpHeader();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.StaticIncludeType#getExpiration <em>Expiration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expiration</em>'.
	 * @see gaeweb.StaticIncludeType#getExpiration()
	 * @see #getStaticIncludeType()
	 * @generated
	 */
	EAttribute getStaticIncludeType_Expiration();

	/**
	 * Returns the meta object for class '{@link gaeweb.SystemPropertiesType <em>System Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Properties Type</em>'.
	 * @see gaeweb.SystemPropertiesType
	 * @generated
	 */
	EClass getSystemPropertiesType();

	/**
	 * Returns the meta object for the containment reference list '{@link gaeweb.SystemPropertiesType#getProperty <em>Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Property</em>'.
	 * @see gaeweb.SystemPropertiesType#getProperty()
	 * @see #getSystemPropertiesType()
	 * @generated
	 */
	EReference getSystemPropertiesType_Property();

	/**
	 * Returns the meta object for class '{@link gaeweb.UserPermissionsType <em>User Permissions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Permissions Type</em>'.
	 * @see gaeweb.UserPermissionsType
	 * @generated
	 */
	EClass getUserPermissionsType();

	/**
	 * Returns the meta object for the containment reference list '{@link gaeweb.UserPermissionsType#getPermission <em>Permission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Permission</em>'.
	 * @see gaeweb.UserPermissionsType#getPermission()
	 * @see #getUserPermissionsType()
	 * @generated
	 */
	EReference getUserPermissionsType_Permission();

	/**
	 * Returns the meta object for class '{@link gaeweb.VmHealthCheckType <em>Vm Health Check Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vm Health Check Type</em>'.
	 * @see gaeweb.VmHealthCheckType
	 * @generated
	 */
	EClass getVmHealthCheckType();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.VmHealthCheckType#isEnableHealthCheck <em>Enable Health Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Enable Health Check</em>'.
	 * @see gaeweb.VmHealthCheckType#isEnableHealthCheck()
	 * @see #getVmHealthCheckType()
	 * @generated
	 */
	EAttribute getVmHealthCheckType_EnableHealthCheck();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.VmHealthCheckType#getCheckIntervalSec <em>Check Interval Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Check Interval Sec</em>'.
	 * @see gaeweb.VmHealthCheckType#getCheckIntervalSec()
	 * @see #getVmHealthCheckType()
	 * @generated
	 */
	EAttribute getVmHealthCheckType_CheckIntervalSec();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.VmHealthCheckType#getTimeoutSec <em>Timeout Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timeout Sec</em>'.
	 * @see gaeweb.VmHealthCheckType#getTimeoutSec()
	 * @see #getVmHealthCheckType()
	 * @generated
	 */
	EAttribute getVmHealthCheckType_TimeoutSec();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.VmHealthCheckType#getUnhealthyThreshold <em>Unhealthy Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unhealthy Threshold</em>'.
	 * @see gaeweb.VmHealthCheckType#getUnhealthyThreshold()
	 * @see #getVmHealthCheckType()
	 * @generated
	 */
	EAttribute getVmHealthCheckType_UnhealthyThreshold();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.VmHealthCheckType#getHealthyThreshold <em>Healthy Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Healthy Threshold</em>'.
	 * @see gaeweb.VmHealthCheckType#getHealthyThreshold()
	 * @see #getVmHealthCheckType()
	 * @generated
	 */
	EAttribute getVmHealthCheckType_HealthyThreshold();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.VmHealthCheckType#getRestartThreshold <em>Restart Threshold</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Restart Threshold</em>'.
	 * @see gaeweb.VmHealthCheckType#getRestartThreshold()
	 * @see #getVmHealthCheckType()
	 * @generated
	 */
	EAttribute getVmHealthCheckType_RestartThreshold();

	/**
	 * Returns the meta object for the attribute '{@link gaeweb.VmHealthCheckType#getHost <em>Host</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Host</em>'.
	 * @see gaeweb.VmHealthCheckType#getHost()
	 * @see #getVmHealthCheckType()
	 * @generated
	 */
	EAttribute getVmHealthCheckType_Host();

	/**
	 * Returns the meta object for class '{@link gaeweb.VmSettingsType <em>Vm Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vm Settings Type</em>'.
	 * @see gaeweb.VmSettingsType
	 * @generated
	 */
	EClass getVmSettingsType();

	/**
	 * Returns the meta object for the containment reference list '{@link gaeweb.VmSettingsType#getSetting <em>Setting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Setting</em>'.
	 * @see gaeweb.VmSettingsType#getSetting()
	 * @see #getVmSettingsType()
	 * @generated
	 */
	EReference getVmSettingsType_Setting();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Expiration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Expiration Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='expirationType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='\\s*(([0-9]+)([DdHhMm]|[sS]?))(\\s+([0-9]+)([DdHhMm]|[sS]?))*\\s*'"
	 * @generated
	 */
	EDataType getExpirationType();

	/**
	 * Returns the meta object for data type '{@link java.math.BigDecimal <em>Target Utilization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Target Utilization Type</em>'.
	 * @see java.math.BigDecimal
	 * @model instanceClass="java.math.BigDecimal"
	 *        extendedMetaData="name='target-utilization_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#decimal' minExclusive='0' maxInclusive='1'"
	 * @generated
	 */
	EDataType getTargetUtilizationType();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Url Stream Handler Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Url Stream Handler Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='urlStreamHandlerType' baseType='http://www.eclipse.org/emf/2003/XMLType#string' pattern='urlfetch|native'"
	 * @generated
	 */
	EDataType getUrlStreamHandlerType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GaewebFactory getGaewebFactory();

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
		 * The meta object literal for the '{@link gaeweb.impl.AdminConsoleImpl <em>Admin Console</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.AdminConsoleImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getAdminConsole()
		 * @generated
		 */
		EClass ADMIN_CONSOLE = eINSTANCE.getAdminConsole();

		/**
		 * The meta object literal for the '<em><b>Page</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADMIN_CONSOLE__PAGE = eINSTANCE.getAdminConsole_Page();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.AdminConsolePageTypeImpl <em>Admin Console Page Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.AdminConsolePageTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getAdminConsolePageType()
		 * @generated
		 */
		EClass ADMIN_CONSOLE_PAGE_TYPE = eINSTANCE.getAdminConsolePageType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMIN_CONSOLE_PAGE_TYPE__VALUE = eINSTANCE.getAdminConsolePageType_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMIN_CONSOLE_PAGE_TYPE__NAME = eINSTANCE.getAdminConsolePageType_Name();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADMIN_CONSOLE_PAGE_TYPE__URL = eINSTANCE.getAdminConsolePageType_Url();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.AppengineWebAppTypeImpl <em>Appengine Web App Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.AppengineWebAppTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getAppengineWebAppType()
		 * @generated
		 */
		EClass APPENGINE_WEB_APP_TYPE = eINSTANCE.getAppengineWebAppType();

		/**
		 * The meta object literal for the '<em><b>Application</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPENGINE_WEB_APP_TYPE__APPLICATION = eINSTANCE.getAppengineWebAppType_Application();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPENGINE_WEB_APP_TYPE__VERSION = eINSTANCE.getAppengineWebAppType_Version();

		/**
		 * The meta object literal for the '<em><b>Source Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPENGINE_WEB_APP_TYPE__SOURCE_LANGUAGE = eINSTANCE.getAppengineWebAppType_SourceLanguage();

		/**
		 * The meta object literal for the '<em><b>Module</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPENGINE_WEB_APP_TYPE__MODULE = eINSTANCE.getAppengineWebAppType_Module();

		/**
		 * The meta object literal for the '<em><b>Instance Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPENGINE_WEB_APP_TYPE__INSTANCE_CLASS = eINSTANCE.getAppengineWebAppType_InstanceClass();

		/**
		 * The meta object literal for the '<em><b>Automatic Scaling</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPENGINE_WEB_APP_TYPE__AUTOMATIC_SCALING = eINSTANCE.getAppengineWebAppType_AutomaticScaling();

		/**
		 * The meta object literal for the '<em><b>Manual Scaling</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPENGINE_WEB_APP_TYPE__MANUAL_SCALING = eINSTANCE.getAppengineWebAppType_ManualScaling();

		/**
		 * The meta object literal for the '<em><b>Basic Scaling</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPENGINE_WEB_APP_TYPE__BASIC_SCALING = eINSTANCE.getAppengineWebAppType_BasicScaling();

		/**
		 * The meta object literal for the '<em><b>Static Files</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPENGINE_WEB_APP_TYPE__STATIC_FILES = eINSTANCE.getAppengineWebAppType_StaticFiles();

		/**
		 * The meta object literal for the '<em><b>Resource Files</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPENGINE_WEB_APP_TYPE__RESOURCE_FILES = eINSTANCE.getAppengineWebAppType_ResourceFiles();

		/**
		 * The meta object literal for the '<em><b>System Properties</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPENGINE_WEB_APP_TYPE__SYSTEM_PROPERTIES = eINSTANCE.getAppengineWebAppType_SystemProperties();

		/**
		 * The meta object literal for the '<em><b>Vm Settings</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPENGINE_WEB_APP_TYPE__VM_SETTINGS = eINSTANCE.getAppengineWebAppType_VmSettings();

		/**
		 * The meta object literal for the '<em><b>Vm Health Check</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPENGINE_WEB_APP_TYPE__VM_HEALTH_CHECK = eINSTANCE.getAppengineWebAppType_VmHealthCheck();

		/**
		 * The meta object literal for the '<em><b>Env Variables</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPENGINE_WEB_APP_TYPE__ENV_VARIABLES = eINSTANCE.getAppengineWebAppType_EnvVariables();

		/**
		 * The meta object literal for the '<em><b>Ssl Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPENGINE_WEB_APP_TYPE__SSL_ENABLED = eINSTANCE.getAppengineWebAppType_SslEnabled();

		/**
		 * The meta object literal for the '<em><b>Sessions Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPENGINE_WEB_APP_TYPE__SESSIONS_ENABLED = eINSTANCE.getAppengineWebAppType_SessionsEnabled();

		/**
		 * The meta object literal for the '<em><b>Async Session Persistence</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPENGINE_WEB_APP_TYPE__ASYNC_SESSION_PERSISTENCE = eINSTANCE.getAppengineWebAppType_AsyncSessionPersistence();

		/**
		 * The meta object literal for the '<em><b>User Permissions</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPENGINE_WEB_APP_TYPE__USER_PERMISSIONS = eINSTANCE.getAppengineWebAppType_UserPermissions();

		/**
		 * The meta object literal for the '<em><b>Public Root</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPENGINE_WEB_APP_TYPE__PUBLIC_ROOT = eINSTANCE.getAppengineWebAppType_PublicRoot();

		/**
		 * The meta object literal for the '<em><b>Inbound Services</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPENGINE_WEB_APP_TYPE__INBOUND_SERVICES = eINSTANCE.getAppengineWebAppType_InboundServices();

		/**
		 * The meta object literal for the '<em><b>Precompilation Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPENGINE_WEB_APP_TYPE__PRECOMPILATION_ENABLED = eINSTANCE.getAppengineWebAppType_PrecompilationEnabled();

		/**
		 * The meta object literal for the '<em><b>Admin Console</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPENGINE_WEB_APP_TYPE__ADMIN_CONSOLE = eINSTANCE.getAppengineWebAppType_AdminConsole();

		/**
		 * The meta object literal for the '<em><b>Static Error Handlers</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPENGINE_WEB_APP_TYPE__STATIC_ERROR_HANDLERS = eINSTANCE.getAppengineWebAppType_StaticErrorHandlers();

		/**
		 * The meta object literal for the '<em><b>Warmup Requests Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPENGINE_WEB_APP_TYPE__WARMUP_REQUESTS_ENABLED = eINSTANCE.getAppengineWebAppType_WarmupRequestsEnabled();

		/**
		 * The meta object literal for the '<em><b>Threadsafe</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPENGINE_WEB_APP_TYPE__THREADSAFE = eINSTANCE.getAppengineWebAppType_Threadsafe();

		/**
		 * The meta object literal for the '<em><b>Auto Id Policy</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPENGINE_WEB_APP_TYPE__AUTO_ID_POLICY = eINSTANCE.getAppengineWebAppType_AutoIdPolicy();

		/**
		 * The meta object literal for the '<em><b>Code Lock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPENGINE_WEB_APP_TYPE__CODE_LOCK = eINSTANCE.getAppengineWebAppType_CodeLock();

		/**
		 * The meta object literal for the '<em><b>Vm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPENGINE_WEB_APP_TYPE__VM = eINSTANCE.getAppengineWebAppType_Vm();

		/**
		 * The meta object literal for the '<em><b>Pagespeed</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPENGINE_WEB_APP_TYPE__PAGESPEED = eINSTANCE.getAppengineWebAppType_Pagespeed();

		/**
		 * The meta object literal for the '<em><b>Class Loader Config</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPENGINE_WEB_APP_TYPE__CLASS_LOADER_CONFIG = eINSTANCE.getAppengineWebAppType_ClassLoaderConfig();

		/**
		 * The meta object literal for the '<em><b>Url Stream Handler</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPENGINE_WEB_APP_TYPE__URL_STREAM_HANDLER = eINSTANCE.getAppengineWebAppType_UrlStreamHandler();

		/**
		 * The meta object literal for the '<em><b>Use Google Connector J</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute APPENGINE_WEB_APP_TYPE__USE_GOOGLE_CONNECTOR_J = eINSTANCE.getAppengineWebAppType_UseGoogleConnectorJ();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.AsyncSessionPersistenceTypeImpl <em>Async Session Persistence Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.AsyncSessionPersistenceTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getAsyncSessionPersistenceType()
		 * @generated
		 */
		EClass ASYNC_SESSION_PERSISTENCE_TYPE = eINSTANCE.getAsyncSessionPersistenceType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYNC_SESSION_PERSISTENCE_TYPE__VALUE = eINSTANCE.getAsyncSessionPersistenceType_Value();

		/**
		 * The meta object literal for the '<em><b>Enabled</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYNC_SESSION_PERSISTENCE_TYPE__ENABLED = eINSTANCE.getAsyncSessionPersistenceType_Enabled();

		/**
		 * The meta object literal for the '<em><b>Queue Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASYNC_SESSION_PERSISTENCE_TYPE__QUEUE_NAME = eINSTANCE.getAsyncSessionPersistenceType_QueueName();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.AutomaticScalingTypeImpl <em>Automatic Scaling Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.AutomaticScalingTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getAutomaticScalingType()
		 * @generated
		 */
		EClass AUTOMATIC_SCALING_TYPE = eINSTANCE.getAutomaticScalingType();

		/**
		 * The meta object literal for the '<em><b>Min Pending Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC_SCALING_TYPE__MIN_PENDING_LATENCY = eINSTANCE.getAutomaticScalingType_MinPendingLatency();

		/**
		 * The meta object literal for the '<em><b>Max Pending Latency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC_SCALING_TYPE__MAX_PENDING_LATENCY = eINSTANCE.getAutomaticScalingType_MaxPendingLatency();

		/**
		 * The meta object literal for the '<em><b>Min Idle Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC_SCALING_TYPE__MIN_IDLE_INSTANCES = eINSTANCE.getAutomaticScalingType_MinIdleInstances();

		/**
		 * The meta object literal for the '<em><b>Max Idle Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC_SCALING_TYPE__MAX_IDLE_INSTANCES = eINSTANCE.getAutomaticScalingType_MaxIdleInstances();

		/**
		 * The meta object literal for the '<em><b>Max Concurrent Requests</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC_SCALING_TYPE__MAX_CONCURRENT_REQUESTS = eINSTANCE.getAutomaticScalingType_MaxConcurrentRequests();

		/**
		 * The meta object literal for the '<em><b>Min Num Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC_SCALING_TYPE__MIN_NUM_INSTANCES = eINSTANCE.getAutomaticScalingType_MinNumInstances();

		/**
		 * The meta object literal for the '<em><b>Max Num Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC_SCALING_TYPE__MAX_NUM_INSTANCES = eINSTANCE.getAutomaticScalingType_MaxNumInstances();

		/**
		 * The meta object literal for the '<em><b>Cool Down Period Sec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTOMATIC_SCALING_TYPE__COOL_DOWN_PERIOD_SEC = eINSTANCE.getAutomaticScalingType_CoolDownPeriodSec();

		/**
		 * The meta object literal for the '<em><b>Cpu Utilization</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTOMATIC_SCALING_TYPE__CPU_UTILIZATION = eINSTANCE.getAutomaticScalingType_CpuUtilization();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.BasicScalingTypeImpl <em>Basic Scaling Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.BasicScalingTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getBasicScalingType()
		 * @generated
		 */
		EClass BASIC_SCALING_TYPE = eINSTANCE.getBasicScalingType();

		/**
		 * The meta object literal for the '<em><b>Max Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_SCALING_TYPE__MAX_INSTANCES = eINSTANCE.getBasicScalingType_MaxInstances();

		/**
		 * The meta object literal for the '<em><b>Idle Timeout</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASIC_SCALING_TYPE__IDLE_TIMEOUT = eINSTANCE.getBasicScalingType_IdleTimeout();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.ClassLoaderConfigTypeImpl <em>Class Loader Config Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.ClassLoaderConfigTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getClassLoaderConfigType()
		 * @generated
		 */
		EClass CLASS_LOADER_CONFIG_TYPE = eINSTANCE.getClassLoaderConfigType();

		/**
		 * The meta object literal for the '<em><b>Priority Specifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS_LOADER_CONFIG_TYPE__PRIORITY_SPECIFIER = eINSTANCE.getClassLoaderConfigType_PrioritySpecifier();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.CpuUtilizationTypeImpl <em>Cpu Utilization Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.CpuUtilizationTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getCpuUtilizationType()
		 * @generated
		 */
		EClass CPU_UTILIZATION_TYPE = eINSTANCE.getCpuUtilizationType();

		/**
		 * The meta object literal for the '<em><b>Target Utilization</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU_UTILIZATION_TYPE__TARGET_UTILIZATION = eINSTANCE.getCpuUtilizationType_TargetUtilization();

		/**
		 * The meta object literal for the '<em><b>Aggregation Window Length Sec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CPU_UTILIZATION_TYPE__AGGREGATION_WINDOW_LENGTH_SEC = eINSTANCE.getCpuUtilizationType_AggregationWindowLengthSec();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.DocumentRootImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Appengine Web App</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__APPENGINE_WEB_APP = eINSTANCE.getDocumentRoot_AppengineWebApp();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.EnvVariablesTypeImpl <em>Env Variables Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.EnvVariablesTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getEnvVariablesType()
		 * @generated
		 */
		EClass ENV_VARIABLES_TYPE = eINSTANCE.getEnvVariablesType();

		/**
		 * The meta object literal for the '<em><b>Env Var</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENV_VARIABLES_TYPE__ENV_VAR = eINSTANCE.getEnvVariablesType_EnvVar();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.EnvVarTypeImpl <em>Env Var Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.EnvVarTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getEnvVarType()
		 * @generated
		 */
		EClass ENV_VAR_TYPE = eINSTANCE.getEnvVarType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_VAR_TYPE__VALUE = eINSTANCE.getEnvVarType_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_VAR_TYPE__NAME = eINSTANCE.getEnvVarType_Name();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENV_VAR_TYPE__VALUE1 = eINSTANCE.getEnvVarType_Value1();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.ExcludeTypeImpl <em>Exclude Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.ExcludeTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getExcludeType()
		 * @generated
		 */
		EClass EXCLUDE_TYPE = eINSTANCE.getExcludeType();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXCLUDE_TYPE__PATH = eINSTANCE.getExcludeType_Path();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.HttpHeaderTypeImpl <em>Http Header Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.HttpHeaderTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getHttpHeaderType()
		 * @generated
		 */
		EClass HTTP_HEADER_TYPE = eINSTANCE.getHttpHeaderType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_HEADER_TYPE__NAME = eINSTANCE.getHttpHeaderType_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HTTP_HEADER_TYPE__VALUE = eINSTANCE.getHttpHeaderType_Value();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.InboundServicesTypeImpl <em>Inbound Services Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.InboundServicesTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getInboundServicesType()
		 * @generated
		 */
		EClass INBOUND_SERVICES_TYPE = eINSTANCE.getInboundServicesType();

		/**
		 * The meta object literal for the '<em><b>Service</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INBOUND_SERVICES_TYPE__SERVICE = eINSTANCE.getInboundServicesType_Service();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.IncludeTypeImpl <em>Include Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.IncludeTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getIncludeType()
		 * @generated
		 */
		EClass INCLUDE_TYPE = eINSTANCE.getIncludeType();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INCLUDE_TYPE__PATH = eINSTANCE.getIncludeType_Path();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.ManualScalingTypeImpl <em>Manual Scaling Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.ManualScalingTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getManualScalingType()
		 * @generated
		 */
		EClass MANUAL_SCALING_TYPE = eINSTANCE.getManualScalingType();

		/**
		 * The meta object literal for the '<em><b>Instances</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MANUAL_SCALING_TYPE__INSTANCES = eINSTANCE.getManualScalingType_Instances();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.PagespeedTypeImpl <em>Pagespeed Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.PagespeedTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getPagespeedType()
		 * @generated
		 */
		EClass PAGESPEED_TYPE = eINSTANCE.getPagespeedType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGESPEED_TYPE__GROUP = eINSTANCE.getPagespeedType_Group();

		/**
		 * The meta object literal for the '<em><b>Url Blacklist</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGESPEED_TYPE__URL_BLACKLIST = eINSTANCE.getPagespeedType_UrlBlacklist();

		/**
		 * The meta object literal for the '<em><b>Domain To Rewrite</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGESPEED_TYPE__DOMAIN_TO_REWRITE = eINSTANCE.getPagespeedType_DomainToRewrite();

		/**
		 * The meta object literal for the '<em><b>Enabled Rewriter</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGESPEED_TYPE__ENABLED_REWRITER = eINSTANCE.getPagespeedType_EnabledRewriter();

		/**
		 * The meta object literal for the '<em><b>Disabled Rewriter</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PAGESPEED_TYPE__DISABLED_REWRITER = eINSTANCE.getPagespeedType_DisabledRewriter();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.PermissionTypeImpl <em>Permission Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.PermissionTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getPermissionType()
		 * @generated
		 */
		EClass PERMISSION_TYPE = eINSTANCE.getPermissionType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION_TYPE__VALUE = eINSTANCE.getPermissionType_Value();

		/**
		 * The meta object literal for the '<em><b>Actions</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION_TYPE__ACTIONS = eINSTANCE.getPermissionType_Actions();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION_TYPE__CLASS = eINSTANCE.getPermissionType_Class();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERMISSION_TYPE__NAME = eINSTANCE.getPermissionType_Name();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.PrioritySpecifierTypeImpl <em>Priority Specifier Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.PrioritySpecifierTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getPrioritySpecifierType()
		 * @generated
		 */
		EClass PRIORITY_SPECIFIER_TYPE = eINSTANCE.getPrioritySpecifierType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITY_SPECIFIER_TYPE__VALUE = eINSTANCE.getPrioritySpecifierType_Value();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITY_SPECIFIER_TYPE__FILENAME = eINSTANCE.getPrioritySpecifierType_Filename();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIORITY_SPECIFIER_TYPE__PRIORITY = eINSTANCE.getPrioritySpecifierType_Priority();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.PropertyTypeImpl <em>Property Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.PropertyTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getPropertyType()
		 * @generated
		 */
		EClass PROPERTY_TYPE = eINSTANCE.getPropertyType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__VALUE = eINSTANCE.getPropertyType_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__NAME = eINSTANCE.getPropertyType_Name();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROPERTY_TYPE__VALUE1 = eINSTANCE.getPropertyType_Value1();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.ResourceFilesTypeImpl <em>Resource Files Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.ResourceFilesTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getResourceFilesType()
		 * @generated
		 */
		EClass RESOURCE_FILES_TYPE = eINSTANCE.getResourceFilesType();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_FILES_TYPE__INCLUDE = eINSTANCE.getResourceFilesType_Include();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESOURCE_FILES_TYPE__EXCLUDE = eINSTANCE.getResourceFilesType_Exclude();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.SettingTypeImpl <em>Setting Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.SettingTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getSettingType()
		 * @generated
		 */
		EClass SETTING_TYPE = eINSTANCE.getSettingType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTING_TYPE__VALUE = eINSTANCE.getSettingType_Value();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTING_TYPE__NAME = eINSTANCE.getSettingType_Name();

		/**
		 * The meta object literal for the '<em><b>Value1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SETTING_TYPE__VALUE1 = eINSTANCE.getSettingType_Value1();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.StaticErrorHandlersImpl <em>Static Error Handlers</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.StaticErrorHandlersImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getStaticErrorHandlers()
		 * @generated
		 */
		EClass STATIC_ERROR_HANDLERS = eINSTANCE.getStaticErrorHandlers();

		/**
		 * The meta object literal for the '<em><b>Handler</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_ERROR_HANDLERS__HANDLER = eINSTANCE.getStaticErrorHandlers_Handler();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.StaticErrorHandlersHandlerImpl <em>Static Error Handlers Handler</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.StaticErrorHandlersHandlerImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getStaticErrorHandlersHandler()
		 * @generated
		 */
		EClass STATIC_ERROR_HANDLERS_HANDLER = eINSTANCE.getStaticErrorHandlersHandler();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_ERROR_HANDLERS_HANDLER__VALUE = eINSTANCE.getStaticErrorHandlersHandler_Value();

		/**
		 * The meta object literal for the '<em><b>Error Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_ERROR_HANDLERS_HANDLER__ERROR_CODE = eINSTANCE.getStaticErrorHandlersHandler_ErrorCode();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_ERROR_HANDLERS_HANDLER__FILE = eINSTANCE.getStaticErrorHandlersHandler_File();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.StaticFilesTypeImpl <em>Static Files Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.StaticFilesTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getStaticFilesType()
		 * @generated
		 */
		EClass STATIC_FILES_TYPE = eINSTANCE.getStaticFilesType();

		/**
		 * The meta object literal for the '<em><b>Include</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_FILES_TYPE__INCLUDE = eINSTANCE.getStaticFilesType_Include();

		/**
		 * The meta object literal for the '<em><b>Exclude</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_FILES_TYPE__EXCLUDE = eINSTANCE.getStaticFilesType_Exclude();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.StaticIncludeTypeImpl <em>Static Include Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.StaticIncludeTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getStaticIncludeType()
		 * @generated
		 */
		EClass STATIC_INCLUDE_TYPE = eINSTANCE.getStaticIncludeType();

		/**
		 * The meta object literal for the '<em><b>Http Header</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATIC_INCLUDE_TYPE__HTTP_HEADER = eINSTANCE.getStaticIncludeType_HttpHeader();

		/**
		 * The meta object literal for the '<em><b>Expiration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATIC_INCLUDE_TYPE__EXPIRATION = eINSTANCE.getStaticIncludeType_Expiration();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.SystemPropertiesTypeImpl <em>System Properties Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.SystemPropertiesTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getSystemPropertiesType()
		 * @generated
		 */
		EClass SYSTEM_PROPERTIES_TYPE = eINSTANCE.getSystemPropertiesType();

		/**
		 * The meta object literal for the '<em><b>Property</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_PROPERTIES_TYPE__PROPERTY = eINSTANCE.getSystemPropertiesType_Property();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.UserPermissionsTypeImpl <em>User Permissions Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.UserPermissionsTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getUserPermissionsType()
		 * @generated
		 */
		EClass USER_PERMISSIONS_TYPE = eINSTANCE.getUserPermissionsType();

		/**
		 * The meta object literal for the '<em><b>Permission</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_PERMISSIONS_TYPE__PERMISSION = eINSTANCE.getUserPermissionsType_Permission();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.VmHealthCheckTypeImpl <em>Vm Health Check Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.VmHealthCheckTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getVmHealthCheckType()
		 * @generated
		 */
		EClass VM_HEALTH_CHECK_TYPE = eINSTANCE.getVmHealthCheckType();

		/**
		 * The meta object literal for the '<em><b>Enable Health Check</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_HEALTH_CHECK_TYPE__ENABLE_HEALTH_CHECK = eINSTANCE.getVmHealthCheckType_EnableHealthCheck();

		/**
		 * The meta object literal for the '<em><b>Check Interval Sec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_HEALTH_CHECK_TYPE__CHECK_INTERVAL_SEC = eINSTANCE.getVmHealthCheckType_CheckIntervalSec();

		/**
		 * The meta object literal for the '<em><b>Timeout Sec</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_HEALTH_CHECK_TYPE__TIMEOUT_SEC = eINSTANCE.getVmHealthCheckType_TimeoutSec();

		/**
		 * The meta object literal for the '<em><b>Unhealthy Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_HEALTH_CHECK_TYPE__UNHEALTHY_THRESHOLD = eINSTANCE.getVmHealthCheckType_UnhealthyThreshold();

		/**
		 * The meta object literal for the '<em><b>Healthy Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_HEALTH_CHECK_TYPE__HEALTHY_THRESHOLD = eINSTANCE.getVmHealthCheckType_HealthyThreshold();

		/**
		 * The meta object literal for the '<em><b>Restart Threshold</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_HEALTH_CHECK_TYPE__RESTART_THRESHOLD = eINSTANCE.getVmHealthCheckType_RestartThreshold();

		/**
		 * The meta object literal for the '<em><b>Host</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VM_HEALTH_CHECK_TYPE__HOST = eINSTANCE.getVmHealthCheckType_Host();

		/**
		 * The meta object literal for the '{@link gaeweb.impl.VmSettingsTypeImpl <em>Vm Settings Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see gaeweb.impl.VmSettingsTypeImpl
		 * @see gaeweb.impl.GaewebPackageImpl#getVmSettingsType()
		 * @generated
		 */
		EClass VM_SETTINGS_TYPE = eINSTANCE.getVmSettingsType();

		/**
		 * The meta object literal for the '<em><b>Setting</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VM_SETTINGS_TYPE__SETTING = eINSTANCE.getVmSettingsType_Setting();

		/**
		 * The meta object literal for the '<em>Expiration Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gaeweb.impl.GaewebPackageImpl#getExpirationType()
		 * @generated
		 */
		EDataType EXPIRATION_TYPE = eINSTANCE.getExpirationType();

		/**
		 * The meta object literal for the '<em>Target Utilization Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.math.BigDecimal
		 * @see gaeweb.impl.GaewebPackageImpl#getTargetUtilizationType()
		 * @generated
		 */
		EDataType TARGET_UTILIZATION_TYPE = eINSTANCE.getTargetUtilizationType();

		/**
		 * The meta object literal for the '<em>Url Stream Handler Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see gaeweb.impl.GaewebPackageImpl#getUrlStreamHandlerType()
		 * @generated
		 */
		EDataType URL_STREAM_HANDLER_TYPE = eINSTANCE.getUrlStreamHandlerType();

	}

} //GaewebPackage
