/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement;
import eu.artist.migration.deployment.azure.cscfg.IPConfigurationAddressType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Frontend IP Configuration Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.FrontendIPConfigurationElementImpl#getStaticVirtualNetworkIPAddress <em>Static Virtual Network IP Address</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.FrontendIPConfigurationElementImpl#getSubnet <em>Subnet</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.FrontendIPConfigurationElementImpl#getType <em>Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FrontendIPConfigurationElementImpl extends MinimalEObjectImpl.Container implements FrontendIPConfigurationElement {
	/**
	 * The default value of the '{@link #getStaticVirtualNetworkIPAddress() <em>Static Virtual Network IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticVirtualNetworkIPAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String STATIC_VIRTUAL_NETWORK_IP_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStaticVirtualNetworkIPAddress() <em>Static Virtual Network IP Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStaticVirtualNetworkIPAddress()
	 * @generated
	 * @ordered
	 */
	protected String staticVirtualNetworkIPAddress = STATIC_VIRTUAL_NETWORK_IP_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubnet() <em>Subnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet()
	 * @generated
	 * @ordered
	 */
	protected static final String SUBNET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubnet() <em>Subnet</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnet()
	 * @generated
	 * @ordered
	 */
	protected String subnet = SUBNET_EDEFAULT;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final IPConfigurationAddressType TYPE_EDEFAULT = IPConfigurationAddressType.PRIVATE;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected IPConfigurationAddressType type = TYPE_EDEFAULT;

	/**
	 * This is true if the Type attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrontendIPConfigurationElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.FRONTEND_IP_CONFIGURATION_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStaticVirtualNetworkIPAddress() {
		return staticVirtualNetworkIPAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStaticVirtualNetworkIPAddress(String newStaticVirtualNetworkIPAddress) {
		String oldStaticVirtualNetworkIPAddress = staticVirtualNetworkIPAddress;
		staticVirtualNetworkIPAddress = newStaticVirtualNetworkIPAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT__STATIC_VIRTUAL_NETWORK_IP_ADDRESS, oldStaticVirtualNetworkIPAddress, staticVirtualNetworkIPAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSubnet() {
		return subnet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnet(String newSubnet) {
		String oldSubnet = subnet;
		subnet = newSubnet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT__SUBNET, oldSubnet, subnet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IPConfigurationAddressType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(IPConfigurationAddressType newType) {
		IPConfigurationAddressType oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		boolean oldTypeESet = typeESet;
		typeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT__TYPE, oldType, type, !oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetType() {
		IPConfigurationAddressType oldType = type;
		boolean oldTypeESet = typeESet;
		type = TYPE_EDEFAULT;
		typeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT__TYPE, oldType, TYPE_EDEFAULT, oldTypeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
		return typeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT__STATIC_VIRTUAL_NETWORK_IP_ADDRESS:
				return getStaticVirtualNetworkIPAddress();
			case AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT__SUBNET:
				return getSubnet();
			case AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT__TYPE:
				return getType();
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
			case AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT__STATIC_VIRTUAL_NETWORK_IP_ADDRESS:
				setStaticVirtualNetworkIPAddress((String)newValue);
				return;
			case AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT__SUBNET:
				setSubnet((String)newValue);
				return;
			case AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT__TYPE:
				setType((IPConfigurationAddressType)newValue);
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
			case AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT__STATIC_VIRTUAL_NETWORK_IP_ADDRESS:
				setStaticVirtualNetworkIPAddress(STATIC_VIRTUAL_NETWORK_IP_ADDRESS_EDEFAULT);
				return;
			case AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT__SUBNET:
				setSubnet(SUBNET_EDEFAULT);
				return;
			case AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT__TYPE:
				unsetType();
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
			case AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT__STATIC_VIRTUAL_NETWORK_IP_ADDRESS:
				return STATIC_VIRTUAL_NETWORK_IP_ADDRESS_EDEFAULT == null ? staticVirtualNetworkIPAddress != null : !STATIC_VIRTUAL_NETWORK_IP_ADDRESS_EDEFAULT.equals(staticVirtualNetworkIPAddress);
			case AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT__SUBNET:
				return SUBNET_EDEFAULT == null ? subnet != null : !SUBNET_EDEFAULT.equals(subnet);
			case AzureCSCfgPackage.FRONTEND_IP_CONFIGURATION_ELEMENT__TYPE:
				return isSetType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (staticVirtualNetworkIPAddress: ");
		result.append(staticVirtualNetworkIPAddress);
		result.append(", subnet: ");
		result.append(subnet);
		result.append(", type: ");
		if (typeESet) result.append(type); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //FrontendIPConfigurationElementImpl
