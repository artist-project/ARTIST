/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.EntryPointElement;
import eu.artist.migration.deployment.azure.csdef.NetFxAssemblyEntryPointElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entry Point Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.EntryPointElementImpl#getNetFxEntryPoint <em>Net Fx Entry Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntryPointElementImpl extends MinimalEObjectImpl.Container implements EntryPointElement {
	/**
	 * The cached value of the '{@link #getNetFxEntryPoint() <em>Net Fx Entry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetFxEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected NetFxAssemblyEntryPointElement netFxEntryPoint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntryPointElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.ENTRY_POINT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NetFxAssemblyEntryPointElement getNetFxEntryPoint() {
		return netFxEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNetFxEntryPoint(NetFxAssemblyEntryPointElement newNetFxEntryPoint, NotificationChain msgs) {
		NetFxAssemblyEntryPointElement oldNetFxEntryPoint = netFxEntryPoint;
		netFxEntryPoint = newNetFxEntryPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT, oldNetFxEntryPoint, newNetFxEntryPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNetFxEntryPoint(NetFxAssemblyEntryPointElement newNetFxEntryPoint) {
		if (newNetFxEntryPoint != netFxEntryPoint) {
			NotificationChain msgs = null;
			if (netFxEntryPoint != null)
				msgs = ((InternalEObject)netFxEntryPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT, null, msgs);
			if (newNetFxEntryPoint != null)
				msgs = ((InternalEObject)newNetFxEntryPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT, null, msgs);
			msgs = basicSetNetFxEntryPoint(newNetFxEntryPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT, newNetFxEntryPoint, newNetFxEntryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSDefPackage.ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT:
				return basicSetNetFxEntryPoint(null, msgs);
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
			case AzureCSDefPackage.ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT:
				return getNetFxEntryPoint();
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
			case AzureCSDefPackage.ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT:
				setNetFxEntryPoint((NetFxAssemblyEntryPointElement)newValue);
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
			case AzureCSDefPackage.ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT:
				setNetFxEntryPoint((NetFxAssemblyEntryPointElement)null);
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
			case AzureCSDefPackage.ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT:
				return netFxEntryPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //EntryPointElementImpl
