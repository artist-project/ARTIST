/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.InternalEndpoint;
import eu.artist.migration.deployment.azure.csdef.InternalProtocol;
import eu.artist.migration.deployment.azure.csdef.Port;
import eu.artist.migration.deployment.azure.csdef.PortRange;

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
 * An implementation of the model object '<em><b>Internal Endpoint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InternalEndpointImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InternalEndpointImpl#getFixedPort <em>Fixed Port</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InternalEndpointImpl#getFixedPortRange <em>Fixed Port Range</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InternalEndpointImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InternalEndpointImpl#getPort <em>Port</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.InternalEndpointImpl#getProtocol <em>Protocol</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InternalEndpointImpl extends MinimalEObjectImpl.Container implements InternalEndpoint {
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
	protected static final Object PORT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected Object port = PORT_EDEFAULT;

	/**
	 * The default value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected static final InternalProtocol PROTOCOL_EDEFAULT = InternalProtocol.HTTP;

	/**
	 * The cached value of the '{@link #getProtocol() <em>Protocol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProtocol()
	 * @generated
	 * @ordered
	 */
	protected InternalProtocol protocol = PROTOCOL_EDEFAULT;

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
	protected InternalEndpointImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.INTERNAL_ENDPOINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, AzureCSDefPackage.INTERNAL_ENDPOINT__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getFixedPort() {
		return getGroup().list(AzureCSDefPackage.Literals.INTERNAL_ENDPOINT__FIXED_PORT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PortRange> getFixedPortRange() {
		return getGroup().list(AzureCSDefPackage.Literals.INTERNAL_ENDPOINT__FIXED_PORT_RANGE);
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INTERNAL_ENDPOINT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getPort() {
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPort(Object newPort) {
		Object oldPort = port;
		port = newPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INTERNAL_ENDPOINT__PORT, oldPort, port));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InternalProtocol getProtocol() {
		return protocol;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProtocol(InternalProtocol newProtocol) {
		InternalProtocol oldProtocol = protocol;
		protocol = newProtocol == null ? PROTOCOL_EDEFAULT : newProtocol;
		boolean oldProtocolESet = protocolESet;
		protocolESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.INTERNAL_ENDPOINT__PROTOCOL, oldProtocol, protocol, !oldProtocolESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetProtocol() {
		InternalProtocol oldProtocol = protocol;
		boolean oldProtocolESet = protocolESet;
		protocol = PROTOCOL_EDEFAULT;
		protocolESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, AzureCSDefPackage.INTERNAL_ENDPOINT__PROTOCOL, oldProtocol, PROTOCOL_EDEFAULT, oldProtocolESet));
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
			case AzureCSDefPackage.INTERNAL_ENDPOINT__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case AzureCSDefPackage.INTERNAL_ENDPOINT__FIXED_PORT:
				return ((InternalEList<?>)getFixedPort()).basicRemove(otherEnd, msgs);
			case AzureCSDefPackage.INTERNAL_ENDPOINT__FIXED_PORT_RANGE:
				return ((InternalEList<?>)getFixedPortRange()).basicRemove(otherEnd, msgs);
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
			case AzureCSDefPackage.INTERNAL_ENDPOINT__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case AzureCSDefPackage.INTERNAL_ENDPOINT__FIXED_PORT:
				return getFixedPort();
			case AzureCSDefPackage.INTERNAL_ENDPOINT__FIXED_PORT_RANGE:
				return getFixedPortRange();
			case AzureCSDefPackage.INTERNAL_ENDPOINT__NAME:
				return getName();
			case AzureCSDefPackage.INTERNAL_ENDPOINT__PORT:
				return getPort();
			case AzureCSDefPackage.INTERNAL_ENDPOINT__PROTOCOL:
				return getProtocol();
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
			case AzureCSDefPackage.INTERNAL_ENDPOINT__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case AzureCSDefPackage.INTERNAL_ENDPOINT__FIXED_PORT:
				getFixedPort().clear();
				getFixedPort().addAll((Collection<? extends Port>)newValue);
				return;
			case AzureCSDefPackage.INTERNAL_ENDPOINT__FIXED_PORT_RANGE:
				getFixedPortRange().clear();
				getFixedPortRange().addAll((Collection<? extends PortRange>)newValue);
				return;
			case AzureCSDefPackage.INTERNAL_ENDPOINT__NAME:
				setName((String)newValue);
				return;
			case AzureCSDefPackage.INTERNAL_ENDPOINT__PORT:
				setPort(newValue);
				return;
			case AzureCSDefPackage.INTERNAL_ENDPOINT__PROTOCOL:
				setProtocol((InternalProtocol)newValue);
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
			case AzureCSDefPackage.INTERNAL_ENDPOINT__GROUP:
				getGroup().clear();
				return;
			case AzureCSDefPackage.INTERNAL_ENDPOINT__FIXED_PORT:
				getFixedPort().clear();
				return;
			case AzureCSDefPackage.INTERNAL_ENDPOINT__FIXED_PORT_RANGE:
				getFixedPortRange().clear();
				return;
			case AzureCSDefPackage.INTERNAL_ENDPOINT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case AzureCSDefPackage.INTERNAL_ENDPOINT__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case AzureCSDefPackage.INTERNAL_ENDPOINT__PROTOCOL:
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
			case AzureCSDefPackage.INTERNAL_ENDPOINT__GROUP:
				return group != null && !group.isEmpty();
			case AzureCSDefPackage.INTERNAL_ENDPOINT__FIXED_PORT:
				return !getFixedPort().isEmpty();
			case AzureCSDefPackage.INTERNAL_ENDPOINT__FIXED_PORT_RANGE:
				return !getFixedPortRange().isEmpty();
			case AzureCSDefPackage.INTERNAL_ENDPOINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case AzureCSDefPackage.INTERNAL_ENDPOINT__PORT:
				return PORT_EDEFAULT == null ? port != null : !PORT_EDEFAULT.equals(port);
			case AzureCSDefPackage.INTERNAL_ENDPOINT__PROTOCOL:
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
		result.append(" (group: ");
		result.append(group);
		result.append(", name: ");
		result.append(name);
		result.append(", port: ");
		result.append(port);
		result.append(", protocol: ");
		if (protocolESet) result.append(protocol); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //InternalEndpointImpl
