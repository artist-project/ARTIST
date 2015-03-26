/**
 */
package gaeweb.util;

import gaeweb.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see gaeweb.GaewebPackage
 * @generated
 */
public class GaewebAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GaewebPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GaewebAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GaewebPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GaewebSwitch<Adapter> modelSwitch =
		new GaewebSwitch<Adapter>() {
			@Override
			public Adapter caseAdminConsole(AdminConsole object) {
				return createAdminConsoleAdapter();
			}
			@Override
			public Adapter caseAdminConsolePageType(AdminConsolePageType object) {
				return createAdminConsolePageTypeAdapter();
			}
			@Override
			public Adapter caseAppengineWebAppType(AppengineWebAppType object) {
				return createAppengineWebAppTypeAdapter();
			}
			@Override
			public Adapter caseAsyncSessionPersistenceType(AsyncSessionPersistenceType object) {
				return createAsyncSessionPersistenceTypeAdapter();
			}
			@Override
			public Adapter caseAutomaticScalingType(AutomaticScalingType object) {
				return createAutomaticScalingTypeAdapter();
			}
			@Override
			public Adapter caseBasicScalingType(BasicScalingType object) {
				return createBasicScalingTypeAdapter();
			}
			@Override
			public Adapter caseClassLoaderConfigType(ClassLoaderConfigType object) {
				return createClassLoaderConfigTypeAdapter();
			}
			@Override
			public Adapter caseCpuUtilizationType(CpuUtilizationType object) {
				return createCpuUtilizationTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEnvVariablesType(EnvVariablesType object) {
				return createEnvVariablesTypeAdapter();
			}
			@Override
			public Adapter caseEnvVarType(EnvVarType object) {
				return createEnvVarTypeAdapter();
			}
			@Override
			public Adapter caseExcludeType(ExcludeType object) {
				return createExcludeTypeAdapter();
			}
			@Override
			public Adapter caseHttpHeaderType(HttpHeaderType object) {
				return createHttpHeaderTypeAdapter();
			}
			@Override
			public Adapter caseInboundServicesType(InboundServicesType object) {
				return createInboundServicesTypeAdapter();
			}
			@Override
			public Adapter caseIncludeType(IncludeType object) {
				return createIncludeTypeAdapter();
			}
			@Override
			public Adapter caseManualScalingType(ManualScalingType object) {
				return createManualScalingTypeAdapter();
			}
			@Override
			public Adapter casePagespeedType(PagespeedType object) {
				return createPagespeedTypeAdapter();
			}
			@Override
			public Adapter casePermissionType(PermissionType object) {
				return createPermissionTypeAdapter();
			}
			@Override
			public Adapter casePrioritySpecifierType(PrioritySpecifierType object) {
				return createPrioritySpecifierTypeAdapter();
			}
			@Override
			public Adapter casePropertyType(PropertyType object) {
				return createPropertyTypeAdapter();
			}
			@Override
			public Adapter caseResourceFilesType(ResourceFilesType object) {
				return createResourceFilesTypeAdapter();
			}
			@Override
			public Adapter caseSettingType(SettingType object) {
				return createSettingTypeAdapter();
			}
			@Override
			public Adapter caseStaticErrorHandlers(StaticErrorHandlers object) {
				return createStaticErrorHandlersAdapter();
			}
			@Override
			public Adapter caseStaticErrorHandlersHandler(StaticErrorHandlersHandler object) {
				return createStaticErrorHandlersHandlerAdapter();
			}
			@Override
			public Adapter caseStaticFilesType(StaticFilesType object) {
				return createStaticFilesTypeAdapter();
			}
			@Override
			public Adapter caseStaticIncludeType(StaticIncludeType object) {
				return createStaticIncludeTypeAdapter();
			}
			@Override
			public Adapter caseSystemPropertiesType(SystemPropertiesType object) {
				return createSystemPropertiesTypeAdapter();
			}
			@Override
			public Adapter caseUserPermissionsType(UserPermissionsType object) {
				return createUserPermissionsTypeAdapter();
			}
			@Override
			public Adapter caseVmHealthCheckType(VmHealthCheckType object) {
				return createVmHealthCheckTypeAdapter();
			}
			@Override
			public Adapter caseVmSettingsType(VmSettingsType object) {
				return createVmSettingsTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.AdminConsole <em>Admin Console</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.AdminConsole
	 * @generated
	 */
	public Adapter createAdminConsoleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.AdminConsolePageType <em>Admin Console Page Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.AdminConsolePageType
	 * @generated
	 */
	public Adapter createAdminConsolePageTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.AppengineWebAppType <em>Appengine Web App Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.AppengineWebAppType
	 * @generated
	 */
	public Adapter createAppengineWebAppTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.AsyncSessionPersistenceType <em>Async Session Persistence Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.AsyncSessionPersistenceType
	 * @generated
	 */
	public Adapter createAsyncSessionPersistenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.AutomaticScalingType <em>Automatic Scaling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.AutomaticScalingType
	 * @generated
	 */
	public Adapter createAutomaticScalingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.BasicScalingType <em>Basic Scaling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.BasicScalingType
	 * @generated
	 */
	public Adapter createBasicScalingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.ClassLoaderConfigType <em>Class Loader Config Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.ClassLoaderConfigType
	 * @generated
	 */
	public Adapter createClassLoaderConfigTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.CpuUtilizationType <em>Cpu Utilization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.CpuUtilizationType
	 * @generated
	 */
	public Adapter createCpuUtilizationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.EnvVariablesType <em>Env Variables Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.EnvVariablesType
	 * @generated
	 */
	public Adapter createEnvVariablesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.EnvVarType <em>Env Var Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.EnvVarType
	 * @generated
	 */
	public Adapter createEnvVarTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.ExcludeType <em>Exclude Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.ExcludeType
	 * @generated
	 */
	public Adapter createExcludeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.HttpHeaderType <em>Http Header Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.HttpHeaderType
	 * @generated
	 */
	public Adapter createHttpHeaderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.InboundServicesType <em>Inbound Services Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.InboundServicesType
	 * @generated
	 */
	public Adapter createInboundServicesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.IncludeType <em>Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.IncludeType
	 * @generated
	 */
	public Adapter createIncludeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.ManualScalingType <em>Manual Scaling Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.ManualScalingType
	 * @generated
	 */
	public Adapter createManualScalingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.PagespeedType <em>Pagespeed Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.PagespeedType
	 * @generated
	 */
	public Adapter createPagespeedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.PermissionType <em>Permission Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.PermissionType
	 * @generated
	 */
	public Adapter createPermissionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.PrioritySpecifierType <em>Priority Specifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.PrioritySpecifierType
	 * @generated
	 */
	public Adapter createPrioritySpecifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.PropertyType <em>Property Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.PropertyType
	 * @generated
	 */
	public Adapter createPropertyTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.ResourceFilesType <em>Resource Files Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.ResourceFilesType
	 * @generated
	 */
	public Adapter createResourceFilesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.SettingType <em>Setting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.SettingType
	 * @generated
	 */
	public Adapter createSettingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.StaticErrorHandlers <em>Static Error Handlers</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.StaticErrorHandlers
	 * @generated
	 */
	public Adapter createStaticErrorHandlersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.StaticErrorHandlersHandler <em>Static Error Handlers Handler</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.StaticErrorHandlersHandler
	 * @generated
	 */
	public Adapter createStaticErrorHandlersHandlerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.StaticFilesType <em>Static Files Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.StaticFilesType
	 * @generated
	 */
	public Adapter createStaticFilesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.StaticIncludeType <em>Static Include Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.StaticIncludeType
	 * @generated
	 */
	public Adapter createStaticIncludeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.SystemPropertiesType <em>System Properties Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.SystemPropertiesType
	 * @generated
	 */
	public Adapter createSystemPropertiesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.UserPermissionsType <em>User Permissions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.UserPermissionsType
	 * @generated
	 */
	public Adapter createUserPermissionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.VmHealthCheckType <em>Vm Health Check Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.VmHealthCheckType
	 * @generated
	 */
	public Adapter createVmHealthCheckTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link gaeweb.VmSettingsType <em>Vm Settings Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see gaeweb.VmSettingsType
	 * @generated
	 */
	public Adapter createVmSettingsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GaewebAdapterFactory
