/**
 */
package deployment_app.util;

import deployment_app.*;

import deployment_provider.Descriptor;

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
 * @see deployment_app.Deployment_appPackage
 * @generated
 */
public class Deployment_appSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Deployment_appPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Deployment_appSwitch() {
		if (modelPackage == null) {
			modelPackage = Deployment_appPackage.eINSTANCE;
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
			case Deployment_appPackage.CLOUD_APPLICATION: {
				CloudApplication cloudApplication = (CloudApplication)theEObject;
				T result = caseCloudApplication(cloudApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_appPackage.CLOUD_APPLICATION_DEPLOYMENT_UNIT: {
				CloudApplicationDeploymentUnit cloudApplicationDeploymentUnit = (CloudApplicationDeploymentUnit)theEObject;
				T result = caseCloudApplicationDeploymentUnit(cloudApplicationDeploymentUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_appPackage.APPLICATION_COMPONENT: {
				ApplicationComponent applicationComponent = (ApplicationComponent)theEObject;
				T result = caseApplicationComponent(applicationComponent);
				if (result == null) result = caseCloudApplication(applicationComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_appPackage.CLOUD_APPLICATION_PLATFORM_DEPLOYMENT_UNIT: {
				CloudApplicationPlatformDeploymentUnit cloudApplicationPlatformDeploymentUnit = (CloudApplicationPlatformDeploymentUnit)theEObject;
				T result = caseCloudApplicationPlatformDeploymentUnit(cloudApplicationPlatformDeploymentUnit);
				if (result == null) result = caseCloudApplicationDeploymentUnit(cloudApplicationPlatformDeploymentUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_appPackage.CLOUD_APPLICATION_INFRASTRUCTURE_DEPLOYMENT_UNIT: {
				CloudApplicationInfrastructureDeploymentUnit cloudApplicationInfrastructureDeploymentUnit = (CloudApplicationInfrastructureDeploymentUnit)theEObject;
				T result = caseCloudApplicationInfrastructureDeploymentUnit(cloudApplicationInfrastructureDeploymentUnit);
				if (result == null) result = caseCloudApplicationDeploymentUnit(cloudApplicationInfrastructureDeploymentUnit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Deployment_appPackage.APPLICATION_DESCRIPTOR: {
				ApplicationDescriptor applicationDescriptor = (ApplicationDescriptor)theEObject;
				T result = caseApplicationDescriptor(applicationDescriptor);
				if (result == null) result = caseDescriptor(applicationDescriptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudApplication(CloudApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Application Deployment Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Application Deployment Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudApplicationDeploymentUnit(CloudApplicationDeploymentUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationComponent(ApplicationComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Application Platform Deployment Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Application Platform Deployment Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudApplicationPlatformDeploymentUnit(CloudApplicationPlatformDeploymentUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cloud Application Infrastructure Deployment Unit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cloud Application Infrastructure Deployment Unit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCloudApplicationInfrastructureDeploymentUnit(CloudApplicationInfrastructureDeploymentUnit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationDescriptor(ApplicationDescriptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Descriptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDescriptor(Descriptor object) {
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

} //Deployment_appSwitch
