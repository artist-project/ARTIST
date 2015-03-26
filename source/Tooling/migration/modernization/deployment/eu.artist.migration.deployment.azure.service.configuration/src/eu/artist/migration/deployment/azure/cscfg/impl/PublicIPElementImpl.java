/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.PublicIPElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Public IP Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.PublicIPElementImpl#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.PublicIPElementImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PublicIPElementImpl extends MinimalEObjectImpl.Container implements PublicIPElement {
	/**
	 * The default value of the '{@link #getIdleTimeoutInMinutes() <em>Idle Timeout In Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdleTimeoutInMinutes()
	 * @generated
	 * @ordered
	 */
	protected static final int IDLE_TIMEOUT_IN_MINUTES_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIdleTimeoutInMinutes() <em>Idle Timeout In Minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdleTimeoutInMinutes()
	 * @generated
	 * @ordered
	 */
	protected int idleTimeoutInMinutes = IDLE_TIMEOUT_IN_MINUTES_EDEFAULT;

	/**
	 * This is true if the Idle Timeout In Minutes attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean idleTimeoutInMinutesESet;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PublicIPElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.PUBLIC_IP_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIdleTimeoutInMinutes() {
		return idleTimeoutInMinutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdleTimeoutInMinutes(int newIdleTimeoutInMinutes) {
		int oldIdleTimeoutInMinutes = idleTimeoutInMinutes;
		idleTimeoutInMinutes = newIdleTimeoutInMinutes;
		boolean oldIdleTimeoutInMinutesESet = idleTimeoutInMinutesESet;
		idleTimeoutInMinutesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.PUBLIC_IP_ELEMENT__IDLE_TIMEOUT_IN_MINUTES, oldIdleTimeoutInMinutes, idleTimeoutInMinutes, !oldIdleTimeoutInMinutesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIdleTimeoutInMinutes() {
		int oldIdleTimeoutInMinutes = idleTimeoutInMinutes;
		boolean oldIdleTimeoutInMinutesESet = idleTimeoutInMinutesESet;
		idleTimeoutInMinutes = IDLE_TIMEOUT_IN_MINUTES_EDEFAULT;
		idleTimeoutInMinutesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSCfgPackage.PUBLIC_IP_ELEMENT__IDLE_TIMEOUT_IN_MINUTES, oldIdleTimeoutInMinutes, IDLE_TIMEOUT_IN_MINUTES_EDEFAULT, oldIdleTimeoutInMinutesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIdleTimeoutInMinutes() {
		return idleTimeoutInMinutesESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.PUBLIC_IP_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AzureCSCfgPackage.PUBLIC_IP_ELEMENT__IDLE_TIMEOUT_IN_MINUTES:
				return getIdleTimeoutInMinutes();
			case AzureCSCfgPackage.PUBLIC_IP_ELEMENT__NAME:
				return getName();
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
			case AzureCSCfgPackage.PUBLIC_IP_ELEMENT__IDLE_TIMEOUT_IN_MINUTES:
				setIdleTimeoutInMinutes((Integer)newValue);
				return;
			case AzureCSCfgPackage.PUBLIC_IP_ELEMENT__NAME:
				setName((String)newValue);
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
			case AzureCSCfgPackage.PUBLIC_IP_ELEMENT__IDLE_TIMEOUT_IN_MINUTES:
				unsetIdleTimeoutInMinutes();
				return;
			case AzureCSCfgPackage.PUBLIC_IP_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case AzureCSCfgPackage.PUBLIC_IP_ELEMENT__IDLE_TIMEOUT_IN_MINUTES:
				return isSetIdleTimeoutInMinutes();
			case AzureCSCfgPackage.PUBLIC_IP_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (idleTimeoutInMinutes: ");
		if (idleTimeoutInMinutesESet) result.append(idleTimeoutInMinutes); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PublicIPElementImpl
