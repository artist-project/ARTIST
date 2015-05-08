/**
 */
package org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature;
import org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Parameter;
import org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ClassImpl;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.Behavior;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BehavioredClassifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavior</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.impl.BehaviorImpl#getSpecification <em>Specification</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.impl.BehaviorImpl#isReentrant <em>Reentrant</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.impl.BehaviorImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.impl.BehaviorImpl#getContext <em>Context</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehaviorImpl extends ClassImpl implements Behavior {
	/**
	 * The cached value of the '{@link #getSpecification() <em>Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecification()
	 * @generated
	 * @ordered
	 */
	protected BehavioralFeature specification;

	/**
	 * The default value of the '{@link #isReentrant() <em>Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReentrant()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REENTRANT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReentrant() <em>Reentrant</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReentrant()
	 * @generated
	 * @ordered
	 */
	protected boolean reentrant = REENTRANT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOwnedParameter() <em>Owned Parameter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedParameter()
	 * @generated
	 * @ordered
	 */
	protected EList<Parameter> ownedParameter;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected BehavioredClassifier context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehaviorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicBehaviorsPackage.Literals.BEHAVIOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature getSpecification() {
		if (specification != null && specification.eIsProxy()) {
			InternalEObject oldSpecification = (InternalEObject)specification;
			specification = (BehavioralFeature)eResolveProxy(oldSpecification);
			if (specification != oldSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicBehaviorsPackage.BEHAVIOR__SPECIFICATION, oldSpecification, specification));
			}
		}
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioralFeature basicGetSpecification() {
		return specification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecification(BehavioralFeature newSpecification, NotificationChain msgs) {
		BehavioralFeature oldSpecification = specification;
		specification = newSpecification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BasicBehaviorsPackage.BEHAVIOR__SPECIFICATION, oldSpecification, newSpecification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecification(BehavioralFeature newSpecification) {
		if (newSpecification != specification) {
			NotificationChain msgs = null;
			if (specification != null)
				msgs = ((InternalEObject)specification).eInverseRemove(this, KernelPackage.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
			if (newSpecification != null)
				msgs = ((InternalEObject)newSpecification).eInverseAdd(this, KernelPackage.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
			msgs = basicSetSpecification(newSpecification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicBehaviorsPackage.BEHAVIOR__SPECIFICATION, newSpecification, newSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReentrant() {
		return reentrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReentrant(boolean newReentrant) {
		boolean oldReentrant = reentrant;
		reentrant = newReentrant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicBehaviorsPackage.BEHAVIOR__REENTRANT, oldReentrant, reentrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, BasicBehaviorsPackage.BEHAVIOR__OWNED_PARAMETER);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (BehavioredClassifier)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BasicBehaviorsPackage.BEHAVIOR__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(BehavioredClassifier newContext) {
		BehavioredClassifier oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicBehaviorsPackage.BEHAVIOR__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicBehaviorsPackage.BEHAVIOR__SPECIFICATION:
				if (specification != null)
					msgs = ((InternalEObject)specification).eInverseRemove(this, KernelPackage.BEHAVIORAL_FEATURE__METHOD, BehavioralFeature.class, msgs);
				return basicSetSpecification((BehavioralFeature)otherEnd, msgs);
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
			case BasicBehaviorsPackage.BEHAVIOR__SPECIFICATION:
				return basicSetSpecification(null, msgs);
			case BasicBehaviorsPackage.BEHAVIOR__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
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
			case BasicBehaviorsPackage.BEHAVIOR__SPECIFICATION:
				if (resolve) return getSpecification();
				return basicGetSpecification();
			case BasicBehaviorsPackage.BEHAVIOR__REENTRANT:
				return isReentrant();
			case BasicBehaviorsPackage.BEHAVIOR__OWNED_PARAMETER:
				return getOwnedParameter();
			case BasicBehaviorsPackage.BEHAVIOR__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
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
			case BasicBehaviorsPackage.BEHAVIOR__SPECIFICATION:
				setSpecification((BehavioralFeature)newValue);
				return;
			case BasicBehaviorsPackage.BEHAVIOR__REENTRANT:
				setReentrant((Boolean)newValue);
				return;
			case BasicBehaviorsPackage.BEHAVIOR__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case BasicBehaviorsPackage.BEHAVIOR__CONTEXT:
				setContext((BehavioredClassifier)newValue);
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
			case BasicBehaviorsPackage.BEHAVIOR__SPECIFICATION:
				setSpecification((BehavioralFeature)null);
				return;
			case BasicBehaviorsPackage.BEHAVIOR__REENTRANT:
				setReentrant(REENTRANT_EDEFAULT);
				return;
			case BasicBehaviorsPackage.BEHAVIOR__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case BasicBehaviorsPackage.BEHAVIOR__CONTEXT:
				setContext((BehavioredClassifier)null);
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
			case BasicBehaviorsPackage.BEHAVIOR__SPECIFICATION:
				return specification != null;
			case BasicBehaviorsPackage.BEHAVIOR__REENTRANT:
				return reentrant != REENTRANT_EDEFAULT;
			case BasicBehaviorsPackage.BEHAVIOR__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case BasicBehaviorsPackage.BEHAVIOR__CONTEXT:
				return context != null;
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
		result.append(" (reentrant: ");
		result.append(reentrant);
		result.append(')');
		return result.toString();
	}

} //BehaviorImpl
