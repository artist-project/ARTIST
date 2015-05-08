/**
 */
package deployment_provider.impl;

import deployment_provider.CloudInfrastructureVirtualCluster;
import deployment_provider.CloudInfrastructureVirtualInstance;
import deployment_provider.Deployment_providerPackage;

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
 * An implementation of the model object '<em><b>Cloud Infrastructure Virtual Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deployment_provider.impl.CloudInfrastructureVirtualClusterImpl#getManages <em>Manages</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloudInfrastructureVirtualClusterImpl extends MinimalEObjectImpl.Container implements CloudInfrastructureVirtualCluster {
	/**
	 * The cached value of the '{@link #getManages() <em>Manages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManages()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudInfrastructureVirtualInstance> manages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudInfrastructureVirtualClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Deployment_providerPackage.Literals.CLOUD_INFRASTRUCTURE_VIRTUAL_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudInfrastructureVirtualInstance> getManages() {
		if (manages == null) {
			manages = new EObjectContainmentEList<CloudInfrastructureVirtualInstance>(CloudInfrastructureVirtualInstance.class, this, Deployment_providerPackage.CLOUD_INFRASTRUCTURE_VIRTUAL_CLUSTER__MANAGES);
		}
		return manages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_VIRTUAL_CLUSTER__MANAGES:
				return ((InternalEList<?>)getManages()).basicRemove(otherEnd, msgs);
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
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_VIRTUAL_CLUSTER__MANAGES:
				return getManages();
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
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_VIRTUAL_CLUSTER__MANAGES:
				getManages().clear();
				getManages().addAll((Collection<? extends CloudInfrastructureVirtualInstance>)newValue);
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
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_VIRTUAL_CLUSTER__MANAGES:
				getManages().clear();
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
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_VIRTUAL_CLUSTER__MANAGES:
				return manages != null && !manages.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CloudInfrastructureVirtualClusterImpl
