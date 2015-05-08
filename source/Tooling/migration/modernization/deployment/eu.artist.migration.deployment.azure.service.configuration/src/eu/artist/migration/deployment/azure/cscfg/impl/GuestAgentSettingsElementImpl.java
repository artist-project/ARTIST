/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guest Agent Settings Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.GuestAgentSettingsElementImpl#isAllowRoleProcessLocalDumps <em>Allow Role Process Local Dumps</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.GuestAgentSettingsElementImpl#isCleanupFirewallOnRoleRestart <em>Cleanup Firewall On Role Restart</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GuestAgentSettingsElementImpl extends MinimalEObjectImpl.Container implements GuestAgentSettingsElement {
	/**
	 * The default value of the '{@link #isAllowRoleProcessLocalDumps() <em>Allow Role Process Local Dumps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowRoleProcessLocalDumps()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ALLOW_ROLE_PROCESS_LOCAL_DUMPS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAllowRoleProcessLocalDumps() <em>Allow Role Process Local Dumps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAllowRoleProcessLocalDumps()
	 * @generated
	 * @ordered
	 */
	protected boolean allowRoleProcessLocalDumps = ALLOW_ROLE_PROCESS_LOCAL_DUMPS_EDEFAULT;

	/**
	 * This is true if the Allow Role Process Local Dumps attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean allowRoleProcessLocalDumpsESet;

	/**
	 * The default value of the '{@link #isCleanupFirewallOnRoleRestart() <em>Cleanup Firewall On Role Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleanupFirewallOnRoleRestart()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLEANUP_FIREWALL_ON_ROLE_RESTART_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isCleanupFirewallOnRoleRestart() <em>Cleanup Firewall On Role Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCleanupFirewallOnRoleRestart()
	 * @generated
	 * @ordered
	 */
	protected boolean cleanupFirewallOnRoleRestart = CLEANUP_FIREWALL_ON_ROLE_RESTART_EDEFAULT;

	/**
	 * This is true if the Cleanup Firewall On Role Restart attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean cleanupFirewallOnRoleRestartESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GuestAgentSettingsElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.GUEST_AGENT_SETTINGS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAllowRoleProcessLocalDumps() {
		return allowRoleProcessLocalDumps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowRoleProcessLocalDumps(boolean newAllowRoleProcessLocalDumps) {
		boolean oldAllowRoleProcessLocalDumps = allowRoleProcessLocalDumps;
		allowRoleProcessLocalDumps = newAllowRoleProcessLocalDumps;
		boolean oldAllowRoleProcessLocalDumpsESet = allowRoleProcessLocalDumpsESet;
		allowRoleProcessLocalDumpsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.GUEST_AGENT_SETTINGS_ELEMENT__ALLOW_ROLE_PROCESS_LOCAL_DUMPS, oldAllowRoleProcessLocalDumps, allowRoleProcessLocalDumps, !oldAllowRoleProcessLocalDumpsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAllowRoleProcessLocalDumps() {
		boolean oldAllowRoleProcessLocalDumps = allowRoleProcessLocalDumps;
		boolean oldAllowRoleProcessLocalDumpsESet = allowRoleProcessLocalDumpsESet;
		allowRoleProcessLocalDumps = ALLOW_ROLE_PROCESS_LOCAL_DUMPS_EDEFAULT;
		allowRoleProcessLocalDumpsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSCfgPackage.GUEST_AGENT_SETTINGS_ELEMENT__ALLOW_ROLE_PROCESS_LOCAL_DUMPS, oldAllowRoleProcessLocalDumps, ALLOW_ROLE_PROCESS_LOCAL_DUMPS_EDEFAULT, oldAllowRoleProcessLocalDumpsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllowRoleProcessLocalDumps() {
		return allowRoleProcessLocalDumpsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCleanupFirewallOnRoleRestart() {
		return cleanupFirewallOnRoleRestart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCleanupFirewallOnRoleRestart(boolean newCleanupFirewallOnRoleRestart) {
		boolean oldCleanupFirewallOnRoleRestart = cleanupFirewallOnRoleRestart;
		cleanupFirewallOnRoleRestart = newCleanupFirewallOnRoleRestart;
		boolean oldCleanupFirewallOnRoleRestartESet = cleanupFirewallOnRoleRestartESet;
		cleanupFirewallOnRoleRestartESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.GUEST_AGENT_SETTINGS_ELEMENT__CLEANUP_FIREWALL_ON_ROLE_RESTART, oldCleanupFirewallOnRoleRestart, cleanupFirewallOnRoleRestart, !oldCleanupFirewallOnRoleRestartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCleanupFirewallOnRoleRestart() {
		boolean oldCleanupFirewallOnRoleRestart = cleanupFirewallOnRoleRestart;
		boolean oldCleanupFirewallOnRoleRestartESet = cleanupFirewallOnRoleRestartESet;
		cleanupFirewallOnRoleRestart = CLEANUP_FIREWALL_ON_ROLE_RESTART_EDEFAULT;
		cleanupFirewallOnRoleRestartESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSCfgPackage.GUEST_AGENT_SETTINGS_ELEMENT__CLEANUP_FIREWALL_ON_ROLE_RESTART, oldCleanupFirewallOnRoleRestart, CLEANUP_FIREWALL_ON_ROLE_RESTART_EDEFAULT, oldCleanupFirewallOnRoleRestartESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCleanupFirewallOnRoleRestart() {
		return cleanupFirewallOnRoleRestartESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AzureCSCfgPackage.GUEST_AGENT_SETTINGS_ELEMENT__ALLOW_ROLE_PROCESS_LOCAL_DUMPS:
				return isAllowRoleProcessLocalDumps();
			case AzureCSCfgPackage.GUEST_AGENT_SETTINGS_ELEMENT__CLEANUP_FIREWALL_ON_ROLE_RESTART:
				return isCleanupFirewallOnRoleRestart();
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
			case AzureCSCfgPackage.GUEST_AGENT_SETTINGS_ELEMENT__ALLOW_ROLE_PROCESS_LOCAL_DUMPS:
				setAllowRoleProcessLocalDumps((Boolean)newValue);
				return;
			case AzureCSCfgPackage.GUEST_AGENT_SETTINGS_ELEMENT__CLEANUP_FIREWALL_ON_ROLE_RESTART:
				setCleanupFirewallOnRoleRestart((Boolean)newValue);
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
			case AzureCSCfgPackage.GUEST_AGENT_SETTINGS_ELEMENT__ALLOW_ROLE_PROCESS_LOCAL_DUMPS:
				unsetAllowRoleProcessLocalDumps();
				return;
			case AzureCSCfgPackage.GUEST_AGENT_SETTINGS_ELEMENT__CLEANUP_FIREWALL_ON_ROLE_RESTART:
				unsetCleanupFirewallOnRoleRestart();
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
			case AzureCSCfgPackage.GUEST_AGENT_SETTINGS_ELEMENT__ALLOW_ROLE_PROCESS_LOCAL_DUMPS:
				return isSetAllowRoleProcessLocalDumps();
			case AzureCSCfgPackage.GUEST_AGENT_SETTINGS_ELEMENT__CLEANUP_FIREWALL_ON_ROLE_RESTART:
				return isSetCleanupFirewallOnRoleRestart();
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
		result.append(" (allowRoleProcessLocalDumps: ");
		if (allowRoleProcessLocalDumpsESet) result.append(allowRoleProcessLocalDumps); else result.append("<unset>");
		result.append(", cleanupFirewallOnRoleRestart: ");
		if (cleanupFirewallOnRoleRestartESet) result.append(cleanupFirewallOnRoleRestart); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //GuestAgentSettingsElementImpl
