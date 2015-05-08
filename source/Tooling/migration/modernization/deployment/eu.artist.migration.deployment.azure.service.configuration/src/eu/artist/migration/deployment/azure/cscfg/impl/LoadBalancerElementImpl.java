/**
 */
package eu.artist.migration.deployment.azure.cscfg.impl;

import eu.artist.migration.deployment.azure.cscfg.AzureCSCfgPackage;
import eu.artist.migration.deployment.azure.cscfg.FrontendIPConfigurationElement;
import eu.artist.migration.deployment.azure.cscfg.LoadBalancerElement;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Load Balancer Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.LoadBalancerElementImpl#getFrontendIPConfiguration <em>Frontend IP Configuration</em>}</li>
 *   <li>{@link eu.artist.migration.deployment.azure.cscfg.impl.LoadBalancerElementImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LoadBalancerElementImpl extends MinimalEObjectImpl.Container implements LoadBalancerElement {
	/**
	 * The cached value of the '{@link #getFrontendIPConfiguration() <em>Frontend IP Configuration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrontendIPConfiguration()
	 * @generated
	 * @ordered
	 */
	protected FrontendIPConfigurationElement frontendIPConfiguration;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoadBalancerElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AzureCSCfgPackage.Literals.LOAD_BALANCER_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrontendIPConfigurationElement getFrontendIPConfiguration() {
		return frontendIPConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrontendIPConfiguration(FrontendIPConfigurationElement newFrontendIPConfiguration, NotificationChain msgs) {
		FrontendIPConfigurationElement oldFrontendIPConfiguration = frontendIPConfiguration;
		frontendIPConfiguration = newFrontendIPConfiguration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.LOAD_BALANCER_ELEMENT__FRONTEND_IP_CONFIGURATION, oldFrontendIPConfiguration, newFrontendIPConfiguration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrontendIPConfiguration(FrontendIPConfigurationElement newFrontendIPConfiguration) {
		if (newFrontendIPConfiguration != frontendIPConfiguration) {
			NotificationChain msgs = null;
			if (frontendIPConfiguration != null)
				msgs = ((InternalEObject)frontendIPConfiguration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.LOAD_BALANCER_ELEMENT__FRONTEND_IP_CONFIGURATION, null, msgs);
			if (newFrontendIPConfiguration != null)
				msgs = ((InternalEObject)newFrontendIPConfiguration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AzureCSCfgPackage.LOAD_BALANCER_ELEMENT__FRONTEND_IP_CONFIGURATION, null, msgs);
			msgs = basicSetFrontendIPConfiguration(newFrontendIPConfiguration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.LOAD_BALANCER_ELEMENT__FRONTEND_IP_CONFIGURATION, newFrontendIPConfiguration, newFrontendIPConfiguration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AzureCSCfgPackage.LOAD_BALANCER_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AzureCSCfgPackage.LOAD_BALANCER_ELEMENT__FRONTEND_IP_CONFIGURATION:
				return basicSetFrontendIPConfiguration(null, msgs);
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
			case AzureCSCfgPackage.LOAD_BALANCER_ELEMENT__FRONTEND_IP_CONFIGURATION:
				return getFrontendIPConfiguration();
			case AzureCSCfgPackage.LOAD_BALANCER_ELEMENT__NAME:
				return getName();
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
			case AzureCSCfgPackage.LOAD_BALANCER_ELEMENT__FRONTEND_IP_CONFIGURATION:
				setFrontendIPConfiguration((FrontendIPConfigurationElement)newValue);
				return;
			case AzureCSCfgPackage.LOAD_BALANCER_ELEMENT__NAME:
				setName((String)newValue);
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
			case AzureCSCfgPackage.LOAD_BALANCER_ELEMENT__FRONTEND_IP_CONFIGURATION:
				setFrontendIPConfiguration((FrontendIPConfigurationElement)null);
				return;
			case AzureCSCfgPackage.LOAD_BALANCER_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
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
			case AzureCSCfgPackage.LOAD_BALANCER_ELEMENT__FRONTEND_IP_CONFIGURATION:
				return frontendIPConfiguration != null;
			case AzureCSCfgPackage.LOAD_BALANCER_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //LoadBalancerElementImpl
