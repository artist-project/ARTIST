/**
 */
package deployment_provider.impl;

import deployment_provider.CloudInfrastructurePhysicalInstance;
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
 * An implementation of the model object '<em><b>Cloud Infrastructure Physical Instance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deployment_provider.impl.CloudInfrastructurePhysicalInstanceImpl#getRunVMs <em>Run VMs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloudInfrastructurePhysicalInstanceImpl extends MinimalEObjectImpl.Container implements CloudInfrastructurePhysicalInstance {
	/**
	 * The cached value of the '{@link #getRunVMs() <em>Run VMs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRunVMs()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudInfrastructureVirtualInstance> runVMs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudInfrastructurePhysicalInstanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Deployment_providerPackage.Literals.CLOUD_INFRASTRUCTURE_PHYSICAL_INSTANCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudInfrastructureVirtualInstance> getRunVMs() {
		if (runVMs == null) {
			runVMs = new EObjectContainmentEList<CloudInfrastructureVirtualInstance>(CloudInfrastructureVirtualInstance.class, this, Deployment_providerPackage.CLOUD_INFRASTRUCTURE_PHYSICAL_INSTANCE__RUN_VMS);
		}
		return runVMs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_PHYSICAL_INSTANCE__RUN_VMS:
				return ((InternalEList<?>)getRunVMs()).basicRemove(otherEnd, msgs);
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
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_PHYSICAL_INSTANCE__RUN_VMS:
				return getRunVMs();
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
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_PHYSICAL_INSTANCE__RUN_VMS:
				getRunVMs().clear();
				getRunVMs().addAll((Collection<? extends CloudInfrastructureVirtualInstance>)newValue);
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
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_PHYSICAL_INSTANCE__RUN_VMS:
				getRunVMs().clear();
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
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_PHYSICAL_INSTANCE__RUN_VMS:
				return runVMs != null && !runVMs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CloudInfrastructurePhysicalInstanceImpl
