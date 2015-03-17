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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.Clause;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ExecutableNode;
import org.modelexecution.fuml.Syntax.Classes.Kernel.impl.ElementImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clause</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ClauseImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ClauseImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ClauseImpl#getPredecessorClause <em>Predecessor Clause</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ClauseImpl#getSuccessorClause <em>Successor Clause</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ClauseImpl#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.ClauseImpl#getBodyOutput <em>Body Output</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClauseImpl extends ElementImpl implements Clause {
	/**
	 * The cached value of the '{@link #getTest() <em>Test</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> test;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> body;

	/**
	 * The cached value of the '{@link #getPredecessorClause() <em>Predecessor Clause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredecessorClause()
	 * @generated
	 * @ordered
	 */
	protected EList<Clause> predecessorClause;

	/**
	 * The cached value of the '{@link #getSuccessorClause() <em>Successor Clause</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuccessorClause()
	 * @generated
	 * @ordered
	 */
	protected EList<Clause> successorClause;

	/**
	 * The cached value of the '{@link #getDecider() <em>Decider</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecider()
	 * @generated
	 * @ordered
	 */
	protected OutputPin decider;

	/**
	 * The cached value of the '{@link #getBodyOutput() <em>Body Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> bodyOutput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClauseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteStructuredActivitiesPackage.Literals.CLAUSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getTest() {
		if (test == null) {
			test = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, CompleteStructuredActivitiesPackage.CLAUSE__TEST);
		}
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getBody() {
		if (body == null) {
			body = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, CompleteStructuredActivitiesPackage.CLAUSE__BODY);
		}
		return body;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clause> getPredecessorClause() {
		if (predecessorClause == null) {
			predecessorClause = new EObjectWithInverseResolvingEList.ManyInverse<Clause>(Clause.class, this, CompleteStructuredActivitiesPackage.CLAUSE__PREDECESSOR_CLAUSE, CompleteStructuredActivitiesPackage.CLAUSE__SUCCESSOR_CLAUSE);
		}
		return predecessorClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clause> getSuccessorClause() {
		if (successorClause == null) {
			successorClause = new EObjectWithInverseResolvingEList.ManyInverse<Clause>(Clause.class, this, CompleteStructuredActivitiesPackage.CLAUSE__SUCCESSOR_CLAUSE, CompleteStructuredActivitiesPackage.CLAUSE__PREDECESSOR_CLAUSE);
		}
		return successorClause;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin getDecider() {
		if (decider != null && decider.eIsProxy()) {
			InternalEObject oldDecider = (InternalEObject)decider;
			decider = (OutputPin)eResolveProxy(oldDecider);
			if (decider != oldDecider) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteStructuredActivitiesPackage.CLAUSE__DECIDER, oldDecider, decider));
			}
		}
		return decider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputPin basicGetDecider() {
		return decider;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecider(OutputPin newDecider) {
		OutputPin oldDecider = decider;
		decider = newDecider;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteStructuredActivitiesPackage.CLAUSE__DECIDER, oldDecider, decider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getBodyOutput() {
		if (bodyOutput == null) {
			bodyOutput = new EObjectResolvingEList<OutputPin>(OutputPin.class, this, CompleteStructuredActivitiesPackage.CLAUSE__BODY_OUTPUT);
		}
		return bodyOutput;
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
			case CompleteStructuredActivitiesPackage.CLAUSE__PREDECESSOR_CLAUSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPredecessorClause()).basicAdd(otherEnd, msgs);
			case CompleteStructuredActivitiesPackage.CLAUSE__SUCCESSOR_CLAUSE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSuccessorClause()).basicAdd(otherEnd, msgs);
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
			case CompleteStructuredActivitiesPackage.CLAUSE__PREDECESSOR_CLAUSE:
				return ((InternalEList<?>)getPredecessorClause()).basicRemove(otherEnd, msgs);
			case CompleteStructuredActivitiesPackage.CLAUSE__SUCCESSOR_CLAUSE:
				return ((InternalEList<?>)getSuccessorClause()).basicRemove(otherEnd, msgs);
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
			case CompleteStructuredActivitiesPackage.CLAUSE__TEST:
				return getTest();
			case CompleteStructuredActivitiesPackage.CLAUSE__BODY:
				return getBody();
			case CompleteStructuredActivitiesPackage.CLAUSE__PREDECESSOR_CLAUSE:
				return getPredecessorClause();
			case CompleteStructuredActivitiesPackage.CLAUSE__SUCCESSOR_CLAUSE:
				return getSuccessorClause();
			case CompleteStructuredActivitiesPackage.CLAUSE__DECIDER:
				if (resolve) return getDecider();
				return basicGetDecider();
			case CompleteStructuredActivitiesPackage.CLAUSE__BODY_OUTPUT:
				return getBodyOutput();
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
			case CompleteStructuredActivitiesPackage.CLAUSE__TEST:
				getTest().clear();
				getTest().addAll((Collection<? extends ExecutableNode>)newValue);
				return;
			case CompleteStructuredActivitiesPackage.CLAUSE__BODY:
				getBody().clear();
				getBody().addAll((Collection<? extends ExecutableNode>)newValue);
				return;
			case CompleteStructuredActivitiesPackage.CLAUSE__PREDECESSOR_CLAUSE:
				getPredecessorClause().clear();
				getPredecessorClause().addAll((Collection<? extends Clause>)newValue);
				return;
			case CompleteStructuredActivitiesPackage.CLAUSE__SUCCESSOR_CLAUSE:
				getSuccessorClause().clear();
				getSuccessorClause().addAll((Collection<? extends Clause>)newValue);
				return;
			case CompleteStructuredActivitiesPackage.CLAUSE__DECIDER:
				setDecider((OutputPin)newValue);
				return;
			case CompleteStructuredActivitiesPackage.CLAUSE__BODY_OUTPUT:
				getBodyOutput().clear();
				getBodyOutput().addAll((Collection<? extends OutputPin>)newValue);
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
			case CompleteStructuredActivitiesPackage.CLAUSE__TEST:
				getTest().clear();
				return;
			case CompleteStructuredActivitiesPackage.CLAUSE__BODY:
				getBody().clear();
				return;
			case CompleteStructuredActivitiesPackage.CLAUSE__PREDECESSOR_CLAUSE:
				getPredecessorClause().clear();
				return;
			case CompleteStructuredActivitiesPackage.CLAUSE__SUCCESSOR_CLAUSE:
				getSuccessorClause().clear();
				return;
			case CompleteStructuredActivitiesPackage.CLAUSE__DECIDER:
				setDecider((OutputPin)null);
				return;
			case CompleteStructuredActivitiesPackage.CLAUSE__BODY_OUTPUT:
				getBodyOutput().clear();
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
			case CompleteStructuredActivitiesPackage.CLAUSE__TEST:
				return test != null && !test.isEmpty();
			case CompleteStructuredActivitiesPackage.CLAUSE__BODY:
				return body != null && !body.isEmpty();
			case CompleteStructuredActivitiesPackage.CLAUSE__PREDECESSOR_CLAUSE:
				return predecessorClause != null && !predecessorClause.isEmpty();
			case CompleteStructuredActivitiesPackage.CLAUSE__SUCCESSOR_CLAUSE:
				return successorClause != null && !successorClause.isEmpty();
			case CompleteStructuredActivitiesPackage.CLAUSE__DECIDER:
				return decider != null;
			case CompleteStructuredActivitiesPackage.CLAUSE__BODY_OUTPUT:
				return bodyOutput != null && !bodyOutput.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClauseImpl
