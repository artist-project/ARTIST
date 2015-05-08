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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.ExecutableNode;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.LoopNode;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.LoopNodeImpl#isTestedFirst <em>Tested First</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.LoopNodeImpl#getDecider <em>Decider</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.LoopNodeImpl#getTest <em>Test</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.LoopNodeImpl#getBodyOutput <em>Body Output</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.LoopNodeImpl#getLoopVariableInput <em>Loop Variable Input</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.LoopNodeImpl#getBodyPart <em>Body Part</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.LoopNodeImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.LoopNodeImpl#getLoopVariable <em>Loop Variable</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.LoopNodeImpl#getSetupPart <em>Setup Part</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoopNodeImpl extends StructuredActivityNodeImpl implements LoopNode {
	/**
	 * The default value of the '{@link #isTestedFirst() <em>Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestedFirst()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TESTED_FIRST_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTestedFirst() <em>Tested First</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTestedFirst()
	 * @generated
	 * @ordered
	 */
	protected boolean testedFirst = TESTED_FIRST_EDEFAULT;

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
	 * The cached value of the '{@link #getTest() <em>Test</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTest()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> test;

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
	 * The cached value of the '{@link #getLoopVariableInput() <em>Loop Variable Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVariableInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> loopVariableInput;

	/**
	 * The cached value of the '{@link #getBodyPart() <em>Body Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBodyPart()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> bodyPart;

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
	 * The cached value of the '{@link #getLoopVariable() <em>Loop Variable</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLoopVariable()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> loopVariable;

	/**
	 * The cached value of the '{@link #getSetupPart() <em>Setup Part</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetupPart()
	 * @generated
	 * @ordered
	 */
	protected EList<ExecutableNode> setupPart;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteStructuredActivitiesPackage.Literals.LOOP_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTestedFirst() {
		return testedFirst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestedFirst(boolean newTestedFirst) {
		boolean oldTestedFirst = testedFirst;
		testedFirst = newTestedFirst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteStructuredActivitiesPackage.LOOP_NODE__TESTED_FIRST, oldTestedFirst, testedFirst));
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, CompleteStructuredActivitiesPackage.LOOP_NODE__DECIDER, oldDecider, decider));
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
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteStructuredActivitiesPackage.LOOP_NODE__DECIDER, oldDecider, decider));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getTest() {
		if (test == null) {
			test = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, CompleteStructuredActivitiesPackage.LOOP_NODE__TEST);
		}
		return test;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getBodyOutput() {
		if (bodyOutput == null) {
			bodyOutput = new EObjectResolvingEList<OutputPin>(OutputPin.class, this, CompleteStructuredActivitiesPackage.LOOP_NODE__BODY_OUTPUT);
		}
		return bodyOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getLoopVariableInput() {
		if (loopVariableInput == null) {
			loopVariableInput = new EObjectContainmentEList<InputPin>(InputPin.class, this, CompleteStructuredActivitiesPackage.LOOP_NODE__LOOP_VARIABLE_INPUT);
		}
		return loopVariableInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getBodyPart() {
		if (bodyPart == null) {
			bodyPart = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, CompleteStructuredActivitiesPackage.LOOP_NODE__BODY_PART);
		}
		return bodyPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getResult() {
		if (result == null) {
			result = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, CompleteStructuredActivitiesPackage.LOOP_NODE__RESULT);
		}
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getLoopVariable() {
		if (loopVariable == null) {
			loopVariable = new EObjectResolvingEList<OutputPin>(OutputPin.class, this, CompleteStructuredActivitiesPackage.LOOP_NODE__LOOP_VARIABLE);
		}
		return loopVariable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExecutableNode> getSetupPart() {
		if (setupPart == null) {
			setupPart = new EObjectResolvingEList<ExecutableNode>(ExecutableNode.class, this, CompleteStructuredActivitiesPackage.LOOP_NODE__SETUP_PART);
		}
		return setupPart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CompleteStructuredActivitiesPackage.LOOP_NODE__LOOP_VARIABLE_INPUT:
				return ((InternalEList<?>)getLoopVariableInput()).basicRemove(otherEnd, msgs);
			case CompleteStructuredActivitiesPackage.LOOP_NODE__RESULT:
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
			case CompleteStructuredActivitiesPackage.LOOP_NODE__TESTED_FIRST:
				return isTestedFirst();
			case CompleteStructuredActivitiesPackage.LOOP_NODE__DECIDER:
				if (resolve) return getDecider();
				return basicGetDecider();
			case CompleteStructuredActivitiesPackage.LOOP_NODE__TEST:
				return getTest();
			case CompleteStructuredActivitiesPackage.LOOP_NODE__BODY_OUTPUT:
				return getBodyOutput();
			case CompleteStructuredActivitiesPackage.LOOP_NODE__LOOP_VARIABLE_INPUT:
				return getLoopVariableInput();
			case CompleteStructuredActivitiesPackage.LOOP_NODE__BODY_PART:
				return getBodyPart();
			case CompleteStructuredActivitiesPackage.LOOP_NODE__RESULT:
				return getResult();
			case CompleteStructuredActivitiesPackage.LOOP_NODE__LOOP_VARIABLE:
				return getLoopVariable();
			case CompleteStructuredActivitiesPackage.LOOP_NODE__SETUP_PART:
				return getSetupPart();
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
			case CompleteStructuredActivitiesPackage.LOOP_NODE__TESTED_FIRST:
				setTestedFirst((Boolean)newValue);
				return;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__DECIDER:
				setDecider((OutputPin)newValue);
				return;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__TEST:
				getTest().clear();
				getTest().addAll((Collection<? extends ExecutableNode>)newValue);
				return;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__BODY_OUTPUT:
				getBodyOutput().clear();
				getBodyOutput().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__LOOP_VARIABLE_INPUT:
				getLoopVariableInput().clear();
				getLoopVariableInput().addAll((Collection<? extends InputPin>)newValue);
				return;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__BODY_PART:
				getBodyPart().clear();
				getBodyPart().addAll((Collection<? extends ExecutableNode>)newValue);
				return;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__RESULT:
				getResult().clear();
				getResult().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__LOOP_VARIABLE:
				getLoopVariable().clear();
				getLoopVariable().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__SETUP_PART:
				getSetupPart().clear();
				getSetupPart().addAll((Collection<? extends ExecutableNode>)newValue);
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
			case CompleteStructuredActivitiesPackage.LOOP_NODE__TESTED_FIRST:
				setTestedFirst(TESTED_FIRST_EDEFAULT);
				return;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__DECIDER:
				setDecider((OutputPin)null);
				return;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__TEST:
				getTest().clear();
				return;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__BODY_OUTPUT:
				getBodyOutput().clear();
				return;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__LOOP_VARIABLE_INPUT:
				getLoopVariableInput().clear();
				return;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__BODY_PART:
				getBodyPart().clear();
				return;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__RESULT:
				getResult().clear();
				return;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__LOOP_VARIABLE:
				getLoopVariable().clear();
				return;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__SETUP_PART:
				getSetupPart().clear();
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
			case CompleteStructuredActivitiesPackage.LOOP_NODE__TESTED_FIRST:
				return testedFirst != TESTED_FIRST_EDEFAULT;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__DECIDER:
				return decider != null;
			case CompleteStructuredActivitiesPackage.LOOP_NODE__TEST:
				return test != null && !test.isEmpty();
			case CompleteStructuredActivitiesPackage.LOOP_NODE__BODY_OUTPUT:
				return bodyOutput != null && !bodyOutput.isEmpty();
			case CompleteStructuredActivitiesPackage.LOOP_NODE__LOOP_VARIABLE_INPUT:
				return loopVariableInput != null && !loopVariableInput.isEmpty();
			case CompleteStructuredActivitiesPackage.LOOP_NODE__BODY_PART:
				return bodyPart != null && !bodyPart.isEmpty();
			case CompleteStructuredActivitiesPackage.LOOP_NODE__RESULT:
				return result != null && !result.isEmpty();
			case CompleteStructuredActivitiesPackage.LOOP_NODE__LOOP_VARIABLE:
				return loopVariable != null && !loopVariable.isEmpty();
			case CompleteStructuredActivitiesPackage.LOOP_NODE__SETUP_PART:
				return setupPart != null && !setupPart.isEmpty();
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
		result.append(" (testedFirst: ");
		result.append(testedFirst);
		result.append(')');
		return result.toString();
	}

} //LoopNodeImpl
