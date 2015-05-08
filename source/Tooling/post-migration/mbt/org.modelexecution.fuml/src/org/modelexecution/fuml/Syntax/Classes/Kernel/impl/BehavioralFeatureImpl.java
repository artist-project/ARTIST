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
import org.modelexecution.fuml.Syntax.Classes.Kernel.BehavioralFeature;
import org.modelexecution.fuml.Syntax.Classes.Kernel.KernelPackage;
import org.modelexecution.fuml.Syntax.Classes.Kernel.Parameter;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.BasicBehaviorsPackage;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.Behavior;
import org.modelexecution.fuml.Syntax.CommonBehaviors.BasicBehaviors.CallConcurrencyKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Behavioral Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.BehavioralFeatureImpl#getOwnedParameter <em>Owned Parameter</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.BehavioralFeatureImpl#isAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.BehavioralFeatureImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Classes.Kernel.impl.BehavioralFeatureImpl#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BehavioralFeatureImpl extends FeatureImpl implements BehavioralFeature {
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
	 * The default value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAbstract() <em>Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean abstract_ = ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getMethod() <em>Method</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMethod()
	 * @generated
	 * @ordered
	 */
	protected EList<Behavior> method;

	/**
	 * The default value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected static final CallConcurrencyKind CONCURRENCY_EDEFAULT = CallConcurrencyKind.SEQUENTIAL;

	/**
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected CallConcurrencyKind concurrency = CONCURRENCY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BehavioralFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.BEHAVIORAL_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Parameter> getOwnedParameter() {
		if (ownedParameter == null) {
			ownedParameter = new EObjectContainmentEList<Parameter>(Parameter.class, this, KernelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER);
		}
		return ownedParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(boolean newAbstract) {
		boolean oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.BEHAVIORAL_FEATURE__ABSTRACT, oldAbstract, abstract_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getMethod() {
		if (method == null) {
			method = new EObjectWithInverseResolvingEList<Behavior>(Behavior.class, this, KernelPackage.BEHAVIORAL_FEATURE__METHOD, BasicBehaviorsPackage.BEHAVIOR__SPECIFICATION);
		}
		return method;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallConcurrencyKind getConcurrency() {
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConcurrency(CallConcurrencyKind newConcurrency) {
		CallConcurrencyKind oldConcurrency = concurrency;
		concurrency = newConcurrency == null ? CONCURRENCY_EDEFAULT : newConcurrency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.BEHAVIORAL_FEATURE__CONCURRENCY, oldConcurrency, concurrency));
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
			case KernelPackage.BEHAVIORAL_FEATURE__METHOD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMethod()).basicAdd(otherEnd, msgs);
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
			case KernelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
				return ((InternalEList<?>)getOwnedParameter()).basicRemove(otherEnd, msgs);
			case KernelPackage.BEHAVIORAL_FEATURE__METHOD:
				return ((InternalEList<?>)getMethod()).basicRemove(otherEnd, msgs);
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
			case KernelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
				return getOwnedParameter();
			case KernelPackage.BEHAVIORAL_FEATURE__ABSTRACT:
				return isAbstract();
			case KernelPackage.BEHAVIORAL_FEATURE__METHOD:
				return getMethod();
			case KernelPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				return getConcurrency();
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
			case KernelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				getOwnedParameter().addAll((Collection<? extends Parameter>)newValue);
				return;
			case KernelPackage.BEHAVIORAL_FEATURE__ABSTRACT:
				setAbstract((Boolean)newValue);
				return;
			case KernelPackage.BEHAVIORAL_FEATURE__METHOD:
				getMethod().clear();
				getMethod().addAll((Collection<? extends Behavior>)newValue);
				return;
			case KernelPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				setConcurrency((CallConcurrencyKind)newValue);
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
			case KernelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
				getOwnedParameter().clear();
				return;
			case KernelPackage.BEHAVIORAL_FEATURE__ABSTRACT:
				setAbstract(ABSTRACT_EDEFAULT);
				return;
			case KernelPackage.BEHAVIORAL_FEATURE__METHOD:
				getMethod().clear();
				return;
			case KernelPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				setConcurrency(CONCURRENCY_EDEFAULT);
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
			case KernelPackage.BEHAVIORAL_FEATURE__OWNED_PARAMETER:
				return ownedParameter != null && !ownedParameter.isEmpty();
			case KernelPackage.BEHAVIORAL_FEATURE__ABSTRACT:
				return abstract_ != ABSTRACT_EDEFAULT;
			case KernelPackage.BEHAVIORAL_FEATURE__METHOD:
				return method != null && !method.isEmpty();
			case KernelPackage.BEHAVIORAL_FEATURE__CONCURRENCY:
				return concurrency != CONCURRENCY_EDEFAULT;
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
		result.append(" (abstract: ");
		result.append(abstract_);
		result.append(", concurrency: ");
		result.append(concurrency);
		result.append(')');
		return result.toString();
	}

} //BehavioralFeatureImpl
