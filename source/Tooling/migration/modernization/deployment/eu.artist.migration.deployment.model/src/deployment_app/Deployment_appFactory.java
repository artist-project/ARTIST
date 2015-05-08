/**
 */
package deployment_app;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see deployment_app.Deployment_appPackage
 * @generated
 */
public interface Deployment_appFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Deployment_appFactory eINSTANCE = deployment_app.impl.Deployment_appFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Cloud Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Application</em>'.
	 * @generated
	 */
	CloudApplication createCloudApplication();

	/**
	 * Returns a new object of class '<em>Application Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Component</em>'.
	 * @generated
	 */
	ApplicationComponent createApplicationComponent();

	/**
	 * Returns a new object of class '<em>Cloud Application Platform Deployment Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Application Platform Deployment Unit</em>'.
	 * @generated
	 */
	CloudApplicationPlatformDeploymentUnit createCloudApplicationPlatformDeploymentUnit();

	/**
	 * Returns a new object of class '<em>Cloud Application Infrastructure Deployment Unit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Cloud Application Infrastructure Deployment Unit</em>'.
	 * @generated
	 */
	CloudApplicationInfrastructureDeploymentUnit createCloudApplicationInfrastructureDeploymentUnit();

	/**
	 * Returns a new object of class '<em>Application Descriptor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Descriptor</em>'.
	 * @generated
	 */
	ApplicationDescriptor createApplicationDescriptor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Deployment_appPackage getDeployment_appPackage();

} //Deployment_appFactory
