/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.Certificate;
import eu.artist.migration.deployment.azure.csdef.PermissionLevel;
import eu.artist.migration.deployment.azure.csdef.StoreLocation;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Certificate</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.CertificateImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.CertificateImpl#getPermissionLevel <em>Permission Level</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.CertificateImpl#getStoreLocation <em>Store Location</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.CertificateImpl#getStoreName <em>Store Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CertificateImpl extends MinimalEObjectImpl.Container implements Certificate {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getPermissionLevel() <em>Permission Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionLevel()
	 * @generated
	 * @ordered
	 */
	protected static final PermissionLevel PERMISSION_LEVEL_EDEFAULT = PermissionLevel.LIMITED_OR_ELEVATED;

	/**
	 * The cached value of the '{@link #getPermissionLevel() <em>Permission Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissionLevel()
	 * @generated
	 * @ordered
	 */
	protected PermissionLevel permissionLevel = PERMISSION_LEVEL_EDEFAULT;

	/**
	 * This is true if the Permission Level attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean permissionLevelESet;

	/**
	 * The default value of the '{@link #getStoreLocation() <em>Store Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreLocation()
	 * @generated
	 * @ordered
	 */
	protected static final StoreLocation STORE_LOCATION_EDEFAULT = StoreLocation.CURRENT_USER;

	/**
	 * The cached value of the '{@link #getStoreLocation() <em>Store Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreLocation()
	 * @generated
	 * @ordered
	 */
	protected StoreLocation storeLocation = STORE_LOCATION_EDEFAULT;

	/**
	 * This is true if the Store Location attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean storeLocationESet;

	/**
	 * The default value of the '{@link #getStoreName() <em>Store Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreName()
	 * @generated
	 * @ordered
	 */
	protected static final Object STORE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoreName() <em>Store Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreName()
	 * @generated
	 * @ordered
	 */
	protected Object storeName = STORE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CertificateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.CERTIFICATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.CERTIFICATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PermissionLevel getPermissionLevel() {
		return permissionLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPermissionLevel(PermissionLevel newPermissionLevel) {
		PermissionLevel oldPermissionLevel = permissionLevel;
		permissionLevel = newPermissionLevel == null ? PERMISSION_LEVEL_EDEFAULT : newPermissionLevel;
		boolean oldPermissionLevelESet = permissionLevelESet;
		permissionLevelESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.CERTIFICATE__PERMISSION_LEVEL, oldPermissionLevel, permissionLevel, !oldPermissionLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPermissionLevel() {
		PermissionLevel oldPermissionLevel = permissionLevel;
		boolean oldPermissionLevelESet = permissionLevelESet;
		permissionLevel = PERMISSION_LEVEL_EDEFAULT;
		permissionLevelESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.CERTIFICATE__PERMISSION_LEVEL, oldPermissionLevel, PERMISSION_LEVEL_EDEFAULT, oldPermissionLevelESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPermissionLevel() {
		return permissionLevelESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StoreLocation getStoreLocation() {
		return storeLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreLocation(StoreLocation newStoreLocation) {
		StoreLocation oldStoreLocation = storeLocation;
		storeLocation = newStoreLocation == null ? STORE_LOCATION_EDEFAULT : newStoreLocation;
		boolean oldStoreLocationESet = storeLocationESet;
		storeLocationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.CERTIFICATE__STORE_LOCATION, oldStoreLocation, storeLocation, !oldStoreLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetStoreLocation() {
		StoreLocation oldStoreLocation = storeLocation;
		boolean oldStoreLocationESet = storeLocationESet;
		storeLocation = STORE_LOCATION_EDEFAULT;
		storeLocationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.CERTIFICATE__STORE_LOCATION, oldStoreLocation, STORE_LOCATION_EDEFAULT, oldStoreLocationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStoreLocation() {
		return storeLocationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getStoreName() {
		return storeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreName(Object newStoreName) {
		Object oldStoreName = storeName;
		storeName = newStoreName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.CERTIFICATE__STORE_NAME, oldStoreName, storeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AzureCSDefPackage.CERTIFICATE__NAME:
				return getName();
			case AzureCSDefPackage.CERTIFICATE__PERMISSION_LEVEL:
				return getPermissionLevel();
			case AzureCSDefPackage.CERTIFICATE__STORE_LOCATION:
				return getStoreLocation();
			case AzureCSDefPackage.CERTIFICATE__STORE_NAME:
				return getStoreName();
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
			case AzureCSDefPackage.CERTIFICATE__NAME:
				setName((String)newValue);
				return;
			case AzureCSDefPackage.CERTIFICATE__PERMISSION_LEVEL:
				setPermissionLevel((PermissionLevel)newValue);
				return;
			case AzureCSDefPackage.CERTIFICATE__STORE_LOCATION:
				setStoreLocation((StoreLocation)newValue);
				return;
			case AzureCSDefPackage.CERTIFICATE__STORE_NAME:
				setStoreName(newValue);
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
			case AzureCSDefPackage.CERTIFICATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AzureCSDefPackage.CERTIFICATE__PERMISSION_LEVEL:
				unsetPermissionLevel();
				return;
			case AzureCSDefPackage.CERTIFICATE__STORE_LOCATION:
				unsetStoreLocation();
				return;
			case AzureCSDefPackage.CERTIFICATE__STORE_NAME:
				setStoreName(STORE_NAME_EDEFAULT);
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
			case AzureCSDefPackage.CERTIFICATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AzureCSDefPackage.CERTIFICATE__PERMISSION_LEVEL:
				return isSetPermissionLevel();
			case AzureCSDefPackage.CERTIFICATE__STORE_LOCATION:
				return isSetStoreLocation();
			case AzureCSDefPackage.CERTIFICATE__STORE_NAME:
				return STORE_NAME_EDEFAULT == null ? storeName != null : !STORE_NAME_EDEFAULT.equals(storeName);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", permissionLevel: ");
		if (permissionLevelESet) result.append(permissionLevel); else result.append("<unset>");
		result.append(", storeLocation: ");
		if (storeLocationESet) result.append(storeLocation); else result.append("<unset>");
		result.append(", storeName: ");
		result.append(storeName);
		result.append(')');
		return result.toString();
	}

} //CertificateImpl
