/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.Binding;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Binding</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.BindingImpl#getEndpointName <em>Endpoint Name</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.BindingImpl#getHostHeader <em>Host Header</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.BindingImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BindingImpl extends MinimalEObjectImpl.Container implements Binding {
	/**
	 * The default value of the '{@link #getEndpointName() <em>Endpoint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointName()
	 * @generated
	 * @ordered
	 */
	protected static final String ENDPOINT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEndpointName() <em>Endpoint Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndpointName()
	 * @generated
	 * @ordered
	 */
	protected String endpointName = ENDPOINT_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getHostHeader() <em>Host Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostHeader()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_HEADER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHostHeader() <em>Host Header</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHostHeader()
	 * @generated
	 * @ordered
	 */
	protected String hostHeader = HOST_HEADER_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BindingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.BINDING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEndpointName() {
		return endpointName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndpointName(String newEndpointName) {
		String oldEndpointName = endpointName;
		endpointName = newEndpointName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.BINDING__ENDPOINT_NAME, oldEndpointName, endpointName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getHostHeader() {
		return hostHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHostHeader(String newHostHeader) {
		String oldHostHeader = hostHeader;
		hostHeader = newHostHeader;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.BINDING__HOST_HEADER, oldHostHeader, hostHeader));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.BINDING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AzureCSDefPackage.BINDING__ENDPOINT_NAME:
				return getEndpointName();
			case AzureCSDefPackage.BINDING__HOST_HEADER:
				return getHostHeader();
			case AzureCSDefPackage.BINDING__NAME:
				return getName();
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
			case AzureCSDefPackage.BINDING__ENDPOINT_NAME:
				setEndpointName((String)newValue);
				return;
			case AzureCSDefPackage.BINDING__HOST_HEADER:
				setHostHeader((String)newValue);
				return;
			case AzureCSDefPackage.BINDING__NAME:
				setName((String)newValue);
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
			case AzureCSDefPackage.BINDING__ENDPOINT_NAME:
				setEndpointName(ENDPOINT_NAME_EDEFAULT);
				return;
			case AzureCSDefPackage.BINDING__HOST_HEADER:
				setHostHeader(HOST_HEADER_EDEFAULT);
				return;
			case AzureCSDefPackage.BINDING__NAME:
				setName(NAME_EDEFAULT);
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
			case AzureCSDefPackage.BINDING__ENDPOINT_NAME:
				return ENDPOINT_NAME_EDEFAULT == null ? endpointName != null : !ENDPOINT_NAME_EDEFAULT.equals(endpointName);
			case AzureCSDefPackage.BINDING__HOST_HEADER:
				return HOST_HEADER_EDEFAULT == null ? hostHeader != null : !HOST_HEADER_EDEFAULT.equals(hostHeader);
			case AzureCSDefPackage.BINDING__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (endpointName: ");
		result.append(endpointName);
		result.append(", hostHeader: ");
		result.append(hostHeader);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BindingImpl
