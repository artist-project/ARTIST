/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.LoadBalancerProbes;
import eu.artist.migration.deployment.azure.csdef.NetworkTrafficRules;
import eu.artist.migration.deployment.azure.csdef.SchemaVersion;
import eu.artist.migration.deployment.azure.csdef.ServiceDefinition;
import eu.artist.migration.deployment.azure.csdef.TopologyChangeDiscovery;
import eu.artist.migration.deployment.azure.csdef.WebRole;
import eu.artist.migration.deployment.azure.csdef.WorkerRole;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.ServiceDefinitionImpl#getLoadBalancerProbes <em>Load Balancer Probes</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.ServiceDefinitionImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.ServiceDefinitionImpl#getWebRole <em>Web Role</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.ServiceDefinitionImpl#getWorkerRole <em>Worker Role</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.ServiceDefinitionImpl#getNetworkTrafficRules <em>Network Traffic Rules</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.ServiceDefinitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.ServiceDefinitionImpl#getSchemaVersion <em>Schema Version</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.ServiceDefinitionImpl#getTopologyChangeDiscovery <em>Topology Change Discovery</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.ServiceDefinitionImpl#getUpgradeDomainCount <em>Upgrade Domain Count</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceDefinitionImpl extends MinimalEObjectImpl.Container implements ServiceDefinition {
	/**
	 * The cached value of the '{@link #getLoadBalancerProbes() <em>Load Balancer Probes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancerProbes()
	 * @generated
	 * @ordered
	 */
	protected LoadBalancerProbes loadBalancerProbes;

	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getNetworkTrafficRules() <em>Network Traffic Rules</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkTrafficRules()
	 * @generated
	 * @ordered
	 */
	protected NetworkTrafficRules networkTrafficRules;

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
	 * The default value of the '{@link #getTopologyChangeDiscovery() <em>Topology Change Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyChangeDiscovery()
	 * @generated
	 * @ordered
	 */
	protected static final TopologyChangeDiscovery TOPOLOGY_CHANGE_DISCOVERY_EDEFAULT = TopologyChangeDiscovery.UPGRADE_DOMAIN_WALK;

	/**
	 * The cached value of the '{@link #getTopologyChangeDiscovery() <em>Topology Change Discovery</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTopologyChangeDiscovery()
	 * @generated
	 * @ordered
	 */
	protected TopologyChangeDiscovery topologyChangeDiscovery = TOPOLOGY_CHANGE_DISCOVERY_EDEFAULT;

	/**
	 * This is true if the Topology Change Discovery attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean topologyChangeDiscoveryESet;

	/**
	 * The default value of the '{@link #getUpgradeDomainCount() <em>Upgrade Domain Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeDomainCount()
	 * @generated
	 * @ordered
	 */
	protected static final int UPGRADE_DOMAIN_COUNT_EDEFAULT = 5;

	/**
	 * The cached value of the '{@link #getUpgradeDomainCount() <em>Upgrade Domain Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpgradeDomainCount()
	 * @generated
	 * @ordered
	 */
	protected int upgradeDomainCount = UPGRADE_DOMAIN_COUNT_EDEFAULT;

	/**
	 * This is true if the Upgrade Domain Count attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean upgradeDomainCountESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.SERVICE_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadBalancerProbes getLoadBalancerProbes() {
		return loadBalancerProbes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLoadBalancerProbes(LoadBalancerProbes newLoadBalancerProbes, NotificationChain msgs) {
		LoadBalancerProbes oldLoadBalancerProbes = loadBalancerProbes;
		loadBalancerProbes = newLoadBalancerProbes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.SERVICE_DEFINITION__LOAD_BALANCER_PROBES, oldLoadBalancerProbes, newLoadBalancerProbes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadBalancerProbes(LoadBalancerProbes newLoadBalancerProbes) {
		if (newLoadBalancerProbes != loadBalancerProbes) {
			NotificationChain msgs = null;
			if (loadBalancerProbes != null)
				msgs = ((InternalEObject)loadBalancerProbes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.SERVICE_DEFINITION__LOAD_BALANCER_PROBES, null, msgs);
			if (newLoadBalancerProbes != null)
				msgs = ((InternalEObject)newLoadBalancerProbes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.SERVICE_DEFINITION__LOAD_BALANCER_PROBES, null, msgs);
			msgs = basicSetLoadBalancerProbes(newLoadBalancerProbes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.SERVICE_DEFINITION__LOAD_BALANCER_PROBES, newLoadBalancerProbes, newLoadBalancerProbes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, AzureCSDefPackage.SERVICE_DEFINITION__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WebRole> getWebRole() {
		return getGroup().list(AzureCSDefPackage.Literals.SERVICE_DEFINITION__WEB_ROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkerRole> getWorkerRole() {
		return getGroup().list(AzureCSDefPackage.Literals.SERVICE_DEFINITION__WORKER_ROLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetworkTrafficRules getNetworkTrafficRules() {
		return networkTrafficRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetworkTrafficRules(NetworkTrafficRules newNetworkTrafficRules, NotificationChain msgs) {
		NetworkTrafficRules oldNetworkTrafficRules = networkTrafficRules;
		networkTrafficRules = newNetworkTrafficRules;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.SERVICE_DEFINITION__NETWORK_TRAFFIC_RULES, oldNetworkTrafficRules, newNetworkTrafficRules);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetworkTrafficRules(NetworkTrafficRules newNetworkTrafficRules) {
		if (newNetworkTrafficRules != networkTrafficRules) {
			NotificationChain msgs = null;
			if (networkTrafficRules != null)
				msgs = ((InternalEObject)networkTrafficRules).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.SERVICE_DEFINITION__NETWORK_TRAFFIC_RULES, null, msgs);
			if (newNetworkTrafficRules != null)
				msgs = ((InternalEObject)newNetworkTrafficRules).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.SERVICE_DEFINITION__NETWORK_TRAFFIC_RULES, null, msgs);
			msgs = basicSetNetworkTrafficRules(newNetworkTrafficRules, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.SERVICE_DEFINITION__NETWORK_TRAFFIC_RULES, newNetworkTrafficRules, newNetworkTrafficRules));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.SERVICE_DEFINITION__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.SERVICE_DEFINITION__SCHEMA_VERSION, oldSchemaVersion, schemaVersion, !oldSchemaVersionESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.SERVICE_DEFINITION__SCHEMA_VERSION, oldSchemaVersion, SCHEMA_VERSION_EDEFAULT, oldSchemaVersionESet));
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
	public TopologyChangeDiscovery getTopologyChangeDiscovery() {
		return topologyChangeDiscovery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTopologyChangeDiscovery(TopologyChangeDiscovery newTopologyChangeDiscovery) {
		TopologyChangeDiscovery oldTopologyChangeDiscovery = topologyChangeDiscovery;
		topologyChangeDiscovery = newTopologyChangeDiscovery == null ? TOPOLOGY_CHANGE_DISCOVERY_EDEFAULT : newTopologyChangeDiscovery;
		boolean oldTopologyChangeDiscoveryESet = topologyChangeDiscoveryESet;
		topologyChangeDiscoveryESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.SERVICE_DEFINITION__TOPOLOGY_CHANGE_DISCOVERY, oldTopologyChangeDiscovery, topologyChangeDiscovery, !oldTopologyChangeDiscoveryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTopologyChangeDiscovery() {
		TopologyChangeDiscovery oldTopologyChangeDiscovery = topologyChangeDiscovery;
		boolean oldTopologyChangeDiscoveryESet = topologyChangeDiscoveryESet;
		topologyChangeDiscovery = TOPOLOGY_CHANGE_DISCOVERY_EDEFAULT;
		topologyChangeDiscoveryESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.SERVICE_DEFINITION__TOPOLOGY_CHANGE_DISCOVERY, oldTopologyChangeDiscovery, TOPOLOGY_CHANGE_DISCOVERY_EDEFAULT, oldTopologyChangeDiscoveryESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTopologyChangeDiscovery() {
		return topologyChangeDiscoveryESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getUpgradeDomainCount() {
		return upgradeDomainCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpgradeDomainCount(int newUpgradeDomainCount) {
		int oldUpgradeDomainCount = upgradeDomainCount;
		upgradeDomainCount = newUpgradeDomainCount;
		boolean oldUpgradeDomainCountESet = upgradeDomainCountESet;
		upgradeDomainCountESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.SERVICE_DEFINITION__UPGRADE_DOMAIN_COUNT, oldUpgradeDomainCount, upgradeDomainCount, !oldUpgradeDomainCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUpgradeDomainCount() {
		int oldUpgradeDomainCount = upgradeDomainCount;
		boolean oldUpgradeDomainCountESet = upgradeDomainCountESet;
		upgradeDomainCount = UPGRADE_DOMAIN_COUNT_EDEFAULT;
		upgradeDomainCountESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.SERVICE_DEFINITION__UPGRADE_DOMAIN_COUNT, oldUpgradeDomainCount, UPGRADE_DOMAIN_COUNT_EDEFAULT, oldUpgradeDomainCountESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUpgradeDomainCount() {
		return upgradeDomainCountESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSDefPackage.SERVICE_DEFINITION__LOAD_BALANCER_PROBES:
				return basicSetLoadBalancerProbes(null, msgs);
			case AzureCSDefPackage.SERVICE_DEFINITION__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case AzureCSDefPackage.SERVICE_DEFINITION__WEB_ROLE:
				return ((InternalEList<?>)getWebRole()).basicRemove(otherEnd, msgs);
			case AzureCSDefPackage.SERVICE_DEFINITION__WORKER_ROLE:
				return ((InternalEList<?>)getWorkerRole()).basicRemove(otherEnd, msgs);
			case AzureCSDefPackage.SERVICE_DEFINITION__NETWORK_TRAFFIC_RULES:
				return basicSetNetworkTrafficRules(null, msgs);
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
			case AzureCSDefPackage.SERVICE_DEFINITION__LOAD_BALANCER_PROBES:
				return getLoadBalancerProbes();
			case AzureCSDefPackage.SERVICE_DEFINITION__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case AzureCSDefPackage.SERVICE_DEFINITION__WEB_ROLE:
				return getWebRole();
			case AzureCSDefPackage.SERVICE_DEFINITION__WORKER_ROLE:
				return getWorkerRole();
			case AzureCSDefPackage.SERVICE_DEFINITION__NETWORK_TRAFFIC_RULES:
				return getNetworkTrafficRules();
			case AzureCSDefPackage.SERVICE_DEFINITION__NAME:
				return getName();
			case AzureCSDefPackage.SERVICE_DEFINITION__SCHEMA_VERSION:
				return getSchemaVersion();
			case AzureCSDefPackage.SERVICE_DEFINITION__TOPOLOGY_CHANGE_DISCOVERY:
				return getTopologyChangeDiscovery();
			case AzureCSDefPackage.SERVICE_DEFINITION__UPGRADE_DOMAIN_COUNT:
				return getUpgradeDomainCount();
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
			case AzureCSDefPackage.SERVICE_DEFINITION__LOAD_BALANCER_PROBES:
				setLoadBalancerProbes((LoadBalancerProbes)newValue);
				return;
			case AzureCSDefPackage.SERVICE_DEFINITION__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case AzureCSDefPackage.SERVICE_DEFINITION__WEB_ROLE:
				getWebRole().clear();
				getWebRole().addAll((Collection<? extends WebRole>)newValue);
				return;
			case AzureCSDefPackage.SERVICE_DEFINITION__WORKER_ROLE:
				getWorkerRole().clear();
				getWorkerRole().addAll((Collection<? extends WorkerRole>)newValue);
				return;
			case AzureCSDefPackage.SERVICE_DEFINITION__NETWORK_TRAFFIC_RULES:
				setNetworkTrafficRules((NetworkTrafficRules)newValue);
				return;
			case AzureCSDefPackage.SERVICE_DEFINITION__NAME:
				setName((String)newValue);
				return;
			case AzureCSDefPackage.SERVICE_DEFINITION__SCHEMA_VERSION:
				setSchemaVersion((SchemaVersion)newValue);
				return;
			case AzureCSDefPackage.SERVICE_DEFINITION__TOPOLOGY_CHANGE_DISCOVERY:
				setTopologyChangeDiscovery((TopologyChangeDiscovery)newValue);
				return;
			case AzureCSDefPackage.SERVICE_DEFINITION__UPGRADE_DOMAIN_COUNT:
				setUpgradeDomainCount((Integer)newValue);
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
			case AzureCSDefPackage.SERVICE_DEFINITION__LOAD_BALANCER_PROBES:
				setLoadBalancerProbes((LoadBalancerProbes)null);
				return;
			case AzureCSDefPackage.SERVICE_DEFINITION__GROUP:
				getGroup().clear();
				return;
			case AzureCSDefPackage.SERVICE_DEFINITION__WEB_ROLE:
				getWebRole().clear();
				return;
			case AzureCSDefPackage.SERVICE_DEFINITION__WORKER_ROLE:
				getWorkerRole().clear();
				return;
			case AzureCSDefPackage.SERVICE_DEFINITION__NETWORK_TRAFFIC_RULES:
				setNetworkTrafficRules((NetworkTrafficRules)null);
				return;
			case AzureCSDefPackage.SERVICE_DEFINITION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AzureCSDefPackage.SERVICE_DEFINITION__SCHEMA_VERSION:
				unsetSchemaVersion();
				return;
			case AzureCSDefPackage.SERVICE_DEFINITION__TOPOLOGY_CHANGE_DISCOVERY:
				unsetTopologyChangeDiscovery();
				return;
			case AzureCSDefPackage.SERVICE_DEFINITION__UPGRADE_DOMAIN_COUNT:
				unsetUpgradeDomainCount();
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
			case AzureCSDefPackage.SERVICE_DEFINITION__LOAD_BALANCER_PROBES:
				return loadBalancerProbes != null;
			case AzureCSDefPackage.SERVICE_DEFINITION__GROUP:
				return group != null && !group.isEmpty();
			case AzureCSDefPackage.SERVICE_DEFINITION__WEB_ROLE:
				return !getWebRole().isEmpty();
			case AzureCSDefPackage.SERVICE_DEFINITION__WORKER_ROLE:
				return !getWorkerRole().isEmpty();
			case AzureCSDefPackage.SERVICE_DEFINITION__NETWORK_TRAFFIC_RULES:
				return networkTrafficRules != null;
			case AzureCSDefPackage.SERVICE_DEFINITION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AzureCSDefPackage.SERVICE_DEFINITION__SCHEMA_VERSION:
				return isSetSchemaVersion();
			case AzureCSDefPackage.SERVICE_DEFINITION__TOPOLOGY_CHANGE_DISCOVERY:
				return isSetTopologyChangeDiscovery();
			case AzureCSDefPackage.SERVICE_DEFINITION__UPGRADE_DOMAIN_COUNT:
				return isSetUpgradeDomainCount();
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
		result.append(" (group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(", schemaVersion: ");
		if (schemaVersionESet) result.append(schemaVersion); else result.append("<unset>");
		result.append(", topologyChangeDiscovery: ");
		if (topologyChangeDiscoveryESet) result.append(topologyChangeDiscovery); else result.append("<unset>");
		result.append(", upgradeDomainCount: ");
		if (upgradeDomainCountESet) result.append(upgradeDomainCount); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //ServiceDefinitionImpl
