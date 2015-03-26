/**
 */
package gaeweb.impl;

import gaeweb.*;

import java.math.BigDecimal;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GaewebFactoryImpl extends EFactoryImpl implements GaewebFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GaewebFactory init() {
		try {
			GaewebFactory theGaewebFactory = (GaewebFactory)EPackage.Registry.INSTANCE.getEFactory(GaewebPackage.eNS_URI);
			if (theGaewebFactory != null) {
				return theGaewebFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GaewebFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaewebFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GaewebPackage.ADMIN_CONSOLE: return createAdminConsole();
			case GaewebPackage.ADMIN_CONSOLE_PAGE_TYPE: return createAdminConsolePageType();
			case GaewebPackage.APPENGINE_WEB_APP_TYPE: return createAppengineWebAppType();
			case GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE: return createAsyncSessionPersistenceType();
			case GaewebPackage.AUTOMATIC_SCALING_TYPE: return createAutomaticScalingType();
			case GaewebPackage.BASIC_SCALING_TYPE: return createBasicScalingType();
			case GaewebPackage.CLASS_LOADER_CONFIG_TYPE: return createClassLoaderConfigType();
			case GaewebPackage.CPU_UTILIZATION_TYPE: return createCpuUtilizationType();
			case GaewebPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case GaewebPackage.ENV_VARIABLES_TYPE: return createEnvVariablesType();
			case GaewebPackage.ENV_VAR_TYPE: return createEnvVarType();
			case GaewebPackage.EXCLUDE_TYPE: return createExcludeType();
			case GaewebPackage.HTTP_HEADER_TYPE: return createHttpHeaderType();
			case GaewebPackage.INBOUND_SERVICES_TYPE: return createInboundServicesType();
			case GaewebPackage.INCLUDE_TYPE: return createIncludeType();
			case GaewebPackage.MANUAL_SCALING_TYPE: return createManualScalingType();
			case GaewebPackage.PAGESPEED_TYPE: return createPagespeedType();
			case GaewebPackage.PERMISSION_TYPE: return createPermissionType();
			case GaewebPackage.PRIORITY_SPECIFIER_TYPE: return createPrioritySpecifierType();
			case GaewebPackage.PROPERTY_TYPE: return createPropertyType();
			case GaewebPackage.RESOURCE_FILES_TYPE: return createResourceFilesType();
			case GaewebPackage.SETTING_TYPE: return createSettingType();
			case GaewebPackage.STATIC_ERROR_HANDLERS: return createStaticErrorHandlers();
			case GaewebPackage.STATIC_ERROR_HANDLERS_HANDLER: return createStaticErrorHandlersHandler();
			case GaewebPackage.STATIC_FILES_TYPE: return createStaticFilesType();
			case GaewebPackage.STATIC_INCLUDE_TYPE: return createStaticIncludeType();
			case GaewebPackage.SYSTEM_PROPERTIES_TYPE: return createSystemPropertiesType();
			case GaewebPackage.USER_PERMISSIONS_TYPE: return createUserPermissionsType();
			case GaewebPackage.VM_HEALTH_CHECK_TYPE: return createVmHealthCheckType();
			case GaewebPackage.VM_SETTINGS_TYPE: return createVmSettingsType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case GaewebPackage.EXPIRATION_TYPE:
				return createExpirationTypeFromString(eDataType, initialValue);
			case GaewebPackage.TARGET_UTILIZATION_TYPE:
				return createTargetUtilizationTypeFromString(eDataType, initialValue);
			case GaewebPackage.URL_STREAM_HANDLER_TYPE:
				return createUrlStreamHandlerTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case GaewebPackage.EXPIRATION_TYPE:
				return convertExpirationTypeToString(eDataType, instanceValue);
			case GaewebPackage.TARGET_UTILIZATION_TYPE:
				return convertTargetUtilizationTypeToString(eDataType, instanceValue);
			case GaewebPackage.URL_STREAM_HANDLER_TYPE:
				return convertUrlStreamHandlerTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdminConsole createAdminConsole() {
		AdminConsoleImpl adminConsole = new AdminConsoleImpl();
		return adminConsole;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdminConsolePageType createAdminConsolePageType() {
		AdminConsolePageTypeImpl adminConsolePageType = new AdminConsolePageTypeImpl();
		return adminConsolePageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AppengineWebAppType createAppengineWebAppType() {
		AppengineWebAppTypeImpl appengineWebAppType = new AppengineWebAppTypeImpl();
		return appengineWebAppType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AsyncSessionPersistenceType createAsyncSessionPersistenceType() {
		AsyncSessionPersistenceTypeImpl asyncSessionPersistenceType = new AsyncSessionPersistenceTypeImpl();
		return asyncSessionPersistenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutomaticScalingType createAutomaticScalingType() {
		AutomaticScalingTypeImpl automaticScalingType = new AutomaticScalingTypeImpl();
		return automaticScalingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicScalingType createBasicScalingType() {
		BasicScalingTypeImpl basicScalingType = new BasicScalingTypeImpl();
		return basicScalingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClassLoaderConfigType createClassLoaderConfigType() {
		ClassLoaderConfigTypeImpl classLoaderConfigType = new ClassLoaderConfigTypeImpl();
		return classLoaderConfigType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CpuUtilizationType createCpuUtilizationType() {
		CpuUtilizationTypeImpl cpuUtilizationType = new CpuUtilizationTypeImpl();
		return cpuUtilizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvVariablesType createEnvVariablesType() {
		EnvVariablesTypeImpl envVariablesType = new EnvVariablesTypeImpl();
		return envVariablesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvVarType createEnvVarType() {
		EnvVarTypeImpl envVarType = new EnvVarTypeImpl();
		return envVarType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExcludeType createExcludeType() {
		ExcludeTypeImpl excludeType = new ExcludeTypeImpl();
		return excludeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HttpHeaderType createHttpHeaderType() {
		HttpHeaderTypeImpl httpHeaderType = new HttpHeaderTypeImpl();
		return httpHeaderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InboundServicesType createInboundServicesType() {
		InboundServicesTypeImpl inboundServicesType = new InboundServicesTypeImpl();
		return inboundServicesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IncludeType createIncludeType() {
		IncludeTypeImpl includeType = new IncludeTypeImpl();
		return includeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManualScalingType createManualScalingType() {
		ManualScalingTypeImpl manualScalingType = new ManualScalingTypeImpl();
		return manualScalingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PagespeedType createPagespeedType() {
		PagespeedTypeImpl pagespeedType = new PagespeedTypeImpl();
		return pagespeedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionType createPermissionType() {
		PermissionTypeImpl permissionType = new PermissionTypeImpl();
		return permissionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrioritySpecifierType createPrioritySpecifierType() {
		PrioritySpecifierTypeImpl prioritySpecifierType = new PrioritySpecifierTypeImpl();
		return prioritySpecifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PropertyType createPropertyType() {
		PropertyTypeImpl propertyType = new PropertyTypeImpl();
		return propertyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceFilesType createResourceFilesType() {
		ResourceFilesTypeImpl resourceFilesType = new ResourceFilesTypeImpl();
		return resourceFilesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SettingType createSettingType() {
		SettingTypeImpl settingType = new SettingTypeImpl();
		return settingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticErrorHandlers createStaticErrorHandlers() {
		StaticErrorHandlersImpl staticErrorHandlers = new StaticErrorHandlersImpl();
		return staticErrorHandlers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticErrorHandlersHandler createStaticErrorHandlersHandler() {
		StaticErrorHandlersHandlerImpl staticErrorHandlersHandler = new StaticErrorHandlersHandlerImpl();
		return staticErrorHandlersHandler;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticFilesType createStaticFilesType() {
		StaticFilesTypeImpl staticFilesType = new StaticFilesTypeImpl();
		return staticFilesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StaticIncludeType createStaticIncludeType() {
		StaticIncludeTypeImpl staticIncludeType = new StaticIncludeTypeImpl();
		return staticIncludeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SystemPropertiesType createSystemPropertiesType() {
		SystemPropertiesTypeImpl systemPropertiesType = new SystemPropertiesTypeImpl();
		return systemPropertiesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserPermissionsType createUserPermissionsType() {
		UserPermissionsTypeImpl userPermissionsType = new UserPermissionsTypeImpl();
		return userPermissionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmHealthCheckType createVmHealthCheckType() {
		VmHealthCheckTypeImpl vmHealthCheckType = new VmHealthCheckTypeImpl();
		return vmHealthCheckType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VmSettingsType createVmSettingsType() {
		VmSettingsTypeImpl vmSettingsType = new VmSettingsTypeImpl();
		return vmSettingsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createExpirationTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertExpirationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal createTargetUtilizationTypeFromString(EDataType eDataType, String initialValue) {
		return (BigDecimal)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.DECIMAL, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTargetUtilizationTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.DECIMAL, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createUrlStreamHandlerTypeFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUrlStreamHandlerTypeToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaewebPackage getGaewebPackage() {
		return (GaewebPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GaewebPackage getPackage() {
		return GaewebPackage.eINSTANCE;
	}

} //GaewebFactoryImpl
