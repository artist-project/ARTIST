/**
 */
package gaeweb.impl;

import gaeweb.AdminConsole;
import gaeweb.AdminConsolePageType;
import gaeweb.AppengineWebAppType;
import gaeweb.AsyncSessionPersistenceType;
import gaeweb.AutomaticScalingType;
import gaeweb.BasicScalingType;
import gaeweb.ClassLoaderConfigType;
import gaeweb.CpuUtilizationType;
import gaeweb.DocumentRoot;
import gaeweb.EnvVarType;
import gaeweb.EnvVariablesType;
import gaeweb.ExcludeType;
import gaeweb.GaewebFactory;
import gaeweb.GaewebPackage;
import gaeweb.HttpHeaderType;
import gaeweb.InboundServicesType;
import gaeweb.IncludeType;
import gaeweb.ManualScalingType;
import gaeweb.PagespeedType;
import gaeweb.PermissionType;
import gaeweb.PrioritySpecifierType;
import gaeweb.PropertyType;
import gaeweb.ResourceFilesType;
import gaeweb.SettingType;
import gaeweb.StaticErrorHandlers;
import gaeweb.StaticErrorHandlersHandler;
import gaeweb.StaticFilesType;
import gaeweb.StaticIncludeType;
import gaeweb.SystemPropertiesType;
import gaeweb.UserPermissionsType;
import gaeweb.VmHealthCheckType;
import gaeweb.VmSettingsType;

