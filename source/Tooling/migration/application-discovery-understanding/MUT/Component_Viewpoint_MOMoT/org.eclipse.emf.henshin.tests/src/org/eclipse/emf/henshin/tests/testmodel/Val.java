/**
 */
package org.eclipse.emf.henshin.tests.testmodel;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Val</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.henshin.tests.testmodel.Val#getIntvl <em>Intvl</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.tests.testmodel.Val#getValname <em>Valname</em>}</li>
 *   <li>{@link org.eclipse.emf.henshin.tests.testmodel.Val#getIntlist <em>Intlist</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getVal()
 * @model kind="class"
 * @generated
 */
public class Val extends EObjectImpl implements EObject {
	/**
	 * The default value of the '{@link #getIntvl() <em>Intvl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntvl()
	 * @generated
	 * @ordered
	 */
	protected static final int INTVL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getIntvl() <em>Intvl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntvl()
	 * @generated
	 * @ordered
	 */
	protected int intvl = INTVL_EDEFAULT;

	/**
	 * The default value of the '{@link #getValname() <em>Valname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValname()
	 * @generated
	 * @ordered
	 */
	protected static final String VALNAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValname() <em>Valname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValname()
	 * @generated
	 * @ordered
	 */
	protected String valname = VALNAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getIntlist() <em>Intlist</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntlist()
	 * @generated
	 * @ordered
	 */
	protected EList<Integer> intlist;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Val() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestmodelPackage.Literals.VAL;
	}

	/**
	 * Returns the value of the '<em><b>Intvl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intvl</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intvl</em>' attribute.
	 * @see #setIntvl(int)
	 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getVal_Intvl()
	 * @model
	 * @generated
	 */
	public int getIntvl() {
		return intvl;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.tests.testmodel.Val#getIntvl <em>Intvl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Intvl</em>' attribute.
	 * @see #getIntvl()
	 * @generated
	 */
	public void setIntvl(int newIntvl) {
		int oldIntvl = intvl;
		intvl = newIntvl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestmodelPackage.VAL__INTVL, oldIntvl, intvl));
	}

	/**
	 * Returns the value of the '<em><b>Valname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Valname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Valname</em>' attribute.
	 * @see #setValname(String)
	 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getVal_Valname()
	 * @model
	 * @generated
	 */
	public String getValname() {
		return valname;
	}

	/**
	 * Sets the value of the '{@link org.eclipse.emf.henshin.tests.testmodel.Val#getValname <em>Valname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Valname</em>' attribute.
	 * @see #getValname()
	 * @generated
	 */
	public void setValname(String newValname) {
		String oldValname = valname;
		valname = newValname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestmodelPackage.VAL__VALNAME, oldValname, valname));
	}

	/**
	 * Returns the value of the '<em><b>Intlist</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Integer}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intlist</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intlist</em>' attribute list.
	 * @see org.eclipse.emf.henshin.tests.testmodel.TestmodelPackage#getVal_Intlist()
	 * @model
	 * @generated
	 */
	public EList<Integer> getIntlist() {
		if (intlist == null) {
			intlist = new EDataTypeUniqueEList<Integer>(Integer.class, this, TestmodelPackage.VAL__INTLIST);
		}
		return intlist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestmodelPackage.VAL__INTVL:
				return getIntvl();
			case TestmodelPackage.VAL__VALNAME:
				return getValname();
			case TestmodelPackage.VAL__INTLIST:
				return getIntlist();
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
			case TestmodelPackage.VAL__INTVL:
				setIntvl((Integer)newValue);
				return;
			case TestmodelPackage.VAL__VALNAME:
				setValname((String)newValue);
				return;
			case TestmodelPackage.VAL__INTLIST:
				getIntlist().clear();
				getIntlist().addAll((Collection<? extends Integer>)newValue);
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
			case TestmodelPackage.VAL__INTVL:
				setIntvl(INTVL_EDEFAULT);
				return;
			case TestmodelPackage.VAL__VALNAME:
				setValname(VALNAME_EDEFAULT);
				return;
			case TestmodelPackage.VAL__INTLIST:
				getIntlist().clear();
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
			case TestmodelPackage.VAL__INTVL:
				return intvl != INTVL_EDEFAULT;
			case TestmodelPackage.VAL__VALNAME:
				return VALNAME_EDEFAULT == null ? valname != null : !VALNAME_EDEFAULT.equals(valname);
			case TestmodelPackage.VAL__INTLIST:
				return intlist != null && !intlist.isEmpty();
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
		result.append(" (intvl: ");
		result.append(intvl);
		result.append(", valname: ");
		result.append(valname);
		result.append(", intlist: ");
		result.append(intlist);
		result.append(')');
		return result.toString();
	}

} // Val
