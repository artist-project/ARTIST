/**
 */
package org.modelexecution.fuml.Syntax.Actions.BasicActions.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.BasicActionsPackage;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.CallAction;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Call Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.BasicActions.impl.CallActionImpl#isSynchronous <em>Synchronous</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.BasicActions.impl.CallActionImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CallActionImpl extends InvocationActionImpl implements CallAction {
	/**
	 * The default value of the '{@link #isSynchronous() <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronous()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SYNCHRONOUS_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSynchronous() <em>Synchronous</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSynchronous()
	 * @generated
	 * @ordered
	 */
	protected boolean synchronous = SYNCHRONOUS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResult() <em>Result</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResult()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> result;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BasicActionsPackage.Literals.CALL_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSynchronous() {
		return synchronous;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronous(boolean newSynchronous) {
		boolean oldSynchronous = synchronous;
		synchronous = newSynchronous;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BasicActionsPackage.CALL_ACTION__SYNCHRONOUS, oldSynchronous, synchronous));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, BasicActionsPackage.CALL_ACTION__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BasicActionsPackage.CALL_ACTION__RESULT:
				return ((InternalEList<?>)getResult()).basicRemove(otherEnd, msgs);
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
			case BasicActionsPackage.CALL_ACTION__SYNCHRONOUS:
				return isSynchronous();
			case BasicActionsPackage.CALL_ACTION__RESULT:
				return getResult();
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
			case BasicActionsPackage.CALL_ACTION__SYNCHRONOUS:
				setSynchronous((Boolean)newValue);
				return;
			case BasicActionsPackage.CALL_ACTION__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends OutputPin>)newValue);
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
			case BasicActionsPackage.CALL_ACTION__SYNCHRONOUS:
				setSynchronous(SYNCHRONOUS_EDEFAULT);
				return;
			case BasicActionsPackage.CALL_ACTION__RESULT:
				getResult().clear();
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
			case BasicActionsPackage.CALL_ACTION__SYNCHRONOUS:
				return synchronous != SYNCHRONOUS_EDEFAULT;
			case BasicActionsPackage.CALL_ACTION__RESULT:
				return result != null && !result.isEmpty();
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
		result.append(" (synchronous: ");
		result.append(synchronous);
		result.append(')');
		return result.toString();
	}

} //CallActionImpl
