/**
 */
package deployment_app.impl;

import deployment_app.CloudApplicationDeploymentUnit;
import deployment_app.Deployment_appPackage;

import deployment_provider.DeploymentDescriptor;
import deployment_provider.ServiceConfigurationDescriptor;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Application Deployment Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deployment_app.impl.CloudApplicationDeploymentUnitImpl#getIsConfiguredBy <em>Is Configured By</em>}</li>
 *   <li>{@link deployment_app.impl.CloudApplicationDeploymentUnitImpl#getConfigureServices <em>Configure Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CloudApplicationDeploymentUnitImpl extends MinimalEObjectImpl.Container implements CloudApplicationDeploymentUnit {
	/**
	 * The cached value of the '{@link #getIsConfiguredBy() <em>Is Configured By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsConfiguredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<DeploymentDescriptor> isConfiguredBy;

	/**
	 * The cached value of the '{@link #getConfigureServices() <em>Configure Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigureServices()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceConfigurationDescriptor> configureServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudApplicationDeploymentUnitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Deployment_appPackage.Literals.CLOUD_APPLICATION_DEPLOYMENT_UNIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DeploymentDescriptor> getIsConfiguredBy() {
		if (isConfiguredBy == null) {
			isConfiguredBy = new EObjectContainmentEList<DeploymentDescriptor>(DeploymentDescriptor.class, this, Deployment_appPackage.CLOUD_APPLICATION_DEPLOYMENT_UNIT__IS_CONFIGURED_BY);
		}
		return isConfiguredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceConfigurationDescriptor> getConfigureServices() {
		if (configureServices == null) {
			configureServices = new EObjectContainmentEList<ServiceConfigurationDescriptor>(ServiceConfigurationDescriptor.class, this, Deployment_appPackage.CLOUD_APPLICATION_DEPLOYMENT_UNIT__CONFIGURE_SERVICES);
		}
		return configureServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Deployment_appPackage.CLOUD_APPLICATION_DEPLOYMENT_UNIT__IS_CONFIGURED_BY:
				return ((InternalEList<?>)getIsConfiguredBy()).basicRemove(otherEnd, msgs);
			case Deployment_appPackage.CLOUD_APPLICATION_DEPLOYMENT_UNIT__CONFIGURE_SERVICES:
				return ((InternalEList<?>)getConfigureServices()).basicRemove(otherEnd, msgs);
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
			case Deployment_appPackage.CLOUD_APPLICATION_DEPLOYMENT_UNIT__IS_CONFIGURED_BY:
				return getIsConfiguredBy();
			case Deployment_appPackage.CLOUD_APPLICATION_DEPLOYMENT_UNIT__CONFIGURE_SERVICES:
				return getConfigureServices();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Deployment_appPackage.CLOUD_APPLICATION_DEPLOYMENT_UNIT__IS_CONFIGURED_BY:
				getIsConfiguredBy().clear();
				getIsConfiguredBy().addAll((Collection<? extends DeploymentDescriptor>)newValue);
				return;
			case Deployment_appPackage.CLOUD_APPLICATION_DEPLOYMENT_UNIT__CONFIGURE_SERVICES:
				getConfigureServices().clear();
				getConfigureServices().addAll((Collection<? extends ServiceConfigurationDescriptor>)newValue);
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
			case Deployment_appPackage.CLOUD_APPLICATION_DEPLOYMENT_UNIT__IS_CONFIGURED_BY:
				getIsConfiguredBy().clear();
				return;
			case Deployment_appPackage.CLOUD_APPLICATION_DEPLOYMENT_UNIT__CONFIGURE_SERVICES:
				getConfigureServices().clear();
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
			case Deployment_appPackage.CLOUD_APPLICATION_DEPLOYMENT_UNIT__IS_CONFIGURED_BY:
				return isConfiguredBy != null && !isConfiguredBy.isEmpty();
			case Deployment_appPackage.CLOUD_APPLICATION_DEPLOYMENT_UNIT__CONFIGURE_SERVICES:
				return configureServices != null && !configureServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CloudApplicationDeploymentUnitImpl
