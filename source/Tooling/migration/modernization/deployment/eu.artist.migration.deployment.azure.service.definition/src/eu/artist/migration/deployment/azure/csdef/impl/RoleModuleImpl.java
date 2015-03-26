/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.Certificates;
import eu.artist.migration.deployment.azure.csdef.ConfigurationSettings;
import eu.artist.migration.deployment.azure.csdef.Endpoints;
import eu.artist.migration.deployment.azure.csdef.LocalResources;
import eu.artist.migration.deployment.azure.csdef.RoleModule;
import eu.artist.migration.deployment.azure.csdef.RuntimeForRoleModule;
import eu.artist.migration.deployment.azure.csdef.Sites;
import eu.artist.migration.deployment.azure.csdef.Startup;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Role Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.RoleModuleImpl#getStartup <em>Startup</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.RoleModuleImpl#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.RoleModuleImpl#getConfigurationSettings <em>Configuration Settings</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.RoleModuleImpl#getEndpoints <em>Endpoints</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.RoleModuleImpl#getLocalResources <em>Local Resources</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.RoleModuleImpl#getCertificates <em>Certificates</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.RoleModuleImpl#getSites <em>Sites</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.RoleModuleImpl#getNamespace <em>Namespace</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RoleModuleImpl extends MinimalEObjectImpl.Container implements RoleModule {
	/**
	 * The cached value of the '{@link #getStartup() <em>Startup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartup()
	 * @generated
	 * @ordered
	 */
	protected Startup startup;

	/**
	 * The cached value of the '{@link #getRuntime() <em>Runtime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected RuntimeForRoleModule runtime;

	/**
	 * The cached value of the '{@link #getConfigurationSettings() <em>Configuration Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationSettings()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationSettings configurationSettings;

	/**
	 * The cached value of the '{@link #getEndpoints() <em>Endpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpoints()
	 * @generated
	 * @ordered
	 */
	protected Endpoints endpoints;

	/**
	 * The cached value of the '{@link #getLocalResources() <em>Local Resources</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalResources()
	 * @generated
	 * @ordered
	 */
	protected LocalResources localResources;

	/**
	 * The cached value of the '{@link #getCertificates() <em>Certificates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificates()
	 * @generated
	 * @ordered
	 */
	protected Certificates certificates;

	/**
	 * The cached value of the '{@link #getSites() <em>Sites</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSites()
	 * @generated
	 * @ordered
	 */
	protected Sites sites;

	/**
	 * The default value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected static final String NAMESPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespace()
	 * @generated
	 * @ordered
	 */
	protected String namespace = NAMESPACE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoleModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.ROLE_MODULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Startup getStartup() {
		return startup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartup(Startup newStartup, NotificationChain msgs) {
		Startup oldStartup = startup;
		startup = newStartup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ROLE_MODULE__STARTUP, oldStartup, newStartup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartup(Startup newStartup) {
		if (newStartup != startup) {
			NotificationChain msgs = null;
			if (startup != null)
				msgs = ((InternalEObject)startup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ROLE_MODULE__STARTUP, null, msgs);
			if (newStartup != null)
				msgs = ((InternalEObject)newStartup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ROLE_MODULE__STARTUP, null, msgs);
			msgs = basicSetStartup(newStartup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ROLE_MODULE__STARTUP, newStartup, newStartup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RuntimeForRoleModule getRuntime() {
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntime(RuntimeForRoleModule newRuntime, NotificationChain msgs) {
		RuntimeForRoleModule oldRuntime = runtime;
		runtime = newRuntime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ROLE_MODULE__RUNTIME, oldRuntime, newRuntime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntime(RuntimeForRoleModule newRuntime) {
		if (newRuntime != runtime) {
			NotificationChain msgs = null;
			if (runtime != null)
				msgs = ((InternalEObject)runtime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ROLE_MODULE__RUNTIME, null, msgs);
			if (newRuntime != null)
				msgs = ((InternalEObject)newRuntime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ROLE_MODULE__RUNTIME, null, msgs);
			msgs = basicSetRuntime(newRuntime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ROLE_MODULE__RUNTIME, newRuntime, newRuntime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigurationSettings getConfigurationSettings() {
		return configurationSettings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfigurationSettings(ConfigurationSettings newConfigurationSettings, NotificationChain msgs) {
		ConfigurationSettings oldConfigurationSettings = configurationSettings;
		configurationSettings = newConfigurationSettings;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ROLE_MODULE__CONFIGURATION_SETTINGS, oldConfigurationSettings, newConfigurationSettings);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfigurationSettings(ConfigurationSettings newConfigurationSettings) {
		if (newConfigurationSettings != configurationSettings) {
			NotificationChain msgs = null;
			if (configurationSettings != null)
				msgs = ((InternalEObject)configurationSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ROLE_MODULE__CONFIGURATION_SETTINGS, null, msgs);
			if (newConfigurationSettings != null)
				msgs = ((InternalEObject)newConfigurationSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ROLE_MODULE__CONFIGURATION_SETTINGS, null, msgs);
			msgs = basicSetConfigurationSettings(newConfigurationSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ROLE_MODULE__CONFIGURATION_SETTINGS, newConfigurationSettings, newConfigurationSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Endpoints getEndpoints() {
		return endpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndpoints(Endpoints newEndpoints, NotificationChain msgs) {
		Endpoints oldEndpoints = endpoints;
		endpoints = newEndpoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ROLE_MODULE__ENDPOINTS, oldEndpoints, newEndpoints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpoints(Endpoints newEndpoints) {
		if (newEndpoints != endpoints) {
			NotificationChain msgs = null;
			if (endpoints != null)
				msgs = ((InternalEObject)endpoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ROLE_MODULE__ENDPOINTS, null, msgs);
			if (newEndpoints != null)
				msgs = ((InternalEObject)newEndpoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ROLE_MODULE__ENDPOINTS, null, msgs);
			msgs = basicSetEndpoints(newEndpoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ROLE_MODULE__ENDPOINTS, newEndpoints, newEndpoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalResources getLocalResources() {
		return localResources;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalResources(LocalResources newLocalResources, NotificationChain msgs) {
		LocalResources oldLocalResources = localResources;
		localResources = newLocalResources;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ROLE_MODULE__LOCAL_RESOURCES, oldLocalResources, newLocalResources);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalResources(LocalResources newLocalResources) {
		if (newLocalResources != localResources) {
			NotificationChain msgs = null;
			if (localResources != null)
				msgs = ((InternalEObject)localResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ROLE_MODULE__LOCAL_RESOURCES, null, msgs);
			if (newLocalResources != null)
				msgs = ((InternalEObject)newLocalResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ROLE_MODULE__LOCAL_RESOURCES, null, msgs);
			msgs = basicSetLocalResources(newLocalResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ROLE_MODULE__LOCAL_RESOURCES, newLocalResources, newLocalResources));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Certificates getCertificates() {
		return certificates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCertificates(Certificates newCertificates, NotificationChain msgs) {
		Certificates oldCertificates = certificates;
		certificates = newCertificates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ROLE_MODULE__CERTIFICATES, oldCertificates, newCertificates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificates(Certificates newCertificates) {
		if (newCertificates != certificates) {
			NotificationChain msgs = null;
			if (certificates != null)
				msgs = ((InternalEObject)certificates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ROLE_MODULE__CERTIFICATES, null, msgs);
			if (newCertificates != null)
				msgs = ((InternalEObject)newCertificates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ROLE_MODULE__CERTIFICATES, null, msgs);
			msgs = basicSetCertificates(newCertificates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ROLE_MODULE__CERTIFICATES, newCertificates, newCertificates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Sites getSites() {
		return sites;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSites(Sites newSites, NotificationChain msgs) {
		Sites oldSites = sites;
		sites = newSites;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ROLE_MODULE__SITES, oldSites, newSites);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSites(Sites newSites) {
		if (newSites != sites) {
			NotificationChain msgs = null;
			if (sites != null)
				msgs = ((InternalEObject)sites).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ROLE_MODULE__SITES, null, msgs);
			if (newSites != null)
				msgs = ((InternalEObject)newSites).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ROLE_MODULE__SITES, null, msgs);
			msgs = basicSetSites(newSites, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ROLE_MODULE__SITES, newSites, newSites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNamespace() {
		return namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(String newNamespace) {
		String oldNamespace = namespace;
		namespace = newNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ROLE_MODULE__NAMESPACE, oldNamespace, namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSDefPackage.ROLE_MODULE__STARTUP:
				return basicSetStartup(null, msgs);
			case AzureCSDefPackage.ROLE_MODULE__RUNTIME:
				return basicSetRuntime(null, msgs);
			case AzureCSDefPackage.ROLE_MODULE__CONFIGURATION_SETTINGS:
				return basicSetConfigurationSettings(null, msgs);
			case AzureCSDefPackage.ROLE_MODULE__ENDPOINTS:
				return basicSetEndpoints(null, msgs);
			case AzureCSDefPackage.ROLE_MODULE__LOCAL_RESOURCES:
				return basicSetLocalResources(null, msgs);
			case AzureCSDefPackage.ROLE_MODULE__CERTIFICATES:
				return basicSetCertificates(null, msgs);
			case AzureCSDefPackage.ROLE_MODULE__SITES:
				return basicSetSites(null, msgs);
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
			case AzureCSDefPackage.ROLE_MODULE__STARTUP:
				return getStartup();
			case AzureCSDefPackage.ROLE_MODULE__RUNTIME:
				return getRuntime();
			case AzureCSDefPackage.ROLE_MODULE__CONFIGURATION_SETTINGS:
				return getConfigurationSettings();
			case AzureCSDefPackage.ROLE_MODULE__ENDPOINTS:
				return getEndpoints();
			case AzureCSDefPackage.ROLE_MODULE__LOCAL_RESOURCES:
				return getLocalResources();
			case AzureCSDefPackage.ROLE_MODULE__CERTIFICATES:
				return getCertificates();
			case AzureCSDefPackage.ROLE_MODULE__SITES:
				return getSites();
			case AzureCSDefPackage.ROLE_MODULE__NAMESPACE:
				return getNamespace();
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
			case AzureCSDefPackage.ROLE_MODULE__STARTUP:
				setStartup((Startup)newValue);
				return;
			case AzureCSDefPackage.ROLE_MODULE__RUNTIME:
				setRuntime((RuntimeForRoleModule)newValue);
				return;
			case AzureCSDefPackage.ROLE_MODULE__CONFIGURATION_SETTINGS:
				setConfigurationSettings((ConfigurationSettings)newValue);
				return;
			case AzureCSDefPackage.ROLE_MODULE__ENDPOINTS:
				setEndpoints((Endpoints)newValue);
				return;
			case AzureCSDefPackage.ROLE_MODULE__LOCAL_RESOURCES:
				setLocalResources((LocalResources)newValue);
				return;
			case AzureCSDefPackage.ROLE_MODULE__CERTIFICATES:
				setCertificates((Certificates)newValue);
				return;
			case AzureCSDefPackage.ROLE_MODULE__SITES:
				setSites((Sites)newValue);
				return;
			case AzureCSDefPackage.ROLE_MODULE__NAMESPACE:
				setNamespace((String)newValue);
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
			case AzureCSDefPackage.ROLE_MODULE__STARTUP:
				setStartup((Startup)null);
				return;
			case AzureCSDefPackage.ROLE_MODULE__RUNTIME:
				setRuntime((RuntimeForRoleModule)null);
				return;
			case AzureCSDefPackage.ROLE_MODULE__CONFIGURATION_SETTINGS:
				setConfigurationSettings((ConfigurationSettings)null);
				return;
			case AzureCSDefPackage.ROLE_MODULE__ENDPOINTS:
				setEndpoints((Endpoints)null);
				return;
			case AzureCSDefPackage.ROLE_MODULE__LOCAL_RESOURCES:
				setLocalResources((LocalResources)null);
				return;
			case AzureCSDefPackage.ROLE_MODULE__CERTIFICATES:
				setCertificates((Certificates)null);
				return;
			case AzureCSDefPackage.ROLE_MODULE__SITES:
				setSites((Sites)null);
				return;
			case AzureCSDefPackage.ROLE_MODULE__NAMESPACE:
				setNamespace(NAMESPACE_EDEFAULT);
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
			case AzureCSDefPackage.ROLE_MODULE__STARTUP:
				return startup != null;
			case AzureCSDefPackage.ROLE_MODULE__RUNTIME:
				return runtime != null;
			case AzureCSDefPackage.ROLE_MODULE__CONFIGURATION_SETTINGS:
				return configurationSettings != null;
			case AzureCSDefPackage.ROLE_MODULE__ENDPOINTS:
				return endpoints != null;
			case AzureCSDefPackage.ROLE_MODULE__LOCAL_RESOURCES:
				return localResources != null;
			case AzureCSDefPackage.ROLE_MODULE__CERTIFICATES:
				return certificates != null;
			case AzureCSDefPackage.ROLE_MODULE__SITES:
				return sites != null;
			case AzureCSDefPackage.ROLE_MODULE__NAMESPACE:
				return NAMESPACE_EDEFAULT == null ? namespace != null : !NAMESPACE_EDEFAULT.equals(namespace);
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
		result.append(" (namespace: ");
		result.append(namespace);
		result.append(')');
		return result.toString();
	}

} //RoleModuleImpl
