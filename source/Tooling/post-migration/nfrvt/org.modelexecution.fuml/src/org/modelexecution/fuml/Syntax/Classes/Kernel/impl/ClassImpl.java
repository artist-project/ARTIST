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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Classifier;
import org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Operation;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Property;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.impl.BehavioredClassifierImpl;
import org.modelexecution.fuml.Syntax.CommonBehaviors.Communications.Reception;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassImpl#getOwnedAttribute <em>Owned Attribute</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassImpl#getOwnedOperation <em>Owned Operation</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassImpl#getSuperClass <em>Super Class</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassImpl#isActive <em>Active</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassImpl#getOwnedReception <em>Owned Reception</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassImpl#getNestedClassifier <em>Nested Classifier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClassImpl extends BehavioredClassifierImpl implements org.modelexecution.fuml.Syntax.Classes.Kernel.Class {
	/**
	 * The cached value of the '{@link #getOwnedAttribute() <em>Owned Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Property> ownedAttribute;

	/**
	 * The cached value of the '{@link #getOwnedOperation() <em>Owned Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> ownedOperation;

	/**
	 * The cached value of the '{@link #getSuperClass() <em>Super Class</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperClass()
	 * @generated
	 * @ordered
	 */
	protected EList<org.modelexecution.fuml.Syntax.Classes.Kernel.Class> superClass;

	/**
	 * The default value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ACTIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isActive() <em>Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isActive()
	 * @generated
	 * @ordered
	 */
	protected boolean active = ACTIVE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedReception() <em>Owned Reception</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedReception()
	 * @generated
	 * @ordered
	 */
	protected EList<Reception> ownedReception;

	/**
	 * The cached value of the '{@link #getNestedClassifier() <em>Nested Classifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNestedClassifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Classifier> nestedClassifier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Property> getOwnedAttribute() {
		if (ownedAttribute == null) {
			ownedAttribute = new EObjectContainmentWithInverseEList<Property>(Property.class, this, KernelPackage.CLASS__OWNED_ATTRIBUTE, KernelPackage.PROPERTY__CLASS);
		}
		return ownedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOwnedOperation() {
		if (ownedOperation == null) {
			ownedOperation = new EObjectContainmentWithInverseEList<Operation>(Operation.class, this, KernelPackage.CLASS__OWNED_OPERATION, KernelPackage.OPERATION__CLASS);
		}
		return ownedOperation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.modelexecution.fuml.Syntax.Classes.Kernel.Class> getSuperClass() {
		if (superClass == null) {
			superClass = new EObjectResolvingEList<org.modelexecution.fuml.Syntax.Classes.Kernel.Class>(org.modelexecution.fuml.Syntax.Classes.Kernel.Class.class, this, KernelPackage.CLASS__SUPER_CLASS);
		}
		return superClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isActive() {
		return active;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActive(boolean newActive) {
		boolean oldActive = active;
		active = newActive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.CLASS__ACTIVE, oldActive, active));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reception> getOwnedReception() {
		if (ownedReception == null) {
			ownedReception = new EObjectContainmentEList<Reception>(Reception.class, this, KernelPackage.CLASS__OWNED_RECEPTION);
		}
		return ownedReception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getNestedClassifier() {
		if (nestedClassifier == null) {
			nestedClassifier = new EObjectContainmentEList<Classifier>(Classifier.class, this, KernelPackage.CLASS__NESTED_CLASSIFIER);
		}
		return nestedClassifier;
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
			case KernelPackage.CLASS__OWNED_ATTRIBUTE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedAttribute()).basicAdd(otherEnd, msgs);
			case KernelPackage.CLASS__OWNED_OPERATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedOperation()).basicAdd(otherEnd, msgs);
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
			case KernelPackage.CLASS__OWNED_ATTRIBUTE:
				return ((InternalEList<?>)getOwnedAttribute()).basicRemove(otherEnd, msgs);
			case KernelPackage.CLASS__OWNED_OPERATION:
				return ((InternalEList<?>)getOwnedOperation()).basicRemove(otherEnd, msgs);
			case KernelPackage.CLASS__OWNED_RECEPTION:
				return ((InternalEList<?>)getOwnedReception()).basicRemove(otherEnd, msgs);
			case KernelPackage.CLASS__NESTED_CLASSIFIER:
				return ((InternalEList<?>)getNestedClassifier()).basicRemove(otherEnd, msgs);
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
			case KernelPackage.CLASS__OWNED_ATTRIBUTE:
				return getOwnedAttribute();
			case KernelPackage.CLASS__OWNED_OPERATION:
				return getOwnedOperation();
			case KernelPackage.CLASS__SUPER_CLASS:
				return getSuperClass();
			case KernelPackage.CLASS__ACTIVE:
				return isActive();
			case KernelPackage.CLASS__OWNED_RECEPTION:
				return getOwnedReception();
			case KernelPackage.CLASS__NESTED_CLASSIFIER:
				return getNestedClassifier();
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
			case KernelPackage.CLASS__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				getOwnedAttribute().addAll((Collection<? extends Property>)newValue);
				return;
			case KernelPackage.CLASS__OWNED_OPERATION:
				getOwnedOperation().clear();
				getOwnedOperation().addAll((Collection<? extends Operation>)newValue);
				return;
			case KernelPackage.CLASS__SUPER_CLASS:
				getSuperClass().clear();
				getSuperClass().addAll((Collection<? extends org.modelexecution.fuml.Syntax.Classes.Kernel.Class>)newValue);
				return;
			case KernelPackage.CLASS__ACTIVE:
				setActive((Boolean)newValue);
				return;
			case KernelPackage.CLASS__OWNED_RECEPTION:
				getOwnedReception().clear();
				getOwnedReception().addAll((Collection<? extends Reception>)newValue);
				return;
			case KernelPackage.CLASS__NESTED_CLASSIFIER:
				getNestedClassifier().clear();
				getNestedClassifier().addAll((Collection<? extends Classifier>)newValue);
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
			case KernelPackage.CLASS__OWNED_ATTRIBUTE:
				getOwnedAttribute().clear();
				return;
			case KernelPackage.CLASS__OWNED_OPERATION:
				getOwnedOperation().clear();
				return;
			case KernelPackage.CLASS__SUPER_CLASS:
				getSuperClass().clear();
				return;
			case KernelPackage.CLASS__ACTIVE:
				setActive(ACTIVE_EDEFAULT);
				return;
			case KernelPackage.CLASS__OWNED_RECEPTION:
				getOwnedReception().clear();
				return;
			case KernelPackage.CLASS__NESTED_CLASSIFIER:
				getNestedClassifier().clear();
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
			case KernelPackage.CLASS__OWNED_ATTRIBUTE:
				return ownedAttribute != null && !ownedAttribute.isEmpty();
			case KernelPackage.CLASS__OWNED_OPERATION:
				return ownedOperation != null && !ownedOperation.isEmpty();
			case KernelPackage.CLASS__SUPER_CLASS:
				return superClass != null && !superClass.isEmpty();
			case KernelPackage.CLASS__ACTIVE:
				return active != ACTIVE_EDEFAULT;
			case KernelPackage.CLASS__OWNED_RECEPTION:
				return ownedReception != null && !ownedReception.isEmpty();
			case KernelPackage.CLASS__NESTED_CLASSIFIER:
				return nestedClassifier != null && !nestedClassifier.isEmpty();
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
		result.append(" (active: ");
		result.append(active);
		result.append(')');
		return result.toString();
	}

} //ClassImpl
