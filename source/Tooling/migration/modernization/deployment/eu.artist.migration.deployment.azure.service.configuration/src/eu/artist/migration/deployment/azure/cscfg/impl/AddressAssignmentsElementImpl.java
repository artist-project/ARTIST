/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AddressAssignmentsElement;
import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement;
import eu.artist.migration.deployment.azure.cscfg.ReservedIPsType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Address Assignments Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.AddressAssignmentsElementImpl#getInstanceAddress <em>Instance Address</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.AddressAssignmentsElementImpl#getReservedIPs <em>Reserved IPs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddressAssignmentsElementImpl extends MinimalEObjectImpl.Container implements AddressAssignmentsElement {
	/**
	 * The cached value of the '{@link #getInstanceAddress() <em>Instance Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<InstanceAddressElement> instanceAddress;

	/**
	 * The cached value of the '{@link #getReservedIPs() <em>Reserved IPs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedIPs()
	 * @generated
	 * @ordered
	 */
	protected ReservedIPsType reservedIPs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddressAssignmentsElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.ADDRESS_ASSIGNMENTS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InstanceAddressElement> getInstanceAddress() {
		if (instanceAddress == null) {
			instanceAddress = new EObjectContainmentEList<InstanceAddressElement>(InstanceAddressElement.class, this, AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT__INSTANCE_ADDRESS);
		}
		return instanceAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservedIPsType getReservedIPs() {
		return reservedIPs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReservedIPs(ReservedIPsType newReservedIPs, NotificationChain msgs) {
		ReservedIPsType oldReservedIPs = reservedIPs;
		reservedIPs = newReservedIPs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT__RESERVED_IPS, oldReservedIPs, newReservedIPs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservedIPs(ReservedIPsType newReservedIPs) {
		if (newReservedIPs != reservedIPs) {
			NotificationChain msgs = null;
			if (reservedIPs != null)
				msgs = ((InternalEObject)reservedIPs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT__RESERVED_IPS, null, msgs);
			if (newReservedIPs != null)
				msgs = ((InternalEObject)newReservedIPs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT__RESERVED_IPS, null, msgs);
			msgs = basicSetReservedIPs(newReservedIPs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT__RESERVED_IPS, newReservedIPs, newReservedIPs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT__INSTANCE_ADDRESS:
				return ((InternalEList<?>)getInstanceAddress()).basicRemove(otherEnd, msgs);
			case AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT__RESERVED_IPS:
				return basicSetReservedIPs(null, msgs);
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
			case AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT__INSTANCE_ADDRESS:
				return getInstanceAddress();
			case AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT__RESERVED_IPS:
				return getReservedIPs();
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
			case AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT__INSTANCE_ADDRESS:
				getInstanceAddress().clear();
				getInstanceAddress().addAll((Collection<? extends InstanceAddressElement>)newValue);
				return;
			case AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT__RESERVED_IPS:
				setReservedIPs((ReservedIPsType)newValue);
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
			case AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT__INSTANCE_ADDRESS:
				getInstanceAddress().clear();
				return;
			case AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT__RESERVED_IPS:
				setReservedIPs((ReservedIPsType)null);
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
			case AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT__INSTANCE_ADDRESS:
				return instanceAddress != null && !instanceAddress.isEmpty();
			case AzureCSCfgPackage.ADDRESS_ASSIGNMENTS_ELEMENT__RESERVED_IPS:
				return reservedIPs != null;
		}
		return super.eIsSet(featureID);
	}

} //AddressAssignmentsElementImpl
