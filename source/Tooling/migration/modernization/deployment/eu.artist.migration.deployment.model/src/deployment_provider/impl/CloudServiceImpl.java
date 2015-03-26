/**
 */
package deployment_provider.impl;

import deployment_provider.CloudService;
import deployment_provider.CloudServiceClient;
import deployment_provider.Deployment_providerPackage;
import deployment_provider.ServiceConfigurationDescriptor;

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
 * An implementation of the model object '<em><b>Cloud Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deployment_provider.impl.CloudServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link deployment_provider.impl.CloudServiceImpl#getConfiguredBy <em>Configured By</em>}</li>
 *   <li>{@link deployment_provider.impl.CloudServiceImpl#getSupportedClients <em>Supported Clients</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CloudServiceImpl extends MinimalEObjectImpl.Container implements CloudService {
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
	 * The cached value of the '{@link #getConfiguredBy() <em>Configured By</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguredBy()
	 * @generated
	 * @ordered
	 */
	protected EList<ServiceConfigurationDescriptor> configuredBy;

	/**
	 * The cached value of the '{@link #getSupportedClients() <em>Supported Clients</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportedClients()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudServiceClient> supportedClients;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Deployment_providerPackage.Literals.CLOUD_SERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Deployment_providerPackage.CLOUD_SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ServiceConfigurationDescriptor> getConfiguredBy() {
		if (configuredBy == null) {
			configuredBy = new EObjectContainmentEList<ServiceConfigurationDescriptor>(ServiceConfigurationDescriptor.class, this, Deployment_providerPackage.CLOUD_SERVICE__CONFIGURED_BY);
		}
		return configuredBy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudServiceClient> getSupportedClients() {
		if (supportedClients == null) {
			supportedClients = new EObjectContainmentEList<CloudServiceClient>(CloudServiceClient.class, this, Deployment_providerPackage.CLOUD_SERVICE__SUPPORTED_CLIENTS);
		}
		return supportedClients;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Deployment_providerPackage.CLOUD_SERVICE__CONFIGURED_BY:
				return ((InternalEList<?>)getConfiguredBy()).basicRemove(otherEnd, msgs);
			case Deployment_providerPackage.CLOUD_SERVICE__SUPPORTED_CLIENTS:
				return ((InternalEList<?>)getSupportedClients()).basicRemove(otherEnd, msgs);
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
			case Deployment_providerPackage.CLOUD_SERVICE__NAME:
				return getName();
			case Deployment_providerPackage.CLOUD_SERVICE__CONFIGURED_BY:
				return getConfiguredBy();
			case Deployment_providerPackage.CLOUD_SERVICE__SUPPORTED_CLIENTS:
				return getSupportedClients();
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
			case Deployment_providerPackage.CLOUD_SERVICE__NAME:
				setName((String)newValue);
				return;
			case Deployment_providerPackage.CLOUD_SERVICE__CONFIGURED_BY:
				getConfiguredBy().clear();
				getConfiguredBy().addAll((Collection<? extends ServiceConfigurationDescriptor>)newValue);
				return;
			case Deployment_providerPackage.CLOUD_SERVICE__SUPPORTED_CLIENTS:
				getSupportedClients().clear();
				getSupportedClients().addAll((Collection<? extends CloudServiceClient>)newValue);
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
			case Deployment_providerPackage.CLOUD_SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Deployment_providerPackage.CLOUD_SERVICE__CONFIGURED_BY:
				getConfiguredBy().clear();
				return;
			case Deployment_providerPackage.CLOUD_SERVICE__SUPPORTED_CLIENTS:
				getSupportedClients().clear();
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
			case Deployment_providerPackage.CLOUD_SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Deployment_providerPackage.CLOUD_SERVICE__CONFIGURED_BY:
				return configuredBy != null && !configuredBy.isEmpty();
			case Deployment_providerPackage.CLOUD_SERVICE__SUPPORTED_CLIENTS:
				return supportedClients != null && !supportedClients.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CloudServiceImpl
