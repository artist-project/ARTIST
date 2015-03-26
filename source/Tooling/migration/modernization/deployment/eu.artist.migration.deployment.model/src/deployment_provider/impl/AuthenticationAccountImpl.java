/**
 */
package deployment_provider.impl;

import deployment_provider.AuthenticationAccount;
import deployment_provider.AuthenticationToken;
import deployment_provider.Deployment_providerPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Authentication Account</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link deployment_provider.impl.AuthenticationAccountImpl#getUses <em>Uses</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthenticationAccountImpl extends MinimalEObjectImpl.Container implements AuthenticationAccount {
	/**
	 * The cached value of the '{@link #getUses() <em>Uses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected AuthenticationToken uses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthenticationAccountImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Deployment_providerPackage.Literals.AUTHENTICATION_ACCOUNT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthenticationToken getUses() {
		return uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUses(AuthenticationToken newUses, NotificationChain msgs) {
		AuthenticationToken oldUses = uses;
		uses = newUses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Deployment_providerPackage.AUTHENTICATION_ACCOUNT__USES, oldUses, newUses);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUses(AuthenticationToken newUses) {
		if (newUses != uses) {
			NotificationChain msgs = null;
			if (uses != null)
				msgs = ((InternalEObject)uses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Deployment_providerPackage.AUTHENTICATION_ACCOUNT__USES, null, msgs);
			if (newUses != null)
				msgs = ((InternalEObject)newUses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Deployment_providerPackage.AUTHENTICATION_ACCOUNT__USES, null, msgs);
			msgs = basicSetUses(newUses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Deployment_providerPackage.AUTHENTICATION_ACCOUNT__USES, newUses, newUses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Deployment_providerPackage.AUTHENTICATION_ACCOUNT__USES:
				return basicSetUses(null, msgs);
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
			case Deployment_providerPackage.AUTHENTICATION_ACCOUNT__USES:
				return getUses();
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
			case Deployment_providerPackage.AUTHENTICATION_ACCOUNT__USES:
				setUses((AuthenticationToken)newValue);
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
			case Deployment_providerPackage.AUTHENTICATION_ACCOUNT__USES:
				setUses((AuthenticationToken)null);
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
			case Deployment_providerPackage.AUTHENTICATION_ACCOUNT__USES:
				return uses != null;
		}
		return super.eIsSet(featureID);
	}

} //AuthenticationAccountImpl
