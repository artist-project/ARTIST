/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.DnsServerElement;
import eu.artist.migration.deployment.azure.cscfg.DnsServersElement;

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
 * An implementation of the model object '<em><b>Dns Servers Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.DnsServersElementImpl#getDnsServer <em>Dns Server</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DnsServersElementImpl extends MinimalEObjectImpl.Container implements DnsServersElement {
	/**
	 * The cached value of the '{@link #getDnsServer() <em>Dns Server</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDnsServer()
	 * @generated
	 * @ordered
	 */
	protected EList<DnsServerElement> dnsServer;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DnsServersElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.DNS_SERVERS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DnsServerElement> getDnsServer() {
		if (dnsServer == null) {
			dnsServer = new EObjectContainmentEList<DnsServerElement>(DnsServerElement.class, this, AzureCSCfgPackage.DNS_SERVERS_ELEMENT__DNS_SERVER);
		}
		return dnsServer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSCfgPackage.DNS_SERVERS_ELEMENT__DNS_SERVER:
				return ((InternalEList<?>)getDnsServer()).basicRemove(otherEnd, msgs);
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
			case AzureCSCfgPackage.DNS_SERVERS_ELEMENT__DNS_SERVER:
				return getDnsServer();
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
			case AzureCSCfgPackage.DNS_SERVERS_ELEMENT__DNS_SERVER:
				getDnsServer().clear();
				getDnsServer().addAll((Collection<? extends DnsServerElement>)newValue);
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
			case AzureCSCfgPackage.DNS_SERVERS_ELEMENT__DNS_SERVER:
				getDnsServer().clear();
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
			case AzureCSCfgPackage.DNS_SERVERS_ELEMENT__DNS_SERVER:
				return dnsServer != null && !dnsServer.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DnsServersElementImpl
