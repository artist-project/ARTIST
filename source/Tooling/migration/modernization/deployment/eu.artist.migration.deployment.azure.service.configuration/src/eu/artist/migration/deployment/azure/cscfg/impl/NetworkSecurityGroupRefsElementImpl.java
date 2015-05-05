/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefElement;
import eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefsElement;

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
 * An implementation of the model object '<em><b>Network Security Group Refs Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkSecurityGroupRefsElementImpl#getNetworkSecurityGroupRef <em>Network Security Group Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkSecurityGroupRefsElementImpl extends MinimalEObjectImpl.Container implements NetworkSecurityGroupRefsElement {
	/**
	 * The cached value of the '{@link #getNetworkSecurityGroupRef() <em>Network Security Group Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkSecurityGroupRef()
	 * @generated
	 * @ordered
	 */
	protected EList<NetworkSecurityGroupRefElement> networkSecurityGroupRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkSecurityGroupRefsElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.NETWORK_SECURITY_GROUP_REFS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<NetworkSecurityGroupRefElement> getNetworkSecurityGroupRef() {
		if (networkSecurityGroupRef == null) {
			networkSecurityGroupRef = new EObjectContainmentEList<NetworkSecurityGroupRefElement>(NetworkSecurityGroupRefElement.class, this, AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REFS_ELEMENT__NETWORK_SECURITY_GROUP_REF);
		}
		return networkSecurityGroupRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REFS_ELEMENT__NETWORK_SECURITY_GROUP_REF:
				return ((InternalEList<?>)getNetworkSecurityGroupRef()).basicRemove(otherEnd, msgs);
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
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REFS_ELEMENT__NETWORK_SECURITY_GROUP_REF:
				return getNetworkSecurityGroupRef();
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
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REFS_ELEMENT__NETWORK_SECURITY_GROUP_REF:
				getNetworkSecurityGroupRef().clear();
				getNetworkSecurityGroupRef().addAll((Collection<? extends NetworkSecurityGroupRefElement>)newValue);
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
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REFS_ELEMENT__NETWORK_SECURITY_GROUP_REF:
				getNetworkSecurityGroupRef().clear();
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
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REFS_ELEMENT__NETWORK_SECURITY_GROUP_REF:
				return networkSecurityGroupRef != null && !networkSecurityGroupRef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NetworkSecurityGroupRefsElementImpl
