/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AccessControlsElement;
import eu.artist.migration.deployment.azure.cscfg.AddressAssignmentsElement;
import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.DnsElement;
import eu.artist.migration.deployment.azure.cscfg.EndpointAclsElement;
import eu.artist.migration.deployment.azure.cscfg.LoadBalancersElement;
import eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement;
import eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefsElement;
import eu.artist.migration.deployment.azure.cscfg.VirtualNetworkSiteElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Configuration Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkConfigurationElementImpl#getDns <em>Dns</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkConfigurationElementImpl#getVirtualNetworkSite <em>Virtual Network Site</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkConfigurationElementImpl#getAddressAssignments <em>Address Assignments</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkConfigurationElementImpl#getAccessControls <em>Access Controls</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkConfigurationElementImpl#getEndpointAcls <em>Endpoint Acls</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkConfigurationElementImpl#getLoadBalancers <em>Load Balancers</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkConfigurationElementImpl#getNetworkSecurityGroupRefs <em>Network Security Group Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkConfigurationElementImpl extends MinimalEObjectImpl.Container implements NetworkConfigurationElement {
	/**
	 * The cached value of the '{@link #getDns() <em>Dns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDns()
	 * @generated
	 * @ordered
	 */
	protected DnsElement dns;

	/**
	 * The cached value of the '{@link #getVirtualNetworkSite() <em>Virtual Network Site</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVirtualNetworkSite()
	 * @generated
	 * @ordered
	 */
	protected VirtualNetworkSiteElement virtualNetworkSite;

	/**
	 * The cached value of the '{@link #getAddressAssignments() <em>Address Assignments</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddressAssignments()
	 * @generated
	 * @ordered
	 */
	protected AddressAssignmentsElement addressAssignments;

	/**
	 * The cached value of the '{@link #getAccessControls() <em>Access Controls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControls()
	 * @generated
	 * @ordered
	 */
	protected AccessControlsElement accessControls;

	/**
	 * The cached value of the '{@link #getEndpointAcls() <em>Endpoint Acls</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointAcls()
	 * @generated
	 * @ordered
	 */
	protected EndpointAclsElement endpointAcls;

	/**
	 * The cached value of the '{@link #getLoadBalancers() <em>Load Balancers</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancers()
	 * @generated
	 * @ordered
	 */
	protected LoadBalancersElement loadBalancers;

	/**
	 * The cached value of the '{@link #getNetworkSecurityGroupRefs() <em>Network Security Group Refs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkSecurityGroupRefs()
	 * @generated
	 * @ordered
	 */
	protected NetworkSecurityGroupRefsElement networkSecurityGroupRefs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkConfigurationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.NETWORK_CONFIGURATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DnsElement getDns() {
		return dns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDns(DnsElement newDns, NotificationChain msgs) {
		DnsElement oldDns = dns;
		dns = newDns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__DNS, oldDns, newDns);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDns(DnsElement newDns) {
		if (newDns != dns) {
			NotificationChain msgs = null;
			if (dns != null)
				msgs = ((InternalEObject)dns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__DNS, null, msgs);
			if (newDns != null)
				msgs = ((InternalEObject)newDns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__DNS, null, msgs);
			msgs = basicSetDns(newDns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__DNS, newDns, newDns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VirtualNetworkSiteElement getVirtualNetworkSite() {
		return virtualNetworkSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVirtualNetworkSite(VirtualNetworkSiteElement newVirtualNetworkSite, NotificationChain msgs) {
		VirtualNetworkSiteElement oldVirtualNetworkSite = virtualNetworkSite;
		virtualNetworkSite = newVirtualNetworkSite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__VIRTUAL_NETWORK_SITE, oldVirtualNetworkSite, newVirtualNetworkSite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVirtualNetworkSite(VirtualNetworkSiteElement newVirtualNetworkSite) {
		if (newVirtualNetworkSite != virtualNetworkSite) {
			NotificationChain msgs = null;
			if (virtualNetworkSite != null)
				msgs = ((InternalEObject)virtualNetworkSite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__VIRTUAL_NETWORK_SITE, null, msgs);
			if (newVirtualNetworkSite != null)
				msgs = ((InternalEObject)newVirtualNetworkSite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__VIRTUAL_NETWORK_SITE, null, msgs);
			msgs = basicSetVirtualNetworkSite(newVirtualNetworkSite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__VIRTUAL_NETWORK_SITE, newVirtualNetworkSite, newVirtualNetworkSite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressAssignmentsElement getAddressAssignments() {
		return addressAssignments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddressAssignments(AddressAssignmentsElement newAddressAssignments, NotificationChain msgs) {
		AddressAssignmentsElement oldAddressAssignments = addressAssignments;
		addressAssignments = newAddressAssignments;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ADDRESS_ASSIGNMENTS, oldAddressAssignments, newAddressAssignments);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddressAssignments(AddressAssignmentsElement newAddressAssignments) {
		if (newAddressAssignments != addressAssignments) {
			NotificationChain msgs = null;
			if (addressAssignments != null)
				msgs = ((InternalEObject)addressAssignments).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ADDRESS_ASSIGNMENTS, null, msgs);
			if (newAddressAssignments != null)
				msgs = ((InternalEObject)newAddressAssignments).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ADDRESS_ASSIGNMENTS, null, msgs);
			msgs = basicSetAddressAssignments(newAddressAssignments, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ADDRESS_ASSIGNMENTS, newAddressAssignments, newAddressAssignments));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccessControlsElement getAccessControls() {
		return accessControls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAccessControls(AccessControlsElement newAccessControls, NotificationChain msgs) {
		AccessControlsElement oldAccessControls = accessControls;
		accessControls = newAccessControls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ACCESS_CONTROLS, oldAccessControls, newAccessControls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAccessControls(AccessControlsElement newAccessControls) {
		if (newAccessControls != accessControls) {
			NotificationChain msgs = null;
			if (accessControls != null)
				msgs = ((InternalEObject)accessControls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ACCESS_CONTROLS, null, msgs);
			if (newAccessControls != null)
				msgs = ((InternalEObject)newAccessControls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ACCESS_CONTROLS, null, msgs);
			msgs = basicSetAccessControls(newAccessControls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ACCESS_CONTROLS, newAccessControls, newAccessControls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndpointAclsElement getEndpointAcls() {
		return endpointAcls;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpointAcls(EndpointAclsElement newEndpointAcls, NotificationChain msgs) {
		EndpointAclsElement oldEndpointAcls = endpointAcls;
		endpointAcls = newEndpointAcls;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ENDPOINT_ACLS, oldEndpointAcls, newEndpointAcls);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointAcls(EndpointAclsElement newEndpointAcls) {
		if (newEndpointAcls != endpointAcls) {
			NotificationChain msgs = null;
			if (endpointAcls != null)
				msgs = ((InternalEObject)endpointAcls).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ENDPOINT_ACLS, null, msgs);
			if (newEndpointAcls != null)
				msgs = ((InternalEObject)newEndpointAcls).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ENDPOINT_ACLS, null, msgs);
			msgs = basicSetEndpointAcls(newEndpointAcls, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ENDPOINT_ACLS, newEndpointAcls, newEndpointAcls));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancersElement getLoadBalancers() {
		return loadBalancers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadBalancers(LoadBalancersElement newLoadBalancers, NotificationChain msgs) {
		LoadBalancersElement oldLoadBalancers = loadBalancers;
		loadBalancers = newLoadBalancers;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__LOAD_BALANCERS, oldLoadBalancers, newLoadBalancers);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadBalancers(LoadBalancersElement newLoadBalancers) {
		if (newLoadBalancers != loadBalancers) {
			NotificationChain msgs = null;
			if (loadBalancers != null)
				msgs = ((InternalEObject)loadBalancers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__LOAD_BALANCERS, null, msgs);
			if (newLoadBalancers != null)
				msgs = ((InternalEObject)newLoadBalancers).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__LOAD_BALANCERS, null, msgs);
			msgs = basicSetLoadBalancers(newLoadBalancers, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__LOAD_BALANCERS, newLoadBalancers, newLoadBalancers));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkSecurityGroupRefsElement getNetworkSecurityGroupRefs() {
		return networkSecurityGroupRefs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkSecurityGroupRefs(NetworkSecurityGroupRefsElement newNetworkSecurityGroupRefs, NotificationChain msgs) {
		NetworkSecurityGroupRefsElement oldNetworkSecurityGroupRefs = networkSecurityGroupRefs;
		networkSecurityGroupRefs = newNetworkSecurityGroupRefs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__NETWORK_SECURITY_GROUP_REFS, oldNetworkSecurityGroupRefs, newNetworkSecurityGroupRefs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkSecurityGroupRefs(NetworkSecurityGroupRefsElement newNetworkSecurityGroupRefs) {
		if (newNetworkSecurityGroupRefs != networkSecurityGroupRefs) {
			NotificationChain msgs = null;
			if (networkSecurityGroupRefs != null)
				msgs = ((InternalEObject)networkSecurityGroupRefs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__NETWORK_SECURITY_GROUP_REFS, null, msgs);
			if (newNetworkSecurityGroupRefs != null)
				msgs = ((InternalEObject)newNetworkSecurityGroupRefs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__NETWORK_SECURITY_GROUP_REFS, null, msgs);
			msgs = basicSetNetworkSecurityGroupRefs(newNetworkSecurityGroupRefs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__NETWORK_SECURITY_GROUP_REFS, newNetworkSecurityGroupRefs, newNetworkSecurityGroupRefs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__DNS:
				return basicSetDns(null, msgs);
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__VIRTUAL_NETWORK_SITE:
				return basicSetVirtualNetworkSite(null, msgs);
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ADDRESS_ASSIGNMENTS:
				return basicSetAddressAssignments(null, msgs);
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ACCESS_CONTROLS:
				return basicSetAccessControls(null, msgs);
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ENDPOINT_ACLS:
				return basicSetEndpointAcls(null, msgs);
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__LOAD_BALANCERS:
				return basicSetLoadBalancers(null, msgs);
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__NETWORK_SECURITY_GROUP_REFS:
				return basicSetNetworkSecurityGroupRefs(null, msgs);
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
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__DNS:
				return getDns();
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__VIRTUAL_NETWORK_SITE:
				return getVirtualNetworkSite();
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ADDRESS_ASSIGNMENTS:
				return getAddressAssignments();
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ACCESS_CONTROLS:
				return getAccessControls();
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ENDPOINT_ACLS:
				return getEndpointAcls();
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__LOAD_BALANCERS:
				return getLoadBalancers();
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__NETWORK_SECURITY_GROUP_REFS:
				return getNetworkSecurityGroupRefs();
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
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__DNS:
				setDns((DnsElement)newValue);
				return;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__VIRTUAL_NETWORK_SITE:
				setVirtualNetworkSite((VirtualNetworkSiteElement)newValue);
				return;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ADDRESS_ASSIGNMENTS:
				setAddressAssignments((AddressAssignmentsElement)newValue);
				return;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ACCESS_CONTROLS:
				setAccessControls((AccessControlsElement)newValue);
				return;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ENDPOINT_ACLS:
				setEndpointAcls((EndpointAclsElement)newValue);
				return;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__LOAD_BALANCERS:
				setLoadBalancers((LoadBalancersElement)newValue);
				return;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__NETWORK_SECURITY_GROUP_REFS:
				setNetworkSecurityGroupRefs((NetworkSecurityGroupRefsElement)newValue);
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
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__DNS:
				setDns((DnsElement)null);
				return;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__VIRTUAL_NETWORK_SITE:
				setVirtualNetworkSite((VirtualNetworkSiteElement)null);
				return;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ADDRESS_ASSIGNMENTS:
				setAddressAssignments((AddressAssignmentsElement)null);
				return;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ACCESS_CONTROLS:
				setAccessControls((AccessControlsElement)null);
				return;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ENDPOINT_ACLS:
				setEndpointAcls((EndpointAclsElement)null);
				return;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__LOAD_BALANCERS:
				setLoadBalancers((LoadBalancersElement)null);
				return;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__NETWORK_SECURITY_GROUP_REFS:
				setNetworkSecurityGroupRefs((NetworkSecurityGroupRefsElement)null);
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
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__DNS:
				return dns != null;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__VIRTUAL_NETWORK_SITE:
				return virtualNetworkSite != null;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ADDRESS_ASSIGNMENTS:
				return addressAssignments != null;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ACCESS_CONTROLS:
				return accessControls != null;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__ENDPOINT_ACLS:
				return endpointAcls != null;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__LOAD_BALANCERS:
				return loadBalancers != null;
			case AzureCSCfgPackage.NETWORK_CONFIGURATION_ELEMENT__NETWORK_SECURITY_GROUP_REFS:
				return networkSecurityGroupRefs != null;
		}
		return super.eIsSet(featureID);
	}

} //NetworkConfigurationElementImpl
