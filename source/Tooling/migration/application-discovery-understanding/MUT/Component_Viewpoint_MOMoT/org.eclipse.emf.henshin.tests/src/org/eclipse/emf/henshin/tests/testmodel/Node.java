/**
 */
package org.eclipse.emf.henshin.tests.testmodel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.tests.testmodel.Node#getHasVals <em>Has Vals</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.tests.testmodel.Node#getParentNode <em>Parent Node</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.tests.testmodel.Node#getChildNodes <em>Child Nodes</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.tests.testmodel.Node#getNodename <em>Nodename</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getNode()
 * @model kind="class"
 * @generated
 */
public class Node extends EObjectImpl implements EObject {
	/**
	 * The cached value of the '{@link #getHasVals() <em>Has Vals</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasVals()
	 * @generated
	 * @ordered
	 */
	protected EList<Val> hasVals;

	/**
	 * The cached value of the '{@link #getParentNode() <em>Parent Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentNode()
	 * @generated
	 * @ordered
	 */
	protected Node parentNode;

	/**
	 * The cached value of the '{@link #getChildNodes() <em>Child Nodes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildNodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> childNodes;

	/**
	 * The default value of the '{@link #getNodename() <em>Nodename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodename()
	 * @generated
	 * @ordered
	 */
	protected static final String NODENAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNodename() <em>Nodename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNodename()
	 * @generated
	 * @ordered
	 */
	protected String nodename = NODENAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Node() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestmodelPackage.Literals.NODE;
	}

	/**
	 * Returns the value of the '<em><b>Has Vals</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.henshin.tests.testmodel.Val}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Vals</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Vals</em>' reference list.
	 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getNode_HasVals()
	 * @model
	 * @generated
	 */
	public EList<Val> getHasVals() {
		if (hasVals == null) {
			hasVals = new EObjectResolvingEList<Val>(Val.class, this, TestmodelPackage.NODE__HAS_VALS);
		}
		return hasVals;
	}

	/**
	 * Returns the value of the '<em><b>Parent Node</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.henshin.tests.testmodel.Node#getChildNodes <em>Child Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent Node</em>' reference.
	 * @see #setParentNode(Node)
	 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getNode_ParentNode()
	 * @see org.eclipse.emf.henshin.tests.testmodel.Node#getChildNodes
	 * @model opposite="childNodes"
	 * @generated
	 */
	public Node getParentNode() {
		if (parentNode != null && parentNode.eIsProxy()) {
			InternalEObject oldParentNode = (InternalEObject)parentNode;
			parentNode = (Node)eResolveProxy(oldParentNode);
			if (parentNode != oldParentNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TestmodelPackage.NODE__PARENT_NODE, oldParentNode, parentNode));
			}
		}
		return parentNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Node basicGetParentNode() {
		return parentNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParentNode(Node newParentNode, NotificationChain msgs) {
		Node oldParentNode = parentNode;
		parentNode = newParentNode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TestmodelPackage.NODE__PARENT_NODE, oldParentNode, newParentNode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.tests.testmodel.Node#getParentNode <em>Parent Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent Node</em>' reference.
	 * @see #getParentNode()
	 * @generated
	 */
	public void setParentNode(Node newParentNode) {
		if (newParentNode != parentNode) {
			NotificationChain msgs = null;
			if (parentNode != null)
				msgs = ((InternalEObject)parentNode).eInverseRemove(this, TestmodelPackage.NODE__CHILD_NODES, Node.class, msgs);
			if (newParentNode != null)
				msgs = ((InternalEObject)newParentNode).eInverseAdd(this, TestmodelPackage.NODE__CHILD_NODES, Node.class, msgs);
			msgs = basicSetParentNode(newParentNode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestmodelPackage.NODE__PARENT_NODE, newParentNode, newParentNode));
	}

	/**
	 * Returns the value of the '<em><b>Child Nodes</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.henshin.tests.testmodel.Node}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.emf.henshin.tests.testmodel.Node#getParentNode <em>Parent Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child Nodes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child Nodes</em>' reference list.
	 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getNode_ChildNodes()
	 * @see org.eclipse.emf.henshin.tests.testmodel.Node#getParentNode
	 * @model opposite="parentNode"
	 * @generated
	 */
	public EList<Node> getChildNodes() {
		if (childNodes == null) {
			childNodes = new EObjectWithInverseResolvingEList<Node>(Node.class, this, TestmodelPackage.NODE__CHILD_NODES, TestmodelPackage.NODE__PARENT_NODE);
		}
		return childNodes;
	}

	/**
	 * Returns the value of the '<em><b>Nodename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nodename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nodename</em>' attribute.
	 * @see #setNodename(String)
	 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getNode_Nodename()
	 * @model
	 * @generated
	 */
	public String getNodename() {
		return nodename;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.tests.testmodel.Node#getNodename <em>Nodename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nodename</em>' attribute.
	 * @see #getNodename()
	 * @generated
	 */
	public void setNodename(String newNodename) {
		String oldNodename = nodename;
		nodename = newNodename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestmodelPackage.NODE__NODENAME, oldNodename, nodename));
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
			case TestmodelPackage.NODE__PARENT_NODE:
				if (parentNode != null)
					msgs = ((InternalEObject)parentNode).eInverseRemove(this, TestmodelPackage.NODE__CHILD_NODES, Node.class, msgs);
				return basicSetParentNode((Node)otherEnd, msgs);
			case TestmodelPackage.NODE__CHILD_NODES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildNodes()).basicAdd(otherEnd, msgs);
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
			case TestmodelPackage.NODE__PARENT_NODE:
				return basicSetParentNode(null, msgs);
			case TestmodelPackage.NODE__CHILD_NODES:
				return ((InternalEList<?>)getChildNodes()).basicRemove(otherEnd, msgs);
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
			case TestmodelPackage.NODE__HAS_VALS:
				return getHasVals();
			case TestmodelPackage.NODE__PARENT_NODE:
				if (resolve) return getParentNode();
				return basicGetParentNode();
			case TestmodelPackage.NODE__CHILD_NODES:
				return getChildNodes();
			case TestmodelPackage.NODE__NODENAME:
				return getNodename();
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
			case TestmodelPackage.NODE__HAS_VALS:
				getHasVals().clear();
				getHasVals().addAll((Collection<? extends Val>)newValue);
				return;
			case TestmodelPackage.NODE__PARENT_NODE:
				setParentNode((Node)newValue);
				return;
			case TestmodelPackage.NODE__CHILD_NODES:
				getChildNodes().clear();
				getChildNodes().addAll((Collection<? extends Node>)newValue);
				return;
			case TestmodelPackage.NODE__NODENAME:
				setNodename((String)newValue);
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
			case TestmodelPackage.NODE__HAS_VALS:
				getHasVals().clear();
				return;
			case TestmodelPackage.NODE__PARENT_NODE:
				setParentNode((Node)null);
				return;
			case TestmodelPackage.NODE__CHILD_NODES:
				getChildNodes().clear();
				return;
			case TestmodelPackage.NODE__NODENAME:
				setNodename(NODENAME_EDEFAULT);
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
			case TestmodelPackage.NODE__HAS_VALS:
				return hasVals != null && !hasVals.isEmpty();
			case TestmodelPackage.NODE__PARENT_NODE:
				return parentNode != null;
			case TestmodelPackage.NODE__CHILD_NODES:
				return childNodes != null && !childNodes.isEmpty();
			case TestmodelPackage.NODE__NODENAME:
				return NODENAME_EDEFAULT == null ? nodename != null : !NODENAME_EDEFAULT.equals(nodename);
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
		result.append(" (nodename: ");
		result.append(nodename);
		result.append(')');
		return result.toString();
	}

} // Node
