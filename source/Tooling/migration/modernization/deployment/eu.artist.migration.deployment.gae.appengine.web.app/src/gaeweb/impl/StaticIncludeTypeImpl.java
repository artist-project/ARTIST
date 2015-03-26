/**
 */
package gaeweb.impl;

import gaeweb.GaewebPackage;
import gaeweb.HttpHeaderType;
import gaeweb.StaticIncludeType;

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
 * An implementation of the model object '<em><b>Static Include Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link gaeweb.impl.StaticIncludeTypeImpl#getHttpHeader <em>Http Header</em>}</li>
 *   <li>{@link gaeweb.impl.StaticIncludeTypeImpl#getExpiration <em>Expiration</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StaticIncludeTypeImpl extends IncludeTypeImpl implements StaticIncludeType {
	/**
	 * The cached value of the '{@link #getHttpHeader() <em>Http Header</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHttpHeader()
	 * @generated
	 * @ordered
	 */
	protected EList<HttpHeaderType> httpHeader;

	/**
	 * The default value of the '{@link #getExpiration() <em>Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiration()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPIRATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpiration() <em>Expiration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpiration()
	 * @generated
	 * @ordered
	 */
	protected String expiration = EXPIRATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StaticIncludeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GaewebPackage.Literals.STATIC_INCLUDE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<HttpHeaderType> getHttpHeader() {
		if (httpHeader == null) {
			httpHeader = new EObjectContainmentEList<HttpHeaderType>(HttpHeaderType.class, this, GaewebPackage.STATIC_INCLUDE_TYPE__HTTP_HEADER);
		}
		return httpHeader;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpiration() {
		return expiration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpiration(String newExpiration) {
		String oldExpiration = expiration;
		expiration = newExpiration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GaewebPackage.STATIC_INCLUDE_TYPE__EXPIRATION, oldExpiration, expiration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GaewebPackage.STATIC_INCLUDE_TYPE__HTTP_HEADER:
				return ((InternalEList<?>)getHttpHeader()).basicRemove(otherEnd, msgs);
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
			case GaewebPackage.STATIC_INCLUDE_TYPE__HTTP_HEADER:
				return getHttpHeader();
			case GaewebPackage.STATIC_INCLUDE_TYPE__EXPIRATION:
				return getExpiration();
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
			case GaewebPackage.STATIC_INCLUDE_TYPE__HTTP_HEADER:
				getHttpHeader().clear();
				getHttpHeader().addAll((Collection<? extends HttpHeaderType>)newValue);
				return;
			case GaewebPackage.STATIC_INCLUDE_TYPE__EXPIRATION:
				setExpiration((String)newValue);
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
			case GaewebPackage.STATIC_INCLUDE_TYPE__HTTP_HEADER:
				getHttpHeader().clear();
				return;
			case GaewebPackage.STATIC_INCLUDE_TYPE__EXPIRATION:
				setExpiration(EXPIRATION_EDEFAULT);
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
			case GaewebPackage.STATIC_INCLUDE_TYPE__HTTP_HEADER:
				return httpHeader != null && !httpHeader.isEmpty();
			case GaewebPackage.STATIC_INCLUDE_TYPE__EXPIRATION:
				return EXPIRATION_EDEFAULT == null ? expiration != null : !EXPIRATION_EDEFAULT.equals(expiration);
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
		result.append(" (expiration: ");
		result.append(expiration);
		result.append(')');
		return result.toString();
	}

} //StaticIncludeTypeImpl
