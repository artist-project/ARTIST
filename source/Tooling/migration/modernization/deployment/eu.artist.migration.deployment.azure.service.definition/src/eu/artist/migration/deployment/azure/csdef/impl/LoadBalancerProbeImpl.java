/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.LoadBalancerProbe;
import eu.artist.migration.deployment.azure.csdef.ProbeProtocol;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Balancer Probe</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.LoadBalancerProbeImpl#getIntervalInSeconds <em>Interval In Seconds</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.LoadBalancerProbeImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.LoadBalancerProbeImpl#getPath <em>Path</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.LoadBalancerProbeImpl#getPort <em>Port</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.LoadBalancerProbeImpl#getProtocol <em>Protocol</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.LoadBalancerProbeImpl#getTimeoutInSeconds <em>Timeout In Seconds</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadBalancerProbeImpl extends MinimalEObjectImpl.Container implements LoadBalancerProbe {
	/**
	 * The default value of the '{@link #getIntervalInSeconds() <em>Interval In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalInSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final int INTERVAL_IN_SECONDS_EDEFAULT = 15;

	/**
	 * The cached value of the '{@link #getIntervalInSeconds() <em>Interval In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntervalInSeconds()
	 * @generated
	 * @ordered
	 */
	protected int intervalInSeconds = INTERVAL_IN_SECONDS_EDEFAULT;

	/**
	 * This is true if the Interval In Seconds attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean intervalInSecondsESet;

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
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected String path = PATH_EDEFAULT;

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
	protected static final ProbeProtocol PROTOCOL_EDEFAULT = ProbeProtocol.HTTP;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected ProbeProtocol protocol = PROTOCOL_EDEFAULT;

	/**
	 * This is true if the Protocol attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean protocolESet;

	/**
	 * The default value of the '{@link #getTimeoutInSeconds() <em>Timeout In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutInSeconds()
	 * @generated
	 * @ordered
	 */
	protected static final int TIMEOUT_IN_SECONDS_EDEFAULT = 31;

	/**
	 * The cached value of the '{@link #getTimeoutInSeconds() <em>Timeout In Seconds</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeoutInSeconds()
	 * @generated
	 * @ordered
	 */
	protected int timeoutInSeconds = TIMEOUT_IN_SECONDS_EDEFAULT;

	/**
	 * This is true if the Timeout In Seconds attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean timeoutInSecondsESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBalancerProbeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.LOAD_BALANCER_PROBE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getIntervalInSeconds() {
		return intervalInSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntervalInSeconds(int newIntervalInSeconds) {
		int oldIntervalInSeconds = intervalInSeconds;
		intervalInSeconds = newIntervalInSeconds;
		boolean oldIntervalInSecondsESet = intervalInSecondsESet;
		intervalInSecondsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.LOAD_BALANCER_PROBE__INTERVAL_IN_SECONDS, oldIntervalInSeconds, intervalInSeconds, !oldIntervalInSecondsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIntervalInSeconds() {
		int oldIntervalInSeconds = intervalInSeconds;
		boolean oldIntervalInSecondsESet = intervalInSecondsESet;
		intervalInSeconds = INTERVAL_IN_SECONDS_EDEFAULT;
		intervalInSecondsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.LOAD_BALANCER_PROBE__INTERVAL_IN_SECONDS, oldIntervalInSeconds, INTERVAL_IN_SECONDS_EDEFAULT, oldIntervalInSecondsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIntervalInSeconds() {
		return intervalInSecondsESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.LOAD_BALANCER_PROBE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPath() {
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPath(String newPath) {
		String oldPath = path;
		path = newPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.LOAD_BALANCER_PROBE__PATH, oldPath, path));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.LOAD_BALANCER_PROBE__PORT, oldPort, port, !oldPortESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.LOAD_BALANCER_PROBE__PORT, oldPort, PORT_EDEFAULT, oldPortESet));
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
	public ProbeProtocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(ProbeProtocol newProtocol) {
		ProbeProtocol oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		boolean oldProtocolESet = protocolESet;
		protocolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.LOAD_BALANCER_PROBE__PROTOCOL, oldProtocol, protocol, !oldProtocolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtocol() {
		ProbeProtocol oldProtocol = protocol;
		boolean oldProtocolESet = protocolESet;
		protocol = PROTOCOL_EDEFAULT;
		protocolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.LOAD_BALANCER_PROBE__PROTOCOL, oldProtocol, PROTOCOL_EDEFAULT, oldProtocolESet));
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
	public int getTimeoutInSeconds() {
		return timeoutInSeconds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeoutInSeconds(int newTimeoutInSeconds) {
		int oldTimeoutInSeconds = timeoutInSeconds;
		timeoutInSeconds = newTimeoutInSeconds;
		boolean oldTimeoutInSecondsESet = timeoutInSecondsESet;
		timeoutInSecondsESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.LOAD_BALANCER_PROBE__TIMEOUT_IN_SECONDS, oldTimeoutInSeconds, timeoutInSeconds, !oldTimeoutInSecondsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTimeoutInSeconds() {
		int oldTimeoutInSeconds = timeoutInSeconds;
		boolean oldTimeoutInSecondsESet = timeoutInSecondsESet;
		timeoutInSeconds = TIMEOUT_IN_SECONDS_EDEFAULT;
		timeoutInSecondsESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.LOAD_BALANCER_PROBE__TIMEOUT_IN_SECONDS, oldTimeoutInSeconds, TIMEOUT_IN_SECONDS_EDEFAULT, oldTimeoutInSecondsESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTimeoutInSeconds() {
		return timeoutInSecondsESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__INTERVAL_IN_SECONDS:
				return getIntervalInSeconds();
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__NAME:
				return getName();
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__PATH:
				return getPath();
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__PORT:
				return getPort();
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__PROTOCOL:
				return getProtocol();
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__TIMEOUT_IN_SECONDS:
				return getTimeoutInSeconds();
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
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__INTERVAL_IN_SECONDS:
				setIntervalInSeconds((Integer)newValue);
				return;
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__NAME:
				setName((String)newValue);
				return;
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__PATH:
				setPath((String)newValue);
				return;
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__PORT:
				setPort((Integer)newValue);
				return;
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__PROTOCOL:
				setProtocol((ProbeProtocol)newValue);
				return;
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__TIMEOUT_IN_SECONDS:
				setTimeoutInSeconds((Integer)newValue);
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
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__INTERVAL_IN_SECONDS:
				unsetIntervalInSeconds();
				return;
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__PORT:
				unsetPort();
				return;
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__PROTOCOL:
				unsetProtocol();
				return;
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__TIMEOUT_IN_SECONDS:
				unsetTimeoutInSeconds();
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
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__INTERVAL_IN_SECONDS:
				return isSetIntervalInSeconds();
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__PATH:
				return PATH_EDEFAULT == null ? path != null : !PATH_EDEFAULT.equals(path);
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__PORT:
				return isSetPort();
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__PROTOCOL:
				return isSetProtocol();
			case AzureCSDefPackage.LOAD_BALANCER_PROBE__TIMEOUT_IN_SECONDS:
				return isSetTimeoutInSeconds();
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
		result.append(" (intervalInSeconds: ");
		if (intervalInSecondsESet) result.append(intervalInSeconds); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", path: ");
		result.append(path);
		result.append(", port: ");
		if (portESet) result.append(port); else result.append("<unset>");
		result.append(", protocol: ");
		if (protocolESet) result.append(protocol); else result.append("<unset>");
		result.append(", timeoutInSeconds: ");
		if (timeoutInSecondsESet) result.append(timeoutInSeconds); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //LoadBalancerProbeImpl
