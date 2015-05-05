/**
 */
package gaeweb.util;

import gaeweb.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see gaeweb.GaewebPackage
 * @generated
 */
public class GaewebSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GaewebPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaewebSwitch() {
		if (modelPackage == null) {
			modelPackage = GaewebPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case GaewebPackage.ADMIN_CONSOLE: {
				AdminConsole adminConsole = (AdminConsole)theEObject;
				T result = caseAdminConsole(adminConsole);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.ADMIN_CONSOLE_PAGE_TYPE: {
				AdminConsolePageType adminConsolePageType = (AdminConsolePageType)theEObject;
				T result = caseAdminConsolePageType(adminConsolePageType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.APPENGINE_WEB_APP_TYPE: {
				AppengineWebAppType appengineWebAppType = (AppengineWebAppType)theEObject;
				T result = caseAppengineWebAppType(appengineWebAppType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.ASYNC_SESSION_PERSISTENCE_TYPE: {
				AsyncSessionPersistenceType asyncSessionPersistenceType = (AsyncSessionPersistenceType)theEObject;
				T result = caseAsyncSessionPersistenceType(asyncSessionPersistenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.AUTOMATIC_SCALING_TYPE: {
				AutomaticScalingType automaticScalingType = (AutomaticScalingType)theEObject;
				T result = caseAutomaticScalingType(automaticScalingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.BASIC_SCALING_TYPE: {
				BasicScalingType basicScalingType = (BasicScalingType)theEObject;
				T result = caseBasicScalingType(basicScalingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.CLASS_LOADER_CONFIG_TYPE: {
				ClassLoaderConfigType classLoaderConfigType = (ClassLoaderConfigType)theEObject;
				T result = caseClassLoaderConfigType(classLoaderConfigType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.CPU_UTILIZATION_TYPE: {
				CpuUtilizationType cpuUtilizationType = (CpuUtilizationType)theEObject;
				T result = caseCpuUtilizationType(cpuUtilizationType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.ENV_VARIABLES_TYPE: {
				EnvVariablesType envVariablesType = (EnvVariablesType)theEObject;
				T result = caseEnvVariablesType(envVariablesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.ENV_VAR_TYPE: {
				EnvVarType envVarType = (EnvVarType)theEObject;
				T result = caseEnvVarType(envVarType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.EXCLUDE_TYPE: {
				ExcludeType excludeType = (ExcludeType)theEObject;
				T result = caseExcludeType(excludeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.HTTP_HEADER_TYPE: {
				HttpHeaderType httpHeaderType = (HttpHeaderType)theEObject;
				T result = caseHttpHeaderType(httpHeaderType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.INBOUND_SERVICES_TYPE: {
				InboundServicesType inboundServicesType = (InboundServicesType)theEObject;
				T result = caseInboundServicesType(inboundServicesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.INCLUDE_TYPE: {
				IncludeType includeType = (IncludeType)theEObject;
				T result = caseIncludeType(includeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.MANUAL_SCALING_TYPE: {
				ManualScalingType manualScalingType = (ManualScalingType)theEObject;
				T result = caseManualScalingType(manualScalingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.PAGESPEED_TYPE: {
				PagespeedType pagespeedType = (PagespeedType)theEObject;
				T result = casePagespeedType(pagespeedType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.PERMISSION_TYPE: {
				PermissionType permissionType = (PermissionType)theEObject;
				T result = casePermissionType(permissionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.PRIORITY_SPECIFIER_TYPE: {
				PrioritySpecifierType prioritySpecifierType = (PrioritySpecifierType)theEObject;
				T result = casePrioritySpecifierType(prioritySpecifierType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.PROPERTY_TYPE: {
				PropertyType propertyType = (PropertyType)theEObject;
				T result = casePropertyType(propertyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.RESOURCE_FILES_TYPE: {
				ResourceFilesType resourceFilesType = (ResourceFilesType)theEObject;
				T result = caseResourceFilesType(resourceFilesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.SETTING_TYPE: {
				SettingType settingType = (SettingType)theEObject;
				T result = caseSettingType(settingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.STATIC_ERROR_HANDLERS: {
				StaticErrorHandlers staticErrorHandlers = (StaticErrorHandlers)theEObject;
				T result = caseStaticErrorHandlers(staticErrorHandlers);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.STATIC_ERROR_HANDLERS_HANDLER: {
				StaticErrorHandlersHandler staticErrorHandlersHandler = (StaticErrorHandlersHandler)theEObject;
				T result = caseStaticErrorHandlersHandler(staticErrorHandlersHandler);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.STATIC_FILES_TYPE: {
				StaticFilesType staticFilesType = (StaticFilesType)theEObject;
				T result = caseStaticFilesType(staticFilesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.STATIC_INCLUDE_TYPE: {
				StaticIncludeType staticIncludeType = (StaticIncludeType)theEObject;
				T result = caseStaticIncludeType(staticIncludeType);
				if (result == null) result = caseIncludeType(staticIncludeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.SYSTEM_PROPERTIES_TYPE: {
				SystemPropertiesType systemPropertiesType = (SystemPropertiesType)theEObject;
				T result = caseSystemPropertiesType(systemPropertiesType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.USER_PERMISSIONS_TYPE: {
				UserPermissionsType userPermissionsType = (UserPermissionsType)theEObject;
				T result = caseUserPermissionsType(userPermissionsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.VM_HEALTH_CHECK_TYPE: {
				VmHealthCheckType vmHealthCheckType = (VmHealthCheckType)theEObject;
				T result = caseVmHealthCheckType(vmHealthCheckType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case GaewebPackage.VM_SETTINGS_TYPE: {
				VmSettingsType vmSettingsType = (VmSettingsType)theEObject;
				T result = caseVmSettingsType(vmSettingsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin Console</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin Console</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdminConsole(AdminConsole object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin Console Page Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin Console Page Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdminConsolePageType(AdminConsolePageType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Appengine Web App Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Appengine Web App Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAppengineWebAppType(AppengineWebAppType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Async Session Persistence Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Async Session Persistence Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAsyncSessionPersistenceType(AsyncSessionPersistenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Automatic Scaling Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Automatic Scaling Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutomaticScalingType(AutomaticScalingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basic Scaling Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basic Scaling Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasicScalingType(BasicScalingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Class Loader Config Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Class Loader Config Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClassLoaderConfigType(ClassLoaderConfigType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cpu Utilization Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cpu Utilization Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCpuUtilizationType(CpuUtilizationType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Env Variables Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Env Variables Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvVariablesType(EnvVariablesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Env Var Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Env Var Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvVarType(EnvVarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Exclude Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Exclude Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExcludeType(ExcludeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Http Header Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Http Header Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHttpHeaderType(HttpHeaderType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Inbound Services Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Inbound Services Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInboundServicesType(InboundServicesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Include Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Include Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIncludeType(IncludeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Manual Scaling Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Manual Scaling Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseManualScalingType(ManualScalingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pagespeed Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pagespeed Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePagespeedType(PagespeedType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Permission Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Permission Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePermissionType(PermissionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Priority Specifier Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Priority Specifier Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrioritySpecifierType(PrioritySpecifierType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Property Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePropertyType(PropertyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Resource Files Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Resource Files Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResourceFilesType(ResourceFilesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Setting Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Setting Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSettingType(SettingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Error Handlers</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Error Handlers</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticErrorHandlers(StaticErrorHandlers object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Error Handlers Handler</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Error Handlers Handler</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticErrorHandlersHandler(StaticErrorHandlersHandler object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Files Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Files Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticFilesType(StaticFilesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Static Include Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Static Include Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStaticIncludeType(StaticIncludeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>System Properties Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>System Properties Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSystemPropertiesType(SystemPropertiesType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Permissions Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Permissions Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserPermissionsType(UserPermissionsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vm Health Check Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vm Health Check Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVmHealthCheckType(VmHealthCheckType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vm Settings Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vm Settings Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVmSettingsType(VmSettingsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //GaewebSwitch
