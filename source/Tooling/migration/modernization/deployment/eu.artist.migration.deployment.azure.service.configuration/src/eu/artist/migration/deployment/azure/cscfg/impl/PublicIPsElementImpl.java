/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.PublicIPElement;
import eu.artist.migration.deployment.azure.cscfg.PublicIPsElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public IPs Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.PublicIPsElementImpl#getPublicIP <em>Public IP</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublicIPsElementImpl extends MinimalEObjectImpl.Container implements PublicIPsElement {
	/**
	 * The cached value of the '{@link #getPublicIP() <em>Public IP</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicIP()
	 * @generated
	 * @ordered
	 */
	protected PublicIPElement publicIP;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicIPsElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.PUBLIC_IPS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicIPElement getPublicIP() {
		return publicIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicIP(PublicIPElement newPublicIP, NotificationChain msgs) {
		PublicIPElement oldPublicIP = publicIP;
		publicIP = newPublicIP;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.PUBLIC_IPS_ELEMENT__PUBLIC_IP, oldPublicIP, newPublicIP);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicIP(PublicIPElement newPublicIP) {
		if (newPublicIP != publicIP) {
			NotificationChain msgs = null;
			if (publicIP != null)
				msgs = ((InternalEObject)publicIP).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.PUBLIC_IPS_ELEMENT__PUBLIC_IP, null, msgs);
			if (newPublicIP != null)
				msgs = ((InternalEObject)newPublicIP).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.PUBLIC_IPS_ELEMENT__PUBLIC_IP, null, msgs);
			msgs = basicSetPublicIP(newPublicIP, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.PUBLIC_IPS_ELEMENT__PUBLIC_IP, newPublicIP, newPublicIP));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSCfgPackage.PUBLIC_IPS_ELEMENT__PUBLIC_IP:
				return basicSetPublicIP(null, msgs);
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
			case AzureCSCfgPackage.PUBLIC_IPS_ELEMENT__PUBLIC_IP:
				return getPublicIP();
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
			case AzureCSCfgPackage.PUBLIC_IPS_ELEMENT__PUBLIC_IP:
				setPublicIP((PublicIPElement)newValue);
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
			case AzureCSCfgPackage.PUBLIC_IPS_ELEMENT__PUBLIC_IP:
				setPublicIP((PublicIPElement)null);
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
			case AzureCSCfgPackage.PUBLIC_IPS_ELEMENT__PUBLIC_IP:
				return publicIP != null;
		}
		return super.eIsSet(featureID);
	}

} //PublicIPsElementImpl
