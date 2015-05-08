/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AllocatePublicPortFromElement;
import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.PortRange;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocate Public Port From Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.AllocatePublicPortFromElementImpl#getFixedPortRange <em>Fixed Port Range</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AllocatePublicPortFromElementImpl extends MinimalEObjectImpl.Container implements AllocatePublicPortFromElement {
	/**
	 * The cached value of the '{@link #getFixedPortRange() <em>Fixed Port Range</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedPortRange()
	 * @generated
	 * @ordered
	 */
	protected PortRange fixedPortRange;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocatePublicPortFromElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.ALLOCATE_PUBLIC_PORT_FROM_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortRange getFixedPortRange() {
		return fixedPortRange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedPortRange(PortRange newFixedPortRange, NotificationChain msgs) {
		PortRange oldFixedPortRange = fixedPortRange;
		fixedPortRange = newFixedPortRange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ALLOCATE_PUBLIC_PORT_FROM_ELEMENT__FIXED_PORT_RANGE, oldFixedPortRange, newFixedPortRange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedPortRange(PortRange newFixedPortRange) {
		if (newFixedPortRange != fixedPortRange) {
			NotificationChain msgs = null;
			if (fixedPortRange != null)
				msgs = ((InternalEObject)fixedPortRange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ALLOCATE_PUBLIC_PORT_FROM_ELEMENT__FIXED_PORT_RANGE, null, msgs);
			if (newFixedPortRange != null)
				msgs = ((InternalEObject)newFixedPortRange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ALLOCATE_PUBLIC_PORT_FROM_ELEMENT__FIXED_PORT_RANGE, null, msgs);
			msgs = basicSetFixedPortRange(newFixedPortRange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ALLOCATE_PUBLIC_PORT_FROM_ELEMENT__FIXED_PORT_RANGE, newFixedPortRange, newFixedPortRange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSDefPackage.ALLOCATE_PUBLIC_PORT_FROM_ELEMENT__FIXED_PORT_RANGE:
				return basicSetFixedPortRange(null, msgs);
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
			case AzureCSDefPackage.ALLOCATE_PUBLIC_PORT_FROM_ELEMENT__FIXED_PORT_RANGE:
				return getFixedPortRange();
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
			case AzureCSDefPackage.ALLOCATE_PUBLIC_PORT_FROM_ELEMENT__FIXED_PORT_RANGE:
				setFixedPortRange((PortRange)newValue);
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
			case AzureCSDefPackage.ALLOCATE_PUBLIC_PORT_FROM_ELEMENT__FIXED_PORT_RANGE:
				setFixedPortRange((PortRange)null);
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
			case AzureCSDefPackage.ALLOCATE_PUBLIC_PORT_FROM_ELEMENT__FIXED_PORT_RANGE:
				return fixedPortRange != null;
		}
		return super.eIsSet(featureID);
	}

} //AllocatePublicPortFromElementImpl
