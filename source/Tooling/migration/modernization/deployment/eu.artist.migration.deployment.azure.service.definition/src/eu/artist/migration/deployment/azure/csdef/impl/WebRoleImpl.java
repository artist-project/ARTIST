/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.Certificates;
import eu.artist.migration.deployment.azure.csdef.ConfigurationSettings;
import eu.artist.migration.deployment.azure.csdef.ContentsElement;
import eu.artist.migration.deployment.azure.csdef.Endpoints;
import eu.artist.migration.deployment.azure.csdef.Imports;
import eu.artist.migration.deployment.azure.csdef.InputEndpointsType;
import eu.artist.migration.deployment.azure.csdef.InternalEndpointType;
import eu.artist.migration.deployment.azure.csdef.LocalResources;
import eu.artist.migration.deployment.azure.csdef.LocalStore;
import eu.artist.migration.deployment.azure.csdef.Sites;
import eu.artist.migration.deployment.azure.csdef.Startup;
import eu.artist.migration.deployment.azure.csdef.WebRole;
import eu.artist.migration.deployment.azure.csdef.WebRuntime;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Web Role</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl#getImports <em>Imports</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl#getStartup <em>Startup</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl#getLocalStorage <em>Local Storage</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl#getLocalResources <em>Local Resources</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl#getConfigurationSettings <em>Configuration Settings</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl#getInputEndpoints <em>Input Endpoints</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl#getInternalEndpoint <em>Internal Endpoint</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl#getEndpoints <em>Endpoints</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl#getCertificates <em>Certificates</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl#getSites <em>Sites</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl#getRuntime <em>Runtime</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl#isEnableNativeCodeExecution <em>Enable Native Code Execution</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WebRoleImpl#getVmsize <em>Vmsize</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WebRoleImpl extends MinimalEObjectImpl.Container implements WebRole {
	/**
	 * The cached value of the '{@link #getImports() <em>Imports</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImports()
	 * @generated
	 * @ordered
	 */
	protected Imports imports;

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
	 * The cached value of the '{@link #getLocalStorage() <em>Local Storage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalStorage()
	 * @generated
	 * @ordered
	 */
	protected LocalStore localStorage;

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
	 * The cached value of the '{@link #getConfigurationSettings() <em>Configuration Settings</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurationSettings()
	 * @generated
	 * @ordered
	 */
	protected ConfigurationSettings configurationSettings;

	/**
	 * The cached value of the '{@link #getInputEndpoints() <em>Input Endpoints</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInputEndpoints()
	 * @generated
	 * @ordered
	 */
	protected InputEndpointsType inputEndpoints;

	/**
	 * The cached value of the '{@link #getInternalEndpoint() <em>Internal Endpoint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalEndpoint()
	 * @generated
	 * @ordered
	 */
	protected InternalEndpointType internalEndpoint;

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
	 * The cached value of the '{@link #getRuntime() <em>Runtime</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuntime()
	 * @generated
	 * @ordered
	 */
	protected WebRuntime runtime;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected ContentsElement contents;

	/**
	 * The default value of the '{@link #isEnableNativeCodeExecution() <em>Enable Native Code Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableNativeCodeExecution()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ENABLE_NATIVE_CODE_EXECUTION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isEnableNativeCodeExecution() <em>Enable Native Code Execution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnableNativeCodeExecution()
	 * @generated
	 * @ordered
	 */
	protected boolean enableNativeCodeExecution = ENABLE_NATIVE_CODE_EXECUTION_EDEFAULT;

	/**
	 * This is true if the Enable Native Code Execution attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean enableNativeCodeExecutionESet;

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
	 * The default value of the '{@link #getVmsize() <em>Vmsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmsize()
	 * @generated
	 * @ordered
	 */
	protected static final String VMSIZE_EDEFAULT = "Small";

	/**
	 * The cached value of the '{@link #getVmsize() <em>Vmsize</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVmsize()
	 * @generated
	 * @ordered
	 */
	protected String vmsize = VMSIZE_EDEFAULT;

	/**
	 * This is true if the Vmsize attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean vmsizeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WebRoleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.WEB_ROLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Imports getImports() {
		return imports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImports(Imports newImports, NotificationChain msgs) {
		Imports oldImports = imports;
		imports = newImports;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__IMPORTS, oldImports, newImports);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImports(Imports newImports) {
		if (newImports != imports) {
			NotificationChain msgs = null;
			if (imports != null)
				msgs = ((InternalEObject)imports).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__IMPORTS, null, msgs);
			if (newImports != null)
				msgs = ((InternalEObject)newImports).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__IMPORTS, null, msgs);
			msgs = basicSetImports(newImports, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__IMPORTS, newImports, newImports));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__STARTUP, oldStartup, newStartup);
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
				msgs = ((InternalEObject)startup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__STARTUP, null, msgs);
			if (newStartup != null)
				msgs = ((InternalEObject)newStartup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__STARTUP, null, msgs);
			msgs = basicSetStartup(newStartup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__STARTUP, newStartup, newStartup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalStore getLocalStorage() {
		return localStorage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalStorage(LocalStore newLocalStorage, NotificationChain msgs) {
		LocalStore oldLocalStorage = localStorage;
		localStorage = newLocalStorage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__LOCAL_STORAGE, oldLocalStorage, newLocalStorage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalStorage(LocalStore newLocalStorage) {
		if (newLocalStorage != localStorage) {
			NotificationChain msgs = null;
			if (localStorage != null)
				msgs = ((InternalEObject)localStorage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__LOCAL_STORAGE, null, msgs);
			if (newLocalStorage != null)
				msgs = ((InternalEObject)newLocalStorage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__LOCAL_STORAGE, null, msgs);
			msgs = basicSetLocalStorage(newLocalStorage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__LOCAL_STORAGE, newLocalStorage, newLocalStorage));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__LOCAL_RESOURCES, oldLocalResources, newLocalResources);
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
				msgs = ((InternalEObject)localResources).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__LOCAL_RESOURCES, null, msgs);
			if (newLocalResources != null)
				msgs = ((InternalEObject)newLocalResources).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__LOCAL_RESOURCES, null, msgs);
			msgs = basicSetLocalResources(newLocalResources, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__LOCAL_RESOURCES, newLocalResources, newLocalResources));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__CONFIGURATION_SETTINGS, oldConfigurationSettings, newConfigurationSettings);
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
				msgs = ((InternalEObject)configurationSettings).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__CONFIGURATION_SETTINGS, null, msgs);
			if (newConfigurationSettings != null)
				msgs = ((InternalEObject)newConfigurationSettings).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__CONFIGURATION_SETTINGS, null, msgs);
			msgs = basicSetConfigurationSettings(newConfigurationSettings, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__CONFIGURATION_SETTINGS, newConfigurationSettings, newConfigurationSettings));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputEndpointsType getInputEndpoints() {
		return inputEndpoints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInputEndpoints(InputEndpointsType newInputEndpoints, NotificationChain msgs) {
		InputEndpointsType oldInputEndpoints = inputEndpoints;
		inputEndpoints = newInputEndpoints;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__INPUT_ENDPOINTS, oldInputEndpoints, newInputEndpoints);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInputEndpoints(InputEndpointsType newInputEndpoints) {
		if (newInputEndpoints != inputEndpoints) {
			NotificationChain msgs = null;
			if (inputEndpoints != null)
				msgs = ((InternalEObject)inputEndpoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__INPUT_ENDPOINTS, null, msgs);
			if (newInputEndpoints != null)
				msgs = ((InternalEObject)newInputEndpoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__INPUT_ENDPOINTS, null, msgs);
			msgs = basicSetInputEndpoints(newInputEndpoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__INPUT_ENDPOINTS, newInputEndpoints, newInputEndpoints));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalEndpointType getInternalEndpoint() {
		return internalEndpoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInternalEndpoint(InternalEndpointType newInternalEndpoint, NotificationChain msgs) {
		InternalEndpointType oldInternalEndpoint = internalEndpoint;
		internalEndpoint = newInternalEndpoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__INTERNAL_ENDPOINT, oldInternalEndpoint, newInternalEndpoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInternalEndpoint(InternalEndpointType newInternalEndpoint) {
		if (newInternalEndpoint != internalEndpoint) {
			NotificationChain msgs = null;
			if (internalEndpoint != null)
				msgs = ((InternalEObject)internalEndpoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__INTERNAL_ENDPOINT, null, msgs);
			if (newInternalEndpoint != null)
				msgs = ((InternalEObject)newInternalEndpoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__INTERNAL_ENDPOINT, null, msgs);
			msgs = basicSetInternalEndpoint(newInternalEndpoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__INTERNAL_ENDPOINT, newInternalEndpoint, newInternalEndpoint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__ENDPOINTS, oldEndpoints, newEndpoints);
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
				msgs = ((InternalEObject)endpoints).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__ENDPOINTS, null, msgs);
			if (newEndpoints != null)
				msgs = ((InternalEObject)newEndpoints).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__ENDPOINTS, null, msgs);
			msgs = basicSetEndpoints(newEndpoints, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__ENDPOINTS, newEndpoints, newEndpoints));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__CERTIFICATES, oldCertificates, newCertificates);
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
				msgs = ((InternalEObject)certificates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__CERTIFICATES, null, msgs);
			if (newCertificates != null)
				msgs = ((InternalEObject)newCertificates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__CERTIFICATES, null, msgs);
			msgs = basicSetCertificates(newCertificates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__CERTIFICATES, newCertificates, newCertificates));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__SITES, oldSites, newSites);
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
				msgs = ((InternalEObject)sites).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__SITES, null, msgs);
			if (newSites != null)
				msgs = ((InternalEObject)newSites).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__SITES, null, msgs);
			msgs = basicSetSites(newSites, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__SITES, newSites, newSites));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WebRuntime getRuntime() {
		return runtime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuntime(WebRuntime newRuntime, NotificationChain msgs) {
		WebRuntime oldRuntime = runtime;
		runtime = newRuntime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__RUNTIME, oldRuntime, newRuntime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRuntime(WebRuntime newRuntime) {
		if (newRuntime != runtime) {
			NotificationChain msgs = null;
			if (runtime != null)
				msgs = ((InternalEObject)runtime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__RUNTIME, null, msgs);
			if (newRuntime != null)
				msgs = ((InternalEObject)newRuntime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__RUNTIME, null, msgs);
			msgs = basicSetRuntime(newRuntime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__RUNTIME, newRuntime, newRuntime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContentsElement getContents() {
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContents(ContentsElement newContents, NotificationChain msgs) {
		ContentsElement oldContents = contents;
		contents = newContents;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__CONTENTS, oldContents, newContents);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContents(ContentsElement newContents) {
		if (newContents != contents) {
			NotificationChain msgs = null;
			if (contents != null)
				msgs = ((InternalEObject)contents).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__CONTENTS, null, msgs);
			if (newContents != null)
				msgs = ((InternalEObject)newContents).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WEB_ROLE__CONTENTS, null, msgs);
			msgs = basicSetContents(newContents, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__CONTENTS, newContents, newContents));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEnableNativeCodeExecution() {
		return enableNativeCodeExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableNativeCodeExecution(boolean newEnableNativeCodeExecution) {
		boolean oldEnableNativeCodeExecution = enableNativeCodeExecution;
		enableNativeCodeExecution = newEnableNativeCodeExecution;
		boolean oldEnableNativeCodeExecutionESet = enableNativeCodeExecutionESet;
		enableNativeCodeExecutionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__ENABLE_NATIVE_CODE_EXECUTION, oldEnableNativeCodeExecution, enableNativeCodeExecution, !oldEnableNativeCodeExecutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEnableNativeCodeExecution() {
		boolean oldEnableNativeCodeExecution = enableNativeCodeExecution;
		boolean oldEnableNativeCodeExecutionESet = enableNativeCodeExecutionESet;
		enableNativeCodeExecution = ENABLE_NATIVE_CODE_EXECUTION_EDEFAULT;
		enableNativeCodeExecutionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.WEB_ROLE__ENABLE_NATIVE_CODE_EXECUTION, oldEnableNativeCodeExecution, ENABLE_NATIVE_CODE_EXECUTION_EDEFAULT, oldEnableNativeCodeExecutionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEnableNativeCodeExecution() {
		return enableNativeCodeExecutionESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVmsize() {
		return vmsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVmsize(String newVmsize) {
		String oldVmsize = vmsize;
		vmsize = newVmsize;
		boolean oldVmsizeESet = vmsizeESet;
		vmsizeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WEB_ROLE__VMSIZE, oldVmsize, vmsize, !oldVmsizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetVmsize() {
		String oldVmsize = vmsize;
		boolean oldVmsizeESet = vmsizeESet;
		vmsize = VMSIZE_EDEFAULT;
		vmsizeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.WEB_ROLE__VMSIZE, oldVmsize, VMSIZE_EDEFAULT, oldVmsizeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetVmsize() {
		return vmsizeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSDefPackage.WEB_ROLE__IMPORTS:
				return basicSetImports(null, msgs);
			case AzureCSDefPackage.WEB_ROLE__STARTUP:
				return basicSetStartup(null, msgs);
			case AzureCSDefPackage.WEB_ROLE__LOCAL_STORAGE:
				return basicSetLocalStorage(null, msgs);
			case AzureCSDefPackage.WEB_ROLE__LOCAL_RESOURCES:
				return basicSetLocalResources(null, msgs);
			case AzureCSDefPackage.WEB_ROLE__CONFIGURATION_SETTINGS:
				return basicSetConfigurationSettings(null, msgs);
			case AzureCSDefPackage.WEB_ROLE__INPUT_ENDPOINTS:
				return basicSetInputEndpoints(null, msgs);
			case AzureCSDefPackage.WEB_ROLE__INTERNAL_ENDPOINT:
				return basicSetInternalEndpoint(null, msgs);
			case AzureCSDefPackage.WEB_ROLE__ENDPOINTS:
				return basicSetEndpoints(null, msgs);
			case AzureCSDefPackage.WEB_ROLE__CERTIFICATES:
				return basicSetCertificates(null, msgs);
			case AzureCSDefPackage.WEB_ROLE__SITES:
				return basicSetSites(null, msgs);
			case AzureCSDefPackage.WEB_ROLE__RUNTIME:
				return basicSetRuntime(null, msgs);
			case AzureCSDefPackage.WEB_ROLE__CONTENTS:
				return basicSetContents(null, msgs);
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
			case AzureCSDefPackage.WEB_ROLE__IMPORTS:
				return getImports();
			case AzureCSDefPackage.WEB_ROLE__STARTUP:
				return getStartup();
			case AzureCSDefPackage.WEB_ROLE__LOCAL_STORAGE:
				return getLocalStorage();
			case AzureCSDefPackage.WEB_ROLE__LOCAL_RESOURCES:
				return getLocalResources();
			case AzureCSDefPackage.WEB_ROLE__CONFIGURATION_SETTINGS:
				return getConfigurationSettings();
			case AzureCSDefPackage.WEB_ROLE__INPUT_ENDPOINTS:
				return getInputEndpoints();
			case AzureCSDefPackage.WEB_ROLE__INTERNAL_ENDPOINT:
				return getInternalEndpoint();
			case AzureCSDefPackage.WEB_ROLE__ENDPOINTS:
				return getEndpoints();
			case AzureCSDefPackage.WEB_ROLE__CERTIFICATES:
				return getCertificates();
			case AzureCSDefPackage.WEB_ROLE__SITES:
				return getSites();
			case AzureCSDefPackage.WEB_ROLE__RUNTIME:
				return getRuntime();
			case AzureCSDefPackage.WEB_ROLE__CONTENTS:
				return getContents();
			case AzureCSDefPackage.WEB_ROLE__ENABLE_NATIVE_CODE_EXECUTION:
				return isEnableNativeCodeExecution();
			case AzureCSDefPackage.WEB_ROLE__NAME:
				return getName();
			case AzureCSDefPackage.WEB_ROLE__VMSIZE:
				return getVmsize();
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
			case AzureCSDefPackage.WEB_ROLE__IMPORTS:
				setImports((Imports)newValue);
				return;
			case AzureCSDefPackage.WEB_ROLE__STARTUP:
				setStartup((Startup)newValue);
				return;
			case AzureCSDefPackage.WEB_ROLE__LOCAL_STORAGE:
				setLocalStorage((LocalStore)newValue);
				return;
			case AzureCSDefPackage.WEB_ROLE__LOCAL_RESOURCES:
				setLocalResources((LocalResources)newValue);
				return;
			case AzureCSDefPackage.WEB_ROLE__CONFIGURATION_SETTINGS:
				setConfigurationSettings((ConfigurationSettings)newValue);
				return;
			case AzureCSDefPackage.WEB_ROLE__INPUT_ENDPOINTS:
				setInputEndpoints((InputEndpointsType)newValue);
				return;
			case AzureCSDefPackage.WEB_ROLE__INTERNAL_ENDPOINT:
				setInternalEndpoint((InternalEndpointType)newValue);
				return;
			case AzureCSDefPackage.WEB_ROLE__ENDPOINTS:
				setEndpoints((Endpoints)newValue);
				return;
			case AzureCSDefPackage.WEB_ROLE__CERTIFICATES:
				setCertificates((Certificates)newValue);
				return;
			case AzureCSDefPackage.WEB_ROLE__SITES:
				setSites((Sites)newValue);
				return;
			case AzureCSDefPackage.WEB_ROLE__RUNTIME:
				setRuntime((WebRuntime)newValue);
				return;
			case AzureCSDefPackage.WEB_ROLE__CONTENTS:
				setContents((ContentsElement)newValue);
				return;
			case AzureCSDefPackage.WEB_ROLE__ENABLE_NATIVE_CODE_EXECUTION:
				setEnableNativeCodeExecution((Boolean)newValue);
				return;
			case AzureCSDefPackage.WEB_ROLE__NAME:
				setName((String)newValue);
				return;
			case AzureCSDefPackage.WEB_ROLE__VMSIZE:
				setVmsize((String)newValue);
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
			case AzureCSDefPackage.WEB_ROLE__IMPORTS:
				setImports((Imports)null);
				return;
			case AzureCSDefPackage.WEB_ROLE__STARTUP:
				setStartup((Startup)null);
				return;
			case AzureCSDefPackage.WEB_ROLE__LOCAL_STORAGE:
				setLocalStorage((LocalStore)null);
				return;
			case AzureCSDefPackage.WEB_ROLE__LOCAL_RESOURCES:
				setLocalResources((LocalResources)null);
				return;
			case AzureCSDefPackage.WEB_ROLE__CONFIGURATION_SETTINGS:
				setConfigurationSettings((ConfigurationSettings)null);
				return;
			case AzureCSDefPackage.WEB_ROLE__INPUT_ENDPOINTS:
				setInputEndpoints((InputEndpointsType)null);
				return;
			case AzureCSDefPackage.WEB_ROLE__INTERNAL_ENDPOINT:
				setInternalEndpoint((InternalEndpointType)null);
				return;
			case AzureCSDefPackage.WEB_ROLE__ENDPOINTS:
				setEndpoints((Endpoints)null);
				return;
			case AzureCSDefPackage.WEB_ROLE__CERTIFICATES:
				setCertificates((Certificates)null);
				return;
			case AzureCSDefPackage.WEB_ROLE__SITES:
				setSites((Sites)null);
				return;
			case AzureCSDefPackage.WEB_ROLE__RUNTIME:
				setRuntime((WebRuntime)null);
				return;
			case AzureCSDefPackage.WEB_ROLE__CONTENTS:
				setContents((ContentsElement)null);
				return;
			case AzureCSDefPackage.WEB_ROLE__ENABLE_NATIVE_CODE_EXECUTION:
				unsetEnableNativeCodeExecution();
				return;
			case AzureCSDefPackage.WEB_ROLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AzureCSDefPackage.WEB_ROLE__VMSIZE:
				unsetVmsize();
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
			case AzureCSDefPackage.WEB_ROLE__IMPORTS:
				return imports != null;
			case AzureCSDefPackage.WEB_ROLE__STARTUP:
				return startup != null;
			case AzureCSDefPackage.WEB_ROLE__LOCAL_STORAGE:
				return localStorage != null;
			case AzureCSDefPackage.WEB_ROLE__LOCAL_RESOURCES:
				return localResources != null;
			case AzureCSDefPackage.WEB_ROLE__CONFIGURATION_SETTINGS:
				return configurationSettings != null;
			case AzureCSDefPackage.WEB_ROLE__INPUT_ENDPOINTS:
				return inputEndpoints != null;
			case AzureCSDefPackage.WEB_ROLE__INTERNAL_ENDPOINT:
				return internalEndpoint != null;
			case AzureCSDefPackage.WEB_ROLE__ENDPOINTS:
				return endpoints != null;
			case AzureCSDefPackage.WEB_ROLE__CERTIFICATES:
				return certificates != null;
			case AzureCSDefPackage.WEB_ROLE__SITES:
				return sites != null;
			case AzureCSDefPackage.WEB_ROLE__RUNTIME:
				return runtime != null;
			case AzureCSDefPackage.WEB_ROLE__CONTENTS:
				return contents != null;
			case AzureCSDefPackage.WEB_ROLE__ENABLE_NATIVE_CODE_EXECUTION:
				return isSetEnableNativeCodeExecution();
			case AzureCSDefPackage.WEB_ROLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AzureCSDefPackage.WEB_ROLE__VMSIZE:
				return isSetVmsize();
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
		result.append(" (enableNativeCodeExecution: ");
		if (enableNativeCodeExecutionESet) result.append(enableNativeCodeExecution); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", vmsize: ");
		if (vmsizeESet) result.append(vmsize); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //WebRoleImpl
