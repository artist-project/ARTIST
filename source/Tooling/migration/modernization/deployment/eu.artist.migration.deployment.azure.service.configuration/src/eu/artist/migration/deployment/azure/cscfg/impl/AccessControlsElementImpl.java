/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AccessControlElement;
import eu.artist.migration.deployment.azure.cscfg.AccessControlsElement;
import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Controls Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.AccessControlsElementImpl#getAccessControl <em>Access Control</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessControlsElementImpl extends MinimalEObjectImpl.Container implements AccessControlsElement {
	/**
	 * The cached value of the '{@link #getAccessControl() <em>Access Control</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccessControl()
	 * @generated
	 * @ordered
	 */
	protected EList<AccessControlElement> accessControl;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessControlsElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.ACCESS_CONTROLS_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AccessControlElement> getAccessControl() {
		if (accessControl == null) {
			accessControl = new EObjectContainmentEList<AccessControlElement>(AccessControlElement.class, this, AzureCSCfgPackage.ACCESS_CONTROLS_ELEMENT__ACCESS_CONTROL);
		}
		return accessControl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSCfgPackage.ACCESS_CONTROLS_ELEMENT__ACCESS_CONTROL:
				return ((InternalEList<?>)getAccessControl()).basicRemove(otherEnd, msgs);
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
			case AzureCSCfgPackage.ACCESS_CONTROLS_ELEMENT__ACCESS_CONTROL:
				return getAccessControl();
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
			case AzureCSCfgPackage.ACCESS_CONTROLS_ELEMENT__ACCESS_CONTROL:
				getAccessControl().clear();
				getAccessControl().addAll((Collection<? extends AccessControlElement>)newValue);
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
			case AzureCSCfgPackage.ACCESS_CONTROLS_ELEMENT__ACCESS_CONTROL:
				getAccessControl().clear();
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
			case AzureCSCfgPackage.ACCESS_CONTROLS_ELEMENT__ACCESS_CONTROL:
				return accessControl != null && !accessControl.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //AccessControlsElementImpl
