/**
 */
package deployment_provider.impl;

import deployment_provider.AuthenticationAccount;
import deployment_provider.CloudDeploymentService;
import deployment_provider.CloudService;
import deployment_provider.Deployment_providerPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cloud Deployment Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deployment_provider.impl.CloudDeploymentServiceImpl#getUsesAccount <em>Uses Account</em>}</li>
 *   <li>{@link deployment_provider.impl.CloudDeploymentServiceImpl#getRequiredServices <em>Required Services</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CloudDeploymentServiceImpl extends CloudSoftwareServiceImpl implements CloudDeploymentService {
	/**
	 * The cached value of the '{@link #getUsesAccount() <em>Uses Account</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsesAccount()
	 * @generated
	 * @ordered
	 */
	protected AuthenticationAccount usesAccount;

	/**
	 * The cached value of the '{@link #getRequiredServices() <em>Required Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredServices()
	 * @generated
	 * @ordered
	 */
	protected EList<CloudService> requiredServices;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CloudDeploymentServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Deployment_providerPackage.Literals.CLOUD_DEPLOYMENT_SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationAccount getUsesAccount() {
		return usesAccount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsesAccount(AuthenticationAccount newUsesAccount, NotificationChain msgs) {
		AuthenticationAccount oldUsesAccount = usesAccount;
		usesAccount = newUsesAccount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Deployment_providerPackage.CLOUD_DEPLOYMENT_SERVICE__USES_ACCOUNT, oldUsesAccount, newUsesAccount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsesAccount(AuthenticationAccount newUsesAccount) {
		if (newUsesAccount != usesAccount) {
			NotificationChain msgs = null;
			if (usesAccount != null)
				msgs = ((InternalEObject)usesAccount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Deployment_providerPackage.CLOUD_DEPLOYMENT_SERVICE__USES_ACCOUNT, null, msgs);
			if (newUsesAccount != null)
				msgs = ((InternalEObject)newUsesAccount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Deployment_providerPackage.CLOUD_DEPLOYMENT_SERVICE__USES_ACCOUNT, null, msgs);
			msgs = basicSetUsesAccount(newUsesAccount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Deployment_providerPackage.CLOUD_DEPLOYMENT_SERVICE__USES_ACCOUNT, newUsesAccount, newUsesAccount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CloudService> getRequiredServices() {
		if (requiredServices == null) {
			requiredServices = new EObjectContainmentEList<CloudService>(CloudService.class, this, Deployment_providerPackage.CLOUD_DEPLOYMENT_SERVICE__REQUIRED_SERVICES);
		}
		return requiredServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Deployment_providerPackage.CLOUD_DEPLOYMENT_SERVICE__USES_ACCOUNT:
				return basicSetUsesAccount(null, msgs);
			case Deployment_providerPackage.CLOUD_DEPLOYMENT_SERVICE__REQUIRED_SERVICES:
				return ((InternalEList<?>)getRequiredServices()).basicRemove(otherEnd, msgs);
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
			case Deployment_providerPackage.CLOUD_DEPLOYMENT_SERVICE__USES_ACCOUNT:
				return getUsesAccount();
			case Deployment_providerPackage.CLOUD_DEPLOYMENT_SERVICE__REQUIRED_SERVICES:
				return getRequiredServices();
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
			case Deployment_providerPackage.CLOUD_DEPLOYMENT_SERVICE__USES_ACCOUNT:
				setUsesAccount((AuthenticationAccount)newValue);
				return;
			case Deployment_providerPackage.CLOUD_DEPLOYMENT_SERVICE__REQUIRED_SERVICES:
				getRequiredServices().clear();
				getRequiredServices().addAll((Collection<? extends CloudService>)newValue);
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
			case Deployment_providerPackage.CLOUD_DEPLOYMENT_SERVICE__USES_ACCOUNT:
				setUsesAccount((AuthenticationAccount)null);
				return;
			case Deployment_providerPackage.CLOUD_DEPLOYMENT_SERVICE__REQUIRED_SERVICES:
				getRequiredServices().clear();
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
			case Deployment_providerPackage.CLOUD_DEPLOYMENT_SERVICE__USES_ACCOUNT:
				return usesAccount != null;
			case Deployment_providerPackage.CLOUD_DEPLOYMENT_SERVICE__REQUIRED_SERVICES:
				return requiredServices != null && !requiredServices.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //CloudDeploymentServiceImpl
