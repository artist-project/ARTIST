/**
 */
package deployment_app.util;

import deployment_app.*;

import deployment_provider.Descriptor;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see deployment_app.Deployment_appPackage
 * @generated
 */
public class Deployment_appAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Deployment_appPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment_appAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Deployment_appPackage.eINSTANCE;
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
	protected Deployment_appSwitch<Adapter> modelSwitch =
		new Deployment_appSwitch<Adapter>() {
			@Override
			public Adapter caseCloudApplication(CloudApplication object) {
				return createCloudApplicationAdapter();
			}
			@Override
			public Adapter caseCloudApplicationDeploymentUnit(CloudApplicationDeploymentUnit object) {
				return createCloudApplicationDeploymentUnitAdapter();
			}
			@Override
			public Adapter caseApplicationComponent(ApplicationComponent object) {
				return createApplicationComponentAdapter();
			}
			@Override
			public Adapter caseCloudApplicationPlatformDeploymentUnit(CloudApplicationPlatformDeploymentUnit object) {
				return createCloudApplicationPlatformDeploymentUnitAdapter();
			}
			@Override
			public Adapter caseCloudApplicationInfrastructureDeploymentUnit(CloudApplicationInfrastructureDeploymentUnit object) {
				return createCloudApplicationInfrastructureDeploymentUnitAdapter();
			}
			@Override
			public Adapter caseApplicationDescriptor(ApplicationDescriptor object) {
				return createApplicationDescriptorAdapter();
			}
			@Override
			public Adapter caseDescriptor(Descriptor object) {
				return createDescriptorAdapter();
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
	 * Creates a new adapter for an object of class '{@link deployment_app.CloudApplication <em>Cloud Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_app.CloudApplication
	 * @generated
	 */
	public Adapter createCloudApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_app.CloudApplicationDeploymentUnit <em>Cloud Application Deployment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_app.CloudApplicationDeploymentUnit
	 * @generated
	 */
	public Adapter createCloudApplicationDeploymentUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_app.ApplicationComponent <em>Application Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_app.ApplicationComponent
	 * @generated
	 */
	public Adapter createApplicationComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_app.CloudApplicationPlatformDeploymentUnit <em>Cloud Application Platform Deployment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_app.CloudApplicationPlatformDeploymentUnit
	 * @generated
	 */
	public Adapter createCloudApplicationPlatformDeploymentUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_app.CloudApplicationInfrastructureDeploymentUnit <em>Cloud Application Infrastructure Deployment Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_app.CloudApplicationInfrastructureDeploymentUnit
	 * @generated
	 */
	public Adapter createCloudApplicationInfrastructureDeploymentUnitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_app.ApplicationDescriptor <em>Application Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_app.ApplicationDescriptor
	 * @generated
	 */
	public Adapter createApplicationDescriptorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link deployment_provider.Descriptor <em>Descriptor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see deployment_provider.Descriptor
	 * @generated
	 */
	public Adapter createDescriptorAdapter() {
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

} //Deployment_appAdapterFactory
