/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.NetFxAssemblyEntryPointElement;
import eu.artist.migration.deployment.azure.csdef.ProgramEntryPointElement;
import eu.artist.migration.deployment.azure.csdef.WorkerEntryPointElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Worker Entry Point Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WorkerEntryPointElementImpl#getProgramEntryPoint <em>Program Entry Point</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.WorkerEntryPointElementImpl#getNetFxEntryPoint <em>Net Fx Entry Point</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkerEntryPointElementImpl extends MinimalEObjectImpl.Container implements WorkerEntryPointElement {
	/**
	 * The cached value of the '{@link #getProgramEntryPoint() <em>Program Entry Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramEntryPoint()
	 * @generated
	 * @ordered
	 */
	protected ProgramEntryPointElement programEntryPoint;

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
	protected WorkerEntryPointElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.WORKER_ENTRY_POINT_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramEntryPointElement getProgramEntryPoint() {
		return programEntryPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramEntryPoint(ProgramEntryPointElement newProgramEntryPoint, NotificationChain msgs) {
		ProgramEntryPointElement oldProgramEntryPoint = programEntryPoint;
		programEntryPoint = newProgramEntryPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__PROGRAM_ENTRY_POINT, oldProgramEntryPoint, newProgramEntryPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramEntryPoint(ProgramEntryPointElement newProgramEntryPoint) {
		if (newProgramEntryPoint != programEntryPoint) {
			NotificationChain msgs = null;
			if (programEntryPoint != null)
				msgs = ((InternalEObject)programEntryPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__PROGRAM_ENTRY_POINT, null, msgs);
			if (newProgramEntryPoint != null)
				msgs = ((InternalEObject)newProgramEntryPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__PROGRAM_ENTRY_POINT, null, msgs);
			msgs = basicSetProgramEntryPoint(newProgramEntryPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__PROGRAM_ENTRY_POINT, newProgramEntryPoint, newProgramEntryPoint));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT, oldNetFxEntryPoint, newNetFxEntryPoint);
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
				msgs = ((InternalEObject)netFxEntryPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT, null, msgs);
			if (newNetFxEntryPoint != null)
				msgs = ((InternalEObject)newNetFxEntryPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT, null, msgs);
			msgs = basicSetNetFxEntryPoint(newNetFxEntryPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT, newNetFxEntryPoint, newNetFxEntryPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__PROGRAM_ENTRY_POINT:
				return basicSetProgramEntryPoint(null, msgs);
			case AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT:
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
			case AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__PROGRAM_ENTRY_POINT:
				return getProgramEntryPoint();
			case AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT:
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
			case AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__PROGRAM_ENTRY_POINT:
				setProgramEntryPoint((ProgramEntryPointElement)newValue);
				return;
			case AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT:
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
			case AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__PROGRAM_ENTRY_POINT:
				setProgramEntryPoint((ProgramEntryPointElement)null);
				return;
			case AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT:
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
			case AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__PROGRAM_ENTRY_POINT:
				return programEntryPoint != null;
			case AzureCSDefPackage.WORKER_ENTRY_POINT_ELEMENT__NET_FX_ENTRY_POINT:
				return netFxEntryPoint != null;
		}
		return super.eIsSet(featureID);
	}

} //WorkerEntryPointElementImpl
