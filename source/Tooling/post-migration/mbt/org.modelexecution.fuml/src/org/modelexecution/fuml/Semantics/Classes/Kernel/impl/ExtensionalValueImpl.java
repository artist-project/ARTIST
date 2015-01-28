/**
 */
package org.modelexecution.fuml.Semantics.Classes.Kernel.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.modelexecution.fuml.Semantics.Classes.Kernel.ExtensionalValue;
import org.modelexecution.fuml.Semantics.Classes.Kernel.KernelPackage;
import org.modelexecution.fuml.Semantics.Loci.LociL1.LociL1Package;
import org.modelexecution.fuml.Semantics.Loci.LociL1.Locus;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Extensional Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.modelexecution.fuml.Semantics.Classes.Kernel.impl.ExtensionalValueImpl#getLocus <em>Locus</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ExtensionalValueImpl extends CompoundValueImpl implements ExtensionalValue {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExtensionalValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KernelPackage.Literals.EXTENSIONAL_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Locus getLocus() {
		if (eContainerFeatureID() != KernelPackage.EXTENSIONAL_VALUE__LOCUS) return null;
		return (Locus)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocus(Locus newLocus, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newLocus, KernelPackage.EXTENSIONAL_VALUE__LOCUS, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocus(Locus newLocus) {
		if (newLocus != eInternalContainer() || (eContainerFeatureID() != KernelPackage.EXTENSIONAL_VALUE__LOCUS && newLocus != null)) {
			if (EcoreUtil.isAncestor(this, newLocus))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newLocus != null)
				msgs = ((InternalEObject)newLocus).eInverseAdd(this, LociL1Package.LOCUS__EXTENSIONAL_VALUES, Locus.class, msgs);
			msgs = basicSetLocus(newLocus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KernelPackage.EXTENSIONAL_VALUE__LOCUS, newLocus, newLocus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KernelPackage.EXTENSIONAL_VALUE__LOCUS:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetLocus((Locus)otherEnd, msgs);
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
			case KernelPackage.EXTENSIONAL_VALUE__LOCUS:
				return basicSetLocus(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case KernelPackage.EXTENSIONAL_VALUE__LOCUS:
				return eInternalContainer().eInverseRemove(this, LociL1Package.LOCUS__EXTENSIONAL_VALUES, Locus.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KernelPackage.EXTENSIONAL_VALUE__LOCUS:
				return getLocus();
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
			case KernelPackage.EXTENSIONAL_VALUE__LOCUS:
				setLocus((Locus)newValue);
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
			case KernelPackage.EXTENSIONAL_VALUE__LOCUS:
				setLocus((Locus)null);
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
			case KernelPackage.EXTENSIONAL_VALUE__LOCUS:
				return getLocus() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExtensionalValueImpl
