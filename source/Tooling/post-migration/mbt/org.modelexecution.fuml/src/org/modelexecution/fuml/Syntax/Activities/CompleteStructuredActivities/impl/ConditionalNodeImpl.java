/**
 */
package org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ConditionalNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ConditionalNodeImpl#isDeterminate <em>Determinate</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ConditionalNodeImpl#isAssured <em>Assured</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ConditionalNodeImpl#getClause <em>Clause</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ConditionalNodeImpl#getResult <em>Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ConditionalNodeImpl extends StructuredActivityNodeImpl implements ConditionalNode {
	/**
	 * The default value of the '{@link #isDeterminate() <em>Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeterminate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean DETERMINATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDeterminate() <em>Determinate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDeterminate()
	 * @generated
	 * @ordered
	 */
	protected boolean determinate = DETERMINATE_EDEFAULT;

	/**
	 * The default value of the '{@link #isAssured() <em>Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssured()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ASSURED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAssured() <em>Assured</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAssured()
	 * @generated
	 * @ordered
	 */
	protected boolean assured = ASSURED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getClause() <em>Clause</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClause()
	 * @generated
	 * @ordered
	 */
	protected EList<Clause> clause;

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
	protected ConditionalNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteStructuredActivitiesPackage.Literals.CONDITIONAL_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDeterminate() {
		return determinate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeterminate(boolean newDeterminate) {
		boolean oldDeterminate = determinate;
		determinate = newDeterminate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__DETERMINATE, oldDeterminate, determinate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAssured() {
		return assured;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssured(boolean newAssured) {
		boolean oldAssured = assured;
		assured = newAssured;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__ASSURED, oldAssured, assured));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clause> getClause() {
		if (clause == null) {
			clause = new EObjectContainmentEList<Clause>(Clause.class, this, CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__CLAUSE);
		}
		return clause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__RESULT);
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
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__CLAUSE:
				return ((InternalEList<?>)getClause()).basicRemove(otherEnd, msgs);
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__RESULT:
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
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__DETERMINATE:
				return isDeterminate();
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__ASSURED:
				return isAssured();
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__CLAUSE:
				return getClause();
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__RESULT:
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
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__DETERMINATE:
				setDeterminate((Boolean)newValue);
				return;
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__ASSURED:
				setAssured((Boolean)newValue);
				return;
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__CLAUSE:
				getClause().clear();
				getClause().addAll((Collection<? extends Clause>)newValue);
				return;
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__RESULT:
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
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__DETERMINATE:
				setDeterminate(DETERMINATE_EDEFAULT);
				return;
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__ASSURED:
				setAssured(ASSURED_EDEFAULT);
				return;
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__CLAUSE:
				getClause().clear();
				return;
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__RESULT:
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
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__DETERMINATE:
				return determinate != DETERMINATE_EDEFAULT;
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__ASSURED:
				return assured != ASSURED_EDEFAULT;
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__CLAUSE:
				return clause != null && !clause.isEmpty();
			case CompleteStructuredActivitiesPackage.CONDITIONAL_NODE__RESULT:
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
		result.append(" (determinate: ");
		result.append(determinate);
		result.append(", assured: ");
		result.append(assured);
		result.append(')');
		return result.toString();
	}

} //ConditionalNodeImpl
