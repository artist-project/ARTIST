/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.DnsElement;
import eu.artist.migration.deployment.azure.cscfg.DnsServersElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dns Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.DnsElementImpl#getDnsServers <em>Dns Servers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DnsElementImpl extends MinimalEObjectImpl.Container implements DnsElement {
	/**
	 * The cached value of the '{@link #getDnsServers() <em>Dns Servers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsServers()
	 * @generated
	 * @ordered
	 */
	protected DnsServersElement dnsServers;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DnsElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.DNS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DnsServersElement getDnsServers() {
		return dnsServers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDnsServers(DnsServersElement newDnsServers, NotificationChain msgs) {
		DnsServersElement oldDnsServers = dnsServers;
		dnsServers = newDnsServers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.DNS_ELEMENT__DNS_SERVERS, oldDnsServers, newDnsServers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDnsServers(DnsServersElement newDnsServers) {
		if (newDnsServers != dnsServers) {
			NotificationChain msgs = null;
			if (dnsServers != null)
				msgs = ((InternalEObject)dnsServers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.DNS_ELEMENT__DNS_SERVERS, null, msgs);
			if (newDnsServers != null)
				msgs = ((InternalEObject)newDnsServers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.DNS_ELEMENT__DNS_SERVERS, null, msgs);
			msgs = basicSetDnsServers(newDnsServers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.DNS_ELEMENT__DNS_SERVERS, newDnsServers, newDnsServers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSCfgPackage.DNS_ELEMENT__DNS_SERVERS:
				return basicSetDnsServers(null, msgs);
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
			case AzureCSCfgPackage.DNS_ELEMENT__DNS_SERVERS:
				return getDnsServers();
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
			case AzureCSCfgPackage.DNS_ELEMENT__DNS_SERVERS:
				setDnsServers((DnsServersElement)newValue);
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
			case AzureCSCfgPackage.DNS_ELEMENT__DNS_SERVERS:
				setDnsServers((DnsServersElement)null);
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
			case AzureCSCfgPackage.DNS_ELEMENT__DNS_SERVERS:
				return dnsServers != null;
		}
		return super.eIsSet(featureID);
	}

} //DnsElementImpl
