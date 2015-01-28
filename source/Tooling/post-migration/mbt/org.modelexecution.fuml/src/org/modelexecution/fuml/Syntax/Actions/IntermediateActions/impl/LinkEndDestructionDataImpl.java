/**
 */
package org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.IntermediateActionsPackage;
import org.modelexecution.fuml.Syntax.Actions.IntermediateActions.LinkEndDestructionData;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link End Destruction Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkEndDestructionDataImpl#isDestroyDuplicates <em>Destroy Duplicates</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Actions.IntermediateActions.impl.LinkEndDestructionDataImpl#getDestroyAt <em>Destroy At</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkEndDestructionDataImpl extends LinkEndDataImpl implements LinkEndDestructionData {
	/**
	 * The default value of the '{@link #isDestroyDuplicates() <em>Destroy Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestroyDuplicates()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DESTROY_DUPLICATES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDestroyDuplicates() <em>Destroy Duplicates</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDestroyDuplicates()
	 * @generated
	 * @ordered
	 */
	protected boolean destroyDuplicates = DESTROY_DUPLICATES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDestroyAt() <em>Destroy At</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestroyAt()
	 * @generated
	 * @ordered
	 */
	protected InputPin destroyAt;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEndDestructionDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return IntermediateActionsPackage.Literals.LINK_END_DESTRUCTION_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDestroyDuplicates() {
		return destroyDuplicates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestroyDuplicates(boolean newDestroyDuplicates) {
		boolean oldDestroyDuplicates = destroyDuplicates;
		destroyDuplicates = newDestroyDuplicates;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_DUPLICATES, oldDestroyDuplicates, destroyDuplicates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin getDestroyAt() {
		if (destroyAt != null && destroyAt.eIsProxy()) {
			InternalEObject oldDestroyAt = (InternalEObject)destroyAt;
			destroyAt = (InputPin)eResolveProxy(oldDestroyAt);
			if (destroyAt != oldDestroyAt) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT, oldDestroyAt, destroyAt));
			}
		}
		return destroyAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputPin basicGetDestroyAt() {
		return destroyAt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestroyAt(InputPin newDestroyAt) {
		InputPin oldDestroyAt = destroyAt;
		destroyAt = newDestroyAt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT, oldDestroyAt, destroyAt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_DUPLICATES:
				return isDestroyDuplicates();
			case IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT:
				if (resolve) return getDestroyAt();
				return basicGetDestroyAt();
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
			case IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_DUPLICATES:
				setDestroyDuplicates((Boolean)newValue);
				return;
			case IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT:
				setDestroyAt((InputPin)newValue);
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
			case IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_DUPLICATES:
				setDestroyDuplicates(DESTROY_DUPLICATES_EDEFAULT);
				return;
			case IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT:
				setDestroyAt((InputPin)null);
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
			case IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_DUPLICATES:
				return destroyDuplicates != DESTROY_DUPLICATES_EDEFAULT;
			case IntermediateActionsPackage.LINK_END_DESTRUCTION_DATA__DESTROY_AT:
				return destroyAt != null;
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
		result.append(" (destroyDuplicates: ");
		result.append(destroyDuplicates);
		result.append(')');
		return result.toString();
	}

} //LinkEndDestructionDataImpl
