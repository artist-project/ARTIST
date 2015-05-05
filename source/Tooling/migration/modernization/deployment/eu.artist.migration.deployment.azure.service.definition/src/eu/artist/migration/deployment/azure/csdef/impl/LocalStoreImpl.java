/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.LocalStore;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Local Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.LocalStoreImpl#isCleanOnRoleRecycle <em>Clean On Role Recycle</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.LocalStoreImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.LocalStoreImpl#getSizeInMB <em>Size In MB</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocalStoreImpl extends MinimalEObjectImpl.Container implements LocalStore {
	/**
	 * The default value of the '{@link #isCleanOnRoleRecycle() <em>Clean On Role Recycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleanOnRoleRecycle()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLEAN_ON_ROLE_RECYCLE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCleanOnRoleRecycle() <em>Clean On Role Recycle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleanOnRoleRecycle()
	 * @generated
	 * @ordered
	 */
	protected boolean cleanOnRoleRecycle = CLEAN_ON_ROLE_RECYCLE_EDEFAULT;

	/**
	 * This is true if the Clean On Role Recycle attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cleanOnRoleRecycleESet;

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
	 * The default value of the '{@link #getSizeInMB() <em>Size In MB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInMB()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_IN_MB_EDEFAULT = 1000;

	/**
	 * The cached value of the '{@link #getSizeInMB() <em>Size In MB</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSizeInMB()
	 * @generated
	 * @ordered
	 */
	protected int sizeInMB = SIZE_IN_MB_EDEFAULT;

	/**
	 * This is true if the Size In MB attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sizeInMBESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocalStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.LOCAL_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCleanOnRoleRecycle() {
		return cleanOnRoleRecycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCleanOnRoleRecycle(boolean newCleanOnRoleRecycle) {
		boolean oldCleanOnRoleRecycle = cleanOnRoleRecycle;
		cleanOnRoleRecycle = newCleanOnRoleRecycle;
		boolean oldCleanOnRoleRecycleESet = cleanOnRoleRecycleESet;
		cleanOnRoleRecycleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.LOCAL_STORE__CLEAN_ON_ROLE_RECYCLE, oldCleanOnRoleRecycle, cleanOnRoleRecycle, !oldCleanOnRoleRecycleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCleanOnRoleRecycle() {
		boolean oldCleanOnRoleRecycle = cleanOnRoleRecycle;
		boolean oldCleanOnRoleRecycleESet = cleanOnRoleRecycleESet;
		cleanOnRoleRecycle = CLEAN_ON_ROLE_RECYCLE_EDEFAULT;
		cleanOnRoleRecycleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.LOCAL_STORE__CLEAN_ON_ROLE_RECYCLE, oldCleanOnRoleRecycle, CLEAN_ON_ROLE_RECYCLE_EDEFAULT, oldCleanOnRoleRecycleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCleanOnRoleRecycle() {
		return cleanOnRoleRecycleESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.LOCAL_STORE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSizeInMB() {
		return sizeInMB;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSizeInMB(int newSizeInMB) {
		int oldSizeInMB = sizeInMB;
		sizeInMB = newSizeInMB;
		boolean oldSizeInMBESet = sizeInMBESet;
		sizeInMBESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.LOCAL_STORE__SIZE_IN_MB, oldSizeInMB, sizeInMB, !oldSizeInMBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSizeInMB() {
		int oldSizeInMB = sizeInMB;
		boolean oldSizeInMBESet = sizeInMBESet;
		sizeInMB = SIZE_IN_MB_EDEFAULT;
		sizeInMBESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.LOCAL_STORE__SIZE_IN_MB, oldSizeInMB, SIZE_IN_MB_EDEFAULT, oldSizeInMBESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSizeInMB() {
		return sizeInMBESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AzureCSDefPackage.LOCAL_STORE__CLEAN_ON_ROLE_RECYCLE:
				return isCleanOnRoleRecycle();
			case AzureCSDefPackage.LOCAL_STORE__NAME:
				return getName();
			case AzureCSDefPackage.LOCAL_STORE__SIZE_IN_MB:
				return getSizeInMB();
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
			case AzureCSDefPackage.LOCAL_STORE__CLEAN_ON_ROLE_RECYCLE:
				setCleanOnRoleRecycle((Boolean)newValue);
				return;
			case AzureCSDefPackage.LOCAL_STORE__NAME:
				setName((String)newValue);
				return;
			case AzureCSDefPackage.LOCAL_STORE__SIZE_IN_MB:
				setSizeInMB((Integer)newValue);
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
			case AzureCSDefPackage.LOCAL_STORE__CLEAN_ON_ROLE_RECYCLE:
				unsetCleanOnRoleRecycle();
				return;
			case AzureCSDefPackage.LOCAL_STORE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AzureCSDefPackage.LOCAL_STORE__SIZE_IN_MB:
				unsetSizeInMB();
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
			case AzureCSDefPackage.LOCAL_STORE__CLEAN_ON_ROLE_RECYCLE:
				return isSetCleanOnRoleRecycle();
			case AzureCSDefPackage.LOCAL_STORE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AzureCSDefPackage.LOCAL_STORE__SIZE_IN_MB:
				return isSetSizeInMB();
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
		result.append(" (cleanOnRoleRecycle: ");
		if (cleanOnRoleRecycleESet) result.append(cleanOnRoleRecycle); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", sizeInMB: ");
		if (sizeInMBESet) result.append(sizeInMB); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LocalStoreImpl
