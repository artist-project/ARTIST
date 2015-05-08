/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupElement;
import eu.artist.migration.deployment.azure.cscfg.NetworkSecurityGroupRefElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Network Security Group Ref Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkSecurityGroupRefElementImpl#getNetworkSecurityGroup <em>Network Security Group</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.NetworkSecurityGroupRefElementImpl#getRoleName <em>Role Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NetworkSecurityGroupRefElementImpl extends MinimalEObjectImpl.Container implements NetworkSecurityGroupRefElement {
	/**
	 * The cached value of the '{@link #getNetworkSecurityGroup() <em>Network Security Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkSecurityGroup()
	 * @generated
	 * @ordered
	 */
	protected NetworkSecurityGroupElement networkSecurityGroup;

	/**
	 * The default value of the '{@link #getRoleName() <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleName()
	 * @generated
	 * @ordered
	 */
	protected static final String ROLE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRoleName() <em>Role Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoleName()
	 * @generated
	 * @ordered
	 */
	protected String roleName = ROLE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NetworkSecurityGroupRefElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.NETWORK_SECURITY_GROUP_REF_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkSecurityGroupElement getNetworkSecurityGroup() {
		return networkSecurityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkSecurityGroup(NetworkSecurityGroupElement newNetworkSecurityGroup, NotificationChain msgs) {
		NetworkSecurityGroupElement oldNetworkSecurityGroup = networkSecurityGroup;
		networkSecurityGroup = newNetworkSecurityGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REF_ELEMENT__NETWORK_SECURITY_GROUP, oldNetworkSecurityGroup, newNetworkSecurityGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkSecurityGroup(NetworkSecurityGroupElement newNetworkSecurityGroup) {
		if (newNetworkSecurityGroup != networkSecurityGroup) {
			NotificationChain msgs = null;
			if (networkSecurityGroup != null)
				msgs = ((InternalEObject)networkSecurityGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REF_ELEMENT__NETWORK_SECURITY_GROUP, null, msgs);
			if (newNetworkSecurityGroup != null)
				msgs = ((InternalEObject)newNetworkSecurityGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REF_ELEMENT__NETWORK_SECURITY_GROUP, null, msgs);
			msgs = basicSetNetworkSecurityGroup(newNetworkSecurityGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REF_ELEMENT__NETWORK_SECURITY_GROUP, newNetworkSecurityGroup, newNetworkSecurityGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRoleName() {
		return roleName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoleName(String newRoleName) {
		String oldRoleName = roleName;
		roleName = newRoleName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REF_ELEMENT__ROLE_NAME, oldRoleName, roleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REF_ELEMENT__NETWORK_SECURITY_GROUP:
				return basicSetNetworkSecurityGroup(null, msgs);
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
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REF_ELEMENT__NETWORK_SECURITY_GROUP:
				return getNetworkSecurityGroup();
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REF_ELEMENT__ROLE_NAME:
				return getRoleName();
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
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REF_ELEMENT__NETWORK_SECURITY_GROUP:
				setNetworkSecurityGroup((NetworkSecurityGroupElement)newValue);
				return;
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REF_ELEMENT__ROLE_NAME:
				setRoleName((String)newValue);
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
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REF_ELEMENT__NETWORK_SECURITY_GROUP:
				setNetworkSecurityGroup((NetworkSecurityGroupElement)null);
				return;
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REF_ELEMENT__ROLE_NAME:
				setRoleName(ROLE_NAME_EDEFAULT);
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
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REF_ELEMENT__NETWORK_SECURITY_GROUP:
				return networkSecurityGroup != null;
			case AzureCSCfgPackage.NETWORK_SECURITY_GROUP_REF_ELEMENT__ROLE_NAME:
				return ROLE_NAME_EDEFAULT == null ? roleName != null : !ROLE_NAME_EDEFAULT.equals(roleName);
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
		result.append(" (roleName: ");
		result.append(roleName);
		result.append(')');
		return result.toString();
	}

} //NetworkSecurityGroupRefElementImpl
