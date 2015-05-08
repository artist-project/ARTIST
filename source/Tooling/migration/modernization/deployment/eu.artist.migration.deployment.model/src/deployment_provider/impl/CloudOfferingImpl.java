/**
 */
package deployment_provider.impl;

import deployment_provider.CloudOffering;
import deployment_provider.CloudService;
import deployment_provider.Deployment_providerPackage;
import deployment_provider.Framework;

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
 * An implementation of the model object '<em><b>Cloud Offering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deployment_provider.impl.CloudOfferingImpl#getOfferedServices <em>Offered Services</em>}</li>
 *   <li>{@link deployment_provider.impl.CloudOfferingImpl#getOfferedFrameworks <em>Offered Frameworks</em>}</li>
 *   <li>{@link deployment_provider.impl.CloudOfferingImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CloudOfferingImpl extends MinimalEObjectImpl.Container implements CloudOffering {
	/**
	 * The cached value of the '{@link #getOfferedServices() <em>Offered Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedServices()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudService> offeredServices;

	/**
	 * The cached value of the '{@link #getOfferedFrameworks() <em>Offered Frameworks</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOfferedFrameworks()
	 * @generated
	 * @ordered
	 */
	protected EList<Framework> offeredFrameworks;

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
	protected CloudOfferingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Deployment_providerPackage.Literals.CLOUD_OFFERING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudService> getOfferedServices() {
		if (offeredServices == null) {
			offeredServices = new EObjectContainmentEList<CloudService>(CloudService.class, this, Deployment_providerPackage.CLOUD_OFFERING__OFFERED_SERVICES);
		}
		return offeredServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Framework> getOfferedFrameworks() {
		if (offeredFrameworks == null) {
			offeredFrameworks = new EObjectContainmentEList<Framework>(Framework.class, this, Deployment_providerPackage.CLOUD_OFFERING__OFFERED_FRAMEWORKS);
		}
		return offeredFrameworks;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Deployment_providerPackage.CLOUD_OFFERING__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Deployment_providerPackage.CLOUD_OFFERING__OFFERED_SERVICES:
				return ((InternalEList<?>)getOfferedServices()).basicRemove(otherEnd, msgs);
			case Deployment_providerPackage.CLOUD_OFFERING__OFFERED_FRAMEWORKS:
				return ((InternalEList<?>)getOfferedFrameworks()).basicRemove(otherEnd, msgs);
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
			case Deployment_providerPackage.CLOUD_OFFERING__OFFERED_SERVICES:
				return getOfferedServices();
			case Deployment_providerPackage.CLOUD_OFFERING__OFFERED_FRAMEWORKS:
				return getOfferedFrameworks();
			case Deployment_providerPackage.CLOUD_OFFERING__NAME:
				return getName();
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
			case Deployment_providerPackage.CLOUD_OFFERING__OFFERED_SERVICES:
				getOfferedServices().clear();
				getOfferedServices().addAll((Collection<? extends CloudService>)newValue);
				return;
			case Deployment_providerPackage.CLOUD_OFFERING__OFFERED_FRAMEWORKS:
				getOfferedFrameworks().clear();
				getOfferedFrameworks().addAll((Collection<? extends Framework>)newValue);
				return;
			case Deployment_providerPackage.CLOUD_OFFERING__NAME:
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
			case Deployment_providerPackage.CLOUD_OFFERING__OFFERED_SERVICES:
				getOfferedServices().clear();
				return;
			case Deployment_providerPackage.CLOUD_OFFERING__OFFERED_FRAMEWORKS:
				getOfferedFrameworks().clear();
				return;
			case Deployment_providerPackage.CLOUD_OFFERING__NAME:
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
			case Deployment_providerPackage.CLOUD_OFFERING__OFFERED_SERVICES:
				return offeredServices != null && !offeredServices.isEmpty();
			case Deployment_providerPackage.CLOUD_OFFERING__OFFERED_FRAMEWORKS:
				return offeredFrameworks != null && !offeredFrameworks.isEmpty();
			case Deployment_providerPackage.CLOUD_OFFERING__NAME:
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //CloudOfferingImpl
