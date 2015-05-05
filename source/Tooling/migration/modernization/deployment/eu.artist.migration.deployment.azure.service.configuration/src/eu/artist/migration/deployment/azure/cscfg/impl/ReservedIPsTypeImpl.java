/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.ReservedIPElement;
import eu.artist.migration.deployment.azure.cscfg.ReservedIPsType;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reserved IPs Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.ReservedIPsTypeImpl#getReservedIP <em>Reserved IP</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReservedIPsTypeImpl extends MinimalEObjectImpl.Container implements ReservedIPsType {
	/**
	 * The cached value of the '{@link #getReservedIP() <em>Reserved IP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReservedIP()
	 * @generated
	 * @ordered
	 */
	protected ReservedIPElement reservedIP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReservedIPsTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.RESERVED_IPS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReservedIPElement getReservedIP() {
		return reservedIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReservedIP(ReservedIPElement newReservedIP, NotificationChain msgs) {
		ReservedIPElement oldReservedIP = reservedIP;
		reservedIP = newReservedIP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.RESERVED_IPS_TYPE__RESERVED_IP, oldReservedIP, newReservedIP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReservedIP(ReservedIPElement newReservedIP) {
		if (newReservedIP != reservedIP) {
			NotificationChain msgs = null;
			if (reservedIP != null)
				msgs = ((InternalEObject)reservedIP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.RESERVED_IPS_TYPE__RESERVED_IP, null, msgs);
			if (newReservedIP != null)
				msgs = ((InternalEObject)newReservedIP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.RESERVED_IPS_TYPE__RESERVED_IP, null, msgs);
			msgs = basicSetReservedIP(newReservedIP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.RESERVED_IPS_TYPE__RESERVED_IP, newReservedIP, newReservedIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSCfgPackage.RESERVED_IPS_TYPE__RESERVED_IP:
				return basicSetReservedIP(null, msgs);
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
			case AzureCSCfgPackage.RESERVED_IPS_TYPE__RESERVED_IP:
				return getReservedIP();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AzureCSCfgPackage.RESERVED_IPS_TYPE__RESERVED_IP:
				setReservedIP((ReservedIPElement)newValue);
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
			case AzureCSCfgPackage.RESERVED_IPS_TYPE__RESERVED_IP:
				setReservedIP((ReservedIPElement)null);
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
			case AzureCSCfgPackage.RESERVED_IPS_TYPE__RESERVED_IP:
				return reservedIP != null;
		}
		return super.eIsSet(featureID);
	}

} //ReservedIPsTypeImpl
