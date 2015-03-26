/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.NetworkTrafficRules;
import eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo;

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
 * An implementation of the model object '<em><b>Network Traffic Rules</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.NetworkTrafficRulesImpl#getOnlyAllowTrafficTo <em>Only Allow Traffic To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkTrafficRulesImpl extends MinimalEObjectImpl.Container implements NetworkTrafficRules {
	/**
	 * The cached value of the '{@link #getOnlyAllowTrafficTo() <em>Only Allow Traffic To</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOnlyAllowTrafficTo()
	 * @generated
	 * @ordered
	 */
	protected EList<OnlyAllowTrafficTo> onlyAllowTrafficTo;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkTrafficRulesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.NETWORK_TRAFFIC_RULES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OnlyAllowTrafficTo> getOnlyAllowTrafficTo() {
		if (onlyAllowTrafficTo == null) {
			onlyAllowTrafficTo = new EObjectContainmentEList<OnlyAllowTrafficTo>(OnlyAllowTrafficTo.class, this, AzureCSDefPackage.NETWORK_TRAFFIC_RULES__ONLY_ALLOW_TRAFFIC_TO);
		}
		return onlyAllowTrafficTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSDefPackage.NETWORK_TRAFFIC_RULES__ONLY_ALLOW_TRAFFIC_TO:
				return ((InternalEList<?>)getOnlyAllowTrafficTo()).basicRemove(otherEnd, msgs);
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
			case AzureCSDefPackage.NETWORK_TRAFFIC_RULES__ONLY_ALLOW_TRAFFIC_TO:
				return getOnlyAllowTrafficTo();
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
			case AzureCSDefPackage.NETWORK_TRAFFIC_RULES__ONLY_ALLOW_TRAFFIC_TO:
				getOnlyAllowTrafficTo().clear();
				getOnlyAllowTrafficTo().addAll((Collection<? extends OnlyAllowTrafficTo>)newValue);
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
			case AzureCSDefPackage.NETWORK_TRAFFIC_RULES__ONLY_ALLOW_TRAFFIC_TO:
				getOnlyAllowTrafficTo().clear();
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
			case AzureCSDefPackage.NETWORK_TRAFFIC_RULES__ONLY_ALLOW_TRAFFIC_TO:
				return onlyAllowTrafficTo != null && !onlyAllowTrafficTo.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NetworkTrafficRulesImpl
