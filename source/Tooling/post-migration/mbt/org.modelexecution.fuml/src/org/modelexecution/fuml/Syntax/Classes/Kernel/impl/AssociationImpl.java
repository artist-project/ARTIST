/**
 */
package org.modelexecution.fuml.Syntax.Classes.Kernel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Association;
import org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Property;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.AssociationImpl#isDerived <em>Derived</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.AssociationImpl#getEndType <em>End Type</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.AssociationImpl#getMemberEnd <em>Member End</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.AssociationImpl#getNavigableOwnedEnd <em>Navigable Owned End</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.AssociationImpl#getOwnedEnd <em>Owned End</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssociationImpl extends ClassifierImpl implements Association {
	/**
	 * The default value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DERIVED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDerived() <em>Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean derived = DERIVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndType() <em>End Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> endType;

	/**
	 * The cached value of the '{@link #getMemberEnd() <em>Member End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> memberEnd;

	/**
	 * The cached value of the '{@link #getNavigableOwnedEnd() <em>Navigable Owned End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNavigableOwnedEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> navigableOwnedEnd;

	/**
	 * The cached value of the '{@link #getOwnedEnd() <em>Owned End</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEnd()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDerived() {
		return derived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDerived(boolean newDerived) {
		boolean oldDerived = derived;
		derived = newDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.ASSOCIATION__DERIVED, oldDerived, derived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getEndType() {
		if (endType == null) {
			endType = new EObjectResolvingEList<Type>(Type.class, this, KernelPackage.ASSOCIATION__END_TYPE);
		}
		return endType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getMemberEnd() {
		if (memberEnd == null) {
			memberEnd = new EObjectWithInverseResolvingEList<Property>(Property.class, this, KernelPackage.ASSOCIATION__MEMBER_END, KernelPackage.PROPERTY__ASSOCIATION);
		}
		return memberEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getNavigableOwnedEnd() {
		if (navigableOwnedEnd == null) {
			navigableOwnedEnd = new EObjectResolvingEList<Property>(Property.class, this, KernelPackage.ASSOCIATION__NAVIGABLE_OWNED_END);
		}
		return navigableOwnedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedEnd() {
		if (ownedEnd == null) {
			ownedEnd = new EObjectContainmentWithInverseEList<Property>(Property.class, this, KernelPackage.ASSOCIATION__OWNED_END, KernelPackage.PROPERTY__OWNING_ASSOCIATION);
		}
		return ownedEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KernelPackage.ASSOCIATION__MEMBER_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberEnd()).basicAdd(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__OWNED_END:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedEnd()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KernelPackage.ASSOCIATION__MEMBER_END:
				return ((InternalEList<?>)getMemberEnd()).basicRemove(otherEnd, msgs);
			case KernelPackage.ASSOCIATION__OWNED_END:
				return ((InternalEList<?>)getOwnedEnd()).basicRemove(otherEnd, msgs);
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
			case KernelPackage.ASSOCIATION__DERIVED:
				return isDerived();
			case KernelPackage.ASSOCIATION__END_TYPE:
				return getEndType();
			case KernelPackage.ASSOCIATION__MEMBER_END:
				return getMemberEnd();
			case KernelPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				return getNavigableOwnedEnd();
			case KernelPackage.ASSOCIATION__OWNED_END:
				return getOwnedEnd();
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
			case KernelPackage.ASSOCIATION__DERIVED:
				setDerived((Boolean)newValue);
				return;
			case KernelPackage.ASSOCIATION__END_TYPE:
				getEndType().clear();
				getEndType().addAll((Collection<? extends Type>)newValue);
				return;
			case KernelPackage.ASSOCIATION__MEMBER_END:
				getMemberEnd().clear();
				getMemberEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case KernelPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				getNavigableOwnedEnd().clear();
				getNavigableOwnedEnd().addAll((Collection<? extends Property>)newValue);
				return;
			case KernelPackage.ASSOCIATION__OWNED_END:
				getOwnedEnd().clear();
				getOwnedEnd().addAll((Collection<? extends Property>)newValue);
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
			case KernelPackage.ASSOCIATION__DERIVED:
				setDerived(DERIVED_EDEFAULT);
				return;
			case KernelPackage.ASSOCIATION__END_TYPE:
				getEndType().clear();
				return;
			case KernelPackage.ASSOCIATION__MEMBER_END:
				getMemberEnd().clear();
				return;
			case KernelPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				getNavigableOwnedEnd().clear();
				return;
			case KernelPackage.ASSOCIATION__OWNED_END:
				getOwnedEnd().clear();
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
			case KernelPackage.ASSOCIATION__DERIVED:
				return derived != DERIVED_EDEFAULT;
			case KernelPackage.ASSOCIATION__END_TYPE:
				return endType != null && !endType.isEmpty();
			case KernelPackage.ASSOCIATION__MEMBER_END:
				return memberEnd != null && !memberEnd.isEmpty();
			case KernelPackage.ASSOCIATION__NAVIGABLE_OWNED_END:
				return navigableOwnedEnd != null && !navigableOwnedEnd.isEmpty();
			case KernelPackage.ASSOCIATION__OWNED_END:
				return ownedEnd != null && !ownedEnd.isEmpty();
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
		result.append(" (derived: ");
		result.append(derived);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
