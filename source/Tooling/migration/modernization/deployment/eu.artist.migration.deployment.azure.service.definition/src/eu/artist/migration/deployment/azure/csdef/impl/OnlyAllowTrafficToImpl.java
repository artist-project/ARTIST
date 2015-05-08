/**
 */
package eu.artist.migration.deployment.azure.csdef.impl;

import eu.artist.migration.deployment.azure.csdef.AllowAllTraffic;
import eu.artist.migration.deployment.azure.csdef.AzureCSDefPackage;
import eu.artist.migration.deployment.azure.csdef.Destinations;
import eu.artist.migration.deployment.azure.csdef.OnlyAllowTrafficTo;
import eu.artist.migration.deployment.azure.csdef.WhenSource;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Only Allow Traffic To</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.OnlyAllowTrafficToImpl#getDestinations <em>Destinations</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.OnlyAllowTrafficToImpl#getAllowAllTraffic <em>Allow All Traffic</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.csdef.impl.OnlyAllowTrafficToImpl#getWhenSource <em>When Source</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OnlyAllowTrafficToImpl extends MinimalEObjectImpl.Container implements OnlyAllowTrafficTo {
	/**
	 * The cached value of the '{@link #getDestinations() <em>Destinations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestinations()
	 * @generated
	 * @ordered
	 */
	protected Destinations destinations;

	/**
	 * The cached value of the '{@link #getAllowAllTraffic() <em>Allow All Traffic</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllowAllTraffic()
	 * @generated
	 * @ordered
	 */
	protected AllowAllTraffic allowAllTraffic;

	/**
	 * The cached value of the '{@link #getWhenSource() <em>When Source</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWhenSource()
	 * @generated
	 * @ordered
	 */
	protected WhenSource whenSource;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OnlyAllowTrafficToImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSDefPackage.Literals.ONLY_ALLOW_TRAFFIC_TO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Destinations getDestinations() {
		return destinations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestinations(Destinations newDestinations, NotificationChain msgs) {
		Destinations oldDestinations = destinations;
		destinations = newDestinations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__DESTINATIONS, oldDestinations, newDestinations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestinations(Destinations newDestinations) {
		if (newDestinations != destinations) {
			NotificationChain msgs = null;
			if (destinations != null)
				msgs = ((InternalEObject)destinations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__DESTINATIONS, null, msgs);
			if (newDestinations != null)
				msgs = ((InternalEObject)newDestinations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__DESTINATIONS, null, msgs);
			msgs = basicSetDestinations(newDestinations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__DESTINATIONS, newDestinations, newDestinations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AllowAllTraffic getAllowAllTraffic() {
		return allowAllTraffic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAllowAllTraffic(AllowAllTraffic newAllowAllTraffic, NotificationChain msgs) {
		AllowAllTraffic oldAllowAllTraffic = allowAllTraffic;
		allowAllTraffic = newAllowAllTraffic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__ALLOW_ALL_TRAFFIC, oldAllowAllTraffic, newAllowAllTraffic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAllowAllTraffic(AllowAllTraffic newAllowAllTraffic) {
		if (newAllowAllTraffic != allowAllTraffic) {
			NotificationChain msgs = null;
			if (allowAllTraffic != null)
				msgs = ((InternalEObject)allowAllTraffic).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__ALLOW_ALL_TRAFFIC, null, msgs);
			if (newAllowAllTraffic != null)
				msgs = ((InternalEObject)newAllowAllTraffic).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__ALLOW_ALL_TRAFFIC, null, msgs);
			msgs = basicSetAllowAllTraffic(newAllowAllTraffic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__ALLOW_ALL_TRAFFIC, newAllowAllTraffic, newAllowAllTraffic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WhenSource getWhenSource() {
		return whenSource;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWhenSource(WhenSource newWhenSource, NotificationChain msgs) {
		WhenSource oldWhenSource = whenSource;
		whenSource = newWhenSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__WHEN_SOURCE, oldWhenSource, newWhenSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWhenSource(WhenSource newWhenSource) {
		if (newWhenSource != whenSource) {
			NotificationChain msgs = null;
			if (whenSource != null)
				msgs = ((InternalEObject)whenSource).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__WHEN_SOURCE, null, msgs);
			if (newWhenSource != null)
				msgs = ((InternalEObject)newWhenSource).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__WHEN_SOURCE, null, msgs);
			msgs = basicSetWhenSource(newWhenSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__WHEN_SOURCE, newWhenSource, newWhenSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__DESTINATIONS:
				return basicSetDestinations(null, msgs);
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__ALLOW_ALL_TRAFFIC:
				return basicSetAllowAllTraffic(null, msgs);
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__WHEN_SOURCE:
				return basicSetWhenSource(null, msgs);
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
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__DESTINATIONS:
				return getDestinations();
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__ALLOW_ALL_TRAFFIC:
				return getAllowAllTraffic();
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__WHEN_SOURCE:
				return getWhenSource();
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
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__DESTINATIONS:
				setDestinations((Destinations)newValue);
				return;
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__ALLOW_ALL_TRAFFIC:
				setAllowAllTraffic((AllowAllTraffic)newValue);
				return;
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__WHEN_SOURCE:
				setWhenSource((WhenSource)newValue);
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
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__DESTINATIONS:
				setDestinations((Destinations)null);
				return;
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__ALLOW_ALL_TRAFFIC:
				setAllowAllTraffic((AllowAllTraffic)null);
				return;
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__WHEN_SOURCE:
				setWhenSource((WhenSource)null);
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
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__DESTINATIONS:
				return destinations != null;
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__ALLOW_ALL_TRAFFIC:
				return allowAllTraffic != null;
			case AzureCSDefPackage.ONLY_ALLOW_TRAFFIC_TO__WHEN_SOURCE:
				return whenSource != null;
		}
		return super.eIsSet(featureID);
	}

} //OnlyAllowTrafficToImpl
