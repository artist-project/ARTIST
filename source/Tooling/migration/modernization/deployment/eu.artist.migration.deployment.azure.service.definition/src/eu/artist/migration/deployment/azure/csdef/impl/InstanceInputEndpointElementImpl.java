/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AllocatePublicPortFromElement;
import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.InstanceInputEndpointElement;
import eu.artist.migration.deployment.azure.csdef.TransportProtocol;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instance Input Endpoint Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InstanceInputEndpointElementImpl#getAllocatePublicPortFrom <em>Allocate Public Port From</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InstanceInputEndpointElementImpl#getIdleTimeoutInMinutes <em>Idle Timeout In Minutes</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InstanceInputEndpointElementImpl#getLocalPort <em>Local Port</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InstanceInputEndpointElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InstanceInputEndpointElementImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InstanceInputEndpointElementImpl extends MinimalEObjectImpl.Container implements InstanceInputEndpointElement {
	/**
	 * The cached value of the '{@link #getAllocatePublicPortFrom() <em>Allocate Public Port From</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocatePublicPortFrom()
	 * @generated
	 * @ordered
	 */
	protected AllocatePublicPortFromElement allocatePublicPortFrom;

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
	 * The default value of the '{@link #getLocalPort() <em>Local Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPort()
	 * @generated
	 * @ordered
	 */
	protected static final int LOCAL_PORT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLocalPort() <em>Local Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalPort()
	 * @generated
	 * @ordered
	 */
	protected int localPort = LOCAL_PORT_EDEFAULT;

	/**
	 * This is true if the Local Port attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean localPortESet;

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
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final TransportProtocol PROTOCOL_EDEFAULT = TransportProtocol.UDP;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected TransportProtocol protocol = PROTOCOL_EDEFAULT;

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
	protected InstanceInputEndpointElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.INSTANCE_INPUT_ENDPOINT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllocatePublicPortFromElement getAllocatePublicPortFrom() {
		return allocatePublicPortFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllocatePublicPortFrom(AllocatePublicPortFromElement newAllocatePublicPortFrom, NotificationChain msgs) {
		AllocatePublicPortFromElement oldAllocatePublicPortFrom = allocatePublicPortFrom;
		allocatePublicPortFrom = newAllocatePublicPortFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__ALLOCATE_PUBLIC_PORT_FROM, oldAllocatePublicPortFrom, newAllocatePublicPortFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllocatePublicPortFrom(AllocatePublicPortFromElement newAllocatePublicPortFrom) {
		if (newAllocatePublicPortFrom != allocatePublicPortFrom) {
			NotificationChain msgs = null;
			if (allocatePublicPortFrom != null)
				msgs = ((InternalEObject)allocatePublicPortFrom).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__ALLOCATE_PUBLIC_PORT_FROM, null, msgs);
			if (newAllocatePublicPortFrom != null)
				msgs = ((InternalEObject)newAllocatePublicPortFrom).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__ALLOCATE_PUBLIC_PORT_FROM, null, msgs);
			msgs = basicSetAllocatePublicPortFrom(newAllocatePublicPortFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__ALLOCATE_PUBLIC_PORT_FROM, newAllocatePublicPortFrom, newAllocatePublicPortFrom));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__IDLE_TIMEOUT_IN_MINUTES, oldIdleTimeoutInMinutes, idleTimeoutInMinutes, !oldIdleTimeoutInMinutesESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__IDLE_TIMEOUT_IN_MINUTES, oldIdleTimeoutInMinutes, IDLE_TIMEOUT_IN_MINUTES_EDEFAULT, oldIdleTimeoutInMinutesESet));
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
	public int getLocalPort() {
		return localPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalPort(int newLocalPort) {
		int oldLocalPort = localPort;
		localPort = newLocalPort;
		boolean oldLocalPortESet = localPortESet;
		localPortESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__LOCAL_PORT, oldLocalPort, localPort, !oldLocalPortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetLocalPort() {
		int oldLocalPort = localPort;
		boolean oldLocalPortESet = localPortESet;
		localPort = LOCAL_PORT_EDEFAULT;
		localPortESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__LOCAL_PORT, oldLocalPort, LOCAL_PORT_EDEFAULT, oldLocalPortESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetLocalPort() {
		return localPortESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportProtocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(TransportProtocol newProtocol) {
		TransportProtocol oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		boolean oldProtocolESet = protocolESet;
		protocolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__PROTOCOL, oldProtocol, protocol, !oldProtocolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtocol() {
		TransportProtocol oldProtocol = protocol;
		boolean oldProtocolESet = protocolESet;
		protocol = PROTOCOL_EDEFAULT;
		protocolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__PROTOCOL, oldProtocol, PROTOCOL_EDEFAULT, oldProtocolESet));
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
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__ALLOCATE_PUBLIC_PORT_FROM:
				return basicSetAllocatePublicPortFrom(null, msgs);
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
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__ALLOCATE_PUBLIC_PORT_FROM:
				return getAllocatePublicPortFrom();
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__IDLE_TIMEOUT_IN_MINUTES:
				return getIdleTimeoutInMinutes();
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__LOCAL_PORT:
				return getLocalPort();
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__NAME:
				return getName();
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__PROTOCOL:
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
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__ALLOCATE_PUBLIC_PORT_FROM:
				setAllocatePublicPortFrom((AllocatePublicPortFromElement)newValue);
				return;
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__IDLE_TIMEOUT_IN_MINUTES:
				setIdleTimeoutInMinutes((Integer)newValue);
				return;
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__LOCAL_PORT:
				setLocalPort((Integer)newValue);
				return;
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__PROTOCOL:
				setProtocol((TransportProtocol)newValue);
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
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__ALLOCATE_PUBLIC_PORT_FROM:
				setAllocatePublicPortFrom((AllocatePublicPortFromElement)null);
				return;
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__IDLE_TIMEOUT_IN_MINUTES:
				unsetIdleTimeoutInMinutes();
				return;
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__LOCAL_PORT:
				unsetLocalPort();
				return;
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__PROTOCOL:
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
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__ALLOCATE_PUBLIC_PORT_FROM:
				return allocatePublicPortFrom != null;
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__IDLE_TIMEOUT_IN_MINUTES:
				return isSetIdleTimeoutInMinutes();
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__LOCAL_PORT:
				return isSetLocalPort();
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AzureCSDefPackage.INSTANCE_INPUT_ENDPOINT_ELEMENT__PROTOCOL:
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
		result.append(" (idleTimeoutInMinutes: ");
		if (idleTimeoutInMinutesESet) result.append(idleTimeoutInMinutes); else result.append("<unset>");
		result.append(", localPort: ");
		if (localPortESet) result.append(localPort); else result.append("<unset>");
		result.append(", name: ");
		result.append(name);
		result.append(", protocol: ");
		if (protocolESet) result.append(protocol); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InstanceInputEndpointElementImpl
