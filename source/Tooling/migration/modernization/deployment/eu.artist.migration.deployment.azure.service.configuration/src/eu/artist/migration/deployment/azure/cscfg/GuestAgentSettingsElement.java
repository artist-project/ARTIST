/**
 */
package eu.artist.migration.deployment.azure.cscfg;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guest Agent Settings Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement#isAllowRoleProcessLocalDumps <em>Allow Role Process Local Dumps</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement#isCleanupFirewallOnRoleRestart <em>Cleanup Firewall On Role Restart</em>}</li>
 * </ul>
 * </p>
 *
 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getGuestAgentSettingsElement()
 * @model extendedMetaData="name='GuestAgentSettingsElement' kind='empty'"
 * @generated
 */
public interface GuestAgentSettingsElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Allow Role Process Local Dumps</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The flag to specify if crashing role processes dumps will be saved locally. Default value is false.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Allow Role Process Local Dumps</em>' attribute.
	 * @see #isSetAllowRoleProcessLocalDumps()
	 * @see #unsetAllowRoleProcessLocalDumps()
	 * @see #setAllowRoleProcessLocalDumps(boolean)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getGuestAgentSettingsElement_AllowRoleProcessLocalDumps()
	 * @model default="false" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='allowRoleProcessLocalDumps'"
	 * @generated
	 */
	boolean isAllowRoleProcessLocalDumps();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement#isAllowRoleProcessLocalDumps <em>Allow Role Process Local Dumps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Allow Role Process Local Dumps</em>' attribute.
	 * @see #isSetAllowRoleProcessLocalDumps()
	 * @see #unsetAllowRoleProcessLocalDumps()
	 * @see #isAllowRoleProcessLocalDumps()
	 * @generated
	 */
	void setAllowRoleProcessLocalDumps(boolean value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement#isAllowRoleProcessLocalDumps <em>Allow Role Process Local Dumps</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetAllowRoleProcessLocalDumps()
	 * @see #isAllowRoleProcessLocalDumps()
	 * @see #setAllowRoleProcessLocalDumps(boolean)
	 * @generated
	 */
	void unsetAllowRoleProcessLocalDumps();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement#isAllowRoleProcessLocalDumps <em>Allow Role Process Local Dumps</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Allow Role Process Local Dumps</em>' attribute is set.
	 * @see #unsetAllowRoleProcessLocalDumps()
	 * @see #isAllowRoleProcessLocalDumps()
	 * @see #setAllowRoleProcessLocalDumps(boolean)
	 * @generated
	 */
	boolean isSetAllowRoleProcessLocalDumps();

	/**
	 * Returns the value of the '<em><b>Cleanup Firewall On Role Restart</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * 
	 *           The flag to specify if firewall rules will be reapplied on role restarts. Default value is true.
	 *         
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Cleanup Firewall On Role Restart</em>' attribute.
	 * @see #isSetCleanupFirewallOnRoleRestart()
	 * @see #unsetCleanupFirewallOnRoleRestart()
	 * @see #setCleanupFirewallOnRoleRestart(boolean)
	 * @see eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage#getGuestAgentSettingsElement_CleanupFirewallOnRoleRestart()
	 * @model default="true" unsettable="true" dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 *        extendedMetaData="kind='attribute' name='cleanupFirewallOnRoleRestart'"
	 * @generated
	 */
	boolean isCleanupFirewallOnRoleRestart();

	/**
	 * Sets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement#isCleanupFirewallOnRoleRestart <em>Cleanup Firewall On Role Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cleanup Firewall On Role Restart</em>' attribute.
	 * @see #isSetCleanupFirewallOnRoleRestart()
	 * @see #unsetCleanupFirewallOnRoleRestart()
	 * @see #isCleanupFirewallOnRoleRestart()
	 * @generated
	 */
	void setCleanupFirewallOnRoleRestart(boolean value);

	/**
	 * Unsets the value of the '{@link eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement#isCleanupFirewallOnRoleRestart <em>Cleanup Firewall On Role Restart</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSetCleanupFirewallOnRoleRestart()
	 * @see #isCleanupFirewallOnRoleRestart()
	 * @see #setCleanupFirewallOnRoleRestart(boolean)
	 * @generated
	 */
	void unsetCleanupFirewallOnRoleRestart();

	/**
	 * Returns whether the value of the '{@link eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement#isCleanupFirewallOnRoleRestart <em>Cleanup Firewall On Role Restart</em>}' attribute is set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return whether the value of the '<em>Cleanup Firewall On Role Restart</em>' attribute is set.
	 * @see #unsetCleanupFirewallOnRoleRestart()
	 * @see #isCleanupFirewallOnRoleRestart()
	 * @see #setCleanupFirewallOnRoleRestart(boolean)
	 * @generated
	 */
	boolean isSetCleanupFirewallOnRoleRestart();

} // GuestAgentSettingsElement
