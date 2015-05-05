/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.InstanceAddressElement;
import eu.artist.migration.deployment.azure.cscfg.PublicIPsElement;
import eu.artist.migration.deployment.azure.cscfg.SubnetsElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Address Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.InstanceAddressElementImpl#getSubnets <em>Subnets</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.InstanceAddressElementImpl#getPublicIPs <em>Public IPs</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.InstanceAddressElementImpl#getRoleName <em>Role Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceAddressElementImpl extends MinimalEObjectImpl.Container implements InstanceAddressElement {
	/**
	 * The cached value of the '{@link #getSubnets() <em>Subnets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubnets()
	 * @generated
	 * @ordered
	 */
	protected SubnetsElement subnets;

	/**
	 * The cached value of the '{@link #getPublicIPs() <em>Public IPs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublicIPs()
	 * @generated
	 * @ordered
	 */
	protected PublicIPsElement publicIPs;

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
	protected InstanceAddressElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.INSTANCE_ADDRESS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubnetsElement getSubnets() {
		return subnets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubnets(SubnetsElement newSubnets, NotificationChain msgs) {
		SubnetsElement oldSubnets = subnets;
		subnets = newSubnets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__SUBNETS, oldSubnets, newSubnets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubnets(SubnetsElement newSubnets) {
		if (newSubnets != subnets) {
			NotificationChain msgs = null;
			if (subnets != null)
				msgs = ((InternalEObject)subnets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__SUBNETS, null, msgs);
			if (newSubnets != null)
				msgs = ((InternalEObject)newSubnets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__SUBNETS, null, msgs);
			msgs = basicSetSubnets(newSubnets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__SUBNETS, newSubnets, newSubnets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublicIPsElement getPublicIPs() {
		return publicIPs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublicIPs(PublicIPsElement newPublicIPs, NotificationChain msgs) {
		PublicIPsElement oldPublicIPs = publicIPs;
		publicIPs = newPublicIPs;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__PUBLIC_IPS, oldPublicIPs, newPublicIPs);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicIPs(PublicIPsElement newPublicIPs) {
		if (newPublicIPs != publicIPs) {
			NotificationChain msgs = null;
			if (publicIPs != null)
				msgs = ((InternalEObject)publicIPs).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__PUBLIC_IPS, null, msgs);
			if (newPublicIPs != null)
				msgs = ((InternalEObject)newPublicIPs).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__PUBLIC_IPS, null, msgs);
			msgs = basicSetPublicIPs(newPublicIPs, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__PUBLIC_IPS, newPublicIPs, newPublicIPs));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__ROLE_NAME, oldRoleName, roleName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__SUBNETS:
				return basicSetSubnets(null, msgs);
			case AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__PUBLIC_IPS:
				return basicSetPublicIPs(null, msgs);
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
			case AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__SUBNETS:
				return getSubnets();
			case AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__PUBLIC_IPS:
				return getPublicIPs();
			case AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__ROLE_NAME:
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
			case AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__SUBNETS:
				setSubnets((SubnetsElement)newValue);
				return;
			case AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__PUBLIC_IPS:
				setPublicIPs((PublicIPsElement)newValue);
				return;
			case AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__ROLE_NAME:
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
			case AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__SUBNETS:
				setSubnets((SubnetsElement)null);
				return;
			case AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__PUBLIC_IPS:
				setPublicIPs((PublicIPsElement)null);
				return;
			case AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__ROLE_NAME:
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
			case AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__SUBNETS:
				return subnets != null;
			case AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__PUBLIC_IPS:
				return publicIPs != null;
			case AzureCSCfgPackage.INSTANCE_ADDRESS_ELEMENT__ROLE_NAME:
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

} //InstanceAddressElementImpl
