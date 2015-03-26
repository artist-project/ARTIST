/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.GuestAgentSettingsElement;
import eu.artist.migration.deployment.azure.cscfg.NetworkConfigurationElement;
import eu.artist.migration.deployment.azure.cscfg.RoleSettings;
import eu.artist.migration.deployment.azure.cscfg.SchemaVersion;
import eu.artist.migration.deployment.azure.cscfg.ServiceConfiguration;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.ServiceConfigurationImpl#getRole <em>Role</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.ServiceConfigurationImpl#getNetworkConfiguration <em>Network Configuration</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.ServiceConfigurationImpl#getGuestAgentSettings <em>Guest Agent Settings</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.ServiceConfigurationImpl#getOsFamily <em>Os Family</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.ServiceConfigurationImpl#getOsVersion <em>Os Version</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.ServiceConfigurationImpl#getSchemaVersion <em>Schema Version</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.ServiceConfigurationImpl#getServiceName <em>Service Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceConfigurationImpl extends MinimalEObjectImpl.Container implements ServiceConfiguration {
	/**
	 * The cached value of the '{@link #getRole() <em>Role</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRole()
	 * @generated
	 * @ordered
	 */
	protected EList<RoleSettings> role;

	/**
	 * The cached value of the '{@link #getNetworkConfiguration() <em>Network Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkConfiguration()
	 * @generated
	 * @ordered
	 */
	protected NetworkConfigurationElement networkConfiguration;

	/**
	 * The cached value of the '{@link #getGuestAgentSettings() <em>Guest Agent Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuestAgentSettings()
	 * @generated
	 * @ordered
	 */
	protected GuestAgentSettingsElement guestAgentSettings;

	/**
	 * The default value of the '{@link #getOsFamily() <em>Os Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsFamily()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_FAMILY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsFamily() <em>Os Family</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsFamily()
	 * @generated
	 * @ordered
	 */
	protected String osFamily = OS_FAMILY_EDEFAULT;

	/**
	 * The default value of the '{@link #getOsVersion() <em>Os Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String OS_VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOsVersion() <em>Os Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOsVersion()
	 * @generated
	 * @ordered
	 */
	protected String osVersion = OS_VERSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected static final SchemaVersion SCHEMA_VERSION_EDEFAULT = SchemaVersion.UNSPECIFIED;

	/**
	 * The cached value of the '{@link #getSchemaVersion() <em>Schema Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchemaVersion()
	 * @generated
	 * @ordered
	 */
	protected SchemaVersion schemaVersion = SCHEMA_VERSION_EDEFAULT;

	/**
	 * This is true if the Schema Version attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean schemaVersionESet;

	/**
	 * The default value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected static final String SERVICE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getServiceName() <em>Service Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceName()
	 * @generated
	 * @ordered
	 */
	protected String serviceName = SERVICE_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.SERVICE_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RoleSettings> getRole() {
		if (role == null) {
			role = new EObjectContainmentEList<RoleSettings>(RoleSettings.class, this, AzureCSCfgPackage.SERVICE_CONFIGURATION__ROLE);
		}
		return role;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkConfigurationElement getNetworkConfiguration() {
		return networkConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkConfiguration(NetworkConfigurationElement newNetworkConfiguration, NotificationChain msgs) {
		NetworkConfigurationElement oldNetworkConfiguration = networkConfiguration;
		networkConfiguration = newNetworkConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.SERVICE_CONFIGURATION__NETWORK_CONFIGURATION, oldNetworkConfiguration, newNetworkConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkConfiguration(NetworkConfigurationElement newNetworkConfiguration) {
		if (newNetworkConfiguration != networkConfiguration) {
			NotificationChain msgs = null;
			if (networkConfiguration != null)
				msgs = ((InternalEObject)networkConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.SERVICE_CONFIGURATION__NETWORK_CONFIGURATION, null, msgs);
			if (newNetworkConfiguration != null)
				msgs = ((InternalEObject)newNetworkConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.SERVICE_CONFIGURATION__NETWORK_CONFIGURATION, null, msgs);
			msgs = basicSetNetworkConfiguration(newNetworkConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.SERVICE_CONFIGURATION__NETWORK_CONFIGURATION, newNetworkConfiguration, newNetworkConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GuestAgentSettingsElement getGuestAgentSettings() {
		return guestAgentSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuestAgentSettings(GuestAgentSettingsElement newGuestAgentSettings, NotificationChain msgs) {
		GuestAgentSettingsElement oldGuestAgentSettings = guestAgentSettings;
		guestAgentSettings = newGuestAgentSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.SERVICE_CONFIGURATION__GUEST_AGENT_SETTINGS, oldGuestAgentSettings, newGuestAgentSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuestAgentSettings(GuestAgentSettingsElement newGuestAgentSettings) {
		if (newGuestAgentSettings != guestAgentSettings) {
			NotificationChain msgs = null;
			if (guestAgentSettings != null)
				msgs = ((InternalEObject)guestAgentSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.SERVICE_CONFIGURATION__GUEST_AGENT_SETTINGS, null, msgs);
			if (newGuestAgentSettings != null)
				msgs = ((InternalEObject)newGuestAgentSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.SERVICE_CONFIGURATION__GUEST_AGENT_SETTINGS, null, msgs);
			msgs = basicSetGuestAgentSettings(newGuestAgentSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.SERVICE_CONFIGURATION__GUEST_AGENT_SETTINGS, newGuestAgentSettings, newGuestAgentSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsFamily() {
		return osFamily;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsFamily(String newOsFamily) {
		String oldOsFamily = osFamily;
		osFamily = newOsFamily;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.SERVICE_CONFIGURATION__OS_FAMILY, oldOsFamily, osFamily));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOsVersion() {
		return osVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOsVersion(String newOsVersion) {
		String oldOsVersion = osVersion;
		osVersion = newOsVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.SERVICE_CONFIGURATION__OS_VERSION, oldOsVersion, osVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SchemaVersion getSchemaVersion() {
		return schemaVersion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSchemaVersion(SchemaVersion newSchemaVersion) {
		SchemaVersion oldSchemaVersion = schemaVersion;
		schemaVersion = newSchemaVersion == null ? SCHEMA_VERSION_EDEFAULT : newSchemaVersion;
		boolean oldSchemaVersionESet = schemaVersionESet;
		schemaVersionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.SERVICE_CONFIGURATION__SCHEMA_VERSION, oldSchemaVersion, schemaVersion, !oldSchemaVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSchemaVersion() {
		SchemaVersion oldSchemaVersion = schemaVersion;
		boolean oldSchemaVersionESet = schemaVersionESet;
		schemaVersion = SCHEMA_VERSION_EDEFAULT;
		schemaVersionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSCfgPackage.SERVICE_CONFIGURATION__SCHEMA_VERSION, oldSchemaVersion, SCHEMA_VERSION_EDEFAULT, oldSchemaVersionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSchemaVersion() {
		return schemaVersionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getServiceName() {
		return serviceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceName(String newServiceName) {
		String oldServiceName = serviceName;
		serviceName = newServiceName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.SERVICE_CONFIGURATION__SERVICE_NAME, oldServiceName, serviceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__ROLE:
				return ((InternalEList<?>)getRole()).basicRemove(otherEnd, msgs);
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__NETWORK_CONFIGURATION:
				return basicSetNetworkConfiguration(null, msgs);
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__GUEST_AGENT_SETTINGS:
				return basicSetGuestAgentSettings(null, msgs);
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
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__ROLE:
				return getRole();
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__NETWORK_CONFIGURATION:
				return getNetworkConfiguration();
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__GUEST_AGENT_SETTINGS:
				return getGuestAgentSettings();
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__OS_FAMILY:
				return getOsFamily();
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__OS_VERSION:
				return getOsVersion();
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__SCHEMA_VERSION:
				return getSchemaVersion();
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__SERVICE_NAME:
				return getServiceName();
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
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__ROLE:
				getRole().clear();
				getRole().addAll((Collection<? extends RoleSettings>)newValue);
				return;
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__NETWORK_CONFIGURATION:
				setNetworkConfiguration((NetworkConfigurationElement)newValue);
				return;
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__GUEST_AGENT_SETTINGS:
				setGuestAgentSettings((GuestAgentSettingsElement)newValue);
				return;
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__OS_FAMILY:
				setOsFamily((String)newValue);
				return;
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__OS_VERSION:
				setOsVersion((String)newValue);
				return;
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__SCHEMA_VERSION:
				setSchemaVersion((SchemaVersion)newValue);
				return;
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__SERVICE_NAME:
				setServiceName((String)newValue);
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
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__ROLE:
				getRole().clear();
				return;
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__NETWORK_CONFIGURATION:
				setNetworkConfiguration((NetworkConfigurationElement)null);
				return;
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__GUEST_AGENT_SETTINGS:
				setGuestAgentSettings((GuestAgentSettingsElement)null);
				return;
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__OS_FAMILY:
				setOsFamily(OS_FAMILY_EDEFAULT);
				return;
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__OS_VERSION:
				setOsVersion(OS_VERSION_EDEFAULT);
				return;
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__SCHEMA_VERSION:
				unsetSchemaVersion();
				return;
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__SERVICE_NAME:
				setServiceName(SERVICE_NAME_EDEFAULT);
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
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__ROLE:
				return role != null && !role.isEmpty();
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__NETWORK_CONFIGURATION:
				return networkConfiguration != null;
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__GUEST_AGENT_SETTINGS:
				return guestAgentSettings != null;
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__OS_FAMILY:
				return OS_FAMILY_EDEFAULT == null ? osFamily != null : !OS_FAMILY_EDEFAULT.equals(osFamily);
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__OS_VERSION:
				return OS_VERSION_EDEFAULT == null ? osVersion != null : !OS_VERSION_EDEFAULT.equals(osVersion);
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__SCHEMA_VERSION:
				return isSetSchemaVersion();
			case AzureCSCfgPackage.SERVICE_CONFIGURATION__SERVICE_NAME:
				return SERVICE_NAME_EDEFAULT == null ? serviceName != null : !SERVICE_NAME_EDEFAULT.equals(serviceName);
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
		result.append(" (osFamily: ");
		result.append(osFamily);
		result.append(", osVersion: ");
		result.append(osVersion);
		result.append(", schemaVersion: ");
		if (schemaVersionESet) result.append(schemaVersion); else result.append("<unset>");
		result.append(", serviceName: ");
		result.append(serviceName);
		result.append(')');
		return result.toString();
	}

} //ServiceConfigurationImpl
