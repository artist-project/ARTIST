/**
 */
package org.eclipse.emf.henshin.tests.uml;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.tests.uml.Association#getSrc <em>Src</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.tests.uml.Association#getDst <em>Dst</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.tests.uml.UmlPackage#getAssociation()
 * @model kind="class"
 * @generated
 */
public class Association extends NamedElement {
	/**
	 * The cached value of the '{@link #getSrc() <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSrc()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.emf.henshin.tests.uml.Class src;

	/**
	 * The cached value of the '{@link #getDst() <em>Dst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDst()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.emf.henshin.tests.uml.Class dst;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Association() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UmlPackage.Literals.ASSOCIATION;
	}

	/**
	 * Returns the value of the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Src</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Src</em>' reference.
	 * @see #setSrc(org.eclipse.emf.henshin.tests.uml.Class)
	 * @see org.eclipse.emf.henshin.tests.uml.UmlPackage#getAssociation_Src()
	 * @model
	 * @generated
	 */
	public org.eclipse.emf.henshin.tests.uml.Class getSrc() {
		if (src != null && src.eIsProxy()) {
			InternalEObject oldSrc = (InternalEObject)src;
			src = (org.eclipse.emf.henshin.tests.uml.Class)eResolveProxy(oldSrc);
			if (src != oldSrc) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.ASSOCIATION__SRC, oldSrc, src));
			}
		}
		return src;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.emf.henshin.tests.uml.Class basicGetSrc() {
		return src;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.tests.uml.Association#getSrc <em>Src</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Src</em>' reference.
	 * @see #getSrc()
	 * @generated
	 */
	public void setSrc(org.eclipse.emf.henshin.tests.uml.Class newSrc) {
		org.eclipse.emf.henshin.tests.uml.Class oldSrc = src;
		src = newSrc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ASSOCIATION__SRC, oldSrc, src));
	}

	/**
	 * Returns the value of the '<em><b>Dst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dst</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dst</em>' reference.
	 * @see #setDst(org.eclipse.emf.henshin.tests.uml.Class)
	 * @see org.eclipse.emf.henshin.tests.uml.UmlPackage#getAssociation_Dst()
	 * @model
	 * @generated
	 */
	public org.eclipse.emf.henshin.tests.uml.Class getDst() {
		if (dst != null && dst.eIsProxy()) {
			InternalEObject oldDst = (InternalEObject)dst;
			dst = (org.eclipse.emf.henshin.tests.uml.Class)eResolveProxy(oldDst);
			if (dst != oldDst) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UmlPackage.ASSOCIATION__DST, oldDst, dst));
			}
		}
		return dst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.emf.henshin.tests.uml.Class basicGetDst() {
		return dst;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.tests.uml.Association#getDst <em>Dst</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dst</em>' reference.
	 * @see #getDst()
	 * @generated
	 */
	public void setDst(org.eclipse.emf.henshin.tests.uml.Class newDst) {
		org.eclipse.emf.henshin.tests.uml.Class oldDst = dst;
		dst = newDst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UmlPackage.ASSOCIATION__DST, oldDst, dst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UmlPackage.ASSOCIATION__SRC:
				if (resolve) return getSrc();
				return basicGetSrc();
			case UmlPackage.ASSOCIATION__DST:
				if (resolve) return getDst();
				return basicGetDst();
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
			case UmlPackage.ASSOCIATION__SRC:
				setSrc((org.eclipse.emf.henshin.tests.uml.Class)newValue);
				return;
			case UmlPackage.ASSOCIATION__DST:
				setDst((org.eclipse.emf.henshin.tests.uml.Class)newValue);
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
			case UmlPackage.ASSOCIATION__SRC:
				setSrc((org.eclipse.emf.henshin.tests.uml.Class)null);
				return;
			case UmlPackage.ASSOCIATION__DST:
				setDst((org.eclipse.emf.henshin.tests.uml.Class)null);
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
			case UmlPackage.ASSOCIATION__SRC:
				return src != null;
			case UmlPackage.ASSOCIATION__DST:
				return dst != null;
		}
		return super.eIsSet(featureID);
	}

} // Association
