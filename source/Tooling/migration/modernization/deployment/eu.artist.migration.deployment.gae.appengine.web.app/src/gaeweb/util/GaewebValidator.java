/**
 */
package gaeweb.util;

import gaeweb.*;

import java.math.BigDecimal;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.emf.ecore.xml.type.util.XMLTypeUtil;
import org.eclipse.emf.ecore.xml.type.util.XMLTypeValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see gaeweb.GaewebPackage
 * @generated
 */
public class GaewebValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final GaewebValidator INSTANCE = new GaewebValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "gaeweb";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected XMLTypeValidator xmlTypeValidator;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaewebValidator() {
		super();
		xmlTypeValidator = XMLTypeValidator.INSTANCE;
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return GaewebPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case GaewebPackage.ADMIN_CONSOLE:
				return validateAdminConsole((AdminConsole)value, diagnostics, context);
			case GaewebPackage.ADMIN_CONSOLE_PAGE_TYPE:
				return validateAdminConsolePageType((AdminConsolePageType)value, diagnostics, context);
			case GaewebPackage.APPENGINE_WEB_APP_TYPE:
				return validateAppengineWebAppType((AppengineWebAppType)value, diagnostics, context);
			case GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE:
				return validateAsyncSessionPersistenceType((AsyncSessionPersistenceType)value, diagnostics, context);
			case GaewebPackage.AUTOMATIC_SCALING_TYPE:
				return validateAutomaticScalingType((AutomaticScalingType)value, diagnostics, context);
			case GaewebPackage.BASIC_SCALING_TYPE:
				return validateBasicScalingType((BasicScalingType)value, diagnostics, context);
			case GaewebPackage.CLASS_LOADER_CONFIG_TYPE:
				return validateClassLoaderConfigType((ClassLoaderConfigType)value, diagnostics, context);
			case GaewebPackage.CPU_UTILIZATION_TYPE:
				return validateCpuUtilizationType((CpuUtilizationType)value, diagnostics, context);
			case GaewebPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case GaewebPackage.ENV_VARIABLES_TYPE:
				return validateEnvVariablesType((EnvVariablesType)value, diagnostics, context);
			case GaewebPackage.ENV_VAR_TYPE:
				return validateEnvVarType((EnvVarType)value, diagnostics, context);
			case GaewebPackage.EXCLUDE_TYPE:
				return validateExcludeType((ExcludeType)value, diagnostics, context);
			case GaewebPackage.HTTP_HEADER_TYPE:
				return validateHttpHeaderType((HttpHeaderType)value, diagnostics, context);
			case GaewebPackage.INBOUND_SERVICES_TYPE:
				return validateInboundServicesType((InboundServicesType)value, diagnostics, context);
			case GaewebPackage.INCLUDE_TYPE:
				return validateIncludeType((IncludeType)value, diagnostics, context);
			case GaewebPackage.MANUAL_SCALING_TYPE:
				return validateManualScalingType((ManualScalingType)value, diagnostics, context);
			case GaewebPackage.PAGESPEED_TYPE:
				return validatePagespeedType((PagespeedType)value, diagnostics, context);
			case GaewebPackage.PERMISSION_TYPE:
				return validatePermissionType((PermissionType)value, diagnostics, context);
			case GaewebPackage.PRIORITY_SPECIFIER_TYPE:
				return validatePrioritySpecifierType((PrioritySpecifierType)value, diagnostics, context);
			case GaewebPackage.PROPERTY_TYPE:
				return validatePropertyType((PropertyType)value, diagnostics, context);
			case GaewebPackage.RESOURCE_FILES_TYPE:
				return validateResourceFilesType((ResourceFilesType)value, diagnostics, context);
			case GaewebPackage.SETTING_TYPE:
				return validateSettingType((SettingType)value, diagnostics, context);
			case GaewebPackage.STATIC_ERROR_HANDLERS:
				return validateStaticErrorHandlers((StaticErrorHandlers)value, diagnostics, context);
			case GaewebPackage.STATIC_ERROR_HANDLERS_HANDLER:
				return validateStaticErrorHandlersHandler((StaticErrorHandlersHandler)value, diagnostics, context);
			case GaewebPackage.STATIC_FILES_TYPE:
				return validateStaticFilesType((StaticFilesType)value, diagnostics, context);
			case GaewebPackage.STATIC_INCLUDE_TYPE:
				return validateStaticIncludeType((StaticIncludeType)value, diagnostics, context);
			case GaewebPackage.SYSTEM_PROPERTIES_TYPE:
				return validateSystemPropertiesType((SystemPropertiesType)value, diagnostics, context);
			case GaewebPackage.USER_PERMISSIONS_TYPE:
				return validateUserPermissionsType((UserPermissionsType)value, diagnostics, context);
			case GaewebPackage.VM_HEALTH_CHECK_TYPE:
				return validateVmHealthCheckType((VmHealthCheckType)value, diagnostics, context);
			case GaewebPackage.VM_SETTINGS_TYPE:
				return validateVmSettingsType((VmSettingsType)value, diagnostics, context);
			case GaewebPackage.EXPIRATION_TYPE:
				return validateExpirationType((String)value, diagnostics, context);
			case GaewebPackage.TARGET_UTILIZATION_TYPE:
				return validateTargetUtilizationType((BigDecimal)value, diagnostics, context);
			case GaewebPackage.URL_STREAM_HANDLER_TYPE:
				return validateUrlStreamHandlerType((String)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdminConsole(AdminConsole adminConsole, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adminConsole, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdminConsolePageType(AdminConsolePageType adminConsolePageType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(adminConsolePageType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAppengineWebAppType(AppengineWebAppType appengineWebAppType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(appengineWebAppType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAsyncSessionPersistenceType(AsyncSessionPersistenceType asyncSessionPersistenceType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(asyncSessionPersistenceType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAutomaticScalingType(AutomaticScalingType automaticScalingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(automaticScalingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBasicScalingType(BasicScalingType basicScalingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(basicScalingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClassLoaderConfigType(ClassLoaderConfigType classLoaderConfigType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(classLoaderConfigType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCpuUtilizationType(CpuUtilizationType cpuUtilizationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(cpuUtilizationType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvVariablesType(EnvVariablesType envVariablesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(envVariablesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEnvVarType(EnvVarType envVarType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(envVarType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExcludeType(ExcludeType excludeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(excludeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateHttpHeaderType(HttpHeaderType httpHeaderType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(httpHeaderType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInboundServicesType(InboundServicesType inboundServicesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(inboundServicesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateIncludeType(IncludeType includeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(includeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateManualScalingType(ManualScalingType manualScalingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(manualScalingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePagespeedType(PagespeedType pagespeedType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pagespeedType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePermissionType(PermissionType permissionType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(permissionType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrioritySpecifierType(PrioritySpecifierType prioritySpecifierType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prioritySpecifierType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePropertyType(PropertyType propertyType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(propertyType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResourceFilesType(ResourceFilesType resourceFilesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(resourceFilesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSettingType(SettingType settingType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(settingType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticErrorHandlers(StaticErrorHandlers staticErrorHandlers, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticErrorHandlers, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticErrorHandlersHandler(StaticErrorHandlersHandler staticErrorHandlersHandler, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticErrorHandlersHandler, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticFilesType(StaticFilesType staticFilesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticFilesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateStaticIncludeType(StaticIncludeType staticIncludeType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(staticIncludeType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSystemPropertiesType(SystemPropertiesType systemPropertiesType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(systemPropertiesType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUserPermissionsType(UserPermissionsType userPermissionsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(userPermissionsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVmHealthCheckType(VmHealthCheckType vmHealthCheckType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vmHealthCheckType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateVmSettingsType(VmSettingsType vmSettingsType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(vmSettingsType, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpirationType(String expirationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateExpirationType_Pattern(expirationType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateExpirationType_Pattern
	 */
	public static final  PatternMatcher [][] EXPIRATION_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("\\s*(([0-9]+)([DdHhMm]|[sS]?))(\\s+([0-9]+)([DdHhMm]|[sS]?))*\\s*")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Expiration Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateExpirationType_Pattern(String expirationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GaewebPackage.Literals.EXPIRATION_TYPE, expirationType, EXPIRATION_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetUtilizationType(BigDecimal targetUtilizationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateTargetUtilizationType_Min(targetUtilizationType, diagnostics, context);
		if (result || diagnostics != null) result &= validateTargetUtilizationType_Max(targetUtilizationType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTargetUtilizationType_Min
	 */
	public static final BigDecimal TARGET_UTILIZATION_TYPE__MIN__VALUE = new BigDecimal("0");

	/**
	 * Validates the Min constraint of '<em>Target Utilization Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetUtilizationType_Min(BigDecimal targetUtilizationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = targetUtilizationType.compareTo(TARGET_UTILIZATION_TYPE__MIN__VALUE) > 0;
		if (!result && diagnostics != null)
			reportMinViolation(GaewebPackage.Literals.TARGET_UTILIZATION_TYPE, targetUtilizationType, TARGET_UTILIZATION_TYPE__MIN__VALUE, false, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateTargetUtilizationType_Max
	 */
	public static final BigDecimal TARGET_UTILIZATION_TYPE__MAX__VALUE = new BigDecimal("1");

	/**
	 * Validates the Max constraint of '<em>Target Utilization Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTargetUtilizationType_Max(BigDecimal targetUtilizationType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = targetUtilizationType.compareTo(TARGET_UTILIZATION_TYPE__MAX__VALUE) <= 0;
		if (!result && diagnostics != null)
			reportMaxViolation(GaewebPackage.Literals.TARGET_UTILIZATION_TYPE, targetUtilizationType, TARGET_UTILIZATION_TYPE__MAX__VALUE, true, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlStreamHandlerType(String urlStreamHandlerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validateUrlStreamHandlerType_Pattern(urlStreamHandlerType, diagnostics, context);
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @see #validateUrlStreamHandlerType_Pattern
	 */
	public static final  PatternMatcher [][] URL_STREAM_HANDLER_TYPE__PATTERN__VALUES =
		new PatternMatcher [][] {
			new PatternMatcher [] {
				XMLTypeUtil.createPatternMatcher("urlfetch|native")
			}
		};

	/**
	 * Validates the Pattern constraint of '<em>Url Stream Handler Type</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateUrlStreamHandlerType_Pattern(String urlStreamHandlerType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validatePattern(GaewebPackage.Literals.URL_STREAM_HANDLER_TYPE, urlStreamHandlerType, URL_STREAM_HANDLER_TYPE__PATTERN__VALUES, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //GaewebValidator
