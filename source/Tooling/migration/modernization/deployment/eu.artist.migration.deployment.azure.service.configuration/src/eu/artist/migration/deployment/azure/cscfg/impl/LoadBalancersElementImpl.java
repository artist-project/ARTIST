/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.LoadBalancerElement;
import eu.artist.migration.deployment.azure.cscfg.LoadBalancersElement;

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
 * An implementation of the model object '<em><b>Load Balancers Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.LoadBalancersElementImpl#getLoadBalancer <em>Load Balancer</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadBalancersElementImpl extends MinimalEObjectImpl.Container implements LoadBalancersElement {
	/**
	 * The cached value of the '{@link #getLoadBalancer() <em>Load Balancer</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancer()
	 * @generated
	 * @ordered
	 */
	protected EList<LoadBalancerElement> loadBalancer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBalancersElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.LOAD_BALANCERS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LoadBalancerElement> getLoadBalancer() {
		if (loadBalancer == null) {
			loadBalancer = new EObjectContainmentEList<LoadBalancerElement>(LoadBalancerElement.class, this, AzureCSCfgPackage.LOAD_BALANCERS_ELEMENT__LOAD_BALANCER);
		}
		return loadBalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSCfgPackage.LOAD_BALANCERS_ELEMENT__LOAD_BALANCER:
				return ((InternalEList<?>)getLoadBalancer()).basicRemove(otherEnd, msgs);
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
			case AzureCSCfgPackage.LOAD_BALANCERS_ELEMENT__LOAD_BALANCER:
				return getLoadBalancer();
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
			case AzureCSCfgPackage.LOAD_BALANCERS_ELEMENT__LOAD_BALANCER:
				getLoadBalancer().clear();
				getLoadBalancer().addAll((Collection<? extends LoadBalancerElement>)newValue);
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
			case AzureCSCfgPackage.LOAD_BALANCERS_ELEMENT__LOAD_BALANCER:
				getLoadBalancer().clear();
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
			case AzureCSCfgPackage.LOAD_BALANCERS_ELEMENT__LOAD_BALANCER:
				return loadBalancer != null && !loadBalancer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LoadBalancersElementImpl
