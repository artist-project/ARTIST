/**
 */
package org.eclipse.emf.henshin.tests.testmodel;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>cont</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.tests.testmodel.cont#getContainsNode <em>Contains Node</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.tests.testmodel.cont#getContainsVal <em>Contains Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getcont()
 * @model kind="class"
 * @generated
 */
public class cont extends EObjectImpl implements EObject {
	/**
	 * The cached value of the '{@link #getContainsNode() <em>Contains Node</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> containsNode;

	/**
	 * The cached value of the '{@link #getContainsVal() <em>Contains Val</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainsVal()
	 * @generated
	 * @ordered
	 */
	protected EList<Val> containsVal;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected cont() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestmodelPackage.Literals.CONT;
	}

	/**
	 * Returns the value of the '<em><b>Contains Node</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.henshin.tests.testmodel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Node</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Node</em>' containment reference list.
	 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getcont_ContainsNode()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Node> getContainsNode() {
		if (containsNode == null) {
			containsNode = new EObjectContainmentEList<Node>(Node.class, this, TestmodelPackage.CONT__CONTAINS_NODE);
		}
		return containsNode;
	}

	/**
	 * Returns the value of the '<em><b>Contains Val</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.henshin.tests.testmodel.Val}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains Val</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains Val</em>' containment reference list.
	 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getcont_ContainsVal()
	 * @model containment="true"
	 * @generated
	 */
	public EList<Val> getContainsVal() {
		if (containsVal == null) {
			containsVal = new EObjectContainmentEList<Val>(Val.class, this, TestmodelPackage.CONT__CONTAINS_VAL);
		}
		return containsVal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestmodelPackage.CONT__CONTAINS_NODE:
				return ((InternalEList<?>)getContainsNode()).basicRemove(otherEnd, msgs);
			case TestmodelPackage.CONT__CONTAINS_VAL:
				return ((InternalEList<?>)getContainsVal()).basicRemove(otherEnd, msgs);
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
			case TestmodelPackage.CONT__CONTAINS_NODE:
				return getContainsNode();
			case TestmodelPackage.CONT__CONTAINS_VAL:
				return getContainsVal();
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
			case TestmodelPackage.CONT__CONTAINS_NODE:
				getContainsNode().clear();
				getContainsNode().addAll((Collection<? extends Node>)newValue);
				return;
			case TestmodelPackage.CONT__CONTAINS_VAL:
				getContainsVal().clear();
				getContainsVal().addAll((Collection<? extends Val>)newValue);
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
			case TestmodelPackage.CONT__CONTAINS_NODE:
				getContainsNode().clear();
				return;
			case TestmodelPackage.CONT__CONTAINS_VAL:
				getContainsVal().clear();
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
			case TestmodelPackage.CONT__CONTAINS_NODE:
				return containsNode != null && !containsNode.isEmpty();
			case TestmodelPackage.CONT__CONTAINS_VAL:
				return containsVal != null && !containsVal.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} // cont
