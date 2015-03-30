/**
 */
package org.modelexecution.fuml.Semantics.Loci.LociL1.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.modelexecution.fuml.Semantics.Classes.Kernel.ExtensionalValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage;
import org.modelexecution.fuml.Semantics.Loci.LociL1.LociL1Package;
import org.modelexecution.fuml.Semantics.Loci.LociL1.Locus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Locus</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Semantics.Loci.LociL1.impl.LocusImpl#getExtensionalValues <em>Extensional Values</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LocusImpl extends EObjectImpl implements Locus {
	/**
	 * The cached value of the '{@link #getExtensionalValues() <em>Extensional Values</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExtensionalValues()
	 * @generated
	 * @ordered
	 */
	protected EList<ExtensionalValue> extensionalValues;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocusImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return LociL1Package.Literals.LOCUS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ExtensionalValue> getExtensionalValues() {
		if (extensionalValues == null) {
			extensionalValues = new EObjectContainmentWithInverseEList<ExtensionalValue>(ExtensionalValue.class, this, LociL1Package.LOCUS__EXTENSIONAL_VALUES, KernelPackage.EXTENSIONAL_VALUE__LOCUS);
		}
		return extensionalValues;
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
			case LociL1Package.LOCUS__EXTENSIONAL_VALUES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExtensionalValues()).basicAdd(otherEnd, msgs);
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
			case LociL1Package.LOCUS__EXTENSIONAL_VALUES:
				return ((InternalEList<?>)getExtensionalValues()).basicRemove(otherEnd, msgs);
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
			case LociL1Package.LOCUS__EXTENSIONAL_VALUES:
				return getExtensionalValues();
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
			case LociL1Package.LOCUS__EXTENSIONAL_VALUES:
				getExtensionalValues().clear();
				getExtensionalValues().addAll((Collection<? extends ExtensionalValue>)newValue);
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
			case LociL1Package.LOCUS__EXTENSIONAL_VALUES:
				getExtensionalValues().clear();
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
			case LociL1Package.LOCUS__EXTENSIONAL_VALUES:
				return extensionalValues != null && !extensionalValues.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //LocusImpl
