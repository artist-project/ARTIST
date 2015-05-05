/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.DistributionType;
import eu.artist.migration.deployment.azure.csdef.InputEndpoint;
import eu.artist.migration.deployment.azure.csdef.Protocol;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InputEndpointImpl#getCertificate <em>Certificate</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InputEndpointImpl#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InputEndpointImpl#isIgnoreRoleInstanceStatus <em>Ignore Role Instance Status</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InputEndpointImpl#getLoadBalancer <em>Load Balancer</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InputEndpointImpl#getLoadBalancerDistribution <em>Load Balancer Distribution</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InputEndpointImpl#getLoadBalancerProbe <em>Load Balancer Probe</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InputEndpointImpl#getLocalPort <em>Local Port</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InputEndpointImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InputEndpointImpl#getPort <em>Port</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InputEndpointImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputEndpointImpl extends MinimalEObjectImpl.Container implements InputEndpoint {
	/**
	 * The default value of the '{@link #getCertificate() <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate()
	 * @generated
	 * @ordered
	 */
	protected static final String CERTIFICATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCertificate() <em>Certificate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCertificate()
	 * @generated
	 * @ordered
	 */
	protected String certificate = CERTIFICATE_EDEFAULT;

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
	 * The default value of the '{@link #isIgnoreRoleInstanceStatus() <em>Ignore Role Instance Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreRoleInstanceStatus()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IGNORE_ROLE_INSTANCE_STATUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIgnoreRoleInstanceStatus() <em>Ignore Role Instance Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIgnoreRoleInstanceStatus()
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreRoleInstanceStatus = IGNORE_ROLE_INSTANCE_STATUS_EDEFAULT;

	/**
	 * This is true if the Ignore Role Instance Status attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean ignoreRoleInstanceStatusESet;

	/**
	 * The default value of the '{@link #getLoadBalancer() <em>Load Balancer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancer()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAD_BALANCER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadBalancer() <em>Load Balancer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancer()
	 * @generated
	 * @ordered
	 */
	protected String loadBalancer = LOAD_BALANCER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLoadBalancerDistribution() <em>Load Balancer Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancerDistribution()
	 * @generated
	 * @ordered
	 */
	protected static final DistributionType LOAD_BALANCER_DISTRIBUTION_EDEFAULT = DistributionType.SOURCE_IP;

	/**
	 * The cached value of the '{@link #getLoadBalancerDistribution() <em>Load Balancer Distribution</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancerDistribution()
	 * @generated
	 * @ordered
	 */
	protected DistributionType loadBalancerDistribution = LOAD_BALANCER_DISTRIBUTION_EDEFAULT;

	/**
	 * This is true if the Load Balancer Distribution attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean loadBalancerDistributionESet;

	/**
	 * The default value of the '{@link #getLoadBalancerProbe() <em>Load Balancer Probe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancerProbe()
	 * @generated
	 * @ordered
	 */
	protected static final String LOAD_BALANCER_PROBE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLoadBalancerProbe() <em>Load Balancer Probe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoadBalancerProbe()
	 * @generated
	 * @ordered
	 */
	protected String loadBalancerProbe = LOAD_BALANCER_PROBE_EDEFAULT;

	/**
	 * The default value of the '{@link #getLocalPort() <em>Local Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPort()
	 * @generated
	 * @ordered
	 */
	protected static final Object LOCAL_PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocalPort() <em>Local Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPort()
	 * @generated
	 * @ordered
	 */
	protected Object localPort = LOCAL_PORT_EDEFAULT;

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
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected int port = PORT_EDEFAULT;

	/**
	 * This is true if the Port attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean portESet;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final Protocol PROTOCOL_EDEFAULT = Protocol.HTTP;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected Protocol protocol = PROTOCOL_EDEFAULT;

	/**
	 * This is true if the Protocol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean protocolESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.INPUT_ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCertificate() {
		return certificate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCertificate(String newCertificate) {
		String oldCertificate = certificate;
		certificate = newCertificate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INPUT_ENDPOINT__CERTIFICATE, oldCertificate, certificate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INPUT_ENDPOINT__IDLE_TIMEOUT_IN_MINUTES, oldIdleTimeoutInMinutes, idleTimeoutInMinutes, !oldIdleTimeoutInMinutesESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.INPUT_ENDPOINT__IDLE_TIMEOUT_IN_MINUTES, oldIdleTimeoutInMinutes, IDLE_TIMEOUT_IN_MINUTES_EDEFAULT, oldIdleTimeoutInMinutesESet));
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
	public boolean isIgnoreRoleInstanceStatus() {
		return ignoreRoleInstanceStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIgnoreRoleInstanceStatus(boolean newIgnoreRoleInstanceStatus) {
		boolean oldIgnoreRoleInstanceStatus = ignoreRoleInstanceStatus;
		ignoreRoleInstanceStatus = newIgnoreRoleInstanceStatus;
		boolean oldIgnoreRoleInstanceStatusESet = ignoreRoleInstanceStatusESet;
		ignoreRoleInstanceStatusESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INPUT_ENDPOINT__IGNORE_ROLE_INSTANCE_STATUS, oldIgnoreRoleInstanceStatus, ignoreRoleInstanceStatus, !oldIgnoreRoleInstanceStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIgnoreRoleInstanceStatus() {
		boolean oldIgnoreRoleInstanceStatus = ignoreRoleInstanceStatus;
		boolean oldIgnoreRoleInstanceStatusESet = ignoreRoleInstanceStatusESet;
		ignoreRoleInstanceStatus = IGNORE_ROLE_INSTANCE_STATUS_EDEFAULT;
		ignoreRoleInstanceStatusESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.INPUT_ENDPOINT__IGNORE_ROLE_INSTANCE_STATUS, oldIgnoreRoleInstanceStatus, IGNORE_ROLE_INSTANCE_STATUS_EDEFAULT, oldIgnoreRoleInstanceStatusESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIgnoreRoleInstanceStatus() {
		return ignoreRoleInstanceStatusESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoadBalancer() {
		return loadBalancer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadBalancer(String newLoadBalancer) {
		String oldLoadBalancer = loadBalancer;
		loadBalancer = newLoadBalancer;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INPUT_ENDPOINT__LOAD_BALANCER, oldLoadBalancer, loadBalancer));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DistributionType getLoadBalancerDistribution() {
		return loadBalancerDistribution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadBalancerDistribution(DistributionType newLoadBalancerDistribution) {
		DistributionType oldLoadBalancerDistribution = loadBalancerDistribution;
		loadBalancerDistribution = newLoadBalancerDistribution == null ? LOAD_BALANCER_DISTRIBUTION_EDEFAULT : newLoadBalancerDistribution;
		boolean oldLoadBalancerDistributionESet = loadBalancerDistributionESet;
		loadBalancerDistributionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INPUT_ENDPOINT__LOAD_BALANCER_DISTRIBUTION, oldLoadBalancerDistribution, loadBalancerDistribution, !oldLoadBalancerDistributionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLoadBalancerDistribution() {
		DistributionType oldLoadBalancerDistribution = loadBalancerDistribution;
		boolean oldLoadBalancerDistributionESet = loadBalancerDistributionESet;
		loadBalancerDistribution = LOAD_BALANCER_DISTRIBUTION_EDEFAULT;
		loadBalancerDistributionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.INPUT_ENDPOINT__LOAD_BALANCER_DISTRIBUTION, oldLoadBalancerDistribution, LOAD_BALANCER_DISTRIBUTION_EDEFAULT, oldLoadBalancerDistributionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLoadBalancerDistribution() {
		return loadBalancerDistributionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLoadBalancerProbe() {
		return loadBalancerProbe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLoadBalancerProbe(String newLoadBalancerProbe) {
		String oldLoadBalancerProbe = loadBalancerProbe;
		loadBalancerProbe = newLoadBalancerProbe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INPUT_ENDPOINT__LOAD_BALANCER_PROBE, oldLoadBalancerProbe, loadBalancerProbe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getLocalPort() {
		return localPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalPort(Object newLocalPort) {
		Object oldLocalPort = localPort;
		localPort = newLocalPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INPUT_ENDPOINT__LOCAL_PORT, oldLocalPort, localPort));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INPUT_ENDPOINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(int newPort) {
		int oldPort = port;
		port = newPort;
		boolean oldPortESet = portESet;
		portESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INPUT_ENDPOINT__PORT, oldPort, port, !oldPortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPort() {
		int oldPort = port;
		boolean oldPortESet = portESet;
		port = PORT_EDEFAULT;
		portESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.INPUT_ENDPOINT__PORT, oldPort, PORT_EDEFAULT, oldPortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPort() {
		return portESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Protocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(Protocol newProtocol) {
		Protocol oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		boolean oldProtocolESet = protocolESet;
		protocolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INPUT_ENDPOINT__PROTOCOL, oldProtocol, protocol, !oldProtocolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtocol() {
		Protocol oldProtocol = protocol;
		boolean oldProtocolESet = protocolESet;
		protocol = PROTOCOL_EDEFAULT;
		protocolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.INPUT_ENDPOINT__PROTOCOL, oldProtocol, PROTOCOL_EDEFAULT, oldProtocolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetProtocol() {
		return protocolESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AzureCSDefPackage.INPUT_ENDPOINT__CERTIFICATE:
				return getCertificate();
			case AzureCSDefPackage.INPUT_ENDPOINT__IDLE_TIMEOUT_IN_MINUTES:
				return getIdleTimeoutInMinutes();
			case AzureCSDefPackage.INPUT_ENDPOINT__IGNORE_ROLE_INSTANCE_STATUS:
				return isIgnoreRoleInstanceStatus();
			case AzureCSDefPackage.INPUT_ENDPOINT__LOAD_BALANCER:
				return getLoadBalancer();
			case AzureCSDefPackage.INPUT_ENDPOINT__LOAD_BALANCER_DISTRIBUTION:
				return getLoadBalancerDistribution();
			case AzureCSDefPackage.INPUT_ENDPOINT__LOAD_BALANCER_PROBE:
				return getLoadBalancerProbe();
			case AzureCSDefPackage.INPUT_ENDPOINT__LOCAL_PORT:
				return getLocalPort();
			case AzureCSDefPackage.INPUT_ENDPOINT__NAME:
				return getName();
			case AzureCSDefPackage.INPUT_ENDPOINT__PORT:
				return getPort();
			case AzureCSDefPackage.INPUT_ENDPOINT__PROTOCOL:
				return getProtocol();
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
			case AzureCSDefPackage.INPUT_ENDPOINT__CERTIFICATE:
				setCertificate((String)newValue);
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__IDLE_TIMEOUT_IN_MINUTES:
				setIdleTimeoutInMinutes((Integer)newValue);
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__IGNORE_ROLE_INSTANCE_STATUS:
				setIgnoreRoleInstanceStatus((Boolean)newValue);
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__LOAD_BALANCER:
				setLoadBalancer((String)newValue);
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__LOAD_BALANCER_DISTRIBUTION:
				setLoadBalancerDistribution((DistributionType)newValue);
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__LOAD_BALANCER_PROBE:
				setLoadBalancerProbe((String)newValue);
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__LOCAL_PORT:
				setLocalPort(newValue);
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__NAME:
				setName((String)newValue);
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__PORT:
				setPort((Integer)newValue);
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__PROTOCOL:
				setProtocol((Protocol)newValue);
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
			case AzureCSDefPackage.INPUT_ENDPOINT__CERTIFICATE:
				setCertificate(CERTIFICATE_EDEFAULT);
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__IDLE_TIMEOUT_IN_MINUTES:
				unsetIdleTimeoutInMinutes();
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__IGNORE_ROLE_INSTANCE_STATUS:
				unsetIgnoreRoleInstanceStatus();
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__LOAD_BALANCER:
				setLoadBalancer(LOAD_BALANCER_EDEFAULT);
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__LOAD_BALANCER_DISTRIBUTION:
				unsetLoadBalancerDistribution();
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__LOAD_BALANCER_PROBE:
				setLoadBalancerProbe(LOAD_BALANCER_PROBE_EDEFAULT);
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__LOCAL_PORT:
				setLocalPort(LOCAL_PORT_EDEFAULT);
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__PORT:
				unsetPort();
				return;
			case AzureCSDefPackage.INPUT_ENDPOINT__PROTOCOL:
				unsetProtocol();
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
			case AzureCSDefPackage.INPUT_ENDPOINT__CERTIFICATE:
				return CERTIFICATE_EDEFAULT == null ? certificate != null : !CERTIFICATE_EDEFAULT.equals(certificate);
			case AzureCSDefPackage.INPUT_ENDPOINT__IDLE_TIMEOUT_IN_MINUTES:
				return isSetIdleTimeoutInMinutes();
			case AzureCSDefPackage.INPUT_ENDPOINT__IGNORE_ROLE_INSTANCE_STATUS:
				return isSetIgnoreRoleInstanceStatus();
			case AzureCSDefPackage.INPUT_ENDPOINT__LOAD_BALANCER:
				return LOAD_BALANCER_EDEFAULT == null ? loadBalancer != null : !LOAD_BALANCER_EDEFAULT.equals(loadBalancer);
			case AzureCSDefPackage.INPUT_ENDPOINT__LOAD_BALANCER_DISTRIBUTION:
				return isSetLoadBalancerDistribution();
			case AzureCSDefPackage.INPUT_ENDPOINT__LOAD_BALANCER_PROBE:
				return LOAD_BALANCER_PROBE_EDEFAULT == null ? loadBalancerProbe != null : !LOAD_BALANCER_PROBE_EDEFAULT.equals(loadBalancerProbe);
			case AzureCSDefPackage.INPUT_ENDPOINT__LOCAL_PORT:
				return LOCAL_PORT_EDEFAULT == null ? localPort != null : !LOCAL_PORT_EDEFAULT.equals(localPort);
			case AzureCSDefPackage.INPUT_ENDPOINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AzureCSDefPackage.INPUT_ENDPOINT__PORT:
				return isSetPort();
			case AzureCSDefPackage.INPUT_ENDPOINT__PROTOCOL:
				return isSetProtocol();
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
		result.append(" (certificate: ");
		result.append(certificate);
		result.append(", idleTimeoutInMinutes: ");
		if (idleTimeoutInMinutesESet) result.append(idleTimeoutInMinutes); else result.append("<unset>");
		result.append(", ignoreRoleInstanceStatus: ");
		if (ignoreRoleInstanceStatusESet) result.append(ignoreRoleInstanceStatus); else result.append("<unset>");
		result.append(", loadBalancer: ");
		result.append(loadBalancer);
		result.append(", loadBalancerDistribution: ");
		if (loadBalancerDistributionESet) result.append(loadBalancerDistribution); else result.append("<unset>");
		result.append(", loadBalancerProbe: ");
		result.append(loadBalancerProbe);
		result.append(", localPort: ");
		result.append(localPort);
		result.append(", name: ");
		result.append(name);
		result.append(", port: ");
		if (portESet) result.append(port); else result.append("<unset>");
		result.append(", protocol: ");
		if (protocolESet) result.append(protocol); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InputEndpointImpl
