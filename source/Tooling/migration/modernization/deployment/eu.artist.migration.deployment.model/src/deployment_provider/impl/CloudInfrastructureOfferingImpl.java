/**
 */
package deployment_provider.impl;

import deployment_provider.CloudInfrastructureOffering;
import deployment_provider.CloudInfrastructurePhysicalInstance;
import deployment_provider.Deployment_providerPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Infrastructure Offering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deployment_provider.impl.CloudInfrastructureOfferingImpl#getComprisedInstances <em>Comprised Instances</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloudInfrastructureOfferingImpl extends CloudOfferingImpl implements CloudInfrastructureOffering {
	/**
	 * The cached value of the '{@link #getComprisedInstances() <em>Comprised Instances</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComprisedInstances()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudInfrastructurePhysicalInstance> comprisedInstances;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudInfrastructureOfferingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Deployment_providerPackage.Literals.CLOUD_INFRASTRUCTURE_OFFERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudInfrastructurePhysicalInstance> getComprisedInstances() {
		if (comprisedInstances == null) {
			comprisedInstances = new EObjectContainmentEList<CloudInfrastructurePhysicalInstance>(CloudInfrastructurePhysicalInstance.class, this, Deployment_providerPackage.CLOUD_INFRASTRUCTURE_OFFERING__COMPRISED_INSTANCES);
		}
		return comprisedInstances;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_OFFERING__COMPRISED_INSTANCES:
				return ((InternalEList<?>)getComprisedInstances()).basicRemove(otherEnd, msgs);
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
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_OFFERING__COMPRISED_INSTANCES:
				return getComprisedInstances();
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
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_OFFERING__COMPRISED_INSTANCES:
				getComprisedInstances().clear();
				getComprisedInstances().addAll((Collection<? extends CloudInfrastructurePhysicalInstance>)newValue);
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
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_OFFERING__COMPRISED_INSTANCES:
				getComprisedInstances().clear();
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
			case Deployment_providerPackage.CLOUD_INFRASTRUCTURE_OFFERING__COMPRISED_INSTANCES:
				return comprisedInstances != null && !comprisedInstances.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CloudInfrastructureOfferingImpl
