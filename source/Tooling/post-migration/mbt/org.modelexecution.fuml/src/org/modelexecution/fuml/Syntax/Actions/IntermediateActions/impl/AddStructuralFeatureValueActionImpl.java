/**
 */
package org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.AddStructuralFeatureValueAction;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Add Structural Feature Value Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.AddStructuralFeatureValueActionImpl#isReplaceAll <em>Replace All</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.AddStructuralFeatureValueActionImpl#getInsertAt <em>Insert At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AddStructuralFeatureValueActionImpl extends WriteStructuralFeatureActionImpl implements AddStructuralFeatureValueAction {
	/**
	 * The default value of the '{@link #isReplaceAll() <em>Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPLACE_ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReplaceAll() <em>Replace All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReplaceAll()
	 * @generated
	 * @ordered
	 */
	protected boolean replaceAll = REPLACE_ALL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getInsertAt() <em>Insert At</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsertAt()
	 * @generated
	 * @ordered
	 */
	protected InputPin insertAt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AddStructuralFeatureValueActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActionsPackage.Literals.ADD_STRUCTURAL_FEATURE_VALUE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isReplaceAll() {
		return replaceAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReplaceAll(boolean newReplaceAll) {
		boolean oldReplaceAll = replaceAll;
		replaceAll = newReplaceAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REPLACE_ALL, oldReplaceAll, replaceAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getInsertAt() {
		return insertAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsertAt(InputPin newInsertAt, NotificationChain msgs) {
		InputPin oldInsertAt = insertAt;
		insertAt = newInsertAt;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IntermediateActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT, oldInsertAt, newInsertAt);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsertAt(InputPin newInsertAt) {
		if (newInsertAt != insertAt) {
			NotificationChain msgs = null;
			if (insertAt != null)
				msgs = ((InternalEObject)insertAt).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IntermediateActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT, null, msgs);
			if (newInsertAt != null)
				msgs = ((InternalEObject)newInsertAt).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IntermediateActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT, null, msgs);
			msgs = basicSetInsertAt(newInsertAt, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT, newInsertAt, newInsertAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case IntermediateActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT:
				return basicSetInsertAt(null, msgs);
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
			case IntermediateActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REPLACE_ALL:
				return isReplaceAll();
			case IntermediateActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT:
				return getInsertAt();
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
			case IntermediateActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REPLACE_ALL:
				setReplaceAll((Boolean)newValue);
				return;
			case IntermediateActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT:
				setInsertAt((InputPin)newValue);
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
			case IntermediateActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REPLACE_ALL:
				setReplaceAll(REPLACE_ALL_EDEFAULT);
				return;
			case IntermediateActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT:
				setInsertAt((InputPin)null);
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
			case IntermediateActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__REPLACE_ALL:
				return replaceAll != REPLACE_ALL_EDEFAULT;
			case IntermediateActionsPackage.ADD_STRUCTURAL_FEATURE_VALUE_ACTION__INSERT_AT:
				return insertAt != null;
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
		result.append(" (replaceAll: ");
		result.append(replaceAll);
		result.append(')');
		return result.toString();
	}

} //AddStructuralFeatureValueActionImpl
