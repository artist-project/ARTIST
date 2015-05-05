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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.InputPin;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.OutputPin;
import org.modelexecution.fuml.Syntax.Actions.BasicActions.impl.ActionImpl;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.CompleteStructuredActivitiesPackage;
import org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.StructuredActivityNode;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityEdge;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.ActivityNode;
import org.modelexecution.fuml.Syntax.Activities.IntermediateActivities.IntermediateActivitiesPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Activity Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.StructuredActivityNodeImpl#getNode <em>Node</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.StructuredActivityNodeImpl#isMustIsolate <em>Must Isolate</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.StructuredActivityNodeImpl#getEdge <em>Edge</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.StructuredActivityNodeImpl#getStructuredNodeOutput <em>Structured Node Output</em>}</li>
 *   <li>{@link org.modelexecution.fuml.Syntax.Activities.CompleteStructuredActivities.impl.StructuredActivityNodeImpl#getStructuredNodeInput <em>Structured Node Input</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class StructuredActivityNodeImpl extends ActionImpl implements StructuredActivityNode {
	/**
	 * The cached value of the '{@link #getNode() <em>Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNode()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityNode> node;

	/**
	 * The default value of the '{@link #isMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_ISOLATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMustIsolate() <em>Must Isolate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustIsolate()
	 * @generated
	 * @ordered
	 */
	protected boolean mustIsolate = MUST_ISOLATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEdge() <em>Edge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEdge()
	 * @generated
	 * @ordered
	 */
	protected EList<ActivityEdge> edge;

	/**
	 * The cached value of the '{@link #getStructuredNodeOutput() <em>Structured Node Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredNodeOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<OutputPin> structuredNodeOutput;

	/**
	 * The cached value of the '{@link #getStructuredNodeInput() <em>Structured Node Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStructuredNodeInput()
	 * @generated
	 * @ordered
	 */
	protected EList<InputPin> structuredNodeInput;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredActivityNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CompleteStructuredActivitiesPackage.Literals.STRUCTURED_ACTIVITY_NODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityNode> getNode() {
		if (node == null) {
			node = new EObjectContainmentWithInverseEList<ActivityNode>(ActivityNode.class, this, CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE, IntermediateActivitiesPackage.ACTIVITY_NODE__IN_STRUCTURED_NODE);
		}
		return node;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMustIsolate() {
		return mustIsolate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustIsolate(boolean newMustIsolate) {
		boolean oldMustIsolate = mustIsolate;
		mustIsolate = newMustIsolate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE, oldMustIsolate, mustIsolate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActivityEdge> getEdge() {
		if (edge == null) {
			edge = new EObjectContainmentWithInverseEList<ActivityEdge>(ActivityEdge.class, this, CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE, IntermediateActivitiesPackage.ACTIVITY_EDGE__IN_STRUCTURED_NODE);
		}
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OutputPin> getStructuredNodeOutput() {
		if (structuredNodeOutput == null) {
			structuredNodeOutput = new EObjectContainmentEList<OutputPin>(OutputPin.class, this, CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT);
		}
		return structuredNodeOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputPin> getStructuredNodeInput() {
		if (structuredNodeInput == null) {
			structuredNodeInput = new EObjectContainmentEList<InputPin>(InputPin.class, this, CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT);
		}
		return structuredNodeInput;
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
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNode()).basicAdd(otherEnd, msgs);
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEdge()).basicAdd(otherEnd, msgs);
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
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				return ((InternalEList<?>)getNode()).basicRemove(otherEnd, msgs);
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return ((InternalEList<?>)getEdge()).basicRemove(otherEnd, msgs);
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				return ((InternalEList<?>)getStructuredNodeOutput()).basicRemove(otherEnd, msgs);
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return ((InternalEList<?>)getStructuredNodeInput()).basicRemove(otherEnd, msgs);
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
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				return getNode();
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return isMustIsolate();
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return getEdge();
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				return getStructuredNodeOutput();
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return getStructuredNodeInput();
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
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				getNode().clear();
				getNode().addAll((Collection<? extends ActivityNode>)newValue);
				return;
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate((Boolean)newValue);
				return;
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				getEdge().clear();
				getEdge().addAll((Collection<? extends ActivityEdge>)newValue);
				return;
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				getStructuredNodeOutput().clear();
				getStructuredNodeOutput().addAll((Collection<? extends OutputPin>)newValue);
				return;
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				getStructuredNodeInput().clear();
				getStructuredNodeInput().addAll((Collection<? extends InputPin>)newValue);
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
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				getNode().clear();
				return;
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				setMustIsolate(MUST_ISOLATE_EDEFAULT);
				return;
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				getEdge().clear();
				return;
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				getStructuredNodeOutput().clear();
				return;
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				getStructuredNodeInput().clear();
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
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__NODE:
				return node != null && !node.isEmpty();
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__MUST_ISOLATE:
				return mustIsolate != MUST_ISOLATE_EDEFAULT;
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__EDGE:
				return edge != null && !edge.isEmpty();
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_OUTPUT:
				return structuredNodeOutput != null && !structuredNodeOutput.isEmpty();
			case CompleteStructuredActivitiesPackage.STRUCTURED_ACTIVITY_NODE__STRUCTURED_NODE_INPUT:
				return structuredNodeInput != null && !structuredNodeInput.isEmpty();
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
		result.append(" (mustIsolate: ");
		result.append(mustIsolate);
		result.append(')');
		return result.toString();
	}

} //StructuredActivityNodeImpl