import gaeweb.util.GaewebValidator;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GaewebPackageImpl extends EPackageImpl implements GaewebPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminConsoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminConsolePageTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass appengineWebAppTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass asyncSessionPersistenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass automaticScalingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicScalingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass classLoaderConfigTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cpuUtilizationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envVariablesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envVarTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass excludeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass httpHeaderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inboundServicesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass includeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualScalingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pagespeedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prioritySpecifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass propertyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceFilesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass settingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticErrorHandlersEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticErrorHandlersHandlerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticFilesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass staticIncludeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemPropertiesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userPermissionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmHealthCheckTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vmSettingsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType expirationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType targetUtilizationTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType urlStreamHandlerTypeEDataType = null;

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
	 * @see gaeweb.GaewebPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GaewebPackageImpl() {
		super(eNS_URI, GaewebFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link GaewebPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static GaewebPackage init() {
		if (isInited) return (GaewebPackage)EPackage.Registry.INSTANCE.getEPackage(GaewebPackage.eNS_URI);

		// Obtain or create and register package
		GaewebPackageImpl theGaewebPackage = (GaewebPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof GaewebPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new GaewebPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theGaewebPackage.createPackageContents();

		// Initialize created meta-data
		theGaewebPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theGaewebPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return GaewebValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theGaewebPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GaewebPackage.eNS_URI, theGaewebPackage);
		return theGaewebPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdminConsole() {
		return adminConsoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdminConsole_Page() {
		return (EReference)adminConsoleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdminConsolePageType() {
		return adminConsolePageTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdminConsolePageType_Value() {
		return (EAttribute)adminConsolePageTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdminConsolePageType_Name() {
		return (EAttribute)adminConsolePageTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdminConsolePageType_Url() {
		return (EAttribute)adminConsolePageTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAppengineWebAppType() {
		return appengineWebAppTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppengineWebAppType_Application() {
		return (EAttribute)appengineWebAppTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppengineWebAppType_Version() {
		return (EAttribute)appengineWebAppTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppengineWebAppType_SourceLanguage() {
		return (EAttribute)appengineWebAppTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppengineWebAppType_Module() {
		return (EAttribute)appengineWebAppTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppengineWebAppType_InstanceClass() {
		return (EAttribute)appengineWebAppTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppengineWebAppType_AutomaticScaling() {
		return (EReference)appengineWebAppTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppengineWebAppType_ManualScaling() {
		return (EReference)appengineWebAppTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppengineWebAppType_BasicScaling() {
		return (EReference)appengineWebAppTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppengineWebAppType_StaticFiles() {
		return (EReference)appengineWebAppTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppengineWebAppType_ResourceFiles() {
		return (EReference)appengineWebAppTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppengineWebAppType_SystemProperties() {
		return (EReference)appengineWebAppTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppengineWebAppType_VmSettings() {
		return (EReference)appengineWebAppTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppengineWebAppType_VmHealthCheck() {
		return (EReference)appengineWebAppTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppengineWebAppType_EnvVariables() {
		return (EReference)appengineWebAppTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppengineWebAppType_SslEnabled() {
		return (EAttribute)appengineWebAppTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppengineWebAppType_SessionsEnabled() {
		return (EAttribute)appengineWebAppTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppengineWebAppType_AsyncSessionPersistence() {
		return (EReference)appengineWebAppTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppengineWebAppType_UserPermissions() {
		return (EReference)appengineWebAppTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppengineWebAppType_PublicRoot() {
		return (EAttribute)appengineWebAppTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppengineWebAppType_InboundServices() {
		return (EReference)appengineWebAppTypeEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppengineWebAppType_PrecompilationEnabled() {
		return (EAttribute)appengineWebAppTypeEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppengineWebAppType_AdminConsole() {
		return (EReference)appengineWebAppTypeEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppengineWebAppType_StaticErrorHandlers() {
		return (EReference)appengineWebAppTypeEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppengineWebAppType_WarmupRequestsEnabled() {
		return (EAttribute)appengineWebAppTypeEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppengineWebAppType_Threadsafe() {
		return (EAttribute)appengineWebAppTypeEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppengineWebAppType_AutoIdPolicy() {
		return (EAttribute)appengineWebAppTypeEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppengineWebAppType_CodeLock() {
		return (EAttribute)appengineWebAppTypeEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppengineWebAppType_Vm() {
		return (EAttribute)appengineWebAppTypeEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppengineWebAppType_Pagespeed() {
		return (EReference)appengineWebAppTypeEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAppengineWebAppType_ClassLoaderConfig() {
		return (EReference)appengineWebAppTypeEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppengineWebAppType_UrlStreamHandler() {
		return (EAttribute)appengineWebAppTypeEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAppengineWebAppType_UseGoogleConnectorJ() {
		return (EAttribute)appengineWebAppTypeEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAsyncSessionPersistenceType() {
		return asyncSessionPersistenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsyncSessionPersistenceType_Value() {
		return (EAttribute)asyncSessionPersistenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsyncSessionPersistenceType_Enabled() {
		return (EAttribute)asyncSessionPersistenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAsyncSessionPersistenceType_QueueName() {
		return (EAttribute)asyncSessionPersistenceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutomaticScalingType() {
		return automaticScalingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticScalingType_MinPendingLatency() {
		return (EAttribute)automaticScalingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticScalingType_MaxPendingLatency() {
		return (EAttribute)automaticScalingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticScalingType_MinIdleInstances() {
		return (EAttribute)automaticScalingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticScalingType_MaxIdleInstances() {
		return (EAttribute)automaticScalingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticScalingType_MaxConcurrentRequests() {
		return (EAttribute)automaticScalingTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticScalingType_MinNumInstances() {
		return (EAttribute)automaticScalingTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticScalingType_MaxNumInstances() {
		return (EAttribute)automaticScalingTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAutomaticScalingType_CoolDownPeriodSec() {
		return (EAttribute)automaticScalingTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAutomaticScalingType_CpuUtilization() {
		return (EReference)automaticScalingTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicScalingType() {
		return basicScalingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicScalingType_MaxInstances() {
		return (EAttribute)basicScalingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicScalingType_IdleTimeout() {
		return (EAttribute)basicScalingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClassLoaderConfigType() {
		return classLoaderConfigTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClassLoaderConfigType_PrioritySpecifier() {
		return (EAttribute)classLoaderConfigTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCpuUtilizationType() {
		return cpuUtilizationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpuUtilizationType_TargetUtilization() {
		return (EAttribute)cpuUtilizationTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCpuUtilizationType_AggregationWindowLengthSec() {
		return (EAttribute)cpuUtilizationTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_AppengineWebApp() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvVariablesType() {
		return envVariablesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvVariablesType_EnvVar() {
		return (EReference)envVariablesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvVarType() {
		return envVarTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvVarType_Value() {
		return (EAttribute)envVarTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvVarType_Name() {
		return (EAttribute)envVarTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvVarType_Value1() {
		return (EAttribute)envVarTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExcludeType() {
		return excludeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExcludeType_Path() {
		return (EAttribute)excludeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHttpHeaderType() {
		return httpHeaderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpHeaderType_Name() {
		return (EAttribute)httpHeaderTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHttpHeaderType_Value() {
		return (EAttribute)httpHeaderTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInboundServicesType() {
		return inboundServicesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInboundServicesType_Service() {
		return (EAttribute)inboundServicesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIncludeType() {
		return includeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIncludeType_Path() {
		return (EAttribute)includeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManualScalingType() {
		return manualScalingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getManualScalingType_Instances() {
		return (EAttribute)manualScalingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPagespeedType() {
		return pagespeedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPagespeedType_Group() {
		return (EAttribute)pagespeedTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPagespeedType_UrlBlacklist() {
		return (EAttribute)pagespeedTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPagespeedType_DomainToRewrite() {
		return (EAttribute)pagespeedTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPagespeedType_EnabledRewriter() {
		return (EAttribute)pagespeedTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPagespeedType_DisabledRewriter() {
		return (EAttribute)pagespeedTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPermissionType() {
		return permissionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermissionType_Value() {
		return (EAttribute)permissionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermissionType_Actions() {
		return (EAttribute)permissionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermissionType_Class() {
		return (EAttribute)permissionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPermissionType_Name() {
		return (EAttribute)permissionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrioritySpecifierType() {
		return prioritySpecifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrioritySpecifierType_Value() {
		return (EAttribute)prioritySpecifierTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrioritySpecifierType_Filename() {
		return (EAttribute)prioritySpecifierTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrioritySpecifierType_Priority() {
		return (EAttribute)prioritySpecifierTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPropertyType() {
		return propertyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Value() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Name() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPropertyType_Value1() {
		return (EAttribute)propertyTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceFilesType() {
		return resourceFilesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceFilesType_Include() {
		return (EReference)resourceFilesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceFilesType_Exclude() {
		return (EReference)resourceFilesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSettingType() {
		return settingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingType_Value() {
		return (EAttribute)settingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingType_Name() {
		return (EAttribute)settingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSettingType_Value1() {
		return (EAttribute)settingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticErrorHandlers() {
		return staticErrorHandlersEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticErrorHandlers_Handler() {
		return (EReference)staticErrorHandlersEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticErrorHandlersHandler() {
		return staticErrorHandlersHandlerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticErrorHandlersHandler_Value() {
		return (EAttribute)staticErrorHandlersHandlerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticErrorHandlersHandler_ErrorCode() {
		return (EAttribute)staticErrorHandlersHandlerEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticErrorHandlersHandler_File() {
		return (EAttribute)staticErrorHandlersHandlerEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticFilesType() {
		return staticFilesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticFilesType_Include() {
		return (EReference)staticFilesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticFilesType_Exclude() {
		return (EReference)staticFilesTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStaticIncludeType() {
		return staticIncludeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStaticIncludeType_HttpHeader() {
		return (EReference)staticIncludeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStaticIncludeType_Expiration() {
		return (EAttribute)staticIncludeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSystemPropertiesType() {
		return systemPropertiesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSystemPropertiesType_Property() {
		return (EReference)systemPropertiesTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserPermissionsType() {
		return userPermissionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserPermissionsType_Permission() {
		return (EReference)userPermissionsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVmHealthCheckType() {
		return vmHealthCheckTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVmHealthCheckType_EnableHealthCheck() {
		return (EAttribute)vmHealthCheckTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVmHealthCheckType_CheckIntervalSec() {
		return (EAttribute)vmHealthCheckTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVmHealthCheckType_TimeoutSec() {
		return (EAttribute)vmHealthCheckTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVmHealthCheckType_UnhealthyThreshold() {
		return (EAttribute)vmHealthCheckTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVmHealthCheckType_HealthyThreshold() {
		return (EAttribute)vmHealthCheckTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVmHealthCheckType_RestartThreshold() {
		return (EAttribute)vmHealthCheckTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVmHealthCheckType_Host() {
		return (EAttribute)vmHealthCheckTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVmSettingsType() {
		return vmSettingsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVmSettingsType_Setting() {
		return (EReference)vmSettingsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getExpirationType() {
		return expirationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTargetUtilizationType() {
		return targetUtilizationTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUrlStreamHandlerType() {
		return urlStreamHandlerTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaewebFactory getGaewebFactory() {
		return (GaewebFactory)getEFactoryInstance();
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
		adminConsoleEClass = createEClass(ADMIN_CONSOLE);
		createEReference(adminConsoleEClass, ADMIN_CONSOLE__PAGE);

		adminConsolePageTypeEClass = createEClass(ADMIN_CONSOLE_PAGE_TYPE);
		createEAttribute(adminConsolePageTypeEClass, ADMIN_CONSOLE_PAGE_TYPE__VALUE);
		createEAttribute(adminConsolePageTypeEClass, ADMIN_CONSOLE_PAGE_TYPE__NAME);
		createEAttribute(adminConsolePageTypeEClass, ADMIN_CONSOLE_PAGE_TYPE__URL);

		appengineWebAppTypeEClass = createEClass(APPENGINE_WEB_APP_TYPE);
		createEAttribute(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__APPLICATION);
		createEAttribute(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__VERSION);
		createEAttribute(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__SOURCE_LANGUAGE);
		createEAttribute(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__MODULE);
		createEAttribute(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__INSTANCE_CLASS);
		createEReference(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__AUTOMATIC_SCALING);
		createEReference(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__MANUAL_SCALING);
		createEReference(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__BASIC_SCALING);
		createEReference(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__STATIC_FILES);
		createEReference(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__RESOURCE_FILES);
		createEReference(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__SYSTEM_PROPERTIES);
		createEReference(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__VM_SETTINGS);
		createEReference(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__VM_HEALTH_CHECK);
		createEReference(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__ENV_VARIABLES);
		createEAttribute(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__SSL_ENABLED);
		createEAttribute(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__SESSIONS_ENABLED);
		createEReference(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__ASYNC_SESSION_PERSISTENCE);
		createEReference(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__USER_PERMISSIONS);
		createEAttribute(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__PUBLIC_ROOT);
		createEReference(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__INBOUND_SERVICES);
		createEAttribute(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__PRECOMPILATION_ENABLED);
		createEReference(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__ADMIN_CONSOLE);
		createEReference(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__STATIC_ERROR_HANDLERS);
		createEAttribute(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__WARMUP_REQUESTS_ENABLED);
		createEAttribute(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__THREADSAFE);
		createEAttribute(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__AUTO_ID_POLICY);
		createEAttribute(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__CODE_LOCK);
		createEAttribute(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__VM);
		createEReference(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__PAGESPEED);
		createEReference(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__CLASS_LOADER_CONFIG);
		createEAttribute(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__URL_STREAM_HANDLER);
		createEAttribute(appengineWebAppTypeEClass, APPENGINE_WEB_APP_TYPE__USE_GOOGLE_CONNECTOR_J);

		asyncSessionPersistenceTypeEClass = createEClass(ASYNC_SESSION_PERSISTENCE_TYPE);
		createEAttribute(asyncSessionPersistenceTypeEClass, ASYNC_SESSION_PERSISTENCE_TYPE__VALUE);
		createEAttribute(asyncSessionPersistenceTypeEClass, ASYNC_SESSION_PERSISTENCE_TYPE__ENABLED);
		createEAttribute(asyncSessionPersistenceTypeEClass, ASYNC_SESSION_PERSISTENCE_TYPE__QUEUE_NAME);

		automaticScalingTypeEClass = createEClass(AUTOMATIC_SCALING_TYPE);
		createEAttribute(automaticScalingTypeEClass, AUTOMATIC_SCALING_TYPE__MIN_PENDING_LATENCY);
		createEAttribute(automaticScalingTypeEClass, AUTOMATIC_SCALING_TYPE__MAX_PENDING_LATENCY);
		createEAttribute(automaticScalingTypeEClass, AUTOMATIC_SCALING_TYPE__MIN_IDLE_INSTANCES);
		createEAttribute(automaticScalingTypeEClass, AUTOMATIC_SCALING_TYPE__MAX_IDLE_INSTANCES);
		createEAttribute(automaticScalingTypeEClass, AUTOMATIC_SCALING_TYPE__MAX_CONCURRENT_REQUESTS);
		createEAttribute(automaticScalingTypeEClass, AUTOMATIC_SCALING_TYPE__MIN_NUM_INSTANCES);
		createEAttribute(automaticScalingTypeEClass, AUTOMATIC_SCALING_TYPE__MAX_NUM_INSTANCES);
		createEAttribute(automaticScalingTypeEClass, AUTOMATIC_SCALING_TYPE__COOL_DOWN_PERIOD_SEC);
		createEReference(automaticScalingTypeEClass, AUTOMATIC_SCALING_TYPE__CPU_UTILIZATION);

		basicScalingTypeEClass = createEClass(BASIC_SCALING_TYPE);
		createEAttribute(basicScalingTypeEClass, BASIC_SCALING_TYPE__MAX_INSTANCES);
		createEAttribute(basicScalingTypeEClass, BASIC_SCALING_TYPE__IDLE_TIMEOUT);

		classLoaderConfigTypeEClass = createEClass(CLASS_LOADER_CONFIG_TYPE);
		createEAttribute(classLoaderConfigTypeEClass, CLASS_LOADER_CONFIG_TYPE__PRIORITY_SPECIFIER);

		cpuUtilizationTypeEClass = createEClass(CPU_UTILIZATION_TYPE);
		createEAttribute(cpuUtilizationTypeEClass, CPU_UTILIZATION_TYPE__TARGET_UTILIZATION);
		createEAttribute(cpuUtilizationTypeEClass, CPU_UTILIZATION_TYPE__AGGREGATION_WINDOW_LENGTH_SEC);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__APPENGINE_WEB_APP);

		envVariablesTypeEClass = createEClass(ENV_VARIABLES_TYPE);
		createEReference(envVariablesTypeEClass, ENV_VARIABLES_TYPE__ENV_VAR);

		envVarTypeEClass = createEClass(ENV_VAR_TYPE);
		createEAttribute(envVarTypeEClass, ENV_VAR_TYPE__VALUE);
		createEAttribute(envVarTypeEClass, ENV_VAR_TYPE__NAME);
		createEAttribute(envVarTypeEClass, ENV_VAR_TYPE__VALUE1);

		excludeTypeEClass = createEClass(EXCLUDE_TYPE);
		createEAttribute(excludeTypeEClass, EXCLUDE_TYPE__PATH);

		httpHeaderTypeEClass = createEClass(HTTP_HEADER_TYPE);
		createEAttribute(httpHeaderTypeEClass, HTTP_HEADER_TYPE__NAME);
		createEAttribute(httpHeaderTypeEClass, HTTP_HEADER_TYPE__VALUE);

		inboundServicesTypeEClass = createEClass(INBOUND_SERVICES_TYPE);
		createEAttribute(inboundServicesTypeEClass, INBOUND_SERVICES_TYPE__SERVICE);

		includeTypeEClass = createEClass(INCLUDE_TYPE);
		createEAttribute(includeTypeEClass, INCLUDE_TYPE__PATH);

		manualScalingTypeEClass = createEClass(MANUAL_SCALING_TYPE);
		createEAttribute(manualScalingTypeEClass, MANUAL_SCALING_TYPE__INSTANCES);

		pagespeedTypeEClass = createEClass(PAGESPEED_TYPE);
		createEAttribute(pagespeedTypeEClass, PAGESPEED_TYPE__GROUP);
		createEAttribute(pagespeedTypeEClass, PAGESPEED_TYPE__URL_BLACKLIST);
		createEAttribute(pagespeedTypeEClass, PAGESPEED_TYPE__DOMAIN_TO_REWRITE);
		createEAttribute(pagespeedTypeEClass, PAGESPEED_TYPE__ENABLED_REWRITER);
		createEAttribute(pagespeedTypeEClass, PAGESPEED_TYPE__DISABLED_REWRITER);

		permissionTypeEClass = createEClass(PERMISSION_TYPE);
		createEAttribute(permissionTypeEClass, PERMISSION_TYPE__VALUE);
		createEAttribute(permissionTypeEClass, PERMISSION_TYPE__ACTIONS);
		createEAttribute(permissionTypeEClass, PERMISSION_TYPE__CLASS);
		createEAttribute(permissionTypeEClass, PERMISSION_TYPE__NAME);

		prioritySpecifierTypeEClass = createEClass(PRIORITY_SPECIFIER_TYPE);
		createEAttribute(prioritySpecifierTypeEClass, PRIORITY_SPECIFIER_TYPE__VALUE);
		createEAttribute(prioritySpecifierTypeEClass, PRIORITY_SPECIFIER_TYPE__FILENAME);
		createEAttribute(prioritySpecifierTypeEClass, PRIORITY_SPECIFIER_TYPE__PRIORITY);

		propertyTypeEClass = createEClass(PROPERTY_TYPE);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__VALUE);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__NAME);
		createEAttribute(propertyTypeEClass, PROPERTY_TYPE__VALUE1);

		resourceFilesTypeEClass = createEClass(RESOURCE_FILES_TYPE);
		createEReference(resourceFilesTypeEClass, RESOURCE_FILES_TYPE__INCLUDE);
		createEReference(resourceFilesTypeEClass, RESOURCE_FILES_TYPE__EXCLUDE);

		settingTypeEClass = createEClass(SETTING_TYPE);
		createEAttribute(settingTypeEClass, SETTING_TYPE__VALUE);
		createEAttribute(settingTypeEClass, SETTING_TYPE__NAME);
		createEAttribute(settingTypeEClass, SETTING_TYPE__VALUE1);

		staticErrorHandlersEClass = createEClass(STATIC_ERROR_HANDLERS);
		createEReference(staticErrorHandlersEClass, STATIC_ERROR_HANDLERS__HANDLER);

		staticErrorHandlersHandlerEClass = createEClass(STATIC_ERROR_HANDLERS_HANDLER);
		createEAttribute(staticErrorHandlersHandlerEClass, STATIC_ERROR_HANDLERS_HANDLER__VALUE);
		createEAttribute(staticErrorHandlersHandlerEClass, STATIC_ERROR_HANDLERS_HANDLER__ERROR_CODE);
		createEAttribute(staticErrorHandlersHandlerEClass, STATIC_ERROR_HANDLERS_HANDLER__FILE);

		staticFilesTypeEClass = createEClass(STATIC_FILES_TYPE);
		createEReference(staticFilesTypeEClass, STATIC_FILES_TYPE__INCLUDE);
		createEReference(staticFilesTypeEClass, STATIC_FILES_TYPE__EXCLUDE);

		staticIncludeTypeEClass = createEClass(STATIC_INCLUDE_TYPE);
		createEReference(staticIncludeTypeEClass, STATIC_INCLUDE_TYPE__HTTP_HEADER);
		createEAttribute(staticIncludeTypeEClass, STATIC_INCLUDE_TYPE__EXPIRATION);

		systemPropertiesTypeEClass = createEClass(SYSTEM_PROPERTIES_TYPE);
		createEReference(systemPropertiesTypeEClass, SYSTEM_PROPERTIES_TYPE__PROPERTY);

		userPermissionsTypeEClass = createEClass(USER_PERMISSIONS_TYPE);
		createEReference(userPermissionsTypeEClass, USER_PERMISSIONS_TYPE__PERMISSION);

		vmHealthCheckTypeEClass = createEClass(VM_HEALTH_CHECK_TYPE);
		createEAttribute(vmHealthCheckTypeEClass, VM_HEALTH_CHECK_TYPE__ENABLE_HEALTH_CHECK);
		createEAttribute(vmHealthCheckTypeEClass, VM_HEALTH_CHECK_TYPE__CHECK_INTERVAL_SEC);
		createEAttribute(vmHealthCheckTypeEClass, VM_HEALTH_CHECK_TYPE__TIMEOUT_SEC);
		createEAttribute(vmHealthCheckTypeEClass, VM_HEALTH_CHECK_TYPE__UNHEALTHY_THRESHOLD);
		createEAttribute(vmHealthCheckTypeEClass, VM_HEALTH_CHECK_TYPE__HEALTHY_THRESHOLD);
		createEAttribute(vmHealthCheckTypeEClass, VM_HEALTH_CHECK_TYPE__RESTART_THRESHOLD);
		createEAttribute(vmHealthCheckTypeEClass, VM_HEALTH_CHECK_TYPE__HOST);

		vmSettingsTypeEClass = createEClass(VM_SETTINGS_TYPE);
		createEReference(vmSettingsTypeEClass, VM_SETTINGS_TYPE__SETTING);

		// Create data types
		expirationTypeEDataType = createEDataType(EXPIRATION_TYPE);
		targetUtilizationTypeEDataType = createEDataType(TARGET_UTILIZATION_TYPE);
		urlStreamHandlerTypeEDataType = createEDataType(URL_STREAM_HANDLER_TYPE);
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
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		staticIncludeTypeEClass.getESuperTypes().add(this.getIncludeType());

		// Initialize classes, features, and operations; add parameters
		initEClass(adminConsoleEClass, AdminConsole.class, "AdminConsole", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAdminConsole_Page(), this.getAdminConsolePageType(), null, "page", null, 0, -1, AdminConsole.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(adminConsolePageTypeEClass, AdminConsolePageType.class, "AdminConsolePageType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdminConsolePageType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, AdminConsolePageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdminConsolePageType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, AdminConsolePageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAdminConsolePageType_Url(), theXMLTypePackage.getString(), "url", null, 1, 1, AdminConsolePageType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(appengineWebAppTypeEClass, AppengineWebAppType.class, "AppengineWebAppType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAppengineWebAppType_Application(), theXMLTypePackage.getString(), "application", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppengineWebAppType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppengineWebAppType_SourceLanguage(), theXMLTypePackage.getString(), "sourceLanguage", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppengineWebAppType_Module(), theXMLTypePackage.getString(), "module", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppengineWebAppType_InstanceClass(), theXMLTypePackage.getString(), "instanceClass", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppengineWebAppType_AutomaticScaling(), this.getAutomaticScalingType(), null, "automaticScaling", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppengineWebAppType_ManualScaling(), this.getManualScalingType(), null, "manualScaling", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppengineWebAppType_BasicScaling(), this.getBasicScalingType(), null, "basicScaling", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppengineWebAppType_StaticFiles(), this.getStaticFilesType(), null, "staticFiles", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppengineWebAppType_ResourceFiles(), this.getResourceFilesType(), null, "resourceFiles", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppengineWebAppType_SystemProperties(), this.getSystemPropertiesType(), null, "systemProperties", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppengineWebAppType_VmSettings(), this.getVmSettingsType(), null, "vmSettings", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppengineWebAppType_VmHealthCheck(), this.getVmHealthCheckType(), null, "vmHealthCheck", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppengineWebAppType_EnvVariables(), this.getEnvVariablesType(), null, "envVariables", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppengineWebAppType_SslEnabled(), theXMLTypePackage.getBoolean(), "sslEnabled", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppengineWebAppType_SessionsEnabled(), theXMLTypePackage.getBoolean(), "sessionsEnabled", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppengineWebAppType_AsyncSessionPersistence(), this.getAsyncSessionPersistenceType(), null, "asyncSessionPersistence", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppengineWebAppType_UserPermissions(), this.getUserPermissionsType(), null, "userPermissions", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppengineWebAppType_PublicRoot(), theXMLTypePackage.getString(), "publicRoot", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppengineWebAppType_InboundServices(), this.getInboundServicesType(), null, "inboundServices", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppengineWebAppType_PrecompilationEnabled(), theXMLTypePackage.getBoolean(), "precompilationEnabled", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppengineWebAppType_AdminConsole(), this.getAdminConsole(), null, "adminConsole", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppengineWebAppType_StaticErrorHandlers(), this.getStaticErrorHandlers(), null, "staticErrorHandlers", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppengineWebAppType_WarmupRequestsEnabled(), theXMLTypePackage.getBoolean(), "warmupRequestsEnabled", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppengineWebAppType_Threadsafe(), theXMLTypePackage.getBoolean(), "threadsafe", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppengineWebAppType_AutoIdPolicy(), theXMLTypePackage.getString(), "autoIdPolicy", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppengineWebAppType_CodeLock(), theXMLTypePackage.getBoolean(), "codeLock", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppengineWebAppType_Vm(), theXMLTypePackage.getBoolean(), "vm", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppengineWebAppType_Pagespeed(), this.getPagespeedType(), null, "pagespeed", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAppengineWebAppType_ClassLoaderConfig(), this.getClassLoaderConfigType(), null, "classLoaderConfig", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppengineWebAppType_UrlStreamHandler(), this.getUrlStreamHandlerType(), "urlStreamHandler", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAppengineWebAppType_UseGoogleConnectorJ(), theXMLTypePackage.getBoolean(), "useGoogleConnectorJ", null, 0, 1, AppengineWebAppType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(asyncSessionPersistenceTypeEClass, AsyncSessionPersistenceType.class, "AsyncSessionPersistenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAsyncSessionPersistenceType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, AsyncSessionPersistenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsyncSessionPersistenceType_Enabled(), theXMLTypePackage.getBoolean(), "enabled", null, 1, 1, AsyncSessionPersistenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAsyncSessionPersistenceType_QueueName(), theXMLTypePackage.getString(), "queueName", null, 0, 1, AsyncSessionPersistenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(automaticScalingTypeEClass, AutomaticScalingType.class, "AutomaticScalingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAutomaticScalingType_MinPendingLatency(), theXMLTypePackage.getString(), "minPendingLatency", null, 0, 1, AutomaticScalingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomaticScalingType_MaxPendingLatency(), theXMLTypePackage.getString(), "maxPendingLatency", null, 0, 1, AutomaticScalingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomaticScalingType_MinIdleInstances(), theXMLTypePackage.getString(), "minIdleInstances", null, 0, 1, AutomaticScalingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomaticScalingType_MaxIdleInstances(), theXMLTypePackage.getString(), "maxIdleInstances", null, 0, 1, AutomaticScalingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomaticScalingType_MaxConcurrentRequests(), theXMLTypePackage.getString(), "maxConcurrentRequests", null, 0, 1, AutomaticScalingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomaticScalingType_MinNumInstances(), theXMLTypePackage.getPositiveInteger(), "minNumInstances", null, 0, 1, AutomaticScalingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomaticScalingType_MaxNumInstances(), theXMLTypePackage.getPositiveInteger(), "maxNumInstances", null, 0, 1, AutomaticScalingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAutomaticScalingType_CoolDownPeriodSec(), theXMLTypePackage.getPositiveInteger(), "coolDownPeriodSec", null, 0, 1, AutomaticScalingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAutomaticScalingType_CpuUtilization(), this.getCpuUtilizationType(), null, "cpuUtilization", null, 0, 1, AutomaticScalingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(basicScalingTypeEClass, BasicScalingType.class, "BasicScalingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasicScalingType_MaxInstances(), theXMLTypePackage.getString(), "maxInstances", null, 1, 1, BasicScalingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasicScalingType_IdleTimeout(), theXMLTypePackage.getString(), "idleTimeout", null, 0, 1, BasicScalingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(classLoaderConfigTypeEClass, ClassLoaderConfigType.class, "ClassLoaderConfigType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClassLoaderConfigType_PrioritySpecifier(), theXMLTypePackage.getAnySimpleType(), "prioritySpecifier", null, 1, -1, ClassLoaderConfigType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cpuUtilizationTypeEClass, CpuUtilizationType.class, "CpuUtilizationType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCpuUtilizationType_TargetUtilization(), this.getTargetUtilizationType(), "targetUtilization", null, 0, 1, CpuUtilizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCpuUtilizationType_AggregationWindowLengthSec(), theXMLTypePackage.getPositiveInteger(), "aggregationWindowLengthSec", null, 0, 1, CpuUtilizationType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_AppengineWebApp(), this.getAppengineWebAppType(), null, "appengineWebApp", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(envVariablesTypeEClass, EnvVariablesType.class, "EnvVariablesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEnvVariablesType_EnvVar(), this.getEnvVarType(), null, "envVar", null, 0, -1, EnvVariablesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(envVarTypeEClass, EnvVarType.class, "EnvVarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvVarType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, EnvVarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvVarType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, EnvVarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEnvVarType_Value1(), theXMLTypePackage.getString(), "value1", null, 1, 1, EnvVarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(excludeTypeEClass, ExcludeType.class, "ExcludeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExcludeType_Path(), theXMLTypePackage.getString(), "path", null, 1, 1, ExcludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(httpHeaderTypeEClass, HttpHeaderType.class, "HttpHeaderType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getHttpHeaderType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, HttpHeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHttpHeaderType_Value(), theXMLTypePackage.getString(), "value", null, 1, 1, HttpHeaderType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inboundServicesTypeEClass, InboundServicesType.class, "InboundServicesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInboundServicesType_Service(), theXMLTypePackage.getString(), "service", null, 0, -1, InboundServicesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(includeTypeEClass, IncludeType.class, "IncludeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIncludeType_Path(), theXMLTypePackage.getString(), "path", null, 1, 1, IncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(manualScalingTypeEClass, ManualScalingType.class, "ManualScalingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getManualScalingType_Instances(), theXMLTypePackage.getString(), "instances", null, 1, 1, ManualScalingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(pagespeedTypeEClass, PagespeedType.class, "PagespeedType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPagespeedType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, PagespeedType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPagespeedType_UrlBlacklist(), theXMLTypePackage.getString(), "urlBlacklist", null, 0, -1, PagespeedType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPagespeedType_DomainToRewrite(), theXMLTypePackage.getString(), "domainToRewrite", null, 0, -1, PagespeedType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPagespeedType_EnabledRewriter(), theXMLTypePackage.getString(), "enabledRewriter", null, 0, -1, PagespeedType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getPagespeedType_DisabledRewriter(), theXMLTypePackage.getString(), "disabledRewriter", null, 0, -1, PagespeedType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(permissionTypeEClass, PermissionType.class, "PermissionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPermissionType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, PermissionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermissionType_Actions(), theXMLTypePackage.getString(), "actions", null, 0, 1, PermissionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermissionType_Class(), theXMLTypePackage.getString(), "class", null, 1, 1, PermissionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPermissionType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PermissionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prioritySpecifierTypeEClass, PrioritySpecifierType.class, "PrioritySpecifierType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrioritySpecifierType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, PrioritySpecifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrioritySpecifierType_Filename(), theXMLTypePackage.getString(), "filename", null, 1, 1, PrioritySpecifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPrioritySpecifierType_Priority(), theXMLTypePackage.getDouble(), "priority", null, 0, 1, PrioritySpecifierType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(propertyTypeEClass, PropertyType.class, "PropertyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPropertyType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPropertyType_Value1(), theXMLTypePackage.getString(), "value1", null, 1, 1, PropertyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(resourceFilesTypeEClass, ResourceFilesType.class, "ResourceFilesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResourceFilesType_Include(), this.getIncludeType(), null, "include", null, 0, -1, ResourceFilesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getResourceFilesType_Exclude(), this.getExcludeType(), null, "exclude", null, 0, -1, ResourceFilesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(settingTypeEClass, SettingType.class, "SettingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSettingType_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, SettingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingType_Name(), theXMLTypePackage.getString(), "name", null, 1, 1, SettingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSettingType_Value1(), theXMLTypePackage.getString(), "value1", null, 1, 1, SettingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticErrorHandlersEClass, StaticErrorHandlers.class, "StaticErrorHandlers", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaticErrorHandlers_Handler(), this.getStaticErrorHandlersHandler(), null, "handler", null, 0, -1, StaticErrorHandlers.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticErrorHandlersHandlerEClass, StaticErrorHandlersHandler.class, "StaticErrorHandlersHandler", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getStaticErrorHandlersHandler_Value(), theXMLTypePackage.getString(), "value", null, 0, 1, StaticErrorHandlersHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticErrorHandlersHandler_ErrorCode(), theXMLTypePackage.getString(), "errorCode", null, 0, 1, StaticErrorHandlersHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticErrorHandlersHandler_File(), theXMLTypePackage.getString(), "file", null, 1, 1, StaticErrorHandlersHandler.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticFilesTypeEClass, StaticFilesType.class, "StaticFilesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaticFilesType_Include(), this.getStaticIncludeType(), null, "include", null, 0, -1, StaticFilesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getStaticFilesType_Exclude(), this.getExcludeType(), null, "exclude", null, 0, -1, StaticFilesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(staticIncludeTypeEClass, StaticIncludeType.class, "StaticIncludeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStaticIncludeType_HttpHeader(), this.getHttpHeaderType(), null, "httpHeader", null, 0, -1, StaticIncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getStaticIncludeType_Expiration(), this.getExpirationType(), "expiration", null, 0, 1, StaticIncludeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(systemPropertiesTypeEClass, SystemPropertiesType.class, "SystemPropertiesType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemPropertiesType_Property(), this.getPropertyType(), null, "property", null, 0, -1, SystemPropertiesType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userPermissionsTypeEClass, UserPermissionsType.class, "UserPermissionsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserPermissionsType_Permission(), this.getPermissionType(), null, "permission", null, 0, -1, UserPermissionsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmHealthCheckTypeEClass, VmHealthCheckType.class, "VmHealthCheckType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVmHealthCheckType_EnableHealthCheck(), theXMLTypePackage.getBoolean(), "enableHealthCheck", null, 0, 1, VmHealthCheckType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVmHealthCheckType_CheckIntervalSec(), theXMLTypePackage.getUnsignedInt(), "checkIntervalSec", null, 0, 1, VmHealthCheckType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVmHealthCheckType_TimeoutSec(), theXMLTypePackage.getUnsignedInt(), "timeoutSec", null, 0, 1, VmHealthCheckType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVmHealthCheckType_UnhealthyThreshold(), theXMLTypePackage.getUnsignedInt(), "unhealthyThreshold", null, 0, 1, VmHealthCheckType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVmHealthCheckType_HealthyThreshold(), theXMLTypePackage.getUnsignedInt(), "healthyThreshold", null, 0, 1, VmHealthCheckType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVmHealthCheckType_RestartThreshold(), theXMLTypePackage.getUnsignedInt(), "restartThreshold", null, 0, 1, VmHealthCheckType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVmHealthCheckType_Host(), theXMLTypePackage.getString(), "host", null, 0, 1, VmHealthCheckType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vmSettingsTypeEClass, VmSettingsType.class, "VmSettingsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVmSettingsType_Setting(), this.getSettingType(), null, "setting", null, 0, -1, VmSettingsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(expirationTypeEDataType, String.class, "ExpirationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(targetUtilizationTypeEDataType, BigDecimal.class, "TargetUtilizationType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(urlStreamHandlerTypeEDataType, String.class, "UrlStreamHandlerType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (adminConsoleEClass, 
		   source, 
		   new String[] {
			 "name", "admin-console",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAdminConsole_Page(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "page",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (adminConsolePageTypeEClass, 
		   source, 
		   new String[] {
			 "name", "admin-console-pageType",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getAdminConsolePageType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getAdminConsolePageType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getAdminConsolePageType_Url(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "url"
		   });	
		addAnnotation
		  (appengineWebAppTypeEClass, 
		   source, 
		   new String[] {
			 "name", "appengine-web-appType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAppengineWebAppType_Application(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "application",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_Version(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "version",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_SourceLanguage(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "source-language",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_Module(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "module",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_InstanceClass(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "instance-class",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_AutomaticScaling(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "automatic-scaling",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_ManualScaling(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "manual-scaling",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_BasicScaling(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "basic-scaling",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_StaticFiles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "static-files",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_ResourceFiles(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "resource-files",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_SystemProperties(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "system-properties",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_VmSettings(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "vm-settings",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_VmHealthCheck(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "vm-health-check",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_EnvVariables(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "env-variables",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_SslEnabled(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ssl-enabled",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_SessionsEnabled(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "sessions-enabled",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_AsyncSessionPersistence(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "async-session-persistence",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_UserPermissions(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "user-permissions",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_PublicRoot(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "public-root",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_InboundServices(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "inbound-services",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_PrecompilationEnabled(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "precompilation-enabled",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_AdminConsole(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "admin-console",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_StaticErrorHandlers(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "static-error-handlers",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_WarmupRequestsEnabled(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "warmup-requests-enabled",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_Threadsafe(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "threadsafe",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_AutoIdPolicy(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "auto-id-policy",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_CodeLock(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "code-lock",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_Vm(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "vm",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_Pagespeed(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pagespeed",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_ClassLoaderConfig(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "class-loader-config",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_UrlStreamHandler(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "url-stream-handler",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAppengineWebAppType_UseGoogleConnectorJ(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "use-google-connector-j",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (asyncSessionPersistenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "asyncSessionPersistenceType",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getAsyncSessionPersistenceType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getAsyncSessionPersistenceType_Enabled(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "enabled"
		   });	
		addAnnotation
		  (getAsyncSessionPersistenceType_QueueName(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "queue-name"
		   });	
		addAnnotation
		  (automaticScalingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "automatic-scaling-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getAutomaticScalingType_MinPendingLatency(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "min-pending-latency",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAutomaticScalingType_MaxPendingLatency(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "max-pending-latency",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAutomaticScalingType_MinIdleInstances(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "min-idle-instances",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAutomaticScalingType_MaxIdleInstances(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "max-idle-instances",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAutomaticScalingType_MaxConcurrentRequests(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "max-concurrent-requests",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAutomaticScalingType_MinNumInstances(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "min-num-instances",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAutomaticScalingType_MaxNumInstances(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "max-num-instances",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAutomaticScalingType_CoolDownPeriodSec(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cool-down-period-sec",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getAutomaticScalingType_CpuUtilization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cpu-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (basicScalingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "basic-scaling-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getBasicScalingType_MaxInstances(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "max-instances",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getBasicScalingType_IdleTimeout(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "idle-timeout",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (classLoaderConfigTypeEClass, 
		   source, 
		   new String[] {
			 "name", "classLoaderConfigType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getClassLoaderConfigType_PrioritySpecifier(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "priority-specifier",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (cpuUtilizationTypeEClass, 
		   source, 
		   new String[] {
			 "name", "cpu-utilization-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getCpuUtilizationType_TargetUtilization(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "target-utilization",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getCpuUtilizationType_AggregationWindowLengthSec(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "aggregation-window-length-sec",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });	
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });	
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });	
		addAnnotation
		  (getDocumentRoot_AppengineWebApp(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "appengine-web-app",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (envVariablesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "env-variablesType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getEnvVariablesType_EnvVar(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "env-var",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (envVarTypeEClass, 
		   source, 
		   new String[] {
			 "name", "env-varType",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getEnvVarType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getEnvVarType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getEnvVarType_Value1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (excludeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "excludeType",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getExcludeType_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });	
		addAnnotation
		  (expirationTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "expirationType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "\\s*(([0-9]+)([DdHhMm]|[sS]?))(\\s+([0-9]+)([DdHhMm]|[sS]?))*\\s*"
		   });	
		addAnnotation
		  (httpHeaderTypeEClass, 
		   source, 
		   new String[] {
			 "name", "http-headerType",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getHttpHeaderType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getHttpHeaderType_Value(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (inboundServicesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "inboundServicesType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getInboundServicesType_Service(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "service",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (includeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "includeType",
			 "kind", "empty"
		   });	
		addAnnotation
		  (getIncludeType_Path(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "path"
		   });	
		addAnnotation
		  (manualScalingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "manual-scaling-type",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getManualScalingType_Instances(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "instances",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (pagespeedTypeEClass, 
		   source, 
		   new String[] {
			 "name", "pagespeedType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getPagespeedType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });	
		addAnnotation
		  (getPagespeedType_UrlBlacklist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "url-blacklist",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getPagespeedType_DomainToRewrite(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "domain-to-rewrite",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getPagespeedType_EnabledRewriter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "enabled-rewriter",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (getPagespeedType_DisabledRewriter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "disabled-rewriter",
			 "namespace", "##targetNamespace",
			 "group", "#group:0"
		   });	
		addAnnotation
		  (permissionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "permissionType",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPermissionType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPermissionType_Actions(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "actions"
		   });	
		addAnnotation
		  (getPermissionType_Class(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "class"
		   });	
		addAnnotation
		  (getPermissionType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (prioritySpecifierTypeEClass, 
		   source, 
		   new String[] {
			 "name", "prioritySpecifierType",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPrioritySpecifierType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPrioritySpecifierType_Filename(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "filename"
		   });	
		addAnnotation
		  (getPrioritySpecifierType_Priority(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "priority"
		   });	
		addAnnotation
		  (propertyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "propertyType",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPropertyType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getPropertyType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getPropertyType_Value1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (resourceFilesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "resource-filesType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getResourceFilesType_Include(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "include",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getResourceFilesType_Exclude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "exclude",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (settingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "settingType",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getSettingType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getSettingType_Name(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "name"
		   });	
		addAnnotation
		  (getSettingType_Value1(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "value"
		   });	
		addAnnotation
		  (staticErrorHandlersEClass, 
		   source, 
		   new String[] {
			 "name", "static-error-handlers",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getStaticErrorHandlers_Handler(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "handler",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (staticErrorHandlersHandlerEClass, 
		   source, 
		   new String[] {
			 "name", "static-error-handlers-handler",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getStaticErrorHandlersHandler_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });	
		addAnnotation
		  (getStaticErrorHandlersHandler_ErrorCode(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "error-code"
		   });	
		addAnnotation
		  (getStaticErrorHandlersHandler_File(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "file"
		   });	
		addAnnotation
		  (staticFilesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "static-filesType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getStaticFilesType_Include(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "include",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getStaticFilesType_Exclude(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "exclude",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (staticIncludeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "staticIncludeType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getStaticIncludeType_HttpHeader(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "http-header",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getStaticIncludeType_Expiration(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "expiration"
		   });	
		addAnnotation
		  (systemPropertiesTypeEClass, 
		   source, 
		   new String[] {
			 "name", "system-propertiesType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getSystemPropertiesType_Property(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "property",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (targetUtilizationTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "target-utilization_._type",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#decimal",
			 "minExclusive", "0",
			 "maxInclusive", "1"
		   });	
		addAnnotation
		  (urlStreamHandlerTypeEDataType, 
		   source, 
		   new String[] {
			 "name", "urlStreamHandlerType",
			 "baseType", "http://www.eclipse.org/emf/2003/XMLType#string",
			 "pattern", "urlfetch|native"
		   });	
		addAnnotation
		  (userPermissionsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "userPermissionsType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getUserPermissionsType_Permission(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "permission",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (vmHealthCheckTypeEClass, 
		   source, 
		   new String[] {
			 "name", "vm-health-checkType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getVmHealthCheckType_EnableHealthCheck(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "enable-health-check",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVmHealthCheckType_CheckIntervalSec(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "check-interval-sec",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVmHealthCheckType_TimeoutSec(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "timeout-sec",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVmHealthCheckType_UnhealthyThreshold(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "unhealthy-threshold",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVmHealthCheckType_HealthyThreshold(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "healthy-threshold",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVmHealthCheckType_RestartThreshold(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "restart-threshold",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (getVmHealthCheckType_Host(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "host",
			 "namespace", "##targetNamespace"
		   });	
		addAnnotation
		  (vmSettingsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "vm-settingsType",
			 "kind", "elementOnly"
		   });	
		addAnnotation
		  (getVmSettingsType_Setting(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "setting",
			 "namespace", "##targetNamespace"
		   });
	}

} //GaewebPackageImpl
