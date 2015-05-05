/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe;
import eu.artist.migration.deployment.azure.csdef.LoadBalancerProbes;

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
 * An implementation of the model object '<em><b>Load Balancer Probes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.LoadBalancerProbesImpl#getLoadBalancerProbe <em>Load Balancer Probe</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadBalancerProbesImpl extends MinimalEObjectImpl.Container implements LoadBalancerProbes {
	/**
	 * The cached value of the '{@link #getLoadBalancerProbe() <em>Load Balancer Probe</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancerProbe()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadBalancerProbe> loadBalancerProbe;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBalancerProbesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.LOAD_BALANCER_PROBES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadBalancerProbe> getLoadBalancerProbe() {
		if (loadBalancerProbe == null) {
			loadBalancerProbe = new EObjectContainmentEList<LoadBalancerProbe>(LoadBalancerProbe.class, this, AzureCSDefPackage.LOAD_BALANCER_PROBES__LOAD_BALANCER_PROBE);
		}
		return loadBalancerProbe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSDefPackage.LOAD_BALANCER_PROBES__LOAD_BALANCER_PROBE:
				return ((InternalEList<?>)getLoadBalancerProbe()).basicRemove(otherEnd, msgs);
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
			case AzureCSDefPackage.LOAD_BALANCER_PROBES__LOAD_BALANCER_PROBE:
				return getLoadBalancerProbe();
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
			case AzureCSDefPackage.LOAD_BALANCER_PROBES__LOAD_BALANCER_PROBE:
				getLoadBalancerProbe().clear();
				getLoadBalancerProbe().addAll((Collection<? extends LoadBalancerProbe>)newValue);
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
			case AzureCSDefPackage.LOAD_BALANCER_PROBES__LOAD_BALANCER_PROBE:
				getLoadBalancerProbe().clear();
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
			case AzureCSDefPackage.LOAD_BALANCER_PROBES__LOAD_BALANCER_PROBE:
				return loadBalancerProbe != null && !loadBalancerProbe.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoadBalancerProbesImpl
