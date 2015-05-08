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
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage;
import org.modelexecution.fuml.Syntax.Classes.Kernel.PackageableElement;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PackageImpl#getPackagedElement <em>Packaged Element</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PackageImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PackageImpl#getNestedPackage <em>Nested Package</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.PackageImpl#getNestingPackage <em>Nesting Package</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PackageImpl extends NamespaceImpl implements org.modelexecution.fuml.Syntax.Classes.Kernel.Package {
	/**
	 * The cached value of the '{@link #getPackagedElement() <em>Packaged Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<PackageableElement> packagedElement;

	/**
	 * The cached value of the '{@link #getOwnedType() <em>Owned Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedType()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> ownedType;
	/**
	 * The cached value of the '{@link #getNestedPackage() <em>Nested Package</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedPackage()
	 * @generated
	 * @ordered
	 */
	protected EList<org.modelexecution.fuml.Syntax.Classes.Kernel.Package> nestedPackage;
	/**
	 * The cached value of the '{@link #getNestingPackage() <em>Nesting Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestingPackage()
	 * @generated
	 * @ordered
	 */
	protected org.modelexecution.fuml.Syntax.Classes.Kernel.Package nestingPackage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PackageableElement> getPackagedElement() {
		if (packagedElement == null) {
			packagedElement = new EObjectContainmentEList<PackageableElement>(PackageableElement.class, this, KernelPackage.PACKAGE__PACKAGED_ELEMENT);
		}
		return packagedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getOwnedType() {
		if (ownedType == null) {
			ownedType = new EObjectWithInverseResolvingEList<Type>(Type.class, this, KernelPackage.PACKAGE__OWNED_TYPE, KernelPackage.TYPE__PACKAGE);
		}
		return ownedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.modelexecution.fuml.Syntax.Classes.Kernel.Package> getNestedPackage() {
		if (nestedPackage == null) {
			nestedPackage = new EObjectWithInverseResolvingEList<org.modelexecution.fuml.Syntax.Classes.Kernel.Package>(org.modelexecution.fuml.Syntax.Classes.Kernel.Package.class, this, KernelPackage.PACKAGE__NESTED_PACKAGE, KernelPackage.PACKAGE__NESTING_PACKAGE);
		}
		return nestedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.modelexecution.fuml.Syntax.Classes.Kernel.Package getNestingPackage() {
		if (nestingPackage != null && nestingPackage.eIsProxy()) {
			InternalEObject oldNestingPackage = (InternalEObject)nestingPackage;
			nestingPackage = (org.modelexecution.fuml.Syntax.Classes.Kernel.Package)eResolveProxy(oldNestingPackage);
			if (nestingPackage != oldNestingPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, KernelPackage.PACKAGE__NESTING_PACKAGE, oldNestingPackage, nestingPackage));
			}
		}
		return nestingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.modelexecution.fuml.Syntax.Classes.Kernel.Package basicGetNestingPackage() {
		return nestingPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNestingPackage(org.modelexecution.fuml.Syntax.Classes.Kernel.Package newNestingPackage, NotificationChain msgs) {
		org.modelexecution.fuml.Syntax.Classes.Kernel.Package oldNestingPackage = nestingPackage;
		nestingPackage = newNestingPackage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KernelPackage.PACKAGE__NESTING_PACKAGE, oldNestingPackage, newNestingPackage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNestingPackage(org.modelexecution.fuml.Syntax.Classes.Kernel.Package newNestingPackage) {
		if (newNestingPackage != nestingPackage) {
			NotificationChain msgs = null;
			if (nestingPackage != null)
				msgs = ((InternalEObject)nestingPackage).eInverseRemove(this, KernelPackage.PACKAGE__NESTED_PACKAGE, org.modelexecution.fuml.Syntax.Classes.Kernel.Package.class, msgs);
			if (newNestingPackage != null)
				msgs = ((InternalEObject)newNestingPackage).eInverseAdd(this, KernelPackage.PACKAGE__NESTED_PACKAGE, org.modelexecution.fuml.Syntax.Classes.Kernel.Package.class, msgs);
			msgs = basicSetNestingPackage(newNestingPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.PACKAGE__NESTING_PACKAGE, newNestingPackage, newNestingPackage));
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
			case KernelPackage.PACKAGE__OWNED_TYPE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedType()).basicAdd(otherEnd, msgs);
			case KernelPackage.PACKAGE__NESTED_PACKAGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNestedPackage()).basicAdd(otherEnd, msgs);
			case KernelPackage.PACKAGE__NESTING_PACKAGE:
				if (nestingPackage != null)
					msgs = ((InternalEObject)nestingPackage).eInverseRemove(this, KernelPackage.PACKAGE__NESTED_PACKAGE, org.modelexecution.fuml.Syntax.Classes.Kernel.Package.class, msgs);
				return basicSetNestingPackage((org.modelexecution.fuml.Syntax.Classes.Kernel.Package)otherEnd, msgs);
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
			case KernelPackage.PACKAGE__PACKAGED_ELEMENT:
				return ((InternalEList<?>)getPackagedElement()).basicRemove(otherEnd, msgs);
			case KernelPackage.PACKAGE__OWNED_TYPE:
				return ((InternalEList<?>)getOwnedType()).basicRemove(otherEnd, msgs);
			case KernelPackage.PACKAGE__NESTED_PACKAGE:
				return ((InternalEList<?>)getNestedPackage()).basicRemove(otherEnd, msgs);
			case KernelPackage.PACKAGE__NESTING_PACKAGE:
				return basicSetNestingPackage(null, msgs);
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
			case KernelPackage.PACKAGE__PACKAGED_ELEMENT:
				return getPackagedElement();
			case KernelPackage.PACKAGE__OWNED_TYPE:
				return getOwnedType();
			case KernelPackage.PACKAGE__NESTED_PACKAGE:
				return getNestedPackage();
			case KernelPackage.PACKAGE__NESTING_PACKAGE:
				if (resolve) return getNestingPackage();
				return basicGetNestingPackage();
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
			case KernelPackage.PACKAGE__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				getPackagedElement().addAll((Collection<? extends PackageableElement>)newValue);
				return;
			case KernelPackage.PACKAGE__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection<? extends Type>)newValue);
				return;
			case KernelPackage.PACKAGE__NESTED_PACKAGE:
				getNestedPackage().clear();
				getNestedPackage().addAll((Collection<? extends org.modelexecution.fuml.Syntax.Classes.Kernel.Package>)newValue);
				return;
			case KernelPackage.PACKAGE__NESTING_PACKAGE:
				setNestingPackage((org.modelexecution.fuml.Syntax.Classes.Kernel.Package)newValue);
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
			case KernelPackage.PACKAGE__PACKAGED_ELEMENT:
				getPackagedElement().clear();
				return;
			case KernelPackage.PACKAGE__OWNED_TYPE:
				getOwnedType().clear();
				return;
			case KernelPackage.PACKAGE__NESTED_PACKAGE:
				getNestedPackage().clear();
				return;
			case KernelPackage.PACKAGE__NESTING_PACKAGE:
				setNestingPackage((org.modelexecution.fuml.Syntax.Classes.Kernel.Package)null);
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
			case KernelPackage.PACKAGE__PACKAGED_ELEMENT:
				return packagedElement != null && !packagedElement.isEmpty();
			case KernelPackage.PACKAGE__OWNED_TYPE:
				return ownedType != null && !ownedType.isEmpty();
			case KernelPackage.PACKAGE__NESTED_PACKAGE:
				return nestedPackage != null && !nestedPackage.isEmpty();
			case KernelPackage.PACKAGE__NESTING_PACKAGE:
				return nestingPackage != null;
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
